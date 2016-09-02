package eagledata.core.dsl.datadesc.parser.antlr.internal;

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
import eagledata.core.dsl.datadesc.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'package'", "'{'", "'}'", "'@'", "'['", "','", "']'", "'key'", "'unique'", "'('", "')'", "'description'", "':'", "'fragment'", "'datatype'", "'enumeration'", "'='", "'char'", "'digit'", "'anycase_string'", "'lowercase_string'", "'uppercase_string'", "'digits'", "'String'", "'Url'", "'Int'", "'LongInt'", "'Real'", "'Date'", "'Time'", "'Year'", "'Month'", "'Day'", "'Boolean'", "'Lat'", "'Long'", "'Percent'", "'Email'", "'Currency'", "'CreditCard'", "'IBAN'", "'ISBN'", "'ISSN'", "'Inet'", "'null'", "'separator'", "'default'", "'regex'", "'flags'", "'decimalchar'", "'pattern'", "'format'", "'minLength'", "'maxLength'", "'min'", "'max'", "'defaultvalue'", "'minDouble'", "'maxDouble'", "'defaultvalueDouble'", "'nullable'", "'casesensitive'", "'order'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
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


        public InternalDataDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataDsl.g"; }



     	private DataDslGrammarAccess grammarAccess;

        public InternalDataDslParser(TokenStream input, DataDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DataModel";
       	}

       	@Override
       	protected DataDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDataModel"
    // InternalDataDsl.g:65:1: entryRuleDataModel returns [EObject current=null] : iv_ruleDataModel= ruleDataModel EOF ;
    public final EObject entryRuleDataModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModel = null;


        try {
            // InternalDataDsl.g:65:50: (iv_ruleDataModel= ruleDataModel EOF )
            // InternalDataDsl.g:66:2: iv_ruleDataModel= ruleDataModel EOF
            {
             newCompositeNode(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataModel=ruleDataModel();

            state._fsp--;

             current =iv_ruleDataModel; 
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
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalDataDsl.g:72:1: ruleDataModel returns [EObject current=null] : ( () ( (lv_elements_1_0= ruleDataModelElement ) ) ( (lv_elements_2_0= ruleDataModelElement ) )* ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:78:2: ( ( () ( (lv_elements_1_0= ruleDataModelElement ) ) ( (lv_elements_2_0= ruleDataModelElement ) )* ) )
            // InternalDataDsl.g:79:2: ( () ( (lv_elements_1_0= ruleDataModelElement ) ) ( (lv_elements_2_0= ruleDataModelElement ) )* )
            {
            // InternalDataDsl.g:79:2: ( () ( (lv_elements_1_0= ruleDataModelElement ) ) ( (lv_elements_2_0= ruleDataModelElement ) )* )
            // InternalDataDsl.g:80:3: () ( (lv_elements_1_0= ruleDataModelElement ) ) ( (lv_elements_2_0= ruleDataModelElement ) )*
            {
            // InternalDataDsl.g:80:3: ()
            // InternalDataDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDataModelAccess().getDataModelAction_0(),
            					current);
            			

            }

            // InternalDataDsl.g:87:3: ( (lv_elements_1_0= ruleDataModelElement ) )
            // InternalDataDsl.g:88:4: (lv_elements_1_0= ruleDataModelElement )
            {
            // InternalDataDsl.g:88:4: (lv_elements_1_0= ruleDataModelElement )
            // InternalDataDsl.g:89:5: lv_elements_1_0= ruleDataModelElement
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getElementsDataModelElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_elements_1_0=ruleDataModelElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_1_0,
            						"eagledata.core.dsl.datadesc.DataDsl.DataModelElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:106:3: ( (lv_elements_2_0= ruleDataModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||LA1_0==16||LA1_0==19||LA1_0==27||(LA1_0>=29 && LA1_0<=31)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDataDsl.g:107:4: (lv_elements_2_0= ruleDataModelElement )
            	    {
            	    // InternalDataDsl.g:107:4: (lv_elements_2_0= ruleDataModelElement )
            	    // InternalDataDsl.g:108:5: lv_elements_2_0= ruleDataModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getDataModelAccess().getElementsDataModelElementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_elements_2_0=ruleDataModelElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_2_0,
            	    						"eagledata.core.dsl.datadesc.DataDsl.DataModelElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleImport"
    // InternalDataDsl.g:129:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDataDsl.g:129:47: (iv_ruleImport= ruleImport EOF )
            // InternalDataDsl.g:130:2: iv_ruleImport= ruleImport EOF
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
    // InternalDataDsl.g:136:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:142:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalDataDsl.g:143:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalDataDsl.g:143:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalDataDsl.g:144:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDataDsl.g:148:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalDataDsl.g:149:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalDataDsl.g:149:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalDataDsl.g:150:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
            						"eagledata.core.dsl.datadesc.DataDsl.QualifiedNameWithWildcard");
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
    // InternalDataDsl.g:171:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalDataDsl.g:171:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalDataDsl.g:172:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalDataDsl.g:178:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:184:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalDataDsl.g:185:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalDataDsl.g:185:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalDataDsl.g:186:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDataDsl.g:196:3: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataDsl.g:197:4: kw= '.*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

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
    // InternalDataDsl.g:207:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDataDsl.g:207:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDataDsl.g:208:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDataDsl.g:214:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDataDsl.g:220:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDataDsl.g:221:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDataDsl.g:221:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDataDsl.g:222:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDataDsl.g:229:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDataDsl.g:230:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_4); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDataModelElement"
    // InternalDataDsl.g:247:1: entryRuleDataModelElement returns [EObject current=null] : iv_ruleDataModelElement= ruleDataModelElement EOF ;
    public final EObject entryRuleDataModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModelElement = null;


        try {
            // InternalDataDsl.g:247:57: (iv_ruleDataModelElement= ruleDataModelElement EOF )
            // InternalDataDsl.g:248:2: iv_ruleDataModelElement= ruleDataModelElement EOF
            {
             newCompositeNode(grammarAccess.getDataModelElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataModelElement=ruleDataModelElement();

            state._fsp--;

             current =iv_ruleDataModelElement; 
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
    // $ANTLR end "entryRuleDataModelElement"


    // $ANTLR start "ruleDataModelElement"
    // InternalDataDsl.g:254:1: ruleDataModelElement returns [EObject current=null] : (this_Import_0= ruleImport | this_Package_1= rulePackage | this_SpecificationElement_2= ruleSpecificationElement ) ;
    public final EObject ruleDataModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_Package_1 = null;

        EObject this_SpecificationElement_2 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:260:2: ( (this_Import_0= ruleImport | this_Package_1= rulePackage | this_SpecificationElement_2= ruleSpecificationElement ) )
            // InternalDataDsl.g:261:2: (this_Import_0= ruleImport | this_Package_1= rulePackage | this_SpecificationElement_2= ruleSpecificationElement )
            {
            // InternalDataDsl.g:261:2: (this_Import_0= ruleImport | this_Package_1= rulePackage | this_SpecificationElement_2= ruleSpecificationElement )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 16:
            case 19:
                {
                alt4=2;
                }
                break;
            case 27:
            case 29:
            case 30:
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:262:3: this_Import_0= ruleImport
                    {

                    			newCompositeNode(grammarAccess.getDataModelElementAccess().getImportParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_0=ruleImport();

                    state._fsp--;


                    			current = this_Import_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:271:3: this_Package_1= rulePackage
                    {

                    			newCompositeNode(grammarAccess.getDataModelElementAccess().getPackageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_1=rulePackage();

                    state._fsp--;


                    			current = this_Package_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:280:3: this_SpecificationElement_2= ruleSpecificationElement
                    {

                    			newCompositeNode(grammarAccess.getDataModelElementAccess().getSpecificationElementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecificationElement_2=ruleSpecificationElement();

                    state._fsp--;


                    			current = this_SpecificationElement_2;
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
    // $ANTLR end "ruleDataModelElement"


    // $ANTLR start "entryRulePackage"
    // InternalDataDsl.g:292:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalDataDsl.g:292:48: (iv_rulePackage= rulePackage EOF )
            // InternalDataDsl.g:293:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalDataDsl.g:299:1: rulePackage returns [EObject current=null] : ( ( ( (lv_tags_0_0= ruleTag ) ) ( (lv_tags_1_0= ruleTag ) )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleSpecificationElement ) ) ( (lv_elements_6_0= ruleSpecificationElement ) )* otherlv_7= '}' ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_tags_0_0 = null;

        EObject lv_tags_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_elements_5_0 = null;

        EObject lv_elements_6_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:305:2: ( ( ( ( (lv_tags_0_0= ruleTag ) ) ( (lv_tags_1_0= ruleTag ) )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleSpecificationElement ) ) ( (lv_elements_6_0= ruleSpecificationElement ) )* otherlv_7= '}' ) )
            // InternalDataDsl.g:306:2: ( ( ( (lv_tags_0_0= ruleTag ) ) ( (lv_tags_1_0= ruleTag ) )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleSpecificationElement ) ) ( (lv_elements_6_0= ruleSpecificationElement ) )* otherlv_7= '}' )
            {
            // InternalDataDsl.g:306:2: ( ( ( (lv_tags_0_0= ruleTag ) ) ( (lv_tags_1_0= ruleTag ) )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleSpecificationElement ) ) ( (lv_elements_6_0= ruleSpecificationElement ) )* otherlv_7= '}' )
            // InternalDataDsl.g:307:3: ( ( (lv_tags_0_0= ruleTag ) ) ( (lv_tags_1_0= ruleTag ) )* )? otherlv_2= 'package' ( (lv_name_3_0= ruleQualifiedName ) ) otherlv_4= '{' ( (lv_elements_5_0= ruleSpecificationElement ) ) ( (lv_elements_6_0= ruleSpecificationElement ) )* otherlv_7= '}'
            {
            // InternalDataDsl.g:307:3: ( ( (lv_tags_0_0= ruleTag ) ) ( (lv_tags_1_0= ruleTag ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataDsl.g:308:4: ( (lv_tags_0_0= ruleTag ) ) ( (lv_tags_1_0= ruleTag ) )*
                    {
                    // InternalDataDsl.g:308:4: ( (lv_tags_0_0= ruleTag ) )
                    // InternalDataDsl.g:309:5: (lv_tags_0_0= ruleTag )
                    {
                    // InternalDataDsl.g:309:5: (lv_tags_0_0= ruleTag )
                    // InternalDataDsl.g:310:6: lv_tags_0_0= ruleTag
                    {

                    						newCompositeNode(grammarAccess.getPackageAccess().getTagsTagParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_tags_0_0=ruleTag();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    						}
                    						add(
                    							current,
                    							"tags",
                    							lv_tags_0_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Tag");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:327:4: ( (lv_tags_1_0= ruleTag ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==19) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDataDsl.g:328:5: (lv_tags_1_0= ruleTag )
                    	    {
                    	    // InternalDataDsl.g:328:5: (lv_tags_1_0= ruleTag )
                    	    // InternalDataDsl.g:329:6: lv_tags_1_0= ruleTag
                    	    {

                    	    						newCompositeNode(grammarAccess.getPackageAccess().getTagsTagParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_7);
                    	    lv_tags_1_0=ruleTag();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPackageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"tags",
                    	    							lv_tags_1_0,
                    	    							"eagledata.core.dsl.datadesc.DataDsl.Tag");
                    	    						afterParserOrEnumRuleCall();
                    	    					

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

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageAccess().getPackageKeyword_1());
            		
            // InternalDataDsl.g:351:3: ( (lv_name_3_0= ruleQualifiedName ) )
            // InternalDataDsl.g:352:4: (lv_name_3_0= ruleQualifiedName )
            {
            // InternalDataDsl.g:352:4: (lv_name_3_0= ruleQualifiedName )
            // InternalDataDsl.g:353:5: lv_name_3_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_3_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"eagledata.core.dsl.datadesc.DataDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDataDsl.g:374:3: ( (lv_elements_5_0= ruleSpecificationElement ) )
            // InternalDataDsl.g:375:4: (lv_elements_5_0= ruleSpecificationElement )
            {
            // InternalDataDsl.g:375:4: (lv_elements_5_0= ruleSpecificationElement )
            // InternalDataDsl.g:376:5: lv_elements_5_0= ruleSpecificationElement
            {

            					newCompositeNode(grammarAccess.getPackageAccess().getElementsSpecificationElementParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_10);
            lv_elements_5_0=ruleSpecificationElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_5_0,
            						"eagledata.core.dsl.datadesc.DataDsl.SpecificationElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:393:3: ( (lv_elements_6_0= ruleSpecificationElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==27||(LA7_0>=29 && LA7_0<=31)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDataDsl.g:394:4: (lv_elements_6_0= ruleSpecificationElement )
            	    {
            	    // InternalDataDsl.g:394:4: (lv_elements_6_0= ruleSpecificationElement )
            	    // InternalDataDsl.g:395:5: lv_elements_6_0= ruleSpecificationElement
            	    {

            	    					newCompositeNode(grammarAccess.getPackageAccess().getElementsSpecificationElementParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_elements_6_0=ruleSpecificationElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_6_0,
            	    						"eagledata.core.dsl.datadesc.DataDsl.SpecificationElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleTag"
    // InternalDataDsl.g:420:1: entryRuleTag returns [EObject current=null] : iv_ruleTag= ruleTag EOF ;
    public final EObject entryRuleTag() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTag = null;


        try {
            // InternalDataDsl.g:420:44: (iv_ruleTag= ruleTag EOF )
            // InternalDataDsl.g:421:2: iv_ruleTag= ruleTag EOF
            {
             newCompositeNode(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTag=ruleTag();

            state._fsp--;

             current =iv_ruleTag; 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalDataDsl.g:427:1: ruleTag returns [EObject current=null] : (otherlv_0= '@' ( (lv_tag_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleTag() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_tag_1_0=null;


        	enterRule();

        try {
            // InternalDataDsl.g:433:2: ( (otherlv_0= '@' ( (lv_tag_1_0= RULE_STRING ) ) ) )
            // InternalDataDsl.g:434:2: (otherlv_0= '@' ( (lv_tag_1_0= RULE_STRING ) ) )
            {
            // InternalDataDsl.g:434:2: (otherlv_0= '@' ( (lv_tag_1_0= RULE_STRING ) ) )
            // InternalDataDsl.g:435:3: otherlv_0= '@' ( (lv_tag_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getTagAccess().getCommercialAtKeyword_0());
            		
            // InternalDataDsl.g:439:3: ( (lv_tag_1_0= RULE_STRING ) )
            // InternalDataDsl.g:440:4: (lv_tag_1_0= RULE_STRING )
            {
            // InternalDataDsl.g:440:4: (lv_tag_1_0= RULE_STRING )
            // InternalDataDsl.g:441:5: lv_tag_1_0= RULE_STRING
            {
            lv_tag_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_tag_1_0, grammarAccess.getTagAccess().getTagSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTagRule());
            					}
            					setWithLastConsumed(
            						current,
            						"tag",
            						lv_tag_1_0,
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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleSpecificationElement"
    // InternalDataDsl.g:461:1: entryRuleSpecificationElement returns [EObject current=null] : iv_ruleSpecificationElement= ruleSpecificationElement EOF ;
    public final EObject entryRuleSpecificationElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecificationElement = null;


        try {
            // InternalDataDsl.g:461:61: (iv_ruleSpecificationElement= ruleSpecificationElement EOF )
            // InternalDataDsl.g:462:2: iv_ruleSpecificationElement= ruleSpecificationElement EOF
            {
             newCompositeNode(grammarAccess.getSpecificationElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecificationElement=ruleSpecificationElement();

            state._fsp--;

             current =iv_ruleSpecificationElement; 
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
    // $ANTLR end "entryRuleSpecificationElement"


    // $ANTLR start "ruleSpecificationElement"
    // InternalDataDsl.g:468:1: ruleSpecificationElement returns [EObject current=null] : (this_TypeSpecification_0= ruleTypeSpecification | this_AbstractDescription_1= ruleAbstractDescription ) ;
    public final EObject ruleSpecificationElement() throws RecognitionException {
        EObject current = null;

        EObject this_TypeSpecification_0 = null;

        EObject this_AbstractDescription_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:474:2: ( (this_TypeSpecification_0= ruleTypeSpecification | this_AbstractDescription_1= ruleAbstractDescription ) )
            // InternalDataDsl.g:475:2: (this_TypeSpecification_0= ruleTypeSpecification | this_AbstractDescription_1= ruleAbstractDescription )
            {
            // InternalDataDsl.g:475:2: (this_TypeSpecification_0= ruleTypeSpecification | this_AbstractDescription_1= ruleAbstractDescription )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=30 && LA8_0<=31)) ) {
                alt8=1;
            }
            else if ( (LA8_0==27||LA8_0==29) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataDsl.g:476:3: this_TypeSpecification_0= ruleTypeSpecification
                    {

                    			newCompositeNode(grammarAccess.getSpecificationElementAccess().getTypeSpecificationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeSpecification_0=ruleTypeSpecification();

                    state._fsp--;


                    			current = this_TypeSpecification_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:485:3: this_AbstractDescription_1= ruleAbstractDescription
                    {

                    			newCompositeNode(grammarAccess.getSpecificationElementAccess().getAbstractDescriptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AbstractDescription_1=ruleAbstractDescription();

                    state._fsp--;


                    			current = this_AbstractDescription_1;
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
    // $ANTLR end "ruleSpecificationElement"


    // $ANTLR start "entryRuleTypeSpecification"
    // InternalDataDsl.g:497:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // InternalDataDsl.g:497:58: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // InternalDataDsl.g:498:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
            {
             newCompositeNode(grammarAccess.getTypeSpecificationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeSpecification=ruleTypeSpecification();

            state._fsp--;

             current =iv_ruleTypeSpecification; 
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
    // $ANTLR end "entryRuleTypeSpecification"


    // $ANTLR start "ruleTypeSpecification"
    // InternalDataDsl.g:504:1: ruleTypeSpecification returns [EObject current=null] : (this_DataTypeRefinement_0= ruleDataTypeRefinement | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_DataTypeRefinement_0 = null;

        EObject this_Enumeration_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:510:2: ( (this_DataTypeRefinement_0= ruleDataTypeRefinement | this_Enumeration_1= ruleEnumeration ) )
            // InternalDataDsl.g:511:2: (this_DataTypeRefinement_0= ruleDataTypeRefinement | this_Enumeration_1= ruleEnumeration )
            {
            // InternalDataDsl.g:511:2: (this_DataTypeRefinement_0= ruleDataTypeRefinement | this_Enumeration_1= ruleEnumeration )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            else if ( (LA9_0==31) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataDsl.g:512:3: this_DataTypeRefinement_0= ruleDataTypeRefinement
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecificationAccess().getDataTypeRefinementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataTypeRefinement_0=ruleDataTypeRefinement();

                    state._fsp--;


                    			current = this_DataTypeRefinement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:521:3: this_Enumeration_1= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_1;
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
    // $ANTLR end "ruleTypeSpecification"


    // $ANTLR start "entryRuleAbstractDescription"
    // InternalDataDsl.g:533:1: entryRuleAbstractDescription returns [EObject current=null] : iv_ruleAbstractDescription= ruleAbstractDescription EOF ;
    public final EObject entryRuleAbstractDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractDescription = null;


        try {
            // InternalDataDsl.g:533:60: (iv_ruleAbstractDescription= ruleAbstractDescription EOF )
            // InternalDataDsl.g:534:2: iv_ruleAbstractDescription= ruleAbstractDescription EOF
            {
             newCompositeNode(grammarAccess.getAbstractDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractDescription=ruleAbstractDescription();

            state._fsp--;

             current =iv_ruleAbstractDescription; 
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
    // $ANTLR end "entryRuleAbstractDescription"


    // $ANTLR start "ruleAbstractDescription"
    // InternalDataDsl.g:540:1: ruleAbstractDescription returns [EObject current=null] : (this_DataDescription_0= ruleDataDescription | this_Fragment_1= ruleFragment ) ;
    public final EObject ruleAbstractDescription() throws RecognitionException {
        EObject current = null;

        EObject this_DataDescription_0 = null;

        EObject this_Fragment_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:546:2: ( (this_DataDescription_0= ruleDataDescription | this_Fragment_1= ruleFragment ) )
            // InternalDataDsl.g:547:2: (this_DataDescription_0= ruleDataDescription | this_Fragment_1= ruleFragment )
            {
            // InternalDataDsl.g:547:2: (this_DataDescription_0= ruleDataDescription | this_Fragment_1= ruleFragment )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==29) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataDsl.g:548:3: this_DataDescription_0= ruleDataDescription
                    {

                    			newCompositeNode(grammarAccess.getAbstractDescriptionAccess().getDataDescriptionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataDescription_0=ruleDataDescription();

                    state._fsp--;


                    			current = this_DataDescription_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:557:3: this_Fragment_1= ruleFragment
                    {

                    			newCompositeNode(grammarAccess.getAbstractDescriptionAccess().getFragmentParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fragment_1=ruleFragment();

                    state._fsp--;


                    			current = this_Fragment_1;
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
    // $ANTLR end "ruleAbstractDescription"


    // $ANTLR start "entryRuleSubstringConcept"
    // InternalDataDsl.g:569:1: entryRuleSubstringConcept returns [EObject current=null] : iv_ruleSubstringConcept= ruleSubstringConcept EOF ;
    public final EObject entryRuleSubstringConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstringConcept = null;


        try {
            // InternalDataDsl.g:569:57: (iv_ruleSubstringConcept= ruleSubstringConcept EOF )
            // InternalDataDsl.g:570:2: iv_ruleSubstringConcept= ruleSubstringConcept EOF
            {
             newCompositeNode(grammarAccess.getSubstringConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstringConcept=ruleSubstringConcept();

            state._fsp--;

             current =iv_ruleSubstringConcept; 
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
    // $ANTLR end "entryRuleSubstringConcept"


    // $ANTLR start "ruleSubstringConcept"
    // InternalDataDsl.g:576:1: ruleSubstringConcept returns [EObject current=null] : (this_Character_0= ruleCharacter | this_Substring_1= ruleSubstring ) ;
    public final EObject ruleSubstringConcept() throws RecognitionException {
        EObject current = null;

        EObject this_Character_0 = null;

        EObject this_Substring_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:582:2: ( (this_Character_0= ruleCharacter | this_Substring_1= ruleSubstring ) )
            // InternalDataDsl.g:583:2: (this_Character_0= ruleCharacter | this_Substring_1= ruleSubstring )
            {
            // InternalDataDsl.g:583:2: (this_Character_0= ruleCharacter | this_Substring_1= ruleSubstring )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=33 && LA11_0<=34)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=35 && LA11_0<=38)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataDsl.g:584:3: this_Character_0= ruleCharacter
                    {

                    			newCompositeNode(grammarAccess.getSubstringConceptAccess().getCharacterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Character_0=ruleCharacter();

                    state._fsp--;


                    			current = this_Character_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:593:3: this_Substring_1= ruleSubstring
                    {

                    			newCompositeNode(grammarAccess.getSubstringConceptAccess().getSubstringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Substring_1=ruleSubstring();

                    state._fsp--;


                    			current = this_Substring_1;
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
    // $ANTLR end "ruleSubstringConcept"


    // $ANTLR start "entryRuleSubstring"
    // InternalDataDsl.g:605:1: entryRuleSubstring returns [EObject current=null] : iv_ruleSubstring= ruleSubstring EOF ;
    public final EObject entryRuleSubstring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstring = null;


        try {
            // InternalDataDsl.g:605:50: (iv_ruleSubstring= ruleSubstring EOF )
            // InternalDataDsl.g:606:2: iv_ruleSubstring= ruleSubstring EOF
            {
             newCompositeNode(grammarAccess.getSubstringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubstring=ruleSubstring();

            state._fsp--;

             current =iv_ruleSubstring; 
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
    // $ANTLR end "entryRuleSubstring"


    // $ANTLR start "ruleSubstring"
    // InternalDataDsl.g:612:1: ruleSubstring returns [EObject current=null] : ( ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']' ) ;
    public final EObject ruleSubstring() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_minlength_3_0=null;
        Token otherlv_4=null;
        Token lv_maxlength_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_typeString_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:618:2: ( ( ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']' ) )
            // InternalDataDsl.g:619:2: ( ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']' )
            {
            // InternalDataDsl.g:619:2: ( ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']' )
            // InternalDataDsl.g:620:3: ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']'
            {
            // InternalDataDsl.g:620:3: ( (lv_typeString_0_0= ruleTypeString ) )
            // InternalDataDsl.g:621:4: (lv_typeString_0_0= ruleTypeString )
            {
            // InternalDataDsl.g:621:4: (lv_typeString_0_0= ruleTypeString )
            // InternalDataDsl.g:622:5: lv_typeString_0_0= ruleTypeString
            {

            					newCompositeNode(grammarAccess.getSubstringAccess().getTypeStringTypeStringEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_typeString_0_0=ruleTypeString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubstringRule());
            					}
            					set(
            						current,
            						"typeString",
            						lv_typeString_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.TypeString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:639:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:640:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:640:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:641:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSubstringAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSubstringAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDataDsl.g:661:3: ( (lv_minlength_3_0= RULE_INT ) )
            // InternalDataDsl.g:662:4: (lv_minlength_3_0= RULE_INT )
            {
            // InternalDataDsl.g:662:4: (lv_minlength_3_0= RULE_INT )
            // InternalDataDsl.g:663:5: lv_minlength_3_0= RULE_INT
            {
            lv_minlength_3_0=(Token)match(input,RULE_INT,FOLLOW_14); 

            					newLeafNode(lv_minlength_3_0, grammarAccess.getSubstringAccess().getMinlengthINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"minlength",
            						lv_minlength_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getSubstringAccess().getCommaKeyword_4());
            		
            // InternalDataDsl.g:683:3: ( (lv_maxlength_5_0= RULE_INT ) )
            // InternalDataDsl.g:684:4: (lv_maxlength_5_0= RULE_INT )
            {
            // InternalDataDsl.g:684:4: (lv_maxlength_5_0= RULE_INT )
            // InternalDataDsl.g:685:5: lv_maxlength_5_0= RULE_INT
            {
            lv_maxlength_5_0=(Token)match(input,RULE_INT,FOLLOW_15); 

            					newLeafNode(lv_maxlength_5_0, grammarAccess.getSubstringAccess().getMaxlengthINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubstringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"maxlength",
            						lv_maxlength_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSubstringAccess().getRightSquareBracketKeyword_6());
            		

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
    // $ANTLR end "ruleSubstring"


    // $ANTLR start "entryRuleCharacter"
    // InternalDataDsl.g:709:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // InternalDataDsl.g:709:50: (iv_ruleCharacter= ruleCharacter EOF )
            // InternalDataDsl.g:710:2: iv_ruleCharacter= ruleCharacter EOF
            {
             newCompositeNode(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharacter=ruleCharacter();

            state._fsp--;

             current =iv_ruleCharacter; 
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
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // InternalDataDsl.g:716:1: ruleCharacter returns [EObject current=null] : ( ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Enumerator lv_typeCharacter_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:722:2: ( ( ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? ) )
            // InternalDataDsl.g:723:2: ( ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? )
            {
            // InternalDataDsl.g:723:2: ( ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? )
            // InternalDataDsl.g:724:3: ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )?
            {
            // InternalDataDsl.g:724:3: ( (lv_typeCharacter_0_0= ruleTypeCharacter ) )
            // InternalDataDsl.g:725:4: (lv_typeCharacter_0_0= ruleTypeCharacter )
            {
            // InternalDataDsl.g:725:4: (lv_typeCharacter_0_0= ruleTypeCharacter )
            // InternalDataDsl.g:726:5: lv_typeCharacter_0_0= ruleTypeCharacter
            {

            					newCompositeNode(grammarAccess.getCharacterAccess().getTypeCharacterTypeCharacterEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_typeCharacter_0_0=ruleTypeCharacter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCharacterRule());
            					}
            					set(
            						current,
            						"typeCharacter",
            						lv_typeCharacter_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.TypeCharacter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:743:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:744:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:744:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:745:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCharacterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:761:3: ( (lv_value_2_0= RULE_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataDsl.g:762:4: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalDataDsl.g:762:4: (lv_value_2_0= RULE_STRING )
                    // InternalDataDsl.g:763:5: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_value_2_0, grammarAccess.getCharacterAccess().getValueSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCharacterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_2_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

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
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleNode"
    // InternalDataDsl.g:783:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalDataDsl.g:783:45: (iv_ruleNode= ruleNode EOF )
            // InternalDataDsl.g:784:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalDataDsl.g:790:1: ruleNode returns [EObject current=null] : (this_PrimitiveNode_0= rulePrimitiveNode | this_CompositeNode_1= ruleCompositeNode | this_FragmentNode_2= ruleFragmentNode ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveNode_0 = null;

        EObject this_CompositeNode_1 = null;

        EObject this_FragmentNode_2 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:796:2: ( (this_PrimitiveNode_0= rulePrimitiveNode | this_CompositeNode_1= ruleCompositeNode | this_FragmentNode_2= ruleFragmentNode ) )
            // InternalDataDsl.g:797:2: (this_PrimitiveNode_0= rulePrimitiveNode | this_CompositeNode_1= ruleCompositeNode | this_FragmentNode_2= ruleFragmentNode )
            {
            // InternalDataDsl.g:797:2: (this_PrimitiveNode_0= rulePrimitiveNode | this_CompositeNode_1= ruleCompositeNode | this_FragmentNode_2= ruleFragmentNode )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>=39 && LA13_1<=59)) ) {
                    alt13=1;
                }
                else if ( (LA13_1==RULE_ID) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                int LA13_2 = input.LA(2);

                if ( ((LA13_2>=39 && LA13_2<=59)) ) {
                    alt13=1;
                }
                else if ( (LA13_2==RULE_ID) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 2, input);

                    throw nvae;
                }
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt13=1;
                }
                break;
            case RULE_ID:
                {
                alt13=2;
                }
                break;
            case 15:
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
                    // InternalDataDsl.g:798:3: this_PrimitiveNode_0= rulePrimitiveNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getPrimitiveNodeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveNode_0=rulePrimitiveNode();

                    state._fsp--;


                    			current = this_PrimitiveNode_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:807:3: this_CompositeNode_1= ruleCompositeNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getCompositeNodeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeNode_1=ruleCompositeNode();

                    state._fsp--;


                    			current = this_CompositeNode_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:816:3: this_FragmentNode_2= ruleFragmentNode
                    {

                    			newCompositeNode(grammarAccess.getNodeAccess().getFragmentNodeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_FragmentNode_2=ruleFragmentNode();

                    state._fsp--;


                    			current = this_FragmentNode_2;
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleCompositeNode"
    // InternalDataDsl.g:828:1: entryRuleCompositeNode returns [EObject current=null] : iv_ruleCompositeNode= ruleCompositeNode EOF ;
    public final EObject entryRuleCompositeNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeNode = null;


        try {
            // InternalDataDsl.g:828:54: (iv_ruleCompositeNode= ruleCompositeNode EOF )
            // InternalDataDsl.g:829:2: iv_ruleCompositeNode= ruleCompositeNode EOF
            {
             newCompositeNode(grammarAccess.getCompositeNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeNode=ruleCompositeNode();

            state._fsp--;

             current =iv_ruleCompositeNode; 
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
    // $ANTLR end "entryRuleCompositeNode"


    // $ANTLR start "ruleCompositeNode"
    // InternalDataDsl.g:835:1: ruleCompositeNode returns [EObject current=null] : ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )? ) ;
    public final EObject ruleCompositeNode() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_unique_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_cardinality_5_0 = null;

        EObject lv_options_8_0 = null;

        EObject lv_options_10_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:841:2: ( ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )? ) )
            // InternalDataDsl.g:842:2: ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )? )
            {
            // InternalDataDsl.g:842:2: ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )? )
            // InternalDataDsl.g:843:3: ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( ( ruleQualifiedName ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )?
            {
            // InternalDataDsl.g:843:3: ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )?
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataDsl.g:844:4: ( (lv_key_0_0= 'key' ) )
                    {
                    // InternalDataDsl.g:844:4: ( (lv_key_0_0= 'key' ) )
                    // InternalDataDsl.g:845:5: (lv_key_0_0= 'key' )
                    {
                    // InternalDataDsl.g:845:5: (lv_key_0_0= 'key' )
                    // InternalDataDsl.g:846:6: lv_key_0_0= 'key'
                    {
                    lv_key_0_0=(Token)match(input,23,FOLLOW_4); 

                    						newLeafNode(lv_key_0_0, grammarAccess.getCompositeNodeAccess().getKeyKeyKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeNodeRule());
                    						}
                    						setWithLastConsumed(current, "key", true, "key");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:859:4: ( (lv_unique_1_0= 'unique' ) )
                    {
                    // InternalDataDsl.g:859:4: ( (lv_unique_1_0= 'unique' ) )
                    // InternalDataDsl.g:860:5: (lv_unique_1_0= 'unique' )
                    {
                    // InternalDataDsl.g:860:5: (lv_unique_1_0= 'unique' )
                    // InternalDataDsl.g:861:6: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,24,FOLLOW_4); 

                    						newLeafNode(lv_unique_1_0, grammarAccess.getCompositeNodeAccess().getUniqueUniqueKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeNodeRule());
                    						}
                    						setWithLastConsumed(current, "unique", true, "unique");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataDsl.g:874:3: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:875:4: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:875:4: ( ruleQualifiedName )
            // InternalDataDsl.g:876:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCompositeNodeAccess().getTypeTypeSpecificationCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:890:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDataDsl.g:891:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDataDsl.g:891:4: (lv_name_3_0= RULE_ID )
            // InternalDataDsl.g:892:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_3_0, grammarAccess.getCompositeNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:908:3: (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataDsl.g:909:4: otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getCompositeNodeAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDataDsl.g:913:4: ( (lv_cardinality_5_0= ruleCardinality ) )
                    // InternalDataDsl.g:914:5: (lv_cardinality_5_0= ruleCardinality )
                    {
                    // InternalDataDsl.g:914:5: (lv_cardinality_5_0= ruleCardinality )
                    // InternalDataDsl.g:915:6: lv_cardinality_5_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getCompositeNodeAccess().getCardinalityCardinalityParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_cardinality_5_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    						}
                    						set(
                    							current,
                    							"cardinality",
                    							lv_cardinality_5_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getCompositeNodeAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalDataDsl.g:937:3: (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataDsl.g:938:4: otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalDataDsl.g:942:4: ( (lv_options_8_0= ruleOption ) )
                    // InternalDataDsl.g:943:5: (lv_options_8_0= ruleOption )
                    {
                    // InternalDataDsl.g:943:5: (lv_options_8_0= ruleOption )
                    // InternalDataDsl.g:944:6: lv_options_8_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_options_8_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_8_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:961:4: (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==21) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalDataDsl.g:962:5: otherlv_9= ',' ( (lv_options_10_0= ruleOption ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_19); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getCompositeNodeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDataDsl.g:966:5: ( (lv_options_10_0= ruleOption ) )
                    	    // InternalDataDsl.g:967:6: (lv_options_10_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:967:6: (lv_options_10_0= ruleOption )
                    	    // InternalDataDsl.g:968:7: lv_options_10_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_options_10_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCompositeNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_10_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_4_3());
                    			

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
    // $ANTLR end "ruleCompositeNode"


    // $ANTLR start "entryRuleFragmentNode"
    // InternalDataDsl.g:995:1: entryRuleFragmentNode returns [EObject current=null] : iv_ruleFragmentNode= ruleFragmentNode EOF ;
    public final EObject entryRuleFragmentNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragmentNode = null;


        try {
            // InternalDataDsl.g:995:53: (iv_ruleFragmentNode= ruleFragmentNode EOF )
            // InternalDataDsl.g:996:2: iv_ruleFragmentNode= ruleFragmentNode EOF
            {
             newCompositeNode(grammarAccess.getFragmentNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragmentNode=ruleFragmentNode();

            state._fsp--;

             current =iv_ruleFragmentNode; 
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
    // $ANTLR end "entryRuleFragmentNode"


    // $ANTLR start "ruleFragmentNode"
    // InternalDataDsl.g:1002:1: ruleFragmentNode returns [EObject current=null] : (otherlv_0= '.' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= ']' )? (otherlv_6= '(' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= ')' )? ) ;
    public final EObject ruleFragmentNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_cardinality_4_0 = null;

        EObject lv_options_7_0 = null;

        EObject lv_options_9_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1008:2: ( (otherlv_0= '.' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= ']' )? (otherlv_6= '(' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= ')' )? ) )
            // InternalDataDsl.g:1009:2: (otherlv_0= '.' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= ']' )? (otherlv_6= '(' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= ')' )? )
            {
            // InternalDataDsl.g:1009:2: (otherlv_0= '.' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= ']' )? (otherlv_6= '(' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= ')' )? )
            // InternalDataDsl.g:1010:3: otherlv_0= '.' ( ( ruleQualifiedName ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '[' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= ']' )? (otherlv_6= '(' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= ')' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentNodeAccess().getFullStopKeyword_0());
            		
            // InternalDataDsl.g:1014:3: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:1015:4: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:1015:4: ( ruleQualifiedName )
            // InternalDataDsl.g:1016:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getFragmentNodeAccess().getTypeFragmentCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:1030:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDataDsl.g:1031:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDataDsl.g:1031:4: (lv_name_2_0= RULE_ID )
            // InternalDataDsl.g:1032:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getFragmentNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:1048:3: (otherlv_3= '[' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataDsl.g:1049:4: otherlv_3= '[' ( (lv_cardinality_4_0= ruleCardinality ) ) otherlv_5= ']'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getFragmentNodeAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDataDsl.g:1053:4: ( (lv_cardinality_4_0= ruleCardinality ) )
                    // InternalDataDsl.g:1054:5: (lv_cardinality_4_0= ruleCardinality )
                    {
                    // InternalDataDsl.g:1054:5: (lv_cardinality_4_0= ruleCardinality )
                    // InternalDataDsl.g:1055:6: lv_cardinality_4_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getFragmentNodeAccess().getCardinalityCardinalityParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_cardinality_4_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFragmentNodeRule());
                    						}
                    						set(
                    							current,
                    							"cardinality",
                    							lv_cardinality_4_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getFragmentNodeAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalDataDsl.g:1077:3: (otherlv_6= '(' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataDsl.g:1078:4: otherlv_6= '(' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= ')'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getFragmentNodeAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalDataDsl.g:1082:4: ( (lv_options_7_0= ruleOption ) )
                    // InternalDataDsl.g:1083:5: (lv_options_7_0= ruleOption )
                    {
                    // InternalDataDsl.g:1083:5: (lv_options_7_0= ruleOption )
                    // InternalDataDsl.g:1084:6: lv_options_7_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getFragmentNodeAccess().getOptionsOptionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_options_7_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFragmentNodeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_7_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1101:4: (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==21) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDataDsl.g:1102:5: otherlv_8= ',' ( (lv_options_9_0= ruleOption ) )
                    	    {
                    	    otherlv_8=(Token)match(input,21,FOLLOW_19); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getFragmentNodeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDataDsl.g:1106:5: ( (lv_options_9_0= ruleOption ) )
                    	    // InternalDataDsl.g:1107:6: (lv_options_9_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:1107:6: (lv_options_9_0= ruleOption )
                    	    // InternalDataDsl.g:1108:7: lv_options_9_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getFragmentNodeAccess().getOptionsOptionParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_options_9_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFragmentNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_9_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getFragmentNodeAccess().getRightParenthesisKeyword_4_3());
                    			

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
    // $ANTLR end "ruleFragmentNode"


    // $ANTLR start "entryRulePrimitiveNode"
    // InternalDataDsl.g:1135:1: entryRulePrimitiveNode returns [EObject current=null] : iv_rulePrimitiveNode= rulePrimitiveNode EOF ;
    public final EObject entryRulePrimitiveNode() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveNode = null;


        try {
            // InternalDataDsl.g:1135:54: (iv_rulePrimitiveNode= rulePrimitiveNode EOF )
            // InternalDataDsl.g:1136:2: iv_rulePrimitiveNode= rulePrimitiveNode EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveNode=rulePrimitiveNode();

            state._fsp--;

             current =iv_rulePrimitiveNode; 
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
    // $ANTLR end "entryRulePrimitiveNode"


    // $ANTLR start "rulePrimitiveNode"
    // InternalDataDsl.g:1142:1: rulePrimitiveNode returns [EObject current=null] : ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( (lv_type_2_0= ruleBasicType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )? ) ;
    public final EObject rulePrimitiveNode() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_unique_1_0=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_type_2_0 = null;

        EObject lv_cardinality_5_0 = null;

        EObject lv_options_8_0 = null;

        EObject lv_options_10_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1148:2: ( ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( (lv_type_2_0= ruleBasicType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )? ) )
            // InternalDataDsl.g:1149:2: ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( (lv_type_2_0= ruleBasicType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )? )
            {
            // InternalDataDsl.g:1149:2: ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( (lv_type_2_0= ruleBasicType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )? )
            // InternalDataDsl.g:1150:3: ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )? ( (lv_type_2_0= ruleBasicType ) ) ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )? (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )?
            {
            // InternalDataDsl.g:1150:3: ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            else if ( (LA21_0==24) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // InternalDataDsl.g:1151:4: ( (lv_key_0_0= 'key' ) )
                    {
                    // InternalDataDsl.g:1151:4: ( (lv_key_0_0= 'key' ) )
                    // InternalDataDsl.g:1152:5: (lv_key_0_0= 'key' )
                    {
                    // InternalDataDsl.g:1152:5: (lv_key_0_0= 'key' )
                    // InternalDataDsl.g:1153:6: lv_key_0_0= 'key'
                    {
                    lv_key_0_0=(Token)match(input,23,FOLLOW_21); 

                    						newLeafNode(lv_key_0_0, grammarAccess.getPrimitiveNodeAccess().getKeyKeyKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveNodeRule());
                    						}
                    						setWithLastConsumed(current, "key", true, "key");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1166:4: ( (lv_unique_1_0= 'unique' ) )
                    {
                    // InternalDataDsl.g:1166:4: ( (lv_unique_1_0= 'unique' ) )
                    // InternalDataDsl.g:1167:5: (lv_unique_1_0= 'unique' )
                    {
                    // InternalDataDsl.g:1167:5: (lv_unique_1_0= 'unique' )
                    // InternalDataDsl.g:1168:6: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,24,FOLLOW_21); 

                    						newLeafNode(lv_unique_1_0, grammarAccess.getPrimitiveNodeAccess().getUniqueUniqueKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimitiveNodeRule());
                    						}
                    						setWithLastConsumed(current, "unique", true, "unique");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1181:3: ( (lv_type_2_0= ruleBasicType ) )
            // InternalDataDsl.g:1182:4: (lv_type_2_0= ruleBasicType )
            {
            // InternalDataDsl.g:1182:4: (lv_type_2_0= ruleBasicType )
            // InternalDataDsl.g:1183:5: lv_type_2_0= ruleBasicType
            {

            					newCompositeNode(grammarAccess.getPrimitiveNodeAccess().getTypeBasicTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_2_0=ruleBasicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPrimitiveNodeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"eagledata.core.dsl.datadesc.DataDsl.BasicType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:1200:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalDataDsl.g:1201:4: (lv_name_3_0= RULE_ID )
            {
            // InternalDataDsl.g:1201:4: (lv_name_3_0= RULE_ID )
            // InternalDataDsl.g:1202:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_3_0, grammarAccess.getPrimitiveNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPrimitiveNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:1218:3: (otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==20) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDataDsl.g:1219:4: otherlv_4= '[' ( (lv_cardinality_5_0= ruleCardinality ) ) otherlv_6= ']'
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimitiveNodeAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalDataDsl.g:1223:4: ( (lv_cardinality_5_0= ruleCardinality ) )
                    // InternalDataDsl.g:1224:5: (lv_cardinality_5_0= ruleCardinality )
                    {
                    // InternalDataDsl.g:1224:5: (lv_cardinality_5_0= ruleCardinality )
                    // InternalDataDsl.g:1225:6: lv_cardinality_5_0= ruleCardinality
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveNodeAccess().getCardinalityCardinalityParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_cardinality_5_0=ruleCardinality();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveNodeRule());
                    						}
                    						set(
                    							current,
                    							"cardinality",
                    							lv_cardinality_5_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Cardinality");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrimitiveNodeAccess().getRightSquareBracketKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalDataDsl.g:1247:3: (otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDsl.g:1248:4: otherlv_7= '(' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= ')'
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getPrimitiveNodeAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalDataDsl.g:1252:4: ( (lv_options_8_0= ruleOption ) )
                    // InternalDataDsl.g:1253:5: (lv_options_8_0= ruleOption )
                    {
                    // InternalDataDsl.g:1253:5: (lv_options_8_0= ruleOption )
                    // InternalDataDsl.g:1254:6: lv_options_8_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getPrimitiveNodeAccess().getOptionsOptionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_options_8_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimitiveNodeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_8_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1271:4: (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==21) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalDataDsl.g:1272:5: otherlv_9= ',' ( (lv_options_10_0= ruleOption ) )
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_19); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPrimitiveNodeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDataDsl.g:1276:5: ( (lv_options_10_0= ruleOption ) )
                    	    // InternalDataDsl.g:1277:6: (lv_options_10_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:1277:6: (lv_options_10_0= ruleOption )
                    	    // InternalDataDsl.g:1278:7: lv_options_10_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrimitiveNodeAccess().getOptionsOptionParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_options_10_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrimitiveNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_10_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getPrimitiveNodeAccess().getRightParenthesisKeyword_4_3());
                    			

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
    // $ANTLR end "rulePrimitiveNode"


    // $ANTLR start "entryRuleCardinality"
    // InternalDataDsl.g:1305:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalDataDsl.g:1305:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalDataDsl.g:1306:2: iv_ruleCardinality= ruleCardinality EOF
            {
             newCompositeNode(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;

             current =iv_ruleCardinality; 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalDataDsl.g:1312:1: ruleCardinality returns [EObject current=null] : ( ( (lv_min_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_max_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token lv_min_0_0=null;
        Token otherlv_1=null;
        Token lv_max_2_0=null;


        	enterRule();

        try {
            // InternalDataDsl.g:1318:2: ( ( ( (lv_min_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_max_2_0= RULE_INT ) ) )? ) )
            // InternalDataDsl.g:1319:2: ( ( (lv_min_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_max_2_0= RULE_INT ) ) )? )
            {
            // InternalDataDsl.g:1319:2: ( ( (lv_min_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_max_2_0= RULE_INT ) ) )? )
            // InternalDataDsl.g:1320:3: ( (lv_min_0_0= RULE_INT ) ) (otherlv_1= ',' ( (lv_max_2_0= RULE_INT ) ) )?
            {
            // InternalDataDsl.g:1320:3: ( (lv_min_0_0= RULE_INT ) )
            // InternalDataDsl.g:1321:4: (lv_min_0_0= RULE_INT )
            {
            // InternalDataDsl.g:1321:4: (lv_min_0_0= RULE_INT )
            // InternalDataDsl.g:1322:5: lv_min_0_0= RULE_INT
            {
            lv_min_0_0=(Token)match(input,RULE_INT,FOLLOW_22); 

            					newLeafNode(lv_min_0_0, grammarAccess.getCardinalityAccess().getMinINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCardinalityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"min",
            						lv_min_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalDataDsl.g:1338:3: (otherlv_1= ',' ( (lv_max_2_0= RULE_INT ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==21) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDsl.g:1339:4: otherlv_1= ',' ( (lv_max_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getCardinalityAccess().getCommaKeyword_1_0());
                    			
                    // InternalDataDsl.g:1343:4: ( (lv_max_2_0= RULE_INT ) )
                    // InternalDataDsl.g:1344:5: (lv_max_2_0= RULE_INT )
                    {
                    // InternalDataDsl.g:1344:5: (lv_max_2_0= RULE_INT )
                    // InternalDataDsl.g:1345:6: lv_max_2_0= RULE_INT
                    {
                    lv_max_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_max_2_0, grammarAccess.getCardinalityAccess().getMaxINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCardinalityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"max",
                    							lv_max_2_0,
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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleDataDescription"
    // InternalDataDsl.g:1366:1: entryRuleDataDescription returns [EObject current=null] : iv_ruleDataDescription= ruleDataDescription EOF ;
    public final EObject entryRuleDataDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataDescription = null;


        try {
            // InternalDataDsl.g:1366:56: (iv_ruleDataDescription= ruleDataDescription EOF )
            // InternalDataDsl.g:1367:2: iv_ruleDataDescription= ruleDataDescription EOF
            {
             newCompositeNode(grammarAccess.getDataDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataDescription=ruleDataDescription();

            state._fsp--;

             current =iv_ruleDataDescription; 
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
    // $ANTLR end "entryRuleDataDescription"


    // $ANTLR start "ruleDataDescription"
    // InternalDataDsl.g:1373:1: ruleDataDescription returns [EObject current=null] : (otherlv_0= 'description' ( (lv_format_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) ) ( (lv_nodes_9_0= ruleNode ) )* otherlv_10= '}' (otherlv_11= '(' ( (lv_options_12_0= ruleDataOption ) ) (otherlv_13= ',' ( (lv_options_14_0= ruleDataOption ) ) )* otherlv_15= ')' )? ) ;
    public final EObject ruleDataDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_format_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_nodes_8_0 = null;

        EObject lv_nodes_9_0 = null;

        EObject lv_options_12_0 = null;

        EObject lv_options_14_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1379:2: ( (otherlv_0= 'description' ( (lv_format_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) ) ( (lv_nodes_9_0= ruleNode ) )* otherlv_10= '}' (otherlv_11= '(' ( (lv_options_12_0= ruleDataOption ) ) (otherlv_13= ',' ( (lv_options_14_0= ruleDataOption ) ) )* otherlv_15= ')' )? ) )
            // InternalDataDsl.g:1380:2: (otherlv_0= 'description' ( (lv_format_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) ) ( (lv_nodes_9_0= ruleNode ) )* otherlv_10= '}' (otherlv_11= '(' ( (lv_options_12_0= ruleDataOption ) ) (otherlv_13= ',' ( (lv_options_14_0= ruleDataOption ) ) )* otherlv_15= ')' )? )
            {
            // InternalDataDsl.g:1380:2: (otherlv_0= 'description' ( (lv_format_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) ) ( (lv_nodes_9_0= ruleNode ) )* otherlv_10= '}' (otherlv_11= '(' ( (lv_options_12_0= ruleDataOption ) ) (otherlv_13= ',' ( (lv_options_14_0= ruleDataOption ) ) )* otherlv_15= ')' )? )
            // InternalDataDsl.g:1381:3: otherlv_0= 'description' ( (lv_format_1_0= RULE_STRING ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( (lv_nodes_8_0= ruleNode ) ) ( (lv_nodes_9_0= ruleNode ) )* otherlv_10= '}' (otherlv_11= '(' ( (lv_options_12_0= ruleDataOption ) ) (otherlv_13= ',' ( (lv_options_14_0= ruleDataOption ) ) )* otherlv_15= ')' )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getDataDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalDataDsl.g:1385:3: ( (lv_format_1_0= RULE_STRING ) )
            // InternalDataDsl.g:1386:4: (lv_format_1_0= RULE_STRING )
            {
            // InternalDataDsl.g:1386:4: (lv_format_1_0= RULE_STRING )
            // InternalDataDsl.g:1387:5: lv_format_1_0= RULE_STRING
            {
            lv_format_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_format_1_0, grammarAccess.getDataDescriptionAccess().getFormatSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"format",
            						lv_format_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDataDsl.g:1403:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDataDsl.g:1404:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDataDsl.g:1404:4: (lv_name_2_0= RULE_ID )
            // InternalDataDsl.g:1405:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDataDescriptionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:1421:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataDsl.g:1422:4: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataDescriptionAccess().getColonKeyword_3_0());
                    			
                    // InternalDataDsl.g:1426:4: ( ( ruleQualifiedName ) )
                    // InternalDataDsl.g:1427:5: ( ruleQualifiedName )
                    {
                    // InternalDataDsl.g:1427:5: ( ruleQualifiedName )
                    // InternalDataDsl.g:1428:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataDescriptionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1442:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==21) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalDataDsl.g:1443:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDataDescriptionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDataDsl.g:1447:5: ( ( ruleQualifiedName ) )
                    	    // InternalDataDsl.g:1448:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalDataDsl.g:1448:6: ( ruleQualifiedName )
                    	    // InternalDataDsl.g:1449:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataDescriptionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getDataDescriptionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDataDsl.g:1469:3: ( (lv_nodes_8_0= ruleNode ) )
            // InternalDataDsl.g:1470:4: (lv_nodes_8_0= ruleNode )
            {
            // InternalDataDsl.g:1470:4: (lv_nodes_8_0= ruleNode )
            // InternalDataDsl.g:1471:5: lv_nodes_8_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getDataDescriptionAccess().getNodesNodeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_26);
            lv_nodes_8_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataDescriptionRule());
            					}
            					add(
            						current,
            						"nodes",
            						lv_nodes_8_0,
            						"eagledata.core.dsl.datadesc.DataDsl.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:1488:3: ( (lv_nodes_9_0= ruleNode ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID||LA28_0==15||(LA28_0>=23 && LA28_0<=24)||(LA28_0>=39 && LA28_0<=59)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDataDsl.g:1489:4: (lv_nodes_9_0= ruleNode )
            	    {
            	    // InternalDataDsl.g:1489:4: (lv_nodes_9_0= ruleNode )
            	    // InternalDataDsl.g:1490:5: lv_nodes_9_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getDataDescriptionAccess().getNodesNodeParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_nodes_9_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataDescriptionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_9_0,
            	    						"eagledata.core.dsl.datadesc.DataDsl.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getDataDescriptionAccess().getRightCurlyBracketKeyword_7());
            		
            // InternalDataDsl.g:1511:3: (otherlv_11= '(' ( (lv_options_12_0= ruleDataOption ) ) (otherlv_13= ',' ( (lv_options_14_0= ruleDataOption ) ) )* otherlv_15= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataDsl.g:1512:4: otherlv_11= '(' ( (lv_options_12_0= ruleDataOption ) ) (otherlv_13= ',' ( (lv_options_14_0= ruleDataOption ) ) )* otherlv_15= ')'
                    {
                    otherlv_11=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getDataDescriptionAccess().getLeftParenthesisKeyword_8_0());
                    			
                    // InternalDataDsl.g:1516:4: ( (lv_options_12_0= ruleDataOption ) )
                    // InternalDataDsl.g:1517:5: (lv_options_12_0= ruleDataOption )
                    {
                    // InternalDataDsl.g:1517:5: (lv_options_12_0= ruleDataOption )
                    // InternalDataDsl.g:1518:6: lv_options_12_0= ruleDataOption
                    {

                    						newCompositeNode(grammarAccess.getDataDescriptionAccess().getOptionsDataOptionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_options_12_0=ruleDataOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_12_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.DataOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1535:4: (otherlv_13= ',' ( (lv_options_14_0= ruleDataOption ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==21) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalDataDsl.g:1536:5: otherlv_13= ',' ( (lv_options_14_0= ruleDataOption ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getDataDescriptionAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalDataDsl.g:1540:5: ( (lv_options_14_0= ruleDataOption ) )
                    	    // InternalDataDsl.g:1541:6: (lv_options_14_0= ruleDataOption )
                    	    {
                    	    // InternalDataDsl.g:1541:6: (lv_options_14_0= ruleDataOption )
                    	    // InternalDataDsl.g:1542:7: lv_options_14_0= ruleDataOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataDescriptionAccess().getOptionsDataOptionParserRuleCall_8_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_options_14_0=ruleDataOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_14_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.DataOption");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_15, grammarAccess.getDataDescriptionAccess().getRightParenthesisKeyword_8_3());
                    			

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
    // $ANTLR end "ruleDataDescription"


    // $ANTLR start "entryRuleFragment"
    // InternalDataDsl.g:1569:1: entryRuleFragment returns [EObject current=null] : iv_ruleFragment= ruleFragment EOF ;
    public final EObject entryRuleFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFragment = null;


        try {
            // InternalDataDsl.g:1569:49: (iv_ruleFragment= ruleFragment EOF )
            // InternalDataDsl.g:1570:2: iv_ruleFragment= ruleFragment EOF
            {
             newCompositeNode(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFragment=ruleFragment();

            state._fsp--;

             current =iv_ruleFragment; 
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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalDataDsl.g:1576:1: ruleFragment returns [EObject current=null] : (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_nodes_7_0= ruleNode ) ) ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}' ) ;
    public final EObject ruleFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_nodes_7_0 = null;

        EObject lv_nodes_8_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1582:2: ( (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_nodes_7_0= ruleNode ) ) ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}' ) )
            // InternalDataDsl.g:1583:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_nodes_7_0= ruleNode ) ) ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}' )
            {
            // InternalDataDsl.g:1583:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_nodes_7_0= ruleNode ) ) ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}' )
            // InternalDataDsl.g:1584:3: otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_nodes_7_0= ruleNode ) ) ( (lv_nodes_8_0= ruleNode ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getFragmentAccess().getFragmentKeyword_0());
            		
            // InternalDataDsl.g:1588:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:1589:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:1589:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:1590:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:1606:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataDsl.g:1607:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getFragmentAccess().getColonKeyword_2_0());
                    			
                    // InternalDataDsl.g:1611:4: ( ( ruleQualifiedName ) )
                    // InternalDataDsl.g:1612:5: ( ruleQualifiedName )
                    {
                    // InternalDataDsl.g:1612:5: ( ruleQualifiedName )
                    // InternalDataDsl.g:1613:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFragmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFragmentAccess().getFragmentsFragmentCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1627:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==21) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalDataDsl.g:1628:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,21,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFragmentAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalDataDsl.g:1632:5: ( ( ruleQualifiedName ) )
                    	    // InternalDataDsl.g:1633:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalDataDsl.g:1633:6: ( ruleQualifiedName )
                    	    // InternalDataDsl.g:1634:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFragmentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFragmentAccess().getFragmentsFragmentCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDataDsl.g:1654:3: ( (lv_nodes_7_0= ruleNode ) )
            // InternalDataDsl.g:1655:4: (lv_nodes_7_0= ruleNode )
            {
            // InternalDataDsl.g:1655:4: (lv_nodes_7_0= ruleNode )
            // InternalDataDsl.g:1656:5: lv_nodes_7_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getFragmentAccess().getNodesNodeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_nodes_7_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFragmentRule());
            					}
            					add(
            						current,
            						"nodes",
            						lv_nodes_7_0,
            						"eagledata.core.dsl.datadesc.DataDsl.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:1673:3: ( (lv_nodes_8_0= ruleNode ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID||LA33_0==15||(LA33_0>=23 && LA33_0<=24)||(LA33_0>=39 && LA33_0<=59)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDataDsl.g:1674:4: (lv_nodes_8_0= ruleNode )
            	    {
            	    // InternalDataDsl.g:1674:4: (lv_nodes_8_0= ruleNode )
            	    // InternalDataDsl.g:1675:5: lv_nodes_8_0= ruleNode
            	    {

            	    					newCompositeNode(grammarAccess.getFragmentAccess().getNodesNodeParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_nodes_8_0=ruleNode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getFragmentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodes",
            	    						lv_nodes_8_0,
            	    						"eagledata.core.dsl.datadesc.DataDsl.Node");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleDataTypeRefinement"
    // InternalDataDsl.g:1700:1: entryRuleDataTypeRefinement returns [EObject current=null] : iv_ruleDataTypeRefinement= ruleDataTypeRefinement EOF ;
    public final EObject entryRuleDataTypeRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeRefinement = null;


        try {
            // InternalDataDsl.g:1700:59: (iv_ruleDataTypeRefinement= ruleDataTypeRefinement EOF )
            // InternalDataDsl.g:1701:2: iv_ruleDataTypeRefinement= ruleDataTypeRefinement EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRefinementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeRefinement=ruleDataTypeRefinement();

            state._fsp--;

             current =iv_ruleDataTypeRefinement; 
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
    // $ANTLR end "entryRuleDataTypeRefinement"


    // $ANTLR start "ruleDataTypeRefinement"
    // InternalDataDsl.g:1707:1: ruleDataTypeRefinement returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( ( (lv_subsequences_5_0= ruleSubstringConcept ) ) ( (lv_subsequences_6_0= ruleSubstringConcept ) )* )? otherlv_7= '}' )? (otherlv_8= '(' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ')' )? ) ;
    public final EObject ruleDataTypeRefinement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_refine_3_0 = null;

        EObject lv_subsequences_5_0 = null;

        EObject lv_subsequences_6_0 = null;

        EObject lv_options_9_0 = null;

        EObject lv_options_11_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1713:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( ( (lv_subsequences_5_0= ruleSubstringConcept ) ) ( (lv_subsequences_6_0= ruleSubstringConcept ) )* )? otherlv_7= '}' )? (otherlv_8= '(' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ')' )? ) )
            // InternalDataDsl.g:1714:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( ( (lv_subsequences_5_0= ruleSubstringConcept ) ) ( (lv_subsequences_6_0= ruleSubstringConcept ) )* )? otherlv_7= '}' )? (otherlv_8= '(' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ')' )? )
            {
            // InternalDataDsl.g:1714:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( ( (lv_subsequences_5_0= ruleSubstringConcept ) ) ( (lv_subsequences_6_0= ruleSubstringConcept ) )* )? otherlv_7= '}' )? (otherlv_8= '(' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ')' )? )
            // InternalDataDsl.g:1715:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( ( (lv_subsequences_5_0= ruleSubstringConcept ) ) ( (lv_subsequences_6_0= ruleSubstringConcept ) )* )? otherlv_7= '}' )? (otherlv_8= '(' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ')' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeRefinementAccess().getDatatypeKeyword_0());
            		
            // InternalDataDsl.g:1719:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:1720:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:1720:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:1721:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeRefinementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRefinementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeRefinementAccess().getColonKeyword_2());
            		
            // InternalDataDsl.g:1741:3: ( (lv_refine_3_0= ruleBasicType ) )
            // InternalDataDsl.g:1742:4: (lv_refine_3_0= ruleBasicType )
            {
            // InternalDataDsl.g:1742:4: (lv_refine_3_0= ruleBasicType )
            // InternalDataDsl.g:1743:5: lv_refine_3_0= ruleBasicType
            {

            					newCompositeNode(grammarAccess.getDataTypeRefinementAccess().getRefineBasicTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_refine_3_0=ruleBasicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeRefinementRule());
            					}
            					set(
            						current,
            						"refine",
            						lv_refine_3_0,
            						"eagledata.core.dsl.datadesc.DataDsl.BasicType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:1760:3: (otherlv_4= '{' ( ( (lv_subsequences_5_0= ruleSubstringConcept ) ) ( (lv_subsequences_6_0= ruleSubstringConcept ) )* )? otherlv_7= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==17) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataDsl.g:1761:4: otherlv_4= '{' ( ( (lv_subsequences_5_0= ruleSubstringConcept ) ) ( (lv_subsequences_6_0= ruleSubstringConcept ) )* )? otherlv_7= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_29); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataTypeRefinementAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalDataDsl.g:1765:4: ( ( (lv_subsequences_5_0= ruleSubstringConcept ) ) ( (lv_subsequences_6_0= ruleSubstringConcept ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( ((LA35_0>=33 && LA35_0<=38)) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalDataDsl.g:1766:5: ( (lv_subsequences_5_0= ruleSubstringConcept ) ) ( (lv_subsequences_6_0= ruleSubstringConcept ) )*
                            {
                            // InternalDataDsl.g:1766:5: ( (lv_subsequences_5_0= ruleSubstringConcept ) )
                            // InternalDataDsl.g:1767:6: (lv_subsequences_5_0= ruleSubstringConcept )
                            {
                            // InternalDataDsl.g:1767:6: (lv_subsequences_5_0= ruleSubstringConcept )
                            // InternalDataDsl.g:1768:7: lv_subsequences_5_0= ruleSubstringConcept
                            {

                            							newCompositeNode(grammarAccess.getDataTypeRefinementAccess().getSubsequencesSubstringConceptParserRuleCall_4_1_0_0());
                            						
                            pushFollow(FOLLOW_29);
                            lv_subsequences_5_0=ruleSubstringConcept();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getDataTypeRefinementRule());
                            							}
                            							add(
                            								current,
                            								"subsequences",
                            								lv_subsequences_5_0,
                            								"eagledata.core.dsl.datadesc.DataDsl.SubstringConcept");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalDataDsl.g:1785:5: ( (lv_subsequences_6_0= ruleSubstringConcept ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( ((LA34_0>=33 && LA34_0<=38)) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalDataDsl.g:1786:6: (lv_subsequences_6_0= ruleSubstringConcept )
                            	    {
                            	    // InternalDataDsl.g:1786:6: (lv_subsequences_6_0= ruleSubstringConcept )
                            	    // InternalDataDsl.g:1787:7: lv_subsequences_6_0= ruleSubstringConcept
                            	    {

                            	    							newCompositeNode(grammarAccess.getDataTypeRefinementAccess().getSubsequencesSubstringConceptParserRuleCall_4_1_1_0());
                            	    						
                            	    pushFollow(FOLLOW_29);
                            	    lv_subsequences_6_0=ruleSubstringConcept();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getDataTypeRefinementRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"subsequences",
                            	    								lv_subsequences_6_0,
                            	    								"eagledata.core.dsl.datadesc.DataDsl.SubstringConcept");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop34;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getDataTypeRefinementAccess().getRightCurlyBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            // InternalDataDsl.g:1810:3: (otherlv_8= '(' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==25) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataDsl.g:1811:4: otherlv_8= '(' ( (lv_options_9_0= ruleOption ) ) (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )* otherlv_12= ')'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataTypeRefinementAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalDataDsl.g:1815:4: ( (lv_options_9_0= ruleOption ) )
                    // InternalDataDsl.g:1816:5: (lv_options_9_0= ruleOption )
                    {
                    // InternalDataDsl.g:1816:5: (lv_options_9_0= ruleOption )
                    // InternalDataDsl.g:1817:6: lv_options_9_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getDataTypeRefinementAccess().getOptionsOptionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_options_9_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeRefinementRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_9_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1834:4: (otherlv_10= ',' ( (lv_options_11_0= ruleOption ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==21) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalDataDsl.g:1835:5: otherlv_10= ',' ( (lv_options_11_0= ruleOption ) )
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_19); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getDataTypeRefinementAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalDataDsl.g:1839:5: ( (lv_options_11_0= ruleOption ) )
                    	    // InternalDataDsl.g:1840:6: (lv_options_11_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:1840:6: (lv_options_11_0= ruleOption )
                    	    // InternalDataDsl.g:1841:7: lv_options_11_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataTypeRefinementAccess().getOptionsOptionParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    lv_options_11_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataTypeRefinementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_11_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getDataTypeRefinementAccess().getRightParenthesisKeyword_5_3());
                    			

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
    // $ANTLR end "ruleDataTypeRefinement"


    // $ANTLR start "entryRuleEnumeration"
    // InternalDataDsl.g:1868:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalDataDsl.g:1868:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalDataDsl.g:1869:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalDataDsl.g:1875:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_values_3_0=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalDataDsl.g:1881:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) )
            // InternalDataDsl.g:1882:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            {
            // InternalDataDsl.g:1882:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            // InternalDataDsl.g:1883:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalDataDsl.g:1887:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:1888:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:1888:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:1889:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataDsl.g:1909:3: ( (lv_values_3_0= RULE_STRING ) )
            // InternalDataDsl.g:1910:4: (lv_values_3_0= RULE_STRING )
            {
            // InternalDataDsl.g:1910:4: (lv_values_3_0= RULE_STRING )
            // InternalDataDsl.g:1911:5: lv_values_3_0= RULE_STRING
            {
            lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_values_3_0, grammarAccess.getEnumerationAccess().getValuesSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEnumerationRule());
            					}
            					addWithLastConsumed(
            						current,
            						"values",
            						lv_values_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDataDsl.g:1927:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==21) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDataDsl.g:1928:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDataDsl.g:1932:4: ( (lv_values_5_0= RULE_STRING ) )
            	    // InternalDataDsl.g:1933:5: (lv_values_5_0= RULE_STRING )
            	    {
            	    // InternalDataDsl.g:1933:5: (lv_values_5_0= RULE_STRING )
            	    // InternalDataDsl.g:1934:6: lv_values_5_0= RULE_STRING
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	    						newLeafNode(lv_values_5_0, grammarAccess.getEnumerationAccess().getValuesSTRINGTerminalRuleCall_4_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEnumerationRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"values",
            	    							lv_values_5_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

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


    // $ANTLR start "entryRuleOption"
    // InternalDataDsl.g:1959:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDataDsl.g:1959:47: (iv_ruleOption= ruleOption EOF )
            // InternalDataDsl.g:1960:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalDataDsl.g:1966:1: ruleOption returns [EObject current=null] : (this_StringOption_0= ruleStringOption | this_IntOption_1= ruleIntOption | this_BooleanOption_2= ruleBooleanOption | this_DoubleOption_3= ruleDoubleOption | this_ListQualifiedNameOption_4= ruleListQualifiedNameOption ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_StringOption_0 = null;

        EObject this_IntOption_1 = null;

        EObject this_BooleanOption_2 = null;

        EObject this_DoubleOption_3 = null;

        EObject this_ListQualifiedNameOption_4 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1972:2: ( (this_StringOption_0= ruleStringOption | this_IntOption_1= ruleIntOption | this_BooleanOption_2= ruleBooleanOption | this_DoubleOption_3= ruleDoubleOption | this_ListQualifiedNameOption_4= ruleListQualifiedNameOption ) )
            // InternalDataDsl.g:1973:2: (this_StringOption_0= ruleStringOption | this_IntOption_1= ruleIntOption | this_BooleanOption_2= ruleBooleanOption | this_DoubleOption_3= ruleDoubleOption | this_ListQualifiedNameOption_4= ruleListQualifiedNameOption )
            {
            // InternalDataDsl.g:1973:2: (this_StringOption_0= ruleStringOption | this_IntOption_1= ruleIntOption | this_BooleanOption_2= ruleBooleanOption | this_DoubleOption_3= ruleDoubleOption | this_ListQualifiedNameOption_4= ruleListQualifiedNameOption )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                {
                alt40=1;
                }
                break;
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt40=2;
                }
                break;
            case 76:
            case 77:
                {
                alt40=3;
                }
                break;
            case 73:
            case 74:
            case 75:
                {
                alt40=4;
                }
                break;
            case 78:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalDataDsl.g:1974:3: this_StringOption_0= ruleStringOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getStringOptionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringOption_0=ruleStringOption();

                    state._fsp--;


                    			current = this_StringOption_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1983:3: this_IntOption_1= ruleIntOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getIntOptionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntOption_1=ruleIntOption();

                    state._fsp--;


                    			current = this_IntOption_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1992:3: this_BooleanOption_2= ruleBooleanOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getBooleanOptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanOption_2=ruleBooleanOption();

                    state._fsp--;


                    			current = this_BooleanOption_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2001:3: this_DoubleOption_3= ruleDoubleOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getDoubleOptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleOption_3=ruleDoubleOption();

                    state._fsp--;


                    			current = this_DoubleOption_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:2010:3: this_ListQualifiedNameOption_4= ruleListQualifiedNameOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getListQualifiedNameOptionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ListQualifiedNameOption_4=ruleListQualifiedNameOption();

                    state._fsp--;


                    			current = this_ListQualifiedNameOption_4;
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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleStringOption"
    // InternalDataDsl.g:2022:1: entryRuleStringOption returns [EObject current=null] : iv_ruleStringOption= ruleStringOption EOF ;
    public final EObject entryRuleStringOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOption = null;


        try {
            // InternalDataDsl.g:2022:53: (iv_ruleStringOption= ruleStringOption EOF )
            // InternalDataDsl.g:2023:2: iv_ruleStringOption= ruleStringOption EOF
            {
             newCompositeNode(grammarAccess.getStringOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringOption=ruleStringOption();

            state._fsp--;

             current =iv_ruleStringOption; 
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
    // $ANTLR end "entryRuleStringOption"


    // $ANTLR start "ruleStringOption"
    // InternalDataDsl.g:2029:1: ruleStringOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:2035:2: ( ( ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalDataDsl.g:2036:2: ( ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalDataDsl.g:2036:2: ( ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalDataDsl.g:2037:3: ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalDataDsl.g:2037:3: ( (lv_key_0_0= ruleStringOptionKey ) )
            // InternalDataDsl.g:2038:4: (lv_key_0_0= ruleStringOptionKey )
            {
            // InternalDataDsl.g:2038:4: (lv_key_0_0= ruleStringOptionKey )
            // InternalDataDsl.g:2039:5: lv_key_0_0= ruleStringOptionKey
            {

            					newCompositeNode(grammarAccess.getStringOptionAccess().getKeyStringOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_key_0_0=ruleStringOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.StringOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getStringOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:2060:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDataDsl.g:2061:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDataDsl.g:2061:4: (lv_value_2_0= RULE_STRING )
            // InternalDataDsl.g:2062:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getStringOptionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleStringOption"


    // $ANTLR start "entryRuleIntOption"
    // InternalDataDsl.g:2082:1: entryRuleIntOption returns [EObject current=null] : iv_ruleIntOption= ruleIntOption EOF ;
    public final EObject entryRuleIntOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOption = null;


        try {
            // InternalDataDsl.g:2082:50: (iv_ruleIntOption= ruleIntOption EOF )
            // InternalDataDsl.g:2083:2: iv_ruleIntOption= ruleIntOption EOF
            {
             newCompositeNode(grammarAccess.getIntOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntOption=ruleIntOption();

            state._fsp--;

             current =iv_ruleIntOption; 
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
    // $ANTLR end "entryRuleIntOption"


    // $ANTLR start "ruleIntOption"
    // InternalDataDsl.g:2089:1: ruleIntOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:2095:2: ( ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDataDsl.g:2096:2: ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDataDsl.g:2096:2: ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDataDsl.g:2097:3: ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDataDsl.g:2097:3: ( (lv_key_0_0= ruleIntOptionKey ) )
            // InternalDataDsl.g:2098:4: (lv_key_0_0= ruleIntOptionKey )
            {
            // InternalDataDsl.g:2098:4: (lv_key_0_0= ruleIntOptionKey )
            // InternalDataDsl.g:2099:5: lv_key_0_0= ruleIntOptionKey
            {

            					newCompositeNode(grammarAccess.getIntOptionAccess().getKeyIntOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_key_0_0=ruleIntOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.IntOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIntOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:2120:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDataDsl.g:2121:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDataDsl.g:2121:4: (lv_value_2_0= RULE_INT )
            // InternalDataDsl.g:2122:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getIntOptionAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIntOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleIntOption"


    // $ANTLR start "entryRuleDoubleOption"
    // InternalDataDsl.g:2142:1: entryRuleDoubleOption returns [EObject current=null] : iv_ruleDoubleOption= ruleDoubleOption EOF ;
    public final EObject entryRuleDoubleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleOption = null;


        try {
            // InternalDataDsl.g:2142:53: (iv_ruleDoubleOption= ruleDoubleOption EOF )
            // InternalDataDsl.g:2143:2: iv_ruleDoubleOption= ruleDoubleOption EOF
            {
             newCompositeNode(grammarAccess.getDoubleOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleOption=ruleDoubleOption();

            state._fsp--;

             current =iv_ruleDoubleOption; 
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
    // $ANTLR end "entryRuleDoubleOption"


    // $ANTLR start "ruleDoubleOption"
    // InternalDataDsl.g:2149:1: ruleDoubleOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleDoubleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:2155:2: ( ( ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) ) ) )
            // InternalDataDsl.g:2156:2: ( ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) ) )
            {
            // InternalDataDsl.g:2156:2: ( ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) ) )
            // InternalDataDsl.g:2157:3: ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) )
            {
            // InternalDataDsl.g:2157:3: ( (lv_key_0_0= ruleDoubleOptionKey ) )
            // InternalDataDsl.g:2158:4: (lv_key_0_0= ruleDoubleOptionKey )
            {
            // InternalDataDsl.g:2158:4: (lv_key_0_0= ruleDoubleOptionKey )
            // InternalDataDsl.g:2159:5: lv_key_0_0= ruleDoubleOptionKey
            {

            					newCompositeNode(grammarAccess.getDoubleOptionAccess().getKeyDoubleOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_key_0_0=ruleDoubleOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.DoubleOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:2180:3: ( (lv_value_2_0= RULE_DOUBLE ) )
            // InternalDataDsl.g:2181:4: (lv_value_2_0= RULE_DOUBLE )
            {
            // InternalDataDsl.g:2181:4: (lv_value_2_0= RULE_DOUBLE )
            // InternalDataDsl.g:2182:5: lv_value_2_0= RULE_DOUBLE
            {
            lv_value_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDoubleOptionAccess().getValueDOUBLETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoubleOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"eagledata.core.dsl.datadesc.DataDsl.DOUBLE");
            				

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
    // $ANTLR end "ruleDoubleOption"


    // $ANTLR start "entryRuleBooleanOption"
    // InternalDataDsl.g:2202:1: entryRuleBooleanOption returns [EObject current=null] : iv_ruleBooleanOption= ruleBooleanOption EOF ;
    public final EObject entryRuleBooleanOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOption = null;


        try {
            // InternalDataDsl.g:2202:54: (iv_ruleBooleanOption= ruleBooleanOption EOF )
            // InternalDataDsl.g:2203:2: iv_ruleBooleanOption= ruleBooleanOption EOF
            {
             newCompositeNode(grammarAccess.getBooleanOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanOption=ruleBooleanOption();

            state._fsp--;

             current =iv_ruleBooleanOption; 
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
    // $ANTLR end "entryRuleBooleanOption"


    // $ANTLR start "ruleBooleanOption"
    // InternalDataDsl.g:2209:1: ruleBooleanOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBooleanOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:2215:2: ( ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // InternalDataDsl.g:2216:2: ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // InternalDataDsl.g:2216:2: ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // InternalDataDsl.g:2217:3: ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            // InternalDataDsl.g:2217:3: ( (lv_key_0_0= ruleBooleanOptionKey ) )
            // InternalDataDsl.g:2218:4: (lv_key_0_0= ruleBooleanOptionKey )
            {
            // InternalDataDsl.g:2218:4: (lv_key_0_0= ruleBooleanOptionKey )
            // InternalDataDsl.g:2219:5: lv_key_0_0= ruleBooleanOptionKey
            {

            					newCompositeNode(grammarAccess.getBooleanOptionAccess().getKeyBooleanOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_key_0_0=ruleBooleanOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.BooleanOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:2240:3: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // InternalDataDsl.g:2241:4: (lv_value_2_0= RULE_BOOLEAN )
            {
            // InternalDataDsl.g:2241:4: (lv_value_2_0= RULE_BOOLEAN )
            // InternalDataDsl.g:2242:5: lv_value_2_0= RULE_BOOLEAN
            {
            lv_value_2_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getBooleanOptionAccess().getValueBOOLEANTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBooleanOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"eagledata.core.dsl.datadesc.DataDsl.BOOLEAN");
            				

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
    // $ANTLR end "ruleBooleanOption"


    // $ANTLR start "entryRuleListQualifiedNameOption"
    // InternalDataDsl.g:2262:1: entryRuleListQualifiedNameOption returns [EObject current=null] : iv_ruleListQualifiedNameOption= ruleListQualifiedNameOption EOF ;
    public final EObject entryRuleListQualifiedNameOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListQualifiedNameOption = null;


        try {
            // InternalDataDsl.g:2262:64: (iv_ruleListQualifiedNameOption= ruleListQualifiedNameOption EOF )
            // InternalDataDsl.g:2263:2: iv_ruleListQualifiedNameOption= ruleListQualifiedNameOption EOF
            {
             newCompositeNode(grammarAccess.getListQualifiedNameOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListQualifiedNameOption=ruleListQualifiedNameOption();

            state._fsp--;

             current =iv_ruleListQualifiedNameOption; 
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
    // $ANTLR end "entryRuleListQualifiedNameOption"


    // $ANTLR start "ruleListQualifiedNameOption"
    // InternalDataDsl.g:2269:1: ruleListQualifiedNameOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleListQualifiedNameOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleListQualifiedNameOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:2275:2: ( ( ( (lv_key_0_0= ruleListQualifiedNameOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) ) )
            // InternalDataDsl.g:2276:2: ( ( (lv_key_0_0= ruleListQualifiedNameOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) )
            {
            // InternalDataDsl.g:2276:2: ( ( (lv_key_0_0= ruleListQualifiedNameOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:2277:3: ( (lv_key_0_0= ruleListQualifiedNameOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:2277:3: ( (lv_key_0_0= ruleListQualifiedNameOptionKey ) )
            // InternalDataDsl.g:2278:4: (lv_key_0_0= ruleListQualifiedNameOptionKey )
            {
            // InternalDataDsl.g:2278:4: (lv_key_0_0= ruleListQualifiedNameOptionKey )
            // InternalDataDsl.g:2279:5: lv_key_0_0= ruleListQualifiedNameOptionKey
            {

            					newCompositeNode(grammarAccess.getListQualifiedNameOptionAccess().getKeyListQualifiedNameOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_key_0_0=ruleListQualifiedNameOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListQualifiedNameOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.ListQualifiedNameOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getListQualifiedNameOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:2300:3: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:2301:4: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:2301:4: ( ruleQualifiedName )
            // InternalDataDsl.g:2302:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getListQualifiedNameOptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getListQualifiedNameOptionAccess().getFragmentsNodeCrossReference_2_0());
            				
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
    // $ANTLR end "ruleListQualifiedNameOption"


    // $ANTLR start "entryRuleDataOption"
    // InternalDataDsl.g:2320:1: entryRuleDataOption returns [EObject current=null] : iv_ruleDataOption= ruleDataOption EOF ;
    public final EObject entryRuleDataOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOption = null;


        try {
            // InternalDataDsl.g:2320:51: (iv_ruleDataOption= ruleDataOption EOF )
            // InternalDataDsl.g:2321:2: iv_ruleDataOption= ruleDataOption EOF
            {
             newCompositeNode(grammarAccess.getDataOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataOption=ruleDataOption();

            state._fsp--;

             current =iv_ruleDataOption; 
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
    // $ANTLR end "entryRuleDataOption"


    // $ANTLR start "ruleDataOption"
    // InternalDataDsl.g:2327:1: ruleDataOption returns [EObject current=null] : ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDataOption() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2333:2: ( ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalDataDsl.g:2334:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalDataDsl.g:2334:2: ( ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalDataDsl.g:2335:3: ( (lv_key_0_0= RULE_STRING ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalDataDsl.g:2335:3: ( (lv_key_0_0= RULE_STRING ) )
            // InternalDataDsl.g:2336:4: (lv_key_0_0= RULE_STRING )
            {
            // InternalDataDsl.g:2336:4: (lv_key_0_0= RULE_STRING )
            // InternalDataDsl.g:2337:5: lv_key_0_0= RULE_STRING
            {
            lv_key_0_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_key_0_0, grammarAccess.getDataOptionAccess().getKeySTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getDataOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:2357:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDataDsl.g:2358:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDataDsl.g:2358:4: (lv_value_2_0= RULE_STRING )
            // InternalDataDsl.g:2359:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getDataOptionAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataOptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleDataOption"


    // $ANTLR start "ruleTypeCharacter"
    // InternalDataDsl.g:2379:1: ruleTypeCharacter returns [Enumerator current=null] : ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'digit' ) ) ;
    public final Enumerator ruleTypeCharacter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2385:2: ( ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'digit' ) ) )
            // InternalDataDsl.g:2386:2: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'digit' ) )
            {
            // InternalDataDsl.g:2386:2: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'digit' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                alt41=1;
            }
            else if ( (LA41_0==34) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalDataDsl.g:2387:3: (enumLiteral_0= 'char' )
                    {
                    // InternalDataDsl.g:2387:3: (enumLiteral_0= 'char' )
                    // InternalDataDsl.g:2388:4: enumLiteral_0= 'char'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2395:3: (enumLiteral_1= 'digit' )
                    {
                    // InternalDataDsl.g:2395:3: (enumLiteral_1= 'digit' )
                    // InternalDataDsl.g:2396:4: enumLiteral_1= 'digit'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getTypeCharacterAccess().getDigitEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeCharacterAccess().getDigitEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleTypeCharacter"


    // $ANTLR start "ruleTypeString"
    // InternalDataDsl.g:2406:1: ruleTypeString returns [Enumerator current=null] : ( (enumLiteral_0= 'anycase_string' ) | (enumLiteral_1= 'lowercase_string' ) | (enumLiteral_2= 'uppercase_string' ) | (enumLiteral_3= 'digits' ) ) ;
    public final Enumerator ruleTypeString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2412:2: ( ( (enumLiteral_0= 'anycase_string' ) | (enumLiteral_1= 'lowercase_string' ) | (enumLiteral_2= 'uppercase_string' ) | (enumLiteral_3= 'digits' ) ) )
            // InternalDataDsl.g:2413:2: ( (enumLiteral_0= 'anycase_string' ) | (enumLiteral_1= 'lowercase_string' ) | (enumLiteral_2= 'uppercase_string' ) | (enumLiteral_3= 'digits' ) )
            {
            // InternalDataDsl.g:2413:2: ( (enumLiteral_0= 'anycase_string' ) | (enumLiteral_1= 'lowercase_string' ) | (enumLiteral_2= 'uppercase_string' ) | (enumLiteral_3= 'digits' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt42=1;
                }
                break;
            case 36:
                {
                alt42=2;
                }
                break;
            case 37:
                {
                alt42=3;
                }
                break;
            case 38:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalDataDsl.g:2414:3: (enumLiteral_0= 'anycase_string' )
                    {
                    // InternalDataDsl.g:2414:3: (enumLiteral_0= 'anycase_string' )
                    // InternalDataDsl.g:2415:4: enumLiteral_0= 'anycase_string'
                    {
                    enumLiteral_0=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2422:3: (enumLiteral_1= 'lowercase_string' )
                    {
                    // InternalDataDsl.g:2422:3: (enumLiteral_1= 'lowercase_string' )
                    // InternalDataDsl.g:2423:4: enumLiteral_1= 'lowercase_string'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2430:3: (enumLiteral_2= 'uppercase_string' )
                    {
                    // InternalDataDsl.g:2430:3: (enumLiteral_2= 'uppercase_string' )
                    // InternalDataDsl.g:2431:4: enumLiteral_2= 'uppercase_string'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2438:3: (enumLiteral_3= 'digits' )
                    {
                    // InternalDataDsl.g:2438:3: (enumLiteral_3= 'digits' )
                    // InternalDataDsl.g:2439:4: enumLiteral_3= 'digits'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getTypeStringAccess().getNumbersEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeStringAccess().getNumbersEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTypeString"


    // $ANTLR start "ruleBasicType"
    // InternalDataDsl.g:2449:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Url' ) | (enumLiteral_2= 'Int' ) | (enumLiteral_3= 'LongInt' ) | (enumLiteral_4= 'Real' ) | (enumLiteral_5= 'Date' ) | (enumLiteral_6= 'Time' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'Month' ) | (enumLiteral_9= 'Day' ) | (enumLiteral_10= 'Boolean' ) | (enumLiteral_11= 'Lat' ) | (enumLiteral_12= 'Long' ) | (enumLiteral_13= 'Percent' ) | (enumLiteral_14= 'Email' ) | (enumLiteral_15= 'Currency' ) | (enumLiteral_16= 'CreditCard' ) | (enumLiteral_17= 'IBAN' ) | (enumLiteral_18= 'ISBN' ) | (enumLiteral_19= 'ISSN' ) | (enumLiteral_20= 'Inet' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;
        Token enumLiteral_16=null;
        Token enumLiteral_17=null;
        Token enumLiteral_18=null;
        Token enumLiteral_19=null;
        Token enumLiteral_20=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2455:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Url' ) | (enumLiteral_2= 'Int' ) | (enumLiteral_3= 'LongInt' ) | (enumLiteral_4= 'Real' ) | (enumLiteral_5= 'Date' ) | (enumLiteral_6= 'Time' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'Month' ) | (enumLiteral_9= 'Day' ) | (enumLiteral_10= 'Boolean' ) | (enumLiteral_11= 'Lat' ) | (enumLiteral_12= 'Long' ) | (enumLiteral_13= 'Percent' ) | (enumLiteral_14= 'Email' ) | (enumLiteral_15= 'Currency' ) | (enumLiteral_16= 'CreditCard' ) | (enumLiteral_17= 'IBAN' ) | (enumLiteral_18= 'ISBN' ) | (enumLiteral_19= 'ISSN' ) | (enumLiteral_20= 'Inet' ) ) )
            // InternalDataDsl.g:2456:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Url' ) | (enumLiteral_2= 'Int' ) | (enumLiteral_3= 'LongInt' ) | (enumLiteral_4= 'Real' ) | (enumLiteral_5= 'Date' ) | (enumLiteral_6= 'Time' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'Month' ) | (enumLiteral_9= 'Day' ) | (enumLiteral_10= 'Boolean' ) | (enumLiteral_11= 'Lat' ) | (enumLiteral_12= 'Long' ) | (enumLiteral_13= 'Percent' ) | (enumLiteral_14= 'Email' ) | (enumLiteral_15= 'Currency' ) | (enumLiteral_16= 'CreditCard' ) | (enumLiteral_17= 'IBAN' ) | (enumLiteral_18= 'ISBN' ) | (enumLiteral_19= 'ISSN' ) | (enumLiteral_20= 'Inet' ) )
            {
            // InternalDataDsl.g:2456:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Url' ) | (enumLiteral_2= 'Int' ) | (enumLiteral_3= 'LongInt' ) | (enumLiteral_4= 'Real' ) | (enumLiteral_5= 'Date' ) | (enumLiteral_6= 'Time' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'Month' ) | (enumLiteral_9= 'Day' ) | (enumLiteral_10= 'Boolean' ) | (enumLiteral_11= 'Lat' ) | (enumLiteral_12= 'Long' ) | (enumLiteral_13= 'Percent' ) | (enumLiteral_14= 'Email' ) | (enumLiteral_15= 'Currency' ) | (enumLiteral_16= 'CreditCard' ) | (enumLiteral_17= 'IBAN' ) | (enumLiteral_18= 'ISBN' ) | (enumLiteral_19= 'ISSN' ) | (enumLiteral_20= 'Inet' ) )
            int alt43=21;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt43=1;
                }
                break;
            case 40:
                {
                alt43=2;
                }
                break;
            case 41:
                {
                alt43=3;
                }
                break;
            case 42:
                {
                alt43=4;
                }
                break;
            case 43:
                {
                alt43=5;
                }
                break;
            case 44:
                {
                alt43=6;
                }
                break;
            case 45:
                {
                alt43=7;
                }
                break;
            case 46:
                {
                alt43=8;
                }
                break;
            case 47:
                {
                alt43=9;
                }
                break;
            case 48:
                {
                alt43=10;
                }
                break;
            case 49:
                {
                alt43=11;
                }
                break;
            case 50:
                {
                alt43=12;
                }
                break;
            case 51:
                {
                alt43=13;
                }
                break;
            case 52:
                {
                alt43=14;
                }
                break;
            case 53:
                {
                alt43=15;
                }
                break;
            case 54:
                {
                alt43=16;
                }
                break;
            case 55:
                {
                alt43=17;
                }
                break;
            case 56:
                {
                alt43=18;
                }
                break;
            case 57:
                {
                alt43=19;
                }
                break;
            case 58:
                {
                alt43=20;
                }
                break;
            case 59:
                {
                alt43=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalDataDsl.g:2457:3: (enumLiteral_0= 'String' )
                    {
                    // InternalDataDsl.g:2457:3: (enumLiteral_0= 'String' )
                    // InternalDataDsl.g:2458:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2465:3: (enumLiteral_1= 'Url' )
                    {
                    // InternalDataDsl.g:2465:3: (enumLiteral_1= 'Url' )
                    // InternalDataDsl.g:2466:4: enumLiteral_1= 'Url'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2473:3: (enumLiteral_2= 'Int' )
                    {
                    // InternalDataDsl.g:2473:3: (enumLiteral_2= 'Int' )
                    // InternalDataDsl.g:2474:4: enumLiteral_2= 'Int'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2481:3: (enumLiteral_3= 'LongInt' )
                    {
                    // InternalDataDsl.g:2481:3: (enumLiteral_3= 'LongInt' )
                    // InternalDataDsl.g:2482:4: enumLiteral_3= 'LongInt'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLongIntEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getLongIntEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:2489:3: (enumLiteral_4= 'Real' )
                    {
                    // InternalDataDsl.g:2489:3: (enumLiteral_4= 'Real' )
                    // InternalDataDsl.g:2490:4: enumLiteral_4= 'Real'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:2497:3: (enumLiteral_5= 'Date' )
                    {
                    // InternalDataDsl.g:2497:3: (enumLiteral_5= 'Date' )
                    // InternalDataDsl.g:2498:4: enumLiteral_5= 'Date'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:2505:3: (enumLiteral_6= 'Time' )
                    {
                    // InternalDataDsl.g:2505:3: (enumLiteral_6= 'Time' )
                    // InternalDataDsl.g:2506:4: enumLiteral_6= 'Time'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:2513:3: (enumLiteral_7= 'Year' )
                    {
                    // InternalDataDsl.g:2513:3: (enumLiteral_7= 'Year' )
                    // InternalDataDsl.g:2514:4: enumLiteral_7= 'Year'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:2521:3: (enumLiteral_8= 'Month' )
                    {
                    // InternalDataDsl.g:2521:3: (enumLiteral_8= 'Month' )
                    // InternalDataDsl.g:2522:4: enumLiteral_8= 'Month'
                    {
                    enumLiteral_8=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:2529:3: (enumLiteral_9= 'Day' )
                    {
                    // InternalDataDsl.g:2529:3: (enumLiteral_9= 'Day' )
                    // InternalDataDsl.g:2530:4: enumLiteral_9= 'Day'
                    {
                    enumLiteral_9=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:2537:3: (enumLiteral_10= 'Boolean' )
                    {
                    // InternalDataDsl.g:2537:3: (enumLiteral_10= 'Boolean' )
                    // InternalDataDsl.g:2538:4: enumLiteral_10= 'Boolean'
                    {
                    enumLiteral_10=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDsl.g:2545:3: (enumLiteral_11= 'Lat' )
                    {
                    // InternalDataDsl.g:2545:3: (enumLiteral_11= 'Lat' )
                    // InternalDataDsl.g:2546:4: enumLiteral_11= 'Lat'
                    {
                    enumLiteral_11=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalDataDsl.g:2553:3: (enumLiteral_12= 'Long' )
                    {
                    // InternalDataDsl.g:2553:3: (enumLiteral_12= 'Long' )
                    // InternalDataDsl.g:2554:4: enumLiteral_12= 'Long'
                    {
                    enumLiteral_12=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalDataDsl.g:2561:3: (enumLiteral_13= 'Percent' )
                    {
                    // InternalDataDsl.g:2561:3: (enumLiteral_13= 'Percent' )
                    // InternalDataDsl.g:2562:4: enumLiteral_13= 'Percent'
                    {
                    enumLiteral_13=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getPercentEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getBasicTypeAccess().getPercentEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalDataDsl.g:2569:3: (enumLiteral_14= 'Email' )
                    {
                    // InternalDataDsl.g:2569:3: (enumLiteral_14= 'Email' )
                    // InternalDataDsl.g:2570:4: enumLiteral_14= 'Email'
                    {
                    enumLiteral_14=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getEmailEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getBasicTypeAccess().getEmailEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalDataDsl.g:2577:3: (enumLiteral_15= 'Currency' )
                    {
                    // InternalDataDsl.g:2577:3: (enumLiteral_15= 'Currency' )
                    // InternalDataDsl.g:2578:4: enumLiteral_15= 'Currency'
                    {
                    enumLiteral_15=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getCurrencyEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getBasicTypeAccess().getCurrencyEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;
                case 17 :
                    // InternalDataDsl.g:2585:3: (enumLiteral_16= 'CreditCard' )
                    {
                    // InternalDataDsl.g:2585:3: (enumLiteral_16= 'CreditCard' )
                    // InternalDataDsl.g:2586:4: enumLiteral_16= 'CreditCard'
                    {
                    enumLiteral_16=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getCreditcardEnumLiteralDeclaration_16().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_16, grammarAccess.getBasicTypeAccess().getCreditcardEnumLiteralDeclaration_16());
                    			

                    }


                    }
                    break;
                case 18 :
                    // InternalDataDsl.g:2593:3: (enumLiteral_17= 'IBAN' )
                    {
                    // InternalDataDsl.g:2593:3: (enumLiteral_17= 'IBAN' )
                    // InternalDataDsl.g:2594:4: enumLiteral_17= 'IBAN'
                    {
                    enumLiteral_17=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getIBANEnumLiteralDeclaration_17().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_17, grammarAccess.getBasicTypeAccess().getIBANEnumLiteralDeclaration_17());
                    			

                    }


                    }
                    break;
                case 19 :
                    // InternalDataDsl.g:2601:3: (enumLiteral_18= 'ISBN' )
                    {
                    // InternalDataDsl.g:2601:3: (enumLiteral_18= 'ISBN' )
                    // InternalDataDsl.g:2602:4: enumLiteral_18= 'ISBN'
                    {
                    enumLiteral_18=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getISBNEnumLiteralDeclaration_18().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_18, grammarAccess.getBasicTypeAccess().getISBNEnumLiteralDeclaration_18());
                    			

                    }


                    }
                    break;
                case 20 :
                    // InternalDataDsl.g:2609:3: (enumLiteral_19= 'ISSN' )
                    {
                    // InternalDataDsl.g:2609:3: (enumLiteral_19= 'ISSN' )
                    // InternalDataDsl.g:2610:4: enumLiteral_19= 'ISSN'
                    {
                    enumLiteral_19=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getISSNEnumLiteralDeclaration_19().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_19, grammarAccess.getBasicTypeAccess().getISSNEnumLiteralDeclaration_19());
                    			

                    }


                    }
                    break;
                case 21 :
                    // InternalDataDsl.g:2617:3: (enumLiteral_20= 'Inet' )
                    {
                    // InternalDataDsl.g:2617:3: (enumLiteral_20= 'Inet' )
                    // InternalDataDsl.g:2618:4: enumLiteral_20= 'Inet'
                    {
                    enumLiteral_20=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getInetEnumLiteralDeclaration_20().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_20, grammarAccess.getBasicTypeAccess().getInetEnumLiteralDeclaration_20());
                    			

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "ruleStringOptionKey"
    // InternalDataDsl.g:2628:1: ruleStringOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'separator' ) | (enumLiteral_2= 'default' ) | (enumLiteral_3= 'regex' ) | (enumLiteral_4= 'flags' ) | (enumLiteral_5= 'decimalchar' ) | (enumLiteral_6= 'pattern' ) | (enumLiteral_7= 'format' ) ) ;
    public final Enumerator ruleStringOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2634:2: ( ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'separator' ) | (enumLiteral_2= 'default' ) | (enumLiteral_3= 'regex' ) | (enumLiteral_4= 'flags' ) | (enumLiteral_5= 'decimalchar' ) | (enumLiteral_6= 'pattern' ) | (enumLiteral_7= 'format' ) ) )
            // InternalDataDsl.g:2635:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'separator' ) | (enumLiteral_2= 'default' ) | (enumLiteral_3= 'regex' ) | (enumLiteral_4= 'flags' ) | (enumLiteral_5= 'decimalchar' ) | (enumLiteral_6= 'pattern' ) | (enumLiteral_7= 'format' ) )
            {
            // InternalDataDsl.g:2635:2: ( (enumLiteral_0= 'null' ) | (enumLiteral_1= 'separator' ) | (enumLiteral_2= 'default' ) | (enumLiteral_3= 'regex' ) | (enumLiteral_4= 'flags' ) | (enumLiteral_5= 'decimalchar' ) | (enumLiteral_6= 'pattern' ) | (enumLiteral_7= 'format' ) )
            int alt44=8;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt44=1;
                }
                break;
            case 61:
                {
                alt44=2;
                }
                break;
            case 62:
                {
                alt44=3;
                }
                break;
            case 63:
                {
                alt44=4;
                }
                break;
            case 64:
                {
                alt44=5;
                }
                break;
            case 65:
                {
                alt44=6;
                }
                break;
            case 66:
                {
                alt44=7;
                }
                break;
            case 67:
                {
                alt44=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalDataDsl.g:2636:3: (enumLiteral_0= 'null' )
                    {
                    // InternalDataDsl.g:2636:3: (enumLiteral_0= 'null' )
                    // InternalDataDsl.g:2637:4: enumLiteral_0= 'null'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2644:3: (enumLiteral_1= 'separator' )
                    {
                    // InternalDataDsl.g:2644:3: (enumLiteral_1= 'separator' )
                    // InternalDataDsl.g:2645:4: enumLiteral_1= 'separator'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2652:3: (enumLiteral_2= 'default' )
                    {
                    // InternalDataDsl.g:2652:3: (enumLiteral_2= 'default' )
                    // InternalDataDsl.g:2653:4: enumLiteral_2= 'default'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2660:3: (enumLiteral_3= 'regex' )
                    {
                    // InternalDataDsl.g:2660:3: (enumLiteral_3= 'regex' )
                    // InternalDataDsl.g:2661:4: enumLiteral_3= 'regex'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:2668:3: (enumLiteral_4= 'flags' )
                    {
                    // InternalDataDsl.g:2668:3: (enumLiteral_4= 'flags' )
                    // InternalDataDsl.g:2669:4: enumLiteral_4= 'flags'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:2676:3: (enumLiteral_5= 'decimalchar' )
                    {
                    // InternalDataDsl.g:2676:3: (enumLiteral_5= 'decimalchar' )
                    // InternalDataDsl.g:2677:4: enumLiteral_5= 'decimalchar'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:2684:3: (enumLiteral_6= 'pattern' )
                    {
                    // InternalDataDsl.g:2684:3: (enumLiteral_6= 'pattern' )
                    // InternalDataDsl.g:2685:4: enumLiteral_6= 'pattern'
                    {
                    enumLiteral_6=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:2692:3: (enumLiteral_7= 'format' )
                    {
                    // InternalDataDsl.g:2692:3: (enumLiteral_7= 'format' )
                    // InternalDataDsl.g:2693:4: enumLiteral_7= 'format'
                    {
                    enumLiteral_7=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getFormatEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getStringOptionKeyAccess().getFormatEnumLiteralDeclaration_7());
                    			

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
    // $ANTLR end "ruleStringOptionKey"


    // $ANTLR start "ruleIntOptionKey"
    // InternalDataDsl.g:2703:1: ruleIntOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'defaultvalue' ) ) ;
    public final Enumerator ruleIntOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2709:2: ( ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'defaultvalue' ) ) )
            // InternalDataDsl.g:2710:2: ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'defaultvalue' ) )
            {
            // InternalDataDsl.g:2710:2: ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'defaultvalue' ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt45=1;
                }
                break;
            case 69:
                {
                alt45=2;
                }
                break;
            case 70:
                {
                alt45=3;
                }
                break;
            case 71:
                {
                alt45=4;
                }
                break;
            case 72:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalDataDsl.g:2711:3: (enumLiteral_0= 'minLength' )
                    {
                    // InternalDataDsl.g:2711:3: (enumLiteral_0= 'minLength' )
                    // InternalDataDsl.g:2712:4: enumLiteral_0= 'minLength'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2719:3: (enumLiteral_1= 'maxLength' )
                    {
                    // InternalDataDsl.g:2719:3: (enumLiteral_1= 'maxLength' )
                    // InternalDataDsl.g:2720:4: enumLiteral_1= 'maxLength'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2727:3: (enumLiteral_2= 'min' )
                    {
                    // InternalDataDsl.g:2727:3: (enumLiteral_2= 'min' )
                    // InternalDataDsl.g:2728:4: enumLiteral_2= 'min'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2735:3: (enumLiteral_3= 'max' )
                    {
                    // InternalDataDsl.g:2735:3: (enumLiteral_3= 'max' )
                    // InternalDataDsl.g:2736:4: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:2743:3: (enumLiteral_4= 'defaultvalue' )
                    {
                    // InternalDataDsl.g:2743:3: (enumLiteral_4= 'defaultvalue' )
                    // InternalDataDsl.g:2744:4: enumLiteral_4= 'defaultvalue'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getDefaultEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getIntOptionKeyAccess().getDefaultEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleIntOptionKey"


    // $ANTLR start "ruleDoubleOptionKey"
    // InternalDataDsl.g:2754:1: ruleDoubleOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'minDouble' ) | (enumLiteral_1= 'maxDouble' ) | (enumLiteral_2= 'defaultvalueDouble' ) ) ;
    public final Enumerator ruleDoubleOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2760:2: ( ( (enumLiteral_0= 'minDouble' ) | (enumLiteral_1= 'maxDouble' ) | (enumLiteral_2= 'defaultvalueDouble' ) ) )
            // InternalDataDsl.g:2761:2: ( (enumLiteral_0= 'minDouble' ) | (enumLiteral_1= 'maxDouble' ) | (enumLiteral_2= 'defaultvalueDouble' ) )
            {
            // InternalDataDsl.g:2761:2: ( (enumLiteral_0= 'minDouble' ) | (enumLiteral_1= 'maxDouble' ) | (enumLiteral_2= 'defaultvalueDouble' ) )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt46=1;
                }
                break;
            case 74:
                {
                alt46=2;
                }
                break;
            case 75:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalDataDsl.g:2762:3: (enumLiteral_0= 'minDouble' )
                    {
                    // InternalDataDsl.g:2762:3: (enumLiteral_0= 'minDouble' )
                    // InternalDataDsl.g:2763:4: enumLiteral_0= 'minDouble'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2770:3: (enumLiteral_1= 'maxDouble' )
                    {
                    // InternalDataDsl.g:2770:3: (enumLiteral_1= 'maxDouble' )
                    // InternalDataDsl.g:2771:4: enumLiteral_1= 'maxDouble'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2778:3: (enumLiteral_2= 'defaultvalueDouble' )
                    {
                    // InternalDataDsl.g:2778:3: (enumLiteral_2= 'defaultvalueDouble' )
                    // InternalDataDsl.g:2779:4: enumLiteral_2= 'defaultvalueDouble'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getDoubleOptionKeyAccess().getDefaultEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDoubleOptionKeyAccess().getDefaultEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDoubleOptionKey"


    // $ANTLR start "ruleBooleanOptionKey"
    // InternalDataDsl.g:2789:1: ruleBooleanOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'nullable' ) | (enumLiteral_1= 'casesensitive' ) ) ;
    public final Enumerator ruleBooleanOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2795:2: ( ( (enumLiteral_0= 'nullable' ) | (enumLiteral_1= 'casesensitive' ) ) )
            // InternalDataDsl.g:2796:2: ( (enumLiteral_0= 'nullable' ) | (enumLiteral_1= 'casesensitive' ) )
            {
            // InternalDataDsl.g:2796:2: ( (enumLiteral_0= 'nullable' ) | (enumLiteral_1= 'casesensitive' ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==76) ) {
                alt47=1;
            }
            else if ( (LA47_0==77) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalDataDsl.g:2797:3: (enumLiteral_0= 'nullable' )
                    {
                    // InternalDataDsl.g:2797:3: (enumLiteral_0= 'nullable' )
                    // InternalDataDsl.g:2798:4: enumLiteral_0= 'nullable'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2805:3: (enumLiteral_1= 'casesensitive' )
                    {
                    // InternalDataDsl.g:2805:3: (enumLiteral_1= 'casesensitive' )
                    // InternalDataDsl.g:2806:4: enumLiteral_1= 'casesensitive'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getBooleanOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBooleanOptionKey"


    // $ANTLR start "ruleListQualifiedNameOptionKey"
    // InternalDataDsl.g:2816:1: ruleListQualifiedNameOptionKey returns [Enumerator current=null] : (enumLiteral_0= 'order' ) ;
    public final Enumerator ruleListQualifiedNameOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2822:2: ( (enumLiteral_0= 'order' ) )
            // InternalDataDsl.g:2823:2: (enumLiteral_0= 'order' )
            {
            // InternalDataDsl.g:2823:2: (enumLiteral_0= 'order' )
            // InternalDataDsl.g:2824:3: enumLiteral_0= 'order'
            {
            enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

            			current = grammarAccess.getListQualifiedNameOptionKeyAccess().getOrderEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getListQualifiedNameOptionKeyAccess().getOrderEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleListQualifiedNameOptionKey"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000E8092002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000E8092000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000E80D2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xF000000000000000L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0FFFFF8000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0FFFFF8001808010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0FFFFF8001848010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002020002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000007E00040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000100L});

}