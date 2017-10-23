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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'", "'import'", "'repository'", "'{'", "'}'", "'@'", "','", "'enum'", "'->'", "'node'", "'['", "']'", "':'", "'='", "'-'", "'abstract'"
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


    // $ANTLR start "entryRuleMetaDataValue"
    // InternalSemanticNodesDsl.g:328:1: entryRuleMetaDataValue : ruleMetaDataValue EOF ;
    public final void entryRuleMetaDataValue() throws RecognitionException {
        try {
            // InternalSemanticNodesDsl.g:329:1: ( ruleMetaDataValue EOF )
            // InternalSemanticNodesDsl.g:330:1: ruleMetaDataValue EOF
            {
             before(grammarAccess.getMetaDataValueRule()); 
            pushFollow(FOLLOW_1);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getMetaDataValueRule()); 
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
    // $ANTLR end "entryRuleMetaDataValue"


    // $ANTLR start "ruleMetaDataValue"
    // InternalSemanticNodesDsl.g:337:1: ruleMetaDataValue : ( ( rule__MetaDataValue__Group__0 ) ) ;
    public final void ruleMetaDataValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:341:2: ( ( ( rule__MetaDataValue__Group__0 ) ) )
            // InternalSemanticNodesDsl.g:342:2: ( ( rule__MetaDataValue__Group__0 ) )
            {
            // InternalSemanticNodesDsl.g:342:2: ( ( rule__MetaDataValue__Group__0 ) )
            // InternalSemanticNodesDsl.g:343:3: ( rule__MetaDataValue__Group__0 )
            {
             before(grammarAccess.getMetaDataValueAccess().getGroup()); 
            // InternalSemanticNodesDsl.g:344:3: ( rule__MetaDataValue__Group__0 )
            // InternalSemanticNodesDsl.g:344:4: rule__MetaDataValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MetaDataValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMetaDataValue"


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


    // $ANTLR start "ruleType"
    // InternalSemanticNodesDsl.g:403:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:407:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalSemanticNodesDsl.g:408:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalSemanticNodesDsl.g:408:2: ( ( rule__Type__Alternatives ) )
            // InternalSemanticNodesDsl.g:409:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalSemanticNodesDsl.g:410:3: ( rule__Type__Alternatives )
            // InternalSemanticNodesDsl.g:410:4: rule__Type__Alternatives
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
    // InternalSemanticNodesDsl.g:418:1: rule__ResourceElement__Alternatives : ( ( ruleResource ) | ( ruleSemanticNode ) | ( ruleEnumeration ) );
    public final void rule__ResourceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:422:1: ( ( ruleResource ) | ( ruleSemanticNode ) | ( ruleEnumeration ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 20:
                {
                alt1=1;
                }
                break;
            case 24:
            case 30:
                {
                alt1=2;
                }
                break;
            case 22:
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
                    // InternalSemanticNodesDsl.g:423:2: ( ruleResource )
                    {
                    // InternalSemanticNodesDsl.g:423:2: ( ruleResource )
                    // InternalSemanticNodesDsl.g:424:3: ruleResource
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
                    // InternalSemanticNodesDsl.g:429:2: ( ruleSemanticNode )
                    {
                    // InternalSemanticNodesDsl.g:429:2: ( ruleSemanticNode )
                    // InternalSemanticNodesDsl.g:430:3: ruleSemanticNode
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
                    // InternalSemanticNodesDsl.g:435:2: ( ruleEnumeration )
                    {
                    // InternalSemanticNodesDsl.g:435:2: ( ruleEnumeration )
                    // InternalSemanticNodesDsl.g:436:3: ruleEnumeration
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
    // InternalSemanticNodesDsl.g:445:1: rule__Property__Alternatives : ( ( ruleObjectProperty ) | ( rulePrimitiveTypeDataProperty ) | ( ruleEnumerationDataProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:449:1: ( ( ruleObjectProperty ) | ( rulePrimitiveTypeDataProperty ) | ( ruleEnumerationDataProperty ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==27) ) {
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
                else if ( (LA2_1==23) ) {
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

                if ( (LA2_2==27) ) {
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
                else if ( (LA2_2==23) ) {
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
                    // InternalSemanticNodesDsl.g:450:2: ( ruleObjectProperty )
                    {
                    // InternalSemanticNodesDsl.g:450:2: ( ruleObjectProperty )
                    // InternalSemanticNodesDsl.g:451:3: ruleObjectProperty
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
                    // InternalSemanticNodesDsl.g:456:2: ( rulePrimitiveTypeDataProperty )
                    {
                    // InternalSemanticNodesDsl.g:456:2: ( rulePrimitiveTypeDataProperty )
                    // InternalSemanticNodesDsl.g:457:3: rulePrimitiveTypeDataProperty
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
                    // InternalSemanticNodesDsl.g:462:2: ( ruleEnumerationDataProperty )
                    {
                    // InternalSemanticNodesDsl.g:462:2: ( ruleEnumerationDataProperty )
                    // InternalSemanticNodesDsl.g:463:3: ruleEnumerationDataProperty
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
    // InternalSemanticNodesDsl.g:472:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:476:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalSemanticNodesDsl.g:477:2: ( RULE_STRING )
                    {
                    // InternalSemanticNodesDsl.g:477:2: ( RULE_STRING )
                    // InternalSemanticNodesDsl.g:478:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:483:2: ( RULE_ID )
                    {
                    // InternalSemanticNodesDsl.g:483:2: ( RULE_ID )
                    // InternalSemanticNodesDsl.g:484:3: RULE_ID
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
    // InternalSemanticNodesDsl.g:493:1: rule__Type__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:497:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) )
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
                    // InternalSemanticNodesDsl.g:498:2: ( ( 'String' ) )
                    {
                    // InternalSemanticNodesDsl.g:498:2: ( ( 'String' ) )
                    // InternalSemanticNodesDsl.g:499:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalSemanticNodesDsl.g:500:3: ( 'String' )
                    // InternalSemanticNodesDsl.g:500:4: 'String'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSemanticNodesDsl.g:504:2: ( ( 'Int' ) )
                    {
                    // InternalSemanticNodesDsl.g:504:2: ( ( 'Int' ) )
                    // InternalSemanticNodesDsl.g:505:3: ( 'Int' )
                    {
                     before(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalSemanticNodesDsl.g:506:3: ( 'Int' )
                    // InternalSemanticNodesDsl.g:506:4: 'Int'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSemanticNodesDsl.g:510:2: ( ( 'Boolean' ) )
                    {
                    // InternalSemanticNodesDsl.g:510:2: ( ( 'Boolean' ) )
                    // InternalSemanticNodesDsl.g:511:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalSemanticNodesDsl.g:512:3: ( 'Boolean' )
                    // InternalSemanticNodesDsl.g:512:4: 'Boolean'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSemanticNodesDsl.g:516:2: ( ( 'Float' ) )
                    {
                    // InternalSemanticNodesDsl.g:516:2: ( ( 'Float' ) )
                    // InternalSemanticNodesDsl.g:517:3: ( 'Float' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // InternalSemanticNodesDsl.g:518:3: ( 'Float' )
                    // InternalSemanticNodesDsl.g:518:4: 'Float'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSemanticNodesDsl.g:522:2: ( ( 'Double' ) )
                    {
                    // InternalSemanticNodesDsl.g:522:2: ( ( 'Double' ) )
                    // InternalSemanticNodesDsl.g:523:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalSemanticNodesDsl.g:524:3: ( 'Double' )
                    // InternalSemanticNodesDsl.g:524:4: 'Double'
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
    // InternalSemanticNodesDsl.g:532:1: rule__RepositoryManager__Group__0 : rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1 ;
    public final void rule__RepositoryManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:536:1: ( rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1 )
            // InternalSemanticNodesDsl.g:537:2: rule__RepositoryManager__Group__0__Impl rule__RepositoryManager__Group__1
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
    // InternalSemanticNodesDsl.g:544:1: rule__RepositoryManager__Group__0__Impl : ( () ) ;
    public final void rule__RepositoryManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:548:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:549:1: ( () )
            {
            // InternalSemanticNodesDsl.g:549:1: ( () )
            // InternalSemanticNodesDsl.g:550:2: ()
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoryManagerAction_0()); 
            // InternalSemanticNodesDsl.g:551:2: ()
            // InternalSemanticNodesDsl.g:551:3: 
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
    // InternalSemanticNodesDsl.g:559:1: rule__RepositoryManager__Group__1 : rule__RepositoryManager__Group__1__Impl rule__RepositoryManager__Group__2 ;
    public final void rule__RepositoryManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:563:1: ( rule__RepositoryManager__Group__1__Impl rule__RepositoryManager__Group__2 )
            // InternalSemanticNodesDsl.g:564:2: rule__RepositoryManager__Group__1__Impl rule__RepositoryManager__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__RepositoryManager__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group__2();

            state._fsp--;


            }

        }
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
    // InternalSemanticNodesDsl.g:571:1: rule__RepositoryManager__Group__1__Impl : ( ( rule__RepositoryManager__Group_1__0 )? ) ;
    public final void rule__RepositoryManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:575:1: ( ( ( rule__RepositoryManager__Group_1__0 )? ) )
            // InternalSemanticNodesDsl.g:576:1: ( ( rule__RepositoryManager__Group_1__0 )? )
            {
            // InternalSemanticNodesDsl.g:576:1: ( ( rule__RepositoryManager__Group_1__0 )? )
            // InternalSemanticNodesDsl.g:577:2: ( rule__RepositoryManager__Group_1__0 )?
            {
             before(grammarAccess.getRepositoryManagerAccess().getGroup_1()); 
            // InternalSemanticNodesDsl.g:578:2: ( rule__RepositoryManager__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSemanticNodesDsl.g:578:3: rule__RepositoryManager__Group_1__0
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


    // $ANTLR start "rule__RepositoryManager__Group__2"
    // InternalSemanticNodesDsl.g:586:1: rule__RepositoryManager__Group__2 : rule__RepositoryManager__Group__2__Impl ;
    public final void rule__RepositoryManager__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:590:1: ( rule__RepositoryManager__Group__2__Impl )
            // InternalSemanticNodesDsl.g:591:2: rule__RepositoryManager__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group__2"


    // $ANTLR start "rule__RepositoryManager__Group__2__Impl"
    // InternalSemanticNodesDsl.g:597:1: rule__RepositoryManager__Group__2__Impl : ( ( rule__RepositoryManager__Group_2__0 )? ) ;
    public final void rule__RepositoryManager__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:601:1: ( ( ( rule__RepositoryManager__Group_2__0 )? ) )
            // InternalSemanticNodesDsl.g:602:1: ( ( rule__RepositoryManager__Group_2__0 )? )
            {
            // InternalSemanticNodesDsl.g:602:1: ( ( rule__RepositoryManager__Group_2__0 )? )
            // InternalSemanticNodesDsl.g:603:2: ( rule__RepositoryManager__Group_2__0 )?
            {
             before(grammarAccess.getRepositoryManagerAccess().getGroup_2()); 
            // InternalSemanticNodesDsl.g:604:2: ( rule__RepositoryManager__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSemanticNodesDsl.g:604:3: rule__RepositoryManager__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RepositoryManager__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRepositoryManagerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group__2__Impl"


    // $ANTLR start "rule__RepositoryManager__Group_1__0"
    // InternalSemanticNodesDsl.g:613:1: rule__RepositoryManager__Group_1__0 : rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1 ;
    public final void rule__RepositoryManager__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:617:1: ( rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1 )
            // InternalSemanticNodesDsl.g:618:2: rule__RepositoryManager__Group_1__0__Impl rule__RepositoryManager__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:625:1: rule__RepositoryManager__Group_1__0__Impl : ( 'import' ) ;
    public final void rule__RepositoryManager__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:629:1: ( ( 'import' ) )
            // InternalSemanticNodesDsl.g:630:1: ( 'import' )
            {
            // InternalSemanticNodesDsl.g:630:1: ( 'import' )
            // InternalSemanticNodesDsl.g:631:2: 'import'
            {
             before(grammarAccess.getRepositoryManagerAccess().getImportKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRepositoryManagerAccess().getImportKeyword_1_0()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:640:1: rule__RepositoryManager__Group_1__1 : rule__RepositoryManager__Group_1__1__Impl rule__RepositoryManager__Group_1__2 ;
    public final void rule__RepositoryManager__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:644:1: ( rule__RepositoryManager__Group_1__1__Impl rule__RepositoryManager__Group_1__2 )
            // InternalSemanticNodesDsl.g:645:2: rule__RepositoryManager__Group_1__1__Impl rule__RepositoryManager__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__RepositoryManager__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalSemanticNodesDsl.g:652:1: rule__RepositoryManager__Group_1__1__Impl : ( ( rule__RepositoryManager__ImportURIAssignment_1_1 ) ) ;
    public final void rule__RepositoryManager__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:656:1: ( ( ( rule__RepositoryManager__ImportURIAssignment_1_1 ) ) )
            // InternalSemanticNodesDsl.g:657:1: ( ( rule__RepositoryManager__ImportURIAssignment_1_1 ) )
            {
            // InternalSemanticNodesDsl.g:657:1: ( ( rule__RepositoryManager__ImportURIAssignment_1_1 ) )
            // InternalSemanticNodesDsl.g:658:2: ( rule__RepositoryManager__ImportURIAssignment_1_1 )
            {
             before(grammarAccess.getRepositoryManagerAccess().getImportURIAssignment_1_1()); 
            // InternalSemanticNodesDsl.g:659:2: ( rule__RepositoryManager__ImportURIAssignment_1_1 )
            // InternalSemanticNodesDsl.g:659:3: rule__RepositoryManager__ImportURIAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__ImportURIAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryManagerAccess().getImportURIAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RepositoryManager__Group_1__2"
    // InternalSemanticNodesDsl.g:667:1: rule__RepositoryManager__Group_1__2 : rule__RepositoryManager__Group_1__2__Impl ;
    public final void rule__RepositoryManager__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:671:1: ( rule__RepositoryManager__Group_1__2__Impl )
            // InternalSemanticNodesDsl.g:672:2: rule__RepositoryManager__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1__2"


    // $ANTLR start "rule__RepositoryManager__Group_1__2__Impl"
    // InternalSemanticNodesDsl.g:678:1: rule__RepositoryManager__Group_1__2__Impl : ( ( rule__RepositoryManager__Group_1_2__0 )* ) ;
    public final void rule__RepositoryManager__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:682:1: ( ( ( rule__RepositoryManager__Group_1_2__0 )* ) )
            // InternalSemanticNodesDsl.g:683:1: ( ( rule__RepositoryManager__Group_1_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:683:1: ( ( rule__RepositoryManager__Group_1_2__0 )* )
            // InternalSemanticNodesDsl.g:684:2: ( rule__RepositoryManager__Group_1_2__0 )*
            {
             before(grammarAccess.getRepositoryManagerAccess().getGroup_1_2()); 
            // InternalSemanticNodesDsl.g:685:2: ( rule__RepositoryManager__Group_1_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:685:3: rule__RepositoryManager__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RepositoryManager__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRepositoryManagerAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1__2__Impl"


    // $ANTLR start "rule__RepositoryManager__Group_1_2__0"
    // InternalSemanticNodesDsl.g:694:1: rule__RepositoryManager__Group_1_2__0 : rule__RepositoryManager__Group_1_2__0__Impl rule__RepositoryManager__Group_1_2__1 ;
    public final void rule__RepositoryManager__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:698:1: ( rule__RepositoryManager__Group_1_2__0__Impl rule__RepositoryManager__Group_1_2__1 )
            // InternalSemanticNodesDsl.g:699:2: rule__RepositoryManager__Group_1_2__0__Impl rule__RepositoryManager__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__RepositoryManager__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1_2__0"


    // $ANTLR start "rule__RepositoryManager__Group_1_2__0__Impl"
    // InternalSemanticNodesDsl.g:706:1: rule__RepositoryManager__Group_1_2__0__Impl : ( 'import' ) ;
    public final void rule__RepositoryManager__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:710:1: ( ( 'import' ) )
            // InternalSemanticNodesDsl.g:711:1: ( 'import' )
            {
            // InternalSemanticNodesDsl.g:711:1: ( 'import' )
            // InternalSemanticNodesDsl.g:712:2: 'import'
            {
             before(grammarAccess.getRepositoryManagerAccess().getImportKeyword_1_2_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRepositoryManagerAccess().getImportKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1_2__0__Impl"


    // $ANTLR start "rule__RepositoryManager__Group_1_2__1"
    // InternalSemanticNodesDsl.g:721:1: rule__RepositoryManager__Group_1_2__1 : rule__RepositoryManager__Group_1_2__1__Impl ;
    public final void rule__RepositoryManager__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:725:1: ( rule__RepositoryManager__Group_1_2__1__Impl )
            // InternalSemanticNodesDsl.g:726:2: rule__RepositoryManager__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1_2__1"


    // $ANTLR start "rule__RepositoryManager__Group_1_2__1__Impl"
    // InternalSemanticNodesDsl.g:732:1: rule__RepositoryManager__Group_1_2__1__Impl : ( ( rule__RepositoryManager__ImportURIAssignment_1_2_1 ) ) ;
    public final void rule__RepositoryManager__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:736:1: ( ( ( rule__RepositoryManager__ImportURIAssignment_1_2_1 ) ) )
            // InternalSemanticNodesDsl.g:737:1: ( ( rule__RepositoryManager__ImportURIAssignment_1_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:737:1: ( ( rule__RepositoryManager__ImportURIAssignment_1_2_1 ) )
            // InternalSemanticNodesDsl.g:738:2: ( rule__RepositoryManager__ImportURIAssignment_1_2_1 )
            {
             before(grammarAccess.getRepositoryManagerAccess().getImportURIAssignment_1_2_1()); 
            // InternalSemanticNodesDsl.g:739:2: ( rule__RepositoryManager__ImportURIAssignment_1_2_1 )
            // InternalSemanticNodesDsl.g:739:3: rule__RepositoryManager__ImportURIAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__ImportURIAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryManagerAccess().getImportURIAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_1_2__1__Impl"


    // $ANTLR start "rule__RepositoryManager__Group_2__0"
    // InternalSemanticNodesDsl.g:748:1: rule__RepositoryManager__Group_2__0 : rule__RepositoryManager__Group_2__0__Impl rule__RepositoryManager__Group_2__1 ;
    public final void rule__RepositoryManager__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:752:1: ( rule__RepositoryManager__Group_2__0__Impl rule__RepositoryManager__Group_2__1 )
            // InternalSemanticNodesDsl.g:753:2: rule__RepositoryManager__Group_2__0__Impl rule__RepositoryManager__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__RepositoryManager__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_2__0"


    // $ANTLR start "rule__RepositoryManager__Group_2__0__Impl"
    // InternalSemanticNodesDsl.g:760:1: rule__RepositoryManager__Group_2__0__Impl : ( ( rule__RepositoryManager__RepositoriesAssignment_2_0 ) ) ;
    public final void rule__RepositoryManager__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:764:1: ( ( ( rule__RepositoryManager__RepositoriesAssignment_2_0 ) ) )
            // InternalSemanticNodesDsl.g:765:1: ( ( rule__RepositoryManager__RepositoriesAssignment_2_0 ) )
            {
            // InternalSemanticNodesDsl.g:765:1: ( ( rule__RepositoryManager__RepositoriesAssignment_2_0 ) )
            // InternalSemanticNodesDsl.g:766:2: ( rule__RepositoryManager__RepositoriesAssignment_2_0 )
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_2_0()); 
            // InternalSemanticNodesDsl.g:767:2: ( rule__RepositoryManager__RepositoriesAssignment_2_0 )
            // InternalSemanticNodesDsl.g:767:3: rule__RepositoryManager__RepositoriesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__RepositoriesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_2__0__Impl"


    // $ANTLR start "rule__RepositoryManager__Group_2__1"
    // InternalSemanticNodesDsl.g:775:1: rule__RepositoryManager__Group_2__1 : rule__RepositoryManager__Group_2__1__Impl ;
    public final void rule__RepositoryManager__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:779:1: ( rule__RepositoryManager__Group_2__1__Impl )
            // InternalSemanticNodesDsl.g:780:2: rule__RepositoryManager__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RepositoryManager__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_2__1"


    // $ANTLR start "rule__RepositoryManager__Group_2__1__Impl"
    // InternalSemanticNodesDsl.g:786:1: rule__RepositoryManager__Group_2__1__Impl : ( ( rule__RepositoryManager__RepositoriesAssignment_2_1 )* ) ;
    public final void rule__RepositoryManager__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:790:1: ( ( ( rule__RepositoryManager__RepositoriesAssignment_2_1 )* ) )
            // InternalSemanticNodesDsl.g:791:1: ( ( rule__RepositoryManager__RepositoriesAssignment_2_1 )* )
            {
            // InternalSemanticNodesDsl.g:791:1: ( ( rule__RepositoryManager__RepositoriesAssignment_2_1 )* )
            // InternalSemanticNodesDsl.g:792:2: ( rule__RepositoryManager__RepositoriesAssignment_2_1 )*
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_2_1()); 
            // InternalSemanticNodesDsl.g:793:2: ( rule__RepositoryManager__RepositoriesAssignment_2_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==17) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:793:3: rule__RepositoryManager__RepositoriesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__RepositoryManager__RepositoriesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRepositoryManagerAccess().getRepositoriesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__Group_2__1__Impl"


    // $ANTLR start "rule__Repository__Group__0"
    // InternalSemanticNodesDsl.g:802:1: rule__Repository__Group__0 : rule__Repository__Group__0__Impl rule__Repository__Group__1 ;
    public final void rule__Repository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:806:1: ( rule__Repository__Group__0__Impl rule__Repository__Group__1 )
            // InternalSemanticNodesDsl.g:807:2: rule__Repository__Group__0__Impl rule__Repository__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalSemanticNodesDsl.g:814:1: rule__Repository__Group__0__Impl : ( () ) ;
    public final void rule__Repository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:818:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:819:1: ( () )
            {
            // InternalSemanticNodesDsl.g:819:1: ( () )
            // InternalSemanticNodesDsl.g:820:2: ()
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryAction_0()); 
            // InternalSemanticNodesDsl.g:821:2: ()
            // InternalSemanticNodesDsl.g:821:3: 
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
    // InternalSemanticNodesDsl.g:829:1: rule__Repository__Group__1 : rule__Repository__Group__1__Impl rule__Repository__Group__2 ;
    public final void rule__Repository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:833:1: ( rule__Repository__Group__1__Impl rule__Repository__Group__2 )
            // InternalSemanticNodesDsl.g:834:2: rule__Repository__Group__1__Impl rule__Repository__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:841:1: rule__Repository__Group__1__Impl : ( 'repository' ) ;
    public final void rule__Repository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:845:1: ( ( 'repository' ) )
            // InternalSemanticNodesDsl.g:846:1: ( 'repository' )
            {
            // InternalSemanticNodesDsl.g:846:1: ( 'repository' )
            // InternalSemanticNodesDsl.g:847:2: 'repository'
            {
             before(grammarAccess.getRepositoryAccess().getRepositoryKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:856:1: rule__Repository__Group__2 : rule__Repository__Group__2__Impl rule__Repository__Group__3 ;
    public final void rule__Repository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:860:1: ( rule__Repository__Group__2__Impl rule__Repository__Group__3 )
            // InternalSemanticNodesDsl.g:861:2: rule__Repository__Group__2__Impl rule__Repository__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSemanticNodesDsl.g:868:1: rule__Repository__Group__2__Impl : ( ( rule__Repository__NameAssignment_2 ) ) ;
    public final void rule__Repository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:872:1: ( ( ( rule__Repository__NameAssignment_2 ) ) )
            // InternalSemanticNodesDsl.g:873:1: ( ( rule__Repository__NameAssignment_2 ) )
            {
            // InternalSemanticNodesDsl.g:873:1: ( ( rule__Repository__NameAssignment_2 ) )
            // InternalSemanticNodesDsl.g:874:2: ( rule__Repository__NameAssignment_2 )
            {
             before(grammarAccess.getRepositoryAccess().getNameAssignment_2()); 
            // InternalSemanticNodesDsl.g:875:2: ( rule__Repository__NameAssignment_2 )
            // InternalSemanticNodesDsl.g:875:3: rule__Repository__NameAssignment_2
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
    // InternalSemanticNodesDsl.g:883:1: rule__Repository__Group__3 : rule__Repository__Group__3__Impl rule__Repository__Group__4 ;
    public final void rule__Repository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:887:1: ( rule__Repository__Group__3__Impl rule__Repository__Group__4 )
            // InternalSemanticNodesDsl.g:888:2: rule__Repository__Group__3__Impl rule__Repository__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalSemanticNodesDsl.g:895:1: rule__Repository__Group__3__Impl : ( '{' ) ;
    public final void rule__Repository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:899:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:900:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:900:1: ( '{' )
            // InternalSemanticNodesDsl.g:901:2: '{'
            {
             before(grammarAccess.getRepositoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:910:1: rule__Repository__Group__4 : rule__Repository__Group__4__Impl rule__Repository__Group__5 ;
    public final void rule__Repository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:914:1: ( rule__Repository__Group__4__Impl rule__Repository__Group__5 )
            // InternalSemanticNodesDsl.g:915:2: rule__Repository__Group__4__Impl rule__Repository__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalSemanticNodesDsl.g:922:1: rule__Repository__Group__4__Impl : ( ( rule__Repository__ResourcesAssignment_4 ) ) ;
    public final void rule__Repository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:926:1: ( ( ( rule__Repository__ResourcesAssignment_4 ) ) )
            // InternalSemanticNodesDsl.g:927:1: ( ( rule__Repository__ResourcesAssignment_4 ) )
            {
            // InternalSemanticNodesDsl.g:927:1: ( ( rule__Repository__ResourcesAssignment_4 ) )
            // InternalSemanticNodesDsl.g:928:2: ( rule__Repository__ResourcesAssignment_4 )
            {
             before(grammarAccess.getRepositoryAccess().getResourcesAssignment_4()); 
            // InternalSemanticNodesDsl.g:929:2: ( rule__Repository__ResourcesAssignment_4 )
            // InternalSemanticNodesDsl.g:929:3: rule__Repository__ResourcesAssignment_4
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
    // InternalSemanticNodesDsl.g:937:1: rule__Repository__Group__5 : rule__Repository__Group__5__Impl rule__Repository__Group__6 ;
    public final void rule__Repository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:941:1: ( rule__Repository__Group__5__Impl rule__Repository__Group__6 )
            // InternalSemanticNodesDsl.g:942:2: rule__Repository__Group__5__Impl rule__Repository__Group__6
            {
            pushFollow(FOLLOW_11);
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
    // InternalSemanticNodesDsl.g:949:1: rule__Repository__Group__5__Impl : ( ( rule__Repository__ResourcesAssignment_5 )* ) ;
    public final void rule__Repository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:953:1: ( ( ( rule__Repository__ResourcesAssignment_5 )* ) )
            // InternalSemanticNodesDsl.g:954:1: ( ( rule__Repository__ResourcesAssignment_5 )* )
            {
            // InternalSemanticNodesDsl.g:954:1: ( ( rule__Repository__ResourcesAssignment_5 )* )
            // InternalSemanticNodesDsl.g:955:2: ( rule__Repository__ResourcesAssignment_5 )*
            {
             before(grammarAccess.getRepositoryAccess().getResourcesAssignment_5()); 
            // InternalSemanticNodesDsl.g:956:2: ( rule__Repository__ResourcesAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:956:3: rule__Repository__ResourcesAssignment_5
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Repository__ResourcesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalSemanticNodesDsl.g:964:1: rule__Repository__Group__6 : rule__Repository__Group__6__Impl ;
    public final void rule__Repository__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:968:1: ( rule__Repository__Group__6__Impl )
            // InternalSemanticNodesDsl.g:969:2: rule__Repository__Group__6__Impl
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
    // InternalSemanticNodesDsl.g:975:1: rule__Repository__Group__6__Impl : ( '}' ) ;
    public final void rule__Repository__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:979:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:980:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:980:1: ( '}' )
            // InternalSemanticNodesDsl.g:981:2: '}'
            {
             before(grammarAccess.getRepositoryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:991:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:995:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalSemanticNodesDsl.g:996:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalSemanticNodesDsl.g:1003:1: rule__Resource__Group__0__Impl : ( () ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1007:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:1008:1: ( () )
            {
            // InternalSemanticNodesDsl.g:1008:1: ( () )
            // InternalSemanticNodesDsl.g:1009:2: ()
            {
             before(grammarAccess.getResourceAccess().getResourceAction_0()); 
            // InternalSemanticNodesDsl.g:1010:2: ()
            // InternalSemanticNodesDsl.g:1010:3: 
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
    // InternalSemanticNodesDsl.g:1018:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1022:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalSemanticNodesDsl.g:1023:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalSemanticNodesDsl.g:1030:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__Group_1__0 )? ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1034:1: ( ( ( rule__Resource__Group_1__0 )? ) )
            // InternalSemanticNodesDsl.g:1035:1: ( ( rule__Resource__Group_1__0 )? )
            {
            // InternalSemanticNodesDsl.g:1035:1: ( ( rule__Resource__Group_1__0 )? )
            // InternalSemanticNodesDsl.g:1036:2: ( rule__Resource__Group_1__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_1()); 
            // InternalSemanticNodesDsl.g:1037:2: ( rule__Resource__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1037:3: rule__Resource__Group_1__0
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
    // InternalSemanticNodesDsl.g:1045:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1049:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalSemanticNodesDsl.g:1050:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalSemanticNodesDsl.g:1057:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__AssistantAssignment_2 )? ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1061:1: ( ( ( rule__Resource__AssistantAssignment_2 )? ) )
            // InternalSemanticNodesDsl.g:1062:1: ( ( rule__Resource__AssistantAssignment_2 )? )
            {
            // InternalSemanticNodesDsl.g:1062:1: ( ( rule__Resource__AssistantAssignment_2 )? )
            // InternalSemanticNodesDsl.g:1063:2: ( rule__Resource__AssistantAssignment_2 )?
            {
             before(grammarAccess.getResourceAccess().getAssistantAssignment_2()); 
            // InternalSemanticNodesDsl.g:1064:2: ( rule__Resource__AssistantAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                int LA11_1 = input.LA(2);

                if ( ((LA11_1>=RULE_STRING && LA11_1<=RULE_ID)) ) {
                    alt11=1;
                }
            }
            else if ( (LA11_0==RULE_ID) ) {
                int LA11_2 = input.LA(2);

                if ( ((LA11_2>=RULE_STRING && LA11_2<=RULE_ID)) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1064:3: rule__Resource__AssistantAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__AssistantAssignment_2();

                    state._fsp--;


                    }
                    break;

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
    // InternalSemanticNodesDsl.g:1072:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1076:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalSemanticNodesDsl.g:1077:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSemanticNodesDsl.g:1084:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__NameAssignment_3 ) ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1088:1: ( ( ( rule__Resource__NameAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:1089:1: ( ( rule__Resource__NameAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:1089:1: ( ( rule__Resource__NameAssignment_3 ) )
            // InternalSemanticNodesDsl.g:1090:2: ( rule__Resource__NameAssignment_3 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_3()); 
            // InternalSemanticNodesDsl.g:1091:2: ( rule__Resource__NameAssignment_3 )
            // InternalSemanticNodesDsl.g:1091:3: rule__Resource__NameAssignment_3
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
    // InternalSemanticNodesDsl.g:1099:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1103:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalSemanticNodesDsl.g:1104:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemanticNodesDsl.g:1111:1: rule__Resource__Group__4__Impl : ( '{' ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1115:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:1116:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:1116:1: ( '{' )
            // InternalSemanticNodesDsl.g:1117:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:1126:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl rule__Resource__Group__6 ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1130:1: ( rule__Resource__Group__5__Impl rule__Resource__Group__6 )
            // InternalSemanticNodesDsl.g:1131:2: rule__Resource__Group__5__Impl rule__Resource__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalSemanticNodesDsl.g:1138:1: rule__Resource__Group__5__Impl : ( ( rule__Resource__Group_5__0 )? ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1142:1: ( ( ( rule__Resource__Group_5__0 )? ) )
            // InternalSemanticNodesDsl.g:1143:1: ( ( rule__Resource__Group_5__0 )? )
            {
            // InternalSemanticNodesDsl.g:1143:1: ( ( rule__Resource__Group_5__0 )? )
            // InternalSemanticNodesDsl.g:1144:2: ( rule__Resource__Group_5__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_5()); 
            // InternalSemanticNodesDsl.g:1145:2: ( rule__Resource__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_ID)||LA12_0==20||LA12_0==22||LA12_0==24||LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1145:3: rule__Resource__Group_5__0
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
    // InternalSemanticNodesDsl.g:1153:1: rule__Resource__Group__6 : rule__Resource__Group__6__Impl rule__Resource__Group__7 ;
    public final void rule__Resource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1157:1: ( rule__Resource__Group__6__Impl rule__Resource__Group__7 )
            // InternalSemanticNodesDsl.g:1158:2: rule__Resource__Group__6__Impl rule__Resource__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalSemanticNodesDsl.g:1165:1: rule__Resource__Group__6__Impl : ( '}' ) ;
    public final void rule__Resource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1169:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1170:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1170:1: ( '}' )
            // InternalSemanticNodesDsl.g:1171:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:1180:1: rule__Resource__Group__7 : rule__Resource__Group__7__Impl ;
    public final void rule__Resource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1184:1: ( rule__Resource__Group__7__Impl )
            // InternalSemanticNodesDsl.g:1185:2: rule__Resource__Group__7__Impl
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
    // InternalSemanticNodesDsl.g:1191:1: rule__Resource__Group__7__Impl : ( ( rule__Resource__Group_7__0 )? ) ;
    public final void rule__Resource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1195:1: ( ( ( rule__Resource__Group_7__0 )? ) )
            // InternalSemanticNodesDsl.g:1196:1: ( ( rule__Resource__Group_7__0 )? )
            {
            // InternalSemanticNodesDsl.g:1196:1: ( ( rule__Resource__Group_7__0 )? )
            // InternalSemanticNodesDsl.g:1197:2: ( rule__Resource__Group_7__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_7()); 
            // InternalSemanticNodesDsl.g:1198:2: ( rule__Resource__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1198:3: rule__Resource__Group_7__0
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
    // InternalSemanticNodesDsl.g:1207:1: rule__Resource__Group_1__0 : rule__Resource__Group_1__0__Impl rule__Resource__Group_1__1 ;
    public final void rule__Resource__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1211:1: ( rule__Resource__Group_1__0__Impl rule__Resource__Group_1__1 )
            // InternalSemanticNodesDsl.g:1212:2: rule__Resource__Group_1__0__Impl rule__Resource__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:1219:1: rule__Resource__Group_1__0__Impl : ( '@' ) ;
    public final void rule__Resource__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1223:1: ( ( '@' ) )
            // InternalSemanticNodesDsl.g:1224:1: ( '@' )
            {
            // InternalSemanticNodesDsl.g:1224:1: ( '@' )
            // InternalSemanticNodesDsl.g:1225:2: '@'
            {
             before(grammarAccess.getResourceAccess().getCommercialAtKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommercialAtKeyword_1_0()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1234:1: rule__Resource__Group_1__1 : rule__Resource__Group_1__1__Impl rule__Resource__Group_1__2 ;
    public final void rule__Resource__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1238:1: ( rule__Resource__Group_1__1__Impl rule__Resource__Group_1__2 )
            // InternalSemanticNodesDsl.g:1239:2: rule__Resource__Group_1__1__Impl rule__Resource__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Resource__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalSemanticNodesDsl.g:1246:1: rule__Resource__Group_1__1__Impl : ( ( rule__Resource__AnnotationsAssignment_1_1 ) ) ;
    public final void rule__Resource__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1250:1: ( ( ( rule__Resource__AnnotationsAssignment_1_1 ) ) )
            // InternalSemanticNodesDsl.g:1251:1: ( ( rule__Resource__AnnotationsAssignment_1_1 ) )
            {
            // InternalSemanticNodesDsl.g:1251:1: ( ( rule__Resource__AnnotationsAssignment_1_1 ) )
            // InternalSemanticNodesDsl.g:1252:2: ( rule__Resource__AnnotationsAssignment_1_1 )
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_1()); 
            // InternalSemanticNodesDsl.g:1253:2: ( rule__Resource__AnnotationsAssignment_1_1 )
            // InternalSemanticNodesDsl.g:1253:3: rule__Resource__AnnotationsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__AnnotationsAssignment_1_1();

            state._fsp--;


            }

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


    // $ANTLR start "rule__Resource__Group_1__2"
    // InternalSemanticNodesDsl.g:1261:1: rule__Resource__Group_1__2 : rule__Resource__Group_1__2__Impl ;
    public final void rule__Resource__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1265:1: ( rule__Resource__Group_1__2__Impl )
            // InternalSemanticNodesDsl.g:1266:2: rule__Resource__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1__2"


    // $ANTLR start "rule__Resource__Group_1__2__Impl"
    // InternalSemanticNodesDsl.g:1272:1: rule__Resource__Group_1__2__Impl : ( ( rule__Resource__Group_1_2__0 )* ) ;
    public final void rule__Resource__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1276:1: ( ( ( rule__Resource__Group_1_2__0 )* ) )
            // InternalSemanticNodesDsl.g:1277:1: ( ( rule__Resource__Group_1_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:1277:1: ( ( rule__Resource__Group_1_2__0 )* )
            // InternalSemanticNodesDsl.g:1278:2: ( rule__Resource__Group_1_2__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_1_2()); 
            // InternalSemanticNodesDsl.g:1279:2: ( rule__Resource__Group_1_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==20) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1279:3: rule__Resource__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Resource__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1__2__Impl"


    // $ANTLR start "rule__Resource__Group_1_2__0"
    // InternalSemanticNodesDsl.g:1288:1: rule__Resource__Group_1_2__0 : rule__Resource__Group_1_2__0__Impl rule__Resource__Group_1_2__1 ;
    public final void rule__Resource__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1292:1: ( rule__Resource__Group_1_2__0__Impl rule__Resource__Group_1_2__1 )
            // InternalSemanticNodesDsl.g:1293:2: rule__Resource__Group_1_2__0__Impl rule__Resource__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1_2__0"


    // $ANTLR start "rule__Resource__Group_1_2__0__Impl"
    // InternalSemanticNodesDsl.g:1300:1: rule__Resource__Group_1_2__0__Impl : ( '@' ) ;
    public final void rule__Resource__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1304:1: ( ( '@' ) )
            // InternalSemanticNodesDsl.g:1305:1: ( '@' )
            {
            // InternalSemanticNodesDsl.g:1305:1: ( '@' )
            // InternalSemanticNodesDsl.g:1306:2: '@'
            {
             before(grammarAccess.getResourceAccess().getCommercialAtKeyword_1_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommercialAtKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1_2__0__Impl"


    // $ANTLR start "rule__Resource__Group_1_2__1"
    // InternalSemanticNodesDsl.g:1315:1: rule__Resource__Group_1_2__1 : rule__Resource__Group_1_2__1__Impl ;
    public final void rule__Resource__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1319:1: ( rule__Resource__Group_1_2__1__Impl )
            // InternalSemanticNodesDsl.g:1320:2: rule__Resource__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1_2__1"


    // $ANTLR start "rule__Resource__Group_1_2__1__Impl"
    // InternalSemanticNodesDsl.g:1326:1: rule__Resource__Group_1_2__1__Impl : ( ( rule__Resource__AnnotationsAssignment_1_2_1 ) ) ;
    public final void rule__Resource__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1330:1: ( ( ( rule__Resource__AnnotationsAssignment_1_2_1 ) ) )
            // InternalSemanticNodesDsl.g:1331:1: ( ( rule__Resource__AnnotationsAssignment_1_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:1331:1: ( ( rule__Resource__AnnotationsAssignment_1_2_1 ) )
            // InternalSemanticNodesDsl.g:1332:2: ( rule__Resource__AnnotationsAssignment_1_2_1 )
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_2_1()); 
            // InternalSemanticNodesDsl.g:1333:2: ( rule__Resource__AnnotationsAssignment_1_2_1 )
            // InternalSemanticNodesDsl.g:1333:3: rule__Resource__AnnotationsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__AnnotationsAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getAnnotationsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_1_2__1__Impl"


    // $ANTLR start "rule__Resource__Group_5__0"
    // InternalSemanticNodesDsl.g:1342:1: rule__Resource__Group_5__0 : rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 ;
    public final void rule__Resource__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1346:1: ( rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1 )
            // InternalSemanticNodesDsl.g:1347:2: rule__Resource__Group_5__0__Impl rule__Resource__Group_5__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSemanticNodesDsl.g:1354:1: rule__Resource__Group_5__0__Impl : ( ( rule__Resource__ResourceElementsAssignment_5_0 ) ) ;
    public final void rule__Resource__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1358:1: ( ( ( rule__Resource__ResourceElementsAssignment_5_0 ) ) )
            // InternalSemanticNodesDsl.g:1359:1: ( ( rule__Resource__ResourceElementsAssignment_5_0 ) )
            {
            // InternalSemanticNodesDsl.g:1359:1: ( ( rule__Resource__ResourceElementsAssignment_5_0 ) )
            // InternalSemanticNodesDsl.g:1360:2: ( rule__Resource__ResourceElementsAssignment_5_0 )
            {
             before(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_0()); 
            // InternalSemanticNodesDsl.g:1361:2: ( rule__Resource__ResourceElementsAssignment_5_0 )
            // InternalSemanticNodesDsl.g:1361:3: rule__Resource__ResourceElementsAssignment_5_0
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
    // InternalSemanticNodesDsl.g:1369:1: rule__Resource__Group_5__1 : rule__Resource__Group_5__1__Impl ;
    public final void rule__Resource__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1373:1: ( rule__Resource__Group_5__1__Impl )
            // InternalSemanticNodesDsl.g:1374:2: rule__Resource__Group_5__1__Impl
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
    // InternalSemanticNodesDsl.g:1380:1: rule__Resource__Group_5__1__Impl : ( ( rule__Resource__ResourceElementsAssignment_5_1 )* ) ;
    public final void rule__Resource__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1384:1: ( ( ( rule__Resource__ResourceElementsAssignment_5_1 )* ) )
            // InternalSemanticNodesDsl.g:1385:1: ( ( rule__Resource__ResourceElementsAssignment_5_1 )* )
            {
            // InternalSemanticNodesDsl.g:1385:1: ( ( rule__Resource__ResourceElementsAssignment_5_1 )* )
            // InternalSemanticNodesDsl.g:1386:2: ( rule__Resource__ResourceElementsAssignment_5_1 )*
            {
             before(grammarAccess.getResourceAccess().getResourceElementsAssignment_5_1()); 
            // InternalSemanticNodesDsl.g:1387:2: ( rule__Resource__ResourceElementsAssignment_5_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||LA15_0==20||LA15_0==22||LA15_0==24||LA15_0==30) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1387:3: rule__Resource__ResourceElementsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Resource__ResourceElementsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalSemanticNodesDsl.g:1396:1: rule__Resource__Group_7__0 : rule__Resource__Group_7__0__Impl rule__Resource__Group_7__1 ;
    public final void rule__Resource__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1400:1: ( rule__Resource__Group_7__0__Impl rule__Resource__Group_7__1 )
            // InternalSemanticNodesDsl.g:1401:2: rule__Resource__Group_7__0__Impl rule__Resource__Group_7__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:1408:1: rule__Resource__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Resource__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1412:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:1413:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:1413:1: ( '{' )
            // InternalSemanticNodesDsl.g:1414:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7_0()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1423:1: rule__Resource__Group_7__1 : rule__Resource__Group_7__1__Impl rule__Resource__Group_7__2 ;
    public final void rule__Resource__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1427:1: ( rule__Resource__Group_7__1__Impl rule__Resource__Group_7__2 )
            // InternalSemanticNodesDsl.g:1428:2: rule__Resource__Group_7__1__Impl rule__Resource__Group_7__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:1435:1: rule__Resource__Group_7__1__Impl : ( ( rule__Resource__MetaDataValueAssignment_7_1 ) ) ;
    public final void rule__Resource__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1439:1: ( ( ( rule__Resource__MetaDataValueAssignment_7_1 ) ) )
            // InternalSemanticNodesDsl.g:1440:1: ( ( rule__Resource__MetaDataValueAssignment_7_1 ) )
            {
            // InternalSemanticNodesDsl.g:1440:1: ( ( rule__Resource__MetaDataValueAssignment_7_1 ) )
            // InternalSemanticNodesDsl.g:1441:2: ( rule__Resource__MetaDataValueAssignment_7_1 )
            {
             before(grammarAccess.getResourceAccess().getMetaDataValueAssignment_7_1()); 
            // InternalSemanticNodesDsl.g:1442:2: ( rule__Resource__MetaDataValueAssignment_7_1 )
            // InternalSemanticNodesDsl.g:1442:3: rule__Resource__MetaDataValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__MetaDataValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getMetaDataValueAssignment_7_1()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1450:1: rule__Resource__Group_7__2 : rule__Resource__Group_7__2__Impl rule__Resource__Group_7__3 ;
    public final void rule__Resource__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1454:1: ( rule__Resource__Group_7__2__Impl rule__Resource__Group_7__3 )
            // InternalSemanticNodesDsl.g:1455:2: rule__Resource__Group_7__2__Impl rule__Resource__Group_7__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:1462:1: rule__Resource__Group_7__2__Impl : ( ( rule__Resource__Group_7_2__0 )* ) ;
    public final void rule__Resource__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1466:1: ( ( ( rule__Resource__Group_7_2__0 )* ) )
            // InternalSemanticNodesDsl.g:1467:1: ( ( rule__Resource__Group_7_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:1467:1: ( ( rule__Resource__Group_7_2__0 )* )
            // InternalSemanticNodesDsl.g:1468:2: ( rule__Resource__Group_7_2__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_7_2()); 
            // InternalSemanticNodesDsl.g:1469:2: ( rule__Resource__Group_7_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1469:3: rule__Resource__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Resource__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_7_2()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1477:1: rule__Resource__Group_7__3 : rule__Resource__Group_7__3__Impl ;
    public final void rule__Resource__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1481:1: ( rule__Resource__Group_7__3__Impl )
            // InternalSemanticNodesDsl.g:1482:2: rule__Resource__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_7__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalSemanticNodesDsl.g:1488:1: rule__Resource__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Resource__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1492:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1493:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1493:1: ( '}' )
            // InternalSemanticNodesDsl.g:1494:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Resource__Group_7_2__0"
    // InternalSemanticNodesDsl.g:1504:1: rule__Resource__Group_7_2__0 : rule__Resource__Group_7_2__0__Impl rule__Resource__Group_7_2__1 ;
    public final void rule__Resource__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1508:1: ( rule__Resource__Group_7_2__0__Impl rule__Resource__Group_7_2__1 )
            // InternalSemanticNodesDsl.g:1509:2: rule__Resource__Group_7_2__0__Impl rule__Resource__Group_7_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7_2__0"


    // $ANTLR start "rule__Resource__Group_7_2__0__Impl"
    // InternalSemanticNodesDsl.g:1516:1: rule__Resource__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1520:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:1521:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:1521:1: ( ',' )
            // InternalSemanticNodesDsl.g:1522:2: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_7_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7_2__0__Impl"


    // $ANTLR start "rule__Resource__Group_7_2__1"
    // InternalSemanticNodesDsl.g:1531:1: rule__Resource__Group_7_2__1 : rule__Resource__Group_7_2__1__Impl ;
    public final void rule__Resource__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1535:1: ( rule__Resource__Group_7_2__1__Impl )
            // InternalSemanticNodesDsl.g:1536:2: rule__Resource__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7_2__1"


    // $ANTLR start "rule__Resource__Group_7_2__1__Impl"
    // InternalSemanticNodesDsl.g:1542:1: rule__Resource__Group_7_2__1__Impl : ( ( rule__Resource__MetaDataValueAssignment_7_2_1 ) ) ;
    public final void rule__Resource__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1546:1: ( ( ( rule__Resource__MetaDataValueAssignment_7_2_1 ) ) )
            // InternalSemanticNodesDsl.g:1547:1: ( ( rule__Resource__MetaDataValueAssignment_7_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:1547:1: ( ( rule__Resource__MetaDataValueAssignment_7_2_1 ) )
            // InternalSemanticNodesDsl.g:1548:2: ( rule__Resource__MetaDataValueAssignment_7_2_1 )
            {
             before(grammarAccess.getResourceAccess().getMetaDataValueAssignment_7_2_1()); 
            // InternalSemanticNodesDsl.g:1549:2: ( rule__Resource__MetaDataValueAssignment_7_2_1 )
            // InternalSemanticNodesDsl.g:1549:3: rule__Resource__MetaDataValueAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__MetaDataValueAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getMetaDataValueAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group_7_2__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // InternalSemanticNodesDsl.g:1558:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1562:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // InternalSemanticNodesDsl.g:1563:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalSemanticNodesDsl.g:1570:1: rule__Enumeration__Group__0__Impl : ( () ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1574:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:1575:1: ( () )
            {
            // InternalSemanticNodesDsl.g:1575:1: ( () )
            // InternalSemanticNodesDsl.g:1576:2: ()
            {
             before(grammarAccess.getEnumerationAccess().getEnumerationAction_0()); 
            // InternalSemanticNodesDsl.g:1577:2: ()
            // InternalSemanticNodesDsl.g:1577:3: 
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
    // InternalSemanticNodesDsl.g:1585:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1589:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // InternalSemanticNodesDsl.g:1590:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:1597:1: rule__Enumeration__Group__1__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1601:1: ( ( 'enum' ) )
            // InternalSemanticNodesDsl.g:1602:1: ( 'enum' )
            {
            // InternalSemanticNodesDsl.g:1602:1: ( 'enum' )
            // InternalSemanticNodesDsl.g:1603:2: 'enum'
            {
             before(grammarAccess.getEnumerationAccess().getEnumKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:1612:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1616:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // InternalSemanticNodesDsl.g:1617:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalSemanticNodesDsl.g:1624:1: rule__Enumeration__Group__2__Impl : ( ( rule__Enumeration__NameAssignment_2 ) ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1628:1: ( ( ( rule__Enumeration__NameAssignment_2 ) ) )
            // InternalSemanticNodesDsl.g:1629:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            {
            // InternalSemanticNodesDsl.g:1629:1: ( ( rule__Enumeration__NameAssignment_2 ) )
            // InternalSemanticNodesDsl.g:1630:2: ( rule__Enumeration__NameAssignment_2 )
            {
             before(grammarAccess.getEnumerationAccess().getNameAssignment_2()); 
            // InternalSemanticNodesDsl.g:1631:2: ( rule__Enumeration__NameAssignment_2 )
            // InternalSemanticNodesDsl.g:1631:3: rule__Enumeration__NameAssignment_2
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
    // InternalSemanticNodesDsl.g:1639:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1643:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // InternalSemanticNodesDsl.g:1644:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalSemanticNodesDsl.g:1651:1: rule__Enumeration__Group__3__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1655:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:1656:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:1656:1: ( '{' )
            // InternalSemanticNodesDsl.g:1657:2: '{'
            {
             before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:1666:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1670:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // InternalSemanticNodesDsl.g:1671:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalSemanticNodesDsl.g:1678:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__Group_4__0 )? ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1682:1: ( ( ( rule__Enumeration__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:1683:1: ( ( rule__Enumeration__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:1683:1: ( ( rule__Enumeration__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:1684:2: ( rule__Enumeration__Group_4__0 )?
            {
             before(grammarAccess.getEnumerationAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:1685:2: ( rule__Enumeration__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT||LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1685:3: rule__Enumeration__Group_4__0
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
    // InternalSemanticNodesDsl.g:1693:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1697:1: ( rule__Enumeration__Group__5__Impl )
            // InternalSemanticNodesDsl.g:1698:2: rule__Enumeration__Group__5__Impl
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
    // InternalSemanticNodesDsl.g:1704:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1708:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:1709:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:1709:1: ( '}' )
            // InternalSemanticNodesDsl.g:1710:2: '}'
            {
             before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:1720:1: rule__Enumeration__Group_4__0 : rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 ;
    public final void rule__Enumeration__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1724:1: ( rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1 )
            // InternalSemanticNodesDsl.g:1725:2: rule__Enumeration__Group_4__0__Impl rule__Enumeration__Group_4__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:1732:1: rule__Enumeration__Group_4__0__Impl : ( ( rule__Enumeration__LiteralsAssignment_4_0 ) ) ;
    public final void rule__Enumeration__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1736:1: ( ( ( rule__Enumeration__LiteralsAssignment_4_0 ) ) )
            // InternalSemanticNodesDsl.g:1737:1: ( ( rule__Enumeration__LiteralsAssignment_4_0 ) )
            {
            // InternalSemanticNodesDsl.g:1737:1: ( ( rule__Enumeration__LiteralsAssignment_4_0 ) )
            // InternalSemanticNodesDsl.g:1738:2: ( rule__Enumeration__LiteralsAssignment_4_0 )
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_0()); 
            // InternalSemanticNodesDsl.g:1739:2: ( rule__Enumeration__LiteralsAssignment_4_0 )
            // InternalSemanticNodesDsl.g:1739:3: rule__Enumeration__LiteralsAssignment_4_0
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
    // InternalSemanticNodesDsl.g:1747:1: rule__Enumeration__Group_4__1 : rule__Enumeration__Group_4__1__Impl ;
    public final void rule__Enumeration__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1751:1: ( rule__Enumeration__Group_4__1__Impl )
            // InternalSemanticNodesDsl.g:1752:2: rule__Enumeration__Group_4__1__Impl
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
    // InternalSemanticNodesDsl.g:1758:1: rule__Enumeration__Group_4__1__Impl : ( ( rule__Enumeration__LiteralsAssignment_4_1 )* ) ;
    public final void rule__Enumeration__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1762:1: ( ( ( rule__Enumeration__LiteralsAssignment_4_1 )* ) )
            // InternalSemanticNodesDsl.g:1763:1: ( ( rule__Enumeration__LiteralsAssignment_4_1 )* )
            {
            // InternalSemanticNodesDsl.g:1763:1: ( ( rule__Enumeration__LiteralsAssignment_4_1 )* )
            // InternalSemanticNodesDsl.g:1764:2: ( rule__Enumeration__LiteralsAssignment_4_1 )*
            {
             before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:1765:2: ( rule__Enumeration__LiteralsAssignment_4_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_INT||LA18_0==29) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:1765:3: rule__Enumeration__LiteralsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Enumeration__LiteralsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalSemanticNodesDsl.g:1774:1: rule__EnumerationLiteral__Group__0 : rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 ;
    public final void rule__EnumerationLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1778:1: ( rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1 )
            // InternalSemanticNodesDsl.g:1779:2: rule__EnumerationLiteral__Group__0__Impl rule__EnumerationLiteral__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:1786:1: rule__EnumerationLiteral__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1790:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:1791:1: ( () )
            {
            // InternalSemanticNodesDsl.g:1791:1: ( () )
            // InternalSemanticNodesDsl.g:1792:2: ()
            {
             before(grammarAccess.getEnumerationLiteralAccess().getEnumerationLiteralAction_0()); 
            // InternalSemanticNodesDsl.g:1793:2: ()
            // InternalSemanticNodesDsl.g:1793:3: 
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
    // InternalSemanticNodesDsl.g:1801:1: rule__EnumerationLiteral__Group__1 : rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 ;
    public final void rule__EnumerationLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1805:1: ( rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2 )
            // InternalSemanticNodesDsl.g:1806:2: rule__EnumerationLiteral__Group__1__Impl rule__EnumerationLiteral__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSemanticNodesDsl.g:1813:1: rule__EnumerationLiteral__Group__1__Impl : ( ( rule__EnumerationLiteral__ValueAssignment_1 ) ) ;
    public final void rule__EnumerationLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1817:1: ( ( ( rule__EnumerationLiteral__ValueAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:1818:1: ( ( rule__EnumerationLiteral__ValueAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:1818:1: ( ( rule__EnumerationLiteral__ValueAssignment_1 ) )
            // InternalSemanticNodesDsl.g:1819:2: ( rule__EnumerationLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getValueAssignment_1()); 
            // InternalSemanticNodesDsl.g:1820:2: ( rule__EnumerationLiteral__ValueAssignment_1 )
            // InternalSemanticNodesDsl.g:1820:3: rule__EnumerationLiteral__ValueAssignment_1
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
    // InternalSemanticNodesDsl.g:1828:1: rule__EnumerationLiteral__Group__2 : rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3 ;
    public final void rule__EnumerationLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1832:1: ( rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3 )
            // InternalSemanticNodesDsl.g:1833:2: rule__EnumerationLiteral__Group__2__Impl rule__EnumerationLiteral__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:1840:1: rule__EnumerationLiteral__Group__2__Impl : ( '->' ) ;
    public final void rule__EnumerationLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1844:1: ( ( '->' ) )
            // InternalSemanticNodesDsl.g:1845:1: ( '->' )
            {
            // InternalSemanticNodesDsl.g:1845:1: ( '->' )
            // InternalSemanticNodesDsl.g:1846:2: '->'
            {
             before(grammarAccess.getEnumerationLiteralAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:1855:1: rule__EnumerationLiteral__Group__3 : rule__EnumerationLiteral__Group__3__Impl ;
    public final void rule__EnumerationLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1859:1: ( rule__EnumerationLiteral__Group__3__Impl )
            // InternalSemanticNodesDsl.g:1860:2: rule__EnumerationLiteral__Group__3__Impl
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
    // InternalSemanticNodesDsl.g:1866:1: rule__EnumerationLiteral__Group__3__Impl : ( ( rule__EnumerationLiteral__LiteralAssignment_3 ) ) ;
    public final void rule__EnumerationLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1870:1: ( ( ( rule__EnumerationLiteral__LiteralAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:1871:1: ( ( rule__EnumerationLiteral__LiteralAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:1871:1: ( ( rule__EnumerationLiteral__LiteralAssignment_3 ) )
            // InternalSemanticNodesDsl.g:1872:2: ( rule__EnumerationLiteral__LiteralAssignment_3 )
            {
             before(grammarAccess.getEnumerationLiteralAccess().getLiteralAssignment_3()); 
            // InternalSemanticNodesDsl.g:1873:2: ( rule__EnumerationLiteral__LiteralAssignment_3 )
            // InternalSemanticNodesDsl.g:1873:3: rule__EnumerationLiteral__LiteralAssignment_3
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
    // InternalSemanticNodesDsl.g:1882:1: rule__SemanticNode__Group__0 : rule__SemanticNode__Group__0__Impl rule__SemanticNode__Group__1 ;
    public final void rule__SemanticNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1886:1: ( rule__SemanticNode__Group__0__Impl rule__SemanticNode__Group__1 )
            // InternalSemanticNodesDsl.g:1887:2: rule__SemanticNode__Group__0__Impl rule__SemanticNode__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSemanticNodesDsl.g:1894:1: rule__SemanticNode__Group__0__Impl : ( () ) ;
    public final void rule__SemanticNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1898:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:1899:1: ( () )
            {
            // InternalSemanticNodesDsl.g:1899:1: ( () )
            // InternalSemanticNodesDsl.g:1900:2: ()
            {
             before(grammarAccess.getSemanticNodeAccess().getSemanticNodeAction_0()); 
            // InternalSemanticNodesDsl.g:1901:2: ()
            // InternalSemanticNodesDsl.g:1901:3: 
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
    // InternalSemanticNodesDsl.g:1909:1: rule__SemanticNode__Group__1 : rule__SemanticNode__Group__1__Impl rule__SemanticNode__Group__2 ;
    public final void rule__SemanticNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1913:1: ( rule__SemanticNode__Group__1__Impl rule__SemanticNode__Group__2 )
            // InternalSemanticNodesDsl.g:1914:2: rule__SemanticNode__Group__1__Impl rule__SemanticNode__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSemanticNodesDsl.g:1921:1: rule__SemanticNode__Group__1__Impl : ( ( rule__SemanticNode__AbstractAssignment_1 )? ) ;
    public final void rule__SemanticNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1925:1: ( ( ( rule__SemanticNode__AbstractAssignment_1 )? ) )
            // InternalSemanticNodesDsl.g:1926:1: ( ( rule__SemanticNode__AbstractAssignment_1 )? )
            {
            // InternalSemanticNodesDsl.g:1926:1: ( ( rule__SemanticNode__AbstractAssignment_1 )? )
            // InternalSemanticNodesDsl.g:1927:2: ( rule__SemanticNode__AbstractAssignment_1 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getAbstractAssignment_1()); 
            // InternalSemanticNodesDsl.g:1928:2: ( rule__SemanticNode__AbstractAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==30) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSemanticNodesDsl.g:1928:3: rule__SemanticNode__AbstractAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SemanticNode__AbstractAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemanticNodeAccess().getAbstractAssignment_1()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1936:1: rule__SemanticNode__Group__2 : rule__SemanticNode__Group__2__Impl rule__SemanticNode__Group__3 ;
    public final void rule__SemanticNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1940:1: ( rule__SemanticNode__Group__2__Impl rule__SemanticNode__Group__3 )
            // InternalSemanticNodesDsl.g:1941:2: rule__SemanticNode__Group__2__Impl rule__SemanticNode__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:1948:1: rule__SemanticNode__Group__2__Impl : ( 'node' ) ;
    public final void rule__SemanticNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1952:1: ( ( 'node' ) )
            // InternalSemanticNodesDsl.g:1953:1: ( 'node' )
            {
            // InternalSemanticNodesDsl.g:1953:1: ( 'node' )
            // InternalSemanticNodesDsl.g:1954:2: 'node'
            {
             before(grammarAccess.getSemanticNodeAccess().getNodeKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getNodeKeyword_2()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1963:1: rule__SemanticNode__Group__3 : rule__SemanticNode__Group__3__Impl rule__SemanticNode__Group__4 ;
    public final void rule__SemanticNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1967:1: ( rule__SemanticNode__Group__3__Impl rule__SemanticNode__Group__4 )
            // InternalSemanticNodesDsl.g:1968:2: rule__SemanticNode__Group__3__Impl rule__SemanticNode__Group__4
            {
            pushFollow(FOLLOW_9);
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
    // InternalSemanticNodesDsl.g:1975:1: rule__SemanticNode__Group__3__Impl : ( ( rule__SemanticNode__NameAssignment_3 ) ) ;
    public final void rule__SemanticNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1979:1: ( ( ( rule__SemanticNode__NameAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:1980:1: ( ( rule__SemanticNode__NameAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:1980:1: ( ( rule__SemanticNode__NameAssignment_3 ) )
            // InternalSemanticNodesDsl.g:1981:2: ( rule__SemanticNode__NameAssignment_3 )
            {
             before(grammarAccess.getSemanticNodeAccess().getNameAssignment_3()); 
            // InternalSemanticNodesDsl.g:1982:2: ( rule__SemanticNode__NameAssignment_3 )
            // InternalSemanticNodesDsl.g:1982:3: rule__SemanticNode__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:1990:1: rule__SemanticNode__Group__4 : rule__SemanticNode__Group__4__Impl rule__SemanticNode__Group__5 ;
    public final void rule__SemanticNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:1994:1: ( rule__SemanticNode__Group__4__Impl rule__SemanticNode__Group__5 )
            // InternalSemanticNodesDsl.g:1995:2: rule__SemanticNode__Group__4__Impl rule__SemanticNode__Group__5
            {
            pushFollow(FOLLOW_25);
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
    // InternalSemanticNodesDsl.g:2002:1: rule__SemanticNode__Group__4__Impl : ( '{' ) ;
    public final void rule__SemanticNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2006:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:2007:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:2007:1: ( '{' )
            // InternalSemanticNodesDsl.g:2008:2: '{'
            {
             before(grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:2017:1: rule__SemanticNode__Group__5 : rule__SemanticNode__Group__5__Impl rule__SemanticNode__Group__6 ;
    public final void rule__SemanticNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2021:1: ( rule__SemanticNode__Group__5__Impl rule__SemanticNode__Group__6 )
            // InternalSemanticNodesDsl.g:2022:2: rule__SemanticNode__Group__5__Impl rule__SemanticNode__Group__6
            {
            pushFollow(FOLLOW_25);
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
    // InternalSemanticNodesDsl.g:2029:1: rule__SemanticNode__Group__5__Impl : ( ( rule__SemanticNode__Group_5__0 )? ) ;
    public final void rule__SemanticNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2033:1: ( ( ( rule__SemanticNode__Group_5__0 )? ) )
            // InternalSemanticNodesDsl.g:2034:1: ( ( rule__SemanticNode__Group_5__0 )? )
            {
            // InternalSemanticNodesDsl.g:2034:1: ( ( rule__SemanticNode__Group_5__0 )? )
            // InternalSemanticNodesDsl.g:2035:2: ( rule__SemanticNode__Group_5__0 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_5()); 
            // InternalSemanticNodesDsl.g:2036:2: ( rule__SemanticNode__Group_5__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2036:3: rule__SemanticNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SemanticNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemanticNodeAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:2044:1: rule__SemanticNode__Group__6 : rule__SemanticNode__Group__6__Impl rule__SemanticNode__Group__7 ;
    public final void rule__SemanticNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2048:1: ( rule__SemanticNode__Group__6__Impl rule__SemanticNode__Group__7 )
            // InternalSemanticNodesDsl.g:2049:2: rule__SemanticNode__Group__6__Impl rule__SemanticNode__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalSemanticNodesDsl.g:2056:1: rule__SemanticNode__Group__6__Impl : ( '}' ) ;
    public final void rule__SemanticNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2060:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:2061:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:2061:1: ( '}' )
            // InternalSemanticNodesDsl.g:2062:2: '}'
            {
             before(grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:2071:1: rule__SemanticNode__Group__7 : rule__SemanticNode__Group__7__Impl ;
    public final void rule__SemanticNode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2075:1: ( rule__SemanticNode__Group__7__Impl )
            // InternalSemanticNodesDsl.g:2076:2: rule__SemanticNode__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group__7__Impl();

            state._fsp--;


            }

        }
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
    // InternalSemanticNodesDsl.g:2082:1: rule__SemanticNode__Group__7__Impl : ( ( rule__SemanticNode__Group_7__0 )? ) ;
    public final void rule__SemanticNode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2086:1: ( ( ( rule__SemanticNode__Group_7__0 )? ) )
            // InternalSemanticNodesDsl.g:2087:1: ( ( rule__SemanticNode__Group_7__0 )? )
            {
            // InternalSemanticNodesDsl.g:2087:1: ( ( rule__SemanticNode__Group_7__0 )? )
            // InternalSemanticNodesDsl.g:2088:2: ( rule__SemanticNode__Group_7__0 )?
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_7()); 
            // InternalSemanticNodesDsl.g:2089:2: ( rule__SemanticNode__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==18) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2089:3: rule__SemanticNode__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SemanticNode__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSemanticNodeAccess().getGroup_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__SemanticNode__Group_5__0"
    // InternalSemanticNodesDsl.g:2098:1: rule__SemanticNode__Group_5__0 : rule__SemanticNode__Group_5__0__Impl rule__SemanticNode__Group_5__1 ;
    public final void rule__SemanticNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2102:1: ( rule__SemanticNode__Group_5__0__Impl rule__SemanticNode__Group_5__1 )
            // InternalSemanticNodesDsl.g:2103:2: rule__SemanticNode__Group_5__0__Impl rule__SemanticNode__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__SemanticNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_5__0"


    // $ANTLR start "rule__SemanticNode__Group_5__0__Impl"
    // InternalSemanticNodesDsl.g:2110:1: rule__SemanticNode__Group_5__0__Impl : ( ( rule__SemanticNode__PropertiesAssignment_5_0 ) ) ;
    public final void rule__SemanticNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2114:1: ( ( ( rule__SemanticNode__PropertiesAssignment_5_0 ) ) )
            // InternalSemanticNodesDsl.g:2115:1: ( ( rule__SemanticNode__PropertiesAssignment_5_0 ) )
            {
            // InternalSemanticNodesDsl.g:2115:1: ( ( rule__SemanticNode__PropertiesAssignment_5_0 ) )
            // InternalSemanticNodesDsl.g:2116:2: ( rule__SemanticNode__PropertiesAssignment_5_0 )
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_5_0()); 
            // InternalSemanticNodesDsl.g:2117:2: ( rule__SemanticNode__PropertiesAssignment_5_0 )
            // InternalSemanticNodesDsl.g:2117:3: rule__SemanticNode__PropertiesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__PropertiesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_5__0__Impl"


    // $ANTLR start "rule__SemanticNode__Group_5__1"
    // InternalSemanticNodesDsl.g:2125:1: rule__SemanticNode__Group_5__1 : rule__SemanticNode__Group_5__1__Impl ;
    public final void rule__SemanticNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2129:1: ( rule__SemanticNode__Group_5__1__Impl )
            // InternalSemanticNodesDsl.g:2130:2: rule__SemanticNode__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_5__1"


    // $ANTLR start "rule__SemanticNode__Group_5__1__Impl"
    // InternalSemanticNodesDsl.g:2136:1: rule__SemanticNode__Group_5__1__Impl : ( ( rule__SemanticNode__PropertiesAssignment_5_1 )* ) ;
    public final void rule__SemanticNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2140:1: ( ( ( rule__SemanticNode__PropertiesAssignment_5_1 )* ) )
            // InternalSemanticNodesDsl.g:2141:1: ( ( rule__SemanticNode__PropertiesAssignment_5_1 )* )
            {
            // InternalSemanticNodesDsl.g:2141:1: ( ( rule__SemanticNode__PropertiesAssignment_5_1 )* )
            // InternalSemanticNodesDsl.g:2142:2: ( rule__SemanticNode__PropertiesAssignment_5_1 )*
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_5_1()); 
            // InternalSemanticNodesDsl.g:2143:2: ( rule__SemanticNode__PropertiesAssignment_5_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:2143:3: rule__SemanticNode__PropertiesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_26);
            	    rule__SemanticNode__PropertiesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSemanticNodeAccess().getPropertiesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_5__1__Impl"


    // $ANTLR start "rule__SemanticNode__Group_7__0"
    // InternalSemanticNodesDsl.g:2152:1: rule__SemanticNode__Group_7__0 : rule__SemanticNode__Group_7__0__Impl rule__SemanticNode__Group_7__1 ;
    public final void rule__SemanticNode__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2156:1: ( rule__SemanticNode__Group_7__0__Impl rule__SemanticNode__Group_7__1 )
            // InternalSemanticNodesDsl.g:2157:2: rule__SemanticNode__Group_7__0__Impl rule__SemanticNode__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__SemanticNode__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7__0"


    // $ANTLR start "rule__SemanticNode__Group_7__0__Impl"
    // InternalSemanticNodesDsl.g:2164:1: rule__SemanticNode__Group_7__0__Impl : ( '{' ) ;
    public final void rule__SemanticNode__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2168:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:2169:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:2169:1: ( '{' )
            // InternalSemanticNodesDsl.g:2170:2: '{'
            {
             before(grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getLeftCurlyBracketKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7__0__Impl"


    // $ANTLR start "rule__SemanticNode__Group_7__1"
    // InternalSemanticNodesDsl.g:2179:1: rule__SemanticNode__Group_7__1 : rule__SemanticNode__Group_7__1__Impl rule__SemanticNode__Group_7__2 ;
    public final void rule__SemanticNode__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2183:1: ( rule__SemanticNode__Group_7__1__Impl rule__SemanticNode__Group_7__2 )
            // InternalSemanticNodesDsl.g:2184:2: rule__SemanticNode__Group_7__1__Impl rule__SemanticNode__Group_7__2
            {
            pushFollow(FOLLOW_18);
            rule__SemanticNode__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7__1"


    // $ANTLR start "rule__SemanticNode__Group_7__1__Impl"
    // InternalSemanticNodesDsl.g:2191:1: rule__SemanticNode__Group_7__1__Impl : ( ( rule__SemanticNode__MetaDataValueAssignment_7_1 ) ) ;
    public final void rule__SemanticNode__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2195:1: ( ( ( rule__SemanticNode__MetaDataValueAssignment_7_1 ) ) )
            // InternalSemanticNodesDsl.g:2196:1: ( ( rule__SemanticNode__MetaDataValueAssignment_7_1 ) )
            {
            // InternalSemanticNodesDsl.g:2196:1: ( ( rule__SemanticNode__MetaDataValueAssignment_7_1 ) )
            // InternalSemanticNodesDsl.g:2197:2: ( rule__SemanticNode__MetaDataValueAssignment_7_1 )
            {
             before(grammarAccess.getSemanticNodeAccess().getMetaDataValueAssignment_7_1()); 
            // InternalSemanticNodesDsl.g:2198:2: ( rule__SemanticNode__MetaDataValueAssignment_7_1 )
            // InternalSemanticNodesDsl.g:2198:3: rule__SemanticNode__MetaDataValueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__MetaDataValueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getMetaDataValueAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7__1__Impl"


    // $ANTLR start "rule__SemanticNode__Group_7__2"
    // InternalSemanticNodesDsl.g:2206:1: rule__SemanticNode__Group_7__2 : rule__SemanticNode__Group_7__2__Impl rule__SemanticNode__Group_7__3 ;
    public final void rule__SemanticNode__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2210:1: ( rule__SemanticNode__Group_7__2__Impl rule__SemanticNode__Group_7__3 )
            // InternalSemanticNodesDsl.g:2211:2: rule__SemanticNode__Group_7__2__Impl rule__SemanticNode__Group_7__3
            {
            pushFollow(FOLLOW_18);
            rule__SemanticNode__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7__2"


    // $ANTLR start "rule__SemanticNode__Group_7__2__Impl"
    // InternalSemanticNodesDsl.g:2218:1: rule__SemanticNode__Group_7__2__Impl : ( ( rule__SemanticNode__Group_7_2__0 )* ) ;
    public final void rule__SemanticNode__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2222:1: ( ( ( rule__SemanticNode__Group_7_2__0 )* ) )
            // InternalSemanticNodesDsl.g:2223:1: ( ( rule__SemanticNode__Group_7_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:2223:1: ( ( rule__SemanticNode__Group_7_2__0 )* )
            // InternalSemanticNodesDsl.g:2224:2: ( rule__SemanticNode__Group_7_2__0 )*
            {
             before(grammarAccess.getSemanticNodeAccess().getGroup_7_2()); 
            // InternalSemanticNodesDsl.g:2225:2: ( rule__SemanticNode__Group_7_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:2225:3: rule__SemanticNode__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__SemanticNode__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSemanticNodeAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7__2__Impl"


    // $ANTLR start "rule__SemanticNode__Group_7__3"
    // InternalSemanticNodesDsl.g:2233:1: rule__SemanticNode__Group_7__3 : rule__SemanticNode__Group_7__3__Impl ;
    public final void rule__SemanticNode__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2237:1: ( rule__SemanticNode__Group_7__3__Impl )
            // InternalSemanticNodesDsl.g:2238:2: rule__SemanticNode__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7__3"


    // $ANTLR start "rule__SemanticNode__Group_7__3__Impl"
    // InternalSemanticNodesDsl.g:2244:1: rule__SemanticNode__Group_7__3__Impl : ( '}' ) ;
    public final void rule__SemanticNode__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2248:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:2249:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:2249:1: ( '}' )
            // InternalSemanticNodesDsl.g:2250:2: '}'
            {
             before(grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7__3__Impl"


    // $ANTLR start "rule__SemanticNode__Group_7_2__0"
    // InternalSemanticNodesDsl.g:2260:1: rule__SemanticNode__Group_7_2__0 : rule__SemanticNode__Group_7_2__0__Impl rule__SemanticNode__Group_7_2__1 ;
    public final void rule__SemanticNode__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2264:1: ( rule__SemanticNode__Group_7_2__0__Impl rule__SemanticNode__Group_7_2__1 )
            // InternalSemanticNodesDsl.g:2265:2: rule__SemanticNode__Group_7_2__0__Impl rule__SemanticNode__Group_7_2__1
            {
            pushFollow(FOLLOW_4);
            rule__SemanticNode__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7_2__0"


    // $ANTLR start "rule__SemanticNode__Group_7_2__0__Impl"
    // InternalSemanticNodesDsl.g:2272:1: rule__SemanticNode__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__SemanticNode__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2276:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2277:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2277:1: ( ',' )
            // InternalSemanticNodesDsl.g:2278:2: ','
            {
             before(grammarAccess.getSemanticNodeAccess().getCommaKeyword_7_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7_2__0__Impl"


    // $ANTLR start "rule__SemanticNode__Group_7_2__1"
    // InternalSemanticNodesDsl.g:2287:1: rule__SemanticNode__Group_7_2__1 : rule__SemanticNode__Group_7_2__1__Impl ;
    public final void rule__SemanticNode__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2291:1: ( rule__SemanticNode__Group_7_2__1__Impl )
            // InternalSemanticNodesDsl.g:2292:2: rule__SemanticNode__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7_2__1"


    // $ANTLR start "rule__SemanticNode__Group_7_2__1__Impl"
    // InternalSemanticNodesDsl.g:2298:1: rule__SemanticNode__Group_7_2__1__Impl : ( ( rule__SemanticNode__MetaDataValueAssignment_7_2_1 ) ) ;
    public final void rule__SemanticNode__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2302:1: ( ( ( rule__SemanticNode__MetaDataValueAssignment_7_2_1 ) ) )
            // InternalSemanticNodesDsl.g:2303:1: ( ( rule__SemanticNode__MetaDataValueAssignment_7_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:2303:1: ( ( rule__SemanticNode__MetaDataValueAssignment_7_2_1 ) )
            // InternalSemanticNodesDsl.g:2304:2: ( rule__SemanticNode__MetaDataValueAssignment_7_2_1 )
            {
             before(grammarAccess.getSemanticNodeAccess().getMetaDataValueAssignment_7_2_1()); 
            // InternalSemanticNodesDsl.g:2305:2: ( rule__SemanticNode__MetaDataValueAssignment_7_2_1 )
            // InternalSemanticNodesDsl.g:2305:3: rule__SemanticNode__MetaDataValueAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SemanticNode__MetaDataValueAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSemanticNodeAccess().getMetaDataValueAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__Group_7_2__1__Impl"


    // $ANTLR start "rule__ObjectProperty__Group__0"
    // InternalSemanticNodesDsl.g:2314:1: rule__ObjectProperty__Group__0 : rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 ;
    public final void rule__ObjectProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2318:1: ( rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1 )
            // InternalSemanticNodesDsl.g:2319:2: rule__ObjectProperty__Group__0__Impl rule__ObjectProperty__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:2326:1: rule__ObjectProperty__Group__0__Impl : ( () ) ;
    public final void rule__ObjectProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2330:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:2331:1: ( () )
            {
            // InternalSemanticNodesDsl.g:2331:1: ( () )
            // InternalSemanticNodesDsl.g:2332:2: ()
            {
             before(grammarAccess.getObjectPropertyAccess().getObjectPropertyAction_0()); 
            // InternalSemanticNodesDsl.g:2333:2: ()
            // InternalSemanticNodesDsl.g:2333:3: 
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
    // InternalSemanticNodesDsl.g:2341:1: rule__ObjectProperty__Group__1 : rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 ;
    public final void rule__ObjectProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2345:1: ( rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2 )
            // InternalSemanticNodesDsl.g:2346:2: rule__ObjectProperty__Group__1__Impl rule__ObjectProperty__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSemanticNodesDsl.g:2353:1: rule__ObjectProperty__Group__1__Impl : ( ( rule__ObjectProperty__NameAssignment_1 ) ) ;
    public final void rule__ObjectProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2357:1: ( ( ( rule__ObjectProperty__NameAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:2358:1: ( ( rule__ObjectProperty__NameAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:2358:1: ( ( rule__ObjectProperty__NameAssignment_1 ) )
            // InternalSemanticNodesDsl.g:2359:2: ( rule__ObjectProperty__NameAssignment_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getNameAssignment_1()); 
            // InternalSemanticNodesDsl.g:2360:2: ( rule__ObjectProperty__NameAssignment_1 )
            // InternalSemanticNodesDsl.g:2360:3: rule__ObjectProperty__NameAssignment_1
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
    // InternalSemanticNodesDsl.g:2368:1: rule__ObjectProperty__Group__2 : rule__ObjectProperty__Group__2__Impl rule__ObjectProperty__Group__3 ;
    public final void rule__ObjectProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2372:1: ( rule__ObjectProperty__Group__2__Impl rule__ObjectProperty__Group__3 )
            // InternalSemanticNodesDsl.g:2373:2: rule__ObjectProperty__Group__2__Impl rule__ObjectProperty__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:2380:1: rule__ObjectProperty__Group__2__Impl : ( '->' ) ;
    public final void rule__ObjectProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2384:1: ( ( '->' ) )
            // InternalSemanticNodesDsl.g:2385:1: ( '->' )
            {
            // InternalSemanticNodesDsl.g:2385:1: ( '->' )
            // InternalSemanticNodesDsl.g:2386:2: '->'
            {
             before(grammarAccess.getObjectPropertyAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2395:1: rule__ObjectProperty__Group__3 : rule__ObjectProperty__Group__3__Impl rule__ObjectProperty__Group__4 ;
    public final void rule__ObjectProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2399:1: ( rule__ObjectProperty__Group__3__Impl rule__ObjectProperty__Group__4 )
            // InternalSemanticNodesDsl.g:2400:2: rule__ObjectProperty__Group__3__Impl rule__ObjectProperty__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemanticNodesDsl.g:2407:1: rule__ObjectProperty__Group__3__Impl : ( ( rule__ObjectProperty__RangeAssignment_3 ) ) ;
    public final void rule__ObjectProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2411:1: ( ( ( rule__ObjectProperty__RangeAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:2412:1: ( ( rule__ObjectProperty__RangeAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:2412:1: ( ( rule__ObjectProperty__RangeAssignment_3 ) )
            // InternalSemanticNodesDsl.g:2413:2: ( rule__ObjectProperty__RangeAssignment_3 )
            {
             before(grammarAccess.getObjectPropertyAccess().getRangeAssignment_3()); 
            // InternalSemanticNodesDsl.g:2414:2: ( rule__ObjectProperty__RangeAssignment_3 )
            // InternalSemanticNodesDsl.g:2414:3: rule__ObjectProperty__RangeAssignment_3
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
    // InternalSemanticNodesDsl.g:2422:1: rule__ObjectProperty__Group__4 : rule__ObjectProperty__Group__4__Impl rule__ObjectProperty__Group__5 ;
    public final void rule__ObjectProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2426:1: ( rule__ObjectProperty__Group__4__Impl rule__ObjectProperty__Group__5 )
            // InternalSemanticNodesDsl.g:2427:2: rule__ObjectProperty__Group__4__Impl rule__ObjectProperty__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemanticNodesDsl.g:2434:1: rule__ObjectProperty__Group__4__Impl : ( ( rule__ObjectProperty__Group_4__0 )? ) ;
    public final void rule__ObjectProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2438:1: ( ( ( rule__ObjectProperty__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:2439:1: ( ( rule__ObjectProperty__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:2439:1: ( ( rule__ObjectProperty__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:2440:2: ( rule__ObjectProperty__Group_4__0 )?
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:2441:2: ( rule__ObjectProperty__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2441:3: rule__ObjectProperty__Group_4__0
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
    // InternalSemanticNodesDsl.g:2449:1: rule__ObjectProperty__Group__5 : rule__ObjectProperty__Group__5__Impl ;
    public final void rule__ObjectProperty__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2453:1: ( rule__ObjectProperty__Group__5__Impl )
            // InternalSemanticNodesDsl.g:2454:2: rule__ObjectProperty__Group__5__Impl
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
    // InternalSemanticNodesDsl.g:2460:1: rule__ObjectProperty__Group__5__Impl : ( ( rule__ObjectProperty__Group_5__0 )? ) ;
    public final void rule__ObjectProperty__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2464:1: ( ( ( rule__ObjectProperty__Group_5__0 )? ) )
            // InternalSemanticNodesDsl.g:2465:1: ( ( rule__ObjectProperty__Group_5__0 )? )
            {
            // InternalSemanticNodesDsl.g:2465:1: ( ( rule__ObjectProperty__Group_5__0 )? )
            // InternalSemanticNodesDsl.g:2466:2: ( rule__ObjectProperty__Group_5__0 )?
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup_5()); 
            // InternalSemanticNodesDsl.g:2467:2: ( rule__ObjectProperty__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==18) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2467:3: rule__ObjectProperty__Group_5__0
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
    // InternalSemanticNodesDsl.g:2476:1: rule__ObjectProperty__Group_4__0 : rule__ObjectProperty__Group_4__0__Impl rule__ObjectProperty__Group_4__1 ;
    public final void rule__ObjectProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2480:1: ( rule__ObjectProperty__Group_4__0__Impl rule__ObjectProperty__Group_4__1 )
            // InternalSemanticNodesDsl.g:2481:2: rule__ObjectProperty__Group_4__0__Impl rule__ObjectProperty__Group_4__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:2488:1: rule__ObjectProperty__Group_4__0__Impl : ( '[' ) ;
    public final void rule__ObjectProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2492:1: ( ( '[' ) )
            // InternalSemanticNodesDsl.g:2493:1: ( '[' )
            {
            // InternalSemanticNodesDsl.g:2493:1: ( '[' )
            // InternalSemanticNodesDsl.g:2494:2: '['
            {
             before(grammarAccess.getObjectPropertyAccess().getLeftSquareBracketKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2503:1: rule__ObjectProperty__Group_4__1 : rule__ObjectProperty__Group_4__1__Impl rule__ObjectProperty__Group_4__2 ;
    public final void rule__ObjectProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2507:1: ( rule__ObjectProperty__Group_4__1__Impl rule__ObjectProperty__Group_4__2 )
            // InternalSemanticNodesDsl.g:2508:2: rule__ObjectProperty__Group_4__1__Impl rule__ObjectProperty__Group_4__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSemanticNodesDsl.g:2515:1: rule__ObjectProperty__Group_4__1__Impl : ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__ObjectProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2519:1: ( ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) ) )
            // InternalSemanticNodesDsl.g:2520:1: ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) )
            {
            // InternalSemanticNodesDsl.g:2520:1: ( ( rule__ObjectProperty__LowerBoundAssignment_4_1 ) )
            // InternalSemanticNodesDsl.g:2521:2: ( rule__ObjectProperty__LowerBoundAssignment_4_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getLowerBoundAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:2522:2: ( rule__ObjectProperty__LowerBoundAssignment_4_1 )
            // InternalSemanticNodesDsl.g:2522:3: rule__ObjectProperty__LowerBoundAssignment_4_1
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
    // InternalSemanticNodesDsl.g:2530:1: rule__ObjectProperty__Group_4__2 : rule__ObjectProperty__Group_4__2__Impl rule__ObjectProperty__Group_4__3 ;
    public final void rule__ObjectProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2534:1: ( rule__ObjectProperty__Group_4__2__Impl rule__ObjectProperty__Group_4__3 )
            // InternalSemanticNodesDsl.g:2535:2: rule__ObjectProperty__Group_4__2__Impl rule__ObjectProperty__Group_4__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:2542:1: rule__ObjectProperty__Group_4__2__Impl : ( ',' ) ;
    public final void rule__ObjectProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2546:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2547:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2547:1: ( ',' )
            // InternalSemanticNodesDsl.g:2548:2: ','
            {
             before(grammarAccess.getObjectPropertyAccess().getCommaKeyword_4_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2557:1: rule__ObjectProperty__Group_4__3 : rule__ObjectProperty__Group_4__3__Impl rule__ObjectProperty__Group_4__4 ;
    public final void rule__ObjectProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2561:1: ( rule__ObjectProperty__Group_4__3__Impl rule__ObjectProperty__Group_4__4 )
            // InternalSemanticNodesDsl.g:2562:2: rule__ObjectProperty__Group_4__3__Impl rule__ObjectProperty__Group_4__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSemanticNodesDsl.g:2569:1: rule__ObjectProperty__Group_4__3__Impl : ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__ObjectProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2573:1: ( ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) ) )
            // InternalSemanticNodesDsl.g:2574:1: ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) )
            {
            // InternalSemanticNodesDsl.g:2574:1: ( ( rule__ObjectProperty__UpperBoundAssignment_4_3 ) )
            // InternalSemanticNodesDsl.g:2575:2: ( rule__ObjectProperty__UpperBoundAssignment_4_3 )
            {
             before(grammarAccess.getObjectPropertyAccess().getUpperBoundAssignment_4_3()); 
            // InternalSemanticNodesDsl.g:2576:2: ( rule__ObjectProperty__UpperBoundAssignment_4_3 )
            // InternalSemanticNodesDsl.g:2576:3: rule__ObjectProperty__UpperBoundAssignment_4_3
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
    // InternalSemanticNodesDsl.g:2584:1: rule__ObjectProperty__Group_4__4 : rule__ObjectProperty__Group_4__4__Impl ;
    public final void rule__ObjectProperty__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2588:1: ( rule__ObjectProperty__Group_4__4__Impl )
            // InternalSemanticNodesDsl.g:2589:2: rule__ObjectProperty__Group_4__4__Impl
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
    // InternalSemanticNodesDsl.g:2595:1: rule__ObjectProperty__Group_4__4__Impl : ( ']' ) ;
    public final void rule__ObjectProperty__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2599:1: ( ( ']' ) )
            // InternalSemanticNodesDsl.g:2600:1: ( ']' )
            {
            // InternalSemanticNodesDsl.g:2600:1: ( ']' )
            // InternalSemanticNodesDsl.g:2601:2: ']'
            {
             before(grammarAccess.getObjectPropertyAccess().getRightSquareBracketKeyword_4_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2611:1: rule__ObjectProperty__Group_5__0 : rule__ObjectProperty__Group_5__0__Impl rule__ObjectProperty__Group_5__1 ;
    public final void rule__ObjectProperty__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2615:1: ( rule__ObjectProperty__Group_5__0__Impl rule__ObjectProperty__Group_5__1 )
            // InternalSemanticNodesDsl.g:2616:2: rule__ObjectProperty__Group_5__0__Impl rule__ObjectProperty__Group_5__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:2623:1: rule__ObjectProperty__Group_5__0__Impl : ( '{' ) ;
    public final void rule__ObjectProperty__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2627:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:2628:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:2628:1: ( '{' )
            // InternalSemanticNodesDsl.g:2629:2: '{'
            {
             before(grammarAccess.getObjectPropertyAccess().getLeftCurlyBracketKeyword_5_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2638:1: rule__ObjectProperty__Group_5__1 : rule__ObjectProperty__Group_5__1__Impl rule__ObjectProperty__Group_5__2 ;
    public final void rule__ObjectProperty__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2642:1: ( rule__ObjectProperty__Group_5__1__Impl rule__ObjectProperty__Group_5__2 )
            // InternalSemanticNodesDsl.g:2643:2: rule__ObjectProperty__Group_5__1__Impl rule__ObjectProperty__Group_5__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:2650:1: rule__ObjectProperty__Group_5__1__Impl : ( ( rule__ObjectProperty__MetaDataValueAssignment_5_1 ) ) ;
    public final void rule__ObjectProperty__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2654:1: ( ( ( rule__ObjectProperty__MetaDataValueAssignment_5_1 ) ) )
            // InternalSemanticNodesDsl.g:2655:1: ( ( rule__ObjectProperty__MetaDataValueAssignment_5_1 ) )
            {
            // InternalSemanticNodesDsl.g:2655:1: ( ( rule__ObjectProperty__MetaDataValueAssignment_5_1 ) )
            // InternalSemanticNodesDsl.g:2656:2: ( rule__ObjectProperty__MetaDataValueAssignment_5_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getMetaDataValueAssignment_5_1()); 
            // InternalSemanticNodesDsl.g:2657:2: ( rule__ObjectProperty__MetaDataValueAssignment_5_1 )
            // InternalSemanticNodesDsl.g:2657:3: rule__ObjectProperty__MetaDataValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__MetaDataValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getMetaDataValueAssignment_5_1()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:2665:1: rule__ObjectProperty__Group_5__2 : rule__ObjectProperty__Group_5__2__Impl rule__ObjectProperty__Group_5__3 ;
    public final void rule__ObjectProperty__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2669:1: ( rule__ObjectProperty__Group_5__2__Impl rule__ObjectProperty__Group_5__3 )
            // InternalSemanticNodesDsl.g:2670:2: rule__ObjectProperty__Group_5__2__Impl rule__ObjectProperty__Group_5__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:2677:1: rule__ObjectProperty__Group_5__2__Impl : ( ( rule__ObjectProperty__Group_5_2__0 )* ) ;
    public final void rule__ObjectProperty__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2681:1: ( ( ( rule__ObjectProperty__Group_5_2__0 )* ) )
            // InternalSemanticNodesDsl.g:2682:1: ( ( rule__ObjectProperty__Group_5_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:2682:1: ( ( rule__ObjectProperty__Group_5_2__0 )* )
            // InternalSemanticNodesDsl.g:2683:2: ( rule__ObjectProperty__Group_5_2__0 )*
            {
             before(grammarAccess.getObjectPropertyAccess().getGroup_5_2()); 
            // InternalSemanticNodesDsl.g:2684:2: ( rule__ObjectProperty__Group_5_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:2684:3: rule__ObjectProperty__Group_5_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ObjectProperty__Group_5_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalSemanticNodesDsl.g:2692:1: rule__ObjectProperty__Group_5__3 : rule__ObjectProperty__Group_5__3__Impl ;
    public final void rule__ObjectProperty__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2696:1: ( rule__ObjectProperty__Group_5__3__Impl )
            // InternalSemanticNodesDsl.g:2697:2: rule__ObjectProperty__Group_5__3__Impl
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
    // InternalSemanticNodesDsl.g:2703:1: rule__ObjectProperty__Group_5__3__Impl : ( '}' ) ;
    public final void rule__ObjectProperty__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2707:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:2708:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:2708:1: ( '}' )
            // InternalSemanticNodesDsl.g:2709:2: '}'
            {
             before(grammarAccess.getObjectPropertyAccess().getRightCurlyBracketKeyword_5_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2719:1: rule__ObjectProperty__Group_5_2__0 : rule__ObjectProperty__Group_5_2__0__Impl rule__ObjectProperty__Group_5_2__1 ;
    public final void rule__ObjectProperty__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2723:1: ( rule__ObjectProperty__Group_5_2__0__Impl rule__ObjectProperty__Group_5_2__1 )
            // InternalSemanticNodesDsl.g:2724:2: rule__ObjectProperty__Group_5_2__0__Impl rule__ObjectProperty__Group_5_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:2731:1: rule__ObjectProperty__Group_5_2__0__Impl : ( ',' ) ;
    public final void rule__ObjectProperty__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2735:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:2736:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:2736:1: ( ',' )
            // InternalSemanticNodesDsl.g:2737:2: ','
            {
             before(grammarAccess.getObjectPropertyAccess().getCommaKeyword_5_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2746:1: rule__ObjectProperty__Group_5_2__1 : rule__ObjectProperty__Group_5_2__1__Impl ;
    public final void rule__ObjectProperty__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2750:1: ( rule__ObjectProperty__Group_5_2__1__Impl )
            // InternalSemanticNodesDsl.g:2751:2: rule__ObjectProperty__Group_5_2__1__Impl
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
    // InternalSemanticNodesDsl.g:2757:1: rule__ObjectProperty__Group_5_2__1__Impl : ( ( rule__ObjectProperty__MetaDataValueAssignment_5_2_1 ) ) ;
    public final void rule__ObjectProperty__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2761:1: ( ( ( rule__ObjectProperty__MetaDataValueAssignment_5_2_1 ) ) )
            // InternalSemanticNodesDsl.g:2762:1: ( ( rule__ObjectProperty__MetaDataValueAssignment_5_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:2762:1: ( ( rule__ObjectProperty__MetaDataValueAssignment_5_2_1 ) )
            // InternalSemanticNodesDsl.g:2763:2: ( rule__ObjectProperty__MetaDataValueAssignment_5_2_1 )
            {
             before(grammarAccess.getObjectPropertyAccess().getMetaDataValueAssignment_5_2_1()); 
            // InternalSemanticNodesDsl.g:2764:2: ( rule__ObjectProperty__MetaDataValueAssignment_5_2_1 )
            // InternalSemanticNodesDsl.g:2764:3: rule__ObjectProperty__MetaDataValueAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ObjectProperty__MetaDataValueAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getObjectPropertyAccess().getMetaDataValueAssignment_5_2_1()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:2773:1: rule__PrimitiveTypeDataProperty__Group__0 : rule__PrimitiveTypeDataProperty__Group__0__Impl rule__PrimitiveTypeDataProperty__Group__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2777:1: ( rule__PrimitiveTypeDataProperty__Group__0__Impl rule__PrimitiveTypeDataProperty__Group__1 )
            // InternalSemanticNodesDsl.g:2778:2: rule__PrimitiveTypeDataProperty__Group__0__Impl rule__PrimitiveTypeDataProperty__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:2785:1: rule__PrimitiveTypeDataProperty__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2789:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:2790:1: ( () )
            {
            // InternalSemanticNodesDsl.g:2790:1: ( () )
            // InternalSemanticNodesDsl.g:2791:2: ()
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getPrimitiveTypeDataPropertyAction_0()); 
            // InternalSemanticNodesDsl.g:2792:2: ()
            // InternalSemanticNodesDsl.g:2792:3: 
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
    // InternalSemanticNodesDsl.g:2800:1: rule__PrimitiveTypeDataProperty__Group__1 : rule__PrimitiveTypeDataProperty__Group__1__Impl rule__PrimitiveTypeDataProperty__Group__2 ;
    public final void rule__PrimitiveTypeDataProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2804:1: ( rule__PrimitiveTypeDataProperty__Group__1__Impl rule__PrimitiveTypeDataProperty__Group__2 )
            // InternalSemanticNodesDsl.g:2805:2: rule__PrimitiveTypeDataProperty__Group__1__Impl rule__PrimitiveTypeDataProperty__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSemanticNodesDsl.g:2812:1: rule__PrimitiveTypeDataProperty__Group__1__Impl : ( ( rule__PrimitiveTypeDataProperty__NameAssignment_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2816:1: ( ( ( rule__PrimitiveTypeDataProperty__NameAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:2817:1: ( ( rule__PrimitiveTypeDataProperty__NameAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:2817:1: ( ( rule__PrimitiveTypeDataProperty__NameAssignment_1 ) )
            // InternalSemanticNodesDsl.g:2818:2: ( rule__PrimitiveTypeDataProperty__NameAssignment_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getNameAssignment_1()); 
            // InternalSemanticNodesDsl.g:2819:2: ( rule__PrimitiveTypeDataProperty__NameAssignment_1 )
            // InternalSemanticNodesDsl.g:2819:3: rule__PrimitiveTypeDataProperty__NameAssignment_1
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
    // InternalSemanticNodesDsl.g:2827:1: rule__PrimitiveTypeDataProperty__Group__2 : rule__PrimitiveTypeDataProperty__Group__2__Impl rule__PrimitiveTypeDataProperty__Group__3 ;
    public final void rule__PrimitiveTypeDataProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2831:1: ( rule__PrimitiveTypeDataProperty__Group__2__Impl rule__PrimitiveTypeDataProperty__Group__3 )
            // InternalSemanticNodesDsl.g:2832:2: rule__PrimitiveTypeDataProperty__Group__2__Impl rule__PrimitiveTypeDataProperty__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemanticNodesDsl.g:2839:1: rule__PrimitiveTypeDataProperty__Group__2__Impl : ( ( rule__PrimitiveTypeDataProperty__Group_2__0 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2843:1: ( ( ( rule__PrimitiveTypeDataProperty__Group_2__0 ) ) )
            // InternalSemanticNodesDsl.g:2844:1: ( ( rule__PrimitiveTypeDataProperty__Group_2__0 ) )
            {
            // InternalSemanticNodesDsl.g:2844:1: ( ( rule__PrimitiveTypeDataProperty__Group_2__0 ) )
            // InternalSemanticNodesDsl.g:2845:2: ( rule__PrimitiveTypeDataProperty__Group_2__0 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_2()); 
            // InternalSemanticNodesDsl.g:2846:2: ( rule__PrimitiveTypeDataProperty__Group_2__0 )
            // InternalSemanticNodesDsl.g:2846:3: rule__PrimitiveTypeDataProperty__Group_2__0
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
    // InternalSemanticNodesDsl.g:2854:1: rule__PrimitiveTypeDataProperty__Group__3 : rule__PrimitiveTypeDataProperty__Group__3__Impl rule__PrimitiveTypeDataProperty__Group__4 ;
    public final void rule__PrimitiveTypeDataProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2858:1: ( rule__PrimitiveTypeDataProperty__Group__3__Impl rule__PrimitiveTypeDataProperty__Group__4 )
            // InternalSemanticNodesDsl.g:2859:2: rule__PrimitiveTypeDataProperty__Group__3__Impl rule__PrimitiveTypeDataProperty__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemanticNodesDsl.g:2866:1: rule__PrimitiveTypeDataProperty__Group__3__Impl : ( ( rule__PrimitiveTypeDataProperty__Group_3__0 )? ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2870:1: ( ( ( rule__PrimitiveTypeDataProperty__Group_3__0 )? ) )
            // InternalSemanticNodesDsl.g:2871:1: ( ( rule__PrimitiveTypeDataProperty__Group_3__0 )? )
            {
            // InternalSemanticNodesDsl.g:2871:1: ( ( rule__PrimitiveTypeDataProperty__Group_3__0 )? )
            // InternalSemanticNodesDsl.g:2872:2: ( rule__PrimitiveTypeDataProperty__Group_3__0 )?
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_3()); 
            // InternalSemanticNodesDsl.g:2873:2: ( rule__PrimitiveTypeDataProperty__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2873:3: rule__PrimitiveTypeDataProperty__Group_3__0
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
    // InternalSemanticNodesDsl.g:2881:1: rule__PrimitiveTypeDataProperty__Group__4 : rule__PrimitiveTypeDataProperty__Group__4__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2885:1: ( rule__PrimitiveTypeDataProperty__Group__4__Impl )
            // InternalSemanticNodesDsl.g:2886:2: rule__PrimitiveTypeDataProperty__Group__4__Impl
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
    // InternalSemanticNodesDsl.g:2892:1: rule__PrimitiveTypeDataProperty__Group__4__Impl : ( ( rule__PrimitiveTypeDataProperty__Group_4__0 )? ) ;
    public final void rule__PrimitiveTypeDataProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2896:1: ( ( ( rule__PrimitiveTypeDataProperty__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:2897:1: ( ( rule__PrimitiveTypeDataProperty__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:2897:1: ( ( rule__PrimitiveTypeDataProperty__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:2898:2: ( rule__PrimitiveTypeDataProperty__Group_4__0 )?
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:2899:2: ( rule__PrimitiveTypeDataProperty__Group_4__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==18) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSemanticNodesDsl.g:2899:3: rule__PrimitiveTypeDataProperty__Group_4__0
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
    // InternalSemanticNodesDsl.g:2908:1: rule__PrimitiveTypeDataProperty__Group_2__0 : rule__PrimitiveTypeDataProperty__Group_2__0__Impl rule__PrimitiveTypeDataProperty__Group_2__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2912:1: ( rule__PrimitiveTypeDataProperty__Group_2__0__Impl rule__PrimitiveTypeDataProperty__Group_2__1 )
            // InternalSemanticNodesDsl.g:2913:2: rule__PrimitiveTypeDataProperty__Group_2__0__Impl rule__PrimitiveTypeDataProperty__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSemanticNodesDsl.g:2920:1: rule__PrimitiveTypeDataProperty__Group_2__0__Impl : ( ':' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2924:1: ( ( ':' ) )
            // InternalSemanticNodesDsl.g:2925:1: ( ':' )
            {
            // InternalSemanticNodesDsl.g:2925:1: ( ':' )
            // InternalSemanticNodesDsl.g:2926:2: ':'
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getColonKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2935:1: rule__PrimitiveTypeDataProperty__Group_2__1 : rule__PrimitiveTypeDataProperty__Group_2__1__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2939:1: ( rule__PrimitiveTypeDataProperty__Group_2__1__Impl )
            // InternalSemanticNodesDsl.g:2940:2: rule__PrimitiveTypeDataProperty__Group_2__1__Impl
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
    // InternalSemanticNodesDsl.g:2946:1: rule__PrimitiveTypeDataProperty__Group_2__1__Impl : ( ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2950:1: ( ( ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 ) ) )
            // InternalSemanticNodesDsl.g:2951:1: ( ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:2951:1: ( ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 ) )
            // InternalSemanticNodesDsl.g:2952:2: ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getTypeAssignment_2_1()); 
            // InternalSemanticNodesDsl.g:2953:2: ( rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 )
            // InternalSemanticNodesDsl.g:2953:3: rule__PrimitiveTypeDataProperty__TypeAssignment_2_1
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
    // InternalSemanticNodesDsl.g:2962:1: rule__PrimitiveTypeDataProperty__Group_3__0 : rule__PrimitiveTypeDataProperty__Group_3__0__Impl rule__PrimitiveTypeDataProperty__Group_3__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2966:1: ( rule__PrimitiveTypeDataProperty__Group_3__0__Impl rule__PrimitiveTypeDataProperty__Group_3__1 )
            // InternalSemanticNodesDsl.g:2967:2: rule__PrimitiveTypeDataProperty__Group_3__0__Impl rule__PrimitiveTypeDataProperty__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:2974:1: rule__PrimitiveTypeDataProperty__Group_3__0__Impl : ( '[' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2978:1: ( ( '[' ) )
            // InternalSemanticNodesDsl.g:2979:1: ( '[' )
            {
            // InternalSemanticNodesDsl.g:2979:1: ( '[' )
            // InternalSemanticNodesDsl.g:2980:2: '['
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:2989:1: rule__PrimitiveTypeDataProperty__Group_3__1 : rule__PrimitiveTypeDataProperty__Group_3__1__Impl rule__PrimitiveTypeDataProperty__Group_3__2 ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:2993:1: ( rule__PrimitiveTypeDataProperty__Group_3__1__Impl rule__PrimitiveTypeDataProperty__Group_3__2 )
            // InternalSemanticNodesDsl.g:2994:2: rule__PrimitiveTypeDataProperty__Group_3__1__Impl rule__PrimitiveTypeDataProperty__Group_3__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSemanticNodesDsl.g:3001:1: rule__PrimitiveTypeDataProperty__Group_3__1__Impl : ( ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3005:1: ( ( ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 ) ) )
            // InternalSemanticNodesDsl.g:3006:1: ( ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 ) )
            {
            // InternalSemanticNodesDsl.g:3006:1: ( ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 ) )
            // InternalSemanticNodesDsl.g:3007:2: ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLowerBoundAssignment_3_1()); 
            // InternalSemanticNodesDsl.g:3008:2: ( rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 )
            // InternalSemanticNodesDsl.g:3008:3: rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1
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
    // InternalSemanticNodesDsl.g:3016:1: rule__PrimitiveTypeDataProperty__Group_3__2 : rule__PrimitiveTypeDataProperty__Group_3__2__Impl rule__PrimitiveTypeDataProperty__Group_3__3 ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3020:1: ( rule__PrimitiveTypeDataProperty__Group_3__2__Impl rule__PrimitiveTypeDataProperty__Group_3__3 )
            // InternalSemanticNodesDsl.g:3021:2: rule__PrimitiveTypeDataProperty__Group_3__2__Impl rule__PrimitiveTypeDataProperty__Group_3__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:3028:1: rule__PrimitiveTypeDataProperty__Group_3__2__Impl : ( ',' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3032:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:3033:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:3033:1: ( ',' )
            // InternalSemanticNodesDsl.g:3034:2: ','
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_3_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3043:1: rule__PrimitiveTypeDataProperty__Group_3__3 : rule__PrimitiveTypeDataProperty__Group_3__3__Impl rule__PrimitiveTypeDataProperty__Group_3__4 ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3047:1: ( rule__PrimitiveTypeDataProperty__Group_3__3__Impl rule__PrimitiveTypeDataProperty__Group_3__4 )
            // InternalSemanticNodesDsl.g:3048:2: rule__PrimitiveTypeDataProperty__Group_3__3__Impl rule__PrimitiveTypeDataProperty__Group_3__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSemanticNodesDsl.g:3055:1: rule__PrimitiveTypeDataProperty__Group_3__3__Impl : ( ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3059:1: ( ( ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 ) ) )
            // InternalSemanticNodesDsl.g:3060:1: ( ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 ) )
            {
            // InternalSemanticNodesDsl.g:3060:1: ( ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 ) )
            // InternalSemanticNodesDsl.g:3061:2: ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getUpperBoundAssignment_3_3()); 
            // InternalSemanticNodesDsl.g:3062:2: ( rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 )
            // InternalSemanticNodesDsl.g:3062:3: rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3
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
    // InternalSemanticNodesDsl.g:3070:1: rule__PrimitiveTypeDataProperty__Group_3__4 : rule__PrimitiveTypeDataProperty__Group_3__4__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3074:1: ( rule__PrimitiveTypeDataProperty__Group_3__4__Impl )
            // InternalSemanticNodesDsl.g:3075:2: rule__PrimitiveTypeDataProperty__Group_3__4__Impl
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
    // InternalSemanticNodesDsl.g:3081:1: rule__PrimitiveTypeDataProperty__Group_3__4__Impl : ( ']' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3085:1: ( ( ']' ) )
            // InternalSemanticNodesDsl.g:3086:1: ( ']' )
            {
            // InternalSemanticNodesDsl.g:3086:1: ( ']' )
            // InternalSemanticNodesDsl.g:3087:2: ']'
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3097:1: rule__PrimitiveTypeDataProperty__Group_4__0 : rule__PrimitiveTypeDataProperty__Group_4__0__Impl rule__PrimitiveTypeDataProperty__Group_4__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3101:1: ( rule__PrimitiveTypeDataProperty__Group_4__0__Impl rule__PrimitiveTypeDataProperty__Group_4__1 )
            // InternalSemanticNodesDsl.g:3102:2: rule__PrimitiveTypeDataProperty__Group_4__0__Impl rule__PrimitiveTypeDataProperty__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:3109:1: rule__PrimitiveTypeDataProperty__Group_4__0__Impl : ( '{' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3113:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:3114:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:3114:1: ( '{' )
            // InternalSemanticNodesDsl.g:3115:2: '{'
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3124:1: rule__PrimitiveTypeDataProperty__Group_4__1 : rule__PrimitiveTypeDataProperty__Group_4__1__Impl rule__PrimitiveTypeDataProperty__Group_4__2 ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3128:1: ( rule__PrimitiveTypeDataProperty__Group_4__1__Impl rule__PrimitiveTypeDataProperty__Group_4__2 )
            // InternalSemanticNodesDsl.g:3129:2: rule__PrimitiveTypeDataProperty__Group_4__1__Impl rule__PrimitiveTypeDataProperty__Group_4__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:3136:1: rule__PrimitiveTypeDataProperty__Group_4__1__Impl : ( ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3140:1: ( ( ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1 ) ) )
            // InternalSemanticNodesDsl.g:3141:1: ( ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1 ) )
            {
            // InternalSemanticNodesDsl.g:3141:1: ( ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1 ) )
            // InternalSemanticNodesDsl.g:3142:2: ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:3143:2: ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1 )
            // InternalSemanticNodesDsl.g:3143:3: rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueAssignment_4_1()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:3151:1: rule__PrimitiveTypeDataProperty__Group_4__2 : rule__PrimitiveTypeDataProperty__Group_4__2__Impl rule__PrimitiveTypeDataProperty__Group_4__3 ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3155:1: ( rule__PrimitiveTypeDataProperty__Group_4__2__Impl rule__PrimitiveTypeDataProperty__Group_4__3 )
            // InternalSemanticNodesDsl.g:3156:2: rule__PrimitiveTypeDataProperty__Group_4__2__Impl rule__PrimitiveTypeDataProperty__Group_4__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:3163:1: rule__PrimitiveTypeDataProperty__Group_4__2__Impl : ( ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )* ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3167:1: ( ( ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )* ) )
            // InternalSemanticNodesDsl.g:3168:1: ( ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:3168:1: ( ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )* )
            // InternalSemanticNodesDsl.g:3169:2: ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )*
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getGroup_4_2()); 
            // InternalSemanticNodesDsl.g:3170:2: ( rule__PrimitiveTypeDataProperty__Group_4_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:3170:3: rule__PrimitiveTypeDataProperty__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__PrimitiveTypeDataProperty__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSemanticNodesDsl.g:3178:1: rule__PrimitiveTypeDataProperty__Group_4__3 : rule__PrimitiveTypeDataProperty__Group_4__3__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3182:1: ( rule__PrimitiveTypeDataProperty__Group_4__3__Impl )
            // InternalSemanticNodesDsl.g:3183:2: rule__PrimitiveTypeDataProperty__Group_4__3__Impl
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
    // InternalSemanticNodesDsl.g:3189:1: rule__PrimitiveTypeDataProperty__Group_4__3__Impl : ( '}' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3193:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:3194:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:3194:1: ( '}' )
            // InternalSemanticNodesDsl.g:3195:2: '}'
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3205:1: rule__PrimitiveTypeDataProperty__Group_4_2__0 : rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl rule__PrimitiveTypeDataProperty__Group_4_2__1 ;
    public final void rule__PrimitiveTypeDataProperty__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3209:1: ( rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl rule__PrimitiveTypeDataProperty__Group_4_2__1 )
            // InternalSemanticNodesDsl.g:3210:2: rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl rule__PrimitiveTypeDataProperty__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:3217:1: rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3221:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:3222:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:3222:1: ( ',' )
            // InternalSemanticNodesDsl.g:3223:2: ','
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3232:1: rule__PrimitiveTypeDataProperty__Group_4_2__1 : rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl ;
    public final void rule__PrimitiveTypeDataProperty__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3236:1: ( rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl )
            // InternalSemanticNodesDsl.g:3237:2: rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl
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
    // InternalSemanticNodesDsl.g:3243:1: rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl : ( ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1 ) ) ;
    public final void rule__PrimitiveTypeDataProperty__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3247:1: ( ( ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1 ) ) )
            // InternalSemanticNodesDsl.g:3248:1: ( ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:3248:1: ( ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1 ) )
            // InternalSemanticNodesDsl.g:3249:2: ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1 )
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueAssignment_4_2_1()); 
            // InternalSemanticNodesDsl.g:3250:2: ( rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1 )
            // InternalSemanticNodesDsl.g:3250:3: rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueAssignment_4_2_1()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:3259:1: rule__EnumerationDataProperty__Group__0 : rule__EnumerationDataProperty__Group__0__Impl rule__EnumerationDataProperty__Group__1 ;
    public final void rule__EnumerationDataProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3263:1: ( rule__EnumerationDataProperty__Group__0__Impl rule__EnumerationDataProperty__Group__1 )
            // InternalSemanticNodesDsl.g:3264:2: rule__EnumerationDataProperty__Group__0__Impl rule__EnumerationDataProperty__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:3271:1: rule__EnumerationDataProperty__Group__0__Impl : ( () ) ;
    public final void rule__EnumerationDataProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3275:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:3276:1: ( () )
            {
            // InternalSemanticNodesDsl.g:3276:1: ( () )
            // InternalSemanticNodesDsl.g:3277:2: ()
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getEnumDataPropertyAction_0()); 
            // InternalSemanticNodesDsl.g:3278:2: ()
            // InternalSemanticNodesDsl.g:3278:3: 
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
    // InternalSemanticNodesDsl.g:3286:1: rule__EnumerationDataProperty__Group__1 : rule__EnumerationDataProperty__Group__1__Impl rule__EnumerationDataProperty__Group__2 ;
    public final void rule__EnumerationDataProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3290:1: ( rule__EnumerationDataProperty__Group__1__Impl rule__EnumerationDataProperty__Group__2 )
            // InternalSemanticNodesDsl.g:3291:2: rule__EnumerationDataProperty__Group__1__Impl rule__EnumerationDataProperty__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSemanticNodesDsl.g:3298:1: rule__EnumerationDataProperty__Group__1__Impl : ( ( rule__EnumerationDataProperty__NameAssignment_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3302:1: ( ( ( rule__EnumerationDataProperty__NameAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:3303:1: ( ( rule__EnumerationDataProperty__NameAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:3303:1: ( ( rule__EnumerationDataProperty__NameAssignment_1 ) )
            // InternalSemanticNodesDsl.g:3304:2: ( rule__EnumerationDataProperty__NameAssignment_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getNameAssignment_1()); 
            // InternalSemanticNodesDsl.g:3305:2: ( rule__EnumerationDataProperty__NameAssignment_1 )
            // InternalSemanticNodesDsl.g:3305:3: rule__EnumerationDataProperty__NameAssignment_1
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
    // InternalSemanticNodesDsl.g:3313:1: rule__EnumerationDataProperty__Group__2 : rule__EnumerationDataProperty__Group__2__Impl rule__EnumerationDataProperty__Group__3 ;
    public final void rule__EnumerationDataProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3317:1: ( rule__EnumerationDataProperty__Group__2__Impl rule__EnumerationDataProperty__Group__3 )
            // InternalSemanticNodesDsl.g:3318:2: rule__EnumerationDataProperty__Group__2__Impl rule__EnumerationDataProperty__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemanticNodesDsl.g:3325:1: rule__EnumerationDataProperty__Group__2__Impl : ( ( rule__EnumerationDataProperty__Group_2__0 ) ) ;
    public final void rule__EnumerationDataProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3329:1: ( ( ( rule__EnumerationDataProperty__Group_2__0 ) ) )
            // InternalSemanticNodesDsl.g:3330:1: ( ( rule__EnumerationDataProperty__Group_2__0 ) )
            {
            // InternalSemanticNodesDsl.g:3330:1: ( ( rule__EnumerationDataProperty__Group_2__0 ) )
            // InternalSemanticNodesDsl.g:3331:2: ( rule__EnumerationDataProperty__Group_2__0 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getGroup_2()); 
            // InternalSemanticNodesDsl.g:3332:2: ( rule__EnumerationDataProperty__Group_2__0 )
            // InternalSemanticNodesDsl.g:3332:3: rule__EnumerationDataProperty__Group_2__0
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
    // InternalSemanticNodesDsl.g:3340:1: rule__EnumerationDataProperty__Group__3 : rule__EnumerationDataProperty__Group__3__Impl rule__EnumerationDataProperty__Group__4 ;
    public final void rule__EnumerationDataProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3344:1: ( rule__EnumerationDataProperty__Group__3__Impl rule__EnumerationDataProperty__Group__4 )
            // InternalSemanticNodesDsl.g:3345:2: rule__EnumerationDataProperty__Group__3__Impl rule__EnumerationDataProperty__Group__4
            {
            pushFollow(FOLLOW_27);
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
    // InternalSemanticNodesDsl.g:3352:1: rule__EnumerationDataProperty__Group__3__Impl : ( ( rule__EnumerationDataProperty__Group_3__0 )? ) ;
    public final void rule__EnumerationDataProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3356:1: ( ( ( rule__EnumerationDataProperty__Group_3__0 )? ) )
            // InternalSemanticNodesDsl.g:3357:1: ( ( rule__EnumerationDataProperty__Group_3__0 )? )
            {
            // InternalSemanticNodesDsl.g:3357:1: ( ( rule__EnumerationDataProperty__Group_3__0 )? )
            // InternalSemanticNodesDsl.g:3358:2: ( rule__EnumerationDataProperty__Group_3__0 )?
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getGroup_3()); 
            // InternalSemanticNodesDsl.g:3359:2: ( rule__EnumerationDataProperty__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSemanticNodesDsl.g:3359:3: rule__EnumerationDataProperty__Group_3__0
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
    // InternalSemanticNodesDsl.g:3367:1: rule__EnumerationDataProperty__Group__4 : rule__EnumerationDataProperty__Group__4__Impl ;
    public final void rule__EnumerationDataProperty__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3371:1: ( rule__EnumerationDataProperty__Group__4__Impl )
            // InternalSemanticNodesDsl.g:3372:2: rule__EnumerationDataProperty__Group__4__Impl
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
    // InternalSemanticNodesDsl.g:3378:1: rule__EnumerationDataProperty__Group__4__Impl : ( ( rule__EnumerationDataProperty__Group_4__0 )? ) ;
    public final void rule__EnumerationDataProperty__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3382:1: ( ( ( rule__EnumerationDataProperty__Group_4__0 )? ) )
            // InternalSemanticNodesDsl.g:3383:1: ( ( rule__EnumerationDataProperty__Group_4__0 )? )
            {
            // InternalSemanticNodesDsl.g:3383:1: ( ( rule__EnumerationDataProperty__Group_4__0 )? )
            // InternalSemanticNodesDsl.g:3384:2: ( rule__EnumerationDataProperty__Group_4__0 )?
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getGroup_4()); 
            // InternalSemanticNodesDsl.g:3385:2: ( rule__EnumerationDataProperty__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSemanticNodesDsl.g:3385:3: rule__EnumerationDataProperty__Group_4__0
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
    // InternalSemanticNodesDsl.g:3394:1: rule__EnumerationDataProperty__Group_2__0 : rule__EnumerationDataProperty__Group_2__0__Impl rule__EnumerationDataProperty__Group_2__1 ;
    public final void rule__EnumerationDataProperty__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3398:1: ( rule__EnumerationDataProperty__Group_2__0__Impl rule__EnumerationDataProperty__Group_2__1 )
            // InternalSemanticNodesDsl.g:3399:2: rule__EnumerationDataProperty__Group_2__0__Impl rule__EnumerationDataProperty__Group_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:3406:1: rule__EnumerationDataProperty__Group_2__0__Impl : ( ':' ) ;
    public final void rule__EnumerationDataProperty__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3410:1: ( ( ':' ) )
            // InternalSemanticNodesDsl.g:3411:1: ( ':' )
            {
            // InternalSemanticNodesDsl.g:3411:1: ( ':' )
            // InternalSemanticNodesDsl.g:3412:2: ':'
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getColonKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3421:1: rule__EnumerationDataProperty__Group_2__1 : rule__EnumerationDataProperty__Group_2__1__Impl ;
    public final void rule__EnumerationDataProperty__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3425:1: ( rule__EnumerationDataProperty__Group_2__1__Impl )
            // InternalSemanticNodesDsl.g:3426:2: rule__EnumerationDataProperty__Group_2__1__Impl
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
    // InternalSemanticNodesDsl.g:3432:1: rule__EnumerationDataProperty__Group_2__1__Impl : ( ( rule__EnumerationDataProperty__TypeAssignment_2_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3436:1: ( ( ( rule__EnumerationDataProperty__TypeAssignment_2_1 ) ) )
            // InternalSemanticNodesDsl.g:3437:1: ( ( rule__EnumerationDataProperty__TypeAssignment_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:3437:1: ( ( rule__EnumerationDataProperty__TypeAssignment_2_1 ) )
            // InternalSemanticNodesDsl.g:3438:2: ( rule__EnumerationDataProperty__TypeAssignment_2_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getTypeAssignment_2_1()); 
            // InternalSemanticNodesDsl.g:3439:2: ( rule__EnumerationDataProperty__TypeAssignment_2_1 )
            // InternalSemanticNodesDsl.g:3439:3: rule__EnumerationDataProperty__TypeAssignment_2_1
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
    // InternalSemanticNodesDsl.g:3448:1: rule__EnumerationDataProperty__Group_3__0 : rule__EnumerationDataProperty__Group_3__0__Impl rule__EnumerationDataProperty__Group_3__1 ;
    public final void rule__EnumerationDataProperty__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3452:1: ( rule__EnumerationDataProperty__Group_3__0__Impl rule__EnumerationDataProperty__Group_3__1 )
            // InternalSemanticNodesDsl.g:3453:2: rule__EnumerationDataProperty__Group_3__0__Impl rule__EnumerationDataProperty__Group_3__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:3460:1: rule__EnumerationDataProperty__Group_3__0__Impl : ( '[' ) ;
    public final void rule__EnumerationDataProperty__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3464:1: ( ( '[' ) )
            // InternalSemanticNodesDsl.g:3465:1: ( '[' )
            {
            // InternalSemanticNodesDsl.g:3465:1: ( '[' )
            // InternalSemanticNodesDsl.g:3466:2: '['
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3475:1: rule__EnumerationDataProperty__Group_3__1 : rule__EnumerationDataProperty__Group_3__1__Impl rule__EnumerationDataProperty__Group_3__2 ;
    public final void rule__EnumerationDataProperty__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3479:1: ( rule__EnumerationDataProperty__Group_3__1__Impl rule__EnumerationDataProperty__Group_3__2 )
            // InternalSemanticNodesDsl.g:3480:2: rule__EnumerationDataProperty__Group_3__1__Impl rule__EnumerationDataProperty__Group_3__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSemanticNodesDsl.g:3487:1: rule__EnumerationDataProperty__Group_3__1__Impl : ( ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3491:1: ( ( ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 ) ) )
            // InternalSemanticNodesDsl.g:3492:1: ( ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 ) )
            {
            // InternalSemanticNodesDsl.g:3492:1: ( ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 ) )
            // InternalSemanticNodesDsl.g:3493:2: ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getLowerBoundAssignment_3_1()); 
            // InternalSemanticNodesDsl.g:3494:2: ( rule__EnumerationDataProperty__LowerBoundAssignment_3_1 )
            // InternalSemanticNodesDsl.g:3494:3: rule__EnumerationDataProperty__LowerBoundAssignment_3_1
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
    // InternalSemanticNodesDsl.g:3502:1: rule__EnumerationDataProperty__Group_3__2 : rule__EnumerationDataProperty__Group_3__2__Impl rule__EnumerationDataProperty__Group_3__3 ;
    public final void rule__EnumerationDataProperty__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3506:1: ( rule__EnumerationDataProperty__Group_3__2__Impl rule__EnumerationDataProperty__Group_3__3 )
            // InternalSemanticNodesDsl.g:3507:2: rule__EnumerationDataProperty__Group_3__2__Impl rule__EnumerationDataProperty__Group_3__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:3514:1: rule__EnumerationDataProperty__Group_3__2__Impl : ( ',' ) ;
    public final void rule__EnumerationDataProperty__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3518:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:3519:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:3519:1: ( ',' )
            // InternalSemanticNodesDsl.g:3520:2: ','
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_3_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3529:1: rule__EnumerationDataProperty__Group_3__3 : rule__EnumerationDataProperty__Group_3__3__Impl rule__EnumerationDataProperty__Group_3__4 ;
    public final void rule__EnumerationDataProperty__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3533:1: ( rule__EnumerationDataProperty__Group_3__3__Impl rule__EnumerationDataProperty__Group_3__4 )
            // InternalSemanticNodesDsl.g:3534:2: rule__EnumerationDataProperty__Group_3__3__Impl rule__EnumerationDataProperty__Group_3__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSemanticNodesDsl.g:3541:1: rule__EnumerationDataProperty__Group_3__3__Impl : ( ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 ) ) ;
    public final void rule__EnumerationDataProperty__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3545:1: ( ( ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 ) ) )
            // InternalSemanticNodesDsl.g:3546:1: ( ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 ) )
            {
            // InternalSemanticNodesDsl.g:3546:1: ( ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 ) )
            // InternalSemanticNodesDsl.g:3547:2: ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getUpperBoundAssignment_3_3()); 
            // InternalSemanticNodesDsl.g:3548:2: ( rule__EnumerationDataProperty__UpperBoundAssignment_3_3 )
            // InternalSemanticNodesDsl.g:3548:3: rule__EnumerationDataProperty__UpperBoundAssignment_3_3
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
    // InternalSemanticNodesDsl.g:3556:1: rule__EnumerationDataProperty__Group_3__4 : rule__EnumerationDataProperty__Group_3__4__Impl ;
    public final void rule__EnumerationDataProperty__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3560:1: ( rule__EnumerationDataProperty__Group_3__4__Impl )
            // InternalSemanticNodesDsl.g:3561:2: rule__EnumerationDataProperty__Group_3__4__Impl
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
    // InternalSemanticNodesDsl.g:3567:1: rule__EnumerationDataProperty__Group_3__4__Impl : ( ']' ) ;
    public final void rule__EnumerationDataProperty__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3571:1: ( ( ']' ) )
            // InternalSemanticNodesDsl.g:3572:1: ( ']' )
            {
            // InternalSemanticNodesDsl.g:3572:1: ( ']' )
            // InternalSemanticNodesDsl.g:3573:2: ']'
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getRightSquareBracketKeyword_3_4()); 
            match(input,26,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3583:1: rule__EnumerationDataProperty__Group_4__0 : rule__EnumerationDataProperty__Group_4__0__Impl rule__EnumerationDataProperty__Group_4__1 ;
    public final void rule__EnumerationDataProperty__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3587:1: ( rule__EnumerationDataProperty__Group_4__0__Impl rule__EnumerationDataProperty__Group_4__1 )
            // InternalSemanticNodesDsl.g:3588:2: rule__EnumerationDataProperty__Group_4__0__Impl rule__EnumerationDataProperty__Group_4__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:3595:1: rule__EnumerationDataProperty__Group_4__0__Impl : ( '{' ) ;
    public final void rule__EnumerationDataProperty__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3599:1: ( ( '{' ) )
            // InternalSemanticNodesDsl.g:3600:1: ( '{' )
            {
            // InternalSemanticNodesDsl.g:3600:1: ( '{' )
            // InternalSemanticNodesDsl.g:3601:2: '{'
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getLeftCurlyBracketKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3610:1: rule__EnumerationDataProperty__Group_4__1 : rule__EnumerationDataProperty__Group_4__1__Impl rule__EnumerationDataProperty__Group_4__2 ;
    public final void rule__EnumerationDataProperty__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3614:1: ( rule__EnumerationDataProperty__Group_4__1__Impl rule__EnumerationDataProperty__Group_4__2 )
            // InternalSemanticNodesDsl.g:3615:2: rule__EnumerationDataProperty__Group_4__1__Impl rule__EnumerationDataProperty__Group_4__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:3622:1: rule__EnumerationDataProperty__Group_4__1__Impl : ( ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3626:1: ( ( ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_1 ) ) )
            // InternalSemanticNodesDsl.g:3627:1: ( ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_1 ) )
            {
            // InternalSemanticNodesDsl.g:3627:1: ( ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_1 ) )
            // InternalSemanticNodesDsl.g:3628:2: ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueAssignment_4_1()); 
            // InternalSemanticNodesDsl.g:3629:2: ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_1 )
            // InternalSemanticNodesDsl.g:3629:3: rule__EnumerationDataProperty__MetaDataValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__MetaDataValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueAssignment_4_1()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:3637:1: rule__EnumerationDataProperty__Group_4__2 : rule__EnumerationDataProperty__Group_4__2__Impl rule__EnumerationDataProperty__Group_4__3 ;
    public final void rule__EnumerationDataProperty__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3641:1: ( rule__EnumerationDataProperty__Group_4__2__Impl rule__EnumerationDataProperty__Group_4__3 )
            // InternalSemanticNodesDsl.g:3642:2: rule__EnumerationDataProperty__Group_4__2__Impl rule__EnumerationDataProperty__Group_4__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalSemanticNodesDsl.g:3649:1: rule__EnumerationDataProperty__Group_4__2__Impl : ( ( rule__EnumerationDataProperty__Group_4_2__0 )* ) ;
    public final void rule__EnumerationDataProperty__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3653:1: ( ( ( rule__EnumerationDataProperty__Group_4_2__0 )* ) )
            // InternalSemanticNodesDsl.g:3654:1: ( ( rule__EnumerationDataProperty__Group_4_2__0 )* )
            {
            // InternalSemanticNodesDsl.g:3654:1: ( ( rule__EnumerationDataProperty__Group_4_2__0 )* )
            // InternalSemanticNodesDsl.g:3655:2: ( rule__EnumerationDataProperty__Group_4_2__0 )*
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getGroup_4_2()); 
            // InternalSemanticNodesDsl.g:3656:2: ( rule__EnumerationDataProperty__Group_4_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSemanticNodesDsl.g:3656:3: rule__EnumerationDataProperty__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__EnumerationDataProperty__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSemanticNodesDsl.g:3664:1: rule__EnumerationDataProperty__Group_4__3 : rule__EnumerationDataProperty__Group_4__3__Impl ;
    public final void rule__EnumerationDataProperty__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3668:1: ( rule__EnumerationDataProperty__Group_4__3__Impl )
            // InternalSemanticNodesDsl.g:3669:2: rule__EnumerationDataProperty__Group_4__3__Impl
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
    // InternalSemanticNodesDsl.g:3675:1: rule__EnumerationDataProperty__Group_4__3__Impl : ( '}' ) ;
    public final void rule__EnumerationDataProperty__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3679:1: ( ( '}' ) )
            // InternalSemanticNodesDsl.g:3680:1: ( '}' )
            {
            // InternalSemanticNodesDsl.g:3680:1: ( '}' )
            // InternalSemanticNodesDsl.g:3681:2: '}'
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,19,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3691:1: rule__EnumerationDataProperty__Group_4_2__0 : rule__EnumerationDataProperty__Group_4_2__0__Impl rule__EnumerationDataProperty__Group_4_2__1 ;
    public final void rule__EnumerationDataProperty__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3695:1: ( rule__EnumerationDataProperty__Group_4_2__0__Impl rule__EnumerationDataProperty__Group_4_2__1 )
            // InternalSemanticNodesDsl.g:3696:2: rule__EnumerationDataProperty__Group_4_2__0__Impl rule__EnumerationDataProperty__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSemanticNodesDsl.g:3703:1: rule__EnumerationDataProperty__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__EnumerationDataProperty__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3707:1: ( ( ',' ) )
            // InternalSemanticNodesDsl.g:3708:1: ( ',' )
            {
            // InternalSemanticNodesDsl.g:3708:1: ( ',' )
            // InternalSemanticNodesDsl.g:3709:2: ','
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getCommaKeyword_4_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalSemanticNodesDsl.g:3718:1: rule__EnumerationDataProperty__Group_4_2__1 : rule__EnumerationDataProperty__Group_4_2__1__Impl ;
    public final void rule__EnumerationDataProperty__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3722:1: ( rule__EnumerationDataProperty__Group_4_2__1__Impl )
            // InternalSemanticNodesDsl.g:3723:2: rule__EnumerationDataProperty__Group_4_2__1__Impl
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
    // InternalSemanticNodesDsl.g:3729:1: rule__EnumerationDataProperty__Group_4_2__1__Impl : ( ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1 ) ) ;
    public final void rule__EnumerationDataProperty__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3733:1: ( ( ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1 ) ) )
            // InternalSemanticNodesDsl.g:3734:1: ( ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1 ) )
            {
            // InternalSemanticNodesDsl.g:3734:1: ( ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1 ) )
            // InternalSemanticNodesDsl.g:3735:2: ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1 )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueAssignment_4_2_1()); 
            // InternalSemanticNodesDsl.g:3736:2: ( rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1 )
            // InternalSemanticNodesDsl.g:3736:3: rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueAssignment_4_2_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__MetaDataValue__Group__0"
    // InternalSemanticNodesDsl.g:3745:1: rule__MetaDataValue__Group__0 : rule__MetaDataValue__Group__0__Impl rule__MetaDataValue__Group__1 ;
    public final void rule__MetaDataValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3749:1: ( rule__MetaDataValue__Group__0__Impl rule__MetaDataValue__Group__1 )
            // InternalSemanticNodesDsl.g:3750:2: rule__MetaDataValue__Group__0__Impl rule__MetaDataValue__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MetaDataValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaDataValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__Group__0"


    // $ANTLR start "rule__MetaDataValue__Group__0__Impl"
    // InternalSemanticNodesDsl.g:3757:1: rule__MetaDataValue__Group__0__Impl : ( () ) ;
    public final void rule__MetaDataValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3761:1: ( ( () ) )
            // InternalSemanticNodesDsl.g:3762:1: ( () )
            {
            // InternalSemanticNodesDsl.g:3762:1: ( () )
            // InternalSemanticNodesDsl.g:3763:2: ()
            {
             before(grammarAccess.getMetaDataValueAccess().getMetaDataValueAction_0()); 
            // InternalSemanticNodesDsl.g:3764:2: ()
            // InternalSemanticNodesDsl.g:3764:3: 
            {
            }

             after(grammarAccess.getMetaDataValueAccess().getMetaDataValueAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__Group__0__Impl"


    // $ANTLR start "rule__MetaDataValue__Group__1"
    // InternalSemanticNodesDsl.g:3772:1: rule__MetaDataValue__Group__1 : rule__MetaDataValue__Group__1__Impl rule__MetaDataValue__Group__2 ;
    public final void rule__MetaDataValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3776:1: ( rule__MetaDataValue__Group__1__Impl rule__MetaDataValue__Group__2 )
            // InternalSemanticNodesDsl.g:3777:2: rule__MetaDataValue__Group__1__Impl rule__MetaDataValue__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__MetaDataValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaDataValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__Group__1"


    // $ANTLR start "rule__MetaDataValue__Group__1__Impl"
    // InternalSemanticNodesDsl.g:3784:1: rule__MetaDataValue__Group__1__Impl : ( ( rule__MetaDataValue__KeyMetaDataAssignment_1 ) ) ;
    public final void rule__MetaDataValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3788:1: ( ( ( rule__MetaDataValue__KeyMetaDataAssignment_1 ) ) )
            // InternalSemanticNodesDsl.g:3789:1: ( ( rule__MetaDataValue__KeyMetaDataAssignment_1 ) )
            {
            // InternalSemanticNodesDsl.g:3789:1: ( ( rule__MetaDataValue__KeyMetaDataAssignment_1 ) )
            // InternalSemanticNodesDsl.g:3790:2: ( rule__MetaDataValue__KeyMetaDataAssignment_1 )
            {
             before(grammarAccess.getMetaDataValueAccess().getKeyMetaDataAssignment_1()); 
            // InternalSemanticNodesDsl.g:3791:2: ( rule__MetaDataValue__KeyMetaDataAssignment_1 )
            // InternalSemanticNodesDsl.g:3791:3: rule__MetaDataValue__KeyMetaDataAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MetaDataValue__KeyMetaDataAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataValueAccess().getKeyMetaDataAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__Group__1__Impl"


    // $ANTLR start "rule__MetaDataValue__Group__2"
    // InternalSemanticNodesDsl.g:3799:1: rule__MetaDataValue__Group__2 : rule__MetaDataValue__Group__2__Impl rule__MetaDataValue__Group__3 ;
    public final void rule__MetaDataValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3803:1: ( rule__MetaDataValue__Group__2__Impl rule__MetaDataValue__Group__3 )
            // InternalSemanticNodesDsl.g:3804:2: rule__MetaDataValue__Group__2__Impl rule__MetaDataValue__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__MetaDataValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MetaDataValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__Group__2"


    // $ANTLR start "rule__MetaDataValue__Group__2__Impl"
    // InternalSemanticNodesDsl.g:3811:1: rule__MetaDataValue__Group__2__Impl : ( '=' ) ;
    public final void rule__MetaDataValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3815:1: ( ( '=' ) )
            // InternalSemanticNodesDsl.g:3816:1: ( '=' )
            {
            // InternalSemanticNodesDsl.g:3816:1: ( '=' )
            // InternalSemanticNodesDsl.g:3817:2: '='
            {
             before(grammarAccess.getMetaDataValueAccess().getEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMetaDataValueAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__Group__2__Impl"


    // $ANTLR start "rule__MetaDataValue__Group__3"
    // InternalSemanticNodesDsl.g:3826:1: rule__MetaDataValue__Group__3 : rule__MetaDataValue__Group__3__Impl ;
    public final void rule__MetaDataValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3830:1: ( rule__MetaDataValue__Group__3__Impl )
            // InternalSemanticNodesDsl.g:3831:2: rule__MetaDataValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MetaDataValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__Group__3"


    // $ANTLR start "rule__MetaDataValue__Group__3__Impl"
    // InternalSemanticNodesDsl.g:3837:1: rule__MetaDataValue__Group__3__Impl : ( ( rule__MetaDataValue__ValueAssignment_3 ) ) ;
    public final void rule__MetaDataValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3841:1: ( ( ( rule__MetaDataValue__ValueAssignment_3 ) ) )
            // InternalSemanticNodesDsl.g:3842:1: ( ( rule__MetaDataValue__ValueAssignment_3 ) )
            {
            // InternalSemanticNodesDsl.g:3842:1: ( ( rule__MetaDataValue__ValueAssignment_3 ) )
            // InternalSemanticNodesDsl.g:3843:2: ( rule__MetaDataValue__ValueAssignment_3 )
            {
             before(grammarAccess.getMetaDataValueAccess().getValueAssignment_3()); 
            // InternalSemanticNodesDsl.g:3844:2: ( rule__MetaDataValue__ValueAssignment_3 )
            // InternalSemanticNodesDsl.g:3844:3: rule__MetaDataValue__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MetaDataValue__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMetaDataValueAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__Group__3__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalSemanticNodesDsl.g:3853:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3857:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSemanticNodesDsl.g:3858:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalSemanticNodesDsl.g:3865:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3869:1: ( ( ( '-' )? ) )
            // InternalSemanticNodesDsl.g:3870:1: ( ( '-' )? )
            {
            // InternalSemanticNodesDsl.g:3870:1: ( ( '-' )? )
            // InternalSemanticNodesDsl.g:3871:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSemanticNodesDsl.g:3872:2: ( '-' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==29) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalSemanticNodesDsl.g:3872:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalSemanticNodesDsl.g:3880:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3884:1: ( rule__EInt__Group__1__Impl )
            // InternalSemanticNodesDsl.g:3885:2: rule__EInt__Group__1__Impl
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
    // InternalSemanticNodesDsl.g:3891:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3895:1: ( ( RULE_INT ) )
            // InternalSemanticNodesDsl.g:3896:1: ( RULE_INT )
            {
            // InternalSemanticNodesDsl.g:3896:1: ( RULE_INT )
            // InternalSemanticNodesDsl.g:3897:2: RULE_INT
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


    // $ANTLR start "rule__RepositoryManager__ImportURIAssignment_1_1"
    // InternalSemanticNodesDsl.g:3907:1: rule__RepositoryManager__ImportURIAssignment_1_1 : ( ruleEString ) ;
    public final void rule__RepositoryManager__ImportURIAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3911:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3912:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3912:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3913:3: ruleEString
            {
             before(grammarAccess.getRepositoryManagerAccess().getImportURIEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerAccess().getImportURIEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__ImportURIAssignment_1_1"


    // $ANTLR start "rule__RepositoryManager__ImportURIAssignment_1_2_1"
    // InternalSemanticNodesDsl.g:3922:1: rule__RepositoryManager__ImportURIAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__RepositoryManager__ImportURIAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3926:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3927:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3927:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3928:3: ruleEString
            {
             before(grammarAccess.getRepositoryManagerAccess().getImportURIEStringParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerAccess().getImportURIEStringParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__ImportURIAssignment_1_2_1"


    // $ANTLR start "rule__RepositoryManager__RepositoriesAssignment_2_0"
    // InternalSemanticNodesDsl.g:3937:1: rule__RepositoryManager__RepositoriesAssignment_2_0 : ( ruleRepository ) ;
    public final void rule__RepositoryManager__RepositoriesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3941:1: ( ( ruleRepository ) )
            // InternalSemanticNodesDsl.g:3942:2: ( ruleRepository )
            {
            // InternalSemanticNodesDsl.g:3942:2: ( ruleRepository )
            // InternalSemanticNodesDsl.g:3943:3: ruleRepository
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__RepositoriesAssignment_2_0"


    // $ANTLR start "rule__RepositoryManager__RepositoriesAssignment_2_1"
    // InternalSemanticNodesDsl.g:3952:1: rule__RepositoryManager__RepositoriesAssignment_2_1 : ( ruleRepository ) ;
    public final void rule__RepositoryManager__RepositoriesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3956:1: ( ( ruleRepository ) )
            // InternalSemanticNodesDsl.g:3957:2: ( ruleRepository )
            {
            // InternalSemanticNodesDsl.g:3957:2: ( ruleRepository )
            // InternalSemanticNodesDsl.g:3958:3: ruleRepository
            {
             before(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRepository();

            state._fsp--;

             after(grammarAccess.getRepositoryManagerAccess().getRepositoriesRepositoryParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RepositoryManager__RepositoriesAssignment_2_1"


    // $ANTLR start "rule__Repository__NameAssignment_2"
    // InternalSemanticNodesDsl.g:3967:1: rule__Repository__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Repository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3971:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:3972:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:3972:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:3973:3: ruleEString
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
    // InternalSemanticNodesDsl.g:3982:1: rule__Repository__ResourcesAssignment_4 : ( ruleResource ) ;
    public final void rule__Repository__ResourcesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:3986:1: ( ( ruleResource ) )
            // InternalSemanticNodesDsl.g:3987:2: ( ruleResource )
            {
            // InternalSemanticNodesDsl.g:3987:2: ( ruleResource )
            // InternalSemanticNodesDsl.g:3988:3: ruleResource
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
    // InternalSemanticNodesDsl.g:3997:1: rule__Repository__ResourcesAssignment_5 : ( ruleResource ) ;
    public final void rule__Repository__ResourcesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4001:1: ( ( ruleResource ) )
            // InternalSemanticNodesDsl.g:4002:2: ( ruleResource )
            {
            // InternalSemanticNodesDsl.g:4002:2: ( ruleResource )
            // InternalSemanticNodesDsl.g:4003:3: ruleResource
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


    // $ANTLR start "rule__Resource__AnnotationsAssignment_1_1"
    // InternalSemanticNodesDsl.g:4012:1: rule__Resource__AnnotationsAssignment_1_1 : ( ( ruleEString ) ) ;
    public final void rule__Resource__AnnotationsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4016:1: ( ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:4017:2: ( ( ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:4017:2: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4018:3: ( ruleEString )
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAnnotationCrossReference_1_1_0()); 
            // InternalSemanticNodesDsl.g:4019:3: ( ruleEString )
            // InternalSemanticNodesDsl.g:4020:4: ruleEString
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAnnotationEStringParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getAnnotationsAnnotationEStringParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getAnnotationsAnnotationCrossReference_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Resource__AnnotationsAssignment_1_2_1"
    // InternalSemanticNodesDsl.g:4031:1: rule__Resource__AnnotationsAssignment_1_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Resource__AnnotationsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4035:1: ( ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:4036:2: ( ( ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:4036:2: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4037:3: ( ruleEString )
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAnnotationCrossReference_1_2_1_0()); 
            // InternalSemanticNodesDsl.g:4038:3: ( ruleEString )
            // InternalSemanticNodesDsl.g:4039:4: ruleEString
            {
             before(grammarAccess.getResourceAccess().getAnnotationsAnnotationEStringParserRuleCall_1_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getAnnotationsAnnotationEStringParserRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getAnnotationsAnnotationCrossReference_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__AnnotationsAssignment_1_2_1"


    // $ANTLR start "rule__Resource__AssistantAssignment_2"
    // InternalSemanticNodesDsl.g:4050:1: rule__Resource__AssistantAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Resource__AssistantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4054:1: ( ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:4055:2: ( ( ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:4055:2: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4056:3: ( ruleEString )
            {
             before(grammarAccess.getResourceAccess().getAssistantFormatAssistantCrossReference_2_0()); 
            // InternalSemanticNodesDsl.g:4057:3: ( ruleEString )
            // InternalSemanticNodesDsl.g:4058:4: ruleEString
            {
             before(grammarAccess.getResourceAccess().getAssistantFormatAssistantEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getAssistantFormatAssistantEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getAssistantFormatAssistantCrossReference_2_0()); 

            }


            }

        }
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
    // InternalSemanticNodesDsl.g:4069:1: rule__Resource__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Resource__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4073:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4074:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4074:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4075:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4084:1: rule__Resource__ResourceElementsAssignment_5_0 : ( ruleResourceElement ) ;
    public final void rule__Resource__ResourceElementsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4088:1: ( ( ruleResourceElement ) )
            // InternalSemanticNodesDsl.g:4089:2: ( ruleResourceElement )
            {
            // InternalSemanticNodesDsl.g:4089:2: ( ruleResourceElement )
            // InternalSemanticNodesDsl.g:4090:3: ruleResourceElement
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
    // InternalSemanticNodesDsl.g:4099:1: rule__Resource__ResourceElementsAssignment_5_1 : ( ruleResourceElement ) ;
    public final void rule__Resource__ResourceElementsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4103:1: ( ( ruleResourceElement ) )
            // InternalSemanticNodesDsl.g:4104:2: ( ruleResourceElement )
            {
            // InternalSemanticNodesDsl.g:4104:2: ( ruleResourceElement )
            // InternalSemanticNodesDsl.g:4105:3: ruleResourceElement
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


    // $ANTLR start "rule__Resource__MetaDataValueAssignment_7_1"
    // InternalSemanticNodesDsl.g:4114:1: rule__Resource__MetaDataValueAssignment_7_1 : ( ruleMetaDataValue ) ;
    public final void rule__Resource__MetaDataValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4118:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4119:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4119:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4120:3: ruleMetaDataValue
            {
             before(grammarAccess.getResourceAccess().getMetaDataValueMetaDataValueParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getMetaDataValueMetaDataValueParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__MetaDataValueAssignment_7_1"


    // $ANTLR start "rule__Resource__MetaDataValueAssignment_7_2_1"
    // InternalSemanticNodesDsl.g:4129:1: rule__Resource__MetaDataValueAssignment_7_2_1 : ( ruleMetaDataValue ) ;
    public final void rule__Resource__MetaDataValueAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4133:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4134:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4134:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4135:3: ruleMetaDataValue
            {
             before(grammarAccess.getResourceAccess().getMetaDataValueMetaDataValueParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getMetaDataValueMetaDataValueParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__MetaDataValueAssignment_7_2_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_2"
    // InternalSemanticNodesDsl.g:4144:1: rule__Enumeration__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Enumeration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4148:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4149:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4149:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4150:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4159:1: rule__Enumeration__LiteralsAssignment_4_0 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4163:1: ( ( ruleEnumerationLiteral ) )
            // InternalSemanticNodesDsl.g:4164:2: ( ruleEnumerationLiteral )
            {
            // InternalSemanticNodesDsl.g:4164:2: ( ruleEnumerationLiteral )
            // InternalSemanticNodesDsl.g:4165:3: ruleEnumerationLiteral
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
    // InternalSemanticNodesDsl.g:4174:1: rule__Enumeration__LiteralsAssignment_4_1 : ( ruleEnumerationLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4178:1: ( ( ruleEnumerationLiteral ) )
            // InternalSemanticNodesDsl.g:4179:2: ( ruleEnumerationLiteral )
            {
            // InternalSemanticNodesDsl.g:4179:2: ( ruleEnumerationLiteral )
            // InternalSemanticNodesDsl.g:4180:3: ruleEnumerationLiteral
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
    // InternalSemanticNodesDsl.g:4189:1: rule__EnumerationLiteral__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__EnumerationLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4193:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4194:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4194:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4195:3: ruleEInt
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
    // InternalSemanticNodesDsl.g:4204:1: rule__EnumerationLiteral__LiteralAssignment_3 : ( ruleEString ) ;
    public final void rule__EnumerationLiteral__LiteralAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4208:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4209:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4209:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4210:3: ruleEString
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


    // $ANTLR start "rule__SemanticNode__AbstractAssignment_1"
    // InternalSemanticNodesDsl.g:4219:1: rule__SemanticNode__AbstractAssignment_1 : ( ( 'abstract' ) ) ;
    public final void rule__SemanticNode__AbstractAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4223:1: ( ( ( 'abstract' ) ) )
            // InternalSemanticNodesDsl.g:4224:2: ( ( 'abstract' ) )
            {
            // InternalSemanticNodesDsl.g:4224:2: ( ( 'abstract' ) )
            // InternalSemanticNodesDsl.g:4225:3: ( 'abstract' )
            {
             before(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_1_0()); 
            // InternalSemanticNodesDsl.g:4226:3: ( 'abstract' )
            // InternalSemanticNodesDsl.g:4227:4: 'abstract'
            {
             before(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_1_0()); 

            }

             after(grammarAccess.getSemanticNodeAccess().getAbstractAbstractKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__AbstractAssignment_1"


    // $ANTLR start "rule__SemanticNode__NameAssignment_3"
    // InternalSemanticNodesDsl.g:4238:1: rule__SemanticNode__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__SemanticNode__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4242:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4243:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4243:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4244:3: ruleEString
            {
             before(grammarAccess.getSemanticNodeAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__NameAssignment_3"


    // $ANTLR start "rule__SemanticNode__PropertiesAssignment_5_0"
    // InternalSemanticNodesDsl.g:4253:1: rule__SemanticNode__PropertiesAssignment_5_0 : ( ruleProperty ) ;
    public final void rule__SemanticNode__PropertiesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4257:1: ( ( ruleProperty ) )
            // InternalSemanticNodesDsl.g:4258:2: ( ruleProperty )
            {
            // InternalSemanticNodesDsl.g:4258:2: ( ruleProperty )
            // InternalSemanticNodesDsl.g:4259:3: ruleProperty
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__PropertiesAssignment_5_0"


    // $ANTLR start "rule__SemanticNode__PropertiesAssignment_5_1"
    // InternalSemanticNodesDsl.g:4268:1: rule__SemanticNode__PropertiesAssignment_5_1 : ( ruleProperty ) ;
    public final void rule__SemanticNode__PropertiesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4272:1: ( ( ruleProperty ) )
            // InternalSemanticNodesDsl.g:4273:2: ( ruleProperty )
            {
            // InternalSemanticNodesDsl.g:4273:2: ( ruleProperty )
            // InternalSemanticNodesDsl.g:4274:3: ruleProperty
            {
             before(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getPropertiesPropertyParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__PropertiesAssignment_5_1"


    // $ANTLR start "rule__SemanticNode__MetaDataValueAssignment_7_1"
    // InternalSemanticNodesDsl.g:4283:1: rule__SemanticNode__MetaDataValueAssignment_7_1 : ( ruleMetaDataValue ) ;
    public final void rule__SemanticNode__MetaDataValueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4287:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4288:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4288:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4289:3: ruleMetaDataValue
            {
             before(grammarAccess.getSemanticNodeAccess().getMetaDataValueMetaDataValueParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getMetaDataValueMetaDataValueParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__MetaDataValueAssignment_7_1"


    // $ANTLR start "rule__SemanticNode__MetaDataValueAssignment_7_2_1"
    // InternalSemanticNodesDsl.g:4298:1: rule__SemanticNode__MetaDataValueAssignment_7_2_1 : ( ruleMetaDataValue ) ;
    public final void rule__SemanticNode__MetaDataValueAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4302:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4303:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4303:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4304:3: ruleMetaDataValue
            {
             before(grammarAccess.getSemanticNodeAccess().getMetaDataValueMetaDataValueParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getSemanticNodeAccess().getMetaDataValueMetaDataValueParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SemanticNode__MetaDataValueAssignment_7_2_1"


    // $ANTLR start "rule__ObjectProperty__NameAssignment_1"
    // InternalSemanticNodesDsl.g:4313:1: rule__ObjectProperty__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ObjectProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4317:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4318:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4318:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4319:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4328:1: rule__ObjectProperty__RangeAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__ObjectProperty__RangeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4332:1: ( ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:4333:2: ( ( ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:4333:2: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4334:3: ( ruleEString )
            {
             before(grammarAccess.getObjectPropertyAccess().getRangeSemanticNodeCrossReference_3_0()); 
            // InternalSemanticNodesDsl.g:4335:3: ( ruleEString )
            // InternalSemanticNodesDsl.g:4336:4: ruleEString
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
    // InternalSemanticNodesDsl.g:4347:1: rule__ObjectProperty__LowerBoundAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__ObjectProperty__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4351:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4352:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4352:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4353:3: ruleEInt
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
    // InternalSemanticNodesDsl.g:4362:1: rule__ObjectProperty__UpperBoundAssignment_4_3 : ( ruleEInt ) ;
    public final void rule__ObjectProperty__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4366:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4367:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4367:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4368:3: ruleEInt
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


    // $ANTLR start "rule__ObjectProperty__MetaDataValueAssignment_5_1"
    // InternalSemanticNodesDsl.g:4377:1: rule__ObjectProperty__MetaDataValueAssignment_5_1 : ( ruleMetaDataValue ) ;
    public final void rule__ObjectProperty__MetaDataValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4381:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4382:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4382:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4383:3: ruleMetaDataValue
            {
             before(grammarAccess.getObjectPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getObjectPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__MetaDataValueAssignment_5_1"


    // $ANTLR start "rule__ObjectProperty__MetaDataValueAssignment_5_2_1"
    // InternalSemanticNodesDsl.g:4392:1: rule__ObjectProperty__MetaDataValueAssignment_5_2_1 : ( ruleMetaDataValue ) ;
    public final void rule__ObjectProperty__MetaDataValueAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4396:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4397:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4397:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4398:3: ruleMetaDataValue
            {
             before(grammarAccess.getObjectPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getObjectPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ObjectProperty__MetaDataValueAssignment_5_2_1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__NameAssignment_1"
    // InternalSemanticNodesDsl.g:4407:1: rule__PrimitiveTypeDataProperty__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PrimitiveTypeDataProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4411:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4412:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4412:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4413:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4422:1: rule__PrimitiveTypeDataProperty__TypeAssignment_2_1 : ( ruleType ) ;
    public final void rule__PrimitiveTypeDataProperty__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4426:1: ( ( ruleType ) )
            // InternalSemanticNodesDsl.g:4427:2: ( ruleType )
            {
            // InternalSemanticNodesDsl.g:4427:2: ( ruleType )
            // InternalSemanticNodesDsl.g:4428:3: ruleType
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
    // InternalSemanticNodesDsl.g:4437:1: rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__PrimitiveTypeDataProperty__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4441:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4442:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4442:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4443:3: ruleEInt
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
    // InternalSemanticNodesDsl.g:4452:1: rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3 : ( ruleEInt ) ;
    public final void rule__PrimitiveTypeDataProperty__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4456:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4457:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4457:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4458:3: ruleEInt
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


    // $ANTLR start "rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1"
    // InternalSemanticNodesDsl.g:4467:1: rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1 : ( ruleMetaDataValue ) ;
    public final void rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4471:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4472:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4472:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4473:3: ruleMetaDataValue
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_1"


    // $ANTLR start "rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1"
    // InternalSemanticNodesDsl.g:4482:1: rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1 : ( ruleMetaDataValue ) ;
    public final void rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4486:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4487:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4487:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4488:3: ruleMetaDataValue
            {
             before(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveTypeDataProperty__MetaDataValueAssignment_4_2_1"


    // $ANTLR start "rule__EnumerationDataProperty__NameAssignment_1"
    // InternalSemanticNodesDsl.g:4497:1: rule__EnumerationDataProperty__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__EnumerationDataProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4501:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4502:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4502:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4503:3: ruleEString
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
    // InternalSemanticNodesDsl.g:4512:1: rule__EnumerationDataProperty__TypeAssignment_2_1 : ( ( ruleEString ) ) ;
    public final void rule__EnumerationDataProperty__TypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4516:1: ( ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:4517:2: ( ( ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:4517:2: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4518:3: ( ruleEString )
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getTypeEnumerationCrossReference_2_1_0()); 
            // InternalSemanticNodesDsl.g:4519:3: ( ruleEString )
            // InternalSemanticNodesDsl.g:4520:4: ruleEString
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
    // InternalSemanticNodesDsl.g:4531:1: rule__EnumerationDataProperty__LowerBoundAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__EnumerationDataProperty__LowerBoundAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4535:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4536:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4536:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4537:3: ruleEInt
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
    // InternalSemanticNodesDsl.g:4546:1: rule__EnumerationDataProperty__UpperBoundAssignment_3_3 : ( ruleEInt ) ;
    public final void rule__EnumerationDataProperty__UpperBoundAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4550:1: ( ( ruleEInt ) )
            // InternalSemanticNodesDsl.g:4551:2: ( ruleEInt )
            {
            // InternalSemanticNodesDsl.g:4551:2: ( ruleEInt )
            // InternalSemanticNodesDsl.g:4552:3: ruleEInt
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


    // $ANTLR start "rule__EnumerationDataProperty__MetaDataValueAssignment_4_1"
    // InternalSemanticNodesDsl.g:4561:1: rule__EnumerationDataProperty__MetaDataValueAssignment_4_1 : ( ruleMetaDataValue ) ;
    public final void rule__EnumerationDataProperty__MetaDataValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4565:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4566:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4566:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4567:3: ruleMetaDataValue
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__MetaDataValueAssignment_4_1"


    // $ANTLR start "rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1"
    // InternalSemanticNodesDsl.g:4576:1: rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1 : ( ruleMetaDataValue ) ;
    public final void rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4580:1: ( ( ruleMetaDataValue ) )
            // InternalSemanticNodesDsl.g:4581:2: ( ruleMetaDataValue )
            {
            // InternalSemanticNodesDsl.g:4581:2: ( ruleMetaDataValue )
            // InternalSemanticNodesDsl.g:4582:3: ruleMetaDataValue
            {
             before(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMetaDataValue();

            state._fsp--;

             after(grammarAccess.getEnumerationDataPropertyAccess().getMetaDataValueMetaDataValueParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationDataProperty__MetaDataValueAssignment_4_2_1"


    // $ANTLR start "rule__MetaDataValue__KeyMetaDataAssignment_1"
    // InternalSemanticNodesDsl.g:4591:1: rule__MetaDataValue__KeyMetaDataAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__MetaDataValue__KeyMetaDataAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4595:1: ( ( ( ruleEString ) ) )
            // InternalSemanticNodesDsl.g:4596:2: ( ( ruleEString ) )
            {
            // InternalSemanticNodesDsl.g:4596:2: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4597:3: ( ruleEString )
            {
             before(grammarAccess.getMetaDataValueAccess().getKeyMetaDataMetaDataCrossReference_1_0()); 
            // InternalSemanticNodesDsl.g:4598:3: ( ruleEString )
            // InternalSemanticNodesDsl.g:4599:4: ruleEString
            {
             before(grammarAccess.getMetaDataValueAccess().getKeyMetaDataMetaDataEStringParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaDataValueAccess().getKeyMetaDataMetaDataEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMetaDataValueAccess().getKeyMetaDataMetaDataCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__KeyMetaDataAssignment_1"


    // $ANTLR start "rule__MetaDataValue__ValueAssignment_3"
    // InternalSemanticNodesDsl.g:4610:1: rule__MetaDataValue__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__MetaDataValue__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSemanticNodesDsl.g:4614:1: ( ( ruleEString ) )
            // InternalSemanticNodesDsl.g:4615:2: ( ruleEString )
            {
            // InternalSemanticNodesDsl.g:4615:2: ( ruleEString )
            // InternalSemanticNodesDsl.g:4616:3: ruleEString
            {
             before(grammarAccess.getMetaDataValueAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMetaDataValueAccess().getValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MetaDataValue__ValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000041580030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000041500030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000041500032L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000280000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020080040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000042L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000041000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000010000000L});

}