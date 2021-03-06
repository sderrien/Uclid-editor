/*
 * generated by Xtext 2.22.0
 */
package uclid.xtext

import uclid.xtext.parser.antlr.internal.InternalUclidLexer
import org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider
import com.google.inject.Provider
import org.eclipse.xtext.parser.antlr.Lexer
import com.google.inject.Binder
import org.eclipse.xtext.parser.antlr.LexerBindings
import org.eclipse.xtext.parser.antlr.ITokenDefProvider
import org.eclipse.xtext.parser.antlr.LexerProvider
import com.google.inject.name.Names

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class UclidRuntimeModule extends AbstractUclidRuntimeModule {
	
		// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	override Class<? extends Lexer> bindLexer() {
		return UclidCustomLexer;
	}
	
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	override Provider<? extends InternalUclidLexer> provideInternalUclidLexer() {
		return LexerProvider.create(UclidCustomLexer);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	override void configureRuntimeLexer(Binder binder) {
		binder.bind(Lexer)
			.annotatedWith(Names.named(LexerBindings.RUNTIME))
			.to(UclidCustomLexer);
	}
	
	
}
