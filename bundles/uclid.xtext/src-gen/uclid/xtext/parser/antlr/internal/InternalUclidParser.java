package uclid.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uclid.xtext.services.UclidGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalUclidParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_LOGEQU", "RULE_LOGIMPLY", "RULE_REL_OP_RULE", "RULE_BV", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'module'", "'{'", "'}'", "'type'", "'*'", "'='", "';'", "'input'", "','", "':'", "'output'", "'var'", "'const'", "'sharedvar'", "'define'", "'('", "')'", "'synthesis'", "'function'", "'procedure'", "'returns'", "'requires'", "'ensures'", "'modifies'", "'instance'", "'axiom'", "'assume'", "'property'", "'['", "'LTL'", "'CTL'", "']'", "'invariant'", "'init'", "'next'", "'skip'", "'assert'", "'havoc'", "'call'", "'if'", "'else'", "'case'", "'esac'", "'default'", "'for'", "'in'", "'range'", "'while'", "'forall'", "'exists'", "'::'", "'&&'", "'||'", "'&'", "'|'", "'^'", "'++'", "'+'", "'-'", "'!'", "'~'", "'->'", "'\\''", "'then'", "'false'", "'true'", "'boolean'", "'integer'", "'enum'", "'record'", "'control'", "'bmc'", "'check'", "'clear_context'", "'induction'", "'print'", "'print_cex'", "'print_module'", "'print_results'", "'print_smt2'", "'synthesize_invariant'", "'unroll'", "'verify'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=5;
    public static final int T__66=66;
    public static final int RULE_LOGIMPLY=7;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_LOGEQU=6;
    public static final int RULE_BV=9;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_REL_OP_RULE=8;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalUclidParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUclidParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUclidParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUclid.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

     	private UclidGrammarAccess grammarAccess;

        public InternalUclidParser(TokenStream input, UclidGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ModelRule";
       	}

       	@Override
       	protected UclidGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModelRule"
    // InternalUclid.g:70:1: entryRuleModelRule returns [EObject current=null] : iv_ruleModelRule= ruleModelRule EOF ;
    public final EObject entryRuleModelRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelRule = null;


        try {
            // InternalUclid.g:70:50: (iv_ruleModelRule= ruleModelRule EOF )
            // InternalUclid.g:71:2: iv_ruleModelRule= ruleModelRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModelRule=ruleModelRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModelRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelRule"


    // $ANTLR start "ruleModelRule"
    // InternalUclid.g:77:1: ruleModelRule returns [EObject current=null] : ( () ( (lv_rules_1_0= ruleModuleRule ) )* ) ;
    public final EObject ruleModelRule() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:83:2: ( ( () ( (lv_rules_1_0= ruleModuleRule ) )* ) )
            // InternalUclid.g:84:2: ( () ( (lv_rules_1_0= ruleModuleRule ) )* )
            {
            // InternalUclid.g:84:2: ( () ( (lv_rules_1_0= ruleModuleRule ) )* )
            // InternalUclid.g:85:3: () ( (lv_rules_1_0= ruleModuleRule ) )*
            {
            // InternalUclid.g:85:3: ()
            // InternalUclid.g:86:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getModelRuleAccess().getTopLevelAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:95:3: ( (lv_rules_1_0= ruleModuleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUclid.g:96:4: (lv_rules_1_0= ruleModuleRule )
            	    {
            	    // InternalUclid.g:96:4: (lv_rules_1_0= ruleModuleRule )
            	    // InternalUclid.g:97:5: lv_rules_1_0= ruleModuleRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModelRuleAccess().getRulesModuleRuleParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_rules_1_0=ruleModuleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModelRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"rules",
            	      						lv_rules_1_0,
            	      						"uclid.xtext.Uclid.ModuleRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelRule"


    // $ANTLR start "entryRuleFQN"
    // InternalUclid.g:118:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalUclid.g:118:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalUclid.g:119:2: iv_ruleFQN= ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFQN.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalUclid.g:125:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalUclid.g:131:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalUclid.g:132:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalUclid.g:132:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalUclid.g:133:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalUclid.g:140:3: (kw= '.' this_ID_2= RULE_ID )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUclid.g:141:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleModuleRule"
    // InternalUclid.g:158:1: entryRuleModuleRule returns [EObject current=null] : iv_ruleModuleRule= ruleModuleRule EOF ;
    public final EObject entryRuleModuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleRule = null;


        try {
            // InternalUclid.g:158:51: (iv_ruleModuleRule= ruleModuleRule EOF )
            // InternalUclid.g:159:2: iv_ruleModuleRule= ruleModuleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModuleRule=ruleModuleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleRule"


    // $ANTLR start "ruleModuleRule"
    // InternalUclid.g:165:1: ruleModuleRule returns [EObject current=null] : ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_d_4_0= ruleDeclRule ) )* ( (lv_e_5_0= ruleControlBlockRule ) )? otherlv_6= '}' ) ;
    public final EObject ruleModuleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_d_4_0 = null;

        EObject lv_e_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:171:2: ( ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_d_4_0= ruleDeclRule ) )* ( (lv_e_5_0= ruleControlBlockRule ) )? otherlv_6= '}' ) )
            // InternalUclid.g:172:2: ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_d_4_0= ruleDeclRule ) )* ( (lv_e_5_0= ruleControlBlockRule ) )? otherlv_6= '}' )
            {
            // InternalUclid.g:172:2: ( () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_d_4_0= ruleDeclRule ) )* ( (lv_e_5_0= ruleControlBlockRule ) )? otherlv_6= '}' )
            // InternalUclid.g:173:3: () otherlv_1= 'module' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_d_4_0= ruleDeclRule ) )* ( (lv_e_5_0= ruleControlBlockRule ) )? otherlv_6= '}'
            {
            // InternalUclid.g:173:3: ()
            // InternalUclid.g:174:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getModuleRuleAccess().getModuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModuleRuleAccess().getModuleKeyword_1());
              		
            }
            // InternalUclid.g:187:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUclid.g:188:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUclid.g:188:4: (lv_name_2_0= RULE_ID )
            // InternalUclid.g:189:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getModuleRuleAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getModuleRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getModuleRuleAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalUclid.g:209:3: ( (lv_d_4_0= ruleDeclRule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19||LA3_0==23||(LA3_0>=26 && LA3_0<=30)||(LA3_0>=33 && LA3_0<=35)||(LA3_0>=40 && LA3_0<=43)||(LA3_0>=48 && LA3_0<=50)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUclid.g:210:4: (lv_d_4_0= ruleDeclRule )
            	    {
            	    // InternalUclid.g:210:4: (lv_d_4_0= ruleDeclRule )
            	    // InternalUclid.g:211:5: lv_d_4_0= ruleDeclRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getModuleRuleAccess().getDDeclRuleParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_7);
            	    lv_d_4_0=ruleDeclRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getModuleRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"d",
            	      						lv_d_4_0,
            	      						"uclid.xtext.Uclid.DeclRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalUclid.g:228:3: ( (lv_e_5_0= ruleControlBlockRule ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==86) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUclid.g:229:4: (lv_e_5_0= ruleControlBlockRule )
                    {
                    // InternalUclid.g:229:4: (lv_e_5_0= ruleControlBlockRule )
                    // InternalUclid.g:230:5: lv_e_5_0= ruleControlBlockRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getModuleRuleAccess().getEControlBlockRuleParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_e_5_0=ruleControlBlockRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getModuleRuleRule());
                      					}
                      					set(
                      						current,
                      						"e",
                      						lv_e_5_0,
                      						"uclid.xtext.Uclid.ControlBlockRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getModuleRuleAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleRule"


    // $ANTLR start "entryRuleDeclRule"
    // InternalUclid.g:255:1: entryRuleDeclRule returns [EObject current=null] : iv_ruleDeclRule= ruleDeclRule EOF ;
    public final EObject entryRuleDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclRule = null;


        try {
            // InternalUclid.g:255:49: (iv_ruleDeclRule= ruleDeclRule EOF )
            // InternalUclid.g:256:2: iv_ruleDeclRule= ruleDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclRule=ruleDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclRule"


    // $ANTLR start "ruleDeclRule"
    // InternalUclid.g:262:1: ruleDeclRule returns [EObject current=null] : (this_TypeDeclRule_0= ruleTypeDeclRule | this_InputsDeclRule_1= ruleInputsDeclRule | this_OutputsDeclRule_2= ruleOutputsDeclRule | this_VarsDeclRule_3= ruleVarsDeclRule | this_SharedVarsDeclRule_4= ruleSharedVarsDeclRule | this_DefineDeclRule_5= ruleDefineDeclRule | this_ConstsDeclRule_6= ruleConstsDeclRule | this_FunctionDecl_7= ruleFunctionDecl | this_ProcedureDecl_8= ruleProcedureDecl | this_InstanceDeclRule_9= ruleInstanceDeclRule | this_InitDeclRule_10= ruleInitDeclRule | this_NextDeclRule_11= ruleNextDeclRule | this_AxiomDeclRule_12= ruleAxiomDeclRule | this_SpecDeclRule_13= ruleSpecDeclRule ) ;
    public final EObject ruleDeclRule() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDeclRule_0 = null;

        EObject this_InputsDeclRule_1 = null;

        EObject this_OutputsDeclRule_2 = null;

        EObject this_VarsDeclRule_3 = null;

        EObject this_SharedVarsDeclRule_4 = null;

        EObject this_DefineDeclRule_5 = null;

        EObject this_ConstsDeclRule_6 = null;

        EObject this_FunctionDecl_7 = null;

        EObject this_ProcedureDecl_8 = null;

        EObject this_InstanceDeclRule_9 = null;

        EObject this_InitDeclRule_10 = null;

        EObject this_NextDeclRule_11 = null;

        EObject this_AxiomDeclRule_12 = null;

        EObject this_SpecDeclRule_13 = null;



        	enterRule();

        try {
            // InternalUclid.g:268:2: ( (this_TypeDeclRule_0= ruleTypeDeclRule | this_InputsDeclRule_1= ruleInputsDeclRule | this_OutputsDeclRule_2= ruleOutputsDeclRule | this_VarsDeclRule_3= ruleVarsDeclRule | this_SharedVarsDeclRule_4= ruleSharedVarsDeclRule | this_DefineDeclRule_5= ruleDefineDeclRule | this_ConstsDeclRule_6= ruleConstsDeclRule | this_FunctionDecl_7= ruleFunctionDecl | this_ProcedureDecl_8= ruleProcedureDecl | this_InstanceDeclRule_9= ruleInstanceDeclRule | this_InitDeclRule_10= ruleInitDeclRule | this_NextDeclRule_11= ruleNextDeclRule | this_AxiomDeclRule_12= ruleAxiomDeclRule | this_SpecDeclRule_13= ruleSpecDeclRule ) )
            // InternalUclid.g:269:2: (this_TypeDeclRule_0= ruleTypeDeclRule | this_InputsDeclRule_1= ruleInputsDeclRule | this_OutputsDeclRule_2= ruleOutputsDeclRule | this_VarsDeclRule_3= ruleVarsDeclRule | this_SharedVarsDeclRule_4= ruleSharedVarsDeclRule | this_DefineDeclRule_5= ruleDefineDeclRule | this_ConstsDeclRule_6= ruleConstsDeclRule | this_FunctionDecl_7= ruleFunctionDecl | this_ProcedureDecl_8= ruleProcedureDecl | this_InstanceDeclRule_9= ruleInstanceDeclRule | this_InitDeclRule_10= ruleInitDeclRule | this_NextDeclRule_11= ruleNextDeclRule | this_AxiomDeclRule_12= ruleAxiomDeclRule | this_SpecDeclRule_13= ruleSpecDeclRule )
            {
            // InternalUclid.g:269:2: (this_TypeDeclRule_0= ruleTypeDeclRule | this_InputsDeclRule_1= ruleInputsDeclRule | this_OutputsDeclRule_2= ruleOutputsDeclRule | this_VarsDeclRule_3= ruleVarsDeclRule | this_SharedVarsDeclRule_4= ruleSharedVarsDeclRule | this_DefineDeclRule_5= ruleDefineDeclRule | this_ConstsDeclRule_6= ruleConstsDeclRule | this_FunctionDecl_7= ruleFunctionDecl | this_ProcedureDecl_8= ruleProcedureDecl | this_InstanceDeclRule_9= ruleInstanceDeclRule | this_InitDeclRule_10= ruleInitDeclRule | this_NextDeclRule_11= ruleNextDeclRule | this_AxiomDeclRule_12= ruleAxiomDeclRule | this_SpecDeclRule_13= ruleSpecDeclRule )
            int alt5=14;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 27:
                {
                alt5=4;
                }
                break;
            case 29:
                {
                alt5=5;
                }
                break;
            case 30:
                {
                alt5=6;
                }
                break;
            case 28:
                {
                alt5=7;
                }
                break;
            case 33:
            case 34:
                {
                alt5=8;
                }
                break;
            case 35:
                {
                alt5=9;
                }
                break;
            case 40:
                {
                alt5=10;
                }
                break;
            case 49:
                {
                alt5=11;
                }
                break;
            case 50:
                {
                alt5=12;
                }
                break;
            case 41:
            case 42:
                {
                alt5=13;
                }
                break;
            case 43:
            case 48:
                {
                alt5=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalUclid.g:270:3: this_TypeDeclRule_0= ruleTypeDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getTypeDeclRuleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeDeclRule_0=ruleTypeDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeDeclRule_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:282:3: this_InputsDeclRule_1= ruleInputsDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getInputsDeclRuleParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InputsDeclRule_1=ruleInputsDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InputsDeclRule_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUclid.g:294:3: this_OutputsDeclRule_2= ruleOutputsDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getOutputsDeclRuleParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OutputsDeclRule_2=ruleOutputsDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OutputsDeclRule_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUclid.g:306:3: this_VarsDeclRule_3= ruleVarsDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getVarsDeclRuleParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_VarsDeclRule_3=ruleVarsDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_VarsDeclRule_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUclid.g:318:3: this_SharedVarsDeclRule_4= ruleSharedVarsDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getSharedVarsDeclRuleParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SharedVarsDeclRule_4=ruleSharedVarsDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SharedVarsDeclRule_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUclid.g:330:3: this_DefineDeclRule_5= ruleDefineDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getDefineDeclRuleParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_DefineDeclRule_5=ruleDefineDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefineDeclRule_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUclid.g:342:3: this_ConstsDeclRule_6= ruleConstsDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getConstsDeclRuleParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstsDeclRule_6=ruleConstsDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConstsDeclRule_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUclid.g:354:3: this_FunctionDecl_7= ruleFunctionDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getFunctionDeclParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_FunctionDecl_7=ruleFunctionDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FunctionDecl_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUclid.g:366:3: this_ProcedureDecl_8= ruleProcedureDecl
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getProcedureDeclParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ProcedureDecl_8=ruleProcedureDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ProcedureDecl_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalUclid.g:378:3: this_InstanceDeclRule_9= ruleInstanceDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getInstanceDeclRuleParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InstanceDeclRule_9=ruleInstanceDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InstanceDeclRule_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalUclid.g:390:3: this_InitDeclRule_10= ruleInitDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getInitDeclRuleParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InitDeclRule_10=ruleInitDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InitDeclRule_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalUclid.g:402:3: this_NextDeclRule_11= ruleNextDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getNextDeclRuleParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NextDeclRule_11=ruleNextDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NextDeclRule_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalUclid.g:414:3: this_AxiomDeclRule_12= ruleAxiomDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getAxiomDeclRuleParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AxiomDeclRule_12=ruleAxiomDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AxiomDeclRule_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalUclid.g:426:3: this_SpecDeclRule_13= ruleSpecDeclRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDeclRuleAccess().getSpecDeclRuleParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SpecDeclRule_13=ruleSpecDeclRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpecDeclRule_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclRule"


    // $ANTLR start "entryRuleTypeDeclRule"
    // InternalUclid.g:441:1: entryRuleTypeDeclRule returns [EObject current=null] : iv_ruleTypeDeclRule= ruleTypeDeclRule EOF ;
    public final EObject entryRuleTypeDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDeclRule = null;


        try {
            // InternalUclid.g:441:53: (iv_ruleTypeDeclRule= ruleTypeDeclRule EOF )
            // InternalUclid.g:442:2: iv_ruleTypeDeclRule= ruleTypeDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDeclRule=ruleTypeDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDeclRule"


    // $ANTLR start "ruleTypeDeclRule"
    // InternalUclid.g:448:1: ruleTypeDeclRule returns [EObject current=null] : ( (otherlv_0= 'type' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= '*' ) otherlv_3= '=' ( (lv_t_4_0= ruleTypeRule ) ) otherlv_5= ';' ) | (otherlv_6= 'type' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) ) ;
    public final EObject ruleTypeDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        EObject lv_t_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:454:2: ( ( (otherlv_0= 'type' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= '*' ) otherlv_3= '=' ( (lv_t_4_0= ruleTypeRule ) ) otherlv_5= ';' ) | (otherlv_6= 'type' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) ) )
            // InternalUclid.g:455:2: ( (otherlv_0= 'type' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= '*' ) otherlv_3= '=' ( (lv_t_4_0= ruleTypeRule ) ) otherlv_5= ';' ) | (otherlv_6= 'type' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) )
            {
            // InternalUclid.g:455:2: ( (otherlv_0= 'type' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= '*' ) otherlv_3= '=' ( (lv_t_4_0= ruleTypeRule ) ) otherlv_5= ';' ) | (otherlv_6= 'type' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==21) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==22) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==20) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalUclid.g:456:3: (otherlv_0= 'type' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= '*' ) otherlv_3= '=' ( (lv_t_4_0= ruleTypeRule ) ) otherlv_5= ';' )
                    {
                    // InternalUclid.g:456:3: (otherlv_0= 'type' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= '*' ) otherlv_3= '=' ( (lv_t_4_0= ruleTypeRule ) ) otherlv_5= ';' )
                    // InternalUclid.g:457:4: otherlv_0= 'type' ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= '*' ) otherlv_3= '=' ( (lv_t_4_0= ruleTypeRule ) ) otherlv_5= ';'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTypeDeclRuleAccess().getTypeKeyword_0_0());
                      			
                    }
                    // InternalUclid.g:461:4: ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= '*' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==20) ) {
                        alt6=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalUclid.g:462:5: ( (lv_name_1_0= RULE_ID ) )
                            {
                            // InternalUclid.g:462:5: ( (lv_name_1_0= RULE_ID ) )
                            // InternalUclid.g:463:6: (lv_name_1_0= RULE_ID )
                            {
                            // InternalUclid.g:463:6: (lv_name_1_0= RULE_ID )
                            // InternalUclid.g:464:7: lv_name_1_0= RULE_ID
                            {
                            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_name_1_0, grammarAccess.getTypeDeclRuleAccess().getNameIDTerminalRuleCall_0_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getTypeDeclRuleRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"name",
                              								lv_name_1_0,
                              								"org.eclipse.xtext.common.Terminals.ID");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUclid.g:481:5: otherlv_2= '*'
                            {
                            otherlv_2=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getTypeDeclRuleAccess().getAsteriskKeyword_0_1_1());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getTypeDeclRuleAccess().getEqualsSignKeyword_0_2());
                      			
                    }
                    // InternalUclid.g:490:4: ( (lv_t_4_0= ruleTypeRule ) )
                    // InternalUclid.g:491:5: (lv_t_4_0= ruleTypeRule )
                    {
                    // InternalUclid.g:491:5: (lv_t_4_0= ruleTypeRule )
                    // InternalUclid.g:492:6: lv_t_4_0= ruleTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeDeclRuleAccess().getTTypeRuleParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_t_4_0=ruleTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeDeclRuleRule());
                      						}
                      						set(
                      							current,
                      							"t",
                      							lv_t_4_0,
                      							"uclid.xtext.Uclid.TypeRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getTypeDeclRuleAccess().getSemicolonKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:515:3: (otherlv_6= 'type' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' )
                    {
                    // InternalUclid.g:515:3: (otherlv_6= 'type' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';' )
                    // InternalUclid.g:516:4: otherlv_6= 'type' ( (lv_name_7_0= RULE_ID ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getTypeDeclRuleAccess().getTypeKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:520:4: ( (lv_name_7_0= RULE_ID ) )
                    // InternalUclid.g:521:5: (lv_name_7_0= RULE_ID )
                    {
                    // InternalUclid.g:521:5: (lv_name_7_0= RULE_ID )
                    // InternalUclid.g:522:6: lv_name_7_0= RULE_ID
                    {
                    lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_7_0, grammarAccess.getTypeDeclRuleAccess().getNameIDTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypeDeclRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_7_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getTypeDeclRuleAccess().getSemicolonKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDeclRule"


    // $ANTLR start "entryRuleInputsDeclRule"
    // InternalUclid.g:547:1: entryRuleInputsDeclRule returns [EObject current=null] : iv_ruleInputsDeclRule= ruleInputsDeclRule EOF ;
    public final EObject entryRuleInputsDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputsDeclRule = null;


        try {
            // InternalUclid.g:547:55: (iv_ruleInputsDeclRule= ruleInputsDeclRule EOF )
            // InternalUclid.g:548:2: iv_ruleInputsDeclRule= ruleInputsDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputsDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInputsDeclRule=ruleInputsDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputsDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputsDeclRule"


    // $ANTLR start "ruleInputsDeclRule"
    // InternalUclid.g:554:1: ruleInputsDeclRule returns [EObject current=null] : (otherlv_0= 'input' ( (lv_inputs_1_0= ruleInputDecl ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleInputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) ;
    public final EObject ruleInputsDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_inputs_1_0 = null;

        EObject lv_inputs_3_0 = null;

        EObject lv_t_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:560:2: ( (otherlv_0= 'input' ( (lv_inputs_1_0= ruleInputDecl ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleInputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) )
            // InternalUclid.g:561:2: (otherlv_0= 'input' ( (lv_inputs_1_0= ruleInputDecl ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleInputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            {
            // InternalUclid.g:561:2: (otherlv_0= 'input' ( (lv_inputs_1_0= ruleInputDecl ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleInputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            // InternalUclid.g:562:3: otherlv_0= 'input' ( (lv_inputs_1_0= ruleInputDecl ) ) (otherlv_2= ',' ( (lv_inputs_3_0= ruleInputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInputsDeclRuleAccess().getInputKeyword_0());
              		
            }
            // InternalUclid.g:566:3: ( (lv_inputs_1_0= ruleInputDecl ) )
            // InternalUclid.g:567:4: (lv_inputs_1_0= ruleInputDecl )
            {
            // InternalUclid.g:567:4: (lv_inputs_1_0= ruleInputDecl )
            // InternalUclid.g:568:5: lv_inputs_1_0= ruleInputDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInputsDeclRuleAccess().getInputsInputDeclParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_inputs_1_0=ruleInputDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInputsDeclRuleRule());
              					}
              					add(
              						current,
              						"inputs",
              						lv_inputs_1_0,
              						"uclid.xtext.Uclid.InputDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:585:3: (otherlv_2= ',' ( (lv_inputs_3_0= ruleInputDecl ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUclid.g:586:4: otherlv_2= ',' ( (lv_inputs_3_0= ruleInputDecl ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getInputsDeclRuleAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUclid.g:590:4: ( (lv_inputs_3_0= ruleInputDecl ) )
            	    // InternalUclid.g:591:5: (lv_inputs_3_0= ruleInputDecl )
            	    {
            	    // InternalUclid.g:591:5: (lv_inputs_3_0= ruleInputDecl )
            	    // InternalUclid.g:592:6: lv_inputs_3_0= ruleInputDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getInputsDeclRuleAccess().getInputsInputDeclParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_inputs_3_0=ruleInputDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getInputsDeclRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"inputs",
            	      							lv_inputs_3_0,
            	      							"uclid.xtext.Uclid.InputDecl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInputsDeclRuleAccess().getColonKeyword_3());
              		
            }
            // InternalUclid.g:614:3: ( (lv_t_5_0= ruleTypeRule ) )
            // InternalUclid.g:615:4: (lv_t_5_0= ruleTypeRule )
            {
            // InternalUclid.g:615:4: (lv_t_5_0= ruleTypeRule )
            // InternalUclid.g:616:5: lv_t_5_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInputsDeclRuleAccess().getTTypeRuleParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_t_5_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInputsDeclRuleRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_5_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getInputsDeclRuleAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputsDeclRule"


    // $ANTLR start "entryRuleOutputsDeclRule"
    // InternalUclid.g:641:1: entryRuleOutputsDeclRule returns [EObject current=null] : iv_ruleOutputsDeclRule= ruleOutputsDeclRule EOF ;
    public final EObject entryRuleOutputsDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputsDeclRule = null;


        try {
            // InternalUclid.g:641:56: (iv_ruleOutputsDeclRule= ruleOutputsDeclRule EOF )
            // InternalUclid.g:642:2: iv_ruleOutputsDeclRule= ruleOutputsDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputsDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutputsDeclRule=ruleOutputsDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputsDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputsDeclRule"


    // $ANTLR start "ruleOutputsDeclRule"
    // InternalUclid.g:648:1: ruleOutputsDeclRule returns [EObject current=null] : (otherlv_0= 'output' ( (lv_outputs_1_0= ruleOutputDecl ) ) (otherlv_2= ',' ( (lv_outputs_3_0= ruleOutputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) ;
    public final EObject ruleOutputsDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_outputs_1_0 = null;

        EObject lv_outputs_3_0 = null;

        EObject lv_t_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:654:2: ( (otherlv_0= 'output' ( (lv_outputs_1_0= ruleOutputDecl ) ) (otherlv_2= ',' ( (lv_outputs_3_0= ruleOutputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) )
            // InternalUclid.g:655:2: (otherlv_0= 'output' ( (lv_outputs_1_0= ruleOutputDecl ) ) (otherlv_2= ',' ( (lv_outputs_3_0= ruleOutputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            {
            // InternalUclid.g:655:2: (otherlv_0= 'output' ( (lv_outputs_1_0= ruleOutputDecl ) ) (otherlv_2= ',' ( (lv_outputs_3_0= ruleOutputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            // InternalUclid.g:656:3: otherlv_0= 'output' ( (lv_outputs_1_0= ruleOutputDecl ) ) (otherlv_2= ',' ( (lv_outputs_3_0= ruleOutputDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOutputsDeclRuleAccess().getOutputKeyword_0());
              		
            }
            // InternalUclid.g:660:3: ( (lv_outputs_1_0= ruleOutputDecl ) )
            // InternalUclid.g:661:4: (lv_outputs_1_0= ruleOutputDecl )
            {
            // InternalUclid.g:661:4: (lv_outputs_1_0= ruleOutputDecl )
            // InternalUclid.g:662:5: lv_outputs_1_0= ruleOutputDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOutputsDeclRuleAccess().getOutputsOutputDeclParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_outputs_1_0=ruleOutputDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOutputsDeclRuleRule());
              					}
              					add(
              						current,
              						"outputs",
              						lv_outputs_1_0,
              						"uclid.xtext.Uclid.OutputDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:679:3: (otherlv_2= ',' ( (lv_outputs_3_0= ruleOutputDecl ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==24) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUclid.g:680:4: otherlv_2= ',' ( (lv_outputs_3_0= ruleOutputDecl ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getOutputsDeclRuleAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUclid.g:684:4: ( (lv_outputs_3_0= ruleOutputDecl ) )
            	    // InternalUclid.g:685:5: (lv_outputs_3_0= ruleOutputDecl )
            	    {
            	    // InternalUclid.g:685:5: (lv_outputs_3_0= ruleOutputDecl )
            	    // InternalUclid.g:686:6: lv_outputs_3_0= ruleOutputDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOutputsDeclRuleAccess().getOutputsOutputDeclParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_outputs_3_0=ruleOutputDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOutputsDeclRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"outputs",
            	      							lv_outputs_3_0,
            	      							"uclid.xtext.Uclid.OutputDecl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getOutputsDeclRuleAccess().getColonKeyword_3());
              		
            }
            // InternalUclid.g:708:3: ( (lv_t_5_0= ruleTypeRule ) )
            // InternalUclid.g:709:4: (lv_t_5_0= ruleTypeRule )
            {
            // InternalUclid.g:709:4: (lv_t_5_0= ruleTypeRule )
            // InternalUclid.g:710:5: lv_t_5_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOutputsDeclRuleAccess().getTTypeRuleParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_t_5_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOutputsDeclRuleRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_5_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getOutputsDeclRuleAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputsDeclRule"


    // $ANTLR start "entryRuleInputDecl"
    // InternalUclid.g:735:1: entryRuleInputDecl returns [EObject current=null] : iv_ruleInputDecl= ruleInputDecl EOF ;
    public final EObject entryRuleInputDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputDecl = null;


        try {
            // InternalUclid.g:735:50: (iv_ruleInputDecl= ruleInputDecl EOF )
            // InternalUclid.g:736:2: iv_ruleInputDecl= ruleInputDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInputDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInputDecl=ruleInputDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInputDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInputDecl"


    // $ANTLR start "ruleInputDecl"
    // InternalUclid.g:742:1: ruleInputDecl returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleInputDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUclid.g:748:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUclid.g:749:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUclid.g:749:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUclid.g:750:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUclid.g:750:3: (lv_name_0_0= RULE_ID )
            // InternalUclid.g:751:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getInputDeclAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getInputDeclRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInputDecl"


    // $ANTLR start "entryRuleOutputDecl"
    // InternalUclid.g:770:1: entryRuleOutputDecl returns [EObject current=null] : iv_ruleOutputDecl= ruleOutputDecl EOF ;
    public final EObject entryRuleOutputDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputDecl = null;


        try {
            // InternalUclid.g:770:51: (iv_ruleOutputDecl= ruleOutputDecl EOF )
            // InternalUclid.g:771:2: iv_ruleOutputDecl= ruleOutputDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOutputDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOutputDecl=ruleOutputDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOutputDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputDecl"


    // $ANTLR start "ruleOutputDecl"
    // InternalUclid.g:777:1: ruleOutputDecl returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleOutputDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUclid.g:783:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUclid.g:784:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUclid.g:784:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUclid.g:785:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUclid.g:785:3: (lv_name_0_0= RULE_ID )
            // InternalUclid.g:786:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getOutputDeclAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getOutputDeclRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputDecl"


    // $ANTLR start "entryRuleVarDecl"
    // InternalUclid.g:805:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalUclid.g:805:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalUclid.g:806:2: iv_ruleVarDecl= ruleVarDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarDecl=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDecl"


    // $ANTLR start "ruleVarDecl"
    // InternalUclid.g:812:1: ruleVarDecl returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUclid.g:818:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUclid.g:819:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUclid.g:819:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUclid.g:820:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUclid.g:820:3: (lv_name_0_0= RULE_ID )
            // InternalUclid.g:821:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getVarDeclAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getVarDeclRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDecl"


    // $ANTLR start "entryRuleFuncDecl"
    // InternalUclid.g:840:1: entryRuleFuncDecl returns [EObject current=null] : iv_ruleFuncDecl= ruleFuncDecl EOF ;
    public final EObject entryRuleFuncDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFuncDecl = null;


        try {
            // InternalUclid.g:840:49: (iv_ruleFuncDecl= ruleFuncDecl EOF )
            // InternalUclid.g:841:2: iv_ruleFuncDecl= ruleFuncDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFuncDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFuncDecl=ruleFuncDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFuncDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFuncDecl"


    // $ANTLR start "ruleFuncDecl"
    // InternalUclid.g:847:1: ruleFuncDecl returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleFuncDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUclid.g:853:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUclid.g:854:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUclid.g:854:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUclid.g:855:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUclid.g:855:3: (lv_name_0_0= RULE_ID )
            // InternalUclid.g:856:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getFuncDeclAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getFuncDeclRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFuncDecl"


    // $ANTLR start "entryRuleVarsDeclRule"
    // InternalUclid.g:875:1: entryRuleVarsDeclRule returns [EObject current=null] : iv_ruleVarsDeclRule= ruleVarsDeclRule EOF ;
    public final EObject entryRuleVarsDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarsDeclRule = null;


        try {
            // InternalUclid.g:875:53: (iv_ruleVarsDeclRule= ruleVarsDeclRule EOF )
            // InternalUclid.g:876:2: iv_ruleVarsDeclRule= ruleVarsDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarsDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarsDeclRule=ruleVarsDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarsDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarsDeclRule"


    // $ANTLR start "ruleVarsDeclRule"
    // InternalUclid.g:882:1: ruleVarsDeclRule returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) ;
    public final EObject ruleVarsDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_vars_1_0 = null;

        EObject lv_vars_3_0 = null;

        EObject lv_t_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:888:2: ( (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) )
            // InternalUclid.g:889:2: (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            {
            // InternalUclid.g:889:2: (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            // InternalUclid.g:890:3: otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVarsDeclRuleAccess().getVarKeyword_0());
              		
            }
            // InternalUclid.g:894:3: ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* )
            // InternalUclid.g:895:4: ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )*
            {
            // InternalUclid.g:895:4: ( (lv_vars_1_0= ruleVarDecl ) )
            // InternalUclid.g:896:5: (lv_vars_1_0= ruleVarDecl )
            {
            // InternalUclid.g:896:5: (lv_vars_1_0= ruleVarDecl )
            // InternalUclid.g:897:6: lv_vars_1_0= ruleVarDecl
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getVarsDeclRuleAccess().getVarsVarDeclParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_13);
            lv_vars_1_0=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getVarsDeclRuleRule());
              						}
              						add(
              							current,
              							"vars",
              							lv_vars_1_0,
              							"uclid.xtext.Uclid.VarDecl");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalUclid.g:914:4: (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalUclid.g:915:5: otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getVarsDeclRuleAccess().getCommaKeyword_1_1_0());
            	      				
            	    }
            	    // InternalUclid.g:919:5: ( (lv_vars_3_0= ruleVarDecl ) )
            	    // InternalUclid.g:920:6: (lv_vars_3_0= ruleVarDecl )
            	    {
            	    // InternalUclid.g:920:6: (lv_vars_3_0= ruleVarDecl )
            	    // InternalUclid.g:921:7: lv_vars_3_0= ruleVarDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getVarsDeclRuleAccess().getVarsVarDeclParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_vars_3_0=ruleVarDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getVarsDeclRuleRule());
            	      							}
            	      							add(
            	      								current,
            	      								"vars",
            	      								lv_vars_3_0,
            	      								"uclid.xtext.Uclid.VarDecl");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVarsDeclRuleAccess().getColonKeyword_2());
              		
            }
            // InternalUclid.g:944:3: ( (lv_t_5_0= ruleTypeRule ) )
            // InternalUclid.g:945:4: (lv_t_5_0= ruleTypeRule )
            {
            // InternalUclid.g:945:4: (lv_t_5_0= ruleTypeRule )
            // InternalUclid.g:946:5: lv_t_5_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getVarsDeclRuleAccess().getTTypeRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_t_5_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getVarsDeclRuleRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_5_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getVarsDeclRuleAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarsDeclRule"


    // $ANTLR start "entryRuleConstsDeclRule"
    // InternalUclid.g:971:1: entryRuleConstsDeclRule returns [EObject current=null] : iv_ruleConstsDeclRule= ruleConstsDeclRule EOF ;
    public final EObject entryRuleConstsDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstsDeclRule = null;


        try {
            // InternalUclid.g:971:55: (iv_ruleConstsDeclRule= ruleConstsDeclRule EOF )
            // InternalUclid.g:972:2: iv_ruleConstsDeclRule= ruleConstsDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstsDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstsDeclRule=ruleConstsDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstsDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstsDeclRule"


    // $ANTLR start "ruleConstsDeclRule"
    // InternalUclid.g:978:1: ruleConstsDeclRule returns [EObject current=null] : (otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';' ) ;
    public final EObject ruleConstsDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_INT_7=null;
        Token otherlv_8=null;
        EObject lv_constants_1_0 = null;

        EObject lv_constants_3_0 = null;

        EObject lv_t_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:984:2: ( (otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';' ) )
            // InternalUclid.g:985:2: (otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';' )
            {
            // InternalUclid.g:985:2: (otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';' )
            // InternalUclid.g:986:3: otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstsDeclRuleAccess().getConstKeyword_0());
              		
            }
            // InternalUclid.g:990:3: ( (lv_constants_1_0= ruleConstDecl ) )
            // InternalUclid.g:991:4: (lv_constants_1_0= ruleConstDecl )
            {
            // InternalUclid.g:991:4: (lv_constants_1_0= ruleConstDecl )
            // InternalUclid.g:992:5: lv_constants_1_0= ruleConstDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstsDeclRuleAccess().getConstantsConstDeclParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_constants_1_0=ruleConstDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstsDeclRuleRule());
              					}
              					add(
              						current,
              						"constants",
              						lv_constants_1_0,
              						"uclid.xtext.Uclid.ConstDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:1009:3: (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUclid.g:1010:4: otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConstsDeclRuleAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUclid.g:1014:4: ( (lv_constants_3_0= ruleConstDecl ) )
            	    // InternalUclid.g:1015:5: (lv_constants_3_0= ruleConstDecl )
            	    {
            	    // InternalUclid.g:1015:5: (lv_constants_3_0= ruleConstDecl )
            	    // InternalUclid.g:1016:6: lv_constants_3_0= ruleConstDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConstsDeclRuleAccess().getConstantsConstDeclParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_constants_3_0=ruleConstDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConstsDeclRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"constants",
            	      							lv_constants_3_0,
            	      							"uclid.xtext.Uclid.ConstDecl");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConstsDeclRuleAccess().getColonKeyword_3());
              		
            }
            // InternalUclid.g:1038:3: ( (lv_t_5_0= ruleTypeRule ) )
            // InternalUclid.g:1039:4: (lv_t_5_0= ruleTypeRule )
            {
            // InternalUclid.g:1039:4: (lv_t_5_0= ruleTypeRule )
            // InternalUclid.g:1040:5: lv_t_5_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstsDeclRuleAccess().getTTypeRuleParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_t_5_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getConstsDeclRuleRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_5_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:1057:3: (otherlv_6= '=' this_INT_7= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUclid.g:1058:4: otherlv_6= '=' this_INT_7= RULE_INT
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getConstsDeclRuleAccess().getEqualsSignKeyword_5_0());
                      			
                    }
                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_7, grammarAccess.getConstsDeclRuleAccess().getINTTerminalRuleCall_5_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getConstsDeclRuleAccess().getSemicolonKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstsDeclRule"


    // $ANTLR start "entryRuleConstDecl"
    // InternalUclid.g:1075:1: entryRuleConstDecl returns [EObject current=null] : iv_ruleConstDecl= ruleConstDecl EOF ;
    public final EObject entryRuleConstDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDecl = null;


        try {
            // InternalUclid.g:1075:50: (iv_ruleConstDecl= ruleConstDecl EOF )
            // InternalUclid.g:1076:2: iv_ruleConstDecl= ruleConstDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstDecl=ruleConstDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstDecl"


    // $ANTLR start "ruleConstDecl"
    // InternalUclid.g:1082:1: ruleConstDecl returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleConstDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUclid.g:1088:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUclid.g:1089:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUclid.g:1089:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUclid.g:1090:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUclid.g:1090:3: (lv_name_0_0= RULE_ID )
            // InternalUclid.g:1091:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getConstDeclAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getConstDeclRule());
              				}
              				setWithLastConsumed(
              					current,
              					"name",
              					lv_name_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstDecl"


    // $ANTLR start "entryRuleSharedVarsDeclRule"
    // InternalUclid.g:1110:1: entryRuleSharedVarsDeclRule returns [EObject current=null] : iv_ruleSharedVarsDeclRule= ruleSharedVarsDeclRule EOF ;
    public final EObject entryRuleSharedVarsDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSharedVarsDeclRule = null;


        try {
            // InternalUclid.g:1110:59: (iv_ruleSharedVarsDeclRule= ruleSharedVarsDeclRule EOF )
            // InternalUclid.g:1111:2: iv_ruleSharedVarsDeclRule= ruleSharedVarsDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSharedVarsDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSharedVarsDeclRule=ruleSharedVarsDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSharedVarsDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSharedVarsDeclRule"


    // $ANTLR start "ruleSharedVarsDeclRule"
    // InternalUclid.g:1117:1: ruleSharedVarsDeclRule returns [EObject current=null] : (otherlv_0= 'sharedvar' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) ;
    public final EObject ruleSharedVarsDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_vars_1_0 = null;

        EObject lv_vars_3_0 = null;

        EObject lv_t_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1123:2: ( (otherlv_0= 'sharedvar' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) )
            // InternalUclid.g:1124:2: (otherlv_0= 'sharedvar' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            {
            // InternalUclid.g:1124:2: (otherlv_0= 'sharedvar' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            // InternalUclid.g:1125:3: otherlv_0= 'sharedvar' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSharedVarsDeclRuleAccess().getSharedvarKeyword_0());
              		
            }
            // InternalUclid.g:1129:3: ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* )
            // InternalUclid.g:1130:4: ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )*
            {
            // InternalUclid.g:1130:4: ( (lv_vars_1_0= ruleVarDecl ) )
            // InternalUclid.g:1131:5: (lv_vars_1_0= ruleVarDecl )
            {
            // InternalUclid.g:1131:5: (lv_vars_1_0= ruleVarDecl )
            // InternalUclid.g:1132:6: lv_vars_1_0= ruleVarDecl
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getSharedVarsDeclRuleAccess().getVarsVarDeclParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_13);
            lv_vars_1_0=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getSharedVarsDeclRuleRule());
              						}
              						add(
              							current,
              							"vars",
              							lv_vars_1_0,
              							"uclid.xtext.Uclid.VarDecl");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalUclid.g:1149:4: (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalUclid.g:1150:5: otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getSharedVarsDeclRuleAccess().getCommaKeyword_1_1_0());
            	      				
            	    }
            	    // InternalUclid.g:1154:5: ( (lv_vars_3_0= ruleVarDecl ) )
            	    // InternalUclid.g:1155:6: (lv_vars_3_0= ruleVarDecl )
            	    {
            	    // InternalUclid.g:1155:6: (lv_vars_3_0= ruleVarDecl )
            	    // InternalUclid.g:1156:7: lv_vars_3_0= ruleVarDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getSharedVarsDeclRuleAccess().getVarsVarDeclParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_vars_3_0=ruleVarDecl();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getSharedVarsDeclRuleRule());
            	      							}
            	      							add(
            	      								current,
            	      								"vars",
            	      								lv_vars_3_0,
            	      								"uclid.xtext.Uclid.VarDecl");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSharedVarsDeclRuleAccess().getColonKeyword_2());
              		
            }
            // InternalUclid.g:1179:3: ( (lv_t_5_0= ruleTypeRule ) )
            // InternalUclid.g:1180:4: (lv_t_5_0= ruleTypeRule )
            {
            // InternalUclid.g:1180:4: (lv_t_5_0= ruleTypeRule )
            // InternalUclid.g:1181:5: lv_t_5_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSharedVarsDeclRuleAccess().getTTypeRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_t_5_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSharedVarsDeclRuleRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_5_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getSharedVarsDeclRuleAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSharedVarsDeclRule"


    // $ANTLR start "entryRuleArgList"
    // InternalUclid.g:1206:1: entryRuleArgList returns [EObject current=null] : iv_ruleArgList= ruleArgList EOF ;
    public final EObject entryRuleArgList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgList = null;


        try {
            // InternalUclid.g:1206:48: (iv_ruleArgList= ruleArgList EOF )
            // InternalUclid.g:1207:2: iv_ruleArgList= ruleArgList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgList=ruleArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgList"


    // $ANTLR start "ruleArgList"
    // InternalUclid.g:1213:1: ruleArgList returns [EObject current=null] : ( ( ( (lv_args_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleVarDecl ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleVarDecl ) ) (otherlv_7= ',' ( (lv_args_8_0= ruleVarDecl ) ) )* otherlv_9= ':' ( (lv_t_10_0= ruleTypeRule ) ) )* )? ;
    public final EObject ruleArgList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_args_0_0 = null;

        EObject lv_args_2_0 = null;

        EObject lv_t_4_0 = null;

        EObject lv_args_6_0 = null;

        EObject lv_args_8_0 = null;

        EObject lv_t_10_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1219:2: ( ( ( ( (lv_args_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleVarDecl ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleVarDecl ) ) (otherlv_7= ',' ( (lv_args_8_0= ruleVarDecl ) ) )* otherlv_9= ':' ( (lv_t_10_0= ruleTypeRule ) ) )* )? )
            // InternalUclid.g:1220:2: ( ( ( (lv_args_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleVarDecl ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleVarDecl ) ) (otherlv_7= ',' ( (lv_args_8_0= ruleVarDecl ) ) )* otherlv_9= ':' ( (lv_t_10_0= ruleTypeRule ) ) )* )?
            {
            // InternalUclid.g:1220:2: ( ( ( (lv_args_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleVarDecl ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleVarDecl ) ) (otherlv_7= ',' ( (lv_args_8_0= ruleVarDecl ) ) )* otherlv_9= ':' ( (lv_t_10_0= ruleTypeRule ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUclid.g:1221:3: ( ( (lv_args_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleVarDecl ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleVarDecl ) ) (otherlv_7= ',' ( (lv_args_8_0= ruleVarDecl ) ) )* otherlv_9= ':' ( (lv_t_10_0= ruleTypeRule ) ) )*
                    {
                    // InternalUclid.g:1221:3: ( ( (lv_args_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleVarDecl ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) )
                    // InternalUclid.g:1222:4: ( (lv_args_0_0= ruleVarDecl ) ) (otherlv_1= ',' ( (lv_args_2_0= ruleVarDecl ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) )
                    {
                    // InternalUclid.g:1222:4: ( (lv_args_0_0= ruleVarDecl ) )
                    // InternalUclid.g:1223:5: (lv_args_0_0= ruleVarDecl )
                    {
                    // InternalUclid.g:1223:5: (lv_args_0_0= ruleVarDecl )
                    // InternalUclid.g:1224:6: lv_args_0_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArgListAccess().getArgsVarDeclParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_args_0_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArgListRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_0_0,
                      							"uclid.xtext.Uclid.VarDecl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:1241:4: (otherlv_1= ',' ( (lv_args_2_0= ruleVarDecl ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==24) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalUclid.g:1242:5: otherlv_1= ',' ( (lv_args_2_0= ruleVarDecl ) )
                    	    {
                    	    otherlv_1=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_1, grammarAccess.getArgListAccess().getCommaKeyword_0_1_0());
                    	      				
                    	    }
                    	    // InternalUclid.g:1246:5: ( (lv_args_2_0= ruleVarDecl ) )
                    	    // InternalUclid.g:1247:6: (lv_args_2_0= ruleVarDecl )
                    	    {
                    	    // InternalUclid.g:1247:6: (lv_args_2_0= ruleVarDecl )
                    	    // InternalUclid.g:1248:7: lv_args_2_0= ruleVarDecl
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArgListAccess().getArgsVarDeclParserRuleCall_0_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_args_2_0=ruleVarDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getArgListRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"args",
                    	      								lv_args_2_0,
                    	      								"uclid.xtext.Uclid.VarDecl");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getArgListAccess().getColonKeyword_0_2());
                      			
                    }
                    // InternalUclid.g:1270:4: ( (lv_t_4_0= ruleTypeRule ) )
                    // InternalUclid.g:1271:5: (lv_t_4_0= ruleTypeRule )
                    {
                    // InternalUclid.g:1271:5: (lv_t_4_0= ruleTypeRule )
                    // InternalUclid.g:1272:6: lv_t_4_0= ruleTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArgListAccess().getTTypeRuleParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_t_4_0=ruleTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArgListRule());
                      						}
                      						set(
                      							current,
                      							"t",
                      							lv_t_4_0,
                      							"uclid.xtext.Uclid.TypeRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }

                    // InternalUclid.g:1290:3: (otherlv_5= ',' ( (lv_args_6_0= ruleVarDecl ) ) (otherlv_7= ',' ( (lv_args_8_0= ruleVarDecl ) ) )* otherlv_9= ':' ( (lv_t_10_0= ruleTypeRule ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==24) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalUclid.g:1291:4: otherlv_5= ',' ( (lv_args_6_0= ruleVarDecl ) ) (otherlv_7= ',' ( (lv_args_8_0= ruleVarDecl ) ) )* otherlv_9= ':' ( (lv_t_10_0= ruleTypeRule ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(otherlv_5, grammarAccess.getArgListAccess().getCommaKeyword_1_0());
                    	      			
                    	    }
                    	    // InternalUclid.g:1295:4: ( (lv_args_6_0= ruleVarDecl ) )
                    	    // InternalUclid.g:1296:5: (lv_args_6_0= ruleVarDecl )
                    	    {
                    	    // InternalUclid.g:1296:5: (lv_args_6_0= ruleVarDecl )
                    	    // InternalUclid.g:1297:6: lv_args_6_0= ruleVarDecl
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getArgListAccess().getArgsVarDeclParserRuleCall_1_1_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_args_6_0=ruleVarDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getArgListRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"args",
                    	      							lv_args_6_0,
                    	      							"uclid.xtext.Uclid.VarDecl");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }

                    	    // InternalUclid.g:1314:4: (otherlv_7= ',' ( (lv_args_8_0= ruleVarDecl ) ) )*
                    	    loop15:
                    	    do {
                    	        int alt15=2;
                    	        int LA15_0 = input.LA(1);

                    	        if ( (LA15_0==24) ) {
                    	            alt15=1;
                    	        }


                    	        switch (alt15) {
                    	    	case 1 :
                    	    	    // InternalUclid.g:1315:5: otherlv_7= ',' ( (lv_args_8_0= ruleVarDecl ) )
                    	    	    {
                    	    	    otherlv_7=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      					newLeafNode(otherlv_7, grammarAccess.getArgListAccess().getCommaKeyword_1_2_0());
                    	    	      				
                    	    	    }
                    	    	    // InternalUclid.g:1319:5: ( (lv_args_8_0= ruleVarDecl ) )
                    	    	    // InternalUclid.g:1320:6: (lv_args_8_0= ruleVarDecl )
                    	    	    {
                    	    	    // InternalUclid.g:1320:6: (lv_args_8_0= ruleVarDecl )
                    	    	    // InternalUclid.g:1321:7: lv_args_8_0= ruleVarDecl
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {

                    	    	      							newCompositeNode(grammarAccess.getArgListAccess().getArgsVarDeclParserRuleCall_1_2_1_0());
                    	    	      						
                    	    	    }
                    	    	    pushFollow(FOLLOW_13);
                    	    	    lv_args_8_0=ruleVarDecl();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      							if (current==null) {
                    	    	      								current = createModelElementForParent(grammarAccess.getArgListRule());
                    	    	      							}
                    	    	      							add(
                    	    	      								current,
                    	    	      								"args",
                    	    	      								lv_args_8_0,
                    	    	      								"uclid.xtext.Uclid.VarDecl");
                    	    	      							afterParserOrEnumRuleCall();
                    	    	      						
                    	    	    }

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop15;
                    	        }
                    	    } while (true);

                    	    otherlv_9=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      				newLeafNode(otherlv_9, grammarAccess.getArgListAccess().getColonKeyword_1_3());
                    	      			
                    	    }
                    	    // InternalUclid.g:1343:4: ( (lv_t_10_0= ruleTypeRule ) )
                    	    // InternalUclid.g:1344:5: (lv_t_10_0= ruleTypeRule )
                    	    {
                    	    // InternalUclid.g:1344:5: (lv_t_10_0= ruleTypeRule )
                    	    // InternalUclid.g:1345:6: lv_t_10_0= ruleTypeRule
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getArgListAccess().getTTypeRuleParserRuleCall_1_4_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_t_10_0=ruleTypeRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getArgListRule());
                    	      						}
                    	      						set(
                    	      							current,
                    	      							"t",
                    	      							lv_t_10_0,
                    	      							"uclid.xtext.Uclid.TypeRule");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgList"


    // $ANTLR start "entryRuleDefineDeclRule"
    // InternalUclid.g:1367:1: entryRuleDefineDeclRule returns [EObject current=null] : iv_ruleDefineDeclRule= ruleDefineDeclRule EOF ;
    public final EObject entryRuleDefineDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineDeclRule = null;


        try {
            // InternalUclid.g:1367:55: (iv_ruleDefineDeclRule= ruleDefineDeclRule EOF )
            // InternalUclid.g:1368:2: iv_ruleDefineDeclRule= ruleDefineDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefineDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefineDeclRule=ruleDefineDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefineDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefineDeclRule"


    // $ANTLR start "ruleDefineDeclRule"
    // InternalUclid.g:1374:1: ruleDefineDeclRule returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';' ) ;
    public final EObject ruleDefineDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_inputs_3_0 = null;

        EObject lv_t_6_0 = null;

        EObject lv_e_8_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1380:2: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';' ) )
            // InternalUclid.g:1381:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';' )
            {
            // InternalUclid.g:1381:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';' )
            // InternalUclid.g:1382:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_inputs_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefineDeclRuleAccess().getDefineKeyword_0());
              		
            }
            // InternalUclid.g:1386:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUclid.g:1387:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUclid.g:1387:4: (lv_name_1_0= RULE_ID )
            // InternalUclid.g:1388:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getDefineDeclRuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getDefineDeclRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefineDeclRuleAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUclid.g:1408:3: ( (lv_inputs_3_0= ruleArgList ) )
            // InternalUclid.g:1409:4: (lv_inputs_3_0= ruleArgList )
            {
            // InternalUclid.g:1409:4: (lv_inputs_3_0= ruleArgList )
            // InternalUclid.g:1410:5: lv_inputs_3_0= ruleArgList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefineDeclRuleAccess().getInputsArgListParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_inputs_3_0=ruleArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefineDeclRuleRule());
              					}
              					set(
              						current,
              						"inputs",
              						lv_inputs_3_0,
              						"uclid.xtext.Uclid.ArgList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefineDeclRuleAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefineDeclRuleAccess().getColonKeyword_5());
              		
            }
            // InternalUclid.g:1435:3: ( (lv_t_6_0= ruleTypeRule ) )
            // InternalUclid.g:1436:4: (lv_t_6_0= ruleTypeRule )
            {
            // InternalUclid.g:1436:4: (lv_t_6_0= ruleTypeRule )
            // InternalUclid.g:1437:5: lv_t_6_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefineDeclRuleAccess().getTTypeRuleParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_10);
            lv_t_6_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefineDeclRuleRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_6_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDefineDeclRuleAccess().getEqualsSignKeyword_7());
              		
            }
            // InternalUclid.g:1458:3: ( (lv_e_8_0= ruleExprRule ) )
            // InternalUclid.g:1459:4: (lv_e_8_0= ruleExprRule )
            {
            // InternalUclid.g:1459:4: (lv_e_8_0= ruleExprRule )
            // InternalUclid.g:1460:5: lv_e_8_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefineDeclRuleAccess().getEExprRuleParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_e_8_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefineDeclRuleRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_8_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getDefineDeclRuleAccess().getSemicolonKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefineDeclRule"


    // $ANTLR start "entryRuleFunctionDecl"
    // InternalUclid.g:1485:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalUclid.g:1485:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalUclid.g:1486:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionDecl=ruleFunctionDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionDecl"


    // $ANTLR start "ruleFunctionDecl"
    // InternalUclid.g:1492:1: ruleFunctionDecl returns [EObject current=null] : ( () (otherlv_1= 'synthesis' )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_inputs_5_0= ruleArgList ) ) otherlv_6= ')' otherlv_7= ':' ( (lv_t_8_0= ruleTypeRule ) ) otherlv_9= ';' ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_inputs_5_0 = null;

        EObject lv_t_8_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1498:2: ( ( () (otherlv_1= 'synthesis' )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_inputs_5_0= ruleArgList ) ) otherlv_6= ')' otherlv_7= ':' ( (lv_t_8_0= ruleTypeRule ) ) otherlv_9= ';' ) )
            // InternalUclid.g:1499:2: ( () (otherlv_1= 'synthesis' )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_inputs_5_0= ruleArgList ) ) otherlv_6= ')' otherlv_7= ':' ( (lv_t_8_0= ruleTypeRule ) ) otherlv_9= ';' )
            {
            // InternalUclid.g:1499:2: ( () (otherlv_1= 'synthesis' )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_inputs_5_0= ruleArgList ) ) otherlv_6= ')' otherlv_7= ':' ( (lv_t_8_0= ruleTypeRule ) ) otherlv_9= ';' )
            // InternalUclid.g:1500:3: () (otherlv_1= 'synthesis' )? otherlv_2= 'function' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= '(' ( (lv_inputs_5_0= ruleArgList ) ) otherlv_6= ')' otherlv_7= ':' ( (lv_t_8_0= ruleTypeRule ) ) otherlv_9= ';'
            {
            // InternalUclid.g:1500:3: ()
            // InternalUclid.g:1501:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFunctionDeclAccess().getFunctionDeclAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:1510:3: (otherlv_1= 'synthesis' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUclid.g:1511:4: otherlv_1= 'synthesis'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getFunctionDeclAccess().getSynthesisKeyword_1());
                      			
                    }

                    }
                    break;

            }

            otherlv_2=(Token)match(input,34,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFunctionDeclAccess().getFunctionKeyword_2());
              		
            }
            // InternalUclid.g:1520:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalUclid.g:1521:4: (lv_name_3_0= RULE_ID )
            {
            // InternalUclid.g:1521:4: (lv_name_3_0= RULE_ID )
            // InternalUclid.g:1522:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getFunctionDeclAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_3_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_4=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalUclid.g:1542:3: ( (lv_inputs_5_0= ruleArgList ) )
            // InternalUclid.g:1543:4: (lv_inputs_5_0= ruleArgList )
            {
            // InternalUclid.g:1543:4: (lv_inputs_5_0= ruleArgList )
            // InternalUclid.g:1544:5: lv_inputs_5_0= ruleArgList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDeclAccess().getInputsArgListParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_inputs_5_0=ruleArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
              					}
              					set(
              						current,
              						"inputs",
              						lv_inputs_5_0,
              						"uclid.xtext.Uclid.ArgList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_6());
              		
            }
            otherlv_7=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFunctionDeclAccess().getColonKeyword_7());
              		
            }
            // InternalUclid.g:1569:3: ( (lv_t_8_0= ruleTypeRule ) )
            // InternalUclid.g:1570:4: (lv_t_8_0= ruleTypeRule )
            {
            // InternalUclid.g:1570:4: (lv_t_8_0= ruleTypeRule )
            // InternalUclid.g:1571:5: lv_t_8_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDeclAccess().getTTypeRuleParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_t_8_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_8_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_9=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getFunctionDeclAccess().getSemicolonKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDecl"


    // $ANTLR start "entryRuleProcedureDecl"
    // InternalUclid.g:1596:1: entryRuleProcedureDecl returns [EObject current=null] : iv_ruleProcedureDecl= ruleProcedureDecl EOF ;
    public final EObject entryRuleProcedureDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureDecl = null;


        try {
            // InternalUclid.g:1596:54: (iv_ruleProcedureDecl= ruleProcedureDecl EOF )
            // InternalUclid.g:1597:2: iv_ruleProcedureDecl= ruleProcedureDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcedureDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcedureDecl=ruleProcedureDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcedureDecl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcedureDecl"


    // $ANTLR start "ruleProcedureDecl"
    // InternalUclid.g:1603:1: ruleProcedureDecl returns [EObject current=null] : ( () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleArgList ) ) otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleProcedureDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_inputs_4_0 = null;

        EObject lv_ret_6_0 = null;

        EObject lv_req_7_0 = null;

        EObject lv_ensure_8_0 = null;

        EObject lv_modifies_9_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1609:2: ( ( () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleArgList ) ) otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:1610:2: ( () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleArgList ) ) otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:1610:2: ( () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleArgList ) ) otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:1611:3: () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_inputs_4_0= ruleArgList ) ) otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) )
            {
            // InternalUclid.g:1611:3: ()
            // InternalUclid.g:1612:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProcedureDeclAccess().getProcedureDeclAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,35,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProcedureDeclAccess().getProcedureKeyword_1());
              		
            }
            // InternalUclid.g:1625:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUclid.g:1626:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUclid.g:1626:4: (lv_name_2_0= RULE_ID )
            // InternalUclid.g:1627:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getProcedureDeclAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getProcedureDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProcedureDeclAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalUclid.g:1647:3: ( (lv_inputs_4_0= ruleArgList ) )
            // InternalUclid.g:1648:4: (lv_inputs_4_0= ruleArgList )
            {
            // InternalUclid.g:1648:4: (lv_inputs_4_0= ruleArgList )
            // InternalUclid.g:1649:5: lv_inputs_4_0= ruleArgList
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcedureDeclAccess().getInputsArgListParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_inputs_4_0=ruleArgList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcedureDeclRule());
              					}
              					set(
              						current,
              						"inputs",
              						lv_inputs_4_0,
              						"uclid.xtext.Uclid.ArgList");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getProcedureDeclAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalUclid.g:1670:3: ( (lv_ret_6_0= ruleProcReturnArgRule ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==36) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalUclid.g:1671:4: (lv_ret_6_0= ruleProcReturnArgRule )
                    {
                    // InternalUclid.g:1671:4: (lv_ret_6_0= ruleProcReturnArgRule )
                    // InternalUclid.g:1672:5: lv_ret_6_0= ruleProcReturnArgRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProcedureDeclAccess().getRetProcReturnArgRuleParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_23);
                    lv_ret_6_0=ruleProcReturnArgRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProcedureDeclRule());
                      					}
                      					set(
                      						current,
                      						"ret",
                      						lv_ret_6_0,
                      						"uclid.xtext.Uclid.ProcReturnArgRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalUclid.g:1689:3: ( (lv_req_7_0= ruleRequireExprsRule ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalUclid.g:1690:4: (lv_req_7_0= ruleRequireExprsRule )
            	    {
            	    // InternalUclid.g:1690:4: (lv_req_7_0= ruleRequireExprsRule )
            	    // InternalUclid.g:1691:5: lv_req_7_0= ruleRequireExprsRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureDeclAccess().getReqRequireExprsRuleParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_req_7_0=ruleRequireExprsRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProcedureDeclRule());
            	      					}
            	      					add(
            	      						current,
            	      						"req",
            	      						lv_req_7_0,
            	      						"uclid.xtext.Uclid.RequireExprsRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalUclid.g:1708:3: ( (lv_ensure_8_0= ruleEnsureExprsRule ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==38) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalUclid.g:1709:4: (lv_ensure_8_0= ruleEnsureExprsRule )
            	    {
            	    // InternalUclid.g:1709:4: (lv_ensure_8_0= ruleEnsureExprsRule )
            	    // InternalUclid.g:1710:5: lv_ensure_8_0= ruleEnsureExprsRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureDeclAccess().getEnsureEnsureExprsRuleParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_ensure_8_0=ruleEnsureExprsRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProcedureDeclRule());
            	      					}
            	      					add(
            	      						current,
            	      						"ensure",
            	      						lv_ensure_8_0,
            	      						"uclid.xtext.Uclid.EnsureExprsRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // InternalUclid.g:1727:3: ( (lv_modifies_9_0= ruleModifiesExprsRule ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalUclid.g:1728:4: (lv_modifies_9_0= ruleModifiesExprsRule )
            	    {
            	    // InternalUclid.g:1728:4: (lv_modifies_9_0= ruleModifiesExprsRule )
            	    // InternalUclid.g:1729:5: lv_modifies_9_0= ruleModifiesExprsRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureDeclAccess().getModifiesModifiesExprsRuleParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_modifies_9_0=ruleModifiesExprsRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getProcedureDeclRule());
            	      					}
            	      					add(
            	      						current,
            	      						"modifies",
            	      						lv_modifies_9_0,
            	      						"uclid.xtext.Uclid.ModifiesExprsRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // InternalUclid.g:1746:3: ( (lv_body_10_0= ruleBlkStmtRule ) )
            // InternalUclid.g:1747:4: (lv_body_10_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:1747:4: (lv_body_10_0= ruleBlkStmtRule )
            // InternalUclid.g:1748:5: lv_body_10_0= ruleBlkStmtRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcedureDeclAccess().getBodyBlkStmtRuleParserRuleCall_10_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_10_0=ruleBlkStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcedureDeclRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_10_0,
              						"uclid.xtext.Uclid.BlkStmtRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcedureDecl"


    // $ANTLR start "entryRuleProcReturnArgRule"
    // InternalUclid.g:1769:1: entryRuleProcReturnArgRule returns [EObject current=null] : iv_ruleProcReturnArgRule= ruleProcReturnArgRule EOF ;
    public final EObject entryRuleProcReturnArgRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcReturnArgRule = null;


        try {
            // InternalUclid.g:1769:58: (iv_ruleProcReturnArgRule= ruleProcReturnArgRule EOF )
            // InternalUclid.g:1770:2: iv_ruleProcReturnArgRule= ruleProcReturnArgRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcReturnArgRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcReturnArgRule=ruleProcReturnArgRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcReturnArgRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcReturnArgRule"


    // $ANTLR start "ruleProcReturnArgRule"
    // InternalUclid.g:1776:1: ruleProcReturnArgRule returns [EObject current=null] : (otherlv_0= 'returns' otherlv_1= '(' ( (lv_output_2_0= ruleArgList ) )? otherlv_3= ')' ) ;
    public final EObject ruleProcReturnArgRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_output_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1782:2: ( (otherlv_0= 'returns' otherlv_1= '(' ( (lv_output_2_0= ruleArgList ) )? otherlv_3= ')' ) )
            // InternalUclid.g:1783:2: (otherlv_0= 'returns' otherlv_1= '(' ( (lv_output_2_0= ruleArgList ) )? otherlv_3= ')' )
            {
            // InternalUclid.g:1783:2: (otherlv_0= 'returns' otherlv_1= '(' ( (lv_output_2_0= ruleArgList ) )? otherlv_3= ')' )
            // InternalUclid.g:1784:3: otherlv_0= 'returns' otherlv_1= '(' ( (lv_output_2_0= ruleArgList ) )? otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcReturnArgRuleAccess().getReturnsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProcReturnArgRuleAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:1792:3: ( (lv_output_2_0= ruleArgList ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==32) ) {
                int LA23_2 = input.LA(2);

                if ( (synpred35_InternalUclid()) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalUclid.g:1793:4: (lv_output_2_0= ruleArgList )
                    {
                    // InternalUclid.g:1793:4: (lv_output_2_0= ruleArgList )
                    // InternalUclid.g:1794:5: lv_output_2_0= ruleArgList
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProcReturnArgRuleAccess().getOutputArgListParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_output_2_0=ruleArgList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProcReturnArgRuleRule());
                      					}
                      					set(
                      						current,
                      						"output",
                      						lv_output_2_0,
                      						"uclid.xtext.Uclid.ArgList");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProcReturnArgRuleAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcReturnArgRule"


    // $ANTLR start "entryRuleRequireExprsRule"
    // InternalUclid.g:1819:1: entryRuleRequireExprsRule returns [EObject current=null] : iv_ruleRequireExprsRule= ruleRequireExprsRule EOF ;
    public final EObject entryRuleRequireExprsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireExprsRule = null;


        try {
            // InternalUclid.g:1819:57: (iv_ruleRequireExprsRule= ruleRequireExprsRule EOF )
            // InternalUclid.g:1820:2: iv_ruleRequireExprsRule= ruleRequireExprsRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequireExprsRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequireExprsRule=ruleRequireExprsRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequireExprsRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequireExprsRule"


    // $ANTLR start "ruleRequireExprsRule"
    // InternalUclid.g:1826:1: ruleRequireExprsRule returns [EObject current=null] : (otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' ) ;
    public final EObject ruleRequireExprsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1832:2: ( (otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' ) )
            // InternalUclid.g:1833:2: (otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' )
            {
            // InternalUclid.g:1833:2: (otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' )
            // InternalUclid.g:1834:3: otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRequireExprsRuleAccess().getRequiresKeyword_0());
              		
            }
            // InternalUclid.g:1838:3: ( (lv_e_1_0= ruleExprRule ) )
            // InternalUclid.g:1839:4: (lv_e_1_0= ruleExprRule )
            {
            // InternalUclid.g:1839:4: (lv_e_1_0= ruleExprRule )
            // InternalUclid.g:1840:5: lv_e_1_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRequireExprsRuleAccess().getEExprRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_e_1_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRequireExprsRuleRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_1_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRequireExprsRuleAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequireExprsRule"


    // $ANTLR start "entryRuleEnsureExprsRule"
    // InternalUclid.g:1865:1: entryRuleEnsureExprsRule returns [EObject current=null] : iv_ruleEnsureExprsRule= ruleEnsureExprsRule EOF ;
    public final EObject entryRuleEnsureExprsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsureExprsRule = null;


        try {
            // InternalUclid.g:1865:56: (iv_ruleEnsureExprsRule= ruleEnsureExprsRule EOF )
            // InternalUclid.g:1866:2: iv_ruleEnsureExprsRule= ruleEnsureExprsRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnsureExprsRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnsureExprsRule=ruleEnsureExprsRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnsureExprsRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnsureExprsRule"


    // $ANTLR start "ruleEnsureExprsRule"
    // InternalUclid.g:1872:1: ruleEnsureExprsRule returns [EObject current=null] : (otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' ) ;
    public final EObject ruleEnsureExprsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1878:2: ( (otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' ) )
            // InternalUclid.g:1879:2: (otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' )
            {
            // InternalUclid.g:1879:2: (otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' )
            // InternalUclid.g:1880:3: otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnsureExprsRuleAccess().getEnsuresKeyword_0());
              		
            }
            // InternalUclid.g:1884:3: ( (lv_e_1_0= ruleExprRule ) )
            // InternalUclid.g:1885:4: (lv_e_1_0= ruleExprRule )
            {
            // InternalUclid.g:1885:4: (lv_e_1_0= ruleExprRule )
            // InternalUclid.g:1886:5: lv_e_1_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnsureExprsRuleAccess().getEExprRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_e_1_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnsureExprsRuleRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_1_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnsureExprsRuleAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnsureExprsRule"


    // $ANTLR start "entryRuleModifiesExprsRule"
    // InternalUclid.g:1911:1: entryRuleModifiesExprsRule returns [EObject current=null] : iv_ruleModifiesExprsRule= ruleModifiesExprsRule EOF ;
    public final EObject entryRuleModifiesExprsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiesExprsRule = null;


        try {
            // InternalUclid.g:1911:58: (iv_ruleModifiesExprsRule= ruleModifiesExprsRule EOF )
            // InternalUclid.g:1912:2: iv_ruleModifiesExprsRule= ruleModifiesExprsRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifiesExprsRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModifiesExprsRule=ruleModifiesExprsRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifiesExprsRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifiesExprsRule"


    // $ANTLR start "ruleModifiesExprsRule"
    // InternalUclid.g:1918:1: ruleModifiesExprsRule returns [EObject current=null] : (otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';' ) ;
    public final EObject ruleModifiesExprsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_l_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1924:2: ( (otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';' ) )
            // InternalUclid.g:1925:2: (otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';' )
            {
            // InternalUclid.g:1925:2: (otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';' )
            // InternalUclid.g:1926:3: otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifiesExprsRuleAccess().getModifiesKeyword_0());
              		
            }
            // InternalUclid.g:1930:3: ( (lv_l_1_0= ruleIdListRule ) )
            // InternalUclid.g:1931:4: (lv_l_1_0= ruleIdListRule )
            {
            // InternalUclid.g:1931:4: (lv_l_1_0= ruleIdListRule )
            // InternalUclid.g:1932:5: lv_l_1_0= ruleIdListRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModifiesExprsRuleAccess().getLIdListRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_l_1_0=ruleIdListRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModifiesExprsRuleRule());
              					}
              					set(
              						current,
              						"l",
              						lv_l_1_0,
              						"uclid.xtext.Uclid.IdListRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModifiesExprsRuleAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifiesExprsRule"


    // $ANTLR start "entryRuleInstanceDeclRule"
    // InternalUclid.g:1957:1: entryRuleInstanceDeclRule returns [EObject current=null] : iv_ruleInstanceDeclRule= ruleInstanceDeclRule EOF ;
    public final EObject entryRuleInstanceDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceDeclRule = null;


        try {
            // InternalUclid.g:1957:57: (iv_ruleInstanceDeclRule= ruleInstanceDeclRule EOF )
            // InternalUclid.g:1958:2: iv_ruleInstanceDeclRule= ruleInstanceDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstanceDeclRule=ruleInstanceDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstanceDeclRule"


    // $ANTLR start "ruleInstanceDeclRule"
    // InternalUclid.g:1964:1: ruleInstanceDeclRule returns [EObject current=null] : (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';' ) ;
    public final EObject ruleInstanceDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1970:2: ( (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';' ) )
            // InternalUclid.g:1971:2: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';' )
            {
            // InternalUclid.g:1971:2: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';' )
            // InternalUclid.g:1972:3: otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInstanceDeclRuleAccess().getInstanceKeyword_0());
              		
            }
            // InternalUclid.g:1976:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUclid.g:1977:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUclid.g:1977:4: (lv_name_1_0= RULE_ID )
            // InternalUclid.g:1978:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getInstanceDeclRuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceDeclRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInstanceDeclRuleAccess().getColonKeyword_2());
              		
            }
            // InternalUclid.g:1998:3: ( ( ruleFQN ) )
            // InternalUclid.g:1999:4: ( ruleFQN )
            {
            // InternalUclid.g:1999:4: ( ruleFQN )
            // InternalUclid.g:2000:5: ruleFQN
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getInstanceDeclRuleRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInstanceDeclRuleAccess().getModuleModuleCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:2017:3: ( (lv_args_4_0= ruleArgMapListRule ) )
            // InternalUclid.g:2018:4: (lv_args_4_0= ruleArgMapListRule )
            {
            // InternalUclid.g:2018:4: (lv_args_4_0= ruleArgMapListRule )
            // InternalUclid.g:2019:5: lv_args_4_0= ruleArgMapListRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInstanceDeclRuleAccess().getArgsArgMapListRuleParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_args_4_0=ruleArgMapListRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInstanceDeclRuleRule());
              					}
              					add(
              						current,
              						"args",
              						lv_args_4_0,
              						"uclid.xtext.Uclid.ArgMapListRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getInstanceDeclRuleAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstanceDeclRule"


    // $ANTLR start "entryRuleArgMapListRule"
    // InternalUclid.g:2044:1: entryRuleArgMapListRule returns [EObject current=null] : iv_ruleArgMapListRule= ruleArgMapListRule EOF ;
    public final EObject entryRuleArgMapListRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgMapListRule = null;


        try {
            // InternalUclid.g:2044:55: (iv_ruleArgMapListRule= ruleArgMapListRule EOF )
            // InternalUclid.g:2045:2: iv_ruleArgMapListRule= ruleArgMapListRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgMapListRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgMapListRule=ruleArgMapListRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgMapListRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgMapListRule"


    // $ANTLR start "ruleArgMapListRule"
    // InternalUclid.g:2051:1: ruleArgMapListRule returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleArgMapListRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_2_0 = null;

        EObject lv_arg_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2057:2: ( ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')' ) )
            // InternalUclid.g:2058:2: ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')' )
            {
            // InternalUclid.g:2058:2: ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')' )
            // InternalUclid.g:2059:3: () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')'
            {
            // InternalUclid.g:2059:3: ()
            // InternalUclid.g:2060:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArgMapListRuleAccess().getArgMapListRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArgMapListRuleAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:2073:3: ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalUclid.g:2074:4: ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )*
                    {
                    // InternalUclid.g:2074:4: ( (lv_arg_2_0= ruleArgMapRule ) )
                    // InternalUclid.g:2075:5: (lv_arg_2_0= ruleArgMapRule )
                    {
                    // InternalUclid.g:2075:5: (lv_arg_2_0= ruleArgMapRule )
                    // InternalUclid.g:2076:6: lv_arg_2_0= ruleArgMapRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArgMapListRuleAccess().getArgArgMapRuleParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
                    lv_arg_2_0=ruleArgMapRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getArgMapListRuleRule());
                      						}
                      						add(
                      							current,
                      							"arg",
                      							lv_arg_2_0,
                      							"uclid.xtext.Uclid.ArgMapRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:2093:4: (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==24) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalUclid.g:2094:5: otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArgMapListRuleAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUclid.g:2098:5: ( (lv_arg_4_0= ruleArgMapRule ) )
                    	    // InternalUclid.g:2099:6: (lv_arg_4_0= ruleArgMapRule )
                    	    {
                    	    // InternalUclid.g:2099:6: (lv_arg_4_0= ruleArgMapRule )
                    	    // InternalUclid.g:2100:7: lv_arg_4_0= ruleArgMapRule
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArgMapListRuleAccess().getArgArgMapRuleParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_24);
                    	    lv_arg_4_0=ruleArgMapRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getArgMapListRuleRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"arg",
                    	      								lv_arg_4_0,
                    	      								"uclid.xtext.Uclid.ArgMapRule");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArgMapListRuleAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgMapListRule"


    // $ANTLR start "entryRuleArgMapRule"
    // InternalUclid.g:2127:1: entryRuleArgMapRule returns [EObject current=null] : iv_ruleArgMapRule= ruleArgMapRule EOF ;
    public final EObject entryRuleArgMapRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgMapRule = null;


        try {
            // InternalUclid.g:2127:51: (iv_ruleArgMapRule= ruleArgMapRule EOF )
            // InternalUclid.g:2128:2: iv_ruleArgMapRule= ruleArgMapRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgMapRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgMapRule=ruleArgMapRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgMapRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgMapRule"


    // $ANTLR start "ruleArgMapRule"
    // InternalUclid.g:2134:1: ruleArgMapRule returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')' ) ;
    public final EObject ruleArgMapRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_e_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2140:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')' ) )
            // InternalUclid.g:2141:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')' )
            {
            // InternalUclid.g:2141:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')' )
            // InternalUclid.g:2142:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')'
            {
            // InternalUclid.g:2142:3: ()
            // InternalUclid.g:2143:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArgMapRuleAccess().getArgMapRuleAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:2152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUclid.g:2153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUclid.g:2153:4: (lv_name_1_0= RULE_ID )
            // InternalUclid.g:2154:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getArgMapRuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArgMapRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArgMapRuleAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArgMapRuleAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalUclid.g:2178:3: ( (lv_e_4_0= ruleExprRule ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)||LA26_0==RULE_STRING||LA26_0==17||LA26_0==28||LA26_0==31||LA26_0==55||(LA26_0>=64 && LA26_0<=65)||(LA26_0>=74 && LA26_0<=76)||(LA26_0>=80 && LA26_0<=81)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalUclid.g:2179:4: (lv_e_4_0= ruleExprRule )
                    {
                    // InternalUclid.g:2179:4: (lv_e_4_0= ruleExprRule )
                    // InternalUclid.g:2180:5: lv_e_4_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getArgMapRuleAccess().getEExprRuleParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_e_4_0=ruleExprRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getArgMapRuleRule());
                      					}
                      					add(
                      						current,
                      						"e",
                      						lv_e_4_0,
                      						"uclid.xtext.Uclid.ExprRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArgMapRuleAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgMapRule"


    // $ANTLR start "entryRuleAxiomDeclRule"
    // InternalUclid.g:2205:1: entryRuleAxiomDeclRule returns [EObject current=null] : iv_ruleAxiomDeclRule= ruleAxiomDeclRule EOF ;
    public final EObject entryRuleAxiomDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiomDeclRule = null;


        try {
            // InternalUclid.g:2205:54: (iv_ruleAxiomDeclRule= ruleAxiomDeclRule EOF )
            // InternalUclid.g:2206:2: iv_ruleAxiomDeclRule= ruleAxiomDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAxiomDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAxiomDeclRule=ruleAxiomDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAxiomDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAxiomDeclRule"


    // $ANTLR start "ruleAxiomDeclRule"
    // InternalUclid.g:2212:1: ruleAxiomDeclRule returns [EObject current=null] : ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' ) ;
    public final EObject ruleAxiomDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_n_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_e_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2218:2: ( ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' ) )
            // InternalUclid.g:2219:2: ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' )
            {
            // InternalUclid.g:2219:2: ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' )
            // InternalUclid.g:2220:3: (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';'
            {
            // InternalUclid.g:2220:3: (otherlv_0= 'axiom' | otherlv_1= 'assume' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            else if ( (LA27_0==42) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalUclid.g:2221:4: otherlv_0= 'axiom'
                    {
                    otherlv_0=(Token)match(input,41,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getAxiomDeclRuleAccess().getAxiomKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:2226:4: otherlv_1= 'assume'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getAxiomDeclRuleAccess().getAssumeKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:2231:3: ( ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==25) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalUclid.g:2232:4: ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // InternalUclid.g:2232:4: ( (lv_n_2_0= RULE_ID ) )
                    // InternalUclid.g:2233:5: (lv_n_2_0= RULE_ID )
                    {
                    // InternalUclid.g:2233:5: (lv_n_2_0= RULE_ID )
                    // InternalUclid.g:2234:6: lv_n_2_0= RULE_ID
                    {
                    lv_n_2_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_n_2_0, grammarAccess.getAxiomDeclRuleAccess().getNIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAxiomDeclRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"n",
                      							lv_n_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAxiomDeclRuleAccess().getColonKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:2255:3: ( (lv_e_4_0= ruleExprRule ) )
            // InternalUclid.g:2256:4: (lv_e_4_0= ruleExprRule )
            {
            // InternalUclid.g:2256:4: (lv_e_4_0= ruleExprRule )
            // InternalUclid.g:2257:5: lv_e_4_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAxiomDeclRuleAccess().getEExprRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_e_4_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAxiomDeclRuleRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_4_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getAxiomDeclRuleAccess().getSemicolonKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAxiomDeclRule"


    // $ANTLR start "entryRuleSpecDeclRule"
    // InternalUclid.g:2282:1: entryRuleSpecDeclRule returns [EObject current=null] : iv_ruleSpecDeclRule= ruleSpecDeclRule EOF ;
    public final EObject entryRuleSpecDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecDeclRule = null;


        try {
            // InternalUclid.g:2282:53: (iv_ruleSpecDeclRule= ruleSpecDeclRule EOF )
            // InternalUclid.g:2283:2: iv_ruleSpecDeclRule= ruleSpecDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecDeclRule=ruleSpecDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecDeclRule"


    // $ANTLR start "ruleSpecDeclRule"
    // InternalUclid.g:2289:1: ruleSpecDeclRule returns [EObject current=null] : (this_PropertyRule_0= rulePropertyRule | this_InvariantRule_1= ruleInvariantRule ) ;
    public final EObject ruleSpecDeclRule() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyRule_0 = null;

        EObject this_InvariantRule_1 = null;



        	enterRule();

        try {
            // InternalUclid.g:2295:2: ( (this_PropertyRule_0= rulePropertyRule | this_InvariantRule_1= ruleInvariantRule ) )
            // InternalUclid.g:2296:2: (this_PropertyRule_0= rulePropertyRule | this_InvariantRule_1= ruleInvariantRule )
            {
            // InternalUclid.g:2296:2: (this_PropertyRule_0= rulePropertyRule | this_InvariantRule_1= ruleInvariantRule )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            else if ( (LA29_0==48) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalUclid.g:2297:3: this_PropertyRule_0= rulePropertyRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSpecDeclRuleAccess().getPropertyRuleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertyRule_0=rulePropertyRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyRule_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:2309:3: this_InvariantRule_1= ruleInvariantRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSpecDeclRuleAccess().getInvariantRuleParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_InvariantRule_1=ruleInvariantRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_InvariantRule_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecDeclRule"


    // $ANTLR start "entryRulePropertyRule"
    // InternalUclid.g:2324:1: entryRulePropertyRule returns [EObject current=null] : iv_rulePropertyRule= rulePropertyRule EOF ;
    public final EObject entryRulePropertyRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyRule = null;


        try {
            // InternalUclid.g:2324:53: (iv_rulePropertyRule= rulePropertyRule EOF )
            // InternalUclid.g:2325:2: iv_rulePropertyRule= rulePropertyRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyRule=rulePropertyRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyRule"


    // $ANTLR start "rulePropertyRule"
    // InternalUclid.g:2331:1: rulePropertyRule returns [EObject current=null] : (otherlv_0= 'property' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';' ) ;
    public final EObject rulePropertyRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_e_7_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2337:2: ( (otherlv_0= 'property' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';' ) )
            // InternalUclid.g:2338:2: (otherlv_0= 'property' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';' )
            {
            // InternalUclid.g:2338:2: (otherlv_0= 'property' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';' )
            // InternalUclid.g:2339:3: otherlv_0= 'property' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getPropertyRuleAccess().getPropertyKeyword_0());
              		
            }
            // InternalUclid.g:2343:3: (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalUclid.g:2344:4: otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPropertyRuleAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:2348:4: (otherlv_2= 'LTL' | otherlv_3= 'CTL' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==45) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==46) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalUclid.g:2349:5: otherlv_2= 'LTL'
                            {
                            otherlv_2=(Token)match(input,45,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getPropertyRuleAccess().getLTLKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalUclid.g:2354:5: otherlv_3= 'CTL'
                            {
                            otherlv_3=(Token)match(input,46,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getPropertyRuleAccess().getCTLKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,47,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getPropertyRuleAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:2364:3: ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==25) ) {
                    alt32=1;
                }
            }
            switch (alt32) {
                case 1 :
                    // InternalUclid.g:2365:4: ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':'
                    {
                    // InternalUclid.g:2365:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalUclid.g:2366:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalUclid.g:2366:5: (lv_name_5_0= RULE_ID )
                    // InternalUclid.g:2367:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_5_0, grammarAccess.getPropertyRuleAccess().getNameIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getPropertyRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_5_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPropertyRuleAccess().getColonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:2388:3: ( (lv_e_7_0= ruleExprRule ) )
            // InternalUclid.g:2389:4: (lv_e_7_0= ruleExprRule )
            {
            // InternalUclid.g:2389:4: (lv_e_7_0= ruleExprRule )
            // InternalUclid.g:2390:5: lv_e_7_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPropertyRuleAccess().getEExprRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_e_7_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPropertyRuleRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_7_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getPropertyRuleAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyRule"


    // $ANTLR start "entryRuleInvariantRule"
    // InternalUclid.g:2415:1: entryRuleInvariantRule returns [EObject current=null] : iv_ruleInvariantRule= ruleInvariantRule EOF ;
    public final EObject entryRuleInvariantRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantRule = null;


        try {
            // InternalUclid.g:2415:54: (iv_ruleInvariantRule= ruleInvariantRule EOF )
            // InternalUclid.g:2416:2: iv_ruleInvariantRule= ruleInvariantRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvariantRule=ruleInvariantRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariantRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariantRule"


    // $ANTLR start "ruleInvariantRule"
    // InternalUclid.g:2422:1: ruleInvariantRule returns [EObject current=null] : (otherlv_0= 'invariant' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';' ) ;
    public final EObject ruleInvariantRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_e_7_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2428:2: ( (otherlv_0= 'invariant' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';' ) )
            // InternalUclid.g:2429:2: (otherlv_0= 'invariant' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';' )
            {
            // InternalUclid.g:2429:2: (otherlv_0= 'invariant' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';' )
            // InternalUclid.g:2430:3: otherlv_0= 'invariant' (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )? ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )? ( (lv_e_7_0= ruleExprRule ) ) otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInvariantRuleAccess().getInvariantKeyword_0());
              		
            }
            // InternalUclid.g:2434:3: (otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalUclid.g:2435:4: otherlv_1= '[' (otherlv_2= 'LTL' | otherlv_3= 'CTL' ) otherlv_4= ']'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInvariantRuleAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:2439:4: (otherlv_2= 'LTL' | otherlv_3= 'CTL' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==45) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==46) ) {
                        alt33=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalUclid.g:2440:5: otherlv_2= 'LTL'
                            {
                            otherlv_2=(Token)match(input,45,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getInvariantRuleAccess().getLTLKeyword_1_1_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalUclid.g:2445:5: otherlv_3= 'CTL'
                            {
                            otherlv_3=(Token)match(input,46,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getInvariantRuleAccess().getCTLKeyword_1_1_1());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,47,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getInvariantRuleAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:2455:3: ( ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==25) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // InternalUclid.g:2456:4: ( (lv_name_5_0= RULE_ID ) ) otherlv_6= ':'
                    {
                    // InternalUclid.g:2456:4: ( (lv_name_5_0= RULE_ID ) )
                    // InternalUclid.g:2457:5: (lv_name_5_0= RULE_ID )
                    {
                    // InternalUclid.g:2457:5: (lv_name_5_0= RULE_ID )
                    // InternalUclid.g:2458:6: lv_name_5_0= RULE_ID
                    {
                    lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_5_0, grammarAccess.getInvariantRuleAccess().getNameIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getInvariantRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_5_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getInvariantRuleAccess().getColonKeyword_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:2479:3: ( (lv_e_7_0= ruleExprRule ) )
            // InternalUclid.g:2480:4: (lv_e_7_0= ruleExprRule )
            {
            // InternalUclid.g:2480:4: (lv_e_7_0= ruleExprRule )
            // InternalUclid.g:2481:5: lv_e_7_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvariantRuleAccess().getEExprRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_e_7_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvariantRuleRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_7_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getInvariantRuleAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariantRule"


    // $ANTLR start "entryRuleInitDeclRule"
    // InternalUclid.g:2506:1: entryRuleInitDeclRule returns [EObject current=null] : iv_ruleInitDeclRule= ruleInitDeclRule EOF ;
    public final EObject entryRuleInitDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitDeclRule = null;


        try {
            // InternalUclid.g:2506:53: (iv_ruleInitDeclRule= ruleInitDeclRule EOF )
            // InternalUclid.g:2507:2: iv_ruleInitDeclRule= ruleInitDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitDeclRule=ruleInitDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitDeclRule"


    // $ANTLR start "ruleInitDeclRule"
    // InternalUclid.g:2513:1: ruleInitDeclRule returns [EObject current=null] : (otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleInitDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2519:2: ( (otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:2520:2: (otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:2520:2: (otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:2521:3: otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitDeclRuleAccess().getInitKeyword_0());
              		
            }
            // InternalUclid.g:2525:3: ( (lv_body_1_0= ruleBlkStmtRule ) )
            // InternalUclid.g:2526:4: (lv_body_1_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:2526:4: (lv_body_1_0= ruleBlkStmtRule )
            // InternalUclid.g:2527:5: lv_body_1_0= ruleBlkStmtRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInitDeclRuleAccess().getBodyBlkStmtRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleBlkStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInitDeclRuleRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_1_0,
              						"uclid.xtext.Uclid.BlkStmtRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitDeclRule"


    // $ANTLR start "entryRuleNextDeclRule"
    // InternalUclid.g:2548:1: entryRuleNextDeclRule returns [EObject current=null] : iv_ruleNextDeclRule= ruleNextDeclRule EOF ;
    public final EObject entryRuleNextDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextDeclRule = null;


        try {
            // InternalUclid.g:2548:53: (iv_ruleNextDeclRule= ruleNextDeclRule EOF )
            // InternalUclid.g:2549:2: iv_ruleNextDeclRule= ruleNextDeclRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNextDeclRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNextDeclRule=ruleNextDeclRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNextDeclRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNextDeclRule"


    // $ANTLR start "ruleNextDeclRule"
    // InternalUclid.g:2555:1: ruleNextDeclRule returns [EObject current=null] : (otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleNextDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2561:2: ( (otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:2562:2: (otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:2562:2: (otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:2563:3: otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNextDeclRuleAccess().getNextKeyword_0());
              		
            }
            // InternalUclid.g:2567:3: ( (lv_body_1_0= ruleBlkStmtRule ) )
            // InternalUclid.g:2568:4: (lv_body_1_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:2568:4: (lv_body_1_0= ruleBlkStmtRule )
            // InternalUclid.g:2569:5: lv_body_1_0= ruleBlkStmtRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNextDeclRuleAccess().getBodyBlkStmtRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_1_0=ruleBlkStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNextDeclRuleRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_1_0,
              						"uclid.xtext.Uclid.BlkStmtRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNextDeclRule"


    // $ANTLR start "entryRuleStatementRule"
    // InternalUclid.g:2590:1: entryRuleStatementRule returns [EObject current=null] : iv_ruleStatementRule= ruleStatementRule EOF ;
    public final EObject entryRuleStatementRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementRule = null;


        try {
            // InternalUclid.g:2590:54: (iv_ruleStatementRule= ruleStatementRule EOF )
            // InternalUclid.g:2591:2: iv_ruleStatementRule= ruleStatementRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatementRule=ruleStatementRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatementRule"


    // $ANTLR start "ruleStatementRule"
    // InternalUclid.g:2597:1: ruleStatementRule returns [EObject current=null] : ( ( () otherlv_1= 'skip' otherlv_2= ';' ) | (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' ) | (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' ) | (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' ) | (this_CallStatement_14= ruleCallStatement otherlv_15= ';' ) | (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' ) | ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? ) | ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? ) | ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? ) | ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? ) | ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? ) ) ;
    public final EObject ruleStatementRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_name_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_name_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        EObject lv_d_4_0 = null;

        EObject lv_d_7_0 = null;

        EObject this_AssignmentRule_12 = null;

        EObject this_CallStatement_14 = null;

        EObject lv_s_21_0 = null;

        EObject lv_s_23_0 = null;

        EObject lv_s_25_0 = null;

        EObject lv_s_27_0 = null;

        EObject lv_s_29_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2603:2: ( ( ( () otherlv_1= 'skip' otherlv_2= ';' ) | (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' ) | (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' ) | (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' ) | (this_CallStatement_14= ruleCallStatement otherlv_15= ';' ) | (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' ) | ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? ) | ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? ) | ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? ) | ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? ) | ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? ) ) )
            // InternalUclid.g:2604:2: ( ( () otherlv_1= 'skip' otherlv_2= ';' ) | (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' ) | (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' ) | (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' ) | (this_CallStatement_14= ruleCallStatement otherlv_15= ';' ) | (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' ) | ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? ) | ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? ) | ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? ) | ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? ) | ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? ) )
            {
            // InternalUclid.g:2604:2: ( ( () otherlv_1= 'skip' otherlv_2= ';' ) | (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' ) | (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' ) | (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' ) | (this_CallStatement_14= ruleCallStatement otherlv_15= ';' ) | (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' ) | ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? ) | ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? ) | ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? ) | ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? ) | ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? ) )
            int alt41=12;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt41=1;
                }
                break;
            case 52:
                {
                alt41=2;
                }
                break;
            case 42:
                {
                alt41=3;
                }
                break;
            case 53:
                {
                alt41=4;
                }
                break;
            case RULE_ID:
                {
                alt41=5;
                }
                break;
            case 54:
                {
                alt41=6;
                }
                break;
            case 50:
                {
                alt41=7;
                }
                break;
            case 55:
                {
                alt41=8;
                }
                break;
            case 57:
                {
                alt41=9;
                }
                break;
            case 60:
                {
                alt41=10;
                }
                break;
            case 63:
                {
                alt41=11;
                }
                break;
            case 17:
                {
                alt41=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalUclid.g:2605:3: ( () otherlv_1= 'skip' otherlv_2= ';' )
                    {
                    // InternalUclid.g:2605:3: ( () otherlv_1= 'skip' otherlv_2= ';' )
                    // InternalUclid.g:2606:4: () otherlv_1= 'skip' otherlv_2= ';'
                    {
                    // InternalUclid.g:2606:4: ()
                    // InternalUclid.g:2607:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getStatementRuleAccess().getStatementRuleAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,51,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementRuleAccess().getSkipKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:2626:3: (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' )
                    {
                    // InternalUclid.g:2626:3: (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' )
                    // InternalUclid.g:2627:4: otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,52,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStatementRuleAccess().getAssertKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:2631:4: ( (lv_d_4_0= ruleExprRule ) )
                    // InternalUclid.g:2632:5: (lv_d_4_0= ruleExprRule )
                    {
                    // InternalUclid.g:2632:5: (lv_d_4_0= ruleExprRule )
                    // InternalUclid.g:2633:6: lv_d_4_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getDExprRuleParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_d_4_0=ruleExprRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRuleRule());
                      						}
                      						set(
                      							current,
                      							"d",
                      							lv_d_4_0,
                      							"uclid.xtext.Uclid.ExprRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUclid.g:2656:3: (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' )
                    {
                    // InternalUclid.g:2656:3: (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' )
                    // InternalUclid.g:2657:4: otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,42,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStatementRuleAccess().getAssumeKeyword_2_0());
                      			
                    }
                    // InternalUclid.g:2661:4: ( (lv_d_7_0= ruleExprRule ) )
                    // InternalUclid.g:2662:5: (lv_d_7_0= ruleExprRule )
                    {
                    // InternalUclid.g:2662:5: (lv_d_7_0= ruleExprRule )
                    // InternalUclid.g:2663:6: lv_d_7_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getDExprRuleParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_d_7_0=ruleExprRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRuleRule());
                      						}
                      						set(
                      							current,
                      							"d",
                      							lv_d_7_0,
                      							"uclid.xtext.Uclid.ExprRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUclid.g:2686:3: (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalUclid.g:2686:3: (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' )
                    // InternalUclid.g:2687:4: otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,53,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getStatementRuleAccess().getHavocKeyword_3_0());
                      			
                    }
                    // InternalUclid.g:2691:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalUclid.g:2692:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalUclid.g:2692:5: (lv_name_10_0= RULE_ID )
                    // InternalUclid.g:2693:6: lv_name_10_0= RULE_ID
                    {
                    lv_name_10_0=(Token)match(input,RULE_ID,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_10_0, grammarAccess.getStatementRuleAccess().getNameIDTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStatementRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_10_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_3_2());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalUclid.g:2715:3: (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' )
                    {
                    // InternalUclid.g:2715:3: (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' )
                    // InternalUclid.g:2716:4: this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementRuleAccess().getAssignmentRuleParserRuleCall_4_0());
                      			
                    }
                    pushFollow(FOLLOW_12);
                    this_AssignmentRule_12=ruleAssignmentRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_AssignmentRule_12;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_13=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalUclid.g:2733:3: (this_CallStatement_14= ruleCallStatement otherlv_15= ';' )
                    {
                    // InternalUclid.g:2733:3: (this_CallStatement_14= ruleCallStatement otherlv_15= ';' )
                    // InternalUclid.g:2734:4: this_CallStatement_14= ruleCallStatement otherlv_15= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getStatementRuleAccess().getCallStatementParserRuleCall_5_0());
                      			
                    }
                    pushFollow(FOLLOW_12);
                    this_CallStatement_14=ruleCallStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_CallStatement_14;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_15=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalUclid.g:2751:3: (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' )
                    {
                    // InternalUclid.g:2751:3: (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' )
                    // InternalUclid.g:2752:4: otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';'
                    {
                    otherlv_16=(Token)match(input,50,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getStatementRuleAccess().getNextKeyword_6_0());
                      			
                    }
                    otherlv_17=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getStatementRuleAccess().getLeftParenthesisKeyword_6_1());
                      			
                    }
                    // InternalUclid.g:2760:4: ( (lv_name_18_0= RULE_ID ) )
                    // InternalUclid.g:2761:5: (lv_name_18_0= RULE_ID )
                    {
                    // InternalUclid.g:2761:5: (lv_name_18_0= RULE_ID )
                    // InternalUclid.g:2762:6: lv_name_18_0= RULE_ID
                    {
                    lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_18_0, grammarAccess.getStatementRuleAccess().getNameIDTerminalRuleCall_6_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getStatementRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_18_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_19=(Token)match(input,32,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getStatementRuleAccess().getRightParenthesisKeyword_6_3());
                      			
                    }
                    otherlv_20=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_6_4());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalUclid.g:2788:3: ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? )
                    {
                    // InternalUclid.g:2788:3: ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? )
                    // InternalUclid.g:2789:4: ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )?
                    {
                    // InternalUclid.g:2789:4: ( (lv_s_21_0= ruleIfStmtRule ) )
                    // InternalUclid.g:2790:5: (lv_s_21_0= ruleIfStmtRule )
                    {
                    // InternalUclid.g:2790:5: (lv_s_21_0= ruleIfStmtRule )
                    // InternalUclid.g:2791:6: lv_s_21_0= ruleIfStmtRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSIfStmtRuleParserRuleCall_7_0_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_s_21_0=ruleIfStmtRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRuleRule());
                      						}
                      						set(
                      							current,
                      							"s",
                      							lv_s_21_0,
                      							"uclid.xtext.Uclid.IfStmtRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:2808:4: (otherlv_22= ';' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==22) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalUclid.g:2809:5: otherlv_22= ';'
                            {
                            otherlv_22=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_22, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_7_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalUclid.g:2816:3: ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? )
                    {
                    // InternalUclid.g:2816:3: ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? )
                    // InternalUclid.g:2817:4: ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )?
                    {
                    // InternalUclid.g:2817:4: ( (lv_s_23_0= ruleCaseStmtRule ) )
                    // InternalUclid.g:2818:5: (lv_s_23_0= ruleCaseStmtRule )
                    {
                    // InternalUclid.g:2818:5: (lv_s_23_0= ruleCaseStmtRule )
                    // InternalUclid.g:2819:6: lv_s_23_0= ruleCaseStmtRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSCaseStmtRuleParserRuleCall_8_0_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_s_23_0=ruleCaseStmtRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRuleRule());
                      						}
                      						set(
                      							current,
                      							"s",
                      							lv_s_23_0,
                      							"uclid.xtext.Uclid.CaseStmtRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:2836:4: (otherlv_24= ';' )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==22) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalUclid.g:2837:5: otherlv_24= ';'
                            {
                            otherlv_24=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_24, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_8_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalUclid.g:2844:3: ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? )
                    {
                    // InternalUclid.g:2844:3: ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? )
                    // InternalUclid.g:2845:4: ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )?
                    {
                    // InternalUclid.g:2845:4: ( (lv_s_25_0= ruleForLoopRule ) )
                    // InternalUclid.g:2846:5: (lv_s_25_0= ruleForLoopRule )
                    {
                    // InternalUclid.g:2846:5: (lv_s_25_0= ruleForLoopRule )
                    // InternalUclid.g:2847:6: lv_s_25_0= ruleForLoopRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSForLoopRuleParserRuleCall_9_0_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_s_25_0=ruleForLoopRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRuleRule());
                      						}
                      						set(
                      							current,
                      							"s",
                      							lv_s_25_0,
                      							"uclid.xtext.Uclid.ForLoopRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:2864:4: (otherlv_26= ';' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==22) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalUclid.g:2865:5: otherlv_26= ';'
                            {
                            otherlv_26=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_26, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_9_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalUclid.g:2872:3: ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? )
                    {
                    // InternalUclid.g:2872:3: ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? )
                    // InternalUclid.g:2873:4: ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )?
                    {
                    // InternalUclid.g:2873:4: ( (lv_s_27_0= ruleWhileLoopRule ) )
                    // InternalUclid.g:2874:5: (lv_s_27_0= ruleWhileLoopRule )
                    {
                    // InternalUclid.g:2874:5: (lv_s_27_0= ruleWhileLoopRule )
                    // InternalUclid.g:2875:6: lv_s_27_0= ruleWhileLoopRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSWhileLoopRuleParserRuleCall_10_0_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_s_27_0=ruleWhileLoopRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRuleRule());
                      						}
                      						set(
                      							current,
                      							"s",
                      							lv_s_27_0,
                      							"uclid.xtext.Uclid.WhileLoopRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:2892:4: (otherlv_28= ';' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==22) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalUclid.g:2893:5: otherlv_28= ';'
                            {
                            otherlv_28=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_28, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_10_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalUclid.g:2900:3: ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? )
                    {
                    // InternalUclid.g:2900:3: ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? )
                    // InternalUclid.g:2901:4: ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )?
                    {
                    // InternalUclid.g:2901:4: ( (lv_s_29_0= ruleBlkStmtRule ) )
                    // InternalUclid.g:2902:5: (lv_s_29_0= ruleBlkStmtRule )
                    {
                    // InternalUclid.g:2902:5: (lv_s_29_0= ruleBlkStmtRule )
                    // InternalUclid.g:2903:6: lv_s_29_0= ruleBlkStmtRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSBlkStmtRuleParserRuleCall_11_0_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_s_29_0=ruleBlkStmtRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStatementRuleRule());
                      						}
                      						set(
                      							current,
                      							"s",
                      							lv_s_29_0,
                      							"uclid.xtext.Uclid.BlkStmtRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:2920:4: (otherlv_30= ';' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==22) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalUclid.g:2921:5: otherlv_30= ';'
                            {
                            otherlv_30=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_30, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_11_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatementRule"


    // $ANTLR start "entryRuleCallStatement"
    // InternalUclid.g:2931:1: entryRuleCallStatement returns [EObject current=null] : iv_ruleCallStatement= ruleCallStatement EOF ;
    public final EObject entryRuleCallStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallStatement = null;


        try {
            // InternalUclid.g:2931:54: (iv_ruleCallStatement= ruleCallStatement EOF )
            // InternalUclid.g:2932:2: iv_ruleCallStatement= ruleCallStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCallStatement=ruleCallStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallStatement"


    // $ANTLR start "ruleCallStatement"
    // InternalUclid.g:2938:1: ruleCallStatement returns [EObject current=null] : ( () (otherlv_1= 'call' (otherlv_2= '(' ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_target_8_0= ruleFunctionReference ) ) (otherlv_9= '(' ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )? )? otherlv_13= ')' ) ) ;
    public final EObject ruleCallStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_lhs_5_0 = null;

        AntlrDatatypeRuleToken lv_target_8_0 = null;

        EObject lv_exprs_10_0 = null;

        EObject lv_exprs_12_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2944:2: ( ( () (otherlv_1= 'call' (otherlv_2= '(' ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_target_8_0= ruleFunctionReference ) ) (otherlv_9= '(' ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )? )? otherlv_13= ')' ) ) )
            // InternalUclid.g:2945:2: ( () (otherlv_1= 'call' (otherlv_2= '(' ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_target_8_0= ruleFunctionReference ) ) (otherlv_9= '(' ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )? )? otherlv_13= ')' ) )
            {
            // InternalUclid.g:2945:2: ( () (otherlv_1= 'call' (otherlv_2= '(' ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_target_8_0= ruleFunctionReference ) ) (otherlv_9= '(' ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )? )? otherlv_13= ')' ) )
            // InternalUclid.g:2946:3: () (otherlv_1= 'call' (otherlv_2= '(' ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_target_8_0= ruleFunctionReference ) ) (otherlv_9= '(' ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )? )? otherlv_13= ')' )
            {
            // InternalUclid.g:2946:3: ()
            // InternalUclid.g:2947:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCallStatementAccess().getCallStatementAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:2956:3: (otherlv_1= 'call' (otherlv_2= '(' ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_target_8_0= ruleFunctionReference ) ) (otherlv_9= '(' ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )? )? otherlv_13= ')' )
            // InternalUclid.g:2957:4: otherlv_1= 'call' (otherlv_2= '(' ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_target_8_0= ruleFunctionReference ) ) (otherlv_9= '(' ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )? )? otherlv_13= ')'
            {
            otherlv_1=(Token)match(input,54,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_1, grammarAccess.getCallStatementAccess().getCallKeyword_1_0());
              			
            }
            // InternalUclid.g:2961:4: (otherlv_2= '(' ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )? otherlv_6= ')' otherlv_7= '=' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==31) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalUclid.g:2962:5: otherlv_2= '(' ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )? otherlv_6= ')' otherlv_7= '='
                    {
                    otherlv_2=(Token)match(input,31,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getCallStatementAccess().getLeftParenthesisKeyword_1_1_0());
                      				
                    }
                    // InternalUclid.g:2966:5: ( ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )* )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_ID) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalUclid.g:2967:6: ( (lv_lhs_3_0= ruleVarReference ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )*
                            {
                            // InternalUclid.g:2967:6: ( (lv_lhs_3_0= ruleVarReference ) )
                            // InternalUclid.g:2968:7: (lv_lhs_3_0= ruleVarReference )
                            {
                            // InternalUclid.g:2968:7: (lv_lhs_3_0= ruleVarReference )
                            // InternalUclid.g:2969:8: lv_lhs_3_0= ruleVarReference
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getCallStatementAccess().getLhsVarReferenceParserRuleCall_1_1_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_24);
                            lv_lhs_3_0=ruleVarReference();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getCallStatementRule());
                              								}
                              								add(
                              									current,
                              									"lhs",
                              									lv_lhs_3_0,
                              									"uclid.xtext.Uclid.VarReference");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalUclid.g:2986:6: (otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) ) )*
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==24) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // InternalUclid.g:2987:7: otherlv_4= ',' ( (lv_lhs_5_0= ruleVarReference ) )
                            	    {
                            	    otherlv_4=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getCallStatementAccess().getCommaKeyword_1_1_1_1_0());
                            	      						
                            	    }
                            	    // InternalUclid.g:2991:7: ( (lv_lhs_5_0= ruleVarReference ) )
                            	    // InternalUclid.g:2992:8: (lv_lhs_5_0= ruleVarReference )
                            	    {
                            	    // InternalUclid.g:2992:8: (lv_lhs_5_0= ruleVarReference )
                            	    // InternalUclid.g:2993:9: lv_lhs_5_0= ruleVarReference
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getCallStatementAccess().getLhsVarReferenceParserRuleCall_1_1_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_24);
                            	    lv_lhs_5_0=ruleVarReference();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getCallStatementRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"lhs",
                            	      										lv_lhs_5_0,
                            	      										"uclid.xtext.Uclid.VarReference");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop42;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,32,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getCallStatementAccess().getRightParenthesisKeyword_1_1_2());
                      				
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getCallStatementAccess().getEqualsSignKeyword_1_1_3());
                      				
                    }

                    }
                    break;

            }

            // InternalUclid.g:3021:4: ( (lv_target_8_0= ruleFunctionReference ) )
            // InternalUclid.g:3022:5: (lv_target_8_0= ruleFunctionReference )
            {
            // InternalUclid.g:3022:5: (lv_target_8_0= ruleFunctionReference )
            // InternalUclid.g:3023:6: lv_target_8_0= ruleFunctionReference
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getCallStatementAccess().getTargetFunctionReferenceParserRuleCall_1_2_0());
              					
            }
            pushFollow(FOLLOW_31);
            lv_target_8_0=ruleFunctionReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getCallStatementRule());
              						}
              						set(
              							current,
              							"target",
              							lv_target_8_0,
              							"uclid.xtext.Uclid.FunctionReference");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalUclid.g:3040:4: (otherlv_9= '(' ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )? )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==31) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUclid.g:3041:5: otherlv_9= '(' ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )?
                    {
                    otherlv_9=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getCallStatementAccess().getLeftParenthesisKeyword_1_3_0());
                      				
                    }
                    // InternalUclid.g:3045:5: ( ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=RULE_ID && LA46_0<=RULE_INT)||LA46_0==RULE_STRING||LA46_0==17||LA46_0==28||LA46_0==31||LA46_0==55||(LA46_0>=64 && LA46_0<=65)||(LA46_0>=74 && LA46_0<=76)||(LA46_0>=80 && LA46_0<=81)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalUclid.g:3046:6: ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )*
                            {
                            // InternalUclid.g:3046:6: ( (lv_exprs_10_0= ruleExprRule ) )
                            // InternalUclid.g:3047:7: (lv_exprs_10_0= ruleExprRule )
                            {
                            // InternalUclid.g:3047:7: (lv_exprs_10_0= ruleExprRule )
                            // InternalUclid.g:3048:8: lv_exprs_10_0= ruleExprRule
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getCallStatementAccess().getExprsExprRuleParserRuleCall_1_3_1_0_0());
                              							
                            }
                            pushFollow(FOLLOW_24);
                            lv_exprs_10_0=ruleExprRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getCallStatementRule());
                              								}
                              								add(
                              									current,
                              									"exprs",
                              									lv_exprs_10_0,
                              									"uclid.xtext.Uclid.ExprRule");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalUclid.g:3065:6: (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==24) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // InternalUclid.g:3066:7: otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) )
                            	    {
                            	    otherlv_11=(Token)match(input,24,FOLLOW_21); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_11, grammarAccess.getCallStatementAccess().getCommaKeyword_1_3_1_1_0());
                            	      						
                            	    }
                            	    // InternalUclid.g:3070:7: ( (lv_exprs_12_0= ruleExprRule ) )
                            	    // InternalUclid.g:3071:8: (lv_exprs_12_0= ruleExprRule )
                            	    {
                            	    // InternalUclid.g:3071:8: (lv_exprs_12_0= ruleExprRule )
                            	    // InternalUclid.g:3072:9: lv_exprs_12_0= ruleExprRule
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getCallStatementAccess().getExprsExprRuleParserRuleCall_1_3_1_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_24);
                            	    lv_exprs_12_0=ruleExprRule();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getCallStatementRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"exprs",
                            	      										lv_exprs_12_0,
                            	      										"uclid.xtext.Uclid.ExprRule");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_13, grammarAccess.getCallStatementAccess().getRightParenthesisKeyword_1_4());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallStatement"


    // $ANTLR start "entryRuleAssignmentRule"
    // InternalUclid.g:3101:1: entryRuleAssignmentRule returns [EObject current=null] : iv_ruleAssignmentRule= ruleAssignmentRule EOF ;
    public final EObject entryRuleAssignmentRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentRule = null;


        try {
            // InternalUclid.g:3101:55: (iv_ruleAssignmentRule= ruleAssignmentRule EOF )
            // InternalUclid.g:3102:2: iv_ruleAssignmentRule= ruleAssignmentRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssignmentRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentRule=ruleAssignmentRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssignmentRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignmentRule"


    // $ANTLR start "ruleAssignmentRule"
    // InternalUclid.g:3108:1: ruleAssignmentRule returns [EObject current=null] : ( () ( ( (lv_lhs_1_0= ruleVarReference ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleVarReference ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )* ) ;
    public final EObject ruleAssignmentRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lhs_1_0 = null;

        EObject lv_lhs_3_0 = null;

        EObject lv_exprs_5_0 = null;

        EObject lv_exprs_7_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3114:2: ( ( () ( ( (lv_lhs_1_0= ruleVarReference ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleVarReference ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )* ) )
            // InternalUclid.g:3115:2: ( () ( ( (lv_lhs_1_0= ruleVarReference ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleVarReference ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )* )
            {
            // InternalUclid.g:3115:2: ( () ( ( (lv_lhs_1_0= ruleVarReference ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleVarReference ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )* )
            // InternalUclid.g:3116:3: () ( ( (lv_lhs_1_0= ruleVarReference ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleVarReference ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )*
            {
            // InternalUclid.g:3116:3: ()
            // InternalUclid.g:3117:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAssignmentRuleAccess().getAssignmentAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:3126:3: ( ( (lv_lhs_1_0= ruleVarReference ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleVarReference ) )* )? )
            // InternalUclid.g:3127:4: ( (lv_lhs_1_0= ruleVarReference ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleVarReference ) )* )?
            {
            // InternalUclid.g:3127:4: ( (lv_lhs_1_0= ruleVarReference ) )
            // InternalUclid.g:3128:5: (lv_lhs_1_0= ruleVarReference )
            {
            // InternalUclid.g:3128:5: (lv_lhs_1_0= ruleVarReference )
            // InternalUclid.g:3129:6: lv_lhs_1_0= ruleVarReference
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getAssignmentRuleAccess().getLhsVarReferenceParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_32);
            lv_lhs_1_0=ruleVarReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElementForParent(grammarAccess.getAssignmentRuleRule());
              						}
              						add(
              							current,
              							"lhs",
              							lv_lhs_1_0,
              							"uclid.xtext.Uclid.VarReference");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalUclid.g:3146:4: (otherlv_2= ',' ( (lv_lhs_3_0= ruleVarReference ) )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==24) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalUclid.g:3147:5: otherlv_2= ',' ( (lv_lhs_3_0= ruleVarReference ) )*
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getAssignmentRuleAccess().getCommaKeyword_1_1_0());
                      				
                    }
                    // InternalUclid.g:3151:5: ( (lv_lhs_3_0= ruleVarReference ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==RULE_ID) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalUclid.g:3152:6: (lv_lhs_3_0= ruleVarReference )
                    	    {
                    	    // InternalUclid.g:3152:6: (lv_lhs_3_0= ruleVarReference )
                    	    // InternalUclid.g:3153:7: lv_lhs_3_0= ruleVarReference
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAssignmentRuleAccess().getLhsVarReferenceParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_33);
                    	    lv_lhs_3_0=ruleVarReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAssignmentRuleRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"lhs",
                    	      								lv_lhs_3_0,
                    	      								"uclid.xtext.Uclid.VarReference");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAssignmentRuleAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalUclid.g:3176:3: ( (lv_exprs_5_0= ruleExprRule ) )
            // InternalUclid.g:3177:4: (lv_exprs_5_0= ruleExprRule )
            {
            // InternalUclid.g:3177:4: (lv_exprs_5_0= ruleExprRule )
            // InternalUclid.g:3178:5: lv_exprs_5_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentRuleAccess().getExprsExprRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_exprs_5_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAssignmentRuleRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_5_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:3195:3: (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==24) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUclid.g:3196:4: otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) )
            	    {
            	    otherlv_6=(Token)match(input,24,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getAssignmentRuleAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalUclid.g:3200:4: ( (lv_exprs_7_0= ruleExprRule ) )
            	    // InternalUclid.g:3201:5: (lv_exprs_7_0= ruleExprRule )
            	    {
            	    // InternalUclid.g:3201:5: (lv_exprs_7_0= ruleExprRule )
            	    // InternalUclid.g:3202:6: lv_exprs_7_0= ruleExprRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAssignmentRuleAccess().getExprsExprRuleParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_exprs_7_0=ruleExprRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAssignmentRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_7_0,
            	      							"uclid.xtext.Uclid.ExprRule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignmentRule"


    // $ANTLR start "entryRuleBlkStmtRule"
    // InternalUclid.g:3224:1: entryRuleBlkStmtRule returns [EObject current=null] : iv_ruleBlkStmtRule= ruleBlkStmtRule EOF ;
    public final EObject entryRuleBlkStmtRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlkStmtRule = null;


        try {
            // InternalUclid.g:3224:52: (iv_ruleBlkStmtRule= ruleBlkStmtRule EOF )
            // InternalUclid.g:3225:2: iv_ruleBlkStmtRule= ruleBlkStmtRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlkStmtRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlkStmtRule=ruleBlkStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlkStmtRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlkStmtRule"


    // $ANTLR start "ruleBlkStmtRule"
    // InternalUclid.g:3231:1: ruleBlkStmtRule returns [EObject current=null] : (otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleBlkStmtRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_dec_2_0 = null;

        EObject lv_stmt_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3237:2: ( (otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}' ) )
            // InternalUclid.g:3238:2: (otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}' )
            {
            // InternalUclid.g:3238:2: (otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}' )
            // InternalUclid.g:3239:3: otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlkStmtRuleAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalUclid.g:3243:3: ()
            // InternalUclid.g:3244:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBlkStmtRuleAccess().getCompoundStatementAction_1(),
              					current);
              			
            }

            }

            // InternalUclid.g:3253:3: ( (lv_dec_2_0= ruleVarsDeclRule ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==27) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalUclid.g:3254:4: (lv_dec_2_0= ruleVarsDeclRule )
            	    {
            	    // InternalUclid.g:3254:4: (lv_dec_2_0= ruleVarsDeclRule )
            	    // InternalUclid.g:3255:5: lv_dec_2_0= ruleVarsDeclRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlkStmtRuleAccess().getDecVarsDeclRuleParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_34);
            	    lv_dec_2_0=ruleVarsDeclRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlkStmtRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"dec",
            	      						lv_dec_2_0,
            	      						"uclid.xtext.Uclid.VarsDeclRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalUclid.g:3272:3: ( (lv_stmt_3_0= ruleStatementRule ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID||LA52_0==17||LA52_0==42||(LA52_0>=50 && LA52_0<=55)||LA52_0==57||LA52_0==60||LA52_0==63) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalUclid.g:3273:4: (lv_stmt_3_0= ruleStatementRule )
            	    {
            	    // InternalUclid.g:3273:4: (lv_stmt_3_0= ruleStatementRule )
            	    // InternalUclid.g:3274:5: lv_stmt_3_0= ruleStatementRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlkStmtRuleAccess().getStmtStatementRuleParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_stmt_3_0=ruleStatementRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getBlkStmtRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"stmt",
            	      						lv_stmt_3_0,
            	      						"uclid.xtext.Uclid.StatementRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBlkStmtRuleAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlkStmtRule"


    // $ANTLR start "entryRuleIfStmtRule"
    // InternalUclid.g:3299:1: entryRuleIfStmtRule returns [EObject current=null] : iv_ruleIfStmtRule= ruleIfStmtRule EOF ;
    public final EObject entryRuleIfStmtRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmtRule = null;


        try {
            // InternalUclid.g:3299:51: (iv_ruleIfStmtRule= ruleIfStmtRule EOF )
            // InternalUclid.g:3300:2: iv_ruleIfStmtRule= ruleIfStmtRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStmtRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfStmtRule=ruleIfStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStmtRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfStmtRule"


    // $ANTLR start "ruleIfStmtRule"
    // InternalUclid.g:3306:1: ruleIfStmtRule returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )? ) ;
    public final EObject ruleIfStmtRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_c_2_0 = null;

        EObject lv_then_4_0 = null;

        EObject lv_else_6_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3312:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )? ) )
            // InternalUclid.g:3313:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )? )
            {
            // InternalUclid.g:3313:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )? )
            // InternalUclid.g:3314:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStmtRuleAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStmtRuleAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:3322:3: ( (lv_c_2_0= ruleExprRule ) )
            // InternalUclid.g:3323:4: (lv_c_2_0= ruleExprRule )
            {
            // InternalUclid.g:3323:4: (lv_c_2_0= ruleExprRule )
            // InternalUclid.g:3324:5: lv_c_2_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStmtRuleAccess().getCExprRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_c_2_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStmtRuleRule());
              					}
              					set(
              						current,
              						"c",
              						lv_c_2_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStmtRuleAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalUclid.g:3345:3: ( (lv_then_4_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3346:4: (lv_then_4_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3346:4: (lv_then_4_0= ruleBlkStmtRule )
            // InternalUclid.g:3347:5: lv_then_4_0= ruleBlkStmtRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStmtRuleAccess().getThenBlkStmtRuleParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_36);
            lv_then_4_0=ruleBlkStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfStmtRuleRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_4_0,
              						"uclid.xtext.Uclid.BlkStmtRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:3364:3: (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==56) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalUclid.g:3365:4: otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) )
                    {
                    otherlv_5=(Token)match(input,56,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getIfStmtRuleAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalUclid.g:3369:4: ( (lv_else_6_0= ruleBlkStmtRule ) )
                    // InternalUclid.g:3370:5: (lv_else_6_0= ruleBlkStmtRule )
                    {
                    // InternalUclid.g:3370:5: (lv_else_6_0= ruleBlkStmtRule )
                    // InternalUclid.g:3371:6: lv_else_6_0= ruleBlkStmtRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIfStmtRuleAccess().getElseBlkStmtRuleParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_6_0=ruleBlkStmtRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIfStmtRuleRule());
                      						}
                      						set(
                      							current,
                      							"else",
                      							lv_else_6_0,
                      							"uclid.xtext.Uclid.BlkStmtRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfStmtRule"


    // $ANTLR start "entryRuleCaseStmtRule"
    // InternalUclid.g:3393:1: entryRuleCaseStmtRule returns [EObject current=null] : iv_ruleCaseStmtRule= ruleCaseStmtRule EOF ;
    public final EObject entryRuleCaseStmtRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStmtRule = null;


        try {
            // InternalUclid.g:3393:53: (iv_ruleCaseStmtRule= ruleCaseStmtRule EOF )
            // InternalUclid.g:3394:2: iv_ruleCaseStmtRule= ruleCaseStmtRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseStmtRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseStmtRule=ruleCaseStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseStmtRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseStmtRule"


    // $ANTLR start "ruleCaseStmtRule"
    // InternalUclid.g:3400:1: ruleCaseStmtRule returns [EObject current=null] : ( () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac' ) ;
    public final EObject ruleCaseStmtRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cases_2_1 = null;

        EObject lv_cases_2_2 = null;



        	enterRule();

        try {
            // InternalUclid.g:3406:2: ( ( () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac' ) )
            // InternalUclid.g:3407:2: ( () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac' )
            {
            // InternalUclid.g:3407:2: ( () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac' )
            // InternalUclid.g:3408:3: () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac'
            {
            // InternalUclid.g:3408:3: ()
            // InternalUclid.g:3409:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCaseStmtRuleAccess().getCaseStmtRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCaseStmtRuleAccess().getCaseKeyword_1());
              		
            }
            // InternalUclid.g:3422:3: ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_INT)||LA55_0==RULE_STRING||LA55_0==17||LA55_0==28||LA55_0==31||LA55_0==55||LA55_0==59||(LA55_0>=64 && LA55_0<=65)||(LA55_0>=74 && LA55_0<=76)||(LA55_0>=80 && LA55_0<=81)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalUclid.g:3423:4: ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) )
            	    {
            	    // InternalUclid.g:3423:4: ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) )
            	    // InternalUclid.g:3424:5: (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule )
            	    {
            	    // InternalUclid.g:3424:5: (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule )
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_INT)||LA54_0==RULE_STRING||LA54_0==17||LA54_0==28||LA54_0==31||LA54_0==55||(LA54_0>=64 && LA54_0<=65)||(LA54_0>=74 && LA54_0<=76)||(LA54_0>=80 && LA54_0<=81)) ) {
            	        alt54=1;
            	    }
            	    else if ( (LA54_0==59) ) {
            	        alt54=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalUclid.g:3425:6: lv_cases_2_1= ruleCaseBlockRule
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getCaseStmtRuleAccess().getCasesCaseBlockRuleParserRuleCall_2_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_37);
            	            lv_cases_2_1=ruleCaseBlockRule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getCaseStmtRuleRule());
            	              						}
            	              						add(
            	              							current,
            	              							"cases",
            	              							lv_cases_2_1,
            	              							"uclid.xtext.Uclid.CaseBlockRule");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalUclid.g:3441:6: lv_cases_2_2= ruleDefaultCaseBlockRule
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getCaseStmtRuleAccess().getCasesDefaultCaseBlockRuleParserRuleCall_2_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_37);
            	            lv_cases_2_2=ruleDefaultCaseBlockRule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						if (current==null) {
            	              							current = createModelElementForParent(grammarAccess.getCaseStmtRuleRule());
            	              						}
            	              						add(
            	              							current,
            	              							"cases",
            	              							lv_cases_2_2,
            	              							"uclid.xtext.Uclid.DefaultCaseBlockRule");
            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_3=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getCaseStmtRuleAccess().getEsacKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseStmtRule"


    // $ANTLR start "entryRuleDefaultCaseBlockRule"
    // InternalUclid.g:3467:1: entryRuleDefaultCaseBlockRule returns [EObject current=null] : iv_ruleDefaultCaseBlockRule= ruleDefaultCaseBlockRule EOF ;
    public final EObject entryRuleDefaultCaseBlockRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultCaseBlockRule = null;


        try {
            // InternalUclid.g:3467:61: (iv_ruleDefaultCaseBlockRule= ruleDefaultCaseBlockRule EOF )
            // InternalUclid.g:3468:2: iv_ruleDefaultCaseBlockRule= ruleDefaultCaseBlockRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultCaseBlockRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDefaultCaseBlockRule=ruleDefaultCaseBlockRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultCaseBlockRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultCaseBlockRule"


    // $ANTLR start "ruleDefaultCaseBlockRule"
    // InternalUclid.g:3474:1: ruleDefaultCaseBlockRule returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleDefaultCaseBlockRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3480:2: ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:3481:2: (otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:3481:2: (otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:3482:3: otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultCaseBlockRuleAccess().getDefaultKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultCaseBlockRuleAccess().getColonKeyword_1());
              		
            }
            // InternalUclid.g:3490:3: ( (lv_body_2_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3491:4: (lv_body_2_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3491:4: (lv_body_2_0= ruleBlkStmtRule )
            // InternalUclid.g:3492:5: lv_body_2_0= ruleBlkStmtRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefaultCaseBlockRuleAccess().getBodyBlkStmtRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleBlkStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefaultCaseBlockRuleRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_2_0,
              						"uclid.xtext.Uclid.BlkStmtRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultCaseBlockRule"


    // $ANTLR start "entryRuleCaseBlockRule"
    // InternalUclid.g:3513:1: entryRuleCaseBlockRule returns [EObject current=null] : iv_ruleCaseBlockRule= ruleCaseBlockRule EOF ;
    public final EObject entryRuleCaseBlockRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseBlockRule = null;


        try {
            // InternalUclid.g:3513:54: (iv_ruleCaseBlockRule= ruleCaseBlockRule EOF )
            // InternalUclid.g:3514:2: iv_ruleCaseBlockRule= ruleCaseBlockRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseBlockRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCaseBlockRule=ruleCaseBlockRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseBlockRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseBlockRule"


    // $ANTLR start "ruleCaseBlockRule"
    // InternalUclid.g:3520:1: ruleCaseBlockRule returns [EObject current=null] : ( ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleCaseBlockRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3526:2: ( ( ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:3527:2: ( ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:3527:2: ( ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:3528:3: ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) )
            {
            // InternalUclid.g:3528:3: ( (lv_e_0_0= ruleExprRule ) )
            // InternalUclid.g:3529:4: (lv_e_0_0= ruleExprRule )
            {
            // InternalUclid.g:3529:4: (lv_e_0_0= ruleExprRule )
            // InternalUclid.g:3530:5: lv_e_0_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseBlockRuleAccess().getEExprRuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_20);
            lv_e_0_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseBlockRuleRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_0_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCaseBlockRuleAccess().getColonKeyword_1());
              		
            }
            // InternalUclid.g:3551:3: ( (lv_body_2_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3552:4: (lv_body_2_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3552:4: (lv_body_2_0= ruleBlkStmtRule )
            // InternalUclid.g:3553:5: lv_body_2_0= ruleBlkStmtRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseBlockRuleAccess().getBodyBlkStmtRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_2_0=ruleBlkStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseBlockRuleRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_2_0,
              						"uclid.xtext.Uclid.BlkStmtRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseBlockRule"


    // $ANTLR start "entryRuleForLoopRule"
    // InternalUclid.g:3574:1: entryRuleForLoopRule returns [EObject current=null] : iv_ruleForLoopRule= ruleForLoopRule EOF ;
    public final EObject entryRuleForLoopRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopRule = null;


        try {
            // InternalUclid.g:3574:52: (iv_ruleForLoopRule= ruleForLoopRule EOF )
            // InternalUclid.g:3575:2: iv_ruleForLoopRule= ruleForLoopRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForLoopRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleForLoopRule=ruleForLoopRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForLoopRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForLoopRule"


    // $ANTLR start "ruleForLoopRule"
    // InternalUclid.g:3581:1: ruleForLoopRule returns [EObject current=null] : (otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= ruleConstRule ) ) otherlv_6= ',' ( (lv_ub_7_0= ruleConstRule ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleForLoopRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_iterator_1_0 = null;

        EObject lv_lb_5_0 = null;

        EObject lv_ub_7_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3587:2: ( (otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= ruleConstRule ) ) otherlv_6= ',' ( (lv_ub_7_0= ruleConstRule ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:3588:2: (otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= ruleConstRule ) ) otherlv_6= ',' ( (lv_ub_7_0= ruleConstRule ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:3588:2: (otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= ruleConstRule ) ) otherlv_6= ',' ( (lv_ub_7_0= ruleConstRule ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:3589:3: otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= ruleConstRule ) ) otherlv_6= ',' ( (lv_ub_7_0= ruleConstRule ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForLoopRuleAccess().getForKeyword_0());
              		
            }
            // InternalUclid.g:3593:3: ( (lv_iterator_1_0= ruleVarDecl ) )
            // InternalUclid.g:3594:4: (lv_iterator_1_0= ruleVarDecl )
            {
            // InternalUclid.g:3594:4: (lv_iterator_1_0= ruleVarDecl )
            // InternalUclid.g:3595:5: lv_iterator_1_0= ruleVarDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopRuleAccess().getIteratorVarDeclParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_38);
            lv_iterator_1_0=ruleVarDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRuleRule());
              					}
              					set(
              						current,
              						"iterator",
              						lv_iterator_1_0,
              						"uclid.xtext.Uclid.VarDecl");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,61,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopRuleAccess().getInKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,62,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForLoopRuleAccess().getRangeKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,31,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForLoopRuleAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalUclid.g:3624:3: ( (lv_lb_5_0= ruleConstRule ) )
            // InternalUclid.g:3625:4: (lv_lb_5_0= ruleConstRule )
            {
            // InternalUclid.g:3625:4: (lv_lb_5_0= ruleConstRule )
            // InternalUclid.g:3626:5: lv_lb_5_0= ruleConstRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopRuleAccess().getLbConstRuleParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_41);
            lv_lb_5_0=ruleConstRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRuleRule());
              					}
              					set(
              						current,
              						"lb",
              						lv_lb_5_0,
              						"uclid.xtext.Uclid.ConstRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,24,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForLoopRuleAccess().getCommaKeyword_6());
              		
            }
            // InternalUclid.g:3647:3: ( (lv_ub_7_0= ruleConstRule ) )
            // InternalUclid.g:3648:4: (lv_ub_7_0= ruleConstRule )
            {
            // InternalUclid.g:3648:4: (lv_ub_7_0= ruleConstRule )
            // InternalUclid.g:3649:5: lv_ub_7_0= ruleConstRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopRuleAccess().getUbConstRuleParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_ub_7_0=ruleConstRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRuleRule());
              					}
              					set(
              						current,
              						"ub",
              						lv_ub_7_0,
              						"uclid.xtext.Uclid.ConstRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,32,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForLoopRuleAccess().getRightParenthesisKeyword_8());
              		
            }
            // InternalUclid.g:3670:3: ( (lv_body_9_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3671:4: (lv_body_9_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3671:4: (lv_body_9_0= ruleBlkStmtRule )
            // InternalUclid.g:3672:5: lv_body_9_0= ruleBlkStmtRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopRuleAccess().getBodyBlkStmtRuleParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_9_0=ruleBlkStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getForLoopRuleRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_9_0,
              						"uclid.xtext.Uclid.BlkStmtRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForLoopRule"


    // $ANTLR start "entryRuleWhileLoopRule"
    // InternalUclid.g:3693:1: entryRuleWhileLoopRule returns [EObject current=null] : iv_ruleWhileLoopRule= ruleWhileLoopRule EOF ;
    public final EObject entryRuleWhileLoopRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoopRule = null;


        try {
            // InternalUclid.g:3693:54: (iv_ruleWhileLoopRule= ruleWhileLoopRule EOF )
            // InternalUclid.g:3694:2: iv_ruleWhileLoopRule= ruleWhileLoopRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileLoopRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhileLoopRule=ruleWhileLoopRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhileLoopRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhileLoopRule"


    // $ANTLR start "ruleWhileLoopRule"
    // InternalUclid.g:3700:1: ruleWhileLoopRule returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleSpecDeclRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleWhileLoopRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_c_2_0 = null;

        EObject lv_inv_4_0 = null;

        EObject lv_stmt_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3706:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleSpecDeclRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:3707:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleSpecDeclRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:3707:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleSpecDeclRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:3708:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleSpecDeclRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopRuleAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileLoopRuleAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:3716:3: ( (lv_c_2_0= ruleExprRule ) )
            // InternalUclid.g:3717:4: (lv_c_2_0= ruleExprRule )
            {
            // InternalUclid.g:3717:4: (lv_c_2_0= ruleExprRule )
            // InternalUclid.g:3718:5: lv_c_2_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopRuleAccess().getCExprRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_c_2_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileLoopRuleRule());
              					}
              					set(
              						current,
              						"c",
              						lv_c_2_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileLoopRuleAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalUclid.g:3739:3: ( (lv_inv_4_0= ruleSpecDeclRule ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==43||LA56_0==48) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalUclid.g:3740:4: (lv_inv_4_0= ruleSpecDeclRule )
            	    {
            	    // InternalUclid.g:3740:4: (lv_inv_4_0= ruleSpecDeclRule )
            	    // InternalUclid.g:3741:5: lv_inv_4_0= ruleSpecDeclRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileLoopRuleAccess().getInvSpecDeclRuleParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_inv_4_0=ruleSpecDeclRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getWhileLoopRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"inv",
            	      						lv_inv_4_0,
            	      						"uclid.xtext.Uclid.SpecDeclRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // InternalUclid.g:3758:3: ( (lv_stmt_5_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3759:4: (lv_stmt_5_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3759:4: (lv_stmt_5_0= ruleBlkStmtRule )
            // InternalUclid.g:3760:5: lv_stmt_5_0= ruleBlkStmtRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getWhileLoopRuleAccess().getStmtBlkStmtRuleParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_stmt_5_0=ruleBlkStmtRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getWhileLoopRuleRule());
              					}
              					set(
              						current,
              						"stmt",
              						lv_stmt_5_0,
              						"uclid.xtext.Uclid.BlkStmtRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhileLoopRule"


    // $ANTLR start "entryRuleExprRule"
    // InternalUclid.g:3781:1: entryRuleExprRule returns [EObject current=null] : iv_ruleExprRule= ruleExprRule EOF ;
    public final EObject entryRuleExprRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRule = null;


        try {
            // InternalUclid.g:3781:49: (iv_ruleExprRule= ruleExprRule EOF )
            // InternalUclid.g:3782:2: iv_ruleExprRule= ruleExprRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprRule=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprRule"


    // $ANTLR start "ruleExprRule"
    // InternalUclid.g:3788:1: ruleExprRule returns [EObject current=null] : this_E1Rule_0= ruleE1Rule ;
    public final EObject ruleExprRule() throws RecognitionException {
        EObject current = null;

        EObject this_E1Rule_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3794:2: (this_E1Rule_0= ruleE1Rule )
            // InternalUclid.g:3795:2: this_E1Rule_0= ruleE1Rule
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExprRuleAccess().getE1RuleParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_E1Rule_0=ruleE1Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_E1Rule_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprRule"


    // $ANTLR start "entryRuleE1Rule"
    // InternalUclid.g:3809:1: entryRuleE1Rule returns [EObject current=null] : iv_ruleE1Rule= ruleE1Rule EOF ;
    public final EObject entryRuleE1Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE1Rule = null;


        try {
            // InternalUclid.g:3809:47: (iv_ruleE1Rule= ruleE1Rule EOF )
            // InternalUclid.g:3810:2: iv_ruleE1Rule= ruleE1Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE1RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE1Rule=ruleE1Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE1Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE1Rule"


    // $ANTLR start "ruleE1Rule"
    // InternalUclid.g:3816:1: ruleE1Rule returns [EObject current=null] : (this_E2Rule_0= ruleE2Rule | ( ( ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) ) ) otherlv_2= '(' ( (lv_existential_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= '::' ( (lv_a_6_0= ruleE1Rule ) ) ) | ( ( (lv_pred_7_0= 'const' ) ) otherlv_8= '(' ( (lv_existential_9_0= ruleExprListRule ) ) otherlv_10= ')' ) ) ;
    public final EObject ruleE1Rule() throws RecognitionException {
        EObject current = null;

        Token lv_pred_1_1=null;
        Token lv_pred_1_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_pred_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_E2Rule_0 = null;

        EObject lv_existential_3_0 = null;

        EObject lv_a_6_0 = null;

        EObject lv_existential_9_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3822:2: ( (this_E2Rule_0= ruleE2Rule | ( ( ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) ) ) otherlv_2= '(' ( (lv_existential_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= '::' ( (lv_a_6_0= ruleE1Rule ) ) ) | ( ( (lv_pred_7_0= 'const' ) ) otherlv_8= '(' ( (lv_existential_9_0= ruleExprListRule ) ) otherlv_10= ')' ) ) )
            // InternalUclid.g:3823:2: (this_E2Rule_0= ruleE2Rule | ( ( ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) ) ) otherlv_2= '(' ( (lv_existential_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= '::' ( (lv_a_6_0= ruleE1Rule ) ) ) | ( ( (lv_pred_7_0= 'const' ) ) otherlv_8= '(' ( (lv_existential_9_0= ruleExprListRule ) ) otherlv_10= ')' ) )
            {
            // InternalUclid.g:3823:2: (this_E2Rule_0= ruleE2Rule | ( ( ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) ) ) otherlv_2= '(' ( (lv_existential_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= '::' ( (lv_a_6_0= ruleE1Rule ) ) ) | ( ( (lv_pred_7_0= 'const' ) ) otherlv_8= '(' ( (lv_existential_9_0= ruleExprListRule ) ) otherlv_10= ')' ) )
            int alt58=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
            case RULE_STRING:
            case 17:
            case 31:
            case 55:
            case 74:
            case 75:
            case 76:
            case 80:
            case 81:
                {
                alt58=1;
                }
                break;
            case 64:
            case 65:
                {
                alt58=2;
                }
                break;
            case 28:
                {
                alt58=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalUclid.g:3824:3: this_E2Rule_0= ruleE2Rule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE1RuleAccess().getE2RuleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_E2Rule_0=ruleE2Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_E2Rule_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:3836:3: ( ( ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) ) ) otherlv_2= '(' ( (lv_existential_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= '::' ( (lv_a_6_0= ruleE1Rule ) ) )
                    {
                    // InternalUclid.g:3836:3: ( ( ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) ) ) otherlv_2= '(' ( (lv_existential_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= '::' ( (lv_a_6_0= ruleE1Rule ) ) )
                    // InternalUclid.g:3837:4: ( ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) ) ) otherlv_2= '(' ( (lv_existential_3_0= ruleArgList ) ) otherlv_4= ')' otherlv_5= '::' ( (lv_a_6_0= ruleE1Rule ) )
                    {
                    // InternalUclid.g:3837:4: ( ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) ) )
                    // InternalUclid.g:3838:5: ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) )
                    {
                    // InternalUclid.g:3838:5: ( (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' ) )
                    // InternalUclid.g:3839:6: (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' )
                    {
                    // InternalUclid.g:3839:6: (lv_pred_1_1= 'forall' | lv_pred_1_2= 'exists' )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==64) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==65) ) {
                        alt57=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalUclid.g:3840:7: lv_pred_1_1= 'forall'
                            {
                            lv_pred_1_1=(Token)match(input,64,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_pred_1_1, grammarAccess.getE1RuleAccess().getPredForallKeyword_1_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getE1RuleRule());
                              							}
                              							setWithLastConsumed(current, "pred", lv_pred_1_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalUclid.g:3851:7: lv_pred_1_2= 'exists'
                            {
                            lv_pred_1_2=(Token)match(input,65,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_pred_1_2, grammarAccess.getE1RuleAccess().getPredExistsKeyword_1_0_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getE1RuleRule());
                              							}
                              							setWithLastConsumed(current, "pred", lv_pred_1_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,31,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getE1RuleAccess().getLeftParenthesisKeyword_1_1());
                      			
                    }
                    // InternalUclid.g:3868:4: ( (lv_existential_3_0= ruleArgList ) )
                    // InternalUclid.g:3869:5: (lv_existential_3_0= ruleArgList )
                    {
                    // InternalUclid.g:3869:5: (lv_existential_3_0= ruleArgList )
                    // InternalUclid.g:3870:6: lv_existential_3_0= ruleArgList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE1RuleAccess().getExistentialArgListParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_existential_3_0=ruleArgList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE1RuleRule());
                      						}
                      						set(
                      							current,
                      							"existential",
                      							lv_existential_3_0,
                      							"uclid.xtext.Uclid.ArgList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,32,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getE1RuleAccess().getRightParenthesisKeyword_1_3());
                      			
                    }
                    otherlv_5=(Token)match(input,66,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getE1RuleAccess().getColonColonKeyword_1_4());
                      			
                    }
                    // InternalUclid.g:3895:4: ( (lv_a_6_0= ruleE1Rule ) )
                    // InternalUclid.g:3896:5: (lv_a_6_0= ruleE1Rule )
                    {
                    // InternalUclid.g:3896:5: (lv_a_6_0= ruleE1Rule )
                    // InternalUclid.g:3897:6: lv_a_6_0= ruleE1Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE1RuleAccess().getAE1RuleParserRuleCall_1_5_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_a_6_0=ruleE1Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE1RuleRule());
                      						}
                      						set(
                      							current,
                      							"a",
                      							lv_a_6_0,
                      							"uclid.xtext.Uclid.E1Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUclid.g:3916:3: ( ( (lv_pred_7_0= 'const' ) ) otherlv_8= '(' ( (lv_existential_9_0= ruleExprListRule ) ) otherlv_10= ')' )
                    {
                    // InternalUclid.g:3916:3: ( ( (lv_pred_7_0= 'const' ) ) otherlv_8= '(' ( (lv_existential_9_0= ruleExprListRule ) ) otherlv_10= ')' )
                    // InternalUclid.g:3917:4: ( (lv_pred_7_0= 'const' ) ) otherlv_8= '(' ( (lv_existential_9_0= ruleExprListRule ) ) otherlv_10= ')'
                    {
                    // InternalUclid.g:3917:4: ( (lv_pred_7_0= 'const' ) )
                    // InternalUclid.g:3918:5: (lv_pred_7_0= 'const' )
                    {
                    // InternalUclid.g:3918:5: (lv_pred_7_0= 'const' )
                    // InternalUclid.g:3919:6: lv_pred_7_0= 'const'
                    {
                    lv_pred_7_0=(Token)match(input,28,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_pred_7_0, grammarAccess.getE1RuleAccess().getPredConstKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getE1RuleRule());
                      						}
                      						setWithLastConsumed(current, "pred", lv_pred_7_0, "const");
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getE1RuleAccess().getLeftParenthesisKeyword_2_1());
                      			
                    }
                    // InternalUclid.g:3935:4: ( (lv_existential_9_0= ruleExprListRule ) )
                    // InternalUclid.g:3936:5: (lv_existential_9_0= ruleExprListRule )
                    {
                    // InternalUclid.g:3936:5: (lv_existential_9_0= ruleExprListRule )
                    // InternalUclid.g:3937:6: lv_existential_9_0= ruleExprListRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE1RuleAccess().getExistentialExprListRuleParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_existential_9_0=ruleExprListRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE1RuleRule());
                      						}
                      						set(
                      							current,
                      							"existential",
                      							lv_existential_9_0,
                      							"uclid.xtext.Uclid.ExprListRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getE1RuleAccess().getRightParenthesisKeyword_2_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE1Rule"


    // $ANTLR start "entryRuleE2Rule"
    // InternalUclid.g:3963:1: entryRuleE2Rule returns [EObject current=null] : iv_ruleE2Rule= ruleE2Rule EOF ;
    public final EObject entryRuleE2Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE2Rule = null;


        try {
            // InternalUclid.g:3963:47: (iv_ruleE2Rule= ruleE2Rule EOF )
            // InternalUclid.g:3964:2: iv_ruleE2Rule= ruleE2Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE2RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE2Rule=ruleE2Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE2Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE2Rule"


    // $ANTLR start "ruleE2Rule"
    // InternalUclid.g:3970:1: ruleE2Rule returns [EObject current=null] : ( ( (lv_z_0_0= ruleE3Rule ) ) ( ( (lv_op_1_0= RULE_LOGEQU ) ) ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )* ) ;
    public final EObject ruleE2Rule() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_z_0_0 = null;

        EObject lv_q_2_1 = null;

        EObject lv_q_2_2 = null;



        	enterRule();

        try {
            // InternalUclid.g:3976:2: ( ( ( (lv_z_0_0= ruleE3Rule ) ) ( ( (lv_op_1_0= RULE_LOGEQU ) ) ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )* ) )
            // InternalUclid.g:3977:2: ( ( (lv_z_0_0= ruleE3Rule ) ) ( ( (lv_op_1_0= RULE_LOGEQU ) ) ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )* )
            {
            // InternalUclid.g:3977:2: ( ( (lv_z_0_0= ruleE3Rule ) ) ( ( (lv_op_1_0= RULE_LOGEQU ) ) ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )* )
            // InternalUclid.g:3978:3: ( (lv_z_0_0= ruleE3Rule ) ) ( ( (lv_op_1_0= RULE_LOGEQU ) ) ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )*
            {
            // InternalUclid.g:3978:3: ( (lv_z_0_0= ruleE3Rule ) )
            // InternalUclid.g:3979:4: (lv_z_0_0= ruleE3Rule )
            {
            // InternalUclid.g:3979:4: (lv_z_0_0= ruleE3Rule )
            // InternalUclid.g:3980:5: lv_z_0_0= ruleE3Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE2RuleAccess().getZE3RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_44);
            lv_z_0_0=ruleE3Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getE2RuleRule());
              					}
              					add(
              						current,
              						"z",
              						lv_z_0_0,
              						"uclid.xtext.Uclid.E3Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:3997:3: ( ( (lv_op_1_0= RULE_LOGEQU ) ) ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_LOGEQU) ) {
                    int LA60_2 = input.LA(2);

                    if ( (synpred83_InternalUclid()) ) {
                        alt60=1;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // InternalUclid.g:3998:4: ( (lv_op_1_0= RULE_LOGEQU ) ) ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) )
            	    {
            	    // InternalUclid.g:3998:4: ( (lv_op_1_0= RULE_LOGEQU ) )
            	    // InternalUclid.g:3999:5: (lv_op_1_0= RULE_LOGEQU )
            	    {
            	    // InternalUclid.g:3999:5: (lv_op_1_0= RULE_LOGEQU )
            	    // InternalUclid.g:4000:6: lv_op_1_0= RULE_LOGEQU
            	    {
            	    lv_op_1_0=(Token)match(input,RULE_LOGEQU,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_1_0, grammarAccess.getE2RuleAccess().getOpLOGEQUTerminalRuleCall_1_0_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getE2RuleRule());
            	      						}
            	      						setWithLastConsumed(
            	      							current,
            	      							"op",
            	      							lv_op_1_0,
            	      							"uclid.xtext.Uclid.LOGEQU");
            	      					
            	    }

            	    }


            	    }

            	    // InternalUclid.g:4016:4: ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) )
            	    // InternalUclid.g:4017:5: ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) )
            	    {
            	    // InternalUclid.g:4017:5: ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) )
            	    // InternalUclid.g:4018:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )
            	    {
            	    // InternalUclid.g:4018:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )
            	    int alt59=2;
            	    alt59 = dfa59.predict(input);
            	    switch (alt59) {
            	        case 1 :
            	            // InternalUclid.g:4019:7: lv_q_2_1= ruleE2Rule
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getE2RuleAccess().getQE2RuleParserRuleCall_1_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_44);
            	            lv_q_2_1=ruleE2Rule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getE2RuleRule());
            	              							}
            	              							add(
            	              								current,
            	              								"q",
            	              								lv_q_2_1,
            	              								"uclid.xtext.Uclid.E2Rule");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalUclid.g:4035:7: lv_q_2_2= ruleE3Rule
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getE2RuleAccess().getQE3RuleParserRuleCall_1_1_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_44);
            	            lv_q_2_2=ruleE3Rule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getE2RuleRule());
            	              							}
            	              							add(
            	              								current,
            	              								"q",
            	              								lv_q_2_2,
            	              								"uclid.xtext.Uclid.E3Rule");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE2Rule"


    // $ANTLR start "entryRuleE3Rule"
    // InternalUclid.g:4058:1: entryRuleE3Rule returns [EObject current=null] : iv_ruleE3Rule= ruleE3Rule EOF ;
    public final EObject entryRuleE3Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE3Rule = null;


        try {
            // InternalUclid.g:4058:47: (iv_ruleE3Rule= ruleE3Rule EOF )
            // InternalUclid.g:4059:2: iv_ruleE3Rule= ruleE3Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE3RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE3Rule=ruleE3Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE3Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE3Rule"


    // $ANTLR start "ruleE3Rule"
    // InternalUclid.g:4065:1: ruleE3Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE4Rule ) ) ( ( (lv_op_1_0= RULE_LOGIMPLY ) ) ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )* ) ;
    public final EObject ruleE3Rule() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_1 = null;

        EObject lv_e_2_2 = null;



        	enterRule();

        try {
            // InternalUclid.g:4071:2: ( ( ( (lv_e_0_0= ruleE4Rule ) ) ( ( (lv_op_1_0= RULE_LOGIMPLY ) ) ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )* ) )
            // InternalUclid.g:4072:2: ( ( (lv_e_0_0= ruleE4Rule ) ) ( ( (lv_op_1_0= RULE_LOGIMPLY ) ) ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )* )
            {
            // InternalUclid.g:4072:2: ( ( (lv_e_0_0= ruleE4Rule ) ) ( ( (lv_op_1_0= RULE_LOGIMPLY ) ) ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )* )
            // InternalUclid.g:4073:3: ( (lv_e_0_0= ruleE4Rule ) ) ( ( (lv_op_1_0= RULE_LOGIMPLY ) ) ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )*
            {
            // InternalUclid.g:4073:3: ( (lv_e_0_0= ruleE4Rule ) )
            // InternalUclid.g:4074:4: (lv_e_0_0= ruleE4Rule )
            {
            // InternalUclid.g:4074:4: (lv_e_0_0= ruleE4Rule )
            // InternalUclid.g:4075:5: lv_e_0_0= ruleE4Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE3RuleAccess().getEE4RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_46);
            lv_e_0_0=ruleE4Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getE3RuleRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_0_0,
              						"uclid.xtext.Uclid.E4Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:4092:3: ( ( (lv_op_1_0= RULE_LOGIMPLY ) ) ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_LOGIMPLY) ) {
                    int LA62_2 = input.LA(2);

                    if ( (synpred85_InternalUclid()) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // InternalUclid.g:4093:4: ( (lv_op_1_0= RULE_LOGIMPLY ) ) ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) )
            	    {
            	    // InternalUclid.g:4093:4: ( (lv_op_1_0= RULE_LOGIMPLY ) )
            	    // InternalUclid.g:4094:5: (lv_op_1_0= RULE_LOGIMPLY )
            	    {
            	    // InternalUclid.g:4094:5: (lv_op_1_0= RULE_LOGIMPLY )
            	    // InternalUclid.g:4095:6: lv_op_1_0= RULE_LOGIMPLY
            	    {
            	    lv_op_1_0=(Token)match(input,RULE_LOGIMPLY,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_1_0, grammarAccess.getE3RuleAccess().getOpLOGIMPLYTerminalRuleCall_1_0_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getE3RuleRule());
            	      						}
            	      						setWithLastConsumed(
            	      							current,
            	      							"op",
            	      							lv_op_1_0,
            	      							"uclid.xtext.Uclid.LOGIMPLY");
            	      					
            	    }

            	    }


            	    }

            	    // InternalUclid.g:4111:4: ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) )
            	    // InternalUclid.g:4112:5: ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) )
            	    {
            	    // InternalUclid.g:4112:5: ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) )
            	    // InternalUclid.g:4113:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )
            	    {
            	    // InternalUclid.g:4113:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )
            	    int alt61=2;
            	    alt61 = dfa61.predict(input);
            	    switch (alt61) {
            	        case 1 :
            	            // InternalUclid.g:4114:7: lv_e_2_1= ruleE3Rule
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getE3RuleAccess().getEE3RuleParserRuleCall_1_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_46);
            	            lv_e_2_1=ruleE3Rule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getE3RuleRule());
            	              							}
            	              							add(
            	              								current,
            	              								"e",
            	              								lv_e_2_1,
            	              								"uclid.xtext.Uclid.E3Rule");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalUclid.g:4130:7: lv_e_2_2= ruleE4Rule
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getE3RuleAccess().getEE4RuleParserRuleCall_1_1_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_46);
            	            lv_e_2_2=ruleE4Rule();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getE3RuleRule());
            	              							}
            	              							add(
            	              								current,
            	              								"e",
            	              								lv_e_2_2,
            	              								"uclid.xtext.Uclid.E4Rule");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE3Rule"


    // $ANTLR start "entryRuleE4Rule"
    // InternalUclid.g:4153:1: entryRuleE4Rule returns [EObject current=null] : iv_ruleE4Rule= ruleE4Rule EOF ;
    public final EObject entryRuleE4Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE4Rule = null;


        try {
            // InternalUclid.g:4153:47: (iv_ruleE4Rule= ruleE4Rule EOF )
            // InternalUclid.g:4154:2: iv_ruleE4Rule= ruleE4Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE4RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE4Rule=ruleE4Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE4Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE4Rule"


    // $ANTLR start "ruleE4Rule"
    // InternalUclid.g:4160:1: ruleE4Rule returns [EObject current=null] : ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) ) ;
    public final EObject ruleE4Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;

        EObject lv_e_3_0 = null;

        EObject lv_e_5_0 = null;

        EObject lv_e_6_0 = null;

        EObject lv_e_8_0 = null;

        EObject lv_e_9_0 = null;

        EObject lv_e_11_0 = null;

        EObject lv_e_12_0 = null;

        EObject lv_e_14_0 = null;

        EObject lv_e_15_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4166:2: ( ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) ) )
            // InternalUclid.g:4167:2: ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) )
            {
            // InternalUclid.g:4167:2: ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) )
            int alt63=6;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // InternalUclid.g:4168:3: ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:4168:3: ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) )
                    // InternalUclid.g:4169:4: ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:4169:4: ( (lv_e_0_0= ruleE5Rule ) )
                    // InternalUclid.g:4170:5: (lv_e_0_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4170:5: (lv_e_0_0= ruleE5Rule )
                    // InternalUclid.g:4171:6: lv_e_0_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
                    lv_e_0_0=ruleE5Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_0_0,
                      							"uclid.xtext.Uclid.E5Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,67,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getE4RuleAccess().getAmpersandAmpersandKeyword_0_1());
                      			
                    }
                    // InternalUclid.g:4192:4: ( (lv_e_2_0= ruleE4Rule ) )
                    // InternalUclid.g:4193:5: (lv_e_2_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4193:5: (lv_e_2_0= ruleE4Rule )
                    // InternalUclid.g:4194:6: lv_e_2_0= ruleE4Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_e_2_0=ruleE4Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_2_0,
                      							"uclid.xtext.Uclid.E4Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:4213:3: ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:4213:3: ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) )
                    // InternalUclid.g:4214:4: ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:4214:4: ( (lv_e_3_0= ruleE5Rule ) )
                    // InternalUclid.g:4215:5: (lv_e_3_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4215:5: (lv_e_3_0= ruleE5Rule )
                    // InternalUclid.g:4216:6: lv_e_3_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
                    lv_e_3_0=ruleE5Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_3_0,
                      							"uclid.xtext.Uclid.E5Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,68,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getE4RuleAccess().getVerticalLineVerticalLineKeyword_1_1());
                      			
                    }
                    // InternalUclid.g:4237:4: ( (lv_e_5_0= ruleE4Rule ) )
                    // InternalUclid.g:4238:5: (lv_e_5_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4238:5: (lv_e_5_0= ruleE4Rule )
                    // InternalUclid.g:4239:6: lv_e_5_0= ruleE4Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_e_5_0=ruleE4Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_5_0,
                      							"uclid.xtext.Uclid.E4Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUclid.g:4258:3: ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:4258:3: ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) )
                    // InternalUclid.g:4259:4: ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:4259:4: ( (lv_e_6_0= ruleE5Rule ) )
                    // InternalUclid.g:4260:5: (lv_e_6_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4260:5: (lv_e_6_0= ruleE5Rule )
                    // InternalUclid.g:4261:6: lv_e_6_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
                    lv_e_6_0=ruleE5Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_6_0,
                      							"uclid.xtext.Uclid.E5Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,69,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getE4RuleAccess().getAmpersandKeyword_2_1());
                      			
                    }
                    // InternalUclid.g:4282:4: ( (lv_e_8_0= ruleE4Rule ) )
                    // InternalUclid.g:4283:5: (lv_e_8_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4283:5: (lv_e_8_0= ruleE4Rule )
                    // InternalUclid.g:4284:6: lv_e_8_0= ruleE4Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_e_8_0=ruleE4Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_8_0,
                      							"uclid.xtext.Uclid.E4Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUclid.g:4303:3: ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:4303:3: ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) )
                    // InternalUclid.g:4304:4: ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:4304:4: ( (lv_e_9_0= ruleE5Rule ) )
                    // InternalUclid.g:4305:5: (lv_e_9_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4305:5: (lv_e_9_0= ruleE5Rule )
                    // InternalUclid.g:4306:6: lv_e_9_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
                    lv_e_9_0=ruleE5Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_9_0,
                      							"uclid.xtext.Uclid.E5Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,70,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getE4RuleAccess().getVerticalLineKeyword_3_1());
                      			
                    }
                    // InternalUclid.g:4327:4: ( (lv_e_11_0= ruleE4Rule ) )
                    // InternalUclid.g:4328:5: (lv_e_11_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4328:5: (lv_e_11_0= ruleE4Rule )
                    // InternalUclid.g:4329:6: lv_e_11_0= ruleE4Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_e_11_0=ruleE4Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_11_0,
                      							"uclid.xtext.Uclid.E4Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalUclid.g:4348:3: ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:4348:3: ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) )
                    // InternalUclid.g:4349:4: ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:4349:4: ( (lv_e_12_0= ruleE5Rule ) )
                    // InternalUclid.g:4350:5: (lv_e_12_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4350:5: (lv_e_12_0= ruleE5Rule )
                    // InternalUclid.g:4351:6: lv_e_12_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_51);
                    lv_e_12_0=ruleE5Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_12_0,
                      							"uclid.xtext.Uclid.E5Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_13=(Token)match(input,71,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getE4RuleAccess().getCircumflexAccentKeyword_4_1());
                      			
                    }
                    // InternalUclid.g:4372:4: ( (lv_e_14_0= ruleE4Rule ) )
                    // InternalUclid.g:4373:5: (lv_e_14_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4373:5: (lv_e_14_0= ruleE4Rule )
                    // InternalUclid.g:4374:6: lv_e_14_0= ruleE4Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_e_14_0=ruleE4Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      						}
                      						add(
                      							current,
                      							"e",
                      							lv_e_14_0,
                      							"uclid.xtext.Uclid.E4Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalUclid.g:4393:3: ( (lv_e_15_0= ruleE5Rule ) )
                    {
                    // InternalUclid.g:4393:3: ( (lv_e_15_0= ruleE5Rule ) )
                    // InternalUclid.g:4394:4: (lv_e_15_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4394:4: (lv_e_15_0= ruleE5Rule )
                    // InternalUclid.g:4395:5: lv_e_15_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_e_15_0=ruleE5Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getE4RuleRule());
                      					}
                      					add(
                      						current,
                      						"e",
                      						lv_e_15_0,
                      						"uclid.xtext.Uclid.E5Rule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE4Rule"


    // $ANTLR start "entryRuleE5Rule"
    // InternalUclid.g:4416:1: entryRuleE5Rule returns [EObject current=null] : iv_ruleE5Rule= ruleE5Rule EOF ;
    public final EObject entryRuleE5Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE5Rule = null;


        try {
            // InternalUclid.g:4416:47: (iv_ruleE5Rule= ruleE5Rule EOF )
            // InternalUclid.g:4417:2: iv_ruleE5Rule= ruleE5Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE5RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE5Rule=ruleE5Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE5Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE5Rule"


    // $ANTLR start "ruleE5Rule"
    // InternalUclid.g:4423:1: ruleE5Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )* ) ;
    public final EObject ruleE5Rule() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4429:2: ( ( ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )* ) )
            // InternalUclid.g:4430:2: ( ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )* )
            {
            // InternalUclid.g:4430:2: ( ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )* )
            // InternalUclid.g:4431:3: ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )*
            {
            // InternalUclid.g:4431:3: ( (lv_e_0_0= ruleE6Rule ) )
            // InternalUclid.g:4432:4: (lv_e_0_0= ruleE6Rule )
            {
            // InternalUclid.g:4432:4: (lv_e_0_0= ruleE6Rule )
            // InternalUclid.g:4433:5: lv_e_0_0= ruleE6Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE5RuleAccess().getEE6RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_52);
            lv_e_0_0=ruleE6Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getE5RuleRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_0_0,
              						"uclid.xtext.Uclid.E6Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:4450:3: ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_REL_OP_RULE) ) {
                    int LA64_2 = input.LA(2);

                    if ( (synpred91_InternalUclid()) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // InternalUclid.g:4451:4: ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) )
            	    {
            	    // InternalUclid.g:4451:4: ( (lv_op_1_0= RULE_REL_OP_RULE ) )
            	    // InternalUclid.g:4452:5: (lv_op_1_0= RULE_REL_OP_RULE )
            	    {
            	    // InternalUclid.g:4452:5: (lv_op_1_0= RULE_REL_OP_RULE )
            	    // InternalUclid.g:4453:6: lv_op_1_0= RULE_REL_OP_RULE
            	    {
            	    lv_op_1_0=(Token)match(input,RULE_REL_OP_RULE,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_1_0, grammarAccess.getE5RuleAccess().getOpREL_OP_RULETerminalRuleCall_1_0_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getE5RuleRule());
            	      						}
            	      						setWithLastConsumed(
            	      							current,
            	      							"op",
            	      							lv_op_1_0,
            	      							"uclid.xtext.Uclid.REL_OP_RULE");
            	      					
            	    }

            	    }


            	    }

            	    // InternalUclid.g:4469:4: ( (lv_e_2_0= ruleE6Rule ) )
            	    // InternalUclid.g:4470:5: (lv_e_2_0= ruleE6Rule )
            	    {
            	    // InternalUclid.g:4470:5: (lv_e_2_0= ruleE6Rule )
            	    // InternalUclid.g:4471:6: lv_e_2_0= ruleE6Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE5RuleAccess().getEE6RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_e_2_0=ruleE6Rule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getE5RuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_2_0,
            	      							"uclid.xtext.Uclid.E6Rule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE5Rule"


    // $ANTLR start "entryRuleE6Rule"
    // InternalUclid.g:4493:1: entryRuleE6Rule returns [EObject current=null] : iv_ruleE6Rule= ruleE6Rule EOF ;
    public final EObject entryRuleE6Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE6Rule = null;


        try {
            // InternalUclid.g:4493:47: (iv_ruleE6Rule= ruleE6Rule EOF )
            // InternalUclid.g:4494:2: iv_ruleE6Rule= ruleE6Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE6RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE6Rule=ruleE6Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE6Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE6Rule"


    // $ANTLR start "ruleE6Rule"
    // InternalUclid.g:4500:1: ruleE6Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )* ) ;
    public final EObject ruleE6Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4506:2: ( ( ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )* ) )
            // InternalUclid.g:4507:2: ( ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )* )
            {
            // InternalUclid.g:4507:2: ( ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )* )
            // InternalUclid.g:4508:3: ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )*
            {
            // InternalUclid.g:4508:3: ( (lv_e_0_0= ruleE7Rule ) )
            // InternalUclid.g:4509:4: (lv_e_0_0= ruleE7Rule )
            {
            // InternalUclid.g:4509:4: (lv_e_0_0= ruleE7Rule )
            // InternalUclid.g:4510:5: lv_e_0_0= ruleE7Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE6RuleAccess().getEE7RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_e_0_0=ruleE7Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getE6RuleRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_0_0,
              						"uclid.xtext.Uclid.E7Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:4527:3: (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==72) ) {
                    int LA65_2 = input.LA(2);

                    if ( (synpred92_InternalUclid()) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // InternalUclid.g:4528:4: otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE6RuleAccess().getPlusSignPlusSignKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:4532:4: ( (lv_e_2_0= ruleE6Rule ) )
            	    // InternalUclid.g:4533:5: (lv_e_2_0= ruleE6Rule )
            	    {
            	    // InternalUclid.g:4533:5: (lv_e_2_0= ruleE6Rule )
            	    // InternalUclid.g:4534:6: lv_e_2_0= ruleE6Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE6RuleAccess().getEE6RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_e_2_0=ruleE6Rule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getE6RuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_2_0,
            	      							"uclid.xtext.Uclid.E6Rule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE6Rule"


    // $ANTLR start "entryRuleE7Rule"
    // InternalUclid.g:4556:1: entryRuleE7Rule returns [EObject current=null] : iv_ruleE7Rule= ruleE7Rule EOF ;
    public final EObject entryRuleE7Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE7Rule = null;


        try {
            // InternalUclid.g:4556:47: (iv_ruleE7Rule= ruleE7Rule EOF )
            // InternalUclid.g:4557:2: iv_ruleE7Rule= ruleE7Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE7RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE7Rule=ruleE7Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE7Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE7Rule"


    // $ANTLR start "ruleE7Rule"
    // InternalUclid.g:4563:1: ruleE7Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )* ) ;
    public final EObject ruleE7Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4569:2: ( ( ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )* ) )
            // InternalUclid.g:4570:2: ( ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )* )
            {
            // InternalUclid.g:4570:2: ( ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )* )
            // InternalUclid.g:4571:3: ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )*
            {
            // InternalUclid.g:4571:3: ( (lv_e_0_0= ruleE8Rule ) )
            // InternalUclid.g:4572:4: (lv_e_0_0= ruleE8Rule )
            {
            // InternalUclid.g:4572:4: (lv_e_0_0= ruleE8Rule )
            // InternalUclid.g:4573:5: lv_e_0_0= ruleE8Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE7RuleAccess().getEE8RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_54);
            lv_e_0_0=ruleE8Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getE7RuleRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_0_0,
              						"uclid.xtext.Uclid.E8Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:4590:3: (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==73) ) {
                    int LA66_2 = input.LA(2);

                    if ( (synpred93_InternalUclid()) ) {
                        alt66=1;
                    }


                }


                switch (alt66) {
            	case 1 :
            	    // InternalUclid.g:4591:4: otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) )
            	    {
            	    otherlv_1=(Token)match(input,73,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE7RuleAccess().getPlusSignKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:4595:4: ( (lv_e_2_0= ruleE7Rule ) )
            	    // InternalUclid.g:4596:5: (lv_e_2_0= ruleE7Rule )
            	    {
            	    // InternalUclid.g:4596:5: (lv_e_2_0= ruleE7Rule )
            	    // InternalUclid.g:4597:6: lv_e_2_0= ruleE7Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE7RuleAccess().getEE7RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_e_2_0=ruleE7Rule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getE7RuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_2_0,
            	      							"uclid.xtext.Uclid.E7Rule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE7Rule"


    // $ANTLR start "entryRuleE8Rule"
    // InternalUclid.g:4619:1: entryRuleE8Rule returns [EObject current=null] : iv_ruleE8Rule= ruleE8Rule EOF ;
    public final EObject entryRuleE8Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE8Rule = null;


        try {
            // InternalUclid.g:4619:47: (iv_ruleE8Rule= ruleE8Rule EOF )
            // InternalUclid.g:4620:2: iv_ruleE8Rule= ruleE8Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE8RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE8Rule=ruleE8Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE8Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE8Rule"


    // $ANTLR start "ruleE8Rule"
    // InternalUclid.g:4626:1: ruleE8Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )* ) ;
    public final EObject ruleE8Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4632:2: ( ( ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )* ) )
            // InternalUclid.g:4633:2: ( ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )* )
            {
            // InternalUclid.g:4633:2: ( ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )* )
            // InternalUclid.g:4634:3: ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )*
            {
            // InternalUclid.g:4634:3: ( (lv_e_0_0= ruleE9Rule ) )
            // InternalUclid.g:4635:4: (lv_e_0_0= ruleE9Rule )
            {
            // InternalUclid.g:4635:4: (lv_e_0_0= ruleE9Rule )
            // InternalUclid.g:4636:5: lv_e_0_0= ruleE9Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE8RuleAccess().getEE9RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_55);
            lv_e_0_0=ruleE9Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getE8RuleRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_0_0,
              						"uclid.xtext.Uclid.E9Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:4653:3: (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==74) ) {
                    int LA67_2 = input.LA(2);

                    if ( (synpred94_InternalUclid()) ) {
                        alt67=1;
                    }


                }


                switch (alt67) {
            	case 1 :
            	    // InternalUclid.g:4654:4: otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) )
            	    {
            	    otherlv_1=(Token)match(input,74,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE8RuleAccess().getHyphenMinusKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:4658:4: ( (lv_e_2_0= ruleE9Rule ) )
            	    // InternalUclid.g:4659:5: (lv_e_2_0= ruleE9Rule )
            	    {
            	    // InternalUclid.g:4659:5: (lv_e_2_0= ruleE9Rule )
            	    // InternalUclid.g:4660:6: lv_e_2_0= ruleE9Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE8RuleAccess().getEE9RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_e_2_0=ruleE9Rule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getE8RuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_2_0,
            	      							"uclid.xtext.Uclid.E9Rule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE8Rule"


    // $ANTLR start "entryRuleE9Rule"
    // InternalUclid.g:4682:1: entryRuleE9Rule returns [EObject current=null] : iv_ruleE9Rule= ruleE9Rule EOF ;
    public final EObject entryRuleE9Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE9Rule = null;


        try {
            // InternalUclid.g:4682:47: (iv_ruleE9Rule= ruleE9Rule EOF )
            // InternalUclid.g:4683:2: iv_ruleE9Rule= ruleE9Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE9RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE9Rule=ruleE9Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE9Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE9Rule"


    // $ANTLR start "ruleE9Rule"
    // InternalUclid.g:4689:1: ruleE9Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )* ) ;
    public final EObject ruleE9Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4695:2: ( ( ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )* ) )
            // InternalUclid.g:4696:2: ( ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )* )
            {
            // InternalUclid.g:4696:2: ( ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )* )
            // InternalUclid.g:4697:3: ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )*
            {
            // InternalUclid.g:4697:3: ( (lv_e_0_0= ruleE10Rule ) )
            // InternalUclid.g:4698:4: (lv_e_0_0= ruleE10Rule )
            {
            // InternalUclid.g:4698:4: (lv_e_0_0= ruleE10Rule )
            // InternalUclid.g:4699:5: lv_e_0_0= ruleE10Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE9RuleAccess().getEE10RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_e_0_0=ruleE10Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getE9RuleRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_0_0,
              						"uclid.xtext.Uclid.E10Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:4716:3: (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==20) ) {
                    int LA68_2 = input.LA(2);

                    if ( (synpred95_InternalUclid()) ) {
                        alt68=1;
                    }


                }


                switch (alt68) {
            	case 1 :
            	    // InternalUclid.g:4717:4: otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE9RuleAccess().getAsteriskKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:4721:4: ( (lv_e_2_0= ruleE10Rule ) )
            	    // InternalUclid.g:4722:5: (lv_e_2_0= ruleE10Rule )
            	    {
            	    // InternalUclid.g:4722:5: (lv_e_2_0= ruleE10Rule )
            	    // InternalUclid.g:4723:6: lv_e_2_0= ruleE10Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE9RuleAccess().getEE10RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_e_2_0=ruleE10Rule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getE9RuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_2_0,
            	      							"uclid.xtext.Uclid.E10Rule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE9Rule"


    // $ANTLR start "entryRuleE10Rule"
    // InternalUclid.g:4745:1: entryRuleE10Rule returns [EObject current=null] : iv_ruleE10Rule= ruleE10Rule EOF ;
    public final EObject entryRuleE10Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE10Rule = null;


        try {
            // InternalUclid.g:4745:48: (iv_ruleE10Rule= ruleE10Rule EOF )
            // InternalUclid.g:4746:2: iv_ruleE10Rule= ruleE10Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE10RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE10Rule=ruleE10Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE10Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE10Rule"


    // $ANTLR start "ruleE10Rule"
    // InternalUclid.g:4752:1: ruleE10Rule returns [EObject current=null] : ( ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) ) | ( (lv_e_2_0= ruleE11Rule ) ) ) ;
    public final EObject ruleE10Rule() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        EObject lv_e_1_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4758:2: ( ( ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) ) | ( (lv_e_2_0= ruleE11Rule ) ) ) )
            // InternalUclid.g:4759:2: ( ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) ) | ( (lv_e_2_0= ruleE11Rule ) ) )
            {
            // InternalUclid.g:4759:2: ( ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) ) | ( (lv_e_2_0= ruleE11Rule ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=74 && LA70_0<=76)) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_INT)||LA70_0==RULE_STRING||LA70_0==17||LA70_0==31||LA70_0==55||(LA70_0>=80 && LA70_0<=81)) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalUclid.g:4760:3: ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) )
                    {
                    // InternalUclid.g:4760:3: ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) )
                    // InternalUclid.g:4761:4: ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) )
                    {
                    // InternalUclid.g:4761:4: ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) )
                    // InternalUclid.g:4762:5: ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) )
                    {
                    // InternalUclid.g:4762:5: ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) )
                    // InternalUclid.g:4763:6: (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' )
                    {
                    // InternalUclid.g:4763:6: (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' )
                    int alt69=3;
                    switch ( input.LA(1) ) {
                    case 74:
                        {
                        alt69=1;
                        }
                        break;
                    case 75:
                        {
                        alt69=2;
                        }
                        break;
                    case 76:
                        {
                        alt69=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }

                    switch (alt69) {
                        case 1 :
                            // InternalUclid.g:4764:7: lv_op_0_1= '-'
                            {
                            lv_op_0_1=(Token)match(input,74,FOLLOW_45); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_0_1, grammarAccess.getE10RuleAccess().getOpHyphenMinusKeyword_0_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getE10RuleRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_0_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalUclid.g:4775:7: lv_op_0_2= '!'
                            {
                            lv_op_0_2=(Token)match(input,75,FOLLOW_45); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_0_2, grammarAccess.getE10RuleAccess().getOpExclamationMarkKeyword_0_0_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getE10RuleRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_0_2, null);
                              						
                            }

                            }
                            break;
                        case 3 :
                            // InternalUclid.g:4786:7: lv_op_0_3= '~'
                            {
                            lv_op_0_3=(Token)match(input,76,FOLLOW_45); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_op_0_3, grammarAccess.getE10RuleAccess().getOpTildeKeyword_0_0_0_2());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getE10RuleRule());
                              							}
                              							setWithLastConsumed(current, "op", lv_op_0_3, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalUclid.g:4799:4: ( (lv_e_1_0= ruleE11Rule ) )
                    // InternalUclid.g:4800:5: (lv_e_1_0= ruleE11Rule )
                    {
                    // InternalUclid.g:4800:5: (lv_e_1_0= ruleE11Rule )
                    // InternalUclid.g:4801:6: lv_e_1_0= ruleE11Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE10RuleAccess().getEE11RuleParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_e_1_0=ruleE11Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE10RuleRule());
                      						}
                      						set(
                      							current,
                      							"e",
                      							lv_e_1_0,
                      							"uclid.xtext.Uclid.E11Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:4820:3: ( (lv_e_2_0= ruleE11Rule ) )
                    {
                    // InternalUclid.g:4820:3: ( (lv_e_2_0= ruleE11Rule ) )
                    // InternalUclid.g:4821:4: (lv_e_2_0= ruleE11Rule )
                    {
                    // InternalUclid.g:4821:4: (lv_e_2_0= ruleE11Rule )
                    // InternalUclid.g:4822:5: lv_e_2_0= ruleE11Rule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getE10RuleAccess().getEE11RuleParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_e_2_0=ruleE11Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getE10RuleRule());
                      					}
                      					set(
                      						current,
                      						"e",
                      						lv_e_2_0,
                      						"uclid.xtext.Uclid.E11Rule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE10Rule"


    // $ANTLR start "entryRuleE11Rule"
    // InternalUclid.g:4843:1: entryRuleE11Rule returns [EObject current=null] : iv_ruleE11Rule= ruleE11Rule EOF ;
    public final EObject entryRuleE11Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE11Rule = null;


        try {
            // InternalUclid.g:4843:48: (iv_ruleE11Rule= ruleE11Rule EOF )
            // InternalUclid.g:4844:2: iv_ruleE11Rule= ruleE11Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE11RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE11Rule=ruleE11Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE11Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE11Rule"


    // $ANTLR start "ruleE11Rule"
    // InternalUclid.g:4850:1: ruleE11Rule returns [EObject current=null] : (this_E12Rule_0= ruleE12Rule (otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )? ) ;
    public final EObject ruleE11Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_E12Rule_0 = null;

        EObject lv_l_2_0 = null;

        EObject lv_e_4_0 = null;

        EObject lv_e_6_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4856:2: ( (this_E12Rule_0= ruleE12Rule (otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )? ) )
            // InternalUclid.g:4857:2: (this_E12Rule_0= ruleE12Rule (otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )? )
            {
            // InternalUclid.g:4857:2: (this_E12Rule_0= ruleE12Rule (otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )? )
            // InternalUclid.g:4858:3: this_E12Rule_0= ruleE12Rule (otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getE11RuleAccess().getE12RuleParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_57);
            this_E12Rule_0=ruleE12Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_E12Rule_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUclid.g:4869:3: (otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==44) ) {
                int LA72_1 = input.LA(2);

                if ( (synpred101_InternalUclid()) ) {
                    alt72=1;
                }
            }
            switch (alt72) {
                case 1 :
                    // InternalUclid.g:4870:4: otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getE11RuleAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:4874:4: ( (lv_l_2_0= ruleExprListRule ) )
                    // InternalUclid.g:4875:5: (lv_l_2_0= ruleExprListRule )
                    {
                    // InternalUclid.g:4875:5: (lv_l_2_0= ruleExprListRule )
                    // InternalUclid.g:4876:6: lv_l_2_0= ruleExprListRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE11RuleAccess().getLExprListRuleParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_58);
                    lv_l_2_0=ruleExprListRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE11RuleRule());
                      						}
                      						add(
                      							current,
                      							"l",
                      							lv_l_2_0,
                      							"uclid.xtext.Uclid.ExprListRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:4893:4: ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )?
                    int alt71=3;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==77) ) {
                        alt71=1;
                    }
                    else if ( (LA71_0==25) ) {
                        alt71=2;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalUclid.g:4894:5: (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) )
                            {
                            // InternalUclid.g:4894:5: (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) )
                            // InternalUclid.g:4895:6: otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) )
                            {
                            otherlv_3=(Token)match(input,77,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getE11RuleAccess().getHyphenMinusGreaterThanSignKeyword_1_2_0_0());
                              					
                            }
                            // InternalUclid.g:4899:6: ( (lv_e_4_0= ruleExprRule ) )
                            // InternalUclid.g:4900:7: (lv_e_4_0= ruleExprRule )
                            {
                            // InternalUclid.g:4900:7: (lv_e_4_0= ruleExprRule )
                            // InternalUclid.g:4901:8: lv_e_4_0= ruleExprRule
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getE11RuleAccess().getEExprRuleParserRuleCall_1_2_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_27);
                            lv_e_4_0=ruleExprRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getE11RuleRule());
                              								}
                              								add(
                              									current,
                              									"e",
                              									lv_e_4_0,
                              									"uclid.xtext.Uclid.ExprRule");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalUclid.g:4920:5: (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) )
                            {
                            // InternalUclid.g:4920:5: (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) )
                            // InternalUclid.g:4921:6: otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) )
                            {
                            otherlv_5=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getE11RuleAccess().getColonKeyword_1_2_1_0());
                              					
                            }
                            // InternalUclid.g:4925:6: ( (lv_e_6_0= ruleExprRule ) )
                            // InternalUclid.g:4926:7: (lv_e_6_0= ruleExprRule )
                            {
                            // InternalUclid.g:4926:7: (lv_e_6_0= ruleExprRule )
                            // InternalUclid.g:4927:8: lv_e_6_0= ruleExprRule
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getE11RuleAccess().getEExprRuleParserRuleCall_1_2_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_27);
                            lv_e_6_0=ruleExprRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getE11RuleRule());
                              								}
                              								add(
                              									current,
                              									"e",
                              									lv_e_6_0,
                              									"uclid.xtext.Uclid.ExprRule");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getE11RuleAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE11Rule"


    // $ANTLR start "entryRuleE12Rule"
    // InternalUclid.g:4955:1: entryRuleE12Rule returns [EObject current=null] : iv_ruleE12Rule= ruleE12Rule EOF ;
    public final EObject entryRuleE12Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE12Rule = null;


        try {
            // InternalUclid.g:4955:48: (iv_ruleE12Rule= ruleE12Rule EOF )
            // InternalUclid.g:4956:2: iv_ruleE12Rule= ruleE12Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE12RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE12Rule=ruleE12Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE12Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE12Rule"


    // $ANTLR start "ruleE12Rule"
    // InternalUclid.g:4962:1: ruleE12Rule returns [EObject current=null] : ( ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )? ) ;
    public final EObject ruleE12Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_j_0_0 = null;

        EObject lv_v_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4968:2: ( ( ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )? ) )
            // InternalUclid.g:4969:2: ( ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )? )
            {
            // InternalUclid.g:4969:2: ( ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )? )
            // InternalUclid.g:4970:3: ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )?
            {
            // InternalUclid.g:4970:3: ( (lv_j_0_0= ruleE13Rule ) )
            // InternalUclid.g:4971:4: (lv_j_0_0= ruleE13Rule )
            {
            // InternalUclid.g:4971:4: (lv_j_0_0= ruleE13Rule )
            // InternalUclid.g:4972:5: lv_j_0_0= ruleE13Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE12RuleAccess().getJE13RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_j_0_0=ruleE13Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getE12RuleRule());
              					}
              					set(
              						current,
              						"j",
              						lv_j_0_0,
              						"uclid.xtext.Uclid.E13Rule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:4989:3: (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==31) ) {
                int LA74_1 = input.LA(2);

                if ( (synpred103_InternalUclid()) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // InternalUclid.g:4990:4: otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getE12RuleAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:4994:4: ( (lv_v_2_0= ruleExprListRule ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( ((LA73_0>=RULE_ID && LA73_0<=RULE_INT)||LA73_0==RULE_STRING||LA73_0==17||LA73_0==28||LA73_0==31||LA73_0==55||(LA73_0>=64 && LA73_0<=65)||(LA73_0>=74 && LA73_0<=76)||(LA73_0>=80 && LA73_0<=81)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalUclid.g:4995:5: (lv_v_2_0= ruleExprListRule )
                            {
                            // InternalUclid.g:4995:5: (lv_v_2_0= ruleExprListRule )
                            // InternalUclid.g:4996:6: lv_v_2_0= ruleExprListRule
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getE12RuleAccess().getVExprListRuleParserRuleCall_1_1_0());
                              					
                            }
                            pushFollow(FOLLOW_19);
                            lv_v_2_0=ruleExprListRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getE12RuleRule());
                              						}
                              						set(
                              							current,
                              							"v",
                              							lv_v_2_0,
                              							"uclid.xtext.Uclid.ExprListRule");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getE12RuleAccess().getRightParenthesisKeyword_1_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE12Rule"


    // $ANTLR start "entryRuleRHSVarRef"
    // InternalUclid.g:5022:1: entryRuleRHSVarRef returns [EObject current=null] : iv_ruleRHSVarRef= ruleRHSVarRef EOF ;
    public final EObject entryRuleRHSVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRHSVarRef = null;


        try {
            // InternalUclid.g:5022:50: (iv_ruleRHSVarRef= ruleRHSVarRef EOF )
            // InternalUclid.g:5023:2: iv_ruleRHSVarRef= ruleRHSVarRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRHSVarRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRHSVarRef=ruleRHSVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRHSVarRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRHSVarRef"


    // $ANTLR start "ruleRHSVarRef"
    // InternalUclid.g:5029:1: ruleRHSVarRef returns [EObject current=null] : ruleFQN ;
    public final EObject ruleRHSVarRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUclid.g:5035:2: ( ruleFQN )
            // InternalUclid.g:5036:2: ruleFQN
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getRHSVarRefAccess().getFQNParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRHSVarRef"


    // $ANTLR start "entryRuleFunctionReference"
    // InternalUclid.g:5049:1: entryRuleFunctionReference returns [String current=null] : iv_ruleFunctionReference= ruleFunctionReference EOF ;
    public final String entryRuleFunctionReference() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionReference = null;


        try {
            // InternalUclid.g:5049:57: (iv_ruleFunctionReference= ruleFunctionReference EOF )
            // InternalUclid.g:5050:2: iv_ruleFunctionReference= ruleFunctionReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFunctionReference=ruleFunctionReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionReference.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionReference"


    // $ANTLR start "ruleFunctionReference"
    // InternalUclid.g:5056:1: ruleFunctionReference returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_FQN_0= ruleFQN ;
    public final AntlrDatatypeRuleToken ruleFunctionReference() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_FQN_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5062:2: (this_FQN_0= ruleFQN )
            // InternalUclid.g:5063:2: this_FQN_0= ruleFQN
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFunctionReferenceAccess().getFQNParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_FQN_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_FQN_0);
              	
            }
            if ( state.backtracking==0 ) {

              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionReference"


    // $ANTLR start "entryRuleTypeReference"
    // InternalUclid.g:5076:1: entryRuleTypeReference returns [EObject current=null] : iv_ruleTypeReference= ruleTypeReference EOF ;
    public final EObject entryRuleTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeReference = null;


        try {
            // InternalUclid.g:5076:54: (iv_ruleTypeReference= ruleTypeReference EOF )
            // InternalUclid.g:5077:2: iv_ruleTypeReference= ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeReference=ruleTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalUclid.g:5083:1: ruleTypeReference returns [EObject current=null] : ( (lv_decl_0_0= ruleFQN ) ) ;
    public final EObject ruleTypeReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_decl_0_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5089:2: ( ( (lv_decl_0_0= ruleFQN ) ) )
            // InternalUclid.g:5090:2: ( (lv_decl_0_0= ruleFQN ) )
            {
            // InternalUclid.g:5090:2: ( (lv_decl_0_0= ruleFQN ) )
            // InternalUclid.g:5091:3: (lv_decl_0_0= ruleFQN )
            {
            // InternalUclid.g:5091:3: (lv_decl_0_0= ruleFQN )
            // InternalUclid.g:5092:4: lv_decl_0_0= ruleFQN
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypeReferenceAccess().getDeclFQNParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_decl_0_0=ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTypeReferenceRule());
              				}
              				set(
              					current,
              					"decl",
              					lv_decl_0_0,
              					"uclid.xtext.Uclid.FQN");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleVarReference"
    // InternalUclid.g:5112:1: entryRuleVarReference returns [EObject current=null] : iv_ruleVarReference= ruleVarReference EOF ;
    public final EObject entryRuleVarReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarReference = null;


        try {
            // InternalUclid.g:5112:53: (iv_ruleVarReference= ruleVarReference EOF )
            // InternalUclid.g:5113:2: iv_ruleVarReference= ruleVarReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVarReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVarReference=ruleVarReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVarReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarReference"


    // $ANTLR start "ruleVarReference"
    // InternalUclid.g:5119:1: ruleVarReference returns [EObject current=null] : ( ruleFQN (otherlv_1= '[' ( (lv_index_2_0= ruleExprRule ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleExprRule ) ) )* otherlv_5= ']' )? (otherlv_6= '\\'' )? ) ;
    public final EObject ruleVarReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_index_2_0 = null;

        EObject lv_index_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5125:2: ( ( ruleFQN (otherlv_1= '[' ( (lv_index_2_0= ruleExprRule ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleExprRule ) ) )* otherlv_5= ']' )? (otherlv_6= '\\'' )? ) )
            // InternalUclid.g:5126:2: ( ruleFQN (otherlv_1= '[' ( (lv_index_2_0= ruleExprRule ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleExprRule ) ) )* otherlv_5= ']' )? (otherlv_6= '\\'' )? )
            {
            // InternalUclid.g:5126:2: ( ruleFQN (otherlv_1= '[' ( (lv_index_2_0= ruleExprRule ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleExprRule ) ) )* otherlv_5= ']' )? (otherlv_6= '\\'' )? )
            // InternalUclid.g:5127:3: ruleFQN (otherlv_1= '[' ( (lv_index_2_0= ruleExprRule ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleExprRule ) ) )* otherlv_5= ']' )? (otherlv_6= '\\'' )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getVarReferenceAccess().getFQNParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalUclid.g:5137:3: (otherlv_1= '[' ( (lv_index_2_0= ruleExprRule ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleExprRule ) ) )* otherlv_5= ']' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==44) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalUclid.g:5138:4: otherlv_1= '[' ( (lv_index_2_0= ruleExprRule ) ) (otherlv_3= ',' ( (lv_index_4_0= ruleExprRule ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getVarReferenceAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:5142:4: ( (lv_index_2_0= ruleExprRule ) )
                    // InternalUclid.g:5143:5: (lv_index_2_0= ruleExprRule )
                    {
                    // InternalUclid.g:5143:5: (lv_index_2_0= ruleExprRule )
                    // InternalUclid.g:5144:6: lv_index_2_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getVarReferenceAccess().getIndexExprRuleParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_61);
                    lv_index_2_0=ruleExprRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getVarReferenceRule());
                      						}
                      						add(
                      							current,
                      							"index",
                      							lv_index_2_0,
                      							"uclid.xtext.Uclid.ExprRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:5161:4: (otherlv_3= ',' ( (lv_index_4_0= ruleExprRule ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==24) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalUclid.g:5162:5: otherlv_3= ',' ( (lv_index_4_0= ruleExprRule ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_21); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getVarReferenceAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalUclid.g:5166:5: ( (lv_index_4_0= ruleExprRule ) )
                    	    // InternalUclid.g:5167:6: (lv_index_4_0= ruleExprRule )
                    	    {
                    	    // InternalUclid.g:5167:6: (lv_index_4_0= ruleExprRule )
                    	    // InternalUclid.g:5168:7: lv_index_4_0= ruleExprRule
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getVarReferenceAccess().getIndexExprRuleParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_61);
                    	    lv_index_4_0=ruleExprRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getVarReferenceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"index",
                    	      								lv_index_4_0,
                    	      								"uclid.xtext.Uclid.ExprRule");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,47,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getVarReferenceAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:5191:3: (otherlv_6= '\\'' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==78) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalUclid.g:5192:4: otherlv_6= '\\''
                    {
                    otherlv_6=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getVarReferenceAccess().getApostropheKeyword_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarReference"


    // $ANTLR start "entryRuleE13Rule"
    // InternalUclid.g:5201:1: entryRuleE13Rule returns [EObject current=null] : iv_ruleE13Rule= ruleE13Rule EOF ;
    public final EObject entryRuleE13Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE13Rule = null;


        try {
            // InternalUclid.g:5201:48: (iv_ruleE13Rule= ruleE13Rule EOF )
            // InternalUclid.g:5202:2: iv_ruleE13Rule= ruleE13Rule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getE13RuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleE13Rule=ruleE13Rule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleE13Rule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE13Rule"


    // $ANTLR start "ruleE13Rule"
    // InternalUclid.g:5208:1: ruleE13Rule returns [EObject current=null] : (this_ConstRule_0= ruleConstRule | this_RHSVarRef_1= ruleRHSVarRef | ruleFunctionReference | this_EnumRef_3= ruleEnumRef | this_TupleExpr_4= ruleTupleExpr | this_IfPrimaryExpr_5= ruleIfPrimaryExpr | this_ParenthesisExpr_6= ruleParenthesisExpr ) ;
    public final EObject ruleE13Rule() throws RecognitionException {
        EObject current = null;

        EObject this_ConstRule_0 = null;

        EObject this_RHSVarRef_1 = null;

        EObject this_EnumRef_3 = null;

        EObject this_TupleExpr_4 = null;

        EObject this_IfPrimaryExpr_5 = null;

        EObject this_ParenthesisExpr_6 = null;



        	enterRule();

        try {
            // InternalUclid.g:5214:2: ( (this_ConstRule_0= ruleConstRule | this_RHSVarRef_1= ruleRHSVarRef | ruleFunctionReference | this_EnumRef_3= ruleEnumRef | this_TupleExpr_4= ruleTupleExpr | this_IfPrimaryExpr_5= ruleIfPrimaryExpr | this_ParenthesisExpr_6= ruleParenthesisExpr ) )
            // InternalUclid.g:5215:2: (this_ConstRule_0= ruleConstRule | this_RHSVarRef_1= ruleRHSVarRef | ruleFunctionReference | this_EnumRef_3= ruleEnumRef | this_TupleExpr_4= ruleTupleExpr | this_IfPrimaryExpr_5= ruleIfPrimaryExpr | this_ParenthesisExpr_6= ruleParenthesisExpr )
            {
            // InternalUclid.g:5215:2: (this_ConstRule_0= ruleConstRule | this_RHSVarRef_1= ruleRHSVarRef | ruleFunctionReference | this_EnumRef_3= ruleEnumRef | this_TupleExpr_4= ruleTupleExpr | this_IfPrimaryExpr_5= ruleIfPrimaryExpr | this_ParenthesisExpr_6= ruleParenthesisExpr )
            int alt78=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 80:
            case 81:
                {
                alt78=1;
                }
                break;
            case RULE_ID:
                {
                int LA78_2 = input.LA(2);

                if ( (synpred108_InternalUclid()) ) {
                    alt78=2;
                }
                else if ( (synpred109_InternalUclid()) ) {
                    alt78=3;
                }
                else if ( (synpred110_InternalUclid()) ) {
                    alt78=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                alt78=5;
                }
                break;
            case 55:
                {
                alt78=6;
                }
                break;
            case 31:
                {
                alt78=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalUclid.g:5216:3: this_ConstRule_0= ruleConstRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getConstRuleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ConstRule_0=ruleConstRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ConstRule_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:5228:3: this_RHSVarRef_1= ruleRHSVarRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getRHSVarRefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RHSVarRef_1=ruleRHSVarRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RHSVarRef_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUclid.g:5240:3: ruleFunctionReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getFunctionReferenceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    ruleFunctionReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUclid.g:5251:3: this_EnumRef_3= ruleEnumRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getEnumRefParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumRef_3=ruleEnumRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumRef_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUclid.g:5263:3: this_TupleExpr_4= ruleTupleExpr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getTupleExprParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleExpr_4=ruleTupleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleExpr_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUclid.g:5275:3: this_IfPrimaryExpr_5= ruleIfPrimaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getIfPrimaryExprParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfPrimaryExpr_5=ruleIfPrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfPrimaryExpr_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUclid.g:5287:3: this_ParenthesisExpr_6= ruleParenthesisExpr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getParenthesisExprParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParenthesisExpr_6=ruleParenthesisExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParenthesisExpr_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE13Rule"


    // $ANTLR start "entryRuleEnumRef"
    // InternalUclid.g:5302:1: entryRuleEnumRef returns [EObject current=null] : iv_ruleEnumRef= ruleEnumRef EOF ;
    public final EObject entryRuleEnumRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumRef = null;


        try {
            // InternalUclid.g:5302:48: (iv_ruleEnumRef= ruleEnumRef EOF )
            // InternalUclid.g:5303:2: iv_ruleEnumRef= ruleEnumRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumRef=ruleEnumRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumRef"


    // $ANTLR start "ruleEnumRef"
    // InternalUclid.g:5309:1: ruleEnumRef returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleEnumRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUclid.g:5315:2: ( ( ( ruleFQN ) ) )
            // InternalUclid.g:5316:2: ( ( ruleFQN ) )
            {
            // InternalUclid.g:5316:2: ( ( ruleFQN ) )
            // InternalUclid.g:5317:3: ( ruleFQN )
            {
            // InternalUclid.g:5317:3: ( ruleFQN )
            // InternalUclid.g:5318:4: ruleFQN
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getEnumRefRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEnumRefAccess().get_enumEnumValueCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumRef"


    // $ANTLR start "entryRuleTupleExpr"
    // InternalUclid.g:5338:1: entryRuleTupleExpr returns [EObject current=null] : iv_ruleTupleExpr= ruleTupleExpr EOF ;
    public final EObject entryRuleTupleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleExpr = null;


        try {
            // InternalUclid.g:5338:50: (iv_ruleTupleExpr= ruleTupleExpr EOF )
            // InternalUclid.g:5339:2: iv_ruleTupleExpr= ruleTupleExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleExpr=ruleTupleExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleExpr"


    // $ANTLR start "ruleTupleExpr"
    // InternalUclid.g:5345:1: ruleTupleExpr returns [EObject current=null] : (otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTupleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_e_1_0 = null;

        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5351:2: ( (otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}' ) )
            // InternalUclid.g:5352:2: (otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}' )
            {
            // InternalUclid.g:5352:2: (otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}' )
            // InternalUclid.g:5353:3: otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleExprAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalUclid.g:5357:3: ( (lv_e_1_0= ruleExprRule ) )
            // InternalUclid.g:5358:4: (lv_e_1_0= ruleExprRule )
            {
            // InternalUclid.g:5358:4: (lv_e_1_0= ruleExprRule )
            // InternalUclid.g:5359:5: lv_e_1_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleExprAccess().getEExprRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_63);
            lv_e_1_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleExprRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_1_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:5376:3: (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==24) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalUclid.g:5377:4: otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getTupleExprAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUclid.g:5381:4: ( (lv_e_3_0= ruleExprRule ) )
            	    // InternalUclid.g:5382:5: (lv_e_3_0= ruleExprRule )
            	    {
            	    // InternalUclid.g:5382:5: (lv_e_3_0= ruleExprRule )
            	    // InternalUclid.g:5383:6: lv_e_3_0= ruleExprRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleExprAccess().getEExprRuleParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_e_3_0=ruleExprRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleExprRule());
            	      						}
            	      						add(
            	      							current,
            	      							"e",
            	      							lv_e_3_0,
            	      							"uclid.xtext.Uclid.ExprRule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getTupleExprAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleExpr"


    // $ANTLR start "entryRuleIfPrimaryExpr"
    // InternalUclid.g:5409:1: entryRuleIfPrimaryExpr returns [EObject current=null] : iv_ruleIfPrimaryExpr= ruleIfPrimaryExpr EOF ;
    public final EObject entryRuleIfPrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfPrimaryExpr = null;


        try {
            // InternalUclid.g:5409:54: (iv_ruleIfPrimaryExpr= ruleIfPrimaryExpr EOF )
            // InternalUclid.g:5410:2: iv_ruleIfPrimaryExpr= ruleIfPrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIfPrimaryExpr=ruleIfPrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfPrimaryExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIfPrimaryExpr"


    // $ANTLR start "ruleIfPrimaryExpr"
    // InternalUclid.g:5416:1: ruleIfPrimaryExpr returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) ) ) ;
    public final EObject ruleIfPrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_c_2_0 = null;

        EObject lv_e_5_0 = null;

        EObject lv_e_7_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5422:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) ) ) )
            // InternalUclid.g:5423:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) ) )
            {
            // InternalUclid.g:5423:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) ) )
            // InternalUclid.g:5424:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfPrimaryExprAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfPrimaryExprAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:5432:3: ( (lv_c_2_0= ruleExprRule ) )
            // InternalUclid.g:5433:4: (lv_c_2_0= ruleExprRule )
            {
            // InternalUclid.g:5433:4: (lv_c_2_0= ruleExprRule )
            // InternalUclid.g:5434:5: lv_c_2_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfPrimaryExprAccess().getCExprRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_c_2_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfPrimaryExprRule());
              					}
              					set(
              						current,
              						"c",
              						lv_c_2_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfPrimaryExprAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,79,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfPrimaryExprAccess().getThenKeyword_4());
              		
            }
            // InternalUclid.g:5459:3: ( (lv_e_5_0= ruleExprRule ) )
            // InternalUclid.g:5460:4: (lv_e_5_0= ruleExprRule )
            {
            // InternalUclid.g:5460:4: (lv_e_5_0= ruleExprRule )
            // InternalUclid.g:5461:5: lv_e_5_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfPrimaryExprAccess().getEExprRuleParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_65);
            lv_e_5_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfPrimaryExprRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_5_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,56,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfPrimaryExprAccess().getElseKeyword_6());
              		
            }
            // InternalUclid.g:5482:3: ( (lv_e_7_0= ruleExprRule ) )
            // InternalUclid.g:5483:4: (lv_e_7_0= ruleExprRule )
            {
            // InternalUclid.g:5483:4: (lv_e_7_0= ruleExprRule )
            // InternalUclid.g:5484:5: lv_e_7_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfPrimaryExprAccess().getEExprRuleParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_e_7_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIfPrimaryExprRule());
              					}
              					add(
              						current,
              						"e",
              						lv_e_7_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIfPrimaryExpr"


    // $ANTLR start "entryRuleParenthesisExpr"
    // InternalUclid.g:5505:1: entryRuleParenthesisExpr returns [EObject current=null] : iv_ruleParenthesisExpr= ruleParenthesisExpr EOF ;
    public final EObject entryRuleParenthesisExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpr = null;


        try {
            // InternalUclid.g:5505:56: (iv_ruleParenthesisExpr= ruleParenthesisExpr EOF )
            // InternalUclid.g:5506:2: iv_ruleParenthesisExpr= ruleParenthesisExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesisExprRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParenthesisExpr=ruleParenthesisExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesisExpr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesisExpr"


    // $ANTLR start "ruleParenthesisExpr"
    // InternalUclid.g:5512:1: ruleParenthesisExpr returns [EObject current=null] : (otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExprRule_1 = null;



        	enterRule();

        try {
            // InternalUclid.g:5518:2: ( (otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')' ) )
            // InternalUclid.g:5519:2: (otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')' )
            {
            // InternalUclid.g:5519:2: (otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')' )
            // InternalUclid.g:5520:3: otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParenthesisExprAccess().getLeftParenthesisKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getParenthesisExprAccess().getExprRuleParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_19);
            this_ExprRule_1=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExprRule_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParenthesisExprAccess().getRightParenthesisKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParenthesisExpr"


    // $ANTLR start "entryRuleConstRule"
    // InternalUclid.g:5543:1: entryRuleConstRule returns [EObject current=null] : iv_ruleConstRule= ruleConstRule EOF ;
    public final EObject entryRuleConstRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstRule = null;


        try {
            // InternalUclid.g:5543:50: (iv_ruleConstRule= ruleConstRule EOF )
            // InternalUclid.g:5544:2: iv_ruleConstRule= ruleConstRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstRule=ruleConstRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstRule"


    // $ANTLR start "ruleConstRule"
    // InternalUclid.g:5550:1: ruleConstRule returns [EObject current=null] : ( ( (lv_v_0_0= 'false' ) ) | ( (lv_v_1_0= 'true' ) ) | ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? ) | ( (lv_v_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstRule() throws RecognitionException {
        EObject current = null;

        Token lv_v_0_0=null;
        Token lv_v_1_0=null;
        Token lv_d_2_0=null;
        Token lv_w_3_0=null;
        Token lv_v_4_0=null;


        	enterRule();

        try {
            // InternalUclid.g:5556:2: ( ( ( (lv_v_0_0= 'false' ) ) | ( (lv_v_1_0= 'true' ) ) | ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? ) | ( (lv_v_4_0= RULE_STRING ) ) ) )
            // InternalUclid.g:5557:2: ( ( (lv_v_0_0= 'false' ) ) | ( (lv_v_1_0= 'true' ) ) | ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? ) | ( (lv_v_4_0= RULE_STRING ) ) )
            {
            // InternalUclid.g:5557:2: ( ( (lv_v_0_0= 'false' ) ) | ( (lv_v_1_0= 'true' ) ) | ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? ) | ( (lv_v_4_0= RULE_STRING ) ) )
            int alt81=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt81=1;
                }
                break;
            case 81:
                {
                alt81=2;
                }
                break;
            case RULE_INT:
                {
                alt81=3;
                }
                break;
            case RULE_STRING:
                {
                alt81=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalUclid.g:5558:3: ( (lv_v_0_0= 'false' ) )
                    {
                    // InternalUclid.g:5558:3: ( (lv_v_0_0= 'false' ) )
                    // InternalUclid.g:5559:4: (lv_v_0_0= 'false' )
                    {
                    // InternalUclid.g:5559:4: (lv_v_0_0= 'false' )
                    // InternalUclid.g:5560:5: lv_v_0_0= 'false'
                    {
                    lv_v_0_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_v_0_0, grammarAccess.getConstRuleAccess().getVFalseKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstRuleRule());
                      					}
                      					setWithLastConsumed(current, "v", lv_v_0_0, "false");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:5573:3: ( (lv_v_1_0= 'true' ) )
                    {
                    // InternalUclid.g:5573:3: ( (lv_v_1_0= 'true' ) )
                    // InternalUclid.g:5574:4: (lv_v_1_0= 'true' )
                    {
                    // InternalUclid.g:5574:4: (lv_v_1_0= 'true' )
                    // InternalUclid.g:5575:5: lv_v_1_0= 'true'
                    {
                    lv_v_1_0=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_v_1_0, grammarAccess.getConstRuleAccess().getVTrueKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstRuleRule());
                      					}
                      					setWithLastConsumed(current, "v", lv_v_1_0, "true");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalUclid.g:5588:3: ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? )
                    {
                    // InternalUclid.g:5588:3: ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? )
                    // InternalUclid.g:5589:4: ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )?
                    {
                    // InternalUclid.g:5589:4: ( (lv_d_2_0= RULE_INT ) )
                    // InternalUclid.g:5590:5: (lv_d_2_0= RULE_INT )
                    {
                    // InternalUclid.g:5590:5: (lv_d_2_0= RULE_INT )
                    // InternalUclid.g:5591:6: lv_d_2_0= RULE_INT
                    {
                    lv_d_2_0=(Token)match(input,RULE_INT,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_d_2_0, grammarAccess.getConstRuleAccess().getDINTTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getConstRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"d",
                      							lv_d_2_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    // InternalUclid.g:5607:4: ( (lv_w_3_0= RULE_BV ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_BV) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalUclid.g:5608:5: (lv_w_3_0= RULE_BV )
                            {
                            // InternalUclid.g:5608:5: (lv_w_3_0= RULE_BV )
                            // InternalUclid.g:5609:6: lv_w_3_0= RULE_BV
                            {
                            lv_w_3_0=(Token)match(input,RULE_BV,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(lv_w_3_0, grammarAccess.getConstRuleAccess().getWBVTerminalRuleCall_2_1_0());
                              					
                            }
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElement(grammarAccess.getConstRuleRule());
                              						}
                              						setWithLastConsumed(
                              							current,
                              							"w",
                              							lv_w_3_0,
                              							"uclid.xtext.Uclid.BV");
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalUclid.g:5627:3: ( (lv_v_4_0= RULE_STRING ) )
                    {
                    // InternalUclid.g:5627:3: ( (lv_v_4_0= RULE_STRING ) )
                    // InternalUclid.g:5628:4: (lv_v_4_0= RULE_STRING )
                    {
                    // InternalUclid.g:5628:4: (lv_v_4_0= RULE_STRING )
                    // InternalUclid.g:5629:5: lv_v_4_0= RULE_STRING
                    {
                    lv_v_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_v_4_0, grammarAccess.getConstRuleAccess().getVSTRINGTerminalRuleCall_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getConstRuleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"v",
                      						lv_v_4_0,
                      						"uclid.xtext.Uclid.STRING");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstRule"


    // $ANTLR start "entryRuleTypeRule"
    // InternalUclid.g:5649:1: entryRuleTypeRule returns [EObject current=null] : iv_ruleTypeRule= ruleTypeRule EOF ;
    public final EObject entryRuleTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRule = null;


        try {
            // InternalUclid.g:5649:49: (iv_ruleTypeRule= ruleTypeRule EOF )
            // InternalUclid.g:5650:2: iv_ruleTypeRule= ruleTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeRule=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeRule"


    // $ANTLR start "ruleTypeRule"
    // InternalUclid.g:5656:1: ruleTypeRule returns [EObject current=null] : (this_PrimitiveTypeRule_0= rulePrimitiveTypeRule | this_EnumTypeRule_1= ruleEnumTypeRule | this_TupleTypeRule_2= ruleTupleTypeRule | this_RecordTypeRule_3= ruleRecordTypeRule | this_ArrayTypeRule_4= ruleArrayTypeRule | this_TypeReference_5= ruleTypeReference ) ;
    public final EObject ruleTypeRule() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeRule_0 = null;

        EObject this_EnumTypeRule_1 = null;

        EObject this_TupleTypeRule_2 = null;

        EObject this_RecordTypeRule_3 = null;

        EObject this_ArrayTypeRule_4 = null;

        EObject this_TypeReference_5 = null;



        	enterRule();

        try {
            // InternalUclid.g:5662:2: ( (this_PrimitiveTypeRule_0= rulePrimitiveTypeRule | this_EnumTypeRule_1= ruleEnumTypeRule | this_TupleTypeRule_2= ruleTupleTypeRule | this_RecordTypeRule_3= ruleRecordTypeRule | this_ArrayTypeRule_4= ruleArrayTypeRule | this_TypeReference_5= ruleTypeReference ) )
            // InternalUclid.g:5663:2: (this_PrimitiveTypeRule_0= rulePrimitiveTypeRule | this_EnumTypeRule_1= ruleEnumTypeRule | this_TupleTypeRule_2= ruleTupleTypeRule | this_RecordTypeRule_3= ruleRecordTypeRule | this_ArrayTypeRule_4= ruleArrayTypeRule | this_TypeReference_5= ruleTypeReference )
            {
            // InternalUclid.g:5663:2: (this_PrimitiveTypeRule_0= rulePrimitiveTypeRule | this_EnumTypeRule_1= ruleEnumTypeRule | this_TupleTypeRule_2= ruleTupleTypeRule | this_RecordTypeRule_3= ruleRecordTypeRule | this_ArrayTypeRule_4= ruleArrayTypeRule | this_TypeReference_5= ruleTypeReference )
            int alt82=6;
            switch ( input.LA(1) ) {
            case RULE_BV:
            case 82:
            case 83:
                {
                alt82=1;
                }
                break;
            case 84:
                {
                alt82=2;
                }
                break;
            case 17:
                {
                alt82=3;
                }
                break;
            case 85:
                {
                alt82=4;
                }
                break;
            case 44:
                {
                alt82=5;
                }
                break;
            case RULE_ID:
                {
                alt82=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalUclid.g:5664:3: this_PrimitiveTypeRule_0= rulePrimitiveTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRuleAccess().getPrimitiveTypeRuleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeRule_0=rulePrimitiveTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrimitiveTypeRule_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:5676:3: this_EnumTypeRule_1= ruleEnumTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRuleAccess().getEnumTypeRuleParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumTypeRule_1=ruleEnumTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumTypeRule_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUclid.g:5688:3: this_TupleTypeRule_2= ruleTupleTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRuleAccess().getTupleTypeRuleParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleTypeRule_2=ruleTupleTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleTypeRule_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUclid.g:5700:3: this_RecordTypeRule_3= ruleRecordTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRuleAccess().getRecordTypeRuleParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RecordTypeRule_3=ruleRecordTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RecordTypeRule_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUclid.g:5712:3: this_ArrayTypeRule_4= ruleArrayTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRuleAccess().getArrayTypeRuleParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArrayTypeRule_4=ruleArrayTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArrayTypeRule_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUclid.g:5724:3: this_TypeReference_5= ruleTypeReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRuleAccess().getTypeReferenceParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TypeReference_5=ruleTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeReference_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRule"


    // $ANTLR start "entryRulePrimitiveTypeRule"
    // InternalUclid.g:5739:1: entryRulePrimitiveTypeRule returns [EObject current=null] : iv_rulePrimitiveTypeRule= rulePrimitiveTypeRule EOF ;
    public final EObject entryRulePrimitiveTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeRule = null;


        try {
            // InternalUclid.g:5739:58: (iv_rulePrimitiveTypeRule= rulePrimitiveTypeRule EOF )
            // InternalUclid.g:5740:2: iv_rulePrimitiveTypeRule= rulePrimitiveTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimitiveTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeRule=rulePrimitiveTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimitiveTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveTypeRule"


    // $ANTLR start "rulePrimitiveTypeRule"
    // InternalUclid.g:5746:1: rulePrimitiveTypeRule returns [EObject current=null] : ( ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) ) ) ;
    public final EObject rulePrimitiveTypeRule() throws RecognitionException {
        EObject current = null;

        Token lv_t_0_1=null;
        Token lv_t_0_2=null;
        Token lv_t_0_3=null;


        	enterRule();

        try {
            // InternalUclid.g:5752:2: ( ( ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) ) ) )
            // InternalUclid.g:5753:2: ( ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) ) )
            {
            // InternalUclid.g:5753:2: ( ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) ) )
            // InternalUclid.g:5754:3: ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) )
            {
            // InternalUclid.g:5754:3: ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) )
            // InternalUclid.g:5755:4: (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV )
            {
            // InternalUclid.g:5755:4: (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt83=1;
                }
                break;
            case 83:
                {
                alt83=2;
                }
                break;
            case RULE_BV:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalUclid.g:5756:5: lv_t_0_1= 'boolean'
                    {
                    lv_t_0_1=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_t_0_1, grammarAccess.getPrimitiveTypeRuleAccess().getTBooleanKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeRuleRule());
                      					}
                      					setWithLastConsumed(current, "t", lv_t_0_1, null);
                      				
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:5767:5: lv_t_0_2= 'integer'
                    {
                    lv_t_0_2=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_t_0_2, grammarAccess.getPrimitiveTypeRuleAccess().getTIntegerKeyword_0_1());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeRuleRule());
                      					}
                      					setWithLastConsumed(current, "t", lv_t_0_2, null);
                      				
                    }

                    }
                    break;
                case 3 :
                    // InternalUclid.g:5778:5: lv_t_0_3= RULE_BV
                    {
                    lv_t_0_3=(Token)match(input,RULE_BV,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_t_0_3, grammarAccess.getPrimitiveTypeRuleAccess().getTBVTerminalRuleCall_0_2());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getPrimitiveTypeRuleRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"t",
                      						lv_t_0_3,
                      						"uclid.xtext.Uclid.BV");
                      				
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveTypeRule"


    // $ANTLR start "entryRuleEnumTypeRule"
    // InternalUclid.g:5798:1: entryRuleEnumTypeRule returns [EObject current=null] : iv_ruleEnumTypeRule= ruleEnumTypeRule EOF ;
    public final EObject entryRuleEnumTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeRule = null;


        try {
            // InternalUclid.g:5798:53: (iv_ruleEnumTypeRule= ruleEnumTypeRule EOF )
            // InternalUclid.g:5799:2: iv_ruleEnumTypeRule= ruleEnumTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumTypeRule=ruleEnumTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumTypeRule"


    // $ANTLR start "ruleEnumTypeRule"
    // InternalUclid.g:5805:1: ruleEnumTypeRule returns [EObject current=null] : ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_enums_3_0 = null;

        EObject lv_enums_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5811:2: ( ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}' ) )
            // InternalUclid.g:5812:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}' )
            {
            // InternalUclid.g:5812:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}' )
            // InternalUclid.g:5813:3: () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}'
            {
            // InternalUclid.g:5813:3: ()
            // InternalUclid.g:5814:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumTypeRuleAccess().getEnumTypeRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumTypeRuleAccess().getEnumKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumTypeRuleAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUclid.g:5831:3: ( (lv_enums_3_0= ruleEnumValue ) )
            // InternalUclid.g:5832:4: (lv_enums_3_0= ruleEnumValue )
            {
            // InternalUclid.g:5832:4: (lv_enums_3_0= ruleEnumValue )
            // InternalUclid.g:5833:5: lv_enums_3_0= ruleEnumValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumTypeRuleAccess().getEnumsEnumValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_63);
            lv_enums_3_0=ruleEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEnumTypeRuleRule());
              					}
              					add(
              						current,
              						"enums",
              						lv_enums_3_0,
              						"uclid.xtext.Uclid.EnumValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:5850:3: (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==24) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalUclid.g:5851:4: otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getEnumTypeRuleAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalUclid.g:5855:4: ( (lv_enums_5_0= ruleEnumValue ) )
            	    // InternalUclid.g:5856:5: (lv_enums_5_0= ruleEnumValue )
            	    {
            	    // InternalUclid.g:5856:5: (lv_enums_5_0= ruleEnumValue )
            	    // InternalUclid.g:5857:6: lv_enums_5_0= ruleEnumValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumTypeRuleAccess().getEnumsEnumValueParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_enums_5_0=ruleEnumValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEnumTypeRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"enums",
            	      							lv_enums_5_0,
            	      							"uclid.xtext.Uclid.EnumValue");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEnumTypeRuleAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumTypeRule"


    // $ANTLR start "entryRuleEnumValue"
    // InternalUclid.g:5883:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalUclid.g:5883:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalUclid.g:5884:2: iv_ruleEnumValue= ruleEnumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEnumValue=ruleEnumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumValue"


    // $ANTLR start "ruleEnumValue"
    // InternalUclid.g:5890:1: ruleEnumValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUclid.g:5896:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUclid.g:5897:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUclid.g:5897:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUclid.g:5898:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalUclid.g:5898:3: ()
            // InternalUclid.g:5899:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEnumValueAccess().getEnumValueAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:5908:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUclid.g:5909:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUclid.g:5909:4: (lv_name_1_0= RULE_ID )
            // InternalUclid.g:5910:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEnumValueAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEnumValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumValue"


    // $ANTLR start "entryRuleTupleTypeRule"
    // InternalUclid.g:5930:1: entryRuleTupleTypeRule returns [EObject current=null] : iv_ruleTupleTypeRule= ruleTupleTypeRule EOF ;
    public final EObject entryRuleTupleTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeRule = null;


        try {
            // InternalUclid.g:5930:54: (iv_ruleTupleTypeRule= ruleTupleTypeRule EOF )
            // InternalUclid.g:5931:2: iv_ruleTupleTypeRule= ruleTupleTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTupleTypeRule=ruleTupleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTupleTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTupleTypeRule"


    // $ANTLR start "ruleTupleTypeRule"
    // InternalUclid.g:5937:1: ruleTupleTypeRule returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tuple_2_0 = null;

        EObject lv_tuple_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5943:2: ( ( () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}' ) )
            // InternalUclid.g:5944:2: ( () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}' )
            {
            // InternalUclid.g:5944:2: ( () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}' )
            // InternalUclid.g:5945:3: () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}'
            {
            // InternalUclid.g:5945:3: ()
            // InternalUclid.g:5946:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTupleTypeRuleAccess().getTupleTypeRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleTypeRuleAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUclid.g:5959:3: ( (lv_tuple_2_0= ruleTypeRule ) )
            // InternalUclid.g:5960:4: (lv_tuple_2_0= ruleTypeRule )
            {
            // InternalUclid.g:5960:4: (lv_tuple_2_0= ruleTypeRule )
            // InternalUclid.g:5961:5: lv_tuple_2_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleTypeRuleAccess().getTupleTypeRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_63);
            lv_tuple_2_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTupleTypeRuleRule());
              					}
              					add(
              						current,
              						"tuple",
              						lv_tuple_2_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:5978:3: (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==24) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalUclid.g:5979:4: otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleTypeRuleAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalUclid.g:5983:4: ( (lv_tuple_4_0= ruleTypeRule ) )
            	    // InternalUclid.g:5984:5: (lv_tuple_4_0= ruleTypeRule )
            	    {
            	    // InternalUclid.g:5984:5: (lv_tuple_4_0= ruleTypeRule )
            	    // InternalUclid.g:5985:6: lv_tuple_4_0= ruleTypeRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleTypeRuleAccess().getTupleTypeRuleParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_63);
            	    lv_tuple_4_0=ruleTypeRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getTupleTypeRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"tuple",
            	      							lv_tuple_4_0,
            	      							"uclid.xtext.Uclid.TypeRule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getTupleTypeRuleAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTupleTypeRule"


    // $ANTLR start "entryRuleRecordTypeRule"
    // InternalUclid.g:6011:1: entryRuleRecordTypeRule returns [EObject current=null] : iv_ruleRecordTypeRule= ruleRecordTypeRule EOF ;
    public final EObject entryRuleRecordTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTypeRule = null;


        try {
            // InternalUclid.g:6011:55: (iv_ruleRecordTypeRule= ruleRecordTypeRule EOF )
            // InternalUclid.g:6012:2: iv_ruleRecordTypeRule= ruleRecordTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRecordTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRecordTypeRule=ruleRecordTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRecordTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordTypeRule"


    // $ANTLR start "ruleRecordTypeRule"
    // InternalUclid.g:6018:1: ruleRecordTypeRule returns [EObject current=null] : ( () otherlv_1= 'record' otherlv_2= '{' ( ( ( (lv_fields_3_0= ruleVarDecl ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )* otherlv_6= ':' ( (lv_type_7_0= ruleTypeRule ) ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleVarDecl ) ) (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )* otherlv_12= ':' ( (lv_type_13_0= ruleTypeRule ) ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleRecordTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_fields_3_0 = null;

        EObject lv_fields_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_fields_9_0 = null;

        EObject lv_fields_11_0 = null;

        EObject lv_type_13_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:6024:2: ( ( () otherlv_1= 'record' otherlv_2= '{' ( ( ( (lv_fields_3_0= ruleVarDecl ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )* otherlv_6= ':' ( (lv_type_7_0= ruleTypeRule ) ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleVarDecl ) ) (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )* otherlv_12= ':' ( (lv_type_13_0= ruleTypeRule ) ) )* )? otherlv_14= '}' ) )
            // InternalUclid.g:6025:2: ( () otherlv_1= 'record' otherlv_2= '{' ( ( ( (lv_fields_3_0= ruleVarDecl ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )* otherlv_6= ':' ( (lv_type_7_0= ruleTypeRule ) ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleVarDecl ) ) (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )* otherlv_12= ':' ( (lv_type_13_0= ruleTypeRule ) ) )* )? otherlv_14= '}' )
            {
            // InternalUclid.g:6025:2: ( () otherlv_1= 'record' otherlv_2= '{' ( ( ( (lv_fields_3_0= ruleVarDecl ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )* otherlv_6= ':' ( (lv_type_7_0= ruleTypeRule ) ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleVarDecl ) ) (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )* otherlv_12= ':' ( (lv_type_13_0= ruleTypeRule ) ) )* )? otherlv_14= '}' )
            // InternalUclid.g:6026:3: () otherlv_1= 'record' otherlv_2= '{' ( ( ( (lv_fields_3_0= ruleVarDecl ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )* otherlv_6= ':' ( (lv_type_7_0= ruleTypeRule ) ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleVarDecl ) ) (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )* otherlv_12= ':' ( (lv_type_13_0= ruleTypeRule ) ) )* )? otherlv_14= '}'
            {
            // InternalUclid.g:6026:3: ()
            // InternalUclid.g:6027:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRecordTypeRuleAccess().getRecordTypeRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,85,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRecordTypeRuleAccess().getRecordKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRecordTypeRuleAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUclid.g:6044:3: ( ( ( (lv_fields_3_0= ruleVarDecl ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )* otherlv_6= ':' ( (lv_type_7_0= ruleTypeRule ) ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleVarDecl ) ) (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )* otherlv_12= ':' ( (lv_type_13_0= ruleTypeRule ) ) )* )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalUclid.g:6045:4: ( ( (lv_fields_3_0= ruleVarDecl ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )* otherlv_6= ':' ( (lv_type_7_0= ruleTypeRule ) ) ) (otherlv_8= ',' ( (lv_fields_9_0= ruleVarDecl ) ) (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )* otherlv_12= ':' ( (lv_type_13_0= ruleTypeRule ) ) )*
                    {
                    // InternalUclid.g:6045:4: ( ( (lv_fields_3_0= ruleVarDecl ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )* otherlv_6= ':' ( (lv_type_7_0= ruleTypeRule ) ) )
                    // InternalUclid.g:6046:5: ( (lv_fields_3_0= ruleVarDecl ) ) (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )* otherlv_6= ':' ( (lv_type_7_0= ruleTypeRule ) )
                    {
                    // InternalUclid.g:6046:5: ( (lv_fields_3_0= ruleVarDecl ) )
                    // InternalUclid.g:6047:6: (lv_fields_3_0= ruleVarDecl )
                    {
                    // InternalUclid.g:6047:6: (lv_fields_3_0= ruleVarDecl )
                    // InternalUclid.g:6048:7: lv_fields_3_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getRecordTypeRuleAccess().getFieldsVarDeclParserRuleCall_3_0_0_0());
                      						
                    }
                    pushFollow(FOLLOW_13);
                    lv_fields_3_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getRecordTypeRuleRule());
                      							}
                      							add(
                      								current,
                      								"fields",
                      								lv_fields_3_0,
                      								"uclid.xtext.Uclid.VarDecl");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalUclid.g:6065:5: (otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==24) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalUclid.g:6066:6: otherlv_4= ',' ( (lv_fields_5_0= ruleVarDecl ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getRecordTypeRuleAccess().getCommaKeyword_3_0_1_0());
                    	      					
                    	    }
                    	    // InternalUclid.g:6070:6: ( (lv_fields_5_0= ruleVarDecl ) )
                    	    // InternalUclid.g:6071:7: (lv_fields_5_0= ruleVarDecl )
                    	    {
                    	    // InternalUclid.g:6071:7: (lv_fields_5_0= ruleVarDecl )
                    	    // InternalUclid.g:6072:8: lv_fields_5_0= ruleVarDecl
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getRecordTypeRuleAccess().getFieldsVarDeclParserRuleCall_3_0_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_fields_5_0=ruleVarDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getRecordTypeRuleRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"fields",
                    	      									lv_fields_5_0,
                    	      									"uclid.xtext.Uclid.VarDecl");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getRecordTypeRuleAccess().getColonKeyword_3_0_2());
                      				
                    }
                    // InternalUclid.g:6094:5: ( (lv_type_7_0= ruleTypeRule ) )
                    // InternalUclid.g:6095:6: (lv_type_7_0= ruleTypeRule )
                    {
                    // InternalUclid.g:6095:6: (lv_type_7_0= ruleTypeRule )
                    // InternalUclid.g:6096:7: lv_type_7_0= ruleTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getRecordTypeRuleAccess().getTypeTypeRuleParserRuleCall_3_0_3_0());
                      						
                    }
                    pushFollow(FOLLOW_63);
                    lv_type_7_0=ruleTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getRecordTypeRuleRule());
                      							}
                      							set(
                      								current,
                      								"type",
                      								lv_type_7_0,
                      								"uclid.xtext.Uclid.TypeRule");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }


                    }

                    // InternalUclid.g:6114:4: (otherlv_8= ',' ( (lv_fields_9_0= ruleVarDecl ) ) (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )* otherlv_12= ':' ( (lv_type_13_0= ruleTypeRule ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==24) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // InternalUclid.g:6115:5: otherlv_8= ',' ( (lv_fields_9_0= ruleVarDecl ) ) (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )* otherlv_12= ':' ( (lv_type_13_0= ruleTypeRule ) )
                    	    {
                    	    otherlv_8=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_8, grammarAccess.getRecordTypeRuleAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalUclid.g:6119:5: ( (lv_fields_9_0= ruleVarDecl ) )
                    	    // InternalUclid.g:6120:6: (lv_fields_9_0= ruleVarDecl )
                    	    {
                    	    // InternalUclid.g:6120:6: (lv_fields_9_0= ruleVarDecl )
                    	    // InternalUclid.g:6121:7: lv_fields_9_0= ruleVarDecl
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRecordTypeRuleAccess().getFieldsVarDeclParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_fields_9_0=ruleVarDecl();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRecordTypeRuleRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"fields",
                    	      								lv_fields_9_0,
                    	      								"uclid.xtext.Uclid.VarDecl");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    // InternalUclid.g:6138:5: (otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) ) )*
                    	    loop87:
                    	    do {
                    	        int alt87=2;
                    	        int LA87_0 = input.LA(1);

                    	        if ( (LA87_0==24) ) {
                    	            alt87=1;
                    	        }


                    	        switch (alt87) {
                    	    	case 1 :
                    	    	    // InternalUclid.g:6139:6: otherlv_10= ',' ( (lv_fields_11_0= ruleVarDecl ) )
                    	    	    {
                    	    	    otherlv_10=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      						newLeafNode(otherlv_10, grammarAccess.getRecordTypeRuleAccess().getCommaKeyword_3_1_2_0());
                    	    	      					
                    	    	    }
                    	    	    // InternalUclid.g:6143:6: ( (lv_fields_11_0= ruleVarDecl ) )
                    	    	    // InternalUclid.g:6144:7: (lv_fields_11_0= ruleVarDecl )
                    	    	    {
                    	    	    // InternalUclid.g:6144:7: (lv_fields_11_0= ruleVarDecl )
                    	    	    // InternalUclid.g:6145:8: lv_fields_11_0= ruleVarDecl
                    	    	    {
                    	    	    if ( state.backtracking==0 ) {

                    	    	      								newCompositeNode(grammarAccess.getRecordTypeRuleAccess().getFieldsVarDeclParserRuleCall_3_1_2_1_0());
                    	    	      							
                    	    	    }
                    	    	    pushFollow(FOLLOW_13);
                    	    	    lv_fields_11_0=ruleVarDecl();

                    	    	    state._fsp--;
                    	    	    if (state.failed) return current;
                    	    	    if ( state.backtracking==0 ) {

                    	    	      								if (current==null) {
                    	    	      									current = createModelElementForParent(grammarAccess.getRecordTypeRuleRule());
                    	    	      								}
                    	    	      								add(
                    	    	      									current,
                    	    	      									"fields",
                    	    	      									lv_fields_11_0,
                    	    	      									"uclid.xtext.Uclid.VarDecl");
                    	    	      								afterParserOrEnumRuleCall();
                    	    	      							
                    	    	    }

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop87;
                    	        }
                    	    } while (true);

                    	    otherlv_12=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getRecordTypeRuleAccess().getColonKeyword_3_1_3());
                    	      				
                    	    }
                    	    // InternalUclid.g:6167:5: ( (lv_type_13_0= ruleTypeRule ) )
                    	    // InternalUclid.g:6168:6: (lv_type_13_0= ruleTypeRule )
                    	    {
                    	    // InternalUclid.g:6168:6: (lv_type_13_0= ruleTypeRule )
                    	    // InternalUclid.g:6169:7: lv_type_13_0= ruleTypeRule
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRecordTypeRuleAccess().getTypeTypeRuleParserRuleCall_3_1_4_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_63);
                    	    lv_type_13_0=ruleTypeRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRecordTypeRuleRule());
                    	      							}
                    	      							set(
                    	      								current,
                    	      								"type",
                    	      								lv_type_13_0,
                    	      								"uclid.xtext.Uclid.TypeRule");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getRecordTypeRuleAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordTypeRule"


    // $ANTLR start "entryRuleArrayTypeRule"
    // InternalUclid.g:6196:1: entryRuleArrayTypeRule returns [EObject current=null] : iv_ruleArrayTypeRule= ruleArrayTypeRule EOF ;
    public final EObject entryRuleArrayTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeRule = null;


        try {
            // InternalUclid.g:6196:54: (iv_ruleArrayTypeRule= ruleArrayTypeRule EOF )
            // InternalUclid.g:6197:2: iv_ruleArrayTypeRule= ruleArrayTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArrayTypeRule=ruleArrayTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArrayTypeRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayTypeRule"


    // $ANTLR start "ruleArrayTypeRule"
    // InternalUclid.g:6203:1: ruleArrayTypeRule returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) ) ) ;
    public final EObject ruleArrayTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_b_2_0 = null;

        EObject lv_b_4_0 = null;

        EObject lv_base_6_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:6209:2: ( ( () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) ) ) )
            // InternalUclid.g:6210:2: ( () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) ) )
            {
            // InternalUclid.g:6210:2: ( () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) ) )
            // InternalUclid.g:6211:3: () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) )
            {
            // InternalUclid.g:6211:3: ()
            // InternalUclid.g:6212:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getArrayTypeRuleAccess().getArrayTypeRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayTypeRuleAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalUclid.g:6225:3: ( (lv_b_2_0= ruleTypeRule ) )
            // InternalUclid.g:6226:4: (lv_b_2_0= ruleTypeRule )
            {
            // InternalUclid.g:6226:4: (lv_b_2_0= ruleTypeRule )
            // InternalUclid.g:6227:5: lv_b_2_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayTypeRuleAccess().getBTypeRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_61);
            lv_b_2_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayTypeRuleRule());
              					}
              					add(
              						current,
              						"b",
              						lv_b_2_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:6244:3: (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==24) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalUclid.g:6245:4: otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getArrayTypeRuleAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalUclid.g:6249:4: ( (lv_b_4_0= ruleTypeRule ) )
            	    // InternalUclid.g:6250:5: (lv_b_4_0= ruleTypeRule )
            	    {
            	    // InternalUclid.g:6250:5: (lv_b_4_0= ruleTypeRule )
            	    // InternalUclid.g:6251:6: lv_b_4_0= ruleTypeRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArrayTypeRuleAccess().getBTypeRuleParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_b_4_0=ruleTypeRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getArrayTypeRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"b",
            	      							lv_b_4_0,
            	      							"uclid.xtext.Uclid.TypeRule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            otherlv_5=(Token)match(input,47,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArrayTypeRuleAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalUclid.g:6273:3: ( (lv_base_6_0= ruleTypeRule ) )
            // InternalUclid.g:6274:4: (lv_base_6_0= ruleTypeRule )
            {
            // InternalUclid.g:6274:4: (lv_base_6_0= ruleTypeRule )
            // InternalUclid.g:6275:5: lv_base_6_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayTypeRuleAccess().getBaseTypeRuleParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_base_6_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArrayTypeRuleRule());
              					}
              					add(
              						current,
              						"base",
              						lv_base_6_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayTypeRule"


    // $ANTLR start "entryRuleControlBlockRule"
    // InternalUclid.g:6296:1: entryRuleControlBlockRule returns [EObject current=null] : iv_ruleControlBlockRule= ruleControlBlockRule EOF ;
    public final EObject entryRuleControlBlockRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlBlockRule = null;


        try {
            // InternalUclid.g:6296:57: (iv_ruleControlBlockRule= ruleControlBlockRule EOF )
            // InternalUclid.g:6297:2: iv_ruleControlBlockRule= ruleControlBlockRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getControlBlockRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleControlBlockRule=ruleControlBlockRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleControlBlockRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleControlBlockRule"


    // $ANTLR start "ruleControlBlockRule"
    // InternalUclid.g:6303:1: ruleControlBlockRule returns [EObject current=null] : ( () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleControlBlockRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cmd_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:6309:2: ( ( () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}' ) )
            // InternalUclid.g:6310:2: ( () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}' )
            {
            // InternalUclid.g:6310:2: ( () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}' )
            // InternalUclid.g:6311:3: () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}'
            {
            // InternalUclid.g:6311:3: ()
            // InternalUclid.g:6312:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getControlBlockRuleAccess().getControlBlockRuleAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,86,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getControlBlockRuleAccess().getControlKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,17,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getControlBlockRuleAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUclid.g:6329:3: ( (lv_cmd_3_0= ruleCmdRule ) )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==RULE_ID||(LA91_0>=87 && LA91_0<=98)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalUclid.g:6330:4: (lv_cmd_3_0= ruleCmdRule )
            	    {
            	    // InternalUclid.g:6330:4: (lv_cmd_3_0= ruleCmdRule )
            	    // InternalUclid.g:6331:5: lv_cmd_3_0= ruleCmdRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getControlBlockRuleAccess().getCmdCmdRuleParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_68);
            	    lv_cmd_3_0=ruleCmdRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getControlBlockRuleRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cmd",
            	      						lv_cmd_3_0,
            	      						"uclid.xtext.Uclid.CmdRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getControlBlockRuleAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleControlBlockRule"


    // $ANTLR start "entryRuleCmdRule"
    // InternalUclid.g:6356:1: entryRuleCmdRule returns [EObject current=null] : iv_ruleCmdRule= ruleCmdRule EOF ;
    public final EObject entryRuleCmdRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmdRule = null;


        try {
            // InternalUclid.g:6356:48: (iv_ruleCmdRule= ruleCmdRule EOF )
            // InternalUclid.g:6357:2: iv_ruleCmdRule= ruleCmdRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCmdRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCmdRule=ruleCmdRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCmdRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmdRule"


    // $ANTLR start "ruleCmdRule"
    // InternalUclid.g:6363:1: ruleCmdRule returns [EObject current=null] : ( ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';' ) ;
    public final EObject ruleCmdRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ID_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_lhs_0_0 = null;

        AntlrDatatypeRuleToken lv_c_4_0 = null;

        EObject lv_lid_6_0 = null;

        EObject lv_lex_9_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:6369:2: ( ( ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';' ) )
            // InternalUclid.g:6370:2: ( ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';' )
            {
            // InternalUclid.g:6370:2: ( ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';' )
            // InternalUclid.g:6371:3: ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';'
            {
            // InternalUclid.g:6371:3: ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==RULE_ID) ) {
                int LA92_1 = input.LA(2);

                if ( (LA92_1==21) ) {
                    alt92=1;
                }
            }
            switch (alt92) {
                case 1 :
                    // InternalUclid.g:6372:4: ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '='
                    {
                    // InternalUclid.g:6372:4: ( (lv_lhs_0_0= ruleVarDecl ) )
                    // InternalUclid.g:6373:5: (lv_lhs_0_0= ruleVarDecl )
                    {
                    // InternalUclid.g:6373:5: (lv_lhs_0_0= ruleVarDecl )
                    // InternalUclid.g:6374:6: lv_lhs_0_0= ruleVarDecl
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCmdRuleAccess().getLhsVarDeclParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_lhs_0_0=ruleVarDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCmdRuleRule());
                      						}
                      						set(
                      							current,
                      							"lhs",
                      							lv_lhs_0_0,
                      							"uclid.xtext.Uclid.VarDecl");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCmdRuleAccess().getEqualsSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:6396:3: (this_ID_2= RULE_ID otherlv_3= '.' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_ID) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalUclid.g:6397:4: this_ID_2= RULE_ID otherlv_3= '.'
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getCmdRuleAccess().getIDTerminalRuleCall_1_0());
                      			
                    }
                    otherlv_3=(Token)match(input,15,FOLLOW_69); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCmdRuleAccess().getFullStopKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:6406:3: ( (lv_c_4_0= ruleCmdNameRule ) )
            // InternalUclid.g:6407:4: (lv_c_4_0= ruleCmdNameRule )
            {
            // InternalUclid.g:6407:4: (lv_c_4_0= ruleCmdNameRule )
            // InternalUclid.g:6408:5: lv_c_4_0= ruleCmdNameRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCmdRuleAccess().getCCmdNameRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_71);
            lv_c_4_0=ruleCmdNameRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCmdRuleRule());
              					}
              					set(
              						current,
              						"c",
              						lv_c_4_0,
              						"uclid.xtext.Uclid.CmdNameRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:6425:3: (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==44) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalUclid.g:6426:4: otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,44,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getCmdRuleAccess().getLeftSquareBracketKeyword_3_0());
                      			
                    }
                    // InternalUclid.g:6430:4: ( (lv_lid_6_0= ruleIdListRule ) )
                    // InternalUclid.g:6431:5: (lv_lid_6_0= ruleIdListRule )
                    {
                    // InternalUclid.g:6431:5: (lv_lid_6_0= ruleIdListRule )
                    // InternalUclid.g:6432:6: lv_lid_6_0= ruleIdListRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCmdRuleAccess().getLidIdListRuleParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_27);
                    lv_lid_6_0=ruleIdListRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCmdRuleRule());
                      						}
                      						set(
                      							current,
                      							"lid",
                      							lv_lid_6_0,
                      							"uclid.xtext.Uclid.IdListRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,47,FOLLOW_72); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getCmdRuleAccess().getRightSquareBracketKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:6454:3: (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==31) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalUclid.g:6455:4: otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getCmdRuleAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalUclid.g:6459:4: ( (lv_lex_9_0= ruleExprListRule ) )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( ((LA95_0>=RULE_ID && LA95_0<=RULE_INT)||LA95_0==RULE_STRING||LA95_0==17||LA95_0==28||LA95_0==31||LA95_0==55||(LA95_0>=64 && LA95_0<=65)||(LA95_0>=74 && LA95_0<=76)||(LA95_0>=80 && LA95_0<=81)) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // InternalUclid.g:6460:5: (lv_lex_9_0= ruleExprListRule )
                            {
                            // InternalUclid.g:6460:5: (lv_lex_9_0= ruleExprListRule )
                            // InternalUclid.g:6461:6: lv_lex_9_0= ruleExprListRule
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getCmdRuleAccess().getLexExprListRuleParserRuleCall_4_1_0());
                              					
                            }
                            pushFollow(FOLLOW_19);
                            lv_lex_9_0=ruleExprListRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getCmdRuleRule());
                              						}
                              						set(
                              							current,
                              							"lex",
                              							lv_lex_9_0,
                              							"uclid.xtext.Uclid.ExprListRule");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,32,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getCmdRuleAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_11=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getCmdRuleAccess().getSemicolonKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmdRule"


    // $ANTLR start "entryRuleCmdNameRule"
    // InternalUclid.g:6491:1: entryRuleCmdNameRule returns [String current=null] : iv_ruleCmdNameRule= ruleCmdNameRule EOF ;
    public final String entryRuleCmdNameRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCmdNameRule = null;


        try {
            // InternalUclid.g:6491:51: (iv_ruleCmdNameRule= ruleCmdNameRule EOF )
            // InternalUclid.g:6492:2: iv_ruleCmdNameRule= ruleCmdNameRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCmdNameRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCmdNameRule=ruleCmdNameRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCmdNameRule.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCmdNameRule"


    // $ANTLR start "ruleCmdNameRule"
    // InternalUclid.g:6498:1: ruleCmdNameRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bmc' | kw= 'check' | kw= 'clear_context' | kw= 'induction' | kw= 'print' | kw= 'print_cex' | kw= 'print_module' | kw= 'print_results' | kw= 'print_smt2' | kw= 'synthesize_invariant' | kw= 'unroll' | kw= 'verify' ) ;
    public final AntlrDatatypeRuleToken ruleCmdNameRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUclid.g:6504:2: ( (kw= 'bmc' | kw= 'check' | kw= 'clear_context' | kw= 'induction' | kw= 'print' | kw= 'print_cex' | kw= 'print_module' | kw= 'print_results' | kw= 'print_smt2' | kw= 'synthesize_invariant' | kw= 'unroll' | kw= 'verify' ) )
            // InternalUclid.g:6505:2: (kw= 'bmc' | kw= 'check' | kw= 'clear_context' | kw= 'induction' | kw= 'print' | kw= 'print_cex' | kw= 'print_module' | kw= 'print_results' | kw= 'print_smt2' | kw= 'synthesize_invariant' | kw= 'unroll' | kw= 'verify' )
            {
            // InternalUclid.g:6505:2: (kw= 'bmc' | kw= 'check' | kw= 'clear_context' | kw= 'induction' | kw= 'print' | kw= 'print_cex' | kw= 'print_module' | kw= 'print_results' | kw= 'print_smt2' | kw= 'synthesize_invariant' | kw= 'unroll' | kw= 'verify' )
            int alt97=12;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt97=1;
                }
                break;
            case 88:
                {
                alt97=2;
                }
                break;
            case 89:
                {
                alt97=3;
                }
                break;
            case 90:
                {
                alt97=4;
                }
                break;
            case 91:
                {
                alt97=5;
                }
                break;
            case 92:
                {
                alt97=6;
                }
                break;
            case 93:
                {
                alt97=7;
                }
                break;
            case 94:
                {
                alt97=8;
                }
                break;
            case 95:
                {
                alt97=9;
                }
                break;
            case 96:
                {
                alt97=10;
                }
                break;
            case 97:
                {
                alt97=11;
                }
                break;
            case 98:
                {
                alt97=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalUclid.g:6506:3: kw= 'bmc'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getBmcKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:6512:3: kw= 'check'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getCheckKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUclid.g:6518:3: kw= 'clear_context'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getClear_contextKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUclid.g:6524:3: kw= 'induction'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getInductionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUclid.g:6530:3: kw= 'print'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrintKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUclid.g:6536:3: kw= 'print_cex'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrint_cexKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUclid.g:6542:3: kw= 'print_module'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrint_moduleKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUclid.g:6548:3: kw= 'print_results'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrint_resultsKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUclid.g:6554:3: kw= 'print_smt2'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrint_smt2Keyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalUclid.g:6560:3: kw= 'synthesize_invariant'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getSynthesize_invariantKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalUclid.g:6566:3: kw= 'unroll'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getUnrollKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalUclid.g:6572:3: kw= 'verify'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getVerifyKeyword_11());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCmdNameRule"


    // $ANTLR start "entryRuleIdListRule"
    // InternalUclid.g:6581:1: entryRuleIdListRule returns [EObject current=null] : iv_ruleIdListRule= ruleIdListRule EOF ;
    public final EObject entryRuleIdListRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdListRule = null;


        try {
            // InternalUclid.g:6581:51: (iv_ruleIdListRule= ruleIdListRule EOF )
            // InternalUclid.g:6582:2: iv_ruleIdListRule= ruleIdListRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdListRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdListRule=ruleIdListRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdListRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdListRule"


    // $ANTLR start "ruleIdListRule"
    // InternalUclid.g:6588:1: ruleIdListRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) ) ) ;
    public final EObject ruleIdListRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_l_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:6594:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) ) ) )
            // InternalUclid.g:6595:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) ) )
            {
            // InternalUclid.g:6595:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==RULE_ID) ) {
                int LA98_1 = input.LA(2);

                if ( (LA98_1==EOF||LA98_1==22||LA98_1==47) ) {
                    alt98=1;
                }
                else if ( (LA98_1==24) ) {
                    alt98=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalUclid.g:6596:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalUclid.g:6596:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalUclid.g:6597:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalUclid.g:6597:4: (lv_name_0_0= RULE_ID )
                    // InternalUclid.g:6598:5: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_name_0_0, grammarAccess.getIdListRuleAccess().getNameIDTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getIdListRuleRule());
                      					}
                      					addWithLastConsumed(
                      						current,
                      						"name",
                      						lv_name_0_0,
                      						"org.eclipse.xtext.common.Terminals.ID");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:6615:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) )
                    {
                    // InternalUclid.g:6615:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) )
                    // InternalUclid.g:6616:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) )
                    {
                    // InternalUclid.g:6616:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUclid.g:6617:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUclid.g:6617:5: (lv_name_1_0= RULE_ID )
                    // InternalUclid.g:6618:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getIdListRuleAccess().getNameIDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getIdListRuleRule());
                      						}
                      						addWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getIdListRuleAccess().getCommaKeyword_1_1());
                      			
                    }
                    // InternalUclid.g:6638:4: ( (lv_l_3_0= ruleIdListRule ) )
                    // InternalUclid.g:6639:5: (lv_l_3_0= ruleIdListRule )
                    {
                    // InternalUclid.g:6639:5: (lv_l_3_0= ruleIdListRule )
                    // InternalUclid.g:6640:6: lv_l_3_0= ruleIdListRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIdListRuleAccess().getLIdListRuleParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_l_3_0=ruleIdListRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIdListRuleRule());
                      						}
                      						set(
                      							current,
                      							"l",
                      							lv_l_3_0,
                      							"uclid.xtext.Uclid.IdListRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdListRule"


    // $ANTLR start "entryRuleExprListRule"
    // InternalUclid.g:6662:1: entryRuleExprListRule returns [EObject current=null] : iv_ruleExprListRule= ruleExprListRule EOF ;
    public final EObject entryRuleExprListRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprListRule = null;


        try {
            // InternalUclid.g:6662:53: (iv_ruleExprListRule= ruleExprListRule EOF )
            // InternalUclid.g:6663:2: iv_ruleExprListRule= ruleExprListRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExprListRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExprListRule=ruleExprListRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExprListRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExprListRule"


    // $ANTLR start "ruleExprListRule"
    // InternalUclid.g:6669:1: ruleExprListRule returns [EObject current=null] : ( () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )* ) ;
    public final EObject ruleExprListRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:6675:2: ( ( () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )* ) )
            // InternalUclid.g:6676:2: ( () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )* )
            {
            // InternalUclid.g:6676:2: ( () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )* )
            // InternalUclid.g:6677:3: () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )*
            {
            // InternalUclid.g:6677:3: ()
            // InternalUclid.g:6678:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getExprListRuleAccess().getExprListRuleAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:6687:3: ( (lv_exprs_1_0= ruleExprRule ) )
            // InternalUclid.g:6688:4: (lv_exprs_1_0= ruleExprRule )
            {
            // InternalUclid.g:6688:4: (lv_exprs_1_0= ruleExprRule )
            // InternalUclid.g:6689:5: lv_exprs_1_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprListRuleAccess().getExprsExprRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_exprs_1_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getExprListRuleRule());
              					}
              					add(
              						current,
              						"exprs",
              						lv_exprs_1_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:6706:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==24) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // InternalUclid.g:6707:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) )
            	    {
            	    otherlv_2=(Token)match(input,24,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExprListRuleAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUclid.g:6711:4: ( (lv_exprs_3_0= ruleExprRule ) )
            	    // InternalUclid.g:6712:5: (lv_exprs_3_0= ruleExprRule )
            	    {
            	    // InternalUclid.g:6712:5: (lv_exprs_3_0= ruleExprRule )
            	    // InternalUclid.g:6713:6: lv_exprs_3_0= ruleExprRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprListRuleAccess().getExprsExprRuleParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_exprs_3_0=ruleExprRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getExprListRuleRule());
            	      						}
            	      						add(
            	      							current,
            	      							"exprs",
            	      							lv_exprs_3_0,
            	      							"uclid.xtext.Uclid.ExprRule");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExprListRule"

    // $ANTLR start synpred35_InternalUclid
    public final void synpred35_InternalUclid_fragment() throws RecognitionException {   
        EObject lv_output_2_0 = null;


        // InternalUclid.g:1793:4: ( (lv_output_2_0= ruleArgList ) )
        // InternalUclid.g:1793:4: (lv_output_2_0= ruleArgList )
        {
        // InternalUclid.g:1793:4: (lv_output_2_0= ruleArgList )
        // InternalUclid.g:1794:5: lv_output_2_0= ruleArgList
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getProcReturnArgRuleAccess().getOutputArgListParserRuleCall_2_0());
          				
        }
        pushFollow(FOLLOW_2);
        lv_output_2_0=ruleArgList();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred35_InternalUclid

    // $ANTLR start synpred82_InternalUclid
    public final void synpred82_InternalUclid_fragment() throws RecognitionException {   
        EObject lv_q_2_1 = null;


        // InternalUclid.g:4019:7: (lv_q_2_1= ruleE2Rule )
        // InternalUclid.g:4019:7: lv_q_2_1= ruleE2Rule
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getE2RuleAccess().getQE2RuleParserRuleCall_1_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_q_2_1=ruleE2Rule();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred82_InternalUclid

    // $ANTLR start synpred83_InternalUclid
    public final void synpred83_InternalUclid_fragment() throws RecognitionException {   
        Token lv_op_1_0=null;
        EObject lv_q_2_1 = null;

        EObject lv_q_2_2 = null;


        // InternalUclid.g:3998:4: ( ( (lv_op_1_0= RULE_LOGEQU ) ) ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )
        // InternalUclid.g:3998:4: ( (lv_op_1_0= RULE_LOGEQU ) ) ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) )
        {
        // InternalUclid.g:3998:4: ( (lv_op_1_0= RULE_LOGEQU ) )
        // InternalUclid.g:3999:5: (lv_op_1_0= RULE_LOGEQU )
        {
        // InternalUclid.g:3999:5: (lv_op_1_0= RULE_LOGEQU )
        // InternalUclid.g:4000:6: lv_op_1_0= RULE_LOGEQU
        {
        lv_op_1_0=(Token)match(input,RULE_LOGEQU,FOLLOW_45); if (state.failed) return ;

        }


        }

        // InternalUclid.g:4016:4: ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) )
        // InternalUclid.g:4017:5: ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) )
        {
        // InternalUclid.g:4017:5: ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) )
        // InternalUclid.g:4018:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )
        {
        // InternalUclid.g:4018:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )
        int alt121=2;
        alt121 = dfa121.predict(input);
        switch (alt121) {
            case 1 :
                // InternalUclid.g:4019:7: lv_q_2_1= ruleE2Rule
                {
                pushFollow(FOLLOW_2);
                lv_q_2_1=ruleE2Rule();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalUclid.g:4035:7: lv_q_2_2= ruleE3Rule
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getE2RuleAccess().getQE3RuleParserRuleCall_1_1_0_1());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_q_2_2=ruleE3Rule();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred83_InternalUclid

    // $ANTLR start synpred84_InternalUclid
    public final void synpred84_InternalUclid_fragment() throws RecognitionException {   
        EObject lv_e_2_1 = null;


        // InternalUclid.g:4114:7: (lv_e_2_1= ruleE3Rule )
        // InternalUclid.g:4114:7: lv_e_2_1= ruleE3Rule
        {
        if ( state.backtracking==0 ) {

          							newCompositeNode(grammarAccess.getE3RuleAccess().getEE3RuleParserRuleCall_1_1_0_0());
          						
        }
        pushFollow(FOLLOW_2);
        lv_e_2_1=ruleE3Rule();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred84_InternalUclid

    // $ANTLR start synpred85_InternalUclid
    public final void synpred85_InternalUclid_fragment() throws RecognitionException {   
        Token lv_op_1_0=null;
        EObject lv_e_2_1 = null;

        EObject lv_e_2_2 = null;


        // InternalUclid.g:4093:4: ( ( (lv_op_1_0= RULE_LOGIMPLY ) ) ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )
        // InternalUclid.g:4093:4: ( (lv_op_1_0= RULE_LOGIMPLY ) ) ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4093:4: ( (lv_op_1_0= RULE_LOGIMPLY ) )
        // InternalUclid.g:4094:5: (lv_op_1_0= RULE_LOGIMPLY )
        {
        // InternalUclid.g:4094:5: (lv_op_1_0= RULE_LOGIMPLY )
        // InternalUclid.g:4095:6: lv_op_1_0= RULE_LOGIMPLY
        {
        lv_op_1_0=(Token)match(input,RULE_LOGIMPLY,FOLLOW_45); if (state.failed) return ;

        }


        }

        // InternalUclid.g:4111:4: ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) )
        // InternalUclid.g:4112:5: ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) )
        {
        // InternalUclid.g:4112:5: ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) )
        // InternalUclid.g:4113:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )
        {
        // InternalUclid.g:4113:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )
        int alt122=2;
        alt122 = dfa122.predict(input);
        switch (alt122) {
            case 1 :
                // InternalUclid.g:4114:7: lv_e_2_1= ruleE3Rule
                {
                pushFollow(FOLLOW_2);
                lv_e_2_1=ruleE3Rule();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalUclid.g:4130:7: lv_e_2_2= ruleE4Rule
                {
                if ( state.backtracking==0 ) {

                  							newCompositeNode(grammarAccess.getE3RuleAccess().getEE4RuleParserRuleCall_1_1_0_1());
                  						
                }
                pushFollow(FOLLOW_2);
                lv_e_2_2=ruleE4Rule();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }


        }


        }
    }
    // $ANTLR end synpred85_InternalUclid

    // $ANTLR start synpred86_InternalUclid
    public final void synpred86_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;


        // InternalUclid.g:4168:3: ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:4168:3: ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4168:3: ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) )
        // InternalUclid.g:4169:4: ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) )
        {
        // InternalUclid.g:4169:4: ( (lv_e_0_0= ruleE5Rule ) )
        // InternalUclid.g:4170:5: (lv_e_0_0= ruleE5Rule )
        {
        // InternalUclid.g:4170:5: (lv_e_0_0= ruleE5Rule )
        // InternalUclid.g:4171:6: lv_e_0_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_47);
        lv_e_0_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_1=(Token)match(input,67,FOLLOW_45); if (state.failed) return ;
        // InternalUclid.g:4192:4: ( (lv_e_2_0= ruleE4Rule ) )
        // InternalUclid.g:4193:5: (lv_e_2_0= ruleE4Rule )
        {
        // InternalUclid.g:4193:5: (lv_e_2_0= ruleE4Rule )
        // InternalUclid.g:4194:6: lv_e_2_0= ruleE4Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_0_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_2_0=ruleE4Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred86_InternalUclid

    // $ANTLR start synpred87_InternalUclid
    public final void synpred87_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_e_3_0 = null;

        EObject lv_e_5_0 = null;


        // InternalUclid.g:4213:3: ( ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:4213:3: ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4213:3: ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) )
        // InternalUclid.g:4214:4: ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) )
        {
        // InternalUclid.g:4214:4: ( (lv_e_3_0= ruleE5Rule ) )
        // InternalUclid.g:4215:5: (lv_e_3_0= ruleE5Rule )
        {
        // InternalUclid.g:4215:5: (lv_e_3_0= ruleE5Rule )
        // InternalUclid.g:4216:6: lv_e_3_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_48);
        lv_e_3_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,68,FOLLOW_45); if (state.failed) return ;
        // InternalUclid.g:4237:4: ( (lv_e_5_0= ruleE4Rule ) )
        // InternalUclid.g:4238:5: (lv_e_5_0= ruleE4Rule )
        {
        // InternalUclid.g:4238:5: (lv_e_5_0= ruleE4Rule )
        // InternalUclid.g:4239:6: lv_e_5_0= ruleE4Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_5_0=ruleE4Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred87_InternalUclid

    // $ANTLR start synpred88_InternalUclid
    public final void synpred88_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        EObject lv_e_6_0 = null;

        EObject lv_e_8_0 = null;


        // InternalUclid.g:4258:3: ( ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:4258:3: ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4258:3: ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) )
        // InternalUclid.g:4259:4: ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) )
        {
        // InternalUclid.g:4259:4: ( (lv_e_6_0= ruleE5Rule ) )
        // InternalUclid.g:4260:5: (lv_e_6_0= ruleE5Rule )
        {
        // InternalUclid.g:4260:5: (lv_e_6_0= ruleE5Rule )
        // InternalUclid.g:4261:6: lv_e_6_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_2_0_0());
          					
        }
        pushFollow(FOLLOW_49);
        lv_e_6_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,69,FOLLOW_45); if (state.failed) return ;
        // InternalUclid.g:4282:4: ( (lv_e_8_0= ruleE4Rule ) )
        // InternalUclid.g:4283:5: (lv_e_8_0= ruleE4Rule )
        {
        // InternalUclid.g:4283:5: (lv_e_8_0= ruleE4Rule )
        // InternalUclid.g:4284:6: lv_e_8_0= ruleE4Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_2_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_8_0=ruleE4Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred88_InternalUclid

    // $ANTLR start synpred89_InternalUclid
    public final void synpred89_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        EObject lv_e_9_0 = null;

        EObject lv_e_11_0 = null;


        // InternalUclid.g:4303:3: ( ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:4303:3: ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4303:3: ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) )
        // InternalUclid.g:4304:4: ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) )
        {
        // InternalUclid.g:4304:4: ( (lv_e_9_0= ruleE5Rule ) )
        // InternalUclid.g:4305:5: (lv_e_9_0= ruleE5Rule )
        {
        // InternalUclid.g:4305:5: (lv_e_9_0= ruleE5Rule )
        // InternalUclid.g:4306:6: lv_e_9_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_3_0_0());
          					
        }
        pushFollow(FOLLOW_50);
        lv_e_9_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,70,FOLLOW_45); if (state.failed) return ;
        // InternalUclid.g:4327:4: ( (lv_e_11_0= ruleE4Rule ) )
        // InternalUclid.g:4328:5: (lv_e_11_0= ruleE4Rule )
        {
        // InternalUclid.g:4328:5: (lv_e_11_0= ruleE4Rule )
        // InternalUclid.g:4329:6: lv_e_11_0= ruleE4Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_3_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_11_0=ruleE4Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred89_InternalUclid

    // $ANTLR start synpred90_InternalUclid
    public final void synpred90_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        EObject lv_e_12_0 = null;

        EObject lv_e_14_0 = null;


        // InternalUclid.g:4348:3: ( ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:4348:3: ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4348:3: ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) )
        // InternalUclid.g:4349:4: ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) )
        {
        // InternalUclid.g:4349:4: ( (lv_e_12_0= ruleE5Rule ) )
        // InternalUclid.g:4350:5: (lv_e_12_0= ruleE5Rule )
        {
        // InternalUclid.g:4350:5: (lv_e_12_0= ruleE5Rule )
        // InternalUclid.g:4351:6: lv_e_12_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_4_0_0());
          					
        }
        pushFollow(FOLLOW_51);
        lv_e_12_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_13=(Token)match(input,71,FOLLOW_45); if (state.failed) return ;
        // InternalUclid.g:4372:4: ( (lv_e_14_0= ruleE4Rule ) )
        // InternalUclid.g:4373:5: (lv_e_14_0= ruleE4Rule )
        {
        // InternalUclid.g:4373:5: (lv_e_14_0= ruleE4Rule )
        // InternalUclid.g:4374:6: lv_e_14_0= ruleE4Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE4RuleParserRuleCall_4_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_14_0=ruleE4Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred90_InternalUclid

    // $ANTLR start synpred91_InternalUclid
    public final void synpred91_InternalUclid_fragment() throws RecognitionException {   
        Token lv_op_1_0=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4451:4: ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )
        // InternalUclid.g:4451:4: ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) )
        {
        // InternalUclid.g:4451:4: ( (lv_op_1_0= RULE_REL_OP_RULE ) )
        // InternalUclid.g:4452:5: (lv_op_1_0= RULE_REL_OP_RULE )
        {
        // InternalUclid.g:4452:5: (lv_op_1_0= RULE_REL_OP_RULE )
        // InternalUclid.g:4453:6: lv_op_1_0= RULE_REL_OP_RULE
        {
        lv_op_1_0=(Token)match(input,RULE_REL_OP_RULE,FOLLOW_45); if (state.failed) return ;

        }


        }

        // InternalUclid.g:4469:4: ( (lv_e_2_0= ruleE6Rule ) )
        // InternalUclid.g:4470:5: (lv_e_2_0= ruleE6Rule )
        {
        // InternalUclid.g:4470:5: (lv_e_2_0= ruleE6Rule )
        // InternalUclid.g:4471:6: lv_e_2_0= ruleE6Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE5RuleAccess().getEE6RuleParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_2_0=ruleE6Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred91_InternalUclid

    // $ANTLR start synpred92_InternalUclid
    public final void synpred92_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4528:4: (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )
        // InternalUclid.g:4528:4: otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) )
        {
        otherlv_1=(Token)match(input,72,FOLLOW_45); if (state.failed) return ;
        // InternalUclid.g:4532:4: ( (lv_e_2_0= ruleE6Rule ) )
        // InternalUclid.g:4533:5: (lv_e_2_0= ruleE6Rule )
        {
        // InternalUclid.g:4533:5: (lv_e_2_0= ruleE6Rule )
        // InternalUclid.g:4534:6: lv_e_2_0= ruleE6Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE6RuleAccess().getEE6RuleParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_2_0=ruleE6Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred92_InternalUclid

    // $ANTLR start synpred93_InternalUclid
    public final void synpred93_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4591:4: (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )
        // InternalUclid.g:4591:4: otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) )
        {
        otherlv_1=(Token)match(input,73,FOLLOW_45); if (state.failed) return ;
        // InternalUclid.g:4595:4: ( (lv_e_2_0= ruleE7Rule ) )
        // InternalUclid.g:4596:5: (lv_e_2_0= ruleE7Rule )
        {
        // InternalUclid.g:4596:5: (lv_e_2_0= ruleE7Rule )
        // InternalUclid.g:4597:6: lv_e_2_0= ruleE7Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE7RuleAccess().getEE7RuleParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_2_0=ruleE7Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred93_InternalUclid

    // $ANTLR start synpred94_InternalUclid
    public final void synpred94_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4654:4: (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )
        // InternalUclid.g:4654:4: otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) )
        {
        otherlv_1=(Token)match(input,74,FOLLOW_45); if (state.failed) return ;
        // InternalUclid.g:4658:4: ( (lv_e_2_0= ruleE9Rule ) )
        // InternalUclid.g:4659:5: (lv_e_2_0= ruleE9Rule )
        {
        // InternalUclid.g:4659:5: (lv_e_2_0= ruleE9Rule )
        // InternalUclid.g:4660:6: lv_e_2_0= ruleE9Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE8RuleAccess().getEE9RuleParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_2_0=ruleE9Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred94_InternalUclid

    // $ANTLR start synpred95_InternalUclid
    public final void synpred95_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4717:4: (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )
        // InternalUclid.g:4717:4: otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) )
        {
        otherlv_1=(Token)match(input,20,FOLLOW_45); if (state.failed) return ;
        // InternalUclid.g:4721:4: ( (lv_e_2_0= ruleE10Rule ) )
        // InternalUclid.g:4722:5: (lv_e_2_0= ruleE10Rule )
        {
        // InternalUclid.g:4722:5: (lv_e_2_0= ruleE10Rule )
        // InternalUclid.g:4723:6: lv_e_2_0= ruleE10Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE9RuleAccess().getEE10RuleParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_e_2_0=ruleE10Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred95_InternalUclid

    // $ANTLR start synpred101_InternalUclid
    public final void synpred101_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_l_2_0 = null;

        EObject lv_e_4_0 = null;

        EObject lv_e_6_0 = null;


        // InternalUclid.g:4870:4: (otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )
        // InternalUclid.g:4870:4: otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']'
        {
        otherlv_1=(Token)match(input,44,FOLLOW_21); if (state.failed) return ;
        // InternalUclid.g:4874:4: ( (lv_l_2_0= ruleExprListRule ) )
        // InternalUclid.g:4875:5: (lv_l_2_0= ruleExprListRule )
        {
        // InternalUclid.g:4875:5: (lv_l_2_0= ruleExprListRule )
        // InternalUclid.g:4876:6: lv_l_2_0= ruleExprListRule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE11RuleAccess().getLExprListRuleParserRuleCall_1_1_0());
          					
        }
        pushFollow(FOLLOW_58);
        lv_l_2_0=ruleExprListRule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUclid.g:4893:4: ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )?
        int alt124=3;
        int LA124_0 = input.LA(1);

        if ( (LA124_0==77) ) {
            alt124=1;
        }
        else if ( (LA124_0==25) ) {
            alt124=2;
        }
        switch (alt124) {
            case 1 :
                // InternalUclid.g:4894:5: (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) )
                {
                // InternalUclid.g:4894:5: (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) )
                // InternalUclid.g:4895:6: otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) )
                {
                otherlv_3=(Token)match(input,77,FOLLOW_21); if (state.failed) return ;
                // InternalUclid.g:4899:6: ( (lv_e_4_0= ruleExprRule ) )
                // InternalUclid.g:4900:7: (lv_e_4_0= ruleExprRule )
                {
                // InternalUclid.g:4900:7: (lv_e_4_0= ruleExprRule )
                // InternalUclid.g:4901:8: lv_e_4_0= ruleExprRule
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getE11RuleAccess().getEExprRuleParserRuleCall_1_2_0_1_0());
                  							
                }
                pushFollow(FOLLOW_27);
                lv_e_4_0=ruleExprRule();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 2 :
                // InternalUclid.g:4920:5: (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) )
                {
                // InternalUclid.g:4920:5: (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) )
                // InternalUclid.g:4921:6: otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) )
                {
                otherlv_5=(Token)match(input,25,FOLLOW_21); if (state.failed) return ;
                // InternalUclid.g:4925:6: ( (lv_e_6_0= ruleExprRule ) )
                // InternalUclid.g:4926:7: (lv_e_6_0= ruleExprRule )
                {
                // InternalUclid.g:4926:7: (lv_e_6_0= ruleExprRule )
                // InternalUclid.g:4927:8: lv_e_6_0= ruleExprRule
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getE11RuleAccess().getEExprRuleParserRuleCall_1_2_1_1_0());
                  							
                }
                pushFollow(FOLLOW_27);
                lv_e_6_0=ruleExprRule();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;

        }

        otherlv_7=(Token)match(input,47,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred101_InternalUclid

    // $ANTLR start synpred103_InternalUclid
    public final void synpred103_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_v_2_0 = null;


        // InternalUclid.g:4990:4: (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )
        // InternalUclid.g:4990:4: otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')'
        {
        otherlv_1=(Token)match(input,31,FOLLOW_25); if (state.failed) return ;
        // InternalUclid.g:4994:4: ( (lv_v_2_0= ruleExprListRule ) )?
        int alt125=2;
        int LA125_0 = input.LA(1);

        if ( ((LA125_0>=RULE_ID && LA125_0<=RULE_INT)||LA125_0==RULE_STRING||LA125_0==17||LA125_0==28||LA125_0==31||LA125_0==55||(LA125_0>=64 && LA125_0<=65)||(LA125_0>=74 && LA125_0<=76)||(LA125_0>=80 && LA125_0<=81)) ) {
            alt125=1;
        }
        switch (alt125) {
            case 1 :
                // InternalUclid.g:4995:5: (lv_v_2_0= ruleExprListRule )
                {
                // InternalUclid.g:4995:5: (lv_v_2_0= ruleExprListRule )
                // InternalUclid.g:4996:6: lv_v_2_0= ruleExprListRule
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getE12RuleAccess().getVExprListRuleParserRuleCall_1_1_0());
                  					
                }
                pushFollow(FOLLOW_19);
                lv_v_2_0=ruleExprListRule();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_3=(Token)match(input,32,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_InternalUclid

    // $ANTLR start synpred108_InternalUclid
    public final void synpred108_InternalUclid_fragment() throws RecognitionException {   
        EObject this_RHSVarRef_1 = null;


        // InternalUclid.g:5228:3: (this_RHSVarRef_1= ruleRHSVarRef )
        // InternalUclid.g:5228:3: this_RHSVarRef_1= ruleRHSVarRef
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_RHSVarRef_1=ruleRHSVarRef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_InternalUclid

    // $ANTLR start synpred109_InternalUclid
    public final void synpred109_InternalUclid_fragment() throws RecognitionException {   
        // InternalUclid.g:5240:3: ( ruleFunctionReference )
        // InternalUclid.g:5240:3: ruleFunctionReference
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        ruleFunctionReference();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_InternalUclid

    // $ANTLR start synpred110_InternalUclid
    public final void synpred110_InternalUclid_fragment() throws RecognitionException {   
        EObject this_EnumRef_3 = null;


        // InternalUclid.g:5251:3: (this_EnumRef_3= ruleEnumRef )
        // InternalUclid.g:5251:3: this_EnumRef_3= ruleEnumRef
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_EnumRef_3=ruleEnumRef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_InternalUclid

    // Delegated rules

    public final boolean synpred91_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred84_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred84_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred101_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred101_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred83_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred83_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred89_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred89_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred95_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred95_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred108_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred103_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred103_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred94_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred94_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred109_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred85_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred85_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA121 dfa121 = new DFA121(this);
    protected DFA122 dfa122 = new DFA122(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\13\0\2\uffff";
    static final String dfa_3s = "\1\121\13\0\2\uffff";
    static final String dfa_4s = "\14\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\1\6\4\uffff\1\7\6\uffff\1\11\15\uffff\1\13\27\uffff\1\12\22\uffff\1\1\1\2\1\3\3\uffff\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4018:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_1 = input.LA(1);

                         
                        int index59_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_2 = input.LA(1);

                         
                        int index59_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA59_3 = input.LA(1);

                         
                        int index59_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA59_4 = input.LA(1);

                         
                        int index59_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA59_5 = input.LA(1);

                         
                        int index59_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA59_6 = input.LA(1);

                         
                        int index59_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA59_7 = input.LA(1);

                         
                        int index59_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA59_8 = input.LA(1);

                         
                        int index59_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA59_9 = input.LA(1);

                         
                        int index59_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA59_10 = input.LA(1);

                         
                        int index59_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA59_11 = input.LA(1);

                         
                        int index59_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index59_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4113:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_1 = input.LA(1);

                         
                        int index61_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA61_2 = input.LA(1);

                         
                        int index61_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA61_3 = input.LA(1);

                         
                        int index61_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA61_4 = input.LA(1);

                         
                        int index61_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA61_5 = input.LA(1);

                         
                        int index61_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA61_6 = input.LA(1);

                         
                        int index61_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA61_7 = input.LA(1);

                         
                        int index61_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA61_8 = input.LA(1);

                         
                        int index61_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA61_9 = input.LA(1);

                         
                        int index61_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA61_10 = input.LA(1);

                         
                        int index61_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA61_11 = input.LA(1);

                         
                        int index61_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index61_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\1\4\13\0\6\uffff";
    static final String dfa_9s = "\1\121\13\0\6\uffff";
    static final String dfa_10s = "\14\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\6\uffff}>";
    static final String[] dfa_12s = {
            "\1\10\1\6\4\uffff\1\7\6\uffff\1\11\15\uffff\1\13\27\uffff\1\12\22\uffff\1\1\1\2\1\3\3\uffff\1\4\1\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "4167:2: ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_1 = input.LA(1);

                         
                        int index63_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_2 = input.LA(1);

                         
                        int index63_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_3 = input.LA(1);

                         
                        int index63_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA63_4 = input.LA(1);

                         
                        int index63_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA63_5 = input.LA(1);

                         
                        int index63_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA63_6 = input.LA(1);

                         
                        int index63_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA63_7 = input.LA(1);

                         
                        int index63_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA63_8 = input.LA(1);

                         
                        int index63_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA63_9 = input.LA(1);

                         
                        int index63_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA63_10 = input.LA(1);

                         
                        int index63_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA63_11 = input.LA(1);

                         
                        int index63_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred86_InternalUclid()) ) {s = 12;}

                        else if ( (synpred87_InternalUclid()) ) {s = 13;}

                        else if ( (synpred88_InternalUclid()) ) {s = 14;}

                        else if ( (synpred89_InternalUclid()) ) {s = 15;}

                        else if ( (synpred90_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index63_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA121 extends DFA {

        public DFA121(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 121;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4018:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA121_1 = input.LA(1);

                         
                        int index121_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA121_2 = input.LA(1);

                         
                        int index121_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA121_3 = input.LA(1);

                         
                        int index121_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA121_4 = input.LA(1);

                         
                        int index121_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA121_5 = input.LA(1);

                         
                        int index121_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA121_6 = input.LA(1);

                         
                        int index121_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA121_7 = input.LA(1);

                         
                        int index121_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA121_8 = input.LA(1);

                         
                        int index121_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA121_9 = input.LA(1);

                         
                        int index121_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA121_10 = input.LA(1);

                         
                        int index121_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA121_11 = input.LA(1);

                         
                        int index121_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index121_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 121, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "4113:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA122_1 = input.LA(1);

                         
                        int index122_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA122_2 = input.LA(1);

                         
                        int index122_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA122_3 = input.LA(1);

                         
                        int index122_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA122_4 = input.LA(1);

                         
                        int index122_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA122_5 = input.LA(1);

                         
                        int index122_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA122_6 = input.LA(1);

                         
                        int index122_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA122_7 = input.LA(1);

                         
                        int index122_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA122_8 = input.LA(1);

                         
                        int index122_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA122_9 = input.LA(1);

                         
                        int index122_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA122_10 = input.LA(1);

                         
                        int index122_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA122_11 = input.LA(1);

                         
                        int index122_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred84_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index122_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 122, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00070F0E7C8C0000L,0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000100000020210L,0x00000000003C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0080100090020630L,0x00000000003F1C03L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000F000020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080100190020630L,0x00000000003F1C03L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100080020210L,0x00000000003C0000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100100020210L,0x00000000003C0000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000220210L,0x00000000003C0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x92FC14F008060210L,0x00000000003C0000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x92FC14F000060210L,0x00000000003C0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0C80100090020630L,0x00000000003F1C03L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000420L,0x0000000000030000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00070FFE7C8A0000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080100080020630L,0x00000000003F1C00L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000800002000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000100000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000800001000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000040010L,0x00000007FF800000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000010L,0x00000007FF800000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000100080400000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000080400000L});

}