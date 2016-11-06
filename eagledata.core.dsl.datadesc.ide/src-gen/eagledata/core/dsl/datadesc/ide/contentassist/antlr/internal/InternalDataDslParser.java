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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_CARDINALITY_SYMBOLS", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'order'", "'char'", "'digit'", "'anycase_string'", "'lowercase_string'", "'uppercase_string'", "'digits'", "'String'", "'Url'", "'Int'", "'LongInt'", "'Real'", "'Date'", "'Time'", "'Year'", "'Month'", "'Day'", "'Boolean'", "'Lat'", "'Long'", "'Percent'", "'Email'", "'Currency'", "'CreditCard'", "'IBAN'", "'ISBN'", "'ISSN'", "'Inet'", "'null'", "'separator'", "'default'", "'regex'", "'flags'", "'decimalchar'", "'pattern'", "'format'", "'minLength'", "'maxLength'", "'min'", "'max'", "'defaultvalue'", "'minDouble'", "'maxDouble'", "'defaultvalueDouble'", "'nullable'", "'casesensitive'", "'import'", "'.*'", "'.'", "'package'", "'{'", "'}'", "'@'", "'['", "','", "']'", "'('", "')'", "'description'", "':'", "'fragment'", "'feed'", "'datatype'", "'enumeration'", "'='", "'key'", "'unique'"
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
    public static final int RULE_ML_COMMENT=10;
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
    public static final int RULE_SL_COMMENT=11;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
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


    // $ANTLR start "entryRuleFeed"
    // InternalDataDsl.g:553:1: entryRuleFeed : ruleFeed EOF ;
    public final void entryRuleFeed() throws RecognitionException {
        try {
            // InternalDataDsl.g:554:1: ( ruleFeed EOF )
            // InternalDataDsl.g:555:1: ruleFeed EOF
            {
             before(grammarAccess.getFeedRule()); 
            pushFollow(FOLLOW_1);
            ruleFeed();

            state._fsp--;

             after(grammarAccess.getFeedRule()); 
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
    // $ANTLR end "entryRuleFeed"


    // $ANTLR start "ruleFeed"
    // InternalDataDsl.g:562:1: ruleFeed : ( ( rule__Feed__Group__0 ) ) ;
    public final void ruleFeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:566:2: ( ( ( rule__Feed__Group__0 ) ) )
            // InternalDataDsl.g:567:2: ( ( rule__Feed__Group__0 ) )
            {
            // InternalDataDsl.g:567:2: ( ( rule__Feed__Group__0 ) )
            // InternalDataDsl.g:568:3: ( rule__Feed__Group__0 )
            {
             before(grammarAccess.getFeedAccess().getGroup()); 
            // InternalDataDsl.g:569:3: ( rule__Feed__Group__0 )
            // InternalDataDsl.g:569:4: rule__Feed__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeed"


    // $ANTLR start "entryRuleDataTypeRefinement"
    // InternalDataDsl.g:578:1: entryRuleDataTypeRefinement : ruleDataTypeRefinement EOF ;
    public final void entryRuleDataTypeRefinement() throws RecognitionException {
        try {
            // InternalDataDsl.g:579:1: ( ruleDataTypeRefinement EOF )
            // InternalDataDsl.g:580:1: ruleDataTypeRefinement EOF
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
    // InternalDataDsl.g:587:1: ruleDataTypeRefinement : ( ( rule__DataTypeRefinement__Group__0 ) ) ;
    public final void ruleDataTypeRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:591:2: ( ( ( rule__DataTypeRefinement__Group__0 ) ) )
            // InternalDataDsl.g:592:2: ( ( rule__DataTypeRefinement__Group__0 ) )
            {
            // InternalDataDsl.g:592:2: ( ( rule__DataTypeRefinement__Group__0 ) )
            // InternalDataDsl.g:593:3: ( rule__DataTypeRefinement__Group__0 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup()); 
            // InternalDataDsl.g:594:3: ( rule__DataTypeRefinement__Group__0 )
            // InternalDataDsl.g:594:4: rule__DataTypeRefinement__Group__0
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
    // InternalDataDsl.g:603:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalDataDsl.g:604:1: ( ruleEnumeration EOF )
            // InternalDataDsl.g:605:1: ruleEnumeration EOF
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
    // InternalDataDsl.g:612:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:616:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalDataDsl.g:617:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalDataDsl.g:617:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalDataDsl.g:618:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalDataDsl.g:619:3: ( rule__Enumeration__Group__0 )
            // InternalDataDsl.g:619:4: rule__Enumeration__Group__0
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
    // InternalDataDsl.g:628:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:629:1: ( ruleOption EOF )
            // InternalDataDsl.g:630:1: ruleOption EOF
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
    // InternalDataDsl.g:637:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:641:2: ( ( ( rule__Option__Alternatives ) ) )
            // InternalDataDsl.g:642:2: ( ( rule__Option__Alternatives ) )
            {
            // InternalDataDsl.g:642:2: ( ( rule__Option__Alternatives ) )
            // InternalDataDsl.g:643:3: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // InternalDataDsl.g:644:3: ( rule__Option__Alternatives )
            // InternalDataDsl.g:644:4: rule__Option__Alternatives
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
    // InternalDataDsl.g:653:1: entryRuleStringOption : ruleStringOption EOF ;
    public final void entryRuleStringOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:654:1: ( ruleStringOption EOF )
            // InternalDataDsl.g:655:1: ruleStringOption EOF
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
    // InternalDataDsl.g:662:1: ruleStringOption : ( ( rule__StringOption__Group__0 ) ) ;
    public final void ruleStringOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:666:2: ( ( ( rule__StringOption__Group__0 ) ) )
            // InternalDataDsl.g:667:2: ( ( rule__StringOption__Group__0 ) )
            {
            // InternalDataDsl.g:667:2: ( ( rule__StringOption__Group__0 ) )
            // InternalDataDsl.g:668:3: ( rule__StringOption__Group__0 )
            {
             before(grammarAccess.getStringOptionAccess().getGroup()); 
            // InternalDataDsl.g:669:3: ( rule__StringOption__Group__0 )
            // InternalDataDsl.g:669:4: rule__StringOption__Group__0
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
    // InternalDataDsl.g:678:1: entryRuleIntOption : ruleIntOption EOF ;
    public final void entryRuleIntOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:679:1: ( ruleIntOption EOF )
            // InternalDataDsl.g:680:1: ruleIntOption EOF
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
    // InternalDataDsl.g:687:1: ruleIntOption : ( ( rule__IntOption__Group__0 ) ) ;
    public final void ruleIntOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:691:2: ( ( ( rule__IntOption__Group__0 ) ) )
            // InternalDataDsl.g:692:2: ( ( rule__IntOption__Group__0 ) )
            {
            // InternalDataDsl.g:692:2: ( ( rule__IntOption__Group__0 ) )
            // InternalDataDsl.g:693:3: ( rule__IntOption__Group__0 )
            {
             before(grammarAccess.getIntOptionAccess().getGroup()); 
            // InternalDataDsl.g:694:3: ( rule__IntOption__Group__0 )
            // InternalDataDsl.g:694:4: rule__IntOption__Group__0
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
    // InternalDataDsl.g:703:1: entryRuleDoubleOption : ruleDoubleOption EOF ;
    public final void entryRuleDoubleOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:704:1: ( ruleDoubleOption EOF )
            // InternalDataDsl.g:705:1: ruleDoubleOption EOF
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
    // InternalDataDsl.g:712:1: ruleDoubleOption : ( ( rule__DoubleOption__Group__0 ) ) ;
    public final void ruleDoubleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:716:2: ( ( ( rule__DoubleOption__Group__0 ) ) )
            // InternalDataDsl.g:717:2: ( ( rule__DoubleOption__Group__0 ) )
            {
            // InternalDataDsl.g:717:2: ( ( rule__DoubleOption__Group__0 ) )
            // InternalDataDsl.g:718:3: ( rule__DoubleOption__Group__0 )
            {
             before(grammarAccess.getDoubleOptionAccess().getGroup()); 
            // InternalDataDsl.g:719:3: ( rule__DoubleOption__Group__0 )
            // InternalDataDsl.g:719:4: rule__DoubleOption__Group__0
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
    // InternalDataDsl.g:728:1: entryRuleBooleanOption : ruleBooleanOption EOF ;
    public final void entryRuleBooleanOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:729:1: ( ruleBooleanOption EOF )
            // InternalDataDsl.g:730:1: ruleBooleanOption EOF
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
    // InternalDataDsl.g:737:1: ruleBooleanOption : ( ( rule__BooleanOption__Group__0 ) ) ;
    public final void ruleBooleanOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:741:2: ( ( ( rule__BooleanOption__Group__0 ) ) )
            // InternalDataDsl.g:742:2: ( ( rule__BooleanOption__Group__0 ) )
            {
            // InternalDataDsl.g:742:2: ( ( rule__BooleanOption__Group__0 ) )
            // InternalDataDsl.g:743:3: ( rule__BooleanOption__Group__0 )
            {
             before(grammarAccess.getBooleanOptionAccess().getGroup()); 
            // InternalDataDsl.g:744:3: ( rule__BooleanOption__Group__0 )
            // InternalDataDsl.g:744:4: rule__BooleanOption__Group__0
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
    // InternalDataDsl.g:753:1: entryRuleListQualifiedNameOption : ruleListQualifiedNameOption EOF ;
    public final void entryRuleListQualifiedNameOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:754:1: ( ruleListQualifiedNameOption EOF )
            // InternalDataDsl.g:755:1: ruleListQualifiedNameOption EOF
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
    // InternalDataDsl.g:762:1: ruleListQualifiedNameOption : ( ( rule__ListQualifiedNameOption__Group__0 ) ) ;
    public final void ruleListQualifiedNameOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:766:2: ( ( ( rule__ListQualifiedNameOption__Group__0 ) ) )
            // InternalDataDsl.g:767:2: ( ( rule__ListQualifiedNameOption__Group__0 ) )
            {
            // InternalDataDsl.g:767:2: ( ( rule__ListQualifiedNameOption__Group__0 ) )
            // InternalDataDsl.g:768:3: ( rule__ListQualifiedNameOption__Group__0 )
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getGroup()); 
            // InternalDataDsl.g:769:3: ( rule__ListQualifiedNameOption__Group__0 )
            // InternalDataDsl.g:769:4: rule__ListQualifiedNameOption__Group__0
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
            match(input,14,FOLLOW_2); 

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
            case 60:
                {
                alt1=1;
                }
                break;
            case 63:
            case 66:
                {
                alt1=2;
                }
                break;
            case 72:
            case 74:
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
            else if ( (LA2_0==72||(LA2_0>=74 && LA2_0<=75)) ) {
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
    // InternalDataDsl.g:974:1: rule__AbstractDescription__Alternatives : ( ( ruleDataDescription ) | ( ruleFragment ) | ( ruleFeed ) );
    public final void rule__AbstractDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:978:1: ( ( ruleDataDescription ) | ( ruleFragment ) | ( ruleFeed ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt4=1;
                }
                break;
            case 74:
                {
                alt4=2;
                }
                break;
            case 75:
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
                case 3 :
                    // InternalDataDsl.g:991:2: ( ruleFeed )
                    {
                    // InternalDataDsl.g:991:2: ( ruleFeed )
                    // InternalDataDsl.g:992:3: ruleFeed
                    {
                     before(grammarAccess.getAbstractDescriptionAccess().getFeedParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleFeed();

                    state._fsp--;

                     after(grammarAccess.getAbstractDescriptionAccess().getFeedParserRuleCall_2()); 

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
    // InternalDataDsl.g:1001:1: rule__SubstringConcept__Alternatives : ( ( ruleCharacter ) | ( ruleSubstring ) );
    public final void rule__SubstringConcept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1005:1: ( ( ruleCharacter ) | ( ruleSubstring ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=15 && LA5_0<=16)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=17 && LA5_0<=20)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataDsl.g:1006:2: ( ruleCharacter )
                    {
                    // InternalDataDsl.g:1006:2: ( ruleCharacter )
                    // InternalDataDsl.g:1007:3: ruleCharacter
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
                    // InternalDataDsl.g:1012:2: ( ruleSubstring )
                    {
                    // InternalDataDsl.g:1012:2: ( ruleSubstring )
                    // InternalDataDsl.g:1013:3: ruleSubstring
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
    // InternalDataDsl.g:1022:1: rule__Node__Alternatives : ( ( rulePrimitiveNode ) | ( ruleCompositeNode ) | ( ruleFragmentNode ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1026:1: ( ( rulePrimitiveNode ) | ( ruleCompositeNode ) | ( ruleFragmentNode ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    alt6=2;
                }
                else if ( ((LA6_1>=21 && LA6_1<=41)) ) {
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
                else if ( ((LA6_2>=21 && LA6_2<=41)) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
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
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 62:
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
                    // InternalDataDsl.g:1027:2: ( rulePrimitiveNode )
                    {
                    // InternalDataDsl.g:1027:2: ( rulePrimitiveNode )
                    // InternalDataDsl.g:1028:3: rulePrimitiveNode
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
                    // InternalDataDsl.g:1033:2: ( ruleCompositeNode )
                    {
                    // InternalDataDsl.g:1033:2: ( ruleCompositeNode )
                    // InternalDataDsl.g:1034:3: ruleCompositeNode
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
                    // InternalDataDsl.g:1039:2: ( ruleFragmentNode )
                    {
                    // InternalDataDsl.g:1039:2: ( ruleFragmentNode )
                    // InternalDataDsl.g:1040:3: ruleFragmentNode
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
    // InternalDataDsl.g:1049:1: rule__CompositeNode__Alternatives_0 : ( ( ( rule__CompositeNode__KeyAssignment_0_0 ) ) | ( ( rule__CompositeNode__UniqueAssignment_0_1 ) ) );
    public final void rule__CompositeNode__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1053:1: ( ( ( rule__CompositeNode__KeyAssignment_0_0 ) ) | ( ( rule__CompositeNode__UniqueAssignment_0_1 ) ) )
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
                    // InternalDataDsl.g:1054:2: ( ( rule__CompositeNode__KeyAssignment_0_0 ) )
                    {
                    // InternalDataDsl.g:1054:2: ( ( rule__CompositeNode__KeyAssignment_0_0 ) )
                    // InternalDataDsl.g:1055:3: ( rule__CompositeNode__KeyAssignment_0_0 )
                    {
                     before(grammarAccess.getCompositeNodeAccess().getKeyAssignment_0_0()); 
                    // InternalDataDsl.g:1056:3: ( rule__CompositeNode__KeyAssignment_0_0 )
                    // InternalDataDsl.g:1056:4: rule__CompositeNode__KeyAssignment_0_0
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
                    // InternalDataDsl.g:1060:2: ( ( rule__CompositeNode__UniqueAssignment_0_1 ) )
                    {
                    // InternalDataDsl.g:1060:2: ( ( rule__CompositeNode__UniqueAssignment_0_1 ) )
                    // InternalDataDsl.g:1061:3: ( rule__CompositeNode__UniqueAssignment_0_1 )
                    {
                     before(grammarAccess.getCompositeNodeAccess().getUniqueAssignment_0_1()); 
                    // InternalDataDsl.g:1062:3: ( rule__CompositeNode__UniqueAssignment_0_1 )
                    // InternalDataDsl.g:1062:4: rule__CompositeNode__UniqueAssignment_0_1
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
    // InternalDataDsl.g:1070:1: rule__PrimitiveNode__Alternatives_0 : ( ( ( rule__PrimitiveNode__KeyAssignment_0_0 ) ) | ( ( rule__PrimitiveNode__UniqueAssignment_0_1 ) ) );
    public final void rule__PrimitiveNode__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1074:1: ( ( ( rule__PrimitiveNode__KeyAssignment_0_0 ) ) | ( ( rule__PrimitiveNode__UniqueAssignment_0_1 ) ) )
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
                    // InternalDataDsl.g:1075:2: ( ( rule__PrimitiveNode__KeyAssignment_0_0 ) )
                    {
                    // InternalDataDsl.g:1075:2: ( ( rule__PrimitiveNode__KeyAssignment_0_0 ) )
                    // InternalDataDsl.g:1076:3: ( rule__PrimitiveNode__KeyAssignment_0_0 )
                    {
                     before(grammarAccess.getPrimitiveNodeAccess().getKeyAssignment_0_0()); 
                    // InternalDataDsl.g:1077:3: ( rule__PrimitiveNode__KeyAssignment_0_0 )
                    // InternalDataDsl.g:1077:4: rule__PrimitiveNode__KeyAssignment_0_0
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
                    // InternalDataDsl.g:1081:2: ( ( rule__PrimitiveNode__UniqueAssignment_0_1 ) )
                    {
                    // InternalDataDsl.g:1081:2: ( ( rule__PrimitiveNode__UniqueAssignment_0_1 ) )
                    // InternalDataDsl.g:1082:3: ( rule__PrimitiveNode__UniqueAssignment_0_1 )
                    {
                     before(grammarAccess.getPrimitiveNodeAccess().getUniqueAssignment_0_1()); 
                    // InternalDataDsl.g:1083:3: ( rule__PrimitiveNode__UniqueAssignment_0_1 )
                    // InternalDataDsl.g:1083:4: rule__PrimitiveNode__UniqueAssignment_0_1
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
    // InternalDataDsl.g:1091:1: rule__Option__Alternatives : ( ( ruleStringOption ) | ( ruleIntOption ) | ( ruleBooleanOption ) | ( ruleDoubleOption ) | ( ruleListQualifiedNameOption ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1095:1: ( ( ruleStringOption ) | ( ruleIntOption ) | ( ruleBooleanOption ) | ( ruleDoubleOption ) | ( ruleListQualifiedNameOption ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt9=1;
                }
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                {
                alt9=2;
                }
                break;
            case 58:
            case 59:
                {
                alt9=3;
                }
                break;
            case 55:
            case 56:
            case 57:
                {
                alt9=4;
                }
                break;
            case 14:
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
                    // InternalDataDsl.g:1096:2: ( ruleStringOption )
                    {
                    // InternalDataDsl.g:1096:2: ( ruleStringOption )
                    // InternalDataDsl.g:1097:3: ruleStringOption
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
                    // InternalDataDsl.g:1102:2: ( ruleIntOption )
                    {
                    // InternalDataDsl.g:1102:2: ( ruleIntOption )
                    // InternalDataDsl.g:1103:3: ruleIntOption
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
                    // InternalDataDsl.g:1108:2: ( ruleBooleanOption )
                    {
                    // InternalDataDsl.g:1108:2: ( ruleBooleanOption )
                    // InternalDataDsl.g:1109:3: ruleBooleanOption
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
                    // InternalDataDsl.g:1114:2: ( ruleDoubleOption )
                    {
                    // InternalDataDsl.g:1114:2: ( ruleDoubleOption )
                    // InternalDataDsl.g:1115:3: ruleDoubleOption
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
                    // InternalDataDsl.g:1120:2: ( ruleListQualifiedNameOption )
                    {
                    // InternalDataDsl.g:1120:2: ( ruleListQualifiedNameOption )
                    // InternalDataDsl.g:1121:3: ruleListQualifiedNameOption
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
    // InternalDataDsl.g:1130:1: rule__TypeCharacter__Alternatives : ( ( ( 'char' ) ) | ( ( 'digit' ) ) );
    public final void rule__TypeCharacter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1134:1: ( ( ( 'char' ) ) | ( ( 'digit' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==15) ) {
                alt10=1;
            }
            else if ( (LA10_0==16) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataDsl.g:1135:2: ( ( 'char' ) )
                    {
                    // InternalDataDsl.g:1135:2: ( ( 'char' ) )
                    // InternalDataDsl.g:1136:3: ( 'char' )
                    {
                     before(grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1137:3: ( 'char' )
                    // InternalDataDsl.g:1137:4: 'char'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeCharacterAccess().getCharEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1141:2: ( ( 'digit' ) )
                    {
                    // InternalDataDsl.g:1141:2: ( ( 'digit' ) )
                    // InternalDataDsl.g:1142:3: ( 'digit' )
                    {
                     before(grammarAccess.getTypeCharacterAccess().getDigitEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1143:3: ( 'digit' )
                    // InternalDataDsl.g:1143:4: 'digit'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalDataDsl.g:1151:1: rule__TypeString__Alternatives : ( ( ( 'anycase_string' ) ) | ( ( 'lowercase_string' ) ) | ( ( 'uppercase_string' ) ) | ( ( 'digits' ) ) );
    public final void rule__TypeString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1155:1: ( ( ( 'anycase_string' ) ) | ( ( 'lowercase_string' ) ) | ( ( 'uppercase_string' ) ) | ( ( 'digits' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt11=1;
                }
                break;
            case 18:
                {
                alt11=2;
                }
                break;
            case 19:
                {
                alt11=3;
                }
                break;
            case 20:
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
                    // InternalDataDsl.g:1156:2: ( ( 'anycase_string' ) )
                    {
                    // InternalDataDsl.g:1156:2: ( ( 'anycase_string' ) )
                    // InternalDataDsl.g:1157:3: ( 'anycase_string' )
                    {
                     before(grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1158:3: ( 'anycase_string' )
                    // InternalDataDsl.g:1158:4: 'anycase_string'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getAnycaseEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1162:2: ( ( 'lowercase_string' ) )
                    {
                    // InternalDataDsl.g:1162:2: ( ( 'lowercase_string' ) )
                    // InternalDataDsl.g:1163:3: ( 'lowercase_string' )
                    {
                     before(grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1164:3: ( 'lowercase_string' )
                    // InternalDataDsl.g:1164:4: 'lowercase_string'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getLowercaseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1168:2: ( ( 'uppercase_string' ) )
                    {
                    // InternalDataDsl.g:1168:2: ( ( 'uppercase_string' ) )
                    // InternalDataDsl.g:1169:3: ( 'uppercase_string' )
                    {
                     before(grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1170:3: ( 'uppercase_string' )
                    // InternalDataDsl.g:1170:4: 'uppercase_string'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeStringAccess().getUppercaseEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1174:2: ( ( 'digits' ) )
                    {
                    // InternalDataDsl.g:1174:2: ( ( 'digits' ) )
                    // InternalDataDsl.g:1175:3: ( 'digits' )
                    {
                     before(grammarAccess.getTypeStringAccess().getNumbersEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1176:3: ( 'digits' )
                    // InternalDataDsl.g:1176:4: 'digits'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalDataDsl.g:1184:1: rule__BasicType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Url' ) ) | ( ( 'Int' ) ) | ( ( 'LongInt' ) ) | ( ( 'Real' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Year' ) ) | ( ( 'Month' ) ) | ( ( 'Day' ) ) | ( ( 'Boolean' ) ) | ( ( 'Lat' ) ) | ( ( 'Long' ) ) | ( ( 'Percent' ) ) | ( ( 'Email' ) ) | ( ( 'Currency' ) ) | ( ( 'CreditCard' ) ) | ( ( 'IBAN' ) ) | ( ( 'ISBN' ) ) | ( ( 'ISSN' ) ) | ( ( 'Inet' ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1188:1: ( ( ( 'String' ) ) | ( ( 'Url' ) ) | ( ( 'Int' ) ) | ( ( 'LongInt' ) ) | ( ( 'Real' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Year' ) ) | ( ( 'Month' ) ) | ( ( 'Day' ) ) | ( ( 'Boolean' ) ) | ( ( 'Lat' ) ) | ( ( 'Long' ) ) | ( ( 'Percent' ) ) | ( ( 'Email' ) ) | ( ( 'Currency' ) ) | ( ( 'CreditCard' ) ) | ( ( 'IBAN' ) ) | ( ( 'ISBN' ) ) | ( ( 'ISSN' ) ) | ( ( 'Inet' ) ) )
            int alt12=21;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt12=1;
                }
                break;
            case 22:
                {
                alt12=2;
                }
                break;
            case 23:
                {
                alt12=3;
                }
                break;
            case 24:
                {
                alt12=4;
                }
                break;
            case 25:
                {
                alt12=5;
                }
                break;
            case 26:
                {
                alt12=6;
                }
                break;
            case 27:
                {
                alt12=7;
                }
                break;
            case 28:
                {
                alt12=8;
                }
                break;
            case 29:
                {
                alt12=9;
                }
                break;
            case 30:
                {
                alt12=10;
                }
                break;
            case 31:
                {
                alt12=11;
                }
                break;
            case 32:
                {
                alt12=12;
                }
                break;
            case 33:
                {
                alt12=13;
                }
                break;
            case 34:
                {
                alt12=14;
                }
                break;
            case 35:
                {
                alt12=15;
                }
                break;
            case 36:
                {
                alt12=16;
                }
                break;
            case 37:
                {
                alt12=17;
                }
                break;
            case 38:
                {
                alt12=18;
                }
                break;
            case 39:
                {
                alt12=19;
                }
                break;
            case 40:
                {
                alt12=20;
                }
                break;
            case 41:
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
                    // InternalDataDsl.g:1189:2: ( ( 'String' ) )
                    {
                    // InternalDataDsl.g:1189:2: ( ( 'String' ) )
                    // InternalDataDsl.g:1190:3: ( 'String' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1191:3: ( 'String' )
                    // InternalDataDsl.g:1191:4: 'String'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1195:2: ( ( 'Url' ) )
                    {
                    // InternalDataDsl.g:1195:2: ( ( 'Url' ) )
                    // InternalDataDsl.g:1196:3: ( 'Url' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1197:3: ( 'Url' )
                    // InternalDataDsl.g:1197:4: 'Url'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getUrlEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1201:2: ( ( 'Int' ) )
                    {
                    // InternalDataDsl.g:1201:2: ( ( 'Int' ) )
                    // InternalDataDsl.g:1202:3: ( 'Int' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1203:3: ( 'Int' )
                    // InternalDataDsl.g:1203:4: 'Int'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1207:2: ( ( 'LongInt' ) )
                    {
                    // InternalDataDsl.g:1207:2: ( ( 'LongInt' ) )
                    // InternalDataDsl.g:1208:3: ( 'LongInt' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongIntEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1209:3: ( 'LongInt' )
                    // InternalDataDsl.g:1209:4: 'LongInt'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLongIntEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1213:2: ( ( 'Real' ) )
                    {
                    // InternalDataDsl.g:1213:2: ( ( 'Real' ) )
                    // InternalDataDsl.g:1214:3: ( 'Real' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:1215:3: ( 'Real' )
                    // InternalDataDsl.g:1215:4: 'Real'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:1219:2: ( ( 'Date' ) )
                    {
                    // InternalDataDsl.g:1219:2: ( ( 'Date' ) )
                    // InternalDataDsl.g:1220:3: ( 'Date' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:1221:3: ( 'Date' )
                    // InternalDataDsl.g:1221:4: 'Date'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:1225:2: ( ( 'Time' ) )
                    {
                    // InternalDataDsl.g:1225:2: ( ( 'Time' ) )
                    // InternalDataDsl.g:1226:3: ( 'Time' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:1227:3: ( 'Time' )
                    // InternalDataDsl.g:1227:4: 'Time'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:1231:2: ( ( 'Year' ) )
                    {
                    // InternalDataDsl.g:1231:2: ( ( 'Year' ) )
                    // InternalDataDsl.g:1232:3: ( 'Year' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:1233:3: ( 'Year' )
                    // InternalDataDsl.g:1233:4: 'Year'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:1237:2: ( ( 'Month' ) )
                    {
                    // InternalDataDsl.g:1237:2: ( ( 'Month' ) )
                    // InternalDataDsl.g:1238:3: ( 'Month' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_8()); 
                    // InternalDataDsl.g:1239:3: ( 'Month' )
                    // InternalDataDsl.g:1239:4: 'Month'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:1243:2: ( ( 'Day' ) )
                    {
                    // InternalDataDsl.g:1243:2: ( ( 'Day' ) )
                    // InternalDataDsl.g:1244:3: ( 'Day' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_9()); 
                    // InternalDataDsl.g:1245:3: ( 'Day' )
                    // InternalDataDsl.g:1245:4: 'Day'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:1249:2: ( ( 'Boolean' ) )
                    {
                    // InternalDataDsl.g:1249:2: ( ( 'Boolean' ) )
                    // InternalDataDsl.g:1250:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_10()); 
                    // InternalDataDsl.g:1251:3: ( 'Boolean' )
                    // InternalDataDsl.g:1251:4: 'Boolean'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDsl.g:1255:2: ( ( 'Lat' ) )
                    {
                    // InternalDataDsl.g:1255:2: ( ( 'Lat' ) )
                    // InternalDataDsl.g:1256:3: ( 'Lat' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_11()); 
                    // InternalDataDsl.g:1257:3: ( 'Lat' )
                    // InternalDataDsl.g:1257:4: 'Lat'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDataDsl.g:1261:2: ( ( 'Long' ) )
                    {
                    // InternalDataDsl.g:1261:2: ( ( 'Long' ) )
                    // InternalDataDsl.g:1262:3: ( 'Long' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_12()); 
                    // InternalDataDsl.g:1263:3: ( 'Long' )
                    // InternalDataDsl.g:1263:4: 'Long'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDataDsl.g:1267:2: ( ( 'Percent' ) )
                    {
                    // InternalDataDsl.g:1267:2: ( ( 'Percent' ) )
                    // InternalDataDsl.g:1268:3: ( 'Percent' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getPercentEnumLiteralDeclaration_13()); 
                    // InternalDataDsl.g:1269:3: ( 'Percent' )
                    // InternalDataDsl.g:1269:4: 'Percent'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getPercentEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDataDsl.g:1273:2: ( ( 'Email' ) )
                    {
                    // InternalDataDsl.g:1273:2: ( ( 'Email' ) )
                    // InternalDataDsl.g:1274:3: ( 'Email' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getEmailEnumLiteralDeclaration_14()); 
                    // InternalDataDsl.g:1275:3: ( 'Email' )
                    // InternalDataDsl.g:1275:4: 'Email'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getEmailEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDataDsl.g:1279:2: ( ( 'Currency' ) )
                    {
                    // InternalDataDsl.g:1279:2: ( ( 'Currency' ) )
                    // InternalDataDsl.g:1280:3: ( 'Currency' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getCurrencyEnumLiteralDeclaration_15()); 
                    // InternalDataDsl.g:1281:3: ( 'Currency' )
                    // InternalDataDsl.g:1281:4: 'Currency'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getCurrencyEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDataDsl.g:1285:2: ( ( 'CreditCard' ) )
                    {
                    // InternalDataDsl.g:1285:2: ( ( 'CreditCard' ) )
                    // InternalDataDsl.g:1286:3: ( 'CreditCard' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getCreditcardEnumLiteralDeclaration_16()); 
                    // InternalDataDsl.g:1287:3: ( 'CreditCard' )
                    // InternalDataDsl.g:1287:4: 'CreditCard'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getCreditcardEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDataDsl.g:1291:2: ( ( 'IBAN' ) )
                    {
                    // InternalDataDsl.g:1291:2: ( ( 'IBAN' ) )
                    // InternalDataDsl.g:1292:3: ( 'IBAN' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getIBANEnumLiteralDeclaration_17()); 
                    // InternalDataDsl.g:1293:3: ( 'IBAN' )
                    // InternalDataDsl.g:1293:4: 'IBAN'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getIBANEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // InternalDataDsl.g:1297:2: ( ( 'ISBN' ) )
                    {
                    // InternalDataDsl.g:1297:2: ( ( 'ISBN' ) )
                    // InternalDataDsl.g:1298:3: ( 'ISBN' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getISBNEnumLiteralDeclaration_18()); 
                    // InternalDataDsl.g:1299:3: ( 'ISBN' )
                    // InternalDataDsl.g:1299:4: 'ISBN'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getISBNEnumLiteralDeclaration_18()); 

                    }


                    }
                    break;
                case 20 :
                    // InternalDataDsl.g:1303:2: ( ( 'ISSN' ) )
                    {
                    // InternalDataDsl.g:1303:2: ( ( 'ISSN' ) )
                    // InternalDataDsl.g:1304:3: ( 'ISSN' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getISSNEnumLiteralDeclaration_19()); 
                    // InternalDataDsl.g:1305:3: ( 'ISSN' )
                    // InternalDataDsl.g:1305:4: 'ISSN'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getISSNEnumLiteralDeclaration_19()); 

                    }


                    }
                    break;
                case 21 :
                    // InternalDataDsl.g:1309:2: ( ( 'Inet' ) )
                    {
                    // InternalDataDsl.g:1309:2: ( ( 'Inet' ) )
                    // InternalDataDsl.g:1310:3: ( 'Inet' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getInetEnumLiteralDeclaration_20()); 
                    // InternalDataDsl.g:1311:3: ( 'Inet' )
                    // InternalDataDsl.g:1311:4: 'Inet'
                    {
                    match(input,41,FOLLOW_2); 

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
    // InternalDataDsl.g:1319:1: rule__StringOptionKey__Alternatives : ( ( ( 'null' ) ) | ( ( 'separator' ) ) | ( ( 'default' ) ) | ( ( 'regex' ) ) | ( ( 'flags' ) ) | ( ( 'decimalchar' ) ) | ( ( 'pattern' ) ) | ( ( 'format' ) ) );
    public final void rule__StringOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1323:1: ( ( ( 'null' ) ) | ( ( 'separator' ) ) | ( ( 'default' ) ) | ( ( 'regex' ) ) | ( ( 'flags' ) ) | ( ( 'decimalchar' ) ) | ( ( 'pattern' ) ) | ( ( 'format' ) ) )
            int alt13=8;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 43:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            case 45:
                {
                alt13=4;
                }
                break;
            case 46:
                {
                alt13=5;
                }
                break;
            case 47:
                {
                alt13=6;
                }
                break;
            case 48:
                {
                alt13=7;
                }
                break;
            case 49:
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
                    // InternalDataDsl.g:1324:2: ( ( 'null' ) )
                    {
                    // InternalDataDsl.g:1324:2: ( ( 'null' ) )
                    // InternalDataDsl.g:1325:3: ( 'null' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1326:3: ( 'null' )
                    // InternalDataDsl.g:1326:4: 'null'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getNullEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1330:2: ( ( 'separator' ) )
                    {
                    // InternalDataDsl.g:1330:2: ( ( 'separator' ) )
                    // InternalDataDsl.g:1331:3: ( 'separator' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1332:3: ( 'separator' )
                    // InternalDataDsl.g:1332:4: 'separator'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getSeparatorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1336:2: ( ( 'default' ) )
                    {
                    // InternalDataDsl.g:1336:2: ( ( 'default' ) )
                    // InternalDataDsl.g:1337:3: ( 'default' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1338:3: ( 'default' )
                    // InternalDataDsl.g:1338:4: 'default'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getDefaultEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1342:2: ( ( 'regex' ) )
                    {
                    // InternalDataDsl.g:1342:2: ( ( 'regex' ) )
                    // InternalDataDsl.g:1343:3: ( 'regex' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1344:3: ( 'regex' )
                    // InternalDataDsl.g:1344:4: 'regex'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getRegexEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1348:2: ( ( 'flags' ) )
                    {
                    // InternalDataDsl.g:1348:2: ( ( 'flags' ) )
                    // InternalDataDsl.g:1349:3: ( 'flags' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:1350:3: ( 'flags' )
                    // InternalDataDsl.g:1350:4: 'flags'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getFlagsEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:1354:2: ( ( 'decimalchar' ) )
                    {
                    // InternalDataDsl.g:1354:2: ( ( 'decimalchar' ) )
                    // InternalDataDsl.g:1355:3: ( 'decimalchar' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:1356:3: ( 'decimalchar' )
                    // InternalDataDsl.g:1356:4: 'decimalchar'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:1360:2: ( ( 'pattern' ) )
                    {
                    // InternalDataDsl.g:1360:2: ( ( 'pattern' ) )
                    // InternalDataDsl.g:1361:3: ( 'pattern' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:1362:3: ( 'pattern' )
                    // InternalDataDsl.g:1362:4: 'pattern'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getStringOptionKeyAccess().getPatternEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:1366:2: ( ( 'format' ) )
                    {
                    // InternalDataDsl.g:1366:2: ( ( 'format' ) )
                    // InternalDataDsl.g:1367:3: ( 'format' )
                    {
                     before(grammarAccess.getStringOptionKeyAccess().getFormatEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:1368:3: ( 'format' )
                    // InternalDataDsl.g:1368:4: 'format'
                    {
                    match(input,49,FOLLOW_2); 

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
    // InternalDataDsl.g:1376:1: rule__IntOptionKey__Alternatives : ( ( ( 'minLength' ) ) | ( ( 'maxLength' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'defaultvalue' ) ) );
    public final void rule__IntOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1380:1: ( ( ( 'minLength' ) ) | ( ( 'maxLength' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'defaultvalue' ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt14=1;
                }
                break;
            case 51:
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
            case 54:
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
                    // InternalDataDsl.g:1381:2: ( ( 'minLength' ) )
                    {
                    // InternalDataDsl.g:1381:2: ( ( 'minLength' ) )
                    // InternalDataDsl.g:1382:3: ( 'minLength' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1383:3: ( 'minLength' )
                    // InternalDataDsl.g:1383:4: 'minLength'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1387:2: ( ( 'maxLength' ) )
                    {
                    // InternalDataDsl.g:1387:2: ( ( 'maxLength' ) )
                    // InternalDataDsl.g:1388:3: ( 'maxLength' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1389:3: ( 'maxLength' )
                    // InternalDataDsl.g:1389:4: 'maxLength'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1393:2: ( ( 'min' ) )
                    {
                    // InternalDataDsl.g:1393:2: ( ( 'min' ) )
                    // InternalDataDsl.g:1394:3: ( 'min' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1395:3: ( 'min' )
                    // InternalDataDsl.g:1395:4: 'min'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMinEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:1399:2: ( ( 'max' ) )
                    {
                    // InternalDataDsl.g:1399:2: ( ( 'max' ) )
                    // InternalDataDsl.g:1400:3: ( 'max' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:1401:3: ( 'max' )
                    // InternalDataDsl.g:1401:4: 'max'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntOptionKeyAccess().getMaxEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:1405:2: ( ( 'defaultvalue' ) )
                    {
                    // InternalDataDsl.g:1405:2: ( ( 'defaultvalue' ) )
                    // InternalDataDsl.g:1406:3: ( 'defaultvalue' )
                    {
                     before(grammarAccess.getIntOptionKeyAccess().getDefaultEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:1407:3: ( 'defaultvalue' )
                    // InternalDataDsl.g:1407:4: 'defaultvalue'
                    {
                    match(input,54,FOLLOW_2); 

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
    // InternalDataDsl.g:1415:1: rule__DoubleOptionKey__Alternatives : ( ( ( 'minDouble' ) ) | ( ( 'maxDouble' ) ) | ( ( 'defaultvalueDouble' ) ) );
    public final void rule__DoubleOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1419:1: ( ( ( 'minDouble' ) ) | ( ( 'maxDouble' ) ) | ( ( 'defaultvalueDouble' ) ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt15=1;
                }
                break;
            case 56:
                {
                alt15=2;
                }
                break;
            case 57:
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
                    // InternalDataDsl.g:1420:2: ( ( 'minDouble' ) )
                    {
                    // InternalDataDsl.g:1420:2: ( ( 'minDouble' ) )
                    // InternalDataDsl.g:1421:3: ( 'minDouble' )
                    {
                     before(grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1422:3: ( 'minDouble' )
                    // InternalDataDsl.g:1422:4: 'minDouble'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoubleOptionKeyAccess().getMinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1426:2: ( ( 'maxDouble' ) )
                    {
                    // InternalDataDsl.g:1426:2: ( ( 'maxDouble' ) )
                    // InternalDataDsl.g:1427:3: ( 'maxDouble' )
                    {
                     before(grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1428:3: ( 'maxDouble' )
                    // InternalDataDsl.g:1428:4: 'maxDouble'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoubleOptionKeyAccess().getMaxEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:1432:2: ( ( 'defaultvalueDouble' ) )
                    {
                    // InternalDataDsl.g:1432:2: ( ( 'defaultvalueDouble' ) )
                    // InternalDataDsl.g:1433:3: ( 'defaultvalueDouble' )
                    {
                     before(grammarAccess.getDoubleOptionKeyAccess().getDefaultEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:1434:3: ( 'defaultvalueDouble' )
                    // InternalDataDsl.g:1434:4: 'defaultvalueDouble'
                    {
                    match(input,57,FOLLOW_2); 

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
    // InternalDataDsl.g:1442:1: rule__BooleanOptionKey__Alternatives : ( ( ( 'nullable' ) ) | ( ( 'casesensitive' ) ) );
    public final void rule__BooleanOptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1446:1: ( ( ( 'nullable' ) ) | ( ( 'casesensitive' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==58) ) {
                alt16=1;
            }
            else if ( (LA16_0==59) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataDsl.g:1447:2: ( ( 'nullable' ) )
                    {
                    // InternalDataDsl.g:1447:2: ( ( 'nullable' ) )
                    // InternalDataDsl.g:1448:3: ( 'nullable' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:1449:3: ( 'nullable' )
                    // InternalDataDsl.g:1449:4: 'nullable'
                    {
                    match(input,58,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanOptionKeyAccess().getNullableEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:1453:2: ( ( 'casesensitive' ) )
                    {
                    // InternalDataDsl.g:1453:2: ( ( 'casesensitive' ) )
                    // InternalDataDsl.g:1454:3: ( 'casesensitive' )
                    {
                     before(grammarAccess.getBooleanOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:1455:3: ( 'casesensitive' )
                    // InternalDataDsl.g:1455:4: 'casesensitive'
                    {
                    match(input,59,FOLLOW_2); 

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
    // InternalDataDsl.g:1463:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1467:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalDataDsl.g:1468:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
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
    // InternalDataDsl.g:1475:1: rule__DataModel__Group__0__Impl : ( () ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1479:1: ( ( () ) )
            // InternalDataDsl.g:1480:1: ( () )
            {
            // InternalDataDsl.g:1480:1: ( () )
            // InternalDataDsl.g:1481:2: ()
            {
             before(grammarAccess.getDataModelAccess().getDataModelAction_0()); 
            // InternalDataDsl.g:1482:2: ()
            // InternalDataDsl.g:1482:3: 
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
    // InternalDataDsl.g:1490:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1494:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // InternalDataDsl.g:1495:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
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
    // InternalDataDsl.g:1502:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__ElementsAssignment_1 ) ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1506:1: ( ( ( rule__DataModel__ElementsAssignment_1 ) ) )
            // InternalDataDsl.g:1507:1: ( ( rule__DataModel__ElementsAssignment_1 ) )
            {
            // InternalDataDsl.g:1507:1: ( ( rule__DataModel__ElementsAssignment_1 ) )
            // InternalDataDsl.g:1508:2: ( rule__DataModel__ElementsAssignment_1 )
            {
             before(grammarAccess.getDataModelAccess().getElementsAssignment_1()); 
            // InternalDataDsl.g:1509:2: ( rule__DataModel__ElementsAssignment_1 )
            // InternalDataDsl.g:1509:3: rule__DataModel__ElementsAssignment_1
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
    // InternalDataDsl.g:1517:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1521:1: ( rule__DataModel__Group__2__Impl )
            // InternalDataDsl.g:1522:2: rule__DataModel__Group__2__Impl
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
    // InternalDataDsl.g:1528:1: rule__DataModel__Group__2__Impl : ( ( rule__DataModel__ElementsAssignment_2 )* ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1532:1: ( ( ( rule__DataModel__ElementsAssignment_2 )* ) )
            // InternalDataDsl.g:1533:1: ( ( rule__DataModel__ElementsAssignment_2 )* )
            {
            // InternalDataDsl.g:1533:1: ( ( rule__DataModel__ElementsAssignment_2 )* )
            // InternalDataDsl.g:1534:2: ( rule__DataModel__ElementsAssignment_2 )*
            {
             before(grammarAccess.getDataModelAccess().getElementsAssignment_2()); 
            // InternalDataDsl.g:1535:2: ( rule__DataModel__ElementsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==60||LA17_0==63||LA17_0==66||LA17_0==72||(LA17_0>=74 && LA17_0<=77)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDataDsl.g:1535:3: rule__DataModel__ElementsAssignment_2
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
    // InternalDataDsl.g:1544:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1548:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDataDsl.g:1549:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalDataDsl.g:1556:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1560:1: ( ( 'import' ) )
            // InternalDataDsl.g:1561:1: ( 'import' )
            {
            // InternalDataDsl.g:1561:1: ( 'import' )
            // InternalDataDsl.g:1562:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalDataDsl.g:1571:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1575:1: ( rule__Import__Group__1__Impl )
            // InternalDataDsl.g:1576:2: rule__Import__Group__1__Impl
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
    // InternalDataDsl.g:1582:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1586:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalDataDsl.g:1587:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalDataDsl.g:1587:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalDataDsl.g:1588:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalDataDsl.g:1589:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalDataDsl.g:1589:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalDataDsl.g:1598:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1602:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalDataDsl.g:1603:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalDataDsl.g:1610:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1614:1: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:1615:1: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:1615:1: ( ruleQualifiedName )
            // InternalDataDsl.g:1616:2: ruleQualifiedName
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
    // InternalDataDsl.g:1625:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1629:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalDataDsl.g:1630:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalDataDsl.g:1636:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1640:1: ( ( ( '.*' )? ) )
            // InternalDataDsl.g:1641:1: ( ( '.*' )? )
            {
            // InternalDataDsl.g:1641:1: ( ( '.*' )? )
            // InternalDataDsl.g:1642:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalDataDsl.g:1643:2: ( '.*' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==61) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDataDsl.g:1643:3: '.*'
                    {
                    match(input,61,FOLLOW_2); 

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
    // InternalDataDsl.g:1652:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1656:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDataDsl.g:1657:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalDataDsl.g:1664:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1668:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:1669:1: ( RULE_ID )
            {
            // InternalDataDsl.g:1669:1: ( RULE_ID )
            // InternalDataDsl.g:1670:2: RULE_ID
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
    // InternalDataDsl.g:1679:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1683:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDataDsl.g:1684:2: rule__QualifiedName__Group__1__Impl
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
    // InternalDataDsl.g:1690:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1694:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDataDsl.g:1695:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDataDsl.g:1695:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDataDsl.g:1696:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalDataDsl.g:1697:2: ( rule__QualifiedName__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==62) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDataDsl.g:1697:3: rule__QualifiedName__Group_1__0
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
    // InternalDataDsl.g:1706:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1710:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDataDsl.g:1711:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalDataDsl.g:1718:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1722:1: ( ( '.' ) )
            // InternalDataDsl.g:1723:1: ( '.' )
            {
            // InternalDataDsl.g:1723:1: ( '.' )
            // InternalDataDsl.g:1724:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalDataDsl.g:1733:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1737:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDataDsl.g:1738:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalDataDsl.g:1744:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1748:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:1749:1: ( RULE_ID )
            {
            // InternalDataDsl.g:1749:1: ( RULE_ID )
            // InternalDataDsl.g:1750:2: RULE_ID
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
    // InternalDataDsl.g:1760:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1764:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // InternalDataDsl.g:1765:2: rule__Package__Group__0__Impl rule__Package__Group__1
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
    // InternalDataDsl.g:1772:1: rule__Package__Group__0__Impl : ( ( rule__Package__Group_0__0 )? ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1776:1: ( ( ( rule__Package__Group_0__0 )? ) )
            // InternalDataDsl.g:1777:1: ( ( rule__Package__Group_0__0 )? )
            {
            // InternalDataDsl.g:1777:1: ( ( rule__Package__Group_0__0 )? )
            // InternalDataDsl.g:1778:2: ( rule__Package__Group_0__0 )?
            {
             before(grammarAccess.getPackageAccess().getGroup_0()); 
            // InternalDataDsl.g:1779:2: ( rule__Package__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==66) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataDsl.g:1779:3: rule__Package__Group_0__0
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
    // InternalDataDsl.g:1787:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1791:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // InternalDataDsl.g:1792:2: rule__Package__Group__1__Impl rule__Package__Group__2
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
    // InternalDataDsl.g:1799:1: rule__Package__Group__1__Impl : ( 'package' ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1803:1: ( ( 'package' ) )
            // InternalDataDsl.g:1804:1: ( 'package' )
            {
            // InternalDataDsl.g:1804:1: ( 'package' )
            // InternalDataDsl.g:1805:2: 'package'
            {
             before(grammarAccess.getPackageAccess().getPackageKeyword_1()); 
            match(input,63,FOLLOW_2); 
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
    // InternalDataDsl.g:1814:1: rule__Package__Group__2 : rule__Package__Group__2__Impl rule__Package__Group__3 ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1818:1: ( rule__Package__Group__2__Impl rule__Package__Group__3 )
            // InternalDataDsl.g:1819:2: rule__Package__Group__2__Impl rule__Package__Group__3
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
    // InternalDataDsl.g:1826:1: rule__Package__Group__2__Impl : ( ( rule__Package__NameAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1830:1: ( ( ( rule__Package__NameAssignment_2 ) ) )
            // InternalDataDsl.g:1831:1: ( ( rule__Package__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:1831:1: ( ( rule__Package__NameAssignment_2 ) )
            // InternalDataDsl.g:1832:2: ( rule__Package__NameAssignment_2 )
            {
             before(grammarAccess.getPackageAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:1833:2: ( rule__Package__NameAssignment_2 )
            // InternalDataDsl.g:1833:3: rule__Package__NameAssignment_2
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
    // InternalDataDsl.g:1841:1: rule__Package__Group__3 : rule__Package__Group__3__Impl rule__Package__Group__4 ;
    public final void rule__Package__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1845:1: ( rule__Package__Group__3__Impl rule__Package__Group__4 )
            // InternalDataDsl.g:1846:2: rule__Package__Group__3__Impl rule__Package__Group__4
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
    // InternalDataDsl.g:1853:1: rule__Package__Group__3__Impl : ( '{' ) ;
    public final void rule__Package__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1857:1: ( ( '{' ) )
            // InternalDataDsl.g:1858:1: ( '{' )
            {
            // InternalDataDsl.g:1858:1: ( '{' )
            // InternalDataDsl.g:1859:2: '{'
            {
             before(grammarAccess.getPackageAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,64,FOLLOW_2); 
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
    // InternalDataDsl.g:1868:1: rule__Package__Group__4 : rule__Package__Group__4__Impl rule__Package__Group__5 ;
    public final void rule__Package__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1872:1: ( rule__Package__Group__4__Impl rule__Package__Group__5 )
            // InternalDataDsl.g:1873:2: rule__Package__Group__4__Impl rule__Package__Group__5
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
    // InternalDataDsl.g:1880:1: rule__Package__Group__4__Impl : ( ( rule__Package__ElementsAssignment_4 ) ) ;
    public final void rule__Package__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1884:1: ( ( ( rule__Package__ElementsAssignment_4 ) ) )
            // InternalDataDsl.g:1885:1: ( ( rule__Package__ElementsAssignment_4 ) )
            {
            // InternalDataDsl.g:1885:1: ( ( rule__Package__ElementsAssignment_4 ) )
            // InternalDataDsl.g:1886:2: ( rule__Package__ElementsAssignment_4 )
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_4()); 
            // InternalDataDsl.g:1887:2: ( rule__Package__ElementsAssignment_4 )
            // InternalDataDsl.g:1887:3: rule__Package__ElementsAssignment_4
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
    // InternalDataDsl.g:1895:1: rule__Package__Group__5 : rule__Package__Group__5__Impl rule__Package__Group__6 ;
    public final void rule__Package__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1899:1: ( rule__Package__Group__5__Impl rule__Package__Group__6 )
            // InternalDataDsl.g:1900:2: rule__Package__Group__5__Impl rule__Package__Group__6
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
    // InternalDataDsl.g:1907:1: rule__Package__Group__5__Impl : ( ( rule__Package__ElementsAssignment_5 )* ) ;
    public final void rule__Package__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1911:1: ( ( ( rule__Package__ElementsAssignment_5 )* ) )
            // InternalDataDsl.g:1912:1: ( ( rule__Package__ElementsAssignment_5 )* )
            {
            // InternalDataDsl.g:1912:1: ( ( rule__Package__ElementsAssignment_5 )* )
            // InternalDataDsl.g:1913:2: ( rule__Package__ElementsAssignment_5 )*
            {
             before(grammarAccess.getPackageAccess().getElementsAssignment_5()); 
            // InternalDataDsl.g:1914:2: ( rule__Package__ElementsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==72||(LA21_0>=74 && LA21_0<=77)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDataDsl.g:1914:3: rule__Package__ElementsAssignment_5
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
    // InternalDataDsl.g:1922:1: rule__Package__Group__6 : rule__Package__Group__6__Impl ;
    public final void rule__Package__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1926:1: ( rule__Package__Group__6__Impl )
            // InternalDataDsl.g:1927:2: rule__Package__Group__6__Impl
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
    // InternalDataDsl.g:1933:1: rule__Package__Group__6__Impl : ( '}' ) ;
    public final void rule__Package__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1937:1: ( ( '}' ) )
            // InternalDataDsl.g:1938:1: ( '}' )
            {
            // InternalDataDsl.g:1938:1: ( '}' )
            // InternalDataDsl.g:1939:2: '}'
            {
             before(grammarAccess.getPackageAccess().getRightCurlyBracketKeyword_6()); 
            match(input,65,FOLLOW_2); 
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
    // InternalDataDsl.g:1949:1: rule__Package__Group_0__0 : rule__Package__Group_0__0__Impl rule__Package__Group_0__1 ;
    public final void rule__Package__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1953:1: ( rule__Package__Group_0__0__Impl rule__Package__Group_0__1 )
            // InternalDataDsl.g:1954:2: rule__Package__Group_0__0__Impl rule__Package__Group_0__1
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
    // InternalDataDsl.g:1961:1: rule__Package__Group_0__0__Impl : ( ( rule__Package__TagsAssignment_0_0 ) ) ;
    public final void rule__Package__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1965:1: ( ( ( rule__Package__TagsAssignment_0_0 ) ) )
            // InternalDataDsl.g:1966:1: ( ( rule__Package__TagsAssignment_0_0 ) )
            {
            // InternalDataDsl.g:1966:1: ( ( rule__Package__TagsAssignment_0_0 ) )
            // InternalDataDsl.g:1967:2: ( rule__Package__TagsAssignment_0_0 )
            {
             before(grammarAccess.getPackageAccess().getTagsAssignment_0_0()); 
            // InternalDataDsl.g:1968:2: ( rule__Package__TagsAssignment_0_0 )
            // InternalDataDsl.g:1968:3: rule__Package__TagsAssignment_0_0
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
    // InternalDataDsl.g:1976:1: rule__Package__Group_0__1 : rule__Package__Group_0__1__Impl ;
    public final void rule__Package__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1980:1: ( rule__Package__Group_0__1__Impl )
            // InternalDataDsl.g:1981:2: rule__Package__Group_0__1__Impl
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
    // InternalDataDsl.g:1987:1: rule__Package__Group_0__1__Impl : ( ( rule__Package__TagsAssignment_0_1 )* ) ;
    public final void rule__Package__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1991:1: ( ( ( rule__Package__TagsAssignment_0_1 )* ) )
            // InternalDataDsl.g:1992:1: ( ( rule__Package__TagsAssignment_0_1 )* )
            {
            // InternalDataDsl.g:1992:1: ( ( rule__Package__TagsAssignment_0_1 )* )
            // InternalDataDsl.g:1993:2: ( rule__Package__TagsAssignment_0_1 )*
            {
             before(grammarAccess.getPackageAccess().getTagsAssignment_0_1()); 
            // InternalDataDsl.g:1994:2: ( rule__Package__TagsAssignment_0_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==66) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDataDsl.g:1994:3: rule__Package__TagsAssignment_0_1
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
    // InternalDataDsl.g:2003:1: rule__Tag__Group__0 : rule__Tag__Group__0__Impl rule__Tag__Group__1 ;
    public final void rule__Tag__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2007:1: ( rule__Tag__Group__0__Impl rule__Tag__Group__1 )
            // InternalDataDsl.g:2008:2: rule__Tag__Group__0__Impl rule__Tag__Group__1
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
    // InternalDataDsl.g:2015:1: rule__Tag__Group__0__Impl : ( '@' ) ;
    public final void rule__Tag__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2019:1: ( ( '@' ) )
            // InternalDataDsl.g:2020:1: ( '@' )
            {
            // InternalDataDsl.g:2020:1: ( '@' )
            // InternalDataDsl.g:2021:2: '@'
            {
             before(grammarAccess.getTagAccess().getCommercialAtKeyword_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalDataDsl.g:2030:1: rule__Tag__Group__1 : rule__Tag__Group__1__Impl ;
    public final void rule__Tag__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2034:1: ( rule__Tag__Group__1__Impl )
            // InternalDataDsl.g:2035:2: rule__Tag__Group__1__Impl
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
    // InternalDataDsl.g:2041:1: rule__Tag__Group__1__Impl : ( ( rule__Tag__TagAssignment_1 ) ) ;
    public final void rule__Tag__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2045:1: ( ( ( rule__Tag__TagAssignment_1 ) ) )
            // InternalDataDsl.g:2046:1: ( ( rule__Tag__TagAssignment_1 ) )
            {
            // InternalDataDsl.g:2046:1: ( ( rule__Tag__TagAssignment_1 ) )
            // InternalDataDsl.g:2047:2: ( rule__Tag__TagAssignment_1 )
            {
             before(grammarAccess.getTagAccess().getTagAssignment_1()); 
            // InternalDataDsl.g:2048:2: ( rule__Tag__TagAssignment_1 )
            // InternalDataDsl.g:2048:3: rule__Tag__TagAssignment_1
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
    // InternalDataDsl.g:2057:1: rule__Substring__Group__0 : rule__Substring__Group__0__Impl rule__Substring__Group__1 ;
    public final void rule__Substring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2061:1: ( rule__Substring__Group__0__Impl rule__Substring__Group__1 )
            // InternalDataDsl.g:2062:2: rule__Substring__Group__0__Impl rule__Substring__Group__1
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
    // InternalDataDsl.g:2069:1: rule__Substring__Group__0__Impl : ( ( rule__Substring__TypeStringAssignment_0 ) ) ;
    public final void rule__Substring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2073:1: ( ( ( rule__Substring__TypeStringAssignment_0 ) ) )
            // InternalDataDsl.g:2074:1: ( ( rule__Substring__TypeStringAssignment_0 ) )
            {
            // InternalDataDsl.g:2074:1: ( ( rule__Substring__TypeStringAssignment_0 ) )
            // InternalDataDsl.g:2075:2: ( rule__Substring__TypeStringAssignment_0 )
            {
             before(grammarAccess.getSubstringAccess().getTypeStringAssignment_0()); 
            // InternalDataDsl.g:2076:2: ( rule__Substring__TypeStringAssignment_0 )
            // InternalDataDsl.g:2076:3: rule__Substring__TypeStringAssignment_0
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
    // InternalDataDsl.g:2084:1: rule__Substring__Group__1 : rule__Substring__Group__1__Impl rule__Substring__Group__2 ;
    public final void rule__Substring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2088:1: ( rule__Substring__Group__1__Impl rule__Substring__Group__2 )
            // InternalDataDsl.g:2089:2: rule__Substring__Group__1__Impl rule__Substring__Group__2
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
    // InternalDataDsl.g:2096:1: rule__Substring__Group__1__Impl : ( ( rule__Substring__NameAssignment_1 ) ) ;
    public final void rule__Substring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2100:1: ( ( ( rule__Substring__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2101:1: ( ( rule__Substring__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2101:1: ( ( rule__Substring__NameAssignment_1 ) )
            // InternalDataDsl.g:2102:2: ( rule__Substring__NameAssignment_1 )
            {
             before(grammarAccess.getSubstringAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2103:2: ( rule__Substring__NameAssignment_1 )
            // InternalDataDsl.g:2103:3: rule__Substring__NameAssignment_1
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
    // InternalDataDsl.g:2111:1: rule__Substring__Group__2 : rule__Substring__Group__2__Impl rule__Substring__Group__3 ;
    public final void rule__Substring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2115:1: ( rule__Substring__Group__2__Impl rule__Substring__Group__3 )
            // InternalDataDsl.g:2116:2: rule__Substring__Group__2__Impl rule__Substring__Group__3
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
    // InternalDataDsl.g:2123:1: rule__Substring__Group__2__Impl : ( '[' ) ;
    public final void rule__Substring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2127:1: ( ( '[' ) )
            // InternalDataDsl.g:2128:1: ( '[' )
            {
            // InternalDataDsl.g:2128:1: ( '[' )
            // InternalDataDsl.g:2129:2: '['
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
    // InternalDataDsl.g:2138:1: rule__Substring__Group__3 : rule__Substring__Group__3__Impl rule__Substring__Group__4 ;
    public final void rule__Substring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2142:1: ( rule__Substring__Group__3__Impl rule__Substring__Group__4 )
            // InternalDataDsl.g:2143:2: rule__Substring__Group__3__Impl rule__Substring__Group__4
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
    // InternalDataDsl.g:2150:1: rule__Substring__Group__3__Impl : ( ( rule__Substring__MinlengthAssignment_3 ) ) ;
    public final void rule__Substring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2154:1: ( ( ( rule__Substring__MinlengthAssignment_3 ) ) )
            // InternalDataDsl.g:2155:1: ( ( rule__Substring__MinlengthAssignment_3 ) )
            {
            // InternalDataDsl.g:2155:1: ( ( rule__Substring__MinlengthAssignment_3 ) )
            // InternalDataDsl.g:2156:2: ( rule__Substring__MinlengthAssignment_3 )
            {
             before(grammarAccess.getSubstringAccess().getMinlengthAssignment_3()); 
            // InternalDataDsl.g:2157:2: ( rule__Substring__MinlengthAssignment_3 )
            // InternalDataDsl.g:2157:3: rule__Substring__MinlengthAssignment_3
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
    // InternalDataDsl.g:2165:1: rule__Substring__Group__4 : rule__Substring__Group__4__Impl rule__Substring__Group__5 ;
    public final void rule__Substring__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2169:1: ( rule__Substring__Group__4__Impl rule__Substring__Group__5 )
            // InternalDataDsl.g:2170:2: rule__Substring__Group__4__Impl rule__Substring__Group__5
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
    // InternalDataDsl.g:2177:1: rule__Substring__Group__4__Impl : ( ',' ) ;
    public final void rule__Substring__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2181:1: ( ( ',' ) )
            // InternalDataDsl.g:2182:1: ( ',' )
            {
            // InternalDataDsl.g:2182:1: ( ',' )
            // InternalDataDsl.g:2183:2: ','
            {
             before(grammarAccess.getSubstringAccess().getCommaKeyword_4()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:2192:1: rule__Substring__Group__5 : rule__Substring__Group__5__Impl rule__Substring__Group__6 ;
    public final void rule__Substring__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2196:1: ( rule__Substring__Group__5__Impl rule__Substring__Group__6 )
            // InternalDataDsl.g:2197:2: rule__Substring__Group__5__Impl rule__Substring__Group__6
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
    // InternalDataDsl.g:2204:1: rule__Substring__Group__5__Impl : ( ( rule__Substring__MaxlengthAssignment_5 ) ) ;
    public final void rule__Substring__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2208:1: ( ( ( rule__Substring__MaxlengthAssignment_5 ) ) )
            // InternalDataDsl.g:2209:1: ( ( rule__Substring__MaxlengthAssignment_5 ) )
            {
            // InternalDataDsl.g:2209:1: ( ( rule__Substring__MaxlengthAssignment_5 ) )
            // InternalDataDsl.g:2210:2: ( rule__Substring__MaxlengthAssignment_5 )
            {
             before(grammarAccess.getSubstringAccess().getMaxlengthAssignment_5()); 
            // InternalDataDsl.g:2211:2: ( rule__Substring__MaxlengthAssignment_5 )
            // InternalDataDsl.g:2211:3: rule__Substring__MaxlengthAssignment_5
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
    // InternalDataDsl.g:2219:1: rule__Substring__Group__6 : rule__Substring__Group__6__Impl ;
    public final void rule__Substring__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2223:1: ( rule__Substring__Group__6__Impl )
            // InternalDataDsl.g:2224:2: rule__Substring__Group__6__Impl
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
    // InternalDataDsl.g:2230:1: rule__Substring__Group__6__Impl : ( ']' ) ;
    public final void rule__Substring__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2234:1: ( ( ']' ) )
            // InternalDataDsl.g:2235:1: ( ']' )
            {
            // InternalDataDsl.g:2235:1: ( ']' )
            // InternalDataDsl.g:2236:2: ']'
            {
             before(grammarAccess.getSubstringAccess().getRightSquareBracketKeyword_6()); 
            match(input,69,FOLLOW_2); 
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
    // InternalDataDsl.g:2246:1: rule__Character__Group__0 : rule__Character__Group__0__Impl rule__Character__Group__1 ;
    public final void rule__Character__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2250:1: ( rule__Character__Group__0__Impl rule__Character__Group__1 )
            // InternalDataDsl.g:2251:2: rule__Character__Group__0__Impl rule__Character__Group__1
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
    // InternalDataDsl.g:2258:1: rule__Character__Group__0__Impl : ( ( rule__Character__TypeCharacterAssignment_0 ) ) ;
    public final void rule__Character__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2262:1: ( ( ( rule__Character__TypeCharacterAssignment_0 ) ) )
            // InternalDataDsl.g:2263:1: ( ( rule__Character__TypeCharacterAssignment_0 ) )
            {
            // InternalDataDsl.g:2263:1: ( ( rule__Character__TypeCharacterAssignment_0 ) )
            // InternalDataDsl.g:2264:2: ( rule__Character__TypeCharacterAssignment_0 )
            {
             before(grammarAccess.getCharacterAccess().getTypeCharacterAssignment_0()); 
            // InternalDataDsl.g:2265:2: ( rule__Character__TypeCharacterAssignment_0 )
            // InternalDataDsl.g:2265:3: rule__Character__TypeCharacterAssignment_0
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
    // InternalDataDsl.g:2273:1: rule__Character__Group__1 : rule__Character__Group__1__Impl rule__Character__Group__2 ;
    public final void rule__Character__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2277:1: ( rule__Character__Group__1__Impl rule__Character__Group__2 )
            // InternalDataDsl.g:2278:2: rule__Character__Group__1__Impl rule__Character__Group__2
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
    // InternalDataDsl.g:2285:1: rule__Character__Group__1__Impl : ( ( rule__Character__NameAssignment_1 ) ) ;
    public final void rule__Character__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2289:1: ( ( ( rule__Character__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2290:1: ( ( rule__Character__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2290:1: ( ( rule__Character__NameAssignment_1 ) )
            // InternalDataDsl.g:2291:2: ( rule__Character__NameAssignment_1 )
            {
             before(grammarAccess.getCharacterAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2292:2: ( rule__Character__NameAssignment_1 )
            // InternalDataDsl.g:2292:3: rule__Character__NameAssignment_1
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
    // InternalDataDsl.g:2300:1: rule__Character__Group__2 : rule__Character__Group__2__Impl ;
    public final void rule__Character__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2304:1: ( rule__Character__Group__2__Impl )
            // InternalDataDsl.g:2305:2: rule__Character__Group__2__Impl
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
    // InternalDataDsl.g:2311:1: rule__Character__Group__2__Impl : ( ( rule__Character__ValueAssignment_2 )? ) ;
    public final void rule__Character__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2315:1: ( ( ( rule__Character__ValueAssignment_2 )? ) )
            // InternalDataDsl.g:2316:1: ( ( rule__Character__ValueAssignment_2 )? )
            {
            // InternalDataDsl.g:2316:1: ( ( rule__Character__ValueAssignment_2 )? )
            // InternalDataDsl.g:2317:2: ( rule__Character__ValueAssignment_2 )?
            {
             before(grammarAccess.getCharacterAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:2318:2: ( rule__Character__ValueAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataDsl.g:2318:3: rule__Character__ValueAssignment_2
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
    // InternalDataDsl.g:2327:1: rule__CompositeNode__Group__0 : rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 ;
    public final void rule__CompositeNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2331:1: ( rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 )
            // InternalDataDsl.g:2332:2: rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1
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
    // InternalDataDsl.g:2339:1: rule__CompositeNode__Group__0__Impl : ( ( rule__CompositeNode__Alternatives_0 )? ) ;
    public final void rule__CompositeNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2343:1: ( ( ( rule__CompositeNode__Alternatives_0 )? ) )
            // InternalDataDsl.g:2344:1: ( ( rule__CompositeNode__Alternatives_0 )? )
            {
            // InternalDataDsl.g:2344:1: ( ( rule__CompositeNode__Alternatives_0 )? )
            // InternalDataDsl.g:2345:2: ( rule__CompositeNode__Alternatives_0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getAlternatives_0()); 
            // InternalDataDsl.g:2346:2: ( rule__CompositeNode__Alternatives_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=79 && LA24_0<=80)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDsl.g:2346:3: rule__CompositeNode__Alternatives_0
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
    // InternalDataDsl.g:2354:1: rule__CompositeNode__Group__1 : rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 ;
    public final void rule__CompositeNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2358:1: ( rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 )
            // InternalDataDsl.g:2359:2: rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2
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
    // InternalDataDsl.g:2366:1: rule__CompositeNode__Group__1__Impl : ( ( rule__CompositeNode__TypeAssignment_1 ) ) ;
    public final void rule__CompositeNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2370:1: ( ( ( rule__CompositeNode__TypeAssignment_1 ) ) )
            // InternalDataDsl.g:2371:1: ( ( rule__CompositeNode__TypeAssignment_1 ) )
            {
            // InternalDataDsl.g:2371:1: ( ( rule__CompositeNode__TypeAssignment_1 ) )
            // InternalDataDsl.g:2372:2: ( rule__CompositeNode__TypeAssignment_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getTypeAssignment_1()); 
            // InternalDataDsl.g:2373:2: ( rule__CompositeNode__TypeAssignment_1 )
            // InternalDataDsl.g:2373:3: rule__CompositeNode__TypeAssignment_1
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
    // InternalDataDsl.g:2381:1: rule__CompositeNode__Group__2 : rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 ;
    public final void rule__CompositeNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2385:1: ( rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 )
            // InternalDataDsl.g:2386:2: rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3
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
    // InternalDataDsl.g:2393:1: rule__CompositeNode__Group__2__Impl : ( ( rule__CompositeNode__NameAssignment_2 ) ) ;
    public final void rule__CompositeNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2397:1: ( ( ( rule__CompositeNode__NameAssignment_2 ) ) )
            // InternalDataDsl.g:2398:1: ( ( rule__CompositeNode__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:2398:1: ( ( rule__CompositeNode__NameAssignment_2 ) )
            // InternalDataDsl.g:2399:2: ( rule__CompositeNode__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeNodeAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:2400:2: ( rule__CompositeNode__NameAssignment_2 )
            // InternalDataDsl.g:2400:3: rule__CompositeNode__NameAssignment_2
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
    // InternalDataDsl.g:2408:1: rule__CompositeNode__Group__3 : rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 ;
    public final void rule__CompositeNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2412:1: ( rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 )
            // InternalDataDsl.g:2413:2: rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4
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
    // InternalDataDsl.g:2420:1: rule__CompositeNode__Group__3__Impl : ( ( rule__CompositeNode__Group_3__0 )? ) ;
    public final void rule__CompositeNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2424:1: ( ( ( rule__CompositeNode__Group_3__0 )? ) )
            // InternalDataDsl.g:2425:1: ( ( rule__CompositeNode__Group_3__0 )? )
            {
            // InternalDataDsl.g:2425:1: ( ( rule__CompositeNode__Group_3__0 )? )
            // InternalDataDsl.g:2426:2: ( rule__CompositeNode__Group_3__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_3()); 
            // InternalDataDsl.g:2427:2: ( rule__CompositeNode__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==67) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDsl.g:2427:3: rule__CompositeNode__Group_3__0
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
    // InternalDataDsl.g:2435:1: rule__CompositeNode__Group__4 : rule__CompositeNode__Group__4__Impl ;
    public final void rule__CompositeNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2439:1: ( rule__CompositeNode__Group__4__Impl )
            // InternalDataDsl.g:2440:2: rule__CompositeNode__Group__4__Impl
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
    // InternalDataDsl.g:2446:1: rule__CompositeNode__Group__4__Impl : ( ( rule__CompositeNode__Group_4__0 )? ) ;
    public final void rule__CompositeNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2450:1: ( ( ( rule__CompositeNode__Group_4__0 )? ) )
            // InternalDataDsl.g:2451:1: ( ( rule__CompositeNode__Group_4__0 )? )
            {
            // InternalDataDsl.g:2451:1: ( ( rule__CompositeNode__Group_4__0 )? )
            // InternalDataDsl.g:2452:2: ( rule__CompositeNode__Group_4__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_4()); 
            // InternalDataDsl.g:2453:2: ( rule__CompositeNode__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==70) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataDsl.g:2453:3: rule__CompositeNode__Group_4__0
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
    // InternalDataDsl.g:2462:1: rule__CompositeNode__Group_3__0 : rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1 ;
    public final void rule__CompositeNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2466:1: ( rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1 )
            // InternalDataDsl.g:2467:2: rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1
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
    // InternalDataDsl.g:2474:1: rule__CompositeNode__Group_3__0__Impl : ( '[' ) ;
    public final void rule__CompositeNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2478:1: ( ( '[' ) )
            // InternalDataDsl.g:2479:1: ( '[' )
            {
            // InternalDataDsl.g:2479:1: ( '[' )
            // InternalDataDsl.g:2480:2: '['
            {
             before(grammarAccess.getCompositeNodeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalDataDsl.g:2489:1: rule__CompositeNode__Group_3__1 : rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2 ;
    public final void rule__CompositeNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2493:1: ( rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2 )
            // InternalDataDsl.g:2494:2: rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2
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
    // InternalDataDsl.g:2501:1: rule__CompositeNode__Group_3__1__Impl : ( ( rule__CompositeNode__CardinalityAssignment_3_1 ) ) ;
    public final void rule__CompositeNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2505:1: ( ( ( rule__CompositeNode__CardinalityAssignment_3_1 ) ) )
            // InternalDataDsl.g:2506:1: ( ( rule__CompositeNode__CardinalityAssignment_3_1 ) )
            {
            // InternalDataDsl.g:2506:1: ( ( rule__CompositeNode__CardinalityAssignment_3_1 ) )
            // InternalDataDsl.g:2507:2: ( rule__CompositeNode__CardinalityAssignment_3_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getCardinalityAssignment_3_1()); 
            // InternalDataDsl.g:2508:2: ( rule__CompositeNode__CardinalityAssignment_3_1 )
            // InternalDataDsl.g:2508:3: rule__CompositeNode__CardinalityAssignment_3_1
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
    // InternalDataDsl.g:2516:1: rule__CompositeNode__Group_3__2 : rule__CompositeNode__Group_3__2__Impl ;
    public final void rule__CompositeNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2520:1: ( rule__CompositeNode__Group_3__2__Impl )
            // InternalDataDsl.g:2521:2: rule__CompositeNode__Group_3__2__Impl
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
    // InternalDataDsl.g:2527:1: rule__CompositeNode__Group_3__2__Impl : ( ']' ) ;
    public final void rule__CompositeNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2531:1: ( ( ']' ) )
            // InternalDataDsl.g:2532:1: ( ']' )
            {
            // InternalDataDsl.g:2532:1: ( ']' )
            // InternalDataDsl.g:2533:2: ']'
            {
             before(grammarAccess.getCompositeNodeAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalDataDsl.g:2543:1: rule__CompositeNode__Group_4__0 : rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1 ;
    public final void rule__CompositeNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2547:1: ( rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1 )
            // InternalDataDsl.g:2548:2: rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1
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
    // InternalDataDsl.g:2555:1: rule__CompositeNode__Group_4__0__Impl : ( '(' ) ;
    public final void rule__CompositeNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2559:1: ( ( '(' ) )
            // InternalDataDsl.g:2560:1: ( '(' )
            {
            // InternalDataDsl.g:2560:1: ( '(' )
            // InternalDataDsl.g:2561:2: '('
            {
             before(grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalDataDsl.g:2570:1: rule__CompositeNode__Group_4__1 : rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2 ;
    public final void rule__CompositeNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2574:1: ( rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2 )
            // InternalDataDsl.g:2575:2: rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2
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
    // InternalDataDsl.g:2582:1: rule__CompositeNode__Group_4__1__Impl : ( ( rule__CompositeNode__OptionsAssignment_4_1 ) ) ;
    public final void rule__CompositeNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2586:1: ( ( ( rule__CompositeNode__OptionsAssignment_4_1 ) ) )
            // InternalDataDsl.g:2587:1: ( ( rule__CompositeNode__OptionsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:2587:1: ( ( rule__CompositeNode__OptionsAssignment_4_1 ) )
            // InternalDataDsl.g:2588:2: ( rule__CompositeNode__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_4_1()); 
            // InternalDataDsl.g:2589:2: ( rule__CompositeNode__OptionsAssignment_4_1 )
            // InternalDataDsl.g:2589:3: rule__CompositeNode__OptionsAssignment_4_1
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
    // InternalDataDsl.g:2597:1: rule__CompositeNode__Group_4__2 : rule__CompositeNode__Group_4__2__Impl rule__CompositeNode__Group_4__3 ;
    public final void rule__CompositeNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2601:1: ( rule__CompositeNode__Group_4__2__Impl rule__CompositeNode__Group_4__3 )
            // InternalDataDsl.g:2602:2: rule__CompositeNode__Group_4__2__Impl rule__CompositeNode__Group_4__3
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
    // InternalDataDsl.g:2609:1: rule__CompositeNode__Group_4__2__Impl : ( ( rule__CompositeNode__Group_4_2__0 )* ) ;
    public final void rule__CompositeNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2613:1: ( ( ( rule__CompositeNode__Group_4_2__0 )* ) )
            // InternalDataDsl.g:2614:1: ( ( rule__CompositeNode__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:2614:1: ( ( rule__CompositeNode__Group_4_2__0 )* )
            // InternalDataDsl.g:2615:2: ( rule__CompositeNode__Group_4_2__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_4_2()); 
            // InternalDataDsl.g:2616:2: ( rule__CompositeNode__Group_4_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==68) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDataDsl.g:2616:3: rule__CompositeNode__Group_4_2__0
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
    // InternalDataDsl.g:2624:1: rule__CompositeNode__Group_4__3 : rule__CompositeNode__Group_4__3__Impl ;
    public final void rule__CompositeNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2628:1: ( rule__CompositeNode__Group_4__3__Impl )
            // InternalDataDsl.g:2629:2: rule__CompositeNode__Group_4__3__Impl
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
    // InternalDataDsl.g:2635:1: rule__CompositeNode__Group_4__3__Impl : ( ')' ) ;
    public final void rule__CompositeNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2639:1: ( ( ')' ) )
            // InternalDataDsl.g:2640:1: ( ')' )
            {
            // InternalDataDsl.g:2640:1: ( ')' )
            // InternalDataDsl.g:2641:2: ')'
            {
             before(grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_4_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalDataDsl.g:2651:1: rule__CompositeNode__Group_4_2__0 : rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1 ;
    public final void rule__CompositeNode__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2655:1: ( rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1 )
            // InternalDataDsl.g:2656:2: rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1
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
    // InternalDataDsl.g:2663:1: rule__CompositeNode__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2667:1: ( ( ',' ) )
            // InternalDataDsl.g:2668:1: ( ',' )
            {
            // InternalDataDsl.g:2668:1: ( ',' )
            // InternalDataDsl.g:2669:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_4_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:2678:1: rule__CompositeNode__Group_4_2__1 : rule__CompositeNode__Group_4_2__1__Impl ;
    public final void rule__CompositeNode__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2682:1: ( rule__CompositeNode__Group_4_2__1__Impl )
            // InternalDataDsl.g:2683:2: rule__CompositeNode__Group_4_2__1__Impl
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
    // InternalDataDsl.g:2689:1: rule__CompositeNode__Group_4_2__1__Impl : ( ( rule__CompositeNode__OptionsAssignment_4_2_1 ) ) ;
    public final void rule__CompositeNode__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2693:1: ( ( ( rule__CompositeNode__OptionsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:2694:1: ( ( rule__CompositeNode__OptionsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:2694:1: ( ( rule__CompositeNode__OptionsAssignment_4_2_1 ) )
            // InternalDataDsl.g:2695:2: ( rule__CompositeNode__OptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_4_2_1()); 
            // InternalDataDsl.g:2696:2: ( rule__CompositeNode__OptionsAssignment_4_2_1 )
            // InternalDataDsl.g:2696:3: rule__CompositeNode__OptionsAssignment_4_2_1
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
    // InternalDataDsl.g:2705:1: rule__FragmentNode__Group__0 : rule__FragmentNode__Group__0__Impl rule__FragmentNode__Group__1 ;
    public final void rule__FragmentNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2709:1: ( rule__FragmentNode__Group__0__Impl rule__FragmentNode__Group__1 )
            // InternalDataDsl.g:2710:2: rule__FragmentNode__Group__0__Impl rule__FragmentNode__Group__1
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
    // InternalDataDsl.g:2717:1: rule__FragmentNode__Group__0__Impl : ( '.' ) ;
    public final void rule__FragmentNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2721:1: ( ( '.' ) )
            // InternalDataDsl.g:2722:1: ( '.' )
            {
            // InternalDataDsl.g:2722:1: ( '.' )
            // InternalDataDsl.g:2723:2: '.'
            {
             before(grammarAccess.getFragmentNodeAccess().getFullStopKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalDataDsl.g:2732:1: rule__FragmentNode__Group__1 : rule__FragmentNode__Group__1__Impl rule__FragmentNode__Group__2 ;
    public final void rule__FragmentNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2736:1: ( rule__FragmentNode__Group__1__Impl rule__FragmentNode__Group__2 )
            // InternalDataDsl.g:2737:2: rule__FragmentNode__Group__1__Impl rule__FragmentNode__Group__2
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
    // InternalDataDsl.g:2744:1: rule__FragmentNode__Group__1__Impl : ( ( rule__FragmentNode__TypeAssignment_1 ) ) ;
    public final void rule__FragmentNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2748:1: ( ( ( rule__FragmentNode__TypeAssignment_1 ) ) )
            // InternalDataDsl.g:2749:1: ( ( rule__FragmentNode__TypeAssignment_1 ) )
            {
            // InternalDataDsl.g:2749:1: ( ( rule__FragmentNode__TypeAssignment_1 ) )
            // InternalDataDsl.g:2750:2: ( rule__FragmentNode__TypeAssignment_1 )
            {
             before(grammarAccess.getFragmentNodeAccess().getTypeAssignment_1()); 
            // InternalDataDsl.g:2751:2: ( rule__FragmentNode__TypeAssignment_1 )
            // InternalDataDsl.g:2751:3: rule__FragmentNode__TypeAssignment_1
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
    // InternalDataDsl.g:2759:1: rule__FragmentNode__Group__2 : rule__FragmentNode__Group__2__Impl rule__FragmentNode__Group__3 ;
    public final void rule__FragmentNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2763:1: ( rule__FragmentNode__Group__2__Impl rule__FragmentNode__Group__3 )
            // InternalDataDsl.g:2764:2: rule__FragmentNode__Group__2__Impl rule__FragmentNode__Group__3
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
    // InternalDataDsl.g:2771:1: rule__FragmentNode__Group__2__Impl : ( ( rule__FragmentNode__NameAssignment_2 ) ) ;
    public final void rule__FragmentNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2775:1: ( ( ( rule__FragmentNode__NameAssignment_2 ) ) )
            // InternalDataDsl.g:2776:1: ( ( rule__FragmentNode__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:2776:1: ( ( rule__FragmentNode__NameAssignment_2 ) )
            // InternalDataDsl.g:2777:2: ( rule__FragmentNode__NameAssignment_2 )
            {
             before(grammarAccess.getFragmentNodeAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:2778:2: ( rule__FragmentNode__NameAssignment_2 )
            // InternalDataDsl.g:2778:3: rule__FragmentNode__NameAssignment_2
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
    // InternalDataDsl.g:2786:1: rule__FragmentNode__Group__3 : rule__FragmentNode__Group__3__Impl rule__FragmentNode__Group__4 ;
    public final void rule__FragmentNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2790:1: ( rule__FragmentNode__Group__3__Impl rule__FragmentNode__Group__4 )
            // InternalDataDsl.g:2791:2: rule__FragmentNode__Group__3__Impl rule__FragmentNode__Group__4
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
    // InternalDataDsl.g:2798:1: rule__FragmentNode__Group__3__Impl : ( ( rule__FragmentNode__Group_3__0 )? ) ;
    public final void rule__FragmentNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2802:1: ( ( ( rule__FragmentNode__Group_3__0 )? ) )
            // InternalDataDsl.g:2803:1: ( ( rule__FragmentNode__Group_3__0 )? )
            {
            // InternalDataDsl.g:2803:1: ( ( rule__FragmentNode__Group_3__0 )? )
            // InternalDataDsl.g:2804:2: ( rule__FragmentNode__Group_3__0 )?
            {
             before(grammarAccess.getFragmentNodeAccess().getGroup_3()); 
            // InternalDataDsl.g:2805:2: ( rule__FragmentNode__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==67) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalDataDsl.g:2805:3: rule__FragmentNode__Group_3__0
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
    // InternalDataDsl.g:2813:1: rule__FragmentNode__Group__4 : rule__FragmentNode__Group__4__Impl ;
    public final void rule__FragmentNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2817:1: ( rule__FragmentNode__Group__4__Impl )
            // InternalDataDsl.g:2818:2: rule__FragmentNode__Group__4__Impl
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
    // InternalDataDsl.g:2824:1: rule__FragmentNode__Group__4__Impl : ( ( rule__FragmentNode__Group_4__0 )? ) ;
    public final void rule__FragmentNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2828:1: ( ( ( rule__FragmentNode__Group_4__0 )? ) )
            // InternalDataDsl.g:2829:1: ( ( rule__FragmentNode__Group_4__0 )? )
            {
            // InternalDataDsl.g:2829:1: ( ( rule__FragmentNode__Group_4__0 )? )
            // InternalDataDsl.g:2830:2: ( rule__FragmentNode__Group_4__0 )?
            {
             before(grammarAccess.getFragmentNodeAccess().getGroup_4()); 
            // InternalDataDsl.g:2831:2: ( rule__FragmentNode__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==70) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataDsl.g:2831:3: rule__FragmentNode__Group_4__0
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
    // InternalDataDsl.g:2840:1: rule__FragmentNode__Group_3__0 : rule__FragmentNode__Group_3__0__Impl rule__FragmentNode__Group_3__1 ;
    public final void rule__FragmentNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2844:1: ( rule__FragmentNode__Group_3__0__Impl rule__FragmentNode__Group_3__1 )
            // InternalDataDsl.g:2845:2: rule__FragmentNode__Group_3__0__Impl rule__FragmentNode__Group_3__1
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
    // InternalDataDsl.g:2852:1: rule__FragmentNode__Group_3__0__Impl : ( '[' ) ;
    public final void rule__FragmentNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2856:1: ( ( '[' ) )
            // InternalDataDsl.g:2857:1: ( '[' )
            {
            // InternalDataDsl.g:2857:1: ( '[' )
            // InternalDataDsl.g:2858:2: '['
            {
             before(grammarAccess.getFragmentNodeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalDataDsl.g:2867:1: rule__FragmentNode__Group_3__1 : rule__FragmentNode__Group_3__1__Impl rule__FragmentNode__Group_3__2 ;
    public final void rule__FragmentNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2871:1: ( rule__FragmentNode__Group_3__1__Impl rule__FragmentNode__Group_3__2 )
            // InternalDataDsl.g:2872:2: rule__FragmentNode__Group_3__1__Impl rule__FragmentNode__Group_3__2
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
    // InternalDataDsl.g:2879:1: rule__FragmentNode__Group_3__1__Impl : ( ( rule__FragmentNode__CardinalityAssignment_3_1 ) ) ;
    public final void rule__FragmentNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2883:1: ( ( ( rule__FragmentNode__CardinalityAssignment_3_1 ) ) )
            // InternalDataDsl.g:2884:1: ( ( rule__FragmentNode__CardinalityAssignment_3_1 ) )
            {
            // InternalDataDsl.g:2884:1: ( ( rule__FragmentNode__CardinalityAssignment_3_1 ) )
            // InternalDataDsl.g:2885:2: ( rule__FragmentNode__CardinalityAssignment_3_1 )
            {
             before(grammarAccess.getFragmentNodeAccess().getCardinalityAssignment_3_1()); 
            // InternalDataDsl.g:2886:2: ( rule__FragmentNode__CardinalityAssignment_3_1 )
            // InternalDataDsl.g:2886:3: rule__FragmentNode__CardinalityAssignment_3_1
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
    // InternalDataDsl.g:2894:1: rule__FragmentNode__Group_3__2 : rule__FragmentNode__Group_3__2__Impl ;
    public final void rule__FragmentNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2898:1: ( rule__FragmentNode__Group_3__2__Impl )
            // InternalDataDsl.g:2899:2: rule__FragmentNode__Group_3__2__Impl
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
    // InternalDataDsl.g:2905:1: rule__FragmentNode__Group_3__2__Impl : ( ']' ) ;
    public final void rule__FragmentNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2909:1: ( ( ']' ) )
            // InternalDataDsl.g:2910:1: ( ']' )
            {
            // InternalDataDsl.g:2910:1: ( ']' )
            // InternalDataDsl.g:2911:2: ']'
            {
             before(grammarAccess.getFragmentNodeAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalDataDsl.g:2921:1: rule__FragmentNode__Group_4__0 : rule__FragmentNode__Group_4__0__Impl rule__FragmentNode__Group_4__1 ;
    public final void rule__FragmentNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2925:1: ( rule__FragmentNode__Group_4__0__Impl rule__FragmentNode__Group_4__1 )
            // InternalDataDsl.g:2926:2: rule__FragmentNode__Group_4__0__Impl rule__FragmentNode__Group_4__1
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
    // InternalDataDsl.g:2933:1: rule__FragmentNode__Group_4__0__Impl : ( '(' ) ;
    public final void rule__FragmentNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2937:1: ( ( '(' ) )
            // InternalDataDsl.g:2938:1: ( '(' )
            {
            // InternalDataDsl.g:2938:1: ( '(' )
            // InternalDataDsl.g:2939:2: '('
            {
             before(grammarAccess.getFragmentNodeAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalDataDsl.g:2948:1: rule__FragmentNode__Group_4__1 : rule__FragmentNode__Group_4__1__Impl rule__FragmentNode__Group_4__2 ;
    public final void rule__FragmentNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2952:1: ( rule__FragmentNode__Group_4__1__Impl rule__FragmentNode__Group_4__2 )
            // InternalDataDsl.g:2953:2: rule__FragmentNode__Group_4__1__Impl rule__FragmentNode__Group_4__2
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
    // InternalDataDsl.g:2960:1: rule__FragmentNode__Group_4__1__Impl : ( ( rule__FragmentNode__OptionsAssignment_4_1 ) ) ;
    public final void rule__FragmentNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2964:1: ( ( ( rule__FragmentNode__OptionsAssignment_4_1 ) ) )
            // InternalDataDsl.g:2965:1: ( ( rule__FragmentNode__OptionsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:2965:1: ( ( rule__FragmentNode__OptionsAssignment_4_1 ) )
            // InternalDataDsl.g:2966:2: ( rule__FragmentNode__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getFragmentNodeAccess().getOptionsAssignment_4_1()); 
            // InternalDataDsl.g:2967:2: ( rule__FragmentNode__OptionsAssignment_4_1 )
            // InternalDataDsl.g:2967:3: rule__FragmentNode__OptionsAssignment_4_1
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
    // InternalDataDsl.g:2975:1: rule__FragmentNode__Group_4__2 : rule__FragmentNode__Group_4__2__Impl rule__FragmentNode__Group_4__3 ;
    public final void rule__FragmentNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2979:1: ( rule__FragmentNode__Group_4__2__Impl rule__FragmentNode__Group_4__3 )
            // InternalDataDsl.g:2980:2: rule__FragmentNode__Group_4__2__Impl rule__FragmentNode__Group_4__3
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
    // InternalDataDsl.g:2987:1: rule__FragmentNode__Group_4__2__Impl : ( ( rule__FragmentNode__Group_4_2__0 )* ) ;
    public final void rule__FragmentNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2991:1: ( ( ( rule__FragmentNode__Group_4_2__0 )* ) )
            // InternalDataDsl.g:2992:1: ( ( rule__FragmentNode__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:2992:1: ( ( rule__FragmentNode__Group_4_2__0 )* )
            // InternalDataDsl.g:2993:2: ( rule__FragmentNode__Group_4_2__0 )*
            {
             before(grammarAccess.getFragmentNodeAccess().getGroup_4_2()); 
            // InternalDataDsl.g:2994:2: ( rule__FragmentNode__Group_4_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==68) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDataDsl.g:2994:3: rule__FragmentNode__Group_4_2__0
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
    // InternalDataDsl.g:3002:1: rule__FragmentNode__Group_4__3 : rule__FragmentNode__Group_4__3__Impl ;
    public final void rule__FragmentNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3006:1: ( rule__FragmentNode__Group_4__3__Impl )
            // InternalDataDsl.g:3007:2: rule__FragmentNode__Group_4__3__Impl
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
    // InternalDataDsl.g:3013:1: rule__FragmentNode__Group_4__3__Impl : ( ')' ) ;
    public final void rule__FragmentNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3017:1: ( ( ')' ) )
            // InternalDataDsl.g:3018:1: ( ')' )
            {
            // InternalDataDsl.g:3018:1: ( ')' )
            // InternalDataDsl.g:3019:2: ')'
            {
             before(grammarAccess.getFragmentNodeAccess().getRightParenthesisKeyword_4_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalDataDsl.g:3029:1: rule__FragmentNode__Group_4_2__0 : rule__FragmentNode__Group_4_2__0__Impl rule__FragmentNode__Group_4_2__1 ;
    public final void rule__FragmentNode__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3033:1: ( rule__FragmentNode__Group_4_2__0__Impl rule__FragmentNode__Group_4_2__1 )
            // InternalDataDsl.g:3034:2: rule__FragmentNode__Group_4_2__0__Impl rule__FragmentNode__Group_4_2__1
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
    // InternalDataDsl.g:3041:1: rule__FragmentNode__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__FragmentNode__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3045:1: ( ( ',' ) )
            // InternalDataDsl.g:3046:1: ( ',' )
            {
            // InternalDataDsl.g:3046:1: ( ',' )
            // InternalDataDsl.g:3047:2: ','
            {
             before(grammarAccess.getFragmentNodeAccess().getCommaKeyword_4_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:3056:1: rule__FragmentNode__Group_4_2__1 : rule__FragmentNode__Group_4_2__1__Impl ;
    public final void rule__FragmentNode__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3060:1: ( rule__FragmentNode__Group_4_2__1__Impl )
            // InternalDataDsl.g:3061:2: rule__FragmentNode__Group_4_2__1__Impl
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
    // InternalDataDsl.g:3067:1: rule__FragmentNode__Group_4_2__1__Impl : ( ( rule__FragmentNode__OptionsAssignment_4_2_1 ) ) ;
    public final void rule__FragmentNode__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3071:1: ( ( ( rule__FragmentNode__OptionsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:3072:1: ( ( rule__FragmentNode__OptionsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:3072:1: ( ( rule__FragmentNode__OptionsAssignment_4_2_1 ) )
            // InternalDataDsl.g:3073:2: ( rule__FragmentNode__OptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getFragmentNodeAccess().getOptionsAssignment_4_2_1()); 
            // InternalDataDsl.g:3074:2: ( rule__FragmentNode__OptionsAssignment_4_2_1 )
            // InternalDataDsl.g:3074:3: rule__FragmentNode__OptionsAssignment_4_2_1
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
    // InternalDataDsl.g:3083:1: rule__PrimitiveNode__Group__0 : rule__PrimitiveNode__Group__0__Impl rule__PrimitiveNode__Group__1 ;
    public final void rule__PrimitiveNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3087:1: ( rule__PrimitiveNode__Group__0__Impl rule__PrimitiveNode__Group__1 )
            // InternalDataDsl.g:3088:2: rule__PrimitiveNode__Group__0__Impl rule__PrimitiveNode__Group__1
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
    // InternalDataDsl.g:3095:1: rule__PrimitiveNode__Group__0__Impl : ( ( rule__PrimitiveNode__Alternatives_0 )? ) ;
    public final void rule__PrimitiveNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3099:1: ( ( ( rule__PrimitiveNode__Alternatives_0 )? ) )
            // InternalDataDsl.g:3100:1: ( ( rule__PrimitiveNode__Alternatives_0 )? )
            {
            // InternalDataDsl.g:3100:1: ( ( rule__PrimitiveNode__Alternatives_0 )? )
            // InternalDataDsl.g:3101:2: ( rule__PrimitiveNode__Alternatives_0 )?
            {
             before(grammarAccess.getPrimitiveNodeAccess().getAlternatives_0()); 
            // InternalDataDsl.g:3102:2: ( rule__PrimitiveNode__Alternatives_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=79 && LA31_0<=80)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataDsl.g:3102:3: rule__PrimitiveNode__Alternatives_0
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
    // InternalDataDsl.g:3110:1: rule__PrimitiveNode__Group__1 : rule__PrimitiveNode__Group__1__Impl rule__PrimitiveNode__Group__2 ;
    public final void rule__PrimitiveNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3114:1: ( rule__PrimitiveNode__Group__1__Impl rule__PrimitiveNode__Group__2 )
            // InternalDataDsl.g:3115:2: rule__PrimitiveNode__Group__1__Impl rule__PrimitiveNode__Group__2
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
    // InternalDataDsl.g:3122:1: rule__PrimitiveNode__Group__1__Impl : ( ( rule__PrimitiveNode__TypeAssignment_1 ) ) ;
    public final void rule__PrimitiveNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3126:1: ( ( ( rule__PrimitiveNode__TypeAssignment_1 ) ) )
            // InternalDataDsl.g:3127:1: ( ( rule__PrimitiveNode__TypeAssignment_1 ) )
            {
            // InternalDataDsl.g:3127:1: ( ( rule__PrimitiveNode__TypeAssignment_1 ) )
            // InternalDataDsl.g:3128:2: ( rule__PrimitiveNode__TypeAssignment_1 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getTypeAssignment_1()); 
            // InternalDataDsl.g:3129:2: ( rule__PrimitiveNode__TypeAssignment_1 )
            // InternalDataDsl.g:3129:3: rule__PrimitiveNode__TypeAssignment_1
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
    // InternalDataDsl.g:3137:1: rule__PrimitiveNode__Group__2 : rule__PrimitiveNode__Group__2__Impl rule__PrimitiveNode__Group__3 ;
    public final void rule__PrimitiveNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3141:1: ( rule__PrimitiveNode__Group__2__Impl rule__PrimitiveNode__Group__3 )
            // InternalDataDsl.g:3142:2: rule__PrimitiveNode__Group__2__Impl rule__PrimitiveNode__Group__3
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
    // InternalDataDsl.g:3149:1: rule__PrimitiveNode__Group__2__Impl : ( ( rule__PrimitiveNode__NameAssignment_2 ) ) ;
    public final void rule__PrimitiveNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3153:1: ( ( ( rule__PrimitiveNode__NameAssignment_2 ) ) )
            // InternalDataDsl.g:3154:1: ( ( rule__PrimitiveNode__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:3154:1: ( ( rule__PrimitiveNode__NameAssignment_2 ) )
            // InternalDataDsl.g:3155:2: ( rule__PrimitiveNode__NameAssignment_2 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:3156:2: ( rule__PrimitiveNode__NameAssignment_2 )
            // InternalDataDsl.g:3156:3: rule__PrimitiveNode__NameAssignment_2
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
    // InternalDataDsl.g:3164:1: rule__PrimitiveNode__Group__3 : rule__PrimitiveNode__Group__3__Impl rule__PrimitiveNode__Group__4 ;
    public final void rule__PrimitiveNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3168:1: ( rule__PrimitiveNode__Group__3__Impl rule__PrimitiveNode__Group__4 )
            // InternalDataDsl.g:3169:2: rule__PrimitiveNode__Group__3__Impl rule__PrimitiveNode__Group__4
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
    // InternalDataDsl.g:3176:1: rule__PrimitiveNode__Group__3__Impl : ( ( rule__PrimitiveNode__Group_3__0 )? ) ;
    public final void rule__PrimitiveNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3180:1: ( ( ( rule__PrimitiveNode__Group_3__0 )? ) )
            // InternalDataDsl.g:3181:1: ( ( rule__PrimitiveNode__Group_3__0 )? )
            {
            // InternalDataDsl.g:3181:1: ( ( rule__PrimitiveNode__Group_3__0 )? )
            // InternalDataDsl.g:3182:2: ( rule__PrimitiveNode__Group_3__0 )?
            {
             before(grammarAccess.getPrimitiveNodeAccess().getGroup_3()); 
            // InternalDataDsl.g:3183:2: ( rule__PrimitiveNode__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==67) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataDsl.g:3183:3: rule__PrimitiveNode__Group_3__0
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
    // InternalDataDsl.g:3191:1: rule__PrimitiveNode__Group__4 : rule__PrimitiveNode__Group__4__Impl ;
    public final void rule__PrimitiveNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3195:1: ( rule__PrimitiveNode__Group__4__Impl )
            // InternalDataDsl.g:3196:2: rule__PrimitiveNode__Group__4__Impl
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
    // InternalDataDsl.g:3202:1: rule__PrimitiveNode__Group__4__Impl : ( ( rule__PrimitiveNode__Group_4__0 )? ) ;
    public final void rule__PrimitiveNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3206:1: ( ( ( rule__PrimitiveNode__Group_4__0 )? ) )
            // InternalDataDsl.g:3207:1: ( ( rule__PrimitiveNode__Group_4__0 )? )
            {
            // InternalDataDsl.g:3207:1: ( ( rule__PrimitiveNode__Group_4__0 )? )
            // InternalDataDsl.g:3208:2: ( rule__PrimitiveNode__Group_4__0 )?
            {
             before(grammarAccess.getPrimitiveNodeAccess().getGroup_4()); 
            // InternalDataDsl.g:3209:2: ( rule__PrimitiveNode__Group_4__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==70) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataDsl.g:3209:3: rule__PrimitiveNode__Group_4__0
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
    // InternalDataDsl.g:3218:1: rule__PrimitiveNode__Group_3__0 : rule__PrimitiveNode__Group_3__0__Impl rule__PrimitiveNode__Group_3__1 ;
    public final void rule__PrimitiveNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3222:1: ( rule__PrimitiveNode__Group_3__0__Impl rule__PrimitiveNode__Group_3__1 )
            // InternalDataDsl.g:3223:2: rule__PrimitiveNode__Group_3__0__Impl rule__PrimitiveNode__Group_3__1
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
    // InternalDataDsl.g:3230:1: rule__PrimitiveNode__Group_3__0__Impl : ( '[' ) ;
    public final void rule__PrimitiveNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3234:1: ( ( '[' ) )
            // InternalDataDsl.g:3235:1: ( '[' )
            {
            // InternalDataDsl.g:3235:1: ( '[' )
            // InternalDataDsl.g:3236:2: '['
            {
             before(grammarAccess.getPrimitiveNodeAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,67,FOLLOW_2); 
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
    // InternalDataDsl.g:3245:1: rule__PrimitiveNode__Group_3__1 : rule__PrimitiveNode__Group_3__1__Impl rule__PrimitiveNode__Group_3__2 ;
    public final void rule__PrimitiveNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3249:1: ( rule__PrimitiveNode__Group_3__1__Impl rule__PrimitiveNode__Group_3__2 )
            // InternalDataDsl.g:3250:2: rule__PrimitiveNode__Group_3__1__Impl rule__PrimitiveNode__Group_3__2
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
    // InternalDataDsl.g:3257:1: rule__PrimitiveNode__Group_3__1__Impl : ( ( rule__PrimitiveNode__CardinalityAssignment_3_1 ) ) ;
    public final void rule__PrimitiveNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3261:1: ( ( ( rule__PrimitiveNode__CardinalityAssignment_3_1 ) ) )
            // InternalDataDsl.g:3262:1: ( ( rule__PrimitiveNode__CardinalityAssignment_3_1 ) )
            {
            // InternalDataDsl.g:3262:1: ( ( rule__PrimitiveNode__CardinalityAssignment_3_1 ) )
            // InternalDataDsl.g:3263:2: ( rule__PrimitiveNode__CardinalityAssignment_3_1 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getCardinalityAssignment_3_1()); 
            // InternalDataDsl.g:3264:2: ( rule__PrimitiveNode__CardinalityAssignment_3_1 )
            // InternalDataDsl.g:3264:3: rule__PrimitiveNode__CardinalityAssignment_3_1
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
    // InternalDataDsl.g:3272:1: rule__PrimitiveNode__Group_3__2 : rule__PrimitiveNode__Group_3__2__Impl ;
    public final void rule__PrimitiveNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3276:1: ( rule__PrimitiveNode__Group_3__2__Impl )
            // InternalDataDsl.g:3277:2: rule__PrimitiveNode__Group_3__2__Impl
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
    // InternalDataDsl.g:3283:1: rule__PrimitiveNode__Group_3__2__Impl : ( ']' ) ;
    public final void rule__PrimitiveNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3287:1: ( ( ']' ) )
            // InternalDataDsl.g:3288:1: ( ']' )
            {
            // InternalDataDsl.g:3288:1: ( ']' )
            // InternalDataDsl.g:3289:2: ']'
            {
             before(grammarAccess.getPrimitiveNodeAccess().getRightSquareBracketKeyword_3_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalDataDsl.g:3299:1: rule__PrimitiveNode__Group_4__0 : rule__PrimitiveNode__Group_4__0__Impl rule__PrimitiveNode__Group_4__1 ;
    public final void rule__PrimitiveNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3303:1: ( rule__PrimitiveNode__Group_4__0__Impl rule__PrimitiveNode__Group_4__1 )
            // InternalDataDsl.g:3304:2: rule__PrimitiveNode__Group_4__0__Impl rule__PrimitiveNode__Group_4__1
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
    // InternalDataDsl.g:3311:1: rule__PrimitiveNode__Group_4__0__Impl : ( '(' ) ;
    public final void rule__PrimitiveNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3315:1: ( ( '(' ) )
            // InternalDataDsl.g:3316:1: ( '(' )
            {
            // InternalDataDsl.g:3316:1: ( '(' )
            // InternalDataDsl.g:3317:2: '('
            {
             before(grammarAccess.getPrimitiveNodeAccess().getLeftParenthesisKeyword_4_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalDataDsl.g:3326:1: rule__PrimitiveNode__Group_4__1 : rule__PrimitiveNode__Group_4__1__Impl rule__PrimitiveNode__Group_4__2 ;
    public final void rule__PrimitiveNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3330:1: ( rule__PrimitiveNode__Group_4__1__Impl rule__PrimitiveNode__Group_4__2 )
            // InternalDataDsl.g:3331:2: rule__PrimitiveNode__Group_4__1__Impl rule__PrimitiveNode__Group_4__2
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
    // InternalDataDsl.g:3338:1: rule__PrimitiveNode__Group_4__1__Impl : ( ( rule__PrimitiveNode__OptionsAssignment_4_1 ) ) ;
    public final void rule__PrimitiveNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3342:1: ( ( ( rule__PrimitiveNode__OptionsAssignment_4_1 ) ) )
            // InternalDataDsl.g:3343:1: ( ( rule__PrimitiveNode__OptionsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:3343:1: ( ( rule__PrimitiveNode__OptionsAssignment_4_1 ) )
            // InternalDataDsl.g:3344:2: ( rule__PrimitiveNode__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getOptionsAssignment_4_1()); 
            // InternalDataDsl.g:3345:2: ( rule__PrimitiveNode__OptionsAssignment_4_1 )
            // InternalDataDsl.g:3345:3: rule__PrimitiveNode__OptionsAssignment_4_1
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
    // InternalDataDsl.g:3353:1: rule__PrimitiveNode__Group_4__2 : rule__PrimitiveNode__Group_4__2__Impl rule__PrimitiveNode__Group_4__3 ;
    public final void rule__PrimitiveNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3357:1: ( rule__PrimitiveNode__Group_4__2__Impl rule__PrimitiveNode__Group_4__3 )
            // InternalDataDsl.g:3358:2: rule__PrimitiveNode__Group_4__2__Impl rule__PrimitiveNode__Group_4__3
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
    // InternalDataDsl.g:3365:1: rule__PrimitiveNode__Group_4__2__Impl : ( ( rule__PrimitiveNode__Group_4_2__0 )* ) ;
    public final void rule__PrimitiveNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3369:1: ( ( ( rule__PrimitiveNode__Group_4_2__0 )* ) )
            // InternalDataDsl.g:3370:1: ( ( rule__PrimitiveNode__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:3370:1: ( ( rule__PrimitiveNode__Group_4_2__0 )* )
            // InternalDataDsl.g:3371:2: ( rule__PrimitiveNode__Group_4_2__0 )*
            {
             before(grammarAccess.getPrimitiveNodeAccess().getGroup_4_2()); 
            // InternalDataDsl.g:3372:2: ( rule__PrimitiveNode__Group_4_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==68) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalDataDsl.g:3372:3: rule__PrimitiveNode__Group_4_2__0
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
    // InternalDataDsl.g:3380:1: rule__PrimitiveNode__Group_4__3 : rule__PrimitiveNode__Group_4__3__Impl ;
    public final void rule__PrimitiveNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3384:1: ( rule__PrimitiveNode__Group_4__3__Impl )
            // InternalDataDsl.g:3385:2: rule__PrimitiveNode__Group_4__3__Impl
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
    // InternalDataDsl.g:3391:1: rule__PrimitiveNode__Group_4__3__Impl : ( ')' ) ;
    public final void rule__PrimitiveNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3395:1: ( ( ')' ) )
            // InternalDataDsl.g:3396:1: ( ')' )
            {
            // InternalDataDsl.g:3396:1: ( ')' )
            // InternalDataDsl.g:3397:2: ')'
            {
             before(grammarAccess.getPrimitiveNodeAccess().getRightParenthesisKeyword_4_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalDataDsl.g:3407:1: rule__PrimitiveNode__Group_4_2__0 : rule__PrimitiveNode__Group_4_2__0__Impl rule__PrimitiveNode__Group_4_2__1 ;
    public final void rule__PrimitiveNode__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3411:1: ( rule__PrimitiveNode__Group_4_2__0__Impl rule__PrimitiveNode__Group_4_2__1 )
            // InternalDataDsl.g:3412:2: rule__PrimitiveNode__Group_4_2__0__Impl rule__PrimitiveNode__Group_4_2__1
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
    // InternalDataDsl.g:3419:1: rule__PrimitiveNode__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__PrimitiveNode__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3423:1: ( ( ',' ) )
            // InternalDataDsl.g:3424:1: ( ',' )
            {
            // InternalDataDsl.g:3424:1: ( ',' )
            // InternalDataDsl.g:3425:2: ','
            {
             before(grammarAccess.getPrimitiveNodeAccess().getCommaKeyword_4_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:3434:1: rule__PrimitiveNode__Group_4_2__1 : rule__PrimitiveNode__Group_4_2__1__Impl ;
    public final void rule__PrimitiveNode__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3438:1: ( rule__PrimitiveNode__Group_4_2__1__Impl )
            // InternalDataDsl.g:3439:2: rule__PrimitiveNode__Group_4_2__1__Impl
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
    // InternalDataDsl.g:3445:1: rule__PrimitiveNode__Group_4_2__1__Impl : ( ( rule__PrimitiveNode__OptionsAssignment_4_2_1 ) ) ;
    public final void rule__PrimitiveNode__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3449:1: ( ( ( rule__PrimitiveNode__OptionsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:3450:1: ( ( rule__PrimitiveNode__OptionsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:3450:1: ( ( rule__PrimitiveNode__OptionsAssignment_4_2_1 ) )
            // InternalDataDsl.g:3451:2: ( rule__PrimitiveNode__OptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getOptionsAssignment_4_2_1()); 
            // InternalDataDsl.g:3452:2: ( rule__PrimitiveNode__OptionsAssignment_4_2_1 )
            // InternalDataDsl.g:3452:3: rule__PrimitiveNode__OptionsAssignment_4_2_1
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
    // InternalDataDsl.g:3461:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3465:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalDataDsl.g:3466:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
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
    // InternalDataDsl.g:3473:1: rule__Cardinality__Group__0__Impl : ( ( rule__Cardinality__MinAssignment_0 ) ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3477:1: ( ( ( rule__Cardinality__MinAssignment_0 ) ) )
            // InternalDataDsl.g:3478:1: ( ( rule__Cardinality__MinAssignment_0 ) )
            {
            // InternalDataDsl.g:3478:1: ( ( rule__Cardinality__MinAssignment_0 ) )
            // InternalDataDsl.g:3479:2: ( rule__Cardinality__MinAssignment_0 )
            {
             before(grammarAccess.getCardinalityAccess().getMinAssignment_0()); 
            // InternalDataDsl.g:3480:2: ( rule__Cardinality__MinAssignment_0 )
            // InternalDataDsl.g:3480:3: rule__Cardinality__MinAssignment_0
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
    // InternalDataDsl.g:3488:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3492:1: ( rule__Cardinality__Group__1__Impl )
            // InternalDataDsl.g:3493:2: rule__Cardinality__Group__1__Impl
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
    // InternalDataDsl.g:3499:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__Group_1__0 )? ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3503:1: ( ( ( rule__Cardinality__Group_1__0 )? ) )
            // InternalDataDsl.g:3504:1: ( ( rule__Cardinality__Group_1__0 )? )
            {
            // InternalDataDsl.g:3504:1: ( ( rule__Cardinality__Group_1__0 )? )
            // InternalDataDsl.g:3505:2: ( rule__Cardinality__Group_1__0 )?
            {
             before(grammarAccess.getCardinalityAccess().getGroup_1()); 
            // InternalDataDsl.g:3506:2: ( rule__Cardinality__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==68) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataDsl.g:3506:3: rule__Cardinality__Group_1__0
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
    // InternalDataDsl.g:3515:1: rule__Cardinality__Group_1__0 : rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 ;
    public final void rule__Cardinality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3519:1: ( rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1 )
            // InternalDataDsl.g:3520:2: rule__Cardinality__Group_1__0__Impl rule__Cardinality__Group_1__1
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
    // InternalDataDsl.g:3527:1: rule__Cardinality__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Cardinality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3531:1: ( ( ',' ) )
            // InternalDataDsl.g:3532:1: ( ',' )
            {
            // InternalDataDsl.g:3532:1: ( ',' )
            // InternalDataDsl.g:3533:2: ','
            {
             before(grammarAccess.getCardinalityAccess().getCommaKeyword_1_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:3542:1: rule__Cardinality__Group_1__1 : rule__Cardinality__Group_1__1__Impl ;
    public final void rule__Cardinality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3546:1: ( rule__Cardinality__Group_1__1__Impl )
            // InternalDataDsl.g:3547:2: rule__Cardinality__Group_1__1__Impl
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
    // InternalDataDsl.g:3553:1: rule__Cardinality__Group_1__1__Impl : ( ( rule__Cardinality__MaxAssignment_1_1 ) ) ;
    public final void rule__Cardinality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3557:1: ( ( ( rule__Cardinality__MaxAssignment_1_1 ) ) )
            // InternalDataDsl.g:3558:1: ( ( rule__Cardinality__MaxAssignment_1_1 ) )
            {
            // InternalDataDsl.g:3558:1: ( ( rule__Cardinality__MaxAssignment_1_1 ) )
            // InternalDataDsl.g:3559:2: ( rule__Cardinality__MaxAssignment_1_1 )
            {
             before(grammarAccess.getCardinalityAccess().getMaxAssignment_1_1()); 
            // InternalDataDsl.g:3560:2: ( rule__Cardinality__MaxAssignment_1_1 )
            // InternalDataDsl.g:3560:3: rule__Cardinality__MaxAssignment_1_1
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
    // InternalDataDsl.g:3569:1: rule__DataDescription__Group__0 : rule__DataDescription__Group__0__Impl rule__DataDescription__Group__1 ;
    public final void rule__DataDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3573:1: ( rule__DataDescription__Group__0__Impl rule__DataDescription__Group__1 )
            // InternalDataDsl.g:3574:2: rule__DataDescription__Group__0__Impl rule__DataDescription__Group__1
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
    // InternalDataDsl.g:3581:1: rule__DataDescription__Group__0__Impl : ( 'description' ) ;
    public final void rule__DataDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3585:1: ( ( 'description' ) )
            // InternalDataDsl.g:3586:1: ( 'description' )
            {
            // InternalDataDsl.g:3586:1: ( 'description' )
            // InternalDataDsl.g:3587:2: 'description'
            {
             before(grammarAccess.getDataDescriptionAccess().getDescriptionKeyword_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalDataDsl.g:3596:1: rule__DataDescription__Group__1 : rule__DataDescription__Group__1__Impl rule__DataDescription__Group__2 ;
    public final void rule__DataDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3600:1: ( rule__DataDescription__Group__1__Impl rule__DataDescription__Group__2 )
            // InternalDataDsl.g:3601:2: rule__DataDescription__Group__1__Impl rule__DataDescription__Group__2
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
    // InternalDataDsl.g:3608:1: rule__DataDescription__Group__1__Impl : ( ( rule__DataDescription__FormatAssignment_1 ) ) ;
    public final void rule__DataDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3612:1: ( ( ( rule__DataDescription__FormatAssignment_1 ) ) )
            // InternalDataDsl.g:3613:1: ( ( rule__DataDescription__FormatAssignment_1 ) )
            {
            // InternalDataDsl.g:3613:1: ( ( rule__DataDescription__FormatAssignment_1 ) )
            // InternalDataDsl.g:3614:2: ( rule__DataDescription__FormatAssignment_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getFormatAssignment_1()); 
            // InternalDataDsl.g:3615:2: ( rule__DataDescription__FormatAssignment_1 )
            // InternalDataDsl.g:3615:3: rule__DataDescription__FormatAssignment_1
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
    // InternalDataDsl.g:3623:1: rule__DataDescription__Group__2 : rule__DataDescription__Group__2__Impl rule__DataDescription__Group__3 ;
    public final void rule__DataDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3627:1: ( rule__DataDescription__Group__2__Impl rule__DataDescription__Group__3 )
            // InternalDataDsl.g:3628:2: rule__DataDescription__Group__2__Impl rule__DataDescription__Group__3
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
    // InternalDataDsl.g:3635:1: rule__DataDescription__Group__2__Impl : ( ( rule__DataDescription__NameAssignment_2 ) ) ;
    public final void rule__DataDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3639:1: ( ( ( rule__DataDescription__NameAssignment_2 ) ) )
            // InternalDataDsl.g:3640:1: ( ( rule__DataDescription__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:3640:1: ( ( rule__DataDescription__NameAssignment_2 ) )
            // InternalDataDsl.g:3641:2: ( rule__DataDescription__NameAssignment_2 )
            {
             before(grammarAccess.getDataDescriptionAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:3642:2: ( rule__DataDescription__NameAssignment_2 )
            // InternalDataDsl.g:3642:3: rule__DataDescription__NameAssignment_2
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
    // InternalDataDsl.g:3650:1: rule__DataDescription__Group__3 : rule__DataDescription__Group__3__Impl rule__DataDescription__Group__4 ;
    public final void rule__DataDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3654:1: ( rule__DataDescription__Group__3__Impl rule__DataDescription__Group__4 )
            // InternalDataDsl.g:3655:2: rule__DataDescription__Group__3__Impl rule__DataDescription__Group__4
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
    // InternalDataDsl.g:3662:1: rule__DataDescription__Group__3__Impl : ( ( rule__DataDescription__Group_3__0 )? ) ;
    public final void rule__DataDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3666:1: ( ( ( rule__DataDescription__Group_3__0 )? ) )
            // InternalDataDsl.g:3667:1: ( ( rule__DataDescription__Group_3__0 )? )
            {
            // InternalDataDsl.g:3667:1: ( ( rule__DataDescription__Group_3__0 )? )
            // InternalDataDsl.g:3668:2: ( rule__DataDescription__Group_3__0 )?
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_3()); 
            // InternalDataDsl.g:3669:2: ( rule__DataDescription__Group_3__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==73) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataDsl.g:3669:3: rule__DataDescription__Group_3__0
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
    // InternalDataDsl.g:3677:1: rule__DataDescription__Group__4 : rule__DataDescription__Group__4__Impl rule__DataDescription__Group__5 ;
    public final void rule__DataDescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3681:1: ( rule__DataDescription__Group__4__Impl rule__DataDescription__Group__5 )
            // InternalDataDsl.g:3682:2: rule__DataDescription__Group__4__Impl rule__DataDescription__Group__5
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
    // InternalDataDsl.g:3689:1: rule__DataDescription__Group__4__Impl : ( '{' ) ;
    public final void rule__DataDescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3693:1: ( ( '{' ) )
            // InternalDataDsl.g:3694:1: ( '{' )
            {
            // InternalDataDsl.g:3694:1: ( '{' )
            // InternalDataDsl.g:3695:2: '{'
            {
             before(grammarAccess.getDataDescriptionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,64,FOLLOW_2); 
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
    // InternalDataDsl.g:3704:1: rule__DataDescription__Group__5 : rule__DataDescription__Group__5__Impl rule__DataDescription__Group__6 ;
    public final void rule__DataDescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3708:1: ( rule__DataDescription__Group__5__Impl rule__DataDescription__Group__6 )
            // InternalDataDsl.g:3709:2: rule__DataDescription__Group__5__Impl rule__DataDescription__Group__6
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
    // InternalDataDsl.g:3716:1: rule__DataDescription__Group__5__Impl : ( ( rule__DataDescription__Group_5__0 )? ) ;
    public final void rule__DataDescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3720:1: ( ( ( rule__DataDescription__Group_5__0 )? ) )
            // InternalDataDsl.g:3721:1: ( ( rule__DataDescription__Group_5__0 )? )
            {
            // InternalDataDsl.g:3721:1: ( ( rule__DataDescription__Group_5__0 )? )
            // InternalDataDsl.g:3722:2: ( rule__DataDescription__Group_5__0 )?
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_5()); 
            // InternalDataDsl.g:3723:2: ( rule__DataDescription__Group_5__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID||(LA37_0>=21 && LA37_0<=41)||LA37_0==62||(LA37_0>=79 && LA37_0<=80)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataDsl.g:3723:3: rule__DataDescription__Group_5__0
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
    // InternalDataDsl.g:3731:1: rule__DataDescription__Group__6 : rule__DataDescription__Group__6__Impl rule__DataDescription__Group__7 ;
    public final void rule__DataDescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3735:1: ( rule__DataDescription__Group__6__Impl rule__DataDescription__Group__7 )
            // InternalDataDsl.g:3736:2: rule__DataDescription__Group__6__Impl rule__DataDescription__Group__7
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
    // InternalDataDsl.g:3743:1: rule__DataDescription__Group__6__Impl : ( '}' ) ;
    public final void rule__DataDescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3747:1: ( ( '}' ) )
            // InternalDataDsl.g:3748:1: ( '}' )
            {
            // InternalDataDsl.g:3748:1: ( '}' )
            // InternalDataDsl.g:3749:2: '}'
            {
             before(grammarAccess.getDataDescriptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,65,FOLLOW_2); 
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
    // InternalDataDsl.g:3758:1: rule__DataDescription__Group__7 : rule__DataDescription__Group__7__Impl ;
    public final void rule__DataDescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3762:1: ( rule__DataDescription__Group__7__Impl )
            // InternalDataDsl.g:3763:2: rule__DataDescription__Group__7__Impl
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
    // InternalDataDsl.g:3769:1: rule__DataDescription__Group__7__Impl : ( ( rule__DataDescription__Group_7__0 )? ) ;
    public final void rule__DataDescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3773:1: ( ( ( rule__DataDescription__Group_7__0 )? ) )
            // InternalDataDsl.g:3774:1: ( ( rule__DataDescription__Group_7__0 )? )
            {
            // InternalDataDsl.g:3774:1: ( ( rule__DataDescription__Group_7__0 )? )
            // InternalDataDsl.g:3775:2: ( rule__DataDescription__Group_7__0 )?
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_7()); 
            // InternalDataDsl.g:3776:2: ( rule__DataDescription__Group_7__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==70) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataDsl.g:3776:3: rule__DataDescription__Group_7__0
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
    // InternalDataDsl.g:3785:1: rule__DataDescription__Group_3__0 : rule__DataDescription__Group_3__0__Impl rule__DataDescription__Group_3__1 ;
    public final void rule__DataDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3789:1: ( rule__DataDescription__Group_3__0__Impl rule__DataDescription__Group_3__1 )
            // InternalDataDsl.g:3790:2: rule__DataDescription__Group_3__0__Impl rule__DataDescription__Group_3__1
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
    // InternalDataDsl.g:3797:1: rule__DataDescription__Group_3__0__Impl : ( ':' ) ;
    public final void rule__DataDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3801:1: ( ( ':' ) )
            // InternalDataDsl.g:3802:1: ( ':' )
            {
            // InternalDataDsl.g:3802:1: ( ':' )
            // InternalDataDsl.g:3803:2: ':'
            {
             before(grammarAccess.getDataDescriptionAccess().getColonKeyword_3_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalDataDsl.g:3812:1: rule__DataDescription__Group_3__1 : rule__DataDescription__Group_3__1__Impl rule__DataDescription__Group_3__2 ;
    public final void rule__DataDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3816:1: ( rule__DataDescription__Group_3__1__Impl rule__DataDescription__Group_3__2 )
            // InternalDataDsl.g:3817:2: rule__DataDescription__Group_3__1__Impl rule__DataDescription__Group_3__2
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
    // InternalDataDsl.g:3824:1: rule__DataDescription__Group_3__1__Impl : ( ( rule__DataDescription__FragmentsAssignment_3_1 ) ) ;
    public final void rule__DataDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3828:1: ( ( ( rule__DataDescription__FragmentsAssignment_3_1 ) ) )
            // InternalDataDsl.g:3829:1: ( ( rule__DataDescription__FragmentsAssignment_3_1 ) )
            {
            // InternalDataDsl.g:3829:1: ( ( rule__DataDescription__FragmentsAssignment_3_1 ) )
            // InternalDataDsl.g:3830:2: ( rule__DataDescription__FragmentsAssignment_3_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsAssignment_3_1()); 
            // InternalDataDsl.g:3831:2: ( rule__DataDescription__FragmentsAssignment_3_1 )
            // InternalDataDsl.g:3831:3: rule__DataDescription__FragmentsAssignment_3_1
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
    // InternalDataDsl.g:3839:1: rule__DataDescription__Group_3__2 : rule__DataDescription__Group_3__2__Impl ;
    public final void rule__DataDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3843:1: ( rule__DataDescription__Group_3__2__Impl )
            // InternalDataDsl.g:3844:2: rule__DataDescription__Group_3__2__Impl
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
    // InternalDataDsl.g:3850:1: rule__DataDescription__Group_3__2__Impl : ( ( rule__DataDescription__Group_3_2__0 )* ) ;
    public final void rule__DataDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3854:1: ( ( ( rule__DataDescription__Group_3_2__0 )* ) )
            // InternalDataDsl.g:3855:1: ( ( rule__DataDescription__Group_3_2__0 )* )
            {
            // InternalDataDsl.g:3855:1: ( ( rule__DataDescription__Group_3_2__0 )* )
            // InternalDataDsl.g:3856:2: ( rule__DataDescription__Group_3_2__0 )*
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_3_2()); 
            // InternalDataDsl.g:3857:2: ( rule__DataDescription__Group_3_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==68) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalDataDsl.g:3857:3: rule__DataDescription__Group_3_2__0
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
    // InternalDataDsl.g:3866:1: rule__DataDescription__Group_3_2__0 : rule__DataDescription__Group_3_2__0__Impl rule__DataDescription__Group_3_2__1 ;
    public final void rule__DataDescription__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3870:1: ( rule__DataDescription__Group_3_2__0__Impl rule__DataDescription__Group_3_2__1 )
            // InternalDataDsl.g:3871:2: rule__DataDescription__Group_3_2__0__Impl rule__DataDescription__Group_3_2__1
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
    // InternalDataDsl.g:3878:1: rule__DataDescription__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DataDescription__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3882:1: ( ( ',' ) )
            // InternalDataDsl.g:3883:1: ( ',' )
            {
            // InternalDataDsl.g:3883:1: ( ',' )
            // InternalDataDsl.g:3884:2: ','
            {
             before(grammarAccess.getDataDescriptionAccess().getCommaKeyword_3_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:3893:1: rule__DataDescription__Group_3_2__1 : rule__DataDescription__Group_3_2__1__Impl ;
    public final void rule__DataDescription__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3897:1: ( rule__DataDescription__Group_3_2__1__Impl )
            // InternalDataDsl.g:3898:2: rule__DataDescription__Group_3_2__1__Impl
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
    // InternalDataDsl.g:3904:1: rule__DataDescription__Group_3_2__1__Impl : ( ( rule__DataDescription__FragmentsAssignment_3_2_1 ) ) ;
    public final void rule__DataDescription__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3908:1: ( ( ( rule__DataDescription__FragmentsAssignment_3_2_1 ) ) )
            // InternalDataDsl.g:3909:1: ( ( rule__DataDescription__FragmentsAssignment_3_2_1 ) )
            {
            // InternalDataDsl.g:3909:1: ( ( rule__DataDescription__FragmentsAssignment_3_2_1 ) )
            // InternalDataDsl.g:3910:2: ( rule__DataDescription__FragmentsAssignment_3_2_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsAssignment_3_2_1()); 
            // InternalDataDsl.g:3911:2: ( rule__DataDescription__FragmentsAssignment_3_2_1 )
            // InternalDataDsl.g:3911:3: rule__DataDescription__FragmentsAssignment_3_2_1
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
    // InternalDataDsl.g:3920:1: rule__DataDescription__Group_5__0 : rule__DataDescription__Group_5__0__Impl rule__DataDescription__Group_5__1 ;
    public final void rule__DataDescription__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3924:1: ( rule__DataDescription__Group_5__0__Impl rule__DataDescription__Group_5__1 )
            // InternalDataDsl.g:3925:2: rule__DataDescription__Group_5__0__Impl rule__DataDescription__Group_5__1
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
    // InternalDataDsl.g:3932:1: rule__DataDescription__Group_5__0__Impl : ( ( rule__DataDescription__NodesAssignment_5_0 ) ) ;
    public final void rule__DataDescription__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3936:1: ( ( ( rule__DataDescription__NodesAssignment_5_0 ) ) )
            // InternalDataDsl.g:3937:1: ( ( rule__DataDescription__NodesAssignment_5_0 ) )
            {
            // InternalDataDsl.g:3937:1: ( ( rule__DataDescription__NodesAssignment_5_0 ) )
            // InternalDataDsl.g:3938:2: ( rule__DataDescription__NodesAssignment_5_0 )
            {
             before(grammarAccess.getDataDescriptionAccess().getNodesAssignment_5_0()); 
            // InternalDataDsl.g:3939:2: ( rule__DataDescription__NodesAssignment_5_0 )
            // InternalDataDsl.g:3939:3: rule__DataDescription__NodesAssignment_5_0
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
    // InternalDataDsl.g:3947:1: rule__DataDescription__Group_5__1 : rule__DataDescription__Group_5__1__Impl ;
    public final void rule__DataDescription__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3951:1: ( rule__DataDescription__Group_5__1__Impl )
            // InternalDataDsl.g:3952:2: rule__DataDescription__Group_5__1__Impl
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
    // InternalDataDsl.g:3958:1: rule__DataDescription__Group_5__1__Impl : ( ( rule__DataDescription__NodesAssignment_5_1 )* ) ;
    public final void rule__DataDescription__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3962:1: ( ( ( rule__DataDescription__NodesAssignment_5_1 )* ) )
            // InternalDataDsl.g:3963:1: ( ( rule__DataDescription__NodesAssignment_5_1 )* )
            {
            // InternalDataDsl.g:3963:1: ( ( rule__DataDescription__NodesAssignment_5_1 )* )
            // InternalDataDsl.g:3964:2: ( rule__DataDescription__NodesAssignment_5_1 )*
            {
             before(grammarAccess.getDataDescriptionAccess().getNodesAssignment_5_1()); 
            // InternalDataDsl.g:3965:2: ( rule__DataDescription__NodesAssignment_5_1 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID||(LA40_0>=21 && LA40_0<=41)||LA40_0==62||(LA40_0>=79 && LA40_0<=80)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalDataDsl.g:3965:3: rule__DataDescription__NodesAssignment_5_1
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
    // InternalDataDsl.g:3974:1: rule__DataDescription__Group_7__0 : rule__DataDescription__Group_7__0__Impl rule__DataDescription__Group_7__1 ;
    public final void rule__DataDescription__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3978:1: ( rule__DataDescription__Group_7__0__Impl rule__DataDescription__Group_7__1 )
            // InternalDataDsl.g:3979:2: rule__DataDescription__Group_7__0__Impl rule__DataDescription__Group_7__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDataDsl.g:3986:1: rule__DataDescription__Group_7__0__Impl : ( '(' ) ;
    public final void rule__DataDescription__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3990:1: ( ( '(' ) )
            // InternalDataDsl.g:3991:1: ( '(' )
            {
            // InternalDataDsl.g:3991:1: ( '(' )
            // InternalDataDsl.g:3992:2: '('
            {
             before(grammarAccess.getDataDescriptionAccess().getLeftParenthesisKeyword_7_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalDataDsl.g:4001:1: rule__DataDescription__Group_7__1 : rule__DataDescription__Group_7__1__Impl rule__DataDescription__Group_7__2 ;
    public final void rule__DataDescription__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4005:1: ( rule__DataDescription__Group_7__1__Impl rule__DataDescription__Group_7__2 )
            // InternalDataDsl.g:4006:2: rule__DataDescription__Group_7__1__Impl rule__DataDescription__Group_7__2
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
    // InternalDataDsl.g:4013:1: rule__DataDescription__Group_7__1__Impl : ( ( rule__DataDescription__OptionsAssignment_7_1 ) ) ;
    public final void rule__DataDescription__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4017:1: ( ( ( rule__DataDescription__OptionsAssignment_7_1 ) ) )
            // InternalDataDsl.g:4018:1: ( ( rule__DataDescription__OptionsAssignment_7_1 ) )
            {
            // InternalDataDsl.g:4018:1: ( ( rule__DataDescription__OptionsAssignment_7_1 ) )
            // InternalDataDsl.g:4019:2: ( rule__DataDescription__OptionsAssignment_7_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getOptionsAssignment_7_1()); 
            // InternalDataDsl.g:4020:2: ( rule__DataDescription__OptionsAssignment_7_1 )
            // InternalDataDsl.g:4020:3: rule__DataDescription__OptionsAssignment_7_1
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
    // InternalDataDsl.g:4028:1: rule__DataDescription__Group_7__2 : rule__DataDescription__Group_7__2__Impl rule__DataDescription__Group_7__3 ;
    public final void rule__DataDescription__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4032:1: ( rule__DataDescription__Group_7__2__Impl rule__DataDescription__Group_7__3 )
            // InternalDataDsl.g:4033:2: rule__DataDescription__Group_7__2__Impl rule__DataDescription__Group_7__3
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
    // InternalDataDsl.g:4040:1: rule__DataDescription__Group_7__2__Impl : ( ( rule__DataDescription__Group_7_2__0 )* ) ;
    public final void rule__DataDescription__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4044:1: ( ( ( rule__DataDescription__Group_7_2__0 )* ) )
            // InternalDataDsl.g:4045:1: ( ( rule__DataDescription__Group_7_2__0 )* )
            {
            // InternalDataDsl.g:4045:1: ( ( rule__DataDescription__Group_7_2__0 )* )
            // InternalDataDsl.g:4046:2: ( rule__DataDescription__Group_7_2__0 )*
            {
             before(grammarAccess.getDataDescriptionAccess().getGroup_7_2()); 
            // InternalDataDsl.g:4047:2: ( rule__DataDescription__Group_7_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==68) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalDataDsl.g:4047:3: rule__DataDescription__Group_7_2__0
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
    // InternalDataDsl.g:4055:1: rule__DataDescription__Group_7__3 : rule__DataDescription__Group_7__3__Impl ;
    public final void rule__DataDescription__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4059:1: ( rule__DataDescription__Group_7__3__Impl )
            // InternalDataDsl.g:4060:2: rule__DataDescription__Group_7__3__Impl
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
    // InternalDataDsl.g:4066:1: rule__DataDescription__Group_7__3__Impl : ( ')' ) ;
    public final void rule__DataDescription__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4070:1: ( ( ')' ) )
            // InternalDataDsl.g:4071:1: ( ')' )
            {
            // InternalDataDsl.g:4071:1: ( ')' )
            // InternalDataDsl.g:4072:2: ')'
            {
             before(grammarAccess.getDataDescriptionAccess().getRightParenthesisKeyword_7_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalDataDsl.g:4082:1: rule__DataDescription__Group_7_2__0 : rule__DataDescription__Group_7_2__0__Impl rule__DataDescription__Group_7_2__1 ;
    public final void rule__DataDescription__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4086:1: ( rule__DataDescription__Group_7_2__0__Impl rule__DataDescription__Group_7_2__1 )
            // InternalDataDsl.g:4087:2: rule__DataDescription__Group_7_2__0__Impl rule__DataDescription__Group_7_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalDataDsl.g:4094:1: rule__DataDescription__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__DataDescription__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4098:1: ( ( ',' ) )
            // InternalDataDsl.g:4099:1: ( ',' )
            {
            // InternalDataDsl.g:4099:1: ( ',' )
            // InternalDataDsl.g:4100:2: ','
            {
             before(grammarAccess.getDataDescriptionAccess().getCommaKeyword_7_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:4109:1: rule__DataDescription__Group_7_2__1 : rule__DataDescription__Group_7_2__1__Impl ;
    public final void rule__DataDescription__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4113:1: ( rule__DataDescription__Group_7_2__1__Impl )
            // InternalDataDsl.g:4114:2: rule__DataDescription__Group_7_2__1__Impl
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
    // InternalDataDsl.g:4120:1: rule__DataDescription__Group_7_2__1__Impl : ( ( rule__DataDescription__OptionsAssignment_7_2_1 ) ) ;
    public final void rule__DataDescription__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4124:1: ( ( ( rule__DataDescription__OptionsAssignment_7_2_1 ) ) )
            // InternalDataDsl.g:4125:1: ( ( rule__DataDescription__OptionsAssignment_7_2_1 ) )
            {
            // InternalDataDsl.g:4125:1: ( ( rule__DataDescription__OptionsAssignment_7_2_1 ) )
            // InternalDataDsl.g:4126:2: ( rule__DataDescription__OptionsAssignment_7_2_1 )
            {
             before(grammarAccess.getDataDescriptionAccess().getOptionsAssignment_7_2_1()); 
            // InternalDataDsl.g:4127:2: ( rule__DataDescription__OptionsAssignment_7_2_1 )
            // InternalDataDsl.g:4127:3: rule__DataDescription__OptionsAssignment_7_2_1
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
    // InternalDataDsl.g:4136:1: rule__Fragment__Group__0 : rule__Fragment__Group__0__Impl rule__Fragment__Group__1 ;
    public final void rule__Fragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4140:1: ( rule__Fragment__Group__0__Impl rule__Fragment__Group__1 )
            // InternalDataDsl.g:4141:2: rule__Fragment__Group__0__Impl rule__Fragment__Group__1
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
    // InternalDataDsl.g:4148:1: rule__Fragment__Group__0__Impl : ( 'fragment' ) ;
    public final void rule__Fragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4152:1: ( ( 'fragment' ) )
            // InternalDataDsl.g:4153:1: ( 'fragment' )
            {
            // InternalDataDsl.g:4153:1: ( 'fragment' )
            // InternalDataDsl.g:4154:2: 'fragment'
            {
             before(grammarAccess.getFragmentAccess().getFragmentKeyword_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalDataDsl.g:4163:1: rule__Fragment__Group__1 : rule__Fragment__Group__1__Impl rule__Fragment__Group__2 ;
    public final void rule__Fragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4167:1: ( rule__Fragment__Group__1__Impl rule__Fragment__Group__2 )
            // InternalDataDsl.g:4168:2: rule__Fragment__Group__1__Impl rule__Fragment__Group__2
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
    // InternalDataDsl.g:4175:1: rule__Fragment__Group__1__Impl : ( ( rule__Fragment__NameAssignment_1 ) ) ;
    public final void rule__Fragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4179:1: ( ( ( rule__Fragment__NameAssignment_1 ) ) )
            // InternalDataDsl.g:4180:1: ( ( rule__Fragment__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:4180:1: ( ( rule__Fragment__NameAssignment_1 ) )
            // InternalDataDsl.g:4181:2: ( rule__Fragment__NameAssignment_1 )
            {
             before(grammarAccess.getFragmentAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:4182:2: ( rule__Fragment__NameAssignment_1 )
            // InternalDataDsl.g:4182:3: rule__Fragment__NameAssignment_1
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
    // InternalDataDsl.g:4190:1: rule__Fragment__Group__2 : rule__Fragment__Group__2__Impl rule__Fragment__Group__3 ;
    public final void rule__Fragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4194:1: ( rule__Fragment__Group__2__Impl rule__Fragment__Group__3 )
            // InternalDataDsl.g:4195:2: rule__Fragment__Group__2__Impl rule__Fragment__Group__3
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
    // InternalDataDsl.g:4202:1: rule__Fragment__Group__2__Impl : ( ( rule__Fragment__Group_2__0 )? ) ;
    public final void rule__Fragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4206:1: ( ( ( rule__Fragment__Group_2__0 )? ) )
            // InternalDataDsl.g:4207:1: ( ( rule__Fragment__Group_2__0 )? )
            {
            // InternalDataDsl.g:4207:1: ( ( rule__Fragment__Group_2__0 )? )
            // InternalDataDsl.g:4208:2: ( rule__Fragment__Group_2__0 )?
            {
             before(grammarAccess.getFragmentAccess().getGroup_2()); 
            // InternalDataDsl.g:4209:2: ( rule__Fragment__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==73) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDataDsl.g:4209:3: rule__Fragment__Group_2__0
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
    // InternalDataDsl.g:4217:1: rule__Fragment__Group__3 : rule__Fragment__Group__3__Impl rule__Fragment__Group__4 ;
    public final void rule__Fragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4221:1: ( rule__Fragment__Group__3__Impl rule__Fragment__Group__4 )
            // InternalDataDsl.g:4222:2: rule__Fragment__Group__3__Impl rule__Fragment__Group__4
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
    // InternalDataDsl.g:4229:1: rule__Fragment__Group__3__Impl : ( '{' ) ;
    public final void rule__Fragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4233:1: ( ( '{' ) )
            // InternalDataDsl.g:4234:1: ( '{' )
            {
            // InternalDataDsl.g:4234:1: ( '{' )
            // InternalDataDsl.g:4235:2: '{'
            {
             before(grammarAccess.getFragmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,64,FOLLOW_2); 
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
    // InternalDataDsl.g:4244:1: rule__Fragment__Group__4 : rule__Fragment__Group__4__Impl rule__Fragment__Group__5 ;
    public final void rule__Fragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4248:1: ( rule__Fragment__Group__4__Impl rule__Fragment__Group__5 )
            // InternalDataDsl.g:4249:2: rule__Fragment__Group__4__Impl rule__Fragment__Group__5
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
    // InternalDataDsl.g:4256:1: rule__Fragment__Group__4__Impl : ( ( rule__Fragment__NodesAssignment_4 ) ) ;
    public final void rule__Fragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4260:1: ( ( ( rule__Fragment__NodesAssignment_4 ) ) )
            // InternalDataDsl.g:4261:1: ( ( rule__Fragment__NodesAssignment_4 ) )
            {
            // InternalDataDsl.g:4261:1: ( ( rule__Fragment__NodesAssignment_4 ) )
            // InternalDataDsl.g:4262:2: ( rule__Fragment__NodesAssignment_4 )
            {
             before(grammarAccess.getFragmentAccess().getNodesAssignment_4()); 
            // InternalDataDsl.g:4263:2: ( rule__Fragment__NodesAssignment_4 )
            // InternalDataDsl.g:4263:3: rule__Fragment__NodesAssignment_4
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
    // InternalDataDsl.g:4271:1: rule__Fragment__Group__5 : rule__Fragment__Group__5__Impl rule__Fragment__Group__6 ;
    public final void rule__Fragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4275:1: ( rule__Fragment__Group__5__Impl rule__Fragment__Group__6 )
            // InternalDataDsl.g:4276:2: rule__Fragment__Group__5__Impl rule__Fragment__Group__6
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
    // InternalDataDsl.g:4283:1: rule__Fragment__Group__5__Impl : ( ( rule__Fragment__NodesAssignment_5 )* ) ;
    public final void rule__Fragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4287:1: ( ( ( rule__Fragment__NodesAssignment_5 )* ) )
            // InternalDataDsl.g:4288:1: ( ( rule__Fragment__NodesAssignment_5 )* )
            {
            // InternalDataDsl.g:4288:1: ( ( rule__Fragment__NodesAssignment_5 )* )
            // InternalDataDsl.g:4289:2: ( rule__Fragment__NodesAssignment_5 )*
            {
             before(grammarAccess.getFragmentAccess().getNodesAssignment_5()); 
            // InternalDataDsl.g:4290:2: ( rule__Fragment__NodesAssignment_5 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==RULE_ID||(LA43_0>=21 && LA43_0<=41)||LA43_0==62||(LA43_0>=79 && LA43_0<=80)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalDataDsl.g:4290:3: rule__Fragment__NodesAssignment_5
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
    // InternalDataDsl.g:4298:1: rule__Fragment__Group__6 : rule__Fragment__Group__6__Impl ;
    public final void rule__Fragment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4302:1: ( rule__Fragment__Group__6__Impl )
            // InternalDataDsl.g:4303:2: rule__Fragment__Group__6__Impl
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
    // InternalDataDsl.g:4309:1: rule__Fragment__Group__6__Impl : ( '}' ) ;
    public final void rule__Fragment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4313:1: ( ( '}' ) )
            // InternalDataDsl.g:4314:1: ( '}' )
            {
            // InternalDataDsl.g:4314:1: ( '}' )
            // InternalDataDsl.g:4315:2: '}'
            {
             before(grammarAccess.getFragmentAccess().getRightCurlyBracketKeyword_6()); 
            match(input,65,FOLLOW_2); 
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
    // InternalDataDsl.g:4325:1: rule__Fragment__Group_2__0 : rule__Fragment__Group_2__0__Impl rule__Fragment__Group_2__1 ;
    public final void rule__Fragment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4329:1: ( rule__Fragment__Group_2__0__Impl rule__Fragment__Group_2__1 )
            // InternalDataDsl.g:4330:2: rule__Fragment__Group_2__0__Impl rule__Fragment__Group_2__1
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
    // InternalDataDsl.g:4337:1: rule__Fragment__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Fragment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4341:1: ( ( ':' ) )
            // InternalDataDsl.g:4342:1: ( ':' )
            {
            // InternalDataDsl.g:4342:1: ( ':' )
            // InternalDataDsl.g:4343:2: ':'
            {
             before(grammarAccess.getFragmentAccess().getColonKeyword_2_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalDataDsl.g:4352:1: rule__Fragment__Group_2__1 : rule__Fragment__Group_2__1__Impl rule__Fragment__Group_2__2 ;
    public final void rule__Fragment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4356:1: ( rule__Fragment__Group_2__1__Impl rule__Fragment__Group_2__2 )
            // InternalDataDsl.g:4357:2: rule__Fragment__Group_2__1__Impl rule__Fragment__Group_2__2
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
    // InternalDataDsl.g:4364:1: rule__Fragment__Group_2__1__Impl : ( ( rule__Fragment__FragmentsAssignment_2_1 ) ) ;
    public final void rule__Fragment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4368:1: ( ( ( rule__Fragment__FragmentsAssignment_2_1 ) ) )
            // InternalDataDsl.g:4369:1: ( ( rule__Fragment__FragmentsAssignment_2_1 ) )
            {
            // InternalDataDsl.g:4369:1: ( ( rule__Fragment__FragmentsAssignment_2_1 ) )
            // InternalDataDsl.g:4370:2: ( rule__Fragment__FragmentsAssignment_2_1 )
            {
             before(grammarAccess.getFragmentAccess().getFragmentsAssignment_2_1()); 
            // InternalDataDsl.g:4371:2: ( rule__Fragment__FragmentsAssignment_2_1 )
            // InternalDataDsl.g:4371:3: rule__Fragment__FragmentsAssignment_2_1
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
    // InternalDataDsl.g:4379:1: rule__Fragment__Group_2__2 : rule__Fragment__Group_2__2__Impl ;
    public final void rule__Fragment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4383:1: ( rule__Fragment__Group_2__2__Impl )
            // InternalDataDsl.g:4384:2: rule__Fragment__Group_2__2__Impl
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
    // InternalDataDsl.g:4390:1: rule__Fragment__Group_2__2__Impl : ( ( rule__Fragment__Group_2_2__0 )* ) ;
    public final void rule__Fragment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4394:1: ( ( ( rule__Fragment__Group_2_2__0 )* ) )
            // InternalDataDsl.g:4395:1: ( ( rule__Fragment__Group_2_2__0 )* )
            {
            // InternalDataDsl.g:4395:1: ( ( rule__Fragment__Group_2_2__0 )* )
            // InternalDataDsl.g:4396:2: ( rule__Fragment__Group_2_2__0 )*
            {
             before(grammarAccess.getFragmentAccess().getGroup_2_2()); 
            // InternalDataDsl.g:4397:2: ( rule__Fragment__Group_2_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==68) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalDataDsl.g:4397:3: rule__Fragment__Group_2_2__0
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
    // InternalDataDsl.g:4406:1: rule__Fragment__Group_2_2__0 : rule__Fragment__Group_2_2__0__Impl rule__Fragment__Group_2_2__1 ;
    public final void rule__Fragment__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4410:1: ( rule__Fragment__Group_2_2__0__Impl rule__Fragment__Group_2_2__1 )
            // InternalDataDsl.g:4411:2: rule__Fragment__Group_2_2__0__Impl rule__Fragment__Group_2_2__1
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
    // InternalDataDsl.g:4418:1: rule__Fragment__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Fragment__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4422:1: ( ( ',' ) )
            // InternalDataDsl.g:4423:1: ( ',' )
            {
            // InternalDataDsl.g:4423:1: ( ',' )
            // InternalDataDsl.g:4424:2: ','
            {
             before(grammarAccess.getFragmentAccess().getCommaKeyword_2_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:4433:1: rule__Fragment__Group_2_2__1 : rule__Fragment__Group_2_2__1__Impl ;
    public final void rule__Fragment__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4437:1: ( rule__Fragment__Group_2_2__1__Impl )
            // InternalDataDsl.g:4438:2: rule__Fragment__Group_2_2__1__Impl
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
    // InternalDataDsl.g:4444:1: rule__Fragment__Group_2_2__1__Impl : ( ( rule__Fragment__FragmentsAssignment_2_2_1 ) ) ;
    public final void rule__Fragment__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4448:1: ( ( ( rule__Fragment__FragmentsAssignment_2_2_1 ) ) )
            // InternalDataDsl.g:4449:1: ( ( rule__Fragment__FragmentsAssignment_2_2_1 ) )
            {
            // InternalDataDsl.g:4449:1: ( ( rule__Fragment__FragmentsAssignment_2_2_1 ) )
            // InternalDataDsl.g:4450:2: ( rule__Fragment__FragmentsAssignment_2_2_1 )
            {
             before(grammarAccess.getFragmentAccess().getFragmentsAssignment_2_2_1()); 
            // InternalDataDsl.g:4451:2: ( rule__Fragment__FragmentsAssignment_2_2_1 )
            // InternalDataDsl.g:4451:3: rule__Fragment__FragmentsAssignment_2_2_1
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


    // $ANTLR start "rule__Feed__Group__0"
    // InternalDataDsl.g:4460:1: rule__Feed__Group__0 : rule__Feed__Group__0__Impl rule__Feed__Group__1 ;
    public final void rule__Feed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4464:1: ( rule__Feed__Group__0__Impl rule__Feed__Group__1 )
            // InternalDataDsl.g:4465:2: rule__Feed__Group__0__Impl rule__Feed__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Feed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feed__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__0"


    // $ANTLR start "rule__Feed__Group__0__Impl"
    // InternalDataDsl.g:4472:1: rule__Feed__Group__0__Impl : ( 'feed' ) ;
    public final void rule__Feed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4476:1: ( ( 'feed' ) )
            // InternalDataDsl.g:4477:1: ( 'feed' )
            {
            // InternalDataDsl.g:4477:1: ( 'feed' )
            // InternalDataDsl.g:4478:2: 'feed'
            {
             before(grammarAccess.getFeedAccess().getFeedKeyword_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getFeedAccess().getFeedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__0__Impl"


    // $ANTLR start "rule__Feed__Group__1"
    // InternalDataDsl.g:4487:1: rule__Feed__Group__1 : rule__Feed__Group__1__Impl rule__Feed__Group__2 ;
    public final void rule__Feed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4491:1: ( rule__Feed__Group__1__Impl rule__Feed__Group__2 )
            // InternalDataDsl.g:4492:2: rule__Feed__Group__1__Impl rule__Feed__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Feed__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feed__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__1"


    // $ANTLR start "rule__Feed__Group__1__Impl"
    // InternalDataDsl.g:4499:1: rule__Feed__Group__1__Impl : ( ( rule__Feed__NameAssignment_1 ) ) ;
    public final void rule__Feed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4503:1: ( ( ( rule__Feed__NameAssignment_1 ) ) )
            // InternalDataDsl.g:4504:1: ( ( rule__Feed__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:4504:1: ( ( rule__Feed__NameAssignment_1 ) )
            // InternalDataDsl.g:4505:2: ( rule__Feed__NameAssignment_1 )
            {
             before(grammarAccess.getFeedAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:4506:2: ( rule__Feed__NameAssignment_1 )
            // InternalDataDsl.g:4506:3: rule__Feed__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feed__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__1__Impl"


    // $ANTLR start "rule__Feed__Group__2"
    // InternalDataDsl.g:4514:1: rule__Feed__Group__2 : rule__Feed__Group__2__Impl rule__Feed__Group__3 ;
    public final void rule__Feed__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4518:1: ( rule__Feed__Group__2__Impl rule__Feed__Group__3 )
            // InternalDataDsl.g:4519:2: rule__Feed__Group__2__Impl rule__Feed__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Feed__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feed__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__2"


    // $ANTLR start "rule__Feed__Group__2__Impl"
    // InternalDataDsl.g:4526:1: rule__Feed__Group__2__Impl : ( ':' ) ;
    public final void rule__Feed__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4530:1: ( ( ':' ) )
            // InternalDataDsl.g:4531:1: ( ':' )
            {
            // InternalDataDsl.g:4531:1: ( ':' )
            // InternalDataDsl.g:4532:2: ':'
            {
             before(grammarAccess.getFeedAccess().getColonKeyword_2()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getFeedAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__2__Impl"


    // $ANTLR start "rule__Feed__Group__3"
    // InternalDataDsl.g:4541:1: rule__Feed__Group__3 : rule__Feed__Group__3__Impl rule__Feed__Group__4 ;
    public final void rule__Feed__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4545:1: ( rule__Feed__Group__3__Impl rule__Feed__Group__4 )
            // InternalDataDsl.g:4546:2: rule__Feed__Group__3__Impl rule__Feed__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Feed__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feed__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__3"


    // $ANTLR start "rule__Feed__Group__3__Impl"
    // InternalDataDsl.g:4553:1: rule__Feed__Group__3__Impl : ( ( rule__Feed__DescriptionAssignment_3 ) ) ;
    public final void rule__Feed__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4557:1: ( ( ( rule__Feed__DescriptionAssignment_3 ) ) )
            // InternalDataDsl.g:4558:1: ( ( rule__Feed__DescriptionAssignment_3 ) )
            {
            // InternalDataDsl.g:4558:1: ( ( rule__Feed__DescriptionAssignment_3 ) )
            // InternalDataDsl.g:4559:2: ( rule__Feed__DescriptionAssignment_3 )
            {
             before(grammarAccess.getFeedAccess().getDescriptionAssignment_3()); 
            // InternalDataDsl.g:4560:2: ( rule__Feed__DescriptionAssignment_3 )
            // InternalDataDsl.g:4560:3: rule__Feed__DescriptionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feed__DescriptionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeedAccess().getDescriptionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__3__Impl"


    // $ANTLR start "rule__Feed__Group__4"
    // InternalDataDsl.g:4568:1: rule__Feed__Group__4 : rule__Feed__Group__4__Impl rule__Feed__Group__5 ;
    public final void rule__Feed__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4572:1: ( rule__Feed__Group__4__Impl rule__Feed__Group__5 )
            // InternalDataDsl.g:4573:2: rule__Feed__Group__4__Impl rule__Feed__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Feed__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feed__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__4"


    // $ANTLR start "rule__Feed__Group__4__Impl"
    // InternalDataDsl.g:4580:1: rule__Feed__Group__4__Impl : ( '{' ) ;
    public final void rule__Feed__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4584:1: ( ( '{' ) )
            // InternalDataDsl.g:4585:1: ( '{' )
            {
            // InternalDataDsl.g:4585:1: ( '{' )
            // InternalDataDsl.g:4586:2: '{'
            {
             before(grammarAccess.getFeedAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getFeedAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__4__Impl"


    // $ANTLR start "rule__Feed__Group__5"
    // InternalDataDsl.g:4595:1: rule__Feed__Group__5 : rule__Feed__Group__5__Impl rule__Feed__Group__6 ;
    public final void rule__Feed__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4599:1: ( rule__Feed__Group__5__Impl rule__Feed__Group__6 )
            // InternalDataDsl.g:4600:2: rule__Feed__Group__5__Impl rule__Feed__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Feed__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feed__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__5"


    // $ANTLR start "rule__Feed__Group__5__Impl"
    // InternalDataDsl.g:4607:1: rule__Feed__Group__5__Impl : ( ( rule__Feed__PathsAssignment_5 ) ) ;
    public final void rule__Feed__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4611:1: ( ( ( rule__Feed__PathsAssignment_5 ) ) )
            // InternalDataDsl.g:4612:1: ( ( rule__Feed__PathsAssignment_5 ) )
            {
            // InternalDataDsl.g:4612:1: ( ( rule__Feed__PathsAssignment_5 ) )
            // InternalDataDsl.g:4613:2: ( rule__Feed__PathsAssignment_5 )
            {
             before(grammarAccess.getFeedAccess().getPathsAssignment_5()); 
            // InternalDataDsl.g:4614:2: ( rule__Feed__PathsAssignment_5 )
            // InternalDataDsl.g:4614:3: rule__Feed__PathsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Feed__PathsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFeedAccess().getPathsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__5__Impl"


    // $ANTLR start "rule__Feed__Group__6"
    // InternalDataDsl.g:4622:1: rule__Feed__Group__6 : rule__Feed__Group__6__Impl rule__Feed__Group__7 ;
    public final void rule__Feed__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4626:1: ( rule__Feed__Group__6__Impl rule__Feed__Group__7 )
            // InternalDataDsl.g:4627:2: rule__Feed__Group__6__Impl rule__Feed__Group__7
            {
            pushFollow(FOLLOW_31);
            rule__Feed__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feed__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__6"


    // $ANTLR start "rule__Feed__Group__6__Impl"
    // InternalDataDsl.g:4634:1: rule__Feed__Group__6__Impl : ( ( rule__Feed__PathsAssignment_6 )* ) ;
    public final void rule__Feed__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4638:1: ( ( ( rule__Feed__PathsAssignment_6 )* ) )
            // InternalDataDsl.g:4639:1: ( ( rule__Feed__PathsAssignment_6 )* )
            {
            // InternalDataDsl.g:4639:1: ( ( rule__Feed__PathsAssignment_6 )* )
            // InternalDataDsl.g:4640:2: ( rule__Feed__PathsAssignment_6 )*
            {
             before(grammarAccess.getFeedAccess().getPathsAssignment_6()); 
            // InternalDataDsl.g:4641:2: ( rule__Feed__PathsAssignment_6 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_STRING) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalDataDsl.g:4641:3: rule__Feed__PathsAssignment_6
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Feed__PathsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

             after(grammarAccess.getFeedAccess().getPathsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__6__Impl"


    // $ANTLR start "rule__Feed__Group__7"
    // InternalDataDsl.g:4649:1: rule__Feed__Group__7 : rule__Feed__Group__7__Impl ;
    public final void rule__Feed__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4653:1: ( rule__Feed__Group__7__Impl )
            // InternalDataDsl.g:4654:2: rule__Feed__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feed__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__7"


    // $ANTLR start "rule__Feed__Group__7__Impl"
    // InternalDataDsl.g:4660:1: rule__Feed__Group__7__Impl : ( '}' ) ;
    public final void rule__Feed__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4664:1: ( ( '}' ) )
            // InternalDataDsl.g:4665:1: ( '}' )
            {
            // InternalDataDsl.g:4665:1: ( '}' )
            // InternalDataDsl.g:4666:2: '}'
            {
             before(grammarAccess.getFeedAccess().getRightCurlyBracketKeyword_7()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getFeedAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__Group__7__Impl"


    // $ANTLR start "rule__DataTypeRefinement__Group__0"
    // InternalDataDsl.g:4676:1: rule__DataTypeRefinement__Group__0 : rule__DataTypeRefinement__Group__0__Impl rule__DataTypeRefinement__Group__1 ;
    public final void rule__DataTypeRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4680:1: ( rule__DataTypeRefinement__Group__0__Impl rule__DataTypeRefinement__Group__1 )
            // InternalDataDsl.g:4681:2: rule__DataTypeRefinement__Group__0__Impl rule__DataTypeRefinement__Group__1
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
    // InternalDataDsl.g:4688:1: rule__DataTypeRefinement__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataTypeRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4692:1: ( ( 'datatype' ) )
            // InternalDataDsl.g:4693:1: ( 'datatype' )
            {
            // InternalDataDsl.g:4693:1: ( 'datatype' )
            // InternalDataDsl.g:4694:2: 'datatype'
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
    // InternalDataDsl.g:4703:1: rule__DataTypeRefinement__Group__1 : rule__DataTypeRefinement__Group__1__Impl rule__DataTypeRefinement__Group__2 ;
    public final void rule__DataTypeRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4707:1: ( rule__DataTypeRefinement__Group__1__Impl rule__DataTypeRefinement__Group__2 )
            // InternalDataDsl.g:4708:2: rule__DataTypeRefinement__Group__1__Impl rule__DataTypeRefinement__Group__2
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
    // InternalDataDsl.g:4715:1: rule__DataTypeRefinement__Group__1__Impl : ( ( rule__DataTypeRefinement__NameAssignment_1 ) ) ;
    public final void rule__DataTypeRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4719:1: ( ( ( rule__DataTypeRefinement__NameAssignment_1 ) ) )
            // InternalDataDsl.g:4720:1: ( ( rule__DataTypeRefinement__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:4720:1: ( ( rule__DataTypeRefinement__NameAssignment_1 ) )
            // InternalDataDsl.g:4721:2: ( rule__DataTypeRefinement__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:4722:2: ( rule__DataTypeRefinement__NameAssignment_1 )
            // InternalDataDsl.g:4722:3: rule__DataTypeRefinement__NameAssignment_1
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
    // InternalDataDsl.g:4730:1: rule__DataTypeRefinement__Group__2 : rule__DataTypeRefinement__Group__2__Impl rule__DataTypeRefinement__Group__3 ;
    public final void rule__DataTypeRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4734:1: ( rule__DataTypeRefinement__Group__2__Impl rule__DataTypeRefinement__Group__3 )
            // InternalDataDsl.g:4735:2: rule__DataTypeRefinement__Group__2__Impl rule__DataTypeRefinement__Group__3
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
    // InternalDataDsl.g:4742:1: rule__DataTypeRefinement__Group__2__Impl : ( ':' ) ;
    public final void rule__DataTypeRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4746:1: ( ( ':' ) )
            // InternalDataDsl.g:4747:1: ( ':' )
            {
            // InternalDataDsl.g:4747:1: ( ':' )
            // InternalDataDsl.g:4748:2: ':'
            {
             before(grammarAccess.getDataTypeRefinementAccess().getColonKeyword_2()); 
            match(input,73,FOLLOW_2); 
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
    // InternalDataDsl.g:4757:1: rule__DataTypeRefinement__Group__3 : rule__DataTypeRefinement__Group__3__Impl rule__DataTypeRefinement__Group__4 ;
    public final void rule__DataTypeRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4761:1: ( rule__DataTypeRefinement__Group__3__Impl rule__DataTypeRefinement__Group__4 )
            // InternalDataDsl.g:4762:2: rule__DataTypeRefinement__Group__3__Impl rule__DataTypeRefinement__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalDataDsl.g:4769:1: rule__DataTypeRefinement__Group__3__Impl : ( ( rule__DataTypeRefinement__RefineAssignment_3 ) ) ;
    public final void rule__DataTypeRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4773:1: ( ( ( rule__DataTypeRefinement__RefineAssignment_3 ) ) )
            // InternalDataDsl.g:4774:1: ( ( rule__DataTypeRefinement__RefineAssignment_3 ) )
            {
            // InternalDataDsl.g:4774:1: ( ( rule__DataTypeRefinement__RefineAssignment_3 ) )
            // InternalDataDsl.g:4775:2: ( rule__DataTypeRefinement__RefineAssignment_3 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getRefineAssignment_3()); 
            // InternalDataDsl.g:4776:2: ( rule__DataTypeRefinement__RefineAssignment_3 )
            // InternalDataDsl.g:4776:3: rule__DataTypeRefinement__RefineAssignment_3
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
    // InternalDataDsl.g:4784:1: rule__DataTypeRefinement__Group__4 : rule__DataTypeRefinement__Group__4__Impl rule__DataTypeRefinement__Group__5 ;
    public final void rule__DataTypeRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4788:1: ( rule__DataTypeRefinement__Group__4__Impl rule__DataTypeRefinement__Group__5 )
            // InternalDataDsl.g:4789:2: rule__DataTypeRefinement__Group__4__Impl rule__DataTypeRefinement__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalDataDsl.g:4796:1: rule__DataTypeRefinement__Group__4__Impl : ( ( rule__DataTypeRefinement__Group_4__0 )? ) ;
    public final void rule__DataTypeRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4800:1: ( ( ( rule__DataTypeRefinement__Group_4__0 )? ) )
            // InternalDataDsl.g:4801:1: ( ( rule__DataTypeRefinement__Group_4__0 )? )
            {
            // InternalDataDsl.g:4801:1: ( ( rule__DataTypeRefinement__Group_4__0 )? )
            // InternalDataDsl.g:4802:2: ( rule__DataTypeRefinement__Group_4__0 )?
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup_4()); 
            // InternalDataDsl.g:4803:2: ( rule__DataTypeRefinement__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==64) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalDataDsl.g:4803:3: rule__DataTypeRefinement__Group_4__0
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
    // InternalDataDsl.g:4811:1: rule__DataTypeRefinement__Group__5 : rule__DataTypeRefinement__Group__5__Impl ;
    public final void rule__DataTypeRefinement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4815:1: ( rule__DataTypeRefinement__Group__5__Impl )
            // InternalDataDsl.g:4816:2: rule__DataTypeRefinement__Group__5__Impl
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
    // InternalDataDsl.g:4822:1: rule__DataTypeRefinement__Group__5__Impl : ( ( rule__DataTypeRefinement__Group_5__0 )? ) ;
    public final void rule__DataTypeRefinement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4826:1: ( ( ( rule__DataTypeRefinement__Group_5__0 )? ) )
            // InternalDataDsl.g:4827:1: ( ( rule__DataTypeRefinement__Group_5__0 )? )
            {
            // InternalDataDsl.g:4827:1: ( ( rule__DataTypeRefinement__Group_5__0 )? )
            // InternalDataDsl.g:4828:2: ( rule__DataTypeRefinement__Group_5__0 )?
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup_5()); 
            // InternalDataDsl.g:4829:2: ( rule__DataTypeRefinement__Group_5__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDataDsl.g:4829:3: rule__DataTypeRefinement__Group_5__0
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
    // InternalDataDsl.g:4838:1: rule__DataTypeRefinement__Group_4__0 : rule__DataTypeRefinement__Group_4__0__Impl rule__DataTypeRefinement__Group_4__1 ;
    public final void rule__DataTypeRefinement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4842:1: ( rule__DataTypeRefinement__Group_4__0__Impl rule__DataTypeRefinement__Group_4__1 )
            // InternalDataDsl.g:4843:2: rule__DataTypeRefinement__Group_4__0__Impl rule__DataTypeRefinement__Group_4__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalDataDsl.g:4850:1: rule__DataTypeRefinement__Group_4__0__Impl : ( '{' ) ;
    public final void rule__DataTypeRefinement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4854:1: ( ( '{' ) )
            // InternalDataDsl.g:4855:1: ( '{' )
            {
            // InternalDataDsl.g:4855:1: ( '{' )
            // InternalDataDsl.g:4856:2: '{'
            {
             before(grammarAccess.getDataTypeRefinementAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalDataDsl.g:4865:1: rule__DataTypeRefinement__Group_4__1 : rule__DataTypeRefinement__Group_4__1__Impl rule__DataTypeRefinement__Group_4__2 ;
    public final void rule__DataTypeRefinement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4869:1: ( rule__DataTypeRefinement__Group_4__1__Impl rule__DataTypeRefinement__Group_4__2 )
            // InternalDataDsl.g:4870:2: rule__DataTypeRefinement__Group_4__1__Impl rule__DataTypeRefinement__Group_4__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalDataDsl.g:4877:1: rule__DataTypeRefinement__Group_4__1__Impl : ( ( rule__DataTypeRefinement__Group_4_1__0 )? ) ;
    public final void rule__DataTypeRefinement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4881:1: ( ( ( rule__DataTypeRefinement__Group_4_1__0 )? ) )
            // InternalDataDsl.g:4882:1: ( ( rule__DataTypeRefinement__Group_4_1__0 )? )
            {
            // InternalDataDsl.g:4882:1: ( ( rule__DataTypeRefinement__Group_4_1__0 )? )
            // InternalDataDsl.g:4883:2: ( rule__DataTypeRefinement__Group_4_1__0 )?
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup_4_1()); 
            // InternalDataDsl.g:4884:2: ( rule__DataTypeRefinement__Group_4_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=15 && LA48_0<=20)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalDataDsl.g:4884:3: rule__DataTypeRefinement__Group_4_1__0
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
    // InternalDataDsl.g:4892:1: rule__DataTypeRefinement__Group_4__2 : rule__DataTypeRefinement__Group_4__2__Impl ;
    public final void rule__DataTypeRefinement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4896:1: ( rule__DataTypeRefinement__Group_4__2__Impl )
            // InternalDataDsl.g:4897:2: rule__DataTypeRefinement__Group_4__2__Impl
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
    // InternalDataDsl.g:4903:1: rule__DataTypeRefinement__Group_4__2__Impl : ( '}' ) ;
    public final void rule__DataTypeRefinement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4907:1: ( ( '}' ) )
            // InternalDataDsl.g:4908:1: ( '}' )
            {
            // InternalDataDsl.g:4908:1: ( '}' )
            // InternalDataDsl.g:4909:2: '}'
            {
             before(grammarAccess.getDataTypeRefinementAccess().getRightCurlyBracketKeyword_4_2()); 
            match(input,65,FOLLOW_2); 
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
    // InternalDataDsl.g:4919:1: rule__DataTypeRefinement__Group_4_1__0 : rule__DataTypeRefinement__Group_4_1__0__Impl rule__DataTypeRefinement__Group_4_1__1 ;
    public final void rule__DataTypeRefinement__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4923:1: ( rule__DataTypeRefinement__Group_4_1__0__Impl rule__DataTypeRefinement__Group_4_1__1 )
            // InternalDataDsl.g:4924:2: rule__DataTypeRefinement__Group_4_1__0__Impl rule__DataTypeRefinement__Group_4_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalDataDsl.g:4931:1: rule__DataTypeRefinement__Group_4_1__0__Impl : ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 ) ) ;
    public final void rule__DataTypeRefinement__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4935:1: ( ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 ) ) )
            // InternalDataDsl.g:4936:1: ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 ) )
            {
            // InternalDataDsl.g:4936:1: ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 ) )
            // InternalDataDsl.g:4937:2: ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getSubsequencesAssignment_4_1_0()); 
            // InternalDataDsl.g:4938:2: ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 )
            // InternalDataDsl.g:4938:3: rule__DataTypeRefinement__SubsequencesAssignment_4_1_0
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
    // InternalDataDsl.g:4946:1: rule__DataTypeRefinement__Group_4_1__1 : rule__DataTypeRefinement__Group_4_1__1__Impl ;
    public final void rule__DataTypeRefinement__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4950:1: ( rule__DataTypeRefinement__Group_4_1__1__Impl )
            // InternalDataDsl.g:4951:2: rule__DataTypeRefinement__Group_4_1__1__Impl
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
    // InternalDataDsl.g:4957:1: rule__DataTypeRefinement__Group_4_1__1__Impl : ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )* ) ;
    public final void rule__DataTypeRefinement__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4961:1: ( ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )* ) )
            // InternalDataDsl.g:4962:1: ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )* )
            {
            // InternalDataDsl.g:4962:1: ( ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )* )
            // InternalDataDsl.g:4963:2: ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )*
            {
             before(grammarAccess.getDataTypeRefinementAccess().getSubsequencesAssignment_4_1_1()); 
            // InternalDataDsl.g:4964:2: ( rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=15 && LA49_0<=20)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDataDsl.g:4964:3: rule__DataTypeRefinement__SubsequencesAssignment_4_1_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__DataTypeRefinement__SubsequencesAssignment_4_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalDataDsl.g:4973:1: rule__DataTypeRefinement__Group_5__0 : rule__DataTypeRefinement__Group_5__0__Impl rule__DataTypeRefinement__Group_5__1 ;
    public final void rule__DataTypeRefinement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4977:1: ( rule__DataTypeRefinement__Group_5__0__Impl rule__DataTypeRefinement__Group_5__1 )
            // InternalDataDsl.g:4978:2: rule__DataTypeRefinement__Group_5__0__Impl rule__DataTypeRefinement__Group_5__1
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
    // InternalDataDsl.g:4985:1: rule__DataTypeRefinement__Group_5__0__Impl : ( '(' ) ;
    public final void rule__DataTypeRefinement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4989:1: ( ( '(' ) )
            // InternalDataDsl.g:4990:1: ( '(' )
            {
            // InternalDataDsl.g:4990:1: ( '(' )
            // InternalDataDsl.g:4991:2: '('
            {
             before(grammarAccess.getDataTypeRefinementAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalDataDsl.g:5000:1: rule__DataTypeRefinement__Group_5__1 : rule__DataTypeRefinement__Group_5__1__Impl rule__DataTypeRefinement__Group_5__2 ;
    public final void rule__DataTypeRefinement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5004:1: ( rule__DataTypeRefinement__Group_5__1__Impl rule__DataTypeRefinement__Group_5__2 )
            // InternalDataDsl.g:5005:2: rule__DataTypeRefinement__Group_5__1__Impl rule__DataTypeRefinement__Group_5__2
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
    // InternalDataDsl.g:5012:1: rule__DataTypeRefinement__Group_5__1__Impl : ( ( rule__DataTypeRefinement__OptionsAssignment_5_1 ) ) ;
    public final void rule__DataTypeRefinement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5016:1: ( ( ( rule__DataTypeRefinement__OptionsAssignment_5_1 ) ) )
            // InternalDataDsl.g:5017:1: ( ( rule__DataTypeRefinement__OptionsAssignment_5_1 ) )
            {
            // InternalDataDsl.g:5017:1: ( ( rule__DataTypeRefinement__OptionsAssignment_5_1 ) )
            // InternalDataDsl.g:5018:2: ( rule__DataTypeRefinement__OptionsAssignment_5_1 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getOptionsAssignment_5_1()); 
            // InternalDataDsl.g:5019:2: ( rule__DataTypeRefinement__OptionsAssignment_5_1 )
            // InternalDataDsl.g:5019:3: rule__DataTypeRefinement__OptionsAssignment_5_1
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
    // InternalDataDsl.g:5027:1: rule__DataTypeRefinement__Group_5__2 : rule__DataTypeRefinement__Group_5__2__Impl rule__DataTypeRefinement__Group_5__3 ;
    public final void rule__DataTypeRefinement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5031:1: ( rule__DataTypeRefinement__Group_5__2__Impl rule__DataTypeRefinement__Group_5__3 )
            // InternalDataDsl.g:5032:2: rule__DataTypeRefinement__Group_5__2__Impl rule__DataTypeRefinement__Group_5__3
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
    // InternalDataDsl.g:5039:1: rule__DataTypeRefinement__Group_5__2__Impl : ( ( rule__DataTypeRefinement__Group_5_2__0 )* ) ;
    public final void rule__DataTypeRefinement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5043:1: ( ( ( rule__DataTypeRefinement__Group_5_2__0 )* ) )
            // InternalDataDsl.g:5044:1: ( ( rule__DataTypeRefinement__Group_5_2__0 )* )
            {
            // InternalDataDsl.g:5044:1: ( ( rule__DataTypeRefinement__Group_5_2__0 )* )
            // InternalDataDsl.g:5045:2: ( rule__DataTypeRefinement__Group_5_2__0 )*
            {
             before(grammarAccess.getDataTypeRefinementAccess().getGroup_5_2()); 
            // InternalDataDsl.g:5046:2: ( rule__DataTypeRefinement__Group_5_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==68) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalDataDsl.g:5046:3: rule__DataTypeRefinement__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DataTypeRefinement__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalDataDsl.g:5054:1: rule__DataTypeRefinement__Group_5__3 : rule__DataTypeRefinement__Group_5__3__Impl ;
    public final void rule__DataTypeRefinement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5058:1: ( rule__DataTypeRefinement__Group_5__3__Impl )
            // InternalDataDsl.g:5059:2: rule__DataTypeRefinement__Group_5__3__Impl
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
    // InternalDataDsl.g:5065:1: rule__DataTypeRefinement__Group_5__3__Impl : ( ')' ) ;
    public final void rule__DataTypeRefinement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5069:1: ( ( ')' ) )
            // InternalDataDsl.g:5070:1: ( ')' )
            {
            // InternalDataDsl.g:5070:1: ( ')' )
            // InternalDataDsl.g:5071:2: ')'
            {
             before(grammarAccess.getDataTypeRefinementAccess().getRightParenthesisKeyword_5_3()); 
            match(input,71,FOLLOW_2); 
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
    // InternalDataDsl.g:5081:1: rule__DataTypeRefinement__Group_5_2__0 : rule__DataTypeRefinement__Group_5_2__0__Impl rule__DataTypeRefinement__Group_5_2__1 ;
    public final void rule__DataTypeRefinement__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5085:1: ( rule__DataTypeRefinement__Group_5_2__0__Impl rule__DataTypeRefinement__Group_5_2__1 )
            // InternalDataDsl.g:5086:2: rule__DataTypeRefinement__Group_5_2__0__Impl rule__DataTypeRefinement__Group_5_2__1
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
    // InternalDataDsl.g:5093:1: rule__DataTypeRefinement__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__DataTypeRefinement__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5097:1: ( ( ',' ) )
            // InternalDataDsl.g:5098:1: ( ',' )
            {
            // InternalDataDsl.g:5098:1: ( ',' )
            // InternalDataDsl.g:5099:2: ','
            {
             before(grammarAccess.getDataTypeRefinementAccess().getCommaKeyword_5_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:5108:1: rule__DataTypeRefinement__Group_5_2__1 : rule__DataTypeRefinement__Group_5_2__1__Impl ;
    public final void rule__DataTypeRefinement__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5112:1: ( rule__DataTypeRefinement__Group_5_2__1__Impl )
            // InternalDataDsl.g:5113:2: rule__DataTypeRefinement__Group_5_2__1__Impl
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
    // InternalDataDsl.g:5119:1: rule__DataTypeRefinement__Group_5_2__1__Impl : ( ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 ) ) ;
    public final void rule__DataTypeRefinement__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5123:1: ( ( ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 ) ) )
            // InternalDataDsl.g:5124:1: ( ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 ) )
            {
            // InternalDataDsl.g:5124:1: ( ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 ) )
            // InternalDataDsl.g:5125:2: ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 )
            {
             before(grammarAccess.getDataTypeRefinementAccess().getOptionsAssignment_5_2_1()); 
            // InternalDataDsl.g:5126:2: ( rule__DataTypeRefinement__OptionsAssignment_5_2_1 )
            // InternalDataDsl.g:5126:3: rule__DataTypeRefinement__OptionsAssignment_5_2_1
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
    // InternalDataDsl.g:5135:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5139:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalDataDsl.g:5140:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
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
    // InternalDataDsl.g:5147:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5151:1: ( ( 'enumeration' ) )
            // InternalDataDsl.g:5152:1: ( 'enumeration' )
            {
            // InternalDataDsl.g:5152:1: ( 'enumeration' )
            // InternalDataDsl.g:5153:2: 'enumeration'
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
    // InternalDataDsl.g:5162:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5166:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalDataDsl.g:5167:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
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
    // InternalDataDsl.g:5174:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5178:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalDataDsl.g:5179:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:5179:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalDataDsl.g:5180:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:5181:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalDataDsl.g:5181:3: rule__Enumeration__NameAssignment_1
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
    // InternalDataDsl.g:5189:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5193:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalDataDsl.g:5194:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
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
    // InternalDataDsl.g:5201:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5205:1: ( ( '{' ) )
            // InternalDataDsl.g:5206:1: ( '{' )
            {
            // InternalDataDsl.g:5206:1: ( '{' )
            // InternalDataDsl.g:5207:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalDataDsl.g:5216:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5220:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalDataDsl.g:5221:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalDataDsl.g:5228:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__ValuesAssignment_3 ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5232:1: ( ( ( rule__Enumeration__ValuesAssignment_3 ) ) )
            // InternalDataDsl.g:5233:1: ( ( rule__Enumeration__ValuesAssignment_3 ) )
            {
            // InternalDataDsl.g:5233:1: ( ( rule__Enumeration__ValuesAssignment_3 ) )
            // InternalDataDsl.g:5234:2: ( rule__Enumeration__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_3()); 
            // InternalDataDsl.g:5235:2: ( rule__Enumeration__ValuesAssignment_3 )
            // InternalDataDsl.g:5235:3: rule__Enumeration__ValuesAssignment_3
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
    // InternalDataDsl.g:5243:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5247:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalDataDsl.g:5248:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalDataDsl.g:5255:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5259:1: ( ( ( rule__Enumeration__Group_4__0 )* ) )
            // InternalDataDsl.g:5260:1: ( ( rule__Enumeration__Group_4__0 )* )
            {
            // InternalDataDsl.g:5260:1: ( ( rule__Enumeration__Group_4__0 )* )
            // InternalDataDsl.g:5261:2: ( rule__Enumeration__Group_4__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // InternalDataDsl.g:5262:2: ( rule__Enumeration__Group_4__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==68) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalDataDsl.g:5262:3: rule__Enumeration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Enumeration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalDataDsl.g:5270:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5274:1: ( rule__Enumeration__Group__5__Impl )
            // InternalDataDsl.g:5275:2: rule__Enumeration__Group__5__Impl
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
    // InternalDataDsl.g:5281:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5285:1: ( ( '}' ) )
            // InternalDataDsl.g:5286:1: ( '}' )
            {
            // InternalDataDsl.g:5286:1: ( '}' )
            // InternalDataDsl.g:5287:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,65,FOLLOW_2); 
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
    // InternalDataDsl.g:5297:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5301:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // InternalDataDsl.g:5302:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
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
    // InternalDataDsl.g:5309:1: rule__Enumeration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5313:1: ( ( ',' ) )
            // InternalDataDsl.g:5314:1: ( ',' )
            {
            // InternalDataDsl.g:5314:1: ( ',' )
            // InternalDataDsl.g:5315:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalDataDsl.g:5324:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5328:1: ( rule__Enumeration__Group_4__1__Impl )
            // InternalDataDsl.g:5329:2: rule__Enumeration__Group_4__1__Impl
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
    // InternalDataDsl.g:5335:1: rule__Enumeration__Group_4__1__Impl : ( ( rule__Enumeration__ValuesAssignment_4_1 ) ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5339:1: ( ( ( rule__Enumeration__ValuesAssignment_4_1 ) ) )
            // InternalDataDsl.g:5340:1: ( ( rule__Enumeration__ValuesAssignment_4_1 ) )
            {
            // InternalDataDsl.g:5340:1: ( ( rule__Enumeration__ValuesAssignment_4_1 ) )
            // InternalDataDsl.g:5341:2: ( rule__Enumeration__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_4_1()); 
            // InternalDataDsl.g:5342:2: ( rule__Enumeration__ValuesAssignment_4_1 )
            // InternalDataDsl.g:5342:3: rule__Enumeration__ValuesAssignment_4_1
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
    // InternalDataDsl.g:5351:1: rule__StringOption__Group__0 : rule__StringOption__Group__0__Impl rule__StringOption__Group__1 ;
    public final void rule__StringOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5355:1: ( rule__StringOption__Group__0__Impl rule__StringOption__Group__1 )
            // InternalDataDsl.g:5356:2: rule__StringOption__Group__0__Impl rule__StringOption__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDataDsl.g:5363:1: rule__StringOption__Group__0__Impl : ( ( rule__StringOption__KeyAssignment_0 ) ) ;
    public final void rule__StringOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5367:1: ( ( ( rule__StringOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5368:1: ( ( rule__StringOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5368:1: ( ( rule__StringOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5369:2: ( rule__StringOption__KeyAssignment_0 )
            {
             before(grammarAccess.getStringOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5370:2: ( rule__StringOption__KeyAssignment_0 )
            // InternalDataDsl.g:5370:3: rule__StringOption__KeyAssignment_0
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
    // InternalDataDsl.g:5378:1: rule__StringOption__Group__1 : rule__StringOption__Group__1__Impl rule__StringOption__Group__2 ;
    public final void rule__StringOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5382:1: ( rule__StringOption__Group__1__Impl rule__StringOption__Group__2 )
            // InternalDataDsl.g:5383:2: rule__StringOption__Group__1__Impl rule__StringOption__Group__2
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
    // InternalDataDsl.g:5390:1: rule__StringOption__Group__1__Impl : ( '=' ) ;
    public final void rule__StringOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5394:1: ( ( '=' ) )
            // InternalDataDsl.g:5395:1: ( '=' )
            {
            // InternalDataDsl.g:5395:1: ( '=' )
            // InternalDataDsl.g:5396:2: '='
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
    // InternalDataDsl.g:5405:1: rule__StringOption__Group__2 : rule__StringOption__Group__2__Impl ;
    public final void rule__StringOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5409:1: ( rule__StringOption__Group__2__Impl )
            // InternalDataDsl.g:5410:2: rule__StringOption__Group__2__Impl
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
    // InternalDataDsl.g:5416:1: rule__StringOption__Group__2__Impl : ( ( rule__StringOption__ValueAssignment_2 ) ) ;
    public final void rule__StringOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5420:1: ( ( ( rule__StringOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5421:1: ( ( rule__StringOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5421:1: ( ( rule__StringOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5422:2: ( rule__StringOption__ValueAssignment_2 )
            {
             before(grammarAccess.getStringOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5423:2: ( rule__StringOption__ValueAssignment_2 )
            // InternalDataDsl.g:5423:3: rule__StringOption__ValueAssignment_2
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
    // InternalDataDsl.g:5432:1: rule__IntOption__Group__0 : rule__IntOption__Group__0__Impl rule__IntOption__Group__1 ;
    public final void rule__IntOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5436:1: ( rule__IntOption__Group__0__Impl rule__IntOption__Group__1 )
            // InternalDataDsl.g:5437:2: rule__IntOption__Group__0__Impl rule__IntOption__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDataDsl.g:5444:1: rule__IntOption__Group__0__Impl : ( ( rule__IntOption__KeyAssignment_0 ) ) ;
    public final void rule__IntOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5448:1: ( ( ( rule__IntOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5449:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5449:1: ( ( rule__IntOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5450:2: ( rule__IntOption__KeyAssignment_0 )
            {
             before(grammarAccess.getIntOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5451:2: ( rule__IntOption__KeyAssignment_0 )
            // InternalDataDsl.g:5451:3: rule__IntOption__KeyAssignment_0
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
    // InternalDataDsl.g:5459:1: rule__IntOption__Group__1 : rule__IntOption__Group__1__Impl rule__IntOption__Group__2 ;
    public final void rule__IntOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5463:1: ( rule__IntOption__Group__1__Impl rule__IntOption__Group__2 )
            // InternalDataDsl.g:5464:2: rule__IntOption__Group__1__Impl rule__IntOption__Group__2
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
    // InternalDataDsl.g:5471:1: rule__IntOption__Group__1__Impl : ( '=' ) ;
    public final void rule__IntOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5475:1: ( ( '=' ) )
            // InternalDataDsl.g:5476:1: ( '=' )
            {
            // InternalDataDsl.g:5476:1: ( '=' )
            // InternalDataDsl.g:5477:2: '='
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
    // InternalDataDsl.g:5486:1: rule__IntOption__Group__2 : rule__IntOption__Group__2__Impl ;
    public final void rule__IntOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5490:1: ( rule__IntOption__Group__2__Impl )
            // InternalDataDsl.g:5491:2: rule__IntOption__Group__2__Impl
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
    // InternalDataDsl.g:5497:1: rule__IntOption__Group__2__Impl : ( ( rule__IntOption__ValueAssignment_2 ) ) ;
    public final void rule__IntOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5501:1: ( ( ( rule__IntOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5502:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5502:1: ( ( rule__IntOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5503:2: ( rule__IntOption__ValueAssignment_2 )
            {
             before(grammarAccess.getIntOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5504:2: ( rule__IntOption__ValueAssignment_2 )
            // InternalDataDsl.g:5504:3: rule__IntOption__ValueAssignment_2
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
    // InternalDataDsl.g:5513:1: rule__DoubleOption__Group__0 : rule__DoubleOption__Group__0__Impl rule__DoubleOption__Group__1 ;
    public final void rule__DoubleOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5517:1: ( rule__DoubleOption__Group__0__Impl rule__DoubleOption__Group__1 )
            // InternalDataDsl.g:5518:2: rule__DoubleOption__Group__0__Impl rule__DoubleOption__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDataDsl.g:5525:1: rule__DoubleOption__Group__0__Impl : ( ( rule__DoubleOption__KeyAssignment_0 ) ) ;
    public final void rule__DoubleOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5529:1: ( ( ( rule__DoubleOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5530:1: ( ( rule__DoubleOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5530:1: ( ( rule__DoubleOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5531:2: ( rule__DoubleOption__KeyAssignment_0 )
            {
             before(grammarAccess.getDoubleOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5532:2: ( rule__DoubleOption__KeyAssignment_0 )
            // InternalDataDsl.g:5532:3: rule__DoubleOption__KeyAssignment_0
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
    // InternalDataDsl.g:5540:1: rule__DoubleOption__Group__1 : rule__DoubleOption__Group__1__Impl rule__DoubleOption__Group__2 ;
    public final void rule__DoubleOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5544:1: ( rule__DoubleOption__Group__1__Impl rule__DoubleOption__Group__2 )
            // InternalDataDsl.g:5545:2: rule__DoubleOption__Group__1__Impl rule__DoubleOption__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalDataDsl.g:5552:1: rule__DoubleOption__Group__1__Impl : ( '=' ) ;
    public final void rule__DoubleOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5556:1: ( ( '=' ) )
            // InternalDataDsl.g:5557:1: ( '=' )
            {
            // InternalDataDsl.g:5557:1: ( '=' )
            // InternalDataDsl.g:5558:2: '='
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
    // InternalDataDsl.g:5567:1: rule__DoubleOption__Group__2 : rule__DoubleOption__Group__2__Impl ;
    public final void rule__DoubleOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5571:1: ( rule__DoubleOption__Group__2__Impl )
            // InternalDataDsl.g:5572:2: rule__DoubleOption__Group__2__Impl
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
    // InternalDataDsl.g:5578:1: rule__DoubleOption__Group__2__Impl : ( ( rule__DoubleOption__ValueAssignment_2 ) ) ;
    public final void rule__DoubleOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5582:1: ( ( ( rule__DoubleOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5583:1: ( ( rule__DoubleOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5583:1: ( ( rule__DoubleOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5584:2: ( rule__DoubleOption__ValueAssignment_2 )
            {
             before(grammarAccess.getDoubleOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5585:2: ( rule__DoubleOption__ValueAssignment_2 )
            // InternalDataDsl.g:5585:3: rule__DoubleOption__ValueAssignment_2
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
    // InternalDataDsl.g:5594:1: rule__BooleanOption__Group__0 : rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 ;
    public final void rule__BooleanOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5598:1: ( rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1 )
            // InternalDataDsl.g:5599:2: rule__BooleanOption__Group__0__Impl rule__BooleanOption__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDataDsl.g:5606:1: rule__BooleanOption__Group__0__Impl : ( ( rule__BooleanOption__KeyAssignment_0 ) ) ;
    public final void rule__BooleanOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5610:1: ( ( ( rule__BooleanOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5611:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5611:1: ( ( rule__BooleanOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5612:2: ( rule__BooleanOption__KeyAssignment_0 )
            {
             before(grammarAccess.getBooleanOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5613:2: ( rule__BooleanOption__KeyAssignment_0 )
            // InternalDataDsl.g:5613:3: rule__BooleanOption__KeyAssignment_0
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
    // InternalDataDsl.g:5621:1: rule__BooleanOption__Group__1 : rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 ;
    public final void rule__BooleanOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5625:1: ( rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2 )
            // InternalDataDsl.g:5626:2: rule__BooleanOption__Group__1__Impl rule__BooleanOption__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalDataDsl.g:5633:1: rule__BooleanOption__Group__1__Impl : ( '=' ) ;
    public final void rule__BooleanOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5637:1: ( ( '=' ) )
            // InternalDataDsl.g:5638:1: ( '=' )
            {
            // InternalDataDsl.g:5638:1: ( '=' )
            // InternalDataDsl.g:5639:2: '='
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
    // InternalDataDsl.g:5648:1: rule__BooleanOption__Group__2 : rule__BooleanOption__Group__2__Impl ;
    public final void rule__BooleanOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5652:1: ( rule__BooleanOption__Group__2__Impl )
            // InternalDataDsl.g:5653:2: rule__BooleanOption__Group__2__Impl
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
    // InternalDataDsl.g:5659:1: rule__BooleanOption__Group__2__Impl : ( ( rule__BooleanOption__ValueAssignment_2 ) ) ;
    public final void rule__BooleanOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5663:1: ( ( ( rule__BooleanOption__ValueAssignment_2 ) ) )
            // InternalDataDsl.g:5664:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            {
            // InternalDataDsl.g:5664:1: ( ( rule__BooleanOption__ValueAssignment_2 ) )
            // InternalDataDsl.g:5665:2: ( rule__BooleanOption__ValueAssignment_2 )
            {
             before(grammarAccess.getBooleanOptionAccess().getValueAssignment_2()); 
            // InternalDataDsl.g:5666:2: ( rule__BooleanOption__ValueAssignment_2 )
            // InternalDataDsl.g:5666:3: rule__BooleanOption__ValueAssignment_2
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
    // InternalDataDsl.g:5675:1: rule__ListQualifiedNameOption__Group__0 : rule__ListQualifiedNameOption__Group__0__Impl rule__ListQualifiedNameOption__Group__1 ;
    public final void rule__ListQualifiedNameOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5679:1: ( rule__ListQualifiedNameOption__Group__0__Impl rule__ListQualifiedNameOption__Group__1 )
            // InternalDataDsl.g:5680:2: rule__ListQualifiedNameOption__Group__0__Impl rule__ListQualifiedNameOption__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalDataDsl.g:5687:1: rule__ListQualifiedNameOption__Group__0__Impl : ( ( rule__ListQualifiedNameOption__KeyAssignment_0 ) ) ;
    public final void rule__ListQualifiedNameOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5691:1: ( ( ( rule__ListQualifiedNameOption__KeyAssignment_0 ) ) )
            // InternalDataDsl.g:5692:1: ( ( rule__ListQualifiedNameOption__KeyAssignment_0 ) )
            {
            // InternalDataDsl.g:5692:1: ( ( rule__ListQualifiedNameOption__KeyAssignment_0 ) )
            // InternalDataDsl.g:5693:2: ( rule__ListQualifiedNameOption__KeyAssignment_0 )
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getKeyAssignment_0()); 
            // InternalDataDsl.g:5694:2: ( rule__ListQualifiedNameOption__KeyAssignment_0 )
            // InternalDataDsl.g:5694:3: rule__ListQualifiedNameOption__KeyAssignment_0
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
    // InternalDataDsl.g:5702:1: rule__ListQualifiedNameOption__Group__1 : rule__ListQualifiedNameOption__Group__1__Impl rule__ListQualifiedNameOption__Group__2 ;
    public final void rule__ListQualifiedNameOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5706:1: ( rule__ListQualifiedNameOption__Group__1__Impl rule__ListQualifiedNameOption__Group__2 )
            // InternalDataDsl.g:5707:2: rule__ListQualifiedNameOption__Group__1__Impl rule__ListQualifiedNameOption__Group__2
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
    // InternalDataDsl.g:5714:1: rule__ListQualifiedNameOption__Group__1__Impl : ( '=' ) ;
    public final void rule__ListQualifiedNameOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5718:1: ( ( '=' ) )
            // InternalDataDsl.g:5719:1: ( '=' )
            {
            // InternalDataDsl.g:5719:1: ( '=' )
            // InternalDataDsl.g:5720:2: '='
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
    // InternalDataDsl.g:5729:1: rule__ListQualifiedNameOption__Group__2 : rule__ListQualifiedNameOption__Group__2__Impl ;
    public final void rule__ListQualifiedNameOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5733:1: ( rule__ListQualifiedNameOption__Group__2__Impl )
            // InternalDataDsl.g:5734:2: rule__ListQualifiedNameOption__Group__2__Impl
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
    // InternalDataDsl.g:5740:1: rule__ListQualifiedNameOption__Group__2__Impl : ( ( rule__ListQualifiedNameOption__FragmentsAssignment_2 ) ) ;
    public final void rule__ListQualifiedNameOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5744:1: ( ( ( rule__ListQualifiedNameOption__FragmentsAssignment_2 ) ) )
            // InternalDataDsl.g:5745:1: ( ( rule__ListQualifiedNameOption__FragmentsAssignment_2 ) )
            {
            // InternalDataDsl.g:5745:1: ( ( rule__ListQualifiedNameOption__FragmentsAssignment_2 ) )
            // InternalDataDsl.g:5746:2: ( rule__ListQualifiedNameOption__FragmentsAssignment_2 )
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getFragmentsAssignment_2()); 
            // InternalDataDsl.g:5747:2: ( rule__ListQualifiedNameOption__FragmentsAssignment_2 )
            // InternalDataDsl.g:5747:3: rule__ListQualifiedNameOption__FragmentsAssignment_2
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


    // $ANTLR start "rule__DataModel__ElementsAssignment_1"
    // InternalDataDsl.g:5756:1: rule__DataModel__ElementsAssignment_1 : ( ruleDataModelElement ) ;
    public final void rule__DataModel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5760:1: ( ( ruleDataModelElement ) )
            // InternalDataDsl.g:5761:2: ( ruleDataModelElement )
            {
            // InternalDataDsl.g:5761:2: ( ruleDataModelElement )
            // InternalDataDsl.g:5762:3: ruleDataModelElement
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
    // InternalDataDsl.g:5771:1: rule__DataModel__ElementsAssignment_2 : ( ruleDataModelElement ) ;
    public final void rule__DataModel__ElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5775:1: ( ( ruleDataModelElement ) )
            // InternalDataDsl.g:5776:2: ( ruleDataModelElement )
            {
            // InternalDataDsl.g:5776:2: ( ruleDataModelElement )
            // InternalDataDsl.g:5777:3: ruleDataModelElement
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
    // InternalDataDsl.g:5786:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5790:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalDataDsl.g:5791:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalDataDsl.g:5791:2: ( ruleQualifiedNameWithWildcard )
            // InternalDataDsl.g:5792:3: ruleQualifiedNameWithWildcard
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
    // InternalDataDsl.g:5801:1: rule__Package__TagsAssignment_0_0 : ( ruleTag ) ;
    public final void rule__Package__TagsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5805:1: ( ( ruleTag ) )
            // InternalDataDsl.g:5806:2: ( ruleTag )
            {
            // InternalDataDsl.g:5806:2: ( ruleTag )
            // InternalDataDsl.g:5807:3: ruleTag
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
    // InternalDataDsl.g:5816:1: rule__Package__TagsAssignment_0_1 : ( ruleTag ) ;
    public final void rule__Package__TagsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5820:1: ( ( ruleTag ) )
            // InternalDataDsl.g:5821:2: ( ruleTag )
            {
            // InternalDataDsl.g:5821:2: ( ruleTag )
            // InternalDataDsl.g:5822:3: ruleTag
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
    // InternalDataDsl.g:5831:1: rule__Package__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__Package__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5835:1: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:5836:2: ( ruleQualifiedName )
            {
            // InternalDataDsl.g:5836:2: ( ruleQualifiedName )
            // InternalDataDsl.g:5837:3: ruleQualifiedName
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
    // InternalDataDsl.g:5846:1: rule__Package__ElementsAssignment_4 : ( ruleSpecificationElement ) ;
    public final void rule__Package__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5850:1: ( ( ruleSpecificationElement ) )
            // InternalDataDsl.g:5851:2: ( ruleSpecificationElement )
            {
            // InternalDataDsl.g:5851:2: ( ruleSpecificationElement )
            // InternalDataDsl.g:5852:3: ruleSpecificationElement
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
    // InternalDataDsl.g:5861:1: rule__Package__ElementsAssignment_5 : ( ruleSpecificationElement ) ;
    public final void rule__Package__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5865:1: ( ( ruleSpecificationElement ) )
            // InternalDataDsl.g:5866:2: ( ruleSpecificationElement )
            {
            // InternalDataDsl.g:5866:2: ( ruleSpecificationElement )
            // InternalDataDsl.g:5867:3: ruleSpecificationElement
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
    // InternalDataDsl.g:5876:1: rule__Tag__TagAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Tag__TagAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5880:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5881:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5881:2: ( RULE_STRING )
            // InternalDataDsl.g:5882:3: RULE_STRING
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
    // InternalDataDsl.g:5891:1: rule__Substring__TypeStringAssignment_0 : ( ruleTypeString ) ;
    public final void rule__Substring__TypeStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5895:1: ( ( ruleTypeString ) )
            // InternalDataDsl.g:5896:2: ( ruleTypeString )
            {
            // InternalDataDsl.g:5896:2: ( ruleTypeString )
            // InternalDataDsl.g:5897:3: ruleTypeString
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
    // InternalDataDsl.g:5906:1: rule__Substring__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Substring__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5910:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5911:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5911:2: ( RULE_ID )
            // InternalDataDsl.g:5912:3: RULE_ID
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
    // InternalDataDsl.g:5921:1: rule__Substring__MinlengthAssignment_3 : ( RULE_INT ) ;
    public final void rule__Substring__MinlengthAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5925:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:5926:2: ( RULE_INT )
            {
            // InternalDataDsl.g:5926:2: ( RULE_INT )
            // InternalDataDsl.g:5927:3: RULE_INT
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
    // InternalDataDsl.g:5936:1: rule__Substring__MaxlengthAssignment_5 : ( RULE_INT ) ;
    public final void rule__Substring__MaxlengthAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5940:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:5941:2: ( RULE_INT )
            {
            // InternalDataDsl.g:5941:2: ( RULE_INT )
            // InternalDataDsl.g:5942:3: RULE_INT
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
    // InternalDataDsl.g:5951:1: rule__Character__TypeCharacterAssignment_0 : ( ruleTypeCharacter ) ;
    public final void rule__Character__TypeCharacterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5955:1: ( ( ruleTypeCharacter ) )
            // InternalDataDsl.g:5956:2: ( ruleTypeCharacter )
            {
            // InternalDataDsl.g:5956:2: ( ruleTypeCharacter )
            // InternalDataDsl.g:5957:3: ruleTypeCharacter
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
    // InternalDataDsl.g:5966:1: rule__Character__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Character__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5970:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:5971:2: ( RULE_ID )
            {
            // InternalDataDsl.g:5971:2: ( RULE_ID )
            // InternalDataDsl.g:5972:3: RULE_ID
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
    // InternalDataDsl.g:5981:1: rule__Character__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Character__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:5985:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:5986:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:5986:2: ( RULE_STRING )
            // InternalDataDsl.g:5987:3: RULE_STRING
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
    // InternalDataDsl.g:5996:1: rule__CompositeNode__KeyAssignment_0_0 : ( ( 'key' ) ) ;
    public final void rule__CompositeNode__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6000:1: ( ( ( 'key' ) ) )
            // InternalDataDsl.g:6001:2: ( ( 'key' ) )
            {
            // InternalDataDsl.g:6001:2: ( ( 'key' ) )
            // InternalDataDsl.g:6002:3: ( 'key' )
            {
             before(grammarAccess.getCompositeNodeAccess().getKeyKeyKeyword_0_0_0()); 
            // InternalDataDsl.g:6003:3: ( 'key' )
            // InternalDataDsl.g:6004:4: 'key'
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
    // InternalDataDsl.g:6015:1: rule__CompositeNode__UniqueAssignment_0_1 : ( ( 'unique' ) ) ;
    public final void rule__CompositeNode__UniqueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6019:1: ( ( ( 'unique' ) ) )
            // InternalDataDsl.g:6020:2: ( ( 'unique' ) )
            {
            // InternalDataDsl.g:6020:2: ( ( 'unique' ) )
            // InternalDataDsl.g:6021:3: ( 'unique' )
            {
             before(grammarAccess.getCompositeNodeAccess().getUniqueUniqueKeyword_0_1_0()); 
            // InternalDataDsl.g:6022:3: ( 'unique' )
            // InternalDataDsl.g:6023:4: 'unique'
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
    // InternalDataDsl.g:6034:1: rule__CompositeNode__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CompositeNode__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6038:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6039:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6039:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6040:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositeNodeAccess().getTypeTypeSpecificationCrossReference_1_0()); 
            // InternalDataDsl.g:6041:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6042:4: ruleQualifiedName
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
    // InternalDataDsl.g:6053:1: rule__CompositeNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CompositeNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6057:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6058:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6058:2: ( RULE_ID )
            // InternalDataDsl.g:6059:3: RULE_ID
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
    // InternalDataDsl.g:6068:1: rule__CompositeNode__CardinalityAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__CompositeNode__CardinalityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6072:1: ( ( ruleCardinality ) )
            // InternalDataDsl.g:6073:2: ( ruleCardinality )
            {
            // InternalDataDsl.g:6073:2: ( ruleCardinality )
            // InternalDataDsl.g:6074:3: ruleCardinality
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
    // InternalDataDsl.g:6083:1: rule__CompositeNode__OptionsAssignment_4_1 : ( ruleOption ) ;
    public final void rule__CompositeNode__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6087:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6088:2: ( ruleOption )
            {
            // InternalDataDsl.g:6088:2: ( ruleOption )
            // InternalDataDsl.g:6089:3: ruleOption
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
    // InternalDataDsl.g:6098:1: rule__CompositeNode__OptionsAssignment_4_2_1 : ( ruleOption ) ;
    public final void rule__CompositeNode__OptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6102:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6103:2: ( ruleOption )
            {
            // InternalDataDsl.g:6103:2: ( ruleOption )
            // InternalDataDsl.g:6104:3: ruleOption
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
    // InternalDataDsl.g:6113:1: rule__FragmentNode__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__FragmentNode__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6117:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6118:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6118:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6119:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFragmentNodeAccess().getTypeFragmentCrossReference_1_0()); 
            // InternalDataDsl.g:6120:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6121:4: ruleQualifiedName
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
    // InternalDataDsl.g:6132:1: rule__FragmentNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__FragmentNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6136:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6137:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6137:2: ( RULE_ID )
            // InternalDataDsl.g:6138:3: RULE_ID
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
    // InternalDataDsl.g:6147:1: rule__FragmentNode__CardinalityAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__FragmentNode__CardinalityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6151:1: ( ( ruleCardinality ) )
            // InternalDataDsl.g:6152:2: ( ruleCardinality )
            {
            // InternalDataDsl.g:6152:2: ( ruleCardinality )
            // InternalDataDsl.g:6153:3: ruleCardinality
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
    // InternalDataDsl.g:6162:1: rule__FragmentNode__OptionsAssignment_4_1 : ( ruleOption ) ;
    public final void rule__FragmentNode__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6166:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6167:2: ( ruleOption )
            {
            // InternalDataDsl.g:6167:2: ( ruleOption )
            // InternalDataDsl.g:6168:3: ruleOption
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
    // InternalDataDsl.g:6177:1: rule__FragmentNode__OptionsAssignment_4_2_1 : ( ruleOption ) ;
    public final void rule__FragmentNode__OptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6181:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6182:2: ( ruleOption )
            {
            // InternalDataDsl.g:6182:2: ( ruleOption )
            // InternalDataDsl.g:6183:3: ruleOption
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
    // InternalDataDsl.g:6192:1: rule__PrimitiveNode__KeyAssignment_0_0 : ( ( 'key' ) ) ;
    public final void rule__PrimitiveNode__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6196:1: ( ( ( 'key' ) ) )
            // InternalDataDsl.g:6197:2: ( ( 'key' ) )
            {
            // InternalDataDsl.g:6197:2: ( ( 'key' ) )
            // InternalDataDsl.g:6198:3: ( 'key' )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getKeyKeyKeyword_0_0_0()); 
            // InternalDataDsl.g:6199:3: ( 'key' )
            // InternalDataDsl.g:6200:4: 'key'
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
    // InternalDataDsl.g:6211:1: rule__PrimitiveNode__UniqueAssignment_0_1 : ( ( 'unique' ) ) ;
    public final void rule__PrimitiveNode__UniqueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6215:1: ( ( ( 'unique' ) ) )
            // InternalDataDsl.g:6216:2: ( ( 'unique' ) )
            {
            // InternalDataDsl.g:6216:2: ( ( 'unique' ) )
            // InternalDataDsl.g:6217:3: ( 'unique' )
            {
             before(grammarAccess.getPrimitiveNodeAccess().getUniqueUniqueKeyword_0_1_0()); 
            // InternalDataDsl.g:6218:3: ( 'unique' )
            // InternalDataDsl.g:6219:4: 'unique'
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
    // InternalDataDsl.g:6230:1: rule__PrimitiveNode__TypeAssignment_1 : ( ruleBasicType ) ;
    public final void rule__PrimitiveNode__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6234:1: ( ( ruleBasicType ) )
            // InternalDataDsl.g:6235:2: ( ruleBasicType )
            {
            // InternalDataDsl.g:6235:2: ( ruleBasicType )
            // InternalDataDsl.g:6236:3: ruleBasicType
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
    // InternalDataDsl.g:6245:1: rule__PrimitiveNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PrimitiveNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6249:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6250:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6250:2: ( RULE_ID )
            // InternalDataDsl.g:6251:3: RULE_ID
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
    // InternalDataDsl.g:6260:1: rule__PrimitiveNode__CardinalityAssignment_3_1 : ( ruleCardinality ) ;
    public final void rule__PrimitiveNode__CardinalityAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6264:1: ( ( ruleCardinality ) )
            // InternalDataDsl.g:6265:2: ( ruleCardinality )
            {
            // InternalDataDsl.g:6265:2: ( ruleCardinality )
            // InternalDataDsl.g:6266:3: ruleCardinality
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
    // InternalDataDsl.g:6275:1: rule__PrimitiveNode__OptionsAssignment_4_1 : ( ruleOption ) ;
    public final void rule__PrimitiveNode__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6279:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6280:2: ( ruleOption )
            {
            // InternalDataDsl.g:6280:2: ( ruleOption )
            // InternalDataDsl.g:6281:3: ruleOption
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
    // InternalDataDsl.g:6290:1: rule__PrimitiveNode__OptionsAssignment_4_2_1 : ( ruleOption ) ;
    public final void rule__PrimitiveNode__OptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6294:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6295:2: ( ruleOption )
            {
            // InternalDataDsl.g:6295:2: ( ruleOption )
            // InternalDataDsl.g:6296:3: ruleOption
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
    // InternalDataDsl.g:6305:1: rule__Cardinality__MinAssignment_0 : ( RULE_CARDINALITY_SYMBOLS ) ;
    public final void rule__Cardinality__MinAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6309:1: ( ( RULE_CARDINALITY_SYMBOLS ) )
            // InternalDataDsl.g:6310:2: ( RULE_CARDINALITY_SYMBOLS )
            {
            // InternalDataDsl.g:6310:2: ( RULE_CARDINALITY_SYMBOLS )
            // InternalDataDsl.g:6311:3: RULE_CARDINALITY_SYMBOLS
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
    // InternalDataDsl.g:6320:1: rule__Cardinality__MaxAssignment_1_1 : ( RULE_CARDINALITY_SYMBOLS ) ;
    public final void rule__Cardinality__MaxAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6324:1: ( ( RULE_CARDINALITY_SYMBOLS ) )
            // InternalDataDsl.g:6325:2: ( RULE_CARDINALITY_SYMBOLS )
            {
            // InternalDataDsl.g:6325:2: ( RULE_CARDINALITY_SYMBOLS )
            // InternalDataDsl.g:6326:3: RULE_CARDINALITY_SYMBOLS
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
    // InternalDataDsl.g:6335:1: rule__DataDescription__FormatAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DataDescription__FormatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6339:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6340:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6340:2: ( RULE_STRING )
            // InternalDataDsl.g:6341:3: RULE_STRING
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
    // InternalDataDsl.g:6350:1: rule__DataDescription__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataDescription__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6354:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6355:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6355:2: ( RULE_ID )
            // InternalDataDsl.g:6356:3: RULE_ID
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
    // InternalDataDsl.g:6365:1: rule__DataDescription__FragmentsAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataDescription__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6369:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6370:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6370:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6371:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentCrossReference_3_1_0()); 
            // InternalDataDsl.g:6372:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6373:4: ruleQualifiedName
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
    // InternalDataDsl.g:6384:1: rule__DataDescription__FragmentsAssignment_3_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DataDescription__FragmentsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6388:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6389:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6389:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6390:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDataDescriptionAccess().getFragmentsFragmentCrossReference_3_2_1_0()); 
            // InternalDataDsl.g:6391:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6392:4: ruleQualifiedName
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
    // InternalDataDsl.g:6403:1: rule__DataDescription__NodesAssignment_5_0 : ( ruleNode ) ;
    public final void rule__DataDescription__NodesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6407:1: ( ( ruleNode ) )
            // InternalDataDsl.g:6408:2: ( ruleNode )
            {
            // InternalDataDsl.g:6408:2: ( ruleNode )
            // InternalDataDsl.g:6409:3: ruleNode
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
    // InternalDataDsl.g:6418:1: rule__DataDescription__NodesAssignment_5_1 : ( ruleNode ) ;
    public final void rule__DataDescription__NodesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6422:1: ( ( ruleNode ) )
            // InternalDataDsl.g:6423:2: ( ruleNode )
            {
            // InternalDataDsl.g:6423:2: ( ruleNode )
            // InternalDataDsl.g:6424:3: ruleNode
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
    // InternalDataDsl.g:6433:1: rule__DataDescription__OptionsAssignment_7_1 : ( ruleOption ) ;
    public final void rule__DataDescription__OptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6437:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6438:2: ( ruleOption )
            {
            // InternalDataDsl.g:6438:2: ( ruleOption )
            // InternalDataDsl.g:6439:3: ruleOption
            {
             before(grammarAccess.getDataDescriptionAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataDescriptionAccess().getOptionsOptionParserRuleCall_7_1_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:6448:1: rule__DataDescription__OptionsAssignment_7_2_1 : ( ruleOption ) ;
    public final void rule__DataDescription__OptionsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6452:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6453:2: ( ruleOption )
            {
            // InternalDataDsl.g:6453:2: ( ruleOption )
            // InternalDataDsl.g:6454:3: ruleOption
            {
             before(grammarAccess.getDataDescriptionAccess().getOptionsOptionParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataDescriptionAccess().getOptionsOptionParserRuleCall_7_2_1_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:6463:1: rule__Fragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6467:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6468:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6468:2: ( RULE_ID )
            // InternalDataDsl.g:6469:3: RULE_ID
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
    // InternalDataDsl.g:6478:1: rule__Fragment__FragmentsAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Fragment__FragmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6482:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6483:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6483:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6484:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFragmentAccess().getFragmentsFragmentCrossReference_2_1_0()); 
            // InternalDataDsl.g:6485:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6486:4: ruleQualifiedName
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
    // InternalDataDsl.g:6497:1: rule__Fragment__FragmentsAssignment_2_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Fragment__FragmentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6501:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6502:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6502:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6503:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFragmentAccess().getFragmentsFragmentCrossReference_2_2_1_0()); 
            // InternalDataDsl.g:6504:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6505:4: ruleQualifiedName
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
    // InternalDataDsl.g:6516:1: rule__Fragment__NodesAssignment_4 : ( ruleNode ) ;
    public final void rule__Fragment__NodesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6520:1: ( ( ruleNode ) )
            // InternalDataDsl.g:6521:2: ( ruleNode )
            {
            // InternalDataDsl.g:6521:2: ( ruleNode )
            // InternalDataDsl.g:6522:3: ruleNode
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
    // InternalDataDsl.g:6531:1: rule__Fragment__NodesAssignment_5 : ( ruleNode ) ;
    public final void rule__Fragment__NodesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6535:1: ( ( ruleNode ) )
            // InternalDataDsl.g:6536:2: ( ruleNode )
            {
            // InternalDataDsl.g:6536:2: ( ruleNode )
            // InternalDataDsl.g:6537:3: ruleNode
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


    // $ANTLR start "rule__Feed__NameAssignment_1"
    // InternalDataDsl.g:6546:1: rule__Feed__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feed__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6550:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6551:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6551:2: ( RULE_ID )
            // InternalDataDsl.g:6552:3: RULE_ID
            {
             before(grammarAccess.getFeedAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeedAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__NameAssignment_1"


    // $ANTLR start "rule__Feed__DescriptionAssignment_3"
    // InternalDataDsl.g:6561:1: rule__Feed__DescriptionAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Feed__DescriptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6565:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6566:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6566:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6567:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeedAccess().getDescriptionDataDescriptionCrossReference_3_0()); 
            // InternalDataDsl.g:6568:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6569:4: ruleQualifiedName
            {
             before(grammarAccess.getFeedAccess().getDescriptionDataDescriptionQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeedAccess().getDescriptionDataDescriptionQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeedAccess().getDescriptionDataDescriptionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__DescriptionAssignment_3"


    // $ANTLR start "rule__Feed__PathsAssignment_5"
    // InternalDataDsl.g:6580:1: rule__Feed__PathsAssignment_5 : ( RULE_STRING ) ;
    public final void rule__Feed__PathsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6584:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6585:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6585:2: ( RULE_STRING )
            // InternalDataDsl.g:6586:3: RULE_STRING
            {
             before(grammarAccess.getFeedAccess().getPathsSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFeedAccess().getPathsSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__PathsAssignment_5"


    // $ANTLR start "rule__Feed__PathsAssignment_6"
    // InternalDataDsl.g:6595:1: rule__Feed__PathsAssignment_6 : ( RULE_STRING ) ;
    public final void rule__Feed__PathsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6599:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6600:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6600:2: ( RULE_STRING )
            // InternalDataDsl.g:6601:3: RULE_STRING
            {
             before(grammarAccess.getFeedAccess().getPathsSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFeedAccess().getPathsSTRINGTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feed__PathsAssignment_6"


    // $ANTLR start "rule__DataTypeRefinement__NameAssignment_1"
    // InternalDataDsl.g:6610:1: rule__DataTypeRefinement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataTypeRefinement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6614:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6615:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6615:2: ( RULE_ID )
            // InternalDataDsl.g:6616:3: RULE_ID
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
    // InternalDataDsl.g:6625:1: rule__DataTypeRefinement__RefineAssignment_3 : ( ruleBasicType ) ;
    public final void rule__DataTypeRefinement__RefineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6629:1: ( ( ruleBasicType ) )
            // InternalDataDsl.g:6630:2: ( ruleBasicType )
            {
            // InternalDataDsl.g:6630:2: ( ruleBasicType )
            // InternalDataDsl.g:6631:3: ruleBasicType
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
    // InternalDataDsl.g:6640:1: rule__DataTypeRefinement__SubsequencesAssignment_4_1_0 : ( ruleSubstringConcept ) ;
    public final void rule__DataTypeRefinement__SubsequencesAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6644:1: ( ( ruleSubstringConcept ) )
            // InternalDataDsl.g:6645:2: ( ruleSubstringConcept )
            {
            // InternalDataDsl.g:6645:2: ( ruleSubstringConcept )
            // InternalDataDsl.g:6646:3: ruleSubstringConcept
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
    // InternalDataDsl.g:6655:1: rule__DataTypeRefinement__SubsequencesAssignment_4_1_1 : ( ruleSubstringConcept ) ;
    public final void rule__DataTypeRefinement__SubsequencesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6659:1: ( ( ruleSubstringConcept ) )
            // InternalDataDsl.g:6660:2: ( ruleSubstringConcept )
            {
            // InternalDataDsl.g:6660:2: ( ruleSubstringConcept )
            // InternalDataDsl.g:6661:3: ruleSubstringConcept
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
    // InternalDataDsl.g:6670:1: rule__DataTypeRefinement__OptionsAssignment_5_1 : ( ruleOption ) ;
    public final void rule__DataTypeRefinement__OptionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6674:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6675:2: ( ruleOption )
            {
            // InternalDataDsl.g:6675:2: ( ruleOption )
            // InternalDataDsl.g:6676:3: ruleOption
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
    // InternalDataDsl.g:6685:1: rule__DataTypeRefinement__OptionsAssignment_5_2_1 : ( ruleOption ) ;
    public final void rule__DataTypeRefinement__OptionsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6689:1: ( ( ruleOption ) )
            // InternalDataDsl.g:6690:2: ( ruleOption )
            {
            // InternalDataDsl.g:6690:2: ( ruleOption )
            // InternalDataDsl.g:6691:3: ruleOption
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
    // InternalDataDsl.g:6700:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6704:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:6705:2: ( RULE_ID )
            {
            // InternalDataDsl.g:6705:2: ( RULE_ID )
            // InternalDataDsl.g:6706:3: RULE_ID
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
    // InternalDataDsl.g:6715:1: rule__Enumeration__ValuesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Enumeration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6719:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6720:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6720:2: ( RULE_STRING )
            // InternalDataDsl.g:6721:3: RULE_STRING
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
    // InternalDataDsl.g:6730:1: rule__Enumeration__ValuesAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Enumeration__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6734:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6735:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6735:2: ( RULE_STRING )
            // InternalDataDsl.g:6736:3: RULE_STRING
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
    // InternalDataDsl.g:6745:1: rule__StringOption__KeyAssignment_0 : ( ruleStringOptionKey ) ;
    public final void rule__StringOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6749:1: ( ( ruleStringOptionKey ) )
            // InternalDataDsl.g:6750:2: ( ruleStringOptionKey )
            {
            // InternalDataDsl.g:6750:2: ( ruleStringOptionKey )
            // InternalDataDsl.g:6751:3: ruleStringOptionKey
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
    // InternalDataDsl.g:6760:1: rule__StringOption__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__StringOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6764:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:6765:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:6765:2: ( RULE_STRING )
            // InternalDataDsl.g:6766:3: RULE_STRING
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
    // InternalDataDsl.g:6775:1: rule__IntOption__KeyAssignment_0 : ( ruleIntOptionKey ) ;
    public final void rule__IntOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6779:1: ( ( ruleIntOptionKey ) )
            // InternalDataDsl.g:6780:2: ( ruleIntOptionKey )
            {
            // InternalDataDsl.g:6780:2: ( ruleIntOptionKey )
            // InternalDataDsl.g:6781:3: ruleIntOptionKey
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
    // InternalDataDsl.g:6790:1: rule__IntOption__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__IntOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6794:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:6795:2: ( RULE_INT )
            {
            // InternalDataDsl.g:6795:2: ( RULE_INT )
            // InternalDataDsl.g:6796:3: RULE_INT
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
    // InternalDataDsl.g:6805:1: rule__DoubleOption__KeyAssignment_0 : ( ruleDoubleOptionKey ) ;
    public final void rule__DoubleOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6809:1: ( ( ruleDoubleOptionKey ) )
            // InternalDataDsl.g:6810:2: ( ruleDoubleOptionKey )
            {
            // InternalDataDsl.g:6810:2: ( ruleDoubleOptionKey )
            // InternalDataDsl.g:6811:3: ruleDoubleOptionKey
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
    // InternalDataDsl.g:6820:1: rule__DoubleOption__ValueAssignment_2 : ( RULE_DOUBLE ) ;
    public final void rule__DoubleOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6824:1: ( ( RULE_DOUBLE ) )
            // InternalDataDsl.g:6825:2: ( RULE_DOUBLE )
            {
            // InternalDataDsl.g:6825:2: ( RULE_DOUBLE )
            // InternalDataDsl.g:6826:3: RULE_DOUBLE
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
    // InternalDataDsl.g:6835:1: rule__BooleanOption__KeyAssignment_0 : ( ruleBooleanOptionKey ) ;
    public final void rule__BooleanOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6839:1: ( ( ruleBooleanOptionKey ) )
            // InternalDataDsl.g:6840:2: ( ruleBooleanOptionKey )
            {
            // InternalDataDsl.g:6840:2: ( ruleBooleanOptionKey )
            // InternalDataDsl.g:6841:3: ruleBooleanOptionKey
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
    // InternalDataDsl.g:6850:1: rule__BooleanOption__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6854:1: ( ( RULE_BOOLEAN ) )
            // InternalDataDsl.g:6855:2: ( RULE_BOOLEAN )
            {
            // InternalDataDsl.g:6855:2: ( RULE_BOOLEAN )
            // InternalDataDsl.g:6856:3: RULE_BOOLEAN
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
    // InternalDataDsl.g:6865:1: rule__ListQualifiedNameOption__KeyAssignment_0 : ( ruleListQualifiedNameOptionKey ) ;
    public final void rule__ListQualifiedNameOption__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6869:1: ( ( ruleListQualifiedNameOptionKey ) )
            // InternalDataDsl.g:6870:2: ( ruleListQualifiedNameOptionKey )
            {
            // InternalDataDsl.g:6870:2: ( ruleListQualifiedNameOptionKey )
            // InternalDataDsl.g:6871:3: ruleListQualifiedNameOptionKey
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
    // InternalDataDsl.g:6880:1: rule__ListQualifiedNameOption__FragmentsAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ListQualifiedNameOption__FragmentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:6884:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDataDsl.g:6885:2: ( ( ruleQualifiedName ) )
            {
            // InternalDataDsl.g:6885:2: ( ( ruleQualifiedName ) )
            // InternalDataDsl.g:6886:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getListQualifiedNameOptionAccess().getFragmentsNodeCrossReference_2_0()); 
            // InternalDataDsl.g:6887:3: ( ruleQualifiedName )
            // InternalDataDsl.g:6888:4: ruleQualifiedName
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x9000000000000000L,0x0000000000003D04L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x9000000000000002L,0x0000000000003D04L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x9000000000000000L,0x0000000000003D06L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0FFFFC0000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000090L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000003FFFFE00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000201L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x400003FFFFE00010L,0x0000000000018002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x400003FFFFE00010L,0x0000000000018000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x400003FFFFE00012L,0x0000000000018000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000000001F8000L,0x0000000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000001F8002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000200L});

}