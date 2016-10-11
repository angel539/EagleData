package eagledata.core.dsl.ruledetection.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eagledata.core.dsl.ruledetection.services.RuleDetectionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDetectionDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SELECTOPERATOR", "RULE_SETOPERATOR", "RULE_LOGICALOPERATOR", "RULE_INT", "RULE_STRING", "RULE_DOUBLE", "RULE_OPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'{'", "'on'", "'do'", "'}'", "':'", "'*'", "'select'", "','", "'where'", "'@'", "'('", "')'", "'compose'", "'to'"
    };
    public static final int RULE_SELECTOPERATOR=5;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_DOUBLE=10;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_LOGICALOPERATOR=7;
    public static final int T__31=31;
    public static final int RULE_OPERATOR=11;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SETOPERATOR=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRuleDetectionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRuleDetectionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRuleDetectionDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRuleDetectionDsl.g"; }



     	private RuleDetectionDslGrammarAccess grammarAccess;

        public InternalRuleDetectionDslParser(TokenStream input, RuleDetectionDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RuleModel";
       	}

       	@Override
       	protected RuleDetectionDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRuleModel"
    // InternalRuleDetectionDsl.g:64:1: entryRuleRuleModel returns [EObject current=null] : iv_ruleRuleModel= ruleRuleModel EOF ;
    public final EObject entryRuleRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleModel = null;


        try {
            // InternalRuleDetectionDsl.g:64:50: (iv_ruleRuleModel= ruleRuleModel EOF )
            // InternalRuleDetectionDsl.g:65:2: iv_ruleRuleModel= ruleRuleModel EOF
            {
             newCompositeNode(grammarAccess.getRuleModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleModel=ruleRuleModel();

            state._fsp--;

             current =iv_ruleRuleModel; 
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
    // $ANTLR end "entryRuleRuleModel"


    // $ANTLR start "ruleRuleModel"
    // InternalRuleDetectionDsl.g:71:1: ruleRuleModel returns [EObject current=null] : ( ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRuleElement ) )* )? ) ;
    public final EObject ruleRuleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:77:2: ( ( ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRuleElement ) )* )? ) )
            // InternalRuleDetectionDsl.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRuleElement ) )* )? )
            {
            // InternalRuleDetectionDsl.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRuleElement ) )* )? )
            // InternalRuleDetectionDsl.g:79:3: ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRuleElement ) )* )?
            {
            // InternalRuleDetectionDsl.g:79:3: ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRuleDetectionDsl.g:80:4: ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )*
                    {
                    // InternalRuleDetectionDsl.g:80:4: ( (lv_imports_0_0= ruleImport ) )
                    // InternalRuleDetectionDsl.g:81:5: (lv_imports_0_0= ruleImport )
                    {
                    // InternalRuleDetectionDsl.g:81:5: (lv_imports_0_0= ruleImport )
                    // InternalRuleDetectionDsl.g:82:6: lv_imports_0_0= ruleImport
                    {

                    						newCompositeNode(grammarAccess.getRuleModelAccess().getImportsImportParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_imports_0_0=ruleImport();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleModelRule());
                    						}
                    						add(
                    							current,
                    							"imports",
                    							lv_imports_0_0,
                    							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRuleDetectionDsl.g:99:4: ( (lv_imports_1_0= ruleImport ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==16) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRuleDetectionDsl.g:100:5: (lv_imports_1_0= ruleImport )
                    	    {
                    	    // InternalRuleDetectionDsl.g:100:5: (lv_imports_1_0= ruleImport )
                    	    // InternalRuleDetectionDsl.g:101:6: lv_imports_1_0= ruleImport
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleModelAccess().getImportsImportParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_3);
                    	    lv_imports_1_0=ruleImport();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"imports",
                    	    							lv_imports_1_0,
                    	    							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.Import");
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

            // InternalRuleDetectionDsl.g:119:3: ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRuleElement ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRuleDetectionDsl.g:120:4: ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRuleElement ) )*
                    {
                    // InternalRuleDetectionDsl.g:120:4: ( (lv_elements_2_0= ruleRule ) )
                    // InternalRuleDetectionDsl.g:121:5: (lv_elements_2_0= ruleRule )
                    {
                    // InternalRuleDetectionDsl.g:121:5: (lv_elements_2_0= ruleRule )
                    // InternalRuleDetectionDsl.g:122:6: lv_elements_2_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getRuleModelAccess().getElementsRuleParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_elements_2_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleModelRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_2_0,
                    							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRuleDetectionDsl.g:139:4: ( (lv_elements_3_0= ruleRuleElement ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRuleDetectionDsl.g:140:5: (lv_elements_3_0= ruleRuleElement )
                    	    {
                    	    // InternalRuleDetectionDsl.g:140:5: (lv_elements_3_0= ruleRuleElement )
                    	    // InternalRuleDetectionDsl.g:141:6: lv_elements_3_0= ruleRuleElement
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleModelAccess().getElementsRuleElementParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_elements_3_0=ruleRuleElement();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_3_0,
                    	    							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.RuleElement");
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
    // $ANTLR end "ruleRuleModel"


    // $ANTLR start "entryRuleImport"
    // InternalRuleDetectionDsl.g:163:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRuleDetectionDsl.g:163:47: (iv_ruleImport= ruleImport EOF )
            // InternalRuleDetectionDsl.g:164:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalRuleDetectionDsl.g:170:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:176:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalRuleDetectionDsl.g:177:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalRuleDetectionDsl.g:177:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalRuleDetectionDsl.g:178:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRuleDetectionDsl.g:182:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalRuleDetectionDsl.g:183:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalRuleDetectionDsl.g:183:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalRuleDetectionDsl.g:184:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"eagledata.core.dsl.ruledetection.RuleDetectionDsl.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalRuleDetectionDsl.g:205:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalRuleDetectionDsl.g:205:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalRuleDetectionDsl.g:206:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalRuleDetectionDsl.g:212:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:218:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalRuleDetectionDsl.g:219:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalRuleDetectionDsl.g:219:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalRuleDetectionDsl.g:220:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalRuleDetectionDsl.g:230:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRuleDetectionDsl.g:231:4: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

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
    // InternalRuleDetectionDsl.g:241:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRuleDetectionDsl.g:241:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRuleDetectionDsl.g:242:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalRuleDetectionDsl.g:248:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:254:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRuleDetectionDsl.g:255:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRuleDetectionDsl.g:255:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRuleDetectionDsl.g:256:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRuleDetectionDsl.g:263:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRuleDetectionDsl.g:264:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,18,FOLLOW_5); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

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


    // $ANTLR start "entryRuleRuleElement"
    // InternalRuleDetectionDsl.g:281:1: entryRuleRuleElement returns [EObject current=null] : iv_ruleRuleElement= ruleRuleElement EOF ;
    public final EObject entryRuleRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleElement = null;


        try {
            // InternalRuleDetectionDsl.g:281:52: (iv_ruleRuleElement= ruleRuleElement EOF )
            // InternalRuleDetectionDsl.g:282:2: iv_ruleRuleElement= ruleRuleElement EOF
            {
             newCompositeNode(grammarAccess.getRuleElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleElement=ruleRuleElement();

            state._fsp--;

             current =iv_ruleRuleElement; 
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
    // $ANTLR end "entryRuleRuleElement"


    // $ANTLR start "ruleRuleElement"
    // InternalRuleDetectionDsl.g:288:1: ruleRuleElement returns [EObject current=null] : this_Action_0= ruleAction ;
    public final EObject ruleRuleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Action_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:294:2: (this_Action_0= ruleAction )
            // InternalRuleDetectionDsl.g:295:2: this_Action_0= ruleAction
            {

            		newCompositeNode(grammarAccess.getRuleElementAccess().getActionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Action_0=ruleAction();

            state._fsp--;


            		current = this_Action_0;
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
    // $ANTLR end "ruleRuleElement"


    // $ANTLR start "entryRuleRule"
    // InternalRuleDetectionDsl.g:306:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRuleDetectionDsl.g:306:45: (iv_ruleRule= ruleRule EOF )
            // InternalRuleDetectionDsl.g:307:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRuleDetectionDsl.g:313:1: ruleRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' ( ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* ) otherlv_7= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_actions_5_0 = null;

        EObject lv_actions_6_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:319:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' ( ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* ) otherlv_7= '}' ) )
            // InternalRuleDetectionDsl.g:320:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' ( ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* ) otherlv_7= '}' )
            {
            // InternalRuleDetectionDsl.g:320:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' ( ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* ) otherlv_7= '}' )
            // InternalRuleDetectionDsl.g:321:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' ( ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* ) otherlv_7= '}'
            {
            // InternalRuleDetectionDsl.g:321:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRuleDetectionDsl.g:322:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRuleDetectionDsl.g:322:4: (lv_name_0_0= RULE_ID )
            // InternalRuleDetectionDsl.g:323:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_0_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getOnKeyword_2());
            		
            // InternalRuleDetectionDsl.g:347:3: ( (otherlv_3= RULE_ID ) )
            // InternalRuleDetectionDsl.g:348:4: (otherlv_3= RULE_ID )
            {
            // InternalRuleDetectionDsl.g:348:4: (otherlv_3= RULE_ID )
            // InternalRuleDetectionDsl.g:349:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getEventPhraseCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getDoKeyword_4());
            		
            // InternalRuleDetectionDsl.g:364:3: ( ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )* )
            // InternalRuleDetectionDsl.g:365:4: ( (lv_actions_5_0= ruleAction ) ) ( (lv_actions_6_0= ruleAction ) )*
            {
            // InternalRuleDetectionDsl.g:365:4: ( (lv_actions_5_0= ruleAction ) )
            // InternalRuleDetectionDsl.g:366:5: (lv_actions_5_0= ruleAction )
            {
            // InternalRuleDetectionDsl.g:366:5: (lv_actions_5_0= ruleAction )
            // InternalRuleDetectionDsl.g:367:6: lv_actions_5_0= ruleAction
            {

            						newCompositeNode(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_5_0_0());
            					
            pushFollow(FOLLOW_11);
            lv_actions_5_0=ruleAction();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRuleRule());
            						}
            						add(
            							current,
            							"actions",
            							lv_actions_5_0,
            							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.Action");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRuleDetectionDsl.g:384:4: ( (lv_actions_6_0= ruleAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRuleDetectionDsl.g:385:5: (lv_actions_6_0= ruleAction )
            	    {
            	    // InternalRuleDetectionDsl.g:385:5: (lv_actions_6_0= ruleAction )
            	    // InternalRuleDetectionDsl.g:386:6: lv_actions_6_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_actions_6_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_6_0,
            	    							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAction"
    // InternalRuleDetectionDsl.g:412:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRuleDetectionDsl.g:412:47: (iv_ruleAction= ruleAction EOF )
            // InternalRuleDetectionDsl.g:413:2: iv_ruleAction= ruleAction EOF
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
    // InternalRuleDetectionDsl.g:419:1: ruleAction returns [EObject current=null] : (this_Query_0= ruleQuery | this_Message_1= ruleMessage ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Query_0 = null;

        EObject this_Message_1 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:425:2: ( (this_Query_0= ruleQuery | this_Message_1= ruleMessage ) )
            // InternalRuleDetectionDsl.g:426:2: (this_Query_0= ruleQuery | this_Message_1= ruleMessage )
            {
            // InternalRuleDetectionDsl.g:426:2: (this_Query_0= ruleQuery | this_Message_1= ruleMessage )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==23) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==31) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==RULE_SELECTOPERATOR||LA8_2==25) ) {
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
                        new NoViableAltException("", 8, 1, input);

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
                    // InternalRuleDetectionDsl.g:427:3: this_Query_0= ruleQuery
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getQueryParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Query_0=ruleQuery();

                    state._fsp--;


                    			current = this_Query_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDetectionDsl.g:436:3: this_Message_1= ruleMessage
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMessageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Message_1=ruleMessage();

                    state._fsp--;


                    			current = this_Message_1;
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


    // $ANTLR start "entryRuleQuery"
    // InternalRuleDetectionDsl.g:448:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalRuleDetectionDsl.g:448:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalRuleDetectionDsl.g:449:2: iv_ruleQuery= ruleQuery EOF
            {
             newCompositeNode(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuery=ruleQuery();

            state._fsp--;

             current =iv_ruleQuery; 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalRuleDetectionDsl.g:455:1: ruleQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) ( (lv_where_3_0= ruleWhere ) )? ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_select_2_0 = null;

        EObject lv_where_3_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:461:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) ( (lv_where_3_0= ruleWhere ) )? ) )
            // InternalRuleDetectionDsl.g:462:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) ( (lv_where_3_0= ruleWhere ) )? )
            {
            // InternalRuleDetectionDsl.g:462:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) ( (lv_where_3_0= ruleWhere ) )? )
            // InternalRuleDetectionDsl.g:463:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) ( (lv_where_3_0= ruleWhere ) )?
            {
            // InternalRuleDetectionDsl.g:463:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRuleDetectionDsl.g:464:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRuleDetectionDsl.g:464:4: (lv_name_0_0= RULE_ID )
            // InternalRuleDetectionDsl.g:465:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQueryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getColonKeyword_1());
            		
            // InternalRuleDetectionDsl.g:485:3: ( (lv_select_2_0= ruleSelect ) )
            // InternalRuleDetectionDsl.g:486:4: (lv_select_2_0= ruleSelect )
            {
            // InternalRuleDetectionDsl.g:486:4: (lv_select_2_0= ruleSelect )
            // InternalRuleDetectionDsl.g:487:5: lv_select_2_0= ruleSelect
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getSelectSelectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_select_2_0=ruleSelect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"select",
            						lv_select_2_0,
            						"eagledata.core.dsl.ruledetection.RuleDetectionDsl.Select");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRuleDetectionDsl.g:504:3: ( (lv_where_3_0= ruleWhere ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRuleDetectionDsl.g:505:4: (lv_where_3_0= ruleWhere )
                    {
                    // InternalRuleDetectionDsl.g:505:4: (lv_where_3_0= ruleWhere )
                    // InternalRuleDetectionDsl.g:506:5: lv_where_3_0= ruleWhere
                    {

                    					newCompositeNode(grammarAccess.getQueryAccess().getWhereWhereParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_where_3_0=ruleWhere();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getQueryRule());
                    					}
                    					set(
                    						current,
                    						"where",
                    						lv_where_3_0,
                    						"eagledata.core.dsl.ruledetection.RuleDetectionDsl.Where");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleAddingSelect"
    // InternalRuleDetectionDsl.g:527:1: entryRuleAddingSelect returns [EObject current=null] : iv_ruleAddingSelect= ruleAddingSelect EOF ;
    public final EObject entryRuleAddingSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddingSelect = null;


        try {
            // InternalRuleDetectionDsl.g:527:53: (iv_ruleAddingSelect= ruleAddingSelect EOF )
            // InternalRuleDetectionDsl.g:528:2: iv_ruleAddingSelect= ruleAddingSelect EOF
            {
             newCompositeNode(grammarAccess.getAddingSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddingSelect=ruleAddingSelect();

            state._fsp--;

             current =iv_ruleAddingSelect; 
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
    // $ANTLR end "entryRuleAddingSelect"


    // $ANTLR start "ruleAddingSelect"
    // InternalRuleDetectionDsl.g:534:1: ruleAddingSelect returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) ) ;
    public final EObject ruleAddingSelect() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token otherlv_1=null;
        Token lv_all_2_0=null;


        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:540:2: ( ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) ) )
            // InternalRuleDetectionDsl.g:541:2: ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) )
            {
            // InternalRuleDetectionDsl.g:541:2: ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) )
            // InternalRuleDetectionDsl.g:542:3: ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) )
            {
            // InternalRuleDetectionDsl.g:542:3: ( (lv_operation_0_0= RULE_SELECTOPERATOR ) )
            // InternalRuleDetectionDsl.g:543:4: (lv_operation_0_0= RULE_SELECTOPERATOR )
            {
            // InternalRuleDetectionDsl.g:543:4: (lv_operation_0_0= RULE_SELECTOPERATOR )
            // InternalRuleDetectionDsl.g:544:5: lv_operation_0_0= RULE_SELECTOPERATOR
            {
            lv_operation_0_0=(Token)match(input,RULE_SELECTOPERATOR,FOLLOW_15); 

            					newLeafNode(lv_operation_0_0, grammarAccess.getAddingSelectAccess().getOperationSELECTOPERATORTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddingSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operation",
            						lv_operation_0_0,
            						"eagledata.core.dsl.ruledetection.RuleDetectionDsl.SELECTOPERATOR");
            				

            }


            }

            // InternalRuleDetectionDsl.g:560:3: ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EOF||LA11_0==RULE_ID||LA11_0==22||LA11_0==27) ) {
                alt11=1;
            }
            else if ( (LA11_0==24) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRuleDetectionDsl.g:561:4: ( (otherlv_1= RULE_ID ) )?
                    {
                    // InternalRuleDetectionDsl.g:561:4: ( (otherlv_1= RULE_ID ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==EOF||LA10_1==RULE_ID||LA10_1==22||LA10_1==27) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRuleDetectionDsl.g:562:5: (otherlv_1= RULE_ID )
                            {
                            // InternalRuleDetectionDsl.g:562:5: (otherlv_1= RULE_ID )
                            // InternalRuleDetectionDsl.g:563:6: otherlv_1= RULE_ID
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getAddingSelectRule());
                            						}
                            					
                            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                            						newLeafNode(otherlv_1, grammarAccess.getAddingSelectAccess().getElementConceptCrossReference_1_0_0());
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDetectionDsl.g:575:4: ( (lv_all_2_0= '*' ) )
                    {
                    // InternalRuleDetectionDsl.g:575:4: ( (lv_all_2_0= '*' ) )
                    // InternalRuleDetectionDsl.g:576:5: (lv_all_2_0= '*' )
                    {
                    // InternalRuleDetectionDsl.g:576:5: (lv_all_2_0= '*' )
                    // InternalRuleDetectionDsl.g:577:6: lv_all_2_0= '*'
                    {
                    lv_all_2_0=(Token)match(input,24,FOLLOW_2); 

                    						newLeafNode(lv_all_2_0, grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAddingSelectRule());
                    						}
                    						setWithLastConsumed(current, "all", true, "*");
                    					

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
    // $ANTLR end "ruleAddingSelect"


    // $ANTLR start "entryRuleSelect"
    // InternalRuleDetectionDsl.g:594:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalRuleDetectionDsl.g:594:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalRuleDetectionDsl.g:595:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalRuleDetectionDsl.g:601:1: ruleSelect returns [EObject current=null] : (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        EObject this_AddingSelect_0 = null;

        EObject this_SetSelect_1 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:607:2: ( (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect ) )
            // InternalRuleDetectionDsl.g:608:2: (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect )
            {
            // InternalRuleDetectionDsl.g:608:2: (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SELECTOPERATOR) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRuleDetectionDsl.g:609:3: this_AddingSelect_0= ruleAddingSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectAccess().getAddingSelectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AddingSelect_0=ruleAddingSelect();

                    state._fsp--;


                    			current = this_AddingSelect_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDetectionDsl.g:618:3: this_SetSelect_1= ruleSetSelect
                    {

                    			newCompositeNode(grammarAccess.getSelectAccess().getSetSelectParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetSelect_1=ruleSetSelect();

                    state._fsp--;


                    			current = this_SetSelect_1;
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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleSetSelect"
    // InternalRuleDetectionDsl.g:630:1: entryRuleSetSelect returns [EObject current=null] : iv_ruleSetSelect= ruleSetSelect EOF ;
    public final EObject entryRuleSetSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetSelect = null;


        try {
            // InternalRuleDetectionDsl.g:630:50: (iv_ruleSetSelect= ruleSetSelect EOF )
            // InternalRuleDetectionDsl.g:631:2: iv_ruleSetSelect= ruleSetSelect EOF
            {
             newCompositeNode(grammarAccess.getSetSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetSelect=ruleSetSelect();

            state._fsp--;

             current =iv_ruleSetSelect; 
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
    // $ANTLR end "entryRuleSetSelect"


    // $ANTLR start "ruleSetSelect"
    // InternalRuleDetectionDsl.g:637:1: ruleSetSelect returns [EObject current=null] : ( () otherlv_1= 'select' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ( ( (lv_operator_5_0= RULE_SETOPERATOR ) ) ( (lv_select_6_0= ruleSetSelect ) ) )? ) ;
    public final EObject ruleSetSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_operator_5_0=null;
        EObject lv_select_6_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:643:2: ( ( () otherlv_1= 'select' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ( ( (lv_operator_5_0= RULE_SETOPERATOR ) ) ( (lv_select_6_0= ruleSetSelect ) ) )? ) )
            // InternalRuleDetectionDsl.g:644:2: ( () otherlv_1= 'select' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ( ( (lv_operator_5_0= RULE_SETOPERATOR ) ) ( (lv_select_6_0= ruleSetSelect ) ) )? )
            {
            // InternalRuleDetectionDsl.g:644:2: ( () otherlv_1= 'select' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ( ( (lv_operator_5_0= RULE_SETOPERATOR ) ) ( (lv_select_6_0= ruleSetSelect ) ) )? )
            // InternalRuleDetectionDsl.g:645:3: () otherlv_1= 'select' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* ) ( ( (lv_operator_5_0= RULE_SETOPERATOR ) ) ( (lv_select_6_0= ruleSetSelect ) ) )?
            {
            // InternalRuleDetectionDsl.g:645:3: ()
            // InternalRuleDetectionDsl.g:646:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetSelectAccess().getSetSelectAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSetSelectAccess().getSelectKeyword_1());
            		
            // InternalRuleDetectionDsl.g:656:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )
            // InternalRuleDetectionDsl.g:657:4: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            {
            // InternalRuleDetectionDsl.g:657:4: ( (otherlv_2= RULE_ID ) )
            // InternalRuleDetectionDsl.g:658:5: (otherlv_2= RULE_ID )
            {
            // InternalRuleDetectionDsl.g:658:5: (otherlv_2= RULE_ID )
            // InternalRuleDetectionDsl.g:659:6: otherlv_2= RULE_ID
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getSetSelectRule());
            						}
            					
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_16); 

            						newLeafNode(otherlv_2, grammarAccess.getSetSelectAccess().getSelectionNodeCrossReference_2_0_0());
            					

            }


            }

            // InternalRuleDetectionDsl.g:670:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==26) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRuleDetectionDsl.g:671:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_5); 

            	    					newLeafNode(otherlv_3, grammarAccess.getSetSelectAccess().getCommaKeyword_2_1_0());
            	    				
            	    // InternalRuleDetectionDsl.g:675:5: ( (otherlv_4= RULE_ID ) )
            	    // InternalRuleDetectionDsl.g:676:6: (otherlv_4= RULE_ID )
            	    {
            	    // InternalRuleDetectionDsl.g:676:6: (otherlv_4= RULE_ID )
            	    // InternalRuleDetectionDsl.g:677:7: otherlv_4= RULE_ID
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSetSelectRule());
            	    							}
            	    						
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    							newLeafNode(otherlv_4, grammarAccess.getSetSelectAccess().getSelectionNodeCrossReference_2_1_1_0());
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            // InternalRuleDetectionDsl.g:690:3: ( ( (lv_operator_5_0= RULE_SETOPERATOR ) ) ( (lv_select_6_0= ruleSetSelect ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_SETOPERATOR) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRuleDetectionDsl.g:691:4: ( (lv_operator_5_0= RULE_SETOPERATOR ) ) ( (lv_select_6_0= ruleSetSelect ) )
                    {
                    // InternalRuleDetectionDsl.g:691:4: ( (lv_operator_5_0= RULE_SETOPERATOR ) )
                    // InternalRuleDetectionDsl.g:692:5: (lv_operator_5_0= RULE_SETOPERATOR )
                    {
                    // InternalRuleDetectionDsl.g:692:5: (lv_operator_5_0= RULE_SETOPERATOR )
                    // InternalRuleDetectionDsl.g:693:6: lv_operator_5_0= RULE_SETOPERATOR
                    {
                    lv_operator_5_0=(Token)match(input,RULE_SETOPERATOR,FOLLOW_13); 

                    						newLeafNode(lv_operator_5_0, grammarAccess.getSetSelectAccess().getOperatorSETOPERATORTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetSelectRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"operator",
                    							lv_operator_5_0,
                    							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.SETOPERATOR");
                    					

                    }


                    }

                    // InternalRuleDetectionDsl.g:709:4: ( (lv_select_6_0= ruleSetSelect ) )
                    // InternalRuleDetectionDsl.g:710:5: (lv_select_6_0= ruleSetSelect )
                    {
                    // InternalRuleDetectionDsl.g:710:5: (lv_select_6_0= ruleSetSelect )
                    // InternalRuleDetectionDsl.g:711:6: lv_select_6_0= ruleSetSelect
                    {

                    						newCompositeNode(grammarAccess.getSetSelectAccess().getSelectSetSelectParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_select_6_0=ruleSetSelect();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSetSelectRule());
                    						}
                    						set(
                    							current,
                    							"select",
                    							lv_select_6_0,
                    							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.SetSelect");
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
    // $ANTLR end "ruleSetSelect"


    // $ANTLR start "entryRuleWhere"
    // InternalRuleDetectionDsl.g:733:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalRuleDetectionDsl.g:733:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalRuleDetectionDsl.g:734:2: iv_ruleWhere= ruleWhere EOF
            {
             newCompositeNode(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhere=ruleWhere();

            state._fsp--;

             current =iv_ruleWhere; 
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
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalRuleDetectionDsl.g:740:1: ruleWhere returns [EObject current=null] : (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) ) ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_logicalOperator_2_0=null;
        Token otherlv_3=null;
        Token lv_right_4_0=null;


        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:746:2: ( (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) ) ) )
            // InternalRuleDetectionDsl.g:747:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) ) )
            {
            // InternalRuleDetectionDsl.g:747:2: (otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) ) )
            // InternalRuleDetectionDsl.g:748:3: otherlv_0= 'where' ( (otherlv_1= RULE_ID ) ) ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) ) ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getWhereAccess().getWhereKeyword_0());
            		
            // InternalRuleDetectionDsl.g:752:3: ( (otherlv_1= RULE_ID ) )
            // InternalRuleDetectionDsl.g:753:4: (otherlv_1= RULE_ID )
            {
            // InternalRuleDetectionDsl.g:753:4: (otherlv_1= RULE_ID )
            // InternalRuleDetectionDsl.g:754:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_1, grammarAccess.getWhereAccess().getLeftConceptCrossReference_1_0());
            				

            }


            }

            // InternalRuleDetectionDsl.g:765:3: ( (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR ) )
            // InternalRuleDetectionDsl.g:766:4: (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR )
            {
            // InternalRuleDetectionDsl.g:766:4: (lv_logicalOperator_2_0= RULE_LOGICALOPERATOR )
            // InternalRuleDetectionDsl.g:767:5: lv_logicalOperator_2_0= RULE_LOGICALOPERATOR
            {
            lv_logicalOperator_2_0=(Token)match(input,RULE_LOGICALOPERATOR,FOLLOW_18); 

            					newLeafNode(lv_logicalOperator_2_0, grammarAccess.getWhereAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logicalOperator",
            						lv_logicalOperator_2_0,
            						"eagledata.core.dsl.ruledetection.RuleDetectionDsl.LOGICALOPERATOR");
            				

            }


            }

            // InternalRuleDetectionDsl.g:783:3: ( ( (otherlv_3= RULE_ID ) ) | ( (lv_right_4_0= RULE_INT ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_INT) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalRuleDetectionDsl.g:784:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalRuleDetectionDsl.g:784:4: ( (otherlv_3= RULE_ID ) )
                    // InternalRuleDetectionDsl.g:785:5: (otherlv_3= RULE_ID )
                    {
                    // InternalRuleDetectionDsl.g:785:5: (otherlv_3= RULE_ID )
                    // InternalRuleDetectionDsl.g:786:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getWhereAccess().getRightVariableConceptCrossReference_3_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDetectionDsl.g:798:4: ( (lv_right_4_0= RULE_INT ) )
                    {
                    // InternalRuleDetectionDsl.g:798:4: ( (lv_right_4_0= RULE_INT ) )
                    // InternalRuleDetectionDsl.g:799:5: (lv_right_4_0= RULE_INT )
                    {
                    // InternalRuleDetectionDsl.g:799:5: (lv_right_4_0= RULE_INT )
                    // InternalRuleDetectionDsl.g:800:6: lv_right_4_0= RULE_INT
                    {
                    lv_right_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_right_4_0, grammarAccess.getWhereAccess().getRightINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"right",
                    							lv_right_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

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
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleRecipient"
    // InternalRuleDetectionDsl.g:821:1: entryRuleRecipient returns [EObject current=null] : iv_ruleRecipient= ruleRecipient EOF ;
    public final EObject entryRuleRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecipient = null;


        try {
            // InternalRuleDetectionDsl.g:821:50: (iv_ruleRecipient= ruleRecipient EOF )
            // InternalRuleDetectionDsl.g:822:2: iv_ruleRecipient= ruleRecipient EOF
            {
             newCompositeNode(grammarAccess.getRecipientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecipient=ruleRecipient();

            state._fsp--;

             current =iv_ruleRecipient; 
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
    // $ANTLR end "entryRuleRecipient"


    // $ANTLR start "ruleRecipient"
    // InternalRuleDetectionDsl.g:828:1: ruleRecipient returns [EObject current=null] : this_ConcreteRecipient_0= ruleConcreteRecipient ;
    public final EObject ruleRecipient() throws RecognitionException {
        EObject current = null;

        EObject this_ConcreteRecipient_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:834:2: (this_ConcreteRecipient_0= ruleConcreteRecipient )
            // InternalRuleDetectionDsl.g:835:2: this_ConcreteRecipient_0= ruleConcreteRecipient
            {

            		newCompositeNode(grammarAccess.getRecipientAccess().getConcreteRecipientParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_ConcreteRecipient_0=ruleConcreteRecipient();

            state._fsp--;


            		current = this_ConcreteRecipient_0;
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
    // $ANTLR end "ruleRecipient"


    // $ANTLR start "entryRuleConcreteRecipient"
    // InternalRuleDetectionDsl.g:846:1: entryRuleConcreteRecipient returns [EObject current=null] : iv_ruleConcreteRecipient= ruleConcreteRecipient EOF ;
    public final EObject entryRuleConcreteRecipient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcreteRecipient = null;


        try {
            // InternalRuleDetectionDsl.g:846:58: (iv_ruleConcreteRecipient= ruleConcreteRecipient EOF )
            // InternalRuleDetectionDsl.g:847:2: iv_ruleConcreteRecipient= ruleConcreteRecipient EOF
            {
             newCompositeNode(grammarAccess.getConcreteRecipientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcreteRecipient=ruleConcreteRecipient();

            state._fsp--;

             current =iv_ruleConcreteRecipient; 
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
    // $ANTLR end "entryRuleConcreteRecipient"


    // $ANTLR start "ruleConcreteRecipient"
    // InternalRuleDetectionDsl.g:853:1: ruleConcreteRecipient returns [EObject current=null] : (otherlv_0= '@' ( (lv_user_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleConcreteRecipient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_user_1_0=null;


        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:859:2: ( (otherlv_0= '@' ( (lv_user_1_0= RULE_STRING ) ) ) )
            // InternalRuleDetectionDsl.g:860:2: (otherlv_0= '@' ( (lv_user_1_0= RULE_STRING ) ) )
            {
            // InternalRuleDetectionDsl.g:860:2: (otherlv_0= '@' ( (lv_user_1_0= RULE_STRING ) ) )
            // InternalRuleDetectionDsl.g:861:3: otherlv_0= '@' ( (lv_user_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_0, grammarAccess.getConcreteRecipientAccess().getCommercialAtKeyword_0());
            		
            // InternalRuleDetectionDsl.g:865:3: ( (lv_user_1_0= RULE_STRING ) )
            // InternalRuleDetectionDsl.g:866:4: (lv_user_1_0= RULE_STRING )
            {
            // InternalRuleDetectionDsl.g:866:4: (lv_user_1_0= RULE_STRING )
            // InternalRuleDetectionDsl.g:867:5: lv_user_1_0= RULE_STRING
            {
            lv_user_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_user_1_0, grammarAccess.getConcreteRecipientAccess().getUserSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConcreteRecipientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"user",
            						lv_user_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleConcreteRecipient"


    // $ANTLR start "entryRuleExpression"
    // InternalRuleDetectionDsl.g:887:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRuleDetectionDsl.g:887:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRuleDetectionDsl.g:888:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRuleDetectionDsl.g:894:1: ruleExpression returns [EObject current=null] : (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlainExpression_0 = null;

        EObject this_ComplexExpression_1 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:900:2: ( (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression ) )
            // InternalRuleDetectionDsl.g:901:2: (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression )
            {
            // InternalRuleDetectionDsl.g:901:2: (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==RULE_DOUBLE) ) {
                alt16=1;
            }
            else if ( (LA16_0==29) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalRuleDetectionDsl.g:902:3: this_PlainExpression_0= rulePlainExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getPlainExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlainExpression_0=rulePlainExpression();

                    state._fsp--;


                    			current = this_PlainExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDetectionDsl.g:911:3: this_ComplexExpression_1= ruleComplexExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getComplexExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexExpression_1=ruleComplexExpression();

                    state._fsp--;


                    			current = this_ComplexExpression_1;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlainExpression"
    // InternalRuleDetectionDsl.g:923:1: entryRulePlainExpression returns [EObject current=null] : iv_rulePlainExpression= rulePlainExpression EOF ;
    public final EObject entryRulePlainExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainExpression = null;


        try {
            // InternalRuleDetectionDsl.g:923:56: (iv_rulePlainExpression= rulePlainExpression EOF )
            // InternalRuleDetectionDsl.g:924:2: iv_rulePlainExpression= rulePlainExpression EOF
            {
             newCompositeNode(grammarAccess.getPlainExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlainExpression=rulePlainExpression();

            state._fsp--;

             current =iv_rulePlainExpression; 
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
    // $ANTLR end "entryRulePlainExpression"


    // $ANTLR start "rulePlainExpression"
    // InternalRuleDetectionDsl.g:930:1: rulePlainExpression returns [EObject current=null] : ( (lv_plainOperand_0_0= rulePlainOperand ) ) ;
    public final EObject rulePlainExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_plainOperand_0_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:936:2: ( ( (lv_plainOperand_0_0= rulePlainOperand ) ) )
            // InternalRuleDetectionDsl.g:937:2: ( (lv_plainOperand_0_0= rulePlainOperand ) )
            {
            // InternalRuleDetectionDsl.g:937:2: ( (lv_plainOperand_0_0= rulePlainOperand ) )
            // InternalRuleDetectionDsl.g:938:3: (lv_plainOperand_0_0= rulePlainOperand )
            {
            // InternalRuleDetectionDsl.g:938:3: (lv_plainOperand_0_0= rulePlainOperand )
            // InternalRuleDetectionDsl.g:939:4: lv_plainOperand_0_0= rulePlainOperand
            {

            				newCompositeNode(grammarAccess.getPlainExpressionAccess().getPlainOperandPlainOperandParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_plainOperand_0_0=rulePlainOperand();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPlainExpressionRule());
            				}
            				set(
            					current,
            					"plainOperand",
            					lv_plainOperand_0_0,
            					"eagledata.core.dsl.ruledetection.RuleDetectionDsl.PlainOperand");
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
    // $ANTLR end "rulePlainExpression"


    // $ANTLR start "entryRuleComplexExpression"
    // InternalRuleDetectionDsl.g:959:1: entryRuleComplexExpression returns [EObject current=null] : iv_ruleComplexExpression= ruleComplexExpression EOF ;
    public final EObject entryRuleComplexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexExpression = null;


        try {
            // InternalRuleDetectionDsl.g:959:58: (iv_ruleComplexExpression= ruleComplexExpression EOF )
            // InternalRuleDetectionDsl.g:960:2: iv_ruleComplexExpression= ruleComplexExpression EOF
            {
             newCompositeNode(grammarAccess.getComplexExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexExpression=ruleComplexExpression();

            state._fsp--;

             current =iv_ruleComplexExpression; 
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
    // $ANTLR end "entryRuleComplexExpression"


    // $ANTLR start "ruleComplexExpression"
    // InternalRuleDetectionDsl.g:966:1: ruleComplexExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleComplexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_plainOperand_1_0 = null;

        EObject lv_complexOperands_2_0 = null;

        EObject lv_complexOperands_3_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:972:2: ( (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' ) )
            // InternalRuleDetectionDsl.g:973:2: (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' )
            {
            // InternalRuleDetectionDsl.g:973:2: (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' )
            // InternalRuleDetectionDsl.g:974:3: otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRuleDetectionDsl.g:978:3: ( (lv_plainOperand_1_0= rulePlainOperand ) )
            // InternalRuleDetectionDsl.g:979:4: (lv_plainOperand_1_0= rulePlainOperand )
            {
            // InternalRuleDetectionDsl.g:979:4: (lv_plainOperand_1_0= rulePlainOperand )
            // InternalRuleDetectionDsl.g:980:5: lv_plainOperand_1_0= rulePlainOperand
            {

            					newCompositeNode(grammarAccess.getComplexExpressionAccess().getPlainOperandPlainOperandParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_plainOperand_1_0=rulePlainOperand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
            					}
            					set(
            						current,
            						"plainOperand",
            						lv_plainOperand_1_0,
            						"eagledata.core.dsl.ruledetection.RuleDetectionDsl.PlainOperand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRuleDetectionDsl.g:997:3: ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_OPERATOR) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRuleDetectionDsl.g:998:4: ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )*
                    {
                    // InternalRuleDetectionDsl.g:998:4: ( (lv_complexOperands_2_0= ruleComplexOperand ) )
                    // InternalRuleDetectionDsl.g:999:5: (lv_complexOperands_2_0= ruleComplexOperand )
                    {
                    // InternalRuleDetectionDsl.g:999:5: (lv_complexOperands_2_0= ruleComplexOperand )
                    // InternalRuleDetectionDsl.g:1000:6: lv_complexOperands_2_0= ruleComplexOperand
                    {

                    						newCompositeNode(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_complexOperands_2_0=ruleComplexOperand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    						}
                    						add(
                    							current,
                    							"complexOperands",
                    							lv_complexOperands_2_0,
                    							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.ComplexOperand");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRuleDetectionDsl.g:1017:4: ( (lv_complexOperands_3_0= ruleComplexOperand ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_OPERATOR) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRuleDetectionDsl.g:1018:5: (lv_complexOperands_3_0= ruleComplexOperand )
                    	    {
                    	    // InternalRuleDetectionDsl.g:1018:5: (lv_complexOperands_3_0= ruleComplexOperand )
                    	    // InternalRuleDetectionDsl.g:1019:6: lv_complexOperands_3_0= ruleComplexOperand
                    	    {

                    	    						newCompositeNode(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_21);
                    	    lv_complexOperands_3_0=ruleComplexOperand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"complexOperands",
                    	    							lv_complexOperands_3_0,
                    	    							"eagledata.core.dsl.ruledetection.RuleDetectionDsl.ComplexOperand");
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

            otherlv_4=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexExpressionAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleComplexExpression"


    // $ANTLR start "entryRulePlainOperand"
    // InternalRuleDetectionDsl.g:1045:1: entryRulePlainOperand returns [EObject current=null] : iv_rulePlainOperand= rulePlainOperand EOF ;
    public final EObject entryRulePlainOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainOperand = null;


        try {
            // InternalRuleDetectionDsl.g:1045:53: (iv_rulePlainOperand= rulePlainOperand EOF )
            // InternalRuleDetectionDsl.g:1046:2: iv_rulePlainOperand= rulePlainOperand EOF
            {
             newCompositeNode(grammarAccess.getPlainOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlainOperand=rulePlainOperand();

            state._fsp--;

             current =iv_rulePlainOperand; 
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
    // $ANTLR end "entryRulePlainOperand"


    // $ANTLR start "rulePlainOperand"
    // InternalRuleDetectionDsl.g:1052:1: rulePlainOperand returns [EObject current=null] : (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand ) ;
    public final EObject rulePlainOperand() throws RecognitionException {
        EObject current = null;

        EObject this_Numeral_0 = null;

        EObject this_QueryOperand_1 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:1058:2: ( (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand ) )
            // InternalRuleDetectionDsl.g:1059:2: (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand )
            {
            // InternalRuleDetectionDsl.g:1059:2: (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOUBLE) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalRuleDetectionDsl.g:1060:3: this_Numeral_0= ruleNumeral
                    {

                    			newCompositeNode(grammarAccess.getPlainOperandAccess().getNumeralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Numeral_0=ruleNumeral();

                    state._fsp--;


                    			current = this_Numeral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDetectionDsl.g:1069:3: this_QueryOperand_1= ruleQueryOperand
                    {

                    			newCompositeNode(grammarAccess.getPlainOperandAccess().getQueryOperandParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QueryOperand_1=ruleQueryOperand();

                    state._fsp--;


                    			current = this_QueryOperand_1;
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
    // $ANTLR end "rulePlainOperand"


    // $ANTLR start "entryRuleNumeral"
    // InternalRuleDetectionDsl.g:1081:1: entryRuleNumeral returns [EObject current=null] : iv_ruleNumeral= ruleNumeral EOF ;
    public final EObject entryRuleNumeral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeral = null;


        try {
            // InternalRuleDetectionDsl.g:1081:48: (iv_ruleNumeral= ruleNumeral EOF )
            // InternalRuleDetectionDsl.g:1082:2: iv_ruleNumeral= ruleNumeral EOF
            {
             newCompositeNode(grammarAccess.getNumeralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumeral=ruleNumeral();

            state._fsp--;

             current =iv_ruleNumeral; 
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
    // $ANTLR end "entryRuleNumeral"


    // $ANTLR start "ruleNumeral"
    // InternalRuleDetectionDsl.g:1088:1: ruleNumeral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleNumeral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:1094:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalRuleDetectionDsl.g:1095:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalRuleDetectionDsl.g:1095:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalRuleDetectionDsl.g:1096:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalRuleDetectionDsl.g:1096:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalRuleDetectionDsl.g:1097:4: lv_value_0_0= RULE_DOUBLE
            {
            lv_value_0_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumeralAccess().getValueDOUBLETerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumeralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"eagledata.core.dsl.ruledetection.RuleDetectionDsl.DOUBLE");
            			

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
    // $ANTLR end "ruleNumeral"


    // $ANTLR start "entryRuleQueryOperand"
    // InternalRuleDetectionDsl.g:1116:1: entryRuleQueryOperand returns [EObject current=null] : iv_ruleQueryOperand= ruleQueryOperand EOF ;
    public final EObject entryRuleQueryOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryOperand = null;


        try {
            // InternalRuleDetectionDsl.g:1116:53: (iv_ruleQueryOperand= ruleQueryOperand EOF )
            // InternalRuleDetectionDsl.g:1117:2: iv_ruleQueryOperand= ruleQueryOperand EOF
            {
             newCompositeNode(grammarAccess.getQueryOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryOperand=ruleQueryOperand();

            state._fsp--;

             current =iv_ruleQueryOperand; 
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
    // $ANTLR end "entryRuleQueryOperand"


    // $ANTLR start "ruleQueryOperand"
    // InternalRuleDetectionDsl.g:1123:1: ruleQueryOperand returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleQueryOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:1129:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRuleDetectionDsl.g:1130:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRuleDetectionDsl.g:1130:2: ( (otherlv_0= RULE_ID ) )
            // InternalRuleDetectionDsl.g:1131:3: (otherlv_0= RULE_ID )
            {
            // InternalRuleDetectionDsl.g:1131:3: (otherlv_0= RULE_ID )
            // InternalRuleDetectionDsl.g:1132:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQueryOperandRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getQueryOperandAccess().getQueryQueryCrossReference_0());
            			

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
    // $ANTLR end "ruleQueryOperand"


    // $ANTLR start "entryRuleComplexOperand"
    // InternalRuleDetectionDsl.g:1146:1: entryRuleComplexOperand returns [EObject current=null] : iv_ruleComplexOperand= ruleComplexOperand EOF ;
    public final EObject entryRuleComplexOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexOperand = null;


        try {
            // InternalRuleDetectionDsl.g:1146:55: (iv_ruleComplexOperand= ruleComplexOperand EOF )
            // InternalRuleDetectionDsl.g:1147:2: iv_ruleComplexOperand= ruleComplexOperand EOF
            {
             newCompositeNode(grammarAccess.getComplexOperandRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexOperand=ruleComplexOperand();

            state._fsp--;

             current =iv_ruleComplexOperand; 
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
    // $ANTLR end "entryRuleComplexOperand"


    // $ANTLR start "ruleComplexOperand"
    // InternalRuleDetectionDsl.g:1153:1: ruleComplexOperand returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleComplexOperand() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:1159:2: ( ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalRuleDetectionDsl.g:1160:2: ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalRuleDetectionDsl.g:1160:2: ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalRuleDetectionDsl.g:1161:3: ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalRuleDetectionDsl.g:1161:3: ( (lv_operator_0_0= RULE_OPERATOR ) )
            // InternalRuleDetectionDsl.g:1162:4: (lv_operator_0_0= RULE_OPERATOR )
            {
            // InternalRuleDetectionDsl.g:1162:4: (lv_operator_0_0= RULE_OPERATOR )
            // InternalRuleDetectionDsl.g:1163:5: lv_operator_0_0= RULE_OPERATOR
            {
            lv_operator_0_0=(Token)match(input,RULE_OPERATOR,FOLLOW_22); 

            					newLeafNode(lv_operator_0_0, grammarAccess.getComplexOperandAccess().getOperatorOPERATORTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexOperandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"eagledata.core.dsl.ruledetection.RuleDetectionDsl.OPERATOR");
            				

            }


            }

            // InternalRuleDetectionDsl.g:1179:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalRuleDetectionDsl.g:1180:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalRuleDetectionDsl.g:1180:4: (lv_expression_1_0= ruleExpression )
            // InternalRuleDetectionDsl.g:1181:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getComplexOperandAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexOperandRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"eagledata.core.dsl.ruledetection.RuleDetectionDsl.Expression");
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
    // $ANTLR end "ruleComplexOperand"


    // $ANTLR start "entryRuleMessage"
    // InternalRuleDetectionDsl.g:1202:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalRuleDetectionDsl.g:1202:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalRuleDetectionDsl.g:1203:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalRuleDetectionDsl.g:1209:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_recipient_5_0= ruleRecipient ) ) ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_message_3_0=null;
        Token otherlv_4=null;
        EObject lv_recipient_5_0 = null;



        	enterRule();

        try {
            // InternalRuleDetectionDsl.g:1215:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_recipient_5_0= ruleRecipient ) ) ) )
            // InternalRuleDetectionDsl.g:1216:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_recipient_5_0= ruleRecipient ) ) )
            {
            // InternalRuleDetectionDsl.g:1216:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_recipient_5_0= ruleRecipient ) ) )
            // InternalRuleDetectionDsl.g:1217:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( (lv_message_3_0= RULE_STRING ) ) otherlv_4= 'to' ( (lv_recipient_5_0= ruleRecipient ) )
            {
            // InternalRuleDetectionDsl.g:1217:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRuleDetectionDsl.g:1218:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRuleDetectionDsl.g:1218:4: (lv_name_0_0= RULE_ID )
            // InternalRuleDetectionDsl.g:1219:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getComposeKeyword_2());
            		
            // InternalRuleDetectionDsl.g:1243:3: ( (lv_message_3_0= RULE_STRING ) )
            // InternalRuleDetectionDsl.g:1244:4: (lv_message_3_0= RULE_STRING )
            {
            // InternalRuleDetectionDsl.g:1244:4: (lv_message_3_0= RULE_STRING )
            // InternalRuleDetectionDsl.g:1245:5: lv_message_3_0= RULE_STRING
            {
            lv_message_3_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            					newLeafNode(lv_message_3_0, grammarAccess.getMessageAccess().getMessageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"message",
            						lv_message_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getToKeyword_4());
            		
            // InternalRuleDetectionDsl.g:1265:3: ( (lv_recipient_5_0= ruleRecipient ) )
            // InternalRuleDetectionDsl.g:1266:4: (lv_recipient_5_0= ruleRecipient )
            {
            // InternalRuleDetectionDsl.g:1266:4: (lv_recipient_5_0= ruleRecipient )
            // InternalRuleDetectionDsl.g:1267:5: lv_recipient_5_0= ruleRecipient
            {

            					newCompositeNode(grammarAccess.getMessageAccess().getRecipientRecipientParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_recipient_5_0=ruleRecipient();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageRule());
            					}
            					set(
            						current,
            						"recipient",
            						lv_recipient_5_0,
            						"eagledata.core.dsl.ruledetection.RuleDetectionDsl.Recipient");
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
    // $ANTLR end "ruleMessage"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000042L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000410L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});

}