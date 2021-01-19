package uclid.xtext

import uclid.xtext.parser.antlr.internal.InternalUclidLexer
import org.antlr.runtime.RecognitionException
import org.antlr.runtime.CharStream
import org.antlr.runtime.RecognizerSharedState

class UclidCustomLexer extends InternalUclidLexer {
	
	
	new () {} 
    new(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    new(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
	
	override void mTokens() throws RecognitionException {
		val str = 
			 new Character(input.LA(1) as char).toString()+
			 new Character(input.LA(2) as char).toString()+
			 new Character(input.LA(3) as char).toString()+
			 new Character(input.LA(4) as char).toString()
        if (str=="<==>") {
        	 mRULE_LOGEQU;
        } else if (str=="==>") {
        	 mRULE_LOGIMPLY;
        } else {
			super.mTokens
        }            			 
		
 	}
	
}