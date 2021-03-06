/**
 * generated by Xtext 2.22.0
 */
package uclid.xtext;

import com.google.inject.Binder;
import com.google.inject.Provider;
import com.google.inject.name.Names;
import org.eclipse.xtext.parser.antlr.Lexer;
import org.eclipse.xtext.parser.antlr.LexerBindings;
import org.eclipse.xtext.parser.antlr.LexerProvider;
import uclid.xtext.AbstractUclidRuntimeModule;
import uclid.xtext.UclidCustomLexer;
import uclid.xtext.parser.antlr.internal.InternalUclidLexer;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
@SuppressWarnings("all")
public class UclidRuntimeModule extends AbstractUclidRuntimeModule {
  @Override
  public Class<? extends Lexer> bindLexer() {
    return UclidCustomLexer.class;
  }
  
  @Override
  public Provider<? extends InternalUclidLexer> provideInternalUclidLexer() {
    return LexerProvider.<UclidCustomLexer>create(UclidCustomLexer.class);
  }
  
  @Override
  public void configureRuntimeLexer(final Binder binder) {
    binder.<Lexer>bind(Lexer.class).annotatedWith(Names.named(LexerBindings.RUNTIME)).to(UclidCustomLexer.class);
  }
}
