package uclid.xtext.ui.commands;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import uclid.xtext.ui.internal.XtextActivator;
import uclid.xtext.ui.preferences.PreferenceConstants;

@SuppressWarnings("all")
public class UclidRunCommandHandler extends AbstractHandler {
  private static class StreamGobbler implements Runnable {
    private InputStream inputStream;
    
    private Consumer<String> consumer;
    
    public StreamGobbler(final InputStream inputStream, final Consumer<String> consumer) {
      this.inputStream = inputStream;
      this.consumer = consumer;
    }
    
    @Override
    public void run() {
      InputStreamReader _inputStreamReader = new InputStreamReader(this.inputStream);
      new BufferedReader(_inputStreamReader).lines().forEach(this.consumer);
    }
  }
  
  MessageConsole console;
  
  static final String UCLID_CONSOLE = "UCLID_CONSOLE";
  
  private MessageConsole getConsole() {
    if ((this.console == null)) {
      ConsolePlugin plugin = ConsolePlugin.getDefault();
      IConsoleManager conMan = plugin.getConsoleManager();
      IConsole[] existing = conMan.getConsoles();
      for (int i = 0; (i < existing.length); i++) {
        IConsole _xblockexpression = null;
        {
          final int _rdIndx_existing = i;
          _xblockexpression = existing[_rdIndx_existing];
        }
        boolean _equals = UclidRunCommandHandler.UCLID_CONSOLE.equals(
          _xblockexpression.getName());
        if (_equals) {
          IConsole _xblockexpression_1 = null;
          {
            final int _rdIndx_existing = i;
            _xblockexpression_1 = existing[_rdIndx_existing];
          }
          return ((MessageConsole) _xblockexpression_1);
        }
      }
      MessageConsole _messageConsole = new MessageConsole(UclidRunCommandHandler.UCLID_CONSOLE, null);
      this.console = _messageConsole;
      conMan.addConsoles(((IConsole[]) ((IConsole[])Conversions.unwrapArray(Collections.<MessageConsole>unmodifiableList(CollectionLiterals.<MessageConsole>newArrayList(this.console)), IConsole.class))));
    }
    return this.console;
  }
  
  private void clearConsole() {
    this.getConsole().clearConsole();
    MessageConsoleStream out = this.getConsole().newMessageStream();
    out.println("Uclid console ");
    out.println("------------------------------");
  }
  
  private void writeConsole(final String message) {
    try {
      MessageConsoleStream out = this.getConsole().newMessageStream();
      out.println(message);
      out.flush();
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public void runUclid(final String file) throws IOException, InterruptedException {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream _printStream = new PrintStream(baos);
    System.setOut(_printStream);
    try {
      boolean isWindows = System.getProperty("os.name").toLowerCase().startsWith("windows");
      this.clearConsole();
      IPreferenceStore store = XtextActivator.getInstance().getPreferenceStore();
      String path = store.getDefaultString(PreferenceConstants.UCLID_BIN_PATH);
      String main = store.getDefaultString(PreferenceConstants.DEFAULT_MODULE_NAME);
      ProcessBuilder builder = new ProcessBuilder();
      if (isWindows) {
        builder.command("cmd.exe", "/c", "dir");
      } else {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(path);
        _builder.append(File.separator);
        _builder.append("uclid");
        String command = _builder.toString();
        System.out.println(Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(command, file)));
        System.out.println("------------------------------");
        File _file = new File(path);
        builder.directory(_file);
        builder.command(command, file);
      }
      Process process = builder.start();
      InputStream _inputStream = process.getInputStream();
      final Consumer<String> _function = (String it) -> {
        System.out.println(it);
      };
      UclidRunCommandHandler.StreamGobbler streamGobbler = new UclidRunCommandHandler.StreamGobbler(_inputStream, _function);
      Executors.newSingleThreadExecutor().submit(streamGobbler);
      InputStream _errorStream = process.getErrorStream();
      final Consumer<String> _function_1 = (String it) -> {
        System.err.println(it);
      };
      UclidRunCommandHandler.StreamGobbler streamGobbler2 = new UclidRunCommandHandler.StreamGobbler(_errorStream, _function_1);
      Executors.newSingleThreadExecutor().submit(streamGobbler2);
      int exitCode = process.waitFor();
      System.out.println("------------------------------");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Finished exit code=");
      _builder_1.append(exitCode);
      System.out.println(_builder_1.toString());
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        System.out.println(e.getMessage());
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    this.bringToFront();
    String res = baos.toString(StandardCharsets.UTF_8);
    this.writeConsole(res);
    FileOutputStream _fileOutputStream = new FileOutputStream(FileDescriptor.out);
    PrintStream _printStream_1 = new PrintStream(_fileOutputStream);
    System.setOut(_printStream_1);
  }
  
  public void bringToFront() {
    try {
      IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
      String id = IConsoleConstants.ID_CONSOLE_VIEW;
      IViewPart _showView = page.showView(id);
      IConsoleView view = ((IConsoleView) _showView);
      view.display(this.getConsole());
    } catch (final Throwable _t) {
      if (_t instanceof PartInitException) {
        final PartInitException e = (PartInitException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Override
  public Object execute(final ExecutionEvent event) throws ExecutionException {
    InputOutput.<String>println("Activated command !");
    HandlerUtil.getActiveEditor(event).getEditorInput();
    IWorkbench wb = PlatformUI.getWorkbench();
    IWorkbenchWindow window = wb.getActiveWorkbenchWindow();
    IWorkbenchPage page = window.getActivePage();
    IEditorPart editor = page.getActiveEditor();
    IEditorInput input = editor.getEditorInput();
    IPath path = ((FileEditorInput) input).getPath();
    if ((path.getFileExtension().equals("ucl") || path.getFileExtension().equals("uclid"))) {
      try {
        this.runUclid(path.toOSString());
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          System.err.println("ERROR while processing selection.");
          e.printStackTrace();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    return null;
  }
}
