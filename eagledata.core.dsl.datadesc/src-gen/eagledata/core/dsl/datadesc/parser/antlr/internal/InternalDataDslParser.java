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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_DELETATION_MARK", "RULE_MODIFICATION_MARK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'package'", "'{'", "'}'", "'string'", "'='", "'('", "','", "')'", "'['", "']'", "'description'", "':'", "'fragment'", "'datatype'", "'enumeration'", "'struct'", "'key'", "'unique'", "'list'", "'char'", "'digit'", "'anycase_string'", "'lowercase_string'", "'uppercase_string'", "'digits'", "'regex_form'", "'url'", "'int'", "'real'", "'date'", "'time'", "'year'", "'month'", "'day'", "'boolean'", "'lat'", "'long'", "'casesensitive'", "'null'", "'separator'", "'default'", "'regex'", "'flags'", "'decimalchar'", "'pattern'", "'format'", "'minLength'", "'maxLength'", "'min'", "'max'", "'defaultvalue'", "'minDouble'", "'maxDouble'", "'defaultvalueDouble'", "'nullable'", "'header'", "'squema'", "'CSV'", "'JSON'", "'XML'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_MODIFICATION_MARK=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=11;
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
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DELETATION_MARK=9;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
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
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
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
    // InternalDataDsl.g:72:1: ruleDataModel returns [EObject current=null] : ( ( (lv_descriptions_0_0= ruleDataModelElement ) ) ( (lv_descriptions_1_0= ruleDataModelElement ) )* ) ;
    public final EObject ruleDataModel() throws RecognitionException {
        EObject current = null;

        EObject lv_descriptions_0_0 = null;

        EObject lv_descriptions_1_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:78:2: ( ( ( (lv_descriptions_0_0= ruleDataModelElement ) ) ( (lv_descriptions_1_0= ruleDataModelElement ) )* ) )
            // InternalDataDsl.g:79:2: ( ( (lv_descriptions_0_0= ruleDataModelElement ) ) ( (lv_descriptions_1_0= ruleDataModelElement ) )* )
            {
            // InternalDataDsl.g:79:2: ( ( (lv_descriptions_0_0= ruleDataModelElement ) ) ( (lv_descriptions_1_0= ruleDataModelElement ) )* )
            // InternalDataDsl.g:80:3: ( (lv_descriptions_0_0= ruleDataModelElement ) ) ( (lv_descriptions_1_0= ruleDataModelElement ) )*
            {
            // InternalDataDsl.g:80:3: ( (lv_descriptions_0_0= ruleDataModelElement ) )
            // InternalDataDsl.g:81:4: (lv_descriptions_0_0= ruleDataModelElement )
            {
            // InternalDataDsl.g:81:4: (lv_descriptions_0_0= ruleDataModelElement )
            // InternalDataDsl.g:82:5: lv_descriptions_0_0= ruleDataModelElement
            {

            					newCompositeNode(grammarAccess.getDataModelAccess().getDescriptionsDataModelElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_descriptions_0_0=ruleDataModelElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataModelRule());
            					}
            					add(
            						current,
            						"descriptions",
            						lv_descriptions_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.DataModelElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:99:3: ( (lv_descriptions_1_0= ruleDataModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||LA1_0==18||LA1_0==21||LA1_0==28||(LA1_0>=30 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDataDsl.g:100:4: (lv_descriptions_1_0= ruleDataModelElement )
            	    {
            	    // InternalDataDsl.g:100:4: (lv_descriptions_1_0= ruleDataModelElement )
            	    // InternalDataDsl.g:101:5: lv_descriptions_1_0= ruleDataModelElement
            	    {

            	    					newCompositeNode(grammarAccess.getDataModelAccess().getDescriptionsDataModelElementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_descriptions_1_0=ruleDataModelElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDataModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"descriptions",
            	    						lv_descriptions_1_0,
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
    // InternalDataDsl.g:122:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalDataDsl.g:122:47: (iv_ruleImport= ruleImport EOF )
            // InternalDataDsl.g:123:2: iv_ruleImport= ruleImport EOF
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
    // InternalDataDsl.g:129:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:135:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalDataDsl.g:136:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalDataDsl.g:136:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalDataDsl.g:137:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalDataDsl.g:141:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalDataDsl.g:142:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalDataDsl.g:142:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalDataDsl.g:143:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalDataDsl.g:164:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalDataDsl.g:164:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalDataDsl.g:165:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalDataDsl.g:171:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:177:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalDataDsl.g:178:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalDataDsl.g:178:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalDataDsl.g:179:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_5);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalDataDsl.g:189:3: (kw= '.*' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataDsl.g:190:4: kw= '.*'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

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
    // InternalDataDsl.g:200:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalDataDsl.g:200:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDataDsl.g:201:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalDataDsl.g:207:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalDataDsl.g:213:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDataDsl.g:214:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDataDsl.g:214:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDataDsl.g:215:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDataDsl.g:222:3: (kw= '.' this_ID_2= RULE_ID )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDataDsl.g:223:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,17,FOLLOW_4); 

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
    // InternalDataDsl.g:240:1: entryRuleDataModelElement returns [EObject current=null] : iv_ruleDataModelElement= ruleDataModelElement EOF ;
    public final EObject entryRuleDataModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataModelElement = null;


        try {
            // InternalDataDsl.g:240:57: (iv_ruleDataModelElement= ruleDataModelElement EOF )
            // InternalDataDsl.g:241:2: iv_ruleDataModelElement= ruleDataModelElement EOF
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
    // InternalDataDsl.g:247:1: ruleDataModelElement returns [EObject current=null] : (this_Import_0= ruleImport | this_PackageDeclaration_1= rulePackageDeclaration | this_DataPackableDescription_2= ruleDataPackableDescription | this_DataSourceDescription_3= ruleDataSourceDescription ) ;
    public final EObject ruleDataModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_PackageDeclaration_1 = null;

        EObject this_DataPackableDescription_2 = null;

        EObject this_DataSourceDescription_3 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:253:2: ( (this_Import_0= ruleImport | this_PackageDeclaration_1= rulePackageDeclaration | this_DataPackableDescription_2= ruleDataPackableDescription | this_DataSourceDescription_3= ruleDataSourceDescription ) )
            // InternalDataDsl.g:254:2: (this_Import_0= ruleImport | this_PackageDeclaration_1= rulePackageDeclaration | this_DataPackableDescription_2= ruleDataPackableDescription | this_DataSourceDescription_3= ruleDataSourceDescription )
            {
            // InternalDataDsl.g:254:2: (this_Import_0= ruleImport | this_PackageDeclaration_1= rulePackageDeclaration | this_DataPackableDescription_2= ruleDataPackableDescription | this_DataSourceDescription_3= ruleDataSourceDescription )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 21:
            case 30:
            case 31:
            case 32:
            case 33:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:255:3: this_Import_0= ruleImport
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
                    // InternalDataDsl.g:264:3: this_PackageDeclaration_1= rulePackageDeclaration
                    {

                    			newCompositeNode(grammarAccess.getDataModelElementAccess().getPackageDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_1=rulePackageDeclaration();

                    state._fsp--;


                    			current = this_PackageDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:273:3: this_DataPackableDescription_2= ruleDataPackableDescription
                    {

                    			newCompositeNode(grammarAccess.getDataModelElementAccess().getDataPackableDescriptionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataPackableDescription_2=ruleDataPackableDescription();

                    state._fsp--;


                    			current = this_DataPackableDescription_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:282:3: this_DataSourceDescription_3= ruleDataSourceDescription
                    {

                    			newCompositeNode(grammarAccess.getDataModelElementAccess().getDataSourceDescriptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataSourceDescription_3=ruleDataSourceDescription();

                    state._fsp--;


                    			current = this_DataSourceDescription_3;
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


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalDataDsl.g:294:1: entryRulePackageDeclaration returns [EObject current=null] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final EObject entryRulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDeclaration = null;


        try {
            // InternalDataDsl.g:294:59: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // InternalDataDsl.g:295:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             newCompositeNode(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalDataDsl.g:301:1: rulePackageDeclaration returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleDataPackableDescription ) ) ( (lv_elements_4_0= ruleDataPackableDescription ) )* otherlv_5= '}' ) ;
    public final EObject rulePackageDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;

        EObject lv_elements_4_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:307:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleDataPackableDescription ) ) ( (lv_elements_4_0= ruleDataPackableDescription ) )* otherlv_5= '}' ) )
            // InternalDataDsl.g:308:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleDataPackableDescription ) ) ( (lv_elements_4_0= ruleDataPackableDescription ) )* otherlv_5= '}' )
            {
            // InternalDataDsl.g:308:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleDataPackableDescription ) ) ( (lv_elements_4_0= ruleDataPackableDescription ) )* otherlv_5= '}' )
            // InternalDataDsl.g:309:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleDataPackableDescription ) ) ( (lv_elements_4_0= ruleDataPackableDescription ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0());
            		
            // InternalDataDsl.g:313:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalDataDsl.g:314:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalDataDsl.g:314:4: (lv_name_1_0= ruleQualifiedName )
            // InternalDataDsl.g:315:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"eagledata.core.dsl.datadesc.DataDsl.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataDsl.g:336:3: ( (lv_elements_3_0= ruleDataPackableDescription ) )
            // InternalDataDsl.g:337:4: (lv_elements_3_0= ruleDataPackableDescription )
            {
            // InternalDataDsl.g:337:4: (lv_elements_3_0= ruleDataPackableDescription )
            // InternalDataDsl.g:338:5: lv_elements_3_0= ruleDataPackableDescription
            {

            					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsDataPackableDescriptionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_elements_3_0=ruleDataPackableDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_3_0,
            						"eagledata.core.dsl.datadesc.DataDsl.DataPackableDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:355:3: ( (lv_elements_4_0= ruleDataPackableDescription ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==21||(LA5_0>=30 && LA5_0<=33)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDataDsl.g:356:4: (lv_elements_4_0= ruleDataPackableDescription )
            	    {
            	    // InternalDataDsl.g:356:4: (lv_elements_4_0= ruleDataPackableDescription )
            	    // InternalDataDsl.g:357:5: lv_elements_4_0= ruleDataPackableDescription
            	    {

            	    					newCompositeNode(grammarAccess.getPackageDeclarationAccess().getElementsDataPackableDescriptionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_elements_4_0=ruleDataPackableDescription();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageDeclarationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_4_0,
            	    						"eagledata.core.dsl.datadesc.DataDsl.DataPackableDescription");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleDataPackableDescription"
    // InternalDataDsl.g:382:1: entryRuleDataPackableDescription returns [EObject current=null] : iv_ruleDataPackableDescription= ruleDataPackableDescription EOF ;
    public final EObject entryRuleDataPackableDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataPackableDescription = null;


        try {
            // InternalDataDsl.g:382:64: (iv_ruleDataPackableDescription= ruleDataPackableDescription EOF )
            // InternalDataDsl.g:383:2: iv_ruleDataPackableDescription= ruleDataPackableDescription EOF
            {
             newCompositeNode(grammarAccess.getDataPackableDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataPackableDescription=ruleDataPackableDescription();

            state._fsp--;

             current =iv_ruleDataPackableDescription; 
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
    // $ANTLR end "entryRuleDataPackableDescription"


    // $ANTLR start "ruleDataPackableDescription"
    // InternalDataDsl.g:389:1: ruleDataPackableDescription returns [EObject current=null] : (this_StringConcept_0= ruleStringConcept | this_TypeSpecification_1= ruleTypeSpecification | this_DataFragment_2= ruleDataFragment ) ;
    public final EObject ruleDataPackableDescription() throws RecognitionException {
        EObject current = null;

        EObject this_StringConcept_0 = null;

        EObject this_TypeSpecification_1 = null;

        EObject this_DataFragment_2 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:395:2: ( (this_StringConcept_0= ruleStringConcept | this_TypeSpecification_1= ruleTypeSpecification | this_DataFragment_2= ruleDataFragment ) )
            // InternalDataDsl.g:396:2: (this_StringConcept_0= ruleStringConcept | this_TypeSpecification_1= ruleTypeSpecification | this_DataFragment_2= ruleDataFragment )
            {
            // InternalDataDsl.g:396:2: (this_StringConcept_0= ruleStringConcept | this_TypeSpecification_1= ruleTypeSpecification | this_DataFragment_2= ruleDataFragment )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt6=1;
                }
                break;
            case 31:
            case 32:
            case 33:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDataDsl.g:397:3: this_StringConcept_0= ruleStringConcept
                    {

                    			newCompositeNode(grammarAccess.getDataPackableDescriptionAccess().getStringConceptParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringConcept_0=ruleStringConcept();

                    state._fsp--;


                    			current = this_StringConcept_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:406:3: this_TypeSpecification_1= ruleTypeSpecification
                    {

                    			newCompositeNode(grammarAccess.getDataPackableDescriptionAccess().getTypeSpecificationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeSpecification_1=ruleTypeSpecification();

                    state._fsp--;


                    			current = this_TypeSpecification_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:415:3: this_DataFragment_2= ruleDataFragment
                    {

                    			newCompositeNode(grammarAccess.getDataPackableDescriptionAccess().getDataFragmentParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataFragment_2=ruleDataFragment();

                    state._fsp--;


                    			current = this_DataFragment_2;
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
    // $ANTLR end "ruleDataPackableDescription"


    // $ANTLR start "entryRuleStringConcept"
    // InternalDataDsl.g:427:1: entryRuleStringConcept returns [EObject current=null] : iv_ruleStringConcept= ruleStringConcept EOF ;
    public final EObject entryRuleStringConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringConcept = null;


        try {
            // InternalDataDsl.g:427:54: (iv_ruleStringConcept= ruleStringConcept EOF )
            // InternalDataDsl.g:428:2: iv_ruleStringConcept= ruleStringConcept EOF
            {
             newCompositeNode(grammarAccess.getStringConceptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringConcept=ruleStringConcept();

            state._fsp--;

             current =iv_ruleStringConcept; 
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
    // $ANTLR end "entryRuleStringConcept"


    // $ANTLR start "ruleStringConcept"
    // InternalDataDsl.g:434:1: ruleStringConcept returns [EObject current=null] : (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( ( (lv_subsequence_4_0= ruleSubstringConcept ) ) (otherlv_5= ',' ( (lv_subsequence_6_0= ruleSubstringConcept ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleStringConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_subsequence_4_0 = null;

        EObject lv_subsequence_6_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:440:2: ( (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( ( (lv_subsequence_4_0= ruleSubstringConcept ) ) (otherlv_5= ',' ( (lv_subsequence_6_0= ruleSubstringConcept ) ) )* )? otherlv_7= ')' ) )
            // InternalDataDsl.g:441:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( ( (lv_subsequence_4_0= ruleSubstringConcept ) ) (otherlv_5= ',' ( (lv_subsequence_6_0= ruleSubstringConcept ) ) )* )? otherlv_7= ')' )
            {
            // InternalDataDsl.g:441:2: (otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( ( (lv_subsequence_4_0= ruleSubstringConcept ) ) (otherlv_5= ',' ( (lv_subsequence_6_0= ruleSubstringConcept ) ) )* )? otherlv_7= ')' )
            // InternalDataDsl.g:442:3: otherlv_0= 'string' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( ( (lv_subsequence_4_0= ruleSubstringConcept ) ) (otherlv_5= ',' ( (lv_subsequence_6_0= ruleSubstringConcept ) ) )* )? otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStringConceptAccess().getStringKeyword_0());
            		
            // InternalDataDsl.g:446:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:447:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:447:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:448:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStringConceptAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringConceptRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getStringConceptAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getStringConceptAccess().getLeftParenthesisKeyword_3());
            		
            // InternalDataDsl.g:472:3: ( ( (lv_subsequence_4_0= ruleSubstringConcept ) ) (otherlv_5= ',' ( (lv_subsequence_6_0= ruleSubstringConcept ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=37 && LA8_0<=42)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataDsl.g:473:4: ( (lv_subsequence_4_0= ruleSubstringConcept ) ) (otherlv_5= ',' ( (lv_subsequence_6_0= ruleSubstringConcept ) ) )*
                    {
                    // InternalDataDsl.g:473:4: ( (lv_subsequence_4_0= ruleSubstringConcept ) )
                    // InternalDataDsl.g:474:5: (lv_subsequence_4_0= ruleSubstringConcept )
                    {
                    // InternalDataDsl.g:474:5: (lv_subsequence_4_0= ruleSubstringConcept )
                    // InternalDataDsl.g:475:6: lv_subsequence_4_0= ruleSubstringConcept
                    {

                    						newCompositeNode(grammarAccess.getStringConceptAccess().getSubsequenceSubstringConceptParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_subsequence_4_0=ruleSubstringConcept();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringConceptRule());
                    						}
                    						add(
                    							current,
                    							"subsequence",
                    							lv_subsequence_4_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.SubstringConcept");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:492:4: (otherlv_5= ',' ( (lv_subsequence_6_0= ruleSubstringConcept ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==24) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalDataDsl.g:493:5: otherlv_5= ',' ( (lv_subsequence_6_0= ruleSubstringConcept ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_14); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getStringConceptAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDataDsl.g:497:5: ( (lv_subsequence_6_0= ruleSubstringConcept ) )
                    	    // InternalDataDsl.g:498:6: (lv_subsequence_6_0= ruleSubstringConcept )
                    	    {
                    	    // InternalDataDsl.g:498:6: (lv_subsequence_6_0= ruleSubstringConcept )
                    	    // InternalDataDsl.g:499:7: lv_subsequence_6_0= ruleSubstringConcept
                    	    {

                    	    							newCompositeNode(grammarAccess.getStringConceptAccess().getSubsequenceSubstringConceptParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_subsequence_6_0=ruleSubstringConcept();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStringConceptRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subsequence",
                    	    								lv_subsequence_6_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.SubstringConcept");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStringConceptAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleStringConcept"


    // $ANTLR start "entryRuleSubstringConcept"
    // InternalDataDsl.g:526:1: entryRuleSubstringConcept returns [EObject current=null] : iv_ruleSubstringConcept= ruleSubstringConcept EOF ;
    public final EObject entryRuleSubstringConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstringConcept = null;


        try {
            // InternalDataDsl.g:526:57: (iv_ruleSubstringConcept= ruleSubstringConcept EOF )
            // InternalDataDsl.g:527:2: iv_ruleSubstringConcept= ruleSubstringConcept EOF
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
    // InternalDataDsl.g:533:1: ruleSubstringConcept returns [EObject current=null] : (this_Character_0= ruleCharacter | this_Substring_1= ruleSubstring ) ;
    public final EObject ruleSubstringConcept() throws RecognitionException {
        EObject current = null;

        EObject this_Character_0 = null;

        EObject this_Substring_1 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:539:2: ( (this_Character_0= ruleCharacter | this_Substring_1= ruleSubstring ) )
            // InternalDataDsl.g:540:2: (this_Character_0= ruleCharacter | this_Substring_1= ruleSubstring )
            {
            // InternalDataDsl.g:540:2: (this_Character_0= ruleCharacter | this_Substring_1= ruleSubstring )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=37 && LA9_0<=38)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=39 && LA9_0<=42)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataDsl.g:541:3: this_Character_0= ruleCharacter
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
                    // InternalDataDsl.g:550:3: this_Substring_1= ruleSubstring
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
    // InternalDataDsl.g:562:1: entryRuleSubstring returns [EObject current=null] : iv_ruleSubstring= ruleSubstring EOF ;
    public final EObject entryRuleSubstring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstring = null;


        try {
            // InternalDataDsl.g:562:50: (iv_ruleSubstring= ruleSubstring EOF )
            // InternalDataDsl.g:563:2: iv_ruleSubstring= ruleSubstring EOF
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
    // InternalDataDsl.g:569:1: ruleSubstring returns [EObject current=null] : ( ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']' ) ;
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
            // InternalDataDsl.g:575:2: ( ( ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']' ) )
            // InternalDataDsl.g:576:2: ( ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']' )
            {
            // InternalDataDsl.g:576:2: ( ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']' )
            // InternalDataDsl.g:577:3: ( (lv_typeString_0_0= ruleTypeString ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '[' ( (lv_minlength_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_maxlength_5_0= RULE_INT ) ) otherlv_6= ']'
            {
            // InternalDataDsl.g:577:3: ( (lv_typeString_0_0= ruleTypeString ) )
            // InternalDataDsl.g:578:4: (lv_typeString_0_0= ruleTypeString )
            {
            // InternalDataDsl.g:578:4: (lv_typeString_0_0= ruleTypeString )
            // InternalDataDsl.g:579:5: lv_typeString_0_0= ruleTypeString
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

            // InternalDataDsl.g:596:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:597:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:597:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:598:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

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

            otherlv_2=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getSubstringAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalDataDsl.g:618:3: ( (lv_minlength_3_0= RULE_INT ) )
            // InternalDataDsl.g:619:4: (lv_minlength_3_0= RULE_INT )
            {
            // InternalDataDsl.g:619:4: (lv_minlength_3_0= RULE_INT )
            // InternalDataDsl.g:620:5: lv_minlength_3_0= RULE_INT
            {
            lv_minlength_3_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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

            otherlv_4=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getSubstringAccess().getCommaKeyword_4());
            		
            // InternalDataDsl.g:640:3: ( (lv_maxlength_5_0= RULE_INT ) )
            // InternalDataDsl.g:641:4: (lv_maxlength_5_0= RULE_INT )
            {
            // InternalDataDsl.g:641:4: (lv_maxlength_5_0= RULE_INT )
            // InternalDataDsl.g:642:5: lv_maxlength_5_0= RULE_INT
            {
            lv_maxlength_5_0=(Token)match(input,RULE_INT,FOLLOW_18); 

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

            otherlv_6=(Token)match(input,27,FOLLOW_2); 

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
    // InternalDataDsl.g:666:1: entryRuleCharacter returns [EObject current=null] : iv_ruleCharacter= ruleCharacter EOF ;
    public final EObject entryRuleCharacter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharacter = null;


        try {
            // InternalDataDsl.g:666:50: (iv_ruleCharacter= ruleCharacter EOF )
            // InternalDataDsl.g:667:2: iv_ruleCharacter= ruleCharacter EOF
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
    // InternalDataDsl.g:673:1: ruleCharacter returns [EObject current=null] : ( ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? ) ;
    public final EObject ruleCharacter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token lv_value_2_0=null;
        Enumerator lv_typeCharacter_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:679:2: ( ( ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? ) )
            // InternalDataDsl.g:680:2: ( ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? )
            {
            // InternalDataDsl.g:680:2: ( ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )? )
            // InternalDataDsl.g:681:3: ( (lv_typeCharacter_0_0= ruleTypeCharacter ) ) ( (lv_name_1_0= RULE_ID ) ) ( (lv_value_2_0= RULE_STRING ) )?
            {
            // InternalDataDsl.g:681:3: ( (lv_typeCharacter_0_0= ruleTypeCharacter ) )
            // InternalDataDsl.g:682:4: (lv_typeCharacter_0_0= ruleTypeCharacter )
            {
            // InternalDataDsl.g:682:4: (lv_typeCharacter_0_0= ruleTypeCharacter )
            // InternalDataDsl.g:683:5: lv_typeCharacter_0_0= ruleTypeCharacter
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

            // InternalDataDsl.g:700:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:701:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:701:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:702:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_19); 

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

            // InternalDataDsl.g:718:3: ( (lv_value_2_0= RULE_STRING ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataDsl.g:719:4: (lv_value_2_0= RULE_STRING )
                    {
                    // InternalDataDsl.g:719:4: (lv_value_2_0= RULE_STRING )
                    // InternalDataDsl.g:720:5: lv_value_2_0= RULE_STRING
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


    // $ANTLR start "entryRuleDataSourceDescription"
    // InternalDataDsl.g:740:1: entryRuleDataSourceDescription returns [EObject current=null] : iv_ruleDataSourceDescription= ruleDataSourceDescription EOF ;
    public final EObject entryRuleDataSourceDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSourceDescription = null;


        try {
            // InternalDataDsl.g:740:62: (iv_ruleDataSourceDescription= ruleDataSourceDescription EOF )
            // InternalDataDsl.g:741:2: iv_ruleDataSourceDescription= ruleDataSourceDescription EOF
            {
             newCompositeNode(grammarAccess.getDataSourceDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSourceDescription=ruleDataSourceDescription();

            state._fsp--;

             current =iv_ruleDataSourceDescription; 
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
    // $ANTLR end "entryRuleDataSourceDescription"


    // $ANTLR start "ruleDataSourceDescription"
    // InternalDataDsl.g:747:1: ruleDataSourceDescription returns [EObject current=null] : (otherlv_0= 'description' ( (lv_format_1_0= ruleFormat ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleLeafNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleLeafNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleDataOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleDataOption ) ) )* otherlv_16= '}' )? ) ;
    public final EObject ruleDataSourceDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Enumerator lv_format_1_0 = null;

        EObject lv_nodes_8_0 = null;

        EObject lv_nodes_10_0 = null;

        EObject lv_options_13_0 = null;

        EObject lv_options_15_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:753:2: ( (otherlv_0= 'description' ( (lv_format_1_0= ruleFormat ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleLeafNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleLeafNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleDataOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleDataOption ) ) )* otherlv_16= '}' )? ) )
            // InternalDataDsl.g:754:2: (otherlv_0= 'description' ( (lv_format_1_0= ruleFormat ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleLeafNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleLeafNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleDataOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleDataOption ) ) )* otherlv_16= '}' )? )
            {
            // InternalDataDsl.g:754:2: (otherlv_0= 'description' ( (lv_format_1_0= ruleFormat ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleLeafNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleLeafNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleDataOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleDataOption ) ) )* otherlv_16= '}' )? )
            // InternalDataDsl.g:755:3: otherlv_0= 'description' ( (lv_format_1_0= ruleFormat ) ) ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_7= '{' ( ( (lv_nodes_8_0= ruleLeafNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleLeafNode ) ) )* )? otherlv_11= '}' (otherlv_12= '{' ( (lv_options_13_0= ruleDataOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleDataOption ) ) )* otherlv_16= '}' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceDescriptionAccess().getDescriptionKeyword_0());
            		
            // InternalDataDsl.g:759:3: ( (lv_format_1_0= ruleFormat ) )
            // InternalDataDsl.g:760:4: (lv_format_1_0= ruleFormat )
            {
            // InternalDataDsl.g:760:4: (lv_format_1_0= ruleFormat )
            // InternalDataDsl.g:761:5: lv_format_1_0= ruleFormat
            {

            					newCompositeNode(grammarAccess.getDataSourceDescriptionAccess().getFormatFormatEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_format_1_0=ruleFormat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataSourceDescriptionRule());
            					}
            					set(
            						current,
            						"format",
            						lv_format_1_0,
            						"eagledata.core.dsl.datadesc.DataDsl.Format");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:778:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalDataDsl.g:779:4: (lv_name_2_0= RULE_ID )
            {
            // InternalDataDsl.g:779:4: (lv_name_2_0= RULE_ID )
            // InternalDataDsl.g:780:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDataSourceDescriptionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataSourceDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:796:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataDsl.g:797:4: otherlv_3= ':' ( ( ruleQualifiedName ) ) (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getDataSourceDescriptionAccess().getColonKeyword_3_0());
                    			
                    // InternalDataDsl.g:801:4: ( ( ruleQualifiedName ) )
                    // InternalDataDsl.g:802:5: ( ruleQualifiedName )
                    {
                    // InternalDataDsl.g:802:5: ( ruleQualifiedName )
                    // InternalDataDsl.g:803:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataSourceDescriptionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:817:4: (otherlv_5= ',' ( ( ruleQualifiedName ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==24) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalDataDsl.g:818:5: otherlv_5= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_4); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getDataSourceDescriptionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDataDsl.g:822:5: ( ( ruleQualifiedName ) )
                    	    // InternalDataDsl.g:823:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalDataDsl.g:823:6: ( ruleQualifiedName )
                    	    // InternalDataDsl.g:824:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataSourceDescriptionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    ruleQualifiedName();

                    	    state._fsp--;


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
                    break;

            }

            otherlv_7=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_7, grammarAccess.getDataSourceDescriptionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDataDsl.g:844:3: ( ( (lv_nodes_8_0= ruleLeafNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleLeafNode ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==21||(LA14_0>=34 && LA14_0<=36)||(LA14_0>=44 && LA14_0<=54)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataDsl.g:845:4: ( (lv_nodes_8_0= ruleLeafNode ) ) (otherlv_9= ',' ( (lv_nodes_10_0= ruleLeafNode ) ) )*
                    {
                    // InternalDataDsl.g:845:4: ( (lv_nodes_8_0= ruleLeafNode ) )
                    // InternalDataDsl.g:846:5: (lv_nodes_8_0= ruleLeafNode )
                    {
                    // InternalDataDsl.g:846:5: (lv_nodes_8_0= ruleLeafNode )
                    // InternalDataDsl.g:847:6: lv_nodes_8_0= ruleLeafNode
                    {

                    						newCompositeNode(grammarAccess.getDataSourceDescriptionAccess().getNodesLeafNodeParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_nodes_8_0=ruleLeafNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataSourceDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_8_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.LeafNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:864:4: (otherlv_9= ',' ( (lv_nodes_10_0= ruleLeafNode ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==24) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalDataDsl.g:865:5: otherlv_9= ',' ( (lv_nodes_10_0= ruleLeafNode ) )
                    	    {
                    	    otherlv_9=(Token)match(input,24,FOLLOW_25); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getDataSourceDescriptionAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalDataDsl.g:869:5: ( (lv_nodes_10_0= ruleLeafNode ) )
                    	    // InternalDataDsl.g:870:6: (lv_nodes_10_0= ruleLeafNode )
                    	    {
                    	    // InternalDataDsl.g:870:6: (lv_nodes_10_0= ruleLeafNode )
                    	    // InternalDataDsl.g:871:7: lv_nodes_10_0= ruleLeafNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataSourceDescriptionAccess().getNodesLeafNodeParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_nodes_10_0=ruleLeafNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataSourceDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_10_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.LeafNode");
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
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getDataSourceDescriptionAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalDataDsl.g:894:3: (otherlv_12= '{' ( (lv_options_13_0= ruleDataOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleDataOption ) ) )* otherlv_16= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataDsl.g:895:4: otherlv_12= '{' ( (lv_options_13_0= ruleDataOption ) ) (otherlv_14= ',' ( (lv_options_15_0= ruleDataOption ) ) )* otherlv_16= '}'
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_27); 

                    				newLeafNode(otherlv_12, grammarAccess.getDataSourceDescriptionAccess().getLeftCurlyBracketKeyword_7_0());
                    			
                    // InternalDataDsl.g:899:4: ( (lv_options_13_0= ruleDataOption ) )
                    // InternalDataDsl.g:900:5: (lv_options_13_0= ruleDataOption )
                    {
                    // InternalDataDsl.g:900:5: (lv_options_13_0= ruleDataOption )
                    // InternalDataDsl.g:901:6: lv_options_13_0= ruleDataOption
                    {

                    						newCompositeNode(grammarAccess.getDataSourceDescriptionAccess().getOptionsDataOptionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_options_13_0=ruleDataOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataSourceDescriptionRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_13_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.DataOption");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:918:4: (otherlv_14= ',' ( (lv_options_15_0= ruleDataOption ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==24) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDataDsl.g:919:5: otherlv_14= ',' ( (lv_options_15_0= ruleDataOption ) )
                    	    {
                    	    otherlv_14=(Token)match(input,24,FOLLOW_27); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getDataSourceDescriptionAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalDataDsl.g:923:5: ( (lv_options_15_0= ruleDataOption ) )
                    	    // InternalDataDsl.g:924:6: (lv_options_15_0= ruleDataOption )
                    	    {
                    	    // InternalDataDsl.g:924:6: (lv_options_15_0= ruleDataOption )
                    	    // InternalDataDsl.g:925:7: lv_options_15_0= ruleDataOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataSourceDescriptionAccess().getOptionsDataOptionParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_options_15_0=ruleDataOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataSourceDescriptionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_15_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.DataOption");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_16, grammarAccess.getDataSourceDescriptionAccess().getRightCurlyBracketKeyword_7_3());
                    			

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
    // $ANTLR end "ruleDataSourceDescription"


    // $ANTLR start "entryRuleDataFragment"
    // InternalDataDsl.g:952:1: entryRuleDataFragment returns [EObject current=null] : iv_ruleDataFragment= ruleDataFragment EOF ;
    public final EObject entryRuleDataFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFragment = null;


        try {
            // InternalDataDsl.g:952:53: (iv_ruleDataFragment= ruleDataFragment EOF )
            // InternalDataDsl.g:953:2: iv_ruleDataFragment= ruleDataFragment EOF
            {
             newCompositeNode(grammarAccess.getDataFragmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataFragment=ruleDataFragment();

            state._fsp--;

             current =iv_ruleDataFragment; 
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
    // $ANTLR end "entryRuleDataFragment"


    // $ANTLR start "ruleDataFragment"
    // InternalDataDsl.g:959:1: ruleDataFragment returns [EObject current=null] : (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleLeafNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleLeafNode ) ) )* )? otherlv_10= '}' ) ;
    public final EObject ruleDataFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_nodes_7_0 = null;

        EObject lv_nodes_9_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:965:2: ( (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleLeafNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleLeafNode ) ) )* )? otherlv_10= '}' ) )
            // InternalDataDsl.g:966:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleLeafNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleLeafNode ) ) )* )? otherlv_10= '}' )
            {
            // InternalDataDsl.g:966:2: (otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleLeafNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleLeafNode ) ) )* )? otherlv_10= '}' )
            // InternalDataDsl.g:967:3: otherlv_0= 'fragment' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( (lv_nodes_7_0= ruleLeafNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleLeafNode ) ) )* )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataFragmentAccess().getFragmentKeyword_0());
            		
            // InternalDataDsl.g:971:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:972:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:972:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:973:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataFragmentAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataFragmentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:989:3: (otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataDsl.g:990:4: otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getDataFragmentAccess().getColonKeyword_2_0());
                    			
                    // InternalDataDsl.g:994:4: ( ( ruleQualifiedName ) )
                    // InternalDataDsl.g:995:5: ( ruleQualifiedName )
                    {
                    // InternalDataDsl.g:995:5: ( ruleQualifiedName )
                    // InternalDataDsl.g:996:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDataFragmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1010:4: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==24) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDataDsl.g:1011:5: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_4); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getDataFragmentAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalDataDsl.g:1015:5: ( ( ruleQualifiedName ) )
                    	    // InternalDataDsl.g:1016:6: ( ruleQualifiedName )
                    	    {
                    	    // InternalDataDsl.g:1016:6: ( ruleQualifiedName )
                    	    // InternalDataDsl.g:1017:7: ruleQualifiedName
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getDataFragmentRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    ruleQualifiedName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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

            otherlv_6=(Token)match(input,19,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getDataFragmentAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDataDsl.g:1037:3: ( ( (lv_nodes_7_0= ruleLeafNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleLeafNode ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID||LA20_0==21||(LA20_0>=34 && LA20_0<=36)||(LA20_0>=44 && LA20_0<=54)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataDsl.g:1038:4: ( (lv_nodes_7_0= ruleLeafNode ) ) (otherlv_8= ',' ( (lv_nodes_9_0= ruleLeafNode ) ) )*
                    {
                    // InternalDataDsl.g:1038:4: ( (lv_nodes_7_0= ruleLeafNode ) )
                    // InternalDataDsl.g:1039:5: (lv_nodes_7_0= ruleLeafNode )
                    {
                    // InternalDataDsl.g:1039:5: (lv_nodes_7_0= ruleLeafNode )
                    // InternalDataDsl.g:1040:6: lv_nodes_7_0= ruleLeafNode
                    {

                    						newCompositeNode(grammarAccess.getDataFragmentAccess().getNodesLeafNodeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_nodes_7_0=ruleLeafNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataFragmentRule());
                    						}
                    						add(
                    							current,
                    							"nodes",
                    							lv_nodes_7_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.LeafNode");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1057:4: (otherlv_8= ',' ( (lv_nodes_9_0= ruleLeafNode ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==24) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalDataDsl.g:1058:5: otherlv_8= ',' ( (lv_nodes_9_0= ruleLeafNode ) )
                    	    {
                    	    otherlv_8=(Token)match(input,24,FOLLOW_25); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getDataFragmentAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalDataDsl.g:1062:5: ( (lv_nodes_9_0= ruleLeafNode ) )
                    	    // InternalDataDsl.g:1063:6: (lv_nodes_9_0= ruleLeafNode )
                    	    {
                    	    // InternalDataDsl.g:1063:6: (lv_nodes_9_0= ruleLeafNode )
                    	    // InternalDataDsl.g:1064:7: lv_nodes_9_0= ruleLeafNode
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataFragmentAccess().getNodesLeafNodeParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_nodes_9_0=ruleLeafNode();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataFragmentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"nodes",
                    	    								lv_nodes_9_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.LeafNode");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


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

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDataFragmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDataFragment"


    // $ANTLR start "entryRuleTypeSpecification"
    // InternalDataDsl.g:1091:1: entryRuleTypeSpecification returns [EObject current=null] : iv_ruleTypeSpecification= ruleTypeSpecification EOF ;
    public final EObject entryRuleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeSpecification = null;


        try {
            // InternalDataDsl.g:1091:58: (iv_ruleTypeSpecification= ruleTypeSpecification EOF )
            // InternalDataDsl.g:1092:2: iv_ruleTypeSpecification= ruleTypeSpecification EOF
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
    // InternalDataDsl.g:1098:1: ruleTypeSpecification returns [EObject current=null] : (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration | this_StructDataType_2= ruleStructDataType ) ;
    public final EObject ruleTypeSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_DataType_0 = null;

        EObject this_Enumeration_1 = null;

        EObject this_StructDataType_2 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1104:2: ( (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration | this_StructDataType_2= ruleStructDataType ) )
            // InternalDataDsl.g:1105:2: (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration | this_StructDataType_2= ruleStructDataType )
            {
            // InternalDataDsl.g:1105:2: (this_DataType_0= ruleDataType | this_Enumeration_1= ruleEnumeration | this_StructDataType_2= ruleStructDataType )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt21=1;
                }
                break;
            case 32:
                {
                alt21=2;
                }
                break;
            case 33:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalDataDsl.g:1106:3: this_DataType_0= ruleDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecificationAccess().getDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1115:3: this_Enumeration_1= ruleEnumeration
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecificationAccess().getEnumerationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;


                    			current = this_Enumeration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1124:3: this_StructDataType_2= ruleStructDataType
                    {

                    			newCompositeNode(grammarAccess.getTypeSpecificationAccess().getStructDataTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StructDataType_2=ruleStructDataType();

                    state._fsp--;


                    			current = this_StructDataType_2;
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


    // $ANTLR start "entryRuleDataType"
    // InternalDataDsl.g:1136:1: entryRuleDataType returns [EObject current=null] : iv_ruleDataType= ruleDataType EOF ;
    public final EObject entryRuleDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataType = null;


        try {
            // InternalDataDsl.g:1136:49: (iv_ruleDataType= ruleDataType EOF )
            // InternalDataDsl.g:1137:2: iv_ruleDataType= ruleDataType EOF
            {
             newCompositeNode(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDataDsl.g:1143:1: ruleDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )? ) ;
    public final EObject ruleDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_refine_3_0 = null;

        EObject lv_options_5_0 = null;

        EObject lv_options_7_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1149:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )? ) )
            // InternalDataDsl.g:1150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )? )
            {
            // InternalDataDsl.g:1150:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )? )
            // InternalDataDsl.g:1151:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_refine_3_0= ruleBasicType ) ) (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalDataDsl.g:1155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:1156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:1156:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:1157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getColonKeyword_2());
            		
            // InternalDataDsl.g:1177:3: ( (lv_refine_3_0= ruleBasicType ) )
            // InternalDataDsl.g:1178:4: (lv_refine_3_0= ruleBasicType )
            {
            // InternalDataDsl.g:1178:4: (lv_refine_3_0= ruleBasicType )
            // InternalDataDsl.g:1179:5: lv_refine_3_0= ruleBasicType
            {

            					newCompositeNode(grammarAccess.getDataTypeAccess().getRefineBasicTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
            lv_refine_3_0=ruleBasicType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataTypeRule());
            					}
            					set(
            						current,
            						"refine",
            						lv_refine_3_0,
            						"eagledata.core.dsl.datadesc.DataDsl.BasicType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDataDsl.g:1196:3: (otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==19) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataDsl.g:1197:4: otherlv_4= '{' ( (lv_options_5_0= ruleOption ) ) (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )* otherlv_8= '}'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_30); 

                    				newLeafNode(otherlv_4, grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalDataDsl.g:1201:4: ( (lv_options_5_0= ruleOption ) )
                    // InternalDataDsl.g:1202:5: (lv_options_5_0= ruleOption )
                    {
                    // InternalDataDsl.g:1202:5: (lv_options_5_0= ruleOption )
                    // InternalDataDsl.g:1203:6: lv_options_5_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getDataTypeAccess().getOptionsOptionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_options_5_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_5_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1220:4: (otherlv_6= ',' ( (lv_options_7_0= ruleOption ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==24) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalDataDsl.g:1221:5: otherlv_6= ',' ( (lv_options_7_0= ruleOption ) )
                    	    {
                    	    otherlv_6=(Token)match(input,24,FOLLOW_30); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getDataTypeAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalDataDsl.g:1225:5: ( (lv_options_7_0= ruleOption ) )
                    	    // InternalDataDsl.g:1226:6: (lv_options_7_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:1226:6: (lv_options_7_0= ruleOption )
                    	    // InternalDataDsl.g:1227:7: lv_options_7_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getDataTypeAccess().getOptionsOptionParserRuleCall_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_options_7_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDataTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"options",
                    	    								lv_options_7_0,
                    	    								"eagledata.core.dsl.datadesc.DataDsl.Option");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4_3());
                    			

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalDataDsl.g:1254:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // InternalDataDsl.g:1254:52: (iv_ruleEnumeration= ruleEnumeration EOF )
            // InternalDataDsl.g:1255:2: iv_ruleEnumeration= ruleEnumeration EOF
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
    // InternalDataDsl.g:1261:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) ;
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
            // InternalDataDsl.g:1267:2: ( (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' ) )
            // InternalDataDsl.g:1268:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            {
            // InternalDataDsl.g:1268:2: (otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}' )
            // InternalDataDsl.g:1269:3: otherlv_0= 'enumeration' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= RULE_STRING ) ) (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
            		
            // InternalDataDsl.g:1273:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:1274:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:1274:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:1275:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_31); 

            			newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataDsl.g:1295:3: ( (lv_values_3_0= RULE_STRING ) )
            // InternalDataDsl.g:1296:4: (lv_values_3_0= RULE_STRING )
            {
            // InternalDataDsl.g:1296:4: (lv_values_3_0= RULE_STRING )
            // InternalDataDsl.g:1297:5: lv_values_3_0= RULE_STRING
            {
            lv_values_3_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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

            // InternalDataDsl.g:1313:3: (otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDataDsl.g:1314:4: otherlv_4= ',' ( (lv_values_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_31); 

            	    				newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalDataDsl.g:1318:4: ( (lv_values_5_0= RULE_STRING ) )
            	    // InternalDataDsl.g:1319:5: (lv_values_5_0= RULE_STRING )
            	    {
            	    // InternalDataDsl.g:1319:5: (lv_values_5_0= RULE_STRING )
            	    // InternalDataDsl.g:1320:6: lv_values_5_0= RULE_STRING
            	    {
            	    lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

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
            	    break loop24;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

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


    // $ANTLR start "entryRuleStructDataType"
    // InternalDataDsl.g:1345:1: entryRuleStructDataType returns [EObject current=null] : iv_ruleStructDataType= ruleStructDataType EOF ;
    public final EObject entryRuleStructDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructDataType = null;


        try {
            // InternalDataDsl.g:1345:55: (iv_ruleStructDataType= ruleStructDataType EOF )
            // InternalDataDsl.g:1346:2: iv_ruleStructDataType= ruleStructDataType EOF
            {
             newCompositeNode(grammarAccess.getStructDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructDataType=ruleStructDataType();

            state._fsp--;

             current =iv_ruleStructDataType; 
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
    // $ANTLR end "entryRuleStructDataType"


    // $ANTLR start "ruleStructDataType"
    // InternalDataDsl.g:1352:1: ruleStructDataType returns [EObject current=null] : (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_subnodes_3_0= ruleLeafNode ) ) (otherlv_4= ',' ( (lv_subnodes_5_0= ruleLeafNode ) ) )* ) otherlv_6= '}' (otherlv_7= '{' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleStructDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_subnodes_3_0 = null;

        EObject lv_subnodes_5_0 = null;

        EObject lv_options_8_0 = null;

        EObject lv_options_10_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1358:2: ( (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_subnodes_3_0= ruleLeafNode ) ) (otherlv_4= ',' ( (lv_subnodes_5_0= ruleLeafNode ) ) )* ) otherlv_6= '}' (otherlv_7= '{' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= '}' )? ) )
            // InternalDataDsl.g:1359:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_subnodes_3_0= ruleLeafNode ) ) (otherlv_4= ',' ( (lv_subnodes_5_0= ruleLeafNode ) ) )* ) otherlv_6= '}' (otherlv_7= '{' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= '}' )? )
            {
            // InternalDataDsl.g:1359:2: (otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_subnodes_3_0= ruleLeafNode ) ) (otherlv_4= ',' ( (lv_subnodes_5_0= ruleLeafNode ) ) )* ) otherlv_6= '}' (otherlv_7= '{' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= '}' )? )
            // InternalDataDsl.g:1360:3: otherlv_0= 'struct' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_subnodes_3_0= ruleLeafNode ) ) (otherlv_4= ',' ( (lv_subnodes_5_0= ruleLeafNode ) ) )* ) otherlv_6= '}' (otherlv_7= '{' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= '}' )?
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStructDataTypeAccess().getStructKeyword_0());
            		
            // InternalDataDsl.g:1364:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDataDsl.g:1365:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDataDsl.g:1365:4: (lv_name_1_0= RULE_ID )
            // InternalDataDsl.g:1366:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStructDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStructDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getStructDataTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalDataDsl.g:1386:3: ( ( (lv_subnodes_3_0= ruleLeafNode ) ) (otherlv_4= ',' ( (lv_subnodes_5_0= ruleLeafNode ) ) )* )
            // InternalDataDsl.g:1387:4: ( (lv_subnodes_3_0= ruleLeafNode ) ) (otherlv_4= ',' ( (lv_subnodes_5_0= ruleLeafNode ) ) )*
            {
            // InternalDataDsl.g:1387:4: ( (lv_subnodes_3_0= ruleLeafNode ) )
            // InternalDataDsl.g:1388:5: (lv_subnodes_3_0= ruleLeafNode )
            {
            // InternalDataDsl.g:1388:5: (lv_subnodes_3_0= ruleLeafNode )
            // InternalDataDsl.g:1389:6: lv_subnodes_3_0= ruleLeafNode
            {

            						newCompositeNode(grammarAccess.getStructDataTypeAccess().getSubnodesLeafNodeParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_24);
            lv_subnodes_3_0=ruleLeafNode();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStructDataTypeRule());
            						}
            						add(
            							current,
            							"subnodes",
            							lv_subnodes_3_0,
            							"eagledata.core.dsl.datadesc.DataDsl.LeafNode");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalDataDsl.g:1406:4: (otherlv_4= ',' ( (lv_subnodes_5_0= ruleLeafNode ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==24) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalDataDsl.g:1407:5: otherlv_4= ',' ( (lv_subnodes_5_0= ruleLeafNode ) )
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_25); 

            	    					newLeafNode(otherlv_4, grammarAccess.getStructDataTypeAccess().getCommaKeyword_3_1_0());
            	    				
            	    // InternalDataDsl.g:1411:5: ( (lv_subnodes_5_0= ruleLeafNode ) )
            	    // InternalDataDsl.g:1412:6: (lv_subnodes_5_0= ruleLeafNode )
            	    {
            	    // InternalDataDsl.g:1412:6: (lv_subnodes_5_0= ruleLeafNode )
            	    // InternalDataDsl.g:1413:7: lv_subnodes_5_0= ruleLeafNode
            	    {

            	    							newCompositeNode(grammarAccess.getStructDataTypeAccess().getSubnodesLeafNodeParserRuleCall_3_1_1_0());
            	    						
            	    pushFollow(FOLLOW_24);
            	    lv_subnodes_5_0=ruleLeafNode();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getStructDataTypeRule());
            	    							}
            	    							add(
            	    								current,
            	    								"subnodes",
            	    								lv_subnodes_5_0,
            	    								"eagledata.core.dsl.datadesc.DataDsl.LeafNode");
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

            otherlv_6=(Token)match(input,20,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getStructDataTypeAccess().getRightCurlyBracketKeyword_4());
            		
            // InternalDataDsl.g:1436:3: (otherlv_7= '{' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==19) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataDsl.g:1437:4: otherlv_7= '{' ( (lv_options_8_0= ruleOption ) ) (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )* otherlv_11= '}'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getStructDataTypeAccess().getLeftCurlyBracketKeyword_5_0());
                    			
                    // InternalDataDsl.g:1441:4: ( (lv_options_8_0= ruleOption ) )
                    // InternalDataDsl.g:1442:5: (lv_options_8_0= ruleOption )
                    {
                    // InternalDataDsl.g:1442:5: (lv_options_8_0= ruleOption )
                    // InternalDataDsl.g:1443:6: lv_options_8_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getStructDataTypeAccess().getOptionsOptionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_options_8_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructDataTypeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_8_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1460:4: (otherlv_9= ',' ( (lv_options_10_0= ruleOption ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==24) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalDataDsl.g:1461:5: otherlv_9= ',' ( (lv_options_10_0= ruleOption ) )
                    	    {
                    	    otherlv_9=(Token)match(input,24,FOLLOW_30); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getStructDataTypeAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalDataDsl.g:1465:5: ( (lv_options_10_0= ruleOption ) )
                    	    // InternalDataDsl.g:1466:6: (lv_options_10_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:1466:6: (lv_options_10_0= ruleOption )
                    	    // InternalDataDsl.g:1467:7: lv_options_10_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getStructDataTypeAccess().getOptionsOptionParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_options_10_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStructDataTypeRule());
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getStructDataTypeAccess().getRightCurlyBracketKeyword_5_3());
                    			

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
    // $ANTLR end "ruleStructDataType"


    // $ANTLR start "entryRuleLeafNode"
    // InternalDataDsl.g:1494:1: entryRuleLeafNode returns [EObject current=null] : iv_ruleLeafNode= ruleLeafNode EOF ;
    public final EObject entryRuleLeafNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeafNode = null;


        try {
            // InternalDataDsl.g:1494:49: (iv_ruleLeafNode= ruleLeafNode EOF )
            // InternalDataDsl.g:1495:2: iv_ruleLeafNode= ruleLeafNode EOF
            {
             newCompositeNode(grammarAccess.getLeafNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeafNode=ruleLeafNode();

            state._fsp--;

             current =iv_ruleLeafNode; 
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
    // $ANTLR end "entryRuleLeafNode"


    // $ANTLR start "ruleLeafNode"
    // InternalDataDsl.g:1501:1: ruleLeafNode returns [EObject current=null] : ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) | ( (lv_list_2_0= 'list' ) ) )? ( ( (lv_type_3_0= ruleBasicType ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )? ) ;
    public final EObject ruleLeafNode() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token lv_unique_1_0=null;
        Token lv_list_2_0=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_options_7_0 = null;

        EObject lv_options_9_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1507:2: ( ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) | ( (lv_list_2_0= 'list' ) ) )? ( ( (lv_type_3_0= ruleBasicType ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )? ) )
            // InternalDataDsl.g:1508:2: ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) | ( (lv_list_2_0= 'list' ) ) )? ( ( (lv_type_3_0= ruleBasicType ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )? )
            {
            // InternalDataDsl.g:1508:2: ( ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) | ( (lv_list_2_0= 'list' ) ) )? ( ( (lv_type_3_0= ruleBasicType ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )? )
            // InternalDataDsl.g:1509:3: ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) | ( (lv_list_2_0= 'list' ) ) )? ( ( (lv_type_3_0= ruleBasicType ) ) | ( (otherlv_4= RULE_ID ) ) ) ( (lv_name_5_0= RULE_ID ) ) (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )?
            {
            // InternalDataDsl.g:1509:3: ( ( (lv_key_0_0= 'key' ) ) | ( (lv_unique_1_0= 'unique' ) ) | ( (lv_list_2_0= 'list' ) ) )?
            int alt28=4;
            switch ( input.LA(1) ) {
                case 34:
                    {
                    alt28=1;
                    }
                    break;
                case 35:
                    {
                    alt28=2;
                    }
                    break;
                case 36:
                    {
                    alt28=3;
                    }
                    break;
            }

            switch (alt28) {
                case 1 :
                    // InternalDataDsl.g:1510:4: ( (lv_key_0_0= 'key' ) )
                    {
                    // InternalDataDsl.g:1510:4: ( (lv_key_0_0= 'key' ) )
                    // InternalDataDsl.g:1511:5: (lv_key_0_0= 'key' )
                    {
                    // InternalDataDsl.g:1511:5: (lv_key_0_0= 'key' )
                    // InternalDataDsl.g:1512:6: lv_key_0_0= 'key'
                    {
                    lv_key_0_0=(Token)match(input,34,FOLLOW_32); 

                    						newLeafNode(lv_key_0_0, grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafNodeRule());
                    						}
                    						setWithLastConsumed(current, "key", true, "key");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1525:4: ( (lv_unique_1_0= 'unique' ) )
                    {
                    // InternalDataDsl.g:1525:4: ( (lv_unique_1_0= 'unique' ) )
                    // InternalDataDsl.g:1526:5: (lv_unique_1_0= 'unique' )
                    {
                    // InternalDataDsl.g:1526:5: (lv_unique_1_0= 'unique' )
                    // InternalDataDsl.g:1527:6: lv_unique_1_0= 'unique'
                    {
                    lv_unique_1_0=(Token)match(input,35,FOLLOW_32); 

                    						newLeafNode(lv_unique_1_0, grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafNodeRule());
                    						}
                    						setWithLastConsumed(current, "unique", true, "unique");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1540:4: ( (lv_list_2_0= 'list' ) )
                    {
                    // InternalDataDsl.g:1540:4: ( (lv_list_2_0= 'list' ) )
                    // InternalDataDsl.g:1541:5: (lv_list_2_0= 'list' )
                    {
                    // InternalDataDsl.g:1541:5: (lv_list_2_0= 'list' )
                    // InternalDataDsl.g:1542:6: lv_list_2_0= 'list'
                    {
                    lv_list_2_0=(Token)match(input,36,FOLLOW_32); 

                    						newLeafNode(lv_list_2_0, grammarAccess.getLeafNodeAccess().getListListKeyword_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafNodeRule());
                    						}
                    						setWithLastConsumed(current, "list", true, "list");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1555:3: ( ( (lv_type_3_0= ruleBasicType ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21||(LA29_0>=44 && LA29_0<=54)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataDsl.g:1556:4: ( (lv_type_3_0= ruleBasicType ) )
                    {
                    // InternalDataDsl.g:1556:4: ( (lv_type_3_0= ruleBasicType ) )
                    // InternalDataDsl.g:1557:5: (lv_type_3_0= ruleBasicType )
                    {
                    // InternalDataDsl.g:1557:5: (lv_type_3_0= ruleBasicType )
                    // InternalDataDsl.g:1558:6: lv_type_3_0= ruleBasicType
                    {

                    						newCompositeNode(grammarAccess.getLeafNodeAccess().getTypeBasicTypeEnumRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_type_3_0=ruleBasicType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeafNodeRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_3_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.BasicType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1576:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalDataDsl.g:1576:4: ( (otherlv_4= RULE_ID ) )
                    // InternalDataDsl.g:1577:5: (otherlv_4= RULE_ID )
                    {
                    // InternalDataDsl.g:1577:5: (otherlv_4= RULE_ID )
                    // InternalDataDsl.g:1578:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLeafNodeRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_4); 

                    						newLeafNode(otherlv_4, grammarAccess.getLeafNodeAccess().getTypeCallTypeSpecificationCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDataDsl.g:1590:3: ( (lv_name_5_0= RULE_ID ) )
            // InternalDataDsl.g:1591:4: (lv_name_5_0= RULE_ID )
            {
            // InternalDataDsl.g:1591:4: (lv_name_5_0= RULE_ID )
            // InternalDataDsl.g:1592:5: lv_name_5_0= RULE_ID
            {
            lv_name_5_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_5_0, grammarAccess.getLeafNodeAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeafNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalDataDsl.g:1608:3: (otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataDsl.g:1609:4: otherlv_6= '{' ( (lv_options_7_0= ruleOption ) ) (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )* otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getLeafNodeAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalDataDsl.g:1613:4: ( (lv_options_7_0= ruleOption ) )
                    // InternalDataDsl.g:1614:5: (lv_options_7_0= ruleOption )
                    {
                    // InternalDataDsl.g:1614:5: (lv_options_7_0= ruleOption )
                    // InternalDataDsl.g:1615:6: lv_options_7_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_options_7_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeafNodeRule());
                    						}
                    						add(
                    							current,
                    							"options",
                    							lv_options_7_0,
                    							"eagledata.core.dsl.datadesc.DataDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDataDsl.g:1632:4: (otherlv_8= ',' ( (lv_options_9_0= ruleOption ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==24) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalDataDsl.g:1633:5: otherlv_8= ',' ( (lv_options_9_0= ruleOption ) )
                    	    {
                    	    otherlv_8=(Token)match(input,24,FOLLOW_30); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getLeafNodeAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalDataDsl.g:1637:5: ( (lv_options_9_0= ruleOption ) )
                    	    // InternalDataDsl.g:1638:6: (lv_options_9_0= ruleOption )
                    	    {
                    	    // InternalDataDsl.g:1638:6: (lv_options_9_0= ruleOption )
                    	    // InternalDataDsl.g:1639:7: lv_options_9_0= ruleOption
                    	    {

                    	    							newCompositeNode(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_24);
                    	    lv_options_9_0=ruleOption();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLeafNodeRule());
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
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getLeafNodeAccess().getRightCurlyBracketKeyword_3_3());
                    			

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
    // $ANTLR end "ruleLeafNode"


    // $ANTLR start "entryRuleOption"
    // InternalDataDsl.g:1666:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalDataDsl.g:1666:47: (iv_ruleOption= ruleOption EOF )
            // InternalDataDsl.g:1667:2: iv_ruleOption= ruleOption EOF
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
    // InternalDataDsl.g:1673:1: ruleOption returns [EObject current=null] : (this_StringOption_0= ruleStringOption | this_IntOption_1= ruleIntOption | this_BooleanOption_2= ruleBooleanOption | this_SequenceOption_3= ruleSequenceOption | this_DoubleOption_4= ruleDoubleOption ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        EObject this_StringOption_0 = null;

        EObject this_IntOption_1 = null;

        EObject this_BooleanOption_2 = null;

        EObject this_SequenceOption_3 = null;

        EObject this_DoubleOption_4 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1679:2: ( (this_StringOption_0= ruleStringOption | this_IntOption_1= ruleIntOption | this_BooleanOption_2= ruleBooleanOption | this_SequenceOption_3= ruleSequenceOption | this_DoubleOption_4= ruleDoubleOption ) )
            // InternalDataDsl.g:1680:2: (this_StringOption_0= ruleStringOption | this_IntOption_1= ruleIntOption | this_BooleanOption_2= ruleBooleanOption | this_SequenceOption_3= ruleSequenceOption | this_DoubleOption_4= ruleDoubleOption )
            {
            // InternalDataDsl.g:1680:2: (this_StringOption_0= ruleStringOption | this_IntOption_1= ruleIntOption | this_BooleanOption_2= ruleBooleanOption | this_SequenceOption_3= ruleSequenceOption | this_DoubleOption_4= ruleDoubleOption )
            int alt32=5;
            switch ( input.LA(1) ) {
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                {
                alt32=1;
                }
                break;
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                {
                alt32=2;
                }
                break;
            case 72:
                {
                alt32=3;
                }
                break;
            case 43:
                {
                alt32=4;
                }
                break;
            case 69:
            case 70:
            case 71:
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
                    // InternalDataDsl.g:1681:3: this_StringOption_0= ruleStringOption
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
                    // InternalDataDsl.g:1690:3: this_IntOption_1= ruleIntOption
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
                    // InternalDataDsl.g:1699:3: this_BooleanOption_2= ruleBooleanOption
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
                    // InternalDataDsl.g:1708:3: this_SequenceOption_3= ruleSequenceOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getSequenceOptionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SequenceOption_3=ruleSequenceOption();

                    state._fsp--;


                    			current = this_SequenceOption_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1717:3: this_DoubleOption_4= ruleDoubleOption
                    {

                    			newCompositeNode(grammarAccess.getOptionAccess().getDoubleOptionParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleOption_4=ruleDoubleOption();

                    state._fsp--;


                    			current = this_DoubleOption_4;
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
    // InternalDataDsl.g:1729:1: entryRuleStringOption returns [EObject current=null] : iv_ruleStringOption= ruleStringOption EOF ;
    public final EObject entryRuleStringOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringOption = null;


        try {
            // InternalDataDsl.g:1729:53: (iv_ruleStringOption= ruleStringOption EOF )
            // InternalDataDsl.g:1730:2: iv_ruleStringOption= ruleStringOption EOF
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
    // InternalDataDsl.g:1736:1: ruleStringOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1742:2: ( ( ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalDataDsl.g:1743:2: ( ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalDataDsl.g:1743:2: ( ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalDataDsl.g:1744:3: ( (lv_key_0_0= ruleStringOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalDataDsl.g:1744:3: ( (lv_key_0_0= ruleStringOptionKey ) )
            // InternalDataDsl.g:1745:4: (lv_key_0_0= ruleStringOptionKey )
            {
            // InternalDataDsl.g:1745:4: (lv_key_0_0= ruleStringOptionKey )
            // InternalDataDsl.g:1746:5: lv_key_0_0= ruleStringOptionKey
            {

            					newCompositeNode(grammarAccess.getStringOptionAccess().getKeyStringOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_1=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getStringOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:1767:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDataDsl.g:1768:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDataDsl.g:1768:4: (lv_value_2_0= RULE_STRING )
            // InternalDataDsl.g:1769:5: lv_value_2_0= RULE_STRING
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
    // InternalDataDsl.g:1789:1: entryRuleIntOption returns [EObject current=null] : iv_ruleIntOption= ruleIntOption EOF ;
    public final EObject entryRuleIntOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntOption = null;


        try {
            // InternalDataDsl.g:1789:50: (iv_ruleIntOption= ruleIntOption EOF )
            // InternalDataDsl.g:1790:2: iv_ruleIntOption= ruleIntOption EOF
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
    // InternalDataDsl.g:1796:1: ruleIntOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleIntOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1802:2: ( ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalDataDsl.g:1803:2: ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalDataDsl.g:1803:2: ( ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalDataDsl.g:1804:3: ( (lv_key_0_0= ruleIntOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalDataDsl.g:1804:3: ( (lv_key_0_0= ruleIntOptionKey ) )
            // InternalDataDsl.g:1805:4: (lv_key_0_0= ruleIntOptionKey )
            {
            // InternalDataDsl.g:1805:4: (lv_key_0_0= ruleIntOptionKey )
            // InternalDataDsl.g:1806:5: lv_key_0_0= ruleIntOptionKey
            {

            					newCompositeNode(grammarAccess.getIntOptionAccess().getKeyIntOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_1=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIntOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:1827:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalDataDsl.g:1828:4: (lv_value_2_0= RULE_INT )
            {
            // InternalDataDsl.g:1828:4: (lv_value_2_0= RULE_INT )
            // InternalDataDsl.g:1829:5: lv_value_2_0= RULE_INT
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
    // InternalDataDsl.g:1849:1: entryRuleDoubleOption returns [EObject current=null] : iv_ruleDoubleOption= ruleDoubleOption EOF ;
    public final EObject entryRuleDoubleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleOption = null;


        try {
            // InternalDataDsl.g:1849:53: (iv_ruleDoubleOption= ruleDoubleOption EOF )
            // InternalDataDsl.g:1850:2: iv_ruleDoubleOption= ruleDoubleOption EOF
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
    // InternalDataDsl.g:1856:1: ruleDoubleOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) ) ) ;
    public final EObject ruleDoubleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1862:2: ( ( ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) ) ) )
            // InternalDataDsl.g:1863:2: ( ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) ) )
            {
            // InternalDataDsl.g:1863:2: ( ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) ) )
            // InternalDataDsl.g:1864:3: ( (lv_key_0_0= ruleDoubleOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_DOUBLE ) )
            {
            // InternalDataDsl.g:1864:3: ( (lv_key_0_0= ruleDoubleOptionKey ) )
            // InternalDataDsl.g:1865:4: (lv_key_0_0= ruleDoubleOptionKey )
            {
            // InternalDataDsl.g:1865:4: (lv_key_0_0= ruleDoubleOptionKey )
            // InternalDataDsl.g:1866:5: lv_key_0_0= ruleDoubleOptionKey
            {

            					newCompositeNode(grammarAccess.getDoubleOptionAccess().getKeyDoubleOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_1=(Token)match(input,22,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:1887:3: ( (lv_value_2_0= RULE_DOUBLE ) )
            // InternalDataDsl.g:1888:4: (lv_value_2_0= RULE_DOUBLE )
            {
            // InternalDataDsl.g:1888:4: (lv_value_2_0= RULE_DOUBLE )
            // InternalDataDsl.g:1889:5: lv_value_2_0= RULE_DOUBLE
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
    // InternalDataDsl.g:1909:1: entryRuleBooleanOption returns [EObject current=null] : iv_ruleBooleanOption= ruleBooleanOption EOF ;
    public final EObject entryRuleBooleanOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanOption = null;


        try {
            // InternalDataDsl.g:1909:54: (iv_ruleBooleanOption= ruleBooleanOption EOF )
            // InternalDataDsl.g:1910:2: iv_ruleBooleanOption= ruleBooleanOption EOF
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
    // InternalDataDsl.g:1916:1: ruleBooleanOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) ) ;
    public final EObject ruleBooleanOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1922:2: ( ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) ) )
            // InternalDataDsl.g:1923:2: ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            {
            // InternalDataDsl.g:1923:2: ( ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) ) )
            // InternalDataDsl.g:1924:3: ( (lv_key_0_0= ruleBooleanOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_BOOLEAN ) )
            {
            // InternalDataDsl.g:1924:3: ( (lv_key_0_0= ruleBooleanOptionKey ) )
            // InternalDataDsl.g:1925:4: (lv_key_0_0= ruleBooleanOptionKey )
            {
            // InternalDataDsl.g:1925:4: (lv_key_0_0= ruleBooleanOptionKey )
            // InternalDataDsl.g:1926:5: lv_key_0_0= ruleBooleanOptionKey
            {

            					newCompositeNode(grammarAccess.getBooleanOptionAccess().getKeyBooleanOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            otherlv_1=(Token)match(input,22,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:1947:3: ( (lv_value_2_0= RULE_BOOLEAN ) )
            // InternalDataDsl.g:1948:4: (lv_value_2_0= RULE_BOOLEAN )
            {
            // InternalDataDsl.g:1948:4: (lv_value_2_0= RULE_BOOLEAN )
            // InternalDataDsl.g:1949:5: lv_value_2_0= RULE_BOOLEAN
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


    // $ANTLR start "entryRuleSequenceOption"
    // InternalDataDsl.g:1969:1: entryRuleSequenceOption returns [EObject current=null] : iv_ruleSequenceOption= ruleSequenceOption EOF ;
    public final EObject entryRuleSequenceOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequenceOption = null;


        try {
            // InternalDataDsl.g:1969:55: (iv_ruleSequenceOption= ruleSequenceOption EOF )
            // InternalDataDsl.g:1970:2: iv_ruleSequenceOption= ruleSequenceOption EOF
            {
             newCompositeNode(grammarAccess.getSequenceOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequenceOption=ruleSequenceOption();

            state._fsp--;

             current =iv_ruleSequenceOption; 
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
    // $ANTLR end "entryRuleSequenceOption"


    // $ANTLR start "ruleSequenceOption"
    // InternalDataDsl.g:1976:1: ruleSequenceOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleSequenceOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSequenceOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:1982:2: ( ( ( (lv_key_0_0= ruleSequenceOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) ) )
            // InternalDataDsl.g:1983:2: ( ( (lv_key_0_0= ruleSequenceOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) )
            {
            // InternalDataDsl.g:1983:2: ( ( (lv_key_0_0= ruleSequenceOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:1984:3: ( (lv_key_0_0= ruleSequenceOptionKey ) ) otherlv_1= '=' ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:1984:3: ( (lv_key_0_0= ruleSequenceOptionKey ) )
            // InternalDataDsl.g:1985:4: (lv_key_0_0= ruleSequenceOptionKey )
            {
            // InternalDataDsl.g:1985:4: (lv_key_0_0= ruleSequenceOptionKey )
            // InternalDataDsl.g:1986:5: lv_key_0_0= ruleSequenceOptionKey
            {

            					newCompositeNode(grammarAccess.getSequenceOptionAccess().getKeySequenceOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_key_0_0=ruleSequenceOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSequenceOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.SequenceOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:2007:3: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:2008:4: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:2008:4: ( ruleQualifiedName )
            // InternalDataDsl.g:2009:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSequenceOptionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSequenceOptionAccess().getValueStringConceptCrossReference_2_0());
            				
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
    // $ANTLR end "ruleSequenceOption"


    // $ANTLR start "entryRuleDataOption"
    // InternalDataDsl.g:2027:1: entryRuleDataOption returns [EObject current=null] : iv_ruleDataOption= ruleDataOption EOF ;
    public final EObject entryRuleDataOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataOption = null;


        try {
            // InternalDataDsl.g:2027:51: (iv_ruleDataOption= ruleDataOption EOF )
            // InternalDataDsl.g:2028:2: iv_ruleDataOption= ruleDataOption EOF
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
    // InternalDataDsl.g:2034:1: ruleDataOption returns [EObject current=null] : ( ( (lv_key_0_0= ruleDataOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleDataOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        Enumerator lv_key_0_0 = null;



        	enterRule();

        try {
            // InternalDataDsl.g:2040:2: ( ( ( (lv_key_0_0= ruleDataOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalDataDsl.g:2041:2: ( ( (lv_key_0_0= ruleDataOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalDataDsl.g:2041:2: ( ( (lv_key_0_0= ruleDataOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalDataDsl.g:2042:3: ( (lv_key_0_0= ruleDataOptionKey ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalDataDsl.g:2042:3: ( (lv_key_0_0= ruleDataOptionKey ) )
            // InternalDataDsl.g:2043:4: (lv_key_0_0= ruleDataOptionKey )
            {
            // InternalDataDsl.g:2043:4: (lv_key_0_0= ruleDataOptionKey )
            // InternalDataDsl.g:2044:5: lv_key_0_0= ruleDataOptionKey
            {

            					newCompositeNode(grammarAccess.getDataOptionAccess().getKeyDataOptionKeyEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_key_0_0=ruleDataOptionKey();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDataOptionRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"eagledata.core.dsl.datadesc.DataDsl.DataOptionKey");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getDataOptionAccess().getEqualsSignKeyword_1());
            		
            // InternalDataDsl.g:2065:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalDataDsl.g:2066:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalDataDsl.g:2066:4: (lv_value_2_0= RULE_STRING )
            // InternalDataDsl.g:2067:5: lv_value_2_0= RULE_STRING
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
    // InternalDataDsl.g:2087:1: ruleTypeCharacter returns [Enumerator current=null] : ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'digit' ) ) ;
    public final Enumerator ruleTypeCharacter() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2093:2: ( ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'digit' ) ) )
            // InternalDataDsl.g:2094:2: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'digit' ) )
            {
            // InternalDataDsl.g:2094:2: ( (enumLiteral_0= 'char' ) | (enumLiteral_1= 'digit' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            else if ( (LA33_0==38) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataDsl.g:2095:3: (enumLiteral_0= 'char' )
                    {
                    // InternalDataDsl.g:2095:3: (enumLiteral_0= 'char' )
                    // InternalDataDsl.g:2096:4: enumLiteral_0= 'char'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2103:3: (enumLiteral_1= 'digit' )
                    {
                    // InternalDataDsl.g:2103:3: (enumLiteral_1= 'digit' )
                    // InternalDataDsl.g:2104:4: enumLiteral_1= 'digit'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalDataDsl.g:2114:1: ruleTypeString returns [Enumerator current=null] : ( (enumLiteral_0= 'anycase_string' ) | (enumLiteral_1= 'lowercase_string' ) | (enumLiteral_2= 'uppercase_string' ) | (enumLiteral_3= 'digits' ) ) ;
    public final Enumerator ruleTypeString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2120:2: ( ( (enumLiteral_0= 'anycase_string' ) | (enumLiteral_1= 'lowercase_string' ) | (enumLiteral_2= 'uppercase_string' ) | (enumLiteral_3= 'digits' ) ) )
            // InternalDataDsl.g:2121:2: ( (enumLiteral_0= 'anycase_string' ) | (enumLiteral_1= 'lowercase_string' ) | (enumLiteral_2= 'uppercase_string' ) | (enumLiteral_3= 'digits' ) )
            {
            // InternalDataDsl.g:2121:2: ( (enumLiteral_0= 'anycase_string' ) | (enumLiteral_1= 'lowercase_string' ) | (enumLiteral_2= 'uppercase_string' ) | (enumLiteral_3= 'digits' ) )
            int alt34=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt34=1;
                }
                break;
            case 40:
                {
                alt34=2;
                }
                break;
            case 41:
                {
                alt34=3;
                }
                break;
            case 42:
                {
                alt34=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalDataDsl.g:2122:3: (enumLiteral_0= 'anycase_string' )
                    {
                    // InternalDataDsl.g:2122:3: (enumLiteral_0= 'anycase_string' )
                    // InternalDataDsl.g:2123:4: enumLiteral_0= 'anycase_string'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2130:3: (enumLiteral_1= 'lowercase_string' )
                    {
                    // InternalDataDsl.g:2130:3: (enumLiteral_1= 'lowercase_string' )
                    // InternalDataDsl.g:2131:4: enumLiteral_1= 'lowercase_string'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2138:3: (enumLiteral_2= 'uppercase_string' )
                    {
                    // InternalDataDsl.g:2138:3: (enumLiteral_2= 'uppercase_string' )
                    // InternalDataDsl.g:2139:4: enumLiteral_2= 'uppercase_string'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2146:3: (enumLiteral_3= 'digits' )
                    {
                    // InternalDataDsl.g:2146:3: (enumLiteral_3= 'digits' )
                    // InternalDataDsl.g:2147:4: enumLiteral_3= 'digits'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

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


    // $ANTLR start "ruleSequenceOptionKey"
    // InternalDataDsl.g:2157:1: ruleSequenceOptionKey returns [Enumerator current=null] : (enumLiteral_0= 'regex_form' ) ;
    public final Enumerator ruleSequenceOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2163:2: ( (enumLiteral_0= 'regex_form' ) )
            // InternalDataDsl.g:2164:2: (enumLiteral_0= 'regex_form' )
            {
            // InternalDataDsl.g:2164:2: (enumLiteral_0= 'regex_form' )
            // InternalDataDsl.g:2165:3: enumLiteral_0= 'regex_form'
            {
            enumLiteral_0=(Token)match(input,43,FOLLOW_2); 

            			current = grammarAccess.getSequenceOptionKeyAccess().getRegex_formEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getSequenceOptionKeyAccess().getRegex_formEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleSequenceOptionKey"


    // $ANTLR start "ruleBasicType"
    // InternalDataDsl.g:2174:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'url' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'year' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'day' ) | (enumLiteral_9= 'boolean' ) | (enumLiteral_10= 'lat' ) | (enumLiteral_11= 'long' ) ) ;
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


        	enterRule();

        try {
            // InternalDataDsl.g:2180:2: ( ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'url' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'year' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'day' ) | (enumLiteral_9= 'boolean' ) | (enumLiteral_10= 'lat' ) | (enumLiteral_11= 'long' ) ) )
            // InternalDataDsl.g:2181:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'url' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'year' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'day' ) | (enumLiteral_9= 'boolean' ) | (enumLiteral_10= 'lat' ) | (enumLiteral_11= 'long' ) )
            {
            // InternalDataDsl.g:2181:2: ( (enumLiteral_0= 'string' ) | (enumLiteral_1= 'url' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'real' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'time' ) | (enumLiteral_6= 'year' ) | (enumLiteral_7= 'month' ) | (enumLiteral_8= 'day' ) | (enumLiteral_9= 'boolean' ) | (enumLiteral_10= 'lat' ) | (enumLiteral_11= 'long' ) )
            int alt35=12;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt35=1;
                }
                break;
            case 44:
                {
                alt35=2;
                }
                break;
            case 45:
                {
                alt35=3;
                }
                break;
            case 46:
                {
                alt35=4;
                }
                break;
            case 47:
                {
                alt35=5;
                }
                break;
            case 48:
                {
                alt35=6;
                }
                break;
            case 49:
                {
                alt35=7;
                }
                break;
            case 50:
                {
                alt35=8;
                }
                break;
            case 51:
                {
                alt35=9;
                }
                break;
            case 52:
                {
                alt35=10;
                }
                break;
            case 53:
                {
                alt35=11;
                }
                break;
            case 54:
                {
                alt35=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalDataDsl.g:2182:3: (enumLiteral_0= 'string' )
                    {
                    // InternalDataDsl.g:2182:3: (enumLiteral_0= 'string' )
                    // InternalDataDsl.g:2183:4: enumLiteral_0= 'string'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2190:3: (enumLiteral_1= 'url' )
                    {
                    // InternalDataDsl.g:2190:3: (enumLiteral_1= 'url' )
                    // InternalDataDsl.g:2191:4: enumLiteral_1= 'url'
                    {
                    enumLiteral_1=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2198:3: (enumLiteral_2= 'int' )
                    {
                    // InternalDataDsl.g:2198:3: (enumLiteral_2= 'int' )
                    // InternalDataDsl.g:2199:4: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2206:3: (enumLiteral_3= 'real' )
                    {
                    // InternalDataDsl.g:2206:3: (enumLiteral_3= 'real' )
                    // InternalDataDsl.g:2207:4: enumLiteral_3= 'real'
                    {
                    enumLiteral_3=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:2214:3: (enumLiteral_4= 'date' )
                    {
                    // InternalDataDsl.g:2214:3: (enumLiteral_4= 'date' )
                    // InternalDataDsl.g:2215:4: enumLiteral_4= 'date'
                    {
                    enumLiteral_4=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:2222:3: (enumLiteral_5= 'time' )
                    {
                    // InternalDataDsl.g:2222:3: (enumLiteral_5= 'time' )
                    // InternalDataDsl.g:2223:4: enumLiteral_5= 'time'
                    {
                    enumLiteral_5=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:2230:3: (enumLiteral_6= 'year' )
                    {
                    // InternalDataDsl.g:2230:3: (enumLiteral_6= 'year' )
                    // InternalDataDsl.g:2231:4: enumLiteral_6= 'year'
                    {
                    enumLiteral_6=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:2238:3: (enumLiteral_7= 'month' )
                    {
                    // InternalDataDsl.g:2238:3: (enumLiteral_7= 'month' )
                    // InternalDataDsl.g:2239:4: enumLiteral_7= 'month'
                    {
                    enumLiteral_7=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:2246:3: (enumLiteral_8= 'day' )
                    {
                    // InternalDataDsl.g:2246:3: (enumLiteral_8= 'day' )
                    // InternalDataDsl.g:2247:4: enumLiteral_8= 'day'
                    {
                    enumLiteral_8=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:2254:3: (enumLiteral_9= 'boolean' )
                    {
                    // InternalDataDsl.g:2254:3: (enumLiteral_9= 'boolean' )
                    // InternalDataDsl.g:2255:4: enumLiteral_9= 'boolean'
                    {
                    enumLiteral_9=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:2262:3: (enumLiteral_10= 'lat' )
                    {
                    // InternalDataDsl.g:2262:3: (enumLiteral_10= 'lat' )
                    // InternalDataDsl.g:2263:4: enumLiteral_10= 'lat'
                    {
                    enumLiteral_10=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDsl.g:2270:3: (enumLiteral_11= 'long' )
                    {
                    // InternalDataDsl.g:2270:3: (enumLiteral_11= 'long' )
                    // InternalDataDsl.g:2271:4: enumLiteral_11= 'long'
                    {
                    enumLiteral_11=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_11());
                    			

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
    // InternalDataDsl.g:2281:1: ruleStringOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'casesensitive' ) | (enumLiteral_1= 'null' ) | (enumLiteral_2= 'separator' ) | (enumLiteral_3= 'default' ) | (enumLiteral_4= 'regex' ) | (enumLiteral_5= 'flags' ) | (enumLiteral_6= 'decimalchar' ) | (enumLiteral_7= 'pattern' ) | (enumLiteral_8= 'format' ) ) ;
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
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2287:2: ( ( (enumLiteral_0= 'casesensitive' ) | (enumLiteral_1= 'null' ) | (enumLiteral_2= 'separator' ) | (enumLiteral_3= 'default' ) | (enumLiteral_4= 'regex' ) | (enumLiteral_5= 'flags' ) | (enumLiteral_6= 'decimalchar' ) | (enumLiteral_7= 'pattern' ) | (enumLiteral_8= 'format' ) ) )
            // InternalDataDsl.g:2288:2: ( (enumLiteral_0= 'casesensitive' ) | (enumLiteral_1= 'null' ) | (enumLiteral_2= 'separator' ) | (enumLiteral_3= 'default' ) | (enumLiteral_4= 'regex' ) | (enumLiteral_5= 'flags' ) | (enumLiteral_6= 'decimalchar' ) | (enumLiteral_7= 'pattern' ) | (enumLiteral_8= 'format' ) )
            {
            // InternalDataDsl.g:2288:2: ( (enumLiteral_0= 'casesensitive' ) | (enumLiteral_1= 'null' ) | (enumLiteral_2= 'separator' ) | (enumLiteral_3= 'default' ) | (enumLiteral_4= 'regex' ) | (enumLiteral_5= 'flags' ) | (enumLiteral_6= 'decimalchar' ) | (enumLiteral_7= 'pattern' ) | (enumLiteral_8= 'format' ) )
            int alt36=9;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt36=1;
                }
                break;
            case 56:
                {
                alt36=2;
                }
                break;
            case 57:
                {
                alt36=3;
                }
                break;
            case 58:
                {
                alt36=4;
                }
                break;
            case 59:
                {
                alt36=5;
                }
                break;
            case 60:
                {
                alt36=6;
                }
                break;
            case 61:
                {
                alt36=7;
                }
                break;
            case 62:
                {
                alt36=8;
                }
                break;
            case 63:
                {
                alt36=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalDataDsl.g:2289:3: (enumLiteral_0= 'casesensitive' )
                    {
                    // InternalDataDsl.g:2289:3: (enumLiteral_0= 'casesensitive' )
                    // InternalDataDsl.g:2290:4: enumLiteral_0= 'casesensitive'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStringOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2297:3: (enumLiteral_1= 'null' )
                    {
                    // InternalDataDsl.g:2297:3: (enumLiteral_1= 'null' )
                    // InternalDataDsl.g:2298:4: enumLiteral_1= 'null'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2305:3: (enumLiteral_2= 'separator' )
                    {
                    // InternalDataDsl.g:2305:3: (enumLiteral_2= 'separator' )
                    // InternalDataDsl.g:2306:4: enumLiteral_2= 'separator'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2313:3: (enumLiteral_3= 'default' )
                    {
                    // InternalDataDsl.g:2313:3: (enumLiteral_3= 'default' )
                    // InternalDataDsl.g:2314:4: enumLiteral_3= 'default'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:2321:3: (enumLiteral_4= 'regex' )
                    {
                    // InternalDataDsl.g:2321:3: (enumLiteral_4= 'regex' )
                    // InternalDataDsl.g:2322:4: enumLiteral_4= 'regex'
                    {
                    enumLiteral_4=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:2329:3: (enumLiteral_5= 'flags' )
                    {
                    // InternalDataDsl.g:2329:3: (enumLiteral_5= 'flags' )
                    // InternalDataDsl.g:2330:4: enumLiteral_5= 'flags'
                    {
                    enumLiteral_5=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:2337:3: (enumLiteral_6= 'decimalchar' )
                    {
                    // InternalDataDsl.g:2337:3: (enumLiteral_6= 'decimalchar' )
                    // InternalDataDsl.g:2338:4: enumLiteral_6= 'decimalchar'
                    {
                    enumLiteral_6=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:2345:3: (enumLiteral_7= 'pattern' )
                    {
                    // InternalDataDsl.g:2345:3: (enumLiteral_7= 'pattern' )
                    // InternalDataDsl.g:2346:4: enumLiteral_7= 'pattern'
                    {
                    enumLiteral_7=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:2353:3: (enumLiteral_8= 'format' )
                    {
                    // InternalDataDsl.g:2353:3: (enumLiteral_8= 'format' )
                    // InternalDataDsl.g:2354:4: enumLiteral_8= 'format'
                    {
                    enumLiteral_8=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getStringOptionKeyAccess().getFormatEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getStringOptionKeyAccess().getFormatEnumLiteralDeclaration_8());
                    			

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
    // InternalDataDsl.g:2364:1: ruleIntOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'defaultvalue' ) ) ;
    public final Enumerator ruleIntOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2370:2: ( ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'defaultvalue' ) ) )
            // InternalDataDsl.g:2371:2: ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'defaultvalue' ) )
            {
            // InternalDataDsl.g:2371:2: ( (enumLiteral_0= 'minLength' ) | (enumLiteral_1= 'maxLength' ) | (enumLiteral_2= 'min' ) | (enumLiteral_3= 'max' ) | (enumLiteral_4= 'defaultvalue' ) )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt37=1;
                }
                break;
            case 65:
                {
                alt37=2;
                }
                break;
            case 66:
                {
                alt37=3;
                }
                break;
            case 67:
                {
                alt37=4;
                }
                break;
            case 68:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalDataDsl.g:2372:3: (enumLiteral_0= 'minLength' )
                    {
                    // InternalDataDsl.g:2372:3: (enumLiteral_0= 'minLength' )
                    // InternalDataDsl.g:2373:4: enumLiteral_0= 'minLength'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2380:3: (enumLiteral_1= 'maxLength' )
                    {
                    // InternalDataDsl.g:2380:3: (enumLiteral_1= 'maxLength' )
                    // InternalDataDsl.g:2381:4: enumLiteral_1= 'maxLength'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2388:3: (enumLiteral_2= 'min' )
                    {
                    // InternalDataDsl.g:2388:3: (enumLiteral_2= 'min' )
                    // InternalDataDsl.g:2389:4: enumLiteral_2= 'min'
                    {
                    enumLiteral_2=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2396:3: (enumLiteral_3= 'max' )
                    {
                    // InternalDataDsl.g:2396:3: (enumLiteral_3= 'max' )
                    // InternalDataDsl.g:2397:4: enumLiteral_3= 'max'
                    {
                    enumLiteral_3=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:2404:3: (enumLiteral_4= 'defaultvalue' )
                    {
                    // InternalDataDsl.g:2404:3: (enumLiteral_4= 'defaultvalue' )
                    // InternalDataDsl.g:2405:4: enumLiteral_4= 'defaultvalue'
                    {
                    enumLiteral_4=(Token)match(input,68,FOLLOW_2); 

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
    // InternalDataDsl.g:2415:1: ruleDoubleOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'minDouble' ) | (enumLiteral_1= 'maxDouble' ) | (enumLiteral_2= 'defaultvalueDouble' ) ) ;
    public final Enumerator ruleDoubleOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2421:2: ( ( (enumLiteral_0= 'minDouble' ) | (enumLiteral_1= 'maxDouble' ) | (enumLiteral_2= 'defaultvalueDouble' ) ) )
            // InternalDataDsl.g:2422:2: ( (enumLiteral_0= 'minDouble' ) | (enumLiteral_1= 'maxDouble' ) | (enumLiteral_2= 'defaultvalueDouble' ) )
            {
            // InternalDataDsl.g:2422:2: ( (enumLiteral_0= 'minDouble' ) | (enumLiteral_1= 'maxDouble' ) | (enumLiteral_2= 'defaultvalueDouble' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt38=1;
                }
                break;
            case 70:
                {
                alt38=2;
                }
                break;
            case 71:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalDataDsl.g:2423:3: (enumLiteral_0= 'minDouble' )
                    {
                    // InternalDataDsl.g:2423:3: (enumLiteral_0= 'minDouble' )
                    // InternalDataDsl.g:2424:4: enumLiteral_0= 'minDouble'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2431:3: (enumLiteral_1= 'maxDouble' )
                    {
                    // InternalDataDsl.g:2431:3: (enumLiteral_1= 'maxDouble' )
                    // InternalDataDsl.g:2432:4: enumLiteral_1= 'maxDouble'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2439:3: (enumLiteral_2= 'defaultvalueDouble' )
                    {
                    // InternalDataDsl.g:2439:3: (enumLiteral_2= 'defaultvalueDouble' )
                    // InternalDataDsl.g:2440:4: enumLiteral_2= 'defaultvalueDouble'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); 

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
    // InternalDataDsl.g:2450:1: ruleBooleanOptionKey returns [Enumerator current=null] : (enumLiteral_0= 'nullable' ) ;
    public final Enumerator ruleBooleanOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2456:2: ( (enumLiteral_0= 'nullable' ) )
            // InternalDataDsl.g:2457:2: (enumLiteral_0= 'nullable' )
            {
            // InternalDataDsl.g:2457:2: (enumLiteral_0= 'nullable' )
            // InternalDataDsl.g:2458:3: enumLiteral_0= 'nullable'
            {
            enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

            			current = grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration());
            		

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


    // $ANTLR start "ruleDataOptionKey"
    // InternalDataDsl.g:2467:1: ruleDataOptionKey returns [Enumerator current=null] : ( (enumLiteral_0= 'format' ) | (enumLiteral_1= 'separator' ) | (enumLiteral_2= 'header' ) | (enumLiteral_3= 'squema' ) ) ;
    public final Enumerator ruleDataOptionKey() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2473:2: ( ( (enumLiteral_0= 'format' ) | (enumLiteral_1= 'separator' ) | (enumLiteral_2= 'header' ) | (enumLiteral_3= 'squema' ) ) )
            // InternalDataDsl.g:2474:2: ( (enumLiteral_0= 'format' ) | (enumLiteral_1= 'separator' ) | (enumLiteral_2= 'header' ) | (enumLiteral_3= 'squema' ) )
            {
            // InternalDataDsl.g:2474:2: ( (enumLiteral_0= 'format' ) | (enumLiteral_1= 'separator' ) | (enumLiteral_2= 'header' ) | (enumLiteral_3= 'squema' ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt39=1;
                }
                break;
            case 57:
                {
                alt39=2;
                }
                break;
            case 73:
                {
                alt39=3;
                }
                break;
            case 74:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalDataDsl.g:2475:3: (enumLiteral_0= 'format' )
                    {
                    // InternalDataDsl.g:2475:3: (enumLiteral_0= 'format' )
                    // InternalDataDsl.g:2476:4: enumLiteral_0= 'format'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getDataOptionKeyAccess().getFormatEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataOptionKeyAccess().getFormatEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2483:3: (enumLiteral_1= 'separator' )
                    {
                    // InternalDataDsl.g:2483:3: (enumLiteral_1= 'separator' )
                    // InternalDataDsl.g:2484:4: enumLiteral_1= 'separator'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDataOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2491:3: (enumLiteral_2= 'header' )
                    {
                    // InternalDataDsl.g:2491:3: (enumLiteral_2= 'header' )
                    // InternalDataDsl.g:2492:4: enumLiteral_2= 'header'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getDataOptionKeyAccess().getHeaderEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataOptionKeyAccess().getHeaderEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:2499:3: (enumLiteral_3= 'squema' )
                    {
                    // InternalDataDsl.g:2499:3: (enumLiteral_3= 'squema' )
                    // InternalDataDsl.g:2500:4: enumLiteral_3= 'squema'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getDataOptionKeyAccess().getSquemaEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataOptionKeyAccess().getSquemaEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleDataOptionKey"


    // $ANTLR start "ruleFormat"
    // InternalDataDsl.g:2510:1: ruleFormat returns [Enumerator current=null] : ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) ) ;
    public final Enumerator ruleFormat() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDataDsl.g:2516:2: ( ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) ) )
            // InternalDataDsl.g:2517:2: ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) )
            {
            // InternalDataDsl.g:2517:2: ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'JSON' ) | (enumLiteral_2= 'XML' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt40=1;
                }
                break;
            case 76:
                {
                alt40=2;
                }
                break;
            case 77:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalDataDsl.g:2518:3: (enumLiteral_0= 'CSV' )
                    {
                    // InternalDataDsl.g:2518:3: (enumLiteral_0= 'CSV' )
                    // InternalDataDsl.g:2519:4: enumLiteral_0= 'CSV'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getFormatAccess().getCSVEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFormatAccess().getCSVEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:2526:3: (enumLiteral_1= 'JSON' )
                    {
                    // InternalDataDsl.g:2526:3: (enumLiteral_1= 'JSON' )
                    // InternalDataDsl.g:2527:4: enumLiteral_1= 'JSON'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getFormatAccess().getJSONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFormatAccess().getJSONEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:2534:3: (enumLiteral_2= 'XML' )
                    {
                    // InternalDataDsl.g:2534:3: (enumLiteral_2= 'XML' )
                    // InternalDataDsl.g:2535:4: enumLiteral_2= 'XML'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getFormatAccess().getXMLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFormatAccess().getXMLEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleFormat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003D0248002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000003C0200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000003C0300000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000007E002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000007E000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x007FF01C00300010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x007FF01C00200010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x8200000000000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x007FF00000200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFF80080000000000L,0x00000000000001FFL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x007FF00000200010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000100L});

}