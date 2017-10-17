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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'repository'", "'{'", "'}'", "'metadata'", "','", "'enum'", "'->'", "'abstract'", "'node'", "'['", "']'", "':'", "'='", "'-'", "'@'", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'"
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
    // InternalSemanticNodesDsl.g:72:1: ruleRepositoryManager returns [EObject current=null] : ( () ( ( (lv_repositories_1_0= ruleRepository ) ) ( (lv_repositories_2_0= ruleRepository ) )* )? ) ;
    public final EObject ruleRepositoryManager() throws RecognitionException {
        EObject current = null;

        EObject lv_repositories_1_0 = null;

        EObject lv_repositories_2_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:78:2: ( ( () ( ( (lv_repositories_1_0= ruleRepository ) ) ( (lv_repositories_2_0= ruleRepository ) )* )? ) )
            // InternalSemanticNodesDsl.g:79:2: ( () ( ( (lv_repositories_1_0= ruleRepository ) ) ( (lv_repositories_2_0= ruleRepository ) )* )? )
            {
            // InternalSemanticNodesDsl.g:79:2: ( () ( ( (lv_repositories_1_0= ruleRepository ) ) ( (lv_repositories_2_0= ruleRepository ) )* )? )
            // InternalSemanticNodesDsl.g:80:3: () ( ( (lv_repositories_1_0= ruleRepository ) ) ( (lv_repositories_2_0= ruleRepository ) )* )?
            {
            // InternalSemanticNodesDsl.g:80:3: ()
            // InternalSemanticNodesDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:87:3: ( ( (lv_repositories_1_0= ruleRepository ) ) ( (lv_repositories_2_0= ruleRepository ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSemanticNodesDsl.g:88:4: ( (lv_repositories_1_0= ruleRepository ) ) ( (lv_repositories_2_0= ruleRepository ) )*
                    {
                    // InternalSemanticNodesDsl.g:88:4: ( (lv_repositories_1_0= ruleRepository ) )
                    // InternalSemanticNodesDsl.g:89:5: (lv_repositories_1_0= ruleRepository )
                    {
                    // InternalSemanticNodesDsl.g:89:5: (lv_repositories_1_0= ruleRepository )
                    // InternalSemanticNodesDsl.g:90:6: lv_repositories_1_0= ruleRepository
                    {

                    						newCompositeNode(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_repositories_1_0=ruleRepository();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryManagerRule());
                    						}
                    						add(
                    							current,
                    							"repositories",
                    							lv_repositories_1_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Repository");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:107:4: ( (lv_repositories_2_0= ruleRepository ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:108:5: (lv_repositories_2_0= ruleRepository )
                    	    {
                    	    // InternalSemanticNodesDsl.g:108:5: (lv_repositories_2_0= ruleRepository )
                    	    // InternalSemanticNodesDsl.g:109:6: lv_repositories_2_0= ruleRepository
                    	    {

                    	    						newCompositeNode(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_repositories_2_0=ruleRepository();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRepositoryManagerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"repositories",
                    	    							lv_repositories_2_0,
                    	    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Repository");
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
    // InternalSemanticNodesDsl.g:131:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalSemanticNodesDsl.g:131:51: (iv_ruleRepository= ruleRepository EOF )
            // InternalSemanticNodesDsl.g:132:2: iv_ruleRepository= ruleRepository EOF
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
    // InternalSemanticNodesDsl.g:138:1: ruleRepository returns [EObject current=null] : ( () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' ) ;
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
            // InternalSemanticNodesDsl.g:144:2: ( ( () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' ) )
            // InternalSemanticNodesDsl.g:145:2: ( () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' )
            {
            // InternalSemanticNodesDsl.g:145:2: ( () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}' )
            // InternalSemanticNodesDsl.g:146:3: () otherlv_1= 'repository' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_resources_4_0= ruleResource ) ) ( (lv_resources_5_0= ruleResource ) )* otherlv_6= '}'
            {
            // InternalSemanticNodesDsl.g:146:3: ()
            // InternalSemanticNodesDsl.g:147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryAccess().getRepositoryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRepositoryAccess().getRepositoryKeyword_1());
            		
            // InternalSemanticNodesDsl.g:157:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:158:4: (lv_name_2_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:158:4: (lv_name_2_0= ruleEString )
            // InternalSemanticNodesDsl.g:159:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSemanticNodesDsl.g:180:3: ( (lv_resources_4_0= ruleResource ) )
            // InternalSemanticNodesDsl.g:181:4: (lv_resources_4_0= ruleResource )
            {
            // InternalSemanticNodesDsl.g:181:4: (lv_resources_4_0= ruleResource )
            // InternalSemanticNodesDsl.g:182:5: lv_resources_4_0= ruleResource
            {

            					newCompositeNode(grammarAccess.getRepositoryAccess().getResourcesResourceParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalSemanticNodesDsl.g:199:3: ( (lv_resources_5_0= ruleResource ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==25) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:200:4: (lv_resources_5_0= ruleResource )
            	    {
            	    // InternalSemanticNodesDsl.g:200:4: (lv_resources_5_0= ruleResource )
            	    // InternalSemanticNodesDsl.g:201:5: lv_resources_5_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getRepositoryAccess().getResourcesResourceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
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
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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
    // InternalSemanticNodesDsl.g:226:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalSemanticNodesDsl.g:226:49: (iv_ruleResource= ruleResource EOF )
            // InternalSemanticNodesDsl.g:227:2: iv_ruleResource= ruleResource EOF
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
    // InternalSemanticNodesDsl.g:233:1: ruleResource returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_assistant_3_0= ruleEString ) ) ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' ( ( (lv_resourceElements_6_0= ruleResourceElement ) ) ( (lv_resourceElements_7_0= ruleResourceElement ) )* )? otherlv_8= '}' (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_annotations_2_0 = null;

        AntlrDatatypeRuleToken lv_assistant_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_resourceElements_6_0 = null;

        EObject lv_resourceElements_7_0 = null;

        EObject lv_metadata_11_0 = null;

        EObject lv_metadata_13_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:239:2: ( ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_assistant_3_0= ruleEString ) ) ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' ( ( (lv_resourceElements_6_0= ruleResourceElement ) ) ( (lv_resourceElements_7_0= ruleResourceElement ) )* )? otherlv_8= '}' (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? ) )
            // InternalSemanticNodesDsl.g:240:2: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_assistant_3_0= ruleEString ) ) ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' ( ( (lv_resourceElements_6_0= ruleResourceElement ) ) ( (lv_resourceElements_7_0= ruleResourceElement ) )* )? otherlv_8= '}' (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? )
            {
            // InternalSemanticNodesDsl.g:240:2: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_assistant_3_0= ruleEString ) ) ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' ( ( (lv_resourceElements_6_0= ruleResourceElement ) ) ( (lv_resourceElements_7_0= ruleResourceElement ) )* )? otherlv_8= '}' (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? )
            // InternalSemanticNodesDsl.g:241:3: () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_assistant_3_0= ruleEString ) ) ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' ( ( (lv_resourceElements_6_0= ruleResourceElement ) ) ( (lv_resourceElements_7_0= ruleResourceElement ) )* )? otherlv_8= '}' (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )?
            {
            // InternalSemanticNodesDsl.g:241:3: ()
            // InternalSemanticNodesDsl.g:242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourceAccess().getResourceAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:248:3: ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSemanticNodesDsl.g:249:4: ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )*
                    {
                    // InternalSemanticNodesDsl.g:249:4: ( (lv_annotations_1_0= ruleAnnotation ) )
                    // InternalSemanticNodesDsl.g:250:5: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // InternalSemanticNodesDsl.g:250:5: (lv_annotations_1_0= ruleAnnotation )
                    // InternalSemanticNodesDsl.g:251:6: lv_annotations_1_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getAnnotationsAnnotationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_1_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:268:4: ( (lv_annotations_2_0= ruleAnnotation ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==25) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:269:5: (lv_annotations_2_0= ruleAnnotation )
                    	    {
                    	    // InternalSemanticNodesDsl.g:269:5: (lv_annotations_2_0= ruleAnnotation )
                    	    // InternalSemanticNodesDsl.g:270:6: lv_annotations_2_0= ruleAnnotation
                    	    {

                    	    						newCompositeNode(grammarAccess.getResourceAccess().getAnnotationsAnnotationParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_annotations_2_0=ruleAnnotation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"annotations",
                    	    							lv_annotations_2_0,
                    	    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Annotation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:288:3: ( (lv_assistant_3_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:289:4: (lv_assistant_3_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:289:4: (lv_assistant_3_0= ruleEString )
            // InternalSemanticNodesDsl.g:290:5: lv_assistant_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getAssistantEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_assistant_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"assistant",
            						lv_assistant_3_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSemanticNodesDsl.g:307:3: ( (lv_name_4_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:308:4: (lv_name_4_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:308:4: (lv_name_4_0= ruleEString )
            // InternalSemanticNodesDsl.g:309:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalSemanticNodesDsl.g:330:3: ( ( (lv_resourceElements_6_0= ruleResourceElement ) ) ( (lv_resourceElements_7_0= ruleResourceElement ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==16||(LA7_0>=18 && LA7_0<=19)||LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSemanticNodesDsl.g:331:4: ( (lv_resourceElements_6_0= ruleResourceElement ) ) ( (lv_resourceElements_7_0= ruleResourceElement ) )*
                    {
                    // InternalSemanticNodesDsl.g:331:4: ( (lv_resourceElements_6_0= ruleResourceElement ) )
                    // InternalSemanticNodesDsl.g:332:5: (lv_resourceElements_6_0= ruleResourceElement )
                    {
                    // InternalSemanticNodesDsl.g:332:5: (lv_resourceElements_6_0= ruleResourceElement )
                    // InternalSemanticNodesDsl.g:333:6: lv_resourceElements_6_0= ruleResourceElement
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getResourceElementsResourceElementParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_resourceElements_6_0=ruleResourceElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						add(
                    							current,
                    							"resourceElements",
                    							lv_resourceElements_6_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.ResourceElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:350:4: ( (lv_resourceElements_7_0= ruleResourceElement ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==16||(LA6_0>=18 && LA6_0<=19)||LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:351:5: (lv_resourceElements_7_0= ruleResourceElement )
                    	    {
                    	    // InternalSemanticNodesDsl.g:351:5: (lv_resourceElements_7_0= ruleResourceElement )
                    	    // InternalSemanticNodesDsl.g:352:6: lv_resourceElements_7_0= ruleResourceElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getResourceAccess().getResourceElementsResourceElementParserRuleCall_5_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_resourceElements_7_0=ruleResourceElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"resourceElements",
                    	    							lv_resourceElements_7_0,
                    	    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.ResourceElement");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            otherlv_8=(Token)match(input,13,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalSemanticNodesDsl.g:374:3: (otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSemanticNodesDsl.g:375:4: otherlv_9= 'metadata' otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getMetadataKeyword_7_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalSemanticNodesDsl.g:383:4: ( (lv_metadata_11_0= ruleMetaData ) )
                    // InternalSemanticNodesDsl.g:384:5: (lv_metadata_11_0= ruleMetaData )
                    {
                    // InternalSemanticNodesDsl.g:384:5: (lv_metadata_11_0= ruleMetaData )
                    // InternalSemanticNodesDsl.g:385:6: lv_metadata_11_0= ruleMetaData
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getMetadataMetaDataParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_metadata_11_0=ruleMetaData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						add(
                    							current,
                    							"metadata",
                    							lv_metadata_11_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:402:4: (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:403:5: otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:407:5: ( (lv_metadata_13_0= ruleMetaData ) )
                    	    // InternalSemanticNodesDsl.g:408:6: (lv_metadata_13_0= ruleMetaData )
                    	    {
                    	    // InternalSemanticNodesDsl.g:408:6: (lv_metadata_13_0= ruleMetaData )
                    	    // InternalSemanticNodesDsl.g:409:7: lv_metadata_13_0= ruleMetaData
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getMetadataMetaDataParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_metadata_13_0=ruleMetaData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metadata",
                    	    								lv_metadata_13_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_7_4());
                    			

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
    // InternalSemanticNodesDsl.g:436:1: entryRuleResourceElement returns [EObject current=null] : iv_ruleResourceElement= ruleResourceElement EOF ;
    public final EObject entryRuleResourceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResourceElement = null;


        try {
            // InternalSemanticNodesDsl.g:436:56: (iv_ruleResourceElement= ruleResourceElement EOF )
            // InternalSemanticNodesDsl.g:437:2: iv_ruleResourceElement= ruleResourceElement EOF
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
    // InternalSemanticNodesDsl.g:443:1: ruleResourceElement returns [EObject current=null] : (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode | this_Enumeration_2= ruleEnumeration ) ;
    public final EObject ruleResourceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Resource_0 = null;

        EObject this_SemanticNode_1 = null;

        EObject this_Enumeration_2 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:449:2: ( (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode | this_Enumeration_2= ruleEnumeration ) )
            // InternalSemanticNodesDsl.g:450:2: (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode | this_Enumeration_2= ruleEnumeration )
            {
            // InternalSemanticNodesDsl.g:450:2: (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode | this_Enumeration_2= ruleEnumeration )
            int alt10=3;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalSemanticNodesDsl.g:451:3: this_Resource_0= ruleResource
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
                    // InternalSemanticNodesDsl.g:460:3: this_SemanticNode_1= ruleSemanticNode
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
                    // InternalSemanticNodesDsl.g:469:3: this_Enumeration_2= ruleEnumeration
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
    // InternalSemanticNodesDsl.g:481:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalSemanticNodesDsl.g:481:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalSemanticNodesDsl.g:482:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalSemanticNodesDsl.g:488:1: ruleEnumeration returns [EObject current=null] : ( () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}' ) ;
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
            // InternalSemanticNodesDsl.g:494:2: ( ( () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}' ) )
            // InternalSemanticNodesDsl.g:495:2: ( () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}' )
            {
            // InternalSemanticNodesDsl.g:495:2: ( () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}' )
            // InternalSemanticNodesDsl.g:496:3: () otherlv_1= 'enum' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )? otherlv_6= '}'
            {
            // InternalSemanticNodesDsl.g:496:3: ()
            // InternalSemanticNodesDsl.g:497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationAccess().getEnumerationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEnumerationAccess().getEnumKeyword_1());
            		
            // InternalSemanticNodesDsl.g:507:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:508:4: (lv_name_2_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:508:4: (lv_name_2_0= ruleEString )
            // InternalSemanticNodesDsl.g:509:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            otherlv_3=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSemanticNodesDsl.g:530:3: ( ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_INT||LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSemanticNodesDsl.g:531:4: ( (lv_literals_4_0= ruleEnumerationLiteral ) ) ( (lv_literals_5_0= ruleEnumerationLiteral ) )*
                    {
                    // InternalSemanticNodesDsl.g:531:4: ( (lv_literals_4_0= ruleEnumerationLiteral ) )
                    // InternalSemanticNodesDsl.g:532:5: (lv_literals_4_0= ruleEnumerationLiteral )
                    {
                    // InternalSemanticNodesDsl.g:532:5: (lv_literals_4_0= ruleEnumerationLiteral )
                    // InternalSemanticNodesDsl.g:533:6: lv_literals_4_0= ruleEnumerationLiteral
                    {

                    						newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalSemanticNodesDsl.g:550:4: ( (lv_literals_5_0= ruleEnumerationLiteral ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_INT||LA11_0==24) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:551:5: (lv_literals_5_0= ruleEnumerationLiteral )
                    	    {
                    	    // InternalSemanticNodesDsl.g:551:5: (lv_literals_5_0= ruleEnumerationLiteral )
                    	    // InternalSemanticNodesDsl.g:552:6: lv_literals_5_0= ruleEnumerationLiteral
                    	    {

                    	    						newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

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
    // InternalSemanticNodesDsl.g:578:1: entryRuleEnumerationLiteral returns [EObject current=null] : iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF ;
    public final EObject entryRuleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationLiteral = null;


        try {
            // InternalSemanticNodesDsl.g:578:59: (iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF )
            // InternalSemanticNodesDsl.g:579:2: iv_ruleEnumerationLiteral= ruleEnumerationLiteral EOF
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
    // InternalSemanticNodesDsl.g:585:1: ruleEnumerationLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) ) ) ;
    public final EObject ruleEnumerationLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_literal_3_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:591:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) ) ) )
            // InternalSemanticNodesDsl.g:592:2: ( () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) ) )
            {
            // InternalSemanticNodesDsl.g:592:2: ( () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) ) )
            // InternalSemanticNodesDsl.g:593:3: () ( (lv_value_1_0= ruleEInt ) ) otherlv_2= '->' ( (lv_literal_3_0= ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:593:3: ()
            // InternalSemanticNodesDsl.g:594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:600:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalSemanticNodesDsl.g:601:4: (lv_value_1_0= ruleEInt )
            {
            // InternalSemanticNodesDsl.g:601:4: (lv_value_1_0= ruleEInt )
            // InternalSemanticNodesDsl.g:602:5: lv_value_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getValueEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalSemanticNodesDsl.g:623:3: ( (lv_literal_3_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:624:4: (lv_literal_3_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:624:4: (lv_literal_3_0= ruleEString )
            // InternalSemanticNodesDsl.g:625:5: lv_literal_3_0= ruleEString
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
    // InternalSemanticNodesDsl.g:646:1: entryRuleSemanticNode returns [EObject current=null] : iv_ruleSemanticNode= ruleSemanticNode EOF ;
    public final EObject entryRuleSemanticNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticNode = null;


        try {
            // InternalSemanticNodesDsl.g:646:53: (iv_ruleSemanticNode= ruleSemanticNode EOF )
            // InternalSemanticNodesDsl.g:647:2: iv_ruleSemanticNode= ruleSemanticNode EOF
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
    // InternalSemanticNodesDsl.g:653:1: ruleSemanticNode returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? ) ;
    public final EObject ruleSemanticNode() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_annotations_1_0 = null;

        EObject lv_annotations_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_properties_7_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_metadata_11_0 = null;

        EObject lv_metadata_13_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:659:2: ( ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? ) )
            // InternalSemanticNodesDsl.g:660:2: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? )
            {
            // InternalSemanticNodesDsl.g:660:2: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? )
            // InternalSemanticNodesDsl.g:661:3: () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )?
            {
            // InternalSemanticNodesDsl.g:661:3: ()
            // InternalSemanticNodesDsl.g:662:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSemanticNodeAccess().getSemanticNodeAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:668:3: ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSemanticNodesDsl.g:669:4: ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )*
                    {
                    // InternalSemanticNodesDsl.g:669:4: ( (lv_annotations_1_0= ruleAnnotation ) )
                    // InternalSemanticNodesDsl.g:670:5: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // InternalSemanticNodesDsl.g:670:5: (lv_annotations_1_0= ruleAnnotation )
                    // InternalSemanticNodesDsl.g:671:6: lv_annotations_1_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getAnnotationsAnnotationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_1_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:688:4: ( (lv_annotations_2_0= ruleAnnotation ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==25) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:689:5: (lv_annotations_2_0= ruleAnnotation )
                    	    {
                    	    // InternalSemanticNodesDsl.g:689:5: (lv_annotations_2_0= ruleAnnotation )
                    	    // InternalSemanticNodesDsl.g:690:6: lv_annotations_2_0= ruleAnnotation
                    	    {

                    	    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getAnnotationsAnnotationParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_annotations_2_0=ruleAnnotation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"annotations",
                    	    							lv_annotations_2_0,
                    	    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Annotation");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:708:3: ( (lv_abstract_3_0= 'abstract' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==18) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSemanticNodesDsl.g:709:4: (lv_abstract_3_0= 'abstract' )
                    {
                    // InternalSemanticNodesDsl.g:709:4: (lv_abstract_3_0= 'abstract' )
                    // InternalSemanticNodesDsl.g:710:5: lv_abstract_3_0= 'abstract'
                    {
                    lv_abstract_3_0=(Token)match(input,18,FOLLOW_14); 

                    					newLeafNode(lv_abstract_3_0, grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSemanticNodeRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSemanticNodeAccess().getNodeKeyword_3());
            		
            // InternalSemanticNodesDsl.g:726:3: ( (lv_name_5_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:727:4: (lv_name_5_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:727:4: (lv_name_5_0= ruleEString )
            // InternalSemanticNodesDsl.g:728:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSemanticNodeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSemanticNodesDsl.g:749:3: ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_ID)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSemanticNodesDsl.g:750:4: ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )*
                    {
                    // InternalSemanticNodesDsl.g:750:4: ( (lv_properties_7_0= ruleProperty ) )
                    // InternalSemanticNodesDsl.g:751:5: (lv_properties_7_0= ruleProperty )
                    {
                    // InternalSemanticNodesDsl.g:751:5: (lv_properties_7_0= ruleProperty )
                    // InternalSemanticNodesDsl.g:752:6: lv_properties_7_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_properties_7_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    						}
                    						add(
                    							current,
                    							"properties",
                    							lv_properties_7_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:769:4: ( (lv_properties_8_0= ruleProperty ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:770:5: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalSemanticNodesDsl.g:770:5: (lv_properties_8_0= ruleProperty )
                    	    // InternalSemanticNodesDsl.g:771:6: lv_properties_8_0= ruleProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_properties_8_0=ruleProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"properties",
                    	    							lv_properties_8_0,
                    	    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.Property");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            otherlv_9=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_9, grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalSemanticNodesDsl.g:793:3: (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSemanticNodesDsl.g:794:4: otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_8_0());
                    			
                    // InternalSemanticNodesDsl.g:798:4: ( (lv_metadata_11_0= ruleMetaData ) )
                    // InternalSemanticNodesDsl.g:799:5: (lv_metadata_11_0= ruleMetaData )
                    {
                    // InternalSemanticNodesDsl.g:799:5: (lv_metadata_11_0= ruleMetaData )
                    // InternalSemanticNodesDsl.g:800:6: lv_metadata_11_0= ruleMetaData
                    {

                    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getMetadataMetaDataParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_metadata_11_0=ruleMetaData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    						}
                    						add(
                    							current,
                    							"metadata",
                    							lv_metadata_11_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:817:4: (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:818:5: otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSemanticNodeAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:822:5: ( (lv_metadata_13_0= ruleMetaData ) )
                    	    // InternalSemanticNodesDsl.g:823:6: (lv_metadata_13_0= ruleMetaData )
                    	    {
                    	    // InternalSemanticNodesDsl.g:823:6: (lv_metadata_13_0= ruleMetaData )
                    	    // InternalSemanticNodesDsl.g:824:7: lv_metadata_13_0= ruleMetaData
                    	    {

                    	    							newCompositeNode(grammarAccess.getSemanticNodeAccess().getMetadataMetaDataParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_metadata_13_0=ruleMetaData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSemanticNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metadata",
                    	    								lv_metadata_13_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_8_3());
                    			

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
    // InternalSemanticNodesDsl.g:851:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSemanticNodesDsl.g:851:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSemanticNodesDsl.g:852:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalSemanticNodesDsl.g:858:1: ruleProperty returns [EObject current=null] : (this_ObjectProperty_0= ruleObjectProperty | this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty | this_EnumerationDataProperty_2= ruleEnumerationDataProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectProperty_0 = null;

        EObject this_PrimitiveTypeDataProperty_1 = null;

        EObject this_EnumerationDataProperty_2 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:864:2: ( (this_ObjectProperty_0= ruleObjectProperty | this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty | this_EnumerationDataProperty_2= ruleEnumerationDataProperty ) )
            // InternalSemanticNodesDsl.g:865:2: (this_ObjectProperty_0= ruleObjectProperty | this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty | this_EnumerationDataProperty_2= ruleEnumerationDataProperty )
            {
            // InternalSemanticNodesDsl.g:865:2: (this_ObjectProperty_0= ruleObjectProperty | this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty | this_EnumerationDataProperty_2= ruleEnumerationDataProperty )
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==17) ) {
                    alt20=1;
                }
                else if ( (LA20_1==22) ) {
                    int LA20_4 = input.LA(3);

                    if ( ((LA20_4>=26 && LA20_4<=30)) ) {
                        alt20=2;
                    }
                    else if ( ((LA20_4>=RULE_STRING && LA20_4<=RULE_ID)) ) {
                        alt20=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0==RULE_ID) ) {
                int LA20_2 = input.LA(2);

                if ( (LA20_2==22) ) {
                    int LA20_4 = input.LA(3);

                    if ( ((LA20_4>=26 && LA20_4<=30)) ) {
                        alt20=2;
                    }
                    else if ( ((LA20_4>=RULE_STRING && LA20_4<=RULE_ID)) ) {
                        alt20=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA20_2==17) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalSemanticNodesDsl.g:866:3: this_ObjectProperty_0= ruleObjectProperty
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
                    // InternalSemanticNodesDsl.g:875:3: this_PrimitiveTypeDataProperty_1= rulePrimitiveTypeDataProperty
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
                    // InternalSemanticNodesDsl.g:884:3: this_EnumerationDataProperty_2= ruleEnumerationDataProperty
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
    // InternalSemanticNodesDsl.g:896:1: entryRuleObjectProperty returns [EObject current=null] : iv_ruleObjectProperty= ruleObjectProperty EOF ;
    public final EObject entryRuleObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectProperty = null;


        try {
            // InternalSemanticNodesDsl.g:896:55: (iv_ruleObjectProperty= ruleObjectProperty EOF )
            // InternalSemanticNodesDsl.g:897:2: iv_ruleObjectProperty= ruleObjectProperty EOF
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
    // InternalSemanticNodesDsl.g:903:1: ruleObjectProperty returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) ;
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

        EObject lv_metadata_10_0 = null;

        EObject lv_metadata_12_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:909:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) )
            // InternalSemanticNodesDsl.g:910:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            {
            // InternalSemanticNodesDsl.g:910:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            // InternalSemanticNodesDsl.g:911:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            {
            // InternalSemanticNodesDsl.g:911:3: ()
            // InternalSemanticNodesDsl.g:912:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectPropertyAccess().getObjectPropertyAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:918:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:919:4: (lv_name_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:919:4: (lv_name_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:920:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getObjectPropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_2=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectPropertyAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalSemanticNodesDsl.g:941:3: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:942:4: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:942:4: ( ruleEString )
            // InternalSemanticNodesDsl.g:943:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObjectPropertyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getObjectPropertyAccess().getRangeSemanticNodeCrossReference_3_0());
            				
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSemanticNodesDsl.g:957:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSemanticNodesDsl.g:958:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectPropertyAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalSemanticNodesDsl.g:962:4: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:963:5: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:963:5: (lv_lowerBound_5_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:964:6: lv_lowerBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getObjectPropertyAccess().getLowerBoundEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    otherlv_6=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjectPropertyAccess().getCommaKeyword_4_2());
                    			
                    // InternalSemanticNodesDsl.g:985:4: ( (lv_upperBound_7_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:986:5: (lv_upperBound_7_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:986:5: (lv_upperBound_7_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:987:6: lv_upperBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getObjectPropertyAccess().getUpperBoundEIntParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectPropertyAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:1009:3: (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1010:4: otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjectPropertyAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalSemanticNodesDsl.g:1014:4: ( (lv_metadata_10_0= ruleMetaData ) )
                    // InternalSemanticNodesDsl.g:1015:5: (lv_metadata_10_0= ruleMetaData )
                    {
                    // InternalSemanticNodesDsl.g:1015:5: (lv_metadata_10_0= ruleMetaData )
                    // InternalSemanticNodesDsl.g:1016:6: lv_metadata_10_0= ruleMetaData
                    {

                    						newCompositeNode(grammarAccess.getObjectPropertyAccess().getMetadataMetaDataParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_metadata_10_0=ruleMetaData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
                    						}
                    						add(
                    							current,
                    							"metadata",
                    							lv_metadata_10_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:1033:4: (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:1034:5: otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getObjectPropertyAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:1038:5: ( (lv_metadata_12_0= ruleMetaData ) )
                    	    // InternalSemanticNodesDsl.g:1039:6: (lv_metadata_12_0= ruleMetaData )
                    	    {
                    	    // InternalSemanticNodesDsl.g:1039:6: (lv_metadata_12_0= ruleMetaData )
                    	    // InternalSemanticNodesDsl.g:1040:7: lv_metadata_12_0= ruleMetaData
                    	    {

                    	    							newCompositeNode(grammarAccess.getObjectPropertyAccess().getMetadataMetaDataParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_metadata_12_0=ruleMetaData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getObjectPropertyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metadata",
                    	    								lv_metadata_12_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,13,FOLLOW_2); 

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
    // InternalSemanticNodesDsl.g:1067:1: entryRulePrimitiveTypeDataProperty returns [EObject current=null] : iv_rulePrimitiveTypeDataProperty= rulePrimitiveTypeDataProperty EOF ;
    public final EObject entryRulePrimitiveTypeDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveTypeDataProperty = null;


        try {
            // InternalSemanticNodesDsl.g:1067:66: (iv_rulePrimitiveTypeDataProperty= rulePrimitiveTypeDataProperty EOF )
            // InternalSemanticNodesDsl.g:1068:2: iv_rulePrimitiveTypeDataProperty= rulePrimitiveTypeDataProperty EOF
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
    // InternalSemanticNodesDsl.g:1074:1: rulePrimitiveTypeDataProperty returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) ;
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

        EObject lv_metadata_10_0 = null;

        EObject lv_metadata_12_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1080:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) )
            // InternalSemanticNodesDsl.g:1081:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            {
            // InternalSemanticNodesDsl.g:1081:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            // InternalSemanticNodesDsl.g:1082:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            {
            // InternalSemanticNodesDsl.g:1082:3: ()
            // InternalSemanticNodesDsl.g:1083:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrimitiveTypeDataPropertyAccess().getPrimitiveTypeDataPropertyAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:1089:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1090:4: (lv_name_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1090:4: (lv_name_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:1091:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalSemanticNodesDsl.g:1108:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalSemanticNodesDsl.g:1109:4: otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_2=(Token)match(input,22,FOLLOW_22); 

            				newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeDataPropertyAccess().getColonKeyword_2_0());
            			
            // InternalSemanticNodesDsl.g:1113:4: ( (lv_type_3_0= ruleType ) )
            // InternalSemanticNodesDsl.g:1114:5: (lv_type_3_0= ruleType )
            {
            // InternalSemanticNodesDsl.g:1114:5: (lv_type_3_0= ruleType )
            // InternalSemanticNodesDsl.g:1115:6: lv_type_3_0= ruleType
            {

            						newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getTypeTypeEnumRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_17);
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

            // InternalSemanticNodesDsl.g:1133:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1134:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalSemanticNodesDsl.g:1138:4: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:1139:5: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:1139:5: (lv_lowerBound_5_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:1140:6: lv_lowerBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    otherlv_6=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_3_2());
                    			
                    // InternalSemanticNodesDsl.g:1161:4: ( (lv_upperBound_7_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:1162:5: (lv_upperBound_7_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:1162:5: (lv_upperBound_7_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:1163:6: lv_upperBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrimitiveTypeDataPropertyAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:1185:3: (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==12) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1186:4: otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSemanticNodesDsl.g:1190:4: ( (lv_metadata_10_0= ruleMetaData ) )
                    // InternalSemanticNodesDsl.g:1191:5: (lv_metadata_10_0= ruleMetaData )
                    {
                    // InternalSemanticNodesDsl.g:1191:5: (lv_metadata_10_0= ruleMetaData )
                    // InternalSemanticNodesDsl.g:1192:6: lv_metadata_10_0= ruleMetaData
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_metadata_10_0=ruleMetaData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveTypeDataPropertyRule());
                    						}
                    						add(
                    							current,
                    							"metadata",
                    							lv_metadata_10_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:1209:4: (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:1210:5: otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:1214:5: ( (lv_metadata_12_0= ruleMetaData ) )
                    	    // InternalSemanticNodesDsl.g:1215:6: (lv_metadata_12_0= ruleMetaData )
                    	    {
                    	    // InternalSemanticNodesDsl.g:1215:6: (lv_metadata_12_0= ruleMetaData )
                    	    // InternalSemanticNodesDsl.g:1216:7: lv_metadata_12_0= ruleMetaData
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_metadata_12_0=ruleMetaData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrimitiveTypeDataPropertyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metadata",
                    	    								lv_metadata_12_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,13,FOLLOW_2); 

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
    // InternalSemanticNodesDsl.g:1243:1: entryRuleEnumerationDataProperty returns [EObject current=null] : iv_ruleEnumerationDataProperty= ruleEnumerationDataProperty EOF ;
    public final EObject entryRuleEnumerationDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumerationDataProperty = null;


        try {
            // InternalSemanticNodesDsl.g:1243:64: (iv_ruleEnumerationDataProperty= ruleEnumerationDataProperty EOF )
            // InternalSemanticNodesDsl.g:1244:2: iv_ruleEnumerationDataProperty= ruleEnumerationDataProperty EOF
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
    // InternalSemanticNodesDsl.g:1250:1: ruleEnumerationDataProperty returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) ;
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

        EObject lv_metadata_10_0 = null;

        EObject lv_metadata_12_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1256:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) )
            // InternalSemanticNodesDsl.g:1257:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            {
            // InternalSemanticNodesDsl.g:1257:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            // InternalSemanticNodesDsl.g:1258:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( ( ruleEString ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            {
            // InternalSemanticNodesDsl.g:1258:3: ()
            // InternalSemanticNodesDsl.g:1259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnumerationDataPropertyAccess().getEnumDataPropertyAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:1265:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1266:4: (lv_name_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1266:4: (lv_name_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:1267:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalSemanticNodesDsl.g:1284:3: (otherlv_2= ':' ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:1285:4: otherlv_2= ':' ( ( ruleEString ) )
            {
            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            				newLeafNode(otherlv_2, grammarAccess.getEnumerationDataPropertyAccess().getColonKeyword_2_0());
            			
            // InternalSemanticNodesDsl.g:1289:4: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:1290:5: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:1290:5: ( ruleEString )
            // InternalSemanticNodesDsl.g:1291:6: ruleEString
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEnumerationDataPropertyRule());
            						}
            					

            						newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getTypeEnumerationCrossReference_2_1_0());
            					
            pushFollow(FOLLOW_17);
            ruleEString();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalSemanticNodesDsl.g:1306:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1307:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getEnumerationDataPropertyAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalSemanticNodesDsl.g:1311:4: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:1312:5: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:1312:5: (lv_lowerBound_5_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:1313:6: lv_lowerBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    otherlv_6=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_3_2());
                    			
                    // InternalSemanticNodesDsl.g:1334:4: ( (lv_upperBound_7_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:1335:5: (lv_upperBound_7_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:1335:5: (lv_upperBound_7_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:1336:6: lv_upperBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_20);
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

                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getEnumerationDataPropertyAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:1358:3: (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==12) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1359:4: otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getEnumerationDataPropertyAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSemanticNodesDsl.g:1363:4: ( (lv_metadata_10_0= ruleMetaData ) )
                    // InternalSemanticNodesDsl.g:1364:5: (lv_metadata_10_0= ruleMetaData )
                    {
                    // InternalSemanticNodesDsl.g:1364:5: (lv_metadata_10_0= ruleMetaData )
                    // InternalSemanticNodesDsl.g:1365:6: lv_metadata_10_0= ruleMetaData
                    {

                    						newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_metadata_10_0=ruleMetaData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEnumerationDataPropertyRule());
                    						}
                    						add(
                    							current,
                    							"metadata",
                    							lv_metadata_10_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:1382:4: (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:1383:5: otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:1387:5: ( (lv_metadata_12_0= ruleMetaData ) )
                    	    // InternalSemanticNodesDsl.g:1388:6: (lv_metadata_12_0= ruleMetaData )
                    	    {
                    	    // InternalSemanticNodesDsl.g:1388:6: (lv_metadata_12_0= ruleMetaData )
                    	    // InternalSemanticNodesDsl.g:1389:7: lv_metadata_12_0= ruleMetaData
                    	    {

                    	    							newCompositeNode(grammarAccess.getEnumerationDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_metadata_12_0=ruleMetaData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEnumerationDataPropertyRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"metadata",
                    	    								lv_metadata_12_0,
                    	    								"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,13,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMetaData"
    // InternalSemanticNodesDsl.g:1416:1: entryRuleMetaData returns [EObject current=null] : iv_ruleMetaData= ruleMetaData EOF ;
    public final EObject entryRuleMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaData = null;


        try {
            // InternalSemanticNodesDsl.g:1416:49: (iv_ruleMetaData= ruleMetaData EOF )
            // InternalSemanticNodesDsl.g:1417:2: iv_ruleMetaData= ruleMetaData EOF
            {
             newCompositeNode(grammarAccess.getMetaDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMetaData=ruleMetaData();

            state._fsp--;

             current =iv_ruleMetaData; 
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
    // $ANTLR end "entryRuleMetaData"


    // $ANTLR start "ruleMetaData"
    // InternalSemanticNodesDsl.g:1423:1: ruleMetaData returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1429:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalSemanticNodesDsl.g:1430:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalSemanticNodesDsl.g:1430:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalSemanticNodesDsl.g:1431:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:1431:3: ()
            // InternalSemanticNodesDsl.g:1432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMetaDataAccess().getMetaDataAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:1438:3: ( (lv_key_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1439:4: (lv_key_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1439:4: (lv_key_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:1440:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaDataAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_key_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaDataRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaDataAccess().getEqualsSignKeyword_2());
            		
            // InternalSemanticNodesDsl.g:1461:3: ( (lv_value_3_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1462:4: (lv_value_3_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1462:4: (lv_value_3_0= ruleEString )
            // InternalSemanticNodesDsl.g:1463:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaDataAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMetaDataRule());
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
    // $ANTLR end "ruleMetaData"


    // $ANTLR start "entryRuleEString"
    // InternalSemanticNodesDsl.g:1484:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSemanticNodesDsl.g:1484:47: (iv_ruleEString= ruleEString EOF )
            // InternalSemanticNodesDsl.g:1485:2: iv_ruleEString= ruleEString EOF
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
    // InternalSemanticNodesDsl.g:1491:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1497:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSemanticNodesDsl.g:1498:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSemanticNodesDsl.g:1498:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1499:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:1507:3: this_ID_1= RULE_ID
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
    // InternalSemanticNodesDsl.g:1518:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSemanticNodesDsl.g:1518:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSemanticNodesDsl.g:1519:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSemanticNodesDsl.g:1525:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1531:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSemanticNodesDsl.g:1532:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSemanticNodesDsl.g:1532:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSemanticNodesDsl.g:1533:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSemanticNodesDsl.g:1533:3: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==24) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1534:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_24); 

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


    // $ANTLR start "entryRuleAnnotation"
    // InternalSemanticNodesDsl.g:1551:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalSemanticNodesDsl.g:1551:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalSemanticNodesDsl.g:1552:2: iv_ruleAnnotation= ruleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotation=ruleAnnotation();

            state._fsp--;

             current =iv_ruleAnnotation; 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalSemanticNodesDsl.g:1558:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_annotation_2_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1564:2: ( ( () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) ) ) )
            // InternalSemanticNodesDsl.g:1565:2: ( () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) ) )
            {
            // InternalSemanticNodesDsl.g:1565:2: ( () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) ) )
            // InternalSemanticNodesDsl.g:1566:3: () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:1566:3: ()
            // InternalSemanticNodesDsl.g:1567:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_1());
            		
            // InternalSemanticNodesDsl.g:1577:3: ( (lv_annotation_2_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1578:4: (lv_annotation_2_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1578:4: (lv_annotation_2_0= ruleEString )
            // InternalSemanticNodesDsl.g:1579:5: lv_annotation_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_annotation_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationRule());
            					}
            					set(
            						current,
            						"annotation",
            						lv_annotation_2_0,
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "ruleType"
    // InternalSemanticNodesDsl.g:1600:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1606:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalSemanticNodesDsl.g:1607:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalSemanticNodesDsl.g:1607:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt32=1;
                }
                break;
            case 27:
                {
                alt32=2;
                }
                break;
            case 28:
                {
                alt32=3;
                }
                break;
            case 29:
                {
                alt32=4;
                }
                break;
            case 30:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1608:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSemanticNodesDsl.g:1608:3: (enumLiteral_0= 'String' )
                    // InternalSemanticNodesDsl.g:1609:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:1616:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalSemanticNodesDsl.g:1616:3: (enumLiteral_1= 'Int' )
                    // InternalSemanticNodesDsl.g:1617:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:1624:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalSemanticNodesDsl.g:1624:3: (enumLiteral_2= 'Boolean' )
                    // InternalSemanticNodesDsl.g:1625:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSemanticNodesDsl.g:1632:3: (enumLiteral_3= 'Float' )
                    {
                    // InternalSemanticNodesDsl.g:1632:3: (enumLiteral_3= 'Float' )
                    // InternalSemanticNodesDsl.g:1633:4: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSemanticNodesDsl.g:1640:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalSemanticNodesDsl.g:1640:3: (enumLiteral_4= 'Double' )
                    // InternalSemanticNodesDsl.g:1641:4: enumLiteral_4= 'Double'
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


    protected DFA10 dfa10 = new DFA10(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\4\3\uffff\5\4";
    static final String dfa_3s = "\1\31\1\5\3\uffff\2\31\1\5\2\31";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3\5\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\12\uffff\1\4\1\uffff\2\3\5\uffff\1\1",
            "\1\5\1\6",
            "",
            "",
            "",
            "\2\2\14\uffff\2\3\5\uffff\1\7",
            "\2\2\14\uffff\2\3\5\uffff\1\7",
            "\1\10\1\11",
            "\2\2\14\uffff\2\3\5\uffff\1\7",
            "\2\2\14\uffff\2\3\5\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "450:2: (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode | this_Enumeration_2= ruleEnumeration )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002002030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000020D2030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001002040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000020C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000101002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000007C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});

}