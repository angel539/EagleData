package uam.eagledata.dsl.annotations.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uam.eagledata.dsl.annotations.services.AnnotationsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAnnotationsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@'", "'<'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalAnnotationsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAnnotationsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAnnotationsDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAnnotationsDsl.g"; }



     	private AnnotationsDslGrammarAccess grammarAccess;

        public InternalAnnotationsDslParser(TokenStream input, AnnotationsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RepositoryManager";
       	}

       	@Override
       	protected AnnotationsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRepositoryManager"
    // InternalAnnotationsDsl.g:64:1: entryRuleRepositoryManager returns [EObject current=null] : iv_ruleRepositoryManager= ruleRepositoryManager EOF ;
    public final EObject entryRuleRepositoryManager() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepositoryManager = null;


        try {
            // InternalAnnotationsDsl.g:64:58: (iv_ruleRepositoryManager= ruleRepositoryManager EOF )
            // InternalAnnotationsDsl.g:65:2: iv_ruleRepositoryManager= ruleRepositoryManager EOF
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
    // InternalAnnotationsDsl.g:71:1: ruleRepositoryManager returns [EObject current=null] : ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ) ;
    public final EObject ruleRepositoryManager() throws RecognitionException {
        EObject current = null;

        EObject lv_annotations_1_0 = null;

        EObject lv_annotations_2_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsDsl.g:77:2: ( ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? ) )
            // InternalAnnotationsDsl.g:78:2: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? )
            {
            // InternalAnnotationsDsl.g:78:2: ( () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )? )
            // InternalAnnotationsDsl.g:79:3: () ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )?
            {
            // InternalAnnotationsDsl.g:79:3: ()
            // InternalAnnotationsDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0(),
            					current);
            			

            }

            // InternalAnnotationsDsl.g:86:3: ( ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalAnnotationsDsl.g:87:4: ( (lv_annotations_1_0= ruleAnnotation ) ) ( (lv_annotations_2_0= ruleAnnotation ) )*
                    {
                    // InternalAnnotationsDsl.g:87:4: ( (lv_annotations_1_0= ruleAnnotation ) )
                    // InternalAnnotationsDsl.g:88:5: (lv_annotations_1_0= ruleAnnotation )
                    {
                    // InternalAnnotationsDsl.g:88:5: (lv_annotations_1_0= ruleAnnotation )
                    // InternalAnnotationsDsl.g:89:6: lv_annotations_1_0= ruleAnnotation
                    {

                    						newCompositeNode(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_annotations_1_0=ruleAnnotation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRepositoryManagerRule());
                    						}
                    						add(
                    							current,
                    							"annotations",
                    							lv_annotations_1_0,
                    							"uam.eagledata.dsl.annotations.AnnotationsDsl.Annotation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAnnotationsDsl.g:106:4: ( (lv_annotations_2_0= ruleAnnotation ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==11) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalAnnotationsDsl.g:107:5: (lv_annotations_2_0= ruleAnnotation )
                    	    {
                    	    // InternalAnnotationsDsl.g:107:5: (lv_annotations_2_0= ruleAnnotation )
                    	    // InternalAnnotationsDsl.g:108:6: lv_annotations_2_0= ruleAnnotation
                    	    {

                    	    						newCompositeNode(grammarAccess.getRepositoryManagerAccess().getAnnotationsAnnotationParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_annotations_2_0=ruleAnnotation();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRepositoryManagerRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"annotations",
                    	    							lv_annotations_2_0,
                    	    							"uam.eagledata.dsl.annotations.AnnotationsDsl.Annotation");
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


    // $ANTLR start "entryRuleAnnotation"
    // InternalAnnotationsDsl.g:130:1: entryRuleAnnotation returns [EObject current=null] : iv_ruleAnnotation= ruleAnnotation EOF ;
    public final EObject entryRuleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotation = null;


        try {
            // InternalAnnotationsDsl.g:130:51: (iv_ruleAnnotation= ruleAnnotation EOF )
            // InternalAnnotationsDsl.g:131:2: iv_ruleAnnotation= ruleAnnotation EOF
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
    // InternalAnnotationsDsl.g:137:1: ruleAnnotation returns [EObject current=null] : (this_SimpleAnnotation_0= ruleSimpleAnnotation | this_AnnotationHierarchy_1= ruleAnnotationHierarchy | this_AnnotationInstance_2= ruleAnnotationInstance ) ;
    public final EObject ruleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAnnotation_0 = null;

        EObject this_AnnotationHierarchy_1 = null;

        EObject this_AnnotationInstance_2 = null;



        	enterRule();

        try {
            // InternalAnnotationsDsl.g:143:2: ( (this_SimpleAnnotation_0= ruleSimpleAnnotation | this_AnnotationHierarchy_1= ruleAnnotationHierarchy | this_AnnotationInstance_2= ruleAnnotationInstance ) )
            // InternalAnnotationsDsl.g:144:2: (this_SimpleAnnotation_0= ruleSimpleAnnotation | this_AnnotationHierarchy_1= ruleAnnotationHierarchy | this_AnnotationInstance_2= ruleAnnotationInstance )
            {
            // InternalAnnotationsDsl.g:144:2: (this_SimpleAnnotation_0= ruleSimpleAnnotation | this_AnnotationHierarchy_1= ruleAnnotationHierarchy | this_AnnotationInstance_2= ruleAnnotationInstance )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    switch ( input.LA(3) ) {
                    case EOF:
                    case 11:
                        {
                        alt3=1;
                        }
                        break;
                    case 13:
                        {
                        alt3=3;
                        }
                        break;
                    case 12:
                        {
                        alt3=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

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
                    // InternalAnnotationsDsl.g:145:3: this_SimpleAnnotation_0= ruleSimpleAnnotation
                    {

                    			newCompositeNode(grammarAccess.getAnnotationAccess().getSimpleAnnotationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleAnnotation_0=ruleSimpleAnnotation();

                    state._fsp--;


                    			current = this_SimpleAnnotation_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAnnotationsDsl.g:154:3: this_AnnotationHierarchy_1= ruleAnnotationHierarchy
                    {

                    			newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationHierarchyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotationHierarchy_1=ruleAnnotationHierarchy();

                    state._fsp--;


                    			current = this_AnnotationHierarchy_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAnnotationsDsl.g:163:3: this_AnnotationInstance_2= ruleAnnotationInstance
                    {

                    			newCompositeNode(grammarAccess.getAnnotationAccess().getAnnotationInstanceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AnnotationInstance_2=ruleAnnotationInstance();

                    state._fsp--;


                    			current = this_AnnotationInstance_2;
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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleSimpleAnnotation"
    // InternalAnnotationsDsl.g:175:1: entryRuleSimpleAnnotation returns [EObject current=null] : iv_ruleSimpleAnnotation= ruleSimpleAnnotation EOF ;
    public final EObject entryRuleSimpleAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAnnotation = null;


        try {
            // InternalAnnotationsDsl.g:175:57: (iv_ruleSimpleAnnotation= ruleSimpleAnnotation EOF )
            // InternalAnnotationsDsl.g:176:2: iv_ruleSimpleAnnotation= ruleSimpleAnnotation EOF
            {
             newCompositeNode(grammarAccess.getSimpleAnnotationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleAnnotation=ruleSimpleAnnotation();

            state._fsp--;

             current =iv_ruleSimpleAnnotation; 
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
    // $ANTLR end "entryRuleSimpleAnnotation"


    // $ANTLR start "ruleSimpleAnnotation"
    // InternalAnnotationsDsl.g:182:1: ruleSimpleAnnotation returns [EObject current=null] : ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) ) ;
    public final EObject ruleSimpleAnnotation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsDsl.g:188:2: ( ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) ) )
            // InternalAnnotationsDsl.g:189:2: ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) )
            {
            // InternalAnnotationsDsl.g:189:2: ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) )
            // InternalAnnotationsDsl.g:190:3: () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) )
            {
            // InternalAnnotationsDsl.g:190:3: ()
            // InternalAnnotationsDsl.g:191:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleAnnotationAccess().getAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSimpleAnnotationAccess().getCommercialAtKeyword_1());
            		
            // InternalAnnotationsDsl.g:201:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:202:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAnnotationsDsl.g:202:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAnnotationsDsl.g:203:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getSimpleAnnotationAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleAnnotationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.eagledata.dsl.annotations.AnnotationsDsl.QualifiedName");
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
    // $ANTLR end "ruleSimpleAnnotation"


    // $ANTLR start "entryRuleAnnotationHierarchy"
    // InternalAnnotationsDsl.g:224:1: entryRuleAnnotationHierarchy returns [EObject current=null] : iv_ruleAnnotationHierarchy= ruleAnnotationHierarchy EOF ;
    public final EObject entryRuleAnnotationHierarchy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationHierarchy = null;


        try {
            // InternalAnnotationsDsl.g:224:60: (iv_ruleAnnotationHierarchy= ruleAnnotationHierarchy EOF )
            // InternalAnnotationsDsl.g:225:2: iv_ruleAnnotationHierarchy= ruleAnnotationHierarchy EOF
            {
             newCompositeNode(grammarAccess.getAnnotationHierarchyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationHierarchy=ruleAnnotationHierarchy();

            state._fsp--;

             current =iv_ruleAnnotationHierarchy; 
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
    // $ANTLR end "entryRuleAnnotationHierarchy"


    // $ANTLR start "ruleAnnotationHierarchy"
    // InternalAnnotationsDsl.g:231:1: ruleAnnotationHierarchy returns [EObject current=null] : ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= '<' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* ) ) ;
    public final EObject ruleAnnotationHierarchy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsDsl.g:237:2: ( ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= '<' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* ) ) )
            // InternalAnnotationsDsl.g:238:2: ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= '<' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* ) )
            {
            // InternalAnnotationsDsl.g:238:2: ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= '<' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* ) )
            // InternalAnnotationsDsl.g:239:3: () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= '<' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= '<' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalAnnotationsDsl.g:239:3: ()
            // InternalAnnotationsDsl.g:240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnnotationHierarchyAccess().getAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_1());
            		
            // InternalAnnotationsDsl.g:250:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:251:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAnnotationsDsl.g:251:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAnnotationsDsl.g:252:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAnnotationHierarchyAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationHierarchyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.eagledata.dsl.annotations.AnnotationsDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnnotationsDsl.g:269:3: (otherlv_3= '<' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= '<' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* )
            // InternalAnnotationsDsl.g:270:4: otherlv_3= '<' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= '<' otherlv_7= '@' ( ( ruleQualifiedName ) ) )*
            {
            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_0());
            			
            otherlv_4=(Token)match(input,11,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_3_1());
            			
            // InternalAnnotationsDsl.g:278:4: ( ( ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:279:5: ( ruleQualifiedName )
            {
            // InternalAnnotationsDsl.g:279:5: ( ruleQualifiedName )
            // InternalAnnotationsDsl.g:280:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAnnotationHierarchyRule());
            						}
            					

            						newCompositeNode(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_2_0());
            					
            pushFollow(FOLLOW_7);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalAnnotationsDsl.g:294:4: (otherlv_6= '<' otherlv_7= '@' ( ( ruleQualifiedName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAnnotationsDsl.g:295:5: otherlv_6= '<' otherlv_7= '@' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,12,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getAnnotationHierarchyAccess().getLessThanSignKeyword_3_3_0());
            	    				
            	    otherlv_7=(Token)match(input,11,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getAnnotationHierarchyAccess().getCommercialAtKeyword_3_3_1());
            	    				
            	    // InternalAnnotationsDsl.g:303:5: ( ( ruleQualifiedName ) )
            	    // InternalAnnotationsDsl.g:304:6: ( ruleQualifiedName )
            	    {
            	    // InternalAnnotationsDsl.g:304:6: ( ruleQualifiedName )
            	    // InternalAnnotationsDsl.g:305:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getAnnotationHierarchyRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getAnnotationHierarchyAccess().getSupersAnnotationCrossReference_3_3_2_0());
            	    						
            	    pushFollow(FOLLOW_7);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


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
    // $ANTLR end "ruleAnnotationHierarchy"


    // $ANTLR start "entryRuleAnnotationInstance"
    // InternalAnnotationsDsl.g:325:1: entryRuleAnnotationInstance returns [EObject current=null] : iv_ruleAnnotationInstance= ruleAnnotationInstance EOF ;
    public final EObject entryRuleAnnotationInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnnotationInstance = null;


        try {
            // InternalAnnotationsDsl.g:325:59: (iv_ruleAnnotationInstance= ruleAnnotationInstance EOF )
            // InternalAnnotationsDsl.g:326:2: iv_ruleAnnotationInstance= ruleAnnotationInstance EOF
            {
             newCompositeNode(grammarAccess.getAnnotationInstanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnnotationInstance=ruleAnnotationInstance();

            state._fsp--;

             current =iv_ruleAnnotationInstance; 
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
    // $ANTLR end "entryRuleAnnotationInstance"


    // $ANTLR start "ruleAnnotationInstance"
    // InternalAnnotationsDsl.g:332:1: ruleAnnotationInstance returns [EObject current=null] : ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= ':' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= ':' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* ) ) ;
    public final EObject ruleAnnotationInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAnnotationsDsl.g:338:2: ( ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= ':' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= ':' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* ) ) )
            // InternalAnnotationsDsl.g:339:2: ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= ':' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= ':' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* ) )
            {
            // InternalAnnotationsDsl.g:339:2: ( () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= ':' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= ':' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* ) )
            // InternalAnnotationsDsl.g:340:3: () otherlv_1= '@' ( (lv_name_2_0= ruleQualifiedName ) ) (otherlv_3= ':' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= ':' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* )
            {
            // InternalAnnotationsDsl.g:340:3: ()
            // InternalAnnotationsDsl.g:341:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAnnotationInstanceAccess().getAnnotationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_1());
            		
            // InternalAnnotationsDsl.g:351:3: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:352:4: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalAnnotationsDsl.g:352:4: (lv_name_2_0= ruleQualifiedName )
            // InternalAnnotationsDsl.g:353:5: lv_name_2_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getAnnotationInstanceAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAnnotationInstanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"uam.eagledata.dsl.annotations.AnnotationsDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAnnotationsDsl.g:370:3: (otherlv_3= ':' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= ':' otherlv_7= '@' ( ( ruleQualifiedName ) ) )* )
            // InternalAnnotationsDsl.g:371:4: otherlv_3= ':' otherlv_4= '@' ( ( ruleQualifiedName ) ) (otherlv_6= ':' otherlv_7= '@' ( ( ruleQualifiedName ) ) )*
            {
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            				newLeafNode(otherlv_3, grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_0());
            			
            otherlv_4=(Token)match(input,11,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_3_1());
            			
            // InternalAnnotationsDsl.g:379:4: ( ( ruleQualifiedName ) )
            // InternalAnnotationsDsl.g:380:5: ( ruleQualifiedName )
            {
            // InternalAnnotationsDsl.g:380:5: ( ruleQualifiedName )
            // InternalAnnotationsDsl.g:381:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getAnnotationInstanceRule());
            						}
            					

            						newCompositeNode(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_2_0());
            					
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalAnnotationsDsl.g:395:4: (otherlv_6= ':' otherlv_7= '@' ( ( ruleQualifiedName ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAnnotationsDsl.g:396:5: otherlv_6= ':' otherlv_7= '@' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,13,FOLLOW_6); 

            	    					newLeafNode(otherlv_6, grammarAccess.getAnnotationInstanceAccess().getColonKeyword_3_3_0());
            	    				
            	    otherlv_7=(Token)match(input,11,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getAnnotationInstanceAccess().getCommercialAtKeyword_3_3_1());
            	    				
            	    // InternalAnnotationsDsl.g:404:5: ( ( ruleQualifiedName ) )
            	    // InternalAnnotationsDsl.g:405:6: ( ruleQualifiedName )
            	    {
            	    // InternalAnnotationsDsl.g:405:6: ( ruleQualifiedName )
            	    // InternalAnnotationsDsl.g:406:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getAnnotationInstanceRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getAnnotationInstanceAccess().getDescriptorsAnnotationCrossReference_3_3_2_0());
            	    						
            	    pushFollow(FOLLOW_9);
            	    ruleQualifiedName();

            	    state._fsp--;


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
    // $ANTLR end "ruleAnnotationInstance"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAnnotationsDsl.g:426:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalAnnotationsDsl.g:426:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalAnnotationsDsl.g:427:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalAnnotationsDsl.g:433:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalAnnotationsDsl.g:439:2: (this_ID_0= RULE_ID )
            // InternalAnnotationsDsl.g:440:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall());
            	

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002002L});

}