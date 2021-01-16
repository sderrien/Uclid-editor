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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_REL_OP_RULE", "RULE_BV", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'module'", "'{'", "'}'", "'type'", "'*'", "'='", "';'", "'input'", "':'", "'output'", "'var'", "','", "'const'", "'sharedvar'", "'define'", "'('", "')'", "'function'", "'procedure'", "'returns'", "'requires'", "'ensures'", "'modifies'", "'instance'", "'axiom'", "'assume'", "'property'", "'invariant'", "'init'", "'next'", "'skip'", "'assert'", "'havoc'", "'call'", "'['", "']'", "'\\''", "'if'", "'else'", "'case'", "'esac'", "'default'", "'for'", "'in'", "'range'", "'while'", "'LTL'", "'forall'", "'exists'", "'::'", "'<==>'", "'==>'", "'&&'", "'||'", "'&'", "'|'", "'^'", "'++'", "'+'", "'-'", "'!'", "'~'", "'->'", "'then'", "'false'", "'true'", "'boolean'", "'integer'", "'enum'", "'record'", "'control'", "'bmc'", "'check'", "'clear_context'", "'induction'", "'print'", "'print_cex'", "'print_module'", "'print_results'", "'print_smt2'", "'synthesize_invariant'", "'unroll'", "'verify'"
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int RULE_BV=7;
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
    public static final int RULE_REL_OP_RULE=6;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
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
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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

                if ( (LA1_0==14) ) {
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

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUclid.g:141:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,13,FOLLOW_5); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,14,FOLLOW_5); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,15,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getModuleRuleAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalUclid.g:209:3: ( (lv_d_4_0= ruleDeclRule ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==21||(LA3_0>=23 && LA3_0<=24)||(LA3_0>=26 && LA3_0<=28)||(LA3_0>=31 && LA3_0<=32)||(LA3_0>=37 && LA3_0<=43)) ) {
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

            if ( (LA4_0==84) ) {
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

            otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
            case 17:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 24:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            case 28:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            case 31:
                {
                alt5=8;
                }
                break;
            case 32:
                {
                alt5=9;
                }
                break;
            case 37:
                {
                alt5=10;
                }
                break;
            case 42:
                {
                alt5=11;
                }
                break;
            case 43:
                {
                alt5=12;
                }
                break;
            case 38:
            case 39:
                {
                alt5=13;
                }
                break;
            case 40:
            case 41:
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

            if ( (LA7_0==17) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==19) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==20) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==18) ) {
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
                    otherlv_0=(Token)match(input,17,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getTypeDeclRuleAccess().getTypeKeyword_0_0());
                      			
                    }
                    // InternalUclid.g:461:4: ( ( (lv_name_1_0= RULE_ID ) ) | otherlv_2= '*' )
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==18) ) {
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
                            otherlv_2=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getTypeDeclRuleAccess().getAsteriskKeyword_0_1_1());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,19,FOLLOW_11); if (state.failed) return current;
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

                    otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
                    otherlv_6=(Token)match(input,17,FOLLOW_5); if (state.failed) return current;
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

                    otherlv_8=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:554:1: ruleInputsDeclRule returns [EObject current=null] : (otherlv_0= 'input' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' ) ;
    public final EObject ruleInputsDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IdListRule_1 = null;

        EObject lv_t_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:560:2: ( (otherlv_0= 'input' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' ) )
            // InternalUclid.g:561:2: (otherlv_0= 'input' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' )
            {
            // InternalUclid.g:561:2: (otherlv_0= 'input' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' )
            // InternalUclid.g:562:3: otherlv_0= 'input' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInputsDeclRuleAccess().getInputKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getInputsDeclRuleAccess().getIdListRuleParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_13);
            this_IdListRule_1=ruleIdListRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_IdListRule_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInputsDeclRuleAccess().getColonKeyword_2());
              		
            }
            // InternalUclid.g:581:3: ( (lv_t_3_0= ruleTypeRule ) )
            // InternalUclid.g:582:4: (lv_t_3_0= ruleTypeRule )
            {
            // InternalUclid.g:582:4: (lv_t_3_0= ruleTypeRule )
            // InternalUclid.g:583:5: lv_t_3_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInputsDeclRuleAccess().getTTypeRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_t_3_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInputsDeclRuleRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_3_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getInputsDeclRuleAccess().getSemicolonKeyword_4());
              		
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
    // InternalUclid.g:608:1: entryRuleOutputsDeclRule returns [EObject current=null] : iv_ruleOutputsDeclRule= ruleOutputsDeclRule EOF ;
    public final EObject entryRuleOutputsDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputsDeclRule = null;


        try {
            // InternalUclid.g:608:56: (iv_ruleOutputsDeclRule= ruleOutputsDeclRule EOF )
            // InternalUclid.g:609:2: iv_ruleOutputsDeclRule= ruleOutputsDeclRule EOF
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
    // InternalUclid.g:615:1: ruleOutputsDeclRule returns [EObject current=null] : (otherlv_0= 'output' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' ) ;
    public final EObject ruleOutputsDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IdListRule_1 = null;

        EObject lv_t_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:621:2: ( (otherlv_0= 'output' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' ) )
            // InternalUclid.g:622:2: (otherlv_0= 'output' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' )
            {
            // InternalUclid.g:622:2: (otherlv_0= 'output' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' )
            // InternalUclid.g:623:3: otherlv_0= 'output' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getOutputsDeclRuleAccess().getOutputKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOutputsDeclRuleAccess().getIdListRuleParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_13);
            this_IdListRule_1=ruleIdListRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_IdListRule_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getOutputsDeclRuleAccess().getColonKeyword_2());
              		
            }
            // InternalUclid.g:642:3: ( (lv_t_3_0= ruleTypeRule ) )
            // InternalUclid.g:643:4: (lv_t_3_0= ruleTypeRule )
            {
            // InternalUclid.g:643:4: (lv_t_3_0= ruleTypeRule )
            // InternalUclid.g:644:5: lv_t_3_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOutputsDeclRuleAccess().getTTypeRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_t_3_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOutputsDeclRuleRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_3_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getOutputsDeclRuleAccess().getSemicolonKeyword_4());
              		
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


    // $ANTLR start "entryRuleVarsDeclRule"
    // InternalUclid.g:669:1: entryRuleVarsDeclRule returns [EObject current=null] : iv_ruleVarsDeclRule= ruleVarsDeclRule EOF ;
    public final EObject entryRuleVarsDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarsDeclRule = null;


        try {
            // InternalUclid.g:669:53: (iv_ruleVarsDeclRule= ruleVarsDeclRule EOF )
            // InternalUclid.g:670:2: iv_ruleVarsDeclRule= ruleVarsDeclRule EOF
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
    // InternalUclid.g:676:1: ruleVarsDeclRule returns [EObject current=null] : (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) ;
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
            // InternalUclid.g:682:2: ( (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' ) )
            // InternalUclid.g:683:2: (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            {
            // InternalUclid.g:683:2: (otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';' )
            // InternalUclid.g:684:3: otherlv_0= 'var' ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* ) otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getVarsDeclRuleAccess().getVarKeyword_0());
              		
            }
            // InternalUclid.g:688:3: ( ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )* )
            // InternalUclid.g:689:4: ( (lv_vars_1_0= ruleVarDecl ) ) (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )*
            {
            // InternalUclid.g:689:4: ( (lv_vars_1_0= ruleVarDecl ) )
            // InternalUclid.g:690:5: (lv_vars_1_0= ruleVarDecl )
            {
            // InternalUclid.g:690:5: (lv_vars_1_0= ruleVarDecl )
            // InternalUclid.g:691:6: lv_vars_1_0= ruleVarDecl
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getVarsDeclRuleAccess().getVarsVarDeclParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_14);
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

            // InternalUclid.g:708:4: (otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUclid.g:709:5: otherlv_2= ',' ( (lv_vars_3_0= ruleVarDecl ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getVarsDeclRuleAccess().getCommaKeyword_1_1_0());
            	      				
            	    }
            	    // InternalUclid.g:713:5: ( (lv_vars_3_0= ruleVarDecl ) )
            	    // InternalUclid.g:714:6: (lv_vars_3_0= ruleVarDecl )
            	    {
            	    // InternalUclid.g:714:6: (lv_vars_3_0= ruleVarDecl )
            	    // InternalUclid.g:715:7: lv_vars_3_0= ruleVarDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getVarsDeclRuleAccess().getVarsVarDeclParserRuleCall_1_1_1_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_14);
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
            	    break loop8;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getVarsDeclRuleAccess().getColonKeyword_2());
              		
            }
            // InternalUclid.g:738:3: ( (lv_t_5_0= ruleTypeRule ) )
            // InternalUclid.g:739:4: (lv_t_5_0= ruleTypeRule )
            {
            // InternalUclid.g:739:4: (lv_t_5_0= ruleTypeRule )
            // InternalUclid.g:740:5: lv_t_5_0= ruleTypeRule
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

            otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleVarDecl"
    // InternalUclid.g:765:1: entryRuleVarDecl returns [EObject current=null] : iv_ruleVarDecl= ruleVarDecl EOF ;
    public final EObject entryRuleVarDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDecl = null;


        try {
            // InternalUclid.g:765:48: (iv_ruleVarDecl= ruleVarDecl EOF )
            // InternalUclid.g:766:2: iv_ruleVarDecl= ruleVarDecl EOF
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
    // InternalUclid.g:772:1: ruleVarDecl returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleVarDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalUclid.g:778:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalUclid.g:779:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalUclid.g:779:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalUclid.g:780:3: (lv_name_0_0= RULE_ID )
            {
            // InternalUclid.g:780:3: (lv_name_0_0= RULE_ID )
            // InternalUclid.g:781:4: lv_name_0_0= RULE_ID
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


    // $ANTLR start "entryRuleConstsDeclRule"
    // InternalUclid.g:800:1: entryRuleConstsDeclRule returns [EObject current=null] : iv_ruleConstsDeclRule= ruleConstsDeclRule EOF ;
    public final EObject entryRuleConstsDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstsDeclRule = null;


        try {
            // InternalUclid.g:800:55: (iv_ruleConstsDeclRule= ruleConstsDeclRule EOF )
            // InternalUclid.g:801:2: iv_ruleConstsDeclRule= ruleConstsDeclRule EOF
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
    // InternalUclid.g:807:1: ruleConstsDeclRule returns [EObject current=null] : (otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';' ) ;
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
            // InternalUclid.g:813:2: ( (otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';' ) )
            // InternalUclid.g:814:2: (otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';' )
            {
            // InternalUclid.g:814:2: (otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';' )
            // InternalUclid.g:815:3: otherlv_0= 'const' ( (lv_constants_1_0= ruleConstDecl ) ) (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )* otherlv_4= ':' ( (lv_t_5_0= ruleTypeRule ) ) (otherlv_6= '=' this_INT_7= RULE_INT )? otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getConstsDeclRuleAccess().getConstKeyword_0());
              		
            }
            // InternalUclid.g:819:3: ( (lv_constants_1_0= ruleConstDecl ) )
            // InternalUclid.g:820:4: (lv_constants_1_0= ruleConstDecl )
            {
            // InternalUclid.g:820:4: (lv_constants_1_0= ruleConstDecl )
            // InternalUclid.g:821:5: lv_constants_1_0= ruleConstDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstsDeclRuleAccess().getConstantsConstDeclParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
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

            // InternalUclid.g:838:3: (otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUclid.g:839:4: otherlv_2= ',' ( (lv_constants_3_0= ruleConstDecl ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getConstsDeclRuleAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUclid.g:843:4: ( (lv_constants_3_0= ruleConstDecl ) )
            	    // InternalUclid.g:844:5: (lv_constants_3_0= ruleConstDecl )
            	    {
            	    // InternalUclid.g:844:5: (lv_constants_3_0= ruleConstDecl )
            	    // InternalUclid.g:845:6: lv_constants_3_0= ruleConstDecl
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConstsDeclRuleAccess().getConstantsConstDeclParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_14);
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
            	    break loop9;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getConstsDeclRuleAccess().getColonKeyword_3());
              		
            }
            // InternalUclid.g:867:3: ( (lv_t_5_0= ruleTypeRule ) )
            // InternalUclid.g:868:4: (lv_t_5_0= ruleTypeRule )
            {
            // InternalUclid.g:868:4: (lv_t_5_0= ruleTypeRule )
            // InternalUclid.g:869:5: lv_t_5_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getConstsDeclRuleAccess().getTTypeRuleParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_15);
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

            // InternalUclid.g:886:3: (otherlv_6= '=' this_INT_7= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUclid.g:887:4: otherlv_6= '=' this_INT_7= RULE_INT
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:904:1: entryRuleConstDecl returns [EObject current=null] : iv_ruleConstDecl= ruleConstDecl EOF ;
    public final EObject entryRuleConstDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstDecl = null;


        try {
            // InternalUclid.g:904:50: (iv_ruleConstDecl= ruleConstDecl EOF )
            // InternalUclid.g:905:2: iv_ruleConstDecl= ruleConstDecl EOF
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
    // InternalUclid.g:911:1: ruleConstDecl returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConstDecl() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUclid.g:917:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUclid.g:918:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUclid.g:918:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUclid.g:919:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalUclid.g:919:3: ()
            // InternalUclid.g:920:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConstDeclAccess().getConstDeclAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:929:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUclid.g:930:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUclid.g:930:4: (lv_name_1_0= RULE_ID )
            // InternalUclid.g:931:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getConstDeclAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getConstDeclRule());
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
    // $ANTLR end "ruleConstDecl"


    // $ANTLR start "entryRuleSharedVarsDeclRule"
    // InternalUclid.g:951:1: entryRuleSharedVarsDeclRule returns [EObject current=null] : iv_ruleSharedVarsDeclRule= ruleSharedVarsDeclRule EOF ;
    public final EObject entryRuleSharedVarsDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSharedVarsDeclRule = null;


        try {
            // InternalUclid.g:951:59: (iv_ruleSharedVarsDeclRule= ruleSharedVarsDeclRule EOF )
            // InternalUclid.g:952:2: iv_ruleSharedVarsDeclRule= ruleSharedVarsDeclRule EOF
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
    // InternalUclid.g:958:1: ruleSharedVarsDeclRule returns [EObject current=null] : (otherlv_0= 'sharedvar' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' ) ;
    public final EObject ruleSharedVarsDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IdListRule_1 = null;

        EObject lv_t_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:964:2: ( (otherlv_0= 'sharedvar' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' ) )
            // InternalUclid.g:965:2: (otherlv_0= 'sharedvar' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' )
            {
            // InternalUclid.g:965:2: (otherlv_0= 'sharedvar' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';' )
            // InternalUclid.g:966:3: otherlv_0= 'sharedvar' this_IdListRule_1= ruleIdListRule otherlv_2= ':' ( (lv_t_3_0= ruleTypeRule ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getSharedVarsDeclRuleAccess().getSharedvarKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSharedVarsDeclRuleAccess().getIdListRuleParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_13);
            this_IdListRule_1=ruleIdListRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_IdListRule_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getSharedVarsDeclRuleAccess().getColonKeyword_2());
              		
            }
            // InternalUclid.g:985:3: ( (lv_t_3_0= ruleTypeRule ) )
            // InternalUclid.g:986:4: (lv_t_3_0= ruleTypeRule )
            {
            // InternalUclid.g:986:4: (lv_t_3_0= ruleTypeRule )
            // InternalUclid.g:987:5: lv_t_3_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSharedVarsDeclRuleAccess().getTTypeRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_t_3_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSharedVarsDeclRuleRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_3_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getSharedVarsDeclRuleAccess().getSemicolonKeyword_4());
              		
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


    // $ANTLR start "entryRuleDefineDeclRule"
    // InternalUclid.g:1012:1: entryRuleDefineDeclRule returns [EObject current=null] : iv_ruleDefineDeclRule= ruleDefineDeclRule EOF ;
    public final EObject entryRuleDefineDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefineDeclRule = null;


        try {
            // InternalUclid.g:1012:55: (iv_ruleDefineDeclRule= ruleDefineDeclRule EOF )
            // InternalUclid.g:1013:2: iv_ruleDefineDeclRule= ruleDefineDeclRule EOF
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
    // InternalUclid.g:1019:1: ruleDefineDeclRule returns [EObject current=null] : (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_l_3_0= ruleIdTypeListRule ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';' ) ;
    public final EObject ruleDefineDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_l_3_0 = null;

        EObject lv_t_6_0 = null;

        EObject lv_e_8_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1025:2: ( (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_l_3_0= ruleIdTypeListRule ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';' ) )
            // InternalUclid.g:1026:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_l_3_0= ruleIdTypeListRule ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';' )
            {
            // InternalUclid.g:1026:2: (otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_l_3_0= ruleIdTypeListRule ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';' )
            // InternalUclid.g:1027:3: otherlv_0= 'define' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_l_3_0= ruleIdTypeListRule ) )? otherlv_4= ')' otherlv_5= ':' ( (lv_t_6_0= ruleTypeRule ) ) otherlv_7= '=' ( (lv_e_8_0= ruleExprRule ) ) otherlv_9= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefineDeclRuleAccess().getDefineKeyword_0());
              		
            }
            // InternalUclid.g:1031:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUclid.g:1032:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUclid.g:1032:4: (lv_name_1_0= RULE_ID )
            // InternalUclid.g:1033:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getDefineDeclRuleAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalUclid.g:1053:3: ( (lv_l_3_0= ruleIdTypeListRule ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalUclid.g:1054:4: (lv_l_3_0= ruleIdTypeListRule )
                    {
                    // InternalUclid.g:1054:4: (lv_l_3_0= ruleIdTypeListRule )
                    // InternalUclid.g:1055:5: lv_l_3_0= ruleIdTypeListRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDefineDeclRuleAccess().getLIdTypeListRuleParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_l_3_0=ruleIdTypeListRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDefineDeclRuleRule());
                      					}
                      					set(
                      						current,
                      						"l",
                      						lv_l_3_0,
                      						"uclid.xtext.Uclid.IdTypeListRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getDefineDeclRuleAccess().getRightParenthesisKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getDefineDeclRuleAccess().getColonKeyword_5());
              		
            }
            // InternalUclid.g:1080:3: ( (lv_t_6_0= ruleTypeRule ) )
            // InternalUclid.g:1081:4: (lv_t_6_0= ruleTypeRule )
            {
            // InternalUclid.g:1081:4: (lv_t_6_0= ruleTypeRule )
            // InternalUclid.g:1082:5: lv_t_6_0= ruleTypeRule
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

            otherlv_7=(Token)match(input,19,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getDefineDeclRuleAccess().getEqualsSignKeyword_7());
              		
            }
            // InternalUclid.g:1103:3: ( (lv_e_8_0= ruleExprRule ) )
            // InternalUclid.g:1104:4: (lv_e_8_0= ruleExprRule )
            {
            // InternalUclid.g:1104:4: (lv_e_8_0= ruleExprRule )
            // InternalUclid.g:1105:5: lv_e_8_0= ruleExprRule
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

            otherlv_9=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:1130:1: entryRuleFunctionDecl returns [EObject current=null] : iv_ruleFunctionDecl= ruleFunctionDecl EOF ;
    public final EObject entryRuleFunctionDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDecl = null;


        try {
            // InternalUclid.g:1130:53: (iv_ruleFunctionDecl= ruleFunctionDecl EOF )
            // InternalUclid.g:1131:2: iv_ruleFunctionDecl= ruleFunctionDecl EOF
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
    // InternalUclid.g:1137:1: ruleFunctionDecl returns [EObject current=null] : ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= ':' ( (lv_t_7_0= ruleTypeRule ) ) otherlv_8= ';' ) ;
    public final EObject ruleFunctionDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_l_4_0 = null;

        EObject lv_t_7_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1143:2: ( ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= ':' ( (lv_t_7_0= ruleTypeRule ) ) otherlv_8= ';' ) )
            // InternalUclid.g:1144:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= ':' ( (lv_t_7_0= ruleTypeRule ) ) otherlv_8= ';' )
            {
            // InternalUclid.g:1144:2: ( () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= ':' ( (lv_t_7_0= ruleTypeRule ) ) otherlv_8= ';' )
            // InternalUclid.g:1145:3: () otherlv_1= 'function' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= ':' ( (lv_t_7_0= ruleTypeRule ) ) otherlv_8= ';'
            {
            // InternalUclid.g:1145:3: ()
            // InternalUclid.g:1146:4: 
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

            otherlv_1=(Token)match(input,31,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFunctionDeclAccess().getFunctionKeyword_1());
              		
            }
            // InternalUclid.g:1159:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUclid.g:1160:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUclid.g:1160:4: (lv_name_2_0= RULE_ID )
            // InternalUclid.g:1161:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFunctionDeclAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFunctionDeclRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getFunctionDeclAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalUclid.g:1181:3: ( (lv_l_4_0= ruleIdTypeListRule ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalUclid.g:1182:4: (lv_l_4_0= ruleIdTypeListRule )
                    {
                    // InternalUclid.g:1182:4: (lv_l_4_0= ruleIdTypeListRule )
                    // InternalUclid.g:1183:5: lv_l_4_0= ruleIdTypeListRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFunctionDeclAccess().getLIdTypeListRuleParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_l_4_0=ruleIdTypeListRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
                      					}
                      					set(
                      						current,
                      						"l",
                      						lv_l_4_0,
                      						"uclid.xtext.Uclid.IdTypeListRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFunctionDeclAccess().getRightParenthesisKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFunctionDeclAccess().getColonKeyword_6());
              		
            }
            // InternalUclid.g:1208:3: ( (lv_t_7_0= ruleTypeRule ) )
            // InternalUclid.g:1209:4: (lv_t_7_0= ruleTypeRule )
            {
            // InternalUclid.g:1209:4: (lv_t_7_0= ruleTypeRule )
            // InternalUclid.g:1210:5: lv_t_7_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFunctionDeclAccess().getTTypeRuleParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_t_7_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFunctionDeclRule());
              					}
              					set(
              						current,
              						"t",
              						lv_t_7_0,
              						"uclid.xtext.Uclid.TypeRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getFunctionDeclAccess().getSemicolonKeyword_8());
              		
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
    // InternalUclid.g:1235:1: entryRuleProcedureDecl returns [EObject current=null] : iv_ruleProcedureDecl= ruleProcedureDecl EOF ;
    public final EObject entryRuleProcedureDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcedureDecl = null;


        try {
            // InternalUclid.g:1235:54: (iv_ruleProcedureDecl= ruleProcedureDecl EOF )
            // InternalUclid.g:1236:2: iv_ruleProcedureDecl= ruleProcedureDecl EOF
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
    // InternalUclid.g:1242:1: ruleProcedureDecl returns [EObject current=null] : ( () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleProcedureDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_l_4_0 = null;

        EObject lv_ret_6_0 = null;

        EObject lv_req_7_0 = null;

        EObject lv_ensure_8_0 = null;

        EObject lv_modifies_9_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1248:2: ( ( () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:1249:2: ( () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:1249:2: ( () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:1250:3: () otherlv_1= 'procedure' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' ( (lv_ret_6_0= ruleProcReturnArgRule ) )? ( (lv_req_7_0= ruleRequireExprsRule ) )* ( (lv_ensure_8_0= ruleEnsureExprsRule ) )* ( (lv_modifies_9_0= ruleModifiesExprsRule ) )* ( (lv_body_10_0= ruleBlkStmtRule ) )
            {
            // InternalUclid.g:1250:3: ()
            // InternalUclid.g:1251:4: 
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

            otherlv_1=(Token)match(input,32,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProcedureDeclAccess().getProcedureKeyword_1());
              		
            }
            // InternalUclid.g:1264:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalUclid.g:1265:4: (lv_name_2_0= RULE_ID )
            {
            // InternalUclid.g:1265:4: (lv_name_2_0= RULE_ID )
            // InternalUclid.g:1266:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getProcedureDeclAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalUclid.g:1286:3: ( (lv_l_4_0= ruleIdTypeListRule ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUclid.g:1287:4: (lv_l_4_0= ruleIdTypeListRule )
                    {
                    // InternalUclid.g:1287:4: (lv_l_4_0= ruleIdTypeListRule )
                    // InternalUclid.g:1288:5: lv_l_4_0= ruleIdTypeListRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProcedureDeclAccess().getLIdTypeListRuleParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_l_4_0=ruleIdTypeListRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProcedureDeclRule());
                      					}
                      					set(
                      						current,
                      						"l",
                      						lv_l_4_0,
                      						"uclid.xtext.Uclid.IdTypeListRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getProcedureDeclAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalUclid.g:1309:3: ( (lv_ret_6_0= ruleProcReturnArgRule ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalUclid.g:1310:4: (lv_ret_6_0= ruleProcReturnArgRule )
                    {
                    // InternalUclid.g:1310:4: (lv_ret_6_0= ruleProcReturnArgRule )
                    // InternalUclid.g:1311:5: lv_ret_6_0= ruleProcReturnArgRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProcedureDeclAccess().getRetProcReturnArgRuleParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_21);
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

            // InternalUclid.g:1328:3: ( (lv_req_7_0= ruleRequireExprsRule ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalUclid.g:1329:4: (lv_req_7_0= ruleRequireExprsRule )
            	    {
            	    // InternalUclid.g:1329:4: (lv_req_7_0= ruleRequireExprsRule )
            	    // InternalUclid.g:1330:5: lv_req_7_0= ruleRequireExprsRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureDeclAccess().getReqRequireExprsRuleParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
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
            	    break loop15;
                }
            } while (true);

            // InternalUclid.g:1347:3: ( (lv_ensure_8_0= ruleEnsureExprsRule ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalUclid.g:1348:4: (lv_ensure_8_0= ruleEnsureExprsRule )
            	    {
            	    // InternalUclid.g:1348:4: (lv_ensure_8_0= ruleEnsureExprsRule )
            	    // InternalUclid.g:1349:5: lv_ensure_8_0= ruleEnsureExprsRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureDeclAccess().getEnsureEnsureExprsRuleParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
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
            	    break loop16;
                }
            } while (true);

            // InternalUclid.g:1366:3: ( (lv_modifies_9_0= ruleModifiesExprsRule ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==36) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalUclid.g:1367:4: (lv_modifies_9_0= ruleModifiesExprsRule )
            	    {
            	    // InternalUclid.g:1367:4: (lv_modifies_9_0= ruleModifiesExprsRule )
            	    // InternalUclid.g:1368:5: lv_modifies_9_0= ruleModifiesExprsRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getProcedureDeclAccess().getModifiesModifiesExprsRuleParserRuleCall_9_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_21);
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
            	    break loop17;
                }
            } while (true);

            // InternalUclid.g:1385:3: ( (lv_body_10_0= ruleBlkStmtRule ) )
            // InternalUclid.g:1386:4: (lv_body_10_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:1386:4: (lv_body_10_0= ruleBlkStmtRule )
            // InternalUclid.g:1387:5: lv_body_10_0= ruleBlkStmtRule
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
    // InternalUclid.g:1408:1: entryRuleProcReturnArgRule returns [EObject current=null] : iv_ruleProcReturnArgRule= ruleProcReturnArgRule EOF ;
    public final EObject entryRuleProcReturnArgRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcReturnArgRule = null;


        try {
            // InternalUclid.g:1408:58: (iv_ruleProcReturnArgRule= ruleProcReturnArgRule EOF )
            // InternalUclid.g:1409:2: iv_ruleProcReturnArgRule= ruleProcReturnArgRule EOF
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
    // InternalUclid.g:1415:1: ruleProcReturnArgRule returns [EObject current=null] : (otherlv_0= 'returns' otherlv_1= '(' ( (lv_l_2_0= ruleIdTypeListRule ) )? otherlv_3= ')' ) ;
    public final EObject ruleProcReturnArgRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_l_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1421:2: ( (otherlv_0= 'returns' otherlv_1= '(' ( (lv_l_2_0= ruleIdTypeListRule ) )? otherlv_3= ')' ) )
            // InternalUclid.g:1422:2: (otherlv_0= 'returns' otherlv_1= '(' ( (lv_l_2_0= ruleIdTypeListRule ) )? otherlv_3= ')' )
            {
            // InternalUclid.g:1422:2: (otherlv_0= 'returns' otherlv_1= '(' ( (lv_l_2_0= ruleIdTypeListRule ) )? otherlv_3= ')' )
            // InternalUclid.g:1423:3: otherlv_0= 'returns' otherlv_1= '(' ( (lv_l_2_0= ruleIdTypeListRule ) )? otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getProcReturnArgRuleAccess().getReturnsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getProcReturnArgRuleAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:1431:3: ( (lv_l_2_0= ruleIdTypeListRule ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalUclid.g:1432:4: (lv_l_2_0= ruleIdTypeListRule )
                    {
                    // InternalUclid.g:1432:4: (lv_l_2_0= ruleIdTypeListRule )
                    // InternalUclid.g:1433:5: lv_l_2_0= ruleIdTypeListRule
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getProcReturnArgRuleAccess().getLIdTypeListRuleParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_19);
                    lv_l_2_0=ruleIdTypeListRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getProcReturnArgRuleRule());
                      					}
                      					set(
                      						current,
                      						"l",
                      						lv_l_2_0,
                      						"uclid.xtext.Uclid.IdTypeListRule");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:1458:1: entryRuleRequireExprsRule returns [EObject current=null] : iv_ruleRequireExprsRule= ruleRequireExprsRule EOF ;
    public final EObject entryRuleRequireExprsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequireExprsRule = null;


        try {
            // InternalUclid.g:1458:57: (iv_ruleRequireExprsRule= ruleRequireExprsRule EOF )
            // InternalUclid.g:1459:2: iv_ruleRequireExprsRule= ruleRequireExprsRule EOF
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
    // InternalUclid.g:1465:1: ruleRequireExprsRule returns [EObject current=null] : (otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' ) ;
    public final EObject ruleRequireExprsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1471:2: ( (otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' ) )
            // InternalUclid.g:1472:2: (otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' )
            {
            // InternalUclid.g:1472:2: (otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' )
            // InternalUclid.g:1473:3: otherlv_0= 'requires' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRequireExprsRuleAccess().getRequiresKeyword_0());
              		
            }
            // InternalUclid.g:1477:3: ( (lv_e_1_0= ruleExprRule ) )
            // InternalUclid.g:1478:4: (lv_e_1_0= ruleExprRule )
            {
            // InternalUclid.g:1478:4: (lv_e_1_0= ruleExprRule )
            // InternalUclid.g:1479:5: lv_e_1_0= ruleExprRule
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:1504:1: entryRuleEnsureExprsRule returns [EObject current=null] : iv_ruleEnsureExprsRule= ruleEnsureExprsRule EOF ;
    public final EObject entryRuleEnsureExprsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnsureExprsRule = null;


        try {
            // InternalUclid.g:1504:56: (iv_ruleEnsureExprsRule= ruleEnsureExprsRule EOF )
            // InternalUclid.g:1505:2: iv_ruleEnsureExprsRule= ruleEnsureExprsRule EOF
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
    // InternalUclid.g:1511:1: ruleEnsureExprsRule returns [EObject current=null] : (otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' ) ;
    public final EObject ruleEnsureExprsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_e_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1517:2: ( (otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' ) )
            // InternalUclid.g:1518:2: (otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' )
            {
            // InternalUclid.g:1518:2: (otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';' )
            // InternalUclid.g:1519:3: otherlv_0= 'ensures' ( (lv_e_1_0= ruleExprRule ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEnsureExprsRuleAccess().getEnsuresKeyword_0());
              		
            }
            // InternalUclid.g:1523:3: ( (lv_e_1_0= ruleExprRule ) )
            // InternalUclid.g:1524:4: (lv_e_1_0= ruleExprRule )
            {
            // InternalUclid.g:1524:4: (lv_e_1_0= ruleExprRule )
            // InternalUclid.g:1525:5: lv_e_1_0= ruleExprRule
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:1550:1: entryRuleModifiesExprsRule returns [EObject current=null] : iv_ruleModifiesExprsRule= ruleModifiesExprsRule EOF ;
    public final EObject entryRuleModifiesExprsRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiesExprsRule = null;


        try {
            // InternalUclid.g:1550:58: (iv_ruleModifiesExprsRule= ruleModifiesExprsRule EOF )
            // InternalUclid.g:1551:2: iv_ruleModifiesExprsRule= ruleModifiesExprsRule EOF
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
    // InternalUclid.g:1557:1: ruleModifiesExprsRule returns [EObject current=null] : (otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';' ) ;
    public final EObject ruleModifiesExprsRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_l_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1563:2: ( (otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';' ) )
            // InternalUclid.g:1564:2: (otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';' )
            {
            // InternalUclid.g:1564:2: (otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';' )
            // InternalUclid.g:1565:3: otherlv_0= 'modifies' ( (lv_l_1_0= ruleIdListRule ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifiesExprsRuleAccess().getModifiesKeyword_0());
              		
            }
            // InternalUclid.g:1569:3: ( (lv_l_1_0= ruleIdListRule ) )
            // InternalUclid.g:1570:4: (lv_l_1_0= ruleIdListRule )
            {
            // InternalUclid.g:1570:4: (lv_l_1_0= ruleIdListRule )
            // InternalUclid.g:1571:5: lv_l_1_0= ruleIdListRule
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

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:1596:1: entryRuleInstanceDeclRule returns [EObject current=null] : iv_ruleInstanceDeclRule= ruleInstanceDeclRule EOF ;
    public final EObject entryRuleInstanceDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceDeclRule = null;


        try {
            // InternalUclid.g:1596:57: (iv_ruleInstanceDeclRule= ruleInstanceDeclRule EOF )
            // InternalUclid.g:1597:2: iv_ruleInstanceDeclRule= ruleInstanceDeclRule EOF
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
    // InternalUclid.g:1603:1: ruleInstanceDeclRule returns [EObject current=null] : (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';' ) ;
    public final EObject ruleInstanceDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_args_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1609:2: ( (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';' ) )
            // InternalUclid.g:1610:2: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';' )
            {
            // InternalUclid.g:1610:2: (otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';' )
            // InternalUclid.g:1611:3: otherlv_0= 'instance' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleFQN ) ) ( (lv_args_4_0= ruleArgMapListRule ) ) otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInstanceDeclRuleAccess().getInstanceKeyword_0());
              		
            }
            // InternalUclid.g:1615:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUclid.g:1616:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUclid.g:1616:4: (lv_name_1_0= RULE_ID )
            // InternalUclid.g:1617:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInstanceDeclRuleAccess().getColonKeyword_2());
              		
            }
            // InternalUclid.g:1637:3: ( ( ruleFQN ) )
            // InternalUclid.g:1638:4: ( ruleFQN )
            {
            // InternalUclid.g:1638:4: ( ruleFQN )
            // InternalUclid.g:1639:5: ruleFQN
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

            // InternalUclid.g:1656:3: ( (lv_args_4_0= ruleArgMapListRule ) )
            // InternalUclid.g:1657:4: (lv_args_4_0= ruleArgMapListRule )
            {
            // InternalUclid.g:1657:4: (lv_args_4_0= ruleArgMapListRule )
            // InternalUclid.g:1658:5: lv_args_4_0= ruleArgMapListRule
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:1683:1: entryRuleArgMapListRule returns [EObject current=null] : iv_ruleArgMapListRule= ruleArgMapListRule EOF ;
    public final EObject entryRuleArgMapListRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgMapListRule = null;


        try {
            // InternalUclid.g:1683:55: (iv_ruleArgMapListRule= ruleArgMapListRule EOF )
            // InternalUclid.g:1684:2: iv_ruleArgMapListRule= ruleArgMapListRule EOF
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
    // InternalUclid.g:1690:1: ruleArgMapListRule returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleArgMapListRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arg_2_0 = null;

        EObject lv_arg_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1696:2: ( ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')' ) )
            // InternalUclid.g:1697:2: ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')' )
            {
            // InternalUclid.g:1697:2: ( () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')' )
            // InternalUclid.g:1698:3: () otherlv_1= '(' ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )? otherlv_5= ')'
            {
            // InternalUclid.g:1698:3: ()
            // InternalUclid.g:1699:4: 
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

            otherlv_1=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArgMapListRuleAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:1712:3: ( ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalUclid.g:1713:4: ( (lv_arg_2_0= ruleArgMapRule ) ) (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )*
                    {
                    // InternalUclid.g:1713:4: ( (lv_arg_2_0= ruleArgMapRule ) )
                    // InternalUclid.g:1714:5: (lv_arg_2_0= ruleArgMapRule )
                    {
                    // InternalUclid.g:1714:5: (lv_arg_2_0= ruleArgMapRule )
                    // InternalUclid.g:1715:6: lv_arg_2_0= ruleArgMapRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getArgMapListRuleAccess().getArgArgMapRuleParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
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

                    // InternalUclid.g:1732:4: (otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==25) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalUclid.g:1733:5: otherlv_3= ',' ( (lv_arg_4_0= ruleArgMapRule ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getArgMapListRuleAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalUclid.g:1737:5: ( (lv_arg_4_0= ruleArgMapRule ) )
                    	    // InternalUclid.g:1738:6: (lv_arg_4_0= ruleArgMapRule )
                    	    {
                    	    // InternalUclid.g:1738:6: (lv_arg_4_0= ruleArgMapRule )
                    	    // InternalUclid.g:1739:7: lv_arg_4_0= ruleArgMapRule
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getArgMapListRuleAccess().getArgArgMapRuleParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:1766:1: entryRuleArgMapRule returns [EObject current=null] : iv_ruleArgMapRule= ruleArgMapRule EOF ;
    public final EObject entryRuleArgMapRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgMapRule = null;


        try {
            // InternalUclid.g:1766:51: (iv_ruleArgMapRule= ruleArgMapRule EOF )
            // InternalUclid.g:1767:2: iv_ruleArgMapRule= ruleArgMapRule EOF
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
    // InternalUclid.g:1773:1: ruleArgMapRule returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')' ) ;
    public final EObject ruleArgMapRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_e_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1779:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')' ) )
            // InternalUclid.g:1780:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')' )
            {
            // InternalUclid.g:1780:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')' )
            // InternalUclid.g:1781:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_e_4_0= ruleExprRule ) )? otherlv_5= ')'
            {
            // InternalUclid.g:1781:3: ()
            // InternalUclid.g:1782:4: 
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

            // InternalUclid.g:1791:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUclid.g:1792:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUclid.g:1792:4: (lv_name_1_0= RULE_ID )
            // InternalUclid.g:1793:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getArgMapRuleAccess().getColonKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArgMapRuleAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalUclid.g:1817:3: ( (lv_e_4_0= ruleExprRule ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||LA21_0==RULE_STRING||LA21_0==15||LA21_0==29||LA21_0==51||(LA21_0>=73 && LA21_0<=75)||(LA21_0>=78 && LA21_0<=79)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalUclid.g:1818:4: (lv_e_4_0= ruleExprRule )
                    {
                    // InternalUclid.g:1818:4: (lv_e_4_0= ruleExprRule )
                    // InternalUclid.g:1819:5: lv_e_4_0= ruleExprRule
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

            otherlv_5=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:1844:1: entryRuleAxiomDeclRule returns [EObject current=null] : iv_ruleAxiomDeclRule= ruleAxiomDeclRule EOF ;
    public final EObject entryRuleAxiomDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAxiomDeclRule = null;


        try {
            // InternalUclid.g:1844:54: (iv_ruleAxiomDeclRule= ruleAxiomDeclRule EOF )
            // InternalUclid.g:1845:2: iv_ruleAxiomDeclRule= ruleAxiomDeclRule EOF
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
    // InternalUclid.g:1851:1: ruleAxiomDeclRule returns [EObject current=null] : ( ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' ) | ( (otherlv_6= 'axiom' | otherlv_7= 'assume' ) ( (lv_h_8_0= ruleExprRule ) ) otherlv_9= ';' ) ) ;
    public final EObject ruleAxiomDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_n_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_e_4_0 = null;

        EObject lv_h_8_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1857:2: ( ( ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' ) | ( (otherlv_6= 'axiom' | otherlv_7= 'assume' ) ( (lv_h_8_0= ruleExprRule ) ) otherlv_9= ';' ) ) )
            // InternalUclid.g:1858:2: ( ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' ) | ( (otherlv_6= 'axiom' | otherlv_7= 'assume' ) ( (lv_h_8_0= ruleExprRule ) ) otherlv_9= ';' ) )
            {
            // InternalUclid.g:1858:2: ( ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' ) | ( (otherlv_6= 'axiom' | otherlv_7= 'assume' ) ( (lv_h_8_0= ruleExprRule ) ) otherlv_9= ';' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_INT||LA24_1==RULE_STRING||LA24_1==15||LA24_1==29||LA24_1==51||(LA24_1>=73 && LA24_1<=75)||(LA24_1>=78 && LA24_1<=79)) ) {
                    alt24=2;
                }
                else if ( (LA24_1==RULE_ID) ) {
                    int LA24_4 = input.LA(3);

                    if ( (LA24_4==RULE_REL_OP_RULE||LA24_4==13||LA24_4==18||LA24_4==20||LA24_4==29||LA24_4==48||LA24_4==50||(LA24_4>=64 && LA24_4<=73)) ) {
                        alt24=2;
                    }
                    else if ( (LA24_4==22) ) {
                        alt24=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0==39) ) {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==RULE_INT||LA24_2==RULE_STRING||LA24_2==15||LA24_2==29||LA24_2==51||(LA24_2>=73 && LA24_2<=75)||(LA24_2>=78 && LA24_2<=79)) ) {
                    alt24=2;
                }
                else if ( (LA24_2==RULE_ID) ) {
                    int LA24_4 = input.LA(3);

                    if ( (LA24_4==RULE_REL_OP_RULE||LA24_4==13||LA24_4==18||LA24_4==20||LA24_4==29||LA24_4==48||LA24_4==50||(LA24_4>=64 && LA24_4<=73)) ) {
                        alt24=2;
                    }
                    else if ( (LA24_4==22) ) {
                        alt24=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalUclid.g:1859:3: ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' )
                    {
                    // InternalUclid.g:1859:3: ( (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';' )
                    // InternalUclid.g:1860:4: (otherlv_0= 'axiom' | otherlv_1= 'assume' ) ( (lv_n_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_e_4_0= ruleExprRule ) ) otherlv_5= ';'
                    {
                    // InternalUclid.g:1860:4: (otherlv_0= 'axiom' | otherlv_1= 'assume' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==38) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==39) ) {
                        alt22=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 0, input);

                        throw nvae;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalUclid.g:1861:5: otherlv_0= 'axiom'
                            {
                            otherlv_0=(Token)match(input,38,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getAxiomDeclRuleAccess().getAxiomKeyword_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalUclid.g:1866:5: otherlv_1= 'assume'
                            {
                            otherlv_1=(Token)match(input,39,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getAxiomDeclRuleAccess().getAssumeKeyword_0_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalUclid.g:1871:4: ( (lv_n_2_0= RULE_ID ) )
                    // InternalUclid.g:1872:5: (lv_n_2_0= RULE_ID )
                    {
                    // InternalUclid.g:1872:5: (lv_n_2_0= RULE_ID )
                    // InternalUclid.g:1873:6: lv_n_2_0= RULE_ID
                    {
                    lv_n_2_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_n_2_0, grammarAccess.getAxiomDeclRuleAccess().getNIDTerminalRuleCall_0_1_0());
                      					
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

                    otherlv_3=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAxiomDeclRuleAccess().getColonKeyword_0_2());
                      			
                    }
                    // InternalUclid.g:1893:4: ( (lv_e_4_0= ruleExprRule ) )
                    // InternalUclid.g:1894:5: (lv_e_4_0= ruleExprRule )
                    {
                    // InternalUclid.g:1894:5: (lv_e_4_0= ruleExprRule )
                    // InternalUclid.g:1895:6: lv_e_4_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAxiomDeclRuleAccess().getEExprRuleParserRuleCall_0_3_0());
                      					
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

                    otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getAxiomDeclRuleAccess().getSemicolonKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:1918:3: ( (otherlv_6= 'axiom' | otherlv_7= 'assume' ) ( (lv_h_8_0= ruleExprRule ) ) otherlv_9= ';' )
                    {
                    // InternalUclid.g:1918:3: ( (otherlv_6= 'axiom' | otherlv_7= 'assume' ) ( (lv_h_8_0= ruleExprRule ) ) otherlv_9= ';' )
                    // InternalUclid.g:1919:4: (otherlv_6= 'axiom' | otherlv_7= 'assume' ) ( (lv_h_8_0= ruleExprRule ) ) otherlv_9= ';'
                    {
                    // InternalUclid.g:1919:4: (otherlv_6= 'axiom' | otherlv_7= 'assume' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==38) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==39) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalUclid.g:1920:5: otherlv_6= 'axiom'
                            {
                            otherlv_6=(Token)match(input,38,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getAxiomDeclRuleAccess().getAxiomKeyword_1_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalUclid.g:1925:5: otherlv_7= 'assume'
                            {
                            otherlv_7=(Token)match(input,39,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getAxiomDeclRuleAccess().getAssumeKeyword_1_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalUclid.g:1930:4: ( (lv_h_8_0= ruleExprRule ) )
                    // InternalUclid.g:1931:5: (lv_h_8_0= ruleExprRule )
                    {
                    // InternalUclid.g:1931:5: (lv_h_8_0= ruleExprRule )
                    // InternalUclid.g:1932:6: lv_h_8_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAxiomDeclRuleAccess().getHExprRuleParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_h_8_0=ruleExprRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAxiomDeclRuleRule());
                      						}
                      						set(
                      							current,
                      							"h",
                      							lv_h_8_0,
                      							"uclid.xtext.Uclid.ExprRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAxiomDeclRuleAccess().getSemicolonKeyword_1_2());
                      			
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
    // $ANTLR end "ruleAxiomDeclRule"


    // $ANTLR start "entryRuleSpecDeclRule"
    // InternalUclid.g:1958:1: entryRuleSpecDeclRule returns [EObject current=null] : iv_ruleSpecDeclRule= ruleSpecDeclRule EOF ;
    public final EObject entryRuleSpecDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecDeclRule = null;


        try {
            // InternalUclid.g:1958:53: (iv_ruleSpecDeclRule= ruleSpecDeclRule EOF )
            // InternalUclid.g:1959:2: iv_ruleSpecDeclRule= ruleSpecDeclRule EOF
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
    // InternalUclid.g:1965:1: ruleSpecDeclRule returns [EObject current=null] : ( ( ( ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_e_3_0= ruleExprRule ) ) otherlv_4= ';' ) | ( ( ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) ) ) ( (lv_e_6_0= ruleExprRule ) ) otherlv_7= ';' ) ) ;
    public final EObject ruleSpecDeclRule() throws RecognitionException {
        EObject current = null;

        Token lv_prop_0_1=null;
        Token lv_prop_0_2=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_prop_5_1=null;
        Token lv_prop_5_2=null;
        Token otherlv_7=null;
        EObject lv_e_3_0 = null;

        EObject lv_e_6_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:1971:2: ( ( ( ( ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_e_3_0= ruleExprRule ) ) otherlv_4= ';' ) | ( ( ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) ) ) ( (lv_e_6_0= ruleExprRule ) ) otherlv_7= ';' ) ) )
            // InternalUclid.g:1972:2: ( ( ( ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_e_3_0= ruleExprRule ) ) otherlv_4= ';' ) | ( ( ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) ) ) ( (lv_e_6_0= ruleExprRule ) ) otherlv_7= ';' ) )
            {
            // InternalUclid.g:1972:2: ( ( ( ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_e_3_0= ruleExprRule ) ) otherlv_4= ';' ) | ( ( ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) ) ) ( (lv_e_6_0= ruleExprRule ) ) otherlv_7= ';' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_INT||LA27_1==RULE_STRING||LA27_1==15||LA27_1==29||LA27_1==51||(LA27_1>=73 && LA27_1<=75)||(LA27_1>=78 && LA27_1<=79)) ) {
                    alt27=2;
                }
                else if ( (LA27_1==RULE_ID) ) {
                    int LA27_4 = input.LA(3);

                    if ( (LA27_4==RULE_REL_OP_RULE||LA27_4==13||LA27_4==18||LA27_4==20||LA27_4==29||LA27_4==48||LA27_4==50||(LA27_4>=64 && LA27_4<=73)) ) {
                        alt27=2;
                    }
                    else if ( (LA27_4==22) ) {
                        alt27=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 4, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA27_0==41) ) {
                int LA27_2 = input.LA(2);

                if ( (LA27_2==RULE_ID) ) {
                    int LA27_4 = input.LA(3);

                    if ( (LA27_4==RULE_REL_OP_RULE||LA27_4==13||LA27_4==18||LA27_4==20||LA27_4==29||LA27_4==48||LA27_4==50||(LA27_4>=64 && LA27_4<=73)) ) {
                        alt27=2;
                    }
                    else if ( (LA27_4==22) ) {
                        alt27=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA27_2==RULE_INT||LA27_2==RULE_STRING||LA27_2==15||LA27_2==29||LA27_2==51||(LA27_2>=73 && LA27_2<=75)||(LA27_2>=78 && LA27_2<=79)) ) {
                    alt27=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalUclid.g:1973:3: ( ( ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_e_3_0= ruleExprRule ) ) otherlv_4= ';' )
                    {
                    // InternalUclid.g:1973:3: ( ( ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_e_3_0= ruleExprRule ) ) otherlv_4= ';' )
                    // InternalUclid.g:1974:4: ( ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_e_3_0= ruleExprRule ) ) otherlv_4= ';'
                    {
                    // InternalUclid.g:1974:4: ( ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) ) )
                    // InternalUclid.g:1975:5: ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) )
                    {
                    // InternalUclid.g:1975:5: ( (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' ) )
                    // InternalUclid.g:1976:6: (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' )
                    {
                    // InternalUclid.g:1976:6: (lv_prop_0_1= 'property' | lv_prop_0_2= 'invariant' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==40) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==41) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalUclid.g:1977:7: lv_prop_0_1= 'property'
                            {
                            lv_prop_0_1=(Token)match(input,40,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prop_0_1, grammarAccess.getSpecDeclRuleAccess().getPropPropertyKeyword_0_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSpecDeclRuleRule());
                              							}
                              							setWithLastConsumed(current, "prop", lv_prop_0_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalUclid.g:1988:7: lv_prop_0_2= 'invariant'
                            {
                            lv_prop_0_2=(Token)match(input,41,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prop_0_2, grammarAccess.getSpecDeclRuleAccess().getPropInvariantKeyword_0_0_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSpecDeclRuleRule());
                              							}
                              							setWithLastConsumed(current, "prop", lv_prop_0_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalUclid.g:2001:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUclid.g:2002:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUclid.g:2002:5: (lv_name_1_0= RULE_ID )
                    // InternalUclid.g:2003:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_1_0, grammarAccess.getSpecDeclRuleAccess().getNameIDTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getSpecDeclRuleRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"name",
                      							lv_name_1_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getSpecDeclRuleAccess().getColonKeyword_0_2());
                      			
                    }
                    // InternalUclid.g:2023:4: ( (lv_e_3_0= ruleExprRule ) )
                    // InternalUclid.g:2024:5: (lv_e_3_0= ruleExprRule )
                    {
                    // InternalUclid.g:2024:5: (lv_e_3_0= ruleExprRule )
                    // InternalUclid.g:2025:6: lv_e_3_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSpecDeclRuleAccess().getEExprRuleParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_e_3_0=ruleExprRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSpecDeclRuleRule());
                      						}
                      						set(
                      							current,
                      							"e",
                      							lv_e_3_0,
                      							"uclid.xtext.Uclid.ExprRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getSpecDeclRuleAccess().getSemicolonKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:2048:3: ( ( ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) ) ) ( (lv_e_6_0= ruleExprRule ) ) otherlv_7= ';' )
                    {
                    // InternalUclid.g:2048:3: ( ( ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) ) ) ( (lv_e_6_0= ruleExprRule ) ) otherlv_7= ';' )
                    // InternalUclid.g:2049:4: ( ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) ) ) ( (lv_e_6_0= ruleExprRule ) ) otherlv_7= ';'
                    {
                    // InternalUclid.g:2049:4: ( ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) ) )
                    // InternalUclid.g:2050:5: ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) )
                    {
                    // InternalUclid.g:2050:5: ( (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' ) )
                    // InternalUclid.g:2051:6: (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' )
                    {
                    // InternalUclid.g:2051:6: (lv_prop_5_1= 'property' | lv_prop_5_2= 'invariant' )
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==40) ) {
                        alt26=1;
                    }
                    else if ( (LA26_0==41) ) {
                        alt26=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 0, input);

                        throw nvae;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalUclid.g:2052:7: lv_prop_5_1= 'property'
                            {
                            lv_prop_5_1=(Token)match(input,40,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prop_5_1, grammarAccess.getSpecDeclRuleAccess().getPropPropertyKeyword_1_0_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSpecDeclRuleRule());
                              							}
                              							setWithLastConsumed(current, "prop", lv_prop_5_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalUclid.g:2063:7: lv_prop_5_2= 'invariant'
                            {
                            lv_prop_5_2=(Token)match(input,41,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_prop_5_2, grammarAccess.getSpecDeclRuleAccess().getPropInvariantKeyword_1_0_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getSpecDeclRuleRule());
                              							}
                              							setWithLastConsumed(current, "prop", lv_prop_5_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalUclid.g:2076:4: ( (lv_e_6_0= ruleExprRule ) )
                    // InternalUclid.g:2077:5: (lv_e_6_0= ruleExprRule )
                    {
                    // InternalUclid.g:2077:5: (lv_e_6_0= ruleExprRule )
                    // InternalUclid.g:2078:6: lv_e_6_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSpecDeclRuleAccess().getEExprRuleParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_e_6_0=ruleExprRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSpecDeclRuleRule());
                      						}
                      						set(
                      							current,
                      							"e",
                      							lv_e_6_0,
                      							"uclid.xtext.Uclid.ExprRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getSpecDeclRuleAccess().getSemicolonKeyword_1_2());
                      			
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
    // $ANTLR end "ruleSpecDeclRule"


    // $ANTLR start "entryRuleInitDeclRule"
    // InternalUclid.g:2104:1: entryRuleInitDeclRule returns [EObject current=null] : iv_ruleInitDeclRule= ruleInitDeclRule EOF ;
    public final EObject entryRuleInitDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitDeclRule = null;


        try {
            // InternalUclid.g:2104:53: (iv_ruleInitDeclRule= ruleInitDeclRule EOF )
            // InternalUclid.g:2105:2: iv_ruleInitDeclRule= ruleInitDeclRule EOF
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
    // InternalUclid.g:2111:1: ruleInitDeclRule returns [EObject current=null] : (otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleInitDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2117:2: ( (otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:2118:2: (otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:2118:2: (otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:2119:3: otherlv_0= 'init' ( (lv_body_1_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getInitDeclRuleAccess().getInitKeyword_0());
              		
            }
            // InternalUclid.g:2123:3: ( (lv_body_1_0= ruleBlkStmtRule ) )
            // InternalUclid.g:2124:4: (lv_body_1_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:2124:4: (lv_body_1_0= ruleBlkStmtRule )
            // InternalUclid.g:2125:5: lv_body_1_0= ruleBlkStmtRule
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
    // InternalUclid.g:2146:1: entryRuleNextDeclRule returns [EObject current=null] : iv_ruleNextDeclRule= ruleNextDeclRule EOF ;
    public final EObject entryRuleNextDeclRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextDeclRule = null;


        try {
            // InternalUclid.g:2146:53: (iv_ruleNextDeclRule= ruleNextDeclRule EOF )
            // InternalUclid.g:2147:2: iv_ruleNextDeclRule= ruleNextDeclRule EOF
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
    // InternalUclid.g:2153:1: ruleNextDeclRule returns [EObject current=null] : (otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleNextDeclRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_body_1_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2159:2: ( (otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:2160:2: (otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:2160:2: (otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:2161:3: otherlv_0= 'next' ( (lv_body_1_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNextDeclRuleAccess().getNextKeyword_0());
              		
            }
            // InternalUclid.g:2165:3: ( (lv_body_1_0= ruleBlkStmtRule ) )
            // InternalUclid.g:2166:4: (lv_body_1_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:2166:4: (lv_body_1_0= ruleBlkStmtRule )
            // InternalUclid.g:2167:5: lv_body_1_0= ruleBlkStmtRule
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
    // InternalUclid.g:2188:1: entryRuleStatementRule returns [EObject current=null] : iv_ruleStatementRule= ruleStatementRule EOF ;
    public final EObject entryRuleStatementRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementRule = null;


        try {
            // InternalUclid.g:2188:54: (iv_ruleStatementRule= ruleStatementRule EOF )
            // InternalUclid.g:2189:2: iv_ruleStatementRule= ruleStatementRule EOF
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
    // InternalUclid.g:2195:1: ruleStatementRule returns [EObject current=null] : ( ( () otherlv_1= 'skip' otherlv_2= ';' ) | (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' ) | (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' ) | (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' ) | (this_CallStatement_14= ruleCallStatement otherlv_15= ';' ) | (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' ) | ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? ) | ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? ) | ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? ) | ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? ) | ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? ) ) ;
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
            // InternalUclid.g:2201:2: ( ( ( () otherlv_1= 'skip' otherlv_2= ';' ) | (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' ) | (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' ) | (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' ) | (this_CallStatement_14= ruleCallStatement otherlv_15= ';' ) | (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' ) | ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? ) | ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? ) | ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? ) | ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? ) | ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? ) ) )
            // InternalUclid.g:2202:2: ( ( () otherlv_1= 'skip' otherlv_2= ';' ) | (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' ) | (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' ) | (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' ) | (this_CallStatement_14= ruleCallStatement otherlv_15= ';' ) | (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' ) | ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? ) | ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? ) | ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? ) | ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? ) | ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? ) )
            {
            // InternalUclid.g:2202:2: ( ( () otherlv_1= 'skip' otherlv_2= ';' ) | (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' ) | (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' ) | (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' ) | (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' ) | (this_CallStatement_14= ruleCallStatement otherlv_15= ';' ) | (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' ) | ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? ) | ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? ) | ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? ) | ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? ) | ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? ) )
            int alt33=12;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt33=1;
                }
                break;
            case 45:
                {
                alt33=2;
                }
                break;
            case 39:
                {
                alt33=3;
                }
                break;
            case 46:
                {
                alt33=4;
                }
                break;
            case RULE_ID:
                {
                alt33=5;
                }
                break;
            case 47:
                {
                alt33=6;
                }
                break;
            case 43:
                {
                alt33=7;
                }
                break;
            case 51:
                {
                alt33=8;
                }
                break;
            case 53:
                {
                alt33=9;
                }
                break;
            case 56:
                {
                alt33=10;
                }
                break;
            case 59:
                {
                alt33=11;
                }
                break;
            case 15:
                {
                alt33=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalUclid.g:2203:3: ( () otherlv_1= 'skip' otherlv_2= ';' )
                    {
                    // InternalUclid.g:2203:3: ( () otherlv_1= 'skip' otherlv_2= ';' )
                    // InternalUclid.g:2204:4: () otherlv_1= 'skip' otherlv_2= ';'
                    {
                    // InternalUclid.g:2204:4: ()
                    // InternalUclid.g:2205:5: 
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

                    otherlv_1=(Token)match(input,44,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStatementRuleAccess().getSkipKeyword_0_1());
                      			
                    }
                    otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:2224:3: (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' )
                    {
                    // InternalUclid.g:2224:3: (otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';' )
                    // InternalUclid.g:2225:4: otherlv_3= 'assert' ( (lv_d_4_0= ruleExprRule ) ) otherlv_5= ';'
                    {
                    otherlv_3=(Token)match(input,45,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getStatementRuleAccess().getAssertKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:2229:4: ( (lv_d_4_0= ruleExprRule ) )
                    // InternalUclid.g:2230:5: (lv_d_4_0= ruleExprRule )
                    {
                    // InternalUclid.g:2230:5: (lv_d_4_0= ruleExprRule )
                    // InternalUclid.g:2231:6: lv_d_4_0= ruleExprRule
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

                    otherlv_5=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_1_2());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalUclid.g:2254:3: (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' )
                    {
                    // InternalUclid.g:2254:3: (otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';' )
                    // InternalUclid.g:2255:4: otherlv_6= 'assume' ( (lv_d_7_0= ruleExprRule ) ) otherlv_8= ';'
                    {
                    otherlv_6=(Token)match(input,39,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getStatementRuleAccess().getAssumeKeyword_2_0());
                      			
                    }
                    // InternalUclid.g:2259:4: ( (lv_d_7_0= ruleExprRule ) )
                    // InternalUclid.g:2260:5: (lv_d_7_0= ruleExprRule )
                    {
                    // InternalUclid.g:2260:5: (lv_d_7_0= ruleExprRule )
                    // InternalUclid.g:2261:6: lv_d_7_0= ruleExprRule
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

                    otherlv_8=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_2_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalUclid.g:2284:3: (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' )
                    {
                    // InternalUclid.g:2284:3: (otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';' )
                    // InternalUclid.g:2285:4: otherlv_9= 'havoc' ( (lv_name_10_0= RULE_ID ) ) otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,46,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getStatementRuleAccess().getHavocKeyword_3_0());
                      			
                    }
                    // InternalUclid.g:2289:4: ( (lv_name_10_0= RULE_ID ) )
                    // InternalUclid.g:2290:5: (lv_name_10_0= RULE_ID )
                    {
                    // InternalUclid.g:2290:5: (lv_name_10_0= RULE_ID )
                    // InternalUclid.g:2291:6: lv_name_10_0= RULE_ID
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

                    otherlv_11=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_3_2());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalUclid.g:2313:3: (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' )
                    {
                    // InternalUclid.g:2313:3: (this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';' )
                    // InternalUclid.g:2314:4: this_AssignmentRule_12= ruleAssignmentRule otherlv_13= ';'
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
                    otherlv_13=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalUclid.g:2331:3: (this_CallStatement_14= ruleCallStatement otherlv_15= ';' )
                    {
                    // InternalUclid.g:2331:3: (this_CallStatement_14= ruleCallStatement otherlv_15= ';' )
                    // InternalUclid.g:2332:4: this_CallStatement_14= ruleCallStatement otherlv_15= ';'
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
                    otherlv_15=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalUclid.g:2349:3: (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' )
                    {
                    // InternalUclid.g:2349:3: (otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';' )
                    // InternalUclid.g:2350:4: otherlv_16= 'next' otherlv_17= '(' ( (lv_name_18_0= RULE_ID ) ) otherlv_19= ')' otherlv_20= ';'
                    {
                    otherlv_16=(Token)match(input,43,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getStatementRuleAccess().getNextKeyword_6_0());
                      			
                    }
                    otherlv_17=(Token)match(input,29,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getStatementRuleAccess().getLeftParenthesisKeyword_6_1());
                      			
                    }
                    // InternalUclid.g:2358:4: ( (lv_name_18_0= RULE_ID ) )
                    // InternalUclid.g:2359:5: (lv_name_18_0= RULE_ID )
                    {
                    // InternalUclid.g:2359:5: (lv_name_18_0= RULE_ID )
                    // InternalUclid.g:2360:6: lv_name_18_0= RULE_ID
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

                    otherlv_19=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getStatementRuleAccess().getRightParenthesisKeyword_6_3());
                      			
                    }
                    otherlv_20=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_20, grammarAccess.getStatementRuleAccess().getSemicolonKeyword_6_4());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalUclid.g:2386:3: ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? )
                    {
                    // InternalUclid.g:2386:3: ( ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )? )
                    // InternalUclid.g:2387:4: ( (lv_s_21_0= ruleIfStmtRule ) ) (otherlv_22= ';' )?
                    {
                    // InternalUclid.g:2387:4: ( (lv_s_21_0= ruleIfStmtRule ) )
                    // InternalUclid.g:2388:5: (lv_s_21_0= ruleIfStmtRule )
                    {
                    // InternalUclid.g:2388:5: (lv_s_21_0= ruleIfStmtRule )
                    // InternalUclid.g:2389:6: lv_s_21_0= ruleIfStmtRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSIfStmtRuleParserRuleCall_7_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalUclid.g:2406:4: (otherlv_22= ';' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==20) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalUclid.g:2407:5: otherlv_22= ';'
                            {
                            otherlv_22=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUclid.g:2414:3: ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? )
                    {
                    // InternalUclid.g:2414:3: ( ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )? )
                    // InternalUclid.g:2415:4: ( (lv_s_23_0= ruleCaseStmtRule ) ) (otherlv_24= ';' )?
                    {
                    // InternalUclid.g:2415:4: ( (lv_s_23_0= ruleCaseStmtRule ) )
                    // InternalUclid.g:2416:5: (lv_s_23_0= ruleCaseStmtRule )
                    {
                    // InternalUclid.g:2416:5: (lv_s_23_0= ruleCaseStmtRule )
                    // InternalUclid.g:2417:6: lv_s_23_0= ruleCaseStmtRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSCaseStmtRuleParserRuleCall_8_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalUclid.g:2434:4: (otherlv_24= ';' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==20) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalUclid.g:2435:5: otherlv_24= ';'
                            {
                            otherlv_24=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUclid.g:2442:3: ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? )
                    {
                    // InternalUclid.g:2442:3: ( ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )? )
                    // InternalUclid.g:2443:4: ( (lv_s_25_0= ruleForLoopRule ) ) (otherlv_26= ';' )?
                    {
                    // InternalUclid.g:2443:4: ( (lv_s_25_0= ruleForLoopRule ) )
                    // InternalUclid.g:2444:5: (lv_s_25_0= ruleForLoopRule )
                    {
                    // InternalUclid.g:2444:5: (lv_s_25_0= ruleForLoopRule )
                    // InternalUclid.g:2445:6: lv_s_25_0= ruleForLoopRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSForLoopRuleParserRuleCall_9_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalUclid.g:2462:4: (otherlv_26= ';' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==20) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalUclid.g:2463:5: otherlv_26= ';'
                            {
                            otherlv_26=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUclid.g:2470:3: ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? )
                    {
                    // InternalUclid.g:2470:3: ( ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )? )
                    // InternalUclid.g:2471:4: ( (lv_s_27_0= ruleWhileLoopRule ) ) (otherlv_28= ';' )?
                    {
                    // InternalUclid.g:2471:4: ( (lv_s_27_0= ruleWhileLoopRule ) )
                    // InternalUclid.g:2472:5: (lv_s_27_0= ruleWhileLoopRule )
                    {
                    // InternalUclid.g:2472:5: (lv_s_27_0= ruleWhileLoopRule )
                    // InternalUclid.g:2473:6: lv_s_27_0= ruleWhileLoopRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSWhileLoopRuleParserRuleCall_10_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalUclid.g:2490:4: (otherlv_28= ';' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==20) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalUclid.g:2491:5: otherlv_28= ';'
                            {
                            otherlv_28=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUclid.g:2498:3: ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? )
                    {
                    // InternalUclid.g:2498:3: ( ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )? )
                    // InternalUclid.g:2499:4: ( (lv_s_29_0= ruleBlkStmtRule ) ) (otherlv_30= ';' )?
                    {
                    // InternalUclid.g:2499:4: ( (lv_s_29_0= ruleBlkStmtRule ) )
                    // InternalUclid.g:2500:5: (lv_s_29_0= ruleBlkStmtRule )
                    {
                    // InternalUclid.g:2500:5: (lv_s_29_0= ruleBlkStmtRule )
                    // InternalUclid.g:2501:6: lv_s_29_0= ruleBlkStmtRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStatementRuleAccess().getSBlkStmtRuleParserRuleCall_11_0_0());
                      					
                    }
                    pushFollow(FOLLOW_24);
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

                    // InternalUclid.g:2518:4: (otherlv_30= ';' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==20) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalUclid.g:2519:5: otherlv_30= ';'
                            {
                            otherlv_30=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:2529:1: entryRuleCallStatement returns [EObject current=null] : iv_ruleCallStatement= ruleCallStatement EOF ;
    public final EObject entryRuleCallStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallStatement = null;


        try {
            // InternalUclid.g:2529:54: (iv_ruleCallStatement= ruleCallStatement EOF )
            // InternalUclid.g:2530:2: iv_ruleCallStatement= ruleCallStatement EOF
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
    // InternalUclid.g:2536:1: ruleCallStatement returns [EObject current=null] : ( ( () (otherlv_1= 'call' otherlv_2= '(' ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( ( ruleFQN ) ) otherlv_9= '(' ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* otherlv_13= ')' otherlv_14= ';' ) ) | (otherlv_15= 'call' ( ( ruleFQN ) ) otherlv_17= '(' ( (lv_exprs_18_0= ruleExprRule ) ) (otherlv_19= ',' ( (lv_exprs_20_0= ruleExprRule ) ) )* otherlv_21= ')' otherlv_22= ';' ) ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_lhs_3_0 = null;

        EObject lv_lhs_5_0 = null;

        EObject lv_exprs_10_0 = null;

        EObject lv_exprs_12_0 = null;

        EObject lv_exprs_18_0 = null;

        EObject lv_exprs_20_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2542:2: ( ( ( () (otherlv_1= 'call' otherlv_2= '(' ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( ( ruleFQN ) ) otherlv_9= '(' ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* otherlv_13= ')' otherlv_14= ';' ) ) | (otherlv_15= 'call' ( ( ruleFQN ) ) otherlv_17= '(' ( (lv_exprs_18_0= ruleExprRule ) ) (otherlv_19= ',' ( (lv_exprs_20_0= ruleExprRule ) ) )* otherlv_21= ')' otherlv_22= ';' ) ) )
            // InternalUclid.g:2543:2: ( ( () (otherlv_1= 'call' otherlv_2= '(' ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( ( ruleFQN ) ) otherlv_9= '(' ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* otherlv_13= ')' otherlv_14= ';' ) ) | (otherlv_15= 'call' ( ( ruleFQN ) ) otherlv_17= '(' ( (lv_exprs_18_0= ruleExprRule ) ) (otherlv_19= ',' ( (lv_exprs_20_0= ruleExprRule ) ) )* otherlv_21= ')' otherlv_22= ';' ) )
            {
            // InternalUclid.g:2543:2: ( ( () (otherlv_1= 'call' otherlv_2= '(' ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( ( ruleFQN ) ) otherlv_9= '(' ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* otherlv_13= ')' otherlv_14= ';' ) ) | (otherlv_15= 'call' ( ( ruleFQN ) ) otherlv_17= '(' ( (lv_exprs_18_0= ruleExprRule ) ) (otherlv_19= ',' ( (lv_exprs_20_0= ruleExprRule ) ) )* otherlv_21= ')' otherlv_22= ';' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==RULE_ID) ) {
                    alt38=2;
                }
                else if ( (LA38_1==29) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalUclid.g:2544:3: ( () (otherlv_1= 'call' otherlv_2= '(' ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( ( ruleFQN ) ) otherlv_9= '(' ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* otherlv_13= ')' otherlv_14= ';' ) )
                    {
                    // InternalUclid.g:2544:3: ( () (otherlv_1= 'call' otherlv_2= '(' ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( ( ruleFQN ) ) otherlv_9= '(' ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* otherlv_13= ')' otherlv_14= ';' ) )
                    // InternalUclid.g:2545:4: () (otherlv_1= 'call' otherlv_2= '(' ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( ( ruleFQN ) ) otherlv_9= '(' ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* otherlv_13= ')' otherlv_14= ';' )
                    {
                    // InternalUclid.g:2545:4: ()
                    // InternalUclid.g:2546:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getCallStatementAccess().getCallStatementAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalUclid.g:2555:4: (otherlv_1= 'call' otherlv_2= '(' ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( ( ruleFQN ) ) otherlv_9= '(' ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* otherlv_13= ')' otherlv_14= ';' )
                    // InternalUclid.g:2556:5: otherlv_1= 'call' otherlv_2= '(' ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )? otherlv_6= ')' otherlv_7= '=' ( ( ruleFQN ) ) otherlv_9= '(' ( (lv_exprs_10_0= ruleExprRule ) ) (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )* otherlv_13= ')' otherlv_14= ';'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getCallStatementAccess().getCallKeyword_0_1_0());
                      				
                    }
                    otherlv_2=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getCallStatementAccess().getLeftParenthesisKeyword_0_1_1());
                      				
                    }
                    // InternalUclid.g:2564:5: ( ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalUclid.g:2565:6: ( (lv_lhs_3_0= ruleLhs ) ) (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )*
                            {
                            // InternalUclid.g:2565:6: ( (lv_lhs_3_0= ruleLhs ) )
                            // InternalUclid.g:2566:7: (lv_lhs_3_0= ruleLhs )
                            {
                            // InternalUclid.g:2566:7: (lv_lhs_3_0= ruleLhs )
                            // InternalUclid.g:2567:8: lv_lhs_3_0= ruleLhs
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getCallStatementAccess().getLhsLhsParserRuleCall_0_1_2_0_0());
                              							
                            }
                            pushFollow(FOLLOW_22);
                            lv_lhs_3_0=ruleLhs();

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
                              									"uclid.xtext.Uclid.Lhs");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalUclid.g:2584:6: (otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==25) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalUclid.g:2585:7: otherlv_4= ',' ( (lv_lhs_5_0= ruleLhs ) )
                            	    {
                            	    otherlv_4=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(otherlv_4, grammarAccess.getCallStatementAccess().getCommaKeyword_0_1_2_1_0());
                            	      						
                            	    }
                            	    // InternalUclid.g:2589:7: ( (lv_lhs_5_0= ruleLhs ) )
                            	    // InternalUclid.g:2590:8: (lv_lhs_5_0= ruleLhs )
                            	    {
                            	    // InternalUclid.g:2590:8: (lv_lhs_5_0= ruleLhs )
                            	    // InternalUclid.g:2591:9: lv_lhs_5_0= ruleLhs
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getCallStatementAccess().getLhsLhsParserRuleCall_0_1_2_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FOLLOW_22);
                            	    lv_lhs_5_0=ruleLhs();

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
                            	      										"uclid.xtext.Uclid.Lhs");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,30,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getCallStatementAccess().getRightParenthesisKeyword_0_1_3());
                      				
                    }
                    otherlv_7=(Token)match(input,19,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getCallStatementAccess().getEqualsSignKeyword_0_1_4());
                      				
                    }
                    // InternalUclid.g:2618:5: ( ( ruleFQN ) )
                    // InternalUclid.g:2619:6: ( ruleFQN )
                    {
                    // InternalUclid.g:2619:6: ( ruleFQN )
                    // InternalUclid.g:2620:7: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      							/* */
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getCallStatementRule());
                      							}
                      						
                    }
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCallStatementAccess().getTargetProcedureDeclCrossReference_0_1_5_0());
                      						
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

                    otherlv_9=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getCallStatementAccess().getLeftParenthesisKeyword_0_1_6());
                      				
                    }
                    // InternalUclid.g:2641:5: ( (lv_exprs_10_0= ruleExprRule ) )
                    // InternalUclid.g:2642:6: (lv_exprs_10_0= ruleExprRule )
                    {
                    // InternalUclid.g:2642:6: (lv_exprs_10_0= ruleExprRule )
                    // InternalUclid.g:2643:7: lv_exprs_10_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getCallStatementAccess().getExprsExprRuleParserRuleCall_0_1_7_0());
                      						
                    }
                    pushFollow(FOLLOW_22);
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

                    // InternalUclid.g:2660:5: (otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==25) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalUclid.g:2661:6: otherlv_11= ',' ( (lv_exprs_12_0= ruleExprRule ) )
                    	    {
                    	    otherlv_11=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_11, grammarAccess.getCallStatementAccess().getCommaKeyword_0_1_8_0());
                    	      					
                    	    }
                    	    // InternalUclid.g:2665:6: ( (lv_exprs_12_0= ruleExprRule ) )
                    	    // InternalUclid.g:2666:7: (lv_exprs_12_0= ruleExprRule )
                    	    {
                    	    // InternalUclid.g:2666:7: (lv_exprs_12_0= ruleExprRule )
                    	    // InternalUclid.g:2667:8: lv_exprs_12_0= ruleExprRule
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getCallStatementAccess().getExprsExprRuleParserRuleCall_0_1_8_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_13, grammarAccess.getCallStatementAccess().getRightParenthesisKeyword_0_1_9());
                      				
                    }
                    otherlv_14=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_14, grammarAccess.getCallStatementAccess().getSemicolonKeyword_0_1_10());
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:2696:3: (otherlv_15= 'call' ( ( ruleFQN ) ) otherlv_17= '(' ( (lv_exprs_18_0= ruleExprRule ) ) (otherlv_19= ',' ( (lv_exprs_20_0= ruleExprRule ) ) )* otherlv_21= ')' otherlv_22= ';' )
                    {
                    // InternalUclid.g:2696:3: (otherlv_15= 'call' ( ( ruleFQN ) ) otherlv_17= '(' ( (lv_exprs_18_0= ruleExprRule ) ) (otherlv_19= ',' ( (lv_exprs_20_0= ruleExprRule ) ) )* otherlv_21= ')' otherlv_22= ';' )
                    // InternalUclid.g:2697:4: otherlv_15= 'call' ( ( ruleFQN ) ) otherlv_17= '(' ( (lv_exprs_18_0= ruleExprRule ) ) (otherlv_19= ',' ( (lv_exprs_20_0= ruleExprRule ) ) )* otherlv_21= ')' otherlv_22= ';'
                    {
                    otherlv_15=(Token)match(input,47,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getCallStatementAccess().getCallKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:2701:4: ( ( ruleFQN ) )
                    // InternalUclid.g:2702:5: ( ruleFQN )
                    {
                    // InternalUclid.g:2702:5: ( ruleFQN )
                    // InternalUclid.g:2703:6: ruleFQN
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getCallStatementRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCallStatementAccess().getTargetProcedureDeclCrossReference_1_1_0());
                      					
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

                    otherlv_17=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getCallStatementAccess().getLeftParenthesisKeyword_1_2());
                      			
                    }
                    // InternalUclid.g:2724:4: ( (lv_exprs_18_0= ruleExprRule ) )
                    // InternalUclid.g:2725:5: (lv_exprs_18_0= ruleExprRule )
                    {
                    // InternalUclid.g:2725:5: (lv_exprs_18_0= ruleExprRule )
                    // InternalUclid.g:2726:6: lv_exprs_18_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCallStatementAccess().getExprsExprRuleParserRuleCall_1_3_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_exprs_18_0=ruleExprRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getCallStatementRule());
                      						}
                      						add(
                      							current,
                      							"exprs",
                      							lv_exprs_18_0,
                      							"uclid.xtext.Uclid.ExprRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:2743:4: (otherlv_19= ',' ( (lv_exprs_20_0= ruleExprRule ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==25) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalUclid.g:2744:5: otherlv_19= ',' ( (lv_exprs_20_0= ruleExprRule ) )
                    	    {
                    	    otherlv_19=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_19, grammarAccess.getCallStatementAccess().getCommaKeyword_1_4_0());
                    	      				
                    	    }
                    	    // InternalUclid.g:2748:5: ( (lv_exprs_20_0= ruleExprRule ) )
                    	    // InternalUclid.g:2749:6: (lv_exprs_20_0= ruleExprRule )
                    	    {
                    	    // InternalUclid.g:2749:6: (lv_exprs_20_0= ruleExprRule )
                    	    // InternalUclid.g:2750:7: lv_exprs_20_0= ruleExprRule
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getCallStatementAccess().getExprsExprRuleParserRuleCall_1_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_22);
                    	    lv_exprs_20_0=ruleExprRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getCallStatementRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"exprs",
                    	      								lv_exprs_20_0,
                    	      								"uclid.xtext.Uclid.ExprRule");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getCallStatementAccess().getRightParenthesisKeyword_1_5());
                      			
                    }
                    otherlv_22=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_22, grammarAccess.getCallStatementAccess().getSemicolonKeyword_1_6());
                      			
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
    // $ANTLR end "ruleCallStatement"


    // $ANTLR start "entryRuleAssignmentRule"
    // InternalUclid.g:2781:1: entryRuleAssignmentRule returns [EObject current=null] : iv_ruleAssignmentRule= ruleAssignmentRule EOF ;
    public final EObject entryRuleAssignmentRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentRule = null;


        try {
            // InternalUclid.g:2781:55: (iv_ruleAssignmentRule= ruleAssignmentRule EOF )
            // InternalUclid.g:2782:2: iv_ruleAssignmentRule= ruleAssignmentRule EOF
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
    // InternalUclid.g:2788:1: ruleAssignmentRule returns [EObject current=null] : ( () ( ( (lv_lhs_1_0= ruleLhs ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleLhs ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )* ) ;
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
            // InternalUclid.g:2794:2: ( ( () ( ( (lv_lhs_1_0= ruleLhs ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleLhs ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )* ) )
            // InternalUclid.g:2795:2: ( () ( ( (lv_lhs_1_0= ruleLhs ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleLhs ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )* )
            {
            // InternalUclid.g:2795:2: ( () ( ( (lv_lhs_1_0= ruleLhs ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleLhs ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )* )
            // InternalUclid.g:2796:3: () ( ( (lv_lhs_1_0= ruleLhs ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleLhs ) )* )? ) otherlv_4= '=' ( (lv_exprs_5_0= ruleExprRule ) ) (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )*
            {
            // InternalUclid.g:2796:3: ()
            // InternalUclid.g:2797:4: 
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

            // InternalUclid.g:2806:3: ( ( (lv_lhs_1_0= ruleLhs ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleLhs ) )* )? )
            // InternalUclid.g:2807:4: ( (lv_lhs_1_0= ruleLhs ) ) (otherlv_2= ',' ( (lv_lhs_3_0= ruleLhs ) )* )?
            {
            // InternalUclid.g:2807:4: ( (lv_lhs_1_0= ruleLhs ) )
            // InternalUclid.g:2808:5: (lv_lhs_1_0= ruleLhs )
            {
            // InternalUclid.g:2808:5: (lv_lhs_1_0= ruleLhs )
            // InternalUclid.g:2809:6: lv_lhs_1_0= ruleLhs
            {
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getAssignmentRuleAccess().getLhsLhsParserRuleCall_1_0_0());
              					
            }
            pushFollow(FOLLOW_25);
            lv_lhs_1_0=ruleLhs();

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
              							"uclid.xtext.Uclid.Lhs");
              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalUclid.g:2826:4: (otherlv_2= ',' ( (lv_lhs_3_0= ruleLhs ) )* )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==25) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalUclid.g:2827:5: otherlv_2= ',' ( (lv_lhs_3_0= ruleLhs ) )*
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getAssignmentRuleAccess().getCommaKeyword_1_1_0());
                      				
                    }
                    // InternalUclid.g:2831:5: ( (lv_lhs_3_0= ruleLhs ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ID) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalUclid.g:2832:6: (lv_lhs_3_0= ruleLhs )
                    	    {
                    	    // InternalUclid.g:2832:6: (lv_lhs_3_0= ruleLhs )
                    	    // InternalUclid.g:2833:7: lv_lhs_3_0= ruleLhs
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAssignmentRuleAccess().getLhsLhsParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_26);
                    	    lv_lhs_3_0=ruleLhs();

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
                    	      								"uclid.xtext.Uclid.Lhs");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAssignmentRuleAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalUclid.g:2856:3: ( (lv_exprs_5_0= ruleExprRule ) )
            // InternalUclid.g:2857:4: (lv_exprs_5_0= ruleExprRule )
            {
            // InternalUclid.g:2857:4: (lv_exprs_5_0= ruleExprRule )
            // InternalUclid.g:2858:5: lv_exprs_5_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAssignmentRuleAccess().getExprsExprRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_27);
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

            // InternalUclid.g:2875:3: (otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==25) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalUclid.g:2876:4: otherlv_6= ',' ( (lv_exprs_7_0= ruleExprRule ) )
            	    {
            	    otherlv_6=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getAssignmentRuleAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalUclid.g:2880:4: ( (lv_exprs_7_0= ruleExprRule ) )
            	    // InternalUclid.g:2881:5: (lv_exprs_7_0= ruleExprRule )
            	    {
            	    // InternalUclid.g:2881:5: (lv_exprs_7_0= ruleExprRule )
            	    // InternalUclid.g:2882:6: lv_exprs_7_0= ruleExprRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAssignmentRuleAccess().getExprsExprRuleParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop41;
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
    // InternalUclid.g:2904:1: entryRuleBlkStmtRule returns [EObject current=null] : iv_ruleBlkStmtRule= ruleBlkStmtRule EOF ;
    public final EObject entryRuleBlkStmtRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlkStmtRule = null;


        try {
            // InternalUclid.g:2904:52: (iv_ruleBlkStmtRule= ruleBlkStmtRule EOF )
            // InternalUclid.g:2905:2: iv_ruleBlkStmtRule= ruleBlkStmtRule EOF
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
    // InternalUclid.g:2911:1: ruleBlkStmtRule returns [EObject current=null] : (otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleBlkStmtRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_dec_2_0 = null;

        EObject lv_stmt_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2917:2: ( (otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}' ) )
            // InternalUclid.g:2918:2: (otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}' )
            {
            // InternalUclid.g:2918:2: (otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}' )
            // InternalUclid.g:2919:3: otherlv_0= '{' () ( (lv_dec_2_0= ruleVarsDeclRule ) )* ( (lv_stmt_3_0= ruleStatementRule ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBlkStmtRuleAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalUclid.g:2923:3: ()
            // InternalUclid.g:2924:4: 
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

            // InternalUclid.g:2933:3: ( (lv_dec_2_0= ruleVarsDeclRule ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==24) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalUclid.g:2934:4: (lv_dec_2_0= ruleVarsDeclRule )
            	    {
            	    // InternalUclid.g:2934:4: (lv_dec_2_0= ruleVarsDeclRule )
            	    // InternalUclid.g:2935:5: lv_dec_2_0= ruleVarsDeclRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlkStmtRuleAccess().getDecVarsDeclRuleParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    break loop42;
                }
            } while (true);

            // InternalUclid.g:2952:3: ( (lv_stmt_3_0= ruleStatementRule ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||LA43_0==15||LA43_0==39||(LA43_0>=43 && LA43_0<=47)||LA43_0==51||LA43_0==53||LA43_0==56||LA43_0==59) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalUclid.g:2953:4: (lv_stmt_3_0= ruleStatementRule )
            	    {
            	    // InternalUclid.g:2953:4: (lv_stmt_3_0= ruleStatementRule )
            	    // InternalUclid.g:2954:5: lv_stmt_3_0= ruleStatementRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getBlkStmtRuleAccess().getStmtStatementRuleParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop43;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleLhs"
    // InternalUclid.g:2979:1: entryRuleLhs returns [EObject current=null] : iv_ruleLhs= ruleLhs EOF ;
    public final EObject entryRuleLhs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLhs = null;


        try {
            // InternalUclid.g:2979:44: (iv_ruleLhs= ruleLhs EOF )
            // InternalUclid.g:2980:2: iv_ruleLhs= ruleLhs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLhsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLhs=ruleLhs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLhs; 
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
    // $ANTLR end "entryRuleLhs"


    // $ANTLR start "ruleLhs"
    // InternalUclid.g:2986:1: ruleLhs returns [EObject current=null] : ( () ( (lv_target_1_0= ruleLhsVarRef ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExprRule ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleExprRule ) ) )* otherlv_6= ']' )? (otherlv_7= '\\'' )? ) ;
    public final EObject ruleLhs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_target_1_0 = null;

        EObject lv_index_3_0 = null;

        EObject lv_index_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:2992:2: ( ( () ( (lv_target_1_0= ruleLhsVarRef ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExprRule ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleExprRule ) ) )* otherlv_6= ']' )? (otherlv_7= '\\'' )? ) )
            // InternalUclid.g:2993:2: ( () ( (lv_target_1_0= ruleLhsVarRef ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExprRule ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleExprRule ) ) )* otherlv_6= ']' )? (otherlv_7= '\\'' )? )
            {
            // InternalUclid.g:2993:2: ( () ( (lv_target_1_0= ruleLhsVarRef ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExprRule ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleExprRule ) ) )* otherlv_6= ']' )? (otherlv_7= '\\'' )? )
            // InternalUclid.g:2994:3: () ( (lv_target_1_0= ruleLhsVarRef ) ) (otherlv_2= '[' ( (lv_index_3_0= ruleExprRule ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleExprRule ) ) )* otherlv_6= ']' )? (otherlv_7= '\\'' )?
            {
            // InternalUclid.g:2994:3: ()
            // InternalUclid.g:2995:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getLhsAccess().getLhsAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:3004:3: ( (lv_target_1_0= ruleLhsVarRef ) )
            // InternalUclid.g:3005:4: (lv_target_1_0= ruleLhsVarRef )
            {
            // InternalUclid.g:3005:4: (lv_target_1_0= ruleLhsVarRef )
            // InternalUclid.g:3006:5: lv_target_1_0= ruleLhsVarRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLhsAccess().getTargetLhsVarRefParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_target_1_0=ruleLhsVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLhsRule());
              					}
              					set(
              						current,
              						"target",
              						lv_target_1_0,
              						"uclid.xtext.Uclid.LhsVarRef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalUclid.g:3023:3: (otherlv_2= '[' ( (lv_index_3_0= ruleExprRule ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleExprRule ) ) )* otherlv_6= ']' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalUclid.g:3024:4: otherlv_2= '[' ( (lv_index_3_0= ruleExprRule ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleExprRule ) ) )* otherlv_6= ']'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLhsAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    // InternalUclid.g:3028:4: ( (lv_index_3_0= ruleExprRule ) )
                    // InternalUclid.g:3029:5: (lv_index_3_0= ruleExprRule )
                    {
                    // InternalUclid.g:3029:5: (lv_index_3_0= ruleExprRule )
                    // InternalUclid.g:3030:6: lv_index_3_0= ruleExprRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLhsAccess().getIndexExprRuleParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_index_3_0=ruleExprRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLhsRule());
                      						}
                      						add(
                      							current,
                      							"index",
                      							lv_index_3_0,
                      							"uclid.xtext.Uclid.ExprRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalUclid.g:3047:4: (otherlv_4= ',' ( (lv_index_5_0= ruleExprRule ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==25) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalUclid.g:3048:5: otherlv_4= ',' ( (lv_index_5_0= ruleExprRule ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getLhsAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalUclid.g:3052:5: ( (lv_index_5_0= ruleExprRule ) )
                    	    // InternalUclid.g:3053:6: (lv_index_5_0= ruleExprRule )
                    	    {
                    	    // InternalUclid.g:3053:6: (lv_index_5_0= ruleExprRule )
                    	    // InternalUclid.g:3054:7: lv_index_5_0= ruleExprRule
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLhsAccess().getIndexExprRuleParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_31);
                    	    lv_index_5_0=ruleExprRule();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLhsRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"index",
                    	      								lv_index_5_0,
                    	      								"uclid.xtext.Uclid.ExprRule");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,49,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getLhsAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:3077:3: (otherlv_7= '\\'' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalUclid.g:3078:4: otherlv_7= '\\''
                    {
                    otherlv_7=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getLhsAccess().getApostropheKeyword_3());
                      			
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
    // $ANTLR end "ruleLhs"


    // $ANTLR start "entryRuleLhsVarRef"
    // InternalUclid.g:3087:1: entryRuleLhsVarRef returns [EObject current=null] : iv_ruleLhsVarRef= ruleLhsVarRef EOF ;
    public final EObject entryRuleLhsVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLhsVarRef = null;


        try {
            // InternalUclid.g:3087:50: (iv_ruleLhsVarRef= ruleLhsVarRef EOF )
            // InternalUclid.g:3088:2: iv_ruleLhsVarRef= ruleLhsVarRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLhsVarRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLhsVarRef=ruleLhsVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLhsVarRef; 
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
    // $ANTLR end "entryRuleLhsVarRef"


    // $ANTLR start "ruleLhsVarRef"
    // InternalUclid.g:3094:1: ruleLhsVarRef returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleLhsVarRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUclid.g:3100:2: ( ( ( ruleFQN ) ) )
            // InternalUclid.g:3101:2: ( ( ruleFQN ) )
            {
            // InternalUclid.g:3101:2: ( ( ruleFQN ) )
            // InternalUclid.g:3102:3: ( ruleFQN )
            {
            // InternalUclid.g:3102:3: ( ruleFQN )
            // InternalUclid.g:3103:4: ruleFQN
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLhsVarRefRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getLhsVarRefAccess().getVarVarDeclCrossReference_0());
              			
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
    // $ANTLR end "ruleLhsVarRef"


    // $ANTLR start "entryRuleIfStmtRule"
    // InternalUclid.g:3123:1: entryRuleIfStmtRule returns [EObject current=null] : iv_ruleIfStmtRule= ruleIfStmtRule EOF ;
    public final EObject entryRuleIfStmtRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStmtRule = null;


        try {
            // InternalUclid.g:3123:51: (iv_ruleIfStmtRule= ruleIfStmtRule EOF )
            // InternalUclid.g:3124:2: iv_ruleIfStmtRule= ruleIfStmtRule EOF
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
    // InternalUclid.g:3130:1: ruleIfStmtRule returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )? ) ;
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
            // InternalUclid.g:3136:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )? ) )
            // InternalUclid.g:3137:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )? )
            {
            // InternalUclid.g:3137:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )? )
            // InternalUclid.g:3138:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_then_4_0= ruleBlkStmtRule ) ) (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfStmtRuleAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfStmtRuleAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:3146:3: ( (lv_c_2_0= ruleExprRule ) )
            // InternalUclid.g:3147:4: (lv_c_2_0= ruleExprRule )
            {
            // InternalUclid.g:3147:4: (lv_c_2_0= ruleExprRule )
            // InternalUclid.g:3148:5: lv_c_2_0= ruleExprRule
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

            otherlv_3=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfStmtRuleAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalUclid.g:3169:3: ( (lv_then_4_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3170:4: (lv_then_4_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3170:4: (lv_then_4_0= ruleBlkStmtRule )
            // InternalUclid.g:3171:5: lv_then_4_0= ruleBlkStmtRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfStmtRuleAccess().getThenBlkStmtRuleParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_33);
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

            // InternalUclid.g:3188:3: (otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==52) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalUclid.g:3189:4: otherlv_5= 'else' ( (lv_else_6_0= ruleBlkStmtRule ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getIfStmtRuleAccess().getElseKeyword_5_0());
                      			
                    }
                    // InternalUclid.g:3193:4: ( (lv_else_6_0= ruleBlkStmtRule ) )
                    // InternalUclid.g:3194:5: (lv_else_6_0= ruleBlkStmtRule )
                    {
                    // InternalUclid.g:3194:5: (lv_else_6_0= ruleBlkStmtRule )
                    // InternalUclid.g:3195:6: lv_else_6_0= ruleBlkStmtRule
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
    // InternalUclid.g:3217:1: entryRuleCaseStmtRule returns [EObject current=null] : iv_ruleCaseStmtRule= ruleCaseStmtRule EOF ;
    public final EObject entryRuleCaseStmtRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStmtRule = null;


        try {
            // InternalUclid.g:3217:53: (iv_ruleCaseStmtRule= ruleCaseStmtRule EOF )
            // InternalUclid.g:3218:2: iv_ruleCaseStmtRule= ruleCaseStmtRule EOF
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
    // InternalUclid.g:3224:1: ruleCaseStmtRule returns [EObject current=null] : ( () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac' ) ;
    public final EObject ruleCaseStmtRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_cases_2_1 = null;

        EObject lv_cases_2_2 = null;



        	enterRule();

        try {
            // InternalUclid.g:3230:2: ( ( () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac' ) )
            // InternalUclid.g:3231:2: ( () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac' )
            {
            // InternalUclid.g:3231:2: ( () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac' )
            // InternalUclid.g:3232:3: () otherlv_1= 'case' ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )* otherlv_3= 'esac'
            {
            // InternalUclid.g:3232:3: ()
            // InternalUclid.g:3233:4: 
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

            otherlv_1=(Token)match(input,53,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCaseStmtRuleAccess().getCaseKeyword_1());
              		
            }
            // InternalUclid.g:3246:3: ( ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_INT)||LA49_0==RULE_STRING||LA49_0==15||LA49_0==29||LA49_0==51||LA49_0==55||(LA49_0>=73 && LA49_0<=75)||(LA49_0>=78 && LA49_0<=79)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalUclid.g:3247:4: ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) )
            	    {
            	    // InternalUclid.g:3247:4: ( (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule ) )
            	    // InternalUclid.g:3248:5: (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule )
            	    {
            	    // InternalUclid.g:3248:5: (lv_cases_2_1= ruleCaseBlockRule | lv_cases_2_2= ruleDefaultCaseBlockRule )
            	    int alt48=2;
            	    int LA48_0 = input.LA(1);

            	    if ( ((LA48_0>=RULE_ID && LA48_0<=RULE_INT)||LA48_0==RULE_STRING||LA48_0==15||LA48_0==29||LA48_0==51||(LA48_0>=73 && LA48_0<=75)||(LA48_0>=78 && LA48_0<=79)) ) {
            	        alt48=1;
            	    }
            	    else if ( (LA48_0==55) ) {
            	        alt48=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 48, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt48) {
            	        case 1 :
            	            // InternalUclid.g:3249:6: lv_cases_2_1= ruleCaseBlockRule
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getCaseStmtRuleAccess().getCasesCaseBlockRuleParserRuleCall_2_0_0());
            	              					
            	            }
            	            pushFollow(FOLLOW_34);
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
            	            // InternalUclid.g:3265:6: lv_cases_2_2= ruleDefaultCaseBlockRule
            	            {
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getCaseStmtRuleAccess().getCasesDefaultCaseBlockRuleParserRuleCall_2_0_1());
            	              					
            	            }
            	            pushFollow(FOLLOW_34);
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
            	    break loop49;
                }
            } while (true);

            otherlv_3=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:3291:1: entryRuleDefaultCaseBlockRule returns [EObject current=null] : iv_ruleDefaultCaseBlockRule= ruleDefaultCaseBlockRule EOF ;
    public final EObject entryRuleDefaultCaseBlockRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultCaseBlockRule = null;


        try {
            // InternalUclid.g:3291:61: (iv_ruleDefaultCaseBlockRule= ruleDefaultCaseBlockRule EOF )
            // InternalUclid.g:3292:2: iv_ruleDefaultCaseBlockRule= ruleDefaultCaseBlockRule EOF
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
    // InternalUclid.g:3298:1: ruleDefaultCaseBlockRule returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleDefaultCaseBlockRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3304:2: ( (otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:3305:2: (otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:3305:2: (otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:3306:3: otherlv_0= 'default' otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDefaultCaseBlockRuleAccess().getDefaultKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDefaultCaseBlockRuleAccess().getColonKeyword_1());
              		
            }
            // InternalUclid.g:3314:3: ( (lv_body_2_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3315:4: (lv_body_2_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3315:4: (lv_body_2_0= ruleBlkStmtRule )
            // InternalUclid.g:3316:5: lv_body_2_0= ruleBlkStmtRule
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
    // InternalUclid.g:3337:1: entryRuleCaseBlockRule returns [EObject current=null] : iv_ruleCaseBlockRule= ruleCaseBlockRule EOF ;
    public final EObject entryRuleCaseBlockRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseBlockRule = null;


        try {
            // InternalUclid.g:3337:54: (iv_ruleCaseBlockRule= ruleCaseBlockRule EOF )
            // InternalUclid.g:3338:2: iv_ruleCaseBlockRule= ruleCaseBlockRule EOF
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
    // InternalUclid.g:3344:1: ruleCaseBlockRule returns [EObject current=null] : ( ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleCaseBlockRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_body_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3350:2: ( ( ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:3351:2: ( ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:3351:2: ( ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:3352:3: ( (lv_e_0_0= ruleExprRule ) ) otherlv_1= ':' ( (lv_body_2_0= ruleBlkStmtRule ) )
            {
            // InternalUclid.g:3352:3: ( (lv_e_0_0= ruleExprRule ) )
            // InternalUclid.g:3353:4: (lv_e_0_0= ruleExprRule )
            {
            // InternalUclid.g:3353:4: (lv_e_0_0= ruleExprRule )
            // InternalUclid.g:3354:5: lv_e_0_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseBlockRuleAccess().getEExprRuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
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

            otherlv_1=(Token)match(input,22,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCaseBlockRuleAccess().getColonKeyword_1());
              		
            }
            // InternalUclid.g:3375:3: ( (lv_body_2_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3376:4: (lv_body_2_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3376:4: (lv_body_2_0= ruleBlkStmtRule )
            // InternalUclid.g:3377:5: lv_body_2_0= ruleBlkStmtRule
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
    // InternalUclid.g:3398:1: entryRuleForLoopRule returns [EObject current=null] : iv_ruleForLoopRule= ruleForLoopRule EOF ;
    public final EObject entryRuleForLoopRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForLoopRule = null;


        try {
            // InternalUclid.g:3398:52: (iv_ruleForLoopRule= ruleForLoopRule EOF )
            // InternalUclid.g:3399:2: iv_ruleForLoopRule= ruleForLoopRule EOF
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
    // InternalUclid.g:3405:1: ruleForLoopRule returns [EObject current=null] : (otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ub_7_0= RULE_INT ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) ) ) ;
    public final EObject ruleForLoopRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_lb_5_0=null;
        Token otherlv_6=null;
        Token lv_ub_7_0=null;
        Token otherlv_8=null;
        EObject lv_iterator_1_0 = null;

        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3411:2: ( (otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ub_7_0= RULE_INT ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:3412:2: (otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ub_7_0= RULE_INT ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:3412:2: (otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ub_7_0= RULE_INT ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:3413:3: otherlv_0= 'for' ( (lv_iterator_1_0= ruleVarDecl ) ) otherlv_2= 'in' otherlv_3= 'range' otherlv_4= '(' ( (lv_lb_5_0= RULE_INT ) ) otherlv_6= ',' ( (lv_ub_7_0= RULE_INT ) ) otherlv_8= ')' ( (lv_body_9_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getForLoopRuleAccess().getForKeyword_0());
              		
            }
            // InternalUclid.g:3417:3: ( (lv_iterator_1_0= ruleVarDecl ) )
            // InternalUclid.g:3418:4: (lv_iterator_1_0= ruleVarDecl )
            {
            // InternalUclid.g:3418:4: (lv_iterator_1_0= ruleVarDecl )
            // InternalUclid.g:3419:5: lv_iterator_1_0= ruleVarDecl
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getForLoopRuleAccess().getIteratorVarDeclParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_35);
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

            otherlv_2=(Token)match(input,57,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getForLoopRuleAccess().getInKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,58,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getForLoopRuleAccess().getRangeKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,29,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getForLoopRuleAccess().getLeftParenthesisKeyword_4());
              		
            }
            // InternalUclid.g:3448:3: ( (lv_lb_5_0= RULE_INT ) )
            // InternalUclid.g:3449:4: (lv_lb_5_0= RULE_INT )
            {
            // InternalUclid.g:3449:4: (lv_lb_5_0= RULE_INT )
            // InternalUclid.g:3450:5: lv_lb_5_0= RULE_INT
            {
            lv_lb_5_0=(Token)match(input,RULE_INT,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_lb_5_0, grammarAccess.getForLoopRuleAccess().getLbINTTerminalRuleCall_5_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForLoopRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"lb",
              						lv_lb_5_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getForLoopRuleAccess().getCommaKeyword_6());
              		
            }
            // InternalUclid.g:3470:3: ( (lv_ub_7_0= RULE_INT ) )
            // InternalUclid.g:3471:4: (lv_ub_7_0= RULE_INT )
            {
            // InternalUclid.g:3471:4: (lv_ub_7_0= RULE_INT )
            // InternalUclid.g:3472:5: lv_ub_7_0= RULE_INT
            {
            lv_ub_7_0=(Token)match(input,RULE_INT,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_ub_7_0, grammarAccess.getForLoopRuleAccess().getUbINTTerminalRuleCall_7_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getForLoopRuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"ub",
              						lv_ub_7_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
            }

            }


            }

            otherlv_8=(Token)match(input,30,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getForLoopRuleAccess().getRightParenthesisKeyword_8());
              		
            }
            // InternalUclid.g:3492:3: ( (lv_body_9_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3493:4: (lv_body_9_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3493:4: (lv_body_9_0= ruleBlkStmtRule )
            // InternalUclid.g:3494:5: lv_body_9_0= ruleBlkStmtRule
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
    // InternalUclid.g:3515:1: entryRuleWhileLoopRule returns [EObject current=null] : iv_ruleWhileLoopRule= ruleWhileLoopRule EOF ;
    public final EObject entryRuleWhileLoopRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileLoopRule = null;


        try {
            // InternalUclid.g:3515:54: (iv_ruleWhileLoopRule= ruleWhileLoopRule EOF )
            // InternalUclid.g:3516:2: iv_ruleWhileLoopRule= ruleWhileLoopRule EOF
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
    // InternalUclid.g:3522:1: ruleWhileLoopRule returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleInvariantClauseRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) ) ) ;
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
            // InternalUclid.g:3528:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleInvariantClauseRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) ) ) )
            // InternalUclid.g:3529:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleInvariantClauseRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) ) )
            {
            // InternalUclid.g:3529:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleInvariantClauseRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) ) )
            // InternalUclid.g:3530:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' ( (lv_inv_4_0= ruleInvariantClauseRule ) )* ( (lv_stmt_5_0= ruleBlkStmtRule ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getWhileLoopRuleAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getWhileLoopRuleAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:3538:3: ( (lv_c_2_0= ruleExprRule ) )
            // InternalUclid.g:3539:4: (lv_c_2_0= ruleExprRule )
            {
            // InternalUclid.g:3539:4: (lv_c_2_0= ruleExprRule )
            // InternalUclid.g:3540:5: lv_c_2_0= ruleExprRule
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

            otherlv_3=(Token)match(input,30,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getWhileLoopRuleAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalUclid.g:3561:3: ( (lv_inv_4_0= ruleInvariantClauseRule ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=40 && LA50_0<=41)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalUclid.g:3562:4: (lv_inv_4_0= ruleInvariantClauseRule )
            	    {
            	    // InternalUclid.g:3562:4: (lv_inv_4_0= ruleInvariantClauseRule )
            	    // InternalUclid.g:3563:5: lv_inv_4_0= ruleInvariantClauseRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getWhileLoopRuleAccess().getInvInvariantClauseRuleParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_38);
            	    lv_inv_4_0=ruleInvariantClauseRule();

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
            	      						"uclid.xtext.Uclid.InvariantClauseRule");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            // InternalUclid.g:3580:3: ( (lv_stmt_5_0= ruleBlkStmtRule ) )
            // InternalUclid.g:3581:4: (lv_stmt_5_0= ruleBlkStmtRule )
            {
            // InternalUclid.g:3581:4: (lv_stmt_5_0= ruleBlkStmtRule )
            // InternalUclid.g:3582:5: lv_stmt_5_0= ruleBlkStmtRule
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


    // $ANTLR start "entryRuleInvariantClauseRule"
    // InternalUclid.g:3603:1: entryRuleInvariantClauseRule returns [EObject current=null] : iv_ruleInvariantClauseRule= ruleInvariantClauseRule EOF ;
    public final EObject entryRuleInvariantClauseRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariantClauseRule = null;


        try {
            // InternalUclid.g:3603:60: (iv_ruleInvariantClauseRule= ruleInvariantClauseRule EOF )
            // InternalUclid.g:3604:2: iv_ruleInvariantClauseRule= ruleInvariantClauseRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantClauseRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInvariantClauseRule=ruleInvariantClauseRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariantClauseRule; 
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
    // $ANTLR end "entryRuleInvariantClauseRule"


    // $ANTLR start "ruleInvariantClauseRule"
    // InternalUclid.g:3610:1: ruleInvariantClauseRule returns [EObject current=null] : ( (otherlv_0= 'property' | otherlv_1= 'invariant' ) (otherlv_2= '[' otherlv_3= 'LTL' otherlv_4= ']' )? ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= ';' ) ;
    public final EObject ruleInvariantClauseRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_e_5_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3616:2: ( ( (otherlv_0= 'property' | otherlv_1= 'invariant' ) (otherlv_2= '[' otherlv_3= 'LTL' otherlv_4= ']' )? ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= ';' ) )
            // InternalUclid.g:3617:2: ( (otherlv_0= 'property' | otherlv_1= 'invariant' ) (otherlv_2= '[' otherlv_3= 'LTL' otherlv_4= ']' )? ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= ';' )
            {
            // InternalUclid.g:3617:2: ( (otherlv_0= 'property' | otherlv_1= 'invariant' ) (otherlv_2= '[' otherlv_3= 'LTL' otherlv_4= ']' )? ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= ';' )
            // InternalUclid.g:3618:3: (otherlv_0= 'property' | otherlv_1= 'invariant' ) (otherlv_2= '[' otherlv_3= 'LTL' otherlv_4= ']' )? ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= ';'
            {
            // InternalUclid.g:3618:3: (otherlv_0= 'property' | otherlv_1= 'invariant' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==40) ) {
                alt51=1;
            }
            else if ( (LA51_0==41) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalUclid.g:3619:4: otherlv_0= 'property'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getInvariantClauseRuleAccess().getPropertyKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:3624:4: otherlv_1= 'invariant'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getInvariantClauseRuleAccess().getInvariantKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:3629:3: (otherlv_2= '[' otherlv_3= 'LTL' otherlv_4= ']' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==48) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalUclid.g:3630:4: otherlv_2= '[' otherlv_3= 'LTL' otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getInvariantClauseRuleAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    otherlv_3=(Token)match(input,60,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getInvariantClauseRuleAccess().getLTLKeyword_1_1());
                      			
                    }
                    otherlv_4=(Token)match(input,49,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getInvariantClauseRuleAccess().getRightSquareBracketKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:3643:3: ( (lv_e_5_0= ruleExprRule ) )
            // InternalUclid.g:3644:4: (lv_e_5_0= ruleExprRule )
            {
            // InternalUclid.g:3644:4: (lv_e_5_0= ruleExprRule )
            // InternalUclid.g:3645:5: lv_e_5_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getInvariantClauseRuleAccess().getEExprRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_e_5_0=ruleExprRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getInvariantClauseRuleRule());
              					}
              					set(
              						current,
              						"e",
              						lv_e_5_0,
              						"uclid.xtext.Uclid.ExprRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getInvariantClauseRuleAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleInvariantClauseRule"


    // $ANTLR start "entryRuleExprRule"
    // InternalUclid.g:3670:1: entryRuleExprRule returns [EObject current=null] : iv_ruleExprRule= ruleExprRule EOF ;
    public final EObject entryRuleExprRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprRule = null;


        try {
            // InternalUclid.g:3670:49: (iv_ruleExprRule= ruleExprRule EOF )
            // InternalUclid.g:3671:2: iv_ruleExprRule= ruleExprRule EOF
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
    // InternalUclid.g:3677:1: ruleExprRule returns [EObject current=null] : this_E1Rule_0= ruleE1Rule ;
    public final EObject ruleExprRule() throws RecognitionException {
        EObject current = null;

        EObject this_E1Rule_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3683:2: (this_E1Rule_0= ruleE1Rule )
            // InternalUclid.g:3684:2: this_E1Rule_0= ruleE1Rule
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
    // InternalUclid.g:3698:1: entryRuleE1Rule returns [EObject current=null] : iv_ruleE1Rule= ruleE1Rule EOF ;
    public final EObject entryRuleE1Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE1Rule = null;


        try {
            // InternalUclid.g:3698:47: (iv_ruleE1Rule= ruleE1Rule EOF )
            // InternalUclid.g:3699:2: iv_ruleE1Rule= ruleE1Rule EOF
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
    // InternalUclid.g:3705:1: ruleE1Rule returns [EObject current=null] : (this_E2Rule_0= ruleE2Rule | (otherlv_1= '(' ( ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= '::' ( (lv_a_7_0= ruleE1Rule ) ) otherlv_8= ')' ) ) ;
    public final EObject ruleE1Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_pred_2_1=null;
        Token lv_pred_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_E2Rule_0 = null;

        EObject lv_l_4_0 = null;

        EObject lv_a_7_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:3711:2: ( (this_E2Rule_0= ruleE2Rule | (otherlv_1= '(' ( ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= '::' ( (lv_a_7_0= ruleE1Rule ) ) otherlv_8= ')' ) ) )
            // InternalUclid.g:3712:2: (this_E2Rule_0= ruleE2Rule | (otherlv_1= '(' ( ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= '::' ( (lv_a_7_0= ruleE1Rule ) ) otherlv_8= ')' ) )
            {
            // InternalUclid.g:3712:2: (this_E2Rule_0= ruleE2Rule | (otherlv_1= '(' ( ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= '::' ( (lv_a_7_0= ruleE1Rule ) ) otherlv_8= ')' ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_INT)||LA55_0==RULE_STRING||LA55_0==15||LA55_0==51||(LA55_0>=73 && LA55_0<=75)||(LA55_0>=78 && LA55_0<=79)) ) {
                alt55=1;
            }
            else if ( (LA55_0==29) ) {
                int LA55_2 = input.LA(2);

                if ( ((LA55_2>=RULE_ID && LA55_2<=RULE_INT)||LA55_2==RULE_STRING||LA55_2==15||LA55_2==29||LA55_2==51||(LA55_2>=73 && LA55_2<=75)||(LA55_2>=78 && LA55_2<=79)) ) {
                    alt55=1;
                }
                else if ( ((LA55_2>=61 && LA55_2<=62)) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalUclid.g:3713:3: this_E2Rule_0= ruleE2Rule
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
                    // InternalUclid.g:3725:3: (otherlv_1= '(' ( ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= '::' ( (lv_a_7_0= ruleE1Rule ) ) otherlv_8= ')' )
                    {
                    // InternalUclid.g:3725:3: (otherlv_1= '(' ( ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= '::' ( (lv_a_7_0= ruleE1Rule ) ) otherlv_8= ')' )
                    // InternalUclid.g:3726:4: otherlv_1= '(' ( ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) ) ) otherlv_3= '(' ( (lv_l_4_0= ruleIdTypeListRule ) )? otherlv_5= ')' otherlv_6= '::' ( (lv_a_7_0= ruleE1Rule ) ) otherlv_8= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getE1RuleAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:3730:4: ( ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) ) )
                    // InternalUclid.g:3731:5: ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) )
                    {
                    // InternalUclid.g:3731:5: ( (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' ) )
                    // InternalUclid.g:3732:6: (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' )
                    {
                    // InternalUclid.g:3732:6: (lv_pred_2_1= 'forall' | lv_pred_2_2= 'exists' )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==61) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==62) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalUclid.g:3733:7: lv_pred_2_1= 'forall'
                            {
                            lv_pred_2_1=(Token)match(input,61,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_pred_2_1, grammarAccess.getE1RuleAccess().getPredForallKeyword_1_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getE1RuleRule());
                              							}
                              							setWithLastConsumed(current, "pred", lv_pred_2_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalUclid.g:3744:7: lv_pred_2_2= 'exists'
                            {
                            lv_pred_2_2=(Token)match(input,62,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_pred_2_2, grammarAccess.getE1RuleAccess().getPredExistsKeyword_1_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getE1RuleRule());
                              							}
                              							setWithLastConsumed(current, "pred", lv_pred_2_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getE1RuleAccess().getLeftParenthesisKeyword_1_2());
                      			
                    }
                    // InternalUclid.g:3761:4: ( (lv_l_4_0= ruleIdTypeListRule ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_ID) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // InternalUclid.g:3762:5: (lv_l_4_0= ruleIdTypeListRule )
                            {
                            // InternalUclid.g:3762:5: (lv_l_4_0= ruleIdTypeListRule )
                            // InternalUclid.g:3763:6: lv_l_4_0= ruleIdTypeListRule
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getE1RuleAccess().getLIdTypeListRuleParserRuleCall_1_3_0());
                              					
                            }
                            pushFollow(FOLLOW_19);
                            lv_l_4_0=ruleIdTypeListRule();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getE1RuleRule());
                              						}
                              						set(
                              							current,
                              							"l",
                              							lv_l_4_0,
                              							"uclid.xtext.Uclid.IdTypeListRule");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,30,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getE1RuleAccess().getRightParenthesisKeyword_1_4());
                      			
                    }
                    otherlv_6=(Token)match(input,63,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getE1RuleAccess().getColonColonKeyword_1_5());
                      			
                    }
                    // InternalUclid.g:3788:4: ( (lv_a_7_0= ruleE1Rule ) )
                    // InternalUclid.g:3789:5: (lv_a_7_0= ruleE1Rule )
                    {
                    // InternalUclid.g:3789:5: (lv_a_7_0= ruleE1Rule )
                    // InternalUclid.g:3790:6: lv_a_7_0= ruleE1Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE1RuleAccess().getAE1RuleParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_a_7_0=ruleE1Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getE1RuleRule());
                      						}
                      						set(
                      							current,
                      							"a",
                      							lv_a_7_0,
                      							"uclid.xtext.Uclid.E1Rule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getE1RuleAccess().getRightParenthesisKeyword_1_7());
                      			
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
    // InternalUclid.g:3816:1: entryRuleE2Rule returns [EObject current=null] : iv_ruleE2Rule= ruleE2Rule EOF ;
    public final EObject entryRuleE2Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE2Rule = null;


        try {
            // InternalUclid.g:3816:47: (iv_ruleE2Rule= ruleE2Rule EOF )
            // InternalUclid.g:3817:2: iv_ruleE2Rule= ruleE2Rule EOF
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
    // InternalUclid.g:3823:1: ruleE2Rule returns [EObject current=null] : ( ( (lv_z_0_0= ruleE3Rule ) ) (otherlv_1= '<==>' ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )* ) ;
    public final EObject ruleE2Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_z_0_0 = null;

        EObject lv_q_2_1 = null;

        EObject lv_q_2_2 = null;



        	enterRule();

        try {
            // InternalUclid.g:3829:2: ( ( ( (lv_z_0_0= ruleE3Rule ) ) (otherlv_1= '<==>' ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )* ) )
            // InternalUclid.g:3830:2: ( ( (lv_z_0_0= ruleE3Rule ) ) (otherlv_1= '<==>' ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )* )
            {
            // InternalUclid.g:3830:2: ( ( (lv_z_0_0= ruleE3Rule ) ) (otherlv_1= '<==>' ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )* )
            // InternalUclid.g:3831:3: ( (lv_z_0_0= ruleE3Rule ) ) (otherlv_1= '<==>' ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )*
            {
            // InternalUclid.g:3831:3: ( (lv_z_0_0= ruleE3Rule ) )
            // InternalUclid.g:3832:4: (lv_z_0_0= ruleE3Rule )
            {
            // InternalUclid.g:3832:4: (lv_z_0_0= ruleE3Rule )
            // InternalUclid.g:3833:5: lv_z_0_0= ruleE3Rule
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

            // InternalUclid.g:3850:3: (otherlv_1= '<==>' ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==64) ) {
                    int LA57_2 = input.LA(2);

                    if ( (synpred79_InternalUclid()) ) {
                        alt57=1;
                    }


                }


                switch (alt57) {
            	case 1 :
            	    // InternalUclid.g:3851:4: otherlv_1= '<==>' ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) )
            	    {
            	    otherlv_1=(Token)match(input,64,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE2RuleAccess().getLessThanSignEqualsSignEqualsSignGreaterThanSignKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:3855:4: ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) )
            	    // InternalUclid.g:3856:5: ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) )
            	    {
            	    // InternalUclid.g:3856:5: ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) )
            	    // InternalUclid.g:3857:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )
            	    {
            	    // InternalUclid.g:3857:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )
            	    int alt56=2;
            	    alt56 = dfa56.predict(input);
            	    switch (alt56) {
            	        case 1 :
            	            // InternalUclid.g:3858:7: lv_q_2_1= ruleE2Rule
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
            	            // InternalUclid.g:3874:7: lv_q_2_2= ruleE3Rule
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
            	    break loop57;
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
    // InternalUclid.g:3897:1: entryRuleE3Rule returns [EObject current=null] : iv_ruleE3Rule= ruleE3Rule EOF ;
    public final EObject entryRuleE3Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE3Rule = null;


        try {
            // InternalUclid.g:3897:47: (iv_ruleE3Rule= ruleE3Rule EOF )
            // InternalUclid.g:3898:2: iv_ruleE3Rule= ruleE3Rule EOF
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
    // InternalUclid.g:3904:1: ruleE3Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE4Rule ) ) (otherlv_1= '==>' ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )* ) ;
    public final EObject ruleE3Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_1 = null;

        EObject lv_e_2_2 = null;



        	enterRule();

        try {
            // InternalUclid.g:3910:2: ( ( ( (lv_e_0_0= ruleE4Rule ) ) (otherlv_1= '==>' ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )* ) )
            // InternalUclid.g:3911:2: ( ( (lv_e_0_0= ruleE4Rule ) ) (otherlv_1= '==>' ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )* )
            {
            // InternalUclid.g:3911:2: ( ( (lv_e_0_0= ruleE4Rule ) ) (otherlv_1= '==>' ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )* )
            // InternalUclid.g:3912:3: ( (lv_e_0_0= ruleE4Rule ) ) (otherlv_1= '==>' ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )*
            {
            // InternalUclid.g:3912:3: ( (lv_e_0_0= ruleE4Rule ) )
            // InternalUclid.g:3913:4: (lv_e_0_0= ruleE4Rule )
            {
            // InternalUclid.g:3913:4: (lv_e_0_0= ruleE4Rule )
            // InternalUclid.g:3914:5: lv_e_0_0= ruleE4Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE3RuleAccess().getEE4RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_45);
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

            // InternalUclid.g:3931:3: (otherlv_1= '==>' ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==65) ) {
                    int LA59_2 = input.LA(2);

                    if ( (synpred81_InternalUclid()) ) {
                        alt59=1;
                    }


                }


                switch (alt59) {
            	case 1 :
            	    // InternalUclid.g:3932:4: otherlv_1= '==>' ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) )
            	    {
            	    otherlv_1=(Token)match(input,65,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE3RuleAccess().getEqualsSignEqualsSignGreaterThanSignKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:3936:4: ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) )
            	    // InternalUclid.g:3937:5: ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) )
            	    {
            	    // InternalUclid.g:3937:5: ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) )
            	    // InternalUclid.g:3938:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )
            	    {
            	    // InternalUclid.g:3938:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )
            	    int alt58=2;
            	    alt58 = dfa58.predict(input);
            	    switch (alt58) {
            	        case 1 :
            	            // InternalUclid.g:3939:7: lv_e_2_1= ruleE3Rule
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getE3RuleAccess().getEE3RuleParserRuleCall_1_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_45);
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
            	            // InternalUclid.g:3955:7: lv_e_2_2= ruleE4Rule
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getE3RuleAccess().getEE4RuleParserRuleCall_1_1_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_45);
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
            	    break loop59;
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
    // InternalUclid.g:3978:1: entryRuleE4Rule returns [EObject current=null] : iv_ruleE4Rule= ruleE4Rule EOF ;
    public final EObject entryRuleE4Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE4Rule = null;


        try {
            // InternalUclid.g:3978:47: (iv_ruleE4Rule= ruleE4Rule EOF )
            // InternalUclid.g:3979:2: iv_ruleE4Rule= ruleE4Rule EOF
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
    // InternalUclid.g:3985:1: ruleE4Rule returns [EObject current=null] : ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) ) ;
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
            // InternalUclid.g:3991:2: ( ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) ) )
            // InternalUclid.g:3992:2: ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) )
            {
            // InternalUclid.g:3992:2: ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) )
            int alt60=6;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // InternalUclid.g:3993:3: ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:3993:3: ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) )
                    // InternalUclid.g:3994:4: ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:3994:4: ( (lv_e_0_0= ruleE5Rule ) )
                    // InternalUclid.g:3995:5: (lv_e_0_0= ruleE5Rule )
                    {
                    // InternalUclid.g:3995:5: (lv_e_0_0= ruleE5Rule )
                    // InternalUclid.g:3996:6: lv_e_0_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_46);
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

                    otherlv_1=(Token)match(input,66,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getE4RuleAccess().getAmpersandAmpersandKeyword_0_1());
                      			
                    }
                    // InternalUclid.g:4017:4: ( (lv_e_2_0= ruleE4Rule ) )
                    // InternalUclid.g:4018:5: (lv_e_2_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4018:5: (lv_e_2_0= ruleE4Rule )
                    // InternalUclid.g:4019:6: lv_e_2_0= ruleE4Rule
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
                    // InternalUclid.g:4038:3: ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:4038:3: ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) )
                    // InternalUclid.g:4039:4: ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:4039:4: ( (lv_e_3_0= ruleE5Rule ) )
                    // InternalUclid.g:4040:5: (lv_e_3_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4040:5: (lv_e_3_0= ruleE5Rule )
                    // InternalUclid.g:4041:6: lv_e_3_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_47);
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

                    otherlv_4=(Token)match(input,67,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getE4RuleAccess().getVerticalLineVerticalLineKeyword_1_1());
                      			
                    }
                    // InternalUclid.g:4062:4: ( (lv_e_5_0= ruleE4Rule ) )
                    // InternalUclid.g:4063:5: (lv_e_5_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4063:5: (lv_e_5_0= ruleE4Rule )
                    // InternalUclid.g:4064:6: lv_e_5_0= ruleE4Rule
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
                    // InternalUclid.g:4083:3: ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:4083:3: ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) )
                    // InternalUclid.g:4084:4: ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:4084:4: ( (lv_e_6_0= ruleE5Rule ) )
                    // InternalUclid.g:4085:5: (lv_e_6_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4085:5: (lv_e_6_0= ruleE5Rule )
                    // InternalUclid.g:4086:6: lv_e_6_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_48);
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

                    otherlv_7=(Token)match(input,68,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getE4RuleAccess().getAmpersandKeyword_2_1());
                      			
                    }
                    // InternalUclid.g:4107:4: ( (lv_e_8_0= ruleE4Rule ) )
                    // InternalUclid.g:4108:5: (lv_e_8_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4108:5: (lv_e_8_0= ruleE4Rule )
                    // InternalUclid.g:4109:6: lv_e_8_0= ruleE4Rule
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
                    // InternalUclid.g:4128:3: ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:4128:3: ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) )
                    // InternalUclid.g:4129:4: ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:4129:4: ( (lv_e_9_0= ruleE5Rule ) )
                    // InternalUclid.g:4130:5: (lv_e_9_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4130:5: (lv_e_9_0= ruleE5Rule )
                    // InternalUclid.g:4131:6: lv_e_9_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_49);
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

                    otherlv_10=(Token)match(input,69,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getE4RuleAccess().getVerticalLineKeyword_3_1());
                      			
                    }
                    // InternalUclid.g:4152:4: ( (lv_e_11_0= ruleE4Rule ) )
                    // InternalUclid.g:4153:5: (lv_e_11_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4153:5: (lv_e_11_0= ruleE4Rule )
                    // InternalUclid.g:4154:6: lv_e_11_0= ruleE4Rule
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
                    // InternalUclid.g:4173:3: ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) )
                    {
                    // InternalUclid.g:4173:3: ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) )
                    // InternalUclid.g:4174:4: ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) )
                    {
                    // InternalUclid.g:4174:4: ( (lv_e_12_0= ruleE5Rule ) )
                    // InternalUclid.g:4175:5: (lv_e_12_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4175:5: (lv_e_12_0= ruleE5Rule )
                    // InternalUclid.g:4176:6: lv_e_12_0= ruleE5Rule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_50);
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

                    otherlv_13=(Token)match(input,70,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getE4RuleAccess().getCircumflexAccentKeyword_4_1());
                      			
                    }
                    // InternalUclid.g:4197:4: ( (lv_e_14_0= ruleE4Rule ) )
                    // InternalUclid.g:4198:5: (lv_e_14_0= ruleE4Rule )
                    {
                    // InternalUclid.g:4198:5: (lv_e_14_0= ruleE4Rule )
                    // InternalUclid.g:4199:6: lv_e_14_0= ruleE4Rule
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
                    // InternalUclid.g:4218:3: ( (lv_e_15_0= ruleE5Rule ) )
                    {
                    // InternalUclid.g:4218:3: ( (lv_e_15_0= ruleE5Rule ) )
                    // InternalUclid.g:4219:4: (lv_e_15_0= ruleE5Rule )
                    {
                    // InternalUclid.g:4219:4: (lv_e_15_0= ruleE5Rule )
                    // InternalUclid.g:4220:5: lv_e_15_0= ruleE5Rule
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
    // InternalUclid.g:4241:1: entryRuleE5Rule returns [EObject current=null] : iv_ruleE5Rule= ruleE5Rule EOF ;
    public final EObject entryRuleE5Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE5Rule = null;


        try {
            // InternalUclid.g:4241:47: (iv_ruleE5Rule= ruleE5Rule EOF )
            // InternalUclid.g:4242:2: iv_ruleE5Rule= ruleE5Rule EOF
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
    // InternalUclid.g:4248:1: ruleE5Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )* ) ;
    public final EObject ruleE5Rule() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4254:2: ( ( ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )* ) )
            // InternalUclid.g:4255:2: ( ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )* )
            {
            // InternalUclid.g:4255:2: ( ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )* )
            // InternalUclid.g:4256:3: ( (lv_e_0_0= ruleE6Rule ) ) ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )*
            {
            // InternalUclid.g:4256:3: ( (lv_e_0_0= ruleE6Rule ) )
            // InternalUclid.g:4257:4: (lv_e_0_0= ruleE6Rule )
            {
            // InternalUclid.g:4257:4: (lv_e_0_0= ruleE6Rule )
            // InternalUclid.g:4258:5: lv_e_0_0= ruleE6Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE5RuleAccess().getEE6RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_51);
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

            // InternalUclid.g:4275:3: ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_REL_OP_RULE) ) {
                    int LA61_2 = input.LA(2);

                    if ( (synpred87_InternalUclid()) ) {
                        alt61=1;
                    }


                }


                switch (alt61) {
            	case 1 :
            	    // InternalUclid.g:4276:4: ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) )
            	    {
            	    // InternalUclid.g:4276:4: ( (lv_op_1_0= RULE_REL_OP_RULE ) )
            	    // InternalUclid.g:4277:5: (lv_op_1_0= RULE_REL_OP_RULE )
            	    {
            	    // InternalUclid.g:4277:5: (lv_op_1_0= RULE_REL_OP_RULE )
            	    // InternalUclid.g:4278:6: lv_op_1_0= RULE_REL_OP_RULE
            	    {
            	    lv_op_1_0=(Token)match(input,RULE_REL_OP_RULE,FOLLOW_20); if (state.failed) return current;
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

            	    // InternalUclid.g:4294:4: ( (lv_e_2_0= ruleE6Rule ) )
            	    // InternalUclid.g:4295:5: (lv_e_2_0= ruleE6Rule )
            	    {
            	    // InternalUclid.g:4295:5: (lv_e_2_0= ruleE6Rule )
            	    // InternalUclid.g:4296:6: lv_e_2_0= ruleE6Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE5RuleAccess().getEE6RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
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
            	    break loop61;
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
    // InternalUclid.g:4318:1: entryRuleE6Rule returns [EObject current=null] : iv_ruleE6Rule= ruleE6Rule EOF ;
    public final EObject entryRuleE6Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE6Rule = null;


        try {
            // InternalUclid.g:4318:47: (iv_ruleE6Rule= ruleE6Rule EOF )
            // InternalUclid.g:4319:2: iv_ruleE6Rule= ruleE6Rule EOF
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
    // InternalUclid.g:4325:1: ruleE6Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )* ) ;
    public final EObject ruleE6Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4331:2: ( ( ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )* ) )
            // InternalUclid.g:4332:2: ( ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )* )
            {
            // InternalUclid.g:4332:2: ( ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )* )
            // InternalUclid.g:4333:3: ( (lv_e_0_0= ruleE7Rule ) ) (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )*
            {
            // InternalUclid.g:4333:3: ( (lv_e_0_0= ruleE7Rule ) )
            // InternalUclid.g:4334:4: (lv_e_0_0= ruleE7Rule )
            {
            // InternalUclid.g:4334:4: (lv_e_0_0= ruleE7Rule )
            // InternalUclid.g:4335:5: lv_e_0_0= ruleE7Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE6RuleAccess().getEE7RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_52);
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

            // InternalUclid.g:4352:3: (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==71) ) {
                    int LA62_2 = input.LA(2);

                    if ( (synpred88_InternalUclid()) ) {
                        alt62=1;
                    }


                }


                switch (alt62) {
            	case 1 :
            	    // InternalUclid.g:4353:4: otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) )
            	    {
            	    otherlv_1=(Token)match(input,71,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE6RuleAccess().getPlusSignPlusSignKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:4357:4: ( (lv_e_2_0= ruleE6Rule ) )
            	    // InternalUclid.g:4358:5: (lv_e_2_0= ruleE6Rule )
            	    {
            	    // InternalUclid.g:4358:5: (lv_e_2_0= ruleE6Rule )
            	    // InternalUclid.g:4359:6: lv_e_2_0= ruleE6Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE6RuleAccess().getEE6RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
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
    // $ANTLR end "ruleE6Rule"


    // $ANTLR start "entryRuleE7Rule"
    // InternalUclid.g:4381:1: entryRuleE7Rule returns [EObject current=null] : iv_ruleE7Rule= ruleE7Rule EOF ;
    public final EObject entryRuleE7Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE7Rule = null;


        try {
            // InternalUclid.g:4381:47: (iv_ruleE7Rule= ruleE7Rule EOF )
            // InternalUclid.g:4382:2: iv_ruleE7Rule= ruleE7Rule EOF
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
    // InternalUclid.g:4388:1: ruleE7Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )* ) ;
    public final EObject ruleE7Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4394:2: ( ( ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )* ) )
            // InternalUclid.g:4395:2: ( ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )* )
            {
            // InternalUclid.g:4395:2: ( ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )* )
            // InternalUclid.g:4396:3: ( (lv_e_0_0= ruleE8Rule ) ) (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )*
            {
            // InternalUclid.g:4396:3: ( (lv_e_0_0= ruleE8Rule ) )
            // InternalUclid.g:4397:4: (lv_e_0_0= ruleE8Rule )
            {
            // InternalUclid.g:4397:4: (lv_e_0_0= ruleE8Rule )
            // InternalUclid.g:4398:5: lv_e_0_0= ruleE8Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE7RuleAccess().getEE8RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_53);
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

            // InternalUclid.g:4415:3: (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==72) ) {
                    int LA63_2 = input.LA(2);

                    if ( (synpred89_InternalUclid()) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // InternalUclid.g:4416:4: otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) )
            	    {
            	    otherlv_1=(Token)match(input,72,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE7RuleAccess().getPlusSignKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:4420:4: ( (lv_e_2_0= ruleE7Rule ) )
            	    // InternalUclid.g:4421:5: (lv_e_2_0= ruleE7Rule )
            	    {
            	    // InternalUclid.g:4421:5: (lv_e_2_0= ruleE7Rule )
            	    // InternalUclid.g:4422:6: lv_e_2_0= ruleE7Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE7RuleAccess().getEE7RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
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
            	    break loop63;
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
    // InternalUclid.g:4444:1: entryRuleE8Rule returns [EObject current=null] : iv_ruleE8Rule= ruleE8Rule EOF ;
    public final EObject entryRuleE8Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE8Rule = null;


        try {
            // InternalUclid.g:4444:47: (iv_ruleE8Rule= ruleE8Rule EOF )
            // InternalUclid.g:4445:2: iv_ruleE8Rule= ruleE8Rule EOF
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
    // InternalUclid.g:4451:1: ruleE8Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )* ) ;
    public final EObject ruleE8Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4457:2: ( ( ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )* ) )
            // InternalUclid.g:4458:2: ( ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )* )
            {
            // InternalUclid.g:4458:2: ( ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )* )
            // InternalUclid.g:4459:3: ( (lv_e_0_0= ruleE9Rule ) ) (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )*
            {
            // InternalUclid.g:4459:3: ( (lv_e_0_0= ruleE9Rule ) )
            // InternalUclid.g:4460:4: (lv_e_0_0= ruleE9Rule )
            {
            // InternalUclid.g:4460:4: (lv_e_0_0= ruleE9Rule )
            // InternalUclid.g:4461:5: lv_e_0_0= ruleE9Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE8RuleAccess().getEE9RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_54);
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

            // InternalUclid.g:4478:3: (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==73) ) {
                    int LA64_2 = input.LA(2);

                    if ( (synpred90_InternalUclid()) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // InternalUclid.g:4479:4: otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) )
            	    {
            	    otherlv_1=(Token)match(input,73,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE8RuleAccess().getHyphenMinusKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:4483:4: ( (lv_e_2_0= ruleE9Rule ) )
            	    // InternalUclid.g:4484:5: (lv_e_2_0= ruleE9Rule )
            	    {
            	    // InternalUclid.g:4484:5: (lv_e_2_0= ruleE9Rule )
            	    // InternalUclid.g:4485:6: lv_e_2_0= ruleE9Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE8RuleAccess().getEE9RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
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
    // $ANTLR end "ruleE8Rule"


    // $ANTLR start "entryRuleE9Rule"
    // InternalUclid.g:4507:1: entryRuleE9Rule returns [EObject current=null] : iv_ruleE9Rule= ruleE9Rule EOF ;
    public final EObject entryRuleE9Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE9Rule = null;


        try {
            // InternalUclid.g:4507:47: (iv_ruleE9Rule= ruleE9Rule EOF )
            // InternalUclid.g:4508:2: iv_ruleE9Rule= ruleE9Rule EOF
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
    // InternalUclid.g:4514:1: ruleE9Rule returns [EObject current=null] : ( ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )* ) ;
    public final EObject ruleE9Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4520:2: ( ( ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )* ) )
            // InternalUclid.g:4521:2: ( ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )* )
            {
            // InternalUclid.g:4521:2: ( ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )* )
            // InternalUclid.g:4522:3: ( (lv_e_0_0= ruleE10Rule ) ) (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )*
            {
            // InternalUclid.g:4522:3: ( (lv_e_0_0= ruleE10Rule ) )
            // InternalUclid.g:4523:4: (lv_e_0_0= ruleE10Rule )
            {
            // InternalUclid.g:4523:4: (lv_e_0_0= ruleE10Rule )
            // InternalUclid.g:4524:5: lv_e_0_0= ruleE10Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE9RuleAccess().getEE10RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_55);
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

            // InternalUclid.g:4541:3: (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==18) ) {
                    int LA65_2 = input.LA(2);

                    if ( (synpred91_InternalUclid()) ) {
                        alt65=1;
                    }


                }


                switch (alt65) {
            	case 1 :
            	    // InternalUclid.g:4542:4: otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getE9RuleAccess().getAsteriskKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:4546:4: ( (lv_e_2_0= ruleE10Rule ) )
            	    // InternalUclid.g:4547:5: (lv_e_2_0= ruleE10Rule )
            	    {
            	    // InternalUclid.g:4547:5: (lv_e_2_0= ruleE10Rule )
            	    // InternalUclid.g:4548:6: lv_e_2_0= ruleE10Rule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getE9RuleAccess().getEE10RuleParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
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
    // $ANTLR end "ruleE9Rule"


    // $ANTLR start "entryRuleE10Rule"
    // InternalUclid.g:4570:1: entryRuleE10Rule returns [EObject current=null] : iv_ruleE10Rule= ruleE10Rule EOF ;
    public final EObject entryRuleE10Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE10Rule = null;


        try {
            // InternalUclid.g:4570:48: (iv_ruleE10Rule= ruleE10Rule EOF )
            // InternalUclid.g:4571:2: iv_ruleE10Rule= ruleE10Rule EOF
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
    // InternalUclid.g:4577:1: ruleE10Rule returns [EObject current=null] : ( ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) ) | ( (lv_e_2_0= ruleE11Rule ) ) ) ;
    public final EObject ruleE10Rule() throws RecognitionException {
        EObject current = null;

        Token lv_op_0_1=null;
        Token lv_op_0_2=null;
        Token lv_op_0_3=null;
        EObject lv_e_1_0 = null;

        EObject lv_e_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4583:2: ( ( ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) ) | ( (lv_e_2_0= ruleE11Rule ) ) ) )
            // InternalUclid.g:4584:2: ( ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) ) | ( (lv_e_2_0= ruleE11Rule ) ) )
            {
            // InternalUclid.g:4584:2: ( ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) ) | ( (lv_e_2_0= ruleE11Rule ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=73 && LA67_0<=75)) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=RULE_ID && LA67_0<=RULE_INT)||LA67_0==RULE_STRING||LA67_0==15||LA67_0==29||LA67_0==51||(LA67_0>=78 && LA67_0<=79)) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalUclid.g:4585:3: ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) )
                    {
                    // InternalUclid.g:4585:3: ( ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) ) )
                    // InternalUclid.g:4586:4: ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) ) ( (lv_e_1_0= ruleE11Rule ) )
                    {
                    // InternalUclid.g:4586:4: ( ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) ) )
                    // InternalUclid.g:4587:5: ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) )
                    {
                    // InternalUclid.g:4587:5: ( (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' ) )
                    // InternalUclid.g:4588:6: (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' )
                    {
                    // InternalUclid.g:4588:6: (lv_op_0_1= '-' | lv_op_0_2= '!' | lv_op_0_3= '~' )
                    int alt66=3;
                    switch ( input.LA(1) ) {
                    case 73:
                        {
                        alt66=1;
                        }
                        break;
                    case 74:
                        {
                        alt66=2;
                        }
                        break;
                    case 75:
                        {
                        alt66=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }

                    switch (alt66) {
                        case 1 :
                            // InternalUclid.g:4589:7: lv_op_0_1= '-'
                            {
                            lv_op_0_1=(Token)match(input,73,FOLLOW_20); if (state.failed) return current;
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
                            // InternalUclid.g:4600:7: lv_op_0_2= '!'
                            {
                            lv_op_0_2=(Token)match(input,74,FOLLOW_20); if (state.failed) return current;
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
                            // InternalUclid.g:4611:7: lv_op_0_3= '~'
                            {
                            lv_op_0_3=(Token)match(input,75,FOLLOW_20); if (state.failed) return current;
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

                    // InternalUclid.g:4624:4: ( (lv_e_1_0= ruleE11Rule ) )
                    // InternalUclid.g:4625:5: (lv_e_1_0= ruleE11Rule )
                    {
                    // InternalUclid.g:4625:5: (lv_e_1_0= ruleE11Rule )
                    // InternalUclid.g:4626:6: lv_e_1_0= ruleE11Rule
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
                    // InternalUclid.g:4645:3: ( (lv_e_2_0= ruleE11Rule ) )
                    {
                    // InternalUclid.g:4645:3: ( (lv_e_2_0= ruleE11Rule ) )
                    // InternalUclid.g:4646:4: (lv_e_2_0= ruleE11Rule )
                    {
                    // InternalUclid.g:4646:4: (lv_e_2_0= ruleE11Rule )
                    // InternalUclid.g:4647:5: lv_e_2_0= ruleE11Rule
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
    // InternalUclid.g:4668:1: entryRuleE11Rule returns [EObject current=null] : iv_ruleE11Rule= ruleE11Rule EOF ;
    public final EObject entryRuleE11Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE11Rule = null;


        try {
            // InternalUclid.g:4668:48: (iv_ruleE11Rule= ruleE11Rule EOF )
            // InternalUclid.g:4669:2: iv_ruleE11Rule= ruleE11Rule EOF
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
    // InternalUclid.g:4675:1: ruleE11Rule returns [EObject current=null] : ( (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' ) | this_E12Rule_8= ruleE12Rule ) ;
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

        EObject this_E12Rule_8 = null;



        	enterRule();

        try {
            // InternalUclid.g:4681:2: ( ( (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' ) | this_E12Rule_8= ruleE12Rule ) )
            // InternalUclid.g:4682:2: ( (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' ) | this_E12Rule_8= ruleE12Rule )
            {
            // InternalUclid.g:4682:2: ( (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' ) | this_E12Rule_8= ruleE12Rule )
            int alt69=2;
            alt69 = dfa69.predict(input);
            switch (alt69) {
                case 1 :
                    // InternalUclid.g:4683:3: (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )
                    {
                    // InternalUclid.g:4683:3: (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )
                    // InternalUclid.g:4684:4: this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']'
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getE11RuleAccess().getE12RuleParserRuleCall_0_0());
                      			
                    }
                    pushFollow(FOLLOW_56);
                    this_E12Rule_0=ruleE12Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_E12Rule_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_1=(Token)match(input,48,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getE11RuleAccess().getLeftSquareBracketKeyword_0_1());
                      			
                    }
                    // InternalUclid.g:4699:4: ( (lv_l_2_0= ruleExprListRule ) )
                    // InternalUclid.g:4700:5: (lv_l_2_0= ruleExprListRule )
                    {
                    // InternalUclid.g:4700:5: (lv_l_2_0= ruleExprListRule )
                    // InternalUclid.g:4701:6: lv_l_2_0= ruleExprListRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getE11RuleAccess().getLExprListRuleParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_57);
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

                    // InternalUclid.g:4718:4: ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )?
                    int alt68=3;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==76) ) {
                        alt68=1;
                    }
                    else if ( (LA68_0==22) ) {
                        alt68=2;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalUclid.g:4719:5: (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) )
                            {
                            // InternalUclid.g:4719:5: (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) )
                            // InternalUclid.g:4720:6: otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) )
                            {
                            otherlv_3=(Token)match(input,76,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_3, grammarAccess.getE11RuleAccess().getHyphenMinusGreaterThanSignKeyword_0_3_0_0());
                              					
                            }
                            // InternalUclid.g:4724:6: ( (lv_e_4_0= ruleExprRule ) )
                            // InternalUclid.g:4725:7: (lv_e_4_0= ruleExprRule )
                            {
                            // InternalUclid.g:4725:7: (lv_e_4_0= ruleExprRule )
                            // InternalUclid.g:4726:8: lv_e_4_0= ruleExprRule
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getE11RuleAccess().getEExprRuleParserRuleCall_0_3_0_1_0());
                              							
                            }
                            pushFollow(FOLLOW_41);
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
                            // InternalUclid.g:4745:5: (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) )
                            {
                            // InternalUclid.g:4745:5: (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) )
                            // InternalUclid.g:4746:6: otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) )
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getE11RuleAccess().getColonKeyword_0_3_1_0());
                              					
                            }
                            // InternalUclid.g:4750:6: ( (lv_e_6_0= ruleExprRule ) )
                            // InternalUclid.g:4751:7: (lv_e_6_0= ruleExprRule )
                            {
                            // InternalUclid.g:4751:7: (lv_e_6_0= ruleExprRule )
                            // InternalUclid.g:4752:8: lv_e_6_0= ruleExprRule
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getE11RuleAccess().getEExprRuleParserRuleCall_0_3_1_1_0());
                              							
                            }
                            pushFollow(FOLLOW_41);
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

                    otherlv_7=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getE11RuleAccess().getRightSquareBracketKeyword_0_4());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalUclid.g:4777:3: this_E12Rule_8= ruleE12Rule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE11RuleAccess().getE12RuleParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_E12Rule_8=ruleE12Rule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_E12Rule_8;
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
    // $ANTLR end "ruleE11Rule"


    // $ANTLR start "entryRuleE12Rule"
    // InternalUclid.g:4792:1: entryRuleE12Rule returns [EObject current=null] : iv_ruleE12Rule= ruleE12Rule EOF ;
    public final EObject entryRuleE12Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE12Rule = null;


        try {
            // InternalUclid.g:4792:48: (iv_ruleE12Rule= ruleE12Rule EOF )
            // InternalUclid.g:4793:2: iv_ruleE12Rule= ruleE12Rule EOF
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
    // InternalUclid.g:4799:1: ruleE12Rule returns [EObject current=null] : ( ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )? ) ;
    public final EObject ruleE12Rule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_j_0_0 = null;

        EObject lv_v_2_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:4805:2: ( ( ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )? ) )
            // InternalUclid.g:4806:2: ( ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )? )
            {
            // InternalUclid.g:4806:2: ( ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )? )
            // InternalUclid.g:4807:3: ( (lv_j_0_0= ruleE13Rule ) ) (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )?
            {
            // InternalUclid.g:4807:3: ( (lv_j_0_0= ruleE13Rule ) )
            // InternalUclid.g:4808:4: (lv_j_0_0= ruleE13Rule )
            {
            // InternalUclid.g:4808:4: (lv_j_0_0= ruleE13Rule )
            // InternalUclid.g:4809:5: lv_j_0_0= ruleE13Rule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getE12RuleAccess().getJE13RuleParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_58);
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

            // InternalUclid.g:4826:3: (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==29) ) {
                int LA71_1 = input.LA(2);

                if ( (synpred99_InternalUclid()) ) {
                    alt71=1;
                }
            }
            switch (alt71) {
                case 1 :
                    // InternalUclid.g:4827:4: otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getE12RuleAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalUclid.g:4831:4: ( (lv_v_2_0= ruleExprListRule ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( ((LA70_0>=RULE_ID && LA70_0<=RULE_INT)||LA70_0==RULE_STRING||LA70_0==15||LA70_0==29||LA70_0==51||(LA70_0>=73 && LA70_0<=75)||(LA70_0>=78 && LA70_0<=79)) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalUclid.g:4832:5: (lv_v_2_0= ruleExprListRule )
                            {
                            // InternalUclid.g:4832:5: (lv_v_2_0= ruleExprListRule )
                            // InternalUclid.g:4833:6: lv_v_2_0= ruleExprListRule
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

                    otherlv_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:4859:1: entryRuleRHSVarRef returns [EObject current=null] : iv_ruleRHSVarRef= ruleRHSVarRef EOF ;
    public final EObject entryRuleRHSVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRHSVarRef = null;


        try {
            // InternalUclid.g:4859:50: (iv_ruleRHSVarRef= ruleRHSVarRef EOF )
            // InternalUclid.g:4860:2: iv_ruleRHSVarRef= ruleRHSVarRef EOF
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
    // InternalUclid.g:4866:1: ruleRHSVarRef returns [EObject current=null] : ( () ( ( ( ruleFQN ) ) ( (lv_prime_2_0= '\\'' ) )? ) ) ;
    public final EObject ruleRHSVarRef() throws RecognitionException {
        EObject current = null;

        Token lv_prime_2_0=null;


        	enterRule();

        try {
            // InternalUclid.g:4872:2: ( ( () ( ( ( ruleFQN ) ) ( (lv_prime_2_0= '\\'' ) )? ) ) )
            // InternalUclid.g:4873:2: ( () ( ( ( ruleFQN ) ) ( (lv_prime_2_0= '\\'' ) )? ) )
            {
            // InternalUclid.g:4873:2: ( () ( ( ( ruleFQN ) ) ( (lv_prime_2_0= '\\'' ) )? ) )
            // InternalUclid.g:4874:3: () ( ( ( ruleFQN ) ) ( (lv_prime_2_0= '\\'' ) )? )
            {
            // InternalUclid.g:4874:3: ()
            // InternalUclid.g:4875:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRHSVarRefAccess().getVarRefAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:4884:3: ( ( ( ruleFQN ) ) ( (lv_prime_2_0= '\\'' ) )? )
            // InternalUclid.g:4885:4: ( ( ruleFQN ) ) ( (lv_prime_2_0= '\\'' ) )?
            {
            // InternalUclid.g:4885:4: ( ( ruleFQN ) )
            // InternalUclid.g:4886:5: ( ruleFQN )
            {
            // InternalUclid.g:4886:5: ( ruleFQN )
            // InternalUclid.g:4887:6: ruleFQN
            {
            if ( state.backtracking==0 ) {

              						/* */
              					
            }
            if ( state.backtracking==0 ) {

              						if (current==null) {
              							current = createModelElement(grammarAccess.getRHSVarRefRule());
              						}
              					
            }
            if ( state.backtracking==0 ) {

              						newCompositeNode(grammarAccess.getRHSVarRefAccess().getVarVarDeclCrossReference_1_0_0());
              					
            }
            pushFollow(FOLLOW_32);
            ruleFQN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              						afterParserOrEnumRuleCall();
              					
            }

            }


            }

            // InternalUclid.g:4904:4: ( (lv_prime_2_0= '\\'' ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==50) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalUclid.g:4905:5: (lv_prime_2_0= '\\'' )
                    {
                    // InternalUclid.g:4905:5: (lv_prime_2_0= '\\'' )
                    // InternalUclid.g:4906:6: lv_prime_2_0= '\\''
                    {
                    lv_prime_2_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_prime_2_0, grammarAccess.getRHSVarRefAccess().getPrimeApostropheKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getRHSVarRefRule());
                      						}
                      						setWithLastConsumed(current, "prime", lv_prime_2_0, "\'");
                      					
                    }

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
    // $ANTLR end "ruleRHSVarRef"


    // $ANTLR start "entryRuleEnumRef"
    // InternalUclid.g:4923:1: entryRuleEnumRef returns [EObject current=null] : iv_ruleEnumRef= ruleEnumRef EOF ;
    public final EObject entryRuleEnumRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumRef = null;


        try {
            // InternalUclid.g:4923:48: (iv_ruleEnumRef= ruleEnumRef EOF )
            // InternalUclid.g:4924:2: iv_ruleEnumRef= ruleEnumRef EOF
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
    // InternalUclid.g:4930:1: ruleEnumRef returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleEnumRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalUclid.g:4936:2: ( ( ( ruleFQN ) ) )
            // InternalUclid.g:4937:2: ( ( ruleFQN ) )
            {
            // InternalUclid.g:4937:2: ( ( ruleFQN ) )
            // InternalUclid.g:4938:3: ( ruleFQN )
            {
            // InternalUclid.g:4938:3: ( ruleFQN )
            // InternalUclid.g:4939:4: ruleFQN
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


    // $ANTLR start "entryRuleE13Rule"
    // InternalUclid.g:4959:1: entryRuleE13Rule returns [EObject current=null] : iv_ruleE13Rule= ruleE13Rule EOF ;
    public final EObject entryRuleE13Rule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleE13Rule = null;


        try {
            // InternalUclid.g:4959:48: (iv_ruleE13Rule= ruleE13Rule EOF )
            // InternalUclid.g:4960:2: iv_ruleE13Rule= ruleE13Rule EOF
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
    // InternalUclid.g:4966:1: ruleE13Rule returns [EObject current=null] : (this_ConstRule_0= ruleConstRule | this_RHSVarRef_1= ruleRHSVarRef | this_EnumRef_2= ruleEnumRef | this_TupleExpr_3= ruleTupleExpr | this_IfPrimaryExpr_4= ruleIfPrimaryExpr | this_ParenthesisExpr_5= ruleParenthesisExpr ) ;
    public final EObject ruleE13Rule() throws RecognitionException {
        EObject current = null;

        EObject this_ConstRule_0 = null;

        EObject this_RHSVarRef_1 = null;

        EObject this_EnumRef_2 = null;

        EObject this_TupleExpr_3 = null;

        EObject this_IfPrimaryExpr_4 = null;

        EObject this_ParenthesisExpr_5 = null;



        	enterRule();

        try {
            // InternalUclid.g:4972:2: ( (this_ConstRule_0= ruleConstRule | this_RHSVarRef_1= ruleRHSVarRef | this_EnumRef_2= ruleEnumRef | this_TupleExpr_3= ruleTupleExpr | this_IfPrimaryExpr_4= ruleIfPrimaryExpr | this_ParenthesisExpr_5= ruleParenthesisExpr ) )
            // InternalUclid.g:4973:2: (this_ConstRule_0= ruleConstRule | this_RHSVarRef_1= ruleRHSVarRef | this_EnumRef_2= ruleEnumRef | this_TupleExpr_3= ruleTupleExpr | this_IfPrimaryExpr_4= ruleIfPrimaryExpr | this_ParenthesisExpr_5= ruleParenthesisExpr )
            {
            // InternalUclid.g:4973:2: (this_ConstRule_0= ruleConstRule | this_RHSVarRef_1= ruleRHSVarRef | this_EnumRef_2= ruleEnumRef | this_TupleExpr_3= ruleTupleExpr | this_IfPrimaryExpr_4= ruleIfPrimaryExpr | this_ParenthesisExpr_5= ruleParenthesisExpr )
            int alt73=6;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_STRING:
            case 78:
            case 79:
                {
                alt73=1;
                }
                break;
            case RULE_ID:
                {
                int LA73_2 = input.LA(2);

                if ( (synpred102_InternalUclid()) ) {
                    alt73=2;
                }
                else if ( (synpred103_InternalUclid()) ) {
                    alt73=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt73=4;
                }
                break;
            case 51:
                {
                alt73=5;
                }
                break;
            case 29:
                {
                alt73=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalUclid.g:4974:3: this_ConstRule_0= ruleConstRule
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
                    // InternalUclid.g:4986:3: this_RHSVarRef_1= ruleRHSVarRef
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
                    // InternalUclid.g:4998:3: this_EnumRef_2= ruleEnumRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getEnumRefParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EnumRef_2=ruleEnumRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EnumRef_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUclid.g:5010:3: this_TupleExpr_3= ruleTupleExpr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getTupleExprParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_TupleExpr_3=ruleTupleExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TupleExpr_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUclid.g:5022:3: this_IfPrimaryExpr_4= ruleIfPrimaryExpr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getIfPrimaryExprParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IfPrimaryExpr_4=ruleIfPrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IfPrimaryExpr_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUclid.g:5034:3: this_ParenthesisExpr_5= ruleParenthesisExpr
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getE13RuleAccess().getParenthesisExprParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParenthesisExpr_5=ruleParenthesisExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParenthesisExpr_5;
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


    // $ANTLR start "entryRuleTupleExpr"
    // InternalUclid.g:5049:1: entryRuleTupleExpr returns [EObject current=null] : iv_ruleTupleExpr= ruleTupleExpr EOF ;
    public final EObject entryRuleTupleExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleExpr = null;


        try {
            // InternalUclid.g:5049:50: (iv_ruleTupleExpr= ruleTupleExpr EOF )
            // InternalUclid.g:5050:2: iv_ruleTupleExpr= ruleTupleExpr EOF
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
    // InternalUclid.g:5056:1: ruleTupleExpr returns [EObject current=null] : (otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTupleExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_e_1_0 = null;

        EObject lv_e_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5062:2: ( (otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}' ) )
            // InternalUclid.g:5063:2: (otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}' )
            {
            // InternalUclid.g:5063:2: (otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}' )
            // InternalUclid.g:5064:3: otherlv_0= '{' ( (lv_e_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getTupleExprAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalUclid.g:5068:3: ( (lv_e_1_0= ruleExprRule ) )
            // InternalUclid.g:5069:4: (lv_e_1_0= ruleExprRule )
            {
            // InternalUclid.g:5069:4: (lv_e_1_0= ruleExprRule )
            // InternalUclid.g:5070:5: lv_e_1_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleExprAccess().getEExprRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_59);
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

            // InternalUclid.g:5087:3: (otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==25) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalUclid.g:5088:4: otherlv_2= ',' ( (lv_e_3_0= ruleExprRule ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getTupleExprAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUclid.g:5092:4: ( (lv_e_3_0= ruleExprRule ) )
            	    // InternalUclid.g:5093:5: (lv_e_3_0= ruleExprRule )
            	    {
            	    // InternalUclid.g:5093:5: (lv_e_3_0= ruleExprRule )
            	    // InternalUclid.g:5094:6: lv_e_3_0= ruleExprRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleExprAccess().getEExprRuleParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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
            	    break loop74;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:5120:1: entryRuleIfPrimaryExpr returns [EObject current=null] : iv_ruleIfPrimaryExpr= ruleIfPrimaryExpr EOF ;
    public final EObject entryRuleIfPrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfPrimaryExpr = null;


        try {
            // InternalUclid.g:5120:54: (iv_ruleIfPrimaryExpr= ruleIfPrimaryExpr EOF )
            // InternalUclid.g:5121:2: iv_ruleIfPrimaryExpr= ruleIfPrimaryExpr EOF
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
    // InternalUclid.g:5127:1: ruleIfPrimaryExpr returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) ) ) ;
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
            // InternalUclid.g:5133:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) ) ) )
            // InternalUclid.g:5134:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) ) )
            {
            // InternalUclid.g:5134:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) ) )
            // InternalUclid.g:5135:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_c_2_0= ruleExprRule ) ) otherlv_3= ')' otherlv_4= 'then' ( (lv_e_5_0= ruleExprRule ) ) otherlv_6= 'else' ( (lv_e_7_0= ruleExprRule ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getIfPrimaryExprAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIfPrimaryExprAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalUclid.g:5143:3: ( (lv_c_2_0= ruleExprRule ) )
            // InternalUclid.g:5144:4: (lv_c_2_0= ruleExprRule )
            {
            // InternalUclid.g:5144:4: (lv_c_2_0= ruleExprRule )
            // InternalUclid.g:5145:5: lv_c_2_0= ruleExprRule
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

            otherlv_3=(Token)match(input,30,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIfPrimaryExprAccess().getRightParenthesisKeyword_3());
              		
            }
            otherlv_4=(Token)match(input,77,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getIfPrimaryExprAccess().getThenKeyword_4());
              		
            }
            // InternalUclid.g:5170:3: ( (lv_e_5_0= ruleExprRule ) )
            // InternalUclid.g:5171:4: (lv_e_5_0= ruleExprRule )
            {
            // InternalUclid.g:5171:4: (lv_e_5_0= ruleExprRule )
            // InternalUclid.g:5172:5: lv_e_5_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIfPrimaryExprAccess().getEExprRuleParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_61);
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

            otherlv_6=(Token)match(input,52,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getIfPrimaryExprAccess().getElseKeyword_6());
              		
            }
            // InternalUclid.g:5193:3: ( (lv_e_7_0= ruleExprRule ) )
            // InternalUclid.g:5194:4: (lv_e_7_0= ruleExprRule )
            {
            // InternalUclid.g:5194:4: (lv_e_7_0= ruleExprRule )
            // InternalUclid.g:5195:5: lv_e_7_0= ruleExprRule
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
    // InternalUclid.g:5216:1: entryRuleParenthesisExpr returns [EObject current=null] : iv_ruleParenthesisExpr= ruleParenthesisExpr EOF ;
    public final EObject entryRuleParenthesisExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesisExpr = null;


        try {
            // InternalUclid.g:5216:56: (iv_ruleParenthesisExpr= ruleParenthesisExpr EOF )
            // InternalUclid.g:5217:2: iv_ruleParenthesisExpr= ruleParenthesisExpr EOF
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
    // InternalUclid.g:5223:1: ruleParenthesisExpr returns [EObject current=null] : (otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')' ) ;
    public final EObject ruleParenthesisExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_ExprRule_1 = null;



        	enterRule();

        try {
            // InternalUclid.g:5229:2: ( (otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')' ) )
            // InternalUclid.g:5230:2: (otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')' )
            {
            // InternalUclid.g:5230:2: (otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')' )
            // InternalUclid.g:5231:3: otherlv_0= '(' this_ExprRule_1= ruleExprRule otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
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
            otherlv_2=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:5254:1: entryRuleConstRule returns [EObject current=null] : iv_ruleConstRule= ruleConstRule EOF ;
    public final EObject entryRuleConstRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstRule = null;


        try {
            // InternalUclid.g:5254:50: (iv_ruleConstRule= ruleConstRule EOF )
            // InternalUclid.g:5255:2: iv_ruleConstRule= ruleConstRule EOF
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
    // InternalUclid.g:5261:1: ruleConstRule returns [EObject current=null] : ( ( (lv_v_0_0= 'false' ) ) | ( (lv_v_1_0= 'true' ) ) | ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? ) | ( (lv_v_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleConstRule() throws RecognitionException {
        EObject current = null;

        Token lv_v_0_0=null;
        Token lv_v_1_0=null;
        Token lv_d_2_0=null;
        Token lv_w_3_0=null;
        Token lv_v_4_0=null;


        	enterRule();

        try {
            // InternalUclid.g:5267:2: ( ( ( (lv_v_0_0= 'false' ) ) | ( (lv_v_1_0= 'true' ) ) | ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? ) | ( (lv_v_4_0= RULE_STRING ) ) ) )
            // InternalUclid.g:5268:2: ( ( (lv_v_0_0= 'false' ) ) | ( (lv_v_1_0= 'true' ) ) | ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? ) | ( (lv_v_4_0= RULE_STRING ) ) )
            {
            // InternalUclid.g:5268:2: ( ( (lv_v_0_0= 'false' ) ) | ( (lv_v_1_0= 'true' ) ) | ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? ) | ( (lv_v_4_0= RULE_STRING ) ) )
            int alt76=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt76=1;
                }
                break;
            case 79:
                {
                alt76=2;
                }
                break;
            case RULE_INT:
                {
                alt76=3;
                }
                break;
            case RULE_STRING:
                {
                alt76=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalUclid.g:5269:3: ( (lv_v_0_0= 'false' ) )
                    {
                    // InternalUclid.g:5269:3: ( (lv_v_0_0= 'false' ) )
                    // InternalUclid.g:5270:4: (lv_v_0_0= 'false' )
                    {
                    // InternalUclid.g:5270:4: (lv_v_0_0= 'false' )
                    // InternalUclid.g:5271:5: lv_v_0_0= 'false'
                    {
                    lv_v_0_0=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUclid.g:5284:3: ( (lv_v_1_0= 'true' ) )
                    {
                    // InternalUclid.g:5284:3: ( (lv_v_1_0= 'true' ) )
                    // InternalUclid.g:5285:4: (lv_v_1_0= 'true' )
                    {
                    // InternalUclid.g:5285:4: (lv_v_1_0= 'true' )
                    // InternalUclid.g:5286:5: lv_v_1_0= 'true'
                    {
                    lv_v_1_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUclid.g:5299:3: ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? )
                    {
                    // InternalUclid.g:5299:3: ( ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )? )
                    // InternalUclid.g:5300:4: ( (lv_d_2_0= RULE_INT ) ) ( (lv_w_3_0= RULE_BV ) )?
                    {
                    // InternalUclid.g:5300:4: ( (lv_d_2_0= RULE_INT ) )
                    // InternalUclid.g:5301:5: (lv_d_2_0= RULE_INT )
                    {
                    // InternalUclid.g:5301:5: (lv_d_2_0= RULE_INT )
                    // InternalUclid.g:5302:6: lv_d_2_0= RULE_INT
                    {
                    lv_d_2_0=(Token)match(input,RULE_INT,FOLLOW_62); if (state.failed) return current;
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

                    // InternalUclid.g:5318:4: ( (lv_w_3_0= RULE_BV ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_BV) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalUclid.g:5319:5: (lv_w_3_0= RULE_BV )
                            {
                            // InternalUclid.g:5319:5: (lv_w_3_0= RULE_BV )
                            // InternalUclid.g:5320:6: lv_w_3_0= RULE_BV
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
                    // InternalUclid.g:5338:3: ( (lv_v_4_0= RULE_STRING ) )
                    {
                    // InternalUclid.g:5338:3: ( (lv_v_4_0= RULE_STRING ) )
                    // InternalUclid.g:5339:4: (lv_v_4_0= RULE_STRING )
                    {
                    // InternalUclid.g:5339:4: (lv_v_4_0= RULE_STRING )
                    // InternalUclid.g:5340:5: lv_v_4_0= RULE_STRING
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
    // InternalUclid.g:5360:1: entryRuleTypeRule returns [EObject current=null] : iv_ruleTypeRule= ruleTypeRule EOF ;
    public final EObject entryRuleTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRule = null;


        try {
            // InternalUclid.g:5360:49: (iv_ruleTypeRule= ruleTypeRule EOF )
            // InternalUclid.g:5361:2: iv_ruleTypeRule= ruleTypeRule EOF
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
    // InternalUclid.g:5367:1: ruleTypeRule returns [EObject current=null] : (this_PrimitiveTypeRule_0= rulePrimitiveTypeRule | this_EnumTypeRule_1= ruleEnumTypeRule | this_TupleTypeRule_2= ruleTupleTypeRule | this_RecordTypeRule_3= ruleRecordTypeRule | this_ArrayTypeRule_4= ruleArrayTypeRule | this_SynonymTypeRule_5= ruleSynonymTypeRule ) ;
    public final EObject ruleTypeRule() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveTypeRule_0 = null;

        EObject this_EnumTypeRule_1 = null;

        EObject this_TupleTypeRule_2 = null;

        EObject this_RecordTypeRule_3 = null;

        EObject this_ArrayTypeRule_4 = null;

        EObject this_SynonymTypeRule_5 = null;



        	enterRule();

        try {
            // InternalUclid.g:5373:2: ( (this_PrimitiveTypeRule_0= rulePrimitiveTypeRule | this_EnumTypeRule_1= ruleEnumTypeRule | this_TupleTypeRule_2= ruleTupleTypeRule | this_RecordTypeRule_3= ruleRecordTypeRule | this_ArrayTypeRule_4= ruleArrayTypeRule | this_SynonymTypeRule_5= ruleSynonymTypeRule ) )
            // InternalUclid.g:5374:2: (this_PrimitiveTypeRule_0= rulePrimitiveTypeRule | this_EnumTypeRule_1= ruleEnumTypeRule | this_TupleTypeRule_2= ruleTupleTypeRule | this_RecordTypeRule_3= ruleRecordTypeRule | this_ArrayTypeRule_4= ruleArrayTypeRule | this_SynonymTypeRule_5= ruleSynonymTypeRule )
            {
            // InternalUclid.g:5374:2: (this_PrimitiveTypeRule_0= rulePrimitiveTypeRule | this_EnumTypeRule_1= ruleEnumTypeRule | this_TupleTypeRule_2= ruleTupleTypeRule | this_RecordTypeRule_3= ruleRecordTypeRule | this_ArrayTypeRule_4= ruleArrayTypeRule | this_SynonymTypeRule_5= ruleSynonymTypeRule )
            int alt77=6;
            switch ( input.LA(1) ) {
            case RULE_BV:
            case 80:
            case 81:
                {
                alt77=1;
                }
                break;
            case 82:
                {
                alt77=2;
                }
                break;
            case 15:
                {
                alt77=3;
                }
                break;
            case 83:
                {
                alt77=4;
                }
                break;
            case 48:
                {
                alt77=5;
                }
                break;
            case RULE_ID:
                {
                alt77=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalUclid.g:5375:3: this_PrimitiveTypeRule_0= rulePrimitiveTypeRule
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
                    // InternalUclid.g:5387:3: this_EnumTypeRule_1= ruleEnumTypeRule
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
                    // InternalUclid.g:5399:3: this_TupleTypeRule_2= ruleTupleTypeRule
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
                    // InternalUclid.g:5411:3: this_RecordTypeRule_3= ruleRecordTypeRule
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
                    // InternalUclid.g:5423:3: this_ArrayTypeRule_4= ruleArrayTypeRule
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
                    // InternalUclid.g:5435:3: this_SynonymTypeRule_5= ruleSynonymTypeRule
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeRuleAccess().getSynonymTypeRuleParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SynonymTypeRule_5=ruleSynonymTypeRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SynonymTypeRule_5;
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
    // InternalUclid.g:5450:1: entryRulePrimitiveTypeRule returns [EObject current=null] : iv_rulePrimitiveTypeRule= rulePrimitiveTypeRule EOF ;
    public final EObject entryRulePrimitiveTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeRule = null;


        try {
            // InternalUclid.g:5450:58: (iv_rulePrimitiveTypeRule= rulePrimitiveTypeRule EOF )
            // InternalUclid.g:5451:2: iv_rulePrimitiveTypeRule= rulePrimitiveTypeRule EOF
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
    // InternalUclid.g:5457:1: rulePrimitiveTypeRule returns [EObject current=null] : ( ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) ) ) ;
    public final EObject rulePrimitiveTypeRule() throws RecognitionException {
        EObject current = null;

        Token lv_t_0_1=null;
        Token lv_t_0_2=null;
        Token lv_t_0_3=null;


        	enterRule();

        try {
            // InternalUclid.g:5463:2: ( ( ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) ) ) )
            // InternalUclid.g:5464:2: ( ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) ) )
            {
            // InternalUclid.g:5464:2: ( ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) ) )
            // InternalUclid.g:5465:3: ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) )
            {
            // InternalUclid.g:5465:3: ( (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV ) )
            // InternalUclid.g:5466:4: (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV )
            {
            // InternalUclid.g:5466:4: (lv_t_0_1= 'boolean' | lv_t_0_2= 'integer' | lv_t_0_3= RULE_BV )
            int alt78=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt78=1;
                }
                break;
            case 81:
                {
                alt78=2;
                }
                break;
            case RULE_BV:
                {
                alt78=3;
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
                    // InternalUclid.g:5467:5: lv_t_0_1= 'boolean'
                    {
                    lv_t_0_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUclid.g:5478:5: lv_t_0_2= 'integer'
                    {
                    lv_t_0_2=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
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
                    // InternalUclid.g:5489:5: lv_t_0_3= RULE_BV
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
    // InternalUclid.g:5509:1: entryRuleEnumTypeRule returns [EObject current=null] : iv_ruleEnumTypeRule= ruleEnumTypeRule EOF ;
    public final EObject entryRuleEnumTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumTypeRule = null;


        try {
            // InternalUclid.g:5509:53: (iv_ruleEnumTypeRule= ruleEnumTypeRule EOF )
            // InternalUclid.g:5510:2: iv_ruleEnumTypeRule= ruleEnumTypeRule EOF
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
    // InternalUclid.g:5516:1: ruleEnumTypeRule returns [EObject current=null] : ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}' ) ;
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
            // InternalUclid.g:5522:2: ( ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}' ) )
            // InternalUclid.g:5523:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}' )
            {
            // InternalUclid.g:5523:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}' )
            // InternalUclid.g:5524:3: () otherlv_1= 'enum' otherlv_2= '{' ( (lv_enums_3_0= ruleEnumValue ) ) (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )* otherlv_6= '}'
            {
            // InternalUclid.g:5524:3: ()
            // InternalUclid.g:5525:4: 
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

            otherlv_1=(Token)match(input,82,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEnumTypeRuleAccess().getEnumKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEnumTypeRuleAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUclid.g:5542:3: ( (lv_enums_3_0= ruleEnumValue ) )
            // InternalUclid.g:5543:4: (lv_enums_3_0= ruleEnumValue )
            {
            // InternalUclid.g:5543:4: (lv_enums_3_0= ruleEnumValue )
            // InternalUclid.g:5544:5: lv_enums_3_0= ruleEnumValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEnumTypeRuleAccess().getEnumsEnumValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_59);
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

            // InternalUclid.g:5561:3: (otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==25) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalUclid.g:5562:4: otherlv_4= ',' ( (lv_enums_5_0= ruleEnumValue ) )
            	    {
            	    otherlv_4=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getEnumTypeRuleAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalUclid.g:5566:4: ( (lv_enums_5_0= ruleEnumValue ) )
            	    // InternalUclid.g:5567:5: (lv_enums_5_0= ruleEnumValue )
            	    {
            	    // InternalUclid.g:5567:5: (lv_enums_5_0= ruleEnumValue )
            	    // InternalUclid.g:5568:6: lv_enums_5_0= ruleEnumValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEnumTypeRuleAccess().getEnumsEnumValueParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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
            	    break loop79;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:5594:1: entryRuleEnumValue returns [EObject current=null] : iv_ruleEnumValue= ruleEnumValue EOF ;
    public final EObject entryRuleEnumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumValue = null;


        try {
            // InternalUclid.g:5594:50: (iv_ruleEnumValue= ruleEnumValue EOF )
            // InternalUclid.g:5595:2: iv_ruleEnumValue= ruleEnumValue EOF
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
    // InternalUclid.g:5601:1: ruleEnumValue returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEnumValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalUclid.g:5607:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalUclid.g:5608:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalUclid.g:5608:2: ( () ( (lv_name_1_0= RULE_ID ) ) )
            // InternalUclid.g:5609:3: () ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalUclid.g:5609:3: ()
            // InternalUclid.g:5610:4: 
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

            // InternalUclid.g:5619:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUclid.g:5620:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUclid.g:5620:4: (lv_name_1_0= RULE_ID )
            // InternalUclid.g:5621:5: lv_name_1_0= RULE_ID
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
    // InternalUclid.g:5641:1: entryRuleTupleTypeRule returns [EObject current=null] : iv_ruleTupleTypeRule= ruleTupleTypeRule EOF ;
    public final EObject entryRuleTupleTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTupleTypeRule = null;


        try {
            // InternalUclid.g:5641:54: (iv_ruleTupleTypeRule= ruleTupleTypeRule EOF )
            // InternalUclid.g:5642:2: iv_ruleTupleTypeRule= ruleTupleTypeRule EOF
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
    // InternalUclid.g:5648:1: ruleTupleTypeRule returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleTupleTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tuple_2_0 = null;

        EObject lv_tuple_4_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5654:2: ( ( () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}' ) )
            // InternalUclid.g:5655:2: ( () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}' )
            {
            // InternalUclid.g:5655:2: ( () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}' )
            // InternalUclid.g:5656:3: () otherlv_1= '{' ( (lv_tuple_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )* otherlv_5= '}'
            {
            // InternalUclid.g:5656:3: ()
            // InternalUclid.g:5657:4: 
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

            otherlv_1=(Token)match(input,15,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTupleTypeRuleAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalUclid.g:5670:3: ( (lv_tuple_2_0= ruleTypeRule ) )
            // InternalUclid.g:5671:4: (lv_tuple_2_0= ruleTypeRule )
            {
            // InternalUclid.g:5671:4: (lv_tuple_2_0= ruleTypeRule )
            // InternalUclid.g:5672:5: lv_tuple_2_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTupleTypeRuleAccess().getTupleTypeRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_59);
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

            // InternalUclid.g:5689:3: (otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) ) )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==25) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalUclid.g:5690:4: otherlv_3= ',' ( (lv_tuple_4_0= ruleTypeRule ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getTupleTypeRuleAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalUclid.g:5694:4: ( (lv_tuple_4_0= ruleTypeRule ) )
            	    // InternalUclid.g:5695:5: (lv_tuple_4_0= ruleTypeRule )
            	    {
            	    // InternalUclid.g:5695:5: (lv_tuple_4_0= ruleTypeRule )
            	    // InternalUclid.g:5696:6: lv_tuple_4_0= ruleTypeRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getTupleTypeRuleAccess().getTupleTypeRuleParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_59);
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
            	    break loop80;
                }
            } while (true);

            otherlv_5=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:5722:1: entryRuleRecordTypeRule returns [EObject current=null] : iv_ruleRecordTypeRule= ruleRecordTypeRule EOF ;
    public final EObject entryRuleRecordTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTypeRule = null;


        try {
            // InternalUclid.g:5722:55: (iv_ruleRecordTypeRule= ruleRecordTypeRule EOF )
            // InternalUclid.g:5723:2: iv_ruleRecordTypeRule= ruleRecordTypeRule EOF
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
    // InternalUclid.g:5729:1: ruleRecordTypeRule returns [EObject current=null] : ( () otherlv_1= 'record' otherlv_2= '{' ( (lv_fields_3_0= ruleIdTypeListRule ) ) otherlv_4= '}' ) ;
    public final EObject ruleRecordTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_fields_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5735:2: ( ( () otherlv_1= 'record' otherlv_2= '{' ( (lv_fields_3_0= ruleIdTypeListRule ) ) otherlv_4= '}' ) )
            // InternalUclid.g:5736:2: ( () otherlv_1= 'record' otherlv_2= '{' ( (lv_fields_3_0= ruleIdTypeListRule ) ) otherlv_4= '}' )
            {
            // InternalUclid.g:5736:2: ( () otherlv_1= 'record' otherlv_2= '{' ( (lv_fields_3_0= ruleIdTypeListRule ) ) otherlv_4= '}' )
            // InternalUclid.g:5737:3: () otherlv_1= 'record' otherlv_2= '{' ( (lv_fields_3_0= ruleIdTypeListRule ) ) otherlv_4= '}'
            {
            // InternalUclid.g:5737:3: ()
            // InternalUclid.g:5738:4: 
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

            otherlv_1=(Token)match(input,83,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRecordTypeRuleAccess().getRecordKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRecordTypeRuleAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUclid.g:5755:3: ( (lv_fields_3_0= ruleIdTypeListRule ) )
            // InternalUclid.g:5756:4: (lv_fields_3_0= ruleIdTypeListRule )
            {
            // InternalUclid.g:5756:4: (lv_fields_3_0= ruleIdTypeListRule )
            // InternalUclid.g:5757:5: lv_fields_3_0= ruleIdTypeListRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRecordTypeRuleAccess().getFieldsIdTypeListRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_fields_3_0=ruleIdTypeListRule();

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
              						"uclid.xtext.Uclid.IdTypeListRule");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRecordTypeRuleAccess().getRightCurlyBracketKeyword_4());
              		
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
    // InternalUclid.g:5782:1: entryRuleArrayTypeRule returns [EObject current=null] : iv_ruleArrayTypeRule= ruleArrayTypeRule EOF ;
    public final EObject entryRuleArrayTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTypeRule = null;


        try {
            // InternalUclid.g:5782:54: (iv_ruleArrayTypeRule= ruleArrayTypeRule EOF )
            // InternalUclid.g:5783:2: iv_ruleArrayTypeRule= ruleArrayTypeRule EOF
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
    // InternalUclid.g:5789:1: ruleArrayTypeRule returns [EObject current=null] : ( () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) ) ) ;
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
            // InternalUclid.g:5795:2: ( ( () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) ) ) )
            // InternalUclid.g:5796:2: ( () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) ) )
            {
            // InternalUclid.g:5796:2: ( () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) ) )
            // InternalUclid.g:5797:3: () otherlv_1= '[' ( (lv_b_2_0= ruleTypeRule ) ) (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )* otherlv_5= ']' ( (lv_base_6_0= ruleTypeRule ) )
            {
            // InternalUclid.g:5797:3: ()
            // InternalUclid.g:5798:4: 
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

            otherlv_1=(Token)match(input,48,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArrayTypeRuleAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalUclid.g:5811:3: ( (lv_b_2_0= ruleTypeRule ) )
            // InternalUclid.g:5812:4: (lv_b_2_0= ruleTypeRule )
            {
            // InternalUclid.g:5812:4: (lv_b_2_0= ruleTypeRule )
            // InternalUclid.g:5813:5: lv_b_2_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArrayTypeRuleAccess().getBTypeRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_31);
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

            // InternalUclid.g:5830:3: (otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) ) )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==25) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // InternalUclid.g:5831:4: otherlv_3= ',' ( (lv_b_4_0= ruleTypeRule ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getArrayTypeRuleAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalUclid.g:5835:4: ( (lv_b_4_0= ruleTypeRule ) )
            	    // InternalUclid.g:5836:5: (lv_b_4_0= ruleTypeRule )
            	    {
            	    // InternalUclid.g:5836:5: (lv_b_4_0= ruleTypeRule )
            	    // InternalUclid.g:5837:6: lv_b_4_0= ruleTypeRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getArrayTypeRuleAccess().getBTypeRuleParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_31);
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
            	    break loop81;
                }
            } while (true);

            otherlv_5=(Token)match(input,49,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getArrayTypeRuleAccess().getRightSquareBracketKeyword_4());
              		
            }
            // InternalUclid.g:5859:3: ( (lv_base_6_0= ruleTypeRule ) )
            // InternalUclid.g:5860:4: (lv_base_6_0= ruleTypeRule )
            {
            // InternalUclid.g:5860:4: (lv_base_6_0= ruleTypeRule )
            // InternalUclid.g:5861:5: lv_base_6_0= ruleTypeRule
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


    // $ANTLR start "entryRuleSynonymTypeRule"
    // InternalUclid.g:5882:1: entryRuleSynonymTypeRule returns [EObject current=null] : iv_ruleSynonymTypeRule= ruleSynonymTypeRule EOF ;
    public final EObject entryRuleSynonymTypeRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSynonymTypeRule = null;


        try {
            // InternalUclid.g:5882:56: (iv_ruleSynonymTypeRule= ruleSynonymTypeRule EOF )
            // InternalUclid.g:5883:2: iv_ruleSynonymTypeRule= ruleSynonymTypeRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSynonymTypeRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSynonymTypeRule=ruleSynonymTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSynonymTypeRule; 
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
    // $ANTLR end "entryRuleSynonymTypeRule"


    // $ANTLR start "ruleSynonymTypeRule"
    // InternalUclid.g:5889:1: ruleSynonymTypeRule returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSynonymTypeRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalUclid.g:5895:2: ( ( () ( (otherlv_1= RULE_ID ) ) ) )
            // InternalUclid.g:5896:2: ( () ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalUclid.g:5896:2: ( () ( (otherlv_1= RULE_ID ) ) )
            // InternalUclid.g:5897:3: () ( (otherlv_1= RULE_ID ) )
            {
            // InternalUclid.g:5897:3: ()
            // InternalUclid.g:5898:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSynonymTypeRuleAccess().getSynonymTypeRuleAction_0(),
              					current);
              			
            }

            }

            // InternalUclid.g:5907:3: ( (otherlv_1= RULE_ID ) )
            // InternalUclid.g:5908:4: (otherlv_1= RULE_ID )
            {
            // InternalUclid.g:5908:4: (otherlv_1= RULE_ID )
            // InternalUclid.g:5909:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSynonymTypeRuleRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getSynonymTypeRuleAccess().getDeclTypeDeclCrossReference_1_0());
              				
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
    // $ANTLR end "ruleSynonymTypeRule"


    // $ANTLR start "entryRuleControlBlockRule"
    // InternalUclid.g:5927:1: entryRuleControlBlockRule returns [EObject current=null] : iv_ruleControlBlockRule= ruleControlBlockRule EOF ;
    public final EObject entryRuleControlBlockRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleControlBlockRule = null;


        try {
            // InternalUclid.g:5927:57: (iv_ruleControlBlockRule= ruleControlBlockRule EOF )
            // InternalUclid.g:5928:2: iv_ruleControlBlockRule= ruleControlBlockRule EOF
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
    // InternalUclid.g:5934:1: ruleControlBlockRule returns [EObject current=null] : ( () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}' ) ;
    public final EObject ruleControlBlockRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cmd_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:5940:2: ( ( () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}' ) )
            // InternalUclid.g:5941:2: ( () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}' )
            {
            // InternalUclid.g:5941:2: ( () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}' )
            // InternalUclid.g:5942:3: () otherlv_1= 'control' otherlv_2= '{' ( (lv_cmd_3_0= ruleCmdRule ) )* otherlv_4= '}'
            {
            // InternalUclid.g:5942:3: ()
            // InternalUclid.g:5943:4: 
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

            otherlv_1=(Token)match(input,84,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getControlBlockRuleAccess().getControlKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getControlBlockRuleAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalUclid.g:5960:3: ( (lv_cmd_3_0= ruleCmdRule ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==RULE_ID||(LA82_0>=85 && LA82_0<=96)) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalUclid.g:5961:4: (lv_cmd_3_0= ruleCmdRule )
            	    {
            	    // InternalUclid.g:5961:4: (lv_cmd_3_0= ruleCmdRule )
            	    // InternalUclid.g:5962:5: lv_cmd_3_0= ruleCmdRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getControlBlockRuleAccess().getCmdCmdRuleParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_63);
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
            	    break loop82;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:5987:1: entryRuleCmdRule returns [EObject current=null] : iv_ruleCmdRule= ruleCmdRule EOF ;
    public final EObject entryRuleCmdRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmdRule = null;


        try {
            // InternalUclid.g:5987:48: (iv_ruleCmdRule= ruleCmdRule EOF )
            // InternalUclid.g:5988:2: iv_ruleCmdRule= ruleCmdRule EOF
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
    // InternalUclid.g:5994:1: ruleCmdRule returns [EObject current=null] : ( ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';' ) ;
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
            // InternalUclid.g:6000:2: ( ( ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';' ) )
            // InternalUclid.g:6001:2: ( ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';' )
            {
            // InternalUclid.g:6001:2: ( ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';' )
            // InternalUclid.g:6002:3: ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )? (this_ID_2= RULE_ID otherlv_3= '.' )? ( (lv_c_4_0= ruleCmdNameRule ) ) (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )? (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )? otherlv_11= ';'
            {
            // InternalUclid.g:6002:3: ( ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '=' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_ID) ) {
                int LA83_1 = input.LA(2);

                if ( (LA83_1==19) ) {
                    alt83=1;
                }
            }
            switch (alt83) {
                case 1 :
                    // InternalUclid.g:6003:4: ( (lv_lhs_0_0= ruleVarDecl ) ) otherlv_1= '='
                    {
                    // InternalUclid.g:6003:4: ( (lv_lhs_0_0= ruleVarDecl ) )
                    // InternalUclid.g:6004:5: (lv_lhs_0_0= ruleVarDecl )
                    {
                    // InternalUclid.g:6004:5: (lv_lhs_0_0= ruleVarDecl )
                    // InternalUclid.g:6005:6: lv_lhs_0_0= ruleVarDecl
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

                    otherlv_1=(Token)match(input,19,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getCmdRuleAccess().getEqualsSignKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:6027:3: (this_ID_2= RULE_ID otherlv_3= '.' )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_ID) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalUclid.g:6028:4: this_ID_2= RULE_ID otherlv_3= '.'
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_2, grammarAccess.getCmdRuleAccess().getIDTerminalRuleCall_1_0());
                      			
                    }
                    otherlv_3=(Token)match(input,13,FOLLOW_64); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getCmdRuleAccess().getFullStopKeyword_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:6037:3: ( (lv_c_4_0= ruleCmdNameRule ) )
            // InternalUclid.g:6038:4: (lv_c_4_0= ruleCmdNameRule )
            {
            // InternalUclid.g:6038:4: (lv_c_4_0= ruleCmdNameRule )
            // InternalUclid.g:6039:5: lv_c_4_0= ruleCmdNameRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCmdRuleAccess().getCCmdNameRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_66);
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

            // InternalUclid.g:6056:3: (otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==48) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalUclid.g:6057:4: otherlv_5= '[' ( (lv_lid_6_0= ruleIdListRule ) ) otherlv_7= ']'
                    {
                    otherlv_5=(Token)match(input,48,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getCmdRuleAccess().getLeftSquareBracketKeyword_3_0());
                      			
                    }
                    // InternalUclid.g:6061:4: ( (lv_lid_6_0= ruleIdListRule ) )
                    // InternalUclid.g:6062:5: (lv_lid_6_0= ruleIdListRule )
                    {
                    // InternalUclid.g:6062:5: (lv_lid_6_0= ruleIdListRule )
                    // InternalUclid.g:6063:6: lv_lid_6_0= ruleIdListRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getCmdRuleAccess().getLidIdListRuleParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_41);
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

                    otherlv_7=(Token)match(input,49,FOLLOW_67); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getCmdRuleAccess().getRightSquareBracketKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalUclid.g:6085:3: (otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==29) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalUclid.g:6086:4: otherlv_8= '(' ( (lv_lex_9_0= ruleExprListRule ) )? otherlv_10= ')'
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getCmdRuleAccess().getLeftParenthesisKeyword_4_0());
                      			
                    }
                    // InternalUclid.g:6090:4: ( (lv_lex_9_0= ruleExprListRule ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( ((LA86_0>=RULE_ID && LA86_0<=RULE_INT)||LA86_0==RULE_STRING||LA86_0==15||LA86_0==29||LA86_0==51||(LA86_0>=73 && LA86_0<=75)||(LA86_0>=78 && LA86_0<=79)) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalUclid.g:6091:5: (lv_lex_9_0= ruleExprListRule )
                            {
                            // InternalUclid.g:6091:5: (lv_lex_9_0= ruleExprListRule )
                            // InternalUclid.g:6092:6: lv_lex_9_0= ruleExprListRule
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

                    otherlv_10=(Token)match(input,30,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getCmdRuleAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:6122:1: entryRuleCmdNameRule returns [String current=null] : iv_ruleCmdNameRule= ruleCmdNameRule EOF ;
    public final String entryRuleCmdNameRule() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCmdNameRule = null;


        try {
            // InternalUclid.g:6122:51: (iv_ruleCmdNameRule= ruleCmdNameRule EOF )
            // InternalUclid.g:6123:2: iv_ruleCmdNameRule= ruleCmdNameRule EOF
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
    // InternalUclid.g:6129:1: ruleCmdNameRule returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'bmc' | kw= 'check' | kw= 'clear_context' | kw= 'induction' | kw= 'print' | kw= 'print_cex' | kw= 'print_module' | kw= 'print_results' | kw= 'print_smt2' | kw= 'synthesize_invariant' | kw= 'unroll' | kw= 'verify' ) ;
    public final AntlrDatatypeRuleToken ruleCmdNameRule() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalUclid.g:6135:2: ( (kw= 'bmc' | kw= 'check' | kw= 'clear_context' | kw= 'induction' | kw= 'print' | kw= 'print_cex' | kw= 'print_module' | kw= 'print_results' | kw= 'print_smt2' | kw= 'synthesize_invariant' | kw= 'unroll' | kw= 'verify' ) )
            // InternalUclid.g:6136:2: (kw= 'bmc' | kw= 'check' | kw= 'clear_context' | kw= 'induction' | kw= 'print' | kw= 'print_cex' | kw= 'print_module' | kw= 'print_results' | kw= 'print_smt2' | kw= 'synthesize_invariant' | kw= 'unroll' | kw= 'verify' )
            {
            // InternalUclid.g:6136:2: (kw= 'bmc' | kw= 'check' | kw= 'clear_context' | kw= 'induction' | kw= 'print' | kw= 'print_cex' | kw= 'print_module' | kw= 'print_results' | kw= 'print_smt2' | kw= 'synthesize_invariant' | kw= 'unroll' | kw= 'verify' )
            int alt88=12;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt88=1;
                }
                break;
            case 86:
                {
                alt88=2;
                }
                break;
            case 87:
                {
                alt88=3;
                }
                break;
            case 88:
                {
                alt88=4;
                }
                break;
            case 89:
                {
                alt88=5;
                }
                break;
            case 90:
                {
                alt88=6;
                }
                break;
            case 91:
                {
                alt88=7;
                }
                break;
            case 92:
                {
                alt88=8;
                }
                break;
            case 93:
                {
                alt88=9;
                }
                break;
            case 94:
                {
                alt88=10;
                }
                break;
            case 95:
                {
                alt88=11;
                }
                break;
            case 96:
                {
                alt88=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalUclid.g:6137:3: kw= 'bmc'
                    {
                    kw=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getBmcKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalUclid.g:6143:3: kw= 'check'
                    {
                    kw=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getCheckKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalUclid.g:6149:3: kw= 'clear_context'
                    {
                    kw=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getClear_contextKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalUclid.g:6155:3: kw= 'induction'
                    {
                    kw=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getInductionKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalUclid.g:6161:3: kw= 'print'
                    {
                    kw=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrintKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalUclid.g:6167:3: kw= 'print_cex'
                    {
                    kw=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrint_cexKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalUclid.g:6173:3: kw= 'print_module'
                    {
                    kw=(Token)match(input,91,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrint_moduleKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalUclid.g:6179:3: kw= 'print_results'
                    {
                    kw=(Token)match(input,92,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrint_resultsKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalUclid.g:6185:3: kw= 'print_smt2'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getPrint_smt2Keyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalUclid.g:6191:3: kw= 'synthesize_invariant'
                    {
                    kw=(Token)match(input,94,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getSynthesize_invariantKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalUclid.g:6197:3: kw= 'unroll'
                    {
                    kw=(Token)match(input,95,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getCmdNameRuleAccess().getUnrollKeyword_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalUclid.g:6203:3: kw= 'verify'
                    {
                    kw=(Token)match(input,96,FOLLOW_2); if (state.failed) return current;
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
    // InternalUclid.g:6212:1: entryRuleIdListRule returns [EObject current=null] : iv_ruleIdListRule= ruleIdListRule EOF ;
    public final EObject entryRuleIdListRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdListRule = null;


        try {
            // InternalUclid.g:6212:51: (iv_ruleIdListRule= ruleIdListRule EOF )
            // InternalUclid.g:6213:2: iv_ruleIdListRule= ruleIdListRule EOF
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
    // InternalUclid.g:6219:1: ruleIdListRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) ) ) ;
    public final EObject ruleIdListRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_l_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:6225:2: ( ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) ) ) )
            // InternalUclid.g:6226:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) ) )
            {
            // InternalUclid.g:6226:2: ( ( (lv_name_0_0= RULE_ID ) ) | ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_ID) ) {
                int LA89_1 = input.LA(2);

                if ( (LA89_1==25) ) {
                    alt89=2;
                }
                else if ( (LA89_1==EOF||LA89_1==20||LA89_1==22||LA89_1==49) ) {
                    alt89=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 89, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalUclid.g:6227:3: ( (lv_name_0_0= RULE_ID ) )
                    {
                    // InternalUclid.g:6227:3: ( (lv_name_0_0= RULE_ID ) )
                    // InternalUclid.g:6228:4: (lv_name_0_0= RULE_ID )
                    {
                    // InternalUclid.g:6228:4: (lv_name_0_0= RULE_ID )
                    // InternalUclid.g:6229:5: lv_name_0_0= RULE_ID
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
                    // InternalUclid.g:6246:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) )
                    {
                    // InternalUclid.g:6246:3: ( ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) ) )
                    // InternalUclid.g:6247:4: ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ',' ( (lv_l_3_0= ruleIdListRule ) )
                    {
                    // InternalUclid.g:6247:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalUclid.g:6248:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalUclid.g:6248:5: (lv_name_1_0= RULE_ID )
                    // InternalUclid.g:6249:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
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

                    otherlv_2=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getIdListRuleAccess().getCommaKeyword_1_1());
                      			
                    }
                    // InternalUclid.g:6269:4: ( (lv_l_3_0= ruleIdListRule ) )
                    // InternalUclid.g:6270:5: (lv_l_3_0= ruleIdListRule )
                    {
                    // InternalUclid.g:6270:5: (lv_l_3_0= ruleIdListRule )
                    // InternalUclid.g:6271:6: lv_l_3_0= ruleIdListRule
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


    // $ANTLR start "entryRuleIdTypeListRule"
    // InternalUclid.g:6293:1: entryRuleIdTypeListRule returns [EObject current=null] : iv_ruleIdTypeListRule= ruleIdTypeListRule EOF ;
    public final EObject entryRuleIdTypeListRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdTypeListRule = null;


        try {
            // InternalUclid.g:6293:55: (iv_ruleIdTypeListRule= ruleIdTypeListRule EOF )
            // InternalUclid.g:6294:2: iv_ruleIdTypeListRule= ruleIdTypeListRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdTypeListRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdTypeListRule=ruleIdTypeListRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdTypeListRule; 
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
    // $ANTLR end "entryRuleIdTypeListRule"


    // $ANTLR start "ruleIdTypeListRule"
    // InternalUclid.g:6300:1: ruleIdTypeListRule returns [EObject current=null] : ( ( (lv_k_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_z_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) (otherlv_5= ',' ( (lv_l_6_0= ruleIdTypeListRule ) ) )? ) ;
    public final EObject ruleIdTypeListRule() throws RecognitionException {
        EObject current = null;

        Token lv_k_0_0=null;
        Token otherlv_1=null;
        Token lv_z_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_t_4_0 = null;

        EObject lv_l_6_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:6306:2: ( ( ( (lv_k_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_z_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) (otherlv_5= ',' ( (lv_l_6_0= ruleIdTypeListRule ) ) )? ) )
            // InternalUclid.g:6307:2: ( ( (lv_k_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_z_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) (otherlv_5= ',' ( (lv_l_6_0= ruleIdTypeListRule ) ) )? )
            {
            // InternalUclid.g:6307:2: ( ( (lv_k_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_z_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) (otherlv_5= ',' ( (lv_l_6_0= ruleIdTypeListRule ) ) )? )
            // InternalUclid.g:6308:3: ( (lv_k_0_0= RULE_ID ) ) (otherlv_1= ',' ( (lv_z_2_0= RULE_ID ) ) )* otherlv_3= ':' ( (lv_t_4_0= ruleTypeRule ) ) (otherlv_5= ',' ( (lv_l_6_0= ruleIdTypeListRule ) ) )?
            {
            // InternalUclid.g:6308:3: ( (lv_k_0_0= RULE_ID ) )
            // InternalUclid.g:6309:4: (lv_k_0_0= RULE_ID )
            {
            // InternalUclid.g:6309:4: (lv_k_0_0= RULE_ID )
            // InternalUclid.g:6310:5: lv_k_0_0= RULE_ID
            {
            lv_k_0_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_k_0_0, grammarAccess.getIdTypeListRuleAccess().getKIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getIdTypeListRuleRule());
              					}
              					addWithLastConsumed(
              						current,
              						"k",
              						lv_k_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            // InternalUclid.g:6326:3: (otherlv_1= ',' ( (lv_z_2_0= RULE_ID ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==25) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalUclid.g:6327:4: otherlv_1= ',' ( (lv_z_2_0= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getIdTypeListRuleAccess().getCommaKeyword_1_0());
            	      			
            	    }
            	    // InternalUclid.g:6331:4: ( (lv_z_2_0= RULE_ID ) )
            	    // InternalUclid.g:6332:5: (lv_z_2_0= RULE_ID )
            	    {
            	    // InternalUclid.g:6332:5: (lv_z_2_0= RULE_ID )
            	    // InternalUclid.g:6333:6: lv_z_2_0= RULE_ID
            	    {
            	    lv_z_2_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_z_2_0, grammarAccess.getIdTypeListRuleAccess().getZIDTerminalRuleCall_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getIdTypeListRuleRule());
            	      						}
            	      						addWithLastConsumed(
            	      							current,
            	      							"z",
            	      							lv_z_2_0,
            	      							"org.eclipse.xtext.common.Terminals.ID");
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            otherlv_3=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getIdTypeListRuleAccess().getColonKeyword_2());
              		
            }
            // InternalUclid.g:6354:3: ( (lv_t_4_0= ruleTypeRule ) )
            // InternalUclid.g:6355:4: (lv_t_4_0= ruleTypeRule )
            {
            // InternalUclid.g:6355:4: (lv_t_4_0= ruleTypeRule )
            // InternalUclid.g:6356:5: lv_t_4_0= ruleTypeRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIdTypeListRuleAccess().getTTypeRuleParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_27);
            lv_t_4_0=ruleTypeRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIdTypeListRuleRule());
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

            // InternalUclid.g:6373:3: (otherlv_5= ',' ( (lv_l_6_0= ruleIdTypeListRule ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==25) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalUclid.g:6374:4: otherlv_5= ',' ( (lv_l_6_0= ruleIdTypeListRule ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getIdTypeListRuleAccess().getCommaKeyword_4_0());
                      			
                    }
                    // InternalUclid.g:6378:4: ( (lv_l_6_0= ruleIdTypeListRule ) )
                    // InternalUclid.g:6379:5: (lv_l_6_0= ruleIdTypeListRule )
                    {
                    // InternalUclid.g:6379:5: (lv_l_6_0= ruleIdTypeListRule )
                    // InternalUclid.g:6380:6: lv_l_6_0= ruleIdTypeListRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIdTypeListRuleAccess().getLIdTypeListRuleParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_l_6_0=ruleIdTypeListRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIdTypeListRuleRule());
                      						}
                      						set(
                      							current,
                      							"l",
                      							lv_l_6_0,
                      							"uclid.xtext.Uclid.IdTypeListRule");
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
    // $ANTLR end "ruleIdTypeListRule"


    // $ANTLR start "entryRuleExprListRule"
    // InternalUclid.g:6402:1: entryRuleExprListRule returns [EObject current=null] : iv_ruleExprListRule= ruleExprListRule EOF ;
    public final EObject entryRuleExprListRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExprListRule = null;


        try {
            // InternalUclid.g:6402:53: (iv_ruleExprListRule= ruleExprListRule EOF )
            // InternalUclid.g:6403:2: iv_ruleExprListRule= ruleExprListRule EOF
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
    // InternalUclid.g:6409:1: ruleExprListRule returns [EObject current=null] : ( () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )* ) ;
    public final EObject ruleExprListRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_exprs_1_0 = null;

        EObject lv_exprs_3_0 = null;



        	enterRule();

        try {
            // InternalUclid.g:6415:2: ( ( () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )* ) )
            // InternalUclid.g:6416:2: ( () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )* )
            {
            // InternalUclid.g:6416:2: ( () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )* )
            // InternalUclid.g:6417:3: () ( (lv_exprs_1_0= ruleExprRule ) ) (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )*
            {
            // InternalUclid.g:6417:3: ()
            // InternalUclid.g:6418:4: 
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

            // InternalUclid.g:6427:3: ( (lv_exprs_1_0= ruleExprRule ) )
            // InternalUclid.g:6428:4: (lv_exprs_1_0= ruleExprRule )
            {
            // InternalUclid.g:6428:4: (lv_exprs_1_0= ruleExprRule )
            // InternalUclid.g:6429:5: lv_exprs_1_0= ruleExprRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getExprListRuleAccess().getExprsExprRuleParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_27);
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

            // InternalUclid.g:6446:3: (otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) ) )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( (LA92_0==25) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalUclid.g:6447:4: otherlv_2= ',' ( (lv_exprs_3_0= ruleExprRule ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getExprListRuleAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalUclid.g:6451:4: ( (lv_exprs_3_0= ruleExprRule ) )
            	    // InternalUclid.g:6452:5: (lv_exprs_3_0= ruleExprRule )
            	    {
            	    // InternalUclid.g:6452:5: (lv_exprs_3_0= ruleExprRule )
            	    // InternalUclid.g:6453:6: lv_exprs_3_0= ruleExprRule
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getExprListRuleAccess().getExprsExprRuleParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_27);
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
            	    break loop92;
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

    // $ANTLR start synpred78_InternalUclid
    public final void synpred78_InternalUclid_fragment() throws RecognitionException {   
        EObject lv_q_2_1 = null;


        // InternalUclid.g:3858:7: (lv_q_2_1= ruleE2Rule )
        // InternalUclid.g:3858:7: lv_q_2_1= ruleE2Rule
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
    // $ANTLR end synpred78_InternalUclid

    // $ANTLR start synpred79_InternalUclid
    public final void synpred79_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_q_2_1 = null;

        EObject lv_q_2_2 = null;


        // InternalUclid.g:3851:4: (otherlv_1= '<==>' ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) ) )
        // InternalUclid.g:3851:4: otherlv_1= '<==>' ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) )
        {
        otherlv_1=(Token)match(input,64,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:3855:4: ( ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) ) )
        // InternalUclid.g:3856:5: ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) )
        {
        // InternalUclid.g:3856:5: ( (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule ) )
        // InternalUclid.g:3857:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )
        {
        // InternalUclid.g:3857:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )
        int alt108=2;
        alt108 = dfa108.predict(input);
        switch (alt108) {
            case 1 :
                // InternalUclid.g:3858:7: lv_q_2_1= ruleE2Rule
                {
                pushFollow(FOLLOW_2);
                lv_q_2_1=ruleE2Rule();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalUclid.g:3874:7: lv_q_2_2= ruleE3Rule
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
    // $ANTLR end synpred79_InternalUclid

    // $ANTLR start synpred80_InternalUclid
    public final void synpred80_InternalUclid_fragment() throws RecognitionException {   
        EObject lv_e_2_1 = null;


        // InternalUclid.g:3939:7: (lv_e_2_1= ruleE3Rule )
        // InternalUclid.g:3939:7: lv_e_2_1= ruleE3Rule
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
    // $ANTLR end synpred80_InternalUclid

    // $ANTLR start synpred81_InternalUclid
    public final void synpred81_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_2_1 = null;

        EObject lv_e_2_2 = null;


        // InternalUclid.g:3932:4: (otherlv_1= '==>' ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) ) )
        // InternalUclid.g:3932:4: otherlv_1= '==>' ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) )
        {
        otherlv_1=(Token)match(input,65,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:3936:4: ( ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) ) )
        // InternalUclid.g:3937:5: ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) )
        {
        // InternalUclid.g:3937:5: ( (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule ) )
        // InternalUclid.g:3938:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )
        {
        // InternalUclid.g:3938:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )
        int alt109=2;
        alt109 = dfa109.predict(input);
        switch (alt109) {
            case 1 :
                // InternalUclid.g:3939:7: lv_e_2_1= ruleE3Rule
                {
                pushFollow(FOLLOW_2);
                lv_e_2_1=ruleE3Rule();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalUclid.g:3955:7: lv_e_2_2= ruleE4Rule
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
    // $ANTLR end synpred81_InternalUclid

    // $ANTLR start synpred82_InternalUclid
    public final void synpred82_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_0_0 = null;

        EObject lv_e_2_0 = null;


        // InternalUclid.g:3993:3: ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:3993:3: ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:3993:3: ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) )
        // InternalUclid.g:3994:4: ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) )
        {
        // InternalUclid.g:3994:4: ( (lv_e_0_0= ruleE5Rule ) )
        // InternalUclid.g:3995:5: (lv_e_0_0= ruleE5Rule )
        {
        // InternalUclid.g:3995:5: (lv_e_0_0= ruleE5Rule )
        // InternalUclid.g:3996:6: lv_e_0_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_0_0_0());
          					
        }
        pushFollow(FOLLOW_46);
        lv_e_0_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_1=(Token)match(input,66,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4017:4: ( (lv_e_2_0= ruleE4Rule ) )
        // InternalUclid.g:4018:5: (lv_e_2_0= ruleE4Rule )
        {
        // InternalUclid.g:4018:5: (lv_e_2_0= ruleE4Rule )
        // InternalUclid.g:4019:6: lv_e_2_0= ruleE4Rule
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
    // $ANTLR end synpred82_InternalUclid

    // $ANTLR start synpred83_InternalUclid
    public final void synpred83_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        EObject lv_e_3_0 = null;

        EObject lv_e_5_0 = null;


        // InternalUclid.g:4038:3: ( ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:4038:3: ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4038:3: ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) )
        // InternalUclid.g:4039:4: ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) )
        {
        // InternalUclid.g:4039:4: ( (lv_e_3_0= ruleE5Rule ) )
        // InternalUclid.g:4040:5: (lv_e_3_0= ruleE5Rule )
        {
        // InternalUclid.g:4040:5: (lv_e_3_0= ruleE5Rule )
        // InternalUclid.g:4041:6: lv_e_3_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_1_0_0());
          					
        }
        pushFollow(FOLLOW_47);
        lv_e_3_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,67,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4062:4: ( (lv_e_5_0= ruleE4Rule ) )
        // InternalUclid.g:4063:5: (lv_e_5_0= ruleE4Rule )
        {
        // InternalUclid.g:4063:5: (lv_e_5_0= ruleE4Rule )
        // InternalUclid.g:4064:6: lv_e_5_0= ruleE4Rule
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
    // $ANTLR end synpred83_InternalUclid

    // $ANTLR start synpred84_InternalUclid
    public final void synpred84_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_7=null;
        EObject lv_e_6_0 = null;

        EObject lv_e_8_0 = null;


        // InternalUclid.g:4083:3: ( ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:4083:3: ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4083:3: ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) )
        // InternalUclid.g:4084:4: ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) )
        {
        // InternalUclid.g:4084:4: ( (lv_e_6_0= ruleE5Rule ) )
        // InternalUclid.g:4085:5: (lv_e_6_0= ruleE5Rule )
        {
        // InternalUclid.g:4085:5: (lv_e_6_0= ruleE5Rule )
        // InternalUclid.g:4086:6: lv_e_6_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_2_0_0());
          					
        }
        pushFollow(FOLLOW_48);
        lv_e_6_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_7=(Token)match(input,68,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4107:4: ( (lv_e_8_0= ruleE4Rule ) )
        // InternalUclid.g:4108:5: (lv_e_8_0= ruleE4Rule )
        {
        // InternalUclid.g:4108:5: (lv_e_8_0= ruleE4Rule )
        // InternalUclid.g:4109:6: lv_e_8_0= ruleE4Rule
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
    // $ANTLR end synpred84_InternalUclid

    // $ANTLR start synpred85_InternalUclid
    public final void synpred85_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_10=null;
        EObject lv_e_9_0 = null;

        EObject lv_e_11_0 = null;


        // InternalUclid.g:4128:3: ( ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:4128:3: ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4128:3: ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) )
        // InternalUclid.g:4129:4: ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) )
        {
        // InternalUclid.g:4129:4: ( (lv_e_9_0= ruleE5Rule ) )
        // InternalUclid.g:4130:5: (lv_e_9_0= ruleE5Rule )
        {
        // InternalUclid.g:4130:5: (lv_e_9_0= ruleE5Rule )
        // InternalUclid.g:4131:6: lv_e_9_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_3_0_0());
          					
        }
        pushFollow(FOLLOW_49);
        lv_e_9_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_10=(Token)match(input,69,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4152:4: ( (lv_e_11_0= ruleE4Rule ) )
        // InternalUclid.g:4153:5: (lv_e_11_0= ruleE4Rule )
        {
        // InternalUclid.g:4153:5: (lv_e_11_0= ruleE4Rule )
        // InternalUclid.g:4154:6: lv_e_11_0= ruleE4Rule
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
    // $ANTLR end synpred85_InternalUclid

    // $ANTLR start synpred86_InternalUclid
    public final void synpred86_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_13=null;
        EObject lv_e_12_0 = null;

        EObject lv_e_14_0 = null;


        // InternalUclid.g:4173:3: ( ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) )
        // InternalUclid.g:4173:3: ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) )
        {
        // InternalUclid.g:4173:3: ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) )
        // InternalUclid.g:4174:4: ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) )
        {
        // InternalUclid.g:4174:4: ( (lv_e_12_0= ruleE5Rule ) )
        // InternalUclid.g:4175:5: (lv_e_12_0= ruleE5Rule )
        {
        // InternalUclid.g:4175:5: (lv_e_12_0= ruleE5Rule )
        // InternalUclid.g:4176:6: lv_e_12_0= ruleE5Rule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE4RuleAccess().getEE5RuleParserRuleCall_4_0_0());
          					
        }
        pushFollow(FOLLOW_50);
        lv_e_12_0=ruleE5Rule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_13=(Token)match(input,70,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4197:4: ( (lv_e_14_0= ruleE4Rule ) )
        // InternalUclid.g:4198:5: (lv_e_14_0= ruleE4Rule )
        {
        // InternalUclid.g:4198:5: (lv_e_14_0= ruleE4Rule )
        // InternalUclid.g:4199:6: lv_e_14_0= ruleE4Rule
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
    // $ANTLR end synpred86_InternalUclid

    // $ANTLR start synpred87_InternalUclid
    public final void synpred87_InternalUclid_fragment() throws RecognitionException {   
        Token lv_op_1_0=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4276:4: ( ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) ) )
        // InternalUclid.g:4276:4: ( (lv_op_1_0= RULE_REL_OP_RULE ) ) ( (lv_e_2_0= ruleE6Rule ) )
        {
        // InternalUclid.g:4276:4: ( (lv_op_1_0= RULE_REL_OP_RULE ) )
        // InternalUclid.g:4277:5: (lv_op_1_0= RULE_REL_OP_RULE )
        {
        // InternalUclid.g:4277:5: (lv_op_1_0= RULE_REL_OP_RULE )
        // InternalUclid.g:4278:6: lv_op_1_0= RULE_REL_OP_RULE
        {
        lv_op_1_0=(Token)match(input,RULE_REL_OP_RULE,FOLLOW_20); if (state.failed) return ;

        }


        }

        // InternalUclid.g:4294:4: ( (lv_e_2_0= ruleE6Rule ) )
        // InternalUclid.g:4295:5: (lv_e_2_0= ruleE6Rule )
        {
        // InternalUclid.g:4295:5: (lv_e_2_0= ruleE6Rule )
        // InternalUclid.g:4296:6: lv_e_2_0= ruleE6Rule
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
    // $ANTLR end synpred87_InternalUclid

    // $ANTLR start synpred88_InternalUclid
    public final void synpred88_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4353:4: (otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) ) )
        // InternalUclid.g:4353:4: otherlv_1= '++' ( (lv_e_2_0= ruleE6Rule ) )
        {
        otherlv_1=(Token)match(input,71,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4357:4: ( (lv_e_2_0= ruleE6Rule ) )
        // InternalUclid.g:4358:5: (lv_e_2_0= ruleE6Rule )
        {
        // InternalUclid.g:4358:5: (lv_e_2_0= ruleE6Rule )
        // InternalUclid.g:4359:6: lv_e_2_0= ruleE6Rule
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
    // $ANTLR end synpred88_InternalUclid

    // $ANTLR start synpred89_InternalUclid
    public final void synpred89_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4416:4: (otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) ) )
        // InternalUclid.g:4416:4: otherlv_1= '+' ( (lv_e_2_0= ruleE7Rule ) )
        {
        otherlv_1=(Token)match(input,72,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4420:4: ( (lv_e_2_0= ruleE7Rule ) )
        // InternalUclid.g:4421:5: (lv_e_2_0= ruleE7Rule )
        {
        // InternalUclid.g:4421:5: (lv_e_2_0= ruleE7Rule )
        // InternalUclid.g:4422:6: lv_e_2_0= ruleE7Rule
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
    // $ANTLR end synpred89_InternalUclid

    // $ANTLR start synpred90_InternalUclid
    public final void synpred90_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4479:4: (otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) ) )
        // InternalUclid.g:4479:4: otherlv_1= '-' ( (lv_e_2_0= ruleE9Rule ) )
        {
        otherlv_1=(Token)match(input,73,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4483:4: ( (lv_e_2_0= ruleE9Rule ) )
        // InternalUclid.g:4484:5: (lv_e_2_0= ruleE9Rule )
        {
        // InternalUclid.g:4484:5: (lv_e_2_0= ruleE9Rule )
        // InternalUclid.g:4485:6: lv_e_2_0= ruleE9Rule
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
    // $ANTLR end synpred90_InternalUclid

    // $ANTLR start synpred91_InternalUclid
    public final void synpred91_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_e_2_0 = null;


        // InternalUclid.g:4542:4: (otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) ) )
        // InternalUclid.g:4542:4: otherlv_1= '*' ( (lv_e_2_0= ruleE10Rule ) )
        {
        otherlv_1=(Token)match(input,18,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4546:4: ( (lv_e_2_0= ruleE10Rule ) )
        // InternalUclid.g:4547:5: (lv_e_2_0= ruleE10Rule )
        {
        // InternalUclid.g:4547:5: (lv_e_2_0= ruleE10Rule )
        // InternalUclid.g:4548:6: lv_e_2_0= ruleE10Rule
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
    // $ANTLR end synpred91_InternalUclid

    // $ANTLR start synpred97_InternalUclid
    public final void synpred97_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_E12Rule_0 = null;

        EObject lv_l_2_0 = null;

        EObject lv_e_4_0 = null;

        EObject lv_e_6_0 = null;


        // InternalUclid.g:4683:3: ( (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' ) )
        // InternalUclid.g:4683:3: (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )
        {
        // InternalUclid.g:4683:3: (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' )
        // InternalUclid.g:4684:4: this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']'
        {
        if ( state.backtracking==0 ) {

          				/* */
          			
        }
        pushFollow(FOLLOW_56);
        this_E12Rule_0=ruleE12Rule();

        state._fsp--;
        if (state.failed) return ;
        otherlv_1=(Token)match(input,48,FOLLOW_20); if (state.failed) return ;
        // InternalUclid.g:4699:4: ( (lv_l_2_0= ruleExprListRule ) )
        // InternalUclid.g:4700:5: (lv_l_2_0= ruleExprListRule )
        {
        // InternalUclid.g:4700:5: (lv_l_2_0= ruleExprListRule )
        // InternalUclid.g:4701:6: lv_l_2_0= ruleExprListRule
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getE11RuleAccess().getLExprListRuleParserRuleCall_0_2_0());
          					
        }
        pushFollow(FOLLOW_57);
        lv_l_2_0=ruleExprListRule();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        // InternalUclid.g:4718:4: ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )?
        int alt111=3;
        int LA111_0 = input.LA(1);

        if ( (LA111_0==76) ) {
            alt111=1;
        }
        else if ( (LA111_0==22) ) {
            alt111=2;
        }
        switch (alt111) {
            case 1 :
                // InternalUclid.g:4719:5: (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) )
                {
                // InternalUclid.g:4719:5: (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) )
                // InternalUclid.g:4720:6: otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) )
                {
                otherlv_3=(Token)match(input,76,FOLLOW_20); if (state.failed) return ;
                // InternalUclid.g:4724:6: ( (lv_e_4_0= ruleExprRule ) )
                // InternalUclid.g:4725:7: (lv_e_4_0= ruleExprRule )
                {
                // InternalUclid.g:4725:7: (lv_e_4_0= ruleExprRule )
                // InternalUclid.g:4726:8: lv_e_4_0= ruleExprRule
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getE11RuleAccess().getEExprRuleParserRuleCall_0_3_0_1_0());
                  							
                }
                pushFollow(FOLLOW_41);
                lv_e_4_0=ruleExprRule();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;
            case 2 :
                // InternalUclid.g:4745:5: (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) )
                {
                // InternalUclid.g:4745:5: (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) )
                // InternalUclid.g:4746:6: otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) )
                {
                otherlv_5=(Token)match(input,22,FOLLOW_20); if (state.failed) return ;
                // InternalUclid.g:4750:6: ( (lv_e_6_0= ruleExprRule ) )
                // InternalUclid.g:4751:7: (lv_e_6_0= ruleExprRule )
                {
                // InternalUclid.g:4751:7: (lv_e_6_0= ruleExprRule )
                // InternalUclid.g:4752:8: lv_e_6_0= ruleExprRule
                {
                if ( state.backtracking==0 ) {

                  								newCompositeNode(grammarAccess.getE11RuleAccess().getEExprRuleParserRuleCall_0_3_1_1_0());
                  							
                }
                pushFollow(FOLLOW_41);
                lv_e_6_0=ruleExprRule();

                state._fsp--;
                if (state.failed) return ;

                }


                }


                }


                }
                break;

        }

        otherlv_7=(Token)match(input,49,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred97_InternalUclid

    // $ANTLR start synpred99_InternalUclid
    public final void synpred99_InternalUclid_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_v_2_0 = null;


        // InternalUclid.g:4827:4: (otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')' )
        // InternalUclid.g:4827:4: otherlv_1= '(' ( (lv_v_2_0= ruleExprListRule ) )? otherlv_3= ')'
        {
        otherlv_1=(Token)match(input,29,FOLLOW_23); if (state.failed) return ;
        // InternalUclid.g:4831:4: ( (lv_v_2_0= ruleExprListRule ) )?
        int alt112=2;
        int LA112_0 = input.LA(1);

        if ( ((LA112_0>=RULE_ID && LA112_0<=RULE_INT)||LA112_0==RULE_STRING||LA112_0==15||LA112_0==29||LA112_0==51||(LA112_0>=73 && LA112_0<=75)||(LA112_0>=78 && LA112_0<=79)) ) {
            alt112=1;
        }
        switch (alt112) {
            case 1 :
                // InternalUclid.g:4832:5: (lv_v_2_0= ruleExprListRule )
                {
                // InternalUclid.g:4832:5: (lv_v_2_0= ruleExprListRule )
                // InternalUclid.g:4833:6: lv_v_2_0= ruleExprListRule
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

        otherlv_3=(Token)match(input,30,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred99_InternalUclid

    // $ANTLR start synpred102_InternalUclid
    public final void synpred102_InternalUclid_fragment() throws RecognitionException {   
        EObject this_RHSVarRef_1 = null;


        // InternalUclid.g:4986:3: (this_RHSVarRef_1= ruleRHSVarRef )
        // InternalUclid.g:4986:3: this_RHSVarRef_1= ruleRHSVarRef
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
    // $ANTLR end synpred102_InternalUclid

    // $ANTLR start synpred103_InternalUclid
    public final void synpred103_InternalUclid_fragment() throws RecognitionException {   
        EObject this_EnumRef_2 = null;


        // InternalUclid.g:4998:3: (this_EnumRef_2= ruleEnumRef )
        // InternalUclid.g:4998:3: this_EnumRef_2= ruleEnumRef
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FOLLOW_2);
        this_EnumRef_2=ruleEnumRef();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred103_InternalUclid

    // Delegated rules

    public final boolean synpred97_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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
    public final boolean synpred80_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalUclid_fragment(); // can never throw exception
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
    public final boolean synpred81_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred81_InternalUclid_fragment(); // can never throw exception
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
    public final boolean synpred102_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred102_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred99_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred99_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalUclid() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalUclid_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA108 dfa108 = new DFA108(this);
    protected DFA109 dfa109 = new DFA109(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\13\0\2\uffff";
    static final String dfa_3s = "\1\117\13\0\2\uffff";
    static final String dfa_4s = "\14\uffff\1\1\1\2";
    static final String dfa_5s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\10\1\6\2\uffff\1\7\6\uffff\1\11\15\uffff\1\13\25\uffff\1\12\25\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5",
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

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3857:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_4 = input.LA(1);

                         
                        int index56_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_7 = input.LA(1);

                         
                        int index56_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA56_8 = input.LA(1);

                         
                        int index56_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA56_9 = input.LA(1);

                         
                        int index56_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA56_10 = input.LA(1);

                         
                        int index56_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA56_11 = input.LA(1);

                         
                        int index56_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index56_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3938:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_1 = input.LA(1);

                         
                        int index58_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_2 = input.LA(1);

                         
                        int index58_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_3 = input.LA(1);

                         
                        int index58_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA58_4 = input.LA(1);

                         
                        int index58_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA58_5 = input.LA(1);

                         
                        int index58_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA58_6 = input.LA(1);

                         
                        int index58_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA58_7 = input.LA(1);

                         
                        int index58_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA58_8 = input.LA(1);

                         
                        int index58_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA58_9 = input.LA(1);

                         
                        int index58_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA58_10 = input.LA(1);

                         
                        int index58_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA58_11 = input.LA(1);

                         
                        int index58_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index58_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\1\4\13\0\6\uffff";
    static final String dfa_9s = "\1\117\13\0\6\uffff";
    static final String dfa_10s = "\14\uffff\1\1\1\2\1\3\1\4\1\5\1\6";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\6\uffff}>";
    static final String[] dfa_12s = {
            "\1\10\1\6\2\uffff\1\7\6\uffff\1\11\15\uffff\1\13\25\uffff\1\12\25\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5",
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

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "3992:2: ( ( ( (lv_e_0_0= ruleE5Rule ) ) otherlv_1= '&&' ( (lv_e_2_0= ruleE4Rule ) ) ) | ( ( (lv_e_3_0= ruleE5Rule ) ) otherlv_4= '||' ( (lv_e_5_0= ruleE4Rule ) ) ) | ( ( (lv_e_6_0= ruleE5Rule ) ) otherlv_7= '&' ( (lv_e_8_0= ruleE4Rule ) ) ) | ( ( (lv_e_9_0= ruleE5Rule ) ) otherlv_10= '|' ( (lv_e_11_0= ruleE4Rule ) ) ) | ( ( (lv_e_12_0= ruleE5Rule ) ) otherlv_13= '^' ( (lv_e_14_0= ruleE4Rule ) ) ) | ( (lv_e_15_0= ruleE5Rule ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_1 = input.LA(1);

                         
                        int index60_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA60_2 = input.LA(1);

                         
                        int index60_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA60_3 = input.LA(1);

                         
                        int index60_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA60_4 = input.LA(1);

                         
                        int index60_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA60_5 = input.LA(1);

                         
                        int index60_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA60_6 = input.LA(1);

                         
                        int index60_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA60_7 = input.LA(1);

                         
                        int index60_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA60_8 = input.LA(1);

                         
                        int index60_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA60_9 = input.LA(1);

                         
                        int index60_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA60_10 = input.LA(1);

                         
                        int index60_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA60_11 = input.LA(1);

                         
                        int index60_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalUclid()) ) {s = 12;}

                        else if ( (synpred83_InternalUclid()) ) {s = 13;}

                        else if ( (synpred84_InternalUclid()) ) {s = 14;}

                        else if ( (synpred85_InternalUclid()) ) {s = 15;}

                        else if ( (synpred86_InternalUclid()) ) {s = 16;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index60_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\13\uffff";
    static final String dfa_14s = "\1\4\10\0\2\uffff";
    static final String dfa_15s = "\1\117\10\0\2\uffff";
    static final String dfa_16s = "\11\uffff\1\1\1\2";
    static final String dfa_17s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\2\uffff}>";
    static final String[] dfa_18s = {
            "\1\5\1\3\2\uffff\1\4\6\uffff\1\6\15\uffff\1\10\25\uffff\1\7\32\uffff\1\1\1\2",
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

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "4682:2: ( (this_E12Rule_0= ruleE12Rule otherlv_1= '[' ( (lv_l_2_0= ruleExprListRule ) ) ( (otherlv_3= '->' ( (lv_e_4_0= ruleExprRule ) ) ) | (otherlv_5= ':' ( (lv_e_6_0= ruleExprRule ) ) ) )? otherlv_7= ']' ) | this_E12Rule_8= ruleE12Rule )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_1 = input.LA(1);

                         
                        int index69_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalUclid()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index69_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalUclid()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalUclid()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_4 = input.LA(1);

                         
                        int index69_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalUclid()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index69_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalUclid()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalUclid()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalUclid()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalUclid()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA108 extends DFA {

        public DFA108(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 108;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3857:6: (lv_q_2_1= ruleE2Rule | lv_q_2_2= ruleE3Rule )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA108_1 = input.LA(1);

                         
                        int index108_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA108_2 = input.LA(1);

                         
                        int index108_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA108_3 = input.LA(1);

                         
                        int index108_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA108_4 = input.LA(1);

                         
                        int index108_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA108_5 = input.LA(1);

                         
                        int index108_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA108_6 = input.LA(1);

                         
                        int index108_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA108_7 = input.LA(1);

                         
                        int index108_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA108_8 = input.LA(1);

                         
                        int index108_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA108_9 = input.LA(1);

                         
                        int index108_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA108_10 = input.LA(1);

                         
                        int index108_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA108_11 = input.LA(1);

                         
                        int index108_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index108_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 108, _s, input);
            error(nvae);
            throw nvae;
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "3938:6: (lv_e_2_1= ruleE3Rule | lv_e_2_2= ruleE4Rule )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_1 = input.LA(1);

                         
                        int index109_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA109_2 = input.LA(1);

                         
                        int index109_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA109_3 = input.LA(1);

                         
                        int index109_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA109_4 = input.LA(1);

                         
                        int index109_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA109_5 = input.LA(1);

                         
                        int index109_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA109_6 = input.LA(1);

                         
                        int index109_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA109_7 = input.LA(1);

                         
                        int index109_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA109_8 = input.LA(1);

                         
                        int index109_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA109_9 = input.LA(1);

                         
                        int index109_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA109_10 = input.LA(1);

                         
                        int index109_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA109_11 = input.LA(1);

                         
                        int index109_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred80_InternalUclid()) ) {s = 12;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index109_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000FE19DA30000L,0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000000008090L,0x00000000000F0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000020008130L,0x000000000000CE00L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001E00008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008000060008130L,0x000000000000CE00L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0928F89E01018010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0928F89E00018010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0005000000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00C8000020008130L,0x000000000000CE00L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000031E00008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0009000020008130L,0x000000000000CE00L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x6000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0002000000400000L,0x0000000000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000002010000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000010010L,0x00000001FFE00000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000010L,0x00000001FFE00000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0001000020100000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000020100000L});

}