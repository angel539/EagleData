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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DOUBLE", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'{'", "','", "'}'", "'['", "']'", "'connection'", "'and'", "'pattern'", "'if'", "'in'", "'then'", "'='", "'<='", "'('", "')'", "'->'", "':'", "'first'", "'last'", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=5;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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
    // InternalEventSetManagerDsl.g:72:1: ruleEventSetManager returns [EObject current=null] : ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= 'import' ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_geos_4_0= ruleGeographicalElement ) ) ( (lv_geos_5_0= ruleGeographicalElement ) )* )? ( (lv_events_6_0= ruleEvent ) ) ( (lv_events_7_0= ruleEvent ) )* ) ;
    public final EObject ruleEventSetManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_3_0 = null;

        EObject lv_geos_4_0 = null;

        EObject lv_geos_5_0 = null;

        EObject lv_events_6_0 = null;

        EObject lv_events_7_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:78:2: ( ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= 'import' ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_geos_4_0= ruleGeographicalElement ) ) ( (lv_geos_5_0= ruleGeographicalElement ) )* )? ( (lv_events_6_0= ruleEvent ) ) ( (lv_events_7_0= ruleEvent ) )* ) )
            // InternalEventSetManagerDsl.g:79:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= 'import' ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_geos_4_0= ruleGeographicalElement ) ) ( (lv_geos_5_0= ruleGeographicalElement ) )* )? ( (lv_events_6_0= ruleEvent ) ) ( (lv_events_7_0= ruleEvent ) )* )
            {
            // InternalEventSetManagerDsl.g:79:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= 'import' ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_geos_4_0= ruleGeographicalElement ) ) ( (lv_geos_5_0= ruleGeographicalElement ) )* )? ( (lv_events_6_0= ruleEvent ) ) ( (lv_events_7_0= ruleEvent ) )* )
            // InternalEventSetManagerDsl.g:80:3: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= 'import' ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_geos_4_0= ruleGeographicalElement ) ) ( (lv_geos_5_0= ruleGeographicalElement ) )* )? ( (lv_events_6_0= ruleEvent ) ) ( (lv_events_7_0= ruleEvent ) )*
            {
            // InternalEventSetManagerDsl.g:80:3: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= 'import' ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEventSetManagerDsl.g:81:4: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) (otherlv_2= 'import' ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) ) )*
                    {
                    otherlv_0=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getEventSetManagerAccess().getImportKeyword_0_0());
                    			
                    // InternalEventSetManagerDsl.g:85:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    // InternalEventSetManagerDsl.g:86:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalEventSetManagerDsl.g:86:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    // InternalEventSetManagerDsl.g:87:6: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
                    {

                    						newCompositeNode(grammarAccess.getEventSetManagerAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
                    						}
                    						add(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_1_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.QualifiedNameWithWildcard");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventSetManagerDsl.g:104:4: (otherlv_2= 'import' ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==12) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:105:5: otherlv_2= 'import' ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) )
                    	    {
                    	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getEventSetManagerAccess().getImportKeyword_0_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:109:5: ( (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard ) )
                    	    // InternalEventSetManagerDsl.g:110:6: (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard )
                    	    {
                    	    // InternalEventSetManagerDsl.g:110:6: (lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard )
                    	    // InternalEventSetManagerDsl.g:111:7: lv_importedNamespace_3_0= ruleQualifiedNameWithWildcard
                    	    {

                    	    							newCompositeNode(grammarAccess.getEventSetManagerAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_importedNamespace_3_0=ruleQualifiedNameWithWildcard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"importedNamespace",
                    	    								lv_importedNamespace_3_0,
                    	    								"uam.eagledata.dsl.events.EventSetManagerDsl.QualifiedNameWithWildcard");
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
                    break;

            }

            // InternalEventSetManagerDsl.g:130:3: ( ( (lv_geos_4_0= ruleGeographicalElement ) ) ( (lv_geos_5_0= ruleGeographicalElement ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalEventSetManagerDsl.g:131:4: ( (lv_geos_4_0= ruleGeographicalElement ) ) ( (lv_geos_5_0= ruleGeographicalElement ) )*
                    {
                    // InternalEventSetManagerDsl.g:131:4: ( (lv_geos_4_0= ruleGeographicalElement ) )
                    // InternalEventSetManagerDsl.g:132:5: (lv_geos_4_0= ruleGeographicalElement )
                    {
                    // InternalEventSetManagerDsl.g:132:5: (lv_geos_4_0= ruleGeographicalElement )
                    // InternalEventSetManagerDsl.g:133:6: lv_geos_4_0= ruleGeographicalElement
                    {

                    						newCompositeNode(grammarAccess.getEventSetManagerAccess().getGeosGeographicalElementParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_geos_4_0=ruleGeographicalElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
                    						}
                    						add(
                    							current,
                    							"geos",
                    							lv_geos_4_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.GeographicalElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventSetManagerDsl.g:150:4: ( (lv_geos_5_0= ruleGeographicalElement ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID||LA3_0==RULE_STRING) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:151:5: (lv_geos_5_0= ruleGeographicalElement )
                    	    {
                    	    // InternalEventSetManagerDsl.g:151:5: (lv_geos_5_0= ruleGeographicalElement )
                    	    // InternalEventSetManagerDsl.g:152:6: lv_geos_5_0= ruleGeographicalElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getEventSetManagerAccess().getGeosGeographicalElementParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_geos_5_0=ruleGeographicalElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"geos",
                    	    							lv_geos_5_0,
                    	    							"uam.eagledata.dsl.events.EventSetManagerDsl.GeographicalElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalEventSetManagerDsl.g:170:3: ( (lv_events_6_0= ruleEvent ) )
            // InternalEventSetManagerDsl.g:171:4: (lv_events_6_0= ruleEvent )
            {
            // InternalEventSetManagerDsl.g:171:4: (lv_events_6_0= ruleEvent )
            // InternalEventSetManagerDsl.g:172:5: lv_events_6_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_events_6_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
            					}
            					add(
            						current,
            						"events",
            						lv_events_6_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:189:3: ( (lv_events_7_0= ruleEvent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:190:4: (lv_events_7_0= ruleEvent )
            	    {
            	    // InternalEventSetManagerDsl.g:190:4: (lv_events_7_0= ruleEvent )
            	    // InternalEventSetManagerDsl.g:191:5: lv_events_7_0= ruleEvent
            	    {

            	    					newCompositeNode(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_events_7_0=ruleEvent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventSetManagerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"events",
            	    						lv_events_7_0,
            	    						"uam.eagledata.dsl.events.EventSetManagerDsl.Event");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalEventSetManagerDsl.g:212:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalEventSetManagerDsl.g:212:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalEventSetManagerDsl.g:213:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalEventSetManagerDsl.g:219:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:225:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalEventSetManagerDsl.g:226:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalEventSetManagerDsl.g:226:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalEventSetManagerDsl.g:227:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalEventSetManagerDsl.g:237:3: (kw= '.*' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEventSetManagerDsl.g:238:4: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEventSetManagerDsl.g:248:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEventSetManagerDsl.g:248:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEventSetManagerDsl.g:249:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalEventSetManagerDsl.g:255:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:261:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEventSetManagerDsl.g:262:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEventSetManagerDsl.g:262:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEventSetManagerDsl.g:263:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalEventSetManagerDsl.g:270:3: (kw= '.' this_ID_2= RULE_ID )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==14) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:271:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleGeographicalElement"
    // InternalEventSetManagerDsl.g:288:1: entryRuleGeographicalElement returns [EObject current=null] : iv_ruleGeographicalElement= ruleGeographicalElement EOF ;
    public final EObject entryRuleGeographicalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeographicalElement = null;


        try {
            // InternalEventSetManagerDsl.g:288:60: (iv_ruleGeographicalElement= ruleGeographicalElement EOF )
            // InternalEventSetManagerDsl.g:289:2: iv_ruleGeographicalElement= ruleGeographicalElement EOF
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
    // InternalEventSetManagerDsl.g:295:1: ruleGeographicalElement returns [EObject current=null] : (this_Point_0= rulePoint | this_Region_1= ruleRegion ) ;
    public final EObject ruleGeographicalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Point_0 = null;

        EObject this_Region_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:301:2: ( (this_Point_0= rulePoint | this_Region_1= ruleRegion ) )
            // InternalEventSetManagerDsl.g:302:2: (this_Point_0= rulePoint | this_Region_1= ruleRegion )
            {
            // InternalEventSetManagerDsl.g:302:2: (this_Point_0= rulePoint | this_Region_1= ruleRegion )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==15) ) {
                    alt8=1;
                }
                else if ( (LA8_1==18) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==18) ) {
                    alt8=2;
                }
                else if ( (LA8_2==15) ) {
                    alt8=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEventSetManagerDsl.g:303:3: this_Point_0= rulePoint
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
                    // InternalEventSetManagerDsl.g:312:3: this_Region_1= ruleRegion
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
    // InternalEventSetManagerDsl.g:324:1: entryRulePoint returns [EObject current=null] : iv_rulePoint= rulePoint EOF ;
    public final EObject entryRulePoint() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoint = null;


        try {
            // InternalEventSetManagerDsl.g:324:46: (iv_rulePoint= rulePoint EOF )
            // InternalEventSetManagerDsl.g:325:2: iv_rulePoint= rulePoint EOF
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
    // InternalEventSetManagerDsl.g:331:1: rulePoint returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' ) ;
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
            // InternalEventSetManagerDsl.g:337:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' ) )
            // InternalEventSetManagerDsl.g:338:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' )
            {
            // InternalEventSetManagerDsl.g:338:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}' )
            // InternalEventSetManagerDsl.g:339:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_lat_3_0= RULE_DOUBLE ) ) otherlv_4= ',' ( (lv_long_5_0= RULE_DOUBLE ) ) otherlv_6= '}'
            {
            // InternalEventSetManagerDsl.g:339:3: ()
            // InternalEventSetManagerDsl.g:340:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPointAccess().getPointAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:346:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:347:4: (lv_name_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:347:4: (lv_name_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:348:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPointAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_2=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getPointAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalEventSetManagerDsl.g:369:3: ( (lv_lat_3_0= RULE_DOUBLE ) )
            // InternalEventSetManagerDsl.g:370:4: (lv_lat_3_0= RULE_DOUBLE )
            {
            // InternalEventSetManagerDsl.g:370:4: (lv_lat_3_0= RULE_DOUBLE )
            // InternalEventSetManagerDsl.g:371:5: lv_lat_3_0= RULE_DOUBLE
            {
            lv_lat_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_10); 

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

            otherlv_4=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPointAccess().getCommaKeyword_4());
            		
            // InternalEventSetManagerDsl.g:391:3: ( (lv_long_5_0= RULE_DOUBLE ) )
            // InternalEventSetManagerDsl.g:392:4: (lv_long_5_0= RULE_DOUBLE )
            {
            // InternalEventSetManagerDsl.g:392:4: (lv_long_5_0= RULE_DOUBLE )
            // InternalEventSetManagerDsl.g:393:5: lv_long_5_0= RULE_DOUBLE
            {
            lv_long_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_11); 

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

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalEventSetManagerDsl.g:417:1: entryRuleRegion returns [EObject current=null] : iv_ruleRegion= ruleRegion EOF ;
    public final EObject entryRuleRegion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegion = null;


        try {
            // InternalEventSetManagerDsl.g:417:47: (iv_ruleRegion= ruleRegion EOF )
            // InternalEventSetManagerDsl.g:418:2: iv_ruleRegion= ruleRegion EOF
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
    // InternalEventSetManagerDsl.g:424:1: ruleRegion returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' ) ;
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
            // InternalEventSetManagerDsl.g:430:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' ) )
            // InternalEventSetManagerDsl.g:431:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' )
            {
            // InternalEventSetManagerDsl.g:431:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']' )
            // InternalEventSetManagerDsl.g:432:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '[' ( (lv_points_3_0= rulePoint ) ) (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )* otherlv_6= ']'
            {
            // InternalEventSetManagerDsl.g:432:3: ()
            // InternalEventSetManagerDsl.g:433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegionAccess().getRegionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:439:3: ( (lv_name_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:440:4: (lv_name_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:440:4: (lv_name_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:441:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRegionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getRegionAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalEventSetManagerDsl.g:462:3: ( (lv_points_3_0= rulePoint ) )
            // InternalEventSetManagerDsl.g:463:4: (lv_points_3_0= rulePoint )
            {
            // InternalEventSetManagerDsl.g:463:4: (lv_points_3_0= rulePoint )
            // InternalEventSetManagerDsl.g:464:5: lv_points_3_0= rulePoint
            {

            					newCompositeNode(grammarAccess.getRegionAccess().getPointsPointParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalEventSetManagerDsl.g:481:3: (otherlv_4= ',' ( (lv_points_5_0= rulePoint ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:482:4: otherlv_4= ',' ( (lv_points_5_0= rulePoint ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getRegionAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalEventSetManagerDsl.g:486:4: ( (lv_points_5_0= rulePoint ) )
            	    // InternalEventSetManagerDsl.g:487:5: (lv_points_5_0= rulePoint )
            	    {
            	    // InternalEventSetManagerDsl.g:487:5: (lv_points_5_0= rulePoint )
            	    // InternalEventSetManagerDsl.g:488:6: lv_points_5_0= rulePoint
            	    {

            	    						newCompositeNode(grammarAccess.getRegionAccess().getPointsPointParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
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
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

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
    // InternalEventSetManagerDsl.g:514:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalEventSetManagerDsl.g:514:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalEventSetManagerDsl.g:515:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalEventSetManagerDsl.g:521:1: ruleEvent returns [EObject current=null] : ( () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* ) ) ;
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
            // InternalEventSetManagerDsl.g:527:2: ( ( () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* ) ) )
            // InternalEventSetManagerDsl.g:528:2: ( () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* ) )
            {
            // InternalEventSetManagerDsl.g:528:2: ( () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* ) )
            // InternalEventSetManagerDsl.g:529:3: () (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= 'pattern' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( (lv_concepts_8_0= ruleConcept ) ) ( (lv_concepts_9_0= ruleConcept ) )* otherlv_10= '}' ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* )
            {
            // InternalEventSetManagerDsl.g:529:3: ()
            // InternalEventSetManagerDsl.g:530:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:536:3: (otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEventSetManagerDsl.g:537:4: otherlv_1= 'connection' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getConnectionKeyword_1_0());
                    			
                    // InternalEventSetManagerDsl.g:541:4: ( (otherlv_2= RULE_ID ) )
                    // InternalEventSetManagerDsl.g:542:5: (otherlv_2= RULE_ID )
                    {
                    // InternalEventSetManagerDsl.g:542:5: (otherlv_2= RULE_ID )
                    // InternalEventSetManagerDsl.g:543:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

                    						newLeafNode(otherlv_2, grammarAccess.getEventAccess().getDataconnectionsDataConnectionCrossReference_1_1_0());
                    					

                    }


                    }

                    // InternalEventSetManagerDsl.g:554:4: (otherlv_3= 'and' ( (otherlv_4= RULE_ID ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==21) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:555:5: otherlv_3= 'and' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getEventAccess().getAndKeyword_1_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:559:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalEventSetManagerDsl.g:560:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalEventSetManagerDsl.g:560:6: (otherlv_4= RULE_ID )
                    	    // InternalEventSetManagerDsl.g:561:7: otherlv_4= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventRule());
                    	    							}
                    	    						
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_15); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getEventAccess().getDataconnectionsDataConnectionCrossReference_1_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getEventAccess().getPatternKeyword_2());
            		
            // InternalEventSetManagerDsl.g:578:3: ( (lv_name_6_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:579:4: (lv_name_6_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:579:4: (lv_name_6_0= ruleEString )
            // InternalEventSetManagerDsl.g:580:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
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

            otherlv_7=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalEventSetManagerDsl.g:601:3: ( (lv_concepts_8_0= ruleConcept ) )
            // InternalEventSetManagerDsl.g:602:4: (lv_concepts_8_0= ruleConcept )
            {
            // InternalEventSetManagerDsl.g:602:4: (lv_concepts_8_0= ruleConcept )
            // InternalEventSetManagerDsl.g:603:5: lv_concepts_8_0= ruleConcept
            {

            					newCompositeNode(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalEventSetManagerDsl.g:620:3: ( (lv_concepts_9_0= ruleConcept ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=34 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:621:4: (lv_concepts_9_0= ruleConcept )
            	    {
            	    // InternalEventSetManagerDsl.g:621:4: (lv_concepts_9_0= ruleConcept )
            	    // InternalEventSetManagerDsl.g:622:5: lv_concepts_9_0= ruleConcept
            	    {

            	    					newCompositeNode(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
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
            	    break loop12;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalEventSetManagerDsl.g:643:3: ( ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )* )
            // InternalEventSetManagerDsl.g:644:4: ( (lv_when_11_0= ruleCondition ) ) ( (lv_when_12_0= ruleCondition ) )*
            {
            // InternalEventSetManagerDsl.g:644:4: ( (lv_when_11_0= ruleCondition ) )
            // InternalEventSetManagerDsl.g:645:5: (lv_when_11_0= ruleCondition )
            {
            // InternalEventSetManagerDsl.g:645:5: (lv_when_11_0= ruleCondition )
            // InternalEventSetManagerDsl.g:646:6: lv_when_11_0= ruleCondition
            {

            						newCompositeNode(grammarAccess.getEventAccess().getWhenConditionParserRuleCall_8_0_0());
            					
            pushFollow(FOLLOW_19);
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

            // InternalEventSetManagerDsl.g:663:4: ( (lv_when_12_0= ruleCondition ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=23 && LA13_0<=25)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:664:5: (lv_when_12_0= ruleCondition )
            	    {
            	    // InternalEventSetManagerDsl.g:664:5: (lv_when_12_0= ruleCondition )
            	    // InternalEventSetManagerDsl.g:665:6: lv_when_12_0= ruleCondition
            	    {

            	    						newCompositeNode(grammarAccess.getEventAccess().getWhenConditionParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop13;
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
    // InternalEventSetManagerDsl.g:687:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalEventSetManagerDsl.g:687:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalEventSetManagerDsl.g:688:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalEventSetManagerDsl.g:694:1: ruleCondition returns [EObject current=null] : ( () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* ) ) ;
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
            // InternalEventSetManagerDsl.g:700:2: ( ( () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* ) ) )
            // InternalEventSetManagerDsl.g:701:2: ( () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* ) )
            {
            // InternalEventSetManagerDsl.g:701:2: ( () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* ) )
            // InternalEventSetManagerDsl.g:702:3: () (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )? (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )? (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* )
            {
            // InternalEventSetManagerDsl.g:702:3: ()
            // InternalEventSetManagerDsl.g:703:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:709:3: (otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEventSetManagerDsl.g:710:4: otherlv_1= 'if' ( (lv_expression_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getIfKeyword_1_0());
                    			
                    // InternalEventSetManagerDsl.g:714:4: ( (lv_expression_2_0= ruleExpression ) )
                    // InternalEventSetManagerDsl.g:715:5: (lv_expression_2_0= ruleExpression )
                    {
                    // InternalEventSetManagerDsl.g:715:5: (lv_expression_2_0= ruleExpression )
                    // InternalEventSetManagerDsl.g:716:6: lv_expression_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getExpressionExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_20);
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

            // InternalEventSetManagerDsl.g:734:3: (otherlv_3= 'in' ( (otherlv_4= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalEventSetManagerDsl.g:735:4: otherlv_3= 'in' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getInKeyword_2_0());
                    			
                    // InternalEventSetManagerDsl.g:739:4: ( (otherlv_4= RULE_ID ) )
                    // InternalEventSetManagerDsl.g:740:5: (otherlv_4= RULE_ID )
                    {
                    // InternalEventSetManagerDsl.g:740:5: (otherlv_4= RULE_ID )
                    // InternalEventSetManagerDsl.g:741:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getGeoGeographicalElementCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEventSetManagerDsl.g:753:3: (otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )* )
            // InternalEventSetManagerDsl.g:754:4: otherlv_5= 'then' ( (lv_triggers_6_0= ruleAction ) ) (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )*
            {
            otherlv_5=(Token)match(input,25,FOLLOW_3); 

            				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getThenKeyword_3_0());
            			
            // InternalEventSetManagerDsl.g:758:4: ( (lv_triggers_6_0= ruleAction ) )
            // InternalEventSetManagerDsl.g:759:5: (lv_triggers_6_0= ruleAction )
            {
            // InternalEventSetManagerDsl.g:759:5: (lv_triggers_6_0= ruleAction )
            // InternalEventSetManagerDsl.g:760:6: lv_triggers_6_0= ruleAction
            {

            						newCompositeNode(grammarAccess.getConditionAccess().getTriggersActionParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_22);
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

            // InternalEventSetManagerDsl.g:777:4: (otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:778:5: otherlv_7= 'and' ( (lv_triggers_8_0= ruleAction ) )
            	    {
            	    otherlv_7=(Token)match(input,21,FOLLOW_3); 

            	    					newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getAndKeyword_3_2_0());
            	    				
            	    // InternalEventSetManagerDsl.g:782:5: ( (lv_triggers_8_0= ruleAction ) )
            	    // InternalEventSetManagerDsl.g:783:6: (lv_triggers_8_0= ruleAction )
            	    {
            	    // InternalEventSetManagerDsl.g:783:6: (lv_triggers_8_0= ruleAction )
            	    // InternalEventSetManagerDsl.g:784:7: lv_triggers_8_0= ruleAction
            	    {

            	    							newCompositeNode(grammarAccess.getConditionAccess().getTriggersActionParserRuleCall_3_2_1_0());
            	    						
            	    pushFollow(FOLLOW_22);
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
            	    break loop16;
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
    // InternalEventSetManagerDsl.g:807:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalEventSetManagerDsl.g:807:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalEventSetManagerDsl.g:808:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalEventSetManagerDsl.g:814:1: ruleExpression returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:820:2: ( ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) ) ) )
            // InternalEventSetManagerDsl.g:821:2: ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) ) )
            {
            // InternalEventSetManagerDsl.g:821:2: ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) ) )
            // InternalEventSetManagerDsl.g:822:3: () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_right_3_0= ruleLiteral ) )
            {
            // InternalEventSetManagerDsl.g:822:3: ()
            // InternalEventSetManagerDsl.g:823:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExpressionAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:829:3: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:830:4: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:830:4: ( ruleEString )
            // InternalEventSetManagerDsl.g:831:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExpressionAccess().getLeftConceptCrossReference_1_0());
            				
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getExpressionAccess().getEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:849:3: ( (lv_right_3_0= ruleLiteral ) )
            // InternalEventSetManagerDsl.g:850:4: (lv_right_3_0= ruleLiteral )
            {
            // InternalEventSetManagerDsl.g:850:4: (lv_right_3_0= ruleLiteral )
            // InternalEventSetManagerDsl.g:851:5: lv_right_3_0= ruleLiteral
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
    // InternalEventSetManagerDsl.g:872:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalEventSetManagerDsl.g:872:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalEventSetManagerDsl.g:873:2: iv_ruleLiteral= ruleLiteral EOF
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
    // InternalEventSetManagerDsl.g:879:1: ruleLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEString ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:885:2: ( ( () ( (lv_value_1_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:886:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:886:2: ( () ( (lv_value_1_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:887:3: () ( (lv_value_1_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:887:3: ()
            // InternalEventSetManagerDsl.g:888:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralAccess().getLiteralAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:894:3: ( (lv_value_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:895:4: (lv_value_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:895:4: (lv_value_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:896:5: lv_value_1_0= ruleEString
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
    // InternalEventSetManagerDsl.g:917:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // InternalEventSetManagerDsl.g:917:48: (iv_ruleConcept= ruleConcept EOF )
            // InternalEventSetManagerDsl.g:918:2: iv_ruleConcept= ruleConcept EOF
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
    // InternalEventSetManagerDsl.g:924:1: ruleConcept returns [EObject current=null] : (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        EObject this_KeyConcept_0 = null;

        EObject this_RegexConcept_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:930:2: ( (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept ) )
            // InternalEventSetManagerDsl.g:931:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            {
            // InternalEventSetManagerDsl.g:931:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalEventSetManagerDsl.g:932:3: this_KeyConcept_0= ruleKeyConcept
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
                    // InternalEventSetManagerDsl.g:941:3: this_RegexConcept_1= ruleRegexConcept
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
    // InternalEventSetManagerDsl.g:953:1: entryRuleKeyConcept returns [EObject current=null] : iv_ruleKeyConcept= ruleKeyConcept EOF ;
    public final EObject entryRuleKeyConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyConcept = null;


        try {
            // InternalEventSetManagerDsl.g:953:51: (iv_ruleKeyConcept= ruleKeyConcept EOF )
            // InternalEventSetManagerDsl.g:954:2: iv_ruleKeyConcept= ruleKeyConcept EOF
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
    // InternalEventSetManagerDsl.g:960:1: ruleKeyConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyConcept() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:966:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:967:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:967:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:968:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:968:3: ()
            // InternalEventSetManagerDsl.g:969:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKeyConceptAccess().getKeyConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:975:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:976:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:976:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:977:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getKeyConceptAccess().getTypeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalEventSetManagerDsl.g:994:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:995:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:995:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:996:5: lv_name_2_0= ruleEString
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
    // InternalEventSetManagerDsl.g:1017:1: entryRuleRegexConcept returns [EObject current=null] : iv_ruleRegexConcept= ruleRegexConcept EOF ;
    public final EObject entryRuleRegexConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegexConcept = null;


        try {
            // InternalEventSetManagerDsl.g:1017:53: (iv_ruleRegexConcept= ruleRegexConcept EOF )
            // InternalEventSetManagerDsl.g:1018:2: iv_ruleRegexConcept= ruleRegexConcept EOF
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
    // InternalEventSetManagerDsl.g:1024:1: ruleRegexConcept returns [EObject current=null] : ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) ;
    public final EObject ruleRegexConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Enumerator lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_regex_4_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1030:2: ( ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:1031:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:1031:2: ( () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:1032:3: () ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_regex_4_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:1032:3: ()
            // InternalEventSetManagerDsl.g:1033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegexConceptAccess().getRegexConceptAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1039:3: ( (lv_type_1_0= ruleType ) )
            // InternalEventSetManagerDsl.g:1040:4: (lv_type_1_0= ruleType )
            {
            // InternalEventSetManagerDsl.g:1040:4: (lv_type_1_0= ruleType )
            // InternalEventSetManagerDsl.g:1041:5: lv_type_1_0= ruleType
            {

            					newCompositeNode(grammarAccess.getRegexConceptAccess().getTypeTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
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

            // InternalEventSetManagerDsl.g:1058:3: ( (lv_name_2_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1059:4: (lv_name_2_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1059:4: (lv_name_2_0= ruleEString )
            // InternalEventSetManagerDsl.g:1060:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRegexConceptAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_3=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getRegexConceptAccess().getEqualsSignKeyword_3());
            		
            // InternalEventSetManagerDsl.g:1081:3: ( (lv_regex_4_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1082:4: (lv_regex_4_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1082:4: (lv_regex_4_0= ruleEString )
            // InternalEventSetManagerDsl.g:1083:5: lv_regex_4_0= ruleEString
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
    // InternalEventSetManagerDsl.g:1104:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalEventSetManagerDsl.g:1104:47: (iv_ruleAction= ruleAction EOF )
            // InternalEventSetManagerDsl.g:1105:2: iv_ruleAction= ruleAction EOF
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
    // InternalEventSetManagerDsl.g:1111:1: ruleAction returns [EObject current=null] : (this_ActionCall_0= ruleActionCall | this_QueryCall_1= ruleQueryCall ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_ActionCall_0 = null;

        EObject this_QueryCall_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1117:2: ( (this_ActionCall_0= ruleActionCall | this_QueryCall_1= ruleQueryCall ) )
            // InternalEventSetManagerDsl.g:1118:2: (this_ActionCall_0= ruleActionCall | this_QueryCall_1= ruleQueryCall )
            {
            // InternalEventSetManagerDsl.g:1118:2: (this_ActionCall_0= ruleActionCall | this_QueryCall_1= ruleQueryCall )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==RULE_ID) ) {
                        int LA18_5 = input.LA(4);

                        if ( ((LA18_5>=26 && LA18_5<=27)) ) {
                            alt18=1;
                        }
                        else if ( (LA18_5==14||LA18_5==31) ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 5, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA18_2==RULE_STRING) ) {
                        alt18=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                    }
                    break;
                case EOF:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    {
                    alt18=1;
                    }
                    break;
                case 14:
                    {
                    alt18=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1119:3: this_ActionCall_0= ruleActionCall
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getActionCallParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionCall_0=ruleActionCall();

                    state._fsp--;


                    			current = this_ActionCall_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:1128:3: this_QueryCall_1= ruleQueryCall
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getQueryCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QueryCall_1=ruleQueryCall();

                    state._fsp--;


                    			current = this_QueryCall_1;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionParam"
    // InternalEventSetManagerDsl.g:1140:1: entryRuleActionParam returns [EObject current=null] : iv_ruleActionParam= ruleActionParam EOF ;
    public final EObject entryRuleActionParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionParam = null;


        try {
            // InternalEventSetManagerDsl.g:1140:52: (iv_ruleActionParam= ruleActionParam EOF )
            // InternalEventSetManagerDsl.g:1141:2: iv_ruleActionParam= ruleActionParam EOF
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
    // InternalEventSetManagerDsl.g:1147:1: ruleActionParam returns [EObject current=null] : (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam ) ;
    public final EObject ruleActionParam() throws RecognitionException {
        EObject current = null;

        EObject this_ConceptParam_0 = null;

        EObject this_StringParam_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1153:2: ( (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam ) )
            // InternalEventSetManagerDsl.g:1154:2: (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam )
            {
            // InternalEventSetManagerDsl.g:1154:2: (this_ConceptParam_0= ruleConceptParam | this_StringParam_1= ruleStringParam )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==26) ) {
                    alt19=2;
                }
                else if ( (LA19_1==27) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0==RULE_ID) ) {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==27) ) {
                    alt19=1;
                }
                else if ( (LA19_2==26) ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1155:3: this_ConceptParam_0= ruleConceptParam
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
                    // InternalEventSetManagerDsl.g:1164:3: this_StringParam_1= ruleStringParam
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
    // InternalEventSetManagerDsl.g:1176:1: entryRuleConceptParam returns [EObject current=null] : iv_ruleConceptParam= ruleConceptParam EOF ;
    public final EObject entryRuleConceptParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConceptParam = null;


        try {
            // InternalEventSetManagerDsl.g:1176:53: (iv_ruleConceptParam= ruleConceptParam EOF )
            // InternalEventSetManagerDsl.g:1177:2: iv_ruleConceptParam= ruleConceptParam EOF
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
    // InternalEventSetManagerDsl.g:1183:1: ruleConceptParam returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleConceptParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1189:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalEventSetManagerDsl.g:1190:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalEventSetManagerDsl.g:1190:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) ) )
            // InternalEventSetManagerDsl.g:1191:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '<=' ( (otherlv_3= RULE_ID ) )
            {
            // InternalEventSetManagerDsl.g:1191:3: ()
            // InternalEventSetManagerDsl.g:1192:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConceptParamAccess().getConceptParamAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1198:3: ( (lv_key_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1199:4: (lv_key_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1199:4: (lv_key_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:1200:5: lv_key_1_0= ruleEString
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

            otherlv_2=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getConceptParamAccess().getLessThanSignEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:1221:3: ( (otherlv_3= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1222:4: (otherlv_3= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1222:4: (otherlv_3= RULE_ID )
            // InternalEventSetManagerDsl.g:1223:5: otherlv_3= RULE_ID
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
    // InternalEventSetManagerDsl.g:1238:1: entryRuleStringParam returns [EObject current=null] : iv_ruleStringParam= ruleStringParam EOF ;
    public final EObject entryRuleStringParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringParam = null;


        try {
            // InternalEventSetManagerDsl.g:1238:52: (iv_ruleStringParam= ruleStringParam EOF )
            // InternalEventSetManagerDsl.g:1239:2: iv_ruleStringParam= ruleStringParam EOF
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
    // InternalEventSetManagerDsl.g:1245:1: ruleStringParam returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleStringParam() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1251:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalEventSetManagerDsl.g:1252:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalEventSetManagerDsl.g:1252:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalEventSetManagerDsl.g:1253:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:1253:3: ()
            // InternalEventSetManagerDsl.g:1254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringParamAccess().getStringParamAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1260:3: ( (lv_key_1_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1261:4: (lv_key_1_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1261:4: (lv_key_1_0= ruleEString )
            // InternalEventSetManagerDsl.g:1262:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringParamAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_2=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getStringParamAccess().getEqualsSignKeyword_2());
            		
            // InternalEventSetManagerDsl.g:1283:3: ( (lv_value_3_0= ruleEString ) )
            // InternalEventSetManagerDsl.g:1284:4: (lv_value_3_0= ruleEString )
            {
            // InternalEventSetManagerDsl.g:1284:4: (lv_value_3_0= ruleEString )
            // InternalEventSetManagerDsl.g:1285:5: lv_value_3_0= ruleEString
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


    // $ANTLR start "entryRuleActionCall"
    // InternalEventSetManagerDsl.g:1306:1: entryRuleActionCall returns [EObject current=null] : iv_ruleActionCall= ruleActionCall EOF ;
    public final EObject entryRuleActionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionCall = null;


        try {
            // InternalEventSetManagerDsl.g:1306:51: (iv_ruleActionCall= ruleActionCall EOF )
            // InternalEventSetManagerDsl.g:1307:2: iv_ruleActionCall= ruleActionCall EOF
            {
             newCompositeNode(grammarAccess.getActionCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionCall=ruleActionCall();

            state._fsp--;

             current =iv_ruleActionCall; 
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
    // $ANTLR end "entryRuleActionCall"


    // $ANTLR start "ruleActionCall"
    // InternalEventSetManagerDsl.g:1313:1: ruleActionCall returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_actionParams_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_actionParams_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleActionCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_actionParams_3_0 = null;

        EObject lv_actionParams_5_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1319:2: ( ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_actionParams_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_actionParams_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? ) )
            // InternalEventSetManagerDsl.g:1320:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_actionParams_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_actionParams_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? )
            {
            // InternalEventSetManagerDsl.g:1320:2: ( () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_actionParams_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_actionParams_5_0= ruleActionParam ) ) )* otherlv_6= ')' )? )
            // InternalEventSetManagerDsl.g:1321:3: () ( (otherlv_1= RULE_ID ) ) (otherlv_2= '(' ( (lv_actionParams_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_actionParams_5_0= ruleActionParam ) ) )* otherlv_6= ')' )?
            {
            // InternalEventSetManagerDsl.g:1321:3: ()
            // InternalEventSetManagerDsl.g:1322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionCallAccess().getActionCallAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1328:3: ( (otherlv_1= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1329:4: (otherlv_1= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1329:4: (otherlv_1= RULE_ID )
            // InternalEventSetManagerDsl.g:1330:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionCallRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_1, grammarAccess.getActionCallAccess().getCallsActionExecutableExtensionCrossReference_1_0());
            				

            }


            }

            // InternalEventSetManagerDsl.g:1341:3: (otherlv_2= '(' ( (lv_actionParams_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_actionParams_5_0= ruleActionParam ) ) )* otherlv_6= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1342:4: otherlv_2= '(' ( (lv_actionParams_3_0= ruleActionParam ) ) (otherlv_4= ',' ( (lv_actionParams_5_0= ruleActionParam ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionCallAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalEventSetManagerDsl.g:1346:4: ( (lv_actionParams_3_0= ruleActionParam ) )
                    // InternalEventSetManagerDsl.g:1347:5: (lv_actionParams_3_0= ruleActionParam )
                    {
                    // InternalEventSetManagerDsl.g:1347:5: (lv_actionParams_3_0= ruleActionParam )
                    // InternalEventSetManagerDsl.g:1348:6: lv_actionParams_3_0= ruleActionParam
                    {

                    						newCompositeNode(grammarAccess.getActionCallAccess().getActionParamsActionParamParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_actionParams_3_0=ruleActionParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionCallRule());
                    						}
                    						add(
                    							current,
                    							"actionParams",
                    							lv_actionParams_3_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.ActionParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventSetManagerDsl.g:1365:4: (otherlv_4= ',' ( (lv_actionParams_5_0= ruleActionParam ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==16) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:1366:5: otherlv_4= ',' ( (lv_actionParams_5_0= ruleActionParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getActionCallAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:1370:5: ( (lv_actionParams_5_0= ruleActionParam ) )
                    	    // InternalEventSetManagerDsl.g:1371:6: (lv_actionParams_5_0= ruleActionParam )
                    	    {
                    	    // InternalEventSetManagerDsl.g:1371:6: (lv_actionParams_5_0= ruleActionParam )
                    	    // InternalEventSetManagerDsl.g:1372:7: lv_actionParams_5_0= ruleActionParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionCallAccess().getActionParamsActionParamParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_actionParams_5_0=ruleActionParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionParams",
                    	    								lv_actionParams_5_0,
                    	    								"uam.eagledata.dsl.events.EventSetManagerDsl.ActionParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionCallAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleActionCall"


    // $ANTLR start "entryRuleQueryCall"
    // InternalEventSetManagerDsl.g:1399:1: entryRuleQueryCall returns [EObject current=null] : iv_ruleQueryCall= ruleQueryCall EOF ;
    public final EObject entryRuleQueryCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryCall = null;


        try {
            // InternalEventSetManagerDsl.g:1399:50: (iv_ruleQueryCall= ruleQueryCall EOF )
            // InternalEventSetManagerDsl.g:1400:2: iv_ruleQueryCall= ruleQueryCall EOF
            {
             newCompositeNode(grammarAccess.getQueryCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryCall=ruleQueryCall();

            state._fsp--;

             current =iv_ruleQueryCall; 
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
    // $ANTLR end "entryRuleQueryCall"


    // $ANTLR start "ruleQueryCall"
    // InternalEventSetManagerDsl.g:1406:1: ruleQueryCall returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_queryParams_3_0= ruleParamValue ) ) (otherlv_4= ',' ( (lv_queryParams_5_0= ruleParamValue ) ) )* otherlv_6= ')' otherlv_7= '.' ( (lv_method_8_0= ruleMethod ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( (lv_actionParams_12_0= ruleActionParam ) ) (otherlv_13= ',' ( (lv_actionParams_14_0= ruleActionParam ) ) )* otherlv_15= ')' )? ) ;
    public final EObject ruleQueryCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_queryParams_3_0 = null;

        EObject lv_queryParams_5_0 = null;

        EObject lv_method_8_0 = null;

        EObject lv_actionParams_12_0 = null;

        EObject lv_actionParams_14_0 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1412:2: ( ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_queryParams_3_0= ruleParamValue ) ) (otherlv_4= ',' ( (lv_queryParams_5_0= ruleParamValue ) ) )* otherlv_6= ')' otherlv_7= '.' ( (lv_method_8_0= ruleMethod ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( (lv_actionParams_12_0= ruleActionParam ) ) (otherlv_13= ',' ( (lv_actionParams_14_0= ruleActionParam ) ) )* otherlv_15= ')' )? ) )
            // InternalEventSetManagerDsl.g:1413:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_queryParams_3_0= ruleParamValue ) ) (otherlv_4= ',' ( (lv_queryParams_5_0= ruleParamValue ) ) )* otherlv_6= ')' otherlv_7= '.' ( (lv_method_8_0= ruleMethod ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( (lv_actionParams_12_0= ruleActionParam ) ) (otherlv_13= ',' ( (lv_actionParams_14_0= ruleActionParam ) ) )* otherlv_15= ')' )? )
            {
            // InternalEventSetManagerDsl.g:1413:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_queryParams_3_0= ruleParamValue ) ) (otherlv_4= ',' ( (lv_queryParams_5_0= ruleParamValue ) ) )* otherlv_6= ')' otherlv_7= '.' ( (lv_method_8_0= ruleMethod ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( (lv_actionParams_12_0= ruleActionParam ) ) (otherlv_13= ',' ( (lv_actionParams_14_0= ruleActionParam ) ) )* otherlv_15= ')' )? )
            // InternalEventSetManagerDsl.g:1414:3: () ( ( ruleQualifiedName ) ) otherlv_2= '(' ( (lv_queryParams_3_0= ruleParamValue ) ) (otherlv_4= ',' ( (lv_queryParams_5_0= ruleParamValue ) ) )* otherlv_6= ')' otherlv_7= '.' ( (lv_method_8_0= ruleMethod ) ) otherlv_9= '->' ( (otherlv_10= RULE_ID ) ) (otherlv_11= '(' ( (lv_actionParams_12_0= ruleActionParam ) ) (otherlv_13= ',' ( (lv_actionParams_14_0= ruleActionParam ) ) )* otherlv_15= ')' )?
            {
            // InternalEventSetManagerDsl.g:1414:3: ()
            // InternalEventSetManagerDsl.g:1415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQueryCallAccess().getQueryCallAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1421:3: ( ( ruleQualifiedName ) )
            // InternalEventSetManagerDsl.g:1422:4: ( ruleQualifiedName )
            {
            // InternalEventSetManagerDsl.g:1422:4: ( ruleQualifiedName )
            // InternalEventSetManagerDsl.g:1423:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getQueryCallAccess().getSelectSelectCrossReference_1_0());
            				
            pushFollow(FOLLOW_27);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getQueryCallAccess().getLeftParenthesisKeyword_2());
            		
            // InternalEventSetManagerDsl.g:1441:3: ( (lv_queryParams_3_0= ruleParamValue ) )
            // InternalEventSetManagerDsl.g:1442:4: (lv_queryParams_3_0= ruleParamValue )
            {
            // InternalEventSetManagerDsl.g:1442:4: (lv_queryParams_3_0= ruleParamValue )
            // InternalEventSetManagerDsl.g:1443:5: lv_queryParams_3_0= ruleParamValue
            {

            					newCompositeNode(grammarAccess.getQueryCallAccess().getQueryParamsParamValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_queryParams_3_0=ruleParamValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryCallRule());
            					}
            					add(
            						current,
            						"queryParams",
            						lv_queryParams_3_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.ParamValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEventSetManagerDsl.g:1460:3: (otherlv_4= ',' ( (lv_queryParams_5_0= ruleParamValue ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:1461:4: otherlv_4= ',' ( (lv_queryParams_5_0= ruleParamValue ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getQueryCallAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalEventSetManagerDsl.g:1465:4: ( (lv_queryParams_5_0= ruleParamValue ) )
            	    // InternalEventSetManagerDsl.g:1466:5: (lv_queryParams_5_0= ruleParamValue )
            	    {
            	    // InternalEventSetManagerDsl.g:1466:5: (lv_queryParams_5_0= ruleParamValue )
            	    // InternalEventSetManagerDsl.g:1467:6: lv_queryParams_5_0= ruleParamValue
            	    {

            	    						newCompositeNode(grammarAccess.getQueryCallAccess().getQueryParamsParamValueParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_26);
            	    lv_queryParams_5_0=ruleParamValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQueryCallRule());
            	    						}
            	    						add(
            	    							current,
            	    							"queryParams",
            	    							lv_queryParams_5_0,
            	    							"uam.eagledata.dsl.events.EventSetManagerDsl.ParamValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getQueryCallAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getQueryCallAccess().getFullStopKeyword_6());
            		
            // InternalEventSetManagerDsl.g:1493:3: ( (lv_method_8_0= ruleMethod ) )
            // InternalEventSetManagerDsl.g:1494:4: (lv_method_8_0= ruleMethod )
            {
            // InternalEventSetManagerDsl.g:1494:4: (lv_method_8_0= ruleMethod )
            // InternalEventSetManagerDsl.g:1495:5: lv_method_8_0= ruleMethod
            {

            					newCompositeNode(grammarAccess.getQueryCallAccess().getMethodMethodParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_30);
            lv_method_8_0=ruleMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryCallRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_8_0,
            						"uam.eagledata.dsl.events.EventSetManagerDsl.Method");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getQueryCallAccess().getHyphenMinusGreaterThanSignKeyword_8());
            		
            // InternalEventSetManagerDsl.g:1516:3: ( (otherlv_10= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1517:4: (otherlv_10= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1517:4: (otherlv_10= RULE_ID )
            // InternalEventSetManagerDsl.g:1518:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryCallRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(otherlv_10, grammarAccess.getQueryCallAccess().getCallsActionExecutableExtensionCrossReference_9_0());
            				

            }


            }

            // InternalEventSetManagerDsl.g:1529:3: (otherlv_11= '(' ( (lv_actionParams_12_0= ruleActionParam ) ) (otherlv_13= ',' ( (lv_actionParams_14_0= ruleActionParam ) ) )* otherlv_15= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1530:4: otherlv_11= '(' ( (lv_actionParams_12_0= ruleActionParam ) ) (otherlv_13= ',' ( (lv_actionParams_14_0= ruleActionParam ) ) )* otherlv_15= ')'
                    {
                    otherlv_11=(Token)match(input,28,FOLLOW_13); 

                    				newLeafNode(otherlv_11, grammarAccess.getQueryCallAccess().getLeftParenthesisKeyword_10_0());
                    			
                    // InternalEventSetManagerDsl.g:1534:4: ( (lv_actionParams_12_0= ruleActionParam ) )
                    // InternalEventSetManagerDsl.g:1535:5: (lv_actionParams_12_0= ruleActionParam )
                    {
                    // InternalEventSetManagerDsl.g:1535:5: (lv_actionParams_12_0= ruleActionParam )
                    // InternalEventSetManagerDsl.g:1536:6: lv_actionParams_12_0= ruleActionParam
                    {

                    						newCompositeNode(grammarAccess.getQueryCallAccess().getActionParamsActionParamParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_actionParams_12_0=ruleActionParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQueryCallRule());
                    						}
                    						add(
                    							current,
                    							"actionParams",
                    							lv_actionParams_12_0,
                    							"uam.eagledata.dsl.events.EventSetManagerDsl.ActionParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEventSetManagerDsl.g:1553:4: (otherlv_13= ',' ( (lv_actionParams_14_0= ruleActionParam ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalEventSetManagerDsl.g:1554:5: otherlv_13= ',' ( (lv_actionParams_14_0= ruleActionParam ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getQueryCallAccess().getCommaKeyword_10_2_0());
                    	    				
                    	    // InternalEventSetManagerDsl.g:1558:5: ( (lv_actionParams_14_0= ruleActionParam ) )
                    	    // InternalEventSetManagerDsl.g:1559:6: (lv_actionParams_14_0= ruleActionParam )
                    	    {
                    	    // InternalEventSetManagerDsl.g:1559:6: (lv_actionParams_14_0= ruleActionParam )
                    	    // InternalEventSetManagerDsl.g:1560:7: lv_actionParams_14_0= ruleActionParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getQueryCallAccess().getActionParamsActionParamParserRuleCall_10_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_actionParams_14_0=ruleActionParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQueryCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionParams",
                    	    								lv_actionParams_14_0,
                    	    								"uam.eagledata.dsl.events.EventSetManagerDsl.ActionParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getQueryCallAccess().getRightParenthesisKeyword_10_3());
                    			

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
    // $ANTLR end "ruleQueryCall"


    // $ANTLR start "entryRuleParamValue"
    // InternalEventSetManagerDsl.g:1587:1: entryRuleParamValue returns [EObject current=null] : iv_ruleParamValue= ruleParamValue EOF ;
    public final EObject entryRuleParamValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValue = null;


        try {
            // InternalEventSetManagerDsl.g:1587:51: (iv_ruleParamValue= ruleParamValue EOF )
            // InternalEventSetManagerDsl.g:1588:2: iv_ruleParamValue= ruleParamValue EOF
            {
             newCompositeNode(grammarAccess.getParamValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamValue=ruleParamValue();

            state._fsp--;

             current =iv_ruleParamValue; 
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
    // $ANTLR end "entryRuleParamValue"


    // $ANTLR start "ruleParamValue"
    // InternalEventSetManagerDsl.g:1594:1: ruleParamValue returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleParamValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1600:2: ( ( () ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalEventSetManagerDsl.g:1601:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalEventSetManagerDsl.g:1601:2: ( () ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalEventSetManagerDsl.g:1602:3: () ( ( ruleQualifiedName ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalEventSetManagerDsl.g:1602:3: ()
            // InternalEventSetManagerDsl.g:1603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParamValueAccess().getParamValueAction_0(),
            					current);
            			

            }

            // InternalEventSetManagerDsl.g:1609:3: ( ( ruleQualifiedName ) )
            // InternalEventSetManagerDsl.g:1610:4: ( ruleQualifiedName )
            {
            // InternalEventSetManagerDsl.g:1610:4: ( ruleQualifiedName )
            // InternalEventSetManagerDsl.g:1611:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParamValueAccess().getParamQueryParamCrossReference_1_0());
            				
            pushFollow(FOLLOW_31);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getParamValueAccess().getColonKeyword_2());
            		
            // InternalEventSetManagerDsl.g:1629:3: ( (otherlv_3= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1630:4: (otherlv_3= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1630:4: (otherlv_3= RULE_ID )
            // InternalEventSetManagerDsl.g:1631:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValueRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getParamValueAccess().getValueConceptCrossReference_3_0());
            				

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
    // $ANTLR end "ruleParamValue"


    // $ANTLR start "entryRuleMethod"
    // InternalEventSetManagerDsl.g:1646:1: entryRuleMethod returns [EObject current=null] : iv_ruleMethod= ruleMethod EOF ;
    public final EObject entryRuleMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethod = null;


        try {
            // InternalEventSetManagerDsl.g:1646:47: (iv_ruleMethod= ruleMethod EOF )
            // InternalEventSetManagerDsl.g:1647:2: iv_ruleMethod= ruleMethod EOF
            {
             newCompositeNode(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethod=ruleMethod();

            state._fsp--;

             current =iv_ruleMethod; 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalEventSetManagerDsl.g:1653:1: ruleMethod returns [EObject current=null] : (this_First_0= ruleFirst | this_Last_1= ruleLast ) ;
    public final EObject ruleMethod() throws RecognitionException {
        EObject current = null;

        EObject this_First_0 = null;

        EObject this_Last_1 = null;



        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1659:2: ( (this_First_0= ruleFirst | this_Last_1= ruleLast ) )
            // InternalEventSetManagerDsl.g:1660:2: (this_First_0= ruleFirst | this_Last_1= ruleLast )
            {
            // InternalEventSetManagerDsl.g:1660:2: (this_First_0= ruleFirst | this_Last_1= ruleLast )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==32) ) {
                alt25=1;
            }
            else if ( (LA25_0==33) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1661:3: this_First_0= ruleFirst
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getFirstParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_First_0=ruleFirst();

                    state._fsp--;


                    			current = this_First_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:1670:3: this_Last_1= ruleLast
                    {

                    			newCompositeNode(grammarAccess.getMethodAccess().getLastParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Last_1=ruleLast();

                    state._fsp--;


                    			current = this_Last_1;
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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleFirst"
    // InternalEventSetManagerDsl.g:1682:1: entryRuleFirst returns [EObject current=null] : iv_ruleFirst= ruleFirst EOF ;
    public final EObject entryRuleFirst() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFirst = null;


        try {
            // InternalEventSetManagerDsl.g:1682:46: (iv_ruleFirst= ruleFirst EOF )
            // InternalEventSetManagerDsl.g:1683:2: iv_ruleFirst= ruleFirst EOF
            {
             newCompositeNode(grammarAccess.getFirstRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFirst=ruleFirst();

            state._fsp--;

             current =iv_ruleFirst; 
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
    // $ANTLR end "entryRuleFirst"


    // $ANTLR start "ruleFirst"
    // InternalEventSetManagerDsl.g:1689:1: ruleFirst returns [EObject current=null] : ( () otherlv_1= 'first' ) ;
    public final EObject ruleFirst() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1695:2: ( ( () otherlv_1= 'first' ) )
            // InternalEventSetManagerDsl.g:1696:2: ( () otherlv_1= 'first' )
            {
            // InternalEventSetManagerDsl.g:1696:2: ( () otherlv_1= 'first' )
            // InternalEventSetManagerDsl.g:1697:3: () otherlv_1= 'first'
            {
            // InternalEventSetManagerDsl.g:1697:3: ()
            // InternalEventSetManagerDsl.g:1698:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFirstAccess().getFirstAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFirstAccess().getFirstKeyword_1());
            		

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
    // $ANTLR end "ruleFirst"


    // $ANTLR start "entryRuleLast"
    // InternalEventSetManagerDsl.g:1712:1: entryRuleLast returns [EObject current=null] : iv_ruleLast= ruleLast EOF ;
    public final EObject entryRuleLast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLast = null;


        try {
            // InternalEventSetManagerDsl.g:1712:45: (iv_ruleLast= ruleLast EOF )
            // InternalEventSetManagerDsl.g:1713:2: iv_ruleLast= ruleLast EOF
            {
             newCompositeNode(grammarAccess.getLastRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLast=ruleLast();

            state._fsp--;

             current =iv_ruleLast; 
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
    // $ANTLR end "entryRuleLast"


    // $ANTLR start "ruleLast"
    // InternalEventSetManagerDsl.g:1719:1: ruleLast returns [EObject current=null] : ( () otherlv_1= 'last' ) ;
    public final EObject ruleLast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1725:2: ( ( () otherlv_1= 'last' ) )
            // InternalEventSetManagerDsl.g:1726:2: ( () otherlv_1= 'last' )
            {
            // InternalEventSetManagerDsl.g:1726:2: ( () otherlv_1= 'last' )
            // InternalEventSetManagerDsl.g:1727:3: () otherlv_1= 'last'
            {
            // InternalEventSetManagerDsl.g:1727:3: ()
            // InternalEventSetManagerDsl.g:1728:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLastAccess().getLastAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLastAccess().getLastKeyword_1());
            		

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
    // $ANTLR end "ruleLast"


    // $ANTLR start "entryRuleEString"
    // InternalEventSetManagerDsl.g:1742:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalEventSetManagerDsl.g:1742:47: (iv_ruleEString= ruleEString EOF )
            // InternalEventSetManagerDsl.g:1743:2: iv_ruleEString= ruleEString EOF
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
    // InternalEventSetManagerDsl.g:1749:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1755:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalEventSetManagerDsl.g:1756:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalEventSetManagerDsl.g:1756:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_ID) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1757:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:1765:3: this_ID_1= RULE_ID
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
    // InternalEventSetManagerDsl.g:1776:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEventSetManagerDsl.g:1782:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalEventSetManagerDsl.g:1783:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalEventSetManagerDsl.g:1783:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt27=1;
                }
                break;
            case 35:
                {
                alt27=2;
                }
                break;
            case 36:
                {
                alt27=3;
                }
                break;
            case 37:
                {
                alt27=4;
                }
                break;
            case 38:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1784:3: (enumLiteral_0= 'String' )
                    {
                    // InternalEventSetManagerDsl.g:1784:3: (enumLiteral_0= 'String' )
                    // InternalEventSetManagerDsl.g:1785:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:1792:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalEventSetManagerDsl.g:1792:3: (enumLiteral_1= 'Int' )
                    // InternalEventSetManagerDsl.g:1793:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEventSetManagerDsl.g:1800:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalEventSetManagerDsl.g:1800:3: (enumLiteral_2= 'Boolean' )
                    // InternalEventSetManagerDsl.g:1801:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalEventSetManagerDsl.g:1808:3: (enumLiteral_3= 'Float' )
                    {
                    // InternalEventSetManagerDsl.g:1808:3: (enumLiteral_3= 'Float' )
                    // InternalEventSetManagerDsl.g:1809:4: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalEventSetManagerDsl.g:1816:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalEventSetManagerDsl.g:1816:3: (enumLiteral_4= 'Double' )
                    // InternalEventSetManagerDsl.g:1817:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

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


    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\2\10\2\uffff";
    static final String dfa_3s = "\1\42\5\4\2\21\2\uffff";
    static final String dfa_4s = "\1\46\5\6\2\46\2\uffff";
    static final String dfa_5s = "\10\uffff\1\1\1\2";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\7\1\uffff\1\6",
            "\1\7\1\uffff\1\6",
            "\1\7\1\uffff\1\6",
            "\1\7\1\uffff\1\6",
            "\1\7\1\uffff\1\6",
            "\1\10\10\uffff\1\11\7\uffff\5\10",
            "\1\10\10\uffff\1\11\7\uffff\5\10",
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "931:2: (this_KeyConcept_0= ruleKeyConcept | this_RegexConcept_1= ruleRegexConcept )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000501050L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000501052L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000007C00020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020010000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});

}