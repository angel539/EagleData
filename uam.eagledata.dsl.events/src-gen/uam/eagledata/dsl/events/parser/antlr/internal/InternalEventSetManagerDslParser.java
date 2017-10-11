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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_ID", "RULE_BOOLEAN", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'['", "']'", "'connection'", "'and'", "'pattern'", "'in'", "'if'", "'then'", "'='", "'('", "')'", "'<='", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=4;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
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
    // InternalEventSetManagerDsl.g:72:1: ruleEventSetManager returns [EObject current=null] : ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )* ) ;
    public final EObject ruleEventSetManager() throws RecognitionException {
        EObject current = null;

        EObject lv_geos_0_0 = null;

        EObject lv_geos_1_0 = null;

        EObject lv_events_2_0 = null;

        EObject lv_events_3_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:78:2: ( ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )* ) )
            // InternalEventSetManagerDsl.g:79:2: ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )* )
            {
            // InternalEventSetManagerDsl.g:79:2: ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )* )
            // InternalEventSetManagerDsl.g:80:3: ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )*
            {
            // InternalEventSetManagerDsl.g:80:3: ( (lv_geos_0_0= ruleGeographicalElement ) )
            // InternalEventSetManagerDsl.g:81:4: (lv_geos_0_0= ruleGeographicalElement )
            {
            // InternalEventSetManagerDsl.g:81:4: (lv_geos_0_0= ruleGeographicalElement )
            // InternalEventSetManagerDsl.g:82:5: lv_geos_0_0= ruleGeographicalElement
            {

            					newCompositeNode(grammarAccess.getEventSetManagerAccess().getGeosGeographicalElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_geos_0_0=ruleGeographicalElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
            					}
            					add(
            						current,
            						"geos",
            						lv_geos_0_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.GeographicalElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:99:3: ( (lv_geos_1_0= ruleGeographicalElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==RULE_STRING) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:100:4: (lv_geos_1_0= ruleGeographicalElement )
            	    {
            	    // InternalEventSetManagerDsl.g:100:4: (lv_geos_1_0= ruleGeographicalElement )
            	    // InternalEventSetManagerDsl.g:101:5: lv_geos_1_0= ruleGeographicalElement
            	    {

            	    					newCompositeNode(grammarAccess.getEventSetManagerAccess().getGeosGeographicalElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_geos_1_0=ruleGeographicalElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"geos",
            	    						lv_geos_1_0,
            	    						"uam.eagledata.dsl.events.EventSetManagerDsl.GeographicalElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEventSetManagerDsl.g:118:3: ( (lv_events_2_0= ruleEvent ) )
            // InternalEventSetManagerDsl.g:119:4: (lv_events_2_0= ruleEvent )
            {
            // InternalEventSetManagerDsl.g:119:4: (lv_events_2_0= ruleEvent )
            // InternalEventSetManagerDsl.g:120:5: lv_events_2_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_events_2_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
            					}
            					add(
            						current,
            						"events",
            						lv_events_2_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:137:3: ( (lv_events_3_0= ruleEvent ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18||LA2_0==20) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:138:4: (lv_events_3_0= ruleEvent )
            	    {
            	    // InternalEventSetManagerDsl.g:138:4: (lv_events_3_0= ruleEvent )
            	    // InternalEventSetManagerDsl.g:139:5: lv_events_3_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_events_3_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_3_0,
            	    						"uam.eagledata.dsl.events.EventSetManagerDsl.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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


    // $ANTLR start "entryRuleGeographicalElement"
    // InternalEventSetManagerDsl.g:160:1: entryRuleGeographicalElement returns [EObject current=null] : iv_ruleGeographicalElement= ruleGeographicalElement EOF ;
    public final EObject entryRuleGeographicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeographicalElement = null;


        try {
            // InternalEventSetManagerDsl.g:160:60: (iv_ruleGeographicalElement= ruleGeographicalElement EOF )
            // InternalEventSetManagerDsl.g:161:2: iv_ruleGeographicalElement= ruleGeographicalElement EOF
            {
             newCompositeNode(grammarAccess.getGeographicalElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGeographicalElement=ruleGeographicalElement();

            state._fsp--;

             current =iv_ruleGeographicalElement; 
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
    // $ANTLR end "entryRuleGeographicalElement"


    // $ANTLR start "ruleGeographicalElement"
    // InternalEventSetManagerDsl.g:167:1: ruleGeographicalElement returns [EObject current=null] : (this_Point_0= rulePoint | this_Region_1= ruleRegion ) ;
    public final EObject ruleGeographicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Point_0 = null;

        EObject this_Region_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:173:2: ( (this_Point_0= rulePoint | this_Region_1= ruleRegion ) )
            // InternalEventSetManagerDsl.g:174:2: (this_Point_0= rulePoint | this_Region_1= ruleRegion )
            {
            // InternalEventSetManagerDsl.g:174:2: (this_Point_0= rulePoint | this_Region_1= ruleRegion )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==16) ) {
                    alt3=2;
                }
                else if ( (LA3_1==13) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==13) ) {
                    alt3=1;
                }
                else if ( (LA3_2==16) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEventSetManagerDsl.g:175:3: this_Point_0= rulePoint
                    {

                    			newCompositeNode(grammarAccess.getGeographicalElementAccess().getPointParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Point_0=rulePoint();

                    state._fsp--;


                    			current = this_Point_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:184:3: this_Region_1= ruleRegion
                    {

                    			newCompositeNode(grammarAccess.getGeographicalElementAccess().getRegionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Region_1=ruleRegion();

                    state._fsp--;


                    			current = this_Region_1;
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
    // $ANTLR end "ruleGeographicalElement"


    // $ANTLR start "entryRulePoint"
    // InternalEventSetManagerDsl.g:196:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalEventSetManagerDsl.g:196:46: (iv_rulePoint= rulePoint EOF )
            // InternalEventSetManagerDsl.g:197:2: iv_rulePoint= rulePoint EOF
            {
             newCompositeNode(grammarAccess.getPointRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoint=rulePoint();

            state._fsp--;

             current =iv_rulePoint; 
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
    // $ANTLR end "entryRulePoint"


    // $ANTLR start "rulePoint"
    // InternalEventSetManagerDsl.g:203:1: rulePoint returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' ) ;
    public final EObject rulePoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_lat_3_0=null;
        Token otherlv_4=null;
        Token lv_long_5_0=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:209:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' ) )
            // InternalEventSetManagerDsl.g:210:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' )
            {
            // InternalEventSetManagerDsl.g:210:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' )
            // InternalEventSetManagerDsl.g:211:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}'
            {
            // InternalEventSetManagerDsl.g:211:3: ()
            // InternalEventSetManagerDsl.g:212:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointAccess().getPointAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:218:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:219:4: (lv_name_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:219:4: (lv_name_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:220:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPointAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPointRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEventSetManagerDsl.g:241:3: ( (lv_lat_3_0= RULE_DOUBLE ) )
            // InternalEventSetManagerDsl.g:242:4: (lv_lat_3_0= RULE_DOUBLE )
            {
            // InternalEventSetManagerDsl.g:242:4: (lv_lat_3_0= RULE_DOUBLE )
            // InternalEventSetManagerDsl.g:243:5: lv_lat_3_0= RULE_DOUBLE
            {
            lv_lat_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_7); 

            					newLeafNode(lv_lat_3_0, grammarAccess.getPointAccess().getLatDOUBLETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lat",
            						lv_lat_3_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.DOUBLE");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getCommaKeyword_4());
            		
            // InternalEventSetManagerDsl.g:263:3: ( (lv_long_5_0= RULE_DOUBLE ) )
            // InternalEventSetManagerDsl.g:264:4: (lv_long_5_0= RULE_DOUBLE )
            {
            // InternalEventSetManagerDsl.g:264:4: (lv_long_5_0= RULE_DOUBLE )
            // InternalEventSetManagerDsl.g:265:5: lv_long_5_0= RULE_DOUBLE
            {
            lv_long_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_8); 

            					newLeafNode(lv_long_5_0, grammarAccess.getPointAccess().getLongDOUBLETerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPointRule());
            					}
            					setWithLastConsumed(
            						current,
            						"long",
            						lv_long_5_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.DOUBLE");
            				

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPointAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePoint"


    // $ANTLR start "entryRuleRegion"
    // InternalEventSetManagerDsl.g:289:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalEventSetManagerDsl.g:289:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalEventSetManagerDsl.g:290:2: iv_ruleRegion= ruleRegion EOF
            {
             newCompositeNode(grammarAccess.getRegionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegion=ruleRegion();

            state._fsp--;

             current =iv_ruleRegion; 
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
    // $ANTLR end "entryRuleRegion"


    // $ANTLR start "ruleRegion"
    // InternalEventSetManagerDsl.g:296:1: ruleRegion returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' ) ;
    public final EObject ruleRegion() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_points_3_0 = null;

        EObject lv_points_5_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:302:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' ) )
            // InternalEventSetManagerDsl.g:303:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' )
            {
            // InternalEventSetManagerDsl.g:303:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' )
            // InternalEventSetManagerDsl.g:304:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']'
            {
            // InternalEventSetManagerDsl.g:304:3: ()
            // InternalEventSetManagerDsl.g:305:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegionAccess().getRegionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:311:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:312:4: (lv_name_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:312:4: (lv_name_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:313:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRegionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRegionAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalEventSetManagerDsl.g:334:3: ( (lv_points_3_0= rulePoint ) )
            // InternalEventSetManagerDsl.g:335:4: (lv_points_3_0= rulePoint )
            {
            // InternalEventSetManagerDsl.g:335:4: (lv_points_3_0= rulePoint )
            // InternalEventSetManagerDsl.g:336:5: lv_points_3_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getRegionAccess().getPointsPointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_points_3_0=rulePoint();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegionRule());
            					}
            					add(
            						current,
            						"points",
            						lv_points_3_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Point");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:353:3: (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:354:4: otherlv_4= ',' ( (lv_points_5_0= rulePoint ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRegionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalEventSetManagerDsl.g:358:4: ( (lv_points_5_0= rulePoint ) )
            	    // InternalEventSetManagerDsl.g:359:5: (lv_points_5_0= rulePoint )
            	    {
            	    // InternalEventSetManagerDsl.g:359:5: (lv_points_5_0= rulePoint )
            	    // InternalEventSetManagerDsl.g:360:6: lv_points_5_0= rulePoint
            	    {

            	    						newCompositeNode(grammarAccess.getRegionAccess().getPointsPointParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_points_5_0=rulePoint();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRegionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"points",
            	    							lv_points_5_0,
            	    							"uam.eagledata.dsl.events.EventSetManagerDsl.Point");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRegionAccess().getRightSquareBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRegion"


    // $ANTLR start "entryRuleEvent"
    // InternalEventSetManagerDsl.g:386:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalEventSetManagerDsl.g:386:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalEventSetManagerDsl.g:387:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalEventSetManagerDsl.g:393:1: ruleEvent returns [EObject current=null] : ( () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'in' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_concepts_10_0= ruleConcept ) ) ( (lv_concepts_11_0= ruleConcept ) )* otherlv_12= '}' (otherlv_13= 'if' ( (lv_when_14_0= ruleCondition ) ) )? (otherlv_15= 'then' ( (lv_triggers_16_0= ruleAction ) ) ( (lv_triggers_17_0= ruleAction ) )* ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_dataconnection_2_0 = null;

        AntlrDatatypeRuleToken lv_dataconnection_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_concepts_10_0 = null;

        EObject lv_concepts_11_0 = null;

        EObject lv_when_14_0 = null;

        EObject lv_triggers_16_0 = null;

        EObject lv_triggers_17_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:399:2: ( ( () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'in' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_concepts_10_0= ruleConcept ) ) ( (lv_concepts_11_0= ruleConcept ) )* otherlv_12= '}' (otherlv_13= 'if' ( (lv_when_14_0= ruleCondition ) ) )? (otherlv_15= 'then' ( (lv_triggers_16_0= ruleAction ) ) ( (lv_triggers_17_0= ruleAction ) )* ) ) )
            // InternalEventSetManagerDsl.g:400:2: ( () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'in' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_concepts_10_0= ruleConcept ) ) ( (lv_concepts_11_0= ruleConcept ) )* otherlv_12= '}' (otherlv_13= 'if' ( (lv_when_14_0= ruleCondition ) ) )? (otherlv_15= 'then' ( (lv_triggers_16_0= ruleAction ) ) ( (lv_triggers_17_0= ruleAction ) )* ) )
            {
            // InternalEventSetManagerDsl.g:400:2: ( () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'in' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_concepts_10_0= ruleConcept ) ) ( (lv_concepts_11_0= ruleConcept ) )* otherlv_12= '}' (otherlv_13= 'if' ( (lv_when_14_0= ruleCondition ) ) )? (otherlv_15= 'then' ( (lv_triggers_16_0= ruleAction ) ) ( (lv_triggers_17_0= ruleAction ) )* ) )
            // InternalEventSetManagerDsl.g:401:3: () (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) (otherlv_7= 'in' ( (otherlv_8= RULE_ID ) ) )? otherlv_9= '{' ( (lv_concepts_10_0= ruleConcept ) ) ( (lv_concepts_11_0= ruleConcept ) )* otherlv_12= '}' (otherlv_13= 'if' ( (lv_when_14_0= ruleCondition ) ) )? (otherlv_15= 'then' ( (lv_triggers_16_0= ruleAction ) ) ( (lv_triggers_17_0= ruleAction ) )* )
            {
            // InternalEventSetManagerDsl.g:401:3: ()
            // InternalEventSetManagerDsl.g:402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:408:3: (otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEventSetManagerDsl.g:409:4: otherlv_1= 'connection' ( (lv_dataconnection_2_0= ruleEString ) ) (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )*
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getConnectionKeyword_1_0());
                    			
                    // InternalEventSetManagerDsl.g:413:4: ( (lv_dataconnection_2_0= ruleEString ) )
                    // InternalEventSetManagerDsl.g:414:5: (lv_dataconnection_2_0= ruleEString )
                    {
                    // InternalEventSetManagerDsl.g:414:5: (lv_dataconnection_2_0= ruleEString )
                    // InternalEventSetManagerDsl.g:415:6: lv_dataconnection_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getDataconnectionEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    // InternalEventSetManagerDsl.g:432:4: (otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:433:5: otherlv_3= 'and' ( (lv_dataconnection_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,19,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEventAccess().getAndKeyword_1_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:437:5: ( (lv_dataconnection_4_0= ruleEString ) )
                    	    // InternalEventSetManagerDsl.g:438:6: (lv_dataconnection_4_0= ruleEString )
                    	    {
                    	    // InternalEventSetManagerDsl.g:438:6: (lv_dataconnection_4_0= ruleEString )
                    	    // InternalEventSetManagerDsl.g:439:7: lv_dataconnection_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventAccess().getDataconnectionEStringParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
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
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getEventAccess().getPatternKeyword_2());
            		
            // InternalEventSetManagerDsl.g:462:3: ( (lv_name_6_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:463:4: (lv_name_6_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:463:4: (lv_name_6_0= ruleEString )
            // InternalEventSetManagerDsl.g:464:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalEventSetManagerDsl.g:481:3: (otherlv_7= 'in' ( (otherlv_8= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEventSetManagerDsl.g:482:4: otherlv_7= 'in' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventAccess().getInKeyword_4_0());
                    			
                    // InternalEventSetManagerDsl.g:486:4: ( (otherlv_8= RULE_ID ) )
                    // InternalEventSetManagerDsl.g:487:5: (otherlv_8= RULE_ID )
                    {
                    // InternalEventSetManagerDsl.g:487:5: (otherlv_8= RULE_ID )
                    // InternalEventSetManagerDsl.g:488:6: otherlv_8= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_8, grammarAccess.getEventAccess().getGeoGeographicalElementCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalEventSetManagerDsl.g:504:3: ( (lv_concepts_10_0= ruleConcept ) )
            // InternalEventSetManagerDsl.g:505:4: (lv_concepts_10_0= ruleConcept )
            {
            // InternalEventSetManagerDsl.g:505:4: (lv_concepts_10_0= ruleConcept )
            // InternalEventSetManagerDsl.g:506:5: lv_concepts_10_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_concepts_10_0=ruleConcept();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					add(
            						current,
            						"concepts",
            						lv_concepts_10_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Concept");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:523:3: ( (lv_concepts_11_0= ruleConcept ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=28 && LA8_0<=32)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:524:4: (lv_concepts_11_0= ruleConcept )
            	    {
            	    // InternalEventSetManagerDsl.g:524:4: (lv_concepts_11_0= ruleConcept )
            	    // InternalEventSetManagerDsl.g:525:5: lv_concepts_11_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_concepts_11_0=ruleConcept();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventRule());
            	    					}
            	    					add(
            	    						current,
            	    						"concepts",
            	    						lv_concepts_11_0,
            	    						"uam.eagledata.dsl.events.EventSetManagerDsl.Concept");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_12=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_12, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_8());
            		
            // InternalEventSetManagerDsl.g:546:3: (otherlv_13= 'if' ( (lv_when_14_0= ruleCondition ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEventSetManagerDsl.g:547:4: otherlv_13= 'if' ( (lv_when_14_0= ruleCondition ) )
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getEventAccess().getIfKeyword_9_0());
                    			
                    // InternalEventSetManagerDsl.g:551:4: ( (lv_when_14_0= ruleCondition ) )
                    // InternalEventSetManagerDsl.g:552:5: (lv_when_14_0= ruleCondition )
                    {
                    // InternalEventSetManagerDsl.g:552:5: (lv_when_14_0= ruleCondition )
                    // InternalEventSetManagerDsl.g:553:6: lv_when_14_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getWhenConditionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_when_14_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"when",
                    							lv_when_14_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventSetManagerDsl.g:571:3: (otherlv_15= 'then' ( (lv_triggers_16_0= ruleAction ) ) ( (lv_triggers_17_0= ruleAction ) )* )
            // InternalEventSetManagerDsl.g:572:4: otherlv_15= 'then' ( (lv_triggers_16_0= ruleAction ) ) ( (lv_triggers_17_0= ruleAction ) )*
            {
            otherlv_15=(Token)match(input,23,FOLLOW_10); 

            				newLeafNode(otherlv_15, grammarAccess.getEventAccess().getThenKeyword_10_0());
            			
            // InternalEventSetManagerDsl.g:576:4: ( (lv_triggers_16_0= ruleAction ) )
            // InternalEventSetManagerDsl.g:577:5: (lv_triggers_16_0= ruleAction )
            {
            // InternalEventSetManagerDsl.g:577:5: (lv_triggers_16_0= ruleAction )
            // InternalEventSetManagerDsl.g:578:6: lv_triggers_16_0= ruleAction
            {

            						newCompositeNode(grammarAccess.getEventAccess().getTriggersActionParserRuleCall_10_1_0());
            					
            pushFollow(FOLLOW_20);
            lv_triggers_16_0=ruleAction();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEventRule());
            						}
            						add(
            							current,
            							"triggers",
            							lv_triggers_16_0,
            							"uam.eagledata.dsl.events.EventSetManagerDsl.Action");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalEventSetManagerDsl.g:595:4: ( (lv_triggers_17_0= ruleAction ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID||LA10_0==RULE_STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:596:5: (lv_triggers_17_0= ruleAction )
            	    {
            	    // InternalEventSetManagerDsl.g:596:5: (lv_triggers_17_0= ruleAction )
            	    // InternalEventSetManagerDsl.g:597:6: lv_triggers_17_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getEventAccess().getTriggersActionParserRuleCall_10_2_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_triggers_17_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"triggers",
            	    							lv_triggers_17_0,
            	    							"uam.eagledata.dsl.events.EventSetManagerDsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalEventSetManagerDsl.g:619:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalEventSetManagerDsl.g:619:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalEventSetManagerDsl.g:620:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalEventSetManagerDsl.g:626:1: ruleCondition returns [EObject current=null] : (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_BinaryExpression_0 = null;

        EObject this_BooleanExpression_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:632:2: ( (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression ) )
            // InternalEventSetManagerDsl.g:633:2: (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression )
            {
            // InternalEventSetManagerDsl.g:633:2: (this_BinaryExpression_0= ruleBinaryExpression | this_BooleanExpression_1= ruleBooleanExpression )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID||LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_BOOLEAN) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalEventSetManagerDsl.g:634:3: this_BinaryExpression_0= ruleBinaryExpression
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
                    // InternalEventSetManagerDsl.g:643:3: this_BooleanExpression_1= ruleBooleanExpression
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
    // InternalEventSetManagerDsl.g:655:1: entryRuleBinaryExpression returns [EObject current=null] : iv_ruleBinaryExpression= ruleBinaryExpression EOF ;
    public final EObject entryRuleBinaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryExpression = null;


        try {
            // InternalEventSetManagerDsl.g:655:57: (iv_ruleBinaryExpression= ruleBinaryExpression EOF )
            // InternalEventSetManagerDsl.g:656:2: iv_ruleBinaryExpression= ruleBinaryExpression EOF
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
    // InternalEventSetManagerDsl.g:662:1: ruleBinaryExpression returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleBinaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:668:2: ( ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) ) ) )
            // InternalEventSetManagerDsl.g:669:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) ) )
            {
            // InternalEventSetManagerDsl.g:669:2: ( ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) ) )
            // InternalEventSetManagerDsl.g:670:3: ( ( ruleEString ) ) otherlv_1= '=' ( (lv_right_2_0= ruleLiteral ) )
            {
            // InternalEventSetManagerDsl.g:670:3: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:671:4: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:671:4: ( ruleEString )
            // InternalEventSetManagerDsl.g:672:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBinaryExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getBinaryExpressionAccess().getLeftConceptCrossReference_0_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryExpressionAccess().getEqualsSignKeyword_1());
            		
            // InternalEventSetManagerDsl.g:690:3: ( (lv_right_2_0= ruleLiteral ) )
            // InternalEventSetManagerDsl.g:691:4: (lv_right_2_0= ruleLiteral )
            {
            // InternalEventSetManagerDsl.g:691:4: (lv_right_2_0= ruleLiteral )
            // InternalEventSetManagerDsl.g:692:5: lv_right_2_0= ruleLiteral
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
    // InternalEventSetManagerDsl.g:713:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEventSetManagerDsl.g:713:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEventSetManagerDsl.g:714:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalEventSetManagerDsl.g:720:1: ruleLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:726:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:727:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:727:2: ( (lv_value_0_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:728:3: (lv_value_0_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:728:3: (lv_value_0_0= ruleEString )
            // InternalEventSetManagerDsl.g:729:4: lv_value_0_0= ruleEString
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
    // InternalEventSetManagerDsl.g:749:1: entryRuleBooleanExpression returns [EObject current=null] : iv_ruleBooleanExpression= ruleBooleanExpression EOF ;
    public final EObject entryRuleBooleanExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpression = null;


        try {
            // InternalEventSetManagerDsl.g:749:58: (iv_ruleBooleanExpression= ruleBooleanExpression EOF )
            // InternalEventSetManagerDsl.g:750:2: iv_ruleBooleanExpression= ruleBooleanExpression EOF
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
    // InternalEventSetManagerDsl.g:756:1: ruleBooleanExpression returns [EObject current=null] : ( (lv_expression_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:762:2: ( ( (lv_expression_0_0= RULE_BOOLEAN ) ) )
            // InternalEventSetManagerDsl.g:763:2: ( (lv_expression_0_0= RULE_BOOLEAN ) )
            {
            // InternalEventSetManagerDsl.g:763:2: ( (lv_expression_0_0= RULE_BOOLEAN ) )
            // InternalEventSetManagerDsl.g:764:3: (lv_expression_0_0= RULE_BOOLEAN )
            {
            // InternalEventSetManagerDsl.g:764:3: (lv_expression_0_0= RULE_BOOLEAN )
            // InternalEventSetManagerDsl.g:765:4: lv_expression_0_0= RULE_BOOLEAN
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
    // InternalEventSetManagerDsl.g:784:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalEventSetManagerDsl.g:784:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalEventSetManagerDsl.g:785:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalEventSetManagerDsl.g:791:1: ruleConcept returns [EObject current=null] : (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_KeyConcept_0 = null;

        EObject this_RegexConcept_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:797:2: ( (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) )
            // InternalEventSetManagerDsl.g:798:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            {
            // InternalEventSetManagerDsl.g:798:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalEventSetManagerDsl.g:799:3: this_KeyConcept_0= ruleKeyConcept
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
                    // InternalEventSetManagerDsl.g:808:3: this_RegexConcept_1= ruleRegexConcept
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
    // InternalEventSetManagerDsl.g:820:1: entryRuleKeyConcept returns [EObject current=null] : iv_ruleKeyConcept= ruleKeyConcept EOF ;
    public final EObject entryRuleKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyConcept = null;


        try {
            // InternalEventSetManagerDsl.g:820:51: (iv_ruleKeyConcept= ruleKeyConcept EOF )
            // InternalEventSetManagerDsl.g:821:2: iv_ruleKeyConcept= ruleKeyConcept EOF
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
    // InternalEventSetManagerDsl.g:827:1: ruleKeyConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyConcept() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:833:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:834:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:834:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:835:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:835:3: ()
            // InternalEventSetManagerDsl.g:836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyConceptAccess().getKeyConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:842:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:843:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:843:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:844:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getKeyConceptAccess().getTypeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalEventSetManagerDsl.g:861:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:862:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:862:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:863:5: lv_name_2_0= ruleEString
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
    // InternalEventSetManagerDsl.g:884:1: entryRuleRegexConcept returns [EObject current=null] : iv_ruleRegexConcept= ruleRegexConcept EOF ;
    public final EObject entryRuleRegexConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexConcept = null;


        try {
            // InternalEventSetManagerDsl.g:884:53: (iv_ruleRegexConcept= ruleRegexConcept EOF )
            // InternalEventSetManagerDsl.g:885:2: iv_ruleRegexConcept= ruleRegexConcept EOF
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
    // InternalEventSetManagerDsl.g:891:1: ruleRegexConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) ;
    public final EObject ruleRegexConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_regex_4_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:897:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:898:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:898:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:899:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:899:3: ()
            // InternalEventSetManagerDsl.g:900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegexConceptAccess().getRegexConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:906:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:907:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:907:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:908:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getRegexConceptAccess().getTypeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalEventSetManagerDsl.g:925:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:926:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:926:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:927:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRegexConceptAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_3=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRegexConceptAccess().getEqualsSignKeyword_3());
            		
            // InternalEventSetManagerDsl.g:948:3: ( (lv_regex_4_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:949:4: (lv_regex_4_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:949:4: (lv_regex_4_0= ruleEString )
            // InternalEventSetManagerDsl.g:950:5: lv_regex_4_0= ruleEString
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
    // InternalEventSetManagerDsl.g:971:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalEventSetManagerDsl.g:971:47: (iv_ruleAction= ruleAction EOF )
            // InternalEventSetManagerDsl.g:972:2: iv_ruleAction= ruleAction EOF
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
    // InternalEventSetManagerDsl.g:978:1: ruleAction returns [EObject current=null] : ( () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? ) ;
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
            // InternalEventSetManagerDsl.g:984:2: ( ( () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? ) )
            // InternalEventSetManagerDsl.g:985:2: ( () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? )
            {
            // InternalEventSetManagerDsl.g:985:2: ( () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? )
            // InternalEventSetManagerDsl.g:986:3: () ( (lv_calls_1_0= ruleEString ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )?
            {
            // InternalEventSetManagerDsl.g:986:3: ()
            // InternalEventSetManagerDsl.g:987:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:993:3: ( (lv_calls_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:994:4: (lv_calls_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:994:4: (lv_calls_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:995:5: lv_calls_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionAccess().getCallsEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalEventSetManagerDsl.g:1012:3: (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1013:4: otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEventSetManagerDsl.g:1017:4: ( (lv_params_3_0= ruleActionParam ) )
                    // InternalEventSetManagerDsl.g:1018:5: (lv_params_3_0= ruleActionParam )
                    {
                    // InternalEventSetManagerDsl.g:1018:5: (lv_params_3_0= ruleActionParam )
                    // InternalEventSetManagerDsl.g:1019:6: lv_params_3_0= ruleActionParam
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getParamsActionParamParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalEventSetManagerDsl.g:1036:4: (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:1037:5: otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:1041:5: ( (lv_params_5_0= ruleActionParam ) )
                    	    // InternalEventSetManagerDsl.g:1042:6: (lv_params_5_0= ruleActionParam )
                    	    {
                    	    // InternalEventSetManagerDsl.g:1042:6: (lv_params_5_0= ruleActionParam )
                    	    // InternalEventSetManagerDsl.g:1043:7: lv_params_5_0= ruleActionParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionAccess().getParamsActionParamParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,26,FOLLOW_2); 

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
    // InternalEventSetManagerDsl.g:1070:1: entryRuleActionParam returns [EObject current=null] : iv_ruleActionParam= ruleActionParam EOF ;
    public final EObject entryRuleActionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParam = null;


        try {
            // InternalEventSetManagerDsl.g:1070:52: (iv_ruleActionParam= ruleActionParam EOF )
            // InternalEventSetManagerDsl.g:1071:2: iv_ruleActionParam= ruleActionParam EOF
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
    // InternalEventSetManagerDsl.g:1077:1: ruleActionParam returns [EObject current=null] : (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam ) ;
    public final EObject ruleActionParam() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptParam_0 = null;

        EObject this_StringParam_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1083:2: ( (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam ) )
            // InternalEventSetManagerDsl.g:1084:2: (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam )
            {
            // InternalEventSetManagerDsl.g:1084:2: (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==24) ) {
                    alt15=2;
                }
                else if ( (LA15_1==27) ) {
                    alt15=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0==RULE_ID) ) {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==27) ) {
                    alt15=1;
                }
                else if ( (LA15_2==24) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1085:3: this_ConceptParam_0= ruleConceptParam
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
                    // InternalEventSetManagerDsl.g:1094:3: this_StringParam_1= ruleStringParam
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
    // InternalEventSetManagerDsl.g:1106:1: entryRuleConceptParam returns [EObject current=null] : iv_ruleConceptParam= ruleConceptParam EOF ;
    public final EObject entryRuleConceptParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptParam = null;


        try {
            // InternalEventSetManagerDsl.g:1106:53: (iv_ruleConceptParam= ruleConceptParam EOF )
            // InternalEventSetManagerDsl.g:1107:2: iv_ruleConceptParam= ruleConceptParam EOF
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
    // InternalEventSetManagerDsl.g:1113:1: ruleConceptParam returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleConceptParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1119:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalEventSetManagerDsl.g:1120:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalEventSetManagerDsl.g:1120:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) )
            // InternalEventSetManagerDsl.g:1121:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) )
            {
            // InternalEventSetManagerDsl.g:1121:3: ()
            // InternalEventSetManagerDsl.g:1122:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConceptParamAccess().getConceptParamAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1128:3: ( (lv_key_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1129:4: (lv_key_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1129:4: (lv_key_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:1130:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getConceptParamAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_2=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getConceptParamAccess().getLessThanSignEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:1151:3: ( (otherlv_3= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1152:4: (otherlv_3= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1152:4: (otherlv_3= RULE_ID )
            // InternalEventSetManagerDsl.g:1153:5: otherlv_3= RULE_ID
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
    // InternalEventSetManagerDsl.g:1168:1: entryRuleStringParam returns [EObject current=null] : iv_ruleStringParam= ruleStringParam EOF ;
    public final EObject entryRuleStringParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParam = null;


        try {
            // InternalEventSetManagerDsl.g:1168:52: (iv_ruleStringParam= ruleStringParam EOF )
            // InternalEventSetManagerDsl.g:1169:2: iv_ruleStringParam= ruleStringParam EOF
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
    // InternalEventSetManagerDsl.g:1175:1: ruleStringParam returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleStringParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1181:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:1182:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:1182:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:1183:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:1183:3: ()
            // InternalEventSetManagerDsl.g:1184:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringParamAccess().getStringParamAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1190:3: ( (lv_key_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1191:4: (lv_key_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1191:4: (lv_key_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:1192:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringParamAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            otherlv_2=(Token)match(input,24,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getStringParamAccess().getEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:1213:3: ( (lv_value_3_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1214:4: (lv_value_3_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1214:4: (lv_value_3_0= ruleEString )
            // InternalEventSetManagerDsl.g:1215:5: lv_value_3_0= ruleEString
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
    // InternalEventSetManagerDsl.g:1236:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEventSetManagerDsl.g:1236:47: (iv_ruleEString= ruleEString EOF )
            // InternalEventSetManagerDsl.g:1237:2: iv_ruleEString= ruleEString EOF
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
    // InternalEventSetManagerDsl.g:1243:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1249:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1250:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1250:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1251:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:1259:3: this_ID_1= RULE_ID
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
    // InternalEventSetManagerDsl.g:1270:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1276:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalEventSetManagerDsl.g:1277:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalEventSetManagerDsl.g:1277:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            int alt17=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt17=1;
                }
                break;
            case 29:
                {
                alt17=2;
                }
                break;
            case 30:
                {
                alt17=3;
                }
                break;
            case 31:
                {
                alt17=4;
                }
                break;
            case 32:
                {
                alt17=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1278:3: (enumLiteral_0= 'String' )
                    {
                    // InternalEventSetManagerDsl.g:1278:3: (enumLiteral_0= 'String' )
                    // InternalEventSetManagerDsl.g:1279:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:1286:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalEventSetManagerDsl.g:1286:3: (enumLiteral_1= 'Int' )
                    // InternalEventSetManagerDsl.g:1287:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEventSetManagerDsl.g:1294:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalEventSetManagerDsl.g:1294:3: (enumLiteral_2= 'Boolean' )
                    // InternalEventSetManagerDsl.g:1295:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEventSetManagerDsl.g:1302:3: (enumLiteral_3= 'Float' )
                    {
                    // InternalEventSetManagerDsl.g:1302:3: (enumLiteral_3= 'Float' )
                    // InternalEventSetManagerDsl.g:1303:4: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEventSetManagerDsl.g:1310:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalEventSetManagerDsl.g:1310:3: (enumLiteral_4= 'Double' )
                    // InternalEventSetManagerDsl.g:1311:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_2); 

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


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\2\11\2\uffff";
    static final String dfa_3s = "\1\34\5\5\2\17\2\uffff";
    static final String dfa_4s = "\1\40\5\7\2\40\2\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\7\1\uffff\1\6",
            "\1\7\1\uffff\1\6",
            "\1\7\1\uffff\1\6",
            "\1\7\1\uffff\1\6",
            "\1\7\1\uffff\1\6",
            "\1\11\10\uffff\1\10\3\uffff\5\11",
            "\1\11\10\uffff\1\10\3\uffff\5\11",
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

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "798:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000001400A0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000001400A2L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000000A0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001F0008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000000A2L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004004000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});

}