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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'", "'repository'", "'{'", "'}'", "'metadata'", "','", "'enum'", "'->'", "'node'", "'['", "']'", "':'", "'='", "'-'", "'@'", "'abstract'"
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
    public static final int T__30=30;
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


    // $ANTLR start "entryRuleEnumeration"
    // InternalSemanticNodesDsl.g:153:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:154:1: ( ruleEnumeration EOF )
            // InternalSemanticNodesDsl.g:155:1: ruleEnumeration EOF
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
    // InternalSemanticNodesDsl.g:162:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:166:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:167:2: ( ( rule__Enumeration__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:167:2: ( ( rule__Enumeration__Group__0 ) )
            // InternalSemanticNodesDsl.g:168:3: ( rule__Enumeration__Group__0 )
            {
             before(grammarAccess.getEnumerationAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:169:3: ( rule__Enumeration__Group__0 )
            // InternalSemanticNodesDsl.g:169:4: rule__Enumeration__Group__0
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


    // $ANTLR start "entryRuleEnumerationLiteral"
    // InternalSemanticNodesDsl.g:178:1: entryRuleEnumerationLiteral : ruleEnumerationLiteral EOF ;
    public final void entryRuleEnumerationLiteral() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:179:1: ( ruleEnumerationLiteral EOF )
            // InternalSemanticNodesDsl.g:180:1: ruleEnumerationLiteral EOF
            {
             before(grammarAccess.getEnumerationLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralRule()); 
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
    // $ANTLR end "entryRuleEnumerationLiteral"


    // $ANTLR start "ruleEnumerationLiteral"
    // InternalSemanticNodesDsl.g:187:1: ruleEnumerationLiteral : ( ( rule__EnumerationLiteral__Group__0 ) ) ;
    public final void ruleEnumerationLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:191:2: ( ( ( rule__EnumerationLiteral__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:192:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:192:2: ( ( rule__EnumerationLiteral__Group__0 ) )
            // InternalSemanticNodesDsl.g:193:3: ( rule__EnumerationLiteral__Group__0 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:194:3: ( rule__EnumerationLiteral__Group__0 )
            // InternalSemanticNodesDsl.g:194:4: rule__EnumerationLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationLiteral"


    // $ANTLR start "entryRuleSemanticNode"
    // InternalSemanticNodesDsl.g:203:1: entryRuleSemanticNode : ruleSemanticNode EOF ;
    public final void entryRuleSemanticNode() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:204:1: ( ruleSemanticNode EOF )
            // InternalSemanticNodesDsl.g:205:1: ruleSemanticNode EOF
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
    // InternalSemanticNodesDsl.g:212:1: ruleSemanticNode : ( ( rule__SemanticNode__Group__0 ) ) ;
    public final void ruleSemanticNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:216:2: ( ( ( rule__SemanticNode__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:217:2: ( ( rule__SemanticNode__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:217:2: ( ( rule__SemanticNode__Group__0 ) )
            // InternalSemanticNodesDsl.g:218:3: ( rule__SemanticNode__Group__0 )
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:219:3: ( rule__SemanticNode__Group__0 )
            // InternalSemanticNodesDsl.g:219:4: rule__SemanticNode__Group__0
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
    // InternalSemanticNodesDsl.g:228:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:229:1: ( ruleProperty EOF )
            // InternalSemanticNodesDsl.g:230:1: ruleProperty EOF
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
    // InternalSemanticNodesDsl.g:237:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:241:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalSemanticNodesDsl.g:242:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalSemanticNodesDsl.g:242:2: ( ( rule__Property__Alternatives ) )
            // InternalSemanticNodesDsl.g:243:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalSemanticNodesDsl.g:244:3: ( rule__Property__Alternatives )
            // InternalSemanticNodesDsl.g:244:4: rule__Property__Alternatives
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
    // InternalSemanticNodesDsl.g:253:1: entryRuleObjectProperty : ruleObjectProperty EOF ;
    public final void entryRuleObjectProperty() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:254:1: ( ruleObjectProperty EOF )
            // InternalSemanticNodesDsl.g:255:1: ruleObjectProperty EOF
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
    // InternalSemanticNodesDsl.g:262:1: ruleObjectProperty : ( ( rule__ObjectProperty__Group__0 ) ) ;
    public final void ruleObjectProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:266:2: ( ( ( rule__ObjectProperty__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:267:2: ( ( rule__ObjectProperty__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:267:2: ( ( rule__ObjectProperty__Group__0 ) )
            // InternalSemanticNodesDsl.g:268:3: ( rule__ObjectProperty__Group__0 )
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:269:3: ( rule__ObjectProperty__Group__0 )
            // InternalSemanticNodesDsl.g:269:4: rule__ObjectProperty__Group__0
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


    // $ANTLR start "entryRulePrimitiveTypeDataProperty"
    // InternalSemanticNodesDsl.g:278:1: entryRulePrimitiveTypeDataProperty : rulePrimitiveTypeDataProperty EOF ;
    public final void entryRulePrimitiveTypeDataProperty() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:279:1: ( rulePrimitiveTypeDataProperty EOF )
            // InternalSemanticNodesDsl.g:280:1: rulePrimitiveTypeDataProperty EOF
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveTypeDataProperty();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeDataPropertyRule()); 
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
    // $ANTLR end "entryRulePrimitiveTypeDataProperty"


    // $ANTLR start "rulePrimitiveTypeDataProperty"
    // InternalSemanticNodesDsl.g:287:1: rulePrimitiveTypeDataProperty : ( ( rule__PrimitiveTypeDataProperty__Group__0 ) ) ;
    public final void rulePrimitiveTypeDataProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:291:2: ( ( ( rule__PrimitiveTypeDataProperty__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:292:2: ( ( rule__PrimitiveTypeDataProperty__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:292:2: ( ( rule__PrimitiveTypeDataProperty__Group__0 ) )
            // InternalSemanticNodesDsl.g:293:3: ( rule__PrimitiveTypeDataProperty__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:294:3: ( rule__PrimitiveTypeDataProperty__Group__0 )
            // InternalSemanticNodesDsl.g:294:4: rule__PrimitiveTypeDataProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveTypeDataProperty"


    // $ANTLR start "entryRuleEnumerationDataProperty"
    // InternalSemanticNodesDsl.g:303:1: entryRuleEnumerationDataProperty : ruleEnumerationDataProperty EOF ;
    public final void entryRuleEnumerationDataProperty() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:304:1: ( ruleEnumerationDataProperty EOF )
            // InternalSemanticNodesDsl.g:305:1: ruleEnumerationDataProperty EOF
            {
             before(grammarAccess.getEnumerationDataPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationDataProperty();

            state._fsp--;

             after(grammarAccess.getEnumerationDataPropertyRule()); 
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
    // $ANTLR end "entryRuleEnumerationDataProperty"


    // $ANTLR start "ruleEnumerationDataProperty"
    // InternalSemanticNodesDsl.g:312:1: ruleEnumerationDataProperty : ( ( rule__EnumerationDataProperty__Group__0 ) ) ;
    public final void ruleEnumerationDataProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:316:2: ( ( ( rule__EnumerationDataProperty__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:317:2: ( ( rule__EnumerationDataProperty__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:317:2: ( ( rule__EnumerationDataProperty__Group__0 ) )
            // InternalSemanticNodesDsl.g:318:3: ( rule__EnumerationDataProperty__Group__0 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:319:3: ( rule__EnumerationDataProperty__Group__0 )
            // InternalSemanticNodesDsl.g:319:4: rule__EnumerationDataProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationDataProperty"


    // $ANTLR start "entryRuleMetaData"
    // InternalSemanticNodesDsl.g:328:1: entryRuleMetaData : ruleMetaData EOF ;
    public final void entryRuleMetaData() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:329:1: ( ruleMetaData EOF )
            // InternalSemanticNodesDsl.g:330:1: ruleMetaData EOF
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
    // InternalSemanticNodesDsl.g:337:1: ruleMetaData : ( ( rule__MetaData__Group__0 ) ) ;
    public final void ruleMetaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:341:2: ( ( ( rule__MetaData__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:342:2: ( ( rule__MetaData__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:342:2: ( ( rule__MetaData__Group__0 ) )
            // InternalSemanticNodesDsl.g:343:3: ( rule__MetaData__Group__0 )
            {
             before(grammarAccess.getMetaDataAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:344:3: ( rule__MetaData__Group__0 )
            // InternalSemanticNodesDsl.g:344:4: rule__MetaData__Group__0
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
    // InternalSemanticNodesDsl.g:353:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:354:1: ( ruleEString EOF )
            // InternalSemanticNodesDsl.g:355:1: ruleEString EOF
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
    // InternalSemanticNodesDsl.g:362:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:366:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSemanticNodesDsl.g:367:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSemanticNodesDsl.g:367:2: ( ( rule__EString__Alternatives ) )
            // InternalSemanticNodesDsl.g:368:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSemanticNodesDsl.g:369:3: ( rule__EString__Alternatives )
            // InternalSemanticNodesDsl.g:369:4: rule__EString__Alternatives
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
    // InternalSemanticNodesDsl.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:379:1: ( ruleEInt EOF )
            // InternalSemanticNodesDsl.g:380:1: ruleEInt EOF
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
    // InternalSemanticNodesDsl.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalSemanticNodesDsl.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:394:3: ( rule__EInt__Group__0 )
            // InternalSemanticNodesDsl.g:394:4: rule__EInt__Group__0
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
    // InternalSemanticNodesDsl.g:403:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:404:1: ( ruleAnnotation EOF )
            // InternalSemanticNodesDsl.g:405:1: ruleAnnotation EOF
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
    // InternalSemanticNodesDsl.g:412:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:416:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:417:2: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:417:2: ( ( rule__Annotation__Group__0 ) )
            // InternalSemanticNodesDsl.g:418:3: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:419:3: ( rule__Annotation__Group__0 )
            // InternalSemanticNodesDsl.g:419:4: rule__Annotation__Group__0
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
    // InternalSemanticNodesDsl.g:428:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:432:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSemanticNodesDsl.g:433:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSemanticNodesDsl.g:433:2: ( ( rule__Type__Alternatives ) )
            // InternalSemanticNodesDsl.g:434:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSemanticNodesDsl.g:435:3: ( rule__Type__Alternatives )
            // InternalSemanticNodesDsl.g:435:4: rule__Type__Alternatives
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
    // InternalSemanticNodesDsl.g:443:1: rule__ResourceElement__Alternatives : ( ( ruleResource ) | ( ruleSemanticNode ) | ( ruleEnumeration ) );
    public final void rule__ResourceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:447:1: ( ( ruleResource ) | ( ruleSemanticNode ) | ( ruleEnumeration ) )
            int alt1=3;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSemanticNodesDsl.g:448:2: ( ruleResource )
                    {
                    // InternalSemanticNodesDsl.g:448:2: ( ruleResource )
                    // InternalSemanticNodesDsl.g:449:3: ruleResource
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
                    // InternalSemanticNodesDsl.g:454:2: ( ruleSemanticNode )
                    {
                    // InternalSemanticNodesDsl.g:454:2: ( ruleSemanticNode )
                    // InternalSemanticNodesDsl.g:455:3: ruleSemanticNode
                    {
                     before(grammarAccess.getResourceElementAccess().getSemanticNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSemanticNode();

                    state._fsp--;

                     after(grammarAccess.getResourceElementAccess().getSemanticNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:460:2: ( ruleEnumeration )
                    {
                    // InternalSemanticNodesDsl.g:460:2: ( ruleEnumeration )
                    // InternalSemanticNodesDsl.g:461:3: ruleEnumeration
                    {
                     before(grammarAccess.getResourceElementAccess().getEnumerationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumeration();

                    state._fsp--;

                     after(grammarAccess.getResourceElementAccess().getEnumerationParserRuleCall_2()); 

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
    // InternalSemanticNodesDsl.g:470:1: rule__Property__Alternatives : ( ( ruleObjectProperty ) | ( rulePrimitiveTypeDataProperty ) | ( ruleEnumerationDataProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:474:1: ( ( ruleObjectProperty ) | ( rulePrimitiveTypeDataProperty ) | ( ruleEnumerationDataProperty ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==26) ) {
                    int LA2_3 = input.LA(3);

                    if ( ((LA2_3>=11 && LA2_3<=15)) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_3>=RULE_STRING && LA2_3<=RULE_ID)) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==22) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==26) ) {
                    int LA2_3 = input.LA(3);

                    if ( ((LA2_3>=11 && LA2_3<=15)) ) {
                        alt2=2;
                    }
                    else if ( ((LA2_3>=RULE_STRING && LA2_3<=RULE_ID)) ) {
                        alt2=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 3, input);

                        throw nvae;
                    }
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
                    // InternalSemanticNodesDsl.g:475:2: ( ruleObjectProperty )
                    {
                    // InternalSemanticNodesDsl.g:475:2: ( ruleObjectProperty )
                    // InternalSemanticNodesDsl.g:476:3: ruleObjectProperty
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
                    // InternalSemanticNodesDsl.g:481:2: ( rulePrimitiveTypeDataProperty )
                    {
                    // InternalSemanticNodesDsl.g:481:2: ( rulePrimitiveTypeDataProperty )
                    // InternalSemanticNodesDsl.g:482:3: rulePrimitiveTypeDataProperty
                    {
                     before(grammarAccess.getPropertyAccess().getPrimitiveTypeDataPropertyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveTypeDataProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getPrimitiveTypeDataPropertyParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:487:2: ( ruleEnumerationDataProperty )
                    {
                    // InternalSemanticNodesDsl.g:487:2: ( ruleEnumerationDataProperty )
                    // InternalSemanticNodesDsl.g:488:3: ruleEnumerationDataProperty
                    {
                     before(grammarAccess.getPropertyAccess().getEnumerationDataPropertyParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleEnumerationDataProperty();

                    state._fsp--;

                     after(grammarAccess.getPropertyAccess().getEnumerationDataPropertyParserRuleCall_2()); 

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
    // InternalSemanticNodesDsl.g:497:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:501:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSemanticNodesDsl.g:502:2: ( RULE_STRING )
                    {
                    // InternalSemanticNodesDsl.g:502:2: ( RULE_STRING )
                    // InternalSemanticNodesDsl.g:503:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:508:2: ( RULE_ID )
                    {
                    // InternalSemanticNodesDsl.g:508:2: ( RULE_ID )
                    // InternalSemanticNodesDsl.g:509:3: RULE_ID
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
    // InternalSemanticNodesDsl.g:518:1: rule__Type__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:522:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) )
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
                    // InternalSemanticNodesDsl.g:523:2: ( ( 'String' ) )
                    {
                    // InternalSemanticNodesDsl.g:523:2: ( ( 'String' ) )
                    // InternalSemanticNodesDsl.g:524:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSemanticNodesDsl.g:525:3: ( 'String' )
                    // InternalSemanticNodesDsl.g:525:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:529:2: ( ( 'Int' ) )
                    {
                    // InternalSemanticNodesDsl.g:529:2: ( ( 'Int' ) )
                    // InternalSemanticNodesDsl.g:530:3: ( 'Int' )
                    {
                     before(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalSemanticNodesDsl.g:531:3: ( 'Int' )
                    // InternalSemanticNodesDsl.g:531:4: 'Int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:535:2: ( ( 'Boolean' ) )
                    {
                    // InternalSemanticNodesDsl.g:535:2: ( ( 'Boolean' ) )
                    // InternalSemanticNodesDsl.g:536:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalSemanticNodesDsl.g:537:3: ( 'Boolean' )
                    // InternalSemanticNodesDsl.g:537:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSemanticNodesDsl.g:541:2: ( ( 'Float' ) )
                    {
                    // InternalSemanticNodesDsl.g:541:2: ( ( 'Float' ) )
                    // InternalSemanticNodesDsl.g:542:3: ( 'Float' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // InternalSemanticNodesDsl.g:543:3: ( 'Float' )
                    // InternalSemanticNodesDsl.g:543:4: 'Float'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSemanticNodesDsl.g:547:2: ( ( 'Double' ) )
                    {
                    // InternalSemanticNodesDsl.g:547:2: ( ( 'Double' ) )
                    // InternalSemanticNodesDsl.g:548:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalSemanticNodesDsl.g:549:3: ( 'Double' )
                    // InternalSemanticNodesDsl.g:549:4: 'Double'
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
    // InternalSemanticNodesDsl.g:557:1: rule__RepositoryManager__Group__0 : rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1 ;
    public final void rule__RepositoryManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:561:1: ( rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1 )
            // InternalSemanticNodesDsl.g:562:2: rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1
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
    // InternalSemanticNodesDsl.g:569:1: rule__RepositoryManager__Group__0__Impl : ( () ) ;
    public final void rule__RepositoryManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:573:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:574:1: ( () )
            {
            // InternalSemanticNodesDsl.g:574:1: ( () )
            // InternalSemanticNodesDsl.g:575:2: ()
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0()); 
            // InternalSemanticNodesDsl.g:576:2: ()
            // InternalSemanticNodesDsl.g:576:3: 
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
    // InternalSemanticNodesDsl.g:584:1: rule__RepositoryManager__Group__1 : rule__RepositoryManager__Group__1__Impl ;
    public final void rule__RepositoryManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:588:1: ( rule__RepositoryManager__Group__1__Impl )
            // InternalSemanticNodesDsl.g:589:2: rule__RepositoryManager__Group__1__Impl
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
    // InternalSemanticNodesDsl.g:595:1: rule__RepositoryManager__Group__1__Impl : ( ( rule__RepositoryManager__Group_1__0 )? ) ;
    public final void rule__RepositoryManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:599:1: ( ( ( rule__RepositoryManager__Group_1__0 )? ) )
            // InternalSemanticNodesDsl.g:600:1: ( ( rule__RepositoryManager__Group_1__0 )? )
            {
            // InternalSemanticNodesDsl.g:600:1: ( ( rule__RepositoryManager__Group_1__0 )? )
            // InternalSemanticNodesDsl.g:601:2: ( rule__RepositoryManager__Group_1__0 )?
            {
             before(grammarAccess.getRepositoryManagerAccess().getGroup_1()); 
            // InternalSemanticNodesDsl.g:602:2: ( rule__RepositoryManager__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSemanticNodesDsl.g:602:3: rule__RepositoryManager__Group_1__0
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
    // InternalSemanticNodesDsl.g:611:1: rule__RepositoryManager__Group_1__0 : rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1 ;
    public final void rule__RepositoryManager__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:615:1: ( rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1 )
            // InternalSemanticNodesDsl.g:616:2: rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1
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
    // InternalSemanticNodesDsl.g:623:1: rule__RepositoryManager__Group_1__0__Impl : ( ( rule__RepositoryManager__RepositoriesAssignment_1_0 ) ) ;
    public final void rule__RepositoryManager__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:627:1: ( ( ( rule__RepositoryManager__RepositoriesAssignment_1_0 ) ) )
            // InternalSemanticNodesDsl.g:628:1: ( ( rule__RepositoryManager__RepositoriesAssignment_1_0 ) )
            {
            // InternalSemanticNodesDsl.g:628:1: ( ( rule__RepositoryManager__RepositoriesAssignment_1_0 ) )
            // InternalSemanticNodesDsl.g:629:2: ( rule__RepositoryManager__RepositoriesAssignment_1_0 )
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_1_0()); 
            // InternalSemanticNodesDsl.g:630:2: ( rule__RepositoryManager__RepositoriesAssignment_1_0 )
            // InternalSemanticNodesDsl.g:630:3: rule__RepositoryManager__RepositoriesAssignment_1_0
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
    // InternalSemanticNodesDsl.g:638:1: rule__RepositoryManager__Group_1__1 : rule__RepositoryManager__Group_1__1__Impl ;
    public final void rule__RepositoryManager__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:642:1: ( rule__RepositoryManager__Group_1__1__Impl )
            // InternalSemanticNodesDsl.g:643:2: rule__RepositoryManager__Group_1__1__Impl
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
    // InternalSemanticNodesDsl.g:649:1: rule__RepositoryManager__Group_1__1__Impl : ( ( rule__RepositoryManager__RepositoriesAssignment_1_1 )* ) ;
    public final void rule__RepositoryManager__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:653:1: ( ( ( rule__RepositoryManager__RepositoriesAssignment_1_1 )* ) )
            // InternalSemanticNodesDsl.g:654:1: ( ( rule__RepositoryManager__RepositoriesAssignment_1_1 )* )
            {
            // InternalSemanticNodesDsl.g:654:1: ( ( rule__RepositoryManager__RepositoriesAssignment_1_1 )* )
            // InternalSemanticNodesDsl.g:655:2: ( rule__RepositoryManager__RepositoriesAssignment_1_1 )*
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_1_1()); 
            // InternalSemanticNodesDsl.g:656:2: ( rule__RepositoryManager__RepositoriesAssignment_1_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:656:3: rule__RepositoryManager__RepositoriesAssignment_1_1
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
    // InternalSemanticNodesDsl.g:665:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:669:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalSemanticNodesDsl.g:670:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
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
    // InternalSemanticNodesDsl.g:677:1: rule__Repository__Group__0__Impl : ( () ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:681:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:682:1: ( () )
            {
            // InternalSemanticNodesDsl.g:682:1: ( () )
            // InternalSemanticNodesDsl.g:683:2: ()
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryAction_0()); 
            // InternalSemanticNodesDsl.g:684:2: ()
            // InternalSemanticNodesDsl.g:684:3: 
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
    // InternalSemanticNodesDsl.g:692:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:696:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalSemanticNodesDsl.g:697:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
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
    // InternalSemanticNodesDsl.g:704:1: rule__Repository__Group__1__Impl : ( 'repository' ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:708:1: ( ( 'repository' ) )
            // InternalSemanticNodesDsl.g:709:1: ( 'repository' )
            {
            // InternalSemanticNodesDsl.g:709:1: ( 'repository' )
            // InternalSemanticNodesDsl.g:710:2: 'repository'
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
    // InternalSemanticNodesDsl.g:719:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:723:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalSemanticNodesDsl.g:724:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
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
    // InternalSemanticNodesDsl.g:731:1: rule__Repository__Group__2__Impl : ( ( rule__Repository__NameAssignment_2 ) ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:735:1: ( ( ( rule__Repository__NameAssignment_2 ) ) )
            // InternalSemanticNodesDsl.g:736:1: ( ( rule__Repository__NameAssignment_2 ) )
            {
            // InternalSemanticNodesDsl.g:736:1: ( ( rule__Repository__NameAssignment_2 ) )
            // InternalSemanticNodesDsl.g:737:2: ( rule__Repository__NameAssignment_2 )
            {
             before(grammarAccess.getRepositoryAccess().getNameAssignment_2()); 
            // InternalSemanticNodesDsl.g:738:2: ( rule__Repository__NameAssignment_2 )
            // InternalSemanticNodesDsl.g:738:3: rule__Repository__NameAssignment_2
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
    // InternalSemanticNodesDsl.g:746:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:750:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalSemanticNodesDsl.g:751:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
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
    // InternalSemanticNodesDsl.g:758:1: rule__Repository__Group__3__Impl : ( '{' ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:762:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:763:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:763:1: ( '{' )
            // InternalSemanticNodesDsl.g:764:2: '{'
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
    // InternalSemanticNodesDsl.g:773:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl rule__Repository__Group__5 ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:777:1: ( rule__Repository__Group__4__Impl rule__Repository__Group__5 )
            // InternalSemanticNodesDsl.g:778:2: rule__Repository__Group__4__Impl rule__Repository__Group__5
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
    // InternalSemanticNodesDsl.g:785:1: rule__Repository__Group__4__Impl : ( ( rule__Repository__ResourcesAssignment_4 ) ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:789:1: ( ( ( rule__Repository__ResourcesAssignment_4 ) ) )
            // InternalSemanticNodesDsl.g:790:1: ( ( rule__Repository__ResourcesAssignment_4 ) )
            {
            // InternalSemanticNodesDsl.g:790:1: ( ( rule__Repository__ResourcesAssignment_4 ) )
            // InternalSemanticNodesDsl.g:791:2: ( rule__Repository__ResourcesAssignment_4 )
            {
             before(grammarAccess.getRepositoryAccess().getResourcesAssignment_4()); 
            // InternalSemanticNodesDsl.g:792:2: ( rule__Repository__ResourcesAssignment_4 )
            // InternalSemanticNodesDsl.g:792:3: rule__Repository__ResourcesAssignment_4
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
    // InternalSemanticNodesDsl.g:800:1: rule__Repository__Group__5 : rule__Repository__Group__5__Impl rule__Repository__Group__6 ;
    public final void rule__Repository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:804:1: ( rule__Repository__Group__5__Impl rule__Repository__Group__6 )
            // InternalSemanticNodesDsl.g:805:2: rule__Repository__Group__5__Impl rule__Repository__Group__6
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
    // InternalSemanticNodesDsl.g:812:1: rule__Repository__Group__5__Impl : ( ( rule__Repository__ResourcesAssignment_5 )* ) ;
    public final void rule__Repository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:816:1: ( ( ( rule__Repository__ResourcesAssignment_5 )* ) )
            // InternalSemanticNodesDsl.g:817:1: ( ( rule__Repository__ResourcesAssignment_5 )* )
            {
            // InternalSemanticNodesDsl.g:817:1: ( ( rule__Repository__ResourcesAssignment_5 )* )
            // InternalSemanticNodesDsl.g:818:2: ( rule__Repository__ResourcesAssignment_5 )*
            {
             before(grammarAccess.getRepositoryAccess().getResourcesAssignment_5()); 
            // InternalSemanticNodesDsl.g:819:2: ( rule__Repository__ResourcesAssignment_5 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==29) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:819:3: rule__Repository__ResourcesAssignment_5
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
    // InternalSemanticNodesDsl.g:827:1: rule__Repository__Group__6 : rule__Repository__Group__6__Impl ;
    public final void rule__Repository__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:831:1: ( rule__Repository__Group__6__Impl )
            // InternalSemanticNodesDsl.g:832:2: rule__Repository__Group__6__Impl
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
    // InternalSemanticNodesDsl.g:838:1: rule__Repository__Group__6__Impl : ( '}' ) ;
    public final void rule__Repository__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:842:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:843:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:843:1: ( '}' )
            // InternalSemanticNodesDsl.g:844:2: '}'
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
    // InternalSemanticNodesDsl.g:854:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:858:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalSemanticNodesDsl.g:859:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
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
    // InternalSemanticNodesDsl.g:866:1: rule__Resource__Group__0__Impl : ( () ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:870:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:871:1: ( () )
            {
            // InternalSemanticNodesDsl.g:871:1: ( () )
            // InternalSemanticNodesDsl.g:872:2: ()
            {
             before(grammarAccess.getResourceAccess().getResourceAction_0()); 
            // InternalSemanticNodesDsl.g:873:2: ()
            // InternalSemanticNodesDsl.g:873:3: 
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
    // InternalSemanticNodesDsl.g:881:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:885:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalSemanticNodesDsl.g:886:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
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
    // InternalSemanticNodesDsl.g:893:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__Group_1__0 )? ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:897:1: ( ( ( rule__Resource__Group_1__0 )? ) )
            // InternalSemanticNodesDsl.g:898:1: ( ( rule__Resource__Group_1__0 )? )
            {
            // InternalSemanticNodesDsl.g:898:1: ( ( rule__Resource__Group_1__0 )? )
            // InternalSemanticNodesDsl.g:899:2: ( rule__Resource__Group_1__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_1()); 
            // InternalSemanticNodesDsl.g:900:2: ( rule__Resource__Group_1__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSemanticNodesDsl.g:900:3: rule__Resource__Group_1__0
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
    // InternalSemanticNodesDsl.g:908:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:912:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalSemanticNodesDsl.g:913:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
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
    // InternalSemanticNodesDsl.g:920:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__AssistantAssignment_2 ) ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:924:1: ( ( ( rule__Resource__AssistantAssignment_2 ) ) )
            // InternalSemanticNodesDsl.g:925:1: ( ( rule__Resource__AssistantAssignment_2 ) )
            {
            // InternalSemanticNodesDsl.g:925:1: ( ( rule__Resource__AssistantAssignment_2 ) )
            // InternalSemanticNodesDsl.g:926:2: ( rule__Resource__AssistantAssignment_2 )
            {
             before(grammarAccess.getResourceAccess().getAssistantAssignment_2()); 
            // InternalSemanticNodesDsl.g:927:2: ( rule__Resource__AssistantAssignment_2 )
            // InternalSemanticNodesDsl.g:927:3: rule__Resource__AssistantAssignment_2
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
    // InternalSemanticNodesDsl.g:935:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:939:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalSemanticNodesDsl.g:940:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
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
    // InternalSemanticNodesDsl.g:947:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__NameAssignment_3 ) ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:951:1: ( ( ( rule__Resource__NameAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:952:1: ( ( rule__Resource__NameAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:952:1: ( ( rule__Resource__NameAssignment_3 ) )
            // InternalSemanticNodesDsl.g:953:2: ( rule__Resource__NameAssignment_3 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_3()); 
            // InternalSemanticNodesDsl.g:954:2: ( rule__Resource__NameAssignment_3 )
            // InternalSemanticNodesDsl.g:954:3: rule__Resource__NameAssignment_3
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
    // InternalSemanticNodesDsl.g:962:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:966:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalSemanticNodesDsl.g:967:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
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
    // InternalSemanticNodesDsl.g:974:1: rule__Resource__Group__4__Impl : ( '{' ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:978:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:979:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:979:1: ( '{' )
            // InternalSemanticNodesDsl.g:980:2: '{'
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
    // InternalSemanticNodesDsl.g:989:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl rule__Resource__Group__6 ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:993:1: ( rule__Resource__Group__5__Impl rule__Resource__Group__6 )
            // InternalSemanticNodesDsl.g:994:2: rule__Resource__Group__5__Impl rule__Resource__Group__6
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
    // InternalSemanticNodesDsl.g:1001:1: rule__Resource__Group__5__Impl : ( ( rule__Resource__Group_5__0 )? ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1005:1: ( ( ( rule__Resource__Group_5__0 )? ) )
            // InternalSemanticNodesDsl.g:1006:1: ( ( rule__Resource__Group_5__0 )? )
            {
            // InternalSemanticNodesDsl.g:1006:1: ( ( rule__Resource__Group_5__0 )? )
            // InternalSemanticNodesDsl.g:1007:2: ( rule__Resource__Group_5__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_5()); 
            // InternalSemanticNodesDsl.g:1008:2: ( rule__Resource__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==21||LA9_0==23||(LA9_0>=29 && LA9_0<=30)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1008:3: rule__Resource__Group_5__0
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
    // InternalSemanticNodesDsl.g:1016:1: rule__Resource__Group__6 : rule__Resource__Group__6__Impl rule__Resource__Group__7 ;
    public final void rule__Resource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1020:1: ( rule__Resource__Group__6__Impl rule__Resource__Group__7 )
            // InternalSemanticNodesDsl.g:1021:2: rule__Resource__Group__6__Impl rule__Resource__Group__7
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
    // InternalSemanticNodesDsl.g:1028:1: rule__Resource__Group__6__Impl : ( '}' ) ;
    public final void rule__Resource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1032:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1033:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1033:1: ( '}' )
            // InternalSemanticNodesDsl.g:1034:2: '}'
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
    // InternalSemanticNodesDsl.g:1043:1: rule__Resource__Group__7 : rule__Resource__Group__7__Impl ;
    public final void rule__Resource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1047:1: ( rule__Resource__Group__7__Impl )
            // InternalSemanticNodesDsl.g:1048:2: rule__Resource__Group__7__Impl
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
    // InternalSemanticNodesDsl.g:1054:1: rule__Resource__Group__7__Impl : ( ( rule__Resource__Group_7__0 )? ) ;
    public final void rule__Resource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1058:1: ( ( ( rule__Resource__Group_7__0 )? ) )
            // InternalSemanticNodesDsl.g:1059:1: ( ( rule__Resource__Group_7__0 )? )
            {
            // InternalSemanticNodesDsl.g:1059:1: ( ( rule__Resource__Group_7__0 )? )
            // InternalSemanticNodesDsl.g:1060:2: ( rule__Resource__Group_7__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_7()); 
            // InternalSemanticNodesDsl.g:1061:2: ( rule__Resource__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1061:3: rule__Resource__Group_7__0
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
    // InternalSemanticNodesDsl.g:1070:1: rule__Resource__Group_1__0 : rule__Resource__Group_1__0__Impl rule__Resource__Group_1__1 ;
    public final void rule__Resource__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1074:1: ( rule__Resource__Group_1__0__Impl rule__Resource__Group_1__1 )
            // InternalSemanticNodesDsl.g:1075:2: rule__Resource__Group_1__0__Impl rule__Resource__Group_1__1
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
    // InternalSemanticNodesDsl.g:1082:1: rule__Resource__Group_1__0__Impl : ( ( rule__Resource__AnnotationsAssignment_1_0 ) ) ;
    public final void rule__Resource__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1086:1: ( ( ( rule__Resource__AnnotationsAssignment_1_0 ) ) )
            // InternalSemanticNodesDsl.g:1087:1: ( ( rule__Resource__AnnotationsAssignment_1_0 ) )
            {
            // InternalSemanticNodesDsl.g:1087:1: ( ( rule__Resource__AnnotationsAssignment_1_0 ) )
            // InternalSemanticNodesDsl.g:1088:2: ( rule__Resource__AnnotationsAssignment_1_0 )
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_0()); 
            // InternalSemanticNodesDsl.g:1089:2: ( rule__Resource__AnnotationsAssignment_1_0 )
            // InternalSemanticNodesDsl.g:1089:3: rule__Resource__AnnotationsAssignment_1_0
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
    // InternalSemanticNodesDsl.g:1097:1: rule__Resource__Group_1__1 : rule__Resource__Group_1__1__Impl ;
    public final void rule__Resource__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1101:1: ( rule__Resource__Group_1__1__Impl )
            // InternalSemanticNodesDsl.g:1102:2: rule__Resource__Group_1__1__Impl
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
    // InternalSemanticNodesDsl.g:1108:1: rule__Resource__Group_1__1__Impl : ( ( rule__Resource__AnnotationsAssignment_1_1 )* ) ;
    public final void rule__Resource__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1112:1: ( ( ( rule__Resource__AnnotationsAssignment_1_1 )* ) )
            // InternalSemanticNodesDsl.g:1113:1: ( ( rule__Resource__AnnotationsAssignment_1_1 )* )
            {
            // InternalSemanticNodesDsl.g:1113:1: ( ( rule__Resource__AnnotationsAssignment_1_1 )* )
            // InternalSemanticNodesDsl.g:1114:2: ( rule__Resource__AnnotationsAssignment_1_1 )*
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_1()); 
            // InternalSemanticNodesDsl.g:1115:2: ( rule__Resource__AnnotationsAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1115:3: rule__Resource__AnnotationsAssignment_1_1
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
    // InternalSemanticNodesDsl.g:1124:1: rule__Resource__Group_5__0 : rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 ;
    public final void rule__Resource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1128:1: ( rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 )
            // InternalSemanticNodesDsl.g:1129:2: rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1
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
    // InternalSemanticNodesDsl.g:1136:1: rule__Resource__Group_5__0__Impl : ( ( rule__Resource__ResourceElementsAssignment_5_0 ) ) ;
    public final void rule__Resource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1140:1: ( ( ( rule__Resource__ResourceElementsAssignment_5_0 ) ) )
            // InternalSemanticNodesDsl.g:1141:1: ( ( rule__Resource__ResourceElementsAssignment_5_0 ) )
            {
            // InternalSemanticNodesDsl.g:1141:1: ( ( rule__Resource__ResourceElementsAssignment_5_0 ) )
            // InternalSemanticNodesDsl.g:1142:2: ( rule__Resource__ResourceElementsAssignment_5_0 )
            {
             before(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_0()); 
            // InternalSemanticNodesDsl.g:1143:2: ( rule__Resource__ResourceElementsAssignment_5_0 )
            // InternalSemanticNodesDsl.g:1143:3: rule__Resource__ResourceElementsAssignment_5_0
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
    // InternalSemanticNodesDsl.g:1151:1: rule__Resource__Group_5__1 : rule__Resource__Group_5__1__Impl ;
    public final void rule__Resource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1155:1: ( rule__Resource__Group_5__1__Impl )
            // InternalSemanticNodesDsl.g:1156:2: rule__Resource__Group_5__1__Impl
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
    // InternalSemanticNodesDsl.g:1162:1: rule__Resource__Group_5__1__Impl : ( ( rule__Resource__ResourceElementsAssignment_5_1 )* ) ;
    public final void rule__Resource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1166:1: ( ( ( rule__Resource__ResourceElementsAssignment_5_1 )* ) )
            // InternalSemanticNodesDsl.g:1167:1: ( ( rule__Resource__ResourceElementsAssignment_5_1 )* )
            {
            // InternalSemanticNodesDsl.g:1167:1: ( ( rule__Resource__ResourceElementsAssignment_5_1 )* )
            // InternalSemanticNodesDsl.g:1168:2: ( rule__Resource__ResourceElementsAssignment_5_1 )*
            {
             before(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_1()); 
            // InternalSemanticNodesDsl.g:1169:2: ( rule__Resource__ResourceElementsAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||LA12_0==21||LA12_0==23||(LA12_0>=29 && LA12_0<=30)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1169:3: rule__Resource__ResourceElementsAssignment_5_1
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
    // InternalSemanticNodesDsl.g:1178:1: rule__Resource__Group_7__0 : rule__Resource__Group_7__0__Impl rule__Resource__Group_7__1 ;
    public final void rule__Resource__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1182:1: ( rule__Resource__Group_7__0__Impl rule__Resource__Group_7__1 )
            // InternalSemanticNodesDsl.g:1183:2: rule__Resource__Group_7__0__Impl rule__Resource__Group_7__1
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
    // InternalSemanticNodesDsl.g:1190:1: rule__Resource__Group_7__0__Impl : ( 'metadata' ) ;
    public final void rule__Resource__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1194:1: ( ( 'metadata' ) )
            // InternalSemanticNodesDsl.g:1195:1: ( 'metadata' )
            {
            // InternalSemanticNodesDsl.g:1195:1: ( 'metadata' )
            // InternalSemanticNodesDsl.g:1196:2: 'metadata'
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
    // InternalSemanticNodesDsl.g:1205:1: rule__Resource__Group_7__1 : rule__Resource__Group_7__1__Impl rule__Resource__Group_7__2 ;
    public final void rule__Resource__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1209:1: ( rule__Resource__Group_7__1__Impl rule__Resource__Group_7__2 )
            // InternalSemanticNodesDsl.g:1210:2: rule__Resource__Group_7__1__Impl rule__Resource__Group_7__2
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
    // InternalSemanticNodesDsl.g:1217:1: rule__Resource__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Resource__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1221:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:1222:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:1222:1: ( '{' )
            // InternalSemanticNodesDsl.g:1223:2: '{'
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
    // InternalSemanticNodesDsl.g:1232:1: rule__Resource__Group_7__2 : rule__Resource__Group_7__2__Impl rule__Resource__Group_7__3 ;
    public final void rule__Resource__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1236:1: ( rule__Resource__Group_7__2__Impl rule__Resource__Group_7__3 )
            // InternalSemanticNodesDsl.g:1237:2: rule__Resource__Group_7__2__Impl rule__Resource__Group_7__3
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
    // InternalSemanticNodesDsl.g:1244:1: rule__Resource__Group_7__2__Impl : ( ( rule__Resource__MetadataAssignment_7_2 ) ) ;
    public final void rule__Resource__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1248:1: ( ( ( rule__Resource__MetadataAssignment_7_2 ) ) )
            // InternalSemanticNodesDsl.g:1249:1: ( ( rule__Resource__MetadataAssignment_7_2 ) )
            {
            // InternalSemanticNodesDsl.g:1249:1: ( ( rule__Resource__MetadataAssignment_7_2 ) )
            // InternalSemanticNodesDsl.g:1250:2: ( rule__Resource__MetadataAssignment_7_2 )
            {
             before(grammarAccess.getResourceAccess().getMetadataAssignment_7_2()); 
            // InternalSemanticNodesDsl.g:1251:2: ( rule__Resource__MetadataAssignment_7_2 )
            // InternalSemanticNodesDsl.g:1251:3: rule__Resource__MetadataAssignment_7_2
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
    // InternalSemanticNodesDsl.g:1259:1: rule__Resource__Group_7__3 : rule__Resource__Group_7__3__Impl rule__Resource__Group_7__4 ;
    public final void rule__Resource__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1263:1: ( rule__Resource__Group_7__3__Impl rule__Resource__Group_7__4 )
            // InternalSemanticNodesDsl.g:1264:2: rule__Resource__Group_7__3__Impl rule__Resource__Group_7__4
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
    // InternalSemanticNodesDsl.g:1271:1: rule__Resource__Group_7__3__Impl : ( ( rule__Resource__Group_7_3__0 )* ) ;
    public final void rule__Resource__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1275:1: ( ( ( rule__Resource__Group_7_3__0 )* ) )
            // InternalSemanticNodesDsl.g:1276:1: ( ( rule__Resource__Group_7_3__0 )* )
            {
            // InternalSemanticNodesDsl.g:1276:1: ( ( rule__Resource__Group_7_3__0 )* )
            // InternalSemanticNodesDsl.g:1277:2: ( rule__Resource__Group_7_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_7_3()); 
            // InternalSemanticNodesDsl.g:1278:2: ( rule__Resource__Group_7_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1278:3: rule__Resource__Group_7_3__0
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
    // InternalSemanticNodesDsl.g:1286:1: rule__Resource__Group_7__4 : rule__Resource__Group_7__4__Impl ;
    public final void rule__Resource__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1290:1: ( rule__Resource__Group_7__4__Impl )
            // InternalSemanticNodesDsl.g:1291:2: rule__Resource__Group_7__4__Impl
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
    // InternalSemanticNodesDsl.g:1297:1: rule__Resource__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Resource__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1301:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1302:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1302:1: ( '}' )
            // InternalSemanticNodesDsl.g:1303:2: '}'
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
    // InternalSemanticNodesDsl.g:1313:1: rule__Resource__Group_7_3__0 : rule__Resource__Group_7_3__0__Impl rule__Resource__Group_7_3__1 ;
    public final void rule__Resource__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1317:1: ( rule__Resource__Group_7_3__0__Impl rule__Resource__Group_7_3__1 )
            // InternalSemanticNodesDsl.g:1318:2: rule__Resource__Group_7_3__0__Impl rule__Resource__Group_7_3__1
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
    // InternalSemanticNodesDsl.g:1325:1: rule__Resource__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1329:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:1330:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:1330:1: ( ',' )
            // InternalSemanticNodesDsl.g:1331:2: ','
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
    // InternalSemanticNodesDsl.g:1340:1: rule__Resource__Group_7_3__1 : rule__Resource__Group_7_3__1__Impl ;
    public final void rule__Resource__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1344:1: ( rule__Resource__Group_7_3__1__Impl )
            // InternalSemanticNodesDsl.g:1345:2: rule__Resource__Group_7_3__1__Impl
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
    // InternalSemanticNodesDsl.g:1351:1: rule__Resource__Group_7_3__1__Impl : ( ( rule__Resource__MetadataAssignment_7_3_1 ) ) ;
    public final void rule__Resource__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1355:1: ( ( ( rule__Resource__MetadataAssignment_7_3_1 ) ) )
            // InternalSemanticNodesDsl.g:1356:1: ( ( rule__Resource__MetadataAssignment_7_3_1 ) )
            {
            // InternalSemanticNodesDsl.g:1356:1: ( ( rule__Resource__MetadataAssignment_7_3_1 ) )
            // InternalSemanticNodesDsl.g:1357:2: ( rule__Resource__MetadataAssignment_7_3_1 )
            {
             before(grammarAccess.getResourceAccess().getMetadataAssignment_7_3_1()); 
            // InternalSemanticNodesDsl.g:1358:2: ( rule__Resource__MetadataAssignment_7_3_1 )
            // InternalSemanticNodesDsl.g:1358:3: rule__Resource__MetadataAssignment_7_3_1
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


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSemanticNodesDsl.g:1367:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1371:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSemanticNodesDsl.g:1372:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalSemanticNodesDsl.g:1379:1: rule__Enumeration__Group__0__Impl : ( () ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1383:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:1384:1: ( () )
            {
            // InternalSemanticNodesDsl.g:1384:1: ( () )
            // InternalSemanticNodesDsl.g:1385:2: ()
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 
            // InternalSemanticNodesDsl.g:1386:2: ()
            // InternalSemanticNodesDsl.g:1386:3: 
            {
            }

             after(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // InternalSemanticNodesDsl.g:1394:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1398:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSemanticNodesDsl.g:1399:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalSemanticNodesDsl.g:1406:1: rule__Enumeration__Group__1__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1410:1: ( ( 'enum' ) )
            // InternalSemanticNodesDsl.g:1411:1: ( 'enum' )
            {
            // InternalSemanticNodesDsl.g:1411:1: ( 'enum' )
            // InternalSemanticNodesDsl.g:1412:2: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getEnumKeyword_1()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1421:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1425:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSemanticNodesDsl.g:1426:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalSemanticNodesDsl.g:1433:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1437:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) )
            // InternalSemanticNodesDsl.g:1438:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            {
            // InternalSemanticNodesDsl.g:1438:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // InternalSemanticNodesDsl.g:1439:2: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // InternalSemanticNodesDsl.g:1440:2: ( rule__Enumeration__NameAssignment_2 )
            // InternalSemanticNodesDsl.g:1440:3: rule__Enumeration__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1448:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1452:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSemanticNodesDsl.g:1453:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:1460:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1464:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:1465:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:1465:1: ( '{' )
            // InternalSemanticNodesDsl.g:1466:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1475:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1479:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSemanticNodesDsl.g:1480:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:1487:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )? ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1491:1: ( ( ( rule__Enumeration__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:1492:1: ( ( rule__Enumeration__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:1492:1: ( ( rule__Enumeration__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:1493:2: ( rule__Enumeration__Group_4__0 )?
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:1494:2: ( rule__Enumeration__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_INT||LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1494:3: rule__Enumeration__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Enumeration__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

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
    // InternalSemanticNodesDsl.g:1502:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1506:1: ( rule__Enumeration__Group__5__Impl )
            // InternalSemanticNodesDsl.g:1507:2: rule__Enumeration__Group__5__Impl
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
    // InternalSemanticNodesDsl.g:1513:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1517:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1518:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1518:1: ( '}' )
            // InternalSemanticNodesDsl.g:1519:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:1529:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1533:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // InternalSemanticNodesDsl.g:1534:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSemanticNodesDsl.g:1541:1: rule__Enumeration__Group_4__0__Impl : ( ( rule__Enumeration__LiteralsAssignment_4_0 ) ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1545:1: ( ( ( rule__Enumeration__LiteralsAssignment_4_0 ) ) )
            // InternalSemanticNodesDsl.g:1546:1: ( ( rule__Enumeration__LiteralsAssignment_4_0 ) )
            {
            // InternalSemanticNodesDsl.g:1546:1: ( ( rule__Enumeration__LiteralsAssignment_4_0 ) )
            // InternalSemanticNodesDsl.g:1547:2: ( rule__Enumeration__LiteralsAssignment_4_0 )
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_0()); 
            // InternalSemanticNodesDsl.g:1548:2: ( rule__Enumeration__LiteralsAssignment_4_0 )
            // InternalSemanticNodesDsl.g:1548:3: rule__Enumeration__LiteralsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Enumeration__LiteralsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_0()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1556:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1560:1: ( rule__Enumeration__Group_4__1__Impl )
            // InternalSemanticNodesDsl.g:1561:2: rule__Enumeration__Group_4__1__Impl
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
    // InternalSemanticNodesDsl.g:1567:1: rule__Enumeration__Group_4__1__Impl : ( ( rule__Enumeration__LiteralsAssignment_4_1 )* ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1571:1: ( ( ( rule__Enumeration__LiteralsAssignment_4_1 )* ) )
            // InternalSemanticNodesDsl.g:1572:1: ( ( rule__Enumeration__LiteralsAssignment_4_1 )* )
            {
            // InternalSemanticNodesDsl.g:1572:1: ( ( rule__Enumeration__LiteralsAssignment_4_1 )* )
            // InternalSemanticNodesDsl.g:1573:2: ( rule__Enumeration__LiteralsAssignment_4_1 )*
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:1574:2: ( rule__Enumeration__LiteralsAssignment_4_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_INT||LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1574:3: rule__Enumeration__LiteralsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Enumeration__LiteralsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__EnumerationLiteral__Group__0"
    // InternalSemanticNodesDsl.g:1583:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1587:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalSemanticNodesDsl.g:1588:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EnumerationLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0"


    // $ANTLR start "rule__EnumerationLiteral__Group__0__Impl"
    // InternalSemanticNodesDsl.g:1595:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1599:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:1600:1: ( () )
            {
            // InternalSemanticNodesDsl.g:1600:1: ( () )
            // InternalSemanticNodesDsl.g:1601:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalSemanticNodesDsl.g:1602:2: ()
            // InternalSemanticNodesDsl.g:1602:3: 
            {
            }

             after(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__0__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__1"
    // InternalSemanticNodesDsl.g:1610:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1614:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // InternalSemanticNodesDsl.g:1615:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__EnumerationLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1"


    // $ANTLR start "rule__EnumerationLiteral__Group__1__Impl"
    // InternalSemanticNodesDsl.g:1622:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__ValueAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1626:1: ( ( ( rule__EnumerationLiteral__ValueAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:1627:1: ( ( rule__EnumerationLiteral__ValueAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:1627:1: ( ( rule__EnumerationLiteral__ValueAssignment_1 ) )
            // InternalSemanticNodesDsl.g:1628:2: ( rule__EnumerationLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getValueAssignment_1()); 
            // InternalSemanticNodesDsl.g:1629:2: ( rule__EnumerationLiteral__ValueAssignment_1 )
            // InternalSemanticNodesDsl.g:1629:3: rule__EnumerationLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__1__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__2"
    // InternalSemanticNodesDsl.g:1637:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3 ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1641:1: ( rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3 )
            // InternalSemanticNodesDsl.g:1642:2: rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2"


    // $ANTLR start "rule__EnumerationLiteral__Group__2__Impl"
    // InternalSemanticNodesDsl.g:1649:1: rule__EnumerationLiteral__Group__2__Impl : ( '->' ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1653:1: ( ( '->' ) )
            // InternalSemanticNodesDsl.g:1654:1: ( '->' )
            {
            // InternalSemanticNodesDsl.g:1654:1: ( '->' )
            // InternalSemanticNodesDsl.g:1655:2: '->'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__2__Impl"


    // $ANTLR start "rule__EnumerationLiteral__Group__3"
    // InternalSemanticNodesDsl.g:1664:1: rule__EnumerationLiteral__Group__3 : rule__EnumerationLiteral__Group__3__Impl ;
    public final void rule__EnumerationLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1668:1: ( rule__EnumerationLiteral__Group__3__Impl )
            // InternalSemanticNodesDsl.g:1669:2: rule__EnumerationLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__3"


    // $ANTLR start "rule__EnumerationLiteral__Group__3__Impl"
    // InternalSemanticNodesDsl.g:1675:1: rule__EnumerationLiteral__Group__3__Impl : ( ( rule__EnumerationLiteral__LiteralAssignment_3 ) ) ;
    public final void rule__EnumerationLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1679:1: ( ( ( rule__EnumerationLiteral__LiteralAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:1680:1: ( ( rule__EnumerationLiteral__LiteralAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:1680:1: ( ( rule__EnumerationLiteral__LiteralAssignment_3 ) )
            // InternalSemanticNodesDsl.g:1681:2: ( rule__EnumerationLiteral__LiteralAssignment_3 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getLiteralAssignment_3()); 
            // InternalSemanticNodesDsl.g:1682:2: ( rule__EnumerationLiteral__LiteralAssignment_3 )
            // InternalSemanticNodesDsl.g:1682:3: rule__EnumerationLiteral__LiteralAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationLiteral__LiteralAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationLiteralAccess().getLiteralAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__Group__3__Impl"


    // $ANTLR start "rule__SemanticNode__Group__0"
    // InternalSemanticNodesDsl.g:1691:1: rule__SemanticNode__Group__0 : rule__SemanticNode__Group__0__Impl rule__SemanticNode__Group__1 ;
    public final void rule__SemanticNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1695:1: ( rule__SemanticNode__Group__0__Impl rule__SemanticNode__Group__1 )
            // InternalSemanticNodesDsl.g:1696:2: rule__SemanticNode__Group__0__Impl rule__SemanticNode__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSemanticNodesDsl.g:1703:1: rule__SemanticNode__Group__0__Impl : ( () ) ;
    public final void rule__SemanticNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1707:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:1708:1: ( () )
            {
            // InternalSemanticNodesDsl.g:1708:1: ( () )
            // InternalSemanticNodesDsl.g:1709:2: ()
            {
             before(grammarAccess.getSemanticNodeAccess().getSemanticNodeAction_0()); 
            // InternalSemanticNodesDsl.g:1710:2: ()
            // InternalSemanticNodesDsl.g:1710:3: 
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
    // InternalSemanticNodesDsl.g:1718:1: rule__SemanticNode__Group__1 : rule__SemanticNode__Group__1__Impl rule__SemanticNode__Group__2 ;
    public final void rule__SemanticNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1722:1: ( rule__SemanticNode__Group__1__Impl rule__SemanticNode__Group__2 )
            // InternalSemanticNodesDsl.g:1723:2: rule__SemanticNode__Group__1__Impl rule__SemanticNode__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSemanticNodesDsl.g:1730:1: rule__SemanticNode__Group__1__Impl : ( ( rule__SemanticNode__Group_1__0 )? ) ;
    public final void rule__SemanticNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1734:1: ( ( ( rule__SemanticNode__Group_1__0 )? ) )
            // InternalSemanticNodesDsl.g:1735:1: ( ( rule__SemanticNode__Group_1__0 )? )
            {
            // InternalSemanticNodesDsl.g:1735:1: ( ( rule__SemanticNode__Group_1__0 )? )
            // InternalSemanticNodesDsl.g:1736:2: ( rule__SemanticNode__Group_1__0 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_1()); 
            // InternalSemanticNodesDsl.g:1737:2: ( rule__SemanticNode__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1737:3: rule__SemanticNode__Group_1__0
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
    // InternalSemanticNodesDsl.g:1745:1: rule__SemanticNode__Group__2 : rule__SemanticNode__Group__2__Impl rule__SemanticNode__Group__3 ;
    public final void rule__SemanticNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1749:1: ( rule__SemanticNode__Group__2__Impl rule__SemanticNode__Group__3 )
            // InternalSemanticNodesDsl.g:1750:2: rule__SemanticNode__Group__2__Impl rule__SemanticNode__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSemanticNodesDsl.g:1757:1: rule__SemanticNode__Group__2__Impl : ( ( rule__SemanticNode__AbstractAssignment_2 )? ) ;
    public final void rule__SemanticNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1761:1: ( ( ( rule__SemanticNode__AbstractAssignment_2 )? ) )
            // InternalSemanticNodesDsl.g:1762:1: ( ( rule__SemanticNode__AbstractAssignment_2 )? )
            {
            // InternalSemanticNodesDsl.g:1762:1: ( ( rule__SemanticNode__AbstractAssignment_2 )? )
            // InternalSemanticNodesDsl.g:1763:2: ( rule__SemanticNode__AbstractAssignment_2 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getAbstractAssignment_2()); 
            // InternalSemanticNodesDsl.g:1764:2: ( rule__SemanticNode__AbstractAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1764:3: rule__SemanticNode__AbstractAssignment_2
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
    // InternalSemanticNodesDsl.g:1772:1: rule__SemanticNode__Group__3 : rule__SemanticNode__Group__3__Impl rule__SemanticNode__Group__4 ;
    public final void rule__SemanticNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1776:1: ( rule__SemanticNode__Group__3__Impl rule__SemanticNode__Group__4 )
            // InternalSemanticNodesDsl.g:1777:2: rule__SemanticNode__Group__3__Impl rule__SemanticNode__Group__4
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
    // InternalSemanticNodesDsl.g:1784:1: rule__SemanticNode__Group__3__Impl : ( 'node' ) ;
    public final void rule__SemanticNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1788:1: ( ( 'node' ) )
            // InternalSemanticNodesDsl.g:1789:1: ( 'node' )
            {
            // InternalSemanticNodesDsl.g:1789:1: ( 'node' )
            // InternalSemanticNodesDsl.g:1790:2: 'node'
            {
             before(grammarAccess.getSemanticNodeAccess().getNodeKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:1799:1: rule__SemanticNode__Group__4 : rule__SemanticNode__Group__4__Impl rule__SemanticNode__Group__5 ;
    public final void rule__SemanticNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1803:1: ( rule__SemanticNode__Group__4__Impl rule__SemanticNode__Group__5 )
            // InternalSemanticNodesDsl.g:1804:2: rule__SemanticNode__Group__4__Impl rule__SemanticNode__Group__5
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
    // InternalSemanticNodesDsl.g:1811:1: rule__SemanticNode__Group__4__Impl : ( ( rule__SemanticNode__NameAssignment_4 ) ) ;
    public final void rule__SemanticNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1815:1: ( ( ( rule__SemanticNode__NameAssignment_4 ) ) )
            // InternalSemanticNodesDsl.g:1816:1: ( ( rule__SemanticNode__NameAssignment_4 ) )
            {
            // InternalSemanticNodesDsl.g:1816:1: ( ( rule__SemanticNode__NameAssignment_4 ) )
            // InternalSemanticNodesDsl.g:1817:2: ( rule__SemanticNode__NameAssignment_4 )
            {
             before(grammarAccess.getSemanticNodeAccess().getNameAssignment_4()); 
            // InternalSemanticNodesDsl.g:1818:2: ( rule__SemanticNode__NameAssignment_4 )
            // InternalSemanticNodesDsl.g:1818:3: rule__SemanticNode__NameAssignment_4
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
    // InternalSemanticNodesDsl.g:1826:1: rule__SemanticNode__Group__5 : rule__SemanticNode__Group__5__Impl rule__SemanticNode__Group__6 ;
    public final void rule__SemanticNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1830:1: ( rule__SemanticNode__Group__5__Impl rule__SemanticNode__Group__6 )
            // InternalSemanticNodesDsl.g:1831:2: rule__SemanticNode__Group__5__Impl rule__SemanticNode__Group__6
            {
            pushFollow(FOLLOW_23);
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
    // InternalSemanticNodesDsl.g:1838:1: rule__SemanticNode__Group__5__Impl : ( '{' ) ;
    public final void rule__SemanticNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1842:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:1843:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:1843:1: ( '{' )
            // InternalSemanticNodesDsl.g:1844:2: '{'
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
    // InternalSemanticNodesDsl.g:1853:1: rule__SemanticNode__Group__6 : rule__SemanticNode__Group__6__Impl rule__SemanticNode__Group__7 ;
    public final void rule__SemanticNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1857:1: ( rule__SemanticNode__Group__6__Impl rule__SemanticNode__Group__7 )
            // InternalSemanticNodesDsl.g:1858:2: rule__SemanticNode__Group__6__Impl rule__SemanticNode__Group__7
            {
            pushFollow(FOLLOW_23);
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
    // InternalSemanticNodesDsl.g:1865:1: rule__SemanticNode__Group__6__Impl : ( ( rule__SemanticNode__Group_6__0 )? ) ;
    public final void rule__SemanticNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1869:1: ( ( ( rule__SemanticNode__Group_6__0 )? ) )
            // InternalSemanticNodesDsl.g:1870:1: ( ( rule__SemanticNode__Group_6__0 )? )
            {
            // InternalSemanticNodesDsl.g:1870:1: ( ( rule__SemanticNode__Group_6__0 )? )
            // InternalSemanticNodesDsl.g:1871:2: ( rule__SemanticNode__Group_6__0 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_6()); 
            // InternalSemanticNodesDsl.g:1872:2: ( rule__SemanticNode__Group_6__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_ID)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1872:3: rule__SemanticNode__Group_6__0
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
    // InternalSemanticNodesDsl.g:1880:1: rule__SemanticNode__Group__7 : rule__SemanticNode__Group__7__Impl rule__SemanticNode__Group__8 ;
    public final void rule__SemanticNode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1884:1: ( rule__SemanticNode__Group__7__Impl rule__SemanticNode__Group__8 )
            // InternalSemanticNodesDsl.g:1885:2: rule__SemanticNode__Group__7__Impl rule__SemanticNode__Group__8
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
    // InternalSemanticNodesDsl.g:1892:1: rule__SemanticNode__Group__7__Impl : ( '}' ) ;
    public final void rule__SemanticNode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1896:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1897:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1897:1: ( '}' )
            // InternalSemanticNodesDsl.g:1898:2: '}'
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
    // InternalSemanticNodesDsl.g:1907:1: rule__SemanticNode__Group__8 : rule__SemanticNode__Group__8__Impl ;
    public final void rule__SemanticNode__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1911:1: ( rule__SemanticNode__Group__8__Impl )
            // InternalSemanticNodesDsl.g:1912:2: rule__SemanticNode__Group__8__Impl
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
    // InternalSemanticNodesDsl.g:1918:1: rule__SemanticNode__Group__8__Impl : ( ( rule__SemanticNode__Group_8__0 )? ) ;
    public final void rule__SemanticNode__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1922:1: ( ( ( rule__SemanticNode__Group_8__0 )? ) )
            // InternalSemanticNodesDsl.g:1923:1: ( ( rule__SemanticNode__Group_8__0 )? )
            {
            // InternalSemanticNodesDsl.g:1923:1: ( ( rule__SemanticNode__Group_8__0 )? )
            // InternalSemanticNodesDsl.g:1924:2: ( rule__SemanticNode__Group_8__0 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_8()); 
            // InternalSemanticNodesDsl.g:1925:2: ( rule__SemanticNode__Group_8__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1925:3: rule__SemanticNode__Group_8__0
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
    // InternalSemanticNodesDsl.g:1934:1: rule__SemanticNode__Group_1__0 : rule__SemanticNode__Group_1__0__Impl rule__SemanticNode__Group_1__1 ;
    public final void rule__SemanticNode__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1938:1: ( rule__SemanticNode__Group_1__0__Impl rule__SemanticNode__Group_1__1 )
            // InternalSemanticNodesDsl.g:1939:2: rule__SemanticNode__Group_1__0__Impl rule__SemanticNode__Group_1__1
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
    // InternalSemanticNodesDsl.g:1946:1: rule__SemanticNode__Group_1__0__Impl : ( ( rule__SemanticNode__AnnotationsAssignment_1_0 ) ) ;
    public final void rule__SemanticNode__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1950:1: ( ( ( rule__SemanticNode__AnnotationsAssignment_1_0 ) ) )
            // InternalSemanticNodesDsl.g:1951:1: ( ( rule__SemanticNode__AnnotationsAssignment_1_0 ) )
            {
            // InternalSemanticNodesDsl.g:1951:1: ( ( rule__SemanticNode__AnnotationsAssignment_1_0 ) )
            // InternalSemanticNodesDsl.g:1952:2: ( rule__SemanticNode__AnnotationsAssignment_1_0 )
            {
             before(grammarAccess.getSemanticNodeAccess().getAnnotationsAssignment_1_0()); 
            // InternalSemanticNodesDsl.g:1953:2: ( rule__SemanticNode__AnnotationsAssignment_1_0 )
            // InternalSemanticNodesDsl.g:1953:3: rule__SemanticNode__AnnotationsAssignment_1_0
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
    // InternalSemanticNodesDsl.g:1961:1: rule__SemanticNode__Group_1__1 : rule__SemanticNode__Group_1__1__Impl ;
    public final void rule__SemanticNode__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1965:1: ( rule__SemanticNode__Group_1__1__Impl )
            // InternalSemanticNodesDsl.g:1966:2: rule__SemanticNode__Group_1__1__Impl
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
    // InternalSemanticNodesDsl.g:1972:1: rule__SemanticNode__Group_1__1__Impl : ( ( rule__SemanticNode__AnnotationsAssignment_1_1 )* ) ;
    public final void rule__SemanticNode__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1976:1: ( ( ( rule__SemanticNode__AnnotationsAssignment_1_1 )* ) )
            // InternalSemanticNodesDsl.g:1977:1: ( ( rule__SemanticNode__AnnotationsAssignment_1_1 )* )
            {
            // InternalSemanticNodesDsl.g:1977:1: ( ( rule__SemanticNode__AnnotationsAssignment_1_1 )* )
            // InternalSemanticNodesDsl.g:1978:2: ( rule__SemanticNode__AnnotationsAssignment_1_1 )*
            {
             before(grammarAccess.getSemanticNodeAccess().getAnnotationsAssignment_1_1()); 
            // InternalSemanticNodesDsl.g:1979:2: ( rule__SemanticNode__AnnotationsAssignment_1_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==29) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1979:3: rule__SemanticNode__AnnotationsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SemanticNode__AnnotationsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalSemanticNodesDsl.g:1988:1: rule__SemanticNode__Group_6__0 : rule__SemanticNode__Group_6__0__Impl rule__SemanticNode__Group_6__1 ;
    public final void rule__SemanticNode__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1992:1: ( rule__SemanticNode__Group_6__0__Impl rule__SemanticNode__Group_6__1 )
            // InternalSemanticNodesDsl.g:1993:2: rule__SemanticNode__Group_6__0__Impl rule__SemanticNode__Group_6__1
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
    // InternalSemanticNodesDsl.g:2000:1: rule__SemanticNode__Group_6__0__Impl : ( ( rule__SemanticNode__PropertiesAssignment_6_0 ) ) ;
    public final void rule__SemanticNode__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2004:1: ( ( ( rule__SemanticNode__PropertiesAssignment_6_0 ) ) )
            // InternalSemanticNodesDsl.g:2005:1: ( ( rule__SemanticNode__PropertiesAssignment_6_0 ) )
            {
            // InternalSemanticNodesDsl.g:2005:1: ( ( rule__SemanticNode__PropertiesAssignment_6_0 ) )
            // InternalSemanticNodesDsl.g:2006:2: ( rule__SemanticNode__PropertiesAssignment_6_0 )
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_6_0()); 
            // InternalSemanticNodesDsl.g:2007:2: ( rule__SemanticNode__PropertiesAssignment_6_0 )
            // InternalSemanticNodesDsl.g:2007:3: rule__SemanticNode__PropertiesAssignment_6_0
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
    // InternalSemanticNodesDsl.g:2015:1: rule__SemanticNode__Group_6__1 : rule__SemanticNode__Group_6__1__Impl ;
    public final void rule__SemanticNode__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2019:1: ( rule__SemanticNode__Group_6__1__Impl )
            // InternalSemanticNodesDsl.g:2020:2: rule__SemanticNode__Group_6__1__Impl
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
    // InternalSemanticNodesDsl.g:2026:1: rule__SemanticNode__Group_6__1__Impl : ( ( rule__SemanticNode__PropertiesAssignment_6_1 )* ) ;
    public final void rule__SemanticNode__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2030:1: ( ( ( rule__SemanticNode__PropertiesAssignment_6_1 )* ) )
            // InternalSemanticNodesDsl.g:2031:1: ( ( rule__SemanticNode__PropertiesAssignment_6_1 )* )
            {
            // InternalSemanticNodesDsl.g:2031:1: ( ( rule__SemanticNode__PropertiesAssignment_6_1 )* )
            // InternalSemanticNodesDsl.g:2032:2: ( rule__SemanticNode__PropertiesAssignment_6_1 )*
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_6_1()); 
            // InternalSemanticNodesDsl.g:2033:2: ( rule__SemanticNode__PropertiesAssignment_6_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_ID)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:2033:3: rule__SemanticNode__PropertiesAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__SemanticNode__PropertiesAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalSemanticNodesDsl.g:2042:1: rule__SemanticNode__Group_8__0 : rule__SemanticNode__Group_8__0__Impl rule__SemanticNode__Group_8__1 ;
    public final void rule__SemanticNode__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2046:1: ( rule__SemanticNode__Group_8__0__Impl rule__SemanticNode__Group_8__1 )
            // InternalSemanticNodesDsl.g:2047:2: rule__SemanticNode__Group_8__0__Impl rule__SemanticNode__Group_8__1
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
    // InternalSemanticNodesDsl.g:2054:1: rule__SemanticNode__Group_8__0__Impl : ( '{' ) ;
    public final void rule__SemanticNode__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2058:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:2059:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:2059:1: ( '{' )
            // InternalSemanticNodesDsl.g:2060:2: '{'
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
    // InternalSemanticNodesDsl.g:2069:1: rule__SemanticNode__Group_8__1 : rule__SemanticNode__Group_8__1__Impl rule__SemanticNode__Group_8__2 ;
    public final void rule__SemanticNode__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2073:1: ( rule__SemanticNode__Group_8__1__Impl rule__SemanticNode__Group_8__2 )
            // InternalSemanticNodesDsl.g:2074:2: rule__SemanticNode__Group_8__1__Impl rule__SemanticNode__Group_8__2
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
    // InternalSemanticNodesDsl.g:2081:1: rule__SemanticNode__Group_8__1__Impl : ( ( rule__SemanticNode__MetadataAssignment_8_1 ) ) ;
    public final void rule__SemanticNode__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2085:1: ( ( ( rule__SemanticNode__MetadataAssignment_8_1 ) ) )
            // InternalSemanticNodesDsl.g:2086:1: ( ( rule__SemanticNode__MetadataAssignment_8_1 ) )
            {
            // InternalSemanticNodesDsl.g:2086:1: ( ( rule__SemanticNode__MetadataAssignment_8_1 ) )
            // InternalSemanticNodesDsl.g:2087:2: ( rule__SemanticNode__MetadataAssignment_8_1 )
            {
             before(grammarAccess.getSemanticNodeAccess().getMetadataAssignment_8_1()); 
            // InternalSemanticNodesDsl.g:2088:2: ( rule__SemanticNode__MetadataAssignment_8_1 )
            // InternalSemanticNodesDsl.g:2088:3: rule__SemanticNode__MetadataAssignment_8_1
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
    // InternalSemanticNodesDsl.g:2096:1: rule__SemanticNode__Group_8__2 : rule__SemanticNode__Group_8__2__Impl rule__SemanticNode__Group_8__3 ;
    public final void rule__SemanticNode__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2100:1: ( rule__SemanticNode__Group_8__2__Impl rule__SemanticNode__Group_8__3 )
            // InternalSemanticNodesDsl.g:2101:2: rule__SemanticNode__Group_8__2__Impl rule__SemanticNode__Group_8__3
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
    // InternalSemanticNodesDsl.g:2108:1: rule__SemanticNode__Group_8__2__Impl : ( ( rule__SemanticNode__Group_8_2__0 )* ) ;
    public final void rule__SemanticNode__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2112:1: ( ( ( rule__SemanticNode__Group_8_2__0 )* ) )
            // InternalSemanticNodesDsl.g:2113:1: ( ( rule__SemanticNode__Group_8_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:2113:1: ( ( rule__SemanticNode__Group_8_2__0 )* )
            // InternalSemanticNodesDsl.g:2114:2: ( rule__SemanticNode__Group_8_2__0 )*
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_8_2()); 
            // InternalSemanticNodesDsl.g:2115:2: ( rule__SemanticNode__Group_8_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==20) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:2115:3: rule__SemanticNode__Group_8_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__SemanticNode__Group_8_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSemanticNodesDsl.g:2123:1: rule__SemanticNode__Group_8__3 : rule__SemanticNode__Group_8__3__Impl ;
    public final void rule__SemanticNode__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2127:1: ( rule__SemanticNode__Group_8__3__Impl )
            // InternalSemanticNodesDsl.g:2128:2: rule__SemanticNode__Group_8__3__Impl
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
    // InternalSemanticNodesDsl.g:2134:1: rule__SemanticNode__Group_8__3__Impl : ( '}' ) ;
    public final void rule__SemanticNode__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2138:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:2139:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:2139:1: ( '}' )
            // InternalSemanticNodesDsl.g:2140:2: '}'
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
    // InternalSemanticNodesDsl.g:2150:1: rule__SemanticNode__Group_8_2__0 : rule__SemanticNode__Group_8_2__0__Impl rule__SemanticNode__Group_8_2__1 ;
    public final void rule__SemanticNode__Group_8_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2154:1: ( rule__SemanticNode__Group_8_2__0__Impl rule__SemanticNode__Group_8_2__1 )
            // InternalSemanticNodesDsl.g:2155:2: rule__SemanticNode__Group_8_2__0__Impl rule__SemanticNode__Group_8_2__1
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
    // InternalSemanticNodesDsl.g:2162:1: rule__SemanticNode__Group_8_2__0__Impl : ( ',' ) ;
    public final void rule__SemanticNode__Group_8_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2166:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2167:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2167:1: ( ',' )
            // InternalSemanticNodesDsl.g:2168:2: ','
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
    // InternalSemanticNodesDsl.g:2177:1: rule__SemanticNode__Group_8_2__1 : rule__SemanticNode__Group_8_2__1__Impl ;
    public final void rule__SemanticNode__Group_8_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2181:1: ( rule__SemanticNode__Group_8_2__1__Impl )
            // InternalSemanticNodesDsl.g:2182:2: rule__SemanticNode__Group_8_2__1__Impl
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
    // InternalSemanticNodesDsl.g:2188:1: rule__SemanticNode__Group_8_2__1__Impl : ( ( rule__SemanticNode__MetadataAssignment_8_2_1 ) ) ;
    public final void rule__SemanticNode__Group_8_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2192:1: ( ( ( rule__SemanticNode__MetadataAssignment_8_2_1 ) ) )
            // InternalSemanticNodesDsl.g:2193:1: ( ( rule__SemanticNode__MetadataAssignment_8_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:2193:1: ( ( rule__SemanticNode__MetadataAssignment_8_2_1 ) )
            // InternalSemanticNodesDsl.g:2194:2: ( rule__SemanticNode__MetadataAssignment_8_2_1 )
            {
             before(grammarAccess.getSemanticNodeAccess().getMetadataAssignment_8_2_1()); 
            // InternalSemanticNodesDsl.g:2195:2: ( rule__SemanticNode__MetadataAssignment_8_2_1 )
            // InternalSemanticNodesDsl.g:2195:3: rule__SemanticNode__MetadataAssignment_8_2_1
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
    // InternalSemanticNodesDsl.g:2204:1: rule__ObjectProperty__Group__0 : rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 ;
    public final void rule__ObjectProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2208:1: ( rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 )
            // InternalSemanticNodesDsl.g:2209:2: rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1
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
    // InternalSemanticNodesDsl.g:2216:1: rule__ObjectProperty__Group__0__Impl : ( () ) ;
    public final void rule__ObjectProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2220:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:2221:1: ( () )
            {
            // InternalSemanticNodesDsl.g:2221:1: ( () )
            // InternalSemanticNodesDsl.g:2222:2: ()
            {
             before(grammarAccess.getObjectPropertyAccess().getObjectPropertyAction_0()); 
            // InternalSemanticNodesDsl.g:2223:2: ()
            // InternalSemanticNodesDsl.g:2223:3: 
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
    // InternalSemanticNodesDsl.g:2231:1: rule__ObjectProperty__Group__1 : rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 ;
    public final void rule__ObjectProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2235:1: ( rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 )
            // InternalSemanticNodesDsl.g:2236:2: rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:2243:1: rule__ObjectProperty__Group__1__Impl : ( ( rule__ObjectProperty__NameAssignment_1 ) ) ;
    public final void rule__ObjectProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2247:1: ( ( ( rule__ObjectProperty__NameAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:2248:1: ( ( rule__ObjectProperty__NameAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:2248:1: ( ( rule__ObjectProperty__NameAssignment_1 ) )
            // InternalSemanticNodesDsl.g:2249:2: ( rule__ObjectProperty__NameAssignment_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getNameAssignment_1()); 
            // InternalSemanticNodesDsl.g:2250:2: ( rule__ObjectProperty__NameAssignment_1 )
            // InternalSemanticNodesDsl.g:2250:3: rule__ObjectProperty__NameAssignment_1
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
    // InternalSemanticNodesDsl.g:2258:1: rule__ObjectProperty__Group__2 : rule__ObjectProperty__Group__2__Impl rule__ObjectProperty__Group__3 ;
    public final void rule__ObjectProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2262:1: ( rule__ObjectProperty__Group__2__Impl rule__ObjectProperty__Group__3 )
            // InternalSemanticNodesDsl.g:2263:2: rule__ObjectProperty__Group__2__Impl rule__ObjectProperty__Group__3
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
    // InternalSemanticNodesDsl.g:2270:1: rule__ObjectProperty__Group__2__Impl : ( '->' ) ;
    public final void rule__ObjectProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2274:1: ( ( '->' ) )
            // InternalSemanticNodesDsl.g:2275:1: ( '->' )
            {
            // InternalSemanticNodesDsl.g:2275:1: ( '->' )
            // InternalSemanticNodesDsl.g:2276:2: '->'
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
    // InternalSemanticNodesDsl.g:2285:1: rule__ObjectProperty__Group__3 : rule__ObjectProperty__Group__3__Impl rule__ObjectProperty__Group__4 ;
    public final void rule__ObjectProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2289:1: ( rule__ObjectProperty__Group__3__Impl rule__ObjectProperty__Group__4 )
            // InternalSemanticNodesDsl.g:2290:2: rule__ObjectProperty__Group__3__Impl rule__ObjectProperty__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalSemanticNodesDsl.g:2297:1: rule__ObjectProperty__Group__3__Impl : ( ( rule__ObjectProperty__RangeAssignment_3 ) ) ;
    public final void rule__ObjectProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2301:1: ( ( ( rule__ObjectProperty__RangeAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:2302:1: ( ( rule__ObjectProperty__RangeAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:2302:1: ( ( rule__ObjectProperty__RangeAssignment_3 ) )
            // InternalSemanticNodesDsl.g:2303:2: ( rule__ObjectProperty__RangeAssignment_3 )
            {
             before(grammarAccess.getObjectPropertyAccess().getRangeAssignment_3()); 
            // InternalSemanticNodesDsl.g:2304:2: ( rule__ObjectProperty__RangeAssignment_3 )
            // InternalSemanticNodesDsl.g:2304:3: rule__ObjectProperty__RangeAssignment_3
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
    // InternalSemanticNodesDsl.g:2312:1: rule__ObjectProperty__Group__4 : rule__ObjectProperty__Group__4__Impl rule__ObjectProperty__Group__5 ;
    public final void rule__ObjectProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2316:1: ( rule__ObjectProperty__Group__4__Impl rule__ObjectProperty__Group__5 )
            // InternalSemanticNodesDsl.g:2317:2: rule__ObjectProperty__Group__4__Impl rule__ObjectProperty__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalSemanticNodesDsl.g:2324:1: rule__ObjectProperty__Group__4__Impl : ( ( rule__ObjectProperty__Group_4__0 )? ) ;
    public final void rule__ObjectProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2328:1: ( ( ( rule__ObjectProperty__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:2329:1: ( ( rule__ObjectProperty__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:2329:1: ( ( rule__ObjectProperty__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:2330:2: ( rule__ObjectProperty__Group_4__0 )?
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:2331:2: ( rule__ObjectProperty__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2331:3: rule__ObjectProperty__Group_4__0
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
    // InternalSemanticNodesDsl.g:2339:1: rule__ObjectProperty__Group__5 : rule__ObjectProperty__Group__5__Impl ;
    public final void rule__ObjectProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2343:1: ( rule__ObjectProperty__Group__5__Impl )
            // InternalSemanticNodesDsl.g:2344:2: rule__ObjectProperty__Group__5__Impl
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
    // InternalSemanticNodesDsl.g:2350:1: rule__ObjectProperty__Group__5__Impl : ( ( rule__ObjectProperty__Group_5__0 )? ) ;
    public final void rule__ObjectProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2354:1: ( ( ( rule__ObjectProperty__Group_5__0 )? ) )
            // InternalSemanticNodesDsl.g:2355:1: ( ( rule__ObjectProperty__Group_5__0 )? )
            {
            // InternalSemanticNodesDsl.g:2355:1: ( ( rule__ObjectProperty__Group_5__0 )? )
            // InternalSemanticNodesDsl.g:2356:2: ( rule__ObjectProperty__Group_5__0 )?
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup_5()); 
            // InternalSemanticNodesDsl.g:2357:2: ( rule__ObjectProperty__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2357:3: rule__ObjectProperty__Group_5__0
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
    // InternalSemanticNodesDsl.g:2366:1: rule__ObjectProperty__Group_4__0 : rule__ObjectProperty__Group_4__0__Impl rule__ObjectProperty__Group_4__1 ;
    public final void rule__ObjectProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2370:1: ( rule__ObjectProperty__Group_4__0__Impl rule__ObjectProperty__Group_4__1 )
            // InternalSemanticNodesDsl.g:2371:2: rule__ObjectProperty__Group_4__0__Impl rule__ObjectProperty__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSemanticNodesDsl.g:2378:1: rule__ObjectProperty__Group_4__0__Impl : ( '[' ) ;
    public final void rule__ObjectProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2382:1: ( ( '[' ) )
            // InternalSemanticNodesDsl.g:2383:1: ( '[' )
            {
            // InternalSemanticNodesDsl.g:2383:1: ( '[' )
            // InternalSemanticNodesDsl.g:2384:2: '['
            {
             before(grammarAccess.getObjectPropertyAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2393:1: rule__ObjectProperty__Group_4__1 : rule__ObjectProperty__Group_4__1__Impl rule__ObjectProperty__Group_4__2 ;
    public final void rule__ObjectProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2397:1: ( rule__ObjectProperty__Group_4__1__Impl rule__ObjectProperty__Group_4__2 )
            // InternalSemanticNodesDsl.g:2398:2: rule__ObjectProperty__Group_4__1__Impl rule__ObjectProperty__Group_4__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSemanticNodesDsl.g:2405:1: rule__ObjectProperty__Group_4__1__Impl : ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__ObjectProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2409:1: ( ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) ) )
            // InternalSemanticNodesDsl.g:2410:1: ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) )
            {
            // InternalSemanticNodesDsl.g:2410:1: ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) )
            // InternalSemanticNodesDsl.g:2411:2: ( rule__ObjectProperty__LowerBoundAssignment_4_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getLowerBoundAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:2412:2: ( rule__ObjectProperty__LowerBoundAssignment_4_1 )
            // InternalSemanticNodesDsl.g:2412:3: rule__ObjectProperty__LowerBoundAssignment_4_1
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
    // InternalSemanticNodesDsl.g:2420:1: rule__ObjectProperty__Group_4__2 : rule__ObjectProperty__Group_4__2__Impl rule__ObjectProperty__Group_4__3 ;
    public final void rule__ObjectProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2424:1: ( rule__ObjectProperty__Group_4__2__Impl rule__ObjectProperty__Group_4__3 )
            // InternalSemanticNodesDsl.g:2425:2: rule__ObjectProperty__Group_4__2__Impl rule__ObjectProperty__Group_4__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalSemanticNodesDsl.g:2432:1: rule__ObjectProperty__Group_4__2__Impl : ( ',' ) ;
    public final void rule__ObjectProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2436:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2437:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2437:1: ( ',' )
            // InternalSemanticNodesDsl.g:2438:2: ','
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
    // InternalSemanticNodesDsl.g:2447:1: rule__ObjectProperty__Group_4__3 : rule__ObjectProperty__Group_4__3__Impl rule__ObjectProperty__Group_4__4 ;
    public final void rule__ObjectProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2451:1: ( rule__ObjectProperty__Group_4__3__Impl rule__ObjectProperty__Group_4__4 )
            // InternalSemanticNodesDsl.g:2452:2: rule__ObjectProperty__Group_4__3__Impl rule__ObjectProperty__Group_4__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemanticNodesDsl.g:2459:1: rule__ObjectProperty__Group_4__3__Impl : ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__ObjectProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2463:1: ( ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) ) )
            // InternalSemanticNodesDsl.g:2464:1: ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) )
            {
            // InternalSemanticNodesDsl.g:2464:1: ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) )
            // InternalSemanticNodesDsl.g:2465:2: ( rule__ObjectProperty__UpperBoundAssignment_4_3 )
            {
             before(grammarAccess.getObjectPropertyAccess().getUpperBoundAssignment_4_3()); 
            // InternalSemanticNodesDsl.g:2466:2: ( rule__ObjectProperty__UpperBoundAssignment_4_3 )
            // InternalSemanticNodesDsl.g:2466:3: rule__ObjectProperty__UpperBoundAssignment_4_3
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
    // InternalSemanticNodesDsl.g:2474:1: rule__ObjectProperty__Group_4__4 : rule__ObjectProperty__Group_4__4__Impl ;
    public final void rule__ObjectProperty__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2478:1: ( rule__ObjectProperty__Group_4__4__Impl )
            // InternalSemanticNodesDsl.g:2479:2: rule__ObjectProperty__Group_4__4__Impl
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
    // InternalSemanticNodesDsl.g:2485:1: rule__ObjectProperty__Group_4__4__Impl : ( ']' ) ;
    public final void rule__ObjectProperty__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2489:1: ( ( ']' ) )
            // InternalSemanticNodesDsl.g:2490:1: ( ']' )
            {
            // InternalSemanticNodesDsl.g:2490:1: ( ']' )
            // InternalSemanticNodesDsl.g:2491:2: ']'
            {
             before(grammarAccess.getObjectPropertyAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2501:1: rule__ObjectProperty__Group_5__0 : rule__ObjectProperty__Group_5__0__Impl rule__ObjectProperty__Group_5__1 ;
    public final void rule__ObjectProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2505:1: ( rule__ObjectProperty__Group_5__0__Impl rule__ObjectProperty__Group_5__1 )
            // InternalSemanticNodesDsl.g:2506:2: rule__ObjectProperty__Group_5__0__Impl rule__ObjectProperty__Group_5__1
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
    // InternalSemanticNodesDsl.g:2513:1: rule__ObjectProperty__Group_5__0__Impl : ( '{' ) ;
    public final void rule__ObjectProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2517:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:2518:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:2518:1: ( '{' )
            // InternalSemanticNodesDsl.g:2519:2: '{'
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
    // InternalSemanticNodesDsl.g:2528:1: rule__ObjectProperty__Group_5__1 : rule__ObjectProperty__Group_5__1__Impl rule__ObjectProperty__Group_5__2 ;
    public final void rule__ObjectProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2532:1: ( rule__ObjectProperty__Group_5__1__Impl rule__ObjectProperty__Group_5__2 )
            // InternalSemanticNodesDsl.g:2533:2: rule__ObjectProperty__Group_5__1__Impl rule__ObjectProperty__Group_5__2
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
    // InternalSemanticNodesDsl.g:2540:1: rule__ObjectProperty__Group_5__1__Impl : ( ( rule__ObjectProperty__MetadataAssignment_5_1 ) ) ;
    public final void rule__ObjectProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2544:1: ( ( ( rule__ObjectProperty__MetadataAssignment_5_1 ) ) )
            // InternalSemanticNodesDsl.g:2545:1: ( ( rule__ObjectProperty__MetadataAssignment_5_1 ) )
            {
            // InternalSemanticNodesDsl.g:2545:1: ( ( rule__ObjectProperty__MetadataAssignment_5_1 ) )
            // InternalSemanticNodesDsl.g:2546:2: ( rule__ObjectProperty__MetadataAssignment_5_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getMetadataAssignment_5_1()); 
            // InternalSemanticNodesDsl.g:2547:2: ( rule__ObjectProperty__MetadataAssignment_5_1 )
            // InternalSemanticNodesDsl.g:2547:3: rule__ObjectProperty__MetadataAssignment_5_1
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
    // InternalSemanticNodesDsl.g:2555:1: rule__ObjectProperty__Group_5__2 : rule__ObjectProperty__Group_5__2__Impl rule__ObjectProperty__Group_5__3 ;
    public final void rule__ObjectProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2559:1: ( rule__ObjectProperty__Group_5__2__Impl rule__ObjectProperty__Group_5__3 )
            // InternalSemanticNodesDsl.g:2560:2: rule__ObjectProperty__Group_5__2__Impl rule__ObjectProperty__Group_5__3
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
    // InternalSemanticNodesDsl.g:2567:1: rule__ObjectProperty__Group_5__2__Impl : ( ( rule__ObjectProperty__Group_5_2__0 )* ) ;
    public final void rule__ObjectProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2571:1: ( ( ( rule__ObjectProperty__Group_5_2__0 )* ) )
            // InternalSemanticNodesDsl.g:2572:1: ( ( rule__ObjectProperty__Group_5_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:2572:1: ( ( rule__ObjectProperty__Group_5_2__0 )* )
            // InternalSemanticNodesDsl.g:2573:2: ( rule__ObjectProperty__Group_5_2__0 )*
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup_5_2()); 
            // InternalSemanticNodesDsl.g:2574:2: ( rule__ObjectProperty__Group_5_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:2574:3: rule__ObjectProperty__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ObjectProperty__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalSemanticNodesDsl.g:2582:1: rule__ObjectProperty__Group_5__3 : rule__ObjectProperty__Group_5__3__Impl ;
    public final void rule__ObjectProperty__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2586:1: ( rule__ObjectProperty__Group_5__3__Impl )
            // InternalSemanticNodesDsl.g:2587:2: rule__ObjectProperty__Group_5__3__Impl
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
    // InternalSemanticNodesDsl.g:2593:1: rule__ObjectProperty__Group_5__3__Impl : ( '}' ) ;
    public final void rule__ObjectProperty__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2597:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:2598:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:2598:1: ( '}' )
            // InternalSemanticNodesDsl.g:2599:2: '}'
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
    // InternalSemanticNodesDsl.g:2609:1: rule__ObjectProperty__Group_5_2__0 : rule__ObjectProperty__Group_5_2__0__Impl rule__ObjectProperty__Group_5_2__1 ;
    public final void rule__ObjectProperty__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2613:1: ( rule__ObjectProperty__Group_5_2__0__Impl rule__ObjectProperty__Group_5_2__1 )
            // InternalSemanticNodesDsl.g:2614:2: rule__ObjectProperty__Group_5_2__0__Impl rule__ObjectProperty__Group_5_2__1
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
    // InternalSemanticNodesDsl.g:2621:1: rule__ObjectProperty__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ObjectProperty__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2625:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2626:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2626:1: ( ',' )
            // InternalSemanticNodesDsl.g:2627:2: ','
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
    // InternalSemanticNodesDsl.g:2636:1: rule__ObjectProperty__Group_5_2__1 : rule__ObjectProperty__Group_5_2__1__Impl ;
    public final void rule__ObjectProperty__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2640:1: ( rule__ObjectProperty__Group_5_2__1__Impl )
            // InternalSemanticNodesDsl.g:2641:2: rule__ObjectProperty__Group_5_2__1__Impl
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
    // InternalSemanticNodesDsl.g:2647:1: rule__ObjectProperty__Group_5_2__1__Impl : ( ( rule__ObjectProperty__MetadataAssignment_5_2_1 ) ) ;
    public final void rule__ObjectProperty__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2651:1: ( ( ( rule__ObjectProperty__MetadataAssignment_5_2_1 ) ) )
            // InternalSemanticNodesDsl.g:2652:1: ( ( rule__ObjectProperty__MetadataAssignment_5_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:2652:1: ( ( rule__ObjectProperty__MetadataAssignment_5_2_1 ) )
            // InternalSemanticNodesDsl.g:2653:2: ( rule__ObjectProperty__MetadataAssignment_5_2_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getMetadataAssignment_5_2_1()); 
            // InternalSemanticNodesDsl.g:2654:2: ( rule__ObjectProperty__MetadataAssignment_5_2_1 )
            // InternalSemanticNodesDsl.g:2654:3: rule__ObjectProperty__MetadataAssignment_5_2_1
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


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__0"
    // InternalSemanticNodesDsl.g:2663:1: rule__PrimitiveTypeDataProperty__Group__0 : rule__PrimitiveTypeDataProperty__Group__0__Impl rule__PrimitiveTypeDataProperty__Group__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2667:1: ( rule__PrimitiveTypeDataProperty__Group__0__Impl rule__PrimitiveTypeDataProperty__Group__1 )
            // InternalSemanticNodesDsl.g:2668:2: rule__PrimitiveTypeDataProperty__Group__0__Impl rule__PrimitiveTypeDataProperty__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveTypeDataProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__0"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__0__Impl"
    // InternalSemanticNodesDsl.g:2675:1: rule__PrimitiveTypeDataProperty__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2679:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:2680:1: ( () )
            {
            // InternalSemanticNodesDsl.g:2680:1: ( () )
            // InternalSemanticNodesDsl.g:2681:2: ()
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getPrimitiveTypeDataPropertyAction_0()); 
            // InternalSemanticNodesDsl.g:2682:2: ()
            // InternalSemanticNodesDsl.g:2682:3: 
            {
            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getPrimitiveTypeDataPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__1"
    // InternalSemanticNodesDsl.g:2690:1: rule__PrimitiveTypeDataProperty__Group__1 : rule__PrimitiveTypeDataProperty__Group__1__Impl rule__PrimitiveTypeDataProperty__Group__2 ;
    public final void rule__PrimitiveTypeDataProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2694:1: ( rule__PrimitiveTypeDataProperty__Group__1__Impl rule__PrimitiveTypeDataProperty__Group__2 )
            // InternalSemanticNodesDsl.g:2695:2: rule__PrimitiveTypeDataProperty__Group__1__Impl rule__PrimitiveTypeDataProperty__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__PrimitiveTypeDataProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__1__Impl"
    // InternalSemanticNodesDsl.g:2702:1: rule__PrimitiveTypeDataProperty__Group__1__Impl : ( ( rule__PrimitiveTypeDataProperty__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2706:1: ( ( ( rule__PrimitiveTypeDataProperty__NameAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:2707:1: ( ( rule__PrimitiveTypeDataProperty__NameAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:2707:1: ( ( rule__PrimitiveTypeDataProperty__NameAssignment_1 ) )
            // InternalSemanticNodesDsl.g:2708:2: ( rule__PrimitiveTypeDataProperty__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getNameAssignment_1()); 
            // InternalSemanticNodesDsl.g:2709:2: ( rule__PrimitiveTypeDataProperty__NameAssignment_1 )
            // InternalSemanticNodesDsl.g:2709:3: rule__PrimitiveTypeDataProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__2"
    // InternalSemanticNodesDsl.g:2717:1: rule__PrimitiveTypeDataProperty__Group__2 : rule__PrimitiveTypeDataProperty__Group__2__Impl rule__PrimitiveTypeDataProperty__Group__3 ;
    public final void rule__PrimitiveTypeDataProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2721:1: ( rule__PrimitiveTypeDataProperty__Group__2__Impl rule__PrimitiveTypeDataProperty__Group__3 )
            // InternalSemanticNodesDsl.g:2722:2: rule__PrimitiveTypeDataProperty__Group__2__Impl rule__PrimitiveTypeDataProperty__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__PrimitiveTypeDataProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__2"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__2__Impl"
    // InternalSemanticNodesDsl.g:2729:1: rule__PrimitiveTypeDataProperty__Group__2__Impl : ( ( rule__PrimitiveTypeDataProperty__Group_2__0 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2733:1: ( ( ( rule__PrimitiveTypeDataProperty__Group_2__0 ) ) )
            // InternalSemanticNodesDsl.g:2734:1: ( ( rule__PrimitiveTypeDataProperty__Group_2__0 ) )
            {
            // InternalSemanticNodesDsl.g:2734:1: ( ( rule__PrimitiveTypeDataProperty__Group_2__0 ) )
            // InternalSemanticNodesDsl.g:2735:2: ( rule__PrimitiveTypeDataProperty__Group_2__0 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_2()); 
            // InternalSemanticNodesDsl.g:2736:2: ( rule__PrimitiveTypeDataProperty__Group_2__0 )
            // InternalSemanticNodesDsl.g:2736:3: rule__PrimitiveTypeDataProperty__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__3"
    // InternalSemanticNodesDsl.g:2744:1: rule__PrimitiveTypeDataProperty__Group__3 : rule__PrimitiveTypeDataProperty__Group__3__Impl rule__PrimitiveTypeDataProperty__Group__4 ;
    public final void rule__PrimitiveTypeDataProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2748:1: ( rule__PrimitiveTypeDataProperty__Group__3__Impl rule__PrimitiveTypeDataProperty__Group__4 )
            // InternalSemanticNodesDsl.g:2749:2: rule__PrimitiveTypeDataProperty__Group__3__Impl rule__PrimitiveTypeDataProperty__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__PrimitiveTypeDataProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__3"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__3__Impl"
    // InternalSemanticNodesDsl.g:2756:1: rule__PrimitiveTypeDataProperty__Group__3__Impl : ( ( rule__PrimitiveTypeDataProperty__Group_3__0 )? ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2760:1: ( ( ( rule__PrimitiveTypeDataProperty__Group_3__0 )? ) )
            // InternalSemanticNodesDsl.g:2761:1: ( ( rule__PrimitiveTypeDataProperty__Group_3__0 )? )
            {
            // InternalSemanticNodesDsl.g:2761:1: ( ( rule__PrimitiveTypeDataProperty__Group_3__0 )? )
            // InternalSemanticNodesDsl.g:2762:2: ( rule__PrimitiveTypeDataProperty__Group_3__0 )?
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_3()); 
            // InternalSemanticNodesDsl.g:2763:2: ( rule__PrimitiveTypeDataProperty__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2763:3: rule__PrimitiveTypeDataProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypeDataProperty__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__3__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__4"
    // InternalSemanticNodesDsl.g:2771:1: rule__PrimitiveTypeDataProperty__Group__4 : rule__PrimitiveTypeDataProperty__Group__4__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2775:1: ( rule__PrimitiveTypeDataProperty__Group__4__Impl )
            // InternalSemanticNodesDsl.g:2776:2: rule__PrimitiveTypeDataProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__4"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group__4__Impl"
    // InternalSemanticNodesDsl.g:2782:1: rule__PrimitiveTypeDataProperty__Group__4__Impl : ( ( rule__PrimitiveTypeDataProperty__Group_4__0 )? ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2786:1: ( ( ( rule__PrimitiveTypeDataProperty__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:2787:1: ( ( rule__PrimitiveTypeDataProperty__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:2787:1: ( ( rule__PrimitiveTypeDataProperty__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:2788:2: ( rule__PrimitiveTypeDataProperty__Group_4__0 )?
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:2789:2: ( rule__PrimitiveTypeDataProperty__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2789:3: rule__PrimitiveTypeDataProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveTypeDataProperty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group__4__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_2__0"
    // InternalSemanticNodesDsl.g:2798:1: rule__PrimitiveTypeDataProperty__Group_2__0 : rule__PrimitiveTypeDataProperty__Group_2__0__Impl rule__PrimitiveTypeDataProperty__Group_2__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2802:1: ( rule__PrimitiveTypeDataProperty__Group_2__0__Impl rule__PrimitiveTypeDataProperty__Group_2__1 )
            // InternalSemanticNodesDsl.g:2803:2: rule__PrimitiveTypeDataProperty__Group_2__0__Impl rule__PrimitiveTypeDataProperty__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__PrimitiveTypeDataProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_2__0"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_2__0__Impl"
    // InternalSemanticNodesDsl.g:2810:1: rule__PrimitiveTypeDataProperty__Group_2__0__Impl : ( ':' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2814:1: ( ( ':' ) )
            // InternalSemanticNodesDsl.g:2815:1: ( ':' )
            {
            // InternalSemanticNodesDsl.g:2815:1: ( ':' )
            // InternalSemanticNodesDsl.g:2816:2: ':'
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getColonKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_2__0__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_2__1"
    // InternalSemanticNodesDsl.g:2825:1: rule__PrimitiveTypeDataProperty__Group_2__1 : rule__PrimitiveTypeDataProperty__Group_2__1__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2829:1: ( rule__PrimitiveTypeDataProperty__Group_2__1__Impl )
            // InternalSemanticNodesDsl.g:2830:2: rule__PrimitiveTypeDataProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_2__1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_2__1__Impl"
    // InternalSemanticNodesDsl.g:2836:1: rule__PrimitiveTypeDataProperty__Group_2__1__Impl : ( ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2840:1: ( ( ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 ) ) )
            // InternalSemanticNodesDsl.g:2841:1: ( ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:2841:1: ( ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 ) )
            // InternalSemanticNodesDsl.g:2842:2: ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getTypeAssignment_2_1()); 
            // InternalSemanticNodesDsl.g:2843:2: ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 )
            // InternalSemanticNodesDsl.g:2843:3: rule__PrimitiveTypeDataProperty__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_2__1__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__0"
    // InternalSemanticNodesDsl.g:2852:1: rule__PrimitiveTypeDataProperty__Group_3__0 : rule__PrimitiveTypeDataProperty__Group_3__0__Impl rule__PrimitiveTypeDataProperty__Group_3__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2856:1: ( rule__PrimitiveTypeDataProperty__Group_3__0__Impl rule__PrimitiveTypeDataProperty__Group_3__1 )
            // InternalSemanticNodesDsl.g:2857:2: rule__PrimitiveTypeDataProperty__Group_3__0__Impl rule__PrimitiveTypeDataProperty__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__PrimitiveTypeDataProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__0"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__0__Impl"
    // InternalSemanticNodesDsl.g:2864:1: rule__PrimitiveTypeDataProperty__Group_3__0__Impl : ( '[' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2868:1: ( ( '[' ) )
            // InternalSemanticNodesDsl.g:2869:1: ( '[' )
            {
            // InternalSemanticNodesDsl.g:2869:1: ( '[' )
            // InternalSemanticNodesDsl.g:2870:2: '['
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__0__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__1"
    // InternalSemanticNodesDsl.g:2879:1: rule__PrimitiveTypeDataProperty__Group_3__1 : rule__PrimitiveTypeDataProperty__Group_3__1__Impl rule__PrimitiveTypeDataProperty__Group_3__2 ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2883:1: ( rule__PrimitiveTypeDataProperty__Group_3__1__Impl rule__PrimitiveTypeDataProperty__Group_3__2 )
            // InternalSemanticNodesDsl.g:2884:2: rule__PrimitiveTypeDataProperty__Group_3__1__Impl rule__PrimitiveTypeDataProperty__Group_3__2
            {
            pushFollow(FOLLOW_26);
            rule__PrimitiveTypeDataProperty__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__1__Impl"
    // InternalSemanticNodesDsl.g:2891:1: rule__PrimitiveTypeDataProperty__Group_3__1__Impl : ( ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2895:1: ( ( ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 ) ) )
            // InternalSemanticNodesDsl.g:2896:1: ( ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 ) )
            {
            // InternalSemanticNodesDsl.g:2896:1: ( ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 ) )
            // InternalSemanticNodesDsl.g:2897:2: ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLowerBoundAssignment_3_1()); 
            // InternalSemanticNodesDsl.g:2898:2: ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 )
            // InternalSemanticNodesDsl.g:2898:3: rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLowerBoundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__1__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__2"
    // InternalSemanticNodesDsl.g:2906:1: rule__PrimitiveTypeDataProperty__Group_3__2 : rule__PrimitiveTypeDataProperty__Group_3__2__Impl rule__PrimitiveTypeDataProperty__Group_3__3 ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2910:1: ( rule__PrimitiveTypeDataProperty__Group_3__2__Impl rule__PrimitiveTypeDataProperty__Group_3__3 )
            // InternalSemanticNodesDsl.g:2911:2: rule__PrimitiveTypeDataProperty__Group_3__2__Impl rule__PrimitiveTypeDataProperty__Group_3__3
            {
            pushFollow(FOLLOW_19);
            rule__PrimitiveTypeDataProperty__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__2"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__2__Impl"
    // InternalSemanticNodesDsl.g:2918:1: rule__PrimitiveTypeDataProperty__Group_3__2__Impl : ( ',' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2922:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2923:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2923:1: ( ',' )
            // InternalSemanticNodesDsl.g:2924:2: ','
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__2__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__3"
    // InternalSemanticNodesDsl.g:2933:1: rule__PrimitiveTypeDataProperty__Group_3__3 : rule__PrimitiveTypeDataProperty__Group_3__3__Impl rule__PrimitiveTypeDataProperty__Group_3__4 ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2937:1: ( rule__PrimitiveTypeDataProperty__Group_3__3__Impl rule__PrimitiveTypeDataProperty__Group_3__4 )
            // InternalSemanticNodesDsl.g:2938:2: rule__PrimitiveTypeDataProperty__Group_3__3__Impl rule__PrimitiveTypeDataProperty__Group_3__4
            {
            pushFollow(FOLLOW_27);
            rule__PrimitiveTypeDataProperty__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__3"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__3__Impl"
    // InternalSemanticNodesDsl.g:2945:1: rule__PrimitiveTypeDataProperty__Group_3__3__Impl : ( ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2949:1: ( ( ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 ) ) )
            // InternalSemanticNodesDsl.g:2950:1: ( ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 ) )
            {
            // InternalSemanticNodesDsl.g:2950:1: ( ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 ) )
            // InternalSemanticNodesDsl.g:2951:2: ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getUpperBoundAssignment_3_3()); 
            // InternalSemanticNodesDsl.g:2952:2: ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 )
            // InternalSemanticNodesDsl.g:2952:3: rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getUpperBoundAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__3__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__4"
    // InternalSemanticNodesDsl.g:2960:1: rule__PrimitiveTypeDataProperty__Group_3__4 : rule__PrimitiveTypeDataProperty__Group_3__4__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2964:1: ( rule__PrimitiveTypeDataProperty__Group_3__4__Impl )
            // InternalSemanticNodesDsl.g:2965:2: rule__PrimitiveTypeDataProperty__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__4"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_3__4__Impl"
    // InternalSemanticNodesDsl.g:2971:1: rule__PrimitiveTypeDataProperty__Group_3__4__Impl : ( ']' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2975:1: ( ( ']' ) )
            // InternalSemanticNodesDsl.g:2976:1: ( ']' )
            {
            // InternalSemanticNodesDsl.g:2976:1: ( ']' )
            // InternalSemanticNodesDsl.g:2977:2: ']'
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_3__4__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4__0"
    // InternalSemanticNodesDsl.g:2987:1: rule__PrimitiveTypeDataProperty__Group_4__0 : rule__PrimitiveTypeDataProperty__Group_4__0__Impl rule__PrimitiveTypeDataProperty__Group_4__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2991:1: ( rule__PrimitiveTypeDataProperty__Group_4__0__Impl rule__PrimitiveTypeDataProperty__Group_4__1 )
            // InternalSemanticNodesDsl.g:2992:2: rule__PrimitiveTypeDataProperty__Group_4__0__Impl rule__PrimitiveTypeDataProperty__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveTypeDataProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4__0"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4__0__Impl"
    // InternalSemanticNodesDsl.g:2999:1: rule__PrimitiveTypeDataProperty__Group_4__0__Impl : ( '{' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3003:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:3004:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:3004:1: ( '{' )
            // InternalSemanticNodesDsl.g:3005:2: '{'
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4__0__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4__1"
    // InternalSemanticNodesDsl.g:3014:1: rule__PrimitiveTypeDataProperty__Group_4__1 : rule__PrimitiveTypeDataProperty__Group_4__1__Impl rule__PrimitiveTypeDataProperty__Group_4__2 ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3018:1: ( rule__PrimitiveTypeDataProperty__Group_4__1__Impl rule__PrimitiveTypeDataProperty__Group_4__2 )
            // InternalSemanticNodesDsl.g:3019:2: rule__PrimitiveTypeDataProperty__Group_4__1__Impl rule__PrimitiveTypeDataProperty__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__PrimitiveTypeDataProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4__1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4__1__Impl"
    // InternalSemanticNodesDsl.g:3026:1: rule__PrimitiveTypeDataProperty__Group_4__1__Impl : ( ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3030:1: ( ( ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1 ) ) )
            // InternalSemanticNodesDsl.g:3031:1: ( ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1 ) )
            {
            // InternalSemanticNodesDsl.g:3031:1: ( ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1 ) )
            // InternalSemanticNodesDsl.g:3032:2: ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:3033:2: ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1 )
            // InternalSemanticNodesDsl.g:3033:3: rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4__1__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4__2"
    // InternalSemanticNodesDsl.g:3041:1: rule__PrimitiveTypeDataProperty__Group_4__2 : rule__PrimitiveTypeDataProperty__Group_4__2__Impl rule__PrimitiveTypeDataProperty__Group_4__3 ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3045:1: ( rule__PrimitiveTypeDataProperty__Group_4__2__Impl rule__PrimitiveTypeDataProperty__Group_4__3 )
            // InternalSemanticNodesDsl.g:3046:2: rule__PrimitiveTypeDataProperty__Group_4__2__Impl rule__PrimitiveTypeDataProperty__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__PrimitiveTypeDataProperty__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4__2"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4__2__Impl"
    // InternalSemanticNodesDsl.g:3053:1: rule__PrimitiveTypeDataProperty__Group_4__2__Impl : ( ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )* ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3057:1: ( ( ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )* ) )
            // InternalSemanticNodesDsl.g:3058:1: ( ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:3058:1: ( ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )* )
            // InternalSemanticNodesDsl.g:3059:2: ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )*
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_4_2()); 
            // InternalSemanticNodesDsl.g:3060:2: ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==20) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:3060:3: rule__PrimitiveTypeDataProperty__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__PrimitiveTypeDataProperty__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4__2__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4__3"
    // InternalSemanticNodesDsl.g:3068:1: rule__PrimitiveTypeDataProperty__Group_4__3 : rule__PrimitiveTypeDataProperty__Group_4__3__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3072:1: ( rule__PrimitiveTypeDataProperty__Group_4__3__Impl )
            // InternalSemanticNodesDsl.g:3073:2: rule__PrimitiveTypeDataProperty__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4__3"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4__3__Impl"
    // InternalSemanticNodesDsl.g:3079:1: rule__PrimitiveTypeDataProperty__Group_4__3__Impl : ( '}' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3083:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:3084:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:3084:1: ( '}' )
            // InternalSemanticNodesDsl.g:3085:2: '}'
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4__3__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4_2__0"
    // InternalSemanticNodesDsl.g:3095:1: rule__PrimitiveTypeDataProperty__Group_4_2__0 : rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl rule__PrimitiveTypeDataProperty__Group_4_2__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3099:1: ( rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl rule__PrimitiveTypeDataProperty__Group_4_2__1 )
            // InternalSemanticNodesDsl.g:3100:2: rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl rule__PrimitiveTypeDataProperty__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4_2__0"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl"
    // InternalSemanticNodesDsl.g:3107:1: rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3111:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:3112:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:3112:1: ( ',' )
            // InternalSemanticNodesDsl.g:3113:2: ','
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_4_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4_2__1"
    // InternalSemanticNodesDsl.g:3122:1: rule__PrimitiveTypeDataProperty__Group_4_2__1 : rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3126:1: ( rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl )
            // InternalSemanticNodesDsl.g:3127:2: rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4_2__1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl"
    // InternalSemanticNodesDsl.g:3133:1: rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl : ( ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3137:1: ( ( ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1 ) ) )
            // InternalSemanticNodesDsl.g:3138:1: ( ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:3138:1: ( ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1 ) )
            // InternalSemanticNodesDsl.g:3139:2: ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataAssignment_4_2_1()); 
            // InternalSemanticNodesDsl.g:3140:2: ( rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1 )
            // InternalSemanticNodesDsl.g:3140:3: rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group__0"
    // InternalSemanticNodesDsl.g:3149:1: rule__EnumerationDataProperty__Group__0 : rule__EnumerationDataProperty__Group__0__Impl rule__EnumerationDataProperty__Group__1 ;
    public final void rule__EnumerationDataProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3153:1: ( rule__EnumerationDataProperty__Group__0__Impl rule__EnumerationDataProperty__Group__1 )
            // InternalSemanticNodesDsl.g:3154:2: rule__EnumerationDataProperty__Group__0__Impl rule__EnumerationDataProperty__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationDataProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__0"


    // $ANTLR start "rule__EnumerationDataProperty__Group__0__Impl"
    // InternalSemanticNodesDsl.g:3161:1: rule__EnumerationDataProperty__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationDataProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3165:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:3166:1: ( () )
            {
            // InternalSemanticNodesDsl.g:3166:1: ( () )
            // InternalSemanticNodesDsl.g:3167:2: ()
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getEnumDataPropertyAction_0()); 
            // InternalSemanticNodesDsl.g:3168:2: ()
            // InternalSemanticNodesDsl.g:3168:3: 
            {
            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getEnumDataPropertyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__0__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group__1"
    // InternalSemanticNodesDsl.g:3176:1: rule__EnumerationDataProperty__Group__1 : rule__EnumerationDataProperty__Group__1__Impl rule__EnumerationDataProperty__Group__2 ;
    public final void rule__EnumerationDataProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3180:1: ( rule__EnumerationDataProperty__Group__1__Impl rule__EnumerationDataProperty__Group__2 )
            // InternalSemanticNodesDsl.g:3181:2: rule__EnumerationDataProperty__Group__1__Impl rule__EnumerationDataProperty__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__EnumerationDataProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__1"


    // $ANTLR start "rule__EnumerationDataProperty__Group__1__Impl"
    // InternalSemanticNodesDsl.g:3188:1: rule__EnumerationDataProperty__Group__1__Impl : ( ( rule__EnumerationDataProperty__NameAssignment_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3192:1: ( ( ( rule__EnumerationDataProperty__NameAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:3193:1: ( ( rule__EnumerationDataProperty__NameAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:3193:1: ( ( rule__EnumerationDataProperty__NameAssignment_1 ) )
            // InternalSemanticNodesDsl.g:3194:2: ( rule__EnumerationDataProperty__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getNameAssignment_1()); 
            // InternalSemanticNodesDsl.g:3195:2: ( rule__EnumerationDataProperty__NameAssignment_1 )
            // InternalSemanticNodesDsl.g:3195:3: rule__EnumerationDataProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__1__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group__2"
    // InternalSemanticNodesDsl.g:3203:1: rule__EnumerationDataProperty__Group__2 : rule__EnumerationDataProperty__Group__2__Impl rule__EnumerationDataProperty__Group__3 ;
    public final void rule__EnumerationDataProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3207:1: ( rule__EnumerationDataProperty__Group__2__Impl rule__EnumerationDataProperty__Group__3 )
            // InternalSemanticNodesDsl.g:3208:2: rule__EnumerationDataProperty__Group__2__Impl rule__EnumerationDataProperty__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__EnumerationDataProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__2"


    // $ANTLR start "rule__EnumerationDataProperty__Group__2__Impl"
    // InternalSemanticNodesDsl.g:3215:1: rule__EnumerationDataProperty__Group__2__Impl : ( ( rule__EnumerationDataProperty__Group_2__0 ) ) ;
    public final void rule__EnumerationDataProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3219:1: ( ( ( rule__EnumerationDataProperty__Group_2__0 ) ) )
            // InternalSemanticNodesDsl.g:3220:1: ( ( rule__EnumerationDataProperty__Group_2__0 ) )
            {
            // InternalSemanticNodesDsl.g:3220:1: ( ( rule__EnumerationDataProperty__Group_2__0 ) )
            // InternalSemanticNodesDsl.g:3221:2: ( rule__EnumerationDataProperty__Group_2__0 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getGroup_2()); 
            // InternalSemanticNodesDsl.g:3222:2: ( rule__EnumerationDataProperty__Group_2__0 )
            // InternalSemanticNodesDsl.g:3222:3: rule__EnumerationDataProperty__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__2__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group__3"
    // InternalSemanticNodesDsl.g:3230:1: rule__EnumerationDataProperty__Group__3 : rule__EnumerationDataProperty__Group__3__Impl rule__EnumerationDataProperty__Group__4 ;
    public final void rule__EnumerationDataProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3234:1: ( rule__EnumerationDataProperty__Group__3__Impl rule__EnumerationDataProperty__Group__4 )
            // InternalSemanticNodesDsl.g:3235:2: rule__EnumerationDataProperty__Group__3__Impl rule__EnumerationDataProperty__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__EnumerationDataProperty__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__3"


    // $ANTLR start "rule__EnumerationDataProperty__Group__3__Impl"
    // InternalSemanticNodesDsl.g:3242:1: rule__EnumerationDataProperty__Group__3__Impl : ( ( rule__EnumerationDataProperty__Group_3__0 )? ) ;
    public final void rule__EnumerationDataProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3246:1: ( ( ( rule__EnumerationDataProperty__Group_3__0 )? ) )
            // InternalSemanticNodesDsl.g:3247:1: ( ( rule__EnumerationDataProperty__Group_3__0 )? )
            {
            // InternalSemanticNodesDsl.g:3247:1: ( ( rule__EnumerationDataProperty__Group_3__0 )? )
            // InternalSemanticNodesDsl.g:3248:2: ( rule__EnumerationDataProperty__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getGroup_3()); 
            // InternalSemanticNodesDsl.g:3249:2: ( rule__EnumerationDataProperty__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSemanticNodesDsl.g:3249:3: rule__EnumerationDataProperty__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationDataProperty__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__3__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group__4"
    // InternalSemanticNodesDsl.g:3257:1: rule__EnumerationDataProperty__Group__4 : rule__EnumerationDataProperty__Group__4__Impl ;
    public final void rule__EnumerationDataProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3261:1: ( rule__EnumerationDataProperty__Group__4__Impl )
            // InternalSemanticNodesDsl.g:3262:2: rule__EnumerationDataProperty__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__4"


    // $ANTLR start "rule__EnumerationDataProperty__Group__4__Impl"
    // InternalSemanticNodesDsl.g:3268:1: rule__EnumerationDataProperty__Group__4__Impl : ( ( rule__EnumerationDataProperty__Group_4__0 )? ) ;
    public final void rule__EnumerationDataProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3272:1: ( ( ( rule__EnumerationDataProperty__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:3273:1: ( ( rule__EnumerationDataProperty__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:3273:1: ( ( rule__EnumerationDataProperty__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:3274:2: ( rule__EnumerationDataProperty__Group_4__0 )?
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:3275:2: ( rule__EnumerationDataProperty__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==17) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSemanticNodesDsl.g:3275:3: rule__EnumerationDataProperty__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationDataProperty__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group__4__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_2__0"
    // InternalSemanticNodesDsl.g:3284:1: rule__EnumerationDataProperty__Group_2__0 : rule__EnumerationDataProperty__Group_2__0__Impl rule__EnumerationDataProperty__Group_2__1 ;
    public final void rule__EnumerationDataProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3288:1: ( rule__EnumerationDataProperty__Group_2__0__Impl rule__EnumerationDataProperty__Group_2__1 )
            // InternalSemanticNodesDsl.g:3289:2: rule__EnumerationDataProperty__Group_2__0__Impl rule__EnumerationDataProperty__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationDataProperty__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_2__0"


    // $ANTLR start "rule__EnumerationDataProperty__Group_2__0__Impl"
    // InternalSemanticNodesDsl.g:3296:1: rule__EnumerationDataProperty__Group_2__0__Impl : ( ':' ) ;
    public final void rule__EnumerationDataProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3300:1: ( ( ':' ) )
            // InternalSemanticNodesDsl.g:3301:1: ( ':' )
            {
            // InternalSemanticNodesDsl.g:3301:1: ( ':' )
            // InternalSemanticNodesDsl.g:3302:2: ':'
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getColonKeyword_2_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEnumerationDataPropertyAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_2__0__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_2__1"
    // InternalSemanticNodesDsl.g:3311:1: rule__EnumerationDataProperty__Group_2__1 : rule__EnumerationDataProperty__Group_2__1__Impl ;
    public final void rule__EnumerationDataProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3315:1: ( rule__EnumerationDataProperty__Group_2__1__Impl )
            // InternalSemanticNodesDsl.g:3316:2: rule__EnumerationDataProperty__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_2__1"


    // $ANTLR start "rule__EnumerationDataProperty__Group_2__1__Impl"
    // InternalSemanticNodesDsl.g:3322:1: rule__EnumerationDataProperty__Group_2__1__Impl : ( ( rule__EnumerationDataProperty__TypeAssignment_2_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3326:1: ( ( ( rule__EnumerationDataProperty__TypeAssignment_2_1 ) ) )
            // InternalSemanticNodesDsl.g:3327:1: ( ( rule__EnumerationDataProperty__TypeAssignment_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:3327:1: ( ( rule__EnumerationDataProperty__TypeAssignment_2_1 ) )
            // InternalSemanticNodesDsl.g:3328:2: ( rule__EnumerationDataProperty__TypeAssignment_2_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getTypeAssignment_2_1()); 
            // InternalSemanticNodesDsl.g:3329:2: ( rule__EnumerationDataProperty__TypeAssignment_2_1 )
            // InternalSemanticNodesDsl.g:3329:3: rule__EnumerationDataProperty__TypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__TypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_2__1__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__0"
    // InternalSemanticNodesDsl.g:3338:1: rule__EnumerationDataProperty__Group_3__0 : rule__EnumerationDataProperty__Group_3__0__Impl rule__EnumerationDataProperty__Group_3__1 ;
    public final void rule__EnumerationDataProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3342:1: ( rule__EnumerationDataProperty__Group_3__0__Impl rule__EnumerationDataProperty__Group_3__1 )
            // InternalSemanticNodesDsl.g:3343:2: rule__EnumerationDataProperty__Group_3__0__Impl rule__EnumerationDataProperty__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__EnumerationDataProperty__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__0"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__0__Impl"
    // InternalSemanticNodesDsl.g:3350:1: rule__EnumerationDataProperty__Group_3__0__Impl : ( '[' ) ;
    public final void rule__EnumerationDataProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3354:1: ( ( '[' ) )
            // InternalSemanticNodesDsl.g:3355:1: ( '[' )
            {
            // InternalSemanticNodesDsl.g:3355:1: ( '[' )
            // InternalSemanticNodesDsl.g:3356:2: '['
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEnumerationDataPropertyAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__0__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__1"
    // InternalSemanticNodesDsl.g:3365:1: rule__EnumerationDataProperty__Group_3__1 : rule__EnumerationDataProperty__Group_3__1__Impl rule__EnumerationDataProperty__Group_3__2 ;
    public final void rule__EnumerationDataProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3369:1: ( rule__EnumerationDataProperty__Group_3__1__Impl rule__EnumerationDataProperty__Group_3__2 )
            // InternalSemanticNodesDsl.g:3370:2: rule__EnumerationDataProperty__Group_3__1__Impl rule__EnumerationDataProperty__Group_3__2
            {
            pushFollow(FOLLOW_26);
            rule__EnumerationDataProperty__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__1"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__1__Impl"
    // InternalSemanticNodesDsl.g:3377:1: rule__EnumerationDataProperty__Group_3__1__Impl : ( ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3381:1: ( ( ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 ) ) )
            // InternalSemanticNodesDsl.g:3382:1: ( ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 ) )
            {
            // InternalSemanticNodesDsl.g:3382:1: ( ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 ) )
            // InternalSemanticNodesDsl.g:3383:2: ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getLowerBoundAssignment_3_1()); 
            // InternalSemanticNodesDsl.g:3384:2: ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 )
            // InternalSemanticNodesDsl.g:3384:3: rule__EnumerationDataProperty__LowerBoundAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__LowerBoundAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getLowerBoundAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__1__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__2"
    // InternalSemanticNodesDsl.g:3392:1: rule__EnumerationDataProperty__Group_3__2 : rule__EnumerationDataProperty__Group_3__2__Impl rule__EnumerationDataProperty__Group_3__3 ;
    public final void rule__EnumerationDataProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3396:1: ( rule__EnumerationDataProperty__Group_3__2__Impl rule__EnumerationDataProperty__Group_3__3 )
            // InternalSemanticNodesDsl.g:3397:2: rule__EnumerationDataProperty__Group_3__2__Impl rule__EnumerationDataProperty__Group_3__3
            {
            pushFollow(FOLLOW_19);
            rule__EnumerationDataProperty__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__2"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__2__Impl"
    // InternalSemanticNodesDsl.g:3404:1: rule__EnumerationDataProperty__Group_3__2__Impl : ( ',' ) ;
    public final void rule__EnumerationDataProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3408:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:3409:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:3409:1: ( ',' )
            // InternalSemanticNodesDsl.g:3410:2: ','
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_3_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__2__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__3"
    // InternalSemanticNodesDsl.g:3419:1: rule__EnumerationDataProperty__Group_3__3 : rule__EnumerationDataProperty__Group_3__3__Impl rule__EnumerationDataProperty__Group_3__4 ;
    public final void rule__EnumerationDataProperty__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3423:1: ( rule__EnumerationDataProperty__Group_3__3__Impl rule__EnumerationDataProperty__Group_3__4 )
            // InternalSemanticNodesDsl.g:3424:2: rule__EnumerationDataProperty__Group_3__3__Impl rule__EnumerationDataProperty__Group_3__4
            {
            pushFollow(FOLLOW_27);
            rule__EnumerationDataProperty__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__3"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__3__Impl"
    // InternalSemanticNodesDsl.g:3431:1: rule__EnumerationDataProperty__Group_3__3__Impl : ( ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__EnumerationDataProperty__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3435:1: ( ( ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 ) ) )
            // InternalSemanticNodesDsl.g:3436:1: ( ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 ) )
            {
            // InternalSemanticNodesDsl.g:3436:1: ( ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 ) )
            // InternalSemanticNodesDsl.g:3437:2: ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getUpperBoundAssignment_3_3()); 
            // InternalSemanticNodesDsl.g:3438:2: ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 )
            // InternalSemanticNodesDsl.g:3438:3: rule__EnumerationDataProperty__UpperBoundAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__UpperBoundAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getUpperBoundAssignment_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__3__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__4"
    // InternalSemanticNodesDsl.g:3446:1: rule__EnumerationDataProperty__Group_3__4 : rule__EnumerationDataProperty__Group_3__4__Impl ;
    public final void rule__EnumerationDataProperty__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3450:1: ( rule__EnumerationDataProperty__Group_3__4__Impl )
            // InternalSemanticNodesDsl.g:3451:2: rule__EnumerationDataProperty__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__4"


    // $ANTLR start "rule__EnumerationDataProperty__Group_3__4__Impl"
    // InternalSemanticNodesDsl.g:3457:1: rule__EnumerationDataProperty__Group_3__4__Impl : ( ']' ) ;
    public final void rule__EnumerationDataProperty__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3461:1: ( ( ']' ) )
            // InternalSemanticNodesDsl.g:3462:1: ( ']' )
            {
            // InternalSemanticNodesDsl.g:3462:1: ( ']' )
            // InternalSemanticNodesDsl.g:3463:2: ']'
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEnumerationDataPropertyAccess().getRightSquareBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_3__4__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4__0"
    // InternalSemanticNodesDsl.g:3473:1: rule__EnumerationDataProperty__Group_4__0 : rule__EnumerationDataProperty__Group_4__0__Impl rule__EnumerationDataProperty__Group_4__1 ;
    public final void rule__EnumerationDataProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3477:1: ( rule__EnumerationDataProperty__Group_4__0__Impl rule__EnumerationDataProperty__Group_4__1 )
            // InternalSemanticNodesDsl.g:3478:2: rule__EnumerationDataProperty__Group_4__0__Impl rule__EnumerationDataProperty__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationDataProperty__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4__0"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4__0__Impl"
    // InternalSemanticNodesDsl.g:3485:1: rule__EnumerationDataProperty__Group_4__0__Impl : ( '{' ) ;
    public final void rule__EnumerationDataProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3489:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:3490:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:3490:1: ( '{' )
            // InternalSemanticNodesDsl.g:3491:2: '{'
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEnumerationDataPropertyAccess().getLeftCurlyBracketKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4__0__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4__1"
    // InternalSemanticNodesDsl.g:3500:1: rule__EnumerationDataProperty__Group_4__1 : rule__EnumerationDataProperty__Group_4__1__Impl rule__EnumerationDataProperty__Group_4__2 ;
    public final void rule__EnumerationDataProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3504:1: ( rule__EnumerationDataProperty__Group_4__1__Impl rule__EnumerationDataProperty__Group_4__2 )
            // InternalSemanticNodesDsl.g:3505:2: rule__EnumerationDataProperty__Group_4__1__Impl rule__EnumerationDataProperty__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__EnumerationDataProperty__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4__1"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4__1__Impl"
    // InternalSemanticNodesDsl.g:3512:1: rule__EnumerationDataProperty__Group_4__1__Impl : ( ( rule__EnumerationDataProperty__MetadataAssignment_4_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3516:1: ( ( ( rule__EnumerationDataProperty__MetadataAssignment_4_1 ) ) )
            // InternalSemanticNodesDsl.g:3517:1: ( ( rule__EnumerationDataProperty__MetadataAssignment_4_1 ) )
            {
            // InternalSemanticNodesDsl.g:3517:1: ( ( rule__EnumerationDataProperty__MetadataAssignment_4_1 ) )
            // InternalSemanticNodesDsl.g:3518:2: ( rule__EnumerationDataProperty__MetadataAssignment_4_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getMetadataAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:3519:2: ( rule__EnumerationDataProperty__MetadataAssignment_4_1 )
            // InternalSemanticNodesDsl.g:3519:3: rule__EnumerationDataProperty__MetadataAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__MetadataAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getMetadataAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4__1__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4__2"
    // InternalSemanticNodesDsl.g:3527:1: rule__EnumerationDataProperty__Group_4__2 : rule__EnumerationDataProperty__Group_4__2__Impl rule__EnumerationDataProperty__Group_4__3 ;
    public final void rule__EnumerationDataProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3531:1: ( rule__EnumerationDataProperty__Group_4__2__Impl rule__EnumerationDataProperty__Group_4__3 )
            // InternalSemanticNodesDsl.g:3532:2: rule__EnumerationDataProperty__Group_4__2__Impl rule__EnumerationDataProperty__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__EnumerationDataProperty__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4__2"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4__2__Impl"
    // InternalSemanticNodesDsl.g:3539:1: rule__EnumerationDataProperty__Group_4__2__Impl : ( ( rule__EnumerationDataProperty__Group_4_2__0 )* ) ;
    public final void rule__EnumerationDataProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3543:1: ( ( ( rule__EnumerationDataProperty__Group_4_2__0 )* ) )
            // InternalSemanticNodesDsl.g:3544:1: ( ( rule__EnumerationDataProperty__Group_4_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:3544:1: ( ( rule__EnumerationDataProperty__Group_4_2__0 )* )
            // InternalSemanticNodesDsl.g:3545:2: ( rule__EnumerationDataProperty__Group_4_2__0 )*
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getGroup_4_2()); 
            // InternalSemanticNodesDsl.g:3546:2: ( rule__EnumerationDataProperty__Group_4_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==20) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:3546:3: rule__EnumerationDataProperty__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__EnumerationDataProperty__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getEnumerationDataPropertyAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4__2__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4__3"
    // InternalSemanticNodesDsl.g:3554:1: rule__EnumerationDataProperty__Group_4__3 : rule__EnumerationDataProperty__Group_4__3__Impl ;
    public final void rule__EnumerationDataProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3558:1: ( rule__EnumerationDataProperty__Group_4__3__Impl )
            // InternalSemanticNodesDsl.g:3559:2: rule__EnumerationDataProperty__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4__3"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4__3__Impl"
    // InternalSemanticNodesDsl.g:3565:1: rule__EnumerationDataProperty__Group_4__3__Impl : ( '}' ) ;
    public final void rule__EnumerationDataProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3569:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:3570:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:3570:1: ( '}' )
            // InternalSemanticNodesDsl.g:3571:2: '}'
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEnumerationDataPropertyAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4__3__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4_2__0"
    // InternalSemanticNodesDsl.g:3581:1: rule__EnumerationDataProperty__Group_4_2__0 : rule__EnumerationDataProperty__Group_4_2__0__Impl rule__EnumerationDataProperty__Group_4_2__1 ;
    public final void rule__EnumerationDataProperty__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3585:1: ( rule__EnumerationDataProperty__Group_4_2__0__Impl rule__EnumerationDataProperty__Group_4_2__1 )
            // InternalSemanticNodesDsl.g:3586:2: rule__EnumerationDataProperty__Group_4_2__0__Impl rule__EnumerationDataProperty__Group_4_2__1
            {
            pushFollow(FOLLOW_5);
            rule__EnumerationDataProperty__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4_2__0"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4_2__0__Impl"
    // InternalSemanticNodesDsl.g:3593:1: rule__EnumerationDataProperty__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__EnumerationDataProperty__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3597:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:3598:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:3598:1: ( ',' )
            // InternalSemanticNodesDsl.g:3599:2: ','
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_4_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4_2__0__Impl"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4_2__1"
    // InternalSemanticNodesDsl.g:3608:1: rule__EnumerationDataProperty__Group_4_2__1 : rule__EnumerationDataProperty__Group_4_2__1__Impl ;
    public final void rule__EnumerationDataProperty__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3612:1: ( rule__EnumerationDataProperty__Group_4_2__1__Impl )
            // InternalSemanticNodesDsl.g:3613:2: rule__EnumerationDataProperty__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4_2__1"


    // $ANTLR start "rule__EnumerationDataProperty__Group_4_2__1__Impl"
    // InternalSemanticNodesDsl.g:3619:1: rule__EnumerationDataProperty__Group_4_2__1__Impl : ( ( rule__EnumerationDataProperty__MetadataAssignment_4_2_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3623:1: ( ( ( rule__EnumerationDataProperty__MetadataAssignment_4_2_1 ) ) )
            // InternalSemanticNodesDsl.g:3624:1: ( ( rule__EnumerationDataProperty__MetadataAssignment_4_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:3624:1: ( ( rule__EnumerationDataProperty__MetadataAssignment_4_2_1 ) )
            // InternalSemanticNodesDsl.g:3625:2: ( rule__EnumerationDataProperty__MetadataAssignment_4_2_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getMetadataAssignment_4_2_1()); 
            // InternalSemanticNodesDsl.g:3626:2: ( rule__EnumerationDataProperty__MetadataAssignment_4_2_1 )
            // InternalSemanticNodesDsl.g:3626:3: rule__EnumerationDataProperty__MetadataAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__MetadataAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getMetadataAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__Group_4_2__1__Impl"


    // $ANTLR start "rule__MetaData__Group__0"
    // InternalSemanticNodesDsl.g:3635:1: rule__MetaData__Group__0 : rule__MetaData__Group__0__Impl rule__MetaData__Group__1 ;
    public final void rule__MetaData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3639:1: ( rule__MetaData__Group__0__Impl rule__MetaData__Group__1 )
            // InternalSemanticNodesDsl.g:3640:2: rule__MetaData__Group__0__Impl rule__MetaData__Group__1
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
    // InternalSemanticNodesDsl.g:3647:1: rule__MetaData__Group__0__Impl : ( () ) ;
    public final void rule__MetaData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3651:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:3652:1: ( () )
            {
            // InternalSemanticNodesDsl.g:3652:1: ( () )
            // InternalSemanticNodesDsl.g:3653:2: ()
            {
             before(grammarAccess.getMetaDataAccess().getMetaDataAction_0()); 
            // InternalSemanticNodesDsl.g:3654:2: ()
            // InternalSemanticNodesDsl.g:3654:3: 
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
    // InternalSemanticNodesDsl.g:3662:1: rule__MetaData__Group__1 : rule__MetaData__Group__1__Impl rule__MetaData__Group__2 ;
    public final void rule__MetaData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3666:1: ( rule__MetaData__Group__1__Impl rule__MetaData__Group__2 )
            // InternalSemanticNodesDsl.g:3667:2: rule__MetaData__Group__1__Impl rule__MetaData__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSemanticNodesDsl.g:3674:1: rule__MetaData__Group__1__Impl : ( ( rule__MetaData__KeyAssignment_1 ) ) ;
    public final void rule__MetaData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3678:1: ( ( ( rule__MetaData__KeyAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:3679:1: ( ( rule__MetaData__KeyAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:3679:1: ( ( rule__MetaData__KeyAssignment_1 ) )
            // InternalSemanticNodesDsl.g:3680:2: ( rule__MetaData__KeyAssignment_1 )
            {
             before(grammarAccess.getMetaDataAccess().getKeyAssignment_1()); 
            // InternalSemanticNodesDsl.g:3681:2: ( rule__MetaData__KeyAssignment_1 )
            // InternalSemanticNodesDsl.g:3681:3: rule__MetaData__KeyAssignment_1
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
    // InternalSemanticNodesDsl.g:3689:1: rule__MetaData__Group__2 : rule__MetaData__Group__2__Impl rule__MetaData__Group__3 ;
    public final void rule__MetaData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3693:1: ( rule__MetaData__Group__2__Impl rule__MetaData__Group__3 )
            // InternalSemanticNodesDsl.g:3694:2: rule__MetaData__Group__2__Impl rule__MetaData__Group__3
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
    // InternalSemanticNodesDsl.g:3701:1: rule__MetaData__Group__2__Impl : ( '=' ) ;
    public final void rule__MetaData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3705:1: ( ( '=' ) )
            // InternalSemanticNodesDsl.g:3706:1: ( '=' )
            {
            // InternalSemanticNodesDsl.g:3706:1: ( '=' )
            // InternalSemanticNodesDsl.g:3707:2: '='
            {
             before(grammarAccess.getMetaDataAccess().getEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3716:1: rule__MetaData__Group__3 : rule__MetaData__Group__3__Impl ;
    public final void rule__MetaData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3720:1: ( rule__MetaData__Group__3__Impl )
            // InternalSemanticNodesDsl.g:3721:2: rule__MetaData__Group__3__Impl
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
    // InternalSemanticNodesDsl.g:3727:1: rule__MetaData__Group__3__Impl : ( ( rule__MetaData__ValueAssignment_3 ) ) ;
    public final void rule__MetaData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3731:1: ( ( ( rule__MetaData__ValueAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:3732:1: ( ( rule__MetaData__ValueAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:3732:1: ( ( rule__MetaData__ValueAssignment_3 ) )
            // InternalSemanticNodesDsl.g:3733:2: ( rule__MetaData__ValueAssignment_3 )
            {
             before(grammarAccess.getMetaDataAccess().getValueAssignment_3()); 
            // InternalSemanticNodesDsl.g:3734:2: ( rule__MetaData__ValueAssignment_3 )
            // InternalSemanticNodesDsl.g:3734:3: rule__MetaData__ValueAssignment_3
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
    // InternalSemanticNodesDsl.g:3743:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3747:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSemanticNodesDsl.g:3748:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSemanticNodesDsl.g:3755:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3759:1: ( ( ( '-' )? ) )
            // InternalSemanticNodesDsl.g:3760:1: ( ( '-' )? )
            {
            // InternalSemanticNodesDsl.g:3760:1: ( ( '-' )? )
            // InternalSemanticNodesDsl.g:3761:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSemanticNodesDsl.g:3762:2: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==28) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSemanticNodesDsl.g:3762:3: '-'
                    {
                    match(input,28,FOLLOW_2); 

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
    // InternalSemanticNodesDsl.g:3770:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3774:1: ( rule__EInt__Group__1__Impl )
            // InternalSemanticNodesDsl.g:3775:2: rule__EInt__Group__1__Impl
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
    // InternalSemanticNodesDsl.g:3781:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3785:1: ( ( RULE_INT ) )
            // InternalSemanticNodesDsl.g:3786:1: ( RULE_INT )
            {
            // InternalSemanticNodesDsl.g:3786:1: ( RULE_INT )
            // InternalSemanticNodesDsl.g:3787:2: RULE_INT
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
    // InternalSemanticNodesDsl.g:3797:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3801:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalSemanticNodesDsl.g:3802:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
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
    // InternalSemanticNodesDsl.g:3809:1: rule__Annotation__Group__0__Impl : ( () ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3813:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:3814:1: ( () )
            {
            // InternalSemanticNodesDsl.g:3814:1: ( () )
            // InternalSemanticNodesDsl.g:3815:2: ()
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationAction_0()); 
            // InternalSemanticNodesDsl.g:3816:2: ()
            // InternalSemanticNodesDsl.g:3816:3: 
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
    // InternalSemanticNodesDsl.g:3824:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3828:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalSemanticNodesDsl.g:3829:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
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
    // InternalSemanticNodesDsl.g:3836:1: rule__Annotation__Group__1__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3840:1: ( ( '@' ) )
            // InternalSemanticNodesDsl.g:3841:1: ( '@' )
            {
            // InternalSemanticNodesDsl.g:3841:1: ( '@' )
            // InternalSemanticNodesDsl.g:3842:2: '@'
            {
             before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3851:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3855:1: ( rule__Annotation__Group__2__Impl )
            // InternalSemanticNodesDsl.g:3856:2: rule__Annotation__Group__2__Impl
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
    // InternalSemanticNodesDsl.g:3862:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__AnnotationAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3866:1: ( ( ( rule__Annotation__AnnotationAssignment_2 ) ) )
            // InternalSemanticNodesDsl.g:3867:1: ( ( rule__Annotation__AnnotationAssignment_2 ) )
            {
            // InternalSemanticNodesDsl.g:3867:1: ( ( rule__Annotation__AnnotationAssignment_2 ) )
            // InternalSemanticNodesDsl.g:3868:2: ( rule__Annotation__AnnotationAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getAnnotationAssignment_2()); 
            // InternalSemanticNodesDsl.g:3869:2: ( rule__Annotation__AnnotationAssignment_2 )
            // InternalSemanticNodesDsl.g:3869:3: rule__Annotation__AnnotationAssignment_2
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
    // InternalSemanticNodesDsl.g:3878:1: rule__RepositoryManager__RepositoriesAssignment_1_0 : ( ruleRepository ) ;
    public final void rule__RepositoryManager__RepositoriesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3882:1: ( ( ruleRepository ) )
            // InternalSemanticNodesDsl.g:3883:2: ( ruleRepository )
            {
            // InternalSemanticNodesDsl.g:3883:2: ( ruleRepository )
            // InternalSemanticNodesDsl.g:3884:3: ruleRepository
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
    // InternalSemanticNodesDsl.g:3893:1: rule__RepositoryManager__RepositoriesAssignment_1_1 : ( ruleRepository ) ;
    public final void rule__RepositoryManager__RepositoriesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3897:1: ( ( ruleRepository ) )
            // InternalSemanticNodesDsl.g:3898:2: ( ruleRepository )
            {
            // InternalSemanticNodesDsl.g:3898:2: ( ruleRepository )
            // InternalSemanticNodesDsl.g:3899:3: ruleRepository
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
    // InternalSemanticNodesDsl.g:3908:1: rule__Repository__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Repository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3912:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3913:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3913:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3914:3: ruleEString
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
    // InternalSemanticNodesDsl.g:3923:1: rule__Repository__ResourcesAssignment_4 : ( ruleResource ) ;
    public final void rule__Repository__ResourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3927:1: ( ( ruleResource ) )
            // InternalSemanticNodesDsl.g:3928:2: ( ruleResource )
            {
            // InternalSemanticNodesDsl.g:3928:2: ( ruleResource )
            // InternalSemanticNodesDsl.g:3929:3: ruleResource
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
    // InternalSemanticNodesDsl.g:3938:1: rule__Repository__ResourcesAssignment_5 : ( ruleResource ) ;
    public final void rule__Repository__ResourcesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3942:1: ( ( ruleResource ) )
            // InternalSemanticNodesDsl.g:3943:2: ( ruleResource )
            {
            // InternalSemanticNodesDsl.g:3943:2: ( ruleResource )
            // InternalSemanticNodesDsl.g:3944:3: ruleResource
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
    // InternalSemanticNodesDsl.g:3953:1: rule__Resource__AnnotationsAssignment_1_0 : ( ruleAnnotation ) ;
    public final void rule__Resource__AnnotationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3957:1: ( ( ruleAnnotation ) )
            // InternalSemanticNodesDsl.g:3958:2: ( ruleAnnotation )
            {
            // InternalSemanticNodesDsl.g:3958:2: ( ruleAnnotation )
            // InternalSemanticNodesDsl.g:3959:3: ruleAnnotation
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
    // InternalSemanticNodesDsl.g:3968:1: rule__Resource__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__Resource__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3972:1: ( ( ruleAnnotation ) )
            // InternalSemanticNodesDsl.g:3973:2: ( ruleAnnotation )
            {
            // InternalSemanticNodesDsl.g:3973:2: ( ruleAnnotation )
            // InternalSemanticNodesDsl.g:3974:3: ruleAnnotation
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
    // InternalSemanticNodesDsl.g:3983:1: rule__Resource__AssistantAssignment_2 : ( ruleEString ) ;
    public final void rule__Resource__AssistantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3987:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3988:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3988:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3989:3: ruleEString
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
    // InternalSemanticNodesDsl.g:3998:1: rule__Resource__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Resource__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4002:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4003:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4003:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4004:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4013:1: rule__Resource__ResourceElementsAssignment_5_0 : ( ruleResourceElement ) ;
    public final void rule__Resource__ResourceElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4017:1: ( ( ruleResourceElement ) )
            // InternalSemanticNodesDsl.g:4018:2: ( ruleResourceElement )
            {
            // InternalSemanticNodesDsl.g:4018:2: ( ruleResourceElement )
            // InternalSemanticNodesDsl.g:4019:3: ruleResourceElement
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
    // InternalSemanticNodesDsl.g:4028:1: rule__Resource__ResourceElementsAssignment_5_1 : ( ruleResourceElement ) ;
    public final void rule__Resource__ResourceElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4032:1: ( ( ruleResourceElement ) )
            // InternalSemanticNodesDsl.g:4033:2: ( ruleResourceElement )
            {
            // InternalSemanticNodesDsl.g:4033:2: ( ruleResourceElement )
            // InternalSemanticNodesDsl.g:4034:3: ruleResourceElement
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
    // InternalSemanticNodesDsl.g:4043:1: rule__Resource__MetadataAssignment_7_2 : ( ruleMetaData ) ;
    public final void rule__Resource__MetadataAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4047:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4048:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4048:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4049:3: ruleMetaData
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
    // InternalSemanticNodesDsl.g:4058:1: rule__Resource__MetadataAssignment_7_3_1 : ( ruleMetaData ) ;
    public final void rule__Resource__MetadataAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4062:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4063:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4063:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4064:3: ruleMetaData
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


    // $ANTLR start "rule__Enumeration__NameAssignment_2"
    // InternalSemanticNodesDsl.g:4073:1: rule__Enumeration__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4077:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4078:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4078:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4079:3: ruleEString
            {
             before(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__NameAssignment_2"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_4_0"
    // InternalSemanticNodesDsl.g:4088:1: rule__Enumeration__LiteralsAssignment_4_0 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4092:1: ( ( ruleEnumerationLiteral ) )
            // InternalSemanticNodesDsl.g:4093:2: ( ruleEnumerationLiteral )
            {
            // InternalSemanticNodesDsl.g:4093:2: ( ruleEnumerationLiteral )
            // InternalSemanticNodesDsl.g:4094:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_4_0"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_4_1"
    // InternalSemanticNodesDsl.g:4103:1: rule__Enumeration__LiteralsAssignment_4_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4107:1: ( ( ruleEnumerationLiteral ) )
            // InternalSemanticNodesDsl.g:4108:2: ( ruleEnumerationLiteral )
            {
            // InternalSemanticNodesDsl.g:4108:2: ( ruleEnumerationLiteral )
            // InternalSemanticNodesDsl.g:4109:3: ruleEnumerationLiteral
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationLiteral();

            state._fsp--;

             after(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_4_1"


    // $ANTLR start "rule__EnumerationLiteral__ValueAssignment_1"
    // InternalSemanticNodesDsl.g:4118:1: rule__EnumerationLiteral__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__EnumerationLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4122:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4123:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4123:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4124:3: ruleEInt
            {
             before(grammarAccess.getEnumerationLiteralAccess().getValueEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralAccess().getValueEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__ValueAssignment_1"


    // $ANTLR start "rule__EnumerationLiteral__LiteralAssignment_3"
    // InternalSemanticNodesDsl.g:4133:1: rule__EnumerationLiteral__LiteralAssignment_3 : ( ruleEString ) ;
    public final void rule__EnumerationLiteral__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4137:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4138:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4138:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4139:3: ruleEString
            {
             before(grammarAccess.getEnumerationLiteralAccess().getLiteralEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationLiteralAccess().getLiteralEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationLiteral__LiteralAssignment_3"


    // $ANTLR start "rule__SemanticNode__AnnotationsAssignment_1_0"
    // InternalSemanticNodesDsl.g:4148:1: rule__SemanticNode__AnnotationsAssignment_1_0 : ( ruleAnnotation ) ;
    public final void rule__SemanticNode__AnnotationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4152:1: ( ( ruleAnnotation ) )
            // InternalSemanticNodesDsl.g:4153:2: ( ruleAnnotation )
            {
            // InternalSemanticNodesDsl.g:4153:2: ( ruleAnnotation )
            // InternalSemanticNodesDsl.g:4154:3: ruleAnnotation
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
    // InternalSemanticNodesDsl.g:4163:1: rule__SemanticNode__AnnotationsAssignment_1_1 : ( ruleAnnotation ) ;
    public final void rule__SemanticNode__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4167:1: ( ( ruleAnnotation ) )
            // InternalSemanticNodesDsl.g:4168:2: ( ruleAnnotation )
            {
            // InternalSemanticNodesDsl.g:4168:2: ( ruleAnnotation )
            // InternalSemanticNodesDsl.g:4169:3: ruleAnnotation
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
    // InternalSemanticNodesDsl.g:4178:1: rule__SemanticNode__AbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__SemanticNode__AbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4182:1: ( ( ( 'abstract' ) ) )
            // InternalSemanticNodesDsl.g:4183:2: ( ( 'abstract' ) )
            {
            // InternalSemanticNodesDsl.g:4183:2: ( ( 'abstract' ) )
            // InternalSemanticNodesDsl.g:4184:3: ( 'abstract' )
            {
             before(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_2_0()); 
            // InternalSemanticNodesDsl.g:4185:3: ( 'abstract' )
            // InternalSemanticNodesDsl.g:4186:4: 'abstract'
            {
             before(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:4197:1: rule__SemanticNode__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__SemanticNode__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4201:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4202:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4202:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4203:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4212:1: rule__SemanticNode__PropertiesAssignment_6_0 : ( ruleProperty ) ;
    public final void rule__SemanticNode__PropertiesAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4216:1: ( ( ruleProperty ) )
            // InternalSemanticNodesDsl.g:4217:2: ( ruleProperty )
            {
            // InternalSemanticNodesDsl.g:4217:2: ( ruleProperty )
            // InternalSemanticNodesDsl.g:4218:3: ruleProperty
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
    // InternalSemanticNodesDsl.g:4227:1: rule__SemanticNode__PropertiesAssignment_6_1 : ( ruleProperty ) ;
    public final void rule__SemanticNode__PropertiesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4231:1: ( ( ruleProperty ) )
            // InternalSemanticNodesDsl.g:4232:2: ( ruleProperty )
            {
            // InternalSemanticNodesDsl.g:4232:2: ( ruleProperty )
            // InternalSemanticNodesDsl.g:4233:3: ruleProperty
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
    // InternalSemanticNodesDsl.g:4242:1: rule__SemanticNode__MetadataAssignment_8_1 : ( ruleMetaData ) ;
    public final void rule__SemanticNode__MetadataAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4246:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4247:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4247:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4248:3: ruleMetaData
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
    // InternalSemanticNodesDsl.g:4257:1: rule__SemanticNode__MetadataAssignment_8_2_1 : ( ruleMetaData ) ;
    public final void rule__SemanticNode__MetadataAssignment_8_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4261:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4262:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4262:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4263:3: ruleMetaData
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
    // InternalSemanticNodesDsl.g:4272:1: rule__ObjectProperty__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ObjectProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4276:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4277:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4277:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4278:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4287:1: rule__ObjectProperty__RangeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ObjectProperty__RangeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4291:1: ( ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:4292:2: ( ( ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:4292:2: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4293:3: ( ruleEString )
            {
             before(grammarAccess.getObjectPropertyAccess().getRangeSemanticNodeCrossReference_3_0()); 
            // InternalSemanticNodesDsl.g:4294:3: ( ruleEString )
            // InternalSemanticNodesDsl.g:4295:4: ruleEString
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
    // InternalSemanticNodesDsl.g:4306:1: rule__ObjectProperty__LowerBoundAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__ObjectProperty__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4310:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4311:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4311:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4312:3: ruleEInt
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
    // InternalSemanticNodesDsl.g:4321:1: rule__ObjectProperty__UpperBoundAssignment_4_3 : ( ruleEInt ) ;
    public final void rule__ObjectProperty__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4325:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4326:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4326:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4327:3: ruleEInt
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
    // InternalSemanticNodesDsl.g:4336:1: rule__ObjectProperty__MetadataAssignment_5_1 : ( ruleMetaData ) ;
    public final void rule__ObjectProperty__MetadataAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4340:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4341:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4341:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4342:3: ruleMetaData
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
    // InternalSemanticNodesDsl.g:4351:1: rule__ObjectProperty__MetadataAssignment_5_2_1 : ( ruleMetaData ) ;
    public final void rule__ObjectProperty__MetadataAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4355:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4356:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4356:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4357:3: ruleMetaData
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


    // $ANTLR start "rule__PrimitiveTypeDataProperty__NameAssignment_1"
    // InternalSemanticNodesDsl.g:4366:1: rule__PrimitiveTypeDataProperty__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PrimitiveTypeDataProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4370:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4371:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4371:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4372:3: ruleEString
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__NameAssignment_1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__TypeAssignment_2_1"
    // InternalSemanticNodesDsl.g:4381:1: rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__PrimitiveTypeDataProperty__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4385:1: ( ( ruleType ) )
            // InternalSemanticNodesDsl.g:4386:2: ( ruleType )
            {
            // InternalSemanticNodesDsl.g:4386:2: ( ruleType )
            // InternalSemanticNodesDsl.g:4387:3: ruleType
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getTypeTypeEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getTypeTypeEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__TypeAssignment_2_1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1"
    // InternalSemanticNodesDsl.g:4396:1: rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4400:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4401:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4401:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4402:3: ruleEInt
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3"
    // InternalSemanticNodesDsl.g:4411:1: rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 : ( ruleEInt ) ;
    public final void rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4415:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4416:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4416:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4417:3: ruleEInt
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1"
    // InternalSemanticNodesDsl.g:4426:1: rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1 : ( ruleMetaData ) ;
    public final void rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4430:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4431:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4431:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4432:3: ruleMetaData
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__MetadataAssignment_4_1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1"
    // InternalSemanticNodesDsl.g:4441:1: rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1 : ( ruleMetaData ) ;
    public final void rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4445:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4446:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4446:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4447:3: ruleMetaData
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__MetadataAssignment_4_2_1"


    // $ANTLR start "rule__EnumerationDataProperty__NameAssignment_1"
    // InternalSemanticNodesDsl.g:4456:1: rule__EnumerationDataProperty__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EnumerationDataProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4460:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4461:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4461:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4462:3: ruleEString
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationDataPropertyAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__NameAssignment_1"


    // $ANTLR start "rule__EnumerationDataProperty__TypeAssignment_2_1"
    // InternalSemanticNodesDsl.g:4471:1: rule__EnumerationDataProperty__TypeAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__EnumerationDataProperty__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4475:1: ( ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:4476:2: ( ( ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:4476:2: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4477:3: ( ruleEString )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getTypeEnumerationCrossReference_2_1_0()); 
            // InternalSemanticNodesDsl.g:4478:3: ( ruleEString )
            // InternalSemanticNodesDsl.g:4479:4: ruleEString
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getTypeEnumerationEStringParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEnumerationDataPropertyAccess().getTypeEnumerationEStringParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getTypeEnumerationCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__TypeAssignment_2_1"


    // $ANTLR start "rule__EnumerationDataProperty__LowerBoundAssignment_3_1"
    // InternalSemanticNodesDsl.g:4490:1: rule__EnumerationDataProperty__LowerBoundAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__EnumerationDataProperty__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4494:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4495:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4495:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4496:3: ruleEInt
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEnumerationDataPropertyAccess().getLowerBoundEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__LowerBoundAssignment_3_1"


    // $ANTLR start "rule__EnumerationDataProperty__UpperBoundAssignment_3_3"
    // InternalSemanticNodesDsl.g:4505:1: rule__EnumerationDataProperty__UpperBoundAssignment_3_3 : ( ruleEInt ) ;
    public final void rule__EnumerationDataProperty__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4509:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4510:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4510:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4511:3: ruleEInt
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEnumerationDataPropertyAccess().getUpperBoundEIntParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__UpperBoundAssignment_3_3"


    // $ANTLR start "rule__EnumerationDataProperty__MetadataAssignment_4_1"
    // InternalSemanticNodesDsl.g:4520:1: rule__EnumerationDataProperty__MetadataAssignment_4_1 : ( ruleMetaData ) ;
    public final void rule__EnumerationDataProperty__MetadataAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4524:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4525:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4525:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4526:3: ruleMetaData
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getEnumerationDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__MetadataAssignment_4_1"


    // $ANTLR start "rule__EnumerationDataProperty__MetadataAssignment_4_2_1"
    // InternalSemanticNodesDsl.g:4535:1: rule__EnumerationDataProperty__MetadataAssignment_4_2_1 : ( ruleMetaData ) ;
    public final void rule__EnumerationDataProperty__MetadataAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4539:1: ( ( ruleMetaData ) )
            // InternalSemanticNodesDsl.g:4540:2: ( ruleMetaData )
            {
            // InternalSemanticNodesDsl.g:4540:2: ( ruleMetaData )
            // InternalSemanticNodesDsl.g:4541:3: ruleMetaData
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaData();

            state._fsp--;

             after(grammarAccess.getEnumerationDataPropertyAccess().getMetadataMetaDataParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__MetadataAssignment_4_2_1"


    // $ANTLR start "rule__MetaData__KeyAssignment_1"
    // InternalSemanticNodesDsl.g:4550:1: rule__MetaData__KeyAssignment_1 : ( ruleEString ) ;
    public final void rule__MetaData__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4554:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4555:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4555:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4556:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4565:1: rule__MetaData__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__MetaData__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4569:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4570:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4570:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4571:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4580:1: rule__Annotation__AnnotationAssignment_2 : ( ruleEString ) ;
    public final void rule__Annotation__AnnotationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4584:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4585:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4585:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4586:3: ruleEString
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
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\2\4\3\uffff\5\4";
    static final String dfa_3s = "\1\36\1\5\3\uffff\2\36\1\5\2\36";
    static final String dfa_4s = "\2\uffff\1\1\1\2\1\3\5\uffff";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\2\2\17\uffff\1\4\1\uffff\1\3\5\uffff\1\1\1\3",
            "\1\5\1\6",
            "",
            "",
            "",
            "\2\2\21\uffff\1\3\5\uffff\1\7\1\3",
            "\2\2\21\uffff\1\3\5\uffff\1\7\1\3",
            "\1\10\1\11",
            "\2\2\21\uffff\1\3\5\uffff\1\7\1\3",
            "\2\2\21\uffff\1\3\5\uffff\1\7\1\3"
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
            return "443:1: rule__ResourceElement__Alternatives : ( ( ruleResource ) | ( ruleSemanticNode ) | ( ruleEnumeration ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000020040030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000032L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000060A40030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000060A00030L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000060A00032L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010040040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000042L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000060800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000040030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});

}