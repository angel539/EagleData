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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_CARDINALITY_SYMBOLS", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_NEGINT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'order'", "'char'", "'digit'", "'anycase_string'", "'lowercase_string'", "'uppercase_string'", "'digits'", "'String'", "'Url'", "'Int'", "'LongInt'", "'Real'", "'Date'", "'Time'", "'Year'", "'Month'", "'Day'", "'Boolean'", "'Lat'", "'Long'", "'Percent'", "'Email'", "'Currency'", "'CreditCard'", "'IBAN'", "'ISBN'", "'ISSN'", "'Inet'", "'null'", "'separator'", "'default'", "'regex'", "'flags'", "'decimalchar'", "'pattern'", "'format'", "'minLength'", "'maxLength'", "'min'", "'max'", "'defaultvalue'", "'minDouble'", "'maxDouble'", "'defaultvalueDouble'", "'nullable'", "'casesensitive'", "'import'", "'.*'", "'.'", "'package'", "'{'", "'}'", "'@'", "'['", "','", "']'", "'('", "')'", "'description'", "':'", "'fragment'", "'datatype'", "'enumeration'", "'='", "'key'", "'unique'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=9;
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
    public static final int RULE_NEGINT=10;
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
    public static final int RULE_CARDINALITY_SYMBOLS=7;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
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


    // $ANTLR start "entryRulePackage"
    // InternalDataDsl.g:178:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // InternalDataDsl.g:179:1: ( rulePackage EOF )
            // InternalDataDsl.g:180:1: rulePackage EOF
            {
             before(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            rulePackage();

            state._fsp--;

             after(grammarAccess.getPackageRule()); 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalDataDsl.g:187:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:191:2: ( ( ( rule__Package__Group__0 ) ) )
            // InternalDataDsl.g:192:2: ( ( rule__Package__Group__0 ) )
            {
            // InternalDataDsl.g:192:2: ( ( rule__Package__Group__0 ) )
            // InternalDataDsl.g:193:3: ( rule__Package__Group__0 )
            {
             before(grammarAccess.getPackageAccess().getGroup()); 
            // InternalDataDsl.g:194:3: ( rule__Package__Group__0 )
            // InternalDataDsl.g:194:4: rule__Package__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getGroup()); 

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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleTag"
    // InternalDataDsl.g:203:1: entryRuleTag : ruleTag EOF ;
    public final void entryRuleTag() throws RecognitionException {
        try {
            // InternalDataDsl.g:204:1: ( ruleTag EOF )
            // InternalDataDsl.g:205:1: ruleTag EOF
            {
             before(grammarAccess.getTagRule()); 
            pushFollow(FOLLOW_1);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getTagRule()); 
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
    // $ANTLR end "entryRuleTag"


    // $ANTLR start "ruleTag"
    // InternalDataDsl.g:212:1: ruleTag : ( ( rule__Tag__Group__0 ) ) ;
    public final void ruleTag() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:216:2: ( ( ( rule__Tag__Group__0 ) ) )
            // InternalDataDsl.g:217:2: ( ( rule__Tag__Group__0 ) )
            {
            // InternalDataDsl.g:217:2: ( ( rule__Tag__Group__0 ) )
            // InternalDataDsl.g:218:3: ( rule__Tag__Group__0 )
            {
             before(grammarAccess.getTagAccess().getGroup()); 
            // InternalDataDsl.g:219:3: ( rule__Tag__Group__0 )
            // InternalDataDsl.g:219:4: rule__Tag__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getGroup()); 

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
    // $ANTLR end "ruleTag"


    // $ANTLR start "entryRuleSpecificationElement"
    // InternalDataDsl.g:228:1: entryRuleSpecificationElement : ruleSpecificationElement EOF ;
    public final void entryRuleSpecificationElement() throws RecognitionException {
        try {
            // InternalDataDsl.g:229:1: ( ruleSpecificationElement EOF )
            // InternalDataDsl.g:230:1: ruleSpecificationElement EOF
            {
             before(grammarAccess.getSpecificationElementRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecificationElement();

            state._fsp--;

             after(grammarAccess.getSpecificationElementRule()); 
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
    // $ANTLR end "entryRuleSpecificationElement"


    // $ANTLR start "ruleSpecificationElement"
    // InternalDataDsl.g:237:1: ruleSpecificationElement : ( ( rule__SpecificationElement__Alternatives ) ) ;
    public final void ruleSpecificationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:241:2: ( ( ( rule__SpecificationElement__Alternatives ) ) )
            // InternalDataDsl.g:242:2: ( ( rule__SpecificationElement__Alternatives ) )
            {
            // InternalDataDsl.g:242:2: ( ( rule__SpecificationElement__Alternatives ) )
            // InternalDataDsl.g:243:3: ( rule__SpecificationElement__Alternatives )
            {
             before(grammarAccess.getSpecificationElementAccess().getAlternatives()); 
            // InternalDataDsl.g:244:3: ( rule__SpecificationElement__Alternatives )
            // InternalDataDsl.g:244:4: rule__SpecificationElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SpecificationElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSpecificationElement"


    // $ANTLR start "entryRuleTypeSpecification"
    // InternalDataDsl.g:253:1: entryRuleTypeSpecification : ruleTypeSpecification EOF ;
    public final void entryRuleTypeSpecification() throws RecognitionException {
        try {
            // InternalDataDsl.g:254:1: ( ruleTypeSpecification EOF )
            // InternalDataDsl.g:255:1: ruleTypeSpecification EOF
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
    // InternalDataDsl.g:262:1: ruleTypeSpecification : ( ( rule__TypeSpecification__Alternatives ) ) ;
    public final void ruleTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:266:2: ( ( ( rule__TypeSpecification__Alternatives ) ) )
            // InternalDataDsl.g:267:2: ( ( rule__TypeSpecification__Alternatives ) )
            {
            // InternalDataDsl.g:267:2: ( ( rule__TypeSpecification__Alternatives ) )
            // InternalDataDsl.g:268:3: ( rule__TypeSpecification__Alternatives )
            {
             before(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            // InternalDataDsl.g:269:3: ( rule__TypeSpecification__Alternatives )
            // InternalDataDsl.g:269:4: rule__TypeSpecification__Alternatives
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


    // $ANTLR start "entryRuleAbstractDescription"
    // InternalDataDsl.g:278:1: entryRuleAbstractDescription : ruleAbstractDescription EOF ;
    public final void entryRuleAbstractDescription() throws RecognitionException {
        try {
            // InternalDataDsl.g:279:1: ( ruleAbstractDescription EOF )
            // InternalDataDsl.g:280:1: ruleAbstractDescription EOF
            {
             before(grammarAccess.getAbstractDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractDescription();

            state._fsp--;

             after(grammarAccess.getAbstractDescriptionRule()); 
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
    // $ANTLR end "entryRuleAbstractDescription"


    // $ANTLR start "ruleAbstractDescription"
    // InternalDataDsl.g:287:1: ruleAbstractDescription : ( ( rule__AbstractDescription__Alternatives ) ) ;
    public final void ruleAbstractDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:291:2: ( ( ( rule__AbstractDescription__Alternatives ) ) )
            // InternalDataDsl.g:292:2: ( ( rule__AbstractDescription__Alternatives ) )
            {
            // InternalDataDsl.g:292:2: ( ( rule__AbstractDescription__Alternatives ) )
            // InternalDataDsl.g:293:3: ( rule__AbstractDescription__Alternatives )
            {
             before(grammarAccess.getAbstractDescriptionAccess().getAlternatives()); 
            // InternalDataDsl.g:294:3: ( rule__AbstractDescription__Alternatives )
            // InternalDataDsl.g:294:4: rule__AbstractDescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractDescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractDescriptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractDescription"


    // $ANTLR start "entryRuleSubstringConcept"
    // InternalDataDsl.g:303:1: entryRuleSubstringConcept : ruleSubstringConcept EOF ;
    public final void entryRuleSubstringConcept() throws RecognitionException {
        try {
            // InternalDataDsl.g:304:1: ( ruleSubstringConcept EOF )
            // InternalDataDsl.g:305:1: ruleSubstringConcept EOF
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
    // InternalDataDsl.g:312:1: ruleSubstringConcept : ( ( rule__SubstringConcept__Alternatives ) ) ;
    public final void ruleSubstringConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:316:2: ( ( ( rule__SubstringConcept__Alternatives ) ) )
            // InternalDataDsl.g:317:2: ( ( rule__SubstringConcept__Alternatives ) )
            {
            // InternalDataDsl.g:317:2: ( ( rule__SubstringConcept__Alternatives ) )
            // InternalDataDsl.g:318:3: ( rule__SubstringConcept__Alternatives )
            {
             before(grammarAccess.getSubstringConceptAccess().getAlternatives()); 
            // InternalDataDsl.g:319:3: ( rule__SubstringConcept__Alternatives )
            // InternalDataDsl.g:319:4: rule__SubstringConcept__Alternatives
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
    // InternalDataDsl.g:328:1: entryRuleSubstring : ruleSubstring EOF ;
    public final void entryRuleSubstring() throws RecognitionException {
        try {
            // InternalDataDsl.g:329:1: ( ruleSubstring EOF )
            // InternalDataDsl.g:330:1: ruleSubstring EOF
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
    // InternalDataDsl.g:337:1: ruleSubstring : ( ( rule__Substring__Group__0 ) ) ;
    public final void ruleSubstring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:341:2: ( ( ( rule__Substring__Group__0 ) ) )
            // InternalDataDsl.g:342:2: ( ( rule__Substring__Group__0 ) )
            {
            // InternalDataDsl.g:342:2: ( ( rule__Substring__Group__0 ) )
            // InternalDataDsl.g:343:3: ( rule__Substring__Group__0 )
            {
             before(grammarAccess.getSubstringAccess().getGroup()); 
            // InternalDataDsl.g:344:3: ( rule__Substring__Group__0 )
            // InternalDataDsl.g:344:4: rule__Substring__Group__0
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
    // InternalDataDsl.g:353:1: entryRuleCharacter : ruleCharacter EOF ;
    public final void entryRuleCharacter() throws RecognitionException {
        try {
            // InternalDataDsl.g:354:1: ( ruleCharacter EOF )
            // InternalDataDsl.g:355:1: ruleCharacter EOF
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
    // InternalDataDsl.g:362:1: ruleCharacter : ( ( rule__Character__Group__0 ) ) ;
    public final void ruleCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:366:2: ( ( ( rule__Character__Group__0 ) ) )
            // InternalDataDsl.g:367:2: ( ( rule__Character__Group__0 ) )
            {
            // InternalDataDsl.g:367:2: ( ( rule__Character__Group__0 ) )
            // InternalDataDsl.g:368:3: ( rule__Character__Group__0 )
            {
             before(grammarAccess.getCharacterAccess().getGroup()); 
            // InternalDataDsl.g:369:3: ( rule__Character__Group__0 )
            // InternalDataDsl.g:369:4: rule__Character__Group__0
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


    // $ANTLR start "entryRuleNode"
    // InternalDataDsl.g:378:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:379:1: ( ruleNode EOF )
            // InternalDataDsl.g:380:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalDataDsl.g:387:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:391:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalDataDsl.g:392:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalDataDsl.g:392:2: ( ( rule__Node__Alternatives ) )
            // InternalDataDsl.g:393:3: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalDataDsl.g:394:3: ( rule__Node__Alternatives )
            // InternalDataDsl.g:394:4: rule__Node__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Node__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleCompositeNode"
    // InternalDataDsl.g:403:1: entryRuleCompositeNode : ruleCompositeNode EOF ;
    public final void entryRuleCompositeNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:404:1: ( ruleCompositeNode EOF )
            // InternalDataDsl.g:405:1: ruleCompositeNode EOF
            {
             before(grammarAccess.getCompositeNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeNode();

            state._fsp--;

             after(grammarAccess.getCompositeNodeRule()); 
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
    // $ANTLR end "entryRuleCompositeNode"


    // $ANTLR start "ruleCompositeNode"
    // InternalDataDsl.g:412:1: ruleCompositeNode : ( ( rule__CompositeNode__Group__0 ) ) ;
    public final void ruleCompositeNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:416:2: ( ( ( rule__CompositeNode__Group__0 ) ) )
            // InternalDataDsl.g:417:2: ( ( rule__CompositeNode__Group__0 ) )
            {
            // InternalDataDsl.g:417:2: ( ( rule__CompositeNode__Group__0 ) )
            // InternalDataDsl.g:418:3: ( rule__CompositeNode__Group__0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup()); 
            // InternalDataDsl.g:419:3: ( rule__CompositeNode__Group__0 )
            // InternalDataDsl.g:419:4: rule__CompositeNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleCompositeNode"


    // $ANTLR start "entryRuleFragmentNode"
    // InternalDataDsl.g:428:1: entryRuleFragmentNode : ruleFragmentNode EOF ;
    public final void entryRuleFragmentNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:429:1: ( ruleFragmentNode EOF )
            // InternalDataDsl.g:430:1: ruleFragmentNode EOF
            {
             before(grammarAccess.getFragmentNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleFragmentNode();

            state._fsp--;

             after(grammarAccess.getFragmentNodeRule()); 
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
    // $ANTLR end "entryRuleFragmentNode"


    // $ANTLR start "ruleFragmentNode"
    // InternalDataDsl.g:437:1: ruleFragmentNode : ( ( rule__FragmentNode__Group__0 ) ) ;
    public final void ruleFragmentNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:441:2: ( ( ( rule__FragmentNode__Group__0 ) ) )
            // InternalDataDsl.g:442:2: ( ( rule__FragmentNode__Group__0 ) )
            {
            // InternalDataDsl.g:442:2: ( ( rule__FragmentNode__Group__0 ) )
            // InternalDataDsl.g:443:3: ( rule__FragmentNode__Group__0 )
            {
             before(grammarAccess.getFragmentNodeAccess().getGroup()); 
            // InternalDataDsl.g:444:3: ( rule__FragmentNode__Group__0 )
            // InternalDataDsl.g:444:4: rule__FragmentNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleFragmentNode"


    // $ANTLR start "entryRulePrimitiveNode"
    // InternalDataDsl.g:453:1: entryRulePrimitiveNode : rulePrimitiveNode EOF ;
    public final void entryRulePrimitiveNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:454:1: ( rulePrimitiveNode EOF )
            // InternalDataDsl.g:455:1: rulePrimitiveNode EOF
            {
             before(grammarAccess.getPrimitiveNodeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveNode();

            state._fsp--;

             after(grammarAccess.getPrimitiveNodeRule()); 
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
    // $ANTLR end "entryRulePrimitiveNode"


    // $ANTLR start "rulePrimitiveNode"
    // InternalDataDsl.g:462:1: rulePrimitiveNode : ( ( rule__PrimitiveNode__Group__0 ) ) ;
    public final void rulePrimitiveNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:466:2: ( ( ( rule__PrimitiveNode__Group__0 ) ) )
            // InternalDataDsl.g:467:2: ( ( rule__PrimitiveNode__Group__0 ) )
            {
            // InternalDataDsl.g:467:2: ( ( rule__PrimitiveNode__Group__0 ) )
            // InternalDataDsl.g:468:3: ( rule__PrimitiveNode__Group__0 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getGroup()); 
            // InternalDataDsl.g:469:3: ( rule__PrimitiveNode__Group__0 )
            // InternalDataDsl.g:469:4: rule__PrimitiveNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveNodeAccess().getGroup()); 

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
    // $ANTLR end "rulePrimitiveNode"


    // $ANTLR start "entryRuleCardinality"
    // InternalDataDsl.g:478:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalDataDsl.g:479:1: ( ruleCardinality EOF )
            // InternalDataDsl.g:480:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalDataDsl.g:487:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:491:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalDataDsl.g:492:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalDataDsl.g:492:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalDataDsl.g:493:3: ( rule__Cardinality__Group__0 )
            {
             before(grammarAccess.getCardinalityAccess().getGroup()); 
            // InternalDataDsl.g:494:3: ( rule__Cardinality__Group__0 )
            // InternalDataDsl.g:494:4: rule__Cardinality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getGroup()); 

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
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleDataDescription"
    // InternalDataDsl.g:503:1: entryRuleDataDescription : ruleDataDescription EOF ;
    public final void entryRuleDataDescription() throws RecognitionException {
        try {
            // InternalDataDsl.g:504:1: ( ruleDataDescription EOF )
            // InternalDataDsl.g:505:1: ruleDataDescription EOF
            {
             before(grammarAccess.getDataDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDataDescription();

            state._fsp--;

             after(grammarAccess.getDataDescriptionRule()); 
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
    // $ANTLR end "entryRuleDataDescription"


    // $ANTLR start "ruleDataDescription"
    // InternalDataDsl.g:512:1: ruleDataDescription : ( ( rule__DataDescription__Group__0 ) ) ;
    public final void ruleDataDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:516:2: ( ( ( rule__DataDescription__Group__0 ) ) )
            // InternalDataDsl.g:517:2: ( ( rule__DataDescription__Group__0 ) )
            {
            // InternalDataDsl.g:517:2: ( ( rule__DataDescription__Group__0 ) )
            // InternalDataDsl.g:518:3: ( rule__DataDescription__Group__0 )
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup()); 
            // InternalDataDsl.g:519:3: ( rule__DataDescription__Group__0 )
            // InternalDataDsl.g:519:4: rule__DataDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataDescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleDataDescription"


    // $ANTLR start "entryRuleFragment"
    // InternalDataDsl.g:528:1: entryRuleFragment : ruleFragment EOF ;
    public final void entryRuleFragment() throws RecognitionException {
        try {
            // InternalDataDsl.g:529:1: ( ruleFragment EOF )
            // InternalDataDsl.g:530:1: ruleFragment EOF
            {
             before(grammarAccess.getFragmentRule()); 
            pushFollow(FOLLOW_1);
            ruleFragment();

            state._fsp--;

             after(grammarAccess.getFragmentRule()); 
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
    // $ANTLR end "entryRuleFragment"


    // $ANTLR start "ruleFragment"
    // InternalDataDsl.g:537:1: ruleFragment : ( ( rule__Fragment__Group__0 ) ) ;
    public final void ruleFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:541:2: ( ( ( rule__Fragment__Group__0 ) ) )
            // InternalDataDsl.g:542:2: ( ( rule__Fragment__Group__0 ) )
            {
            // InternalDataDsl.g:542:2: ( ( rule__Fragment__Group__0 ) )
            // InternalDataDsl.g:543:3: ( rule__Fragment__Group__0 )
            {
             before(grammarAccess.getFragmentAccess().getGroup()); 
            // InternalDataDsl.g:544:3: ( rule__Fragment__Group__0 )
            // InternalDataDsl.g:544:4: rule__Fragment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getGroup()); 

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
    // $ANTLR end "ruleFragment"


    // $ANTLR start "entryRuleDataTypeRefinement"
    // InternalDataDsl.g:553:1: entryRuleDataTypeRefinement : ruleDataTypeRefinement EOF ;
    public final void entryRuleDataTypeRefinement() throws RecognitionException {
        try {
            // InternalDataDsl.g:554:1: ( ruleDataTypeRefinement EOF )
            // InternalDataDsl.g:555:1: ruleDataTypeRefinement EOF
            {
             before(grammarAccess.getDataTypeRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleDataTypeRefinement();

            state._fsp--;

             after(grammarAccess.getDataTypeRefinementRule()); 
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
    // $ANTLR end "entryRuleDataTypeRefinement"


    // $ANTLR start "ruleDataTypeRefinement"
    // InternalDataDsl.g:562:1: ruleDataTypeRefinement : ( ( rule__DataTypeRefinement__Group__0 ) ) ;
    public final void ruleDataTypeRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:566:2: ( ( ( rule__DataTypeRefinement__Group__0 ) ) )
            // InternalDataDsl.g:567:2: ( ( rule__DataTypeRefinement__Group__0 ) )
            {
            // InternalDataDsl.g:567:2: ( ( rule__DataTypeRefinement__Group__0 ) )
            // InternalDataDsl.g:568:3: ( rule__DataTypeRefinement__Group__0 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup()); 
            // InternalDataDsl.g:569:3: ( rule__DataTypeRefinement__Group__0 )
            // InternalDataDsl.g:569:4: rule__DataTypeRefinement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeRefinementAccess().getGroup()); 

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
    // $ANTLR end "ruleDataTypeRefinement"


    // $ANTLR start "entryRuleEnumeration"
    // InternalDataDsl.g:578:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalDataDsl.g:579:1: ( ruleEnumeration EOF )
            // InternalDataDsl.g:580:1: ruleEnumeration EOF
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
    // InternalDataDsl.g:587:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:591:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalDataDsl.g:592:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalDataDsl.g:592:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalDataDsl.g:593:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalDataDsl.g:594:3: ( rule__Enumeration__Group__0 )
            // InternalDataDsl.g:594:4: rule__Enumeration__Group__0
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


    // $ANTLR start "entryRuleOption"
    // InternalDataDsl.g:603:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:604:1: ( ruleOption EOF )
            // InternalDataDsl.g:605:1: ruleOption EOF
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
    // InternalDataDsl.g:612:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:616:2: ( ( ( rule__Option__Alternatives ) ) )
            // InternalDataDsl.g:617:2: ( ( rule__Option__Alternatives ) )
            {
            // InternalDataDsl.g:617:2: ( ( rule__Option__Alternatives ) )
            // InternalDataDsl.g:618:3: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // InternalDataDsl.g:619:3: ( rule__Option__Alternatives )
            // InternalDataDsl.g:619:4: rule__Option__Alternatives
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
    // InternalDataDsl.g:628:1: entryRuleStringOption : ruleStringOption EOF ;
    public final void entryRuleStringOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:629:1: ( ruleStringOption EOF )
            // InternalDataDsl.g:630:1: ruleStringOption EOF
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
    // InternalDataDsl.g:637:1: ruleStringOption : ( ( rule__StringOption__Group__0 ) ) ;
    public final void ruleStringOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:641:2: ( ( ( rule__StringOption__Group__0 ) ) )
            // InternalDataDsl.g:642:2: ( ( rule__StringOption__Group__0 ) )
            {
            // InternalDataDsl.g:642:2: ( ( rule__StringOption__Group__0 ) )
            // InternalDataDsl.g:643:3: ( rule__StringOption__Group__0 )
            {
             before(grammarAccess.getStringOptionAccess().getGroup()); 
            // InternalDataDsl.g:644:3: ( rule__StringOption__Group__0 )
            // InternalDataDsl.g:644:4: rule__StringOption__Group__0
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
    // InternalDataDsl.g:653:1: entryRuleIntOption : ruleIntOption EOF ;
    public final void entryRuleIntOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:654:1: ( ruleIntOption EOF )
            // InternalDataDsl.g:655:1: ruleIntOption EOF
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
    // InternalDataDsl.g:662:1: ruleIntOption : ( ( rule__IntOption__Group__0 ) ) ;
    public final void ruleIntOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:666:2: ( ( ( rule__IntOption__Group__0 ) ) )
            // InternalDataDsl.g:667:2: ( ( rule__IntOption__Group__0 ) )
            {
            // InternalDataDsl.g:667:2: ( ( rule__IntOption__Group__0 ) )
            // InternalDataDsl.g:668:3: ( rule__IntOption__Group__0 )
            {
             before(grammarAccess.getIntOptionAccess().getGroup()); 
            // InternalDataDsl.g:669:3: ( rule__IntOption__Group__0 )
            // InternalDataDsl.g:669:4: rule__IntOption__Group__0
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
    // InternalDataDsl.g:678:1: entryRuleDoubleOption : ruleDoubleOption EOF ;
    public final void entryRuleDoubleOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:679:1: ( ruleDoubleOption EOF )
            // InternalDataDsl.g:680:1: ruleDoubleOption EOF
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
    // InternalDataDsl.g:687:1: ruleDoubleOption : ( ( rule__DoubleOption__Group__0 ) ) ;
    public final void ruleDoubleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:691:2: ( ( ( rule__DoubleOption__Group__0 ) ) )
            // InternalDataDsl.g:692:2: ( ( rule__DoubleOption__Group__0 ) )
            {
            // InternalDataDsl.g:692:2: ( ( rule__DoubleOption__Group__0 ) )
            // InternalDataDsl.g:693:3: ( rule__DoubleOption__Group__0 )
            {
             before(grammarAccess.getDoubleOptionAccess().getGroup()); 
            // InternalDataDsl.g:694:3: ( rule__DoubleOption__Group__0 )
            // InternalDataDsl.g:694:4: rule__DoubleOption__Group__0
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
    // InternalDataDsl.g:703:1: entryRuleBooleanOption : ruleBooleanOption EOF ;
    public final void entryRuleBooleanOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:704:1: ( ruleBooleanOption EOF )
            // InternalDataDsl.g:705:1: ruleBooleanOption EOF
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
    // InternalDataDsl.g:712:1: ruleBooleanOption : ( ( rule__BooleanOption__Group__0 ) ) ;
    public final void ruleBooleanOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:716:2: ( ( ( rule__BooleanOption__Group__0 ) ) )
            // InternalDataDsl.g:717:2: ( ( rule__BooleanOption__Group__0 ) )
            {
            // InternalDataDsl.g:717:2: ( ( rule__BooleanOption__Group__0 ) )
            // InternalDataDsl.g:718:3: ( rule__BooleanOption__Group__0 )
            {
             before(grammarAccess.getBooleanOptionAccess().getGroup()); 
            // InternalDataDsl.g:719:3: ( rule__BooleanOption__Group__0 )
            // InternalDataDsl.g:719:4: rule__BooleanOption__Group__0
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


    // $ANTLR start "entryRuleListQualifiedNameOption"
    // InternalDataDsl.g:728:1: entryRuleListQualifiedNameOption : ruleListQualifiedNameOption EOF ;
    public final void entryRuleListQualifiedNameOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:729:1: ( ruleListQualifiedNameOption EOF )
            // InternalDataDsl.g:730:1: ruleListQualifiedNameOption EOF
            {
             before(grammarAccess.getListQualifiedNameOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleListQualifiedNameOption();

            state._fsp--;

             after(grammarAccess.getListQualifiedNameOptionRule()); 
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
    // $ANTLR end "entryRuleListQualifiedNameOption"


    // $ANTLR start "ruleListQualifiedNameOption"
    // InternalDataDsl.g:737:1: ruleListQualifiedNameOption : ( ( rule__ListQualifiedNameOption__Group__0 ) ) ;
    public final void ruleListQualifiedNameOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:741:2: ( ( ( rule__ListQualifiedNameOption__Group__0 ) ) )
            // InternalDataDsl.g:742:2: ( ( rule__ListQualifiedNameOption__Group__0 ) )
            {
            // InternalDataDsl.g:742:2: ( ( rule__ListQualifiedNameOption__Group__0 ) )
            // InternalDataDsl.g:743:3: ( rule__ListQualifiedNameOption__Group__0 )
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getGroup()); 
            // InternalDataDsl.g:744:3: ( rule__ListQualifiedNameOption__Group__0 )
            // InternalDataDsl.g:744:4: rule__ListQualifiedNameOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListQualifiedNameOption__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListQualifiedNameOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleListQualifiedNameOption"


    // $ANTLR start "entryRuleDataOption"
    // InternalDataDsl.g:753:1: entryRuleDataOption : ruleDataOption EOF ;
    public final void entryRuleDataOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:754:1: ( ruleDataOption EOF )
            // InternalDataDsl.g:755:1: ruleDataOption EOF
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
    // InternalDataDsl.g:762:1: ruleDataOption : ( ( rule__DataOption__Group__0 ) ) ;
    public final void ruleDataOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:766:2: ( ( ( rule__DataOption__Group__0 ) ) )
            // InternalDataDsl.g:767:2: ( ( rule__DataOption__Group__0 ) )
            {
            // InternalDataDsl.g:767:2: ( ( rule__DataOption__Group__0 ) )
            // InternalDataDsl.g:768:3: ( rule__DataOption__Group__0 )
            {
             before(grammarAccess.getDataOptionAccess().getGroup()); 
            // InternalDataDsl.g:769:3: ( rule__DataOption__Group__0 )
            // InternalDataDsl.g:769:4: rule__DataOption__Group__0
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
    // InternalDataDsl.g:778:1: ruleTypeCharacter : ( ( rule__TypeCharacter__Alternatives ) ) ;
    public final void ruleTypeCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:782:1: ( ( ( rule__TypeCharacter__Alternatives ) ) )
            // InternalDataDsl.g:783:2: ( ( rule__TypeCharacter__Alternatives ) )
            {
            // InternalDataDsl.g:783:2: ( ( rule__TypeCharacter__Alternatives ) )
            // InternalDataDsl.g:784:3: ( rule__TypeCharacter__Alternatives )
            {
             before(grammarAccess.getTypeCharacterAccess().getAlternatives()); 
            // InternalDataDsl.g:785:3: ( rule__TypeCharacter__Alternatives )
            // InternalDataDsl.g:785:4: rule__TypeCharacter__Alternatives
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
    // InternalDataDsl.g:794:1: ruleTypeString : ( ( rule__TypeString__Alternatives ) ) ;
    public final void ruleTypeString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:798:1: ( ( ( rule__TypeString__Alternatives ) ) )
            // InternalDataDsl.g:799:2: ( ( rule__TypeString__Alternatives ) )
            {
            // InternalDataDsl.g:799:2: ( ( rule__TypeString__Alternatives ) )
            // InternalDataDsl.g:800:3: ( rule__TypeString__Alternatives )
            {
             before(grammarAccess.getTypeStringAccess().getAlternatives()); 
            // InternalDataDsl.g:801:3: ( rule__TypeString__Alternatives )
            // InternalDataDsl.g:801:4: rule__TypeString__Alternatives
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


    // $ANTLR start "ruleBasicType"
    // InternalDataDsl.g:810:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:814:1: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalDataDsl.g:815:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalDataDsl.g:815:2: ( ( rule__BasicType__Alternatives ) )
            // InternalDataDsl.g:816:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalDataDsl.g:817:3: ( rule__BasicType__Alternatives )
            // InternalDataDsl.g:817:4: rule__BasicType__Alternatives
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
    // InternalDataDsl.g:826:1: ruleStringOptionKey : ( ( rule__StringOptionKey__Alternatives ) ) ;
    public final void ruleStringOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:830:1: ( ( ( rule__StringOptionKey__Alternatives ) ) )
            // InternalDataDsl.g:831:2: ( ( rule__StringOptionKey__Alternatives ) )
            {
            // InternalDataDsl.g:831:2: ( ( rule__StringOptionKey__Alternatives ) )
            // InternalDataDsl.g:832:3: ( rule__StringOptionKey__Alternatives )
            {
             before(grammarAccess.getStringOptionKeyAccess().getAlternatives()); 
            // InternalDataDsl.g:833:3: ( rule__StringOptionKey__Alternatives )
            // InternalDataDsl.g:833:4: rule__StringOptionKey__Alternatives
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
    // InternalDataDsl.g:842:1: ruleIntOptionKey : ( ( rule__IntOptionKey__Alternatives ) ) ;
    public final void ruleIntOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:846:1: ( ( ( rule__IntOptionKey__Alternatives ) ) )
            // InternalDataDsl.g:847:2: ( ( rule__IntOptionKey__Alternatives ) )
            {
            // InternalDataDsl.g:847:2: ( ( rule__IntOptionKey__Alternatives ) )
            // InternalDataDsl.g:848:3: ( rule__IntOptionKey__Alternatives )
            {
             before(grammarAccess.getIntOptionKeyAccess().getAlternatives()); 
            // InternalDataDsl.g:849:3: ( rule__IntOptionKey__Alternatives )
            // InternalDataDsl.g:849:4: rule__IntOptionKey__Alternatives
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
    // InternalDataDsl.g:858:1: ruleDoubleOptionKey : ( ( rule__DoubleOptionKey__Alternatives ) ) ;
    public final void ruleDoubleOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:862:1: ( ( ( rule__DoubleOptionKey__Alternatives ) ) )
            // InternalDataDsl.g:863:2: ( ( rule__DoubleOptionKey__Alternatives ) )
            {
            // InternalDataDsl.g:863:2: ( ( rule__DoubleOptionKey__Alternatives ) )
            // InternalDataDsl.g:864:3: ( rule__DoubleOptionKey__Alternatives )
            {
             before(grammarAccess.getDoubleOptionKeyAccess().getAlternatives()); 
            // InternalDataDsl.g:865:3: ( rule__DoubleOptionKey__Alternatives )
            // InternalDataDsl.g:865:4: rule__DoubleOptionKey__Alternatives
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
    // InternalDataDsl.g:874:1: ruleBooleanOptionKey : ( ( rule__BooleanOptionKey__Alternatives ) ) ;
    public final void ruleBooleanOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:878:1: ( ( ( rule__BooleanOptionKey__Alternatives ) ) )
            // InternalDataDsl.g:879:2: ( ( rule__BooleanOptionKey__Alternatives ) )
            {
            // InternalDataDsl.g:879:2: ( ( rule__BooleanOptionKey__Alternatives ) )
            // InternalDataDsl.g:880:3: ( rule__BooleanOptionKey__Alternatives )
            {
             before(grammarAccess.getBooleanOptionKeyAccess().getAlternatives()); 
            // InternalDataDsl.g:881:3: ( rule__BooleanOptionKey__Alternatives )
            // InternalDataDsl.g:881:4: rule__BooleanOptionKey__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BooleanOptionKey__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanOptionKeyAccess().getAlternatives()); 

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


    // $ANTLR start "ruleListQualifiedNameOptionKey"
    // InternalDataDsl.g:890:1: ruleListQualifiedNameOptionKey : ( ( 'order' ) ) ;
    public final void ruleListQualifiedNameOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:894:1: ( ( ( 'order' ) ) )
            // InternalDataDsl.g:895:2: ( ( 'order' ) )
            {
            // InternalDataDsl.g:895:2: ( ( 'order' ) )
            // InternalDataDsl.g:896:3: ( 'order' )
            {
             before(grammarAccess.getListQualifiedNameOptionKeyAccess().getOrderEnumLiteralDeclaration()); 
            // InternalDataDsl.g:897:3: ( 'order' )
            // InternalDataDsl.g:897:4: 'order'
            {
            match(input,15,FOLLOW_2); 

            }

             after(grammarAccess.getListQualifiedNameOptionKeyAccess().getOrderEnumLiteralDeclaration()); 

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
    // $ANTLR end "ruleListQualifiedNameOptionKey"


    // $ANTLR start "rule__DataModelElement__Alternatives"
    // InternalDataDsl.g:905:1: rule__DataModelElement__Alternatives : ( ( ruleImport ) | ( rulePackage ) | ( ruleSpecificationElement ) );
    public final void rule__DataModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:909:1: ( ( ruleImport ) | ( rulePackage ) | ( ruleSpecificationElement ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt1=1;
                }
                break;
            case 64:
            case 67:
                {
                alt1=2;
                }
                break;
            case 73:
            case 75:
            case 76:
            case 77:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalDataDsl.g:910:2: ( ruleImport )
                    {
                    // InternalDataDsl.g:910:2: ( ruleImport )
                    // InternalDataDsl.g:911:3: ruleImport
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
                    // InternalDataDsl.g:916:2: ( rulePackage )
                    {
                    // InternalDataDsl.g:916:2: ( rulePackage )
                    // InternalDataDsl.g:917:3: rulePackage
                    {
                     before(grammarAccess.getDataModelElementAccess().getPackageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePackage();

                    state._fsp--;

                     after(grammarAccess.getDataModelElementAccess().getPackageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:922:2: ( ruleSpecificationElement )
                    {
                    // InternalDataDsl.g:922:2: ( ruleSpecificationElement )
                    // InternalDataDsl.g:923:3: ruleSpecificationElement
                    {
                     before(grammarAccess.getDataModelElementAccess().getSpecificationElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSpecificationElement();

                    state._fsp--;

                     after(grammarAccess.getDataModelElementAccess().getSpecificationElementParserRuleCall_2()); 

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


    // $ANTLR start "rule__SpecificationElement__Alternatives"
    // InternalDataDsl.g:932:1: rule__SpecificationElement__Alternatives : ( ( ruleTypeSpecification ) | ( ruleAbstractDescription ) );
    public final void rule__SpecificationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:936:1: ( ( ruleTypeSpecification ) | ( ruleAbstractDescription ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=76 && LA2_0<=77)) ) {
                alt2=1;
            }
            else if ( (LA2_0==73||LA2_0==75) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataDsl.g:937:2: ( ruleTypeSpecification )
                    {
                    // InternalDataDsl.g:937:2: ( ruleTypeSpecification )
                    // InternalDataDsl.g:938:3: ruleTypeSpecification
                    {
                     before(grammarAccess.getSpecificationElementAccess().getTypeSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeSpecification();

                    state._fsp--;

                     after(grammarAccess.getSpecificationElementAccess().getTypeSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:943:2: ( ruleAbstractDescription )
                    {
                    // InternalDataDsl.g:943:2: ( ruleAbstractDescription )
                    // InternalDataDsl.g:944:3: ruleAbstractDescription
                    {
                     before(grammarAccess.getSpecificationElementAccess().getAbstractDescriptionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractDescription();

                    state._fsp--;

                     after(grammarAccess.getSpecificationElementAccess().getAbstractDescriptionParserRuleCall_1()); 

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
    // $ANTLR end "rule__SpecificationElement__Alternatives"


    // $ANTLR start "rule__TypeSpecification__Alternatives"
    // InternalDataDsl.g:953:1: rule__TypeSpecification__Alternatives : ( ( ruleDataTypeRefinement ) | ( ruleEnumeration ) );
    public final void rule__TypeSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:957:1: ( ( ruleDataTypeRefinement ) | ( ruleEnumeration ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==76) ) {
                alt3=1;
            }
            else if ( (LA3_0==77) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataDsl.g:958:2: ( ruleDataTypeRefinement )
                    {
                    // InternalDataDsl.g:958:2: ( ruleDataTypeRefinement )
                    // InternalDataDsl.g:959:3: ruleDataTypeRefinement
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getDataTypeRefinementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataTypeRefinement();

                    state._fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getDataTypeRefinementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:964:2: ( ruleEnumeration )
                    {
                    // InternalDataDsl.g:964:2: ( ruleEnumeration )
                    // InternalDataDsl.g:965:3: ruleEnumeration
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getEnumerationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getEnumerationParserRuleCall_1()); 

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


    // $ANTLR start "rule__AbstractDescription__Alternatives"
    // InternalDataDsl.g:974:1: rule__AbstractDescription__Alternatives : ( ( ruleDataDescription ) | ( ruleFragment ) );
    public final void rule__AbstractDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:978:1: ( ( ruleDataDescription ) | ( ruleFragment ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==73) ) {
                alt4=1;
            }
            else if ( (LA4_0==75) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:979:2: ( ruleDataDescription )
                    {
                    // InternalDataDsl.g:979:2: ( ruleDataDescription )
                    // InternalDataDsl.g:980:3: ruleDataDescription
                    {
                     before(grammarAccess.getAbstractDescriptionAccess().getDataDescriptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataDescription();

                    state._fsp--;

                     after(grammarAccess.getAbstractDescriptionAccess().getDataDescriptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:985:2: ( ruleFragment )
                    {
                    // InternalDataDsl.g:985:2: ( ruleFragment )
                    // InternalDataDsl.g:986:3: ruleFragment
                    {
                     before(grammarAccess.getAbstractDescriptionAccess().getFragmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFragment();

                    state._fsp--;

                     after(grammarAccess.getAbstractDescriptionAccess().getFragmentParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractDescription__Alternatives"


    // $ANTLR start "rule__SubstringConcept__Alternatives"
    // InternalDataDsl.g:995:1: rule__SubstringConcept__Alternatives : ( ( ruleCharacter ) | ( ruleSubstring ) );
    public final void rule__SubstringConcept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:999:1: ( ( ruleCharacter ) | ( ruleSubstring ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=17)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=18 && LA5_0<=21)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataDsl.g:1000:2: ( ruleCharacter )
                    {
                    // InternalDataDsl.g:1000:2: ( ruleCharacter )
                    // InternalDataDsl.g:1001:3: ruleCharacter
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
                    // InternalDataDsl.g:1006:2: ( ruleSubstring )
                    {
                    // InternalDataDsl.g:1006:2: ( ruleSubstring )
                    // InternalDataDsl.g:1007:3: ruleSubstring
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


    // $ANTLR start "rule__Node__Alternatives"
    // InternalDataDsl.g:1016:1: rule__Node__Alternatives : ( ( rulePrimitiveNode ) | ( ruleCompositeNode ) | ( ruleFragmentNode ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1020:1: ( ( rulePrimitiveNode ) | ( ruleCompositeNode ) | ( ruleFragmentNode ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=2;
                }
                else if ( ((LA6_1>=22 && LA6_1<=42)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case 80:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_ID) ) {
                    alt6=2;
                }
                else if ( ((LA6_2>=22 && LA6_2<=42)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 63:
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
                    // InternalDataDsl.g:1021:2: ( rulePrimitiveNode )
                    {
                    // InternalDataDsl.g:1021:2: ( rulePrimitiveNode )
                    // InternalDataDsl.g:1022:3: rulePrimitiveNode
                    {
                     before(grammarAccess.getNodeAccess().getPrimitiveNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getPrimitiveNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1027:2: ( ruleCompositeNode )
                    {
                    // InternalDataDsl.g:1027:2: ( ruleCompositeNode )
                    // InternalDataDsl.g:1028:3: ruleCompositeNode
                    {
                     before(grammarAccess.getNodeAccess().getCompositeNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getCompositeNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1033:2: ( ruleFragmentNode )
                    {
                    // InternalDataDsl.g:1033:2: ( ruleFragmentNode )
                    // InternalDataDsl.g:1034:3: ruleFragmentNode
                    {
                     before(grammarAccess.getNodeAccess().getFragmentNodeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFragmentNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getFragmentNodeParserRuleCall_2()); 

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
    // $ANTLR end "rule__Node__Alternatives"


    // $ANTLR start "rule__CompositeNode__Alternatives_0"
    // InternalDataDsl.g:1043:1: rule__CompositeNode__Alternatives_0 : ( ( ( rule__CompositeNode__KeyAssignment_0_0 ) ) | ( ( rule__CompositeNode__UniqueAssignment_0_1 ) ) );
    public final void rule__CompositeNode__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1047:1: ( ( ( rule__CompositeNode__KeyAssignment_0_0 ) ) | ( ( rule__CompositeNode__UniqueAssignment_0_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==79) ) {
                alt7=1;
            }
            else if ( (LA7_0==80) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDataDsl.g:1048:2: ( ( rule__CompositeNode__KeyAssignment_0_0 ) )
                    {
                    // InternalDataDsl.g:1048:2: ( ( rule__CompositeNode__KeyAssignment_0_0 ) )
                    // InternalDataDsl.g:1049:3: ( rule__CompositeNode__KeyAssignment_0_0 )
                    {
                     before(grammarAccess.getCompositeNodeAccess().getKeyAssignment_0_0()); 
                    // InternalDataDsl.g:1050:3: ( rule__CompositeNode__KeyAssignment_0_0 )
                    // InternalDataDsl.g:1050:4: rule__CompositeNode__KeyAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__KeyAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositeNodeAccess().getKeyAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1054:2: ( ( rule__CompositeNode__UniqueAssignment_0_1 ) )
                    {
                    // InternalDataDsl.g:1054:2: ( ( rule__CompositeNode__UniqueAssignment_0_1 ) )
                    // InternalDataDsl.g:1055:3: ( rule__CompositeNode__UniqueAssignment_0_1 )
                    {
                     before(grammarAccess.getCompositeNodeAccess().getUniqueAssignment_0_1()); 
                    // InternalDataDsl.g:1056:3: ( rule__CompositeNode__UniqueAssignment_0_1 )
                    // InternalDataDsl.g:1056:4: rule__CompositeNode__UniqueAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__UniqueAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositeNodeAccess().getUniqueAssignment_0_1()); 

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
    // $ANTLR end "rule__CompositeNode__Alternatives_0"


    // $ANTLR start "rule__PrimitiveNode__Alternatives_0"
    // InternalDataDsl.g:1064:1: rule__PrimitiveNode__Alternatives_0 : ( ( ( rule__PrimitiveNode__KeyAssignment_0_0 ) ) | ( ( rule__PrimitiveNode__UniqueAssignment_0_1 ) ) );
    public final void rule__PrimitiveNode__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1068:1: ( ( ( rule__PrimitiveNode__KeyAssignment_0_0 ) ) | ( ( rule__PrimitiveNode__UniqueAssignment_0_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==79) ) {
                alt8=1;
            }
            else if ( (LA8_0==80) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataDsl.g:1069:2: ( ( rule__PrimitiveNode__KeyAssignment_0_0 ) )
                    {
                    // InternalDataDsl.g:1069:2: ( ( rule__PrimitiveNode__KeyAssignment_0_0 ) )
                    // InternalDataDsl.g:1070:3: ( rule__PrimitiveNode__KeyAssignment_0_0 )
                    {
                     before(grammarAccess.getPrimitiveNodeAccess().getKeyAssignment_0_0()); 
                    // InternalDataDsl.g:1071:3: ( rule__PrimitiveNode__KeyAssignment_0_0 )
                    // InternalDataDsl.g:1071:4: rule__PrimitiveNode__KeyAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveNode__KeyAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveNodeAccess().getKeyAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1075:2: ( ( rule__PrimitiveNode__UniqueAssignment_0_1 ) )
                    {
                    // InternalDataDsl.g:1075:2: ( ( rule__PrimitiveNode__UniqueAssignment_0_1 ) )
                    // InternalDataDsl.g:1076:3: ( rule__PrimitiveNode__UniqueAssignment_0_1 )
                    {
                     before(grammarAccess.getPrimitiveNodeAccess().getUniqueAssignment_0_1()); 
                    // InternalDataDsl.g:1077:3: ( rule__PrimitiveNode__UniqueAssignment_0_1 )
                    // InternalDataDsl.g:1077:4: rule__PrimitiveNode__UniqueAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveNode__UniqueAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimitiveNodeAccess().getUniqueAssignment_0_1()); 

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
    // $ANTLR end "rule__PrimitiveNode__Alternatives_0"


    // $ANTLR start "rule__Option__Alternatives"
    // InternalDataDsl.g:1085:1: rule__Option__Alternatives : ( ( ruleStringOption ) | ( ruleIntOption ) | ( ruleBooleanOption ) | ( ruleDoubleOption ) | ( ruleListQualifiedNameOption ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1089:1: ( ( ruleStringOption ) | ( ruleIntOption ) | ( ruleBooleanOption ) | ( ruleDoubleOption ) | ( ruleListQualifiedNameOption ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt9=1;
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
                {
                alt9=2;
                }
                break;
            case 59:
            case 60:
                {
                alt9=3;
                }
                break;
            case 56:
            case 57:
            case 58:
                {
                alt9=4;
                }
                break;
            case 15:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalDataDsl.g:1090:2: ( ruleStringOption )
                    {
                    // InternalDataDsl.g:1090:2: ( ruleStringOption )
                    // InternalDataDsl.g:1091:3: ruleStringOption
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
                    // InternalDataDsl.g:1096:2: ( ruleIntOption )
                    {
                    // InternalDataDsl.g:1096:2: ( ruleIntOption )
                    // InternalDataDsl.g:1097:3: ruleIntOption
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
                    // InternalDataDsl.g:1102:2: ( ruleBooleanOption )
                    {
                    // InternalDataDsl.g:1102:2: ( ruleBooleanOption )
                    // InternalDataDsl.g:1103:3: ruleBooleanOption
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
                    // InternalDataDsl.g:1108:2: ( ruleDoubleOption )
                    {
                    // InternalDataDsl.g:1108:2: ( ruleDoubleOption )
                    // InternalDataDsl.g:1109:3: ruleDoubleOption
                    {
                     before(grammarAccess.getOptionAccess().getDoubleOptionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getDoubleOptionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1114:2: ( ruleListQualifiedNameOption )
                    {
                    // InternalDataDsl.g:1114:2: ( ruleListQualifiedNameOption )
                    // InternalDataDsl.g:1115:3: ruleListQualifiedNameOption
                    {
                     before(grammarAccess.getOptionAccess().getListQualifiedNameOptionParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleListQualifiedNameOption();

                    state._fsp--;

                     after(grammarAccess.getOptionAccess().getListQualifiedNameOptionParserRuleCall_4()); 

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
    // InternalDataDsl.g:1124:1: rule__TypeCharacter__Alternatives : ( ( ( 'char' ) ) | ( ( 'digit' ) ) );
    public final void rule__TypeCharacter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1128:1: ( ( ( 'char' ) ) | ( ( 'digit' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            else if ( (LA10_0==17) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataDsl.g:1129:2: ( ( 'char' ) )
                    {
                    // InternalDataDsl.g:1129:2: ( ( 'char' ) )
                    // InternalDataDsl.g:1130:3: ( 'char' )
                    {
                     before(grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1131:3: ( 'char' )
                    // InternalDataDsl.g:1131:4: 'char'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1135:2: ( ( 'digit' ) )
                    {
                    // InternalDataDsl.g:1135:2: ( ( 'digit' ) )
                    // InternalDataDsl.g:1136:3: ( 'digit' )
                    {
                     before(grammarAccess.getTypeCharacterAccess().getDigitEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1137:3: ( 'digit' )
                    // InternalDataDsl.g:1137:4: 'digit'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalDataDsl.g:1145:1: rule__TypeString__Alternatives : ( ( ( 'anycase_string' ) ) | ( ( 'lowercase_string' ) ) | ( ( 'uppercase_string' ) ) | ( ( 'digits' ) ) );
    public final void rule__TypeString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1149:1: ( ( ( 'anycase_string' ) ) | ( ( 'lowercase_string' ) ) | ( ( 'uppercase_string' ) ) | ( ( 'digits' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt11=1;
                }
                break;
            case 19:
                {
                alt11=2;
                }
                break;
            case 20:
                {
                alt11=3;
                }
                break;
            case 21:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDataDsl.g:1150:2: ( ( 'anycase_string' ) )
                    {
                    // InternalDataDsl.g:1150:2: ( ( 'anycase_string' ) )
                    // InternalDataDsl.g:1151:3: ( 'anycase_string' )
                    {
                     before(grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1152:3: ( 'anycase_string' )
                    // InternalDataDsl.g:1152:4: 'anycase_string'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1156:2: ( ( 'lowercase_string' ) )
                    {
                    // InternalDataDsl.g:1156:2: ( ( 'lowercase_string' ) )
                    // InternalDataDsl.g:1157:3: ( 'lowercase_string' )
                    {
                     before(grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1158:3: ( 'lowercase_string' )
                    // InternalDataDsl.g:1158:4: 'lowercase_string'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1162:2: ( ( 'uppercase_string' ) )
                    {
                    // InternalDataDsl.g:1162:2: ( ( 'uppercase_string' ) )
                    // InternalDataDsl.g:1163:3: ( 'uppercase_string' )
                    {
                     before(grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1164:3: ( 'uppercase_string' )
                    // InternalDataDsl.g:1164:4: 'uppercase_string'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1168:2: ( ( 'digits' ) )
                    {
                    // InternalDataDsl.g:1168:2: ( ( 'digits' ) )
                    // InternalDataDsl.g:1169:3: ( 'digits' )
                    {
                     before(grammarAccess.getTypeStringAccess().getNumbersEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1170:3: ( 'digits' )
                    // InternalDataDsl.g:1170:4: 'digits'
                    {
                    match(input,21,FOLLOW_2); 

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
    // InternalDataDsl.g:1178:1: rule__BasicType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Url' ) ) | ( ( 'Int' ) ) | ( ( 'LongInt' ) ) | ( ( 'Real' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Year' ) ) | ( ( 'Month' ) ) | ( ( 'Day' ) ) | ( ( 'Boolean' ) ) | ( ( 'Lat' ) ) | ( ( 'Long' ) ) | ( ( 'Percent' ) ) | ( ( 'Email' ) ) | ( ( 'Currency' ) ) | ( ( 'CreditCard' ) ) | ( ( 'IBAN' ) ) | ( ( 'ISBN' ) ) | ( ( 'ISSN' ) ) | ( ( 'Inet' ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1182:1: ( ( ( 'String' ) ) | ( ( 'Url' ) ) | ( ( 'Int' ) ) | ( ( 'LongInt' ) ) | ( ( 'Real' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Year' ) ) | ( ( 'Month' ) ) | ( ( 'Day' ) ) | ( ( 'Boolean' ) ) | ( ( 'Lat' ) ) | ( ( 'Long' ) ) | ( ( 'Percent' ) ) | ( ( 'Email' ) ) | ( ( 'Currency' ) ) | ( ( 'CreditCard' ) ) | ( ( 'IBAN' ) ) | ( ( 'ISBN' ) ) | ( ( 'ISSN' ) ) | ( ( 'Inet' ) ) )
            int alt12=21;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt12=1;
                }
                break;
            case 23:
                {
                alt12=2;
                }
                break;
            case 24:
                {
                alt12=3;
                }
                break;
            case 25:
                {
                alt12=4;
                }
                break;
            case 26:
                {
                alt12=5;
                }
                break;
            case 27:
                {
                alt12=6;
                }
                break;
            case 28:
                {
                alt12=7;
                }
                break;
            case 29:
                {
                alt12=8;
                }
                break;
            case 30:
                {
                alt12=9;
                }
                break;
            case 31:
                {
                alt12=10;
                }
                break;
            case 32:
                {
                alt12=11;
                }
                break;
            case 33:
                {
                alt12=12;
                }
                break;
            case 34:
                {
                alt12=13;
                }
                break;
            case 35:
                {
                alt12=14;
                }
                break;
            case 36:
                {
                alt12=15;
                }
                break;
            case 37:
                {
                alt12=16;
                }
                break;
            case 38:
                {
                alt12=17;
                }
                break;
            case 39:
                {
                alt12=18;
                }
                break;
            case 40:
                {
                alt12=19;
                }
                break;
            case 41:
                {
                alt12=20;
                }
                break;
            case 42:
                {
                alt12=21;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDataDsl.g:1183:2: ( ( 'String' ) )
                    {
                    // InternalDataDsl.g:1183:2: ( ( 'String' ) )
                    // InternalDataDsl.g:1184:3: ( 'String' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1185:3: ( 'String' )
                    // InternalDataDsl.g:1185:4: 'String'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1189:2: ( ( 'Url' ) )
                    {
                    // InternalDataDsl.g:1189:2: ( ( 'Url' ) )
                    // InternalDataDsl.g:1190:3: ( 'Url' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1191:3: ( 'Url' )
                    // InternalDataDsl.g:1191:4: 'Url'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1195:2: ( ( 'Int' ) )
                    {
                    // InternalDataDsl.g:1195:2: ( ( 'Int' ) )
                    // InternalDataDsl.g:1196:3: ( 'Int' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1197:3: ( 'Int' )
                    // InternalDataDsl.g:1197:4: 'Int'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1201:2: ( ( 'LongInt' ) )
                    {
                    // InternalDataDsl.g:1201:2: ( ( 'LongInt' ) )
                    // InternalDataDsl.g:1202:3: ( 'LongInt' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongIntEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1203:3: ( 'LongInt' )
                    // InternalDataDsl.g:1203:4: 'LongInt'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLongIntEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1207:2: ( ( 'Real' ) )
                    {
                    // InternalDataDsl.g:1207:2: ( ( 'Real' ) )
                    // InternalDataDsl.g:1208:3: ( 'Real' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:1209:3: ( 'Real' )
                    // InternalDataDsl.g:1209:4: 'Real'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:1213:2: ( ( 'Date' ) )
                    {
                    // InternalDataDsl.g:1213:2: ( ( 'Date' ) )
                    // InternalDataDsl.g:1214:3: ( 'Date' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:1215:3: ( 'Date' )
                    // InternalDataDsl.g:1215:4: 'Date'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:1219:2: ( ( 'Time' ) )
                    {
                    // InternalDataDsl.g:1219:2: ( ( 'Time' ) )
                    // InternalDataDsl.g:1220:3: ( 'Time' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:1221:3: ( 'Time' )
                    // InternalDataDsl.g:1221:4: 'Time'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:1225:2: ( ( 'Year' ) )
                    {
                    // InternalDataDsl.g:1225:2: ( ( 'Year' ) )
                    // InternalDataDsl.g:1226:3: ( 'Year' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:1227:3: ( 'Year' )
                    // InternalDataDsl.g:1227:4: 'Year'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:1231:2: ( ( 'Month' ) )
                    {
                    // InternalDataDsl.g:1231:2: ( ( 'Month' ) )
                    // InternalDataDsl.g:1232:3: ( 'Month' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_8()); 
                    // InternalDataDsl.g:1233:3: ( 'Month' )
                    // InternalDataDsl.g:1233:4: 'Month'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:1237:2: ( ( 'Day' ) )
                    {
                    // InternalDataDsl.g:1237:2: ( ( 'Day' ) )
                    // InternalDataDsl.g:1238:3: ( 'Day' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_9()); 
                    // InternalDataDsl.g:1239:3: ( 'Day' )
                    // InternalDataDsl.g:1239:4: 'Day'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:1243:2: ( ( 'Boolean' ) )
                    {
                    // InternalDataDsl.g:1243:2: ( ( 'Boolean' ) )
                    // InternalDataDsl.g:1244:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_10()); 
                    // InternalDataDsl.g:1245:3: ( 'Boolean' )
                    // InternalDataDsl.g:1245:4: 'Boolean'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDsl.g:1249:2: ( ( 'Lat' ) )
                    {
                    // InternalDataDsl.g:1249:2: ( ( 'Lat' ) )
                    // InternalDataDsl.g:1250:3: ( 'Lat' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_11()); 
                    // InternalDataDsl.g:1251:3: ( 'Lat' )
                    // InternalDataDsl.g:1251:4: 'Lat'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDataDsl.g:1255:2: ( ( 'Long' ) )
                    {
                    // InternalDataDsl.g:1255:2: ( ( 'Long' ) )
                    // InternalDataDsl.g:1256:3: ( 'Long' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_12()); 
                    // InternalDataDsl.g:1257:3: ( 'Long' )
                    // InternalDataDsl.g:1257:4: 'Long'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDataDsl.g:1261:2: ( ( 'Percent' ) )
                    {
                    // InternalDataDsl.g:1261:2: ( ( 'Percent' ) )
                    // InternalDataDsl.g:1262:3: ( 'Percent' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getPercentEnumLiteralDeclaration_13()); 
                    // InternalDataDsl.g:1263:3: ( 'Percent' )
                    // InternalDataDsl.g:1263:4: 'Percent'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getPercentEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDataDsl.g:1267:2: ( ( 'Email' ) )
                    {
                    // InternalDataDsl.g:1267:2: ( ( 'Email' ) )
                    // InternalDataDsl.g:1268:3: ( 'Email' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getEmailEnumLiteralDeclaration_14()); 
                    // InternalDataDsl.g:1269:3: ( 'Email' )
                    // InternalDataDsl.g:1269:4: 'Email'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getEmailEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDataDsl.g:1273:2: ( ( 'Currency' ) )
                    {
                    // InternalDataDsl.g:1273:2: ( ( 'Currency' ) )
                    // InternalDataDsl.g:1274:3: ( 'Currency' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getCurrencyEnumLiteralDeclaration_15()); 
                    // InternalDataDsl.g:1275:3: ( 'Currency' )
                    // InternalDataDsl.g:1275:4: 'Currency'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getCurrencyEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDataDsl.g:1279:2: ( ( 'CreditCard' ) )
                    {
                    // InternalDataDsl.g:1279:2: ( ( 'CreditCard' ) )
                    // InternalDataDsl.g:1280:3: ( 'CreditCard' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getCreditcardEnumLiteralDeclaration_16()); 
                    // InternalDataDsl.g:1281:3: ( 'CreditCard' )
                    // InternalDataDsl.g:1281:4: 'CreditCard'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getCreditcardEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDataDsl.g:1285:2: ( ( 'IBAN' ) )
                    {
                    // InternalDataDsl.g:1285:2: ( ( 'IBAN' ) )
                    // InternalDataDsl.g:1286:3: ( 'IBAN' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getIBANEnumLiteralDeclaration_17()); 
                    // InternalDataDsl.g:1287:3: ( 'IBAN' )
                    // InternalDataDsl.g:1287:4: 'IBAN'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getIBANEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalDataDsl.g:1291:2: ( ( 'ISBN' ) )
                    {
                    // InternalDataDsl.g:1291:2: ( ( 'ISBN' ) )
                    // InternalDataDsl.g:1292:3: ( 'ISBN' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getISBNEnumLiteralDeclaration_18()); 
                    // InternalDataDsl.g:1293:3: ( 'ISBN' )
                    // InternalDataDsl.g:1293:4: 'ISBN'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getISBNEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalDataDsl.g:1297:2: ( ( 'ISSN' ) )
                    {
                    // InternalDataDsl.g:1297:2: ( ( 'ISSN' ) )
                    // InternalDataDsl.g:1298:3: ( 'ISSN' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getISSNEnumLiteralDeclaration_19()); 
                    // InternalDataDsl.g:1299:3: ( 'ISSN' )
                    // InternalDataDsl.g:1299:4: 'ISSN'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getISSNEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalDataDsl.g:1303:2: ( ( 'Inet' ) )
                    {
                    // InternalDataDsl.g:1303:2: ( ( 'Inet' ) )
                    // InternalDataDsl.g:1304:3: ( 'Inet' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getInetEnumLiteralDeclaration_20()); 
                    // InternalDataDsl.g:1305:3: ( 'Inet' )
                    // InternalDataDsl.g:1305:4: 'Inet'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getInetEnumLiteralDeclaration_20()); 

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
    // InternalDataDsl.g:1313:1: rule__StringOptionKey__Alternatives : ( ( ( 'null' ) ) | ( ( 'separator' ) ) | ( ( 'default' ) ) | ( ( 'regex' ) ) | ( ( 'flags' ) ) | ( ( 'decimalchar' ) ) | ( ( 'pattern' ) ) | ( ( 'format' ) ) );
    public final void rule__StringOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1317:1: ( ( ( 'null' ) ) | ( ( 'separator' ) ) | ( ( 'default' ) ) | ( ( 'regex' ) ) | ( ( 'flags' ) ) | ( ( 'decimalchar' ) ) | ( ( 'pattern' ) ) | ( ( 'format' ) ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt13=1;
                }
                break;
            case 44:
                {
                alt13=2;
                }
                break;
            case 45:
                {
                alt13=3;
                }
                break;
            case 46:
                {
                alt13=4;
                }
                break;
            case 47:
                {
                alt13=5;
                }
                break;
            case 48:
                {
                alt13=6;
                }
                break;
            case 49:
                {
                alt13=7;
                }
                break;
            case 50:
                {
                alt13=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalDataDsl.g:1318:2: ( ( 'null' ) )
                    {
                    // InternalDataDsl.g:1318:2: ( ( 'null' ) )
                    // InternalDataDsl.g:1319:3: ( 'null' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1320:3: ( 'null' )
                    // InternalDataDsl.g:1320:4: 'null'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1324:2: ( ( 'separator' ) )
                    {
                    // InternalDataDsl.g:1324:2: ( ( 'separator' ) )
                    // InternalDataDsl.g:1325:3: ( 'separator' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1326:3: ( 'separator' )
                    // InternalDataDsl.g:1326:4: 'separator'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1330:2: ( ( 'default' ) )
                    {
                    // InternalDataDsl.g:1330:2: ( ( 'default' ) )
                    // InternalDataDsl.g:1331:3: ( 'default' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1332:3: ( 'default' )
                    // InternalDataDsl.g:1332:4: 'default'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1336:2: ( ( 'regex' ) )
                    {
                    // InternalDataDsl.g:1336:2: ( ( 'regex' ) )
                    // InternalDataDsl.g:1337:3: ( 'regex' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1338:3: ( 'regex' )
                    // InternalDataDsl.g:1338:4: 'regex'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1342:2: ( ( 'flags' ) )
                    {
                    // InternalDataDsl.g:1342:2: ( ( 'flags' ) )
                    // InternalDataDsl.g:1343:3: ( 'flags' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:1344:3: ( 'flags' )
                    // InternalDataDsl.g:1344:4: 'flags'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:1348:2: ( ( 'decimalchar' ) )
                    {
                    // InternalDataDsl.g:1348:2: ( ( 'decimalchar' ) )
                    // InternalDataDsl.g:1349:3: ( 'decimalchar' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:1350:3: ( 'decimalchar' )
                    // InternalDataDsl.g:1350:4: 'decimalchar'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:1354:2: ( ( 'pattern' ) )
                    {
                    // InternalDataDsl.g:1354:2: ( ( 'pattern' ) )
                    // InternalDataDsl.g:1355:3: ( 'pattern' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:1356:3: ( 'pattern' )
                    // InternalDataDsl.g:1356:4: 'pattern'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:1360:2: ( ( 'format' ) )
                    {
                    // InternalDataDsl.g:1360:2: ( ( 'format' ) )
                    // InternalDataDsl.g:1361:3: ( 'format' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getFormatEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:1362:3: ( 'format' )
                    // InternalDataDsl.g:1362:4: 'format'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getFormatEnumLiteralDeclaration_7()); 

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
    // InternalDataDsl.g:1370:1: rule__IntOptionKey__Alternatives : ( ( ( 'minLength' ) ) | ( ( 'maxLength' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'defaultvalue' ) ) );
    public final void rule__IntOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1374:1: ( ( ( 'minLength' ) ) | ( ( 'maxLength' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'defaultvalue' ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt14=1;
                }
                break;
            case 52:
                {
                alt14=2;
                }
                break;
            case 53:
                {
                alt14=3;
                }
                break;
            case 54:
                {
                alt14=4;
                }
                break;
            case 55:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDataDsl.g:1375:2: ( ( 'minLength' ) )
                    {
                    // InternalDataDsl.g:1375:2: ( ( 'minLength' ) )
                    // InternalDataDsl.g:1376:3: ( 'minLength' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1377:3: ( 'minLength' )
                    // InternalDataDsl.g:1377:4: 'minLength'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1381:2: ( ( 'maxLength' ) )
                    {
                    // InternalDataDsl.g:1381:2: ( ( 'maxLength' ) )
                    // InternalDataDsl.g:1382:3: ( 'maxLength' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1383:3: ( 'maxLength' )
                    // InternalDataDsl.g:1383:4: 'maxLength'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1387:2: ( ( 'min' ) )
                    {
                    // InternalDataDsl.g:1387:2: ( ( 'min' ) )
                    // InternalDataDsl.g:1388:3: ( 'min' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1389:3: ( 'min' )
                    // InternalDataDsl.g:1389:4: 'min'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1393:2: ( ( 'max' ) )
                    {
                    // InternalDataDsl.g:1393:2: ( ( 'max' ) )
                    // InternalDataDsl.g:1394:3: ( 'max' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1395:3: ( 'max' )
                    // InternalDataDsl.g:1395:4: 'max'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1399:2: ( ( 'defaultvalue' ) )
                    {
                    // InternalDataDsl.g:1399:2: ( ( 'defaultvalue' ) )
                    // InternalDataDsl.g:1400:3: ( 'defaultvalue' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getDefaultEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:1401:3: ( 'defaultvalue' )
                    // InternalDataDsl.g:1401:4: 'defaultvalue'
                    {
                    match(input,55,FOLLOW_2); 

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
    // InternalDataDsl.g:1409:1: rule__DoubleOptionKey__Alternatives : ( ( ( 'minDouble' ) ) | ( ( 'maxDouble' ) ) | ( ( 'defaultvalueDouble' ) ) );
    public final void rule__DoubleOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1413:1: ( ( ( 'minDouble' ) ) | ( ( 'maxDouble' ) ) | ( ( 'defaultvalueDouble' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt15=1;
                }
                break;
            case 57:
                {
                alt15=2;
                }
                break;
            case 58:
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
                    // InternalDataDsl.g:1414:2: ( ( 'minDouble' ) )
                    {
                    // InternalDataDsl.g:1414:2: ( ( 'minDouble' ) )
                    // InternalDataDsl.g:1415:3: ( 'minDouble' )
                    {
                     before(grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1416:3: ( 'minDouble' )
                    // InternalDataDsl.g:1416:4: 'minDouble'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1420:2: ( ( 'maxDouble' ) )
                    {
                    // InternalDataDsl.g:1420:2: ( ( 'maxDouble' ) )
                    // InternalDataDsl.g:1421:3: ( 'maxDouble' )
                    {
                     before(grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1422:3: ( 'maxDouble' )
                    // InternalDataDsl.g:1422:4: 'maxDouble'
                    {
                    match(input,57,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1426:2: ( ( 'defaultvalueDouble' ) )
                    {
                    // InternalDataDsl.g:1426:2: ( ( 'defaultvalueDouble' ) )
                    // InternalDataDsl.g:1427:3: ( 'defaultvalueDouble' )
                    {
                     before(grammarAccess.getDoubleOptionKeyAccess().getDefaultEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1428:3: ( 'defaultvalueDouble' )
                    // InternalDataDsl.g:1428:4: 'defaultvalueDouble'
                    {
                    match(input,58,FOLLOW_2); 

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


    // $ANTLR start "rule__BooleanOptionKey__Alternatives"
    // InternalDataDsl.g:1436:1: rule__BooleanOptionKey__Alternatives : ( ( ( 'nullable' ) ) | ( ( 'casesensitive' ) ) );
    public final void rule__BooleanOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1440:1: ( ( ( 'nullable' ) ) | ( ( 'casesensitive' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==59) ) {
                alt16=1;
            }
            else if ( (LA16_0==60) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataDsl.g:1441:2: ( ( 'nullable' ) )
                    {
                    // InternalDataDsl.g:1441:2: ( ( 'nullable' ) )
                    // InternalDataDsl.g:1442:3: ( 'nullable' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1443:3: ( 'nullable' )
                    // InternalDataDsl.g:1443:4: 'nullable'
                    {
                    match(input,59,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1447:2: ( ( 'casesensitive' ) )
                    {
                    // InternalDataDsl.g:1447:2: ( ( 'casesensitive' ) )
                    // InternalDataDsl.g:1448:3: ( 'casesensitive' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1449:3: ( 'casesensitive' )
                    // InternalDataDsl.g:1449:4: 'casesensitive'
                    {
                    match(input,60,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__BooleanOptionKey__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // InternalDataDsl.g:1457:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1461:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalDataDsl.g:1462:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
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
    // InternalDataDsl.g:1469:1: rule__DataModel__Group__0__Impl : ( () ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1473:1: ( ( () ) )
            // InternalDataDsl.g:1474:1: ( () )
            {
            // InternalDataDsl.g:1474:1: ( () )
            // InternalDataDsl.g:1475:2: ()
            {
             before(grammarAccess.getDataModelAccess().getDataModelAction_0()); 
            // InternalDataDsl.g:1476:2: ()
            // InternalDataDsl.g:1476:3: 
            {
            }

             after(grammarAccess.getDataModelAccess().getDataModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__0__Impl"


    // $ANTLR start "rule__DataModel__Group__1"
    // InternalDataDsl.g:1484:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1488:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // InternalDataDsl.g:1489:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DataModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__2();

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
    // InternalDataDsl.g:1496:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__ElementsAssignment_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1500:1: ( ( ( rule__DataModel__ElementsAssignment_1 ) ) )
            // InternalDataDsl.g:1501:1: ( ( rule__DataModel__ElementsAssignment_1 ) )
            {
            // InternalDataDsl.g:1501:1: ( ( rule__DataModel__ElementsAssignment_1 ) )
            // InternalDataDsl.g:1502:2: ( rule__DataModel__ElementsAssignment_1 )
            {
             before(grammarAccess.getDataModelAccess().getElementsAssignment_1()); 
            // InternalDataDsl.g:1503:2: ( rule__DataModel__ElementsAssignment_1 )
            // InternalDataDsl.g:1503:3: rule__DataModel__ElementsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getElementsAssignment_1()); 

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


    // $ANTLR start "rule__DataModel__Group__2"
    // InternalDataDsl.g:1511:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1515:1: ( rule__DataModel__Group__2__Impl )
            // InternalDataDsl.g:1516:2: rule__DataModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__2__Impl();

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
    // $ANTLR end "rule__DataModel__Group__2"


    // $ANTLR start "rule__DataModel__Group__2__Impl"
    // InternalDataDsl.g:1522:1: rule__DataModel__Group__2__Impl : ( ( rule__DataModel__ElementsAssignment_2 )* ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1526:1: ( ( ( rule__DataModel__ElementsAssignment_2 )* ) )
            // InternalDataDsl.g:1527:1: ( ( rule__DataModel__ElementsAssignment_2 )* )
            {
            // InternalDataDsl.g:1527:1: ( ( rule__DataModel__ElementsAssignment_2 )* )
            // InternalDataDsl.g:1528:2: ( rule__DataModel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDataModelAccess().getElementsAssignment_2()); 
            // InternalDataDsl.g:1529:2: ( rule__DataModel__ElementsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==61||LA17_0==64||LA17_0==67||LA17_0==73||(LA17_0>=75 && LA17_0<=77)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDataDsl.g:1529:3: rule__DataModel__ElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataModel__ElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getElementsAssignment_2()); 

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
    // $ANTLR end "rule__DataModel__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalDataDsl.g:1538:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1542:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDataDsl.g:1543:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalDataDsl.g:1550:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1554:1: ( ( 'import' ) )
            // InternalDataDsl.g:1555:1: ( 'import' )
            {
            // InternalDataDsl.g:1555:1: ( 'import' )
            // InternalDataDsl.g:1556:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalDataDsl.g:1565:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1569:1: ( rule__Import__Group__1__Impl )
            // InternalDataDsl.g:1570:2: rule__Import__Group__1__Impl
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
    // InternalDataDsl.g:1576:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1580:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalDataDsl.g:1581:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalDataDsl.g:1581:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalDataDsl.g:1582:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalDataDsl.g:1583:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalDataDsl.g:1583:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalDataDsl.g:1592:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1596:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalDataDsl.g:1597:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalDataDsl.g:1604:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1608:1: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:1609:1: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:1609:1: ( ruleQualifiedName )
            // InternalDataDsl.g:1610:2: ruleQualifiedName
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
    // InternalDataDsl.g:1619:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1623:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalDataDsl.g:1624:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalDataDsl.g:1630:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1634:1: ( ( ( '.*' )? ) )
            // InternalDataDsl.g:1635:1: ( ( '.*' )? )
            {
            // InternalDataDsl.g:1635:1: ( ( '.*' )? )
            // InternalDataDsl.g:1636:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalDataDsl.g:1637:2: ( '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==62) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataDsl.g:1637:3: '.*'
                    {
                    match(input,62,FOLLOW_2); 

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
    // InternalDataDsl.g:1646:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1650:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDataDsl.g:1651:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalDataDsl.g:1658:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1662:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:1663:1: ( RULE_ID )
            {
            // InternalDataDsl.g:1663:1: ( RULE_ID )
            // InternalDataDsl.g:1664:2: RULE_ID
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
    // InternalDataDsl.g:1673:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1677:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDataDsl.g:1678:2: rule__QualifiedName__Group__1__Impl
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
    // InternalDataDsl.g:1684:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1688:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDataDsl.g:1689:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDataDsl.g:1689:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDataDsl.g:1690:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalDataDsl.g:1691:2: ( rule__QualifiedName__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==63) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDataDsl.g:1691:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalDataDsl.g:1700:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1704:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDataDsl.g:1705:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalDataDsl.g:1712:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1716:1: ( ( '.' ) )
            // InternalDataDsl.g:1717:1: ( '.' )
            {
            // InternalDataDsl.g:1717:1: ( '.' )
            // InternalDataDsl.g:1718:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalDataDsl.g:1727:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1731:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDataDsl.g:1732:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalDataDsl.g:1738:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1742:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:1743:1: ( RULE_ID )
            {
            // InternalDataDsl.g:1743:1: ( RULE_ID )
            // InternalDataDsl.g:1744:2: RULE_ID
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


    // $ANTLR start "rule__Package__Group__0"
    // InternalDataDsl.g:1754:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1758:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalDataDsl.g:1759:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Package__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__1();

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
    // $ANTLR end "rule__Package__Group__0"


    // $ANTLR start "rule__Package__Group__0__Impl"
    // InternalDataDsl.g:1766:1: rule__Package__Group__0__Impl : ( ( rule__Package__Group_0__0 )? ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1770:1: ( ( ( rule__Package__Group_0__0 )? ) )
            // InternalDataDsl.g:1771:1: ( ( rule__Package__Group_0__0 )? )
            {
            // InternalDataDsl.g:1771:1: ( ( rule__Package__Group_0__0 )? )
            // InternalDataDsl.g:1772:2: ( rule__Package__Group_0__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_0()); 
            // InternalDataDsl.g:1773:2: ( rule__Package__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==67) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataDsl.g:1773:3: rule__Package__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Package__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPackageAccess().getGroup_0()); 

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
    // $ANTLR end "rule__Package__Group__0__Impl"


    // $ANTLR start "rule__Package__Group__1"
    // InternalDataDsl.g:1781:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1785:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalDataDsl.g:1786:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Package__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__2();

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
    // $ANTLR end "rule__Package__Group__1"


    // $ANTLR start "rule__Package__Group__1__Impl"
    // InternalDataDsl.g:1793:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1797:1: ( ( 'package' ) )
            // InternalDataDsl.g:1798:1: ( 'package' )
            {
            // InternalDataDsl.g:1798:1: ( 'package' )
            // InternalDataDsl.g:1799:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getPackageKeyword_1()); 

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
    // $ANTLR end "rule__Package__Group__1__Impl"


    // $ANTLR start "rule__Package__Group__2"
    // InternalDataDsl.g:1808:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1812:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalDataDsl.g:1813:2: rule__Package__Group__2__Impl rule__Package__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Package__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__3();

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
    // $ANTLR end "rule__Package__Group__2"


    // $ANTLR start "rule__Package__Group__2__Impl"
    // InternalDataDsl.g:1820:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1824:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalDataDsl.g:1825:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:1825:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalDataDsl.g:1826:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:1827:2: ( rule__Package__NameAssignment_2 )
            // InternalDataDsl.g:1827:3: rule__Package__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Package__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Package__Group__2__Impl"


    // $ANTLR start "rule__Package__Group__3"
    // InternalDataDsl.g:1835:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1839:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalDataDsl.g:1840:2: rule__Package__Group__3__Impl rule__Package__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Package__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__4();

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
    // $ANTLR end "rule__Package__Group__3"


    // $ANTLR start "rule__Package__Group__3__Impl"
    // InternalDataDsl.g:1847:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1851:1: ( ( '{' ) )
            // InternalDataDsl.g:1852:1: ( '{' )
            {
            // InternalDataDsl.g:1852:1: ( '{' )
            // InternalDataDsl.g:1853:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Package__Group__3__Impl"


    // $ANTLR start "rule__Package__Group__4"
    // InternalDataDsl.g:1862:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1866:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalDataDsl.g:1867:2: rule__Package__Group__4__Impl rule__Package__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Package__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__5();

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
    // $ANTLR end "rule__Package__Group__4"


    // $ANTLR start "rule__Package__Group__4__Impl"
    // InternalDataDsl.g:1874:1: rule__Package__Group__4__Impl : ( ( rule__Package__ElementsAssignment_4 ) ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1878:1: ( ( ( rule__Package__ElementsAssignment_4 ) ) )
            // InternalDataDsl.g:1879:1: ( ( rule__Package__ElementsAssignment_4 ) )
            {
            // InternalDataDsl.g:1879:1: ( ( rule__Package__ElementsAssignment_4 ) )
            // InternalDataDsl.g:1880:2: ( rule__Package__ElementsAssignment_4 )
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_4()); 
            // InternalDataDsl.g:1881:2: ( rule__Package__ElementsAssignment_4 )
            // InternalDataDsl.g:1881:3: rule__Package__ElementsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Package__ElementsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getElementsAssignment_4()); 

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
    // $ANTLR end "rule__Package__Group__4__Impl"


    // $ANTLR start "rule__Package__Group__5"
    // InternalDataDsl.g:1889:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1893:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalDataDsl.g:1894:2: rule__Package__Group__5__Impl rule__Package__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Package__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group__6();

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
    // $ANTLR end "rule__Package__Group__5"


    // $ANTLR start "rule__Package__Group__5__Impl"
    // InternalDataDsl.g:1901:1: rule__Package__Group__5__Impl : ( ( rule__Package__ElementsAssignment_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1905:1: ( ( ( rule__Package__ElementsAssignment_5 )* ) )
            // InternalDataDsl.g:1906:1: ( ( rule__Package__ElementsAssignment_5 )* )
            {
            // InternalDataDsl.g:1906:1: ( ( rule__Package__ElementsAssignment_5 )* )
            // InternalDataDsl.g:1907:2: ( rule__Package__ElementsAssignment_5 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_5()); 
            // InternalDataDsl.g:1908:2: ( rule__Package__ElementsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==73||(LA21_0>=75 && LA21_0<=77)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDataDsl.g:1908:3: rule__Package__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Package__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getElementsAssignment_5()); 

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
    // $ANTLR end "rule__Package__Group__5__Impl"


    // $ANTLR start "rule__Package__Group__6"
    // InternalDataDsl.g:1916:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1920:1: ( rule__Package__Group__6__Impl )
            // InternalDataDsl.g:1921:2: rule__Package__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group__6__Impl();

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
    // $ANTLR end "rule__Package__Group__6"


    // $ANTLR start "rule__Package__Group__6__Impl"
    // InternalDataDsl.g:1927:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1931:1: ( ( '}' ) )
            // InternalDataDsl.g:1932:1: ( '}' )
            {
            // InternalDataDsl.g:1932:1: ( '}' )
            // InternalDataDsl.g:1933:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Package__Group__6__Impl"


    // $ANTLR start "rule__Package__Group_0__0"
    // InternalDataDsl.g:1943:1: rule__Package__Group_0__0 : rule__Package__Group_0__0__Impl rule__Package__Group_0__1 ;
    public final void rule__Package__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1947:1: ( rule__Package__Group_0__0__Impl rule__Package__Group_0__1 )
            // InternalDataDsl.g:1948:2: rule__Package__Group_0__0__Impl rule__Package__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Package__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Package__Group_0__1();

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
    // $ANTLR end "rule__Package__Group_0__0"


    // $ANTLR start "rule__Package__Group_0__0__Impl"
    // InternalDataDsl.g:1955:1: rule__Package__Group_0__0__Impl : ( ( rule__Package__TagsAssignment_0_0 ) ) ;
    public final void rule__Package__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1959:1: ( ( ( rule__Package__TagsAssignment_0_0 ) ) )
            // InternalDataDsl.g:1960:1: ( ( rule__Package__TagsAssignment_0_0 ) )
            {
            // InternalDataDsl.g:1960:1: ( ( rule__Package__TagsAssignment_0_0 ) )
            // InternalDataDsl.g:1961:2: ( rule__Package__TagsAssignment_0_0 )
            {
             before(grammarAccess.getPackageAccess().getTagsAssignment_0_0()); 
            // InternalDataDsl.g:1962:2: ( rule__Package__TagsAssignment_0_0 )
            // InternalDataDsl.g:1962:3: rule__Package__TagsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Package__TagsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPackageAccess().getTagsAssignment_0_0()); 

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
    // $ANTLR end "rule__Package__Group_0__0__Impl"


    // $ANTLR start "rule__Package__Group_0__1"
    // InternalDataDsl.g:1970:1: rule__Package__Group_0__1 : rule__Package__Group_0__1__Impl ;
    public final void rule__Package__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1974:1: ( rule__Package__Group_0__1__Impl )
            // InternalDataDsl.g:1975:2: rule__Package__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Package__Group_0__1__Impl();

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
    // $ANTLR end "rule__Package__Group_0__1"


    // $ANTLR start "rule__Package__Group_0__1__Impl"
    // InternalDataDsl.g:1981:1: rule__Package__Group_0__1__Impl : ( ( rule__Package__TagsAssignment_0_1 )* ) ;
    public final void rule__Package__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1985:1: ( ( ( rule__Package__TagsAssignment_0_1 )* ) )
            // InternalDataDsl.g:1986:1: ( ( rule__Package__TagsAssignment_0_1 )* )
            {
            // InternalDataDsl.g:1986:1: ( ( rule__Package__TagsAssignment_0_1 )* )
            // InternalDataDsl.g:1987:2: ( rule__Package__TagsAssignment_0_1 )*
            {
             before(grammarAccess.getPackageAccess().getTagsAssignment_0_1()); 
            // InternalDataDsl.g:1988:2: ( rule__Package__TagsAssignment_0_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==67) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDataDsl.g:1988:3: rule__Package__TagsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Package__TagsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPackageAccess().getTagsAssignment_0_1()); 

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
    // $ANTLR end "rule__Package__Group_0__1__Impl"


    // $ANTLR start "rule__Tag__Group__0"
    // InternalDataDsl.g:1997:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2001:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalDataDsl.g:2002:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Tag__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tag__Group__1();

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
    // $ANTLR end "rule__Tag__Group__0"


    // $ANTLR start "rule__Tag__Group__0__Impl"
    // InternalDataDsl.g:2009:1: rule__Tag__Group__0__Impl : ( '@' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2013:1: ( ( '@' ) )
            // InternalDataDsl.g:2014:1: ( '@' )
            {
            // InternalDataDsl.g:2014:1: ( '@' )
            // InternalDataDsl.g:2015:2: '@'
            {
             before(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 

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
    // $ANTLR end "rule__Tag__Group__0__Impl"


    // $ANTLR start "rule__Tag__Group__1"
    // InternalDataDsl.g:2024:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2028:1: ( rule__Tag__Group__1__Impl )
            // InternalDataDsl.g:2029:2: rule__Tag__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tag__Group__1__Impl();

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
    // $ANTLR end "rule__Tag__Group__1"


    // $ANTLR start "rule__Tag__Group__1__Impl"
    // InternalDataDsl.g:2035:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__TagAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2039:1: ( ( ( rule__Tag__TagAssignment_1 ) ) )
            // InternalDataDsl.g:2040:1: ( ( rule__Tag__TagAssignment_1 ) )
            {
            // InternalDataDsl.g:2040:1: ( ( rule__Tag__TagAssignment_1 ) )
            // InternalDataDsl.g:2041:2: ( rule__Tag__TagAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getTagAssignment_1()); 
            // InternalDataDsl.g:2042:2: ( rule__Tag__TagAssignment_1 )
            // InternalDataDsl.g:2042:3: rule__Tag__TagAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Tag__TagAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTagAccess().getTagAssignment_1()); 

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
    // $ANTLR end "rule__Tag__Group__1__Impl"


    // $ANTLR start "rule__Substring__Group__0"
    // InternalDataDsl.g:2051:1: rule__Substring__Group__0 : rule__Substring__Group__0__Impl rule__Substring__Group__1 ;
    public final void rule__Substring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2055:1: ( rule__Substring__Group__0__Impl rule__Substring__Group__1 )
            // InternalDataDsl.g:2056:2: rule__Substring__Group__0__Impl rule__Substring__Group__1
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
    // InternalDataDsl.g:2063:1: rule__Substring__Group__0__Impl : ( ( rule__Substring__TypeStringAssignment_0 ) ) ;
    public final void rule__Substring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2067:1: ( ( ( rule__Substring__TypeStringAssignment_0 ) ) )
            // InternalDataDsl.g:2068:1: ( ( rule__Substring__TypeStringAssignment_0 ) )
            {
            // InternalDataDsl.g:2068:1: ( ( rule__Substring__TypeStringAssignment_0 ) )
            // InternalDataDsl.g:2069:2: ( rule__Substring__TypeStringAssignment_0 )
            {
             before(grammarAccess.getSubstringAccess().getTypeStringAssignment_0()); 
            // InternalDataDsl.g:2070:2: ( rule__Substring__TypeStringAssignment_0 )
            // InternalDataDsl.g:2070:3: rule__Substring__TypeStringAssignment_0
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
    // InternalDataDsl.g:2078:1: rule__Substring__Group__1 : rule__Substring__Group__1__Impl rule__Substring__Group__2 ;
    public final void rule__Substring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2082:1: ( rule__Substring__Group__1__Impl rule__Substring__Group__2 )
            // InternalDataDsl.g:2083:2: rule__Substring__Group__1__Impl rule__Substring__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalDataDsl.g:2090:1: rule__Substring__Group__1__Impl : ( ( rule__Substring__NameAssignment_1 ) ) ;
    public final void rule__Substring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2094:1: ( ( ( rule__Substring__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2095:1: ( ( rule__Substring__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2095:1: ( ( rule__Substring__NameAssignment_1 ) )
            // InternalDataDsl.g:2096:2: ( rule__Substring__NameAssignment_1 )
            {
             before(grammarAccess.getSubstringAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2097:2: ( rule__Substring__NameAssignment_1 )
            // InternalDataDsl.g:2097:3: rule__Substring__NameAssignment_1
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
    // InternalDataDsl.g:2105:1: rule__Substring__Group__2 : rule__Substring__Group__2__Impl rule__Substring__Group__3 ;
    public final void rule__Substring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2109:1: ( rule__Substring__Group__2__Impl rule__Substring__Group__3 )
            // InternalDataDsl.g:2110:2: rule__Substring__Group__2__Impl rule__Substring__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataDsl.g:2117:1: rule__Substring__Group__2__Impl : ( '[' ) ;
    public final void rule__Substring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2121:1: ( ( '[' ) )
            // InternalDataDsl.g:2122:1: ( '[' )
            {
            // InternalDataDsl.g:2122:1: ( '[' )
            // InternalDataDsl.g:2123:2: '['
            {
             before(grammarAccess.getSubstringAccess().getLeftSquareBracketKeyword_2()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:2132:1: rule__Substring__Group__3 : rule__Substring__Group__3__Impl rule__Substring__Group__4 ;
    public final void rule__Substring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2136:1: ( rule__Substring__Group__3__Impl rule__Substring__Group__4 )
            // InternalDataDsl.g:2137:2: rule__Substring__Group__3__Impl rule__Substring__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataDsl.g:2144:1: rule__Substring__Group__3__Impl : ( ( rule__Substring__MinlengthAssignment_3 ) ) ;
    public final void rule__Substring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2148:1: ( ( ( rule__Substring__MinlengthAssignment_3 ) ) )
            // InternalDataDsl.g:2149:1: ( ( rule__Substring__MinlengthAssignment_3 ) )
            {
            // InternalDataDsl.g:2149:1: ( ( rule__Substring__MinlengthAssignment_3 ) )
            // InternalDataDsl.g:2150:2: ( rule__Substring__MinlengthAssignment_3 )
            {
             before(grammarAccess.getSubstringAccess().getMinlengthAssignment_3()); 
            // InternalDataDsl.g:2151:2: ( rule__Substring__MinlengthAssignment_3 )
            // InternalDataDsl.g:2151:3: rule__Substring__MinlengthAssignment_3
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
    // InternalDataDsl.g:2159:1: rule__Substring__Group__4 : rule__Substring__Group__4__Impl rule__Substring__Group__5 ;
    public final void rule__Substring__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2163:1: ( rule__Substring__Group__4__Impl rule__Substring__Group__5 )
            // InternalDataDsl.g:2164:2: rule__Substring__Group__4__Impl rule__Substring__Group__5
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataDsl.g:2171:1: rule__Substring__Group__4__Impl : ( ',' ) ;
    public final void rule__Substring__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2175:1: ( ( ',' ) )
            // InternalDataDsl.g:2176:1: ( ',' )
            {
            // InternalDataDsl.g:2176:1: ( ',' )
            // InternalDataDsl.g:2177:2: ','
            {
             before(grammarAccess.getSubstringAccess().getCommaKeyword_4()); 
            match(input,69,FOLLOW_2); 
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
    // InternalDataDsl.g:2186:1: rule__Substring__Group__5 : rule__Substring__Group__5__Impl rule__Substring__Group__6 ;
    public final void rule__Substring__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2190:1: ( rule__Substring__Group__5__Impl rule__Substring__Group__6 )
            // InternalDataDsl.g:2191:2: rule__Substring__Group__5__Impl rule__Substring__Group__6
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataDsl.g:2198:1: rule__Substring__Group__5__Impl : ( ( rule__Substring__MaxlengthAssignment_5 ) ) ;
    public final void rule__Substring__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2202:1: ( ( ( rule__Substring__MaxlengthAssignment_5 ) ) )
            // InternalDataDsl.g:2203:1: ( ( rule__Substring__MaxlengthAssignment_5 ) )
            {
            // InternalDataDsl.g:2203:1: ( ( rule__Substring__MaxlengthAssignment_5 ) )
            // InternalDataDsl.g:2204:2: ( rule__Substring__MaxlengthAssignment_5 )
            {
             before(grammarAccess.getSubstringAccess().getMaxlengthAssignment_5()); 
            // InternalDataDsl.g:2205:2: ( rule__Substring__MaxlengthAssignment_5 )
            // InternalDataDsl.g:2205:3: rule__Substring__MaxlengthAssignment_5
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
    // InternalDataDsl.g:2213:1: rule__Substring__Group__6 : rule__Substring__Group__6__Impl ;
    public final void rule__Substring__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2217:1: ( rule__Substring__Group__6__Impl )
            // InternalDataDsl.g:2218:2: rule__Substring__Group__6__Impl
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
    // InternalDataDsl.g:2224:1: rule__Substring__Group__6__Impl : ( ']' ) ;
    public final void rule__Substring__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2228:1: ( ( ']' ) )
            // InternalDataDsl.g:2229:1: ( ']' )
            {
            // InternalDataDsl.g:2229:1: ( ']' )
            // InternalDataDsl.g:2230:2: ']'
            {
             before(grammarAccess.getSubstringAccess().getRightSquareBracketKeyword_6()); 
            match(input,70,FOLLOW_2); 
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
    // InternalDataDsl.g:2240:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2244:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // InternalDataDsl.g:2245:2: rule__Character__Group__0__Impl rule__Character__Group__1
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
    // InternalDataDsl.g:2252:1: rule__Character__Group__0__Impl : ( ( rule__Character__TypeCharacterAssignment_0 ) ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2256:1: ( ( ( rule__Character__TypeCharacterAssignment_0 ) ) )
            // InternalDataDsl.g:2257:1: ( ( rule__Character__TypeCharacterAssignment_0 ) )
            {
            // InternalDataDsl.g:2257:1: ( ( rule__Character__TypeCharacterAssignment_0 ) )
            // InternalDataDsl.g:2258:2: ( rule__Character__TypeCharacterAssignment_0 )
            {
             before(grammarAccess.getCharacterAccess().getTypeCharacterAssignment_0()); 
            // InternalDataDsl.g:2259:2: ( rule__Character__TypeCharacterAssignment_0 )
            // InternalDataDsl.g:2259:3: rule__Character__TypeCharacterAssignment_0
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
    // InternalDataDsl.g:2267:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2271:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // InternalDataDsl.g:2272:2: rule__Character__Group__1__Impl rule__Character__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:2279:1: rule__Character__Group__1__Impl : ( ( rule__Character__NameAssignment_1 ) ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2283:1: ( ( ( rule__Character__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2284:1: ( ( rule__Character__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2284:1: ( ( rule__Character__NameAssignment_1 ) )
            // InternalDataDsl.g:2285:2: ( rule__Character__NameAssignment_1 )
            {
             before(grammarAccess.getCharacterAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2286:2: ( rule__Character__NameAssignment_1 )
            // InternalDataDsl.g:2286:3: rule__Character__NameAssignment_1
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
    // InternalDataDsl.g:2294:1: rule__Character__Group__2 : rule__Character__Group__2__Impl ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2298:1: ( rule__Character__Group__2__Impl )
            // InternalDataDsl.g:2299:2: rule__Character__Group__2__Impl
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
    // InternalDataDsl.g:2305:1: rule__Character__Group__2__Impl : ( ( rule__Character__ValueAssignment_2 )? ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2309:1: ( ( ( rule__Character__ValueAssignment_2 )? ) )
            // InternalDataDsl.g:2310:1: ( ( rule__Character__ValueAssignment_2 )? )
            {
            // InternalDataDsl.g:2310:1: ( ( rule__Character__ValueAssignment_2 )? )
            // InternalDataDsl.g:2311:2: ( rule__Character__ValueAssignment_2 )?
            {
             before(grammarAccess.getCharacterAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:2312:2: ( rule__Character__ValueAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataDsl.g:2312:3: rule__Character__ValueAssignment_2
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


    // $ANTLR start "rule__CompositeNode__Group__0"
    // InternalDataDsl.g:2321:1: rule__CompositeNode__Group__0 : rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 ;
    public final void rule__CompositeNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2325:1: ( rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 )
            // InternalDataDsl.g:2326:2: rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CompositeNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__1();

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
    // $ANTLR end "rule__CompositeNode__Group__0"


    // $ANTLR start "rule__CompositeNode__Group__0__Impl"
    // InternalDataDsl.g:2333:1: rule__CompositeNode__Group__0__Impl : ( ( rule__CompositeNode__Alternatives_0 )? ) ;
    public final void rule__CompositeNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2337:1: ( ( ( rule__CompositeNode__Alternatives_0 )? ) )
            // InternalDataDsl.g:2338:1: ( ( rule__CompositeNode__Alternatives_0 )? )
            {
            // InternalDataDsl.g:2338:1: ( ( rule__CompositeNode__Alternatives_0 )? )
            // InternalDataDsl.g:2339:2: ( rule__CompositeNode__Alternatives_0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getAlternatives_0()); 
            // InternalDataDsl.g:2340:2: ( rule__CompositeNode__Alternatives_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=79 && LA24_0<=80)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDsl.g:2340:3: rule__CompositeNode__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__CompositeNode__Group__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group__1"
    // InternalDataDsl.g:2348:1: rule__CompositeNode__Group__1 : rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 ;
    public final void rule__CompositeNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2352:1: ( rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 )
            // InternalDataDsl.g:2353:2: rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CompositeNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__2();

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
    // $ANTLR end "rule__CompositeNode__Group__1"


    // $ANTLR start "rule__CompositeNode__Group__1__Impl"
    // InternalDataDsl.g:2360:1: rule__CompositeNode__Group__1__Impl : ( ( rule__CompositeNode__TypeAssignment_1 ) ) ;
    public final void rule__CompositeNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2364:1: ( ( ( rule__CompositeNode__TypeAssignment_1 ) ) )
            // InternalDataDsl.g:2365:1: ( ( rule__CompositeNode__TypeAssignment_1 ) )
            {
            // InternalDataDsl.g:2365:1: ( ( rule__CompositeNode__TypeAssignment_1 ) )
            // InternalDataDsl.g:2366:2: ( rule__CompositeNode__TypeAssignment_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getTypeAssignment_1()); 
            // InternalDataDsl.g:2367:2: ( rule__CompositeNode__TypeAssignment_1 )
            // InternalDataDsl.g:2367:3: rule__CompositeNode__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__CompositeNode__Group__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group__2"
    // InternalDataDsl.g:2375:1: rule__CompositeNode__Group__2 : rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 ;
    public final void rule__CompositeNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2379:1: ( rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 )
            // InternalDataDsl.g:2380:2: rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__CompositeNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__3();

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
    // $ANTLR end "rule__CompositeNode__Group__2"


    // $ANTLR start "rule__CompositeNode__Group__2__Impl"
    // InternalDataDsl.g:2387:1: rule__CompositeNode__Group__2__Impl : ( ( rule__CompositeNode__NameAssignment_2 ) ) ;
    public final void rule__CompositeNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2391:1: ( ( ( rule__CompositeNode__NameAssignment_2 ) ) )
            // InternalDataDsl.g:2392:1: ( ( rule__CompositeNode__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:2392:1: ( ( rule__CompositeNode__NameAssignment_2 ) )
            // InternalDataDsl.g:2393:2: ( rule__CompositeNode__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeNodeAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:2394:2: ( rule__CompositeNode__NameAssignment_2 )
            // InternalDataDsl.g:2394:3: rule__CompositeNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__CompositeNode__Group__2__Impl"


    // $ANTLR start "rule__CompositeNode__Group__3"
    // InternalDataDsl.g:2402:1: rule__CompositeNode__Group__3 : rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 ;
    public final void rule__CompositeNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2406:1: ( rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 )
            // InternalDataDsl.g:2407:2: rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__CompositeNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__4();

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
    // $ANTLR end "rule__CompositeNode__Group__3"


    // $ANTLR start "rule__CompositeNode__Group__3__Impl"
    // InternalDataDsl.g:2414:1: rule__CompositeNode__Group__3__Impl : ( ( rule__CompositeNode__Group_3__0 )? ) ;
    public final void rule__CompositeNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2418:1: ( ( ( rule__CompositeNode__Group_3__0 )? ) )
            // InternalDataDsl.g:2419:1: ( ( rule__CompositeNode__Group_3__0 )? )
            {
            // InternalDataDsl.g:2419:1: ( ( rule__CompositeNode__Group_3__0 )? )
            // InternalDataDsl.g:2420:2: ( rule__CompositeNode__Group_3__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_3()); 
            // InternalDataDsl.g:2421:2: ( rule__CompositeNode__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==68) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDsl.g:2421:3: rule__CompositeNode__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__CompositeNode__Group__3__Impl"


    // $ANTLR start "rule__CompositeNode__Group__4"
    // InternalDataDsl.g:2429:1: rule__CompositeNode__Group__4 : rule__CompositeNode__Group__4__Impl ;
    public final void rule__CompositeNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2433:1: ( rule__CompositeNode__Group__4__Impl )
            // InternalDataDsl.g:2434:2: rule__CompositeNode__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__4__Impl();

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
    // $ANTLR end "rule__CompositeNode__Group__4"


    // $ANTLR start "rule__CompositeNode__Group__4__Impl"
    // InternalDataDsl.g:2440:1: rule__CompositeNode__Group__4__Impl : ( ( rule__CompositeNode__Group_4__0 )? ) ;
    public final void rule__CompositeNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2444:1: ( ( ( rule__CompositeNode__Group_4__0 )? ) )
            // InternalDataDsl.g:2445:1: ( ( rule__CompositeNode__Group_4__0 )? )
            {
            // InternalDataDsl.g:2445:1: ( ( rule__CompositeNode__Group_4__0 )? )
            // InternalDataDsl.g:2446:2: ( rule__CompositeNode__Group_4__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_4()); 
            // InternalDataDsl.g:2447:2: ( rule__CompositeNode__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==71) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataDsl.g:2447:3: rule__CompositeNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__CompositeNode__Group__4__Impl"


    // $ANTLR start "rule__CompositeNode__Group_3__0"
    // InternalDataDsl.g:2456:1: rule__CompositeNode__Group_3__0 : rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1 ;
    public final void rule__CompositeNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2460:1: ( rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1 )
            // InternalDataDsl.g:2461:2: rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__CompositeNode__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_3__1();

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
    // $ANTLR end "rule__CompositeNode__Group_3__0"


    // $ANTLR start "rule__CompositeNode__Group_3__0__Impl"
    // InternalDataDsl.g:2468:1: rule__CompositeNode__Group_3__0__Impl : ( '[' ) ;
    public final void rule__CompositeNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2472:1: ( ( '[' ) )
            // InternalDataDsl.g:2473:1: ( '[' )
            {
            // InternalDataDsl.g:2473:1: ( '[' )
            // InternalDataDsl.g:2474:2: '['
            {
             before(grammarAccess.getCompositeNodeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getLeftSquareBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__CompositeNode__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_3__1"
    // InternalDataDsl.g:2483:1: rule__CompositeNode__Group_3__1 : rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2 ;
    public final void rule__CompositeNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2487:1: ( rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2 )
            // InternalDataDsl.g:2488:2: rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__CompositeNode__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_3__2();

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
    // $ANTLR end "rule__CompositeNode__Group_3__1"


    // $ANTLR start "rule__CompositeNode__Group_3__1__Impl"
    // InternalDataDsl.g:2495:1: rule__CompositeNode__Group_3__1__Impl : ( ( rule__CompositeNode__CardinalityAssignment_3_1 ) ) ;
    public final void rule__CompositeNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2499:1: ( ( ( rule__CompositeNode__CardinalityAssignment_3_1 ) ) )
            // InternalDataDsl.g:2500:1: ( ( rule__CompositeNode__CardinalityAssignment_3_1 ) )
            {
            // InternalDataDsl.g:2500:1: ( ( rule__CompositeNode__CardinalityAssignment_3_1 ) )
            // InternalDataDsl.g:2501:2: ( rule__CompositeNode__CardinalityAssignment_3_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getCardinalityAssignment_3_1()); 
            // InternalDataDsl.g:2502:2: ( rule__CompositeNode__CardinalityAssignment_3_1 )
            // InternalDataDsl.g:2502:3: rule__CompositeNode__CardinalityAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__CardinalityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getCardinalityAssignment_3_1()); 

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
    // $ANTLR end "rule__CompositeNode__Group_3__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group_3__2"
    // InternalDataDsl.g:2510:1: rule__CompositeNode__Group_3__2 : rule__CompositeNode__Group_3__2__Impl ;
    public final void rule__CompositeNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2514:1: ( rule__CompositeNode__Group_3__2__Impl )
            // InternalDataDsl.g:2515:2: rule__CompositeNode__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_3__2__Impl();

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
    // $ANTLR end "rule__CompositeNode__Group_3__2"


    // $ANTLR start "rule__CompositeNode__Group_3__2__Impl"
    // InternalDataDsl.g:2521:1: rule__CompositeNode__Group_3__2__Impl : ( ']' ) ;
    public final void rule__CompositeNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2525:1: ( ( ']' ) )
            // InternalDataDsl.g:2526:1: ( ']' )
            {
            // InternalDataDsl.g:2526:1: ( ']' )
            // InternalDataDsl.g:2527:2: ']'
            {
             before(grammarAccess.getCompositeNodeAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getRightSquareBracketKeyword_3_2()); 

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
    // $ANTLR end "rule__CompositeNode__Group_3__2__Impl"


    // $ANTLR start "rule__CompositeNode__Group_4__0"
    // InternalDataDsl.g:2537:1: rule__CompositeNode__Group_4__0 : rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1 ;
    public final void rule__CompositeNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2541:1: ( rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1 )
            // InternalDataDsl.g:2542:2: rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__CompositeNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4__1();

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
    // $ANTLR end "rule__CompositeNode__Group_4__0"


    // $ANTLR start "rule__CompositeNode__Group_4__0__Impl"
    // InternalDataDsl.g:2549:1: rule__CompositeNode__Group_4__0__Impl : ( '(' ) ;
    public final void rule__CompositeNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2553:1: ( ( '(' ) )
            // InternalDataDsl.g:2554:1: ( '(' )
            {
            // InternalDataDsl.g:2554:1: ( '(' )
            // InternalDataDsl.g:2555:2: '('
            {
             before(grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_4_0()); 

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
    // $ANTLR end "rule__CompositeNode__Group_4__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_4__1"
    // InternalDataDsl.g:2564:1: rule__CompositeNode__Group_4__1 : rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2 ;
    public final void rule__CompositeNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2568:1: ( rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2 )
            // InternalDataDsl.g:2569:2: rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2
            {
            pushFollow(FOLLOW_22);
            rule__CompositeNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4__2();

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
    // $ANTLR end "rule__CompositeNode__Group_4__1"


    // $ANTLR start "rule__CompositeNode__Group_4__1__Impl"
    // InternalDataDsl.g:2576:1: rule__CompositeNode__Group_4__1__Impl : ( ( rule__CompositeNode__OptionsAssignment_4_1 ) ) ;
    public final void rule__CompositeNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2580:1: ( ( ( rule__CompositeNode__OptionsAssignment_4_1 ) ) )
            // InternalDataDsl.g:2581:1: ( ( rule__CompositeNode__OptionsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:2581:1: ( ( rule__CompositeNode__OptionsAssignment_4_1 ) )
            // InternalDataDsl.g:2582:2: ( rule__CompositeNode__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_4_1()); 
            // InternalDataDsl.g:2583:2: ( rule__CompositeNode__OptionsAssignment_4_1 )
            // InternalDataDsl.g:2583:3: rule__CompositeNode__OptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__OptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_4_1()); 

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
    // $ANTLR end "rule__CompositeNode__Group_4__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group_4__2"
    // InternalDataDsl.g:2591:1: rule__CompositeNode__Group_4__2 : rule__CompositeNode__Group_4__2__Impl rule__CompositeNode__Group_4__3 ;
    public final void rule__CompositeNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2595:1: ( rule__CompositeNode__Group_4__2__Impl rule__CompositeNode__Group_4__3 )
            // InternalDataDsl.g:2596:2: rule__CompositeNode__Group_4__2__Impl rule__CompositeNode__Group_4__3
            {
            pushFollow(FOLLOW_22);
            rule__CompositeNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4__3();

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
    // $ANTLR end "rule__CompositeNode__Group_4__2"


    // $ANTLR start "rule__CompositeNode__Group_4__2__Impl"
    // InternalDataDsl.g:2603:1: rule__CompositeNode__Group_4__2__Impl : ( ( rule__CompositeNode__Group_4_2__0 )* ) ;
    public final void rule__CompositeNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2607:1: ( ( ( rule__CompositeNode__Group_4_2__0 )* ) )
            // InternalDataDsl.g:2608:1: ( ( rule__CompositeNode__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:2608:1: ( ( rule__CompositeNode__Group_4_2__0 )* )
            // InternalDataDsl.g:2609:2: ( rule__CompositeNode__Group_4_2__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_4_2()); 
            // InternalDataDsl.g:2610:2: ( rule__CompositeNode__Group_4_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==69) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDataDsl.g:2610:3: rule__CompositeNode__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__CompositeNode__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCompositeNodeAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__CompositeNode__Group_4__2__Impl"


    // $ANTLR start "rule__CompositeNode__Group_4__3"
    // InternalDataDsl.g:2618:1: rule__CompositeNode__Group_4__3 : rule__CompositeNode__Group_4__3__Impl ;
    public final void rule__CompositeNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2622:1: ( rule__CompositeNode__Group_4__3__Impl )
            // InternalDataDsl.g:2623:2: rule__CompositeNode__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4__3__Impl();

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
    // $ANTLR end "rule__CompositeNode__Group_4__3"


    // $ANTLR start "rule__CompositeNode__Group_4__3__Impl"
    // InternalDataDsl.g:2629:1: rule__CompositeNode__Group_4__3__Impl : ( ')' ) ;
    public final void rule__CompositeNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2633:1: ( ( ')' ) )
            // InternalDataDsl.g:2634:1: ( ')' )
            {
            // InternalDataDsl.g:2634:1: ( ')' )
            // InternalDataDsl.g:2635:2: ')'
            {
             before(grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_4_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_4_3()); 

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
    // $ANTLR end "rule__CompositeNode__Group_4__3__Impl"


    // $ANTLR start "rule__CompositeNode__Group_4_2__0"
    // InternalDataDsl.g:2645:1: rule__CompositeNode__Group_4_2__0 : rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1 ;
    public final void rule__CompositeNode__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2649:1: ( rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1 )
            // InternalDataDsl.g:2650:2: rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1
            {
            pushFollow(FOLLOW_21);
            rule__CompositeNode__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4_2__1();

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
    // $ANTLR end "rule__CompositeNode__Group_4_2__0"


    // $ANTLR start "rule__CompositeNode__Group_4_2__0__Impl"
    // InternalDataDsl.g:2657:1: rule__CompositeNode__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2661:1: ( ( ',' ) )
            // InternalDataDsl.g:2662:1: ( ',' )
            {
            // InternalDataDsl.g:2662:1: ( ',' )
            // InternalDataDsl.g:2663:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_4_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__CompositeNode__Group_4_2__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_4_2__1"
    // InternalDataDsl.g:2672:1: rule__CompositeNode__Group_4_2__1 : rule__CompositeNode__Group_4_2__1__Impl ;
    public final void rule__CompositeNode__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2676:1: ( rule__CompositeNode__Group_4_2__1__Impl )
            // InternalDataDsl.g:2677:2: rule__CompositeNode__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__CompositeNode__Group_4_2__1"


    // $ANTLR start "rule__CompositeNode__Group_4_2__1__Impl"
    // InternalDataDsl.g:2683:1: rule__CompositeNode__Group_4_2__1__Impl : ( ( rule__CompositeNode__OptionsAssignment_4_2_1 ) ) ;
    public final void rule__CompositeNode__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2687:1: ( ( ( rule__CompositeNode__OptionsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:2688:1: ( ( rule__CompositeNode__OptionsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:2688:1: ( ( rule__CompositeNode__OptionsAssignment_4_2_1 ) )
            // InternalDataDsl.g:2689:2: ( rule__CompositeNode__OptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_4_2_1()); 
            // InternalDataDsl.g:2690:2: ( rule__CompositeNode__OptionsAssignment_4_2_1 )
            // InternalDataDsl.g:2690:3: rule__CompositeNode__OptionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__OptionsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__CompositeNode__Group_4_2__1__Impl"


    // $ANTLR start "rule__FragmentNode__Group__0"
    // InternalDataDsl.g:2699:1: rule__FragmentNode__Group__0 : rule__FragmentNode__Group__0__Impl rule__FragmentNode__Group__1 ;
    public final void rule__FragmentNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2703:1: ( rule__FragmentNode__Group__0__Impl rule__FragmentNode__Group__1 )
            // InternalDataDsl.g:2704:2: rule__FragmentNode__Group__0__Impl rule__FragmentNode__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__FragmentNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group__1();

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
    // $ANTLR end "rule__FragmentNode__Group__0"


    // $ANTLR start "rule__FragmentNode__Group__0__Impl"
    // InternalDataDsl.g:2711:1: rule__FragmentNode__Group__0__Impl : ( '.' ) ;
    public final void rule__FragmentNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2715:1: ( ( '.' ) )
            // InternalDataDsl.g:2716:1: ( '.' )
            {
            // InternalDataDsl.g:2716:1: ( '.' )
            // InternalDataDsl.g:2717:2: '.'
            {
             before(grammarAccess.getFragmentNodeAccess().getFullStopKeyword_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getFragmentNodeAccess().getFullStopKeyword_0()); 

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
    // $ANTLR end "rule__FragmentNode__Group__0__Impl"


    // $ANTLR start "rule__FragmentNode__Group__1"
    // InternalDataDsl.g:2726:1: rule__FragmentNode__Group__1 : rule__FragmentNode__Group__1__Impl rule__FragmentNode__Group__2 ;
    public final void rule__FragmentNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2730:1: ( rule__FragmentNode__Group__1__Impl rule__FragmentNode__Group__2 )
            // InternalDataDsl.g:2731:2: rule__FragmentNode__Group__1__Impl rule__FragmentNode__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__FragmentNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group__2();

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
    // $ANTLR end "rule__FragmentNode__Group__1"


    // $ANTLR start "rule__FragmentNode__Group__1__Impl"
    // InternalDataDsl.g:2738:1: rule__FragmentNode__Group__1__Impl : ( ( rule__FragmentNode__TypeAssignment_1 ) ) ;
    public final void rule__FragmentNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2742:1: ( ( ( rule__FragmentNode__TypeAssignment_1 ) ) )
            // InternalDataDsl.g:2743:1: ( ( rule__FragmentNode__TypeAssignment_1 ) )
            {
            // InternalDataDsl.g:2743:1: ( ( rule__FragmentNode__TypeAssignment_1 ) )
            // InternalDataDsl.g:2744:2: ( rule__FragmentNode__TypeAssignment_1 )
            {
             before(grammarAccess.getFragmentNodeAccess().getTypeAssignment_1()); 
            // InternalDataDsl.g:2745:2: ( rule__FragmentNode__TypeAssignment_1 )
            // InternalDataDsl.g:2745:3: rule__FragmentNode__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentNodeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__FragmentNode__Group__1__Impl"


    // $ANTLR start "rule__FragmentNode__Group__2"
    // InternalDataDsl.g:2753:1: rule__FragmentNode__Group__2 : rule__FragmentNode__Group__2__Impl rule__FragmentNode__Group__3 ;
    public final void rule__FragmentNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2757:1: ( rule__FragmentNode__Group__2__Impl rule__FragmentNode__Group__3 )
            // InternalDataDsl.g:2758:2: rule__FragmentNode__Group__2__Impl rule__FragmentNode__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__FragmentNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group__3();

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
    // $ANTLR end "rule__FragmentNode__Group__2"


    // $ANTLR start "rule__FragmentNode__Group__2__Impl"
    // InternalDataDsl.g:2765:1: rule__FragmentNode__Group__2__Impl : ( ( rule__FragmentNode__NameAssignment_2 ) ) ;
    public final void rule__FragmentNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2769:1: ( ( ( rule__FragmentNode__NameAssignment_2 ) ) )
            // InternalDataDsl.g:2770:1: ( ( rule__FragmentNode__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:2770:1: ( ( rule__FragmentNode__NameAssignment_2 ) )
            // InternalDataDsl.g:2771:2: ( rule__FragmentNode__NameAssignment_2 )
            {
             before(grammarAccess.getFragmentNodeAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:2772:2: ( rule__FragmentNode__NameAssignment_2 )
            // InternalDataDsl.g:2772:3: rule__FragmentNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFragmentNodeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__FragmentNode__Group__2__Impl"


    // $ANTLR start "rule__FragmentNode__Group__3"
    // InternalDataDsl.g:2780:1: rule__FragmentNode__Group__3 : rule__FragmentNode__Group__3__Impl rule__FragmentNode__Group__4 ;
    public final void rule__FragmentNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2784:1: ( rule__FragmentNode__Group__3__Impl rule__FragmentNode__Group__4 )
            // InternalDataDsl.g:2785:2: rule__FragmentNode__Group__3__Impl rule__FragmentNode__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__FragmentNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group__4();

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
    // $ANTLR end "rule__FragmentNode__Group__3"


    // $ANTLR start "rule__FragmentNode__Group__3__Impl"
    // InternalDataDsl.g:2792:1: rule__FragmentNode__Group__3__Impl : ( ( rule__FragmentNode__Group_3__0 )? ) ;
    public final void rule__FragmentNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2796:1: ( ( ( rule__FragmentNode__Group_3__0 )? ) )
            // InternalDataDsl.g:2797:1: ( ( rule__FragmentNode__Group_3__0 )? )
            {
            // InternalDataDsl.g:2797:1: ( ( rule__FragmentNode__Group_3__0 )? )
            // InternalDataDsl.g:2798:2: ( rule__FragmentNode__Group_3__0 )?
            {
             before(grammarAccess.getFragmentNodeAccess().getGroup_3()); 
            // InternalDataDsl.g:2799:2: ( rule__FragmentNode__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==68) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataDsl.g:2799:3: rule__FragmentNode__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FragmentNode__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentNodeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__FragmentNode__Group__3__Impl"


    // $ANTLR start "rule__FragmentNode__Group__4"
    // InternalDataDsl.g:2807:1: rule__FragmentNode__Group__4 : rule__FragmentNode__Group__4__Impl ;
    public final void rule__FragmentNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2811:1: ( rule__FragmentNode__Group__4__Impl )
            // InternalDataDsl.g:2812:2: rule__FragmentNode__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group__4__Impl();

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
    // $ANTLR end "rule__FragmentNode__Group__4"


    // $ANTLR start "rule__FragmentNode__Group__4__Impl"
    // InternalDataDsl.g:2818:1: rule__FragmentNode__Group__4__Impl : ( ( rule__FragmentNode__Group_4__0 )? ) ;
    public final void rule__FragmentNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2822:1: ( ( ( rule__FragmentNode__Group_4__0 )? ) )
            // InternalDataDsl.g:2823:1: ( ( rule__FragmentNode__Group_4__0 )? )
            {
            // InternalDataDsl.g:2823:1: ( ( rule__FragmentNode__Group_4__0 )? )
            // InternalDataDsl.g:2824:2: ( rule__FragmentNode__Group_4__0 )?
            {
             before(grammarAccess.getFragmentNodeAccess().getGroup_4()); 
            // InternalDataDsl.g:2825:2: ( rule__FragmentNode__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==71) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataDsl.g:2825:3: rule__FragmentNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FragmentNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentNodeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__FragmentNode__Group__4__Impl"


    // $ANTLR start "rule__FragmentNode__Group_3__0"
    // InternalDataDsl.g:2834:1: rule__FragmentNode__Group_3__0 : rule__FragmentNode__Group_3__0__Impl rule__FragmentNode__Group_3__1 ;
    public final void rule__FragmentNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2838:1: ( rule__FragmentNode__Group_3__0__Impl rule__FragmentNode__Group_3__1 )
            // InternalDataDsl.g:2839:2: rule__FragmentNode__Group_3__0__Impl rule__FragmentNode__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__FragmentNode__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group_3__1();

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
    // $ANTLR end "rule__FragmentNode__Group_3__0"


    // $ANTLR start "rule__FragmentNode__Group_3__0__Impl"
    // InternalDataDsl.g:2846:1: rule__FragmentNode__Group_3__0__Impl : ( '[' ) ;
    public final void rule__FragmentNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2850:1: ( ( '[' ) )
            // InternalDataDsl.g:2851:1: ( '[' )
            {
            // InternalDataDsl.g:2851:1: ( '[' )
            // InternalDataDsl.g:2852:2: '['
            {
             before(grammarAccess.getFragmentNodeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFragmentNodeAccess().getLeftSquareBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__FragmentNode__Group_3__0__Impl"


    // $ANTLR start "rule__FragmentNode__Group_3__1"
    // InternalDataDsl.g:2861:1: rule__FragmentNode__Group_3__1 : rule__FragmentNode__Group_3__1__Impl rule__FragmentNode__Group_3__2 ;
    public final void rule__FragmentNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2865:1: ( rule__FragmentNode__Group_3__1__Impl rule__FragmentNode__Group_3__2 )
            // InternalDataDsl.g:2866:2: rule__FragmentNode__Group_3__1__Impl rule__FragmentNode__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__FragmentNode__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group_3__2();

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
    // $ANTLR end "rule__FragmentNode__Group_3__1"


    // $ANTLR start "rule__FragmentNode__Group_3__1__Impl"
    // InternalDataDsl.g:2873:1: rule__FragmentNode__Group_3__1__Impl : ( ( rule__FragmentNode__CardinalityAssignment_3_1 ) ) ;
    public final void rule__FragmentNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2877:1: ( ( ( rule__FragmentNode__CardinalityAssignment_3_1 ) ) )
            // InternalDataDsl.g:2878:1: ( ( rule__FragmentNode__CardinalityAssignment_3_1 ) )
            {
            // InternalDataDsl.g:2878:1: ( ( rule__FragmentNode__CardinalityAssignment_3_1 ) )
            // InternalDataDsl.g:2879:2: ( rule__FragmentNode__CardinalityAssignment_3_1 )
            {
             before(grammarAccess.getFragmentNodeAccess().getCardinalityAssignment_3_1()); 
            // InternalDataDsl.g:2880:2: ( rule__FragmentNode__CardinalityAssignment_3_1 )
            // InternalDataDsl.g:2880:3: rule__FragmentNode__CardinalityAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__CardinalityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentNodeAccess().getCardinalityAssignment_3_1()); 

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
    // $ANTLR end "rule__FragmentNode__Group_3__1__Impl"


    // $ANTLR start "rule__FragmentNode__Group_3__2"
    // InternalDataDsl.g:2888:1: rule__FragmentNode__Group_3__2 : rule__FragmentNode__Group_3__2__Impl ;
    public final void rule__FragmentNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2892:1: ( rule__FragmentNode__Group_3__2__Impl )
            // InternalDataDsl.g:2893:2: rule__FragmentNode__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group_3__2__Impl();

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
    // $ANTLR end "rule__FragmentNode__Group_3__2"


    // $ANTLR start "rule__FragmentNode__Group_3__2__Impl"
    // InternalDataDsl.g:2899:1: rule__FragmentNode__Group_3__2__Impl : ( ']' ) ;
    public final void rule__FragmentNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2903:1: ( ( ']' ) )
            // InternalDataDsl.g:2904:1: ( ']' )
            {
            // InternalDataDsl.g:2904:1: ( ']' )
            // InternalDataDsl.g:2905:2: ']'
            {
             before(grammarAccess.getFragmentNodeAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getFragmentNodeAccess().getRightSquareBracketKeyword_3_2()); 

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
    // $ANTLR end "rule__FragmentNode__Group_3__2__Impl"


    // $ANTLR start "rule__FragmentNode__Group_4__0"
    // InternalDataDsl.g:2915:1: rule__FragmentNode__Group_4__0 : rule__FragmentNode__Group_4__0__Impl rule__FragmentNode__Group_4__1 ;
    public final void rule__FragmentNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2919:1: ( rule__FragmentNode__Group_4__0__Impl rule__FragmentNode__Group_4__1 )
            // InternalDataDsl.g:2920:2: rule__FragmentNode__Group_4__0__Impl rule__FragmentNode__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__FragmentNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group_4__1();

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
    // $ANTLR end "rule__FragmentNode__Group_4__0"


    // $ANTLR start "rule__FragmentNode__Group_4__0__Impl"
    // InternalDataDsl.g:2927:1: rule__FragmentNode__Group_4__0__Impl : ( '(' ) ;
    public final void rule__FragmentNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2931:1: ( ( '(' ) )
            // InternalDataDsl.g:2932:1: ( '(' )
            {
            // InternalDataDsl.g:2932:1: ( '(' )
            // InternalDataDsl.g:2933:2: '('
            {
             before(grammarAccess.getFragmentNodeAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getFragmentNodeAccess().getLeftParenthesisKeyword_4_0()); 

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
    // $ANTLR end "rule__FragmentNode__Group_4__0__Impl"


    // $ANTLR start "rule__FragmentNode__Group_4__1"
    // InternalDataDsl.g:2942:1: rule__FragmentNode__Group_4__1 : rule__FragmentNode__Group_4__1__Impl rule__FragmentNode__Group_4__2 ;
    public final void rule__FragmentNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2946:1: ( rule__FragmentNode__Group_4__1__Impl rule__FragmentNode__Group_4__2 )
            // InternalDataDsl.g:2947:2: rule__FragmentNode__Group_4__1__Impl rule__FragmentNode__Group_4__2
            {
            pushFollow(FOLLOW_22);
            rule__FragmentNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group_4__2();

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
    // $ANTLR end "rule__FragmentNode__Group_4__1"


    // $ANTLR start "rule__FragmentNode__Group_4__1__Impl"
    // InternalDataDsl.g:2954:1: rule__FragmentNode__Group_4__1__Impl : ( ( rule__FragmentNode__OptionsAssignment_4_1 ) ) ;
    public final void rule__FragmentNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2958:1: ( ( ( rule__FragmentNode__OptionsAssignment_4_1 ) ) )
            // InternalDataDsl.g:2959:1: ( ( rule__FragmentNode__OptionsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:2959:1: ( ( rule__FragmentNode__OptionsAssignment_4_1 ) )
            // InternalDataDsl.g:2960:2: ( rule__FragmentNode__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getFragmentNodeAccess().getOptionsAssignment_4_1()); 
            // InternalDataDsl.g:2961:2: ( rule__FragmentNode__OptionsAssignment_4_1 )
            // InternalDataDsl.g:2961:3: rule__FragmentNode__OptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__OptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentNodeAccess().getOptionsAssignment_4_1()); 

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
    // $ANTLR end "rule__FragmentNode__Group_4__1__Impl"


    // $ANTLR start "rule__FragmentNode__Group_4__2"
    // InternalDataDsl.g:2969:1: rule__FragmentNode__Group_4__2 : rule__FragmentNode__Group_4__2__Impl rule__FragmentNode__Group_4__3 ;
    public final void rule__FragmentNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2973:1: ( rule__FragmentNode__Group_4__2__Impl rule__FragmentNode__Group_4__3 )
            // InternalDataDsl.g:2974:2: rule__FragmentNode__Group_4__2__Impl rule__FragmentNode__Group_4__3
            {
            pushFollow(FOLLOW_22);
            rule__FragmentNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group_4__3();

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
    // $ANTLR end "rule__FragmentNode__Group_4__2"


    // $ANTLR start "rule__FragmentNode__Group_4__2__Impl"
    // InternalDataDsl.g:2981:1: rule__FragmentNode__Group_4__2__Impl : ( ( rule__FragmentNode__Group_4_2__0 )* ) ;
    public final void rule__FragmentNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2985:1: ( ( ( rule__FragmentNode__Group_4_2__0 )* ) )
            // InternalDataDsl.g:2986:1: ( ( rule__FragmentNode__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:2986:1: ( ( rule__FragmentNode__Group_4_2__0 )* )
            // InternalDataDsl.g:2987:2: ( rule__FragmentNode__Group_4_2__0 )*
            {
             before(grammarAccess.getFragmentNodeAccess().getGroup_4_2()); 
            // InternalDataDsl.g:2988:2: ( rule__FragmentNode__Group_4_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==69) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDataDsl.g:2988:3: rule__FragmentNode__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__FragmentNode__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getFragmentNodeAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__FragmentNode__Group_4__2__Impl"


    // $ANTLR start "rule__FragmentNode__Group_4__3"
    // InternalDataDsl.g:2996:1: rule__FragmentNode__Group_4__3 : rule__FragmentNode__Group_4__3__Impl ;
    public final void rule__FragmentNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3000:1: ( rule__FragmentNode__Group_4__3__Impl )
            // InternalDataDsl.g:3001:2: rule__FragmentNode__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group_4__3__Impl();

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
    // $ANTLR end "rule__FragmentNode__Group_4__3"


    // $ANTLR start "rule__FragmentNode__Group_4__3__Impl"
    // InternalDataDsl.g:3007:1: rule__FragmentNode__Group_4__3__Impl : ( ')' ) ;
    public final void rule__FragmentNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3011:1: ( ( ')' ) )
            // InternalDataDsl.g:3012:1: ( ')' )
            {
            // InternalDataDsl.g:3012:1: ( ')' )
            // InternalDataDsl.g:3013:2: ')'
            {
             before(grammarAccess.getFragmentNodeAccess().getRightParenthesisKeyword_4_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getFragmentNodeAccess().getRightParenthesisKeyword_4_3()); 

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
    // $ANTLR end "rule__FragmentNode__Group_4__3__Impl"


    // $ANTLR start "rule__FragmentNode__Group_4_2__0"
    // InternalDataDsl.g:3023:1: rule__FragmentNode__Group_4_2__0 : rule__FragmentNode__Group_4_2__0__Impl rule__FragmentNode__Group_4_2__1 ;
    public final void rule__FragmentNode__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3027:1: ( rule__FragmentNode__Group_4_2__0__Impl rule__FragmentNode__Group_4_2__1 )
            // InternalDataDsl.g:3028:2: rule__FragmentNode__Group_4_2__0__Impl rule__FragmentNode__Group_4_2__1
            {
            pushFollow(FOLLOW_21);
            rule__FragmentNode__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group_4_2__1();

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
    // $ANTLR end "rule__FragmentNode__Group_4_2__0"


    // $ANTLR start "rule__FragmentNode__Group_4_2__0__Impl"
    // InternalDataDsl.g:3035:1: rule__FragmentNode__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__FragmentNode__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3039:1: ( ( ',' ) )
            // InternalDataDsl.g:3040:1: ( ',' )
            {
            // InternalDataDsl.g:3040:1: ( ',' )
            // InternalDataDsl.g:3041:2: ','
            {
             before(grammarAccess.getFragmentNodeAccess().getCommaKeyword_4_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFragmentNodeAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__FragmentNode__Group_4_2__0__Impl"


    // $ANTLR start "rule__FragmentNode__Group_4_2__1"
    // InternalDataDsl.g:3050:1: rule__FragmentNode__Group_4_2__1 : rule__FragmentNode__Group_4_2__1__Impl ;
    public final void rule__FragmentNode__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3054:1: ( rule__FragmentNode__Group_4_2__1__Impl )
            // InternalDataDsl.g:3055:2: rule__FragmentNode__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__FragmentNode__Group_4_2__1"


    // $ANTLR start "rule__FragmentNode__Group_4_2__1__Impl"
    // InternalDataDsl.g:3061:1: rule__FragmentNode__Group_4_2__1__Impl : ( ( rule__FragmentNode__OptionsAssignment_4_2_1 ) ) ;
    public final void rule__FragmentNode__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3065:1: ( ( ( rule__FragmentNode__OptionsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:3066:1: ( ( rule__FragmentNode__OptionsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:3066:1: ( ( rule__FragmentNode__OptionsAssignment_4_2_1 ) )
            // InternalDataDsl.g:3067:2: ( rule__FragmentNode__OptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getFragmentNodeAccess().getOptionsAssignment_4_2_1()); 
            // InternalDataDsl.g:3068:2: ( rule__FragmentNode__OptionsAssignment_4_2_1 )
            // InternalDataDsl.g:3068:3: rule__FragmentNode__OptionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FragmentNode__OptionsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentNodeAccess().getOptionsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__FragmentNode__Group_4_2__1__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group__0"
    // InternalDataDsl.g:3077:1: rule__PrimitiveNode__Group__0 : rule__PrimitiveNode__Group__0__Impl rule__PrimitiveNode__Group__1 ;
    public final void rule__PrimitiveNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3081:1: ( rule__PrimitiveNode__Group__0__Impl rule__PrimitiveNode__Group__1 )
            // InternalDataDsl.g:3082:2: rule__PrimitiveNode__Group__0__Impl rule__PrimitiveNode__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__PrimitiveNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group__1();

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
    // $ANTLR end "rule__PrimitiveNode__Group__0"


    // $ANTLR start "rule__PrimitiveNode__Group__0__Impl"
    // InternalDataDsl.g:3089:1: rule__PrimitiveNode__Group__0__Impl : ( ( rule__PrimitiveNode__Alternatives_0 )? ) ;
    public final void rule__PrimitiveNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3093:1: ( ( ( rule__PrimitiveNode__Alternatives_0 )? ) )
            // InternalDataDsl.g:3094:1: ( ( rule__PrimitiveNode__Alternatives_0 )? )
            {
            // InternalDataDsl.g:3094:1: ( ( rule__PrimitiveNode__Alternatives_0 )? )
            // InternalDataDsl.g:3095:2: ( rule__PrimitiveNode__Alternatives_0 )?
            {
             before(grammarAccess.getPrimitiveNodeAccess().getAlternatives_0()); 
            // InternalDataDsl.g:3096:2: ( rule__PrimitiveNode__Alternatives_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=79 && LA31_0<=80)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataDsl.g:3096:3: rule__PrimitiveNode__Alternatives_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveNode__Alternatives_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveNodeAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group__1"
    // InternalDataDsl.g:3104:1: rule__PrimitiveNode__Group__1 : rule__PrimitiveNode__Group__1__Impl rule__PrimitiveNode__Group__2 ;
    public final void rule__PrimitiveNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3108:1: ( rule__PrimitiveNode__Group__1__Impl rule__PrimitiveNode__Group__2 )
            // InternalDataDsl.g:3109:2: rule__PrimitiveNode__Group__1__Impl rule__PrimitiveNode__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group__2();

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
    // $ANTLR end "rule__PrimitiveNode__Group__1"


    // $ANTLR start "rule__PrimitiveNode__Group__1__Impl"
    // InternalDataDsl.g:3116:1: rule__PrimitiveNode__Group__1__Impl : ( ( rule__PrimitiveNode__TypeAssignment_1 ) ) ;
    public final void rule__PrimitiveNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3120:1: ( ( ( rule__PrimitiveNode__TypeAssignment_1 ) ) )
            // InternalDataDsl.g:3121:1: ( ( rule__PrimitiveNode__TypeAssignment_1 ) )
            {
            // InternalDataDsl.g:3121:1: ( ( rule__PrimitiveNode__TypeAssignment_1 ) )
            // InternalDataDsl.g:3122:2: ( rule__PrimitiveNode__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getTypeAssignment_1()); 
            // InternalDataDsl.g:3123:2: ( rule__PrimitiveNode__TypeAssignment_1 )
            // InternalDataDsl.g:3123:3: rule__PrimitiveNode__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveNodeAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group__2"
    // InternalDataDsl.g:3131:1: rule__PrimitiveNode__Group__2 : rule__PrimitiveNode__Group__2__Impl rule__PrimitiveNode__Group__3 ;
    public final void rule__PrimitiveNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3135:1: ( rule__PrimitiveNode__Group__2__Impl rule__PrimitiveNode__Group__3 )
            // InternalDataDsl.g:3136:2: rule__PrimitiveNode__Group__2__Impl rule__PrimitiveNode__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__PrimitiveNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group__3();

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
    // $ANTLR end "rule__PrimitiveNode__Group__2"


    // $ANTLR start "rule__PrimitiveNode__Group__2__Impl"
    // InternalDataDsl.g:3143:1: rule__PrimitiveNode__Group__2__Impl : ( ( rule__PrimitiveNode__NameAssignment_2 ) ) ;
    public final void rule__PrimitiveNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3147:1: ( ( ( rule__PrimitiveNode__NameAssignment_2 ) ) )
            // InternalDataDsl.g:3148:1: ( ( rule__PrimitiveNode__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:3148:1: ( ( rule__PrimitiveNode__NameAssignment_2 ) )
            // InternalDataDsl.g:3149:2: ( rule__PrimitiveNode__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:3150:2: ( rule__PrimitiveNode__NameAssignment_2 )
            // InternalDataDsl.g:3150:3: rule__PrimitiveNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveNodeAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group__3"
    // InternalDataDsl.g:3158:1: rule__PrimitiveNode__Group__3 : rule__PrimitiveNode__Group__3__Impl rule__PrimitiveNode__Group__4 ;
    public final void rule__PrimitiveNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3162:1: ( rule__PrimitiveNode__Group__3__Impl rule__PrimitiveNode__Group__4 )
            // InternalDataDsl.g:3163:2: rule__PrimitiveNode__Group__3__Impl rule__PrimitiveNode__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__PrimitiveNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group__4();

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
    // $ANTLR end "rule__PrimitiveNode__Group__3"


    // $ANTLR start "rule__PrimitiveNode__Group__3__Impl"
    // InternalDataDsl.g:3170:1: rule__PrimitiveNode__Group__3__Impl : ( ( rule__PrimitiveNode__Group_3__0 )? ) ;
    public final void rule__PrimitiveNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3174:1: ( ( ( rule__PrimitiveNode__Group_3__0 )? ) )
            // InternalDataDsl.g:3175:1: ( ( rule__PrimitiveNode__Group_3__0 )? )
            {
            // InternalDataDsl.g:3175:1: ( ( rule__PrimitiveNode__Group_3__0 )? )
            // InternalDataDsl.g:3176:2: ( rule__PrimitiveNode__Group_3__0 )?
            {
             before(grammarAccess.getPrimitiveNodeAccess().getGroup_3()); 
            // InternalDataDsl.g:3177:2: ( rule__PrimitiveNode__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==68) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataDsl.g:3177:3: rule__PrimitiveNode__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveNode__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveNodeAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group__3__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group__4"
    // InternalDataDsl.g:3185:1: rule__PrimitiveNode__Group__4 : rule__PrimitiveNode__Group__4__Impl ;
    public final void rule__PrimitiveNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3189:1: ( rule__PrimitiveNode__Group__4__Impl )
            // InternalDataDsl.g:3190:2: rule__PrimitiveNode__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group__4__Impl();

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
    // $ANTLR end "rule__PrimitiveNode__Group__4"


    // $ANTLR start "rule__PrimitiveNode__Group__4__Impl"
    // InternalDataDsl.g:3196:1: rule__PrimitiveNode__Group__4__Impl : ( ( rule__PrimitiveNode__Group_4__0 )? ) ;
    public final void rule__PrimitiveNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3200:1: ( ( ( rule__PrimitiveNode__Group_4__0 )? ) )
            // InternalDataDsl.g:3201:1: ( ( rule__PrimitiveNode__Group_4__0 )? )
            {
            // InternalDataDsl.g:3201:1: ( ( rule__PrimitiveNode__Group_4__0 )? )
            // InternalDataDsl.g:3202:2: ( rule__PrimitiveNode__Group_4__0 )?
            {
             before(grammarAccess.getPrimitiveNodeAccess().getGroup_4()); 
            // InternalDataDsl.g:3203:2: ( rule__PrimitiveNode__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==71) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataDsl.g:3203:3: rule__PrimitiveNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveNodeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group__4__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group_3__0"
    // InternalDataDsl.g:3212:1: rule__PrimitiveNode__Group_3__0 : rule__PrimitiveNode__Group_3__0__Impl rule__PrimitiveNode__Group_3__1 ;
    public final void rule__PrimitiveNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3216:1: ( rule__PrimitiveNode__Group_3__0__Impl rule__PrimitiveNode__Group_3__1 )
            // InternalDataDsl.g:3217:2: rule__PrimitiveNode__Group_3__0__Impl rule__PrimitiveNode__Group_3__1
            {
            pushFollow(FOLLOW_20);
            rule__PrimitiveNode__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group_3__1();

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
    // $ANTLR end "rule__PrimitiveNode__Group_3__0"


    // $ANTLR start "rule__PrimitiveNode__Group_3__0__Impl"
    // InternalDataDsl.g:3224:1: rule__PrimitiveNode__Group_3__0__Impl : ( '[' ) ;
    public final void rule__PrimitiveNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3228:1: ( ( '[' ) )
            // InternalDataDsl.g:3229:1: ( '[' )
            {
            // InternalDataDsl.g:3229:1: ( '[' )
            // InternalDataDsl.g:3230:2: '['
            {
             before(grammarAccess.getPrimitiveNodeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getPrimitiveNodeAccess().getLeftSquareBracketKeyword_3_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group_3__0__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group_3__1"
    // InternalDataDsl.g:3239:1: rule__PrimitiveNode__Group_3__1 : rule__PrimitiveNode__Group_3__1__Impl rule__PrimitiveNode__Group_3__2 ;
    public final void rule__PrimitiveNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3243:1: ( rule__PrimitiveNode__Group_3__1__Impl rule__PrimitiveNode__Group_3__2 )
            // InternalDataDsl.g:3244:2: rule__PrimitiveNode__Group_3__1__Impl rule__PrimitiveNode__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__PrimitiveNode__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group_3__2();

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
    // $ANTLR end "rule__PrimitiveNode__Group_3__1"


    // $ANTLR start "rule__PrimitiveNode__Group_3__1__Impl"
    // InternalDataDsl.g:3251:1: rule__PrimitiveNode__Group_3__1__Impl : ( ( rule__PrimitiveNode__CardinalityAssignment_3_1 ) ) ;
    public final void rule__PrimitiveNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3255:1: ( ( ( rule__PrimitiveNode__CardinalityAssignment_3_1 ) ) )
            // InternalDataDsl.g:3256:1: ( ( rule__PrimitiveNode__CardinalityAssignment_3_1 ) )
            {
            // InternalDataDsl.g:3256:1: ( ( rule__PrimitiveNode__CardinalityAssignment_3_1 ) )
            // InternalDataDsl.g:3257:2: ( rule__PrimitiveNode__CardinalityAssignment_3_1 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getCardinalityAssignment_3_1()); 
            // InternalDataDsl.g:3258:2: ( rule__PrimitiveNode__CardinalityAssignment_3_1 )
            // InternalDataDsl.g:3258:3: rule__PrimitiveNode__CardinalityAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__CardinalityAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveNodeAccess().getCardinalityAssignment_3_1()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group_3__1__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group_3__2"
    // InternalDataDsl.g:3266:1: rule__PrimitiveNode__Group_3__2 : rule__PrimitiveNode__Group_3__2__Impl ;
    public final void rule__PrimitiveNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3270:1: ( rule__PrimitiveNode__Group_3__2__Impl )
            // InternalDataDsl.g:3271:2: rule__PrimitiveNode__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group_3__2__Impl();

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
    // $ANTLR end "rule__PrimitiveNode__Group_3__2"


    // $ANTLR start "rule__PrimitiveNode__Group_3__2__Impl"
    // InternalDataDsl.g:3277:1: rule__PrimitiveNode__Group_3__2__Impl : ( ']' ) ;
    public final void rule__PrimitiveNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3281:1: ( ( ']' ) )
            // InternalDataDsl.g:3282:1: ( ']' )
            {
            // InternalDataDsl.g:3282:1: ( ']' )
            // InternalDataDsl.g:3283:2: ']'
            {
             before(grammarAccess.getPrimitiveNodeAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getPrimitiveNodeAccess().getRightSquareBracketKeyword_3_2()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group_3__2__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group_4__0"
    // InternalDataDsl.g:3293:1: rule__PrimitiveNode__Group_4__0 : rule__PrimitiveNode__Group_4__0__Impl rule__PrimitiveNode__Group_4__1 ;
    public final void rule__PrimitiveNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3297:1: ( rule__PrimitiveNode__Group_4__0__Impl rule__PrimitiveNode__Group_4__1 )
            // InternalDataDsl.g:3298:2: rule__PrimitiveNode__Group_4__0__Impl rule__PrimitiveNode__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__PrimitiveNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group_4__1();

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
    // $ANTLR end "rule__PrimitiveNode__Group_4__0"


    // $ANTLR start "rule__PrimitiveNode__Group_4__0__Impl"
    // InternalDataDsl.g:3305:1: rule__PrimitiveNode__Group_4__0__Impl : ( '(' ) ;
    public final void rule__PrimitiveNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3309:1: ( ( '(' ) )
            // InternalDataDsl.g:3310:1: ( '(' )
            {
            // InternalDataDsl.g:3310:1: ( '(' )
            // InternalDataDsl.g:3311:2: '('
            {
             before(grammarAccess.getPrimitiveNodeAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getPrimitiveNodeAccess().getLeftParenthesisKeyword_4_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group_4__0__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group_4__1"
    // InternalDataDsl.g:3320:1: rule__PrimitiveNode__Group_4__1 : rule__PrimitiveNode__Group_4__1__Impl rule__PrimitiveNode__Group_4__2 ;
    public final void rule__PrimitiveNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3324:1: ( rule__PrimitiveNode__Group_4__1__Impl rule__PrimitiveNode__Group_4__2 )
            // InternalDataDsl.g:3325:2: rule__PrimitiveNode__Group_4__1__Impl rule__PrimitiveNode__Group_4__2
            {
            pushFollow(FOLLOW_22);
            rule__PrimitiveNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group_4__2();

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
    // $ANTLR end "rule__PrimitiveNode__Group_4__1"


    // $ANTLR start "rule__PrimitiveNode__Group_4__1__Impl"
    // InternalDataDsl.g:3332:1: rule__PrimitiveNode__Group_4__1__Impl : ( ( rule__PrimitiveNode__OptionsAssignment_4_1 ) ) ;
    public final void rule__PrimitiveNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3336:1: ( ( ( rule__PrimitiveNode__OptionsAssignment_4_1 ) ) )
            // InternalDataDsl.g:3337:1: ( ( rule__PrimitiveNode__OptionsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:3337:1: ( ( rule__PrimitiveNode__OptionsAssignment_4_1 ) )
            // InternalDataDsl.g:3338:2: ( rule__PrimitiveNode__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getOptionsAssignment_4_1()); 
            // InternalDataDsl.g:3339:2: ( rule__PrimitiveNode__OptionsAssignment_4_1 )
            // InternalDataDsl.g:3339:3: rule__PrimitiveNode__OptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__OptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveNodeAccess().getOptionsAssignment_4_1()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group_4__1__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group_4__2"
    // InternalDataDsl.g:3347:1: rule__PrimitiveNode__Group_4__2 : rule__PrimitiveNode__Group_4__2__Impl rule__PrimitiveNode__Group_4__3 ;
    public final void rule__PrimitiveNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3351:1: ( rule__PrimitiveNode__Group_4__2__Impl rule__PrimitiveNode__Group_4__3 )
            // InternalDataDsl.g:3352:2: rule__PrimitiveNode__Group_4__2__Impl rule__PrimitiveNode__Group_4__3
            {
            pushFollow(FOLLOW_22);
            rule__PrimitiveNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group_4__3();

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
    // $ANTLR end "rule__PrimitiveNode__Group_4__2"


    // $ANTLR start "rule__PrimitiveNode__Group_4__2__Impl"
    // InternalDataDsl.g:3359:1: rule__PrimitiveNode__Group_4__2__Impl : ( ( rule__PrimitiveNode__Group_4_2__0 )* ) ;
    public final void rule__PrimitiveNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3363:1: ( ( ( rule__PrimitiveNode__Group_4_2__0 )* ) )
            // InternalDataDsl.g:3364:1: ( ( rule__PrimitiveNode__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:3364:1: ( ( rule__PrimitiveNode__Group_4_2__0 )* )
            // InternalDataDsl.g:3365:2: ( rule__PrimitiveNode__Group_4_2__0 )*
            {
             before(grammarAccess.getPrimitiveNodeAccess().getGroup_4_2()); 
            // InternalDataDsl.g:3366:2: ( rule__PrimitiveNode__Group_4_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==69) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDataDsl.g:3366:3: rule__PrimitiveNode__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__PrimitiveNode__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getPrimitiveNodeAccess().getGroup_4_2()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group_4__2__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group_4__3"
    // InternalDataDsl.g:3374:1: rule__PrimitiveNode__Group_4__3 : rule__PrimitiveNode__Group_4__3__Impl ;
    public final void rule__PrimitiveNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3378:1: ( rule__PrimitiveNode__Group_4__3__Impl )
            // InternalDataDsl.g:3379:2: rule__PrimitiveNode__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group_4__3__Impl();

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
    // $ANTLR end "rule__PrimitiveNode__Group_4__3"


    // $ANTLR start "rule__PrimitiveNode__Group_4__3__Impl"
    // InternalDataDsl.g:3385:1: rule__PrimitiveNode__Group_4__3__Impl : ( ')' ) ;
    public final void rule__PrimitiveNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3389:1: ( ( ')' ) )
            // InternalDataDsl.g:3390:1: ( ')' )
            {
            // InternalDataDsl.g:3390:1: ( ')' )
            // InternalDataDsl.g:3391:2: ')'
            {
             before(grammarAccess.getPrimitiveNodeAccess().getRightParenthesisKeyword_4_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getPrimitiveNodeAccess().getRightParenthesisKeyword_4_3()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group_4__3__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group_4_2__0"
    // InternalDataDsl.g:3401:1: rule__PrimitiveNode__Group_4_2__0 : rule__PrimitiveNode__Group_4_2__0__Impl rule__PrimitiveNode__Group_4_2__1 ;
    public final void rule__PrimitiveNode__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3405:1: ( rule__PrimitiveNode__Group_4_2__0__Impl rule__PrimitiveNode__Group_4_2__1 )
            // InternalDataDsl.g:3406:2: rule__PrimitiveNode__Group_4_2__0__Impl rule__PrimitiveNode__Group_4_2__1
            {
            pushFollow(FOLLOW_21);
            rule__PrimitiveNode__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group_4_2__1();

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
    // $ANTLR end "rule__PrimitiveNode__Group_4_2__0"


    // $ANTLR start "rule__PrimitiveNode__Group_4_2__0__Impl"
    // InternalDataDsl.g:3413:1: rule__PrimitiveNode__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__PrimitiveNode__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3417:1: ( ( ',' ) )
            // InternalDataDsl.g:3418:1: ( ',' )
            {
            // InternalDataDsl.g:3418:1: ( ',' )
            // InternalDataDsl.g:3419:2: ','
            {
             before(grammarAccess.getPrimitiveNodeAccess().getCommaKeyword_4_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getPrimitiveNodeAccess().getCommaKeyword_4_2_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group_4_2__0__Impl"


    // $ANTLR start "rule__PrimitiveNode__Group_4_2__1"
    // InternalDataDsl.g:3428:1: rule__PrimitiveNode__Group_4_2__1 : rule__PrimitiveNode__Group_4_2__1__Impl ;
    public final void rule__PrimitiveNode__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3432:1: ( rule__PrimitiveNode__Group_4_2__1__Impl )
            // InternalDataDsl.g:3433:2: rule__PrimitiveNode__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__Group_4_2__1__Impl();

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
    // $ANTLR end "rule__PrimitiveNode__Group_4_2__1"


    // $ANTLR start "rule__PrimitiveNode__Group_4_2__1__Impl"
    // InternalDataDsl.g:3439:1: rule__PrimitiveNode__Group_4_2__1__Impl : ( ( rule__PrimitiveNode__OptionsAssignment_4_2_1 ) ) ;
    public final void rule__PrimitiveNode__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3443:1: ( ( ( rule__PrimitiveNode__OptionsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:3444:1: ( ( rule__PrimitiveNode__OptionsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:3444:1: ( ( rule__PrimitiveNode__OptionsAssignment_4_2_1 ) )
            // InternalDataDsl.g:3445:2: ( rule__PrimitiveNode__OptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getOptionsAssignment_4_2_1()); 
            // InternalDataDsl.g:3446:2: ( rule__PrimitiveNode__OptionsAssignment_4_2_1 )
            // InternalDataDsl.g:3446:3: rule__PrimitiveNode__OptionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveNode__OptionsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveNodeAccess().getOptionsAssignment_4_2_1()); 

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
    // $ANTLR end "rule__PrimitiveNode__Group_4_2__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalDataDsl.g:3455:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3459:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalDataDsl.g:3460:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__1();

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
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // InternalDataDsl.g:3467:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__MinAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3471:1: ( ( ( rule__Cardinality__MinAssignment_0 ) ) )
            // InternalDataDsl.g:3472:1: ( ( rule__Cardinality__MinAssignment_0 ) )
            {
            // InternalDataDsl.g:3472:1: ( ( rule__Cardinality__MinAssignment_0 ) )
            // InternalDataDsl.g:3473:2: ( rule__Cardinality__MinAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getMinAssignment_0()); 
            // InternalDataDsl.g:3474:2: ( rule__Cardinality__MinAssignment_0 )
            // InternalDataDsl.g:3474:3: rule__Cardinality__MinAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__MinAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getMinAssignment_0()); 

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
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // InternalDataDsl.g:3482:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3486:1: ( rule__Cardinality__Group__1__Impl )
            // InternalDataDsl.g:3487:2: rule__Cardinality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group__1__Impl();

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
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // InternalDataDsl.g:3493:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3497:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalDataDsl.g:3498:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalDataDsl.g:3498:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalDataDsl.g:3499:2: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalDataDsl.g:3500:2: ( rule__Cardinality__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==69) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataDsl.g:3500:3: rule__Cardinality__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cardinality__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCardinalityAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group_1__0"
    // InternalDataDsl.g:3509:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3513:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalDataDsl.g:3514:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Cardinality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cardinality__Group_1__1();

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
    // $ANTLR end "rule__Cardinality__Group_1__0"


    // $ANTLR start "rule__Cardinality__Group_1__0__Impl"
    // InternalDataDsl.g:3521:1: rule__Cardinality__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3525:1: ( ( ',' ) )
            // InternalDataDsl.g:3526:1: ( ',' )
            {
            // InternalDataDsl.g:3526:1: ( ',' )
            // InternalDataDsl.g:3527:2: ','
            {
             before(grammarAccess.getCardinalityAccess().getCommaKeyword_1_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__Cardinality__Group_1__0__Impl"


    // $ANTLR start "rule__Cardinality__Group_1__1"
    // InternalDataDsl.g:3536:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3540:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalDataDsl.g:3541:2: rule__Cardinality__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Group_1__1__Impl();

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
    // $ANTLR end "rule__Cardinality__Group_1__1"


    // $ANTLR start "rule__Cardinality__Group_1__1__Impl"
    // InternalDataDsl.g:3547:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__MaxAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3551:1: ( ( ( rule__Cardinality__MaxAssignment_1_1 ) ) )
            // InternalDataDsl.g:3552:1: ( ( rule__Cardinality__MaxAssignment_1_1 ) )
            {
            // InternalDataDsl.g:3552:1: ( ( rule__Cardinality__MaxAssignment_1_1 ) )
            // InternalDataDsl.g:3553:2: ( rule__Cardinality__MaxAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getMaxAssignment_1_1()); 
            // InternalDataDsl.g:3554:2: ( rule__Cardinality__MaxAssignment_1_1 )
            // InternalDataDsl.g:3554:3: rule__Cardinality__MaxAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__MaxAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getMaxAssignment_1_1()); 

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
    // $ANTLR end "rule__Cardinality__Group_1__1__Impl"


    // $ANTLR start "rule__DataDescription__Group__0"
    // InternalDataDsl.g:3563:1: rule__DataDescription__Group__0 : rule__DataDescription__Group__0__Impl rule__DataDescription__Group__1 ;
    public final void rule__DataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3567:1: ( rule__DataDescription__Group__0__Impl rule__DataDescription__Group__1 )
            // InternalDataDsl.g:3568:2: rule__DataDescription__Group__0__Impl rule__DataDescription__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__DataDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group__1();

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
    // $ANTLR end "rule__DataDescription__Group__0"


    // $ANTLR start "rule__DataDescription__Group__0__Impl"
    // InternalDataDsl.g:3575:1: rule__DataDescription__Group__0__Impl : ( 'description' ) ;
    public final void rule__DataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3579:1: ( ( 'description' ) )
            // InternalDataDsl.g:3580:1: ( 'description' )
            {
            // InternalDataDsl.g:3580:1: ( 'description' )
            // InternalDataDsl.g:3581:2: 'description'
            {
             before(grammarAccess.getDataDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getDescriptionKeyword_0()); 

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
    // $ANTLR end "rule__DataDescription__Group__0__Impl"


    // $ANTLR start "rule__DataDescription__Group__1"
    // InternalDataDsl.g:3590:1: rule__DataDescription__Group__1 : rule__DataDescription__Group__1__Impl rule__DataDescription__Group__2 ;
    public final void rule__DataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3594:1: ( rule__DataDescription__Group__1__Impl rule__DataDescription__Group__2 )
            // InternalDataDsl.g:3595:2: rule__DataDescription__Group__1__Impl rule__DataDescription__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group__2();

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
    // $ANTLR end "rule__DataDescription__Group__1"


    // $ANTLR start "rule__DataDescription__Group__1__Impl"
    // InternalDataDsl.g:3602:1: rule__DataDescription__Group__1__Impl : ( ( rule__DataDescription__FormatAssignment_1 ) ) ;
    public final void rule__DataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3606:1: ( ( ( rule__DataDescription__FormatAssignment_1 ) ) )
            // InternalDataDsl.g:3607:1: ( ( rule__DataDescription__FormatAssignment_1 ) )
            {
            // InternalDataDsl.g:3607:1: ( ( rule__DataDescription__FormatAssignment_1 ) )
            // InternalDataDsl.g:3608:2: ( rule__DataDescription__FormatAssignment_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getFormatAssignment_1()); 
            // InternalDataDsl.g:3609:2: ( rule__DataDescription__FormatAssignment_1 )
            // InternalDataDsl.g:3609:3: rule__DataDescription__FormatAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__FormatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDescriptionAccess().getFormatAssignment_1()); 

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
    // $ANTLR end "rule__DataDescription__Group__1__Impl"


    // $ANTLR start "rule__DataDescription__Group__2"
    // InternalDataDsl.g:3617:1: rule__DataDescription__Group__2 : rule__DataDescription__Group__2__Impl rule__DataDescription__Group__3 ;
    public final void rule__DataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3621:1: ( rule__DataDescription__Group__2__Impl rule__DataDescription__Group__3 )
            // InternalDataDsl.g:3622:2: rule__DataDescription__Group__2__Impl rule__DataDescription__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__DataDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group__3();

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
    // $ANTLR end "rule__DataDescription__Group__2"


    // $ANTLR start "rule__DataDescription__Group__2__Impl"
    // InternalDataDsl.g:3629:1: rule__DataDescription__Group__2__Impl : ( ( rule__DataDescription__NameAssignment_2 ) ) ;
    public final void rule__DataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3633:1: ( ( ( rule__DataDescription__NameAssignment_2 ) ) )
            // InternalDataDsl.g:3634:1: ( ( rule__DataDescription__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:3634:1: ( ( rule__DataDescription__NameAssignment_2 ) )
            // InternalDataDsl.g:3635:2: ( rule__DataDescription__NameAssignment_2 )
            {
             before(grammarAccess.getDataDescriptionAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:3636:2: ( rule__DataDescription__NameAssignment_2 )
            // InternalDataDsl.g:3636:3: rule__DataDescription__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataDescriptionAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DataDescription__Group__2__Impl"


    // $ANTLR start "rule__DataDescription__Group__3"
    // InternalDataDsl.g:3644:1: rule__DataDescription__Group__3 : rule__DataDescription__Group__3__Impl rule__DataDescription__Group__4 ;
    public final void rule__DataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3648:1: ( rule__DataDescription__Group__3__Impl rule__DataDescription__Group__4 )
            // InternalDataDsl.g:3649:2: rule__DataDescription__Group__3__Impl rule__DataDescription__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__DataDescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group__4();

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
    // $ANTLR end "rule__DataDescription__Group__3"


    // $ANTLR start "rule__DataDescription__Group__3__Impl"
    // InternalDataDsl.g:3656:1: rule__DataDescription__Group__3__Impl : ( ( rule__DataDescription__Group_3__0 )? ) ;
    public final void rule__DataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3660:1: ( ( ( rule__DataDescription__Group_3__0 )? ) )
            // InternalDataDsl.g:3661:1: ( ( rule__DataDescription__Group_3__0 )? )
            {
            // InternalDataDsl.g:3661:1: ( ( rule__DataDescription__Group_3__0 )? )
            // InternalDataDsl.g:3662:2: ( rule__DataDescription__Group_3__0 )?
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_3()); 
            // InternalDataDsl.g:3663:2: ( rule__DataDescription__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==74) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataDsl.g:3663:3: rule__DataDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataDescriptionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__DataDescription__Group__3__Impl"


    // $ANTLR start "rule__DataDescription__Group__4"
    // InternalDataDsl.g:3671:1: rule__DataDescription__Group__4 : rule__DataDescription__Group__4__Impl rule__DataDescription__Group__5 ;
    public final void rule__DataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3675:1: ( rule__DataDescription__Group__4__Impl rule__DataDescription__Group__5 )
            // InternalDataDsl.g:3676:2: rule__DataDescription__Group__4__Impl rule__DataDescription__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__DataDescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group__5();

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
    // $ANTLR end "rule__DataDescription__Group__4"


    // $ANTLR start "rule__DataDescription__Group__4__Impl"
    // InternalDataDsl.g:3683:1: rule__DataDescription__Group__4__Impl : ( '{' ) ;
    public final void rule__DataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3687:1: ( ( '{' ) )
            // InternalDataDsl.g:3688:1: ( '{' )
            {
            // InternalDataDsl.g:3688:1: ( '{' )
            // InternalDataDsl.g:3689:2: '{'
            {
             before(grammarAccess.getDataDescriptionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__DataDescription__Group__4__Impl"


    // $ANTLR start "rule__DataDescription__Group__5"
    // InternalDataDsl.g:3698:1: rule__DataDescription__Group__5 : rule__DataDescription__Group__5__Impl rule__DataDescription__Group__6 ;
    public final void rule__DataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3702:1: ( rule__DataDescription__Group__5__Impl rule__DataDescription__Group__6 )
            // InternalDataDsl.g:3703:2: rule__DataDescription__Group__5__Impl rule__DataDescription__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__DataDescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group__6();

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
    // $ANTLR end "rule__DataDescription__Group__5"


    // $ANTLR start "rule__DataDescription__Group__5__Impl"
    // InternalDataDsl.g:3710:1: rule__DataDescription__Group__5__Impl : ( ( rule__DataDescription__Group_5__0 )? ) ;
    public final void rule__DataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3714:1: ( ( ( rule__DataDescription__Group_5__0 )? ) )
            // InternalDataDsl.g:3715:1: ( ( rule__DataDescription__Group_5__0 )? )
            {
            // InternalDataDsl.g:3715:1: ( ( rule__DataDescription__Group_5__0 )? )
            // InternalDataDsl.g:3716:2: ( rule__DataDescription__Group_5__0 )?
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_5()); 
            // InternalDataDsl.g:3717:2: ( rule__DataDescription__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||(LA37_0>=22 && LA37_0<=42)||LA37_0==63||(LA37_0>=79 && LA37_0<=80)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataDsl.g:3717:3: rule__DataDescription__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataDescription__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataDescriptionAccess().getGroup_5()); 

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
    // $ANTLR end "rule__DataDescription__Group__5__Impl"


    // $ANTLR start "rule__DataDescription__Group__6"
    // InternalDataDsl.g:3725:1: rule__DataDescription__Group__6 : rule__DataDescription__Group__6__Impl rule__DataDescription__Group__7 ;
    public final void rule__DataDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3729:1: ( rule__DataDescription__Group__6__Impl rule__DataDescription__Group__7 )
            // InternalDataDsl.g:3730:2: rule__DataDescription__Group__6__Impl rule__DataDescription__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__DataDescription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group__7();

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
    // $ANTLR end "rule__DataDescription__Group__6"


    // $ANTLR start "rule__DataDescription__Group__6__Impl"
    // InternalDataDsl.g:3737:1: rule__DataDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__DataDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3741:1: ( ( '}' ) )
            // InternalDataDsl.g:3742:1: ( '}' )
            {
            // InternalDataDsl.g:3742:1: ( '}' )
            // InternalDataDsl.g:3743:2: '}'
            {
             before(grammarAccess.getDataDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__DataDescription__Group__6__Impl"


    // $ANTLR start "rule__DataDescription__Group__7"
    // InternalDataDsl.g:3752:1: rule__DataDescription__Group__7 : rule__DataDescription__Group__7__Impl ;
    public final void rule__DataDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3756:1: ( rule__DataDescription__Group__7__Impl )
            // InternalDataDsl.g:3757:2: rule__DataDescription__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__Group__7__Impl();

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
    // $ANTLR end "rule__DataDescription__Group__7"


    // $ANTLR start "rule__DataDescription__Group__7__Impl"
    // InternalDataDsl.g:3763:1: rule__DataDescription__Group__7__Impl : ( ( rule__DataDescription__Group_7__0 )? ) ;
    public final void rule__DataDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3767:1: ( ( ( rule__DataDescription__Group_7__0 )? ) )
            // InternalDataDsl.g:3768:1: ( ( rule__DataDescription__Group_7__0 )? )
            {
            // InternalDataDsl.g:3768:1: ( ( rule__DataDescription__Group_7__0 )? )
            // InternalDataDsl.g:3769:2: ( rule__DataDescription__Group_7__0 )?
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_7()); 
            // InternalDataDsl.g:3770:2: ( rule__DataDescription__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==71) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataDsl.g:3770:3: rule__DataDescription__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataDescription__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataDescriptionAccess().getGroup_7()); 

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
    // $ANTLR end "rule__DataDescription__Group__7__Impl"


    // $ANTLR start "rule__DataDescription__Group_3__0"
    // InternalDataDsl.g:3779:1: rule__DataDescription__Group_3__0 : rule__DataDescription__Group_3__0__Impl rule__DataDescription__Group_3__1 ;
    public final void rule__DataDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3783:1: ( rule__DataDescription__Group_3__0__Impl rule__DataDescription__Group_3__1 )
            // InternalDataDsl.g:3784:2: rule__DataDescription__Group_3__0__Impl rule__DataDescription__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__DataDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_3__1();

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
    // $ANTLR end "rule__DataDescription__Group_3__0"


    // $ANTLR start "rule__DataDescription__Group_3__0__Impl"
    // InternalDataDsl.g:3791:1: rule__DataDescription__Group_3__0__Impl : ( ':' ) ;
    public final void rule__DataDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3795:1: ( ( ':' ) )
            // InternalDataDsl.g:3796:1: ( ':' )
            {
            // InternalDataDsl.g:3796:1: ( ':' )
            // InternalDataDsl.g:3797:2: ':'
            {
             before(grammarAccess.getDataDescriptionAccess().getColonKeyword_3_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getColonKeyword_3_0()); 

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
    // $ANTLR end "rule__DataDescription__Group_3__0__Impl"


    // $ANTLR start "rule__DataDescription__Group_3__1"
    // InternalDataDsl.g:3806:1: rule__DataDescription__Group_3__1 : rule__DataDescription__Group_3__1__Impl rule__DataDescription__Group_3__2 ;
    public final void rule__DataDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3810:1: ( rule__DataDescription__Group_3__1__Impl rule__DataDescription__Group_3__2 )
            // InternalDataDsl.g:3811:2: rule__DataDescription__Group_3__1__Impl rule__DataDescription__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__DataDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_3__2();

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
    // $ANTLR end "rule__DataDescription__Group_3__1"


    // $ANTLR start "rule__DataDescription__Group_3__1__Impl"
    // InternalDataDsl.g:3818:1: rule__DataDescription__Group_3__1__Impl : ( ( rule__DataDescription__FragmentsAssignment_3_1 ) ) ;
    public final void rule__DataDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3822:1: ( ( ( rule__DataDescription__FragmentsAssignment_3_1 ) ) )
            // InternalDataDsl.g:3823:1: ( ( rule__DataDescription__FragmentsAssignment_3_1 ) )
            {
            // InternalDataDsl.g:3823:1: ( ( rule__DataDescription__FragmentsAssignment_3_1 ) )
            // InternalDataDsl.g:3824:2: ( rule__DataDescription__FragmentsAssignment_3_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsAssignment_3_1()); 
            // InternalDataDsl.g:3825:2: ( rule__DataDescription__FragmentsAssignment_3_1 )
            // InternalDataDsl.g:3825:3: rule__DataDescription__FragmentsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__FragmentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDescriptionAccess().getFragmentsAssignment_3_1()); 

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
    // $ANTLR end "rule__DataDescription__Group_3__1__Impl"


    // $ANTLR start "rule__DataDescription__Group_3__2"
    // InternalDataDsl.g:3833:1: rule__DataDescription__Group_3__2 : rule__DataDescription__Group_3__2__Impl ;
    public final void rule__DataDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3837:1: ( rule__DataDescription__Group_3__2__Impl )
            // InternalDataDsl.g:3838:2: rule__DataDescription__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_3__2__Impl();

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
    // $ANTLR end "rule__DataDescription__Group_3__2"


    // $ANTLR start "rule__DataDescription__Group_3__2__Impl"
    // InternalDataDsl.g:3844:1: rule__DataDescription__Group_3__2__Impl : ( ( rule__DataDescription__Group_3_2__0 )* ) ;
    public final void rule__DataDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3848:1: ( ( ( rule__DataDescription__Group_3_2__0 )* ) )
            // InternalDataDsl.g:3849:1: ( ( rule__DataDescription__Group_3_2__0 )* )
            {
            // InternalDataDsl.g:3849:1: ( ( rule__DataDescription__Group_3_2__0 )* )
            // InternalDataDsl.g:3850:2: ( rule__DataDescription__Group_3_2__0 )*
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_3_2()); 
            // InternalDataDsl.g:3851:2: ( rule__DataDescription__Group_3_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==69) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDataDsl.g:3851:3: rule__DataDescription__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DataDescription__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getDataDescriptionAccess().getGroup_3_2()); 

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
    // $ANTLR end "rule__DataDescription__Group_3__2__Impl"


    // $ANTLR start "rule__DataDescription__Group_3_2__0"
    // InternalDataDsl.g:3860:1: rule__DataDescription__Group_3_2__0 : rule__DataDescription__Group_3_2__0__Impl rule__DataDescription__Group_3_2__1 ;
    public final void rule__DataDescription__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3864:1: ( rule__DataDescription__Group_3_2__0__Impl rule__DataDescription__Group_3_2__1 )
            // InternalDataDsl.g:3865:2: rule__DataDescription__Group_3_2__0__Impl rule__DataDescription__Group_3_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DataDescription__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_3_2__1();

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
    // $ANTLR end "rule__DataDescription__Group_3_2__0"


    // $ANTLR start "rule__DataDescription__Group_3_2__0__Impl"
    // InternalDataDsl.g:3872:1: rule__DataDescription__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DataDescription__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3876:1: ( ( ',' ) )
            // InternalDataDsl.g:3877:1: ( ',' )
            {
            // InternalDataDsl.g:3877:1: ( ',' )
            // InternalDataDsl.g:3878:2: ','
            {
             before(grammarAccess.getDataDescriptionAccess().getCommaKeyword_3_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getCommaKeyword_3_2_0()); 

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
    // $ANTLR end "rule__DataDescription__Group_3_2__0__Impl"


    // $ANTLR start "rule__DataDescription__Group_3_2__1"
    // InternalDataDsl.g:3887:1: rule__DataDescription__Group_3_2__1 : rule__DataDescription__Group_3_2__1__Impl ;
    public final void rule__DataDescription__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3891:1: ( rule__DataDescription__Group_3_2__1__Impl )
            // InternalDataDsl.g:3892:2: rule__DataDescription__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_3_2__1__Impl();

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
    // $ANTLR end "rule__DataDescription__Group_3_2__1"


    // $ANTLR start "rule__DataDescription__Group_3_2__1__Impl"
    // InternalDataDsl.g:3898:1: rule__DataDescription__Group_3_2__1__Impl : ( ( rule__DataDescription__FragmentsAssignment_3_2_1 ) ) ;
    public final void rule__DataDescription__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3902:1: ( ( ( rule__DataDescription__FragmentsAssignment_3_2_1 ) ) )
            // InternalDataDsl.g:3903:1: ( ( rule__DataDescription__FragmentsAssignment_3_2_1 ) )
            {
            // InternalDataDsl.g:3903:1: ( ( rule__DataDescription__FragmentsAssignment_3_2_1 ) )
            // InternalDataDsl.g:3904:2: ( rule__DataDescription__FragmentsAssignment_3_2_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsAssignment_3_2_1()); 
            // InternalDataDsl.g:3905:2: ( rule__DataDescription__FragmentsAssignment_3_2_1 )
            // InternalDataDsl.g:3905:3: rule__DataDescription__FragmentsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__FragmentsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDescriptionAccess().getFragmentsAssignment_3_2_1()); 

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
    // $ANTLR end "rule__DataDescription__Group_3_2__1__Impl"


    // $ANTLR start "rule__DataDescription__Group_5__0"
    // InternalDataDsl.g:3914:1: rule__DataDescription__Group_5__0 : rule__DataDescription__Group_5__0__Impl rule__DataDescription__Group_5__1 ;
    public final void rule__DataDescription__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3918:1: ( rule__DataDescription__Group_5__0__Impl rule__DataDescription__Group_5__1 )
            // InternalDataDsl.g:3919:2: rule__DataDescription__Group_5__0__Impl rule__DataDescription__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__DataDescription__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_5__1();

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
    // $ANTLR end "rule__DataDescription__Group_5__0"


    // $ANTLR start "rule__DataDescription__Group_5__0__Impl"
    // InternalDataDsl.g:3926:1: rule__DataDescription__Group_5__0__Impl : ( ( rule__DataDescription__NodesAssignment_5_0 ) ) ;
    public final void rule__DataDescription__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3930:1: ( ( ( rule__DataDescription__NodesAssignment_5_0 ) ) )
            // InternalDataDsl.g:3931:1: ( ( rule__DataDescription__NodesAssignment_5_0 ) )
            {
            // InternalDataDsl.g:3931:1: ( ( rule__DataDescription__NodesAssignment_5_0 ) )
            // InternalDataDsl.g:3932:2: ( rule__DataDescription__NodesAssignment_5_0 )
            {
             before(grammarAccess.getDataDescriptionAccess().getNodesAssignment_5_0()); 
            // InternalDataDsl.g:3933:2: ( rule__DataDescription__NodesAssignment_5_0 )
            // InternalDataDsl.g:3933:3: rule__DataDescription__NodesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__NodesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getDataDescriptionAccess().getNodesAssignment_5_0()); 

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
    // $ANTLR end "rule__DataDescription__Group_5__0__Impl"


    // $ANTLR start "rule__DataDescription__Group_5__1"
    // InternalDataDsl.g:3941:1: rule__DataDescription__Group_5__1 : rule__DataDescription__Group_5__1__Impl ;
    public final void rule__DataDescription__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3945:1: ( rule__DataDescription__Group_5__1__Impl )
            // InternalDataDsl.g:3946:2: rule__DataDescription__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_5__1__Impl();

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
    // $ANTLR end "rule__DataDescription__Group_5__1"


    // $ANTLR start "rule__DataDescription__Group_5__1__Impl"
    // InternalDataDsl.g:3952:1: rule__DataDescription__Group_5__1__Impl : ( ( rule__DataDescription__NodesAssignment_5_1 )* ) ;
    public final void rule__DataDescription__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3956:1: ( ( ( rule__DataDescription__NodesAssignment_5_1 )* ) )
            // InternalDataDsl.g:3957:1: ( ( rule__DataDescription__NodesAssignment_5_1 )* )
            {
            // InternalDataDsl.g:3957:1: ( ( rule__DataDescription__NodesAssignment_5_1 )* )
            // InternalDataDsl.g:3958:2: ( rule__DataDescription__NodesAssignment_5_1 )*
            {
             before(grammarAccess.getDataDescriptionAccess().getNodesAssignment_5_1()); 
            // InternalDataDsl.g:3959:2: ( rule__DataDescription__NodesAssignment_5_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||(LA40_0>=22 && LA40_0<=42)||LA40_0==63||(LA40_0>=79 && LA40_0<=80)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDataDsl.g:3959:3: rule__DataDescription__NodesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__DataDescription__NodesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getDataDescriptionAccess().getNodesAssignment_5_1()); 

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
    // $ANTLR end "rule__DataDescription__Group_5__1__Impl"


    // $ANTLR start "rule__DataDescription__Group_7__0"
    // InternalDataDsl.g:3968:1: rule__DataDescription__Group_7__0 : rule__DataDescription__Group_7__0__Impl rule__DataDescription__Group_7__1 ;
    public final void rule__DataDescription__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3972:1: ( rule__DataDescription__Group_7__0__Impl rule__DataDescription__Group_7__1 )
            // InternalDataDsl.g:3973:2: rule__DataDescription__Group_7__0__Impl rule__DataDescription__Group_7__1
            {
            pushFollow(FOLLOW_14);
            rule__DataDescription__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_7__1();

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
    // $ANTLR end "rule__DataDescription__Group_7__0"


    // $ANTLR start "rule__DataDescription__Group_7__0__Impl"
    // InternalDataDsl.g:3980:1: rule__DataDescription__Group_7__0__Impl : ( '(' ) ;
    public final void rule__DataDescription__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3984:1: ( ( '(' ) )
            // InternalDataDsl.g:3985:1: ( '(' )
            {
            // InternalDataDsl.g:3985:1: ( '(' )
            // InternalDataDsl.g:3986:2: '('
            {
             before(grammarAccess.getDataDescriptionAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getLeftParenthesisKeyword_7_0()); 

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
    // $ANTLR end "rule__DataDescription__Group_7__0__Impl"


    // $ANTLR start "rule__DataDescription__Group_7__1"
    // InternalDataDsl.g:3995:1: rule__DataDescription__Group_7__1 : rule__DataDescription__Group_7__1__Impl rule__DataDescription__Group_7__2 ;
    public final void rule__DataDescription__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3999:1: ( rule__DataDescription__Group_7__1__Impl rule__DataDescription__Group_7__2 )
            // InternalDataDsl.g:4000:2: rule__DataDescription__Group_7__1__Impl rule__DataDescription__Group_7__2
            {
            pushFollow(FOLLOW_22);
            rule__DataDescription__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_7__2();

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
    // $ANTLR end "rule__DataDescription__Group_7__1"


    // $ANTLR start "rule__DataDescription__Group_7__1__Impl"
    // InternalDataDsl.g:4007:1: rule__DataDescription__Group_7__1__Impl : ( ( rule__DataDescription__OptionsAssignment_7_1 ) ) ;
    public final void rule__DataDescription__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4011:1: ( ( ( rule__DataDescription__OptionsAssignment_7_1 ) ) )
            // InternalDataDsl.g:4012:1: ( ( rule__DataDescription__OptionsAssignment_7_1 ) )
            {
            // InternalDataDsl.g:4012:1: ( ( rule__DataDescription__OptionsAssignment_7_1 ) )
            // InternalDataDsl.g:4013:2: ( rule__DataDescription__OptionsAssignment_7_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getOptionsAssignment_7_1()); 
            // InternalDataDsl.g:4014:2: ( rule__DataDescription__OptionsAssignment_7_1 )
            // InternalDataDsl.g:4014:3: rule__DataDescription__OptionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__OptionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDescriptionAccess().getOptionsAssignment_7_1()); 

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
    // $ANTLR end "rule__DataDescription__Group_7__1__Impl"


    // $ANTLR start "rule__DataDescription__Group_7__2"
    // InternalDataDsl.g:4022:1: rule__DataDescription__Group_7__2 : rule__DataDescription__Group_7__2__Impl rule__DataDescription__Group_7__3 ;
    public final void rule__DataDescription__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4026:1: ( rule__DataDescription__Group_7__2__Impl rule__DataDescription__Group_7__3 )
            // InternalDataDsl.g:4027:2: rule__DataDescription__Group_7__2__Impl rule__DataDescription__Group_7__3
            {
            pushFollow(FOLLOW_22);
            rule__DataDescription__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_7__3();

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
    // $ANTLR end "rule__DataDescription__Group_7__2"


    // $ANTLR start "rule__DataDescription__Group_7__2__Impl"
    // InternalDataDsl.g:4034:1: rule__DataDescription__Group_7__2__Impl : ( ( rule__DataDescription__Group_7_2__0 )* ) ;
    public final void rule__DataDescription__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4038:1: ( ( ( rule__DataDescription__Group_7_2__0 )* ) )
            // InternalDataDsl.g:4039:1: ( ( rule__DataDescription__Group_7_2__0 )* )
            {
            // InternalDataDsl.g:4039:1: ( ( rule__DataDescription__Group_7_2__0 )* )
            // InternalDataDsl.g:4040:2: ( rule__DataDescription__Group_7_2__0 )*
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_7_2()); 
            // InternalDataDsl.g:4041:2: ( rule__DataDescription__Group_7_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==69) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDataDsl.g:4041:3: rule__DataDescription__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DataDescription__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getDataDescriptionAccess().getGroup_7_2()); 

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
    // $ANTLR end "rule__DataDescription__Group_7__2__Impl"


    // $ANTLR start "rule__DataDescription__Group_7__3"
    // InternalDataDsl.g:4049:1: rule__DataDescription__Group_7__3 : rule__DataDescription__Group_7__3__Impl ;
    public final void rule__DataDescription__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4053:1: ( rule__DataDescription__Group_7__3__Impl )
            // InternalDataDsl.g:4054:2: rule__DataDescription__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_7__3__Impl();

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
    // $ANTLR end "rule__DataDescription__Group_7__3"


    // $ANTLR start "rule__DataDescription__Group_7__3__Impl"
    // InternalDataDsl.g:4060:1: rule__DataDescription__Group_7__3__Impl : ( ')' ) ;
    public final void rule__DataDescription__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4064:1: ( ( ')' ) )
            // InternalDataDsl.g:4065:1: ( ')' )
            {
            // InternalDataDsl.g:4065:1: ( ')' )
            // InternalDataDsl.g:4066:2: ')'
            {
             before(grammarAccess.getDataDescriptionAccess().getRightParenthesisKeyword_7_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getRightParenthesisKeyword_7_3()); 

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
    // $ANTLR end "rule__DataDescription__Group_7__3__Impl"


    // $ANTLR start "rule__DataDescription__Group_7_2__0"
    // InternalDataDsl.g:4076:1: rule__DataDescription__Group_7_2__0 : rule__DataDescription__Group_7_2__0__Impl rule__DataDescription__Group_7_2__1 ;
    public final void rule__DataDescription__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4080:1: ( rule__DataDescription__Group_7_2__0__Impl rule__DataDescription__Group_7_2__1 )
            // InternalDataDsl.g:4081:2: rule__DataDescription__Group_7_2__0__Impl rule__DataDescription__Group_7_2__1
            {
            pushFollow(FOLLOW_14);
            rule__DataDescription__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_7_2__1();

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
    // $ANTLR end "rule__DataDescription__Group_7_2__0"


    // $ANTLR start "rule__DataDescription__Group_7_2__0__Impl"
    // InternalDataDsl.g:4088:1: rule__DataDescription__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__DataDescription__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4092:1: ( ( ',' ) )
            // InternalDataDsl.g:4093:1: ( ',' )
            {
            // InternalDataDsl.g:4093:1: ( ',' )
            // InternalDataDsl.g:4094:2: ','
            {
             before(grammarAccess.getDataDescriptionAccess().getCommaKeyword_7_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getCommaKeyword_7_2_0()); 

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
    // $ANTLR end "rule__DataDescription__Group_7_2__0__Impl"


    // $ANTLR start "rule__DataDescription__Group_7_2__1"
    // InternalDataDsl.g:4103:1: rule__DataDescription__Group_7_2__1 : rule__DataDescription__Group_7_2__1__Impl ;
    public final void rule__DataDescription__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4107:1: ( rule__DataDescription__Group_7_2__1__Impl )
            // InternalDataDsl.g:4108:2: rule__DataDescription__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__Group_7_2__1__Impl();

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
    // $ANTLR end "rule__DataDescription__Group_7_2__1"


    // $ANTLR start "rule__DataDescription__Group_7_2__1__Impl"
    // InternalDataDsl.g:4114:1: rule__DataDescription__Group_7_2__1__Impl : ( ( rule__DataDescription__OptionsAssignment_7_2_1 ) ) ;
    public final void rule__DataDescription__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4118:1: ( ( ( rule__DataDescription__OptionsAssignment_7_2_1 ) ) )
            // InternalDataDsl.g:4119:1: ( ( rule__DataDescription__OptionsAssignment_7_2_1 ) )
            {
            // InternalDataDsl.g:4119:1: ( ( rule__DataDescription__OptionsAssignment_7_2_1 ) )
            // InternalDataDsl.g:4120:2: ( rule__DataDescription__OptionsAssignment_7_2_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getOptionsAssignment_7_2_1()); 
            // InternalDataDsl.g:4121:2: ( rule__DataDescription__OptionsAssignment_7_2_1 )
            // InternalDataDsl.g:4121:3: rule__DataDescription__OptionsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__OptionsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataDescriptionAccess().getOptionsAssignment_7_2_1()); 

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
    // $ANTLR end "rule__DataDescription__Group_7_2__1__Impl"


    // $ANTLR start "rule__Fragment__Group__0"
    // InternalDataDsl.g:4130:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4134:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalDataDsl.g:4135:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Fragment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__1();

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
    // $ANTLR end "rule__Fragment__Group__0"


    // $ANTLR start "rule__Fragment__Group__0__Impl"
    // InternalDataDsl.g:4142:1: rule__Fragment__Group__0__Impl : ( 'fragment' ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4146:1: ( ( 'fragment' ) )
            // InternalDataDsl.g:4147:1: ( 'fragment' )
            {
            // InternalDataDsl.g:4147:1: ( 'fragment' )
            // InternalDataDsl.g:4148:2: 'fragment'
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 

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
    // $ANTLR end "rule__Fragment__Group__0__Impl"


    // $ANTLR start "rule__Fragment__Group__1"
    // InternalDataDsl.g:4157:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4161:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalDataDsl.g:4162:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Fragment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__2();

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
    // $ANTLR end "rule__Fragment__Group__1"


    // $ANTLR start "rule__Fragment__Group__1__Impl"
    // InternalDataDsl.g:4169:1: rule__Fragment__Group__1__Impl : ( ( rule__Fragment__NameAssignment_1 ) ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4173:1: ( ( ( rule__Fragment__NameAssignment_1 ) ) )
            // InternalDataDsl.g:4174:1: ( ( rule__Fragment__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:4174:1: ( ( rule__Fragment__NameAssignment_1 ) )
            // InternalDataDsl.g:4175:2: ( rule__Fragment__NameAssignment_1 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:4176:2: ( rule__Fragment__NameAssignment_1 )
            // InternalDataDsl.g:4176:3: rule__Fragment__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Fragment__Group__1__Impl"


    // $ANTLR start "rule__Fragment__Group__2"
    // InternalDataDsl.g:4184:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4188:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalDataDsl.g:4189:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Fragment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__3();

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
    // $ANTLR end "rule__Fragment__Group__2"


    // $ANTLR start "rule__Fragment__Group__2__Impl"
    // InternalDataDsl.g:4196:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__Group_2__0 )? ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4200:1: ( ( ( rule__Fragment__Group_2__0 )? ) )
            // InternalDataDsl.g:4201:1: ( ( rule__Fragment__Group_2__0 )? )
            {
            // InternalDataDsl.g:4201:1: ( ( rule__Fragment__Group_2__0 )? )
            // InternalDataDsl.g:4202:2: ( rule__Fragment__Group_2__0 )?
            {
             before(grammarAccess.getFragmentAccess().getGroup_2()); 
            // InternalDataDsl.g:4203:2: ( rule__Fragment__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==74) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDataDsl.g:4203:3: rule__Fragment__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fragment__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFragmentAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Fragment__Group__2__Impl"


    // $ANTLR start "rule__Fragment__Group__3"
    // InternalDataDsl.g:4211:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl rule__Fragment__Group__4 ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4215:1: ( rule__Fragment__Group__3__Impl rule__Fragment__Group__4 )
            // InternalDataDsl.g:4216:2: rule__Fragment__Group__3__Impl rule__Fragment__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__Fragment__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__4();

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
    // $ANTLR end "rule__Fragment__Group__3"


    // $ANTLR start "rule__Fragment__Group__3__Impl"
    // InternalDataDsl.g:4223:1: rule__Fragment__Group__3__Impl : ( '{' ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4227:1: ( ( '{' ) )
            // InternalDataDsl.g:4228:1: ( '{' )
            {
            // InternalDataDsl.g:4228:1: ( '{' )
            // InternalDataDsl.g:4229:2: '{'
            {
             before(grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Fragment__Group__3__Impl"


    // $ANTLR start "rule__Fragment__Group__4"
    // InternalDataDsl.g:4238:1: rule__Fragment__Group__4 : rule__Fragment__Group__4__Impl rule__Fragment__Group__5 ;
    public final void rule__Fragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4242:1: ( rule__Fragment__Group__4__Impl rule__Fragment__Group__5 )
            // InternalDataDsl.g:4243:2: rule__Fragment__Group__4__Impl rule__Fragment__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Fragment__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__5();

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
    // $ANTLR end "rule__Fragment__Group__4"


    // $ANTLR start "rule__Fragment__Group__4__Impl"
    // InternalDataDsl.g:4250:1: rule__Fragment__Group__4__Impl : ( ( rule__Fragment__NodesAssignment_4 ) ) ;
    public final void rule__Fragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4254:1: ( ( ( rule__Fragment__NodesAssignment_4 ) ) )
            // InternalDataDsl.g:4255:1: ( ( rule__Fragment__NodesAssignment_4 ) )
            {
            // InternalDataDsl.g:4255:1: ( ( rule__Fragment__NodesAssignment_4 ) )
            // InternalDataDsl.g:4256:2: ( rule__Fragment__NodesAssignment_4 )
            {
             before(grammarAccess.getFragmentAccess().getNodesAssignment_4()); 
            // InternalDataDsl.g:4257:2: ( rule__Fragment__NodesAssignment_4 )
            // InternalDataDsl.g:4257:3: rule__Fragment__NodesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__NodesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getNodesAssignment_4()); 

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
    // $ANTLR end "rule__Fragment__Group__4__Impl"


    // $ANTLR start "rule__Fragment__Group__5"
    // InternalDataDsl.g:4265:1: rule__Fragment__Group__5 : rule__Fragment__Group__5__Impl rule__Fragment__Group__6 ;
    public final void rule__Fragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4269:1: ( rule__Fragment__Group__5__Impl rule__Fragment__Group__6 )
            // InternalDataDsl.g:4270:2: rule__Fragment__Group__5__Impl rule__Fragment__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Fragment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group__6();

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
    // $ANTLR end "rule__Fragment__Group__5"


    // $ANTLR start "rule__Fragment__Group__5__Impl"
    // InternalDataDsl.g:4277:1: rule__Fragment__Group__5__Impl : ( ( rule__Fragment__NodesAssignment_5 )* ) ;
    public final void rule__Fragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4281:1: ( ( ( rule__Fragment__NodesAssignment_5 )* ) )
            // InternalDataDsl.g:4282:1: ( ( rule__Fragment__NodesAssignment_5 )* )
            {
            // InternalDataDsl.g:4282:1: ( ( rule__Fragment__NodesAssignment_5 )* )
            // InternalDataDsl.g:4283:2: ( rule__Fragment__NodesAssignment_5 )*
            {
             before(grammarAccess.getFragmentAccess().getNodesAssignment_5()); 
            // InternalDataDsl.g:4284:2: ( rule__Fragment__NodesAssignment_5 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||(LA43_0>=22 && LA43_0<=42)||LA43_0==63||(LA43_0>=79 && LA43_0<=80)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDataDsl.g:4284:3: rule__Fragment__NodesAssignment_5
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__Fragment__NodesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getFragmentAccess().getNodesAssignment_5()); 

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
    // $ANTLR end "rule__Fragment__Group__5__Impl"


    // $ANTLR start "rule__Fragment__Group__6"
    // InternalDataDsl.g:4292:1: rule__Fragment__Group__6 : rule__Fragment__Group__6__Impl ;
    public final void rule__Fragment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4296:1: ( rule__Fragment__Group__6__Impl )
            // InternalDataDsl.g:4297:2: rule__Fragment__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group__6__Impl();

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
    // $ANTLR end "rule__Fragment__Group__6"


    // $ANTLR start "rule__Fragment__Group__6__Impl"
    // InternalDataDsl.g:4303:1: rule__Fragment__Group__6__Impl : ( '}' ) ;
    public final void rule__Fragment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4307:1: ( ( '}' ) )
            // InternalDataDsl.g:4308:1: ( '}' )
            {
            // InternalDataDsl.g:4308:1: ( '}' )
            // InternalDataDsl.g:4309:2: '}'
            {
             before(grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Fragment__Group__6__Impl"


    // $ANTLR start "rule__Fragment__Group_2__0"
    // InternalDataDsl.g:4319:1: rule__Fragment__Group_2__0 : rule__Fragment__Group_2__0__Impl rule__Fragment__Group_2__1 ;
    public final void rule__Fragment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4323:1: ( rule__Fragment__Group_2__0__Impl rule__Fragment__Group_2__1 )
            // InternalDataDsl.g:4324:2: rule__Fragment__Group_2__0__Impl rule__Fragment__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Fragment__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group_2__1();

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
    // $ANTLR end "rule__Fragment__Group_2__0"


    // $ANTLR start "rule__Fragment__Group_2__0__Impl"
    // InternalDataDsl.g:4331:1: rule__Fragment__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Fragment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4335:1: ( ( ':' ) )
            // InternalDataDsl.g:4336:1: ( ':' )
            {
            // InternalDataDsl.g:4336:1: ( ':' )
            // InternalDataDsl.g:4337:2: ':'
            {
             before(grammarAccess.getFragmentAccess().getColonKeyword_2_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getColonKeyword_2_0()); 

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
    // $ANTLR end "rule__Fragment__Group_2__0__Impl"


    // $ANTLR start "rule__Fragment__Group_2__1"
    // InternalDataDsl.g:4346:1: rule__Fragment__Group_2__1 : rule__Fragment__Group_2__1__Impl rule__Fragment__Group_2__2 ;
    public final void rule__Fragment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4350:1: ( rule__Fragment__Group_2__1__Impl rule__Fragment__Group_2__2 )
            // InternalDataDsl.g:4351:2: rule__Fragment__Group_2__1__Impl rule__Fragment__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__Fragment__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group_2__2();

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
    // $ANTLR end "rule__Fragment__Group_2__1"


    // $ANTLR start "rule__Fragment__Group_2__1__Impl"
    // InternalDataDsl.g:4358:1: rule__Fragment__Group_2__1__Impl : ( ( rule__Fragment__FragmentsAssignment_2_1 ) ) ;
    public final void rule__Fragment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4362:1: ( ( ( rule__Fragment__FragmentsAssignment_2_1 ) ) )
            // InternalDataDsl.g:4363:1: ( ( rule__Fragment__FragmentsAssignment_2_1 ) )
            {
            // InternalDataDsl.g:4363:1: ( ( rule__Fragment__FragmentsAssignment_2_1 ) )
            // InternalDataDsl.g:4364:2: ( rule__Fragment__FragmentsAssignment_2_1 )
            {
             before(grammarAccess.getFragmentAccess().getFragmentsAssignment_2_1()); 
            // InternalDataDsl.g:4365:2: ( rule__Fragment__FragmentsAssignment_2_1 )
            // InternalDataDsl.g:4365:3: rule__Fragment__FragmentsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__FragmentsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getFragmentsAssignment_2_1()); 

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
    // $ANTLR end "rule__Fragment__Group_2__1__Impl"


    // $ANTLR start "rule__Fragment__Group_2__2"
    // InternalDataDsl.g:4373:1: rule__Fragment__Group_2__2 : rule__Fragment__Group_2__2__Impl ;
    public final void rule__Fragment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4377:1: ( rule__Fragment__Group_2__2__Impl )
            // InternalDataDsl.g:4378:2: rule__Fragment__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group_2__2__Impl();

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
    // $ANTLR end "rule__Fragment__Group_2__2"


    // $ANTLR start "rule__Fragment__Group_2__2__Impl"
    // InternalDataDsl.g:4384:1: rule__Fragment__Group_2__2__Impl : ( ( rule__Fragment__Group_2_2__0 )* ) ;
    public final void rule__Fragment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4388:1: ( ( ( rule__Fragment__Group_2_2__0 )* ) )
            // InternalDataDsl.g:4389:1: ( ( rule__Fragment__Group_2_2__0 )* )
            {
            // InternalDataDsl.g:4389:1: ( ( rule__Fragment__Group_2_2__0 )* )
            // InternalDataDsl.g:4390:2: ( rule__Fragment__Group_2_2__0 )*
            {
             before(grammarAccess.getFragmentAccess().getGroup_2_2()); 
            // InternalDataDsl.g:4391:2: ( rule__Fragment__Group_2_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==69) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDataDsl.g:4391:3: rule__Fragment__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Fragment__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getFragmentAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__Fragment__Group_2__2__Impl"


    // $ANTLR start "rule__Fragment__Group_2_2__0"
    // InternalDataDsl.g:4400:1: rule__Fragment__Group_2_2__0 : rule__Fragment__Group_2_2__0__Impl rule__Fragment__Group_2_2__1 ;
    public final void rule__Fragment__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4404:1: ( rule__Fragment__Group_2_2__0__Impl rule__Fragment__Group_2_2__1 )
            // InternalDataDsl.g:4405:2: rule__Fragment__Group_2_2__0__Impl rule__Fragment__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Fragment__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fragment__Group_2_2__1();

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
    // $ANTLR end "rule__Fragment__Group_2_2__0"


    // $ANTLR start "rule__Fragment__Group_2_2__0__Impl"
    // InternalDataDsl.g:4412:1: rule__Fragment__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Fragment__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4416:1: ( ( ',' ) )
            // InternalDataDsl.g:4417:1: ( ',' )
            {
            // InternalDataDsl.g:4417:1: ( ',' )
            // InternalDataDsl.g:4418:2: ','
            {
             before(grammarAccess.getFragmentAccess().getCommaKeyword_2_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__Fragment__Group_2_2__0__Impl"


    // $ANTLR start "rule__Fragment__Group_2_2__1"
    // InternalDataDsl.g:4427:1: rule__Fragment__Group_2_2__1 : rule__Fragment__Group_2_2__1__Impl ;
    public final void rule__Fragment__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4431:1: ( rule__Fragment__Group_2_2__1__Impl )
            // InternalDataDsl.g:4432:2: rule__Fragment__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Fragment__Group_2_2__1"


    // $ANTLR start "rule__Fragment__Group_2_2__1__Impl"
    // InternalDataDsl.g:4438:1: rule__Fragment__Group_2_2__1__Impl : ( ( rule__Fragment__FragmentsAssignment_2_2_1 ) ) ;
    public final void rule__Fragment__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4442:1: ( ( ( rule__Fragment__FragmentsAssignment_2_2_1 ) ) )
            // InternalDataDsl.g:4443:1: ( ( rule__Fragment__FragmentsAssignment_2_2_1 ) )
            {
            // InternalDataDsl.g:4443:1: ( ( rule__Fragment__FragmentsAssignment_2_2_1 ) )
            // InternalDataDsl.g:4444:2: ( rule__Fragment__FragmentsAssignment_2_2_1 )
            {
             before(grammarAccess.getFragmentAccess().getFragmentsAssignment_2_2_1()); 
            // InternalDataDsl.g:4445:2: ( rule__Fragment__FragmentsAssignment_2_2_1 )
            // InternalDataDsl.g:4445:3: rule__Fragment__FragmentsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Fragment__FragmentsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFragmentAccess().getFragmentsAssignment_2_2_1()); 

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
    // $ANTLR end "rule__Fragment__Group_2_2__1__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group__0"
    // InternalDataDsl.g:4454:1: rule__DataTypeRefinement__Group__0 : rule__DataTypeRefinement__Group__0__Impl rule__DataTypeRefinement__Group__1 ;
    public final void rule__DataTypeRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4458:1: ( rule__DataTypeRefinement__Group__0__Impl rule__DataTypeRefinement__Group__1 )
            // InternalDataDsl.g:4459:2: rule__DataTypeRefinement__Group__0__Impl rule__DataTypeRefinement__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataTypeRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group__1();

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
    // $ANTLR end "rule__DataTypeRefinement__Group__0"


    // $ANTLR start "rule__DataTypeRefinement__Group__0__Impl"
    // InternalDataDsl.g:4466:1: rule__DataTypeRefinement__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataTypeRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4470:1: ( ( 'datatype' ) )
            // InternalDataDsl.g:4471:1: ( 'datatype' )
            {
            // InternalDataDsl.g:4471:1: ( 'datatype' )
            // InternalDataDsl.g:4472:2: 'datatype'
            {
             before(grammarAccess.getDataTypeRefinementAccess().getDatatypeKeyword_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getDataTypeRefinementAccess().getDatatypeKeyword_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group__0__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group__1"
    // InternalDataDsl.g:4481:1: rule__DataTypeRefinement__Group__1 : rule__DataTypeRefinement__Group__1__Impl rule__DataTypeRefinement__Group__2 ;
    public final void rule__DataTypeRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4485:1: ( rule__DataTypeRefinement__Group__1__Impl rule__DataTypeRefinement__Group__2 )
            // InternalDataDsl.g:4486:2: rule__DataTypeRefinement__Group__1__Impl rule__DataTypeRefinement__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__DataTypeRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group__2();

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
    // $ANTLR end "rule__DataTypeRefinement__Group__1"


    // $ANTLR start "rule__DataTypeRefinement__Group__1__Impl"
    // InternalDataDsl.g:4493:1: rule__DataTypeRefinement__Group__1__Impl : ( ( rule__DataTypeRefinement__NameAssignment_1 ) ) ;
    public final void rule__DataTypeRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4497:1: ( ( ( rule__DataTypeRefinement__NameAssignment_1 ) ) )
            // InternalDataDsl.g:4498:1: ( ( rule__DataTypeRefinement__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:4498:1: ( ( rule__DataTypeRefinement__NameAssignment_1 ) )
            // InternalDataDsl.g:4499:2: ( rule__DataTypeRefinement__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:4500:2: ( rule__DataTypeRefinement__NameAssignment_1 )
            // InternalDataDsl.g:4500:3: rule__DataTypeRefinement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeRefinementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group__1__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group__2"
    // InternalDataDsl.g:4508:1: rule__DataTypeRefinement__Group__2 : rule__DataTypeRefinement__Group__2__Impl rule__DataTypeRefinement__Group__3 ;
    public final void rule__DataTypeRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4512:1: ( rule__DataTypeRefinement__Group__2__Impl rule__DataTypeRefinement__Group__3 )
            // InternalDataDsl.g:4513:2: rule__DataTypeRefinement__Group__2__Impl rule__DataTypeRefinement__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__DataTypeRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group__3();

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
    // $ANTLR end "rule__DataTypeRefinement__Group__2"


    // $ANTLR start "rule__DataTypeRefinement__Group__2__Impl"
    // InternalDataDsl.g:4520:1: rule__DataTypeRefinement__Group__2__Impl : ( ':' ) ;
    public final void rule__DataTypeRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4524:1: ( ( ':' ) )
            // InternalDataDsl.g:4525:1: ( ':' )
            {
            // InternalDataDsl.g:4525:1: ( ':' )
            // InternalDataDsl.g:4526:2: ':'
            {
             before(grammarAccess.getDataTypeRefinementAccess().getColonKeyword_2()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getDataTypeRefinementAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group__2__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group__3"
    // InternalDataDsl.g:4535:1: rule__DataTypeRefinement__Group__3 : rule__DataTypeRefinement__Group__3__Impl rule__DataTypeRefinement__Group__4 ;
    public final void rule__DataTypeRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4539:1: ( rule__DataTypeRefinement__Group__3__Impl rule__DataTypeRefinement__Group__4 )
            // InternalDataDsl.g:4540:2: rule__DataTypeRefinement__Group__3__Impl rule__DataTypeRefinement__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__DataTypeRefinement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group__4();

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
    // $ANTLR end "rule__DataTypeRefinement__Group__3"


    // $ANTLR start "rule__DataTypeRefinement__Group__3__Impl"
    // InternalDataDsl.g:4547:1: rule__DataTypeRefinement__Group__3__Impl : ( ( rule__DataTypeRefinement__RefineAssignment_3 ) ) ;
    public final void rule__DataTypeRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4551:1: ( ( ( rule__DataTypeRefinement__RefineAssignment_3 ) ) )
            // InternalDataDsl.g:4552:1: ( ( rule__DataTypeRefinement__RefineAssignment_3 ) )
            {
            // InternalDataDsl.g:4552:1: ( ( rule__DataTypeRefinement__RefineAssignment_3 ) )
            // InternalDataDsl.g:4553:2: ( rule__DataTypeRefinement__RefineAssignment_3 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getRefineAssignment_3()); 
            // InternalDataDsl.g:4554:2: ( rule__DataTypeRefinement__RefineAssignment_3 )
            // InternalDataDsl.g:4554:3: rule__DataTypeRefinement__RefineAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__RefineAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeRefinementAccess().getRefineAssignment_3()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group__3__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group__4"
    // InternalDataDsl.g:4562:1: rule__DataTypeRefinement__Group__4 : rule__DataTypeRefinement__Group__4__Impl rule__DataTypeRefinement__Group__5 ;
    public final void rule__DataTypeRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4566:1: ( rule__DataTypeRefinement__Group__4__Impl rule__DataTypeRefinement__Group__5 )
            // InternalDataDsl.g:4567:2: rule__DataTypeRefinement__Group__4__Impl rule__DataTypeRefinement__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__DataTypeRefinement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group__5();

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
    // $ANTLR end "rule__DataTypeRefinement__Group__4"


    // $ANTLR start "rule__DataTypeRefinement__Group__4__Impl"
    // InternalDataDsl.g:4574:1: rule__DataTypeRefinement__Group__4__Impl : ( ( rule__DataTypeRefinement__Group_4__0 )? ) ;
    public final void rule__DataTypeRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4578:1: ( ( ( rule__DataTypeRefinement__Group_4__0 )? ) )
            // InternalDataDsl.g:4579:1: ( ( rule__DataTypeRefinement__Group_4__0 )? )
            {
            // InternalDataDsl.g:4579:1: ( ( rule__DataTypeRefinement__Group_4__0 )? )
            // InternalDataDsl.g:4580:2: ( rule__DataTypeRefinement__Group_4__0 )?
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup_4()); 
            // InternalDataDsl.g:4581:2: ( rule__DataTypeRefinement__Group_4__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==65) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDataDsl.g:4581:3: rule__DataTypeRefinement__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataTypeRefinement__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeRefinementAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group__4__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group__5"
    // InternalDataDsl.g:4589:1: rule__DataTypeRefinement__Group__5 : rule__DataTypeRefinement__Group__5__Impl ;
    public final void rule__DataTypeRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4593:1: ( rule__DataTypeRefinement__Group__5__Impl )
            // InternalDataDsl.g:4594:2: rule__DataTypeRefinement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group__5__Impl();

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
    // $ANTLR end "rule__DataTypeRefinement__Group__5"


    // $ANTLR start "rule__DataTypeRefinement__Group__5__Impl"
    // InternalDataDsl.g:4600:1: rule__DataTypeRefinement__Group__5__Impl : ( ( rule__DataTypeRefinement__Group_5__0 )? ) ;
    public final void rule__DataTypeRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4604:1: ( ( ( rule__DataTypeRefinement__Group_5__0 )? ) )
            // InternalDataDsl.g:4605:1: ( ( rule__DataTypeRefinement__Group_5__0 )? )
            {
            // InternalDataDsl.g:4605:1: ( ( rule__DataTypeRefinement__Group_5__0 )? )
            // InternalDataDsl.g:4606:2: ( rule__DataTypeRefinement__Group_5__0 )?
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup_5()); 
            // InternalDataDsl.g:4607:2: ( rule__DataTypeRefinement__Group_5__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==71) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDataDsl.g:4607:3: rule__DataTypeRefinement__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataTypeRefinement__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeRefinementAccess().getGroup_5()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group__5__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_4__0"
    // InternalDataDsl.g:4616:1: rule__DataTypeRefinement__Group_4__0 : rule__DataTypeRefinement__Group_4__0__Impl rule__DataTypeRefinement__Group_4__1 ;
    public final void rule__DataTypeRefinement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4620:1: ( rule__DataTypeRefinement__Group_4__0__Impl rule__DataTypeRefinement__Group_4__1 )
            // InternalDataDsl.g:4621:2: rule__DataTypeRefinement__Group_4__0__Impl rule__DataTypeRefinement__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__DataTypeRefinement__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_4__1();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4__0"


    // $ANTLR start "rule__DataTypeRefinement__Group_4__0__Impl"
    // InternalDataDsl.g:4628:1: rule__DataTypeRefinement__Group_4__0__Impl : ( '{' ) ;
    public final void rule__DataTypeRefinement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4632:1: ( ( '{' ) )
            // InternalDataDsl.g:4633:1: ( '{' )
            {
            // InternalDataDsl.g:4633:1: ( '{' )
            // InternalDataDsl.g:4634:2: '{'
            {
             before(grammarAccess.getDataTypeRefinementAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getDataTypeRefinementAccess().getLeftCurlyBracketKeyword_4_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4__0__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_4__1"
    // InternalDataDsl.g:4643:1: rule__DataTypeRefinement__Group_4__1 : rule__DataTypeRefinement__Group_4__1__Impl rule__DataTypeRefinement__Group_4__2 ;
    public final void rule__DataTypeRefinement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4647:1: ( rule__DataTypeRefinement__Group_4__1__Impl rule__DataTypeRefinement__Group_4__2 )
            // InternalDataDsl.g:4648:2: rule__DataTypeRefinement__Group_4__1__Impl rule__DataTypeRefinement__Group_4__2
            {
            pushFollow(FOLLOW_32);
            rule__DataTypeRefinement__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_4__2();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4__1"


    // $ANTLR start "rule__DataTypeRefinement__Group_4__1__Impl"
    // InternalDataDsl.g:4655:1: rule__DataTypeRefinement__Group_4__1__Impl : ( ( rule__DataTypeRefinement__Group_4_1__0 )? ) ;
    public final void rule__DataTypeRefinement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4659:1: ( ( ( rule__DataTypeRefinement__Group_4_1__0 )? ) )
            // InternalDataDsl.g:4660:1: ( ( rule__DataTypeRefinement__Group_4_1__0 )? )
            {
            // InternalDataDsl.g:4660:1: ( ( rule__DataTypeRefinement__Group_4_1__0 )? )
            // InternalDataDsl.g:4661:2: ( rule__DataTypeRefinement__Group_4_1__0 )?
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup_4_1()); 
            // InternalDataDsl.g:4662:2: ( rule__DataTypeRefinement__Group_4_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=16 && LA47_0<=21)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDataDsl.g:4662:3: rule__DataTypeRefinement__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataTypeRefinement__Group_4_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeRefinementAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4__1__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_4__2"
    // InternalDataDsl.g:4670:1: rule__DataTypeRefinement__Group_4__2 : rule__DataTypeRefinement__Group_4__2__Impl ;
    public final void rule__DataTypeRefinement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4674:1: ( rule__DataTypeRefinement__Group_4__2__Impl )
            // InternalDataDsl.g:4675:2: rule__DataTypeRefinement__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_4__2__Impl();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4__2"


    // $ANTLR start "rule__DataTypeRefinement__Group_4__2__Impl"
    // InternalDataDsl.g:4681:1: rule__DataTypeRefinement__Group_4__2__Impl : ( '}' ) ;
    public final void rule__DataTypeRefinement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4685:1: ( ( '}' ) )
            // InternalDataDsl.g:4686:1: ( '}' )
            {
            // InternalDataDsl.g:4686:1: ( '}' )
            // InternalDataDsl.g:4687:2: '}'
            {
             before(grammarAccess.getDataTypeRefinementAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getDataTypeRefinementAccess().getRightCurlyBracketKeyword_4_2()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4__2__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_4_1__0"
    // InternalDataDsl.g:4697:1: rule__DataTypeRefinement__Group_4_1__0 : rule__DataTypeRefinement__Group_4_1__0__Impl rule__DataTypeRefinement__Group_4_1__1 ;
    public final void rule__DataTypeRefinement__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4701:1: ( rule__DataTypeRefinement__Group_4_1__0__Impl rule__DataTypeRefinement__Group_4_1__1 )
            // InternalDataDsl.g:4702:2: rule__DataTypeRefinement__Group_4_1__0__Impl rule__DataTypeRefinement__Group_4_1__1
            {
            pushFollow(FOLLOW_33);
            rule__DataTypeRefinement__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_4_1__1();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4_1__0"


    // $ANTLR start "rule__DataTypeRefinement__Group_4_1__0__Impl"
    // InternalDataDsl.g:4709:1: rule__DataTypeRefinement__Group_4_1__0__Impl : ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 ) ) ;
    public final void rule__DataTypeRefinement__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4713:1: ( ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 ) ) )
            // InternalDataDsl.g:4714:1: ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 ) )
            {
            // InternalDataDsl.g:4714:1: ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 ) )
            // InternalDataDsl.g:4715:2: ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getSubsequencesAssignment_4_1_0()); 
            // InternalDataDsl.g:4716:2: ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 )
            // InternalDataDsl.g:4716:3: rule__DataTypeRefinement__SubsequencesAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__SubsequencesAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeRefinementAccess().getSubsequencesAssignment_4_1_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4_1__0__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_4_1__1"
    // InternalDataDsl.g:4724:1: rule__DataTypeRefinement__Group_4_1__1 : rule__DataTypeRefinement__Group_4_1__1__Impl ;
    public final void rule__DataTypeRefinement__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4728:1: ( rule__DataTypeRefinement__Group_4_1__1__Impl )
            // InternalDataDsl.g:4729:2: rule__DataTypeRefinement__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4_1__1"


    // $ANTLR start "rule__DataTypeRefinement__Group_4_1__1__Impl"
    // InternalDataDsl.g:4735:1: rule__DataTypeRefinement__Group_4_1__1__Impl : ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )* ) ;
    public final void rule__DataTypeRefinement__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4739:1: ( ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )* ) )
            // InternalDataDsl.g:4740:1: ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )* )
            {
            // InternalDataDsl.g:4740:1: ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )* )
            // InternalDataDsl.g:4741:2: ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )*
            {
             before(grammarAccess.getDataTypeRefinementAccess().getSubsequencesAssignment_4_1_1()); 
            // InternalDataDsl.g:4742:2: ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=16 && LA48_0<=21)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalDataDsl.g:4742:3: rule__DataTypeRefinement__SubsequencesAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__DataTypeRefinement__SubsequencesAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getDataTypeRefinementAccess().getSubsequencesAssignment_4_1_1()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_4_1__1__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_5__0"
    // InternalDataDsl.g:4751:1: rule__DataTypeRefinement__Group_5__0 : rule__DataTypeRefinement__Group_5__0__Impl rule__DataTypeRefinement__Group_5__1 ;
    public final void rule__DataTypeRefinement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4755:1: ( rule__DataTypeRefinement__Group_5__0__Impl rule__DataTypeRefinement__Group_5__1 )
            // InternalDataDsl.g:4756:2: rule__DataTypeRefinement__Group_5__0__Impl rule__DataTypeRefinement__Group_5__1
            {
            pushFollow(FOLLOW_21);
            rule__DataTypeRefinement__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_5__1();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5__0"


    // $ANTLR start "rule__DataTypeRefinement__Group_5__0__Impl"
    // InternalDataDsl.g:4763:1: rule__DataTypeRefinement__Group_5__0__Impl : ( '(' ) ;
    public final void rule__DataTypeRefinement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4767:1: ( ( '(' ) )
            // InternalDataDsl.g:4768:1: ( '(' )
            {
            // InternalDataDsl.g:4768:1: ( '(' )
            // InternalDataDsl.g:4769:2: '('
            {
             before(grammarAccess.getDataTypeRefinementAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getDataTypeRefinementAccess().getLeftParenthesisKeyword_5_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5__0__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_5__1"
    // InternalDataDsl.g:4778:1: rule__DataTypeRefinement__Group_5__1 : rule__DataTypeRefinement__Group_5__1__Impl rule__DataTypeRefinement__Group_5__2 ;
    public final void rule__DataTypeRefinement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4782:1: ( rule__DataTypeRefinement__Group_5__1__Impl rule__DataTypeRefinement__Group_5__2 )
            // InternalDataDsl.g:4783:2: rule__DataTypeRefinement__Group_5__1__Impl rule__DataTypeRefinement__Group_5__2
            {
            pushFollow(FOLLOW_22);
            rule__DataTypeRefinement__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_5__2();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5__1"


    // $ANTLR start "rule__DataTypeRefinement__Group_5__1__Impl"
    // InternalDataDsl.g:4790:1: rule__DataTypeRefinement__Group_5__1__Impl : ( ( rule__DataTypeRefinement__OptionsAssignment_5_1 ) ) ;
    public final void rule__DataTypeRefinement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4794:1: ( ( ( rule__DataTypeRefinement__OptionsAssignment_5_1 ) ) )
            // InternalDataDsl.g:4795:1: ( ( rule__DataTypeRefinement__OptionsAssignment_5_1 ) )
            {
            // InternalDataDsl.g:4795:1: ( ( rule__DataTypeRefinement__OptionsAssignment_5_1 ) )
            // InternalDataDsl.g:4796:2: ( rule__DataTypeRefinement__OptionsAssignment_5_1 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getOptionsAssignment_5_1()); 
            // InternalDataDsl.g:4797:2: ( rule__DataTypeRefinement__OptionsAssignment_5_1 )
            // InternalDataDsl.g:4797:3: rule__DataTypeRefinement__OptionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__OptionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeRefinementAccess().getOptionsAssignment_5_1()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5__1__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_5__2"
    // InternalDataDsl.g:4805:1: rule__DataTypeRefinement__Group_5__2 : rule__DataTypeRefinement__Group_5__2__Impl rule__DataTypeRefinement__Group_5__3 ;
    public final void rule__DataTypeRefinement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4809:1: ( rule__DataTypeRefinement__Group_5__2__Impl rule__DataTypeRefinement__Group_5__3 )
            // InternalDataDsl.g:4810:2: rule__DataTypeRefinement__Group_5__2__Impl rule__DataTypeRefinement__Group_5__3
            {
            pushFollow(FOLLOW_22);
            rule__DataTypeRefinement__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_5__3();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5__2"


    // $ANTLR start "rule__DataTypeRefinement__Group_5__2__Impl"
    // InternalDataDsl.g:4817:1: rule__DataTypeRefinement__Group_5__2__Impl : ( ( rule__DataTypeRefinement__Group_5_2__0 )* ) ;
    public final void rule__DataTypeRefinement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4821:1: ( ( ( rule__DataTypeRefinement__Group_5_2__0 )* ) )
            // InternalDataDsl.g:4822:1: ( ( rule__DataTypeRefinement__Group_5_2__0 )* )
            {
            // InternalDataDsl.g:4822:1: ( ( rule__DataTypeRefinement__Group_5_2__0 )* )
            // InternalDataDsl.g:4823:2: ( rule__DataTypeRefinement__Group_5_2__0 )*
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup_5_2()); 
            // InternalDataDsl.g:4824:2: ( rule__DataTypeRefinement__Group_5_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==69) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDataDsl.g:4824:3: rule__DataTypeRefinement__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DataTypeRefinement__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getDataTypeRefinementAccess().getGroup_5_2()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5__2__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_5__3"
    // InternalDataDsl.g:4832:1: rule__DataTypeRefinement__Group_5__3 : rule__DataTypeRefinement__Group_5__3__Impl ;
    public final void rule__DataTypeRefinement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4836:1: ( rule__DataTypeRefinement__Group_5__3__Impl )
            // InternalDataDsl.g:4837:2: rule__DataTypeRefinement__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_5__3__Impl();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5__3"


    // $ANTLR start "rule__DataTypeRefinement__Group_5__3__Impl"
    // InternalDataDsl.g:4843:1: rule__DataTypeRefinement__Group_5__3__Impl : ( ')' ) ;
    public final void rule__DataTypeRefinement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4847:1: ( ( ')' ) )
            // InternalDataDsl.g:4848:1: ( ')' )
            {
            // InternalDataDsl.g:4848:1: ( ')' )
            // InternalDataDsl.g:4849:2: ')'
            {
             before(grammarAccess.getDataTypeRefinementAccess().getRightParenthesisKeyword_5_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getDataTypeRefinementAccess().getRightParenthesisKeyword_5_3()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5__3__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_5_2__0"
    // InternalDataDsl.g:4859:1: rule__DataTypeRefinement__Group_5_2__0 : rule__DataTypeRefinement__Group_5_2__0__Impl rule__DataTypeRefinement__Group_5_2__1 ;
    public final void rule__DataTypeRefinement__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4863:1: ( rule__DataTypeRefinement__Group_5_2__0__Impl rule__DataTypeRefinement__Group_5_2__1 )
            // InternalDataDsl.g:4864:2: rule__DataTypeRefinement__Group_5_2__0__Impl rule__DataTypeRefinement__Group_5_2__1
            {
            pushFollow(FOLLOW_21);
            rule__DataTypeRefinement__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_5_2__1();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5_2__0"


    // $ANTLR start "rule__DataTypeRefinement__Group_5_2__0__Impl"
    // InternalDataDsl.g:4871:1: rule__DataTypeRefinement__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__DataTypeRefinement__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4875:1: ( ( ',' ) )
            // InternalDataDsl.g:4876:1: ( ',' )
            {
            // InternalDataDsl.g:4876:1: ( ',' )
            // InternalDataDsl.g:4877:2: ','
            {
             before(grammarAccess.getDataTypeRefinementAccess().getCommaKeyword_5_2_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getDataTypeRefinementAccess().getCommaKeyword_5_2_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5_2__0__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group_5_2__1"
    // InternalDataDsl.g:4886:1: rule__DataTypeRefinement__Group_5_2__1 : rule__DataTypeRefinement__Group_5_2__1__Impl ;
    public final void rule__DataTypeRefinement__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4890:1: ( rule__DataTypeRefinement__Group_5_2__1__Impl )
            // InternalDataDsl.g:4891:2: rule__DataTypeRefinement__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__Group_5_2__1__Impl();

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5_2__1"


    // $ANTLR start "rule__DataTypeRefinement__Group_5_2__1__Impl"
    // InternalDataDsl.g:4897:1: rule__DataTypeRefinement__Group_5_2__1__Impl : ( ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 ) ) ;
    public final void rule__DataTypeRefinement__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4901:1: ( ( ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 ) ) )
            // InternalDataDsl.g:4902:1: ( ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 ) )
            {
            // InternalDataDsl.g:4902:1: ( ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 ) )
            // InternalDataDsl.g:4903:2: ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getOptionsAssignment_5_2_1()); 
            // InternalDataDsl.g:4904:2: ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 )
            // InternalDataDsl.g:4904:3: rule__DataTypeRefinement__OptionsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeRefinement__OptionsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeRefinementAccess().getOptionsAssignment_5_2_1()); 

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
    // $ANTLR end "rule__DataTypeRefinement__Group_5_2__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalDataDsl.g:4913:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4917:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalDataDsl.g:4918:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
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
    // InternalDataDsl.g:4925:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4929:1: ( ( 'enumeration' ) )
            // InternalDataDsl.g:4930:1: ( 'enumeration' )
            {
            // InternalDataDsl.g:4930:1: ( 'enumeration' )
            // InternalDataDsl.g:4931:2: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalDataDsl.g:4940:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4944:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalDataDsl.g:4945:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDsl.g:4952:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4956:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalDataDsl.g:4957:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:4957:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalDataDsl.g:4958:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:4959:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalDataDsl.g:4959:3: rule__Enumeration__NameAssignment_1
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
    // InternalDataDsl.g:4967:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4971:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalDataDsl.g:4972:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:4979:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4983:1: ( ( '{' ) )
            // InternalDataDsl.g:4984:1: ( '{' )
            {
            // InternalDataDsl.g:4984:1: ( '{' )
            // InternalDataDsl.g:4985:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalDataDsl.g:4994:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4998:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalDataDsl.g:4999:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalDataDsl.g:5006:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__ValuesAssignment_3 ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5010:1: ( ( ( rule__Enumeration__ValuesAssignment_3 ) ) )
            // InternalDataDsl.g:5011:1: ( ( rule__Enumeration__ValuesAssignment_3 ) )
            {
            // InternalDataDsl.g:5011:1: ( ( rule__Enumeration__ValuesAssignment_3 ) )
            // InternalDataDsl.g:5012:2: ( rule__Enumeration__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_3()); 
            // InternalDataDsl.g:5013:2: ( rule__Enumeration__ValuesAssignment_3 )
            // InternalDataDsl.g:5013:3: rule__Enumeration__ValuesAssignment_3
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
    // InternalDataDsl.g:5021:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5025:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalDataDsl.g:5026:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_35);
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
    // InternalDataDsl.g:5033:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5037:1: ( ( ( rule__Enumeration__Group_4__0 )* ) )
            // InternalDataDsl.g:5038:1: ( ( rule__Enumeration__Group_4__0 )* )
            {
            // InternalDataDsl.g:5038:1: ( ( rule__Enumeration__Group_4__0 )* )
            // InternalDataDsl.g:5039:2: ( rule__Enumeration__Group_4__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // InternalDataDsl.g:5040:2: ( rule__Enumeration__Group_4__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==69) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDataDsl.g:5040:3: rule__Enumeration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Enumeration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalDataDsl.g:5048:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5052:1: ( rule__Enumeration__Group__5__Impl )
            // InternalDataDsl.g:5053:2: rule__Enumeration__Group__5__Impl
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
    // InternalDataDsl.g:5059:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5063:1: ( ( '}' ) )
            // InternalDataDsl.g:5064:1: ( '}' )
            {
            // InternalDataDsl.g:5064:1: ( '}' )
            // InternalDataDsl.g:5065:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,66,FOLLOW_2); 
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
    // InternalDataDsl.g:5075:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5079:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // InternalDataDsl.g:5080:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:5087:1: rule__Enumeration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5091:1: ( ( ',' ) )
            // InternalDataDsl.g:5092:1: ( ',' )
            {
            // InternalDataDsl.g:5092:1: ( ',' )
            // InternalDataDsl.g:5093:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalDataDsl.g:5102:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5106:1: ( rule__Enumeration__Group_4__1__Impl )
            // InternalDataDsl.g:5107:2: rule__Enumeration__Group_4__1__Impl
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
    // InternalDataDsl.g:5113:1: rule__Enumeration__Group_4__1__Impl : ( ( rule__Enumeration__ValuesAssignment_4_1 ) ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5117:1: ( ( ( rule__Enumeration__ValuesAssignment_4_1 ) ) )
            // InternalDataDsl.g:5118:1: ( ( rule__Enumeration__ValuesAssignment_4_1 ) )
            {
            // InternalDataDsl.g:5118:1: ( ( rule__Enumeration__ValuesAssignment_4_1 ) )
            // InternalDataDsl.g:5119:2: ( rule__Enumeration__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_4_1()); 
            // InternalDataDsl.g:5120:2: ( rule__Enumeration__ValuesAssignment_4_1 )
            // InternalDataDsl.g:5120:3: rule__Enumeration__ValuesAssignment_4_1
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


    // $ANTLR start "rule__StringOption__Group__0"
    // InternalDataDsl.g:5129:1: rule__StringOption__Group__0 : rule__StringOption__Group__0__Impl rule__StringOption__Group__1 ;
    public final void rule__StringOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5133:1: ( rule__StringOption__Group__0__Impl rule__StringOption__Group__1 )
            // InternalDataDsl.g:5134:2: rule__StringOption__Group__0__Impl rule__StringOption__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDataDsl.g:5141:1: rule__StringOption__Group__0__Impl : ( ( rule__StringOption__KeyAssignment_0 ) ) ;
    public final void rule__StringOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5145:1: ( ( ( rule__StringOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5146:1: ( ( rule__StringOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5146:1: ( ( rule__StringOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5147:2: ( rule__StringOption__KeyAssignment_0 )
            {
             before(grammarAccess.getStringOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5148:2: ( rule__StringOption__KeyAssignment_0 )
            // InternalDataDsl.g:5148:3: rule__StringOption__KeyAssignment_0
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
    // InternalDataDsl.g:5156:1: rule__StringOption__Group__1 : rule__StringOption__Group__1__Impl rule__StringOption__Group__2 ;
    public final void rule__StringOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5160:1: ( rule__StringOption__Group__1__Impl rule__StringOption__Group__2 )
            // InternalDataDsl.g:5161:2: rule__StringOption__Group__1__Impl rule__StringOption__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:5168:1: rule__StringOption__Group__1__Impl : ( '=' ) ;
    public final void rule__StringOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5172:1: ( ( '=' ) )
            // InternalDataDsl.g:5173:1: ( '=' )
            {
            // InternalDataDsl.g:5173:1: ( '=' )
            // InternalDataDsl.g:5174:2: '='
            {
             before(grammarAccess.getStringOptionAccess().getEqualsSignKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalDataDsl.g:5183:1: rule__StringOption__Group__2 : rule__StringOption__Group__2__Impl ;
    public final void rule__StringOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5187:1: ( rule__StringOption__Group__2__Impl )
            // InternalDataDsl.g:5188:2: rule__StringOption__Group__2__Impl
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
    // InternalDataDsl.g:5194:1: rule__StringOption__Group__2__Impl : ( ( rule__StringOption__ValueAssignment_2 ) ) ;
    public final void rule__StringOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5198:1: ( ( ( rule__StringOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5199:1: ( ( rule__StringOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5199:1: ( ( rule__StringOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5200:2: ( rule__StringOption__ValueAssignment_2 )
            {
             before(grammarAccess.getStringOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5201:2: ( rule__StringOption__ValueAssignment_2 )
            // InternalDataDsl.g:5201:3: rule__StringOption__ValueAssignment_2
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
    // InternalDataDsl.g:5210:1: rule__IntOption__Group__0 : rule__IntOption__Group__0__Impl rule__IntOption__Group__1 ;
    public final void rule__IntOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5214:1: ( rule__IntOption__Group__0__Impl rule__IntOption__Group__1 )
            // InternalDataDsl.g:5215:2: rule__IntOption__Group__0__Impl rule__IntOption__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDataDsl.g:5222:1: rule__IntOption__Group__0__Impl : ( ( rule__IntOption__KeyAssignment_0 ) ) ;
    public final void rule__IntOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5226:1: ( ( ( rule__IntOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5227:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5227:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5228:2: ( rule__IntOption__KeyAssignment_0 )
            {
             before(grammarAccess.getIntOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5229:2: ( rule__IntOption__KeyAssignment_0 )
            // InternalDataDsl.g:5229:3: rule__IntOption__KeyAssignment_0
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
    // InternalDataDsl.g:5237:1: rule__IntOption__Group__1 : rule__IntOption__Group__1__Impl rule__IntOption__Group__2 ;
    public final void rule__IntOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5241:1: ( rule__IntOption__Group__1__Impl rule__IntOption__Group__2 )
            // InternalDataDsl.g:5242:2: rule__IntOption__Group__1__Impl rule__IntOption__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataDsl.g:5249:1: rule__IntOption__Group__1__Impl : ( '=' ) ;
    public final void rule__IntOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5253:1: ( ( '=' ) )
            // InternalDataDsl.g:5254:1: ( '=' )
            {
            // InternalDataDsl.g:5254:1: ( '=' )
            // InternalDataDsl.g:5255:2: '='
            {
             before(grammarAccess.getIntOptionAccess().getEqualsSignKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalDataDsl.g:5264:1: rule__IntOption__Group__2 : rule__IntOption__Group__2__Impl ;
    public final void rule__IntOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5268:1: ( rule__IntOption__Group__2__Impl )
            // InternalDataDsl.g:5269:2: rule__IntOption__Group__2__Impl
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
    // InternalDataDsl.g:5275:1: rule__IntOption__Group__2__Impl : ( ( rule__IntOption__ValueAssignment_2 ) ) ;
    public final void rule__IntOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5279:1: ( ( ( rule__IntOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5280:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5280:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5281:2: ( rule__IntOption__ValueAssignment_2 )
            {
             before(grammarAccess.getIntOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5282:2: ( rule__IntOption__ValueAssignment_2 )
            // InternalDataDsl.g:5282:3: rule__IntOption__ValueAssignment_2
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
    // InternalDataDsl.g:5291:1: rule__DoubleOption__Group__0 : rule__DoubleOption__Group__0__Impl rule__DoubleOption__Group__1 ;
    public final void rule__DoubleOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5295:1: ( rule__DoubleOption__Group__0__Impl rule__DoubleOption__Group__1 )
            // InternalDataDsl.g:5296:2: rule__DoubleOption__Group__0__Impl rule__DoubleOption__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDataDsl.g:5303:1: rule__DoubleOption__Group__0__Impl : ( ( rule__DoubleOption__KeyAssignment_0 ) ) ;
    public final void rule__DoubleOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5307:1: ( ( ( rule__DoubleOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5308:1: ( ( rule__DoubleOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5308:1: ( ( rule__DoubleOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5309:2: ( rule__DoubleOption__KeyAssignment_0 )
            {
             before(grammarAccess.getDoubleOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5310:2: ( rule__DoubleOption__KeyAssignment_0 )
            // InternalDataDsl.g:5310:3: rule__DoubleOption__KeyAssignment_0
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
    // InternalDataDsl.g:5318:1: rule__DoubleOption__Group__1 : rule__DoubleOption__Group__1__Impl rule__DoubleOption__Group__2 ;
    public final void rule__DoubleOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5322:1: ( rule__DoubleOption__Group__1__Impl rule__DoubleOption__Group__2 )
            // InternalDataDsl.g:5323:2: rule__DoubleOption__Group__1__Impl rule__DoubleOption__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalDataDsl.g:5330:1: rule__DoubleOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DoubleOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5334:1: ( ( '=' ) )
            // InternalDataDsl.g:5335:1: ( '=' )
            {
            // InternalDataDsl.g:5335:1: ( '=' )
            // InternalDataDsl.g:5336:2: '='
            {
             before(grammarAccess.getDoubleOptionAccess().getEqualsSignKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalDataDsl.g:5345:1: rule__DoubleOption__Group__2 : rule__DoubleOption__Group__2__Impl ;
    public final void rule__DoubleOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5349:1: ( rule__DoubleOption__Group__2__Impl )
            // InternalDataDsl.g:5350:2: rule__DoubleOption__Group__2__Impl
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
    // InternalDataDsl.g:5356:1: rule__DoubleOption__Group__2__Impl : ( ( rule__DoubleOption__ValueAssignment_2 ) ) ;
    public final void rule__DoubleOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5360:1: ( ( ( rule__DoubleOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5361:1: ( ( rule__DoubleOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5361:1: ( ( rule__DoubleOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5362:2: ( rule__DoubleOption__ValueAssignment_2 )
            {
             before(grammarAccess.getDoubleOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5363:2: ( rule__DoubleOption__ValueAssignment_2 )
            // InternalDataDsl.g:5363:3: rule__DoubleOption__ValueAssignment_2
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
    // InternalDataDsl.g:5372:1: rule__BooleanOption__Group__0 : rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 ;
    public final void rule__BooleanOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5376:1: ( rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 )
            // InternalDataDsl.g:5377:2: rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDataDsl.g:5384:1: rule__BooleanOption__Group__0__Impl : ( ( rule__BooleanOption__KeyAssignment_0 ) ) ;
    public final void rule__BooleanOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5388:1: ( ( ( rule__BooleanOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5389:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5389:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5390:2: ( rule__BooleanOption__KeyAssignment_0 )
            {
             before(grammarAccess.getBooleanOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5391:2: ( rule__BooleanOption__KeyAssignment_0 )
            // InternalDataDsl.g:5391:3: rule__BooleanOption__KeyAssignment_0
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
    // InternalDataDsl.g:5399:1: rule__BooleanOption__Group__1 : rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 ;
    public final void rule__BooleanOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5403:1: ( rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 )
            // InternalDataDsl.g:5404:2: rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalDataDsl.g:5411:1: rule__BooleanOption__Group__1__Impl : ( '=' ) ;
    public final void rule__BooleanOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5415:1: ( ( '=' ) )
            // InternalDataDsl.g:5416:1: ( '=' )
            {
            // InternalDataDsl.g:5416:1: ( '=' )
            // InternalDataDsl.g:5417:2: '='
            {
             before(grammarAccess.getBooleanOptionAccess().getEqualsSignKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalDataDsl.g:5426:1: rule__BooleanOption__Group__2 : rule__BooleanOption__Group__2__Impl ;
    public final void rule__BooleanOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5430:1: ( rule__BooleanOption__Group__2__Impl )
            // InternalDataDsl.g:5431:2: rule__BooleanOption__Group__2__Impl
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
    // InternalDataDsl.g:5437:1: rule__BooleanOption__Group__2__Impl : ( ( rule__BooleanOption__ValueAssignment_2 ) ) ;
    public final void rule__BooleanOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5441:1: ( ( ( rule__BooleanOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5442:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5442:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5443:2: ( rule__BooleanOption__ValueAssignment_2 )
            {
             before(grammarAccess.getBooleanOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5444:2: ( rule__BooleanOption__ValueAssignment_2 )
            // InternalDataDsl.g:5444:3: rule__BooleanOption__ValueAssignment_2
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


    // $ANTLR start "rule__ListQualifiedNameOption__Group__0"
    // InternalDataDsl.g:5453:1: rule__ListQualifiedNameOption__Group__0 : rule__ListQualifiedNameOption__Group__0__Impl rule__ListQualifiedNameOption__Group__1 ;
    public final void rule__ListQualifiedNameOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5457:1: ( rule__ListQualifiedNameOption__Group__0__Impl rule__ListQualifiedNameOption__Group__1 )
            // InternalDataDsl.g:5458:2: rule__ListQualifiedNameOption__Group__0__Impl rule__ListQualifiedNameOption__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ListQualifiedNameOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListQualifiedNameOption__Group__1();

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
    // $ANTLR end "rule__ListQualifiedNameOption__Group__0"


    // $ANTLR start "rule__ListQualifiedNameOption__Group__0__Impl"
    // InternalDataDsl.g:5465:1: rule__ListQualifiedNameOption__Group__0__Impl : ( ( rule__ListQualifiedNameOption__KeyAssignment_0 ) ) ;
    public final void rule__ListQualifiedNameOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5469:1: ( ( ( rule__ListQualifiedNameOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5470:1: ( ( rule__ListQualifiedNameOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5470:1: ( ( rule__ListQualifiedNameOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5471:2: ( rule__ListQualifiedNameOption__KeyAssignment_0 )
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5472:2: ( rule__ListQualifiedNameOption__KeyAssignment_0 )
            // InternalDataDsl.g:5472:3: rule__ListQualifiedNameOption__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ListQualifiedNameOption__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getListQualifiedNameOptionAccess().getKeyAssignment_0()); 

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
    // $ANTLR end "rule__ListQualifiedNameOption__Group__0__Impl"


    // $ANTLR start "rule__ListQualifiedNameOption__Group__1"
    // InternalDataDsl.g:5480:1: rule__ListQualifiedNameOption__Group__1 : rule__ListQualifiedNameOption__Group__1__Impl rule__ListQualifiedNameOption__Group__2 ;
    public final void rule__ListQualifiedNameOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5484:1: ( rule__ListQualifiedNameOption__Group__1__Impl rule__ListQualifiedNameOption__Group__2 )
            // InternalDataDsl.g:5485:2: rule__ListQualifiedNameOption__Group__1__Impl rule__ListQualifiedNameOption__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ListQualifiedNameOption__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListQualifiedNameOption__Group__2();

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
    // $ANTLR end "rule__ListQualifiedNameOption__Group__1"


    // $ANTLR start "rule__ListQualifiedNameOption__Group__1__Impl"
    // InternalDataDsl.g:5492:1: rule__ListQualifiedNameOption__Group__1__Impl : ( '=' ) ;
    public final void rule__ListQualifiedNameOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5496:1: ( ( '=' ) )
            // InternalDataDsl.g:5497:1: ( '=' )
            {
            // InternalDataDsl.g:5497:1: ( '=' )
            // InternalDataDsl.g:5498:2: '='
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getEqualsSignKeyword_1()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getListQualifiedNameOptionAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__ListQualifiedNameOption__Group__1__Impl"


    // $ANTLR start "rule__ListQualifiedNameOption__Group__2"
    // InternalDataDsl.g:5507:1: rule__ListQualifiedNameOption__Group__2 : rule__ListQualifiedNameOption__Group__2__Impl ;
    public final void rule__ListQualifiedNameOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5511:1: ( rule__ListQualifiedNameOption__Group__2__Impl )
            // InternalDataDsl.g:5512:2: rule__ListQualifiedNameOption__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListQualifiedNameOption__Group__2__Impl();

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
    // $ANTLR end "rule__ListQualifiedNameOption__Group__2"


    // $ANTLR start "rule__ListQualifiedNameOption__Group__2__Impl"
    // InternalDataDsl.g:5518:1: rule__ListQualifiedNameOption__Group__2__Impl : ( ( rule__ListQualifiedNameOption__FragmentsAssignment_2 ) ) ;
    public final void rule__ListQualifiedNameOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5522:1: ( ( ( rule__ListQualifiedNameOption__FragmentsAssignment_2 ) ) )
            // InternalDataDsl.g:5523:1: ( ( rule__ListQualifiedNameOption__FragmentsAssignment_2 ) )
            {
            // InternalDataDsl.g:5523:1: ( ( rule__ListQualifiedNameOption__FragmentsAssignment_2 ) )
            // InternalDataDsl.g:5524:2: ( rule__ListQualifiedNameOption__FragmentsAssignment_2 )
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getFragmentsAssignment_2()); 
            // InternalDataDsl.g:5525:2: ( rule__ListQualifiedNameOption__FragmentsAssignment_2 )
            // InternalDataDsl.g:5525:3: rule__ListQualifiedNameOption__FragmentsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ListQualifiedNameOption__FragmentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getListQualifiedNameOptionAccess().getFragmentsAssignment_2()); 

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
    // $ANTLR end "rule__ListQualifiedNameOption__Group__2__Impl"


    // $ANTLR start "rule__DataOption__Group__0"
    // InternalDataDsl.g:5534:1: rule__DataOption__Group__0 : rule__DataOption__Group__0__Impl rule__DataOption__Group__1 ;
    public final void rule__DataOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5538:1: ( rule__DataOption__Group__0__Impl rule__DataOption__Group__1 )
            // InternalDataDsl.g:5539:2: rule__DataOption__Group__0__Impl rule__DataOption__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalDataDsl.g:5546:1: rule__DataOption__Group__0__Impl : ( ( rule__DataOption__KeyAssignment_0 ) ) ;
    public final void rule__DataOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5550:1: ( ( ( rule__DataOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5551:1: ( ( rule__DataOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5551:1: ( ( rule__DataOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5552:2: ( rule__DataOption__KeyAssignment_0 )
            {
             before(grammarAccess.getDataOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5553:2: ( rule__DataOption__KeyAssignment_0 )
            // InternalDataDsl.g:5553:3: rule__DataOption__KeyAssignment_0
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
    // InternalDataDsl.g:5561:1: rule__DataOption__Group__1 : rule__DataOption__Group__1__Impl rule__DataOption__Group__2 ;
    public final void rule__DataOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5565:1: ( rule__DataOption__Group__1__Impl rule__DataOption__Group__2 )
            // InternalDataDsl.g:5566:2: rule__DataOption__Group__1__Impl rule__DataOption__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:5573:1: rule__DataOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DataOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5577:1: ( ( '=' ) )
            // InternalDataDsl.g:5578:1: ( '=' )
            {
            // InternalDataDsl.g:5578:1: ( '=' )
            // InternalDataDsl.g:5579:2: '='
            {
             before(grammarAccess.getDataOptionAccess().getEqualsSignKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalDataDsl.g:5588:1: rule__DataOption__Group__2 : rule__DataOption__Group__2__Impl ;
    public final void rule__DataOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5592:1: ( rule__DataOption__Group__2__Impl )
            // InternalDataDsl.g:5593:2: rule__DataOption__Group__2__Impl
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
    // InternalDataDsl.g:5599:1: rule__DataOption__Group__2__Impl : ( ( rule__DataOption__ValueAssignment_2 ) ) ;
    public final void rule__DataOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5603:1: ( ( ( rule__DataOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5604:1: ( ( rule__DataOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5604:1: ( ( rule__DataOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5605:2: ( rule__DataOption__ValueAssignment_2 )
            {
             before(grammarAccess.getDataOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5606:2: ( rule__DataOption__ValueAssignment_2 )
            // InternalDataDsl.g:5606:3: rule__DataOption__ValueAssignment_2
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


    // $ANTLR start "rule__DataModel__ElementsAssignment_1"
    // InternalDataDsl.g:5615:1: rule__DataModel__ElementsAssignment_1 : ( ruleDataModelElement ) ;
    public final void rule__DataModel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5619:1: ( ( ruleDataModelElement ) )
            // InternalDataDsl.g:5620:2: ( ruleDataModelElement )
            {
            // InternalDataDsl.g:5620:2: ( ruleDataModelElement )
            // InternalDataDsl.g:5621:3: ruleDataModelElement
            {
             before(grammarAccess.getDataModelAccess().getElementsDataModelElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataModelElement();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getElementsDataModelElementParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataModel__ElementsAssignment_1"


    // $ANTLR start "rule__DataModel__ElementsAssignment_2"
    // InternalDataDsl.g:5630:1: rule__DataModel__ElementsAssignment_2 : ( ruleDataModelElement ) ;
    public final void rule__DataModel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5634:1: ( ( ruleDataModelElement ) )
            // InternalDataDsl.g:5635:2: ( ruleDataModelElement )
            {
            // InternalDataDsl.g:5635:2: ( ruleDataModelElement )
            // InternalDataDsl.g:5636:3: ruleDataModelElement
            {
             before(grammarAccess.getDataModelAccess().getElementsDataModelElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataModelElement();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getElementsDataModelElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataModel__ElementsAssignment_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalDataDsl.g:5645:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5649:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalDataDsl.g:5650:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalDataDsl.g:5650:2: ( ruleQualifiedNameWithWildcard )
            // InternalDataDsl.g:5651:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Package__TagsAssignment_0_0"
    // InternalDataDsl.g:5660:1: rule__Package__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Package__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5664:1: ( ( ruleTag ) )
            // InternalDataDsl.g:5665:2: ( ruleTag )
            {
            // InternalDataDsl.g:5665:2: ( ruleTag )
            // InternalDataDsl.g:5666:3: ruleTag
            {
             before(grammarAccess.getPackageAccess().getTagsTagParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTagsTagParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Package__TagsAssignment_0_0"


    // $ANTLR start "rule__Package__TagsAssignment_0_1"
    // InternalDataDsl.g:5675:1: rule__Package__TagsAssignment_0_1 : ( ruleTag ) ;
    public final void rule__Package__TagsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5679:1: ( ( ruleTag ) )
            // InternalDataDsl.g:5680:2: ( ruleTag )
            {
            // InternalDataDsl.g:5680:2: ( ruleTag )
            // InternalDataDsl.g:5681:3: ruleTag
            {
             before(grammarAccess.getPackageAccess().getTagsTagParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTag();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getTagsTagParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Package__TagsAssignment_0_1"


    // $ANTLR start "rule__Package__NameAssignment_2"
    // InternalDataDsl.g:5690:1: rule__Package__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5694:1: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5695:2: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:5695:2: ( ruleQualifiedName )
            // InternalDataDsl.g:5696:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getNameQualifiedNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Package__NameAssignment_2"


    // $ANTLR start "rule__Package__ElementsAssignment_4"
    // InternalDataDsl.g:5705:1: rule__Package__ElementsAssignment_4 : ( ruleSpecificationElement ) ;
    public final void rule__Package__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5709:1: ( ( ruleSpecificationElement ) )
            // InternalDataDsl.g:5710:2: ( ruleSpecificationElement )
            {
            // InternalDataDsl.g:5710:2: ( ruleSpecificationElement )
            // InternalDataDsl.g:5711:3: ruleSpecificationElement
            {
             before(grammarAccess.getPackageAccess().getElementsSpecificationElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecificationElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsSpecificationElementParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Package__ElementsAssignment_4"


    // $ANTLR start "rule__Package__ElementsAssignment_5"
    // InternalDataDsl.g:5720:1: rule__Package__ElementsAssignment_5 : ( ruleSpecificationElement ) ;
    public final void rule__Package__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5724:1: ( ( ruleSpecificationElement ) )
            // InternalDataDsl.g:5725:2: ( ruleSpecificationElement )
            {
            // InternalDataDsl.g:5725:2: ( ruleSpecificationElement )
            // InternalDataDsl.g:5726:3: ruleSpecificationElement
            {
             before(grammarAccess.getPackageAccess().getElementsSpecificationElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecificationElement();

            state._fsp--;

             after(grammarAccess.getPackageAccess().getElementsSpecificationElementParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Package__ElementsAssignment_5"


    // $ANTLR start "rule__Tag__TagAssignment_1"
    // InternalDataDsl.g:5735:1: rule__Tag__TagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Tag__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5739:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5740:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5740:2: ( RULE_STRING )
            // InternalDataDsl.g:5741:3: RULE_STRING
            {
             before(grammarAccess.getTagAccess().getTagSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTagAccess().getTagSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Tag__TagAssignment_1"


    // $ANTLR start "rule__Substring__TypeStringAssignment_0"
    // InternalDataDsl.g:5750:1: rule__Substring__TypeStringAssignment_0 : ( ruleTypeString ) ;
    public final void rule__Substring__TypeStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5754:1: ( ( ruleTypeString ) )
            // InternalDataDsl.g:5755:2: ( ruleTypeString )
            {
            // InternalDataDsl.g:5755:2: ( ruleTypeString )
            // InternalDataDsl.g:5756:3: ruleTypeString
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
    // InternalDataDsl.g:5765:1: rule__Substring__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Substring__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5769:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5770:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5770:2: ( RULE_ID )
            // InternalDataDsl.g:5771:3: RULE_ID
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
    // InternalDataDsl.g:5780:1: rule__Substring__MinlengthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Substring__MinlengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5784:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:5785:2: ( RULE_INT )
            {
            // InternalDataDsl.g:5785:2: ( RULE_INT )
            // InternalDataDsl.g:5786:3: RULE_INT
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
    // InternalDataDsl.g:5795:1: rule__Substring__MaxlengthAssignment_5 : ( RULE_INT ) ;
    public final void rule__Substring__MaxlengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5799:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:5800:2: ( RULE_INT )
            {
            // InternalDataDsl.g:5800:2: ( RULE_INT )
            // InternalDataDsl.g:5801:3: RULE_INT
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
    // InternalDataDsl.g:5810:1: rule__Character__TypeCharacterAssignment_0 : ( ruleTypeCharacter ) ;
    public final void rule__Character__TypeCharacterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5814:1: ( ( ruleTypeCharacter ) )
            // InternalDataDsl.g:5815:2: ( ruleTypeCharacter )
            {
            // InternalDataDsl.g:5815:2: ( ruleTypeCharacter )
            // InternalDataDsl.g:5816:3: ruleTypeCharacter
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
    // InternalDataDsl.g:5825:1: rule__Character__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Character__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5829:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5830:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5830:2: ( RULE_ID )
            // InternalDataDsl.g:5831:3: RULE_ID
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
    // InternalDataDsl.g:5840:1: rule__Character__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Character__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5844:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5845:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5845:2: ( RULE_STRING )
            // InternalDataDsl.g:5846:3: RULE_STRING
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


    // $ANTLR start "rule__CompositeNode__KeyAssignment_0_0"
    // InternalDataDsl.g:5855:1: rule__CompositeNode__KeyAssignment_0_0 : ( ( 'key' ) ) ;
    public final void rule__CompositeNode__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5859:1: ( ( ( 'key' ) ) )
            // InternalDataDsl.g:5860:2: ( ( 'key' ) )
            {
            // InternalDataDsl.g:5860:2: ( ( 'key' ) )
            // InternalDataDsl.g:5861:3: ( 'key' )
            {
             before(grammarAccess.getCompositeNodeAccess().getKeyKeyKeyword_0_0_0()); 
            // InternalDataDsl.g:5862:3: ( 'key' )
            // InternalDataDsl.g:5863:4: 'key'
            {
             before(grammarAccess.getCompositeNodeAccess().getKeyKeyKeyword_0_0_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getKeyKeyKeyword_0_0_0()); 

            }

             after(grammarAccess.getCompositeNodeAccess().getKeyKeyKeyword_0_0_0()); 

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
    // $ANTLR end "rule__CompositeNode__KeyAssignment_0_0"


    // $ANTLR start "rule__CompositeNode__UniqueAssignment_0_1"
    // InternalDataDsl.g:5874:1: rule__CompositeNode__UniqueAssignment_0_1 : ( ( 'unique' ) ) ;
    public final void rule__CompositeNode__UniqueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5878:1: ( ( ( 'unique' ) ) )
            // InternalDataDsl.g:5879:2: ( ( 'unique' ) )
            {
            // InternalDataDsl.g:5879:2: ( ( 'unique' ) )
            // InternalDataDsl.g:5880:3: ( 'unique' )
            {
             before(grammarAccess.getCompositeNodeAccess().getUniqueUniqueKeyword_0_1_0()); 
            // InternalDataDsl.g:5881:3: ( 'unique' )
            // InternalDataDsl.g:5882:4: 'unique'
            {
             before(grammarAccess.getCompositeNodeAccess().getUniqueUniqueKeyword_0_1_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getUniqueUniqueKeyword_0_1_0()); 

            }

             after(grammarAccess.getCompositeNodeAccess().getUniqueUniqueKeyword_0_1_0()); 

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
    // $ANTLR end "rule__CompositeNode__UniqueAssignment_0_1"


    // $ANTLR start "rule__CompositeNode__TypeAssignment_1"
    // InternalDataDsl.g:5893:1: rule__CompositeNode__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CompositeNode__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5897:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5898:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5898:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5899:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositeNodeAccess().getTypeTypeSpecificationCrossReference_1_0()); 
            // InternalDataDsl.g:5900:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5901:4: ruleQualifiedName
            {
             before(grammarAccess.getCompositeNodeAccess().getTypeTypeSpecificationQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getTypeTypeSpecificationQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCompositeNodeAccess().getTypeTypeSpecificationCrossReference_1_0()); 

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
    // $ANTLR end "rule__CompositeNode__TypeAssignment_1"


    // $ANTLR start "rule__CompositeNode__NameAssignment_2"
    // InternalDataDsl.g:5912:1: rule__CompositeNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CompositeNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5916:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5917:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5917:2: ( RULE_ID )
            // InternalDataDsl.g:5918:3: RULE_ID
            {
             before(grammarAccess.getCompositeNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__CompositeNode__NameAssignment_2"


    // $ANTLR start "rule__CompositeNode__CardinalityAssignment_3_1"
    // InternalDataDsl.g:5927:1: rule__CompositeNode__CardinalityAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__CompositeNode__CardinalityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5931:1: ( ( ruleCardinality ) )
            // InternalDataDsl.g:5932:2: ( ruleCardinality )
            {
            // InternalDataDsl.g:5932:2: ( ruleCardinality )
            // InternalDataDsl.g:5933:3: ruleCardinality
            {
             before(grammarAccess.getCompositeNodeAccess().getCardinalityCardinalityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getCardinalityCardinalityParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__CompositeNode__CardinalityAssignment_3_1"


    // $ANTLR start "rule__CompositeNode__OptionsAssignment_4_1"
    // InternalDataDsl.g:5942:1: rule__CompositeNode__OptionsAssignment_4_1 : ( ruleOption ) ;
    public final void rule__CompositeNode__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5946:1: ( ( ruleOption ) )
            // InternalDataDsl.g:5947:2: ( ruleOption )
            {
            // InternalDataDsl.g:5947:2: ( ruleOption )
            // InternalDataDsl.g:5948:3: ruleOption
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__CompositeNode__OptionsAssignment_4_1"


    // $ANTLR start "rule__CompositeNode__OptionsAssignment_4_2_1"
    // InternalDataDsl.g:5957:1: rule__CompositeNode__OptionsAssignment_4_2_1 : ( ruleOption ) ;
    public final void rule__CompositeNode__OptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5961:1: ( ( ruleOption ) )
            // InternalDataDsl.g:5962:2: ( ruleOption )
            {
            // InternalDataDsl.g:5962:2: ( ruleOption )
            // InternalDataDsl.g:5963:3: ruleOption
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__CompositeNode__OptionsAssignment_4_2_1"


    // $ANTLR start "rule__FragmentNode__TypeAssignment_1"
    // InternalDataDsl.g:5972:1: rule__FragmentNode__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FragmentNode__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5976:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:5977:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:5977:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5978:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFragmentNodeAccess().getTypeFragmentCrossReference_1_0()); 
            // InternalDataDsl.g:5979:3: ( ruleQualifiedName )
            // InternalDataDsl.g:5980:4: ruleQualifiedName
            {
             before(grammarAccess.getFragmentNodeAccess().getTypeFragmentQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFragmentNodeAccess().getTypeFragmentQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getFragmentNodeAccess().getTypeFragmentCrossReference_1_0()); 

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
    // $ANTLR end "rule__FragmentNode__TypeAssignment_1"


    // $ANTLR start "rule__FragmentNode__NameAssignment_2"
    // InternalDataDsl.g:5991:1: rule__FragmentNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FragmentNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5995:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5996:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5996:2: ( RULE_ID )
            // InternalDataDsl.g:5997:3: RULE_ID
            {
             before(grammarAccess.getFragmentNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFragmentNodeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__FragmentNode__NameAssignment_2"


    // $ANTLR start "rule__FragmentNode__CardinalityAssignment_3_1"
    // InternalDataDsl.g:6006:1: rule__FragmentNode__CardinalityAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__FragmentNode__CardinalityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6010:1: ( ( ruleCardinality ) )
            // InternalDataDsl.g:6011:2: ( ruleCardinality )
            {
            // InternalDataDsl.g:6011:2: ( ruleCardinality )
            // InternalDataDsl.g:6012:3: ruleCardinality
            {
             before(grammarAccess.getFragmentNodeAccess().getCardinalityCardinalityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getFragmentNodeAccess().getCardinalityCardinalityParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__FragmentNode__CardinalityAssignment_3_1"


    // $ANTLR start "rule__FragmentNode__OptionsAssignment_4_1"
    // InternalDataDsl.g:6021:1: rule__FragmentNode__OptionsAssignment_4_1 : ( ruleOption ) ;
    public final void rule__FragmentNode__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6025:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6026:2: ( ruleOption )
            {
            // InternalDataDsl.g:6026:2: ( ruleOption )
            // InternalDataDsl.g:6027:3: ruleOption
            {
             before(grammarAccess.getFragmentNodeAccess().getOptionsOptionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getFragmentNodeAccess().getOptionsOptionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__FragmentNode__OptionsAssignment_4_1"


    // $ANTLR start "rule__FragmentNode__OptionsAssignment_4_2_1"
    // InternalDataDsl.g:6036:1: rule__FragmentNode__OptionsAssignment_4_2_1 : ( ruleOption ) ;
    public final void rule__FragmentNode__OptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6040:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6041:2: ( ruleOption )
            {
            // InternalDataDsl.g:6041:2: ( ruleOption )
            // InternalDataDsl.g:6042:3: ruleOption
            {
             before(grammarAccess.getFragmentNodeAccess().getOptionsOptionParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getFragmentNodeAccess().getOptionsOptionParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__FragmentNode__OptionsAssignment_4_2_1"


    // $ANTLR start "rule__PrimitiveNode__KeyAssignment_0_0"
    // InternalDataDsl.g:6051:1: rule__PrimitiveNode__KeyAssignment_0_0 : ( ( 'key' ) ) ;
    public final void rule__PrimitiveNode__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6055:1: ( ( ( 'key' ) ) )
            // InternalDataDsl.g:6056:2: ( ( 'key' ) )
            {
            // InternalDataDsl.g:6056:2: ( ( 'key' ) )
            // InternalDataDsl.g:6057:3: ( 'key' )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getKeyKeyKeyword_0_0_0()); 
            // InternalDataDsl.g:6058:3: ( 'key' )
            // InternalDataDsl.g:6059:4: 'key'
            {
             before(grammarAccess.getPrimitiveNodeAccess().getKeyKeyKeyword_0_0_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getPrimitiveNodeAccess().getKeyKeyKeyword_0_0_0()); 

            }

             after(grammarAccess.getPrimitiveNodeAccess().getKeyKeyKeyword_0_0_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__KeyAssignment_0_0"


    // $ANTLR start "rule__PrimitiveNode__UniqueAssignment_0_1"
    // InternalDataDsl.g:6070:1: rule__PrimitiveNode__UniqueAssignment_0_1 : ( ( 'unique' ) ) ;
    public final void rule__PrimitiveNode__UniqueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6074:1: ( ( ( 'unique' ) ) )
            // InternalDataDsl.g:6075:2: ( ( 'unique' ) )
            {
            // InternalDataDsl.g:6075:2: ( ( 'unique' ) )
            // InternalDataDsl.g:6076:3: ( 'unique' )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getUniqueUniqueKeyword_0_1_0()); 
            // InternalDataDsl.g:6077:3: ( 'unique' )
            // InternalDataDsl.g:6078:4: 'unique'
            {
             before(grammarAccess.getPrimitiveNodeAccess().getUniqueUniqueKeyword_0_1_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getPrimitiveNodeAccess().getUniqueUniqueKeyword_0_1_0()); 

            }

             after(grammarAccess.getPrimitiveNodeAccess().getUniqueUniqueKeyword_0_1_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__UniqueAssignment_0_1"


    // $ANTLR start "rule__PrimitiveNode__TypeAssignment_1"
    // InternalDataDsl.g:6089:1: rule__PrimitiveNode__TypeAssignment_1 : ( ruleBasicType ) ;
    public final void rule__PrimitiveNode__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6093:1: ( ( ruleBasicType ) )
            // InternalDataDsl.g:6094:2: ( ruleBasicType )
            {
            // InternalDataDsl.g:6094:2: ( ruleBasicType )
            // InternalDataDsl.g:6095:3: ruleBasicType
            {
             before(grammarAccess.getPrimitiveNodeAccess().getTypeBasicTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getPrimitiveNodeAccess().getTypeBasicTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__TypeAssignment_1"


    // $ANTLR start "rule__PrimitiveNode__NameAssignment_2"
    // InternalDataDsl.g:6104:1: rule__PrimitiveNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PrimitiveNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6108:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6109:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6109:2: ( RULE_ID )
            // InternalDataDsl.g:6110:3: RULE_ID
            {
             before(grammarAccess.getPrimitiveNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrimitiveNodeAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__NameAssignment_2"


    // $ANTLR start "rule__PrimitiveNode__CardinalityAssignment_3_1"
    // InternalDataDsl.g:6119:1: rule__PrimitiveNode__CardinalityAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__PrimitiveNode__CardinalityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6123:1: ( ( ruleCardinality ) )
            // InternalDataDsl.g:6124:2: ( ruleCardinality )
            {
            // InternalDataDsl.g:6124:2: ( ruleCardinality )
            // InternalDataDsl.g:6125:3: ruleCardinality
            {
             before(grammarAccess.getPrimitiveNodeAccess().getCardinalityCardinalityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getPrimitiveNodeAccess().getCardinalityCardinalityParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__CardinalityAssignment_3_1"


    // $ANTLR start "rule__PrimitiveNode__OptionsAssignment_4_1"
    // InternalDataDsl.g:6134:1: rule__PrimitiveNode__OptionsAssignment_4_1 : ( ruleOption ) ;
    public final void rule__PrimitiveNode__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6138:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6139:2: ( ruleOption )
            {
            // InternalDataDsl.g:6139:2: ( ruleOption )
            // InternalDataDsl.g:6140:3: ruleOption
            {
             before(grammarAccess.getPrimitiveNodeAccess().getOptionsOptionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getPrimitiveNodeAccess().getOptionsOptionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__OptionsAssignment_4_1"


    // $ANTLR start "rule__PrimitiveNode__OptionsAssignment_4_2_1"
    // InternalDataDsl.g:6149:1: rule__PrimitiveNode__OptionsAssignment_4_2_1 : ( ruleOption ) ;
    public final void rule__PrimitiveNode__OptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6153:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6154:2: ( ruleOption )
            {
            // InternalDataDsl.g:6154:2: ( ruleOption )
            // InternalDataDsl.g:6155:3: ruleOption
            {
             before(grammarAccess.getPrimitiveNodeAccess().getOptionsOptionParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getPrimitiveNodeAccess().getOptionsOptionParserRuleCall_4_2_1_0()); 

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
    // $ANTLR end "rule__PrimitiveNode__OptionsAssignment_4_2_1"


    // $ANTLR start "rule__Cardinality__MinAssignment_0"
    // InternalDataDsl.g:6164:1: rule__Cardinality__MinAssignment_0 : ( RULE_CARDINALITY_SYMBOLS ) ;
    public final void rule__Cardinality__MinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6168:1: ( ( RULE_CARDINALITY_SYMBOLS ) )
            // InternalDataDsl.g:6169:2: ( RULE_CARDINALITY_SYMBOLS )
            {
            // InternalDataDsl.g:6169:2: ( RULE_CARDINALITY_SYMBOLS )
            // InternalDataDsl.g:6170:3: RULE_CARDINALITY_SYMBOLS
            {
             before(grammarAccess.getCardinalityAccess().getMinCARDINALITY_SYMBOLSTerminalRuleCall_0_0()); 
            match(input,RULE_CARDINALITY_SYMBOLS,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getMinCARDINALITY_SYMBOLSTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Cardinality__MinAssignment_0"


    // $ANTLR start "rule__Cardinality__MaxAssignment_1_1"
    // InternalDataDsl.g:6179:1: rule__Cardinality__MaxAssignment_1_1 : ( RULE_CARDINALITY_SYMBOLS ) ;
    public final void rule__Cardinality__MaxAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6183:1: ( ( RULE_CARDINALITY_SYMBOLS ) )
            // InternalDataDsl.g:6184:2: ( RULE_CARDINALITY_SYMBOLS )
            {
            // InternalDataDsl.g:6184:2: ( RULE_CARDINALITY_SYMBOLS )
            // InternalDataDsl.g:6185:3: RULE_CARDINALITY_SYMBOLS
            {
             before(grammarAccess.getCardinalityAccess().getMaxCARDINALITY_SYMBOLSTerminalRuleCall_1_1_0()); 
            match(input,RULE_CARDINALITY_SYMBOLS,FOLLOW_2); 
             after(grammarAccess.getCardinalityAccess().getMaxCARDINALITY_SYMBOLSTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Cardinality__MaxAssignment_1_1"


    // $ANTLR start "rule__DataDescription__FormatAssignment_1"
    // InternalDataDsl.g:6194:1: rule__DataDescription__FormatAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DataDescription__FormatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6198:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6199:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6199:2: ( RULE_STRING )
            // InternalDataDsl.g:6200:3: RULE_STRING
            {
             before(grammarAccess.getDataDescriptionAccess().getFormatSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getFormatSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataDescription__FormatAssignment_1"


    // $ANTLR start "rule__DataDescription__NameAssignment_2"
    // InternalDataDsl.g:6209:1: rule__DataDescription__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataDescription__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6213:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6214:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6214:2: ( RULE_ID )
            // InternalDataDsl.g:6215:3: RULE_ID
            {
             before(grammarAccess.getDataDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataDescriptionAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__DataDescription__NameAssignment_2"


    // $ANTLR start "rule__DataDescription__FragmentsAssignment_3_1"
    // InternalDataDsl.g:6224:1: rule__DataDescription__FragmentsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataDescription__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6228:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6229:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6229:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6230:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentCrossReference_3_1_0()); 
            // InternalDataDsl.g:6231:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6232:4: ruleQualifiedName
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__DataDescription__FragmentsAssignment_3_1"


    // $ANTLR start "rule__DataDescription__FragmentsAssignment_3_2_1"
    // InternalDataDsl.g:6243:1: rule__DataDescription__FragmentsAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataDescription__FragmentsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6247:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6248:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6248:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6249:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentCrossReference_3_2_1_0()); 
            // InternalDataDsl.g:6250:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6251:4: ruleQualifiedName
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentQualifiedNameParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentQualifiedNameParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentCrossReference_3_2_1_0()); 

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
    // $ANTLR end "rule__DataDescription__FragmentsAssignment_3_2_1"


    // $ANTLR start "rule__DataDescription__NodesAssignment_5_0"
    // InternalDataDsl.g:6262:1: rule__DataDescription__NodesAssignment_5_0 : ( ruleNode ) ;
    public final void rule__DataDescription__NodesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6266:1: ( ( ruleNode ) )
            // InternalDataDsl.g:6267:2: ( ruleNode )
            {
            // InternalDataDsl.g:6267:2: ( ruleNode )
            // InternalDataDsl.g:6268:3: ruleNode
            {
             before(grammarAccess.getDataDescriptionAccess().getNodesNodeParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getDataDescriptionAccess().getNodesNodeParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__DataDescription__NodesAssignment_5_0"


    // $ANTLR start "rule__DataDescription__NodesAssignment_5_1"
    // InternalDataDsl.g:6277:1: rule__DataDescription__NodesAssignment_5_1 : ( ruleNode ) ;
    public final void rule__DataDescription__NodesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6281:1: ( ( ruleNode ) )
            // InternalDataDsl.g:6282:2: ( ruleNode )
            {
            // InternalDataDsl.g:6282:2: ( ruleNode )
            // InternalDataDsl.g:6283:3: ruleNode
            {
             before(grammarAccess.getDataDescriptionAccess().getNodesNodeParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getDataDescriptionAccess().getNodesNodeParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__DataDescription__NodesAssignment_5_1"


    // $ANTLR start "rule__DataDescription__OptionsAssignment_7_1"
    // InternalDataDsl.g:6292:1: rule__DataDescription__OptionsAssignment_7_1 : ( ruleDataOption ) ;
    public final void rule__DataDescription__OptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6296:1: ( ( ruleDataOption ) )
            // InternalDataDsl.g:6297:2: ( ruleDataOption )
            {
            // InternalDataDsl.g:6297:2: ( ruleDataOption )
            // InternalDataDsl.g:6298:3: ruleDataOption
            {
             before(grammarAccess.getDataDescriptionAccess().getOptionsDataOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOption();

            state._fsp--;

             after(grammarAccess.getDataDescriptionAccess().getOptionsDataOptionParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__DataDescription__OptionsAssignment_7_1"


    // $ANTLR start "rule__DataDescription__OptionsAssignment_7_2_1"
    // InternalDataDsl.g:6307:1: rule__DataDescription__OptionsAssignment_7_2_1 : ( ruleDataOption ) ;
    public final void rule__DataDescription__OptionsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6311:1: ( ( ruleDataOption ) )
            // InternalDataDsl.g:6312:2: ( ruleDataOption )
            {
            // InternalDataDsl.g:6312:2: ( ruleDataOption )
            // InternalDataDsl.g:6313:3: ruleDataOption
            {
             before(grammarAccess.getDataDescriptionAccess().getOptionsDataOptionParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataOption();

            state._fsp--;

             after(grammarAccess.getDataDescriptionAccess().getOptionsDataOptionParserRuleCall_7_2_1_0()); 

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
    // $ANTLR end "rule__DataDescription__OptionsAssignment_7_2_1"


    // $ANTLR start "rule__Fragment__NameAssignment_1"
    // InternalDataDsl.g:6322:1: rule__Fragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6326:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6327:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6327:2: ( RULE_ID )
            // InternalDataDsl.g:6328:3: RULE_ID
            {
             before(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFragmentAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Fragment__NameAssignment_1"


    // $ANTLR start "rule__Fragment__FragmentsAssignment_2_1"
    // InternalDataDsl.g:6337:1: rule__Fragment__FragmentsAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Fragment__FragmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6341:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6342:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6342:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6343:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFragmentAccess().getFragmentsFragmentCrossReference_2_1_0()); 
            // InternalDataDsl.g:6344:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6345:4: ruleQualifiedName
            {
             before(grammarAccess.getFragmentAccess().getFragmentsFragmentQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getFragmentsFragmentQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getFragmentAccess().getFragmentsFragmentCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Fragment__FragmentsAssignment_2_1"


    // $ANTLR start "rule__Fragment__FragmentsAssignment_2_2_1"
    // InternalDataDsl.g:6356:1: rule__Fragment__FragmentsAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Fragment__FragmentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6360:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6361:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6361:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6362:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFragmentAccess().getFragmentsFragmentCrossReference_2_2_1_0()); 
            // InternalDataDsl.g:6363:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6364:4: ruleQualifiedName
            {
             before(grammarAccess.getFragmentAccess().getFragmentsFragmentQualifiedNameParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getFragmentsFragmentQualifiedNameParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getFragmentAccess().getFragmentsFragmentCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__Fragment__FragmentsAssignment_2_2_1"


    // $ANTLR start "rule__Fragment__NodesAssignment_4"
    // InternalDataDsl.g:6375:1: rule__Fragment__NodesAssignment_4 : ( ruleNode ) ;
    public final void rule__Fragment__NodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6379:1: ( ( ruleNode ) )
            // InternalDataDsl.g:6380:2: ( ruleNode )
            {
            // InternalDataDsl.g:6380:2: ( ruleNode )
            // InternalDataDsl.g:6381:3: ruleNode
            {
             before(grammarAccess.getFragmentAccess().getNodesNodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getNodesNodeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Fragment__NodesAssignment_4"


    // $ANTLR start "rule__Fragment__NodesAssignment_5"
    // InternalDataDsl.g:6390:1: rule__Fragment__NodesAssignment_5 : ( ruleNode ) ;
    public final void rule__Fragment__NodesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6394:1: ( ( ruleNode ) )
            // InternalDataDsl.g:6395:2: ( ruleNode )
            {
            // InternalDataDsl.g:6395:2: ( ruleNode )
            // InternalDataDsl.g:6396:3: ruleNode
            {
             before(grammarAccess.getFragmentAccess().getNodesNodeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getFragmentAccess().getNodesNodeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Fragment__NodesAssignment_5"


    // $ANTLR start "rule__DataTypeRefinement__NameAssignment_1"
    // InternalDataDsl.g:6405:1: rule__DataTypeRefinement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataTypeRefinement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6409:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6410:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6410:2: ( RULE_ID )
            // InternalDataDsl.g:6411:3: RULE_ID
            {
             before(grammarAccess.getDataTypeRefinementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeRefinementAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__NameAssignment_1"


    // $ANTLR start "rule__DataTypeRefinement__RefineAssignment_3"
    // InternalDataDsl.g:6420:1: rule__DataTypeRefinement__RefineAssignment_3 : ( ruleBasicType ) ;
    public final void rule__DataTypeRefinement__RefineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6424:1: ( ( ruleBasicType ) )
            // InternalDataDsl.g:6425:2: ( ruleBasicType )
            {
            // InternalDataDsl.g:6425:2: ( ruleBasicType )
            // InternalDataDsl.g:6426:3: ruleBasicType
            {
             before(grammarAccess.getDataTypeRefinementAccess().getRefineBasicTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicType();

            state._fsp--;

             after(grammarAccess.getDataTypeRefinementAccess().getRefineBasicTypeEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__RefineAssignment_3"


    // $ANTLR start "rule__DataTypeRefinement__SubsequencesAssignment_4_1_0"
    // InternalDataDsl.g:6435:1: rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 : ( ruleSubstringConcept ) ;
    public final void rule__DataTypeRefinement__SubsequencesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6439:1: ( ( ruleSubstringConcept ) )
            // InternalDataDsl.g:6440:2: ( ruleSubstringConcept )
            {
            // InternalDataDsl.g:6440:2: ( ruleSubstringConcept )
            // InternalDataDsl.g:6441:3: ruleSubstringConcept
            {
             before(grammarAccess.getDataTypeRefinementAccess().getSubsequencesSubstringConceptParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubstringConcept();

            state._fsp--;

             after(grammarAccess.getDataTypeRefinementAccess().getSubsequencesSubstringConceptParserRuleCall_4_1_0_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__SubsequencesAssignment_4_1_0"


    // $ANTLR start "rule__DataTypeRefinement__SubsequencesAssignment_4_1_1"
    // InternalDataDsl.g:6450:1: rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 : ( ruleSubstringConcept ) ;
    public final void rule__DataTypeRefinement__SubsequencesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6454:1: ( ( ruleSubstringConcept ) )
            // InternalDataDsl.g:6455:2: ( ruleSubstringConcept )
            {
            // InternalDataDsl.g:6455:2: ( ruleSubstringConcept )
            // InternalDataDsl.g:6456:3: ruleSubstringConcept
            {
             before(grammarAccess.getDataTypeRefinementAccess().getSubsequencesSubstringConceptParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubstringConcept();

            state._fsp--;

             after(grammarAccess.getDataTypeRefinementAccess().getSubsequencesSubstringConceptParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__SubsequencesAssignment_4_1_1"


    // $ANTLR start "rule__DataTypeRefinement__OptionsAssignment_5_1"
    // InternalDataDsl.g:6465:1: rule__DataTypeRefinement__OptionsAssignment_5_1 : ( ruleOption ) ;
    public final void rule__DataTypeRefinement__OptionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6469:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6470:2: ( ruleOption )
            {
            // InternalDataDsl.g:6470:2: ( ruleOption )
            // InternalDataDsl.g:6471:3: ruleOption
            {
             before(grammarAccess.getDataTypeRefinementAccess().getOptionsOptionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataTypeRefinementAccess().getOptionsOptionParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__OptionsAssignment_5_1"


    // $ANTLR start "rule__DataTypeRefinement__OptionsAssignment_5_2_1"
    // InternalDataDsl.g:6480:1: rule__DataTypeRefinement__OptionsAssignment_5_2_1 : ( ruleOption ) ;
    public final void rule__DataTypeRefinement__OptionsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6484:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6485:2: ( ruleOption )
            {
            // InternalDataDsl.g:6485:2: ( ruleOption )
            // InternalDataDsl.g:6486:3: ruleOption
            {
             before(grammarAccess.getDataTypeRefinementAccess().getOptionsOptionParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataTypeRefinementAccess().getOptionsOptionParserRuleCall_5_2_1_0()); 

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
    // $ANTLR end "rule__DataTypeRefinement__OptionsAssignment_5_2_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // InternalDataDsl.g:6495:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6499:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6500:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6500:2: ( RULE_ID )
            // InternalDataDsl.g:6501:3: RULE_ID
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
    // InternalDataDsl.g:6510:1: rule__Enumeration__ValuesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Enumeration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6514:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6515:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6515:2: ( RULE_STRING )
            // InternalDataDsl.g:6516:3: RULE_STRING
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
    // InternalDataDsl.g:6525:1: rule__Enumeration__ValuesAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Enumeration__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6529:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6530:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6530:2: ( RULE_STRING )
            // InternalDataDsl.g:6531:3: RULE_STRING
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


    // $ANTLR start "rule__StringOption__KeyAssignment_0"
    // InternalDataDsl.g:6540:1: rule__StringOption__KeyAssignment_0 : ( ruleStringOptionKey ) ;
    public final void rule__StringOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6544:1: ( ( ruleStringOptionKey ) )
            // InternalDataDsl.g:6545:2: ( ruleStringOptionKey )
            {
            // InternalDataDsl.g:6545:2: ( ruleStringOptionKey )
            // InternalDataDsl.g:6546:3: ruleStringOptionKey
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
    // InternalDataDsl.g:6555:1: rule__StringOption__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6559:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6560:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6560:2: ( RULE_STRING )
            // InternalDataDsl.g:6561:3: RULE_STRING
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
    // InternalDataDsl.g:6570:1: rule__IntOption__KeyAssignment_0 : ( ruleIntOptionKey ) ;
    public final void rule__IntOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6574:1: ( ( ruleIntOptionKey ) )
            // InternalDataDsl.g:6575:2: ( ruleIntOptionKey )
            {
            // InternalDataDsl.g:6575:2: ( ruleIntOptionKey )
            // InternalDataDsl.g:6576:3: ruleIntOptionKey
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
    // InternalDataDsl.g:6585:1: rule__IntOption__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6589:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:6590:2: ( RULE_INT )
            {
            // InternalDataDsl.g:6590:2: ( RULE_INT )
            // InternalDataDsl.g:6591:3: RULE_INT
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
    // InternalDataDsl.g:6600:1: rule__DoubleOption__KeyAssignment_0 : ( ruleDoubleOptionKey ) ;
    public final void rule__DoubleOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6604:1: ( ( ruleDoubleOptionKey ) )
            // InternalDataDsl.g:6605:2: ( ruleDoubleOptionKey )
            {
            // InternalDataDsl.g:6605:2: ( ruleDoubleOptionKey )
            // InternalDataDsl.g:6606:3: ruleDoubleOptionKey
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
    // InternalDataDsl.g:6615:1: rule__DoubleOption__ValueAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__DoubleOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6619:1: ( ( RULE_DOUBLE ) )
            // InternalDataDsl.g:6620:2: ( RULE_DOUBLE )
            {
            // InternalDataDsl.g:6620:2: ( RULE_DOUBLE )
            // InternalDataDsl.g:6621:3: RULE_DOUBLE
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
    // InternalDataDsl.g:6630:1: rule__BooleanOption__KeyAssignment_0 : ( ruleBooleanOptionKey ) ;
    public final void rule__BooleanOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6634:1: ( ( ruleBooleanOptionKey ) )
            // InternalDataDsl.g:6635:2: ( ruleBooleanOptionKey )
            {
            // InternalDataDsl.g:6635:2: ( ruleBooleanOptionKey )
            // InternalDataDsl.g:6636:3: ruleBooleanOptionKey
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
    // InternalDataDsl.g:6645:1: rule__BooleanOption__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6649:1: ( ( RULE_BOOLEAN ) )
            // InternalDataDsl.g:6650:2: ( RULE_BOOLEAN )
            {
            // InternalDataDsl.g:6650:2: ( RULE_BOOLEAN )
            // InternalDataDsl.g:6651:3: RULE_BOOLEAN
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


    // $ANTLR start "rule__ListQualifiedNameOption__KeyAssignment_0"
    // InternalDataDsl.g:6660:1: rule__ListQualifiedNameOption__KeyAssignment_0 : ( ruleListQualifiedNameOptionKey ) ;
    public final void rule__ListQualifiedNameOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6664:1: ( ( ruleListQualifiedNameOptionKey ) )
            // InternalDataDsl.g:6665:2: ( ruleListQualifiedNameOptionKey )
            {
            // InternalDataDsl.g:6665:2: ( ruleListQualifiedNameOptionKey )
            // InternalDataDsl.g:6666:3: ruleListQualifiedNameOptionKey
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getKeyListQualifiedNameOptionKeyEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleListQualifiedNameOptionKey();

            state._fsp--;

             after(grammarAccess.getListQualifiedNameOptionAccess().getKeyListQualifiedNameOptionKeyEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__ListQualifiedNameOption__KeyAssignment_0"


    // $ANTLR start "rule__ListQualifiedNameOption__FragmentsAssignment_2"
    // InternalDataDsl.g:6675:1: rule__ListQualifiedNameOption__FragmentsAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ListQualifiedNameOption__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6679:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6680:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6680:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6681:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getFragmentsNodeCrossReference_2_0()); 
            // InternalDataDsl.g:6682:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6683:4: ruleQualifiedName
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getFragmentsNodeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getListQualifiedNameOptionAccess().getFragmentsNodeQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getListQualifiedNameOptionAccess().getFragmentsNodeCrossReference_2_0()); 

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
    // $ANTLR end "rule__ListQualifiedNameOption__FragmentsAssignment_2"


    // $ANTLR start "rule__DataOption__KeyAssignment_0"
    // InternalDataDsl.g:6694:1: rule__DataOption__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6698:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6699:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6699:2: ( RULE_STRING )
            // InternalDataDsl.g:6700:3: RULE_STRING
            {
             before(grammarAccess.getDataOptionAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataOptionAccess().getKeySTRINGTerminalRuleCall_0_0()); 

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
    // InternalDataDsl.g:6709:1: rule__DataOption__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__DataOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6713:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6714:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6714:2: ( RULE_STRING )
            // InternalDataDsl.g:6715:3: RULE_STRING
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x2000000000000000L,0x0000000000003A09L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x2000000000000002L,0x0000000000003A09L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000009L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2000000000000000L,0x0000000000003A0DL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x1FFFF80000008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000007FFFFC00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000402L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x800007FFFFC00010L,0x0000000000018004L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x800007FFFFC00010L,0x0000000000018000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x800007FFFFC00012L,0x0000000000018000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000082L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000003F0000L,0x0000000000000004L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000003F0000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000003F0002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000200L});

}