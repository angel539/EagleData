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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'repository'", "'{'", "'}'", "'metadata'", "','", "'abstract'", "'node'", "'->'", "'['", "']'", "':'", "'='", "'-'", "'@'", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'"
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

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==24) ) {
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

            if ( (LA5_0==24) ) {
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

                        if ( (LA4_0==24) ) {
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

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||(LA7_0>=16 && LA7_0<=17)||LA7_0==24) ) {
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

                        if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||(LA6_0>=16 && LA6_0<=17)||LA6_0==24) ) {
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
    // InternalSemanticNodesDsl.g:443:1: ruleResourceElement returns [EObject current=null] : (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode ) ;
    public final EObject ruleResourceElement() throws RecognitionException {
        EObject current = null;

        EObject this_Resource_0 = null;

        EObject this_SemanticNode_1 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:449:2: ( (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode ) )
            // InternalSemanticNodesDsl.g:450:2: (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode )
            {
            // InternalSemanticNodesDsl.g:450:2: (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode )
            int alt10=2;
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


    // $ANTLR start "entryRuleSemanticNode"
    // InternalSemanticNodesDsl.g:472:1: entryRuleSemanticNode returns [EObject current=null] : iv_ruleSemanticNode= ruleSemanticNode EOF ;
    public final EObject entryRuleSemanticNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticNode = null;


        try {
            // InternalSemanticNodesDsl.g:472:53: (iv_ruleSemanticNode= ruleSemanticNode EOF )
            // InternalSemanticNodesDsl.g:473:2: iv_ruleSemanticNode= ruleSemanticNode EOF
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
    // InternalSemanticNodesDsl.g:479:1: ruleSemanticNode returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? ) ;
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
            // InternalSemanticNodesDsl.g:485:2: ( ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? ) )
            // InternalSemanticNodesDsl.g:486:2: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? )
            {
            // InternalSemanticNodesDsl.g:486:2: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )? )
            // InternalSemanticNodesDsl.g:487:3: () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ( (lv_abstract_3_0= 'abstract' ) )? otherlv_4= 'node' ( (lv_name_5_0= ruleEString ) ) otherlv_6= '{' ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )? otherlv_9= '}' (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )?
            {
            // InternalSemanticNodesDsl.g:487:3: ()
            // InternalSemanticNodesDsl.g:488:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSemanticNodeAccess().getSemanticNodeAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:494:3: ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSemanticNodesDsl.g:495:4: ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )*
                    {
                    // InternalSemanticNodesDsl.g:495:4: ( (lv_annotations_1_0= ruleAnnotation ) )
                    // InternalSemanticNodesDsl.g:496:5: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // InternalSemanticNodesDsl.g:496:5: (lv_annotations_1_0= ruleAnnotation )
                    // InternalSemanticNodesDsl.g:497:6: lv_annotations_1_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getAnnotationsAnnotationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalSemanticNodesDsl.g:514:4: ( (lv_annotations_2_0= ruleAnnotation ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:515:5: (lv_annotations_2_0= ruleAnnotation )
                    	    {
                    	    // InternalSemanticNodesDsl.g:515:5: (lv_annotations_2_0= ruleAnnotation )
                    	    // InternalSemanticNodesDsl.g:516:6: lv_annotations_2_0= ruleAnnotation
                    	    {

                    	    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getAnnotationsAnnotationParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:534:3: ( (lv_abstract_3_0= 'abstract' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSemanticNodesDsl.g:535:4: (lv_abstract_3_0= 'abstract' )
                    {
                    // InternalSemanticNodesDsl.g:535:4: (lv_abstract_3_0= 'abstract' )
                    // InternalSemanticNodesDsl.g:536:5: lv_abstract_3_0= 'abstract'
                    {
                    lv_abstract_3_0=(Token)match(input,16,FOLLOW_12); 

                    					newLeafNode(lv_abstract_3_0, grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSemanticNodeRule());
                    					}
                    					setWithLastConsumed(current, "abstract", true, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getSemanticNodeAccess().getNodeKeyword_3());
            		
            // InternalSemanticNodesDsl.g:552:3: ( (lv_name_5_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:553:4: (lv_name_5_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:553:4: (lv_name_5_0= ruleEString )
            // InternalSemanticNodesDsl.g:554:5: lv_name_5_0= ruleEString
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

            otherlv_6=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalSemanticNodesDsl.g:575:3: ( ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSemanticNodesDsl.g:576:4: ( (lv_properties_7_0= ruleProperty ) ) ( (lv_properties_8_0= ruleProperty ) )*
                    {
                    // InternalSemanticNodesDsl.g:576:4: ( (lv_properties_7_0= ruleProperty ) )
                    // InternalSemanticNodesDsl.g:577:5: (lv_properties_7_0= ruleProperty )
                    {
                    // InternalSemanticNodesDsl.g:577:5: (lv_properties_7_0= ruleProperty )
                    // InternalSemanticNodesDsl.g:578:6: lv_properties_7_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalSemanticNodesDsl.g:595:4: ( (lv_properties_8_0= ruleProperty ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:596:5: (lv_properties_8_0= ruleProperty )
                    	    {
                    	    // InternalSemanticNodesDsl.g:596:5: (lv_properties_8_0= ruleProperty )
                    	    // InternalSemanticNodesDsl.g:597:6: lv_properties_8_0= ruleProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
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
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalSemanticNodesDsl.g:619:3: (otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSemanticNodesDsl.g:620:4: otherlv_10= '{' ( (lv_metadata_11_0= ruleMetaData ) ) (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )* otherlv_14= '}'
                    {
                    otherlv_10=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_8_0());
                    			
                    // InternalSemanticNodesDsl.g:624:4: ( (lv_metadata_11_0= ruleMetaData ) )
                    // InternalSemanticNodesDsl.g:625:5: (lv_metadata_11_0= ruleMetaData )
                    {
                    // InternalSemanticNodesDsl.g:625:5: (lv_metadata_11_0= ruleMetaData )
                    // InternalSemanticNodesDsl.g:626:6: lv_metadata_11_0= ruleMetaData
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

                    // InternalSemanticNodesDsl.g:643:4: (otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:644:5: otherlv_12= ',' ( (lv_metadata_13_0= ruleMetaData ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getSemanticNodeAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:648:5: ( (lv_metadata_13_0= ruleMetaData ) )
                    	    // InternalSemanticNodesDsl.g:649:6: (lv_metadata_13_0= ruleMetaData )
                    	    {
                    	    // InternalSemanticNodesDsl.g:649:6: (lv_metadata_13_0= ruleMetaData )
                    	    // InternalSemanticNodesDsl.g:650:7: lv_metadata_13_0= ruleMetaData
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
                    	    break loop16;
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
    // InternalSemanticNodesDsl.g:677:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalSemanticNodesDsl.g:677:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalSemanticNodesDsl.g:678:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalSemanticNodesDsl.g:684:1: ruleProperty returns [EObject current=null] : (this_ObjectProperty_0= ruleObjectProperty | this_DataProperty_1= ruleDataProperty ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_ObjectProperty_0 = null;

        EObject this_DataProperty_1 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:690:2: ( (this_ObjectProperty_0= ruleObjectProperty | this_DataProperty_1= ruleDataProperty ) )
            // InternalSemanticNodesDsl.g:691:2: (this_ObjectProperty_0= ruleObjectProperty | this_DataProperty_1= ruleDataProperty )
            {
            // InternalSemanticNodesDsl.g:691:2: (this_ObjectProperty_0= ruleObjectProperty | this_DataProperty_1= ruleDataProperty )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==18) ) {
                    alt18=1;
                }
                else if ( (LA18_1==21) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0==RULE_ID) ) {
                int LA18_2 = input.LA(2);

                if ( (LA18_2==18) ) {
                    alt18=1;
                }
                else if ( (LA18_2==21) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 2, input);

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
                    // InternalSemanticNodesDsl.g:692:3: this_ObjectProperty_0= ruleObjectProperty
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
                    // InternalSemanticNodesDsl.g:701:3: this_DataProperty_1= ruleDataProperty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getDataPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataProperty_1=ruleDataProperty();

                    state._fsp--;


                    			current = this_DataProperty_1;
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
    // InternalSemanticNodesDsl.g:713:1: entryRuleObjectProperty returns [EObject current=null] : iv_ruleObjectProperty= ruleObjectProperty EOF ;
    public final EObject entryRuleObjectProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectProperty = null;


        try {
            // InternalSemanticNodesDsl.g:713:55: (iv_ruleObjectProperty= ruleObjectProperty EOF )
            // InternalSemanticNodesDsl.g:714:2: iv_ruleObjectProperty= ruleObjectProperty EOF
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
    // InternalSemanticNodesDsl.g:720:1: ruleObjectProperty returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) ;
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
            // InternalSemanticNodesDsl.g:726:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) )
            // InternalSemanticNodesDsl.g:727:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            {
            // InternalSemanticNodesDsl.g:727:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            // InternalSemanticNodesDsl.g:728:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= '->' ( ( ruleEString ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            {
            // InternalSemanticNodesDsl.g:728:3: ()
            // InternalSemanticNodesDsl.g:729:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getObjectPropertyAccess().getObjectPropertyAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:735:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:736:4: (lv_name_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:736:4: (lv_name_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:737:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getObjectPropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getObjectPropertyAccess().getHyphenMinusGreaterThanSignKeyword_2());
            		
            // InternalSemanticNodesDsl.g:758:3: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:759:4: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:759:4: ( ruleEString )
            // InternalSemanticNodesDsl.g:760:5: ruleEString
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

            // InternalSemanticNodesDsl.g:774:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSemanticNodesDsl.g:775:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getObjectPropertyAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalSemanticNodesDsl.g:779:4: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:780:5: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:780:5: (lv_lowerBound_5_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:781:6: lv_lowerBound_5_0= ruleEInt
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

                    otherlv_6=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getObjectPropertyAccess().getCommaKeyword_4_2());
                    			
                    // InternalSemanticNodesDsl.g:802:4: ( (lv_upperBound_7_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:803:5: (lv_upperBound_7_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:803:5: (lv_upperBound_7_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:804:6: lv_upperBound_7_0= ruleEInt
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

                    otherlv_8=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getObjectPropertyAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:826:3: (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSemanticNodesDsl.g:827:4: otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getObjectPropertyAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalSemanticNodesDsl.g:831:4: ( (lv_metadata_10_0= ruleMetaData ) )
                    // InternalSemanticNodesDsl.g:832:5: (lv_metadata_10_0= ruleMetaData )
                    {
                    // InternalSemanticNodesDsl.g:832:5: (lv_metadata_10_0= ruleMetaData )
                    // InternalSemanticNodesDsl.g:833:6: lv_metadata_10_0= ruleMetaData
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

                    // InternalSemanticNodesDsl.g:850:4: (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:851:5: otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getObjectPropertyAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:855:5: ( (lv_metadata_12_0= ruleMetaData ) )
                    	    // InternalSemanticNodesDsl.g:856:6: (lv_metadata_12_0= ruleMetaData )
                    	    {
                    	    // InternalSemanticNodesDsl.g:856:6: (lv_metadata_12_0= ruleMetaData )
                    	    // InternalSemanticNodesDsl.g:857:7: lv_metadata_12_0= ruleMetaData
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
                    	    break loop20;
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


    // $ANTLR start "entryRuleDataProperty"
    // InternalSemanticNodesDsl.g:884:1: entryRuleDataProperty returns [EObject current=null] : iv_ruleDataProperty= ruleDataProperty EOF ;
    public final EObject entryRuleDataProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataProperty = null;


        try {
            // InternalSemanticNodesDsl.g:884:53: (iv_ruleDataProperty= ruleDataProperty EOF )
            // InternalSemanticNodesDsl.g:885:2: iv_ruleDataProperty= ruleDataProperty EOF
            {
             newCompositeNode(grammarAccess.getDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataProperty=ruleDataProperty();

            state._fsp--;

             current =iv_ruleDataProperty; 
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
    // $ANTLR end "entryRuleDataProperty"


    // $ANTLR start "ruleDataProperty"
    // InternalSemanticNodesDsl.g:891:1: ruleDataProperty returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleDataProperty() throws RecognitionException {
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
            // InternalSemanticNodesDsl.g:897:2: ( ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? ) )
            // InternalSemanticNodesDsl.g:898:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            {
            // InternalSemanticNodesDsl.g:898:2: ( () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )? )
            // InternalSemanticNodesDsl.g:899:3: () ( (lv_name_1_0= ruleEString ) ) (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )? (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            {
            // InternalSemanticNodesDsl.g:899:3: ()
            // InternalSemanticNodesDsl.g:900:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataPropertyAccess().getDataPropertyAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:906:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:907:4: (lv_name_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:907:4: (lv_name_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:908:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDataPropertyAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSemanticNodesDsl.g:925:3: (otherlv_2= ':' ( (lv_type_3_0= ruleType ) ) )
            // InternalSemanticNodesDsl.g:926:4: otherlv_2= ':' ( (lv_type_3_0= ruleType ) )
            {
            otherlv_2=(Token)match(input,21,FOLLOW_21); 

            				newLeafNode(otherlv_2, grammarAccess.getDataPropertyAccess().getColonKeyword_2_0());
            			
            // InternalSemanticNodesDsl.g:930:4: ( (lv_type_3_0= ruleType ) )
            // InternalSemanticNodesDsl.g:931:5: (lv_type_3_0= ruleType )
            {
            // InternalSemanticNodesDsl.g:931:5: (lv_type_3_0= ruleType )
            // InternalSemanticNodesDsl.g:932:6: lv_type_3_0= ruleType
            {

            						newCompositeNode(grammarAccess.getDataPropertyAccess().getTypeTypeEnumRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_16);
            lv_type_3_0=ruleType();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDataPropertyRule());
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

            // InternalSemanticNodesDsl.g:950:3: (otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSemanticNodesDsl.g:951:4: otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= ',' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataPropertyAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalSemanticNodesDsl.g:955:4: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:956:5: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:956:5: (lv_lowerBound_5_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:957:6: lv_lowerBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_lowerBound_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataPropertyRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_5_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getDataPropertyAccess().getCommaKeyword_3_2());
                    			
                    // InternalSemanticNodesDsl.g:978:4: ( (lv_upperBound_7_0= ruleEInt ) )
                    // InternalSemanticNodesDsl.g:979:5: (lv_upperBound_7_0= ruleEInt )
                    {
                    // InternalSemanticNodesDsl.g:979:5: (lv_upperBound_7_0= ruleEInt )
                    // InternalSemanticNodesDsl.g:980:6: lv_upperBound_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_upperBound_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataPropertyRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataPropertyAccess().getRightSquareBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalSemanticNodesDsl.g:1002:3: (otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==12) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1003:4: otherlv_9= '{' ( (lv_metadata_10_0= ruleMetaData ) ) (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )* otherlv_13= '}'
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getDataPropertyAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalSemanticNodesDsl.g:1007:4: ( (lv_metadata_10_0= ruleMetaData ) )
                    // InternalSemanticNodesDsl.g:1008:5: (lv_metadata_10_0= ruleMetaData )
                    {
                    // InternalSemanticNodesDsl.g:1008:5: (lv_metadata_10_0= ruleMetaData )
                    // InternalSemanticNodesDsl.g:1009:6: lv_metadata_10_0= ruleMetaData
                    {

                    						newCompositeNode(grammarAccess.getDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_metadata_10_0=ruleMetaData();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataPropertyRule());
                    						}
                    						add(
                    							current,
                    							"metadata",
                    							lv_metadata_10_0,
                    							"uam.eagledata.dsl.semanticnodes.SemanticNodesDsl.MetaData");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSemanticNodesDsl.g:1026:4: (otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==15) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalSemanticNodesDsl.g:1027:5: otherlv_11= ',' ( (lv_metadata_12_0= ruleMetaData ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getDataPropertyAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalSemanticNodesDsl.g:1031:5: ( (lv_metadata_12_0= ruleMetaData ) )
                    	    // InternalSemanticNodesDsl.g:1032:6: (lv_metadata_12_0= ruleMetaData )
                    	    {
                    	    // InternalSemanticNodesDsl.g:1032:6: (lv_metadata_12_0= ruleMetaData )
                    	    // InternalSemanticNodesDsl.g:1033:7: lv_metadata_12_0= ruleMetaData
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_metadata_12_0=ruleMetaData();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataPropertyRule());
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getDataPropertyAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleDataProperty"


    // $ANTLR start "entryRuleMetaData"
    // InternalSemanticNodesDsl.g:1060:1: entryRuleMetaData returns [EObject current=null] : iv_ruleMetaData= ruleMetaData EOF ;
    public final EObject entryRuleMetaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaData = null;


        try {
            // InternalSemanticNodesDsl.g:1060:49: (iv_ruleMetaData= ruleMetaData EOF )
            // InternalSemanticNodesDsl.g:1061:2: iv_ruleMetaData= ruleMetaData EOF
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
    // InternalSemanticNodesDsl.g:1067:1: ruleMetaData returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) ;
    public final EObject ruleMetaData() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_key_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1073:2: ( ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) ) )
            // InternalSemanticNodesDsl.g:1074:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            {
            // InternalSemanticNodesDsl.g:1074:2: ( () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )
            // InternalSemanticNodesDsl.g:1075:3: () ( (lv_key_1_0= ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:1075:3: ()
            // InternalSemanticNodesDsl.g:1076:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMetaDataAccess().getMetaDataAction_0(),
            					current);
            			

            }

            // InternalSemanticNodesDsl.g:1082:3: ( (lv_key_1_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1083:4: (lv_key_1_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1083:4: (lv_key_1_0= ruleEString )
            // InternalSemanticNodesDsl.g:1084:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMetaDataAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_2=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMetaDataAccess().getEqualsSignKeyword_2());
            		
            // InternalSemanticNodesDsl.g:1105:3: ( (lv_value_3_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1106:4: (lv_value_3_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1106:4: (lv_value_3_0= ruleEString )
            // InternalSemanticNodesDsl.g:1107:5: lv_value_3_0= ruleEString
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
    // InternalSemanticNodesDsl.g:1128:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSemanticNodesDsl.g:1128:47: (iv_ruleEString= ruleEString EOF )
            // InternalSemanticNodesDsl.g:1129:2: iv_ruleEString= ruleEString EOF
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
    // InternalSemanticNodesDsl.g:1135:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1141:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSemanticNodesDsl.g:1142:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSemanticNodesDsl.g:1142:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_ID) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1143:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:1151:3: this_ID_1= RULE_ID
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
    // InternalSemanticNodesDsl.g:1162:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSemanticNodesDsl.g:1162:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSemanticNodesDsl.g:1163:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalSemanticNodesDsl.g:1169:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1175:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalSemanticNodesDsl.g:1176:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalSemanticNodesDsl.g:1176:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalSemanticNodesDsl.g:1177:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalSemanticNodesDsl.g:1177:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==23) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1178:4: kw= '-'
                    {
                    kw=(Token)match(input,23,FOLLOW_23); 

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
    // InternalSemanticNodesDsl.g:1195:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalSemanticNodesDsl.g:1195:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalSemanticNodesDsl.g:1196:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalSemanticNodesDsl.g:1202:1: ruleAnnotation returns [EObject current=null] : ( () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) ) ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_annotation_2_0 = null;



        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1208:2: ( ( () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) ) ) )
            // InternalSemanticNodesDsl.g:1209:2: ( () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) ) )
            {
            // InternalSemanticNodesDsl.g:1209:2: ( () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) ) )
            // InternalSemanticNodesDsl.g:1210:3: () otherlv_1= '@' ( (lv_annotation_2_0= ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:1210:3: ()
            // InternalSemanticNodesDsl.g:1211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnnotationAccess().getAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationAccess().getCommercialAtKeyword_1());
            		
            // InternalSemanticNodesDsl.g:1221:3: ( (lv_annotation_2_0= ruleEString ) )
            // InternalSemanticNodesDsl.g:1222:4: (lv_annotation_2_0= ruleEString )
            {
            // InternalSemanticNodesDsl.g:1222:4: (lv_annotation_2_0= ruleEString )
            // InternalSemanticNodesDsl.g:1223:5: lv_annotation_2_0= ruleEString
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
    // InternalSemanticNodesDsl.g:1244:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalSemanticNodesDsl.g:1250:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) ) )
            // InternalSemanticNodesDsl.g:1251:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            {
            // InternalSemanticNodesDsl.g:1251:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Int' ) | (enumLiteral_2= 'Boolean' ) | (enumLiteral_3= 'Float' ) | (enumLiteral_4= 'Double' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt27=1;
                }
                break;
            case 26:
                {
                alt27=2;
                }
                break;
            case 27:
                {
                alt27=3;
                }
                break;
            case 28:
                {
                alt27=4;
                }
                break;
            case 29:
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
                    // InternalSemanticNodesDsl.g:1252:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSemanticNodesDsl.g:1252:3: (enumLiteral_0= 'String' )
                    // InternalSemanticNodesDsl.g:1253:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:1260:3: (enumLiteral_1= 'Int' )
                    {
                    // InternalSemanticNodesDsl.g:1260:3: (enumLiteral_1= 'Int' )
                    // InternalSemanticNodesDsl.g:1261:4: enumLiteral_1= 'Int'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:1268:3: (enumLiteral_2= 'Boolean' )
                    {
                    // InternalSemanticNodesDsl.g:1268:3: (enumLiteral_2= 'Boolean' )
                    // InternalSemanticNodesDsl.g:1269:4: enumLiteral_2= 'Boolean'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSemanticNodesDsl.g:1276:3: (enumLiteral_3= 'Float' )
                    {
                    // InternalSemanticNodesDsl.g:1276:3: (enumLiteral_3= 'Float' )
                    // InternalSemanticNodesDsl.g:1277:4: enumLiteral_3= 'Float'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalSemanticNodesDsl.g:1284:3: (enumLiteral_4= 'Double' )
                    {
                    // InternalSemanticNodesDsl.g:1284:3: (enumLiteral_4= 'Double' )
                    // InternalSemanticNodesDsl.g:1285:4: enumLiteral_4= 'Double'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); 

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
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\2\4\2\uffff\5\4";
    static final String dfa_3s = "\1\30\1\5\2\uffff\2\30\1\5\2\30";
    static final String dfa_4s = "\2\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\12\uffff\2\3\6\uffff\1\1",
            "\1\4\1\5",
            "",
            "",
            "\2\2\12\uffff\2\3\6\uffff\1\6",
            "\2\2\12\uffff\2\3\6\uffff\1\6",
            "\1\7\1\10",
            "\2\2\12\uffff\2\3\6\uffff\1\6",
            "\2\2\12\uffff\2\3\6\uffff\1\6"
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
            return "450:2: (this_Resource_0= ruleResource | this_SemanticNode_1= ruleSemanticNode )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001002030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001032030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000081002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});

}