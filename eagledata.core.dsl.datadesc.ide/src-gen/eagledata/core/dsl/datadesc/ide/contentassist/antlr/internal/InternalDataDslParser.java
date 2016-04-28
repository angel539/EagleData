package eagledata.core.dsl.datadesc.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import eagledata.core.dsl.datadesc.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_DELETATION_MARK", "RULE_MODIFICATION_MARK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'regex_form'", "'nullable'", "'char'", "'digit'", "'anycase_string'", "'lowercase_string'", "'uppercase_string'", "'digits'", "'string'", "'url'", "'int'", "'real'", "'date'", "'time'", "'year'", "'month'", "'day'", "'boolean'", "'lat'", "'long'", "'casesensitive'", "'null'", "'separator'", "'default'", "'regex'", "'flags'", "'decimalchar'", "'pattern'", "'format'", "'minLength'", "'maxLength'", "'min'", "'max'", "'defaultvalue'", "'minDouble'", "'maxDouble'", "'defaultvalueDouble'", "'header'", "'squema'", "'CSV'", "'JSON'", "'XML'", "'import'", "'.*'", "'.'", "'package'", "'{'", "'}'", "'='", "'('", "')'", "','", "'['", "']'", "'description'", "':'", "'fragment'", "'datatype'", "'enumeration'", "'struct'", "'key'", "'unique'", "'list'"
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

    	public void setGrammarAccess(DataDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDataModel"
    // InternalDataDsl.g:53:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // InternalDataDsl.g:54:1: ( ruleDataModel EOF )
            // InternalDataDsl.g:55:1: ruleDataModel EOF
            {
             before(grammarAccess.getDataModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDataModel();

            state._fsp--;

             after(grammarAccess.getDataModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataModel"


    // $ANTLR start "ruleDataModel"
    // InternalDataDsl.g:62:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:66:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // InternalDataDsl.g:67:2: ( ( rule__DataModel__Group__0 ) )
            {
            // InternalDataDsl.g:67:2: ( ( rule__DataModel__Group__0 ) )
            // InternalDataDsl.g:68:3: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // InternalDataDsl.g:69:3: ( rule__DataModel__Group__0 )
            // InternalDataDsl.g:69:4: rule__DataModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModel"


    // $ANTLR start "entryRuleImport"
    // InternalDataDsl.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalDataDsl.g:79:1: ( ruleImport EOF )
            // InternalDataDsl.g:80:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDataDsl.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalDataDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalDataDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalDataDsl.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalDataDsl.g:94:3: ( rule__Import__Group__0 )
            // InternalDataDsl.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalDataDsl.g:103:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalDataDsl.g:104:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalDataDsl.g:105:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalDataDsl.g:112:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:116:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalDataDsl.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalDataDsl.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalDataDsl.g:118:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalDataDsl.g:119:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalDataDsl.g:119:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDataDsl.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDataDsl.g:129:1: ( ruleQualifiedName EOF )
            // InternalDataDsl.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDataDsl.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalDataDsl.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalDataDsl.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalDataDsl.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalDataDsl.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalDataDsl.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleDataModelElement"
    // InternalDataDsl.g:153:1: entryRuleDataModelElement : ruleDataModelElement EOF ;
    public final void entryRuleDataModelElement() throws RecognitionException {
        try {
            // InternalDataDsl.g:154:1: ( ruleDataModelElement EOF )
            // InternalDataDsl.g:155:1: ruleDataModelElement EOF
            {
             before(grammarAccess.getDataModelElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDataModelElement();

            state._fsp--;

             after(grammarAccess.getDataModelElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataModelElement"


    // $ANTLR start "ruleDataModelElement"
    // InternalDataDsl.g:162:1: ruleDataModelElement : ( ( rule__DataModelElement__Alternatives ) ) ;
    public final void ruleDataModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:166:2: ( ( ( rule__DataModelElement__Alternatives ) ) )
            // InternalDataDsl.g:167:2: ( ( rule__DataModelElement__Alternatives ) )
            {
            // InternalDataDsl.g:167:2: ( ( rule__DataModelElement__Alternatives ) )
            // InternalDataDsl.g:168:3: ( rule__DataModelElement__Alternatives )
            {
             before(grammarAccess.getDataModelElementAccess().getAlternatives()); 
            // InternalDataDsl.g:169:3: ( rule__DataModelElement__Alternatives )
            // InternalDataDsl.g:169:4: rule__DataModelElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataModelElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataModelElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataModelElement"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalDataDsl.g:178:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalDataDsl.g:179:1: ( rulePackageDeclaration EOF )
            // InternalDataDsl.g:180:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalDataDsl.g:187:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:191:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalDataDsl.g:192:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalDataDsl.g:192:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalDataDsl.g:193:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalDataDsl.g:194:3: ( rule__PackageDeclaration__Group__0 )
            // InternalDataDsl.g:194:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleDataPackableDescription"
    // InternalDataDsl.g:203:1: entryRuleDataPackableDescription : ruleDataPackableDescription EOF ;
    public final void entryRuleDataPackableDescription() throws RecognitionException {
        try {
            // InternalDataDsl.g:204:1: ( ruleDataPackableDescription EOF )
            // InternalDataDsl.g:205:1: ruleDataPackableDescription EOF
            {
             before(grammarAccess.getDataPackableDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDataPackableDescription();

            state._fsp--;

             after(grammarAccess.getDataPackableDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataPackableDescription"


    // $ANTLR start "ruleDataPackableDescription"
    // InternalDataDsl.g:212:1: ruleDataPackableDescription : ( ( rule__DataPackableDescription__Alternatives ) ) ;
    public final void ruleDataPackableDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:216:2: ( ( ( rule__DataPackableDescription__Alternatives ) ) )
            // InternalDataDsl.g:217:2: ( ( rule__DataPackableDescription__Alternatives ) )
            {
            // InternalDataDsl.g:217:2: ( ( rule__DataPackableDescription__Alternatives ) )
            // InternalDataDsl.g:218:3: ( rule__DataPackableDescription__Alternatives )
            {
             before(grammarAccess.getDataPackableDescriptionAccess().getAlternatives()); 
            // InternalDataDsl.g:219:3: ( rule__DataPackableDescription__Alternatives )
            // InternalDataDsl.g:219:4: rule__DataPackableDescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataPackableDescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataPackableDescriptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataPackableDescription"


    // $ANTLR start "entryRuleStringConcept"
    // InternalDataDsl.g:228:1: entryRuleStringConcept : ruleStringConcept EOF ;
    public final void entryRuleStringConcept() throws RecognitionException {
        try {
            // InternalDataDsl.g:229:1: ( ruleStringConcept EOF )
            // InternalDataDsl.g:230:1: ruleStringConcept EOF
            {
             before(grammarAccess.getStringConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleStringConcept();

            state._fsp--;

             after(grammarAccess.getStringConceptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringConcept"


    // $ANTLR start "ruleStringConcept"
    // InternalDataDsl.g:237:1: ruleStringConcept : ( ( rule__StringConcept__Group__0 ) ) ;
    public final void ruleStringConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:241:2: ( ( ( rule__StringConcept__Group__0 ) ) )
            // InternalDataDsl.g:242:2: ( ( rule__StringConcept__Group__0 ) )
            {
            // InternalDataDsl.g:242:2: ( ( rule__StringConcept__Group__0 ) )
            // InternalDataDsl.g:243:3: ( rule__StringConcept__Group__0 )
            {
             before(grammarAccess.getStringConceptAccess().getGroup()); 
            // InternalDataDsl.g:244:3: ( rule__StringConcept__Group__0 )
            // InternalDataDsl.g:244:4: rule__StringConcept__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringConcept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringConceptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringConcept"


    // $ANTLR start "entryRuleSubstringConcept"
    // InternalDataDsl.g:253:1: entryRuleSubstringConcept : ruleSubstringConcept EOF ;
    public final void entryRuleSubstringConcept() throws RecognitionException {
        try {
            // InternalDataDsl.g:254:1: ( ruleSubstringConcept EOF )
            // InternalDataDsl.g:255:1: ruleSubstringConcept EOF
            {
             before(grammarAccess.getSubstringConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleSubstringConcept();

            state._fsp--;

             after(grammarAccess.getSubstringConceptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubstringConcept"


    // $ANTLR start "ruleSubstringConcept"
    // InternalDataDsl.g:262:1: ruleSubstringConcept : ( ( rule__SubstringConcept__Alternatives ) ) ;
    public final void ruleSubstringConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:266:2: ( ( ( rule__SubstringConcept__Alternatives ) ) )
            // InternalDataDsl.g:267:2: ( ( rule__SubstringConcept__Alternatives ) )
            {
            // InternalDataDsl.g:267:2: ( ( rule__SubstringConcept__Alternatives ) )
            // InternalDataDsl.g:268:3: ( rule__SubstringConcept__Alternatives )
            {
             before(grammarAccess.getSubstringConceptAccess().getAlternatives()); 
            // InternalDataDsl.g:269:3: ( rule__SubstringConcept__Alternatives )
            // InternalDataDsl.g:269:4: rule__SubstringConcept__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubstringConcept__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubstringConceptAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstringConcept"


    // $ANTLR start "entryRuleSubstring"
    // InternalDataDsl.g:278:1: entryRuleSubstring : ruleSubstring EOF ;
    public final void entryRuleSubstring() throws RecognitionException {
        try {
            // InternalDataDsl.g:279:1: ( ruleSubstring EOF )
            // InternalDataDsl.g:280:1: ruleSubstring EOF
            {
             before(grammarAccess.getSubstringRule()); 
            pushFollow(FOLLOW_1);
            ruleSubstring();

            state._fsp--;

             after(grammarAccess.getSubstringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubstring"


    // $ANTLR start "ruleSubstring"
    // InternalDataDsl.g:287:1: ruleSubstring : ( ( rule__Substring__Group__0 ) ) ;
    public final void ruleSubstring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:291:2: ( ( ( rule__Substring__Group__0 ) ) )
            // InternalDataDsl.g:292:2: ( ( rule__Substring__Group__0 ) )
            {
            // InternalDataDsl.g:292:2: ( ( rule__Substring__Group__0 ) )
            // InternalDataDsl.g:293:3: ( rule__Substring__Group__0 )
            {
             before(grammarAccess.getSubstringAccess().getGroup()); 
            // InternalDataDsl.g:294:3: ( rule__Substring__Group__0 )
            // InternalDataDsl.g:294:4: rule__Substring__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Substring__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubstringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubstring"


    // $ANTLR start "entryRuleCharacter"
    // InternalDataDsl.g:303:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // InternalDataDsl.g:304:1: ( ruleCharacter EOF )
            // InternalDataDsl.g:305:1: ruleCharacter EOF
            {
             before(grammarAccess.getCharacterRule()); 
            pushFollow(FOLLOW_1);
            ruleCharacter();

            state._fsp--;

             after(grammarAccess.getCharacterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharacter"


    // $ANTLR start "ruleCharacter"
    // InternalDataDsl.g:312:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:316:2: ( ( ( rule__Character__Group__0 ) ) )
            // InternalDataDsl.g:317:2: ( ( rule__Character__Group__0 ) )
            {
            // InternalDataDsl.g:317:2: ( ( rule__Character__Group__0 ) )
            // InternalDataDsl.g:318:3: ( rule__Character__Group__0 )
            {
             before(grammarAccess.getCharacterAccess().getGroup()); 
            // InternalDataDsl.g:319:3: ( rule__Character__Group__0 )
            // InternalDataDsl.g:319:4: rule__Character__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharacter"


    // $ANTLR start "entryRuleDataSourceDescription"
    // InternalDataDsl.g:328:1: entryRuleDataSourceDescription : ruleDataSourceDescription EOF ;
    public final void entryRuleDataSourceDescription() throws RecognitionException {
        try {
            // InternalDataDsl.g:329:1: ( ruleDataSourceDescription EOF )
            // InternalDataDsl.g:330:1: ruleDataSourceDescription EOF
            {
             before(grammarAccess.getDataSourceDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDataSourceDescription();

            state._fsp--;

             after(grammarAccess.getDataSourceDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataSourceDescription"


    // $ANTLR start "ruleDataSourceDescription"
    // InternalDataDsl.g:337:1: ruleDataSourceDescription : ( ( rule__DataSourceDescription__Group__0 ) ) ;
    public final void ruleDataSourceDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:341:2: ( ( ( rule__DataSourceDescription__Group__0 ) ) )
            // InternalDataDsl.g:342:2: ( ( rule__DataSourceDescription__Group__0 ) )
            {
            // InternalDataDsl.g:342:2: ( ( rule__DataSourceDescription__Group__0 ) )
            // InternalDataDsl.g:343:3: ( rule__DataSourceDescription__Group__0 )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getGroup()); 
            // InternalDataDsl.g:344:3: ( rule__DataSourceDescription__Group__0 )
            // InternalDataDsl.g:344:4: rule__DataSourceDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataSourceDescription"


    // $ANTLR start "entryRuleDataFragment"
    // InternalDataDsl.g:353:1: entryRuleDataFragment : ruleDataFragment EOF ;
    public final void entryRuleDataFragment() throws RecognitionException {
        try {
            // InternalDataDsl.g:354:1: ( ruleDataFragment EOF )
            // InternalDataDsl.g:355:1: ruleDataFragment EOF
            {
             before(grammarAccess.getDataFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleDataFragment();

            state._fsp--;

             after(grammarAccess.getDataFragmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataFragment"


    // $ANTLR start "ruleDataFragment"
    // InternalDataDsl.g:362:1: ruleDataFragment : ( ( rule__DataFragment__Group__0 ) ) ;
    public final void ruleDataFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:366:2: ( ( ( rule__DataFragment__Group__0 ) ) )
            // InternalDataDsl.g:367:2: ( ( rule__DataFragment__Group__0 ) )
            {
            // InternalDataDsl.g:367:2: ( ( rule__DataFragment__Group__0 ) )
            // InternalDataDsl.g:368:3: ( rule__DataFragment__Group__0 )
            {
             before(grammarAccess.getDataFragmentAccess().getGroup()); 
            // InternalDataDsl.g:369:3: ( rule__DataFragment__Group__0 )
            // InternalDataDsl.g:369:4: rule__DataFragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataFragmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataFragment"


    // $ANTLR start "entryRuleTypeSpecification"
    // InternalDataDsl.g:378:1: entryRuleTypeSpecification : ruleTypeSpecification EOF ;
    public final void entryRuleTypeSpecification() throws RecognitionException {
        try {
            // InternalDataDsl.g:379:1: ( ruleTypeSpecification EOF )
            // InternalDataDsl.g:380:1: ruleTypeSpecification EOF
            {
             before(grammarAccess.getTypeSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeSpecification();

            state._fsp--;

             after(grammarAccess.getTypeSpecificationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeSpecification"


    // $ANTLR start "ruleTypeSpecification"
    // InternalDataDsl.g:387:1: ruleTypeSpecification : ( ( rule__TypeSpecification__Alternatives ) ) ;
    public final void ruleTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:391:2: ( ( ( rule__TypeSpecification__Alternatives ) ) )
            // InternalDataDsl.g:392:2: ( ( rule__TypeSpecification__Alternatives ) )
            {
            // InternalDataDsl.g:392:2: ( ( rule__TypeSpecification__Alternatives ) )
            // InternalDataDsl.g:393:3: ( rule__TypeSpecification__Alternatives )
            {
             before(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            // InternalDataDsl.g:394:3: ( rule__TypeSpecification__Alternatives )
            // InternalDataDsl.g:394:4: rule__TypeSpecification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeSpecification"


    // $ANTLR start "entryRuleDataType"
    // InternalDataDsl.g:403:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDataDsl.g:404:1: ( ruleDataType EOF )
            // InternalDataDsl.g:405:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDataDsl.g:412:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:416:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDataDsl.g:417:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDataDsl.g:417:2: ( ( rule__DataType__Group__0 ) )
            // InternalDataDsl.g:418:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDataDsl.g:419:3: ( rule__DataType__Group__0 )
            // InternalDataDsl.g:419:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEnumeration"
    // InternalDataDsl.g:428:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalDataDsl.g:429:1: ( ruleEnumeration EOF )
            // InternalDataDsl.g:430:1: ruleEnumeration EOF
            {
             before(grammarAccess.getEnumerationRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumeration();

            state._fsp--;

             after(grammarAccess.getEnumerationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // InternalDataDsl.g:437:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:441:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalDataDsl.g:442:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalDataDsl.g:442:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalDataDsl.g:443:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalDataDsl.g:444:3: ( rule__Enumeration__Group__0 )
            // InternalDataDsl.g:444:4: rule__Enumeration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleStructDataType"
    // InternalDataDsl.g:453:1: entryRuleStructDataType : ruleStructDataType EOF ;
    public final void entryRuleStructDataType() throws RecognitionException {
        try {
            // InternalDataDsl.g:454:1: ( ruleStructDataType EOF )
            // InternalDataDsl.g:455:1: ruleStructDataType EOF
            {
             before(grammarAccess.getStructDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStructDataType();

            state._fsp--;

             after(grammarAccess.getStructDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructDataType"


    // $ANTLR start "ruleStructDataType"
    // InternalDataDsl.g:462:1: ruleStructDataType : ( ( rule__StructDataType__Group__0 ) ) ;
    public final void ruleStructDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:466:2: ( ( ( rule__StructDataType__Group__0 ) ) )
            // InternalDataDsl.g:467:2: ( ( rule__StructDataType__Group__0 ) )
            {
            // InternalDataDsl.g:467:2: ( ( rule__StructDataType__Group__0 ) )
            // InternalDataDsl.g:468:3: ( rule__StructDataType__Group__0 )
            {
             before(grammarAccess.getStructDataTypeAccess().getGroup()); 
            // InternalDataDsl.g:469:3: ( rule__StructDataType__Group__0 )
            // InternalDataDsl.g:469:4: rule__StructDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructDataType"


    // $ANTLR start "entryRuleLeafNode"
    // InternalDataDsl.g:478:1: entryRuleLeafNode : ruleLeafNode EOF ;
    public final void entryRuleLeafNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:479:1: ( ruleLeafNode EOF )
            // InternalDataDsl.g:480:1: ruleLeafNode EOF
            {
             before(grammarAccess.getLeafNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleLeafNode();

            state._fsp--;

             after(grammarAccess.getLeafNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeafNode"


    // $ANTLR start "ruleLeafNode"
    // InternalDataDsl.g:487:1: ruleLeafNode : ( ( rule__LeafNode__Group__0 ) ) ;
    public final void ruleLeafNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:491:2: ( ( ( rule__LeafNode__Group__0 ) ) )
            // InternalDataDsl.g:492:2: ( ( rule__LeafNode__Group__0 ) )
            {
            // InternalDataDsl.g:492:2: ( ( rule__LeafNode__Group__0 ) )
            // InternalDataDsl.g:493:3: ( rule__LeafNode__Group__0 )
            {
             before(grammarAccess.getLeafNodeAccess().getGroup()); 
            // InternalDataDsl.g:494:3: ( rule__LeafNode__Group__0 )
            // InternalDataDsl.g:494:4: rule__LeafNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeafNode"


    // $ANTLR start "entryRuleOption"
    // InternalDataDsl.g:503:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:504:1: ( ruleOption EOF )
            // InternalDataDsl.g:505:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalDataDsl.g:512:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:516:2: ( ( ( rule__Option__Alternatives ) ) )
            // InternalDataDsl.g:517:2: ( ( rule__Option__Alternatives ) )
            {
            // InternalDataDsl.g:517:2: ( ( rule__Option__Alternatives ) )
            // InternalDataDsl.g:518:3: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // InternalDataDsl.g:519:3: ( rule__Option__Alternatives )
            // InternalDataDsl.g:519:4: rule__Option__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Option__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleStringOption"
    // InternalDataDsl.g:528:1: entryRuleStringOption : ruleStringOption EOF ;
    public final void entryRuleStringOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:529:1: ( ruleStringOption EOF )
            // InternalDataDsl.g:530:1: ruleStringOption EOF
            {
             before(grammarAccess.getStringOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleStringOption();

            state._fsp--;

             after(grammarAccess.getStringOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringOption"


    // $ANTLR start "ruleStringOption"
    // InternalDataDsl.g:537:1: ruleStringOption : ( ( rule__StringOption__Group__0 ) ) ;
    public final void ruleStringOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:541:2: ( ( ( rule__StringOption__Group__0 ) ) )
            // InternalDataDsl.g:542:2: ( ( rule__StringOption__Group__0 ) )
            {
            // InternalDataDsl.g:542:2: ( ( rule__StringOption__Group__0 ) )
            // InternalDataDsl.g:543:3: ( rule__StringOption__Group__0 )
            {
             before(grammarAccess.getStringOptionAccess().getGroup()); 
            // InternalDataDsl.g:544:3: ( rule__StringOption__Group__0 )
            // InternalDataDsl.g:544:4: rule__StringOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringOption"


    // $ANTLR start "entryRuleIntOption"
    // InternalDataDsl.g:553:1: entryRuleIntOption : ruleIntOption EOF ;
    public final void entryRuleIntOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:554:1: ( ruleIntOption EOF )
            // InternalDataDsl.g:555:1: ruleIntOption EOF
            {
             before(grammarAccess.getIntOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleIntOption();

            state._fsp--;

             after(grammarAccess.getIntOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntOption"


    // $ANTLR start "ruleIntOption"
    // InternalDataDsl.g:562:1: ruleIntOption : ( ( rule__IntOption__Group__0 ) ) ;
    public final void ruleIntOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:566:2: ( ( ( rule__IntOption__Group__0 ) ) )
            // InternalDataDsl.g:567:2: ( ( rule__IntOption__Group__0 ) )
            {
            // InternalDataDsl.g:567:2: ( ( rule__IntOption__Group__0 ) )
            // InternalDataDsl.g:568:3: ( rule__IntOption__Group__0 )
            {
             before(grammarAccess.getIntOptionAccess().getGroup()); 
            // InternalDataDsl.g:569:3: ( rule__IntOption__Group__0 )
            // InternalDataDsl.g:569:4: rule__IntOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntOption"


    // $ANTLR start "entryRuleDoubleOption"
    // InternalDataDsl.g:578:1: entryRuleDoubleOption : ruleDoubleOption EOF ;
    public final void entryRuleDoubleOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:579:1: ( ruleDoubleOption EOF )
            // InternalDataDsl.g:580:1: ruleDoubleOption EOF
            {
             before(grammarAccess.getDoubleOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleOption();

            state._fsp--;

             after(grammarAccess.getDoubleOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleOption"


    // $ANTLR start "ruleDoubleOption"
    // InternalDataDsl.g:587:1: ruleDoubleOption : ( ( rule__DoubleOption__Group__0 ) ) ;
    public final void ruleDoubleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:591:2: ( ( ( rule__DoubleOption__Group__0 ) ) )
            // InternalDataDsl.g:592:2: ( ( rule__DoubleOption__Group__0 ) )
            {
            // InternalDataDsl.g:592:2: ( ( rule__DoubleOption__Group__0 ) )
            // InternalDataDsl.g:593:3: ( rule__DoubleOption__Group__0 )
            {
             before(grammarAccess.getDoubleOptionAccess().getGroup()); 
            // InternalDataDsl.g:594:3: ( rule__DoubleOption__Group__0 )
            // InternalDataDsl.g:594:4: rule__DoubleOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleOption"


    // $ANTLR start "entryRuleBooleanOption"
    // InternalDataDsl.g:603:1: entryRuleBooleanOption : ruleBooleanOption EOF ;
    public final void entryRuleBooleanOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:604:1: ( ruleBooleanOption EOF )
            // InternalDataDsl.g:605:1: ruleBooleanOption EOF
            {
             before(grammarAccess.getBooleanOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanOption();

            state._fsp--;

             after(grammarAccess.getBooleanOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanOption"


    // $ANTLR start "ruleBooleanOption"
    // InternalDataDsl.g:612:1: ruleBooleanOption : ( ( rule__BooleanOption__Group__0 ) ) ;
    public final void ruleBooleanOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:616:2: ( ( ( rule__BooleanOption__Group__0 ) ) )
            // InternalDataDsl.g:617:2: ( ( rule__BooleanOption__Group__0 ) )
            {
            // InternalDataDsl.g:617:2: ( ( rule__BooleanOption__Group__0 ) )
            // InternalDataDsl.g:618:3: ( rule__BooleanOption__Group__0 )
            {
             before(grammarAccess.getBooleanOptionAccess().getGroup()); 
            // InternalDataDsl.g:619:3: ( rule__BooleanOption__Group__0 )
            // InternalDataDsl.g:619:4: rule__BooleanOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOption"


    // $ANTLR start "entryRuleSequenceOption"
    // InternalDataDsl.g:628:1: entryRuleSequenceOption : ruleSequenceOption EOF ;
    public final void entryRuleSequenceOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:629:1: ( ruleSequenceOption EOF )
            // InternalDataDsl.g:630:1: ruleSequenceOption EOF
            {
             before(grammarAccess.getSequenceOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleSequenceOption();

            state._fsp--;

             after(grammarAccess.getSequenceOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequenceOption"


    // $ANTLR start "ruleSequenceOption"
    // InternalDataDsl.g:637:1: ruleSequenceOption : ( ( rule__SequenceOption__Group__0 ) ) ;
    public final void ruleSequenceOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:641:2: ( ( ( rule__SequenceOption__Group__0 ) ) )
            // InternalDataDsl.g:642:2: ( ( rule__SequenceOption__Group__0 ) )
            {
            // InternalDataDsl.g:642:2: ( ( rule__SequenceOption__Group__0 ) )
            // InternalDataDsl.g:643:3: ( rule__SequenceOption__Group__0 )
            {
             before(grammarAccess.getSequenceOptionAccess().getGroup()); 
            // InternalDataDsl.g:644:3: ( rule__SequenceOption__Group__0 )
            // InternalDataDsl.g:644:4: rule__SequenceOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceOption"


    // $ANTLR start "entryRuleDataOption"
    // InternalDataDsl.g:653:1: entryRuleDataOption : ruleDataOption EOF ;
    public final void entryRuleDataOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:654:1: ( ruleDataOption EOF )
            // InternalDataDsl.g:655:1: ruleDataOption EOF
            {
             before(grammarAccess.getDataOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDataOption();

            state._fsp--;

             after(grammarAccess.getDataOptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataOption"


    // $ANTLR start "ruleDataOption"
    // InternalDataDsl.g:662:1: ruleDataOption : ( ( rule__DataOption__Group__0 ) ) ;
    public final void ruleDataOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:666:2: ( ( ( rule__DataOption__Group__0 ) ) )
            // InternalDataDsl.g:667:2: ( ( rule__DataOption__Group__0 ) )
            {
            // InternalDataDsl.g:667:2: ( ( rule__DataOption__Group__0 ) )
            // InternalDataDsl.g:668:3: ( rule__DataOption__Group__0 )
            {
             before(grammarAccess.getDataOptionAccess().getGroup()); 
            // InternalDataDsl.g:669:3: ( rule__DataOption__Group__0 )
            // InternalDataDsl.g:669:4: rule__DataOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataOptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataOption"


    // $ANTLR start "ruleTypeCharacter"
    // InternalDataDsl.g:678:1: ruleTypeCharacter : ( ( rule__TypeCharacter__Alternatives ) ) ;
    public final void ruleTypeCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:682:1: ( ( ( rule__TypeCharacter__Alternatives ) ) )
            // InternalDataDsl.g:683:2: ( ( rule__TypeCharacter__Alternatives ) )
            {
            // InternalDataDsl.g:683:2: ( ( rule__TypeCharacter__Alternatives ) )
            // InternalDataDsl.g:684:3: ( rule__TypeCharacter__Alternatives )
            {
             before(grammarAccess.getTypeCharacterAccess().getAlternatives()); 
            // InternalDataDsl.g:685:3: ( rule__TypeCharacter__Alternatives )
            // InternalDataDsl.g:685:4: rule__TypeCharacter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeCharacter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeCharacterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeCharacter"


    // $ANTLR start "ruleTypeString"
    // InternalDataDsl.g:694:1: ruleTypeString : ( ( rule__TypeString__Alternatives ) ) ;
    public final void ruleTypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:698:1: ( ( ( rule__TypeString__Alternatives ) ) )
            // InternalDataDsl.g:699:2: ( ( rule__TypeString__Alternatives ) )
            {
            // InternalDataDsl.g:699:2: ( ( rule__TypeString__Alternatives ) )
            // InternalDataDsl.g:700:3: ( rule__TypeString__Alternatives )
            {
             before(grammarAccess.getTypeStringAccess().getAlternatives()); 
            // InternalDataDsl.g:701:3: ( rule__TypeString__Alternatives )
            // InternalDataDsl.g:701:4: rule__TypeString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeString"


    // $ANTLR start "ruleSequenceOptionKey"
    // InternalDataDsl.g:710:1: ruleSequenceOptionKey : ( ( 'regex_form' ) ) ;
    public final void ruleSequenceOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:714:1: ( ( ( 'regex_form' ) ) )
            // InternalDataDsl.g:715:2: ( ( 'regex_form' ) )
            {
            // InternalDataDsl.g:715:2: ( ( 'regex_form' ) )
            // InternalDataDsl.g:716:3: ( 'regex_form' )
            {
             before(grammarAccess.getSequenceOptionKeyAccess().getRegex_formEnumLiteralDeclaration()); 
            // InternalDataDsl.g:717:3: ( 'regex_form' )
            // InternalDataDsl.g:717:4: 'regex_form'
            {
            match(input,15,FOLLOW_2); 

            }

             after(grammarAccess.getSequenceOptionKeyAccess().getRegex_formEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequenceOptionKey"


    // $ANTLR start "ruleBasicType"
    // InternalDataDsl.g:726:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:730:1: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalDataDsl.g:731:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalDataDsl.g:731:2: ( ( rule__BasicType__Alternatives ) )
            // InternalDataDsl.g:732:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalDataDsl.g:733:3: ( rule__BasicType__Alternatives )
            // InternalDataDsl.g:733:4: rule__BasicType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BasicType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBasicTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "ruleStringOptionKey"
    // InternalDataDsl.g:742:1: ruleStringOptionKey : ( ( rule__StringOptionKey__Alternatives ) ) ;
    public final void ruleStringOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:746:1: ( ( ( rule__StringOptionKey__Alternatives ) ) )
            // InternalDataDsl.g:747:2: ( ( rule__StringOptionKey__Alternatives ) )
            {
            // InternalDataDsl.g:747:2: ( ( rule__StringOptionKey__Alternatives ) )
            // InternalDataDsl.g:748:3: ( rule__StringOptionKey__Alternatives )
            {
             before(grammarAccess.getStringOptionKeyAccess().getAlternatives()); 
            // InternalDataDsl.g:749:3: ( rule__StringOptionKey__Alternatives )
            // InternalDataDsl.g:749:4: rule__StringOptionKey__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__StringOptionKey__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStringOptionKeyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringOptionKey"


    // $ANTLR start "ruleIntOptionKey"
    // InternalDataDsl.g:758:1: ruleIntOptionKey : ( ( rule__IntOptionKey__Alternatives ) ) ;
    public final void ruleIntOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:762:1: ( ( ( rule__IntOptionKey__Alternatives ) ) )
            // InternalDataDsl.g:763:2: ( ( rule__IntOptionKey__Alternatives ) )
            {
            // InternalDataDsl.g:763:2: ( ( rule__IntOptionKey__Alternatives ) )
            // InternalDataDsl.g:764:3: ( rule__IntOptionKey__Alternatives )
            {
             before(grammarAccess.getIntOptionKeyAccess().getAlternatives()); 
            // InternalDataDsl.g:765:3: ( rule__IntOptionKey__Alternatives )
            // InternalDataDsl.g:765:4: rule__IntOptionKey__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntOptionKey__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntOptionKeyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntOptionKey"


    // $ANTLR start "ruleDoubleOptionKey"
    // InternalDataDsl.g:774:1: ruleDoubleOptionKey : ( ( rule__DoubleOptionKey__Alternatives ) ) ;
    public final void ruleDoubleOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:778:1: ( ( ( rule__DoubleOptionKey__Alternatives ) ) )
            // InternalDataDsl.g:779:2: ( ( rule__DoubleOptionKey__Alternatives ) )
            {
            // InternalDataDsl.g:779:2: ( ( rule__DoubleOptionKey__Alternatives ) )
            // InternalDataDsl.g:780:3: ( rule__DoubleOptionKey__Alternatives )
            {
             before(grammarAccess.getDoubleOptionKeyAccess().getAlternatives()); 
            // InternalDataDsl.g:781:3: ( rule__DoubleOptionKey__Alternatives )
            // InternalDataDsl.g:781:4: rule__DoubleOptionKey__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DoubleOptionKey__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDoubleOptionKeyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleOptionKey"


    // $ANTLR start "ruleBooleanOptionKey"
    // InternalDataDsl.g:790:1: ruleBooleanOptionKey : ( ( 'nullable' ) ) ;
    public final void ruleBooleanOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:794:1: ( ( ( 'nullable' ) ) )
            // InternalDataDsl.g:795:2: ( ( 'nullable' ) )
            {
            // InternalDataDsl.g:795:2: ( ( 'nullable' ) )
            // InternalDataDsl.g:796:3: ( 'nullable' )
            {
             before(grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration()); 
            // InternalDataDsl.g:797:3: ( 'nullable' )
            // InternalDataDsl.g:797:4: 'nullable'
            {
            match(input,16,FOLLOW_2); 

            }

             after(grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanOptionKey"


    // $ANTLR start "ruleDataOptionKey"
    // InternalDataDsl.g:806:1: ruleDataOptionKey : ( ( rule__DataOptionKey__Alternatives ) ) ;
    public final void ruleDataOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:810:1: ( ( ( rule__DataOptionKey__Alternatives ) ) )
            // InternalDataDsl.g:811:2: ( ( rule__DataOptionKey__Alternatives ) )
            {
            // InternalDataDsl.g:811:2: ( ( rule__DataOptionKey__Alternatives ) )
            // InternalDataDsl.g:812:3: ( rule__DataOptionKey__Alternatives )
            {
             before(grammarAccess.getDataOptionKeyAccess().getAlternatives()); 
            // InternalDataDsl.g:813:3: ( rule__DataOptionKey__Alternatives )
            // InternalDataDsl.g:813:4: rule__DataOptionKey__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataOptionKey__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataOptionKeyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataOptionKey"


    // $ANTLR start "ruleFormat"
    // InternalDataDsl.g:822:1: ruleFormat : ( ( rule__Format__Alternatives ) ) ;
    public final void ruleFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:826:1: ( ( ( rule__Format__Alternatives ) ) )
            // InternalDataDsl.g:827:2: ( ( rule__Format__Alternatives ) )
            {
            // InternalDataDsl.g:827:2: ( ( rule__Format__Alternatives ) )
            // InternalDataDsl.g:828:3: ( rule__Format__Alternatives )
            {
             before(grammarAccess.getFormatAccess().getAlternatives()); 
            // InternalDataDsl.g:829:3: ( rule__Format__Alternatives )
            // InternalDataDsl.g:829:4: rule__Format__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Format__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormat"


    // $ANTLR start "rule__DataModelElement__Alternatives"
    // InternalDataDsl.g:837:1: rule__DataModelElement__Alternatives : ( ( ruleImport ) | ( rulePackageDeclaration ) | ( ruleDataPackableDescription ) | ( ruleDataSourceDescription ) );
    public final void rule__DataModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:841:1: ( ( ruleImport ) | ( rulePackageDeclaration ) | ( ruleDataPackableDescription ) | ( ruleDataSourceDescription ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt1=1;
                }
                break;
            case 60:
                {
                alt1=2;
                }
                break;
            case 23:
            case 71:
            case 72:
            case 73:
            case 74:
                {
                alt1=3;
                }
                break;
            case 69:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDataDsl.g:842:2: ( ruleImport )
                    {
                    // InternalDataDsl.g:842:2: ( ruleImport )
                    // InternalDataDsl.g:843:3: ruleImport
                    {
                     before(grammarAccess.getDataModelElementAccess().getImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getDataModelElementAccess().getImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:848:2: ( rulePackageDeclaration )
                    {
                    // InternalDataDsl.g:848:2: ( rulePackageDeclaration )
                    // InternalDataDsl.g:849:3: rulePackageDeclaration
                    {
                     before(grammarAccess.getDataModelElementAccess().getPackageDeclarationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getDataModelElementAccess().getPackageDeclarationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:854:2: ( ruleDataPackableDescription )
                    {
                    // InternalDataDsl.g:854:2: ( ruleDataPackableDescription )
                    // InternalDataDsl.g:855:3: ruleDataPackableDescription
                    {
                     before(grammarAccess.getDataModelElementAccess().getDataPackableDescriptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataPackableDescription();

                    state._fsp--;

                     after(grammarAccess.getDataModelElementAccess().getDataPackableDescriptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:860:2: ( ruleDataSourceDescription )
                    {
                    // InternalDataDsl.g:860:2: ( ruleDataSourceDescription )
                    // InternalDataDsl.g:861:3: ruleDataSourceDescription
                    {
                     before(grammarAccess.getDataModelElementAccess().getDataSourceDescriptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDataSourceDescription();

                    state._fsp--;

                     after(grammarAccess.getDataModelElementAccess().getDataSourceDescriptionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModelElement__Alternatives"


    // $ANTLR start "rule__DataPackableDescription__Alternatives"
    // InternalDataDsl.g:870:1: rule__DataPackableDescription__Alternatives : ( ( ruleStringConcept ) | ( ruleTypeSpecification ) | ( ruleDataFragment ) );
    public final void rule__DataPackableDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:874:1: ( ( ruleStringConcept ) | ( ruleTypeSpecification ) | ( ruleDataFragment ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt2=1;
                }
                break;
            case 72:
            case 73:
            case 74:
                {
                alt2=2;
                }
                break;
            case 71:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDataDsl.g:875:2: ( ruleStringConcept )
                    {
                    // InternalDataDsl.g:875:2: ( ruleStringConcept )
                    // InternalDataDsl.g:876:3: ruleStringConcept
                    {
                     before(grammarAccess.getDataPackableDescriptionAccess().getStringConceptParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringConcept();

                    state._fsp--;

                     after(grammarAccess.getDataPackableDescriptionAccess().getStringConceptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:881:2: ( ruleTypeSpecification )
                    {
                    // InternalDataDsl.g:881:2: ( ruleTypeSpecification )
                    // InternalDataDsl.g:882:3: ruleTypeSpecification
                    {
                     before(grammarAccess.getDataPackableDescriptionAccess().getTypeSpecificationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeSpecification();

                    state._fsp--;

                     after(grammarAccess.getDataPackableDescriptionAccess().getTypeSpecificationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:887:2: ( ruleDataFragment )
                    {
                    // InternalDataDsl.g:887:2: ( ruleDataFragment )
                    // InternalDataDsl.g:888:3: ruleDataFragment
                    {
                     before(grammarAccess.getDataPackableDescriptionAccess().getDataFragmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataFragment();

                    state._fsp--;

                     after(grammarAccess.getDataPackableDescriptionAccess().getDataFragmentParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataPackableDescription__Alternatives"


    // $ANTLR start "rule__SubstringConcept__Alternatives"
    // InternalDataDsl.g:897:1: rule__SubstringConcept__Alternatives : ( ( ruleCharacter ) | ( ruleSubstring ) );
    public final void rule__SubstringConcept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:901:1: ( ( ruleCharacter ) | ( ruleSubstring ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=17 && LA3_0<=18)) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=19 && LA3_0<=22)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataDsl.g:902:2: ( ruleCharacter )
                    {
                    // InternalDataDsl.g:902:2: ( ruleCharacter )
                    // InternalDataDsl.g:903:3: ruleCharacter
                    {
                     before(grammarAccess.getSubstringConceptAccess().getCharacterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCharacter();

                    state._fsp--;

                     after(grammarAccess.getSubstringConceptAccess().getCharacterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:908:2: ( ruleSubstring )
                    {
                    // InternalDataDsl.g:908:2: ( ruleSubstring )
                    // InternalDataDsl.g:909:3: ruleSubstring
                    {
                     before(grammarAccess.getSubstringConceptAccess().getSubstringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSubstring();

                    state._fsp--;

                     after(grammarAccess.getSubstringConceptAccess().getSubstringParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubstringConcept__Alternatives"


    // $ANTLR start "rule__TypeSpecification__Alternatives"
    // InternalDataDsl.g:918:1: rule__TypeSpecification__Alternatives : ( ( ruleDataType ) | ( ruleEnumeration ) | ( ruleStructDataType ) );
    public final void rule__TypeSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:922:1: ( ( ruleDataType ) | ( ruleEnumeration ) | ( ruleStructDataType ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt4=1;
                }
                break;
            case 73:
                {
                alt4=2;
                }
                break;
            case 74:
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
                    // InternalDataDsl.g:923:2: ( ruleDataType )
                    {
                    // InternalDataDsl.g:923:2: ( ruleDataType )
                    // InternalDataDsl.g:924:3: ruleDataType
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:929:2: ( ruleEnumeration )
                    {
                    // InternalDataDsl.g:929:2: ( ruleEnumeration )
                    // InternalDataDsl.g:930:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getEnumerationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:935:2: ( ruleStructDataType )
                    {
                    // InternalDataDsl.g:935:2: ( ruleStructDataType )
                    // InternalDataDsl.g:936:3: ruleStructDataType
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getStructDataTypeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStructDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getStructDataTypeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeSpecification__Alternatives"


    // $ANTLR start "rule__LeafNode__Alternatives_0"
    // InternalDataDsl.g:945:1: rule__LeafNode__Alternatives_0 : ( ( ( rule__LeafNode__KeyAssignment_0_0 ) ) | ( ( rule__LeafNode__UniqueAssignment_0_1 ) ) | ( ( rule__LeafNode__ListAssignment_0_2 ) ) );
    public final void rule__LeafNode__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:949:1: ( ( ( rule__LeafNode__KeyAssignment_0_0 ) ) | ( ( rule__LeafNode__UniqueAssignment_0_1 ) ) | ( ( rule__LeafNode__ListAssignment_0_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt5=1;
                }
                break;
            case 76:
                {
                alt5=2;
                }
                break;
            case 77:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDataDsl.g:950:2: ( ( rule__LeafNode__KeyAssignment_0_0 ) )
                    {
                    // InternalDataDsl.g:950:2: ( ( rule__LeafNode__KeyAssignment_0_0 ) )
                    // InternalDataDsl.g:951:3: ( rule__LeafNode__KeyAssignment_0_0 )
                    {
                     before(grammarAccess.getLeafNodeAccess().getKeyAssignment_0_0()); 
                    // InternalDataDsl.g:952:3: ( rule__LeafNode__KeyAssignment_0_0 )
                    // InternalDataDsl.g:952:4: rule__LeafNode__KeyAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__KeyAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLeafNodeAccess().getKeyAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:956:2: ( ( rule__LeafNode__UniqueAssignment_0_1 ) )
                    {
                    // InternalDataDsl.g:956:2: ( ( rule__LeafNode__UniqueAssignment_0_1 ) )
                    // InternalDataDsl.g:957:3: ( rule__LeafNode__UniqueAssignment_0_1 )
                    {
                     before(grammarAccess.getLeafNodeAccess().getUniqueAssignment_0_1()); 
                    // InternalDataDsl.g:958:3: ( rule__LeafNode__UniqueAssignment_0_1 )
                    // InternalDataDsl.g:958:4: rule__LeafNode__UniqueAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__UniqueAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLeafNodeAccess().getUniqueAssignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:962:2: ( ( rule__LeafNode__ListAssignment_0_2 ) )
                    {
                    // InternalDataDsl.g:962:2: ( ( rule__LeafNode__ListAssignment_0_2 ) )
                    // InternalDataDsl.g:963:3: ( rule__LeafNode__ListAssignment_0_2 )
                    {
                     before(grammarAccess.getLeafNodeAccess().getListAssignment_0_2()); 
                    // InternalDataDsl.g:964:3: ( rule__LeafNode__ListAssignment_0_2 )
                    // InternalDataDsl.g:964:4: rule__LeafNode__ListAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__ListAssignment_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLeafNodeAccess().getListAssignment_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Alternatives_0"


    // $ANTLR start "rule__LeafNode__Alternatives_1"
    // InternalDataDsl.g:972:1: rule__LeafNode__Alternatives_1 : ( ( ( rule__LeafNode__TypeAssignment_1_0 ) ) | ( ( rule__LeafNode__TypeCallAssignment_1_1 ) ) );
    public final void rule__LeafNode__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:976:1: ( ( ( rule__LeafNode__TypeAssignment_1_0 ) ) | ( ( rule__LeafNode__TypeCallAssignment_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=23 && LA6_0<=34)) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDataDsl.g:977:2: ( ( rule__LeafNode__TypeAssignment_1_0 ) )
                    {
                    // InternalDataDsl.g:977:2: ( ( rule__LeafNode__TypeAssignment_1_0 ) )
                    // InternalDataDsl.g:978:3: ( rule__LeafNode__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getLeafNodeAccess().getTypeAssignment_1_0()); 
                    // InternalDataDsl.g:979:3: ( rule__LeafNode__TypeAssignment_1_0 )
                    // InternalDataDsl.g:979:4: rule__LeafNode__TypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__TypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLeafNodeAccess().getTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:983:2: ( ( rule__LeafNode__TypeCallAssignment_1_1 ) )
                    {
                    // InternalDataDsl.g:983:2: ( ( rule__LeafNode__TypeCallAssignment_1_1 ) )
                    // InternalDataDsl.g:984:3: ( rule__LeafNode__TypeCallAssignment_1_1 )
                    {
                     before(grammarAccess.getLeafNodeAccess().getTypeCallAssignment_1_1()); 
                    // InternalDataDsl.g:985:3: ( rule__LeafNode__TypeCallAssignment_1_1 )
                    // InternalDataDsl.g:985:4: rule__LeafNode__TypeCallAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__TypeCallAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLeafNodeAccess().getTypeCallAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Alternatives_1"


    // $ANTLR start "rule__Option__Alternatives"
    // InternalDataDsl.g:993:1: rule__Option__Alternatives : ( ( ruleStringOption ) | ( ruleIntOption ) | ( ruleBooleanOption ) | ( ruleSequenceOption ) | ( ruleDoubleOption ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:997:1: ( ( ruleStringOption ) | ( ruleIntOption ) | ( ruleBooleanOption ) | ( ruleSequenceOption ) | ( ruleDoubleOption ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt7=1;
                }
                break;
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 15:
                {
                alt7=4;
                }
                break;
            case 49:
            case 50:
            case 51:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDataDsl.g:998:2: ( ruleStringOption )
                    {
                    // InternalDataDsl.g:998:2: ( ruleStringOption )
                    // InternalDataDsl.g:999:3: ruleStringOption
                    {
                     before(grammarAccess.getOptionAccess().getStringOptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getStringOptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1004:2: ( ruleIntOption )
                    {
                    // InternalDataDsl.g:1004:2: ( ruleIntOption )
                    // InternalDataDsl.g:1005:3: ruleIntOption
                    {
                     before(grammarAccess.getOptionAccess().getIntOptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getIntOptionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1010:2: ( ruleBooleanOption )
                    {
                    // InternalDataDsl.g:1010:2: ( ruleBooleanOption )
                    // InternalDataDsl.g:1011:3: ruleBooleanOption
                    {
                     before(grammarAccess.getOptionAccess().getBooleanOptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getBooleanOptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1016:2: ( ruleSequenceOption )
                    {
                    // InternalDataDsl.g:1016:2: ( ruleSequenceOption )
                    // InternalDataDsl.g:1017:3: ruleSequenceOption
                    {
                     before(grammarAccess.getOptionAccess().getSequenceOptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSequenceOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getSequenceOptionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1022:2: ( ruleDoubleOption )
                    {
                    // InternalDataDsl.g:1022:2: ( ruleDoubleOption )
                    // InternalDataDsl.g:1023:3: ruleDoubleOption
                    {
                     before(grammarAccess.getOptionAccess().getDoubleOptionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getDoubleOptionParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Alternatives"


    // $ANTLR start "rule__TypeCharacter__Alternatives"
    // InternalDataDsl.g:1032:1: rule__TypeCharacter__Alternatives : ( ( ( 'char' ) ) | ( ( 'digit' ) ) );
    public final void rule__TypeCharacter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1036:1: ( ( ( 'char' ) ) | ( ( 'digit' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==18) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataDsl.g:1037:2: ( ( 'char' ) )
                    {
                    // InternalDataDsl.g:1037:2: ( ( 'char' ) )
                    // InternalDataDsl.g:1038:3: ( 'char' )
                    {
                     before(grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1039:3: ( 'char' )
                    // InternalDataDsl.g:1039:4: 'char'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1043:2: ( ( 'digit' ) )
                    {
                    // InternalDataDsl.g:1043:2: ( ( 'digit' ) )
                    // InternalDataDsl.g:1044:3: ( 'digit' )
                    {
                     before(grammarAccess.getTypeCharacterAccess().getDigitEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1045:3: ( 'digit' )
                    // InternalDataDsl.g:1045:4: 'digit'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeCharacterAccess().getDigitEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCharacter__Alternatives"


    // $ANTLR start "rule__TypeString__Alternatives"
    // InternalDataDsl.g:1053:1: rule__TypeString__Alternatives : ( ( ( 'anycase_string' ) ) | ( ( 'lowercase_string' ) ) | ( ( 'uppercase_string' ) ) | ( ( 'digits' ) ) );
    public final void rule__TypeString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1057:1: ( ( ( 'anycase_string' ) ) | ( ( 'lowercase_string' ) ) | ( ( 'uppercase_string' ) ) | ( ( 'digits' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt9=1;
                }
                break;
            case 20:
                {
                alt9=2;
                }
                break;
            case 21:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDataDsl.g:1058:2: ( ( 'anycase_string' ) )
                    {
                    // InternalDataDsl.g:1058:2: ( ( 'anycase_string' ) )
                    // InternalDataDsl.g:1059:3: ( 'anycase_string' )
                    {
                     before(grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1060:3: ( 'anycase_string' )
                    // InternalDataDsl.g:1060:4: 'anycase_string'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1064:2: ( ( 'lowercase_string' ) )
                    {
                    // InternalDataDsl.g:1064:2: ( ( 'lowercase_string' ) )
                    // InternalDataDsl.g:1065:3: ( 'lowercase_string' )
                    {
                     before(grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1066:3: ( 'lowercase_string' )
                    // InternalDataDsl.g:1066:4: 'lowercase_string'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1070:2: ( ( 'uppercase_string' ) )
                    {
                    // InternalDataDsl.g:1070:2: ( ( 'uppercase_string' ) )
                    // InternalDataDsl.g:1071:3: ( 'uppercase_string' )
                    {
                     before(grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1072:3: ( 'uppercase_string' )
                    // InternalDataDsl.g:1072:4: 'uppercase_string'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1076:2: ( ( 'digits' ) )
                    {
                    // InternalDataDsl.g:1076:2: ( ( 'digits' ) )
                    // InternalDataDsl.g:1077:3: ( 'digits' )
                    {
                     before(grammarAccess.getTypeStringAccess().getNumbersEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1078:3: ( 'digits' )
                    // InternalDataDsl.g:1078:4: 'digits'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getNumbersEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeString__Alternatives"


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalDataDsl.g:1086:1: rule__BasicType__Alternatives : ( ( ( 'string' ) ) | ( ( 'url' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'year' ) ) | ( ( 'month' ) ) | ( ( 'day' ) ) | ( ( 'boolean' ) ) | ( ( 'lat' ) ) | ( ( 'long' ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1090:1: ( ( ( 'string' ) ) | ( ( 'url' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'year' ) ) | ( ( 'month' ) ) | ( ( 'day' ) ) | ( ( 'boolean' ) ) | ( ( 'lat' ) ) | ( ( 'long' ) ) )
            int alt10=12;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=3;
                }
                break;
            case 26:
                {
                alt10=4;
                }
                break;
            case 27:
                {
                alt10=5;
                }
                break;
            case 28:
                {
                alt10=6;
                }
                break;
            case 29:
                {
                alt10=7;
                }
                break;
            case 30:
                {
                alt10=8;
                }
                break;
            case 31:
                {
                alt10=9;
                }
                break;
            case 32:
                {
                alt10=10;
                }
                break;
            case 33:
                {
                alt10=11;
                }
                break;
            case 34:
                {
                alt10=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDataDsl.g:1091:2: ( ( 'string' ) )
                    {
                    // InternalDataDsl.g:1091:2: ( ( 'string' ) )
                    // InternalDataDsl.g:1092:3: ( 'string' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1093:3: ( 'string' )
                    // InternalDataDsl.g:1093:4: 'string'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1097:2: ( ( 'url' ) )
                    {
                    // InternalDataDsl.g:1097:2: ( ( 'url' ) )
                    // InternalDataDsl.g:1098:3: ( 'url' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1099:3: ( 'url' )
                    // InternalDataDsl.g:1099:4: 'url'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1103:2: ( ( 'int' ) )
                    {
                    // InternalDataDsl.g:1103:2: ( ( 'int' ) )
                    // InternalDataDsl.g:1104:3: ( 'int' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1105:3: ( 'int' )
                    // InternalDataDsl.g:1105:4: 'int'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1109:2: ( ( 'real' ) )
                    {
                    // InternalDataDsl.g:1109:2: ( ( 'real' ) )
                    // InternalDataDsl.g:1110:3: ( 'real' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1111:3: ( 'real' )
                    // InternalDataDsl.g:1111:4: 'real'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1115:2: ( ( 'date' ) )
                    {
                    // InternalDataDsl.g:1115:2: ( ( 'date' ) )
                    // InternalDataDsl.g:1116:3: ( 'date' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:1117:3: ( 'date' )
                    // InternalDataDsl.g:1117:4: 'date'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:1121:2: ( ( 'time' ) )
                    {
                    // InternalDataDsl.g:1121:2: ( ( 'time' ) )
                    // InternalDataDsl.g:1122:3: ( 'time' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:1123:3: ( 'time' )
                    // InternalDataDsl.g:1123:4: 'time'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:1127:2: ( ( 'year' ) )
                    {
                    // InternalDataDsl.g:1127:2: ( ( 'year' ) )
                    // InternalDataDsl.g:1128:3: ( 'year' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:1129:3: ( 'year' )
                    // InternalDataDsl.g:1129:4: 'year'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:1133:2: ( ( 'month' ) )
                    {
                    // InternalDataDsl.g:1133:2: ( ( 'month' ) )
                    // InternalDataDsl.g:1134:3: ( 'month' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:1135:3: ( 'month' )
                    // InternalDataDsl.g:1135:4: 'month'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:1139:2: ( ( 'day' ) )
                    {
                    // InternalDataDsl.g:1139:2: ( ( 'day' ) )
                    // InternalDataDsl.g:1140:3: ( 'day' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_8()); 
                    // InternalDataDsl.g:1141:3: ( 'day' )
                    // InternalDataDsl.g:1141:4: 'day'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:1145:2: ( ( 'boolean' ) )
                    {
                    // InternalDataDsl.g:1145:2: ( ( 'boolean' ) )
                    // InternalDataDsl.g:1146:3: ( 'boolean' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_9()); 
                    // InternalDataDsl.g:1147:3: ( 'boolean' )
                    // InternalDataDsl.g:1147:4: 'boolean'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:1151:2: ( ( 'lat' ) )
                    {
                    // InternalDataDsl.g:1151:2: ( ( 'lat' ) )
                    // InternalDataDsl.g:1152:3: ( 'lat' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_10()); 
                    // InternalDataDsl.g:1153:3: ( 'lat' )
                    // InternalDataDsl.g:1153:4: 'lat'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDsl.g:1157:2: ( ( 'long' ) )
                    {
                    // InternalDataDsl.g:1157:2: ( ( 'long' ) )
                    // InternalDataDsl.g:1158:3: ( 'long' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_11()); 
                    // InternalDataDsl.g:1159:3: ( 'long' )
                    // InternalDataDsl.g:1159:4: 'long'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BasicType__Alternatives"


    // $ANTLR start "rule__StringOptionKey__Alternatives"
    // InternalDataDsl.g:1167:1: rule__StringOptionKey__Alternatives : ( ( ( 'casesensitive' ) ) | ( ( 'null' ) ) | ( ( 'separator' ) ) | ( ( 'default' ) ) | ( ( 'regex' ) ) | ( ( 'flags' ) ) | ( ( 'decimalchar' ) ) | ( ( 'pattern' ) ) | ( ( 'format' ) ) );
    public final void rule__StringOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1171:1: ( ( ( 'casesensitive' ) ) | ( ( 'null' ) ) | ( ( 'separator' ) ) | ( ( 'default' ) ) | ( ( 'regex' ) ) | ( ( 'flags' ) ) | ( ( 'decimalchar' ) ) | ( ( 'pattern' ) ) | ( ( 'format' ) ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt11=1;
                }
                break;
            case 36:
                {
                alt11=2;
                }
                break;
            case 37:
                {
                alt11=3;
                }
                break;
            case 38:
                {
                alt11=4;
                }
                break;
            case 39:
                {
                alt11=5;
                }
                break;
            case 40:
                {
                alt11=6;
                }
                break;
            case 41:
                {
                alt11=7;
                }
                break;
            case 42:
                {
                alt11=8;
                }
                break;
            case 43:
                {
                alt11=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDataDsl.g:1172:2: ( ( 'casesensitive' ) )
                    {
                    // InternalDataDsl.g:1172:2: ( ( 'casesensitive' ) )
                    // InternalDataDsl.g:1173:3: ( 'casesensitive' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1174:3: ( 'casesensitive' )
                    // InternalDataDsl.g:1174:4: 'casesensitive'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1178:2: ( ( 'null' ) )
                    {
                    // InternalDataDsl.g:1178:2: ( ( 'null' ) )
                    // InternalDataDsl.g:1179:3: ( 'null' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1180:3: ( 'null' )
                    // InternalDataDsl.g:1180:4: 'null'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1184:2: ( ( 'separator' ) )
                    {
                    // InternalDataDsl.g:1184:2: ( ( 'separator' ) )
                    // InternalDataDsl.g:1185:3: ( 'separator' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1186:3: ( 'separator' )
                    // InternalDataDsl.g:1186:4: 'separator'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1190:2: ( ( 'default' ) )
                    {
                    // InternalDataDsl.g:1190:2: ( ( 'default' ) )
                    // InternalDataDsl.g:1191:3: ( 'default' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1192:3: ( 'default' )
                    // InternalDataDsl.g:1192:4: 'default'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1196:2: ( ( 'regex' ) )
                    {
                    // InternalDataDsl.g:1196:2: ( ( 'regex' ) )
                    // InternalDataDsl.g:1197:3: ( 'regex' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:1198:3: ( 'regex' )
                    // InternalDataDsl.g:1198:4: 'regex'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:1202:2: ( ( 'flags' ) )
                    {
                    // InternalDataDsl.g:1202:2: ( ( 'flags' ) )
                    // InternalDataDsl.g:1203:3: ( 'flags' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:1204:3: ( 'flags' )
                    // InternalDataDsl.g:1204:4: 'flags'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:1208:2: ( ( 'decimalchar' ) )
                    {
                    // InternalDataDsl.g:1208:2: ( ( 'decimalchar' ) )
                    // InternalDataDsl.g:1209:3: ( 'decimalchar' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:1210:3: ( 'decimalchar' )
                    // InternalDataDsl.g:1210:4: 'decimalchar'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:1214:2: ( ( 'pattern' ) )
                    {
                    // InternalDataDsl.g:1214:2: ( ( 'pattern' ) )
                    // InternalDataDsl.g:1215:3: ( 'pattern' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:1216:3: ( 'pattern' )
                    // InternalDataDsl.g:1216:4: 'pattern'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:1220:2: ( ( 'format' ) )
                    {
                    // InternalDataDsl.g:1220:2: ( ( 'format' ) )
                    // InternalDataDsl.g:1221:3: ( 'format' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getFormatEnumLiteralDeclaration_8()); 
                    // InternalDataDsl.g:1222:3: ( 'format' )
                    // InternalDataDsl.g:1222:4: 'format'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getFormatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOptionKey__Alternatives"


    // $ANTLR start "rule__IntOptionKey__Alternatives"
    // InternalDataDsl.g:1230:1: rule__IntOptionKey__Alternatives : ( ( ( 'minLength' ) ) | ( ( 'maxLength' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'defaultvalue' ) ) );
    public final void rule__IntOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1234:1: ( ( ( 'minLength' ) ) | ( ( 'maxLength' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'defaultvalue' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt12=1;
                }
                break;
            case 45:
                {
                alt12=2;
                }
                break;
            case 46:
                {
                alt12=3;
                }
                break;
            case 47:
                {
                alt12=4;
                }
                break;
            case 48:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDataDsl.g:1235:2: ( ( 'minLength' ) )
                    {
                    // InternalDataDsl.g:1235:2: ( ( 'minLength' ) )
                    // InternalDataDsl.g:1236:3: ( 'minLength' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1237:3: ( 'minLength' )
                    // InternalDataDsl.g:1237:4: 'minLength'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1241:2: ( ( 'maxLength' ) )
                    {
                    // InternalDataDsl.g:1241:2: ( ( 'maxLength' ) )
                    // InternalDataDsl.g:1242:3: ( 'maxLength' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1243:3: ( 'maxLength' )
                    // InternalDataDsl.g:1243:4: 'maxLength'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1247:2: ( ( 'min' ) )
                    {
                    // InternalDataDsl.g:1247:2: ( ( 'min' ) )
                    // InternalDataDsl.g:1248:3: ( 'min' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1249:3: ( 'min' )
                    // InternalDataDsl.g:1249:4: 'min'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1253:2: ( ( 'max' ) )
                    {
                    // InternalDataDsl.g:1253:2: ( ( 'max' ) )
                    // InternalDataDsl.g:1254:3: ( 'max' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1255:3: ( 'max' )
                    // InternalDataDsl.g:1255:4: 'max'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1259:2: ( ( 'defaultvalue' ) )
                    {
                    // InternalDataDsl.g:1259:2: ( ( 'defaultvalue' ) )
                    // InternalDataDsl.g:1260:3: ( 'defaultvalue' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getDefaultEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:1261:3: ( 'defaultvalue' )
                    // InternalDataDsl.g:1261:4: 'defaultvalue'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getDefaultEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOptionKey__Alternatives"


    // $ANTLR start "rule__DoubleOptionKey__Alternatives"
    // InternalDataDsl.g:1269:1: rule__DoubleOptionKey__Alternatives : ( ( ( 'minDouble' ) ) | ( ( 'maxDouble' ) ) | ( ( 'defaultvalueDouble' ) ) );
    public final void rule__DoubleOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1273:1: ( ( ( 'minDouble' ) ) | ( ( 'maxDouble' ) ) | ( ( 'defaultvalueDouble' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt13=1;
                }
                break;
            case 50:
                {
                alt13=2;
                }
                break;
            case 51:
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
                    // InternalDataDsl.g:1274:2: ( ( 'minDouble' ) )
                    {
                    // InternalDataDsl.g:1274:2: ( ( 'minDouble' ) )
                    // InternalDataDsl.g:1275:3: ( 'minDouble' )
                    {
                     before(grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1276:3: ( 'minDouble' )
                    // InternalDataDsl.g:1276:4: 'minDouble'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1280:2: ( ( 'maxDouble' ) )
                    {
                    // InternalDataDsl.g:1280:2: ( ( 'maxDouble' ) )
                    // InternalDataDsl.g:1281:3: ( 'maxDouble' )
                    {
                     before(grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1282:3: ( 'maxDouble' )
                    // InternalDataDsl.g:1282:4: 'maxDouble'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1286:2: ( ( 'defaultvalueDouble' ) )
                    {
                    // InternalDataDsl.g:1286:2: ( ( 'defaultvalueDouble' ) )
                    // InternalDataDsl.g:1287:3: ( 'defaultvalueDouble' )
                    {
                     before(grammarAccess.getDoubleOptionKeyAccess().getDefaultEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1288:3: ( 'defaultvalueDouble' )
                    // InternalDataDsl.g:1288:4: 'defaultvalueDouble'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoubleOptionKeyAccess().getDefaultEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleOptionKey__Alternatives"


    // $ANTLR start "rule__DataOptionKey__Alternatives"
    // InternalDataDsl.g:1296:1: rule__DataOptionKey__Alternatives : ( ( ( 'format' ) ) | ( ( 'separator' ) ) | ( ( 'header' ) ) | ( ( 'squema' ) ) );
    public final void rule__DataOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1300:1: ( ( ( 'format' ) ) | ( ( 'separator' ) ) | ( ( 'header' ) ) | ( ( 'squema' ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt14=1;
                }
                break;
            case 37:
                {
                alt14=2;
                }
                break;
            case 52:
                {
                alt14=3;
                }
                break;
            case 53:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDataDsl.g:1301:2: ( ( 'format' ) )
                    {
                    // InternalDataDsl.g:1301:2: ( ( 'format' ) )
                    // InternalDataDsl.g:1302:3: ( 'format' )
                    {
                     before(grammarAccess.getDataOptionKeyAccess().getFormatEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1303:3: ( 'format' )
                    // InternalDataDsl.g:1303:4: 'format'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataOptionKeyAccess().getFormatEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1307:2: ( ( 'separator' ) )
                    {
                    // InternalDataDsl.g:1307:2: ( ( 'separator' ) )
                    // InternalDataDsl.g:1308:3: ( 'separator' )
                    {
                     before(grammarAccess.getDataOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1309:3: ( 'separator' )
                    // InternalDataDsl.g:1309:4: 'separator'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1313:2: ( ( 'header' ) )
                    {
                    // InternalDataDsl.g:1313:2: ( ( 'header' ) )
                    // InternalDataDsl.g:1314:3: ( 'header' )
                    {
                     before(grammarAccess.getDataOptionKeyAccess().getHeaderEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1315:3: ( 'header' )
                    // InternalDataDsl.g:1315:4: 'header'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataOptionKeyAccess().getHeaderEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1319:2: ( ( 'squema' ) )
                    {
                    // InternalDataDsl.g:1319:2: ( ( 'squema' ) )
                    // InternalDataDsl.g:1320:3: ( 'squema' )
                    {
                     before(grammarAccess.getDataOptionKeyAccess().getSquemaEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1321:3: ( 'squema' )
                    // InternalDataDsl.g:1321:4: 'squema'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataOptionKeyAccess().getSquemaEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOptionKey__Alternatives"


    // $ANTLR start "rule__Format__Alternatives"
    // InternalDataDsl.g:1329:1: rule__Format__Alternatives : ( ( ( 'CSV' ) ) | ( ( 'JSON' ) ) | ( ( 'XML' ) ) );
    public final void rule__Format__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1333:1: ( ( ( 'CSV' ) ) | ( ( 'JSON' ) ) | ( ( 'XML' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt15=1;
                }
                break;
            case 55:
                {
                alt15=2;
                }
                break;
            case 56:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalDataDsl.g:1334:2: ( ( 'CSV' ) )
                    {
                    // InternalDataDsl.g:1334:2: ( ( 'CSV' ) )
                    // InternalDataDsl.g:1335:3: ( 'CSV' )
                    {
                     before(grammarAccess.getFormatAccess().getCSVEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1336:3: ( 'CSV' )
                    // InternalDataDsl.g:1336:4: 'CSV'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatAccess().getCSVEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1340:2: ( ( 'JSON' ) )
                    {
                    // InternalDataDsl.g:1340:2: ( ( 'JSON' ) )
                    // InternalDataDsl.g:1341:3: ( 'JSON' )
                    {
                     before(grammarAccess.getFormatAccess().getJSONEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1342:3: ( 'JSON' )
                    // InternalDataDsl.g:1342:4: 'JSON'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatAccess().getJSONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1346:2: ( ( 'XML' ) )
                    {
                    // InternalDataDsl.g:1346:2: ( ( 'XML' ) )
                    // InternalDataDsl.g:1347:3: ( 'XML' )
                    {
                     before(grammarAccess.getFormatAccess().getXMLEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1348:3: ( 'XML' )
                    // InternalDataDsl.g:1348:4: 'XML'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatAccess().getXMLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Format__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // InternalDataDsl.g:1356:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1360:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalDataDsl.g:1361:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DataModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0"


    // $ANTLR start "rule__DataModel__Group__0__Impl"
    // InternalDataDsl.g:1368:1: rule__DataModel__Group__0__Impl : ( ( rule__DataModel__DescriptionsAssignment_0 ) ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1372:1: ( ( ( rule__DataModel__DescriptionsAssignment_0 ) ) )
            // InternalDataDsl.g:1373:1: ( ( rule__DataModel__DescriptionsAssignment_0 ) )
            {
            // InternalDataDsl.g:1373:1: ( ( rule__DataModel__DescriptionsAssignment_0 ) )
            // InternalDataDsl.g:1374:2: ( rule__DataModel__DescriptionsAssignment_0 )
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsAssignment_0()); 
            // InternalDataDsl.g:1375:2: ( rule__DataModel__DescriptionsAssignment_0 )
            // InternalDataDsl.g:1375:3: rule__DataModel__DescriptionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__DescriptionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getDescriptionsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // InternalDataDsl.g:1383:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1387:1: ( rule__DataModel__Group__1__Impl )
            // InternalDataDsl.g:1388:2: rule__DataModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1"


    // $ANTLR start "rule__DataModel__Group__1__Impl"
    // InternalDataDsl.g:1394:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__DescriptionsAssignment_1 )* ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1398:1: ( ( ( rule__DataModel__DescriptionsAssignment_1 )* ) )
            // InternalDataDsl.g:1399:1: ( ( rule__DataModel__DescriptionsAssignment_1 )* )
            {
            // InternalDataDsl.g:1399:1: ( ( rule__DataModel__DescriptionsAssignment_1 )* )
            // InternalDataDsl.g:1400:2: ( rule__DataModel__DescriptionsAssignment_1 )*
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsAssignment_1()); 
            // InternalDataDsl.g:1401:2: ( rule__DataModel__DescriptionsAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23||LA16_0==57||LA16_0==60||LA16_0==69||(LA16_0>=71 && LA16_0<=74)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDataDsl.g:1401:3: rule__DataModel__DescriptionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataModel__DescriptionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getDescriptionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalDataDsl.g:1410:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1414:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDataDsl.g:1415:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalDataDsl.g:1422:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1426:1: ( ( 'import' ) )
            // InternalDataDsl.g:1427:1: ( 'import' )
            {
            // InternalDataDsl.g:1427:1: ( 'import' )
            // InternalDataDsl.g:1428:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalDataDsl.g:1437:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1441:1: ( rule__Import__Group__1__Impl )
            // InternalDataDsl.g:1442:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalDataDsl.g:1448:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1452:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalDataDsl.g:1453:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalDataDsl.g:1453:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalDataDsl.g:1454:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalDataDsl.g:1455:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalDataDsl.g:1455:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalDataDsl.g:1464:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1468:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalDataDsl.g:1469:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalDataDsl.g:1476:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1480:1: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:1481:1: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:1481:1: ( ruleQualifiedName )
            // InternalDataDsl.g:1482:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalDataDsl.g:1491:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1495:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalDataDsl.g:1496:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalDataDsl.g:1502:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1506:1: ( ( ( '.*' )? ) )
            // InternalDataDsl.g:1507:1: ( ( '.*' )? )
            {
            // InternalDataDsl.g:1507:1: ( ( '.*' )? )
            // InternalDataDsl.g:1508:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalDataDsl.g:1509:2: ( '.*' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==58) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalDataDsl.g:1509:3: '.*'
                    {
                    match(input,58,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalDataDsl.g:1518:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1522:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDataDsl.g:1523:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalDataDsl.g:1530:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1534:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:1535:1: ( RULE_ID )
            {
            // InternalDataDsl.g:1535:1: ( RULE_ID )
            // InternalDataDsl.g:1536:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalDataDsl.g:1545:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1549:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDataDsl.g:1550:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalDataDsl.g:1556:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1560:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDataDsl.g:1561:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDataDsl.g:1561:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDataDsl.g:1562:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalDataDsl.g:1563:2: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==59) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDataDsl.g:1563:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalDataDsl.g:1572:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1576:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDataDsl.g:1577:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalDataDsl.g:1584:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1588:1: ( ( '.' ) )
            // InternalDataDsl.g:1589:1: ( '.' )
            {
            // InternalDataDsl.g:1589:1: ( '.' )
            // InternalDataDsl.g:1590:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalDataDsl.g:1599:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1603:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDataDsl.g:1604:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalDataDsl.g:1610:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1614:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:1615:1: ( RULE_ID )
            {
            // InternalDataDsl.g:1615:1: ( RULE_ID )
            // InternalDataDsl.g:1616:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalDataDsl.g:1626:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1630:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalDataDsl.g:1631:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalDataDsl.g:1638:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1642:1: ( ( 'package' ) )
            // InternalDataDsl.g:1643:1: ( 'package' )
            {
            // InternalDataDsl.g:1643:1: ( 'package' )
            // InternalDataDsl.g:1644:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalDataDsl.g:1653:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1657:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalDataDsl.g:1658:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalDataDsl.g:1665:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1669:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalDataDsl.g:1670:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:1670:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalDataDsl.g:1671:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:1672:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalDataDsl.g:1672:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // InternalDataDsl.g:1680:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1684:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalDataDsl.g:1685:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // InternalDataDsl.g:1692:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1696:1: ( ( '{' ) )
            // InternalDataDsl.g:1697:1: ( '{' )
            {
            // InternalDataDsl.g:1697:1: ( '{' )
            // InternalDataDsl.g:1698:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // InternalDataDsl.g:1707:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1711:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalDataDsl.g:1712:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // InternalDataDsl.g:1719:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 ) ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1723:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 ) ) )
            // InternalDataDsl.g:1724:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 ) )
            {
            // InternalDataDsl.g:1724:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 ) )
            // InternalDataDsl.g:1725:2: ( rule__PackageDeclaration__ElementsAssignment_3 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalDataDsl.g:1726:2: ( rule__PackageDeclaration__ElementsAssignment_3 )
            // InternalDataDsl.g:1726:3: rule__PackageDeclaration__ElementsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__ElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // InternalDataDsl.g:1734:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1738:1: ( rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5 )
            // InternalDataDsl.g:1739:2: rule__PackageDeclaration__Group__4__Impl rule__PackageDeclaration__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__PackageDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // InternalDataDsl.g:1746:1: rule__PackageDeclaration__Group__4__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1750:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_4 )* ) )
            // InternalDataDsl.g:1751:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            {
            // InternalDataDsl.g:1751:1: ( ( rule__PackageDeclaration__ElementsAssignment_4 )* )
            // InternalDataDsl.g:1752:2: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4()); 
            // InternalDataDsl.g:1753:2: ( rule__PackageDeclaration__ElementsAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23||(LA19_0>=71 && LA19_0<=74)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDataDsl.g:1753:3: rule__PackageDeclaration__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PackageDeclaration__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__5"
    // InternalDataDsl.g:1761:1: rule__PackageDeclaration__Group__5 : rule__PackageDeclaration__Group__5__Impl ;
    public final void rule__PackageDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1765:1: ( rule__PackageDeclaration__Group__5__Impl )
            // InternalDataDsl.g:1766:2: rule__PackageDeclaration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5"


    // $ANTLR start "rule__PackageDeclaration__Group__5__Impl"
    // InternalDataDsl.g:1772:1: rule__PackageDeclaration__Group__5__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1776:1: ( ( '}' ) )
            // InternalDataDsl.g:1777:1: ( '}' )
            {
            // InternalDataDsl.g:1777:1: ( '}' )
            // InternalDataDsl.g:1778:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__Group__5__Impl"


    // $ANTLR start "rule__StringConcept__Group__0"
    // InternalDataDsl.g:1788:1: rule__StringConcept__Group__0 : rule__StringConcept__Group__0__Impl rule__StringConcept__Group__1 ;
    public final void rule__StringConcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1792:1: ( rule__StringConcept__Group__0__Impl rule__StringConcept__Group__1 )
            // InternalDataDsl.g:1793:2: rule__StringConcept__Group__0__Impl rule__StringConcept__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StringConcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcept__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__0"


    // $ANTLR start "rule__StringConcept__Group__0__Impl"
    // InternalDataDsl.g:1800:1: rule__StringConcept__Group__0__Impl : ( 'string' ) ;
    public final void rule__StringConcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1804:1: ( ( 'string' ) )
            // InternalDataDsl.g:1805:1: ( 'string' )
            {
            // InternalDataDsl.g:1805:1: ( 'string' )
            // InternalDataDsl.g:1806:2: 'string'
            {
             before(grammarAccess.getStringConceptAccess().getStringKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getStringConceptAccess().getStringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__0__Impl"


    // $ANTLR start "rule__StringConcept__Group__1"
    // InternalDataDsl.g:1815:1: rule__StringConcept__Group__1 : rule__StringConcept__Group__1__Impl rule__StringConcept__Group__2 ;
    public final void rule__StringConcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1819:1: ( rule__StringConcept__Group__1__Impl rule__StringConcept__Group__2 )
            // InternalDataDsl.g:1820:2: rule__StringConcept__Group__1__Impl rule__StringConcept__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__StringConcept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcept__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__1"


    // $ANTLR start "rule__StringConcept__Group__1__Impl"
    // InternalDataDsl.g:1827:1: rule__StringConcept__Group__1__Impl : ( ( rule__StringConcept__NameAssignment_1 ) ) ;
    public final void rule__StringConcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1831:1: ( ( ( rule__StringConcept__NameAssignment_1 ) ) )
            // InternalDataDsl.g:1832:1: ( ( rule__StringConcept__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:1832:1: ( ( rule__StringConcept__NameAssignment_1 ) )
            // InternalDataDsl.g:1833:2: ( rule__StringConcept__NameAssignment_1 )
            {
             before(grammarAccess.getStringConceptAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:1834:2: ( rule__StringConcept__NameAssignment_1 )
            // InternalDataDsl.g:1834:3: rule__StringConcept__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringConcept__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringConceptAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__1__Impl"


    // $ANTLR start "rule__StringConcept__Group__2"
    // InternalDataDsl.g:1842:1: rule__StringConcept__Group__2 : rule__StringConcept__Group__2__Impl rule__StringConcept__Group__3 ;
    public final void rule__StringConcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1846:1: ( rule__StringConcept__Group__2__Impl rule__StringConcept__Group__3 )
            // InternalDataDsl.g:1847:2: rule__StringConcept__Group__2__Impl rule__StringConcept__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__StringConcept__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcept__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__2"


    // $ANTLR start "rule__StringConcept__Group__2__Impl"
    // InternalDataDsl.g:1854:1: rule__StringConcept__Group__2__Impl : ( '=' ) ;
    public final void rule__StringConcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1858:1: ( ( '=' ) )
            // InternalDataDsl.g:1859:1: ( '=' )
            {
            // InternalDataDsl.g:1859:1: ( '=' )
            // InternalDataDsl.g:1860:2: '='
            {
             before(grammarAccess.getStringConceptAccess().getEqualsSignKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getStringConceptAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__2__Impl"


    // $ANTLR start "rule__StringConcept__Group__3"
    // InternalDataDsl.g:1869:1: rule__StringConcept__Group__3 : rule__StringConcept__Group__3__Impl rule__StringConcept__Group__4 ;
    public final void rule__StringConcept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1873:1: ( rule__StringConcept__Group__3__Impl rule__StringConcept__Group__4 )
            // InternalDataDsl.g:1874:2: rule__StringConcept__Group__3__Impl rule__StringConcept__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__StringConcept__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcept__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__3"


    // $ANTLR start "rule__StringConcept__Group__3__Impl"
    // InternalDataDsl.g:1881:1: rule__StringConcept__Group__3__Impl : ( '(' ) ;
    public final void rule__StringConcept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1885:1: ( ( '(' ) )
            // InternalDataDsl.g:1886:1: ( '(' )
            {
            // InternalDataDsl.g:1886:1: ( '(' )
            // InternalDataDsl.g:1887:2: '('
            {
             before(grammarAccess.getStringConceptAccess().getLeftParenthesisKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getStringConceptAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__3__Impl"


    // $ANTLR start "rule__StringConcept__Group__4"
    // InternalDataDsl.g:1896:1: rule__StringConcept__Group__4 : rule__StringConcept__Group__4__Impl rule__StringConcept__Group__5 ;
    public final void rule__StringConcept__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1900:1: ( rule__StringConcept__Group__4__Impl rule__StringConcept__Group__5 )
            // InternalDataDsl.g:1901:2: rule__StringConcept__Group__4__Impl rule__StringConcept__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__StringConcept__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcept__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__4"


    // $ANTLR start "rule__StringConcept__Group__4__Impl"
    // InternalDataDsl.g:1908:1: rule__StringConcept__Group__4__Impl : ( ( rule__StringConcept__Group_4__0 )? ) ;
    public final void rule__StringConcept__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1912:1: ( ( ( rule__StringConcept__Group_4__0 )? ) )
            // InternalDataDsl.g:1913:1: ( ( rule__StringConcept__Group_4__0 )? )
            {
            // InternalDataDsl.g:1913:1: ( ( rule__StringConcept__Group_4__0 )? )
            // InternalDataDsl.g:1914:2: ( rule__StringConcept__Group_4__0 )?
            {
             before(grammarAccess.getStringConceptAccess().getGroup_4()); 
            // InternalDataDsl.g:1915:2: ( rule__StringConcept__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=17 && LA20_0<=22)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataDsl.g:1915:3: rule__StringConcept__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringConcept__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringConceptAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__4__Impl"


    // $ANTLR start "rule__StringConcept__Group__5"
    // InternalDataDsl.g:1923:1: rule__StringConcept__Group__5 : rule__StringConcept__Group__5__Impl ;
    public final void rule__StringConcept__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1927:1: ( rule__StringConcept__Group__5__Impl )
            // InternalDataDsl.g:1928:2: rule__StringConcept__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringConcept__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__5"


    // $ANTLR start "rule__StringConcept__Group__5__Impl"
    // InternalDataDsl.g:1934:1: rule__StringConcept__Group__5__Impl : ( ')' ) ;
    public final void rule__StringConcept__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1938:1: ( ( ')' ) )
            // InternalDataDsl.g:1939:1: ( ')' )
            {
            // InternalDataDsl.g:1939:1: ( ')' )
            // InternalDataDsl.g:1940:2: ')'
            {
             before(grammarAccess.getStringConceptAccess().getRightParenthesisKeyword_5()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getStringConceptAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group__5__Impl"


    // $ANTLR start "rule__StringConcept__Group_4__0"
    // InternalDataDsl.g:1950:1: rule__StringConcept__Group_4__0 : rule__StringConcept__Group_4__0__Impl rule__StringConcept__Group_4__1 ;
    public final void rule__StringConcept__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1954:1: ( rule__StringConcept__Group_4__0__Impl rule__StringConcept__Group_4__1 )
            // InternalDataDsl.g:1955:2: rule__StringConcept__Group_4__0__Impl rule__StringConcept__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__StringConcept__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcept__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group_4__0"


    // $ANTLR start "rule__StringConcept__Group_4__0__Impl"
    // InternalDataDsl.g:1962:1: rule__StringConcept__Group_4__0__Impl : ( ( rule__StringConcept__SubsequenceAssignment_4_0 ) ) ;
    public final void rule__StringConcept__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1966:1: ( ( ( rule__StringConcept__SubsequenceAssignment_4_0 ) ) )
            // InternalDataDsl.g:1967:1: ( ( rule__StringConcept__SubsequenceAssignment_4_0 ) )
            {
            // InternalDataDsl.g:1967:1: ( ( rule__StringConcept__SubsequenceAssignment_4_0 ) )
            // InternalDataDsl.g:1968:2: ( rule__StringConcept__SubsequenceAssignment_4_0 )
            {
             before(grammarAccess.getStringConceptAccess().getSubsequenceAssignment_4_0()); 
            // InternalDataDsl.g:1969:2: ( rule__StringConcept__SubsequenceAssignment_4_0 )
            // InternalDataDsl.g:1969:3: rule__StringConcept__SubsequenceAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__StringConcept__SubsequenceAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getStringConceptAccess().getSubsequenceAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group_4__0__Impl"


    // $ANTLR start "rule__StringConcept__Group_4__1"
    // InternalDataDsl.g:1977:1: rule__StringConcept__Group_4__1 : rule__StringConcept__Group_4__1__Impl ;
    public final void rule__StringConcept__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1981:1: ( rule__StringConcept__Group_4__1__Impl )
            // InternalDataDsl.g:1982:2: rule__StringConcept__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringConcept__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group_4__1"


    // $ANTLR start "rule__StringConcept__Group_4__1__Impl"
    // InternalDataDsl.g:1988:1: rule__StringConcept__Group_4__1__Impl : ( ( rule__StringConcept__Group_4_1__0 )* ) ;
    public final void rule__StringConcept__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1992:1: ( ( ( rule__StringConcept__Group_4_1__0 )* ) )
            // InternalDataDsl.g:1993:1: ( ( rule__StringConcept__Group_4_1__0 )* )
            {
            // InternalDataDsl.g:1993:1: ( ( rule__StringConcept__Group_4_1__0 )* )
            // InternalDataDsl.g:1994:2: ( rule__StringConcept__Group_4_1__0 )*
            {
             before(grammarAccess.getStringConceptAccess().getGroup_4_1()); 
            // InternalDataDsl.g:1995:2: ( rule__StringConcept__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==66) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDataDsl.g:1995:3: rule__StringConcept__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StringConcept__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getStringConceptAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group_4__1__Impl"


    // $ANTLR start "rule__StringConcept__Group_4_1__0"
    // InternalDataDsl.g:2004:1: rule__StringConcept__Group_4_1__0 : rule__StringConcept__Group_4_1__0__Impl rule__StringConcept__Group_4_1__1 ;
    public final void rule__StringConcept__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2008:1: ( rule__StringConcept__Group_4_1__0__Impl rule__StringConcept__Group_4_1__1 )
            // InternalDataDsl.g:2009:2: rule__StringConcept__Group_4_1__0__Impl rule__StringConcept__Group_4_1__1
            {
            pushFollow(FOLLOW_18);
            rule__StringConcept__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringConcept__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group_4_1__0"


    // $ANTLR start "rule__StringConcept__Group_4_1__0__Impl"
    // InternalDataDsl.g:2016:1: rule__StringConcept__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__StringConcept__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2020:1: ( ( ',' ) )
            // InternalDataDsl.g:2021:1: ( ',' )
            {
            // InternalDataDsl.g:2021:1: ( ',' )
            // InternalDataDsl.g:2022:2: ','
            {
             before(grammarAccess.getStringConceptAccess().getCommaKeyword_4_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getStringConceptAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group_4_1__0__Impl"


    // $ANTLR start "rule__StringConcept__Group_4_1__1"
    // InternalDataDsl.g:2031:1: rule__StringConcept__Group_4_1__1 : rule__StringConcept__Group_4_1__1__Impl ;
    public final void rule__StringConcept__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2035:1: ( rule__StringConcept__Group_4_1__1__Impl )
            // InternalDataDsl.g:2036:2: rule__StringConcept__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringConcept__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group_4_1__1"


    // $ANTLR start "rule__StringConcept__Group_4_1__1__Impl"
    // InternalDataDsl.g:2042:1: rule__StringConcept__Group_4_1__1__Impl : ( ( rule__StringConcept__SubsequenceAssignment_4_1_1 ) ) ;
    public final void rule__StringConcept__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2046:1: ( ( ( rule__StringConcept__SubsequenceAssignment_4_1_1 ) ) )
            // InternalDataDsl.g:2047:1: ( ( rule__StringConcept__SubsequenceAssignment_4_1_1 ) )
            {
            // InternalDataDsl.g:2047:1: ( ( rule__StringConcept__SubsequenceAssignment_4_1_1 ) )
            // InternalDataDsl.g:2048:2: ( rule__StringConcept__SubsequenceAssignment_4_1_1 )
            {
             before(grammarAccess.getStringConceptAccess().getSubsequenceAssignment_4_1_1()); 
            // InternalDataDsl.g:2049:2: ( rule__StringConcept__SubsequenceAssignment_4_1_1 )
            // InternalDataDsl.g:2049:3: rule__StringConcept__SubsequenceAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringConcept__SubsequenceAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringConceptAccess().getSubsequenceAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__Group_4_1__1__Impl"


    // $ANTLR start "rule__Substring__Group__0"
    // InternalDataDsl.g:2058:1: rule__Substring__Group__0 : rule__Substring__Group__0__Impl rule__Substring__Group__1 ;
    public final void rule__Substring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2062:1: ( rule__Substring__Group__0__Impl rule__Substring__Group__1 )
            // InternalDataDsl.g:2063:2: rule__Substring__Group__0__Impl rule__Substring__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Substring__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Substring__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__0"


    // $ANTLR start "rule__Substring__Group__0__Impl"
    // InternalDataDsl.g:2070:1: rule__Substring__Group__0__Impl : ( ( rule__Substring__TypeStringAssignment_0 ) ) ;
    public final void rule__Substring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2074:1: ( ( ( rule__Substring__TypeStringAssignment_0 ) ) )
            // InternalDataDsl.g:2075:1: ( ( rule__Substring__TypeStringAssignment_0 ) )
            {
            // InternalDataDsl.g:2075:1: ( ( rule__Substring__TypeStringAssignment_0 ) )
            // InternalDataDsl.g:2076:2: ( rule__Substring__TypeStringAssignment_0 )
            {
             before(grammarAccess.getSubstringAccess().getTypeStringAssignment_0()); 
            // InternalDataDsl.g:2077:2: ( rule__Substring__TypeStringAssignment_0 )
            // InternalDataDsl.g:2077:3: rule__Substring__TypeStringAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Substring__TypeStringAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSubstringAccess().getTypeStringAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__0__Impl"


    // $ANTLR start "rule__Substring__Group__1"
    // InternalDataDsl.g:2085:1: rule__Substring__Group__1 : rule__Substring__Group__1__Impl rule__Substring__Group__2 ;
    public final void rule__Substring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2089:1: ( rule__Substring__Group__1__Impl rule__Substring__Group__2 )
            // InternalDataDsl.g:2090:2: rule__Substring__Group__1__Impl rule__Substring__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Substring__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Substring__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__1"


    // $ANTLR start "rule__Substring__Group__1__Impl"
    // InternalDataDsl.g:2097:1: rule__Substring__Group__1__Impl : ( ( rule__Substring__NameAssignment_1 ) ) ;
    public final void rule__Substring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2101:1: ( ( ( rule__Substring__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2102:1: ( ( rule__Substring__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2102:1: ( ( rule__Substring__NameAssignment_1 ) )
            // InternalDataDsl.g:2103:2: ( rule__Substring__NameAssignment_1 )
            {
             before(grammarAccess.getSubstringAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2104:2: ( rule__Substring__NameAssignment_1 )
            // InternalDataDsl.g:2104:3: rule__Substring__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Substring__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubstringAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__1__Impl"


    // $ANTLR start "rule__Substring__Group__2"
    // InternalDataDsl.g:2112:1: rule__Substring__Group__2 : rule__Substring__Group__2__Impl rule__Substring__Group__3 ;
    public final void rule__Substring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2116:1: ( rule__Substring__Group__2__Impl rule__Substring__Group__3 )
            // InternalDataDsl.g:2117:2: rule__Substring__Group__2__Impl rule__Substring__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Substring__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Substring__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__2"


    // $ANTLR start "rule__Substring__Group__2__Impl"
    // InternalDataDsl.g:2124:1: rule__Substring__Group__2__Impl : ( '[' ) ;
    public final void rule__Substring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2128:1: ( ( '[' ) )
            // InternalDataDsl.g:2129:1: ( '[' )
            {
            // InternalDataDsl.g:2129:1: ( '[' )
            // InternalDataDsl.g:2130:2: '['
            {
             before(grammarAccess.getSubstringAccess().getLeftSquareBracketKeyword_2()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getSubstringAccess().getLeftSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__2__Impl"


    // $ANTLR start "rule__Substring__Group__3"
    // InternalDataDsl.g:2139:1: rule__Substring__Group__3 : rule__Substring__Group__3__Impl rule__Substring__Group__4 ;
    public final void rule__Substring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2143:1: ( rule__Substring__Group__3__Impl rule__Substring__Group__4 )
            // InternalDataDsl.g:2144:2: rule__Substring__Group__3__Impl rule__Substring__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Substring__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Substring__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__3"


    // $ANTLR start "rule__Substring__Group__3__Impl"
    // InternalDataDsl.g:2151:1: rule__Substring__Group__3__Impl : ( ( rule__Substring__MinlengthAssignment_3 ) ) ;
    public final void rule__Substring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2155:1: ( ( ( rule__Substring__MinlengthAssignment_3 ) ) )
            // InternalDataDsl.g:2156:1: ( ( rule__Substring__MinlengthAssignment_3 ) )
            {
            // InternalDataDsl.g:2156:1: ( ( rule__Substring__MinlengthAssignment_3 ) )
            // InternalDataDsl.g:2157:2: ( rule__Substring__MinlengthAssignment_3 )
            {
             before(grammarAccess.getSubstringAccess().getMinlengthAssignment_3()); 
            // InternalDataDsl.g:2158:2: ( rule__Substring__MinlengthAssignment_3 )
            // InternalDataDsl.g:2158:3: rule__Substring__MinlengthAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Substring__MinlengthAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSubstringAccess().getMinlengthAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__3__Impl"


    // $ANTLR start "rule__Substring__Group__4"
    // InternalDataDsl.g:2166:1: rule__Substring__Group__4 : rule__Substring__Group__4__Impl rule__Substring__Group__5 ;
    public final void rule__Substring__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2170:1: ( rule__Substring__Group__4__Impl rule__Substring__Group__5 )
            // InternalDataDsl.g:2171:2: rule__Substring__Group__4__Impl rule__Substring__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Substring__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Substring__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__4"


    // $ANTLR start "rule__Substring__Group__4__Impl"
    // InternalDataDsl.g:2178:1: rule__Substring__Group__4__Impl : ( ',' ) ;
    public final void rule__Substring__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2182:1: ( ( ',' ) )
            // InternalDataDsl.g:2183:1: ( ',' )
            {
            // InternalDataDsl.g:2183:1: ( ',' )
            // InternalDataDsl.g:2184:2: ','
            {
             before(grammarAccess.getSubstringAccess().getCommaKeyword_4()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getSubstringAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__4__Impl"


    // $ANTLR start "rule__Substring__Group__5"
    // InternalDataDsl.g:2193:1: rule__Substring__Group__5 : rule__Substring__Group__5__Impl rule__Substring__Group__6 ;
    public final void rule__Substring__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2197:1: ( rule__Substring__Group__5__Impl rule__Substring__Group__6 )
            // InternalDataDsl.g:2198:2: rule__Substring__Group__5__Impl rule__Substring__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__Substring__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Substring__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__5"


    // $ANTLR start "rule__Substring__Group__5__Impl"
    // InternalDataDsl.g:2205:1: rule__Substring__Group__5__Impl : ( ( rule__Substring__MaxlengthAssignment_5 ) ) ;
    public final void rule__Substring__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2209:1: ( ( ( rule__Substring__MaxlengthAssignment_5 ) ) )
            // InternalDataDsl.g:2210:1: ( ( rule__Substring__MaxlengthAssignment_5 ) )
            {
            // InternalDataDsl.g:2210:1: ( ( rule__Substring__MaxlengthAssignment_5 ) )
            // InternalDataDsl.g:2211:2: ( rule__Substring__MaxlengthAssignment_5 )
            {
             before(grammarAccess.getSubstringAccess().getMaxlengthAssignment_5()); 
            // InternalDataDsl.g:2212:2: ( rule__Substring__MaxlengthAssignment_5 )
            // InternalDataDsl.g:2212:3: rule__Substring__MaxlengthAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Substring__MaxlengthAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSubstringAccess().getMaxlengthAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__5__Impl"


    // $ANTLR start "rule__Substring__Group__6"
    // InternalDataDsl.g:2220:1: rule__Substring__Group__6 : rule__Substring__Group__6__Impl ;
    public final void rule__Substring__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2224:1: ( rule__Substring__Group__6__Impl )
            // InternalDataDsl.g:2225:2: rule__Substring__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Substring__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__6"


    // $ANTLR start "rule__Substring__Group__6__Impl"
    // InternalDataDsl.g:2231:1: rule__Substring__Group__6__Impl : ( ']' ) ;
    public final void rule__Substring__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2235:1: ( ( ']' ) )
            // InternalDataDsl.g:2236:1: ( ']' )
            {
            // InternalDataDsl.g:2236:1: ( ']' )
            // InternalDataDsl.g:2237:2: ']'
            {
             before(grammarAccess.getSubstringAccess().getRightSquareBracketKeyword_6()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getSubstringAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__Group__6__Impl"


    // $ANTLR start "rule__Character__Group__0"
    // InternalDataDsl.g:2247:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2251:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // InternalDataDsl.g:2252:2: rule__Character__Group__0__Impl rule__Character__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Character__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0"


    // $ANTLR start "rule__Character__Group__0__Impl"
    // InternalDataDsl.g:2259:1: rule__Character__Group__0__Impl : ( ( rule__Character__TypeCharacterAssignment_0 ) ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2263:1: ( ( ( rule__Character__TypeCharacterAssignment_0 ) ) )
            // InternalDataDsl.g:2264:1: ( ( rule__Character__TypeCharacterAssignment_0 ) )
            {
            // InternalDataDsl.g:2264:1: ( ( rule__Character__TypeCharacterAssignment_0 ) )
            // InternalDataDsl.g:2265:2: ( rule__Character__TypeCharacterAssignment_0 )
            {
             before(grammarAccess.getCharacterAccess().getTypeCharacterAssignment_0()); 
            // InternalDataDsl.g:2266:2: ( rule__Character__TypeCharacterAssignment_0 )
            // InternalDataDsl.g:2266:3: rule__Character__TypeCharacterAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Character__TypeCharacterAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getTypeCharacterAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__0__Impl"


    // $ANTLR start "rule__Character__Group__1"
    // InternalDataDsl.g:2274:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2278:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // InternalDataDsl.g:2279:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Character__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Character__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1"


    // $ANTLR start "rule__Character__Group__1__Impl"
    // InternalDataDsl.g:2286:1: rule__Character__Group__1__Impl : ( ( rule__Character__NameAssignment_1 ) ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2290:1: ( ( ( rule__Character__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2291:1: ( ( rule__Character__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2291:1: ( ( rule__Character__NameAssignment_1 ) )
            // InternalDataDsl.g:2292:2: ( rule__Character__NameAssignment_1 )
            {
             before(grammarAccess.getCharacterAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2293:2: ( rule__Character__NameAssignment_1 )
            // InternalDataDsl.g:2293:3: rule__Character__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Character__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCharacterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__1__Impl"


    // $ANTLR start "rule__Character__Group__2"
    // InternalDataDsl.g:2301:1: rule__Character__Group__2 : rule__Character__Group__2__Impl ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2305:1: ( rule__Character__Group__2__Impl )
            // InternalDataDsl.g:2306:2: rule__Character__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Character__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2"


    // $ANTLR start "rule__Character__Group__2__Impl"
    // InternalDataDsl.g:2312:1: rule__Character__Group__2__Impl : ( ( rule__Character__ValueAssignment_2 )? ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2316:1: ( ( ( rule__Character__ValueAssignment_2 )? ) )
            // InternalDataDsl.g:2317:1: ( ( rule__Character__ValueAssignment_2 )? )
            {
            // InternalDataDsl.g:2317:1: ( ( rule__Character__ValueAssignment_2 )? )
            // InternalDataDsl.g:2318:2: ( rule__Character__ValueAssignment_2 )?
            {
             before(grammarAccess.getCharacterAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:2319:2: ( rule__Character__ValueAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDataDsl.g:2319:3: rule__Character__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Character__ValueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCharacterAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__Group__2__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group__0"
    // InternalDataDsl.g:2328:1: rule__DataSourceDescription__Group__0 : rule__DataSourceDescription__Group__0__Impl rule__DataSourceDescription__Group__1 ;
    public final void rule__DataSourceDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2332:1: ( rule__DataSourceDescription__Group__0__Impl rule__DataSourceDescription__Group__1 )
            // InternalDataDsl.g:2333:2: rule__DataSourceDescription__Group__0__Impl rule__DataSourceDescription__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__DataSourceDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__0"


    // $ANTLR start "rule__DataSourceDescription__Group__0__Impl"
    // InternalDataDsl.g:2340:1: rule__DataSourceDescription__Group__0__Impl : ( 'description' ) ;
    public final void rule__DataSourceDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2344:1: ( ( 'description' ) )
            // InternalDataDsl.g:2345:1: ( 'description' )
            {
            // InternalDataDsl.g:2345:1: ( 'description' )
            // InternalDataDsl.g:2346:2: 'description'
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__0__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group__1"
    // InternalDataDsl.g:2355:1: rule__DataSourceDescription__Group__1 : rule__DataSourceDescription__Group__1__Impl rule__DataSourceDescription__Group__2 ;
    public final void rule__DataSourceDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2359:1: ( rule__DataSourceDescription__Group__1__Impl rule__DataSourceDescription__Group__2 )
            // InternalDataDsl.g:2360:2: rule__DataSourceDescription__Group__1__Impl rule__DataSourceDescription__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataSourceDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__1"


    // $ANTLR start "rule__DataSourceDescription__Group__1__Impl"
    // InternalDataDsl.g:2367:1: rule__DataSourceDescription__Group__1__Impl : ( ( rule__DataSourceDescription__FormatAssignment_1 ) ) ;
    public final void rule__DataSourceDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2371:1: ( ( ( rule__DataSourceDescription__FormatAssignment_1 ) ) )
            // InternalDataDsl.g:2372:1: ( ( rule__DataSourceDescription__FormatAssignment_1 ) )
            {
            // InternalDataDsl.g:2372:1: ( ( rule__DataSourceDescription__FormatAssignment_1 ) )
            // InternalDataDsl.g:2373:2: ( rule__DataSourceDescription__FormatAssignment_1 )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getFormatAssignment_1()); 
            // InternalDataDsl.g:2374:2: ( rule__DataSourceDescription__FormatAssignment_1 )
            // InternalDataDsl.g:2374:3: rule__DataSourceDescription__FormatAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__FormatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDescriptionAccess().getFormatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__1__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group__2"
    // InternalDataDsl.g:2382:1: rule__DataSourceDescription__Group__2 : rule__DataSourceDescription__Group__2__Impl rule__DataSourceDescription__Group__3 ;
    public final void rule__DataSourceDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2386:1: ( rule__DataSourceDescription__Group__2__Impl rule__DataSourceDescription__Group__3 )
            // InternalDataDsl.g:2387:2: rule__DataSourceDescription__Group__2__Impl rule__DataSourceDescription__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__DataSourceDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__2"


    // $ANTLR start "rule__DataSourceDescription__Group__2__Impl"
    // InternalDataDsl.g:2394:1: rule__DataSourceDescription__Group__2__Impl : ( ( rule__DataSourceDescription__NameAssignment_2 ) ) ;
    public final void rule__DataSourceDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2398:1: ( ( ( rule__DataSourceDescription__NameAssignment_2 ) ) )
            // InternalDataDsl.g:2399:1: ( ( rule__DataSourceDescription__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:2399:1: ( ( rule__DataSourceDescription__NameAssignment_2 ) )
            // InternalDataDsl.g:2400:2: ( rule__DataSourceDescription__NameAssignment_2 )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:2401:2: ( rule__DataSourceDescription__NameAssignment_2 )
            // InternalDataDsl.g:2401:3: rule__DataSourceDescription__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDescriptionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__2__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group__3"
    // InternalDataDsl.g:2409:1: rule__DataSourceDescription__Group__3 : rule__DataSourceDescription__Group__3__Impl rule__DataSourceDescription__Group__4 ;
    public final void rule__DataSourceDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2413:1: ( rule__DataSourceDescription__Group__3__Impl rule__DataSourceDescription__Group__4 )
            // InternalDataDsl.g:2414:2: rule__DataSourceDescription__Group__3__Impl rule__DataSourceDescription__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__DataSourceDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__3"


    // $ANTLR start "rule__DataSourceDescription__Group__3__Impl"
    // InternalDataDsl.g:2421:1: rule__DataSourceDescription__Group__3__Impl : ( ( rule__DataSourceDescription__Group_3__0 )? ) ;
    public final void rule__DataSourceDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2425:1: ( ( ( rule__DataSourceDescription__Group_3__0 )? ) )
            // InternalDataDsl.g:2426:1: ( ( rule__DataSourceDescription__Group_3__0 )? )
            {
            // InternalDataDsl.g:2426:1: ( ( rule__DataSourceDescription__Group_3__0 )? )
            // InternalDataDsl.g:2427:2: ( rule__DataSourceDescription__Group_3__0 )?
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getGroup_3()); 
            // InternalDataDsl.g:2428:2: ( rule__DataSourceDescription__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==70) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataDsl.g:2428:3: rule__DataSourceDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSourceDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__3__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group__4"
    // InternalDataDsl.g:2436:1: rule__DataSourceDescription__Group__4 : rule__DataSourceDescription__Group__4__Impl rule__DataSourceDescription__Group__5 ;
    public final void rule__DataSourceDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2440:1: ( rule__DataSourceDescription__Group__4__Impl rule__DataSourceDescription__Group__5 )
            // InternalDataDsl.g:2441:2: rule__DataSourceDescription__Group__4__Impl rule__DataSourceDescription__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__DataSourceDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__4"


    // $ANTLR start "rule__DataSourceDescription__Group__4__Impl"
    // InternalDataDsl.g:2448:1: rule__DataSourceDescription__Group__4__Impl : ( '{' ) ;
    public final void rule__DataSourceDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2452:1: ( ( '{' ) )
            // InternalDataDsl.g:2453:1: ( '{' )
            {
            // InternalDataDsl.g:2453:1: ( '{' )
            // InternalDataDsl.g:2454:2: '{'
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__4__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group__5"
    // InternalDataDsl.g:2463:1: rule__DataSourceDescription__Group__5 : rule__DataSourceDescription__Group__5__Impl rule__DataSourceDescription__Group__6 ;
    public final void rule__DataSourceDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2467:1: ( rule__DataSourceDescription__Group__5__Impl rule__DataSourceDescription__Group__6 )
            // InternalDataDsl.g:2468:2: rule__DataSourceDescription__Group__5__Impl rule__DataSourceDescription__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__DataSourceDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__5"


    // $ANTLR start "rule__DataSourceDescription__Group__5__Impl"
    // InternalDataDsl.g:2475:1: rule__DataSourceDescription__Group__5__Impl : ( ( rule__DataSourceDescription__Group_5__0 )? ) ;
    public final void rule__DataSourceDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2479:1: ( ( ( rule__DataSourceDescription__Group_5__0 )? ) )
            // InternalDataDsl.g:2480:1: ( ( rule__DataSourceDescription__Group_5__0 )? )
            {
            // InternalDataDsl.g:2480:1: ( ( rule__DataSourceDescription__Group_5__0 )? )
            // InternalDataDsl.g:2481:2: ( rule__DataSourceDescription__Group_5__0 )?
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getGroup_5()); 
            // InternalDataDsl.g:2482:2: ( rule__DataSourceDescription__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID||(LA24_0>=23 && LA24_0<=34)||(LA24_0>=75 && LA24_0<=77)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDsl.g:2482:3: rule__DataSourceDescription__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSourceDescription__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceDescriptionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__5__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group__6"
    // InternalDataDsl.g:2490:1: rule__DataSourceDescription__Group__6 : rule__DataSourceDescription__Group__6__Impl rule__DataSourceDescription__Group__7 ;
    public final void rule__DataSourceDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2494:1: ( rule__DataSourceDescription__Group__6__Impl rule__DataSourceDescription__Group__7 )
            // InternalDataDsl.g:2495:2: rule__DataSourceDescription__Group__6__Impl rule__DataSourceDescription__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__DataSourceDescription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__6"


    // $ANTLR start "rule__DataSourceDescription__Group__6__Impl"
    // InternalDataDsl.g:2502:1: rule__DataSourceDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__DataSourceDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2506:1: ( ( '}' ) )
            // InternalDataDsl.g:2507:1: ( '}' )
            {
            // InternalDataDsl.g:2507:1: ( '}' )
            // InternalDataDsl.g:2508:2: '}'
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__6__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group__7"
    // InternalDataDsl.g:2517:1: rule__DataSourceDescription__Group__7 : rule__DataSourceDescription__Group__7__Impl ;
    public final void rule__DataSourceDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2521:1: ( rule__DataSourceDescription__Group__7__Impl )
            // InternalDataDsl.g:2522:2: rule__DataSourceDescription__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__7"


    // $ANTLR start "rule__DataSourceDescription__Group__7__Impl"
    // InternalDataDsl.g:2528:1: rule__DataSourceDescription__Group__7__Impl : ( ( rule__DataSourceDescription__Group_7__0 )? ) ;
    public final void rule__DataSourceDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2532:1: ( ( ( rule__DataSourceDescription__Group_7__0 )? ) )
            // InternalDataDsl.g:2533:1: ( ( rule__DataSourceDescription__Group_7__0 )? )
            {
            // InternalDataDsl.g:2533:1: ( ( rule__DataSourceDescription__Group_7__0 )? )
            // InternalDataDsl.g:2534:2: ( rule__DataSourceDescription__Group_7__0 )?
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getGroup_7()); 
            // InternalDataDsl.g:2535:2: ( rule__DataSourceDescription__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==61) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDsl.g:2535:3: rule__DataSourceDescription__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSourceDescription__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceDescriptionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group__7__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_3__0"
    // InternalDataDsl.g:2544:1: rule__DataSourceDescription__Group_3__0 : rule__DataSourceDescription__Group_3__0__Impl rule__DataSourceDescription__Group_3__1 ;
    public final void rule__DataSourceDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2548:1: ( rule__DataSourceDescription__Group_3__0__Impl rule__DataSourceDescription__Group_3__1 )
            // InternalDataDsl.g:2549:2: rule__DataSourceDescription__Group_3__0__Impl rule__DataSourceDescription__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__DataSourceDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3__0"


    // $ANTLR start "rule__DataSourceDescription__Group_3__0__Impl"
    // InternalDataDsl.g:2556:1: rule__DataSourceDescription__Group_3__0__Impl : ( ':' ) ;
    public final void rule__DataSourceDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2560:1: ( ( ':' ) )
            // InternalDataDsl.g:2561:1: ( ':' )
            {
            // InternalDataDsl.g:2561:1: ( ':' )
            // InternalDataDsl.g:2562:2: ':'
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getColonKeyword_3_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3__0__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_3__1"
    // InternalDataDsl.g:2571:1: rule__DataSourceDescription__Group_3__1 : rule__DataSourceDescription__Group_3__1__Impl rule__DataSourceDescription__Group_3__2 ;
    public final void rule__DataSourceDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2575:1: ( rule__DataSourceDescription__Group_3__1__Impl rule__DataSourceDescription__Group_3__2 )
            // InternalDataDsl.g:2576:2: rule__DataSourceDescription__Group_3__1__Impl rule__DataSourceDescription__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__DataSourceDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3__1"


    // $ANTLR start "rule__DataSourceDescription__Group_3__1__Impl"
    // InternalDataDsl.g:2583:1: rule__DataSourceDescription__Group_3__1__Impl : ( ( rule__DataSourceDescription__FragmentsAssignment_3_1 ) ) ;
    public final void rule__DataSourceDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2587:1: ( ( ( rule__DataSourceDescription__FragmentsAssignment_3_1 ) ) )
            // InternalDataDsl.g:2588:1: ( ( rule__DataSourceDescription__FragmentsAssignment_3_1 ) )
            {
            // InternalDataDsl.g:2588:1: ( ( rule__DataSourceDescription__FragmentsAssignment_3_1 ) )
            // InternalDataDsl.g:2589:2: ( rule__DataSourceDescription__FragmentsAssignment_3_1 )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getFragmentsAssignment_3_1()); 
            // InternalDataDsl.g:2590:2: ( rule__DataSourceDescription__FragmentsAssignment_3_1 )
            // InternalDataDsl.g:2590:3: rule__DataSourceDescription__FragmentsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__FragmentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDescriptionAccess().getFragmentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3__1__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_3__2"
    // InternalDataDsl.g:2598:1: rule__DataSourceDescription__Group_3__2 : rule__DataSourceDescription__Group_3__2__Impl ;
    public final void rule__DataSourceDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2602:1: ( rule__DataSourceDescription__Group_3__2__Impl )
            // InternalDataDsl.g:2603:2: rule__DataSourceDescription__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3__2"


    // $ANTLR start "rule__DataSourceDescription__Group_3__2__Impl"
    // InternalDataDsl.g:2609:1: rule__DataSourceDescription__Group_3__2__Impl : ( ( rule__DataSourceDescription__Group_3_2__0 )* ) ;
    public final void rule__DataSourceDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2613:1: ( ( ( rule__DataSourceDescription__Group_3_2__0 )* ) )
            // InternalDataDsl.g:2614:1: ( ( rule__DataSourceDescription__Group_3_2__0 )* )
            {
            // InternalDataDsl.g:2614:1: ( ( rule__DataSourceDescription__Group_3_2__0 )* )
            // InternalDataDsl.g:2615:2: ( rule__DataSourceDescription__Group_3_2__0 )*
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getGroup_3_2()); 
            // InternalDataDsl.g:2616:2: ( rule__DataSourceDescription__Group_3_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==66) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDataDsl.g:2616:3: rule__DataSourceDescription__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataSourceDescription__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDataSourceDescriptionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3__2__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_3_2__0"
    // InternalDataDsl.g:2625:1: rule__DataSourceDescription__Group_3_2__0 : rule__DataSourceDescription__Group_3_2__0__Impl rule__DataSourceDescription__Group_3_2__1 ;
    public final void rule__DataSourceDescription__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2629:1: ( rule__DataSourceDescription__Group_3_2__0__Impl rule__DataSourceDescription__Group_3_2__1 )
            // InternalDataDsl.g:2630:2: rule__DataSourceDescription__Group_3_2__0__Impl rule__DataSourceDescription__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DataSourceDescription__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3_2__0"


    // $ANTLR start "rule__DataSourceDescription__Group_3_2__0__Impl"
    // InternalDataDsl.g:2637:1: rule__DataSourceDescription__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DataSourceDescription__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2641:1: ( ( ',' ) )
            // InternalDataDsl.g:2642:1: ( ',' )
            {
            // InternalDataDsl.g:2642:1: ( ',' )
            // InternalDataDsl.g:2643:2: ','
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getCommaKeyword_3_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3_2__0__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_3_2__1"
    // InternalDataDsl.g:2652:1: rule__DataSourceDescription__Group_3_2__1 : rule__DataSourceDescription__Group_3_2__1__Impl ;
    public final void rule__DataSourceDescription__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2656:1: ( rule__DataSourceDescription__Group_3_2__1__Impl )
            // InternalDataDsl.g:2657:2: rule__DataSourceDescription__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3_2__1"


    // $ANTLR start "rule__DataSourceDescription__Group_3_2__1__Impl"
    // InternalDataDsl.g:2663:1: rule__DataSourceDescription__Group_3_2__1__Impl : ( ( rule__DataSourceDescription__FragmentsAssignment_3_2_1 ) ) ;
    public final void rule__DataSourceDescription__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2667:1: ( ( ( rule__DataSourceDescription__FragmentsAssignment_3_2_1 ) ) )
            // InternalDataDsl.g:2668:1: ( ( rule__DataSourceDescription__FragmentsAssignment_3_2_1 ) )
            {
            // InternalDataDsl.g:2668:1: ( ( rule__DataSourceDescription__FragmentsAssignment_3_2_1 ) )
            // InternalDataDsl.g:2669:2: ( rule__DataSourceDescription__FragmentsAssignment_3_2_1 )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getFragmentsAssignment_3_2_1()); 
            // InternalDataDsl.g:2670:2: ( rule__DataSourceDescription__FragmentsAssignment_3_2_1 )
            // InternalDataDsl.g:2670:3: rule__DataSourceDescription__FragmentsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__FragmentsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDescriptionAccess().getFragmentsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_3_2__1__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_5__0"
    // InternalDataDsl.g:2679:1: rule__DataSourceDescription__Group_5__0 : rule__DataSourceDescription__Group_5__0__Impl rule__DataSourceDescription__Group_5__1 ;
    public final void rule__DataSourceDescription__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2683:1: ( rule__DataSourceDescription__Group_5__0__Impl rule__DataSourceDescription__Group_5__1 )
            // InternalDataDsl.g:2684:2: rule__DataSourceDescription__Group_5__0__Impl rule__DataSourceDescription__Group_5__1
            {
            pushFollow(FOLLOW_16);
            rule__DataSourceDescription__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_5__0"


    // $ANTLR start "rule__DataSourceDescription__Group_5__0__Impl"
    // InternalDataDsl.g:2691:1: rule__DataSourceDescription__Group_5__0__Impl : ( ( rule__DataSourceDescription__NodesAssignment_5_0 ) ) ;
    public final void rule__DataSourceDescription__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2695:1: ( ( ( rule__DataSourceDescription__NodesAssignment_5_0 ) ) )
            // InternalDataDsl.g:2696:1: ( ( rule__DataSourceDescription__NodesAssignment_5_0 ) )
            {
            // InternalDataDsl.g:2696:1: ( ( rule__DataSourceDescription__NodesAssignment_5_0 ) )
            // InternalDataDsl.g:2697:2: ( rule__DataSourceDescription__NodesAssignment_5_0 )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getNodesAssignment_5_0()); 
            // InternalDataDsl.g:2698:2: ( rule__DataSourceDescription__NodesAssignment_5_0 )
            // InternalDataDsl.g:2698:3: rule__DataSourceDescription__NodesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__NodesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDescriptionAccess().getNodesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_5__0__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_5__1"
    // InternalDataDsl.g:2706:1: rule__DataSourceDescription__Group_5__1 : rule__DataSourceDescription__Group_5__1__Impl ;
    public final void rule__DataSourceDescription__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2710:1: ( rule__DataSourceDescription__Group_5__1__Impl )
            // InternalDataDsl.g:2711:2: rule__DataSourceDescription__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_5__1"


    // $ANTLR start "rule__DataSourceDescription__Group_5__1__Impl"
    // InternalDataDsl.g:2717:1: rule__DataSourceDescription__Group_5__1__Impl : ( ( rule__DataSourceDescription__Group_5_1__0 )* ) ;
    public final void rule__DataSourceDescription__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2721:1: ( ( ( rule__DataSourceDescription__Group_5_1__0 )* ) )
            // InternalDataDsl.g:2722:1: ( ( rule__DataSourceDescription__Group_5_1__0 )* )
            {
            // InternalDataDsl.g:2722:1: ( ( rule__DataSourceDescription__Group_5_1__0 )* )
            // InternalDataDsl.g:2723:2: ( rule__DataSourceDescription__Group_5_1__0 )*
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getGroup_5_1()); 
            // InternalDataDsl.g:2724:2: ( rule__DataSourceDescription__Group_5_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==66) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDataDsl.g:2724:3: rule__DataSourceDescription__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataSourceDescription__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDataSourceDescriptionAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_5__1__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_5_1__0"
    // InternalDataDsl.g:2733:1: rule__DataSourceDescription__Group_5_1__0 : rule__DataSourceDescription__Group_5_1__0__Impl rule__DataSourceDescription__Group_5_1__1 ;
    public final void rule__DataSourceDescription__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2737:1: ( rule__DataSourceDescription__Group_5_1__0__Impl rule__DataSourceDescription__Group_5_1__1 )
            // InternalDataDsl.g:2738:2: rule__DataSourceDescription__Group_5_1__0__Impl rule__DataSourceDescription__Group_5_1__1
            {
            pushFollow(FOLLOW_26);
            rule__DataSourceDescription__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_5_1__0"


    // $ANTLR start "rule__DataSourceDescription__Group_5_1__0__Impl"
    // InternalDataDsl.g:2745:1: rule__DataSourceDescription__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__DataSourceDescription__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2749:1: ( ( ',' ) )
            // InternalDataDsl.g:2750:1: ( ',' )
            {
            // InternalDataDsl.g:2750:1: ( ',' )
            // InternalDataDsl.g:2751:2: ','
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getCommaKeyword_5_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_5_1__0__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_5_1__1"
    // InternalDataDsl.g:2760:1: rule__DataSourceDescription__Group_5_1__1 : rule__DataSourceDescription__Group_5_1__1__Impl ;
    public final void rule__DataSourceDescription__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2764:1: ( rule__DataSourceDescription__Group_5_1__1__Impl )
            // InternalDataDsl.g:2765:2: rule__DataSourceDescription__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_5_1__1"


    // $ANTLR start "rule__DataSourceDescription__Group_5_1__1__Impl"
    // InternalDataDsl.g:2771:1: rule__DataSourceDescription__Group_5_1__1__Impl : ( ( rule__DataSourceDescription__NodesAssignment_5_1_1 ) ) ;
    public final void rule__DataSourceDescription__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2775:1: ( ( ( rule__DataSourceDescription__NodesAssignment_5_1_1 ) ) )
            // InternalDataDsl.g:2776:1: ( ( rule__DataSourceDescription__NodesAssignment_5_1_1 ) )
            {
            // InternalDataDsl.g:2776:1: ( ( rule__DataSourceDescription__NodesAssignment_5_1_1 ) )
            // InternalDataDsl.g:2777:2: ( rule__DataSourceDescription__NodesAssignment_5_1_1 )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getNodesAssignment_5_1_1()); 
            // InternalDataDsl.g:2778:2: ( rule__DataSourceDescription__NodesAssignment_5_1_1 )
            // InternalDataDsl.g:2778:3: rule__DataSourceDescription__NodesAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__NodesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDescriptionAccess().getNodesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_5_1__1__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_7__0"
    // InternalDataDsl.g:2787:1: rule__DataSourceDescription__Group_7__0 : rule__DataSourceDescription__Group_7__0__Impl rule__DataSourceDescription__Group_7__1 ;
    public final void rule__DataSourceDescription__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2791:1: ( rule__DataSourceDescription__Group_7__0__Impl rule__DataSourceDescription__Group_7__1 )
            // InternalDataDsl.g:2792:2: rule__DataSourceDescription__Group_7__0__Impl rule__DataSourceDescription__Group_7__1
            {
            pushFollow(FOLLOW_27);
            rule__DataSourceDescription__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7__0"


    // $ANTLR start "rule__DataSourceDescription__Group_7__0__Impl"
    // InternalDataDsl.g:2799:1: rule__DataSourceDescription__Group_7__0__Impl : ( '{' ) ;
    public final void rule__DataSourceDescription__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2803:1: ( ( '{' ) )
            // InternalDataDsl.g:2804:1: ( '{' )
            {
            // InternalDataDsl.g:2804:1: ( '{' )
            // InternalDataDsl.g:2805:2: '{'
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getLeftCurlyBracketKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7__0__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_7__1"
    // InternalDataDsl.g:2814:1: rule__DataSourceDescription__Group_7__1 : rule__DataSourceDescription__Group_7__1__Impl rule__DataSourceDescription__Group_7__2 ;
    public final void rule__DataSourceDescription__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2818:1: ( rule__DataSourceDescription__Group_7__1__Impl rule__DataSourceDescription__Group_7__2 )
            // InternalDataDsl.g:2819:2: rule__DataSourceDescription__Group_7__1__Impl rule__DataSourceDescription__Group_7__2
            {
            pushFollow(FOLLOW_28);
            rule__DataSourceDescription__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7__1"


    // $ANTLR start "rule__DataSourceDescription__Group_7__1__Impl"
    // InternalDataDsl.g:2826:1: rule__DataSourceDescription__Group_7__1__Impl : ( ( rule__DataSourceDescription__OptionsAssignment_7_1 ) ) ;
    public final void rule__DataSourceDescription__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2830:1: ( ( ( rule__DataSourceDescription__OptionsAssignment_7_1 ) ) )
            // InternalDataDsl.g:2831:1: ( ( rule__DataSourceDescription__OptionsAssignment_7_1 ) )
            {
            // InternalDataDsl.g:2831:1: ( ( rule__DataSourceDescription__OptionsAssignment_7_1 ) )
            // InternalDataDsl.g:2832:2: ( rule__DataSourceDescription__OptionsAssignment_7_1 )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getOptionsAssignment_7_1()); 
            // InternalDataDsl.g:2833:2: ( rule__DataSourceDescription__OptionsAssignment_7_1 )
            // InternalDataDsl.g:2833:3: rule__DataSourceDescription__OptionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__OptionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDescriptionAccess().getOptionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7__1__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_7__2"
    // InternalDataDsl.g:2841:1: rule__DataSourceDescription__Group_7__2 : rule__DataSourceDescription__Group_7__2__Impl rule__DataSourceDescription__Group_7__3 ;
    public final void rule__DataSourceDescription__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2845:1: ( rule__DataSourceDescription__Group_7__2__Impl rule__DataSourceDescription__Group_7__3 )
            // InternalDataDsl.g:2846:2: rule__DataSourceDescription__Group_7__2__Impl rule__DataSourceDescription__Group_7__3
            {
            pushFollow(FOLLOW_28);
            rule__DataSourceDescription__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7__2"


    // $ANTLR start "rule__DataSourceDescription__Group_7__2__Impl"
    // InternalDataDsl.g:2853:1: rule__DataSourceDescription__Group_7__2__Impl : ( ( rule__DataSourceDescription__Group_7_2__0 )* ) ;
    public final void rule__DataSourceDescription__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2857:1: ( ( ( rule__DataSourceDescription__Group_7_2__0 )* ) )
            // InternalDataDsl.g:2858:1: ( ( rule__DataSourceDescription__Group_7_2__0 )* )
            {
            // InternalDataDsl.g:2858:1: ( ( rule__DataSourceDescription__Group_7_2__0 )* )
            // InternalDataDsl.g:2859:2: ( rule__DataSourceDescription__Group_7_2__0 )*
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getGroup_7_2()); 
            // InternalDataDsl.g:2860:2: ( rule__DataSourceDescription__Group_7_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==66) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDataDsl.g:2860:3: rule__DataSourceDescription__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataSourceDescription__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDataSourceDescriptionAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7__2__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_7__3"
    // InternalDataDsl.g:2868:1: rule__DataSourceDescription__Group_7__3 : rule__DataSourceDescription__Group_7__3__Impl ;
    public final void rule__DataSourceDescription__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2872:1: ( rule__DataSourceDescription__Group_7__3__Impl )
            // InternalDataDsl.g:2873:2: rule__DataSourceDescription__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7__3"


    // $ANTLR start "rule__DataSourceDescription__Group_7__3__Impl"
    // InternalDataDsl.g:2879:1: rule__DataSourceDescription__Group_7__3__Impl : ( '}' ) ;
    public final void rule__DataSourceDescription__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2883:1: ( ( '}' ) )
            // InternalDataDsl.g:2884:1: ( '}' )
            {
            // InternalDataDsl.g:2884:1: ( '}' )
            // InternalDataDsl.g:2885:2: '}'
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7__3__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_7_2__0"
    // InternalDataDsl.g:2895:1: rule__DataSourceDescription__Group_7_2__0 : rule__DataSourceDescription__Group_7_2__0__Impl rule__DataSourceDescription__Group_7_2__1 ;
    public final void rule__DataSourceDescription__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2899:1: ( rule__DataSourceDescription__Group_7_2__0__Impl rule__DataSourceDescription__Group_7_2__1 )
            // InternalDataDsl.g:2900:2: rule__DataSourceDescription__Group_7_2__0__Impl rule__DataSourceDescription__Group_7_2__1
            {
            pushFollow(FOLLOW_27);
            rule__DataSourceDescription__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7_2__0"


    // $ANTLR start "rule__DataSourceDescription__Group_7_2__0__Impl"
    // InternalDataDsl.g:2907:1: rule__DataSourceDescription__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__DataSourceDescription__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2911:1: ( ( ',' ) )
            // InternalDataDsl.g:2912:1: ( ',' )
            {
            // InternalDataDsl.g:2912:1: ( ',' )
            // InternalDataDsl.g:2913:2: ','
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getCommaKeyword_7_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7_2__0__Impl"


    // $ANTLR start "rule__DataSourceDescription__Group_7_2__1"
    // InternalDataDsl.g:2922:1: rule__DataSourceDescription__Group_7_2__1 : rule__DataSourceDescription__Group_7_2__1__Impl ;
    public final void rule__DataSourceDescription__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2926:1: ( rule__DataSourceDescription__Group_7_2__1__Impl )
            // InternalDataDsl.g:2927:2: rule__DataSourceDescription__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7_2__1"


    // $ANTLR start "rule__DataSourceDescription__Group_7_2__1__Impl"
    // InternalDataDsl.g:2933:1: rule__DataSourceDescription__Group_7_2__1__Impl : ( ( rule__DataSourceDescription__OptionsAssignment_7_2_1 ) ) ;
    public final void rule__DataSourceDescription__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2937:1: ( ( ( rule__DataSourceDescription__OptionsAssignment_7_2_1 ) ) )
            // InternalDataDsl.g:2938:1: ( ( rule__DataSourceDescription__OptionsAssignment_7_2_1 ) )
            {
            // InternalDataDsl.g:2938:1: ( ( rule__DataSourceDescription__OptionsAssignment_7_2_1 ) )
            // InternalDataDsl.g:2939:2: ( rule__DataSourceDescription__OptionsAssignment_7_2_1 )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getOptionsAssignment_7_2_1()); 
            // InternalDataDsl.g:2940:2: ( rule__DataSourceDescription__OptionsAssignment_7_2_1 )
            // InternalDataDsl.g:2940:3: rule__DataSourceDescription__OptionsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSourceDescription__OptionsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceDescriptionAccess().getOptionsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__Group_7_2__1__Impl"


    // $ANTLR start "rule__DataFragment__Group__0"
    // InternalDataDsl.g:2949:1: rule__DataFragment__Group__0 : rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1 ;
    public final void rule__DataFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2953:1: ( rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1 )
            // InternalDataDsl.g:2954:2: rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataFragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__0"


    // $ANTLR start "rule__DataFragment__Group__0__Impl"
    // InternalDataDsl.g:2961:1: rule__DataFragment__Group__0__Impl : ( 'fragment' ) ;
    public final void rule__DataFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2965:1: ( ( 'fragment' ) )
            // InternalDataDsl.g:2966:1: ( 'fragment' )
            {
            // InternalDataDsl.g:2966:1: ( 'fragment' )
            // InternalDataDsl.g:2967:2: 'fragment'
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getFragmentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__0__Impl"


    // $ANTLR start "rule__DataFragment__Group__1"
    // InternalDataDsl.g:2976:1: rule__DataFragment__Group__1 : rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2 ;
    public final void rule__DataFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2980:1: ( rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2 )
            // InternalDataDsl.g:2981:2: rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__DataFragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__1"


    // $ANTLR start "rule__DataFragment__Group__1__Impl"
    // InternalDataDsl.g:2988:1: rule__DataFragment__Group__1__Impl : ( ( rule__DataFragment__NameAssignment_1 ) ) ;
    public final void rule__DataFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2992:1: ( ( ( rule__DataFragment__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2993:1: ( ( rule__DataFragment__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2993:1: ( ( rule__DataFragment__NameAssignment_1 ) )
            // InternalDataDsl.g:2994:2: ( rule__DataFragment__NameAssignment_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2995:2: ( rule__DataFragment__NameAssignment_1 )
            // InternalDataDsl.g:2995:3: rule__DataFragment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFragmentAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__1__Impl"


    // $ANTLR start "rule__DataFragment__Group__2"
    // InternalDataDsl.g:3003:1: rule__DataFragment__Group__2 : rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3 ;
    public final void rule__DataFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3007:1: ( rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3 )
            // InternalDataDsl.g:3008:2: rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__DataFragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__2"


    // $ANTLR start "rule__DataFragment__Group__2__Impl"
    // InternalDataDsl.g:3015:1: rule__DataFragment__Group__2__Impl : ( ( rule__DataFragment__Group_2__0 )? ) ;
    public final void rule__DataFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3019:1: ( ( ( rule__DataFragment__Group_2__0 )? ) )
            // InternalDataDsl.g:3020:1: ( ( rule__DataFragment__Group_2__0 )? )
            {
            // InternalDataDsl.g:3020:1: ( ( rule__DataFragment__Group_2__0 )? )
            // InternalDataDsl.g:3021:2: ( rule__DataFragment__Group_2__0 )?
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_2()); 
            // InternalDataDsl.g:3022:2: ( rule__DataFragment__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataDsl.g:3022:3: rule__DataFragment__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFragment__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFragmentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__2__Impl"


    // $ANTLR start "rule__DataFragment__Group__3"
    // InternalDataDsl.g:3030:1: rule__DataFragment__Group__3 : rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4 ;
    public final void rule__DataFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3034:1: ( rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4 )
            // InternalDataDsl.g:3035:2: rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__DataFragment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__3"


    // $ANTLR start "rule__DataFragment__Group__3__Impl"
    // InternalDataDsl.g:3042:1: rule__DataFragment__Group__3__Impl : ( '{' ) ;
    public final void rule__DataFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3046:1: ( ( '{' ) )
            // InternalDataDsl.g:3047:1: ( '{' )
            {
            // InternalDataDsl.g:3047:1: ( '{' )
            // InternalDataDsl.g:3048:2: '{'
            {
             before(grammarAccess.getDataFragmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__3__Impl"


    // $ANTLR start "rule__DataFragment__Group__4"
    // InternalDataDsl.g:3057:1: rule__DataFragment__Group__4 : rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5 ;
    public final void rule__DataFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3061:1: ( rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5 )
            // InternalDataDsl.g:3062:2: rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__DataFragment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__4"


    // $ANTLR start "rule__DataFragment__Group__4__Impl"
    // InternalDataDsl.g:3069:1: rule__DataFragment__Group__4__Impl : ( ( rule__DataFragment__Group_4__0 )? ) ;
    public final void rule__DataFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3073:1: ( ( ( rule__DataFragment__Group_4__0 )? ) )
            // InternalDataDsl.g:3074:1: ( ( rule__DataFragment__Group_4__0 )? )
            {
            // InternalDataDsl.g:3074:1: ( ( rule__DataFragment__Group_4__0 )? )
            // InternalDataDsl.g:3075:2: ( rule__DataFragment__Group_4__0 )?
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_4()); 
            // InternalDataDsl.g:3076:2: ( rule__DataFragment__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_ID||(LA30_0>=23 && LA30_0<=34)||(LA30_0>=75 && LA30_0<=77)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataDsl.g:3076:3: rule__DataFragment__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFragment__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFragmentAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__4__Impl"


    // $ANTLR start "rule__DataFragment__Group__5"
    // InternalDataDsl.g:3084:1: rule__DataFragment__Group__5 : rule__DataFragment__Group__5__Impl ;
    public final void rule__DataFragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3088:1: ( rule__DataFragment__Group__5__Impl )
            // InternalDataDsl.g:3089:2: rule__DataFragment__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__5"


    // $ANTLR start "rule__DataFragment__Group__5__Impl"
    // InternalDataDsl.g:3095:1: rule__DataFragment__Group__5__Impl : ( '}' ) ;
    public final void rule__DataFragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3099:1: ( ( '}' ) )
            // InternalDataDsl.g:3100:1: ( '}' )
            {
            // InternalDataDsl.g:3100:1: ( '}' )
            // InternalDataDsl.g:3101:2: '}'
            {
             before(grammarAccess.getDataFragmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__5__Impl"


    // $ANTLR start "rule__DataFragment__Group_2__0"
    // InternalDataDsl.g:3111:1: rule__DataFragment__Group_2__0 : rule__DataFragment__Group_2__0__Impl rule__DataFragment__Group_2__1 ;
    public final void rule__DataFragment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3115:1: ( rule__DataFragment__Group_2__0__Impl rule__DataFragment__Group_2__1 )
            // InternalDataDsl.g:3116:2: rule__DataFragment__Group_2__0__Impl rule__DataFragment__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DataFragment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2__0"


    // $ANTLR start "rule__DataFragment__Group_2__0__Impl"
    // InternalDataDsl.g:3123:1: rule__DataFragment__Group_2__0__Impl : ( ':' ) ;
    public final void rule__DataFragment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3127:1: ( ( ':' ) )
            // InternalDataDsl.g:3128:1: ( ':' )
            {
            // InternalDataDsl.g:3128:1: ( ':' )
            // InternalDataDsl.g:3129:2: ':'
            {
             before(grammarAccess.getDataFragmentAccess().getColonKeyword_2_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2__0__Impl"


    // $ANTLR start "rule__DataFragment__Group_2__1"
    // InternalDataDsl.g:3138:1: rule__DataFragment__Group_2__1 : rule__DataFragment__Group_2__1__Impl rule__DataFragment__Group_2__2 ;
    public final void rule__DataFragment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3142:1: ( rule__DataFragment__Group_2__1__Impl rule__DataFragment__Group_2__2 )
            // InternalDataDsl.g:3143:2: rule__DataFragment__Group_2__1__Impl rule__DataFragment__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__DataFragment__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2__1"


    // $ANTLR start "rule__DataFragment__Group_2__1__Impl"
    // InternalDataDsl.g:3150:1: rule__DataFragment__Group_2__1__Impl : ( ( rule__DataFragment__FragmentsAssignment_2_1 ) ) ;
    public final void rule__DataFragment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3154:1: ( ( ( rule__DataFragment__FragmentsAssignment_2_1 ) ) )
            // InternalDataDsl.g:3155:1: ( ( rule__DataFragment__FragmentsAssignment_2_1 ) )
            {
            // InternalDataDsl.g:3155:1: ( ( rule__DataFragment__FragmentsAssignment_2_1 ) )
            // InternalDataDsl.g:3156:2: ( rule__DataFragment__FragmentsAssignment_2_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsAssignment_2_1()); 
            // InternalDataDsl.g:3157:2: ( rule__DataFragment__FragmentsAssignment_2_1 )
            // InternalDataDsl.g:3157:3: rule__DataFragment__FragmentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__FragmentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFragmentAccess().getFragmentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2__1__Impl"


    // $ANTLR start "rule__DataFragment__Group_2__2"
    // InternalDataDsl.g:3165:1: rule__DataFragment__Group_2__2 : rule__DataFragment__Group_2__2__Impl ;
    public final void rule__DataFragment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3169:1: ( rule__DataFragment__Group_2__2__Impl )
            // InternalDataDsl.g:3170:2: rule__DataFragment__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2__2"


    // $ANTLR start "rule__DataFragment__Group_2__2__Impl"
    // InternalDataDsl.g:3176:1: rule__DataFragment__Group_2__2__Impl : ( ( rule__DataFragment__Group_2_2__0 )* ) ;
    public final void rule__DataFragment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3180:1: ( ( ( rule__DataFragment__Group_2_2__0 )* ) )
            // InternalDataDsl.g:3181:1: ( ( rule__DataFragment__Group_2_2__0 )* )
            {
            // InternalDataDsl.g:3181:1: ( ( rule__DataFragment__Group_2_2__0 )* )
            // InternalDataDsl.g:3182:2: ( rule__DataFragment__Group_2_2__0 )*
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_2_2()); 
            // InternalDataDsl.g:3183:2: ( rule__DataFragment__Group_2_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==66) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDataDsl.g:3183:3: rule__DataFragment__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataFragment__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getDataFragmentAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2__2__Impl"


    // $ANTLR start "rule__DataFragment__Group_2_2__0"
    // InternalDataDsl.g:3192:1: rule__DataFragment__Group_2_2__0 : rule__DataFragment__Group_2_2__0__Impl rule__DataFragment__Group_2_2__1 ;
    public final void rule__DataFragment__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3196:1: ( rule__DataFragment__Group_2_2__0__Impl rule__DataFragment__Group_2_2__1 )
            // InternalDataDsl.g:3197:2: rule__DataFragment__Group_2_2__0__Impl rule__DataFragment__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DataFragment__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2_2__0"


    // $ANTLR start "rule__DataFragment__Group_2_2__0__Impl"
    // InternalDataDsl.g:3204:1: rule__DataFragment__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DataFragment__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3208:1: ( ( ',' ) )
            // InternalDataDsl.g:3209:1: ( ',' )
            {
            // InternalDataDsl.g:3209:1: ( ',' )
            // InternalDataDsl.g:3210:2: ','
            {
             before(grammarAccess.getDataFragmentAccess().getCommaKeyword_2_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2_2__0__Impl"


    // $ANTLR start "rule__DataFragment__Group_2_2__1"
    // InternalDataDsl.g:3219:1: rule__DataFragment__Group_2_2__1 : rule__DataFragment__Group_2_2__1__Impl ;
    public final void rule__DataFragment__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3223:1: ( rule__DataFragment__Group_2_2__1__Impl )
            // InternalDataDsl.g:3224:2: rule__DataFragment__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2_2__1"


    // $ANTLR start "rule__DataFragment__Group_2_2__1__Impl"
    // InternalDataDsl.g:3230:1: rule__DataFragment__Group_2_2__1__Impl : ( ( rule__DataFragment__FragmentsAssignment_2_2_1 ) ) ;
    public final void rule__DataFragment__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3234:1: ( ( ( rule__DataFragment__FragmentsAssignment_2_2_1 ) ) )
            // InternalDataDsl.g:3235:1: ( ( rule__DataFragment__FragmentsAssignment_2_2_1 ) )
            {
            // InternalDataDsl.g:3235:1: ( ( rule__DataFragment__FragmentsAssignment_2_2_1 ) )
            // InternalDataDsl.g:3236:2: ( rule__DataFragment__FragmentsAssignment_2_2_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsAssignment_2_2_1()); 
            // InternalDataDsl.g:3237:2: ( rule__DataFragment__FragmentsAssignment_2_2_1 )
            // InternalDataDsl.g:3237:3: rule__DataFragment__FragmentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__FragmentsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFragmentAccess().getFragmentsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_2_2__1__Impl"


    // $ANTLR start "rule__DataFragment__Group_4__0"
    // InternalDataDsl.g:3246:1: rule__DataFragment__Group_4__0 : rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1 ;
    public final void rule__DataFragment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3250:1: ( rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1 )
            // InternalDataDsl.g:3251:2: rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__DataFragment__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_4__0"


    // $ANTLR start "rule__DataFragment__Group_4__0__Impl"
    // InternalDataDsl.g:3258:1: rule__DataFragment__Group_4__0__Impl : ( ( rule__DataFragment__NodesAssignment_4_0 ) ) ;
    public final void rule__DataFragment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3262:1: ( ( ( rule__DataFragment__NodesAssignment_4_0 ) ) )
            // InternalDataDsl.g:3263:1: ( ( rule__DataFragment__NodesAssignment_4_0 ) )
            {
            // InternalDataDsl.g:3263:1: ( ( rule__DataFragment__NodesAssignment_4_0 ) )
            // InternalDataDsl.g:3264:2: ( rule__DataFragment__NodesAssignment_4_0 )
            {
             before(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_0()); 
            // InternalDataDsl.g:3265:2: ( rule__DataFragment__NodesAssignment_4_0 )
            // InternalDataDsl.g:3265:3: rule__DataFragment__NodesAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__NodesAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_4__0__Impl"


    // $ANTLR start "rule__DataFragment__Group_4__1"
    // InternalDataDsl.g:3273:1: rule__DataFragment__Group_4__1 : rule__DataFragment__Group_4__1__Impl ;
    public final void rule__DataFragment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3277:1: ( rule__DataFragment__Group_4__1__Impl )
            // InternalDataDsl.g:3278:2: rule__DataFragment__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_4__1"


    // $ANTLR start "rule__DataFragment__Group_4__1__Impl"
    // InternalDataDsl.g:3284:1: rule__DataFragment__Group_4__1__Impl : ( ( rule__DataFragment__Group_4_1__0 )* ) ;
    public final void rule__DataFragment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3288:1: ( ( ( rule__DataFragment__Group_4_1__0 )* ) )
            // InternalDataDsl.g:3289:1: ( ( rule__DataFragment__Group_4_1__0 )* )
            {
            // InternalDataDsl.g:3289:1: ( ( rule__DataFragment__Group_4_1__0 )* )
            // InternalDataDsl.g:3290:2: ( rule__DataFragment__Group_4_1__0 )*
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_4_1()); 
            // InternalDataDsl.g:3291:2: ( rule__DataFragment__Group_4_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==66) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalDataDsl.g:3291:3: rule__DataFragment__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataFragment__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getDataFragmentAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_4__1__Impl"


    // $ANTLR start "rule__DataFragment__Group_4_1__0"
    // InternalDataDsl.g:3300:1: rule__DataFragment__Group_4_1__0 : rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1 ;
    public final void rule__DataFragment__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3304:1: ( rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1 )
            // InternalDataDsl.g:3305:2: rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1
            {
            pushFollow(FOLLOW_26);
            rule__DataFragment__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_4_1__0"


    // $ANTLR start "rule__DataFragment__Group_4_1__0__Impl"
    // InternalDataDsl.g:3312:1: rule__DataFragment__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__DataFragment__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3316:1: ( ( ',' ) )
            // InternalDataDsl.g:3317:1: ( ',' )
            {
            // InternalDataDsl.g:3317:1: ( ',' )
            // InternalDataDsl.g:3318:2: ','
            {
             before(grammarAccess.getDataFragmentAccess().getCommaKeyword_4_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_4_1__0__Impl"


    // $ANTLR start "rule__DataFragment__Group_4_1__1"
    // InternalDataDsl.g:3327:1: rule__DataFragment__Group_4_1__1 : rule__DataFragment__Group_4_1__1__Impl ;
    public final void rule__DataFragment__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3331:1: ( rule__DataFragment__Group_4_1__1__Impl )
            // InternalDataDsl.g:3332:2: rule__DataFragment__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_4_1__1"


    // $ANTLR start "rule__DataFragment__Group_4_1__1__Impl"
    // InternalDataDsl.g:3338:1: rule__DataFragment__Group_4_1__1__Impl : ( ( rule__DataFragment__NodesAssignment_4_1_1 ) ) ;
    public final void rule__DataFragment__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3342:1: ( ( ( rule__DataFragment__NodesAssignment_4_1_1 ) ) )
            // InternalDataDsl.g:3343:1: ( ( rule__DataFragment__NodesAssignment_4_1_1 ) )
            {
            // InternalDataDsl.g:3343:1: ( ( rule__DataFragment__NodesAssignment_4_1_1 ) )
            // InternalDataDsl.g:3344:2: ( rule__DataFragment__NodesAssignment_4_1_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_1_1()); 
            // InternalDataDsl.g:3345:2: ( rule__DataFragment__NodesAssignment_4_1_1 )
            // InternalDataDsl.g:3345:3: rule__DataFragment__NodesAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__NodesAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_4_1__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDataDsl.g:3354:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3358:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDataDsl.g:3359:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalDataDsl.g:3366:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3370:1: ( ( 'datatype' ) )
            // InternalDataDsl.g:3371:1: ( 'datatype' )
            {
            // InternalDataDsl.g:3371:1: ( 'datatype' )
            // InternalDataDsl.g:3372:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalDataDsl.g:3381:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3385:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalDataDsl.g:3386:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__DataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalDataDsl.g:3393:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3397:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalDataDsl.g:3398:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:3398:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalDataDsl.g:3399:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:3400:2: ( rule__DataType__NameAssignment_1 )
            // InternalDataDsl.g:3400:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__2"
    // InternalDataDsl.g:3408:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3412:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // InternalDataDsl.g:3413:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__DataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2"


    // $ANTLR start "rule__DataType__Group__2__Impl"
    // InternalDataDsl.g:3420:1: rule__DataType__Group__2__Impl : ( ':' ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3424:1: ( ( ':' ) )
            // InternalDataDsl.g:3425:1: ( ':' )
            {
            // InternalDataDsl.g:3425:1: ( ':' )
            // InternalDataDsl.g:3426:2: ':'
            {
             before(grammarAccess.getDataTypeAccess().getColonKeyword_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__2__Impl"


    // $ANTLR start "rule__DataType__Group__3"
    // InternalDataDsl.g:3435:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3439:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // InternalDataDsl.g:3440:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__DataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__3"


    // $ANTLR start "rule__DataType__Group__3__Impl"
    // InternalDataDsl.g:3447:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__RefineAssignment_3 ) ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3451:1: ( ( ( rule__DataType__RefineAssignment_3 ) ) )
            // InternalDataDsl.g:3452:1: ( ( rule__DataType__RefineAssignment_3 ) )
            {
            // InternalDataDsl.g:3452:1: ( ( rule__DataType__RefineAssignment_3 ) )
            // InternalDataDsl.g:3453:2: ( rule__DataType__RefineAssignment_3 )
            {
             before(grammarAccess.getDataTypeAccess().getRefineAssignment_3()); 
            // InternalDataDsl.g:3454:2: ( rule__DataType__RefineAssignment_3 )
            // InternalDataDsl.g:3454:3: rule__DataType__RefineAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataType__RefineAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getRefineAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__3__Impl"


    // $ANTLR start "rule__DataType__Group__4"
    // InternalDataDsl.g:3462:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3466:1: ( rule__DataType__Group__4__Impl )
            // InternalDataDsl.g:3467:2: rule__DataType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__4"


    // $ANTLR start "rule__DataType__Group__4__Impl"
    // InternalDataDsl.g:3473:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__Group_4__0 )? ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3477:1: ( ( ( rule__DataType__Group_4__0 )? ) )
            // InternalDataDsl.g:3478:1: ( ( rule__DataType__Group_4__0 )? )
            {
            // InternalDataDsl.g:3478:1: ( ( rule__DataType__Group_4__0 )? )
            // InternalDataDsl.g:3479:2: ( rule__DataType__Group_4__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_4()); 
            // InternalDataDsl.g:3480:2: ( rule__DataType__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==61) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataDsl.g:3480:3: rule__DataType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__4__Impl"


    // $ANTLR start "rule__DataType__Group_4__0"
    // InternalDataDsl.g:3489:1: rule__DataType__Group_4__0 : rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 ;
    public final void rule__DataType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3493:1: ( rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 )
            // InternalDataDsl.g:3494:2: rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__DataType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__0"


    // $ANTLR start "rule__DataType__Group_4__0__Impl"
    // InternalDataDsl.g:3501:1: rule__DataType__Group_4__0__Impl : ( '{' ) ;
    public final void rule__DataType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3505:1: ( ( '{' ) )
            // InternalDataDsl.g:3506:1: ( '{' )
            {
            // InternalDataDsl.g:3506:1: ( '{' )
            // InternalDataDsl.g:3507:2: '{'
            {
             before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__0__Impl"


    // $ANTLR start "rule__DataType__Group_4__1"
    // InternalDataDsl.g:3516:1: rule__DataType__Group_4__1 : rule__DataType__Group_4__1__Impl rule__DataType__Group_4__2 ;
    public final void rule__DataType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3520:1: ( rule__DataType__Group_4__1__Impl rule__DataType__Group_4__2 )
            // InternalDataDsl.g:3521:2: rule__DataType__Group_4__1__Impl rule__DataType__Group_4__2
            {
            pushFollow(FOLLOW_28);
            rule__DataType__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__1"


    // $ANTLR start "rule__DataType__Group_4__1__Impl"
    // InternalDataDsl.g:3528:1: rule__DataType__Group_4__1__Impl : ( ( rule__DataType__OptionsAssignment_4_1 ) ) ;
    public final void rule__DataType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3532:1: ( ( ( rule__DataType__OptionsAssignment_4_1 ) ) )
            // InternalDataDsl.g:3533:1: ( ( rule__DataType__OptionsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:3533:1: ( ( rule__DataType__OptionsAssignment_4_1 ) )
            // InternalDataDsl.g:3534:2: ( rule__DataType__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getDataTypeAccess().getOptionsAssignment_4_1()); 
            // InternalDataDsl.g:3535:2: ( rule__DataType__OptionsAssignment_4_1 )
            // InternalDataDsl.g:3535:3: rule__DataType__OptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__OptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getOptionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__1__Impl"


    // $ANTLR start "rule__DataType__Group_4__2"
    // InternalDataDsl.g:3543:1: rule__DataType__Group_4__2 : rule__DataType__Group_4__2__Impl rule__DataType__Group_4__3 ;
    public final void rule__DataType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3547:1: ( rule__DataType__Group_4__2__Impl rule__DataType__Group_4__3 )
            // InternalDataDsl.g:3548:2: rule__DataType__Group_4__2__Impl rule__DataType__Group_4__3
            {
            pushFollow(FOLLOW_28);
            rule__DataType__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__2"


    // $ANTLR start "rule__DataType__Group_4__2__Impl"
    // InternalDataDsl.g:3555:1: rule__DataType__Group_4__2__Impl : ( ( rule__DataType__Group_4_2__0 )* ) ;
    public final void rule__DataType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3559:1: ( ( ( rule__DataType__Group_4_2__0 )* ) )
            // InternalDataDsl.g:3560:1: ( ( rule__DataType__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:3560:1: ( ( rule__DataType__Group_4_2__0 )* )
            // InternalDataDsl.g:3561:2: ( rule__DataType__Group_4_2__0 )*
            {
             before(grammarAccess.getDataTypeAccess().getGroup_4_2()); 
            // InternalDataDsl.g:3562:2: ( rule__DataType__Group_4_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==66) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDataDsl.g:3562:3: rule__DataType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataType__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getDataTypeAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__2__Impl"


    // $ANTLR start "rule__DataType__Group_4__3"
    // InternalDataDsl.g:3570:1: rule__DataType__Group_4__3 : rule__DataType__Group_4__3__Impl ;
    public final void rule__DataType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3574:1: ( rule__DataType__Group_4__3__Impl )
            // InternalDataDsl.g:3575:2: rule__DataType__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__3"


    // $ANTLR start "rule__DataType__Group_4__3__Impl"
    // InternalDataDsl.g:3581:1: rule__DataType__Group_4__3__Impl : ( '}' ) ;
    public final void rule__DataType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3585:1: ( ( '}' ) )
            // InternalDataDsl.g:3586:1: ( '}' )
            {
            // InternalDataDsl.g:3586:1: ( '}' )
            // InternalDataDsl.g:3587:2: '}'
            {
             before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4__3__Impl"


    // $ANTLR start "rule__DataType__Group_4_2__0"
    // InternalDataDsl.g:3597:1: rule__DataType__Group_4_2__0 : rule__DataType__Group_4_2__0__Impl rule__DataType__Group_4_2__1 ;
    public final void rule__DataType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3601:1: ( rule__DataType__Group_4_2__0__Impl rule__DataType__Group_4_2__1 )
            // InternalDataDsl.g:3602:2: rule__DataType__Group_4_2__0__Impl rule__DataType__Group_4_2__1
            {
            pushFollow(FOLLOW_31);
            rule__DataType__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4_2__0"


    // $ANTLR start "rule__DataType__Group_4_2__0__Impl"
    // InternalDataDsl.g:3609:1: rule__DataType__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__DataType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3613:1: ( ( ',' ) )
            // InternalDataDsl.g:3614:1: ( ',' )
            {
            // InternalDataDsl.g:3614:1: ( ',' )
            // InternalDataDsl.g:3615:2: ','
            {
             before(grammarAccess.getDataTypeAccess().getCommaKeyword_4_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4_2__0__Impl"


    // $ANTLR start "rule__DataType__Group_4_2__1"
    // InternalDataDsl.g:3624:1: rule__DataType__Group_4_2__1 : rule__DataType__Group_4_2__1__Impl ;
    public final void rule__DataType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3628:1: ( rule__DataType__Group_4_2__1__Impl )
            // InternalDataDsl.g:3629:2: rule__DataType__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4_2__1"


    // $ANTLR start "rule__DataType__Group_4_2__1__Impl"
    // InternalDataDsl.g:3635:1: rule__DataType__Group_4_2__1__Impl : ( ( rule__DataType__OptionsAssignment_4_2_1 ) ) ;
    public final void rule__DataType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3639:1: ( ( ( rule__DataType__OptionsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:3640:1: ( ( rule__DataType__OptionsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:3640:1: ( ( rule__DataType__OptionsAssignment_4_2_1 ) )
            // InternalDataDsl.g:3641:2: ( rule__DataType__OptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getDataTypeAccess().getOptionsAssignment_4_2_1()); 
            // InternalDataDsl.g:3642:2: ( rule__DataType__OptionsAssignment_4_2_1 )
            // InternalDataDsl.g:3642:3: rule__DataType__OptionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__OptionsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getOptionsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_4_2__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalDataDsl.g:3651:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3655:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalDataDsl.g:3656:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // InternalDataDsl.g:3663:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3667:1: ( ( 'enumeration' ) )
            // InternalDataDsl.g:3668:1: ( 'enumeration' )
            {
            // InternalDataDsl.g:3668:1: ( 'enumeration' )
            // InternalDataDsl.g:3669:2: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalDataDsl.g:3678:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3682:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalDataDsl.g:3683:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // InternalDataDsl.g:3690:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3694:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalDataDsl.g:3695:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:3695:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalDataDsl.g:3696:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:3697:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalDataDsl.g:3697:3: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // InternalDataDsl.g:3705:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3709:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalDataDsl.g:3710:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // InternalDataDsl.g:3717:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3721:1: ( ( '{' ) )
            // InternalDataDsl.g:3722:1: ( '{' )
            {
            // InternalDataDsl.g:3722:1: ( '{' )
            // InternalDataDsl.g:3723:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // InternalDataDsl.g:3732:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3736:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalDataDsl.g:3737:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // InternalDataDsl.g:3744:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__ValuesAssignment_3 ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3748:1: ( ( ( rule__Enumeration__ValuesAssignment_3 ) ) )
            // InternalDataDsl.g:3749:1: ( ( rule__Enumeration__ValuesAssignment_3 ) )
            {
            // InternalDataDsl.g:3749:1: ( ( rule__Enumeration__ValuesAssignment_3 ) )
            // InternalDataDsl.g:3750:2: ( rule__Enumeration__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_3()); 
            // InternalDataDsl.g:3751:2: ( rule__Enumeration__ValuesAssignment_3 )
            // InternalDataDsl.g:3751:3: rule__Enumeration__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValuesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // InternalDataDsl.g:3759:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3763:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalDataDsl.g:3764:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // InternalDataDsl.g:3771:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3775:1: ( ( ( rule__Enumeration__Group_4__0 )* ) )
            // InternalDataDsl.g:3776:1: ( ( rule__Enumeration__Group_4__0 )* )
            {
            // InternalDataDsl.g:3776:1: ( ( rule__Enumeration__Group_4__0 )* )
            // InternalDataDsl.g:3777:2: ( rule__Enumeration__Group_4__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // InternalDataDsl.g:3778:2: ( rule__Enumeration__Group_4__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==66) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalDataDsl.g:3778:3: rule__Enumeration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Enumeration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // InternalDataDsl.g:3786:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3790:1: ( rule__Enumeration__Group__5__Impl )
            // InternalDataDsl.g:3791:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // InternalDataDsl.g:3797:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3801:1: ( ( '}' ) )
            // InternalDataDsl.g:3802:1: ( '}' )
            {
            // InternalDataDsl.g:3802:1: ( '}' )
            // InternalDataDsl.g:3803:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__0"
    // InternalDataDsl.g:3813:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3817:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // InternalDataDsl.g:3818:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__Enumeration__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__0"


    // $ANTLR start "rule__Enumeration__Group_4__0__Impl"
    // InternalDataDsl.g:3825:1: rule__Enumeration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3829:1: ( ( ',' ) )
            // InternalDataDsl.g:3830:1: ( ',' )
            {
            // InternalDataDsl.g:3830:1: ( ',' )
            // InternalDataDsl.g:3831:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_4__1"
    // InternalDataDsl.g:3840:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3844:1: ( rule__Enumeration__Group_4__1__Impl )
            // InternalDataDsl.g:3845:2: rule__Enumeration__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__1"


    // $ANTLR start "rule__Enumeration__Group_4__1__Impl"
    // InternalDataDsl.g:3851:1: rule__Enumeration__Group_4__1__Impl : ( ( rule__Enumeration__ValuesAssignment_4_1 ) ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3855:1: ( ( ( rule__Enumeration__ValuesAssignment_4_1 ) ) )
            // InternalDataDsl.g:3856:1: ( ( rule__Enumeration__ValuesAssignment_4_1 ) )
            {
            // InternalDataDsl.g:3856:1: ( ( rule__Enumeration__ValuesAssignment_4_1 ) )
            // InternalDataDsl.g:3857:2: ( rule__Enumeration__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_4_1()); 
            // InternalDataDsl.g:3858:2: ( rule__Enumeration__ValuesAssignment_4_1 )
            // InternalDataDsl.g:3858:3: rule__Enumeration__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group_4__1__Impl"


    // $ANTLR start "rule__StructDataType__Group__0"
    // InternalDataDsl.g:3867:1: rule__StructDataType__Group__0 : rule__StructDataType__Group__0__Impl rule__StructDataType__Group__1 ;
    public final void rule__StructDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3871:1: ( rule__StructDataType__Group__0__Impl rule__StructDataType__Group__1 )
            // InternalDataDsl.g:3872:2: rule__StructDataType__Group__0__Impl rule__StructDataType__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StructDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__0"


    // $ANTLR start "rule__StructDataType__Group__0__Impl"
    // InternalDataDsl.g:3879:1: rule__StructDataType__Group__0__Impl : ( 'struct' ) ;
    public final void rule__StructDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3883:1: ( ( 'struct' ) )
            // InternalDataDsl.g:3884:1: ( 'struct' )
            {
            // InternalDataDsl.g:3884:1: ( 'struct' )
            // InternalDataDsl.g:3885:2: 'struct'
            {
             before(grammarAccess.getStructDataTypeAccess().getStructKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getStructDataTypeAccess().getStructKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__0__Impl"


    // $ANTLR start "rule__StructDataType__Group__1"
    // InternalDataDsl.g:3894:1: rule__StructDataType__Group__1 : rule__StructDataType__Group__1__Impl rule__StructDataType__Group__2 ;
    public final void rule__StructDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3898:1: ( rule__StructDataType__Group__1__Impl rule__StructDataType__Group__2 )
            // InternalDataDsl.g:3899:2: rule__StructDataType__Group__1__Impl rule__StructDataType__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__StructDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__1"


    // $ANTLR start "rule__StructDataType__Group__1__Impl"
    // InternalDataDsl.g:3906:1: rule__StructDataType__Group__1__Impl : ( ( rule__StructDataType__NameAssignment_1 ) ) ;
    public final void rule__StructDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3910:1: ( ( ( rule__StructDataType__NameAssignment_1 ) ) )
            // InternalDataDsl.g:3911:1: ( ( rule__StructDataType__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:3911:1: ( ( rule__StructDataType__NameAssignment_1 ) )
            // InternalDataDsl.g:3912:2: ( rule__StructDataType__NameAssignment_1 )
            {
             before(grammarAccess.getStructDataTypeAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:3913:2: ( rule__StructDataType__NameAssignment_1 )
            // InternalDataDsl.g:3913:3: rule__StructDataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStructDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__1__Impl"


    // $ANTLR start "rule__StructDataType__Group__2"
    // InternalDataDsl.g:3921:1: rule__StructDataType__Group__2 : rule__StructDataType__Group__2__Impl rule__StructDataType__Group__3 ;
    public final void rule__StructDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3925:1: ( rule__StructDataType__Group__2__Impl rule__StructDataType__Group__3 )
            // InternalDataDsl.g:3926:2: rule__StructDataType__Group__2__Impl rule__StructDataType__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__StructDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__2"


    // $ANTLR start "rule__StructDataType__Group__2__Impl"
    // InternalDataDsl.g:3933:1: rule__StructDataType__Group__2__Impl : ( '{' ) ;
    public final void rule__StructDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3937:1: ( ( '{' ) )
            // InternalDataDsl.g:3938:1: ( '{' )
            {
            // InternalDataDsl.g:3938:1: ( '{' )
            // InternalDataDsl.g:3939:2: '{'
            {
             before(grammarAccess.getStructDataTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getStructDataTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__2__Impl"


    // $ANTLR start "rule__StructDataType__Group__3"
    // InternalDataDsl.g:3948:1: rule__StructDataType__Group__3 : rule__StructDataType__Group__3__Impl rule__StructDataType__Group__4 ;
    public final void rule__StructDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3952:1: ( rule__StructDataType__Group__3__Impl rule__StructDataType__Group__4 )
            // InternalDataDsl.g:3953:2: rule__StructDataType__Group__3__Impl rule__StructDataType__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__StructDataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__3"


    // $ANTLR start "rule__StructDataType__Group__3__Impl"
    // InternalDataDsl.g:3960:1: rule__StructDataType__Group__3__Impl : ( ( rule__StructDataType__Group_3__0 ) ) ;
    public final void rule__StructDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3964:1: ( ( ( rule__StructDataType__Group_3__0 ) ) )
            // InternalDataDsl.g:3965:1: ( ( rule__StructDataType__Group_3__0 ) )
            {
            // InternalDataDsl.g:3965:1: ( ( rule__StructDataType__Group_3__0 ) )
            // InternalDataDsl.g:3966:2: ( rule__StructDataType__Group_3__0 )
            {
             before(grammarAccess.getStructDataTypeAccess().getGroup_3()); 
            // InternalDataDsl.g:3967:2: ( rule__StructDataType__Group_3__0 )
            // InternalDataDsl.g:3967:3: rule__StructDataType__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getStructDataTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__3__Impl"


    // $ANTLR start "rule__StructDataType__Group__4"
    // InternalDataDsl.g:3975:1: rule__StructDataType__Group__4 : rule__StructDataType__Group__4__Impl rule__StructDataType__Group__5 ;
    public final void rule__StructDataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3979:1: ( rule__StructDataType__Group__4__Impl rule__StructDataType__Group__5 )
            // InternalDataDsl.g:3980:2: rule__StructDataType__Group__4__Impl rule__StructDataType__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__StructDataType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__4"


    // $ANTLR start "rule__StructDataType__Group__4__Impl"
    // InternalDataDsl.g:3987:1: rule__StructDataType__Group__4__Impl : ( '}' ) ;
    public final void rule__StructDataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3991:1: ( ( '}' ) )
            // InternalDataDsl.g:3992:1: ( '}' )
            {
            // InternalDataDsl.g:3992:1: ( '}' )
            // InternalDataDsl.g:3993:2: '}'
            {
             before(grammarAccess.getStructDataTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getStructDataTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__4__Impl"


    // $ANTLR start "rule__StructDataType__Group__5"
    // InternalDataDsl.g:4002:1: rule__StructDataType__Group__5 : rule__StructDataType__Group__5__Impl ;
    public final void rule__StructDataType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4006:1: ( rule__StructDataType__Group__5__Impl )
            // InternalDataDsl.g:4007:2: rule__StructDataType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__5"


    // $ANTLR start "rule__StructDataType__Group__5__Impl"
    // InternalDataDsl.g:4013:1: rule__StructDataType__Group__5__Impl : ( ( rule__StructDataType__Group_5__0 )? ) ;
    public final void rule__StructDataType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4017:1: ( ( ( rule__StructDataType__Group_5__0 )? ) )
            // InternalDataDsl.g:4018:1: ( ( rule__StructDataType__Group_5__0 )? )
            {
            // InternalDataDsl.g:4018:1: ( ( rule__StructDataType__Group_5__0 )? )
            // InternalDataDsl.g:4019:2: ( rule__StructDataType__Group_5__0 )?
            {
             before(grammarAccess.getStructDataTypeAccess().getGroup_5()); 
            // InternalDataDsl.g:4020:2: ( rule__StructDataType__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==61) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataDsl.g:4020:3: rule__StructDataType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructDataType__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructDataTypeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group__5__Impl"


    // $ANTLR start "rule__StructDataType__Group_3__0"
    // InternalDataDsl.g:4029:1: rule__StructDataType__Group_3__0 : rule__StructDataType__Group_3__0__Impl rule__StructDataType__Group_3__1 ;
    public final void rule__StructDataType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4033:1: ( rule__StructDataType__Group_3__0__Impl rule__StructDataType__Group_3__1 )
            // InternalDataDsl.g:4034:2: rule__StructDataType__Group_3__0__Impl rule__StructDataType__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__StructDataType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_3__0"


    // $ANTLR start "rule__StructDataType__Group_3__0__Impl"
    // InternalDataDsl.g:4041:1: rule__StructDataType__Group_3__0__Impl : ( ( rule__StructDataType__SubnodesAssignment_3_0 ) ) ;
    public final void rule__StructDataType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4045:1: ( ( ( rule__StructDataType__SubnodesAssignment_3_0 ) ) )
            // InternalDataDsl.g:4046:1: ( ( rule__StructDataType__SubnodesAssignment_3_0 ) )
            {
            // InternalDataDsl.g:4046:1: ( ( rule__StructDataType__SubnodesAssignment_3_0 ) )
            // InternalDataDsl.g:4047:2: ( rule__StructDataType__SubnodesAssignment_3_0 )
            {
             before(grammarAccess.getStructDataTypeAccess().getSubnodesAssignment_3_0()); 
            // InternalDataDsl.g:4048:2: ( rule__StructDataType__SubnodesAssignment_3_0 )
            // InternalDataDsl.g:4048:3: rule__StructDataType__SubnodesAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__SubnodesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStructDataTypeAccess().getSubnodesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_3__0__Impl"


    // $ANTLR start "rule__StructDataType__Group_3__1"
    // InternalDataDsl.g:4056:1: rule__StructDataType__Group_3__1 : rule__StructDataType__Group_3__1__Impl ;
    public final void rule__StructDataType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4060:1: ( rule__StructDataType__Group_3__1__Impl )
            // InternalDataDsl.g:4061:2: rule__StructDataType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_3__1"


    // $ANTLR start "rule__StructDataType__Group_3__1__Impl"
    // InternalDataDsl.g:4067:1: rule__StructDataType__Group_3__1__Impl : ( ( rule__StructDataType__Group_3_1__0 )* ) ;
    public final void rule__StructDataType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4071:1: ( ( ( rule__StructDataType__Group_3_1__0 )* ) )
            // InternalDataDsl.g:4072:1: ( ( rule__StructDataType__Group_3_1__0 )* )
            {
            // InternalDataDsl.g:4072:1: ( ( rule__StructDataType__Group_3_1__0 )* )
            // InternalDataDsl.g:4073:2: ( rule__StructDataType__Group_3_1__0 )*
            {
             before(grammarAccess.getStructDataTypeAccess().getGroup_3_1()); 
            // InternalDataDsl.g:4074:2: ( rule__StructDataType__Group_3_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==66) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalDataDsl.g:4074:3: rule__StructDataType__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StructDataType__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getStructDataTypeAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_3__1__Impl"


    // $ANTLR start "rule__StructDataType__Group_3_1__0"
    // InternalDataDsl.g:4083:1: rule__StructDataType__Group_3_1__0 : rule__StructDataType__Group_3_1__0__Impl rule__StructDataType__Group_3_1__1 ;
    public final void rule__StructDataType__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4087:1: ( rule__StructDataType__Group_3_1__0__Impl rule__StructDataType__Group_3_1__1 )
            // InternalDataDsl.g:4088:2: rule__StructDataType__Group_3_1__0__Impl rule__StructDataType__Group_3_1__1
            {
            pushFollow(FOLLOW_26);
            rule__StructDataType__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_3_1__0"


    // $ANTLR start "rule__StructDataType__Group_3_1__0__Impl"
    // InternalDataDsl.g:4095:1: rule__StructDataType__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__StructDataType__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4099:1: ( ( ',' ) )
            // InternalDataDsl.g:4100:1: ( ',' )
            {
            // InternalDataDsl.g:4100:1: ( ',' )
            // InternalDataDsl.g:4101:2: ','
            {
             before(grammarAccess.getStructDataTypeAccess().getCommaKeyword_3_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getStructDataTypeAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_3_1__0__Impl"


    // $ANTLR start "rule__StructDataType__Group_3_1__1"
    // InternalDataDsl.g:4110:1: rule__StructDataType__Group_3_1__1 : rule__StructDataType__Group_3_1__1__Impl ;
    public final void rule__StructDataType__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4114:1: ( rule__StructDataType__Group_3_1__1__Impl )
            // InternalDataDsl.g:4115:2: rule__StructDataType__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_3_1__1"


    // $ANTLR start "rule__StructDataType__Group_3_1__1__Impl"
    // InternalDataDsl.g:4121:1: rule__StructDataType__Group_3_1__1__Impl : ( ( rule__StructDataType__SubnodesAssignment_3_1_1 ) ) ;
    public final void rule__StructDataType__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4125:1: ( ( ( rule__StructDataType__SubnodesAssignment_3_1_1 ) ) )
            // InternalDataDsl.g:4126:1: ( ( rule__StructDataType__SubnodesAssignment_3_1_1 ) )
            {
            // InternalDataDsl.g:4126:1: ( ( rule__StructDataType__SubnodesAssignment_3_1_1 ) )
            // InternalDataDsl.g:4127:2: ( rule__StructDataType__SubnodesAssignment_3_1_1 )
            {
             before(grammarAccess.getStructDataTypeAccess().getSubnodesAssignment_3_1_1()); 
            // InternalDataDsl.g:4128:2: ( rule__StructDataType__SubnodesAssignment_3_1_1 )
            // InternalDataDsl.g:4128:3: rule__StructDataType__SubnodesAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__SubnodesAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStructDataTypeAccess().getSubnodesAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_3_1__1__Impl"


    // $ANTLR start "rule__StructDataType__Group_5__0"
    // InternalDataDsl.g:4137:1: rule__StructDataType__Group_5__0 : rule__StructDataType__Group_5__0__Impl rule__StructDataType__Group_5__1 ;
    public final void rule__StructDataType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4141:1: ( rule__StructDataType__Group_5__0__Impl rule__StructDataType__Group_5__1 )
            // InternalDataDsl.g:4142:2: rule__StructDataType__Group_5__0__Impl rule__StructDataType__Group_5__1
            {
            pushFollow(FOLLOW_31);
            rule__StructDataType__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5__0"


    // $ANTLR start "rule__StructDataType__Group_5__0__Impl"
    // InternalDataDsl.g:4149:1: rule__StructDataType__Group_5__0__Impl : ( '{' ) ;
    public final void rule__StructDataType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4153:1: ( ( '{' ) )
            // InternalDataDsl.g:4154:1: ( '{' )
            {
            // InternalDataDsl.g:4154:1: ( '{' )
            // InternalDataDsl.g:4155:2: '{'
            {
             before(grammarAccess.getStructDataTypeAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getStructDataTypeAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5__0__Impl"


    // $ANTLR start "rule__StructDataType__Group_5__1"
    // InternalDataDsl.g:4164:1: rule__StructDataType__Group_5__1 : rule__StructDataType__Group_5__1__Impl rule__StructDataType__Group_5__2 ;
    public final void rule__StructDataType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4168:1: ( rule__StructDataType__Group_5__1__Impl rule__StructDataType__Group_5__2 )
            // InternalDataDsl.g:4169:2: rule__StructDataType__Group_5__1__Impl rule__StructDataType__Group_5__2
            {
            pushFollow(FOLLOW_28);
            rule__StructDataType__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5__1"


    // $ANTLR start "rule__StructDataType__Group_5__1__Impl"
    // InternalDataDsl.g:4176:1: rule__StructDataType__Group_5__1__Impl : ( ( rule__StructDataType__OptionsAssignment_5_1 ) ) ;
    public final void rule__StructDataType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4180:1: ( ( ( rule__StructDataType__OptionsAssignment_5_1 ) ) )
            // InternalDataDsl.g:4181:1: ( ( rule__StructDataType__OptionsAssignment_5_1 ) )
            {
            // InternalDataDsl.g:4181:1: ( ( rule__StructDataType__OptionsAssignment_5_1 ) )
            // InternalDataDsl.g:4182:2: ( rule__StructDataType__OptionsAssignment_5_1 )
            {
             before(grammarAccess.getStructDataTypeAccess().getOptionsAssignment_5_1()); 
            // InternalDataDsl.g:4183:2: ( rule__StructDataType__OptionsAssignment_5_1 )
            // InternalDataDsl.g:4183:3: rule__StructDataType__OptionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__OptionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStructDataTypeAccess().getOptionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5__1__Impl"


    // $ANTLR start "rule__StructDataType__Group_5__2"
    // InternalDataDsl.g:4191:1: rule__StructDataType__Group_5__2 : rule__StructDataType__Group_5__2__Impl rule__StructDataType__Group_5__3 ;
    public final void rule__StructDataType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4195:1: ( rule__StructDataType__Group_5__2__Impl rule__StructDataType__Group_5__3 )
            // InternalDataDsl.g:4196:2: rule__StructDataType__Group_5__2__Impl rule__StructDataType__Group_5__3
            {
            pushFollow(FOLLOW_28);
            rule__StructDataType__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5__2"


    // $ANTLR start "rule__StructDataType__Group_5__2__Impl"
    // InternalDataDsl.g:4203:1: rule__StructDataType__Group_5__2__Impl : ( ( rule__StructDataType__Group_5_2__0 )* ) ;
    public final void rule__StructDataType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4207:1: ( ( ( rule__StructDataType__Group_5_2__0 )* ) )
            // InternalDataDsl.g:4208:1: ( ( rule__StructDataType__Group_5_2__0 )* )
            {
            // InternalDataDsl.g:4208:1: ( ( rule__StructDataType__Group_5_2__0 )* )
            // InternalDataDsl.g:4209:2: ( rule__StructDataType__Group_5_2__0 )*
            {
             before(grammarAccess.getStructDataTypeAccess().getGroup_5_2()); 
            // InternalDataDsl.g:4210:2: ( rule__StructDataType__Group_5_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==66) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalDataDsl.g:4210:3: rule__StructDataType__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__StructDataType__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getStructDataTypeAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5__2__Impl"


    // $ANTLR start "rule__StructDataType__Group_5__3"
    // InternalDataDsl.g:4218:1: rule__StructDataType__Group_5__3 : rule__StructDataType__Group_5__3__Impl ;
    public final void rule__StructDataType__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4222:1: ( rule__StructDataType__Group_5__3__Impl )
            // InternalDataDsl.g:4223:2: rule__StructDataType__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5__3"


    // $ANTLR start "rule__StructDataType__Group_5__3__Impl"
    // InternalDataDsl.g:4229:1: rule__StructDataType__Group_5__3__Impl : ( '}' ) ;
    public final void rule__StructDataType__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4233:1: ( ( '}' ) )
            // InternalDataDsl.g:4234:1: ( '}' )
            {
            // InternalDataDsl.g:4234:1: ( '}' )
            // InternalDataDsl.g:4235:2: '}'
            {
             before(grammarAccess.getStructDataTypeAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getStructDataTypeAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5__3__Impl"


    // $ANTLR start "rule__StructDataType__Group_5_2__0"
    // InternalDataDsl.g:4245:1: rule__StructDataType__Group_5_2__0 : rule__StructDataType__Group_5_2__0__Impl rule__StructDataType__Group_5_2__1 ;
    public final void rule__StructDataType__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4249:1: ( rule__StructDataType__Group_5_2__0__Impl rule__StructDataType__Group_5_2__1 )
            // InternalDataDsl.g:4250:2: rule__StructDataType__Group_5_2__0__Impl rule__StructDataType__Group_5_2__1
            {
            pushFollow(FOLLOW_31);
            rule__StructDataType__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5_2__0"


    // $ANTLR start "rule__StructDataType__Group_5_2__0__Impl"
    // InternalDataDsl.g:4257:1: rule__StructDataType__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__StructDataType__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4261:1: ( ( ',' ) )
            // InternalDataDsl.g:4262:1: ( ',' )
            {
            // InternalDataDsl.g:4262:1: ( ',' )
            // InternalDataDsl.g:4263:2: ','
            {
             before(grammarAccess.getStructDataTypeAccess().getCommaKeyword_5_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getStructDataTypeAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5_2__0__Impl"


    // $ANTLR start "rule__StructDataType__Group_5_2__1"
    // InternalDataDsl.g:4272:1: rule__StructDataType__Group_5_2__1 : rule__StructDataType__Group_5_2__1__Impl ;
    public final void rule__StructDataType__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4276:1: ( rule__StructDataType__Group_5_2__1__Impl )
            // InternalDataDsl.g:4277:2: rule__StructDataType__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5_2__1"


    // $ANTLR start "rule__StructDataType__Group_5_2__1__Impl"
    // InternalDataDsl.g:4283:1: rule__StructDataType__Group_5_2__1__Impl : ( ( rule__StructDataType__OptionsAssignment_5_2_1 ) ) ;
    public final void rule__StructDataType__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4287:1: ( ( ( rule__StructDataType__OptionsAssignment_5_2_1 ) ) )
            // InternalDataDsl.g:4288:1: ( ( rule__StructDataType__OptionsAssignment_5_2_1 ) )
            {
            // InternalDataDsl.g:4288:1: ( ( rule__StructDataType__OptionsAssignment_5_2_1 ) )
            // InternalDataDsl.g:4289:2: ( rule__StructDataType__OptionsAssignment_5_2_1 )
            {
             before(grammarAccess.getStructDataTypeAccess().getOptionsAssignment_5_2_1()); 
            // InternalDataDsl.g:4290:2: ( rule__StructDataType__OptionsAssignment_5_2_1 )
            // InternalDataDsl.g:4290:3: rule__StructDataType__OptionsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StructDataType__OptionsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStructDataTypeAccess().getOptionsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__Group_5_2__1__Impl"


    // $ANTLR start "rule__LeafNode__Group__0"
    // InternalDataDsl.g:4299:1: rule__LeafNode__Group__0 : rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1 ;
    public final void rule__LeafNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4303:1: ( rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1 )
            // InternalDataDsl.g:4304:2: rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__LeafNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__0"


    // $ANTLR start "rule__LeafNode__Group__0__Impl"
    // InternalDataDsl.g:4311:1: rule__LeafNode__Group__0__Impl : ( ( rule__LeafNode__Alternatives_0 )? ) ;
    public final void rule__LeafNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4315:1: ( ( ( rule__LeafNode__Alternatives_0 )? ) )
            // InternalDataDsl.g:4316:1: ( ( rule__LeafNode__Alternatives_0 )? )
            {
            // InternalDataDsl.g:4316:1: ( ( rule__LeafNode__Alternatives_0 )? )
            // InternalDataDsl.g:4317:2: ( rule__LeafNode__Alternatives_0 )?
            {
             before(grammarAccess.getLeafNodeAccess().getAlternatives_0()); 
            // InternalDataDsl.g:4318:2: ( rule__LeafNode__Alternatives_0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=75 && LA39_0<=77)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDataDsl.g:4318:3: rule__LeafNode__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__0__Impl"


    // $ANTLR start "rule__LeafNode__Group__1"
    // InternalDataDsl.g:4326:1: rule__LeafNode__Group__1 : rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2 ;
    public final void rule__LeafNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4330:1: ( rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2 )
            // InternalDataDsl.g:4331:2: rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LeafNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__1"


    // $ANTLR start "rule__LeafNode__Group__1__Impl"
    // InternalDataDsl.g:4338:1: rule__LeafNode__Group__1__Impl : ( ( rule__LeafNode__Alternatives_1 ) ) ;
    public final void rule__LeafNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4342:1: ( ( ( rule__LeafNode__Alternatives_1 ) ) )
            // InternalDataDsl.g:4343:1: ( ( rule__LeafNode__Alternatives_1 ) )
            {
            // InternalDataDsl.g:4343:1: ( ( rule__LeafNode__Alternatives_1 ) )
            // InternalDataDsl.g:4344:2: ( rule__LeafNode__Alternatives_1 )
            {
             before(grammarAccess.getLeafNodeAccess().getAlternatives_1()); 
            // InternalDataDsl.g:4345:2: ( rule__LeafNode__Alternatives_1 )
            // InternalDataDsl.g:4345:3: rule__LeafNode__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__1__Impl"


    // $ANTLR start "rule__LeafNode__Group__2"
    // InternalDataDsl.g:4353:1: rule__LeafNode__Group__2 : rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3 ;
    public final void rule__LeafNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4357:1: ( rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3 )
            // InternalDataDsl.g:4358:2: rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__LeafNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__2"


    // $ANTLR start "rule__LeafNode__Group__2__Impl"
    // InternalDataDsl.g:4365:1: rule__LeafNode__Group__2__Impl : ( ( rule__LeafNode__NameAssignment_2 ) ) ;
    public final void rule__LeafNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4369:1: ( ( ( rule__LeafNode__NameAssignment_2 ) ) )
            // InternalDataDsl.g:4370:1: ( ( rule__LeafNode__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:4370:1: ( ( rule__LeafNode__NameAssignment_2 ) )
            // InternalDataDsl.g:4371:2: ( rule__LeafNode__NameAssignment_2 )
            {
             before(grammarAccess.getLeafNodeAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:4372:2: ( rule__LeafNode__NameAssignment_2 )
            // InternalDataDsl.g:4372:3: rule__LeafNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__2__Impl"


    // $ANTLR start "rule__LeafNode__Group__3"
    // InternalDataDsl.g:4380:1: rule__LeafNode__Group__3 : rule__LeafNode__Group__3__Impl ;
    public final void rule__LeafNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4384:1: ( rule__LeafNode__Group__3__Impl )
            // InternalDataDsl.g:4385:2: rule__LeafNode__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__3"


    // $ANTLR start "rule__LeafNode__Group__3__Impl"
    // InternalDataDsl.g:4391:1: rule__LeafNode__Group__3__Impl : ( ( rule__LeafNode__Group_3__0 )? ) ;
    public final void rule__LeafNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4395:1: ( ( ( rule__LeafNode__Group_3__0 )? ) )
            // InternalDataDsl.g:4396:1: ( ( rule__LeafNode__Group_3__0 )? )
            {
            // InternalDataDsl.g:4396:1: ( ( rule__LeafNode__Group_3__0 )? )
            // InternalDataDsl.g:4397:2: ( rule__LeafNode__Group_3__0 )?
            {
             before(grammarAccess.getLeafNodeAccess().getGroup_3()); 
            // InternalDataDsl.g:4398:2: ( rule__LeafNode__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==61) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalDataDsl.g:4398:3: rule__LeafNode__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__3__Impl"


    // $ANTLR start "rule__LeafNode__Group_3__0"
    // InternalDataDsl.g:4407:1: rule__LeafNode__Group_3__0 : rule__LeafNode__Group_3__0__Impl rule__LeafNode__Group_3__1 ;
    public final void rule__LeafNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4411:1: ( rule__LeafNode__Group_3__0__Impl rule__LeafNode__Group_3__1 )
            // InternalDataDsl.g:4412:2: rule__LeafNode__Group_3__0__Impl rule__LeafNode__Group_3__1
            {
            pushFollow(FOLLOW_31);
            rule__LeafNode__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3__0"


    // $ANTLR start "rule__LeafNode__Group_3__0__Impl"
    // InternalDataDsl.g:4419:1: rule__LeafNode__Group_3__0__Impl : ( '{' ) ;
    public final void rule__LeafNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4423:1: ( ( '{' ) )
            // InternalDataDsl.g:4424:1: ( '{' )
            {
            // InternalDataDsl.g:4424:1: ( '{' )
            // InternalDataDsl.g:4425:2: '{'
            {
             before(grammarAccess.getLeafNodeAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3__0__Impl"


    // $ANTLR start "rule__LeafNode__Group_3__1"
    // InternalDataDsl.g:4434:1: rule__LeafNode__Group_3__1 : rule__LeafNode__Group_3__1__Impl rule__LeafNode__Group_3__2 ;
    public final void rule__LeafNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4438:1: ( rule__LeafNode__Group_3__1__Impl rule__LeafNode__Group_3__2 )
            // InternalDataDsl.g:4439:2: rule__LeafNode__Group_3__1__Impl rule__LeafNode__Group_3__2
            {
            pushFollow(FOLLOW_28);
            rule__LeafNode__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3__1"


    // $ANTLR start "rule__LeafNode__Group_3__1__Impl"
    // InternalDataDsl.g:4446:1: rule__LeafNode__Group_3__1__Impl : ( ( rule__LeafNode__OptionsAssignment_3_1 ) ) ;
    public final void rule__LeafNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4450:1: ( ( ( rule__LeafNode__OptionsAssignment_3_1 ) ) )
            // InternalDataDsl.g:4451:1: ( ( rule__LeafNode__OptionsAssignment_3_1 ) )
            {
            // InternalDataDsl.g:4451:1: ( ( rule__LeafNode__OptionsAssignment_3_1 ) )
            // InternalDataDsl.g:4452:2: ( rule__LeafNode__OptionsAssignment_3_1 )
            {
             before(grammarAccess.getLeafNodeAccess().getOptionsAssignment_3_1()); 
            // InternalDataDsl.g:4453:2: ( rule__LeafNode__OptionsAssignment_3_1 )
            // InternalDataDsl.g:4453:3: rule__LeafNode__OptionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__OptionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getOptionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3__1__Impl"


    // $ANTLR start "rule__LeafNode__Group_3__2"
    // InternalDataDsl.g:4461:1: rule__LeafNode__Group_3__2 : rule__LeafNode__Group_3__2__Impl rule__LeafNode__Group_3__3 ;
    public final void rule__LeafNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4465:1: ( rule__LeafNode__Group_3__2__Impl rule__LeafNode__Group_3__3 )
            // InternalDataDsl.g:4466:2: rule__LeafNode__Group_3__2__Impl rule__LeafNode__Group_3__3
            {
            pushFollow(FOLLOW_28);
            rule__LeafNode__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3__2"


    // $ANTLR start "rule__LeafNode__Group_3__2__Impl"
    // InternalDataDsl.g:4473:1: rule__LeafNode__Group_3__2__Impl : ( ( rule__LeafNode__Group_3_2__0 )* ) ;
    public final void rule__LeafNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4477:1: ( ( ( rule__LeafNode__Group_3_2__0 )* ) )
            // InternalDataDsl.g:4478:1: ( ( rule__LeafNode__Group_3_2__0 )* )
            {
            // InternalDataDsl.g:4478:1: ( ( rule__LeafNode__Group_3_2__0 )* )
            // InternalDataDsl.g:4479:2: ( rule__LeafNode__Group_3_2__0 )*
            {
             before(grammarAccess.getLeafNodeAccess().getGroup_3_2()); 
            // InternalDataDsl.g:4480:2: ( rule__LeafNode__Group_3_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==66) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDataDsl.g:4480:3: rule__LeafNode__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__LeafNode__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getLeafNodeAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3__2__Impl"


    // $ANTLR start "rule__LeafNode__Group_3__3"
    // InternalDataDsl.g:4488:1: rule__LeafNode__Group_3__3 : rule__LeafNode__Group_3__3__Impl ;
    public final void rule__LeafNode__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4492:1: ( rule__LeafNode__Group_3__3__Impl )
            // InternalDataDsl.g:4493:2: rule__LeafNode__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3__3"


    // $ANTLR start "rule__LeafNode__Group_3__3__Impl"
    // InternalDataDsl.g:4499:1: rule__LeafNode__Group_3__3__Impl : ( '}' ) ;
    public final void rule__LeafNode__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4503:1: ( ( '}' ) )
            // InternalDataDsl.g:4504:1: ( '}' )
            {
            // InternalDataDsl.g:4504:1: ( '}' )
            // InternalDataDsl.g:4505:2: '}'
            {
             before(grammarAccess.getLeafNodeAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3__3__Impl"


    // $ANTLR start "rule__LeafNode__Group_3_2__0"
    // InternalDataDsl.g:4515:1: rule__LeafNode__Group_3_2__0 : rule__LeafNode__Group_3_2__0__Impl rule__LeafNode__Group_3_2__1 ;
    public final void rule__LeafNode__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4519:1: ( rule__LeafNode__Group_3_2__0__Impl rule__LeafNode__Group_3_2__1 )
            // InternalDataDsl.g:4520:2: rule__LeafNode__Group_3_2__0__Impl rule__LeafNode__Group_3_2__1
            {
            pushFollow(FOLLOW_31);
            rule__LeafNode__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3_2__0"


    // $ANTLR start "rule__LeafNode__Group_3_2__0__Impl"
    // InternalDataDsl.g:4527:1: rule__LeafNode__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__LeafNode__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4531:1: ( ( ',' ) )
            // InternalDataDsl.g:4532:1: ( ',' )
            {
            // InternalDataDsl.g:4532:1: ( ',' )
            // InternalDataDsl.g:4533:2: ','
            {
             before(grammarAccess.getLeafNodeAccess().getCommaKeyword_3_2_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3_2__0__Impl"


    // $ANTLR start "rule__LeafNode__Group_3_2__1"
    // InternalDataDsl.g:4542:1: rule__LeafNode__Group_3_2__1 : rule__LeafNode__Group_3_2__1__Impl ;
    public final void rule__LeafNode__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4546:1: ( rule__LeafNode__Group_3_2__1__Impl )
            // InternalDataDsl.g:4547:2: rule__LeafNode__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3_2__1"


    // $ANTLR start "rule__LeafNode__Group_3_2__1__Impl"
    // InternalDataDsl.g:4553:1: rule__LeafNode__Group_3_2__1__Impl : ( ( rule__LeafNode__OptionsAssignment_3_2_1 ) ) ;
    public final void rule__LeafNode__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4557:1: ( ( ( rule__LeafNode__OptionsAssignment_3_2_1 ) ) )
            // InternalDataDsl.g:4558:1: ( ( rule__LeafNode__OptionsAssignment_3_2_1 ) )
            {
            // InternalDataDsl.g:4558:1: ( ( rule__LeafNode__OptionsAssignment_3_2_1 ) )
            // InternalDataDsl.g:4559:2: ( rule__LeafNode__OptionsAssignment_3_2_1 )
            {
             before(grammarAccess.getLeafNodeAccess().getOptionsAssignment_3_2_1()); 
            // InternalDataDsl.g:4560:2: ( rule__LeafNode__OptionsAssignment_3_2_1 )
            // InternalDataDsl.g:4560:3: rule__LeafNode__OptionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__OptionsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getOptionsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_3_2__1__Impl"


    // $ANTLR start "rule__StringOption__Group__0"
    // InternalDataDsl.g:4569:1: rule__StringOption__Group__0 : rule__StringOption__Group__0__Impl rule__StringOption__Group__1 ;
    public final void rule__StringOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4573:1: ( rule__StringOption__Group__0__Impl rule__StringOption__Group__1 )
            // InternalDataDsl.g:4574:2: rule__StringOption__Group__0__Impl rule__StringOption__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__StringOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOption__Group__0"


    // $ANTLR start "rule__StringOption__Group__0__Impl"
    // InternalDataDsl.g:4581:1: rule__StringOption__Group__0__Impl : ( ( rule__StringOption__KeyAssignment_0 ) ) ;
    public final void rule__StringOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4585:1: ( ( ( rule__StringOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:4586:1: ( ( rule__StringOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:4586:1: ( ( rule__StringOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:4587:2: ( rule__StringOption__KeyAssignment_0 )
            {
             before(grammarAccess.getStringOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:4588:2: ( rule__StringOption__KeyAssignment_0 )
            // InternalDataDsl.g:4588:3: rule__StringOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOption__Group__0__Impl"


    // $ANTLR start "rule__StringOption__Group__1"
    // InternalDataDsl.g:4596:1: rule__StringOption__Group__1 : rule__StringOption__Group__1__Impl rule__StringOption__Group__2 ;
    public final void rule__StringOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4600:1: ( rule__StringOption__Group__1__Impl rule__StringOption__Group__2 )
            // InternalDataDsl.g:4601:2: rule__StringOption__Group__1__Impl rule__StringOption__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__StringOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOption__Group__1"


    // $ANTLR start "rule__StringOption__Group__1__Impl"
    // InternalDataDsl.g:4608:1: rule__StringOption__Group__1__Impl : ( '=' ) ;
    public final void rule__StringOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4612:1: ( ( '=' ) )
            // InternalDataDsl.g:4613:1: ( '=' )
            {
            // InternalDataDsl.g:4613:1: ( '=' )
            // InternalDataDsl.g:4614:2: '='
            {
             before(grammarAccess.getStringOptionAccess().getEqualsSignKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getStringOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOption__Group__1__Impl"


    // $ANTLR start "rule__StringOption__Group__2"
    // InternalDataDsl.g:4623:1: rule__StringOption__Group__2 : rule__StringOption__Group__2__Impl ;
    public final void rule__StringOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4627:1: ( rule__StringOption__Group__2__Impl )
            // InternalDataDsl.g:4628:2: rule__StringOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOption__Group__2"


    // $ANTLR start "rule__StringOption__Group__2__Impl"
    // InternalDataDsl.g:4634:1: rule__StringOption__Group__2__Impl : ( ( rule__StringOption__ValueAssignment_2 ) ) ;
    public final void rule__StringOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4638:1: ( ( ( rule__StringOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:4639:1: ( ( rule__StringOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:4639:1: ( ( rule__StringOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:4640:2: ( rule__StringOption__ValueAssignment_2 )
            {
             before(grammarAccess.getStringOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:4641:2: ( rule__StringOption__ValueAssignment_2 )
            // InternalDataDsl.g:4641:3: rule__StringOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOption__Group__2__Impl"


    // $ANTLR start "rule__IntOption__Group__0"
    // InternalDataDsl.g:4650:1: rule__IntOption__Group__0 : rule__IntOption__Group__0__Impl rule__IntOption__Group__1 ;
    public final void rule__IntOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4654:1: ( rule__IntOption__Group__0__Impl rule__IntOption__Group__1 )
            // InternalDataDsl.g:4655:2: rule__IntOption__Group__0__Impl rule__IntOption__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__IntOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__0"


    // $ANTLR start "rule__IntOption__Group__0__Impl"
    // InternalDataDsl.g:4662:1: rule__IntOption__Group__0__Impl : ( ( rule__IntOption__KeyAssignment_0 ) ) ;
    public final void rule__IntOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4666:1: ( ( ( rule__IntOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:4667:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:4667:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:4668:2: ( rule__IntOption__KeyAssignment_0 )
            {
             before(grammarAccess.getIntOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:4669:2: ( rule__IntOption__KeyAssignment_0 )
            // InternalDataDsl.g:4669:3: rule__IntOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__IntOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getIntOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__0__Impl"


    // $ANTLR start "rule__IntOption__Group__1"
    // InternalDataDsl.g:4677:1: rule__IntOption__Group__1 : rule__IntOption__Group__1__Impl rule__IntOption__Group__2 ;
    public final void rule__IntOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4681:1: ( rule__IntOption__Group__1__Impl rule__IntOption__Group__2 )
            // InternalDataDsl.g:4682:2: rule__IntOption__Group__1__Impl rule__IntOption__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__IntOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__1"


    // $ANTLR start "rule__IntOption__Group__1__Impl"
    // InternalDataDsl.g:4689:1: rule__IntOption__Group__1__Impl : ( '=' ) ;
    public final void rule__IntOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4693:1: ( ( '=' ) )
            // InternalDataDsl.g:4694:1: ( '=' )
            {
            // InternalDataDsl.g:4694:1: ( '=' )
            // InternalDataDsl.g:4695:2: '='
            {
             before(grammarAccess.getIntOptionAccess().getEqualsSignKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getIntOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__1__Impl"


    // $ANTLR start "rule__IntOption__Group__2"
    // InternalDataDsl.g:4704:1: rule__IntOption__Group__2 : rule__IntOption__Group__2__Impl ;
    public final void rule__IntOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4708:1: ( rule__IntOption__Group__2__Impl )
            // InternalDataDsl.g:4709:2: rule__IntOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__2"


    // $ANTLR start "rule__IntOption__Group__2__Impl"
    // InternalDataDsl.g:4715:1: rule__IntOption__Group__2__Impl : ( ( rule__IntOption__ValueAssignment_2 ) ) ;
    public final void rule__IntOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4719:1: ( ( ( rule__IntOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:4720:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:4720:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:4721:2: ( rule__IntOption__ValueAssignment_2 )
            {
             before(grammarAccess.getIntOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:4722:2: ( rule__IntOption__ValueAssignment_2 )
            // InternalDataDsl.g:4722:3: rule__IntOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__Group__2__Impl"


    // $ANTLR start "rule__DoubleOption__Group__0"
    // InternalDataDsl.g:4731:1: rule__DoubleOption__Group__0 : rule__DoubleOption__Group__0__Impl rule__DoubleOption__Group__1 ;
    public final void rule__DoubleOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4735:1: ( rule__DoubleOption__Group__0__Impl rule__DoubleOption__Group__1 )
            // InternalDataDsl.g:4736:2: rule__DoubleOption__Group__0__Impl rule__DoubleOption__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DoubleOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleOption__Group__0"


    // $ANTLR start "rule__DoubleOption__Group__0__Impl"
    // InternalDataDsl.g:4743:1: rule__DoubleOption__Group__0__Impl : ( ( rule__DoubleOption__KeyAssignment_0 ) ) ;
    public final void rule__DoubleOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4747:1: ( ( ( rule__DoubleOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:4748:1: ( ( rule__DoubleOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:4748:1: ( ( rule__DoubleOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:4749:2: ( rule__DoubleOption__KeyAssignment_0 )
            {
             before(grammarAccess.getDoubleOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:4750:2: ( rule__DoubleOption__KeyAssignment_0 )
            // InternalDataDsl.g:4750:3: rule__DoubleOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleOption__Group__0__Impl"


    // $ANTLR start "rule__DoubleOption__Group__1"
    // InternalDataDsl.g:4758:1: rule__DoubleOption__Group__1 : rule__DoubleOption__Group__1__Impl rule__DoubleOption__Group__2 ;
    public final void rule__DoubleOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4762:1: ( rule__DoubleOption__Group__1__Impl rule__DoubleOption__Group__2 )
            // InternalDataDsl.g:4763:2: rule__DoubleOption__Group__1__Impl rule__DoubleOption__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__DoubleOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleOption__Group__1"


    // $ANTLR start "rule__DoubleOption__Group__1__Impl"
    // InternalDataDsl.g:4770:1: rule__DoubleOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DoubleOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4774:1: ( ( '=' ) )
            // InternalDataDsl.g:4775:1: ( '=' )
            {
            // InternalDataDsl.g:4775:1: ( '=' )
            // InternalDataDsl.g:4776:2: '='
            {
             before(grammarAccess.getDoubleOptionAccess().getEqualsSignKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDoubleOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleOption__Group__1__Impl"


    // $ANTLR start "rule__DoubleOption__Group__2"
    // InternalDataDsl.g:4785:1: rule__DoubleOption__Group__2 : rule__DoubleOption__Group__2__Impl ;
    public final void rule__DoubleOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4789:1: ( rule__DoubleOption__Group__2__Impl )
            // InternalDataDsl.g:4790:2: rule__DoubleOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleOption__Group__2"


    // $ANTLR start "rule__DoubleOption__Group__2__Impl"
    // InternalDataDsl.g:4796:1: rule__DoubleOption__Group__2__Impl : ( ( rule__DoubleOption__ValueAssignment_2 ) ) ;
    public final void rule__DoubleOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4800:1: ( ( ( rule__DoubleOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:4801:1: ( ( rule__DoubleOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:4801:1: ( ( rule__DoubleOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:4802:2: ( rule__DoubleOption__ValueAssignment_2 )
            {
             before(grammarAccess.getDoubleOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:4803:2: ( rule__DoubleOption__ValueAssignment_2 )
            // InternalDataDsl.g:4803:3: rule__DoubleOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDoubleOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleOption__Group__2__Impl"


    // $ANTLR start "rule__BooleanOption__Group__0"
    // InternalDataDsl.g:4812:1: rule__BooleanOption__Group__0 : rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 ;
    public final void rule__BooleanOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4816:1: ( rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 )
            // InternalDataDsl.g:4817:2: rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__BooleanOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__0"


    // $ANTLR start "rule__BooleanOption__Group__0__Impl"
    // InternalDataDsl.g:4824:1: rule__BooleanOption__Group__0__Impl : ( ( rule__BooleanOption__KeyAssignment_0 ) ) ;
    public final void rule__BooleanOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4828:1: ( ( ( rule__BooleanOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:4829:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:4829:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:4830:2: ( rule__BooleanOption__KeyAssignment_0 )
            {
             before(grammarAccess.getBooleanOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:4831:2: ( rule__BooleanOption__KeyAssignment_0 )
            // InternalDataDsl.g:4831:3: rule__BooleanOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__0__Impl"


    // $ANTLR start "rule__BooleanOption__Group__1"
    // InternalDataDsl.g:4839:1: rule__BooleanOption__Group__1 : rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 ;
    public final void rule__BooleanOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4843:1: ( rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 )
            // InternalDataDsl.g:4844:2: rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__BooleanOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__1"


    // $ANTLR start "rule__BooleanOption__Group__1__Impl"
    // InternalDataDsl.g:4851:1: rule__BooleanOption__Group__1__Impl : ( '=' ) ;
    public final void rule__BooleanOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4855:1: ( ( '=' ) )
            // InternalDataDsl.g:4856:1: ( '=' )
            {
            // InternalDataDsl.g:4856:1: ( '=' )
            // InternalDataDsl.g:4857:2: '='
            {
             before(grammarAccess.getBooleanOptionAccess().getEqualsSignKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getBooleanOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__1__Impl"


    // $ANTLR start "rule__BooleanOption__Group__2"
    // InternalDataDsl.g:4866:1: rule__BooleanOption__Group__2 : rule__BooleanOption__Group__2__Impl ;
    public final void rule__BooleanOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4870:1: ( rule__BooleanOption__Group__2__Impl )
            // InternalDataDsl.g:4871:2: rule__BooleanOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__2"


    // $ANTLR start "rule__BooleanOption__Group__2__Impl"
    // InternalDataDsl.g:4877:1: rule__BooleanOption__Group__2__Impl : ( ( rule__BooleanOption__ValueAssignment_2 ) ) ;
    public final void rule__BooleanOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4881:1: ( ( ( rule__BooleanOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:4882:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:4882:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:4883:2: ( rule__BooleanOption__ValueAssignment_2 )
            {
             before(grammarAccess.getBooleanOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:4884:2: ( rule__BooleanOption__ValueAssignment_2 )
            // InternalDataDsl.g:4884:3: rule__BooleanOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__Group__2__Impl"


    // $ANTLR start "rule__SequenceOption__Group__0"
    // InternalDataDsl.g:4893:1: rule__SequenceOption__Group__0 : rule__SequenceOption__Group__0__Impl rule__SequenceOption__Group__1 ;
    public final void rule__SequenceOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4897:1: ( rule__SequenceOption__Group__0__Impl rule__SequenceOption__Group__1 )
            // InternalDataDsl.g:4898:2: rule__SequenceOption__Group__0__Impl rule__SequenceOption__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__SequenceOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceOption__Group__0"


    // $ANTLR start "rule__SequenceOption__Group__0__Impl"
    // InternalDataDsl.g:4905:1: rule__SequenceOption__Group__0__Impl : ( ( rule__SequenceOption__KeyAssignment_0 ) ) ;
    public final void rule__SequenceOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4909:1: ( ( ( rule__SequenceOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:4910:1: ( ( rule__SequenceOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:4910:1: ( ( rule__SequenceOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:4911:2: ( rule__SequenceOption__KeyAssignment_0 )
            {
             before(grammarAccess.getSequenceOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:4912:2: ( rule__SequenceOption__KeyAssignment_0 )
            // InternalDataDsl.g:4912:3: rule__SequenceOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SequenceOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceOption__Group__0__Impl"


    // $ANTLR start "rule__SequenceOption__Group__1"
    // InternalDataDsl.g:4920:1: rule__SequenceOption__Group__1 : rule__SequenceOption__Group__1__Impl rule__SequenceOption__Group__2 ;
    public final void rule__SequenceOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4924:1: ( rule__SequenceOption__Group__1__Impl rule__SequenceOption__Group__2 )
            // InternalDataDsl.g:4925:2: rule__SequenceOption__Group__1__Impl rule__SequenceOption__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SequenceOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SequenceOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceOption__Group__1"


    // $ANTLR start "rule__SequenceOption__Group__1__Impl"
    // InternalDataDsl.g:4932:1: rule__SequenceOption__Group__1__Impl : ( '=' ) ;
    public final void rule__SequenceOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4936:1: ( ( '=' ) )
            // InternalDataDsl.g:4937:1: ( '=' )
            {
            // InternalDataDsl.g:4937:1: ( '=' )
            // InternalDataDsl.g:4938:2: '='
            {
             before(grammarAccess.getSequenceOptionAccess().getEqualsSignKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSequenceOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceOption__Group__1__Impl"


    // $ANTLR start "rule__SequenceOption__Group__2"
    // InternalDataDsl.g:4947:1: rule__SequenceOption__Group__2 : rule__SequenceOption__Group__2__Impl ;
    public final void rule__SequenceOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4951:1: ( rule__SequenceOption__Group__2__Impl )
            // InternalDataDsl.g:4952:2: rule__SequenceOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SequenceOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceOption__Group__2"


    // $ANTLR start "rule__SequenceOption__Group__2__Impl"
    // InternalDataDsl.g:4958:1: rule__SequenceOption__Group__2__Impl : ( ( rule__SequenceOption__ValueAssignment_2 ) ) ;
    public final void rule__SequenceOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4962:1: ( ( ( rule__SequenceOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:4963:1: ( ( rule__SequenceOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:4963:1: ( ( rule__SequenceOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:4964:2: ( rule__SequenceOption__ValueAssignment_2 )
            {
             before(grammarAccess.getSequenceOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:4965:2: ( rule__SequenceOption__ValueAssignment_2 )
            // InternalDataDsl.g:4965:3: rule__SequenceOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SequenceOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSequenceOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceOption__Group__2__Impl"


    // $ANTLR start "rule__DataOption__Group__0"
    // InternalDataDsl.g:4974:1: rule__DataOption__Group__0 : rule__DataOption__Group__0__Impl rule__DataOption__Group__1 ;
    public final void rule__DataOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4978:1: ( rule__DataOption__Group__0__Impl rule__DataOption__Group__1 )
            // InternalDataDsl.g:4979:2: rule__DataOption__Group__0__Impl rule__DataOption__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__DataOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__0"


    // $ANTLR start "rule__DataOption__Group__0__Impl"
    // InternalDataDsl.g:4986:1: rule__DataOption__Group__0__Impl : ( ( rule__DataOption__KeyAssignment_0 ) ) ;
    public final void rule__DataOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4990:1: ( ( ( rule__DataOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:4991:1: ( ( rule__DataOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:4991:1: ( ( rule__DataOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:4992:2: ( rule__DataOption__KeyAssignment_0 )
            {
             before(grammarAccess.getDataOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:4993:2: ( rule__DataOption__KeyAssignment_0 )
            // InternalDataDsl.g:4993:3: rule__DataOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__0__Impl"


    // $ANTLR start "rule__DataOption__Group__1"
    // InternalDataDsl.g:5001:1: rule__DataOption__Group__1 : rule__DataOption__Group__1__Impl rule__DataOption__Group__2 ;
    public final void rule__DataOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5005:1: ( rule__DataOption__Group__1__Impl rule__DataOption__Group__2 )
            // InternalDataDsl.g:5006:2: rule__DataOption__Group__1__Impl rule__DataOption__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__DataOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataOption__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__1"


    // $ANTLR start "rule__DataOption__Group__1__Impl"
    // InternalDataDsl.g:5013:1: rule__DataOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DataOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5017:1: ( ( '=' ) )
            // InternalDataDsl.g:5018:1: ( '=' )
            {
            // InternalDataDsl.g:5018:1: ( '=' )
            // InternalDataDsl.g:5019:2: '='
            {
             before(grammarAccess.getDataOptionAccess().getEqualsSignKeyword_1()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__1__Impl"


    // $ANTLR start "rule__DataOption__Group__2"
    // InternalDataDsl.g:5028:1: rule__DataOption__Group__2 : rule__DataOption__Group__2__Impl ;
    public final void rule__DataOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5032:1: ( rule__DataOption__Group__2__Impl )
            // InternalDataDsl.g:5033:2: rule__DataOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__2"


    // $ANTLR start "rule__DataOption__Group__2__Impl"
    // InternalDataDsl.g:5039:1: rule__DataOption__Group__2__Impl : ( ( rule__DataOption__ValueAssignment_2 ) ) ;
    public final void rule__DataOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5043:1: ( ( ( rule__DataOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5044:1: ( ( rule__DataOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5044:1: ( ( rule__DataOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5045:2: ( rule__DataOption__ValueAssignment_2 )
            {
             before(grammarAccess.getDataOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5046:2: ( rule__DataOption__ValueAssignment_2 )
            // InternalDataDsl.g:5046:3: rule__DataOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataOption__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__Group__2__Impl"


    // $ANTLR start "rule__DataModel__DescriptionsAssignment_0"
    // InternalDataDsl.g:5055:1: rule__DataModel__DescriptionsAssignment_0 : ( ruleDataModelElement ) ;
    public final void rule__DataModel__DescriptionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5059:1: ( ( ruleDataModelElement ) )
            // InternalDataDsl.g:5060:2: ( ruleDataModelElement )
            {
            // InternalDataDsl.g:5060:2: ( ruleDataModelElement )
            // InternalDataDsl.g:5061:3: ruleDataModelElement
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsDataModelElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataModelElement();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDescriptionsDataModelElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__DescriptionsAssignment_0"


    // $ANTLR start "rule__DataModel__DescriptionsAssignment_1"
    // InternalDataDsl.g:5070:1: rule__DataModel__DescriptionsAssignment_1 : ( ruleDataModelElement ) ;
    public final void rule__DataModel__DescriptionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5074:1: ( ( ruleDataModelElement ) )
            // InternalDataDsl.g:5075:2: ( ruleDataModelElement )
            {
            // InternalDataDsl.g:5075:2: ( ruleDataModelElement )
            // InternalDataDsl.g:5076:3: ruleDataModelElement
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsDataModelElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataModelElement();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDescriptionsDataModelElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__DescriptionsAssignment_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalDataDsl.g:5085:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5089:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalDataDsl.g:5090:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalDataDsl.g:5090:2: ( ruleQualifiedNameWithWildcard )
            // InternalDataDsl.g:5091:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalDataDsl.g:5100:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5104:1: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5105:2: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:5105:2: ( ruleQualifiedName )
            // InternalDataDsl.g:5106:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // InternalDataDsl.g:5115:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleDataPackableDescription ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5119:1: ( ( ruleDataPackableDescription ) )
            // InternalDataDsl.g:5120:2: ( ruleDataPackableDescription )
            {
            // InternalDataDsl.g:5120:2: ( ruleDataPackableDescription )
            // InternalDataDsl.g:5121:3: ruleDataPackableDescription
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsDataPackableDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataPackableDescription();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsDataPackableDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_4"
    // InternalDataDsl.g:5130:1: rule__PackageDeclaration__ElementsAssignment_4 : ( ruleDataPackableDescription ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5134:1: ( ( ruleDataPackableDescription ) )
            // InternalDataDsl.g:5135:2: ( ruleDataPackableDescription )
            {
            // InternalDataDsl.g:5135:2: ( ruleDataPackableDescription )
            // InternalDataDsl.g:5136:3: ruleDataPackableDescription
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsDataPackableDescriptionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDataPackableDescription();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsDataPackableDescriptionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_4"


    // $ANTLR start "rule__StringConcept__NameAssignment_1"
    // InternalDataDsl.g:5145:1: rule__StringConcept__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StringConcept__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5149:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5150:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5150:2: ( RULE_ID )
            // InternalDataDsl.g:5151:3: RULE_ID
            {
             before(grammarAccess.getStringConceptAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStringConceptAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__NameAssignment_1"


    // $ANTLR start "rule__StringConcept__SubsequenceAssignment_4_0"
    // InternalDataDsl.g:5160:1: rule__StringConcept__SubsequenceAssignment_4_0 : ( ruleSubstringConcept ) ;
    public final void rule__StringConcept__SubsequenceAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5164:1: ( ( ruleSubstringConcept ) )
            // InternalDataDsl.g:5165:2: ( ruleSubstringConcept )
            {
            // InternalDataDsl.g:5165:2: ( ruleSubstringConcept )
            // InternalDataDsl.g:5166:3: ruleSubstringConcept
            {
             before(grammarAccess.getStringConceptAccess().getSubsequenceSubstringConceptParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubstringConcept();

            state._fsp--;

             after(grammarAccess.getStringConceptAccess().getSubsequenceSubstringConceptParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__SubsequenceAssignment_4_0"


    // $ANTLR start "rule__StringConcept__SubsequenceAssignment_4_1_1"
    // InternalDataDsl.g:5175:1: rule__StringConcept__SubsequenceAssignment_4_1_1 : ( ruleSubstringConcept ) ;
    public final void rule__StringConcept__SubsequenceAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5179:1: ( ( ruleSubstringConcept ) )
            // InternalDataDsl.g:5180:2: ( ruleSubstringConcept )
            {
            // InternalDataDsl.g:5180:2: ( ruleSubstringConcept )
            // InternalDataDsl.g:5181:3: ruleSubstringConcept
            {
             before(grammarAccess.getStringConceptAccess().getSubsequenceSubstringConceptParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubstringConcept();

            state._fsp--;

             after(grammarAccess.getStringConceptAccess().getSubsequenceSubstringConceptParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringConcept__SubsequenceAssignment_4_1_1"


    // $ANTLR start "rule__Substring__TypeStringAssignment_0"
    // InternalDataDsl.g:5190:1: rule__Substring__TypeStringAssignment_0 : ( ruleTypeString ) ;
    public final void rule__Substring__TypeStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5194:1: ( ( ruleTypeString ) )
            // InternalDataDsl.g:5195:2: ( ruleTypeString )
            {
            // InternalDataDsl.g:5195:2: ( ruleTypeString )
            // InternalDataDsl.g:5196:3: ruleTypeString
            {
             before(grammarAccess.getSubstringAccess().getTypeStringTypeStringEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeString();

            state._fsp--;

             after(grammarAccess.getSubstringAccess().getTypeStringTypeStringEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__TypeStringAssignment_0"


    // $ANTLR start "rule__Substring__NameAssignment_1"
    // InternalDataDsl.g:5205:1: rule__Substring__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Substring__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5209:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5210:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5210:2: ( RULE_ID )
            // InternalDataDsl.g:5211:3: RULE_ID
            {
             before(grammarAccess.getSubstringAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubstringAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__NameAssignment_1"


    // $ANTLR start "rule__Substring__MinlengthAssignment_3"
    // InternalDataDsl.g:5220:1: rule__Substring__MinlengthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Substring__MinlengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5224:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:5225:2: ( RULE_INT )
            {
            // InternalDataDsl.g:5225:2: ( RULE_INT )
            // InternalDataDsl.g:5226:3: RULE_INT
            {
             before(grammarAccess.getSubstringAccess().getMinlengthINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSubstringAccess().getMinlengthINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__MinlengthAssignment_3"


    // $ANTLR start "rule__Substring__MaxlengthAssignment_5"
    // InternalDataDsl.g:5235:1: rule__Substring__MaxlengthAssignment_5 : ( RULE_INT ) ;
    public final void rule__Substring__MaxlengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5239:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:5240:2: ( RULE_INT )
            {
            // InternalDataDsl.g:5240:2: ( RULE_INT )
            // InternalDataDsl.g:5241:3: RULE_INT
            {
             before(grammarAccess.getSubstringAccess().getMaxlengthINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSubstringAccess().getMaxlengthINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Substring__MaxlengthAssignment_5"


    // $ANTLR start "rule__Character__TypeCharacterAssignment_0"
    // InternalDataDsl.g:5250:1: rule__Character__TypeCharacterAssignment_0 : ( ruleTypeCharacter ) ;
    public final void rule__Character__TypeCharacterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5254:1: ( ( ruleTypeCharacter ) )
            // InternalDataDsl.g:5255:2: ( ruleTypeCharacter )
            {
            // InternalDataDsl.g:5255:2: ( ruleTypeCharacter )
            // InternalDataDsl.g:5256:3: ruleTypeCharacter
            {
             before(grammarAccess.getCharacterAccess().getTypeCharacterTypeCharacterEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeCharacter();

            state._fsp--;

             after(grammarAccess.getCharacterAccess().getTypeCharacterTypeCharacterEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__TypeCharacterAssignment_0"


    // $ANTLR start "rule__Character__NameAssignment_1"
    // InternalDataDsl.g:5265:1: rule__Character__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Character__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5269:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5270:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5270:2: ( RULE_ID )
            // InternalDataDsl.g:5271:3: RULE_ID
            {
             before(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__NameAssignment_1"


    // $ANTLR start "rule__Character__ValueAssignment_2"
    // InternalDataDsl.g:5280:1: rule__Character__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Character__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5284:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5285:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5285:2: ( RULE_STRING )
            // InternalDataDsl.g:5286:3: RULE_STRING
            {
             before(grammarAccess.getCharacterAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCharacterAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Character__ValueAssignment_2"


    // $ANTLR start "rule__DataSourceDescription__FormatAssignment_1"
    // InternalDataDsl.g:5295:1: rule__DataSourceDescription__FormatAssignment_1 : ( ruleFormat ) ;
    public final void rule__DataSourceDescription__FormatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5299:1: ( ( ruleFormat ) )
            // InternalDataDsl.g:5300:2: ( ruleFormat )
            {
            // InternalDataDsl.g:5300:2: ( ruleFormat )
            // InternalDataDsl.g:5301:3: ruleFormat
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getFormatFormatEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormat();

            state._fsp--;

             after(grammarAccess.getDataSourceDescriptionAccess().getFormatFormatEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__FormatAssignment_1"


    // $ANTLR start "rule__DataSourceDescription__NameAssignment_2"
    // InternalDataDsl.g:5310:1: rule__DataSourceDescription__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataSourceDescription__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5314:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5315:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5315:2: ( RULE_ID )
            // InternalDataDsl.g:5316:3: RULE_ID
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSourceDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__NameAssignment_2"


    // $ANTLR start "rule__DataSourceDescription__FragmentsAssignment_3_1"
    // InternalDataDsl.g:5325:1: rule__DataSourceDescription__FragmentsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataSourceDescription__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5329:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5330:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5330:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5331:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentCrossReference_3_1_0()); 
            // InternalDataDsl.g:5332:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5333:4: ruleQualifiedName
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__FragmentsAssignment_3_1"


    // $ANTLR start "rule__DataSourceDescription__FragmentsAssignment_3_2_1"
    // InternalDataDsl.g:5344:1: rule__DataSourceDescription__FragmentsAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataSourceDescription__FragmentsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5348:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5349:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5349:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5350:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentCrossReference_3_2_1_0()); 
            // InternalDataDsl.g:5351:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5352:4: ruleQualifiedName
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getDataSourceDescriptionAccess().getFragmentsDataFragmentCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__FragmentsAssignment_3_2_1"


    // $ANTLR start "rule__DataSourceDescription__NodesAssignment_5_0"
    // InternalDataDsl.g:5363:1: rule__DataSourceDescription__NodesAssignment_5_0 : ( ruleLeafNode ) ;
    public final void rule__DataSourceDescription__NodesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5367:1: ( ( ruleLeafNode ) )
            // InternalDataDsl.g:5368:2: ( ruleLeafNode )
            {
            // InternalDataDsl.g:5368:2: ( ruleLeafNode )
            // InternalDataDsl.g:5369:3: ruleLeafNode
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getNodesLeafNodeParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLeafNode();

            state._fsp--;

             after(grammarAccess.getDataSourceDescriptionAccess().getNodesLeafNodeParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__NodesAssignment_5_0"


    // $ANTLR start "rule__DataSourceDescription__NodesAssignment_5_1_1"
    // InternalDataDsl.g:5378:1: rule__DataSourceDescription__NodesAssignment_5_1_1 : ( ruleLeafNode ) ;
    public final void rule__DataSourceDescription__NodesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5382:1: ( ( ruleLeafNode ) )
            // InternalDataDsl.g:5383:2: ( ruleLeafNode )
            {
            // InternalDataDsl.g:5383:2: ( ruleLeafNode )
            // InternalDataDsl.g:5384:3: ruleLeafNode
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getNodesLeafNodeParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLeafNode();

            state._fsp--;

             after(grammarAccess.getDataSourceDescriptionAccess().getNodesLeafNodeParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__NodesAssignment_5_1_1"


    // $ANTLR start "rule__DataSourceDescription__OptionsAssignment_7_1"
    // InternalDataDsl.g:5393:1: rule__DataSourceDescription__OptionsAssignment_7_1 : ( ruleDataOption ) ;
    public final void rule__DataSourceDescription__OptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5397:1: ( ( ruleDataOption ) )
            // InternalDataDsl.g:5398:2: ( ruleDataOption )
            {
            // InternalDataDsl.g:5398:2: ( ruleDataOption )
            // InternalDataDsl.g:5399:3: ruleDataOption
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getOptionsDataOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOption();

            state._fsp--;

             after(grammarAccess.getDataSourceDescriptionAccess().getOptionsDataOptionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__OptionsAssignment_7_1"


    // $ANTLR start "rule__DataSourceDescription__OptionsAssignment_7_2_1"
    // InternalDataDsl.g:5408:1: rule__DataSourceDescription__OptionsAssignment_7_2_1 : ( ruleDataOption ) ;
    public final void rule__DataSourceDescription__OptionsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5412:1: ( ( ruleDataOption ) )
            // InternalDataDsl.g:5413:2: ( ruleDataOption )
            {
            // InternalDataDsl.g:5413:2: ( ruleDataOption )
            // InternalDataDsl.g:5414:3: ruleDataOption
            {
             before(grammarAccess.getDataSourceDescriptionAccess().getOptionsDataOptionParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOption();

            state._fsp--;

             after(grammarAccess.getDataSourceDescriptionAccess().getOptionsDataOptionParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSourceDescription__OptionsAssignment_7_2_1"


    // $ANTLR start "rule__DataFragment__NameAssignment_1"
    // InternalDataDsl.g:5423:1: rule__DataFragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataFragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5427:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5428:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5428:2: ( RULE_ID )
            // InternalDataDsl.g:5429:3: RULE_ID
            {
             before(grammarAccess.getDataFragmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__NameAssignment_1"


    // $ANTLR start "rule__DataFragment__FragmentsAssignment_2_1"
    // InternalDataDsl.g:5438:1: rule__DataFragment__FragmentsAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataFragment__FragmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5442:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5443:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5443:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5444:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_1_0()); 
            // InternalDataDsl.g:5445:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5446:4: ruleQualifiedName
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__FragmentsAssignment_2_1"


    // $ANTLR start "rule__DataFragment__FragmentsAssignment_2_2_1"
    // InternalDataDsl.g:5457:1: rule__DataFragment__FragmentsAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataFragment__FragmentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5461:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5462:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5462:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5463:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_2_1_0()); 
            // InternalDataDsl.g:5464:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5465:4: ruleQualifiedName
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__FragmentsAssignment_2_2_1"


    // $ANTLR start "rule__DataFragment__NodesAssignment_4_0"
    // InternalDataDsl.g:5476:1: rule__DataFragment__NodesAssignment_4_0 : ( ruleLeafNode ) ;
    public final void rule__DataFragment__NodesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5480:1: ( ( ruleLeafNode ) )
            // InternalDataDsl.g:5481:2: ( ruleLeafNode )
            {
            // InternalDataDsl.g:5481:2: ( ruleLeafNode )
            // InternalDataDsl.g:5482:3: ruleLeafNode
            {
             before(grammarAccess.getDataFragmentAccess().getNodesLeafNodeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLeafNode();

            state._fsp--;

             after(grammarAccess.getDataFragmentAccess().getNodesLeafNodeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__NodesAssignment_4_0"


    // $ANTLR start "rule__DataFragment__NodesAssignment_4_1_1"
    // InternalDataDsl.g:5491:1: rule__DataFragment__NodesAssignment_4_1_1 : ( ruleLeafNode ) ;
    public final void rule__DataFragment__NodesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5495:1: ( ( ruleLeafNode ) )
            // InternalDataDsl.g:5496:2: ( ruleLeafNode )
            {
            // InternalDataDsl.g:5496:2: ( ruleLeafNode )
            // InternalDataDsl.g:5497:3: ruleLeafNode
            {
             before(grammarAccess.getDataFragmentAccess().getNodesLeafNodeParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLeafNode();

            state._fsp--;

             after(grammarAccess.getDataFragmentAccess().getNodesLeafNodeParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__NodesAssignment_4_1_1"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalDataDsl.g:5506:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5510:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5511:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5511:2: ( RULE_ID )
            // InternalDataDsl.g:5512:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__DataType__RefineAssignment_3"
    // InternalDataDsl.g:5521:1: rule__DataType__RefineAssignment_3 : ( ruleBasicType ) ;
    public final void rule__DataType__RefineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5525:1: ( ( ruleBasicType ) )
            // InternalDataDsl.g:5526:2: ( ruleBasicType )
            {
            // InternalDataDsl.g:5526:2: ( ruleBasicType )
            // InternalDataDsl.g:5527:3: ruleBasicType
            {
             before(grammarAccess.getDataTypeAccess().getRefineBasicTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getRefineBasicTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__RefineAssignment_3"


    // $ANTLR start "rule__DataType__OptionsAssignment_4_1"
    // InternalDataDsl.g:5536:1: rule__DataType__OptionsAssignment_4_1 : ( ruleOption ) ;
    public final void rule__DataType__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5540:1: ( ( ruleOption ) )
            // InternalDataDsl.g:5541:2: ( ruleOption )
            {
            // InternalDataDsl.g:5541:2: ( ruleOption )
            // InternalDataDsl.g:5542:3: ruleOption
            {
             before(grammarAccess.getDataTypeAccess().getOptionsOptionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getOptionsOptionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__OptionsAssignment_4_1"


    // $ANTLR start "rule__DataType__OptionsAssignment_4_2_1"
    // InternalDataDsl.g:5551:1: rule__DataType__OptionsAssignment_4_2_1 : ( ruleOption ) ;
    public final void rule__DataType__OptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5555:1: ( ( ruleOption ) )
            // InternalDataDsl.g:5556:2: ( ruleOption )
            {
            // InternalDataDsl.g:5556:2: ( ruleOption )
            // InternalDataDsl.g:5557:3: ruleOption
            {
             before(grammarAccess.getDataTypeAccess().getOptionsOptionParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getOptionsOptionParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__OptionsAssignment_4_2_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalDataDsl.g:5566:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5570:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5571:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5571:2: ( RULE_ID )
            // InternalDataDsl.g:5572:3: RULE_ID
            {
             before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__ValuesAssignment_3"
    // InternalDataDsl.g:5581:1: rule__Enumeration__ValuesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Enumeration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5585:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5586:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5586:2: ( RULE_STRING )
            // InternalDataDsl.g:5587:3: RULE_STRING
            {
             before(grammarAccess.getEnumerationAccess().getValuesSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getValuesSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValuesAssignment_3"


    // $ANTLR start "rule__Enumeration__ValuesAssignment_4_1"
    // InternalDataDsl.g:5596:1: rule__Enumeration__ValuesAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Enumeration__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5600:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5601:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5601:2: ( RULE_STRING )
            // InternalDataDsl.g:5602:3: RULE_STRING
            {
             before(grammarAccess.getEnumerationAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__ValuesAssignment_4_1"


    // $ANTLR start "rule__StructDataType__NameAssignment_1"
    // InternalDataDsl.g:5611:1: rule__StructDataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StructDataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5615:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5616:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5616:2: ( RULE_ID )
            // InternalDataDsl.g:5617:3: RULE_ID
            {
             before(grammarAccess.getStructDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStructDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__NameAssignment_1"


    // $ANTLR start "rule__StructDataType__SubnodesAssignment_3_0"
    // InternalDataDsl.g:5626:1: rule__StructDataType__SubnodesAssignment_3_0 : ( ruleLeafNode ) ;
    public final void rule__StructDataType__SubnodesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5630:1: ( ( ruleLeafNode ) )
            // InternalDataDsl.g:5631:2: ( ruleLeafNode )
            {
            // InternalDataDsl.g:5631:2: ( ruleLeafNode )
            // InternalDataDsl.g:5632:3: ruleLeafNode
            {
             before(grammarAccess.getStructDataTypeAccess().getSubnodesLeafNodeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLeafNode();

            state._fsp--;

             after(grammarAccess.getStructDataTypeAccess().getSubnodesLeafNodeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__SubnodesAssignment_3_0"


    // $ANTLR start "rule__StructDataType__SubnodesAssignment_3_1_1"
    // InternalDataDsl.g:5641:1: rule__StructDataType__SubnodesAssignment_3_1_1 : ( ruleLeafNode ) ;
    public final void rule__StructDataType__SubnodesAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5645:1: ( ( ruleLeafNode ) )
            // InternalDataDsl.g:5646:2: ( ruleLeafNode )
            {
            // InternalDataDsl.g:5646:2: ( ruleLeafNode )
            // InternalDataDsl.g:5647:3: ruleLeafNode
            {
             before(grammarAccess.getStructDataTypeAccess().getSubnodesLeafNodeParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLeafNode();

            state._fsp--;

             after(grammarAccess.getStructDataTypeAccess().getSubnodesLeafNodeParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__SubnodesAssignment_3_1_1"


    // $ANTLR start "rule__StructDataType__OptionsAssignment_5_1"
    // InternalDataDsl.g:5656:1: rule__StructDataType__OptionsAssignment_5_1 : ( ruleOption ) ;
    public final void rule__StructDataType__OptionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5660:1: ( ( ruleOption ) )
            // InternalDataDsl.g:5661:2: ( ruleOption )
            {
            // InternalDataDsl.g:5661:2: ( ruleOption )
            // InternalDataDsl.g:5662:3: ruleOption
            {
             before(grammarAccess.getStructDataTypeAccess().getOptionsOptionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getStructDataTypeAccess().getOptionsOptionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__OptionsAssignment_5_1"


    // $ANTLR start "rule__StructDataType__OptionsAssignment_5_2_1"
    // InternalDataDsl.g:5671:1: rule__StructDataType__OptionsAssignment_5_2_1 : ( ruleOption ) ;
    public final void rule__StructDataType__OptionsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5675:1: ( ( ruleOption ) )
            // InternalDataDsl.g:5676:2: ( ruleOption )
            {
            // InternalDataDsl.g:5676:2: ( ruleOption )
            // InternalDataDsl.g:5677:3: ruleOption
            {
             before(grammarAccess.getStructDataTypeAccess().getOptionsOptionParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getStructDataTypeAccess().getOptionsOptionParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructDataType__OptionsAssignment_5_2_1"


    // $ANTLR start "rule__LeafNode__KeyAssignment_0_0"
    // InternalDataDsl.g:5686:1: rule__LeafNode__KeyAssignment_0_0 : ( ( 'key' ) ) ;
    public final void rule__LeafNode__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5690:1: ( ( ( 'key' ) ) )
            // InternalDataDsl.g:5691:2: ( ( 'key' ) )
            {
            // InternalDataDsl.g:5691:2: ( ( 'key' ) )
            // InternalDataDsl.g:5692:3: ( 'key' )
            {
             before(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0_0()); 
            // InternalDataDsl.g:5693:3: ( 'key' )
            // InternalDataDsl.g:5694:4: 'key'
            {
             before(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__KeyAssignment_0_0"


    // $ANTLR start "rule__LeafNode__UniqueAssignment_0_1"
    // InternalDataDsl.g:5705:1: rule__LeafNode__UniqueAssignment_0_1 : ( ( 'unique' ) ) ;
    public final void rule__LeafNode__UniqueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5709:1: ( ( ( 'unique' ) ) )
            // InternalDataDsl.g:5710:2: ( ( 'unique' ) )
            {
            // InternalDataDsl.g:5710:2: ( ( 'unique' ) )
            // InternalDataDsl.g:5711:3: ( 'unique' )
            {
             before(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_0_1_0()); 
            // InternalDataDsl.g:5712:3: ( 'unique' )
            // InternalDataDsl.g:5713:4: 'unique'
            {
             before(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_0_1_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_0_1_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__UniqueAssignment_0_1"


    // $ANTLR start "rule__LeafNode__ListAssignment_0_2"
    // InternalDataDsl.g:5724:1: rule__LeafNode__ListAssignment_0_2 : ( ( 'list' ) ) ;
    public final void rule__LeafNode__ListAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5728:1: ( ( ( 'list' ) ) )
            // InternalDataDsl.g:5729:2: ( ( 'list' ) )
            {
            // InternalDataDsl.g:5729:2: ( ( 'list' ) )
            // InternalDataDsl.g:5730:3: ( 'list' )
            {
             before(grammarAccess.getLeafNodeAccess().getListListKeyword_0_2_0()); 
            // InternalDataDsl.g:5731:3: ( 'list' )
            // InternalDataDsl.g:5732:4: 'list'
            {
             before(grammarAccess.getLeafNodeAccess().getListListKeyword_0_2_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getListListKeyword_0_2_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getListListKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__ListAssignment_0_2"


    // $ANTLR start "rule__LeafNode__TypeAssignment_1_0"
    // InternalDataDsl.g:5743:1: rule__LeafNode__TypeAssignment_1_0 : ( ruleBasicType ) ;
    public final void rule__LeafNode__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5747:1: ( ( ruleBasicType ) )
            // InternalDataDsl.g:5748:2: ( ruleBasicType )
            {
            // InternalDataDsl.g:5748:2: ( ruleBasicType )
            // InternalDataDsl.g:5749:3: ruleBasicType
            {
             before(grammarAccess.getLeafNodeAccess().getTypeBasicTypeEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getLeafNodeAccess().getTypeBasicTypeEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__TypeAssignment_1_0"


    // $ANTLR start "rule__LeafNode__TypeCallAssignment_1_1"
    // InternalDataDsl.g:5758:1: rule__LeafNode__TypeCallAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__LeafNode__TypeCallAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5762:1: ( ( ( RULE_ID ) ) )
            // InternalDataDsl.g:5763:2: ( ( RULE_ID ) )
            {
            // InternalDataDsl.g:5763:2: ( ( RULE_ID ) )
            // InternalDataDsl.g:5764:3: ( RULE_ID )
            {
             before(grammarAccess.getLeafNodeAccess().getTypeCallTypeSpecificationCrossReference_1_1_0()); 
            // InternalDataDsl.g:5765:3: ( RULE_ID )
            // InternalDataDsl.g:5766:4: RULE_ID
            {
             before(grammarAccess.getLeafNodeAccess().getTypeCallTypeSpecificationIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getTypeCallTypeSpecificationIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getLeafNodeAccess().getTypeCallTypeSpecificationCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__TypeCallAssignment_1_1"


    // $ANTLR start "rule__LeafNode__NameAssignment_2"
    // InternalDataDsl.g:5777:1: rule__LeafNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LeafNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5781:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5782:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5782:2: ( RULE_ID )
            // InternalDataDsl.g:5783:3: RULE_ID
            {
             before(grammarAccess.getLeafNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__NameAssignment_2"


    // $ANTLR start "rule__LeafNode__OptionsAssignment_3_1"
    // InternalDataDsl.g:5792:1: rule__LeafNode__OptionsAssignment_3_1 : ( ruleOption ) ;
    public final void rule__LeafNode__OptionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5796:1: ( ( ruleOption ) )
            // InternalDataDsl.g:5797:2: ( ruleOption )
            {
            // InternalDataDsl.g:5797:2: ( ruleOption )
            // InternalDataDsl.g:5798:3: ruleOption
            {
             before(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__OptionsAssignment_3_1"


    // $ANTLR start "rule__LeafNode__OptionsAssignment_3_2_1"
    // InternalDataDsl.g:5807:1: rule__LeafNode__OptionsAssignment_3_2_1 : ( ruleOption ) ;
    public final void rule__LeafNode__OptionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5811:1: ( ( ruleOption ) )
            // InternalDataDsl.g:5812:2: ( ruleOption )
            {
            // InternalDataDsl.g:5812:2: ( ruleOption )
            // InternalDataDsl.g:5813:3: ruleOption
            {
             before(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__OptionsAssignment_3_2_1"


    // $ANTLR start "rule__StringOption__KeyAssignment_0"
    // InternalDataDsl.g:5822:1: rule__StringOption__KeyAssignment_0 : ( ruleStringOptionKey ) ;
    public final void rule__StringOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5826:1: ( ( ruleStringOptionKey ) )
            // InternalDataDsl.g:5827:2: ( ruleStringOptionKey )
            {
            // InternalDataDsl.g:5827:2: ( ruleStringOptionKey )
            // InternalDataDsl.g:5828:3: ruleStringOptionKey
            {
             before(grammarAccess.getStringOptionAccess().getKeyStringOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStringOptionKey();

            state._fsp--;

             after(grammarAccess.getStringOptionAccess().getKeyStringOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOption__KeyAssignment_0"


    // $ANTLR start "rule__StringOption__ValueAssignment_2"
    // InternalDataDsl.g:5837:1: rule__StringOption__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5841:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5842:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5842:2: ( RULE_STRING )
            // InternalDataDsl.g:5843:3: RULE_STRING
            {
             before(grammarAccess.getStringOptionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringOptionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringOption__ValueAssignment_2"


    // $ANTLR start "rule__IntOption__KeyAssignment_0"
    // InternalDataDsl.g:5852:1: rule__IntOption__KeyAssignment_0 : ( ruleIntOptionKey ) ;
    public final void rule__IntOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5856:1: ( ( ruleIntOptionKey ) )
            // InternalDataDsl.g:5857:2: ( ruleIntOptionKey )
            {
            // InternalDataDsl.g:5857:2: ( ruleIntOptionKey )
            // InternalDataDsl.g:5858:3: ruleIntOptionKey
            {
             before(grammarAccess.getIntOptionAccess().getKeyIntOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntOptionKey();

            state._fsp--;

             after(grammarAccess.getIntOptionAccess().getKeyIntOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__KeyAssignment_0"


    // $ANTLR start "rule__IntOption__ValueAssignment_2"
    // InternalDataDsl.g:5867:1: rule__IntOption__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5871:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:5872:2: ( RULE_INT )
            {
            // InternalDataDsl.g:5872:2: ( RULE_INT )
            // InternalDataDsl.g:5873:3: RULE_INT
            {
             before(grammarAccess.getIntOptionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntOptionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntOption__ValueAssignment_2"


    // $ANTLR start "rule__DoubleOption__KeyAssignment_0"
    // InternalDataDsl.g:5882:1: rule__DoubleOption__KeyAssignment_0 : ( ruleDoubleOptionKey ) ;
    public final void rule__DoubleOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5886:1: ( ( ruleDoubleOptionKey ) )
            // InternalDataDsl.g:5887:2: ( ruleDoubleOptionKey )
            {
            // InternalDataDsl.g:5887:2: ( ruleDoubleOptionKey )
            // InternalDataDsl.g:5888:3: ruleDoubleOptionKey
            {
             before(grammarAccess.getDoubleOptionAccess().getKeyDoubleOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDoubleOptionKey();

            state._fsp--;

             after(grammarAccess.getDoubleOptionAccess().getKeyDoubleOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleOption__KeyAssignment_0"


    // $ANTLR start "rule__DoubleOption__ValueAssignment_2"
    // InternalDataDsl.g:5897:1: rule__DoubleOption__ValueAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__DoubleOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5901:1: ( ( RULE_DOUBLE ) )
            // InternalDataDsl.g:5902:2: ( RULE_DOUBLE )
            {
            // InternalDataDsl.g:5902:2: ( RULE_DOUBLE )
            // InternalDataDsl.g:5903:3: RULE_DOUBLE
            {
             before(grammarAccess.getDoubleOptionAccess().getValueDOUBLETerminalRuleCall_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getDoubleOptionAccess().getValueDOUBLETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleOption__ValueAssignment_2"


    // $ANTLR start "rule__BooleanOption__KeyAssignment_0"
    // InternalDataDsl.g:5912:1: rule__BooleanOption__KeyAssignment_0 : ( ruleBooleanOptionKey ) ;
    public final void rule__BooleanOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5916:1: ( ( ruleBooleanOptionKey ) )
            // InternalDataDsl.g:5917:2: ( ruleBooleanOptionKey )
            {
            // InternalDataDsl.g:5917:2: ( ruleBooleanOptionKey )
            // InternalDataDsl.g:5918:3: ruleBooleanOptionKey
            {
             before(grammarAccess.getBooleanOptionAccess().getKeyBooleanOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBooleanOptionKey();

            state._fsp--;

             after(grammarAccess.getBooleanOptionAccess().getKeyBooleanOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__KeyAssignment_0"


    // $ANTLR start "rule__BooleanOption__ValueAssignment_2"
    // InternalDataDsl.g:5927:1: rule__BooleanOption__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5931:1: ( ( RULE_BOOLEAN ) )
            // InternalDataDsl.g:5932:2: ( RULE_BOOLEAN )
            {
            // InternalDataDsl.g:5932:2: ( RULE_BOOLEAN )
            // InternalDataDsl.g:5933:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanOptionAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBooleanOptionAccess().getValueBOOLEANTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanOption__ValueAssignment_2"


    // $ANTLR start "rule__SequenceOption__KeyAssignment_0"
    // InternalDataDsl.g:5942:1: rule__SequenceOption__KeyAssignment_0 : ( ruleSequenceOptionKey ) ;
    public final void rule__SequenceOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5946:1: ( ( ruleSequenceOptionKey ) )
            // InternalDataDsl.g:5947:2: ( ruleSequenceOptionKey )
            {
            // InternalDataDsl.g:5947:2: ( ruleSequenceOptionKey )
            // InternalDataDsl.g:5948:3: ruleSequenceOptionKey
            {
             before(grammarAccess.getSequenceOptionAccess().getKeySequenceOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSequenceOptionKey();

            state._fsp--;

             after(grammarAccess.getSequenceOptionAccess().getKeySequenceOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceOption__KeyAssignment_0"


    // $ANTLR start "rule__SequenceOption__ValueAssignment_2"
    // InternalDataDsl.g:5957:1: rule__SequenceOption__ValueAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SequenceOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5961:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5962:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5962:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5963:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSequenceOptionAccess().getValueStringConceptCrossReference_2_0()); 
            // InternalDataDsl.g:5964:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5965:4: ruleQualifiedName
            {
             before(grammarAccess.getSequenceOptionAccess().getValueStringConceptQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSequenceOptionAccess().getValueStringConceptQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getSequenceOptionAccess().getValueStringConceptCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SequenceOption__ValueAssignment_2"


    // $ANTLR start "rule__DataOption__KeyAssignment_0"
    // InternalDataDsl.g:5976:1: rule__DataOption__KeyAssignment_0 : ( ruleDataOptionKey ) ;
    public final void rule__DataOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5980:1: ( ( ruleDataOptionKey ) )
            // InternalDataDsl.g:5981:2: ( ruleDataOptionKey )
            {
            // InternalDataDsl.g:5981:2: ( ruleDataOptionKey )
            // InternalDataDsl.g:5982:3: ruleDataOptionKey
            {
             before(grammarAccess.getDataOptionAccess().getKeyDataOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOptionKey();

            state._fsp--;

             after(grammarAccess.getDataOptionAccess().getKeyDataOptionKeyEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__KeyAssignment_0"


    // $ANTLR start "rule__DataOption__ValueAssignment_2"
    // InternalDataDsl.g:5991:1: rule__DataOption__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DataOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5995:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5996:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5996:2: ( RULE_STRING )
            // InternalDataDsl.g:5997:3: RULE_STRING
            {
             before(grammarAccess.getDataOptionAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataOption__ValueAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x1200000000800000L,0x00000000000007A0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x1200000000800002L,0x00000000000007A0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L,0x0000000000000780L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x4000000000800000L,0x0000000000000780L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800002L,0x0000000000000780L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000007E0000L,0x0000000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x40000007FF800010L,0x0000000000003800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000007FF800010L,0x0000000000003800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0030082000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000007FF800000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000FFFF800018000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000100L});

}