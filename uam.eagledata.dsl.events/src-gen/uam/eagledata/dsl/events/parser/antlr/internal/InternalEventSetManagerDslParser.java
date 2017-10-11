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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DOUBLE", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "','", "'}'", "'['", "']'", "'connection'", "'and'", "'pattern'", "'if'", "'in'", "'then'", "'='", "'('", "')'", "'<='", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_DOUBLE=4;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
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
    // InternalEventSetManagerDsl.g:72:1: ruleEventSetManager returns [EObject current=null] : ( ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* )? ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )* ) ;
    public final EObject ruleEventSetManager() throws RecognitionException {
        EObject current = null;

        EObject lv_geos_0_0 = null;

        EObject lv_geos_1_0 = null;

        EObject lv_events_2_0 = null;

        EObject lv_events_3_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:78:2: ( ( ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* )? ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )* ) )
            // InternalEventSetManagerDsl.g:79:2: ( ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* )? ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )* )
            {
            // InternalEventSetManagerDsl.g:79:2: ( ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* )? ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )* )
            // InternalEventSetManagerDsl.g:80:3: ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* )? ( (lv_events_2_0= ruleEvent ) ) ( (lv_events_3_0= ruleEvent ) )*
            {
            // InternalEventSetManagerDsl.g:80:3: ( ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEventSetManagerDsl.g:81:4: ( (lv_geos_0_0= ruleGeographicalElement ) ) ( (lv_geos_1_0= ruleGeographicalElement ) )*
                    {
                    // InternalEventSetManagerDsl.g:81:4: ( (lv_geos_0_0= ruleGeographicalElement ) )
                    // InternalEventSetManagerDsl.g:82:5: (lv_geos_0_0= ruleGeographicalElement )
                    {
                    // InternalEventSetManagerDsl.g:82:5: (lv_geos_0_0= ruleGeographicalElement )
                    // InternalEventSetManagerDsl.g:83:6: lv_geos_0_0= ruleGeographicalElement
                    {

                    						newCompositeNode(grammarAccess.getEventSetManagerAccess().getGeosGeographicalElementParserRuleCall_0_0_0());
                    					
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

                    // InternalEventSetManagerDsl.g:100:4: ( (lv_geos_1_0= ruleGeographicalElement ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:101:5: (lv_geos_1_0= ruleGeographicalElement )
                    	    {
                    	    // InternalEventSetManagerDsl.g:101:5: (lv_geos_1_0= ruleGeographicalElement )
                    	    // InternalEventSetManagerDsl.g:102:6: lv_geos_1_0= ruleGeographicalElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getEventSetManagerAccess().getGeosGeographicalElementParserRuleCall_0_1_0());
                    	    					
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


                    }
                    break;

            }

            // InternalEventSetManagerDsl.g:120:3: ( (lv_events_2_0= ruleEvent ) )
            // InternalEventSetManagerDsl.g:121:4: (lv_events_2_0= ruleEvent )
            {
            // InternalEventSetManagerDsl.g:121:4: (lv_events_2_0= ruleEvent )
            // InternalEventSetManagerDsl.g:122:5: lv_events_2_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_1_0());
            				
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

            // InternalEventSetManagerDsl.g:139:3: ( (lv_events_3_0= ruleEvent ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:140:4: (lv_events_3_0= ruleEvent )
            	    {
            	    // InternalEventSetManagerDsl.g:140:4: (lv_events_3_0= ruleEvent )
            	    // InternalEventSetManagerDsl.g:141:5: lv_events_3_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_2_0());
            	    				
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
            	    break loop3;
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
    // InternalEventSetManagerDsl.g:162:1: entryRuleGeographicalElement returns [EObject current=null] : iv_ruleGeographicalElement= ruleGeographicalElement EOF ;
    public final EObject entryRuleGeographicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeographicalElement = null;


        try {
            // InternalEventSetManagerDsl.g:162:60: (iv_ruleGeographicalElement= ruleGeographicalElement EOF )
            // InternalEventSetManagerDsl.g:163:2: iv_ruleGeographicalElement= ruleGeographicalElement EOF
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
    // InternalEventSetManagerDsl.g:169:1: ruleGeographicalElement returns [EObject current=null] : (this_Point_0= rulePoint | this_Region_1= ruleRegion ) ;
    public final EObject ruleGeographicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Point_0 = null;

        EObject this_Region_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:175:2: ( (this_Point_0= rulePoint | this_Region_1= ruleRegion ) )
            // InternalEventSetManagerDsl.g:176:2: (this_Point_0= rulePoint | this_Region_1= ruleRegion )
            {
            // InternalEventSetManagerDsl.g:176:2: (this_Point_0= rulePoint | this_Region_1= ruleRegion )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15) ) {
                    alt4=2;
                }
                else if ( (LA4_1==12) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_ID) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==15) ) {
                    alt4=2;
                }
                else if ( (LA4_2==12) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEventSetManagerDsl.g:177:3: this_Point_0= rulePoint
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
                    // InternalEventSetManagerDsl.g:186:3: this_Region_1= ruleRegion
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
    // InternalEventSetManagerDsl.g:198:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalEventSetManagerDsl.g:198:46: (iv_rulePoint= rulePoint EOF )
            // InternalEventSetManagerDsl.g:199:2: iv_rulePoint= rulePoint EOF
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
    // InternalEventSetManagerDsl.g:205:1: rulePoint returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' ) ;
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
            // InternalEventSetManagerDsl.g:211:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' ) )
            // InternalEventSetManagerDsl.g:212:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' )
            {
            // InternalEventSetManagerDsl.g:212:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' )
            // InternalEventSetManagerDsl.g:213:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}'
            {
            // InternalEventSetManagerDsl.g:213:3: ()
            // InternalEventSetManagerDsl.g:214:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointAccess().getPointAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:220:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:221:4: (lv_name_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:221:4: (lv_name_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:222:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEventSetManagerDsl.g:243:3: ( (lv_lat_3_0= RULE_DOUBLE ) )
            // InternalEventSetManagerDsl.g:244:4: (lv_lat_3_0= RULE_DOUBLE )
            {
            // InternalEventSetManagerDsl.g:244:4: (lv_lat_3_0= RULE_DOUBLE )
            // InternalEventSetManagerDsl.g:245:5: lv_lat_3_0= RULE_DOUBLE
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

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getCommaKeyword_4());
            		
            // InternalEventSetManagerDsl.g:265:3: ( (lv_long_5_0= RULE_DOUBLE ) )
            // InternalEventSetManagerDsl.g:266:4: (lv_long_5_0= RULE_DOUBLE )
            {
            // InternalEventSetManagerDsl.g:266:4: (lv_long_5_0= RULE_DOUBLE )
            // InternalEventSetManagerDsl.g:267:5: lv_long_5_0= RULE_DOUBLE
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

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

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
    // InternalEventSetManagerDsl.g:291:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalEventSetManagerDsl.g:291:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalEventSetManagerDsl.g:292:2: iv_ruleRegion= ruleRegion EOF
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
    // InternalEventSetManagerDsl.g:298:1: ruleRegion returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' ) ;
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
            // InternalEventSetManagerDsl.g:304:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' ) )
            // InternalEventSetManagerDsl.g:305:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' )
            {
            // InternalEventSetManagerDsl.g:305:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' )
            // InternalEventSetManagerDsl.g:306:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']'
            {
            // InternalEventSetManagerDsl.g:306:3: ()
            // InternalEventSetManagerDsl.g:307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegionAccess().getRegionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:313:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:314:4: (lv_name_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:314:4: (lv_name_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:315:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRegionAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalEventSetManagerDsl.g:336:3: ( (lv_points_3_0= rulePoint ) )
            // InternalEventSetManagerDsl.g:337:4: (lv_points_3_0= rulePoint )
            {
            // InternalEventSetManagerDsl.g:337:4: (lv_points_3_0= rulePoint )
            // InternalEventSetManagerDsl.g:338:5: lv_points_3_0= rulePoint
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

            // InternalEventSetManagerDsl.g:355:3: (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:356:4: otherlv_4= ',' ( (lv_points_5_0= rulePoint ) )
            	    {
            	    otherlv_4=(Token)match(input,13,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRegionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalEventSetManagerDsl.g:360:4: ( (lv_points_5_0= rulePoint ) )
            	    // InternalEventSetManagerDsl.g:361:5: (lv_points_5_0= rulePoint )
            	    {
            	    // InternalEventSetManagerDsl.g:361:5: (lv_points_5_0= rulePoint )
            	    // InternalEventSetManagerDsl.g:362:6: lv_points_5_0= rulePoint
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
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

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
    // InternalEventSetManagerDsl.g:388:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalEventSetManagerDsl.g:388:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalEventSetManagerDsl.g:389:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalEventSetManagerDsl.g:395:1: ruleEvent returns [EObject current=null] : ( () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_concepts_8_0 = null;

        EObject lv_concepts_9_0 = null;

        EObject lv_when_11_0 = null;

        EObject lv_when_12_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:401:2: ( ( () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* ) ) )
            // InternalEventSetManagerDsl.g:402:2: ( () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* ) )
            {
            // InternalEventSetManagerDsl.g:402:2: ( () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* ) )
            // InternalEventSetManagerDsl.g:403:3: () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* )
            {
            // InternalEventSetManagerDsl.g:403:3: ()
            // InternalEventSetManagerDsl.g:404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:410:3: (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEventSetManagerDsl.g:411:4: otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getConnectionKeyword_1_0());
                    			
                    // InternalEventSetManagerDsl.g:415:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEventSetManagerDsl.g:416:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEventSetManagerDsl.g:416:5: (otherlv_2= RULE_ID )
                    // InternalEventSetManagerDsl.g:417:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_2, grammarAccess.getEventAccess().getDataconnectionsDataConnectionCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalEventSetManagerDsl.g:428:4: (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==18) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:429:5: otherlv_3= 'and' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,18,FOLLOW_12); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEventAccess().getAndKeyword_1_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:433:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalEventSetManagerDsl.g:434:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalEventSetManagerDsl.g:434:6: (otherlv_4= RULE_ID )
                    	    // InternalEventSetManagerDsl.g:435:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_13); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getEventAccess().getDataconnectionsDataConnectionCrossReference_1_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_5, grammarAccess.getEventAccess().getPatternKeyword_2());
            		
            // InternalEventSetManagerDsl.g:452:3: ( (lv_name_6_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:453:4: (lv_name_6_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:453:4: (lv_name_6_0= ruleEString )
            // InternalEventSetManagerDsl.g:454:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_7=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalEventSetManagerDsl.g:475:3: ( (lv_concepts_8_0= ruleConcept ) )
            // InternalEventSetManagerDsl.g:476:4: (lv_concepts_8_0= ruleConcept )
            {
            // InternalEventSetManagerDsl.g:476:4: (lv_concepts_8_0= ruleConcept )
            // InternalEventSetManagerDsl.g:477:5: lv_concepts_8_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalEventSetManagerDsl.g:494:3: ( (lv_concepts_9_0= ruleConcept ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=27 && LA8_0<=31)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:495:4: (lv_concepts_9_0= ruleConcept )
            	    {
            	    // InternalEventSetManagerDsl.g:495:4: (lv_concepts_9_0= ruleConcept )
            	    // InternalEventSetManagerDsl.g:496:5: lv_concepts_9_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_15);
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
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalEventSetManagerDsl.g:517:3: ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* )
            // InternalEventSetManagerDsl.g:518:4: ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )*
            {
            // InternalEventSetManagerDsl.g:518:4: ( (lv_when_11_0= ruleCondition ) )
            // InternalEventSetManagerDsl.g:519:5: (lv_when_11_0= ruleCondition )
            {
            // InternalEventSetManagerDsl.g:519:5: (lv_when_11_0= ruleCondition )
            // InternalEventSetManagerDsl.g:520:6: lv_when_11_0= ruleCondition
            {

            						newCompositeNode(grammarAccess.getEventAccess().getWhenConditionParserRuleCall_8_0_0());
            					
            pushFollow(FOLLOW_17);
            lv_when_11_0=ruleCondition();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getEventRule());
            						}
            						add(
            							current,
            							"when",
            							lv_when_11_0,
            							"uam.eagledata.dsl.events.EventSetManagerDsl.Condition");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalEventSetManagerDsl.g:537:4: ( (lv_when_12_0= ruleCondition ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=20 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:538:5: (lv_when_12_0= ruleCondition )
            	    {
            	    // InternalEventSetManagerDsl.g:538:5: (lv_when_12_0= ruleCondition )
            	    // InternalEventSetManagerDsl.g:539:6: lv_when_12_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getEventAccess().getWhenConditionParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_when_12_0=ruleCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEventRule());
            	    						}
            	    						add(
            	    							current,
            	    							"when",
            	    							lv_when_12_0,
            	    							"uam.eagledata.dsl.events.EventSetManagerDsl.Condition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalEventSetManagerDsl.g:561:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalEventSetManagerDsl.g:561:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalEventSetManagerDsl.g:562:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalEventSetManagerDsl.g:568:1: ruleCondition returns [EObject current=null] : ( () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_2_0 = null;

        EObject lv_triggers_6_0 = null;

        EObject lv_triggers_8_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:574:2: ( ( () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* ) ) )
            // InternalEventSetManagerDsl.g:575:2: ( () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* ) )
            {
            // InternalEventSetManagerDsl.g:575:2: ( () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* ) )
            // InternalEventSetManagerDsl.g:576:3: () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* )
            {
            // InternalEventSetManagerDsl.g:576:3: ()
            // InternalEventSetManagerDsl.g:577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:583:3: (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalEventSetManagerDsl.g:584:4: otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getIfKeyword_1_0());
                    			
                    // InternalEventSetManagerDsl.g:588:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalEventSetManagerDsl.g:589:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalEventSetManagerDsl.g:589:5: (lv_expression_2_0= ruleExpression )
                    // InternalEventSetManagerDsl.g:590:6: lv_expression_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_expression_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_2_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventSetManagerDsl.g:608:3: (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEventSetManagerDsl.g:609:4: otherlv_3= 'in' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getInKeyword_2_0());
                    			
                    // InternalEventSetManagerDsl.g:613:4: ( (otherlv_4= RULE_ID ) )
                    // InternalEventSetManagerDsl.g:614:5: (otherlv_4= RULE_ID )
                    {
                    // InternalEventSetManagerDsl.g:614:5: (otherlv_4= RULE_ID )
                    // InternalEventSetManagerDsl.g:615:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getGeoGeographicalElementCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventSetManagerDsl.g:627:3: (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* )
            // InternalEventSetManagerDsl.g:628:4: otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )*
            {
            otherlv_5=(Token)match(input,22,FOLLOW_12); 

            				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getThenKeyword_3_0());
            			
            // InternalEventSetManagerDsl.g:632:4: ( (lv_triggers_6_0= ruleAction ) )
            // InternalEventSetManagerDsl.g:633:5: (lv_triggers_6_0= ruleAction )
            {
            // InternalEventSetManagerDsl.g:633:5: (lv_triggers_6_0= ruleAction )
            // InternalEventSetManagerDsl.g:634:6: lv_triggers_6_0= ruleAction
            {

            						newCompositeNode(grammarAccess.getConditionAccess().getTriggersActionParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_20);
            lv_triggers_6_0=ruleAction();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getConditionRule());
            						}
            						add(
            							current,
            							"triggers",
            							lv_triggers_6_0,
            							"uam.eagledata.dsl.events.EventSetManagerDsl.Action");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalEventSetManagerDsl.g:651:4: (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:652:5: otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_12); 

            	    					newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getAndKeyword_3_2_0());
            	    				
            	    // InternalEventSetManagerDsl.g:656:5: ( (lv_triggers_8_0= ruleAction ) )
            	    // InternalEventSetManagerDsl.g:657:6: (lv_triggers_8_0= ruleAction )
            	    {
            	    // InternalEventSetManagerDsl.g:657:6: (lv_triggers_8_0= ruleAction )
            	    // InternalEventSetManagerDsl.g:658:7: lv_triggers_8_0= ruleAction
            	    {

            	    							newCompositeNode(grammarAccess.getConditionAccess().getTriggersActionParserRuleCall_3_2_1_0());
            	    						
            	    pushFollow(FOLLOW_20);
            	    lv_triggers_8_0=ruleAction();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getConditionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"triggers",
            	    								lv_triggers_8_0,
            	    								"uam.eagledata.dsl.events.EventSetManagerDsl.Action");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExpression"
    // InternalEventSetManagerDsl.g:681:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEventSetManagerDsl.g:681:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEventSetManagerDsl.g:682:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalEventSetManagerDsl.g:688:1: ruleExpression returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:694:2: ( ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) ) ) )
            // InternalEventSetManagerDsl.g:695:2: ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) ) )
            {
            // InternalEventSetManagerDsl.g:695:2: ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) ) )
            // InternalEventSetManagerDsl.g:696:3: () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) )
            {
            // InternalEventSetManagerDsl.g:696:3: ()
            // InternalEventSetManagerDsl.g:697:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpressionAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:703:3: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:704:4: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:704:4: ( ruleEString )
            // InternalEventSetManagerDsl.g:705:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftConceptCrossReference_1_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:723:3: ( (lv_right_3_0= ruleLiteral ) )
            // InternalEventSetManagerDsl.g:724:4: (lv_right_3_0= ruleLiteral )
            {
            // InternalEventSetManagerDsl.g:724:4: (lv_right_3_0= ruleLiteral )
            // InternalEventSetManagerDsl.g:725:5: lv_right_3_0= ruleLiteral
            {

            					newCompositeNode(grammarAccess.getExpressionAccess().getRightLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressionRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalEventSetManagerDsl.g:746:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEventSetManagerDsl.g:746:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEventSetManagerDsl.g:747:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalEventSetManagerDsl.g:753:1: ruleLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:759:2: ( ( () ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:760:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:760:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:761:3: () ( (lv_value_1_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:761:3: ()
            // InternalEventSetManagerDsl.g:762:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralAccess().getLiteralAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:768:3: ( (lv_value_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:769:4: (lv_value_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:769:4: (lv_value_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:770:5: lv_value_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLiteralAccess().getValueEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLiteralRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleConcept"
    // InternalEventSetManagerDsl.g:791:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalEventSetManagerDsl.g:791:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalEventSetManagerDsl.g:792:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalEventSetManagerDsl.g:798:1: ruleConcept returns [EObject current=null] : (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_KeyConcept_0 = null;

        EObject this_RegexConcept_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:804:2: ( (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) )
            // InternalEventSetManagerDsl.g:805:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            {
            // InternalEventSetManagerDsl.g:805:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalEventSetManagerDsl.g:806:3: this_KeyConcept_0= ruleKeyConcept
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
                    // InternalEventSetManagerDsl.g:815:3: this_RegexConcept_1= ruleRegexConcept
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
    // InternalEventSetManagerDsl.g:827:1: entryRuleKeyConcept returns [EObject current=null] : iv_ruleKeyConcept= ruleKeyConcept EOF ;
    public final EObject entryRuleKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyConcept = null;


        try {
            // InternalEventSetManagerDsl.g:827:51: (iv_ruleKeyConcept= ruleKeyConcept EOF )
            // InternalEventSetManagerDsl.g:828:2: iv_ruleKeyConcept= ruleKeyConcept EOF
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
    // InternalEventSetManagerDsl.g:834:1: ruleKeyConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyConcept() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:840:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:841:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:841:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:842:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:842:3: ()
            // InternalEventSetManagerDsl.g:843:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyConceptAccess().getKeyConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:849:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:850:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:850:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:851:5: lv_type_1_0= ruleType
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

            // InternalEventSetManagerDsl.g:868:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:869:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:869:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:870:5: lv_name_2_0= ruleEString
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
    // InternalEventSetManagerDsl.g:891:1: entryRuleRegexConcept returns [EObject current=null] : iv_ruleRegexConcept= ruleRegexConcept EOF ;
    public final EObject entryRuleRegexConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexConcept = null;


        try {
            // InternalEventSetManagerDsl.g:891:53: (iv_ruleRegexConcept= ruleRegexConcept EOF )
            // InternalEventSetManagerDsl.g:892:2: iv_ruleRegexConcept= ruleRegexConcept EOF
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
    // InternalEventSetManagerDsl.g:898:1: ruleRegexConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) ;
    public final EObject ruleRegexConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_regex_4_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:904:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:905:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:905:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:906:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:906:3: ()
            // InternalEventSetManagerDsl.g:907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegexConceptAccess().getRegexConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:913:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:914:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:914:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:915:5: lv_type_1_0= ruleType
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

            // InternalEventSetManagerDsl.g:932:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:933:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:933:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:934:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRegexConceptAccess().getEqualsSignKeyword_3());
            		
            // InternalEventSetManagerDsl.g:955:3: ( (lv_regex_4_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:956:4: (lv_regex_4_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:956:4: (lv_regex_4_0= ruleEString )
            // InternalEventSetManagerDsl.g:957:5: lv_regex_4_0= ruleEString
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
    // InternalEventSetManagerDsl.g:978:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalEventSetManagerDsl.g:978:47: (iv_ruleAction= ruleAction EOF )
            // InternalEventSetManagerDsl.g:979:2: iv_ruleAction= ruleAction EOF
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
    // InternalEventSetManagerDsl.g:985:1: ruleAction returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:991:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? ) )
            // InternalEventSetManagerDsl.g:992:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? )
            {
            // InternalEventSetManagerDsl.g:992:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? )
            // InternalEventSetManagerDsl.g:993:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )?
            {
            // InternalEventSetManagerDsl.g:993:3: ()
            // InternalEventSetManagerDsl.g:994:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionAccess().getActionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1000:3: ( (otherlv_1= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1001:4: (otherlv_1= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1001:4: (otherlv_1= RULE_ID )
            // InternalEventSetManagerDsl.g:1002:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(otherlv_1, grammarAccess.getActionAccess().getCallsActionExecutableExtensionCrossReference_1_0());
            				

            }


            }

            // InternalEventSetManagerDsl.g:1013:3: (otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1014:4: otherlv_2= '(' ( (lv_params_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEventSetManagerDsl.g:1018:4: ( (lv_params_3_0= ruleActionParam ) )
                    // InternalEventSetManagerDsl.g:1019:5: (lv_params_3_0= ruleActionParam )
                    {
                    // InternalEventSetManagerDsl.g:1019:5: (lv_params_3_0= ruleActionParam )
                    // InternalEventSetManagerDsl.g:1020:6: lv_params_3_0= ruleActionParam
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

                    // InternalEventSetManagerDsl.g:1037:4: (otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==13) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:1038:5: otherlv_4= ',' ( (lv_params_5_0= ruleActionParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:1042:5: ( (lv_params_5_0= ruleActionParam ) )
                    	    // InternalEventSetManagerDsl.g:1043:6: (lv_params_5_0= ruleActionParam )
                    	    {
                    	    // InternalEventSetManagerDsl.g:1043:6: (lv_params_5_0= ruleActionParam )
                    	    // InternalEventSetManagerDsl.g:1044:7: lv_params_5_0= ruleActionParam
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_2); 

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
    // InternalEventSetManagerDsl.g:1071:1: entryRuleActionParam returns [EObject current=null] : iv_ruleActionParam= ruleActionParam EOF ;
    public final EObject entryRuleActionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParam = null;


        try {
            // InternalEventSetManagerDsl.g:1071:52: (iv_ruleActionParam= ruleActionParam EOF )
            // InternalEventSetManagerDsl.g:1072:2: iv_ruleActionParam= ruleActionParam EOF
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
    // InternalEventSetManagerDsl.g:1078:1: ruleActionParam returns [EObject current=null] : (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam ) ;
    public final EObject ruleActionParam() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptParam_0 = null;

        EObject this_StringParam_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1084:2: ( (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam ) )
            // InternalEventSetManagerDsl.g:1085:2: (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam )
            {
            // InternalEventSetManagerDsl.g:1085:2: (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==23) ) {
                    alt16=2;
                }
                else if ( (LA16_1==26) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==RULE_ID) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==23) ) {
                    alt16=2;
                }
                else if ( (LA16_2==26) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1086:3: this_ConceptParam_0= ruleConceptParam
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
                    // InternalEventSetManagerDsl.g:1095:3: this_StringParam_1= ruleStringParam
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
    // InternalEventSetManagerDsl.g:1107:1: entryRuleConceptParam returns [EObject current=null] : iv_ruleConceptParam= ruleConceptParam EOF ;
    public final EObject entryRuleConceptParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptParam = null;


        try {
            // InternalEventSetManagerDsl.g:1107:53: (iv_ruleConceptParam= ruleConceptParam EOF )
            // InternalEventSetManagerDsl.g:1108:2: iv_ruleConceptParam= ruleConceptParam EOF
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
    // InternalEventSetManagerDsl.g:1114:1: ruleConceptParam returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleConceptParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1120:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalEventSetManagerDsl.g:1121:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalEventSetManagerDsl.g:1121:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) )
            // InternalEventSetManagerDsl.g:1122:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) )
            {
            // InternalEventSetManagerDsl.g:1122:3: ()
            // InternalEventSetManagerDsl.g:1123:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConceptParamAccess().getConceptParamAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1129:3: ( (lv_key_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1130:4: (lv_key_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1130:4: (lv_key_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:1131:5: lv_key_1_0= ruleEString
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

            otherlv_2=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getConceptParamAccess().getLessThanSignEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:1152:3: ( (otherlv_3= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1153:4: (otherlv_3= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1153:4: (otherlv_3= RULE_ID )
            // InternalEventSetManagerDsl.g:1154:5: otherlv_3= RULE_ID
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
    // InternalEventSetManagerDsl.g:1169:1: entryRuleStringParam returns [EObject current=null] : iv_ruleStringParam= ruleStringParam EOF ;
    public final EObject entryRuleStringParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParam = null;


        try {
            // InternalEventSetManagerDsl.g:1169:52: (iv_ruleStringParam= ruleStringParam EOF )
            // InternalEventSetManagerDsl.g:1170:2: iv_ruleStringParam= ruleStringParam EOF
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
    // InternalEventSetManagerDsl.g:1176:1: ruleStringParam returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleStringParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1182:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:1183:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:1183:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:1184:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:1184:3: ()
            // InternalEventSetManagerDsl.g:1185:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringParamAccess().getStringParamAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1191:3: ( (lv_key_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1192:4: (lv_key_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1192:4: (lv_key_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:1193:5: lv_key_1_0= ruleEString
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

            otherlv_2=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getStringParamAccess().getEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:1214:3: ( (lv_value_3_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1215:4: (lv_value_3_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1215:4: (lv_value_3_0= ruleEString )
            // InternalEventSetManagerDsl.g:1216:5: lv_value_3_0= ruleEString
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
    // InternalEventSetManagerDsl.g:1237:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEventSetManagerDsl.g:1237:47: (iv_ruleEString= ruleEString EOF )
            // InternalEventSetManagerDsl.g:1238:2: iv_ruleEString= ruleEString EOF
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
    // InternalEventSetManagerDsl.g:1244:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1250:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1251:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1251:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1252:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:1260:3: this_ID_1= RULE_ID
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
    // InternalEventSetManagerDsl.g:1271:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1277:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalEventSetManagerDsl.g:1278:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalEventSetManagerDsl.g:1278:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt18=1;
                }
                break;
            case 28:
                {
                alt18=2;
                }
                break;
            case 29:
                {
                alt18=3;
                }
                break;
            case 30:
                {
                alt18=4;
                }
                break;
            case 31:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1279:3: (enumLiteral_0= 'String' )
                    {
                    // InternalEventSetManagerDsl.g:1279:3: (enumLiteral_0= 'String' )
                    // InternalEventSetManagerDsl.g:1280:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:1287:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalEventSetManagerDsl.g:1287:3: (enumLiteral_1= 'Int' )
                    // InternalEventSetManagerDsl.g:1288:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEventSetManagerDsl.g:1295:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalEventSetManagerDsl.g:1295:3: (enumLiteral_2= 'Boolean' )
                    // InternalEventSetManagerDsl.g:1296:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEventSetManagerDsl.g:1303:3: (enumLiteral_3= 'Float' )
                    {
                    // InternalEventSetManagerDsl.g:1303:3: (enumLiteral_3= 'Float' )
                    // InternalEventSetManagerDsl.g:1304:4: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEventSetManagerDsl.g:1311:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalEventSetManagerDsl.g:1311:3: (enumLiteral_4= 'Double' )
                    // InternalEventSetManagerDsl.g:1312:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,31,FOLLOW_2); 

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


    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\2\11\2\uffff";
    static final String dfa_3s = "\1\33\5\5\2\16\2\uffff";
    static final String dfa_4s = "\1\37\5\6\2\37\2\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
            "\1\7\1\6",
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "805:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000A0060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000A0062L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000F8004000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});

}