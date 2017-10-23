package uam.eagledata.dsl.semanticnodes.parser.antlr.internal;

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
import uam.eagledata.dsl.semanticnodes.services.SemanticNodesDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemanticNodesDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'repository'", "'{'", "'}'", "'@'", "','", "'enum'", "'->'", "'abstract'", "'node'", "'['", "']'", "':'", "'='", "'-'", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalSemanticNodesDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSemanticNodesDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSemanticNodesDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSemanticNodesDsl.g"; }



     	private SemanticNodesDslGrammarAccess grammarAccess;

        public InternalSemanticNodesDslParser(TokenStream input, SemanticNodesDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RepositoryManager";
       	}

       	@Override
       	protected SemanticNodesDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRepositoryManager"
    // InternalSemanticNodesDsl.g:65:1: entryRuleRepositoryManager returns [EObject current=null] : iv_ruleRepositoryManager= ruleRepositoryManager EOF ;
    public final EObject entryRuleRepositoryManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryManager = null;


        try {
            // InternalSemanticNodesDsl.g:65:58: (iv_ruleRepositoryManager= ruleRepositoryManager EOF )
            // InternalSemanticNodesDsl.g:66:2: iv_ruleRepositoryManager= ruleRepositoryManager EOF
            {
             newCompositeNode(grammarAccess.getRepositoryManagerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepositoryManager=ruleRepositoryManager();

            state._fsp--;

             current =iv_ruleRepositoryManager; 
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
    // $ANTLR end "entryRuleRepositoryManager"


    // $ANTLR start "ruleRepositoryManager"
    // InternalSemanticNodesDsl.g:72:1: ruleRepositoryManager returns [EObject current=null] : ( () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= 'import' ( (lv_importURI_4_0= ruleEString ) ) )* )? ( ( (lv_repositories_5_0= ruleRepository ) ) ( (lv_repositories_6_0= ruleRepository ) )* )? ) ;
    public final EObject ruleRepositoryManager() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_importURI_2_0 = null;

        AntlrDatatypeRuleToken lv_importURI_4_0 = null;

        EObject lv_repositories_5_0 = null;

        EObject lv_repositories_6_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:78:2: ( ( () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= 'import' ( (lv_importURI_4_0= ruleEString ) ) )* )? ( ( (lv_repositories_5_0= ruleRepository ) ) ( (lv_repositories_6_0= ruleRepository ) )* )? ) )
            // InternalSemanticNodesDsl.g:79:2: ( () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= 'import' ( (lv_importURI_4_0= ruleEString ) ) )* )? ( ( (lv_repositories_5_0= ruleRepository ) ) ( (lv_repositories_6_0= ruleRepository ) )* )? )
            {
            // InternalSemanticNodesDsl.g:79:2: ( () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= 'import' ( (lv_importURI_4_0= ruleEString ) ) )* )? ( ( (lv_repositories_5_0= ruleRepository ) ) ( (lv_repositories_6_0= ruleRepository ) )* )? )
            // InternalSemanticNodesDsl.g:80:3: () (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= 'import' ( (lv_importURI_4_0= ruleEString ) ) )* )? ( ( (lv_repositories_5_0= ruleRepository ) ) ( (lv_repositories_6_0= ruleRepository ) )* )?
            {
            // InternalSemanticNodesDsl.g:80:3: ()
            // InternalSemanticNodesDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:87:3: (otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= 'import' ( (lv_importURI_4_0= ruleEString ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSemanticNodesDsl.g:88:4: otherlv_1= 'import' ( (lv_importURI_2_0= ruleEString ) ) (otherlv_3= 'import' ( (lv_importURI_4_0= ruleEString ) ) )*
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getRepositoryManagerAccess().getImportKeyword_1_0());
                    			
                    // InternalSemanticNodesDsl.g:92:4: ( (lv_importURI_2_0= ruleEString ) )
                    // InternalSemanticNodesDsl.g:93:5: (lv_importURI_2_0= ruleEString )
                    {
                    // InternalSemanticNodesDsl.g:93:5: (lv_importURI_2_0= ruleEString )
                    // InternalSemanticNodesDsl.g:94:6: lv_importURI_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRepositoryManagerAccess().getImportURIEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_importURI_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryManagerRule());
                    						}
                    						add(
                    							current,
                    							"importURI",
                    							lv_importURI_2_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:111:4: (otherlv_3= 'import' ( (lv_importURI_4_0= ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:112:5: otherlv_3= 'import' ( (lv_importURI_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,11,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getRepositoryManagerAccess().getImportKeyword_1_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:116:5: ( (lv_importURI_4_0= ruleEString ) )
                    	    // InternalSemanticNodesDsl.g:117:6: (lv_importURI_4_0= ruleEString )
                    	    {
                    	    // InternalSemanticNodesDsl.g:117:6: (lv_importURI_4_0= ruleEString )
                    	    // InternalSemanticNodesDsl.g:118:7: lv_importURI_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getRepositoryManagerAccess().getImportURIEStringParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_importURI_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRepositoryManagerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"importURI",
                    	    								lv_importURI_4_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
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

            // InternalSemanticNodesDsl.g:137:3: ( ( (lv_repositories_5_0= ruleRepository ) ) ( (lv_repositories_6_0= ruleRepository ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSemanticNodesDsl.g:138:4: ( (lv_repositories_5_0= ruleRepository ) ) ( (lv_repositories_6_0= ruleRepository ) )*
                    {
                    // InternalSemanticNodesDsl.g:138:4: ( (lv_repositories_5_0= ruleRepository ) )
                    // InternalSemanticNodesDsl.g:139:5: (lv_repositories_5_0= ruleRepository )
                    {
                    // InternalSemanticNodesDsl.g:139:5: (lv_repositories_5_0= ruleRepository )
                    // InternalSemanticNodesDsl.g:140:6: lv_repositories_5_0= ruleRepository
                    {

                    						newCompositeNode(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_repositories_5_0=ruleRepository();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryManagerRule());
                    						}
                    						add(
                    							current,
                    							"repositories",
                    							lv_repositories_5_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Repository");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:157:4: ( (lv_repositories_6_0= ruleRepository ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==12) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:158:5: (lv_repositories_6_0= ruleRepository )
                    	    {
                    	    // InternalSemanticNodesDsl.g:158:5: (lv_repositories_6_0= ruleRepository )
                    	    // InternalSemanticNodesDsl.g:159:6: lv_repositories_6_0= ruleRepository
                    	    {

                    	    						newCompositeNode(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_5);
                    	    lv_repositories_6_0=ruleRepository();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRepositoryManagerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"repositories",
                    	    							lv_repositories_6_0,
                    	    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Repository");
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
    // $ANTLR end "ruleRepositoryManager"


    // $ANTLR start "entryRuleRepository"
    // InternalSemanticNodesDsl.g:181:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalSemanticNodesDsl.g:181:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalSemanticNodesDsl.g:182:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalSemanticNodesDsl.g:188:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_resources_4_0 = null;

        EObject lv_resources_5_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:194:2: ( ( () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' ) )
            // InternalSemanticNodesDsl.g:195:2: ( () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' )
            {
            // InternalSemanticNodesDsl.g:195:2: ( () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' )
            // InternalSemanticNodesDsl.g:196:3: () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}'
            {
            // InternalSemanticNodesDsl.g:196:3: ()
            // InternalSemanticNodesDsl.g:197:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            // InternalSemanticNodesDsl.g:207:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:208:4: (lv_name_2_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:208:4: (lv_name_2_0= ruleEString )
            // InternalSemanticNodesDsl.g:209:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSemanticNodesDsl.g:230:3: ( (lv_resources_4_0= ruleResource ) )
            // InternalSemanticNodesDsl.g:231:4: (lv_resources_4_0= ruleResource )
            {
            // InternalSemanticNodesDsl.g:231:4: (lv_resources_4_0= ruleResource )
            // InternalSemanticNodesDsl.g:232:5: lv_resources_4_0= ruleResource
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getResourcesResourceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_resources_4_0=ruleResource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            					}
            					add(
            						current,
            						"resources",
            						lv_resources_4_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Resource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSemanticNodesDsl.g:249:3: ( (lv_resources_5_0= ruleResource ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:250:4: (lv_resources_5_0= ruleResource )
            	    {
            	    // InternalSemanticNodesDsl.g:250:4: (lv_resources_5_0= ruleResource )
            	    // InternalSemanticNodesDsl.g:251:5: lv_resources_5_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getResourcesResourceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_resources_5_0=ruleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_5_0,
            	    						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Resource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleResource"
    // InternalSemanticNodesDsl.g:276:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalSemanticNodesDsl.g:276:49: (iv_ruleResource= ruleResource EOF )
            // InternalSemanticNodesDsl.g:277:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSemanticNodesDsl.g:283:1: ruleResource returns [EObject current=null] : ( () (otherlv_1= '@' ( ( ruleEString ) ) (otherlv_3= '@' ( ( ruleEString ) ) )* )? ( ( ruleEString ) )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( ( (lv_resourceElements_8_0= ruleResourceElement ) ) ( (lv_resourceElements_9_0= ruleResourceElement ) )* )? otherlv_10= '}' (otherlv_11= '{' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) (otherlv_13= ',' ( (lv_metaDataValue_14_0= ruleMetaDataValue ) ) )* otherlv_15= '}' )? ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_resourceElements_8_0 = null;

        EObject lv_resourceElements_9_0 = null;

        EObject lv_metaDataValue_12_0 = null;

        EObject lv_metaDataValue_14_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:289:2: ( ( () (otherlv_1= '@' ( ( ruleEString ) ) (otherlv_3= '@' ( ( ruleEString ) ) )* )? ( ( ruleEString ) )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( ( (lv_resourceElements_8_0= ruleResourceElement ) ) ( (lv_resourceElements_9_0= ruleResourceElement ) )* )? otherlv_10= '}' (otherlv_11= '{' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) (otherlv_13= ',' ( (lv_metaDataValue_14_0= ruleMetaDataValue ) ) )* otherlv_15= '}' )? ) )
            // InternalSemanticNodesDsl.g:290:2: ( () (otherlv_1= '@' ( ( ruleEString ) ) (otherlv_3= '@' ( ( ruleEString ) ) )* )? ( ( ruleEString ) )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( ( (lv_resourceElements_8_0= ruleResourceElement ) ) ( (lv_resourceElements_9_0= ruleResourceElement ) )* )? otherlv_10= '}' (otherlv_11= '{' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) (otherlv_13= ',' ( (lv_metaDataValue_14_0= ruleMetaDataValue ) ) )* otherlv_15= '}' )? )
            {
            // InternalSemanticNodesDsl.g:290:2: ( () (otherlv_1= '@' ( ( ruleEString ) ) (otherlv_3= '@' ( ( ruleEString ) ) )* )? ( ( ruleEString ) )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( ( (lv_resourceElements_8_0= ruleResourceElement ) ) ( (lv_resourceElements_9_0= ruleResourceElement ) )* )? otherlv_10= '}' (otherlv_11= '{' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) (otherlv_13= ',' ( (lv_metaDataValue_14_0= ruleMetaDataValue ) ) )* otherlv_15= '}' )? )
            // InternalSemanticNodesDsl.g:291:3: () (otherlv_1= '@' ( ( ruleEString ) ) (otherlv_3= '@' ( ( ruleEString ) ) )* )? ( ( ruleEString ) )? ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' ( ( (lv_resourceElements_8_0= ruleResourceElement ) ) ( (lv_resourceElements_9_0= ruleResourceElement ) )* )? otherlv_10= '}' (otherlv_11= '{' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) (otherlv_13= ',' ( (lv_metaDataValue_14_0= ruleMetaDataValue ) ) )* otherlv_15= '}' )?
            {
            // InternalSemanticNodesDsl.g:291:3: ()
            // InternalSemanticNodesDsl.g:292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourceAccess().getResourceAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:298:3: (otherlv_1= '@' ( ( ruleEString ) ) (otherlv_3= '@' ( ( ruleEString ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSemanticNodesDsl.g:299:4: otherlv_1= '@' ( ( ruleEString ) ) (otherlv_3= '@' ( ( ruleEString ) ) )*
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getCommercialAtKeyword_1_0());
                    			
                    // InternalSemanticNodesDsl.g:303:4: ( ( ruleEString ) )
                    // InternalSemanticNodesDsl.g:304:5: ( ruleEString )
                    {
                    // InternalSemanticNodesDsl.g:304:5: ( ruleEString )
                    // InternalSemanticNodesDsl.g:305:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResourceAccess().getAnnotationsAnnotationCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:319:4: (otherlv_3= '@' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:320:5: otherlv_3= '@' ( ( ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getCommercialAtKeyword_1_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:324:5: ( ( ruleEString ) )
                    	    // InternalSemanticNodesDsl.g:325:6: ( ruleEString )
                    	    {
                    	    // InternalSemanticNodesDsl.g:325:6: ( ruleEString )
                    	    // InternalSemanticNodesDsl.g:326:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getResourceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getAnnotationsAnnotationCrossReference_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;


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
                    break;

            }

            // InternalSemanticNodesDsl.g:342:3: ( ( ruleEString ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=RULE_STRING && LA8_1<=RULE_ID)) ) {
                    alt8=1;
                }
            }
            else if ( (LA8_0==RULE_ID) ) {
                int LA8_2 = input.LA(2);

                if ( ((LA8_2>=RULE_STRING && LA8_2<=RULE_ID)) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalSemanticNodesDsl.g:343:4: ( ruleEString )
                    {
                    // InternalSemanticNodesDsl.g:343:4: ( ruleEString )
                    // InternalSemanticNodesDsl.g:344:5: ruleEString
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourceRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getResourceAccess().getAssistantFormatAssistantCrossReference_2_0());
                    				
                    pushFollow(FOLLOW_3);
                    ruleEString();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:358:3: ( (lv_name_6_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:359:4: (lv_name_6_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:359:4: (lv_name_6_0= ruleEString )
            // InternalSemanticNodesDsl.g:360:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSemanticNodesDsl.g:381:3: ( ( (lv_resourceElements_8_0= ruleResourceElement ) ) ( (lv_resourceElements_9_0= ruleResourceElement ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)||LA10_0==15||LA10_0==17||(LA10_0>=19 && LA10_0<=20)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSemanticNodesDsl.g:382:4: ( (lv_resourceElements_8_0= ruleResourceElement ) ) ( (lv_resourceElements_9_0= ruleResourceElement ) )*
                    {
                    // InternalSemanticNodesDsl.g:382:4: ( (lv_resourceElements_8_0= ruleResourceElement ) )
                    // InternalSemanticNodesDsl.g:383:5: (lv_resourceElements_8_0= ruleResourceElement )
                    {
                    // InternalSemanticNodesDsl.g:383:5: (lv_resourceElements_8_0= ruleResourceElement )
                    // InternalSemanticNodesDsl.g:384:6: lv_resourceElements_8_0= ruleResourceElement
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getResourceElementsResourceElementParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_resourceElements_8_0=ruleResourceElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						add(
                    							current,
                    							"resourceElements",
                    							lv_resourceElements_8_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.ResourceElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:401:4: ( (lv_resourceElements_9_0= ruleResourceElement ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==15||LA9_0==17||(LA9_0>=19 && LA9_0<=20)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:402:5: (lv_resourceElements_9_0= ruleResourceElement )
                    	    {
                    	    // InternalSemanticNodesDsl.g:402:5: (lv_resourceElements_9_0= ruleResourceElement )
                    	    // InternalSemanticNodesDsl.g:403:6: lv_resourceElements_9_0= ruleResourceElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getResourceAccess().getResourceElementsResourceElementParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_resourceElements_9_0=ruleResourceElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"resourceElements",
                    	    							lv_resourceElements_9_0,
                    	    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.ResourceElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            otherlv_10=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalSemanticNodesDsl.g:425:3: (otherlv_11= '{' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) (otherlv_13= ',' ( (lv_metaDataValue_14_0= ruleMetaDataValue ) ) )* otherlv_15= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSemanticNodesDsl.g:426:4: otherlv_11= '{' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) (otherlv_13= ',' ( (lv_metaDataValue_14_0= ruleMetaDataValue ) ) )* otherlv_15= '}'
                    {
                    otherlv_11=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalSemanticNodesDsl.g:430:4: ( (lv_metaDataValue_12_0= ruleMetaDataValue ) )
                    // InternalSemanticNodesDsl.g:431:5: (lv_metaDataValue_12_0= ruleMetaDataValue )
                    {
                    // InternalSemanticNodesDsl.g:431:5: (lv_metaDataValue_12_0= ruleMetaDataValue )
                    // InternalSemanticNodesDsl.g:432:6: lv_metaDataValue_12_0= ruleMetaDataValue
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getMetaDataValueMetaDataValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_metaDataValue_12_0=ruleMetaDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						add(
                    							current,
                    							"metaDataValue",
                    							lv_metaDataValue_12_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:449:4: (otherlv_13= ',' ( (lv_metaDataValue_14_0= ruleMetaDataValue ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:450:5: otherlv_13= ',' ( (lv_metaDataValue_14_0= ruleMetaDataValue ) )
                    	    {
                    	    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:454:5: ( (lv_metaDataValue_14_0= ruleMetaDataValue ) )
                    	    // InternalSemanticNodesDsl.g:455:6: (lv_metaDataValue_14_0= ruleMetaDataValue )
                    	    {
                    	    // InternalSemanticNodesDsl.g:455:6: (lv_metaDataValue_14_0= ruleMetaDataValue )
                    	    // InternalSemanticNodesDsl.g:456:7: lv_metaDataValue_14_0= ruleMetaDataValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getMetaDataValueMetaDataValueParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_metaDataValue_14_0=ruleMetaDataValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metaDataValue",
                    	    								lv_metaDataValue_14_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleResourceElement"
    // InternalSemanticNodesDsl.g:483:1: entryRuleResourceElement returns [EObject current=null] : iv_ruleResourceElement= ruleResourceElement EOF ;
    public final EObject entryRuleResourceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceElement = null;


        try {
            // InternalSemanticNodesDsl.g:483:56: (iv_ruleResourceElement= ruleResourceElement EOF )
            // InternalSemanticNodesDsl.g:484:2: iv_ruleResourceElement= ruleResourceElement EOF
            {
             newCompositeNode(grammarAccess.getResourceElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResourceElement=ruleResourceElement();

            state._fsp--;

             current =iv_ruleResourceElement; 
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
    // $ANTLR end "entryRuleResourceElement"


    // $ANTLR start "ruleResourceElement"
    // InternalSemanticNodesDsl.g:490:1: ruleResourceElement returns [EObject current=null] : (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleResourceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Resource_0 = null;

        EObject this_SemanticNode_1 = null;

        EObject this_Enumeration_2 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:496:2: ( (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode | this_Enumeration_2= ruleEnumeration ) )
            // InternalSemanticNodesDsl.g:497:2: (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode | this_Enumeration_2= ruleEnumeration )
            {
            // InternalSemanticNodesDsl.g:497:2: (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode | this_Enumeration_2= ruleEnumeration )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 15:
                {
                alt13=1;
                }
                break;
            case 19:
            case 20:
                {
                alt13=2;
                }
                break;
            case 17:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalSemanticNodesDsl.g:498:3: this_Resource_0= ruleResource
                    {

                    			newCompositeNode(grammarAccess.getResourceElementAccess().getResourceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Resource_0=ruleResource();

                    state._fsp--;


                    			current = this_Resource_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:507:3: this_SemanticNode_1= ruleSemanticNode
                    {

                    			newCompositeNode(grammarAccess.getResourceElementAccess().getSemanticNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SemanticNode_1=ruleSemanticNode();

                    state._fsp--;


                    			current = this_SemanticNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:516:3: this_Enumeration_2= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getResourceElementAccess().getEnumerationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_2=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_2;
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
    // $ANTLR end "ruleResourceElement"


    // $ANTLR start "entryRuleEnumeration"
    // InternalSemanticNodesDsl.g:528:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSemanticNodesDsl.g:528:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSemanticNodesDsl.g:529:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
             newCompositeNode(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;

             current =iv_ruleEnumeration; 
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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalSemanticNodesDsl.g:535:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_literals_4_0 = null;

        EObject lv_literals_5_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:541:2: ( ( () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}' ) )
            // InternalSemanticNodesDsl.g:542:2: ( () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}' )
            {
            // InternalSemanticNodesDsl.g:542:2: ( () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}' )
            // InternalSemanticNodesDsl.g:543:3: () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}'
            {
            // InternalSemanticNodesDsl.g:543:3: ()
            // InternalSemanticNodesDsl.g:544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumKeyword_1());
            		
            // InternalSemanticNodesDsl.g:554:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:555:4: (lv_name_2_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:555:4: (lv_name_2_0= ruleEString )
            // InternalSemanticNodesDsl.g:556:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSemanticNodesDsl.g:577:3: ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_INT||LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSemanticNodesDsl.g:578:4: ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )*
                    {
                    // InternalSemanticNodesDsl.g:578:4: ( (lv_literals_4_0= ruleEnumerationLiteral ) )
                    // InternalSemanticNodesDsl.g:579:5: (lv_literals_4_0= ruleEnumerationLiteral )
                    {
                    // InternalSemanticNodesDsl.g:579:5: (lv_literals_4_0= ruleEnumerationLiteral )
                    // InternalSemanticNodesDsl.g:580:6: lv_literals_4_0= ruleEnumerationLiteral
                    {

                    						newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_literals_4_0=ruleEnumerationLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    						}
                    						add(
                    							current,
                    							"literals",
                    							lv_literals_4_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EnumerationLiteral");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:597:4: ( (lv_literals_5_0= ruleEnumerationLiteral ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==RULE_INT||LA14_0==25) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:598:5: (lv_literals_5_0= ruleEnumerationLiteral )
                    	    {
                    	    // InternalSemanticNodesDsl.g:598:5: (lv_literals_5_0= ruleEnumerationLiteral )
                    	    // InternalSemanticNodesDsl.g:599:6: lv_literals_5_0= ruleEnumerationLiteral
                    	    {

                    	    						newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_literals_5_0=ruleEnumerationLiteral();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEnumerationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"literals",
                    	    							lv_literals_5_0,
                    	    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EnumerationLiteral");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalSemanticNodesDsl.g:625:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalSemanticNodesDsl.g:625:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalSemanticNodesDsl.g:626:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
            {
             newCompositeNode(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationLiteral=ruleEnumerationLiteral();

            state._fsp--;

             current =iv_ruleEnumerationLiteral; 
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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalSemanticNodesDsl.g:632:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_3_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:638:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) ) ) )
            // InternalSemanticNodesDsl.g:639:2: ( () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) ) )
            {
            // InternalSemanticNodesDsl.g:639:2: ( () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) ) )
            // InternalSemanticNodesDsl.g:640:3: () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:640:3: ()
            // InternalSemanticNodesDsl.g:641:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:647:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalSemanticNodesDsl.g:648:4: (lv_value_1_0= ruleEInt )
            {
            // InternalSemanticNodesDsl.g:648:4: (lv_value_1_0= ruleEInt )
            // InternalSemanticNodesDsl.g:649:5: lv_value_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getValueEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalSemanticNodesDsl.g:670:3: ( (lv_literal_3_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:671:4: (lv_literal_3_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:671:4: (lv_literal_3_0= ruleEString )
            // InternalSemanticNodesDsl.g:672:5: lv_literal_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getLiteralEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_literal_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
            					}
            					set(
            						current,
            						"literal",
            						lv_literal_3_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
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
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleSemanticNode"
    // InternalSemanticNodesDsl.g:693:1: entryRuleSemanticNode returns [EObject current=null] : iv_ruleSemanticNode= ruleSemanticNode EOF ;
    public final EObject entryRuleSemanticNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticNode = null;


        try {
            // InternalSemanticNodesDsl.g:693:53: (iv_ruleSemanticNode= ruleSemanticNode EOF )
            // InternalSemanticNodesDsl.g:694:2: iv_ruleSemanticNode= ruleSemanticNode EOF
            {
             newCompositeNode(grammarAccess.getSemanticNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSemanticNode=ruleSemanticNode();

            state._fsp--;

             current =iv_ruleSemanticNode; 
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
    // $ANTLR end "entryRuleSemanticNode"


    // $ANTLR start "ruleSemanticNode"
    // InternalSemanticNodesDsl.g:700:1: ruleSemanticNode returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleProperty ) ) ( (lv_properties_6_0= ruleProperty ) )* )? otherlv_7= '}' (otherlv_8= '{' ( (lv_metaDataValue_9_0= ruleMetaDataValue ) ) (otherlv_10= ',' ( (lv_metaDataValue_11_0= ruleMetaDataValue ) ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleSemanticNode() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_properties_5_0 = null;

        EObject lv_properties_6_0 = null;

        EObject lv_metaDataValue_9_0 = null;

        EObject lv_metaDataValue_11_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:706:2: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleProperty ) ) ( (lv_properties_6_0= ruleProperty ) )* )? otherlv_7= '}' (otherlv_8= '{' ( (lv_metaDataValue_9_0= ruleMetaDataValue ) ) (otherlv_10= ',' ( (lv_metaDataValue_11_0= ruleMetaDataValue ) ) )* otherlv_12= '}' )? ) )
            // InternalSemanticNodesDsl.g:707:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleProperty ) ) ( (lv_properties_6_0= ruleProperty ) )* )? otherlv_7= '}' (otherlv_8= '{' ( (lv_metaDataValue_9_0= ruleMetaDataValue ) ) (otherlv_10= ',' ( (lv_metaDataValue_11_0= ruleMetaDataValue ) ) )* otherlv_12= '}' )? )
            {
            // InternalSemanticNodesDsl.g:707:2: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleProperty ) ) ( (lv_properties_6_0= ruleProperty ) )* )? otherlv_7= '}' (otherlv_8= '{' ( (lv_metaDataValue_9_0= ruleMetaDataValue ) ) (otherlv_10= ',' ( (lv_metaDataValue_11_0= ruleMetaDataValue ) ) )* otherlv_12= '}' )? )
            // InternalSemanticNodesDsl.g:708:3: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'node' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' ( ( (lv_properties_5_0= ruleProperty ) ) ( (lv_properties_6_0= ruleProperty ) )* )? otherlv_7= '}' (otherlv_8= '{' ( (lv_metaDataValue_9_0= ruleMetaDataValue ) ) (otherlv_10= ',' ( (lv_metaDataValue_11_0= ruleMetaDataValue ) ) )* otherlv_12= '}' )?
            {
            // InternalSemanticNodesDsl.g:708:3: ()
            // InternalSemanticNodesDsl.g:709:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSemanticNodeAccess().getSemanticNodeAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:715:3: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSemanticNodesDsl.g:716:4: (lv_abstract_1_0= 'abstract' )
                    {
                    // InternalSemanticNodesDsl.g:716:4: (lv_abstract_1_0= 'abstract' )
                    // InternalSemanticNodesDsl.g:717:5: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,19,FOLLOW_14); 

                    					newLeafNode(lv_abstract_1_0, grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSemanticNodeRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSemanticNodeAccess().getNodeKeyword_2());
            		
            // InternalSemanticNodesDsl.g:733:3: ( (lv_name_3_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:734:4: (lv_name_3_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:734:4: (lv_name_3_0= ruleEString )
            // InternalSemanticNodesDsl.g:735:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSemanticNodeAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSemanticNodesDsl.g:756:3: ( ( (lv_properties_5_0= ruleProperty ) ) ( (lv_properties_6_0= ruleProperty ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSemanticNodesDsl.g:757:4: ( (lv_properties_5_0= ruleProperty ) ) ( (lv_properties_6_0= ruleProperty ) )*
                    {
                    // InternalSemanticNodesDsl.g:757:4: ( (lv_properties_5_0= ruleProperty ) )
                    // InternalSemanticNodesDsl.g:758:5: (lv_properties_5_0= ruleProperty )
                    {
                    // InternalSemanticNodesDsl.g:758:5: (lv_properties_5_0= ruleProperty )
                    // InternalSemanticNodesDsl.g:759:6: lv_properties_5_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_properties_5_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_5_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:776:4: ( (lv_properties_6_0= ruleProperty ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:777:5: (lv_properties_6_0= ruleProperty )
                    	    {
                    	    // InternalSemanticNodesDsl.g:777:5: (lv_properties_6_0= ruleProperty )
                    	    // InternalSemanticNodesDsl.g:778:6: lv_properties_6_0= ruleProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_properties_6_0=ruleProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_6_0,
                    	    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Property");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_7, grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalSemanticNodesDsl.g:800:3: (otherlv_8= '{' ( (lv_metaDataValue_9_0= ruleMetaDataValue ) ) (otherlv_10= ',' ( (lv_metaDataValue_11_0= ruleMetaDataValue ) ) )* otherlv_12= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==13) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSemanticNodesDsl.g:801:4: otherlv_8= '{' ( (lv_metaDataValue_9_0= ruleMetaDataValue ) ) (otherlv_10= ',' ( (lv_metaDataValue_11_0= ruleMetaDataValue ) ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalSemanticNodesDsl.g:805:4: ( (lv_metaDataValue_9_0= ruleMetaDataValue ) )
                    // InternalSemanticNodesDsl.g:806:5: (lv_metaDataValue_9_0= ruleMetaDataValue )
                    {
                    // InternalSemanticNodesDsl.g:806:5: (lv_metaDataValue_9_0= ruleMetaDataValue )
                    // InternalSemanticNodesDsl.g:807:6: lv_metaDataValue_9_0= ruleMetaDataValue
                    {

                    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getMetaDataValueMetaDataValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_metaDataValue_9_0=ruleMetaDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    						}
                    						add(
                    							current,
                    							"metaDataValue",
                    							lv_metaDataValue_9_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:824:4: (otherlv_10= ',' ( (lv_metaDataValue_11_0= ruleMetaDataValue ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==16) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:825:5: otherlv_10= ',' ( (lv_metaDataValue_11_0= ruleMetaDataValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getSemanticNodeAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:829:5: ( (lv_metaDataValue_11_0= ruleMetaDataValue ) )
                    	    // InternalSemanticNodesDsl.g:830:6: (lv_metaDataValue_11_0= ruleMetaDataValue )
                    	    {
                    	    // InternalSemanticNodesDsl.g:830:6: (lv_metaDataValue_11_0= ruleMetaDataValue )
                    	    // InternalSemanticNodesDsl.g:831:7: lv_metaDataValue_11_0= ruleMetaDataValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getSemanticNodeAccess().getMetaDataValueMetaDataValueParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_metaDataValue_11_0=ruleMetaDataValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metaDataValue",
                    	    								lv_metaDataValue_11_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleSemanticNode"


    // $ANTLR start "entryRuleProperty"
    // InternalSemanticNodesDsl.g:858:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSemanticNodesDsl.g:858:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSemanticNodesDsl.g:859:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSemanticNodesDsl.g:865:1: ruleProperty returns [EObject current=null] : (this_ObjectProperty_0= ruleObjectProperty | this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty | this_EnumerationDataProperty_2= ruleEnumerationDataProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectProperty_0 = null;

        EObject this_PrimitiveTypeDataProperty_1 = null;

        EObject this_EnumerationDataProperty_2 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:871:2: ( (this_ObjectProperty_0= ruleObjectProperty | this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty | this_EnumerationDataProperty_2= ruleEnumerationDataProperty ) )
            // InternalSemanticNodesDsl.g:872:2: (this_ObjectProperty_0= ruleObjectProperty | this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty | this_EnumerationDataProperty_2= ruleEnumerationDataProperty )
            {
            // InternalSemanticNodesDsl.g:872:2: (this_ObjectProperty_0= ruleObjectProperty | this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty | this_EnumerationDataProperty_2= ruleEnumerationDataProperty )
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==18) ) {
                    alt21=1;
                }
                else if ( (LA21_1==23) ) {
                    int LA21_4 = input.LA(3);

                    if ( ((LA21_4>=26 && LA21_4<=30)) ) {
                        alt21=2;
                    }
                    else if ( ((LA21_4>=RULE_STRING && LA21_4<=RULE_ID)) ) {
                        alt21=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0==RULE_ID) ) {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==18) ) {
                    alt21=1;
                }
                else if ( (LA21_2==23) ) {
                    int LA21_4 = input.LA(3);

                    if ( ((LA21_4>=26 && LA21_4<=30)) ) {
                        alt21=2;
                    }
                    else if ( ((LA21_4>=RULE_STRING && LA21_4<=RULE_ID)) ) {
                        alt21=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalSemanticNodesDsl.g:873:3: this_ObjectProperty_0= ruleObjectProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getObjectPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ObjectProperty_0=ruleObjectProperty();

                    state._fsp--;


                    			current = this_ObjectProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:882:3: this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getPrimitiveTypeDataPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveTypeDataProperty_1=rulePrimitiveTypeDataProperty();

                    state._fsp--;


                    			current = this_PrimitiveTypeDataProperty_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:891:3: this_EnumerationDataProperty_2= ruleEnumerationDataProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getEnumerationDataPropertyParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EnumerationDataProperty_2=ruleEnumerationDataProperty();

                    state._fsp--;


                    			current = this_EnumerationDataProperty_2;
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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleObjectProperty"
    // InternalSemanticNodesDsl.g:903:1: entryRuleObjectProperty returns [EObject current=null] : iv_ruleObjectProperty= ruleObjectProperty EOF ;
    public final EObject entryRuleObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectProperty = null;


        try {
            // InternalSemanticNodesDsl.g:903:55: (iv_ruleObjectProperty= ruleObjectProperty EOF )
            // InternalSemanticNodesDsl.g:904:2: iv_ruleObjectProperty= ruleObjectProperty EOF
            {
             newCompositeNode(grammarAccess.getObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObjectProperty=ruleObjectProperty();

            state._fsp--;

             current =iv_ruleObjectProperty; 
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
    // $ANTLR end "entryRuleObjectProperty"


    // $ANTLR start "ruleObjectProperty"
    // InternalSemanticNodesDsl.g:910:1: ruleObjectProperty returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleObjectProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        EObject lv_metaDataValue_10_0 = null;

        EObject lv_metaDataValue_12_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:916:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? ) )
            // InternalSemanticNodesDsl.g:917:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? )
            {
            // InternalSemanticNodesDsl.g:917:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? )
            // InternalSemanticNodesDsl.g:918:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )?
            {
            // InternalSemanticNodesDsl.g:918:3: ()
            // InternalSemanticNodesDsl.g:919:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectPropertyAccess().getObjectPropertyAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:925:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:926:4: (lv_name_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:926:4: (lv_name_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:927:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getObjectPropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectPropertyAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalSemanticNodesDsl.g:948:3: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:949:4: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:949:4: ( ruleEString )
            // InternalSemanticNodesDsl.g:950:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getObjectPropertyAccess().getRangeSemanticNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSemanticNodesDsl.g:964:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSemanticNodesDsl.g:965:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectPropertyAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalSemanticNodesDsl.g:969:4: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:970:5: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:970:5: (lv_lowerBound_5_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:971:6: lv_lowerBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getObjectPropertyAccess().getLowerBoundEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_lowerBound_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjectPropertyAccess().getCommaKeyword_4_2());
                    			
                    // InternalSemanticNodesDsl.g:992:4: ( (lv_upperBound_7_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:993:5: (lv_upperBound_7_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:993:5: (lv_upperBound_7_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:994:6: lv_upperBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getObjectPropertyAccess().getUpperBoundEIntParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_upperBound_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectPropertyAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:1016:3: (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==13) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1017:4: otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjectPropertyAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalSemanticNodesDsl.g:1021:4: ( (lv_metaDataValue_10_0= ruleMetaDataValue ) )
                    // InternalSemanticNodesDsl.g:1022:5: (lv_metaDataValue_10_0= ruleMetaDataValue )
                    {
                    // InternalSemanticNodesDsl.g:1022:5: (lv_metaDataValue_10_0= ruleMetaDataValue )
                    // InternalSemanticNodesDsl.g:1023:6: lv_metaDataValue_10_0= ruleMetaDataValue
                    {

                    						newCompositeNode(grammarAccess.getObjectPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_metaDataValue_10_0=ruleMetaDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
                    						}
                    						add(
                    							current,
                    							"metaDataValue",
                    							lv_metaDataValue_10_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:1040:4: (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==16) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:1041:5: otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getObjectPropertyAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:1045:5: ( (lv_metaDataValue_12_0= ruleMetaDataValue ) )
                    	    // InternalSemanticNodesDsl.g:1046:6: (lv_metaDataValue_12_0= ruleMetaDataValue )
                    	    {
                    	    // InternalSemanticNodesDsl.g:1046:6: (lv_metaDataValue_12_0= ruleMetaDataValue )
                    	    // InternalSemanticNodesDsl.g:1047:7: lv_metaDataValue_12_0= ruleMetaDataValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_metaDataValue_12_0=ruleMetaDataValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metaDataValue",
                    	    								lv_metaDataValue_12_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getObjectPropertyAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // $ANTLR end "ruleObjectProperty"


    // $ANTLR start "entryRulePrimitiveTypeDataProperty"
    // InternalSemanticNodesDsl.g:1074:1: entryRulePrimitiveTypeDataProperty returns [EObject current=null] : iv_rulePrimitiveTypeDataProperty= rulePrimitiveTypeDataProperty EOF ;
    public final EObject entryRulePrimitiveTypeDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeDataProperty = null;


        try {
            // InternalSemanticNodesDsl.g:1074:66: (iv_rulePrimitiveTypeDataProperty= rulePrimitiveTypeDataProperty EOF )
            // InternalSemanticNodesDsl.g:1075:2: iv_rulePrimitiveTypeDataProperty= rulePrimitiveTypeDataProperty EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveTypeDataProperty=rulePrimitiveTypeDataProperty();

            state._fsp--;

             current =iv_rulePrimitiveTypeDataProperty; 
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
    // $ANTLR end "entryRulePrimitiveTypeDataProperty"


    // $ANTLR start "rulePrimitiveTypeDataProperty"
    // InternalSemanticNodesDsl.g:1081:1: rulePrimitiveTypeDataProperty returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? ) ;
    public final EObject rulePrimitiveTypeDataProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        EObject lv_metaDataValue_10_0 = null;

        EObject lv_metaDataValue_12_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1087:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? ) )
            // InternalSemanticNodesDsl.g:1088:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? )
            {
            // InternalSemanticNodesDsl.g:1088:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? )
            // InternalSemanticNodesDsl.g:1089:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )?
            {
            // InternalSemanticNodesDsl.g:1089:3: ()
            // InternalSemanticNodesDsl.g:1090:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTypeDataPropertyAccess().getPrimitiveTypeDataPropertyAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:1096:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1097:4: (lv_name_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1097:4: (lv_name_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:1098:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveTypeDataPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSemanticNodesDsl.g:1115:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalSemanticNodesDsl.g:1116:4: otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_2=(Token)match(input,23,FOLLOW_21); 

            				newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeDataPropertyAccess().getColonKeyword_2_0());
            			
            // InternalSemanticNodesDsl.g:1120:4: ( (lv_type_3_0= ruleType ) )
            // InternalSemanticNodesDsl.g:1121:5: (lv_type_3_0= ruleType )
            {
            // InternalSemanticNodesDsl.g:1121:5: (lv_type_3_0= ruleType )
            // InternalSemanticNodesDsl.g:1122:6: lv_type_3_0= ruleType
            {

            						newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getTypeTypeEnumRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_16);
            lv_type_3_0=ruleType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getPrimitiveTypeDataPropertyRule());
            						}
            						set(
            							current,
            							"type",
            							lv_type_3_0,
            							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Type");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalSemanticNodesDsl.g:1140:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1141:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalSemanticNodesDsl.g:1145:4: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:1146:5: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:1146:5: (lv_lowerBound_5_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:1147:6: lv_lowerBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_lowerBound_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveTypeDataPropertyRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_3_2());
                    			
                    // InternalSemanticNodesDsl.g:1168:4: ( (lv_upperBound_7_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:1169:5: (lv_upperBound_7_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:1169:5: (lv_upperBound_7_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:1170:6: lv_upperBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_upperBound_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveTypeDataPropertyRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrimitiveTypeDataPropertyAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:1192:3: (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==13) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1193:4: otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSemanticNodesDsl.g:1197:4: ( (lv_metaDataValue_10_0= ruleMetaDataValue ) )
                    // InternalSemanticNodesDsl.g:1198:5: (lv_metaDataValue_10_0= ruleMetaDataValue )
                    {
                    // InternalSemanticNodesDsl.g:1198:5: (lv_metaDataValue_10_0= ruleMetaDataValue )
                    // InternalSemanticNodesDsl.g:1199:6: lv_metaDataValue_10_0= ruleMetaDataValue
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_metaDataValue_10_0=ruleMetaDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveTypeDataPropertyRule());
                    						}
                    						add(
                    							current,
                    							"metaDataValue",
                    							lv_metaDataValue_10_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:1216:4: (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:1217:5: otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:1221:5: ( (lv_metaDataValue_12_0= ruleMetaDataValue ) )
                    	    // InternalSemanticNodesDsl.g:1222:6: (lv_metaDataValue_12_0= ruleMetaDataValue )
                    	    {
                    	    // InternalSemanticNodesDsl.g:1222:6: (lv_metaDataValue_12_0= ruleMetaDataValue )
                    	    // InternalSemanticNodesDsl.g:1223:7: lv_metaDataValue_12_0= ruleMetaDataValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_metaDataValue_12_0=ruleMetaDataValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrimitiveTypeDataPropertyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metaDataValue",
                    	    								lv_metaDataValue_12_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getPrimitiveTypeDataPropertyAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "rulePrimitiveTypeDataProperty"


    // $ANTLR start "entryRuleEnumerationDataProperty"
    // InternalSemanticNodesDsl.g:1250:1: entryRuleEnumerationDataProperty returns [EObject current=null] : iv_ruleEnumerationDataProperty= ruleEnumerationDataProperty EOF ;
    public final EObject entryRuleEnumerationDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDataProperty = null;


        try {
            // InternalSemanticNodesDsl.g:1250:64: (iv_ruleEnumerationDataProperty= ruleEnumerationDataProperty EOF )
            // InternalSemanticNodesDsl.g:1251:2: iv_ruleEnumerationDataProperty= ruleEnumerationDataProperty EOF
            {
             newCompositeNode(grammarAccess.getEnumerationDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnumerationDataProperty=ruleEnumerationDataProperty();

            state._fsp--;

             current =iv_ruleEnumerationDataProperty; 
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
    // $ANTLR end "entryRuleEnumerationDataProperty"


    // $ANTLR start "ruleEnumerationDataProperty"
    // InternalSemanticNodesDsl.g:1257:1: ruleEnumerationDataProperty returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleEnumerationDataProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        EObject lv_metaDataValue_10_0 = null;

        EObject lv_metaDataValue_12_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1263:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? ) )
            // InternalSemanticNodesDsl.g:1264:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? )
            {
            // InternalSemanticNodesDsl.g:1264:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )? )
            // InternalSemanticNodesDsl.g:1265:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )?
            {
            // InternalSemanticNodesDsl.g:1265:3: ()
            // InternalSemanticNodesDsl.g:1266:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationDataPropertyAccess().getEnumDataPropertyAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:1272:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1273:4: (lv_name_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1273:4: (lv_name_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:1274:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnumerationDataPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSemanticNodesDsl.g:1291:3: (otherlv_2= ':' ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:1292:4: otherlv_2= ':' ( ( ruleEString ) )
            {
            otherlv_2=(Token)match(input,23,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getEnumerationDataPropertyAccess().getColonKeyword_2_0());
            			
            // InternalSemanticNodesDsl.g:1296:4: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:1297:5: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:1297:5: ( ruleEString )
            // InternalSemanticNodesDsl.g:1298:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEnumerationDataPropertyRule());
            						}
            					

            						newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getTypeEnumerationCrossReference_2_1_0());
            					
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalSemanticNodesDsl.g:1313:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==21) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1314:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnumerationDataPropertyAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalSemanticNodesDsl.g:1318:4: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:1319:5: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:1319:5: (lv_lowerBound_5_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:1320:6: lv_lowerBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_lowerBound_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationDataPropertyRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_3_2());
                    			
                    // InternalSemanticNodesDsl.g:1341:4: ( (lv_upperBound_7_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:1342:5: (lv_upperBound_7_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:1342:5: (lv_upperBound_7_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:1343:6: lv_upperBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_upperBound_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationDataPropertyRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,22,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnumerationDataPropertyAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:1365:3: (otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1366:4: otherlv_9= '{' ( (lv_metaDataValue_10_0= ruleMetaDataValue ) ) (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnumerationDataPropertyAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSemanticNodesDsl.g:1370:4: ( (lv_metaDataValue_10_0= ruleMetaDataValue ) )
                    // InternalSemanticNodesDsl.g:1371:5: (lv_metaDataValue_10_0= ruleMetaDataValue )
                    {
                    // InternalSemanticNodesDsl.g:1371:5: (lv_metaDataValue_10_0= ruleMetaDataValue )
                    // InternalSemanticNodesDsl.g:1372:6: lv_metaDataValue_10_0= ruleMetaDataValue
                    {

                    						newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_metaDataValue_10_0=ruleMetaDataValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationDataPropertyRule());
                    						}
                    						add(
                    							current,
                    							"metaDataValue",
                    							lv_metaDataValue_10_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:1389:4: (otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:1390:5: otherlv_11= ',' ( (lv_metaDataValue_12_0= ruleMetaDataValue ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:1394:5: ( (lv_metaDataValue_12_0= ruleMetaDataValue ) )
                    	    // InternalSemanticNodesDsl.g:1395:6: (lv_metaDataValue_12_0= ruleMetaDataValue )
                    	    {
                    	    // InternalSemanticNodesDsl.g:1395:6: (lv_metaDataValue_12_0= ruleMetaDataValue )
                    	    // InternalSemanticNodesDsl.g:1396:7: lv_metaDataValue_12_0= ruleMetaDataValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_metaDataValue_12_0=ruleMetaDataValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumerationDataPropertyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metaDataValue",
                    	    								lv_metaDataValue_12_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaDataValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getEnumerationDataPropertyAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleEnumerationDataProperty"


    // $ANTLR start "entryRuleMetaDataValue"
    // InternalSemanticNodesDsl.g:1423:1: entryRuleMetaDataValue returns [EObject current=null] : iv_ruleMetaDataValue= ruleMetaDataValue EOF ;
    public final EObject entryRuleMetaDataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaDataValue = null;


        try {
            // InternalSemanticNodesDsl.g:1423:54: (iv_ruleMetaDataValue= ruleMetaDataValue EOF )
            // InternalSemanticNodesDsl.g:1424:2: iv_ruleMetaDataValue= ruleMetaDataValue EOF
            {
             newCompositeNode(grammarAccess.getMetaDataValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaDataValue=ruleMetaDataValue();

            state._fsp--;

             current =iv_ruleMetaDataValue; 
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
    // $ANTLR end "entryRuleMetaDataValue"


    // $ANTLR start "ruleMetaDataValue"
    // InternalSemanticNodesDsl.g:1430:1: ruleMetaDataValue returns [EObject current=null] : ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleMetaDataValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1436:2: ( ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalSemanticNodesDsl.g:1437:2: ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalSemanticNodesDsl.g:1437:2: ( () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalSemanticNodesDsl.g:1438:3: () ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:1438:3: ()
            // InternalSemanticNodesDsl.g:1439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMetaDataValueAccess().getMetaDataValueAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:1445:3: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:1446:4: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:1446:4: ( ruleEString )
            // InternalSemanticNodesDsl.g:1447:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMetaDataValueRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMetaDataValueAccess().getKeyMetaDataMetaDataCrossReference_1_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaDataValueAccess().getEqualsSignKeyword_2());
            		
            // InternalSemanticNodesDsl.g:1465:3: ( (lv_value_3_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1466:4: (lv_value_3_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1466:4: (lv_value_3_0= ruleEString )
            // InternalSemanticNodesDsl.g:1467:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaDataValueAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaDataValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
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
    // $ANTLR end "ruleMetaDataValue"


    // $ANTLR start "entryRuleEString"
    // InternalSemanticNodesDsl.g:1488:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSemanticNodesDsl.g:1488:47: (iv_ruleEString= ruleEString EOF )
            // InternalSemanticNodesDsl.g:1489:2: iv_ruleEString= ruleEString EOF
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
    // InternalSemanticNodesDsl.g:1495:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1501:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSemanticNodesDsl.g:1502:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSemanticNodesDsl.g:1502:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_ID) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1503:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:1511:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEInt"
    // InternalSemanticNodesDsl.g:1522:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSemanticNodesDsl.g:1522:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSemanticNodesDsl.g:1523:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSemanticNodesDsl.g:1529:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1535:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSemanticNodesDsl.g:1536:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSemanticNodesDsl.g:1536:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSemanticNodesDsl.g:1537:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSemanticNodesDsl.g:1537:3: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==25) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1538:4: kw= '-'
                    {
                    kw=(Token)match(input,25,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleType"
    // InternalSemanticNodesDsl.g:1555:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1561:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalSemanticNodesDsl.g:1562:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalSemanticNodesDsl.g:1562:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt33=1;
                }
                break;
            case 27:
                {
                alt33=2;
                }
                break;
            case 28:
                {
                alt33=3;
                }
                break;
            case 29:
                {
                alt33=4;
                }
                break;
            case 30:
                {
                alt33=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1563:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSemanticNodesDsl.g:1563:3: (enumLiteral_0= 'String' )
                    // InternalSemanticNodesDsl.g:1564:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:1571:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalSemanticNodesDsl.g:1571:3: (enumLiteral_1= 'Int' )
                    // InternalSemanticNodesDsl.g:1572:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:1579:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalSemanticNodesDsl.g:1579:3: (enumLiteral_2= 'Boolean' )
                    // InternalSemanticNodesDsl.g:1580:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSemanticNodesDsl.g:1587:3: (enumLiteral_3= 'Float' )
                    {
                    // InternalSemanticNodesDsl.g:1587:3: (enumLiteral_3= 'Float' )
                    // InternalSemanticNodesDsl.g:1588:4: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSemanticNodesDsl.g:1595:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalSemanticNodesDsl.g:1595:3: (enumLiteral_4= 'Double' )
                    // InternalSemanticNodesDsl.g:1596:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,30,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000001AC030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002004040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000202002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});

}