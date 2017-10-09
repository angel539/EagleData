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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'", "'pattern'", "'{'", "'}'", "'if'", "'then'", "' = '", "'='"
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
    public static final int RULE_INT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
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
    // InternalEventSetManagerDsl.g:87:1: ruleEvent : ( rulePatternEvent ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:91:2: ( ( rulePatternEvent ) )
            // InternalEventSetManagerDsl.g:92:2: ( rulePatternEvent )
            {
            // InternalEventSetManagerDsl.g:92:2: ( rulePatternEvent )
            // InternalEventSetManagerDsl.g:93:3: rulePatternEvent
            {
             before(grammarAccess.getEventAccess().getPatternEventParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePatternEvent();

            state._fsp--;

             after(grammarAccess.getEventAccess().getPatternEventParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePatternEvent"
    // InternalEventSetManagerDsl.g:103:1: entryRulePatternEvent : rulePatternEvent EOF ;
    public final void entryRulePatternEvent() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:104:1: ( rulePatternEvent EOF )
            // InternalEventSetManagerDsl.g:105:1: rulePatternEvent EOF
            {
             before(grammarAccess.getPatternEventRule()); 
            pushFollow(FOLLOW_1);
            rulePatternEvent();

            state._fsp--;

             after(grammarAccess.getPatternEventRule()); 
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
    // $ANTLR end "entryRulePatternEvent"


    // $ANTLR start "rulePatternEvent"
    // InternalEventSetManagerDsl.g:112:1: rulePatternEvent : ( ( rule__PatternEvent__Group__0 ) ) ;
    public final void rulePatternEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:116:2: ( ( ( rule__PatternEvent__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:117:2: ( ( rule__PatternEvent__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:117:2: ( ( rule__PatternEvent__Group__0 ) )
            // InternalEventSetManagerDsl.g:118:3: ( rule__PatternEvent__Group__0 )
            {
             before(grammarAccess.getPatternEventAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:119:3: ( rule__PatternEvent__Group__0 )
            // InternalEventSetManagerDsl.g:119:4: rule__PatternEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatternEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalEventSetManagerDsl.g:128:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:129:1: ( ruleCondition EOF )
            // InternalEventSetManagerDsl.g:130:1: ruleCondition EOF
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
    // InternalEventSetManagerDsl.g:137:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:141:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalEventSetManagerDsl.g:142:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalEventSetManagerDsl.g:142:2: ( ( rule__Condition__Alternatives ) )
            // InternalEventSetManagerDsl.g:143:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalEventSetManagerDsl.g:144:3: ( rule__Condition__Alternatives )
            // InternalEventSetManagerDsl.g:144:4: rule__Condition__Alternatives
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
    // InternalEventSetManagerDsl.g:153:1: entryRuleBinaryExpression : ruleBinaryExpression EOF ;
    public final void entryRuleBinaryExpression() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:154:1: ( ruleBinaryExpression EOF )
            // InternalEventSetManagerDsl.g:155:1: ruleBinaryExpression EOF
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
    // InternalEventSetManagerDsl.g:162:1: ruleBinaryExpression : ( ( rule__BinaryExpression__Group__0 ) ) ;
    public final void ruleBinaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:166:2: ( ( ( rule__BinaryExpression__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:167:2: ( ( rule__BinaryExpression__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:167:2: ( ( rule__BinaryExpression__Group__0 ) )
            // InternalEventSetManagerDsl.g:168:3: ( rule__BinaryExpression__Group__0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:169:3: ( rule__BinaryExpression__Group__0 )
            // InternalEventSetManagerDsl.g:169:4: rule__BinaryExpression__Group__0
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
    // InternalEventSetManagerDsl.g:178:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:179:1: ( ruleLiteral EOF )
            // InternalEventSetManagerDsl.g:180:1: ruleLiteral EOF
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
    // InternalEventSetManagerDsl.g:187:1: ruleLiteral : ( ( rule__Literal__ValueAssignment ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:191:2: ( ( ( rule__Literal__ValueAssignment ) ) )
            // InternalEventSetManagerDsl.g:192:2: ( ( rule__Literal__ValueAssignment ) )
            {
            // InternalEventSetManagerDsl.g:192:2: ( ( rule__Literal__ValueAssignment ) )
            // InternalEventSetManagerDsl.g:193:3: ( rule__Literal__ValueAssignment )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment()); 
            // InternalEventSetManagerDsl.g:194:3: ( rule__Literal__ValueAssignment )
            // InternalEventSetManagerDsl.g:194:4: rule__Literal__ValueAssignment
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
    // InternalEventSetManagerDsl.g:203:1: entryRuleBooleanExpression : ruleBooleanExpression EOF ;
    public final void entryRuleBooleanExpression() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:204:1: ( ruleBooleanExpression EOF )
            // InternalEventSetManagerDsl.g:205:1: ruleBooleanExpression EOF
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
    // InternalEventSetManagerDsl.g:212:1: ruleBooleanExpression : ( ( rule__BooleanExpression__ExpressionAssignment ) ) ;
    public final void ruleBooleanExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:216:2: ( ( ( rule__BooleanExpression__ExpressionAssignment ) ) )
            // InternalEventSetManagerDsl.g:217:2: ( ( rule__BooleanExpression__ExpressionAssignment ) )
            {
            // InternalEventSetManagerDsl.g:217:2: ( ( rule__BooleanExpression__ExpressionAssignment ) )
            // InternalEventSetManagerDsl.g:218:3: ( rule__BooleanExpression__ExpressionAssignment )
            {
             before(grammarAccess.getBooleanExpressionAccess().getExpressionAssignment()); 
            // InternalEventSetManagerDsl.g:219:3: ( rule__BooleanExpression__ExpressionAssignment )
            // InternalEventSetManagerDsl.g:219:4: rule__BooleanExpression__ExpressionAssignment
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
    // InternalEventSetManagerDsl.g:228:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:229:1: ( ruleConcept EOF )
            // InternalEventSetManagerDsl.g:230:1: ruleConcept EOF
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
    // InternalEventSetManagerDsl.g:237:1: ruleConcept : ( ( rule__Concept__Alternatives ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:241:2: ( ( ( rule__Concept__Alternatives ) ) )
            // InternalEventSetManagerDsl.g:242:2: ( ( rule__Concept__Alternatives ) )
            {
            // InternalEventSetManagerDsl.g:242:2: ( ( rule__Concept__Alternatives ) )
            // InternalEventSetManagerDsl.g:243:3: ( rule__Concept__Alternatives )
            {
             before(grammarAccess.getConceptAccess().getAlternatives()); 
            // InternalEventSetManagerDsl.g:244:3: ( rule__Concept__Alternatives )
            // InternalEventSetManagerDsl.g:244:4: rule__Concept__Alternatives
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
    // InternalEventSetManagerDsl.g:253:1: entryRuleKeyConcept : ruleKeyConcept EOF ;
    public final void entryRuleKeyConcept() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:254:1: ( ruleKeyConcept EOF )
            // InternalEventSetManagerDsl.g:255:1: ruleKeyConcept EOF
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
    // InternalEventSetManagerDsl.g:262:1: ruleKeyConcept : ( ( rule__KeyConcept__Group__0 ) ) ;
    public final void ruleKeyConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:266:2: ( ( ( rule__KeyConcept__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:267:2: ( ( rule__KeyConcept__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:267:2: ( ( rule__KeyConcept__Group__0 ) )
            // InternalEventSetManagerDsl.g:268:3: ( rule__KeyConcept__Group__0 )
            {
             before(grammarAccess.getKeyConceptAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:269:3: ( rule__KeyConcept__Group__0 )
            // InternalEventSetManagerDsl.g:269:4: rule__KeyConcept__Group__0
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
    // InternalEventSetManagerDsl.g:278:1: entryRuleRegexConcept : ruleRegexConcept EOF ;
    public final void entryRuleRegexConcept() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:279:1: ( ruleRegexConcept EOF )
            // InternalEventSetManagerDsl.g:280:1: ruleRegexConcept EOF
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
    // InternalEventSetManagerDsl.g:287:1: ruleRegexConcept : ( ( rule__RegexConcept__Group__0 ) ) ;
    public final void ruleRegexConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:291:2: ( ( ( rule__RegexConcept__Group__0 ) ) )
            // InternalEventSetManagerDsl.g:292:2: ( ( rule__RegexConcept__Group__0 ) )
            {
            // InternalEventSetManagerDsl.g:292:2: ( ( rule__RegexConcept__Group__0 ) )
            // InternalEventSetManagerDsl.g:293:3: ( rule__RegexConcept__Group__0 )
            {
             before(grammarAccess.getRegexConceptAccess().getGroup()); 
            // InternalEventSetManagerDsl.g:294:3: ( rule__RegexConcept__Group__0 )
            // InternalEventSetManagerDsl.g:294:4: rule__RegexConcept__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalEventSetManagerDsl.g:303:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalEventSetManagerDsl.g:304:1: ( ruleEString EOF )
            // InternalEventSetManagerDsl.g:305:1: ruleEString EOF
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
    // InternalEventSetManagerDsl.g:312:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:316:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalEventSetManagerDsl.g:317:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalEventSetManagerDsl.g:317:2: ( ( rule__EString__Alternatives ) )
            // InternalEventSetManagerDsl.g:318:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalEventSetManagerDsl.g:319:3: ( rule__EString__Alternatives )
            // InternalEventSetManagerDsl.g:319:4: rule__EString__Alternatives
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
    // InternalEventSetManagerDsl.g:328:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:332:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalEventSetManagerDsl.g:333:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalEventSetManagerDsl.g:333:2: ( ( rule__Type__Alternatives ) )
            // InternalEventSetManagerDsl.g:334:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalEventSetManagerDsl.g:335:3: ( rule__Type__Alternatives )
            // InternalEventSetManagerDsl.g:335:4: rule__Type__Alternatives
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
    // InternalEventSetManagerDsl.g:343:1: rule__Condition__Alternatives : ( ( ruleBinaryExpression ) | ( ruleBooleanExpression ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:347:1: ( ( ruleBinaryExpression ) | ( ruleBooleanExpression ) )
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
                    // InternalEventSetManagerDsl.g:348:2: ( ruleBinaryExpression )
                    {
                    // InternalEventSetManagerDsl.g:348:2: ( ruleBinaryExpression )
                    // InternalEventSetManagerDsl.g:349:3: ruleBinaryExpression
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
                    // InternalEventSetManagerDsl.g:354:2: ( ruleBooleanExpression )
                    {
                    // InternalEventSetManagerDsl.g:354:2: ( ruleBooleanExpression )
                    // InternalEventSetManagerDsl.g:355:3: ruleBooleanExpression
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
    // InternalEventSetManagerDsl.g:364:1: rule__Concept__Alternatives : ( ( ruleKeyConcept ) | ( ruleRegexConcept ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:368:1: ( ( ruleKeyConcept ) | ( ruleRegexConcept ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEventSetManagerDsl.g:369:2: ( ruleKeyConcept )
                    {
                    // InternalEventSetManagerDsl.g:369:2: ( ruleKeyConcept )
                    // InternalEventSetManagerDsl.g:370:3: ruleKeyConcept
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
                    // InternalEventSetManagerDsl.g:375:2: ( ruleRegexConcept )
                    {
                    // InternalEventSetManagerDsl.g:375:2: ( ruleRegexConcept )
                    // InternalEventSetManagerDsl.g:376:3: ruleRegexConcept
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalEventSetManagerDsl.g:385:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:389:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalEventSetManagerDsl.g:390:2: ( RULE_STRING )
                    {
                    // InternalEventSetManagerDsl.g:390:2: ( RULE_STRING )
                    // InternalEventSetManagerDsl.g:391:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:396:2: ( RULE_ID )
                    {
                    // InternalEventSetManagerDsl.g:396:2: ( RULE_ID )
                    // InternalEventSetManagerDsl.g:397:3: RULE_ID
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
    // InternalEventSetManagerDsl.g:406:1: rule__Type__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:410:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
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
                    // InternalEventSetManagerDsl.g:411:2: ( ( 'String' ) )
                    {
                    // InternalEventSetManagerDsl.g:411:2: ( ( 'String' ) )
                    // InternalEventSetManagerDsl.g:412:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalEventSetManagerDsl.g:413:3: ( 'String' )
                    // InternalEventSetManagerDsl.g:413:4: 'String'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventSetManagerDsl.g:417:2: ( ( 'Int' ) )
                    {
                    // InternalEventSetManagerDsl.g:417:2: ( ( 'Int' ) )
                    // InternalEventSetManagerDsl.g:418:3: ( 'Int' )
                    {
                     before(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalEventSetManagerDsl.g:419:3: ( 'Int' )
                    // InternalEventSetManagerDsl.g:419:4: 'Int'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEventSetManagerDsl.g:423:2: ( ( 'Boolean' ) )
                    {
                    // InternalEventSetManagerDsl.g:423:2: ( ( 'Boolean' ) )
                    // InternalEventSetManagerDsl.g:424:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalEventSetManagerDsl.g:425:3: ( 'Boolean' )
                    // InternalEventSetManagerDsl.g:425:4: 'Boolean'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEventSetManagerDsl.g:429:2: ( ( 'Float' ) )
                    {
                    // InternalEventSetManagerDsl.g:429:2: ( ( 'Float' ) )
                    // InternalEventSetManagerDsl.g:430:3: ( 'Float' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // InternalEventSetManagerDsl.g:431:3: ( 'Float' )
                    // InternalEventSetManagerDsl.g:431:4: 'Float'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEventSetManagerDsl.g:435:2: ( ( 'Double' ) )
                    {
                    // InternalEventSetManagerDsl.g:435:2: ( ( 'Double' ) )
                    // InternalEventSetManagerDsl.g:436:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalEventSetManagerDsl.g:437:3: ( 'Double' )
                    // InternalEventSetManagerDsl.g:437:4: 'Double'
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
    // InternalEventSetManagerDsl.g:445:1: rule__EventSetManager__Group__0 : rule__EventSetManager__Group__0__Impl rule__EventSetManager__Group__1 ;
    public final void rule__EventSetManager__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:449:1: ( rule__EventSetManager__Group__0__Impl rule__EventSetManager__Group__1 )
            // InternalEventSetManagerDsl.g:450:2: rule__EventSetManager__Group__0__Impl rule__EventSetManager__Group__1
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
    // InternalEventSetManagerDsl.g:457:1: rule__EventSetManager__Group__0__Impl : ( ( rule__EventSetManager__EventsAssignment_0 ) ) ;
    public final void rule__EventSetManager__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:461:1: ( ( ( rule__EventSetManager__EventsAssignment_0 ) ) )
            // InternalEventSetManagerDsl.g:462:1: ( ( rule__EventSetManager__EventsAssignment_0 ) )
            {
            // InternalEventSetManagerDsl.g:462:1: ( ( rule__EventSetManager__EventsAssignment_0 ) )
            // InternalEventSetManagerDsl.g:463:2: ( rule__EventSetManager__EventsAssignment_0 )
            {
             before(grammarAccess.getEventSetManagerAccess().getEventsAssignment_0()); 
            // InternalEventSetManagerDsl.g:464:2: ( rule__EventSetManager__EventsAssignment_0 )
            // InternalEventSetManagerDsl.g:464:3: rule__EventSetManager__EventsAssignment_0
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
    // InternalEventSetManagerDsl.g:472:1: rule__EventSetManager__Group__1 : rule__EventSetManager__Group__1__Impl ;
    public final void rule__EventSetManager__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:476:1: ( rule__EventSetManager__Group__1__Impl )
            // InternalEventSetManagerDsl.g:477:2: rule__EventSetManager__Group__1__Impl
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
    // InternalEventSetManagerDsl.g:483:1: rule__EventSetManager__Group__1__Impl : ( ( rule__EventSetManager__EventsAssignment_1 )* ) ;
    public final void rule__EventSetManager__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:487:1: ( ( ( rule__EventSetManager__EventsAssignment_1 )* ) )
            // InternalEventSetManagerDsl.g:488:1: ( ( rule__EventSetManager__EventsAssignment_1 )* )
            {
            // InternalEventSetManagerDsl.g:488:1: ( ( rule__EventSetManager__EventsAssignment_1 )* )
            // InternalEventSetManagerDsl.g:489:2: ( rule__EventSetManager__EventsAssignment_1 )*
            {
             before(grammarAccess.getEventSetManagerAccess().getEventsAssignment_1()); 
            // InternalEventSetManagerDsl.g:490:2: ( rule__EventSetManager__EventsAssignment_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:490:3: rule__EventSetManager__EventsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__EventSetManager__EventsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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


    // $ANTLR start "rule__PatternEvent__Group__0"
    // InternalEventSetManagerDsl.g:499:1: rule__PatternEvent__Group__0 : rule__PatternEvent__Group__0__Impl rule__PatternEvent__Group__1 ;
    public final void rule__PatternEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:503:1: ( rule__PatternEvent__Group__0__Impl rule__PatternEvent__Group__1 )
            // InternalEventSetManagerDsl.g:504:2: rule__PatternEvent__Group__0__Impl rule__PatternEvent__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PatternEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__0"


    // $ANTLR start "rule__PatternEvent__Group__0__Impl"
    // InternalEventSetManagerDsl.g:511:1: rule__PatternEvent__Group__0__Impl : ( () ) ;
    public final void rule__PatternEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:515:1: ( ( () ) )
            // InternalEventSetManagerDsl.g:516:1: ( () )
            {
            // InternalEventSetManagerDsl.g:516:1: ( () )
            // InternalEventSetManagerDsl.g:517:2: ()
            {
             before(grammarAccess.getPatternEventAccess().getPatternEventAction_0()); 
            // InternalEventSetManagerDsl.g:518:2: ()
            // InternalEventSetManagerDsl.g:518:3: 
            {
            }

             after(grammarAccess.getPatternEventAccess().getPatternEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__0__Impl"


    // $ANTLR start "rule__PatternEvent__Group__1"
    // InternalEventSetManagerDsl.g:526:1: rule__PatternEvent__Group__1 : rule__PatternEvent__Group__1__Impl rule__PatternEvent__Group__2 ;
    public final void rule__PatternEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:530:1: ( rule__PatternEvent__Group__1__Impl rule__PatternEvent__Group__2 )
            // InternalEventSetManagerDsl.g:531:2: rule__PatternEvent__Group__1__Impl rule__PatternEvent__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PatternEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__1"


    // $ANTLR start "rule__PatternEvent__Group__1__Impl"
    // InternalEventSetManagerDsl.g:538:1: rule__PatternEvent__Group__1__Impl : ( 'pattern' ) ;
    public final void rule__PatternEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:542:1: ( ( 'pattern' ) )
            // InternalEventSetManagerDsl.g:543:1: ( 'pattern' )
            {
            // InternalEventSetManagerDsl.g:543:1: ( 'pattern' )
            // InternalEventSetManagerDsl.g:544:2: 'pattern'
            {
             before(grammarAccess.getPatternEventAccess().getPatternKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPatternEventAccess().getPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__1__Impl"


    // $ANTLR start "rule__PatternEvent__Group__2"
    // InternalEventSetManagerDsl.g:553:1: rule__PatternEvent__Group__2 : rule__PatternEvent__Group__2__Impl rule__PatternEvent__Group__3 ;
    public final void rule__PatternEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:557:1: ( rule__PatternEvent__Group__2__Impl rule__PatternEvent__Group__3 )
            // InternalEventSetManagerDsl.g:558:2: rule__PatternEvent__Group__2__Impl rule__PatternEvent__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PatternEvent__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__2"


    // $ANTLR start "rule__PatternEvent__Group__2__Impl"
    // InternalEventSetManagerDsl.g:565:1: rule__PatternEvent__Group__2__Impl : ( ( rule__PatternEvent__NameAssignment_2 ) ) ;
    public final void rule__PatternEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:569:1: ( ( ( rule__PatternEvent__NameAssignment_2 ) ) )
            // InternalEventSetManagerDsl.g:570:1: ( ( rule__PatternEvent__NameAssignment_2 ) )
            {
            // InternalEventSetManagerDsl.g:570:1: ( ( rule__PatternEvent__NameAssignment_2 ) )
            // InternalEventSetManagerDsl.g:571:2: ( rule__PatternEvent__NameAssignment_2 )
            {
             before(grammarAccess.getPatternEventAccess().getNameAssignment_2()); 
            // InternalEventSetManagerDsl.g:572:2: ( rule__PatternEvent__NameAssignment_2 )
            // InternalEventSetManagerDsl.g:572:3: rule__PatternEvent__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PatternEvent__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternEventAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__2__Impl"


    // $ANTLR start "rule__PatternEvent__Group__3"
    // InternalEventSetManagerDsl.g:580:1: rule__PatternEvent__Group__3 : rule__PatternEvent__Group__3__Impl rule__PatternEvent__Group__4 ;
    public final void rule__PatternEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:584:1: ( rule__PatternEvent__Group__3__Impl rule__PatternEvent__Group__4 )
            // InternalEventSetManagerDsl.g:585:2: rule__PatternEvent__Group__3__Impl rule__PatternEvent__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__PatternEvent__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__3"


    // $ANTLR start "rule__PatternEvent__Group__3__Impl"
    // InternalEventSetManagerDsl.g:592:1: rule__PatternEvent__Group__3__Impl : ( '{' ) ;
    public final void rule__PatternEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:596:1: ( ( '{' ) )
            // InternalEventSetManagerDsl.g:597:1: ( '{' )
            {
            // InternalEventSetManagerDsl.g:597:1: ( '{' )
            // InternalEventSetManagerDsl.g:598:2: '{'
            {
             before(grammarAccess.getPatternEventAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPatternEventAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__3__Impl"


    // $ANTLR start "rule__PatternEvent__Group__4"
    // InternalEventSetManagerDsl.g:607:1: rule__PatternEvent__Group__4 : rule__PatternEvent__Group__4__Impl rule__PatternEvent__Group__5 ;
    public final void rule__PatternEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:611:1: ( rule__PatternEvent__Group__4__Impl rule__PatternEvent__Group__5 )
            // InternalEventSetManagerDsl.g:612:2: rule__PatternEvent__Group__4__Impl rule__PatternEvent__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__PatternEvent__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__4"


    // $ANTLR start "rule__PatternEvent__Group__4__Impl"
    // InternalEventSetManagerDsl.g:619:1: rule__PatternEvent__Group__4__Impl : ( ( rule__PatternEvent__ConceptsAssignment_4 ) ) ;
    public final void rule__PatternEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:623:1: ( ( ( rule__PatternEvent__ConceptsAssignment_4 ) ) )
            // InternalEventSetManagerDsl.g:624:1: ( ( rule__PatternEvent__ConceptsAssignment_4 ) )
            {
            // InternalEventSetManagerDsl.g:624:1: ( ( rule__PatternEvent__ConceptsAssignment_4 ) )
            // InternalEventSetManagerDsl.g:625:2: ( rule__PatternEvent__ConceptsAssignment_4 )
            {
             before(grammarAccess.getPatternEventAccess().getConceptsAssignment_4()); 
            // InternalEventSetManagerDsl.g:626:2: ( rule__PatternEvent__ConceptsAssignment_4 )
            // InternalEventSetManagerDsl.g:626:3: rule__PatternEvent__ConceptsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PatternEvent__ConceptsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPatternEventAccess().getConceptsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__4__Impl"


    // $ANTLR start "rule__PatternEvent__Group__5"
    // InternalEventSetManagerDsl.g:634:1: rule__PatternEvent__Group__5 : rule__PatternEvent__Group__5__Impl rule__PatternEvent__Group__6 ;
    public final void rule__PatternEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:638:1: ( rule__PatternEvent__Group__5__Impl rule__PatternEvent__Group__6 )
            // InternalEventSetManagerDsl.g:639:2: rule__PatternEvent__Group__5__Impl rule__PatternEvent__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__PatternEvent__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__5"


    // $ANTLR start "rule__PatternEvent__Group__5__Impl"
    // InternalEventSetManagerDsl.g:646:1: rule__PatternEvent__Group__5__Impl : ( ( rule__PatternEvent__ConceptsAssignment_5 )* ) ;
    public final void rule__PatternEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:650:1: ( ( ( rule__PatternEvent__ConceptsAssignment_5 )* ) )
            // InternalEventSetManagerDsl.g:651:1: ( ( rule__PatternEvent__ConceptsAssignment_5 )* )
            {
            // InternalEventSetManagerDsl.g:651:1: ( ( rule__PatternEvent__ConceptsAssignment_5 )* )
            // InternalEventSetManagerDsl.g:652:2: ( rule__PatternEvent__ConceptsAssignment_5 )*
            {
             before(grammarAccess.getPatternEventAccess().getConceptsAssignment_5()); 
            // InternalEventSetManagerDsl.g:653:2: ( rule__PatternEvent__ConceptsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=12 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:653:3: rule__PatternEvent__ConceptsAssignment_5
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PatternEvent__ConceptsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getPatternEventAccess().getConceptsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__5__Impl"


    // $ANTLR start "rule__PatternEvent__Group__6"
    // InternalEventSetManagerDsl.g:661:1: rule__PatternEvent__Group__6 : rule__PatternEvent__Group__6__Impl rule__PatternEvent__Group__7 ;
    public final void rule__PatternEvent__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:665:1: ( rule__PatternEvent__Group__6__Impl rule__PatternEvent__Group__7 )
            // InternalEventSetManagerDsl.g:666:2: rule__PatternEvent__Group__6__Impl rule__PatternEvent__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__PatternEvent__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__6"


    // $ANTLR start "rule__PatternEvent__Group__6__Impl"
    // InternalEventSetManagerDsl.g:673:1: rule__PatternEvent__Group__6__Impl : ( '}' ) ;
    public final void rule__PatternEvent__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:677:1: ( ( '}' ) )
            // InternalEventSetManagerDsl.g:678:1: ( '}' )
            {
            // InternalEventSetManagerDsl.g:678:1: ( '}' )
            // InternalEventSetManagerDsl.g:679:2: '}'
            {
             before(grammarAccess.getPatternEventAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPatternEventAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__6__Impl"


    // $ANTLR start "rule__PatternEvent__Group__7"
    // InternalEventSetManagerDsl.g:688:1: rule__PatternEvent__Group__7 : rule__PatternEvent__Group__7__Impl rule__PatternEvent__Group__8 ;
    public final void rule__PatternEvent__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:692:1: ( rule__PatternEvent__Group__7__Impl rule__PatternEvent__Group__8 )
            // InternalEventSetManagerDsl.g:693:2: rule__PatternEvent__Group__7__Impl rule__PatternEvent__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__PatternEvent__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__7"


    // $ANTLR start "rule__PatternEvent__Group__7__Impl"
    // InternalEventSetManagerDsl.g:700:1: rule__PatternEvent__Group__7__Impl : ( ( rule__PatternEvent__Group_7__0 )? ) ;
    public final void rule__PatternEvent__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:704:1: ( ( ( rule__PatternEvent__Group_7__0 )? ) )
            // InternalEventSetManagerDsl.g:705:1: ( ( rule__PatternEvent__Group_7__0 )? )
            {
            // InternalEventSetManagerDsl.g:705:1: ( ( rule__PatternEvent__Group_7__0 )? )
            // InternalEventSetManagerDsl.g:706:2: ( rule__PatternEvent__Group_7__0 )?
            {
             before(grammarAccess.getPatternEventAccess().getGroup_7()); 
            // InternalEventSetManagerDsl.g:707:2: ( rule__PatternEvent__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEventSetManagerDsl.g:707:3: rule__PatternEvent__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PatternEvent__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternEventAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__7__Impl"


    // $ANTLR start "rule__PatternEvent__Group__8"
    // InternalEventSetManagerDsl.g:715:1: rule__PatternEvent__Group__8 : rule__PatternEvent__Group__8__Impl ;
    public final void rule__PatternEvent__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:719:1: ( rule__PatternEvent__Group__8__Impl )
            // InternalEventSetManagerDsl.g:720:2: rule__PatternEvent__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__8"


    // $ANTLR start "rule__PatternEvent__Group__8__Impl"
    // InternalEventSetManagerDsl.g:726:1: rule__PatternEvent__Group__8__Impl : ( ( rule__PatternEvent__Group_8__0 ) ) ;
    public final void rule__PatternEvent__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:730:1: ( ( ( rule__PatternEvent__Group_8__0 ) ) )
            // InternalEventSetManagerDsl.g:731:1: ( ( rule__PatternEvent__Group_8__0 ) )
            {
            // InternalEventSetManagerDsl.g:731:1: ( ( rule__PatternEvent__Group_8__0 ) )
            // InternalEventSetManagerDsl.g:732:2: ( rule__PatternEvent__Group_8__0 )
            {
             before(grammarAccess.getPatternEventAccess().getGroup_8()); 
            // InternalEventSetManagerDsl.g:733:2: ( rule__PatternEvent__Group_8__0 )
            // InternalEventSetManagerDsl.g:733:3: rule__PatternEvent__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternEventAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group__8__Impl"


    // $ANTLR start "rule__PatternEvent__Group_7__0"
    // InternalEventSetManagerDsl.g:742:1: rule__PatternEvent__Group_7__0 : rule__PatternEvent__Group_7__0__Impl rule__PatternEvent__Group_7__1 ;
    public final void rule__PatternEvent__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:746:1: ( rule__PatternEvent__Group_7__0__Impl rule__PatternEvent__Group_7__1 )
            // InternalEventSetManagerDsl.g:747:2: rule__PatternEvent__Group_7__0__Impl rule__PatternEvent__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__PatternEvent__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_7__0"


    // $ANTLR start "rule__PatternEvent__Group_7__0__Impl"
    // InternalEventSetManagerDsl.g:754:1: rule__PatternEvent__Group_7__0__Impl : ( 'if' ) ;
    public final void rule__PatternEvent__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:758:1: ( ( 'if' ) )
            // InternalEventSetManagerDsl.g:759:1: ( 'if' )
            {
            // InternalEventSetManagerDsl.g:759:1: ( 'if' )
            // InternalEventSetManagerDsl.g:760:2: 'if'
            {
             before(grammarAccess.getPatternEventAccess().getIfKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPatternEventAccess().getIfKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_7__0__Impl"


    // $ANTLR start "rule__PatternEvent__Group_7__1"
    // InternalEventSetManagerDsl.g:769:1: rule__PatternEvent__Group_7__1 : rule__PatternEvent__Group_7__1__Impl ;
    public final void rule__PatternEvent__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:773:1: ( rule__PatternEvent__Group_7__1__Impl )
            // InternalEventSetManagerDsl.g:774:2: rule__PatternEvent__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_7__1"


    // $ANTLR start "rule__PatternEvent__Group_7__1__Impl"
    // InternalEventSetManagerDsl.g:780:1: rule__PatternEvent__Group_7__1__Impl : ( ( rule__PatternEvent__WhenAssignment_7_1 ) ) ;
    public final void rule__PatternEvent__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:784:1: ( ( ( rule__PatternEvent__WhenAssignment_7_1 ) ) )
            // InternalEventSetManagerDsl.g:785:1: ( ( rule__PatternEvent__WhenAssignment_7_1 ) )
            {
            // InternalEventSetManagerDsl.g:785:1: ( ( rule__PatternEvent__WhenAssignment_7_1 ) )
            // InternalEventSetManagerDsl.g:786:2: ( rule__PatternEvent__WhenAssignment_7_1 )
            {
             before(grammarAccess.getPatternEventAccess().getWhenAssignment_7_1()); 
            // InternalEventSetManagerDsl.g:787:2: ( rule__PatternEvent__WhenAssignment_7_1 )
            // InternalEventSetManagerDsl.g:787:3: rule__PatternEvent__WhenAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternEvent__WhenAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternEventAccess().getWhenAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_7__1__Impl"


    // $ANTLR start "rule__PatternEvent__Group_8__0"
    // InternalEventSetManagerDsl.g:796:1: rule__PatternEvent__Group_8__0 : rule__PatternEvent__Group_8__0__Impl rule__PatternEvent__Group_8__1 ;
    public final void rule__PatternEvent__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:800:1: ( rule__PatternEvent__Group_8__0__Impl rule__PatternEvent__Group_8__1 )
            // InternalEventSetManagerDsl.g:801:2: rule__PatternEvent__Group_8__0__Impl rule__PatternEvent__Group_8__1
            {
            pushFollow(FOLLOW_5);
            rule__PatternEvent__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_8__0"


    // $ANTLR start "rule__PatternEvent__Group_8__0__Impl"
    // InternalEventSetManagerDsl.g:808:1: rule__PatternEvent__Group_8__0__Impl : ( 'then' ) ;
    public final void rule__PatternEvent__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:812:1: ( ( 'then' ) )
            // InternalEventSetManagerDsl.g:813:1: ( 'then' )
            {
            // InternalEventSetManagerDsl.g:813:1: ( 'then' )
            // InternalEventSetManagerDsl.g:814:2: 'then'
            {
             before(grammarAccess.getPatternEventAccess().getThenKeyword_8_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPatternEventAccess().getThenKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_8__0__Impl"


    // $ANTLR start "rule__PatternEvent__Group_8__1"
    // InternalEventSetManagerDsl.g:823:1: rule__PatternEvent__Group_8__1 : rule__PatternEvent__Group_8__1__Impl rule__PatternEvent__Group_8__2 ;
    public final void rule__PatternEvent__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:827:1: ( rule__PatternEvent__Group_8__1__Impl rule__PatternEvent__Group_8__2 )
            // InternalEventSetManagerDsl.g:828:2: rule__PatternEvent__Group_8__1__Impl rule__PatternEvent__Group_8__2
            {
            pushFollow(FOLLOW_5);
            rule__PatternEvent__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_8__1"


    // $ANTLR start "rule__PatternEvent__Group_8__1__Impl"
    // InternalEventSetManagerDsl.g:835:1: rule__PatternEvent__Group_8__1__Impl : ( ( rule__PatternEvent__TriggersAssignment_8_1 ) ) ;
    public final void rule__PatternEvent__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:839:1: ( ( ( rule__PatternEvent__TriggersAssignment_8_1 ) ) )
            // InternalEventSetManagerDsl.g:840:1: ( ( rule__PatternEvent__TriggersAssignment_8_1 ) )
            {
            // InternalEventSetManagerDsl.g:840:1: ( ( rule__PatternEvent__TriggersAssignment_8_1 ) )
            // InternalEventSetManagerDsl.g:841:2: ( rule__PatternEvent__TriggersAssignment_8_1 )
            {
             before(grammarAccess.getPatternEventAccess().getTriggersAssignment_8_1()); 
            // InternalEventSetManagerDsl.g:842:2: ( rule__PatternEvent__TriggersAssignment_8_1 )
            // InternalEventSetManagerDsl.g:842:3: rule__PatternEvent__TriggersAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__PatternEvent__TriggersAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternEventAccess().getTriggersAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_8__1__Impl"


    // $ANTLR start "rule__PatternEvent__Group_8__2"
    // InternalEventSetManagerDsl.g:850:1: rule__PatternEvent__Group_8__2 : rule__PatternEvent__Group_8__2__Impl ;
    public final void rule__PatternEvent__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:854:1: ( rule__PatternEvent__Group_8__2__Impl )
            // InternalEventSetManagerDsl.g:855:2: rule__PatternEvent__Group_8__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PatternEvent__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_8__2"


    // $ANTLR start "rule__PatternEvent__Group_8__2__Impl"
    // InternalEventSetManagerDsl.g:861:1: rule__PatternEvent__Group_8__2__Impl : ( ( rule__PatternEvent__TriggersAssignment_8_2 )* ) ;
    public final void rule__PatternEvent__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:865:1: ( ( ( rule__PatternEvent__TriggersAssignment_8_2 )* ) )
            // InternalEventSetManagerDsl.g:866:1: ( ( rule__PatternEvent__TriggersAssignment_8_2 )* )
            {
            // InternalEventSetManagerDsl.g:866:1: ( ( rule__PatternEvent__TriggersAssignment_8_2 )* )
            // InternalEventSetManagerDsl.g:867:2: ( rule__PatternEvent__TriggersAssignment_8_2 )*
            {
             before(grammarAccess.getPatternEventAccess().getTriggersAssignment_8_2()); 
            // InternalEventSetManagerDsl.g:868:2: ( rule__PatternEvent__TriggersAssignment_8_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_ID)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEventSetManagerDsl.g:868:3: rule__PatternEvent__TriggersAssignment_8_2
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PatternEvent__TriggersAssignment_8_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getPatternEventAccess().getTriggersAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__Group_8__2__Impl"


    // $ANTLR start "rule__BinaryExpression__Group__0"
    // InternalEventSetManagerDsl.g:877:1: rule__BinaryExpression__Group__0 : rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 ;
    public final void rule__BinaryExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:881:1: ( rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1 )
            // InternalEventSetManagerDsl.g:882:2: rule__BinaryExpression__Group__0__Impl rule__BinaryExpression__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalEventSetManagerDsl.g:889:1: rule__BinaryExpression__Group__0__Impl : ( ( rule__BinaryExpression__LeftAssignment_0 ) ) ;
    public final void rule__BinaryExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:893:1: ( ( ( rule__BinaryExpression__LeftAssignment_0 ) ) )
            // InternalEventSetManagerDsl.g:894:1: ( ( rule__BinaryExpression__LeftAssignment_0 ) )
            {
            // InternalEventSetManagerDsl.g:894:1: ( ( rule__BinaryExpression__LeftAssignment_0 ) )
            // InternalEventSetManagerDsl.g:895:2: ( rule__BinaryExpression__LeftAssignment_0 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftAssignment_0()); 
            // InternalEventSetManagerDsl.g:896:2: ( rule__BinaryExpression__LeftAssignment_0 )
            // InternalEventSetManagerDsl.g:896:3: rule__BinaryExpression__LeftAssignment_0
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
    // InternalEventSetManagerDsl.g:904:1: rule__BinaryExpression__Group__1 : rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 ;
    public final void rule__BinaryExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:908:1: ( rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2 )
            // InternalEventSetManagerDsl.g:909:2: rule__BinaryExpression__Group__1__Impl rule__BinaryExpression__Group__2
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
    // InternalEventSetManagerDsl.g:916:1: rule__BinaryExpression__Group__1__Impl : ( ' = ' ) ;
    public final void rule__BinaryExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:920:1: ( ( ' = ' ) )
            // InternalEventSetManagerDsl.g:921:1: ( ' = ' )
            {
            // InternalEventSetManagerDsl.g:921:1: ( ' = ' )
            // InternalEventSetManagerDsl.g:922:2: ' = '
            {
             before(grammarAccess.getBinaryExpressionAccess().getSpaceEqualsSignSpaceKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBinaryExpressionAccess().getSpaceEqualsSignSpaceKeyword_1()); 

            }


            }

        }
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
    // InternalEventSetManagerDsl.g:931:1: rule__BinaryExpression__Group__2 : rule__BinaryExpression__Group__2__Impl ;
    public final void rule__BinaryExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:935:1: ( rule__BinaryExpression__Group__2__Impl )
            // InternalEventSetManagerDsl.g:936:2: rule__BinaryExpression__Group__2__Impl
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
    // InternalEventSetManagerDsl.g:942:1: rule__BinaryExpression__Group__2__Impl : ( ( rule__BinaryExpression__RightAssignment_2 ) ) ;
    public final void rule__BinaryExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:946:1: ( ( ( rule__BinaryExpression__RightAssignment_2 ) ) )
            // InternalEventSetManagerDsl.g:947:1: ( ( rule__BinaryExpression__RightAssignment_2 ) )
            {
            // InternalEventSetManagerDsl.g:947:1: ( ( rule__BinaryExpression__RightAssignment_2 ) )
            // InternalEventSetManagerDsl.g:948:2: ( rule__BinaryExpression__RightAssignment_2 )
            {
             before(grammarAccess.getBinaryExpressionAccess().getRightAssignment_2()); 
            // InternalEventSetManagerDsl.g:949:2: ( rule__BinaryExpression__RightAssignment_2 )
            // InternalEventSetManagerDsl.g:949:3: rule__BinaryExpression__RightAssignment_2
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
    // InternalEventSetManagerDsl.g:958:1: rule__KeyConcept__Group__0 : rule__KeyConcept__Group__0__Impl rule__KeyConcept__Group__1 ;
    public final void rule__KeyConcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:962:1: ( rule__KeyConcept__Group__0__Impl rule__KeyConcept__Group__1 )
            // InternalEventSetManagerDsl.g:963:2: rule__KeyConcept__Group__0__Impl rule__KeyConcept__Group__1
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
    // InternalEventSetManagerDsl.g:970:1: rule__KeyConcept__Group__0__Impl : ( () ) ;
    public final void rule__KeyConcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:974:1: ( ( () ) )
            // InternalEventSetManagerDsl.g:975:1: ( () )
            {
            // InternalEventSetManagerDsl.g:975:1: ( () )
            // InternalEventSetManagerDsl.g:976:2: ()
            {
             before(grammarAccess.getKeyConceptAccess().getKeyConceptAction_0()); 
            // InternalEventSetManagerDsl.g:977:2: ()
            // InternalEventSetManagerDsl.g:977:3: 
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
    // InternalEventSetManagerDsl.g:985:1: rule__KeyConcept__Group__1 : rule__KeyConcept__Group__1__Impl rule__KeyConcept__Group__2 ;
    public final void rule__KeyConcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:989:1: ( rule__KeyConcept__Group__1__Impl rule__KeyConcept__Group__2 )
            // InternalEventSetManagerDsl.g:990:2: rule__KeyConcept__Group__1__Impl rule__KeyConcept__Group__2
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
    // InternalEventSetManagerDsl.g:997:1: rule__KeyConcept__Group__1__Impl : ( ( rule__KeyConcept__TypeAssignment_1 ) ) ;
    public final void rule__KeyConcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1001:1: ( ( ( rule__KeyConcept__TypeAssignment_1 ) ) )
            // InternalEventSetManagerDsl.g:1002:1: ( ( rule__KeyConcept__TypeAssignment_1 ) )
            {
            // InternalEventSetManagerDsl.g:1002:1: ( ( rule__KeyConcept__TypeAssignment_1 ) )
            // InternalEventSetManagerDsl.g:1003:2: ( rule__KeyConcept__TypeAssignment_1 )
            {
             before(grammarAccess.getKeyConceptAccess().getTypeAssignment_1()); 
            // InternalEventSetManagerDsl.g:1004:2: ( rule__KeyConcept__TypeAssignment_1 )
            // InternalEventSetManagerDsl.g:1004:3: rule__KeyConcept__TypeAssignment_1
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
    // InternalEventSetManagerDsl.g:1012:1: rule__KeyConcept__Group__2 : rule__KeyConcept__Group__2__Impl ;
    public final void rule__KeyConcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1016:1: ( rule__KeyConcept__Group__2__Impl )
            // InternalEventSetManagerDsl.g:1017:2: rule__KeyConcept__Group__2__Impl
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
    // InternalEventSetManagerDsl.g:1023:1: rule__KeyConcept__Group__2__Impl : ( ( rule__KeyConcept__NameAssignment_2 ) ) ;
    public final void rule__KeyConcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1027:1: ( ( ( rule__KeyConcept__NameAssignment_2 ) ) )
            // InternalEventSetManagerDsl.g:1028:1: ( ( rule__KeyConcept__NameAssignment_2 ) )
            {
            // InternalEventSetManagerDsl.g:1028:1: ( ( rule__KeyConcept__NameAssignment_2 ) )
            // InternalEventSetManagerDsl.g:1029:2: ( rule__KeyConcept__NameAssignment_2 )
            {
             before(grammarAccess.getKeyConceptAccess().getNameAssignment_2()); 
            // InternalEventSetManagerDsl.g:1030:2: ( rule__KeyConcept__NameAssignment_2 )
            // InternalEventSetManagerDsl.g:1030:3: rule__KeyConcept__NameAssignment_2
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
    // InternalEventSetManagerDsl.g:1039:1: rule__RegexConcept__Group__0 : rule__RegexConcept__Group__0__Impl rule__RegexConcept__Group__1 ;
    public final void rule__RegexConcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1043:1: ( rule__RegexConcept__Group__0__Impl rule__RegexConcept__Group__1 )
            // InternalEventSetManagerDsl.g:1044:2: rule__RegexConcept__Group__0__Impl rule__RegexConcept__Group__1
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
    // InternalEventSetManagerDsl.g:1051:1: rule__RegexConcept__Group__0__Impl : ( () ) ;
    public final void rule__RegexConcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1055:1: ( ( () ) )
            // InternalEventSetManagerDsl.g:1056:1: ( () )
            {
            // InternalEventSetManagerDsl.g:1056:1: ( () )
            // InternalEventSetManagerDsl.g:1057:2: ()
            {
             before(grammarAccess.getRegexConceptAccess().getRegexConceptAction_0()); 
            // InternalEventSetManagerDsl.g:1058:2: ()
            // InternalEventSetManagerDsl.g:1058:3: 
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
    // InternalEventSetManagerDsl.g:1066:1: rule__RegexConcept__Group__1 : rule__RegexConcept__Group__1__Impl rule__RegexConcept__Group__2 ;
    public final void rule__RegexConcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1070:1: ( rule__RegexConcept__Group__1__Impl rule__RegexConcept__Group__2 )
            // InternalEventSetManagerDsl.g:1071:2: rule__RegexConcept__Group__1__Impl rule__RegexConcept__Group__2
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
    // InternalEventSetManagerDsl.g:1078:1: rule__RegexConcept__Group__1__Impl : ( ( rule__RegexConcept__TypeAssignment_1 ) ) ;
    public final void rule__RegexConcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1082:1: ( ( ( rule__RegexConcept__TypeAssignment_1 ) ) )
            // InternalEventSetManagerDsl.g:1083:1: ( ( rule__RegexConcept__TypeAssignment_1 ) )
            {
            // InternalEventSetManagerDsl.g:1083:1: ( ( rule__RegexConcept__TypeAssignment_1 ) )
            // InternalEventSetManagerDsl.g:1084:2: ( rule__RegexConcept__TypeAssignment_1 )
            {
             before(grammarAccess.getRegexConceptAccess().getTypeAssignment_1()); 
            // InternalEventSetManagerDsl.g:1085:2: ( rule__RegexConcept__TypeAssignment_1 )
            // InternalEventSetManagerDsl.g:1085:3: rule__RegexConcept__TypeAssignment_1
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
    // InternalEventSetManagerDsl.g:1093:1: rule__RegexConcept__Group__2 : rule__RegexConcept__Group__2__Impl rule__RegexConcept__Group__3 ;
    public final void rule__RegexConcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1097:1: ( rule__RegexConcept__Group__2__Impl rule__RegexConcept__Group__3 )
            // InternalEventSetManagerDsl.g:1098:2: rule__RegexConcept__Group__2__Impl rule__RegexConcept__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalEventSetManagerDsl.g:1105:1: rule__RegexConcept__Group__2__Impl : ( ( rule__RegexConcept__NameAssignment_2 ) ) ;
    public final void rule__RegexConcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1109:1: ( ( ( rule__RegexConcept__NameAssignment_2 ) ) )
            // InternalEventSetManagerDsl.g:1110:1: ( ( rule__RegexConcept__NameAssignment_2 ) )
            {
            // InternalEventSetManagerDsl.g:1110:1: ( ( rule__RegexConcept__NameAssignment_2 ) )
            // InternalEventSetManagerDsl.g:1111:2: ( rule__RegexConcept__NameAssignment_2 )
            {
             before(grammarAccess.getRegexConceptAccess().getNameAssignment_2()); 
            // InternalEventSetManagerDsl.g:1112:2: ( rule__RegexConcept__NameAssignment_2 )
            // InternalEventSetManagerDsl.g:1112:3: rule__RegexConcept__NameAssignment_2
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
    // InternalEventSetManagerDsl.g:1120:1: rule__RegexConcept__Group__3 : rule__RegexConcept__Group__3__Impl rule__RegexConcept__Group__4 ;
    public final void rule__RegexConcept__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1124:1: ( rule__RegexConcept__Group__3__Impl rule__RegexConcept__Group__4 )
            // InternalEventSetManagerDsl.g:1125:2: rule__RegexConcept__Group__3__Impl rule__RegexConcept__Group__4
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
    // InternalEventSetManagerDsl.g:1132:1: rule__RegexConcept__Group__3__Impl : ( '=' ) ;
    public final void rule__RegexConcept__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1136:1: ( ( '=' ) )
            // InternalEventSetManagerDsl.g:1137:1: ( '=' )
            {
            // InternalEventSetManagerDsl.g:1137:1: ( '=' )
            // InternalEventSetManagerDsl.g:1138:2: '='
            {
             before(grammarAccess.getRegexConceptAccess().getEqualsSignKeyword_3()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEventSetManagerDsl.g:1147:1: rule__RegexConcept__Group__4 : rule__RegexConcept__Group__4__Impl ;
    public final void rule__RegexConcept__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1151:1: ( rule__RegexConcept__Group__4__Impl )
            // InternalEventSetManagerDsl.g:1152:2: rule__RegexConcept__Group__4__Impl
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
    // InternalEventSetManagerDsl.g:1158:1: rule__RegexConcept__Group__4__Impl : ( ( rule__RegexConcept__RegexAssignment_4 ) ) ;
    public final void rule__RegexConcept__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1162:1: ( ( ( rule__RegexConcept__RegexAssignment_4 ) ) )
            // InternalEventSetManagerDsl.g:1163:1: ( ( rule__RegexConcept__RegexAssignment_4 ) )
            {
            // InternalEventSetManagerDsl.g:1163:1: ( ( rule__RegexConcept__RegexAssignment_4 ) )
            // InternalEventSetManagerDsl.g:1164:2: ( rule__RegexConcept__RegexAssignment_4 )
            {
             before(grammarAccess.getRegexConceptAccess().getRegexAssignment_4()); 
            // InternalEventSetManagerDsl.g:1165:2: ( rule__RegexConcept__RegexAssignment_4 )
            // InternalEventSetManagerDsl.g:1165:3: rule__RegexConcept__RegexAssignment_4
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


    // $ANTLR start "rule__EventSetManager__EventsAssignment_0"
    // InternalEventSetManagerDsl.g:1174:1: rule__EventSetManager__EventsAssignment_0 : ( ruleEvent ) ;
    public final void rule__EventSetManager__EventsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1178:1: ( ( ruleEvent ) )
            // InternalEventSetManagerDsl.g:1179:2: ( ruleEvent )
            {
            // InternalEventSetManagerDsl.g:1179:2: ( ruleEvent )
            // InternalEventSetManagerDsl.g:1180:3: ruleEvent
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
    // InternalEventSetManagerDsl.g:1189:1: rule__EventSetManager__EventsAssignment_1 : ( ruleEvent ) ;
    public final void rule__EventSetManager__EventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1193:1: ( ( ruleEvent ) )
            // InternalEventSetManagerDsl.g:1194:2: ( ruleEvent )
            {
            // InternalEventSetManagerDsl.g:1194:2: ( ruleEvent )
            // InternalEventSetManagerDsl.g:1195:3: ruleEvent
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


    // $ANTLR start "rule__PatternEvent__NameAssignment_2"
    // InternalEventSetManagerDsl.g:1204:1: rule__PatternEvent__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__PatternEvent__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1208:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1209:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1209:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1210:3: ruleEString
            {
             before(grammarAccess.getPatternEventAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternEventAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__NameAssignment_2"


    // $ANTLR start "rule__PatternEvent__ConceptsAssignment_4"
    // InternalEventSetManagerDsl.g:1219:1: rule__PatternEvent__ConceptsAssignment_4 : ( ruleConcept ) ;
    public final void rule__PatternEvent__ConceptsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1223:1: ( ( ruleConcept ) )
            // InternalEventSetManagerDsl.g:1224:2: ( ruleConcept )
            {
            // InternalEventSetManagerDsl.g:1224:2: ( ruleConcept )
            // InternalEventSetManagerDsl.g:1225:3: ruleConcept
            {
             before(grammarAccess.getPatternEventAccess().getConceptsConceptParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getPatternEventAccess().getConceptsConceptParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__ConceptsAssignment_4"


    // $ANTLR start "rule__PatternEvent__ConceptsAssignment_5"
    // InternalEventSetManagerDsl.g:1234:1: rule__PatternEvent__ConceptsAssignment_5 : ( ruleConcept ) ;
    public final void rule__PatternEvent__ConceptsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1238:1: ( ( ruleConcept ) )
            // InternalEventSetManagerDsl.g:1239:2: ( ruleConcept )
            {
            // InternalEventSetManagerDsl.g:1239:2: ( ruleConcept )
            // InternalEventSetManagerDsl.g:1240:3: ruleConcept
            {
             before(grammarAccess.getPatternEventAccess().getConceptsConceptParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getPatternEventAccess().getConceptsConceptParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__ConceptsAssignment_5"


    // $ANTLR start "rule__PatternEvent__WhenAssignment_7_1"
    // InternalEventSetManagerDsl.g:1249:1: rule__PatternEvent__WhenAssignment_7_1 : ( ruleCondition ) ;
    public final void rule__PatternEvent__WhenAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1253:1: ( ( ruleCondition ) )
            // InternalEventSetManagerDsl.g:1254:2: ( ruleCondition )
            {
            // InternalEventSetManagerDsl.g:1254:2: ( ruleCondition )
            // InternalEventSetManagerDsl.g:1255:3: ruleCondition
            {
             before(grammarAccess.getPatternEventAccess().getWhenConditionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getPatternEventAccess().getWhenConditionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__WhenAssignment_7_1"


    // $ANTLR start "rule__PatternEvent__TriggersAssignment_8_1"
    // InternalEventSetManagerDsl.g:1264:1: rule__PatternEvent__TriggersAssignment_8_1 : ( ruleEString ) ;
    public final void rule__PatternEvent__TriggersAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1268:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1269:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1269:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1270:3: ruleEString
            {
             before(grammarAccess.getPatternEventAccess().getTriggersEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternEventAccess().getTriggersEStringParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__TriggersAssignment_8_1"


    // $ANTLR start "rule__PatternEvent__TriggersAssignment_8_2"
    // InternalEventSetManagerDsl.g:1279:1: rule__PatternEvent__TriggersAssignment_8_2 : ( ruleEString ) ;
    public final void rule__PatternEvent__TriggersAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1283:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1284:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1284:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1285:3: ruleEString
            {
             before(grammarAccess.getPatternEventAccess().getTriggersEStringParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPatternEventAccess().getTriggersEStringParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PatternEvent__TriggersAssignment_8_2"


    // $ANTLR start "rule__BinaryExpression__LeftAssignment_0"
    // InternalEventSetManagerDsl.g:1294:1: rule__BinaryExpression__LeftAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__BinaryExpression__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1298:1: ( ( ( ruleEString ) ) )
            // InternalEventSetManagerDsl.g:1299:2: ( ( ruleEString ) )
            {
            // InternalEventSetManagerDsl.g:1299:2: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1300:3: ( ruleEString )
            {
             before(grammarAccess.getBinaryExpressionAccess().getLeftConceptCrossReference_0_0()); 
            // InternalEventSetManagerDsl.g:1301:3: ( ruleEString )
            // InternalEventSetManagerDsl.g:1302:4: ruleEString
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
    // InternalEventSetManagerDsl.g:1313:1: rule__BinaryExpression__RightAssignment_2 : ( ruleLiteral ) ;
    public final void rule__BinaryExpression__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1317:1: ( ( ruleLiteral ) )
            // InternalEventSetManagerDsl.g:1318:2: ( ruleLiteral )
            {
            // InternalEventSetManagerDsl.g:1318:2: ( ruleLiteral )
            // InternalEventSetManagerDsl.g:1319:3: ruleLiteral
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
    // InternalEventSetManagerDsl.g:1328:1: rule__Literal__ValueAssignment : ( ruleEString ) ;
    public final void rule__Literal__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1332:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1333:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1333:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1334:3: ruleEString
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
    // InternalEventSetManagerDsl.g:1343:1: rule__BooleanExpression__ExpressionAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanExpression__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1347:1: ( ( RULE_BOOLEAN ) )
            // InternalEventSetManagerDsl.g:1348:2: ( RULE_BOOLEAN )
            {
            // InternalEventSetManagerDsl.g:1348:2: ( RULE_BOOLEAN )
            // InternalEventSetManagerDsl.g:1349:3: RULE_BOOLEAN
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
    // InternalEventSetManagerDsl.g:1358:1: rule__KeyConcept__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__KeyConcept__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1362:1: ( ( ruleType ) )
            // InternalEventSetManagerDsl.g:1363:2: ( ruleType )
            {
            // InternalEventSetManagerDsl.g:1363:2: ( ruleType )
            // InternalEventSetManagerDsl.g:1364:3: ruleType
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
    // InternalEventSetManagerDsl.g:1373:1: rule__KeyConcept__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyConcept__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1377:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1378:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1378:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1379:3: ruleEString
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
    // InternalEventSetManagerDsl.g:1388:1: rule__RegexConcept__TypeAssignment_1 : ( ruleType ) ;
    public final void rule__RegexConcept__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1392:1: ( ( ruleType ) )
            // InternalEventSetManagerDsl.g:1393:2: ( ruleType )
            {
            // InternalEventSetManagerDsl.g:1393:2: ( ruleType )
            // InternalEventSetManagerDsl.g:1394:3: ruleType
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
    // InternalEventSetManagerDsl.g:1403:1: rule__RegexConcept__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RegexConcept__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1407:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1408:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1408:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1409:3: ruleEString
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
    // InternalEventSetManagerDsl.g:1418:1: rule__RegexConcept__RegexAssignment_4 : ( ruleEString ) ;
    public final void rule__RegexConcept__RegexAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEventSetManagerDsl.g:1422:1: ( ( ruleEString ) )
            // InternalEventSetManagerDsl.g:1423:2: ( ruleEString )
            {
            // InternalEventSetManagerDsl.g:1423:2: ( ruleEString )
            // InternalEventSetManagerDsl.g:1424:3: ruleEString
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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\6\uffff\2\11\2\uffff";
    static final String dfa_3s = "\1\14\5\4\2\14\2\uffff";
    static final String dfa_4s = "\1\20\5\5\2\27\2\uffff";
    static final String dfa_5s = "\10\uffff\1\2\1\1";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\1\6\1\7",
            "\5\11\2\uffff\1\11\3\uffff\1\10",
            "\5\11\2\uffff\1\11\3\uffff\1\10",
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
            return "364:1: rule__Concept__Alternatives : ( ( ruleKeyConcept ) | ( ruleRegexConcept ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000009F000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000000001F002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});

}