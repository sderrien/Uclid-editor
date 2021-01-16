package uclid.xtext.ui.commands

import java.io.BufferedReader
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.FileDescriptor
import java.io.FileOutputStream
import java.io.IOException
import java.io.InputStream
import java.io.PrintStream
import java.nio.charset.StandardCharsets
import java.time.chrono.ThaiBuddhistDate
import java.util.concurrent.Executors
import java.util.function.Consumer
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.commands.IHandler
import org.eclipse.core.commands.IHandlerListener
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRunnable
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.preference.IPreferenceStore
import org.eclipse.jface.text.TextSelection
import org.eclipse.jface.viewers.ISelection
import org.eclipse.jface.viewers.StructuredSelection
import org.eclipse.ui.IEditorInput
import org.eclipse.ui.IEditorPart
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.IWorkbenchPage
import org.eclipse.ui.IWorkbenchWindow
import org.eclipse.ui.PartInitException
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.console.ConsolePlugin
import org.eclipse.ui.console.IConsole
import org.eclipse.ui.console.IConsoleConstants
import org.eclipse.ui.console.IConsoleManager
import org.eclipse.ui.console.IConsoleView
import org.eclipse.ui.console.MessageConsole
import org.eclipse.ui.console.MessageConsoleStream
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.ui.part.FileEditorInput
import uclid.xtext.ui.internal.XtextActivator
import uclid.xtext.ui.preferences.PreferenceConstants

class UclidRunCommandHandler extends AbstractHandler {
	package MessageConsole console
	static final package String UCLID_CONSOLE = "UCLID_CONSOLE"

	def private MessageConsole getConsole() {
		if (console === null) {
			var ConsolePlugin plugin = ConsolePlugin::getDefault()
			var IConsoleManager conMan = plugin.getConsoleManager()
			var IConsole[] existing = conMan.getConsoles()
			for (var int i = 0; i < existing.length; i++)
				if(UCLID_CONSOLE.equals({
					val _rdIndx_existing = i
					existing.get(_rdIndx_existing)
				}.getName())) return ({
					val _rdIndx_existing = i
					existing.get(_rdIndx_existing)
				} as MessageConsole)
			// no console found, so create a new one
			console = new MessageConsole(UCLID_CONSOLE, null)
			conMan.addConsoles((#[console] as IConsole[]))
		}
		return console
	}

	def private void clearConsole() {
		getConsole().clearConsole()
		var MessageConsoleStream out = getConsole().newMessageStream()
		out.println("Uclid console ")
		out.println("------------------------------")
	}

	def private void writeConsole(String message) {
		try {
			var MessageConsoleStream out = getConsole().newMessageStream()
			out.println(message)
			out.flush()
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace()
		}

	}

	private static class StreamGobbler implements Runnable {
		InputStream inputStream
		Consumer<String> consumer

		new(InputStream inputStream, Consumer<String> consumer) {
			this.inputStream = inputStream
			this.consumer = consumer
		}

		override void run() {
			new BufferedReader(new java.io.InputStreamReader(inputStream)).lines().forEach(consumer)
		} // TODO Auto-generated catch block
		// TODO Auto-generated catch block
	}

	def void runUclid(String file) throws IOException, InterruptedException {
		var ByteArrayOutputStream baos = new ByteArrayOutputStream()
		System::setOut(new PrintStream(baos))
		try {
			var boolean isWindows = System::getProperty("os.name").toLowerCase().startsWith("windows")
			clearConsole()
			var IPreferenceStore store = XtextActivator::getInstance().getPreferenceStore()
			var String path = store.getDefaultString(PreferenceConstants::UCLID_BIN_PATH)
			var String main = store.getDefaultString(PreferenceConstants::DEFAULT_MODULE_NAME)
			var ProcessBuilder builder = new ProcessBuilder()
			if (isWindows) {
				builder.command("cmd.exe", "/c", "dir")
			} else {
				var String command = '''«path»«File::separator»uclid'''.toString
				System::out.println(#[command,file])
				System::out.println("------------------------------")
				builder.directory(new File(path))
				builder.command(command, file)
			}
			//builder.directory(new File(System::getProperty("user.home")))
			var Process process = builder.start()
			var StreamGobbler streamGobbler = new StreamGobbler(process.getInputStream(), [System.out.println(it)])
			Executors::newSingleThreadExecutor().submit(streamGobbler)
			var StreamGobbler streamGobbler2 = new StreamGobbler(process.getErrorStream(), [System.err.println(it)])
			Executors::newSingleThreadExecutor().submit(streamGobbler2)
			var int exitCode = process.waitFor()
			System::out.println("------------------------------")
			System::out.println('''Finished exit code=«exitCode»'''.toString)
		} catch (Exception e) {
			System::out.println(e.getMessage())
		}

		bringToFront()
		var String res = baos.toString(StandardCharsets::UTF_8)
		writeConsole(res)
		System::setOut(new PrintStream(new FileOutputStream(FileDescriptor::out)))
	}

	def void bringToFront() {
		try {
			var IWorkbenchPage page = PlatformUI::getWorkbench().getActiveWorkbenchWindow().getActivePage()
			var String id = IConsoleConstants::ID_CONSOLE_VIEW
			var IConsoleView view = (page.showView(id) as IConsoleView)
			view.display(getConsole())
		} catch (PartInitException e) {
			e.printStackTrace()
		}

	}

	override Object execute(ExecutionEvent event) throws ExecutionException {
		println("Activated command !")
		HandlerUtil::getActiveEditor(event).editorInput
		var IWorkbench wb = PlatformUI::getWorkbench()
		var IWorkbenchWindow window = wb.getActiveWorkbenchWindow()
		var IWorkbenchPage page = window.getActivePage()
		var IEditorPart editor = page.getActiveEditor()
		var IEditorInput input = editor.getEditorInput()
		var IPath path = ((input as FileEditorInput)).getPath()
		if (path.fileExtension.equals("ucl") || path.fileExtension.equals("uclid")) {
			try {
				runUclid(path.toOSString())
			} catch(Exception e) {
				System::err.println("ERROR while processing selection.")
				e.printStackTrace()
			}
		}
//		try {
//			var ISelection selection = HandlerUtil::getCurrentSelection(event)
//			if (selection instanceof TextSelection) {
//				var IWorkbench wb = PlatformUI::getWorkbench()
//				var IWorkbenchWindow window = wb.getActiveWorkbenchWindow()
//				var IWorkbenchPage page = window.getActivePage()
//				var IEditorPart editor = page.getActiveEditor()
//				var IEditorInput input = editor.getEditorInput()
//				var ByteArrayOutputStream baos = new ByteArrayOutputStream()
//				var IPath path = ((input as FileEditorInput)).getPath()
//				runUclid(path.toOSString())
//			}
//			if (selection instanceof StructuredSelection) {
//				var StructuredSelection structuredSelection = (selection as StructuredSelection)
//				for (Object o : structuredSelection.toArray()) {
//					val IFile file = ((o) as IFile)
//					val IProject p = file.getProject()
//					try {
//						p.getWorkspace().run(([ IProgressMonitor monitor |
//							var IPath location = file.getLocation()
//							try {
//								runUclid(location.toOSString())
//							} catch (IOException e) {
//								e.printStackTrace()
//							} catch (InterruptedException e) {
//								e.printStackTrace()
//							}
//						] as IWorkspaceRunnable), new NullProgressMonitor())
//					} catch (CoreException e) {
//					}
//
//				}
//			}
//		} catch (Exception e) {
//			System::err.println("ERROR while processing selection.")
//			e.printStackTrace()
//		}

		return null
	}
}
