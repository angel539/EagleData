package eagledata.core.dsl.rule.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eagledata.core.dsl.rule.services.RuleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SELECTOPERATOR", "RULE_LOGICALOPERATOR", "RULE_DOUBLE", "RULE_OPERATOR", "RULE_STRING", "RULE_CONDITIONALOPERATOR", "RULE_INT", "RULE_SETOPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'{'", "'on'", "'do'", "'}'", "':'", "'then'", "'*'", "'select'", "','", "'from'", "'where'", "'AND'", "'('", "')'", "'compose'", "'+'", "'to'", "'@'"
    };
    public static final int RULE_SELECTOPERATOR=5;
    public static final int RULE_STRING=9;
    public static final int RULE_CONDITIONALOPERATOR=10;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_LOGICALOPERATOR=6;
    public static final int T__31=31;
    public static final int RULE_OPERATOR=8;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SETOPERATOR=12;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRuleDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRuleDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRuleDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRuleDsl.g"; }



     	private RuleDslGrammarAccess grammarAccess;

        public InternalRuleDslParser(TokenStream input, RuleDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RuleModel";
       	}

       	@Override
       	protected RuleDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRuleModel"
    // InternalRuleDsl.g:64:1: entryRuleRuleModel returns [EObject current=null] : iv_ruleRuleModel= ruleRuleModel EOF ;
    public final EObject entryRuleRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleModel = null;


        try {
            // InternalRuleDsl.g:64:50: (iv_ruleRuleModel= ruleRuleModel EOF )
            // InternalRuleDsl.g:65:2: iv_ruleRuleModel= ruleRuleModel EOF
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
    // InternalRuleDsl.g:71:1: ruleRuleModel returns [EObject current=null] : ( ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRule ) )* )? ) ;
    public final EObject ruleRuleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:77:2: ( ( ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRule ) )* )? ) )
            // InternalRuleDsl.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRule ) )* )? )
            {
            // InternalRuleDsl.g:78:2: ( ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRule ) )* )? )
            // InternalRuleDsl.g:79:3: ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )? ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRule ) )* )?
            {
            // InternalRuleDsl.g:79:3: ( ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRuleDsl.g:80:4: ( (lv_imports_0_0= ruleImport ) ) ( (lv_imports_1_0= ruleImport ) )*
                    {
                    // InternalRuleDsl.g:80:4: ( (lv_imports_0_0= ruleImport ) )
                    // InternalRuleDsl.g:81:5: (lv_imports_0_0= ruleImport )
                    {
                    // InternalRuleDsl.g:81:5: (lv_imports_0_0= ruleImport )
                    // InternalRuleDsl.g:82:6: lv_imports_0_0= ruleImport
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
                    							"eagledata.core.dsl.rule.RuleDsl.Import");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRuleDsl.g:99:4: ( (lv_imports_1_0= ruleImport ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRuleDsl.g:100:5: (lv_imports_1_0= ruleImport )
                    	    {
                    	    // InternalRuleDsl.g:100:5: (lv_imports_1_0= ruleImport )
                    	    // InternalRuleDsl.g:101:6: lv_imports_1_0= ruleImport
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
                    	    							"eagledata.core.dsl.rule.RuleDsl.Import");
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

            // InternalRuleDsl.g:119:3: ( ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRule ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRuleDsl.g:120:4: ( (lv_elements_2_0= ruleRule ) ) ( (lv_elements_3_0= ruleRule ) )*
                    {
                    // InternalRuleDsl.g:120:4: ( (lv_elements_2_0= ruleRule ) )
                    // InternalRuleDsl.g:121:5: (lv_elements_2_0= ruleRule )
                    {
                    // InternalRuleDsl.g:121:5: (lv_elements_2_0= ruleRule )
                    // InternalRuleDsl.g:122:6: lv_elements_2_0= ruleRule
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
                    							"eagledata.core.dsl.rule.RuleDsl.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRuleDsl.g:139:4: ( (lv_elements_3_0= ruleRule ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRuleDsl.g:140:5: (lv_elements_3_0= ruleRule )
                    	    {
                    	    // InternalRuleDsl.g:140:5: (lv_elements_3_0= ruleRule )
                    	    // InternalRuleDsl.g:141:6: lv_elements_3_0= ruleRule
                    	    {

                    	    						newCompositeNode(grammarAccess.getRuleModelAccess().getElementsRuleParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_elements_3_0=ruleRule();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getRuleModelRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"elements",
                    	    							lv_elements_3_0,
                    	    							"eagledata.core.dsl.rule.RuleDsl.Rule");
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
    // InternalRuleDsl.g:163:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalRuleDsl.g:163:47: (iv_ruleImport= ruleImport EOF )
            // InternalRuleDsl.g:164:2: iv_ruleImport= ruleImport EOF
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
    // InternalRuleDsl.g:170:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:176:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalRuleDsl.g:177:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalRuleDsl.g:177:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalRuleDsl.g:178:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalRuleDsl.g:182:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalRuleDsl.g:183:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalRuleDsl.g:183:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalRuleDsl.g:184:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
            						"eagledata.core.dsl.rule.RuleDsl.QualifiedNameWithWildcard");
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
    // InternalRuleDsl.g:205:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalRuleDsl.g:205:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalRuleDsl.g:206:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalRuleDsl.g:212:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:218:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalRuleDsl.g:219:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalRuleDsl.g:219:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalRuleDsl.g:220:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalRuleDsl.g:230:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRuleDsl.g:231:4: kw= '.*'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

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
    // InternalRuleDsl.g:241:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalRuleDsl.g:241:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalRuleDsl.g:242:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalRuleDsl.g:248:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:254:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalRuleDsl.g:255:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalRuleDsl.g:255:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalRuleDsl.g:256:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalRuleDsl.g:263:3: (kw= '.' this_ID_2= RULE_ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRuleDsl.g:264:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,19,FOLLOW_5); 

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


    // $ANTLR start "entryRuleRule"
    // InternalRuleDsl.g:281:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalRuleDsl.g:281:45: (iv_ruleRule= ruleRule EOF )
            // InternalRuleDsl.g:282:2: iv_ruleRule= ruleRule EOF
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
    // InternalRuleDsl.g:288:1: ruleRule returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' otherlv_5= '{' ( ( (lv_actions_6_0= ruleAction ) ) ( (lv_actions_7_0= ruleAction ) )* ) otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_actions_6_0 = null;

        EObject lv_actions_7_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:294:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' otherlv_5= '{' ( ( (lv_actions_6_0= ruleAction ) ) ( (lv_actions_7_0= ruleAction ) )* ) otherlv_8= '}' otherlv_9= '}' ) )
            // InternalRuleDsl.g:295:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' otherlv_5= '{' ( ( (lv_actions_6_0= ruleAction ) ) ( (lv_actions_7_0= ruleAction ) )* ) otherlv_8= '}' otherlv_9= '}' )
            {
            // InternalRuleDsl.g:295:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' otherlv_5= '{' ( ( (lv_actions_6_0= ruleAction ) ) ( (lv_actions_7_0= ruleAction ) )* ) otherlv_8= '}' otherlv_9= '}' )
            // InternalRuleDsl.g:296:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'on' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'do' otherlv_5= '{' ( ( (lv_actions_6_0= ruleAction ) ) ( (lv_actions_7_0= ruleAction ) )* ) otherlv_8= '}' otherlv_9= '}'
            {
            // InternalRuleDsl.g:296:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRuleDsl.g:297:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRuleDsl.g:297:4: (lv_name_0_0= RULE_ID )
            // InternalRuleDsl.g:298:5: lv_name_0_0= RULE_ID
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

            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getOnKeyword_2());
            		
            // InternalRuleDsl.g:322:3: ( (otherlv_3= RULE_ID ) )
            // InternalRuleDsl.g:323:4: (otherlv_3= RULE_ID )
            {
            // InternalRuleDsl.g:323:4: (otherlv_3= RULE_ID )
            // InternalRuleDsl.g:324:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRuleRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getEventPhraseCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getDoKeyword_4());
            		
            otherlv_5=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalRuleDsl.g:343:3: ( ( (lv_actions_6_0= ruleAction ) ) ( (lv_actions_7_0= ruleAction ) )* )
            // InternalRuleDsl.g:344:4: ( (lv_actions_6_0= ruleAction ) ) ( (lv_actions_7_0= ruleAction ) )*
            {
            // InternalRuleDsl.g:344:4: ( (lv_actions_6_0= ruleAction ) )
            // InternalRuleDsl.g:345:5: (lv_actions_6_0= ruleAction )
            {
            // InternalRuleDsl.g:345:5: (lv_actions_6_0= ruleAction )
            // InternalRuleDsl.g:346:6: lv_actions_6_0= ruleAction
            {

            						newCompositeNode(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_6_0_0());
            					
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
            							"eagledata.core.dsl.rule.RuleDsl.Action");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRuleDsl.g:363:4: ( (lv_actions_7_0= ruleAction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRuleDsl.g:364:5: (lv_actions_7_0= ruleAction )
            	    {
            	    // InternalRuleDsl.g:364:5: (lv_actions_7_0= ruleAction )
            	    // InternalRuleDsl.g:365:6: lv_actions_7_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_actions_7_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_7_0,
            	    							"eagledata.core.dsl.rule.RuleDsl.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            otherlv_8=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalRuleDsl.g:395:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRuleDsl.g:395:47: (iv_ruleAction= ruleAction EOF )
            // InternalRuleDsl.g:396:2: iv_ruleAction= ruleAction EOF
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
    // InternalRuleDsl.g:402:1: ruleAction returns [EObject current=null] : (this_Query_0= ruleQuery | this_Message_1= ruleMessage ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_Query_0 = null;

        EObject this_Message_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:408:2: ( (this_Query_0= ruleQuery | this_Message_1= ruleMessage ) )
            // InternalRuleDsl.g:409:2: (this_Query_0= ruleQuery | this_Message_1= ruleMessage )
            {
            // InternalRuleDsl.g:409:2: (this_Query_0= ruleQuery | this_Message_1= ruleMessage )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==24) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==34) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==RULE_SELECTOPERATOR||LA8_2==27) ) {
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
                    // InternalRuleDsl.g:410:3: this_Query_0= ruleQuery
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
                    // InternalRuleDsl.g:419:3: this_Message_1= ruleMessage
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
    // InternalRuleDsl.g:431:1: entryRuleQuery returns [EObject current=null] : iv_ruleQuery= ruleQuery EOF ;
    public final EObject entryRuleQuery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuery = null;


        try {
            // InternalRuleDsl.g:431:46: (iv_ruleQuery= ruleQuery EOF )
            // InternalRuleDsl.g:432:2: iv_ruleQuery= ruleQuery EOF
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
    // InternalRuleDsl.g:438:1: ruleQuery returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) otherlv_3= 'then' otherlv_4= '{' ( ( (lv_then_5_0= ruleMessage ) ) ( (lv_then_6_0= ruleMessage ) )* ) otherlv_7= '}' ) ;
    public final EObject ruleQuery() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_select_2_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_then_6_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:444:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) otherlv_3= 'then' otherlv_4= '{' ( ( (lv_then_5_0= ruleMessage ) ) ( (lv_then_6_0= ruleMessage ) )* ) otherlv_7= '}' ) )
            // InternalRuleDsl.g:445:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) otherlv_3= 'then' otherlv_4= '{' ( ( (lv_then_5_0= ruleMessage ) ) ( (lv_then_6_0= ruleMessage ) )* ) otherlv_7= '}' )
            {
            // InternalRuleDsl.g:445:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) otherlv_3= 'then' otherlv_4= '{' ( ( (lv_then_5_0= ruleMessage ) ) ( (lv_then_6_0= ruleMessage ) )* ) otherlv_7= '}' )
            // InternalRuleDsl.g:446:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_select_2_0= ruleSelect ) ) otherlv_3= 'then' otherlv_4= '{' ( ( (lv_then_5_0= ruleMessage ) ) ( (lv_then_6_0= ruleMessage ) )* ) otherlv_7= '}'
            {
            // InternalRuleDsl.g:446:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRuleDsl.g:447:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRuleDsl.g:447:4: (lv_name_0_0= RULE_ID )
            // InternalRuleDsl.g:448:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getQueryAccess().getColonKeyword_1());
            		
            // InternalRuleDsl.g:468:3: ( (lv_select_2_0= ruleSelect ) )
            // InternalRuleDsl.g:469:4: (lv_select_2_0= ruleSelect )
            {
            // InternalRuleDsl.g:469:4: (lv_select_2_0= ruleSelect )
            // InternalRuleDsl.g:470:5: lv_select_2_0= ruleSelect
            {

            					newCompositeNode(grammarAccess.getQueryAccess().getSelectSelectParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
            lv_select_2_0=ruleSelect();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQueryRule());
            					}
            					set(
            						current,
            						"select",
            						lv_select_2_0,
            						"eagledata.core.dsl.rule.RuleDsl.Select");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getQueryAccess().getThenKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalRuleDsl.g:495:3: ( ( (lv_then_5_0= ruleMessage ) ) ( (lv_then_6_0= ruleMessage ) )* )
            // InternalRuleDsl.g:496:4: ( (lv_then_5_0= ruleMessage ) ) ( (lv_then_6_0= ruleMessage ) )*
            {
            // InternalRuleDsl.g:496:4: ( (lv_then_5_0= ruleMessage ) )
            // InternalRuleDsl.g:497:5: (lv_then_5_0= ruleMessage )
            {
            // InternalRuleDsl.g:497:5: (lv_then_5_0= ruleMessage )
            // InternalRuleDsl.g:498:6: lv_then_5_0= ruleMessage
            {

            						newCompositeNode(grammarAccess.getQueryAccess().getThenMessageParserRuleCall_5_0_0());
            					
            pushFollow(FOLLOW_11);
            lv_then_5_0=ruleMessage();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getQueryRule());
            						}
            						add(
            							current,
            							"then",
            							lv_then_5_0,
            							"eagledata.core.dsl.rule.RuleDsl.Message");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRuleDsl.g:515:4: ( (lv_then_6_0= ruleMessage ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRuleDsl.g:516:5: (lv_then_6_0= ruleMessage )
            	    {
            	    // InternalRuleDsl.g:516:5: (lv_then_6_0= ruleMessage )
            	    // InternalRuleDsl.g:517:6: lv_then_6_0= ruleMessage
            	    {

            	    						newCompositeNode(grammarAccess.getQueryAccess().getThenMessageParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_then_6_0=ruleMessage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getQueryRule());
            	    						}
            	    						add(
            	    							current,
            	    							"then",
            	    							lv_then_6_0,
            	    							"eagledata.core.dsl.rule.RuleDsl.Message");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalRuleDsl.g:543:1: entryRuleAddingSelect returns [EObject current=null] : iv_ruleAddingSelect= ruleAddingSelect EOF ;
    public final EObject entryRuleAddingSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddingSelect = null;


        try {
            // InternalRuleDsl.g:543:53: (iv_ruleAddingSelect= ruleAddingSelect EOF )
            // InternalRuleDsl.g:544:2: iv_ruleAddingSelect= ruleAddingSelect EOF
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
    // InternalRuleDsl.g:550:1: ruleAddingSelect returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) ) ;
    public final EObject ruleAddingSelect() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token otherlv_1=null;
        Token lv_all_2_0=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:556:2: ( ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) ) )
            // InternalRuleDsl.g:557:2: ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) )
            {
            // InternalRuleDsl.g:557:2: ( ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) ) )
            // InternalRuleDsl.g:558:3: ( (lv_operation_0_0= RULE_SELECTOPERATOR ) ) ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) )
            {
            // InternalRuleDsl.g:558:3: ( (lv_operation_0_0= RULE_SELECTOPERATOR ) )
            // InternalRuleDsl.g:559:4: (lv_operation_0_0= RULE_SELECTOPERATOR )
            {
            // InternalRuleDsl.g:559:4: (lv_operation_0_0= RULE_SELECTOPERATOR )
            // InternalRuleDsl.g:560:5: lv_operation_0_0= RULE_SELECTOPERATOR
            {
            lv_operation_0_0=(Token)match(input,RULE_SELECTOPERATOR,FOLLOW_16); 

            					newLeafNode(lv_operation_0_0, grammarAccess.getAddingSelectAccess().getOperationSELECTOPERATORTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAddingSelectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operation",
            						lv_operation_0_0,
            						"eagledata.core.dsl.rule.RuleDsl.SELECTOPERATOR");
            				

            }


            }

            // InternalRuleDsl.g:576:3: ( ( (otherlv_1= RULE_ID ) )? | ( (lv_all_2_0= '*' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EOF||LA11_0==RULE_ID||LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRuleDsl.g:577:4: ( (otherlv_1= RULE_ID ) )?
                    {
                    // InternalRuleDsl.g:577:4: ( (otherlv_1= RULE_ID ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalRuleDsl.g:578:5: (otherlv_1= RULE_ID )
                            {
                            // InternalRuleDsl.g:578:5: (otherlv_1= RULE_ID )
                            // InternalRuleDsl.g:579:6: otherlv_1= RULE_ID
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
                    // InternalRuleDsl.g:591:4: ( (lv_all_2_0= '*' ) )
                    {
                    // InternalRuleDsl.g:591:4: ( (lv_all_2_0= '*' ) )
                    // InternalRuleDsl.g:592:5: (lv_all_2_0= '*' )
                    {
                    // InternalRuleDsl.g:592:5: (lv_all_2_0= '*' )
                    // InternalRuleDsl.g:593:6: lv_all_2_0= '*'
                    {
                    lv_all_2_0=(Token)match(input,26,FOLLOW_2); 

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
    // InternalRuleDsl.g:610:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalRuleDsl.g:610:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalRuleDsl.g:611:2: iv_ruleSelect= ruleSelect EOF
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
    // InternalRuleDsl.g:617:1: ruleSelect returns [EObject current=null] : (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        EObject this_AddingSelect_0 = null;

        EObject this_SetSelect_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:623:2: ( (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect ) )
            // InternalRuleDsl.g:624:2: (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect )
            {
            // InternalRuleDsl.g:624:2: (this_AddingSelect_0= ruleAddingSelect | this_SetSelect_1= ruleSetSelect )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_SELECTOPERATOR) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalRuleDsl.g:625:3: this_AddingSelect_0= ruleAddingSelect
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
                    // InternalRuleDsl.g:634:3: this_SetSelect_1= ruleSetSelect
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
    // InternalRuleDsl.g:646:1: entryRuleSetSelect returns [EObject current=null] : iv_ruleSetSelect= ruleSetSelect EOF ;
    public final EObject entryRuleSetSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetSelect = null;


        try {
            // InternalRuleDsl.g:646:50: (iv_ruleSetSelect= ruleSetSelect EOF )
            // InternalRuleDsl.g:647:2: iv_ruleSetSelect= ruleSetSelect EOF
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
    // InternalRuleDsl.g:653:1: ruleSetSelect returns [EObject current=null] : (otherlv_0= 'select' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= 'from' ( ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* ) (otherlv_8= 'where' ( ( (lv_where_9_0= ruleWhere ) ) (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )* ) )? ) ;
    public final EObject ruleSetSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_where_9_0 = null;

        EObject lv_where_11_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:659:2: ( (otherlv_0= 'select' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= 'from' ( ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* ) (otherlv_8= 'where' ( ( (lv_where_9_0= ruleWhere ) ) (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )* ) )? ) )
            // InternalRuleDsl.g:660:2: (otherlv_0= 'select' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= 'from' ( ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* ) (otherlv_8= 'where' ( ( (lv_where_9_0= ruleWhere ) ) (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )* ) )? )
            {
            // InternalRuleDsl.g:660:2: (otherlv_0= 'select' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= 'from' ( ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* ) (otherlv_8= 'where' ( ( (lv_where_9_0= ruleWhere ) ) (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )* ) )? )
            // InternalRuleDsl.g:661:3: otherlv_0= 'select' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= 'from' ( ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* ) (otherlv_8= 'where' ( ( (lv_where_9_0= ruleWhere ) ) (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )* ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSetSelectAccess().getSelectKeyword_0());
            		
            // InternalRuleDsl.g:665:3: ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalRuleDsl.g:666:4: ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            {
            // InternalRuleDsl.g:666:4: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:667:5: ( ruleQualifiedName )
            {
            // InternalRuleDsl.g:667:5: ( ruleQualifiedName )
            // InternalRuleDsl.g:668:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getSetSelectRule());
            						}
            					

            						newCompositeNode(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeCrossReference_1_0_0());
            					
            pushFollow(FOLLOW_17);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRuleDsl.g:682:4: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==28) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRuleDsl.g:683:5: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_5); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSetSelectAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalRuleDsl.g:687:5: ( ( ruleQualifiedName ) )
            	    // InternalRuleDsl.g:688:6: ( ruleQualifiedName )
            	    {
            	    // InternalRuleDsl.g:688:6: ( ruleQualifiedName )
            	    // InternalRuleDsl.g:689:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSetSelectRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeCrossReference_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_17);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getSetSelectAccess().getFromKeyword_2());
            		
            // InternalRuleDsl.g:709:3: ( ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalRuleDsl.g:710:4: ( ( ruleQualifiedName ) ) (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
            {
            // InternalRuleDsl.g:710:4: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:711:5: ( ruleQualifiedName )
            {
            // InternalRuleDsl.g:711:5: ( ruleQualifiedName )
            // InternalRuleDsl.g:712:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getSetSelectRule());
            						}
            					

            						newCompositeNode(grammarAccess.getSetSelectAccess().getFromDataDescriptionCrossReference_3_0_0());
            					
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRuleDsl.g:726:4: (otherlv_6= ',' ( ( ruleQualifiedName ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==28) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRuleDsl.g:727:5: otherlv_6= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_6=(Token)match(input,28,FOLLOW_5); 

            	    					newLeafNode(otherlv_6, grammarAccess.getSetSelectAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalRuleDsl.g:731:5: ( ( ruleQualifiedName ) )
            	    // InternalRuleDsl.g:732:6: ( ruleQualifiedName )
            	    {
            	    // InternalRuleDsl.g:732:6: ( ruleQualifiedName )
            	    // InternalRuleDsl.g:733:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSetSelectRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getSetSelectAccess().getFromDataDescriptionCrossReference_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_18);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            // InternalRuleDsl.g:749:3: (otherlv_8= 'where' ( ( (lv_where_9_0= ruleWhere ) ) (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )* ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRuleDsl.g:750:4: otherlv_8= 'where' ( ( (lv_where_9_0= ruleWhere ) ) (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )* )
                    {
                    otherlv_8=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_8, grammarAccess.getSetSelectAccess().getWhereKeyword_4_0());
                    			
                    // InternalRuleDsl.g:754:4: ( ( (lv_where_9_0= ruleWhere ) ) (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )* )
                    // InternalRuleDsl.g:755:5: ( (lv_where_9_0= ruleWhere ) ) (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )*
                    {
                    // InternalRuleDsl.g:755:5: ( (lv_where_9_0= ruleWhere ) )
                    // InternalRuleDsl.g:756:6: (lv_where_9_0= ruleWhere )
                    {
                    // InternalRuleDsl.g:756:6: (lv_where_9_0= ruleWhere )
                    // InternalRuleDsl.g:757:7: lv_where_9_0= ruleWhere
                    {

                    							newCompositeNode(grammarAccess.getSetSelectAccess().getWhereWhereParserRuleCall_4_1_0_0());
                    						
                    pushFollow(FOLLOW_19);
                    lv_where_9_0=ruleWhere();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getSetSelectRule());
                    							}
                    							add(
                    								current,
                    								"where",
                    								lv_where_9_0,
                    								"eagledata.core.dsl.rule.RuleDsl.Where");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRuleDsl.g:774:5: (otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==31) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRuleDsl.g:775:6: otherlv_10= 'AND' ( (lv_where_11_0= ruleWhere ) )
                    	    {
                    	    otherlv_10=(Token)match(input,31,FOLLOW_5); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getSetSelectAccess().getANDKeyword_4_1_1_0());
                    	    					
                    	    // InternalRuleDsl.g:779:6: ( (lv_where_11_0= ruleWhere ) )
                    	    // InternalRuleDsl.g:780:7: (lv_where_11_0= ruleWhere )
                    	    {
                    	    // InternalRuleDsl.g:780:7: (lv_where_11_0= ruleWhere )
                    	    // InternalRuleDsl.g:781:8: lv_where_11_0= ruleWhere
                    	    {

                    	    								newCompositeNode(grammarAccess.getSetSelectAccess().getWhereWhereParserRuleCall_4_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_19);
                    	    lv_where_11_0=ruleWhere();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getSetSelectRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"where",
                    	    									lv_where_11_0,
                    	    									"eagledata.core.dsl.rule.RuleDsl.Where");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


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
    // InternalRuleDsl.g:805:1: entryRuleWhere returns [EObject current=null] : iv_ruleWhere= ruleWhere EOF ;
    public final EObject entryRuleWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhere = null;


        try {
            // InternalRuleDsl.g:805:46: (iv_ruleWhere= ruleWhere EOF )
            // InternalRuleDsl.g:806:2: iv_ruleWhere= ruleWhere EOF
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
    // InternalRuleDsl.g:812:1: ruleWhere returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_logicalOperator_1_0= RULE_LOGICALOPERATOR ) ) ( ( ( ruleQualifiedName ) ) | (otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '}' ) ) ) ;
    public final EObject ruleWhere() throws RecognitionException {
        EObject current = null;

        Token lv_logicalOperator_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:818:2: ( ( ( ( ruleQualifiedName ) ) ( (lv_logicalOperator_1_0= RULE_LOGICALOPERATOR ) ) ( ( ( ruleQualifiedName ) ) | (otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '}' ) ) ) )
            // InternalRuleDsl.g:819:2: ( ( ( ruleQualifiedName ) ) ( (lv_logicalOperator_1_0= RULE_LOGICALOPERATOR ) ) ( ( ( ruleQualifiedName ) ) | (otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '}' ) ) )
            {
            // InternalRuleDsl.g:819:2: ( ( ( ruleQualifiedName ) ) ( (lv_logicalOperator_1_0= RULE_LOGICALOPERATOR ) ) ( ( ( ruleQualifiedName ) ) | (otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '}' ) ) )
            // InternalRuleDsl.g:820:3: ( ( ruleQualifiedName ) ) ( (lv_logicalOperator_1_0= RULE_LOGICALOPERATOR ) ) ( ( ( ruleQualifiedName ) ) | (otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '}' ) )
            {
            // InternalRuleDsl.g:820:3: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:821:4: ( ruleQualifiedName )
            {
            // InternalRuleDsl.g:821:4: ( ruleQualifiedName )
            // InternalRuleDsl.g:822:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereRule());
            					}
            				

            					newCompositeNode(grammarAccess.getWhereAccess().getLeftPrimitiveNodeCrossReference_0_0());
            				
            pushFollow(FOLLOW_20);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRuleDsl.g:836:3: ( (lv_logicalOperator_1_0= RULE_LOGICALOPERATOR ) )
            // InternalRuleDsl.g:837:4: (lv_logicalOperator_1_0= RULE_LOGICALOPERATOR )
            {
            // InternalRuleDsl.g:837:4: (lv_logicalOperator_1_0= RULE_LOGICALOPERATOR )
            // InternalRuleDsl.g:838:5: lv_logicalOperator_1_0= RULE_LOGICALOPERATOR
            {
            lv_logicalOperator_1_0=(Token)match(input,RULE_LOGICALOPERATOR,FOLLOW_21); 

            					newLeafNode(lv_logicalOperator_1_0, grammarAccess.getWhereAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWhereRule());
            					}
            					setWithLastConsumed(
            						current,
            						"logicalOperator",
            						lv_logicalOperator_1_0,
            						"eagledata.core.dsl.rule.RuleDsl.LOGICALOPERATOR");
            				

            }


            }

            // InternalRuleDsl.g:854:3: ( ( ( ruleQualifiedName ) ) | (otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '}' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==20) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalRuleDsl.g:855:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalRuleDsl.g:855:4: ( ( ruleQualifiedName ) )
                    // InternalRuleDsl.g:856:5: ( ruleQualifiedName )
                    {
                    // InternalRuleDsl.g:856:5: ( ruleQualifiedName )
                    // InternalRuleDsl.g:857:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWhereAccess().getRightPrimitiveNodeCrossReference_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:872:4: (otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '}' )
                    {
                    // InternalRuleDsl.g:872:4: (otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '}' )
                    // InternalRuleDsl.g:873:5: otherlv_3= '{' ( ( ruleQualifiedName ) ) otherlv_5= '}'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_5); 

                    					newLeafNode(otherlv_3, grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_2_1_0());
                    				
                    // InternalRuleDsl.g:877:5: ( ( ruleQualifiedName ) )
                    // InternalRuleDsl.g:878:6: ( ruleQualifiedName )
                    {
                    // InternalRuleDsl.g:878:6: ( ruleQualifiedName )
                    // InternalRuleDsl.g:879:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getWhereRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getWhereAccess().getRightStreamingConceptCrossReference_2_1_1_0());
                    						
                    pushFollow(FOLLOW_12);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_2_1_2());
                    				

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


    // $ANTLR start "entryRuleExpression"
    // InternalRuleDsl.g:903:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalRuleDsl.g:903:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalRuleDsl.g:904:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalRuleDsl.g:910:1: ruleExpression returns [EObject current=null] : (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlainExpression_0 = null;

        EObject this_ComplexExpression_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:916:2: ( (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression ) )
            // InternalRuleDsl.g:917:2: (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression )
            {
            // InternalRuleDsl.g:917:2: (this_PlainExpression_0= rulePlainExpression | this_ComplexExpression_1= ruleComplexExpression )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID||LA18_0==RULE_DOUBLE) ) {
                alt18=1;
            }
            else if ( (LA18_0==32) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalRuleDsl.g:918:3: this_PlainExpression_0= rulePlainExpression
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
                    // InternalRuleDsl.g:927:3: this_ComplexExpression_1= ruleComplexExpression
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
    // InternalRuleDsl.g:939:1: entryRulePlainExpression returns [EObject current=null] : iv_rulePlainExpression= rulePlainExpression EOF ;
    public final EObject entryRulePlainExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainExpression = null;


        try {
            // InternalRuleDsl.g:939:56: (iv_rulePlainExpression= rulePlainExpression EOF )
            // InternalRuleDsl.g:940:2: iv_rulePlainExpression= rulePlainExpression EOF
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
    // InternalRuleDsl.g:946:1: rulePlainExpression returns [EObject current=null] : ( (lv_plainOperand_0_0= rulePlainOperand ) ) ;
    public final EObject rulePlainExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_plainOperand_0_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:952:2: ( ( (lv_plainOperand_0_0= rulePlainOperand ) ) )
            // InternalRuleDsl.g:953:2: ( (lv_plainOperand_0_0= rulePlainOperand ) )
            {
            // InternalRuleDsl.g:953:2: ( (lv_plainOperand_0_0= rulePlainOperand ) )
            // InternalRuleDsl.g:954:3: (lv_plainOperand_0_0= rulePlainOperand )
            {
            // InternalRuleDsl.g:954:3: (lv_plainOperand_0_0= rulePlainOperand )
            // InternalRuleDsl.g:955:4: lv_plainOperand_0_0= rulePlainOperand
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
            					"eagledata.core.dsl.rule.RuleDsl.PlainOperand");
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
    // InternalRuleDsl.g:975:1: entryRuleComplexExpression returns [EObject current=null] : iv_ruleComplexExpression= ruleComplexExpression EOF ;
    public final EObject entryRuleComplexExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexExpression = null;


        try {
            // InternalRuleDsl.g:975:58: (iv_ruleComplexExpression= ruleComplexExpression EOF )
            // InternalRuleDsl.g:976:2: iv_ruleComplexExpression= ruleComplexExpression EOF
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
    // InternalRuleDsl.g:982:1: ruleComplexExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' ) ;
    public final EObject ruleComplexExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject lv_plainOperand_1_0 = null;

        EObject lv_complexOperands_2_0 = null;

        EObject lv_complexOperands_3_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:988:2: ( (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' ) )
            // InternalRuleDsl.g:989:2: (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' )
            {
            // InternalRuleDsl.g:989:2: (otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')' )
            // InternalRuleDsl.g:990:3: otherlv_0= '(' ( (lv_plainOperand_1_0= rulePlainOperand ) ) ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )? otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0());
            		
            // InternalRuleDsl.g:994:3: ( (lv_plainOperand_1_0= rulePlainOperand ) )
            // InternalRuleDsl.g:995:4: (lv_plainOperand_1_0= rulePlainOperand )
            {
            // InternalRuleDsl.g:995:4: (lv_plainOperand_1_0= rulePlainOperand )
            // InternalRuleDsl.g:996:5: lv_plainOperand_1_0= rulePlainOperand
            {

            					newCompositeNode(grammarAccess.getComplexExpressionAccess().getPlainOperandPlainOperandParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_plainOperand_1_0=rulePlainOperand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
            					}
            					set(
            						current,
            						"plainOperand",
            						lv_plainOperand_1_0,
            						"eagledata.core.dsl.rule.RuleDsl.PlainOperand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRuleDsl.g:1013:3: ( ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_OPERATOR) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRuleDsl.g:1014:4: ( (lv_complexOperands_2_0= ruleComplexOperand ) ) ( (lv_complexOperands_3_0= ruleComplexOperand ) )*
                    {
                    // InternalRuleDsl.g:1014:4: ( (lv_complexOperands_2_0= ruleComplexOperand ) )
                    // InternalRuleDsl.g:1015:5: (lv_complexOperands_2_0= ruleComplexOperand )
                    {
                    // InternalRuleDsl.g:1015:5: (lv_complexOperands_2_0= ruleComplexOperand )
                    // InternalRuleDsl.g:1016:6: lv_complexOperands_2_0= ruleComplexOperand
                    {

                    						newCompositeNode(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_complexOperands_2_0=ruleComplexOperand();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    						}
                    						add(
                    							current,
                    							"complexOperands",
                    							lv_complexOperands_2_0,
                    							"eagledata.core.dsl.rule.RuleDsl.ComplexOperand");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRuleDsl.g:1033:4: ( (lv_complexOperands_3_0= ruleComplexOperand ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_OPERATOR) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRuleDsl.g:1034:5: (lv_complexOperands_3_0= ruleComplexOperand )
                    	    {
                    	    // InternalRuleDsl.g:1034:5: (lv_complexOperands_3_0= ruleComplexOperand )
                    	    // InternalRuleDsl.g:1035:6: lv_complexOperands_3_0= ruleComplexOperand
                    	    {

                    	    						newCompositeNode(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_23);
                    	    lv_complexOperands_3_0=ruleComplexOperand();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComplexExpressionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"complexOperands",
                    	    							lv_complexOperands_3_0,
                    	    							"eagledata.core.dsl.rule.RuleDsl.ComplexOperand");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_2); 

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
    // InternalRuleDsl.g:1061:1: entryRulePlainOperand returns [EObject current=null] : iv_rulePlainOperand= rulePlainOperand EOF ;
    public final EObject entryRulePlainOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlainOperand = null;


        try {
            // InternalRuleDsl.g:1061:53: (iv_rulePlainOperand= rulePlainOperand EOF )
            // InternalRuleDsl.g:1062:2: iv_rulePlainOperand= rulePlainOperand EOF
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
    // InternalRuleDsl.g:1068:1: rulePlainOperand returns [EObject current=null] : (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand ) ;
    public final EObject rulePlainOperand() throws RecognitionException {
        EObject current = null;

        EObject this_Numeral_0 = null;

        EObject this_QueryOperand_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:1074:2: ( (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand ) )
            // InternalRuleDsl.g:1075:2: (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand )
            {
            // InternalRuleDsl.g:1075:2: (this_Numeral_0= ruleNumeral | this_QueryOperand_1= ruleQueryOperand )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DOUBLE) ) {
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
                    // InternalRuleDsl.g:1076:3: this_Numeral_0= ruleNumeral
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
                    // InternalRuleDsl.g:1085:3: this_QueryOperand_1= ruleQueryOperand
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
    // InternalRuleDsl.g:1097:1: entryRuleNumeral returns [EObject current=null] : iv_ruleNumeral= ruleNumeral EOF ;
    public final EObject entryRuleNumeral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumeral = null;


        try {
            // InternalRuleDsl.g:1097:48: (iv_ruleNumeral= ruleNumeral EOF )
            // InternalRuleDsl.g:1098:2: iv_ruleNumeral= ruleNumeral EOF
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
    // InternalRuleDsl.g:1104:1: ruleNumeral returns [EObject current=null] : ( (lv_value_0_0= RULE_DOUBLE ) ) ;
    public final EObject ruleNumeral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:1110:2: ( ( (lv_value_0_0= RULE_DOUBLE ) ) )
            // InternalRuleDsl.g:1111:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            {
            // InternalRuleDsl.g:1111:2: ( (lv_value_0_0= RULE_DOUBLE ) )
            // InternalRuleDsl.g:1112:3: (lv_value_0_0= RULE_DOUBLE )
            {
            // InternalRuleDsl.g:1112:3: (lv_value_0_0= RULE_DOUBLE )
            // InternalRuleDsl.g:1113:4: lv_value_0_0= RULE_DOUBLE
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
            					"eagledata.core.dsl.rule.RuleDsl.DOUBLE");
            			

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
    // InternalRuleDsl.g:1132:1: entryRuleQueryOperand returns [EObject current=null] : iv_ruleQueryOperand= ruleQueryOperand EOF ;
    public final EObject entryRuleQueryOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryOperand = null;


        try {
            // InternalRuleDsl.g:1132:53: (iv_ruleQueryOperand= ruleQueryOperand EOF )
            // InternalRuleDsl.g:1133:2: iv_ruleQueryOperand= ruleQueryOperand EOF
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
    // InternalRuleDsl.g:1139:1: ruleQueryOperand returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleQueryOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:1145:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalRuleDsl.g:1146:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalRuleDsl.g:1146:2: ( (otherlv_0= RULE_ID ) )
            // InternalRuleDsl.g:1147:3: (otherlv_0= RULE_ID )
            {
            // InternalRuleDsl.g:1147:3: (otherlv_0= RULE_ID )
            // InternalRuleDsl.g:1148:4: otherlv_0= RULE_ID
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
    // InternalRuleDsl.g:1162:1: entryRuleComplexOperand returns [EObject current=null] : iv_ruleComplexOperand= ruleComplexOperand EOF ;
    public final EObject entryRuleComplexOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexOperand = null;


        try {
            // InternalRuleDsl.g:1162:55: (iv_ruleComplexOperand= ruleComplexOperand EOF )
            // InternalRuleDsl.g:1163:2: iv_ruleComplexOperand= ruleComplexOperand EOF
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
    // InternalRuleDsl.g:1169:1: ruleComplexOperand returns [EObject current=null] : ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleComplexOperand() throws RecognitionException {
        EObject current = null;

        Token lv_operator_0_0=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:1175:2: ( ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalRuleDsl.g:1176:2: ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalRuleDsl.g:1176:2: ( ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) ) )
            // InternalRuleDsl.g:1177:3: ( (lv_operator_0_0= RULE_OPERATOR ) ) ( (lv_expression_1_0= ruleExpression ) )
            {
            // InternalRuleDsl.g:1177:3: ( (lv_operator_0_0= RULE_OPERATOR ) )
            // InternalRuleDsl.g:1178:4: (lv_operator_0_0= RULE_OPERATOR )
            {
            // InternalRuleDsl.g:1178:4: (lv_operator_0_0= RULE_OPERATOR )
            // InternalRuleDsl.g:1179:5: lv_operator_0_0= RULE_OPERATOR
            {
            lv_operator_0_0=(Token)match(input,RULE_OPERATOR,FOLLOW_24); 

            					newLeafNode(lv_operator_0_0, grammarAccess.getComplexOperandAccess().getOperatorOPERATORTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexOperandRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_0_0,
            						"eagledata.core.dsl.rule.RuleDsl.OPERATOR");
            				

            }


            }

            // InternalRuleDsl.g:1195:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalRuleDsl.g:1196:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalRuleDsl.g:1196:4: (lv_expression_1_0= ruleExpression )
            // InternalRuleDsl.g:1197:5: lv_expression_1_0= ruleExpression
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
            						"eagledata.core.dsl.rule.RuleDsl.Expression");
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
    // InternalRuleDsl.g:1218:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // InternalRuleDsl.g:1218:48: (iv_ruleMessage= ruleMessage EOF )
            // InternalRuleDsl.g:1219:2: iv_ruleMessage= ruleMessage EOF
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
    // InternalRuleDsl.g:1225:1: ruleMessage returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( ( (lv_message_3_0= ruleMessageString ) ) (otherlv_4= '+' ( (lv_message_5_0= ruleMessageString ) ) )* ) (otherlv_6= 'to' ( (lv_recipient_7_0= ruleReceiver ) ) )? ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_message_3_0 = null;

        EObject lv_message_5_0 = null;

        EObject lv_recipient_7_0 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:1231:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( ( (lv_message_3_0= ruleMessageString ) ) (otherlv_4= '+' ( (lv_message_5_0= ruleMessageString ) ) )* ) (otherlv_6= 'to' ( (lv_recipient_7_0= ruleReceiver ) ) )? ) )
            // InternalRuleDsl.g:1232:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( ( (lv_message_3_0= ruleMessageString ) ) (otherlv_4= '+' ( (lv_message_5_0= ruleMessageString ) ) )* ) (otherlv_6= 'to' ( (lv_recipient_7_0= ruleReceiver ) ) )? )
            {
            // InternalRuleDsl.g:1232:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( ( (lv_message_3_0= ruleMessageString ) ) (otherlv_4= '+' ( (lv_message_5_0= ruleMessageString ) ) )* ) (otherlv_6= 'to' ( (lv_recipient_7_0= ruleReceiver ) ) )? )
            // InternalRuleDsl.g:1233:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= 'compose' ( ( (lv_message_3_0= ruleMessageString ) ) (otherlv_4= '+' ( (lv_message_5_0= ruleMessageString ) ) )* ) (otherlv_6= 'to' ( (lv_recipient_7_0= ruleReceiver ) ) )?
            {
            // InternalRuleDsl.g:1233:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRuleDsl.g:1234:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRuleDsl.g:1234:4: (lv_name_0_0= RULE_ID )
            // InternalRuleDsl.g:1235:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            otherlv_1=(Token)match(input,24,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getComposeKeyword_2());
            		
            // InternalRuleDsl.g:1259:3: ( ( (lv_message_3_0= ruleMessageString ) ) (otherlv_4= '+' ( (lv_message_5_0= ruleMessageString ) ) )* )
            // InternalRuleDsl.g:1260:4: ( (lv_message_3_0= ruleMessageString ) ) (otherlv_4= '+' ( (lv_message_5_0= ruleMessageString ) ) )*
            {
            // InternalRuleDsl.g:1260:4: ( (lv_message_3_0= ruleMessageString ) )
            // InternalRuleDsl.g:1261:5: (lv_message_3_0= ruleMessageString )
            {
            // InternalRuleDsl.g:1261:5: (lv_message_3_0= ruleMessageString )
            // InternalRuleDsl.g:1262:6: lv_message_3_0= ruleMessageString
            {

            						newCompositeNode(grammarAccess.getMessageAccess().getMessageMessageStringParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_27);
            lv_message_3_0=ruleMessageString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMessageRule());
            						}
            						add(
            							current,
            							"message",
            							lv_message_3_0,
            							"eagledata.core.dsl.rule.RuleDsl.MessageString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRuleDsl.g:1279:4: (otherlv_4= '+' ( (lv_message_5_0= ruleMessageString ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRuleDsl.g:1280:5: otherlv_4= '+' ( (lv_message_5_0= ruleMessageString ) )
            	    {
            	    otherlv_4=(Token)match(input,35,FOLLOW_26); 

            	    					newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getPlusSignKeyword_3_1_0());
            	    				
            	    // InternalRuleDsl.g:1284:5: ( (lv_message_5_0= ruleMessageString ) )
            	    // InternalRuleDsl.g:1285:6: (lv_message_5_0= ruleMessageString )
            	    {
            	    // InternalRuleDsl.g:1285:6: (lv_message_5_0= ruleMessageString )
            	    // InternalRuleDsl.g:1286:7: lv_message_5_0= ruleMessageString
            	    {

            	    							newCompositeNode(grammarAccess.getMessageAccess().getMessageMessageStringParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_27);
            	    lv_message_5_0=ruleMessageString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMessageRule());
            	    							}
            	    							add(
            	    								current,
            	    								"message",
            	    								lv_message_5_0,
            	    								"eagledata.core.dsl.rule.RuleDsl.MessageString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            // InternalRuleDsl.g:1305:3: (otherlv_6= 'to' ( (lv_recipient_7_0= ruleReceiver ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRuleDsl.g:1306:4: otherlv_6= 'to' ( (lv_recipient_7_0= ruleReceiver ) )
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getToKeyword_4_0());
                    			
                    // InternalRuleDsl.g:1310:4: ( (lv_recipient_7_0= ruleReceiver ) )
                    // InternalRuleDsl.g:1311:5: (lv_recipient_7_0= ruleReceiver )
                    {
                    // InternalRuleDsl.g:1311:5: (lv_recipient_7_0= ruleReceiver )
                    // InternalRuleDsl.g:1312:6: lv_recipient_7_0= ruleReceiver
                    {

                    						newCompositeNode(grammarAccess.getMessageAccess().getRecipientReceiverParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_recipient_7_0=ruleReceiver();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageRule());
                    						}
                    						set(
                    							current,
                    							"recipient",
                    							lv_recipient_7_0,
                    							"eagledata.core.dsl.rule.RuleDsl.Receiver");
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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageString"
    // InternalRuleDsl.g:1334:1: entryRuleMessageString returns [EObject current=null] : iv_ruleMessageString= ruleMessageString EOF ;
    public final EObject entryRuleMessageString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageString = null;


        try {
            // InternalRuleDsl.g:1334:54: (iv_ruleMessageString= ruleMessageString EOF )
            // InternalRuleDsl.g:1335:2: iv_ruleMessageString= ruleMessageString EOF
            {
             newCompositeNode(grammarAccess.getMessageStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageString=ruleMessageString();

            state._fsp--;

             current =iv_ruleMessageString; 
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
    // $ANTLR end "entryRuleMessageString"


    // $ANTLR start "ruleMessageString"
    // InternalRuleDsl.g:1341:1: ruleMessageString returns [EObject current=null] : (this_TextMessageString_0= ruleTextMessageString | this_SelectMessageString_1= ruleSelectMessageString ) ;
    public final EObject ruleMessageString() throws RecognitionException {
        EObject current = null;

        EObject this_TextMessageString_0 = null;

        EObject this_SelectMessageString_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:1347:2: ( (this_TextMessageString_0= ruleTextMessageString | this_SelectMessageString_1= ruleSelectMessageString ) )
            // InternalRuleDsl.g:1348:2: (this_TextMessageString_0= ruleTextMessageString | this_SelectMessageString_1= ruleSelectMessageString )
            {
            // InternalRuleDsl.g:1348:2: (this_TextMessageString_0= ruleTextMessageString | this_SelectMessageString_1= ruleSelectMessageString )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING) ) {
                alt24=1;
            }
            else if ( (LA24_0==20) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalRuleDsl.g:1349:3: this_TextMessageString_0= ruleTextMessageString
                    {

                    			newCompositeNode(grammarAccess.getMessageStringAccess().getTextMessageStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextMessageString_0=ruleTextMessageString();

                    state._fsp--;


                    			current = this_TextMessageString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1358:3: this_SelectMessageString_1= ruleSelectMessageString
                    {

                    			newCompositeNode(grammarAccess.getMessageStringAccess().getSelectMessageStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectMessageString_1=ruleSelectMessageString();

                    state._fsp--;


                    			current = this_SelectMessageString_1;
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
    // $ANTLR end "ruleMessageString"


    // $ANTLR start "entryRuleSelectMessageString"
    // InternalRuleDsl.g:1370:1: entryRuleSelectMessageString returns [EObject current=null] : iv_ruleSelectMessageString= ruleSelectMessageString EOF ;
    public final EObject entryRuleSelectMessageString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectMessageString = null;


        try {
            // InternalRuleDsl.g:1370:60: (iv_ruleSelectMessageString= ruleSelectMessageString EOF )
            // InternalRuleDsl.g:1371:2: iv_ruleSelectMessageString= ruleSelectMessageString EOF
            {
             newCompositeNode(grammarAccess.getSelectMessageStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectMessageString=ruleSelectMessageString();

            state._fsp--;

             current =iv_ruleSelectMessageString; 
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
    // $ANTLR end "entryRuleSelectMessageString"


    // $ANTLR start "ruleSelectMessageString"
    // InternalRuleDsl.g:1377:1: ruleSelectMessageString returns [EObject current=null] : (otherlv_0= '{' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleSelectMessageString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:1383:2: ( (otherlv_0= '{' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= '}' ) )
            // InternalRuleDsl.g:1384:2: (otherlv_0= '{' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= '}' )
            {
            // InternalRuleDsl.g:1384:2: (otherlv_0= '{' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= '}' )
            // InternalRuleDsl.g:1385:3: otherlv_0= '{' ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectMessageStringAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRuleDsl.g:1389:3: ( ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* )
            // InternalRuleDsl.g:1390:4: ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            {
            // InternalRuleDsl.g:1390:4: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:1391:5: ( ruleQualifiedName )
            {
            // InternalRuleDsl.g:1391:5: ( ruleQualifiedName )
            // InternalRuleDsl.g:1392:6: ruleQualifiedName
            {

            						if (current==null) {
            							current = createModelElement(grammarAccess.getSelectMessageStringRule());
            						}
            					

            						newCompositeNode(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeCrossReference_1_0_0());
            					
            pushFollow(FOLLOW_29);
            ruleQualifiedName();

            state._fsp--;


            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalRuleDsl.g:1406:4: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRuleDsl.g:1407:5: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_5); 

            	    					newLeafNode(otherlv_2, grammarAccess.getSelectMessageStringAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalRuleDsl.g:1411:5: ( ( ruleQualifiedName ) )
            	    // InternalRuleDsl.g:1412:6: ( ruleQualifiedName )
            	    {
            	    // InternalRuleDsl.g:1412:6: ( ruleQualifiedName )
            	    // InternalRuleDsl.g:1413:7: ruleQualifiedName
            	    {

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getSelectMessageStringRule());
            	    							}
            	    						

            	    							newCompositeNode(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeCrossReference_1_1_1_0());
            	    						
            	    pushFollow(FOLLOW_29);
            	    ruleQualifiedName();

            	    state._fsp--;


            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectMessageStringAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleSelectMessageString"


    // $ANTLR start "entryRuleTextMessageString"
    // InternalRuleDsl.g:1437:1: entryRuleTextMessageString returns [EObject current=null] : iv_ruleTextMessageString= ruleTextMessageString EOF ;
    public final EObject entryRuleTextMessageString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextMessageString = null;


        try {
            // InternalRuleDsl.g:1437:58: (iv_ruleTextMessageString= ruleTextMessageString EOF )
            // InternalRuleDsl.g:1438:2: iv_ruleTextMessageString= ruleTextMessageString EOF
            {
             newCompositeNode(grammarAccess.getTextMessageStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextMessageString=ruleTextMessageString();

            state._fsp--;

             current =iv_ruleTextMessageString; 
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
    // $ANTLR end "entryRuleTextMessageString"


    // $ANTLR start "ruleTextMessageString"
    // InternalRuleDsl.g:1444:1: ruleTextMessageString returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleTextMessageString() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:1450:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalRuleDsl.g:1451:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalRuleDsl.g:1451:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalRuleDsl.g:1452:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalRuleDsl.g:1452:3: (lv_text_0_0= RULE_STRING )
            // InternalRuleDsl.g:1453:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getTextMessageStringAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextMessageStringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleTextMessageString"


    // $ANTLR start "entryRuleReceiver"
    // InternalRuleDsl.g:1472:1: entryRuleReceiver returns [EObject current=null] : iv_ruleReceiver= ruleReceiver EOF ;
    public final EObject entryRuleReceiver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiver = null;


        try {
            // InternalRuleDsl.g:1472:49: (iv_ruleReceiver= ruleReceiver EOF )
            // InternalRuleDsl.g:1473:2: iv_ruleReceiver= ruleReceiver EOF
            {
             newCompositeNode(grammarAccess.getReceiverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReceiver=ruleReceiver();

            state._fsp--;

             current =iv_ruleReceiver; 
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
    // $ANTLR end "entryRuleReceiver"


    // $ANTLR start "ruleReceiver"
    // InternalRuleDsl.g:1479:1: ruleReceiver returns [EObject current=null] : (this_ReceiverList_0= ruleReceiverList | this_DistributionList_1= ruleDistributionList ) ;
    public final EObject ruleReceiver() throws RecognitionException {
        EObject current = null;

        EObject this_ReceiverList_0 = null;

        EObject this_DistributionList_1 = null;



        	enterRule();

        try {
            // InternalRuleDsl.g:1485:2: ( (this_ReceiverList_0= ruleReceiverList | this_DistributionList_1= ruleDistributionList ) )
            // InternalRuleDsl.g:1486:2: (this_ReceiverList_0= ruleReceiverList | this_DistributionList_1= ruleDistributionList )
            {
            // InternalRuleDsl.g:1486:2: (this_ReceiverList_0= ruleReceiverList | this_DistributionList_1= ruleDistributionList )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            else if ( (LA26_0==37) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalRuleDsl.g:1487:3: this_ReceiverList_0= ruleReceiverList
                    {

                    			newCompositeNode(grammarAccess.getReceiverAccess().getReceiverListParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReceiverList_0=ruleReceiverList();

                    state._fsp--;


                    			current = this_ReceiverList_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:1496:3: this_DistributionList_1= ruleDistributionList
                    {

                    			newCompositeNode(grammarAccess.getReceiverAccess().getDistributionListParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistributionList_1=ruleDistributionList();

                    state._fsp--;


                    			current = this_DistributionList_1;
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
    // $ANTLR end "ruleReceiver"


    // $ANTLR start "entryRuleReceiverList"
    // InternalRuleDsl.g:1508:1: entryRuleReceiverList returns [EObject current=null] : iv_ruleReceiverList= ruleReceiverList EOF ;
    public final EObject entryRuleReceiverList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReceiverList = null;


        try {
            // InternalRuleDsl.g:1508:53: (iv_ruleReceiverList= ruleReceiverList EOF )
            // InternalRuleDsl.g:1509:2: iv_ruleReceiverList= ruleReceiverList EOF
            {
             newCompositeNode(grammarAccess.getReceiverListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReceiverList=ruleReceiverList();

            state._fsp--;

             current =iv_ruleReceiverList; 
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
    // $ANTLR end "entryRuleReceiverList"


    // $ANTLR start "ruleReceiverList"
    // InternalRuleDsl.g:1515:1: ruleReceiverList returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_receiver_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_receiver_3_0= RULE_STRING ) ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleReceiverList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_receiver_1_0=null;
        Token otherlv_2=null;
        Token lv_receiver_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:1521:2: ( (otherlv_0= '{' ( ( (lv_receiver_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_receiver_3_0= RULE_STRING ) ) )* ) otherlv_4= '}' ) )
            // InternalRuleDsl.g:1522:2: (otherlv_0= '{' ( ( (lv_receiver_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_receiver_3_0= RULE_STRING ) ) )* ) otherlv_4= '}' )
            {
            // InternalRuleDsl.g:1522:2: (otherlv_0= '{' ( ( (lv_receiver_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_receiver_3_0= RULE_STRING ) ) )* ) otherlv_4= '}' )
            // InternalRuleDsl.g:1523:3: otherlv_0= '{' ( ( (lv_receiver_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_receiver_3_0= RULE_STRING ) ) )* ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getReceiverListAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalRuleDsl.g:1527:3: ( ( (lv_receiver_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_receiver_3_0= RULE_STRING ) ) )* )
            // InternalRuleDsl.g:1528:4: ( (lv_receiver_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_receiver_3_0= RULE_STRING ) ) )*
            {
            // InternalRuleDsl.g:1528:4: ( (lv_receiver_1_0= RULE_STRING ) )
            // InternalRuleDsl.g:1529:5: (lv_receiver_1_0= RULE_STRING )
            {
            // InternalRuleDsl.g:1529:5: (lv_receiver_1_0= RULE_STRING )
            // InternalRuleDsl.g:1530:6: lv_receiver_1_0= RULE_STRING
            {
            lv_receiver_1_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            						newLeafNode(lv_receiver_1_0, grammarAccess.getReceiverListAccess().getReceiverSTRINGTerminalRuleCall_1_0_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getReceiverListRule());
            						}
            						addWithLastConsumed(
            							current,
            							"receiver",
            							lv_receiver_1_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }

            // InternalRuleDsl.g:1546:4: (otherlv_2= ',' ( (lv_receiver_3_0= RULE_STRING ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRuleDsl.g:1547:5: otherlv_2= ',' ( (lv_receiver_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_30); 

            	    					newLeafNode(otherlv_2, grammarAccess.getReceiverListAccess().getCommaKeyword_1_1_0());
            	    				
            	    // InternalRuleDsl.g:1551:5: ( (lv_receiver_3_0= RULE_STRING ) )
            	    // InternalRuleDsl.g:1552:6: (lv_receiver_3_0= RULE_STRING )
            	    {
            	    // InternalRuleDsl.g:1552:6: (lv_receiver_3_0= RULE_STRING )
            	    // InternalRuleDsl.g:1553:7: lv_receiver_3_0= RULE_STRING
            	    {
            	    lv_receiver_3_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            	    							newLeafNode(lv_receiver_3_0, grammarAccess.getReceiverListAccess().getReceiverSTRINGTerminalRuleCall_1_1_1_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getReceiverListRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"receiver",
            	    								lv_receiver_3_0,
            	    								"org.eclipse.xtext.common.Terminals.STRING");
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getReceiverListAccess().getRightCurlyBracketKeyword_2());
            		

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
    // $ANTLR end "ruleReceiverList"


    // $ANTLR start "entryRuleDistributionList"
    // InternalRuleDsl.g:1579:1: entryRuleDistributionList returns [EObject current=null] : iv_ruleDistributionList= ruleDistributionList EOF ;
    public final EObject entryRuleDistributionList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistributionList = null;


        try {
            // InternalRuleDsl.g:1579:57: (iv_ruleDistributionList= ruleDistributionList EOF )
            // InternalRuleDsl.g:1580:2: iv_ruleDistributionList= ruleDistributionList EOF
            {
             newCompositeNode(grammarAccess.getDistributionListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistributionList=ruleDistributionList();

            state._fsp--;

             current =iv_ruleDistributionList; 
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
    // $ANTLR end "entryRuleDistributionList"


    // $ANTLR start "ruleDistributionList"
    // InternalRuleDsl.g:1586:1: ruleDistributionList returns [EObject current=null] : (otherlv_0= '@' ( (lv_file_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleDistributionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_file_1_0=null;


        	enterRule();

        try {
            // InternalRuleDsl.g:1592:2: ( (otherlv_0= '@' ( (lv_file_1_0= RULE_STRING ) ) ) )
            // InternalRuleDsl.g:1593:2: (otherlv_0= '@' ( (lv_file_1_0= RULE_STRING ) ) )
            {
            // InternalRuleDsl.g:1593:2: (otherlv_0= '@' ( (lv_file_1_0= RULE_STRING ) ) )
            // InternalRuleDsl.g:1594:3: otherlv_0= '@' ( (lv_file_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDistributionListAccess().getCommercialAtKeyword_0());
            		
            // InternalRuleDsl.g:1598:3: ( (lv_file_1_0= RULE_STRING ) )
            // InternalRuleDsl.g:1599:4: (lv_file_1_0= RULE_STRING )
            {
            // InternalRuleDsl.g:1599:4: (lv_file_1_0= RULE_STRING )
            // InternalRuleDsl.g:1600:5: lv_file_1_0= RULE_STRING
            {
            lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_file_1_0, grammarAccess.getDistributionListAccess().getFileSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDistributionListRule());
            					}
            					addWithLastConsumed(
            						current,
            						"file",
            						lv_file_1_0,
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
    // $ANTLR end "ruleDistributionList"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000050000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000090L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100200L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000100000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000200L});

}