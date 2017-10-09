package uam.eagledata.dsl.events.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uam.eagledata.dsl.events.services.EventSetManagerDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventSetManagerDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pattern'", "'{'", "'}'", "'if'", "'then'", "' = '", "'='", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'"
    };
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEventSetManagerDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventSetManagerDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventSetManagerDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEventSetManagerDsl.g"; }



     	private EventSetManagerDslGrammarAccess grammarAccess;

        public InternalEventSetManagerDslParser(TokenStream input, EventSetManagerDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EventSetManager";
       	}

       	@Override
       	protected EventSetManagerDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEventSetManager"
    // InternalEventSetManagerDsl.g:65:1: entryRuleEventSetManager returns [EObject current=null] : iv_ruleEventSetManager= ruleEventSetManager EOF ;
    public final EObject entryRuleEventSetManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventSetManager = null;


        try {
            // InternalEventSetManagerDsl.g:65:56: (iv_ruleEventSetManager= ruleEventSetManager EOF )
            // InternalEventSetManagerDsl.g:66:2: iv_ruleEventSetManager= ruleEventSetManager EOF
            {
             newCompositeNode(grammarAccess.getEventSetManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventSetManager=ruleEventSetManager();

            state._fsp--;

             current =iv_ruleEventSetManager; 
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
    // $ANTLR end "entryRuleEventSetManager"


    // $ANTLR start "ruleEventSetManager"
    // InternalEventSetManagerDsl.g:72:1: ruleEventSetManager returns [EObject current=null] : ( ( (lv_events_0_0= ruleEvent ) ) ( (lv_events_1_0= ruleEvent ) )* ) ;
    public final EObject ruleEventSetManager() throws RecognitionException {
        EObject current = null;

        EObject lv_events_0_0 = null;

        EObject lv_events_1_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:78:2: ( ( ( (lv_events_0_0= ruleEvent ) ) ( (lv_events_1_0= ruleEvent ) )* ) )
            // InternalEventSetManagerDsl.g:79:2: ( ( (lv_events_0_0= ruleEvent ) ) ( (lv_events_1_0= ruleEvent ) )* )
            {
            // InternalEventSetManagerDsl.g:79:2: ( ( (lv_events_0_0= ruleEvent ) ) ( (lv_events_1_0= ruleEvent ) )* )
            // InternalEventSetManagerDsl.g:80:3: ( (lv_events_0_0= ruleEvent ) ) ( (lv_events_1_0= ruleEvent ) )*
            {
            // InternalEventSetManagerDsl.g:80:3: ( (lv_events_0_0= ruleEvent ) )
            // InternalEventSetManagerDsl.g:81:4: (lv_events_0_0= ruleEvent )
            {
            // InternalEventSetManagerDsl.g:81:4: (lv_events_0_0= ruleEvent )
            // InternalEventSetManagerDsl.g:82:5: lv_events_0_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_events_0_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
            					}
            					add(
            						current,
            						"events",
            						lv_events_0_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:99:3: ( (lv_events_1_0= ruleEvent ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:100:4: (lv_events_1_0= ruleEvent )
            	    {
            	    // InternalEventSetManagerDsl.g:100:4: (lv_events_1_0= ruleEvent )
            	    // InternalEventSetManagerDsl.g:101:5: lv_events_1_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_events_1_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_1_0,
            	    						"uam.eagledata.dsl.events.EventSetManagerDsl.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleEventSetManager"


    // $ANTLR start "entryRuleEvent"
    // InternalEventSetManagerDsl.g:122:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalEventSetManagerDsl.g:122:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalEventSetManagerDsl.g:123:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalEventSetManagerDsl.g:129:1: ruleEvent returns [EObject current=null] : this_PatternEvent_0= rulePatternEvent ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_PatternEvent_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:135:2: (this_PatternEvent_0= rulePatternEvent )
            // InternalEventSetManagerDsl.g:136:2: this_PatternEvent_0= rulePatternEvent
            {

            		newCompositeNode(grammarAccess.getEventAccess().getPatternEventParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PatternEvent_0=rulePatternEvent();

            state._fsp--;


            		current = this_PatternEvent_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRulePatternEvent"
    // InternalEventSetManagerDsl.g:147:1: entryRulePatternEvent returns [EObject current=null] : iv_rulePatternEvent= rulePatternEvent EOF ;
    public final EObject entryRulePatternEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternEvent = null;


        try {
            // InternalEventSetManagerDsl.g:147:53: (iv_rulePatternEvent= rulePatternEvent EOF )
            // InternalEventSetManagerDsl.g:148:2: iv_rulePatternEvent= rulePatternEvent EOF
            {
             newCompositeNode(grammarAccess.getPatternEventRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatternEvent=rulePatternEvent();

            state._fsp--;

             current =iv_rulePatternEvent; 
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
    // $ANTLR end "entryRulePatternEvent"


    // $ANTLR start "rulePatternEvent"
    // InternalEventSetManagerDsl.g:154:1: rulePatternEvent returns [EObject current=null] : ( () otherlv_1= 'pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_concepts_4_0= ruleConcept ) ) ( (lv_concepts_5_0= ruleConcept ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_when_8_0= ruleCondition ) ) )? (otherlv_9= 'then' ( (lv_triggers_10_0= ruleEString ) ) ( (lv_triggers_11_0= ruleEString ) )* ) ) ;
    public final EObject rulePatternEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_concepts_4_0 = null;

        EObject lv_concepts_5_0 = null;

        EObject lv_when_8_0 = null;

        AntlrDatatypeRuleToken lv_triggers_10_0 = null;

        AntlrDatatypeRuleToken lv_triggers_11_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:160:2: ( ( () otherlv_1= 'pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_concepts_4_0= ruleConcept ) ) ( (lv_concepts_5_0= ruleConcept ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_when_8_0= ruleCondition ) ) )? (otherlv_9= 'then' ( (lv_triggers_10_0= ruleEString ) ) ( (lv_triggers_11_0= ruleEString ) )* ) ) )
            // InternalEventSetManagerDsl.g:161:2: ( () otherlv_1= 'pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_concepts_4_0= ruleConcept ) ) ( (lv_concepts_5_0= ruleConcept ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_when_8_0= ruleCondition ) ) )? (otherlv_9= 'then' ( (lv_triggers_10_0= ruleEString ) ) ( (lv_triggers_11_0= ruleEString ) )* ) )
            {
            // InternalEventSetManagerDsl.g:161:2: ( () otherlv_1= 'pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_concepts_4_0= ruleConcept ) ) ( (lv_concepts_5_0= ruleConcept ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_when_8_0= ruleCondition ) ) )? (otherlv_9= 'then' ( (lv_triggers_10_0= ruleEString ) ) ( (lv_triggers_11_0= ruleEString ) )* ) )
            // InternalEventSetManagerDsl.g:162:3: () otherlv_1= 'pattern' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_concepts_4_0= ruleConcept ) ) ( (lv_concepts_5_0= ruleConcept ) )* otherlv_6= '}' (otherlv_7= 'if' ( (lv_when_8_0= ruleCondition ) ) )? (otherlv_9= 'then' ( (lv_triggers_10_0= ruleEString ) ) ( (lv_triggers_11_0= ruleEString ) )* )
            {
            // InternalEventSetManagerDsl.g:162:3: ()
            // InternalEventSetManagerDsl.g:163:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPatternEventAccess().getPatternEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternEventAccess().getPatternKeyword_1());
            		
            // InternalEventSetManagerDsl.g:173:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:174:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:174:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:175:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPatternEventAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalEventSetManagerDsl.g:196:3: ( (lv_concepts_4_0= ruleConcept ) )
            // InternalEventSetManagerDsl.g:197:4: (lv_concepts_4_0= ruleConcept )
            {
            // InternalEventSetManagerDsl.g:197:4: (lv_concepts_4_0= ruleConcept )
            // InternalEventSetManagerDsl.g:198:5: lv_concepts_4_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getPatternEventAccess().getConceptsConceptParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_concepts_4_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternEventRule());
            					}
            					add(
            						current,
            						"concepts",
            						lv_concepts_4_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Concept");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:215:3: ( (lv_concepts_5_0= ruleConcept ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=23)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:216:4: (lv_concepts_5_0= ruleConcept )
            	    {
            	    // InternalEventSetManagerDsl.g:216:4: (lv_concepts_5_0= ruleConcept )
            	    // InternalEventSetManagerDsl.g:217:5: lv_concepts_5_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getPatternEventAccess().getConceptsConceptParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_concepts_5_0=ruleConcept();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatternEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concepts",
            	    						lv_concepts_5_0,
            	    						"uam.eagledata.dsl.events.EventSetManagerDsl.Concept");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPatternEventAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalEventSetManagerDsl.g:238:3: (otherlv_7= 'if' ( (lv_when_8_0= ruleCondition ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEventSetManagerDsl.g:239:4: otherlv_7= 'if' ( (lv_when_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getPatternEventAccess().getIfKeyword_7_0());
                    			
                    // InternalEventSetManagerDsl.g:243:4: ( (lv_when_8_0= ruleCondition ) )
                    // InternalEventSetManagerDsl.g:244:5: (lv_when_8_0= ruleCondition )
                    {
                    // InternalEventSetManagerDsl.g:244:5: (lv_when_8_0= ruleCondition )
                    // InternalEventSetManagerDsl.g:245:6: lv_when_8_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getPatternEventAccess().getWhenConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_when_8_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternEventRule());
                    						}
                    						set(
                    							current,
                    							"when",
                    							lv_when_8_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventSetManagerDsl.g:263:3: (otherlv_9= 'then' ( (lv_triggers_10_0= ruleEString ) ) ( (lv_triggers_11_0= ruleEString ) )* )
            // InternalEventSetManagerDsl.g:264:4: otherlv_9= 'then' ( (lv_triggers_10_0= ruleEString ) ) ( (lv_triggers_11_0= ruleEString ) )*
            {
            otherlv_9=(Token)match(input,16,FOLLOW_4); 

            				newLeafNode(otherlv_9, grammarAccess.getPatternEventAccess().getThenKeyword_8_0());
            			
            // InternalEventSetManagerDsl.g:268:4: ( (lv_triggers_10_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:269:5: (lv_triggers_10_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:269:5: (lv_triggers_10_0= ruleEString )
            // InternalEventSetManagerDsl.g:270:6: lv_triggers_10_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getPatternEventAccess().getTriggersEStringParserRuleCall_8_1_0());
            					
            pushFollow(FOLLOW_11);
            lv_triggers_10_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPatternEventRule());
            						}
            						add(
            							current,
            							"triggers",
            							lv_triggers_10_0,
            							"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalEventSetManagerDsl.g:287:4: ( (lv_triggers_11_0= ruleEString ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:288:5: (lv_triggers_11_0= ruleEString )
            	    {
            	    // InternalEventSetManagerDsl.g:288:5: (lv_triggers_11_0= ruleEString )
            	    // InternalEventSetManagerDsl.g:289:6: lv_triggers_11_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getPatternEventAccess().getTriggersEStringParserRuleCall_8_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_triggers_11_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPatternEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"triggers",
            	    							lv_triggers_11_0,
            	    							"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "rulePatternEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalEventSetManagerDsl.g:311:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalEventSetManagerDsl.g:311:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalEventSetManagerDsl.g:312:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalEventSetManagerDsl.g:318:1: ruleCondition returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;

        EObject this_BooleanExpression_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:324:2: ( (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression ) )
            // InternalEventSetManagerDsl.g:325:2: (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression )
            {
            // InternalEventSetManagerDsl.g:325:2: (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_BOOLEAN) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEventSetManagerDsl.g:326:3: this_BinaryExpression_0= ruleBinaryExpression
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getBinaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryExpression_0=ruleBinaryExpression();

                    state._fsp--;


                    			current = this_BinaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:335:3: this_BooleanExpression_1= ruleBooleanExpression
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getBooleanExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanExpression_1=ruleBooleanExpression();

                    state._fsp--;


                    			current = this_BooleanExpression_1;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalEventSetManagerDsl.g:347:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalEventSetManagerDsl.g:347:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalEventSetManagerDsl.g:348:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
            {
             newCompositeNode(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryExpression=ruleBinaryExpression();

            state._fsp--;

             current =iv_ruleBinaryExpression; 
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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalEventSetManagerDsl.g:354:1: ruleBinaryExpression returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= ' = ' ( (lv_right_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:360:2: ( ( ( ( ruleEString ) ) otherlv_1= ' = ' ( (lv_right_2_0= ruleLiteral ) ) ) )
            // InternalEventSetManagerDsl.g:361:2: ( ( ( ruleEString ) ) otherlv_1= ' = ' ( (lv_right_2_0= ruleLiteral ) ) )
            {
            // InternalEventSetManagerDsl.g:361:2: ( ( ( ruleEString ) ) otherlv_1= ' = ' ( (lv_right_2_0= ruleLiteral ) ) )
            // InternalEventSetManagerDsl.g:362:3: ( ( ruleEString ) ) otherlv_1= ' = ' ( (lv_right_2_0= ruleLiteral ) )
            {
            // InternalEventSetManagerDsl.g:362:3: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:363:4: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:363:4: ( ruleEString )
            // InternalEventSetManagerDsl.g:364:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftConceptCrossReference_0_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryExpressionAccess().getSpaceEqualsSignSpaceKeyword_1());
            		
            // InternalEventSetManagerDsl.g:382:3: ( (lv_right_2_0= ruleLiteral ) )
            // InternalEventSetManagerDsl.g:383:4: (lv_right_2_0= ruleLiteral )
            {
            // InternalEventSetManagerDsl.g:383:4: (lv_right_2_0= ruleLiteral )
            // InternalEventSetManagerDsl.g:384:5: lv_right_2_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getRightLiteralParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryExpressionRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Literal");
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
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalEventSetManagerDsl.g:405:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEventSetManagerDsl.g:405:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEventSetManagerDsl.g:406:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalEventSetManagerDsl.g:412:1: ruleLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:418:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:419:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:419:2: ( (lv_value_0_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:420:3: (lv_value_0_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:420:3: (lv_value_0_0= ruleEString )
            // InternalEventSetManagerDsl.g:421:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getLiteralAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLiteralRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalEventSetManagerDsl.g:441:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalEventSetManagerDsl.g:441:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalEventSetManagerDsl.g:442:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
            {
             newCompositeNode(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpression=ruleBooleanExpression();

            state._fsp--;

             current =iv_ruleBooleanExpression; 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalEventSetManagerDsl.g:448:1: ruleBooleanExpression returns [EObject current=null] : ( (lv_expression_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:454:2: ( ( (lv_expression_0_0= RULE_BOOLEAN ) ) )
            // InternalEventSetManagerDsl.g:455:2: ( (lv_expression_0_0= RULE_BOOLEAN ) )
            {
            // InternalEventSetManagerDsl.g:455:2: ( (lv_expression_0_0= RULE_BOOLEAN ) )
            // InternalEventSetManagerDsl.g:456:3: (lv_expression_0_0= RULE_BOOLEAN )
            {
            // InternalEventSetManagerDsl.g:456:3: (lv_expression_0_0= RULE_BOOLEAN )
            // InternalEventSetManagerDsl.g:457:4: lv_expression_0_0= RULE_BOOLEAN
            {
            lv_expression_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            				newLeafNode(lv_expression_0_0, grammarAccess.getBooleanExpressionAccess().getExpressionBOOLEANTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBooleanExpressionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"uam.eagledata.dsl.events.EventSetManagerDsl.BOOLEAN");
            			

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
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleConcept"
    // InternalEventSetManagerDsl.g:476:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalEventSetManagerDsl.g:476:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalEventSetManagerDsl.g:477:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalEventSetManagerDsl.g:483:1: ruleConcept returns [EObject current=null] : (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_KeyConcept_0 = null;

        EObject this_RegexConcept_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:489:2: ( (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) )
            // InternalEventSetManagerDsl.g:490:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            {
            // InternalEventSetManagerDsl.g:490:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalEventSetManagerDsl.g:491:3: this_KeyConcept_0= ruleKeyConcept
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getKeyConceptParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_KeyConcept_0=ruleKeyConcept();

                    state._fsp--;


                    			current = this_KeyConcept_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:500:3: this_RegexConcept_1= ruleRegexConcept
                    {

                    			newCompositeNode(grammarAccess.getConceptAccess().getRegexConceptParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RegexConcept_1=ruleRegexConcept();

                    state._fsp--;


                    			current = this_RegexConcept_1;
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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleKeyConcept"
    // InternalEventSetManagerDsl.g:512:1: entryRuleKeyConcept returns [EObject current=null] : iv_ruleKeyConcept= ruleKeyConcept EOF ;
    public final EObject entryRuleKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyConcept = null;


        try {
            // InternalEventSetManagerDsl.g:512:51: (iv_ruleKeyConcept= ruleKeyConcept EOF )
            // InternalEventSetManagerDsl.g:513:2: iv_ruleKeyConcept= ruleKeyConcept EOF
            {
             newCompositeNode(grammarAccess.getKeyConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyConcept=ruleKeyConcept();

            state._fsp--;

             current =iv_ruleKeyConcept; 
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
    // $ANTLR end "entryRuleKeyConcept"


    // $ANTLR start "ruleKeyConcept"
    // InternalEventSetManagerDsl.g:519:1: ruleKeyConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyConcept() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:525:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:526:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:526:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:527:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:527:3: ()
            // InternalEventSetManagerDsl.g:528:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyConceptAccess().getKeyConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:534:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:535:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:535:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:536:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getKeyConceptAccess().getTypeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyConceptRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:553:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:554:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:554:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:555:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyConceptAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyConceptRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
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
    // $ANTLR end "ruleKeyConcept"


    // $ANTLR start "entryRuleRegexConcept"
    // InternalEventSetManagerDsl.g:576:1: entryRuleRegexConcept returns [EObject current=null] : iv_ruleRegexConcept= ruleRegexConcept EOF ;
    public final EObject entryRuleRegexConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexConcept = null;


        try {
            // InternalEventSetManagerDsl.g:576:53: (iv_ruleRegexConcept= ruleRegexConcept EOF )
            // InternalEventSetManagerDsl.g:577:2: iv_ruleRegexConcept= ruleRegexConcept EOF
            {
             newCompositeNode(grammarAccess.getRegexConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegexConcept=ruleRegexConcept();

            state._fsp--;

             current =iv_ruleRegexConcept; 
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
    // $ANTLR end "entryRuleRegexConcept"


    // $ANTLR start "ruleRegexConcept"
    // InternalEventSetManagerDsl.g:583:1: ruleRegexConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) ;
    public final EObject ruleRegexConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_regex_4_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:589:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:590:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:590:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:591:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:591:3: ()
            // InternalEventSetManagerDsl.g:592:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegexConceptAccess().getRegexConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:598:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:599:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:599:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:600:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getRegexConceptAccess().getTypeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegexConceptRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:617:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:618:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:618:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:619:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRegexConceptAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegexConceptRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRegexConceptAccess().getEqualsSignKeyword_3());
            		
            // InternalEventSetManagerDsl.g:640:3: ( (lv_regex_4_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:641:4: (lv_regex_4_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:641:4: (lv_regex_4_0= ruleEString )
            // InternalEventSetManagerDsl.g:642:5: lv_regex_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRegexConceptAccess().getRegexEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_regex_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegexConceptRule());
            					}
            					set(
            						current,
            						"regex",
            						lv_regex_4_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
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
    // $ANTLR end "ruleRegexConcept"


    // $ANTLR start "entryRuleEString"
    // InternalEventSetManagerDsl.g:663:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEventSetManagerDsl.g:663:47: (iv_ruleEString= ruleEString EOF )
            // InternalEventSetManagerDsl.g:664:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalEventSetManagerDsl.g:670:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:676:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEventSetManagerDsl.g:677:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:677:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEventSetManagerDsl.g:678:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:686:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleType"
    // InternalEventSetManagerDsl.g:697:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:703:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalEventSetManagerDsl.g:704:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalEventSetManagerDsl.g:704:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalEventSetManagerDsl.g:705:3: (enumLiteral_0= 'String' )
                    {
                    // InternalEventSetManagerDsl.g:705:3: (enumLiteral_0= 'String' )
                    // InternalEventSetManagerDsl.g:706:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,19,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:713:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalEventSetManagerDsl.g:713:3: (enumLiteral_1= 'Int' )
                    // InternalEventSetManagerDsl.g:714:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEventSetManagerDsl.g:721:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalEventSetManagerDsl.g:721:3: (enumLiteral_2= 'Boolean' )
                    // InternalEventSetManagerDsl.g:722:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEventSetManagerDsl.g:729:3: (enumLiteral_3= 'Float' )
                    {
                    // InternalEventSetManagerDsl.g:729:3: (enumLiteral_3= 'Float' )
                    // InternalEventSetManagerDsl.g:730:4: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEventSetManagerDsl.g:737:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalEventSetManagerDsl.g:737:3: (enumLiteral_4= 'Double' )
                    // InternalEventSetManagerDsl.g:738:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleType"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\2\10\2\uffff";
    static final String dfa_3s = "\1\23\5\5\2\16\2\uffff";
    static final String dfa_4s = "\1\27\5\6\2\27\2\uffff";
    static final String dfa_5s = "\10\uffff\1\1\1\2";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\10\3\uffff\1\11\5\10",
            "\1\10\3\uffff\1\11\5\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "490:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000F80000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000F84000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});

}