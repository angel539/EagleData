package eagledata.core.dsl.rule.ide.contentassist.antlr.internal;

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
import eagledata.core.dsl.rule.services.RuleDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SETOPERATOR", "RULE_SELECTOPERATOR", "RULE_LOGICALOPERATOR", "RULE_INT", "RULE_DOUBLE", "RULE_OPERATOR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rule'", "'='", "'('", "'on'", "'do'", "')'", "'{'", "'}'", "','", "':'", "'select'", "'.'", "'where'", "'when'", "'*'"
    };
    public static final int RULE_SELECTOPERATOR=6;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_DOUBLE=9;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_LOGICALOPERATOR=7;
    public static final int RULE_OPERATOR=10;
    public static final int RULE_ID=4;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SETOPERATOR=5;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRuleDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRuleDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRuleDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRuleDsl.g"; }


    	private RuleDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(RuleDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRuleModel"
    // InternalRuleDsl.g:53:1: entryRuleRuleModel : ruleRuleModel EOF ;
    public final void entryRuleRuleModel() throws RecognitionException {
        try {
            // InternalRuleDsl.g:54:1: ( ruleRuleModel EOF )
            // InternalRuleDsl.g:55:1: ruleRuleModel EOF
            {
             before(grammarAccess.getRuleModelRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleModel();

            state._fsp--;

             after(grammarAccess.getRuleModelRule()); 
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
    // $ANTLR end "entryRuleRuleModel"


    // $ANTLR start "ruleRuleModel"
    // InternalRuleDsl.g:62:1: ruleRuleModel : ( ( rule__RuleModel__Group__0 )? ) ;
    public final void ruleRuleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:66:2: ( ( ( rule__RuleModel__Group__0 )? ) )
            // InternalRuleDsl.g:67:2: ( ( rule__RuleModel__Group__0 )? )
            {
            // InternalRuleDsl.g:67:2: ( ( rule__RuleModel__Group__0 )? )
            // InternalRuleDsl.g:68:3: ( rule__RuleModel__Group__0 )?
            {
             before(grammarAccess.getRuleModelAccess().getGroup()); 
            // InternalRuleDsl.g:69:3: ( rule__RuleModel__Group__0 )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRuleDsl.g:69:4: rule__RuleModel__Group__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleModel__Group__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleModel"


    // $ANTLR start "entryRuleRuleElement"
    // InternalRuleDsl.g:78:1: entryRuleRuleElement : ruleRuleElement EOF ;
    public final void entryRuleRuleElement() throws RecognitionException {
        try {
            // InternalRuleDsl.g:79:1: ( ruleRuleElement EOF )
            // InternalRuleDsl.g:80:1: ruleRuleElement EOF
            {
             before(grammarAccess.getRuleElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleElement();

            state._fsp--;

             after(grammarAccess.getRuleElementRule()); 
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
    // $ANTLR end "entryRuleRuleElement"


    // $ANTLR start "ruleRuleElement"
    // InternalRuleDsl.g:87:1: ruleRuleElement : ( ( rule__RuleElement__Alternatives ) ) ;
    public final void ruleRuleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:91:2: ( ( ( rule__RuleElement__Alternatives ) ) )
            // InternalRuleDsl.g:92:2: ( ( rule__RuleElement__Alternatives ) )
            {
            // InternalRuleDsl.g:92:2: ( ( rule__RuleElement__Alternatives ) )
            // InternalRuleDsl.g:93:3: ( rule__RuleElement__Alternatives )
            {
             before(grammarAccess.getRuleElementAccess().getAlternatives()); 
            // InternalRuleDsl.g:94:3: ( rule__RuleElement__Alternatives )
            // InternalRuleDsl.g:94:4: rule__RuleElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RuleElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRuleElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRuleElement"


    // $ANTLR start "entryRuleRule"
    // InternalRuleDsl.g:103:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRuleDsl.g:104:1: ( ruleRule EOF )
            // InternalRuleDsl.g:105:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalRuleDsl.g:112:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:116:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRuleDsl.g:117:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRuleDsl.g:117:2: ( ( rule__Rule__Group__0 ) )
            // InternalRuleDsl.g:118:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRuleDsl.g:119:3: ( rule__Rule__Group__0 )
            // InternalRuleDsl.g:119:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleQuery"
    // InternalRuleDsl.g:128:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalRuleDsl.g:129:1: ( ruleQuery EOF )
            // InternalRuleDsl.g:130:1: ruleQuery EOF
            {
             before(grammarAccess.getQueryRule()); 
            pushFollow(FOLLOW_1);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getQueryRule()); 
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
    // $ANTLR end "entryRuleQuery"


    // $ANTLR start "ruleQuery"
    // InternalRuleDsl.g:137:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:141:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalRuleDsl.g:142:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalRuleDsl.g:142:2: ( ( rule__Query__Group__0 ) )
            // InternalRuleDsl.g:143:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalRuleDsl.g:144:3: ( rule__Query__Group__0 )
            // InternalRuleDsl.g:144:4: rule__Query__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuery"


    // $ANTLR start "entryRuleSelect"
    // InternalRuleDsl.g:153:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalRuleDsl.g:154:1: ( ruleSelect EOF )
            // InternalRuleDsl.g:155:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalRuleDsl.g:162:1: ruleSelect : ( ( rule__Select__Alternatives ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:166:2: ( ( ( rule__Select__Alternatives ) ) )
            // InternalRuleDsl.g:167:2: ( ( rule__Select__Alternatives ) )
            {
            // InternalRuleDsl.g:167:2: ( ( rule__Select__Alternatives ) )
            // InternalRuleDsl.g:168:3: ( rule__Select__Alternatives )
            {
             before(grammarAccess.getSelectAccess().getAlternatives()); 
            // InternalRuleDsl.g:169:3: ( rule__Select__Alternatives )
            // InternalRuleDsl.g:169:4: rule__Select__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Select__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleSetSelect"
    // InternalRuleDsl.g:178:1: entryRuleSetSelect : ruleSetSelect EOF ;
    public final void entryRuleSetSelect() throws RecognitionException {
        try {
            // InternalRuleDsl.g:179:1: ( ruleSetSelect EOF )
            // InternalRuleDsl.g:180:1: ruleSetSelect EOF
            {
             before(grammarAccess.getSetSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSetSelect();

            state._fsp--;

             after(grammarAccess.getSetSelectRule()); 
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
    // $ANTLR end "entryRuleSetSelect"


    // $ANTLR start "ruleSetSelect"
    // InternalRuleDsl.g:187:1: ruleSetSelect : ( ( rule__SetSelect__Group__0 ) ) ;
    public final void ruleSetSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:191:2: ( ( ( rule__SetSelect__Group__0 ) ) )
            // InternalRuleDsl.g:192:2: ( ( rule__SetSelect__Group__0 ) )
            {
            // InternalRuleDsl.g:192:2: ( ( rule__SetSelect__Group__0 ) )
            // InternalRuleDsl.g:193:3: ( rule__SetSelect__Group__0 )
            {
             before(grammarAccess.getSetSelectAccess().getGroup()); 
            // InternalRuleDsl.g:194:3: ( rule__SetSelect__Group__0 )
            // InternalRuleDsl.g:194:4: rule__SetSelect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetSelect"


    // $ANTLR start "entryRuleSelection"
    // InternalRuleDsl.g:203:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // InternalRuleDsl.g:204:1: ( ruleSelection EOF )
            // InternalRuleDsl.g:205:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
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
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalRuleDsl.g:212:1: ruleSelection : ( ( rule__Selection__Group__0 ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:216:2: ( ( ( rule__Selection__Group__0 ) ) )
            // InternalRuleDsl.g:217:2: ( ( rule__Selection__Group__0 ) )
            {
            // InternalRuleDsl.g:217:2: ( ( rule__Selection__Group__0 ) )
            // InternalRuleDsl.g:218:3: ( rule__Selection__Group__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup()); 
            // InternalRuleDsl.g:219:3: ( rule__Selection__Group__0 )
            // InternalRuleDsl.g:219:4: rule__Selection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleAddingSelect"
    // InternalRuleDsl.g:228:1: entryRuleAddingSelect : ruleAddingSelect EOF ;
    public final void entryRuleAddingSelect() throws RecognitionException {
        try {
            // InternalRuleDsl.g:229:1: ( ruleAddingSelect EOF )
            // InternalRuleDsl.g:230:1: ruleAddingSelect EOF
            {
             before(grammarAccess.getAddingSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleAddingSelect();

            state._fsp--;

             after(grammarAccess.getAddingSelectRule()); 
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
    // $ANTLR end "entryRuleAddingSelect"


    // $ANTLR start "ruleAddingSelect"
    // InternalRuleDsl.g:237:1: ruleAddingSelect : ( ( rule__AddingSelect__Group__0 ) ) ;
    public final void ruleAddingSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:241:2: ( ( ( rule__AddingSelect__Group__0 ) ) )
            // InternalRuleDsl.g:242:2: ( ( rule__AddingSelect__Group__0 ) )
            {
            // InternalRuleDsl.g:242:2: ( ( rule__AddingSelect__Group__0 ) )
            // InternalRuleDsl.g:243:3: ( rule__AddingSelect__Group__0 )
            {
             before(grammarAccess.getAddingSelectAccess().getGroup()); 
            // InternalRuleDsl.g:244:3: ( rule__AddingSelect__Group__0 )
            // InternalRuleDsl.g:244:4: rule__AddingSelect__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AddingSelect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAddingSelectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddingSelect"


    // $ANTLR start "entryRuleWhere"
    // InternalRuleDsl.g:253:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalRuleDsl.g:254:1: ( ruleWhere EOF )
            // InternalRuleDsl.g:255:1: ruleWhere EOF
            {
             before(grammarAccess.getWhereRule()); 
            pushFollow(FOLLOW_1);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getWhereRule()); 
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
    // $ANTLR end "entryRuleWhere"


    // $ANTLR start "ruleWhere"
    // InternalRuleDsl.g:262:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:266:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalRuleDsl.g:267:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalRuleDsl.g:267:2: ( ( rule__Where__Group__0 ) )
            // InternalRuleDsl.g:268:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalRuleDsl.g:269:3: ( rule__Where__Group__0 )
            // InternalRuleDsl.g:269:4: rule__Where__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhere"


    // $ANTLR start "entryRuleWhen"
    // InternalRuleDsl.g:278:1: entryRuleWhen : ruleWhen EOF ;
    public final void entryRuleWhen() throws RecognitionException {
        try {
            // InternalRuleDsl.g:279:1: ( ruleWhen EOF )
            // InternalRuleDsl.g:280:1: ruleWhen EOF
            {
             before(grammarAccess.getWhenRule()); 
            pushFollow(FOLLOW_1);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getWhenRule()); 
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
    // $ANTLR end "entryRuleWhen"


    // $ANTLR start "ruleWhen"
    // InternalRuleDsl.g:287:1: ruleWhen : ( ( rule__When__Group__0 ) ) ;
    public final void ruleWhen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:291:2: ( ( ( rule__When__Group__0 ) ) )
            // InternalRuleDsl.g:292:2: ( ( rule__When__Group__0 ) )
            {
            // InternalRuleDsl.g:292:2: ( ( rule__When__Group__0 ) )
            // InternalRuleDsl.g:293:3: ( rule__When__Group__0 )
            {
             before(grammarAccess.getWhenAccess().getGroup()); 
            // InternalRuleDsl.g:294:3: ( rule__When__Group__0 )
            // InternalRuleDsl.g:294:4: rule__When__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhen"


    // $ANTLR start "entryRuleExpression"
    // InternalRuleDsl.g:303:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalRuleDsl.g:304:1: ( ruleExpression EOF )
            // InternalRuleDsl.g:305:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalRuleDsl.g:312:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:316:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalRuleDsl.g:317:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalRuleDsl.g:317:2: ( ( rule__Expression__Alternatives ) )
            // InternalRuleDsl.g:318:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalRuleDsl.g:319:3: ( rule__Expression__Alternatives )
            // InternalRuleDsl.g:319:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlainExpression"
    // InternalRuleDsl.g:328:1: entryRulePlainExpression : rulePlainExpression EOF ;
    public final void entryRulePlainExpression() throws RecognitionException {
        try {
            // InternalRuleDsl.g:329:1: ( rulePlainExpression EOF )
            // InternalRuleDsl.g:330:1: rulePlainExpression EOF
            {
             before(grammarAccess.getPlainExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePlainExpression();

            state._fsp--;

             after(grammarAccess.getPlainExpressionRule()); 
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
    // $ANTLR end "entryRulePlainExpression"


    // $ANTLR start "rulePlainExpression"
    // InternalRuleDsl.g:337:1: rulePlainExpression : ( ( rule__PlainExpression__PlainOperandAssignment ) ) ;
    public final void rulePlainExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:341:2: ( ( ( rule__PlainExpression__PlainOperandAssignment ) ) )
            // InternalRuleDsl.g:342:2: ( ( rule__PlainExpression__PlainOperandAssignment ) )
            {
            // InternalRuleDsl.g:342:2: ( ( rule__PlainExpression__PlainOperandAssignment ) )
            // InternalRuleDsl.g:343:3: ( rule__PlainExpression__PlainOperandAssignment )
            {
             before(grammarAccess.getPlainExpressionAccess().getPlainOperandAssignment()); 
            // InternalRuleDsl.g:344:3: ( rule__PlainExpression__PlainOperandAssignment )
            // InternalRuleDsl.g:344:4: rule__PlainExpression__PlainOperandAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PlainExpression__PlainOperandAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPlainExpressionAccess().getPlainOperandAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlainExpression"


    // $ANTLR start "entryRuleComplexExpression"
    // InternalRuleDsl.g:353:1: entryRuleComplexExpression : ruleComplexExpression EOF ;
    public final void entryRuleComplexExpression() throws RecognitionException {
        try {
            // InternalRuleDsl.g:354:1: ( ruleComplexExpression EOF )
            // InternalRuleDsl.g:355:1: ruleComplexExpression EOF
            {
             before(grammarAccess.getComplexExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexExpression();

            state._fsp--;

             after(grammarAccess.getComplexExpressionRule()); 
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
    // $ANTLR end "entryRuleComplexExpression"


    // $ANTLR start "ruleComplexExpression"
    // InternalRuleDsl.g:362:1: ruleComplexExpression : ( ( rule__ComplexExpression__Group__0 ) ) ;
    public final void ruleComplexExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:366:2: ( ( ( rule__ComplexExpression__Group__0 ) ) )
            // InternalRuleDsl.g:367:2: ( ( rule__ComplexExpression__Group__0 ) )
            {
            // InternalRuleDsl.g:367:2: ( ( rule__ComplexExpression__Group__0 ) )
            // InternalRuleDsl.g:368:3: ( rule__ComplexExpression__Group__0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getGroup()); 
            // InternalRuleDsl.g:369:3: ( rule__ComplexExpression__Group__0 )
            // InternalRuleDsl.g:369:4: rule__ComplexExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexExpression"


    // $ANTLR start "entryRulePlainOperand"
    // InternalRuleDsl.g:378:1: entryRulePlainOperand : rulePlainOperand EOF ;
    public final void entryRulePlainOperand() throws RecognitionException {
        try {
            // InternalRuleDsl.g:379:1: ( rulePlainOperand EOF )
            // InternalRuleDsl.g:380:1: rulePlainOperand EOF
            {
             before(grammarAccess.getPlainOperandRule()); 
            pushFollow(FOLLOW_1);
            rulePlainOperand();

            state._fsp--;

             after(grammarAccess.getPlainOperandRule()); 
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
    // $ANTLR end "entryRulePlainOperand"


    // $ANTLR start "rulePlainOperand"
    // InternalRuleDsl.g:387:1: rulePlainOperand : ( ( rule__PlainOperand__Alternatives ) ) ;
    public final void rulePlainOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:391:2: ( ( ( rule__PlainOperand__Alternatives ) ) )
            // InternalRuleDsl.g:392:2: ( ( rule__PlainOperand__Alternatives ) )
            {
            // InternalRuleDsl.g:392:2: ( ( rule__PlainOperand__Alternatives ) )
            // InternalRuleDsl.g:393:3: ( rule__PlainOperand__Alternatives )
            {
             before(grammarAccess.getPlainOperandAccess().getAlternatives()); 
            // InternalRuleDsl.g:394:3: ( rule__PlainOperand__Alternatives )
            // InternalRuleDsl.g:394:4: rule__PlainOperand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlainOperand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlainOperandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlainOperand"


    // $ANTLR start "entryRuleNumeral"
    // InternalRuleDsl.g:403:1: entryRuleNumeral : ruleNumeral EOF ;
    public final void entryRuleNumeral() throws RecognitionException {
        try {
            // InternalRuleDsl.g:404:1: ( ruleNumeral EOF )
            // InternalRuleDsl.g:405:1: ruleNumeral EOF
            {
             before(grammarAccess.getNumeralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumeral();

            state._fsp--;

             after(grammarAccess.getNumeralRule()); 
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
    // $ANTLR end "entryRuleNumeral"


    // $ANTLR start "ruleNumeral"
    // InternalRuleDsl.g:412:1: ruleNumeral : ( ( rule__Numeral__ValueAssignment ) ) ;
    public final void ruleNumeral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:416:2: ( ( ( rule__Numeral__ValueAssignment ) ) )
            // InternalRuleDsl.g:417:2: ( ( rule__Numeral__ValueAssignment ) )
            {
            // InternalRuleDsl.g:417:2: ( ( rule__Numeral__ValueAssignment ) )
            // InternalRuleDsl.g:418:3: ( rule__Numeral__ValueAssignment )
            {
             before(grammarAccess.getNumeralAccess().getValueAssignment()); 
            // InternalRuleDsl.g:419:3: ( rule__Numeral__ValueAssignment )
            // InternalRuleDsl.g:419:4: rule__Numeral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Numeral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumeralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumeral"


    // $ANTLR start "entryRuleQueryOperand"
    // InternalRuleDsl.g:428:1: entryRuleQueryOperand : ruleQueryOperand EOF ;
    public final void entryRuleQueryOperand() throws RecognitionException {
        try {
            // InternalRuleDsl.g:429:1: ( ruleQueryOperand EOF )
            // InternalRuleDsl.g:430:1: ruleQueryOperand EOF
            {
             before(grammarAccess.getQueryOperandRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryOperand();

            state._fsp--;

             after(grammarAccess.getQueryOperandRule()); 
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
    // $ANTLR end "entryRuleQueryOperand"


    // $ANTLR start "ruleQueryOperand"
    // InternalRuleDsl.g:437:1: ruleQueryOperand : ( ( rule__QueryOperand__QueryAssignment ) ) ;
    public final void ruleQueryOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:441:2: ( ( ( rule__QueryOperand__QueryAssignment ) ) )
            // InternalRuleDsl.g:442:2: ( ( rule__QueryOperand__QueryAssignment ) )
            {
            // InternalRuleDsl.g:442:2: ( ( rule__QueryOperand__QueryAssignment ) )
            // InternalRuleDsl.g:443:3: ( rule__QueryOperand__QueryAssignment )
            {
             before(grammarAccess.getQueryOperandAccess().getQueryAssignment()); 
            // InternalRuleDsl.g:444:3: ( rule__QueryOperand__QueryAssignment )
            // InternalRuleDsl.g:444:4: rule__QueryOperand__QueryAssignment
            {
            pushFollow(FOLLOW_2);
            rule__QueryOperand__QueryAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQueryOperandAccess().getQueryAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryOperand"


    // $ANTLR start "entryRuleComplexOperand"
    // InternalRuleDsl.g:453:1: entryRuleComplexOperand : ruleComplexOperand EOF ;
    public final void entryRuleComplexOperand() throws RecognitionException {
        try {
            // InternalRuleDsl.g:454:1: ( ruleComplexOperand EOF )
            // InternalRuleDsl.g:455:1: ruleComplexOperand EOF
            {
             before(grammarAccess.getComplexOperandRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexOperand();

            state._fsp--;

             after(grammarAccess.getComplexOperandRule()); 
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
    // $ANTLR end "entryRuleComplexOperand"


    // $ANTLR start "ruleComplexOperand"
    // InternalRuleDsl.g:462:1: ruleComplexOperand : ( ( rule__ComplexOperand__Group__0 ) ) ;
    public final void ruleComplexOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:466:2: ( ( ( rule__ComplexOperand__Group__0 ) ) )
            // InternalRuleDsl.g:467:2: ( ( rule__ComplexOperand__Group__0 ) )
            {
            // InternalRuleDsl.g:467:2: ( ( rule__ComplexOperand__Group__0 ) )
            // InternalRuleDsl.g:468:3: ( rule__ComplexOperand__Group__0 )
            {
             before(grammarAccess.getComplexOperandAccess().getGroup()); 
            // InternalRuleDsl.g:469:3: ( rule__ComplexOperand__Group__0 )
            // InternalRuleDsl.g:469:4: rule__ComplexOperand__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexOperand__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexOperandAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexOperand"


    // $ANTLR start "rule__RuleElement__Alternatives"
    // InternalRuleDsl.g:477:1: rule__RuleElement__Alternatives : ( ( ruleQuery ) | ( ruleRule ) );
    public final void rule__RuleElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:481:1: ( ( ruleQuery ) | ( ruleRule ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalRuleDsl.g:482:2: ( ruleQuery )
                    {
                    // InternalRuleDsl.g:482:2: ( ruleQuery )
                    // InternalRuleDsl.g:483:3: ruleQuery
                    {
                     before(grammarAccess.getRuleElementAccess().getQueryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQuery();

                    state._fsp--;

                     after(grammarAccess.getRuleElementAccess().getQueryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:488:2: ( ruleRule )
                    {
                    // InternalRuleDsl.g:488:2: ( ruleRule )
                    // InternalRuleDsl.g:489:3: ruleRule
                    {
                     before(grammarAccess.getRuleElementAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getRuleElementAccess().getRuleParserRuleCall_1()); 

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
    // $ANTLR end "rule__RuleElement__Alternatives"


    // $ANTLR start "rule__Select__Alternatives"
    // InternalRuleDsl.g:498:1: rule__Select__Alternatives : ( ( ruleAddingSelect ) | ( ruleSetSelect ) );
    public final void rule__Select__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:502:1: ( ( ruleAddingSelect ) | ( ruleSetSelect ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_SELECTOPERATOR) ) {
                alt3=1;
            }
            else if ( (LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRuleDsl.g:503:2: ( ruleAddingSelect )
                    {
                    // InternalRuleDsl.g:503:2: ( ruleAddingSelect )
                    // InternalRuleDsl.g:504:3: ruleAddingSelect
                    {
                     before(grammarAccess.getSelectAccess().getAddingSelectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAddingSelect();

                    state._fsp--;

                     after(grammarAccess.getSelectAccess().getAddingSelectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:509:2: ( ruleSetSelect )
                    {
                    // InternalRuleDsl.g:509:2: ( ruleSetSelect )
                    // InternalRuleDsl.g:510:3: ruleSetSelect
                    {
                     before(grammarAccess.getSelectAccess().getSetSelectParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSetSelect();

                    state._fsp--;

                     after(grammarAccess.getSelectAccess().getSetSelectParserRuleCall_1()); 

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
    // $ANTLR end "rule__Select__Alternatives"


    // $ANTLR start "rule__SetSelect__Alternatives_2"
    // InternalRuleDsl.g:519:1: rule__SetSelect__Alternatives_2 : ( ( ( rule__SetSelect__Group_2_0__0 )? ) | ( ( rule__SetSelect__AllAssignment_2_1 ) ) );
    public final void rule__SetSelect__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:523:1: ( ( ( rule__SetSelect__Group_2_0__0 )? ) | ( ( rule__SetSelect__AllAssignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF||(LA5_0>=RULE_ID && LA5_0<=RULE_SETOPERATOR)||LA5_0==16||(LA5_0>=21 && LA5_0<=22)||LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRuleDsl.g:524:2: ( ( rule__SetSelect__Group_2_0__0 )? )
                    {
                    // InternalRuleDsl.g:524:2: ( ( rule__SetSelect__Group_2_0__0 )? )
                    // InternalRuleDsl.g:525:3: ( rule__SetSelect__Group_2_0__0 )?
                    {
                     before(grammarAccess.getSetSelectAccess().getGroup_2_0()); 
                    // InternalRuleDsl.g:526:3: ( rule__SetSelect__Group_2_0__0 )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==RULE_ID) ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1==EOF||(LA4_1>=RULE_ID && LA4_1<=RULE_SETOPERATOR)||LA4_1==16||(LA4_1>=21 && LA4_1<=22)||LA4_1==24||LA4_1==27) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalRuleDsl.g:526:4: rule__SetSelect__Group_2_0__0
                            {
                            pushFollow(FOLLOW_2);
                            rule__SetSelect__Group_2_0__0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getSetSelectAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:530:2: ( ( rule__SetSelect__AllAssignment_2_1 ) )
                    {
                    // InternalRuleDsl.g:530:2: ( ( rule__SetSelect__AllAssignment_2_1 ) )
                    // InternalRuleDsl.g:531:3: ( rule__SetSelect__AllAssignment_2_1 )
                    {
                     before(grammarAccess.getSetSelectAccess().getAllAssignment_2_1()); 
                    // InternalRuleDsl.g:532:3: ( rule__SetSelect__AllAssignment_2_1 )
                    // InternalRuleDsl.g:532:4: rule__SetSelect__AllAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetSelect__AllAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSetSelectAccess().getAllAssignment_2_1()); 

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
    // $ANTLR end "rule__SetSelect__Alternatives_2"


    // $ANTLR start "rule__AddingSelect__Alternatives_1"
    // InternalRuleDsl.g:540:1: rule__AddingSelect__Alternatives_1 : ( ( ( rule__AddingSelect__ElementAssignment_1_0 )? ) | ( ( rule__AddingSelect__AllAssignment_1_1 ) ) );
    public final void rule__AddingSelect__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:544:1: ( ( ( rule__AddingSelect__ElementAssignment_1_0 )? ) | ( ( rule__AddingSelect__AllAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==EOF||LA7_0==RULE_ID||LA7_0==16||(LA7_0>=21 && LA7_0<=22)||LA7_0==24) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRuleDsl.g:545:2: ( ( rule__AddingSelect__ElementAssignment_1_0 )? )
                    {
                    // InternalRuleDsl.g:545:2: ( ( rule__AddingSelect__ElementAssignment_1_0 )? )
                    // InternalRuleDsl.g:546:3: ( rule__AddingSelect__ElementAssignment_1_0 )?
                    {
                     before(grammarAccess.getAddingSelectAccess().getElementAssignment_1_0()); 
                    // InternalRuleDsl.g:547:3: ( rule__AddingSelect__ElementAssignment_1_0 )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) ) {
                        int LA6_1 = input.LA(2);

                        if ( (LA6_1==EOF||LA6_1==RULE_ID||LA6_1==16||(LA6_1>=21 && LA6_1<=22)||LA6_1==24) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalRuleDsl.g:547:4: rule__AddingSelect__ElementAssignment_1_0
                            {
                            pushFollow(FOLLOW_2);
                            rule__AddingSelect__ElementAssignment_1_0();

                            state._fsp--;


                            }
                            break;

                    }

                     after(grammarAccess.getAddingSelectAccess().getElementAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:551:2: ( ( rule__AddingSelect__AllAssignment_1_1 ) )
                    {
                    // InternalRuleDsl.g:551:2: ( ( rule__AddingSelect__AllAssignment_1_1 ) )
                    // InternalRuleDsl.g:552:3: ( rule__AddingSelect__AllAssignment_1_1 )
                    {
                     before(grammarAccess.getAddingSelectAccess().getAllAssignment_1_1()); 
                    // InternalRuleDsl.g:553:3: ( rule__AddingSelect__AllAssignment_1_1 )
                    // InternalRuleDsl.g:553:4: rule__AddingSelect__AllAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AddingSelect__AllAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAddingSelectAccess().getAllAssignment_1_1()); 

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
    // $ANTLR end "rule__AddingSelect__Alternatives_1"


    // $ANTLR start "rule__Where__Alternatives_3"
    // InternalRuleDsl.g:561:1: rule__Where__Alternatives_3 : ( ( ( rule__Where__RightVariableAssignment_3_0 ) ) | ( ( rule__Where__RightAssignment_3_1 ) ) );
    public final void rule__Where__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:565:1: ( ( ( rule__Where__RightVariableAssignment_3_0 ) ) | ( ( rule__Where__RightAssignment_3_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRuleDsl.g:566:2: ( ( rule__Where__RightVariableAssignment_3_0 ) )
                    {
                    // InternalRuleDsl.g:566:2: ( ( rule__Where__RightVariableAssignment_3_0 ) )
                    // InternalRuleDsl.g:567:3: ( rule__Where__RightVariableAssignment_3_0 )
                    {
                     before(grammarAccess.getWhereAccess().getRightVariableAssignment_3_0()); 
                    // InternalRuleDsl.g:568:3: ( rule__Where__RightVariableAssignment_3_0 )
                    // InternalRuleDsl.g:568:4: rule__Where__RightVariableAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Where__RightVariableAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereAccess().getRightVariableAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:572:2: ( ( rule__Where__RightAssignment_3_1 ) )
                    {
                    // InternalRuleDsl.g:572:2: ( ( rule__Where__RightAssignment_3_1 ) )
                    // InternalRuleDsl.g:573:3: ( rule__Where__RightAssignment_3_1 )
                    {
                     before(grammarAccess.getWhereAccess().getRightAssignment_3_1()); 
                    // InternalRuleDsl.g:574:3: ( rule__Where__RightAssignment_3_1 )
                    // InternalRuleDsl.g:574:4: rule__Where__RightAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Where__RightAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereAccess().getRightAssignment_3_1()); 

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
    // $ANTLR end "rule__Where__Alternatives_3"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalRuleDsl.g:582:1: rule__Expression__Alternatives : ( ( rulePlainExpression ) | ( ruleComplexExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:586:1: ( ( rulePlainExpression ) | ( ruleComplexExpression ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==RULE_DOUBLE) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRuleDsl.g:587:2: ( rulePlainExpression )
                    {
                    // InternalRuleDsl.g:587:2: ( rulePlainExpression )
                    // InternalRuleDsl.g:588:3: rulePlainExpression
                    {
                     before(grammarAccess.getExpressionAccess().getPlainExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePlainExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getPlainExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:593:2: ( ruleComplexExpression )
                    {
                    // InternalRuleDsl.g:593:2: ( ruleComplexExpression )
                    // InternalRuleDsl.g:594:3: ruleComplexExpression
                    {
                     before(grammarAccess.getExpressionAccess().getComplexExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getComplexExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__PlainOperand__Alternatives"
    // InternalRuleDsl.g:603:1: rule__PlainOperand__Alternatives : ( ( ruleNumeral ) | ( ruleQueryOperand ) );
    public final void rule__PlainOperand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:607:1: ( ( ruleNumeral ) | ( ruleQueryOperand ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOUBLE) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRuleDsl.g:608:2: ( ruleNumeral )
                    {
                    // InternalRuleDsl.g:608:2: ( ruleNumeral )
                    // InternalRuleDsl.g:609:3: ruleNumeral
                    {
                     before(grammarAccess.getPlainOperandAccess().getNumeralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumeral();

                    state._fsp--;

                     after(grammarAccess.getPlainOperandAccess().getNumeralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:614:2: ( ruleQueryOperand )
                    {
                    // InternalRuleDsl.g:614:2: ( ruleQueryOperand )
                    // InternalRuleDsl.g:615:3: ruleQueryOperand
                    {
                     before(grammarAccess.getPlainOperandAccess().getQueryOperandParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryOperand();

                    state._fsp--;

                     after(grammarAccess.getPlainOperandAccess().getQueryOperandParserRuleCall_1()); 

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
    // $ANTLR end "rule__PlainOperand__Alternatives"


    // $ANTLR start "rule__RuleModel__Group__0"
    // InternalRuleDsl.g:624:1: rule__RuleModel__Group__0 : rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1 ;
    public final void rule__RuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:628:1: ( rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1 )
            // InternalRuleDsl.g:629:2: rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RuleModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group__0"


    // $ANTLR start "rule__RuleModel__Group__0__Impl"
    // InternalRuleDsl.g:636:1: rule__RuleModel__Group__0__Impl : ( ( rule__RuleModel__ElementsAssignment_0 ) ) ;
    public final void rule__RuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:640:1: ( ( ( rule__RuleModel__ElementsAssignment_0 ) ) )
            // InternalRuleDsl.g:641:1: ( ( rule__RuleModel__ElementsAssignment_0 ) )
            {
            // InternalRuleDsl.g:641:1: ( ( rule__RuleModel__ElementsAssignment_0 ) )
            // InternalRuleDsl.g:642:2: ( rule__RuleModel__ElementsAssignment_0 )
            {
             before(grammarAccess.getRuleModelAccess().getElementsAssignment_0()); 
            // InternalRuleDsl.g:643:2: ( rule__RuleModel__ElementsAssignment_0 )
            // InternalRuleDsl.g:643:3: rule__RuleModel__ElementsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleModel__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleModelAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group__0__Impl"


    // $ANTLR start "rule__RuleModel__Group__1"
    // InternalRuleDsl.g:651:1: rule__RuleModel__Group__1 : rule__RuleModel__Group__1__Impl ;
    public final void rule__RuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:655:1: ( rule__RuleModel__Group__1__Impl )
            // InternalRuleDsl.g:656:2: rule__RuleModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group__1"


    // $ANTLR start "rule__RuleModel__Group__1__Impl"
    // InternalRuleDsl.g:662:1: rule__RuleModel__Group__1__Impl : ( ( rule__RuleModel__ElementsAssignment_1 )* ) ;
    public final void rule__RuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:666:1: ( ( ( rule__RuleModel__ElementsAssignment_1 )* ) )
            // InternalRuleDsl.g:667:1: ( ( rule__RuleModel__ElementsAssignment_1 )* )
            {
            // InternalRuleDsl.g:667:1: ( ( rule__RuleModel__ElementsAssignment_1 )* )
            // InternalRuleDsl.g:668:2: ( rule__RuleModel__ElementsAssignment_1 )*
            {
             before(grammarAccess.getRuleModelAccess().getElementsAssignment_1()); 
            // InternalRuleDsl.g:669:2: ( rule__RuleModel__ElementsAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRuleDsl.g:669:3: rule__RuleModel__ElementsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RuleModel__ElementsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getRuleModelAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalRuleDsl.g:678:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:682:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRuleDsl.g:683:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalRuleDsl.g:690:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:694:1: ( ( 'rule' ) )
            // InternalRuleDsl.g:695:1: ( 'rule' )
            {
            // InternalRuleDsl.g:695:1: ( 'rule' )
            // InternalRuleDsl.g:696:2: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalRuleDsl.g:705:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:709:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRuleDsl.g:710:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalRuleDsl.g:717:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:721:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // InternalRuleDsl.g:722:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // InternalRuleDsl.g:722:1: ( ( rule__Rule__NameAssignment_1 ) )
            // InternalRuleDsl.g:723:2: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // InternalRuleDsl.g:724:2: ( rule__Rule__NameAssignment_1 )
            // InternalRuleDsl.g:724:3: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalRuleDsl.g:732:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:736:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRuleDsl.g:737:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalRuleDsl.g:744:1: rule__Rule__Group__2__Impl : ( '=' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:748:1: ( ( '=' ) )
            // InternalRuleDsl.g:749:1: ( '=' )
            {
            // InternalRuleDsl.g:749:1: ( '=' )
            // InternalRuleDsl.g:750:2: '='
            {
             before(grammarAccess.getRuleAccess().getEqualsSignKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalRuleDsl.g:759:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:763:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRuleDsl.g:764:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalRuleDsl.g:771:1: rule__Rule__Group__3__Impl : ( '(' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:775:1: ( ( '(' ) )
            // InternalRuleDsl.g:776:1: ( '(' )
            {
            // InternalRuleDsl.g:776:1: ( '(' )
            // InternalRuleDsl.g:777:2: '('
            {
             before(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalRuleDsl.g:786:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:790:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalRuleDsl.g:791:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalRuleDsl.g:798:1: rule__Rule__Group__4__Impl : ( 'on' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:802:1: ( ( 'on' ) )
            // InternalRuleDsl.g:803:1: ( 'on' )
            {
            // InternalRuleDsl.g:803:1: ( 'on' )
            // InternalRuleDsl.g:804:2: 'on'
            {
             before(grammarAccess.getRuleAccess().getOnKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getOnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // InternalRuleDsl.g:813:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:817:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalRuleDsl.g:818:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // InternalRuleDsl.g:825:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__EventAssignment_5 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:829:1: ( ( ( rule__Rule__EventAssignment_5 ) ) )
            // InternalRuleDsl.g:830:1: ( ( rule__Rule__EventAssignment_5 ) )
            {
            // InternalRuleDsl.g:830:1: ( ( rule__Rule__EventAssignment_5 ) )
            // InternalRuleDsl.g:831:2: ( rule__Rule__EventAssignment_5 )
            {
             before(grammarAccess.getRuleAccess().getEventAssignment_5()); 
            // InternalRuleDsl.g:832:2: ( rule__Rule__EventAssignment_5 )
            // InternalRuleDsl.g:832:3: rule__Rule__EventAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Rule__EventAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEventAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group__6"
    // InternalRuleDsl.g:840:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:844:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalRuleDsl.g:845:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Rule__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6"


    // $ANTLR start "rule__Rule__Group__6__Impl"
    // InternalRuleDsl.g:852:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 )? ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:856:1: ( ( ( rule__Rule__Group_6__0 )? ) )
            // InternalRuleDsl.g:857:1: ( ( rule__Rule__Group_6__0 )? )
            {
            // InternalRuleDsl.g:857:1: ( ( rule__Rule__Group_6__0 )? )
            // InternalRuleDsl.g:858:2: ( rule__Rule__Group_6__0 )?
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalRuleDsl.g:859:2: ( rule__Rule__Group_6__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRuleDsl.g:859:3: rule__Rule__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__6__Impl"


    // $ANTLR start "rule__Rule__Group__7"
    // InternalRuleDsl.g:867:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:871:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalRuleDsl.g:872:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7"


    // $ANTLR start "rule__Rule__Group__7__Impl"
    // InternalRuleDsl.g:879:1: rule__Rule__Group__7__Impl : ( 'do' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:883:1: ( ( 'do' ) )
            // InternalRuleDsl.g:884:1: ( 'do' )
            {
            // InternalRuleDsl.g:884:1: ( 'do' )
            // InternalRuleDsl.g:885:2: 'do'
            {
             before(grammarAccess.getRuleAccess().getDoKeyword_7()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getDoKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__7__Impl"


    // $ANTLR start "rule__Rule__Group__8"
    // InternalRuleDsl.g:894:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl rule__Rule__Group__9 ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:898:1: ( rule__Rule__Group__8__Impl rule__Rule__Group__9 )
            // InternalRuleDsl.g:899:2: rule__Rule__Group__8__Impl rule__Rule__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Rule__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8"


    // $ANTLR start "rule__Rule__Group__8__Impl"
    // InternalRuleDsl.g:906:1: rule__Rule__Group__8__Impl : ( ( rule__Rule__Group_8__0 ) ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:910:1: ( ( ( rule__Rule__Group_8__0 ) ) )
            // InternalRuleDsl.g:911:1: ( ( rule__Rule__Group_8__0 ) )
            {
            // InternalRuleDsl.g:911:1: ( ( rule__Rule__Group_8__0 ) )
            // InternalRuleDsl.g:912:2: ( rule__Rule__Group_8__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup_8()); 
            // InternalRuleDsl.g:913:2: ( rule__Rule__Group_8__0 )
            // InternalRuleDsl.g:913:3: rule__Rule__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__8__Impl"


    // $ANTLR start "rule__Rule__Group__9"
    // InternalRuleDsl.g:921:1: rule__Rule__Group__9 : rule__Rule__Group__9__Impl ;
    public final void rule__Rule__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:925:1: ( rule__Rule__Group__9__Impl )
            // InternalRuleDsl.g:926:2: rule__Rule__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9"


    // $ANTLR start "rule__Rule__Group__9__Impl"
    // InternalRuleDsl.g:932:1: rule__Rule__Group__9__Impl : ( ')' ) ;
    public final void rule__Rule__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:936:1: ( ( ')' ) )
            // InternalRuleDsl.g:937:1: ( ')' )
            {
            // InternalRuleDsl.g:937:1: ( ')' )
            // InternalRuleDsl.g:938:2: ')'
            {
             before(grammarAccess.getRuleAccess().getRightParenthesisKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__9__Impl"


    // $ANTLR start "rule__Rule__Group_6__0"
    // InternalRuleDsl.g:948:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:952:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalRuleDsl.g:953:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__0"


    // $ANTLR start "rule__Rule__Group_6__0__Impl"
    // InternalRuleDsl.g:960:1: rule__Rule__Group_6__0__Impl : ( '{' ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:964:1: ( ( '{' ) )
            // InternalRuleDsl.g:965:1: ( '{' )
            {
            // InternalRuleDsl.g:965:1: ( '{' )
            // InternalRuleDsl.g:966:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__0__Impl"


    // $ANTLR start "rule__Rule__Group_6__1"
    // InternalRuleDsl.g:975:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:979:1: ( rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2 )
            // InternalRuleDsl.g:980:2: rule__Rule__Group_6__1__Impl rule__Rule__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__Rule__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__1"


    // $ANTLR start "rule__Rule__Group_6__1__Impl"
    // InternalRuleDsl.g:987:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__ConditionAssignment_6_1 )? ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:991:1: ( ( ( rule__Rule__ConditionAssignment_6_1 )? ) )
            // InternalRuleDsl.g:992:1: ( ( rule__Rule__ConditionAssignment_6_1 )? )
            {
            // InternalRuleDsl.g:992:1: ( ( rule__Rule__ConditionAssignment_6_1 )? )
            // InternalRuleDsl.g:993:2: ( rule__Rule__ConditionAssignment_6_1 )?
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_6_1()); 
            // InternalRuleDsl.g:994:2: ( rule__Rule__ConditionAssignment_6_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRuleDsl.g:994:3: rule__Rule__ConditionAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rule__ConditionAssignment_6_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__1__Impl"


    // $ANTLR start "rule__Rule__Group_6__2"
    // InternalRuleDsl.g:1002:1: rule__Rule__Group_6__2 : rule__Rule__Group_6__2__Impl ;
    public final void rule__Rule__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1006:1: ( rule__Rule__Group_6__2__Impl )
            // InternalRuleDsl.g:1007:2: rule__Rule__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__2"


    // $ANTLR start "rule__Rule__Group_6__2__Impl"
    // InternalRuleDsl.g:1013:1: rule__Rule__Group_6__2__Impl : ( '}' ) ;
    public final void rule__Rule__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1017:1: ( ( '}' ) )
            // InternalRuleDsl.g:1018:1: ( '}' )
            {
            // InternalRuleDsl.g:1018:1: ( '}' )
            // InternalRuleDsl.g:1019:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_6__2__Impl"


    // $ANTLR start "rule__Rule__Group_8__0"
    // InternalRuleDsl.g:1029:1: rule__Rule__Group_8__0 : rule__Rule__Group_8__0__Impl rule__Rule__Group_8__1 ;
    public final void rule__Rule__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1033:1: ( rule__Rule__Group_8__0__Impl rule__Rule__Group_8__1 )
            // InternalRuleDsl.g:1034:2: rule__Rule__Group_8__0__Impl rule__Rule__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__Rule__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_8__0"


    // $ANTLR start "rule__Rule__Group_8__0__Impl"
    // InternalRuleDsl.g:1041:1: rule__Rule__Group_8__0__Impl : ( ( rule__Rule__ActionsAssignment_8_0 ) ) ;
    public final void rule__Rule__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1045:1: ( ( ( rule__Rule__ActionsAssignment_8_0 ) ) )
            // InternalRuleDsl.g:1046:1: ( ( rule__Rule__ActionsAssignment_8_0 ) )
            {
            // InternalRuleDsl.g:1046:1: ( ( rule__Rule__ActionsAssignment_8_0 ) )
            // InternalRuleDsl.g:1047:2: ( rule__Rule__ActionsAssignment_8_0 )
            {
             before(grammarAccess.getRuleAccess().getActionsAssignment_8_0()); 
            // InternalRuleDsl.g:1048:2: ( rule__Rule__ActionsAssignment_8_0 )
            // InternalRuleDsl.g:1048:3: rule__Rule__ActionsAssignment_8_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionsAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionsAssignment_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_8__0__Impl"


    // $ANTLR start "rule__Rule__Group_8__1"
    // InternalRuleDsl.g:1056:1: rule__Rule__Group_8__1 : rule__Rule__Group_8__1__Impl ;
    public final void rule__Rule__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1060:1: ( rule__Rule__Group_8__1__Impl )
            // InternalRuleDsl.g:1061:2: rule__Rule__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_8__1"


    // $ANTLR start "rule__Rule__Group_8__1__Impl"
    // InternalRuleDsl.g:1067:1: rule__Rule__Group_8__1__Impl : ( ( rule__Rule__Group_8_1__0 )* ) ;
    public final void rule__Rule__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1071:1: ( ( ( rule__Rule__Group_8_1__0 )* ) )
            // InternalRuleDsl.g:1072:1: ( ( rule__Rule__Group_8_1__0 )* )
            {
            // InternalRuleDsl.g:1072:1: ( ( rule__Rule__Group_8_1__0 )* )
            // InternalRuleDsl.g:1073:2: ( rule__Rule__Group_8_1__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_8_1()); 
            // InternalRuleDsl.g:1074:2: ( rule__Rule__Group_8_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRuleDsl.g:1074:3: rule__Rule__Group_8_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Rule__Group_8_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_8__1__Impl"


    // $ANTLR start "rule__Rule__Group_8_1__0"
    // InternalRuleDsl.g:1083:1: rule__Rule__Group_8_1__0 : rule__Rule__Group_8_1__0__Impl rule__Rule__Group_8_1__1 ;
    public final void rule__Rule__Group_8_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1087:1: ( rule__Rule__Group_8_1__0__Impl rule__Rule__Group_8_1__1 )
            // InternalRuleDsl.g:1088:2: rule__Rule__Group_8_1__0__Impl rule__Rule__Group_8_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group_8_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_8_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_8_1__0"


    // $ANTLR start "rule__Rule__Group_8_1__0__Impl"
    // InternalRuleDsl.g:1095:1: rule__Rule__Group_8_1__0__Impl : ( ',' ) ;
    public final void rule__Rule__Group_8_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1099:1: ( ( ',' ) )
            // InternalRuleDsl.g:1100:1: ( ',' )
            {
            // InternalRuleDsl.g:1100:1: ( ',' )
            // InternalRuleDsl.g:1101:2: ','
            {
             before(grammarAccess.getRuleAccess().getCommaKeyword_8_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getCommaKeyword_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_8_1__0__Impl"


    // $ANTLR start "rule__Rule__Group_8_1__1"
    // InternalRuleDsl.g:1110:1: rule__Rule__Group_8_1__1 : rule__Rule__Group_8_1__1__Impl ;
    public final void rule__Rule__Group_8_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1114:1: ( rule__Rule__Group_8_1__1__Impl )
            // InternalRuleDsl.g:1115:2: rule__Rule__Group_8_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_8_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_8_1__1"


    // $ANTLR start "rule__Rule__Group_8_1__1__Impl"
    // InternalRuleDsl.g:1121:1: rule__Rule__Group_8_1__1__Impl : ( ( rule__Rule__ActionsAssignment_8_1_1 ) ) ;
    public final void rule__Rule__Group_8_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1125:1: ( ( ( rule__Rule__ActionsAssignment_8_1_1 ) ) )
            // InternalRuleDsl.g:1126:1: ( ( rule__Rule__ActionsAssignment_8_1_1 ) )
            {
            // InternalRuleDsl.g:1126:1: ( ( rule__Rule__ActionsAssignment_8_1_1 ) )
            // InternalRuleDsl.g:1127:2: ( rule__Rule__ActionsAssignment_8_1_1 )
            {
             before(grammarAccess.getRuleAccess().getActionsAssignment_8_1_1()); 
            // InternalRuleDsl.g:1128:2: ( rule__Rule__ActionsAssignment_8_1_1 )
            // InternalRuleDsl.g:1128:3: rule__Rule__ActionsAssignment_8_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionsAssignment_8_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionsAssignment_8_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_8_1__1__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalRuleDsl.g:1137:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1141:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalRuleDsl.g:1142:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Query__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0"


    // $ANTLR start "rule__Query__Group__0__Impl"
    // InternalRuleDsl.g:1149:1: rule__Query__Group__0__Impl : ( ( rule__Query__NameAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1153:1: ( ( ( rule__Query__NameAssignment_0 ) ) )
            // InternalRuleDsl.g:1154:1: ( ( rule__Query__NameAssignment_0 ) )
            {
            // InternalRuleDsl.g:1154:1: ( ( rule__Query__NameAssignment_0 ) )
            // InternalRuleDsl.g:1155:2: ( rule__Query__NameAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_0()); 
            // InternalRuleDsl.g:1156:2: ( rule__Query__NameAssignment_0 )
            // InternalRuleDsl.g:1156:3: rule__Query__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__0__Impl"


    // $ANTLR start "rule__Query__Group__1"
    // InternalRuleDsl.g:1164:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1168:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalRuleDsl.g:1169:2: rule__Query__Group__1__Impl rule__Query__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Query__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1"


    // $ANTLR start "rule__Query__Group__1__Impl"
    // InternalRuleDsl.g:1176:1: rule__Query__Group__1__Impl : ( ':' ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1180:1: ( ( ':' ) )
            // InternalRuleDsl.g:1181:1: ( ':' )
            {
            // InternalRuleDsl.g:1181:1: ( ':' )
            // InternalRuleDsl.g:1182:2: ':'
            {
             before(grammarAccess.getQueryAccess().getColonKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__1__Impl"


    // $ANTLR start "rule__Query__Group__2"
    // InternalRuleDsl.g:1191:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1195:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalRuleDsl.g:1196:2: rule__Query__Group__2__Impl rule__Query__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Query__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2"


    // $ANTLR start "rule__Query__Group__2__Impl"
    // InternalRuleDsl.g:1203:1: rule__Query__Group__2__Impl : ( ( rule__Query__SelectAssignment_2 ) ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1207:1: ( ( ( rule__Query__SelectAssignment_2 ) ) )
            // InternalRuleDsl.g:1208:1: ( ( rule__Query__SelectAssignment_2 ) )
            {
            // InternalRuleDsl.g:1208:1: ( ( rule__Query__SelectAssignment_2 ) )
            // InternalRuleDsl.g:1209:2: ( rule__Query__SelectAssignment_2 )
            {
             before(grammarAccess.getQueryAccess().getSelectAssignment_2()); 
            // InternalRuleDsl.g:1210:2: ( rule__Query__SelectAssignment_2 )
            // InternalRuleDsl.g:1210:3: rule__Query__SelectAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Query__SelectAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getSelectAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__2__Impl"


    // $ANTLR start "rule__Query__Group__3"
    // InternalRuleDsl.g:1218:1: rule__Query__Group__3 : rule__Query__Group__3__Impl ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1222:1: ( rule__Query__Group__3__Impl )
            // InternalRuleDsl.g:1223:2: rule__Query__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3"


    // $ANTLR start "rule__Query__Group__3__Impl"
    // InternalRuleDsl.g:1229:1: rule__Query__Group__3__Impl : ( ( rule__Query__Group_3__0 )? ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1233:1: ( ( ( rule__Query__Group_3__0 )? ) )
            // InternalRuleDsl.g:1234:1: ( ( rule__Query__Group_3__0 )? )
            {
            // InternalRuleDsl.g:1234:1: ( ( rule__Query__Group_3__0 )? )
            // InternalRuleDsl.g:1235:2: ( rule__Query__Group_3__0 )?
            {
             before(grammarAccess.getQueryAccess().getGroup_3()); 
            // InternalRuleDsl.g:1236:2: ( rule__Query__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRuleDsl.g:1236:3: rule__Query__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__3__Impl"


    // $ANTLR start "rule__Query__Group_3__0"
    // InternalRuleDsl.g:1245:1: rule__Query__Group_3__0 : rule__Query__Group_3__0__Impl rule__Query__Group_3__1 ;
    public final void rule__Query__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1249:1: ( rule__Query__Group_3__0__Impl rule__Query__Group_3__1 )
            // InternalRuleDsl.g:1250:2: rule__Query__Group_3__0__Impl rule__Query__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__Query__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_3__0"


    // $ANTLR start "rule__Query__Group_3__0__Impl"
    // InternalRuleDsl.g:1257:1: rule__Query__Group_3__0__Impl : ( '{' ) ;
    public final void rule__Query__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1261:1: ( ( '{' ) )
            // InternalRuleDsl.g:1262:1: ( '{' )
            {
            // InternalRuleDsl.g:1262:1: ( '{' )
            // InternalRuleDsl.g:1263:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_3__0__Impl"


    // $ANTLR start "rule__Query__Group_3__1"
    // InternalRuleDsl.g:1272:1: rule__Query__Group_3__1 : rule__Query__Group_3__1__Impl rule__Query__Group_3__2 ;
    public final void rule__Query__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1276:1: ( rule__Query__Group_3__1__Impl rule__Query__Group_3__2 )
            // InternalRuleDsl.g:1277:2: rule__Query__Group_3__1__Impl rule__Query__Group_3__2
            {
            pushFollow(FOLLOW_18);
            rule__Query__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_3__1"


    // $ANTLR start "rule__Query__Group_3__1__Impl"
    // InternalRuleDsl.g:1284:1: rule__Query__Group_3__1__Impl : ( ( rule__Query__WhereAssignment_3_1 ) ) ;
    public final void rule__Query__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1288:1: ( ( ( rule__Query__WhereAssignment_3_1 ) ) )
            // InternalRuleDsl.g:1289:1: ( ( rule__Query__WhereAssignment_3_1 ) )
            {
            // InternalRuleDsl.g:1289:1: ( ( rule__Query__WhereAssignment_3_1 ) )
            // InternalRuleDsl.g:1290:2: ( rule__Query__WhereAssignment_3_1 )
            {
             before(grammarAccess.getQueryAccess().getWhereAssignment_3_1()); 
            // InternalRuleDsl.g:1291:2: ( rule__Query__WhereAssignment_3_1 )
            // InternalRuleDsl.g:1291:3: rule__Query__WhereAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Query__WhereAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getWhereAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_3__1__Impl"


    // $ANTLR start "rule__Query__Group_3__2"
    // InternalRuleDsl.g:1299:1: rule__Query__Group_3__2 : rule__Query__Group_3__2__Impl ;
    public final void rule__Query__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1303:1: ( rule__Query__Group_3__2__Impl )
            // InternalRuleDsl.g:1304:2: rule__Query__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_3__2"


    // $ANTLR start "rule__Query__Group_3__2__Impl"
    // InternalRuleDsl.g:1310:1: rule__Query__Group_3__2__Impl : ( '}' ) ;
    public final void rule__Query__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1314:1: ( ( '}' ) )
            // InternalRuleDsl.g:1315:1: ( '}' )
            {
            // InternalRuleDsl.g:1315:1: ( '}' )
            // InternalRuleDsl.g:1316:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_3__2__Impl"


    // $ANTLR start "rule__SetSelect__Group__0"
    // InternalRuleDsl.g:1326:1: rule__SetSelect__Group__0 : rule__SetSelect__Group__0__Impl rule__SetSelect__Group__1 ;
    public final void rule__SetSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1330:1: ( rule__SetSelect__Group__0__Impl rule__SetSelect__Group__1 )
            // InternalRuleDsl.g:1331:2: rule__SetSelect__Group__0__Impl rule__SetSelect__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__SetSelect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__0"


    // $ANTLR start "rule__SetSelect__Group__0__Impl"
    // InternalRuleDsl.g:1338:1: rule__SetSelect__Group__0__Impl : ( () ) ;
    public final void rule__SetSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1342:1: ( ( () ) )
            // InternalRuleDsl.g:1343:1: ( () )
            {
            // InternalRuleDsl.g:1343:1: ( () )
            // InternalRuleDsl.g:1344:2: ()
            {
             before(grammarAccess.getSetSelectAccess().getSetSelectAction_0()); 
            // InternalRuleDsl.g:1345:2: ()
            // InternalRuleDsl.g:1345:3: 
            {
            }

             after(grammarAccess.getSetSelectAccess().getSetSelectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__0__Impl"


    // $ANTLR start "rule__SetSelect__Group__1"
    // InternalRuleDsl.g:1353:1: rule__SetSelect__Group__1 : rule__SetSelect__Group__1__Impl rule__SetSelect__Group__2 ;
    public final void rule__SetSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1357:1: ( rule__SetSelect__Group__1__Impl rule__SetSelect__Group__2 )
            // InternalRuleDsl.g:1358:2: rule__SetSelect__Group__1__Impl rule__SetSelect__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__SetSelect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__1"


    // $ANTLR start "rule__SetSelect__Group__1__Impl"
    // InternalRuleDsl.g:1365:1: rule__SetSelect__Group__1__Impl : ( 'select' ) ;
    public final void rule__SetSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1369:1: ( ( 'select' ) )
            // InternalRuleDsl.g:1370:1: ( 'select' )
            {
            // InternalRuleDsl.g:1370:1: ( 'select' )
            // InternalRuleDsl.g:1371:2: 'select'
            {
             before(grammarAccess.getSetSelectAccess().getSelectKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getSelectKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__1__Impl"


    // $ANTLR start "rule__SetSelect__Group__2"
    // InternalRuleDsl.g:1380:1: rule__SetSelect__Group__2 : rule__SetSelect__Group__2__Impl rule__SetSelect__Group__3 ;
    public final void rule__SetSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1384:1: ( rule__SetSelect__Group__2__Impl rule__SetSelect__Group__3 )
            // InternalRuleDsl.g:1385:2: rule__SetSelect__Group__2__Impl rule__SetSelect__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SetSelect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__2"


    // $ANTLR start "rule__SetSelect__Group__2__Impl"
    // InternalRuleDsl.g:1392:1: rule__SetSelect__Group__2__Impl : ( ( rule__SetSelect__Alternatives_2 ) ) ;
    public final void rule__SetSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1396:1: ( ( ( rule__SetSelect__Alternatives_2 ) ) )
            // InternalRuleDsl.g:1397:1: ( ( rule__SetSelect__Alternatives_2 ) )
            {
            // InternalRuleDsl.g:1397:1: ( ( rule__SetSelect__Alternatives_2 ) )
            // InternalRuleDsl.g:1398:2: ( rule__SetSelect__Alternatives_2 )
            {
             before(grammarAccess.getSetSelectAccess().getAlternatives_2()); 
            // InternalRuleDsl.g:1399:2: ( rule__SetSelect__Alternatives_2 )
            // InternalRuleDsl.g:1399:3: rule__SetSelect__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__2__Impl"


    // $ANTLR start "rule__SetSelect__Group__3"
    // InternalRuleDsl.g:1407:1: rule__SetSelect__Group__3 : rule__SetSelect__Group__3__Impl ;
    public final void rule__SetSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1411:1: ( rule__SetSelect__Group__3__Impl )
            // InternalRuleDsl.g:1412:2: rule__SetSelect__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__3"


    // $ANTLR start "rule__SetSelect__Group__3__Impl"
    // InternalRuleDsl.g:1418:1: rule__SetSelect__Group__3__Impl : ( ( rule__SetSelect__Group_3__0 )? ) ;
    public final void rule__SetSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1422:1: ( ( ( rule__SetSelect__Group_3__0 )? ) )
            // InternalRuleDsl.g:1423:1: ( ( rule__SetSelect__Group_3__0 )? )
            {
            // InternalRuleDsl.g:1423:1: ( ( rule__SetSelect__Group_3__0 )? )
            // InternalRuleDsl.g:1424:2: ( rule__SetSelect__Group_3__0 )?
            {
             before(grammarAccess.getSetSelectAccess().getGroup_3()); 
            // InternalRuleDsl.g:1425:2: ( rule__SetSelect__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_SETOPERATOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRuleDsl.g:1425:3: rule__SetSelect__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetSelect__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetSelectAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__3__Impl"


    // $ANTLR start "rule__SetSelect__Group_2_0__0"
    // InternalRuleDsl.g:1434:1: rule__SetSelect__Group_2_0__0 : rule__SetSelect__Group_2_0__0__Impl rule__SetSelect__Group_2_0__1 ;
    public final void rule__SetSelect__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1438:1: ( rule__SetSelect__Group_2_0__0__Impl rule__SetSelect__Group_2_0__1 )
            // InternalRuleDsl.g:1439:2: rule__SetSelect__Group_2_0__0__Impl rule__SetSelect__Group_2_0__1
            {
            pushFollow(FOLLOW_12);
            rule__SetSelect__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_0__0"


    // $ANTLR start "rule__SetSelect__Group_2_0__0__Impl"
    // InternalRuleDsl.g:1446:1: rule__SetSelect__Group_2_0__0__Impl : ( ( rule__SetSelect__SelectionAssignment_2_0_0 ) ) ;
    public final void rule__SetSelect__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1450:1: ( ( ( rule__SetSelect__SelectionAssignment_2_0_0 ) ) )
            // InternalRuleDsl.g:1451:1: ( ( rule__SetSelect__SelectionAssignment_2_0_0 ) )
            {
            // InternalRuleDsl.g:1451:1: ( ( rule__SetSelect__SelectionAssignment_2_0_0 ) )
            // InternalRuleDsl.g:1452:2: ( rule__SetSelect__SelectionAssignment_2_0_0 )
            {
             before(grammarAccess.getSetSelectAccess().getSelectionAssignment_2_0_0()); 
            // InternalRuleDsl.g:1453:2: ( rule__SetSelect__SelectionAssignment_2_0_0 )
            // InternalRuleDsl.g:1453:3: rule__SetSelect__SelectionAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__SelectionAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getSelectionAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_0__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_2_0__1"
    // InternalRuleDsl.g:1461:1: rule__SetSelect__Group_2_0__1 : rule__SetSelect__Group_2_0__1__Impl ;
    public final void rule__SetSelect__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1465:1: ( rule__SetSelect__Group_2_0__1__Impl )
            // InternalRuleDsl.g:1466:2: rule__SetSelect__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_0__1"


    // $ANTLR start "rule__SetSelect__Group_2_0__1__Impl"
    // InternalRuleDsl.g:1472:1: rule__SetSelect__Group_2_0__1__Impl : ( ( rule__SetSelect__Group_2_0_1__0 )* ) ;
    public final void rule__SetSelect__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1476:1: ( ( ( rule__SetSelect__Group_2_0_1__0 )* ) )
            // InternalRuleDsl.g:1477:1: ( ( rule__SetSelect__Group_2_0_1__0 )* )
            {
            // InternalRuleDsl.g:1477:1: ( ( rule__SetSelect__Group_2_0_1__0 )* )
            // InternalRuleDsl.g:1478:2: ( rule__SetSelect__Group_2_0_1__0 )*
            {
             before(grammarAccess.getSetSelectAccess().getGroup_2_0_1()); 
            // InternalRuleDsl.g:1479:2: ( rule__SetSelect__Group_2_0_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    int LA17_2 = input.LA(2);

                    if ( (LA17_2==RULE_ID) ) {
                        int LA17_3 = input.LA(3);

                        if ( (LA17_3==EOF||(LA17_3>=RULE_ID && LA17_3<=RULE_SETOPERATOR)||LA17_3==16||(LA17_3>=21 && LA17_3<=22)||LA17_3==24||LA17_3==27) ) {
                            alt17=1;
                        }


                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalRuleDsl.g:1479:3: rule__SetSelect__Group_2_0_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SetSelect__Group_2_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSetSelectAccess().getGroup_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_0__1__Impl"


    // $ANTLR start "rule__SetSelect__Group_2_0_1__0"
    // InternalRuleDsl.g:1488:1: rule__SetSelect__Group_2_0_1__0 : rule__SetSelect__Group_2_0_1__0__Impl rule__SetSelect__Group_2_0_1__1 ;
    public final void rule__SetSelect__Group_2_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1492:1: ( rule__SetSelect__Group_2_0_1__0__Impl rule__SetSelect__Group_2_0_1__1 )
            // InternalRuleDsl.g:1493:2: rule__SetSelect__Group_2_0_1__0__Impl rule__SetSelect__Group_2_0_1__1
            {
            pushFollow(FOLLOW_5);
            rule__SetSelect__Group_2_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_2_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_0_1__0"


    // $ANTLR start "rule__SetSelect__Group_2_0_1__0__Impl"
    // InternalRuleDsl.g:1500:1: rule__SetSelect__Group_2_0_1__0__Impl : ( ',' ) ;
    public final void rule__SetSelect__Group_2_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1504:1: ( ( ',' ) )
            // InternalRuleDsl.g:1505:1: ( ',' )
            {
            // InternalRuleDsl.g:1505:1: ( ',' )
            // InternalRuleDsl.g:1506:2: ','
            {
             before(grammarAccess.getSetSelectAccess().getCommaKeyword_2_0_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getCommaKeyword_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_0_1__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_2_0_1__1"
    // InternalRuleDsl.g:1515:1: rule__SetSelect__Group_2_0_1__1 : rule__SetSelect__Group_2_0_1__1__Impl ;
    public final void rule__SetSelect__Group_2_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1519:1: ( rule__SetSelect__Group_2_0_1__1__Impl )
            // InternalRuleDsl.g:1520:2: rule__SetSelect__Group_2_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_2_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_0_1__1"


    // $ANTLR start "rule__SetSelect__Group_2_0_1__1__Impl"
    // InternalRuleDsl.g:1526:1: rule__SetSelect__Group_2_0_1__1__Impl : ( ( rule__SetSelect__SelectionAssignment_2_0_1_1 ) ) ;
    public final void rule__SetSelect__Group_2_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1530:1: ( ( ( rule__SetSelect__SelectionAssignment_2_0_1_1 ) ) )
            // InternalRuleDsl.g:1531:1: ( ( rule__SetSelect__SelectionAssignment_2_0_1_1 ) )
            {
            // InternalRuleDsl.g:1531:1: ( ( rule__SetSelect__SelectionAssignment_2_0_1_1 ) )
            // InternalRuleDsl.g:1532:2: ( rule__SetSelect__SelectionAssignment_2_0_1_1 )
            {
             before(grammarAccess.getSetSelectAccess().getSelectionAssignment_2_0_1_1()); 
            // InternalRuleDsl.g:1533:2: ( rule__SetSelect__SelectionAssignment_2_0_1_1 )
            // InternalRuleDsl.g:1533:3: rule__SetSelect__SelectionAssignment_2_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__SelectionAssignment_2_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getSelectionAssignment_2_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_0_1__1__Impl"


    // $ANTLR start "rule__SetSelect__Group_3__0"
    // InternalRuleDsl.g:1542:1: rule__SetSelect__Group_3__0 : rule__SetSelect__Group_3__0__Impl rule__SetSelect__Group_3__1 ;
    public final void rule__SetSelect__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1546:1: ( rule__SetSelect__Group_3__0__Impl rule__SetSelect__Group_3__1 )
            // InternalRuleDsl.g:1547:2: rule__SetSelect__Group_3__0__Impl rule__SetSelect__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__SetSelect__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_3__0"


    // $ANTLR start "rule__SetSelect__Group_3__0__Impl"
    // InternalRuleDsl.g:1554:1: rule__SetSelect__Group_3__0__Impl : ( ( rule__SetSelect__OperatorAssignment_3_0 ) ) ;
    public final void rule__SetSelect__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1558:1: ( ( ( rule__SetSelect__OperatorAssignment_3_0 ) ) )
            // InternalRuleDsl.g:1559:1: ( ( rule__SetSelect__OperatorAssignment_3_0 ) )
            {
            // InternalRuleDsl.g:1559:1: ( ( rule__SetSelect__OperatorAssignment_3_0 ) )
            // InternalRuleDsl.g:1560:2: ( rule__SetSelect__OperatorAssignment_3_0 )
            {
             before(grammarAccess.getSetSelectAccess().getOperatorAssignment_3_0()); 
            // InternalRuleDsl.g:1561:2: ( rule__SetSelect__OperatorAssignment_3_0 )
            // InternalRuleDsl.g:1561:3: rule__SetSelect__OperatorAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__OperatorAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getOperatorAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_3__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_3__1"
    // InternalRuleDsl.g:1569:1: rule__SetSelect__Group_3__1 : rule__SetSelect__Group_3__1__Impl ;
    public final void rule__SetSelect__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1573:1: ( rule__SetSelect__Group_3__1__Impl )
            // InternalRuleDsl.g:1574:2: rule__SetSelect__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_3__1"


    // $ANTLR start "rule__SetSelect__Group_3__1__Impl"
    // InternalRuleDsl.g:1580:1: rule__SetSelect__Group_3__1__Impl : ( ( rule__SetSelect__SelectAssignment_3_1 ) ) ;
    public final void rule__SetSelect__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1584:1: ( ( ( rule__SetSelect__SelectAssignment_3_1 ) ) )
            // InternalRuleDsl.g:1585:1: ( ( rule__SetSelect__SelectAssignment_3_1 ) )
            {
            // InternalRuleDsl.g:1585:1: ( ( rule__SetSelect__SelectAssignment_3_1 ) )
            // InternalRuleDsl.g:1586:2: ( rule__SetSelect__SelectAssignment_3_1 )
            {
             before(grammarAccess.getSetSelectAccess().getSelectAssignment_3_1()); 
            // InternalRuleDsl.g:1587:2: ( rule__SetSelect__SelectAssignment_3_1 )
            // InternalRuleDsl.g:1587:3: rule__SetSelect__SelectAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__SelectAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getSelectAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_3__1__Impl"


    // $ANTLR start "rule__Selection__Group__0"
    // InternalRuleDsl.g:1596:1: rule__Selection__Group__0 : rule__Selection__Group__0__Impl rule__Selection__Group__1 ;
    public final void rule__Selection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1600:1: ( rule__Selection__Group__0__Impl rule__Selection__Group__1 )
            // InternalRuleDsl.g:1601:2: rule__Selection__Group__0__Impl rule__Selection__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Selection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0"


    // $ANTLR start "rule__Selection__Group__0__Impl"
    // InternalRuleDsl.g:1608:1: rule__Selection__Group__0__Impl : ( ( rule__Selection__Group_0__0 )? ) ;
    public final void rule__Selection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1612:1: ( ( ( rule__Selection__Group_0__0 )? ) )
            // InternalRuleDsl.g:1613:1: ( ( rule__Selection__Group_0__0 )? )
            {
            // InternalRuleDsl.g:1613:1: ( ( rule__Selection__Group_0__0 )? )
            // InternalRuleDsl.g:1614:2: ( rule__Selection__Group_0__0 )?
            {
             before(grammarAccess.getSelectionAccess().getGroup_0()); 
            // InternalRuleDsl.g:1615:2: ( rule__Selection__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==27) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==RULE_ID) ) {
                        alt18=1;
                    }
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalRuleDsl.g:1615:3: rule__Selection__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Selection__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__0__Impl"


    // $ANTLR start "rule__Selection__Group__1"
    // InternalRuleDsl.g:1623:1: rule__Selection__Group__1 : rule__Selection__Group__1__Impl ;
    public final void rule__Selection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1627:1: ( rule__Selection__Group__1__Impl )
            // InternalRuleDsl.g:1628:2: rule__Selection__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1"


    // $ANTLR start "rule__Selection__Group__1__Impl"
    // InternalRuleDsl.g:1634:1: rule__Selection__Group__1__Impl : ( ( rule__Selection__Group_1__0 ) ) ;
    public final void rule__Selection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1638:1: ( ( ( rule__Selection__Group_1__0 ) ) )
            // InternalRuleDsl.g:1639:1: ( ( rule__Selection__Group_1__0 ) )
            {
            // InternalRuleDsl.g:1639:1: ( ( rule__Selection__Group_1__0 ) )
            // InternalRuleDsl.g:1640:2: ( rule__Selection__Group_1__0 )
            {
             before(grammarAccess.getSelectionAccess().getGroup_1()); 
            // InternalRuleDsl.g:1641:2: ( rule__Selection__Group_1__0 )
            // InternalRuleDsl.g:1641:3: rule__Selection__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group__1__Impl"


    // $ANTLR start "rule__Selection__Group_0__0"
    // InternalRuleDsl.g:1650:1: rule__Selection__Group_0__0 : rule__Selection__Group_0__0__Impl rule__Selection__Group_0__1 ;
    public final void rule__Selection__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1654:1: ( rule__Selection__Group_0__0__Impl rule__Selection__Group_0__1 )
            // InternalRuleDsl.g:1655:2: rule__Selection__Group_0__0__Impl rule__Selection__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Selection__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_0__0"


    // $ANTLR start "rule__Selection__Group_0__0__Impl"
    // InternalRuleDsl.g:1662:1: rule__Selection__Group_0__0__Impl : ( ( rule__Selection__SelectorAssignment_0_0 ) ) ;
    public final void rule__Selection__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1666:1: ( ( ( rule__Selection__SelectorAssignment_0_0 ) ) )
            // InternalRuleDsl.g:1667:1: ( ( rule__Selection__SelectorAssignment_0_0 ) )
            {
            // InternalRuleDsl.g:1667:1: ( ( rule__Selection__SelectorAssignment_0_0 ) )
            // InternalRuleDsl.g:1668:2: ( rule__Selection__SelectorAssignment_0_0 )
            {
             before(grammarAccess.getSelectionAccess().getSelectorAssignment_0_0()); 
            // InternalRuleDsl.g:1669:2: ( rule__Selection__SelectorAssignment_0_0 )
            // InternalRuleDsl.g:1669:3: rule__Selection__SelectorAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Selection__SelectorAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getSelectorAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_0__0__Impl"


    // $ANTLR start "rule__Selection__Group_0__1"
    // InternalRuleDsl.g:1677:1: rule__Selection__Group_0__1 : rule__Selection__Group_0__1__Impl ;
    public final void rule__Selection__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1681:1: ( rule__Selection__Group_0__1__Impl )
            // InternalRuleDsl.g:1682:2: rule__Selection__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_0__1"


    // $ANTLR start "rule__Selection__Group_0__1__Impl"
    // InternalRuleDsl.g:1688:1: rule__Selection__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Selection__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1692:1: ( ( '.' ) )
            // InternalRuleDsl.g:1693:1: ( '.' )
            {
            // InternalRuleDsl.g:1693:1: ( '.' )
            // InternalRuleDsl.g:1694:2: '.'
            {
             before(grammarAccess.getSelectionAccess().getFullStopKeyword_0_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_0__1__Impl"


    // $ANTLR start "rule__Selection__Group_1__0"
    // InternalRuleDsl.g:1704:1: rule__Selection__Group_1__0 : rule__Selection__Group_1__0__Impl rule__Selection__Group_1__1 ;
    public final void rule__Selection__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1708:1: ( rule__Selection__Group_1__0__Impl rule__Selection__Group_1__1 )
            // InternalRuleDsl.g:1709:2: rule__Selection__Group_1__0__Impl rule__Selection__Group_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Selection__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1__0"


    // $ANTLR start "rule__Selection__Group_1__0__Impl"
    // InternalRuleDsl.g:1716:1: rule__Selection__Group_1__0__Impl : ( ( rule__Selection__RootAssignment_1_0 ) ) ;
    public final void rule__Selection__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1720:1: ( ( ( rule__Selection__RootAssignment_1_0 ) ) )
            // InternalRuleDsl.g:1721:1: ( ( rule__Selection__RootAssignment_1_0 ) )
            {
            // InternalRuleDsl.g:1721:1: ( ( rule__Selection__RootAssignment_1_0 ) )
            // InternalRuleDsl.g:1722:2: ( rule__Selection__RootAssignment_1_0 )
            {
             before(grammarAccess.getSelectionAccess().getRootAssignment_1_0()); 
            // InternalRuleDsl.g:1723:2: ( rule__Selection__RootAssignment_1_0 )
            // InternalRuleDsl.g:1723:3: rule__Selection__RootAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Selection__RootAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getRootAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1__0__Impl"


    // $ANTLR start "rule__Selection__Group_1__1"
    // InternalRuleDsl.g:1731:1: rule__Selection__Group_1__1 : rule__Selection__Group_1__1__Impl ;
    public final void rule__Selection__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1735:1: ( rule__Selection__Group_1__1__Impl )
            // InternalRuleDsl.g:1736:2: rule__Selection__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1__1"


    // $ANTLR start "rule__Selection__Group_1__1__Impl"
    // InternalRuleDsl.g:1742:1: rule__Selection__Group_1__1__Impl : ( ( rule__Selection__Group_1_1__0 )* ) ;
    public final void rule__Selection__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1746:1: ( ( ( rule__Selection__Group_1_1__0 )* ) )
            // InternalRuleDsl.g:1747:1: ( ( rule__Selection__Group_1_1__0 )* )
            {
            // InternalRuleDsl.g:1747:1: ( ( rule__Selection__Group_1_1__0 )* )
            // InternalRuleDsl.g:1748:2: ( rule__Selection__Group_1_1__0 )*
            {
             before(grammarAccess.getSelectionAccess().getGroup_1_1()); 
            // InternalRuleDsl.g:1749:2: ( rule__Selection__Group_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRuleDsl.g:1749:3: rule__Selection__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Selection__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSelectionAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1__1__Impl"


    // $ANTLR start "rule__Selection__Group_1_1__0"
    // InternalRuleDsl.g:1758:1: rule__Selection__Group_1_1__0 : rule__Selection__Group_1_1__0__Impl rule__Selection__Group_1_1__1 ;
    public final void rule__Selection__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1762:1: ( rule__Selection__Group_1_1__0__Impl rule__Selection__Group_1_1__1 )
            // InternalRuleDsl.g:1763:2: rule__Selection__Group_1_1__0__Impl rule__Selection__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Selection__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Selection__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1_1__0"


    // $ANTLR start "rule__Selection__Group_1_1__0__Impl"
    // InternalRuleDsl.g:1770:1: rule__Selection__Group_1_1__0__Impl : ( '.' ) ;
    public final void rule__Selection__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1774:1: ( ( '.' ) )
            // InternalRuleDsl.g:1775:1: ( '.' )
            {
            // InternalRuleDsl.g:1775:1: ( '.' )
            // InternalRuleDsl.g:1776:2: '.'
            {
             before(grammarAccess.getSelectionAccess().getFullStopKeyword_1_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getFullStopKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1_1__0__Impl"


    // $ANTLR start "rule__Selection__Group_1_1__1"
    // InternalRuleDsl.g:1785:1: rule__Selection__Group_1_1__1 : rule__Selection__Group_1_1__1__Impl ;
    public final void rule__Selection__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1789:1: ( rule__Selection__Group_1_1__1__Impl )
            // InternalRuleDsl.g:1790:2: rule__Selection__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1_1__1"


    // $ANTLR start "rule__Selection__Group_1_1__1__Impl"
    // InternalRuleDsl.g:1796:1: rule__Selection__Group_1_1__1__Impl : ( ( rule__Selection__RootAssignment_1_1_1 ) ) ;
    public final void rule__Selection__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1800:1: ( ( ( rule__Selection__RootAssignment_1_1_1 ) ) )
            // InternalRuleDsl.g:1801:1: ( ( rule__Selection__RootAssignment_1_1_1 ) )
            {
            // InternalRuleDsl.g:1801:1: ( ( rule__Selection__RootAssignment_1_1_1 ) )
            // InternalRuleDsl.g:1802:2: ( rule__Selection__RootAssignment_1_1_1 )
            {
             before(grammarAccess.getSelectionAccess().getRootAssignment_1_1_1()); 
            // InternalRuleDsl.g:1803:2: ( rule__Selection__RootAssignment_1_1_1 )
            // InternalRuleDsl.g:1803:3: rule__Selection__RootAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Selection__RootAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getRootAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Group_1_1__1__Impl"


    // $ANTLR start "rule__AddingSelect__Group__0"
    // InternalRuleDsl.g:1812:1: rule__AddingSelect__Group__0 : rule__AddingSelect__Group__0__Impl rule__AddingSelect__Group__1 ;
    public final void rule__AddingSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1816:1: ( rule__AddingSelect__Group__0__Impl rule__AddingSelect__Group__1 )
            // InternalRuleDsl.g:1817:2: rule__AddingSelect__Group__0__Impl rule__AddingSelect__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AddingSelect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AddingSelect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddingSelect__Group__0"


    // $ANTLR start "rule__AddingSelect__Group__0__Impl"
    // InternalRuleDsl.g:1824:1: rule__AddingSelect__Group__0__Impl : ( ( rule__AddingSelect__OperationAssignment_0 ) ) ;
    public final void rule__AddingSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1828:1: ( ( ( rule__AddingSelect__OperationAssignment_0 ) ) )
            // InternalRuleDsl.g:1829:1: ( ( rule__AddingSelect__OperationAssignment_0 ) )
            {
            // InternalRuleDsl.g:1829:1: ( ( rule__AddingSelect__OperationAssignment_0 ) )
            // InternalRuleDsl.g:1830:2: ( rule__AddingSelect__OperationAssignment_0 )
            {
             before(grammarAccess.getAddingSelectAccess().getOperationAssignment_0()); 
            // InternalRuleDsl.g:1831:2: ( rule__AddingSelect__OperationAssignment_0 )
            // InternalRuleDsl.g:1831:3: rule__AddingSelect__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AddingSelect__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAddingSelectAccess().getOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddingSelect__Group__0__Impl"


    // $ANTLR start "rule__AddingSelect__Group__1"
    // InternalRuleDsl.g:1839:1: rule__AddingSelect__Group__1 : rule__AddingSelect__Group__1__Impl ;
    public final void rule__AddingSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1843:1: ( rule__AddingSelect__Group__1__Impl )
            // InternalRuleDsl.g:1844:2: rule__AddingSelect__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AddingSelect__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddingSelect__Group__1"


    // $ANTLR start "rule__AddingSelect__Group__1__Impl"
    // InternalRuleDsl.g:1850:1: rule__AddingSelect__Group__1__Impl : ( ( rule__AddingSelect__Alternatives_1 ) ) ;
    public final void rule__AddingSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1854:1: ( ( ( rule__AddingSelect__Alternatives_1 ) ) )
            // InternalRuleDsl.g:1855:1: ( ( rule__AddingSelect__Alternatives_1 ) )
            {
            // InternalRuleDsl.g:1855:1: ( ( rule__AddingSelect__Alternatives_1 ) )
            // InternalRuleDsl.g:1856:2: ( rule__AddingSelect__Alternatives_1 )
            {
             before(grammarAccess.getAddingSelectAccess().getAlternatives_1()); 
            // InternalRuleDsl.g:1857:2: ( rule__AddingSelect__Alternatives_1 )
            // InternalRuleDsl.g:1857:3: rule__AddingSelect__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__AddingSelect__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAddingSelectAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddingSelect__Group__1__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // InternalRuleDsl.g:1866:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1870:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalRuleDsl.g:1871:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Where__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0"


    // $ANTLR start "rule__Where__Group__0__Impl"
    // InternalRuleDsl.g:1878:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1882:1: ( ( 'where' ) )
            // InternalRuleDsl.g:1883:1: ( 'where' )
            {
            // InternalRuleDsl.g:1883:1: ( 'where' )
            // InternalRuleDsl.g:1884:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getWhereKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__0__Impl"


    // $ANTLR start "rule__Where__Group__1"
    // InternalRuleDsl.g:1893:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1897:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalRuleDsl.g:1898:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__Where__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1"


    // $ANTLR start "rule__Where__Group__1__Impl"
    // InternalRuleDsl.g:1905:1: rule__Where__Group__1__Impl : ( ( rule__Where__LeftAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1909:1: ( ( ( rule__Where__LeftAssignment_1 ) ) )
            // InternalRuleDsl.g:1910:1: ( ( rule__Where__LeftAssignment_1 ) )
            {
            // InternalRuleDsl.g:1910:1: ( ( rule__Where__LeftAssignment_1 ) )
            // InternalRuleDsl.g:1911:2: ( rule__Where__LeftAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getLeftAssignment_1()); 
            // InternalRuleDsl.g:1912:2: ( rule__Where__LeftAssignment_1 )
            // InternalRuleDsl.g:1912:3: rule__Where__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Where__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__1__Impl"


    // $ANTLR start "rule__Where__Group__2"
    // InternalRuleDsl.g:1920:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1924:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalRuleDsl.g:1925:2: rule__Where__Group__2__Impl rule__Where__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Where__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__2"


    // $ANTLR start "rule__Where__Group__2__Impl"
    // InternalRuleDsl.g:1932:1: rule__Where__Group__2__Impl : ( ( rule__Where__LogicalOperatorAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1936:1: ( ( ( rule__Where__LogicalOperatorAssignment_2 ) ) )
            // InternalRuleDsl.g:1937:1: ( ( rule__Where__LogicalOperatorAssignment_2 ) )
            {
            // InternalRuleDsl.g:1937:1: ( ( rule__Where__LogicalOperatorAssignment_2 ) )
            // InternalRuleDsl.g:1938:2: ( rule__Where__LogicalOperatorAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getLogicalOperatorAssignment_2()); 
            // InternalRuleDsl.g:1939:2: ( rule__Where__LogicalOperatorAssignment_2 )
            // InternalRuleDsl.g:1939:3: rule__Where__LogicalOperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Where__LogicalOperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getLogicalOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__2__Impl"


    // $ANTLR start "rule__Where__Group__3"
    // InternalRuleDsl.g:1947:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1951:1: ( rule__Where__Group__3__Impl )
            // InternalRuleDsl.g:1952:2: rule__Where__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__3"


    // $ANTLR start "rule__Where__Group__3__Impl"
    // InternalRuleDsl.g:1958:1: rule__Where__Group__3__Impl : ( ( rule__Where__Alternatives_3 ) ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1962:1: ( ( ( rule__Where__Alternatives_3 ) ) )
            // InternalRuleDsl.g:1963:1: ( ( rule__Where__Alternatives_3 ) )
            {
            // InternalRuleDsl.g:1963:1: ( ( rule__Where__Alternatives_3 ) )
            // InternalRuleDsl.g:1964:2: ( rule__Where__Alternatives_3 )
            {
             before(grammarAccess.getWhereAccess().getAlternatives_3()); 
            // InternalRuleDsl.g:1965:2: ( rule__Where__Alternatives_3 )
            // InternalRuleDsl.g:1965:3: rule__Where__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__Where__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group__3__Impl"


    // $ANTLR start "rule__When__Group__0"
    // InternalRuleDsl.g:1974:1: rule__When__Group__0 : rule__When__Group__0__Impl rule__When__Group__1 ;
    public final void rule__When__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1978:1: ( rule__When__Group__0__Impl rule__When__Group__1 )
            // InternalRuleDsl.g:1979:2: rule__When__Group__0__Impl rule__When__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__When__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__0"


    // $ANTLR start "rule__When__Group__0__Impl"
    // InternalRuleDsl.g:1986:1: rule__When__Group__0__Impl : ( 'when' ) ;
    public final void rule__When__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1990:1: ( ( 'when' ) )
            // InternalRuleDsl.g:1991:1: ( 'when' )
            {
            // InternalRuleDsl.g:1991:1: ( 'when' )
            // InternalRuleDsl.g:1992:2: 'when'
            {
             before(grammarAccess.getWhenAccess().getWhenKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getWhenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__0__Impl"


    // $ANTLR start "rule__When__Group__1"
    // InternalRuleDsl.g:2001:1: rule__When__Group__1 : rule__When__Group__1__Impl rule__When__Group__2 ;
    public final void rule__When__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2005:1: ( rule__When__Group__1__Impl rule__When__Group__2 )
            // InternalRuleDsl.g:2006:2: rule__When__Group__1__Impl rule__When__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__When__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__1"


    // $ANTLR start "rule__When__Group__1__Impl"
    // InternalRuleDsl.g:2013:1: rule__When__Group__1__Impl : ( ( rule__When__LeftAssignment_1 ) ) ;
    public final void rule__When__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2017:1: ( ( ( rule__When__LeftAssignment_1 ) ) )
            // InternalRuleDsl.g:2018:1: ( ( rule__When__LeftAssignment_1 ) )
            {
            // InternalRuleDsl.g:2018:1: ( ( rule__When__LeftAssignment_1 ) )
            // InternalRuleDsl.g:2019:2: ( rule__When__LeftAssignment_1 )
            {
             before(grammarAccess.getWhenAccess().getLeftAssignment_1()); 
            // InternalRuleDsl.g:2020:2: ( rule__When__LeftAssignment_1 )
            // InternalRuleDsl.g:2020:3: rule__When__LeftAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__When__LeftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getLeftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__1__Impl"


    // $ANTLR start "rule__When__Group__2"
    // InternalRuleDsl.g:2028:1: rule__When__Group__2 : rule__When__Group__2__Impl rule__When__Group__3 ;
    public final void rule__When__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2032:1: ( rule__When__Group__2__Impl rule__When__Group__3 )
            // InternalRuleDsl.g:2033:2: rule__When__Group__2__Impl rule__When__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__When__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__When__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__2"


    // $ANTLR start "rule__When__Group__2__Impl"
    // InternalRuleDsl.g:2040:1: rule__When__Group__2__Impl : ( ( rule__When__LogicalOperatorAssignment_2 ) ) ;
    public final void rule__When__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2044:1: ( ( ( rule__When__LogicalOperatorAssignment_2 ) ) )
            // InternalRuleDsl.g:2045:1: ( ( rule__When__LogicalOperatorAssignment_2 ) )
            {
            // InternalRuleDsl.g:2045:1: ( ( rule__When__LogicalOperatorAssignment_2 ) )
            // InternalRuleDsl.g:2046:2: ( rule__When__LogicalOperatorAssignment_2 )
            {
             before(grammarAccess.getWhenAccess().getLogicalOperatorAssignment_2()); 
            // InternalRuleDsl.g:2047:2: ( rule__When__LogicalOperatorAssignment_2 )
            // InternalRuleDsl.g:2047:3: rule__When__LogicalOperatorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__When__LogicalOperatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getLogicalOperatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__2__Impl"


    // $ANTLR start "rule__When__Group__3"
    // InternalRuleDsl.g:2055:1: rule__When__Group__3 : rule__When__Group__3__Impl ;
    public final void rule__When__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2059:1: ( rule__When__Group__3__Impl )
            // InternalRuleDsl.g:2060:2: rule__When__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__When__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__3"


    // $ANTLR start "rule__When__Group__3__Impl"
    // InternalRuleDsl.g:2066:1: rule__When__Group__3__Impl : ( ( rule__When__RightAssignment_3 ) ) ;
    public final void rule__When__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2070:1: ( ( ( rule__When__RightAssignment_3 ) ) )
            // InternalRuleDsl.g:2071:1: ( ( rule__When__RightAssignment_3 ) )
            {
            // InternalRuleDsl.g:2071:1: ( ( rule__When__RightAssignment_3 ) )
            // InternalRuleDsl.g:2072:2: ( rule__When__RightAssignment_3 )
            {
             before(grammarAccess.getWhenAccess().getRightAssignment_3()); 
            // InternalRuleDsl.g:2073:2: ( rule__When__RightAssignment_3 )
            // InternalRuleDsl.g:2073:3: rule__When__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__When__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWhenAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__Group__3__Impl"


    // $ANTLR start "rule__ComplexExpression__Group__0"
    // InternalRuleDsl.g:2082:1: rule__ComplexExpression__Group__0 : rule__ComplexExpression__Group__0__Impl rule__ComplexExpression__Group__1 ;
    public final void rule__ComplexExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2086:1: ( rule__ComplexExpression__Group__0__Impl rule__ComplexExpression__Group__1 )
            // InternalRuleDsl.g:2087:2: rule__ComplexExpression__Group__0__Impl rule__ComplexExpression__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ComplexExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group__0"


    // $ANTLR start "rule__ComplexExpression__Group__0__Impl"
    // InternalRuleDsl.g:2094:1: rule__ComplexExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ComplexExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2098:1: ( ( '(' ) )
            // InternalRuleDsl.g:2099:1: ( '(' )
            {
            // InternalRuleDsl.g:2099:1: ( '(' )
            // InternalRuleDsl.g:2100:2: '('
            {
             before(grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group__0__Impl"


    // $ANTLR start "rule__ComplexExpression__Group__1"
    // InternalRuleDsl.g:2109:1: rule__ComplexExpression__Group__1 : rule__ComplexExpression__Group__1__Impl rule__ComplexExpression__Group__2 ;
    public final void rule__ComplexExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2113:1: ( rule__ComplexExpression__Group__1__Impl rule__ComplexExpression__Group__2 )
            // InternalRuleDsl.g:2114:2: rule__ComplexExpression__Group__1__Impl rule__ComplexExpression__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ComplexExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group__1"


    // $ANTLR start "rule__ComplexExpression__Group__1__Impl"
    // InternalRuleDsl.g:2121:1: rule__ComplexExpression__Group__1__Impl : ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) ) ;
    public final void rule__ComplexExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2125:1: ( ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) ) )
            // InternalRuleDsl.g:2126:1: ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) )
            {
            // InternalRuleDsl.g:2126:1: ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) )
            // InternalRuleDsl.g:2127:2: ( rule__ComplexExpression__PlainOperandAssignment_1 )
            {
             before(grammarAccess.getComplexExpressionAccess().getPlainOperandAssignment_1()); 
            // InternalRuleDsl.g:2128:2: ( rule__ComplexExpression__PlainOperandAssignment_1 )
            // InternalRuleDsl.g:2128:3: rule__ComplexExpression__PlainOperandAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexExpression__PlainOperandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getPlainOperandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group__1__Impl"


    // $ANTLR start "rule__ComplexExpression__Group__2"
    // InternalRuleDsl.g:2136:1: rule__ComplexExpression__Group__2 : rule__ComplexExpression__Group__2__Impl rule__ComplexExpression__Group__3 ;
    public final void rule__ComplexExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2140:1: ( rule__ComplexExpression__Group__2__Impl rule__ComplexExpression__Group__3 )
            // InternalRuleDsl.g:2141:2: rule__ComplexExpression__Group__2__Impl rule__ComplexExpression__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ComplexExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group__2"


    // $ANTLR start "rule__ComplexExpression__Group__2__Impl"
    // InternalRuleDsl.g:2148:1: rule__ComplexExpression__Group__2__Impl : ( ( rule__ComplexExpression__Group_2__0 )? ) ;
    public final void rule__ComplexExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2152:1: ( ( ( rule__ComplexExpression__Group_2__0 )? ) )
            // InternalRuleDsl.g:2153:1: ( ( rule__ComplexExpression__Group_2__0 )? )
            {
            // InternalRuleDsl.g:2153:1: ( ( rule__ComplexExpression__Group_2__0 )? )
            // InternalRuleDsl.g:2154:2: ( rule__ComplexExpression__Group_2__0 )?
            {
             before(grammarAccess.getComplexExpressionAccess().getGroup_2()); 
            // InternalRuleDsl.g:2155:2: ( rule__ComplexExpression__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_OPERATOR) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRuleDsl.g:2155:3: rule__ComplexExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexExpression__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group__2__Impl"


    // $ANTLR start "rule__ComplexExpression__Group__3"
    // InternalRuleDsl.g:2163:1: rule__ComplexExpression__Group__3 : rule__ComplexExpression__Group__3__Impl ;
    public final void rule__ComplexExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2167:1: ( rule__ComplexExpression__Group__3__Impl )
            // InternalRuleDsl.g:2168:2: rule__ComplexExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group__3"


    // $ANTLR start "rule__ComplexExpression__Group__3__Impl"
    // InternalRuleDsl.g:2174:1: rule__ComplexExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__ComplexExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2178:1: ( ( ')' ) )
            // InternalRuleDsl.g:2179:1: ( ')' )
            {
            // InternalRuleDsl.g:2179:1: ( ')' )
            // InternalRuleDsl.g:2180:2: ')'
            {
             before(grammarAccess.getComplexExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComplexExpressionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group__3__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_2__0"
    // InternalRuleDsl.g:2190:1: rule__ComplexExpression__Group_2__0 : rule__ComplexExpression__Group_2__0__Impl rule__ComplexExpression__Group_2__1 ;
    public final void rule__ComplexExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2194:1: ( rule__ComplexExpression__Group_2__0__Impl rule__ComplexExpression__Group_2__1 )
            // InternalRuleDsl.g:2195:2: rule__ComplexExpression__Group_2__0__Impl rule__ComplexExpression__Group_2__1
            {
            pushFollow(FOLLOW_28);
            rule__ComplexExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group_2__0"


    // $ANTLR start "rule__ComplexExpression__Group_2__0__Impl"
    // InternalRuleDsl.g:2202:1: rule__ComplexExpression__Group_2__0__Impl : ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) ) ;
    public final void rule__ComplexExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2206:1: ( ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) ) )
            // InternalRuleDsl.g:2207:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) )
            {
            // InternalRuleDsl.g:2207:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) )
            // InternalRuleDsl.g:2208:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getComplexOperandsAssignment_2_0()); 
            // InternalRuleDsl.g:2209:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 )
            // InternalRuleDsl.g:2209:3: rule__ComplexExpression__ComplexOperandsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexExpression__ComplexOperandsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexExpressionAccess().getComplexOperandsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group_2__0__Impl"


    // $ANTLR start "rule__ComplexExpression__Group_2__1"
    // InternalRuleDsl.g:2217:1: rule__ComplexExpression__Group_2__1 : rule__ComplexExpression__Group_2__1__Impl ;
    public final void rule__ComplexExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2221:1: ( rule__ComplexExpression__Group_2__1__Impl )
            // InternalRuleDsl.g:2222:2: rule__ComplexExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group_2__1"


    // $ANTLR start "rule__ComplexExpression__Group_2__1__Impl"
    // InternalRuleDsl.g:2228:1: rule__ComplexExpression__Group_2__1__Impl : ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* ) ;
    public final void rule__ComplexExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2232:1: ( ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* ) )
            // InternalRuleDsl.g:2233:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* )
            {
            // InternalRuleDsl.g:2233:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* )
            // InternalRuleDsl.g:2234:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )*
            {
             before(grammarAccess.getComplexExpressionAccess().getComplexOperandsAssignment_2_1()); 
            // InternalRuleDsl.g:2235:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_OPERATOR) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRuleDsl.g:2235:3: rule__ComplexExpression__ComplexOperandsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ComplexExpression__ComplexOperandsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getComplexExpressionAccess().getComplexOperandsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__Group_2__1__Impl"


    // $ANTLR start "rule__ComplexOperand__Group__0"
    // InternalRuleDsl.g:2244:1: rule__ComplexOperand__Group__0 : rule__ComplexOperand__Group__0__Impl rule__ComplexOperand__Group__1 ;
    public final void rule__ComplexOperand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2248:1: ( rule__ComplexOperand__Group__0__Impl rule__ComplexOperand__Group__1 )
            // InternalRuleDsl.g:2249:2: rule__ComplexOperand__Group__0__Impl rule__ComplexOperand__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__ComplexOperand__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexOperand__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexOperand__Group__0"


    // $ANTLR start "rule__ComplexOperand__Group__0__Impl"
    // InternalRuleDsl.g:2256:1: rule__ComplexOperand__Group__0__Impl : ( ( rule__ComplexOperand__OperatorAssignment_0 ) ) ;
    public final void rule__ComplexOperand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2260:1: ( ( ( rule__ComplexOperand__OperatorAssignment_0 ) ) )
            // InternalRuleDsl.g:2261:1: ( ( rule__ComplexOperand__OperatorAssignment_0 ) )
            {
            // InternalRuleDsl.g:2261:1: ( ( rule__ComplexOperand__OperatorAssignment_0 ) )
            // InternalRuleDsl.g:2262:2: ( rule__ComplexOperand__OperatorAssignment_0 )
            {
             before(grammarAccess.getComplexOperandAccess().getOperatorAssignment_0()); 
            // InternalRuleDsl.g:2263:2: ( rule__ComplexOperand__OperatorAssignment_0 )
            // InternalRuleDsl.g:2263:3: rule__ComplexOperand__OperatorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexOperand__OperatorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComplexOperandAccess().getOperatorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexOperand__Group__0__Impl"


    // $ANTLR start "rule__ComplexOperand__Group__1"
    // InternalRuleDsl.g:2271:1: rule__ComplexOperand__Group__1 : rule__ComplexOperand__Group__1__Impl ;
    public final void rule__ComplexOperand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2275:1: ( rule__ComplexOperand__Group__1__Impl )
            // InternalRuleDsl.g:2276:2: rule__ComplexOperand__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexOperand__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexOperand__Group__1"


    // $ANTLR start "rule__ComplexOperand__Group__1__Impl"
    // InternalRuleDsl.g:2282:1: rule__ComplexOperand__Group__1__Impl : ( ( rule__ComplexOperand__ExpressionAssignment_1 ) ) ;
    public final void rule__ComplexOperand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2286:1: ( ( ( rule__ComplexOperand__ExpressionAssignment_1 ) ) )
            // InternalRuleDsl.g:2287:1: ( ( rule__ComplexOperand__ExpressionAssignment_1 ) )
            {
            // InternalRuleDsl.g:2287:1: ( ( rule__ComplexOperand__ExpressionAssignment_1 ) )
            // InternalRuleDsl.g:2288:2: ( rule__ComplexOperand__ExpressionAssignment_1 )
            {
             before(grammarAccess.getComplexOperandAccess().getExpressionAssignment_1()); 
            // InternalRuleDsl.g:2289:2: ( rule__ComplexOperand__ExpressionAssignment_1 )
            // InternalRuleDsl.g:2289:3: rule__ComplexOperand__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexOperand__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexOperandAccess().getExpressionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexOperand__Group__1__Impl"


    // $ANTLR start "rule__RuleModel__ElementsAssignment_0"
    // InternalRuleDsl.g:2298:1: rule__RuleModel__ElementsAssignment_0 : ( ruleRuleElement ) ;
    public final void rule__RuleModel__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2302:1: ( ( ruleRuleElement ) )
            // InternalRuleDsl.g:2303:2: ( ruleRuleElement )
            {
            // InternalRuleDsl.g:2303:2: ( ruleRuleElement )
            // InternalRuleDsl.g:2304:3: ruleRuleElement
            {
             before(grammarAccess.getRuleModelAccess().getElementsRuleElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleElement();

            state._fsp--;

             after(grammarAccess.getRuleModelAccess().getElementsRuleElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__ElementsAssignment_0"


    // $ANTLR start "rule__RuleModel__ElementsAssignment_1"
    // InternalRuleDsl.g:2313:1: rule__RuleModel__ElementsAssignment_1 : ( ruleRuleElement ) ;
    public final void rule__RuleModel__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2317:1: ( ( ruleRuleElement ) )
            // InternalRuleDsl.g:2318:2: ( ruleRuleElement )
            {
            // InternalRuleDsl.g:2318:2: ( ruleRuleElement )
            // InternalRuleDsl.g:2319:3: ruleRuleElement
            {
             before(grammarAccess.getRuleModelAccess().getElementsRuleElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleElement();

            state._fsp--;

             after(grammarAccess.getRuleModelAccess().getElementsRuleElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__ElementsAssignment_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // InternalRuleDsl.g:2328:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2332:1: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2333:2: ( RULE_ID )
            {
            // InternalRuleDsl.g:2333:2: ( RULE_ID )
            // InternalRuleDsl.g:2334:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__EventAssignment_5"
    // InternalRuleDsl.g:2343:1: rule__Rule__EventAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__EventAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2347:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:2348:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:2348:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2349:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getEventPhraseCrossReference_5_0()); 
            // InternalRuleDsl.g:2350:3: ( RULE_ID )
            // InternalRuleDsl.g:2351:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getEventPhraseIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getEventPhraseIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getEventPhraseCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__EventAssignment_5"


    // $ANTLR start "rule__Rule__ConditionAssignment_6_1"
    // InternalRuleDsl.g:2362:1: rule__Rule__ConditionAssignment_6_1 : ( ruleWhen ) ;
    public final void rule__Rule__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2366:1: ( ( ruleWhen ) )
            // InternalRuleDsl.g:2367:2: ( ruleWhen )
            {
            // InternalRuleDsl.g:2367:2: ( ruleWhen )
            // InternalRuleDsl.g:2368:3: ruleWhen
            {
             before(grammarAccess.getRuleAccess().getConditionWhenParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhen();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionWhenParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ConditionAssignment_6_1"


    // $ANTLR start "rule__Rule__ActionsAssignment_8_0"
    // InternalRuleDsl.g:2377:1: rule__Rule__ActionsAssignment_8_0 : ( ruleQuery ) ;
    public final void rule__Rule__ActionsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2381:1: ( ( ruleQuery ) )
            // InternalRuleDsl.g:2382:2: ( ruleQuery )
            {
            // InternalRuleDsl.g:2382:2: ( ruleQuery )
            // InternalRuleDsl.g:2383:3: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getActionsQueryParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionsQueryParserRuleCall_8_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionsAssignment_8_0"


    // $ANTLR start "rule__Rule__ActionsAssignment_8_1_1"
    // InternalRuleDsl.g:2392:1: rule__Rule__ActionsAssignment_8_1_1 : ( ruleQuery ) ;
    public final void rule__Rule__ActionsAssignment_8_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2396:1: ( ( ruleQuery ) )
            // InternalRuleDsl.g:2397:2: ( ruleQuery )
            {
            // InternalRuleDsl.g:2397:2: ( ruleQuery )
            // InternalRuleDsl.g:2398:3: ruleQuery
            {
             before(grammarAccess.getRuleAccess().getActionsQueryParserRuleCall_8_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuery();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionsQueryParserRuleCall_8_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionsAssignment_8_1_1"


    // $ANTLR start "rule__Query__NameAssignment_0"
    // InternalRuleDsl.g:2407:1: rule__Query__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2411:1: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2412:2: ( RULE_ID )
            {
            // InternalRuleDsl.g:2412:2: ( RULE_ID )
            // InternalRuleDsl.g:2413:3: RULE_ID
            {
             before(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__NameAssignment_0"


    // $ANTLR start "rule__Query__SelectAssignment_2"
    // InternalRuleDsl.g:2422:1: rule__Query__SelectAssignment_2 : ( ruleSelect ) ;
    public final void rule__Query__SelectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2426:1: ( ( ruleSelect ) )
            // InternalRuleDsl.g:2427:2: ( ruleSelect )
            {
            // InternalRuleDsl.g:2427:2: ( ruleSelect )
            // InternalRuleDsl.g:2428:3: ruleSelect
            {
             before(grammarAccess.getQueryAccess().getSelectSelectParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getSelectSelectParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__SelectAssignment_2"


    // $ANTLR start "rule__Query__WhereAssignment_3_1"
    // InternalRuleDsl.g:2437:1: rule__Query__WhereAssignment_3_1 : ( ruleWhere ) ;
    public final void rule__Query__WhereAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2441:1: ( ( ruleWhere ) )
            // InternalRuleDsl.g:2442:2: ( ruleWhere )
            {
            // InternalRuleDsl.g:2442:2: ( ruleWhere )
            // InternalRuleDsl.g:2443:3: ruleWhere
            {
             before(grammarAccess.getQueryAccess().getWhereWhereParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getWhereWhereParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__WhereAssignment_3_1"


    // $ANTLR start "rule__SetSelect__SelectionAssignment_2_0_0"
    // InternalRuleDsl.g:2452:1: rule__SetSelect__SelectionAssignment_2_0_0 : ( ruleSelection ) ;
    public final void rule__SetSelect__SelectionAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2456:1: ( ( ruleSelection ) )
            // InternalRuleDsl.g:2457:2: ( ruleSelection )
            {
            // InternalRuleDsl.g:2457:2: ( ruleSelection )
            // InternalRuleDsl.g:2458:3: ruleSelection
            {
             before(grammarAccess.getSetSelectAccess().getSelectionSelectionParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSetSelectAccess().getSelectionSelectionParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__SelectionAssignment_2_0_0"


    // $ANTLR start "rule__SetSelect__SelectionAssignment_2_0_1_1"
    // InternalRuleDsl.g:2467:1: rule__SetSelect__SelectionAssignment_2_0_1_1 : ( ruleSelection ) ;
    public final void rule__SetSelect__SelectionAssignment_2_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2471:1: ( ( ruleSelection ) )
            // InternalRuleDsl.g:2472:2: ( ruleSelection )
            {
            // InternalRuleDsl.g:2472:2: ( ruleSelection )
            // InternalRuleDsl.g:2473:3: ruleSelection
            {
             before(grammarAccess.getSetSelectAccess().getSelectionSelectionParserRuleCall_2_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSetSelectAccess().getSelectionSelectionParserRuleCall_2_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__SelectionAssignment_2_0_1_1"


    // $ANTLR start "rule__SetSelect__AllAssignment_2_1"
    // InternalRuleDsl.g:2482:1: rule__SetSelect__AllAssignment_2_1 : ( ( '*' ) ) ;
    public final void rule__SetSelect__AllAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2486:1: ( ( ( '*' ) ) )
            // InternalRuleDsl.g:2487:2: ( ( '*' ) )
            {
            // InternalRuleDsl.g:2487:2: ( ( '*' ) )
            // InternalRuleDsl.g:2488:3: ( '*' )
            {
             before(grammarAccess.getSetSelectAccess().getAllAsteriskKeyword_2_1_0()); 
            // InternalRuleDsl.g:2489:3: ( '*' )
            // InternalRuleDsl.g:2490:4: '*'
            {
             before(grammarAccess.getSetSelectAccess().getAllAsteriskKeyword_2_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getAllAsteriskKeyword_2_1_0()); 

            }

             after(grammarAccess.getSetSelectAccess().getAllAsteriskKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__AllAssignment_2_1"


    // $ANTLR start "rule__SetSelect__OperatorAssignment_3_0"
    // InternalRuleDsl.g:2501:1: rule__SetSelect__OperatorAssignment_3_0 : ( RULE_SETOPERATOR ) ;
    public final void rule__SetSelect__OperatorAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2505:1: ( ( RULE_SETOPERATOR ) )
            // InternalRuleDsl.g:2506:2: ( RULE_SETOPERATOR )
            {
            // InternalRuleDsl.g:2506:2: ( RULE_SETOPERATOR )
            // InternalRuleDsl.g:2507:3: RULE_SETOPERATOR
            {
             before(grammarAccess.getSetSelectAccess().getOperatorSETOPERATORTerminalRuleCall_3_0_0()); 
            match(input,RULE_SETOPERATOR,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getOperatorSETOPERATORTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__OperatorAssignment_3_0"


    // $ANTLR start "rule__SetSelect__SelectAssignment_3_1"
    // InternalRuleDsl.g:2516:1: rule__SetSelect__SelectAssignment_3_1 : ( ruleSetSelect ) ;
    public final void rule__SetSelect__SelectAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2520:1: ( ( ruleSetSelect ) )
            // InternalRuleDsl.g:2521:2: ( ruleSetSelect )
            {
            // InternalRuleDsl.g:2521:2: ( ruleSetSelect )
            // InternalRuleDsl.g:2522:3: ruleSetSelect
            {
             before(grammarAccess.getSetSelectAccess().getSelectSetSelectParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSetSelect();

            state._fsp--;

             after(grammarAccess.getSetSelectAccess().getSelectSetSelectParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__SelectAssignment_3_1"


    // $ANTLR start "rule__Selection__SelectorAssignment_0_0"
    // InternalRuleDsl.g:2531:1: rule__Selection__SelectorAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Selection__SelectorAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2535:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:2536:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:2536:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2537:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectionAccess().getSelectorConceptCrossReference_0_0_0()); 
            // InternalRuleDsl.g:2538:3: ( RULE_ID )
            // InternalRuleDsl.g:2539:4: RULE_ID
            {
             before(grammarAccess.getSelectionAccess().getSelectorConceptIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getSelectorConceptIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getSelectionAccess().getSelectorConceptCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__SelectorAssignment_0_0"


    // $ANTLR start "rule__Selection__RootAssignment_1_0"
    // InternalRuleDsl.g:2550:1: rule__Selection__RootAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Selection__RootAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2554:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:2555:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:2555:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2556:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectionAccess().getRootConceptCrossReference_1_0_0()); 
            // InternalRuleDsl.g:2557:3: ( RULE_ID )
            // InternalRuleDsl.g:2558:4: RULE_ID
            {
             before(grammarAccess.getSelectionAccess().getRootConceptIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getRootConceptIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getSelectionAccess().getRootConceptCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__RootAssignment_1_0"


    // $ANTLR start "rule__Selection__RootAssignment_1_1_1"
    // InternalRuleDsl.g:2569:1: rule__Selection__RootAssignment_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Selection__RootAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2573:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:2574:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:2574:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2575:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectionAccess().getRootConceptCrossReference_1_1_1_0()); 
            // InternalRuleDsl.g:2576:3: ( RULE_ID )
            // InternalRuleDsl.g:2577:4: RULE_ID
            {
             before(grammarAccess.getSelectionAccess().getRootConceptIDTerminalRuleCall_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectionAccess().getRootConceptIDTerminalRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getSelectionAccess().getRootConceptCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__RootAssignment_1_1_1"


    // $ANTLR start "rule__AddingSelect__OperationAssignment_0"
    // InternalRuleDsl.g:2588:1: rule__AddingSelect__OperationAssignment_0 : ( RULE_SELECTOPERATOR ) ;
    public final void rule__AddingSelect__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2592:1: ( ( RULE_SELECTOPERATOR ) )
            // InternalRuleDsl.g:2593:2: ( RULE_SELECTOPERATOR )
            {
            // InternalRuleDsl.g:2593:2: ( RULE_SELECTOPERATOR )
            // InternalRuleDsl.g:2594:3: RULE_SELECTOPERATOR
            {
             before(grammarAccess.getAddingSelectAccess().getOperationSELECTOPERATORTerminalRuleCall_0_0()); 
            match(input,RULE_SELECTOPERATOR,FOLLOW_2); 
             after(grammarAccess.getAddingSelectAccess().getOperationSELECTOPERATORTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddingSelect__OperationAssignment_0"


    // $ANTLR start "rule__AddingSelect__ElementAssignment_1_0"
    // InternalRuleDsl.g:2603:1: rule__AddingSelect__ElementAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__AddingSelect__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2607:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:2608:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:2608:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2609:3: ( RULE_ID )
            {
             before(grammarAccess.getAddingSelectAccess().getElementConceptCrossReference_1_0_0()); 
            // InternalRuleDsl.g:2610:3: ( RULE_ID )
            // InternalRuleDsl.g:2611:4: RULE_ID
            {
             before(grammarAccess.getAddingSelectAccess().getElementConceptIDTerminalRuleCall_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAddingSelectAccess().getElementConceptIDTerminalRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getAddingSelectAccess().getElementConceptCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddingSelect__ElementAssignment_1_0"


    // $ANTLR start "rule__AddingSelect__AllAssignment_1_1"
    // InternalRuleDsl.g:2622:1: rule__AddingSelect__AllAssignment_1_1 : ( ( '*' ) ) ;
    public final void rule__AddingSelect__AllAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2626:1: ( ( ( '*' ) ) )
            // InternalRuleDsl.g:2627:2: ( ( '*' ) )
            {
            // InternalRuleDsl.g:2627:2: ( ( '*' ) )
            // InternalRuleDsl.g:2628:3: ( '*' )
            {
             before(grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0()); 
            // InternalRuleDsl.g:2629:3: ( '*' )
            // InternalRuleDsl.g:2630:4: '*'
            {
             before(grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0()); 

            }

             after(grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AddingSelect__AllAssignment_1_1"


    // $ANTLR start "rule__Where__LeftAssignment_1"
    // InternalRuleDsl.g:2641:1: rule__Where__LeftAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Where__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2645:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:2646:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:2646:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2647:3: ( RULE_ID )
            {
             before(grammarAccess.getWhereAccess().getLeftConceptCrossReference_1_0()); 
            // InternalRuleDsl.g:2648:3: ( RULE_ID )
            // InternalRuleDsl.g:2649:4: RULE_ID
            {
             before(grammarAccess.getWhereAccess().getLeftConceptIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getLeftConceptIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getWhereAccess().getLeftConceptCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__LeftAssignment_1"


    // $ANTLR start "rule__Where__LogicalOperatorAssignment_2"
    // InternalRuleDsl.g:2660:1: rule__Where__LogicalOperatorAssignment_2 : ( RULE_LOGICALOPERATOR ) ;
    public final void rule__Where__LogicalOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2664:1: ( ( RULE_LOGICALOPERATOR ) )
            // InternalRuleDsl.g:2665:2: ( RULE_LOGICALOPERATOR )
            {
            // InternalRuleDsl.g:2665:2: ( RULE_LOGICALOPERATOR )
            // InternalRuleDsl.g:2666:3: RULE_LOGICALOPERATOR
            {
             before(grammarAccess.getWhereAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_2_0()); 
            match(input,RULE_LOGICALOPERATOR,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__LogicalOperatorAssignment_2"


    // $ANTLR start "rule__Where__RightVariableAssignment_3_0"
    // InternalRuleDsl.g:2675:1: rule__Where__RightVariableAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Where__RightVariableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2679:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:2680:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:2680:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2681:3: ( RULE_ID )
            {
             before(grammarAccess.getWhereAccess().getRightVariableConceptCrossReference_3_0_0()); 
            // InternalRuleDsl.g:2682:3: ( RULE_ID )
            // InternalRuleDsl.g:2683:4: RULE_ID
            {
             before(grammarAccess.getWhereAccess().getRightVariableConceptIDTerminalRuleCall_3_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getRightVariableConceptIDTerminalRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getWhereAccess().getRightVariableConceptCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__RightVariableAssignment_3_0"


    // $ANTLR start "rule__Where__RightAssignment_3_1"
    // InternalRuleDsl.g:2694:1: rule__Where__RightAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Where__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2698:1: ( ( RULE_INT ) )
            // InternalRuleDsl.g:2699:2: ( RULE_INT )
            {
            // InternalRuleDsl.g:2699:2: ( RULE_INT )
            // InternalRuleDsl.g:2700:3: RULE_INT
            {
             before(grammarAccess.getWhereAccess().getRightINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getRightINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__RightAssignment_3_1"


    // $ANTLR start "rule__When__LeftAssignment_1"
    // InternalRuleDsl.g:2709:1: rule__When__LeftAssignment_1 : ( ruleExpression ) ;
    public final void rule__When__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2713:1: ( ( ruleExpression ) )
            // InternalRuleDsl.g:2714:2: ( ruleExpression )
            {
            // InternalRuleDsl.g:2714:2: ( ruleExpression )
            // InternalRuleDsl.g:2715:3: ruleExpression
            {
             before(grammarAccess.getWhenAccess().getLeftExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getLeftExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__LeftAssignment_1"


    // $ANTLR start "rule__When__LogicalOperatorAssignment_2"
    // InternalRuleDsl.g:2724:1: rule__When__LogicalOperatorAssignment_2 : ( RULE_LOGICALOPERATOR ) ;
    public final void rule__When__LogicalOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2728:1: ( ( RULE_LOGICALOPERATOR ) )
            // InternalRuleDsl.g:2729:2: ( RULE_LOGICALOPERATOR )
            {
            // InternalRuleDsl.g:2729:2: ( RULE_LOGICALOPERATOR )
            // InternalRuleDsl.g:2730:3: RULE_LOGICALOPERATOR
            {
             before(grammarAccess.getWhenAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_2_0()); 
            match(input,RULE_LOGICALOPERATOR,FOLLOW_2); 
             after(grammarAccess.getWhenAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__LogicalOperatorAssignment_2"


    // $ANTLR start "rule__When__RightAssignment_3"
    // InternalRuleDsl.g:2739:1: rule__When__RightAssignment_3 : ( ruleExpression ) ;
    public final void rule__When__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2743:1: ( ( ruleExpression ) )
            // InternalRuleDsl.g:2744:2: ( ruleExpression )
            {
            // InternalRuleDsl.g:2744:2: ( ruleExpression )
            // InternalRuleDsl.g:2745:3: ruleExpression
            {
             before(grammarAccess.getWhenAccess().getRightExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhenAccess().getRightExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__When__RightAssignment_3"


    // $ANTLR start "rule__PlainExpression__PlainOperandAssignment"
    // InternalRuleDsl.g:2754:1: rule__PlainExpression__PlainOperandAssignment : ( rulePlainOperand ) ;
    public final void rule__PlainExpression__PlainOperandAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2758:1: ( ( rulePlainOperand ) )
            // InternalRuleDsl.g:2759:2: ( rulePlainOperand )
            {
            // InternalRuleDsl.g:2759:2: ( rulePlainOperand )
            // InternalRuleDsl.g:2760:3: rulePlainOperand
            {
             before(grammarAccess.getPlainExpressionAccess().getPlainOperandPlainOperandParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlainOperand();

            state._fsp--;

             after(grammarAccess.getPlainExpressionAccess().getPlainOperandPlainOperandParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlainExpression__PlainOperandAssignment"


    // $ANTLR start "rule__ComplexExpression__PlainOperandAssignment_1"
    // InternalRuleDsl.g:2769:1: rule__ComplexExpression__PlainOperandAssignment_1 : ( rulePlainOperand ) ;
    public final void rule__ComplexExpression__PlainOperandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2773:1: ( ( rulePlainOperand ) )
            // InternalRuleDsl.g:2774:2: ( rulePlainOperand )
            {
            // InternalRuleDsl.g:2774:2: ( rulePlainOperand )
            // InternalRuleDsl.g:2775:3: rulePlainOperand
            {
             before(grammarAccess.getComplexExpressionAccess().getPlainOperandPlainOperandParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePlainOperand();

            state._fsp--;

             after(grammarAccess.getComplexExpressionAccess().getPlainOperandPlainOperandParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__PlainOperandAssignment_1"


    // $ANTLR start "rule__ComplexExpression__ComplexOperandsAssignment_2_0"
    // InternalRuleDsl.g:2784:1: rule__ComplexExpression__ComplexOperandsAssignment_2_0 : ( ruleComplexOperand ) ;
    public final void rule__ComplexExpression__ComplexOperandsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2788:1: ( ( ruleComplexOperand ) )
            // InternalRuleDsl.g:2789:2: ( ruleComplexOperand )
            {
            // InternalRuleDsl.g:2789:2: ( ruleComplexOperand )
            // InternalRuleDsl.g:2790:3: ruleComplexOperand
            {
             before(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexOperand();

            state._fsp--;

             after(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__ComplexOperandsAssignment_2_0"


    // $ANTLR start "rule__ComplexExpression__ComplexOperandsAssignment_2_1"
    // InternalRuleDsl.g:2799:1: rule__ComplexExpression__ComplexOperandsAssignment_2_1 : ( ruleComplexOperand ) ;
    public final void rule__ComplexExpression__ComplexOperandsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2803:1: ( ( ruleComplexOperand ) )
            // InternalRuleDsl.g:2804:2: ( ruleComplexOperand )
            {
            // InternalRuleDsl.g:2804:2: ( ruleComplexOperand )
            // InternalRuleDsl.g:2805:3: ruleComplexOperand
            {
             before(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComplexOperand();

            state._fsp--;

             after(grammarAccess.getComplexExpressionAccess().getComplexOperandsComplexOperandParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexExpression__ComplexOperandsAssignment_2_1"


    // $ANTLR start "rule__Numeral__ValueAssignment"
    // InternalRuleDsl.g:2814:1: rule__Numeral__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__Numeral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2818:1: ( ( RULE_DOUBLE ) )
            // InternalRuleDsl.g:2819:2: ( RULE_DOUBLE )
            {
            // InternalRuleDsl.g:2819:2: ( RULE_DOUBLE )
            // InternalRuleDsl.g:2820:3: RULE_DOUBLE
            {
             before(grammarAccess.getNumeralAccess().getValueDOUBLETerminalRuleCall_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getNumeralAccess().getValueDOUBLETerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Numeral__ValueAssignment"


    // $ANTLR start "rule__QueryOperand__QueryAssignment"
    // InternalRuleDsl.g:2829:1: rule__QueryOperand__QueryAssignment : ( ( RULE_ID ) ) ;
    public final void rule__QueryOperand__QueryAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2833:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:2834:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:2834:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:2835:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryOperandAccess().getQueryQueryCrossReference_0()); 
            // InternalRuleDsl.g:2836:3: ( RULE_ID )
            // InternalRuleDsl.g:2837:4: RULE_ID
            {
             before(grammarAccess.getQueryOperandAccess().getQueryQueryIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryOperandAccess().getQueryQueryIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getQueryOperandAccess().getQueryQueryCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryOperand__QueryAssignment"


    // $ANTLR start "rule__ComplexOperand__OperatorAssignment_0"
    // InternalRuleDsl.g:2848:1: rule__ComplexOperand__OperatorAssignment_0 : ( RULE_OPERATOR ) ;
    public final void rule__ComplexOperand__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2852:1: ( ( RULE_OPERATOR ) )
            // InternalRuleDsl.g:2853:2: ( RULE_OPERATOR )
            {
            // InternalRuleDsl.g:2853:2: ( RULE_OPERATOR )
            // InternalRuleDsl.g:2854:3: RULE_OPERATOR
            {
             before(grammarAccess.getComplexOperandAccess().getOperatorOPERATORTerminalRuleCall_0_0()); 
            match(input,RULE_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getComplexOperandAccess().getOperatorOPERATORTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexOperand__OperatorAssignment_0"


    // $ANTLR start "rule__ComplexOperand__ExpressionAssignment_1"
    // InternalRuleDsl.g:2863:1: rule__ComplexOperand__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ComplexOperand__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2867:1: ( ( ruleExpression ) )
            // InternalRuleDsl.g:2868:2: ( ruleExpression )
            {
            // InternalRuleDsl.g:2868:2: ( ruleExpression )
            // InternalRuleDsl.g:2869:3: ruleExpression
            {
             before(grammarAccess.getComplexOperandAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getComplexOperandAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexOperand__ExpressionAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040210L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000200400L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000402L});

}