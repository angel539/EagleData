package eagledata.core.dsl.datadescription.ide.contentassist.antlr.internal;

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
import eagledata.core.dsl.datadescription.services.DataDescriptionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDataDescriptionDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CSV'", "'JSON'", "'XML'", "'string'", "'numeral'", "'date'", "'time'", "'year'", "'month'", "'day'", "'boolean'", "'place'", "'latitude'", "'longitude'", "'UTMe'", "'UTMn'", "'UTMz'", "'UTMHemi'", "'name'", "'familyname'", "'personalID'", "'{'", "'}'", "'import'", "','", "'description'", "'='", "'uses'", "'['", "']'", "'fragment'", "')'", "'extends'", "'('", "'remove'", "'retype'", "'as'", "'rename'", "'ref:'", "'>'", "'key'", "'unique'", "'#'"
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
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
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


        public InternalDataDescriptionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDataDescriptionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDataDescriptionDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDataDescriptionDsl.g"; }


    	private DataDescriptionDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(DataDescriptionDslGrammarAccess grammarAccess) {
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
    // InternalDataDescriptionDsl.g:53:1: entryRuleDataModel : ruleDataModel EOF ;
    public final void entryRuleDataModel() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:54:1: ( ruleDataModel EOF )
            // InternalDataDescriptionDsl.g:55:1: ruleDataModel EOF
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
    // InternalDataDescriptionDsl.g:62:1: ruleDataModel : ( ( rule__DataModel__Group__0 ) ) ;
    public final void ruleDataModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:66:2: ( ( ( rule__DataModel__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:67:2: ( ( rule__DataModel__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:67:2: ( ( rule__DataModel__Group__0 ) )
            // InternalDataDescriptionDsl.g:68:3: ( rule__DataModel__Group__0 )
            {
             before(grammarAccess.getDataModelAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:69:3: ( rule__DataModel__Group__0 )
            // InternalDataDescriptionDsl.g:69:4: rule__DataModel__Group__0
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
    // InternalDataDescriptionDsl.g:78:1: entryRuleDataDescription : ruleDataDescription EOF ;
    public final void entryRuleDataDescription() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:79:1: ( ruleDataDescription EOF )
            // InternalDataDescriptionDsl.g:80:1: ruleDataDescription EOF
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
    // InternalDataDescriptionDsl.g:87:1: ruleDataDescription : ( ( rule__DataDescription__Alternatives ) ) ;
    public final void ruleDataDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:91:2: ( ( ( rule__DataDescription__Alternatives ) ) )
            // InternalDataDescriptionDsl.g:92:2: ( ( rule__DataDescription__Alternatives ) )
            {
            // InternalDataDescriptionDsl.g:92:2: ( ( rule__DataDescription__Alternatives ) )
            // InternalDataDescriptionDsl.g:93:3: ( rule__DataDescription__Alternatives )
            {
             before(grammarAccess.getDataDescriptionAccess().getAlternatives()); 
            // InternalDataDescriptionDsl.g:94:3: ( rule__DataDescription__Alternatives )
            // InternalDataDescriptionDsl.g:94:4: rule__DataDescription__Alternatives
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
    // InternalDataDescriptionDsl.g:103:1: entryRuleDataSource : ruleDataSource EOF ;
    public final void entryRuleDataSource() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:104:1: ( ruleDataSource EOF )
            // InternalDataDescriptionDsl.g:105:1: ruleDataSource EOF
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
    // InternalDataDescriptionDsl.g:112:1: ruleDataSource : ( ( rule__DataSource__Group__0 ) ) ;
    public final void ruleDataSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:116:2: ( ( ( rule__DataSource__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:117:2: ( ( rule__DataSource__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:117:2: ( ( rule__DataSource__Group__0 ) )
            // InternalDataDescriptionDsl.g:118:3: ( rule__DataSource__Group__0 )
            {
             before(grammarAccess.getDataSourceAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:119:3: ( rule__DataSource__Group__0 )
            // InternalDataDescriptionDsl.g:119:4: rule__DataSource__Group__0
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
    // InternalDataDescriptionDsl.g:128:1: entryRuleDataFragment : ruleDataFragment EOF ;
    public final void entryRuleDataFragment() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:129:1: ( ruleDataFragment EOF )
            // InternalDataDescriptionDsl.g:130:1: ruleDataFragment EOF
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
    // InternalDataDescriptionDsl.g:137:1: ruleDataFragment : ( ( rule__DataFragment__Group__0 ) ) ;
    public final void ruleDataFragment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:141:2: ( ( ( rule__DataFragment__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:142:2: ( ( rule__DataFragment__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:142:2: ( ( rule__DataFragment__Group__0 ) )
            // InternalDataDescriptionDsl.g:143:3: ( rule__DataFragment__Group__0 )
            {
             before(grammarAccess.getDataFragmentAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:144:3: ( rule__DataFragment__Group__0 )
            // InternalDataDescriptionDsl.g:144:4: rule__DataFragment__Group__0
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
    // InternalDataDescriptionDsl.g:153:1: entryRuleFormatSpecification : ruleFormatSpecification EOF ;
    public final void entryRuleFormatSpecification() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:154:1: ( ruleFormatSpecification EOF )
            // InternalDataDescriptionDsl.g:155:1: ruleFormatSpecification EOF
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
    // InternalDataDescriptionDsl.g:162:1: ruleFormatSpecification : ( ( rule__FormatSpecification__Alternatives ) ) ;
    public final void ruleFormatSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:166:2: ( ( ( rule__FormatSpecification__Alternatives ) ) )
            // InternalDataDescriptionDsl.g:167:2: ( ( rule__FormatSpecification__Alternatives ) )
            {
            // InternalDataDescriptionDsl.g:167:2: ( ( rule__FormatSpecification__Alternatives ) )
            // InternalDataDescriptionDsl.g:168:3: ( rule__FormatSpecification__Alternatives )
            {
             before(grammarAccess.getFormatSpecificationAccess().getAlternatives()); 
            // InternalDataDescriptionDsl.g:169:3: ( rule__FormatSpecification__Alternatives )
            // InternalDataDescriptionDsl.g:169:4: rule__FormatSpecification__Alternatives
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
    // InternalDataDescriptionDsl.g:178:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:179:1: ( ruleOption EOF )
            // InternalDataDescriptionDsl.g:180:1: ruleOption EOF
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
    // InternalDataDescriptionDsl.g:187:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:191:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:192:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:192:2: ( ( rule__Option__Group__0 ) )
            // InternalDataDescriptionDsl.g:193:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:194:3: ( rule__Option__Group__0 )
            // InternalDataDescriptionDsl.g:194:4: rule__Option__Group__0
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
    // InternalDataDescriptionDsl.g:203:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:204:1: ( ruleNode EOF )
            // InternalDataDescriptionDsl.g:205:1: ruleNode EOF
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
    // InternalDataDescriptionDsl.g:212:1: ruleNode : ( ( rule__Node__Alternatives ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:216:2: ( ( ( rule__Node__Alternatives ) ) )
            // InternalDataDescriptionDsl.g:217:2: ( ( rule__Node__Alternatives ) )
            {
            // InternalDataDescriptionDsl.g:217:2: ( ( rule__Node__Alternatives ) )
            // InternalDataDescriptionDsl.g:218:3: ( rule__Node__Alternatives )
            {
             before(grammarAccess.getNodeAccess().getAlternatives()); 
            // InternalDataDescriptionDsl.g:219:3: ( rule__Node__Alternatives )
            // InternalDataDescriptionDsl.g:219:4: rule__Node__Alternatives
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
    // InternalDataDescriptionDsl.g:228:1: entryRuleCompositeNode : ruleCompositeNode EOF ;
    public final void entryRuleCompositeNode() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:229:1: ( ruleCompositeNode EOF )
            // InternalDataDescriptionDsl.g:230:1: ruleCompositeNode EOF
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
    // InternalDataDescriptionDsl.g:237:1: ruleCompositeNode : ( ( rule__CompositeNode__Group__0 ) ) ;
    public final void ruleCompositeNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:241:2: ( ( ( rule__CompositeNode__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:242:2: ( ( rule__CompositeNode__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:242:2: ( ( rule__CompositeNode__Group__0 ) )
            // InternalDataDescriptionDsl.g:243:3: ( rule__CompositeNode__Group__0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:244:3: ( rule__CompositeNode__Group__0 )
            // InternalDataDescriptionDsl.g:244:4: rule__CompositeNode__Group__0
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
    // InternalDataDescriptionDsl.g:253:1: entryRuleLeafNode : ruleLeafNode EOF ;
    public final void entryRuleLeafNode() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:254:1: ( ruleLeafNode EOF )
            // InternalDataDescriptionDsl.g:255:1: ruleLeafNode EOF
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
    // InternalDataDescriptionDsl.g:262:1: ruleLeafNode : ( ( rule__LeafNode__Group__0 ) ) ;
    public final void ruleLeafNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:266:2: ( ( ( rule__LeafNode__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:267:2: ( ( rule__LeafNode__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:267:2: ( ( rule__LeafNode__Group__0 ) )
            // InternalDataDescriptionDsl.g:268:3: ( rule__LeafNode__Group__0 )
            {
             before(grammarAccess.getLeafNodeAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:269:3: ( rule__LeafNode__Group__0 )
            // InternalDataDescriptionDsl.g:269:4: rule__LeafNode__Group__0
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


    // $ANTLR start "entryRuleRemove"
    // InternalDataDescriptionDsl.g:278:1: entryRuleRemove : ruleRemove EOF ;
    public final void entryRuleRemove() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:279:1: ( ruleRemove EOF )
            // InternalDataDescriptionDsl.g:280:1: ruleRemove EOF
            {
             before(grammarAccess.getRemoveRule()); 
            pushFollow(FOLLOW_1);
            ruleRemove();

            state._fsp--;

             after(grammarAccess.getRemoveRule()); 
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
    // $ANTLR end "entryRuleRemove"


    // $ANTLR start "ruleRemove"
    // InternalDataDescriptionDsl.g:287:1: ruleRemove : ( ( rule__Remove__Group__0 ) ) ;
    public final void ruleRemove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:291:2: ( ( ( rule__Remove__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:292:2: ( ( rule__Remove__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:292:2: ( ( rule__Remove__Group__0 ) )
            // InternalDataDescriptionDsl.g:293:3: ( rule__Remove__Group__0 )
            {
             before(grammarAccess.getRemoveAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:294:3: ( rule__Remove__Group__0 )
            // InternalDataDescriptionDsl.g:294:4: rule__Remove__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Remove__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRemoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRemove"


    // $ANTLR start "entryRuleRetype"
    // InternalDataDescriptionDsl.g:303:1: entryRuleRetype : ruleRetype EOF ;
    public final void entryRuleRetype() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:304:1: ( ruleRetype EOF )
            // InternalDataDescriptionDsl.g:305:1: ruleRetype EOF
            {
             before(grammarAccess.getRetypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRetype();

            state._fsp--;

             after(grammarAccess.getRetypeRule()); 
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
    // $ANTLR end "entryRuleRetype"


    // $ANTLR start "ruleRetype"
    // InternalDataDescriptionDsl.g:312:1: ruleRetype : ( ( rule__Retype__Group__0 ) ) ;
    public final void ruleRetype() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:316:2: ( ( ( rule__Retype__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:317:2: ( ( rule__Retype__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:317:2: ( ( rule__Retype__Group__0 ) )
            // InternalDataDescriptionDsl.g:318:3: ( rule__Retype__Group__0 )
            {
             before(grammarAccess.getRetypeAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:319:3: ( rule__Retype__Group__0 )
            // InternalDataDescriptionDsl.g:319:4: rule__Retype__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Retype__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRetypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRetype"


    // $ANTLR start "entryRuleRename"
    // InternalDataDescriptionDsl.g:328:1: entryRuleRename : ruleRename EOF ;
    public final void entryRuleRename() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:329:1: ( ruleRename EOF )
            // InternalDataDescriptionDsl.g:330:1: ruleRename EOF
            {
             before(grammarAccess.getRenameRule()); 
            pushFollow(FOLLOW_1);
            ruleRename();

            state._fsp--;

             after(grammarAccess.getRenameRule()); 
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
    // $ANTLR end "entryRuleRename"


    // $ANTLR start "ruleRename"
    // InternalDataDescriptionDsl.g:337:1: ruleRename : ( ( rule__Rename__Group__0 ) ) ;
    public final void ruleRename() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:341:2: ( ( ( rule__Rename__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:342:2: ( ( rule__Rename__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:342:2: ( ( rule__Rename__Group__0 ) )
            // InternalDataDescriptionDsl.g:343:3: ( rule__Rename__Group__0 )
            {
             before(grammarAccess.getRenameAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:344:3: ( rule__Rename__Group__0 )
            // InternalDataDescriptionDsl.g:344:4: rule__Rename__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rename__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRenameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRename"


    // $ANTLR start "entryRuleTypeSpecification"
    // InternalDataDescriptionDsl.g:353:1: entryRuleTypeSpecification : ruleTypeSpecification EOF ;
    public final void entryRuleTypeSpecification() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:354:1: ( ruleTypeSpecification EOF )
            // InternalDataDescriptionDsl.g:355:1: ruleTypeSpecification EOF
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
    // InternalDataDescriptionDsl.g:362:1: ruleTypeSpecification : ( ( rule__TypeSpecification__Alternatives ) ) ;
    public final void ruleTypeSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:366:2: ( ( ( rule__TypeSpecification__Alternatives ) ) )
            // InternalDataDescriptionDsl.g:367:2: ( ( rule__TypeSpecification__Alternatives ) )
            {
            // InternalDataDescriptionDsl.g:367:2: ( ( rule__TypeSpecification__Alternatives ) )
            // InternalDataDescriptionDsl.g:368:3: ( rule__TypeSpecification__Alternatives )
            {
             before(grammarAccess.getTypeSpecificationAccess().getAlternatives()); 
            // InternalDataDescriptionDsl.g:369:3: ( rule__TypeSpecification__Alternatives )
            // InternalDataDescriptionDsl.g:369:4: rule__TypeSpecification__Alternatives
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
    // InternalDataDescriptionDsl.g:378:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:379:1: ( ruleDataType EOF )
            // InternalDataDescriptionDsl.g:380:1: ruleDataType EOF
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
    // InternalDataDescriptionDsl.g:387:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:391:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:392:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:392:2: ( ( rule__DataType__Group__0 ) )
            // InternalDataDescriptionDsl.g:393:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:394:3: ( rule__DataType__Group__0 )
            // InternalDataDescriptionDsl.g:394:4: rule__DataType__Group__0
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
    // InternalDataDescriptionDsl.g:403:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalDataDescriptionDsl.g:404:1: ( ruleReference EOF )
            // InternalDataDescriptionDsl.g:405:1: ruleReference EOF
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
    // InternalDataDescriptionDsl.g:412:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:416:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalDataDescriptionDsl.g:417:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalDataDescriptionDsl.g:417:2: ( ( rule__Reference__Group__0 ) )
            // InternalDataDescriptionDsl.g:418:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalDataDescriptionDsl.g:419:3: ( rule__Reference__Group__0 )
            // InternalDataDescriptionDsl.g:419:4: rule__Reference__Group__0
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


    // $ANTLR start "ruleFormatKind"
    // InternalDataDescriptionDsl.g:428:1: ruleFormatKind : ( ( rule__FormatKind__Alternatives ) ) ;
    public final void ruleFormatKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:432:1: ( ( ( rule__FormatKind__Alternatives ) ) )
            // InternalDataDescriptionDsl.g:433:2: ( ( rule__FormatKind__Alternatives ) )
            {
            // InternalDataDescriptionDsl.g:433:2: ( ( rule__FormatKind__Alternatives ) )
            // InternalDataDescriptionDsl.g:434:3: ( rule__FormatKind__Alternatives )
            {
             before(grammarAccess.getFormatKindAccess().getAlternatives()); 
            // InternalDataDescriptionDsl.g:435:3: ( rule__FormatKind__Alternatives )
            // InternalDataDescriptionDsl.g:435:4: rule__FormatKind__Alternatives
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
    // InternalDataDescriptionDsl.g:444:1: ruleTypeKind : ( ( rule__TypeKind__Alternatives ) ) ;
    public final void ruleTypeKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:448:1: ( ( ( rule__TypeKind__Alternatives ) ) )
            // InternalDataDescriptionDsl.g:449:2: ( ( rule__TypeKind__Alternatives ) )
            {
            // InternalDataDescriptionDsl.g:449:2: ( ( rule__TypeKind__Alternatives ) )
            // InternalDataDescriptionDsl.g:450:3: ( rule__TypeKind__Alternatives )
            {
             before(grammarAccess.getTypeKindAccess().getAlternatives()); 
            // InternalDataDescriptionDsl.g:451:3: ( rule__TypeKind__Alternatives )
            // InternalDataDescriptionDsl.g:451:4: rule__TypeKind__Alternatives
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
    // InternalDataDescriptionDsl.g:459:1: rule__DataDescription__Alternatives : ( ( ruleDataSource ) | ( ruleDataFragment ) );
    public final void rule__DataDescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:463:1: ( ( ruleDataSource ) | ( ruleDataFragment ) )
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
                    // InternalDataDescriptionDsl.g:464:2: ( ruleDataSource )
                    {
                    // InternalDataDescriptionDsl.g:464:2: ( ruleDataSource )
                    // InternalDataDescriptionDsl.g:465:3: ruleDataSource
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
                    // InternalDataDescriptionDsl.g:470:2: ( ruleDataFragment )
                    {
                    // InternalDataDescriptionDsl.g:470:2: ( ruleDataFragment )
                    // InternalDataDescriptionDsl.g:471:3: ruleDataFragment
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
    // InternalDataDescriptionDsl.g:480:1: rule__FormatSpecification__Alternatives : ( ( ( rule__FormatSpecification__SpecialFormatAssignment_0 ) ) | ( ( rule__FormatSpecification__FormatAssignment_1 ) ) );
    public final void rule__FormatSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:484:1: ( ( ( rule__FormatSpecification__SpecialFormatAssignment_0 ) ) | ( ( rule__FormatSpecification__FormatAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
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
                    // InternalDataDescriptionDsl.g:485:2: ( ( rule__FormatSpecification__SpecialFormatAssignment_0 ) )
                    {
                    // InternalDataDescriptionDsl.g:485:2: ( ( rule__FormatSpecification__SpecialFormatAssignment_0 ) )
                    // InternalDataDescriptionDsl.g:486:3: ( rule__FormatSpecification__SpecialFormatAssignment_0 )
                    {
                     before(grammarAccess.getFormatSpecificationAccess().getSpecialFormatAssignment_0()); 
                    // InternalDataDescriptionDsl.g:487:3: ( rule__FormatSpecification__SpecialFormatAssignment_0 )
                    // InternalDataDescriptionDsl.g:487:4: rule__FormatSpecification__SpecialFormatAssignment_0
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
                    // InternalDataDescriptionDsl.g:491:2: ( ( rule__FormatSpecification__FormatAssignment_1 ) )
                    {
                    // InternalDataDescriptionDsl.g:491:2: ( ( rule__FormatSpecification__FormatAssignment_1 ) )
                    // InternalDataDescriptionDsl.g:492:3: ( rule__FormatSpecification__FormatAssignment_1 )
                    {
                     before(grammarAccess.getFormatSpecificationAccess().getFormatAssignment_1()); 
                    // InternalDataDescriptionDsl.g:493:3: ( rule__FormatSpecification__FormatAssignment_1 )
                    // InternalDataDescriptionDsl.g:493:4: rule__FormatSpecification__FormatAssignment_1
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
    // InternalDataDescriptionDsl.g:501:1: rule__Node__Alternatives : ( ( ruleCompositeNode ) | ( ruleLeafNode ) );
    public final void rule__Node__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:505:1: ( ( ruleCompositeNode ) | ( ruleLeafNode ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||LA3_0==50) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING||(LA3_0>=14 && LA3_0<=31)||LA3_0==49||(LA3_0>=51 && LA3_0<=52)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDataDescriptionDsl.g:506:2: ( ruleCompositeNode )
                    {
                    // InternalDataDescriptionDsl.g:506:2: ( ruleCompositeNode )
                    // InternalDataDescriptionDsl.g:507:3: ruleCompositeNode
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
                    // InternalDataDescriptionDsl.g:512:2: ( ruleLeafNode )
                    {
                    // InternalDataDescriptionDsl.g:512:2: ( ruleLeafNode )
                    // InternalDataDescriptionDsl.g:513:3: ruleLeafNode
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
    // InternalDataDescriptionDsl.g:522:1: rule__TypeSpecification__Alternatives : ( ( ruleDataType ) | ( ruleReference ) );
    public final void rule__TypeSpecification__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:526:1: ( ( ruleDataType ) | ( ruleReference ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING||(LA4_0>=14 && LA4_0<=31)) ) {
                alt4=1;
            }
            else if ( (LA4_0==49) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalDataDescriptionDsl.g:527:2: ( ruleDataType )
                    {
                    // InternalDataDescriptionDsl.g:527:2: ( ruleDataType )
                    // InternalDataDescriptionDsl.g:528:3: ruleDataType
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
                    // InternalDataDescriptionDsl.g:533:2: ( ruleReference )
                    {
                    // InternalDataDescriptionDsl.g:533:2: ( ruleReference )
                    // InternalDataDescriptionDsl.g:534:3: ruleReference
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


    // $ANTLR start "rule__DataType__Alternatives_0"
    // InternalDataDescriptionDsl.g:543:1: rule__DataType__Alternatives_0 : ( ( ( rule__DataType__SpecialTypeAssignment_0_0 ) ) | ( ( rule__DataType__TypeAssignment_0_1 ) ) );
    public final void rule__DataType__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:547:1: ( ( ( rule__DataType__SpecialTypeAssignment_0_0 ) ) | ( ( rule__DataType__TypeAssignment_0_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
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
                    // InternalDataDescriptionDsl.g:548:2: ( ( rule__DataType__SpecialTypeAssignment_0_0 ) )
                    {
                    // InternalDataDescriptionDsl.g:548:2: ( ( rule__DataType__SpecialTypeAssignment_0_0 ) )
                    // InternalDataDescriptionDsl.g:549:3: ( rule__DataType__SpecialTypeAssignment_0_0 )
                    {
                     before(grammarAccess.getDataTypeAccess().getSpecialTypeAssignment_0_0()); 
                    // InternalDataDescriptionDsl.g:550:3: ( rule__DataType__SpecialTypeAssignment_0_0 )
                    // InternalDataDescriptionDsl.g:550:4: rule__DataType__SpecialTypeAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__SpecialTypeAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getSpecialTypeAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDescriptionDsl.g:554:2: ( ( rule__DataType__TypeAssignment_0_1 ) )
                    {
                    // InternalDataDescriptionDsl.g:554:2: ( ( rule__DataType__TypeAssignment_0_1 ) )
                    // InternalDataDescriptionDsl.g:555:3: ( rule__DataType__TypeAssignment_0_1 )
                    {
                     before(grammarAccess.getDataTypeAccess().getTypeAssignment_0_1()); 
                    // InternalDataDescriptionDsl.g:556:3: ( rule__DataType__TypeAssignment_0_1 )
                    // InternalDataDescriptionDsl.g:556:4: rule__DataType__TypeAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__TypeAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDataTypeAccess().getTypeAssignment_0_1()); 

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
    // $ANTLR end "rule__DataType__Alternatives_0"


    // $ANTLR start "rule__FormatKind__Alternatives"
    // InternalDataDescriptionDsl.g:564:1: rule__FormatKind__Alternatives : ( ( ( 'CSV' ) ) | ( ( 'JSON' ) ) | ( ( 'XML' ) ) );
    public final void rule__FormatKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:568:1: ( ( ( 'CSV' ) ) | ( ( 'JSON' ) ) | ( ( 'XML' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt6=1;
                }
                break;
            case 12:
                {
                alt6=2;
                }
                break;
            case 13:
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
                    // InternalDataDescriptionDsl.g:569:2: ( ( 'CSV' ) )
                    {
                    // InternalDataDescriptionDsl.g:569:2: ( ( 'CSV' ) )
                    // InternalDataDescriptionDsl.g:570:3: ( 'CSV' )
                    {
                     before(grammarAccess.getFormatKindAccess().getCSVEnumLiteralDeclaration_0()); 
                    // InternalDataDescriptionDsl.g:571:3: ( 'CSV' )
                    // InternalDataDescriptionDsl.g:571:4: 'CSV'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatKindAccess().getCSVEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDescriptionDsl.g:575:2: ( ( 'JSON' ) )
                    {
                    // InternalDataDescriptionDsl.g:575:2: ( ( 'JSON' ) )
                    // InternalDataDescriptionDsl.g:576:3: ( 'JSON' )
                    {
                     before(grammarAccess.getFormatKindAccess().getJSONEnumLiteralDeclaration_1()); 
                    // InternalDataDescriptionDsl.g:577:3: ( 'JSON' )
                    // InternalDataDescriptionDsl.g:577:4: 'JSON'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getFormatKindAccess().getJSONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDescriptionDsl.g:581:2: ( ( 'XML' ) )
                    {
                    // InternalDataDescriptionDsl.g:581:2: ( ( 'XML' ) )
                    // InternalDataDescriptionDsl.g:582:3: ( 'XML' )
                    {
                     before(grammarAccess.getFormatKindAccess().getXMLEnumLiteralDeclaration_2()); 
                    // InternalDataDescriptionDsl.g:583:3: ( 'XML' )
                    // InternalDataDescriptionDsl.g:583:4: 'XML'
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
    // InternalDataDescriptionDsl.g:591:1: rule__TypeKind__Alternatives : ( ( ( 'string' ) ) | ( ( 'numeral' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'year' ) ) | ( ( 'month' ) ) | ( ( 'day' ) ) | ( ( 'boolean' ) ) | ( ( 'place' ) ) | ( ( 'latitude' ) ) | ( ( 'longitude' ) ) | ( ( 'UTMe' ) ) | ( ( 'UTMn' ) ) | ( ( 'UTMz' ) ) | ( ( 'UTMHemi' ) ) | ( ( 'name' ) ) | ( ( 'familyname' ) ) | ( ( 'personalID' ) ) );
    public final void rule__TypeKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:595:1: ( ( ( 'string' ) ) | ( ( 'numeral' ) ) | ( ( 'date' ) ) | ( ( 'time' ) ) | ( ( 'year' ) ) | ( ( 'month' ) ) | ( ( 'day' ) ) | ( ( 'boolean' ) ) | ( ( 'place' ) ) | ( ( 'latitude' ) ) | ( ( 'longitude' ) ) | ( ( 'UTMe' ) ) | ( ( 'UTMn' ) ) | ( ( 'UTMz' ) ) | ( ( 'UTMHemi' ) ) | ( ( 'name' ) ) | ( ( 'familyname' ) ) | ( ( 'personalID' ) ) )
            int alt7=18;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
                {
                alt7=4;
                }
                break;
            case 18:
                {
                alt7=5;
                }
                break;
            case 19:
                {
                alt7=6;
                }
                break;
            case 20:
                {
                alt7=7;
                }
                break;
            case 21:
                {
                alt7=8;
                }
                break;
            case 22:
                {
                alt7=9;
                }
                break;
            case 23:
                {
                alt7=10;
                }
                break;
            case 24:
                {
                alt7=11;
                }
                break;
            case 25:
                {
                alt7=12;
                }
                break;
            case 26:
                {
                alt7=13;
                }
                break;
            case 27:
                {
                alt7=14;
                }
                break;
            case 28:
                {
                alt7=15;
                }
                break;
            case 29:
                {
                alt7=16;
                }
                break;
            case 30:
                {
                alt7=17;
                }
                break;
            case 31:
                {
                alt7=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalDataDescriptionDsl.g:596:2: ( ( 'string' ) )
                    {
                    // InternalDataDescriptionDsl.g:596:2: ( ( 'string' ) )
                    // InternalDataDescriptionDsl.g:597:3: ( 'string' )
                    {
                     before(grammarAccess.getTypeKindAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalDataDescriptionDsl.g:598:3: ( 'string' )
                    // InternalDataDescriptionDsl.g:598:4: 'string'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDataDescriptionDsl.g:602:2: ( ( 'numeral' ) )
                    {
                    // InternalDataDescriptionDsl.g:602:2: ( ( 'numeral' ) )
                    // InternalDataDescriptionDsl.g:603:3: ( 'numeral' )
                    {
                     before(grammarAccess.getTypeKindAccess().getNumeralEnumLiteralDeclaration_1()); 
                    // InternalDataDescriptionDsl.g:604:3: ( 'numeral' )
                    // InternalDataDescriptionDsl.g:604:4: 'numeral'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getNumeralEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDataDescriptionDsl.g:608:2: ( ( 'date' ) )
                    {
                    // InternalDataDescriptionDsl.g:608:2: ( ( 'date' ) )
                    // InternalDataDescriptionDsl.g:609:3: ( 'date' )
                    {
                     before(grammarAccess.getTypeKindAccess().getDateEnumLiteralDeclaration_2()); 
                    // InternalDataDescriptionDsl.g:610:3: ( 'date' )
                    // InternalDataDescriptionDsl.g:610:4: 'date'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getDateEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDataDescriptionDsl.g:614:2: ( ( 'time' ) )
                    {
                    // InternalDataDescriptionDsl.g:614:2: ( ( 'time' ) )
                    // InternalDataDescriptionDsl.g:615:3: ( 'time' )
                    {
                     before(grammarAccess.getTypeKindAccess().getTimeEnumLiteralDeclaration_3()); 
                    // InternalDataDescriptionDsl.g:616:3: ( 'time' )
                    // InternalDataDescriptionDsl.g:616:4: 'time'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getTimeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDataDescriptionDsl.g:620:2: ( ( 'year' ) )
                    {
                    // InternalDataDescriptionDsl.g:620:2: ( ( 'year' ) )
                    // InternalDataDescriptionDsl.g:621:3: ( 'year' )
                    {
                     before(grammarAccess.getTypeKindAccess().getYearEnumLiteralDeclaration_4()); 
                    // InternalDataDescriptionDsl.g:622:3: ( 'year' )
                    // InternalDataDescriptionDsl.g:622:4: 'year'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getYearEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDataDescriptionDsl.g:626:2: ( ( 'month' ) )
                    {
                    // InternalDataDescriptionDsl.g:626:2: ( ( 'month' ) )
                    // InternalDataDescriptionDsl.g:627:3: ( 'month' )
                    {
                     before(grammarAccess.getTypeKindAccess().getMonthEnumLiteralDeclaration_5()); 
                    // InternalDataDescriptionDsl.g:628:3: ( 'month' )
                    // InternalDataDescriptionDsl.g:628:4: 'month'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getMonthEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDataDescriptionDsl.g:632:2: ( ( 'day' ) )
                    {
                    // InternalDataDescriptionDsl.g:632:2: ( ( 'day' ) )
                    // InternalDataDescriptionDsl.g:633:3: ( 'day' )
                    {
                     before(grammarAccess.getTypeKindAccess().getDayEnumLiteralDeclaration_6()); 
                    // InternalDataDescriptionDsl.g:634:3: ( 'day' )
                    // InternalDataDescriptionDsl.g:634:4: 'day'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getDayEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDataDescriptionDsl.g:638:2: ( ( 'boolean' ) )
                    {
                    // InternalDataDescriptionDsl.g:638:2: ( ( 'boolean' ) )
                    // InternalDataDescriptionDsl.g:639:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTypeKindAccess().getBooleanEnumLiteralDeclaration_7()); 
                    // InternalDataDescriptionDsl.g:640:3: ( 'boolean' )
                    // InternalDataDescriptionDsl.g:640:4: 'boolean'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getBooleanEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDataDescriptionDsl.g:644:2: ( ( 'place' ) )
                    {
                    // InternalDataDescriptionDsl.g:644:2: ( ( 'place' ) )
                    // InternalDataDescriptionDsl.g:645:3: ( 'place' )
                    {
                     before(grammarAccess.getTypeKindAccess().getPlaceEnumLiteralDeclaration_8()); 
                    // InternalDataDescriptionDsl.g:646:3: ( 'place' )
                    // InternalDataDescriptionDsl.g:646:4: 'place'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getPlaceEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalDataDescriptionDsl.g:650:2: ( ( 'latitude' ) )
                    {
                    // InternalDataDescriptionDsl.g:650:2: ( ( 'latitude' ) )
                    // InternalDataDescriptionDsl.g:651:3: ( 'latitude' )
                    {
                     before(grammarAccess.getTypeKindAccess().getLatitudeEnumLiteralDeclaration_9()); 
                    // InternalDataDescriptionDsl.g:652:3: ( 'latitude' )
                    // InternalDataDescriptionDsl.g:652:4: 'latitude'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getLatitudeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalDataDescriptionDsl.g:656:2: ( ( 'longitude' ) )
                    {
                    // InternalDataDescriptionDsl.g:656:2: ( ( 'longitude' ) )
                    // InternalDataDescriptionDsl.g:657:3: ( 'longitude' )
                    {
                     before(grammarAccess.getTypeKindAccess().getLongitudeEnumLiteralDeclaration_10()); 
                    // InternalDataDescriptionDsl.g:658:3: ( 'longitude' )
                    // InternalDataDescriptionDsl.g:658:4: 'longitude'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getLongitudeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalDataDescriptionDsl.g:662:2: ( ( 'UTMe' ) )
                    {
                    // InternalDataDescriptionDsl.g:662:2: ( ( 'UTMe' ) )
                    // InternalDataDescriptionDsl.g:663:3: ( 'UTMe' )
                    {
                     before(grammarAccess.getTypeKindAccess().getUTMeEnumLiteralDeclaration_11()); 
                    // InternalDataDescriptionDsl.g:664:3: ( 'UTMe' )
                    // InternalDataDescriptionDsl.g:664:4: 'UTMe'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getUTMeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalDataDescriptionDsl.g:668:2: ( ( 'UTMn' ) )
                    {
                    // InternalDataDescriptionDsl.g:668:2: ( ( 'UTMn' ) )
                    // InternalDataDescriptionDsl.g:669:3: ( 'UTMn' )
                    {
                     before(grammarAccess.getTypeKindAccess().getUTMnEnumLiteralDeclaration_12()); 
                    // InternalDataDescriptionDsl.g:670:3: ( 'UTMn' )
                    // InternalDataDescriptionDsl.g:670:4: 'UTMn'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getUTMnEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalDataDescriptionDsl.g:674:2: ( ( 'UTMz' ) )
                    {
                    // InternalDataDescriptionDsl.g:674:2: ( ( 'UTMz' ) )
                    // InternalDataDescriptionDsl.g:675:3: ( 'UTMz' )
                    {
                     before(grammarAccess.getTypeKindAccess().getUTMzEnumLiteralDeclaration_13()); 
                    // InternalDataDescriptionDsl.g:676:3: ( 'UTMz' )
                    // InternalDataDescriptionDsl.g:676:4: 'UTMz'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getUTMzEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalDataDescriptionDsl.g:680:2: ( ( 'UTMHemi' ) )
                    {
                    // InternalDataDescriptionDsl.g:680:2: ( ( 'UTMHemi' ) )
                    // InternalDataDescriptionDsl.g:681:3: ( 'UTMHemi' )
                    {
                     before(grammarAccess.getTypeKindAccess().getUTMHemiEnumLiteralDeclaration_14()); 
                    // InternalDataDescriptionDsl.g:682:3: ( 'UTMHemi' )
                    // InternalDataDescriptionDsl.g:682:4: 'UTMHemi'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getUTMHemiEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalDataDescriptionDsl.g:686:2: ( ( 'name' ) )
                    {
                    // InternalDataDescriptionDsl.g:686:2: ( ( 'name' ) )
                    // InternalDataDescriptionDsl.g:687:3: ( 'name' )
                    {
                     before(grammarAccess.getTypeKindAccess().getNameEnumLiteralDeclaration_15()); 
                    // InternalDataDescriptionDsl.g:688:3: ( 'name' )
                    // InternalDataDescriptionDsl.g:688:4: 'name'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getNameEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // InternalDataDescriptionDsl.g:692:2: ( ( 'familyname' ) )
                    {
                    // InternalDataDescriptionDsl.g:692:2: ( ( 'familyname' ) )
                    // InternalDataDescriptionDsl.g:693:3: ( 'familyname' )
                    {
                     before(grammarAccess.getTypeKindAccess().getFamilynameEnumLiteralDeclaration_16()); 
                    // InternalDataDescriptionDsl.g:694:3: ( 'familyname' )
                    // InternalDataDescriptionDsl.g:694:4: 'familyname'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeKindAccess().getFamilynameEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // InternalDataDescriptionDsl.g:698:2: ( ( 'personalID' ) )
                    {
                    // InternalDataDescriptionDsl.g:698:2: ( ( 'personalID' ) )
                    // InternalDataDescriptionDsl.g:699:3: ( 'personalID' )
                    {
                     before(grammarAccess.getTypeKindAccess().getPersonalIDEnumLiteralDeclaration_17()); 
                    // InternalDataDescriptionDsl.g:700:3: ( 'personalID' )
                    // InternalDataDescriptionDsl.g:700:4: 'personalID'
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
    // InternalDataDescriptionDsl.g:708:1: rule__DataModel__Group__0 : rule__DataModel__Group__0__Impl rule__DataModel__Group__1 ;
    public final void rule__DataModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:712:1: ( rule__DataModel__Group__0__Impl rule__DataModel__Group__1 )
            // InternalDataDescriptionDsl.g:713:2: rule__DataModel__Group__0__Impl rule__DataModel__Group__1
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
    // InternalDataDescriptionDsl.g:720:1: rule__DataModel__Group__0__Impl : ( ( rule__DataModel__Group_0__0 )? ) ;
    public final void rule__DataModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:724:1: ( ( ( rule__DataModel__Group_0__0 )? ) )
            // InternalDataDescriptionDsl.g:725:1: ( ( rule__DataModel__Group_0__0 )? )
            {
            // InternalDataDescriptionDsl.g:725:1: ( ( rule__DataModel__Group_0__0 )? )
            // InternalDataDescriptionDsl.g:726:2: ( rule__DataModel__Group_0__0 )?
            {
             before(grammarAccess.getDataModelAccess().getGroup_0()); 
            // InternalDataDescriptionDsl.g:727:2: ( rule__DataModel__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==34) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDataDescriptionDsl.g:727:3: rule__DataModel__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataModel__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataModelAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:735:1: rule__DataModel__Group__1 : rule__DataModel__Group__1__Impl rule__DataModel__Group__2 ;
    public final void rule__DataModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:739:1: ( rule__DataModel__Group__1__Impl rule__DataModel__Group__2 )
            // InternalDataDescriptionDsl.g:740:2: rule__DataModel__Group__1__Impl rule__DataModel__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalDataDescriptionDsl.g:747:1: rule__DataModel__Group__1__Impl : ( '{' ) ;
    public final void rule__DataModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:751:1: ( ( '{' ) )
            // InternalDataDescriptionDsl.g:752:1: ( '{' )
            {
            // InternalDataDescriptionDsl.g:752:1: ( '{' )
            // InternalDataDescriptionDsl.g:753:2: '{'
            {
             before(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:762:1: rule__DataModel__Group__2 : rule__DataModel__Group__2__Impl rule__DataModel__Group__3 ;
    public final void rule__DataModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:766:1: ( rule__DataModel__Group__2__Impl rule__DataModel__Group__3 )
            // InternalDataDescriptionDsl.g:767:2: rule__DataModel__Group__2__Impl rule__DataModel__Group__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalDataDescriptionDsl.g:774:1: rule__DataModel__Group__2__Impl : ( ( rule__DataModel__DescriptionsAssignment_2 ) ) ;
    public final void rule__DataModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:778:1: ( ( ( rule__DataModel__DescriptionsAssignment_2 ) ) )
            // InternalDataDescriptionDsl.g:779:1: ( ( rule__DataModel__DescriptionsAssignment_2 ) )
            {
            // InternalDataDescriptionDsl.g:779:1: ( ( rule__DataModel__DescriptionsAssignment_2 ) )
            // InternalDataDescriptionDsl.g:780:2: ( rule__DataModel__DescriptionsAssignment_2 )
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsAssignment_2()); 
            // InternalDataDescriptionDsl.g:781:2: ( rule__DataModel__DescriptionsAssignment_2 )
            // InternalDataDescriptionDsl.g:781:3: rule__DataModel__DescriptionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__DescriptionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getDescriptionsAssignment_2()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:789:1: rule__DataModel__Group__3 : rule__DataModel__Group__3__Impl rule__DataModel__Group__4 ;
    public final void rule__DataModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:793:1: ( rule__DataModel__Group__3__Impl rule__DataModel__Group__4 )
            // InternalDataDescriptionDsl.g:794:2: rule__DataModel__Group__3__Impl rule__DataModel__Group__4
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
    // InternalDataDescriptionDsl.g:801:1: rule__DataModel__Group__3__Impl : ( ( rule__DataModel__Group_3__0 )* ) ;
    public final void rule__DataModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:805:1: ( ( ( rule__DataModel__Group_3__0 )* ) )
            // InternalDataDescriptionDsl.g:806:1: ( ( rule__DataModel__Group_3__0 )* )
            {
            // InternalDataDescriptionDsl.g:806:1: ( ( rule__DataModel__Group_3__0 )* )
            // InternalDataDescriptionDsl.g:807:2: ( rule__DataModel__Group_3__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_3()); 
            // InternalDataDescriptionDsl.g:808:2: ( rule__DataModel__Group_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==35) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:808:3: rule__DataModel__Group_3__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataModel__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:816:1: rule__DataModel__Group__4 : rule__DataModel__Group__4__Impl ;
    public final void rule__DataModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:820:1: ( rule__DataModel__Group__4__Impl )
            // InternalDataDescriptionDsl.g:821:2: rule__DataModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataDescriptionDsl.g:827:1: rule__DataModel__Group__4__Impl : ( '}' ) ;
    public final void rule__DataModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:831:1: ( ( '}' ) )
            // InternalDataDescriptionDsl.g:832:1: ( '}' )
            {
            // InternalDataDescriptionDsl.g:832:1: ( '}' )
            // InternalDataDescriptionDsl.g:833:2: '}'
            {
             before(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataModel__Group_0__0"
    // InternalDataDescriptionDsl.g:843:1: rule__DataModel__Group_0__0 : rule__DataModel__Group_0__0__Impl rule__DataModel__Group_0__1 ;
    public final void rule__DataModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:847:1: ( rule__DataModel__Group_0__0__Impl rule__DataModel__Group_0__1 )
            // InternalDataDescriptionDsl.g:848:2: rule__DataModel__Group_0__0__Impl rule__DataModel__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__DataModel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0__0"


    // $ANTLR start "rule__DataModel__Group_0__0__Impl"
    // InternalDataDescriptionDsl.g:855:1: rule__DataModel__Group_0__0__Impl : ( 'import' ) ;
    public final void rule__DataModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:859:1: ( ( 'import' ) )
            // InternalDataDescriptionDsl.g:860:1: ( 'import' )
            {
            // InternalDataDescriptionDsl.g:860:1: ( 'import' )
            // InternalDataDescriptionDsl.g:861:2: 'import'
            {
             before(grammarAccess.getDataModelAccess().getImportKeyword_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getImportKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0__0__Impl"


    // $ANTLR start "rule__DataModel__Group_0__1"
    // InternalDataDescriptionDsl.g:870:1: rule__DataModel__Group_0__1 : rule__DataModel__Group_0__1__Impl rule__DataModel__Group_0__2 ;
    public final void rule__DataModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:874:1: ( rule__DataModel__Group_0__1__Impl rule__DataModel__Group_0__2 )
            // InternalDataDescriptionDsl.g:875:2: rule__DataModel__Group_0__1__Impl rule__DataModel__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__DataModel__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0__1"


    // $ANTLR start "rule__DataModel__Group_0__1__Impl"
    // InternalDataDescriptionDsl.g:882:1: rule__DataModel__Group_0__1__Impl : ( ( rule__DataModel__ImportURIAssignment_0_1 ) ) ;
    public final void rule__DataModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:886:1: ( ( ( rule__DataModel__ImportURIAssignment_0_1 ) ) )
            // InternalDataDescriptionDsl.g:887:1: ( ( rule__DataModel__ImportURIAssignment_0_1 ) )
            {
            // InternalDataDescriptionDsl.g:887:1: ( ( rule__DataModel__ImportURIAssignment_0_1 ) )
            // InternalDataDescriptionDsl.g:888:2: ( rule__DataModel__ImportURIAssignment_0_1 )
            {
             before(grammarAccess.getDataModelAccess().getImportURIAssignment_0_1()); 
            // InternalDataDescriptionDsl.g:889:2: ( rule__DataModel__ImportURIAssignment_0_1 )
            // InternalDataDescriptionDsl.g:889:3: rule__DataModel__ImportURIAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__ImportURIAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getImportURIAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0__1__Impl"


    // $ANTLR start "rule__DataModel__Group_0__2"
    // InternalDataDescriptionDsl.g:897:1: rule__DataModel__Group_0__2 : rule__DataModel__Group_0__2__Impl ;
    public final void rule__DataModel__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:901:1: ( rule__DataModel__Group_0__2__Impl )
            // InternalDataDescriptionDsl.g:902:2: rule__DataModel__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0__2"


    // $ANTLR start "rule__DataModel__Group_0__2__Impl"
    // InternalDataDescriptionDsl.g:908:1: rule__DataModel__Group_0__2__Impl : ( ( rule__DataModel__Group_0_2__0 )* ) ;
    public final void rule__DataModel__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:912:1: ( ( ( rule__DataModel__Group_0_2__0 )* ) )
            // InternalDataDescriptionDsl.g:913:1: ( ( rule__DataModel__Group_0_2__0 )* )
            {
            // InternalDataDescriptionDsl.g:913:1: ( ( rule__DataModel__Group_0_2__0 )* )
            // InternalDataDescriptionDsl.g:914:2: ( rule__DataModel__Group_0_2__0 )*
            {
             before(grammarAccess.getDataModelAccess().getGroup_0_2()); 
            // InternalDataDescriptionDsl.g:915:2: ( rule__DataModel__Group_0_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==35) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:915:3: rule__DataModel__Group_0_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataModel__Group_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getDataModelAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0__2__Impl"


    // $ANTLR start "rule__DataModel__Group_0_2__0"
    // InternalDataDescriptionDsl.g:924:1: rule__DataModel__Group_0_2__0 : rule__DataModel__Group_0_2__0__Impl rule__DataModel__Group_0_2__1 ;
    public final void rule__DataModel__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:928:1: ( rule__DataModel__Group_0_2__0__Impl rule__DataModel__Group_0_2__1 )
            // InternalDataDescriptionDsl.g:929:2: rule__DataModel__Group_0_2__0__Impl rule__DataModel__Group_0_2__1
            {
            pushFollow(FOLLOW_7);
            rule__DataModel__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0_2__0"


    // $ANTLR start "rule__DataModel__Group_0_2__0__Impl"
    // InternalDataDescriptionDsl.g:936:1: rule__DataModel__Group_0_2__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:940:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:941:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:941:1: ( ',' )
            // InternalDataDescriptionDsl.g:942:2: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_0_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getCommaKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0_2__0__Impl"


    // $ANTLR start "rule__DataModel__Group_0_2__1"
    // InternalDataDescriptionDsl.g:951:1: rule__DataModel__Group_0_2__1 : rule__DataModel__Group_0_2__1__Impl ;
    public final void rule__DataModel__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:955:1: ( rule__DataModel__Group_0_2__1__Impl )
            // InternalDataDescriptionDsl.g:956:2: rule__DataModel__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0_2__1"


    // $ANTLR start "rule__DataModel__Group_0_2__1__Impl"
    // InternalDataDescriptionDsl.g:962:1: rule__DataModel__Group_0_2__1__Impl : ( ( rule__DataModel__ImportURIAssignment_0_2_1 ) ) ;
    public final void rule__DataModel__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:966:1: ( ( ( rule__DataModel__ImportURIAssignment_0_2_1 ) ) )
            // InternalDataDescriptionDsl.g:967:1: ( ( rule__DataModel__ImportURIAssignment_0_2_1 ) )
            {
            // InternalDataDescriptionDsl.g:967:1: ( ( rule__DataModel__ImportURIAssignment_0_2_1 ) )
            // InternalDataDescriptionDsl.g:968:2: ( rule__DataModel__ImportURIAssignment_0_2_1 )
            {
             before(grammarAccess.getDataModelAccess().getImportURIAssignment_0_2_1()); 
            // InternalDataDescriptionDsl.g:969:2: ( rule__DataModel__ImportURIAssignment_0_2_1 )
            // InternalDataDescriptionDsl.g:969:3: rule__DataModel__ImportURIAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__ImportURIAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getImportURIAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_0_2__1__Impl"


    // $ANTLR start "rule__DataModel__Group_3__0"
    // InternalDataDescriptionDsl.g:978:1: rule__DataModel__Group_3__0 : rule__DataModel__Group_3__0__Impl rule__DataModel__Group_3__1 ;
    public final void rule__DataModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:982:1: ( rule__DataModel__Group_3__0__Impl rule__DataModel__Group_3__1 )
            // InternalDataDescriptionDsl.g:983:2: rule__DataModel__Group_3__0__Impl rule__DataModel__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__DataModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataModel__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_3__0"


    // $ANTLR start "rule__DataModel__Group_3__0__Impl"
    // InternalDataDescriptionDsl.g:990:1: rule__DataModel__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DataModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:994:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:995:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:995:1: ( ',' )
            // InternalDataDescriptionDsl.g:996:2: ','
            {
             before(grammarAccess.getDataModelAccess().getCommaKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_3__0__Impl"


    // $ANTLR start "rule__DataModel__Group_3__1"
    // InternalDataDescriptionDsl.g:1005:1: rule__DataModel__Group_3__1 : rule__DataModel__Group_3__1__Impl ;
    public final void rule__DataModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1009:1: ( rule__DataModel__Group_3__1__Impl )
            // InternalDataDescriptionDsl.g:1010:2: rule__DataModel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_3__1"


    // $ANTLR start "rule__DataModel__Group_3__1__Impl"
    // InternalDataDescriptionDsl.g:1016:1: rule__DataModel__Group_3__1__Impl : ( ( rule__DataModel__DescriptionsAssignment_3_1 ) ) ;
    public final void rule__DataModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1020:1: ( ( ( rule__DataModel__DescriptionsAssignment_3_1 ) ) )
            // InternalDataDescriptionDsl.g:1021:1: ( ( rule__DataModel__DescriptionsAssignment_3_1 ) )
            {
            // InternalDataDescriptionDsl.g:1021:1: ( ( rule__DataModel__DescriptionsAssignment_3_1 ) )
            // InternalDataDescriptionDsl.g:1022:2: ( rule__DataModel__DescriptionsAssignment_3_1 )
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsAssignment_3_1()); 
            // InternalDataDescriptionDsl.g:1023:2: ( rule__DataModel__DescriptionsAssignment_3_1 )
            // InternalDataDescriptionDsl.g:1023:3: rule__DataModel__DescriptionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataModel__DescriptionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataModelAccess().getDescriptionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__Group_3__1__Impl"


    // $ANTLR start "rule__DataSource__Group__0"
    // InternalDataDescriptionDsl.g:1032:1: rule__DataSource__Group__0 : rule__DataSource__Group__0__Impl rule__DataSource__Group__1 ;
    public final void rule__DataSource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1036:1: ( rule__DataSource__Group__0__Impl rule__DataSource__Group__1 )
            // InternalDataDescriptionDsl.g:1037:2: rule__DataSource__Group__0__Impl rule__DataSource__Group__1
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
    // InternalDataDescriptionDsl.g:1044:1: rule__DataSource__Group__0__Impl : ( 'description' ) ;
    public final void rule__DataSource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1048:1: ( ( 'description' ) )
            // InternalDataDescriptionDsl.g:1049:1: ( 'description' )
            {
            // InternalDataDescriptionDsl.g:1049:1: ( 'description' )
            // InternalDataDescriptionDsl.g:1050:2: 'description'
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
    // InternalDataDescriptionDsl.g:1059:1: rule__DataSource__Group__1 : rule__DataSource__Group__1__Impl rule__DataSource__Group__2 ;
    public final void rule__DataSource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1063:1: ( rule__DataSource__Group__1__Impl rule__DataSource__Group__2 )
            // InternalDataDescriptionDsl.g:1064:2: rule__DataSource__Group__1__Impl rule__DataSource__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDescriptionDsl.g:1071:1: rule__DataSource__Group__1__Impl : ( ( rule__DataSource__FormatAssignment_1 ) ) ;
    public final void rule__DataSource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1075:1: ( ( ( rule__DataSource__FormatAssignment_1 ) ) )
            // InternalDataDescriptionDsl.g:1076:1: ( ( rule__DataSource__FormatAssignment_1 ) )
            {
            // InternalDataDescriptionDsl.g:1076:1: ( ( rule__DataSource__FormatAssignment_1 ) )
            // InternalDataDescriptionDsl.g:1077:2: ( rule__DataSource__FormatAssignment_1 )
            {
             before(grammarAccess.getDataSourceAccess().getFormatAssignment_1()); 
            // InternalDataDescriptionDsl.g:1078:2: ( rule__DataSource__FormatAssignment_1 )
            // InternalDataDescriptionDsl.g:1078:3: rule__DataSource__FormatAssignment_1
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
    // InternalDataDescriptionDsl.g:1086:1: rule__DataSource__Group__2 : rule__DataSource__Group__2__Impl rule__DataSource__Group__3 ;
    public final void rule__DataSource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1090:1: ( rule__DataSource__Group__2__Impl rule__DataSource__Group__3 )
            // InternalDataDescriptionDsl.g:1091:2: rule__DataSource__Group__2__Impl rule__DataSource__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataDescriptionDsl.g:1098:1: rule__DataSource__Group__2__Impl : ( ( rule__DataSource__NameAssignment_2 ) ) ;
    public final void rule__DataSource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1102:1: ( ( ( rule__DataSource__NameAssignment_2 ) ) )
            // InternalDataDescriptionDsl.g:1103:1: ( ( rule__DataSource__NameAssignment_2 ) )
            {
            // InternalDataDescriptionDsl.g:1103:1: ( ( rule__DataSource__NameAssignment_2 ) )
            // InternalDataDescriptionDsl.g:1104:2: ( rule__DataSource__NameAssignment_2 )
            {
             before(grammarAccess.getDataSourceAccess().getNameAssignment_2()); 
            // InternalDataDescriptionDsl.g:1105:2: ( rule__DataSource__NameAssignment_2 )
            // InternalDataDescriptionDsl.g:1105:3: rule__DataSource__NameAssignment_2
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
    // InternalDataDescriptionDsl.g:1113:1: rule__DataSource__Group__3 : rule__DataSource__Group__3__Impl rule__DataSource__Group__4 ;
    public final void rule__DataSource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1117:1: ( rule__DataSource__Group__3__Impl rule__DataSource__Group__4 )
            // InternalDataDescriptionDsl.g:1118:2: rule__DataSource__Group__3__Impl rule__DataSource__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataDescriptionDsl.g:1125:1: rule__DataSource__Group__3__Impl : ( ( rule__DataSource__Group_3__0 )? ) ;
    public final void rule__DataSource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1129:1: ( ( ( rule__DataSource__Group_3__0 )? ) )
            // InternalDataDescriptionDsl.g:1130:1: ( ( rule__DataSource__Group_3__0 )? )
            {
            // InternalDataDescriptionDsl.g:1130:1: ( ( rule__DataSource__Group_3__0 )? )
            // InternalDataDescriptionDsl.g:1131:2: ( rule__DataSource__Group_3__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_3()); 
            // InternalDataDescriptionDsl.g:1132:2: ( rule__DataSource__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1132:3: rule__DataSource__Group_3__0
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
    // InternalDataDescriptionDsl.g:1140:1: rule__DataSource__Group__4 : rule__DataSource__Group__4__Impl rule__DataSource__Group__5 ;
    public final void rule__DataSource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1144:1: ( rule__DataSource__Group__4__Impl rule__DataSource__Group__5 )
            // InternalDataDescriptionDsl.g:1145:2: rule__DataSource__Group__4__Impl rule__DataSource__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalDataDescriptionDsl.g:1152:1: rule__DataSource__Group__4__Impl : ( ( rule__DataSource__Group_4__0 )? ) ;
    public final void rule__DataSource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1156:1: ( ( ( rule__DataSource__Group_4__0 )? ) )
            // InternalDataDescriptionDsl.g:1157:1: ( ( rule__DataSource__Group_4__0 )? )
            {
            // InternalDataDescriptionDsl.g:1157:1: ( ( rule__DataSource__Group_4__0 )? )
            // InternalDataDescriptionDsl.g:1158:2: ( rule__DataSource__Group_4__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_4()); 
            // InternalDataDescriptionDsl.g:1159:2: ( rule__DataSource__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1159:3: rule__DataSource__Group_4__0
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
    // InternalDataDescriptionDsl.g:1167:1: rule__DataSource__Group__5 : rule__DataSource__Group__5__Impl rule__DataSource__Group__6 ;
    public final void rule__DataSource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1171:1: ( rule__DataSource__Group__5__Impl rule__DataSource__Group__6 )
            // InternalDataDescriptionDsl.g:1172:2: rule__DataSource__Group__5__Impl rule__DataSource__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalDataDescriptionDsl.g:1179:1: rule__DataSource__Group__5__Impl : ( '=' ) ;
    public final void rule__DataSource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1183:1: ( ( '=' ) )
            // InternalDataDescriptionDsl.g:1184:1: ( '=' )
            {
            // InternalDataDescriptionDsl.g:1184:1: ( '=' )
            // InternalDataDescriptionDsl.g:1185:2: '='
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
    // InternalDataDescriptionDsl.g:1194:1: rule__DataSource__Group__6 : rule__DataSource__Group__6__Impl rule__DataSource__Group__7 ;
    public final void rule__DataSource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1198:1: ( rule__DataSource__Group__6__Impl rule__DataSource__Group__7 )
            // InternalDataDescriptionDsl.g:1199:2: rule__DataSource__Group__6__Impl rule__DataSource__Group__7
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
    // InternalDataDescriptionDsl.g:1206:1: rule__DataSource__Group__6__Impl : ( '{' ) ;
    public final void rule__DataSource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1210:1: ( ( '{' ) )
            // InternalDataDescriptionDsl.g:1211:1: ( '{' )
            {
            // InternalDataDescriptionDsl.g:1211:1: ( '{' )
            // InternalDataDescriptionDsl.g:1212:2: '{'
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
    // InternalDataDescriptionDsl.g:1221:1: rule__DataSource__Group__7 : rule__DataSource__Group__7__Impl rule__DataSource__Group__8 ;
    public final void rule__DataSource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1225:1: ( rule__DataSource__Group__7__Impl rule__DataSource__Group__8 )
            // InternalDataDescriptionDsl.g:1226:2: rule__DataSource__Group__7__Impl rule__DataSource__Group__8
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
    // InternalDataDescriptionDsl.g:1233:1: rule__DataSource__Group__7__Impl : ( ( rule__DataSource__Group_7__0 )? ) ;
    public final void rule__DataSource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1237:1: ( ( ( rule__DataSource__Group_7__0 )? ) )
            // InternalDataDescriptionDsl.g:1238:1: ( ( rule__DataSource__Group_7__0 )? )
            {
            // InternalDataDescriptionDsl.g:1238:1: ( ( rule__DataSource__Group_7__0 )? )
            // InternalDataDescriptionDsl.g:1239:2: ( rule__DataSource__Group_7__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_7()); 
            // InternalDataDescriptionDsl.g:1240:2: ( rule__DataSource__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||(LA13_0>=14 && LA13_0<=31)||(LA13_0>=49 && LA13_0<=52)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1240:3: rule__DataSource__Group_7__0
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
    // InternalDataDescriptionDsl.g:1248:1: rule__DataSource__Group__8 : rule__DataSource__Group__8__Impl rule__DataSource__Group__9 ;
    public final void rule__DataSource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1252:1: ( rule__DataSource__Group__8__Impl rule__DataSource__Group__9 )
            // InternalDataDescriptionDsl.g:1253:2: rule__DataSource__Group__8__Impl rule__DataSource__Group__9
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
    // InternalDataDescriptionDsl.g:1260:1: rule__DataSource__Group__8__Impl : ( '}' ) ;
    public final void rule__DataSource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1264:1: ( ( '}' ) )
            // InternalDataDescriptionDsl.g:1265:1: ( '}' )
            {
            // InternalDataDescriptionDsl.g:1265:1: ( '}' )
            // InternalDataDescriptionDsl.g:1266:2: '}'
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
    // InternalDataDescriptionDsl.g:1275:1: rule__DataSource__Group__9 : rule__DataSource__Group__9__Impl ;
    public final void rule__DataSource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1279:1: ( rule__DataSource__Group__9__Impl )
            // InternalDataDescriptionDsl.g:1280:2: rule__DataSource__Group__9__Impl
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
    // InternalDataDescriptionDsl.g:1286:1: rule__DataSource__Group__9__Impl : ( ( rule__DataSource__Group_9__0 )? ) ;
    public final void rule__DataSource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1290:1: ( ( ( rule__DataSource__Group_9__0 )? ) )
            // InternalDataDescriptionDsl.g:1291:1: ( ( rule__DataSource__Group_9__0 )? )
            {
            // InternalDataDescriptionDsl.g:1291:1: ( ( rule__DataSource__Group_9__0 )? )
            // InternalDataDescriptionDsl.g:1292:2: ( rule__DataSource__Group_9__0 )?
            {
             before(grammarAccess.getDataSourceAccess().getGroup_9()); 
            // InternalDataDescriptionDsl.g:1293:2: ( rule__DataSource__Group_9__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1293:3: rule__DataSource__Group_9__0
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
    // InternalDataDescriptionDsl.g:1302:1: rule__DataSource__Group_3__0 : rule__DataSource__Group_3__0__Impl rule__DataSource__Group_3__1 ;
    public final void rule__DataSource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1306:1: ( rule__DataSource__Group_3__0__Impl rule__DataSource__Group_3__1 )
            // InternalDataDescriptionDsl.g:1307:2: rule__DataSource__Group_3__0__Impl rule__DataSource__Group_3__1
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
    // InternalDataDescriptionDsl.g:1314:1: rule__DataSource__Group_3__0__Impl : ( ( rule__DataSource__LinkAssignment_3_0 ) ) ;
    public final void rule__DataSource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1318:1: ( ( ( rule__DataSource__LinkAssignment_3_0 ) ) )
            // InternalDataDescriptionDsl.g:1319:1: ( ( rule__DataSource__LinkAssignment_3_0 ) )
            {
            // InternalDataDescriptionDsl.g:1319:1: ( ( rule__DataSource__LinkAssignment_3_0 ) )
            // InternalDataDescriptionDsl.g:1320:2: ( rule__DataSource__LinkAssignment_3_0 )
            {
             before(grammarAccess.getDataSourceAccess().getLinkAssignment_3_0()); 
            // InternalDataDescriptionDsl.g:1321:2: ( rule__DataSource__LinkAssignment_3_0 )
            // InternalDataDescriptionDsl.g:1321:3: rule__DataSource__LinkAssignment_3_0
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
    // InternalDataDescriptionDsl.g:1329:1: rule__DataSource__Group_3__1 : rule__DataSource__Group_3__1__Impl ;
    public final void rule__DataSource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1333:1: ( rule__DataSource__Group_3__1__Impl )
            // InternalDataDescriptionDsl.g:1334:2: rule__DataSource__Group_3__1__Impl
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
    // InternalDataDescriptionDsl.g:1340:1: rule__DataSource__Group_3__1__Impl : ( ( rule__DataSource__Group_3_1__0 )* ) ;
    public final void rule__DataSource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1344:1: ( ( ( rule__DataSource__Group_3_1__0 )* ) )
            // InternalDataDescriptionDsl.g:1345:1: ( ( rule__DataSource__Group_3_1__0 )* )
            {
            // InternalDataDescriptionDsl.g:1345:1: ( ( rule__DataSource__Group_3_1__0 )* )
            // InternalDataDescriptionDsl.g:1346:2: ( rule__DataSource__Group_3_1__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_3_1()); 
            // InternalDataDescriptionDsl.g:1347:2: ( rule__DataSource__Group_3_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:1347:3: rule__DataSource__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataSource__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalDataDescriptionDsl.g:1356:1: rule__DataSource__Group_3_1__0 : rule__DataSource__Group_3_1__0__Impl rule__DataSource__Group_3_1__1 ;
    public final void rule__DataSource__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1360:1: ( rule__DataSource__Group_3_1__0__Impl rule__DataSource__Group_3_1__1 )
            // InternalDataDescriptionDsl.g:1361:2: rule__DataSource__Group_3_1__0__Impl rule__DataSource__Group_3_1__1
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
    // InternalDataDescriptionDsl.g:1368:1: rule__DataSource__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1372:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:1373:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:1373:1: ( ',' )
            // InternalDataDescriptionDsl.g:1374:2: ','
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
    // InternalDataDescriptionDsl.g:1383:1: rule__DataSource__Group_3_1__1 : rule__DataSource__Group_3_1__1__Impl ;
    public final void rule__DataSource__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1387:1: ( rule__DataSource__Group_3_1__1__Impl )
            // InternalDataDescriptionDsl.g:1388:2: rule__DataSource__Group_3_1__1__Impl
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
    // InternalDataDescriptionDsl.g:1394:1: rule__DataSource__Group_3_1__1__Impl : ( ( rule__DataSource__LinkAssignment_3_1_1 ) ) ;
    public final void rule__DataSource__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1398:1: ( ( ( rule__DataSource__LinkAssignment_3_1_1 ) ) )
            // InternalDataDescriptionDsl.g:1399:1: ( ( rule__DataSource__LinkAssignment_3_1_1 ) )
            {
            // InternalDataDescriptionDsl.g:1399:1: ( ( rule__DataSource__LinkAssignment_3_1_1 ) )
            // InternalDataDescriptionDsl.g:1400:2: ( rule__DataSource__LinkAssignment_3_1_1 )
            {
             before(grammarAccess.getDataSourceAccess().getLinkAssignment_3_1_1()); 
            // InternalDataDescriptionDsl.g:1401:2: ( rule__DataSource__LinkAssignment_3_1_1 )
            // InternalDataDescriptionDsl.g:1401:3: rule__DataSource__LinkAssignment_3_1_1
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
    // InternalDataDescriptionDsl.g:1410:1: rule__DataSource__Group_4__0 : rule__DataSource__Group_4__0__Impl rule__DataSource__Group_4__1 ;
    public final void rule__DataSource__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1414:1: ( rule__DataSource__Group_4__0__Impl rule__DataSource__Group_4__1 )
            // InternalDataDescriptionDsl.g:1415:2: rule__DataSource__Group_4__0__Impl rule__DataSource__Group_4__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDescriptionDsl.g:1422:1: rule__DataSource__Group_4__0__Impl : ( 'uses' ) ;
    public final void rule__DataSource__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1426:1: ( ( 'uses' ) )
            // InternalDataDescriptionDsl.g:1427:1: ( 'uses' )
            {
            // InternalDataDescriptionDsl.g:1427:1: ( 'uses' )
            // InternalDataDescriptionDsl.g:1428:2: 'uses'
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
    // InternalDataDescriptionDsl.g:1437:1: rule__DataSource__Group_4__1 : rule__DataSource__Group_4__1__Impl rule__DataSource__Group_4__2 ;
    public final void rule__DataSource__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1441:1: ( rule__DataSource__Group_4__1__Impl rule__DataSource__Group_4__2 )
            // InternalDataDescriptionDsl.g:1442:2: rule__DataSource__Group_4__1__Impl rule__DataSource__Group_4__2
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
    // InternalDataDescriptionDsl.g:1449:1: rule__DataSource__Group_4__1__Impl : ( ( rule__DataSource__FragmentsAssignment_4_1 ) ) ;
    public final void rule__DataSource__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1453:1: ( ( ( rule__DataSource__FragmentsAssignment_4_1 ) ) )
            // InternalDataDescriptionDsl.g:1454:1: ( ( rule__DataSource__FragmentsAssignment_4_1 ) )
            {
            // InternalDataDescriptionDsl.g:1454:1: ( ( rule__DataSource__FragmentsAssignment_4_1 ) )
            // InternalDataDescriptionDsl.g:1455:2: ( rule__DataSource__FragmentsAssignment_4_1 )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsAssignment_4_1()); 
            // InternalDataDescriptionDsl.g:1456:2: ( rule__DataSource__FragmentsAssignment_4_1 )
            // InternalDataDescriptionDsl.g:1456:3: rule__DataSource__FragmentsAssignment_4_1
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
    // InternalDataDescriptionDsl.g:1464:1: rule__DataSource__Group_4__2 : rule__DataSource__Group_4__2__Impl ;
    public final void rule__DataSource__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1468:1: ( rule__DataSource__Group_4__2__Impl )
            // InternalDataDescriptionDsl.g:1469:2: rule__DataSource__Group_4__2__Impl
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
    // InternalDataDescriptionDsl.g:1475:1: rule__DataSource__Group_4__2__Impl : ( ( rule__DataSource__Group_4_2__0 )* ) ;
    public final void rule__DataSource__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1479:1: ( ( ( rule__DataSource__Group_4_2__0 )* ) )
            // InternalDataDescriptionDsl.g:1480:1: ( ( rule__DataSource__Group_4_2__0 )* )
            {
            // InternalDataDescriptionDsl.g:1480:1: ( ( rule__DataSource__Group_4_2__0 )* )
            // InternalDataDescriptionDsl.g:1481:2: ( rule__DataSource__Group_4_2__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_4_2()); 
            // InternalDataDescriptionDsl.g:1482:2: ( rule__DataSource__Group_4_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==35) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:1482:3: rule__DataSource__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataSource__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalDataDescriptionDsl.g:1491:1: rule__DataSource__Group_4_2__0 : rule__DataSource__Group_4_2__0__Impl rule__DataSource__Group_4_2__1 ;
    public final void rule__DataSource__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1495:1: ( rule__DataSource__Group_4_2__0__Impl rule__DataSource__Group_4_2__1 )
            // InternalDataDescriptionDsl.g:1496:2: rule__DataSource__Group_4_2__0__Impl rule__DataSource__Group_4_2__1
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
    // InternalDataDescriptionDsl.g:1503:1: rule__DataSource__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1507:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:1508:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:1508:1: ( ',' )
            // InternalDataDescriptionDsl.g:1509:2: ','
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
    // InternalDataDescriptionDsl.g:1518:1: rule__DataSource__Group_4_2__1 : rule__DataSource__Group_4_2__1__Impl ;
    public final void rule__DataSource__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1522:1: ( rule__DataSource__Group_4_2__1__Impl )
            // InternalDataDescriptionDsl.g:1523:2: rule__DataSource__Group_4_2__1__Impl
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
    // InternalDataDescriptionDsl.g:1529:1: rule__DataSource__Group_4_2__1__Impl : ( ( rule__DataSource__FragmentsAssignment_4_2_1 ) ) ;
    public final void rule__DataSource__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1533:1: ( ( ( rule__DataSource__FragmentsAssignment_4_2_1 ) ) )
            // InternalDataDescriptionDsl.g:1534:1: ( ( rule__DataSource__FragmentsAssignment_4_2_1 ) )
            {
            // InternalDataDescriptionDsl.g:1534:1: ( ( rule__DataSource__FragmentsAssignment_4_2_1 ) )
            // InternalDataDescriptionDsl.g:1535:2: ( rule__DataSource__FragmentsAssignment_4_2_1 )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsAssignment_4_2_1()); 
            // InternalDataDescriptionDsl.g:1536:2: ( rule__DataSource__FragmentsAssignment_4_2_1 )
            // InternalDataDescriptionDsl.g:1536:3: rule__DataSource__FragmentsAssignment_4_2_1
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
    // InternalDataDescriptionDsl.g:1545:1: rule__DataSource__Group_7__0 : rule__DataSource__Group_7__0__Impl rule__DataSource__Group_7__1 ;
    public final void rule__DataSource__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1549:1: ( rule__DataSource__Group_7__0__Impl rule__DataSource__Group_7__1 )
            // InternalDataDescriptionDsl.g:1550:2: rule__DataSource__Group_7__0__Impl rule__DataSource__Group_7__1
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
    // InternalDataDescriptionDsl.g:1557:1: rule__DataSource__Group_7__0__Impl : ( ( rule__DataSource__NodesAssignment_7_0 ) ) ;
    public final void rule__DataSource__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1561:1: ( ( ( rule__DataSource__NodesAssignment_7_0 ) ) )
            // InternalDataDescriptionDsl.g:1562:1: ( ( rule__DataSource__NodesAssignment_7_0 ) )
            {
            // InternalDataDescriptionDsl.g:1562:1: ( ( rule__DataSource__NodesAssignment_7_0 ) )
            // InternalDataDescriptionDsl.g:1563:2: ( rule__DataSource__NodesAssignment_7_0 )
            {
             before(grammarAccess.getDataSourceAccess().getNodesAssignment_7_0()); 
            // InternalDataDescriptionDsl.g:1564:2: ( rule__DataSource__NodesAssignment_7_0 )
            // InternalDataDescriptionDsl.g:1564:3: rule__DataSource__NodesAssignment_7_0
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
    // InternalDataDescriptionDsl.g:1572:1: rule__DataSource__Group_7__1 : rule__DataSource__Group_7__1__Impl ;
    public final void rule__DataSource__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1576:1: ( rule__DataSource__Group_7__1__Impl )
            // InternalDataDescriptionDsl.g:1577:2: rule__DataSource__Group_7__1__Impl
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
    // InternalDataDescriptionDsl.g:1583:1: rule__DataSource__Group_7__1__Impl : ( ( rule__DataSource__Group_7_1__0 )* ) ;
    public final void rule__DataSource__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1587:1: ( ( ( rule__DataSource__Group_7_1__0 )* ) )
            // InternalDataDescriptionDsl.g:1588:1: ( ( rule__DataSource__Group_7_1__0 )* )
            {
            // InternalDataDescriptionDsl.g:1588:1: ( ( rule__DataSource__Group_7_1__0 )* )
            // InternalDataDescriptionDsl.g:1589:2: ( rule__DataSource__Group_7_1__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_7_1()); 
            // InternalDataDescriptionDsl.g:1590:2: ( rule__DataSource__Group_7_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:1590:3: rule__DataSource__Group_7_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataSource__Group_7_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalDataDescriptionDsl.g:1599:1: rule__DataSource__Group_7_1__0 : rule__DataSource__Group_7_1__0__Impl rule__DataSource__Group_7_1__1 ;
    public final void rule__DataSource__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1603:1: ( rule__DataSource__Group_7_1__0__Impl rule__DataSource__Group_7_1__1 )
            // InternalDataDescriptionDsl.g:1604:2: rule__DataSource__Group_7_1__0__Impl rule__DataSource__Group_7_1__1
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
    // InternalDataDescriptionDsl.g:1611:1: rule__DataSource__Group_7_1__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1615:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:1616:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:1616:1: ( ',' )
            // InternalDataDescriptionDsl.g:1617:2: ','
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
    // InternalDataDescriptionDsl.g:1626:1: rule__DataSource__Group_7_1__1 : rule__DataSource__Group_7_1__1__Impl ;
    public final void rule__DataSource__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1630:1: ( rule__DataSource__Group_7_1__1__Impl )
            // InternalDataDescriptionDsl.g:1631:2: rule__DataSource__Group_7_1__1__Impl
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
    // InternalDataDescriptionDsl.g:1637:1: rule__DataSource__Group_7_1__1__Impl : ( ( rule__DataSource__NodesAssignment_7_1_1 ) ) ;
    public final void rule__DataSource__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1641:1: ( ( ( rule__DataSource__NodesAssignment_7_1_1 ) ) )
            // InternalDataDescriptionDsl.g:1642:1: ( ( rule__DataSource__NodesAssignment_7_1_1 ) )
            {
            // InternalDataDescriptionDsl.g:1642:1: ( ( rule__DataSource__NodesAssignment_7_1_1 ) )
            // InternalDataDescriptionDsl.g:1643:2: ( rule__DataSource__NodesAssignment_7_1_1 )
            {
             before(grammarAccess.getDataSourceAccess().getNodesAssignment_7_1_1()); 
            // InternalDataDescriptionDsl.g:1644:2: ( rule__DataSource__NodesAssignment_7_1_1 )
            // InternalDataDescriptionDsl.g:1644:3: rule__DataSource__NodesAssignment_7_1_1
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
    // InternalDataDescriptionDsl.g:1653:1: rule__DataSource__Group_9__0 : rule__DataSource__Group_9__0__Impl rule__DataSource__Group_9__1 ;
    public final void rule__DataSource__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1657:1: ( rule__DataSource__Group_9__0__Impl rule__DataSource__Group_9__1 )
            // InternalDataDescriptionDsl.g:1658:2: rule__DataSource__Group_9__0__Impl rule__DataSource__Group_9__1
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
    // InternalDataDescriptionDsl.g:1665:1: rule__DataSource__Group_9__0__Impl : ( '[' ) ;
    public final void rule__DataSource__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1669:1: ( ( '[' ) )
            // InternalDataDescriptionDsl.g:1670:1: ( '[' )
            {
            // InternalDataDescriptionDsl.g:1670:1: ( '[' )
            // InternalDataDescriptionDsl.g:1671:2: '['
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
    // InternalDataDescriptionDsl.g:1680:1: rule__DataSource__Group_9__1 : rule__DataSource__Group_9__1__Impl rule__DataSource__Group_9__2 ;
    public final void rule__DataSource__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1684:1: ( rule__DataSource__Group_9__1__Impl rule__DataSource__Group_9__2 )
            // InternalDataDescriptionDsl.g:1685:2: rule__DataSource__Group_9__1__Impl rule__DataSource__Group_9__2
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
    // InternalDataDescriptionDsl.g:1692:1: rule__DataSource__Group_9__1__Impl : ( ( rule__DataSource__OptionsAssignment_9_1 ) ) ;
    public final void rule__DataSource__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1696:1: ( ( ( rule__DataSource__OptionsAssignment_9_1 ) ) )
            // InternalDataDescriptionDsl.g:1697:1: ( ( rule__DataSource__OptionsAssignment_9_1 ) )
            {
            // InternalDataDescriptionDsl.g:1697:1: ( ( rule__DataSource__OptionsAssignment_9_1 ) )
            // InternalDataDescriptionDsl.g:1698:2: ( rule__DataSource__OptionsAssignment_9_1 )
            {
             before(grammarAccess.getDataSourceAccess().getOptionsAssignment_9_1()); 
            // InternalDataDescriptionDsl.g:1699:2: ( rule__DataSource__OptionsAssignment_9_1 )
            // InternalDataDescriptionDsl.g:1699:3: rule__DataSource__OptionsAssignment_9_1
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
    // InternalDataDescriptionDsl.g:1707:1: rule__DataSource__Group_9__2 : rule__DataSource__Group_9__2__Impl rule__DataSource__Group_9__3 ;
    public final void rule__DataSource__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1711:1: ( rule__DataSource__Group_9__2__Impl rule__DataSource__Group_9__3 )
            // InternalDataDescriptionDsl.g:1712:2: rule__DataSource__Group_9__2__Impl rule__DataSource__Group_9__3
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
    // InternalDataDescriptionDsl.g:1719:1: rule__DataSource__Group_9__2__Impl : ( ( rule__DataSource__Group_9_2__0 )* ) ;
    public final void rule__DataSource__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1723:1: ( ( ( rule__DataSource__Group_9_2__0 )* ) )
            // InternalDataDescriptionDsl.g:1724:1: ( ( rule__DataSource__Group_9_2__0 )* )
            {
            // InternalDataDescriptionDsl.g:1724:1: ( ( rule__DataSource__Group_9_2__0 )* )
            // InternalDataDescriptionDsl.g:1725:2: ( rule__DataSource__Group_9_2__0 )*
            {
             before(grammarAccess.getDataSourceAccess().getGroup_9_2()); 
            // InternalDataDescriptionDsl.g:1726:2: ( rule__DataSource__Group_9_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==35) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:1726:3: rule__DataSource__Group_9_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataSource__Group_9_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalDataDescriptionDsl.g:1734:1: rule__DataSource__Group_9__3 : rule__DataSource__Group_9__3__Impl ;
    public final void rule__DataSource__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1738:1: ( rule__DataSource__Group_9__3__Impl )
            // InternalDataDescriptionDsl.g:1739:2: rule__DataSource__Group_9__3__Impl
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
    // InternalDataDescriptionDsl.g:1745:1: rule__DataSource__Group_9__3__Impl : ( ']' ) ;
    public final void rule__DataSource__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1749:1: ( ( ']' ) )
            // InternalDataDescriptionDsl.g:1750:1: ( ']' )
            {
            // InternalDataDescriptionDsl.g:1750:1: ( ']' )
            // InternalDataDescriptionDsl.g:1751:2: ']'
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
    // InternalDataDescriptionDsl.g:1761:1: rule__DataSource__Group_9_2__0 : rule__DataSource__Group_9_2__0__Impl rule__DataSource__Group_9_2__1 ;
    public final void rule__DataSource__Group_9_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1765:1: ( rule__DataSource__Group_9_2__0__Impl rule__DataSource__Group_9_2__1 )
            // InternalDataDescriptionDsl.g:1766:2: rule__DataSource__Group_9_2__0__Impl rule__DataSource__Group_9_2__1
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
    // InternalDataDescriptionDsl.g:1773:1: rule__DataSource__Group_9_2__0__Impl : ( ',' ) ;
    public final void rule__DataSource__Group_9_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1777:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:1778:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:1778:1: ( ',' )
            // InternalDataDescriptionDsl.g:1779:2: ','
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
    // InternalDataDescriptionDsl.g:1788:1: rule__DataSource__Group_9_2__1 : rule__DataSource__Group_9_2__1__Impl ;
    public final void rule__DataSource__Group_9_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1792:1: ( rule__DataSource__Group_9_2__1__Impl )
            // InternalDataDescriptionDsl.g:1793:2: rule__DataSource__Group_9_2__1__Impl
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
    // InternalDataDescriptionDsl.g:1799:1: rule__DataSource__Group_9_2__1__Impl : ( ( rule__DataSource__OptionsAssignment_9_2_1 ) ) ;
    public final void rule__DataSource__Group_9_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1803:1: ( ( ( rule__DataSource__OptionsAssignment_9_2_1 ) ) )
            // InternalDataDescriptionDsl.g:1804:1: ( ( rule__DataSource__OptionsAssignment_9_2_1 ) )
            {
            // InternalDataDescriptionDsl.g:1804:1: ( ( rule__DataSource__OptionsAssignment_9_2_1 ) )
            // InternalDataDescriptionDsl.g:1805:2: ( rule__DataSource__OptionsAssignment_9_2_1 )
            {
             before(grammarAccess.getDataSourceAccess().getOptionsAssignment_9_2_1()); 
            // InternalDataDescriptionDsl.g:1806:2: ( rule__DataSource__OptionsAssignment_9_2_1 )
            // InternalDataDescriptionDsl.g:1806:3: rule__DataSource__OptionsAssignment_9_2_1
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
    // InternalDataDescriptionDsl.g:1815:1: rule__DataFragment__Group__0 : rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1 ;
    public final void rule__DataFragment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1819:1: ( rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1 )
            // InternalDataDescriptionDsl.g:1820:2: rule__DataFragment__Group__0__Impl rule__DataFragment__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDescriptionDsl.g:1827:1: rule__DataFragment__Group__0__Impl : ( 'fragment' ) ;
    public final void rule__DataFragment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1831:1: ( ( 'fragment' ) )
            // InternalDataDescriptionDsl.g:1832:1: ( 'fragment' )
            {
            // InternalDataDescriptionDsl.g:1832:1: ( 'fragment' )
            // InternalDataDescriptionDsl.g:1833:2: 'fragment'
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
    // InternalDataDescriptionDsl.g:1842:1: rule__DataFragment__Group__1 : rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2 ;
    public final void rule__DataFragment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1846:1: ( rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2 )
            // InternalDataDescriptionDsl.g:1847:2: rule__DataFragment__Group__1__Impl rule__DataFragment__Group__2
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
    // InternalDataDescriptionDsl.g:1854:1: rule__DataFragment__Group__1__Impl : ( ( rule__DataFragment__NameAssignment_1 ) ) ;
    public final void rule__DataFragment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1858:1: ( ( ( rule__DataFragment__NameAssignment_1 ) ) )
            // InternalDataDescriptionDsl.g:1859:1: ( ( rule__DataFragment__NameAssignment_1 ) )
            {
            // InternalDataDescriptionDsl.g:1859:1: ( ( rule__DataFragment__NameAssignment_1 ) )
            // InternalDataDescriptionDsl.g:1860:2: ( rule__DataFragment__NameAssignment_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getNameAssignment_1()); 
            // InternalDataDescriptionDsl.g:1861:2: ( rule__DataFragment__NameAssignment_1 )
            // InternalDataDescriptionDsl.g:1861:3: rule__DataFragment__NameAssignment_1
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
    // InternalDataDescriptionDsl.g:1869:1: rule__DataFragment__Group__2 : rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3 ;
    public final void rule__DataFragment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1873:1: ( rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3 )
            // InternalDataDescriptionDsl.g:1874:2: rule__DataFragment__Group__2__Impl rule__DataFragment__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalDataDescriptionDsl.g:1881:1: rule__DataFragment__Group__2__Impl : ( '=' ) ;
    public final void rule__DataFragment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1885:1: ( ( '=' ) )
            // InternalDataDescriptionDsl.g:1886:1: ( '=' )
            {
            // InternalDataDescriptionDsl.g:1886:1: ( '=' )
            // InternalDataDescriptionDsl.g:1887:2: '='
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
    // InternalDataDescriptionDsl.g:1896:1: rule__DataFragment__Group__3 : rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4 ;
    public final void rule__DataFragment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1900:1: ( rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4 )
            // InternalDataDescriptionDsl.g:1901:2: rule__DataFragment__Group__3__Impl rule__DataFragment__Group__4
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
    // InternalDataDescriptionDsl.g:1908:1: rule__DataFragment__Group__3__Impl : ( '{' ) ;
    public final void rule__DataFragment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1912:1: ( ( '{' ) )
            // InternalDataDescriptionDsl.g:1913:1: ( '{' )
            {
            // InternalDataDescriptionDsl.g:1913:1: ( '{' )
            // InternalDataDescriptionDsl.g:1914:2: '{'
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
    // InternalDataDescriptionDsl.g:1923:1: rule__DataFragment__Group__4 : rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5 ;
    public final void rule__DataFragment__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1927:1: ( rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5 )
            // InternalDataDescriptionDsl.g:1928:2: rule__DataFragment__Group__4__Impl rule__DataFragment__Group__5
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
    // InternalDataDescriptionDsl.g:1935:1: rule__DataFragment__Group__4__Impl : ( ( rule__DataFragment__Group_4__0 )? ) ;
    public final void rule__DataFragment__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1939:1: ( ( ( rule__DataFragment__Group_4__0 )? ) )
            // InternalDataDescriptionDsl.g:1940:1: ( ( rule__DataFragment__Group_4__0 )? )
            {
            // InternalDataDescriptionDsl.g:1940:1: ( ( rule__DataFragment__Group_4__0 )? )
            // InternalDataDescriptionDsl.g:1941:2: ( rule__DataFragment__Group_4__0 )?
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_4()); 
            // InternalDataDescriptionDsl.g:1942:2: ( rule__DataFragment__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)||(LA19_0>=14 && LA19_0<=31)||(LA19_0>=49 && LA19_0<=52)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1942:3: rule__DataFragment__Group_4__0
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
    // InternalDataDescriptionDsl.g:1950:1: rule__DataFragment__Group__5 : rule__DataFragment__Group__5__Impl rule__DataFragment__Group__6 ;
    public final void rule__DataFragment__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1954:1: ( rule__DataFragment__Group__5__Impl rule__DataFragment__Group__6 )
            // InternalDataDescriptionDsl.g:1955:2: rule__DataFragment__Group__5__Impl rule__DataFragment__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__DataFragment__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group__6();

            state._fsp--;


            }

        }
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
    // InternalDataDescriptionDsl.g:1962:1: rule__DataFragment__Group__5__Impl : ( '}' ) ;
    public final void rule__DataFragment__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1966:1: ( ( '}' ) )
            // InternalDataDescriptionDsl.g:1967:1: ( '}' )
            {
            // InternalDataDescriptionDsl.g:1967:1: ( '}' )
            // InternalDataDescriptionDsl.g:1968:2: '}'
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


    // $ANTLR start "rule__DataFragment__Group__6"
    // InternalDataDescriptionDsl.g:1977:1: rule__DataFragment__Group__6 : rule__DataFragment__Group__6__Impl ;
    public final void rule__DataFragment__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1981:1: ( rule__DataFragment__Group__6__Impl )
            // InternalDataDescriptionDsl.g:1982:2: rule__DataFragment__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__6"


    // $ANTLR start "rule__DataFragment__Group__6__Impl"
    // InternalDataDescriptionDsl.g:1988:1: rule__DataFragment__Group__6__Impl : ( ( rule__DataFragment__Group_6__0 )? ) ;
    public final void rule__DataFragment__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:1992:1: ( ( ( rule__DataFragment__Group_6__0 )? ) )
            // InternalDataDescriptionDsl.g:1993:1: ( ( rule__DataFragment__Group_6__0 )? )
            {
            // InternalDataDescriptionDsl.g:1993:1: ( ( rule__DataFragment__Group_6__0 )? )
            // InternalDataDescriptionDsl.g:1994:2: ( rule__DataFragment__Group_6__0 )?
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_6()); 
            // InternalDataDescriptionDsl.g:1995:2: ( rule__DataFragment__Group_6__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDataDescriptionDsl.g:1995:3: rule__DataFragment__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataFragment__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFragmentAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group__6__Impl"


    // $ANTLR start "rule__DataFragment__Group_4__0"
    // InternalDataDescriptionDsl.g:2004:1: rule__DataFragment__Group_4__0 : rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1 ;
    public final void rule__DataFragment__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2008:1: ( rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1 )
            // InternalDataDescriptionDsl.g:2009:2: rule__DataFragment__Group_4__0__Impl rule__DataFragment__Group_4__1
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
    // InternalDataDescriptionDsl.g:2016:1: rule__DataFragment__Group_4__0__Impl : ( ( rule__DataFragment__NodesAssignment_4_0 ) ) ;
    public final void rule__DataFragment__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2020:1: ( ( ( rule__DataFragment__NodesAssignment_4_0 ) ) )
            // InternalDataDescriptionDsl.g:2021:1: ( ( rule__DataFragment__NodesAssignment_4_0 ) )
            {
            // InternalDataDescriptionDsl.g:2021:1: ( ( rule__DataFragment__NodesAssignment_4_0 ) )
            // InternalDataDescriptionDsl.g:2022:2: ( rule__DataFragment__NodesAssignment_4_0 )
            {
             before(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_0()); 
            // InternalDataDescriptionDsl.g:2023:2: ( rule__DataFragment__NodesAssignment_4_0 )
            // InternalDataDescriptionDsl.g:2023:3: rule__DataFragment__NodesAssignment_4_0
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
    // InternalDataDescriptionDsl.g:2031:1: rule__DataFragment__Group_4__1 : rule__DataFragment__Group_4__1__Impl ;
    public final void rule__DataFragment__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2035:1: ( rule__DataFragment__Group_4__1__Impl )
            // InternalDataDescriptionDsl.g:2036:2: rule__DataFragment__Group_4__1__Impl
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
    // InternalDataDescriptionDsl.g:2042:1: rule__DataFragment__Group_4__1__Impl : ( ( rule__DataFragment__Group_4_1__0 )* ) ;
    public final void rule__DataFragment__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2046:1: ( ( ( rule__DataFragment__Group_4_1__0 )* ) )
            // InternalDataDescriptionDsl.g:2047:1: ( ( rule__DataFragment__Group_4_1__0 )* )
            {
            // InternalDataDescriptionDsl.g:2047:1: ( ( rule__DataFragment__Group_4_1__0 )* )
            // InternalDataDescriptionDsl.g:2048:2: ( rule__DataFragment__Group_4_1__0 )*
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_4_1()); 
            // InternalDataDescriptionDsl.g:2049:2: ( rule__DataFragment__Group_4_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==35) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:2049:3: rule__DataFragment__Group_4_1__0
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
    // InternalDataDescriptionDsl.g:2058:1: rule__DataFragment__Group_4_1__0 : rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1 ;
    public final void rule__DataFragment__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2062:1: ( rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1 )
            // InternalDataDescriptionDsl.g:2063:2: rule__DataFragment__Group_4_1__0__Impl rule__DataFragment__Group_4_1__1
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
    // InternalDataDescriptionDsl.g:2070:1: rule__DataFragment__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__DataFragment__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2074:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:2075:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:2075:1: ( ',' )
            // InternalDataDescriptionDsl.g:2076:2: ','
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
    // InternalDataDescriptionDsl.g:2085:1: rule__DataFragment__Group_4_1__1 : rule__DataFragment__Group_4_1__1__Impl ;
    public final void rule__DataFragment__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2089:1: ( rule__DataFragment__Group_4_1__1__Impl )
            // InternalDataDescriptionDsl.g:2090:2: rule__DataFragment__Group_4_1__1__Impl
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
    // InternalDataDescriptionDsl.g:2096:1: rule__DataFragment__Group_4_1__1__Impl : ( ( rule__DataFragment__NodesAssignment_4_1_1 ) ) ;
    public final void rule__DataFragment__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2100:1: ( ( ( rule__DataFragment__NodesAssignment_4_1_1 ) ) )
            // InternalDataDescriptionDsl.g:2101:1: ( ( rule__DataFragment__NodesAssignment_4_1_1 ) )
            {
            // InternalDataDescriptionDsl.g:2101:1: ( ( rule__DataFragment__NodesAssignment_4_1_1 ) )
            // InternalDataDescriptionDsl.g:2102:2: ( rule__DataFragment__NodesAssignment_4_1_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getNodesAssignment_4_1_1()); 
            // InternalDataDescriptionDsl.g:2103:2: ( rule__DataFragment__NodesAssignment_4_1_1 )
            // InternalDataDescriptionDsl.g:2103:3: rule__DataFragment__NodesAssignment_4_1_1
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


    // $ANTLR start "rule__DataFragment__Group_6__0"
    // InternalDataDescriptionDsl.g:2112:1: rule__DataFragment__Group_6__0 : rule__DataFragment__Group_6__0__Impl rule__DataFragment__Group_6__1 ;
    public final void rule__DataFragment__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2116:1: ( rule__DataFragment__Group_6__0__Impl rule__DataFragment__Group_6__1 )
            // InternalDataDescriptionDsl.g:2117:2: rule__DataFragment__Group_6__0__Impl rule__DataFragment__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__DataFragment__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6__0"


    // $ANTLR start "rule__DataFragment__Group_6__0__Impl"
    // InternalDataDescriptionDsl.g:2124:1: rule__DataFragment__Group_6__0__Impl : ( '[' ) ;
    public final void rule__DataFragment__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2128:1: ( ( '[' ) )
            // InternalDataDescriptionDsl.g:2129:1: ( '[' )
            {
            // InternalDataDescriptionDsl.g:2129:1: ( '[' )
            // InternalDataDescriptionDsl.g:2130:2: '['
            {
             before(grammarAccess.getDataFragmentAccess().getLeftSquareBracketKeyword_6_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getLeftSquareBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6__0__Impl"


    // $ANTLR start "rule__DataFragment__Group_6__1"
    // InternalDataDescriptionDsl.g:2139:1: rule__DataFragment__Group_6__1 : rule__DataFragment__Group_6__1__Impl rule__DataFragment__Group_6__2 ;
    public final void rule__DataFragment__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2143:1: ( rule__DataFragment__Group_6__1__Impl rule__DataFragment__Group_6__2 )
            // InternalDataDescriptionDsl.g:2144:2: rule__DataFragment__Group_6__1__Impl rule__DataFragment__Group_6__2
            {
            pushFollow(FOLLOW_15);
            rule__DataFragment__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6__1"


    // $ANTLR start "rule__DataFragment__Group_6__1__Impl"
    // InternalDataDescriptionDsl.g:2151:1: rule__DataFragment__Group_6__1__Impl : ( ( rule__DataFragment__OptionsAssignment_6_1 ) ) ;
    public final void rule__DataFragment__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2155:1: ( ( ( rule__DataFragment__OptionsAssignment_6_1 ) ) )
            // InternalDataDescriptionDsl.g:2156:1: ( ( rule__DataFragment__OptionsAssignment_6_1 ) )
            {
            // InternalDataDescriptionDsl.g:2156:1: ( ( rule__DataFragment__OptionsAssignment_6_1 ) )
            // InternalDataDescriptionDsl.g:2157:2: ( rule__DataFragment__OptionsAssignment_6_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getOptionsAssignment_6_1()); 
            // InternalDataDescriptionDsl.g:2158:2: ( rule__DataFragment__OptionsAssignment_6_1 )
            // InternalDataDescriptionDsl.g:2158:3: rule__DataFragment__OptionsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__OptionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFragmentAccess().getOptionsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6__1__Impl"


    // $ANTLR start "rule__DataFragment__Group_6__2"
    // InternalDataDescriptionDsl.g:2166:1: rule__DataFragment__Group_6__2 : rule__DataFragment__Group_6__2__Impl rule__DataFragment__Group_6__3 ;
    public final void rule__DataFragment__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2170:1: ( rule__DataFragment__Group_6__2__Impl rule__DataFragment__Group_6__3 )
            // InternalDataDescriptionDsl.g:2171:2: rule__DataFragment__Group_6__2__Impl rule__DataFragment__Group_6__3
            {
            pushFollow(FOLLOW_15);
            rule__DataFragment__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6__2"


    // $ANTLR start "rule__DataFragment__Group_6__2__Impl"
    // InternalDataDescriptionDsl.g:2178:1: rule__DataFragment__Group_6__2__Impl : ( ( rule__DataFragment__Group_6_2__0 )* ) ;
    public final void rule__DataFragment__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2182:1: ( ( ( rule__DataFragment__Group_6_2__0 )* ) )
            // InternalDataDescriptionDsl.g:2183:1: ( ( rule__DataFragment__Group_6_2__0 )* )
            {
            // InternalDataDescriptionDsl.g:2183:1: ( ( rule__DataFragment__Group_6_2__0 )* )
            // InternalDataDescriptionDsl.g:2184:2: ( rule__DataFragment__Group_6_2__0 )*
            {
             before(grammarAccess.getDataFragmentAccess().getGroup_6_2()); 
            // InternalDataDescriptionDsl.g:2185:2: ( rule__DataFragment__Group_6_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==35) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:2185:3: rule__DataFragment__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__DataFragment__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getDataFragmentAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6__2__Impl"


    // $ANTLR start "rule__DataFragment__Group_6__3"
    // InternalDataDescriptionDsl.g:2193:1: rule__DataFragment__Group_6__3 : rule__DataFragment__Group_6__3__Impl ;
    public final void rule__DataFragment__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2197:1: ( rule__DataFragment__Group_6__3__Impl )
            // InternalDataDescriptionDsl.g:2198:2: rule__DataFragment__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6__3"


    // $ANTLR start "rule__DataFragment__Group_6__3__Impl"
    // InternalDataDescriptionDsl.g:2204:1: rule__DataFragment__Group_6__3__Impl : ( ']' ) ;
    public final void rule__DataFragment__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2208:1: ( ( ']' ) )
            // InternalDataDescriptionDsl.g:2209:1: ( ']' )
            {
            // InternalDataDescriptionDsl.g:2209:1: ( ']' )
            // InternalDataDescriptionDsl.g:2210:2: ']'
            {
             before(grammarAccess.getDataFragmentAccess().getRightSquareBracketKeyword_6_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getRightSquareBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6__3__Impl"


    // $ANTLR start "rule__DataFragment__Group_6_2__0"
    // InternalDataDescriptionDsl.g:2220:1: rule__DataFragment__Group_6_2__0 : rule__DataFragment__Group_6_2__0__Impl rule__DataFragment__Group_6_2__1 ;
    public final void rule__DataFragment__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2224:1: ( rule__DataFragment__Group_6_2__0__Impl rule__DataFragment__Group_6_2__1 )
            // InternalDataDescriptionDsl.g:2225:2: rule__DataFragment__Group_6_2__0__Impl rule__DataFragment__Group_6_2__1
            {
            pushFollow(FOLLOW_7);
            rule__DataFragment__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6_2__0"


    // $ANTLR start "rule__DataFragment__Group_6_2__0__Impl"
    // InternalDataDescriptionDsl.g:2232:1: rule__DataFragment__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__DataFragment__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2236:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:2237:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:2237:1: ( ',' )
            // InternalDataDescriptionDsl.g:2238:2: ','
            {
             before(grammarAccess.getDataFragmentAccess().getCommaKeyword_6_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataFragmentAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6_2__0__Impl"


    // $ANTLR start "rule__DataFragment__Group_6_2__1"
    // InternalDataDescriptionDsl.g:2247:1: rule__DataFragment__Group_6_2__1 : rule__DataFragment__Group_6_2__1__Impl ;
    public final void rule__DataFragment__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2251:1: ( rule__DataFragment__Group_6_2__1__Impl )
            // InternalDataDescriptionDsl.g:2252:2: rule__DataFragment__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6_2__1"


    // $ANTLR start "rule__DataFragment__Group_6_2__1__Impl"
    // InternalDataDescriptionDsl.g:2258:1: rule__DataFragment__Group_6_2__1__Impl : ( ( rule__DataFragment__OptionsAssignment_6_2_1 ) ) ;
    public final void rule__DataFragment__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2262:1: ( ( ( rule__DataFragment__OptionsAssignment_6_2_1 ) ) )
            // InternalDataDescriptionDsl.g:2263:1: ( ( rule__DataFragment__OptionsAssignment_6_2_1 ) )
            {
            // InternalDataDescriptionDsl.g:2263:1: ( ( rule__DataFragment__OptionsAssignment_6_2_1 ) )
            // InternalDataDescriptionDsl.g:2264:2: ( rule__DataFragment__OptionsAssignment_6_2_1 )
            {
             before(grammarAccess.getDataFragmentAccess().getOptionsAssignment_6_2_1()); 
            // InternalDataDescriptionDsl.g:2265:2: ( rule__DataFragment__OptionsAssignment_6_2_1 )
            // InternalDataDescriptionDsl.g:2265:3: rule__DataFragment__OptionsAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataFragment__OptionsAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataFragmentAccess().getOptionsAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__Group_6_2__1__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // InternalDataDescriptionDsl.g:2274:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2278:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalDataDescriptionDsl.g:2279:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalDataDescriptionDsl.g:2286:1: rule__Option__Group__0__Impl : ( ( rule__Option__KeyAssignment_0 ) ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2290:1: ( ( ( rule__Option__KeyAssignment_0 ) ) )
            // InternalDataDescriptionDsl.g:2291:1: ( ( rule__Option__KeyAssignment_0 ) )
            {
            // InternalDataDescriptionDsl.g:2291:1: ( ( rule__Option__KeyAssignment_0 ) )
            // InternalDataDescriptionDsl.g:2292:2: ( rule__Option__KeyAssignment_0 )
            {
             before(grammarAccess.getOptionAccess().getKeyAssignment_0()); 
            // InternalDataDescriptionDsl.g:2293:2: ( rule__Option__KeyAssignment_0 )
            // InternalDataDescriptionDsl.g:2293:3: rule__Option__KeyAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Option__KeyAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getKeyAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // InternalDataDescriptionDsl.g:2301:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2305:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // InternalDataDescriptionDsl.g:2306:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalDataDescriptionDsl.g:2313:1: rule__Option__Group__1__Impl : ( '=' ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2317:1: ( ( '=' ) )
            // InternalDataDescriptionDsl.g:2318:1: ( '=' )
            {
            // InternalDataDescriptionDsl.g:2318:1: ( '=' )
            // InternalDataDescriptionDsl.g:2319:2: '='
            {
             before(grammarAccess.getOptionAccess().getEqualsSignKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:2328:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2332:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // InternalDataDescriptionDsl.g:2333:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDescriptionDsl.g:2340:1: rule__Option__Group__2__Impl : ( '{' ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2344:1: ( ( '{' ) )
            // InternalDataDescriptionDsl.g:2345:1: ( '{' )
            {
            // InternalDataDescriptionDsl.g:2345:1: ( '{' )
            // InternalDataDescriptionDsl.g:2346:2: '{'
            {
             before(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:2355:1: rule__Option__Group__3 : rule__Option__Group__3__Impl rule__Option__Group__4 ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2359:1: ( rule__Option__Group__3__Impl rule__Option__Group__4 )
            // InternalDataDescriptionDsl.g:2360:2: rule__Option__Group__3__Impl rule__Option__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalDataDescriptionDsl.g:2367:1: rule__Option__Group__3__Impl : ( ( rule__Option__ValuesAssignment_3 ) ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2371:1: ( ( ( rule__Option__ValuesAssignment_3 ) ) )
            // InternalDataDescriptionDsl.g:2372:1: ( ( rule__Option__ValuesAssignment_3 ) )
            {
            // InternalDataDescriptionDsl.g:2372:1: ( ( rule__Option__ValuesAssignment_3 ) )
            // InternalDataDescriptionDsl.g:2373:2: ( rule__Option__ValuesAssignment_3 )
            {
             before(grammarAccess.getOptionAccess().getValuesAssignment_3()); 
            // InternalDataDescriptionDsl.g:2374:2: ( rule__Option__ValuesAssignment_3 )
            // InternalDataDescriptionDsl.g:2374:3: rule__Option__ValuesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Option__ValuesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getValuesAssignment_3()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:2382:1: rule__Option__Group__4 : rule__Option__Group__4__Impl rule__Option__Group__5 ;
    public final void rule__Option__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2386:1: ( rule__Option__Group__4__Impl rule__Option__Group__5 )
            // InternalDataDescriptionDsl.g:2387:2: rule__Option__Group__4__Impl rule__Option__Group__5
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
    // InternalDataDescriptionDsl.g:2394:1: rule__Option__Group__4__Impl : ( ( rule__Option__Group_4__0 )* ) ;
    public final void rule__Option__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2398:1: ( ( ( rule__Option__Group_4__0 )* ) )
            // InternalDataDescriptionDsl.g:2399:1: ( ( rule__Option__Group_4__0 )* )
            {
            // InternalDataDescriptionDsl.g:2399:1: ( ( rule__Option__Group_4__0 )* )
            // InternalDataDescriptionDsl.g:2400:2: ( rule__Option__Group_4__0 )*
            {
             before(grammarAccess.getOptionAccess().getGroup_4()); 
            // InternalDataDescriptionDsl.g:2401:2: ( rule__Option__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==35) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:2401:3: rule__Option__Group_4__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Option__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getOptionAccess().getGroup_4()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:2409:1: rule__Option__Group__5 : rule__Option__Group__5__Impl ;
    public final void rule__Option__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2413:1: ( rule__Option__Group__5__Impl )
            // InternalDataDescriptionDsl.g:2414:2: rule__Option__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataDescriptionDsl.g:2420:1: rule__Option__Group__5__Impl : ( '}' ) ;
    public final void rule__Option__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2424:1: ( ( '}' ) )
            // InternalDataDescriptionDsl.g:2425:1: ( '}' )
            {
            // InternalDataDescriptionDsl.g:2425:1: ( '}' )
            // InternalDataDescriptionDsl.g:2426:2: '}'
            {
             before(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Option__Group_4__0"
    // InternalDataDescriptionDsl.g:2436:1: rule__Option__Group_4__0 : rule__Option__Group_4__0__Impl rule__Option__Group_4__1 ;
    public final void rule__Option__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2440:1: ( rule__Option__Group_4__0__Impl rule__Option__Group_4__1 )
            // InternalDataDescriptionDsl.g:2441:2: rule__Option__Group_4__0__Impl rule__Option__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Option__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__0"


    // $ANTLR start "rule__Option__Group_4__0__Impl"
    // InternalDataDescriptionDsl.g:2448:1: rule__Option__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Option__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2452:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:2453:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:2453:1: ( ',' )
            // InternalDataDescriptionDsl.g:2454:2: ','
            {
             before(grammarAccess.getOptionAccess().getCommaKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__0__Impl"


    // $ANTLR start "rule__Option__Group_4__1"
    // InternalDataDescriptionDsl.g:2463:1: rule__Option__Group_4__1 : rule__Option__Group_4__1__Impl ;
    public final void rule__Option__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2467:1: ( rule__Option__Group_4__1__Impl )
            // InternalDataDescriptionDsl.g:2468:2: rule__Option__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__1"


    // $ANTLR start "rule__Option__Group_4__1__Impl"
    // InternalDataDescriptionDsl.g:2474:1: rule__Option__Group_4__1__Impl : ( ( rule__Option__ValuesAssignment_4_1 ) ) ;
    public final void rule__Option__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2478:1: ( ( ( rule__Option__ValuesAssignment_4_1 ) ) )
            // InternalDataDescriptionDsl.g:2479:1: ( ( rule__Option__ValuesAssignment_4_1 ) )
            {
            // InternalDataDescriptionDsl.g:2479:1: ( ( rule__Option__ValuesAssignment_4_1 ) )
            // InternalDataDescriptionDsl.g:2480:2: ( rule__Option__ValuesAssignment_4_1 )
            {
             before(grammarAccess.getOptionAccess().getValuesAssignment_4_1()); 
            // InternalDataDescriptionDsl.g:2481:2: ( rule__Option__ValuesAssignment_4_1 )
            // InternalDataDescriptionDsl.g:2481:3: rule__Option__ValuesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__ValuesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getValuesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group_4__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group__0"
    // InternalDataDescriptionDsl.g:2490:1: rule__CompositeNode__Group__0 : rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 ;
    public final void rule__CompositeNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2494:1: ( rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1 )
            // InternalDataDescriptionDsl.g:2495:2: rule__CompositeNode__Group__0__Impl rule__CompositeNode__Group__1
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
    // InternalDataDescriptionDsl.g:2502:1: rule__CompositeNode__Group__0__Impl : ( ( rule__CompositeNode__EnvironmentAssignment_0 )? ) ;
    public final void rule__CompositeNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2506:1: ( ( ( rule__CompositeNode__EnvironmentAssignment_0 )? ) )
            // InternalDataDescriptionDsl.g:2507:1: ( ( rule__CompositeNode__EnvironmentAssignment_0 )? )
            {
            // InternalDataDescriptionDsl.g:2507:1: ( ( rule__CompositeNode__EnvironmentAssignment_0 )? )
            // InternalDataDescriptionDsl.g:2508:2: ( rule__CompositeNode__EnvironmentAssignment_0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getEnvironmentAssignment_0()); 
            // InternalDataDescriptionDsl.g:2509:2: ( rule__CompositeNode__EnvironmentAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==50) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDataDescriptionDsl.g:2509:3: rule__CompositeNode__EnvironmentAssignment_0
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
    // InternalDataDescriptionDsl.g:2517:1: rule__CompositeNode__Group__1 : rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 ;
    public final void rule__CompositeNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2521:1: ( rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2 )
            // InternalDataDescriptionDsl.g:2522:2: rule__CompositeNode__Group__1__Impl rule__CompositeNode__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalDataDescriptionDsl.g:2529:1: rule__CompositeNode__Group__1__Impl : ( ( rule__CompositeNode__NameAssignment_1 ) ) ;
    public final void rule__CompositeNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2533:1: ( ( ( rule__CompositeNode__NameAssignment_1 ) ) )
            // InternalDataDescriptionDsl.g:2534:1: ( ( rule__CompositeNode__NameAssignment_1 ) )
            {
            // InternalDataDescriptionDsl.g:2534:1: ( ( rule__CompositeNode__NameAssignment_1 ) )
            // InternalDataDescriptionDsl.g:2535:2: ( rule__CompositeNode__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getNameAssignment_1()); 
            // InternalDataDescriptionDsl.g:2536:2: ( rule__CompositeNode__NameAssignment_1 )
            // InternalDataDescriptionDsl.g:2536:3: rule__CompositeNode__NameAssignment_1
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
    // InternalDataDescriptionDsl.g:2544:1: rule__CompositeNode__Group__2 : rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 ;
    public final void rule__CompositeNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2548:1: ( rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3 )
            // InternalDataDescriptionDsl.g:2549:2: rule__CompositeNode__Group__2__Impl rule__CompositeNode__Group__3
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
    // InternalDataDescriptionDsl.g:2556:1: rule__CompositeNode__Group__2__Impl : ( ( rule__CompositeNode__RepresentedAsAssignment_2 )? ) ;
    public final void rule__CompositeNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2560:1: ( ( ( rule__CompositeNode__RepresentedAsAssignment_2 )? ) )
            // InternalDataDescriptionDsl.g:2561:1: ( ( rule__CompositeNode__RepresentedAsAssignment_2 )? )
            {
            // InternalDataDescriptionDsl.g:2561:1: ( ( rule__CompositeNode__RepresentedAsAssignment_2 )? )
            // InternalDataDescriptionDsl.g:2562:2: ( rule__CompositeNode__RepresentedAsAssignment_2 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getRepresentedAsAssignment_2()); 
            // InternalDataDescriptionDsl.g:2563:2: ( rule__CompositeNode__RepresentedAsAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDataDescriptionDsl.g:2563:3: rule__CompositeNode__RepresentedAsAssignment_2
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
    // InternalDataDescriptionDsl.g:2571:1: rule__CompositeNode__Group__3 : rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 ;
    public final void rule__CompositeNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2575:1: ( rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4 )
            // InternalDataDescriptionDsl.g:2576:2: rule__CompositeNode__Group__3__Impl rule__CompositeNode__Group__4
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
    // InternalDataDescriptionDsl.g:2583:1: rule__CompositeNode__Group__3__Impl : ( ( rule__CompositeNode__Group_3__0 )? ) ;
    public final void rule__CompositeNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2587:1: ( ( ( rule__CompositeNode__Group_3__0 )? ) )
            // InternalDataDescriptionDsl.g:2588:1: ( ( rule__CompositeNode__Group_3__0 )? )
            {
            // InternalDataDescriptionDsl.g:2588:1: ( ( rule__CompositeNode__Group_3__0 )? )
            // InternalDataDescriptionDsl.g:2589:2: ( rule__CompositeNode__Group_3__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_3()); 
            // InternalDataDescriptionDsl.g:2590:2: ( rule__CompositeNode__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==43) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDataDescriptionDsl.g:2590:3: rule__CompositeNode__Group_3__0
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
    // InternalDataDescriptionDsl.g:2598:1: rule__CompositeNode__Group__4 : rule__CompositeNode__Group__4__Impl rule__CompositeNode__Group__5 ;
    public final void rule__CompositeNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2602:1: ( rule__CompositeNode__Group__4__Impl rule__CompositeNode__Group__5 )
            // InternalDataDescriptionDsl.g:2603:2: rule__CompositeNode__Group__4__Impl rule__CompositeNode__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalDataDescriptionDsl.g:2610:1: rule__CompositeNode__Group__4__Impl : ( ( rule__CompositeNode__Group_4__0 ) ) ;
    public final void rule__CompositeNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2614:1: ( ( ( rule__CompositeNode__Group_4__0 ) ) )
            // InternalDataDescriptionDsl.g:2615:1: ( ( rule__CompositeNode__Group_4__0 ) )
            {
            // InternalDataDescriptionDsl.g:2615:1: ( ( rule__CompositeNode__Group_4__0 ) )
            // InternalDataDescriptionDsl.g:2616:2: ( rule__CompositeNode__Group_4__0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_4()); 
            // InternalDataDescriptionDsl.g:2617:2: ( rule__CompositeNode__Group_4__0 )
            // InternalDataDescriptionDsl.g:2617:3: rule__CompositeNode__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4__0();

            state._fsp--;


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
    // InternalDataDescriptionDsl.g:2625:1: rule__CompositeNode__Group__5 : rule__CompositeNode__Group__5__Impl rule__CompositeNode__Group__6 ;
    public final void rule__CompositeNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2629:1: ( rule__CompositeNode__Group__5__Impl rule__CompositeNode__Group__6 )
            // InternalDataDescriptionDsl.g:2630:2: rule__CompositeNode__Group__5__Impl rule__CompositeNode__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalDataDescriptionDsl.g:2637:1: rule__CompositeNode__Group__5__Impl : ( ')' ) ;
    public final void rule__CompositeNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2641:1: ( ( ')' ) )
            // InternalDataDescriptionDsl.g:2642:1: ( ')' )
            {
            // InternalDataDescriptionDsl.g:2642:1: ( ')' )
            // InternalDataDescriptionDsl.g:2643:2: ')'
            {
             before(grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_5()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:2652:1: rule__CompositeNode__Group__6 : rule__CompositeNode__Group__6__Impl ;
    public final void rule__CompositeNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2656:1: ( rule__CompositeNode__Group__6__Impl )
            // InternalDataDescriptionDsl.g:2657:2: rule__CompositeNode__Group__6__Impl
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
    // InternalDataDescriptionDsl.g:2663:1: rule__CompositeNode__Group__6__Impl : ( ( rule__CompositeNode__Group_6__0 )? ) ;
    public final void rule__CompositeNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2667:1: ( ( ( rule__CompositeNode__Group_6__0 )? ) )
            // InternalDataDescriptionDsl.g:2668:1: ( ( rule__CompositeNode__Group_6__0 )? )
            {
            // InternalDataDescriptionDsl.g:2668:1: ( ( rule__CompositeNode__Group_6__0 )? )
            // InternalDataDescriptionDsl.g:2669:2: ( rule__CompositeNode__Group_6__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_6()); 
            // InternalDataDescriptionDsl.g:2670:2: ( rule__CompositeNode__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDataDescriptionDsl.g:2670:3: rule__CompositeNode__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCompositeNodeAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeNode__Group_3__0"
    // InternalDataDescriptionDsl.g:2679:1: rule__CompositeNode__Group_3__0 : rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1 ;
    public final void rule__CompositeNode__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2683:1: ( rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1 )
            // InternalDataDescriptionDsl.g:2684:2: rule__CompositeNode__Group_3__0__Impl rule__CompositeNode__Group_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDescriptionDsl.g:2691:1: rule__CompositeNode__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__CompositeNode__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2695:1: ( ( 'extends' ) )
            // InternalDataDescriptionDsl.g:2696:1: ( 'extends' )
            {
            // InternalDataDescriptionDsl.g:2696:1: ( 'extends' )
            // InternalDataDescriptionDsl.g:2697:2: 'extends'
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsKeyword_3_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:2706:1: rule__CompositeNode__Group_3__1 : rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2 ;
    public final void rule__CompositeNode__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2710:1: ( rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2 )
            // InternalDataDescriptionDsl.g:2711:2: rule__CompositeNode__Group_3__1__Impl rule__CompositeNode__Group_3__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalDataDescriptionDsl.g:2718:1: rule__CompositeNode__Group_3__1__Impl : ( ( rule__CompositeNode__ExtendsAssignment_3_1 ) ) ;
    public final void rule__CompositeNode__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2722:1: ( ( ( rule__CompositeNode__ExtendsAssignment_3_1 ) ) )
            // InternalDataDescriptionDsl.g:2723:1: ( ( rule__CompositeNode__ExtendsAssignment_3_1 ) )
            {
            // InternalDataDescriptionDsl.g:2723:1: ( ( rule__CompositeNode__ExtendsAssignment_3_1 ) )
            // InternalDataDescriptionDsl.g:2724:2: ( rule__CompositeNode__ExtendsAssignment_3_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_3_1()); 
            // InternalDataDescriptionDsl.g:2725:2: ( rule__CompositeNode__ExtendsAssignment_3_1 )
            // InternalDataDescriptionDsl.g:2725:3: rule__CompositeNode__ExtendsAssignment_3_1
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
    // InternalDataDescriptionDsl.g:2733:1: rule__CompositeNode__Group_3__2 : rule__CompositeNode__Group_3__2__Impl ;
    public final void rule__CompositeNode__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2737:1: ( rule__CompositeNode__Group_3__2__Impl )
            // InternalDataDescriptionDsl.g:2738:2: rule__CompositeNode__Group_3__2__Impl
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
    // InternalDataDescriptionDsl.g:2744:1: rule__CompositeNode__Group_3__2__Impl : ( ( rule__CompositeNode__Group_3_2__0 )* ) ;
    public final void rule__CompositeNode__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2748:1: ( ( ( rule__CompositeNode__Group_3_2__0 )* ) )
            // InternalDataDescriptionDsl.g:2749:1: ( ( rule__CompositeNode__Group_3_2__0 )* )
            {
            // InternalDataDescriptionDsl.g:2749:1: ( ( rule__CompositeNode__Group_3_2__0 )* )
            // InternalDataDescriptionDsl.g:2750:2: ( rule__CompositeNode__Group_3_2__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_3_2()); 
            // InternalDataDescriptionDsl.g:2751:2: ( rule__CompositeNode__Group_3_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:2751:3: rule__CompositeNode__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CompositeNode__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalDataDescriptionDsl.g:2760:1: rule__CompositeNode__Group_3_2__0 : rule__CompositeNode__Group_3_2__0__Impl rule__CompositeNode__Group_3_2__1 ;
    public final void rule__CompositeNode__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2764:1: ( rule__CompositeNode__Group_3_2__0__Impl rule__CompositeNode__Group_3_2__1 )
            // InternalDataDescriptionDsl.g:2765:2: rule__CompositeNode__Group_3_2__0__Impl rule__CompositeNode__Group_3_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalDataDescriptionDsl.g:2772:1: rule__CompositeNode__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2776:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:2777:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:2777:1: ( ',' )
            // InternalDataDescriptionDsl.g:2778:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_3_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalDataDescriptionDsl.g:2787:1: rule__CompositeNode__Group_3_2__1 : rule__CompositeNode__Group_3_2__1__Impl ;
    public final void rule__CompositeNode__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2791:1: ( rule__CompositeNode__Group_3_2__1__Impl )
            // InternalDataDescriptionDsl.g:2792:2: rule__CompositeNode__Group_3_2__1__Impl
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
    // InternalDataDescriptionDsl.g:2798:1: rule__CompositeNode__Group_3_2__1__Impl : ( ( rule__CompositeNode__ExtendsAssignment_3_2_1 ) ) ;
    public final void rule__CompositeNode__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2802:1: ( ( ( rule__CompositeNode__ExtendsAssignment_3_2_1 ) ) )
            // InternalDataDescriptionDsl.g:2803:1: ( ( rule__CompositeNode__ExtendsAssignment_3_2_1 ) )
            {
            // InternalDataDescriptionDsl.g:2803:1: ( ( rule__CompositeNode__ExtendsAssignment_3_2_1 ) )
            // InternalDataDescriptionDsl.g:2804:2: ( rule__CompositeNode__ExtendsAssignment_3_2_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsAssignment_3_2_1()); 
            // InternalDataDescriptionDsl.g:2805:2: ( rule__CompositeNode__ExtendsAssignment_3_2_1 )
            // InternalDataDescriptionDsl.g:2805:3: rule__CompositeNode__ExtendsAssignment_3_2_1
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


    // $ANTLR start "rule__CompositeNode__Group_4__0"
    // InternalDataDescriptionDsl.g:2814:1: rule__CompositeNode__Group_4__0 : rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1 ;
    public final void rule__CompositeNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2818:1: ( rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1 )
            // InternalDataDescriptionDsl.g:2819:2: rule__CompositeNode__Group_4__0__Impl rule__CompositeNode__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalDataDescriptionDsl.g:2826:1: rule__CompositeNode__Group_4__0__Impl : ( '=' ) ;
    public final void rule__CompositeNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2830:1: ( ( '=' ) )
            // InternalDataDescriptionDsl.g:2831:1: ( '=' )
            {
            // InternalDataDescriptionDsl.g:2831:1: ( '=' )
            // InternalDataDescriptionDsl.g:2832:2: '='
            {
             before(grammarAccess.getCompositeNodeAccess().getEqualsSignKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:2841:1: rule__CompositeNode__Group_4__1 : rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2 ;
    public final void rule__CompositeNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2845:1: ( rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2 )
            // InternalDataDescriptionDsl.g:2846:2: rule__CompositeNode__Group_4__1__Impl rule__CompositeNode__Group_4__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalDataDescriptionDsl.g:2853:1: rule__CompositeNode__Group_4__1__Impl : ( '(' ) ;
    public final void rule__CompositeNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2857:1: ( ( '(' ) )
            // InternalDataDescriptionDsl.g:2858:1: ( '(' )
            {
            // InternalDataDescriptionDsl.g:2858:1: ( '(' )
            // InternalDataDescriptionDsl.g:2859:2: '('
            {
             before(grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_4_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getLeftParenthesisKeyword_4_1()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:2868:1: rule__CompositeNode__Group_4__2 : rule__CompositeNode__Group_4__2__Impl ;
    public final void rule__CompositeNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2872:1: ( rule__CompositeNode__Group_4__2__Impl )
            // InternalDataDescriptionDsl.g:2873:2: rule__CompositeNode__Group_4__2__Impl
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
    // InternalDataDescriptionDsl.g:2879:1: rule__CompositeNode__Group_4__2__Impl : ( ( rule__CompositeNode__Group_4_2__0 )? ) ;
    public final void rule__CompositeNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2883:1: ( ( ( rule__CompositeNode__Group_4_2__0 )? ) )
            // InternalDataDescriptionDsl.g:2884:1: ( ( rule__CompositeNode__Group_4_2__0 )? )
            {
            // InternalDataDescriptionDsl.g:2884:1: ( ( rule__CompositeNode__Group_4_2__0 )? )
            // InternalDataDescriptionDsl.g:2885:2: ( rule__CompositeNode__Group_4_2__0 )?
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_4_2()); 
            // InternalDataDescriptionDsl.g:2886:2: ( rule__CompositeNode__Group_4_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_ID)||(LA29_0>=14 && LA29_0<=31)||(LA29_0>=49 && LA29_0<=52)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDataDescriptionDsl.g:2886:3: rule__CompositeNode__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeNode__Group_4_2__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalDataDescriptionDsl.g:2895:1: rule__CompositeNode__Group_4_2__0 : rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1 ;
    public final void rule__CompositeNode__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2899:1: ( rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1 )
            // InternalDataDescriptionDsl.g:2900:2: rule__CompositeNode__Group_4_2__0__Impl rule__CompositeNode__Group_4_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalDataDescriptionDsl.g:2907:1: rule__CompositeNode__Group_4_2__0__Impl : ( ( rule__CompositeNode__SubnodesAssignment_4_2_0 ) ) ;
    public final void rule__CompositeNode__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2911:1: ( ( ( rule__CompositeNode__SubnodesAssignment_4_2_0 ) ) )
            // InternalDataDescriptionDsl.g:2912:1: ( ( rule__CompositeNode__SubnodesAssignment_4_2_0 ) )
            {
            // InternalDataDescriptionDsl.g:2912:1: ( ( rule__CompositeNode__SubnodesAssignment_4_2_0 ) )
            // InternalDataDescriptionDsl.g:2913:2: ( rule__CompositeNode__SubnodesAssignment_4_2_0 )
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_4_2_0()); 
            // InternalDataDescriptionDsl.g:2914:2: ( rule__CompositeNode__SubnodesAssignment_4_2_0 )
            // InternalDataDescriptionDsl.g:2914:3: rule__CompositeNode__SubnodesAssignment_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__SubnodesAssignment_4_2_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_4_2_0()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:2922:1: rule__CompositeNode__Group_4_2__1 : rule__CompositeNode__Group_4_2__1__Impl ;
    public final void rule__CompositeNode__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2926:1: ( rule__CompositeNode__Group_4_2__1__Impl )
            // InternalDataDescriptionDsl.g:2927:2: rule__CompositeNode__Group_4_2__1__Impl
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
    // InternalDataDescriptionDsl.g:2933:1: rule__CompositeNode__Group_4_2__1__Impl : ( ( rule__CompositeNode__Group_4_2_1__0 )* ) ;
    public final void rule__CompositeNode__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2937:1: ( ( ( rule__CompositeNode__Group_4_2_1__0 )* ) )
            // InternalDataDescriptionDsl.g:2938:1: ( ( rule__CompositeNode__Group_4_2_1__0 )* )
            {
            // InternalDataDescriptionDsl.g:2938:1: ( ( rule__CompositeNode__Group_4_2_1__0 )* )
            // InternalDataDescriptionDsl.g:2939:2: ( rule__CompositeNode__Group_4_2_1__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_4_2_1()); 
            // InternalDataDescriptionDsl.g:2940:2: ( rule__CompositeNode__Group_4_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==35) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:2940:3: rule__CompositeNode__Group_4_2_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CompositeNode__Group_4_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getCompositeNodeAccess().getGroup_4_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__CompositeNode__Group_4_2_1__0"
    // InternalDataDescriptionDsl.g:2949:1: rule__CompositeNode__Group_4_2_1__0 : rule__CompositeNode__Group_4_2_1__0__Impl rule__CompositeNode__Group_4_2_1__1 ;
    public final void rule__CompositeNode__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2953:1: ( rule__CompositeNode__Group_4_2_1__0__Impl rule__CompositeNode__Group_4_2_1__1 )
            // InternalDataDescriptionDsl.g:2954:2: rule__CompositeNode__Group_4_2_1__0__Impl rule__CompositeNode__Group_4_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__CompositeNode__Group_4_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_4_2_1__0"


    // $ANTLR start "rule__CompositeNode__Group_4_2_1__0__Impl"
    // InternalDataDescriptionDsl.g:2961:1: rule__CompositeNode__Group_4_2_1__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2965:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:2966:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:2966:1: ( ',' )
            // InternalDataDescriptionDsl.g:2967:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_4_2_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getCommaKeyword_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_4_2_1__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_4_2_1__1"
    // InternalDataDescriptionDsl.g:2976:1: rule__CompositeNode__Group_4_2_1__1 : rule__CompositeNode__Group_4_2_1__1__Impl ;
    public final void rule__CompositeNode__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2980:1: ( rule__CompositeNode__Group_4_2_1__1__Impl )
            // InternalDataDescriptionDsl.g:2981:2: rule__CompositeNode__Group_4_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_4_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_4_2_1__1"


    // $ANTLR start "rule__CompositeNode__Group_4_2_1__1__Impl"
    // InternalDataDescriptionDsl.g:2987:1: rule__CompositeNode__Group_4_2_1__1__Impl : ( ( rule__CompositeNode__SubnodesAssignment_4_2_1_1 ) ) ;
    public final void rule__CompositeNode__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:2991:1: ( ( ( rule__CompositeNode__SubnodesAssignment_4_2_1_1 ) ) )
            // InternalDataDescriptionDsl.g:2992:1: ( ( rule__CompositeNode__SubnodesAssignment_4_2_1_1 ) )
            {
            // InternalDataDescriptionDsl.g:2992:1: ( ( rule__CompositeNode__SubnodesAssignment_4_2_1_1 ) )
            // InternalDataDescriptionDsl.g:2993:2: ( rule__CompositeNode__SubnodesAssignment_4_2_1_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_4_2_1_1()); 
            // InternalDataDescriptionDsl.g:2994:2: ( rule__CompositeNode__SubnodesAssignment_4_2_1_1 )
            // InternalDataDescriptionDsl.g:2994:3: rule__CompositeNode__SubnodesAssignment_4_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__SubnodesAssignment_4_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getSubnodesAssignment_4_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_4_2_1__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group_6__0"
    // InternalDataDescriptionDsl.g:3003:1: rule__CompositeNode__Group_6__0 : rule__CompositeNode__Group_6__0__Impl rule__CompositeNode__Group_6__1 ;
    public final void rule__CompositeNode__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3007:1: ( rule__CompositeNode__Group_6__0__Impl rule__CompositeNode__Group_6__1 )
            // InternalDataDescriptionDsl.g:3008:2: rule__CompositeNode__Group_6__0__Impl rule__CompositeNode__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__CompositeNode__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6__0"


    // $ANTLR start "rule__CompositeNode__Group_6__0__Impl"
    // InternalDataDescriptionDsl.g:3015:1: rule__CompositeNode__Group_6__0__Impl : ( '{' ) ;
    public final void rule__CompositeNode__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3019:1: ( ( '{' ) )
            // InternalDataDescriptionDsl.g:3020:1: ( '{' )
            {
            // InternalDataDescriptionDsl.g:3020:1: ( '{' )
            // InternalDataDescriptionDsl.g:3021:2: '{'
            {
             before(grammarAccess.getCompositeNodeAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getLeftCurlyBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_6__1"
    // InternalDataDescriptionDsl.g:3030:1: rule__CompositeNode__Group_6__1 : rule__CompositeNode__Group_6__1__Impl rule__CompositeNode__Group_6__2 ;
    public final void rule__CompositeNode__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3034:1: ( rule__CompositeNode__Group_6__1__Impl rule__CompositeNode__Group_6__2 )
            // InternalDataDescriptionDsl.g:3035:2: rule__CompositeNode__Group_6__1__Impl rule__CompositeNode__Group_6__2
            {
            pushFollow(FOLLOW_5);
            rule__CompositeNode__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6__1"


    // $ANTLR start "rule__CompositeNode__Group_6__1__Impl"
    // InternalDataDescriptionDsl.g:3042:1: rule__CompositeNode__Group_6__1__Impl : ( ( rule__CompositeNode__OptionsAssignment_6_1 ) ) ;
    public final void rule__CompositeNode__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3046:1: ( ( ( rule__CompositeNode__OptionsAssignment_6_1 ) ) )
            // InternalDataDescriptionDsl.g:3047:1: ( ( rule__CompositeNode__OptionsAssignment_6_1 ) )
            {
            // InternalDataDescriptionDsl.g:3047:1: ( ( rule__CompositeNode__OptionsAssignment_6_1 ) )
            // InternalDataDescriptionDsl.g:3048:2: ( rule__CompositeNode__OptionsAssignment_6_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_6_1()); 
            // InternalDataDescriptionDsl.g:3049:2: ( rule__CompositeNode__OptionsAssignment_6_1 )
            // InternalDataDescriptionDsl.g:3049:3: rule__CompositeNode__OptionsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__OptionsAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6__1__Impl"


    // $ANTLR start "rule__CompositeNode__Group_6__2"
    // InternalDataDescriptionDsl.g:3057:1: rule__CompositeNode__Group_6__2 : rule__CompositeNode__Group_6__2__Impl rule__CompositeNode__Group_6__3 ;
    public final void rule__CompositeNode__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3061:1: ( rule__CompositeNode__Group_6__2__Impl rule__CompositeNode__Group_6__3 )
            // InternalDataDescriptionDsl.g:3062:2: rule__CompositeNode__Group_6__2__Impl rule__CompositeNode__Group_6__3
            {
            pushFollow(FOLLOW_5);
            rule__CompositeNode__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6__2"


    // $ANTLR start "rule__CompositeNode__Group_6__2__Impl"
    // InternalDataDescriptionDsl.g:3069:1: rule__CompositeNode__Group_6__2__Impl : ( ( rule__CompositeNode__Group_6_2__0 )* ) ;
    public final void rule__CompositeNode__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3073:1: ( ( ( rule__CompositeNode__Group_6_2__0 )* ) )
            // InternalDataDescriptionDsl.g:3074:1: ( ( rule__CompositeNode__Group_6_2__0 )* )
            {
            // InternalDataDescriptionDsl.g:3074:1: ( ( rule__CompositeNode__Group_6_2__0 )* )
            // InternalDataDescriptionDsl.g:3075:2: ( rule__CompositeNode__Group_6_2__0 )*
            {
             before(grammarAccess.getCompositeNodeAccess().getGroup_6_2()); 
            // InternalDataDescriptionDsl.g:3076:2: ( rule__CompositeNode__Group_6_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==35) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalDataDescriptionDsl.g:3076:3: rule__CompositeNode__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__CompositeNode__Group_6_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getCompositeNodeAccess().getGroup_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6__2__Impl"


    // $ANTLR start "rule__CompositeNode__Group_6__3"
    // InternalDataDescriptionDsl.g:3084:1: rule__CompositeNode__Group_6__3 : rule__CompositeNode__Group_6__3__Impl ;
    public final void rule__CompositeNode__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3088:1: ( rule__CompositeNode__Group_6__3__Impl )
            // InternalDataDescriptionDsl.g:3089:2: rule__CompositeNode__Group_6__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_6__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6__3"


    // $ANTLR start "rule__CompositeNode__Group_6__3__Impl"
    // InternalDataDescriptionDsl.g:3095:1: rule__CompositeNode__Group_6__3__Impl : ( '}' ) ;
    public final void rule__CompositeNode__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3099:1: ( ( '}' ) )
            // InternalDataDescriptionDsl.g:3100:1: ( '}' )
            {
            // InternalDataDescriptionDsl.g:3100:1: ( '}' )
            // InternalDataDescriptionDsl.g:3101:2: '}'
            {
             before(grammarAccess.getCompositeNodeAccess().getRightCurlyBracketKeyword_6_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getRightCurlyBracketKeyword_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6__3__Impl"


    // $ANTLR start "rule__CompositeNode__Group_6_2__0"
    // InternalDataDescriptionDsl.g:3111:1: rule__CompositeNode__Group_6_2__0 : rule__CompositeNode__Group_6_2__0__Impl rule__CompositeNode__Group_6_2__1 ;
    public final void rule__CompositeNode__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3115:1: ( rule__CompositeNode__Group_6_2__0__Impl rule__CompositeNode__Group_6_2__1 )
            // InternalDataDescriptionDsl.g:3116:2: rule__CompositeNode__Group_6_2__0__Impl rule__CompositeNode__Group_6_2__1
            {
            pushFollow(FOLLOW_7);
            rule__CompositeNode__Group_6_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_6_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6_2__0"


    // $ANTLR start "rule__CompositeNode__Group_6_2__0__Impl"
    // InternalDataDescriptionDsl.g:3123:1: rule__CompositeNode__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__CompositeNode__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3127:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:3128:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:3128:1: ( ',' )
            // InternalDataDescriptionDsl.g:3129:2: ','
            {
             before(grammarAccess.getCompositeNodeAccess().getCommaKeyword_6_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCompositeNodeAccess().getCommaKeyword_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6_2__0__Impl"


    // $ANTLR start "rule__CompositeNode__Group_6_2__1"
    // InternalDataDescriptionDsl.g:3138:1: rule__CompositeNode__Group_6_2__1 : rule__CompositeNode__Group_6_2__1__Impl ;
    public final void rule__CompositeNode__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3142:1: ( rule__CompositeNode__Group_6_2__1__Impl )
            // InternalDataDescriptionDsl.g:3143:2: rule__CompositeNode__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__Group_6_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6_2__1"


    // $ANTLR start "rule__CompositeNode__Group_6_2__1__Impl"
    // InternalDataDescriptionDsl.g:3149:1: rule__CompositeNode__Group_6_2__1__Impl : ( ( rule__CompositeNode__OptionsAssignment_6_2_1 ) ) ;
    public final void rule__CompositeNode__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3153:1: ( ( ( rule__CompositeNode__OptionsAssignment_6_2_1 ) ) )
            // InternalDataDescriptionDsl.g:3154:1: ( ( rule__CompositeNode__OptionsAssignment_6_2_1 ) )
            {
            // InternalDataDescriptionDsl.g:3154:1: ( ( rule__CompositeNode__OptionsAssignment_6_2_1 ) )
            // InternalDataDescriptionDsl.g:3155:2: ( rule__CompositeNode__OptionsAssignment_6_2_1 )
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_6_2_1()); 
            // InternalDataDescriptionDsl.g:3156:2: ( rule__CompositeNode__OptionsAssignment_6_2_1 )
            // InternalDataDescriptionDsl.g:3156:3: rule__CompositeNode__OptionsAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeNode__OptionsAssignment_6_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeNodeAccess().getOptionsAssignment_6_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__Group_6_2__1__Impl"


    // $ANTLR start "rule__LeafNode__Group__0"
    // InternalDataDescriptionDsl.g:3165:1: rule__LeafNode__Group__0 : rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1 ;
    public final void rule__LeafNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3169:1: ( rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1 )
            // InternalDataDescriptionDsl.g:3170:2: rule__LeafNode__Group__0__Impl rule__LeafNode__Group__1
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
    // InternalDataDescriptionDsl.g:3177:1: rule__LeafNode__Group__0__Impl : ( ( rule__LeafNode__KeyAssignment_0 )? ) ;
    public final void rule__LeafNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3181:1: ( ( ( rule__LeafNode__KeyAssignment_0 )? ) )
            // InternalDataDescriptionDsl.g:3182:1: ( ( rule__LeafNode__KeyAssignment_0 )? )
            {
            // InternalDataDescriptionDsl.g:3182:1: ( ( rule__LeafNode__KeyAssignment_0 )? )
            // InternalDataDescriptionDsl.g:3183:2: ( rule__LeafNode__KeyAssignment_0 )?
            {
             before(grammarAccess.getLeafNodeAccess().getKeyAssignment_0()); 
            // InternalDataDescriptionDsl.g:3184:2: ( rule__LeafNode__KeyAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==51) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalDataDescriptionDsl.g:3184:3: rule__LeafNode__KeyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__KeyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getKeyAssignment_0()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:3192:1: rule__LeafNode__Group__1 : rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2 ;
    public final void rule__LeafNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3196:1: ( rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2 )
            // InternalDataDescriptionDsl.g:3197:2: rule__LeafNode__Group__1__Impl rule__LeafNode__Group__2
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
    // InternalDataDescriptionDsl.g:3204:1: rule__LeafNode__Group__1__Impl : ( ( rule__LeafNode__UniqueAssignment_1 )? ) ;
    public final void rule__LeafNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3208:1: ( ( ( rule__LeafNode__UniqueAssignment_1 )? ) )
            // InternalDataDescriptionDsl.g:3209:1: ( ( rule__LeafNode__UniqueAssignment_1 )? )
            {
            // InternalDataDescriptionDsl.g:3209:1: ( ( rule__LeafNode__UniqueAssignment_1 )? )
            // InternalDataDescriptionDsl.g:3210:2: ( rule__LeafNode__UniqueAssignment_1 )?
            {
             before(grammarAccess.getLeafNodeAccess().getUniqueAssignment_1()); 
            // InternalDataDescriptionDsl.g:3211:2: ( rule__LeafNode__UniqueAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==52) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDataDescriptionDsl.g:3211:3: rule__LeafNode__UniqueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__UniqueAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getUniqueAssignment_1()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:3219:1: rule__LeafNode__Group__2 : rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3 ;
    public final void rule__LeafNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3223:1: ( rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3 )
            // InternalDataDescriptionDsl.g:3224:2: rule__LeafNode__Group__2__Impl rule__LeafNode__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalDataDescriptionDsl.g:3231:1: rule__LeafNode__Group__2__Impl : ( ( rule__LeafNode__TypeAssignment_2 ) ) ;
    public final void rule__LeafNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3235:1: ( ( ( rule__LeafNode__TypeAssignment_2 ) ) )
            // InternalDataDescriptionDsl.g:3236:1: ( ( rule__LeafNode__TypeAssignment_2 ) )
            {
            // InternalDataDescriptionDsl.g:3236:1: ( ( rule__LeafNode__TypeAssignment_2 ) )
            // InternalDataDescriptionDsl.g:3237:2: ( rule__LeafNode__TypeAssignment_2 )
            {
             before(grammarAccess.getLeafNodeAccess().getTypeAssignment_2()); 
            // InternalDataDescriptionDsl.g:3238:2: ( rule__LeafNode__TypeAssignment_2 )
            // InternalDataDescriptionDsl.g:3238:3: rule__LeafNode__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getTypeAssignment_2()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:3246:1: rule__LeafNode__Group__3 : rule__LeafNode__Group__3__Impl rule__LeafNode__Group__4 ;
    public final void rule__LeafNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3250:1: ( rule__LeafNode__Group__3__Impl rule__LeafNode__Group__4 )
            // InternalDataDescriptionDsl.g:3251:2: rule__LeafNode__Group__3__Impl rule__LeafNode__Group__4
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
    // InternalDataDescriptionDsl.g:3258:1: rule__LeafNode__Group__3__Impl : ( ( rule__LeafNode__KeywordAssignment_3 )? ) ;
    public final void rule__LeafNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3262:1: ( ( ( rule__LeafNode__KeywordAssignment_3 )? ) )
            // InternalDataDescriptionDsl.g:3263:1: ( ( rule__LeafNode__KeywordAssignment_3 )? )
            {
            // InternalDataDescriptionDsl.g:3263:1: ( ( rule__LeafNode__KeywordAssignment_3 )? )
            // InternalDataDescriptionDsl.g:3264:2: ( rule__LeafNode__KeywordAssignment_3 )?
            {
             before(grammarAccess.getLeafNodeAccess().getKeywordAssignment_3()); 
            // InternalDataDescriptionDsl.g:3265:2: ( rule__LeafNode__KeywordAssignment_3 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDataDescriptionDsl.g:3265:3: rule__LeafNode__KeywordAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__KeywordAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getKeywordAssignment_3()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:3273:1: rule__LeafNode__Group__4 : rule__LeafNode__Group__4__Impl rule__LeafNode__Group__5 ;
    public final void rule__LeafNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3277:1: ( rule__LeafNode__Group__4__Impl rule__LeafNode__Group__5 )
            // InternalDataDescriptionDsl.g:3278:2: rule__LeafNode__Group__4__Impl rule__LeafNode__Group__5
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDescriptionDsl.g:3285:1: rule__LeafNode__Group__4__Impl : ( ( rule__LeafNode__NameAssignment_4 ) ) ;
    public final void rule__LeafNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3289:1: ( ( ( rule__LeafNode__NameAssignment_4 ) ) )
            // InternalDataDescriptionDsl.g:3290:1: ( ( rule__LeafNode__NameAssignment_4 ) )
            {
            // InternalDataDescriptionDsl.g:3290:1: ( ( rule__LeafNode__NameAssignment_4 ) )
            // InternalDataDescriptionDsl.g:3291:2: ( rule__LeafNode__NameAssignment_4 )
            {
             before(grammarAccess.getLeafNodeAccess().getNameAssignment_4()); 
            // InternalDataDescriptionDsl.g:3292:2: ( rule__LeafNode__NameAssignment_4 )
            // InternalDataDescriptionDsl.g:3292:3: rule__LeafNode__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LeafNode__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLeafNodeAccess().getNameAssignment_4()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:3300:1: rule__LeafNode__Group__5 : rule__LeafNode__Group__5__Impl ;
    public final void rule__LeafNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3304:1: ( rule__LeafNode__Group__5__Impl )
            // InternalDataDescriptionDsl.g:3305:2: rule__LeafNode__Group__5__Impl
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
    // InternalDataDescriptionDsl.g:3311:1: rule__LeafNode__Group__5__Impl : ( ( rule__LeafNode__RepresentedAsAssignment_5 )? ) ;
    public final void rule__LeafNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3315:1: ( ( ( rule__LeafNode__RepresentedAsAssignment_5 )? ) )
            // InternalDataDescriptionDsl.g:3316:1: ( ( rule__LeafNode__RepresentedAsAssignment_5 )? )
            {
            // InternalDataDescriptionDsl.g:3316:1: ( ( rule__LeafNode__RepresentedAsAssignment_5 )? )
            // InternalDataDescriptionDsl.g:3317:2: ( rule__LeafNode__RepresentedAsAssignment_5 )?
            {
             before(grammarAccess.getLeafNodeAccess().getRepresentedAsAssignment_5()); 
            // InternalDataDescriptionDsl.g:3318:2: ( rule__LeafNode__RepresentedAsAssignment_5 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDataDescriptionDsl.g:3318:3: rule__LeafNode__RepresentedAsAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeafNode__RepresentedAsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLeafNodeAccess().getRepresentedAsAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__Remove__Group__0"
    // InternalDataDescriptionDsl.g:3327:1: rule__Remove__Group__0 : rule__Remove__Group__0__Impl rule__Remove__Group__1 ;
    public final void rule__Remove__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3331:1: ( rule__Remove__Group__0__Impl rule__Remove__Group__1 )
            // InternalDataDescriptionDsl.g:3332:2: rule__Remove__Group__0__Impl rule__Remove__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Remove__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__0"


    // $ANTLR start "rule__Remove__Group__0__Impl"
    // InternalDataDescriptionDsl.g:3339:1: rule__Remove__Group__0__Impl : ( () ) ;
    public final void rule__Remove__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3343:1: ( ( () ) )
            // InternalDataDescriptionDsl.g:3344:1: ( () )
            {
            // InternalDataDescriptionDsl.g:3344:1: ( () )
            // InternalDataDescriptionDsl.g:3345:2: ()
            {
             before(grammarAccess.getRemoveAccess().getRemoveAction_0()); 
            // InternalDataDescriptionDsl.g:3346:2: ()
            // InternalDataDescriptionDsl.g:3346:3: 
            {
            }

             after(grammarAccess.getRemoveAccess().getRemoveAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__0__Impl"


    // $ANTLR start "rule__Remove__Group__1"
    // InternalDataDescriptionDsl.g:3354:1: rule__Remove__Group__1 : rule__Remove__Group__1__Impl rule__Remove__Group__2 ;
    public final void rule__Remove__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3358:1: ( rule__Remove__Group__1__Impl rule__Remove__Group__2 )
            // InternalDataDescriptionDsl.g:3359:2: rule__Remove__Group__1__Impl rule__Remove__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Remove__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Remove__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__1"


    // $ANTLR start "rule__Remove__Group__1__Impl"
    // InternalDataDescriptionDsl.g:3366:1: rule__Remove__Group__1__Impl : ( 'remove' ) ;
    public final void rule__Remove__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3370:1: ( ( 'remove' ) )
            // InternalDataDescriptionDsl.g:3371:1: ( 'remove' )
            {
            // InternalDataDescriptionDsl.g:3371:1: ( 'remove' )
            // InternalDataDescriptionDsl.g:3372:2: 'remove'
            {
             before(grammarAccess.getRemoveAccess().getRemoveKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getRemoveKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__1__Impl"


    // $ANTLR start "rule__Remove__Group__2"
    // InternalDataDescriptionDsl.g:3381:1: rule__Remove__Group__2 : rule__Remove__Group__2__Impl ;
    public final void rule__Remove__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3385:1: ( rule__Remove__Group__2__Impl )
            // InternalDataDescriptionDsl.g:3386:2: rule__Remove__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Remove__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__2"


    // $ANTLR start "rule__Remove__Group__2__Impl"
    // InternalDataDescriptionDsl.g:3392:1: rule__Remove__Group__2__Impl : ( ( rule__Remove__DeprecatedAssignment_2 ) ) ;
    public final void rule__Remove__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3396:1: ( ( ( rule__Remove__DeprecatedAssignment_2 ) ) )
            // InternalDataDescriptionDsl.g:3397:1: ( ( rule__Remove__DeprecatedAssignment_2 ) )
            {
            // InternalDataDescriptionDsl.g:3397:1: ( ( rule__Remove__DeprecatedAssignment_2 ) )
            // InternalDataDescriptionDsl.g:3398:2: ( rule__Remove__DeprecatedAssignment_2 )
            {
             before(grammarAccess.getRemoveAccess().getDeprecatedAssignment_2()); 
            // InternalDataDescriptionDsl.g:3399:2: ( rule__Remove__DeprecatedAssignment_2 )
            // InternalDataDescriptionDsl.g:3399:3: rule__Remove__DeprecatedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Remove__DeprecatedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRemoveAccess().getDeprecatedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__Group__2__Impl"


    // $ANTLR start "rule__Retype__Group__0"
    // InternalDataDescriptionDsl.g:3408:1: rule__Retype__Group__0 : rule__Retype__Group__0__Impl rule__Retype__Group__1 ;
    public final void rule__Retype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3412:1: ( rule__Retype__Group__0__Impl rule__Retype__Group__1 )
            // InternalDataDescriptionDsl.g:3413:2: rule__Retype__Group__0__Impl rule__Retype__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Retype__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retype__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__0"


    // $ANTLR start "rule__Retype__Group__0__Impl"
    // InternalDataDescriptionDsl.g:3420:1: rule__Retype__Group__0__Impl : ( () ) ;
    public final void rule__Retype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3424:1: ( ( () ) )
            // InternalDataDescriptionDsl.g:3425:1: ( () )
            {
            // InternalDataDescriptionDsl.g:3425:1: ( () )
            // InternalDataDescriptionDsl.g:3426:2: ()
            {
             before(grammarAccess.getRetypeAccess().getRetypeAction_0()); 
            // InternalDataDescriptionDsl.g:3427:2: ()
            // InternalDataDescriptionDsl.g:3427:3: 
            {
            }

             after(grammarAccess.getRetypeAccess().getRetypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__0__Impl"


    // $ANTLR start "rule__Retype__Group__1"
    // InternalDataDescriptionDsl.g:3435:1: rule__Retype__Group__1 : rule__Retype__Group__1__Impl rule__Retype__Group__2 ;
    public final void rule__Retype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3439:1: ( rule__Retype__Group__1__Impl rule__Retype__Group__2 )
            // InternalDataDescriptionDsl.g:3440:2: rule__Retype__Group__1__Impl rule__Retype__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Retype__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retype__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__1"


    // $ANTLR start "rule__Retype__Group__1__Impl"
    // InternalDataDescriptionDsl.g:3447:1: rule__Retype__Group__1__Impl : ( 'retype' ) ;
    public final void rule__Retype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3451:1: ( ( 'retype' ) )
            // InternalDataDescriptionDsl.g:3452:1: ( 'retype' )
            {
            // InternalDataDescriptionDsl.g:3452:1: ( 'retype' )
            // InternalDataDescriptionDsl.g:3453:2: 'retype'
            {
             before(grammarAccess.getRetypeAccess().getRetypeKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRetypeAccess().getRetypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__1__Impl"


    // $ANTLR start "rule__Retype__Group__2"
    // InternalDataDescriptionDsl.g:3462:1: rule__Retype__Group__2 : rule__Retype__Group__2__Impl rule__Retype__Group__3 ;
    public final void rule__Retype__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3466:1: ( rule__Retype__Group__2__Impl rule__Retype__Group__3 )
            // InternalDataDescriptionDsl.g:3467:2: rule__Retype__Group__2__Impl rule__Retype__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Retype__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retype__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__2"


    // $ANTLR start "rule__Retype__Group__2__Impl"
    // InternalDataDescriptionDsl.g:3474:1: rule__Retype__Group__2__Impl : ( ( rule__Retype__DeprecatedAssignment_2 ) ) ;
    public final void rule__Retype__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3478:1: ( ( ( rule__Retype__DeprecatedAssignment_2 ) ) )
            // InternalDataDescriptionDsl.g:3479:1: ( ( rule__Retype__DeprecatedAssignment_2 ) )
            {
            // InternalDataDescriptionDsl.g:3479:1: ( ( rule__Retype__DeprecatedAssignment_2 ) )
            // InternalDataDescriptionDsl.g:3480:2: ( rule__Retype__DeprecatedAssignment_2 )
            {
             before(grammarAccess.getRetypeAccess().getDeprecatedAssignment_2()); 
            // InternalDataDescriptionDsl.g:3481:2: ( rule__Retype__DeprecatedAssignment_2 )
            // InternalDataDescriptionDsl.g:3481:3: rule__Retype__DeprecatedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Retype__DeprecatedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRetypeAccess().getDeprecatedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__2__Impl"


    // $ANTLR start "rule__Retype__Group__3"
    // InternalDataDescriptionDsl.g:3489:1: rule__Retype__Group__3 : rule__Retype__Group__3__Impl rule__Retype__Group__4 ;
    public final void rule__Retype__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3493:1: ( rule__Retype__Group__3__Impl rule__Retype__Group__4 )
            // InternalDataDescriptionDsl.g:3494:2: rule__Retype__Group__3__Impl rule__Retype__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Retype__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Retype__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__3"


    // $ANTLR start "rule__Retype__Group__3__Impl"
    // InternalDataDescriptionDsl.g:3501:1: rule__Retype__Group__3__Impl : ( 'as' ) ;
    public final void rule__Retype__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3505:1: ( ( 'as' ) )
            // InternalDataDescriptionDsl.g:3506:1: ( 'as' )
            {
            // InternalDataDescriptionDsl.g:3506:1: ( 'as' )
            // InternalDataDescriptionDsl.g:3507:2: 'as'
            {
             before(grammarAccess.getRetypeAccess().getAsKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRetypeAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__3__Impl"


    // $ANTLR start "rule__Retype__Group__4"
    // InternalDataDescriptionDsl.g:3516:1: rule__Retype__Group__4 : rule__Retype__Group__4__Impl ;
    public final void rule__Retype__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3520:1: ( rule__Retype__Group__4__Impl )
            // InternalDataDescriptionDsl.g:3521:2: rule__Retype__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Retype__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__4"


    // $ANTLR start "rule__Retype__Group__4__Impl"
    // InternalDataDescriptionDsl.g:3527:1: rule__Retype__Group__4__Impl : ( ( rule__Retype__NewTypeAssignment_4 ) ) ;
    public final void rule__Retype__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3531:1: ( ( ( rule__Retype__NewTypeAssignment_4 ) ) )
            // InternalDataDescriptionDsl.g:3532:1: ( ( rule__Retype__NewTypeAssignment_4 ) )
            {
            // InternalDataDescriptionDsl.g:3532:1: ( ( rule__Retype__NewTypeAssignment_4 ) )
            // InternalDataDescriptionDsl.g:3533:2: ( rule__Retype__NewTypeAssignment_4 )
            {
             before(grammarAccess.getRetypeAccess().getNewTypeAssignment_4()); 
            // InternalDataDescriptionDsl.g:3534:2: ( rule__Retype__NewTypeAssignment_4 )
            // InternalDataDescriptionDsl.g:3534:3: rule__Retype__NewTypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Retype__NewTypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRetypeAccess().getNewTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__Group__4__Impl"


    // $ANTLR start "rule__Rename__Group__0"
    // InternalDataDescriptionDsl.g:3543:1: rule__Rename__Group__0 : rule__Rename__Group__0__Impl rule__Rename__Group__1 ;
    public final void rule__Rename__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3547:1: ( rule__Rename__Group__0__Impl rule__Rename__Group__1 )
            // InternalDataDescriptionDsl.g:3548:2: rule__Rename__Group__0__Impl rule__Rename__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Rename__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rename__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__0"


    // $ANTLR start "rule__Rename__Group__0__Impl"
    // InternalDataDescriptionDsl.g:3555:1: rule__Rename__Group__0__Impl : ( () ) ;
    public final void rule__Rename__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3559:1: ( ( () ) )
            // InternalDataDescriptionDsl.g:3560:1: ( () )
            {
            // InternalDataDescriptionDsl.g:3560:1: ( () )
            // InternalDataDescriptionDsl.g:3561:2: ()
            {
             before(grammarAccess.getRenameAccess().getRenameAction_0()); 
            // InternalDataDescriptionDsl.g:3562:2: ()
            // InternalDataDescriptionDsl.g:3562:3: 
            {
            }

             after(grammarAccess.getRenameAccess().getRenameAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__0__Impl"


    // $ANTLR start "rule__Rename__Group__1"
    // InternalDataDescriptionDsl.g:3570:1: rule__Rename__Group__1 : rule__Rename__Group__1__Impl rule__Rename__Group__2 ;
    public final void rule__Rename__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3574:1: ( rule__Rename__Group__1__Impl rule__Rename__Group__2 )
            // InternalDataDescriptionDsl.g:3575:2: rule__Rename__Group__1__Impl rule__Rename__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Rename__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rename__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__1"


    // $ANTLR start "rule__Rename__Group__1__Impl"
    // InternalDataDescriptionDsl.g:3582:1: rule__Rename__Group__1__Impl : ( 'rename' ) ;
    public final void rule__Rename__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3586:1: ( ( 'rename' ) )
            // InternalDataDescriptionDsl.g:3587:1: ( 'rename' )
            {
            // InternalDataDescriptionDsl.g:3587:1: ( 'rename' )
            // InternalDataDescriptionDsl.g:3588:2: 'rename'
            {
             before(grammarAccess.getRenameAccess().getRenameKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRenameAccess().getRenameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__1__Impl"


    // $ANTLR start "rule__Rename__Group__2"
    // InternalDataDescriptionDsl.g:3597:1: rule__Rename__Group__2 : rule__Rename__Group__2__Impl rule__Rename__Group__3 ;
    public final void rule__Rename__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3601:1: ( rule__Rename__Group__2__Impl rule__Rename__Group__3 )
            // InternalDataDescriptionDsl.g:3602:2: rule__Rename__Group__2__Impl rule__Rename__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Rename__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rename__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__2"


    // $ANTLR start "rule__Rename__Group__2__Impl"
    // InternalDataDescriptionDsl.g:3609:1: rule__Rename__Group__2__Impl : ( ( rule__Rename__DeprecatedAssignment_2 ) ) ;
    public final void rule__Rename__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3613:1: ( ( ( rule__Rename__DeprecatedAssignment_2 ) ) )
            // InternalDataDescriptionDsl.g:3614:1: ( ( rule__Rename__DeprecatedAssignment_2 ) )
            {
            // InternalDataDescriptionDsl.g:3614:1: ( ( rule__Rename__DeprecatedAssignment_2 ) )
            // InternalDataDescriptionDsl.g:3615:2: ( rule__Rename__DeprecatedAssignment_2 )
            {
             before(grammarAccess.getRenameAccess().getDeprecatedAssignment_2()); 
            // InternalDataDescriptionDsl.g:3616:2: ( rule__Rename__DeprecatedAssignment_2 )
            // InternalDataDescriptionDsl.g:3616:3: rule__Rename__DeprecatedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Rename__DeprecatedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRenameAccess().getDeprecatedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__2__Impl"


    // $ANTLR start "rule__Rename__Group__3"
    // InternalDataDescriptionDsl.g:3624:1: rule__Rename__Group__3 : rule__Rename__Group__3__Impl rule__Rename__Group__4 ;
    public final void rule__Rename__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3628:1: ( rule__Rename__Group__3__Impl rule__Rename__Group__4 )
            // InternalDataDescriptionDsl.g:3629:2: rule__Rename__Group__3__Impl rule__Rename__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Rename__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rename__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__3"


    // $ANTLR start "rule__Rename__Group__3__Impl"
    // InternalDataDescriptionDsl.g:3636:1: rule__Rename__Group__3__Impl : ( 'as' ) ;
    public final void rule__Rename__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3640:1: ( ( 'as' ) )
            // InternalDataDescriptionDsl.g:3641:1: ( 'as' )
            {
            // InternalDataDescriptionDsl.g:3641:1: ( 'as' )
            // InternalDataDescriptionDsl.g:3642:2: 'as'
            {
             before(grammarAccess.getRenameAccess().getAsKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRenameAccess().getAsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__3__Impl"


    // $ANTLR start "rule__Rename__Group__4"
    // InternalDataDescriptionDsl.g:3651:1: rule__Rename__Group__4 : rule__Rename__Group__4__Impl ;
    public final void rule__Rename__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3655:1: ( rule__Rename__Group__4__Impl )
            // InternalDataDescriptionDsl.g:3656:2: rule__Rename__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rename__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__4"


    // $ANTLR start "rule__Rename__Group__4__Impl"
    // InternalDataDescriptionDsl.g:3662:1: rule__Rename__Group__4__Impl : ( ( rule__Rename__NewRepresentedAsAssignment_4 ) ) ;
    public final void rule__Rename__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3666:1: ( ( ( rule__Rename__NewRepresentedAsAssignment_4 ) ) )
            // InternalDataDescriptionDsl.g:3667:1: ( ( rule__Rename__NewRepresentedAsAssignment_4 ) )
            {
            // InternalDataDescriptionDsl.g:3667:1: ( ( rule__Rename__NewRepresentedAsAssignment_4 ) )
            // InternalDataDescriptionDsl.g:3668:2: ( rule__Rename__NewRepresentedAsAssignment_4 )
            {
             before(grammarAccess.getRenameAccess().getNewRepresentedAsAssignment_4()); 
            // InternalDataDescriptionDsl.g:3669:2: ( rule__Rename__NewRepresentedAsAssignment_4 )
            // InternalDataDescriptionDsl.g:3669:3: rule__Rename__NewRepresentedAsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Rename__NewRepresentedAsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRenameAccess().getNewRepresentedAsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__Group__4__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDataDescriptionDsl.g:3678:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3682:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDataDescriptionDsl.g:3683:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataDescriptionDsl.g:3690:1: rule__DataType__Group__0__Impl : ( ( rule__DataType__Alternatives_0 ) ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3694:1: ( ( ( rule__DataType__Alternatives_0 ) ) )
            // InternalDataDescriptionDsl.g:3695:1: ( ( rule__DataType__Alternatives_0 ) )
            {
            // InternalDataDescriptionDsl.g:3695:1: ( ( rule__DataType__Alternatives_0 ) )
            // InternalDataDescriptionDsl.g:3696:2: ( rule__DataType__Alternatives_0 )
            {
             before(grammarAccess.getDataTypeAccess().getAlternatives_0()); 
            // InternalDataDescriptionDsl.g:3697:2: ( rule__DataType__Alternatives_0 )
            // InternalDataDescriptionDsl.g:3697:3: rule__DataType__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getAlternatives_0()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:3705:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3709:1: ( rule__DataType__Group__1__Impl )
            // InternalDataDescriptionDsl.g:3710:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataDescriptionDsl.g:3716:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__Group_1__0 )? ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3720:1: ( ( ( rule__DataType__Group_1__0 )? ) )
            // InternalDataDescriptionDsl.g:3721:1: ( ( rule__DataType__Group_1__0 )? )
            {
            // InternalDataDescriptionDsl.g:3721:1: ( ( rule__DataType__Group_1__0 )? )
            // InternalDataDescriptionDsl.g:3722:2: ( rule__DataType__Group_1__0 )?
            {
             before(grammarAccess.getDataTypeAccess().getGroup_1()); 
            // InternalDataDescriptionDsl.g:3723:2: ( rule__DataType__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalDataDescriptionDsl.g:3723:3: rule__DataType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__DataType__Group_1__0"
    // InternalDataDescriptionDsl.g:3732:1: rule__DataType__Group_1__0 : rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 ;
    public final void rule__DataType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3736:1: ( rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1 )
            // InternalDataDescriptionDsl.g:3737:2: rule__DataType__Group_1__0__Impl rule__DataType__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__DataType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__0"


    // $ANTLR start "rule__DataType__Group_1__0__Impl"
    // InternalDataDescriptionDsl.g:3744:1: rule__DataType__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DataType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3748:1: ( ( '[' ) )
            // InternalDataDescriptionDsl.g:3749:1: ( '[' )
            {
            // InternalDataDescriptionDsl.g:3749:1: ( '[' )
            // InternalDataDescriptionDsl.g:3750:2: '['
            {
             before(grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__0__Impl"


    // $ANTLR start "rule__DataType__Group_1__1"
    // InternalDataDescriptionDsl.g:3759:1: rule__DataType__Group_1__1 : rule__DataType__Group_1__1__Impl rule__DataType__Group_1__2 ;
    public final void rule__DataType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3763:1: ( rule__DataType__Group_1__1__Impl rule__DataType__Group_1__2 )
            // InternalDataDescriptionDsl.g:3764:2: rule__DataType__Group_1__1__Impl rule__DataType__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__DataType__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__1"


    // $ANTLR start "rule__DataType__Group_1__1__Impl"
    // InternalDataDescriptionDsl.g:3771:1: rule__DataType__Group_1__1__Impl : ( ( rule__DataType__MinAssignment_1_1 ) ) ;
    public final void rule__DataType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3775:1: ( ( ( rule__DataType__MinAssignment_1_1 ) ) )
            // InternalDataDescriptionDsl.g:3776:1: ( ( rule__DataType__MinAssignment_1_1 ) )
            {
            // InternalDataDescriptionDsl.g:3776:1: ( ( rule__DataType__MinAssignment_1_1 ) )
            // InternalDataDescriptionDsl.g:3777:2: ( rule__DataType__MinAssignment_1_1 )
            {
             before(grammarAccess.getDataTypeAccess().getMinAssignment_1_1()); 
            // InternalDataDescriptionDsl.g:3778:2: ( rule__DataType__MinAssignment_1_1 )
            // InternalDataDescriptionDsl.g:3778:3: rule__DataType__MinAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__MinAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getMinAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__1__Impl"


    // $ANTLR start "rule__DataType__Group_1__2"
    // InternalDataDescriptionDsl.g:3786:1: rule__DataType__Group_1__2 : rule__DataType__Group_1__2__Impl rule__DataType__Group_1__3 ;
    public final void rule__DataType__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3790:1: ( rule__DataType__Group_1__2__Impl rule__DataType__Group_1__3 )
            // InternalDataDescriptionDsl.g:3791:2: rule__DataType__Group_1__2__Impl rule__DataType__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__DataType__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__2"


    // $ANTLR start "rule__DataType__Group_1__2__Impl"
    // InternalDataDescriptionDsl.g:3798:1: rule__DataType__Group_1__2__Impl : ( ',' ) ;
    public final void rule__DataType__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3802:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:3803:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:3803:1: ( ',' )
            // InternalDataDescriptionDsl.g:3804:2: ','
            {
             before(grammarAccess.getDataTypeAccess().getCommaKeyword_1_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getCommaKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__2__Impl"


    // $ANTLR start "rule__DataType__Group_1__3"
    // InternalDataDescriptionDsl.g:3813:1: rule__DataType__Group_1__3 : rule__DataType__Group_1__3__Impl rule__DataType__Group_1__4 ;
    public final void rule__DataType__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3817:1: ( rule__DataType__Group_1__3__Impl rule__DataType__Group_1__4 )
            // InternalDataDescriptionDsl.g:3818:2: rule__DataType__Group_1__3__Impl rule__DataType__Group_1__4
            {
            pushFollow(FOLLOW_27);
            rule__DataType__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__3"


    // $ANTLR start "rule__DataType__Group_1__3__Impl"
    // InternalDataDescriptionDsl.g:3825:1: rule__DataType__Group_1__3__Impl : ( ( rule__DataType__MaxAssignment_1_3 )? ) ;
    public final void rule__DataType__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3829:1: ( ( ( rule__DataType__MaxAssignment_1_3 )? ) )
            // InternalDataDescriptionDsl.g:3830:1: ( ( rule__DataType__MaxAssignment_1_3 )? )
            {
            // InternalDataDescriptionDsl.g:3830:1: ( ( rule__DataType__MaxAssignment_1_3 )? )
            // InternalDataDescriptionDsl.g:3831:2: ( rule__DataType__MaxAssignment_1_3 )?
            {
             before(grammarAccess.getDataTypeAccess().getMaxAssignment_1_3()); 
            // InternalDataDescriptionDsl.g:3832:2: ( rule__DataType__MaxAssignment_1_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDataDescriptionDsl.g:3832:3: rule__DataType__MaxAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataType__MaxAssignment_1_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataTypeAccess().getMaxAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__3__Impl"


    // $ANTLR start "rule__DataType__Group_1__4"
    // InternalDataDescriptionDsl.g:3840:1: rule__DataType__Group_1__4 : rule__DataType__Group_1__4__Impl ;
    public final void rule__DataType__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3844:1: ( rule__DataType__Group_1__4__Impl )
            // InternalDataDescriptionDsl.g:3845:2: rule__DataType__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__4"


    // $ANTLR start "rule__DataType__Group_1__4__Impl"
    // InternalDataDescriptionDsl.g:3851:1: rule__DataType__Group_1__4__Impl : ( ']' ) ;
    public final void rule__DataType__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3855:1: ( ( ']' ) )
            // InternalDataDescriptionDsl.g:3856:1: ( ']' )
            {
            // InternalDataDescriptionDsl.g:3856:1: ( ']' )
            // InternalDataDescriptionDsl.g:3857:2: ']'
            {
             before(grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_1_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getRightSquareBracketKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__Group_1__4__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalDataDescriptionDsl.g:3867:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3871:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalDataDescriptionDsl.g:3872:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalDataDescriptionDsl.g:3879:1: rule__Reference__Group__0__Impl : ( 'ref:' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3883:1: ( ( 'ref:' ) )
            // InternalDataDescriptionDsl.g:3884:1: ( 'ref:' )
            {
            // InternalDataDescriptionDsl.g:3884:1: ( 'ref:' )
            // InternalDataDescriptionDsl.g:3885:2: 'ref:'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalDataDescriptionDsl.g:3894:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3898:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalDataDescriptionDsl.g:3899:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalDataDescriptionDsl.g:3906:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__ReferenceTypeAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3910:1: ( ( ( rule__Reference__ReferenceTypeAssignment_1 ) ) )
            // InternalDataDescriptionDsl.g:3911:1: ( ( rule__Reference__ReferenceTypeAssignment_1 ) )
            {
            // InternalDataDescriptionDsl.g:3911:1: ( ( rule__Reference__ReferenceTypeAssignment_1 ) )
            // InternalDataDescriptionDsl.g:3912:2: ( rule__Reference__ReferenceTypeAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getReferenceTypeAssignment_1()); 
            // InternalDataDescriptionDsl.g:3913:2: ( rule__Reference__ReferenceTypeAssignment_1 )
            // InternalDataDescriptionDsl.g:3913:3: rule__Reference__ReferenceTypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__ReferenceTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getReferenceTypeAssignment_1()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:3921:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3925:1: ( rule__Reference__Group__2__Impl )
            // InternalDataDescriptionDsl.g:3926:2: rule__Reference__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalDataDescriptionDsl.g:3932:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__Group_2__0 )? ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3936:1: ( ( ( rule__Reference__Group_2__0 )? ) )
            // InternalDataDescriptionDsl.g:3937:1: ( ( rule__Reference__Group_2__0 )? )
            {
            // InternalDataDescriptionDsl.g:3937:1: ( ( rule__Reference__Group_2__0 )? )
            // InternalDataDescriptionDsl.g:3938:2: ( rule__Reference__Group_2__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_2()); 
            // InternalDataDescriptionDsl.g:3939:2: ( rule__Reference__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDataDescriptionDsl.g:3939:3: rule__Reference__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Reference__Group_2__0"
    // InternalDataDescriptionDsl.g:3948:1: rule__Reference__Group_2__0 : rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1 ;
    public final void rule__Reference__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3952:1: ( rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1 )
            // InternalDataDescriptionDsl.g:3953:2: rule__Reference__Group_2__0__Impl rule__Reference__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__Reference__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__0"


    // $ANTLR start "rule__Reference__Group_2__0__Impl"
    // InternalDataDescriptionDsl.g:3960:1: rule__Reference__Group_2__0__Impl : ( '[' ) ;
    public final void rule__Reference__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3964:1: ( ( '[' ) )
            // InternalDataDescriptionDsl.g:3965:1: ( '[' )
            {
            // InternalDataDescriptionDsl.g:3965:1: ( '[' )
            // InternalDataDescriptionDsl.g:3966:2: '['
            {
             before(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__0__Impl"


    // $ANTLR start "rule__Reference__Group_2__1"
    // InternalDataDescriptionDsl.g:3975:1: rule__Reference__Group_2__1 : rule__Reference__Group_2__1__Impl rule__Reference__Group_2__2 ;
    public final void rule__Reference__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3979:1: ( rule__Reference__Group_2__1__Impl rule__Reference__Group_2__2 )
            // InternalDataDescriptionDsl.g:3980:2: rule__Reference__Group_2__1__Impl rule__Reference__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__Reference__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__1"


    // $ANTLR start "rule__Reference__Group_2__1__Impl"
    // InternalDataDescriptionDsl.g:3987:1: rule__Reference__Group_2__1__Impl : ( ( rule__Reference__MinAssignment_2_1 ) ) ;
    public final void rule__Reference__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:3991:1: ( ( ( rule__Reference__MinAssignment_2_1 ) ) )
            // InternalDataDescriptionDsl.g:3992:1: ( ( rule__Reference__MinAssignment_2_1 ) )
            {
            // InternalDataDescriptionDsl.g:3992:1: ( ( rule__Reference__MinAssignment_2_1 ) )
            // InternalDataDescriptionDsl.g:3993:2: ( rule__Reference__MinAssignment_2_1 )
            {
             before(grammarAccess.getReferenceAccess().getMinAssignment_2_1()); 
            // InternalDataDescriptionDsl.g:3994:2: ( rule__Reference__MinAssignment_2_1 )
            // InternalDataDescriptionDsl.g:3994:3: rule__Reference__MinAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__MinAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getMinAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__1__Impl"


    // $ANTLR start "rule__Reference__Group_2__2"
    // InternalDataDescriptionDsl.g:4002:1: rule__Reference__Group_2__2 : rule__Reference__Group_2__2__Impl rule__Reference__Group_2__3 ;
    public final void rule__Reference__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4006:1: ( rule__Reference__Group_2__2__Impl rule__Reference__Group_2__3 )
            // InternalDataDescriptionDsl.g:4007:2: rule__Reference__Group_2__2__Impl rule__Reference__Group_2__3
            {
            pushFollow(FOLLOW_27);
            rule__Reference__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__2"


    // $ANTLR start "rule__Reference__Group_2__2__Impl"
    // InternalDataDescriptionDsl.g:4014:1: rule__Reference__Group_2__2__Impl : ( ',' ) ;
    public final void rule__Reference__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4018:1: ( ( ',' ) )
            // InternalDataDescriptionDsl.g:4019:1: ( ',' )
            {
            // InternalDataDescriptionDsl.g:4019:1: ( ',' )
            // InternalDataDescriptionDsl.g:4020:2: ','
            {
             before(grammarAccess.getReferenceAccess().getCommaKeyword_2_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getCommaKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__2__Impl"


    // $ANTLR start "rule__Reference__Group_2__3"
    // InternalDataDescriptionDsl.g:4029:1: rule__Reference__Group_2__3 : rule__Reference__Group_2__3__Impl rule__Reference__Group_2__4 ;
    public final void rule__Reference__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4033:1: ( rule__Reference__Group_2__3__Impl rule__Reference__Group_2__4 )
            // InternalDataDescriptionDsl.g:4034:2: rule__Reference__Group_2__3__Impl rule__Reference__Group_2__4
            {
            pushFollow(FOLLOW_27);
            rule__Reference__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__3"


    // $ANTLR start "rule__Reference__Group_2__3__Impl"
    // InternalDataDescriptionDsl.g:4041:1: rule__Reference__Group_2__3__Impl : ( ( rule__Reference__MaxAssignment_2_3 )? ) ;
    public final void rule__Reference__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4045:1: ( ( ( rule__Reference__MaxAssignment_2_3 )? ) )
            // InternalDataDescriptionDsl.g:4046:1: ( ( rule__Reference__MaxAssignment_2_3 )? )
            {
            // InternalDataDescriptionDsl.g:4046:1: ( ( rule__Reference__MaxAssignment_2_3 )? )
            // InternalDataDescriptionDsl.g:4047:2: ( rule__Reference__MaxAssignment_2_3 )?
            {
             before(grammarAccess.getReferenceAccess().getMaxAssignment_2_3()); 
            // InternalDataDescriptionDsl.g:4048:2: ( rule__Reference__MaxAssignment_2_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDataDescriptionDsl.g:4048:3: rule__Reference__MaxAssignment_2_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__MaxAssignment_2_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getMaxAssignment_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__3__Impl"


    // $ANTLR start "rule__Reference__Group_2__4"
    // InternalDataDescriptionDsl.g:4056:1: rule__Reference__Group_2__4 : rule__Reference__Group_2__4__Impl ;
    public final void rule__Reference__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4060:1: ( rule__Reference__Group_2__4__Impl )
            // InternalDataDescriptionDsl.g:4061:2: rule__Reference__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__4"


    // $ANTLR start "rule__Reference__Group_2__4__Impl"
    // InternalDataDescriptionDsl.g:4067:1: rule__Reference__Group_2__4__Impl : ( ']' ) ;
    public final void rule__Reference__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4071:1: ( ( ']' ) )
            // InternalDataDescriptionDsl.g:4072:1: ( ']' )
            {
            // InternalDataDescriptionDsl.g:4072:1: ( ']' )
            // InternalDataDescriptionDsl.g:4073:2: ']'
            {
             before(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_2_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRightSquareBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group_2__4__Impl"


    // $ANTLR start "rule__DataModel__ImportURIAssignment_0_1"
    // InternalDataDescriptionDsl.g:4083:1: rule__DataModel__ImportURIAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__DataModel__ImportURIAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4087:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4088:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4088:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4089:3: RULE_STRING
            {
             before(grammarAccess.getDataModelAccess().getImportURISTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getImportURISTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ImportURIAssignment_0_1"


    // $ANTLR start "rule__DataModel__ImportURIAssignment_0_2_1"
    // InternalDataDescriptionDsl.g:4098:1: rule__DataModel__ImportURIAssignment_0_2_1 : ( RULE_STRING ) ;
    public final void rule__DataModel__ImportURIAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4102:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4103:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4103:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4104:3: RULE_STRING
            {
             before(grammarAccess.getDataModelAccess().getImportURISTRINGTerminalRuleCall_0_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataModelAccess().getImportURISTRINGTerminalRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__ImportURIAssignment_0_2_1"


    // $ANTLR start "rule__DataModel__DescriptionsAssignment_2"
    // InternalDataDescriptionDsl.g:4113:1: rule__DataModel__DescriptionsAssignment_2 : ( ruleDataDescription ) ;
    public final void rule__DataModel__DescriptionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4117:1: ( ( ruleDataDescription ) )
            // InternalDataDescriptionDsl.g:4118:2: ( ruleDataDescription )
            {
            // InternalDataDescriptionDsl.g:4118:2: ( ruleDataDescription )
            // InternalDataDescriptionDsl.g:4119:3: ruleDataDescription
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataDescription();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__DescriptionsAssignment_2"


    // $ANTLR start "rule__DataModel__DescriptionsAssignment_3_1"
    // InternalDataDescriptionDsl.g:4128:1: rule__DataModel__DescriptionsAssignment_3_1 : ( ruleDataDescription ) ;
    public final void rule__DataModel__DescriptionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4132:1: ( ( ruleDataDescription ) )
            // InternalDataDescriptionDsl.g:4133:2: ( ruleDataDescription )
            {
            // InternalDataDescriptionDsl.g:4133:2: ( ruleDataDescription )
            // InternalDataDescriptionDsl.g:4134:3: ruleDataDescription
            {
             before(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataDescription();

            state._fsp--;

             after(grammarAccess.getDataModelAccess().getDescriptionsDataDescriptionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataModel__DescriptionsAssignment_3_1"


    // $ANTLR start "rule__DataSource__FormatAssignment_1"
    // InternalDataDescriptionDsl.g:4143:1: rule__DataSource__FormatAssignment_1 : ( ruleFormatSpecification ) ;
    public final void rule__DataSource__FormatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4147:1: ( ( ruleFormatSpecification ) )
            // InternalDataDescriptionDsl.g:4148:2: ( ruleFormatSpecification )
            {
            // InternalDataDescriptionDsl.g:4148:2: ( ruleFormatSpecification )
            // InternalDataDescriptionDsl.g:4149:3: ruleFormatSpecification
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
    // InternalDataDescriptionDsl.g:4158:1: rule__DataSource__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DataSource__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4162:1: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4163:2: ( RULE_ID )
            {
            // InternalDataDescriptionDsl.g:4163:2: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4164:3: RULE_ID
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


    // $ANTLR start "rule__DataSource__LinkAssignment_3_0"
    // InternalDataDescriptionDsl.g:4173:1: rule__DataSource__LinkAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__DataSource__LinkAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4177:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4178:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4178:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4179:3: RULE_STRING
            {
             before(grammarAccess.getDataSourceAccess().getLinkSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getLinkSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:4188:1: rule__DataSource__LinkAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__DataSource__LinkAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4192:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4193:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4193:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4194:3: RULE_STRING
            {
             before(grammarAccess.getDataSourceAccess().getLinkSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getLinkSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:4203:1: rule__DataSource__FragmentsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__DataSource__FragmentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4207:1: ( ( ( RULE_ID ) ) )
            // InternalDataDescriptionDsl.g:4208:2: ( ( RULE_ID ) )
            {
            // InternalDataDescriptionDsl.g:4208:2: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4209:3: ( RULE_ID )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_1_0()); 
            // InternalDataDescriptionDsl.g:4210:3: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4211:4: RULE_ID
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentIDTerminalRuleCall_4_1_0_1()); 

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
    // InternalDataDescriptionDsl.g:4222:1: rule__DataSource__FragmentsAssignment_4_2_1 : ( ( RULE_STRING ) ) ;
    public final void rule__DataSource__FragmentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4226:1: ( ( ( RULE_STRING ) ) )
            // InternalDataDescriptionDsl.g:4227:2: ( ( RULE_STRING ) )
            {
            // InternalDataDescriptionDsl.g:4227:2: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4228:3: ( RULE_STRING )
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentCrossReference_4_2_1_0()); 
            // InternalDataDescriptionDsl.g:4229:3: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4230:4: RULE_STRING
            {
             before(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentSTRINGTerminalRuleCall_4_2_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataSourceAccess().getFragmentsDataFragmentSTRINGTerminalRuleCall_4_2_1_0_1()); 

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
    // InternalDataDescriptionDsl.g:4241:1: rule__DataSource__NodesAssignment_7_0 : ( ruleNode ) ;
    public final void rule__DataSource__NodesAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4245:1: ( ( ruleNode ) )
            // InternalDataDescriptionDsl.g:4246:2: ( ruleNode )
            {
            // InternalDataDescriptionDsl.g:4246:2: ( ruleNode )
            // InternalDataDescriptionDsl.g:4247:3: ruleNode
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
    // InternalDataDescriptionDsl.g:4256:1: rule__DataSource__NodesAssignment_7_1_1 : ( ruleNode ) ;
    public final void rule__DataSource__NodesAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4260:1: ( ( ruleNode ) )
            // InternalDataDescriptionDsl.g:4261:2: ( ruleNode )
            {
            // InternalDataDescriptionDsl.g:4261:2: ( ruleNode )
            // InternalDataDescriptionDsl.g:4262:3: ruleNode
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
    // InternalDataDescriptionDsl.g:4271:1: rule__DataSource__OptionsAssignment_9_1 : ( ruleOption ) ;
    public final void rule__DataSource__OptionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4275:1: ( ( ruleOption ) )
            // InternalDataDescriptionDsl.g:4276:2: ( ruleOption )
            {
            // InternalDataDescriptionDsl.g:4276:2: ( ruleOption )
            // InternalDataDescriptionDsl.g:4277:3: ruleOption
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
    // InternalDataDescriptionDsl.g:4286:1: rule__DataSource__OptionsAssignment_9_2_1 : ( ruleOption ) ;
    public final void rule__DataSource__OptionsAssignment_9_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4290:1: ( ( ruleOption ) )
            // InternalDataDescriptionDsl.g:4291:2: ( ruleOption )
            {
            // InternalDataDescriptionDsl.g:4291:2: ( ruleOption )
            // InternalDataDescriptionDsl.g:4292:3: ruleOption
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
    // InternalDataDescriptionDsl.g:4301:1: rule__DataFragment__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataFragment__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4305:1: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4306:2: ( RULE_ID )
            {
            // InternalDataDescriptionDsl.g:4306:2: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4307:3: RULE_ID
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


    // $ANTLR start "rule__DataFragment__NodesAssignment_4_0"
    // InternalDataDescriptionDsl.g:4316:1: rule__DataFragment__NodesAssignment_4_0 : ( ruleNode ) ;
    public final void rule__DataFragment__NodesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4320:1: ( ( ruleNode ) )
            // InternalDataDescriptionDsl.g:4321:2: ( ruleNode )
            {
            // InternalDataDescriptionDsl.g:4321:2: ( ruleNode )
            // InternalDataDescriptionDsl.g:4322:3: ruleNode
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
    // InternalDataDescriptionDsl.g:4331:1: rule__DataFragment__NodesAssignment_4_1_1 : ( ruleNode ) ;
    public final void rule__DataFragment__NodesAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4335:1: ( ( ruleNode ) )
            // InternalDataDescriptionDsl.g:4336:2: ( ruleNode )
            {
            // InternalDataDescriptionDsl.g:4336:2: ( ruleNode )
            // InternalDataDescriptionDsl.g:4337:3: ruleNode
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


    // $ANTLR start "rule__DataFragment__OptionsAssignment_6_1"
    // InternalDataDescriptionDsl.g:4346:1: rule__DataFragment__OptionsAssignment_6_1 : ( ruleOption ) ;
    public final void rule__DataFragment__OptionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4350:1: ( ( ruleOption ) )
            // InternalDataDescriptionDsl.g:4351:2: ( ruleOption )
            {
            // InternalDataDescriptionDsl.g:4351:2: ( ruleOption )
            // InternalDataDescriptionDsl.g:4352:3: ruleOption
            {
             before(grammarAccess.getDataFragmentAccess().getOptionsOptionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataFragmentAccess().getOptionsOptionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__OptionsAssignment_6_1"


    // $ANTLR start "rule__DataFragment__OptionsAssignment_6_2_1"
    // InternalDataDescriptionDsl.g:4361:1: rule__DataFragment__OptionsAssignment_6_2_1 : ( ruleOption ) ;
    public final void rule__DataFragment__OptionsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4365:1: ( ( ruleOption ) )
            // InternalDataDescriptionDsl.g:4366:2: ( ruleOption )
            {
            // InternalDataDescriptionDsl.g:4366:2: ( ruleOption )
            // InternalDataDescriptionDsl.g:4367:3: ruleOption
            {
             before(grammarAccess.getDataFragmentAccess().getOptionsOptionParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getDataFragmentAccess().getOptionsOptionParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFragment__OptionsAssignment_6_2_1"


    // $ANTLR start "rule__FormatSpecification__SpecialFormatAssignment_0"
    // InternalDataDescriptionDsl.g:4376:1: rule__FormatSpecification__SpecialFormatAssignment_0 : ( RULE_STRING ) ;
    public final void rule__FormatSpecification__SpecialFormatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4380:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4381:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4381:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4382:3: RULE_STRING
            {
             before(grammarAccess.getFormatSpecificationAccess().getSpecialFormatSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFormatSpecificationAccess().getSpecialFormatSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
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
    // InternalDataDescriptionDsl.g:4391:1: rule__FormatSpecification__FormatAssignment_1 : ( ruleFormatKind ) ;
    public final void rule__FormatSpecification__FormatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4395:1: ( ( ruleFormatKind ) )
            // InternalDataDescriptionDsl.g:4396:2: ( ruleFormatKind )
            {
            // InternalDataDescriptionDsl.g:4396:2: ( ruleFormatKind )
            // InternalDataDescriptionDsl.g:4397:3: ruleFormatKind
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


    // $ANTLR start "rule__Option__KeyAssignment_0"
    // InternalDataDescriptionDsl.g:4406:1: rule__Option__KeyAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Option__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4410:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4411:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4411:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4412:3: RULE_STRING
            {
             before(grammarAccess.getOptionAccess().getKeySTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getKeySTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__KeyAssignment_0"


    // $ANTLR start "rule__Option__ValuesAssignment_3"
    // InternalDataDescriptionDsl.g:4421:1: rule__Option__ValuesAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Option__ValuesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4425:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4426:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4426:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4427:3: RULE_STRING
            {
             before(grammarAccess.getOptionAccess().getValuesSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getValuesSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__ValuesAssignment_3"


    // $ANTLR start "rule__Option__ValuesAssignment_4_1"
    // InternalDataDescriptionDsl.g:4436:1: rule__Option__ValuesAssignment_4_1 : ( RULE_STRING ) ;
    public final void rule__Option__ValuesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4440:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4441:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4441:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4442:3: RULE_STRING
            {
             before(grammarAccess.getOptionAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getValuesSTRINGTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__ValuesAssignment_4_1"


    // $ANTLR start "rule__CompositeNode__EnvironmentAssignment_0"
    // InternalDataDescriptionDsl.g:4451:1: rule__CompositeNode__EnvironmentAssignment_0 : ( ( '>' ) ) ;
    public final void rule__CompositeNode__EnvironmentAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4455:1: ( ( ( '>' ) ) )
            // InternalDataDescriptionDsl.g:4456:2: ( ( '>' ) )
            {
            // InternalDataDescriptionDsl.g:4456:2: ( ( '>' ) )
            // InternalDataDescriptionDsl.g:4457:3: ( '>' )
            {
             before(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_0_0()); 
            // InternalDataDescriptionDsl.g:4458:3: ( '>' )
            // InternalDataDescriptionDsl.g:4459:4: '>'
            {
             before(grammarAccess.getCompositeNodeAccess().getEnvironmentGreaterThanSignKeyword_0_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalDataDescriptionDsl.g:4470:1: rule__CompositeNode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompositeNode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4474:1: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4475:2: ( RULE_ID )
            {
            // InternalDataDescriptionDsl.g:4475:2: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4476:3: RULE_ID
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
    // InternalDataDescriptionDsl.g:4485:1: rule__CompositeNode__RepresentedAsAssignment_2 : ( RULE_STRING ) ;
    public final void rule__CompositeNode__RepresentedAsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4489:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4490:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4490:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4491:3: RULE_STRING
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
    // InternalDataDescriptionDsl.g:4500:1: rule__CompositeNode__ExtendsAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositeNode__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4504:1: ( ( ( RULE_ID ) ) )
            // InternalDataDescriptionDsl.g:4505:2: ( ( RULE_ID ) )
            {
            // InternalDataDescriptionDsl.g:4505:2: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4506:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_1_0()); 
            // InternalDataDescriptionDsl.g:4507:3: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4508:4: RULE_ID
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
    // InternalDataDescriptionDsl.g:4519:1: rule__CompositeNode__ExtendsAssignment_3_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__CompositeNode__ExtendsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4523:1: ( ( ( RULE_ID ) ) )
            // InternalDataDescriptionDsl.g:4524:2: ( ( RULE_ID ) )
            {
            // InternalDataDescriptionDsl.g:4524:2: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4525:3: ( RULE_ID )
            {
             before(grammarAccess.getCompositeNodeAccess().getExtendsCompositeNodeCrossReference_3_2_1_0()); 
            // InternalDataDescriptionDsl.g:4526:3: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4527:4: RULE_ID
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


    // $ANTLR start "rule__CompositeNode__SubnodesAssignment_4_2_0"
    // InternalDataDescriptionDsl.g:4538:1: rule__CompositeNode__SubnodesAssignment_4_2_0 : ( ruleNode ) ;
    public final void rule__CompositeNode__SubnodesAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4542:1: ( ( ruleNode ) )
            // InternalDataDescriptionDsl.g:4543:2: ( ruleNode )
            {
            // InternalDataDescriptionDsl.g:4543:2: ( ruleNode )
            // InternalDataDescriptionDsl.g:4544:3: ruleNode
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_4_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_4_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__SubnodesAssignment_4_2_0"


    // $ANTLR start "rule__CompositeNode__SubnodesAssignment_4_2_1_1"
    // InternalDataDescriptionDsl.g:4553:1: rule__CompositeNode__SubnodesAssignment_4_2_1_1 : ( ruleNode ) ;
    public final void rule__CompositeNode__SubnodesAssignment_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4557:1: ( ( ruleNode ) )
            // InternalDataDescriptionDsl.g:4558:2: ( ruleNode )
            {
            // InternalDataDescriptionDsl.g:4558:2: ( ruleNode )
            // InternalDataDescriptionDsl.g:4559:3: ruleNode
            {
             before(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_4_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getSubnodesNodeParserRuleCall_4_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__SubnodesAssignment_4_2_1_1"


    // $ANTLR start "rule__CompositeNode__OptionsAssignment_6_1"
    // InternalDataDescriptionDsl.g:4568:1: rule__CompositeNode__OptionsAssignment_6_1 : ( ruleOption ) ;
    public final void rule__CompositeNode__OptionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4572:1: ( ( ruleOption ) )
            // InternalDataDescriptionDsl.g:4573:2: ( ruleOption )
            {
            // InternalDataDescriptionDsl.g:4573:2: ( ruleOption )
            // InternalDataDescriptionDsl.g:4574:3: ruleOption
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__OptionsAssignment_6_1"


    // $ANTLR start "rule__CompositeNode__OptionsAssignment_6_2_1"
    // InternalDataDescriptionDsl.g:4583:1: rule__CompositeNode__OptionsAssignment_6_2_1 : ( ruleOption ) ;
    public final void rule__CompositeNode__OptionsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4587:1: ( ( ruleOption ) )
            // InternalDataDescriptionDsl.g:4588:2: ( ruleOption )
            {
            // InternalDataDescriptionDsl.g:4588:2: ( ruleOption )
            // InternalDataDescriptionDsl.g:4589:3: ruleOption
            {
             before(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_6_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getCompositeNodeAccess().getOptionsOptionParserRuleCall_6_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeNode__OptionsAssignment_6_2_1"


    // $ANTLR start "rule__LeafNode__KeyAssignment_0"
    // InternalDataDescriptionDsl.g:4598:1: rule__LeafNode__KeyAssignment_0 : ( ( 'key' ) ) ;
    public final void rule__LeafNode__KeyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4602:1: ( ( ( 'key' ) ) )
            // InternalDataDescriptionDsl.g:4603:2: ( ( 'key' ) )
            {
            // InternalDataDescriptionDsl.g:4603:2: ( ( 'key' ) )
            // InternalDataDescriptionDsl.g:4604:3: ( 'key' )
            {
             before(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0()); 
            // InternalDataDescriptionDsl.g:4605:3: ( 'key' )
            // InternalDataDescriptionDsl.g:4606:4: 'key'
            {
             before(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getKeyKeyKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__KeyAssignment_0"


    // $ANTLR start "rule__LeafNode__UniqueAssignment_1"
    // InternalDataDescriptionDsl.g:4617:1: rule__LeafNode__UniqueAssignment_1 : ( ( 'unique' ) ) ;
    public final void rule__LeafNode__UniqueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4621:1: ( ( ( 'unique' ) ) )
            // InternalDataDescriptionDsl.g:4622:2: ( ( 'unique' ) )
            {
            // InternalDataDescriptionDsl.g:4622:2: ( ( 'unique' ) )
            // InternalDataDescriptionDsl.g:4623:3: ( 'unique' )
            {
             before(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_1_0()); 
            // InternalDataDescriptionDsl.g:4624:3: ( 'unique' )
            // InternalDataDescriptionDsl.g:4625:4: 'unique'
            {
             before(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_1_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_1_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getUniqueUniqueKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__UniqueAssignment_1"


    // $ANTLR start "rule__LeafNode__TypeAssignment_2"
    // InternalDataDescriptionDsl.g:4636:1: rule__LeafNode__TypeAssignment_2 : ( ruleTypeSpecification ) ;
    public final void rule__LeafNode__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4640:1: ( ( ruleTypeSpecification ) )
            // InternalDataDescriptionDsl.g:4641:2: ( ruleTypeSpecification )
            {
            // InternalDataDescriptionDsl.g:4641:2: ( ruleTypeSpecification )
            // InternalDataDescriptionDsl.g:4642:3: ruleTypeSpecification
            {
             before(grammarAccess.getLeafNodeAccess().getTypeTypeSpecificationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSpecification();

            state._fsp--;

             after(grammarAccess.getLeafNodeAccess().getTypeTypeSpecificationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__TypeAssignment_2"


    // $ANTLR start "rule__LeafNode__KeywordAssignment_3"
    // InternalDataDescriptionDsl.g:4651:1: rule__LeafNode__KeywordAssignment_3 : ( ( '#' ) ) ;
    public final void rule__LeafNode__KeywordAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4655:1: ( ( ( '#' ) ) )
            // InternalDataDescriptionDsl.g:4656:2: ( ( '#' ) )
            {
            // InternalDataDescriptionDsl.g:4656:2: ( ( '#' ) )
            // InternalDataDescriptionDsl.g:4657:3: ( '#' )
            {
             before(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_3_0()); 
            // InternalDataDescriptionDsl.g:4658:3: ( '#' )
            // InternalDataDescriptionDsl.g:4659:4: '#'
            {
             before(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_3_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_3_0()); 

            }

             after(grammarAccess.getLeafNodeAccess().getKeywordNumberSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__KeywordAssignment_3"


    // $ANTLR start "rule__LeafNode__NameAssignment_4"
    // InternalDataDescriptionDsl.g:4670:1: rule__LeafNode__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__LeafNode__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4674:1: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4675:2: ( RULE_ID )
            {
            // InternalDataDescriptionDsl.g:4675:2: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4676:3: RULE_ID
            {
             before(grammarAccess.getLeafNodeAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__NameAssignment_4"


    // $ANTLR start "rule__LeafNode__RepresentedAsAssignment_5"
    // InternalDataDescriptionDsl.g:4685:1: rule__LeafNode__RepresentedAsAssignment_5 : ( RULE_STRING ) ;
    public final void rule__LeafNode__RepresentedAsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4689:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4690:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4690:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4691:3: RULE_STRING
            {
             before(grammarAccess.getLeafNodeAccess().getRepresentedAsSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLeafNodeAccess().getRepresentedAsSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeafNode__RepresentedAsAssignment_5"


    // $ANTLR start "rule__Remove__DeprecatedAssignment_2"
    // InternalDataDescriptionDsl.g:4700:1: rule__Remove__DeprecatedAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Remove__DeprecatedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4704:1: ( ( ( RULE_ID ) ) )
            // InternalDataDescriptionDsl.g:4705:2: ( ( RULE_ID ) )
            {
            // InternalDataDescriptionDsl.g:4705:2: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4706:3: ( RULE_ID )
            {
             before(grammarAccess.getRemoveAccess().getDeprecatedLeafNodeCrossReference_2_0()); 
            // InternalDataDescriptionDsl.g:4707:3: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4708:4: RULE_ID
            {
             before(grammarAccess.getRemoveAccess().getDeprecatedLeafNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRemoveAccess().getDeprecatedLeafNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRemoveAccess().getDeprecatedLeafNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Remove__DeprecatedAssignment_2"


    // $ANTLR start "rule__Retype__DeprecatedAssignment_2"
    // InternalDataDescriptionDsl.g:4719:1: rule__Retype__DeprecatedAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Retype__DeprecatedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4723:1: ( ( ( RULE_ID ) ) )
            // InternalDataDescriptionDsl.g:4724:2: ( ( RULE_ID ) )
            {
            // InternalDataDescriptionDsl.g:4724:2: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4725:3: ( RULE_ID )
            {
             before(grammarAccess.getRetypeAccess().getDeprecatedLeafNodeCrossReference_2_0()); 
            // InternalDataDescriptionDsl.g:4726:3: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4727:4: RULE_ID
            {
             before(grammarAccess.getRetypeAccess().getDeprecatedLeafNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRetypeAccess().getDeprecatedLeafNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRetypeAccess().getDeprecatedLeafNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__DeprecatedAssignment_2"


    // $ANTLR start "rule__Retype__NewTypeAssignment_4"
    // InternalDataDescriptionDsl.g:4738:1: rule__Retype__NewTypeAssignment_4 : ( ruleTypeSpecification ) ;
    public final void rule__Retype__NewTypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4742:1: ( ( ruleTypeSpecification ) )
            // InternalDataDescriptionDsl.g:4743:2: ( ruleTypeSpecification )
            {
            // InternalDataDescriptionDsl.g:4743:2: ( ruleTypeSpecification )
            // InternalDataDescriptionDsl.g:4744:3: ruleTypeSpecification
            {
             before(grammarAccess.getRetypeAccess().getNewTypeTypeSpecificationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeSpecification();

            state._fsp--;

             after(grammarAccess.getRetypeAccess().getNewTypeTypeSpecificationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Retype__NewTypeAssignment_4"


    // $ANTLR start "rule__Rename__DeprecatedAssignment_2"
    // InternalDataDescriptionDsl.g:4753:1: rule__Rename__DeprecatedAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Rename__DeprecatedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4757:1: ( ( ( RULE_ID ) ) )
            // InternalDataDescriptionDsl.g:4758:2: ( ( RULE_ID ) )
            {
            // InternalDataDescriptionDsl.g:4758:2: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4759:3: ( RULE_ID )
            {
             before(grammarAccess.getRenameAccess().getDeprecatedLeafNodeCrossReference_2_0()); 
            // InternalDataDescriptionDsl.g:4760:3: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4761:4: RULE_ID
            {
             before(grammarAccess.getRenameAccess().getDeprecatedLeafNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRenameAccess().getDeprecatedLeafNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRenameAccess().getDeprecatedLeafNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__DeprecatedAssignment_2"


    // $ANTLR start "rule__Rename__NewRepresentedAsAssignment_4"
    // InternalDataDescriptionDsl.g:4772:1: rule__Rename__NewRepresentedAsAssignment_4 : ( RULE_ID ) ;
    public final void rule__Rename__NewRepresentedAsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4776:1: ( ( RULE_ID ) )
            // InternalDataDescriptionDsl.g:4777:2: ( RULE_ID )
            {
            // InternalDataDescriptionDsl.g:4777:2: ( RULE_ID )
            // InternalDataDescriptionDsl.g:4778:3: RULE_ID
            {
             before(grammarAccess.getRenameAccess().getNewRepresentedAsIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRenameAccess().getNewRepresentedAsIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rename__NewRepresentedAsAssignment_4"


    // $ANTLR start "rule__DataType__SpecialTypeAssignment_0_0"
    // InternalDataDescriptionDsl.g:4787:1: rule__DataType__SpecialTypeAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__DataType__SpecialTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4791:1: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4792:2: ( RULE_STRING )
            {
            // InternalDataDescriptionDsl.g:4792:2: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4793:3: RULE_STRING
            {
             before(grammarAccess.getDataTypeAccess().getSpecialTypeSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getSpecialTypeSTRINGTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__SpecialTypeAssignment_0_0"


    // $ANTLR start "rule__DataType__TypeAssignment_0_1"
    // InternalDataDescriptionDsl.g:4802:1: rule__DataType__TypeAssignment_0_1 : ( ruleTypeKind ) ;
    public final void rule__DataType__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4806:1: ( ( ruleTypeKind ) )
            // InternalDataDescriptionDsl.g:4807:2: ( ruleTypeKind )
            {
            // InternalDataDescriptionDsl.g:4807:2: ( ruleTypeKind )
            // InternalDataDescriptionDsl.g:4808:3: ruleTypeKind
            {
             before(grammarAccess.getDataTypeAccess().getTypeTypeKindEnumRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeKind();

            state._fsp--;

             after(grammarAccess.getDataTypeAccess().getTypeTypeKindEnumRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__TypeAssignment_0_1"


    // $ANTLR start "rule__DataType__MinAssignment_1_1"
    // InternalDataDescriptionDsl.g:4817:1: rule__DataType__MinAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__DataType__MinAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4821:1: ( ( RULE_INT ) )
            // InternalDataDescriptionDsl.g:4822:2: ( RULE_INT )
            {
            // InternalDataDescriptionDsl.g:4822:2: ( RULE_INT )
            // InternalDataDescriptionDsl.g:4823:3: RULE_INT
            {
             before(grammarAccess.getDataTypeAccess().getMinINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getMinINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__MinAssignment_1_1"


    // $ANTLR start "rule__DataType__MaxAssignment_1_3"
    // InternalDataDescriptionDsl.g:4832:1: rule__DataType__MaxAssignment_1_3 : ( RULE_INT ) ;
    public final void rule__DataType__MaxAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4836:1: ( ( RULE_INT ) )
            // InternalDataDescriptionDsl.g:4837:2: ( RULE_INT )
            {
            // InternalDataDescriptionDsl.g:4837:2: ( RULE_INT )
            // InternalDataDescriptionDsl.g:4838:3: RULE_INT
            {
             before(grammarAccess.getDataTypeAccess().getMaxINTTerminalRuleCall_1_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getMaxINTTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataType__MaxAssignment_1_3"


    // $ANTLR start "rule__Reference__ReferenceTypeAssignment_1"
    // InternalDataDescriptionDsl.g:4847:1: rule__Reference__ReferenceTypeAssignment_1 : ( ( RULE_STRING ) ) ;
    public final void rule__Reference__ReferenceTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4851:1: ( ( ( RULE_STRING ) ) )
            // InternalDataDescriptionDsl.g:4852:2: ( ( RULE_STRING ) )
            {
            // InternalDataDescriptionDsl.g:4852:2: ( ( RULE_STRING ) )
            // InternalDataDescriptionDsl.g:4853:3: ( RULE_STRING )
            {
             before(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeCrossReference_1_0()); 
            // InternalDataDescriptionDsl.g:4854:3: ( RULE_STRING )
            // InternalDataDescriptionDsl.g:4855:4: RULE_STRING
            {
             before(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeSTRINGTerminalRuleCall_1_0_1()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeSTRINGTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getReferenceTypeCompositeNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__ReferenceTypeAssignment_1"


    // $ANTLR start "rule__Reference__MinAssignment_2_1"
    // InternalDataDescriptionDsl.g:4866:1: rule__Reference__MinAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Reference__MinAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4870:1: ( ( RULE_INT ) )
            // InternalDataDescriptionDsl.g:4871:2: ( RULE_INT )
            {
            // InternalDataDescriptionDsl.g:4871:2: ( RULE_INT )
            // InternalDataDescriptionDsl.g:4872:3: RULE_INT
            {
             before(grammarAccess.getReferenceAccess().getMinINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getMinINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__MinAssignment_2_1"


    // $ANTLR start "rule__Reference__MaxAssignment_2_3"
    // InternalDataDescriptionDsl.g:4881:1: rule__Reference__MaxAssignment_2_3 : ( RULE_INT ) ;
    public final void rule__Reference__MaxAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDataDescriptionDsl.g:4885:1: ( ( RULE_INT ) )
            // InternalDataDescriptionDsl.g:4886:2: ( RULE_INT )
            {
            // InternalDataDescriptionDsl.g:4886:2: ( RULE_INT )
            // InternalDataDescriptionDsl.g:4887:3: RULE_INT
            {
             before(grammarAccess.getReferenceAccess().getMaxINTTerminalRuleCall_2_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getMaxINTTerminalRuleCall_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__MaxAssignment_2_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000021000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000003810L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000006000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x001E0002FFFFC030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x001E0000FFFFC030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0004000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000082000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000040L});

}