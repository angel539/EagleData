package uam.eagledata.dsl.events.ide.contentassist.antlr.internal;

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
import uam.eagledata.dsl.events.services.EventSetManagerDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEventSetManagerDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'", "'pattern'", "'{'", "'}'", "'connection'", "'and'", "'if'", "'then'", "'='", "'('", "')'", "','", "'<='"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEventSetManagerDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventSetManagerDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventSetManagerDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEventSetManagerDsl.g"; }


    	private EventSetManagerDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(EventSetManagerDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleEventSetManager"
    // InternalEventSetManagerDsl.g:53:1: entryRuleEventSetManager : ruleEventSetManager EOF ;
    public final void entryRuleEventSetManager() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:54:1: ( ruleEventSetManager EOF )
            // InternalEventSetManagerDsl.g:55:1: ruleEventSetManager EOF
            {
             before(grammarAccess.getEventSetManagerRule()); 
            pushFollow(FOLLOW_1);
            ruleEventSetManager();

            state._fsp--;

             after(grammarAccess.getEventSetManagerRule()); 
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
    // $ANTLR end "entryRuleEventSetManager"


    // $ANTLR start "ruleEventSetManager"
    // InternalEventSetManagerDsl.g:62:1: ruleEventSetManager : ( ( rule__EventSetManager__Group__0 ) ) ;
    public final void ruleEventSetManager() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:66:2: ( ( ( rule__EventSetManager__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:67:2: ( ( rule__EventSetManager__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:67:2: ( ( rule__EventSetManager__Group__0 ) )
            // InternalEventSetManagerDsl.g:68:3: ( rule__EventSetManager__Group__0 )
            {
             before(grammarAccess.getEventSetManagerAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:69:3: ( rule__EventSetManager__Group__0 )
            // InternalEventSetManagerDsl.g:69:4: rule__EventSetManager__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventSetManager__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventSetManagerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventSetManager"


    // $ANTLR start "entryRuleEvent"
    // InternalEventSetManagerDsl.g:78:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:79:1: ( ruleEvent EOF )
            // InternalEventSetManagerDsl.g:80:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalEventSetManagerDsl.g:87:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:91:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:92:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:92:2: ( ( rule__Event__Group__0 ) )
            // InternalEventSetManagerDsl.g:93:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:94:3: ( rule__Event__Group__0 )
            // InternalEventSetManagerDsl.g:94:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalEventSetManagerDsl.g:103:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:104:1: ( ruleCondition EOF )
            // InternalEventSetManagerDsl.g:105:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalEventSetManagerDsl.g:112:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:116:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalEventSetManagerDsl.g:117:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalEventSetManagerDsl.g:117:2: ( ( rule__Condition__Alternatives ) )
            // InternalEventSetManagerDsl.g:118:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalEventSetManagerDsl.g:119:3: ( rule__Condition__Alternatives )
            // InternalEventSetManagerDsl.g:119:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleBinaryExpression"
    // InternalEventSetManagerDsl.g:128:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:129:1: ( ruleBinaryExpression EOF )
            // InternalEventSetManagerDsl.g:130:1: ruleBinaryExpression EOF
            {
             before(grammarAccess.getBinaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryExpression();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionRule()); 
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
    // $ANTLR end "entryRuleBinaryExpression"


    // $ANTLR start "ruleBinaryExpression"
    // InternalEventSetManagerDsl.g:137:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:141:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:142:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:142:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalEventSetManagerDsl.g:143:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:144:3: ( rule__BinaryExpression__Group__0 )
            // InternalEventSetManagerDsl.g:144:4: rule__BinaryExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalEventSetManagerDsl.g:153:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:154:1: ( ruleLiteral EOF )
            // InternalEventSetManagerDsl.g:155:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalEventSetManagerDsl.g:162:1: ruleLiteral : ( ( rule__Literal__ValueAssignment ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:166:2: ( ( ( rule__Literal__ValueAssignment ) ) )
            // InternalEventSetManagerDsl.g:167:2: ( ( rule__Literal__ValueAssignment ) )
            {
            // InternalEventSetManagerDsl.g:167:2: ( ( rule__Literal__ValueAssignment ) )
            // InternalEventSetManagerDsl.g:168:3: ( rule__Literal__ValueAssignment )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment()); 
            // InternalEventSetManagerDsl.g:169:3: ( rule__Literal__ValueAssignment )
            // InternalEventSetManagerDsl.g:169:4: rule__Literal__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleBooleanExpression"
    // InternalEventSetManagerDsl.g:178:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:179:1: ( ruleBooleanExpression EOF )
            // InternalEventSetManagerDsl.g:180:1: ruleBooleanExpression EOF
            {
             before(grammarAccess.getBooleanExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanExpression();

            state._fsp--;

             after(grammarAccess.getBooleanExpressionRule()); 
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
    // $ANTLR end "entryRuleBooleanExpression"


    // $ANTLR start "ruleBooleanExpression"
    // InternalEventSetManagerDsl.g:187:1: ruleBooleanExpression : ( ( rule__BooleanExpression__ExpressionAssignment ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:191:2: ( ( ( rule__BooleanExpression__ExpressionAssignment ) ) )
            // InternalEventSetManagerDsl.g:192:2: ( ( rule__BooleanExpression__ExpressionAssignment ) )
            {
            // InternalEventSetManagerDsl.g:192:2: ( ( rule__BooleanExpression__ExpressionAssignment ) )
            // InternalEventSetManagerDsl.g:193:3: ( rule__BooleanExpression__ExpressionAssignment )
            {
             before(grammarAccess.getBooleanExpressionAccess().getExpressionAssignment()); 
            // InternalEventSetManagerDsl.g:194:3: ( rule__BooleanExpression__ExpressionAssignment )
            // InternalEventSetManagerDsl.g:194:4: rule__BooleanExpression__ExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanExpression__ExpressionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanExpressionAccess().getExpressionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanExpression"


    // $ANTLR start "entryRuleConcept"
    // InternalEventSetManagerDsl.g:203:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:204:1: ( ruleConcept EOF )
            // InternalEventSetManagerDsl.g:205:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // InternalEventSetManagerDsl.g:212:1: ruleConcept : ( ( rule__Concept__Alternatives ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:216:2: ( ( ( rule__Concept__Alternatives ) ) )
            // InternalEventSetManagerDsl.g:217:2: ( ( rule__Concept__Alternatives ) )
            {
            // InternalEventSetManagerDsl.g:217:2: ( ( rule__Concept__Alternatives ) )
            // InternalEventSetManagerDsl.g:218:3: ( rule__Concept__Alternatives )
            {
             before(grammarAccess.getConceptAccess().getAlternatives()); 
            // InternalEventSetManagerDsl.g:219:3: ( rule__Concept__Alternatives )
            // InternalEventSetManagerDsl.g:219:4: rule__Concept__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Concept__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleKeyConcept"
    // InternalEventSetManagerDsl.g:228:1: entryRuleKeyConcept : ruleKeyConcept EOF ;
    public final void entryRuleKeyConcept() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:229:1: ( ruleKeyConcept EOF )
            // InternalEventSetManagerDsl.g:230:1: ruleKeyConcept EOF
            {
             before(grammarAccess.getKeyConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleKeyConcept();

            state._fsp--;

             after(grammarAccess.getKeyConceptRule()); 
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
    // $ANTLR end "entryRuleKeyConcept"


    // $ANTLR start "ruleKeyConcept"
    // InternalEventSetManagerDsl.g:237:1: ruleKeyConcept : ( ( rule__KeyConcept__Group__0 ) ) ;
    public final void ruleKeyConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:241:2: ( ( ( rule__KeyConcept__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:242:2: ( ( rule__KeyConcept__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:242:2: ( ( rule__KeyConcept__Group__0 ) )
            // InternalEventSetManagerDsl.g:243:3: ( rule__KeyConcept__Group__0 )
            {
             before(grammarAccess.getKeyConceptAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:244:3: ( rule__KeyConcept__Group__0 )
            // InternalEventSetManagerDsl.g:244:4: rule__KeyConcept__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__KeyConcept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyConceptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKeyConcept"


    // $ANTLR start "entryRuleRegexConcept"
    // InternalEventSetManagerDsl.g:253:1: entryRuleRegexConcept : ruleRegexConcept EOF ;
    public final void entryRuleRegexConcept() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:254:1: ( ruleRegexConcept EOF )
            // InternalEventSetManagerDsl.g:255:1: ruleRegexConcept EOF
            {
             before(grammarAccess.getRegexConceptRule()); 
            pushFollow(FOLLOW_1);
            ruleRegexConcept();

            state._fsp--;

             after(grammarAccess.getRegexConceptRule()); 
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
    // $ANTLR end "entryRuleRegexConcept"


    // $ANTLR start "ruleRegexConcept"
    // InternalEventSetManagerDsl.g:262:1: ruleRegexConcept : ( ( rule__RegexConcept__Group__0 ) ) ;
    public final void ruleRegexConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:266:2: ( ( ( rule__RegexConcept__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:267:2: ( ( rule__RegexConcept__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:267:2: ( ( rule__RegexConcept__Group__0 ) )
            // InternalEventSetManagerDsl.g:268:3: ( rule__RegexConcept__Group__0 )
            {
             before(grammarAccess.getRegexConceptAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:269:3: ( rule__RegexConcept__Group__0 )
            // InternalEventSetManagerDsl.g:269:4: rule__RegexConcept__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegexConcept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegexConceptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegexConcept"


    // $ANTLR start "entryRuleAction"
    // InternalEventSetManagerDsl.g:278:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:279:1: ( ruleAction EOF )
            // InternalEventSetManagerDsl.g:280:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalEventSetManagerDsl.g:287:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:291:2: ( ( ( rule__Action__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:292:2: ( ( rule__Action__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:292:2: ( ( rule__Action__Group__0 ) )
            // InternalEventSetManagerDsl.g:293:3: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:294:3: ( rule__Action__Group__0 )
            // InternalEventSetManagerDsl.g:294:4: rule__Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionParam"
    // InternalEventSetManagerDsl.g:303:1: entryRuleActionParam : ruleActionParam EOF ;
    public final void entryRuleActionParam() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:304:1: ( ruleActionParam EOF )
            // InternalEventSetManagerDsl.g:305:1: ruleActionParam EOF
            {
             before(grammarAccess.getActionParamRule()); 
            pushFollow(FOLLOW_1);
            ruleActionParam();

            state._fsp--;

             after(grammarAccess.getActionParamRule()); 
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
    // $ANTLR end "entryRuleActionParam"


    // $ANTLR start "ruleActionParam"
    // InternalEventSetManagerDsl.g:312:1: ruleActionParam : ( ( rule__ActionParam__Alternatives ) ) ;
    public final void ruleActionParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:316:2: ( ( ( rule__ActionParam__Alternatives ) ) )
            // InternalEventSetManagerDsl.g:317:2: ( ( rule__ActionParam__Alternatives ) )
            {
            // InternalEventSetManagerDsl.g:317:2: ( ( rule__ActionParam__Alternatives ) )
            // InternalEventSetManagerDsl.g:318:3: ( rule__ActionParam__Alternatives )
            {
             before(grammarAccess.getActionParamAccess().getAlternatives()); 
            // InternalEventSetManagerDsl.g:319:3: ( rule__ActionParam__Alternatives )
            // InternalEventSetManagerDsl.g:319:4: rule__ActionParam__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActionParam__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionParamAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionParam"


    // $ANTLR start "entryRuleConceptParam"
    // InternalEventSetManagerDsl.g:328:1: entryRuleConceptParam : ruleConceptParam EOF ;
    public final void entryRuleConceptParam() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:329:1: ( ruleConceptParam EOF )
            // InternalEventSetManagerDsl.g:330:1: ruleConceptParam EOF
            {
             before(grammarAccess.getConceptParamRule()); 
            pushFollow(FOLLOW_1);
            ruleConceptParam();

            state._fsp--;

             after(grammarAccess.getConceptParamRule()); 
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
    // $ANTLR end "entryRuleConceptParam"


    // $ANTLR start "ruleConceptParam"
    // InternalEventSetManagerDsl.g:337:1: ruleConceptParam : ( ( rule__ConceptParam__Group__0 ) ) ;
    public final void ruleConceptParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:341:2: ( ( ( rule__ConceptParam__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:342:2: ( ( rule__ConceptParam__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:342:2: ( ( rule__ConceptParam__Group__0 ) )
            // InternalEventSetManagerDsl.g:343:3: ( rule__ConceptParam__Group__0 )
            {
             before(grammarAccess.getConceptParamAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:344:3: ( rule__ConceptParam__Group__0 )
            // InternalEventSetManagerDsl.g:344:4: rule__ConceptParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConceptParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConceptParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConceptParam"


    // $ANTLR start "entryRuleStringParam"
    // InternalEventSetManagerDsl.g:353:1: entryRuleStringParam : ruleStringParam EOF ;
    public final void entryRuleStringParam() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:354:1: ( ruleStringParam EOF )
            // InternalEventSetManagerDsl.g:355:1: ruleStringParam EOF
            {
             before(grammarAccess.getStringParamRule()); 
            pushFollow(FOLLOW_1);
            ruleStringParam();

            state._fsp--;

             after(grammarAccess.getStringParamRule()); 
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
    // $ANTLR end "entryRuleStringParam"


    // $ANTLR start "ruleStringParam"
    // InternalEventSetManagerDsl.g:362:1: ruleStringParam : ( ( rule__StringParam__Group__0 ) ) ;
    public final void ruleStringParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:366:2: ( ( ( rule__StringParam__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:367:2: ( ( rule__StringParam__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:367:2: ( ( rule__StringParam__Group__0 ) )
            // InternalEventSetManagerDsl.g:368:3: ( rule__StringParam__Group__0 )
            {
             before(grammarAccess.getStringParamAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:369:3: ( rule__StringParam__Group__0 )
            // InternalEventSetManagerDsl.g:369:4: rule__StringParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringParam"


    // $ANTLR start "entryRuleEString"
    // InternalEventSetManagerDsl.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:379:1: ( ruleEString EOF )
            // InternalEventSetManagerDsl.g:380:1: ruleEString EOF
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
    // InternalEventSetManagerDsl.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEventSetManagerDsl.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEventSetManagerDsl.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalEventSetManagerDsl.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEventSetManagerDsl.g:394:3: ( rule__EString__Alternatives )
            // InternalEventSetManagerDsl.g:394:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleType"
    // InternalEventSetManagerDsl.g:403:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:407:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalEventSetManagerDsl.g:408:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalEventSetManagerDsl.g:408:2: ( ( rule__Type__Alternatives ) )
            // InternalEventSetManagerDsl.g:409:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalEventSetManagerDsl.g:410:3: ( rule__Type__Alternatives )
            // InternalEventSetManagerDsl.g:410:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalEventSetManagerDsl.g:418:1: rule__Condition__Alternatives : ( ( ruleBinaryExpression ) | ( ruleBooleanExpression ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:422:1: ( ( ruleBinaryExpression ) | ( ruleBooleanExpression ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_BOOLEAN) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEventSetManagerDsl.g:423:2: ( ruleBinaryExpression )
                    {
                    // InternalEventSetManagerDsl.g:423:2: ( ruleBinaryExpression )
                    // InternalEventSetManagerDsl.g:424:3: ruleBinaryExpression
                    {
                     before(grammarAccess.getConditionAccess().getBinaryExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryExpression();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getBinaryExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:429:2: ( ruleBooleanExpression )
                    {
                    // InternalEventSetManagerDsl.g:429:2: ( ruleBooleanExpression )
                    // InternalEventSetManagerDsl.g:430:3: ruleBooleanExpression
                    {
                     before(grammarAccess.getConditionAccess().getBooleanExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanExpression();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getBooleanExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Concept__Alternatives"
    // InternalEventSetManagerDsl.g:439:1: rule__Concept__Alternatives : ( ( ruleKeyConcept ) | ( ruleRegexConcept ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:443:1: ( ( ruleKeyConcept ) | ( ruleRegexConcept ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEventSetManagerDsl.g:444:2: ( ruleKeyConcept )
                    {
                    // InternalEventSetManagerDsl.g:444:2: ( ruleKeyConcept )
                    // InternalEventSetManagerDsl.g:445:3: ruleKeyConcept
                    {
                     before(grammarAccess.getConceptAccess().getKeyConceptParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleKeyConcept();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getKeyConceptParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:450:2: ( ruleRegexConcept )
                    {
                    // InternalEventSetManagerDsl.g:450:2: ( ruleRegexConcept )
                    // InternalEventSetManagerDsl.g:451:3: ruleRegexConcept
                    {
                     before(grammarAccess.getConceptAccess().getRegexConceptParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRegexConcept();

                    state._fsp--;

                     after(grammarAccess.getConceptAccess().getRegexConceptParserRuleCall_1()); 

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
    // $ANTLR end "rule__Concept__Alternatives"


    // $ANTLR start "rule__ActionParam__Alternatives"
    // InternalEventSetManagerDsl.g:460:1: rule__ActionParam__Alternatives : ( ( ruleConceptParam ) | ( ruleStringParam ) );
    public final void rule__ActionParam__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:464:1: ( ( ruleConceptParam ) | ( ruleStringParam ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==28) ) {
                    alt3=1;
                }
                else if ( (LA3_1==24) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_ID) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==28) ) {
                    alt3=1;
                }
                else if ( (LA3_2==24) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEventSetManagerDsl.g:465:2: ( ruleConceptParam )
                    {
                    // InternalEventSetManagerDsl.g:465:2: ( ruleConceptParam )
                    // InternalEventSetManagerDsl.g:466:3: ruleConceptParam
                    {
                     before(grammarAccess.getActionParamAccess().getConceptParamParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleConceptParam();

                    state._fsp--;

                     after(grammarAccess.getActionParamAccess().getConceptParamParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:471:2: ( ruleStringParam )
                    {
                    // InternalEventSetManagerDsl.g:471:2: ( ruleStringParam )
                    // InternalEventSetManagerDsl.g:472:3: ruleStringParam
                    {
                     before(grammarAccess.getActionParamAccess().getStringParamParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStringParam();

                    state._fsp--;

                     after(grammarAccess.getActionParamAccess().getStringParamParserRuleCall_1()); 

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
    // $ANTLR end "rule__ActionParam__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEventSetManagerDsl.g:481:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:485:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
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
                    // InternalEventSetManagerDsl.g:486:2: ( RULE_STRING )
                    {
                    // InternalEventSetManagerDsl.g:486:2: ( RULE_STRING )
                    // InternalEventSetManagerDsl.g:487:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:492:2: ( RULE_ID )
                    {
                    // InternalEventSetManagerDsl.g:492:2: ( RULE_ID )
                    // InternalEventSetManagerDsl.g:493:3: RULE_ID
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
    // InternalEventSetManagerDsl.g:502:1: rule__Type__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:506:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt5=1;
                }
                break;
            case 13:
                {
                alt5=2;
                }
                break;
            case 14:
                {
                alt5=3;
                }
                break;
            case 15:
                {
                alt5=4;
                }
                break;
            case 16:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEventSetManagerDsl.g:507:2: ( ( 'String' ) )
                    {
                    // InternalEventSetManagerDsl.g:507:2: ( ( 'String' ) )
                    // InternalEventSetManagerDsl.g:508:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalEventSetManagerDsl.g:509:3: ( 'String' )
                    // InternalEventSetManagerDsl.g:509:4: 'String'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:513:2: ( ( 'Int' ) )
                    {
                    // InternalEventSetManagerDsl.g:513:2: ( ( 'Int' ) )
                    // InternalEventSetManagerDsl.g:514:3: ( 'Int' )
                    {
                     before(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalEventSetManagerDsl.g:515:3: ( 'Int' )
                    // InternalEventSetManagerDsl.g:515:4: 'Int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEventSetManagerDsl.g:519:2: ( ( 'Boolean' ) )
                    {
                    // InternalEventSetManagerDsl.g:519:2: ( ( 'Boolean' ) )
                    // InternalEventSetManagerDsl.g:520:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalEventSetManagerDsl.g:521:3: ( 'Boolean' )
                    // InternalEventSetManagerDsl.g:521:4: 'Boolean'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEventSetManagerDsl.g:525:2: ( ( 'Float' ) )
                    {
                    // InternalEventSetManagerDsl.g:525:2: ( ( 'Float' ) )
                    // InternalEventSetManagerDsl.g:526:3: ( 'Float' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // InternalEventSetManagerDsl.g:527:3: ( 'Float' )
                    // InternalEventSetManagerDsl.g:527:4: 'Float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEventSetManagerDsl.g:531:2: ( ( 'Double' ) )
                    {
                    // InternalEventSetManagerDsl.g:531:2: ( ( 'Double' ) )
                    // InternalEventSetManagerDsl.g:532:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalEventSetManagerDsl.g:533:3: ( 'Double' )
                    // InternalEventSetManagerDsl.g:533:4: 'Double'
                    {
                    match(input,16,FOLLOW_2); 

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


    // $ANTLR start "rule__EventSetManager__Group__0"
    // InternalEventSetManagerDsl.g:541:1: rule__EventSetManager__Group__0 : rule__EventSetManager__Group__0__Impl rule__EventSetManager__Group__1 ;
    public final void rule__EventSetManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:545:1: ( rule__EventSetManager__Group__0__Impl rule__EventSetManager__Group__1 )
            // InternalEventSetManagerDsl.g:546:2: rule__EventSetManager__Group__0__Impl rule__EventSetManager__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EventSetManager__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventSetManager__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSetManager__Group__0"


    // $ANTLR start "rule__EventSetManager__Group__0__Impl"
    // InternalEventSetManagerDsl.g:553:1: rule__EventSetManager__Group__0__Impl : ( ( rule__EventSetManager__EventsAssignment_0 ) ) ;
    public final void rule__EventSetManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:557:1: ( ( ( rule__EventSetManager__EventsAssignment_0 ) ) )
            // InternalEventSetManagerDsl.g:558:1: ( ( rule__EventSetManager__EventsAssignment_0 ) )
            {
            // InternalEventSetManagerDsl.g:558:1: ( ( rule__EventSetManager__EventsAssignment_0 ) )
            // InternalEventSetManagerDsl.g:559:2: ( rule__EventSetManager__EventsAssignment_0 )
            {
             before(grammarAccess.getEventSetManagerAccess().getEventsAssignment_0()); 
            // InternalEventSetManagerDsl.g:560:2: ( rule__EventSetManager__EventsAssignment_0 )
            // InternalEventSetManagerDsl.g:560:3: rule__EventSetManager__EventsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EventSetManager__EventsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventSetManagerAccess().getEventsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSetManager__Group__0__Impl"


    // $ANTLR start "rule__EventSetManager__Group__1"
    // InternalEventSetManagerDsl.g:568:1: rule__EventSetManager__Group__1 : rule__EventSetManager__Group__1__Impl ;
    public final void rule__EventSetManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:572:1: ( rule__EventSetManager__Group__1__Impl )
            // InternalEventSetManagerDsl.g:573:2: rule__EventSetManager__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventSetManager__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSetManager__Group__1"


    // $ANTLR start "rule__EventSetManager__Group__1__Impl"
    // InternalEventSetManagerDsl.g:579:1: rule__EventSetManager__Group__1__Impl : ( ( rule__EventSetManager__EventsAssignment_1 )* ) ;
    public final void rule__EventSetManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:583:1: ( ( ( rule__EventSetManager__EventsAssignment_1 )* ) )
            // InternalEventSetManagerDsl.g:584:1: ( ( rule__EventSetManager__EventsAssignment_1 )* )
            {
            // InternalEventSetManagerDsl.g:584:1: ( ( rule__EventSetManager__EventsAssignment_1 )* )
            // InternalEventSetManagerDsl.g:585:2: ( rule__EventSetManager__EventsAssignment_1 )*
            {
             before(grammarAccess.getEventSetManagerAccess().getEventsAssignment_1()); 
            // InternalEventSetManagerDsl.g:586:2: ( rule__EventSetManager__EventsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:586:3: rule__EventSetManager__EventsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EventSetManager__EventsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getEventSetManagerAccess().getEventsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSetManager__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalEventSetManagerDsl.g:595:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:599:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalEventSetManagerDsl.g:600:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalEventSetManagerDsl.g:607:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:611:1: ( ( () ) )
            // InternalEventSetManagerDsl.g:612:1: ( () )
            {
            // InternalEventSetManagerDsl.g:612:1: ( () )
            // InternalEventSetManagerDsl.g:613:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalEventSetManagerDsl.g:614:2: ()
            // InternalEventSetManagerDsl.g:614:3: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalEventSetManagerDsl.g:622:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:626:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalEventSetManagerDsl.g:627:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalEventSetManagerDsl.g:634:1: rule__Event__Group__1__Impl : ( ( rule__Event__Group_1__0 )? ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:638:1: ( ( ( rule__Event__Group_1__0 )? ) )
            // InternalEventSetManagerDsl.g:639:1: ( ( rule__Event__Group_1__0 )? )
            {
            // InternalEventSetManagerDsl.g:639:1: ( ( rule__Event__Group_1__0 )? )
            // InternalEventSetManagerDsl.g:640:2: ( rule__Event__Group_1__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_1()); 
            // InternalEventSetManagerDsl.g:641:2: ( rule__Event__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEventSetManagerDsl.g:641:3: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalEventSetManagerDsl.g:649:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:653:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalEventSetManagerDsl.g:654:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalEventSetManagerDsl.g:661:1: rule__Event__Group__2__Impl : ( 'pattern' ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:665:1: ( ( 'pattern' ) )
            // InternalEventSetManagerDsl.g:666:1: ( 'pattern' )
            {
            // InternalEventSetManagerDsl.g:666:1: ( 'pattern' )
            // InternalEventSetManagerDsl.g:667:2: 'pattern'
            {
             before(grammarAccess.getEventAccess().getPatternKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getPatternKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalEventSetManagerDsl.g:676:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:680:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalEventSetManagerDsl.g:681:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalEventSetManagerDsl.g:688:1: rule__Event__Group__3__Impl : ( ( rule__Event__NameAssignment_3 ) ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:692:1: ( ( ( rule__Event__NameAssignment_3 ) ) )
            // InternalEventSetManagerDsl.g:693:1: ( ( rule__Event__NameAssignment_3 ) )
            {
            // InternalEventSetManagerDsl.g:693:1: ( ( rule__Event__NameAssignment_3 ) )
            // InternalEventSetManagerDsl.g:694:2: ( rule__Event__NameAssignment_3 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_3()); 
            // InternalEventSetManagerDsl.g:695:2: ( rule__Event__NameAssignment_3 )
            // InternalEventSetManagerDsl.g:695:3: rule__Event__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // InternalEventSetManagerDsl.g:703:1: rule__Event__Group__4 : rule__Event__Group__4__Impl rule__Event__Group__5 ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:707:1: ( rule__Event__Group__4__Impl rule__Event__Group__5 )
            // InternalEventSetManagerDsl.g:708:2: rule__Event__Group__4__Impl rule__Event__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Event__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // InternalEventSetManagerDsl.g:715:1: rule__Event__Group__4__Impl : ( '{' ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:719:1: ( ( '{' ) )
            // InternalEventSetManagerDsl.g:720:1: ( '{' )
            {
            // InternalEventSetManagerDsl.g:720:1: ( '{' )
            // InternalEventSetManagerDsl.g:721:2: '{'
            {
             before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group__5"
    // InternalEventSetManagerDsl.g:730:1: rule__Event__Group__5 : rule__Event__Group__5__Impl rule__Event__Group__6 ;
    public final void rule__Event__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:734:1: ( rule__Event__Group__5__Impl rule__Event__Group__6 )
            // InternalEventSetManagerDsl.g:735:2: rule__Event__Group__5__Impl rule__Event__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Event__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5"


    // $ANTLR start "rule__Event__Group__5__Impl"
    // InternalEventSetManagerDsl.g:742:1: rule__Event__Group__5__Impl : ( ( rule__Event__ConceptsAssignment_5 ) ) ;
    public final void rule__Event__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:746:1: ( ( ( rule__Event__ConceptsAssignment_5 ) ) )
            // InternalEventSetManagerDsl.g:747:1: ( ( rule__Event__ConceptsAssignment_5 ) )
            {
            // InternalEventSetManagerDsl.g:747:1: ( ( rule__Event__ConceptsAssignment_5 ) )
            // InternalEventSetManagerDsl.g:748:2: ( rule__Event__ConceptsAssignment_5 )
            {
             before(grammarAccess.getEventAccess().getConceptsAssignment_5()); 
            // InternalEventSetManagerDsl.g:749:2: ( rule__Event__ConceptsAssignment_5 )
            // InternalEventSetManagerDsl.g:749:3: rule__Event__ConceptsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Event__ConceptsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getConceptsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__5__Impl"


    // $ANTLR start "rule__Event__Group__6"
    // InternalEventSetManagerDsl.g:757:1: rule__Event__Group__6 : rule__Event__Group__6__Impl rule__Event__Group__7 ;
    public final void rule__Event__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:761:1: ( rule__Event__Group__6__Impl rule__Event__Group__7 )
            // InternalEventSetManagerDsl.g:762:2: rule__Event__Group__6__Impl rule__Event__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Event__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6"


    // $ANTLR start "rule__Event__Group__6__Impl"
    // InternalEventSetManagerDsl.g:769:1: rule__Event__Group__6__Impl : ( ( rule__Event__ConceptsAssignment_6 )* ) ;
    public final void rule__Event__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:773:1: ( ( ( rule__Event__ConceptsAssignment_6 )* ) )
            // InternalEventSetManagerDsl.g:774:1: ( ( rule__Event__ConceptsAssignment_6 )* )
            {
            // InternalEventSetManagerDsl.g:774:1: ( ( rule__Event__ConceptsAssignment_6 )* )
            // InternalEventSetManagerDsl.g:775:2: ( rule__Event__ConceptsAssignment_6 )*
            {
             before(grammarAccess.getEventAccess().getConceptsAssignment_6()); 
            // InternalEventSetManagerDsl.g:776:2: ( rule__Event__ConceptsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=12 && LA8_0<=16)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:776:3: rule__Event__ConceptsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Event__ConceptsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getConceptsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__6__Impl"


    // $ANTLR start "rule__Event__Group__7"
    // InternalEventSetManagerDsl.g:784:1: rule__Event__Group__7 : rule__Event__Group__7__Impl rule__Event__Group__8 ;
    public final void rule__Event__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:788:1: ( rule__Event__Group__7__Impl rule__Event__Group__8 )
            // InternalEventSetManagerDsl.g:789:2: rule__Event__Group__7__Impl rule__Event__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__7"


    // $ANTLR start "rule__Event__Group__7__Impl"
    // InternalEventSetManagerDsl.g:796:1: rule__Event__Group__7__Impl : ( '}' ) ;
    public final void rule__Event__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:800:1: ( ( '}' ) )
            // InternalEventSetManagerDsl.g:801:1: ( '}' )
            {
            // InternalEventSetManagerDsl.g:801:1: ( '}' )
            // InternalEventSetManagerDsl.g:802:2: '}'
            {
             before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__7__Impl"


    // $ANTLR start "rule__Event__Group__8"
    // InternalEventSetManagerDsl.g:811:1: rule__Event__Group__8 : rule__Event__Group__8__Impl rule__Event__Group__9 ;
    public final void rule__Event__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:815:1: ( rule__Event__Group__8__Impl rule__Event__Group__9 )
            // InternalEventSetManagerDsl.g:816:2: rule__Event__Group__8__Impl rule__Event__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Event__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__8"


    // $ANTLR start "rule__Event__Group__8__Impl"
    // InternalEventSetManagerDsl.g:823:1: rule__Event__Group__8__Impl : ( ( rule__Event__Group_8__0 )? ) ;
    public final void rule__Event__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:827:1: ( ( ( rule__Event__Group_8__0 )? ) )
            // InternalEventSetManagerDsl.g:828:1: ( ( rule__Event__Group_8__0 )? )
            {
            // InternalEventSetManagerDsl.g:828:1: ( ( rule__Event__Group_8__0 )? )
            // InternalEventSetManagerDsl.g:829:2: ( rule__Event__Group_8__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_8()); 
            // InternalEventSetManagerDsl.g:830:2: ( rule__Event__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEventSetManagerDsl.g:830:3: rule__Event__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__8__Impl"


    // $ANTLR start "rule__Event__Group__9"
    // InternalEventSetManagerDsl.g:838:1: rule__Event__Group__9 : rule__Event__Group__9__Impl ;
    public final void rule__Event__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:842:1: ( rule__Event__Group__9__Impl )
            // InternalEventSetManagerDsl.g:843:2: rule__Event__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__9"


    // $ANTLR start "rule__Event__Group__9__Impl"
    // InternalEventSetManagerDsl.g:849:1: rule__Event__Group__9__Impl : ( ( rule__Event__Group_9__0 ) ) ;
    public final void rule__Event__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:853:1: ( ( ( rule__Event__Group_9__0 ) ) )
            // InternalEventSetManagerDsl.g:854:1: ( ( rule__Event__Group_9__0 ) )
            {
            // InternalEventSetManagerDsl.g:854:1: ( ( rule__Event__Group_9__0 ) )
            // InternalEventSetManagerDsl.g:855:2: ( rule__Event__Group_9__0 )
            {
             before(grammarAccess.getEventAccess().getGroup_9()); 
            // InternalEventSetManagerDsl.g:856:2: ( rule__Event__Group_9__0 )
            // InternalEventSetManagerDsl.g:856:3: rule__Event__Group_9__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_9__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__9__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // InternalEventSetManagerDsl.g:865:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:869:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalEventSetManagerDsl.g:870:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0"


    // $ANTLR start "rule__Event__Group_1__0__Impl"
    // InternalEventSetManagerDsl.g:877:1: rule__Event__Group_1__0__Impl : ( 'connection' ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:881:1: ( ( 'connection' ) )
            // InternalEventSetManagerDsl.g:882:1: ( 'connection' )
            {
            // InternalEventSetManagerDsl.g:882:1: ( 'connection' )
            // InternalEventSetManagerDsl.g:883:2: 'connection'
            {
             before(grammarAccess.getEventAccess().getConnectionKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getConnectionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1__1"
    // InternalEventSetManagerDsl.g:892:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:896:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // InternalEventSetManagerDsl.g:897:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1"


    // $ANTLR start "rule__Event__Group_1__1__Impl"
    // InternalEventSetManagerDsl.g:904:1: rule__Event__Group_1__1__Impl : ( ( rule__Event__DataconnectionAssignment_1_1 ) ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:908:1: ( ( ( rule__Event__DataconnectionAssignment_1_1 ) ) )
            // InternalEventSetManagerDsl.g:909:1: ( ( rule__Event__DataconnectionAssignment_1_1 ) )
            {
            // InternalEventSetManagerDsl.g:909:1: ( ( rule__Event__DataconnectionAssignment_1_1 ) )
            // InternalEventSetManagerDsl.g:910:2: ( rule__Event__DataconnectionAssignment_1_1 )
            {
             before(grammarAccess.getEventAccess().getDataconnectionAssignment_1_1()); 
            // InternalEventSetManagerDsl.g:911:2: ( rule__Event__DataconnectionAssignment_1_1 )
            // InternalEventSetManagerDsl.g:911:3: rule__Event__DataconnectionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__DataconnectionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getDataconnectionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1__Impl"


    // $ANTLR start "rule__Event__Group_1__2"
    // InternalEventSetManagerDsl.g:919:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:923:1: ( rule__Event__Group_1__2__Impl )
            // InternalEventSetManagerDsl.g:924:2: rule__Event__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__2"


    // $ANTLR start "rule__Event__Group_1__2__Impl"
    // InternalEventSetManagerDsl.g:930:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__Group_1_2__0 )* ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:934:1: ( ( ( rule__Event__Group_1_2__0 )* ) )
            // InternalEventSetManagerDsl.g:935:1: ( ( rule__Event__Group_1_2__0 )* )
            {
            // InternalEventSetManagerDsl.g:935:1: ( ( rule__Event__Group_1_2__0 )* )
            // InternalEventSetManagerDsl.g:936:2: ( rule__Event__Group_1_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_1_2()); 
            // InternalEventSetManagerDsl.g:937:2: ( rule__Event__Group_1_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:937:3: rule__Event__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Event__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__2__Impl"


    // $ANTLR start "rule__Event__Group_1_2__0"
    // InternalEventSetManagerDsl.g:946:1: rule__Event__Group_1_2__0 : rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 ;
    public final void rule__Event__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:950:1: ( rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1 )
            // InternalEventSetManagerDsl.g:951:2: rule__Event__Group_1_2__0__Impl rule__Event__Group_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__0"


    // $ANTLR start "rule__Event__Group_1_2__0__Impl"
    // InternalEventSetManagerDsl.g:958:1: rule__Event__Group_1_2__0__Impl : ( 'and' ) ;
    public final void rule__Event__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:962:1: ( ( 'and' ) )
            // InternalEventSetManagerDsl.g:963:1: ( 'and' )
            {
            // InternalEventSetManagerDsl.g:963:1: ( 'and' )
            // InternalEventSetManagerDsl.g:964:2: 'and'
            {
             before(grammarAccess.getEventAccess().getAndKeyword_1_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getAndKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__0__Impl"


    // $ANTLR start "rule__Event__Group_1_2__1"
    // InternalEventSetManagerDsl.g:973:1: rule__Event__Group_1_2__1 : rule__Event__Group_1_2__1__Impl ;
    public final void rule__Event__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:977:1: ( rule__Event__Group_1_2__1__Impl )
            // InternalEventSetManagerDsl.g:978:2: rule__Event__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__1"


    // $ANTLR start "rule__Event__Group_1_2__1__Impl"
    // InternalEventSetManagerDsl.g:984:1: rule__Event__Group_1_2__1__Impl : ( ( rule__Event__DataconnectionAssignment_1_2_1 ) ) ;
    public final void rule__Event__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:988:1: ( ( ( rule__Event__DataconnectionAssignment_1_2_1 ) ) )
            // InternalEventSetManagerDsl.g:989:1: ( ( rule__Event__DataconnectionAssignment_1_2_1 ) )
            {
            // InternalEventSetManagerDsl.g:989:1: ( ( rule__Event__DataconnectionAssignment_1_2_1 ) )
            // InternalEventSetManagerDsl.g:990:2: ( rule__Event__DataconnectionAssignment_1_2_1 )
            {
             before(grammarAccess.getEventAccess().getDataconnectionAssignment_1_2_1()); 
            // InternalEventSetManagerDsl.g:991:2: ( rule__Event__DataconnectionAssignment_1_2_1 )
            // InternalEventSetManagerDsl.g:991:3: rule__Event__DataconnectionAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__DataconnectionAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getDataconnectionAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_2__1__Impl"


    // $ANTLR start "rule__Event__Group_8__0"
    // InternalEventSetManagerDsl.g:1000:1: rule__Event__Group_8__0 : rule__Event__Group_8__0__Impl rule__Event__Group_8__1 ;
    public final void rule__Event__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1004:1: ( rule__Event__Group_8__0__Impl rule__Event__Group_8__1 )
            // InternalEventSetManagerDsl.g:1005:2: rule__Event__Group_8__0__Impl rule__Event__Group_8__1
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__0"


    // $ANTLR start "rule__Event__Group_8__0__Impl"
    // InternalEventSetManagerDsl.g:1012:1: rule__Event__Group_8__0__Impl : ( 'if' ) ;
    public final void rule__Event__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1016:1: ( ( 'if' ) )
            // InternalEventSetManagerDsl.g:1017:1: ( 'if' )
            {
            // InternalEventSetManagerDsl.g:1017:1: ( 'if' )
            // InternalEventSetManagerDsl.g:1018:2: 'if'
            {
             before(grammarAccess.getEventAccess().getIfKeyword_8_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getIfKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__0__Impl"


    // $ANTLR start "rule__Event__Group_8__1"
    // InternalEventSetManagerDsl.g:1027:1: rule__Event__Group_8__1 : rule__Event__Group_8__1__Impl ;
    public final void rule__Event__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1031:1: ( rule__Event__Group_8__1__Impl )
            // InternalEventSetManagerDsl.g:1032:2: rule__Event__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__1"


    // $ANTLR start "rule__Event__Group_8__1__Impl"
    // InternalEventSetManagerDsl.g:1038:1: rule__Event__Group_8__1__Impl : ( ( rule__Event__WhenAssignment_8_1 ) ) ;
    public final void rule__Event__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1042:1: ( ( ( rule__Event__WhenAssignment_8_1 ) ) )
            // InternalEventSetManagerDsl.g:1043:1: ( ( rule__Event__WhenAssignment_8_1 ) )
            {
            // InternalEventSetManagerDsl.g:1043:1: ( ( rule__Event__WhenAssignment_8_1 ) )
            // InternalEventSetManagerDsl.g:1044:2: ( rule__Event__WhenAssignment_8_1 )
            {
             before(grammarAccess.getEventAccess().getWhenAssignment_8_1()); 
            // InternalEventSetManagerDsl.g:1045:2: ( rule__Event__WhenAssignment_8_1 )
            // InternalEventSetManagerDsl.g:1045:3: rule__Event__WhenAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__WhenAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getWhenAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_8__1__Impl"


    // $ANTLR start "rule__Event__Group_9__0"
    // InternalEventSetManagerDsl.g:1054:1: rule__Event__Group_9__0 : rule__Event__Group_9__0__Impl rule__Event__Group_9__1 ;
    public final void rule__Event__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1058:1: ( rule__Event__Group_9__0__Impl rule__Event__Group_9__1 )
            // InternalEventSetManagerDsl.g:1059:2: rule__Event__Group_9__0__Impl rule__Event__Group_9__1
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__0"


    // $ANTLR start "rule__Event__Group_9__0__Impl"
    // InternalEventSetManagerDsl.g:1066:1: rule__Event__Group_9__0__Impl : ( 'then' ) ;
    public final void rule__Event__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1070:1: ( ( 'then' ) )
            // InternalEventSetManagerDsl.g:1071:1: ( 'then' )
            {
            // InternalEventSetManagerDsl.g:1071:1: ( 'then' )
            // InternalEventSetManagerDsl.g:1072:2: 'then'
            {
             before(grammarAccess.getEventAccess().getThenKeyword_9_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getThenKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__0__Impl"


    // $ANTLR start "rule__Event__Group_9__1"
    // InternalEventSetManagerDsl.g:1081:1: rule__Event__Group_9__1 : rule__Event__Group_9__1__Impl rule__Event__Group_9__2 ;
    public final void rule__Event__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1085:1: ( rule__Event__Group_9__1__Impl rule__Event__Group_9__2 )
            // InternalEventSetManagerDsl.g:1086:2: rule__Event__Group_9__1__Impl rule__Event__Group_9__2
            {
            pushFollow(FOLLOW_5);
            rule__Event__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__1"


    // $ANTLR start "rule__Event__Group_9__1__Impl"
    // InternalEventSetManagerDsl.g:1093:1: rule__Event__Group_9__1__Impl : ( ( rule__Event__TriggersAssignment_9_1 ) ) ;
    public final void rule__Event__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1097:1: ( ( ( rule__Event__TriggersAssignment_9_1 ) ) )
            // InternalEventSetManagerDsl.g:1098:1: ( ( rule__Event__TriggersAssignment_9_1 ) )
            {
            // InternalEventSetManagerDsl.g:1098:1: ( ( rule__Event__TriggersAssignment_9_1 ) )
            // InternalEventSetManagerDsl.g:1099:2: ( rule__Event__TriggersAssignment_9_1 )
            {
             before(grammarAccess.getEventAccess().getTriggersAssignment_9_1()); 
            // InternalEventSetManagerDsl.g:1100:2: ( rule__Event__TriggersAssignment_9_1 )
            // InternalEventSetManagerDsl.g:1100:3: rule__Event__TriggersAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__TriggersAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getTriggersAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__1__Impl"


    // $ANTLR start "rule__Event__Group_9__2"
    // InternalEventSetManagerDsl.g:1108:1: rule__Event__Group_9__2 : rule__Event__Group_9__2__Impl ;
    public final void rule__Event__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1112:1: ( rule__Event__Group_9__2__Impl )
            // InternalEventSetManagerDsl.g:1113:2: rule__Event__Group_9__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__2"


    // $ANTLR start "rule__Event__Group_9__2__Impl"
    // InternalEventSetManagerDsl.g:1119:1: rule__Event__Group_9__2__Impl : ( ( rule__Event__TriggersAssignment_9_2 )* ) ;
    public final void rule__Event__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1123:1: ( ( ( rule__Event__TriggersAssignment_9_2 )* ) )
            // InternalEventSetManagerDsl.g:1124:1: ( ( rule__Event__TriggersAssignment_9_2 )* )
            {
            // InternalEventSetManagerDsl.g:1124:1: ( ( rule__Event__TriggersAssignment_9_2 )* )
            // InternalEventSetManagerDsl.g:1125:2: ( rule__Event__TriggersAssignment_9_2 )*
            {
             before(grammarAccess.getEventAccess().getTriggersAssignment_9_2()); 
            // InternalEventSetManagerDsl.g:1126:2: ( rule__Event__TriggersAssignment_9_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_ID)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:1126:3: rule__Event__TriggersAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Event__TriggersAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getTriggersAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_9__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalEventSetManagerDsl.g:1135:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1139:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalEventSetManagerDsl.g:1140:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__BinaryExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0"


    // $ANTLR start "rule__BinaryExpression__Group__0__Impl"
    // InternalEventSetManagerDsl.g:1147:1: rule__BinaryExpression__Group__0__Impl : ( ( rule__BinaryExpression__LeftAssignment_0 ) ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1151:1: ( ( ( rule__BinaryExpression__LeftAssignment_0 ) ) )
            // InternalEventSetManagerDsl.g:1152:1: ( ( rule__BinaryExpression__LeftAssignment_0 ) )
            {
            // InternalEventSetManagerDsl.g:1152:1: ( ( rule__BinaryExpression__LeftAssignment_0 ) )
            // InternalEventSetManagerDsl.g:1153:2: ( rule__BinaryExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftAssignment_0()); 
            // InternalEventSetManagerDsl.g:1154:2: ( rule__BinaryExpression__LeftAssignment_0 )
            // InternalEventSetManagerDsl.g:1154:3: rule__BinaryExpression__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__0__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__1"
    // InternalEventSetManagerDsl.g:1162:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1166:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalEventSetManagerDsl.g:1167:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__BinaryExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1"


    // $ANTLR start "rule__BinaryExpression__Group__1__Impl"
    // InternalEventSetManagerDsl.g:1174:1: rule__BinaryExpression__Group__1__Impl : ( '=' ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1178:1: ( ( '=' ) )
            // InternalEventSetManagerDsl.g:1179:1: ( '=' )
            {
            // InternalEventSetManagerDsl.g:1179:1: ( '=' )
            // InternalEventSetManagerDsl.g:1180:2: '='
            {
             before(grammarAccess.getBinaryExpressionAccess().getEqualsSignKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBinaryExpressionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__1__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__2"
    // InternalEventSetManagerDsl.g:1189:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1193:1: ( rule__BinaryExpression__Group__2__Impl )
            // InternalEventSetManagerDsl.g:1194:2: rule__BinaryExpression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2"


    // $ANTLR start "rule__BinaryExpression__Group__2__Impl"
    // InternalEventSetManagerDsl.g:1200:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__RightAssignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1204:1: ( ( ( rule__BinaryExpression__RightAssignment_2 ) ) )
            // InternalEventSetManagerDsl.g:1205:1: ( ( rule__BinaryExpression__RightAssignment_2 ) )
            {
            // InternalEventSetManagerDsl.g:1205:1: ( ( rule__BinaryExpression__RightAssignment_2 ) )
            // InternalEventSetManagerDsl.g:1206:2: ( rule__BinaryExpression__RightAssignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightAssignment_2()); 
            // InternalEventSetManagerDsl.g:1207:2: ( rule__BinaryExpression__RightAssignment_2 )
            // InternalEventSetManagerDsl.g:1207:3: rule__BinaryExpression__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryExpression__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryExpressionAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__Group__2__Impl"


    // $ANTLR start "rule__KeyConcept__Group__0"
    // InternalEventSetManagerDsl.g:1216:1: rule__KeyConcept__Group__0 : rule__KeyConcept__Group__0__Impl rule__KeyConcept__Group__1 ;
    public final void rule__KeyConcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1220:1: ( rule__KeyConcept__Group__0__Impl rule__KeyConcept__Group__1 )
            // InternalEventSetManagerDsl.g:1221:2: rule__KeyConcept__Group__0__Impl rule__KeyConcept__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__KeyConcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyConcept__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyConcept__Group__0"


    // $ANTLR start "rule__KeyConcept__Group__0__Impl"
    // InternalEventSetManagerDsl.g:1228:1: rule__KeyConcept__Group__0__Impl : ( () ) ;
    public final void rule__KeyConcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1232:1: ( ( () ) )
            // InternalEventSetManagerDsl.g:1233:1: ( () )
            {
            // InternalEventSetManagerDsl.g:1233:1: ( () )
            // InternalEventSetManagerDsl.g:1234:2: ()
            {
             before(grammarAccess.getKeyConceptAccess().getKeyConceptAction_0()); 
            // InternalEventSetManagerDsl.g:1235:2: ()
            // InternalEventSetManagerDsl.g:1235:3: 
            {
            }

             after(grammarAccess.getKeyConceptAccess().getKeyConceptAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyConcept__Group__0__Impl"


    // $ANTLR start "rule__KeyConcept__Group__1"
    // InternalEventSetManagerDsl.g:1243:1: rule__KeyConcept__Group__1 : rule__KeyConcept__Group__1__Impl rule__KeyConcept__Group__2 ;
    public final void rule__KeyConcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1247:1: ( rule__KeyConcept__Group__1__Impl rule__KeyConcept__Group__2 )
            // InternalEventSetManagerDsl.g:1248:2: rule__KeyConcept__Group__1__Impl rule__KeyConcept__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__KeyConcept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__KeyConcept__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyConcept__Group__1"


    // $ANTLR start "rule__KeyConcept__Group__1__Impl"
    // InternalEventSetManagerDsl.g:1255:1: rule__KeyConcept__Group__1__Impl : ( ( rule__KeyConcept__TypeAssignment_1 ) ) ;
    public final void rule__KeyConcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1259:1: ( ( ( rule__KeyConcept__TypeAssignment_1 ) ) )
            // InternalEventSetManagerDsl.g:1260:1: ( ( rule__KeyConcept__TypeAssignment_1 ) )
            {
            // InternalEventSetManagerDsl.g:1260:1: ( ( rule__KeyConcept__TypeAssignment_1 ) )
            // InternalEventSetManagerDsl.g:1261:2: ( rule__KeyConcept__TypeAssignment_1 )
            {
             before(grammarAccess.getKeyConceptAccess().getTypeAssignment_1()); 
            // InternalEventSetManagerDsl.g:1262:2: ( rule__KeyConcept__TypeAssignment_1 )
            // InternalEventSetManagerDsl.g:1262:3: rule__KeyConcept__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__KeyConcept__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyConceptAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyConcept__Group__1__Impl"


    // $ANTLR start "rule__KeyConcept__Group__2"
    // InternalEventSetManagerDsl.g:1270:1: rule__KeyConcept__Group__2 : rule__KeyConcept__Group__2__Impl ;
    public final void rule__KeyConcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1274:1: ( rule__KeyConcept__Group__2__Impl )
            // InternalEventSetManagerDsl.g:1275:2: rule__KeyConcept__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__KeyConcept__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyConcept__Group__2"


    // $ANTLR start "rule__KeyConcept__Group__2__Impl"
    // InternalEventSetManagerDsl.g:1281:1: rule__KeyConcept__Group__2__Impl : ( ( rule__KeyConcept__NameAssignment_2 ) ) ;
    public final void rule__KeyConcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1285:1: ( ( ( rule__KeyConcept__NameAssignment_2 ) ) )
            // InternalEventSetManagerDsl.g:1286:1: ( ( rule__KeyConcept__NameAssignment_2 ) )
            {
            // InternalEventSetManagerDsl.g:1286:1: ( ( rule__KeyConcept__NameAssignment_2 ) )
            // InternalEventSetManagerDsl.g:1287:2: ( rule__KeyConcept__NameAssignment_2 )
            {
             before(grammarAccess.getKeyConceptAccess().getNameAssignment_2()); 
            // InternalEventSetManagerDsl.g:1288:2: ( rule__KeyConcept__NameAssignment_2 )
            // InternalEventSetManagerDsl.g:1288:3: rule__KeyConcept__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__KeyConcept__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getKeyConceptAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyConcept__Group__2__Impl"


    // $ANTLR start "rule__RegexConcept__Group__0"
    // InternalEventSetManagerDsl.g:1297:1: rule__RegexConcept__Group__0 : rule__RegexConcept__Group__0__Impl rule__RegexConcept__Group__1 ;
    public final void rule__RegexConcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1301:1: ( rule__RegexConcept__Group__0__Impl rule__RegexConcept__Group__1 )
            // InternalEventSetManagerDsl.g:1302:2: rule__RegexConcept__Group__0__Impl rule__RegexConcept__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RegexConcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegexConcept__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__0"


    // $ANTLR start "rule__RegexConcept__Group__0__Impl"
    // InternalEventSetManagerDsl.g:1309:1: rule__RegexConcept__Group__0__Impl : ( () ) ;
    public final void rule__RegexConcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1313:1: ( ( () ) )
            // InternalEventSetManagerDsl.g:1314:1: ( () )
            {
            // InternalEventSetManagerDsl.g:1314:1: ( () )
            // InternalEventSetManagerDsl.g:1315:2: ()
            {
             before(grammarAccess.getRegexConceptAccess().getRegexConceptAction_0()); 
            // InternalEventSetManagerDsl.g:1316:2: ()
            // InternalEventSetManagerDsl.g:1316:3: 
            {
            }

             after(grammarAccess.getRegexConceptAccess().getRegexConceptAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__0__Impl"


    // $ANTLR start "rule__RegexConcept__Group__1"
    // InternalEventSetManagerDsl.g:1324:1: rule__RegexConcept__Group__1 : rule__RegexConcept__Group__1__Impl rule__RegexConcept__Group__2 ;
    public final void rule__RegexConcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1328:1: ( rule__RegexConcept__Group__1__Impl rule__RegexConcept__Group__2 )
            // InternalEventSetManagerDsl.g:1329:2: rule__RegexConcept__Group__1__Impl rule__RegexConcept__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__RegexConcept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegexConcept__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__1"


    // $ANTLR start "rule__RegexConcept__Group__1__Impl"
    // InternalEventSetManagerDsl.g:1336:1: rule__RegexConcept__Group__1__Impl : ( ( rule__RegexConcept__TypeAssignment_1 ) ) ;
    public final void rule__RegexConcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1340:1: ( ( ( rule__RegexConcept__TypeAssignment_1 ) ) )
            // InternalEventSetManagerDsl.g:1341:1: ( ( rule__RegexConcept__TypeAssignment_1 ) )
            {
            // InternalEventSetManagerDsl.g:1341:1: ( ( rule__RegexConcept__TypeAssignment_1 ) )
            // InternalEventSetManagerDsl.g:1342:2: ( rule__RegexConcept__TypeAssignment_1 )
            {
             before(grammarAccess.getRegexConceptAccess().getTypeAssignment_1()); 
            // InternalEventSetManagerDsl.g:1343:2: ( rule__RegexConcept__TypeAssignment_1 )
            // InternalEventSetManagerDsl.g:1343:3: rule__RegexConcept__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RegexConcept__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegexConceptAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__1__Impl"


    // $ANTLR start "rule__RegexConcept__Group__2"
    // InternalEventSetManagerDsl.g:1351:1: rule__RegexConcept__Group__2 : rule__RegexConcept__Group__2__Impl rule__RegexConcept__Group__3 ;
    public final void rule__RegexConcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1355:1: ( rule__RegexConcept__Group__2__Impl rule__RegexConcept__Group__3 )
            // InternalEventSetManagerDsl.g:1356:2: rule__RegexConcept__Group__2__Impl rule__RegexConcept__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__RegexConcept__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegexConcept__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__2"


    // $ANTLR start "rule__RegexConcept__Group__2__Impl"
    // InternalEventSetManagerDsl.g:1363:1: rule__RegexConcept__Group__2__Impl : ( ( rule__RegexConcept__NameAssignment_2 ) ) ;
    public final void rule__RegexConcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1367:1: ( ( ( rule__RegexConcept__NameAssignment_2 ) ) )
            // InternalEventSetManagerDsl.g:1368:1: ( ( rule__RegexConcept__NameAssignment_2 ) )
            {
            // InternalEventSetManagerDsl.g:1368:1: ( ( rule__RegexConcept__NameAssignment_2 ) )
            // InternalEventSetManagerDsl.g:1369:2: ( rule__RegexConcept__NameAssignment_2 )
            {
             before(grammarAccess.getRegexConceptAccess().getNameAssignment_2()); 
            // InternalEventSetManagerDsl.g:1370:2: ( rule__RegexConcept__NameAssignment_2 )
            // InternalEventSetManagerDsl.g:1370:3: rule__RegexConcept__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegexConcept__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegexConceptAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__2__Impl"


    // $ANTLR start "rule__RegexConcept__Group__3"
    // InternalEventSetManagerDsl.g:1378:1: rule__RegexConcept__Group__3 : rule__RegexConcept__Group__3__Impl rule__RegexConcept__Group__4 ;
    public final void rule__RegexConcept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1382:1: ( rule__RegexConcept__Group__3__Impl rule__RegexConcept__Group__4 )
            // InternalEventSetManagerDsl.g:1383:2: rule__RegexConcept__Group__3__Impl rule__RegexConcept__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RegexConcept__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegexConcept__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__3"


    // $ANTLR start "rule__RegexConcept__Group__3__Impl"
    // InternalEventSetManagerDsl.g:1390:1: rule__RegexConcept__Group__3__Impl : ( '=' ) ;
    public final void rule__RegexConcept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1394:1: ( ( '=' ) )
            // InternalEventSetManagerDsl.g:1395:1: ( '=' )
            {
            // InternalEventSetManagerDsl.g:1395:1: ( '=' )
            // InternalEventSetManagerDsl.g:1396:2: '='
            {
             before(grammarAccess.getRegexConceptAccess().getEqualsSignKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRegexConceptAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__3__Impl"


    // $ANTLR start "rule__RegexConcept__Group__4"
    // InternalEventSetManagerDsl.g:1405:1: rule__RegexConcept__Group__4 : rule__RegexConcept__Group__4__Impl ;
    public final void rule__RegexConcept__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1409:1: ( rule__RegexConcept__Group__4__Impl )
            // InternalEventSetManagerDsl.g:1410:2: rule__RegexConcept__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegexConcept__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__4"


    // $ANTLR start "rule__RegexConcept__Group__4__Impl"
    // InternalEventSetManagerDsl.g:1416:1: rule__RegexConcept__Group__4__Impl : ( ( rule__RegexConcept__RegexAssignment_4 ) ) ;
    public final void rule__RegexConcept__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1420:1: ( ( ( rule__RegexConcept__RegexAssignment_4 ) ) )
            // InternalEventSetManagerDsl.g:1421:1: ( ( rule__RegexConcept__RegexAssignment_4 ) )
            {
            // InternalEventSetManagerDsl.g:1421:1: ( ( rule__RegexConcept__RegexAssignment_4 ) )
            // InternalEventSetManagerDsl.g:1422:2: ( rule__RegexConcept__RegexAssignment_4 )
            {
             before(grammarAccess.getRegexConceptAccess().getRegexAssignment_4()); 
            // InternalEventSetManagerDsl.g:1423:2: ( rule__RegexConcept__RegexAssignment_4 )
            // InternalEventSetManagerDsl.g:1423:3: rule__RegexConcept__RegexAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RegexConcept__RegexAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRegexConceptAccess().getRegexAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__Group__4__Impl"


    // $ANTLR start "rule__Action__Group__0"
    // InternalEventSetManagerDsl.g:1432:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1436:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // InternalEventSetManagerDsl.g:1437:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0"


    // $ANTLR start "rule__Action__Group__0__Impl"
    // InternalEventSetManagerDsl.g:1444:1: rule__Action__Group__0__Impl : ( () ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1448:1: ( ( () ) )
            // InternalEventSetManagerDsl.g:1449:1: ( () )
            {
            // InternalEventSetManagerDsl.g:1449:1: ( () )
            // InternalEventSetManagerDsl.g:1450:2: ()
            {
             before(grammarAccess.getActionAccess().getActionAction_0()); 
            // InternalEventSetManagerDsl.g:1451:2: ()
            // InternalEventSetManagerDsl.g:1451:3: 
            {
            }

             after(grammarAccess.getActionAccess().getActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__0__Impl"


    // $ANTLR start "rule__Action__Group__1"
    // InternalEventSetManagerDsl.g:1459:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1463:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // InternalEventSetManagerDsl.g:1464:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1"


    // $ANTLR start "rule__Action__Group__1__Impl"
    // InternalEventSetManagerDsl.g:1471:1: rule__Action__Group__1__Impl : ( ( rule__Action__CallsAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1475:1: ( ( ( rule__Action__CallsAssignment_1 ) ) )
            // InternalEventSetManagerDsl.g:1476:1: ( ( rule__Action__CallsAssignment_1 ) )
            {
            // InternalEventSetManagerDsl.g:1476:1: ( ( rule__Action__CallsAssignment_1 ) )
            // InternalEventSetManagerDsl.g:1477:2: ( rule__Action__CallsAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getCallsAssignment_1()); 
            // InternalEventSetManagerDsl.g:1478:2: ( rule__Action__CallsAssignment_1 )
            // InternalEventSetManagerDsl.g:1478:3: rule__Action__CallsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__CallsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getCallsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__1__Impl"


    // $ANTLR start "rule__Action__Group__2"
    // InternalEventSetManagerDsl.g:1486:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1490:1: ( rule__Action__Group__2__Impl )
            // InternalEventSetManagerDsl.g:1491:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2"


    // $ANTLR start "rule__Action__Group__2__Impl"
    // InternalEventSetManagerDsl.g:1497:1: rule__Action__Group__2__Impl : ( ( rule__Action__Group_2__0 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1501:1: ( ( ( rule__Action__Group_2__0 )? ) )
            // InternalEventSetManagerDsl.g:1502:1: ( ( rule__Action__Group_2__0 )? )
            {
            // InternalEventSetManagerDsl.g:1502:1: ( ( rule__Action__Group_2__0 )? )
            // InternalEventSetManagerDsl.g:1503:2: ( rule__Action__Group_2__0 )?
            {
             before(grammarAccess.getActionAccess().getGroup_2()); 
            // InternalEventSetManagerDsl.g:1504:2: ( rule__Action__Group_2__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEventSetManagerDsl.g:1504:3: rule__Action__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group__2__Impl"


    // $ANTLR start "rule__Action__Group_2__0"
    // InternalEventSetManagerDsl.g:1513:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1517:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalEventSetManagerDsl.g:1518:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Action__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0"


    // $ANTLR start "rule__Action__Group_2__0__Impl"
    // InternalEventSetManagerDsl.g:1525:1: rule__Action__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1529:1: ( ( '(' ) )
            // InternalEventSetManagerDsl.g:1530:1: ( '(' )
            {
            // InternalEventSetManagerDsl.g:1530:1: ( '(' )
            // InternalEventSetManagerDsl.g:1531:2: '('
            {
             before(grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2__1"
    // InternalEventSetManagerDsl.g:1540:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl rule__Action__Group_2__2 ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1544:1: ( rule__Action__Group_2__1__Impl rule__Action__Group_2__2 )
            // InternalEventSetManagerDsl.g:1545:2: rule__Action__Group_2__1__Impl rule__Action__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__Action__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1"


    // $ANTLR start "rule__Action__Group_2__1__Impl"
    // InternalEventSetManagerDsl.g:1552:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__ParamsAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1556:1: ( ( ( rule__Action__ParamsAssignment_2_1 ) ) )
            // InternalEventSetManagerDsl.g:1557:1: ( ( rule__Action__ParamsAssignment_2_1 ) )
            {
            // InternalEventSetManagerDsl.g:1557:1: ( ( rule__Action__ParamsAssignment_2_1 ) )
            // InternalEventSetManagerDsl.g:1558:2: ( rule__Action__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getParamsAssignment_2_1()); 
            // InternalEventSetManagerDsl.g:1559:2: ( rule__Action__ParamsAssignment_2_1 )
            // InternalEventSetManagerDsl.g:1559:3: rule__Action__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__1__Impl"


    // $ANTLR start "rule__Action__Group_2__2"
    // InternalEventSetManagerDsl.g:1567:1: rule__Action__Group_2__2 : rule__Action__Group_2__2__Impl rule__Action__Group_2__3 ;
    public final void rule__Action__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1571:1: ( rule__Action__Group_2__2__Impl rule__Action__Group_2__3 )
            // InternalEventSetManagerDsl.g:1572:2: rule__Action__Group_2__2__Impl rule__Action__Group_2__3
            {
            pushFollow(FOLLOW_17);
            rule__Action__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2"


    // $ANTLR start "rule__Action__Group_2__2__Impl"
    // InternalEventSetManagerDsl.g:1579:1: rule__Action__Group_2__2__Impl : ( ( rule__Action__Group_2_2__0 )* ) ;
    public final void rule__Action__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1583:1: ( ( ( rule__Action__Group_2_2__0 )* ) )
            // InternalEventSetManagerDsl.g:1584:1: ( ( rule__Action__Group_2_2__0 )* )
            {
            // InternalEventSetManagerDsl.g:1584:1: ( ( rule__Action__Group_2_2__0 )* )
            // InternalEventSetManagerDsl.g:1585:2: ( rule__Action__Group_2_2__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_2_2()); 
            // InternalEventSetManagerDsl.g:1586:2: ( rule__Action__Group_2_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:1586:3: rule__Action__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Action__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__2__Impl"


    // $ANTLR start "rule__Action__Group_2__3"
    // InternalEventSetManagerDsl.g:1594:1: rule__Action__Group_2__3 : rule__Action__Group_2__3__Impl ;
    public final void rule__Action__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1598:1: ( rule__Action__Group_2__3__Impl )
            // InternalEventSetManagerDsl.g:1599:2: rule__Action__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__3"


    // $ANTLR start "rule__Action__Group_2__3__Impl"
    // InternalEventSetManagerDsl.g:1605:1: rule__Action__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Action__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1609:1: ( ( ')' ) )
            // InternalEventSetManagerDsl.g:1610:1: ( ')' )
            {
            // InternalEventSetManagerDsl.g:1610:1: ( ')' )
            // InternalEventSetManagerDsl.g:1611:2: ')'
            {
             before(grammarAccess.getActionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2__3__Impl"


    // $ANTLR start "rule__Action__Group_2_2__0"
    // InternalEventSetManagerDsl.g:1621:1: rule__Action__Group_2_2__0 : rule__Action__Group_2_2__0__Impl rule__Action__Group_2_2__1 ;
    public final void rule__Action__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1625:1: ( rule__Action__Group_2_2__0__Impl rule__Action__Group_2_2__1 )
            // InternalEventSetManagerDsl.g:1626:2: rule__Action__Group_2_2__0__Impl rule__Action__Group_2_2__1
            {
            pushFollow(FOLLOW_5);
            rule__Action__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2_2__0"


    // $ANTLR start "rule__Action__Group_2_2__0__Impl"
    // InternalEventSetManagerDsl.g:1633:1: rule__Action__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Action__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1637:1: ( ( ',' ) )
            // InternalEventSetManagerDsl.g:1638:1: ( ',' )
            {
            // InternalEventSetManagerDsl.g:1638:1: ( ',' )
            // InternalEventSetManagerDsl.g:1639:2: ','
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2_2__1"
    // InternalEventSetManagerDsl.g:1648:1: rule__Action__Group_2_2__1 : rule__Action__Group_2_2__1__Impl ;
    public final void rule__Action__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1652:1: ( rule__Action__Group_2_2__1__Impl )
            // InternalEventSetManagerDsl.g:1653:2: rule__Action__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2_2__1"


    // $ANTLR start "rule__Action__Group_2_2__1__Impl"
    // InternalEventSetManagerDsl.g:1659:1: rule__Action__Group_2_2__1__Impl : ( ( rule__Action__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__Action__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1663:1: ( ( ( rule__Action__ParamsAssignment_2_2_1 ) ) )
            // InternalEventSetManagerDsl.g:1664:1: ( ( rule__Action__ParamsAssignment_2_2_1 ) )
            {
            // InternalEventSetManagerDsl.g:1664:1: ( ( rule__Action__ParamsAssignment_2_2_1 ) )
            // InternalEventSetManagerDsl.g:1665:2: ( rule__Action__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getActionAccess().getParamsAssignment_2_2_1()); 
            // InternalEventSetManagerDsl.g:1666:2: ( rule__Action__ParamsAssignment_2_2_1 )
            // InternalEventSetManagerDsl.g:1666:3: rule__Action__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getParamsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_2_2__1__Impl"


    // $ANTLR start "rule__ConceptParam__Group__0"
    // InternalEventSetManagerDsl.g:1675:1: rule__ConceptParam__Group__0 : rule__ConceptParam__Group__0__Impl rule__ConceptParam__Group__1 ;
    public final void rule__ConceptParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1679:1: ( rule__ConceptParam__Group__0__Impl rule__ConceptParam__Group__1 )
            // InternalEventSetManagerDsl.g:1680:2: rule__ConceptParam__Group__0__Impl rule__ConceptParam__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ConceptParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConceptParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__Group__0"


    // $ANTLR start "rule__ConceptParam__Group__0__Impl"
    // InternalEventSetManagerDsl.g:1687:1: rule__ConceptParam__Group__0__Impl : ( () ) ;
    public final void rule__ConceptParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1691:1: ( ( () ) )
            // InternalEventSetManagerDsl.g:1692:1: ( () )
            {
            // InternalEventSetManagerDsl.g:1692:1: ( () )
            // InternalEventSetManagerDsl.g:1693:2: ()
            {
             before(grammarAccess.getConceptParamAccess().getConceptParamAction_0()); 
            // InternalEventSetManagerDsl.g:1694:2: ()
            // InternalEventSetManagerDsl.g:1694:3: 
            {
            }

             after(grammarAccess.getConceptParamAccess().getConceptParamAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__Group__0__Impl"


    // $ANTLR start "rule__ConceptParam__Group__1"
    // InternalEventSetManagerDsl.g:1702:1: rule__ConceptParam__Group__1 : rule__ConceptParam__Group__1__Impl rule__ConceptParam__Group__2 ;
    public final void rule__ConceptParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1706:1: ( rule__ConceptParam__Group__1__Impl rule__ConceptParam__Group__2 )
            // InternalEventSetManagerDsl.g:1707:2: rule__ConceptParam__Group__1__Impl rule__ConceptParam__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ConceptParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConceptParam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__Group__1"


    // $ANTLR start "rule__ConceptParam__Group__1__Impl"
    // InternalEventSetManagerDsl.g:1714:1: rule__ConceptParam__Group__1__Impl : ( ( rule__ConceptParam__KeyAssignment_1 ) ) ;
    public final void rule__ConceptParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1718:1: ( ( ( rule__ConceptParam__KeyAssignment_1 ) ) )
            // InternalEventSetManagerDsl.g:1719:1: ( ( rule__ConceptParam__KeyAssignment_1 ) )
            {
            // InternalEventSetManagerDsl.g:1719:1: ( ( rule__ConceptParam__KeyAssignment_1 ) )
            // InternalEventSetManagerDsl.g:1720:2: ( rule__ConceptParam__KeyAssignment_1 )
            {
             before(grammarAccess.getConceptParamAccess().getKeyAssignment_1()); 
            // InternalEventSetManagerDsl.g:1721:2: ( rule__ConceptParam__KeyAssignment_1 )
            // InternalEventSetManagerDsl.g:1721:3: rule__ConceptParam__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConceptParam__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConceptParamAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__Group__1__Impl"


    // $ANTLR start "rule__ConceptParam__Group__2"
    // InternalEventSetManagerDsl.g:1729:1: rule__ConceptParam__Group__2 : rule__ConceptParam__Group__2__Impl rule__ConceptParam__Group__3 ;
    public final void rule__ConceptParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1733:1: ( rule__ConceptParam__Group__2__Impl rule__ConceptParam__Group__3 )
            // InternalEventSetManagerDsl.g:1734:2: rule__ConceptParam__Group__2__Impl rule__ConceptParam__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ConceptParam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConceptParam__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__Group__2"


    // $ANTLR start "rule__ConceptParam__Group__2__Impl"
    // InternalEventSetManagerDsl.g:1741:1: rule__ConceptParam__Group__2__Impl : ( '<=' ) ;
    public final void rule__ConceptParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1745:1: ( ( '<=' ) )
            // InternalEventSetManagerDsl.g:1746:1: ( '<=' )
            {
            // InternalEventSetManagerDsl.g:1746:1: ( '<=' )
            // InternalEventSetManagerDsl.g:1747:2: '<='
            {
             before(grammarAccess.getConceptParamAccess().getLessThanSignEqualsSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getConceptParamAccess().getLessThanSignEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__Group__2__Impl"


    // $ANTLR start "rule__ConceptParam__Group__3"
    // InternalEventSetManagerDsl.g:1756:1: rule__ConceptParam__Group__3 : rule__ConceptParam__Group__3__Impl ;
    public final void rule__ConceptParam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1760:1: ( rule__ConceptParam__Group__3__Impl )
            // InternalEventSetManagerDsl.g:1761:2: rule__ConceptParam__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConceptParam__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__Group__3"


    // $ANTLR start "rule__ConceptParam__Group__3__Impl"
    // InternalEventSetManagerDsl.g:1767:1: rule__ConceptParam__Group__3__Impl : ( ( rule__ConceptParam__ValueAssignment_3 ) ) ;
    public final void rule__ConceptParam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1771:1: ( ( ( rule__ConceptParam__ValueAssignment_3 ) ) )
            // InternalEventSetManagerDsl.g:1772:1: ( ( rule__ConceptParam__ValueAssignment_3 ) )
            {
            // InternalEventSetManagerDsl.g:1772:1: ( ( rule__ConceptParam__ValueAssignment_3 ) )
            // InternalEventSetManagerDsl.g:1773:2: ( rule__ConceptParam__ValueAssignment_3 )
            {
             before(grammarAccess.getConceptParamAccess().getValueAssignment_3()); 
            // InternalEventSetManagerDsl.g:1774:2: ( rule__ConceptParam__ValueAssignment_3 )
            // InternalEventSetManagerDsl.g:1774:3: rule__ConceptParam__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ConceptParam__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConceptParamAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__Group__3__Impl"


    // $ANTLR start "rule__StringParam__Group__0"
    // InternalEventSetManagerDsl.g:1783:1: rule__StringParam__Group__0 : rule__StringParam__Group__0__Impl rule__StringParam__Group__1 ;
    public final void rule__StringParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1787:1: ( rule__StringParam__Group__0__Impl rule__StringParam__Group__1 )
            // InternalEventSetManagerDsl.g:1788:2: rule__StringParam__Group__0__Impl rule__StringParam__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__StringParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__Group__0"


    // $ANTLR start "rule__StringParam__Group__0__Impl"
    // InternalEventSetManagerDsl.g:1795:1: rule__StringParam__Group__0__Impl : ( () ) ;
    public final void rule__StringParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1799:1: ( ( () ) )
            // InternalEventSetManagerDsl.g:1800:1: ( () )
            {
            // InternalEventSetManagerDsl.g:1800:1: ( () )
            // InternalEventSetManagerDsl.g:1801:2: ()
            {
             before(grammarAccess.getStringParamAccess().getStringParamAction_0()); 
            // InternalEventSetManagerDsl.g:1802:2: ()
            // InternalEventSetManagerDsl.g:1802:3: 
            {
            }

             after(grammarAccess.getStringParamAccess().getStringParamAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__Group__0__Impl"


    // $ANTLR start "rule__StringParam__Group__1"
    // InternalEventSetManagerDsl.g:1810:1: rule__StringParam__Group__1 : rule__StringParam__Group__1__Impl rule__StringParam__Group__2 ;
    public final void rule__StringParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1814:1: ( rule__StringParam__Group__1__Impl rule__StringParam__Group__2 )
            // InternalEventSetManagerDsl.g:1815:2: rule__StringParam__Group__1__Impl rule__StringParam__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__StringParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringParam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__Group__1"


    // $ANTLR start "rule__StringParam__Group__1__Impl"
    // InternalEventSetManagerDsl.g:1822:1: rule__StringParam__Group__1__Impl : ( ( rule__StringParam__KeyAssignment_1 ) ) ;
    public final void rule__StringParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1826:1: ( ( ( rule__StringParam__KeyAssignment_1 ) ) )
            // InternalEventSetManagerDsl.g:1827:1: ( ( rule__StringParam__KeyAssignment_1 ) )
            {
            // InternalEventSetManagerDsl.g:1827:1: ( ( rule__StringParam__KeyAssignment_1 ) )
            // InternalEventSetManagerDsl.g:1828:2: ( rule__StringParam__KeyAssignment_1 )
            {
             before(grammarAccess.getStringParamAccess().getKeyAssignment_1()); 
            // InternalEventSetManagerDsl.g:1829:2: ( rule__StringParam__KeyAssignment_1 )
            // InternalEventSetManagerDsl.g:1829:3: rule__StringParam__KeyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringParam__KeyAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringParamAccess().getKeyAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__Group__1__Impl"


    // $ANTLR start "rule__StringParam__Group__2"
    // InternalEventSetManagerDsl.g:1837:1: rule__StringParam__Group__2 : rule__StringParam__Group__2__Impl rule__StringParam__Group__3 ;
    public final void rule__StringParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1841:1: ( rule__StringParam__Group__2__Impl rule__StringParam__Group__3 )
            // InternalEventSetManagerDsl.g:1842:2: rule__StringParam__Group__2__Impl rule__StringParam__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StringParam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringParam__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__Group__2"


    // $ANTLR start "rule__StringParam__Group__2__Impl"
    // InternalEventSetManagerDsl.g:1849:1: rule__StringParam__Group__2__Impl : ( '=' ) ;
    public final void rule__StringParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1853:1: ( ( '=' ) )
            // InternalEventSetManagerDsl.g:1854:1: ( '=' )
            {
            // InternalEventSetManagerDsl.g:1854:1: ( '=' )
            // InternalEventSetManagerDsl.g:1855:2: '='
            {
             before(grammarAccess.getStringParamAccess().getEqualsSignKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getStringParamAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__Group__2__Impl"


    // $ANTLR start "rule__StringParam__Group__3"
    // InternalEventSetManagerDsl.g:1864:1: rule__StringParam__Group__3 : rule__StringParam__Group__3__Impl ;
    public final void rule__StringParam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1868:1: ( rule__StringParam__Group__3__Impl )
            // InternalEventSetManagerDsl.g:1869:2: rule__StringParam__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringParam__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__Group__3"


    // $ANTLR start "rule__StringParam__Group__3__Impl"
    // InternalEventSetManagerDsl.g:1875:1: rule__StringParam__Group__3__Impl : ( ( rule__StringParam__ValueAssignment_3 ) ) ;
    public final void rule__StringParam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1879:1: ( ( ( rule__StringParam__ValueAssignment_3 ) ) )
            // InternalEventSetManagerDsl.g:1880:1: ( ( rule__StringParam__ValueAssignment_3 ) )
            {
            // InternalEventSetManagerDsl.g:1880:1: ( ( rule__StringParam__ValueAssignment_3 ) )
            // InternalEventSetManagerDsl.g:1881:2: ( rule__StringParam__ValueAssignment_3 )
            {
             before(grammarAccess.getStringParamAccess().getValueAssignment_3()); 
            // InternalEventSetManagerDsl.g:1882:2: ( rule__StringParam__ValueAssignment_3 )
            // InternalEventSetManagerDsl.g:1882:3: rule__StringParam__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StringParam__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringParamAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__Group__3__Impl"


    // $ANTLR start "rule__EventSetManager__EventsAssignment_0"
    // InternalEventSetManagerDsl.g:1891:1: rule__EventSetManager__EventsAssignment_0 : ( ruleEvent ) ;
    public final void rule__EventSetManager__EventsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1895:1: ( ( ruleEvent ) )
            // InternalEventSetManagerDsl.g:1896:2: ( ruleEvent )
            {
            // InternalEventSetManagerDsl.g:1896:2: ( ruleEvent )
            // InternalEventSetManagerDsl.g:1897:3: ruleEvent
            {
             before(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSetManager__EventsAssignment_0"


    // $ANTLR start "rule__EventSetManager__EventsAssignment_1"
    // InternalEventSetManagerDsl.g:1906:1: rule__EventSetManager__EventsAssignment_1 : ( ruleEvent ) ;
    public final void rule__EventSetManager__EventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1910:1: ( ( ruleEvent ) )
            // InternalEventSetManagerDsl.g:1911:2: ( ruleEvent )
            {
            // InternalEventSetManagerDsl.g:1911:2: ( ruleEvent )
            // InternalEventSetManagerDsl.g:1912:3: ruleEvent
            {
             before(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventSetManagerAccess().getEventsEventParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventSetManager__EventsAssignment_1"


    // $ANTLR start "rule__Event__DataconnectionAssignment_1_1"
    // InternalEventSetManagerDsl.g:1921:1: rule__Event__DataconnectionAssignment_1_1 : ( ruleEString ) ;
    public final void rule__Event__DataconnectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1925:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1926:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1926:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1927:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getDataconnectionEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getDataconnectionEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__DataconnectionAssignment_1_1"


    // $ANTLR start "rule__Event__DataconnectionAssignment_1_2_1"
    // InternalEventSetManagerDsl.g:1936:1: rule__Event__DataconnectionAssignment_1_2_1 : ( ruleEString ) ;
    public final void rule__Event__DataconnectionAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1940:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1941:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1941:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1942:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getDataconnectionEStringParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getDataconnectionEStringParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__DataconnectionAssignment_1_2_1"


    // $ANTLR start "rule__Event__NameAssignment_3"
    // InternalEventSetManagerDsl.g:1951:1: rule__Event__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Event__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1955:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1956:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1956:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1957:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_3"


    // $ANTLR start "rule__Event__ConceptsAssignment_5"
    // InternalEventSetManagerDsl.g:1966:1: rule__Event__ConceptsAssignment_5 : ( ruleConcept ) ;
    public final void rule__Event__ConceptsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1970:1: ( ( ruleConcept ) )
            // InternalEventSetManagerDsl.g:1971:2: ( ruleConcept )
            {
            // InternalEventSetManagerDsl.g:1971:2: ( ruleConcept )
            // InternalEventSetManagerDsl.g:1972:3: ruleConcept
            {
             before(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ConceptsAssignment_5"


    // $ANTLR start "rule__Event__ConceptsAssignment_6"
    // InternalEventSetManagerDsl.g:1981:1: rule__Event__ConceptsAssignment_6 : ( ruleConcept ) ;
    public final void rule__Event__ConceptsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1985:1: ( ( ruleConcept ) )
            // InternalEventSetManagerDsl.g:1986:2: ( ruleConcept )
            {
            // InternalEventSetManagerDsl.g:1986:2: ( ruleConcept )
            // InternalEventSetManagerDsl.g:1987:3: ruleConcept
            {
             before(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getEventAccess().getConceptsConceptParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ConceptsAssignment_6"


    // $ANTLR start "rule__Event__WhenAssignment_8_1"
    // InternalEventSetManagerDsl.g:1996:1: rule__Event__WhenAssignment_8_1 : ( ruleCondition ) ;
    public final void rule__Event__WhenAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2000:1: ( ( ruleCondition ) )
            // InternalEventSetManagerDsl.g:2001:2: ( ruleCondition )
            {
            // InternalEventSetManagerDsl.g:2001:2: ( ruleCondition )
            // InternalEventSetManagerDsl.g:2002:3: ruleCondition
            {
             before(grammarAccess.getEventAccess().getWhenConditionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getEventAccess().getWhenConditionParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__WhenAssignment_8_1"


    // $ANTLR start "rule__Event__TriggersAssignment_9_1"
    // InternalEventSetManagerDsl.g:2011:1: rule__Event__TriggersAssignment_9_1 : ( ruleAction ) ;
    public final void rule__Event__TriggersAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2015:1: ( ( ruleAction ) )
            // InternalEventSetManagerDsl.g:2016:2: ( ruleAction )
            {
            // InternalEventSetManagerDsl.g:2016:2: ( ruleAction )
            // InternalEventSetManagerDsl.g:2017:3: ruleAction
            {
             before(grammarAccess.getEventAccess().getTriggersActionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTriggersActionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TriggersAssignment_9_1"


    // $ANTLR start "rule__Event__TriggersAssignment_9_2"
    // InternalEventSetManagerDsl.g:2026:1: rule__Event__TriggersAssignment_9_2 : ( ruleAction ) ;
    public final void rule__Event__TriggersAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2030:1: ( ( ruleAction ) )
            // InternalEventSetManagerDsl.g:2031:2: ( ruleAction )
            {
            // InternalEventSetManagerDsl.g:2031:2: ( ruleAction )
            // InternalEventSetManagerDsl.g:2032:3: ruleAction
            {
             before(grammarAccess.getEventAccess().getTriggersActionParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getEventAccess().getTriggersActionParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TriggersAssignment_9_2"


    // $ANTLR start "rule__BinaryExpression__LeftAssignment_0"
    // InternalEventSetManagerDsl.g:2041:1: rule__BinaryExpression__LeftAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__BinaryExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2045:1: ( ( ( ruleEString ) ) )
            // InternalEventSetManagerDsl.g:2046:2: ( ( ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:2046:2: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:2047:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftConceptCrossReference_0_0()); 
            // InternalEventSetManagerDsl.g:2048:3: ( ruleEString )
            // InternalEventSetManagerDsl.g:2049:4: ruleEString
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftConceptEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getLeftConceptEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBinaryExpressionAccess().getLeftConceptCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__LeftAssignment_0"


    // $ANTLR start "rule__BinaryExpression__RightAssignment_2"
    // InternalEventSetManagerDsl.g:2060:1: rule__BinaryExpression__RightAssignment_2 : ( ruleLiteral ) ;
    public final void rule__BinaryExpression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2064:1: ( ( ruleLiteral ) )
            // InternalEventSetManagerDsl.g:2065:2: ( ruleLiteral )
            {
            // InternalEventSetManagerDsl.g:2065:2: ( ruleLiteral )
            // InternalEventSetManagerDsl.g:2066:3: ruleLiteral
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getBinaryExpressionAccess().getRightLiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryExpression__RightAssignment_2"


    // $ANTLR start "rule__Literal__ValueAssignment"
    // InternalEventSetManagerDsl.g:2075:1: rule__Literal__ValueAssignment : ( ruleEString ) ;
    public final void rule__Literal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2079:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:2080:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:2080:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:2081:3: ruleEString
            {
             before(grammarAccess.getLiteralAccess().getValueEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getValueEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment"


    // $ANTLR start "rule__BooleanExpression__ExpressionAssignment"
    // InternalEventSetManagerDsl.g:2090:1: rule__BooleanExpression__ExpressionAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanExpression__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2094:1: ( ( RULE_BOOLEAN ) )
            // InternalEventSetManagerDsl.g:2095:2: ( RULE_BOOLEAN )
            {
            // InternalEventSetManagerDsl.g:2095:2: ( RULE_BOOLEAN )
            // InternalEventSetManagerDsl.g:2096:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanExpressionAccess().getExpressionBOOLEANTerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBooleanExpressionAccess().getExpressionBOOLEANTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanExpression__ExpressionAssignment"


    // $ANTLR start "rule__KeyConcept__TypeAssignment_1"
    // InternalEventSetManagerDsl.g:2105:1: rule__KeyConcept__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__KeyConcept__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2109:1: ( ( ruleType ) )
            // InternalEventSetManagerDsl.g:2110:2: ( ruleType )
            {
            // InternalEventSetManagerDsl.g:2110:2: ( ruleType )
            // InternalEventSetManagerDsl.g:2111:3: ruleType
            {
             before(grammarAccess.getKeyConceptAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getKeyConceptAccess().getTypeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyConcept__TypeAssignment_1"


    // $ANTLR start "rule__KeyConcept__NameAssignment_2"
    // InternalEventSetManagerDsl.g:2120:1: rule__KeyConcept__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyConcept__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2124:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:2125:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:2125:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:2126:3: ruleEString
            {
             before(grammarAccess.getKeyConceptAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKeyConceptAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KeyConcept__NameAssignment_2"


    // $ANTLR start "rule__RegexConcept__TypeAssignment_1"
    // InternalEventSetManagerDsl.g:2135:1: rule__RegexConcept__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__RegexConcept__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2139:1: ( ( ruleType ) )
            // InternalEventSetManagerDsl.g:2140:2: ( ruleType )
            {
            // InternalEventSetManagerDsl.g:2140:2: ( ruleType )
            // InternalEventSetManagerDsl.g:2141:3: ruleType
            {
             before(grammarAccess.getRegexConceptAccess().getTypeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRegexConceptAccess().getTypeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__TypeAssignment_1"


    // $ANTLR start "rule__RegexConcept__NameAssignment_2"
    // InternalEventSetManagerDsl.g:2150:1: rule__RegexConcept__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RegexConcept__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2154:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:2155:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:2155:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:2156:3: ruleEString
            {
             before(grammarAccess.getRegexConceptAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegexConceptAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__NameAssignment_2"


    // $ANTLR start "rule__RegexConcept__RegexAssignment_4"
    // InternalEventSetManagerDsl.g:2165:1: rule__RegexConcept__RegexAssignment_4 : ( ruleEString ) ;
    public final void rule__RegexConcept__RegexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2169:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:2170:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:2170:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:2171:3: ruleEString
            {
             before(grammarAccess.getRegexConceptAccess().getRegexEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegexConceptAccess().getRegexEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegexConcept__RegexAssignment_4"


    // $ANTLR start "rule__Action__CallsAssignment_1"
    // InternalEventSetManagerDsl.g:2180:1: rule__Action__CallsAssignment_1 : ( ruleEString ) ;
    public final void rule__Action__CallsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2184:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:2185:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:2185:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:2186:3: ruleEString
            {
             before(grammarAccess.getActionAccess().getCallsEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionAccess().getCallsEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__CallsAssignment_1"


    // $ANTLR start "rule__Action__ParamsAssignment_2_1"
    // InternalEventSetManagerDsl.g:2195:1: rule__Action__ParamsAssignment_2_1 : ( ruleActionParam ) ;
    public final void rule__Action__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2199:1: ( ( ruleActionParam ) )
            // InternalEventSetManagerDsl.g:2200:2: ( ruleActionParam )
            {
            // InternalEventSetManagerDsl.g:2200:2: ( ruleActionParam )
            // InternalEventSetManagerDsl.g:2201:3: ruleActionParam
            {
             before(grammarAccess.getActionAccess().getParamsActionParamParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionParam();

            state._fsp--;

             after(grammarAccess.getActionAccess().getParamsActionParamParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ParamsAssignment_2_1"


    // $ANTLR start "rule__Action__ParamsAssignment_2_2_1"
    // InternalEventSetManagerDsl.g:2210:1: rule__Action__ParamsAssignment_2_2_1 : ( ruleActionParam ) ;
    public final void rule__Action__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2214:1: ( ( ruleActionParam ) )
            // InternalEventSetManagerDsl.g:2215:2: ( ruleActionParam )
            {
            // InternalEventSetManagerDsl.g:2215:2: ( ruleActionParam )
            // InternalEventSetManagerDsl.g:2216:3: ruleActionParam
            {
             before(grammarAccess.getActionAccess().getParamsActionParamParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActionParam();

            state._fsp--;

             after(grammarAccess.getActionAccess().getParamsActionParamParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__ConceptParam__KeyAssignment_1"
    // InternalEventSetManagerDsl.g:2225:1: rule__ConceptParam__KeyAssignment_1 : ( ruleEString ) ;
    public final void rule__ConceptParam__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2229:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:2230:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:2230:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:2231:3: ruleEString
            {
             before(grammarAccess.getConceptParamAccess().getKeyEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getConceptParamAccess().getKeyEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__KeyAssignment_1"


    // $ANTLR start "rule__ConceptParam__ValueAssignment_3"
    // InternalEventSetManagerDsl.g:2240:1: rule__ConceptParam__ValueAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ConceptParam__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2244:1: ( ( ( RULE_ID ) ) )
            // InternalEventSetManagerDsl.g:2245:2: ( ( RULE_ID ) )
            {
            // InternalEventSetManagerDsl.g:2245:2: ( ( RULE_ID ) )
            // InternalEventSetManagerDsl.g:2246:3: ( RULE_ID )
            {
             before(grammarAccess.getConceptParamAccess().getValueConceptCrossReference_3_0()); 
            // InternalEventSetManagerDsl.g:2247:3: ( RULE_ID )
            // InternalEventSetManagerDsl.g:2248:4: RULE_ID
            {
             before(grammarAccess.getConceptParamAccess().getValueConceptIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConceptParamAccess().getValueConceptIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConceptParamAccess().getValueConceptCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConceptParam__ValueAssignment_3"


    // $ANTLR start "rule__StringParam__KeyAssignment_1"
    // InternalEventSetManagerDsl.g:2259:1: rule__StringParam__KeyAssignment_1 : ( ruleEString ) ;
    public final void rule__StringParam__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2263:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:2264:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:2264:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:2265:3: ruleEString
            {
             before(grammarAccess.getStringParamAccess().getKeyEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringParamAccess().getKeyEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__KeyAssignment_1"


    // $ANTLR start "rule__StringParam__ValueAssignment_3"
    // InternalEventSetManagerDsl.g:2274:1: rule__StringParam__ValueAssignment_3 : ( ruleEString ) ;
    public final void rule__StringParam__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:2278:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:2279:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:2279:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:2280:3: ruleEString
            {
             before(grammarAccess.getStringParamAccess().getValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringParamAccess().getValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringParam__ValueAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\2\11\2\uffff";
    static final String dfa_3s = "\1\14\5\4\2\14\2\uffff";
    static final String dfa_4s = "\1\20\5\5\2\30\2\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\5\11\2\uffff\1\11\4\uffff\1\10",
            "\5\11\2\uffff\1\11\4\uffff\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "439:1: rule__Concept__Alternatives : ( ( ruleKeyConcept ) | ( ruleRegexConcept ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000009F000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});

}