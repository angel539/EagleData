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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_FORMAT", "RULE_ID", "RULE_STRING", "RULE_UNIQUENESS", "RULE_DELETATION_MARK", "RULE_MODIFICATION_MARK", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'int'", "'real'", "'date'", "'time'", "'year'", "'month'", "'day'", "'boolean'", "'lat'", "'long'", "'minLength'", "'maxLength'", "'casesensitive'", "'min'", "'max'", "'null'", "'separator'", "'default'", "'regex'", "'flags'", "'decimalchar'", "'pattern'", "'format'", "','", "'description'", "'{'", "'}'", "':'", "'fragment'", "'datatype'", "'enumeration'", "'='", "'>'", "'#'"
    };
    public static final int RULE_MODIFICATION_MARK=10;
    public static final int T__19=19;
    public static final int RULE_FORMAT=5;
    public static final int RULE_UNIQUENESS=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_DELETATION_MARK=9;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


    // $ANTLR start "entryRuleDataDescription"
    // InternalDataDsl.g:78:1: entryRuleDataDescription : ruleDataDescription EOF ;
    public final void entryRuleDataDescription() throws RecognitionException {
        try {
            // InternalDataDsl.g:79:1: ( ruleDataDescription EOF )
            // InternalDataDsl.g:80:1: ruleDataDescription EOF
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
    // InternalDataDsl.g:87:1: ruleDataDescription : ( ( rule__DataDescription__Alternatives ) ) ;
    public final void ruleDataDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:91:2: ( ( ( rule__DataDescription__Alternatives ) ) )
            // InternalDataDsl.g:92:2: ( ( rule__DataDescription__Alternatives ) )
            {
            // InternalDataDsl.g:92:2: ( ( rule__DataDescription__Alternatives ) )
            // InternalDataDsl.g:93:3: ( rule__DataDescription__Alternatives )
            {
             before(grammarAccess.getDataDescriptionAccess().getAlternatives()); 
            // InternalDataDsl.g:94:3: ( rule__DataDescription__Alternatives )
            // InternalDataDsl.g:94:4: rule__DataDescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataDescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataDescriptionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleDataSource"
    // InternalDataDsl.g:103:1: entryRuleDataSource : ruleDataSource EOF ;
    public final void entryRuleDataSource() throws RecognitionException {
        try {
            // InternalDataDsl.g:104:1: ( ruleDataSource EOF )
            // InternalDataDsl.g:105:1: ruleDataSource EOF
            {
             before(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleDataSource();

            state._fsp--;

             after(grammarAccess.getDataSourceRule()); 
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
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // InternalDataDsl.g:112:1: ruleDataSource : ( ( rule__DataSource__Group__0 ) ) ;
    public final void ruleDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:116:2: ( ( ( rule__DataSource__Group__0 ) ) )
            // InternalDataDsl.g:117:2: ( ( rule__DataSource__Group__0 ) )
            {
            // InternalDataDsl.g:117:2: ( ( rule__DataSource__Group__0 ) )
            // InternalDataDsl.g:118:3: ( rule__DataSource__Group__0 )
            {
             before(grammarAccess.getDataSourceAccess().getGroup()); 
            // InternalDataDsl.g:119:3: ( rule__DataSource__Group__0 )
            // InternalDataDsl.g:119:4: rule__DataSource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleDataFragment"
    // InternalDataDsl.g:128:1: entryRuleDataFragment : ruleDataFragment EOF ;
    public final void entryRuleDataFragment() throws RecognitionException {
        try {
            // InternalDataDsl.g:129:1: ( ruleDataFragment EOF )
            // InternalDataDsl.g:130:1: ruleDataFragment EOF
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
    // InternalDataDsl.g:137:1: ruleDataFragment : ( ( rule__DataFragment__Group__0 ) ) ;
    public final void ruleDataFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:141:2: ( ( ( rule__DataFragment__Group__0 ) ) )
            // InternalDataDsl.g:142:2: ( ( rule__DataFragment__Group__0 ) )
            {
            // InternalDataDsl.g:142:2: ( ( rule__DataFragment__Group__0 ) )
            // InternalDataDsl.g:143:3: ( rule__DataFragment__Group__0 )
            {
             before(grammarAccess.getDataFragmentAccess().getGroup()); 
            // InternalDataDsl.g:144:3: ( rule__DataFragment__Group__0 )
            // InternalDataDsl.g:144:4: rule__DataFragment__Group__0
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
    // InternalDataDsl.g:153:1: entryRuleTypeSpecification : ruleTypeSpecification EOF ;
    public final void entryRuleTypeSpecification() throws RecognitionException {
        try {
            // InternalDataDsl.g:154:1: ( ruleTypeSpecification EOF )
            // InternalDataDsl.g:155:1: ruleTypeSpecification EOF
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
    // InternalDataDsl.g:162:1: ruleTypeSpecification : ( ( rule__TypeSpecification__Alternatives ) ) ;
    public final void ruleTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:166:2: ( ( ( rule__TypeSpecification__Alternatives ) ) )
            // InternalDataDsl.g:167:2: ( ( rule__TypeSpecification__Alternatives ) )
            {
            // InternalDataDsl.g:167:2: ( ( rule__TypeSpecification__Alternatives ) )
            // InternalDataDsl.g:168:3: ( rule__TypeSpecification__Alternatives )
            {
             before(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            // InternalDataDsl.g:169:3: ( rule__TypeSpecification__Alternatives )
            // InternalDataDsl.g:169:4: rule__TypeSpecification__Alternatives
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
    // InternalDataDsl.g:178:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDataDsl.g:179:1: ( ruleDataType EOF )
            // InternalDataDsl.g:180:1: ruleDataType EOF
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
    // InternalDataDsl.g:187:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:191:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDataDsl.g:192:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDataDsl.g:192:2: ( ( rule__DataType__Group__0 ) )
            // InternalDataDsl.g:193:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDataDsl.g:194:3: ( rule__DataType__Group__0 )
            // InternalDataDsl.g:194:4: rule__DataType__Group__0
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
    // InternalDataDsl.g:203:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalDataDsl.g:204:1: ( ruleEnumeration EOF )
            // InternalDataDsl.g:205:1: ruleEnumeration EOF
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
    // InternalDataDsl.g:212:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:216:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalDataDsl.g:217:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalDataDsl.g:217:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalDataDsl.g:218:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalDataDsl.g:219:3: ( rule__Enumeration__Group__0 )
            // InternalDataDsl.g:219:4: rule__Enumeration__Group__0
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


    // $ANTLR start "entryRuleNode"
    // InternalDataDsl.g:228:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:229:1: ( ruleNode EOF )
            // InternalDataDsl.g:230:1: ruleNode EOF
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
    // InternalDataDsl.g:237:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:241:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalDataDsl.g:242:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalDataDsl.g:242:2: ( ( rule__Node__Alternatives ) )
            // InternalDataDsl.g:243:3: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalDataDsl.g:244:3: ( rule__Node__Alternatives )
            // InternalDataDsl.g:244:4: rule__Node__Alternatives
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
    // InternalDataDsl.g:253:1: entryRuleCompositeNode : ruleCompositeNode EOF ;
    public final void entryRuleCompositeNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:254:1: ( ruleCompositeNode EOF )
            // InternalDataDsl.g:255:1: ruleCompositeNode EOF
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
    // InternalDataDsl.g:262:1: ruleCompositeNode : ( ( rule__CompositeNode__Group__0 ) ) ;
    public final void ruleCompositeNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:266:2: ( ( ( rule__CompositeNode__Group__0 ) ) )
            // InternalDataDsl.g:267:2: ( ( rule__CompositeNode__Group__0 ) )
            {
            // InternalDataDsl.g:267:2: ( ( rule__CompositeNode__Group__0 ) )
            // InternalDataDsl.g:268:3: ( rule__CompositeNode__Group__0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup()); 
            // InternalDataDsl.g:269:3: ( rule__CompositeNode__Group__0 )
            // InternalDataDsl.g:269:4: rule__CompositeNode__Group__0
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


    // $ANTLR start "entryRuleLeafNode"
    // InternalDataDsl.g:278:1: entryRuleLeafNode : ruleLeafNode EOF ;
    public final void entryRuleLeafNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:279:1: ( ruleLeafNode EOF )
            // InternalDataDsl.g:280:1: ruleLeafNode EOF
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
    // InternalDataDsl.g:287:1: ruleLeafNode : ( ( rule__LeafNode__Group__0 ) ) ;
    public final void ruleLeafNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:291:2: ( ( ( rule__LeafNode__Group__0 ) ) )
            // InternalDataDsl.g:292:2: ( ( rule__LeafNode__Group__0 ) )
            {
            // InternalDataDsl.g:292:2: ( ( rule__LeafNode__Group__0 ) )
            // InternalDataDsl.g:293:3: ( rule__LeafNode__Group__0 )
            {
             before(grammarAccess.getLeafNodeAccess().getGroup()); 
            // InternalDataDsl.g:294:3: ( rule__LeafNode__Group__0 )
            // InternalDataDsl.g:294:4: rule__LeafNode__Group__0
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
    // InternalDataDsl.g:303:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:304:1: ( ruleOption EOF )
            // InternalDataDsl.g:305:1: ruleOption EOF
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
    // InternalDataDsl.g:312:1: ruleOption : ( ( rule__Option__Alternatives ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:316:2: ( ( ( rule__Option__Alternatives ) ) )
            // InternalDataDsl.g:317:2: ( ( rule__Option__Alternatives ) )
            {
            // InternalDataDsl.g:317:2: ( ( rule__Option__Alternatives ) )
            // InternalDataDsl.g:318:3: ( rule__Option__Alternatives )
            {
             before(grammarAccess.getOptionAccess().getAlternatives()); 
            // InternalDataDsl.g:319:3: ( rule__Option__Alternatives )
            // InternalDataDsl.g:319:4: rule__Option__Alternatives
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


    // $ANTLR start "ruleBasicType"
    // InternalDataDsl.g:328:1: ruleBasicType : ( ( rule__BasicType__Alternatives ) ) ;
    public final void ruleBasicType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:332:1: ( ( ( rule__BasicType__Alternatives ) ) )
            // InternalDataDsl.g:333:2: ( ( rule__BasicType__Alternatives ) )
            {
            // InternalDataDsl.g:333:2: ( ( rule__BasicType__Alternatives ) )
            // InternalDataDsl.g:334:3: ( rule__BasicType__Alternatives )
            {
             before(grammarAccess.getBasicTypeAccess().getAlternatives()); 
            // InternalDataDsl.g:335:3: ( rule__BasicType__Alternatives )
            // InternalDataDsl.g:335:4: rule__BasicType__Alternatives
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


    // $ANTLR start "ruleOptionKey"
    // InternalDataDsl.g:344:1: ruleOptionKey : ( ( rule__OptionKey__Alternatives ) ) ;
    public final void ruleOptionKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:348:1: ( ( ( rule__OptionKey__Alternatives ) ) )
            // InternalDataDsl.g:349:2: ( ( rule__OptionKey__Alternatives ) )
            {
            // InternalDataDsl.g:349:2: ( ( rule__OptionKey__Alternatives ) )
            // InternalDataDsl.g:350:3: ( rule__OptionKey__Alternatives )
            {
             before(grammarAccess.getOptionKeyAccess().getAlternatives()); 
            // InternalDataDsl.g:351:3: ( rule__OptionKey__Alternatives )
            // InternalDataDsl.g:351:4: rule__OptionKey__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OptionKey__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOptionKeyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionKey"


    // $ANTLR start "rule__DataDescription__Alternatives"
    // InternalDataDsl.g:359:1: rule__DataDescription__Alternatives : ( ( ruleTypeSpecification ) | ( ruleDataSource ) | ( ruleDataFragment ) );
    public final void rule__DataDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:363:1: ( ( ruleTypeSpecification ) | ( ruleDataSource ) | ( ruleDataFragment ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 45:
            case 46:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 44:
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
                    // InternalDataDsl.g:364:2: ( ruleTypeSpecification )
                    {
                    // InternalDataDsl.g:364:2: ( ruleTypeSpecification )
                    // InternalDataDsl.g:365:3: ruleTypeSpecification
                    {
                     before(grammarAccess.getDataDescriptionAccess().getTypeSpecificationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTypeSpecification();

                    state._fsp--;

                     after(grammarAccess.getDataDescriptionAccess().getTypeSpecificationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:370:2: ( ruleDataSource )
                    {
                    // InternalDataDsl.g:370:2: ( ruleDataSource )
                    // InternalDataDsl.g:371:3: ruleDataSource
                    {
                     before(grammarAccess.getDataDescriptionAccess().getDataSourceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataSource();

                    state._fsp--;

                     after(grammarAccess.getDataDescriptionAccess().getDataSourceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:376:2: ( ruleDataFragment )
                    {
                    // InternalDataDsl.g:376:2: ( ruleDataFragment )
                    // InternalDataDsl.g:377:3: ruleDataFragment
                    {
                     before(grammarAccess.getDataDescriptionAccess().getDataFragmentParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataFragment();

                    state._fsp--;

                     after(grammarAccess.getDataDescriptionAccess().getDataFragmentParserRuleCall_2()); 

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
    // $ANTLR end "rule__DataDescription__Alternatives"


    // $ANTLR start "rule__TypeSpecification__Alternatives"
    // InternalDataDsl.g:386:1: rule__TypeSpecification__Alternatives : ( ( ruleDataType ) | ( ruleEnumeration ) );
    public final void rule__TypeSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:390:1: ( ( ruleDataType ) | ( ruleEnumeration ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==45) ) {
                alt2=1;
            }
            else if ( (LA2_0==46) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataDsl.g:391:2: ( ruleDataType )
                    {
                    // InternalDataDsl.g:391:2: ( ruleDataType )
                    // InternalDataDsl.g:392:3: ruleDataType
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
                    // InternalDataDsl.g:397:2: ( ruleEnumeration )
                    {
                    // InternalDataDsl.g:397:2: ( ruleEnumeration )
                    // InternalDataDsl.g:398:3: ruleEnumeration
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


    // $ANTLR start "rule__Node__Alternatives"
    // InternalDataDsl.g:407:1: rule__Node__Alternatives : ( ( ruleLeafNode ) | ( ruleCompositeNode ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:411:1: ( ( ruleLeafNode ) | ( ruleCompositeNode ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case RULE_UNIQUENESS:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==RULE_ID||LA3_2==49) ) {
                    alt3=1;
                }
                else if ( (LA3_2==RULE_STRING||LA3_2==41||LA3_2==43) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt3=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalDataDsl.g:412:2: ( ruleLeafNode )
                    {
                    // InternalDataDsl.g:412:2: ( ruleLeafNode )
                    // InternalDataDsl.g:413:3: ruleLeafNode
                    {
                     before(grammarAccess.getNodeAccess().getLeafNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLeafNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getLeafNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:418:2: ( ruleCompositeNode )
                    {
                    // InternalDataDsl.g:418:2: ( ruleCompositeNode )
                    // InternalDataDsl.g:419:3: ruleCompositeNode
                    {
                     before(grammarAccess.getNodeAccess().getCompositeNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getCompositeNodeParserRuleCall_1()); 

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


    // $ANTLR start "rule__LeafNode__Alternatives_1"
    // InternalDataDsl.g:428:1: rule__LeafNode__Alternatives_1 : ( ( ( rule__LeafNode__TypeAssignment_1_0 ) ) | ( ( rule__LeafNode__TypeCallAssignment_1_1 ) ) );
    public final void rule__LeafNode__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:432:1: ( ( ( rule__LeafNode__TypeAssignment_1_0 ) ) | ( ( rule__LeafNode__TypeCallAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=15 && LA4_0<=25)) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:433:2: ( ( rule__LeafNode__TypeAssignment_1_0 ) )
                    {
                    // InternalDataDsl.g:433:2: ( ( rule__LeafNode__TypeAssignment_1_0 ) )
                    // InternalDataDsl.g:434:3: ( rule__LeafNode__TypeAssignment_1_0 )
                    {
                     before(grammarAccess.getLeafNodeAccess().getTypeAssignment_1_0()); 
                    // InternalDataDsl.g:435:3: ( rule__LeafNode__TypeAssignment_1_0 )
                    // InternalDataDsl.g:435:4: rule__LeafNode__TypeAssignment_1_0
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
                    // InternalDataDsl.g:439:2: ( ( rule__LeafNode__TypeCallAssignment_1_1 ) )
                    {
                    // InternalDataDsl.g:439:2: ( ( rule__LeafNode__TypeCallAssignment_1_1 ) )
                    // InternalDataDsl.g:440:3: ( rule__LeafNode__TypeCallAssignment_1_1 )
                    {
                     before(grammarAccess.getLeafNodeAccess().getTypeCallAssignment_1_1()); 
                    // InternalDataDsl.g:441:3: ( rule__LeafNode__TypeCallAssignment_1_1 )
                    // InternalDataDsl.g:441:4: rule__LeafNode__TypeCallAssignment_1_1
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
    // InternalDataDsl.g:449:1: rule__Option__Alternatives : ( ( ( rule__Option__Group_0__0 ) ) | ( RULE_INT ) );
    public final void rule__Option__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:453:1: ( ( ( rule__Option__Group_0__0 ) ) | ( RULE_INT ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=26 && LA5_0<=38)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataDsl.g:454:2: ( ( rule__Option__Group_0__0 ) )
                    {
                    // InternalDataDsl.g:454:2: ( ( rule__Option__Group_0__0 ) )
                    // InternalDataDsl.g:455:3: ( rule__Option__Group_0__0 )
                    {
                     before(grammarAccess.getOptionAccess().getGroup_0()); 
                    // InternalDataDsl.g:456:3: ( rule__Option__Group_0__0 )
                    // InternalDataDsl.g:456:4: rule__Option__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Option__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOptionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:460:2: ( RULE_INT )
                    {
                    // InternalDataDsl.g:460:2: ( RULE_INT )
                    // InternalDataDsl.g:461:3: RULE_INT
                    {
                     before(grammarAccess.getOptionAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getOptionAccess().getINTTerminalRuleCall_1()); 

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


    // $ANTLR start "rule__BasicType__Alternatives"
    // InternalDataDsl.g:470:1: rule__BasicType__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'year' ) ) | ( ( 'month' ) ) | ( ( 'day' ) ) | ( ( 'boolean' ) ) | ( ( 'lat' ) ) | ( ( 'long' ) ) );
    public final void rule__BasicType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:474:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'real' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'year' ) ) | ( ( 'month' ) ) | ( ( 'day' ) ) | ( ( 'boolean' ) ) | ( ( 'lat' ) ) | ( ( 'long' ) ) )
            int alt6=11;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            case 21:
                {
                alt6=7;
                }
                break;
            case 22:
                {
                alt6=8;
                }
                break;
            case 23:
                {
                alt6=9;
                }
                break;
            case 24:
                {
                alt6=10;
                }
                break;
            case 25:
                {
                alt6=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDataDsl.g:475:2: ( ( 'string' ) )
                    {
                    // InternalDataDsl.g:475:2: ( ( 'string' ) )
                    // InternalDataDsl.g:476:3: ( 'string' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:477:3: ( 'string' )
                    // InternalDataDsl.g:477:4: 'string'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:481:2: ( ( 'int' ) )
                    {
                    // InternalDataDsl.g:481:2: ( ( 'int' ) )
                    // InternalDataDsl.g:482:3: ( 'int' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:483:3: ( 'int' )
                    // InternalDataDsl.g:483:4: 'int'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:487:2: ( ( 'real' ) )
                    {
                    // InternalDataDsl.g:487:2: ( ( 'real' ) )
                    // InternalDataDsl.g:488:3: ( 'real' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:489:3: ( 'real' )
                    // InternalDataDsl.g:489:4: 'real'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getRealEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:493:2: ( ( 'date' ) )
                    {
                    // InternalDataDsl.g:493:2: ( ( 'date' ) )
                    // InternalDataDsl.g:494:3: ( 'date' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:495:3: ( 'date' )
                    // InternalDataDsl.g:495:4: 'date'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:499:2: ( ( 'time' ) )
                    {
                    // InternalDataDsl.g:499:2: ( ( 'time' ) )
                    // InternalDataDsl.g:500:3: ( 'time' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:501:3: ( 'time' )
                    // InternalDataDsl.g:501:4: 'time'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getTimeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:505:2: ( ( 'year' ) )
                    {
                    // InternalDataDsl.g:505:2: ( ( 'year' ) )
                    // InternalDataDsl.g:506:3: ( 'year' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:507:3: ( 'year' )
                    // InternalDataDsl.g:507:4: 'year'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getYearEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:511:2: ( ( 'month' ) )
                    {
                    // InternalDataDsl.g:511:2: ( ( 'month' ) )
                    // InternalDataDsl.g:512:3: ( 'month' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:513:3: ( 'month' )
                    // InternalDataDsl.g:513:4: 'month'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getMonthEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:517:2: ( ( 'day' ) )
                    {
                    // InternalDataDsl.g:517:2: ( ( 'day' ) )
                    // InternalDataDsl.g:518:3: ( 'day' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:519:3: ( 'day' )
                    // InternalDataDsl.g:519:4: 'day'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getDayEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:523:2: ( ( 'boolean' ) )
                    {
                    // InternalDataDsl.g:523:2: ( ( 'boolean' ) )
                    // InternalDataDsl.g:524:3: ( 'boolean' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_8()); 
                    // InternalDataDsl.g:525:3: ( 'boolean' )
                    // InternalDataDsl.g:525:4: 'boolean'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getBooleanEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:529:2: ( ( 'lat' ) )
                    {
                    // InternalDataDsl.g:529:2: ( ( 'lat' ) )
                    // InternalDataDsl.g:530:3: ( 'lat' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_9()); 
                    // InternalDataDsl.g:531:3: ( 'lat' )
                    // InternalDataDsl.g:531:4: 'lat'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLatEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:535:2: ( ( 'long' ) )
                    {
                    // InternalDataDsl.g:535:2: ( ( 'long' ) )
                    // InternalDataDsl.g:536:3: ( 'long' )
                    {
                     before(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_10()); 
                    // InternalDataDsl.g:537:3: ( 'long' )
                    // InternalDataDsl.g:537:4: 'long'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBasicTypeAccess().getLongEnumLiteralDeclaration_10()); 

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


    // $ANTLR start "rule__OptionKey__Alternatives"
    // InternalDataDsl.g:545:1: rule__OptionKey__Alternatives : ( ( ( 'minLength' ) ) | ( ( 'maxLength' ) ) | ( ( 'casesensitive' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'null' ) ) | ( ( 'separator' ) ) | ( ( 'default' ) ) | ( ( 'regex' ) ) | ( ( 'flags' ) ) | ( ( 'decimalchar' ) ) | ( ( 'pattern' ) ) | ( ( 'format' ) ) );
    public final void rule__OptionKey__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:549:1: ( ( ( 'minLength' ) ) | ( ( 'maxLength' ) ) | ( ( 'casesensitive' ) ) | ( ( 'min' ) ) | ( ( 'max' ) ) | ( ( 'null' ) ) | ( ( 'separator' ) ) | ( ( 'default' ) ) | ( ( 'regex' ) ) | ( ( 'flags' ) ) | ( ( 'decimalchar' ) ) | ( ( 'pattern' ) ) | ( ( 'format' ) ) )
            int alt7=13;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt7=1;
                }
                break;
            case 27:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 29:
                {
                alt7=4;
                }
                break;
            case 30:
                {
                alt7=5;
                }
                break;
            case 31:
                {
                alt7=6;
                }
                break;
            case 32:
                {
                alt7=7;
                }
                break;
            case 33:
                {
                alt7=8;
                }
                break;
            case 34:
                {
                alt7=9;
                }
                break;
            case 35:
                {
                alt7=10;
                }
                break;
            case 36:
                {
                alt7=11;
                }
                break;
            case 37:
                {
                alt7=12;
                }
                break;
            case 38:
                {
                alt7=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDataDsl.g:550:2: ( ( 'minLength' ) )
                    {
                    // InternalDataDsl.g:550:2: ( ( 'minLength' ) )
                    // InternalDataDsl.g:551:3: ( 'minLength' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:552:3: ( 'minLength' )
                    // InternalDataDsl.g:552:4: 'minLength'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getMinLengthEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:556:2: ( ( 'maxLength' ) )
                    {
                    // InternalDataDsl.g:556:2: ( ( 'maxLength' ) )
                    // InternalDataDsl.g:557:3: ( 'maxLength' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:558:3: ( 'maxLength' )
                    // InternalDataDsl.g:558:4: 'maxLength'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getMaxLengthEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:562:2: ( ( 'casesensitive' ) )
                    {
                    // InternalDataDsl.g:562:2: ( ( 'casesensitive' ) )
                    // InternalDataDsl.g:563:3: ( 'casesensitive' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:564:3: ( 'casesensitive' )
                    // InternalDataDsl.g:564:4: 'casesensitive'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getCasesensitiveEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:568:2: ( ( 'min' ) )
                    {
                    // InternalDataDsl.g:568:2: ( ( 'min' ) )
                    // InternalDataDsl.g:569:3: ( 'min' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getMinEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:570:3: ( 'min' )
                    // InternalDataDsl.g:570:4: 'min'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getMinEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:574:2: ( ( 'max' ) )
                    {
                    // InternalDataDsl.g:574:2: ( ( 'max' ) )
                    // InternalDataDsl.g:575:3: ( 'max' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getMaxEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:576:3: ( 'max' )
                    // InternalDataDsl.g:576:4: 'max'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getMaxEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:580:2: ( ( 'null' ) )
                    {
                    // InternalDataDsl.g:580:2: ( ( 'null' ) )
                    // InternalDataDsl.g:581:3: ( 'null' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getNullEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:582:3: ( 'null' )
                    // InternalDataDsl.g:582:4: 'null'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getNullEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:586:2: ( ( 'separator' ) )
                    {
                    // InternalDataDsl.g:586:2: ( ( 'separator' ) )
                    // InternalDataDsl.g:587:3: ( 'separator' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getSeparatorEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:588:3: ( 'separator' )
                    // InternalDataDsl.g:588:4: 'separator'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getSeparatorEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:592:2: ( ( 'default' ) )
                    {
                    // InternalDataDsl.g:592:2: ( ( 'default' ) )
                    // InternalDataDsl.g:593:3: ( 'default' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getDefaultEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:594:3: ( 'default' )
                    // InternalDataDsl.g:594:4: 'default'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getDefaultEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:598:2: ( ( 'regex' ) )
                    {
                    // InternalDataDsl.g:598:2: ( ( 'regex' ) )
                    // InternalDataDsl.g:599:3: ( 'regex' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getRegexEnumLiteralDeclaration_8()); 
                    // InternalDataDsl.g:600:3: ( 'regex' )
                    // InternalDataDsl.g:600:4: 'regex'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getRegexEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:604:2: ( ( 'flags' ) )
                    {
                    // InternalDataDsl.g:604:2: ( ( 'flags' ) )
                    // InternalDataDsl.g:605:3: ( 'flags' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getFlagsEnumLiteralDeclaration_9()); 
                    // InternalDataDsl.g:606:3: ( 'flags' )
                    // InternalDataDsl.g:606:4: 'flags'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getFlagsEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:610:2: ( ( 'decimalchar' ) )
                    {
                    // InternalDataDsl.g:610:2: ( ( 'decimalchar' ) )
                    // InternalDataDsl.g:611:3: ( 'decimalchar' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_10()); 
                    // InternalDataDsl.g:612:3: ( 'decimalchar' )
                    // InternalDataDsl.g:612:4: 'decimalchar'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getDecimalcharEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDsl.g:616:2: ( ( 'pattern' ) )
                    {
                    // InternalDataDsl.g:616:2: ( ( 'pattern' ) )
                    // InternalDataDsl.g:617:3: ( 'pattern' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getPatternEnumLiteralDeclaration_11()); 
                    // InternalDataDsl.g:618:3: ( 'pattern' )
                    // InternalDataDsl.g:618:4: 'pattern'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getPatternEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDataDsl.g:622:2: ( ( 'format' ) )
                    {
                    // InternalDataDsl.g:622:2: ( ( 'format' ) )
                    // InternalDataDsl.g:623:3: ( 'format' )
                    {
                     before(grammarAccess.getOptionKeyAccess().getFormatEnumLiteralDeclaration_12()); 
                    // InternalDataDsl.g:624:3: ( 'format' )
                    // InternalDataDsl.g:624:4: 'format'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getOptionKeyAccess().getFormatEnumLiteralDeclaration_12()); 

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
    // $ANTLR end "rule__OptionKey__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // InternalDataDsl.g:632:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:636:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalDataDsl.g:637:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
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
    // InternalDataDsl.g:644:1: rule__DataModel__Group__0__Impl : ( ( rule__DataModel__DescriptionsAssignment_0 ) ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:648:1: ( ( ( rule__DataModel__DescriptionsAssignment_0 ) ) )
            // InternalDataDsl.g:649:1: ( ( rule__DataModel__DescriptionsAssignment_0 ) )
            {
            // InternalDataDsl.g:649:1: ( ( rule__DataModel__DescriptionsAssignment_0 ) )
            // InternalDataDsl.g:650:2: ( rule__DataModel__DescriptionsAssignment_0 )
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsAssignment_0()); 
            // InternalDataDsl.g:651:2: ( rule__DataModel__DescriptionsAssignment_0 )
            // InternalDataDsl.g:651:3: rule__DataModel__DescriptionsAssignment_0
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
    // InternalDataDsl.g:659:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:663:1: ( rule__DataModel__Group__1__Impl )
            // InternalDataDsl.g:664:2: rule__DataModel__Group__1__Impl
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
    // InternalDataDsl.g:670:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__Group_1__0 )* ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:674:1: ( ( ( rule__DataModel__Group_1__0 )* ) )
            // InternalDataDsl.g:675:1: ( ( rule__DataModel__Group_1__0 )* )
            {
            // InternalDataDsl.g:675:1: ( ( rule__DataModel__Group_1__0 )* )
            // InternalDataDsl.g:676:2: ( rule__DataModel__Group_1__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_1()); 
            // InternalDataDsl.g:677:2: ( rule__DataModel__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==39) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDataDsl.g:677:3: rule__DataModel__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataModel__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataModel__Group_1__0"
    // InternalDataDsl.g:686:1: rule__DataModel__Group_1__0 : rule__DataModel__Group_1__0__Impl rule__DataModel__Group_1__1 ;
    public final void rule__DataModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:690:1: ( rule__DataModel__Group_1__0__Impl rule__DataModel__Group_1__1 )
            // InternalDataDsl.g:691:2: rule__DataModel__Group_1__0__Impl rule__DataModel__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1__0"


    // $ANTLR start "rule__DataModel__Group_1__0__Impl"
    // InternalDataDsl.g:698:1: rule__DataModel__Group_1__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:702:1: ( ( ',' ) )
            // InternalDataDsl.g:703:1: ( ',' )
            {
            // InternalDataDsl.g:703:1: ( ',' )
            // InternalDataDsl.g:704:2: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1__0__Impl"


    // $ANTLR start "rule__DataModel__Group_1__1"
    // InternalDataDsl.g:713:1: rule__DataModel__Group_1__1 : rule__DataModel__Group_1__1__Impl ;
    public final void rule__DataModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:717:1: ( rule__DataModel__Group_1__1__Impl )
            // InternalDataDsl.g:718:2: rule__DataModel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1__1"


    // $ANTLR start "rule__DataModel__Group_1__1__Impl"
    // InternalDataDsl.g:724:1: rule__DataModel__Group_1__1__Impl : ( ( rule__DataModel__DescriptionsAssignment_1_1 ) ) ;
    public final void rule__DataModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:728:1: ( ( ( rule__DataModel__DescriptionsAssignment_1_1 ) ) )
            // InternalDataDsl.g:729:1: ( ( rule__DataModel__DescriptionsAssignment_1_1 ) )
            {
            // InternalDataDsl.g:729:1: ( ( rule__DataModel__DescriptionsAssignment_1_1 ) )
            // InternalDataDsl.g:730:2: ( rule__DataModel__DescriptionsAssignment_1_1 )
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsAssignment_1_1()); 
            // InternalDataDsl.g:731:2: ( rule__DataModel__DescriptionsAssignment_1_1 )
            // InternalDataDsl.g:731:3: rule__DataModel__DescriptionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__DescriptionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getDescriptionsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1__1__Impl"


    // $ANTLR start "rule__DataSource__Group__0"
    // InternalDataDsl.g:740:1: rule__DataSource__Group__0 : rule__DataSource__Group__0__Impl rule__DataSource__Group__1 ;
    public final void rule__DataSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:744:1: ( rule__DataSource__Group__0__Impl rule__DataSource__Group__1 )
            // InternalDataDsl.g:745:2: rule__DataSource__Group__0__Impl rule__DataSource__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__DataSource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__0"


    // $ANTLR start "rule__DataSource__Group__0__Impl"
    // InternalDataDsl.g:752:1: rule__DataSource__Group__0__Impl : ( 'description' ) ;
    public final void rule__DataSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:756:1: ( ( 'description' ) )
            // InternalDataDsl.g:757:1: ( 'description' )
            {
            // InternalDataDsl.g:757:1: ( 'description' )
            // InternalDataDsl.g:758:2: 'description'
            {
             before(grammarAccess.getDataSourceAccess().getDescriptionKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getDescriptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__0__Impl"


    // $ANTLR start "rule__DataSource__Group__1"
    // InternalDataDsl.g:767:1: rule__DataSource__Group__1 : rule__DataSource__Group__1__Impl rule__DataSource__Group__2 ;
    public final void rule__DataSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:771:1: ( rule__DataSource__Group__1__Impl rule__DataSource__Group__2 )
            // InternalDataDsl.g:772:2: rule__DataSource__Group__1__Impl rule__DataSource__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DataSource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__1"


    // $ANTLR start "rule__DataSource__Group__1__Impl"
    // InternalDataDsl.g:779:1: rule__DataSource__Group__1__Impl : ( ( rule__DataSource__FormatAssignment_1 ) ) ;
    public final void rule__DataSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:783:1: ( ( ( rule__DataSource__FormatAssignment_1 ) ) )
            // InternalDataDsl.g:784:1: ( ( rule__DataSource__FormatAssignment_1 ) )
            {
            // InternalDataDsl.g:784:1: ( ( rule__DataSource__FormatAssignment_1 ) )
            // InternalDataDsl.g:785:2: ( rule__DataSource__FormatAssignment_1 )
            {
             before(grammarAccess.getDataSourceAccess().getFormatAssignment_1()); 
            // InternalDataDsl.g:786:2: ( rule__DataSource__FormatAssignment_1 )
            // InternalDataDsl.g:786:3: rule__DataSource__FormatAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__FormatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getFormatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__1__Impl"


    // $ANTLR start "rule__DataSource__Group__2"
    // InternalDataDsl.g:794:1: rule__DataSource__Group__2 : rule__DataSource__Group__2__Impl rule__DataSource__Group__3 ;
    public final void rule__DataSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:798:1: ( rule__DataSource__Group__2__Impl rule__DataSource__Group__3 )
            // InternalDataDsl.g:799:2: rule__DataSource__Group__2__Impl rule__DataSource__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__DataSource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__2"


    // $ANTLR start "rule__DataSource__Group__2__Impl"
    // InternalDataDsl.g:806:1: rule__DataSource__Group__2__Impl : ( ( rule__DataSource__NameAssignment_2 ) ) ;
    public final void rule__DataSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:810:1: ( ( ( rule__DataSource__NameAssignment_2 ) ) )
            // InternalDataDsl.g:811:1: ( ( rule__DataSource__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:811:1: ( ( rule__DataSource__NameAssignment_2 ) )
            // InternalDataDsl.g:812:2: ( rule__DataSource__NameAssignment_2 )
            {
             before(grammarAccess.getDataSourceAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:813:2: ( rule__DataSource__NameAssignment_2 )
            // InternalDataDsl.g:813:3: rule__DataSource__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__2__Impl"


    // $ANTLR start "rule__DataSource__Group__3"
    // InternalDataDsl.g:821:1: rule__DataSource__Group__3 : rule__DataSource__Group__3__Impl rule__DataSource__Group__4 ;
    public final void rule__DataSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:825:1: ( rule__DataSource__Group__3__Impl rule__DataSource__Group__4 )
            // InternalDataDsl.g:826:2: rule__DataSource__Group__3__Impl rule__DataSource__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__DataSource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__3"


    // $ANTLR start "rule__DataSource__Group__3__Impl"
    // InternalDataDsl.g:833:1: rule__DataSource__Group__3__Impl : ( ( rule__DataSource__Group_3__0 )? ) ;
    public final void rule__DataSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:837:1: ( ( ( rule__DataSource__Group_3__0 )? ) )
            // InternalDataDsl.g:838:1: ( ( rule__DataSource__Group_3__0 )? )
            {
            // InternalDataDsl.g:838:1: ( ( rule__DataSource__Group_3__0 )? )
            // InternalDataDsl.g:839:2: ( rule__DataSource__Group_3__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_3()); 
            // InternalDataDsl.g:840:2: ( rule__DataSource__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataDsl.g:840:3: rule__DataSource__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__3__Impl"


    // $ANTLR start "rule__DataSource__Group__4"
    // InternalDataDsl.g:848:1: rule__DataSource__Group__4 : rule__DataSource__Group__4__Impl rule__DataSource__Group__5 ;
    public final void rule__DataSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:852:1: ( rule__DataSource__Group__4__Impl rule__DataSource__Group__5 )
            // InternalDataDsl.g:853:2: rule__DataSource__Group__4__Impl rule__DataSource__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__DataSource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__4"


    // $ANTLR start "rule__DataSource__Group__4__Impl"
    // InternalDataDsl.g:860:1: rule__DataSource__Group__4__Impl : ( '{' ) ;
    public final void rule__DataSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:864:1: ( ( '{' ) )
            // InternalDataDsl.g:865:1: ( '{' )
            {
            // InternalDataDsl.g:865:1: ( '{' )
            // InternalDataDsl.g:866:2: '{'
            {
             before(grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__4__Impl"


    // $ANTLR start "rule__DataSource__Group__5"
    // InternalDataDsl.g:875:1: rule__DataSource__Group__5 : rule__DataSource__Group__5__Impl rule__DataSource__Group__6 ;
    public final void rule__DataSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:879:1: ( rule__DataSource__Group__5__Impl rule__DataSource__Group__6 )
            // InternalDataDsl.g:880:2: rule__DataSource__Group__5__Impl rule__DataSource__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__DataSource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__5"


    // $ANTLR start "rule__DataSource__Group__5__Impl"
    // InternalDataDsl.g:887:1: rule__DataSource__Group__5__Impl : ( ( rule__DataSource__Group_5__0 )? ) ;
    public final void rule__DataSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:891:1: ( ( ( rule__DataSource__Group_5__0 )? ) )
            // InternalDataDsl.g:892:1: ( ( rule__DataSource__Group_5__0 )? )
            {
            // InternalDataDsl.g:892:1: ( ( rule__DataSource__Group_5__0 )? )
            // InternalDataDsl.g:893:2: ( rule__DataSource__Group_5__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_5()); 
            // InternalDataDsl.g:894:2: ( rule__DataSource__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID||LA10_0==RULE_UNIQUENESS||(LA10_0>=15 && LA10_0<=25)||LA10_0==48) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDataDsl.g:894:3: rule__DataSource__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__5__Impl"


    // $ANTLR start "rule__DataSource__Group__6"
    // InternalDataDsl.g:902:1: rule__DataSource__Group__6 : rule__DataSource__Group__6__Impl rule__DataSource__Group__7 ;
    public final void rule__DataSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:906:1: ( rule__DataSource__Group__6__Impl rule__DataSource__Group__7 )
            // InternalDataDsl.g:907:2: rule__DataSource__Group__6__Impl rule__DataSource__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__DataSource__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__6"


    // $ANTLR start "rule__DataSource__Group__6__Impl"
    // InternalDataDsl.g:914:1: rule__DataSource__Group__6__Impl : ( '}' ) ;
    public final void rule__DataSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:918:1: ( ( '}' ) )
            // InternalDataDsl.g:919:1: ( '}' )
            {
            // InternalDataDsl.g:919:1: ( '}' )
            // InternalDataDsl.g:920:2: '}'
            {
             before(grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__6__Impl"


    // $ANTLR start "rule__DataSource__Group__7"
    // InternalDataDsl.g:929:1: rule__DataSource__Group__7 : rule__DataSource__Group__7__Impl ;
    public final void rule__DataSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:933:1: ( rule__DataSource__Group__7__Impl )
            // InternalDataDsl.g:934:2: rule__DataSource__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__7"


    // $ANTLR start "rule__DataSource__Group__7__Impl"
    // InternalDataDsl.g:940:1: rule__DataSource__Group__7__Impl : ( ( rule__DataSource__Group_7__0 )? ) ;
    public final void rule__DataSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:944:1: ( ( ( rule__DataSource__Group_7__0 )? ) )
            // InternalDataDsl.g:945:1: ( ( rule__DataSource__Group_7__0 )? )
            {
            // InternalDataDsl.g:945:1: ( ( rule__DataSource__Group_7__0 )? )
            // InternalDataDsl.g:946:2: ( rule__DataSource__Group_7__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_7()); 
            // InternalDataDsl.g:947:2: ( rule__DataSource__Group_7__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==41) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataDsl.g:947:3: rule__DataSource__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__7__Impl"


    // $ANTLR start "rule__DataSource__Group_3__0"
    // InternalDataDsl.g:956:1: rule__DataSource__Group_3__0 : rule__DataSource__Group_3__0__Impl rule__DataSource__Group_3__1 ;
    public final void rule__DataSource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:960:1: ( rule__DataSource__Group_3__0__Impl rule__DataSource__Group_3__1 )
            // InternalDataDsl.g:961:2: rule__DataSource__Group_3__0__Impl rule__DataSource__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__DataSource__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3__0"


    // $ANTLR start "rule__DataSource__Group_3__0__Impl"
    // InternalDataDsl.g:968:1: rule__DataSource__Group_3__0__Impl : ( ':' ) ;
    public final void rule__DataSource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:972:1: ( ( ':' ) )
            // InternalDataDsl.g:973:1: ( ':' )
            {
            // InternalDataDsl.g:973:1: ( ':' )
            // InternalDataDsl.g:974:2: ':'
            {
             before(grammarAccess.getDataSourceAccess().getColonKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3__0__Impl"


    // $ANTLR start "rule__DataSource__Group_3__1"
    // InternalDataDsl.g:983:1: rule__DataSource__Group_3__1 : rule__DataSource__Group_3__1__Impl rule__DataSource__Group_3__2 ;
    public final void rule__DataSource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:987:1: ( rule__DataSource__Group_3__1__Impl rule__DataSource__Group_3__2 )
            // InternalDataDsl.g:988:2: rule__DataSource__Group_3__1__Impl rule__DataSource__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__DataSource__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3__1"


    // $ANTLR start "rule__DataSource__Group_3__1__Impl"
    // InternalDataDsl.g:995:1: rule__DataSource__Group_3__1__Impl : ( ( rule__DataSource__FragmentsAssignment_3_1 ) ) ;
    public final void rule__DataSource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:999:1: ( ( ( rule__DataSource__FragmentsAssignment_3_1 ) ) )
            // InternalDataDsl.g:1000:1: ( ( rule__DataSource__FragmentsAssignment_3_1 ) )
            {
            // InternalDataDsl.g:1000:1: ( ( rule__DataSource__FragmentsAssignment_3_1 ) )
            // InternalDataDsl.g:1001:2: ( rule__DataSource__FragmentsAssignment_3_1 )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsAssignment_3_1()); 
            // InternalDataDsl.g:1002:2: ( rule__DataSource__FragmentsAssignment_3_1 )
            // InternalDataDsl.g:1002:3: rule__DataSource__FragmentsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__FragmentsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getFragmentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3__1__Impl"


    // $ANTLR start "rule__DataSource__Group_3__2"
    // InternalDataDsl.g:1010:1: rule__DataSource__Group_3__2 : rule__DataSource__Group_3__2__Impl ;
    public final void rule__DataSource__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1014:1: ( rule__DataSource__Group_3__2__Impl )
            // InternalDataDsl.g:1015:2: rule__DataSource__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3__2"


    // $ANTLR start "rule__DataSource__Group_3__2__Impl"
    // InternalDataDsl.g:1021:1: rule__DataSource__Group_3__2__Impl : ( ( rule__DataSource__Group_3_2__0 )* ) ;
    public final void rule__DataSource__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1025:1: ( ( ( rule__DataSource__Group_3_2__0 )* ) )
            // InternalDataDsl.g:1026:1: ( ( rule__DataSource__Group_3_2__0 )* )
            {
            // InternalDataDsl.g:1026:1: ( ( rule__DataSource__Group_3_2__0 )* )
            // InternalDataDsl.g:1027:2: ( rule__DataSource__Group_3_2__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_3_2()); 
            // InternalDataDsl.g:1028:2: ( rule__DataSource__Group_3_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==39) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDataDsl.g:1028:3: rule__DataSource__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataSource__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getDataSourceAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3__2__Impl"


    // $ANTLR start "rule__DataSource__Group_3_2__0"
    // InternalDataDsl.g:1037:1: rule__DataSource__Group_3_2__0 : rule__DataSource__Group_3_2__0__Impl rule__DataSource__Group_3_2__1 ;
    public final void rule__DataSource__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1041:1: ( rule__DataSource__Group_3_2__0__Impl rule__DataSource__Group_3_2__1 )
            // InternalDataDsl.g:1042:2: rule__DataSource__Group_3_2__0__Impl rule__DataSource__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
            rule__DataSource__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3_2__0"


    // $ANTLR start "rule__DataSource__Group_3_2__0__Impl"
    // InternalDataDsl.g:1049:1: rule__DataSource__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1053:1: ( ( ',' ) )
            // InternalDataDsl.g:1054:1: ( ',' )
            {
            // InternalDataDsl.g:1054:1: ( ',' )
            // InternalDataDsl.g:1055:2: ','
            {
             before(grammarAccess.getDataSourceAccess().getCommaKeyword_3_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3_2__0__Impl"


    // $ANTLR start "rule__DataSource__Group_3_2__1"
    // InternalDataDsl.g:1064:1: rule__DataSource__Group_3_2__1 : rule__DataSource__Group_3_2__1__Impl ;
    public final void rule__DataSource__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1068:1: ( rule__DataSource__Group_3_2__1__Impl )
            // InternalDataDsl.g:1069:2: rule__DataSource__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3_2__1"


    // $ANTLR start "rule__DataSource__Group_3_2__1__Impl"
    // InternalDataDsl.g:1075:1: rule__DataSource__Group_3_2__1__Impl : ( ( rule__DataSource__FragmentsAssignment_3_2_1 ) ) ;
    public final void rule__DataSource__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1079:1: ( ( ( rule__DataSource__FragmentsAssignment_3_2_1 ) ) )
            // InternalDataDsl.g:1080:1: ( ( rule__DataSource__FragmentsAssignment_3_2_1 ) )
            {
            // InternalDataDsl.g:1080:1: ( ( rule__DataSource__FragmentsAssignment_3_2_1 ) )
            // InternalDataDsl.g:1081:2: ( rule__DataSource__FragmentsAssignment_3_2_1 )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsAssignment_3_2_1()); 
            // InternalDataDsl.g:1082:2: ( rule__DataSource__FragmentsAssignment_3_2_1 )
            // InternalDataDsl.g:1082:3: rule__DataSource__FragmentsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__FragmentsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getFragmentsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3_2__1__Impl"


    // $ANTLR start "rule__DataSource__Group_5__0"
    // InternalDataDsl.g:1091:1: rule__DataSource__Group_5__0 : rule__DataSource__Group_5__0__Impl rule__DataSource__Group_5__1 ;
    public final void rule__DataSource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1095:1: ( rule__DataSource__Group_5__0__Impl rule__DataSource__Group_5__1 )
            // InternalDataDsl.g:1096:2: rule__DataSource__Group_5__0__Impl rule__DataSource__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__DataSource__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_5__0"


    // $ANTLR start "rule__DataSource__Group_5__0__Impl"
    // InternalDataDsl.g:1103:1: rule__DataSource__Group_5__0__Impl : ( ( rule__DataSource__NodesAssignment_5_0 ) ) ;
    public final void rule__DataSource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1107:1: ( ( ( rule__DataSource__NodesAssignment_5_0 ) ) )
            // InternalDataDsl.g:1108:1: ( ( rule__DataSource__NodesAssignment_5_0 ) )
            {
            // InternalDataDsl.g:1108:1: ( ( rule__DataSource__NodesAssignment_5_0 ) )
            // InternalDataDsl.g:1109:2: ( rule__DataSource__NodesAssignment_5_0 )
            {
             before(grammarAccess.getDataSourceAccess().getNodesAssignment_5_0()); 
            // InternalDataDsl.g:1110:2: ( rule__DataSource__NodesAssignment_5_0 )
            // InternalDataDsl.g:1110:3: rule__DataSource__NodesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__NodesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getNodesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_5__0__Impl"


    // $ANTLR start "rule__DataSource__Group_5__1"
    // InternalDataDsl.g:1118:1: rule__DataSource__Group_5__1 : rule__DataSource__Group_5__1__Impl ;
    public final void rule__DataSource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1122:1: ( rule__DataSource__Group_5__1__Impl )
            // InternalDataDsl.g:1123:2: rule__DataSource__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_5__1"


    // $ANTLR start "rule__DataSource__Group_5__1__Impl"
    // InternalDataDsl.g:1129:1: rule__DataSource__Group_5__1__Impl : ( ( rule__DataSource__Group_5_1__0 )* ) ;
    public final void rule__DataSource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1133:1: ( ( ( rule__DataSource__Group_5_1__0 )* ) )
            // InternalDataDsl.g:1134:1: ( ( rule__DataSource__Group_5_1__0 )* )
            {
            // InternalDataDsl.g:1134:1: ( ( rule__DataSource__Group_5_1__0 )* )
            // InternalDataDsl.g:1135:2: ( rule__DataSource__Group_5_1__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_5_1()); 
            // InternalDataDsl.g:1136:2: ( rule__DataSource__Group_5_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDataDsl.g:1136:3: rule__DataSource__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataSource__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getDataSourceAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_5__1__Impl"


    // $ANTLR start "rule__DataSource__Group_5_1__0"
    // InternalDataDsl.g:1145:1: rule__DataSource__Group_5_1__0 : rule__DataSource__Group_5_1__0__Impl rule__DataSource__Group_5_1__1 ;
    public final void rule__DataSource__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1149:1: ( rule__DataSource__Group_5_1__0__Impl rule__DataSource__Group_5_1__1 )
            // InternalDataDsl.g:1150:2: rule__DataSource__Group_5_1__0__Impl rule__DataSource__Group_5_1__1
            {
            pushFollow(FOLLOW_11);
            rule__DataSource__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_5_1__0"


    // $ANTLR start "rule__DataSource__Group_5_1__0__Impl"
    // InternalDataDsl.g:1157:1: rule__DataSource__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1161:1: ( ( ',' ) )
            // InternalDataDsl.g:1162:1: ( ',' )
            {
            // InternalDataDsl.g:1162:1: ( ',' )
            // InternalDataDsl.g:1163:2: ','
            {
             before(grammarAccess.getDataSourceAccess().getCommaKeyword_5_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_5_1__0__Impl"


    // $ANTLR start "rule__DataSource__Group_5_1__1"
    // InternalDataDsl.g:1172:1: rule__DataSource__Group_5_1__1 : rule__DataSource__Group_5_1__1__Impl ;
    public final void rule__DataSource__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1176:1: ( rule__DataSource__Group_5_1__1__Impl )
            // InternalDataDsl.g:1177:2: rule__DataSource__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_5_1__1"


    // $ANTLR start "rule__DataSource__Group_5_1__1__Impl"
    // InternalDataDsl.g:1183:1: rule__DataSource__Group_5_1__1__Impl : ( ( rule__DataSource__NodesAssignment_5_1_1 ) ) ;
    public final void rule__DataSource__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1187:1: ( ( ( rule__DataSource__NodesAssignment_5_1_1 ) ) )
            // InternalDataDsl.g:1188:1: ( ( rule__DataSource__NodesAssignment_5_1_1 ) )
            {
            // InternalDataDsl.g:1188:1: ( ( rule__DataSource__NodesAssignment_5_1_1 ) )
            // InternalDataDsl.g:1189:2: ( rule__DataSource__NodesAssignment_5_1_1 )
            {
             before(grammarAccess.getDataSourceAccess().getNodesAssignment_5_1_1()); 
            // InternalDataDsl.g:1190:2: ( rule__DataSource__NodesAssignment_5_1_1 )
            // InternalDataDsl.g:1190:3: rule__DataSource__NodesAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__NodesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getNodesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_5_1__1__Impl"


    // $ANTLR start "rule__DataSource__Group_7__0"
    // InternalDataDsl.g:1199:1: rule__DataSource__Group_7__0 : rule__DataSource__Group_7__0__Impl rule__DataSource__Group_7__1 ;
    public final void rule__DataSource__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1203:1: ( rule__DataSource__Group_7__0__Impl rule__DataSource__Group_7__1 )
            // InternalDataDsl.g:1204:2: rule__DataSource__Group_7__0__Impl rule__DataSource__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__DataSource__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7__0"


    // $ANTLR start "rule__DataSource__Group_7__0__Impl"
    // InternalDataDsl.g:1211:1: rule__DataSource__Group_7__0__Impl : ( '{' ) ;
    public final void rule__DataSource__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1215:1: ( ( '{' ) )
            // InternalDataDsl.g:1216:1: ( '{' )
            {
            // InternalDataDsl.g:1216:1: ( '{' )
            // InternalDataDsl.g:1217:2: '{'
            {
             before(grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7__0__Impl"


    // $ANTLR start "rule__DataSource__Group_7__1"
    // InternalDataDsl.g:1226:1: rule__DataSource__Group_7__1 : rule__DataSource__Group_7__1__Impl rule__DataSource__Group_7__2 ;
    public final void rule__DataSource__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1230:1: ( rule__DataSource__Group_7__1__Impl rule__DataSource__Group_7__2 )
            // InternalDataDsl.g:1231:2: rule__DataSource__Group_7__1__Impl rule__DataSource__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__DataSource__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7__1"


    // $ANTLR start "rule__DataSource__Group_7__1__Impl"
    // InternalDataDsl.g:1238:1: rule__DataSource__Group_7__1__Impl : ( ( rule__DataSource__OptionsAssignment_7_1 ) ) ;
    public final void rule__DataSource__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1242:1: ( ( ( rule__DataSource__OptionsAssignment_7_1 ) ) )
            // InternalDataDsl.g:1243:1: ( ( rule__DataSource__OptionsAssignment_7_1 ) )
            {
            // InternalDataDsl.g:1243:1: ( ( rule__DataSource__OptionsAssignment_7_1 ) )
            // InternalDataDsl.g:1244:2: ( rule__DataSource__OptionsAssignment_7_1 )
            {
             before(grammarAccess.getDataSourceAccess().getOptionsAssignment_7_1()); 
            // InternalDataDsl.g:1245:2: ( rule__DataSource__OptionsAssignment_7_1 )
            // InternalDataDsl.g:1245:3: rule__DataSource__OptionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__OptionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getOptionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7__1__Impl"


    // $ANTLR start "rule__DataSource__Group_7__2"
    // InternalDataDsl.g:1253:1: rule__DataSource__Group_7__2 : rule__DataSource__Group_7__2__Impl rule__DataSource__Group_7__3 ;
    public final void rule__DataSource__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1257:1: ( rule__DataSource__Group_7__2__Impl rule__DataSource__Group_7__3 )
            // InternalDataDsl.g:1258:2: rule__DataSource__Group_7__2__Impl rule__DataSource__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__DataSource__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7__2"


    // $ANTLR start "rule__DataSource__Group_7__2__Impl"
    // InternalDataDsl.g:1265:1: rule__DataSource__Group_7__2__Impl : ( ( rule__DataSource__Group_7_2__0 )* ) ;
    public final void rule__DataSource__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1269:1: ( ( ( rule__DataSource__Group_7_2__0 )* ) )
            // InternalDataDsl.g:1270:1: ( ( rule__DataSource__Group_7_2__0 )* )
            {
            // InternalDataDsl.g:1270:1: ( ( rule__DataSource__Group_7_2__0 )* )
            // InternalDataDsl.g:1271:2: ( rule__DataSource__Group_7_2__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_7_2()); 
            // InternalDataDsl.g:1272:2: ( rule__DataSource__Group_7_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDataDsl.g:1272:3: rule__DataSource__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataSource__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDataSourceAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7__2__Impl"


    // $ANTLR start "rule__DataSource__Group_7__3"
    // InternalDataDsl.g:1280:1: rule__DataSource__Group_7__3 : rule__DataSource__Group_7__3__Impl ;
    public final void rule__DataSource__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1284:1: ( rule__DataSource__Group_7__3__Impl )
            // InternalDataDsl.g:1285:2: rule__DataSource__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7__3"


    // $ANTLR start "rule__DataSource__Group_7__3__Impl"
    // InternalDataDsl.g:1291:1: rule__DataSource__Group_7__3__Impl : ( '}' ) ;
    public final void rule__DataSource__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1295:1: ( ( '}' ) )
            // InternalDataDsl.g:1296:1: ( '}' )
            {
            // InternalDataDsl.g:1296:1: ( '}' )
            // InternalDataDsl.g:1297:2: '}'
            {
             before(grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7__3__Impl"


    // $ANTLR start "rule__DataSource__Group_7_2__0"
    // InternalDataDsl.g:1307:1: rule__DataSource__Group_7_2__0 : rule__DataSource__Group_7_2__0__Impl rule__DataSource__Group_7_2__1 ;
    public final void rule__DataSource__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1311:1: ( rule__DataSource__Group_7_2__0__Impl rule__DataSource__Group_7_2__1 )
            // InternalDataDsl.g:1312:2: rule__DataSource__Group_7_2__0__Impl rule__DataSource__Group_7_2__1
            {
            pushFollow(FOLLOW_12);
            rule__DataSource__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7_2__0"


    // $ANTLR start "rule__DataSource__Group_7_2__0__Impl"
    // InternalDataDsl.g:1319:1: rule__DataSource__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1323:1: ( ( ',' ) )
            // InternalDataDsl.g:1324:1: ( ',' )
            {
            // InternalDataDsl.g:1324:1: ( ',' )
            // InternalDataDsl.g:1325:2: ','
            {
             before(grammarAccess.getDataSourceAccess().getCommaKeyword_7_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7_2__0__Impl"


    // $ANTLR start "rule__DataSource__Group_7_2__1"
    // InternalDataDsl.g:1334:1: rule__DataSource__Group_7_2__1 : rule__DataSource__Group_7_2__1__Impl ;
    public final void rule__DataSource__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1338:1: ( rule__DataSource__Group_7_2__1__Impl )
            // InternalDataDsl.g:1339:2: rule__DataSource__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7_2__1"


    // $ANTLR start "rule__DataSource__Group_7_2__1__Impl"
    // InternalDataDsl.g:1345:1: rule__DataSource__Group_7_2__1__Impl : ( ( rule__DataSource__OptionsAssignment_7_2_1 ) ) ;
    public final void rule__DataSource__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1349:1: ( ( ( rule__DataSource__OptionsAssignment_7_2_1 ) ) )
            // InternalDataDsl.g:1350:1: ( ( rule__DataSource__OptionsAssignment_7_2_1 ) )
            {
            // InternalDataDsl.g:1350:1: ( ( rule__DataSource__OptionsAssignment_7_2_1 ) )
            // InternalDataDsl.g:1351:2: ( rule__DataSource__OptionsAssignment_7_2_1 )
            {
             before(grammarAccess.getDataSourceAccess().getOptionsAssignment_7_2_1()); 
            // InternalDataDsl.g:1352:2: ( rule__DataSource__OptionsAssignment_7_2_1 )
            // InternalDataDsl.g:1352:3: rule__DataSource__OptionsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__OptionsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getOptionsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7_2__1__Impl"


    // $ANTLR start "rule__DataFragment__Group__0"
    // InternalDataDsl.g:1361:1: rule__DataFragment__Group__0 : rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1 ;
    public final void rule__DataFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1365:1: ( rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1 )
            // InternalDataDsl.g:1366:2: rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDsl.g:1373:1: rule__DataFragment__Group__0__Impl : ( 'fragment' ) ;
    public final void rule__DataFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1377:1: ( ( 'fragment' ) )
            // InternalDataDsl.g:1378:1: ( 'fragment' )
            {
            // InternalDataDsl.g:1378:1: ( 'fragment' )
            // InternalDataDsl.g:1379:2: 'fragment'
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalDataDsl.g:1388:1: rule__DataFragment__Group__1 : rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2 ;
    public final void rule__DataFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1392:1: ( rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2 )
            // InternalDataDsl.g:1393:2: rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDataDsl.g:1400:1: rule__DataFragment__Group__1__Impl : ( ( rule__DataFragment__NameAssignment_1 ) ) ;
    public final void rule__DataFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1404:1: ( ( ( rule__DataFragment__NameAssignment_1 ) ) )
            // InternalDataDsl.g:1405:1: ( ( rule__DataFragment__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:1405:1: ( ( rule__DataFragment__NameAssignment_1 ) )
            // InternalDataDsl.g:1406:2: ( rule__DataFragment__NameAssignment_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:1407:2: ( rule__DataFragment__NameAssignment_1 )
            // InternalDataDsl.g:1407:3: rule__DataFragment__NameAssignment_1
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
    // InternalDataDsl.g:1415:1: rule__DataFragment__Group__2 : rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3 ;
    public final void rule__DataFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1419:1: ( rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3 )
            // InternalDataDsl.g:1420:2: rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalDataDsl.g:1427:1: rule__DataFragment__Group__2__Impl : ( ( rule__DataFragment__Group_2__0 )? ) ;
    public final void rule__DataFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1431:1: ( ( ( rule__DataFragment__Group_2__0 )? ) )
            // InternalDataDsl.g:1432:1: ( ( rule__DataFragment__Group_2__0 )? )
            {
            // InternalDataDsl.g:1432:1: ( ( rule__DataFragment__Group_2__0 )? )
            // InternalDataDsl.g:1433:2: ( rule__DataFragment__Group_2__0 )?
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_2()); 
            // InternalDataDsl.g:1434:2: ( rule__DataFragment__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==43) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataDsl.g:1434:3: rule__DataFragment__Group_2__0
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
    // InternalDataDsl.g:1442:1: rule__DataFragment__Group__3 : rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4 ;
    public final void rule__DataFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1446:1: ( rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4 )
            // InternalDataDsl.g:1447:2: rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalDataDsl.g:1454:1: rule__DataFragment__Group__3__Impl : ( '{' ) ;
    public final void rule__DataFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1458:1: ( ( '{' ) )
            // InternalDataDsl.g:1459:1: ( '{' )
            {
            // InternalDataDsl.g:1459:1: ( '{' )
            // InternalDataDsl.g:1460:2: '{'
            {
             before(grammarAccess.getDataFragmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDataDsl.g:1469:1: rule__DataFragment__Group__4 : rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5 ;
    public final void rule__DataFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1473:1: ( rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5 )
            // InternalDataDsl.g:1474:2: rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalDataDsl.g:1481:1: rule__DataFragment__Group__4__Impl : ( ( rule__DataFragment__Group_4__0 )? ) ;
    public final void rule__DataFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1485:1: ( ( ( rule__DataFragment__Group_4__0 )? ) )
            // InternalDataDsl.g:1486:1: ( ( rule__DataFragment__Group_4__0 )? )
            {
            // InternalDataDsl.g:1486:1: ( ( rule__DataFragment__Group_4__0 )? )
            // InternalDataDsl.g:1487:2: ( rule__DataFragment__Group_4__0 )?
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_4()); 
            // InternalDataDsl.g:1488:2: ( rule__DataFragment__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==RULE_UNIQUENESS||(LA16_0>=15 && LA16_0<=25)||LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDataDsl.g:1488:3: rule__DataFragment__Group_4__0
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
    // InternalDataDsl.g:1496:1: rule__DataFragment__Group__5 : rule__DataFragment__Group__5__Impl ;
    public final void rule__DataFragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1500:1: ( rule__DataFragment__Group__5__Impl )
            // InternalDataDsl.g:1501:2: rule__DataFragment__Group__5__Impl
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
    // InternalDataDsl.g:1507:1: rule__DataFragment__Group__5__Impl : ( '}' ) ;
    public final void rule__DataFragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1511:1: ( ( '}' ) )
            // InternalDataDsl.g:1512:1: ( '}' )
            {
            // InternalDataDsl.g:1512:1: ( '}' )
            // InternalDataDsl.g:1513:2: '}'
            {
             before(grammarAccess.getDataFragmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDataDsl.g:1523:1: rule__DataFragment__Group_2__0 : rule__DataFragment__Group_2__0__Impl rule__DataFragment__Group_2__1 ;
    public final void rule__DataFragment__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1527:1: ( rule__DataFragment__Group_2__0__Impl rule__DataFragment__Group_2__1 )
            // InternalDataDsl.g:1528:2: rule__DataFragment__Group_2__0__Impl rule__DataFragment__Group_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDsl.g:1535:1: rule__DataFragment__Group_2__0__Impl : ( ':' ) ;
    public final void rule__DataFragment__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1539:1: ( ( ':' ) )
            // InternalDataDsl.g:1540:1: ( ':' )
            {
            // InternalDataDsl.g:1540:1: ( ':' )
            // InternalDataDsl.g:1541:2: ':'
            {
             before(grammarAccess.getDataFragmentAccess().getColonKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDataDsl.g:1550:1: rule__DataFragment__Group_2__1 : rule__DataFragment__Group_2__1__Impl rule__DataFragment__Group_2__2 ;
    public final void rule__DataFragment__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1554:1: ( rule__DataFragment__Group_2__1__Impl rule__DataFragment__Group_2__2 )
            // InternalDataDsl.g:1555:2: rule__DataFragment__Group_2__1__Impl rule__DataFragment__Group_2__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalDataDsl.g:1562:1: rule__DataFragment__Group_2__1__Impl : ( ( rule__DataFragment__FragmentsAssignment_2_1 ) ) ;
    public final void rule__DataFragment__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1566:1: ( ( ( rule__DataFragment__FragmentsAssignment_2_1 ) ) )
            // InternalDataDsl.g:1567:1: ( ( rule__DataFragment__FragmentsAssignment_2_1 ) )
            {
            // InternalDataDsl.g:1567:1: ( ( rule__DataFragment__FragmentsAssignment_2_1 ) )
            // InternalDataDsl.g:1568:2: ( rule__DataFragment__FragmentsAssignment_2_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsAssignment_2_1()); 
            // InternalDataDsl.g:1569:2: ( rule__DataFragment__FragmentsAssignment_2_1 )
            // InternalDataDsl.g:1569:3: rule__DataFragment__FragmentsAssignment_2_1
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
    // InternalDataDsl.g:1577:1: rule__DataFragment__Group_2__2 : rule__DataFragment__Group_2__2__Impl ;
    public final void rule__DataFragment__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1581:1: ( rule__DataFragment__Group_2__2__Impl )
            // InternalDataDsl.g:1582:2: rule__DataFragment__Group_2__2__Impl
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
    // InternalDataDsl.g:1588:1: rule__DataFragment__Group_2__2__Impl : ( ( rule__DataFragment__Group_2_2__0 )* ) ;
    public final void rule__DataFragment__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1592:1: ( ( ( rule__DataFragment__Group_2_2__0 )* ) )
            // InternalDataDsl.g:1593:1: ( ( rule__DataFragment__Group_2_2__0 )* )
            {
            // InternalDataDsl.g:1593:1: ( ( rule__DataFragment__Group_2_2__0 )* )
            // InternalDataDsl.g:1594:2: ( rule__DataFragment__Group_2_2__0 )*
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_2_2()); 
            // InternalDataDsl.g:1595:2: ( rule__DataFragment__Group_2_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==39) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDataDsl.g:1595:3: rule__DataFragment__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataFragment__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDataDsl.g:1604:1: rule__DataFragment__Group_2_2__0 : rule__DataFragment__Group_2_2__0__Impl rule__DataFragment__Group_2_2__1 ;
    public final void rule__DataFragment__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1608:1: ( rule__DataFragment__Group_2_2__0__Impl rule__DataFragment__Group_2_2__1 )
            // InternalDataDsl.g:1609:2: rule__DataFragment__Group_2_2__0__Impl rule__DataFragment__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDsl.g:1616:1: rule__DataFragment__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__DataFragment__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1620:1: ( ( ',' ) )
            // InternalDataDsl.g:1621:1: ( ',' )
            {
            // InternalDataDsl.g:1621:1: ( ',' )
            // InternalDataDsl.g:1622:2: ','
            {
             before(grammarAccess.getDataFragmentAccess().getCommaKeyword_2_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDataDsl.g:1631:1: rule__DataFragment__Group_2_2__1 : rule__DataFragment__Group_2_2__1__Impl ;
    public final void rule__DataFragment__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1635:1: ( rule__DataFragment__Group_2_2__1__Impl )
            // InternalDataDsl.g:1636:2: rule__DataFragment__Group_2_2__1__Impl
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
    // InternalDataDsl.g:1642:1: rule__DataFragment__Group_2_2__1__Impl : ( ( rule__DataFragment__FragmentsAssignment_2_2_1 ) ) ;
    public final void rule__DataFragment__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1646:1: ( ( ( rule__DataFragment__FragmentsAssignment_2_2_1 ) ) )
            // InternalDataDsl.g:1647:1: ( ( rule__DataFragment__FragmentsAssignment_2_2_1 ) )
            {
            // InternalDataDsl.g:1647:1: ( ( rule__DataFragment__FragmentsAssignment_2_2_1 ) )
            // InternalDataDsl.g:1648:2: ( rule__DataFragment__FragmentsAssignment_2_2_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsAssignment_2_2_1()); 
            // InternalDataDsl.g:1649:2: ( rule__DataFragment__FragmentsAssignment_2_2_1 )
            // InternalDataDsl.g:1649:3: rule__DataFragment__FragmentsAssignment_2_2_1
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
    // InternalDataDsl.g:1658:1: rule__DataFragment__Group_4__0 : rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1 ;
    public final void rule__DataFragment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1662:1: ( rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1 )
            // InternalDataDsl.g:1663:2: rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalDataDsl.g:1670:1: rule__DataFragment__Group_4__0__Impl : ( ( rule__DataFragment__NodesAssignment_4_0 ) ) ;
    public final void rule__DataFragment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1674:1: ( ( ( rule__DataFragment__NodesAssignment_4_0 ) ) )
            // InternalDataDsl.g:1675:1: ( ( rule__DataFragment__NodesAssignment_4_0 ) )
            {
            // InternalDataDsl.g:1675:1: ( ( rule__DataFragment__NodesAssignment_4_0 ) )
            // InternalDataDsl.g:1676:2: ( rule__DataFragment__NodesAssignment_4_0 )
            {
             before(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_0()); 
            // InternalDataDsl.g:1677:2: ( rule__DataFragment__NodesAssignment_4_0 )
            // InternalDataDsl.g:1677:3: rule__DataFragment__NodesAssignment_4_0
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
    // InternalDataDsl.g:1685:1: rule__DataFragment__Group_4__1 : rule__DataFragment__Group_4__1__Impl ;
    public final void rule__DataFragment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1689:1: ( rule__DataFragment__Group_4__1__Impl )
            // InternalDataDsl.g:1690:2: rule__DataFragment__Group_4__1__Impl
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
    // InternalDataDsl.g:1696:1: rule__DataFragment__Group_4__1__Impl : ( ( rule__DataFragment__Group_4_1__0 )* ) ;
    public final void rule__DataFragment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1700:1: ( ( ( rule__DataFragment__Group_4_1__0 )* ) )
            // InternalDataDsl.g:1701:1: ( ( rule__DataFragment__Group_4_1__0 )* )
            {
            // InternalDataDsl.g:1701:1: ( ( rule__DataFragment__Group_4_1__0 )* )
            // InternalDataDsl.g:1702:2: ( rule__DataFragment__Group_4_1__0 )*
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_4_1()); 
            // InternalDataDsl.g:1703:2: ( rule__DataFragment__Group_4_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDataDsl.g:1703:3: rule__DataFragment__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataFragment__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDataDsl.g:1712:1: rule__DataFragment__Group_4_1__0 : rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1 ;
    public final void rule__DataFragment__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1716:1: ( rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1 )
            // InternalDataDsl.g:1717:2: rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataDsl.g:1724:1: rule__DataFragment__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__DataFragment__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1728:1: ( ( ',' ) )
            // InternalDataDsl.g:1729:1: ( ',' )
            {
            // InternalDataDsl.g:1729:1: ( ',' )
            // InternalDataDsl.g:1730:2: ','
            {
             before(grammarAccess.getDataFragmentAccess().getCommaKeyword_4_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDataDsl.g:1739:1: rule__DataFragment__Group_4_1__1 : rule__DataFragment__Group_4_1__1__Impl ;
    public final void rule__DataFragment__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1743:1: ( rule__DataFragment__Group_4_1__1__Impl )
            // InternalDataDsl.g:1744:2: rule__DataFragment__Group_4_1__1__Impl
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
    // InternalDataDsl.g:1750:1: rule__DataFragment__Group_4_1__1__Impl : ( ( rule__DataFragment__NodesAssignment_4_1_1 ) ) ;
    public final void rule__DataFragment__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1754:1: ( ( ( rule__DataFragment__NodesAssignment_4_1_1 ) ) )
            // InternalDataDsl.g:1755:1: ( ( rule__DataFragment__NodesAssignment_4_1_1 ) )
            {
            // InternalDataDsl.g:1755:1: ( ( rule__DataFragment__NodesAssignment_4_1_1 ) )
            // InternalDataDsl.g:1756:2: ( rule__DataFragment__NodesAssignment_4_1_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_1_1()); 
            // InternalDataDsl.g:1757:2: ( rule__DataFragment__NodesAssignment_4_1_1 )
            // InternalDataDsl.g:1757:3: rule__DataFragment__NodesAssignment_4_1_1
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
    // InternalDataDsl.g:1766:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1770:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDataDsl.g:1771:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDsl.g:1778:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1782:1: ( ( 'datatype' ) )
            // InternalDataDsl.g:1783:1: ( 'datatype' )
            {
            // InternalDataDsl.g:1783:1: ( 'datatype' )
            // InternalDataDsl.g:1784:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalDataDsl.g:1793:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1797:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalDataDsl.g:1798:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:1805:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1809:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalDataDsl.g:1810:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:1810:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalDataDsl.g:1811:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:1812:2: ( rule__DataType__NameAssignment_1 )
            // InternalDataDsl.g:1812:3: rule__DataType__NameAssignment_1
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
    // InternalDataDsl.g:1820:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl rule__DataType__Group__3 ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1824:1: ( rule__DataType__Group__2__Impl rule__DataType__Group__3 )
            // InternalDataDsl.g:1825:2: rule__DataType__Group__2__Impl rule__DataType__Group__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalDataDsl.g:1832:1: rule__DataType__Group__2__Impl : ( ':' ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1836:1: ( ( ':' ) )
            // InternalDataDsl.g:1837:1: ( ':' )
            {
            // InternalDataDsl.g:1837:1: ( ':' )
            // InternalDataDsl.g:1838:2: ':'
            {
             before(grammarAccess.getDataTypeAccess().getColonKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalDataDsl.g:1847:1: rule__DataType__Group__3 : rule__DataType__Group__3__Impl rule__DataType__Group__4 ;
    public final void rule__DataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1851:1: ( rule__DataType__Group__3__Impl rule__DataType__Group__4 )
            // InternalDataDsl.g:1852:2: rule__DataType__Group__3__Impl rule__DataType__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDsl.g:1859:1: rule__DataType__Group__3__Impl : ( ( rule__DataType__RefineAssignment_3 ) ) ;
    public final void rule__DataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1863:1: ( ( ( rule__DataType__RefineAssignment_3 ) ) )
            // InternalDataDsl.g:1864:1: ( ( rule__DataType__RefineAssignment_3 ) )
            {
            // InternalDataDsl.g:1864:1: ( ( rule__DataType__RefineAssignment_3 ) )
            // InternalDataDsl.g:1865:2: ( rule__DataType__RefineAssignment_3 )
            {
             before(grammarAccess.getDataTypeAccess().getRefineAssignment_3()); 
            // InternalDataDsl.g:1866:2: ( rule__DataType__RefineAssignment_3 )
            // InternalDataDsl.g:1866:3: rule__DataType__RefineAssignment_3
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
    // InternalDataDsl.g:1874:1: rule__DataType__Group__4 : rule__DataType__Group__4__Impl ;
    public final void rule__DataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1878:1: ( rule__DataType__Group__4__Impl )
            // InternalDataDsl.g:1879:2: rule__DataType__Group__4__Impl
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
    // InternalDataDsl.g:1885:1: rule__DataType__Group__4__Impl : ( ( rule__DataType__Group_4__0 )? ) ;
    public final void rule__DataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1889:1: ( ( ( rule__DataType__Group_4__0 )? ) )
            // InternalDataDsl.g:1890:1: ( ( rule__DataType__Group_4__0 )? )
            {
            // InternalDataDsl.g:1890:1: ( ( rule__DataType__Group_4__0 )? )
            // InternalDataDsl.g:1891:2: ( rule__DataType__Group_4__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_4()); 
            // InternalDataDsl.g:1892:2: ( rule__DataType__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataDsl.g:1892:3: rule__DataType__Group_4__0
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
    // InternalDataDsl.g:1901:1: rule__DataType__Group_4__0 : rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 ;
    public final void rule__DataType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1905:1: ( rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1 )
            // InternalDataDsl.g:1906:2: rule__DataType__Group_4__0__Impl rule__DataType__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataDsl.g:1913:1: rule__DataType__Group_4__0__Impl : ( '{' ) ;
    public final void rule__DataType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1917:1: ( ( '{' ) )
            // InternalDataDsl.g:1918:1: ( '{' )
            {
            // InternalDataDsl.g:1918:1: ( '{' )
            // InternalDataDsl.g:1919:2: '{'
            {
             before(grammarAccess.getDataTypeAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDataDsl.g:1928:1: rule__DataType__Group_4__1 : rule__DataType__Group_4__1__Impl rule__DataType__Group_4__2 ;
    public final void rule__DataType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1932:1: ( rule__DataType__Group_4__1__Impl rule__DataType__Group_4__2 )
            // InternalDataDsl.g:1933:2: rule__DataType__Group_4__1__Impl rule__DataType__Group_4__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataDsl.g:1940:1: rule__DataType__Group_4__1__Impl : ( ( rule__DataType__OptionsAssignment_4_1 ) ) ;
    public final void rule__DataType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1944:1: ( ( ( rule__DataType__OptionsAssignment_4_1 ) ) )
            // InternalDataDsl.g:1945:1: ( ( rule__DataType__OptionsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:1945:1: ( ( rule__DataType__OptionsAssignment_4_1 ) )
            // InternalDataDsl.g:1946:2: ( rule__DataType__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getDataTypeAccess().getOptionsAssignment_4_1()); 
            // InternalDataDsl.g:1947:2: ( rule__DataType__OptionsAssignment_4_1 )
            // InternalDataDsl.g:1947:3: rule__DataType__OptionsAssignment_4_1
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
    // InternalDataDsl.g:1955:1: rule__DataType__Group_4__2 : rule__DataType__Group_4__2__Impl rule__DataType__Group_4__3 ;
    public final void rule__DataType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1959:1: ( rule__DataType__Group_4__2__Impl rule__DataType__Group_4__3 )
            // InternalDataDsl.g:1960:2: rule__DataType__Group_4__2__Impl rule__DataType__Group_4__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataDsl.g:1967:1: rule__DataType__Group_4__2__Impl : ( ( rule__DataType__Group_4_2__0 )* ) ;
    public final void rule__DataType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1971:1: ( ( ( rule__DataType__Group_4_2__0 )* ) )
            // InternalDataDsl.g:1972:1: ( ( rule__DataType__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:1972:1: ( ( rule__DataType__Group_4_2__0 )* )
            // InternalDataDsl.g:1973:2: ( rule__DataType__Group_4_2__0 )*
            {
             before(grammarAccess.getDataTypeAccess().getGroup_4_2()); 
            // InternalDataDsl.g:1974:2: ( rule__DataType__Group_4_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==39) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDataDsl.g:1974:3: rule__DataType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__DataType__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalDataDsl.g:1982:1: rule__DataType__Group_4__3 : rule__DataType__Group_4__3__Impl ;
    public final void rule__DataType__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1986:1: ( rule__DataType__Group_4__3__Impl )
            // InternalDataDsl.g:1987:2: rule__DataType__Group_4__3__Impl
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
    // InternalDataDsl.g:1993:1: rule__DataType__Group_4__3__Impl : ( '}' ) ;
    public final void rule__DataType__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1997:1: ( ( '}' ) )
            // InternalDataDsl.g:1998:1: ( '}' )
            {
            // InternalDataDsl.g:1998:1: ( '}' )
            // InternalDataDsl.g:1999:2: '}'
            {
             before(grammarAccess.getDataTypeAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDataDsl.g:2009:1: rule__DataType__Group_4_2__0 : rule__DataType__Group_4_2__0__Impl rule__DataType__Group_4_2__1 ;
    public final void rule__DataType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2013:1: ( rule__DataType__Group_4_2__0__Impl rule__DataType__Group_4_2__1 )
            // InternalDataDsl.g:2014:2: rule__DataType__Group_4_2__0__Impl rule__DataType__Group_4_2__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataDsl.g:2021:1: rule__DataType__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__DataType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2025:1: ( ( ',' ) )
            // InternalDataDsl.g:2026:1: ( ',' )
            {
            // InternalDataDsl.g:2026:1: ( ',' )
            // InternalDataDsl.g:2027:2: ','
            {
             before(grammarAccess.getDataTypeAccess().getCommaKeyword_4_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDataDsl.g:2036:1: rule__DataType__Group_4_2__1 : rule__DataType__Group_4_2__1__Impl ;
    public final void rule__DataType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2040:1: ( rule__DataType__Group_4_2__1__Impl )
            // InternalDataDsl.g:2041:2: rule__DataType__Group_4_2__1__Impl
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
    // InternalDataDsl.g:2047:1: rule__DataType__Group_4_2__1__Impl : ( ( rule__DataType__OptionsAssignment_4_2_1 ) ) ;
    public final void rule__DataType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2051:1: ( ( ( rule__DataType__OptionsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:2052:1: ( ( rule__DataType__OptionsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:2052:1: ( ( rule__DataType__OptionsAssignment_4_2_1 ) )
            // InternalDataDsl.g:2053:2: ( rule__DataType__OptionsAssignment_4_2_1 )
            {
             before(grammarAccess.getDataTypeAccess().getOptionsAssignment_4_2_1()); 
            // InternalDataDsl.g:2054:2: ( rule__DataType__OptionsAssignment_4_2_1 )
            // InternalDataDsl.g:2054:3: rule__DataType__OptionsAssignment_4_2_1
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
    // InternalDataDsl.g:2063:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2067:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalDataDsl.g:2068:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDsl.g:2075:1: rule__Enumeration__Group__0__Impl : ( 'enumeration' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2079:1: ( ( 'enumeration' ) )
            // InternalDataDsl.g:2080:1: ( 'enumeration' )
            {
            // InternalDataDsl.g:2080:1: ( 'enumeration' )
            // InternalDataDsl.g:2081:2: 'enumeration'
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalDataDsl.g:2090:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2094:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalDataDsl.g:2095:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
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
    // InternalDataDsl.g:2102:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2106:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2107:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2107:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // InternalDataDsl.g:2108:2: ( rule__Enumeration__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2109:2: ( rule__Enumeration__NameAssignment_1 )
            // InternalDataDsl.g:2109:3: rule__Enumeration__NameAssignment_1
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
    // InternalDataDsl.g:2117:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2121:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalDataDsl.g:2122:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataDsl.g:2129:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2133:1: ( ( '{' ) )
            // InternalDataDsl.g:2134:1: ( '{' )
            {
            // InternalDataDsl.g:2134:1: ( '{' )
            // InternalDataDsl.g:2135:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDataDsl.g:2144:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2148:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalDataDsl.g:2149:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataDsl.g:2156:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__ValuesAssignment_3 ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2160:1: ( ( ( rule__Enumeration__ValuesAssignment_3 ) ) )
            // InternalDataDsl.g:2161:1: ( ( rule__Enumeration__ValuesAssignment_3 ) )
            {
            // InternalDataDsl.g:2161:1: ( ( rule__Enumeration__ValuesAssignment_3 ) )
            // InternalDataDsl.g:2162:2: ( rule__Enumeration__ValuesAssignment_3 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_3()); 
            // InternalDataDsl.g:2163:2: ( rule__Enumeration__ValuesAssignment_3 )
            // InternalDataDsl.g:2163:3: rule__Enumeration__ValuesAssignment_3
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
    // InternalDataDsl.g:2171:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2175:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalDataDsl.g:2176:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataDsl.g:2183:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )* ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2187:1: ( ( ( rule__Enumeration__Group_4__0 )* ) )
            // InternalDataDsl.g:2188:1: ( ( rule__Enumeration__Group_4__0 )* )
            {
            // InternalDataDsl.g:2188:1: ( ( rule__Enumeration__Group_4__0 )* )
            // InternalDataDsl.g:2189:2: ( rule__Enumeration__Group_4__0 )*
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // InternalDataDsl.g:2190:2: ( rule__Enumeration__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==39) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDataDsl.g:2190:3: rule__Enumeration__Group_4__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Enumeration__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDataDsl.g:2198:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2202:1: ( rule__Enumeration__Group__5__Impl )
            // InternalDataDsl.g:2203:2: rule__Enumeration__Group__5__Impl
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
    // InternalDataDsl.g:2209:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2213:1: ( ( '}' ) )
            // InternalDataDsl.g:2214:1: ( '}' )
            {
            // InternalDataDsl.g:2214:1: ( '}' )
            // InternalDataDsl.g:2215:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,42,FOLLOW_2); 
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
    // InternalDataDsl.g:2225:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2229:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // InternalDataDsl.g:2230:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataDsl.g:2237:1: rule__Enumeration__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2241:1: ( ( ',' ) )
            // InternalDataDsl.g:2242:1: ( ',' )
            {
            // InternalDataDsl.g:2242:1: ( ',' )
            // InternalDataDsl.g:2243:2: ','
            {
             before(grammarAccess.getEnumerationAccess().getCommaKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalDataDsl.g:2252:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2256:1: ( rule__Enumeration__Group_4__1__Impl )
            // InternalDataDsl.g:2257:2: rule__Enumeration__Group_4__1__Impl
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
    // InternalDataDsl.g:2263:1: rule__Enumeration__Group_4__1__Impl : ( ( rule__Enumeration__ValuesAssignment_4_1 ) ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2267:1: ( ( ( rule__Enumeration__ValuesAssignment_4_1 ) ) )
            // InternalDataDsl.g:2268:1: ( ( rule__Enumeration__ValuesAssignment_4_1 ) )
            {
            // InternalDataDsl.g:2268:1: ( ( rule__Enumeration__ValuesAssignment_4_1 ) )
            // InternalDataDsl.g:2269:2: ( rule__Enumeration__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getEnumerationAccess().getValuesAssignment_4_1()); 
            // InternalDataDsl.g:2270:2: ( rule__Enumeration__ValuesAssignment_4_1 )
            // InternalDataDsl.g:2270:3: rule__Enumeration__ValuesAssignment_4_1
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


    // $ANTLR start "rule__CompositeNode__Group__0"
    // InternalDataDsl.g:2279:1: rule__CompositeNode__Group__0 : rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 ;
    public final void rule__CompositeNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2283:1: ( rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 )
            // InternalDataDsl.g:2284:2: rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataDsl.g:2291:1: rule__CompositeNode__Group__0__Impl : ( ( rule__CompositeNode__EnvironmentAssignment_0 )? ) ;
    public final void rule__CompositeNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2295:1: ( ( ( rule__CompositeNode__EnvironmentAssignment_0 )? ) )
            // InternalDataDsl.g:2296:1: ( ( rule__CompositeNode__EnvironmentAssignment_0 )? )
            {
            // InternalDataDsl.g:2296:1: ( ( rule__CompositeNode__EnvironmentAssignment_0 )? )
            // InternalDataDsl.g:2297:2: ( rule__CompositeNode__EnvironmentAssignment_0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getEnvironmentAssignment_0()); 
            // InternalDataDsl.g:2298:2: ( rule__CompositeNode__EnvironmentAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==48) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDataDsl.g:2298:3: rule__CompositeNode__EnvironmentAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__EnvironmentAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getEnvironmentAssignment_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:2306:1: rule__CompositeNode__Group__1 : rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 ;
    public final void rule__CompositeNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2310:1: ( rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 )
            // InternalDataDsl.g:2311:2: rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataDsl.g:2318:1: rule__CompositeNode__Group__1__Impl : ( ( rule__CompositeNode__NameAssignment_1 ) ) ;
    public final void rule__CompositeNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2322:1: ( ( ( rule__CompositeNode__NameAssignment_1 ) ) )
            // InternalDataDsl.g:2323:1: ( ( rule__CompositeNode__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:2323:1: ( ( rule__CompositeNode__NameAssignment_1 ) )
            // InternalDataDsl.g:2324:2: ( rule__CompositeNode__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:2325:2: ( rule__CompositeNode__NameAssignment_1 )
            // InternalDataDsl.g:2325:3: rule__CompositeNode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalDataDsl.g:2333:1: rule__CompositeNode__Group__2 : rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 ;
    public final void rule__CompositeNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2337:1: ( rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 )
            // InternalDataDsl.g:2338:2: rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataDsl.g:2345:1: rule__CompositeNode__Group__2__Impl : ( ( rule__CompositeNode__RepresentedAsAssignment_2 )? ) ;
    public final void rule__CompositeNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2349:1: ( ( ( rule__CompositeNode__RepresentedAsAssignment_2 )? ) )
            // InternalDataDsl.g:2350:1: ( ( rule__CompositeNode__RepresentedAsAssignment_2 )? )
            {
            // InternalDataDsl.g:2350:1: ( ( rule__CompositeNode__RepresentedAsAssignment_2 )? )
            // InternalDataDsl.g:2351:2: ( rule__CompositeNode__RepresentedAsAssignment_2 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getRepresentedAsAssignment_2()); 
            // InternalDataDsl.g:2352:2: ( rule__CompositeNode__RepresentedAsAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataDsl.g:2352:3: rule__CompositeNode__RepresentedAsAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__RepresentedAsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getRepresentedAsAssignment_2()); 

            }


            }

        }
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
    // InternalDataDsl.g:2360:1: rule__CompositeNode__Group__3 : rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 ;
    public final void rule__CompositeNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2364:1: ( rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 )
            // InternalDataDsl.g:2365:2: rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataDsl.g:2372:1: rule__CompositeNode__Group__3__Impl : ( ( rule__CompositeNode__Group_3__0 )? ) ;
    public final void rule__CompositeNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2376:1: ( ( ( rule__CompositeNode__Group_3__0 )? ) )
            // InternalDataDsl.g:2377:1: ( ( rule__CompositeNode__Group_3__0 )? )
            {
            // InternalDataDsl.g:2377:1: ( ( rule__CompositeNode__Group_3__0 )? )
            // InternalDataDsl.g:2378:2: ( rule__CompositeNode__Group_3__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_3()); 
            // InternalDataDsl.g:2379:2: ( rule__CompositeNode__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDsl.g:2379:3: rule__CompositeNode__Group_3__0
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
    // InternalDataDsl.g:2387:1: rule__CompositeNode__Group__4 : rule__CompositeNode__Group__4__Impl rule__CompositeNode__Group__5 ;
    public final void rule__CompositeNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2391:1: ( rule__CompositeNode__Group__4__Impl rule__CompositeNode__Group__5 )
            // InternalDataDsl.g:2392:2: rule__CompositeNode__Group__4__Impl rule__CompositeNode__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__CompositeNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__5();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:2399:1: rule__CompositeNode__Group__4__Impl : ( '{' ) ;
    public final void rule__CompositeNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2403:1: ( ( '{' ) )
            // InternalDataDsl.g:2404:1: ( '{' )
            {
            // InternalDataDsl.g:2404:1: ( '{' )
            // InternalDataDsl.g:2405:2: '{'
            {
             before(grammarAccess.getCompositeNodeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeNode__Group__5"
    // InternalDataDsl.g:2414:1: rule__CompositeNode__Group__5 : rule__CompositeNode__Group__5__Impl rule__CompositeNode__Group__6 ;
    public final void rule__CompositeNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2418:1: ( rule__CompositeNode__Group__5__Impl rule__CompositeNode__Group__6 )
            // InternalDataDsl.g:2419:2: rule__CompositeNode__Group__5__Impl rule__CompositeNode__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__CompositeNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group__5"


    // $ANTLR start "rule__CompositeNode__Group__5__Impl"
    // InternalDataDsl.g:2426:1: rule__CompositeNode__Group__5__Impl : ( ( rule__CompositeNode__Group_5__0 ) ) ;
    public final void rule__CompositeNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2430:1: ( ( ( rule__CompositeNode__Group_5__0 ) ) )
            // InternalDataDsl.g:2431:1: ( ( rule__CompositeNode__Group_5__0 ) )
            {
            // InternalDataDsl.g:2431:1: ( ( rule__CompositeNode__Group_5__0 ) )
            // InternalDataDsl.g:2432:2: ( rule__CompositeNode__Group_5__0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_5()); 
            // InternalDataDsl.g:2433:2: ( rule__CompositeNode__Group_5__0 )
            // InternalDataDsl.g:2433:3: rule__CompositeNode__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group__5__Impl"


    // $ANTLR start "rule__CompositeNode__Group__6"
    // InternalDataDsl.g:2441:1: rule__CompositeNode__Group__6 : rule__CompositeNode__Group__6__Impl rule__CompositeNode__Group__7 ;
    public final void rule__CompositeNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2445:1: ( rule__CompositeNode__Group__6__Impl rule__CompositeNode__Group__7 )
            // InternalDataDsl.g:2446:2: rule__CompositeNode__Group__6__Impl rule__CompositeNode__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__CompositeNode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group__6"


    // $ANTLR start "rule__CompositeNode__Group__6__Impl"
    // InternalDataDsl.g:2453:1: rule__CompositeNode__Group__6__Impl : ( '}' ) ;
    public final void rule__CompositeNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2457:1: ( ( '}' ) )
            // InternalDataDsl.g:2458:1: ( '}' )
            {
            // InternalDataDsl.g:2458:1: ( '}' )
            // InternalDataDsl.g:2459:2: '}'
            {
             before(grammarAccess.getCompositeNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group__6__Impl"


    // $ANTLR start "rule__CompositeNode__Group__7"
    // InternalDataDsl.g:2468:1: rule__CompositeNode__Group__7 : rule__CompositeNode__Group__7__Impl ;
    public final void rule__CompositeNode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2472:1: ( rule__CompositeNode__Group__7__Impl )
            // InternalDataDsl.g:2473:2: rule__CompositeNode__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group__7"


    // $ANTLR start "rule__CompositeNode__Group__7__Impl"
    // InternalDataDsl.g:2479:1: rule__CompositeNode__Group__7__Impl : ( ( rule__CompositeNode__Group_7__0 )? ) ;
    public final void rule__CompositeNode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2483:1: ( ( ( rule__CompositeNode__Group_7__0 )? ) )
            // InternalDataDsl.g:2484:1: ( ( rule__CompositeNode__Group_7__0 )? )
            {
            // InternalDataDsl.g:2484:1: ( ( rule__CompositeNode__Group_7__0 )? )
            // InternalDataDsl.g:2485:2: ( rule__CompositeNode__Group_7__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_7()); 
            // InternalDataDsl.g:2486:2: ( rule__CompositeNode__Group_7__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDsl.g:2486:3: rule__CompositeNode__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group__7__Impl"


    // $ANTLR start "rule__CompositeNode__Group_3__0"
    // InternalDataDsl.g:2495:1: rule__CompositeNode__Group_3__0 : rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1 ;
    public final void rule__CompositeNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2499:1: ( rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1 )
            // InternalDataDsl.g:2500:2: rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDsl.g:2507:1: rule__CompositeNode__Group_3__0__Impl : ( ':' ) ;
    public final void rule__CompositeNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2511:1: ( ( ':' ) )
            // InternalDataDsl.g:2512:1: ( ':' )
            {
            // InternalDataDsl.g:2512:1: ( ':' )
            // InternalDataDsl.g:2513:2: ':'
            {
             before(grammarAccess.getCompositeNodeAccess().getColonKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getColonKeyword_3_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:2522:1: rule__CompositeNode__Group_3__1 : rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2 ;
    public final void rule__CompositeNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2526:1: ( rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2 )
            // InternalDataDsl.g:2527:2: rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalDataDsl.g:2534:1: rule__CompositeNode__Group_3__1__Impl : ( ( rule__CompositeNode__ExtendsAssignment_3_1 ) ) ;
    public final void rule__CompositeNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2538:1: ( ( ( rule__CompositeNode__ExtendsAssignment_3_1 ) ) )
            // InternalDataDsl.g:2539:1: ( ( rule__CompositeNode__ExtendsAssignment_3_1 ) )
            {
            // InternalDataDsl.g:2539:1: ( ( rule__CompositeNode__ExtendsAssignment_3_1 ) )
            // InternalDataDsl.g:2540:2: ( rule__CompositeNode__ExtendsAssignment_3_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_3_1()); 
            // InternalDataDsl.g:2541:2: ( rule__CompositeNode__ExtendsAssignment_3_1 )
            // InternalDataDsl.g:2541:3: rule__CompositeNode__ExtendsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__ExtendsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_3_1()); 

            }


            }

        }
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
    // InternalDataDsl.g:2549:1: rule__CompositeNode__Group_3__2 : rule__CompositeNode__Group_3__2__Impl ;
    public final void rule__CompositeNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2553:1: ( rule__CompositeNode__Group_3__2__Impl )
            // InternalDataDsl.g:2554:2: rule__CompositeNode__Group_3__2__Impl
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
    // InternalDataDsl.g:2560:1: rule__CompositeNode__Group_3__2__Impl : ( ( rule__CompositeNode__Group_3_2__0 )* ) ;
    public final void rule__CompositeNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2564:1: ( ( ( rule__CompositeNode__Group_3_2__0 )* ) )
            // InternalDataDsl.g:2565:1: ( ( rule__CompositeNode__Group_3_2__0 )* )
            {
            // InternalDataDsl.g:2565:1: ( ( rule__CompositeNode__Group_3_2__0 )* )
            // InternalDataDsl.g:2566:2: ( rule__CompositeNode__Group_3_2__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_3_2()); 
            // InternalDataDsl.g:2567:2: ( rule__CompositeNode__Group_3_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==39) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDataDsl.g:2567:3: rule__CompositeNode__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CompositeNode__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getCompositeNodeAccess().getGroup_3_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeNode__Group_3_2__0"
    // InternalDataDsl.g:2576:1: rule__CompositeNode__Group_3_2__0 : rule__CompositeNode__Group_3_2__0__Impl rule__CompositeNode__Group_3_2__1 ;
    public final void rule__CompositeNode__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2580:1: ( rule__CompositeNode__Group_3_2__0__Impl rule__CompositeNode__Group_3_2__1 )
            // InternalDataDsl.g:2581:2: rule__CompositeNode__Group_3_2__0__Impl rule__CompositeNode__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
            rule__CompositeNode__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_3_2__0"


    // $ANTLR start "rule__CompositeNode__Group_3_2__0__Impl"
    // InternalDataDsl.g:2588:1: rule__CompositeNode__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2592:1: ( ( ',' ) )
            // InternalDataDsl.g:2593:1: ( ',' )
            {
            // InternalDataDsl.g:2593:1: ( ',' )
            // InternalDataDsl.g:2594:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_3_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_3_2__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_3_2__1"
    // InternalDataDsl.g:2603:1: rule__CompositeNode__Group_3_2__1 : rule__CompositeNode__Group_3_2__1__Impl ;
    public final void rule__CompositeNode__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2607:1: ( rule__CompositeNode__Group_3_2__1__Impl )
            // InternalDataDsl.g:2608:2: rule__CompositeNode__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_3_2__1"


    // $ANTLR start "rule__CompositeNode__Group_3_2__1__Impl"
    // InternalDataDsl.g:2614:1: rule__CompositeNode__Group_3_2__1__Impl : ( ( rule__CompositeNode__ExtendsAssignment_3_2_1 ) ) ;
    public final void rule__CompositeNode__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2618:1: ( ( ( rule__CompositeNode__ExtendsAssignment_3_2_1 ) ) )
            // InternalDataDsl.g:2619:1: ( ( rule__CompositeNode__ExtendsAssignment_3_2_1 ) )
            {
            // InternalDataDsl.g:2619:1: ( ( rule__CompositeNode__ExtendsAssignment_3_2_1 ) )
            // InternalDataDsl.g:2620:2: ( rule__CompositeNode__ExtendsAssignment_3_2_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_3_2_1()); 
            // InternalDataDsl.g:2621:2: ( rule__CompositeNode__ExtendsAssignment_3_2_1 )
            // InternalDataDsl.g:2621:3: rule__CompositeNode__ExtendsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__ExtendsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_3_2__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group_5__0"
    // InternalDataDsl.g:2630:1: rule__CompositeNode__Group_5__0 : rule__CompositeNode__Group_5__0__Impl rule__CompositeNode__Group_5__1 ;
    public final void rule__CompositeNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2634:1: ( rule__CompositeNode__Group_5__0__Impl rule__CompositeNode__Group_5__1 )
            // InternalDataDsl.g:2635:2: rule__CompositeNode__Group_5__0__Impl rule__CompositeNode__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__CompositeNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5__0"


    // $ANTLR start "rule__CompositeNode__Group_5__0__Impl"
    // InternalDataDsl.g:2642:1: rule__CompositeNode__Group_5__0__Impl : ( ( rule__CompositeNode__SubnodesAssignment_5_0 ) ) ;
    public final void rule__CompositeNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2646:1: ( ( ( rule__CompositeNode__SubnodesAssignment_5_0 ) ) )
            // InternalDataDsl.g:2647:1: ( ( rule__CompositeNode__SubnodesAssignment_5_0 ) )
            {
            // InternalDataDsl.g:2647:1: ( ( rule__CompositeNode__SubnodesAssignment_5_0 ) )
            // InternalDataDsl.g:2648:2: ( rule__CompositeNode__SubnodesAssignment_5_0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_5_0()); 
            // InternalDataDsl.g:2649:2: ( rule__CompositeNode__SubnodesAssignment_5_0 )
            // InternalDataDsl.g:2649:3: rule__CompositeNode__SubnodesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__SubnodesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_5__1"
    // InternalDataDsl.g:2657:1: rule__CompositeNode__Group_5__1 : rule__CompositeNode__Group_5__1__Impl ;
    public final void rule__CompositeNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2661:1: ( rule__CompositeNode__Group_5__1__Impl )
            // InternalDataDsl.g:2662:2: rule__CompositeNode__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5__1"


    // $ANTLR start "rule__CompositeNode__Group_5__1__Impl"
    // InternalDataDsl.g:2668:1: rule__CompositeNode__Group_5__1__Impl : ( ( rule__CompositeNode__Group_5_1__0 )* ) ;
    public final void rule__CompositeNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2672:1: ( ( ( rule__CompositeNode__Group_5_1__0 )* ) )
            // InternalDataDsl.g:2673:1: ( ( rule__CompositeNode__Group_5_1__0 )* )
            {
            // InternalDataDsl.g:2673:1: ( ( rule__CompositeNode__Group_5_1__0 )* )
            // InternalDataDsl.g:2674:2: ( rule__CompositeNode__Group_5_1__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_5_1()); 
            // InternalDataDsl.g:2675:2: ( rule__CompositeNode__Group_5_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==39) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalDataDsl.g:2675:3: rule__CompositeNode__Group_5_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CompositeNode__Group_5_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getCompositeNodeAccess().getGroup_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group_5_1__0"
    // InternalDataDsl.g:2684:1: rule__CompositeNode__Group_5_1__0 : rule__CompositeNode__Group_5_1__0__Impl rule__CompositeNode__Group_5_1__1 ;
    public final void rule__CompositeNode__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2688:1: ( rule__CompositeNode__Group_5_1__0__Impl rule__CompositeNode__Group_5_1__1 )
            // InternalDataDsl.g:2689:2: rule__CompositeNode__Group_5_1__0__Impl rule__CompositeNode__Group_5_1__1
            {
            pushFollow(FOLLOW_11);
            rule__CompositeNode__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_1__0"


    // $ANTLR start "rule__CompositeNode__Group_5_1__0__Impl"
    // InternalDataDsl.g:2696:1: rule__CompositeNode__Group_5_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2700:1: ( ( ',' ) )
            // InternalDataDsl.g:2701:1: ( ',' )
            {
            // InternalDataDsl.g:2701:1: ( ',' )
            // InternalDataDsl.g:2702:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_5_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getCommaKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_1__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_5_1__1"
    // InternalDataDsl.g:2711:1: rule__CompositeNode__Group_5_1__1 : rule__CompositeNode__Group_5_1__1__Impl ;
    public final void rule__CompositeNode__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2715:1: ( rule__CompositeNode__Group_5_1__1__Impl )
            // InternalDataDsl.g:2716:2: rule__CompositeNode__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_1__1"


    // $ANTLR start "rule__CompositeNode__Group_5_1__1__Impl"
    // InternalDataDsl.g:2722:1: rule__CompositeNode__Group_5_1__1__Impl : ( ( rule__CompositeNode__SubnodesAssignment_5_1_1 ) ) ;
    public final void rule__CompositeNode__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2726:1: ( ( ( rule__CompositeNode__SubnodesAssignment_5_1_1 ) ) )
            // InternalDataDsl.g:2727:1: ( ( rule__CompositeNode__SubnodesAssignment_5_1_1 ) )
            {
            // InternalDataDsl.g:2727:1: ( ( rule__CompositeNode__SubnodesAssignment_5_1_1 ) )
            // InternalDataDsl.g:2728:2: ( rule__CompositeNode__SubnodesAssignment_5_1_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_5_1_1()); 
            // InternalDataDsl.g:2729:2: ( rule__CompositeNode__SubnodesAssignment_5_1_1 )
            // InternalDataDsl.g:2729:3: rule__CompositeNode__SubnodesAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__SubnodesAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_1__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group_7__0"
    // InternalDataDsl.g:2738:1: rule__CompositeNode__Group_7__0 : rule__CompositeNode__Group_7__0__Impl rule__CompositeNode__Group_7__1 ;
    public final void rule__CompositeNode__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2742:1: ( rule__CompositeNode__Group_7__0__Impl rule__CompositeNode__Group_7__1 )
            // InternalDataDsl.g:2743:2: rule__CompositeNode__Group_7__0__Impl rule__CompositeNode__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeNode__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7__0"


    // $ANTLR start "rule__CompositeNode__Group_7__0__Impl"
    // InternalDataDsl.g:2750:1: rule__CompositeNode__Group_7__0__Impl : ( '{' ) ;
    public final void rule__CompositeNode__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2754:1: ( ( '{' ) )
            // InternalDataDsl.g:2755:1: ( '{' )
            {
            // InternalDataDsl.g:2755:1: ( '{' )
            // InternalDataDsl.g:2756:2: '{'
            {
             before(grammarAccess.getCompositeNodeAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getLeftCurlyBracketKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_7__1"
    // InternalDataDsl.g:2765:1: rule__CompositeNode__Group_7__1 : rule__CompositeNode__Group_7__1__Impl rule__CompositeNode__Group_7__2 ;
    public final void rule__CompositeNode__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2769:1: ( rule__CompositeNode__Group_7__1__Impl rule__CompositeNode__Group_7__2 )
            // InternalDataDsl.g:2770:2: rule__CompositeNode__Group_7__1__Impl rule__CompositeNode__Group_7__2
            {
            pushFollow(FOLLOW_13);
            rule__CompositeNode__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7__1"


    // $ANTLR start "rule__CompositeNode__Group_7__1__Impl"
    // InternalDataDsl.g:2777:1: rule__CompositeNode__Group_7__1__Impl : ( ( rule__CompositeNode__OptionsAssignment_7_1 ) ) ;
    public final void rule__CompositeNode__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2781:1: ( ( ( rule__CompositeNode__OptionsAssignment_7_1 ) ) )
            // InternalDataDsl.g:2782:1: ( ( rule__CompositeNode__OptionsAssignment_7_1 ) )
            {
            // InternalDataDsl.g:2782:1: ( ( rule__CompositeNode__OptionsAssignment_7_1 ) )
            // InternalDataDsl.g:2783:2: ( rule__CompositeNode__OptionsAssignment_7_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_7_1()); 
            // InternalDataDsl.g:2784:2: ( rule__CompositeNode__OptionsAssignment_7_1 )
            // InternalDataDsl.g:2784:3: rule__CompositeNode__OptionsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__OptionsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group_7__2"
    // InternalDataDsl.g:2792:1: rule__CompositeNode__Group_7__2 : rule__CompositeNode__Group_7__2__Impl rule__CompositeNode__Group_7__3 ;
    public final void rule__CompositeNode__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2796:1: ( rule__CompositeNode__Group_7__2__Impl rule__CompositeNode__Group_7__3 )
            // InternalDataDsl.g:2797:2: rule__CompositeNode__Group_7__2__Impl rule__CompositeNode__Group_7__3
            {
            pushFollow(FOLLOW_13);
            rule__CompositeNode__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7__2"


    // $ANTLR start "rule__CompositeNode__Group_7__2__Impl"
    // InternalDataDsl.g:2804:1: rule__CompositeNode__Group_7__2__Impl : ( ( rule__CompositeNode__Group_7_2__0 )* ) ;
    public final void rule__CompositeNode__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2808:1: ( ( ( rule__CompositeNode__Group_7_2__0 )* ) )
            // InternalDataDsl.g:2809:1: ( ( rule__CompositeNode__Group_7_2__0 )* )
            {
            // InternalDataDsl.g:2809:1: ( ( rule__CompositeNode__Group_7_2__0 )* )
            // InternalDataDsl.g:2810:2: ( rule__CompositeNode__Group_7_2__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_7_2()); 
            // InternalDataDsl.g:2811:2: ( rule__CompositeNode__Group_7_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDataDsl.g:2811:3: rule__CompositeNode__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__CompositeNode__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCompositeNodeAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7__2__Impl"


    // $ANTLR start "rule__CompositeNode__Group_7__3"
    // InternalDataDsl.g:2819:1: rule__CompositeNode__Group_7__3 : rule__CompositeNode__Group_7__3__Impl ;
    public final void rule__CompositeNode__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2823:1: ( rule__CompositeNode__Group_7__3__Impl )
            // InternalDataDsl.g:2824:2: rule__CompositeNode__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7__3"


    // $ANTLR start "rule__CompositeNode__Group_7__3__Impl"
    // InternalDataDsl.g:2830:1: rule__CompositeNode__Group_7__3__Impl : ( '}' ) ;
    public final void rule__CompositeNode__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2834:1: ( ( '}' ) )
            // InternalDataDsl.g:2835:1: ( '}' )
            {
            // InternalDataDsl.g:2835:1: ( '}' )
            // InternalDataDsl.g:2836:2: '}'
            {
             before(grammarAccess.getCompositeNodeAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7__3__Impl"


    // $ANTLR start "rule__CompositeNode__Group_7_2__0"
    // InternalDataDsl.g:2846:1: rule__CompositeNode__Group_7_2__0 : rule__CompositeNode__Group_7_2__0__Impl rule__CompositeNode__Group_7_2__1 ;
    public final void rule__CompositeNode__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2850:1: ( rule__CompositeNode__Group_7_2__0__Impl rule__CompositeNode__Group_7_2__1 )
            // InternalDataDsl.g:2851:2: rule__CompositeNode__Group_7_2__0__Impl rule__CompositeNode__Group_7_2__1
            {
            pushFollow(FOLLOW_12);
            rule__CompositeNode__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7_2__0"


    // $ANTLR start "rule__CompositeNode__Group_7_2__0__Impl"
    // InternalDataDsl.g:2858:1: rule__CompositeNode__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2862:1: ( ( ',' ) )
            // InternalDataDsl.g:2863:1: ( ',' )
            {
            // InternalDataDsl.g:2863:1: ( ',' )
            // InternalDataDsl.g:2864:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_7_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7_2__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_7_2__1"
    // InternalDataDsl.g:2873:1: rule__CompositeNode__Group_7_2__1 : rule__CompositeNode__Group_7_2__1__Impl ;
    public final void rule__CompositeNode__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2877:1: ( rule__CompositeNode__Group_7_2__1__Impl )
            // InternalDataDsl.g:2878:2: rule__CompositeNode__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7_2__1"


    // $ANTLR start "rule__CompositeNode__Group_7_2__1__Impl"
    // InternalDataDsl.g:2884:1: rule__CompositeNode__Group_7_2__1__Impl : ( ( rule__CompositeNode__OptionsAssignment_7_2_1 ) ) ;
    public final void rule__CompositeNode__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2888:1: ( ( ( rule__CompositeNode__OptionsAssignment_7_2_1 ) ) )
            // InternalDataDsl.g:2889:1: ( ( rule__CompositeNode__OptionsAssignment_7_2_1 ) )
            {
            // InternalDataDsl.g:2889:1: ( ( rule__CompositeNode__OptionsAssignment_7_2_1 ) )
            // InternalDataDsl.g:2890:2: ( rule__CompositeNode__OptionsAssignment_7_2_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_7_2_1()); 
            // InternalDataDsl.g:2891:2: ( rule__CompositeNode__OptionsAssignment_7_2_1 )
            // InternalDataDsl.g:2891:3: rule__CompositeNode__OptionsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__OptionsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_7_2__1__Impl"


    // $ANTLR start "rule__LeafNode__Group__0"
    // InternalDataDsl.g:2900:1: rule__LeafNode__Group__0 : rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1 ;
    public final void rule__LeafNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2904:1: ( rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1 )
            // InternalDataDsl.g:2905:2: rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalDataDsl.g:2912:1: rule__LeafNode__Group__0__Impl : ( ( rule__LeafNode__UniquenessAssignment_0 )? ) ;
    public final void rule__LeafNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2916:1: ( ( ( rule__LeafNode__UniquenessAssignment_0 )? ) )
            // InternalDataDsl.g:2917:1: ( ( rule__LeafNode__UniquenessAssignment_0 )? )
            {
            // InternalDataDsl.g:2917:1: ( ( rule__LeafNode__UniquenessAssignment_0 )? )
            // InternalDataDsl.g:2918:2: ( rule__LeafNode__UniquenessAssignment_0 )?
            {
             before(grammarAccess.getLeafNodeAccess().getUniquenessAssignment_0()); 
            // InternalDataDsl.g:2919:2: ( rule__LeafNode__UniquenessAssignment_0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_UNIQUENESS) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataDsl.g:2919:3: rule__LeafNode__UniquenessAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__UniquenessAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getUniquenessAssignment_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:2927:1: rule__LeafNode__Group__1 : rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2 ;
    public final void rule__LeafNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2931:1: ( rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2 )
            // InternalDataDsl.g:2932:2: rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataDsl.g:2939:1: rule__LeafNode__Group__1__Impl : ( ( rule__LeafNode__Alternatives_1 ) ) ;
    public final void rule__LeafNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2943:1: ( ( ( rule__LeafNode__Alternatives_1 ) ) )
            // InternalDataDsl.g:2944:1: ( ( rule__LeafNode__Alternatives_1 ) )
            {
            // InternalDataDsl.g:2944:1: ( ( rule__LeafNode__Alternatives_1 ) )
            // InternalDataDsl.g:2945:2: ( rule__LeafNode__Alternatives_1 )
            {
             before(grammarAccess.getLeafNodeAccess().getAlternatives_1()); 
            // InternalDataDsl.g:2946:2: ( rule__LeafNode__Alternatives_1 )
            // InternalDataDsl.g:2946:3: rule__LeafNode__Alternatives_1
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
    // InternalDataDsl.g:2954:1: rule__LeafNode__Group__2 : rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3 ;
    public final void rule__LeafNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2958:1: ( rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3 )
            // InternalDataDsl.g:2959:2: rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataDsl.g:2966:1: rule__LeafNode__Group__2__Impl : ( ( rule__LeafNode__KeywordAssignment_2 )? ) ;
    public final void rule__LeafNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2970:1: ( ( ( rule__LeafNode__KeywordAssignment_2 )? ) )
            // InternalDataDsl.g:2971:1: ( ( rule__LeafNode__KeywordAssignment_2 )? )
            {
            // InternalDataDsl.g:2971:1: ( ( rule__LeafNode__KeywordAssignment_2 )? )
            // InternalDataDsl.g:2972:2: ( rule__LeafNode__KeywordAssignment_2 )?
            {
             before(grammarAccess.getLeafNodeAccess().getKeywordAssignment_2()); 
            // InternalDataDsl.g:2973:2: ( rule__LeafNode__KeywordAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataDsl.g:2973:3: rule__LeafNode__KeywordAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__KeywordAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getKeywordAssignment_2()); 

            }


            }

        }
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
    // InternalDataDsl.g:2981:1: rule__LeafNode__Group__3 : rule__LeafNode__Group__3__Impl rule__LeafNode__Group__4 ;
    public final void rule__LeafNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2985:1: ( rule__LeafNode__Group__3__Impl rule__LeafNode__Group__4 )
            // InternalDataDsl.g:2986:2: rule__LeafNode__Group__3__Impl rule__LeafNode__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__LeafNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__4();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:2993:1: rule__LeafNode__Group__3__Impl : ( ( rule__LeafNode__NameAssignment_3 ) ) ;
    public final void rule__LeafNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2997:1: ( ( ( rule__LeafNode__NameAssignment_3 ) ) )
            // InternalDataDsl.g:2998:1: ( ( rule__LeafNode__NameAssignment_3 ) )
            {
            // InternalDataDsl.g:2998:1: ( ( rule__LeafNode__NameAssignment_3 ) )
            // InternalDataDsl.g:2999:2: ( rule__LeafNode__NameAssignment_3 )
            {
             before(grammarAccess.getLeafNodeAccess().getNameAssignment_3()); 
            // InternalDataDsl.g:3000:2: ( rule__LeafNode__NameAssignment_3 )
            // InternalDataDsl.g:3000:3: rule__LeafNode__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__LeafNode__Group__4"
    // InternalDataDsl.g:3008:1: rule__LeafNode__Group__4 : rule__LeafNode__Group__4__Impl rule__LeafNode__Group__5 ;
    public final void rule__LeafNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3012:1: ( rule__LeafNode__Group__4__Impl rule__LeafNode__Group__5 )
            // InternalDataDsl.g:3013:2: rule__LeafNode__Group__4__Impl rule__LeafNode__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__LeafNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__4"


    // $ANTLR start "rule__LeafNode__Group__4__Impl"
    // InternalDataDsl.g:3020:1: rule__LeafNode__Group__4__Impl : ( ( rule__LeafNode__RepresentedAsAssignment_4 )? ) ;
    public final void rule__LeafNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3024:1: ( ( ( rule__LeafNode__RepresentedAsAssignment_4 )? ) )
            // InternalDataDsl.g:3025:1: ( ( rule__LeafNode__RepresentedAsAssignment_4 )? )
            {
            // InternalDataDsl.g:3025:1: ( ( rule__LeafNode__RepresentedAsAssignment_4 )? )
            // InternalDataDsl.g:3026:2: ( rule__LeafNode__RepresentedAsAssignment_4 )?
            {
             before(grammarAccess.getLeafNodeAccess().getRepresentedAsAssignment_4()); 
            // InternalDataDsl.g:3027:2: ( rule__LeafNode__RepresentedAsAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataDsl.g:3027:3: rule__LeafNode__RepresentedAsAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__RepresentedAsAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getRepresentedAsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__4__Impl"


    // $ANTLR start "rule__LeafNode__Group__5"
    // InternalDataDsl.g:3035:1: rule__LeafNode__Group__5 : rule__LeafNode__Group__5__Impl ;
    public final void rule__LeafNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3039:1: ( rule__LeafNode__Group__5__Impl )
            // InternalDataDsl.g:3040:2: rule__LeafNode__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__5"


    // $ANTLR start "rule__LeafNode__Group__5__Impl"
    // InternalDataDsl.g:3046:1: rule__LeafNode__Group__5__Impl : ( ( rule__LeafNode__Group_5__0 )? ) ;
    public final void rule__LeafNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3050:1: ( ( ( rule__LeafNode__Group_5__0 )? ) )
            // InternalDataDsl.g:3051:1: ( ( rule__LeafNode__Group_5__0 )? )
            {
            // InternalDataDsl.g:3051:1: ( ( rule__LeafNode__Group_5__0 )? )
            // InternalDataDsl.g:3052:2: ( rule__LeafNode__Group_5__0 )?
            {
             before(grammarAccess.getLeafNodeAccess().getGroup_5()); 
            // InternalDataDsl.g:3053:2: ( rule__LeafNode__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataDsl.g:3053:3: rule__LeafNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__5__Impl"


    // $ANTLR start "rule__LeafNode__Group_5__0"
    // InternalDataDsl.g:3062:1: rule__LeafNode__Group_5__0 : rule__LeafNode__Group_5__0__Impl rule__LeafNode__Group_5__1 ;
    public final void rule__LeafNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3066:1: ( rule__LeafNode__Group_5__0__Impl rule__LeafNode__Group_5__1 )
            // InternalDataDsl.g:3067:2: rule__LeafNode__Group_5__0__Impl rule__LeafNode__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__LeafNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5__0"


    // $ANTLR start "rule__LeafNode__Group_5__0__Impl"
    // InternalDataDsl.g:3074:1: rule__LeafNode__Group_5__0__Impl : ( '{' ) ;
    public final void rule__LeafNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3078:1: ( ( '{' ) )
            // InternalDataDsl.g:3079:1: ( '{' )
            {
            // InternalDataDsl.g:3079:1: ( '{' )
            // InternalDataDsl.g:3080:2: '{'
            {
             before(grammarAccess.getLeafNodeAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5__0__Impl"


    // $ANTLR start "rule__LeafNode__Group_5__1"
    // InternalDataDsl.g:3089:1: rule__LeafNode__Group_5__1 : rule__LeafNode__Group_5__1__Impl rule__LeafNode__Group_5__2 ;
    public final void rule__LeafNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3093:1: ( rule__LeafNode__Group_5__1__Impl rule__LeafNode__Group_5__2 )
            // InternalDataDsl.g:3094:2: rule__LeafNode__Group_5__1__Impl rule__LeafNode__Group_5__2
            {
            pushFollow(FOLLOW_13);
            rule__LeafNode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5__1"


    // $ANTLR start "rule__LeafNode__Group_5__1__Impl"
    // InternalDataDsl.g:3101:1: rule__LeafNode__Group_5__1__Impl : ( ( rule__LeafNode__OptionsAssignment_5_1 ) ) ;
    public final void rule__LeafNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3105:1: ( ( ( rule__LeafNode__OptionsAssignment_5_1 ) ) )
            // InternalDataDsl.g:3106:1: ( ( rule__LeafNode__OptionsAssignment_5_1 ) )
            {
            // InternalDataDsl.g:3106:1: ( ( rule__LeafNode__OptionsAssignment_5_1 ) )
            // InternalDataDsl.g:3107:2: ( rule__LeafNode__OptionsAssignment_5_1 )
            {
             before(grammarAccess.getLeafNodeAccess().getOptionsAssignment_5_1()); 
            // InternalDataDsl.g:3108:2: ( rule__LeafNode__OptionsAssignment_5_1 )
            // InternalDataDsl.g:3108:3: rule__LeafNode__OptionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__OptionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getOptionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5__1__Impl"


    // $ANTLR start "rule__LeafNode__Group_5__2"
    // InternalDataDsl.g:3116:1: rule__LeafNode__Group_5__2 : rule__LeafNode__Group_5__2__Impl rule__LeafNode__Group_5__3 ;
    public final void rule__LeafNode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3120:1: ( rule__LeafNode__Group_5__2__Impl rule__LeafNode__Group_5__3 )
            // InternalDataDsl.g:3121:2: rule__LeafNode__Group_5__2__Impl rule__LeafNode__Group_5__3
            {
            pushFollow(FOLLOW_13);
            rule__LeafNode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5__2"


    // $ANTLR start "rule__LeafNode__Group_5__2__Impl"
    // InternalDataDsl.g:3128:1: rule__LeafNode__Group_5__2__Impl : ( ( rule__LeafNode__Group_5_2__0 )* ) ;
    public final void rule__LeafNode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3132:1: ( ( ( rule__LeafNode__Group_5_2__0 )* ) )
            // InternalDataDsl.g:3133:1: ( ( rule__LeafNode__Group_5_2__0 )* )
            {
            // InternalDataDsl.g:3133:1: ( ( rule__LeafNode__Group_5_2__0 )* )
            // InternalDataDsl.g:3134:2: ( rule__LeafNode__Group_5_2__0 )*
            {
             before(grammarAccess.getLeafNodeAccess().getGroup_5_2()); 
            // InternalDataDsl.g:3135:2: ( rule__LeafNode__Group_5_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==39) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalDataDsl.g:3135:3: rule__LeafNode__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__LeafNode__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getLeafNodeAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5__2__Impl"


    // $ANTLR start "rule__LeafNode__Group_5__3"
    // InternalDataDsl.g:3143:1: rule__LeafNode__Group_5__3 : rule__LeafNode__Group_5__3__Impl ;
    public final void rule__LeafNode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3147:1: ( rule__LeafNode__Group_5__3__Impl )
            // InternalDataDsl.g:3148:2: rule__LeafNode__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5__3"


    // $ANTLR start "rule__LeafNode__Group_5__3__Impl"
    // InternalDataDsl.g:3154:1: rule__LeafNode__Group_5__3__Impl : ( '}' ) ;
    public final void rule__LeafNode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3158:1: ( ( '}' ) )
            // InternalDataDsl.g:3159:1: ( '}' )
            {
            // InternalDataDsl.g:3159:1: ( '}' )
            // InternalDataDsl.g:3160:2: '}'
            {
             before(grammarAccess.getLeafNodeAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5__3__Impl"


    // $ANTLR start "rule__LeafNode__Group_5_2__0"
    // InternalDataDsl.g:3170:1: rule__LeafNode__Group_5_2__0 : rule__LeafNode__Group_5_2__0__Impl rule__LeafNode__Group_5_2__1 ;
    public final void rule__LeafNode__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3174:1: ( rule__LeafNode__Group_5_2__0__Impl rule__LeafNode__Group_5_2__1 )
            // InternalDataDsl.g:3175:2: rule__LeafNode__Group_5_2__0__Impl rule__LeafNode__Group_5_2__1
            {
            pushFollow(FOLLOW_12);
            rule__LeafNode__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5_2__0"


    // $ANTLR start "rule__LeafNode__Group_5_2__0__Impl"
    // InternalDataDsl.g:3182:1: rule__LeafNode__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__LeafNode__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3186:1: ( ( ',' ) )
            // InternalDataDsl.g:3187:1: ( ',' )
            {
            // InternalDataDsl.g:3187:1: ( ',' )
            // InternalDataDsl.g:3188:2: ','
            {
             before(grammarAccess.getLeafNodeAccess().getCommaKeyword_5_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5_2__0__Impl"


    // $ANTLR start "rule__LeafNode__Group_5_2__1"
    // InternalDataDsl.g:3197:1: rule__LeafNode__Group_5_2__1 : rule__LeafNode__Group_5_2__1__Impl ;
    public final void rule__LeafNode__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3201:1: ( rule__LeafNode__Group_5_2__1__Impl )
            // InternalDataDsl.g:3202:2: rule__LeafNode__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5_2__1"


    // $ANTLR start "rule__LeafNode__Group_5_2__1__Impl"
    // InternalDataDsl.g:3208:1: rule__LeafNode__Group_5_2__1__Impl : ( ( rule__LeafNode__OptionsAssignment_5_2_1 ) ) ;
    public final void rule__LeafNode__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3212:1: ( ( ( rule__LeafNode__OptionsAssignment_5_2_1 ) ) )
            // InternalDataDsl.g:3213:1: ( ( rule__LeafNode__OptionsAssignment_5_2_1 ) )
            {
            // InternalDataDsl.g:3213:1: ( ( rule__LeafNode__OptionsAssignment_5_2_1 ) )
            // InternalDataDsl.g:3214:2: ( rule__LeafNode__OptionsAssignment_5_2_1 )
            {
             before(grammarAccess.getLeafNodeAccess().getOptionsAssignment_5_2_1()); 
            // InternalDataDsl.g:3215:2: ( rule__LeafNode__OptionsAssignment_5_2_1 )
            // InternalDataDsl.g:3215:3: rule__LeafNode__OptionsAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__OptionsAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getOptionsAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group_5_2__1__Impl"


    // $ANTLR start "rule__Option__Group_0__0"
    // InternalDataDsl.g:3224:1: rule__Option__Group_0__0 : rule__Option__Group_0__0__Impl rule__Option__Group_0__1 ;
    public final void rule__Option__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3228:1: ( rule__Option__Group_0__0__Impl rule__Option__Group_0__1 )
            // InternalDataDsl.g:3229:2: rule__Option__Group_0__0__Impl rule__Option__Group_0__1
            {
            pushFollow(FOLLOW_22);
            rule__Option__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_0__0"


    // $ANTLR start "rule__Option__Group_0__0__Impl"
    // InternalDataDsl.g:3236:1: rule__Option__Group_0__0__Impl : ( ( rule__Option__KeyAssignment_0_0 ) ) ;
    public final void rule__Option__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3240:1: ( ( ( rule__Option__KeyAssignment_0_0 ) ) )
            // InternalDataDsl.g:3241:1: ( ( rule__Option__KeyAssignment_0_0 ) )
            {
            // InternalDataDsl.g:3241:1: ( ( rule__Option__KeyAssignment_0_0 ) )
            // InternalDataDsl.g:3242:2: ( rule__Option__KeyAssignment_0_0 )
            {
             before(grammarAccess.getOptionAccess().getKeyAssignment_0_0()); 
            // InternalDataDsl.g:3243:2: ( rule__Option__KeyAssignment_0_0 )
            // InternalDataDsl.g:3243:3: rule__Option__KeyAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Option__KeyAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getKeyAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_0__0__Impl"


    // $ANTLR start "rule__Option__Group_0__1"
    // InternalDataDsl.g:3251:1: rule__Option__Group_0__1 : rule__Option__Group_0__1__Impl rule__Option__Group_0__2 ;
    public final void rule__Option__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3255:1: ( rule__Option__Group_0__1__Impl rule__Option__Group_0__2 )
            // InternalDataDsl.g:3256:2: rule__Option__Group_0__1__Impl rule__Option__Group_0__2
            {
            pushFollow(FOLLOW_16);
            rule__Option__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_0__1"


    // $ANTLR start "rule__Option__Group_0__1__Impl"
    // InternalDataDsl.g:3263:1: rule__Option__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Option__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3267:1: ( ( '=' ) )
            // InternalDataDsl.g:3268:1: ( '=' )
            {
            // InternalDataDsl.g:3268:1: ( '=' )
            // InternalDataDsl.g:3269:2: '='
            {
             before(grammarAccess.getOptionAccess().getEqualsSignKeyword_0_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_0__1__Impl"


    // $ANTLR start "rule__Option__Group_0__2"
    // InternalDataDsl.g:3278:1: rule__Option__Group_0__2 : rule__Option__Group_0__2__Impl ;
    public final void rule__Option__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3282:1: ( rule__Option__Group_0__2__Impl )
            // InternalDataDsl.g:3283:2: rule__Option__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_0__2"


    // $ANTLR start "rule__Option__Group_0__2__Impl"
    // InternalDataDsl.g:3289:1: rule__Option__Group_0__2__Impl : ( ( rule__Option__ValueAssignment_0_2 ) ) ;
    public final void rule__Option__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3293:1: ( ( ( rule__Option__ValueAssignment_0_2 ) ) )
            // InternalDataDsl.g:3294:1: ( ( rule__Option__ValueAssignment_0_2 ) )
            {
            // InternalDataDsl.g:3294:1: ( ( rule__Option__ValueAssignment_0_2 ) )
            // InternalDataDsl.g:3295:2: ( rule__Option__ValueAssignment_0_2 )
            {
             before(grammarAccess.getOptionAccess().getValueAssignment_0_2()); 
            // InternalDataDsl.g:3296:2: ( rule__Option__ValueAssignment_0_2 )
            // InternalDataDsl.g:3296:3: rule__Option__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Option__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_0__2__Impl"


    // $ANTLR start "rule__DataModel__DescriptionsAssignment_0"
    // InternalDataDsl.g:3305:1: rule__DataModel__DescriptionsAssignment_0 : ( ruleDataDescription ) ;
    public final void rule__DataModel__DescriptionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3309:1: ( ( ruleDataDescription ) )
            // InternalDataDsl.g:3310:2: ( ruleDataDescription )
            {
            // InternalDataDsl.g:3310:2: ( ruleDataDescription )
            // InternalDataDsl.g:3311:3: ruleDataDescription
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDataDescription();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataModel__DescriptionsAssignment_1_1"
    // InternalDataDsl.g:3320:1: rule__DataModel__DescriptionsAssignment_1_1 : ( ruleDataDescription ) ;
    public final void rule__DataModel__DescriptionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3324:1: ( ( ruleDataDescription ) )
            // InternalDataDsl.g:3325:2: ( ruleDataDescription )
            {
            // InternalDataDsl.g:3325:2: ( ruleDataDescription )
            // InternalDataDsl.g:3326:3: ruleDataDescription
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataDescription();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__DescriptionsAssignment_1_1"


    // $ANTLR start "rule__DataSource__FormatAssignment_1"
    // InternalDataDsl.g:3335:1: rule__DataSource__FormatAssignment_1 : ( RULE_FORMAT ) ;
    public final void rule__DataSource__FormatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3339:1: ( ( RULE_FORMAT ) )
            // InternalDataDsl.g:3340:2: ( RULE_FORMAT )
            {
            // InternalDataDsl.g:3340:2: ( RULE_FORMAT )
            // InternalDataDsl.g:3341:3: RULE_FORMAT
            {
             before(grammarAccess.getDataSourceAccess().getFormatFORMATTerminalRuleCall_1_0()); 
            match(input,RULE_FORMAT,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getFormatFORMATTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__FormatAssignment_1"


    // $ANTLR start "rule__DataSource__NameAssignment_2"
    // InternalDataDsl.g:3350:1: rule__DataSource__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataSource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3354:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:3355:2: ( RULE_ID )
            {
            // InternalDataDsl.g:3355:2: ( RULE_ID )
            // InternalDataDsl.g:3356:3: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__NameAssignment_2"


    // $ANTLR start "rule__DataSource__FragmentsAssignment_3_1"
    // InternalDataDsl.g:3365:1: rule__DataSource__FragmentsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSource__FragmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3369:1: ( ( ( RULE_ID ) ) )
            // InternalDataDsl.g:3370:2: ( ( RULE_ID ) )
            {
            // InternalDataDsl.g:3370:2: ( ( RULE_ID ) )
            // InternalDataDsl.g:3371:3: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_3_1_0()); 
            // InternalDataDsl.g:3372:3: ( RULE_ID )
            // InternalDataDsl.g:3373:4: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__FragmentsAssignment_3_1"


    // $ANTLR start "rule__DataSource__FragmentsAssignment_3_2_1"
    // InternalDataDsl.g:3384:1: rule__DataSource__FragmentsAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSource__FragmentsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3388:1: ( ( ( RULE_ID ) ) )
            // InternalDataDsl.g:3389:2: ( ( RULE_ID ) )
            {
            // InternalDataDsl.g:3389:2: ( ( RULE_ID ) )
            // InternalDataDsl.g:3390:3: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_3_2_1_0()); 
            // InternalDataDsl.g:3391:3: ( RULE_ID )
            // InternalDataDsl.g:3392:4: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__FragmentsAssignment_3_2_1"


    // $ANTLR start "rule__DataSource__NodesAssignment_5_0"
    // InternalDataDsl.g:3403:1: rule__DataSource__NodesAssignment_5_0 : ( ruleNode ) ;
    public final void rule__DataSource__NodesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3407:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3408:2: ( ruleNode )
            {
            // InternalDataDsl.g:3408:2: ( ruleNode )
            // InternalDataDsl.g:3409:3: ruleNode
            {
             before(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__NodesAssignment_5_0"


    // $ANTLR start "rule__DataSource__NodesAssignment_5_1_1"
    // InternalDataDsl.g:3418:1: rule__DataSource__NodesAssignment_5_1_1 : ( ruleNode ) ;
    public final void rule__DataSource__NodesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3422:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3423:2: ( ruleNode )
            {
            // InternalDataDsl.g:3423:2: ( ruleNode )
            // InternalDataDsl.g:3424:3: ruleNode
            {
             before(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__NodesAssignment_5_1_1"


    // $ANTLR start "rule__DataSource__OptionsAssignment_7_1"
    // InternalDataDsl.g:3433:1: rule__DataSource__OptionsAssignment_7_1 : ( ruleOption ) ;
    public final void rule__DataSource__OptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3437:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3438:2: ( ruleOption )
            {
            // InternalDataDsl.g:3438:2: ( ruleOption )
            // InternalDataDsl.g:3439:3: ruleOption
            {
             before(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__OptionsAssignment_7_1"


    // $ANTLR start "rule__DataSource__OptionsAssignment_7_2_1"
    // InternalDataDsl.g:3448:1: rule__DataSource__OptionsAssignment_7_2_1 : ( ruleOption ) ;
    public final void rule__DataSource__OptionsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3452:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3453:2: ( ruleOption )
            {
            // InternalDataDsl.g:3453:2: ( ruleOption )
            // InternalDataDsl.g:3454:3: ruleOption
            {
             before(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__OptionsAssignment_7_2_1"


    // $ANTLR start "rule__DataFragment__NameAssignment_1"
    // InternalDataDsl.g:3463:1: rule__DataFragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataFragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3467:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:3468:2: ( RULE_ID )
            {
            // InternalDataDsl.g:3468:2: ( RULE_ID )
            // InternalDataDsl.g:3469:3: RULE_ID
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
    // InternalDataDsl.g:3478:1: rule__DataFragment__FragmentsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataFragment__FragmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3482:1: ( ( ( RULE_ID ) ) )
            // InternalDataDsl.g:3483:2: ( ( RULE_ID ) )
            {
            // InternalDataDsl.g:3483:2: ( ( RULE_ID ) )
            // InternalDataDsl.g:3484:3: ( RULE_ID )
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_1_0()); 
            // InternalDataDsl.g:3485:3: ( RULE_ID )
            // InternalDataDsl.g:3486:4: RULE_ID
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentIDTerminalRuleCall_2_1_0_1()); 

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
    // InternalDataDsl.g:3497:1: rule__DataFragment__FragmentsAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataFragment__FragmentsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3501:1: ( ( ( RULE_ID ) ) )
            // InternalDataDsl.g:3502:2: ( ( RULE_ID ) )
            {
            // InternalDataDsl.g:3502:2: ( ( RULE_ID ) )
            // InternalDataDsl.g:3503:3: ( RULE_ID )
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentCrossReference_2_2_1_0()); 
            // InternalDataDsl.g:3504:3: ( RULE_ID )
            // InternalDataDsl.g:3505:4: RULE_ID
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentIDTerminalRuleCall_2_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getFragmentsDataFragmentIDTerminalRuleCall_2_2_1_0_1()); 

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
    // InternalDataDsl.g:3516:1: rule__DataFragment__NodesAssignment_4_0 : ( ruleNode ) ;
    public final void rule__DataFragment__NodesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3520:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3521:2: ( ruleNode )
            {
            // InternalDataDsl.g:3521:2: ( ruleNode )
            // InternalDataDsl.g:3522:3: ruleNode
            {
             before(grammarAccess.getDataFragmentAccess().getNodesNodeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getDataFragmentAccess().getNodesNodeParserRuleCall_4_0_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:3531:1: rule__DataFragment__NodesAssignment_4_1_1 : ( ruleNode ) ;
    public final void rule__DataFragment__NodesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3535:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3536:2: ( ruleNode )
            {
            // InternalDataDsl.g:3536:2: ( ruleNode )
            // InternalDataDsl.g:3537:3: ruleNode
            {
             before(grammarAccess.getDataFragmentAccess().getNodesNodeParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getDataFragmentAccess().getNodesNodeParserRuleCall_4_1_1_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:3546:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3550:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:3551:2: ( RULE_ID )
            {
            // InternalDataDsl.g:3551:2: ( RULE_ID )
            // InternalDataDsl.g:3552:3: RULE_ID
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
    // InternalDataDsl.g:3561:1: rule__DataType__RefineAssignment_3 : ( ruleBasicType ) ;
    public final void rule__DataType__RefineAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3565:1: ( ( ruleBasicType ) )
            // InternalDataDsl.g:3566:2: ( ruleBasicType )
            {
            // InternalDataDsl.g:3566:2: ( ruleBasicType )
            // InternalDataDsl.g:3567:3: ruleBasicType
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
    // InternalDataDsl.g:3576:1: rule__DataType__OptionsAssignment_4_1 : ( ruleOption ) ;
    public final void rule__DataType__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3580:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3581:2: ( ruleOption )
            {
            // InternalDataDsl.g:3581:2: ( ruleOption )
            // InternalDataDsl.g:3582:3: ruleOption
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
    // InternalDataDsl.g:3591:1: rule__DataType__OptionsAssignment_4_2_1 : ( ruleOption ) ;
    public final void rule__DataType__OptionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3595:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3596:2: ( ruleOption )
            {
            // InternalDataDsl.g:3596:2: ( ruleOption )
            // InternalDataDsl.g:3597:3: ruleOption
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
    // InternalDataDsl.g:3606:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3610:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:3611:2: ( RULE_ID )
            {
            // InternalDataDsl.g:3611:2: ( RULE_ID )
            // InternalDataDsl.g:3612:3: RULE_ID
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
    // InternalDataDsl.g:3621:1: rule__Enumeration__ValuesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Enumeration__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3625:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:3626:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:3626:2: ( RULE_STRING )
            // InternalDataDsl.g:3627:3: RULE_STRING
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
    // InternalDataDsl.g:3636:1: rule__Enumeration__ValuesAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Enumeration__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3640:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:3641:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:3641:2: ( RULE_STRING )
            // InternalDataDsl.g:3642:3: RULE_STRING
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


    // $ANTLR start "rule__CompositeNode__EnvironmentAssignment_0"
    // InternalDataDsl.g:3651:1: rule__CompositeNode__EnvironmentAssignment_0 : ( ( '>' ) ) ;
    public final void rule__CompositeNode__EnvironmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3655:1: ( ( ( '>' ) ) )
            // InternalDataDsl.g:3656:2: ( ( '>' ) )
            {
            // InternalDataDsl.g:3656:2: ( ( '>' ) )
            // InternalDataDsl.g:3657:3: ( '>' )
            {
             before(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_0_0()); 
            // InternalDataDsl.g:3658:3: ( '>' )
            // InternalDataDsl.g:3659:4: '>'
            {
             before(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_0_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_0_0()); 

            }

             after(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__EnvironmentAssignment_0"


    // $ANTLR start "rule__CompositeNode__NameAssignment_1"
    // InternalDataDsl.g:3670:1: rule__CompositeNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompositeNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3674:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:3675:2: ( RULE_ID )
            {
            // InternalDataDsl.g:3675:2: ( RULE_ID )
            // InternalDataDsl.g:3676:3: RULE_ID
            {
             before(grammarAccess.getCompositeNodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__NameAssignment_1"


    // $ANTLR start "rule__CompositeNode__RepresentedAsAssignment_2"
    // InternalDataDsl.g:3685:1: rule__CompositeNode__RepresentedAsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CompositeNode__RepresentedAsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3689:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:3690:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:3690:2: ( RULE_STRING )
            // InternalDataDsl.g:3691:3: RULE_STRING
            {
             before(grammarAccess.getCompositeNodeAccess().getRepresentedAsSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getRepresentedAsSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__RepresentedAsAssignment_2"


    // $ANTLR start "rule__CompositeNode__ExtendsAssignment_3_1"
    // InternalDataDsl.g:3700:1: rule__CompositeNode__ExtendsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositeNode__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3704:1: ( ( ( RULE_ID ) ) )
            // InternalDataDsl.g:3705:2: ( ( RULE_ID ) )
            {
            // InternalDataDsl.g:3705:2: ( ( RULE_ID ) )
            // InternalDataDsl.g:3706:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_1_0()); 
            // InternalDataDsl.g:3707:3: ( RULE_ID )
            // InternalDataDsl.g:3708:4: RULE_ID
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__ExtendsAssignment_3_1"


    // $ANTLR start "rule__CompositeNode__ExtendsAssignment_3_2_1"
    // InternalDataDsl.g:3719:1: rule__CompositeNode__ExtendsAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositeNode__ExtendsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3723:1: ( ( ( RULE_ID ) ) )
            // InternalDataDsl.g:3724:2: ( ( RULE_ID ) )
            {
            // InternalDataDsl.g:3724:2: ( ( RULE_ID ) )
            // InternalDataDsl.g:3725:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_2_1_0()); 
            // InternalDataDsl.g:3726:3: ( RULE_ID )
            // InternalDataDsl.g:3727:4: RULE_ID
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeIDTerminalRuleCall_3_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeIDTerminalRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__ExtendsAssignment_3_2_1"


    // $ANTLR start "rule__CompositeNode__SubnodesAssignment_5_0"
    // InternalDataDsl.g:3738:1: rule__CompositeNode__SubnodesAssignment_5_0 : ( ruleNode ) ;
    public final void rule__CompositeNode__SubnodesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3742:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3743:2: ( ruleNode )
            {
            // InternalDataDsl.g:3743:2: ( ruleNode )
            // InternalDataDsl.g:3744:3: ruleNode
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__SubnodesAssignment_5_0"


    // $ANTLR start "rule__CompositeNode__SubnodesAssignment_5_1_1"
    // InternalDataDsl.g:3753:1: rule__CompositeNode__SubnodesAssignment_5_1_1 : ( ruleNode ) ;
    public final void rule__CompositeNode__SubnodesAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3757:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3758:2: ( ruleNode )
            {
            // InternalDataDsl.g:3758:2: ( ruleNode )
            // InternalDataDsl.g:3759:3: ruleNode
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__SubnodesAssignment_5_1_1"


    // $ANTLR start "rule__CompositeNode__OptionsAssignment_7_1"
    // InternalDataDsl.g:3768:1: rule__CompositeNode__OptionsAssignment_7_1 : ( ruleOption ) ;
    public final void rule__CompositeNode__OptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3772:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3773:2: ( ruleOption )
            {
            // InternalDataDsl.g:3773:2: ( ruleOption )
            // InternalDataDsl.g:3774:3: ruleOption
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__OptionsAssignment_7_1"


    // $ANTLR start "rule__CompositeNode__OptionsAssignment_7_2_1"
    // InternalDataDsl.g:3783:1: rule__CompositeNode__OptionsAssignment_7_2_1 : ( ruleOption ) ;
    public final void rule__CompositeNode__OptionsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3787:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3788:2: ( ruleOption )
            {
            // InternalDataDsl.g:3788:2: ( ruleOption )
            // InternalDataDsl.g:3789:3: ruleOption
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__OptionsAssignment_7_2_1"


    // $ANTLR start "rule__LeafNode__UniquenessAssignment_0"
    // InternalDataDsl.g:3798:1: rule__LeafNode__UniquenessAssignment_0 : ( RULE_UNIQUENESS ) ;
    public final void rule__LeafNode__UniquenessAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3802:1: ( ( RULE_UNIQUENESS ) )
            // InternalDataDsl.g:3803:2: ( RULE_UNIQUENESS )
            {
            // InternalDataDsl.g:3803:2: ( RULE_UNIQUENESS )
            // InternalDataDsl.g:3804:3: RULE_UNIQUENESS
            {
             before(grammarAccess.getLeafNodeAccess().getUniquenessUNIQUENESSTerminalRuleCall_0_0()); 
            match(input,RULE_UNIQUENESS,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getUniquenessUNIQUENESSTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__UniquenessAssignment_0"


    // $ANTLR start "rule__LeafNode__TypeAssignment_1_0"
    // InternalDataDsl.g:3813:1: rule__LeafNode__TypeAssignment_1_0 : ( ruleBasicType ) ;
    public final void rule__LeafNode__TypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3817:1: ( ( ruleBasicType ) )
            // InternalDataDsl.g:3818:2: ( ruleBasicType )
            {
            // InternalDataDsl.g:3818:2: ( ruleBasicType )
            // InternalDataDsl.g:3819:3: ruleBasicType
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
    // InternalDataDsl.g:3828:1: rule__LeafNode__TypeCallAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__LeafNode__TypeCallAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3832:1: ( ( ( RULE_ID ) ) )
            // InternalDataDsl.g:3833:2: ( ( RULE_ID ) )
            {
            // InternalDataDsl.g:3833:2: ( ( RULE_ID ) )
            // InternalDataDsl.g:3834:3: ( RULE_ID )
            {
             before(grammarAccess.getLeafNodeAccess().getTypeCallTypeSpecificationCrossReference_1_1_0()); 
            // InternalDataDsl.g:3835:3: ( RULE_ID )
            // InternalDataDsl.g:3836:4: RULE_ID
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


    // $ANTLR start "rule__LeafNode__KeywordAssignment_2"
    // InternalDataDsl.g:3847:1: rule__LeafNode__KeywordAssignment_2 : ( ( '#' ) ) ;
    public final void rule__LeafNode__KeywordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3851:1: ( ( ( '#' ) ) )
            // InternalDataDsl.g:3852:2: ( ( '#' ) )
            {
            // InternalDataDsl.g:3852:2: ( ( '#' ) )
            // InternalDataDsl.g:3853:3: ( '#' )
            {
             before(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_2_0()); 
            // InternalDataDsl.g:3854:3: ( '#' )
            // InternalDataDsl.g:3855:4: '#'
            {
             before(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_2_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__KeywordAssignment_2"


    // $ANTLR start "rule__LeafNode__NameAssignment_3"
    // InternalDataDsl.g:3866:1: rule__LeafNode__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__LeafNode__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3870:1: ( ( RULE_ID ) )
            // InternalDataDsl.g:3871:2: ( RULE_ID )
            {
            // InternalDataDsl.g:3871:2: ( RULE_ID )
            // InternalDataDsl.g:3872:3: RULE_ID
            {
             before(grammarAccess.getLeafNodeAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__NameAssignment_3"


    // $ANTLR start "rule__LeafNode__RepresentedAsAssignment_4"
    // InternalDataDsl.g:3881:1: rule__LeafNode__RepresentedAsAssignment_4 : ( RULE_STRING ) ;
    public final void rule__LeafNode__RepresentedAsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3885:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:3886:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:3886:2: ( RULE_STRING )
            // InternalDataDsl.g:3887:3: RULE_STRING
            {
             before(grammarAccess.getLeafNodeAccess().getRepresentedAsSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getRepresentedAsSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__RepresentedAsAssignment_4"


    // $ANTLR start "rule__LeafNode__OptionsAssignment_5_1"
    // InternalDataDsl.g:3896:1: rule__LeafNode__OptionsAssignment_5_1 : ( ruleOption ) ;
    public final void rule__LeafNode__OptionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3900:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3901:2: ( ruleOption )
            {
            // InternalDataDsl.g:3901:2: ( ruleOption )
            // InternalDataDsl.g:3902:3: ruleOption
            {
             before(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__OptionsAssignment_5_1"


    // $ANTLR start "rule__LeafNode__OptionsAssignment_5_2_1"
    // InternalDataDsl.g:3911:1: rule__LeafNode__OptionsAssignment_5_2_1 : ( ruleOption ) ;
    public final void rule__LeafNode__OptionsAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3915:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3916:2: ( ruleOption )
            {
            // InternalDataDsl.g:3916:2: ( ruleOption )
            // InternalDataDsl.g:3917:3: ruleOption
            {
             before(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getLeafNodeAccess().getOptionsOptionParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__OptionsAssignment_5_2_1"


    // $ANTLR start "rule__Option__KeyAssignment_0_0"
    // InternalDataDsl.g:3926:1: rule__Option__KeyAssignment_0_0 : ( ruleOptionKey ) ;
    public final void rule__Option__KeyAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3930:1: ( ( ruleOptionKey ) )
            // InternalDataDsl.g:3931:2: ( ruleOptionKey )
            {
            // InternalDataDsl.g:3931:2: ( ruleOptionKey )
            // InternalDataDsl.g:3932:3: ruleOptionKey
            {
             before(grammarAccess.getOptionAccess().getKeyOptionKeyEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleOptionKey();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getKeyOptionKeyEnumRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__KeyAssignment_0_0"


    // $ANTLR start "rule__Option__ValueAssignment_0_2"
    // InternalDataDsl.g:3941:1: rule__Option__ValueAssignment_0_2 : ( RULE_STRING ) ;
    public final void rule__Option__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3945:1: ( ( RULE_STRING ) )
            // InternalDataDsl.g:3946:2: ( RULE_STRING )
            {
            // InternalDataDsl.g:3946:2: ( RULE_STRING )
            // InternalDataDsl.g:3947:3: RULE_STRING
            {
             before(grammarAccess.getOptionAccess().getValueSTRINGTerminalRuleCall_0_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getValueSTRINGTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__ValueAssignment_0_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000710000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000A0000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0001040003FF8140L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001000003FF8140L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007FFC000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000048000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003FF8000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000A0000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003FF8140L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000020000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});

}