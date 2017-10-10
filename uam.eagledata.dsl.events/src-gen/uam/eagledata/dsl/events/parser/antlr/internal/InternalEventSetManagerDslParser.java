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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'connection'", "'and'", "'pattern'", "'{'", "'}'", "'if'", "'then'", "'='", "'('", "','", "')'", "'<='", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'"
    };
    public static final int RULE_BOOLEAN=4;
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

                if ( (LA1_0==12||LA1_0==14) ) {
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
    // InternalEventSetManagerDsl.g:129:1: ruleEvent returns [EObject current=null] : ( () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' (otherlv_11= 'if' ( (lv_when_12_0= ruleCondition ) ) )? (otherlv_13= 'then' ( (lv_triggers_14_0= ruleAction ) ) ( (lv_triggers_15_0= ruleAction ) )* ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_dataconnection_2_0 = null;

        AntlrDatatypeRuleToken lv_dataconnection_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_concepts_8_0 = null;

        EObject lv_concepts_9_0 = null;

        EObject lv_when_12_0 = null;

        EObject lv_triggers_14_0 = null;

        EObject lv_triggers_15_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:135:2: ( ( () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' (otherlv_11= 'if' ( (lv_when_12_0= ruleCondition ) ) )? (otherlv_13= 'then' ( (lv_triggers_14_0= ruleAction ) ) ( (lv_triggers_15_0= ruleAction ) )* ) ) )
            // InternalEventSetManagerDsl.g:136:2: ( () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' (otherlv_11= 'if' ( (lv_when_12_0= ruleCondition ) ) )? (otherlv_13= 'then' ( (lv_triggers_14_0= ruleAction ) ) ( (lv_triggers_15_0= ruleAction ) )* ) )
            {
            // InternalEventSetManagerDsl.g:136:2: ( () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' (otherlv_11= 'if' ( (lv_when_12_0= ruleCondition ) ) )? (otherlv_13= 'then' ( (lv_triggers_14_0= ruleAction ) ) ( (lv_triggers_15_0= ruleAction ) )* ) )
            // InternalEventSetManagerDsl.g:137:3: () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' (otherlv_11= 'if' ( (lv_when_12_0= ruleCondition ) ) )? (otherlv_13= 'then' ( (lv_triggers_14_0= ruleAction ) ) ( (lv_triggers_15_0= ruleAction ) )* )
            {
            // InternalEventSetManagerDsl.g:137:3: ()
            // InternalEventSetManagerDsl.g:138:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:144:3: (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEventSetManagerDsl.g:145:4: otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )*
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getConnectionKeyword_1_0());
                    			
                    // InternalEventSetManagerDsl.g:149:4: ( (lv_dataconnection_2_0= ruleEString ) )
                    // InternalEventSetManagerDsl.g:150:5: (lv_dataconnection_2_0= ruleEString )
                    {
                    // InternalEventSetManagerDsl.g:150:5: (lv_dataconnection_2_0= ruleEString )
                    // InternalEventSetManagerDsl.g:151:6: lv_dataconnection_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getDataconnectionEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_dataconnection_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						add(
                    							current,
                    							"dataconnection",
                    							lv_dataconnection_2_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventSetManagerDsl.g:168:4: (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:169:5: otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEventAccess().getAndKeyword_1_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:173:5: ( (lv_dataconnection_4_0= ruleEString ) )
                    	    // InternalEventSetManagerDsl.g:174:6: (lv_dataconnection_4_0= ruleEString )
                    	    {
                    	    // InternalEventSetManagerDsl.g:174:6: (lv_dataconnection_4_0= ruleEString )
                    	    // InternalEventSetManagerDsl.g:175:7: lv_dataconnection_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getDataconnectionEStringParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_dataconnection_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dataconnection",
                    	    								lv_dataconnection_4_0,
                    	    								"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getEventAccess().getPatternKeyword_2());
            		
            // InternalEventSetManagerDsl.g:198:3: ( (lv_name_6_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:199:4: (lv_name_6_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:199:4: (lv_name_6_0= ruleEString )
            // InternalEventSetManagerDsl.g:200:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalEventSetManagerDsl.g:221:3: ( (lv_concepts_8_0= ruleConcept ) )
            // InternalEventSetManagerDsl.g:222:4: (lv_concepts_8_0= ruleConcept )
            {
            // InternalEventSetManagerDsl.g:222:4: (lv_concepts_8_0= ruleConcept )
            // InternalEventSetManagerDsl.g:223:5: lv_concepts_8_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_concepts_8_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					add(
            						current,
            						"concepts",
            						lv_concepts_8_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Concept");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:240:3: ( (lv_concepts_9_0= ruleConcept ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=24 && LA4_0<=28)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:241:4: (lv_concepts_9_0= ruleConcept )
            	    {
            	    // InternalEventSetManagerDsl.g:241:4: (lv_concepts_9_0= ruleConcept )
            	    // InternalEventSetManagerDsl.g:242:5: lv_concepts_9_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_concepts_9_0=ruleConcept();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concepts",
            	    						lv_concepts_9_0,
            	    						"uam.eagledata.dsl.events.EventSetManagerDsl.Concept");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalEventSetManagerDsl.g:263:3: (otherlv_11= 'if' ( (lv_when_12_0= ruleCondition ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEventSetManagerDsl.g:264:4: otherlv_11= 'if' ( (lv_when_12_0= ruleCondition ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventAccess().getIfKeyword_8_0());
                    			
                    // InternalEventSetManagerDsl.g:268:4: ( (lv_when_12_0= ruleCondition ) )
                    // InternalEventSetManagerDsl.g:269:5: (lv_when_12_0= ruleCondition )
                    {
                    // InternalEventSetManagerDsl.g:269:5: (lv_when_12_0= ruleCondition )
                    // InternalEventSetManagerDsl.g:270:6: lv_when_12_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getWhenConditionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_when_12_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"when",
                    							lv_when_12_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventSetManagerDsl.g:288:3: (otherlv_13= 'then' ( (lv_triggers_14_0= ruleAction ) ) ( (lv_triggers_15_0= ruleAction ) )* )
            // InternalEventSetManagerDsl.g:289:4: otherlv_13= 'then' ( (lv_triggers_14_0= ruleAction ) ) ( (lv_triggers_15_0= ruleAction ) )*
            {
            otherlv_13=(Token)match(input,18,FOLLOW_4); 

            				newLeafNode(otherlv_13, grammarAccess.getEventAccess().getThenKeyword_9_0());
            			
            // InternalEventSetManagerDsl.g:293:4: ( (lv_triggers_14_0= ruleAction ) )
            // InternalEventSetManagerDsl.g:294:5: (lv_triggers_14_0= ruleAction )
            {
            // InternalEventSetManagerDsl.g:294:5: (lv_triggers_14_0= ruleAction )
            // InternalEventSetManagerDsl.g:295:6: lv_triggers_14_0= ruleAction
            {

            						newCompositeNode(grammarAccess.getEventAccess().getTriggersActionParserRuleCall_9_1_0());
            					
            pushFollow(FOLLOW_12);
            lv_triggers_14_0=ruleAction();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEventRule());
            						}
            						add(
            							current,
            							"triggers",
            							lv_triggers_14_0,
            							"uam.eagledata.dsl.events.EventSetManagerDsl.Action");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalEventSetManagerDsl.g:312:4: ( (lv_triggers_15_0= ruleAction ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:313:5: (lv_triggers_15_0= ruleAction )
            	    {
            	    // InternalEventSetManagerDsl.g:313:5: (lv_triggers_15_0= ruleAction )
            	    // InternalEventSetManagerDsl.g:314:6: lv_triggers_15_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getEventAccess().getTriggersActionParserRuleCall_9_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_triggers_15_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"triggers",
            	    							lv_triggers_15_0,
            	    							"uam.eagledata.dsl.events.EventSetManagerDsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalEventSetManagerDsl.g:336:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalEventSetManagerDsl.g:336:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalEventSetManagerDsl.g:337:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalEventSetManagerDsl.g:343:1: ruleCondition returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;

        EObject this_BooleanExpression_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:349:2: ( (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression ) )
            // InternalEventSetManagerDsl.g:350:2: (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression )
            {
            // InternalEventSetManagerDsl.g:350:2: (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_BOOLEAN) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEventSetManagerDsl.g:351:3: this_BinaryExpression_0= ruleBinaryExpression
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
                    // InternalEventSetManagerDsl.g:360:3: this_BooleanExpression_1= ruleBooleanExpression
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
    // InternalEventSetManagerDsl.g:372:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalEventSetManagerDsl.g:372:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalEventSetManagerDsl.g:373:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalEventSetManagerDsl.g:379:1: ruleBinaryExpression returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:385:2: ( ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) ) ) )
            // InternalEventSetManagerDsl.g:386:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) ) )
            {
            // InternalEventSetManagerDsl.g:386:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) ) )
            // InternalEventSetManagerDsl.g:387:3: ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) )
            {
            // InternalEventSetManagerDsl.g:387:3: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:388:4: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:388:4: ( ruleEString )
            // InternalEventSetManagerDsl.g:389:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftConceptCrossReference_0_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryExpressionAccess().getEqualsSignKeyword_1());
            		
            // InternalEventSetManagerDsl.g:407:3: ( (lv_right_2_0= ruleLiteral ) )
            // InternalEventSetManagerDsl.g:408:4: (lv_right_2_0= ruleLiteral )
            {
            // InternalEventSetManagerDsl.g:408:4: (lv_right_2_0= ruleLiteral )
            // InternalEventSetManagerDsl.g:409:5: lv_right_2_0= ruleLiteral
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
    // InternalEventSetManagerDsl.g:430:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEventSetManagerDsl.g:430:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEventSetManagerDsl.g:431:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalEventSetManagerDsl.g:437:1: ruleLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:443:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:444:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:444:2: ( (lv_value_0_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:445:3: (lv_value_0_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:445:3: (lv_value_0_0= ruleEString )
            // InternalEventSetManagerDsl.g:446:4: lv_value_0_0= ruleEString
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
    // InternalEventSetManagerDsl.g:466:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalEventSetManagerDsl.g:466:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalEventSetManagerDsl.g:467:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalEventSetManagerDsl.g:473:1: ruleBooleanExpression returns [EObject current=null] : ( (lv_expression_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:479:2: ( ( (lv_expression_0_0= RULE_BOOLEAN ) ) )
            // InternalEventSetManagerDsl.g:480:2: ( (lv_expression_0_0= RULE_BOOLEAN ) )
            {
            // InternalEventSetManagerDsl.g:480:2: ( (lv_expression_0_0= RULE_BOOLEAN ) )
            // InternalEventSetManagerDsl.g:481:3: (lv_expression_0_0= RULE_BOOLEAN )
            {
            // InternalEventSetManagerDsl.g:481:3: (lv_expression_0_0= RULE_BOOLEAN )
            // InternalEventSetManagerDsl.g:482:4: lv_expression_0_0= RULE_BOOLEAN
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
    // InternalEventSetManagerDsl.g:501:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalEventSetManagerDsl.g:501:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalEventSetManagerDsl.g:502:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalEventSetManagerDsl.g:508:1: ruleConcept returns [EObject current=null] : (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_KeyConcept_0 = null;

        EObject this_RegexConcept_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:514:2: ( (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) )
            // InternalEventSetManagerDsl.g:515:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            {
            // InternalEventSetManagerDsl.g:515:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEventSetManagerDsl.g:516:3: this_KeyConcept_0= ruleKeyConcept
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
                    // InternalEventSetManagerDsl.g:525:3: this_RegexConcept_1= ruleRegexConcept
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
    // InternalEventSetManagerDsl.g:537:1: entryRuleKeyConcept returns [EObject current=null] : iv_ruleKeyConcept= ruleKeyConcept EOF ;
    public final EObject entryRuleKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyConcept = null;


        try {
            // InternalEventSetManagerDsl.g:537:51: (iv_ruleKeyConcept= ruleKeyConcept EOF )
            // InternalEventSetManagerDsl.g:538:2: iv_ruleKeyConcept= ruleKeyConcept EOF
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
    // InternalEventSetManagerDsl.g:544:1: ruleKeyConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyConcept() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:550:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:551:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:551:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:552:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:552:3: ()
            // InternalEventSetManagerDsl.g:553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyConceptAccess().getKeyConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:559:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:560:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:560:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:561:5: lv_type_1_0= ruleType
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

            // InternalEventSetManagerDsl.g:578:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:579:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:579:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:580:5: lv_name_2_0= ruleEString
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
    // InternalEventSetManagerDsl.g:601:1: entryRuleRegexConcept returns [EObject current=null] : iv_ruleRegexConcept= ruleRegexConcept EOF ;
    public final EObject entryRuleRegexConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexConcept = null;


        try {
            // InternalEventSetManagerDsl.g:601:53: (iv_ruleRegexConcept= ruleRegexConcept EOF )
            // InternalEventSetManagerDsl.g:602:2: iv_ruleRegexConcept= ruleRegexConcept EOF
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
    // InternalEventSetManagerDsl.g:608:1: ruleRegexConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) ;
    public final EObject ruleRegexConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_regex_4_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:614:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:615:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:615:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:616:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:616:3: ()
            // InternalEventSetManagerDsl.g:617:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegexConceptAccess().getRegexConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:623:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:624:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:624:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:625:5: lv_type_1_0= ruleType
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

            // InternalEventSetManagerDsl.g:642:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:643:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:643:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:644:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getRegexConceptAccess().getEqualsSignKeyword_3());
            		
            // InternalEventSetManagerDsl.g:665:3: ( (lv_regex_4_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:666:4: (lv_regex_4_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:666:4: (lv_regex_4_0= ruleEString )
            // InternalEventSetManagerDsl.g:667:5: lv_regex_4_0= ruleEString
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


    // $ANTLR start "entryRuleAction"
    // InternalEventSetManagerDsl.g:688:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalEventSetManagerDsl.g:688:47: (iv_ruleAction= ruleAction EOF )
            // InternalEventSetManagerDsl.g:689:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalEventSetManagerDsl.g:695:1: ruleAction returns [EObject current=null] : ( () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_calls_1_0 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:701:2: ( ( () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? ) )
            // InternalEventSetManagerDsl.g:702:2: ( () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? )
            {
            // InternalEventSetManagerDsl.g:702:2: ( () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? )
            // InternalEventSetManagerDsl.g:703:3: () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )?
            {
            // InternalEventSetManagerDsl.g:703:3: ()
            // InternalEventSetManagerDsl.g:704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:710:3: ( (lv_calls_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:711:4: (lv_calls_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:711:4: (lv_calls_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:712:5: lv_calls_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getCallsEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_calls_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionRule());
            					}
            					set(
            						current,
            						"calls",
            						lv_calls_1_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:729:3: (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEventSetManagerDsl.g:730:4: otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEventSetManagerDsl.g:734:4: ( (lv_params_3_0= ruleActionParam ) )
                    // InternalEventSetManagerDsl.g:735:5: (lv_params_3_0= ruleActionParam )
                    {
                    // InternalEventSetManagerDsl.g:735:5: (lv_params_3_0= ruleActionParam )
                    // InternalEventSetManagerDsl.g:736:6: lv_params_3_0= ruleActionParam
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getParamsActionParamParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_params_3_0=ruleActionParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.ActionParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventSetManagerDsl.g:753:4: (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:754:5: otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:758:5: ( (lv_params_5_0= ruleActionParam ) )
                    	    // InternalEventSetManagerDsl.g:759:6: (lv_params_5_0= ruleActionParam )
                    	    {
                    	    // InternalEventSetManagerDsl.g:759:6: (lv_params_5_0= ruleActionParam )
                    	    // InternalEventSetManagerDsl.g:760:7: lv_params_5_0= ruleActionParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getParamsActionParamParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_params_5_0=ruleActionParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_5_0,
                    	    								"uam.eagledata.dsl.events.EventSetManagerDsl.ActionParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionParam"
    // InternalEventSetManagerDsl.g:787:1: entryRuleActionParam returns [EObject current=null] : iv_ruleActionParam= ruleActionParam EOF ;
    public final EObject entryRuleActionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParam = null;


        try {
            // InternalEventSetManagerDsl.g:787:52: (iv_ruleActionParam= ruleActionParam EOF )
            // InternalEventSetManagerDsl.g:788:2: iv_ruleActionParam= ruleActionParam EOF
            {
             newCompositeNode(grammarAccess.getActionParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionParam=ruleActionParam();

            state._fsp--;

             current =iv_ruleActionParam; 
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
    // $ANTLR end "entryRuleActionParam"


    // $ANTLR start "ruleActionParam"
    // InternalEventSetManagerDsl.g:794:1: ruleActionParam returns [EObject current=null] : (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam ) ;
    public final EObject ruleActionParam() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptParam_0 = null;

        EObject this_StringParam_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:800:2: ( (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam ) )
            // InternalEventSetManagerDsl.g:801:2: (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam )
            {
            // InternalEventSetManagerDsl.g:801:2: (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==19) ) {
                    alt11=2;
                }
                else if ( (LA11_1==23) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==19) ) {
                    alt11=2;
                }
                else if ( (LA11_2==23) ) {
                    alt11=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalEventSetManagerDsl.g:802:3: this_ConceptParam_0= ruleConceptParam
                    {

                    			newCompositeNode(grammarAccess.getActionParamAccess().getConceptParamParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConceptParam_0=ruleConceptParam();

                    state._fsp--;


                    			current = this_ConceptParam_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:811:3: this_StringParam_1= ruleStringParam
                    {

                    			newCompositeNode(grammarAccess.getActionParamAccess().getStringParamParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringParam_1=ruleStringParam();

                    state._fsp--;


                    			current = this_StringParam_1;
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
    // $ANTLR end "ruleActionParam"


    // $ANTLR start "entryRuleConceptParam"
    // InternalEventSetManagerDsl.g:823:1: entryRuleConceptParam returns [EObject current=null] : iv_ruleConceptParam= ruleConceptParam EOF ;
    public final EObject entryRuleConceptParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptParam = null;


        try {
            // InternalEventSetManagerDsl.g:823:53: (iv_ruleConceptParam= ruleConceptParam EOF )
            // InternalEventSetManagerDsl.g:824:2: iv_ruleConceptParam= ruleConceptParam EOF
            {
             newCompositeNode(grammarAccess.getConceptParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConceptParam=ruleConceptParam();

            state._fsp--;

             current =iv_ruleConceptParam; 
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
    // $ANTLR end "entryRuleConceptParam"


    // $ANTLR start "ruleConceptParam"
    // InternalEventSetManagerDsl.g:830:1: ruleConceptParam returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleConceptParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:836:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalEventSetManagerDsl.g:837:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalEventSetManagerDsl.g:837:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) )
            // InternalEventSetManagerDsl.g:838:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) )
            {
            // InternalEventSetManagerDsl.g:838:3: ()
            // InternalEventSetManagerDsl.g:839:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConceptParamAccess().getConceptParamAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:845:3: ( (lv_key_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:846:4: (lv_key_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:846:4: (lv_key_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:847:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConceptParamAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_16);
            lv_key_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConceptParamRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getConceptParamAccess().getLessThanSignEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:868:3: ( (otherlv_3= RULE_ID ) )
            // InternalEventSetManagerDsl.g:869:4: (otherlv_3= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:869:4: (otherlv_3= RULE_ID )
            // InternalEventSetManagerDsl.g:870:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConceptParamRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getConceptParamAccess().getValueConceptCrossReference_3_0());
            				

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
    // $ANTLR end "ruleConceptParam"


    // $ANTLR start "entryRuleStringParam"
    // InternalEventSetManagerDsl.g:885:1: entryRuleStringParam returns [EObject current=null] : iv_ruleStringParam= ruleStringParam EOF ;
    public final EObject entryRuleStringParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParam = null;


        try {
            // InternalEventSetManagerDsl.g:885:52: (iv_ruleStringParam= ruleStringParam EOF )
            // InternalEventSetManagerDsl.g:886:2: iv_ruleStringParam= ruleStringParam EOF
            {
             newCompositeNode(grammarAccess.getStringParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringParam=ruleStringParam();

            state._fsp--;

             current =iv_ruleStringParam; 
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
    // $ANTLR end "entryRuleStringParam"


    // $ANTLR start "ruleStringParam"
    // InternalEventSetManagerDsl.g:892:1: ruleStringParam returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleStringParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:898:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:899:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:899:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:900:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:900:3: ()
            // InternalEventSetManagerDsl.g:901:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringParamAccess().getStringParamAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:907:3: ( (lv_key_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:908:4: (lv_key_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:908:4: (lv_key_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:909:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringParamAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_key_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringParamRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStringParamAccess().getEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:930:3: ( (lv_value_3_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:931:4: (lv_value_3_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:931:4: (lv_value_3_0= ruleEString )
            // InternalEventSetManagerDsl.g:932:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringParamAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringParamRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
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
    // $ANTLR end "ruleStringParam"


    // $ANTLR start "entryRuleEString"
    // InternalEventSetManagerDsl.g:953:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEventSetManagerDsl.g:953:47: (iv_ruleEString= ruleEString EOF )
            // InternalEventSetManagerDsl.g:954:2: iv_ruleEString= ruleEString EOF
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
    // InternalEventSetManagerDsl.g:960:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:966:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEventSetManagerDsl.g:967:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:967:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEventSetManagerDsl.g:968:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:976:3: this_ID_1= RULE_ID
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
    // InternalEventSetManagerDsl.g:987:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:993:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalEventSetManagerDsl.g:994:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalEventSetManagerDsl.g:994:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt13=1;
                }
                break;
            case 25:
                {
                alt13=2;
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                alt13=4;
                }
                break;
            case 28:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalEventSetManagerDsl.g:995:3: (enumLiteral_0= 'String' )
                    {
                    // InternalEventSetManagerDsl.g:995:3: (enumLiteral_0= 'String' )
                    // InternalEventSetManagerDsl.g:996:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:1003:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalEventSetManagerDsl.g:1003:3: (enumLiteral_1= 'Int' )
                    // InternalEventSetManagerDsl.g:1004:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEventSetManagerDsl.g:1011:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalEventSetManagerDsl.g:1011:3: (enumLiteral_2= 'Boolean' )
                    // InternalEventSetManagerDsl.g:1012:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEventSetManagerDsl.g:1019:3: (enumLiteral_3= 'Float' )
                    {
                    // InternalEventSetManagerDsl.g:1019:3: (enumLiteral_3= 'Float' )
                    // InternalEventSetManagerDsl.g:1020:4: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEventSetManagerDsl.g:1027:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalEventSetManagerDsl.g:1027:3: (enumLiteral_4= 'Double' )
                    // InternalEventSetManagerDsl.g:1028:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_2); 

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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\2\10\2\uffff";
    static final String dfa_3s = "\1\30\5\5\2\20\2\uffff";
    static final String dfa_4s = "\1\34\5\6\2\34\2\uffff";
    static final String dfa_5s = "\10\uffff\1\1\1\2";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\10\2\uffff\1\11\4\uffff\5\10",
            "\1\10\2\uffff\1\11\4\uffff\5\10",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "515:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001F000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001F010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});

}