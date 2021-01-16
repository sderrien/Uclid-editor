/*
 * generated by Xtext 2.22.0
 */
package uclid.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uclid.xtext.parser.antlr.internal.InternalUclidParser;
import uclid.xtext.services.UclidGrammarAccess;

public class UclidParser extends AbstractAntlrParser {

	@Inject
	private UclidGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUclidParser createParser(XtextTokenStream stream) {
		return new InternalUclidParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ModelRule";
	}

	public UclidGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UclidGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
