package uam.eagledata.dsl.query.parser.antlr.internal;

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
import uam.eagledata.dsl.query.services.QueryDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'query-set'", "'{'", "'import'", "'}'", "'.*'", "'.'", "'('", "','", "')'", "':'", "'select'", "'*'", "'from'", "'where'", "'on'", "'not'", "'['", "']'", "'join'", "'left-join'", "'right-join'", "'outer-join'", "'left-outer-join'", "'right-outer-join'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'and'", "'or'", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalQueryDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQueryDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQueryDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQueryDsl.g"; }



     	private QueryDslGrammarAccess grammarAccess;

        public InternalQueryDslParser(TokenStream input, QueryDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "QuerySet";
       	}

       	@Override
       	protected QueryDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleQuerySet"
    // InternalQueryDsl.g:65:1: entryRuleQuerySet returns [EObject current=null] : iv_ruleQuerySet= ruleQuerySet EOF ;
    public final EObject entryRuleQuerySet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuerySet = null;


        try {
            // InternalQueryDsl.g:65:49: (iv_ruleQuerySet= ruleQuerySet EOF )
            // InternalQueryDsl.g:66:2: iv_ruleQuerySet= ruleQuerySet EOF
            {
             newCompositeNode(grammarAccess.getQuerySetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuerySet=ruleQuerySet();

            state._fsp--;

             current =iv_ruleQuerySet; 
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
    // $ANTLR end "entryRuleQuerySet"


    // $ANTLR start "ruleQuerySet"
    // InternalQueryDsl.g:72:1: ruleQuerySet returns [EObject current=null] : ( () otherlv_1= 'query-set' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' (otherlv_4= 'import' ( (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard ) ) (otherlv_6= 'import' ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_queries_8_0= ruleSelect ) ) ( (lv_queries_9_0= ruleSelect ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleQuerySet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_5_0 = null;

        AntlrDatatypeRuleToken lv_importedNamespace_7_0 = null;

        EObject lv_queries_8_0 = null;

        EObject lv_queries_9_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:78:2: ( ( () otherlv_1= 'query-set' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' (otherlv_4= 'import' ( (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard ) ) (otherlv_6= 'import' ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_queries_8_0= ruleSelect ) ) ( (lv_queries_9_0= ruleSelect ) )* )? otherlv_10= '}' ) )
            // InternalQueryDsl.g:79:2: ( () otherlv_1= 'query-set' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' (otherlv_4= 'import' ( (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard ) ) (otherlv_6= 'import' ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_queries_8_0= ruleSelect ) ) ( (lv_queries_9_0= ruleSelect ) )* )? otherlv_10= '}' )
            {
            // InternalQueryDsl.g:79:2: ( () otherlv_1= 'query-set' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' (otherlv_4= 'import' ( (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard ) ) (otherlv_6= 'import' ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_queries_8_0= ruleSelect ) ) ( (lv_queries_9_0= ruleSelect ) )* )? otherlv_10= '}' )
            // InternalQueryDsl.g:80:3: () otherlv_1= 'query-set' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' (otherlv_4= 'import' ( (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard ) ) (otherlv_6= 'import' ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )* )? ( ( (lv_queries_8_0= ruleSelect ) ) ( (lv_queries_9_0= ruleSelect ) )* )? otherlv_10= '}'
            {
            // InternalQueryDsl.g:80:3: ()
            // InternalQueryDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuerySetAccess().getQuerySetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQuerySetAccess().getQuerySetKeyword_1());
            		
            // InternalQueryDsl.g:91:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalQueryDsl.g:92:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalQueryDsl.g:92:4: (lv_name_2_0= ruleQualifiedName )
            // InternalQueryDsl.g:93:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getQuerySetAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQuerySetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.eagledata.dsl.query.QueryDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getQuerySetAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalQueryDsl.g:114:3: (otherlv_4= 'import' ( (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard ) ) (otherlv_6= 'import' ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalQueryDsl.g:115:4: otherlv_4= 'import' ( (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard ) ) (otherlv_6= 'import' ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )*
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getQuerySetAccess().getImportKeyword_4_0());
                    			
                    // InternalQueryDsl.g:119:4: ( (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard ) )
                    // InternalQueryDsl.g:120:5: (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalQueryDsl.g:120:5: (lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard )
                    // InternalQueryDsl.g:121:6: lv_importedNamespace_5_0= ruleQualifiedNameWithWildcard
                    {

                    						newCompositeNode(grammarAccess.getQuerySetAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_importedNamespace_5_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuerySetRule());
                    						}
                    						add(
                    							current,
                    							"importedNamespace",
                    							lv_importedNamespace_5_0,
                    							"uam.eagledata.dsl.query.QueryDsl.QualifiedNameWithWildcard");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQueryDsl.g:138:4: (otherlv_6= 'import' ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalQueryDsl.g:139:5: otherlv_6= 'import' ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    	    {
                    	    otherlv_6=(Token)match(input,13,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getQuerySetAccess().getImportKeyword_4_2_0());
                    	    				
                    	    // InternalQueryDsl.g:143:5: ( (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard ) )
                    	    // InternalQueryDsl.g:144:6: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    	    {
                    	    // InternalQueryDsl.g:144:6: (lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard )
                    	    // InternalQueryDsl.g:145:7: lv_importedNamespace_7_0= ruleQualifiedNameWithWildcard
                    	    {

                    	    							newCompositeNode(grammarAccess.getQuerySetAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_importedNamespace_7_0=ruleQualifiedNameWithWildcard();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getQuerySetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"importedNamespace",
                    	    								lv_importedNamespace_7_0,
                    	    								"uam.eagledata.dsl.query.QueryDsl.QualifiedNameWithWildcard");
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

            // InternalQueryDsl.g:164:3: ( ( (lv_queries_8_0= ruleSelect ) ) ( (lv_queries_9_0= ruleSelect ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQueryDsl.g:165:4: ( (lv_queries_8_0= ruleSelect ) ) ( (lv_queries_9_0= ruleSelect ) )*
                    {
                    // InternalQueryDsl.g:165:4: ( (lv_queries_8_0= ruleSelect ) )
                    // InternalQueryDsl.g:166:5: (lv_queries_8_0= ruleSelect )
                    {
                    // InternalQueryDsl.g:166:5: (lv_queries_8_0= ruleSelect )
                    // InternalQueryDsl.g:167:6: lv_queries_8_0= ruleSelect
                    {

                    						newCompositeNode(grammarAccess.getQuerySetAccess().getQueriesSelectParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_queries_8_0=ruleSelect();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuerySetRule());
                    						}
                    						add(
                    							current,
                    							"queries",
                    							lv_queries_8_0,
                    							"uam.eagledata.dsl.query.QueryDsl.Select");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQueryDsl.g:184:4: ( (lv_queries_9_0= ruleSelect ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalQueryDsl.g:185:5: (lv_queries_9_0= ruleSelect )
                    	    {
                    	    // InternalQueryDsl.g:185:5: (lv_queries_9_0= ruleSelect )
                    	    // InternalQueryDsl.g:186:6: lv_queries_9_0= ruleSelect
                    	    {

                    	    						newCompositeNode(grammarAccess.getQuerySetAccess().getQueriesSelectParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_queries_9_0=ruleSelect();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getQuerySetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"queries",
                    	    							lv_queries_9_0,
                    	    							"uam.eagledata.dsl.query.QueryDsl.Select");
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

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getQuerySetAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleQuerySet"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalQueryDsl.g:212:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalQueryDsl.g:212:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalQueryDsl.g:213:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalQueryDsl.g:219:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:225:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalQueryDsl.g:226:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalQueryDsl.g:226:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalQueryDsl.g:227:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalQueryDsl.g:237:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalQueryDsl.g:238:4: kw= '.*'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

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
    // InternalQueryDsl.g:248:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalQueryDsl.g:248:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalQueryDsl.g:249:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalQueryDsl.g:255:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:261:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalQueryDsl.g:262:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalQueryDsl.g:262:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalQueryDsl.g:263:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalQueryDsl.g:270:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQueryDsl.g:271:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,16,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start "entryRuleSelect"
    // InternalQueryDsl.g:288:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalQueryDsl.g:288:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalQueryDsl.g:289:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalQueryDsl.g:295:1: ruleSelect returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleQueryParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQueryParam ) ) )* otherlv_6= ')' )? otherlv_7= ':' otherlv_8= 'select' ( ( (lv_selectAll_9_0= '*' ) ) | ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) (otherlv_13= 'from' ( ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* ) | ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ ) ) )? (otherlv_19= 'where' ( (lv_where_20_0= ruleCondition ) ) )? ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_selectAll_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_from_14_0 = null;

        EObject lv_from_16_0 = null;

        EObject lv_from_17_0 = null;

        EObject lv_from_18_0 = null;

        EObject lv_where_20_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:301:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleQueryParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQueryParam ) ) )* otherlv_6= ')' )? otherlv_7= ':' otherlv_8= 'select' ( ( (lv_selectAll_9_0= '*' ) ) | ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) (otherlv_13= 'from' ( ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* ) | ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ ) ) )? (otherlv_19= 'where' ( (lv_where_20_0= ruleCondition ) ) )? ) )
            // InternalQueryDsl.g:302:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleQueryParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQueryParam ) ) )* otherlv_6= ')' )? otherlv_7= ':' otherlv_8= 'select' ( ( (lv_selectAll_9_0= '*' ) ) | ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) (otherlv_13= 'from' ( ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* ) | ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ ) ) )? (otherlv_19= 'where' ( (lv_where_20_0= ruleCondition ) ) )? )
            {
            // InternalQueryDsl.g:302:2: ( () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleQueryParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQueryParam ) ) )* otherlv_6= ')' )? otherlv_7= ':' otherlv_8= 'select' ( ( (lv_selectAll_9_0= '*' ) ) | ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) (otherlv_13= 'from' ( ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* ) | ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ ) ) )? (otherlv_19= 'where' ( (lv_where_20_0= ruleCondition ) ) )? )
            // InternalQueryDsl.g:303:3: () ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_params_3_0= ruleQueryParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQueryParam ) ) )* otherlv_6= ')' )? otherlv_7= ':' otherlv_8= 'select' ( ( (lv_selectAll_9_0= '*' ) ) | ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) ) (otherlv_13= 'from' ( ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* ) | ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ ) ) )? (otherlv_19= 'where' ( (lv_where_20_0= ruleCondition ) ) )?
            {
            // InternalQueryDsl.g:303:3: ()
            // InternalQueryDsl.g:304:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSelectAccess().getSelectAction_0(),
            					current);
            			

            }

            // InternalQueryDsl.g:310:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQueryDsl.g:311:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQueryDsl.g:311:4: (lv_name_1_0= RULE_ID )
            // InternalQueryDsl.g:312:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSelectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalQueryDsl.g:328:3: (otherlv_2= '(' ( (lv_params_3_0= ruleQueryParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQueryParam ) ) )* otherlv_6= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalQueryDsl.g:329:4: otherlv_2= '(' ( (lv_params_3_0= ruleQueryParam ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleQueryParam ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalQueryDsl.g:333:4: ( (lv_params_3_0= ruleQueryParam ) )
                    // InternalQueryDsl.g:334:5: (lv_params_3_0= ruleQueryParam )
                    {
                    // InternalQueryDsl.g:334:5: (lv_params_3_0= ruleQueryParam )
                    // InternalQueryDsl.g:335:6: lv_params_3_0= ruleQueryParam
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getParamsQueryParamParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_params_3_0=ruleQueryParam();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						add(
                    							current,
                    							"params",
                    							lv_params_3_0,
                    							"uam.eagledata.dsl.query.QueryDsl.QueryParam");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalQueryDsl.g:352:4: (otherlv_4= ',' ( (lv_params_5_0= ruleQueryParam ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalQueryDsl.g:353:5: otherlv_4= ',' ( (lv_params_5_0= ruleQueryParam ) )
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalQueryDsl.g:357:5: ( (lv_params_5_0= ruleQueryParam ) )
                    	    // InternalQueryDsl.g:358:6: (lv_params_5_0= ruleQueryParam )
                    	    {
                    	    // InternalQueryDsl.g:358:6: (lv_params_5_0= ruleQueryParam )
                    	    // InternalQueryDsl.g:359:7: lv_params_5_0= ruleQueryParam
                    	    {

                    	    							newCompositeNode(grammarAccess.getSelectAccess().getParamsQueryParamParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_params_5_0=ruleQueryParam();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSelectRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"params",
                    	    								lv_params_5_0,
                    	    								"uam.eagledata.dsl.query.QueryDsl.QueryParam");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_7, grammarAccess.getSelectAccess().getColonKeyword_3());
            		
            otherlv_8=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getSelectAccess().getSelectKeyword_4());
            		
            // InternalQueryDsl.g:390:3: ( ( (lv_selectAll_9_0= '*' ) ) | ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalQueryDsl.g:391:4: ( (lv_selectAll_9_0= '*' ) )
                    {
                    // InternalQueryDsl.g:391:4: ( (lv_selectAll_9_0= '*' ) )
                    // InternalQueryDsl.g:392:5: (lv_selectAll_9_0= '*' )
                    {
                    // InternalQueryDsl.g:392:5: (lv_selectAll_9_0= '*' )
                    // InternalQueryDsl.g:393:6: lv_selectAll_9_0= '*'
                    {
                    lv_selectAll_9_0=(Token)match(input,22,FOLLOW_15); 

                    						newLeafNode(lv_selectAll_9_0, grammarAccess.getSelectAccess().getSelectAllAsteriskKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectRule());
                    						}
                    						setWithLastConsumed(current, "selectAll", true, "*");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:406:4: ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )
                    {
                    // InternalQueryDsl.g:406:4: ( ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* )
                    // InternalQueryDsl.g:407:5: ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    {
                    // InternalQueryDsl.g:407:5: ( (otherlv_10= RULE_ID ) )
                    // InternalQueryDsl.g:408:6: (otherlv_10= RULE_ID )
                    {
                    // InternalQueryDsl.g:408:6: (otherlv_10= RULE_ID )
                    // InternalQueryDsl.g:409:7: otherlv_10= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSelectRule());
                    							}
                    						
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_16); 

                    							newLeafNode(otherlv_10, grammarAccess.getSelectAccess().getSelectionDataPropertyCrossReference_5_1_0_0());
                    						

                    }


                    }

                    // InternalQueryDsl.g:420:5: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalQueryDsl.g:421:6: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,18,FOLLOW_3); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getSelectAccess().getCommaKeyword_5_1_1_0());
                    	    					
                    	    // InternalQueryDsl.g:425:6: ( (otherlv_12= RULE_ID ) )
                    	    // InternalQueryDsl.g:426:7: (otherlv_12= RULE_ID )
                    	    {
                    	    // InternalQueryDsl.g:426:7: (otherlv_12= RULE_ID )
                    	    // InternalQueryDsl.g:427:8: otherlv_12= RULE_ID
                    	    {

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getSelectRule());
                    	    								}
                    	    							
                    	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    								newLeafNode(otherlv_12, grammarAccess.getSelectAccess().getSelectionDataPropertyCrossReference_5_1_1_1_0());
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalQueryDsl.g:441:3: (otherlv_13= 'from' ( ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* ) | ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQueryDsl.g:442:4: otherlv_13= 'from' ( ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* ) | ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ ) )
                    {
                    otherlv_13=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getSelectAccess().getFromKeyword_6_0());
                    			
                    // InternalQueryDsl.g:446:4: ( ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* ) | ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ ) )
                    int alt13=2;
                    alt13 = dfa13.predict(input);
                    switch (alt13) {
                        case 1 :
                            // InternalQueryDsl.g:447:5: ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* )
                            {
                            // InternalQueryDsl.g:447:5: ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* )
                            // InternalQueryDsl.g:448:6: ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )*
                            {
                            // InternalQueryDsl.g:448:6: ( (lv_from_14_0= ruleSimpleFrom ) )
                            // InternalQueryDsl.g:449:7: (lv_from_14_0= ruleSimpleFrom )
                            {
                            // InternalQueryDsl.g:449:7: (lv_from_14_0= ruleSimpleFrom )
                            // InternalQueryDsl.g:450:8: lv_from_14_0= ruleSimpleFrom
                            {

                            								newCompositeNode(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_0_0_0());
                            							
                            pushFollow(FOLLOW_17);
                            lv_from_14_0=ruleSimpleFrom();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getSelectRule());
                            								}
                            								add(
                            									current,
                            									"from",
                            									lv_from_14_0,
                            									"uam.eagledata.dsl.query.QueryDsl.SimpleFrom");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalQueryDsl.g:467:6: (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==18) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalQueryDsl.g:468:7: otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) )
                            	    {
                            	    otherlv_15=(Token)match(input,18,FOLLOW_3); 

                            	    							newLeafNode(otherlv_15, grammarAccess.getSelectAccess().getCommaKeyword_6_1_0_1_0());
                            	    						
                            	    // InternalQueryDsl.g:472:7: ( (lv_from_16_0= ruleSimpleFrom ) )
                            	    // InternalQueryDsl.g:473:8: (lv_from_16_0= ruleSimpleFrom )
                            	    {
                            	    // InternalQueryDsl.g:473:8: (lv_from_16_0= ruleSimpleFrom )
                            	    // InternalQueryDsl.g:474:9: lv_from_16_0= ruleSimpleFrom
                            	    {

                            	    									newCompositeNode(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_0_1_1_0());
                            	    								
                            	    pushFollow(FOLLOW_17);
                            	    lv_from_16_0=ruleSimpleFrom();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getSelectRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"from",
                            	    										lv_from_16_0,
                            	    										"uam.eagledata.dsl.query.QueryDsl.SimpleFrom");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop11;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalQueryDsl.g:494:5: ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ )
                            {
                            // InternalQueryDsl.g:494:5: ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ )
                            // InternalQueryDsl.g:495:6: ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+
                            {
                            // InternalQueryDsl.g:495:6: ( (lv_from_17_0= ruleSimpleFrom ) )
                            // InternalQueryDsl.g:496:7: (lv_from_17_0= ruleSimpleFrom )
                            {
                            // InternalQueryDsl.g:496:7: (lv_from_17_0= ruleSimpleFrom )
                            // InternalQueryDsl.g:497:8: lv_from_17_0= ruleSimpleFrom
                            {

                            								newCompositeNode(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_1_0_0());
                            							
                            pushFollow(FOLLOW_18);
                            lv_from_17_0=ruleSimpleFrom();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getSelectRule());
                            								}
                            								add(
                            									current,
                            									"from",
                            									lv_from_17_0,
                            									"uam.eagledata.dsl.query.QueryDsl.SimpleFrom");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }

                            // InternalQueryDsl.g:514:6: ( (lv_from_18_0= ruleCompositeFrom ) )+
                            int cnt12=0;
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( ((LA12_0>=29 && LA12_0<=34)) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalQueryDsl.g:515:7: (lv_from_18_0= ruleCompositeFrom )
                            	    {
                            	    // InternalQueryDsl.g:515:7: (lv_from_18_0= ruleCompositeFrom )
                            	    // InternalQueryDsl.g:516:8: lv_from_18_0= ruleCompositeFrom
                            	    {

                            	    								newCompositeNode(grammarAccess.getSelectAccess().getFromCompositeFromParserRuleCall_6_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_19);
                            	    lv_from_18_0=ruleCompositeFrom();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getSelectRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"from",
                            	    									lv_from_18_0,
                            	    									"uam.eagledata.dsl.query.QueryDsl.CompositeFrom");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt12 >= 1 ) break loop12;
                                        EarlyExitException eee =
                                            new EarlyExitException(12, input);
                                        throw eee;
                                }
                                cnt12++;
                            } while (true);


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalQueryDsl.g:536:3: (otherlv_19= 'where' ( (lv_where_20_0= ruleCondition ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalQueryDsl.g:537:4: otherlv_19= 'where' ( (lv_where_20_0= ruleCondition ) )
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_19, grammarAccess.getSelectAccess().getWhereKeyword_7_0());
                    			
                    // InternalQueryDsl.g:541:4: ( (lv_where_20_0= ruleCondition ) )
                    // InternalQueryDsl.g:542:5: (lv_where_20_0= ruleCondition )
                    {
                    // InternalQueryDsl.g:542:5: (lv_where_20_0= ruleCondition )
                    // InternalQueryDsl.g:543:6: lv_where_20_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getSelectAccess().getWhereConditionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_where_20_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectRule());
                    						}
                    						set(
                    							current,
                    							"where",
                    							lv_where_20_0,
                    							"uam.eagledata.dsl.query.QueryDsl.Condition");
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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleQueryParam"
    // InternalQueryDsl.g:565:1: entryRuleQueryParam returns [EObject current=null] : iv_ruleQueryParam= ruleQueryParam EOF ;
    public final EObject entryRuleQueryParam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryParam = null;


        try {
            // InternalQueryDsl.g:565:51: (iv_ruleQueryParam= ruleQueryParam EOF )
            // InternalQueryDsl.g:566:2: iv_ruleQueryParam= ruleQueryParam EOF
            {
             newCompositeNode(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryParam=ruleQueryParam();

            state._fsp--;

             current =iv_ruleQueryParam; 
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
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalQueryDsl.g:572:1: ruleQueryParam returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleQueryParam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:578:2: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalQueryDsl.g:579:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalQueryDsl.g:579:2: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // InternalQueryDsl.g:580:3: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // InternalQueryDsl.g:580:3: ( (lv_type_0_0= ruleType ) )
            // InternalQueryDsl.g:581:4: (lv_type_0_0= ruleType )
            {
            // InternalQueryDsl.g:581:4: (lv_type_0_0= ruleType )
            // InternalQueryDsl.g:582:5: lv_type_0_0= ruleType
            {

            					newCompositeNode(grammarAccess.getQueryParamAccess().getTypeTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_type_0_0=ruleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryParamRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"uam.eagledata.dsl.query.QueryDsl.Type");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:599:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalQueryDsl.g:600:4: (lv_name_1_0= RULE_ID )
            {
            // InternalQueryDsl.g:600:4: (lv_name_1_0= RULE_ID )
            // InternalQueryDsl.g:601:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryParamRule());
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
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRuleSimpleFrom"
    // InternalQueryDsl.g:621:1: entryRuleSimpleFrom returns [EObject current=null] : iv_ruleSimpleFrom= ruleSimpleFrom EOF ;
    public final EObject entryRuleSimpleFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleFrom = null;


        try {
            // InternalQueryDsl.g:621:51: (iv_ruleSimpleFrom= ruleSimpleFrom EOF )
            // InternalQueryDsl.g:622:2: iv_ruleSimpleFrom= ruleSimpleFrom EOF
            {
             newCompositeNode(grammarAccess.getSimpleFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleFrom=ruleSimpleFrom();

            state._fsp--;

             current =iv_ruleSimpleFrom; 
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
    // $ANTLR end "entryRuleSimpleFrom"


    // $ANTLR start "ruleSimpleFrom"
    // InternalQueryDsl.g:628:1: ruleSimpleFrom returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSimpleFrom() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalQueryDsl.g:634:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalQueryDsl.g:635:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalQueryDsl.g:635:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalQueryDsl.g:636:3: () ( ( ruleQualifiedName ) )
            {
            // InternalQueryDsl.g:636:3: ()
            // InternalQueryDsl.g:637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleFromAccess().getSimpleFromAction_0(),
            					current);
            			

            }

            // InternalQueryDsl.g:643:3: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:644:4: ( ruleQualifiedName )
            {
            // InternalQueryDsl.g:644:4: ( ruleQualifiedName )
            // InternalQueryDsl.g:645:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleFromRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleFromAccess().getSourceSemanticNodeCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


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
    // $ANTLR end "ruleSimpleFrom"


    // $ANTLR start "entryRuleCompositeFrom"
    // InternalQueryDsl.g:663:1: entryRuleCompositeFrom returns [EObject current=null] : iv_ruleCompositeFrom= ruleCompositeFrom EOF ;
    public final EObject entryRuleCompositeFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeFrom = null;


        try {
            // InternalQueryDsl.g:663:54: (iv_ruleCompositeFrom= ruleCompositeFrom EOF )
            // InternalQueryDsl.g:664:2: iv_ruleCompositeFrom= ruleCompositeFrom EOF
            {
             newCompositeNode(grammarAccess.getCompositeFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeFrom=ruleCompositeFrom();

            state._fsp--;

             current =iv_ruleCompositeFrom; 
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
    // $ANTLR end "entryRuleCompositeFrom"


    // $ANTLR start "ruleCompositeFrom"
    // InternalQueryDsl.g:670:1: ruleCompositeFrom returns [EObject current=null] : ( () ( (lv_join_1_0= ruleJoinType ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'on' ( (lv_on_4_0= ruleCondition ) ) ) ;
    public final EObject ruleCompositeFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Enumerator lv_join_1_0 = null;

        EObject lv_on_4_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:676:2: ( ( () ( (lv_join_1_0= ruleJoinType ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'on' ( (lv_on_4_0= ruleCondition ) ) ) )
            // InternalQueryDsl.g:677:2: ( () ( (lv_join_1_0= ruleJoinType ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'on' ( (lv_on_4_0= ruleCondition ) ) )
            {
            // InternalQueryDsl.g:677:2: ( () ( (lv_join_1_0= ruleJoinType ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'on' ( (lv_on_4_0= ruleCondition ) ) )
            // InternalQueryDsl.g:678:3: () ( (lv_join_1_0= ruleJoinType ) ) ( ( ruleQualifiedName ) ) otherlv_3= 'on' ( (lv_on_4_0= ruleCondition ) )
            {
            // InternalQueryDsl.g:678:3: ()
            // InternalQueryDsl.g:679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeFromAccess().getCompositeFromAction_0(),
            					current);
            			

            }

            // InternalQueryDsl.g:685:3: ( (lv_join_1_0= ruleJoinType ) )
            // InternalQueryDsl.g:686:4: (lv_join_1_0= ruleJoinType )
            {
            // InternalQueryDsl.g:686:4: (lv_join_1_0= ruleJoinType )
            // InternalQueryDsl.g:687:5: lv_join_1_0= ruleJoinType
            {

            					newCompositeNode(grammarAccess.getCompositeFromAccess().getJoinJoinTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_join_1_0=ruleJoinType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeFromRule());
            					}
            					set(
            						current,
            						"join",
            						lv_join_1_0,
            						"uam.eagledata.dsl.query.QueryDsl.JoinType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:704:3: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:705:4: ( ruleQualifiedName )
            {
            // InternalQueryDsl.g:705:4: ( ruleQualifiedName )
            // InternalQueryDsl.g:706:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeFromRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeFromAccess().getSourceSemanticNodeCrossReference_2_0());
            				
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getCompositeFromAccess().getOnKeyword_3());
            		
            // InternalQueryDsl.g:724:3: ( (lv_on_4_0= ruleCondition ) )
            // InternalQueryDsl.g:725:4: (lv_on_4_0= ruleCondition )
            {
            // InternalQueryDsl.g:725:4: (lv_on_4_0= ruleCondition )
            // InternalQueryDsl.g:726:5: lv_on_4_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getCompositeFromAccess().getOnConditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_on_4_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeFromRule());
            					}
            					set(
            						current,
            						"on",
            						lv_on_4_0,
            						"uam.eagledata.dsl.query.QueryDsl.Condition");
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
    // $ANTLR end "ruleCompositeFrom"


    // $ANTLR start "entryRuleCondition"
    // InternalQueryDsl.g:747:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalQueryDsl.g:747:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalQueryDsl.g:748:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalQueryDsl.g:754:1: ruleCondition returns [EObject current=null] : (this_SimpleCondition_0= ruleSimpleCondition | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleCondition_0 = null;

        EObject this_CompositeCondition_1 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:760:2: ( (this_SimpleCondition_0= ruleSimpleCondition | this_CompositeCondition_1= ruleCompositeCondition ) )
            // InternalQueryDsl.g:761:2: (this_SimpleCondition_0= ruleSimpleCondition | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // InternalQueryDsl.g:761:2: (this_SimpleCondition_0= ruleSimpleCondition | this_CompositeCondition_1= ruleCompositeCondition )
            int alt16=2;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalQueryDsl.g:762:3: this_SimpleCondition_0= ruleSimpleCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleCondition_0=ruleSimpleCondition();

                    state._fsp--;


                    			current = this_SimpleCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:771:3: this_CompositeCondition_1= ruleCompositeCondition
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeCondition_1=ruleCompositeCondition();

                    state._fsp--;


                    			current = this_CompositeCondition_1;
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


    // $ANTLR start "entryRuleSimpleCondition"
    // InternalQueryDsl.g:783:1: entryRuleSimpleCondition returns [EObject current=null] : iv_ruleSimpleCondition= ruleSimpleCondition EOF ;
    public final EObject entryRuleSimpleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleCondition = null;


        try {
            // InternalQueryDsl.g:783:56: (iv_ruleSimpleCondition= ruleSimpleCondition EOF )
            // InternalQueryDsl.g:784:2: iv_ruleSimpleCondition= ruleSimpleCondition EOF
            {
             newCompositeNode(grammarAccess.getSimpleConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleCondition=ruleSimpleCondition();

            state._fsp--;

             current =iv_ruleSimpleCondition; 
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
    // $ANTLR end "entryRuleSimpleCondition"


    // $ANTLR start "ruleSimpleCondition"
    // InternalQueryDsl.g:790:1: ruleSimpleCondition returns [EObject current=null] : ( () ( (lv_predicate_1_0= rulePredicate ) ) ) ;
    public final EObject ruleSimpleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_1_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:796:2: ( ( () ( (lv_predicate_1_0= rulePredicate ) ) ) )
            // InternalQueryDsl.g:797:2: ( () ( (lv_predicate_1_0= rulePredicate ) ) )
            {
            // InternalQueryDsl.g:797:2: ( () ( (lv_predicate_1_0= rulePredicate ) ) )
            // InternalQueryDsl.g:798:3: () ( (lv_predicate_1_0= rulePredicate ) )
            {
            // InternalQueryDsl.g:798:3: ()
            // InternalQueryDsl.g:799:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0(),
            					current);
            			

            }

            // InternalQueryDsl.g:805:3: ( (lv_predicate_1_0= rulePredicate ) )
            // InternalQueryDsl.g:806:4: (lv_predicate_1_0= rulePredicate )
            {
            // InternalQueryDsl.g:806:4: (lv_predicate_1_0= rulePredicate )
            // InternalQueryDsl.g:807:5: lv_predicate_1_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getSimpleConditionAccess().getPredicatePredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_predicate_1_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleConditionRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_1_0,
            						"uam.eagledata.dsl.query.QueryDsl.Predicate");
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
    // $ANTLR end "ruleSimpleCondition"


    // $ANTLR start "entryRulePredicate"
    // InternalQueryDsl.g:828:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // InternalQueryDsl.g:828:50: (iv_rulePredicate= rulePredicate EOF )
            // InternalQueryDsl.g:829:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalQueryDsl.g:835:1: rulePredicate returns [EObject current=null] : (this_PrimitiveValuePredicate_0= rulePrimitiveValuePredicate | this_ModelValuePredicate_1= ruleModelValuePredicate | this_ParamValuePredicate_2= ruleParamValuePredicate ) ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveValuePredicate_0 = null;

        EObject this_ModelValuePredicate_1 = null;

        EObject this_ParamValuePredicate_2 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:841:2: ( (this_PrimitiveValuePredicate_0= rulePrimitiveValuePredicate | this_ModelValuePredicate_1= ruleModelValuePredicate | this_ParamValuePredicate_2= ruleParamValuePredicate ) )
            // InternalQueryDsl.g:842:2: (this_PrimitiveValuePredicate_0= rulePrimitiveValuePredicate | this_ModelValuePredicate_1= ruleModelValuePredicate | this_ParamValuePredicate_2= ruleParamValuePredicate )
            {
            // InternalQueryDsl.g:842:2: (this_PrimitiveValuePredicate_0= rulePrimitiveValuePredicate | this_ModelValuePredicate_1= ruleModelValuePredicate | this_ParamValuePredicate_2= ruleParamValuePredicate )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalQueryDsl.g:843:3: this_PrimitiveValuePredicate_0= rulePrimitiveValuePredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getPrimitiveValuePredicateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveValuePredicate_0=rulePrimitiveValuePredicate();

                    state._fsp--;


                    			current = this_PrimitiveValuePredicate_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:852:3: this_ModelValuePredicate_1= ruleModelValuePredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getModelValuePredicateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ModelValuePredicate_1=ruleModelValuePredicate();

                    state._fsp--;


                    			current = this_ModelValuePredicate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:861:3: this_ParamValuePredicate_2= ruleParamValuePredicate
                    {

                    			newCompositeNode(grammarAccess.getPredicateAccess().getParamValuePredicateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParamValuePredicate_2=ruleParamValuePredicate();

                    state._fsp--;


                    			current = this_ParamValuePredicate_2;
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRulePrimitiveValuePredicate"
    // InternalQueryDsl.g:873:1: entryRulePrimitiveValuePredicate returns [EObject current=null] : iv_rulePrimitiveValuePredicate= rulePrimitiveValuePredicate EOF ;
    public final EObject entryRulePrimitiveValuePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValuePredicate = null;


        try {
            // InternalQueryDsl.g:873:64: (iv_rulePrimitiveValuePredicate= rulePrimitiveValuePredicate EOF )
            // InternalQueryDsl.g:874:2: iv_rulePrimitiveValuePredicate= rulePrimitiveValuePredicate EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveValuePredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveValuePredicate=rulePrimitiveValuePredicate();

            state._fsp--;

             current =iv_rulePrimitiveValuePredicate; 
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
    // $ANTLR end "entryRulePrimitiveValuePredicate"


    // $ANTLR start "rulePrimitiveValuePredicate"
    // InternalQueryDsl.g:880:1: rulePrimitiveValuePredicate returns [EObject current=null] : ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) ( (lv_value_4_0= ruleEString ) ) ) ;
    public final EObject rulePrimitiveValuePredicate() throws RecognitionException {
        EObject current = null;

        Token lv_not_1_0=null;
        Enumerator lv_comparisonType_3_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:886:2: ( ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) ( (lv_value_4_0= ruleEString ) ) ) )
            // InternalQueryDsl.g:887:2: ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) ( (lv_value_4_0= ruleEString ) ) )
            {
            // InternalQueryDsl.g:887:2: ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) ( (lv_value_4_0= ruleEString ) ) )
            // InternalQueryDsl.g:888:3: () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) ( (lv_value_4_0= ruleEString ) )
            {
            // InternalQueryDsl.g:888:3: ()
            // InternalQueryDsl.g:889:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveValuePredicateAccess().getPrimitiveValueComparisonPredicateAction_0(),
            					current);
            			

            }

            // InternalQueryDsl.g:895:3: ( (lv_not_1_0= 'not' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQueryDsl.g:896:4: (lv_not_1_0= 'not' )
                    {
                    // InternalQueryDsl.g:896:4: (lv_not_1_0= 'not' )
                    // InternalQueryDsl.g:897:5: lv_not_1_0= 'not'
                    {
                    lv_not_1_0=(Token)match(input,26,FOLLOW_3); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getPrimitiveValuePredicateAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveValuePredicateRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQueryDsl.g:909:3: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:910:4: ( ruleQualifiedName )
            {
            // InternalQueryDsl.g:910:4: ( ruleQualifiedName )
            // InternalQueryDsl.g:911:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveValuePredicateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPrimitiveValuePredicateAccess().getLeftDataPropertyCrossReference_2_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:925:3: ( (lv_comparisonType_3_0= ruleComparisonType ) )
            // InternalQueryDsl.g:926:4: (lv_comparisonType_3_0= ruleComparisonType )
            {
            // InternalQueryDsl.g:926:4: (lv_comparisonType_3_0= ruleComparisonType )
            // InternalQueryDsl.g:927:5: lv_comparisonType_3_0= ruleComparisonType
            {

            					newCompositeNode(grammarAccess.getPrimitiveValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_23);
            lv_comparisonType_3_0=ruleComparisonType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveValuePredicateRule());
            					}
            					set(
            						current,
            						"comparisonType",
            						lv_comparisonType_3_0,
            						"uam.eagledata.dsl.query.QueryDsl.ComparisonType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:944:3: ( (lv_value_4_0= ruleEString ) )
            // InternalQueryDsl.g:945:4: (lv_value_4_0= ruleEString )
            {
            // InternalQueryDsl.g:945:4: (lv_value_4_0= ruleEString )
            // InternalQueryDsl.g:946:5: lv_value_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitiveValuePredicateAccess().getValueEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveValuePredicateRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"uam.eagledata.dsl.query.QueryDsl.EString");
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
    // $ANTLR end "rulePrimitiveValuePredicate"


    // $ANTLR start "entryRuleModelValuePredicate"
    // InternalQueryDsl.g:967:1: entryRuleModelValuePredicate returns [EObject current=null] : iv_ruleModelValuePredicate= ruleModelValuePredicate EOF ;
    public final EObject entryRuleModelValuePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelValuePredicate = null;


        try {
            // InternalQueryDsl.g:967:60: (iv_ruleModelValuePredicate= ruleModelValuePredicate EOF )
            // InternalQueryDsl.g:968:2: iv_ruleModelValuePredicate= ruleModelValuePredicate EOF
            {
             newCompositeNode(grammarAccess.getModelValuePredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelValuePredicate=ruleModelValuePredicate();

            state._fsp--;

             current =iv_ruleModelValuePredicate; 
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
    // $ANTLR end "entryRuleModelValuePredicate"


    // $ANTLR start "ruleModelValuePredicate"
    // InternalQueryDsl.g:974:1: ruleModelValuePredicate returns [EObject current=null] : ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '{' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) ;
    public final EObject ruleModelValuePredicate() throws RecognitionException {
        EObject current = null;

        Token lv_not_1_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_comparisonType_3_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:980:2: ( ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '{' ( ( ruleQualifiedName ) ) otherlv_6= '}' ) )
            // InternalQueryDsl.g:981:2: ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '{' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            {
            // InternalQueryDsl.g:981:2: ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '{' ( ( ruleQualifiedName ) ) otherlv_6= '}' )
            // InternalQueryDsl.g:982:3: () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '{' ( ( ruleQualifiedName ) ) otherlv_6= '}'
            {
            // InternalQueryDsl.g:982:3: ()
            // InternalQueryDsl.g:983:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelValuePredicateAccess().getModelValueComparisonPredicateAction_0(),
            					current);
            			

            }

            // InternalQueryDsl.g:989:3: ( (lv_not_1_0= 'not' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQueryDsl.g:990:4: (lv_not_1_0= 'not' )
                    {
                    // InternalQueryDsl.g:990:4: (lv_not_1_0= 'not' )
                    // InternalQueryDsl.g:991:5: lv_not_1_0= 'not'
                    {
                    lv_not_1_0=(Token)match(input,26,FOLLOW_3); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getModelValuePredicateAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelValuePredicateRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQueryDsl.g:1003:3: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:1004:4: ( ruleQualifiedName )
            {
            // InternalQueryDsl.g:1004:4: ( ruleQualifiedName )
            // InternalQueryDsl.g:1005:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelValuePredicateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModelValuePredicateAccess().getLeftDataPropertyCrossReference_2_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:1019:3: ( (lv_comparisonType_3_0= ruleComparisonType ) )
            // InternalQueryDsl.g:1020:4: (lv_comparisonType_3_0= ruleComparisonType )
            {
            // InternalQueryDsl.g:1020:4: (lv_comparisonType_3_0= ruleComparisonType )
            // InternalQueryDsl.g:1021:5: lv_comparisonType_3_0= ruleComparisonType
            {

            					newCompositeNode(grammarAccess.getModelValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_comparisonType_3_0=ruleComparisonType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelValuePredicateRule());
            					}
            					set(
            						current,
            						"comparisonType",
            						lv_comparisonType_3_0,
            						"uam.eagledata.dsl.query.QueryDsl.ComparisonType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getModelValuePredicateAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalQueryDsl.g:1042:3: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:1043:4: ( ruleQualifiedName )
            {
            // InternalQueryDsl.g:1043:4: ( ruleQualifiedName )
            // InternalQueryDsl.g:1044:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelValuePredicateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getModelValuePredicateAccess().getRightDataPropertyCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getModelValuePredicateAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleModelValuePredicate"


    // $ANTLR start "entryRuleParamValuePredicate"
    // InternalQueryDsl.g:1066:1: entryRuleParamValuePredicate returns [EObject current=null] : iv_ruleParamValuePredicate= ruleParamValuePredicate EOF ;
    public final EObject entryRuleParamValuePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParamValuePredicate = null;


        try {
            // InternalQueryDsl.g:1066:60: (iv_ruleParamValuePredicate= ruleParamValuePredicate EOF )
            // InternalQueryDsl.g:1067:2: iv_ruleParamValuePredicate= ruleParamValuePredicate EOF
            {
             newCompositeNode(grammarAccess.getParamValuePredicateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParamValuePredicate=ruleParamValuePredicate();

            state._fsp--;

             current =iv_ruleParamValuePredicate; 
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
    // $ANTLR end "entryRuleParamValuePredicate"


    // $ANTLR start "ruleParamValuePredicate"
    // InternalQueryDsl.g:1073:1: ruleParamValuePredicate returns [EObject current=null] : ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) ;
    public final EObject ruleParamValuePredicate() throws RecognitionException {
        EObject current = null;

        Token lv_not_1_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_comparisonType_3_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1079:2: ( ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' ) )
            // InternalQueryDsl.g:1080:2: ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' )
            {
            // InternalQueryDsl.g:1080:2: ( () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']' )
            // InternalQueryDsl.g:1081:3: () ( (lv_not_1_0= 'not' ) )? ( ( ruleQualifiedName ) ) ( (lv_comparisonType_3_0= ruleComparisonType ) ) otherlv_4= '[' ( (otherlv_5= RULE_ID ) ) otherlv_6= ']'
            {
            // InternalQueryDsl.g:1081:3: ()
            // InternalQueryDsl.g:1082:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParamValuePredicateAccess().getParamValueComparisonPredicateAction_0(),
            					current);
            			

            }

            // InternalQueryDsl.g:1088:3: ( (lv_not_1_0= 'not' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalQueryDsl.g:1089:4: (lv_not_1_0= 'not' )
                    {
                    // InternalQueryDsl.g:1089:4: (lv_not_1_0= 'not' )
                    // InternalQueryDsl.g:1090:5: lv_not_1_0= 'not'
                    {
                    lv_not_1_0=(Token)match(input,26,FOLLOW_3); 

                    					newLeafNode(lv_not_1_0, grammarAccess.getParamValuePredicateAccess().getNotNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParamValuePredicateRule());
                    					}
                    					setWithLastConsumed(current, "not", true, "not");
                    				

                    }


                    }
                    break;

            }

            // InternalQueryDsl.g:1102:3: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:1103:4: ( ruleQualifiedName )
            {
            // InternalQueryDsl.g:1103:4: ( ruleQualifiedName )
            // InternalQueryDsl.g:1104:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValuePredicateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getParamValuePredicateAccess().getLeftDataPropertyCrossReference_2_0());
            				
            pushFollow(FOLLOW_22);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:1118:3: ( (lv_comparisonType_3_0= ruleComparisonType ) )
            // InternalQueryDsl.g:1119:4: (lv_comparisonType_3_0= ruleComparisonType )
            {
            // InternalQueryDsl.g:1119:4: (lv_comparisonType_3_0= ruleComparisonType )
            // InternalQueryDsl.g:1120:5: lv_comparisonType_3_0= ruleComparisonType
            {

            					newCompositeNode(grammarAccess.getParamValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_comparisonType_3_0=ruleComparisonType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParamValuePredicateRule());
            					}
            					set(
            						current,
            						"comparisonType",
            						lv_comparisonType_3_0,
            						"uam.eagledata.dsl.query.QueryDsl.ComparisonType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getParamValuePredicateAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalQueryDsl.g:1141:3: ( (otherlv_5= RULE_ID ) )
            // InternalQueryDsl.g:1142:4: (otherlv_5= RULE_ID )
            {
            // InternalQueryDsl.g:1142:4: (otherlv_5= RULE_ID )
            // InternalQueryDsl.g:1143:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getParamValuePredicateRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_5, grammarAccess.getParamValuePredicateAccess().getRightQueryParamCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParamValuePredicateAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleParamValuePredicate"


    // $ANTLR start "entryRuleCompositeCondition"
    // InternalQueryDsl.g:1162:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // InternalQueryDsl.g:1162:59: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // InternalQueryDsl.g:1163:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
             newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;

             current =iv_ruleCompositeCondition; 
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
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // InternalQueryDsl.g:1169:1: ruleCompositeCondition returns [EObject current=null] : ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_connection_2_0= ruleConnectionType ) ) ( (lv_on_3_0= ruleCondition ) ) ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_predicate_1_0 = null;

        Enumerator lv_connection_2_0 = null;

        EObject lv_on_3_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1175:2: ( ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_connection_2_0= ruleConnectionType ) ) ( (lv_on_3_0= ruleCondition ) ) ) )
            // InternalQueryDsl.g:1176:2: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_connection_2_0= ruleConnectionType ) ) ( (lv_on_3_0= ruleCondition ) ) )
            {
            // InternalQueryDsl.g:1176:2: ( () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_connection_2_0= ruleConnectionType ) ) ( (lv_on_3_0= ruleCondition ) ) )
            // InternalQueryDsl.g:1177:3: () ( (lv_predicate_1_0= rulePredicate ) ) ( (lv_connection_2_0= ruleConnectionType ) ) ( (lv_on_3_0= ruleCondition ) )
            {
            // InternalQueryDsl.g:1177:3: ()
            // InternalQueryDsl.g:1178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeConditionAccess().getCompositeConditionAction_0(),
            					current);
            			

            }

            // InternalQueryDsl.g:1184:3: ( (lv_predicate_1_0= rulePredicate ) )
            // InternalQueryDsl.g:1185:4: (lv_predicate_1_0= rulePredicate )
            {
            // InternalQueryDsl.g:1185:4: (lv_predicate_1_0= rulePredicate )
            // InternalQueryDsl.g:1186:5: lv_predicate_1_0= rulePredicate
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getPredicatePredicateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_predicate_1_0=rulePredicate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            					}
            					set(
            						current,
            						"predicate",
            						lv_predicate_1_0,
            						"uam.eagledata.dsl.query.QueryDsl.Predicate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:1203:3: ( (lv_connection_2_0= ruleConnectionType ) )
            // InternalQueryDsl.g:1204:4: (lv_connection_2_0= ruleConnectionType )
            {
            // InternalQueryDsl.g:1204:4: (lv_connection_2_0= ruleConnectionType )
            // InternalQueryDsl.g:1205:5: lv_connection_2_0= ruleConnectionType
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getConnectionConnectionTypeEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_connection_2_0=ruleConnectionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            					}
            					set(
            						current,
            						"connection",
            						lv_connection_2_0,
            						"uam.eagledata.dsl.query.QueryDsl.ConnectionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:1222:3: ( (lv_on_3_0= ruleCondition ) )
            // InternalQueryDsl.g:1223:4: (lv_on_3_0= ruleCondition )
            {
            // InternalQueryDsl.g:1223:4: (lv_on_3_0= ruleCondition )
            // InternalQueryDsl.g:1224:5: lv_on_3_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getCompositeConditionAccess().getOnConditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_on_3_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
            					}
            					set(
            						current,
            						"on",
            						lv_on_3_0,
            						"uam.eagledata.dsl.query.QueryDsl.Condition");
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
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleEString"
    // InternalQueryDsl.g:1245:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalQueryDsl.g:1245:47: (iv_ruleEString= ruleEString EOF )
            // InternalQueryDsl.g:1246:2: iv_ruleEString= ruleEString EOF
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
    // InternalQueryDsl.g:1252:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:1258:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalQueryDsl.g:1259:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalQueryDsl.g:1259:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
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
                    // InternalQueryDsl.g:1260:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1268:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleJoinType"
    // InternalQueryDsl.g:1279:1: ruleJoinType returns [Enumerator current=null] : ( (enumLiteral_0= 'join' ) | (enumLiteral_1= 'left-join' ) | (enumLiteral_2= 'right-join' ) | (enumLiteral_3= 'outer-join' ) | (enumLiteral_4= 'left-outer-join' ) | (enumLiteral_5= 'right-outer-join' ) ) ;
    public final Enumerator ruleJoinType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:1285:2: ( ( (enumLiteral_0= 'join' ) | (enumLiteral_1= 'left-join' ) | (enumLiteral_2= 'right-join' ) | (enumLiteral_3= 'outer-join' ) | (enumLiteral_4= 'left-outer-join' ) | (enumLiteral_5= 'right-outer-join' ) ) )
            // InternalQueryDsl.g:1286:2: ( (enumLiteral_0= 'join' ) | (enumLiteral_1= 'left-join' ) | (enumLiteral_2= 'right-join' ) | (enumLiteral_3= 'outer-join' ) | (enumLiteral_4= 'left-outer-join' ) | (enumLiteral_5= 'right-outer-join' ) )
            {
            // InternalQueryDsl.g:1286:2: ( (enumLiteral_0= 'join' ) | (enumLiteral_1= 'left-join' ) | (enumLiteral_2= 'right-join' ) | (enumLiteral_3= 'outer-join' ) | (enumLiteral_4= 'left-outer-join' ) | (enumLiteral_5= 'right-outer-join' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt22=1;
                }
                break;
            case 30:
                {
                alt22=2;
                }
                break;
            case 31:
                {
                alt22=3;
                }
                break;
            case 32:
                {
                alt22=4;
                }
                break;
            case 33:
                {
                alt22=5;
                }
                break;
            case 34:
                {
                alt22=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalQueryDsl.g:1287:3: (enumLiteral_0= 'join' )
                    {
                    // InternalQueryDsl.g:1287:3: (enumLiteral_0= 'join' )
                    // InternalQueryDsl.g:1288:4: enumLiteral_0= 'join'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getInnerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJoinTypeAccess().getInnerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1295:3: (enumLiteral_1= 'left-join' )
                    {
                    // InternalQueryDsl.g:1295:3: (enumLiteral_1= 'left-join' )
                    // InternalQueryDsl.g:1296:4: enumLiteral_1= 'left-join'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getLeftEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJoinTypeAccess().getLeftEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1303:3: (enumLiteral_2= 'right-join' )
                    {
                    // InternalQueryDsl.g:1303:3: (enumLiteral_2= 'right-join' )
                    // InternalQueryDsl.g:1304:4: enumLiteral_2= 'right-join'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getRightEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getJoinTypeAccess().getRightEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1311:3: (enumLiteral_3= 'outer-join' )
                    {
                    // InternalQueryDsl.g:1311:3: (enumLiteral_3= 'outer-join' )
                    // InternalQueryDsl.g:1312:4: enumLiteral_3= 'outer-join'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getOuterEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getJoinTypeAccess().getOuterEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:1319:3: (enumLiteral_4= 'left-outer-join' )
                    {
                    // InternalQueryDsl.g:1319:3: (enumLiteral_4= 'left-outer-join' )
                    // InternalQueryDsl.g:1320:4: enumLiteral_4= 'left-outer-join'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getLeftouterEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getJoinTypeAccess().getLeftouterEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:1327:3: (enumLiteral_5= 'right-outer-join' )
                    {
                    // InternalQueryDsl.g:1327:3: (enumLiteral_5= 'right-outer-join' )
                    // InternalQueryDsl.g:1328:4: enumLiteral_5= 'right-outer-join'
                    {
                    enumLiteral_5=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getJoinTypeAccess().getRightouterEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getJoinTypeAccess().getRightouterEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleJoinType"


    // $ANTLR start "ruleComparisonType"
    // InternalQueryDsl.g:1338:1: ruleComparisonType returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) ) ;
    public final Enumerator ruleComparisonType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:1344:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) ) )
            // InternalQueryDsl.g:1345:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) )
            {
            // InternalQueryDsl.g:1345:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '!=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '>' ) | (enumLiteral_5= '>=' ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 37:
                {
                alt23=3;
                }
                break;
            case 38:
                {
                alt23=4;
                }
                break;
            case 39:
                {
                alt23=5;
                }
                break;
            case 40:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalQueryDsl.g:1346:3: (enumLiteral_0= '=' )
                    {
                    // InternalQueryDsl.g:1346:3: (enumLiteral_0= '=' )
                    // InternalQueryDsl.g:1347:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getComparisonTypeAccess().getEqualEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getComparisonTypeAccess().getEqualEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1354:3: (enumLiteral_1= '!=' )
                    {
                    // InternalQueryDsl.g:1354:3: (enumLiteral_1= '!=' )
                    // InternalQueryDsl.g:1355:4: enumLiteral_1= '!='
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getComparisonTypeAccess().getNotequalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getComparisonTypeAccess().getNotequalEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1362:3: (enumLiteral_2= '<' )
                    {
                    // InternalQueryDsl.g:1362:3: (enumLiteral_2= '<' )
                    // InternalQueryDsl.g:1363:4: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getComparisonTypeAccess().getLessthanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getComparisonTypeAccess().getLessthanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1370:3: (enumLiteral_3= '<=' )
                    {
                    // InternalQueryDsl.g:1370:3: (enumLiteral_3= '<=' )
                    // InternalQueryDsl.g:1371:4: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getComparisonTypeAccess().getLessthanorequalEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getComparisonTypeAccess().getLessthanorequalEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:1378:3: (enumLiteral_4= '>' )
                    {
                    // InternalQueryDsl.g:1378:3: (enumLiteral_4= '>' )
                    // InternalQueryDsl.g:1379:4: enumLiteral_4= '>'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getComparisonTypeAccess().getGreaterthanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getComparisonTypeAccess().getGreaterthanEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:1386:3: (enumLiteral_5= '>=' )
                    {
                    // InternalQueryDsl.g:1386:3: (enumLiteral_5= '>=' )
                    // InternalQueryDsl.g:1387:4: enumLiteral_5= '>='
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getComparisonTypeAccess().getGreaterthanorequalEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getComparisonTypeAccess().getGreaterthanorequalEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleComparisonType"


    // $ANTLR start "ruleConnectionType"
    // InternalQueryDsl.g:1397:1: ruleConnectionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) ;
    public final Enumerator ruleConnectionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:1403:2: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) ) )
            // InternalQueryDsl.g:1404:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            {
            // InternalQueryDsl.g:1404:2: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            else if ( (LA24_0==42) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalQueryDsl.g:1405:3: (enumLiteral_0= 'and' )
                    {
                    // InternalQueryDsl.g:1405:3: (enumLiteral_0= 'and' )
                    // InternalQueryDsl.g:1406:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getConnectionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getConnectionTypeAccess().getAndEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1413:3: (enumLiteral_1= 'or' )
                    {
                    // InternalQueryDsl.g:1413:3: (enumLiteral_1= 'or' )
                    // InternalQueryDsl.g:1414:4: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getConnectionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getConnectionTypeAccess().getOrEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleConnectionType"


    // $ANTLR start "ruleType"
    // InternalQueryDsl.g:1424:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:1430:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalQueryDsl.g:1431:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalQueryDsl.g:1431:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt25=1;
                }
                break;
            case 44:
                {
                alt25=2;
                }
                break;
            case 45:
                {
                alt25=3;
                }
                break;
            case 46:
                {
                alt25=4;
                }
                break;
            case 47:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalQueryDsl.g:1432:3: (enumLiteral_0= 'String' )
                    {
                    // InternalQueryDsl.g:1432:3: (enumLiteral_0= 'String' )
                    // InternalQueryDsl.g:1433:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1440:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalQueryDsl.g:1440:3: (enumLiteral_1= 'Int' )
                    // InternalQueryDsl.g:1441:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1448:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalQueryDsl.g:1448:3: (enumLiteral_2= 'Boolean' )
                    // InternalQueryDsl.g:1449:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1456:3: (enumLiteral_3= 'Float' )
                    {
                    // InternalQueryDsl.g:1456:3: (enumLiteral_3= 'Float' )
                    // InternalQueryDsl.g:1457:4: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:1464:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalQueryDsl.g:1464:3: (enumLiteral_4= 'Double' )
                    // InternalQueryDsl.g:1465:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

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
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\3\4\2\uffff\1\4";
    static final String dfa_4s = "\1\4\1\42\1\4\2\uffff\1\42";
    static final String dfa_5s = "\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\4\11\uffff\1\4\1\uffff\1\2\1\uffff\1\4\5\uffff\1\4\4\uffff\6\3",
            "\1\5",
            "",
            "",
            "\1\4\11\uffff\1\4\1\uffff\1\2\1\uffff\1\4\5\uffff\1\4\4\uffff\6\3"
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
            return "446:4: ( ( ( (lv_from_14_0= ruleSimpleFrom ) ) (otherlv_15= ',' ( (lv_from_16_0= ruleSimpleFrom ) ) )* ) | ( ( (lv_from_17_0= ruleSimpleFrom ) ) ( (lv_from_18_0= ruleCompositeFrom ) )+ ) )";
        }
    }
    static final String dfa_8s = "\27\uffff";
    static final String dfa_9s = "\14\uffff\2\20\6\uffff\2\20\1\uffff";
    static final String dfa_10s = "\2\4\1\20\7\4\1\20\4\4\1\16\2\uffff\1\34\3\4\1\16";
    static final String dfa_11s = "\1\32\1\4\1\50\1\4\6\33\1\50\1\4\2\52\1\4\1\20\2\uffff\1\34\1\4\2\52\1\20";
    static final String dfa_12s = "\20\uffff\1\1\1\2\5\uffff";
    static final String dfa_13s = "\27\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\25\uffff\1\1",
            "\1\2",
            "\1\3\22\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12",
            "\1\15\1\14\6\uffff\1\13\16\uffff\1\16",
            "\1\15\1\14\6\uffff\1\13\16\uffff\1\16",
            "\1\15\1\14\6\uffff\1\13\16\uffff\1\16",
            "\1\15\1\14\6\uffff\1\13\16\uffff\1\16",
            "\1\15\1\14\6\uffff\1\13\16\uffff\1\16",
            "\1\15\1\14\6\uffff\1\13\16\uffff\1\16",
            "\1\3\22\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\17",
            "\1\20\11\uffff\1\20\11\uffff\1\20\4\uffff\6\20\6\uffff\2\21",
            "\1\20\11\uffff\1\20\11\uffff\1\20\4\uffff\6\20\6\uffff\2\21",
            "\1\22",
            "\1\24\1\uffff\1\23",
            "",
            "",
            "\1\25",
            "\1\26",
            "\1\20\11\uffff\1\20\11\uffff\1\20\4\uffff\6\20\6\uffff\2\21",
            "\1\20\11\uffff\1\20\11\uffff\1\20\4\uffff\6\20\6\uffff\2\21",
            "\1\24\1\uffff\1\23"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "761:2: (this_SimpleCondition_0= ruleSimpleCondition | this_CompositeCondition_1= ruleCompositeCondition )";
        }
    }
    static final String dfa_15s = "\16\uffff";
    static final String dfa_16s = "\2\4\1\20\7\4\1\20\3\uffff";
    static final String dfa_17s = "\1\32\1\4\1\50\1\4\6\33\1\50\3\uffff";
    static final String dfa_18s = "\13\uffff\1\1\1\3\1\2";
    static final String dfa_19s = "\16\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\25\uffff\1\1",
            "\1\2",
            "\1\3\22\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\12",
            "\2\13\6\uffff\1\15\16\uffff\1\14",
            "\2\13\6\uffff\1\15\16\uffff\1\14",
            "\2\13\6\uffff\1\15\16\uffff\1\14",
            "\2\13\6\uffff\1\15\16\uffff\1\14",
            "\2\13\6\uffff\1\15\16\uffff\1\14",
            "\2\13\6\uffff\1\15\16\uffff\1\14",
            "\1\3\22\uffff\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "842:2: (this_PrimitiveValuePredicate_0= rulePrimitiveValuePredicate | this_ModelValuePredicate_1= ruleModelValuePredicate | this_ParamValuePredicate_2= ruleParamValuePredicate )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000F80000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001840002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000007E0000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000007E1000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000001F800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000060000000000L});

}