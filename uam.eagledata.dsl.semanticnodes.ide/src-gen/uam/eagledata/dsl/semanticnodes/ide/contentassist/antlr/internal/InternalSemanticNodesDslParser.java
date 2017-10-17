package uam.eagledata.dsl.semanticnodes.ide.contentassist.antlr.internal;

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
import uam.eagledata.dsl.semanticnodes.services.SemanticNodesDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSemanticNodesDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'", "'repository'", "'{'", "'}'", "'metadata'", "','", "'node'", "'->'", "'['", "']'", "':'", "'='", "'-'", "'@'", "'abstract'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalSemanticNodesDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSemanticNodesDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSemanticNodesDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSemanticNodesDsl.g"; }


    	private SemanticNodesDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(SemanticNodesDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRepositoryManager"
    // InternalSemanticNodesDsl.g:53:1: entryRuleRepositoryManager : ruleRepositoryManager EOF ;
    public final void entryRuleRepositoryManager() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:54:1: ( ruleRepositoryManager EOF )
            // InternalSemanticNodesDsl.g:55:1: ruleRepositoryManager EOF
            {
             before(grammarAccess.getRepositoryManagerRule()); 
            pushFollow(FOLLOW_1);
            ruleRepositoryManager();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerRule()); 
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
    // $ANTLR end "entryRuleRepositoryManager"


    // $ANTLR start "ruleRepositoryManager"
    // InternalSemanticNodesDsl.g:62:1: ruleRepositoryManager : ( ( rule__RepositoryManager__Group__0 ) ) ;
    public final void ruleRepositoryManager() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:66:2: ( ( ( rule__RepositoryManager__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:67:2: ( ( rule__RepositoryManager__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:67:2: ( ( rule__RepositoryManager__Group__0 ) )
            // InternalSemanticNodesDsl.g:68:3: ( rule__RepositoryManager__Group__0 )
            {
             before(grammarAccess.getRepositoryManagerAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:69:3: ( rule__RepositoryManager__Group__0 )
            // InternalSemanticNodesDsl.g:69:4: rule__RepositoryManager__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryManagerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepositoryManager"


    // $ANTLR start "entryRuleRepository"
    // InternalSemanticNodesDsl.g:78:1: entryRuleRepository : ruleRepository EOF ;
    public final void entryRuleRepository() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:79:1: ( ruleRepository EOF )
            // InternalSemanticNodesDsl.g:80:1: ruleRepository EOF
            {
             before(grammarAccess.getRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryRule()); 
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
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalSemanticNodesDsl.g:87:1: ruleRepository : ( ( rule__Repository__Group__0 ) ) ;
    public final void ruleRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:91:2: ( ( ( rule__Repository__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:92:2: ( ( rule__Repository__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:92:2: ( ( rule__Repository__Group__0 ) )
            // InternalSemanticNodesDsl.g:93:3: ( rule__Repository__Group__0 )
            {
             before(grammarAccess.getRepositoryAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:94:3: ( rule__Repository__Group__0 )
            // InternalSemanticNodesDsl.g:94:4: rule__Repository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleResource"
    // InternalSemanticNodesDsl.g:103:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:104:1: ( ruleResource EOF )
            // InternalSemanticNodesDsl.g:105:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSemanticNodesDsl.g:112:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:116:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:117:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:117:2: ( ( rule__Resource__Group__0 ) )
            // InternalSemanticNodesDsl.g:118:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:119:3: ( rule__Resource__Group__0 )
            // InternalSemanticNodesDsl.g:119:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleResourceElement"
    // InternalSemanticNodesDsl.g:128:1: entryRuleResourceElement : ruleResourceElement EOF ;
    public final void entryRuleResourceElement() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:129:1: ( ruleResourceElement EOF )
            // InternalSemanticNodesDsl.g:130:1: ruleResourceElement EOF
            {
             before(grammarAccess.getResourceElementRule()); 
            pushFollow(FOLLOW_1);
            ruleResourceElement();

            state._fsp--;

             after(grammarAccess.getResourceElementRule()); 
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
    // $ANTLR end "entryRuleResourceElement"


    // $ANTLR start "ruleResourceElement"
    // InternalSemanticNodesDsl.g:137:1: ruleResourceElement : ( ( rule__ResourceElement__Alternatives ) ) ;
    public final void ruleResourceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:141:2: ( ( ( rule__ResourceElement__Alternatives ) ) )
            // InternalSemanticNodesDsl.g:142:2: ( ( rule__ResourceElement__Alternatives ) )
            {
            // InternalSemanticNodesDsl.g:142:2: ( ( rule__ResourceElement__Alternatives ) )
            // InternalSemanticNodesDsl.g:143:3: ( rule__ResourceElement__Alternatives )
            {
             before(grammarAccess.getResourceElementAccess().getAlternatives()); 
            // InternalSemanticNodesDsl.g:144:3: ( rule__ResourceElement__Alternatives )
            // InternalSemanticNodesDsl.g:144:4: rule__ResourceElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ResourceElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getResourceElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResourceElement"


    // $ANTLR start "entryRuleSemanticNode"
    // InternalSemanticNodesDsl.g:153:1: entryRuleSemanticNode : ruleSemanticNode EOF ;
    public final void entryRuleSemanticNode() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:154:1: ( ruleSemanticNode EOF )
            // InternalSemanticNodesDsl.g:155:1: ruleSemanticNode EOF
            {
             before(grammarAccess.getSemanticNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleSemanticNode();

            state._fsp--;

             after(grammarAccess.getSemanticNodeRule()); 
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
    // $ANTLR end "entryRuleSemanticNode"


    // $ANTLR start "ruleSemanticNode"
    // InternalSemanticNodesDsl.g:162:1: ruleSemanticNode : ( ( rule__SemanticNode__Group__0 ) ) ;
    public final void ruleSemanticNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:166:2: ( ( ( rule__SemanticNode__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:167:2: ( ( rule__SemanticNode__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:167:2: ( ( rule__SemanticNode__Group__0 ) )
            // InternalSemanticNodesDsl.g:168:3: ( rule__SemanticNode__Group__0 )
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:169:3: ( rule__SemanticNode__Group__0 )
            // InternalSemanticNodesDsl.g:169:4: rule__SemanticNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSemanticNode"


    // $ANTLR start "entryRuleProperty"
    // InternalSemanticNodesDsl.g:178:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:179:1: ( ruleProperty EOF )
            // InternalSemanticNodesDsl.g:180:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalSemanticNodesDsl.g:187:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:191:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalSemanticNodesDsl.g:192:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalSemanticNodesDsl.g:192:2: ( ( rule__Property__Alternatives ) )
            // InternalSemanticNodesDsl.g:193:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalSemanticNodesDsl.g:194:3: ( rule__Property__Alternatives )
            // InternalSemanticNodesDsl.g:194:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleObjectProperty"
    // InternalSemanticNodesDsl.g:203:1: entryRuleObjectProperty : ruleObjectProperty EOF ;
    public final void entryRuleObjectProperty() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:204:1: ( ruleObjectProperty EOF )
            // InternalSemanticNodesDsl.g:205:1: ruleObjectProperty EOF
            {
             before(grammarAccess.getObjectPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleObjectProperty();

            state._fsp--;

             after(grammarAccess.getObjectPropertyRule()); 
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
    // $ANTLR end "entryRuleObjectProperty"


    // $ANTLR start "ruleObjectProperty"
    // InternalSemanticNodesDsl.g:212:1: ruleObjectProperty : ( ( rule__ObjectProperty__Group__0 ) ) ;
    public final void ruleObjectProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:216:2: ( ( ( rule__ObjectProperty__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:217:2: ( ( rule__ObjectProperty__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:217:2: ( ( rule__ObjectProperty__Group__0 ) )
            // InternalSemanticNodesDsl.g:218:3: ( rule__ObjectProperty__Group__0 )
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:219:3: ( rule__ObjectProperty__Group__0 )
            // InternalSemanticNodesDsl.g:219:4: rule__ObjectProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObjectProperty"


    // $ANTLR start "entryRuleDataProperty"
    // InternalSemanticNodesDsl.g:228:1: entryRuleDataProperty : ruleDataProperty EOF ;
    public final void entryRuleDataProperty() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:229:1: ( ruleDataProperty EOF )
            // InternalSemanticNodesDsl.g:230:1: ruleDataProperty EOF
            {
             before(grammarAccess.getDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleDataProperty();

            state._fsp--;

             after(grammarAccess.getDataPropertyRule()); 
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
    // $ANTLR end "entryRuleDataProperty"


    // $ANTLR start "ruleDataProperty"
    // InternalSemanticNodesDsl.g:237:1: ruleDataProperty : ( ( rule__DataProperty__Group__0 ) ) ;
    public final void ruleDataProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:241:2: ( ( ( rule__DataProperty__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:242:2: ( ( rule__DataProperty__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:242:2: ( ( rule__DataProperty__Group__0 ) )
            // InternalSemanticNodesDsl.g:243:3: ( rule__DataProperty__Group__0 )
            {
             before(grammarAccess.getDataPropertyAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:244:3: ( rule__DataProperty__Group__0 )
            // InternalSemanticNodesDsl.g:244:4: rule__DataProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataProperty"


    // $ANTLR start "entryRuleMetaData"
    // InternalSemanticNodesDsl.g:253:1: entryRuleMetaData : ruleMetaData EOF ;
    public final void entryRuleMetaData() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:254:1: ( ruleMetaData EOF )
            // InternalSemanticNodesDsl.g:255:1: ruleMetaData EOF
            {
             before(grammarAccess.getMetaDataRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getMetaDataRule()); 
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
    // $ANTLR end "entryRuleMetaData"


    // $ANTLR start "ruleMetaData"
    // InternalSemanticNodesDsl.g:262:1: ruleMetaData : ( ( rule__MetaData__Group__0 ) ) ;
    public final void ruleMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:266:2: ( ( ( rule__MetaData__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:267:2: ( ( rule__MetaData__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:267:2: ( ( rule__MetaData__Group__0 ) )
            // InternalSemanticNodesDsl.g:268:3: ( rule__MetaData__Group__0 )
            {
             before(grammarAccess.getMetaDataAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:269:3: ( rule__MetaData__Group__0 )
            // InternalSemanticNodesDsl.g:269:4: rule__MetaData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaData"


    // $ANTLR start "entryRuleEString"
    // InternalSemanticNodesDsl.g:278:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:279:1: ( ruleEString EOF )
            // InternalSemanticNodesDsl.g:280:1: ruleEString EOF
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
    // InternalSemanticNodesDsl.g:287:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:291:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSemanticNodesDsl.g:292:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSemanticNodesDsl.g:292:2: ( ( rule__EString__Alternatives ) )
            // InternalSemanticNodesDsl.g:293:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSemanticNodesDsl.g:294:3: ( rule__EString__Alternatives )
            // InternalSemanticNodesDsl.g:294:4: rule__EString__Alternatives
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
    // InternalSemanticNodesDsl.g:303:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:304:1: ( ruleEInt EOF )
            // InternalSemanticNodesDsl.g:305:1: ruleEInt EOF
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
    // InternalSemanticNodesDsl.g:312:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:316:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:317:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:317:2: ( ( rule__EInt__Group__0 ) )
            // InternalSemanticNodesDsl.g:318:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:319:3: ( rule__EInt__Group__0 )
            // InternalSemanticNodesDsl.g:319:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleAnnotation"
    // InternalSemanticNodesDsl.g:328:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:329:1: ( ruleAnnotation EOF )
            // InternalSemanticNodesDsl.g:330:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalSemanticNodesDsl.g:337:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:341:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:342:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:342:2: ( ( rule__Annotation__Group__0 ) )
            // InternalSemanticNodesDsl.g:343:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:344:3: ( rule__Annotation__Group__0 )
            // InternalSemanticNodesDsl.g:344:4: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "ruleType"
    // InternalSemanticNodesDsl.g:353:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:357:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSemanticNodesDsl.g:358:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSemanticNodesDsl.g:358:2: ( ( rule__Type__Alternatives ) )
            // InternalSemanticNodesDsl.g:359:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSemanticNodesDsl.g:360:3: ( rule__Type__Alternatives )
            // InternalSemanticNodesDsl.g:360:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "rule__ResourceElement__Alternatives"
    // InternalSemanticNodesDsl.g:368:1: rule__ResourceElement__Alternatives : ( ( ruleResource ) | ( ruleSemanticNode ) );
    public final void rule__ResourceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:372:1: ( ( ruleResource ) | ( ruleSemanticNode ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSemanticNodesDsl.g:373:2: ( ruleResource )
                    {
                    // InternalSemanticNodesDsl.g:373:2: ( ruleResource )
                    // InternalSemanticNodesDsl.g:374:3: ruleResource
                    {
                     before(grammarAccess.getResourceElementAccess().getResourceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleResource();

                    state._fsp--;

                     after(grammarAccess.getResourceElementAccess().getResourceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:379:2: ( ruleSemanticNode )
                    {
                    // InternalSemanticNodesDsl.g:379:2: ( ruleSemanticNode )
                    // InternalSemanticNodesDsl.g:380:3: ruleSemanticNode
                    {
                     before(grammarAccess.getResourceElementAccess().getSemanticNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSemanticNode();

                    state._fsp--;

                     after(grammarAccess.getResourceElementAccess().getSemanticNodeParserRuleCall_1()); 

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
    // $ANTLR end "rule__ResourceElement__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalSemanticNodesDsl.g:389:1: rule__Property__Alternatives : ( ( ruleObjectProperty ) | ( ruleDataProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:393:1: ( ( ruleObjectProperty ) | ( ruleDataProperty ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==22) ) {
                    alt2=1;
                }
                else if ( (LA2_1==25) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==25) ) {
                    alt2=2;
                }
                else if ( (LA2_2==22) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSemanticNodesDsl.g:394:2: ( ruleObjectProperty )
                    {
                    // InternalSemanticNodesDsl.g:394:2: ( ruleObjectProperty )
                    // InternalSemanticNodesDsl.g:395:3: ruleObjectProperty
                    {
                     before(grammarAccess.getPropertyAccess().getObjectPropertyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleObjectProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getObjectPropertyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:400:2: ( ruleDataProperty )
                    {
                    // InternalSemanticNodesDsl.g:400:2: ( ruleDataProperty )
                    // InternalSemanticNodesDsl.g:401:3: ruleDataProperty
                    {
                     before(grammarAccess.getPropertyAccess().getDataPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getDataPropertyParserRuleCall_1()); 

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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSemanticNodesDsl.g:410:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:414:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSemanticNodesDsl.g:415:2: ( RULE_STRING )
                    {
                    // InternalSemanticNodesDsl.g:415:2: ( RULE_STRING )
                    // InternalSemanticNodesDsl.g:416:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:421:2: ( RULE_ID )
                    {
                    // InternalSemanticNodesDsl.g:421:2: ( RULE_ID )
                    // InternalSemanticNodesDsl.g:422:3: RULE_ID
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


    // $ANTLR start "rule__Type__Alternatives"
    // InternalSemanticNodesDsl.g:431:1: rule__Type__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:435:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSemanticNodesDsl.g:436:2: ( ( 'String' ) )
                    {
                    // InternalSemanticNodesDsl.g:436:2: ( ( 'String' ) )
                    // InternalSemanticNodesDsl.g:437:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSemanticNodesDsl.g:438:3: ( 'String' )
                    // InternalSemanticNodesDsl.g:438:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:442:2: ( ( 'Int' ) )
                    {
                    // InternalSemanticNodesDsl.g:442:2: ( ( 'Int' ) )
                    // InternalSemanticNodesDsl.g:443:3: ( 'Int' )
                    {
                     before(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalSemanticNodesDsl.g:444:3: ( 'Int' )
                    // InternalSemanticNodesDsl.g:444:4: 'Int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:448:2: ( ( 'Boolean' ) )
                    {
                    // InternalSemanticNodesDsl.g:448:2: ( ( 'Boolean' ) )
                    // InternalSemanticNodesDsl.g:449:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalSemanticNodesDsl.g:450:3: ( 'Boolean' )
                    // InternalSemanticNodesDsl.g:450:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSemanticNodesDsl.g:454:2: ( ( 'Float' ) )
                    {
                    // InternalSemanticNodesDsl.g:454:2: ( ( 'Float' ) )
                    // InternalSemanticNodesDsl.g:455:3: ( 'Float' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // InternalSemanticNodesDsl.g:456:3: ( 'Float' )
                    // InternalSemanticNodesDsl.g:456:4: 'Float'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSemanticNodesDsl.g:460:2: ( ( 'Double' ) )
                    {
                    // InternalSemanticNodesDsl.g:460:2: ( ( 'Double' ) )
                    // InternalSemanticNodesDsl.g:461:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalSemanticNodesDsl.g:462:3: ( 'Double' )
                    // InternalSemanticNodesDsl.g:462:4: 'Double'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__RepositoryManager__Group__0"
    // InternalSemanticNodesDsl.g:470:1: rule__RepositoryManager__Group__0 : rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1 ;
    public final void rule__RepositoryManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:474:1: ( rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1 )
            // InternalSemanticNodesDsl.g:475:2: rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RepositoryManager__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group__0"


    // $ANTLR start "rule__RepositoryManager__Group__0__Impl"
    // InternalSemanticNodesDsl.g:482:1: rule__RepositoryManager__Group__0__Impl : ( () ) ;
    public final void rule__RepositoryManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:486:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:487:1: ( () )
            {
            // InternalSemanticNodesDsl.g:487:1: ( () )
            // InternalSemanticNodesDsl.g:488:2: ()
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0()); 
            // InternalSemanticNodesDsl.g:489:2: ()
            // InternalSemanticNodesDsl.g:489:3: 
            {
            }

             after(grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group__0__Impl"


    // $ANTLR start "rule__RepositoryManager__Group__1"
    // InternalSemanticNodesDsl.g:497:1: rule__RepositoryManager__Group__1 : rule__RepositoryManager__Group__1__Impl ;
    public final void rule__RepositoryManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:501:1: ( rule__RepositoryManager__Group__1__Impl )
            // InternalSemanticNodesDsl.g:502:2: rule__RepositoryManager__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group__1"


    // $ANTLR start "rule__RepositoryManager__Group__1__Impl"
    // InternalSemanticNodesDsl.g:508:1: rule__RepositoryManager__Group__1__Impl : ( ( rule__RepositoryManager__Group_1__0 )? ) ;
    public final void rule__RepositoryManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:512:1: ( ( ( rule__RepositoryManager__Group_1__0 )? ) )
            // InternalSemanticNodesDsl.g:513:1: ( ( rule__RepositoryManager__Group_1__0 )? )
            {
            // InternalSemanticNodesDsl.g:513:1: ( ( rule__RepositoryManager__Group_1__0 )? )
            // InternalSemanticNodesDsl.g:514:2: ( rule__RepositoryManager__Group_1__0 )?
            {
             before(grammarAccess.getRepositoryManagerAccess().getGroup_1()); 
            // InternalSemanticNodesDsl.g:515:2: ( rule__RepositoryManager__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSemanticNodesDsl.g:515:3: rule__RepositoryManager__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepositoryManager__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepositoryManagerAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group__1__Impl"


    // $ANTLR start "rule__RepositoryManager__Group_1__0"
    // InternalSemanticNodesDsl.g:524:1: rule__RepositoryManager__Group_1__0 : rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1 ;
    public final void rule__RepositoryManager__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:528:1: ( rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1 )
            // InternalSemanticNodesDsl.g:529:2: rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__RepositoryManager__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1__0"


    // $ANTLR start "rule__RepositoryManager__Group_1__0__Impl"
    // InternalSemanticNodesDsl.g:536:1: rule__RepositoryManager__Group_1__0__Impl : ( ( rule__RepositoryManager__RepositoriesAssignment_1_0 ) ) ;
    public final void rule__RepositoryManager__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:540:1: ( ( ( rule__RepositoryManager__RepositoriesAssignment_1_0 ) ) )
            // InternalSemanticNodesDsl.g:541:1: ( ( rule__RepositoryManager__RepositoriesAssignment_1_0 ) )
            {
            // InternalSemanticNodesDsl.g:541:1: ( ( rule__RepositoryManager__RepositoriesAssignment_1_0 ) )
            // InternalSemanticNodesDsl.g:542:2: ( rule__RepositoryManager__RepositoriesAssignment_1_0 )
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_1_0()); 
            // InternalSemanticNodesDsl.g:543:2: ( rule__RepositoryManager__RepositoriesAssignment_1_0 )
            // InternalSemanticNodesDsl.g:543:3: rule__RepositoryManager__RepositoriesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__RepositoriesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1__0__Impl"


    // $ANTLR start "rule__RepositoryManager__Group_1__1"
    // InternalSemanticNodesDsl.g:551:1: rule__RepositoryManager__Group_1__1 : rule__RepositoryManager__Group_1__1__Impl ;
    public final void rule__RepositoryManager__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:555:1: ( rule__RepositoryManager__Group_1__1__Impl )
            // InternalSemanticNodesDsl.g:556:2: rule__RepositoryManager__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1__1"


    // $ANTLR start "rule__RepositoryManager__Group_1__1__Impl"
    // InternalSemanticNodesDsl.g:562:1: rule__RepositoryManager__Group_1__1__Impl : ( ( rule__RepositoryManager__RepositoriesAssignment_1_1 )* ) ;
    public final void rule__RepositoryManager__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:566:1: ( ( ( rule__RepositoryManager__RepositoriesAssignment_1_1 )* ) )
            // InternalSemanticNodesDsl.g:567:1: ( ( rule__RepositoryManager__RepositoriesAssignment_1_1 )* )
            {
            // InternalSemanticNodesDsl.g:567:1: ( ( rule__RepositoryManager__RepositoriesAssignment_1_1 )* )
            // InternalSemanticNodesDsl.g:568:2: ( rule__RepositoryManager__RepositoriesAssignment_1_1 )*
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_1_1()); 
            // InternalSemanticNodesDsl.g:569:2: ( rule__RepositoryManager__RepositoriesAssignment_1_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:569:3: rule__RepositoryManager__RepositoriesAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RepositoryManager__RepositoriesAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1__1__Impl"


    // $ANTLR start "rule__Repository__Group__0"
    // InternalSemanticNodesDsl.g:578:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:582:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalSemanticNodesDsl.g:583:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Repository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__0"


    // $ANTLR start "rule__Repository__Group__0__Impl"
    // InternalSemanticNodesDsl.g:590:1: rule__Repository__Group__0__Impl : ( () ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:594:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:595:1: ( () )
            {
            // InternalSemanticNodesDsl.g:595:1: ( () )
            // InternalSemanticNodesDsl.g:596:2: ()
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryAction_0()); 
            // InternalSemanticNodesDsl.g:597:2: ()
            // InternalSemanticNodesDsl.g:597:3: 
            {
            }

             after(grammarAccess.getRepositoryAccess().getRepositoryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__0__Impl"


    // $ANTLR start "rule__Repository__Group__1"
    // InternalSemanticNodesDsl.g:605:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:609:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalSemanticNodesDsl.g:610:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Repository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__1"


    // $ANTLR start "rule__Repository__Group__1__Impl"
    // InternalSemanticNodesDsl.g:617:1: rule__Repository__Group__1__Impl : ( 'repository' ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:621:1: ( ( 'repository' ) )
            // InternalSemanticNodesDsl.g:622:1: ( 'repository' )
            {
            // InternalSemanticNodesDsl.g:622:1: ( 'repository' )
            // InternalSemanticNodesDsl.g:623:2: 'repository'
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getRepositoryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__1__Impl"


    // $ANTLR start "rule__Repository__Group__2"
    // InternalSemanticNodesDsl.g:632:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:636:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalSemanticNodesDsl.g:637:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Repository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__2"


    // $ANTLR start "rule__Repository__Group__2__Impl"
    // InternalSemanticNodesDsl.g:644:1: rule__Repository__Group__2__Impl : ( ( rule__Repository__NameAssignment_2 ) ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:648:1: ( ( ( rule__Repository__NameAssignment_2 ) ) )
            // InternalSemanticNodesDsl.g:649:1: ( ( rule__Repository__NameAssignment_2 ) )
            {
            // InternalSemanticNodesDsl.g:649:1: ( ( rule__Repository__NameAssignment_2 ) )
            // InternalSemanticNodesDsl.g:650:2: ( rule__Repository__NameAssignment_2 )
            {
             before(grammarAccess.getRepositoryAccess().getNameAssignment_2()); 
            // InternalSemanticNodesDsl.g:651:2: ( rule__Repository__NameAssignment_2 )
            // InternalSemanticNodesDsl.g:651:3: rule__Repository__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Repository__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__2__Impl"


    // $ANTLR start "rule__Repository__Group__3"
    // InternalSemanticNodesDsl.g:659:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:663:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalSemanticNodesDsl.g:664:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Repository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__3"


    // $ANTLR start "rule__Repository__Group__3__Impl"
    // InternalSemanticNodesDsl.g:671:1: rule__Repository__Group__3__Impl : ( '{' ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:675:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:676:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:676:1: ( '{' )
            // InternalSemanticNodesDsl.g:677:2: '{'
            {
             before(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__3__Impl"


    // $ANTLR start "rule__Repository__Group__4"
    // InternalSemanticNodesDsl.g:686:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl rule__Repository__Group__5 ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:690:1: ( rule__Repository__Group__4__Impl rule__Repository__Group__5 )
            // InternalSemanticNodesDsl.g:691:2: rule__Repository__Group__4__Impl rule__Repository__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Repository__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__4"


    // $ANTLR start "rule__Repository__Group__4__Impl"
    // InternalSemanticNodesDsl.g:698:1: rule__Repository__Group__4__Impl : ( ( rule__Repository__ResourcesAssignment_4 ) ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:702:1: ( ( ( rule__Repository__ResourcesAssignment_4 ) ) )
            // InternalSemanticNodesDsl.g:703:1: ( ( rule__Repository__ResourcesAssignment_4 ) )
            {
            // InternalSemanticNodesDsl.g:703:1: ( ( rule__Repository__ResourcesAssignment_4 ) )
            // InternalSemanticNodesDsl.g:704:2: ( rule__Repository__ResourcesAssignment_4 )
            {
             before(grammarAccess.getRepositoryAccess().getResourcesAssignment_4()); 
            // InternalSemanticNodesDsl.g:705:2: ( rule__Repository__ResourcesAssignment_4 )
            // InternalSemanticNodesDsl.g:705:3: rule__Repository__ResourcesAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Repository__ResourcesAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryAccess().getResourcesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__4__Impl"


    // $ANTLR start "rule__Repository__Group__5"
    // InternalSemanticNodesDsl.g:713:1: rule__Repository__Group__5 : rule__Repository__Group__5__Impl rule__Repository__Group__6 ;
    public final void rule__Repository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:717:1: ( rule__Repository__Group__5__Impl rule__Repository__Group__6 )
            // InternalSemanticNodesDsl.g:718:2: rule__Repository__Group__5__Impl rule__Repository__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Repository__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Repository__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__5"


    // $ANTLR start "rule__Repository__Group__5__Impl"
    // InternalSemanticNodesDsl.g:725:1: rule__Repository__Group__5__Impl : ( ( rule__Repository__ResourcesAssignment_5 )* ) ;
    public final void rule__Repository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:729:1: ( ( ( rule__Repository__ResourcesAssignment_5 )* ) )
            // InternalSemanticNodesDsl.g:730:1: ( ( rule__Repository__ResourcesAssignment_5 )* )
            {
            // InternalSemanticNodesDsl.g:730:1: ( ( rule__Repository__ResourcesAssignment_5 )* )
            // InternalSemanticNodesDsl.g:731:2: ( rule__Repository__ResourcesAssignment_5 )*
            {
             before(grammarAccess.getRepositoryAccess().getResourcesAssignment_5()); 
            // InternalSemanticNodesDsl.g:732:2: ( rule__Repository__ResourcesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==28) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:732:3: rule__Repository__ResourcesAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Repository__ResourcesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRepositoryAccess().getResourcesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__5__Impl"


    // $ANTLR start "rule__Repository__Group__6"
    // InternalSemanticNodesDsl.g:740:1: rule__Repository__Group__6 : rule__Repository__Group__6__Impl ;
    public final void rule__Repository__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:744:1: ( rule__Repository__Group__6__Impl )
            // InternalSemanticNodesDsl.g:745:2: rule__Repository__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Repository__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__6"


    // $ANTLR start "rule__Repository__Group__6__Impl"
    // InternalSemanticNodesDsl.g:751:1: rule__Repository__Group__6__Impl : ( '}' ) ;
    public final void rule__Repository__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:755:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:756:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:756:1: ( '}' )
            // InternalSemanticNodesDsl.g:757:2: '}'
            {
             before(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__Group__6__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalSemanticNodesDsl.g:767:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:771:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalSemanticNodesDsl.g:772:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalSemanticNodesDsl.g:779:1: rule__Resource__Group__0__Impl : ( () ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:783:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:784:1: ( () )
            {
            // InternalSemanticNodesDsl.g:784:1: ( () )
            // InternalSemanticNodesDsl.g:785:2: ()
            {
             before(grammarAccess.getResourceAccess().getResourceAction_0()); 
            // InternalSemanticNodesDsl.g:786:2: ()
            // InternalSemanticNodesDsl.g:786:3: 
            {
            }

             after(grammarAccess.getResourceAccess().getResourceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalSemanticNodesDsl.g:794:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:798:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalSemanticNodesDsl.g:799:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalSemanticNodesDsl.g:806:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__Group_1__0 )? ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:810:1: ( ( ( rule__Resource__Group_1__0 )? ) )
            // InternalSemanticNodesDsl.g:811:1: ( ( rule__Resource__Group_1__0 )? )
            {
            // InternalSemanticNodesDsl.g:811:1: ( ( rule__Resource__Group_1__0 )? )
            // InternalSemanticNodesDsl.g:812:2: ( rule__Resource__Group_1__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_1()); 
            // InternalSemanticNodesDsl.g:813:2: ( rule__Resource__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSemanticNodesDsl.g:813:3: rule__Resource__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalSemanticNodesDsl.g:821:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:825:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalSemanticNodesDsl.g:826:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalSemanticNodesDsl.g:833:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__AssistantAssignment_2 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:837:1: ( ( ( rule__Resource__AssistantAssignment_2 ) ) )
            // InternalSemanticNodesDsl.g:838:1: ( ( rule__Resource__AssistantAssignment_2 ) )
            {
            // InternalSemanticNodesDsl.g:838:1: ( ( rule__Resource__AssistantAssignment_2 ) )
            // InternalSemanticNodesDsl.g:839:2: ( rule__Resource__AssistantAssignment_2 )
            {
             before(grammarAccess.getResourceAccess().getAssistantAssignment_2()); 
            // InternalSemanticNodesDsl.g:840:2: ( rule__Resource__AssistantAssignment_2 )
            // InternalSemanticNodesDsl.g:840:3: rule__Resource__AssistantAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__AssistantAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getAssistantAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalSemanticNodesDsl.g:848:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:852:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalSemanticNodesDsl.g:853:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalSemanticNodesDsl.g:860:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__NameAssignment_3 ) ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:864:1: ( ( ( rule__Resource__NameAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:865:1: ( ( rule__Resource__NameAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:865:1: ( ( rule__Resource__NameAssignment_3 ) )
            // InternalSemanticNodesDsl.g:866:2: ( rule__Resource__NameAssignment_3 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_3()); 
            // InternalSemanticNodesDsl.g:867:2: ( rule__Resource__NameAssignment_3 )
            // InternalSemanticNodesDsl.g:867:3: rule__Resource__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // InternalSemanticNodesDsl.g:875:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:879:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalSemanticNodesDsl.g:880:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Resource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // InternalSemanticNodesDsl.g:887:1: rule__Resource__Group__4__Impl : ( '{' ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:891:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:892:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:892:1: ( '{' )
            // InternalSemanticNodesDsl.g:893:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__5"
    // InternalSemanticNodesDsl.g:902:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl rule__Resource__Group__6 ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:906:1: ( rule__Resource__Group__5__Impl rule__Resource__Group__6 )
            // InternalSemanticNodesDsl.g:907:2: rule__Resource__Group__5__Impl rule__Resource__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Resource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__5"


    // $ANTLR start "rule__Resource__Group__5__Impl"
    // InternalSemanticNodesDsl.g:914:1: rule__Resource__Group__5__Impl : ( ( rule__Resource__Group_5__0 )? ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:918:1: ( ( ( rule__Resource__Group_5__0 )? ) )
            // InternalSemanticNodesDsl.g:919:1: ( ( rule__Resource__Group_5__0 )? )
            {
            // InternalSemanticNodesDsl.g:919:1: ( ( rule__Resource__Group_5__0 )? )
            // InternalSemanticNodesDsl.g:920:2: ( rule__Resource__Group_5__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_5()); 
            // InternalSemanticNodesDsl.g:921:2: ( rule__Resource__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==21||(LA9_0>=28 && LA9_0<=29)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSemanticNodesDsl.g:921:3: rule__Resource__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__5__Impl"


    // $ANTLR start "rule__Resource__Group__6"
    // InternalSemanticNodesDsl.g:929:1: rule__Resource__Group__6 : rule__Resource__Group__6__Impl rule__Resource__Group__7 ;
    public final void rule__Resource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:933:1: ( rule__Resource__Group__6__Impl rule__Resource__Group__7 )
            // InternalSemanticNodesDsl.g:934:2: rule__Resource__Group__6__Impl rule__Resource__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Resource__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__6"


    // $ANTLR start "rule__Resource__Group__6__Impl"
    // InternalSemanticNodesDsl.g:941:1: rule__Resource__Group__6__Impl : ( '}' ) ;
    public final void rule__Resource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:945:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:946:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:946:1: ( '}' )
            // InternalSemanticNodesDsl.g:947:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__6__Impl"


    // $ANTLR start "rule__Resource__Group__7"
    // InternalSemanticNodesDsl.g:956:1: rule__Resource__Group__7 : rule__Resource__Group__7__Impl ;
    public final void rule__Resource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:960:1: ( rule__Resource__Group__7__Impl )
            // InternalSemanticNodesDsl.g:961:2: rule__Resource__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__7"


    // $ANTLR start "rule__Resource__Group__7__Impl"
    // InternalSemanticNodesDsl.g:967:1: rule__Resource__Group__7__Impl : ( ( rule__Resource__Group_7__0 )? ) ;
    public final void rule__Resource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:971:1: ( ( ( rule__Resource__Group_7__0 )? ) )
            // InternalSemanticNodesDsl.g:972:1: ( ( rule__Resource__Group_7__0 )? )
            {
            // InternalSemanticNodesDsl.g:972:1: ( ( rule__Resource__Group_7__0 )? )
            // InternalSemanticNodesDsl.g:973:2: ( rule__Resource__Group_7__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_7()); 
            // InternalSemanticNodesDsl.g:974:2: ( rule__Resource__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSemanticNodesDsl.g:974:3: rule__Resource__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__7__Impl"


    // $ANTLR start "rule__Resource__Group_1__0"
    // InternalSemanticNodesDsl.g:983:1: rule__Resource__Group_1__0 : rule__Resource__Group_1__0__Impl rule__Resource__Group_1__1 ;
    public final void rule__Resource__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:987:1: ( rule__Resource__Group_1__0__Impl rule__Resource__Group_1__1 )
            // InternalSemanticNodesDsl.g:988:2: rule__Resource__Group_1__0__Impl rule__Resource__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Resource__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1__0"


    // $ANTLR start "rule__Resource__Group_1__0__Impl"
    // InternalSemanticNodesDsl.g:995:1: rule__Resource__Group_1__0__Impl : ( ( rule__Resource__AnnotationsAssignment_1_0 ) ) ;
    public final void rule__Resource__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:999:1: ( ( ( rule__Resource__AnnotationsAssignment_1_0 ) ) )
            // InternalSemanticNodesDsl.g:1000:1: ( ( rule__Resource__AnnotationsAssignment_1_0 ) )
            {
            // InternalSemanticNodesDsl.g:1000:1: ( ( rule__Resource__AnnotationsAssignment_1_0 ) )
            // InternalSemanticNodesDsl.g:1001:2: ( rule__Resource__AnnotationsAssignment_1_0 )
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_0()); 
            // InternalSemanticNodesDsl.g:1002:2: ( rule__Resource__AnnotationsAssignment_1_0 )
            // InternalSemanticNodesDsl.g:1002:3: rule__Resource__AnnotationsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__AnnotationsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1__0__Impl"


    // $ANTLR start "rule__Resource__Group_1__1"
    // InternalSemanticNodesDsl.g:1010:1: rule__Resource__Group_1__1 : rule__Resource__Group_1__1__Impl ;
    public final void rule__Resource__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1014:1: ( rule__Resource__Group_1__1__Impl )
            // InternalSemanticNodesDsl.g:1015:2: rule__Resource__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1__1"


    // $ANTLR start "rule__Resource__Group_1__1__Impl"
    // InternalSemanticNodesDsl.g:1021:1: rule__Resource__Group_1__1__Impl : ( ( rule__Resource__AnnotationsAssignment_1_1 )* ) ;
    public final void rule__Resource__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1025:1: ( ( ( rule__Resource__AnnotationsAssignment_1_1 )* ) )
            // InternalSemanticNodesDsl.g:1026:1: ( ( rule__Resource__AnnotationsAssignment_1_1 )* )
            {
            // InternalSemanticNodesDsl.g:1026:1: ( ( rule__Resource__AnnotationsAssignment_1_1 )* )
            // InternalSemanticNodesDsl.g:1027:2: ( rule__Resource__AnnotationsAssignment_1_1 )*
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_1()); 
            // InternalSemanticNodesDsl.g:1028:2: ( rule__Resource__AnnotationsAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1028:3: rule__Resource__AnnotationsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Resource__AnnotationsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1__1__Impl"


    // $ANTLR start "rule__Resource__Group_5__0"
    // InternalSemanticNodesDsl.g:1037:1: rule__Resource__Group_5__0 : rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 ;
    public final void rule__Resource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1041:1: ( rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 )
            // InternalSemanticNodesDsl.g:1042:2: rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Resource__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_5__0"


    // $ANTLR start "rule__Resource__Group_5__0__Impl"
    // InternalSemanticNodesDsl.g:1049:1: rule__Resource__Group_5__0__Impl : ( ( rule__Resource__ResourceElementsAssignment_5_0 ) ) ;
    public final void rule__Resource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1053:1: ( ( ( rule__Resource__ResourceElementsAssignment_5_0 ) ) )
            // InternalSemanticNodesDsl.g:1054:1: ( ( rule__Resource__ResourceElementsAssignment_5_0 ) )
            {
            // InternalSemanticNodesDsl.g:1054:1: ( ( rule__Resource__ResourceElementsAssignment_5_0 ) )
            // InternalSemanticNodesDsl.g:1055:2: ( rule__Resource__ResourceElementsAssignment_5_0 )
            {
             before(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_0()); 
            // InternalSemanticNodesDsl.g:1056:2: ( rule__Resource__ResourceElementsAssignment_5_0 )
            // InternalSemanticNodesDsl.g:1056:3: rule__Resource__ResourceElementsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__ResourceElementsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_5__0__Impl"


    // $ANTLR start "rule__Resource__Group_5__1"
    // InternalSemanticNodesDsl.g:1064:1: rule__Resource__Group_5__1 : rule__Resource__Group_5__1__Impl ;
    public final void rule__Resource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1068:1: ( rule__Resource__Group_5__1__Impl )
            // InternalSemanticNodesDsl.g:1069:2: rule__Resource__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_5__1"


    // $ANTLR start "rule__Resource__Group_5__1__Impl"
    // InternalSemanticNodesDsl.g:1075:1: rule__Resource__Group_5__1__Impl : ( ( rule__Resource__ResourceElementsAssignment_5_1 )* ) ;
    public final void rule__Resource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1079:1: ( ( ( rule__Resource__ResourceElementsAssignment_5_1 )* ) )
            // InternalSemanticNodesDsl.g:1080:1: ( ( rule__Resource__ResourceElementsAssignment_5_1 )* )
            {
            // InternalSemanticNodesDsl.g:1080:1: ( ( rule__Resource__ResourceElementsAssignment_5_1 )* )
            // InternalSemanticNodesDsl.g:1081:2: ( rule__Resource__ResourceElementsAssignment_5_1 )*
            {
             before(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_1()); 
            // InternalSemanticNodesDsl.g:1082:2: ( rule__Resource__ResourceElementsAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||LA12_0==21||(LA12_0>=28 && LA12_0<=29)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1082:3: rule__Resource__ResourceElementsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Resource__ResourceElementsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_5__1__Impl"


    // $ANTLR start "rule__Resource__Group_7__0"
    // InternalSemanticNodesDsl.g:1091:1: rule__Resource__Group_7__0 : rule__Resource__Group_7__0__Impl rule__Resource__Group_7__1 ;
    public final void rule__Resource__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1095:1: ( rule__Resource__Group_7__0__Impl rule__Resource__Group_7__1 )
            // InternalSemanticNodesDsl.g:1096:2: rule__Resource__Group_7__0__Impl rule__Resource__Group_7__1
            {
            pushFollow(FOLLOW_6);
            rule__Resource__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__0"


    // $ANTLR start "rule__Resource__Group_7__0__Impl"
    // InternalSemanticNodesDsl.g:1103:1: rule__Resource__Group_7__0__Impl : ( 'metadata' ) ;
    public final void rule__Resource__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1107:1: ( ( 'metadata' ) )
            // InternalSemanticNodesDsl.g:1108:1: ( 'metadata' )
            {
            // InternalSemanticNodesDsl.g:1108:1: ( 'metadata' )
            // InternalSemanticNodesDsl.g:1109:2: 'metadata'
            {
             before(grammarAccess.getResourceAccess().getMetadataKeyword_7_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getMetadataKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__0__Impl"


    // $ANTLR start "rule__Resource__Group_7__1"
    // InternalSemanticNodesDsl.g:1118:1: rule__Resource__Group_7__1 : rule__Resource__Group_7__1__Impl rule__Resource__Group_7__2 ;
    public final void rule__Resource__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1122:1: ( rule__Resource__Group_7__1__Impl rule__Resource__Group_7__2 )
            // InternalSemanticNodesDsl.g:1123:2: rule__Resource__Group_7__1__Impl rule__Resource__Group_7__2
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__1"


    // $ANTLR start "rule__Resource__Group_7__1__Impl"
    // InternalSemanticNodesDsl.g:1130:1: rule__Resource__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Resource__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1134:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:1135:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:1135:1: ( '{' )
            // InternalSemanticNodesDsl.g:1136:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__1__Impl"


    // $ANTLR start "rule__Resource__Group_7__2"
    // InternalSemanticNodesDsl.g:1145:1: rule__Resource__Group_7__2 : rule__Resource__Group_7__2__Impl rule__Resource__Group_7__3 ;
    public final void rule__Resource__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1149:1: ( rule__Resource__Group_7__2__Impl rule__Resource__Group_7__3 )
            // InternalSemanticNodesDsl.g:1150:2: rule__Resource__Group_7__2__Impl rule__Resource__Group_7__3
            {
            pushFollow(FOLLOW_16);
            rule__Resource__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__2"


    // $ANTLR start "rule__Resource__Group_7__2__Impl"
    // InternalSemanticNodesDsl.g:1157:1: rule__Resource__Group_7__2__Impl : ( ( rule__Resource__MetadataAssignment_7_2 ) ) ;
    public final void rule__Resource__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1161:1: ( ( ( rule__Resource__MetadataAssignment_7_2 ) ) )
            // InternalSemanticNodesDsl.g:1162:1: ( ( rule__Resource__MetadataAssignment_7_2 ) )
            {
            // InternalSemanticNodesDsl.g:1162:1: ( ( rule__Resource__MetadataAssignment_7_2 ) )
            // InternalSemanticNodesDsl.g:1163:2: ( rule__Resource__MetadataAssignment_7_2 )
            {
             before(grammarAccess.getResourceAccess().getMetadataAssignment_7_2()); 
            // InternalSemanticNodesDsl.g:1164:2: ( rule__Resource__MetadataAssignment_7_2 )
            // InternalSemanticNodesDsl.g:1164:3: rule__Resource__MetadataAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__MetadataAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getMetadataAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__2__Impl"


    // $ANTLR start "rule__Resource__Group_7__3"
    // InternalSemanticNodesDsl.g:1172:1: rule__Resource__Group_7__3 : rule__Resource__Group_7__3__Impl rule__Resource__Group_7__4 ;
    public final void rule__Resource__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1176:1: ( rule__Resource__Group_7__3__Impl rule__Resource__Group_7__4 )
            // InternalSemanticNodesDsl.g:1177:2: rule__Resource__Group_7__3__Impl rule__Resource__Group_7__4
            {
            pushFollow(FOLLOW_16);
            rule__Resource__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_7__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__3"


    // $ANTLR start "rule__Resource__Group_7__3__Impl"
    // InternalSemanticNodesDsl.g:1184:1: rule__Resource__Group_7__3__Impl : ( ( rule__Resource__Group_7_3__0 )* ) ;
    public final void rule__Resource__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1188:1: ( ( ( rule__Resource__Group_7_3__0 )* ) )
            // InternalSemanticNodesDsl.g:1189:1: ( ( rule__Resource__Group_7_3__0 )* )
            {
            // InternalSemanticNodesDsl.g:1189:1: ( ( rule__Resource__Group_7_3__0 )* )
            // InternalSemanticNodesDsl.g:1190:2: ( rule__Resource__Group_7_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_7_3()); 
            // InternalSemanticNodesDsl.g:1191:2: ( rule__Resource__Group_7_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1191:3: rule__Resource__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Resource__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__3__Impl"


    // $ANTLR start "rule__Resource__Group_7__4"
    // InternalSemanticNodesDsl.g:1199:1: rule__Resource__Group_7__4 : rule__Resource__Group_7__4__Impl ;
    public final void rule__Resource__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1203:1: ( rule__Resource__Group_7__4__Impl )
            // InternalSemanticNodesDsl.g:1204:2: rule__Resource__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_7__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__4"


    // $ANTLR start "rule__Resource__Group_7__4__Impl"
    // InternalSemanticNodesDsl.g:1210:1: rule__Resource__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Resource__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1214:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1215:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1215:1: ( '}' )
            // InternalSemanticNodesDsl.g:1216:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7__4__Impl"


    // $ANTLR start "rule__Resource__Group_7_3__0"
    // InternalSemanticNodesDsl.g:1226:1: rule__Resource__Group_7_3__0 : rule__Resource__Group_7_3__0__Impl rule__Resource__Group_7_3__1 ;
    public final void rule__Resource__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1230:1: ( rule__Resource__Group_7_3__0__Impl rule__Resource__Group_7_3__1 )
            // InternalSemanticNodesDsl.g:1231:2: rule__Resource__Group_7_3__0__Impl rule__Resource__Group_7_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_7_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7_3__0"


    // $ANTLR start "rule__Resource__Group_7_3__0__Impl"
    // InternalSemanticNodesDsl.g:1238:1: rule__Resource__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1242:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:1243:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:1243:1: ( ',' )
            // InternalSemanticNodesDsl.g:1244:2: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_7_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7_3__0__Impl"


    // $ANTLR start "rule__Resource__Group_7_3__1"
    // InternalSemanticNodesDsl.g:1253:1: rule__Resource__Group_7_3__1 : rule__Resource__Group_7_3__1__Impl ;
    public final void rule__Resource__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1257:1: ( rule__Resource__Group_7_3__1__Impl )
            // InternalSemanticNodesDsl.g:1258:2: rule__Resource__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_7_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7_3__1"


    // $ANTLR start "rule__Resource__Group_7_3__1__Impl"
    // InternalSemanticNodesDsl.g:1264:1: rule__Resource__Group_7_3__1__Impl : ( ( rule__Resource__MetadataAssignment_7_3_1 ) ) ;
    public final void rule__Resource__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1268:1: ( ( ( rule__Resource__MetadataAssignment_7_3_1 ) ) )
            // InternalSemanticNodesDsl.g:1269:1: ( ( rule__Resource__MetadataAssignment_7_3_1 ) )
            {
            // InternalSemanticNodesDsl.g:1269:1: ( ( rule__Resource__MetadataAssignment_7_3_1 ) )
            // InternalSemanticNodesDsl.g:1270:2: ( rule__Resource__MetadataAssignment_7_3_1 )
            {
             before(grammarAccess.getResourceAccess().getMetadataAssignment_7_3_1()); 
            // InternalSemanticNodesDsl.g:1271:2: ( rule__Resource__MetadataAssignment_7_3_1 )
            // InternalSemanticNodesDsl.g:1271:3: rule__Resource__MetadataAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__MetadataAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getMetadataAssignment_7_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7_3__1__Impl"


    // $ANTLR start "rule__SemanticNode__Group__0"
    // InternalSemanticNodesDsl.g:1280:1: rule__SemanticNode__Group__0 : rule__SemanticNode__Group__0__Impl rule__SemanticNode__Group__1 ;
    public final void rule__SemanticNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1284:1: ( rule__SemanticNode__Group__0__Impl rule__SemanticNode__Group__1 )
            // InternalSemanticNodesDsl.g:1285:2: rule__SemanticNode__Group__0__Impl rule__SemanticNode__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__SemanticNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__0"


    // $ANTLR start "rule__SemanticNode__Group__0__Impl"
    // InternalSemanticNodesDsl.g:1292:1: rule__SemanticNode__Group__0__Impl : ( () ) ;
    public final void rule__SemanticNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1296:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:1297:1: ( () )
            {
            // InternalSemanticNodesDsl.g:1297:1: ( () )
            // InternalSemanticNodesDsl.g:1298:2: ()
            {
             before(grammarAccess.getSemanticNodeAccess().getSemanticNodeAction_0()); 
            // InternalSemanticNodesDsl.g:1299:2: ()
            // InternalSemanticNodesDsl.g:1299:3: 
            {
            }

             after(grammarAccess.getSemanticNodeAccess().getSemanticNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__0__Impl"


    // $ANTLR start "rule__SemanticNode__Group__1"
    // InternalSemanticNodesDsl.g:1307:1: rule__SemanticNode__Group__1 : rule__SemanticNode__Group__1__Impl rule__SemanticNode__Group__2 ;
    public final void rule__SemanticNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1311:1: ( rule__SemanticNode__Group__1__Impl rule__SemanticNode__Group__2 )
            // InternalSemanticNodesDsl.g:1312:2: rule__SemanticNode__Group__1__Impl rule__SemanticNode__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SemanticNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__1"


    // $ANTLR start "rule__SemanticNode__Group__1__Impl"
    // InternalSemanticNodesDsl.g:1319:1: rule__SemanticNode__Group__1__Impl : ( ( rule__SemanticNode__Group_1__0 )? ) ;
    public final void rule__SemanticNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1323:1: ( ( ( rule__SemanticNode__Group_1__0 )? ) )
            // InternalSemanticNodesDsl.g:1324:1: ( ( rule__SemanticNode__Group_1__0 )? )
            {
            // InternalSemanticNodesDsl.g:1324:1: ( ( rule__SemanticNode__Group_1__0 )? )
            // InternalSemanticNodesDsl.g:1325:2: ( rule__SemanticNode__Group_1__0 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_1()); 
            // InternalSemanticNodesDsl.g:1326:2: ( rule__SemanticNode__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1326:3: rule__SemanticNode__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SemanticNode__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemanticNodeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__1__Impl"


    // $ANTLR start "rule__SemanticNode__Group__2"
    // InternalSemanticNodesDsl.g:1334:1: rule__SemanticNode__Group__2 : rule__SemanticNode__Group__2__Impl rule__SemanticNode__Group__3 ;
    public final void rule__SemanticNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1338:1: ( rule__SemanticNode__Group__2__Impl rule__SemanticNode__Group__3 )
            // InternalSemanticNodesDsl.g:1339:2: rule__SemanticNode__Group__2__Impl rule__SemanticNode__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SemanticNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__2"


    // $ANTLR start "rule__SemanticNode__Group__2__Impl"
    // InternalSemanticNodesDsl.g:1346:1: rule__SemanticNode__Group__2__Impl : ( ( rule__SemanticNode__AbstractAssignment_2 )? ) ;
    public final void rule__SemanticNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1350:1: ( ( ( rule__SemanticNode__AbstractAssignment_2 )? ) )
            // InternalSemanticNodesDsl.g:1351:1: ( ( rule__SemanticNode__AbstractAssignment_2 )? )
            {
            // InternalSemanticNodesDsl.g:1351:1: ( ( rule__SemanticNode__AbstractAssignment_2 )? )
            // InternalSemanticNodesDsl.g:1352:2: ( rule__SemanticNode__AbstractAssignment_2 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getAbstractAssignment_2()); 
            // InternalSemanticNodesDsl.g:1353:2: ( rule__SemanticNode__AbstractAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1353:3: rule__SemanticNode__AbstractAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SemanticNode__AbstractAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemanticNodeAccess().getAbstractAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__2__Impl"


    // $ANTLR start "rule__SemanticNode__Group__3"
    // InternalSemanticNodesDsl.g:1361:1: rule__SemanticNode__Group__3 : rule__SemanticNode__Group__3__Impl rule__SemanticNode__Group__4 ;
    public final void rule__SemanticNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1365:1: ( rule__SemanticNode__Group__3__Impl rule__SemanticNode__Group__4 )
            // InternalSemanticNodesDsl.g:1366:2: rule__SemanticNode__Group__3__Impl rule__SemanticNode__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SemanticNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__3"


    // $ANTLR start "rule__SemanticNode__Group__3__Impl"
    // InternalSemanticNodesDsl.g:1373:1: rule__SemanticNode__Group__3__Impl : ( 'node' ) ;
    public final void rule__SemanticNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1377:1: ( ( 'node' ) )
            // InternalSemanticNodesDsl.g:1378:1: ( 'node' )
            {
            // InternalSemanticNodesDsl.g:1378:1: ( 'node' )
            // InternalSemanticNodesDsl.g:1379:2: 'node'
            {
             before(grammarAccess.getSemanticNodeAccess().getNodeKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getNodeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__3__Impl"


    // $ANTLR start "rule__SemanticNode__Group__4"
    // InternalSemanticNodesDsl.g:1388:1: rule__SemanticNode__Group__4 : rule__SemanticNode__Group__4__Impl rule__SemanticNode__Group__5 ;
    public final void rule__SemanticNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1392:1: ( rule__SemanticNode__Group__4__Impl rule__SemanticNode__Group__5 )
            // InternalSemanticNodesDsl.g:1393:2: rule__SemanticNode__Group__4__Impl rule__SemanticNode__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SemanticNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__4"


    // $ANTLR start "rule__SemanticNode__Group__4__Impl"
    // InternalSemanticNodesDsl.g:1400:1: rule__SemanticNode__Group__4__Impl : ( ( rule__SemanticNode__NameAssignment_4 ) ) ;
    public final void rule__SemanticNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1404:1: ( ( ( rule__SemanticNode__NameAssignment_4 ) ) )
            // InternalSemanticNodesDsl.g:1405:1: ( ( rule__SemanticNode__NameAssignment_4 ) )
            {
            // InternalSemanticNodesDsl.g:1405:1: ( ( rule__SemanticNode__NameAssignment_4 ) )
            // InternalSemanticNodesDsl.g:1406:2: ( rule__SemanticNode__NameAssignment_4 )
            {
             before(grammarAccess.getSemanticNodeAccess().getNameAssignment_4()); 
            // InternalSemanticNodesDsl.g:1407:2: ( rule__SemanticNode__NameAssignment_4 )
            // InternalSemanticNodesDsl.g:1407:3: rule__SemanticNode__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__4__Impl"


    // $ANTLR start "rule__SemanticNode__Group__5"
    // InternalSemanticNodesDsl.g:1415:1: rule__SemanticNode__Group__5 : rule__SemanticNode__Group__5__Impl rule__SemanticNode__Group__6 ;
    public final void rule__SemanticNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1419:1: ( rule__SemanticNode__Group__5__Impl rule__SemanticNode__Group__6 )
            // InternalSemanticNodesDsl.g:1420:2: rule__SemanticNode__Group__5__Impl rule__SemanticNode__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__SemanticNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__5"


    // $ANTLR start "rule__SemanticNode__Group__5__Impl"
    // InternalSemanticNodesDsl.g:1427:1: rule__SemanticNode__Group__5__Impl : ( '{' ) ;
    public final void rule__SemanticNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1431:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:1432:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:1432:1: ( '{' )
            // InternalSemanticNodesDsl.g:1433:2: '{'
            {
             before(grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__5__Impl"


    // $ANTLR start "rule__SemanticNode__Group__6"
    // InternalSemanticNodesDsl.g:1442:1: rule__SemanticNode__Group__6 : rule__SemanticNode__Group__6__Impl rule__SemanticNode__Group__7 ;
    public final void rule__SemanticNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1446:1: ( rule__SemanticNode__Group__6__Impl rule__SemanticNode__Group__7 )
            // InternalSemanticNodesDsl.g:1447:2: rule__SemanticNode__Group__6__Impl rule__SemanticNode__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__SemanticNode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__6"


    // $ANTLR start "rule__SemanticNode__Group__6__Impl"
    // InternalSemanticNodesDsl.g:1454:1: rule__SemanticNode__Group__6__Impl : ( ( rule__SemanticNode__Group_6__0 )? ) ;
    public final void rule__SemanticNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1458:1: ( ( ( rule__SemanticNode__Group_6__0 )? ) )
            // InternalSemanticNodesDsl.g:1459:1: ( ( rule__SemanticNode__Group_6__0 )? )
            {
            // InternalSemanticNodesDsl.g:1459:1: ( ( rule__SemanticNode__Group_6__0 )? )
            // InternalSemanticNodesDsl.g:1460:2: ( rule__SemanticNode__Group_6__0 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_6()); 
            // InternalSemanticNodesDsl.g:1461:2: ( rule__SemanticNode__Group_6__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1461:3: rule__SemanticNode__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SemanticNode__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemanticNodeAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__6__Impl"


    // $ANTLR start "rule__SemanticNode__Group__7"
    // InternalSemanticNodesDsl.g:1469:1: rule__SemanticNode__Group__7 : rule__SemanticNode__Group__7__Impl rule__SemanticNode__Group__8 ;
    public final void rule__SemanticNode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1473:1: ( rule__SemanticNode__Group__7__Impl rule__SemanticNode__Group__8 )
            // InternalSemanticNodesDsl.g:1474:2: rule__SemanticNode__Group__7__Impl rule__SemanticNode__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__SemanticNode__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__7"


    // $ANTLR start "rule__SemanticNode__Group__7__Impl"
    // InternalSemanticNodesDsl.g:1481:1: rule__SemanticNode__Group__7__Impl : ( '}' ) ;
    public final void rule__SemanticNode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1485:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1486:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1486:1: ( '}' )
            // InternalSemanticNodesDsl.g:1487:2: '}'
            {
             before(grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__7__Impl"


    // $ANTLR start "rule__SemanticNode__Group__8"
    // InternalSemanticNodesDsl.g:1496:1: rule__SemanticNode__Group__8 : rule__SemanticNode__Group__8__Impl ;
    public final void rule__SemanticNode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1500:1: ( rule__SemanticNode__Group__8__Impl )
            // InternalSemanticNodesDsl.g:1501:2: rule__SemanticNode__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__8"


    // $ANTLR start "rule__SemanticNode__Group__8__Impl"
    // InternalSemanticNodesDsl.g:1507:1: rule__SemanticNode__Group__8__Impl : ( ( rule__SemanticNode__Group_8__0 )? ) ;
    public final void rule__SemanticNode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1511:1: ( ( ( rule__SemanticNode__Group_8__0 )? ) )
            // InternalSemanticNodesDsl.g:1512:1: ( ( rule__SemanticNode__Group_8__0 )? )
            {
            // InternalSemanticNodesDsl.g:1512:1: ( ( rule__SemanticNode__Group_8__0 )? )
            // InternalSemanticNodesDsl.g:1513:2: ( rule__SemanticNode__Group_8__0 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_8()); 
            // InternalSemanticNodesDsl.g:1514:2: ( rule__SemanticNode__Group_8__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1514:3: rule__SemanticNode__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SemanticNode__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemanticNodeAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group__8__Impl"


    // $ANTLR start "rule__SemanticNode__Group_1__0"
    // InternalSemanticNodesDsl.g:1523:1: rule__SemanticNode__Group_1__0 : rule__SemanticNode__Group_1__0__Impl rule__SemanticNode__Group_1__1 ;
    public final void rule__SemanticNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1527:1: ( rule__SemanticNode__Group_1__0__Impl rule__SemanticNode__Group_1__1 )
            // InternalSemanticNodesDsl.g:1528:2: rule__SemanticNode__Group_1__0__Impl rule__SemanticNode__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__SemanticNode__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_1__0"


    // $ANTLR start "rule__SemanticNode__Group_1__0__Impl"
    // InternalSemanticNodesDsl.g:1535:1: rule__SemanticNode__Group_1__0__Impl : ( ( rule__SemanticNode__AnnotationsAssignment_1_0 ) ) ;
    public final void rule__SemanticNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1539:1: ( ( ( rule__SemanticNode__AnnotationsAssignment_1_0 ) ) )
            // InternalSemanticNodesDsl.g:1540:1: ( ( rule__SemanticNode__AnnotationsAssignment_1_0 ) )
            {
            // InternalSemanticNodesDsl.g:1540:1: ( ( rule__SemanticNode__AnnotationsAssignment_1_0 ) )
            // InternalSemanticNodesDsl.g:1541:2: ( rule__SemanticNode__AnnotationsAssignment_1_0 )
            {
             before(grammarAccess.getSemanticNodeAccess().getAnnotationsAssignment_1_0()); 
            // InternalSemanticNodesDsl.g:1542:2: ( rule__SemanticNode__AnnotationsAssignment_1_0 )
            // InternalSemanticNodesDsl.g:1542:3: rule__SemanticNode__AnnotationsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__AnnotationsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getAnnotationsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_1__0__Impl"


    // $ANTLR start "rule__SemanticNode__Group_1__1"
    // InternalSemanticNodesDsl.g:1550:1: rule__SemanticNode__Group_1__1 : rule__SemanticNode__Group_1__1__Impl ;
    public final void rule__SemanticNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1554:1: ( rule__SemanticNode__Group_1__1__Impl )
            // InternalSemanticNodesDsl.g:1555:2: rule__SemanticNode__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_1__1"


    // $ANTLR start "rule__SemanticNode__Group_1__1__Impl"
    // InternalSemanticNodesDsl.g:1561:1: rule__SemanticNode__Group_1__1__Impl : ( ( rule__SemanticNode__AnnotationsAssignment_1_1 )* ) ;
    public final void rule__SemanticNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1565:1: ( ( ( rule__SemanticNode__AnnotationsAssignment_1_1 )* ) )
            // InternalSemanticNodesDsl.g:1566:1: ( ( rule__SemanticNode__AnnotationsAssignment_1_1 )* )
            {
            // InternalSemanticNodesDsl.g:1566:1: ( ( rule__SemanticNode__AnnotationsAssignment_1_1 )* )
            // InternalSemanticNodesDsl.g:1567:2: ( rule__SemanticNode__AnnotationsAssignment_1_1 )*
            {
             before(grammarAccess.getSemanticNodeAccess().getAnnotationsAssignment_1_1()); 
            // InternalSemanticNodesDsl.g:1568:2: ( rule__SemanticNode__AnnotationsAssignment_1_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1568:3: rule__SemanticNode__AnnotationsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SemanticNode__AnnotationsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSemanticNodeAccess().getAnnotationsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_1__1__Impl"


    // $ANTLR start "rule__SemanticNode__Group_6__0"
    // InternalSemanticNodesDsl.g:1577:1: rule__SemanticNode__Group_6__0 : rule__SemanticNode__Group_6__0__Impl rule__SemanticNode__Group_6__1 ;
    public final void rule__SemanticNode__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1581:1: ( rule__SemanticNode__Group_6__0__Impl rule__SemanticNode__Group_6__1 )
            // InternalSemanticNodesDsl.g:1582:2: rule__SemanticNode__Group_6__0__Impl rule__SemanticNode__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__SemanticNode__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_6__0"


    // $ANTLR start "rule__SemanticNode__Group_6__0__Impl"
    // InternalSemanticNodesDsl.g:1589:1: rule__SemanticNode__Group_6__0__Impl : ( ( rule__SemanticNode__PropertiesAssignment_6_0 ) ) ;
    public final void rule__SemanticNode__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1593:1: ( ( ( rule__SemanticNode__PropertiesAssignment_6_0 ) ) )
            // InternalSemanticNodesDsl.g:1594:1: ( ( rule__SemanticNode__PropertiesAssignment_6_0 ) )
            {
            // InternalSemanticNodesDsl.g:1594:1: ( ( rule__SemanticNode__PropertiesAssignment_6_0 ) )
            // InternalSemanticNodesDsl.g:1595:2: ( rule__SemanticNode__PropertiesAssignment_6_0 )
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_6_0()); 
            // InternalSemanticNodesDsl.g:1596:2: ( rule__SemanticNode__PropertiesAssignment_6_0 )
            // InternalSemanticNodesDsl.g:1596:3: rule__SemanticNode__PropertiesAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__PropertiesAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_6__0__Impl"


    // $ANTLR start "rule__SemanticNode__Group_6__1"
    // InternalSemanticNodesDsl.g:1604:1: rule__SemanticNode__Group_6__1 : rule__SemanticNode__Group_6__1__Impl ;
    public final void rule__SemanticNode__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1608:1: ( rule__SemanticNode__Group_6__1__Impl )
            // InternalSemanticNodesDsl.g:1609:2: rule__SemanticNode__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_6__1"


    // $ANTLR start "rule__SemanticNode__Group_6__1__Impl"
    // InternalSemanticNodesDsl.g:1615:1: rule__SemanticNode__Group_6__1__Impl : ( ( rule__SemanticNode__PropertiesAssignment_6_1 )* ) ;
    public final void rule__SemanticNode__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1619:1: ( ( ( rule__SemanticNode__PropertiesAssignment_6_1 )* ) )
            // InternalSemanticNodesDsl.g:1620:1: ( ( rule__SemanticNode__PropertiesAssignment_6_1 )* )
            {
            // InternalSemanticNodesDsl.g:1620:1: ( ( rule__SemanticNode__PropertiesAssignment_6_1 )* )
            // InternalSemanticNodesDsl.g:1621:2: ( rule__SemanticNode__PropertiesAssignment_6_1 )*
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_6_1()); 
            // InternalSemanticNodesDsl.g:1622:2: ( rule__SemanticNode__PropertiesAssignment_6_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_ID)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1622:3: rule__SemanticNode__PropertiesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__SemanticNode__PropertiesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_6__1__Impl"


    // $ANTLR start "rule__SemanticNode__Group_8__0"
    // InternalSemanticNodesDsl.g:1631:1: rule__SemanticNode__Group_8__0 : rule__SemanticNode__Group_8__0__Impl rule__SemanticNode__Group_8__1 ;
    public final void rule__SemanticNode__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1635:1: ( rule__SemanticNode__Group_8__0__Impl rule__SemanticNode__Group_8__1 )
            // InternalSemanticNodesDsl.g:1636:2: rule__SemanticNode__Group_8__0__Impl rule__SemanticNode__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__SemanticNode__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8__0"


    // $ANTLR start "rule__SemanticNode__Group_8__0__Impl"
    // InternalSemanticNodesDsl.g:1643:1: rule__SemanticNode__Group_8__0__Impl : ( '{' ) ;
    public final void rule__SemanticNode__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1647:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:1648:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:1648:1: ( '{' )
            // InternalSemanticNodesDsl.g:1649:2: '{'
            {
             before(grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_8_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8__0__Impl"


    // $ANTLR start "rule__SemanticNode__Group_8__1"
    // InternalSemanticNodesDsl.g:1658:1: rule__SemanticNode__Group_8__1 : rule__SemanticNode__Group_8__1__Impl rule__SemanticNode__Group_8__2 ;
    public final void rule__SemanticNode__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1662:1: ( rule__SemanticNode__Group_8__1__Impl rule__SemanticNode__Group_8__2 )
            // InternalSemanticNodesDsl.g:1663:2: rule__SemanticNode__Group_8__1__Impl rule__SemanticNode__Group_8__2
            {
            pushFollow(FOLLOW_16);
            rule__SemanticNode__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8__1"


    // $ANTLR start "rule__SemanticNode__Group_8__1__Impl"
    // InternalSemanticNodesDsl.g:1670:1: rule__SemanticNode__Group_8__1__Impl : ( ( rule__SemanticNode__MetadataAssignment_8_1 ) ) ;
    public final void rule__SemanticNode__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1674:1: ( ( ( rule__SemanticNode__MetadataAssignment_8_1 ) ) )
            // InternalSemanticNodesDsl.g:1675:1: ( ( rule__SemanticNode__MetadataAssignment_8_1 ) )
            {
            // InternalSemanticNodesDsl.g:1675:1: ( ( rule__SemanticNode__MetadataAssignment_8_1 ) )
            // InternalSemanticNodesDsl.g:1676:2: ( rule__SemanticNode__MetadataAssignment_8_1 )
            {
             before(grammarAccess.getSemanticNodeAccess().getMetadataAssignment_8_1()); 
            // InternalSemanticNodesDsl.g:1677:2: ( rule__SemanticNode__MetadataAssignment_8_1 )
            // InternalSemanticNodesDsl.g:1677:3: rule__SemanticNode__MetadataAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__MetadataAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getMetadataAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8__1__Impl"


    // $ANTLR start "rule__SemanticNode__Group_8__2"
    // InternalSemanticNodesDsl.g:1685:1: rule__SemanticNode__Group_8__2 : rule__SemanticNode__Group_8__2__Impl rule__SemanticNode__Group_8__3 ;
    public final void rule__SemanticNode__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1689:1: ( rule__SemanticNode__Group_8__2__Impl rule__SemanticNode__Group_8__3 )
            // InternalSemanticNodesDsl.g:1690:2: rule__SemanticNode__Group_8__2__Impl rule__SemanticNode__Group_8__3
            {
            pushFollow(FOLLOW_16);
            rule__SemanticNode__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8__2"


    // $ANTLR start "rule__SemanticNode__Group_8__2__Impl"
    // InternalSemanticNodesDsl.g:1697:1: rule__SemanticNode__Group_8__2__Impl : ( ( rule__SemanticNode__Group_8_2__0 )* ) ;
    public final void rule__SemanticNode__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1701:1: ( ( ( rule__SemanticNode__Group_8_2__0 )* ) )
            // InternalSemanticNodesDsl.g:1702:1: ( ( rule__SemanticNode__Group_8_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:1702:1: ( ( rule__SemanticNode__Group_8_2__0 )* )
            // InternalSemanticNodesDsl.g:1703:2: ( rule__SemanticNode__Group_8_2__0 )*
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_8_2()); 
            // InternalSemanticNodesDsl.g:1704:2: ( rule__SemanticNode__Group_8_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==20) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1704:3: rule__SemanticNode__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SemanticNode__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSemanticNodeAccess().getGroup_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8__2__Impl"


    // $ANTLR start "rule__SemanticNode__Group_8__3"
    // InternalSemanticNodesDsl.g:1712:1: rule__SemanticNode__Group_8__3 : rule__SemanticNode__Group_8__3__Impl ;
    public final void rule__SemanticNode__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1716:1: ( rule__SemanticNode__Group_8__3__Impl )
            // InternalSemanticNodesDsl.g:1717:2: rule__SemanticNode__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8__3"


    // $ANTLR start "rule__SemanticNode__Group_8__3__Impl"
    // InternalSemanticNodesDsl.g:1723:1: rule__SemanticNode__Group_8__3__Impl : ( '}' ) ;
    public final void rule__SemanticNode__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1727:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1728:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1728:1: ( '}' )
            // InternalSemanticNodesDsl.g:1729:2: '}'
            {
             before(grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_8_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8__3__Impl"


    // $ANTLR start "rule__SemanticNode__Group_8_2__0"
    // InternalSemanticNodesDsl.g:1739:1: rule__SemanticNode__Group_8_2__0 : rule__SemanticNode__Group_8_2__0__Impl rule__SemanticNode__Group_8_2__1 ;
    public final void rule__SemanticNode__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1743:1: ( rule__SemanticNode__Group_8_2__0__Impl rule__SemanticNode__Group_8_2__1 )
            // InternalSemanticNodesDsl.g:1744:2: rule__SemanticNode__Group_8_2__0__Impl rule__SemanticNode__Group_8_2__1
            {
            pushFollow(FOLLOW_5);
            rule__SemanticNode__Group_8_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_8_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8_2__0"


    // $ANTLR start "rule__SemanticNode__Group_8_2__0__Impl"
    // InternalSemanticNodesDsl.g:1751:1: rule__SemanticNode__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__SemanticNode__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1755:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:1756:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:1756:1: ( ',' )
            // InternalSemanticNodesDsl.g:1757:2: ','
            {
             before(grammarAccess.getSemanticNodeAccess().getCommaKeyword_8_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getCommaKeyword_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8_2__0__Impl"


    // $ANTLR start "rule__SemanticNode__Group_8_2__1"
    // InternalSemanticNodesDsl.g:1766:1: rule__SemanticNode__Group_8_2__1 : rule__SemanticNode__Group_8_2__1__Impl ;
    public final void rule__SemanticNode__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1770:1: ( rule__SemanticNode__Group_8_2__1__Impl )
            // InternalSemanticNodesDsl.g:1771:2: rule__SemanticNode__Group_8_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_8_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8_2__1"


    // $ANTLR start "rule__SemanticNode__Group_8_2__1__Impl"
    // InternalSemanticNodesDsl.g:1777:1: rule__SemanticNode__Group_8_2__1__Impl : ( ( rule__SemanticNode__MetadataAssignment_8_2_1 ) ) ;
    public final void rule__SemanticNode__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1781:1: ( ( ( rule__SemanticNode__MetadataAssignment_8_2_1 ) ) )
            // InternalSemanticNodesDsl.g:1782:1: ( ( rule__SemanticNode__MetadataAssignment_8_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:1782:1: ( ( rule__SemanticNode__MetadataAssignment_8_2_1 ) )
            // InternalSemanticNodesDsl.g:1783:2: ( rule__SemanticNode__MetadataAssignment_8_2_1 )
            {
             before(grammarAccess.getSemanticNodeAccess().getMetadataAssignment_8_2_1()); 
            // InternalSemanticNodesDsl.g:1784:2: ( rule__SemanticNode__MetadataAssignment_8_2_1 )
            // InternalSemanticNodesDsl.g:1784:3: rule__SemanticNode__MetadataAssignment_8_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__MetadataAssignment_8_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getMetadataAssignment_8_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_8_2__1__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__0"
    // InternalSemanticNodesDsl.g:1793:1: rule__ObjectProperty__Group__0 : rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 ;
    public final void rule__ObjectProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1797:1: ( rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 )
            // InternalSemanticNodesDsl.g:1798:2: rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ObjectProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__0"


    // $ANTLR start "rule__ObjectProperty__Group__0__Impl"
    // InternalSemanticNodesDsl.g:1805:1: rule__ObjectProperty__Group__0__Impl : ( () ) ;
    public final void rule__ObjectProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1809:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:1810:1: ( () )
            {
            // InternalSemanticNodesDsl.g:1810:1: ( () )
            // InternalSemanticNodesDsl.g:1811:2: ()
            {
             before(grammarAccess.getObjectPropertyAccess().getObjectPropertyAction_0()); 
            // InternalSemanticNodesDsl.g:1812:2: ()
            // InternalSemanticNodesDsl.g:1812:3: 
            {
            }

             after(grammarAccess.getObjectPropertyAccess().getObjectPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__0__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__1"
    // InternalSemanticNodesDsl.g:1820:1: rule__ObjectProperty__Group__1 : rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 ;
    public final void rule__ObjectProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1824:1: ( rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 )
            // InternalSemanticNodesDsl.g:1825:2: rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ObjectProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__1"


    // $ANTLR start "rule__ObjectProperty__Group__1__Impl"
    // InternalSemanticNodesDsl.g:1832:1: rule__ObjectProperty__Group__1__Impl : ( ( rule__ObjectProperty__NameAssignment_1 ) ) ;
    public final void rule__ObjectProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1836:1: ( ( ( rule__ObjectProperty__NameAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:1837:1: ( ( rule__ObjectProperty__NameAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:1837:1: ( ( rule__ObjectProperty__NameAssignment_1 ) )
            // InternalSemanticNodesDsl.g:1838:2: ( rule__ObjectProperty__NameAssignment_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getNameAssignment_1()); 
            // InternalSemanticNodesDsl.g:1839:2: ( rule__ObjectProperty__NameAssignment_1 )
            // InternalSemanticNodesDsl.g:1839:3: rule__ObjectProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__1__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__2"
    // InternalSemanticNodesDsl.g:1847:1: rule__ObjectProperty__Group__2 : rule__ObjectProperty__Group__2__Impl rule__ObjectProperty__Group__3 ;
    public final void rule__ObjectProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1851:1: ( rule__ObjectProperty__Group__2__Impl rule__ObjectProperty__Group__3 )
            // InternalSemanticNodesDsl.g:1852:2: rule__ObjectProperty__Group__2__Impl rule__ObjectProperty__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ObjectProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__2"


    // $ANTLR start "rule__ObjectProperty__Group__2__Impl"
    // InternalSemanticNodesDsl.g:1859:1: rule__ObjectProperty__Group__2__Impl : ( '->' ) ;
    public final void rule__ObjectProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1863:1: ( ( '->' ) )
            // InternalSemanticNodesDsl.g:1864:1: ( '->' )
            {
            // InternalSemanticNodesDsl.g:1864:1: ( '->' )
            // InternalSemanticNodesDsl.g:1865:2: '->'
            {
             before(grammarAccess.getObjectPropertyAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getObjectPropertyAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__2__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__3"
    // InternalSemanticNodesDsl.g:1874:1: rule__ObjectProperty__Group__3 : rule__ObjectProperty__Group__3__Impl rule__ObjectProperty__Group__4 ;
    public final void rule__ObjectProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1878:1: ( rule__ObjectProperty__Group__3__Impl rule__ObjectProperty__Group__4 )
            // InternalSemanticNodesDsl.g:1879:2: rule__ObjectProperty__Group__3__Impl rule__ObjectProperty__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__ObjectProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__3"


    // $ANTLR start "rule__ObjectProperty__Group__3__Impl"
    // InternalSemanticNodesDsl.g:1886:1: rule__ObjectProperty__Group__3__Impl : ( ( rule__ObjectProperty__RangeAssignment_3 ) ) ;
    public final void rule__ObjectProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1890:1: ( ( ( rule__ObjectProperty__RangeAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:1891:1: ( ( rule__ObjectProperty__RangeAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:1891:1: ( ( rule__ObjectProperty__RangeAssignment_3 ) )
            // InternalSemanticNodesDsl.g:1892:2: ( rule__ObjectProperty__RangeAssignment_3 )
            {
             before(grammarAccess.getObjectPropertyAccess().getRangeAssignment_3()); 
            // InternalSemanticNodesDsl.g:1893:2: ( rule__ObjectProperty__RangeAssignment_3 )
            // InternalSemanticNodesDsl.g:1893:3: rule__ObjectProperty__RangeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__RangeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getRangeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__3__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__4"
    // InternalSemanticNodesDsl.g:1901:1: rule__ObjectProperty__Group__4 : rule__ObjectProperty__Group__4__Impl rule__ObjectProperty__Group__5 ;
    public final void rule__ObjectProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1905:1: ( rule__ObjectProperty__Group__4__Impl rule__ObjectProperty__Group__5 )
            // InternalSemanticNodesDsl.g:1906:2: rule__ObjectProperty__Group__4__Impl rule__ObjectProperty__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__ObjectProperty__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__4"


    // $ANTLR start "rule__ObjectProperty__Group__4__Impl"
    // InternalSemanticNodesDsl.g:1913:1: rule__ObjectProperty__Group__4__Impl : ( ( rule__ObjectProperty__Group_4__0 )? ) ;
    public final void rule__ObjectProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1917:1: ( ( ( rule__ObjectProperty__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:1918:1: ( ( rule__ObjectProperty__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:1918:1: ( ( rule__ObjectProperty__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:1919:2: ( rule__ObjectProperty__Group_4__0 )?
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:1920:2: ( rule__ObjectProperty__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1920:3: rule__ObjectProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectProperty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__4__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__5"
    // InternalSemanticNodesDsl.g:1928:1: rule__ObjectProperty__Group__5 : rule__ObjectProperty__Group__5__Impl ;
    public final void rule__ObjectProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1932:1: ( rule__ObjectProperty__Group__5__Impl )
            // InternalSemanticNodesDsl.g:1933:2: rule__ObjectProperty__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__5"


    // $ANTLR start "rule__ObjectProperty__Group__5__Impl"
    // InternalSemanticNodesDsl.g:1939:1: rule__ObjectProperty__Group__5__Impl : ( ( rule__ObjectProperty__Group_5__0 )? ) ;
    public final void rule__ObjectProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1943:1: ( ( ( rule__ObjectProperty__Group_5__0 )? ) )
            // InternalSemanticNodesDsl.g:1944:1: ( ( rule__ObjectProperty__Group_5__0 )? )
            {
            // InternalSemanticNodesDsl.g:1944:1: ( ( rule__ObjectProperty__Group_5__0 )? )
            // InternalSemanticNodesDsl.g:1945:2: ( rule__ObjectProperty__Group_5__0 )?
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup_5()); 
            // InternalSemanticNodesDsl.g:1946:2: ( rule__ObjectProperty__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1946:3: rule__ObjectProperty__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ObjectProperty__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObjectPropertyAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group__5__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_4__0"
    // InternalSemanticNodesDsl.g:1955:1: rule__ObjectProperty__Group_4__0 : rule__ObjectProperty__Group_4__0__Impl rule__ObjectProperty__Group_4__1 ;
    public final void rule__ObjectProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1959:1: ( rule__ObjectProperty__Group_4__0__Impl rule__ObjectProperty__Group_4__1 )
            // InternalSemanticNodesDsl.g:1960:2: rule__ObjectProperty__Group_4__0__Impl rule__ObjectProperty__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__ObjectProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__0"


    // $ANTLR start "rule__ObjectProperty__Group_4__0__Impl"
    // InternalSemanticNodesDsl.g:1967:1: rule__ObjectProperty__Group_4__0__Impl : ( '[' ) ;
    public final void rule__ObjectProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1971:1: ( ( '[' ) )
            // InternalSemanticNodesDsl.g:1972:1: ( '[' )
            {
            // InternalSemanticNodesDsl.g:1972:1: ( '[' )
            // InternalSemanticNodesDsl.g:1973:2: '['
            {
             before(grammarAccess.getObjectPropertyAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObjectPropertyAccess().getLeftSquareBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__0__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_4__1"
    // InternalSemanticNodesDsl.g:1982:1: rule__ObjectProperty__Group_4__1 : rule__ObjectProperty__Group_4__1__Impl rule__ObjectProperty__Group_4__2 ;
    public final void rule__ObjectProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1986:1: ( rule__ObjectProperty__Group_4__1__Impl rule__ObjectProperty__Group_4__2 )
            // InternalSemanticNodesDsl.g:1987:2: rule__ObjectProperty__Group_4__1__Impl rule__ObjectProperty__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__ObjectProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__1"


    // $ANTLR start "rule__ObjectProperty__Group_4__1__Impl"
    // InternalSemanticNodesDsl.g:1994:1: rule__ObjectProperty__Group_4__1__Impl : ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__ObjectProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1998:1: ( ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) ) )
            // InternalSemanticNodesDsl.g:1999:1: ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) )
            {
            // InternalSemanticNodesDsl.g:1999:1: ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) )
            // InternalSemanticNodesDsl.g:2000:2: ( rule__ObjectProperty__LowerBoundAssignment_4_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getLowerBoundAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:2001:2: ( rule__ObjectProperty__LowerBoundAssignment_4_1 )
            // InternalSemanticNodesDsl.g:2001:3: rule__ObjectProperty__LowerBoundAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__LowerBoundAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getLowerBoundAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__1__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_4__2"
    // InternalSemanticNodesDsl.g:2009:1: rule__ObjectProperty__Group_4__2 : rule__ObjectProperty__Group_4__2__Impl rule__ObjectProperty__Group_4__3 ;
    public final void rule__ObjectProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2013:1: ( rule__ObjectProperty__Group_4__2__Impl rule__ObjectProperty__Group_4__3 )
            // InternalSemanticNodesDsl.g:2014:2: rule__ObjectProperty__Group_4__2__Impl rule__ObjectProperty__Group_4__3
            {
            pushFollow(FOLLOW_22);
            rule__ObjectProperty__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__2"


    // $ANTLR start "rule__ObjectProperty__Group_4__2__Impl"
    // InternalSemanticNodesDsl.g:2021:1: rule__ObjectProperty__Group_4__2__Impl : ( ',' ) ;
    public final void rule__ObjectProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2025:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2026:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2026:1: ( ',' )
            // InternalSemanticNodesDsl.g:2027:2: ','
            {
             before(grammarAccess.getObjectPropertyAccess().getCommaKeyword_4_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getObjectPropertyAccess().getCommaKeyword_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__2__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_4__3"
    // InternalSemanticNodesDsl.g:2036:1: rule__ObjectProperty__Group_4__3 : rule__ObjectProperty__Group_4__3__Impl rule__ObjectProperty__Group_4__4 ;
    public final void rule__ObjectProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2040:1: ( rule__ObjectProperty__Group_4__3__Impl rule__ObjectProperty__Group_4__4 )
            // InternalSemanticNodesDsl.g:2041:2: rule__ObjectProperty__Group_4__3__Impl rule__ObjectProperty__Group_4__4
            {
            pushFollow(FOLLOW_24);
            rule__ObjectProperty__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__3"


    // $ANTLR start "rule__ObjectProperty__Group_4__3__Impl"
    // InternalSemanticNodesDsl.g:2048:1: rule__ObjectProperty__Group_4__3__Impl : ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__ObjectProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2052:1: ( ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) ) )
            // InternalSemanticNodesDsl.g:2053:1: ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) )
            {
            // InternalSemanticNodesDsl.g:2053:1: ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) )
            // InternalSemanticNodesDsl.g:2054:2: ( rule__ObjectProperty__UpperBoundAssignment_4_3 )
            {
             before(grammarAccess.getObjectPropertyAccess().getUpperBoundAssignment_4_3()); 
            // InternalSemanticNodesDsl.g:2055:2: ( rule__ObjectProperty__UpperBoundAssignment_4_3 )
            // InternalSemanticNodesDsl.g:2055:3: rule__ObjectProperty__UpperBoundAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__UpperBoundAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getUpperBoundAssignment_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__3__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_4__4"
    // InternalSemanticNodesDsl.g:2063:1: rule__ObjectProperty__Group_4__4 : rule__ObjectProperty__Group_4__4__Impl ;
    public final void rule__ObjectProperty__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2067:1: ( rule__ObjectProperty__Group_4__4__Impl )
            // InternalSemanticNodesDsl.g:2068:2: rule__ObjectProperty__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__4"


    // $ANTLR start "rule__ObjectProperty__Group_4__4__Impl"
    // InternalSemanticNodesDsl.g:2074:1: rule__ObjectProperty__Group_4__4__Impl : ( ']' ) ;
    public final void rule__ObjectProperty__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2078:1: ( ( ']' ) )
            // InternalSemanticNodesDsl.g:2079:1: ( ']' )
            {
            // InternalSemanticNodesDsl.g:2079:1: ( ']' )
            // InternalSemanticNodesDsl.g:2080:2: ']'
            {
             before(grammarAccess.getObjectPropertyAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getObjectPropertyAccess().getRightSquareBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_4__4__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_5__0"
    // InternalSemanticNodesDsl.g:2090:1: rule__ObjectProperty__Group_5__0 : rule__ObjectProperty__Group_5__0__Impl rule__ObjectProperty__Group_5__1 ;
    public final void rule__ObjectProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2094:1: ( rule__ObjectProperty__Group_5__0__Impl rule__ObjectProperty__Group_5__1 )
            // InternalSemanticNodesDsl.g:2095:2: rule__ObjectProperty__Group_5__0__Impl rule__ObjectProperty__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__ObjectProperty__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5__0"


    // $ANTLR start "rule__ObjectProperty__Group_5__0__Impl"
    // InternalSemanticNodesDsl.g:2102:1: rule__ObjectProperty__Group_5__0__Impl : ( '{' ) ;
    public final void rule__ObjectProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2106:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:2107:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:2107:1: ( '{' )
            // InternalSemanticNodesDsl.g:2108:2: '{'
            {
             before(grammarAccess.getObjectPropertyAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getObjectPropertyAccess().getLeftCurlyBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5__0__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_5__1"
    // InternalSemanticNodesDsl.g:2117:1: rule__ObjectProperty__Group_5__1 : rule__ObjectProperty__Group_5__1__Impl rule__ObjectProperty__Group_5__2 ;
    public final void rule__ObjectProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2121:1: ( rule__ObjectProperty__Group_5__1__Impl rule__ObjectProperty__Group_5__2 )
            // InternalSemanticNodesDsl.g:2122:2: rule__ObjectProperty__Group_5__1__Impl rule__ObjectProperty__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__ObjectProperty__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5__1"


    // $ANTLR start "rule__ObjectProperty__Group_5__1__Impl"
    // InternalSemanticNodesDsl.g:2129:1: rule__ObjectProperty__Group_5__1__Impl : ( ( rule__ObjectProperty__MetadataAssignment_5_1 ) ) ;
    public final void rule__ObjectProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2133:1: ( ( ( rule__ObjectProperty__MetadataAssignment_5_1 ) ) )
            // InternalSemanticNodesDsl.g:2134:1: ( ( rule__ObjectProperty__MetadataAssignment_5_1 ) )
            {
            // InternalSemanticNodesDsl.g:2134:1: ( ( rule__ObjectProperty__MetadataAssignment_5_1 ) )
            // InternalSemanticNodesDsl.g:2135:2: ( rule__ObjectProperty__MetadataAssignment_5_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getMetadataAssignment_5_1()); 
            // InternalSemanticNodesDsl.g:2136:2: ( rule__ObjectProperty__MetadataAssignment_5_1 )
            // InternalSemanticNodesDsl.g:2136:3: rule__ObjectProperty__MetadataAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__MetadataAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getMetadataAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5__1__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_5__2"
    // InternalSemanticNodesDsl.g:2144:1: rule__ObjectProperty__Group_5__2 : rule__ObjectProperty__Group_5__2__Impl rule__ObjectProperty__Group_5__3 ;
    public final void rule__ObjectProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2148:1: ( rule__ObjectProperty__Group_5__2__Impl rule__ObjectProperty__Group_5__3 )
            // InternalSemanticNodesDsl.g:2149:2: rule__ObjectProperty__Group_5__2__Impl rule__ObjectProperty__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__ObjectProperty__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5__2"


    // $ANTLR start "rule__ObjectProperty__Group_5__2__Impl"
    // InternalSemanticNodesDsl.g:2156:1: rule__ObjectProperty__Group_5__2__Impl : ( ( rule__ObjectProperty__Group_5_2__0 )* ) ;
    public final void rule__ObjectProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2160:1: ( ( ( rule__ObjectProperty__Group_5_2__0 )* ) )
            // InternalSemanticNodesDsl.g:2161:1: ( ( rule__ObjectProperty__Group_5_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:2161:1: ( ( rule__ObjectProperty__Group_5_2__0 )* )
            // InternalSemanticNodesDsl.g:2162:2: ( rule__ObjectProperty__Group_5_2__0 )*
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup_5_2()); 
            // InternalSemanticNodesDsl.g:2163:2: ( rule__ObjectProperty__Group_5_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:2163:3: rule__ObjectProperty__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ObjectProperty__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getObjectPropertyAccess().getGroup_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5__2__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_5__3"
    // InternalSemanticNodesDsl.g:2171:1: rule__ObjectProperty__Group_5__3 : rule__ObjectProperty__Group_5__3__Impl ;
    public final void rule__ObjectProperty__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2175:1: ( rule__ObjectProperty__Group_5__3__Impl )
            // InternalSemanticNodesDsl.g:2176:2: rule__ObjectProperty__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5__3"


    // $ANTLR start "rule__ObjectProperty__Group_5__3__Impl"
    // InternalSemanticNodesDsl.g:2182:1: rule__ObjectProperty__Group_5__3__Impl : ( '}' ) ;
    public final void rule__ObjectProperty__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2186:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:2187:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:2187:1: ( '}' )
            // InternalSemanticNodesDsl.g:2188:2: '}'
            {
             before(grammarAccess.getObjectPropertyAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getObjectPropertyAccess().getRightCurlyBracketKeyword_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5__3__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_5_2__0"
    // InternalSemanticNodesDsl.g:2198:1: rule__ObjectProperty__Group_5_2__0 : rule__ObjectProperty__Group_5_2__0__Impl rule__ObjectProperty__Group_5_2__1 ;
    public final void rule__ObjectProperty__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2202:1: ( rule__ObjectProperty__Group_5_2__0__Impl rule__ObjectProperty__Group_5_2__1 )
            // InternalSemanticNodesDsl.g:2203:2: rule__ObjectProperty__Group_5_2__0__Impl rule__ObjectProperty__Group_5_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ObjectProperty__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5_2__0"


    // $ANTLR start "rule__ObjectProperty__Group_5_2__0__Impl"
    // InternalSemanticNodesDsl.g:2210:1: rule__ObjectProperty__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ObjectProperty__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2214:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2215:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2215:1: ( ',' )
            // InternalSemanticNodesDsl.g:2216:2: ','
            {
             before(grammarAccess.getObjectPropertyAccess().getCommaKeyword_5_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getObjectPropertyAccess().getCommaKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5_2__0__Impl"


    // $ANTLR start "rule__ObjectProperty__Group_5_2__1"
    // InternalSemanticNodesDsl.g:2225:1: rule__ObjectProperty__Group_5_2__1 : rule__ObjectProperty__Group_5_2__1__Impl ;
    public final void rule__ObjectProperty__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2229:1: ( rule__ObjectProperty__Group_5_2__1__Impl )
            // InternalSemanticNodesDsl.g:2230:2: rule__ObjectProperty__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5_2__1"


    // $ANTLR start "rule__ObjectProperty__Group_5_2__1__Impl"
    // InternalSemanticNodesDsl.g:2236:1: rule__ObjectProperty__Group_5_2__1__Impl : ( ( rule__ObjectProperty__MetadataAssignment_5_2_1 ) ) ;
    public final void rule__ObjectProperty__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2240:1: ( ( ( rule__ObjectProperty__MetadataAssignment_5_2_1 ) ) )
            // InternalSemanticNodesDsl.g:2241:1: ( ( rule__ObjectProperty__MetadataAssignment_5_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:2241:1: ( ( rule__ObjectProperty__MetadataAssignment_5_2_1 ) )
            // InternalSemanticNodesDsl.g:2242:2: ( rule__ObjectProperty__MetadataAssignment_5_2_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getMetadataAssignment_5_2_1()); 
            // InternalSemanticNodesDsl.g:2243:2: ( rule__ObjectProperty__MetadataAssignment_5_2_1 )
            // InternalSemanticNodesDsl.g:2243:3: rule__ObjectProperty__MetadataAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__MetadataAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getMetadataAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__Group_5_2__1__Impl"


    // $ANTLR start "rule__DataProperty__Group__0"
    // InternalSemanticNodesDsl.g:2252:1: rule__DataProperty__Group__0 : rule__DataProperty__Group__0__Impl rule__DataProperty__Group__1 ;
    public final void rule__DataProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2256:1: ( rule__DataProperty__Group__0__Impl rule__DataProperty__Group__1 )
            // InternalSemanticNodesDsl.g:2257:2: rule__DataProperty__Group__0__Impl rule__DataProperty__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__0"


    // $ANTLR start "rule__DataProperty__Group__0__Impl"
    // InternalSemanticNodesDsl.g:2264:1: rule__DataProperty__Group__0__Impl : ( () ) ;
    public final void rule__DataProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2268:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:2269:1: ( () )
            {
            // InternalSemanticNodesDsl.g:2269:1: ( () )
            // InternalSemanticNodesDsl.g:2270:2: ()
            {
             before(grammarAccess.getDataPropertyAccess().getDataPropertyAction_0()); 
            // InternalSemanticNodesDsl.g:2271:2: ()
            // InternalSemanticNodesDsl.g:2271:3: 
            {
            }

             after(grammarAccess.getDataPropertyAccess().getDataPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__0__Impl"


    // $ANTLR start "rule__DataProperty__Group__1"
    // InternalSemanticNodesDsl.g:2279:1: rule__DataProperty__Group__1 : rule__DataProperty__Group__1__Impl rule__DataProperty__Group__2 ;
    public final void rule__DataProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2283:1: ( rule__DataProperty__Group__1__Impl rule__DataProperty__Group__2 )
            // InternalSemanticNodesDsl.g:2284:2: rule__DataProperty__Group__1__Impl rule__DataProperty__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__DataProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__1"


    // $ANTLR start "rule__DataProperty__Group__1__Impl"
    // InternalSemanticNodesDsl.g:2291:1: rule__DataProperty__Group__1__Impl : ( ( rule__DataProperty__NameAssignment_1 ) ) ;
    public final void rule__DataProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2295:1: ( ( ( rule__DataProperty__NameAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:2296:1: ( ( rule__DataProperty__NameAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:2296:1: ( ( rule__DataProperty__NameAssignment_1 ) )
            // InternalSemanticNodesDsl.g:2297:2: ( rule__DataProperty__NameAssignment_1 )
            {
             before(grammarAccess.getDataPropertyAccess().getNameAssignment_1()); 
            // InternalSemanticNodesDsl.g:2298:2: ( rule__DataProperty__NameAssignment_1 )
            // InternalSemanticNodesDsl.g:2298:3: rule__DataProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__1__Impl"


    // $ANTLR start "rule__DataProperty__Group__2"
    // InternalSemanticNodesDsl.g:2306:1: rule__DataProperty__Group__2 : rule__DataProperty__Group__2__Impl rule__DataProperty__Group__3 ;
    public final void rule__DataProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2310:1: ( rule__DataProperty__Group__2__Impl rule__DataProperty__Group__3 )
            // InternalSemanticNodesDsl.g:2311:2: rule__DataProperty__Group__2__Impl rule__DataProperty__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__DataProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__2"


    // $ANTLR start "rule__DataProperty__Group__2__Impl"
    // InternalSemanticNodesDsl.g:2318:1: rule__DataProperty__Group__2__Impl : ( ( rule__DataProperty__Group_2__0 ) ) ;
    public final void rule__DataProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2322:1: ( ( ( rule__DataProperty__Group_2__0 ) ) )
            // InternalSemanticNodesDsl.g:2323:1: ( ( rule__DataProperty__Group_2__0 ) )
            {
            // InternalSemanticNodesDsl.g:2323:1: ( ( rule__DataProperty__Group_2__0 ) )
            // InternalSemanticNodesDsl.g:2324:2: ( rule__DataProperty__Group_2__0 )
            {
             before(grammarAccess.getDataPropertyAccess().getGroup_2()); 
            // InternalSemanticNodesDsl.g:2325:2: ( rule__DataProperty__Group_2__0 )
            // InternalSemanticNodesDsl.g:2325:3: rule__DataProperty__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getDataPropertyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__2__Impl"


    // $ANTLR start "rule__DataProperty__Group__3"
    // InternalSemanticNodesDsl.g:2333:1: rule__DataProperty__Group__3 : rule__DataProperty__Group__3__Impl rule__DataProperty__Group__4 ;
    public final void rule__DataProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2337:1: ( rule__DataProperty__Group__3__Impl rule__DataProperty__Group__4 )
            // InternalSemanticNodesDsl.g:2338:2: rule__DataProperty__Group__3__Impl rule__DataProperty__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__DataProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__3"


    // $ANTLR start "rule__DataProperty__Group__3__Impl"
    // InternalSemanticNodesDsl.g:2345:1: rule__DataProperty__Group__3__Impl : ( ( rule__DataProperty__Group_3__0 )? ) ;
    public final void rule__DataProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2349:1: ( ( ( rule__DataProperty__Group_3__0 )? ) )
            // InternalSemanticNodesDsl.g:2350:1: ( ( rule__DataProperty__Group_3__0 )? )
            {
            // InternalSemanticNodesDsl.g:2350:1: ( ( rule__DataProperty__Group_3__0 )? )
            // InternalSemanticNodesDsl.g:2351:2: ( rule__DataProperty__Group_3__0 )?
            {
             before(grammarAccess.getDataPropertyAccess().getGroup_3()); 
            // InternalSemanticNodesDsl.g:2352:2: ( rule__DataProperty__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2352:3: rule__DataProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataProperty__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__3__Impl"


    // $ANTLR start "rule__DataProperty__Group__4"
    // InternalSemanticNodesDsl.g:2360:1: rule__DataProperty__Group__4 : rule__DataProperty__Group__4__Impl ;
    public final void rule__DataProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2364:1: ( rule__DataProperty__Group__4__Impl )
            // InternalSemanticNodesDsl.g:2365:2: rule__DataProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__4"


    // $ANTLR start "rule__DataProperty__Group__4__Impl"
    // InternalSemanticNodesDsl.g:2371:1: rule__DataProperty__Group__4__Impl : ( ( rule__DataProperty__Group_4__0 )? ) ;
    public final void rule__DataProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2375:1: ( ( ( rule__DataProperty__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:2376:1: ( ( rule__DataProperty__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:2376:1: ( ( rule__DataProperty__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:2377:2: ( rule__DataProperty__Group_4__0 )?
            {
             before(grammarAccess.getDataPropertyAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:2378:2: ( rule__DataProperty__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==17) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2378:3: rule__DataProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DataProperty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group__4__Impl"


    // $ANTLR start "rule__DataProperty__Group_2__0"
    // InternalSemanticNodesDsl.g:2387:1: rule__DataProperty__Group_2__0 : rule__DataProperty__Group_2__0__Impl rule__DataProperty__Group_2__1 ;
    public final void rule__DataProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2391:1: ( rule__DataProperty__Group_2__0__Impl rule__DataProperty__Group_2__1 )
            // InternalSemanticNodesDsl.g:2392:2: rule__DataProperty__Group_2__0__Impl rule__DataProperty__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__DataProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_2__0"


    // $ANTLR start "rule__DataProperty__Group_2__0__Impl"
    // InternalSemanticNodesDsl.g:2399:1: rule__DataProperty__Group_2__0__Impl : ( ':' ) ;
    public final void rule__DataProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2403:1: ( ( ':' ) )
            // InternalSemanticNodesDsl.g:2404:1: ( ':' )
            {
            // InternalSemanticNodesDsl.g:2404:1: ( ':' )
            // InternalSemanticNodesDsl.g:2405:2: ':'
            {
             before(grammarAccess.getDataPropertyAccess().getColonKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataPropertyAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_2__0__Impl"


    // $ANTLR start "rule__DataProperty__Group_2__1"
    // InternalSemanticNodesDsl.g:2414:1: rule__DataProperty__Group_2__1 : rule__DataProperty__Group_2__1__Impl ;
    public final void rule__DataProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2418:1: ( rule__DataProperty__Group_2__1__Impl )
            // InternalSemanticNodesDsl.g:2419:2: rule__DataProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_2__1"


    // $ANTLR start "rule__DataProperty__Group_2__1__Impl"
    // InternalSemanticNodesDsl.g:2425:1: rule__DataProperty__Group_2__1__Impl : ( ( rule__DataProperty__TypeAssignment_2_1 ) ) ;
    public final void rule__DataProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2429:1: ( ( ( rule__DataProperty__TypeAssignment_2_1 ) ) )
            // InternalSemanticNodesDsl.g:2430:1: ( ( rule__DataProperty__TypeAssignment_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:2430:1: ( ( rule__DataProperty__TypeAssignment_2_1 ) )
            // InternalSemanticNodesDsl.g:2431:2: ( rule__DataProperty__TypeAssignment_2_1 )
            {
             before(grammarAccess.getDataPropertyAccess().getTypeAssignment_2_1()); 
            // InternalSemanticNodesDsl.g:2432:2: ( rule__DataProperty__TypeAssignment_2_1 )
            // InternalSemanticNodesDsl.g:2432:3: rule__DataProperty__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataPropertyAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_2__1__Impl"


    // $ANTLR start "rule__DataProperty__Group_3__0"
    // InternalSemanticNodesDsl.g:2441:1: rule__DataProperty__Group_3__0 : rule__DataProperty__Group_3__0__Impl rule__DataProperty__Group_3__1 ;
    public final void rule__DataProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2445:1: ( rule__DataProperty__Group_3__0__Impl rule__DataProperty__Group_3__1 )
            // InternalSemanticNodesDsl.g:2446:2: rule__DataProperty__Group_3__0__Impl rule__DataProperty__Group_3__1
            {
            pushFollow(FOLLOW_22);
            rule__DataProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__0"


    // $ANTLR start "rule__DataProperty__Group_3__0__Impl"
    // InternalSemanticNodesDsl.g:2453:1: rule__DataProperty__Group_3__0__Impl : ( '[' ) ;
    public final void rule__DataProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2457:1: ( ( '[' ) )
            // InternalSemanticNodesDsl.g:2458:1: ( '[' )
            {
            // InternalSemanticNodesDsl.g:2458:1: ( '[' )
            // InternalSemanticNodesDsl.g:2459:2: '['
            {
             before(grammarAccess.getDataPropertyAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDataPropertyAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__0__Impl"


    // $ANTLR start "rule__DataProperty__Group_3__1"
    // InternalSemanticNodesDsl.g:2468:1: rule__DataProperty__Group_3__1 : rule__DataProperty__Group_3__1__Impl rule__DataProperty__Group_3__2 ;
    public final void rule__DataProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2472:1: ( rule__DataProperty__Group_3__1__Impl rule__DataProperty__Group_3__2 )
            // InternalSemanticNodesDsl.g:2473:2: rule__DataProperty__Group_3__1__Impl rule__DataProperty__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__DataProperty__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__1"


    // $ANTLR start "rule__DataProperty__Group_3__1__Impl"
    // InternalSemanticNodesDsl.g:2480:1: rule__DataProperty__Group_3__1__Impl : ( ( rule__DataProperty__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__DataProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2484:1: ( ( ( rule__DataProperty__LowerBoundAssignment_3_1 ) ) )
            // InternalSemanticNodesDsl.g:2485:1: ( ( rule__DataProperty__LowerBoundAssignment_3_1 ) )
            {
            // InternalSemanticNodesDsl.g:2485:1: ( ( rule__DataProperty__LowerBoundAssignment_3_1 ) )
            // InternalSemanticNodesDsl.g:2486:2: ( rule__DataProperty__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getDataPropertyAccess().getLowerBoundAssignment_3_1()); 
            // InternalSemanticNodesDsl.g:2487:2: ( rule__DataProperty__LowerBoundAssignment_3_1 )
            // InternalSemanticNodesDsl.g:2487:3: rule__DataProperty__LowerBoundAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__LowerBoundAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDataPropertyAccess().getLowerBoundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__1__Impl"


    // $ANTLR start "rule__DataProperty__Group_3__2"
    // InternalSemanticNodesDsl.g:2495:1: rule__DataProperty__Group_3__2 : rule__DataProperty__Group_3__2__Impl rule__DataProperty__Group_3__3 ;
    public final void rule__DataProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2499:1: ( rule__DataProperty__Group_3__2__Impl rule__DataProperty__Group_3__3 )
            // InternalSemanticNodesDsl.g:2500:2: rule__DataProperty__Group_3__2__Impl rule__DataProperty__Group_3__3
            {
            pushFollow(FOLLOW_22);
            rule__DataProperty__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__2"


    // $ANTLR start "rule__DataProperty__Group_3__2__Impl"
    // InternalSemanticNodesDsl.g:2507:1: rule__DataProperty__Group_3__2__Impl : ( ',' ) ;
    public final void rule__DataProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2511:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2512:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2512:1: ( ',' )
            // InternalSemanticNodesDsl.g:2513:2: ','
            {
             before(grammarAccess.getDataPropertyAccess().getCommaKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataPropertyAccess().getCommaKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__2__Impl"


    // $ANTLR start "rule__DataProperty__Group_3__3"
    // InternalSemanticNodesDsl.g:2522:1: rule__DataProperty__Group_3__3 : rule__DataProperty__Group_3__3__Impl rule__DataProperty__Group_3__4 ;
    public final void rule__DataProperty__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2526:1: ( rule__DataProperty__Group_3__3__Impl rule__DataProperty__Group_3__4 )
            // InternalSemanticNodesDsl.g:2527:2: rule__DataProperty__Group_3__3__Impl rule__DataProperty__Group_3__4
            {
            pushFollow(FOLLOW_24);
            rule__DataProperty__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__3"


    // $ANTLR start "rule__DataProperty__Group_3__3__Impl"
    // InternalSemanticNodesDsl.g:2534:1: rule__DataProperty__Group_3__3__Impl : ( ( rule__DataProperty__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__DataProperty__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2538:1: ( ( ( rule__DataProperty__UpperBoundAssignment_3_3 ) ) )
            // InternalSemanticNodesDsl.g:2539:1: ( ( rule__DataProperty__UpperBoundAssignment_3_3 ) )
            {
            // InternalSemanticNodesDsl.g:2539:1: ( ( rule__DataProperty__UpperBoundAssignment_3_3 ) )
            // InternalSemanticNodesDsl.g:2540:2: ( rule__DataProperty__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getDataPropertyAccess().getUpperBoundAssignment_3_3()); 
            // InternalSemanticNodesDsl.g:2541:2: ( rule__DataProperty__UpperBoundAssignment_3_3 )
            // InternalSemanticNodesDsl.g:2541:3: rule__DataProperty__UpperBoundAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__UpperBoundAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getDataPropertyAccess().getUpperBoundAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__3__Impl"


    // $ANTLR start "rule__DataProperty__Group_3__4"
    // InternalSemanticNodesDsl.g:2549:1: rule__DataProperty__Group_3__4 : rule__DataProperty__Group_3__4__Impl ;
    public final void rule__DataProperty__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2553:1: ( rule__DataProperty__Group_3__4__Impl )
            // InternalSemanticNodesDsl.g:2554:2: rule__DataProperty__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__4"


    // $ANTLR start "rule__DataProperty__Group_3__4__Impl"
    // InternalSemanticNodesDsl.g:2560:1: rule__DataProperty__Group_3__4__Impl : ( ']' ) ;
    public final void rule__DataProperty__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2564:1: ( ( ']' ) )
            // InternalSemanticNodesDsl.g:2565:1: ( ']' )
            {
            // InternalSemanticNodesDsl.g:2565:1: ( ']' )
            // InternalSemanticNodesDsl.g:2566:2: ']'
            {
             before(grammarAccess.getDataPropertyAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataPropertyAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_3__4__Impl"


    // $ANTLR start "rule__DataProperty__Group_4__0"
    // InternalSemanticNodesDsl.g:2576:1: rule__DataProperty__Group_4__0 : rule__DataProperty__Group_4__0__Impl rule__DataProperty__Group_4__1 ;
    public final void rule__DataProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2580:1: ( rule__DataProperty__Group_4__0__Impl rule__DataProperty__Group_4__1 )
            // InternalSemanticNodesDsl.g:2581:2: rule__DataProperty__Group_4__0__Impl rule__DataProperty__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__DataProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4__0"


    // $ANTLR start "rule__DataProperty__Group_4__0__Impl"
    // InternalSemanticNodesDsl.g:2588:1: rule__DataProperty__Group_4__0__Impl : ( '{' ) ;
    public final void rule__DataProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2592:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:2593:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:2593:1: ( '{' )
            // InternalSemanticNodesDsl.g:2594:2: '{'
            {
             before(grammarAccess.getDataPropertyAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDataPropertyAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4__0__Impl"


    // $ANTLR start "rule__DataProperty__Group_4__1"
    // InternalSemanticNodesDsl.g:2603:1: rule__DataProperty__Group_4__1 : rule__DataProperty__Group_4__1__Impl rule__DataProperty__Group_4__2 ;
    public final void rule__DataProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2607:1: ( rule__DataProperty__Group_4__1__Impl rule__DataProperty__Group_4__2 )
            // InternalSemanticNodesDsl.g:2608:2: rule__DataProperty__Group_4__1__Impl rule__DataProperty__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__DataProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4__1"


    // $ANTLR start "rule__DataProperty__Group_4__1__Impl"
    // InternalSemanticNodesDsl.g:2615:1: rule__DataProperty__Group_4__1__Impl : ( ( rule__DataProperty__MetadataAssignment_4_1 ) ) ;
    public final void rule__DataProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2619:1: ( ( ( rule__DataProperty__MetadataAssignment_4_1 ) ) )
            // InternalSemanticNodesDsl.g:2620:1: ( ( rule__DataProperty__MetadataAssignment_4_1 ) )
            {
            // InternalSemanticNodesDsl.g:2620:1: ( ( rule__DataProperty__MetadataAssignment_4_1 ) )
            // InternalSemanticNodesDsl.g:2621:2: ( rule__DataProperty__MetadataAssignment_4_1 )
            {
             before(grammarAccess.getDataPropertyAccess().getMetadataAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:2622:2: ( rule__DataProperty__MetadataAssignment_4_1 )
            // InternalSemanticNodesDsl.g:2622:3: rule__DataProperty__MetadataAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__MetadataAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDataPropertyAccess().getMetadataAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4__1__Impl"


    // $ANTLR start "rule__DataProperty__Group_4__2"
    // InternalSemanticNodesDsl.g:2630:1: rule__DataProperty__Group_4__2 : rule__DataProperty__Group_4__2__Impl rule__DataProperty__Group_4__3 ;
    public final void rule__DataProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2634:1: ( rule__DataProperty__Group_4__2__Impl rule__DataProperty__Group_4__3 )
            // InternalSemanticNodesDsl.g:2635:2: rule__DataProperty__Group_4__2__Impl rule__DataProperty__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__DataProperty__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4__2"


    // $ANTLR start "rule__DataProperty__Group_4__2__Impl"
    // InternalSemanticNodesDsl.g:2642:1: rule__DataProperty__Group_4__2__Impl : ( ( rule__DataProperty__Group_4_2__0 )* ) ;
    public final void rule__DataProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2646:1: ( ( ( rule__DataProperty__Group_4_2__0 )* ) )
            // InternalSemanticNodesDsl.g:2647:1: ( ( rule__DataProperty__Group_4_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:2647:1: ( ( rule__DataProperty__Group_4_2__0 )* )
            // InternalSemanticNodesDsl.g:2648:2: ( rule__DataProperty__Group_4_2__0 )*
            {
             before(grammarAccess.getDataPropertyAccess().getGroup_4_2()); 
            // InternalSemanticNodesDsl.g:2649:2: ( rule__DataProperty__Group_4_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==20) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:2649:3: rule__DataProperty__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__DataProperty__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDataPropertyAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4__2__Impl"


    // $ANTLR start "rule__DataProperty__Group_4__3"
    // InternalSemanticNodesDsl.g:2657:1: rule__DataProperty__Group_4__3 : rule__DataProperty__Group_4__3__Impl ;
    public final void rule__DataProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2661:1: ( rule__DataProperty__Group_4__3__Impl )
            // InternalSemanticNodesDsl.g:2662:2: rule__DataProperty__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4__3"


    // $ANTLR start "rule__DataProperty__Group_4__3__Impl"
    // InternalSemanticNodesDsl.g:2668:1: rule__DataProperty__Group_4__3__Impl : ( '}' ) ;
    public final void rule__DataProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2672:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:2673:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:2673:1: ( '}' )
            // InternalSemanticNodesDsl.g:2674:2: '}'
            {
             before(grammarAccess.getDataPropertyAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDataPropertyAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4__3__Impl"


    // $ANTLR start "rule__DataProperty__Group_4_2__0"
    // InternalSemanticNodesDsl.g:2684:1: rule__DataProperty__Group_4_2__0 : rule__DataProperty__Group_4_2__0__Impl rule__DataProperty__Group_4_2__1 ;
    public final void rule__DataProperty__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2688:1: ( rule__DataProperty__Group_4_2__0__Impl rule__DataProperty__Group_4_2__1 )
            // InternalSemanticNodesDsl.g:2689:2: rule__DataProperty__Group_4_2__0__Impl rule__DataProperty__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__DataProperty__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4_2__0"


    // $ANTLR start "rule__DataProperty__Group_4_2__0__Impl"
    // InternalSemanticNodesDsl.g:2696:1: rule__DataProperty__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__DataProperty__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2700:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2701:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2701:1: ( ',' )
            // InternalSemanticNodesDsl.g:2702:2: ','
            {
             before(grammarAccess.getDataPropertyAccess().getCommaKeyword_4_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataPropertyAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4_2__0__Impl"


    // $ANTLR start "rule__DataProperty__Group_4_2__1"
    // InternalSemanticNodesDsl.g:2711:1: rule__DataProperty__Group_4_2__1 : rule__DataProperty__Group_4_2__1__Impl ;
    public final void rule__DataProperty__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2715:1: ( rule__DataProperty__Group_4_2__1__Impl )
            // InternalSemanticNodesDsl.g:2716:2: rule__DataProperty__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4_2__1"


    // $ANTLR start "rule__DataProperty__Group_4_2__1__Impl"
    // InternalSemanticNodesDsl.g:2722:1: rule__DataProperty__Group_4_2__1__Impl : ( ( rule__DataProperty__MetadataAssignment_4_2_1 ) ) ;
    public final void rule__DataProperty__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2726:1: ( ( ( rule__DataProperty__MetadataAssignment_4_2_1 ) ) )
            // InternalSemanticNodesDsl.g:2727:1: ( ( rule__DataProperty__MetadataAssignment_4_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:2727:1: ( ( rule__DataProperty__MetadataAssignment_4_2_1 ) )
            // InternalSemanticNodesDsl.g:2728:2: ( rule__DataProperty__MetadataAssignment_4_2_1 )
            {
             before(grammarAccess.getDataPropertyAccess().getMetadataAssignment_4_2_1()); 
            // InternalSemanticNodesDsl.g:2729:2: ( rule__DataProperty__MetadataAssignment_4_2_1 )
            // InternalSemanticNodesDsl.g:2729:3: rule__DataProperty__MetadataAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DataProperty__MetadataAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDataPropertyAccess().getMetadataAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__Group_4_2__1__Impl"


    // $ANTLR start "rule__MetaData__Group__0"
    // InternalSemanticNodesDsl.g:2738:1: rule__MetaData__Group__0 : rule__MetaData__Group__0__Impl rule__MetaData__Group__1 ;
    public final void rule__MetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2742:1: ( rule__MetaData__Group__0__Impl rule__MetaData__Group__1 )
            // InternalSemanticNodesDsl.g:2743:2: rule__MetaData__Group__0__Impl rule__MetaData__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MetaData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__Group__0"


    // $ANTLR start "rule__MetaData__Group__0__Impl"
    // InternalSemanticNodesDsl.g:2750:1: rule__MetaData__Group__0__Impl : ( () ) ;
    public final void rule__MetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2754:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:2755:1: ( () )
            {
            // InternalSemanticNodesDsl.g:2755:1: ( () )
            // InternalSemanticNodesDsl.g:2756:2: ()
            {
             before(grammarAccess.getMetaDataAccess().getMetaDataAction_0()); 
            // InternalSemanticNodesDsl.g:2757:2: ()
            // InternalSemanticNodesDsl.g:2757:3: 
            {
            }

             after(grammarAccess.getMetaDataAccess().getMetaDataAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__Group__0__Impl"


    // $ANTLR start "rule__MetaData__Group__1"
    // InternalSemanticNodesDsl.g:2765:1: rule__MetaData__Group__1 : rule__MetaData__Group__1__Impl rule__MetaData__Group__2 ;
    public final void rule__MetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2769:1: ( rule__MetaData__Group__1__Impl rule__MetaData__Group__2 )
            // InternalSemanticNodesDsl.g:2770:2: rule__MetaData__Group__1__Impl rule__MetaData__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__MetaData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__Group__1"


    // $ANTLR start "rule__MetaData__Group__1__Impl"
    // InternalSemanticNodesDsl.g:2777:1: rule__MetaData__Group__1__Impl : ( ( rule__MetaData__KeyAssignment_1 ) ) ;
    public final void rule__MetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2781:1: ( ( ( rule__MetaData__KeyAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:2782:1: ( ( rule__MetaData__KeyAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:2782:1: ( ( rule__MetaData__KeyAssignment_1 ) )
            // InternalSemanticNodesDsl.g:2783:2: ( rule__MetaData__KeyAssignment_1 )
            {
             before(grammarAccess.getMetaDataAccess().getKeyAssignment_1()); 
            // InternalSemanticNodesDsl.g:2784:2: ( rule__MetaData__KeyAssignment_1 )
            // InternalSemanticNodesDsl.g:2784:3: rule__MetaData__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__Group__1__Impl"


    // $ANTLR start "rule__MetaData__Group__2"
    // InternalSemanticNodesDsl.g:2792:1: rule__MetaData__Group__2 : rule__MetaData__Group__2__Impl rule__MetaData__Group__3 ;
    public final void rule__MetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2796:1: ( rule__MetaData__Group__2__Impl rule__MetaData__Group__3 )
            // InternalSemanticNodesDsl.g:2797:2: rule__MetaData__Group__2__Impl rule__MetaData__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MetaData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__Group__2"


    // $ANTLR start "rule__MetaData__Group__2__Impl"
    // InternalSemanticNodesDsl.g:2804:1: rule__MetaData__Group__2__Impl : ( '=' ) ;
    public final void rule__MetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2808:1: ( ( '=' ) )
            // InternalSemanticNodesDsl.g:2809:1: ( '=' )
            {
            // InternalSemanticNodesDsl.g:2809:1: ( '=' )
            // InternalSemanticNodesDsl.g:2810:2: '='
            {
             before(grammarAccess.getMetaDataAccess().getEqualsSignKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMetaDataAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__Group__2__Impl"


    // $ANTLR start "rule__MetaData__Group__3"
    // InternalSemanticNodesDsl.g:2819:1: rule__MetaData__Group__3 : rule__MetaData__Group__3__Impl ;
    public final void rule__MetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2823:1: ( rule__MetaData__Group__3__Impl )
            // InternalSemanticNodesDsl.g:2824:2: rule__MetaData__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__Group__3"


    // $ANTLR start "rule__MetaData__Group__3__Impl"
    // InternalSemanticNodesDsl.g:2830:1: rule__MetaData__Group__3__Impl : ( ( rule__MetaData__ValueAssignment_3 ) ) ;
    public final void rule__MetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2834:1: ( ( ( rule__MetaData__ValueAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:2835:1: ( ( rule__MetaData__ValueAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:2835:1: ( ( rule__MetaData__ValueAssignment_3 ) )
            // InternalSemanticNodesDsl.g:2836:2: ( rule__MetaData__ValueAssignment_3 )
            {
             before(grammarAccess.getMetaDataAccess().getValueAssignment_3()); 
            // InternalSemanticNodesDsl.g:2837:2: ( rule__MetaData__ValueAssignment_3 )
            // InternalSemanticNodesDsl.g:2837:3: rule__MetaData__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MetaData__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSemanticNodesDsl.g:2846:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2850:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSemanticNodesDsl.g:2851:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSemanticNodesDsl.g:2858:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2862:1: ( ( ( '-' )? ) )
            // InternalSemanticNodesDsl.g:2863:1: ( ( '-' )? )
            {
            // InternalSemanticNodesDsl.g:2863:1: ( ( '-' )? )
            // InternalSemanticNodesDsl.g:2864:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSemanticNodesDsl.g:2865:2: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2865:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalSemanticNodesDsl.g:2873:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2877:1: ( rule__EInt__Group__1__Impl )
            // InternalSemanticNodesDsl.g:2878:2: rule__EInt__Group__1__Impl
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
    // InternalSemanticNodesDsl.g:2884:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2888:1: ( ( RULE_INT ) )
            // InternalSemanticNodesDsl.g:2889:1: ( RULE_INT )
            {
            // InternalSemanticNodesDsl.g:2889:1: ( RULE_INT )
            // InternalSemanticNodesDsl.g:2890:2: RULE_INT
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


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalSemanticNodesDsl.g:2900:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2904:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalSemanticNodesDsl.g:2905:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalSemanticNodesDsl.g:2912:1: rule__Annotation__Group__0__Impl : ( () ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2916:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:2917:1: ( () )
            {
            // InternalSemanticNodesDsl.g:2917:1: ( () )
            // InternalSemanticNodesDsl.g:2918:2: ()
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationAction_0()); 
            // InternalSemanticNodesDsl.g:2919:2: ()
            // InternalSemanticNodesDsl.g:2919:3: 
            {
            }

             after(grammarAccess.getAnnotationAccess().getAnnotationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalSemanticNodesDsl.g:2927:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2931:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalSemanticNodesDsl.g:2932:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalSemanticNodesDsl.g:2939:1: rule__Annotation__Group__1__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2943:1: ( ( '@' ) )
            // InternalSemanticNodesDsl.g:2944:1: ( '@' )
            {
            // InternalSemanticNodesDsl.g:2944:1: ( '@' )
            // InternalSemanticNodesDsl.g:2945:2: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // InternalSemanticNodesDsl.g:2954:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2958:1: ( rule__Annotation__Group__2__Impl )
            // InternalSemanticNodesDsl.g:2959:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // InternalSemanticNodesDsl.g:2965:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__AnnotationAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2969:1: ( ( ( rule__Annotation__AnnotationAssignment_2 ) ) )
            // InternalSemanticNodesDsl.g:2970:1: ( ( rule__Annotation__AnnotationAssignment_2 ) )
            {
            // InternalSemanticNodesDsl.g:2970:1: ( ( rule__Annotation__AnnotationAssignment_2 ) )
            // InternalSemanticNodesDsl.g:2971:2: ( rule__Annotation__AnnotationAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationAssignment_2()); 
            // InternalSemanticNodesDsl.g:2972:2: ( rule__Annotation__AnnotationAssignment_2 )
            // InternalSemanticNodesDsl.g:2972:3: rule__Annotation__AnnotationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__AnnotationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getAnnotationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__RepositoryManager__RepositoriesAssignment_1_0"
    // InternalSemanticNodesDsl.g:2981:1: rule__RepositoryManager__RepositoriesAssignment_1_0 : ( ruleRepository ) ;
    public final void rule__RepositoryManager__RepositoriesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2985:1: ( ( ruleRepository ) )
            // InternalSemanticNodesDsl.g:2986:2: ( ruleRepository )
            {
            // InternalSemanticNodesDsl.g:2986:2: ( ruleRepository )
            // InternalSemanticNodesDsl.g:2987:3: ruleRepository
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__RepositoriesAssignment_1_0"


    // $ANTLR start "rule__RepositoryManager__RepositoriesAssignment_1_1"
    // InternalSemanticNodesDsl.g:2996:1: rule__RepositoryManager__RepositoriesAssignment_1_1 : ( ruleRepository ) ;
    public final void rule__RepositoryManager__RepositoriesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3000:1: ( ( ruleRepository ) )
            // InternalSemanticNodesDsl.g:3001:2: ( ruleRepository )
            {
            // InternalSemanticNodesDsl.g:3001:2: ( ruleRepository )
            // InternalSemanticNodesDsl.g:3002:3: ruleRepository
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__RepositoriesAssignment_1_1"


    // $ANTLR start "rule__Repository__NameAssignment_2"
    // InternalSemanticNodesDsl.g:3011:1: rule__Repository__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Repository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3015:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3016:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3016:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3017:3: ruleEString
            {
             before(grammarAccess.getRepositoryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__NameAssignment_2"


    // $ANTLR start "rule__Repository__ResourcesAssignment_4"
    // InternalSemanticNodesDsl.g:3026:1: rule__Repository__ResourcesAssignment_4 : ( ruleResource ) ;
    public final void rule__Repository__ResourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3030:1: ( ( ruleResource ) )
            // InternalSemanticNodesDsl.g:3031:2: ( ruleResource )
            {
            // InternalSemanticNodesDsl.g:3031:2: ( ruleResource )
            // InternalSemanticNodesDsl.g:3032:3: ruleResource
            {
             before(grammarAccess.getRepositoryAccess().getResourcesResourceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getResourcesResourceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__ResourcesAssignment_4"


    // $ANTLR start "rule__Repository__ResourcesAssignment_5"
    // InternalSemanticNodesDsl.g:3041:1: rule__Repository__ResourcesAssignment_5 : ( ruleResource ) ;
    public final void rule__Repository__ResourcesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3045:1: ( ( ruleResource ) )
            // InternalSemanticNodesDsl.g:3046:2: ( ruleResource )
            {
            // InternalSemanticNodesDsl.g:3046:2: ( ruleResource )
            // InternalSemanticNodesDsl.g:3047:3: ruleResource
            {
             before(grammarAccess.getRepositoryAccess().getResourcesResourceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getRepositoryAccess().getResourcesResourceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Repository__ResourcesAssignment_5"


    // $ANTLR start "rule__Resource__AnnotationsAssignment_1_0"
    // InternalSemanticNodesDsl.g:3056:1: rule__Resource__AnnotationsAssignment_1_0 : ( ruleAnnotation ) ;
    public final void rule__Resource__AnnotationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3060:1: ( ( ruleAnnotation ) )
            // InternalSemanticNodesDsl.g:3061:2: ( ruleAnnotation )
            {
            // InternalSemanticNodesDsl.g:3061:2: ( ruleAnnotation )
            // InternalSemanticNodesDsl.g:3062:3: ruleAnnotation
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__AnnotationsAssignment_1_0"


    // $ANTLR start "rule__Resource__AnnotationsAssignment_1_1"
    // InternalSemanticNodesDsl.g:3071:1: rule__Resource__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__Resource__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3075:1: ( ( ruleAnnotation ) )
            // InternalSemanticNodesDsl.g:3076:2: ( ruleAnnotation )
            {
            // InternalSemanticNodesDsl.g:3076:2: ( ruleAnnotation )
            // InternalSemanticNodesDsl.g:3077:3: ruleAnnotation
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__AnnotationsAssignment_1_1"


    // $ANTLR start "rule__Resource__AssistantAssignment_2"
    // InternalSemanticNodesDsl.g:3086:1: rule__Resource__AssistantAssignment_2 : ( ruleEString ) ;
    public final void rule__Resource__AssistantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3090:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3091:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3091:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3092:3: ruleEString
            {
             before(grammarAccess.getResourceAccess().getAssistantEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getAssistantEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__AssistantAssignment_2"


    // $ANTLR start "rule__Resource__NameAssignment_3"
    // InternalSemanticNodesDsl.g:3101:1: rule__Resource__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Resource__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3105:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3106:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3106:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3107:3: ruleEString
            {
             before(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__NameAssignment_3"


    // $ANTLR start "rule__Resource__ResourceElementsAssignment_5_0"
    // InternalSemanticNodesDsl.g:3116:1: rule__Resource__ResourceElementsAssignment_5_0 : ( ruleResourceElement ) ;
    public final void rule__Resource__ResourceElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3120:1: ( ( ruleResourceElement ) )
            // InternalSemanticNodesDsl.g:3121:2: ( ruleResourceElement )
            {
            // InternalSemanticNodesDsl.g:3121:2: ( ruleResourceElement )
            // InternalSemanticNodesDsl.g:3122:3: ruleResourceElement
            {
             before(grammarAccess.getResourceAccess().getResourceElementsResourceElementParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleResourceElement();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getResourceElementsResourceElementParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__ResourceElementsAssignment_5_0"


    // $ANTLR start "rule__Resource__ResourceElementsAssignment_5_1"
    // InternalSemanticNodesDsl.g:3131:1: rule__Resource__ResourceElementsAssignment_5_1 : ( ruleResourceElement ) ;
    public final void rule__Resource__ResourceElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3135:1: ( ( ruleResourceElement ) )
            // InternalSemanticNodesDsl.g:3136:2: ( ruleResourceElement )
            {
            // InternalSemanticNodesDsl.g:3136:2: ( ruleResourceElement )
            // InternalSemanticNodesDsl.g:3137:3: ruleResourceElement
            {
             before(grammarAccess.getResourceAccess().getResourceElementsResourceElementParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResourceElement();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getResourceElementsResourceElementParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__ResourceElementsAssignment_5_1"


    // $ANTLR start "rule__Resource__MetadataAssignment_7_2"
    // InternalSemanticNodesDsl.g:3146:1: rule__Resource__MetadataAssignment_7_2 : ( ruleMetaData ) ;
    public final void rule__Resource__MetadataAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3150:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:3151:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:3151:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:3152:3: ruleMetaData
            {
             before(grammarAccess.getResourceAccess().getMetadataMetaDataParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getMetadataMetaDataParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__MetadataAssignment_7_2"


    // $ANTLR start "rule__Resource__MetadataAssignment_7_3_1"
    // InternalSemanticNodesDsl.g:3161:1: rule__Resource__MetadataAssignment_7_3_1 : ( ruleMetaData ) ;
    public final void rule__Resource__MetadataAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3165:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:3166:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:3166:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:3167:3: ruleMetaData
            {
             before(grammarAccess.getResourceAccess().getMetadataMetaDataParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getMetadataMetaDataParserRuleCall_7_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__MetadataAssignment_7_3_1"


    // $ANTLR start "rule__SemanticNode__AnnotationsAssignment_1_0"
    // InternalSemanticNodesDsl.g:3176:1: rule__SemanticNode__AnnotationsAssignment_1_0 : ( ruleAnnotation ) ;
    public final void rule__SemanticNode__AnnotationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3180:1: ( ( ruleAnnotation ) )
            // InternalSemanticNodesDsl.g:3181:2: ( ruleAnnotation )
            {
            // InternalSemanticNodesDsl.g:3181:2: ( ruleAnnotation )
            // InternalSemanticNodesDsl.g:3182:3: ruleAnnotation
            {
             before(grammarAccess.getSemanticNodeAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getAnnotationsAnnotationParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__AnnotationsAssignment_1_0"


    // $ANTLR start "rule__SemanticNode__AnnotationsAssignment_1_1"
    // InternalSemanticNodesDsl.g:3191:1: rule__SemanticNode__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__SemanticNode__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3195:1: ( ( ruleAnnotation ) )
            // InternalSemanticNodesDsl.g:3196:2: ( ruleAnnotation )
            {
            // InternalSemanticNodesDsl.g:3196:2: ( ruleAnnotation )
            // InternalSemanticNodesDsl.g:3197:3: ruleAnnotation
            {
             before(grammarAccess.getSemanticNodeAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getAnnotationsAnnotationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__AnnotationsAssignment_1_1"


    // $ANTLR start "rule__SemanticNode__AbstractAssignment_2"
    // InternalSemanticNodesDsl.g:3206:1: rule__SemanticNode__AbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__SemanticNode__AbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3210:1: ( ( ( 'abstract' ) ) )
            // InternalSemanticNodesDsl.g:3211:2: ( ( 'abstract' ) )
            {
            // InternalSemanticNodesDsl.g:3211:2: ( ( 'abstract' ) )
            // InternalSemanticNodesDsl.g:3212:3: ( 'abstract' )
            {
             before(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_2_0()); 
            // InternalSemanticNodesDsl.g:3213:3: ( 'abstract' )
            // InternalSemanticNodesDsl.g:3214:4: 'abstract'
            {
             before(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_2_0()); 

            }

             after(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__AbstractAssignment_2"


    // $ANTLR start "rule__SemanticNode__NameAssignment_4"
    // InternalSemanticNodesDsl.g:3225:1: rule__SemanticNode__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__SemanticNode__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3229:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3230:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3230:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3231:3: ruleEString
            {
             before(grammarAccess.getSemanticNodeAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__NameAssignment_4"


    // $ANTLR start "rule__SemanticNode__PropertiesAssignment_6_0"
    // InternalSemanticNodesDsl.g:3240:1: rule__SemanticNode__PropertiesAssignment_6_0 : ( ruleProperty ) ;
    public final void rule__SemanticNode__PropertiesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3244:1: ( ( ruleProperty ) )
            // InternalSemanticNodesDsl.g:3245:2: ( ruleProperty )
            {
            // InternalSemanticNodesDsl.g:3245:2: ( ruleProperty )
            // InternalSemanticNodesDsl.g:3246:3: ruleProperty
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__PropertiesAssignment_6_0"


    // $ANTLR start "rule__SemanticNode__PropertiesAssignment_6_1"
    // InternalSemanticNodesDsl.g:3255:1: rule__SemanticNode__PropertiesAssignment_6_1 : ( ruleProperty ) ;
    public final void rule__SemanticNode__PropertiesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3259:1: ( ( ruleProperty ) )
            // InternalSemanticNodesDsl.g:3260:2: ( ruleProperty )
            {
            // InternalSemanticNodesDsl.g:3260:2: ( ruleProperty )
            // InternalSemanticNodesDsl.g:3261:3: ruleProperty
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__PropertiesAssignment_6_1"


    // $ANTLR start "rule__SemanticNode__MetadataAssignment_8_1"
    // InternalSemanticNodesDsl.g:3270:1: rule__SemanticNode__MetadataAssignment_8_1 : ( ruleMetaData ) ;
    public final void rule__SemanticNode__MetadataAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3274:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:3275:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:3275:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:3276:3: ruleMetaData
            {
             before(grammarAccess.getSemanticNodeAccess().getMetadataMetaDataParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getMetadataMetaDataParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__MetadataAssignment_8_1"


    // $ANTLR start "rule__SemanticNode__MetadataAssignment_8_2_1"
    // InternalSemanticNodesDsl.g:3285:1: rule__SemanticNode__MetadataAssignment_8_2_1 : ( ruleMetaData ) ;
    public final void rule__SemanticNode__MetadataAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3289:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:3290:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:3290:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:3291:3: ruleMetaData
            {
             before(grammarAccess.getSemanticNodeAccess().getMetadataMetaDataParserRuleCall_8_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getMetadataMetaDataParserRuleCall_8_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__MetadataAssignment_8_2_1"


    // $ANTLR start "rule__ObjectProperty__NameAssignment_1"
    // InternalSemanticNodesDsl.g:3300:1: rule__ObjectProperty__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ObjectProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3304:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3305:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3305:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3306:3: ruleEString
            {
             before(grammarAccess.getObjectPropertyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjectPropertyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__NameAssignment_1"


    // $ANTLR start "rule__ObjectProperty__RangeAssignment_3"
    // InternalSemanticNodesDsl.g:3315:1: rule__ObjectProperty__RangeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ObjectProperty__RangeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3319:1: ( ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:3320:2: ( ( ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:3320:2: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3321:3: ( ruleEString )
            {
             before(grammarAccess.getObjectPropertyAccess().getRangeSemanticNodeCrossReference_3_0()); 
            // InternalSemanticNodesDsl.g:3322:3: ( ruleEString )
            // InternalSemanticNodesDsl.g:3323:4: ruleEString
            {
             before(grammarAccess.getObjectPropertyAccess().getRangeSemanticNodeEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getObjectPropertyAccess().getRangeSemanticNodeEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getObjectPropertyAccess().getRangeSemanticNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__RangeAssignment_3"


    // $ANTLR start "rule__ObjectProperty__LowerBoundAssignment_4_1"
    // InternalSemanticNodesDsl.g:3334:1: rule__ObjectProperty__LowerBoundAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__ObjectProperty__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3338:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:3339:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:3339:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:3340:3: ruleEInt
            {
             before(grammarAccess.getObjectPropertyAccess().getLowerBoundEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getObjectPropertyAccess().getLowerBoundEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__LowerBoundAssignment_4_1"


    // $ANTLR start "rule__ObjectProperty__UpperBoundAssignment_4_3"
    // InternalSemanticNodesDsl.g:3349:1: rule__ObjectProperty__UpperBoundAssignment_4_3 : ( ruleEInt ) ;
    public final void rule__ObjectProperty__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3353:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:3354:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:3354:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:3355:3: ruleEInt
            {
             before(grammarAccess.getObjectPropertyAccess().getUpperBoundEIntParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getObjectPropertyAccess().getUpperBoundEIntParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__UpperBoundAssignment_4_3"


    // $ANTLR start "rule__ObjectProperty__MetadataAssignment_5_1"
    // InternalSemanticNodesDsl.g:3364:1: rule__ObjectProperty__MetadataAssignment_5_1 : ( ruleMetaData ) ;
    public final void rule__ObjectProperty__MetadataAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3368:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:3369:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:3369:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:3370:3: ruleMetaData
            {
             before(grammarAccess.getObjectPropertyAccess().getMetadataMetaDataParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getObjectPropertyAccess().getMetadataMetaDataParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__MetadataAssignment_5_1"


    // $ANTLR start "rule__ObjectProperty__MetadataAssignment_5_2_1"
    // InternalSemanticNodesDsl.g:3379:1: rule__ObjectProperty__MetadataAssignment_5_2_1 : ( ruleMetaData ) ;
    public final void rule__ObjectProperty__MetadataAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3383:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:3384:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:3384:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:3385:3: ruleMetaData
            {
             before(grammarAccess.getObjectPropertyAccess().getMetadataMetaDataParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getObjectPropertyAccess().getMetadataMetaDataParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__MetadataAssignment_5_2_1"


    // $ANTLR start "rule__DataProperty__NameAssignment_1"
    // InternalSemanticNodesDsl.g:3394:1: rule__DataProperty__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__DataProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3398:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3399:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3399:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3400:3: ruleEString
            {
             before(grammarAccess.getDataPropertyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDataPropertyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__NameAssignment_1"


    // $ANTLR start "rule__DataProperty__TypeAssignment_2_1"
    // InternalSemanticNodesDsl.g:3409:1: rule__DataProperty__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__DataProperty__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3413:1: ( ( ruleType ) )
            // InternalSemanticNodesDsl.g:3414:2: ( ruleType )
            {
            // InternalSemanticNodesDsl.g:3414:2: ( ruleType )
            // InternalSemanticNodesDsl.g:3415:3: ruleType
            {
             before(grammarAccess.getDataPropertyAccess().getTypeTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getDataPropertyAccess().getTypeTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__TypeAssignment_2_1"


    // $ANTLR start "rule__DataProperty__LowerBoundAssignment_3_1"
    // InternalSemanticNodesDsl.g:3424:1: rule__DataProperty__LowerBoundAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__DataProperty__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3428:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:3429:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:3429:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:3430:3: ruleEInt
            {
             before(grammarAccess.getDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__LowerBoundAssignment_3_1"


    // $ANTLR start "rule__DataProperty__UpperBoundAssignment_3_3"
    // InternalSemanticNodesDsl.g:3439:1: rule__DataProperty__UpperBoundAssignment_3_3 : ( ruleEInt ) ;
    public final void rule__DataProperty__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3443:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:3444:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:3444:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:3445:3: ruleEInt
            {
             before(grammarAccess.getDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__UpperBoundAssignment_3_3"


    // $ANTLR start "rule__DataProperty__MetadataAssignment_4_1"
    // InternalSemanticNodesDsl.g:3454:1: rule__DataProperty__MetadataAssignment_4_1 : ( ruleMetaData ) ;
    public final void rule__DataProperty__MetadataAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3458:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:3459:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:3459:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:3460:3: ruleMetaData
            {
             before(grammarAccess.getDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__MetadataAssignment_4_1"


    // $ANTLR start "rule__DataProperty__MetadataAssignment_4_2_1"
    // InternalSemanticNodesDsl.g:3469:1: rule__DataProperty__MetadataAssignment_4_2_1 : ( ruleMetaData ) ;
    public final void rule__DataProperty__MetadataAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3473:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:3474:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:3474:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:3475:3: ruleMetaData
            {
             before(grammarAccess.getDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataProperty__MetadataAssignment_4_2_1"


    // $ANTLR start "rule__MetaData__KeyAssignment_1"
    // InternalSemanticNodesDsl.g:3484:1: rule__MetaData__KeyAssignment_1 : ( ruleEString ) ;
    public final void rule__MetaData__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3488:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3489:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3489:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3490:3: ruleEString
            {
             before(grammarAccess.getMetaDataAccess().getKeyEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaDataAccess().getKeyEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__KeyAssignment_1"


    // $ANTLR start "rule__MetaData__ValueAssignment_3"
    // InternalSemanticNodesDsl.g:3499:1: rule__MetaData__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__MetaData__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3503:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3504:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3504:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3505:3: ruleEString
            {
             before(grammarAccess.getMetaDataAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaDataAccess().getValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaData__ValueAssignment_3"


    // $ANTLR start "rule__Annotation__AnnotationAssignment_2"
    // InternalSemanticNodesDsl.g:3514:1: rule__Annotation__AnnotationAssignment_2 : ( ruleEString ) ;
    public final void rule__Annotation__AnnotationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3518:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3519:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3519:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3520:3: ruleEString
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAnnotationAccess().getAnnotationEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__AnnotationAssignment_2"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\2\4\2\uffff\5\4";
    static final String dfa_3s = "\1\35\1\5\2\uffff\2\35\1\5\2\35";
    static final String dfa_4s = "\2\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\17\uffff\1\3\6\uffff\1\1\1\3",
            "\1\4\1\5",
            "",
            "",
            "\2\2\17\uffff\1\3\6\uffff\1\6\1\3",
            "\2\2\17\uffff\1\3\6\uffff\1\6\1\3",
            "\1\7\1\10",
            "\2\2\17\uffff\1\3\6\uffff\1\6\1\3",
            "\2\2\17\uffff\1\3\6\uffff\1\6\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "368:1: rule__ResourceElement__Alternatives : ( ( ruleResource ) | ( ruleSemanticNode ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000010000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000010040030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030240030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000030200030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000030200032L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000000L});

}