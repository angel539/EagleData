package eagledata.core.dsl.rule.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eagledata.core.dsl.rule.services.RuleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SETOPERATOR", "RULE_SELECTOPERATOR", "RULE_LOGICALOPERATOR", "RULE_INT", "RULE_DOUBLE", "RULE_OPERATOR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'='", "'('", "'on'", "'{'", "'}'", "'do'", "','", "')'", "':'", "'select'", "'*'", "'.'", "'where'", "'when'"
    };
    public static final int RULE_SELECTOPERATOR=6;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_DOUBLE=9;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_LOGICALOPERATOR=7;
    public static final int RULE_OPERATOR=10;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SETOPERATOR=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRuleDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRuleDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRuleDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRuleDsl.g"; }



     	private RuleDslGrammarAccess grammarAccess;

        public InternalRuleDslParser(TokenStream input, RuleDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RuleModel";
       	}

       	@Override
       	protected RuleDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRuleModel"
    // InternalRuleDsl.g:64:1: entryRuleRuleModel returns [EObject current=null] : iv_ruleRuleModel= ruleRuleModel EOF ;
    public final EObject entryRuleRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleModel = null;


        try {
            // InternalRuleDsl.g:64:50: (iv_ruleRuleModel= ruleRuleModel EOF )
            // InternalRuleDsl.g:65:2: iv_ruleRuleModel= ruleRuleModel EOF
            {
             newCompositeNode(grammarAccess.getRuleModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleModel=ruleRuleModel();

            state._fsp--;

             current =iv_ruleRuleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleModel"


    // $ANTLR start "ruleRuleModel"
    // InternalRuleDsl.g:71:1: ruleRuleModel returns [EObject current=null] : ( ( (lv_elements_0_0= ruleRuleElement ) ) ( (lv_elements_1_0= ruleRuleElement ) )* )? ;
    public final EObject ruleRuleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;

        EObject lv_elements_1_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:77:2: ( ( ( (lv_elements_0_0= ruleRuleElement ) ) ( (lv_elements_1_0= ruleRuleElement ) )* )? )
            // InternalRuleDsl.g:78:2: ( ( (lv_elements_0_0= ruleRuleElement ) ) ( (lv_elements_1_0= ruleRuleElement ) )* )?
            {
            // InternalRuleDsl.g:78:2: ( ( (lv_elements_0_0= ruleRuleElement ) ) ( (lv_elements_1_0= ruleRuleElement ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRuleDsl.g:79:3: ( (lv_elements_0_0= ruleRuleElement ) ) ( (lv_elements_1_0= ruleRuleElement ) )*
                    {
                    // InternalRuleDsl.g:79:3: ( (lv_elements_0_0= ruleRuleElement ) )
                    // InternalRuleDsl.g:80:4: (lv_elements_0_0= ruleRuleElement )
                    {
                    // InternalRuleDsl.g:80:4: (lv_elements_0_0= ruleRuleElement )
                    // InternalRuleDsl.g:81:5: lv_elements_0_0= ruleRuleElement
                    {

                    					newCompositeNode(grammarAccess.getRuleModelAccess().getElementsRuleElementParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_elements_0_0=ruleRuleElement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRuleModelRule());
                    					}
                    					add(
                    						current,
                    						"elements",
                    						lv_elements_0_0,
                    						"eagledata.core.dsl.rule.RuleDsl.RuleElement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }

                    // InternalRuleDsl.g:98:3: ( (lv_elements_1_0= ruleRuleElement ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID||LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRuleDsl.g:99:4: (lv_elements_1_0= ruleRuleElement )
                    	    {
                    	    // InternalRuleDsl.g:99:4: (lv_elements_1_0= ruleRuleElement )
                    	    // InternalRuleDsl.g:100:5: lv_elements_1_0= ruleRuleElement
                    	    {

                    	    					newCompositeNode(grammarAccess.getRuleModelAccess().getElementsRuleElementParserRuleCall_1_0());
                    	    				
                    	    pushFollow(FOLLOW_3);
                    	    lv_elements_1_0=ruleRuleElement();

                    	    state._fsp--;


                    	    					if (current==null) {
                    	    						current = createModelElementForParent(grammarAccess.getRuleModelRule());
                    	    					}
                    	    					add(
                    	    						current,
                    	    						"elements",
                    	    						lv_elements_1_0,
                    	    						"eagledata.core.dsl.rule.RuleDsl.RuleElement");
                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleModel"


    // $ANTLR start "entryRuleRuleElement"
    // InternalRuleDsl.g:121:1: entryRuleRuleElement returns [EObject current=null] : iv_ruleRuleElement= ruleRuleElement EOF ;
    public final EObject entryRuleRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleElement = null;


        try {
            // InternalRuleDsl.g:121:52: (iv_ruleRuleElement= ruleRuleElement EOF )
            // InternalRuleDsl.g:122:2: iv_ruleRuleElement= ruleRuleElement EOF
            {
             newCompositeNode(grammarAccess.getRuleElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleElement=ruleRuleElement();

            state._fsp--;

             current =iv_ruleRuleElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleElement"


    // $ANTLR start "ruleRuleElement"
    // InternalRuleDsl.g:128:1: ruleRuleElement returns [EObject current=null] : (this_Query_0= ruleQuery | this_Rule_1= ruleRule ) ;
    public final EObject ruleRuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Query_0 = null;

        EObject this_Rule_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:134:2: ( (this_Query_0= ruleQuery | this_Rule_1= ruleRule ) )
            // InternalRuleDsl.g:135:2: (this_Query_0= ruleQuery | this_Rule_1= ruleRule )
            {
            // InternalRuleDsl.g:135:2: (this_Query_0= ruleQuery | this_Rule_1= ruleRule )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRuleDsl.g:136:3: this_Query_0= ruleQuery
                    {

                    			newCompositeNode(grammarAccess.getRuleElementAccess().getQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Query_0=ruleQuery();

                    state._fsp--;


                    			current = this_Query_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:145:3: this_Rule_1= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getRuleElementAccess().getRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_1=ruleRule();

                    state._fsp--;


                    			current = this_Rule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleElement"


    // $ANTLR start "entryRuleRule"
    // InternalRuleDsl.g:157:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRuleDsl.g:157:45: (iv_ruleRule= ruleRule EOF )
            // InternalRuleDsl.g:158:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRuleDsl.g:164:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' ( (lv_condition_7_0= ruleWhen ) )? otherlv_8= '}' )? otherlv_9= 'do' ( ( (lv_actions_10_0= ruleQuery ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleQuery ) ) )* ) otherlv_13= ')' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_condition_7_0 = null;

        EObject lv_actions_10_0 = null;

        EObject lv_actions_12_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:170:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' ( (lv_condition_7_0= ruleWhen ) )? otherlv_8= '}' )? otherlv_9= 'do' ( ( (lv_actions_10_0= ruleQuery ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleQuery ) ) )* ) otherlv_13= ')' ) )
            // InternalRuleDsl.g:171:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' ( (lv_condition_7_0= ruleWhen ) )? otherlv_8= '}' )? otherlv_9= 'do' ( ( (lv_actions_10_0= ruleQuery ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleQuery ) ) )* ) otherlv_13= ')' )
            {
            // InternalRuleDsl.g:171:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' ( (lv_condition_7_0= ruleWhen ) )? otherlv_8= '}' )? otherlv_9= 'do' ( ( (lv_actions_10_0= ruleQuery ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleQuery ) ) )* ) otherlv_13= ')' )
            // InternalRuleDsl.g:172:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' otherlv_4= 'on' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '{' ( (lv_condition_7_0= ruleWhen ) )? otherlv_8= '}' )? otherlv_9= 'do' ( ( (lv_actions_10_0= ruleQuery ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleQuery ) ) )* ) otherlv_13= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
            		
            // InternalRuleDsl.g:176:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalRuleDsl.g:177:4: (lv_name_1_0= RULE_ID )
            {
            // InternalRuleDsl.g:177:4: (lv_name_1_0= RULE_ID )
            // InternalRuleDsl.g:178:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getOnKeyword_4());
            		
            // InternalRuleDsl.g:206:3: ( (otherlv_5= RULE_ID ) )
            // InternalRuleDsl.g:207:4: (otherlv_5= RULE_ID )
            {
            // InternalRuleDsl.g:207:4: (otherlv_5= RULE_ID )
            // InternalRuleDsl.g:208:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getEventPhraseCrossReference_5_0());
            				

            }


            }

            // InternalRuleDsl.g:219:3: (otherlv_6= '{' ( (lv_condition_7_0= ruleWhen ) )? otherlv_8= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRuleDsl.g:220:4: otherlv_6= '{' ( (lv_condition_7_0= ruleWhen ) )? otherlv_8= '}'
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_6_0());
                    			
                    // InternalRuleDsl.g:224:4: ( (lv_condition_7_0= ruleWhen ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==30) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalRuleDsl.g:225:5: (lv_condition_7_0= ruleWhen )
                            {
                            // InternalRuleDsl.g:225:5: (lv_condition_7_0= ruleWhen )
                            // InternalRuleDsl.g:226:6: lv_condition_7_0= ruleWhen
                            {

                            						newCompositeNode(grammarAccess.getRuleAccess().getConditionWhenParserRuleCall_6_1_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_condition_7_0=ruleWhen();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getRuleRule());
                            						}
                            						set(
                            							current,
                            							"condition",
                            							lv_condition_7_0,
                            							"eagledata.core.dsl.rule.RuleDsl.When");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6_2());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getDoKeyword_7());
            		
            // InternalRuleDsl.g:252:3: ( ( (lv_actions_10_0= ruleQuery ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleQuery ) ) )* )
            // InternalRuleDsl.g:253:4: ( (lv_actions_10_0= ruleQuery ) ) (otherlv_11= ',' ( (lv_actions_12_0= ruleQuery ) ) )*
            {
            // InternalRuleDsl.g:253:4: ( (lv_actions_10_0= ruleQuery ) )
            // InternalRuleDsl.g:254:5: (lv_actions_10_0= ruleQuery )
            {
            // InternalRuleDsl.g:254:5: (lv_actions_10_0= ruleQuery )
            // InternalRuleDsl.g:255:6: lv_actions_10_0= ruleQuery
            {

            						newCompositeNode(grammarAccess.getRuleAccess().getActionsQueryParserRuleCall_8_0_0());
            					
            pushFollow(FOLLOW_12);
            lv_actions_10_0=ruleQuery();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRuleRule());
            						}
            						add(
            							current,
            							"actions",
            							lv_actions_10_0,
            							"eagledata.core.dsl.rule.RuleDsl.Query");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRuleDsl.g:272:4: (otherlv_11= ',' ( (lv_actions_12_0= ruleQuery ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRuleDsl.g:273:5: otherlv_11= ',' ( (lv_actions_12_0= ruleQuery ) )
            	    {
            	    otherlv_11=(Token)match(input,23,FOLLOW_4); 

            	    					newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getCommaKeyword_8_1_0());
            	    				
            	    // InternalRuleDsl.g:277:5: ( (lv_actions_12_0= ruleQuery ) )
            	    // InternalRuleDsl.g:278:6: (lv_actions_12_0= ruleQuery )
            	    {
            	    // InternalRuleDsl.g:278:6: (lv_actions_12_0= ruleQuery )
            	    // InternalRuleDsl.g:279:7: lv_actions_12_0= ruleQuery
            	    {

            	    							newCompositeNode(grammarAccess.getRuleAccess().getActionsQueryParserRuleCall_8_1_1_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_actions_12_0=ruleQuery();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRuleRule());
            	    							}
            	    							add(
            	    								current,
            	    								"actions",
            	    								lv_actions_12_0,
            	    								"eagledata.core.dsl.rule.RuleDsl.Query");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            otherlv_13=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRuleAccess().getRightParenthesisKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleQuery"
    // InternalRuleDsl.g:306:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalRuleDsl.g:306:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalRuleDsl.g:307:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalRuleDsl.g:313:1: ruleQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) (otherlv_3= '{' ( (lv_where_4_0= ruleWhere ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_select_2_0 = null;

        EObject lv_where_4_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:319:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) (otherlv_3= '{' ( (lv_where_4_0= ruleWhere ) ) otherlv_5= '}' )? ) )
            // InternalRuleDsl.g:320:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) (otherlv_3= '{' ( (lv_where_4_0= ruleWhere ) ) otherlv_5= '}' )? )
            {
            // InternalRuleDsl.g:320:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) (otherlv_3= '{' ( (lv_where_4_0= ruleWhere ) ) otherlv_5= '}' )? )
            // InternalRuleDsl.g:321:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) (otherlv_3= '{' ( (lv_where_4_0= ruleWhere ) ) otherlv_5= '}' )?
            {
            // InternalRuleDsl.g:321:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRuleDsl.g:322:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRuleDsl.g:322:4: (lv_name_0_0= RULE_ID )
            // InternalRuleDsl.g:323:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_0_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getColonKeyword_1());
            		
            // InternalRuleDsl.g:343:3: ( (lv_select_2_0= ruleSelect ) )
            // InternalRuleDsl.g:344:4: (lv_select_2_0= ruleSelect )
            {
            // InternalRuleDsl.g:344:4: (lv_select_2_0= ruleSelect )
            // InternalRuleDsl.g:345:5: lv_select_2_0= ruleSelect
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getSelectSelectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_select_2_0=ruleSelect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"select",
            						lv_select_2_0,
            						"eagledata.core.dsl.rule.RuleDsl.Select");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRuleDsl.g:362:3: (otherlv_3= '{' ( (lv_where_4_0= ruleWhere ) ) otherlv_5= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRuleDsl.g:363:4: otherlv_3= '{' ( (lv_where_4_0= ruleWhere ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalRuleDsl.g:367:4: ( (lv_where_4_0= ruleWhere ) )
                    // InternalRuleDsl.g:368:5: (lv_where_4_0= ruleWhere )
                    {
                    // InternalRuleDsl.g:368:5: (lv_where_4_0= ruleWhere )
                    // InternalRuleDsl.g:369:6: lv_where_4_0= ruleWhere
                    {

                    						newCompositeNode(grammarAccess.getQueryAccess().getWhereWhereParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_where_4_0=ruleWhere();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryRule());
                    						}
                    						set(
                    							current,
                    							"where",
                    							lv_where_4_0,
                    							"eagledata.core.dsl.rule.RuleDsl.Where");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleSelect"
    // InternalRuleDsl.g:395:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalRuleDsl.g:395:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalRuleDsl.g:396:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalRuleDsl.g:402:1: ruleSelect returns [EObject current=null] : (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        EObject this_AddingSelect_0 = null;

        EObject this_SetSelect_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:408:2: ( (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect ) )
            // InternalRuleDsl.g:409:2: (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect )
            {
            // InternalRuleDsl.g:409:2: (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_SELECTOPERATOR) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRuleDsl.g:410:3: this_AddingSelect_0= ruleAddingSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectAccess().getAddingSelectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddingSelect_0=ruleAddingSelect();

                    state._fsp--;


                    			current = this_AddingSelect_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:419:3: this_SetSelect_1= ruleSetSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectAccess().getSetSelectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetSelect_1=ruleSetSelect();

                    state._fsp--;


                    			current = this_SetSelect_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleSetSelect"
    // InternalRuleDsl.g:431:1: entryRuleSetSelect returns [EObject current=null] : iv_ruleSetSelect= ruleSetSelect EOF ;
    public final EObject entryRuleSetSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetSelect = null;


        try {
            // InternalRuleDsl.g:431:50: (iv_ruleSetSelect= ruleSetSelect EOF )
            // InternalRuleDsl.g:432:2: iv_ruleSetSelect= ruleSetSelect EOF
            {
             newCompositeNode(grammarAccess.getSetSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetSelect=ruleSetSelect();

            state._fsp--;

             current =iv_ruleSetSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSetSelect"


    // $ANTLR start "ruleSetSelect"
    // InternalRuleDsl.g:438:1: ruleSetSelect returns [EObject current=null] : ( () otherlv_1= 'select' ( ( ( (lv_selection_2_0= ruleSelection ) ) (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )* )? | ( (lv_all_5_0= '*' ) ) ) ( ( (lv_operator_6_0= RULE_SETOPERATOR ) ) ( (lv_select_7_0= ruleSetSelect ) ) )? ) ;
    public final EObject ruleSetSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_all_5_0=null;
        Token lv_operator_6_0=null;
        EObject lv_selection_2_0 = null;

        EObject lv_selection_4_0 = null;

        EObject lv_select_7_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:444:2: ( ( () otherlv_1= 'select' ( ( ( (lv_selection_2_0= ruleSelection ) ) (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )* )? | ( (lv_all_5_0= '*' ) ) ) ( ( (lv_operator_6_0= RULE_SETOPERATOR ) ) ( (lv_select_7_0= ruleSetSelect ) ) )? ) )
            // InternalRuleDsl.g:445:2: ( () otherlv_1= 'select' ( ( ( (lv_selection_2_0= ruleSelection ) ) (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )* )? | ( (lv_all_5_0= '*' ) ) ) ( ( (lv_operator_6_0= RULE_SETOPERATOR ) ) ( (lv_select_7_0= ruleSetSelect ) ) )? )
            {
            // InternalRuleDsl.g:445:2: ( () otherlv_1= 'select' ( ( ( (lv_selection_2_0= ruleSelection ) ) (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )* )? | ( (lv_all_5_0= '*' ) ) ) ( ( (lv_operator_6_0= RULE_SETOPERATOR ) ) ( (lv_select_7_0= ruleSetSelect ) ) )? )
            // InternalRuleDsl.g:446:3: () otherlv_1= 'select' ( ( ( (lv_selection_2_0= ruleSelection ) ) (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )* )? | ( (lv_all_5_0= '*' ) ) ) ( ( (lv_operator_6_0= RULE_SETOPERATOR ) ) ( (lv_select_7_0= ruleSetSelect ) ) )?
            {
            // InternalRuleDsl.g:446:3: ()
            // InternalRuleDsl.g:447:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetSelectAccess().getSetSelectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getSetSelectAccess().getSelectKeyword_1());
            		
            // InternalRuleDsl.g:457:3: ( ( ( (lv_selection_2_0= ruleSelection ) ) (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )* )? | ( (lv_all_5_0= '*' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EOF||(LA11_0>=RULE_ID && LA11_0<=RULE_SETOPERATOR)||LA11_0==16||LA11_0==20||(LA11_0>=23 && LA11_0<=24)) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRuleDsl.g:458:4: ( ( (lv_selection_2_0= ruleSelection ) ) (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )* )?
                    {
                    // InternalRuleDsl.g:458:4: ( ( (lv_selection_2_0= ruleSelection ) ) (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==EOF||(LA10_1>=RULE_ID && LA10_1<=RULE_SETOPERATOR)||LA10_1==16||LA10_1==20||(LA10_1>=23 && LA10_1<=24)||LA10_1==28) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRuleDsl.g:459:5: ( (lv_selection_2_0= ruleSelection ) ) (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )*
                            {
                            // InternalRuleDsl.g:459:5: ( (lv_selection_2_0= ruleSelection ) )
                            // InternalRuleDsl.g:460:6: (lv_selection_2_0= ruleSelection )
                            {
                            // InternalRuleDsl.g:460:6: (lv_selection_2_0= ruleSelection )
                            // InternalRuleDsl.g:461:7: lv_selection_2_0= ruleSelection
                            {

                            							newCompositeNode(grammarAccess.getSetSelectAccess().getSelectionSelectionParserRuleCall_2_0_0_0());
                            						
                            pushFollow(FOLLOW_18);
                            lv_selection_2_0=ruleSelection();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSetSelectRule());
                            							}
                            							add(
                            								current,
                            								"selection",
                            								lv_selection_2_0,
                            								"eagledata.core.dsl.rule.RuleDsl.Selection");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalRuleDsl.g:478:5: (otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==23) ) {
                                    int LA9_2 = input.LA(2);

                                    if ( (LA9_2==RULE_ID) ) {
                                        int LA9_3 = input.LA(3);

                                        if ( (LA9_3==EOF||(LA9_3>=RULE_ID && LA9_3<=RULE_SETOPERATOR)||LA9_3==16||LA9_3==20||(LA9_3>=23 && LA9_3<=24)||LA9_3==28) ) {
                                            alt9=1;
                                        }


                                    }


                                }


                                switch (alt9) {
                            	case 1 :
                            	    // InternalRuleDsl.g:479:6: otherlv_3= ',' ( (lv_selection_4_0= ruleSelection ) )
                            	    {
                            	    otherlv_3=(Token)match(input,23,FOLLOW_4); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getSetSelectAccess().getCommaKeyword_2_0_1_0());
                            	    					
                            	    // InternalRuleDsl.g:483:6: ( (lv_selection_4_0= ruleSelection ) )
                            	    // InternalRuleDsl.g:484:7: (lv_selection_4_0= ruleSelection )
                            	    {
                            	    // InternalRuleDsl.g:484:7: (lv_selection_4_0= ruleSelection )
                            	    // InternalRuleDsl.g:485:8: lv_selection_4_0= ruleSelection
                            	    {

                            	    								newCompositeNode(grammarAccess.getSetSelectAccess().getSelectionSelectionParserRuleCall_2_0_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_18);
                            	    lv_selection_4_0=ruleSelection();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSetSelectRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"selection",
                            	    									lv_selection_4_0,
                            	    									"eagledata.core.dsl.rule.RuleDsl.Selection");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:505:4: ( (lv_all_5_0= '*' ) )
                    {
                    // InternalRuleDsl.g:505:4: ( (lv_all_5_0= '*' ) )
                    // InternalRuleDsl.g:506:5: (lv_all_5_0= '*' )
                    {
                    // InternalRuleDsl.g:506:5: (lv_all_5_0= '*' )
                    // InternalRuleDsl.g:507:6: lv_all_5_0= '*'
                    {
                    lv_all_5_0=(Token)match(input,27,FOLLOW_19); 

                    						newLeafNode(lv_all_5_0, grammarAccess.getSetSelectAccess().getAllAsteriskKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetSelectRule());
                    						}
                    						setWithLastConsumed(current, "all", true, "*");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRuleDsl.g:520:3: ( ( (lv_operator_6_0= RULE_SETOPERATOR ) ) ( (lv_select_7_0= ruleSetSelect ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SETOPERATOR) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRuleDsl.g:521:4: ( (lv_operator_6_0= RULE_SETOPERATOR ) ) ( (lv_select_7_0= ruleSetSelect ) )
                    {
                    // InternalRuleDsl.g:521:4: ( (lv_operator_6_0= RULE_SETOPERATOR ) )
                    // InternalRuleDsl.g:522:5: (lv_operator_6_0= RULE_SETOPERATOR )
                    {
                    // InternalRuleDsl.g:522:5: (lv_operator_6_0= RULE_SETOPERATOR )
                    // InternalRuleDsl.g:523:6: lv_operator_6_0= RULE_SETOPERATOR
                    {
                    lv_operator_6_0=(Token)match(input,RULE_SETOPERATOR,FOLLOW_14); 

                    						newLeafNode(lv_operator_6_0, grammarAccess.getSetSelectAccess().getOperatorSETOPERATORTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetSelectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"operator",
                    							lv_operator_6_0,
                    							"eagledata.core.dsl.rule.RuleDsl.SETOPERATOR");
                    					

                    }


                    }

                    // InternalRuleDsl.g:539:4: ( (lv_select_7_0= ruleSetSelect ) )
                    // InternalRuleDsl.g:540:5: (lv_select_7_0= ruleSetSelect )
                    {
                    // InternalRuleDsl.g:540:5: (lv_select_7_0= ruleSetSelect )
                    // InternalRuleDsl.g:541:6: lv_select_7_0= ruleSetSelect
                    {

                    						newCompositeNode(grammarAccess.getSetSelectAccess().getSelectSetSelectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_select_7_0=ruleSetSelect();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetSelectRule());
                    						}
                    						set(
                    							current,
                    							"select",
                    							lv_select_7_0,
                    							"eagledata.core.dsl.rule.RuleDsl.SetSelect");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSetSelect"


    // $ANTLR start "entryRuleSelection"
    // InternalRuleDsl.g:563:1: entryRuleSelection returns [EObject current=null] : iv_ruleSelection= ruleSelection EOF ;
    public final EObject entryRuleSelection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelection = null;


        try {
            // InternalRuleDsl.g:563:50: (iv_ruleSelection= ruleSelection EOF )
            // InternalRuleDsl.g:564:2: iv_ruleSelection= ruleSelection EOF
            {
             newCompositeNode(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelection=ruleSelection();

            state._fsp--;

             current =iv_ruleSelection; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalRuleDsl.g:570:1: ruleSelection returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* ) ) ;
    public final EObject ruleSelection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:576:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* ) ) )
            // InternalRuleDsl.g:577:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* ) )
            {
            // InternalRuleDsl.g:577:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* ) )
            // InternalRuleDsl.g:578:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )? ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* )
            {
            // InternalRuleDsl.g:578:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==28) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==RULE_ID) ) {
                        alt13=1;
                    }
                }
            }
            switch (alt13) {
                case 1 :
                    // InternalRuleDsl.g:579:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.'
                    {
                    // InternalRuleDsl.g:579:4: ( (otherlv_0= RULE_ID ) )
                    // InternalRuleDsl.g:580:5: (otherlv_0= RULE_ID )
                    {
                    // InternalRuleDsl.g:580:5: (otherlv_0= RULE_ID )
                    // InternalRuleDsl.g:581:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectionRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_0, grammarAccess.getSelectionAccess().getSelectorConceptCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getSelectionAccess().getFullStopKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalRuleDsl.g:597:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalRuleDsl.g:598:4: ( (otherlv_2= RULE_ID ) ) (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalRuleDsl.g:598:4: ( (otherlv_2= RULE_ID ) )
            // InternalRuleDsl.g:599:5: (otherlv_2= RULE_ID )
            {
            // InternalRuleDsl.g:599:5: (otherlv_2= RULE_ID )
            // InternalRuleDsl.g:600:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getSelectionRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_21); 

            						newLeafNode(otherlv_2, grammarAccess.getSelectionAccess().getRootConceptCrossReference_1_0_0());
            					

            }


            }

            // InternalRuleDsl.g:611:4: (otherlv_3= '.' ( (otherlv_4= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRuleDsl.g:612:5: otherlv_3= '.' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getSelectionAccess().getFullStopKeyword_1_1_0());
            	    				
            	    // InternalRuleDsl.g:616:5: ( (otherlv_4= RULE_ID ) )
            	    // InternalRuleDsl.g:617:6: (otherlv_4= RULE_ID )
            	    {
            	    // InternalRuleDsl.g:617:6: (otherlv_4= RULE_ID )
            	    // InternalRuleDsl.g:618:7: otherlv_4= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSelectionRule());
            	    							}
            	    						
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    							newLeafNode(otherlv_4, grammarAccess.getSelectionAccess().getRootConceptCrossReference_1_1_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleAddingSelect"
    // InternalRuleDsl.g:635:1: entryRuleAddingSelect returns [EObject current=null] : iv_ruleAddingSelect= ruleAddingSelect EOF ;
    public final EObject entryRuleAddingSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddingSelect = null;


        try {
            // InternalRuleDsl.g:635:53: (iv_ruleAddingSelect= ruleAddingSelect EOF )
            // InternalRuleDsl.g:636:2: iv_ruleAddingSelect= ruleAddingSelect EOF
            {
             newCompositeNode(grammarAccess.getAddingSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddingSelect=ruleAddingSelect();

            state._fsp--;

             current =iv_ruleAddingSelect; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddingSelect"


    // $ANTLR start "ruleAddingSelect"
    // InternalRuleDsl.g:642:1: ruleAddingSelect returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) ) ;
    public final EObject ruleAddingSelect() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token otherlv_1=null;
        Token lv_all_2_0=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:648:2: ( ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) ) )
            // InternalRuleDsl.g:649:2: ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) )
            {
            // InternalRuleDsl.g:649:2: ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) )
            // InternalRuleDsl.g:650:3: ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) )
            {
            // InternalRuleDsl.g:650:3: ( (lv_operation_0_0= RULE_SELECTOPERATOR ) )
            // InternalRuleDsl.g:651:4: (lv_operation_0_0= RULE_SELECTOPERATOR )
            {
            // InternalRuleDsl.g:651:4: (lv_operation_0_0= RULE_SELECTOPERATOR )
            // InternalRuleDsl.g:652:5: lv_operation_0_0= RULE_SELECTOPERATOR
            {
            lv_operation_0_0=(Token)match(input,RULE_SELECTOPERATOR,FOLLOW_22); 

            					newLeafNode(lv_operation_0_0, grammarAccess.getAddingSelectAccess().getOperationSELECTOPERATORTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddingSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operation",
            						lv_operation_0_0,
            						"eagledata.core.dsl.rule.RuleDsl.SELECTOPERATOR");
            				

            }


            }

            // InternalRuleDsl.g:668:3: ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EOF||LA16_0==RULE_ID||LA16_0==16||LA16_0==20||(LA16_0>=23 && LA16_0<=24)) ) {
                alt16=1;
            }
            else if ( (LA16_0==27) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRuleDsl.g:669:4: ( (otherlv_1= RULE_ID ) )?
                    {
                    // InternalRuleDsl.g:669:4: ( (otherlv_1= RULE_ID ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==EOF||LA15_1==RULE_ID||LA15_1==16||LA15_1==20||(LA15_1>=23 && LA15_1<=24)) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalRuleDsl.g:670:5: (otherlv_1= RULE_ID )
                            {
                            // InternalRuleDsl.g:670:5: (otherlv_1= RULE_ID )
                            // InternalRuleDsl.g:671:6: otherlv_1= RULE_ID
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAddingSelectRule());
                            						}
                            					
                            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                            						newLeafNode(otherlv_1, grammarAccess.getAddingSelectAccess().getElementConceptCrossReference_1_0_0());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:683:4: ( (lv_all_2_0= '*' ) )
                    {
                    // InternalRuleDsl.g:683:4: ( (lv_all_2_0= '*' ) )
                    // InternalRuleDsl.g:684:5: (lv_all_2_0= '*' )
                    {
                    // InternalRuleDsl.g:684:5: (lv_all_2_0= '*' )
                    // InternalRuleDsl.g:685:6: lv_all_2_0= '*'
                    {
                    lv_all_2_0=(Token)match(input,27,FOLLOW_2); 

                    						newLeafNode(lv_all_2_0, grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddingSelectRule());
                    						}
                    						setWithLastConsumed(current, "all", true, "*");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddingSelect"


    // $ANTLR start "entryRuleWhere"
    // InternalRuleDsl.g:702:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalRuleDsl.g:702:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalRuleDsl.g:703:2: iv_ruleWhere= ruleWhere EOF
            {
             newCompositeNode(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhere=ruleWhere();

            state._fsp--;

             current =iv_ruleWhere; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalRuleDsl.g:709:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) ) ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_logicalOperator_2_0=null;
        Token otherlv_3=null;
        Token lv_right_4_0=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:715:2: ( (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) ) ) )
            // InternalRuleDsl.g:716:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) ) )
            {
            // InternalRuleDsl.g:716:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) ) )
            // InternalRuleDsl.g:717:3: otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalRuleDsl.g:721:3: ( (otherlv_1= RULE_ID ) )
            // InternalRuleDsl.g:722:4: (otherlv_1= RULE_ID )
            {
            // InternalRuleDsl.g:722:4: (otherlv_1= RULE_ID )
            // InternalRuleDsl.g:723:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getWhereAccess().getLeftConceptCrossReference_1_0());
            				

            }


            }

            // InternalRuleDsl.g:734:3: ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) )
            // InternalRuleDsl.g:735:4: (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR )
            {
            // InternalRuleDsl.g:735:4: (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR )
            // InternalRuleDsl.g:736:5: lv_logicalOperator_2_0= RULE_LOGICALOPERATOR
            {
            lv_logicalOperator_2_0=(Token)match(input,RULE_LOGICALOPERATOR,FOLLOW_24); 

            					newLeafNode(lv_logicalOperator_2_0, grammarAccess.getWhereAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logicalOperator",
            						lv_logicalOperator_2_0,
            						"eagledata.core.dsl.rule.RuleDsl.LOGICALOPERATOR");
            				

            }


            }

            // InternalRuleDsl.g:752:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_INT) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRuleDsl.g:753:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalRuleDsl.g:753:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRuleDsl.g:754:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRuleDsl.g:754:5: (otherlv_3= RULE_ID )
                    // InternalRuleDsl.g:755:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getWhereAccess().getRightVariableConceptCrossReference_3_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:767:4: ( (lv_right_4_0= RULE_INT ) )
                    {
                    // InternalRuleDsl.g:767:4: ( (lv_right_4_0= RULE_INT ) )
                    // InternalRuleDsl.g:768:5: (lv_right_4_0= RULE_INT )
                    {
                    // InternalRuleDsl.g:768:5: (lv_right_4_0= RULE_INT )
                    // InternalRuleDsl.g:769:6: lv_right_4_0= RULE_INT
                    {
                    lv_right_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_right_4_0, grammarAccess.getWhereAccess().getRightINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"right",
                    							lv_right_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleWhen"
    // InternalRuleDsl.g:790:1: entryRuleWhen returns [EObject current=null] : iv_ruleWhen= ruleWhen EOF ;
    public final EObject entryRuleWhen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhen = null;


        try {
            // InternalRuleDsl.g:790:45: (iv_ruleWhen= ruleWhen EOF )
            // InternalRuleDsl.g:791:2: iv_ruleWhen= ruleWhen EOF
            {
             newCompositeNode(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhen=ruleWhen();

            state._fsp--;

             current =iv_ruleWhen; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalRuleDsl.g:797:1: ruleWhen returns [EObject current=null] : (otherlv_0= 'when' ( (lv_left_1_0= ruleExpression ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( (lv_right_3_0= ruleExpression ) ) ) ;
    public final EObject ruleWhen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_logicalOperator_2_0=null;
        EObject lv_left_1_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:803:2: ( (otherlv_0= 'when' ( (lv_left_1_0= ruleExpression ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( (lv_right_3_0= ruleExpression ) ) ) )
            // InternalRuleDsl.g:804:2: (otherlv_0= 'when' ( (lv_left_1_0= ruleExpression ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( (lv_right_3_0= ruleExpression ) ) )
            {
            // InternalRuleDsl.g:804:2: (otherlv_0= 'when' ( (lv_left_1_0= ruleExpression ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( (lv_right_3_0= ruleExpression ) ) )
            // InternalRuleDsl.g:805:3: otherlv_0= 'when' ( (lv_left_1_0= ruleExpression ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( (lv_right_3_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getWhenAccess().getWhenKeyword_0());
            		
            // InternalRuleDsl.g:809:3: ( (lv_left_1_0= ruleExpression ) )
            // InternalRuleDsl.g:810:4: (lv_left_1_0= ruleExpression )
            {
            // InternalRuleDsl.g:810:4: (lv_left_1_0= ruleExpression )
            // InternalRuleDsl.g:811:5: lv_left_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getLeftExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_left_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_1_0,
            						"eagledata.core.dsl.rule.RuleDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRuleDsl.g:828:3: ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) )
            // InternalRuleDsl.g:829:4: (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR )
            {
            // InternalRuleDsl.g:829:4: (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR )
            // InternalRuleDsl.g:830:5: lv_logicalOperator_2_0= RULE_LOGICALOPERATOR
            {
            lv_logicalOperator_2_0=(Token)match(input,RULE_LOGICALOPERATOR,FOLLOW_25); 

            					newLeafNode(lv_logicalOperator_2_0, grammarAccess.getWhenAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logicalOperator",
            						lv_logicalOperator_2_0,
            						"eagledata.core.dsl.rule.RuleDsl.LOGICALOPERATOR");
            				

            }


            }

            // InternalRuleDsl.g:846:3: ( (lv_right_3_0= ruleExpression ) )
            // InternalRuleDsl.g:847:4: (lv_right_3_0= ruleExpression )
            {
            // InternalRuleDsl.g:847:4: (lv_right_3_0= ruleExpression )
            // InternalRuleDsl.g:848:5: lv_right_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhenAccess().getRightExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhenRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"eagledata.core.dsl.rule.RuleDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleExpression"
    // InternalRuleDsl.g:869:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRuleDsl.g:869:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRuleDsl.g:870:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRuleDsl.g:876:1: ruleExpression returns [EObject current=null] : (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlainExpression_0 = null;

        EObject this_ComplexExpression_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:882:2: ( (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression ) )
            // InternalRuleDsl.g:883:2: (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression )
            {
            // InternalRuleDsl.g:883:2: (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_DOUBLE) ) {
                alt18=1;
            }
            else if ( (LA18_0==18) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRuleDsl.g:884:3: this_PlainExpression_0= rulePlainExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPlainExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlainExpression_0=rulePlainExpression();

                    state._fsp--;


                    			current = this_PlainExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:893:3: this_ComplexExpression_1= ruleComplexExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getComplexExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexExpression_1=ruleComplexExpression();

                    state._fsp--;


                    			current = this_ComplexExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlainExpression"
    // InternalRuleDsl.g:905:1: entryRulePlainExpression returns [EObject current=null] : iv_rulePlainExpression= rulePlainExpression EOF ;
    public final EObject entryRulePlainExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainExpression = null;


        try {
            // InternalRuleDsl.g:905:56: (iv_rulePlainExpression= rulePlainExpression EOF )
            // InternalRuleDsl.g:906:2: iv_rulePlainExpression= rulePlainExpression EOF
            {
             newCompositeNode(grammarAccess.getPlainExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlainExpression=rulePlainExpression();

            state._fsp--;

             current =iv_rulePlainExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlainExpression"


    // $ANTLR start "rulePlainExpression"
    // InternalRuleDsl.g:912:1: rulePlainExpression returns [EObject current=null] : ( (lv_plainOperand_0_0= rulePlainOperand ) ) ;
    public final EObject rulePlainExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_plainOperand_0_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:918:2: ( ( (lv_plainOperand_0_0= rulePlainOperand ) ) )
            // InternalRuleDsl.g:919:2: ( (lv_plainOperand_0_0= rulePlainOperand ) )
            {
            // InternalRuleDsl.g:919:2: ( (lv_plainOperand_0_0= rulePlainOperand ) )
            // InternalRuleDsl.g:920:3: (lv_plainOperand_0_0= rulePlainOperand )
            {
            // InternalRuleDsl.g:920:3: (lv_plainOperand_0_0= rulePlainOperand )
            // InternalRuleDsl.g:921:4: lv_plainOperand_0_0= rulePlainOperand
            {

            				newCompositeNode(grammarAccess.getPlainExpressionAccess().getPlainOperandPlainOperandParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_plainOperand_0_0=rulePlainOperand();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPlainExpressionRule());
            				}
            				set(
            					current,
            					"plainOperand",
            					lv_plainOperand_0_0,
            					"eagledata.core.dsl.rule.RuleDsl.PlainOperand");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlainExpression"


    // $ANTLR start "entryRuleComplexExpression"
    // InternalRuleDsl.g:941:1: entryRuleComplexExpression returns [EObject current=null] : iv_ruleComplexExpression= ruleComplexExpression EOF ;
    public final EObject entryRuleComplexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexExpression = null;


        try {
            // InternalRuleDsl.g:941:58: (iv_ruleComplexExpression= ruleComplexExpression EOF )
            // InternalRuleDsl.g:942:2: iv_ruleComplexExpression= ruleComplexExpression EOF
            {
             newCompositeNode(grammarAccess.getComplexExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexExpression=ruleComplexExpression();

            state._fsp--;

             current =iv_ruleComplexExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexExpression"


    // $ANTLR start "ruleComplexExpression"
    // InternalRuleDsl.g:948:1: ruleComplexExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleComplexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_plainOperand_1_0 = null;

        EObject lv_complexOperands_2_0 = null;

        EObject lv_complexOperands_3_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:954:2: ( (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' ) )
            // InternalRuleDsl.g:955:2: (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' )
            {
            // InternalRuleDsl.g:955:2: (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' )
            // InternalRuleDsl.g:956:3: otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRuleDsl.g:960:3: ( (lv_plainOperand_1_0= rulePlainOperand ) )
            // InternalRuleDsl.g:961:4: (lv_plainOperand_1_0= rulePlainOperand )
            {
            // InternalRuleDsl.g:961:4: (lv_plainOperand_1_0= rulePlainOperand )
            // InternalRuleDsl.g:962:5: lv_plainOperand_1_0= rulePlainOperand
            {

            					newCompositeNode(grammarAccess.getComplexExpressionAccess().getPlainOperandPlainOperandParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_plainOperand_1_0=rulePlainOperand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
            					}
            					set(
            						current,
            						"plainOperand",
            						lv_plainOperand_1_0,
            						"eagledata.core.dsl.rule.RuleDsl.PlainOperand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRuleDsl.g:979:3: ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_OPERATOR) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRuleDsl.g:980:4: ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )*
                    {
                    // InternalRuleDsl.g:980:4: ( (lv_complexOperands_2_0= ruleComplexOperand ) )
                    // InternalRuleDsl.g:981:5: (lv_complexOperands_2_0= ruleComplexOperand )
                    {
                    // InternalRuleDsl.g:981:5: (lv_complexOperands_2_0= ruleComplexOperand )
                    // InternalRuleDsl.g:982:6: lv_complexOperands_2_0= ruleComplexOperand
                    {

                    						newCompositeNode(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_complexOperands_2_0=ruleComplexOperand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    						}
                    						add(
                    							current,
                    							"complexOperands",
                    							lv_complexOperands_2_0,
                    							"eagledata.core.dsl.rule.RuleDsl.ComplexOperand");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRuleDsl.g:999:4: ( (lv_complexOperands_3_0= ruleComplexOperand ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_OPERATOR) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRuleDsl.g:1000:5: (lv_complexOperands_3_0= ruleComplexOperand )
                    	    {
                    	    // InternalRuleDsl.g:1000:5: (lv_complexOperands_3_0= ruleComplexOperand )
                    	    // InternalRuleDsl.g:1001:6: lv_complexOperands_3_0= ruleComplexOperand
                    	    {

                    	    						newCompositeNode(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_complexOperands_3_0=ruleComplexOperand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"complexOperands",
                    	    							lv_complexOperands_3_0,
                    	    							"eagledata.core.dsl.rule.RuleDsl.ComplexOperand");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexExpressionAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexExpression"


    // $ANTLR start "entryRulePlainOperand"
    // InternalRuleDsl.g:1027:1: entryRulePlainOperand returns [EObject current=null] : iv_rulePlainOperand= rulePlainOperand EOF ;
    public final EObject entryRulePlainOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainOperand = null;


        try {
            // InternalRuleDsl.g:1027:53: (iv_rulePlainOperand= rulePlainOperand EOF )
            // InternalRuleDsl.g:1028:2: iv_rulePlainOperand= rulePlainOperand EOF
            {
             newCompositeNode(grammarAccess.getPlainOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlainOperand=rulePlainOperand();

            state._fsp--;

             current =iv_rulePlainOperand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlainOperand"


    // $ANTLR start "rulePlainOperand"
    // InternalRuleDsl.g:1034:1: rulePlainOperand returns [EObject current=null] : (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand ) ;
    public final EObject rulePlainOperand() throws RecognitionException {
        EObject current = null;

        EObject this_Numeral_0 = null;

        EObject this_QueryOperand_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:1040:2: ( (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand ) )
            // InternalRuleDsl.g:1041:2: (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand )
            {
            // InternalRuleDsl.g:1041:2: (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DOUBLE) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalRuleDsl.g:1042:3: this_Numeral_0= ruleNumeral
                    {

                    			newCompositeNode(grammarAccess.getPlainOperandAccess().getNumeralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Numeral_0=ruleNumeral();

                    state._fsp--;


                    			current = this_Numeral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1051:3: this_QueryOperand_1= ruleQueryOperand
                    {

                    			newCompositeNode(grammarAccess.getPlainOperandAccess().getQueryOperandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QueryOperand_1=ruleQueryOperand();

                    state._fsp--;


                    			current = this_QueryOperand_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlainOperand"


    // $ANTLR start "entryRuleNumeral"
    // InternalRuleDsl.g:1063:1: entryRuleNumeral returns [EObject current=null] : iv_ruleNumeral= ruleNumeral EOF ;
    public final EObject entryRuleNumeral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeral = null;


        try {
            // InternalRuleDsl.g:1063:48: (iv_ruleNumeral= ruleNumeral EOF )
            // InternalRuleDsl.g:1064:2: iv_ruleNumeral= ruleNumeral EOF
            {
             newCompositeNode(grammarAccess.getNumeralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumeral=ruleNumeral();

            state._fsp--;

             current =iv_ruleNumeral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumeral"


    // $ANTLR start "ruleNumeral"
    // InternalRuleDsl.g:1070:1: ruleNumeral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleNumeral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:1076:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalRuleDsl.g:1077:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalRuleDsl.g:1077:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalRuleDsl.g:1078:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalRuleDsl.g:1078:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalRuleDsl.g:1079:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumeralAccess().getValueDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumeralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"eagledata.core.dsl.rule.RuleDsl.DOUBLE");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumeral"


    // $ANTLR start "entryRuleQueryOperand"
    // InternalRuleDsl.g:1098:1: entryRuleQueryOperand returns [EObject current=null] : iv_ruleQueryOperand= ruleQueryOperand EOF ;
    public final EObject entryRuleQueryOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryOperand = null;


        try {
            // InternalRuleDsl.g:1098:53: (iv_ruleQueryOperand= ruleQueryOperand EOF )
            // InternalRuleDsl.g:1099:2: iv_ruleQueryOperand= ruleQueryOperand EOF
            {
             newCompositeNode(grammarAccess.getQueryOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryOperand=ruleQueryOperand();

            state._fsp--;

             current =iv_ruleQueryOperand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQueryOperand"


    // $ANTLR start "ruleQueryOperand"
    // InternalRuleDsl.g:1105:1: ruleQueryOperand returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleQueryOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:1111:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRuleDsl.g:1112:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRuleDsl.g:1112:2: ( (otherlv_0= RULE_ID ) )
            // InternalRuleDsl.g:1113:3: (otherlv_0= RULE_ID )
            {
            // InternalRuleDsl.g:1113:3: (otherlv_0= RULE_ID )
            // InternalRuleDsl.g:1114:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQueryOperandRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getQueryOperandAccess().getQueryQueryCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQueryOperand"


    // $ANTLR start "entryRuleComplexOperand"
    // InternalRuleDsl.g:1128:1: entryRuleComplexOperand returns [EObject current=null] : iv_ruleComplexOperand= ruleComplexOperand EOF ;
    public final EObject entryRuleComplexOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexOperand = null;


        try {
            // InternalRuleDsl.g:1128:55: (iv_ruleComplexOperand= ruleComplexOperand EOF )
            // InternalRuleDsl.g:1129:2: iv_ruleComplexOperand= ruleComplexOperand EOF
            {
             newCompositeNode(grammarAccess.getComplexOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexOperand=ruleComplexOperand();

            state._fsp--;

             current =iv_ruleComplexOperand; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexOperand"


    // $ANTLR start "ruleComplexOperand"
    // InternalRuleDsl.g:1135:1: ruleComplexOperand returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleComplexOperand() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:1141:2: ( ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalRuleDsl.g:1142:2: ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalRuleDsl.g:1142:2: ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalRuleDsl.g:1143:3: ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalRuleDsl.g:1143:3: ( (lv_operator_0_0= RULE_OPERATOR ) )
            // InternalRuleDsl.g:1144:4: (lv_operator_0_0= RULE_OPERATOR )
            {
            // InternalRuleDsl.g:1144:4: (lv_operator_0_0= RULE_OPERATOR )
            // InternalRuleDsl.g:1145:5: lv_operator_0_0= RULE_OPERATOR
            {
            lv_operator_0_0=(Token)match(input,RULE_OPERATOR,FOLLOW_25); 

            					newLeafNode(lv_operator_0_0, grammarAccess.getComplexOperandAccess().getOperatorOPERATORTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexOperandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"eagledata.core.dsl.rule.RuleDsl.OPERATOR");
            				

            }


            }

            // InternalRuleDsl.g:1161:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalRuleDsl.g:1162:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalRuleDsl.g:1162:4: (lv_expression_1_0= ruleExpression )
            // InternalRuleDsl.g:1163:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getComplexOperandAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexOperandRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"eagledata.core.dsl.rule.RuleDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexOperand"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000012L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040210L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001000400L});

}