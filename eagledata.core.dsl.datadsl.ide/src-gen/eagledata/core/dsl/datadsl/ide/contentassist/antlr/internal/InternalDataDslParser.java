package eagledata.core.dsl.datadsl.ide.contentassist.antlr.internal;

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
import eagledata.core.dsl.datadsl.services.DataDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CSV'", "'JSON'", "'XML'", "'string'", "'numeral'", "'date'", "'time'", "'year'", "'month'", "'day'", "'boolean'", "'place'", "'latitude'", "'longitude'", "'UTMe'", "'UTMn'", "'UTMz'", "'UTMHemi'", "'name'", "'familyname'", "'personalID'", "'{'", "'}'", "'import'", "','", "'description'", "'='", "'uses'", "'['", "']'", "'fragment'", "')'", "'extends'", "'('", "'ref:'", "'-'", "'>'", "'key'", "'unique'", "'#'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


    // $ANTLR start "entryRuleFormatSpecification"
    // InternalDataDsl.g:153:1: entryRuleFormatSpecification : ruleFormatSpecification EOF ;
    public final void entryRuleFormatSpecification() throws RecognitionException {
        try {
            // InternalDataDsl.g:154:1: ( ruleFormatSpecification EOF )
            // InternalDataDsl.g:155:1: ruleFormatSpecification EOF
            {
             before(grammarAccess.getFormatSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleFormatSpecification();

            state._fsp--;

             after(grammarAccess.getFormatSpecificationRule()); 
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
    // $ANTLR end "entryRuleFormatSpecification"


    // $ANTLR start "ruleFormatSpecification"
    // InternalDataDsl.g:162:1: ruleFormatSpecification : ( ( rule__FormatSpecification__Alternatives ) ) ;
    public final void ruleFormatSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:166:2: ( ( ( rule__FormatSpecification__Alternatives ) ) )
            // InternalDataDsl.g:167:2: ( ( rule__FormatSpecification__Alternatives ) )
            {
            // InternalDataDsl.g:167:2: ( ( rule__FormatSpecification__Alternatives ) )
            // InternalDataDsl.g:168:3: ( rule__FormatSpecification__Alternatives )
            {
             before(grammarAccess.getFormatSpecificationAccess().getAlternatives()); 
            // InternalDataDsl.g:169:3: ( rule__FormatSpecification__Alternatives )
            // InternalDataDsl.g:169:4: rule__FormatSpecification__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormatSpecification__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormatSpecificationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormatSpecification"


    // $ANTLR start "entryRuleOption"
    // InternalDataDsl.g:178:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalDataDsl.g:179:1: ( ruleOption EOF )
            // InternalDataDsl.g:180:1: ruleOption EOF
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
    // InternalDataDsl.g:187:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:191:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalDataDsl.g:192:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalDataDsl.g:192:2: ( ( rule__Option__Group__0 ) )
            // InternalDataDsl.g:193:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalDataDsl.g:194:3: ( rule__Option__Group__0 )
            // InternalDataDsl.g:194:4: rule__Option__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleNode"
    // InternalDataDsl.g:203:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:204:1: ( ruleNode EOF )
            // InternalDataDsl.g:205:1: ruleNode EOF
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
    // InternalDataDsl.g:212:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:216:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalDataDsl.g:217:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalDataDsl.g:217:2: ( ( rule__Node__Alternatives ) )
            // InternalDataDsl.g:218:3: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalDataDsl.g:219:3: ( rule__Node__Alternatives )
            // InternalDataDsl.g:219:4: rule__Node__Alternatives
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
    // InternalDataDsl.g:228:1: entryRuleCompositeNode : ruleCompositeNode EOF ;
    public final void entryRuleCompositeNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:229:1: ( ruleCompositeNode EOF )
            // InternalDataDsl.g:230:1: ruleCompositeNode EOF
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
    // InternalDataDsl.g:237:1: ruleCompositeNode : ( ( rule__CompositeNode__Group__0 ) ) ;
    public final void ruleCompositeNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:241:2: ( ( ( rule__CompositeNode__Group__0 ) ) )
            // InternalDataDsl.g:242:2: ( ( rule__CompositeNode__Group__0 ) )
            {
            // InternalDataDsl.g:242:2: ( ( rule__CompositeNode__Group__0 ) )
            // InternalDataDsl.g:243:3: ( rule__CompositeNode__Group__0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup()); 
            // InternalDataDsl.g:244:3: ( rule__CompositeNode__Group__0 )
            // InternalDataDsl.g:244:4: rule__CompositeNode__Group__0
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
    // InternalDataDsl.g:253:1: entryRuleLeafNode : ruleLeafNode EOF ;
    public final void entryRuleLeafNode() throws RecognitionException {
        try {
            // InternalDataDsl.g:254:1: ( ruleLeafNode EOF )
            // InternalDataDsl.g:255:1: ruleLeafNode EOF
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
    // InternalDataDsl.g:262:1: ruleLeafNode : ( ( rule__LeafNode__Group__0 ) ) ;
    public final void ruleLeafNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:266:2: ( ( ( rule__LeafNode__Group__0 ) ) )
            // InternalDataDsl.g:267:2: ( ( rule__LeafNode__Group__0 ) )
            {
            // InternalDataDsl.g:267:2: ( ( rule__LeafNode__Group__0 ) )
            // InternalDataDsl.g:268:3: ( rule__LeafNode__Group__0 )
            {
             before(grammarAccess.getLeafNodeAccess().getGroup()); 
            // InternalDataDsl.g:269:3: ( rule__LeafNode__Group__0 )
            // InternalDataDsl.g:269:4: rule__LeafNode__Group__0
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


    // $ANTLR start "entryRuleTypeSpecification"
    // InternalDataDsl.g:278:1: entryRuleTypeSpecification : ruleTypeSpecification EOF ;
    public final void entryRuleTypeSpecification() throws RecognitionException {
        try {
            // InternalDataDsl.g:279:1: ( ruleTypeSpecification EOF )
            // InternalDataDsl.g:280:1: ruleTypeSpecification EOF
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
    // InternalDataDsl.g:287:1: ruleTypeSpecification : ( ( rule__TypeSpecification__Alternatives ) ) ;
    public final void ruleTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:291:2: ( ( ( rule__TypeSpecification__Alternatives ) ) )
            // InternalDataDsl.g:292:2: ( ( rule__TypeSpecification__Alternatives ) )
            {
            // InternalDataDsl.g:292:2: ( ( rule__TypeSpecification__Alternatives ) )
            // InternalDataDsl.g:293:3: ( rule__TypeSpecification__Alternatives )
            {
             before(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            // InternalDataDsl.g:294:3: ( rule__TypeSpecification__Alternatives )
            // InternalDataDsl.g:294:4: rule__TypeSpecification__Alternatives
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
    // InternalDataDsl.g:303:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDataDsl.g:304:1: ( ruleDataType EOF )
            // InternalDataDsl.g:305:1: ruleDataType EOF
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
    // InternalDataDsl.g:312:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:316:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDataDsl.g:317:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDataDsl.g:317:2: ( ( rule__DataType__Group__0 ) )
            // InternalDataDsl.g:318:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDataDsl.g:319:3: ( rule__DataType__Group__0 )
            // InternalDataDsl.g:319:4: rule__DataType__Group__0
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


    // $ANTLR start "entryRuleReference"
    // InternalDataDsl.g:328:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalDataDsl.g:329:1: ( ruleReference EOF )
            // InternalDataDsl.g:330:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDataDsl.g:337:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:341:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalDataDsl.g:342:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalDataDsl.g:342:2: ( ( rule__Reference__Group__0 ) )
            // InternalDataDsl.g:343:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalDataDsl.g:344:3: ( rule__Reference__Group__0 )
            // InternalDataDsl.g:344:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEString"
    // InternalDataDsl.g:353:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDataDsl.g:354:1: ( ruleEString EOF )
            // InternalDataDsl.g:355:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDataDsl.g:362:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:366:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDataDsl.g:367:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDataDsl.g:367:2: ( ( rule__EString__Alternatives ) )
            // InternalDataDsl.g:368:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDataDsl.g:369:3: ( rule__EString__Alternatives )
            // InternalDataDsl.g:369:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // InternalDataDsl.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDataDsl.g:379:1: ( ruleEInt EOF )
            // InternalDataDsl.g:380:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDataDsl.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDataDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDataDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalDataDsl.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDataDsl.g:394:3: ( rule__EInt__Group__0 )
            // InternalDataDsl.g:394:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleFormatKind"
    // InternalDataDsl.g:403:1: ruleFormatKind : ( ( rule__FormatKind__Alternatives ) ) ;
    public final void ruleFormatKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:407:1: ( ( ( rule__FormatKind__Alternatives ) ) )
            // InternalDataDsl.g:408:2: ( ( rule__FormatKind__Alternatives ) )
            {
            // InternalDataDsl.g:408:2: ( ( rule__FormatKind__Alternatives ) )
            // InternalDataDsl.g:409:3: ( rule__FormatKind__Alternatives )
            {
             before(grammarAccess.getFormatKindAccess().getAlternatives()); 
            // InternalDataDsl.g:410:3: ( rule__FormatKind__Alternatives )
            // InternalDataDsl.g:410:4: rule__FormatKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FormatKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormatKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormatKind"


    // $ANTLR start "ruleTypeKind"
    // InternalDataDsl.g:419:1: ruleTypeKind : ( ( rule__TypeKind__Alternatives ) ) ;
    public final void ruleTypeKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:423:1: ( ( ( rule__TypeKind__Alternatives ) ) )
            // InternalDataDsl.g:424:2: ( ( rule__TypeKind__Alternatives ) )
            {
            // InternalDataDsl.g:424:2: ( ( rule__TypeKind__Alternatives ) )
            // InternalDataDsl.g:425:3: ( rule__TypeKind__Alternatives )
            {
             before(grammarAccess.getTypeKindAccess().getAlternatives()); 
            // InternalDataDsl.g:426:3: ( rule__TypeKind__Alternatives )
            // InternalDataDsl.g:426:4: rule__TypeKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeKind"


    // $ANTLR start "rule__DataDescription__Alternatives"
    // InternalDataDsl.g:434:1: rule__DataDescription__Alternatives : ( ( ruleDataSource ) | ( ruleDataFragment ) );
    public final void rule__DataDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:438:1: ( ( ruleDataSource ) | ( ruleDataFragment ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==41) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDataDsl.g:439:2: ( ruleDataSource )
                    {
                    // InternalDataDsl.g:439:2: ( ruleDataSource )
                    // InternalDataDsl.g:440:3: ruleDataSource
                    {
                     before(grammarAccess.getDataDescriptionAccess().getDataSourceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataSource();

                    state._fsp--;

                     after(grammarAccess.getDataDescriptionAccess().getDataSourceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:445:2: ( ruleDataFragment )
                    {
                    // InternalDataDsl.g:445:2: ( ruleDataFragment )
                    // InternalDataDsl.g:446:3: ruleDataFragment
                    {
                     before(grammarAccess.getDataDescriptionAccess().getDataFragmentParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataFragment();

                    state._fsp--;

                     after(grammarAccess.getDataDescriptionAccess().getDataFragmentParserRuleCall_1()); 

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


    // $ANTLR start "rule__FormatSpecification__Alternatives"
    // InternalDataDsl.g:455:1: rule__FormatSpecification__Alternatives : ( ( ( rule__FormatSpecification__SpecialFormatAssignment_0 ) ) | ( ( rule__FormatSpecification__FormatAssignment_1 ) ) );
    public final void rule__FormatSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:459:1: ( ( ( rule__FormatSpecification__SpecialFormatAssignment_0 ) ) | ( ( rule__FormatSpecification__FormatAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalDataDsl.g:460:2: ( ( rule__FormatSpecification__SpecialFormatAssignment_0 ) )
                    {
                    // InternalDataDsl.g:460:2: ( ( rule__FormatSpecification__SpecialFormatAssignment_0 ) )
                    // InternalDataDsl.g:461:3: ( rule__FormatSpecification__SpecialFormatAssignment_0 )
                    {
                     before(grammarAccess.getFormatSpecificationAccess().getSpecialFormatAssignment_0()); 
                    // InternalDataDsl.g:462:3: ( rule__FormatSpecification__SpecialFormatAssignment_0 )
                    // InternalDataDsl.g:462:4: rule__FormatSpecification__SpecialFormatAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormatSpecification__SpecialFormatAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatSpecificationAccess().getSpecialFormatAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:466:2: ( ( rule__FormatSpecification__FormatAssignment_1 ) )
                    {
                    // InternalDataDsl.g:466:2: ( ( rule__FormatSpecification__FormatAssignment_1 ) )
                    // InternalDataDsl.g:467:3: ( rule__FormatSpecification__FormatAssignment_1 )
                    {
                     before(grammarAccess.getFormatSpecificationAccess().getFormatAssignment_1()); 
                    // InternalDataDsl.g:468:3: ( rule__FormatSpecification__FormatAssignment_1 )
                    // InternalDataDsl.g:468:4: rule__FormatSpecification__FormatAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FormatSpecification__FormatAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormatSpecificationAccess().getFormatAssignment_1()); 

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
    // $ANTLR end "rule__FormatSpecification__Alternatives"


    // $ANTLR start "rule__Node__Alternatives"
    // InternalDataDsl.g:476:1: rule__Node__Alternatives : ( ( ruleCompositeNode ) | ( ruleLeafNode ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:480:1: ( ( ruleCompositeNode ) | ( ruleLeafNode ) )
            int alt3=2;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==37||LA3_5==43) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==EOF||(LA3_5>=RULE_STRING && LA3_5<=RULE_ID)||LA3_5==33||LA3_5==35||LA3_5==42) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==EOF||(LA3_6>=RULE_STRING && LA3_6<=RULE_ID)||LA3_6==33||LA3_6==35||LA3_6==42) ) {
                        alt3=2;
                    }
                    else if ( (LA3_6==37||LA3_6==43) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 37:
                case 43:
                    {
                    alt3=1;
                    }
                    break;
                case 39:
                case 50:
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
                break;
            case RULE_ID:
                {
                switch ( input.LA(2) ) {
                case RULE_STRING:
                    {
                    int LA3_5 = input.LA(3);

                    if ( (LA3_5==37||LA3_5==43) ) {
                        alt3=1;
                    }
                    else if ( (LA3_5==EOF||(LA3_5>=RULE_STRING && LA3_5<=RULE_ID)||LA3_5==33||LA3_5==35||LA3_5==42) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA3_6 = input.LA(3);

                    if ( (LA3_6==EOF||(LA3_6>=RULE_STRING && LA3_6<=RULE_ID)||LA3_6==33||LA3_6==35||LA3_6==42) ) {
                        alt3=2;
                    }
                    else if ( (LA3_6==37||LA3_6==43) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case 37:
                case 43:
                    {
                    alt3=1;
                    }
                    break;
                case 39:
                case 50:
                    {
                    alt3=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }

                }
                break;
            case 14:
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
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 45:
            case 48:
            case 49:
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
                    // InternalDataDsl.g:481:2: ( ruleCompositeNode )
                    {
                    // InternalDataDsl.g:481:2: ( ruleCompositeNode )
                    // InternalDataDsl.g:482:3: ruleCompositeNode
                    {
                     before(grammarAccess.getNodeAccess().getCompositeNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getCompositeNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:487:2: ( ruleLeafNode )
                    {
                    // InternalDataDsl.g:487:2: ( ruleLeafNode )
                    // InternalDataDsl.g:488:3: ruleLeafNode
                    {
                     before(grammarAccess.getNodeAccess().getLeafNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLeafNode();

                    state._fsp--;

                     after(grammarAccess.getNodeAccess().getLeafNodeParserRuleCall_1()); 

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


    // $ANTLR start "rule__TypeSpecification__Alternatives"
    // InternalDataDsl.g:497:1: rule__TypeSpecification__Alternatives : ( ( ruleDataType ) | ( ruleReference ) );
    public final void rule__TypeSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:501:1: ( ( ruleDataType ) | ( ruleReference ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)||(LA4_0>=14 && LA4_0<=31)) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataDsl.g:502:2: ( ruleDataType )
                    {
                    // InternalDataDsl.g:502:2: ( ruleDataType )
                    // InternalDataDsl.g:503:3: ruleDataType
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
                    // InternalDataDsl.g:508:2: ( ruleReference )
                    {
                    // InternalDataDsl.g:508:2: ( ruleReference )
                    // InternalDataDsl.g:509:3: ruleReference
                    {
                     before(grammarAccess.getTypeSpecificationAccess().getReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleReference();

                    state._fsp--;

                     after(grammarAccess.getTypeSpecificationAccess().getReferenceParserRuleCall_1()); 

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


    // $ANTLR start "rule__DataType__Alternatives_1"
    // InternalDataDsl.g:518:1: rule__DataType__Alternatives_1 : ( ( ( rule__DataType__SpecialTypeAssignment_1_0 ) ) | ( ( rule__DataType__TypeAssignment_1_1 ) ) );
    public final void rule__DataType__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:522:1: ( ( ( rule__DataType__SpecialTypeAssignment_1_0 ) ) | ( ( rule__DataType__TypeAssignment_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=14 && LA5_0<=31)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDataDsl.g:523:2: ( ( rule__DataType__SpecialTypeAssignment_1_0 ) )
                    {
                    // InternalDataDsl.g:523:2: ( ( rule__DataType__SpecialTypeAssignment_1_0 ) )
                    // InternalDataDsl.g:524:3: ( rule__DataType__SpecialTypeAssignment_1_0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getSpecialTypeAssignment_1_0()); 
                    // InternalDataDsl.g:525:3: ( rule__DataType__SpecialTypeAssignment_1_0 )
                    // InternalDataDsl.g:525:4: rule__DataType__SpecialTypeAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__SpecialTypeAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getSpecialTypeAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:529:2: ( ( rule__DataType__TypeAssignment_1_1 ) )
                    {
                    // InternalDataDsl.g:529:2: ( ( rule__DataType__TypeAssignment_1_1 ) )
                    // InternalDataDsl.g:530:3: ( rule__DataType__TypeAssignment_1_1 )
                    {
                     before(grammarAccess.getDataTypeAccess().getTypeAssignment_1_1()); 
                    // InternalDataDsl.g:531:3: ( rule__DataType__TypeAssignment_1_1 )
                    // InternalDataDsl.g:531:4: rule__DataType__TypeAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__TypeAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getTypeAssignment_1_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives_1"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDataDsl.g:539:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:543:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
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
                    // InternalDataDsl.g:544:2: ( RULE_STRING )
                    {
                    // InternalDataDsl.g:544:2: ( RULE_STRING )
                    // InternalDataDsl.g:545:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:550:2: ( RULE_ID )
                    {
                    // InternalDataDsl.g:550:2: ( RULE_ID )
                    // InternalDataDsl.g:551:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__FormatKind__Alternatives"
    // InternalDataDsl.g:560:1: rule__FormatKind__Alternatives : ( ( ( 'CSV' ) ) | ( ( 'JSON' ) ) | ( ( 'XML' ) ) );
    public final void rule__FormatKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:564:1: ( ( ( 'CSV' ) ) | ( ( 'JSON' ) ) | ( ( 'XML' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt7=1;
                }
                break;
            case 12:
                {
                alt7=2;
                }
                break;
            case 13:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDataDsl.g:565:2: ( ( 'CSV' ) )
                    {
                    // InternalDataDsl.g:565:2: ( ( 'CSV' ) )
                    // InternalDataDsl.g:566:3: ( 'CSV' )
                    {
                     before(grammarAccess.getFormatKindAccess().getCSVEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:567:3: ( 'CSV' )
                    // InternalDataDsl.g:567:4: 'CSV'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatKindAccess().getCSVEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:571:2: ( ( 'JSON' ) )
                    {
                    // InternalDataDsl.g:571:2: ( ( 'JSON' ) )
                    // InternalDataDsl.g:572:3: ( 'JSON' )
                    {
                     before(grammarAccess.getFormatKindAccess().getJSONEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:573:3: ( 'JSON' )
                    // InternalDataDsl.g:573:4: 'JSON'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatKindAccess().getJSONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:577:2: ( ( 'XML' ) )
                    {
                    // InternalDataDsl.g:577:2: ( ( 'XML' ) )
                    // InternalDataDsl.g:578:3: ( 'XML' )
                    {
                     before(grammarAccess.getFormatKindAccess().getXMLEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:579:3: ( 'XML' )
                    // InternalDataDsl.g:579:4: 'XML'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatKindAccess().getXMLEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__FormatKind__Alternatives"


    // $ANTLR start "rule__TypeKind__Alternatives"
    // InternalDataDsl.g:587:1: rule__TypeKind__Alternatives : ( ( ( 'string' ) ) | ( ( 'numeral' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'year' ) ) | ( ( 'month' ) ) | ( ( 'day' ) ) | ( ( 'boolean' ) ) | ( ( 'place' ) ) | ( ( 'latitude' ) ) | ( ( 'longitude' ) ) | ( ( 'UTMe' ) ) | ( ( 'UTMn' ) ) | ( ( 'UTMz' ) ) | ( ( 'UTMHemi' ) ) | ( ( 'name' ) ) | ( ( 'familyname' ) ) | ( ( 'personalID' ) ) );
    public final void rule__TypeKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:591:1: ( ( ( 'string' ) ) | ( ( 'numeral' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'year' ) ) | ( ( 'month' ) ) | ( ( 'day' ) ) | ( ( 'boolean' ) ) | ( ( 'place' ) ) | ( ( 'latitude' ) ) | ( ( 'longitude' ) ) | ( ( 'UTMe' ) ) | ( ( 'UTMn' ) ) | ( ( 'UTMz' ) ) | ( ( 'UTMHemi' ) ) | ( ( 'name' ) ) | ( ( 'familyname' ) ) | ( ( 'personalID' ) ) )
            int alt8=18;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt8=1;
                }
                break;
            case 15:
                {
                alt8=2;
                }
                break;
            case 16:
                {
                alt8=3;
                }
                break;
            case 17:
                {
                alt8=4;
                }
                break;
            case 18:
                {
                alt8=5;
                }
                break;
            case 19:
                {
                alt8=6;
                }
                break;
            case 20:
                {
                alt8=7;
                }
                break;
            case 21:
                {
                alt8=8;
                }
                break;
            case 22:
                {
                alt8=9;
                }
                break;
            case 23:
                {
                alt8=10;
                }
                break;
            case 24:
                {
                alt8=11;
                }
                break;
            case 25:
                {
                alt8=12;
                }
                break;
            case 26:
                {
                alt8=13;
                }
                break;
            case 27:
                {
                alt8=14;
                }
                break;
            case 28:
                {
                alt8=15;
                }
                break;
            case 29:
                {
                alt8=16;
                }
                break;
            case 30:
                {
                alt8=17;
                }
                break;
            case 31:
                {
                alt8=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDataDsl.g:592:2: ( ( 'string' ) )
                    {
                    // InternalDataDsl.g:592:2: ( ( 'string' ) )
                    // InternalDataDsl.g:593:3: ( 'string' )
                    {
                     before(grammarAccess.getTypeKindAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalDataDsl.g:594:3: ( 'string' )
                    // InternalDataDsl.g:594:4: 'string'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDsl.g:598:2: ( ( 'numeral' ) )
                    {
                    // InternalDataDsl.g:598:2: ( ( 'numeral' ) )
                    // InternalDataDsl.g:599:3: ( 'numeral' )
                    {
                     before(grammarAccess.getTypeKindAccess().getNumeralEnumLiteralDeclaration_1()); 
                    // InternalDataDsl.g:600:3: ( 'numeral' )
                    // InternalDataDsl.g:600:4: 'numeral'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getNumeralEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDsl.g:604:2: ( ( 'date' ) )
                    {
                    // InternalDataDsl.g:604:2: ( ( 'date' ) )
                    // InternalDataDsl.g:605:3: ( 'date' )
                    {
                     before(grammarAccess.getTypeKindAccess().getDateEnumLiteralDeclaration_2()); 
                    // InternalDataDsl.g:606:3: ( 'date' )
                    // InternalDataDsl.g:606:4: 'date'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getDateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDsl.g:610:2: ( ( 'time' ) )
                    {
                    // InternalDataDsl.g:610:2: ( ( 'time' ) )
                    // InternalDataDsl.g:611:3: ( 'time' )
                    {
                     before(grammarAccess.getTypeKindAccess().getTimeEnumLiteralDeclaration_3()); 
                    // InternalDataDsl.g:612:3: ( 'time' )
                    // InternalDataDsl.g:612:4: 'time'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getTimeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDsl.g:616:2: ( ( 'year' ) )
                    {
                    // InternalDataDsl.g:616:2: ( ( 'year' ) )
                    // InternalDataDsl.g:617:3: ( 'year' )
                    {
                     before(grammarAccess.getTypeKindAccess().getYearEnumLiteralDeclaration_4()); 
                    // InternalDataDsl.g:618:3: ( 'year' )
                    // InternalDataDsl.g:618:4: 'year'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getYearEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDsl.g:622:2: ( ( 'month' ) )
                    {
                    // InternalDataDsl.g:622:2: ( ( 'month' ) )
                    // InternalDataDsl.g:623:3: ( 'month' )
                    {
                     before(grammarAccess.getTypeKindAccess().getMonthEnumLiteralDeclaration_5()); 
                    // InternalDataDsl.g:624:3: ( 'month' )
                    // InternalDataDsl.g:624:4: 'month'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getMonthEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDsl.g:628:2: ( ( 'day' ) )
                    {
                    // InternalDataDsl.g:628:2: ( ( 'day' ) )
                    // InternalDataDsl.g:629:3: ( 'day' )
                    {
                     before(grammarAccess.getTypeKindAccess().getDayEnumLiteralDeclaration_6()); 
                    // InternalDataDsl.g:630:3: ( 'day' )
                    // InternalDataDsl.g:630:4: 'day'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getDayEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDsl.g:634:2: ( ( 'boolean' ) )
                    {
                    // InternalDataDsl.g:634:2: ( ( 'boolean' ) )
                    // InternalDataDsl.g:635:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeKindAccess().getBooleanEnumLiteralDeclaration_7()); 
                    // InternalDataDsl.g:636:3: ( 'boolean' )
                    // InternalDataDsl.g:636:4: 'boolean'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getBooleanEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDsl.g:640:2: ( ( 'place' ) )
                    {
                    // InternalDataDsl.g:640:2: ( ( 'place' ) )
                    // InternalDataDsl.g:641:3: ( 'place' )
                    {
                     before(grammarAccess.getTypeKindAccess().getPlaceEnumLiteralDeclaration_8()); 
                    // InternalDataDsl.g:642:3: ( 'place' )
                    // InternalDataDsl.g:642:4: 'place'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getPlaceEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDsl.g:646:2: ( ( 'latitude' ) )
                    {
                    // InternalDataDsl.g:646:2: ( ( 'latitude' ) )
                    // InternalDataDsl.g:647:3: ( 'latitude' )
                    {
                     before(grammarAccess.getTypeKindAccess().getLatitudeEnumLiteralDeclaration_9()); 
                    // InternalDataDsl.g:648:3: ( 'latitude' )
                    // InternalDataDsl.g:648:4: 'latitude'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getLatitudeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDsl.g:652:2: ( ( 'longitude' ) )
                    {
                    // InternalDataDsl.g:652:2: ( ( 'longitude' ) )
                    // InternalDataDsl.g:653:3: ( 'longitude' )
                    {
                     before(grammarAccess.getTypeKindAccess().getLongitudeEnumLiteralDeclaration_10()); 
                    // InternalDataDsl.g:654:3: ( 'longitude' )
                    // InternalDataDsl.g:654:4: 'longitude'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getLongitudeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDsl.g:658:2: ( ( 'UTMe' ) )
                    {
                    // InternalDataDsl.g:658:2: ( ( 'UTMe' ) )
                    // InternalDataDsl.g:659:3: ( 'UTMe' )
                    {
                     before(grammarAccess.getTypeKindAccess().getUTMeEnumLiteralDeclaration_11()); 
                    // InternalDataDsl.g:660:3: ( 'UTMe' )
                    // InternalDataDsl.g:660:4: 'UTMe'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getUTMeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDataDsl.g:664:2: ( ( 'UTMn' ) )
                    {
                    // InternalDataDsl.g:664:2: ( ( 'UTMn' ) )
                    // InternalDataDsl.g:665:3: ( 'UTMn' )
                    {
                     before(grammarAccess.getTypeKindAccess().getUTMnEnumLiteralDeclaration_12()); 
                    // InternalDataDsl.g:666:3: ( 'UTMn' )
                    // InternalDataDsl.g:666:4: 'UTMn'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getUTMnEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDataDsl.g:670:2: ( ( 'UTMz' ) )
                    {
                    // InternalDataDsl.g:670:2: ( ( 'UTMz' ) )
                    // InternalDataDsl.g:671:3: ( 'UTMz' )
                    {
                     before(grammarAccess.getTypeKindAccess().getUTMzEnumLiteralDeclaration_13()); 
                    // InternalDataDsl.g:672:3: ( 'UTMz' )
                    // InternalDataDsl.g:672:4: 'UTMz'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getUTMzEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDataDsl.g:676:2: ( ( 'UTMHemi' ) )
                    {
                    // InternalDataDsl.g:676:2: ( ( 'UTMHemi' ) )
                    // InternalDataDsl.g:677:3: ( 'UTMHemi' )
                    {
                     before(grammarAccess.getTypeKindAccess().getUTMHemiEnumLiteralDeclaration_14()); 
                    // InternalDataDsl.g:678:3: ( 'UTMHemi' )
                    // InternalDataDsl.g:678:4: 'UTMHemi'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getUTMHemiEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDataDsl.g:682:2: ( ( 'name' ) )
                    {
                    // InternalDataDsl.g:682:2: ( ( 'name' ) )
                    // InternalDataDsl.g:683:3: ( 'name' )
                    {
                     before(grammarAccess.getTypeKindAccess().getNameEnumLiteralDeclaration_15()); 
                    // InternalDataDsl.g:684:3: ( 'name' )
                    // InternalDataDsl.g:684:4: 'name'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getNameEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDataDsl.g:688:2: ( ( 'familyname' ) )
                    {
                    // InternalDataDsl.g:688:2: ( ( 'familyname' ) )
                    // InternalDataDsl.g:689:3: ( 'familyname' )
                    {
                     before(grammarAccess.getTypeKindAccess().getFamilynameEnumLiteralDeclaration_16()); 
                    // InternalDataDsl.g:690:3: ( 'familyname' )
                    // InternalDataDsl.g:690:4: 'familyname'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getFamilynameEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDataDsl.g:694:2: ( ( 'personalID' ) )
                    {
                    // InternalDataDsl.g:694:2: ( ( 'personalID' ) )
                    // InternalDataDsl.g:695:3: ( 'personalID' )
                    {
                     before(grammarAccess.getTypeKindAccess().getPersonalIDEnumLiteralDeclaration_17()); 
                    // InternalDataDsl.g:696:3: ( 'personalID' )
                    // InternalDataDsl.g:696:4: 'personalID'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getPersonalIDEnumLiteralDeclaration_17()); 

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
    // $ANTLR end "rule__TypeKind__Alternatives"


    // $ANTLR start "rule__DataModel__Group__0"
    // InternalDataDsl.g:704:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:708:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalDataDsl.g:709:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
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
    // InternalDataDsl.g:716:1: rule__DataModel__Group__0__Impl : ( () ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:720:1: ( ( () ) )
            // InternalDataDsl.g:721:1: ( () )
            {
            // InternalDataDsl.g:721:1: ( () )
            // InternalDataDsl.g:722:2: ()
            {
             before(grammarAccess.getDataModelAccess().getDataModelAction_0()); 
            // InternalDataDsl.g:723:2: ()
            // InternalDataDsl.g:723:3: 
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
    // InternalDataDsl.g:731:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:735:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // InternalDataDsl.g:736:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
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
    // InternalDataDsl.g:743:1: rule__DataModel__Group__1__Impl : ( ( rule__DataModel__Group_1__0 )? ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:747:1: ( ( ( rule__DataModel__Group_1__0 )? ) )
            // InternalDataDsl.g:748:1: ( ( rule__DataModel__Group_1__0 )? )
            {
            // InternalDataDsl.g:748:1: ( ( rule__DataModel__Group_1__0 )? )
            // InternalDataDsl.g:749:2: ( rule__DataModel__Group_1__0 )?
            {
             before(grammarAccess.getDataModelAccess().getGroup_1()); 
            // InternalDataDsl.g:750:2: ( rule__DataModel__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDataDsl.g:750:3: rule__DataModel__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataModel__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

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


    // $ANTLR start "rule__DataModel__Group__2"
    // InternalDataDsl.g:758:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:762:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // InternalDataDsl.g:763:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DataModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__3();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:770:1: rule__DataModel__Group__2__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:774:1: ( ( '{' ) )
            // InternalDataDsl.g:775:1: ( '{' )
            {
            // InternalDataDsl.g:775:1: ( '{' )
            // InternalDataDsl.g:776:2: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataModel__Group__3"
    // InternalDataDsl.g:785:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:789:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // InternalDataDsl.g:790:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3"


    // $ANTLR start "rule__DataModel__Group__3__Impl"
    // InternalDataDsl.g:797:1: rule__DataModel__Group__3__Impl : ( ( rule__DataModel__DescriptionsAssignment_3 ) ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:801:1: ( ( ( rule__DataModel__DescriptionsAssignment_3 ) ) )
            // InternalDataDsl.g:802:1: ( ( rule__DataModel__DescriptionsAssignment_3 ) )
            {
            // InternalDataDsl.g:802:1: ( ( rule__DataModel__DescriptionsAssignment_3 ) )
            // InternalDataDsl.g:803:2: ( rule__DataModel__DescriptionsAssignment_3 )
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsAssignment_3()); 
            // InternalDataDsl.g:804:2: ( rule__DataModel__DescriptionsAssignment_3 )
            // InternalDataDsl.g:804:3: rule__DataModel__DescriptionsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__DescriptionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getDescriptionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__3__Impl"


    // $ANTLR start "rule__DataModel__Group__4"
    // InternalDataDsl.g:812:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl rule__DataModel__Group__5 ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:816:1: ( rule__DataModel__Group__4__Impl rule__DataModel__Group__5 )
            // InternalDataDsl.g:817:2: rule__DataModel__Group__4__Impl rule__DataModel__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__DataModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4"


    // $ANTLR start "rule__DataModel__Group__4__Impl"
    // InternalDataDsl.g:824:1: rule__DataModel__Group__4__Impl : ( ( rule__DataModel__Group_4__0 )* ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:828:1: ( ( ( rule__DataModel__Group_4__0 )* ) )
            // InternalDataDsl.g:829:1: ( ( rule__DataModel__Group_4__0 )* )
            {
            // InternalDataDsl.g:829:1: ( ( rule__DataModel__Group_4__0 )* )
            // InternalDataDsl.g:830:2: ( rule__DataModel__Group_4__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_4()); 
            // InternalDataDsl.g:831:2: ( rule__DataModel__Group_4__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDataDsl.g:831:3: rule__DataModel__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataModel__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__4__Impl"


    // $ANTLR start "rule__DataModel__Group__5"
    // InternalDataDsl.g:839:1: rule__DataModel__Group__5 : rule__DataModel__Group__5__Impl ;
    public final void rule__DataModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:843:1: ( rule__DataModel__Group__5__Impl )
            // InternalDataDsl.g:844:2: rule__DataModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__5"


    // $ANTLR start "rule__DataModel__Group__5__Impl"
    // InternalDataDsl.g:850:1: rule__DataModel__Group__5__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:854:1: ( ( '}' ) )
            // InternalDataDsl.g:855:1: ( '}' )
            {
            // InternalDataDsl.g:855:1: ( '}' )
            // InternalDataDsl.g:856:2: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group__5__Impl"


    // $ANTLR start "rule__DataModel__Group_1__0"
    // InternalDataDsl.g:866:1: rule__DataModel__Group_1__0 : rule__DataModel__Group_1__0__Impl rule__DataModel__Group_1__1 ;
    public final void rule__DataModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:870:1: ( rule__DataModel__Group_1__0__Impl rule__DataModel__Group_1__1 )
            // InternalDataDsl.g:871:2: rule__DataModel__Group_1__0__Impl rule__DataModel__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDsl.g:878:1: rule__DataModel__Group_1__0__Impl : ( 'import' ) ;
    public final void rule__DataModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:882:1: ( ( 'import' ) )
            // InternalDataDsl.g:883:1: ( 'import' )
            {
            // InternalDataDsl.g:883:1: ( 'import' )
            // InternalDataDsl.g:884:2: 'import'
            {
             before(grammarAccess.getDataModelAccess().getImportKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getImportKeyword_1_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:893:1: rule__DataModel__Group_1__1 : rule__DataModel__Group_1__1__Impl rule__DataModel__Group_1__2 ;
    public final void rule__DataModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:897:1: ( rule__DataModel__Group_1__1__Impl rule__DataModel__Group_1__2 )
            // InternalDataDsl.g:898:2: rule__DataModel__Group_1__1__Impl rule__DataModel__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__DataModel__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:905:1: rule__DataModel__Group_1__1__Impl : ( ( rule__DataModel__ImportURIAssignment_1_1 ) ) ;
    public final void rule__DataModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:909:1: ( ( ( rule__DataModel__ImportURIAssignment_1_1 ) ) )
            // InternalDataDsl.g:910:1: ( ( rule__DataModel__ImportURIAssignment_1_1 ) )
            {
            // InternalDataDsl.g:910:1: ( ( rule__DataModel__ImportURIAssignment_1_1 ) )
            // InternalDataDsl.g:911:2: ( rule__DataModel__ImportURIAssignment_1_1 )
            {
             before(grammarAccess.getDataModelAccess().getImportURIAssignment_1_1()); 
            // InternalDataDsl.g:912:2: ( rule__DataModel__ImportURIAssignment_1_1 )
            // InternalDataDsl.g:912:3: rule__DataModel__ImportURIAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__ImportURIAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getImportURIAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataModel__Group_1__2"
    // InternalDataDsl.g:920:1: rule__DataModel__Group_1__2 : rule__DataModel__Group_1__2__Impl ;
    public final void rule__DataModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:924:1: ( rule__DataModel__Group_1__2__Impl )
            // InternalDataDsl.g:925:2: rule__DataModel__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1__2"


    // $ANTLR start "rule__DataModel__Group_1__2__Impl"
    // InternalDataDsl.g:931:1: rule__DataModel__Group_1__2__Impl : ( ( rule__DataModel__Group_1_2__0 )* ) ;
    public final void rule__DataModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:935:1: ( ( ( rule__DataModel__Group_1_2__0 )* ) )
            // InternalDataDsl.g:936:1: ( ( rule__DataModel__Group_1_2__0 )* )
            {
            // InternalDataDsl.g:936:1: ( ( rule__DataModel__Group_1_2__0 )* )
            // InternalDataDsl.g:937:2: ( rule__DataModel__Group_1_2__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_1_2()); 
            // InternalDataDsl.g:938:2: ( rule__DataModel__Group_1_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDataDsl.g:938:3: rule__DataModel__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataModel__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1__2__Impl"


    // $ANTLR start "rule__DataModel__Group_1_2__0"
    // InternalDataDsl.g:947:1: rule__DataModel__Group_1_2__0 : rule__DataModel__Group_1_2__0__Impl rule__DataModel__Group_1_2__1 ;
    public final void rule__DataModel__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:951:1: ( rule__DataModel__Group_1_2__0__Impl rule__DataModel__Group_1_2__1 )
            // InternalDataDsl.g:952:2: rule__DataModel__Group_1_2__0__Impl rule__DataModel__Group_1_2__1
            {
            pushFollow(FOLLOW_7);
            rule__DataModel__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1_2__0"


    // $ANTLR start "rule__DataModel__Group_1_2__0__Impl"
    // InternalDataDsl.g:959:1: rule__DataModel__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:963:1: ( ( ',' ) )
            // InternalDataDsl.g:964:1: ( ',' )
            {
            // InternalDataDsl.g:964:1: ( ',' )
            // InternalDataDsl.g:965:2: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_1_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1_2__0__Impl"


    // $ANTLR start "rule__DataModel__Group_1_2__1"
    // InternalDataDsl.g:974:1: rule__DataModel__Group_1_2__1 : rule__DataModel__Group_1_2__1__Impl ;
    public final void rule__DataModel__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:978:1: ( rule__DataModel__Group_1_2__1__Impl )
            // InternalDataDsl.g:979:2: rule__DataModel__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1_2__1"


    // $ANTLR start "rule__DataModel__Group_1_2__1__Impl"
    // InternalDataDsl.g:985:1: rule__DataModel__Group_1_2__1__Impl : ( ( rule__DataModel__ImportURIAssignment_1_2_1 ) ) ;
    public final void rule__DataModel__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:989:1: ( ( ( rule__DataModel__ImportURIAssignment_1_2_1 ) ) )
            // InternalDataDsl.g:990:1: ( ( rule__DataModel__ImportURIAssignment_1_2_1 ) )
            {
            // InternalDataDsl.g:990:1: ( ( rule__DataModel__ImportURIAssignment_1_2_1 ) )
            // InternalDataDsl.g:991:2: ( rule__DataModel__ImportURIAssignment_1_2_1 )
            {
             before(grammarAccess.getDataModelAccess().getImportURIAssignment_1_2_1()); 
            // InternalDataDsl.g:992:2: ( rule__DataModel__ImportURIAssignment_1_2_1 )
            // InternalDataDsl.g:992:3: rule__DataModel__ImportURIAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__ImportURIAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getImportURIAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_1_2__1__Impl"


    // $ANTLR start "rule__DataModel__Group_4__0"
    // InternalDataDsl.g:1001:1: rule__DataModel__Group_4__0 : rule__DataModel__Group_4__0__Impl rule__DataModel__Group_4__1 ;
    public final void rule__DataModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1005:1: ( rule__DataModel__Group_4__0__Impl rule__DataModel__Group_4__1 )
            // InternalDataDsl.g:1006:2: rule__DataModel__Group_4__0__Impl rule__DataModel__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__DataModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_4__0"


    // $ANTLR start "rule__DataModel__Group_4__0__Impl"
    // InternalDataDsl.g:1013:1: rule__DataModel__Group_4__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1017:1: ( ( ',' ) )
            // InternalDataDsl.g:1018:1: ( ',' )
            {
            // InternalDataDsl.g:1018:1: ( ',' )
            // InternalDataDsl.g:1019:2: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_4__0__Impl"


    // $ANTLR start "rule__DataModel__Group_4__1"
    // InternalDataDsl.g:1028:1: rule__DataModel__Group_4__1 : rule__DataModel__Group_4__1__Impl ;
    public final void rule__DataModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1032:1: ( rule__DataModel__Group_4__1__Impl )
            // InternalDataDsl.g:1033:2: rule__DataModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_4__1"


    // $ANTLR start "rule__DataModel__Group_4__1__Impl"
    // InternalDataDsl.g:1039:1: rule__DataModel__Group_4__1__Impl : ( ( rule__DataModel__DescriptionsAssignment_4_1 ) ) ;
    public final void rule__DataModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1043:1: ( ( ( rule__DataModel__DescriptionsAssignment_4_1 ) ) )
            // InternalDataDsl.g:1044:1: ( ( rule__DataModel__DescriptionsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:1044:1: ( ( rule__DataModel__DescriptionsAssignment_4_1 ) )
            // InternalDataDsl.g:1045:2: ( rule__DataModel__DescriptionsAssignment_4_1 )
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsAssignment_4_1()); 
            // InternalDataDsl.g:1046:2: ( rule__DataModel__DescriptionsAssignment_4_1 )
            // InternalDataDsl.g:1046:3: rule__DataModel__DescriptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__DescriptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getDescriptionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_4__1__Impl"


    // $ANTLR start "rule__DataSource__Group__0"
    // InternalDataDsl.g:1055:1: rule__DataSource__Group__0 : rule__DataSource__Group__0__Impl rule__DataSource__Group__1 ;
    public final void rule__DataSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1059:1: ( rule__DataSource__Group__0__Impl rule__DataSource__Group__1 )
            // InternalDataDsl.g:1060:2: rule__DataSource__Group__0__Impl rule__DataSource__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalDataDsl.g:1067:1: rule__DataSource__Group__0__Impl : ( 'description' ) ;
    public final void rule__DataSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1071:1: ( ( 'description' ) )
            // InternalDataDsl.g:1072:1: ( 'description' )
            {
            // InternalDataDsl.g:1072:1: ( 'description' )
            // InternalDataDsl.g:1073:2: 'description'
            {
             before(grammarAccess.getDataSourceAccess().getDescriptionKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalDataDsl.g:1082:1: rule__DataSource__Group__1 : rule__DataSource__Group__1__Impl rule__DataSource__Group__2 ;
    public final void rule__DataSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1086:1: ( rule__DataSource__Group__1__Impl rule__DataSource__Group__2 )
            // InternalDataDsl.g:1087:2: rule__DataSource__Group__1__Impl rule__DataSource__Group__2
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
    // InternalDataDsl.g:1094:1: rule__DataSource__Group__1__Impl : ( ( rule__DataSource__FormatAssignment_1 ) ) ;
    public final void rule__DataSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1098:1: ( ( ( rule__DataSource__FormatAssignment_1 ) ) )
            // InternalDataDsl.g:1099:1: ( ( rule__DataSource__FormatAssignment_1 ) )
            {
            // InternalDataDsl.g:1099:1: ( ( rule__DataSource__FormatAssignment_1 ) )
            // InternalDataDsl.g:1100:2: ( rule__DataSource__FormatAssignment_1 )
            {
             before(grammarAccess.getDataSourceAccess().getFormatAssignment_1()); 
            // InternalDataDsl.g:1101:2: ( rule__DataSource__FormatAssignment_1 )
            // InternalDataDsl.g:1101:3: rule__DataSource__FormatAssignment_1
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
    // InternalDataDsl.g:1109:1: rule__DataSource__Group__2 : rule__DataSource__Group__2__Impl rule__DataSource__Group__3 ;
    public final void rule__DataSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1113:1: ( rule__DataSource__Group__2__Impl rule__DataSource__Group__3 )
            // InternalDataDsl.g:1114:2: rule__DataSource__Group__2__Impl rule__DataSource__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDsl.g:1121:1: rule__DataSource__Group__2__Impl : ( ( rule__DataSource__NameAssignment_2 ) ) ;
    public final void rule__DataSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1125:1: ( ( ( rule__DataSource__NameAssignment_2 ) ) )
            // InternalDataDsl.g:1126:1: ( ( rule__DataSource__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:1126:1: ( ( rule__DataSource__NameAssignment_2 ) )
            // InternalDataDsl.g:1127:2: ( rule__DataSource__NameAssignment_2 )
            {
             before(grammarAccess.getDataSourceAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:1128:2: ( rule__DataSource__NameAssignment_2 )
            // InternalDataDsl.g:1128:3: rule__DataSource__NameAssignment_2
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
    // InternalDataDsl.g:1136:1: rule__DataSource__Group__3 : rule__DataSource__Group__3__Impl rule__DataSource__Group__4 ;
    public final void rule__DataSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1140:1: ( rule__DataSource__Group__3__Impl rule__DataSource__Group__4 )
            // InternalDataDsl.g:1141:2: rule__DataSource__Group__3__Impl rule__DataSource__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDsl.g:1148:1: rule__DataSource__Group__3__Impl : ( ( rule__DataSource__Group_3__0 )? ) ;
    public final void rule__DataSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1152:1: ( ( ( rule__DataSource__Group_3__0 )? ) )
            // InternalDataDsl.g:1153:1: ( ( rule__DataSource__Group_3__0 )? )
            {
            // InternalDataDsl.g:1153:1: ( ( rule__DataSource__Group_3__0 )? )
            // InternalDataDsl.g:1154:2: ( rule__DataSource__Group_3__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_3()); 
            // InternalDataDsl.g:1155:2: ( rule__DataSource__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataDsl.g:1155:3: rule__DataSource__Group_3__0
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
    // InternalDataDsl.g:1163:1: rule__DataSource__Group__4 : rule__DataSource__Group__4__Impl rule__DataSource__Group__5 ;
    public final void rule__DataSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1167:1: ( rule__DataSource__Group__4__Impl rule__DataSource__Group__5 )
            // InternalDataDsl.g:1168:2: rule__DataSource__Group__4__Impl rule__DataSource__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDsl.g:1175:1: rule__DataSource__Group__4__Impl : ( ( rule__DataSource__Group_4__0 )? ) ;
    public final void rule__DataSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1179:1: ( ( ( rule__DataSource__Group_4__0 )? ) )
            // InternalDataDsl.g:1180:1: ( ( rule__DataSource__Group_4__0 )? )
            {
            // InternalDataDsl.g:1180:1: ( ( rule__DataSource__Group_4__0 )? )
            // InternalDataDsl.g:1181:2: ( rule__DataSource__Group_4__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_4()); 
            // InternalDataDsl.g:1182:2: ( rule__DataSource__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==38) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataDsl.g:1182:3: rule__DataSource__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalDataDsl.g:1190:1: rule__DataSource__Group__5 : rule__DataSource__Group__5__Impl rule__DataSource__Group__6 ;
    public final void rule__DataSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1194:1: ( rule__DataSource__Group__5__Impl rule__DataSource__Group__6 )
            // InternalDataDsl.g:1195:2: rule__DataSource__Group__5__Impl rule__DataSource__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataDsl.g:1202:1: rule__DataSource__Group__5__Impl : ( '=' ) ;
    public final void rule__DataSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1206:1: ( ( '=' ) )
            // InternalDataDsl.g:1207:1: ( '=' )
            {
            // InternalDataDsl.g:1207:1: ( '=' )
            // InternalDataDsl.g:1208:2: '='
            {
             before(grammarAccess.getDataSourceAccess().getEqualsSignKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getEqualsSignKeyword_5()); 

            }


            }

        }
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
    // InternalDataDsl.g:1217:1: rule__DataSource__Group__6 : rule__DataSource__Group__6__Impl rule__DataSource__Group__7 ;
    public final void rule__DataSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1221:1: ( rule__DataSource__Group__6__Impl rule__DataSource__Group__7 )
            // InternalDataDsl.g:1222:2: rule__DataSource__Group__6__Impl rule__DataSource__Group__7
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataDsl.g:1229:1: rule__DataSource__Group__6__Impl : ( '{' ) ;
    public final void rule__DataSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1233:1: ( ( '{' ) )
            // InternalDataDsl.g:1234:1: ( '{' )
            {
            // InternalDataDsl.g:1234:1: ( '{' )
            // InternalDataDsl.g:1235:2: '{'
            {
             before(grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalDataDsl.g:1244:1: rule__DataSource__Group__7 : rule__DataSource__Group__7__Impl rule__DataSource__Group__8 ;
    public final void rule__DataSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1248:1: ( rule__DataSource__Group__7__Impl rule__DataSource__Group__8 )
            // InternalDataDsl.g:1249:2: rule__DataSource__Group__7__Impl rule__DataSource__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__DataSource__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group__8();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:1256:1: rule__DataSource__Group__7__Impl : ( ( rule__DataSource__Group_7__0 )? ) ;
    public final void rule__DataSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1260:1: ( ( ( rule__DataSource__Group_7__0 )? ) )
            // InternalDataDsl.g:1261:1: ( ( rule__DataSource__Group_7__0 )? )
            {
            // InternalDataDsl.g:1261:1: ( ( rule__DataSource__Group_7__0 )? )
            // InternalDataDsl.g:1262:2: ( rule__DataSource__Group_7__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_7()); 
            // InternalDataDsl.g:1263:2: ( rule__DataSource__Group_7__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)||(LA14_0>=14 && LA14_0<=31)||LA14_0==45||(LA14_0>=47 && LA14_0<=49)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataDsl.g:1263:3: rule__DataSource__Group_7__0
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


    // $ANTLR start "rule__DataSource__Group__8"
    // InternalDataDsl.g:1271:1: rule__DataSource__Group__8 : rule__DataSource__Group__8__Impl rule__DataSource__Group__9 ;
    public final void rule__DataSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1275:1: ( rule__DataSource__Group__8__Impl rule__DataSource__Group__9 )
            // InternalDataDsl.g:1276:2: rule__DataSource__Group__8__Impl rule__DataSource__Group__9
            {
            pushFollow(FOLLOW_13);
            rule__DataSource__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__8"


    // $ANTLR start "rule__DataSource__Group__8__Impl"
    // InternalDataDsl.g:1283:1: rule__DataSource__Group__8__Impl : ( '}' ) ;
    public final void rule__DataSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1287:1: ( ( '}' ) )
            // InternalDataDsl.g:1288:1: ( '}' )
            {
            // InternalDataDsl.g:1288:1: ( '}' )
            // InternalDataDsl.g:1289:2: '}'
            {
             before(grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__8__Impl"


    // $ANTLR start "rule__DataSource__Group__9"
    // InternalDataDsl.g:1298:1: rule__DataSource__Group__9 : rule__DataSource__Group__9__Impl ;
    public final void rule__DataSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1302:1: ( rule__DataSource__Group__9__Impl )
            // InternalDataDsl.g:1303:2: rule__DataSource__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__9"


    // $ANTLR start "rule__DataSource__Group__9__Impl"
    // InternalDataDsl.g:1309:1: rule__DataSource__Group__9__Impl : ( ( rule__DataSource__Group_9__0 )? ) ;
    public final void rule__DataSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1313:1: ( ( ( rule__DataSource__Group_9__0 )? ) )
            // InternalDataDsl.g:1314:1: ( ( rule__DataSource__Group_9__0 )? )
            {
            // InternalDataDsl.g:1314:1: ( ( rule__DataSource__Group_9__0 )? )
            // InternalDataDsl.g:1315:2: ( rule__DataSource__Group_9__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_9()); 
            // InternalDataDsl.g:1316:2: ( rule__DataSource__Group_9__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDataDsl.g:1316:3: rule__DataSource__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataSource__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataSourceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group__9__Impl"


    // $ANTLR start "rule__DataSource__Group_3__0"
    // InternalDataDsl.g:1325:1: rule__DataSource__Group_3__0 : rule__DataSource__Group_3__0__Impl rule__DataSource__Group_3__1 ;
    public final void rule__DataSource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1329:1: ( rule__DataSource__Group_3__0__Impl rule__DataSource__Group_3__1 )
            // InternalDataDsl.g:1330:2: rule__DataSource__Group_3__0__Impl rule__DataSource__Group_3__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDataDsl.g:1337:1: rule__DataSource__Group_3__0__Impl : ( ( rule__DataSource__LinkAssignment_3_0 ) ) ;
    public final void rule__DataSource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1341:1: ( ( ( rule__DataSource__LinkAssignment_3_0 ) ) )
            // InternalDataDsl.g:1342:1: ( ( rule__DataSource__LinkAssignment_3_0 ) )
            {
            // InternalDataDsl.g:1342:1: ( ( rule__DataSource__LinkAssignment_3_0 ) )
            // InternalDataDsl.g:1343:2: ( rule__DataSource__LinkAssignment_3_0 )
            {
             before(grammarAccess.getDataSourceAccess().getLinkAssignment_3_0()); 
            // InternalDataDsl.g:1344:2: ( rule__DataSource__LinkAssignment_3_0 )
            // InternalDataDsl.g:1344:3: rule__DataSource__LinkAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__LinkAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getLinkAssignment_3_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:1352:1: rule__DataSource__Group_3__1 : rule__DataSource__Group_3__1__Impl ;
    public final void rule__DataSource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1356:1: ( rule__DataSource__Group_3__1__Impl )
            // InternalDataDsl.g:1357:2: rule__DataSource__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_3__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:1363:1: rule__DataSource__Group_3__1__Impl : ( ( rule__DataSource__Group_3_1__0 )* ) ;
    public final void rule__DataSource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1367:1: ( ( ( rule__DataSource__Group_3_1__0 )* ) )
            // InternalDataDsl.g:1368:1: ( ( rule__DataSource__Group_3_1__0 )* )
            {
            // InternalDataDsl.g:1368:1: ( ( rule__DataSource__Group_3_1__0 )* )
            // InternalDataDsl.g:1369:2: ( rule__DataSource__Group_3_1__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_3_1()); 
            // InternalDataDsl.g:1370:2: ( rule__DataSource__Group_3_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDataDsl.g:1370:3: rule__DataSource__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataSource__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getDataSourceAccess().getGroup_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataSource__Group_3_1__0"
    // InternalDataDsl.g:1379:1: rule__DataSource__Group_3_1__0 : rule__DataSource__Group_3_1__0__Impl rule__DataSource__Group_3_1__1 ;
    public final void rule__DataSource__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1383:1: ( rule__DataSource__Group_3_1__0__Impl rule__DataSource__Group_3_1__1 )
            // InternalDataDsl.g:1384:2: rule__DataSource__Group_3_1__0__Impl rule__DataSource__Group_3_1__1
            {
            pushFollow(FOLLOW_7);
            rule__DataSource__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3_1__0"


    // $ANTLR start "rule__DataSource__Group_3_1__0__Impl"
    // InternalDataDsl.g:1391:1: rule__DataSource__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1395:1: ( ( ',' ) )
            // InternalDataDsl.g:1396:1: ( ',' )
            {
            // InternalDataDsl.g:1396:1: ( ',' )
            // InternalDataDsl.g:1397:2: ','
            {
             before(grammarAccess.getDataSourceAccess().getCommaKeyword_3_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3_1__0__Impl"


    // $ANTLR start "rule__DataSource__Group_3_1__1"
    // InternalDataDsl.g:1406:1: rule__DataSource__Group_3_1__1 : rule__DataSource__Group_3_1__1__Impl ;
    public final void rule__DataSource__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1410:1: ( rule__DataSource__Group_3_1__1__Impl )
            // InternalDataDsl.g:1411:2: rule__DataSource__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3_1__1"


    // $ANTLR start "rule__DataSource__Group_3_1__1__Impl"
    // InternalDataDsl.g:1417:1: rule__DataSource__Group_3_1__1__Impl : ( ( rule__DataSource__LinkAssignment_3_1_1 ) ) ;
    public final void rule__DataSource__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1421:1: ( ( ( rule__DataSource__LinkAssignment_3_1_1 ) ) )
            // InternalDataDsl.g:1422:1: ( ( rule__DataSource__LinkAssignment_3_1_1 ) )
            {
            // InternalDataDsl.g:1422:1: ( ( rule__DataSource__LinkAssignment_3_1_1 ) )
            // InternalDataDsl.g:1423:2: ( rule__DataSource__LinkAssignment_3_1_1 )
            {
             before(grammarAccess.getDataSourceAccess().getLinkAssignment_3_1_1()); 
            // InternalDataDsl.g:1424:2: ( rule__DataSource__LinkAssignment_3_1_1 )
            // InternalDataDsl.g:1424:3: rule__DataSource__LinkAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__LinkAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getLinkAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_3_1__1__Impl"


    // $ANTLR start "rule__DataSource__Group_4__0"
    // InternalDataDsl.g:1433:1: rule__DataSource__Group_4__0 : rule__DataSource__Group_4__0__Impl rule__DataSource__Group_4__1 ;
    public final void rule__DataSource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1437:1: ( rule__DataSource__Group_4__0__Impl rule__DataSource__Group_4__1 )
            // InternalDataDsl.g:1438:2: rule__DataSource__Group_4__0__Impl rule__DataSource__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__DataSource__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4__0"


    // $ANTLR start "rule__DataSource__Group_4__0__Impl"
    // InternalDataDsl.g:1445:1: rule__DataSource__Group_4__0__Impl : ( 'uses' ) ;
    public final void rule__DataSource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1449:1: ( ( 'uses' ) )
            // InternalDataDsl.g:1450:1: ( 'uses' )
            {
            // InternalDataDsl.g:1450:1: ( 'uses' )
            // InternalDataDsl.g:1451:2: 'uses'
            {
             before(grammarAccess.getDataSourceAccess().getUsesKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getUsesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4__0__Impl"


    // $ANTLR start "rule__DataSource__Group_4__1"
    // InternalDataDsl.g:1460:1: rule__DataSource__Group_4__1 : rule__DataSource__Group_4__1__Impl rule__DataSource__Group_4__2 ;
    public final void rule__DataSource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1464:1: ( rule__DataSource__Group_4__1__Impl rule__DataSource__Group_4__2 )
            // InternalDataDsl.g:1465:2: rule__DataSource__Group_4__1__Impl rule__DataSource__Group_4__2
            {
            pushFollow(FOLLOW_8);
            rule__DataSource__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4__1"


    // $ANTLR start "rule__DataSource__Group_4__1__Impl"
    // InternalDataDsl.g:1472:1: rule__DataSource__Group_4__1__Impl : ( ( rule__DataSource__FragmentsAssignment_4_1 ) ) ;
    public final void rule__DataSource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1476:1: ( ( ( rule__DataSource__FragmentsAssignment_4_1 ) ) )
            // InternalDataDsl.g:1477:1: ( ( rule__DataSource__FragmentsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:1477:1: ( ( rule__DataSource__FragmentsAssignment_4_1 ) )
            // InternalDataDsl.g:1478:2: ( rule__DataSource__FragmentsAssignment_4_1 )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsAssignment_4_1()); 
            // InternalDataDsl.g:1479:2: ( rule__DataSource__FragmentsAssignment_4_1 )
            // InternalDataDsl.g:1479:3: rule__DataSource__FragmentsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__FragmentsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getFragmentsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4__1__Impl"


    // $ANTLR start "rule__DataSource__Group_4__2"
    // InternalDataDsl.g:1487:1: rule__DataSource__Group_4__2 : rule__DataSource__Group_4__2__Impl ;
    public final void rule__DataSource__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1491:1: ( rule__DataSource__Group_4__2__Impl )
            // InternalDataDsl.g:1492:2: rule__DataSource__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4__2"


    // $ANTLR start "rule__DataSource__Group_4__2__Impl"
    // InternalDataDsl.g:1498:1: rule__DataSource__Group_4__2__Impl : ( ( rule__DataSource__Group_4_2__0 )* ) ;
    public final void rule__DataSource__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1502:1: ( ( ( rule__DataSource__Group_4_2__0 )* ) )
            // InternalDataDsl.g:1503:1: ( ( rule__DataSource__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:1503:1: ( ( rule__DataSource__Group_4_2__0 )* )
            // InternalDataDsl.g:1504:2: ( rule__DataSource__Group_4_2__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_4_2()); 
            // InternalDataDsl.g:1505:2: ( rule__DataSource__Group_4_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDataDsl.g:1505:3: rule__DataSource__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataSource__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getDataSourceAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4__2__Impl"


    // $ANTLR start "rule__DataSource__Group_4_2__0"
    // InternalDataDsl.g:1514:1: rule__DataSource__Group_4_2__0 : rule__DataSource__Group_4_2__0__Impl rule__DataSource__Group_4_2__1 ;
    public final void rule__DataSource__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1518:1: ( rule__DataSource__Group_4_2__0__Impl rule__DataSource__Group_4_2__1 )
            // InternalDataDsl.g:1519:2: rule__DataSource__Group_4_2__0__Impl rule__DataSource__Group_4_2__1
            {
            pushFollow(FOLLOW_7);
            rule__DataSource__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4_2__0"


    // $ANTLR start "rule__DataSource__Group_4_2__0__Impl"
    // InternalDataDsl.g:1526:1: rule__DataSource__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1530:1: ( ( ',' ) )
            // InternalDataDsl.g:1531:1: ( ',' )
            {
            // InternalDataDsl.g:1531:1: ( ',' )
            // InternalDataDsl.g:1532:2: ','
            {
             before(grammarAccess.getDataSourceAccess().getCommaKeyword_4_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4_2__0__Impl"


    // $ANTLR start "rule__DataSource__Group_4_2__1"
    // InternalDataDsl.g:1541:1: rule__DataSource__Group_4_2__1 : rule__DataSource__Group_4_2__1__Impl ;
    public final void rule__DataSource__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1545:1: ( rule__DataSource__Group_4_2__1__Impl )
            // InternalDataDsl.g:1546:2: rule__DataSource__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4_2__1"


    // $ANTLR start "rule__DataSource__Group_4_2__1__Impl"
    // InternalDataDsl.g:1552:1: rule__DataSource__Group_4_2__1__Impl : ( ( rule__DataSource__FragmentsAssignment_4_2_1 ) ) ;
    public final void rule__DataSource__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1556:1: ( ( ( rule__DataSource__FragmentsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:1557:1: ( ( rule__DataSource__FragmentsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:1557:1: ( ( rule__DataSource__FragmentsAssignment_4_2_1 ) )
            // InternalDataDsl.g:1558:2: ( rule__DataSource__FragmentsAssignment_4_2_1 )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsAssignment_4_2_1()); 
            // InternalDataDsl.g:1559:2: ( rule__DataSource__FragmentsAssignment_4_2_1 )
            // InternalDataDsl.g:1559:3: rule__DataSource__FragmentsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__FragmentsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getFragmentsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_4_2__1__Impl"


    // $ANTLR start "rule__DataSource__Group_7__0"
    // InternalDataDsl.g:1568:1: rule__DataSource__Group_7__0 : rule__DataSource__Group_7__0__Impl rule__DataSource__Group_7__1 ;
    public final void rule__DataSource__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1572:1: ( rule__DataSource__Group_7__0__Impl rule__DataSource__Group_7__1 )
            // InternalDataDsl.g:1573:2: rule__DataSource__Group_7__0__Impl rule__DataSource__Group_7__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDataDsl.g:1580:1: rule__DataSource__Group_7__0__Impl : ( ( rule__DataSource__NodesAssignment_7_0 ) ) ;
    public final void rule__DataSource__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1584:1: ( ( ( rule__DataSource__NodesAssignment_7_0 ) ) )
            // InternalDataDsl.g:1585:1: ( ( rule__DataSource__NodesAssignment_7_0 ) )
            {
            // InternalDataDsl.g:1585:1: ( ( rule__DataSource__NodesAssignment_7_0 ) )
            // InternalDataDsl.g:1586:2: ( rule__DataSource__NodesAssignment_7_0 )
            {
             before(grammarAccess.getDataSourceAccess().getNodesAssignment_7_0()); 
            // InternalDataDsl.g:1587:2: ( rule__DataSource__NodesAssignment_7_0 )
            // InternalDataDsl.g:1587:3: rule__DataSource__NodesAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__NodesAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getNodesAssignment_7_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:1595:1: rule__DataSource__Group_7__1 : rule__DataSource__Group_7__1__Impl ;
    public final void rule__DataSource__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1599:1: ( rule__DataSource__Group_7__1__Impl )
            // InternalDataDsl.g:1600:2: rule__DataSource__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_7__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:1606:1: rule__DataSource__Group_7__1__Impl : ( ( rule__DataSource__Group_7_1__0 )* ) ;
    public final void rule__DataSource__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1610:1: ( ( ( rule__DataSource__Group_7_1__0 )* ) )
            // InternalDataDsl.g:1611:1: ( ( rule__DataSource__Group_7_1__0 )* )
            {
            // InternalDataDsl.g:1611:1: ( ( rule__DataSource__Group_7_1__0 )* )
            // InternalDataDsl.g:1612:2: ( rule__DataSource__Group_7_1__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_7_1()); 
            // InternalDataDsl.g:1613:2: ( rule__DataSource__Group_7_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDataDsl.g:1613:3: rule__DataSource__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataSource__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDataSourceAccess().getGroup_7_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataSource__Group_7_1__0"
    // InternalDataDsl.g:1622:1: rule__DataSource__Group_7_1__0 : rule__DataSource__Group_7_1__0__Impl rule__DataSource__Group_7_1__1 ;
    public final void rule__DataSource__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1626:1: ( rule__DataSource__Group_7_1__0__Impl rule__DataSource__Group_7_1__1 )
            // InternalDataDsl.g:1627:2: rule__DataSource__Group_7_1__0__Impl rule__DataSource__Group_7_1__1
            {
            pushFollow(FOLLOW_14);
            rule__DataSource__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7_1__0"


    // $ANTLR start "rule__DataSource__Group_7_1__0__Impl"
    // InternalDataDsl.g:1634:1: rule__DataSource__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1638:1: ( ( ',' ) )
            // InternalDataDsl.g:1639:1: ( ',' )
            {
            // InternalDataDsl.g:1639:1: ( ',' )
            // InternalDataDsl.g:1640:2: ','
            {
             before(grammarAccess.getDataSourceAccess().getCommaKeyword_7_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getCommaKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7_1__0__Impl"


    // $ANTLR start "rule__DataSource__Group_7_1__1"
    // InternalDataDsl.g:1649:1: rule__DataSource__Group_7_1__1 : rule__DataSource__Group_7_1__1__Impl ;
    public final void rule__DataSource__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1653:1: ( rule__DataSource__Group_7_1__1__Impl )
            // InternalDataDsl.g:1654:2: rule__DataSource__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_7_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7_1__1"


    // $ANTLR start "rule__DataSource__Group_7_1__1__Impl"
    // InternalDataDsl.g:1660:1: rule__DataSource__Group_7_1__1__Impl : ( ( rule__DataSource__NodesAssignment_7_1_1 ) ) ;
    public final void rule__DataSource__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1664:1: ( ( ( rule__DataSource__NodesAssignment_7_1_1 ) ) )
            // InternalDataDsl.g:1665:1: ( ( rule__DataSource__NodesAssignment_7_1_1 ) )
            {
            // InternalDataDsl.g:1665:1: ( ( rule__DataSource__NodesAssignment_7_1_1 ) )
            // InternalDataDsl.g:1666:2: ( rule__DataSource__NodesAssignment_7_1_1 )
            {
             before(grammarAccess.getDataSourceAccess().getNodesAssignment_7_1_1()); 
            // InternalDataDsl.g:1667:2: ( rule__DataSource__NodesAssignment_7_1_1 )
            // InternalDataDsl.g:1667:3: rule__DataSource__NodesAssignment_7_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__NodesAssignment_7_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getNodesAssignment_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_7_1__1__Impl"


    // $ANTLR start "rule__DataSource__Group_9__0"
    // InternalDataDsl.g:1676:1: rule__DataSource__Group_9__0 : rule__DataSource__Group_9__0__Impl rule__DataSource__Group_9__1 ;
    public final void rule__DataSource__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1680:1: ( rule__DataSource__Group_9__0__Impl rule__DataSource__Group_9__1 )
            // InternalDataDsl.g:1681:2: rule__DataSource__Group_9__0__Impl rule__DataSource__Group_9__1
            {
            pushFollow(FOLLOW_7);
            rule__DataSource__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9__0"


    // $ANTLR start "rule__DataSource__Group_9__0__Impl"
    // InternalDataDsl.g:1688:1: rule__DataSource__Group_9__0__Impl : ( '[' ) ;
    public final void rule__DataSource__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1692:1: ( ( '[' ) )
            // InternalDataDsl.g:1693:1: ( '[' )
            {
            // InternalDataDsl.g:1693:1: ( '[' )
            // InternalDataDsl.g:1694:2: '['
            {
             before(grammarAccess.getDataSourceAccess().getLeftSquareBracketKeyword_9_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getLeftSquareBracketKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9__0__Impl"


    // $ANTLR start "rule__DataSource__Group_9__1"
    // InternalDataDsl.g:1703:1: rule__DataSource__Group_9__1 : rule__DataSource__Group_9__1__Impl rule__DataSource__Group_9__2 ;
    public final void rule__DataSource__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1707:1: ( rule__DataSource__Group_9__1__Impl rule__DataSource__Group_9__2 )
            // InternalDataDsl.g:1708:2: rule__DataSource__Group_9__1__Impl rule__DataSource__Group_9__2
            {
            pushFollow(FOLLOW_15);
            rule__DataSource__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9__1"


    // $ANTLR start "rule__DataSource__Group_9__1__Impl"
    // InternalDataDsl.g:1715:1: rule__DataSource__Group_9__1__Impl : ( ( rule__DataSource__OptionsAssignment_9_1 ) ) ;
    public final void rule__DataSource__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1719:1: ( ( ( rule__DataSource__OptionsAssignment_9_1 ) ) )
            // InternalDataDsl.g:1720:1: ( ( rule__DataSource__OptionsAssignment_9_1 ) )
            {
            // InternalDataDsl.g:1720:1: ( ( rule__DataSource__OptionsAssignment_9_1 ) )
            // InternalDataDsl.g:1721:2: ( rule__DataSource__OptionsAssignment_9_1 )
            {
             before(grammarAccess.getDataSourceAccess().getOptionsAssignment_9_1()); 
            // InternalDataDsl.g:1722:2: ( rule__DataSource__OptionsAssignment_9_1 )
            // InternalDataDsl.g:1722:3: rule__DataSource__OptionsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__OptionsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getOptionsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9__1__Impl"


    // $ANTLR start "rule__DataSource__Group_9__2"
    // InternalDataDsl.g:1730:1: rule__DataSource__Group_9__2 : rule__DataSource__Group_9__2__Impl rule__DataSource__Group_9__3 ;
    public final void rule__DataSource__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1734:1: ( rule__DataSource__Group_9__2__Impl rule__DataSource__Group_9__3 )
            // InternalDataDsl.g:1735:2: rule__DataSource__Group_9__2__Impl rule__DataSource__Group_9__3
            {
            pushFollow(FOLLOW_15);
            rule__DataSource__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9__2"


    // $ANTLR start "rule__DataSource__Group_9__2__Impl"
    // InternalDataDsl.g:1742:1: rule__DataSource__Group_9__2__Impl : ( ( rule__DataSource__Group_9_2__0 )* ) ;
    public final void rule__DataSource__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1746:1: ( ( ( rule__DataSource__Group_9_2__0 )* ) )
            // InternalDataDsl.g:1747:1: ( ( rule__DataSource__Group_9_2__0 )* )
            {
            // InternalDataDsl.g:1747:1: ( ( rule__DataSource__Group_9_2__0 )* )
            // InternalDataDsl.g:1748:2: ( rule__DataSource__Group_9_2__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_9_2()); 
            // InternalDataDsl.g:1749:2: ( rule__DataSource__Group_9_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==35) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDataDsl.g:1749:3: rule__DataSource__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataSource__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDataSourceAccess().getGroup_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9__2__Impl"


    // $ANTLR start "rule__DataSource__Group_9__3"
    // InternalDataDsl.g:1757:1: rule__DataSource__Group_9__3 : rule__DataSource__Group_9__3__Impl ;
    public final void rule__DataSource__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1761:1: ( rule__DataSource__Group_9__3__Impl )
            // InternalDataDsl.g:1762:2: rule__DataSource__Group_9__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_9__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9__3"


    // $ANTLR start "rule__DataSource__Group_9__3__Impl"
    // InternalDataDsl.g:1768:1: rule__DataSource__Group_9__3__Impl : ( ']' ) ;
    public final void rule__DataSource__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1772:1: ( ( ']' ) )
            // InternalDataDsl.g:1773:1: ( ']' )
            {
            // InternalDataDsl.g:1773:1: ( ']' )
            // InternalDataDsl.g:1774:2: ']'
            {
             before(grammarAccess.getDataSourceAccess().getRightSquareBracketKeyword_9_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getRightSquareBracketKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9__3__Impl"


    // $ANTLR start "rule__DataSource__Group_9_2__0"
    // InternalDataDsl.g:1784:1: rule__DataSource__Group_9_2__0 : rule__DataSource__Group_9_2__0__Impl rule__DataSource__Group_9_2__1 ;
    public final void rule__DataSource__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1788:1: ( rule__DataSource__Group_9_2__0__Impl rule__DataSource__Group_9_2__1 )
            // InternalDataDsl.g:1789:2: rule__DataSource__Group_9_2__0__Impl rule__DataSource__Group_9_2__1
            {
            pushFollow(FOLLOW_7);
            rule__DataSource__Group_9_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataSource__Group_9_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9_2__0"


    // $ANTLR start "rule__DataSource__Group_9_2__0__Impl"
    // InternalDataDsl.g:1796:1: rule__DataSource__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1800:1: ( ( ',' ) )
            // InternalDataDsl.g:1801:1: ( ',' )
            {
            // InternalDataDsl.g:1801:1: ( ',' )
            // InternalDataDsl.g:1802:2: ','
            {
             before(grammarAccess.getDataSourceAccess().getCommaKeyword_9_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getCommaKeyword_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9_2__0__Impl"


    // $ANTLR start "rule__DataSource__Group_9_2__1"
    // InternalDataDsl.g:1811:1: rule__DataSource__Group_9_2__1 : rule__DataSource__Group_9_2__1__Impl ;
    public final void rule__DataSource__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1815:1: ( rule__DataSource__Group_9_2__1__Impl )
            // InternalDataDsl.g:1816:2: rule__DataSource__Group_9_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__Group_9_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9_2__1"


    // $ANTLR start "rule__DataSource__Group_9_2__1__Impl"
    // InternalDataDsl.g:1822:1: rule__DataSource__Group_9_2__1__Impl : ( ( rule__DataSource__OptionsAssignment_9_2_1 ) ) ;
    public final void rule__DataSource__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1826:1: ( ( ( rule__DataSource__OptionsAssignment_9_2_1 ) ) )
            // InternalDataDsl.g:1827:1: ( ( rule__DataSource__OptionsAssignment_9_2_1 ) )
            {
            // InternalDataDsl.g:1827:1: ( ( rule__DataSource__OptionsAssignment_9_2_1 ) )
            // InternalDataDsl.g:1828:2: ( rule__DataSource__OptionsAssignment_9_2_1 )
            {
             before(grammarAccess.getDataSourceAccess().getOptionsAssignment_9_2_1()); 
            // InternalDataDsl.g:1829:2: ( rule__DataSource__OptionsAssignment_9_2_1 )
            // InternalDataDsl.g:1829:3: rule__DataSource__OptionsAssignment_9_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataSource__OptionsAssignment_9_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataSourceAccess().getOptionsAssignment_9_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__Group_9_2__1__Impl"


    // $ANTLR start "rule__DataFragment__Group__0"
    // InternalDataDsl.g:1838:1: rule__DataFragment__Group__0 : rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1 ;
    public final void rule__DataFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1842:1: ( rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1 )
            // InternalDataDsl.g:1843:2: rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1
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
    // InternalDataDsl.g:1850:1: rule__DataFragment__Group__0__Impl : ( 'fragment' ) ;
    public final void rule__DataFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1854:1: ( ( 'fragment' ) )
            // InternalDataDsl.g:1855:1: ( 'fragment' )
            {
            // InternalDataDsl.g:1855:1: ( 'fragment' )
            // InternalDataDsl.g:1856:2: 'fragment'
            {
             before(grammarAccess.getDataFragmentAccess().getFragmentKeyword_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalDataDsl.g:1865:1: rule__DataFragment__Group__1 : rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2 ;
    public final void rule__DataFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1869:1: ( rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2 )
            // InternalDataDsl.g:1870:2: rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataDsl.g:1877:1: rule__DataFragment__Group__1__Impl : ( ( rule__DataFragment__NameAssignment_1 ) ) ;
    public final void rule__DataFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1881:1: ( ( ( rule__DataFragment__NameAssignment_1 ) ) )
            // InternalDataDsl.g:1882:1: ( ( rule__DataFragment__NameAssignment_1 ) )
            {
            // InternalDataDsl.g:1882:1: ( ( rule__DataFragment__NameAssignment_1 ) )
            // InternalDataDsl.g:1883:2: ( rule__DataFragment__NameAssignment_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getNameAssignment_1()); 
            // InternalDataDsl.g:1884:2: ( rule__DataFragment__NameAssignment_1 )
            // InternalDataDsl.g:1884:3: rule__DataFragment__NameAssignment_1
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
    // InternalDataDsl.g:1892:1: rule__DataFragment__Group__2 : rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3 ;
    public final void rule__DataFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1896:1: ( rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3 )
            // InternalDataDsl.g:1897:2: rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataDsl.g:1904:1: rule__DataFragment__Group__2__Impl : ( '=' ) ;
    public final void rule__DataFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1908:1: ( ( '=' ) )
            // InternalDataDsl.g:1909:1: ( '=' )
            {
            // InternalDataDsl.g:1909:1: ( '=' )
            // InternalDataDsl.g:1910:2: '='
            {
             before(grammarAccess.getDataFragmentAccess().getEqualsSignKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
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
    // InternalDataDsl.g:1919:1: rule__DataFragment__Group__3 : rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4 ;
    public final void rule__DataFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1923:1: ( rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4 )
            // InternalDataDsl.g:1924:2: rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataDsl.g:1931:1: rule__DataFragment__Group__3__Impl : ( '{' ) ;
    public final void rule__DataFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1935:1: ( ( '{' ) )
            // InternalDataDsl.g:1936:1: ( '{' )
            {
            // InternalDataDsl.g:1936:1: ( '{' )
            // InternalDataDsl.g:1937:2: '{'
            {
             before(grammarAccess.getDataFragmentAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalDataDsl.g:1946:1: rule__DataFragment__Group__4 : rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5 ;
    public final void rule__DataFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1950:1: ( rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5 )
            // InternalDataDsl.g:1951:2: rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalDataDsl.g:1958:1: rule__DataFragment__Group__4__Impl : ( ( rule__DataFragment__Group_4__0 )? ) ;
    public final void rule__DataFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1962:1: ( ( ( rule__DataFragment__Group_4__0 )? ) )
            // InternalDataDsl.g:1963:1: ( ( rule__DataFragment__Group_4__0 )? )
            {
            // InternalDataDsl.g:1963:1: ( ( rule__DataFragment__Group_4__0 )? )
            // InternalDataDsl.g:1964:2: ( rule__DataFragment__Group_4__0 )?
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_4()); 
            // InternalDataDsl.g:1965:2: ( rule__DataFragment__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||(LA20_0>=14 && LA20_0<=31)||LA20_0==45||(LA20_0>=47 && LA20_0<=49)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataDsl.g:1965:3: rule__DataFragment__Group_4__0
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
    // InternalDataDsl.g:1973:1: rule__DataFragment__Group__5 : rule__DataFragment__Group__5__Impl ;
    public final void rule__DataFragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1977:1: ( rule__DataFragment__Group__5__Impl )
            // InternalDataDsl.g:1978:2: rule__DataFragment__Group__5__Impl
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
    // InternalDataDsl.g:1984:1: rule__DataFragment__Group__5__Impl : ( '}' ) ;
    public final void rule__DataFragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:1988:1: ( ( '}' ) )
            // InternalDataDsl.g:1989:1: ( '}' )
            {
            // InternalDataDsl.g:1989:1: ( '}' )
            // InternalDataDsl.g:1990:2: '}'
            {
             before(grammarAccess.getDataFragmentAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
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


    // $ANTLR start "rule__DataFragment__Group_4__0"
    // InternalDataDsl.g:2000:1: rule__DataFragment__Group_4__0 : rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1 ;
    public final void rule__DataFragment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2004:1: ( rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1 )
            // InternalDataDsl.g:2005:2: rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDataDsl.g:2012:1: rule__DataFragment__Group_4__0__Impl : ( ( rule__DataFragment__NodesAssignment_4_0 ) ) ;
    public final void rule__DataFragment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2016:1: ( ( ( rule__DataFragment__NodesAssignment_4_0 ) ) )
            // InternalDataDsl.g:2017:1: ( ( rule__DataFragment__NodesAssignment_4_0 ) )
            {
            // InternalDataDsl.g:2017:1: ( ( rule__DataFragment__NodesAssignment_4_0 ) )
            // InternalDataDsl.g:2018:2: ( rule__DataFragment__NodesAssignment_4_0 )
            {
             before(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_0()); 
            // InternalDataDsl.g:2019:2: ( rule__DataFragment__NodesAssignment_4_0 )
            // InternalDataDsl.g:2019:3: rule__DataFragment__NodesAssignment_4_0
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
    // InternalDataDsl.g:2027:1: rule__DataFragment__Group_4__1 : rule__DataFragment__Group_4__1__Impl ;
    public final void rule__DataFragment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2031:1: ( rule__DataFragment__Group_4__1__Impl )
            // InternalDataDsl.g:2032:2: rule__DataFragment__Group_4__1__Impl
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
    // InternalDataDsl.g:2038:1: rule__DataFragment__Group_4__1__Impl : ( ( rule__DataFragment__Group_4_1__0 )* ) ;
    public final void rule__DataFragment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2042:1: ( ( ( rule__DataFragment__Group_4_1__0 )* ) )
            // InternalDataDsl.g:2043:1: ( ( rule__DataFragment__Group_4_1__0 )* )
            {
            // InternalDataDsl.g:2043:1: ( ( rule__DataFragment__Group_4_1__0 )* )
            // InternalDataDsl.g:2044:2: ( rule__DataFragment__Group_4_1__0 )*
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_4_1()); 
            // InternalDataDsl.g:2045:2: ( rule__DataFragment__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDataDsl.g:2045:3: rule__DataFragment__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataFragment__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalDataDsl.g:2054:1: rule__DataFragment__Group_4_1__0 : rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1 ;
    public final void rule__DataFragment__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2058:1: ( rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1 )
            // InternalDataDsl.g:2059:2: rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:2066:1: rule__DataFragment__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__DataFragment__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2070:1: ( ( ',' ) )
            // InternalDataDsl.g:2071:1: ( ',' )
            {
            // InternalDataDsl.g:2071:1: ( ',' )
            // InternalDataDsl.g:2072:2: ','
            {
             before(grammarAccess.getDataFragmentAccess().getCommaKeyword_4_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDataDsl.g:2081:1: rule__DataFragment__Group_4_1__1 : rule__DataFragment__Group_4_1__1__Impl ;
    public final void rule__DataFragment__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2085:1: ( rule__DataFragment__Group_4_1__1__Impl )
            // InternalDataDsl.g:2086:2: rule__DataFragment__Group_4_1__1__Impl
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
    // InternalDataDsl.g:2092:1: rule__DataFragment__Group_4_1__1__Impl : ( ( rule__DataFragment__NodesAssignment_4_1_1 ) ) ;
    public final void rule__DataFragment__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2096:1: ( ( ( rule__DataFragment__NodesAssignment_4_1_1 ) ) )
            // InternalDataDsl.g:2097:1: ( ( rule__DataFragment__NodesAssignment_4_1_1 ) )
            {
            // InternalDataDsl.g:2097:1: ( ( rule__DataFragment__NodesAssignment_4_1_1 ) )
            // InternalDataDsl.g:2098:2: ( rule__DataFragment__NodesAssignment_4_1_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_1_1()); 
            // InternalDataDsl.g:2099:2: ( rule__DataFragment__NodesAssignment_4_1_1 )
            // InternalDataDsl.g:2099:3: rule__DataFragment__NodesAssignment_4_1_1
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


    // $ANTLR start "rule__Option__Group__0"
    // InternalDataDsl.g:2108:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2112:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalDataDsl.g:2113:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // InternalDataDsl.g:2120:1: rule__Option__Group__0__Impl : ( () ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2124:1: ( ( () ) )
            // InternalDataDsl.g:2125:1: ( () )
            {
            // InternalDataDsl.g:2125:1: ( () )
            // InternalDataDsl.g:2126:2: ()
            {
             before(grammarAccess.getOptionAccess().getOptionAction_0()); 
            // InternalDataDsl.g:2127:2: ()
            // InternalDataDsl.g:2127:3: 
            {
            }

             after(grammarAccess.getOptionAccess().getOptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // InternalDataDsl.g:2135:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2139:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // InternalDataDsl.g:2140:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Option__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // InternalDataDsl.g:2147:1: rule__Option__Group__1__Impl : ( ( rule__Option__KeyAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2151:1: ( ( ( rule__Option__KeyAssignment_1 ) ) )
            // InternalDataDsl.g:2152:1: ( ( rule__Option__KeyAssignment_1 ) )
            {
            // InternalDataDsl.g:2152:1: ( ( rule__Option__KeyAssignment_1 ) )
            // InternalDataDsl.g:2153:2: ( rule__Option__KeyAssignment_1 )
            {
             before(grammarAccess.getOptionAccess().getKeyAssignment_1()); 
            // InternalDataDsl.g:2154:2: ( rule__Option__KeyAssignment_1 )
            // InternalDataDsl.g:2154:3: rule__Option__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__2"
    // InternalDataDsl.g:2162:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2166:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // InternalDataDsl.g:2167:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Option__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2"


    // $ANTLR start "rule__Option__Group__2__Impl"
    // InternalDataDsl.g:2174:1: rule__Option__Group__2__Impl : ( '=' ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2178:1: ( ( '=' ) )
            // InternalDataDsl.g:2179:1: ( '=' )
            {
            // InternalDataDsl.g:2179:1: ( '=' )
            // InternalDataDsl.g:2180:2: '='
            {
             before(grammarAccess.getOptionAccess().getEqualsSignKeyword_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__2__Impl"


    // $ANTLR start "rule__Option__Group__3"
    // InternalDataDsl.g:2189:1: rule__Option__Group__3 : rule__Option__Group__3__Impl rule__Option__Group__4 ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2193:1: ( rule__Option__Group__3__Impl rule__Option__Group__4 )
            // InternalDataDsl.g:2194:2: rule__Option__Group__3__Impl rule__Option__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Option__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__3"


    // $ANTLR start "rule__Option__Group__3__Impl"
    // InternalDataDsl.g:2201:1: rule__Option__Group__3__Impl : ( '{' ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2205:1: ( ( '{' ) )
            // InternalDataDsl.g:2206:1: ( '{' )
            {
            // InternalDataDsl.g:2206:1: ( '{' )
            // InternalDataDsl.g:2207:2: '{'
            {
             before(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__3__Impl"


    // $ANTLR start "rule__Option__Group__4"
    // InternalDataDsl.g:2216:1: rule__Option__Group__4 : rule__Option__Group__4__Impl rule__Option__Group__5 ;
    public final void rule__Option__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2220:1: ( rule__Option__Group__4__Impl rule__Option__Group__5 )
            // InternalDataDsl.g:2221:2: rule__Option__Group__4__Impl rule__Option__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Option__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__4"


    // $ANTLR start "rule__Option__Group__4__Impl"
    // InternalDataDsl.g:2228:1: rule__Option__Group__4__Impl : ( ( rule__Option__ValuesAssignment_4 ) ) ;
    public final void rule__Option__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2232:1: ( ( ( rule__Option__ValuesAssignment_4 ) ) )
            // InternalDataDsl.g:2233:1: ( ( rule__Option__ValuesAssignment_4 ) )
            {
            // InternalDataDsl.g:2233:1: ( ( rule__Option__ValuesAssignment_4 ) )
            // InternalDataDsl.g:2234:2: ( rule__Option__ValuesAssignment_4 )
            {
             before(grammarAccess.getOptionAccess().getValuesAssignment_4()); 
            // InternalDataDsl.g:2235:2: ( rule__Option__ValuesAssignment_4 )
            // InternalDataDsl.g:2235:3: rule__Option__ValuesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Option__ValuesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getValuesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__4__Impl"


    // $ANTLR start "rule__Option__Group__5"
    // InternalDataDsl.g:2243:1: rule__Option__Group__5 : rule__Option__Group__5__Impl rule__Option__Group__6 ;
    public final void rule__Option__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2247:1: ( rule__Option__Group__5__Impl rule__Option__Group__6 )
            // InternalDataDsl.g:2248:2: rule__Option__Group__5__Impl rule__Option__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Option__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__5"


    // $ANTLR start "rule__Option__Group__5__Impl"
    // InternalDataDsl.g:2255:1: rule__Option__Group__5__Impl : ( ( rule__Option__Group_5__0 )* ) ;
    public final void rule__Option__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2259:1: ( ( ( rule__Option__Group_5__0 )* ) )
            // InternalDataDsl.g:2260:1: ( ( rule__Option__Group_5__0 )* )
            {
            // InternalDataDsl.g:2260:1: ( ( rule__Option__Group_5__0 )* )
            // InternalDataDsl.g:2261:2: ( rule__Option__Group_5__0 )*
            {
             before(grammarAccess.getOptionAccess().getGroup_5()); 
            // InternalDataDsl.g:2262:2: ( rule__Option__Group_5__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDataDsl.g:2262:3: rule__Option__Group_5__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Option__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getOptionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__5__Impl"


    // $ANTLR start "rule__Option__Group__6"
    // InternalDataDsl.g:2270:1: rule__Option__Group__6 : rule__Option__Group__6__Impl ;
    public final void rule__Option__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2274:1: ( rule__Option__Group__6__Impl )
            // InternalDataDsl.g:2275:2: rule__Option__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__6"


    // $ANTLR start "rule__Option__Group__6__Impl"
    // InternalDataDsl.g:2281:1: rule__Option__Group__6__Impl : ( '}' ) ;
    public final void rule__Option__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2285:1: ( ( '}' ) )
            // InternalDataDsl.g:2286:1: ( '}' )
            {
            // InternalDataDsl.g:2286:1: ( '}' )
            // InternalDataDsl.g:2287:2: '}'
            {
             before(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__6__Impl"


    // $ANTLR start "rule__Option__Group_5__0"
    // InternalDataDsl.g:2297:1: rule__Option__Group_5__0 : rule__Option__Group_5__0__Impl rule__Option__Group_5__1 ;
    public final void rule__Option__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2301:1: ( rule__Option__Group_5__0__Impl rule__Option__Group_5__1 )
            // InternalDataDsl.g:2302:2: rule__Option__Group_5__0__Impl rule__Option__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Option__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_5__0"


    // $ANTLR start "rule__Option__Group_5__0__Impl"
    // InternalDataDsl.g:2309:1: rule__Option__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Option__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2313:1: ( ( ',' ) )
            // InternalDataDsl.g:2314:1: ( ',' )
            {
            // InternalDataDsl.g:2314:1: ( ',' )
            // InternalDataDsl.g:2315:2: ','
            {
             before(grammarAccess.getOptionAccess().getCommaKeyword_5_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_5__0__Impl"


    // $ANTLR start "rule__Option__Group_5__1"
    // InternalDataDsl.g:2324:1: rule__Option__Group_5__1 : rule__Option__Group_5__1__Impl ;
    public final void rule__Option__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2328:1: ( rule__Option__Group_5__1__Impl )
            // InternalDataDsl.g:2329:2: rule__Option__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_5__1"


    // $ANTLR start "rule__Option__Group_5__1__Impl"
    // InternalDataDsl.g:2335:1: rule__Option__Group_5__1__Impl : ( ( rule__Option__ValuesAssignment_5_1 ) ) ;
    public final void rule__Option__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2339:1: ( ( ( rule__Option__ValuesAssignment_5_1 ) ) )
            // InternalDataDsl.g:2340:1: ( ( rule__Option__ValuesAssignment_5_1 ) )
            {
            // InternalDataDsl.g:2340:1: ( ( rule__Option__ValuesAssignment_5_1 ) )
            // InternalDataDsl.g:2341:2: ( rule__Option__ValuesAssignment_5_1 )
            {
             before(grammarAccess.getOptionAccess().getValuesAssignment_5_1()); 
            // InternalDataDsl.g:2342:2: ( rule__Option__ValuesAssignment_5_1 )
            // InternalDataDsl.g:2342:3: rule__Option__ValuesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__ValuesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getValuesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_5__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group__0"
    // InternalDataDsl.g:2351:1: rule__CompositeNode__Group__0 : rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 ;
    public final void rule__CompositeNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2355:1: ( rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 )
            // InternalDataDsl.g:2356:2: rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalDataDsl.g:2363:1: rule__CompositeNode__Group__0__Impl : ( () ) ;
    public final void rule__CompositeNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2367:1: ( ( () ) )
            // InternalDataDsl.g:2368:1: ( () )
            {
            // InternalDataDsl.g:2368:1: ( () )
            // InternalDataDsl.g:2369:2: ()
            {
             before(grammarAccess.getCompositeNodeAccess().getCompositeNodeAction_0()); 
            // InternalDataDsl.g:2370:2: ()
            // InternalDataDsl.g:2370:3: 
            {
            }

             after(grammarAccess.getCompositeNodeAccess().getCompositeNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group__1"
    // InternalDataDsl.g:2378:1: rule__CompositeNode__Group__1 : rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 ;
    public final void rule__CompositeNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2382:1: ( rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 )
            // InternalDataDsl.g:2383:2: rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2
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
    // InternalDataDsl.g:2390:1: rule__CompositeNode__Group__1__Impl : ( ( rule__CompositeNode__EnvironmentAssignment_1 )? ) ;
    public final void rule__CompositeNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2394:1: ( ( ( rule__CompositeNode__EnvironmentAssignment_1 )? ) )
            // InternalDataDsl.g:2395:1: ( ( rule__CompositeNode__EnvironmentAssignment_1 )? )
            {
            // InternalDataDsl.g:2395:1: ( ( rule__CompositeNode__EnvironmentAssignment_1 )? )
            // InternalDataDsl.g:2396:2: ( rule__CompositeNode__EnvironmentAssignment_1 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getEnvironmentAssignment_1()); 
            // InternalDataDsl.g:2397:2: ( rule__CompositeNode__EnvironmentAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDataDsl.g:2397:3: rule__CompositeNode__EnvironmentAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__EnvironmentAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getEnvironmentAssignment_1()); 

            }


            }

        }
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
    // InternalDataDsl.g:2405:1: rule__CompositeNode__Group__2 : rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 ;
    public final void rule__CompositeNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2409:1: ( rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 )
            // InternalDataDsl.g:2410:2: rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataDsl.g:2417:1: rule__CompositeNode__Group__2__Impl : ( ( rule__CompositeNode__NameAssignment_2 ) ) ;
    public final void rule__CompositeNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2421:1: ( ( ( rule__CompositeNode__NameAssignment_2 ) ) )
            // InternalDataDsl.g:2422:1: ( ( rule__CompositeNode__NameAssignment_2 ) )
            {
            // InternalDataDsl.g:2422:1: ( ( rule__CompositeNode__NameAssignment_2 ) )
            // InternalDataDsl.g:2423:2: ( rule__CompositeNode__NameAssignment_2 )
            {
             before(grammarAccess.getCompositeNodeAccess().getNameAssignment_2()); 
            // InternalDataDsl.g:2424:2: ( rule__CompositeNode__NameAssignment_2 )
            // InternalDataDsl.g:2424:3: rule__CompositeNode__NameAssignment_2
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
    // InternalDataDsl.g:2432:1: rule__CompositeNode__Group__3 : rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 ;
    public final void rule__CompositeNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2436:1: ( rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 )
            // InternalDataDsl.g:2437:2: rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataDsl.g:2444:1: rule__CompositeNode__Group__3__Impl : ( ( rule__CompositeNode__RepresentedAsAssignment_3 )? ) ;
    public final void rule__CompositeNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2448:1: ( ( ( rule__CompositeNode__RepresentedAsAssignment_3 )? ) )
            // InternalDataDsl.g:2449:1: ( ( rule__CompositeNode__RepresentedAsAssignment_3 )? )
            {
            // InternalDataDsl.g:2449:1: ( ( rule__CompositeNode__RepresentedAsAssignment_3 )? )
            // InternalDataDsl.g:2450:2: ( rule__CompositeNode__RepresentedAsAssignment_3 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getRepresentedAsAssignment_3()); 
            // InternalDataDsl.g:2451:2: ( rule__CompositeNode__RepresentedAsAssignment_3 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_ID)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDsl.g:2451:3: rule__CompositeNode__RepresentedAsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__RepresentedAsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getRepresentedAsAssignment_3()); 

            }


            }

        }
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
    // InternalDataDsl.g:2459:1: rule__CompositeNode__Group__4 : rule__CompositeNode__Group__4__Impl rule__CompositeNode__Group__5 ;
    public final void rule__CompositeNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2463:1: ( rule__CompositeNode__Group__4__Impl rule__CompositeNode__Group__5 )
            // InternalDataDsl.g:2464:2: rule__CompositeNode__Group__4__Impl rule__CompositeNode__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataDsl.g:2471:1: rule__CompositeNode__Group__4__Impl : ( ( rule__CompositeNode__Group_4__0 )? ) ;
    public final void rule__CompositeNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2475:1: ( ( ( rule__CompositeNode__Group_4__0 )? ) )
            // InternalDataDsl.g:2476:1: ( ( rule__CompositeNode__Group_4__0 )? )
            {
            // InternalDataDsl.g:2476:1: ( ( rule__CompositeNode__Group_4__0 )? )
            // InternalDataDsl.g:2477:2: ( rule__CompositeNode__Group_4__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_4()); 
            // InternalDataDsl.g:2478:2: ( rule__CompositeNode__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDsl.g:2478:3: rule__CompositeNode__Group_4__0
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


    // $ANTLR start "rule__CompositeNode__Group__5"
    // InternalDataDsl.g:2486:1: rule__CompositeNode__Group__5 : rule__CompositeNode__Group__5__Impl rule__CompositeNode__Group__6 ;
    public final void rule__CompositeNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2490:1: ( rule__CompositeNode__Group__5__Impl rule__CompositeNode__Group__6 )
            // InternalDataDsl.g:2491:2: rule__CompositeNode__Group__5__Impl rule__CompositeNode__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalDataDsl.g:2498:1: rule__CompositeNode__Group__5__Impl : ( ( rule__CompositeNode__Group_5__0 ) ) ;
    public final void rule__CompositeNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2502:1: ( ( ( rule__CompositeNode__Group_5__0 ) ) )
            // InternalDataDsl.g:2503:1: ( ( rule__CompositeNode__Group_5__0 ) )
            {
            // InternalDataDsl.g:2503:1: ( ( rule__CompositeNode__Group_5__0 ) )
            // InternalDataDsl.g:2504:2: ( rule__CompositeNode__Group_5__0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_5()); 
            // InternalDataDsl.g:2505:2: ( rule__CompositeNode__Group_5__0 )
            // InternalDataDsl.g:2505:3: rule__CompositeNode__Group_5__0
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
    // InternalDataDsl.g:2513:1: rule__CompositeNode__Group__6 : rule__CompositeNode__Group__6__Impl ;
    public final void rule__CompositeNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2517:1: ( rule__CompositeNode__Group__6__Impl )
            // InternalDataDsl.g:2518:2: rule__CompositeNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:2524:1: rule__CompositeNode__Group__6__Impl : ( ')' ) ;
    public final void rule__CompositeNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2528:1: ( ( ')' ) )
            // InternalDataDsl.g:2529:1: ( ')' )
            {
            // InternalDataDsl.g:2529:1: ( ')' )
            // InternalDataDsl.g:2530:2: ')'
            {
             before(grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeNode__Group_4__0"
    // InternalDataDsl.g:2540:1: rule__CompositeNode__Group_4__0 : rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1 ;
    public final void rule__CompositeNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2544:1: ( rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1 )
            // InternalDataDsl.g:2545:2: rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDsl.g:2552:1: rule__CompositeNode__Group_4__0__Impl : ( 'extends' ) ;
    public final void rule__CompositeNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2556:1: ( ( 'extends' ) )
            // InternalDataDsl.g:2557:1: ( 'extends' )
            {
            // InternalDataDsl.g:2557:1: ( 'extends' )
            // InternalDataDsl.g:2558:2: 'extends'
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getExtendsKeyword_4_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:2567:1: rule__CompositeNode__Group_4__1 : rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2 ;
    public final void rule__CompositeNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2571:1: ( rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2 )
            // InternalDataDsl.g:2572:2: rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDataDsl.g:2579:1: rule__CompositeNode__Group_4__1__Impl : ( ( rule__CompositeNode__ExtendsAssignment_4_1 ) ) ;
    public final void rule__CompositeNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2583:1: ( ( ( rule__CompositeNode__ExtendsAssignment_4_1 ) ) )
            // InternalDataDsl.g:2584:1: ( ( rule__CompositeNode__ExtendsAssignment_4_1 ) )
            {
            // InternalDataDsl.g:2584:1: ( ( rule__CompositeNode__ExtendsAssignment_4_1 ) )
            // InternalDataDsl.g:2585:2: ( rule__CompositeNode__ExtendsAssignment_4_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_4_1()); 
            // InternalDataDsl.g:2586:2: ( rule__CompositeNode__ExtendsAssignment_4_1 )
            // InternalDataDsl.g:2586:3: rule__CompositeNode__ExtendsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__ExtendsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_4_1()); 

            }


            }

        }
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
    // InternalDataDsl.g:2594:1: rule__CompositeNode__Group_4__2 : rule__CompositeNode__Group_4__2__Impl ;
    public final void rule__CompositeNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2598:1: ( rule__CompositeNode__Group_4__2__Impl )
            // InternalDataDsl.g:2599:2: rule__CompositeNode__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:2605:1: rule__CompositeNode__Group_4__2__Impl : ( ( rule__CompositeNode__Group_4_2__0 )* ) ;
    public final void rule__CompositeNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2609:1: ( ( ( rule__CompositeNode__Group_4_2__0 )* ) )
            // InternalDataDsl.g:2610:1: ( ( rule__CompositeNode__Group_4_2__0 )* )
            {
            // InternalDataDsl.g:2610:1: ( ( rule__CompositeNode__Group_4_2__0 )* )
            // InternalDataDsl.g:2611:2: ( rule__CompositeNode__Group_4_2__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_4_2()); 
            // InternalDataDsl.g:2612:2: ( rule__CompositeNode__Group_4_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==35) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalDataDsl.g:2612:3: rule__CompositeNode__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CompositeNode__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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


    // $ANTLR start "rule__CompositeNode__Group_4_2__0"
    // InternalDataDsl.g:2621:1: rule__CompositeNode__Group_4_2__0 : rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1 ;
    public final void rule__CompositeNode__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2625:1: ( rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1 )
            // InternalDataDsl.g:2626:2: rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDsl.g:2633:1: rule__CompositeNode__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2637:1: ( ( ',' ) )
            // InternalDataDsl.g:2638:1: ( ',' )
            {
            // InternalDataDsl.g:2638:1: ( ',' )
            // InternalDataDsl.g:2639:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_4_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDataDsl.g:2648:1: rule__CompositeNode__Group_4_2__1 : rule__CompositeNode__Group_4_2__1__Impl ;
    public final void rule__CompositeNode__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2652:1: ( rule__CompositeNode__Group_4_2__1__Impl )
            // InternalDataDsl.g:2653:2: rule__CompositeNode__Group_4_2__1__Impl
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
    // InternalDataDsl.g:2659:1: rule__CompositeNode__Group_4_2__1__Impl : ( ( rule__CompositeNode__ExtendsAssignment_4_2_1 ) ) ;
    public final void rule__CompositeNode__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2663:1: ( ( ( rule__CompositeNode__ExtendsAssignment_4_2_1 ) ) )
            // InternalDataDsl.g:2664:1: ( ( rule__CompositeNode__ExtendsAssignment_4_2_1 ) )
            {
            // InternalDataDsl.g:2664:1: ( ( rule__CompositeNode__ExtendsAssignment_4_2_1 ) )
            // InternalDataDsl.g:2665:2: ( rule__CompositeNode__ExtendsAssignment_4_2_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_4_2_1()); 
            // InternalDataDsl.g:2666:2: ( rule__CompositeNode__ExtendsAssignment_4_2_1 )
            // InternalDataDsl.g:2666:3: rule__CompositeNode__ExtendsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__ExtendsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_4_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeNode__Group_5__0"
    // InternalDataDsl.g:2675:1: rule__CompositeNode__Group_5__0 : rule__CompositeNode__Group_5__0__Impl rule__CompositeNode__Group_5__1 ;
    public final void rule__CompositeNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2679:1: ( rule__CompositeNode__Group_5__0__Impl rule__CompositeNode__Group_5__1 )
            // InternalDataDsl.g:2680:2: rule__CompositeNode__Group_5__0__Impl rule__CompositeNode__Group_5__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataDsl.g:2687:1: rule__CompositeNode__Group_5__0__Impl : ( '=' ) ;
    public final void rule__CompositeNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2691:1: ( ( '=' ) )
            // InternalDataDsl.g:2692:1: ( '=' )
            {
            // InternalDataDsl.g:2692:1: ( '=' )
            // InternalDataDsl.g:2693:2: '='
            {
             before(grammarAccess.getCompositeNodeAccess().getEqualsSignKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getEqualsSignKeyword_5_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:2702:1: rule__CompositeNode__Group_5__1 : rule__CompositeNode__Group_5__1__Impl rule__CompositeNode__Group_5__2 ;
    public final void rule__CompositeNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2706:1: ( rule__CompositeNode__Group_5__1__Impl rule__CompositeNode__Group_5__2 )
            // InternalDataDsl.g:2707:2: rule__CompositeNode__Group_5__1__Impl rule__CompositeNode__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__CompositeNode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5__2();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:2714:1: rule__CompositeNode__Group_5__1__Impl : ( '(' ) ;
    public final void rule__CompositeNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2718:1: ( ( '(' ) )
            // InternalDataDsl.g:2719:1: ( '(' )
            {
            // InternalDataDsl.g:2719:1: ( '(' )
            // InternalDataDsl.g:2720:2: '('
            {
             before(grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeNode__Group_5__2"
    // InternalDataDsl.g:2729:1: rule__CompositeNode__Group_5__2 : rule__CompositeNode__Group_5__2__Impl ;
    public final void rule__CompositeNode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2733:1: ( rule__CompositeNode__Group_5__2__Impl )
            // InternalDataDsl.g:2734:2: rule__CompositeNode__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5__2"


    // $ANTLR start "rule__CompositeNode__Group_5__2__Impl"
    // InternalDataDsl.g:2740:1: rule__CompositeNode__Group_5__2__Impl : ( ( rule__CompositeNode__Group_5_2__0 )? ) ;
    public final void rule__CompositeNode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2744:1: ( ( ( rule__CompositeNode__Group_5_2__0 )? ) )
            // InternalDataDsl.g:2745:1: ( ( rule__CompositeNode__Group_5_2__0 )? )
            {
            // InternalDataDsl.g:2745:1: ( ( rule__CompositeNode__Group_5_2__0 )? )
            // InternalDataDsl.g:2746:2: ( rule__CompositeNode__Group_5_2__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_5_2()); 
            // InternalDataDsl.g:2747:2: ( rule__CompositeNode__Group_5_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||(LA27_0>=14 && LA27_0<=31)||LA27_0==45||(LA27_0>=47 && LA27_0<=49)) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataDsl.g:2747:3: rule__CompositeNode__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__Group_5_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5__2__Impl"


    // $ANTLR start "rule__CompositeNode__Group_5_2__0"
    // InternalDataDsl.g:2756:1: rule__CompositeNode__Group_5_2__0 : rule__CompositeNode__Group_5_2__0__Impl rule__CompositeNode__Group_5_2__1 ;
    public final void rule__CompositeNode__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2760:1: ( rule__CompositeNode__Group_5_2__0__Impl rule__CompositeNode__Group_5_2__1 )
            // InternalDataDsl.g:2761:2: rule__CompositeNode__Group_5_2__0__Impl rule__CompositeNode__Group_5_2__1
            {
            pushFollow(FOLLOW_8);
            rule__CompositeNode__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_2__0"


    // $ANTLR start "rule__CompositeNode__Group_5_2__0__Impl"
    // InternalDataDsl.g:2768:1: rule__CompositeNode__Group_5_2__0__Impl : ( ( rule__CompositeNode__SubnodesAssignment_5_2_0 ) ) ;
    public final void rule__CompositeNode__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2772:1: ( ( ( rule__CompositeNode__SubnodesAssignment_5_2_0 ) ) )
            // InternalDataDsl.g:2773:1: ( ( rule__CompositeNode__SubnodesAssignment_5_2_0 ) )
            {
            // InternalDataDsl.g:2773:1: ( ( rule__CompositeNode__SubnodesAssignment_5_2_0 ) )
            // InternalDataDsl.g:2774:2: ( rule__CompositeNode__SubnodesAssignment_5_2_0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_5_2_0()); 
            // InternalDataDsl.g:2775:2: ( rule__CompositeNode__SubnodesAssignment_5_2_0 )
            // InternalDataDsl.g:2775:3: rule__CompositeNode__SubnodesAssignment_5_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__SubnodesAssignment_5_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_2__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_5_2__1"
    // InternalDataDsl.g:2783:1: rule__CompositeNode__Group_5_2__1 : rule__CompositeNode__Group_5_2__1__Impl ;
    public final void rule__CompositeNode__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2787:1: ( rule__CompositeNode__Group_5_2__1__Impl )
            // InternalDataDsl.g:2788:2: rule__CompositeNode__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_2__1"


    // $ANTLR start "rule__CompositeNode__Group_5_2__1__Impl"
    // InternalDataDsl.g:2794:1: rule__CompositeNode__Group_5_2__1__Impl : ( ( rule__CompositeNode__Group_5_2_1__0 )* ) ;
    public final void rule__CompositeNode__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2798:1: ( ( ( rule__CompositeNode__Group_5_2_1__0 )* ) )
            // InternalDataDsl.g:2799:1: ( ( rule__CompositeNode__Group_5_2_1__0 )* )
            {
            // InternalDataDsl.g:2799:1: ( ( rule__CompositeNode__Group_5_2_1__0 )* )
            // InternalDataDsl.g:2800:2: ( rule__CompositeNode__Group_5_2_1__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_5_2_1()); 
            // InternalDataDsl.g:2801:2: ( rule__CompositeNode__Group_5_2_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDataDsl.g:2801:3: rule__CompositeNode__Group_5_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CompositeNode__Group_5_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getCompositeNodeAccess().getGroup_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_2__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group_5_2_1__0"
    // InternalDataDsl.g:2810:1: rule__CompositeNode__Group_5_2_1__0 : rule__CompositeNode__Group_5_2_1__0__Impl rule__CompositeNode__Group_5_2_1__1 ;
    public final void rule__CompositeNode__Group_5_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2814:1: ( rule__CompositeNode__Group_5_2_1__0__Impl rule__CompositeNode__Group_5_2_1__1 )
            // InternalDataDsl.g:2815:2: rule__CompositeNode__Group_5_2_1__0__Impl rule__CompositeNode__Group_5_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CompositeNode__Group_5_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_2_1__0"


    // $ANTLR start "rule__CompositeNode__Group_5_2_1__0__Impl"
    // InternalDataDsl.g:2822:1: rule__CompositeNode__Group_5_2_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_5_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2826:1: ( ( ',' ) )
            // InternalDataDsl.g:2827:1: ( ',' )
            {
            // InternalDataDsl.g:2827:1: ( ',' )
            // InternalDataDsl.g:2828:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_5_2_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getCommaKeyword_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_2_1__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_5_2_1__1"
    // InternalDataDsl.g:2837:1: rule__CompositeNode__Group_5_2_1__1 : rule__CompositeNode__Group_5_2_1__1__Impl ;
    public final void rule__CompositeNode__Group_5_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2841:1: ( rule__CompositeNode__Group_5_2_1__1__Impl )
            // InternalDataDsl.g:2842:2: rule__CompositeNode__Group_5_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_5_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_2_1__1"


    // $ANTLR start "rule__CompositeNode__Group_5_2_1__1__Impl"
    // InternalDataDsl.g:2848:1: rule__CompositeNode__Group_5_2_1__1__Impl : ( ( rule__CompositeNode__SubnodesAssignment_5_2_1_1 ) ) ;
    public final void rule__CompositeNode__Group_5_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2852:1: ( ( ( rule__CompositeNode__SubnodesAssignment_5_2_1_1 ) ) )
            // InternalDataDsl.g:2853:1: ( ( rule__CompositeNode__SubnodesAssignment_5_2_1_1 ) )
            {
            // InternalDataDsl.g:2853:1: ( ( rule__CompositeNode__SubnodesAssignment_5_2_1_1 ) )
            // InternalDataDsl.g:2854:2: ( rule__CompositeNode__SubnodesAssignment_5_2_1_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_5_2_1_1()); 
            // InternalDataDsl.g:2855:2: ( rule__CompositeNode__SubnodesAssignment_5_2_1_1 )
            // InternalDataDsl.g:2855:3: rule__CompositeNode__SubnodesAssignment_5_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__SubnodesAssignment_5_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_5_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_5_2_1__1__Impl"


    // $ANTLR start "rule__LeafNode__Group__0"
    // InternalDataDsl.g:2864:1: rule__LeafNode__Group__0 : rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1 ;
    public final void rule__LeafNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2868:1: ( rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1 )
            // InternalDataDsl.g:2869:2: rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:2876:1: rule__LeafNode__Group__0__Impl : ( () ) ;
    public final void rule__LeafNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2880:1: ( ( () ) )
            // InternalDataDsl.g:2881:1: ( () )
            {
            // InternalDataDsl.g:2881:1: ( () )
            // InternalDataDsl.g:2882:2: ()
            {
             before(grammarAccess.getLeafNodeAccess().getLeafNodeAction_0()); 
            // InternalDataDsl.g:2883:2: ()
            // InternalDataDsl.g:2883:3: 
            {
            }

             after(grammarAccess.getLeafNodeAccess().getLeafNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__0__Impl"


    // $ANTLR start "rule__LeafNode__Group__1"
    // InternalDataDsl.g:2891:1: rule__LeafNode__Group__1 : rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2 ;
    public final void rule__LeafNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2895:1: ( rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2 )
            // InternalDataDsl.g:2896:2: rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:2903:1: rule__LeafNode__Group__1__Impl : ( ( rule__LeafNode__KeyAssignment_1 )? ) ;
    public final void rule__LeafNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2907:1: ( ( ( rule__LeafNode__KeyAssignment_1 )? ) )
            // InternalDataDsl.g:2908:1: ( ( rule__LeafNode__KeyAssignment_1 )? )
            {
            // InternalDataDsl.g:2908:1: ( ( rule__LeafNode__KeyAssignment_1 )? )
            // InternalDataDsl.g:2909:2: ( rule__LeafNode__KeyAssignment_1 )?
            {
             before(grammarAccess.getLeafNodeAccess().getKeyAssignment_1()); 
            // InternalDataDsl.g:2910:2: ( rule__LeafNode__KeyAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataDsl.g:2910:3: rule__LeafNode__KeyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__KeyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getKeyAssignment_1()); 

            }


            }

        }
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
    // InternalDataDsl.g:2918:1: rule__LeafNode__Group__2 : rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3 ;
    public final void rule__LeafNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2922:1: ( rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3 )
            // InternalDataDsl.g:2923:2: rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDsl.g:2930:1: rule__LeafNode__Group__2__Impl : ( ( rule__LeafNode__UniqueAssignment_2 )? ) ;
    public final void rule__LeafNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2934:1: ( ( ( rule__LeafNode__UniqueAssignment_2 )? ) )
            // InternalDataDsl.g:2935:1: ( ( rule__LeafNode__UniqueAssignment_2 )? )
            {
            // InternalDataDsl.g:2935:1: ( ( rule__LeafNode__UniqueAssignment_2 )? )
            // InternalDataDsl.g:2936:2: ( rule__LeafNode__UniqueAssignment_2 )?
            {
             before(grammarAccess.getLeafNodeAccess().getUniqueAssignment_2()); 
            // InternalDataDsl.g:2937:2: ( rule__LeafNode__UniqueAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==49) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalDataDsl.g:2937:3: rule__LeafNode__UniqueAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__UniqueAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getUniqueAssignment_2()); 

            }


            }

        }
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
    // InternalDataDsl.g:2945:1: rule__LeafNode__Group__3 : rule__LeafNode__Group__3__Impl rule__LeafNode__Group__4 ;
    public final void rule__LeafNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2949:1: ( rule__LeafNode__Group__3__Impl rule__LeafNode__Group__4 )
            // InternalDataDsl.g:2950:2: rule__LeafNode__Group__3__Impl rule__LeafNode__Group__4
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
    // InternalDataDsl.g:2957:1: rule__LeafNode__Group__3__Impl : ( ( rule__LeafNode__TypeAssignment_3 ) ) ;
    public final void rule__LeafNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2961:1: ( ( ( rule__LeafNode__TypeAssignment_3 ) ) )
            // InternalDataDsl.g:2962:1: ( ( rule__LeafNode__TypeAssignment_3 ) )
            {
            // InternalDataDsl.g:2962:1: ( ( rule__LeafNode__TypeAssignment_3 ) )
            // InternalDataDsl.g:2963:2: ( rule__LeafNode__TypeAssignment_3 )
            {
             before(grammarAccess.getLeafNodeAccess().getTypeAssignment_3()); 
            // InternalDataDsl.g:2964:2: ( rule__LeafNode__TypeAssignment_3 )
            // InternalDataDsl.g:2964:3: rule__LeafNode__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalDataDsl.g:2972:1: rule__LeafNode__Group__4 : rule__LeafNode__Group__4__Impl rule__LeafNode__Group__5 ;
    public final void rule__LeafNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2976:1: ( rule__LeafNode__Group__4__Impl rule__LeafNode__Group__5 )
            // InternalDataDsl.g:2977:2: rule__LeafNode__Group__4__Impl rule__LeafNode__Group__5
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
    // InternalDataDsl.g:2984:1: rule__LeafNode__Group__4__Impl : ( ( rule__LeafNode__KeywordAssignment_4 )? ) ;
    public final void rule__LeafNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:2988:1: ( ( ( rule__LeafNode__KeywordAssignment_4 )? ) )
            // InternalDataDsl.g:2989:1: ( ( rule__LeafNode__KeywordAssignment_4 )? )
            {
            // InternalDataDsl.g:2989:1: ( ( rule__LeafNode__KeywordAssignment_4 )? )
            // InternalDataDsl.g:2990:2: ( rule__LeafNode__KeywordAssignment_4 )?
            {
             before(grammarAccess.getLeafNodeAccess().getKeywordAssignment_4()); 
            // InternalDataDsl.g:2991:2: ( rule__LeafNode__KeywordAssignment_4 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==50) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDataDsl.g:2991:3: rule__LeafNode__KeywordAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__KeywordAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getKeywordAssignment_4()); 

            }


            }

        }
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
    // InternalDataDsl.g:2999:1: rule__LeafNode__Group__5 : rule__LeafNode__Group__5__Impl rule__LeafNode__Group__6 ;
    public final void rule__LeafNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3003:1: ( rule__LeafNode__Group__5__Impl rule__LeafNode__Group__6 )
            // InternalDataDsl.g:3004:2: rule__LeafNode__Group__5__Impl rule__LeafNode__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__LeafNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__6();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:3011:1: rule__LeafNode__Group__5__Impl : ( ( rule__LeafNode__NameAssignment_5 ) ) ;
    public final void rule__LeafNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3015:1: ( ( ( rule__LeafNode__NameAssignment_5 ) ) )
            // InternalDataDsl.g:3016:1: ( ( rule__LeafNode__NameAssignment_5 ) )
            {
            // InternalDataDsl.g:3016:1: ( ( rule__LeafNode__NameAssignment_5 ) )
            // InternalDataDsl.g:3017:2: ( rule__LeafNode__NameAssignment_5 )
            {
             before(grammarAccess.getLeafNodeAccess().getNameAssignment_5()); 
            // InternalDataDsl.g:3018:2: ( rule__LeafNode__NameAssignment_5 )
            // InternalDataDsl.g:3018:3: rule__LeafNode__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getNameAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__LeafNode__Group__6"
    // InternalDataDsl.g:3026:1: rule__LeafNode__Group__6 : rule__LeafNode__Group__6__Impl ;
    public final void rule__LeafNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3030:1: ( rule__LeafNode__Group__6__Impl )
            // InternalDataDsl.g:3031:2: rule__LeafNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__6"


    // $ANTLR start "rule__LeafNode__Group__6__Impl"
    // InternalDataDsl.g:3037:1: rule__LeafNode__Group__6__Impl : ( ( rule__LeafNode__RepresentedAsAssignment_6 )? ) ;
    public final void rule__LeafNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3041:1: ( ( ( rule__LeafNode__RepresentedAsAssignment_6 )? ) )
            // InternalDataDsl.g:3042:1: ( ( rule__LeafNode__RepresentedAsAssignment_6 )? )
            {
            // InternalDataDsl.g:3042:1: ( ( rule__LeafNode__RepresentedAsAssignment_6 )? )
            // InternalDataDsl.g:3043:2: ( rule__LeafNode__RepresentedAsAssignment_6 )?
            {
             before(grammarAccess.getLeafNodeAccess().getRepresentedAsAssignment_6()); 
            // InternalDataDsl.g:3044:2: ( rule__LeafNode__RepresentedAsAssignment_6 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataDsl.g:3044:3: rule__LeafNode__RepresentedAsAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__RepresentedAsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getRepresentedAsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__Group__6__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDataDsl.g:3053:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3057:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDataDsl.g:3058:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalDataDsl.g:3065:1: rule__DataType__Group__0__Impl : ( () ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3069:1: ( ( () ) )
            // InternalDataDsl.g:3070:1: ( () )
            {
            // InternalDataDsl.g:3070:1: ( () )
            // InternalDataDsl.g:3071:2: ()
            {
             before(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 
            // InternalDataDsl.g:3072:2: ()
            // InternalDataDsl.g:3072:3: 
            {
            }

             after(grammarAccess.getDataTypeAccess().getDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalDataDsl.g:3080:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl rule__DataType__Group__2 ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3084:1: ( rule__DataType__Group__1__Impl rule__DataType__Group__2 )
            // InternalDataDsl.g:3085:2: rule__DataType__Group__1__Impl rule__DataType__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataDsl.g:3092:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__Alternatives_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3096:1: ( ( ( rule__DataType__Alternatives_1 ) ) )
            // InternalDataDsl.g:3097:1: ( ( rule__DataType__Alternatives_1 ) )
            {
            // InternalDataDsl.g:3097:1: ( ( rule__DataType__Alternatives_1 ) )
            // InternalDataDsl.g:3098:2: ( rule__DataType__Alternatives_1 )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives_1()); 
            // InternalDataDsl.g:3099:2: ( rule__DataType__Alternatives_1 )
            // InternalDataDsl.g:3099:3: rule__DataType__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalDataDsl.g:3107:1: rule__DataType__Group__2 : rule__DataType__Group__2__Impl ;
    public final void rule__DataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3111:1: ( rule__DataType__Group__2__Impl )
            // InternalDataDsl.g:3112:2: rule__DataType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataDsl.g:3118:1: rule__DataType__Group__2__Impl : ( ( rule__DataType__Group_2__0 )? ) ;
    public final void rule__DataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3122:1: ( ( ( rule__DataType__Group_2__0 )? ) )
            // InternalDataDsl.g:3123:1: ( ( rule__DataType__Group_2__0 )? )
            {
            // InternalDataDsl.g:3123:1: ( ( rule__DataType__Group_2__0 )? )
            // InternalDataDsl.g:3124:2: ( rule__DataType__Group_2__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_2()); 
            // InternalDataDsl.g:3125:2: ( rule__DataType__Group_2__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataDsl.g:3125:3: rule__DataType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataType__Group_2__0"
    // InternalDataDsl.g:3134:1: rule__DataType__Group_2__0 : rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 ;
    public final void rule__DataType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3138:1: ( rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1 )
            // InternalDataDsl.g:3139:2: rule__DataType__Group_2__0__Impl rule__DataType__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__DataType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__0"


    // $ANTLR start "rule__DataType__Group_2__0__Impl"
    // InternalDataDsl.g:3146:1: rule__DataType__Group_2__0__Impl : ( '[' ) ;
    public final void rule__DataType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3150:1: ( ( '[' ) )
            // InternalDataDsl.g:3151:1: ( '[' )
            {
            // InternalDataDsl.g:3151:1: ( '[' )
            // InternalDataDsl.g:3152:2: '['
            {
             before(grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__0__Impl"


    // $ANTLR start "rule__DataType__Group_2__1"
    // InternalDataDsl.g:3161:1: rule__DataType__Group_2__1 : rule__DataType__Group_2__1__Impl rule__DataType__Group_2__2 ;
    public final void rule__DataType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3165:1: ( rule__DataType__Group_2__1__Impl rule__DataType__Group_2__2 )
            // InternalDataDsl.g:3166:2: rule__DataType__Group_2__1__Impl rule__DataType__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__DataType__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__1"


    // $ANTLR start "rule__DataType__Group_2__1__Impl"
    // InternalDataDsl.g:3173:1: rule__DataType__Group_2__1__Impl : ( ( rule__DataType__MinAssignment_2_1 ) ) ;
    public final void rule__DataType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3177:1: ( ( ( rule__DataType__MinAssignment_2_1 ) ) )
            // InternalDataDsl.g:3178:1: ( ( rule__DataType__MinAssignment_2_1 ) )
            {
            // InternalDataDsl.g:3178:1: ( ( rule__DataType__MinAssignment_2_1 ) )
            // InternalDataDsl.g:3179:2: ( rule__DataType__MinAssignment_2_1 )
            {
             before(grammarAccess.getDataTypeAccess().getMinAssignment_2_1()); 
            // InternalDataDsl.g:3180:2: ( rule__DataType__MinAssignment_2_1 )
            // InternalDataDsl.g:3180:3: rule__DataType__MinAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__MinAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getMinAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__1__Impl"


    // $ANTLR start "rule__DataType__Group_2__2"
    // InternalDataDsl.g:3188:1: rule__DataType__Group_2__2 : rule__DataType__Group_2__2__Impl rule__DataType__Group_2__3 ;
    public final void rule__DataType__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3192:1: ( rule__DataType__Group_2__2__Impl rule__DataType__Group_2__3 )
            // InternalDataDsl.g:3193:2: rule__DataType__Group_2__2__Impl rule__DataType__Group_2__3
            {
            pushFollow(FOLLOW_24);
            rule__DataType__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__2"


    // $ANTLR start "rule__DataType__Group_2__2__Impl"
    // InternalDataDsl.g:3200:1: rule__DataType__Group_2__2__Impl : ( ',' ) ;
    public final void rule__DataType__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3204:1: ( ( ',' ) )
            // InternalDataDsl.g:3205:1: ( ',' )
            {
            // InternalDataDsl.g:3205:1: ( ',' )
            // InternalDataDsl.g:3206:2: ','
            {
             before(grammarAccess.getDataTypeAccess().getCommaKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__2__Impl"


    // $ANTLR start "rule__DataType__Group_2__3"
    // InternalDataDsl.g:3215:1: rule__DataType__Group_2__3 : rule__DataType__Group_2__3__Impl rule__DataType__Group_2__4 ;
    public final void rule__DataType__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3219:1: ( rule__DataType__Group_2__3__Impl rule__DataType__Group_2__4 )
            // InternalDataDsl.g:3220:2: rule__DataType__Group_2__3__Impl rule__DataType__Group_2__4
            {
            pushFollow(FOLLOW_24);
            rule__DataType__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__3"


    // $ANTLR start "rule__DataType__Group_2__3__Impl"
    // InternalDataDsl.g:3227:1: rule__DataType__Group_2__3__Impl : ( ( rule__DataType__MaxAssignment_2_3 )? ) ;
    public final void rule__DataType__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3231:1: ( ( ( rule__DataType__MaxAssignment_2_3 )? ) )
            // InternalDataDsl.g:3232:1: ( ( rule__DataType__MaxAssignment_2_3 )? )
            {
            // InternalDataDsl.g:3232:1: ( ( rule__DataType__MaxAssignment_2_3 )? )
            // InternalDataDsl.g:3233:2: ( rule__DataType__MaxAssignment_2_3 )?
            {
             before(grammarAccess.getDataTypeAccess().getMaxAssignment_2_3()); 
            // InternalDataDsl.g:3234:2: ( rule__DataType__MaxAssignment_2_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_INT||LA34_0==46) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDataDsl.g:3234:3: rule__DataType__MaxAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__MaxAssignment_2_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getMaxAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__3__Impl"


    // $ANTLR start "rule__DataType__Group_2__4"
    // InternalDataDsl.g:3242:1: rule__DataType__Group_2__4 : rule__DataType__Group_2__4__Impl ;
    public final void rule__DataType__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3246:1: ( rule__DataType__Group_2__4__Impl )
            // InternalDataDsl.g:3247:2: rule__DataType__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__4"


    // $ANTLR start "rule__DataType__Group_2__4__Impl"
    // InternalDataDsl.g:3253:1: rule__DataType__Group_2__4__Impl : ( ']' ) ;
    public final void rule__DataType__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3257:1: ( ( ']' ) )
            // InternalDataDsl.g:3258:1: ( ']' )
            {
            // InternalDataDsl.g:3258:1: ( ']' )
            // InternalDataDsl.g:3259:2: ']'
            {
             before(grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_2__4__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalDataDsl.g:3269:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3273:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalDataDsl.g:3274:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalDataDsl.g:3281:1: rule__Reference__Group__0__Impl : ( () ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3285:1: ( ( () ) )
            // InternalDataDsl.g:3286:1: ( () )
            {
            // InternalDataDsl.g:3286:1: ( () )
            // InternalDataDsl.g:3287:2: ()
            {
             before(grammarAccess.getReferenceAccess().getReferenceAction_0()); 
            // InternalDataDsl.g:3288:2: ()
            // InternalDataDsl.g:3288:3: 
            {
            }

             after(grammarAccess.getReferenceAccess().getReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalDataDsl.g:3296:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3300:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalDataDsl.g:3301:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalDataDsl.g:3308:1: rule__Reference__Group__1__Impl : ( 'ref:' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3312:1: ( ( 'ref:' ) )
            // InternalDataDsl.g:3313:1: ( 'ref:' )
            {
            // InternalDataDsl.g:3313:1: ( 'ref:' )
            // InternalDataDsl.g:3314:2: 'ref:'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalDataDsl.g:3323:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3327:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalDataDsl.g:3328:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalDataDsl.g:3335:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__ReferenceTypeAssignment_2 ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3339:1: ( ( ( rule__Reference__ReferenceTypeAssignment_2 ) ) )
            // InternalDataDsl.g:3340:1: ( ( rule__Reference__ReferenceTypeAssignment_2 ) )
            {
            // InternalDataDsl.g:3340:1: ( ( rule__Reference__ReferenceTypeAssignment_2 ) )
            // InternalDataDsl.g:3341:2: ( rule__Reference__ReferenceTypeAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getReferenceTypeAssignment_2()); 
            // InternalDataDsl.g:3342:2: ( rule__Reference__ReferenceTypeAssignment_2 )
            // InternalDataDsl.g:3342:3: rule__Reference__ReferenceTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reference__ReferenceTypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getReferenceTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalDataDsl.g:3350:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3354:1: ( rule__Reference__Group__3__Impl )
            // InternalDataDsl.g:3355:2: rule__Reference__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalDataDsl.g:3361:1: rule__Reference__Group__3__Impl : ( ( rule__Reference__Group_3__0 )? ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3365:1: ( ( ( rule__Reference__Group_3__0 )? ) )
            // InternalDataDsl.g:3366:1: ( ( rule__Reference__Group_3__0 )? )
            {
            // InternalDataDsl.g:3366:1: ( ( rule__Reference__Group_3__0 )? )
            // InternalDataDsl.g:3367:2: ( rule__Reference__Group_3__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_3()); 
            // InternalDataDsl.g:3368:2: ( rule__Reference__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataDsl.g:3368:3: rule__Reference__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group_3__0"
    // InternalDataDsl.g:3377:1: rule__Reference__Group_3__0 : rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 ;
    public final void rule__Reference__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3381:1: ( rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1 )
            // InternalDataDsl.g:3382:2: rule__Reference__Group_3__0__Impl rule__Reference__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Reference__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__0"


    // $ANTLR start "rule__Reference__Group_3__0__Impl"
    // InternalDataDsl.g:3389:1: rule__Reference__Group_3__0__Impl : ( '[' ) ;
    public final void rule__Reference__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3393:1: ( ( '[' ) )
            // InternalDataDsl.g:3394:1: ( '[' )
            {
            // InternalDataDsl.g:3394:1: ( '[' )
            // InternalDataDsl.g:3395:2: '['
            {
             before(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__0__Impl"


    // $ANTLR start "rule__Reference__Group_3__1"
    // InternalDataDsl.g:3404:1: rule__Reference__Group_3__1 : rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 ;
    public final void rule__Reference__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3408:1: ( rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2 )
            // InternalDataDsl.g:3409:2: rule__Reference__Group_3__1__Impl rule__Reference__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__Reference__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__1"


    // $ANTLR start "rule__Reference__Group_3__1__Impl"
    // InternalDataDsl.g:3416:1: rule__Reference__Group_3__1__Impl : ( ( rule__Reference__MinAssignment_3_1 ) ) ;
    public final void rule__Reference__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3420:1: ( ( ( rule__Reference__MinAssignment_3_1 ) ) )
            // InternalDataDsl.g:3421:1: ( ( rule__Reference__MinAssignment_3_1 ) )
            {
            // InternalDataDsl.g:3421:1: ( ( rule__Reference__MinAssignment_3_1 ) )
            // InternalDataDsl.g:3422:2: ( rule__Reference__MinAssignment_3_1 )
            {
             before(grammarAccess.getReferenceAccess().getMinAssignment_3_1()); 
            // InternalDataDsl.g:3423:2: ( rule__Reference__MinAssignment_3_1 )
            // InternalDataDsl.g:3423:3: rule__Reference__MinAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__MinAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getMinAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__1__Impl"


    // $ANTLR start "rule__Reference__Group_3__2"
    // InternalDataDsl.g:3431:1: rule__Reference__Group_3__2 : rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 ;
    public final void rule__Reference__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3435:1: ( rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3 )
            // InternalDataDsl.g:3436:2: rule__Reference__Group_3__2__Impl rule__Reference__Group_3__3
            {
            pushFollow(FOLLOW_24);
            rule__Reference__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__2"


    // $ANTLR start "rule__Reference__Group_3__2__Impl"
    // InternalDataDsl.g:3443:1: rule__Reference__Group_3__2__Impl : ( ',' ) ;
    public final void rule__Reference__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3447:1: ( ( ',' ) )
            // InternalDataDsl.g:3448:1: ( ',' )
            {
            // InternalDataDsl.g:3448:1: ( ',' )
            // InternalDataDsl.g:3449:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_3_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCommaKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__2__Impl"


    // $ANTLR start "rule__Reference__Group_3__3"
    // InternalDataDsl.g:3458:1: rule__Reference__Group_3__3 : rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 ;
    public final void rule__Reference__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3462:1: ( rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4 )
            // InternalDataDsl.g:3463:2: rule__Reference__Group_3__3__Impl rule__Reference__Group_3__4
            {
            pushFollow(FOLLOW_24);
            rule__Reference__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__3"


    // $ANTLR start "rule__Reference__Group_3__3__Impl"
    // InternalDataDsl.g:3470:1: rule__Reference__Group_3__3__Impl : ( ( rule__Reference__MaxAssignment_3_3 )? ) ;
    public final void rule__Reference__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3474:1: ( ( ( rule__Reference__MaxAssignment_3_3 )? ) )
            // InternalDataDsl.g:3475:1: ( ( rule__Reference__MaxAssignment_3_3 )? )
            {
            // InternalDataDsl.g:3475:1: ( ( rule__Reference__MaxAssignment_3_3 )? )
            // InternalDataDsl.g:3476:2: ( rule__Reference__MaxAssignment_3_3 )?
            {
             before(grammarAccess.getReferenceAccess().getMaxAssignment_3_3()); 
            // InternalDataDsl.g:3477:2: ( rule__Reference__MaxAssignment_3_3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT||LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataDsl.g:3477:3: rule__Reference__MaxAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__MaxAssignment_3_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getMaxAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__3__Impl"


    // $ANTLR start "rule__Reference__Group_3__4"
    // InternalDataDsl.g:3485:1: rule__Reference__Group_3__4 : rule__Reference__Group_3__4__Impl ;
    public final void rule__Reference__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3489:1: ( rule__Reference__Group_3__4__Impl )
            // InternalDataDsl.g:3490:2: rule__Reference__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__4"


    // $ANTLR start "rule__Reference__Group_3__4__Impl"
    // InternalDataDsl.g:3496:1: rule__Reference__Group_3__4__Impl : ( ']' ) ;
    public final void rule__Reference__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3500:1: ( ( ']' ) )
            // InternalDataDsl.g:3501:1: ( ']' )
            {
            // InternalDataDsl.g:3501:1: ( ']' )
            // InternalDataDsl.g:3502:2: ']'
            {
             before(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_3__4__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDataDsl.g:3512:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3516:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDataDsl.g:3517:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDataDsl.g:3524:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3528:1: ( ( ( '-' )? ) )
            // InternalDataDsl.g:3529:1: ( ( '-' )? )
            {
            // InternalDataDsl.g:3529:1: ( ( '-' )? )
            // InternalDataDsl.g:3530:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDataDsl.g:3531:2: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==46) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataDsl.g:3531:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDataDsl.g:3539:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3543:1: ( rule__EInt__Group__1__Impl )
            // InternalDataDsl.g:3544:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDataDsl.g:3550:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3554:1: ( ( RULE_INT ) )
            // InternalDataDsl.g:3555:1: ( RULE_INT )
            {
            // InternalDataDsl.g:3555:1: ( RULE_INT )
            // InternalDataDsl.g:3556:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__DataModel__ImportURIAssignment_1_1"
    // InternalDataDsl.g:3566:1: rule__DataModel__ImportURIAssignment_1_1 : ( ruleEString ) ;
    public final void rule__DataModel__ImportURIAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3570:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3571:2: ( ruleEString )
            {
            // InternalDataDsl.g:3571:2: ( ruleEString )
            // InternalDataDsl.g:3572:3: ruleEString
            {
             before(grammarAccess.getDataModelAccess().getImportURIEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getImportURIEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ImportURIAssignment_1_1"


    // $ANTLR start "rule__DataModel__ImportURIAssignment_1_2_1"
    // InternalDataDsl.g:3581:1: rule__DataModel__ImportURIAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__DataModel__ImportURIAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3585:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3586:2: ( ruleEString )
            {
            // InternalDataDsl.g:3586:2: ( ruleEString )
            // InternalDataDsl.g:3587:3: ruleEString
            {
             before(grammarAccess.getDataModelAccess().getImportURIEStringParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getImportURIEStringParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ImportURIAssignment_1_2_1"


    // $ANTLR start "rule__DataModel__DescriptionsAssignment_3"
    // InternalDataDsl.g:3596:1: rule__DataModel__DescriptionsAssignment_3 : ( ruleDataDescription ) ;
    public final void rule__DataModel__DescriptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3600:1: ( ( ruleDataDescription ) )
            // InternalDataDsl.g:3601:2: ( ruleDataDescription )
            {
            // InternalDataDsl.g:3601:2: ( ruleDataDescription )
            // InternalDataDsl.g:3602:3: ruleDataDescription
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDataDescription();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__DescriptionsAssignment_3"


    // $ANTLR start "rule__DataModel__DescriptionsAssignment_4_1"
    // InternalDataDsl.g:3611:1: rule__DataModel__DescriptionsAssignment_4_1 : ( ruleDataDescription ) ;
    public final void rule__DataModel__DescriptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3615:1: ( ( ruleDataDescription ) )
            // InternalDataDsl.g:3616:2: ( ruleDataDescription )
            {
            // InternalDataDsl.g:3616:2: ( ruleDataDescription )
            // InternalDataDsl.g:3617:3: ruleDataDescription
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataDescription();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__DescriptionsAssignment_4_1"


    // $ANTLR start "rule__DataSource__FormatAssignment_1"
    // InternalDataDsl.g:3626:1: rule__DataSource__FormatAssignment_1 : ( ruleFormatSpecification ) ;
    public final void rule__DataSource__FormatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3630:1: ( ( ruleFormatSpecification ) )
            // InternalDataDsl.g:3631:2: ( ruleFormatSpecification )
            {
            // InternalDataDsl.g:3631:2: ( ruleFormatSpecification )
            // InternalDataDsl.g:3632:3: ruleFormatSpecification
            {
             before(grammarAccess.getDataSourceAccess().getFormatFormatSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormatSpecification();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getFormatFormatSpecificationParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalDataDsl.g:3641:1: rule__DataSource__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DataSource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3645:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3646:2: ( ruleEString )
            {
            // InternalDataDsl.g:3646:2: ( ruleEString )
            // InternalDataDsl.g:3647:3: ruleEString
            {
             before(grammarAccess.getDataSourceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataSource__LinkAssignment_3_0"
    // InternalDataDsl.g:3656:1: rule__DataSource__LinkAssignment_3_0 : ( ruleEString ) ;
    public final void rule__DataSource__LinkAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3660:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3661:2: ( ruleEString )
            {
            // InternalDataDsl.g:3661:2: ( ruleEString )
            // InternalDataDsl.g:3662:3: ruleEString
            {
             before(grammarAccess.getDataSourceAccess().getLinkEStringParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getLinkEStringParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__LinkAssignment_3_0"


    // $ANTLR start "rule__DataSource__LinkAssignment_3_1_1"
    // InternalDataDsl.g:3671:1: rule__DataSource__LinkAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__DataSource__LinkAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3675:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3676:2: ( ruleEString )
            {
            // InternalDataDsl.g:3676:2: ( ruleEString )
            // InternalDataDsl.g:3677:3: ruleEString
            {
             before(grammarAccess.getDataSourceAccess().getLinkEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getLinkEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__LinkAssignment_3_1_1"


    // $ANTLR start "rule__DataSource__FragmentsAssignment_4_1"
    // InternalDataDsl.g:3686:1: rule__DataSource__FragmentsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__DataSource__FragmentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3690:1: ( ( ( ruleEString ) ) )
            // InternalDataDsl.g:3691:2: ( ( ruleEString ) )
            {
            // InternalDataDsl.g:3691:2: ( ( ruleEString ) )
            // InternalDataDsl.g:3692:3: ( ruleEString )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_1_0()); 
            // InternalDataDsl.g:3693:3: ( ruleEString )
            // InternalDataDsl.g:3694:4: ruleEString
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__FragmentsAssignment_4_1"


    // $ANTLR start "rule__DataSource__FragmentsAssignment_4_2_1"
    // InternalDataDsl.g:3705:1: rule__DataSource__FragmentsAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__DataSource__FragmentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3709:1: ( ( ( ruleEString ) ) )
            // InternalDataDsl.g:3710:2: ( ( ruleEString ) )
            {
            // InternalDataDsl.g:3710:2: ( ( ruleEString ) )
            // InternalDataDsl.g:3711:3: ( ruleEString )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_2_1_0()); 
            // InternalDataDsl.g:3712:3: ( ruleEString )
            // InternalDataDsl.g:3713:4: ruleEString
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__FragmentsAssignment_4_2_1"


    // $ANTLR start "rule__DataSource__NodesAssignment_7_0"
    // InternalDataDsl.g:3724:1: rule__DataSource__NodesAssignment_7_0 : ( ruleNode ) ;
    public final void rule__DataSource__NodesAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3728:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3729:2: ( ruleNode )
            {
            // InternalDataDsl.g:3729:2: ( ruleNode )
            // InternalDataDsl.g:3730:3: ruleNode
            {
             before(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__NodesAssignment_7_0"


    // $ANTLR start "rule__DataSource__NodesAssignment_7_1_1"
    // InternalDataDsl.g:3739:1: rule__DataSource__NodesAssignment_7_1_1 : ( ruleNode ) ;
    public final void rule__DataSource__NodesAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3743:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3744:2: ( ruleNode )
            {
            // InternalDataDsl.g:3744:2: ( ruleNode )
            // InternalDataDsl.g:3745:3: ruleNode
            {
             before(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_7_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getNodesNodeParserRuleCall_7_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__NodesAssignment_7_1_1"


    // $ANTLR start "rule__DataSource__OptionsAssignment_9_1"
    // InternalDataDsl.g:3754:1: rule__DataSource__OptionsAssignment_9_1 : ( ruleOption ) ;
    public final void rule__DataSource__OptionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3758:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3759:2: ( ruleOption )
            {
            // InternalDataDsl.g:3759:2: ( ruleOption )
            // InternalDataDsl.g:3760:3: ruleOption
            {
             before(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__OptionsAssignment_9_1"


    // $ANTLR start "rule__DataSource__OptionsAssignment_9_2_1"
    // InternalDataDsl.g:3769:1: rule__DataSource__OptionsAssignment_9_2_1 : ( ruleOption ) ;
    public final void rule__DataSource__OptionsAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3773:1: ( ( ruleOption ) )
            // InternalDataDsl.g:3774:2: ( ruleOption )
            {
            // InternalDataDsl.g:3774:2: ( ruleOption )
            // InternalDataDsl.g:3775:3: ruleOption
            {
             before(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_9_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataSourceAccess().getOptionsOptionParserRuleCall_9_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataSource__OptionsAssignment_9_2_1"


    // $ANTLR start "rule__DataFragment__NameAssignment_1"
    // InternalDataDsl.g:3784:1: rule__DataFragment__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DataFragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3788:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3789:2: ( ruleEString )
            {
            // InternalDataDsl.g:3789:2: ( ruleEString )
            // InternalDataDsl.g:3790:3: ruleEString
            {
             before(grammarAccess.getDataFragmentAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataFragmentAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataFragment__NodesAssignment_4_0"
    // InternalDataDsl.g:3799:1: rule__DataFragment__NodesAssignment_4_0 : ( ruleNode ) ;
    public final void rule__DataFragment__NodesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3803:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3804:2: ( ruleNode )
            {
            // InternalDataDsl.g:3804:2: ( ruleNode )
            // InternalDataDsl.g:3805:3: ruleNode
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
    // InternalDataDsl.g:3814:1: rule__DataFragment__NodesAssignment_4_1_1 : ( ruleNode ) ;
    public final void rule__DataFragment__NodesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3818:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3819:2: ( ruleNode )
            {
            // InternalDataDsl.g:3819:2: ( ruleNode )
            // InternalDataDsl.g:3820:3: ruleNode
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


    // $ANTLR start "rule__FormatSpecification__SpecialFormatAssignment_0"
    // InternalDataDsl.g:3829:1: rule__FormatSpecification__SpecialFormatAssignment_0 : ( ruleEString ) ;
    public final void rule__FormatSpecification__SpecialFormatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3833:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3834:2: ( ruleEString )
            {
            // InternalDataDsl.g:3834:2: ( ruleEString )
            // InternalDataDsl.g:3835:3: ruleEString
            {
             before(grammarAccess.getFormatSpecificationAccess().getSpecialFormatEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFormatSpecificationAccess().getSpecialFormatEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSpecification__SpecialFormatAssignment_0"


    // $ANTLR start "rule__FormatSpecification__FormatAssignment_1"
    // InternalDataDsl.g:3844:1: rule__FormatSpecification__FormatAssignment_1 : ( ruleFormatKind ) ;
    public final void rule__FormatSpecification__FormatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3848:1: ( ( ruleFormatKind ) )
            // InternalDataDsl.g:3849:2: ( ruleFormatKind )
            {
            // InternalDataDsl.g:3849:2: ( ruleFormatKind )
            // InternalDataDsl.g:3850:3: ruleFormatKind
            {
             before(grammarAccess.getFormatSpecificationAccess().getFormatFormatKindEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFormatKind();

            state._fsp--;

             after(grammarAccess.getFormatSpecificationAccess().getFormatFormatKindEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSpecification__FormatAssignment_1"


    // $ANTLR start "rule__Option__KeyAssignment_1"
    // InternalDataDsl.g:3859:1: rule__Option__KeyAssignment_1 : ( ruleEString ) ;
    public final void rule__Option__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3863:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3864:2: ( ruleEString )
            {
            // InternalDataDsl.g:3864:2: ( ruleEString )
            // InternalDataDsl.g:3865:3: ruleEString
            {
             before(grammarAccess.getOptionAccess().getKeyEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getKeyEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__KeyAssignment_1"


    // $ANTLR start "rule__Option__ValuesAssignment_4"
    // InternalDataDsl.g:3874:1: rule__Option__ValuesAssignment_4 : ( ruleEString ) ;
    public final void rule__Option__ValuesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3878:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3879:2: ( ruleEString )
            {
            // InternalDataDsl.g:3879:2: ( ruleEString )
            // InternalDataDsl.g:3880:3: ruleEString
            {
             before(grammarAccess.getOptionAccess().getValuesEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getValuesEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__ValuesAssignment_4"


    // $ANTLR start "rule__Option__ValuesAssignment_5_1"
    // InternalDataDsl.g:3889:1: rule__Option__ValuesAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Option__ValuesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3893:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3894:2: ( ruleEString )
            {
            // InternalDataDsl.g:3894:2: ( ruleEString )
            // InternalDataDsl.g:3895:3: ruleEString
            {
             before(grammarAccess.getOptionAccess().getValuesEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getValuesEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__ValuesAssignment_5_1"


    // $ANTLR start "rule__CompositeNode__EnvironmentAssignment_1"
    // InternalDataDsl.g:3904:1: rule__CompositeNode__EnvironmentAssignment_1 : ( ( '>' ) ) ;
    public final void rule__CompositeNode__EnvironmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3908:1: ( ( ( '>' ) ) )
            // InternalDataDsl.g:3909:2: ( ( '>' ) )
            {
            // InternalDataDsl.g:3909:2: ( ( '>' ) )
            // InternalDataDsl.g:3910:3: ( '>' )
            {
             before(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_1_0()); 
            // InternalDataDsl.g:3911:3: ( '>' )
            // InternalDataDsl.g:3912:4: '>'
            {
             before(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_1_0()); 

            }

             after(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__EnvironmentAssignment_1"


    // $ANTLR start "rule__CompositeNode__NameAssignment_2"
    // InternalDataDsl.g:3923:1: rule__CompositeNode__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__CompositeNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3927:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3928:2: ( ruleEString )
            {
            // InternalDataDsl.g:3928:2: ( ruleEString )
            // InternalDataDsl.g:3929:3: ruleEString
            {
             before(grammarAccess.getCompositeNodeAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeNode__RepresentedAsAssignment_3"
    // InternalDataDsl.g:3938:1: rule__CompositeNode__RepresentedAsAssignment_3 : ( ruleEString ) ;
    public final void rule__CompositeNode__RepresentedAsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3942:1: ( ( ruleEString ) )
            // InternalDataDsl.g:3943:2: ( ruleEString )
            {
            // InternalDataDsl.g:3943:2: ( ruleEString )
            // InternalDataDsl.g:3944:3: ruleEString
            {
             before(grammarAccess.getCompositeNodeAccess().getRepresentedAsEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getRepresentedAsEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__RepresentedAsAssignment_3"


    // $ANTLR start "rule__CompositeNode__ExtendsAssignment_4_1"
    // InternalDataDsl.g:3953:1: rule__CompositeNode__ExtendsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeNode__ExtendsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3957:1: ( ( ( ruleEString ) ) )
            // InternalDataDsl.g:3958:2: ( ( ruleEString ) )
            {
            // InternalDataDsl.g:3958:2: ( ( ruleEString ) )
            // InternalDataDsl.g:3959:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_4_1_0()); 
            // InternalDataDsl.g:3960:3: ( ruleEString )
            // InternalDataDsl.g:3961:4: ruleEString
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__ExtendsAssignment_4_1"


    // $ANTLR start "rule__CompositeNode__ExtendsAssignment_4_2_1"
    // InternalDataDsl.g:3972:1: rule__CompositeNode__ExtendsAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__CompositeNode__ExtendsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3976:1: ( ( ( ruleEString ) ) )
            // InternalDataDsl.g:3977:2: ( ( ruleEString ) )
            {
            // InternalDataDsl.g:3977:2: ( ( ruleEString ) )
            // InternalDataDsl.g:3978:3: ( ruleEString )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_4_2_1_0()); 
            // InternalDataDsl.g:3979:3: ( ruleEString )
            // InternalDataDsl.g:3980:4: ruleEString
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__ExtendsAssignment_4_2_1"


    // $ANTLR start "rule__CompositeNode__SubnodesAssignment_5_2_0"
    // InternalDataDsl.g:3991:1: rule__CompositeNode__SubnodesAssignment_5_2_0 : ( ruleNode ) ;
    public final void rule__CompositeNode__SubnodesAssignment_5_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:3995:1: ( ( ruleNode ) )
            // InternalDataDsl.g:3996:2: ( ruleNode )
            {
            // InternalDataDsl.g:3996:2: ( ruleNode )
            // InternalDataDsl.g:3997:3: ruleNode
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__SubnodesAssignment_5_2_0"


    // $ANTLR start "rule__CompositeNode__SubnodesAssignment_5_2_1_1"
    // InternalDataDsl.g:4006:1: rule__CompositeNode__SubnodesAssignment_5_2_1_1 : ( ruleNode ) ;
    public final void rule__CompositeNode__SubnodesAssignment_5_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4010:1: ( ( ruleNode ) )
            // InternalDataDsl.g:4011:2: ( ruleNode )
            {
            // InternalDataDsl.g:4011:2: ( ruleNode )
            // InternalDataDsl.g:4012:3: ruleNode
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_5_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__SubnodesAssignment_5_2_1_1"


    // $ANTLR start "rule__LeafNode__KeyAssignment_1"
    // InternalDataDsl.g:4021:1: rule__LeafNode__KeyAssignment_1 : ( ( 'key' ) ) ;
    public final void rule__LeafNode__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4025:1: ( ( ( 'key' ) ) )
            // InternalDataDsl.g:4026:2: ( ( 'key' ) )
            {
            // InternalDataDsl.g:4026:2: ( ( 'key' ) )
            // InternalDataDsl.g:4027:3: ( 'key' )
            {
             before(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_1_0()); 
            // InternalDataDsl.g:4028:3: ( 'key' )
            // InternalDataDsl.g:4029:4: 'key'
            {
             before(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_1_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__KeyAssignment_1"


    // $ANTLR start "rule__LeafNode__UniqueAssignment_2"
    // InternalDataDsl.g:4040:1: rule__LeafNode__UniqueAssignment_2 : ( ( 'unique' ) ) ;
    public final void rule__LeafNode__UniqueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4044:1: ( ( ( 'unique' ) ) )
            // InternalDataDsl.g:4045:2: ( ( 'unique' ) )
            {
            // InternalDataDsl.g:4045:2: ( ( 'unique' ) )
            // InternalDataDsl.g:4046:3: ( 'unique' )
            {
             before(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_2_0()); 
            // InternalDataDsl.g:4047:3: ( 'unique' )
            // InternalDataDsl.g:4048:4: 'unique'
            {
             before(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_2_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__UniqueAssignment_2"


    // $ANTLR start "rule__LeafNode__TypeAssignment_3"
    // InternalDataDsl.g:4059:1: rule__LeafNode__TypeAssignment_3 : ( ruleTypeSpecification ) ;
    public final void rule__LeafNode__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4063:1: ( ( ruleTypeSpecification ) )
            // InternalDataDsl.g:4064:2: ( ruleTypeSpecification )
            {
            // InternalDataDsl.g:4064:2: ( ruleTypeSpecification )
            // InternalDataDsl.g:4065:3: ruleTypeSpecification
            {
             before(grammarAccess.getLeafNodeAccess().getTypeTypeSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSpecification();

            state._fsp--;

             after(grammarAccess.getLeafNodeAccess().getTypeTypeSpecificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__TypeAssignment_3"


    // $ANTLR start "rule__LeafNode__KeywordAssignment_4"
    // InternalDataDsl.g:4074:1: rule__LeafNode__KeywordAssignment_4 : ( ( '#' ) ) ;
    public final void rule__LeafNode__KeywordAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4078:1: ( ( ( '#' ) ) )
            // InternalDataDsl.g:4079:2: ( ( '#' ) )
            {
            // InternalDataDsl.g:4079:2: ( ( '#' ) )
            // InternalDataDsl.g:4080:3: ( '#' )
            {
             before(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_4_0()); 
            // InternalDataDsl.g:4081:3: ( '#' )
            // InternalDataDsl.g:4082:4: '#'
            {
             before(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_4_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_4_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__KeywordAssignment_4"


    // $ANTLR start "rule__LeafNode__NameAssignment_5"
    // InternalDataDsl.g:4093:1: rule__LeafNode__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__LeafNode__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4097:1: ( ( ruleEString ) )
            // InternalDataDsl.g:4098:2: ( ruleEString )
            {
            // InternalDataDsl.g:4098:2: ( ruleEString )
            // InternalDataDsl.g:4099:3: ruleEString
            {
             before(grammarAccess.getLeafNodeAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeafNodeAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__NameAssignment_5"


    // $ANTLR start "rule__LeafNode__RepresentedAsAssignment_6"
    // InternalDataDsl.g:4108:1: rule__LeafNode__RepresentedAsAssignment_6 : ( ruleEString ) ;
    public final void rule__LeafNode__RepresentedAsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4112:1: ( ( ruleEString ) )
            // InternalDataDsl.g:4113:2: ( ruleEString )
            {
            // InternalDataDsl.g:4113:2: ( ruleEString )
            // InternalDataDsl.g:4114:3: ruleEString
            {
             before(grammarAccess.getLeafNodeAccess().getRepresentedAsEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeafNodeAccess().getRepresentedAsEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__RepresentedAsAssignment_6"


    // $ANTLR start "rule__DataType__SpecialTypeAssignment_1_0"
    // InternalDataDsl.g:4123:1: rule__DataType__SpecialTypeAssignment_1_0 : ( ruleEString ) ;
    public final void rule__DataType__SpecialTypeAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4127:1: ( ( ruleEString ) )
            // InternalDataDsl.g:4128:2: ( ruleEString )
            {
            // InternalDataDsl.g:4128:2: ( ruleEString )
            // InternalDataDsl.g:4129:3: ruleEString
            {
             before(grammarAccess.getDataTypeAccess().getSpecialTypeEStringParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getSpecialTypeEStringParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__SpecialTypeAssignment_1_0"


    // $ANTLR start "rule__DataType__TypeAssignment_1_1"
    // InternalDataDsl.g:4138:1: rule__DataType__TypeAssignment_1_1 : ( ruleTypeKind ) ;
    public final void rule__DataType__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4142:1: ( ( ruleTypeKind ) )
            // InternalDataDsl.g:4143:2: ( ruleTypeKind )
            {
            // InternalDataDsl.g:4143:2: ( ruleTypeKind )
            // InternalDataDsl.g:4144:3: ruleTypeKind
            {
             before(grammarAccess.getDataTypeAccess().getTypeTypeKindEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeKind();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getTypeTypeKindEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__TypeAssignment_1_1"


    // $ANTLR start "rule__DataType__MinAssignment_2_1"
    // InternalDataDsl.g:4153:1: rule__DataType__MinAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__DataType__MinAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4157:1: ( ( ruleEInt ) )
            // InternalDataDsl.g:4158:2: ( ruleEInt )
            {
            // InternalDataDsl.g:4158:2: ( ruleEInt )
            // InternalDataDsl.g:4159:3: ruleEInt
            {
             before(grammarAccess.getDataTypeAccess().getMinEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getMinEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__MinAssignment_2_1"


    // $ANTLR start "rule__DataType__MaxAssignment_2_3"
    // InternalDataDsl.g:4168:1: rule__DataType__MaxAssignment_2_3 : ( ruleEInt ) ;
    public final void rule__DataType__MaxAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4172:1: ( ( ruleEInt ) )
            // InternalDataDsl.g:4173:2: ( ruleEInt )
            {
            // InternalDataDsl.g:4173:2: ( ruleEInt )
            // InternalDataDsl.g:4174:3: ruleEInt
            {
             before(grammarAccess.getDataTypeAccess().getMaxEIntParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getMaxEIntParserRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__MaxAssignment_2_3"


    // $ANTLR start "rule__Reference__ReferenceTypeAssignment_2"
    // InternalDataDsl.g:4183:1: rule__Reference__ReferenceTypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Reference__ReferenceTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4187:1: ( ( ( ruleEString ) ) )
            // InternalDataDsl.g:4188:2: ( ( ruleEString ) )
            {
            // InternalDataDsl.g:4188:2: ( ( ruleEString ) )
            // InternalDataDsl.g:4189:3: ( ruleEString )
            {
             before(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeCrossReference_2_0()); 
            // InternalDataDsl.g:4190:3: ( ruleEString )
            // InternalDataDsl.g:4191:4: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ReferenceTypeAssignment_2"


    // $ANTLR start "rule__Reference__MinAssignment_3_1"
    // InternalDataDsl.g:4202:1: rule__Reference__MinAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__Reference__MinAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4206:1: ( ( ruleEInt ) )
            // InternalDataDsl.g:4207:2: ( ruleEInt )
            {
            // InternalDataDsl.g:4207:2: ( ruleEInt )
            // InternalDataDsl.g:4208:3: ruleEInt
            {
             before(grammarAccess.getReferenceAccess().getMinEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getMinEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__MinAssignment_3_1"


    // $ANTLR start "rule__Reference__MaxAssignment_3_3"
    // InternalDataDsl.g:4217:1: rule__Reference__MaxAssignment_3_3 : ( ruleEInt ) ;
    public final void rule__Reference__MaxAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDsl.g:4221:1: ( ( ruleEInt ) )
            // InternalDataDsl.g:4222:2: ( ruleEInt )
            {
            // InternalDataDsl.g:4222:2: ( ruleEInt )
            // InternalDataDsl.g:4223:3: ruleEInt
            {
             before(grammarAccess.getReferenceAccess().getMaxEIntParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getMaxEIntParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__MaxAssignment_3_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003830L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000006000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0003A002FFFFC030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0003A000FFFFC030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000800000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000082000000030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0004000000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000FFFFC030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000410000000040L});

}