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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SELECTOPERATOR", "RULE_LOGICALOPERATOR", "RULE_DOUBLE", "RULE_OPERATOR", "RULE_STRING", "RULE_CONDITIONALOPERATOR", "RULE_INT", "RULE_SETOPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'{'", "'on'", "'do'", "'}'", "':'", "'then'", "'select'", "'from'", "','", "'where'", "'AND'", "'('", "')'", "'compose'", "'+'", "'to'", "'@'", "'*'"
    };
    public static final int RULE_SELECTOPERATOR=5;
    public static final int RULE_STRING=9;
    public static final int RULE_CONDITIONALOPERATOR=10;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_LOGICALOPERATOR=6;
    public static final int T__31=31;
    public static final int RULE_OPERATOR=8;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_SETOPERATOR=12;
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
    // InternalRuleDsl.g:62:1: ruleRuleModel : ( ( rule__RuleModel__Group__0 ) ) ;
    public final void ruleRuleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:66:2: ( ( ( rule__RuleModel__Group__0 ) ) )
            // InternalRuleDsl.g:67:2: ( ( rule__RuleModel__Group__0 ) )
            {
            // InternalRuleDsl.g:67:2: ( ( rule__RuleModel__Group__0 ) )
            // InternalRuleDsl.g:68:3: ( rule__RuleModel__Group__0 )
            {
             before(grammarAccess.getRuleModelAccess().getGroup()); 
            // InternalRuleDsl.g:69:3: ( rule__RuleModel__Group__0 )
            // InternalRuleDsl.g:69:4: rule__RuleModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RuleModel__Group__0();

            state._fsp--;


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


    // $ANTLR start "entryRuleImport"
    // InternalRuleDsl.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalRuleDsl.g:79:1: ( ruleImport EOF )
            // InternalRuleDsl.g:80:1: ruleImport EOF
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
    // InternalRuleDsl.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalRuleDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalRuleDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalRuleDsl.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalRuleDsl.g:94:3: ( rule__Import__Group__0 )
            // InternalRuleDsl.g:94:4: rule__Import__Group__0
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
    // InternalRuleDsl.g:103:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRuleDsl.g:104:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRuleDsl.g:105:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalRuleDsl.g:112:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:116:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRuleDsl.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRuleDsl.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRuleDsl.g:118:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalRuleDsl.g:119:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRuleDsl.g:119:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalRuleDsl.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRuleDsl.g:129:1: ( ruleQualifiedName EOF )
            // InternalRuleDsl.g:130:1: ruleQualifiedName EOF
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
    // InternalRuleDsl.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRuleDsl.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRuleDsl.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRuleDsl.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalRuleDsl.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalRuleDsl.g:144:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleRule"
    // InternalRuleDsl.g:153:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRuleDsl.g:154:1: ( ruleRule EOF )
            // InternalRuleDsl.g:155:1: ruleRule EOF
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
    // InternalRuleDsl.g:162:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:166:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRuleDsl.g:167:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRuleDsl.g:167:2: ( ( rule__Rule__Group__0 ) )
            // InternalRuleDsl.g:168:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRuleDsl.g:169:3: ( rule__Rule__Group__0 )
            // InternalRuleDsl.g:169:4: rule__Rule__Group__0
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


    // $ANTLR start "entryRuleAction"
    // InternalRuleDsl.g:178:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalRuleDsl.g:179:1: ( ruleAction EOF )
            // InternalRuleDsl.g:180:1: ruleAction EOF
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
    // InternalRuleDsl.g:187:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:191:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalRuleDsl.g:192:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalRuleDsl.g:192:2: ( ( rule__Action__Alternatives ) )
            // InternalRuleDsl.g:193:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalRuleDsl.g:194:3: ( rule__Action__Alternatives )
            // InternalRuleDsl.g:194:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleQuery"
    // InternalRuleDsl.g:203:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalRuleDsl.g:204:1: ( ruleQuery EOF )
            // InternalRuleDsl.g:205:1: ruleQuery EOF
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
    // InternalRuleDsl.g:212:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:216:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalRuleDsl.g:217:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalRuleDsl.g:217:2: ( ( rule__Query__Group__0 ) )
            // InternalRuleDsl.g:218:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalRuleDsl.g:219:3: ( rule__Query__Group__0 )
            // InternalRuleDsl.g:219:4: rule__Query__Group__0
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


    // $ANTLR start "entryRuleSelect"
    // InternalRuleDsl.g:253:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalRuleDsl.g:254:1: ( ruleSelect EOF )
            // InternalRuleDsl.g:255:1: ruleSelect EOF
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
    // InternalRuleDsl.g:262:1: ruleSelect : ( ( rule__Select__Alternatives ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:266:2: ( ( ( rule__Select__Alternatives ) ) )
            // InternalRuleDsl.g:267:2: ( ( rule__Select__Alternatives ) )
            {
            // InternalRuleDsl.g:267:2: ( ( rule__Select__Alternatives ) )
            // InternalRuleDsl.g:268:3: ( rule__Select__Alternatives )
            {
             before(grammarAccess.getSelectAccess().getAlternatives()); 
            // InternalRuleDsl.g:269:3: ( rule__Select__Alternatives )
            // InternalRuleDsl.g:269:4: rule__Select__Alternatives
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
    // InternalRuleDsl.g:278:1: entryRuleSetSelect : ruleSetSelect EOF ;
    public final void entryRuleSetSelect() throws RecognitionException {
        try {
            // InternalRuleDsl.g:279:1: ( ruleSetSelect EOF )
            // InternalRuleDsl.g:280:1: ruleSetSelect EOF
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
    // InternalRuleDsl.g:287:1: ruleSetSelect : ( ( rule__SetSelect__Group__0 ) ) ;
    public final void ruleSetSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:291:2: ( ( ( rule__SetSelect__Group__0 ) ) )
            // InternalRuleDsl.g:292:2: ( ( rule__SetSelect__Group__0 ) )
            {
            // InternalRuleDsl.g:292:2: ( ( rule__SetSelect__Group__0 ) )
            // InternalRuleDsl.g:293:3: ( rule__SetSelect__Group__0 )
            {
             before(grammarAccess.getSetSelectAccess().getGroup()); 
            // InternalRuleDsl.g:294:3: ( rule__SetSelect__Group__0 )
            // InternalRuleDsl.g:294:4: rule__SetSelect__Group__0
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


    // $ANTLR start "entryRuleWhere"
    // InternalRuleDsl.g:303:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalRuleDsl.g:304:1: ( ruleWhere EOF )
            // InternalRuleDsl.g:305:1: ruleWhere EOF
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
    // InternalRuleDsl.g:312:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:316:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalRuleDsl.g:317:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalRuleDsl.g:317:2: ( ( rule__Where__Group__0 ) )
            // InternalRuleDsl.g:318:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalRuleDsl.g:319:3: ( rule__Where__Group__0 )
            // InternalRuleDsl.g:319:4: rule__Where__Group__0
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


    // $ANTLR start "entryRuleExpression"
    // InternalRuleDsl.g:328:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalRuleDsl.g:329:1: ( ruleExpression EOF )
            // InternalRuleDsl.g:330:1: ruleExpression EOF
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
    // InternalRuleDsl.g:337:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:341:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalRuleDsl.g:342:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalRuleDsl.g:342:2: ( ( rule__Expression__Alternatives ) )
            // InternalRuleDsl.g:343:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalRuleDsl.g:344:3: ( rule__Expression__Alternatives )
            // InternalRuleDsl.g:344:4: rule__Expression__Alternatives
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
    // InternalRuleDsl.g:353:1: entryRulePlainExpression : rulePlainExpression EOF ;
    public final void entryRulePlainExpression() throws RecognitionException {
        try {
            // InternalRuleDsl.g:354:1: ( rulePlainExpression EOF )
            // InternalRuleDsl.g:355:1: rulePlainExpression EOF
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
    // InternalRuleDsl.g:362:1: rulePlainExpression : ( ( rule__PlainExpression__PlainOperandAssignment ) ) ;
    public final void rulePlainExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:366:2: ( ( ( rule__PlainExpression__PlainOperandAssignment ) ) )
            // InternalRuleDsl.g:367:2: ( ( rule__PlainExpression__PlainOperandAssignment ) )
            {
            // InternalRuleDsl.g:367:2: ( ( rule__PlainExpression__PlainOperandAssignment ) )
            // InternalRuleDsl.g:368:3: ( rule__PlainExpression__PlainOperandAssignment )
            {
             before(grammarAccess.getPlainExpressionAccess().getPlainOperandAssignment()); 
            // InternalRuleDsl.g:369:3: ( rule__PlainExpression__PlainOperandAssignment )
            // InternalRuleDsl.g:369:4: rule__PlainExpression__PlainOperandAssignment
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
    // InternalRuleDsl.g:378:1: entryRuleComplexExpression : ruleComplexExpression EOF ;
    public final void entryRuleComplexExpression() throws RecognitionException {
        try {
            // InternalRuleDsl.g:379:1: ( ruleComplexExpression EOF )
            // InternalRuleDsl.g:380:1: ruleComplexExpression EOF
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
    // InternalRuleDsl.g:387:1: ruleComplexExpression : ( ( rule__ComplexExpression__Group__0 ) ) ;
    public final void ruleComplexExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:391:2: ( ( ( rule__ComplexExpression__Group__0 ) ) )
            // InternalRuleDsl.g:392:2: ( ( rule__ComplexExpression__Group__0 ) )
            {
            // InternalRuleDsl.g:392:2: ( ( rule__ComplexExpression__Group__0 ) )
            // InternalRuleDsl.g:393:3: ( rule__ComplexExpression__Group__0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getGroup()); 
            // InternalRuleDsl.g:394:3: ( rule__ComplexExpression__Group__0 )
            // InternalRuleDsl.g:394:4: rule__ComplexExpression__Group__0
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
    // InternalRuleDsl.g:403:1: entryRulePlainOperand : rulePlainOperand EOF ;
    public final void entryRulePlainOperand() throws RecognitionException {
        try {
            // InternalRuleDsl.g:404:1: ( rulePlainOperand EOF )
            // InternalRuleDsl.g:405:1: rulePlainOperand EOF
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
    // InternalRuleDsl.g:412:1: rulePlainOperand : ( ( rule__PlainOperand__Alternatives ) ) ;
    public final void rulePlainOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:416:2: ( ( ( rule__PlainOperand__Alternatives ) ) )
            // InternalRuleDsl.g:417:2: ( ( rule__PlainOperand__Alternatives ) )
            {
            // InternalRuleDsl.g:417:2: ( ( rule__PlainOperand__Alternatives ) )
            // InternalRuleDsl.g:418:3: ( rule__PlainOperand__Alternatives )
            {
             before(grammarAccess.getPlainOperandAccess().getAlternatives()); 
            // InternalRuleDsl.g:419:3: ( rule__PlainOperand__Alternatives )
            // InternalRuleDsl.g:419:4: rule__PlainOperand__Alternatives
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
    // InternalRuleDsl.g:428:1: entryRuleNumeral : ruleNumeral EOF ;
    public final void entryRuleNumeral() throws RecognitionException {
        try {
            // InternalRuleDsl.g:429:1: ( ruleNumeral EOF )
            // InternalRuleDsl.g:430:1: ruleNumeral EOF
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
    // InternalRuleDsl.g:437:1: ruleNumeral : ( ( rule__Numeral__ValueAssignment ) ) ;
    public final void ruleNumeral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:441:2: ( ( ( rule__Numeral__ValueAssignment ) ) )
            // InternalRuleDsl.g:442:2: ( ( rule__Numeral__ValueAssignment ) )
            {
            // InternalRuleDsl.g:442:2: ( ( rule__Numeral__ValueAssignment ) )
            // InternalRuleDsl.g:443:3: ( rule__Numeral__ValueAssignment )
            {
             before(grammarAccess.getNumeralAccess().getValueAssignment()); 
            // InternalRuleDsl.g:444:3: ( rule__Numeral__ValueAssignment )
            // InternalRuleDsl.g:444:4: rule__Numeral__ValueAssignment
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
    // InternalRuleDsl.g:453:1: entryRuleQueryOperand : ruleQueryOperand EOF ;
    public final void entryRuleQueryOperand() throws RecognitionException {
        try {
            // InternalRuleDsl.g:454:1: ( ruleQueryOperand EOF )
            // InternalRuleDsl.g:455:1: ruleQueryOperand EOF
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
    // InternalRuleDsl.g:462:1: ruleQueryOperand : ( ( rule__QueryOperand__QueryAssignment ) ) ;
    public final void ruleQueryOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:466:2: ( ( ( rule__QueryOperand__QueryAssignment ) ) )
            // InternalRuleDsl.g:467:2: ( ( rule__QueryOperand__QueryAssignment ) )
            {
            // InternalRuleDsl.g:467:2: ( ( rule__QueryOperand__QueryAssignment ) )
            // InternalRuleDsl.g:468:3: ( rule__QueryOperand__QueryAssignment )
            {
             before(grammarAccess.getQueryOperandAccess().getQueryAssignment()); 
            // InternalRuleDsl.g:469:3: ( rule__QueryOperand__QueryAssignment )
            // InternalRuleDsl.g:469:4: rule__QueryOperand__QueryAssignment
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
    // InternalRuleDsl.g:478:1: entryRuleComplexOperand : ruleComplexOperand EOF ;
    public final void entryRuleComplexOperand() throws RecognitionException {
        try {
            // InternalRuleDsl.g:479:1: ( ruleComplexOperand EOF )
            // InternalRuleDsl.g:480:1: ruleComplexOperand EOF
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
    // InternalRuleDsl.g:487:1: ruleComplexOperand : ( ( rule__ComplexOperand__Group__0 ) ) ;
    public final void ruleComplexOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:491:2: ( ( ( rule__ComplexOperand__Group__0 ) ) )
            // InternalRuleDsl.g:492:2: ( ( rule__ComplexOperand__Group__0 ) )
            {
            // InternalRuleDsl.g:492:2: ( ( rule__ComplexOperand__Group__0 ) )
            // InternalRuleDsl.g:493:3: ( rule__ComplexOperand__Group__0 )
            {
             before(grammarAccess.getComplexOperandAccess().getGroup()); 
            // InternalRuleDsl.g:494:3: ( rule__ComplexOperand__Group__0 )
            // InternalRuleDsl.g:494:4: rule__ComplexOperand__Group__0
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


    // $ANTLR start "entryRuleMessage"
    // InternalRuleDsl.g:503:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalRuleDsl.g:504:1: ( ruleMessage EOF )
            // InternalRuleDsl.g:505:1: ruleMessage EOF
            {
             before(grammarAccess.getMessageRule()); 
            pushFollow(FOLLOW_1);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getMessageRule()); 
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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // InternalRuleDsl.g:512:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:516:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalRuleDsl.g:517:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalRuleDsl.g:517:2: ( ( rule__Message__Group__0 ) )
            // InternalRuleDsl.g:518:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalRuleDsl.g:519:3: ( rule__Message__Group__0 )
            // InternalRuleDsl.g:519:4: rule__Message__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleMessageString"
    // InternalRuleDsl.g:528:1: entryRuleMessageString : ruleMessageString EOF ;
    public final void entryRuleMessageString() throws RecognitionException {
        try {
            // InternalRuleDsl.g:529:1: ( ruleMessageString EOF )
            // InternalRuleDsl.g:530:1: ruleMessageString EOF
            {
             before(grammarAccess.getMessageStringRule()); 
            pushFollow(FOLLOW_1);
            ruleMessageString();

            state._fsp--;

             after(grammarAccess.getMessageStringRule()); 
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
    // $ANTLR end "entryRuleMessageString"


    // $ANTLR start "ruleMessageString"
    // InternalRuleDsl.g:537:1: ruleMessageString : ( ( rule__MessageString__Alternatives ) ) ;
    public final void ruleMessageString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:541:2: ( ( ( rule__MessageString__Alternatives ) ) )
            // InternalRuleDsl.g:542:2: ( ( rule__MessageString__Alternatives ) )
            {
            // InternalRuleDsl.g:542:2: ( ( rule__MessageString__Alternatives ) )
            // InternalRuleDsl.g:543:3: ( rule__MessageString__Alternatives )
            {
             before(grammarAccess.getMessageStringAccess().getAlternatives()); 
            // InternalRuleDsl.g:544:3: ( rule__MessageString__Alternatives )
            // InternalRuleDsl.g:544:4: rule__MessageString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MessageString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMessageStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMessageString"


    // $ANTLR start "entryRuleSelectMessageString"
    // InternalRuleDsl.g:553:1: entryRuleSelectMessageString : ruleSelectMessageString EOF ;
    public final void entryRuleSelectMessageString() throws RecognitionException {
        try {
            // InternalRuleDsl.g:554:1: ( ruleSelectMessageString EOF )
            // InternalRuleDsl.g:555:1: ruleSelectMessageString EOF
            {
             before(grammarAccess.getSelectMessageStringRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectMessageString();

            state._fsp--;

             after(grammarAccess.getSelectMessageStringRule()); 
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
    // $ANTLR end "entryRuleSelectMessageString"


    // $ANTLR start "ruleSelectMessageString"
    // InternalRuleDsl.g:562:1: ruleSelectMessageString : ( ( rule__SelectMessageString__Group__0 ) ) ;
    public final void ruleSelectMessageString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:566:2: ( ( ( rule__SelectMessageString__Group__0 ) ) )
            // InternalRuleDsl.g:567:2: ( ( rule__SelectMessageString__Group__0 ) )
            {
            // InternalRuleDsl.g:567:2: ( ( rule__SelectMessageString__Group__0 ) )
            // InternalRuleDsl.g:568:3: ( rule__SelectMessageString__Group__0 )
            {
             before(grammarAccess.getSelectMessageStringAccess().getGroup()); 
            // InternalRuleDsl.g:569:3: ( rule__SelectMessageString__Group__0 )
            // InternalRuleDsl.g:569:4: rule__SelectMessageString__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectMessageString__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectMessageStringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectMessageString"


    // $ANTLR start "entryRuleTextMessageString"
    // InternalRuleDsl.g:578:1: entryRuleTextMessageString : ruleTextMessageString EOF ;
    public final void entryRuleTextMessageString() throws RecognitionException {
        try {
            // InternalRuleDsl.g:579:1: ( ruleTextMessageString EOF )
            // InternalRuleDsl.g:580:1: ruleTextMessageString EOF
            {
             before(grammarAccess.getTextMessageStringRule()); 
            pushFollow(FOLLOW_1);
            ruleTextMessageString();

            state._fsp--;

             after(grammarAccess.getTextMessageStringRule()); 
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
    // $ANTLR end "entryRuleTextMessageString"


    // $ANTLR start "ruleTextMessageString"
    // InternalRuleDsl.g:587:1: ruleTextMessageString : ( ( rule__TextMessageString__TextAssignment ) ) ;
    public final void ruleTextMessageString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:591:2: ( ( ( rule__TextMessageString__TextAssignment ) ) )
            // InternalRuleDsl.g:592:2: ( ( rule__TextMessageString__TextAssignment ) )
            {
            // InternalRuleDsl.g:592:2: ( ( rule__TextMessageString__TextAssignment ) )
            // InternalRuleDsl.g:593:3: ( rule__TextMessageString__TextAssignment )
            {
             before(grammarAccess.getTextMessageStringAccess().getTextAssignment()); 
            // InternalRuleDsl.g:594:3: ( rule__TextMessageString__TextAssignment )
            // InternalRuleDsl.g:594:4: rule__TextMessageString__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TextMessageString__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextMessageStringAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextMessageString"


    // $ANTLR start "entryRuleReceiver"
    // InternalRuleDsl.g:603:1: entryRuleReceiver : ruleReceiver EOF ;
    public final void entryRuleReceiver() throws RecognitionException {
        try {
            // InternalRuleDsl.g:604:1: ( ruleReceiver EOF )
            // InternalRuleDsl.g:605:1: ruleReceiver EOF
            {
             before(grammarAccess.getReceiverRule()); 
            pushFollow(FOLLOW_1);
            ruleReceiver();

            state._fsp--;

             after(grammarAccess.getReceiverRule()); 
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
    // $ANTLR end "entryRuleReceiver"


    // $ANTLR start "ruleReceiver"
    // InternalRuleDsl.g:612:1: ruleReceiver : ( ( rule__Receiver__Alternatives ) ) ;
    public final void ruleReceiver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:616:2: ( ( ( rule__Receiver__Alternatives ) ) )
            // InternalRuleDsl.g:617:2: ( ( rule__Receiver__Alternatives ) )
            {
            // InternalRuleDsl.g:617:2: ( ( rule__Receiver__Alternatives ) )
            // InternalRuleDsl.g:618:3: ( rule__Receiver__Alternatives )
            {
             before(grammarAccess.getReceiverAccess().getAlternatives()); 
            // InternalRuleDsl.g:619:3: ( rule__Receiver__Alternatives )
            // InternalRuleDsl.g:619:4: rule__Receiver__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Receiver__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getReceiverAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReceiver"


    // $ANTLR start "entryRuleReceiverList"
    // InternalRuleDsl.g:628:1: entryRuleReceiverList : ruleReceiverList EOF ;
    public final void entryRuleReceiverList() throws RecognitionException {
        try {
            // InternalRuleDsl.g:629:1: ( ruleReceiverList EOF )
            // InternalRuleDsl.g:630:1: ruleReceiverList EOF
            {
             before(grammarAccess.getReceiverListRule()); 
            pushFollow(FOLLOW_1);
            ruleReceiverList();

            state._fsp--;

             after(grammarAccess.getReceiverListRule()); 
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
    // $ANTLR end "entryRuleReceiverList"


    // $ANTLR start "ruleReceiverList"
    // InternalRuleDsl.g:637:1: ruleReceiverList : ( ( rule__ReceiverList__Group__0 ) ) ;
    public final void ruleReceiverList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:641:2: ( ( ( rule__ReceiverList__Group__0 ) ) )
            // InternalRuleDsl.g:642:2: ( ( rule__ReceiverList__Group__0 ) )
            {
            // InternalRuleDsl.g:642:2: ( ( rule__ReceiverList__Group__0 ) )
            // InternalRuleDsl.g:643:3: ( rule__ReceiverList__Group__0 )
            {
             before(grammarAccess.getReceiverListAccess().getGroup()); 
            // InternalRuleDsl.g:644:3: ( rule__ReceiverList__Group__0 )
            // InternalRuleDsl.g:644:4: rule__ReceiverList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReceiverListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReceiverList"


    // $ANTLR start "entryRuleDistributionList"
    // InternalRuleDsl.g:653:1: entryRuleDistributionList : ruleDistributionList EOF ;
    public final void entryRuleDistributionList() throws RecognitionException {
        try {
            // InternalRuleDsl.g:654:1: ( ruleDistributionList EOF )
            // InternalRuleDsl.g:655:1: ruleDistributionList EOF
            {
             before(grammarAccess.getDistributionListRule()); 
            pushFollow(FOLLOW_1);
            ruleDistributionList();

            state._fsp--;

             after(grammarAccess.getDistributionListRule()); 
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
    // $ANTLR end "entryRuleDistributionList"


    // $ANTLR start "ruleDistributionList"
    // InternalRuleDsl.g:662:1: ruleDistributionList : ( ( rule__DistributionList__Group__0 ) ) ;
    public final void ruleDistributionList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:666:2: ( ( ( rule__DistributionList__Group__0 ) ) )
            // InternalRuleDsl.g:667:2: ( ( rule__DistributionList__Group__0 ) )
            {
            // InternalRuleDsl.g:667:2: ( ( rule__DistributionList__Group__0 ) )
            // InternalRuleDsl.g:668:3: ( rule__DistributionList__Group__0 )
            {
             before(grammarAccess.getDistributionListAccess().getGroup()); 
            // InternalRuleDsl.g:669:3: ( rule__DistributionList__Group__0 )
            // InternalRuleDsl.g:669:4: rule__DistributionList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistributionList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistributionListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistributionList"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalRuleDsl.g:677:1: rule__Action__Alternatives : ( ( ruleQuery ) | ( ruleMessage ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:681:1: ( ( ruleQuery ) | ( ruleMessage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==24) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==33) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==RULE_SELECTOPERATOR||LA1_2==26) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRuleDsl.g:682:2: ( ruleQuery )
                    {
                    // InternalRuleDsl.g:682:2: ( ruleQuery )
                    // InternalRuleDsl.g:683:3: ruleQuery
                    {
                     before(grammarAccess.getActionAccess().getQueryParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQuery();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getQueryParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:688:2: ( ruleMessage )
                    {
                    // InternalRuleDsl.g:688:2: ( ruleMessage )
                    // InternalRuleDsl.g:689:3: ruleMessage
                    {
                     before(grammarAccess.getActionAccess().getMessageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMessage();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getMessageParserRuleCall_1()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__AddingSelect__Alternatives_1"
    // InternalRuleDsl.g:698:1: rule__AddingSelect__Alternatives_1 : ( ( ( rule__AddingSelect__ElementAssignment_1_0 )? ) | ( ( rule__AddingSelect__AllAssignment_1_1 ) ) );
    public final void rule__AddingSelect__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:702:1: ( ( ( rule__AddingSelect__ElementAssignment_1_0 )? ) | ( ( rule__AddingSelect__AllAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_ID||LA3_0==25) ) {
                alt3=1;
            }
            else if ( (LA3_0==37) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRuleDsl.g:703:2: ( ( rule__AddingSelect__ElementAssignment_1_0 )? )
                    {
                    // InternalRuleDsl.g:703:2: ( ( rule__AddingSelect__ElementAssignment_1_0 )? )
                    // InternalRuleDsl.g:704:3: ( rule__AddingSelect__ElementAssignment_1_0 )?
                    {
                     before(grammarAccess.getAddingSelectAccess().getElementAssignment_1_0()); 
                    // InternalRuleDsl.g:705:3: ( rule__AddingSelect__ElementAssignment_1_0 )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalRuleDsl.g:705:4: rule__AddingSelect__ElementAssignment_1_0
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
                    // InternalRuleDsl.g:709:2: ( ( rule__AddingSelect__AllAssignment_1_1 ) )
                    {
                    // InternalRuleDsl.g:709:2: ( ( rule__AddingSelect__AllAssignment_1_1 ) )
                    // InternalRuleDsl.g:710:3: ( rule__AddingSelect__AllAssignment_1_1 )
                    {
                     before(grammarAccess.getAddingSelectAccess().getAllAssignment_1_1()); 
                    // InternalRuleDsl.g:711:3: ( rule__AddingSelect__AllAssignment_1_1 )
                    // InternalRuleDsl.g:711:4: rule__AddingSelect__AllAssignment_1_1
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


    // $ANTLR start "rule__Select__Alternatives"
    // InternalRuleDsl.g:719:1: rule__Select__Alternatives : ( ( ruleAddingSelect ) | ( ruleSetSelect ) );
    public final void rule__Select__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:723:1: ( ( ruleAddingSelect ) | ( ruleSetSelect ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SELECTOPERATOR) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRuleDsl.g:724:2: ( ruleAddingSelect )
                    {
                    // InternalRuleDsl.g:724:2: ( ruleAddingSelect )
                    // InternalRuleDsl.g:725:3: ruleAddingSelect
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
                    // InternalRuleDsl.g:730:2: ( ruleSetSelect )
                    {
                    // InternalRuleDsl.g:730:2: ( ruleSetSelect )
                    // InternalRuleDsl.g:731:3: ruleSetSelect
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


    // $ANTLR start "rule__Where__Alternatives_2"
    // InternalRuleDsl.g:740:1: rule__Where__Alternatives_2 : ( ( ( rule__Where__RightAssignment_2_0 ) ) | ( ( rule__Where__Group_2_1__0 ) ) );
    public final void rule__Where__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:744:1: ( ( ( rule__Where__RightAssignment_2_0 ) ) | ( ( rule__Where__Group_2_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRuleDsl.g:745:2: ( ( rule__Where__RightAssignment_2_0 ) )
                    {
                    // InternalRuleDsl.g:745:2: ( ( rule__Where__RightAssignment_2_0 ) )
                    // InternalRuleDsl.g:746:3: ( rule__Where__RightAssignment_2_0 )
                    {
                     before(grammarAccess.getWhereAccess().getRightAssignment_2_0()); 
                    // InternalRuleDsl.g:747:3: ( rule__Where__RightAssignment_2_0 )
                    // InternalRuleDsl.g:747:4: rule__Where__RightAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Where__RightAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereAccess().getRightAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:751:2: ( ( rule__Where__Group_2_1__0 ) )
                    {
                    // InternalRuleDsl.g:751:2: ( ( rule__Where__Group_2_1__0 ) )
                    // InternalRuleDsl.g:752:3: ( rule__Where__Group_2_1__0 )
                    {
                     before(grammarAccess.getWhereAccess().getGroup_2_1()); 
                    // InternalRuleDsl.g:753:3: ( rule__Where__Group_2_1__0 )
                    // InternalRuleDsl.g:753:4: rule__Where__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Where__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereAccess().getGroup_2_1()); 

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
    // $ANTLR end "rule__Where__Alternatives_2"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalRuleDsl.g:761:1: rule__Expression__Alternatives : ( ( rulePlainExpression ) | ( ruleComplexExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:765:1: ( ( rulePlainExpression ) | ( ruleComplexExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==RULE_DOUBLE) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRuleDsl.g:766:2: ( rulePlainExpression )
                    {
                    // InternalRuleDsl.g:766:2: ( rulePlainExpression )
                    // InternalRuleDsl.g:767:3: rulePlainExpression
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
                    // InternalRuleDsl.g:772:2: ( ruleComplexExpression )
                    {
                    // InternalRuleDsl.g:772:2: ( ruleComplexExpression )
                    // InternalRuleDsl.g:773:3: ruleComplexExpression
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
    // InternalRuleDsl.g:782:1: rule__PlainOperand__Alternatives : ( ( ruleNumeral ) | ( ruleQueryOperand ) );
    public final void rule__PlainOperand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:786:1: ( ( ruleNumeral ) | ( ruleQueryOperand ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_DOUBLE) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRuleDsl.g:787:2: ( ruleNumeral )
                    {
                    // InternalRuleDsl.g:787:2: ( ruleNumeral )
                    // InternalRuleDsl.g:788:3: ruleNumeral
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
                    // InternalRuleDsl.g:793:2: ( ruleQueryOperand )
                    {
                    // InternalRuleDsl.g:793:2: ( ruleQueryOperand )
                    // InternalRuleDsl.g:794:3: ruleQueryOperand
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


    // $ANTLR start "rule__MessageString__Alternatives"
    // InternalRuleDsl.g:803:1: rule__MessageString__Alternatives : ( ( ruleTextMessageString ) | ( ruleSelectMessageString ) );
    public final void rule__MessageString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:807:1: ( ( ruleTextMessageString ) | ( ruleSelectMessageString ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRuleDsl.g:808:2: ( ruleTextMessageString )
                    {
                    // InternalRuleDsl.g:808:2: ( ruleTextMessageString )
                    // InternalRuleDsl.g:809:3: ruleTextMessageString
                    {
                     before(grammarAccess.getMessageStringAccess().getTextMessageStringParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextMessageString();

                    state._fsp--;

                     after(grammarAccess.getMessageStringAccess().getTextMessageStringParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:814:2: ( ruleSelectMessageString )
                    {
                    // InternalRuleDsl.g:814:2: ( ruleSelectMessageString )
                    // InternalRuleDsl.g:815:3: ruleSelectMessageString
                    {
                     before(grammarAccess.getMessageStringAccess().getSelectMessageStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectMessageString();

                    state._fsp--;

                     after(grammarAccess.getMessageStringAccess().getSelectMessageStringParserRuleCall_1()); 

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
    // $ANTLR end "rule__MessageString__Alternatives"


    // $ANTLR start "rule__Receiver__Alternatives"
    // InternalRuleDsl.g:824:1: rule__Receiver__Alternatives : ( ( ruleReceiverList ) | ( ruleDistributionList ) );
    public final void rule__Receiver__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:828:1: ( ( ruleReceiverList ) | ( ruleDistributionList ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            else if ( (LA9_0==36) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRuleDsl.g:829:2: ( ruleReceiverList )
                    {
                    // InternalRuleDsl.g:829:2: ( ruleReceiverList )
                    // InternalRuleDsl.g:830:3: ruleReceiverList
                    {
                     before(grammarAccess.getReceiverAccess().getReceiverListParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleReceiverList();

                    state._fsp--;

                     after(grammarAccess.getReceiverAccess().getReceiverListParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRuleDsl.g:835:2: ( ruleDistributionList )
                    {
                    // InternalRuleDsl.g:835:2: ( ruleDistributionList )
                    // InternalRuleDsl.g:836:3: ruleDistributionList
                    {
                     before(grammarAccess.getReceiverAccess().getDistributionListParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDistributionList();

                    state._fsp--;

                     after(grammarAccess.getReceiverAccess().getDistributionListParserRuleCall_1()); 

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
    // $ANTLR end "rule__Receiver__Alternatives"


    // $ANTLR start "rule__RuleModel__Group__0"
    // InternalRuleDsl.g:845:1: rule__RuleModel__Group__0 : rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1 ;
    public final void rule__RuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:849:1: ( rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1 )
            // InternalRuleDsl.g:850:2: rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1
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
    // InternalRuleDsl.g:857:1: rule__RuleModel__Group__0__Impl : ( ( rule__RuleModel__Group_0__0 )? ) ;
    public final void rule__RuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:861:1: ( ( ( rule__RuleModel__Group_0__0 )? ) )
            // InternalRuleDsl.g:862:1: ( ( rule__RuleModel__Group_0__0 )? )
            {
            // InternalRuleDsl.g:862:1: ( ( rule__RuleModel__Group_0__0 )? )
            // InternalRuleDsl.g:863:2: ( rule__RuleModel__Group_0__0 )?
            {
             before(grammarAccess.getRuleModelAccess().getGroup_0()); 
            // InternalRuleDsl.g:864:2: ( rule__RuleModel__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRuleDsl.g:864:3: rule__RuleModel__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleModel__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleModelAccess().getGroup_0()); 

            }


            }

        }
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
    // InternalRuleDsl.g:872:1: rule__RuleModel__Group__1 : rule__RuleModel__Group__1__Impl ;
    public final void rule__RuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:876:1: ( rule__RuleModel__Group__1__Impl )
            // InternalRuleDsl.g:877:2: rule__RuleModel__Group__1__Impl
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
    // InternalRuleDsl.g:883:1: rule__RuleModel__Group__1__Impl : ( ( rule__RuleModel__Group_1__0 )? ) ;
    public final void rule__RuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:887:1: ( ( ( rule__RuleModel__Group_1__0 )? ) )
            // InternalRuleDsl.g:888:1: ( ( rule__RuleModel__Group_1__0 )? )
            {
            // InternalRuleDsl.g:888:1: ( ( rule__RuleModel__Group_1__0 )? )
            // InternalRuleDsl.g:889:2: ( rule__RuleModel__Group_1__0 )?
            {
             before(grammarAccess.getRuleModelAccess().getGroup_1()); 
            // InternalRuleDsl.g:890:2: ( rule__RuleModel__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRuleDsl.g:890:3: rule__RuleModel__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RuleModel__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleModelAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RuleModel__Group_0__0"
    // InternalRuleDsl.g:899:1: rule__RuleModel__Group_0__0 : rule__RuleModel__Group_0__0__Impl rule__RuleModel__Group_0__1 ;
    public final void rule__RuleModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:903:1: ( rule__RuleModel__Group_0__0__Impl rule__RuleModel__Group_0__1 )
            // InternalRuleDsl.g:904:2: rule__RuleModel__Group_0__0__Impl rule__RuleModel__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__RuleModel__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleModel__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group_0__0"


    // $ANTLR start "rule__RuleModel__Group_0__0__Impl"
    // InternalRuleDsl.g:911:1: rule__RuleModel__Group_0__0__Impl : ( ( rule__RuleModel__ImportsAssignment_0_0 ) ) ;
    public final void rule__RuleModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:915:1: ( ( ( rule__RuleModel__ImportsAssignment_0_0 ) ) )
            // InternalRuleDsl.g:916:1: ( ( rule__RuleModel__ImportsAssignment_0_0 ) )
            {
            // InternalRuleDsl.g:916:1: ( ( rule__RuleModel__ImportsAssignment_0_0 ) )
            // InternalRuleDsl.g:917:2: ( rule__RuleModel__ImportsAssignment_0_0 )
            {
             before(grammarAccess.getRuleModelAccess().getImportsAssignment_0_0()); 
            // InternalRuleDsl.g:918:2: ( rule__RuleModel__ImportsAssignment_0_0 )
            // InternalRuleDsl.g:918:3: rule__RuleModel__ImportsAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleModel__ImportsAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleModelAccess().getImportsAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group_0__0__Impl"


    // $ANTLR start "rule__RuleModel__Group_0__1"
    // InternalRuleDsl.g:926:1: rule__RuleModel__Group_0__1 : rule__RuleModel__Group_0__1__Impl ;
    public final void rule__RuleModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:930:1: ( rule__RuleModel__Group_0__1__Impl )
            // InternalRuleDsl.g:931:2: rule__RuleModel__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleModel__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group_0__1"


    // $ANTLR start "rule__RuleModel__Group_0__1__Impl"
    // InternalRuleDsl.g:937:1: rule__RuleModel__Group_0__1__Impl : ( ( rule__RuleModel__ImportsAssignment_0_1 )* ) ;
    public final void rule__RuleModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:941:1: ( ( ( rule__RuleModel__ImportsAssignment_0_1 )* ) )
            // InternalRuleDsl.g:942:1: ( ( rule__RuleModel__ImportsAssignment_0_1 )* )
            {
            // InternalRuleDsl.g:942:1: ( ( rule__RuleModel__ImportsAssignment_0_1 )* )
            // InternalRuleDsl.g:943:2: ( rule__RuleModel__ImportsAssignment_0_1 )*
            {
             before(grammarAccess.getRuleModelAccess().getImportsAssignment_0_1()); 
            // InternalRuleDsl.g:944:2: ( rule__RuleModel__ImportsAssignment_0_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRuleDsl.g:944:3: rule__RuleModel__ImportsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RuleModel__ImportsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRuleModelAccess().getImportsAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group_0__1__Impl"


    // $ANTLR start "rule__RuleModel__Group_1__0"
    // InternalRuleDsl.g:953:1: rule__RuleModel__Group_1__0 : rule__RuleModel__Group_1__0__Impl rule__RuleModel__Group_1__1 ;
    public final void rule__RuleModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:957:1: ( rule__RuleModel__Group_1__0__Impl rule__RuleModel__Group_1__1 )
            // InternalRuleDsl.g:958:2: rule__RuleModel__Group_1__0__Impl rule__RuleModel__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__RuleModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RuleModel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group_1__0"


    // $ANTLR start "rule__RuleModel__Group_1__0__Impl"
    // InternalRuleDsl.g:965:1: rule__RuleModel__Group_1__0__Impl : ( ( rule__RuleModel__ElementsAssignment_1_0 ) ) ;
    public final void rule__RuleModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:969:1: ( ( ( rule__RuleModel__ElementsAssignment_1_0 ) ) )
            // InternalRuleDsl.g:970:1: ( ( rule__RuleModel__ElementsAssignment_1_0 ) )
            {
            // InternalRuleDsl.g:970:1: ( ( rule__RuleModel__ElementsAssignment_1_0 ) )
            // InternalRuleDsl.g:971:2: ( rule__RuleModel__ElementsAssignment_1_0 )
            {
             before(grammarAccess.getRuleModelAccess().getElementsAssignment_1_0()); 
            // InternalRuleDsl.g:972:2: ( rule__RuleModel__ElementsAssignment_1_0 )
            // InternalRuleDsl.g:972:3: rule__RuleModel__ElementsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RuleModel__ElementsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleModelAccess().getElementsAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group_1__0__Impl"


    // $ANTLR start "rule__RuleModel__Group_1__1"
    // InternalRuleDsl.g:980:1: rule__RuleModel__Group_1__1 : rule__RuleModel__Group_1__1__Impl ;
    public final void rule__RuleModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:984:1: ( rule__RuleModel__Group_1__1__Impl )
            // InternalRuleDsl.g:985:2: rule__RuleModel__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RuleModel__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group_1__1"


    // $ANTLR start "rule__RuleModel__Group_1__1__Impl"
    // InternalRuleDsl.g:991:1: rule__RuleModel__Group_1__1__Impl : ( ( rule__RuleModel__ElementsAssignment_1_1 )* ) ;
    public final void rule__RuleModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:995:1: ( ( ( rule__RuleModel__ElementsAssignment_1_1 )* ) )
            // InternalRuleDsl.g:996:1: ( ( rule__RuleModel__ElementsAssignment_1_1 )* )
            {
            // InternalRuleDsl.g:996:1: ( ( rule__RuleModel__ElementsAssignment_1_1 )* )
            // InternalRuleDsl.g:997:2: ( rule__RuleModel__ElementsAssignment_1_1 )*
            {
             before(grammarAccess.getRuleModelAccess().getElementsAssignment_1_1()); 
            // InternalRuleDsl.g:998:2: ( rule__RuleModel__ElementsAssignment_1_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRuleDsl.g:998:3: rule__RuleModel__ElementsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RuleModel__ElementsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRuleModelAccess().getElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalRuleDsl.g:1007:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1011:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRuleDsl.g:1012:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDsl.g:1019:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1023:1: ( ( 'import' ) )
            // InternalRuleDsl.g:1024:1: ( 'import' )
            {
            // InternalRuleDsl.g:1024:1: ( 'import' )
            // InternalRuleDsl.g:1025:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalRuleDsl.g:1034:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1038:1: ( rule__Import__Group__1__Impl )
            // InternalRuleDsl.g:1039:2: rule__Import__Group__1__Impl
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
    // InternalRuleDsl.g:1045:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1049:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalRuleDsl.g:1050:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRuleDsl.g:1050:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalRuleDsl.g:1051:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalRuleDsl.g:1052:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalRuleDsl.g:1052:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalRuleDsl.g:1061:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1065:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRuleDsl.g:1066:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRuleDsl.g:1073:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1077:1: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:1078:1: ( ruleQualifiedName )
            {
            // InternalRuleDsl.g:1078:1: ( ruleQualifiedName )
            // InternalRuleDsl.g:1079:2: ruleQualifiedName
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
    // InternalRuleDsl.g:1088:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1092:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRuleDsl.g:1093:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalRuleDsl.g:1099:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1103:1: ( ( ( '.*' )? ) )
            // InternalRuleDsl.g:1104:1: ( ( '.*' )? )
            {
            // InternalRuleDsl.g:1104:1: ( ( '.*' )? )
            // InternalRuleDsl.g:1105:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalRuleDsl.g:1106:2: ( '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRuleDsl.g:1106:3: '.*'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalRuleDsl.g:1115:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1119:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRuleDsl.g:1120:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRuleDsl.g:1127:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1131:1: ( ( RULE_ID ) )
            // InternalRuleDsl.g:1132:1: ( RULE_ID )
            {
            // InternalRuleDsl.g:1132:1: ( RULE_ID )
            // InternalRuleDsl.g:1133:2: RULE_ID
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
    // InternalRuleDsl.g:1142:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1146:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRuleDsl.g:1147:2: rule__QualifiedName__Group__1__Impl
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
    // InternalRuleDsl.g:1153:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1157:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRuleDsl.g:1158:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRuleDsl.g:1158:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRuleDsl.g:1159:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalRuleDsl.g:1160:2: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==19) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRuleDsl.g:1160:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalRuleDsl.g:1169:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1173:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRuleDsl.g:1174:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDsl.g:1181:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1185:1: ( ( '.' ) )
            // InternalRuleDsl.g:1186:1: ( '.' )
            {
            // InternalRuleDsl.g:1186:1: ( '.' )
            // InternalRuleDsl.g:1187:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRuleDsl.g:1196:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1200:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRuleDsl.g:1201:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalRuleDsl.g:1207:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1211:1: ( ( RULE_ID ) )
            // InternalRuleDsl.g:1212:1: ( RULE_ID )
            {
            // InternalRuleDsl.g:1212:1: ( RULE_ID )
            // InternalRuleDsl.g:1213:2: RULE_ID
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


    // $ANTLR start "rule__Rule__Group__0"
    // InternalRuleDsl.g:1223:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1227:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRuleDsl.g:1228:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRuleDsl.g:1235:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__NameAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1239:1: ( ( ( rule__Rule__NameAssignment_0 ) ) )
            // InternalRuleDsl.g:1240:1: ( ( rule__Rule__NameAssignment_0 ) )
            {
            // InternalRuleDsl.g:1240:1: ( ( rule__Rule__NameAssignment_0 ) )
            // InternalRuleDsl.g:1241:2: ( rule__Rule__NameAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0()); 
            // InternalRuleDsl.g:1242:2: ( rule__Rule__NameAssignment_0 )
            // InternalRuleDsl.g:1242:3: rule__Rule__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1250:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1254:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRuleDsl.g:1255:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalRuleDsl.g:1262:1: rule__Rule__Group__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1266:1: ( ( '{' ) )
            // InternalRuleDsl.g:1267:1: ( '{' )
            {
            // InternalRuleDsl.g:1267:1: ( '{' )
            // InternalRuleDsl.g:1268:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1277:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1281:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRuleDsl.g:1282:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDsl.g:1289:1: rule__Rule__Group__2__Impl : ( 'on' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1293:1: ( ( 'on' ) )
            // InternalRuleDsl.g:1294:1: ( 'on' )
            {
            // InternalRuleDsl.g:1294:1: ( 'on' )
            // InternalRuleDsl.g:1295:2: 'on'
            {
             before(grammarAccess.getRuleAccess().getOnKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getOnKeyword_2()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1304:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1308:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRuleDsl.g:1309:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalRuleDsl.g:1316:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__EventAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1320:1: ( ( ( rule__Rule__EventAssignment_3 ) ) )
            // InternalRuleDsl.g:1321:1: ( ( rule__Rule__EventAssignment_3 ) )
            {
            // InternalRuleDsl.g:1321:1: ( ( rule__Rule__EventAssignment_3 ) )
            // InternalRuleDsl.g:1322:2: ( rule__Rule__EventAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getEventAssignment_3()); 
            // InternalRuleDsl.g:1323:2: ( rule__Rule__EventAssignment_3 )
            // InternalRuleDsl.g:1323:3: rule__Rule__EventAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__EventAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getEventAssignment_3()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1331:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1335:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalRuleDsl.g:1336:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalRuleDsl.g:1343:1: rule__Rule__Group__4__Impl : ( 'do' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1347:1: ( ( 'do' ) )
            // InternalRuleDsl.g:1348:1: ( 'do' )
            {
            // InternalRuleDsl.g:1348:1: ( 'do' )
            // InternalRuleDsl.g:1349:2: 'do'
            {
             before(grammarAccess.getRuleAccess().getDoKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getDoKeyword_4()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1358:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1362:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalRuleDsl.g:1363:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDsl.g:1370:1: rule__Rule__Group__5__Impl : ( '{' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1374:1: ( ( '{' ) )
            // InternalRuleDsl.g:1375:1: ( '{' )
            {
            // InternalRuleDsl.g:1375:1: ( '{' )
            // InternalRuleDsl.g:1376:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1385:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl rule__Rule__Group__7 ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1389:1: ( rule__Rule__Group__6__Impl rule__Rule__Group__7 )
            // InternalRuleDsl.g:1390:2: rule__Rule__Group__6__Impl rule__Rule__Group__7
            {
            pushFollow(FOLLOW_13);
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
    // InternalRuleDsl.g:1397:1: rule__Rule__Group__6__Impl : ( ( rule__Rule__Group_6__0 ) ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1401:1: ( ( ( rule__Rule__Group_6__0 ) ) )
            // InternalRuleDsl.g:1402:1: ( ( rule__Rule__Group_6__0 ) )
            {
            // InternalRuleDsl.g:1402:1: ( ( rule__Rule__Group_6__0 ) )
            // InternalRuleDsl.g:1403:2: ( rule__Rule__Group_6__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup_6()); 
            // InternalRuleDsl.g:1404:2: ( rule__Rule__Group_6__0 )
            // InternalRuleDsl.g:1404:3: rule__Rule__Group_6__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__0();

            state._fsp--;


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
    // InternalRuleDsl.g:1412:1: rule__Rule__Group__7 : rule__Rule__Group__7__Impl rule__Rule__Group__8 ;
    public final void rule__Rule__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1416:1: ( rule__Rule__Group__7__Impl rule__Rule__Group__8 )
            // InternalRuleDsl.g:1417:2: rule__Rule__Group__7__Impl rule__Rule__Group__8
            {
            pushFollow(FOLLOW_13);
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
    // InternalRuleDsl.g:1424:1: rule__Rule__Group__7__Impl : ( '}' ) ;
    public final void rule__Rule__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1428:1: ( ( '}' ) )
            // InternalRuleDsl.g:1429:1: ( '}' )
            {
            // InternalRuleDsl.g:1429:1: ( '}' )
            // InternalRuleDsl.g:1430:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1439:1: rule__Rule__Group__8 : rule__Rule__Group__8__Impl ;
    public final void rule__Rule__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1443:1: ( rule__Rule__Group__8__Impl )
            // InternalRuleDsl.g:1444:2: rule__Rule__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__8__Impl();

            state._fsp--;


            }

        }
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
    // InternalRuleDsl.g:1450:1: rule__Rule__Group__8__Impl : ( '}' ) ;
    public final void rule__Rule__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1454:1: ( ( '}' ) )
            // InternalRuleDsl.g:1455:1: ( '}' )
            {
            // InternalRuleDsl.g:1455:1: ( '}' )
            // InternalRuleDsl.g:1456:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rule__Group_6__0"
    // InternalRuleDsl.g:1466:1: rule__Rule__Group_6__0 : rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 ;
    public final void rule__Rule__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1470:1: ( rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1 )
            // InternalRuleDsl.g:1471:2: rule__Rule__Group_6__0__Impl rule__Rule__Group_6__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDsl.g:1478:1: rule__Rule__Group_6__0__Impl : ( ( rule__Rule__ActionsAssignment_6_0 ) ) ;
    public final void rule__Rule__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1482:1: ( ( ( rule__Rule__ActionsAssignment_6_0 ) ) )
            // InternalRuleDsl.g:1483:1: ( ( rule__Rule__ActionsAssignment_6_0 ) )
            {
            // InternalRuleDsl.g:1483:1: ( ( rule__Rule__ActionsAssignment_6_0 ) )
            // InternalRuleDsl.g:1484:2: ( rule__Rule__ActionsAssignment_6_0 )
            {
             before(grammarAccess.getRuleAccess().getActionsAssignment_6_0()); 
            // InternalRuleDsl.g:1485:2: ( rule__Rule__ActionsAssignment_6_0 )
            // InternalRuleDsl.g:1485:3: rule__Rule__ActionsAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionsAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionsAssignment_6_0()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1493:1: rule__Rule__Group_6__1 : rule__Rule__Group_6__1__Impl ;
    public final void rule__Rule__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1497:1: ( rule__Rule__Group_6__1__Impl )
            // InternalRuleDsl.g:1498:2: rule__Rule__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_6__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalRuleDsl.g:1504:1: rule__Rule__Group_6__1__Impl : ( ( rule__Rule__ActionsAssignment_6_1 )* ) ;
    public final void rule__Rule__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1508:1: ( ( ( rule__Rule__ActionsAssignment_6_1 )* ) )
            // InternalRuleDsl.g:1509:1: ( ( rule__Rule__ActionsAssignment_6_1 )* )
            {
            // InternalRuleDsl.g:1509:1: ( ( rule__Rule__ActionsAssignment_6_1 )* )
            // InternalRuleDsl.g:1510:2: ( rule__Rule__ActionsAssignment_6_1 )*
            {
             before(grammarAccess.getRuleAccess().getActionsAssignment_6_1()); 
            // InternalRuleDsl.g:1511:2: ( rule__Rule__ActionsAssignment_6_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRuleDsl.g:1511:3: rule__Rule__ActionsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Rule__ActionsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getActionsAssignment_6_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Query__Group__0"
    // InternalRuleDsl.g:1520:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1524:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalRuleDsl.g:1525:2: rule__Query__Group__0__Impl rule__Query__Group__1
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
    // InternalRuleDsl.g:1532:1: rule__Query__Group__0__Impl : ( ( rule__Query__NameAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1536:1: ( ( ( rule__Query__NameAssignment_0 ) ) )
            // InternalRuleDsl.g:1537:1: ( ( rule__Query__NameAssignment_0 ) )
            {
            // InternalRuleDsl.g:1537:1: ( ( rule__Query__NameAssignment_0 ) )
            // InternalRuleDsl.g:1538:2: ( rule__Query__NameAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_0()); 
            // InternalRuleDsl.g:1539:2: ( rule__Query__NameAssignment_0 )
            // InternalRuleDsl.g:1539:3: rule__Query__NameAssignment_0
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
    // InternalRuleDsl.g:1547:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1551:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalRuleDsl.g:1552:2: rule__Query__Group__1__Impl rule__Query__Group__2
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
    // InternalRuleDsl.g:1559:1: rule__Query__Group__1__Impl : ( ':' ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1563:1: ( ( ':' ) )
            // InternalRuleDsl.g:1564:1: ( ':' )
            {
            // InternalRuleDsl.g:1564:1: ( ':' )
            // InternalRuleDsl.g:1565:2: ':'
            {
             before(grammarAccess.getQueryAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRuleDsl.g:1574:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1578:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalRuleDsl.g:1579:2: rule__Query__Group__2__Impl rule__Query__Group__3
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
    // InternalRuleDsl.g:1586:1: rule__Query__Group__2__Impl : ( ( rule__Query__SelectAssignment_2 ) ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1590:1: ( ( ( rule__Query__SelectAssignment_2 ) ) )
            // InternalRuleDsl.g:1591:1: ( ( rule__Query__SelectAssignment_2 ) )
            {
            // InternalRuleDsl.g:1591:1: ( ( rule__Query__SelectAssignment_2 ) )
            // InternalRuleDsl.g:1592:2: ( rule__Query__SelectAssignment_2 )
            {
             before(grammarAccess.getQueryAccess().getSelectAssignment_2()); 
            // InternalRuleDsl.g:1593:2: ( rule__Query__SelectAssignment_2 )
            // InternalRuleDsl.g:1593:3: rule__Query__SelectAssignment_2
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
    // InternalRuleDsl.g:1601:1: rule__Query__Group__3 : rule__Query__Group__3__Impl rule__Query__Group__4 ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1605:1: ( rule__Query__Group__3__Impl rule__Query__Group__4 )
            // InternalRuleDsl.g:1606:2: rule__Query__Group__3__Impl rule__Query__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Query__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__4();

            state._fsp--;


            }

        }
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
    // InternalRuleDsl.g:1613:1: rule__Query__Group__3__Impl : ( 'then' ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1617:1: ( ( 'then' ) )
            // InternalRuleDsl.g:1618:1: ( 'then' )
            {
            // InternalRuleDsl.g:1618:1: ( 'then' )
            // InternalRuleDsl.g:1619:2: 'then'
            {
             before(grammarAccess.getQueryAccess().getThenKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getThenKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Query__Group__4"
    // InternalRuleDsl.g:1628:1: rule__Query__Group__4 : rule__Query__Group__4__Impl rule__Query__Group__5 ;
    public final void rule__Query__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1632:1: ( rule__Query__Group__4__Impl rule__Query__Group__5 )
            // InternalRuleDsl.g:1633:2: rule__Query__Group__4__Impl rule__Query__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Query__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4"


    // $ANTLR start "rule__Query__Group__4__Impl"
    // InternalRuleDsl.g:1640:1: rule__Query__Group__4__Impl : ( '{' ) ;
    public final void rule__Query__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1644:1: ( ( '{' ) )
            // InternalRuleDsl.g:1645:1: ( '{' )
            {
            // InternalRuleDsl.g:1645:1: ( '{' )
            // InternalRuleDsl.g:1646:2: '{'
            {
             before(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__4__Impl"


    // $ANTLR start "rule__Query__Group__5"
    // InternalRuleDsl.g:1655:1: rule__Query__Group__5 : rule__Query__Group__5__Impl rule__Query__Group__6 ;
    public final void rule__Query__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1659:1: ( rule__Query__Group__5__Impl rule__Query__Group__6 )
            // InternalRuleDsl.g:1660:2: rule__Query__Group__5__Impl rule__Query__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Query__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5"


    // $ANTLR start "rule__Query__Group__5__Impl"
    // InternalRuleDsl.g:1667:1: rule__Query__Group__5__Impl : ( ( rule__Query__Group_5__0 ) ) ;
    public final void rule__Query__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1671:1: ( ( ( rule__Query__Group_5__0 ) ) )
            // InternalRuleDsl.g:1672:1: ( ( rule__Query__Group_5__0 ) )
            {
            // InternalRuleDsl.g:1672:1: ( ( rule__Query__Group_5__0 ) )
            // InternalRuleDsl.g:1673:2: ( rule__Query__Group_5__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup_5()); 
            // InternalRuleDsl.g:1674:2: ( rule__Query__Group_5__0 )
            // InternalRuleDsl.g:1674:3: rule__Query__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__5__Impl"


    // $ANTLR start "rule__Query__Group__6"
    // InternalRuleDsl.g:1682:1: rule__Query__Group__6 : rule__Query__Group__6__Impl ;
    public final void rule__Query__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1686:1: ( rule__Query__Group__6__Impl )
            // InternalRuleDsl.g:1687:2: rule__Query__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6"


    // $ANTLR start "rule__Query__Group__6__Impl"
    // InternalRuleDsl.g:1693:1: rule__Query__Group__6__Impl : ( '}' ) ;
    public final void rule__Query__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1697:1: ( ( '}' ) )
            // InternalRuleDsl.g:1698:1: ( '}' )
            {
            // InternalRuleDsl.g:1698:1: ( '}' )
            // InternalRuleDsl.g:1699:2: '}'
            {
             before(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQueryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group__6__Impl"


    // $ANTLR start "rule__Query__Group_5__0"
    // InternalRuleDsl.g:1709:1: rule__Query__Group_5__0 : rule__Query__Group_5__0__Impl rule__Query__Group_5__1 ;
    public final void rule__Query__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1713:1: ( rule__Query__Group_5__0__Impl rule__Query__Group_5__1 )
            // InternalRuleDsl.g:1714:2: rule__Query__Group_5__0__Impl rule__Query__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Query__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Query__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_5__0"


    // $ANTLR start "rule__Query__Group_5__0__Impl"
    // InternalRuleDsl.g:1721:1: rule__Query__Group_5__0__Impl : ( ( rule__Query__ThenAssignment_5_0 ) ) ;
    public final void rule__Query__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1725:1: ( ( ( rule__Query__ThenAssignment_5_0 ) ) )
            // InternalRuleDsl.g:1726:1: ( ( rule__Query__ThenAssignment_5_0 ) )
            {
            // InternalRuleDsl.g:1726:1: ( ( rule__Query__ThenAssignment_5_0 ) )
            // InternalRuleDsl.g:1727:2: ( rule__Query__ThenAssignment_5_0 )
            {
             before(grammarAccess.getQueryAccess().getThenAssignment_5_0()); 
            // InternalRuleDsl.g:1728:2: ( rule__Query__ThenAssignment_5_0 )
            // InternalRuleDsl.g:1728:3: rule__Query__ThenAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Query__ThenAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryAccess().getThenAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_5__0__Impl"


    // $ANTLR start "rule__Query__Group_5__1"
    // InternalRuleDsl.g:1736:1: rule__Query__Group_5__1 : rule__Query__Group_5__1__Impl ;
    public final void rule__Query__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1740:1: ( rule__Query__Group_5__1__Impl )
            // InternalRuleDsl.g:1741:2: rule__Query__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Query__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_5__1"


    // $ANTLR start "rule__Query__Group_5__1__Impl"
    // InternalRuleDsl.g:1747:1: rule__Query__Group_5__1__Impl : ( ( rule__Query__ThenAssignment_5_1 )* ) ;
    public final void rule__Query__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1751:1: ( ( ( rule__Query__ThenAssignment_5_1 )* ) )
            // InternalRuleDsl.g:1752:1: ( ( rule__Query__ThenAssignment_5_1 )* )
            {
            // InternalRuleDsl.g:1752:1: ( ( rule__Query__ThenAssignment_5_1 )* )
            // InternalRuleDsl.g:1753:2: ( rule__Query__ThenAssignment_5_1 )*
            {
             before(grammarAccess.getQueryAccess().getThenAssignment_5_1()); 
            // InternalRuleDsl.g:1754:2: ( rule__Query__ThenAssignment_5_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRuleDsl.g:1754:3: rule__Query__ThenAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Query__ThenAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getQueryAccess().getThenAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__Group_5__1__Impl"


    // $ANTLR start "rule__AddingSelect__Group__0"
    // InternalRuleDsl.g:1763:1: rule__AddingSelect__Group__0 : rule__AddingSelect__Group__0__Impl rule__AddingSelect__Group__1 ;
    public final void rule__AddingSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1767:1: ( rule__AddingSelect__Group__0__Impl rule__AddingSelect__Group__1 )
            // InternalRuleDsl.g:1768:2: rule__AddingSelect__Group__0__Impl rule__AddingSelect__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRuleDsl.g:1775:1: rule__AddingSelect__Group__0__Impl : ( ( rule__AddingSelect__OperationAssignment_0 ) ) ;
    public final void rule__AddingSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1779:1: ( ( ( rule__AddingSelect__OperationAssignment_0 ) ) )
            // InternalRuleDsl.g:1780:1: ( ( rule__AddingSelect__OperationAssignment_0 ) )
            {
            // InternalRuleDsl.g:1780:1: ( ( rule__AddingSelect__OperationAssignment_0 ) )
            // InternalRuleDsl.g:1781:2: ( rule__AddingSelect__OperationAssignment_0 )
            {
             before(grammarAccess.getAddingSelectAccess().getOperationAssignment_0()); 
            // InternalRuleDsl.g:1782:2: ( rule__AddingSelect__OperationAssignment_0 )
            // InternalRuleDsl.g:1782:3: rule__AddingSelect__OperationAssignment_0
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
    // InternalRuleDsl.g:1790:1: rule__AddingSelect__Group__1 : rule__AddingSelect__Group__1__Impl ;
    public final void rule__AddingSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1794:1: ( rule__AddingSelect__Group__1__Impl )
            // InternalRuleDsl.g:1795:2: rule__AddingSelect__Group__1__Impl
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
    // InternalRuleDsl.g:1801:1: rule__AddingSelect__Group__1__Impl : ( ( rule__AddingSelect__Alternatives_1 ) ) ;
    public final void rule__AddingSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1805:1: ( ( ( rule__AddingSelect__Alternatives_1 ) ) )
            // InternalRuleDsl.g:1806:1: ( ( rule__AddingSelect__Alternatives_1 ) )
            {
            // InternalRuleDsl.g:1806:1: ( ( rule__AddingSelect__Alternatives_1 ) )
            // InternalRuleDsl.g:1807:2: ( rule__AddingSelect__Alternatives_1 )
            {
             before(grammarAccess.getAddingSelectAccess().getAlternatives_1()); 
            // InternalRuleDsl.g:1808:2: ( rule__AddingSelect__Alternatives_1 )
            // InternalRuleDsl.g:1808:3: rule__AddingSelect__Alternatives_1
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


    // $ANTLR start "rule__SetSelect__Group__0"
    // InternalRuleDsl.g:1817:1: rule__SetSelect__Group__0 : rule__SetSelect__Group__0__Impl rule__SetSelect__Group__1 ;
    public final void rule__SetSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1821:1: ( rule__SetSelect__Group__0__Impl rule__SetSelect__Group__1 )
            // InternalRuleDsl.g:1822:2: rule__SetSelect__Group__0__Impl rule__SetSelect__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDsl.g:1829:1: rule__SetSelect__Group__0__Impl : ( 'select' ) ;
    public final void rule__SetSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1833:1: ( ( 'select' ) )
            // InternalRuleDsl.g:1834:1: ( 'select' )
            {
            // InternalRuleDsl.g:1834:1: ( 'select' )
            // InternalRuleDsl.g:1835:2: 'select'
            {
             before(grammarAccess.getSetSelectAccess().getSelectKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getSelectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__0__Impl"


    // $ANTLR start "rule__SetSelect__Group__1"
    // InternalRuleDsl.g:1844:1: rule__SetSelect__Group__1 : rule__SetSelect__Group__1__Impl rule__SetSelect__Group__2 ;
    public final void rule__SetSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1848:1: ( rule__SetSelect__Group__1__Impl rule__SetSelect__Group__2 )
            // InternalRuleDsl.g:1849:2: rule__SetSelect__Group__1__Impl rule__SetSelect__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRuleDsl.g:1856:1: rule__SetSelect__Group__1__Impl : ( ( rule__SetSelect__Group_1__0 ) ) ;
    public final void rule__SetSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1860:1: ( ( ( rule__SetSelect__Group_1__0 ) ) )
            // InternalRuleDsl.g:1861:1: ( ( rule__SetSelect__Group_1__0 ) )
            {
            // InternalRuleDsl.g:1861:1: ( ( rule__SetSelect__Group_1__0 ) )
            // InternalRuleDsl.g:1862:2: ( rule__SetSelect__Group_1__0 )
            {
             before(grammarAccess.getSetSelectAccess().getGroup_1()); 
            // InternalRuleDsl.g:1863:2: ( rule__SetSelect__Group_1__0 )
            // InternalRuleDsl.g:1863:3: rule__SetSelect__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1871:1: rule__SetSelect__Group__2 : rule__SetSelect__Group__2__Impl rule__SetSelect__Group__3 ;
    public final void rule__SetSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1875:1: ( rule__SetSelect__Group__2__Impl rule__SetSelect__Group__3 )
            // InternalRuleDsl.g:1876:2: rule__SetSelect__Group__2__Impl rule__SetSelect__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDsl.g:1883:1: rule__SetSelect__Group__2__Impl : ( 'from' ) ;
    public final void rule__SetSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1887:1: ( ( 'from' ) )
            // InternalRuleDsl.g:1888:1: ( 'from' )
            {
            // InternalRuleDsl.g:1888:1: ( 'from' )
            // InternalRuleDsl.g:1889:2: 'from'
            {
             before(grammarAccess.getSetSelectAccess().getFromKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getFromKeyword_2()); 

            }


            }

        }
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
    // InternalRuleDsl.g:1898:1: rule__SetSelect__Group__3 : rule__SetSelect__Group__3__Impl rule__SetSelect__Group__4 ;
    public final void rule__SetSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1902:1: ( rule__SetSelect__Group__3__Impl rule__SetSelect__Group__4 )
            // InternalRuleDsl.g:1903:2: rule__SetSelect__Group__3__Impl rule__SetSelect__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__SetSelect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group__4();

            state._fsp--;


            }

        }
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
    // InternalRuleDsl.g:1910:1: rule__SetSelect__Group__3__Impl : ( ( rule__SetSelect__Group_3__0 ) ) ;
    public final void rule__SetSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1914:1: ( ( ( rule__SetSelect__Group_3__0 ) ) )
            // InternalRuleDsl.g:1915:1: ( ( rule__SetSelect__Group_3__0 ) )
            {
            // InternalRuleDsl.g:1915:1: ( ( rule__SetSelect__Group_3__0 ) )
            // InternalRuleDsl.g:1916:2: ( rule__SetSelect__Group_3__0 )
            {
             before(grammarAccess.getSetSelectAccess().getGroup_3()); 
            // InternalRuleDsl.g:1917:2: ( rule__SetSelect__Group_3__0 )
            // InternalRuleDsl.g:1917:3: rule__SetSelect__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_3__0();

            state._fsp--;


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


    // $ANTLR start "rule__SetSelect__Group__4"
    // InternalRuleDsl.g:1925:1: rule__SetSelect__Group__4 : rule__SetSelect__Group__4__Impl ;
    public final void rule__SetSelect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1929:1: ( rule__SetSelect__Group__4__Impl )
            // InternalRuleDsl.g:1930:2: rule__SetSelect__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__4"


    // $ANTLR start "rule__SetSelect__Group__4__Impl"
    // InternalRuleDsl.g:1936:1: rule__SetSelect__Group__4__Impl : ( ( rule__SetSelect__Group_4__0 )? ) ;
    public final void rule__SetSelect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1940:1: ( ( ( rule__SetSelect__Group_4__0 )? ) )
            // InternalRuleDsl.g:1941:1: ( ( rule__SetSelect__Group_4__0 )? )
            {
            // InternalRuleDsl.g:1941:1: ( ( rule__SetSelect__Group_4__0 )? )
            // InternalRuleDsl.g:1942:2: ( rule__SetSelect__Group_4__0 )?
            {
             before(grammarAccess.getSetSelectAccess().getGroup_4()); 
            // InternalRuleDsl.g:1943:2: ( rule__SetSelect__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRuleDsl.g:1943:3: rule__SetSelect__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SetSelect__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSetSelectAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group__4__Impl"


    // $ANTLR start "rule__SetSelect__Group_1__0"
    // InternalRuleDsl.g:1952:1: rule__SetSelect__Group_1__0 : rule__SetSelect__Group_1__0__Impl rule__SetSelect__Group_1__1 ;
    public final void rule__SetSelect__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1956:1: ( rule__SetSelect__Group_1__0__Impl rule__SetSelect__Group_1__1 )
            // InternalRuleDsl.g:1957:2: rule__SetSelect__Group_1__0__Impl rule__SetSelect__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__SetSelect__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_1__0"


    // $ANTLR start "rule__SetSelect__Group_1__0__Impl"
    // InternalRuleDsl.g:1964:1: rule__SetSelect__Group_1__0__Impl : ( ( rule__SetSelect__SelectorAssignment_1_0 ) ) ;
    public final void rule__SetSelect__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1968:1: ( ( ( rule__SetSelect__SelectorAssignment_1_0 ) ) )
            // InternalRuleDsl.g:1969:1: ( ( rule__SetSelect__SelectorAssignment_1_0 ) )
            {
            // InternalRuleDsl.g:1969:1: ( ( rule__SetSelect__SelectorAssignment_1_0 ) )
            // InternalRuleDsl.g:1970:2: ( rule__SetSelect__SelectorAssignment_1_0 )
            {
             before(grammarAccess.getSetSelectAccess().getSelectorAssignment_1_0()); 
            // InternalRuleDsl.g:1971:2: ( rule__SetSelect__SelectorAssignment_1_0 )
            // InternalRuleDsl.g:1971:3: rule__SetSelect__SelectorAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__SelectorAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getSelectorAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_1__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_1__1"
    // InternalRuleDsl.g:1979:1: rule__SetSelect__Group_1__1 : rule__SetSelect__Group_1__1__Impl ;
    public final void rule__SetSelect__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1983:1: ( rule__SetSelect__Group_1__1__Impl )
            // InternalRuleDsl.g:1984:2: rule__SetSelect__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_1__1"


    // $ANTLR start "rule__SetSelect__Group_1__1__Impl"
    // InternalRuleDsl.g:1990:1: rule__SetSelect__Group_1__1__Impl : ( ( rule__SetSelect__Group_1_1__0 )* ) ;
    public final void rule__SetSelect__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:1994:1: ( ( ( rule__SetSelect__Group_1_1__0 )* ) )
            // InternalRuleDsl.g:1995:1: ( ( rule__SetSelect__Group_1_1__0 )* )
            {
            // InternalRuleDsl.g:1995:1: ( ( rule__SetSelect__Group_1_1__0 )* )
            // InternalRuleDsl.g:1996:2: ( rule__SetSelect__Group_1_1__0 )*
            {
             before(grammarAccess.getSetSelectAccess().getGroup_1_1()); 
            // InternalRuleDsl.g:1997:2: ( rule__SetSelect__Group_1_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRuleDsl.g:1997:3: rule__SetSelect__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SetSelect__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSetSelectAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_1__1__Impl"


    // $ANTLR start "rule__SetSelect__Group_1_1__0"
    // InternalRuleDsl.g:2006:1: rule__SetSelect__Group_1_1__0 : rule__SetSelect__Group_1_1__0__Impl rule__SetSelect__Group_1_1__1 ;
    public final void rule__SetSelect__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2010:1: ( rule__SetSelect__Group_1_1__0__Impl rule__SetSelect__Group_1_1__1 )
            // InternalRuleDsl.g:2011:2: rule__SetSelect__Group_1_1__0__Impl rule__SetSelect__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SetSelect__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_1_1__0"


    // $ANTLR start "rule__SetSelect__Group_1_1__0__Impl"
    // InternalRuleDsl.g:2018:1: rule__SetSelect__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__SetSelect__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2022:1: ( ( ',' ) )
            // InternalRuleDsl.g:2023:1: ( ',' )
            {
            // InternalRuleDsl.g:2023:1: ( ',' )
            // InternalRuleDsl.g:2024:2: ','
            {
             before(grammarAccess.getSetSelectAccess().getCommaKeyword_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_1_1__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_1_1__1"
    // InternalRuleDsl.g:2033:1: rule__SetSelect__Group_1_1__1 : rule__SetSelect__Group_1_1__1__Impl ;
    public final void rule__SetSelect__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2037:1: ( rule__SetSelect__Group_1_1__1__Impl )
            // InternalRuleDsl.g:2038:2: rule__SetSelect__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_1_1__1"


    // $ANTLR start "rule__SetSelect__Group_1_1__1__Impl"
    // InternalRuleDsl.g:2044:1: rule__SetSelect__Group_1_1__1__Impl : ( ( rule__SetSelect__SelectorAssignment_1_1_1 ) ) ;
    public final void rule__SetSelect__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2048:1: ( ( ( rule__SetSelect__SelectorAssignment_1_1_1 ) ) )
            // InternalRuleDsl.g:2049:1: ( ( rule__SetSelect__SelectorAssignment_1_1_1 ) )
            {
            // InternalRuleDsl.g:2049:1: ( ( rule__SetSelect__SelectorAssignment_1_1_1 ) )
            // InternalRuleDsl.g:2050:2: ( rule__SetSelect__SelectorAssignment_1_1_1 )
            {
             before(grammarAccess.getSetSelectAccess().getSelectorAssignment_1_1_1()); 
            // InternalRuleDsl.g:2051:2: ( rule__SetSelect__SelectorAssignment_1_1_1 )
            // InternalRuleDsl.g:2051:3: rule__SetSelect__SelectorAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__SelectorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getSelectorAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_1_1__1__Impl"


    // $ANTLR start "rule__SetSelect__Group_3__0"
    // InternalRuleDsl.g:2060:1: rule__SetSelect__Group_3__0 : rule__SetSelect__Group_3__0__Impl rule__SetSelect__Group_3__1 ;
    public final void rule__SetSelect__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2064:1: ( rule__SetSelect__Group_3__0__Impl rule__SetSelect__Group_3__1 )
            // InternalRuleDsl.g:2065:2: rule__SetSelect__Group_3__0__Impl rule__SetSelect__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalRuleDsl.g:2072:1: rule__SetSelect__Group_3__0__Impl : ( ( rule__SetSelect__FromAssignment_3_0 ) ) ;
    public final void rule__SetSelect__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2076:1: ( ( ( rule__SetSelect__FromAssignment_3_0 ) ) )
            // InternalRuleDsl.g:2077:1: ( ( rule__SetSelect__FromAssignment_3_0 ) )
            {
            // InternalRuleDsl.g:2077:1: ( ( rule__SetSelect__FromAssignment_3_0 ) )
            // InternalRuleDsl.g:2078:2: ( rule__SetSelect__FromAssignment_3_0 )
            {
             before(grammarAccess.getSetSelectAccess().getFromAssignment_3_0()); 
            // InternalRuleDsl.g:2079:2: ( rule__SetSelect__FromAssignment_3_0 )
            // InternalRuleDsl.g:2079:3: rule__SetSelect__FromAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__FromAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getFromAssignment_3_0()); 

            }


            }

        }
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
    // InternalRuleDsl.g:2087:1: rule__SetSelect__Group_3__1 : rule__SetSelect__Group_3__1__Impl ;
    public final void rule__SetSelect__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2091:1: ( rule__SetSelect__Group_3__1__Impl )
            // InternalRuleDsl.g:2092:2: rule__SetSelect__Group_3__1__Impl
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
    // InternalRuleDsl.g:2098:1: rule__SetSelect__Group_3__1__Impl : ( ( rule__SetSelect__Group_3_1__0 )* ) ;
    public final void rule__SetSelect__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2102:1: ( ( ( rule__SetSelect__Group_3_1__0 )* ) )
            // InternalRuleDsl.g:2103:1: ( ( rule__SetSelect__Group_3_1__0 )* )
            {
            // InternalRuleDsl.g:2103:1: ( ( rule__SetSelect__Group_3_1__0 )* )
            // InternalRuleDsl.g:2104:2: ( rule__SetSelect__Group_3_1__0 )*
            {
             before(grammarAccess.getSetSelectAccess().getGroup_3_1()); 
            // InternalRuleDsl.g:2105:2: ( rule__SetSelect__Group_3_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRuleDsl.g:2105:3: rule__SetSelect__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SetSelect__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSetSelectAccess().getGroup_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__SetSelect__Group_3_1__0"
    // InternalRuleDsl.g:2114:1: rule__SetSelect__Group_3_1__0 : rule__SetSelect__Group_3_1__0__Impl rule__SetSelect__Group_3_1__1 ;
    public final void rule__SetSelect__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2118:1: ( rule__SetSelect__Group_3_1__0__Impl rule__SetSelect__Group_3_1__1 )
            // InternalRuleDsl.g:2119:2: rule__SetSelect__Group_3_1__0__Impl rule__SetSelect__Group_3_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SetSelect__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_3_1__0"


    // $ANTLR start "rule__SetSelect__Group_3_1__0__Impl"
    // InternalRuleDsl.g:2126:1: rule__SetSelect__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__SetSelect__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2130:1: ( ( ',' ) )
            // InternalRuleDsl.g:2131:1: ( ',' )
            {
            // InternalRuleDsl.g:2131:1: ( ',' )
            // InternalRuleDsl.g:2132:2: ','
            {
             before(grammarAccess.getSetSelectAccess().getCommaKeyword_3_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_3_1__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_3_1__1"
    // InternalRuleDsl.g:2141:1: rule__SetSelect__Group_3_1__1 : rule__SetSelect__Group_3_1__1__Impl ;
    public final void rule__SetSelect__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2145:1: ( rule__SetSelect__Group_3_1__1__Impl )
            // InternalRuleDsl.g:2146:2: rule__SetSelect__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_3_1__1"


    // $ANTLR start "rule__SetSelect__Group_3_1__1__Impl"
    // InternalRuleDsl.g:2152:1: rule__SetSelect__Group_3_1__1__Impl : ( ( rule__SetSelect__FromAssignment_3_1_1 ) ) ;
    public final void rule__SetSelect__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2156:1: ( ( ( rule__SetSelect__FromAssignment_3_1_1 ) ) )
            // InternalRuleDsl.g:2157:1: ( ( rule__SetSelect__FromAssignment_3_1_1 ) )
            {
            // InternalRuleDsl.g:2157:1: ( ( rule__SetSelect__FromAssignment_3_1_1 ) )
            // InternalRuleDsl.g:2158:2: ( rule__SetSelect__FromAssignment_3_1_1 )
            {
             before(grammarAccess.getSetSelectAccess().getFromAssignment_3_1_1()); 
            // InternalRuleDsl.g:2159:2: ( rule__SetSelect__FromAssignment_3_1_1 )
            // InternalRuleDsl.g:2159:3: rule__SetSelect__FromAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__FromAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getFromAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_3_1__1__Impl"


    // $ANTLR start "rule__SetSelect__Group_4__0"
    // InternalRuleDsl.g:2168:1: rule__SetSelect__Group_4__0 : rule__SetSelect__Group_4__0__Impl rule__SetSelect__Group_4__1 ;
    public final void rule__SetSelect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2172:1: ( rule__SetSelect__Group_4__0__Impl rule__SetSelect__Group_4__1 )
            // InternalRuleDsl.g:2173:2: rule__SetSelect__Group_4__0__Impl rule__SetSelect__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__SetSelect__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4__0"


    // $ANTLR start "rule__SetSelect__Group_4__0__Impl"
    // InternalRuleDsl.g:2180:1: rule__SetSelect__Group_4__0__Impl : ( 'where' ) ;
    public final void rule__SetSelect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2184:1: ( ( 'where' ) )
            // InternalRuleDsl.g:2185:1: ( 'where' )
            {
            // InternalRuleDsl.g:2185:1: ( 'where' )
            // InternalRuleDsl.g:2186:2: 'where'
            {
             before(grammarAccess.getSetSelectAccess().getWhereKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getWhereKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_4__1"
    // InternalRuleDsl.g:2195:1: rule__SetSelect__Group_4__1 : rule__SetSelect__Group_4__1__Impl ;
    public final void rule__SetSelect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2199:1: ( rule__SetSelect__Group_4__1__Impl )
            // InternalRuleDsl.g:2200:2: rule__SetSelect__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4__1"


    // $ANTLR start "rule__SetSelect__Group_4__1__Impl"
    // InternalRuleDsl.g:2206:1: rule__SetSelect__Group_4__1__Impl : ( ( rule__SetSelect__Group_4_1__0 ) ) ;
    public final void rule__SetSelect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2210:1: ( ( ( rule__SetSelect__Group_4_1__0 ) ) )
            // InternalRuleDsl.g:2211:1: ( ( rule__SetSelect__Group_4_1__0 ) )
            {
            // InternalRuleDsl.g:2211:1: ( ( rule__SetSelect__Group_4_1__0 ) )
            // InternalRuleDsl.g:2212:2: ( rule__SetSelect__Group_4_1__0 )
            {
             before(grammarAccess.getSetSelectAccess().getGroup_4_1()); 
            // InternalRuleDsl.g:2213:2: ( rule__SetSelect__Group_4_1__0 )
            // InternalRuleDsl.g:2213:3: rule__SetSelect__Group_4_1__0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_4_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4__1__Impl"


    // $ANTLR start "rule__SetSelect__Group_4_1__0"
    // InternalRuleDsl.g:2222:1: rule__SetSelect__Group_4_1__0 : rule__SetSelect__Group_4_1__0__Impl rule__SetSelect__Group_4_1__1 ;
    public final void rule__SetSelect__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2226:1: ( rule__SetSelect__Group_4_1__0__Impl rule__SetSelect__Group_4_1__1 )
            // InternalRuleDsl.g:2227:2: rule__SetSelect__Group_4_1__0__Impl rule__SetSelect__Group_4_1__1
            {
            pushFollow(FOLLOW_22);
            rule__SetSelect__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4_1__0"


    // $ANTLR start "rule__SetSelect__Group_4_1__0__Impl"
    // InternalRuleDsl.g:2234:1: rule__SetSelect__Group_4_1__0__Impl : ( ( rule__SetSelect__WhereAssignment_4_1_0 ) ) ;
    public final void rule__SetSelect__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2238:1: ( ( ( rule__SetSelect__WhereAssignment_4_1_0 ) ) )
            // InternalRuleDsl.g:2239:1: ( ( rule__SetSelect__WhereAssignment_4_1_0 ) )
            {
            // InternalRuleDsl.g:2239:1: ( ( rule__SetSelect__WhereAssignment_4_1_0 ) )
            // InternalRuleDsl.g:2240:2: ( rule__SetSelect__WhereAssignment_4_1_0 )
            {
             before(grammarAccess.getSetSelectAccess().getWhereAssignment_4_1_0()); 
            // InternalRuleDsl.g:2241:2: ( rule__SetSelect__WhereAssignment_4_1_0 )
            // InternalRuleDsl.g:2241:3: rule__SetSelect__WhereAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__WhereAssignment_4_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getWhereAssignment_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4_1__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_4_1__1"
    // InternalRuleDsl.g:2249:1: rule__SetSelect__Group_4_1__1 : rule__SetSelect__Group_4_1__1__Impl ;
    public final void rule__SetSelect__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2253:1: ( rule__SetSelect__Group_4_1__1__Impl )
            // InternalRuleDsl.g:2254:2: rule__SetSelect__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4_1__1"


    // $ANTLR start "rule__SetSelect__Group_4_1__1__Impl"
    // InternalRuleDsl.g:2260:1: rule__SetSelect__Group_4_1__1__Impl : ( ( rule__SetSelect__Group_4_1_1__0 )* ) ;
    public final void rule__SetSelect__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2264:1: ( ( ( rule__SetSelect__Group_4_1_1__0 )* ) )
            // InternalRuleDsl.g:2265:1: ( ( rule__SetSelect__Group_4_1_1__0 )* )
            {
            // InternalRuleDsl.g:2265:1: ( ( rule__SetSelect__Group_4_1_1__0 )* )
            // InternalRuleDsl.g:2266:2: ( rule__SetSelect__Group_4_1_1__0 )*
            {
             before(grammarAccess.getSetSelectAccess().getGroup_4_1_1()); 
            // InternalRuleDsl.g:2267:2: ( rule__SetSelect__Group_4_1_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRuleDsl.g:2267:3: rule__SetSelect__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__SetSelect__Group_4_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSetSelectAccess().getGroup_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4_1__1__Impl"


    // $ANTLR start "rule__SetSelect__Group_4_1_1__0"
    // InternalRuleDsl.g:2276:1: rule__SetSelect__Group_4_1_1__0 : rule__SetSelect__Group_4_1_1__0__Impl rule__SetSelect__Group_4_1_1__1 ;
    public final void rule__SetSelect__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2280:1: ( rule__SetSelect__Group_4_1_1__0__Impl rule__SetSelect__Group_4_1_1__1 )
            // InternalRuleDsl.g:2281:2: rule__SetSelect__Group_4_1_1__0__Impl rule__SetSelect__Group_4_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SetSelect__Group_4_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_4_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4_1_1__0"


    // $ANTLR start "rule__SetSelect__Group_4_1_1__0__Impl"
    // InternalRuleDsl.g:2288:1: rule__SetSelect__Group_4_1_1__0__Impl : ( 'AND' ) ;
    public final void rule__SetSelect__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2292:1: ( ( 'AND' ) )
            // InternalRuleDsl.g:2293:1: ( 'AND' )
            {
            // InternalRuleDsl.g:2293:1: ( 'AND' )
            // InternalRuleDsl.g:2294:2: 'AND'
            {
             before(grammarAccess.getSetSelectAccess().getANDKeyword_4_1_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getANDKeyword_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_4_1_1__1"
    // InternalRuleDsl.g:2303:1: rule__SetSelect__Group_4_1_1__1 : rule__SetSelect__Group_4_1_1__1__Impl ;
    public final void rule__SetSelect__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2307:1: ( rule__SetSelect__Group_4_1_1__1__Impl )
            // InternalRuleDsl.g:2308:2: rule__SetSelect__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_4_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4_1_1__1"


    // $ANTLR start "rule__SetSelect__Group_4_1_1__1__Impl"
    // InternalRuleDsl.g:2314:1: rule__SetSelect__Group_4_1_1__1__Impl : ( ( rule__SetSelect__WhereAssignment_4_1_1_1 ) ) ;
    public final void rule__SetSelect__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2318:1: ( ( ( rule__SetSelect__WhereAssignment_4_1_1_1 ) ) )
            // InternalRuleDsl.g:2319:1: ( ( rule__SetSelect__WhereAssignment_4_1_1_1 ) )
            {
            // InternalRuleDsl.g:2319:1: ( ( rule__SetSelect__WhereAssignment_4_1_1_1 ) )
            // InternalRuleDsl.g:2320:2: ( rule__SetSelect__WhereAssignment_4_1_1_1 )
            {
             before(grammarAccess.getSetSelectAccess().getWhereAssignment_4_1_1_1()); 
            // InternalRuleDsl.g:2321:2: ( rule__SetSelect__WhereAssignment_4_1_1_1 )
            // InternalRuleDsl.g:2321:3: rule__SetSelect__WhereAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__WhereAssignment_4_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getWhereAssignment_4_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__Where__Group__0"
    // InternalRuleDsl.g:2330:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2334:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalRuleDsl.g:2335:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRuleDsl.g:2342:1: rule__Where__Group__0__Impl : ( ( rule__Where__LeftAssignment_0 ) ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2346:1: ( ( ( rule__Where__LeftAssignment_0 ) ) )
            // InternalRuleDsl.g:2347:1: ( ( rule__Where__LeftAssignment_0 ) )
            {
            // InternalRuleDsl.g:2347:1: ( ( rule__Where__LeftAssignment_0 ) )
            // InternalRuleDsl.g:2348:2: ( rule__Where__LeftAssignment_0 )
            {
             before(grammarAccess.getWhereAccess().getLeftAssignment_0()); 
            // InternalRuleDsl.g:2349:2: ( rule__Where__LeftAssignment_0 )
            // InternalRuleDsl.g:2349:3: rule__Where__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Where__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getLeftAssignment_0()); 

            }


            }

        }
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
    // InternalRuleDsl.g:2357:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2361:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalRuleDsl.g:2362:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRuleDsl.g:2369:1: rule__Where__Group__1__Impl : ( ( rule__Where__LogicalOperatorAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2373:1: ( ( ( rule__Where__LogicalOperatorAssignment_1 ) ) )
            // InternalRuleDsl.g:2374:1: ( ( rule__Where__LogicalOperatorAssignment_1 ) )
            {
            // InternalRuleDsl.g:2374:1: ( ( rule__Where__LogicalOperatorAssignment_1 ) )
            // InternalRuleDsl.g:2375:2: ( rule__Where__LogicalOperatorAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getLogicalOperatorAssignment_1()); 
            // InternalRuleDsl.g:2376:2: ( rule__Where__LogicalOperatorAssignment_1 )
            // InternalRuleDsl.g:2376:3: rule__Where__LogicalOperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Where__LogicalOperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getLogicalOperatorAssignment_1()); 

            }


            }

        }
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
    // InternalRuleDsl.g:2384:1: rule__Where__Group__2 : rule__Where__Group__2__Impl ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2388:1: ( rule__Where__Group__2__Impl )
            // InternalRuleDsl.g:2389:2: rule__Where__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalRuleDsl.g:2395:1: rule__Where__Group__2__Impl : ( ( rule__Where__Alternatives_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2399:1: ( ( ( rule__Where__Alternatives_2 ) ) )
            // InternalRuleDsl.g:2400:1: ( ( rule__Where__Alternatives_2 ) )
            {
            // InternalRuleDsl.g:2400:1: ( ( rule__Where__Alternatives_2 ) )
            // InternalRuleDsl.g:2401:2: ( rule__Where__Alternatives_2 )
            {
             before(grammarAccess.getWhereAccess().getAlternatives_2()); 
            // InternalRuleDsl.g:2402:2: ( rule__Where__Alternatives_2 )
            // InternalRuleDsl.g:2402:3: rule__Where__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Where__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getAlternatives_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Where__Group_2_1__0"
    // InternalRuleDsl.g:2411:1: rule__Where__Group_2_1__0 : rule__Where__Group_2_1__0__Impl rule__Where__Group_2_1__1 ;
    public final void rule__Where__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2415:1: ( rule__Where__Group_2_1__0__Impl rule__Where__Group_2_1__1 )
            // InternalRuleDsl.g:2416:2: rule__Where__Group_2_1__0__Impl rule__Where__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Where__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2_1__0"


    // $ANTLR start "rule__Where__Group_2_1__0__Impl"
    // InternalRuleDsl.g:2423:1: rule__Where__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__Where__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2427:1: ( ( '{' ) )
            // InternalRuleDsl.g:2428:1: ( '{' )
            {
            // InternalRuleDsl.g:2428:1: ( '{' )
            // InternalRuleDsl.g:2429:2: '{'
            {
             before(grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getLeftCurlyBracketKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2_1__0__Impl"


    // $ANTLR start "rule__Where__Group_2_1__1"
    // InternalRuleDsl.g:2438:1: rule__Where__Group_2_1__1 : rule__Where__Group_2_1__1__Impl rule__Where__Group_2_1__2 ;
    public final void rule__Where__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2442:1: ( rule__Where__Group_2_1__1__Impl rule__Where__Group_2_1__2 )
            // InternalRuleDsl.g:2443:2: rule__Where__Group_2_1__1__Impl rule__Where__Group_2_1__2
            {
            pushFollow(FOLLOW_13);
            rule__Where__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Where__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2_1__1"


    // $ANTLR start "rule__Where__Group_2_1__1__Impl"
    // InternalRuleDsl.g:2450:1: rule__Where__Group_2_1__1__Impl : ( ( rule__Where__RightStreamingAssignment_2_1_1 ) ) ;
    public final void rule__Where__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2454:1: ( ( ( rule__Where__RightStreamingAssignment_2_1_1 ) ) )
            // InternalRuleDsl.g:2455:1: ( ( rule__Where__RightStreamingAssignment_2_1_1 ) )
            {
            // InternalRuleDsl.g:2455:1: ( ( rule__Where__RightStreamingAssignment_2_1_1 ) )
            // InternalRuleDsl.g:2456:2: ( rule__Where__RightStreamingAssignment_2_1_1 )
            {
             before(grammarAccess.getWhereAccess().getRightStreamingAssignment_2_1_1()); 
            // InternalRuleDsl.g:2457:2: ( rule__Where__RightStreamingAssignment_2_1_1 )
            // InternalRuleDsl.g:2457:3: rule__Where__RightStreamingAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Where__RightStreamingAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereAccess().getRightStreamingAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2_1__1__Impl"


    // $ANTLR start "rule__Where__Group_2_1__2"
    // InternalRuleDsl.g:2465:1: rule__Where__Group_2_1__2 : rule__Where__Group_2_1__2__Impl ;
    public final void rule__Where__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2469:1: ( rule__Where__Group_2_1__2__Impl )
            // InternalRuleDsl.g:2470:2: rule__Where__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Where__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2_1__2"


    // $ANTLR start "rule__Where__Group_2_1__2__Impl"
    // InternalRuleDsl.g:2476:1: rule__Where__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__Where__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2480:1: ( ( '}' ) )
            // InternalRuleDsl.g:2481:1: ( '}' )
            {
            // InternalRuleDsl.g:2481:1: ( '}' )
            // InternalRuleDsl.g:2482:2: '}'
            {
             before(grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getRightCurlyBracketKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__Group_2_1__2__Impl"


    // $ANTLR start "rule__ComplexExpression__Group__0"
    // InternalRuleDsl.g:2492:1: rule__ComplexExpression__Group__0 : rule__ComplexExpression__Group__0__Impl rule__ComplexExpression__Group__1 ;
    public final void rule__ComplexExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2496:1: ( rule__ComplexExpression__Group__0__Impl rule__ComplexExpression__Group__1 )
            // InternalRuleDsl.g:2497:2: rule__ComplexExpression__Group__0__Impl rule__ComplexExpression__Group__1
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
    // InternalRuleDsl.g:2504:1: rule__ComplexExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ComplexExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2508:1: ( ( '(' ) )
            // InternalRuleDsl.g:2509:1: ( '(' )
            {
            // InternalRuleDsl.g:2509:1: ( '(' )
            // InternalRuleDsl.g:2510:2: '('
            {
             before(grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRuleDsl.g:2519:1: rule__ComplexExpression__Group__1 : rule__ComplexExpression__Group__1__Impl rule__ComplexExpression__Group__2 ;
    public final void rule__ComplexExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2523:1: ( rule__ComplexExpression__Group__1__Impl rule__ComplexExpression__Group__2 )
            // InternalRuleDsl.g:2524:2: rule__ComplexExpression__Group__1__Impl rule__ComplexExpression__Group__2
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
    // InternalRuleDsl.g:2531:1: rule__ComplexExpression__Group__1__Impl : ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) ) ;
    public final void rule__ComplexExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2535:1: ( ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) ) )
            // InternalRuleDsl.g:2536:1: ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) )
            {
            // InternalRuleDsl.g:2536:1: ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) )
            // InternalRuleDsl.g:2537:2: ( rule__ComplexExpression__PlainOperandAssignment_1 )
            {
             before(grammarAccess.getComplexExpressionAccess().getPlainOperandAssignment_1()); 
            // InternalRuleDsl.g:2538:2: ( rule__ComplexExpression__PlainOperandAssignment_1 )
            // InternalRuleDsl.g:2538:3: rule__ComplexExpression__PlainOperandAssignment_1
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
    // InternalRuleDsl.g:2546:1: rule__ComplexExpression__Group__2 : rule__ComplexExpression__Group__2__Impl rule__ComplexExpression__Group__3 ;
    public final void rule__ComplexExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2550:1: ( rule__ComplexExpression__Group__2__Impl rule__ComplexExpression__Group__3 )
            // InternalRuleDsl.g:2551:2: rule__ComplexExpression__Group__2__Impl rule__ComplexExpression__Group__3
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
    // InternalRuleDsl.g:2558:1: rule__ComplexExpression__Group__2__Impl : ( ( rule__ComplexExpression__Group_2__0 )? ) ;
    public final void rule__ComplexExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2562:1: ( ( ( rule__ComplexExpression__Group_2__0 )? ) )
            // InternalRuleDsl.g:2563:1: ( ( rule__ComplexExpression__Group_2__0 )? )
            {
            // InternalRuleDsl.g:2563:1: ( ( rule__ComplexExpression__Group_2__0 )? )
            // InternalRuleDsl.g:2564:2: ( rule__ComplexExpression__Group_2__0 )?
            {
             before(grammarAccess.getComplexExpressionAccess().getGroup_2()); 
            // InternalRuleDsl.g:2565:2: ( rule__ComplexExpression__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_OPERATOR) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRuleDsl.g:2565:3: rule__ComplexExpression__Group_2__0
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
    // InternalRuleDsl.g:2573:1: rule__ComplexExpression__Group__3 : rule__ComplexExpression__Group__3__Impl ;
    public final void rule__ComplexExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2577:1: ( rule__ComplexExpression__Group__3__Impl )
            // InternalRuleDsl.g:2578:2: rule__ComplexExpression__Group__3__Impl
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
    // InternalRuleDsl.g:2584:1: rule__ComplexExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__ComplexExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2588:1: ( ( ')' ) )
            // InternalRuleDsl.g:2589:1: ( ')' )
            {
            // InternalRuleDsl.g:2589:1: ( ')' )
            // InternalRuleDsl.g:2590:2: ')'
            {
             before(grammarAccess.getComplexExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRuleDsl.g:2600:1: rule__ComplexExpression__Group_2__0 : rule__ComplexExpression__Group_2__0__Impl rule__ComplexExpression__Group_2__1 ;
    public final void rule__ComplexExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2604:1: ( rule__ComplexExpression__Group_2__0__Impl rule__ComplexExpression__Group_2__1 )
            // InternalRuleDsl.g:2605:2: rule__ComplexExpression__Group_2__0__Impl rule__ComplexExpression__Group_2__1
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
    // InternalRuleDsl.g:2612:1: rule__ComplexExpression__Group_2__0__Impl : ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) ) ;
    public final void rule__ComplexExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2616:1: ( ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) ) )
            // InternalRuleDsl.g:2617:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) )
            {
            // InternalRuleDsl.g:2617:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) )
            // InternalRuleDsl.g:2618:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getComplexOperandsAssignment_2_0()); 
            // InternalRuleDsl.g:2619:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 )
            // InternalRuleDsl.g:2619:3: rule__ComplexExpression__ComplexOperandsAssignment_2_0
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
    // InternalRuleDsl.g:2627:1: rule__ComplexExpression__Group_2__1 : rule__ComplexExpression__Group_2__1__Impl ;
    public final void rule__ComplexExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2631:1: ( rule__ComplexExpression__Group_2__1__Impl )
            // InternalRuleDsl.g:2632:2: rule__ComplexExpression__Group_2__1__Impl
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
    // InternalRuleDsl.g:2638:1: rule__ComplexExpression__Group_2__1__Impl : ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* ) ;
    public final void rule__ComplexExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2642:1: ( ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* ) )
            // InternalRuleDsl.g:2643:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* )
            {
            // InternalRuleDsl.g:2643:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* )
            // InternalRuleDsl.g:2644:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )*
            {
             before(grammarAccess.getComplexExpressionAccess().getComplexOperandsAssignment_2_1()); 
            // InternalRuleDsl.g:2645:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_OPERATOR) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRuleDsl.g:2645:3: rule__ComplexExpression__ComplexOperandsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__ComplexExpression__ComplexOperandsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalRuleDsl.g:2654:1: rule__ComplexOperand__Group__0 : rule__ComplexOperand__Group__0__Impl rule__ComplexOperand__Group__1 ;
    public final void rule__ComplexOperand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2658:1: ( rule__ComplexOperand__Group__0__Impl rule__ComplexOperand__Group__1 )
            // InternalRuleDsl.g:2659:2: rule__ComplexOperand__Group__0__Impl rule__ComplexOperand__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalRuleDsl.g:2666:1: rule__ComplexOperand__Group__0__Impl : ( ( rule__ComplexOperand__OperatorAssignment_0 ) ) ;
    public final void rule__ComplexOperand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2670:1: ( ( ( rule__ComplexOperand__OperatorAssignment_0 ) ) )
            // InternalRuleDsl.g:2671:1: ( ( rule__ComplexOperand__OperatorAssignment_0 ) )
            {
            // InternalRuleDsl.g:2671:1: ( ( rule__ComplexOperand__OperatorAssignment_0 ) )
            // InternalRuleDsl.g:2672:2: ( rule__ComplexOperand__OperatorAssignment_0 )
            {
             before(grammarAccess.getComplexOperandAccess().getOperatorAssignment_0()); 
            // InternalRuleDsl.g:2673:2: ( rule__ComplexOperand__OperatorAssignment_0 )
            // InternalRuleDsl.g:2673:3: rule__ComplexOperand__OperatorAssignment_0
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
    // InternalRuleDsl.g:2681:1: rule__ComplexOperand__Group__1 : rule__ComplexOperand__Group__1__Impl ;
    public final void rule__ComplexOperand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2685:1: ( rule__ComplexOperand__Group__1__Impl )
            // InternalRuleDsl.g:2686:2: rule__ComplexOperand__Group__1__Impl
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
    // InternalRuleDsl.g:2692:1: rule__ComplexOperand__Group__1__Impl : ( ( rule__ComplexOperand__ExpressionAssignment_1 ) ) ;
    public final void rule__ComplexOperand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2696:1: ( ( ( rule__ComplexOperand__ExpressionAssignment_1 ) ) )
            // InternalRuleDsl.g:2697:1: ( ( rule__ComplexOperand__ExpressionAssignment_1 ) )
            {
            // InternalRuleDsl.g:2697:1: ( ( rule__ComplexOperand__ExpressionAssignment_1 ) )
            // InternalRuleDsl.g:2698:2: ( rule__ComplexOperand__ExpressionAssignment_1 )
            {
             before(grammarAccess.getComplexOperandAccess().getExpressionAssignment_1()); 
            // InternalRuleDsl.g:2699:2: ( rule__ComplexOperand__ExpressionAssignment_1 )
            // InternalRuleDsl.g:2699:3: rule__ComplexOperand__ExpressionAssignment_1
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


    // $ANTLR start "rule__Message__Group__0"
    // InternalRuleDsl.g:2708:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2712:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalRuleDsl.g:2713:2: rule__Message__Group__0__Impl rule__Message__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Message__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0"


    // $ANTLR start "rule__Message__Group__0__Impl"
    // InternalRuleDsl.g:2720:1: rule__Message__Group__0__Impl : ( ( rule__Message__NameAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2724:1: ( ( ( rule__Message__NameAssignment_0 ) ) )
            // InternalRuleDsl.g:2725:1: ( ( rule__Message__NameAssignment_0 ) )
            {
            // InternalRuleDsl.g:2725:1: ( ( rule__Message__NameAssignment_0 ) )
            // InternalRuleDsl.g:2726:2: ( rule__Message__NameAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            // InternalRuleDsl.g:2727:2: ( rule__Message__NameAssignment_0 )
            // InternalRuleDsl.g:2727:3: rule__Message__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Message__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__0__Impl"


    // $ANTLR start "rule__Message__Group__1"
    // InternalRuleDsl.g:2735:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2739:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalRuleDsl.g:2740:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__Message__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1"


    // $ANTLR start "rule__Message__Group__1__Impl"
    // InternalRuleDsl.g:2747:1: rule__Message__Group__1__Impl : ( ':' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2751:1: ( ( ':' ) )
            // InternalRuleDsl.g:2752:1: ( ':' )
            {
            // InternalRuleDsl.g:2752:1: ( ':' )
            // InternalRuleDsl.g:2753:2: ':'
            {
             before(grammarAccess.getMessageAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__1__Impl"


    // $ANTLR start "rule__Message__Group__2"
    // InternalRuleDsl.g:2762:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2766:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalRuleDsl.g:2767:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__Message__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2"


    // $ANTLR start "rule__Message__Group__2__Impl"
    // InternalRuleDsl.g:2774:1: rule__Message__Group__2__Impl : ( 'compose' ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2778:1: ( ( 'compose' ) )
            // InternalRuleDsl.g:2779:1: ( 'compose' )
            {
            // InternalRuleDsl.g:2779:1: ( 'compose' )
            // InternalRuleDsl.g:2780:2: 'compose'
            {
             before(grammarAccess.getMessageAccess().getComposeKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getComposeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__2__Impl"


    // $ANTLR start "rule__Message__Group__3"
    // InternalRuleDsl.g:2789:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2793:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalRuleDsl.g:2794:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Message__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3"


    // $ANTLR start "rule__Message__Group__3__Impl"
    // InternalRuleDsl.g:2801:1: rule__Message__Group__3__Impl : ( ( rule__Message__Group_3__0 ) ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2805:1: ( ( ( rule__Message__Group_3__0 ) ) )
            // InternalRuleDsl.g:2806:1: ( ( rule__Message__Group_3__0 ) )
            {
            // InternalRuleDsl.g:2806:1: ( ( rule__Message__Group_3__0 ) )
            // InternalRuleDsl.g:2807:2: ( rule__Message__Group_3__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup_3()); 
            // InternalRuleDsl.g:2808:2: ( rule__Message__Group_3__0 )
            // InternalRuleDsl.g:2808:3: rule__Message__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__3__Impl"


    // $ANTLR start "rule__Message__Group__4"
    // InternalRuleDsl.g:2816:1: rule__Message__Group__4 : rule__Message__Group__4__Impl ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2820:1: ( rule__Message__Group__4__Impl )
            // InternalRuleDsl.g:2821:2: rule__Message__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4"


    // $ANTLR start "rule__Message__Group__4__Impl"
    // InternalRuleDsl.g:2827:1: rule__Message__Group__4__Impl : ( ( rule__Message__Group_4__0 )? ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2831:1: ( ( ( rule__Message__Group_4__0 )? ) )
            // InternalRuleDsl.g:2832:1: ( ( rule__Message__Group_4__0 )? )
            {
            // InternalRuleDsl.g:2832:1: ( ( rule__Message__Group_4__0 )? )
            // InternalRuleDsl.g:2833:2: ( rule__Message__Group_4__0 )?
            {
             before(grammarAccess.getMessageAccess().getGroup_4()); 
            // InternalRuleDsl.g:2834:2: ( rule__Message__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRuleDsl.g:2834:3: rule__Message__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Message__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMessageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__4__Impl"


    // $ANTLR start "rule__Message__Group_3__0"
    // InternalRuleDsl.g:2843:1: rule__Message__Group_3__0 : rule__Message__Group_3__0__Impl rule__Message__Group_3__1 ;
    public final void rule__Message__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2847:1: ( rule__Message__Group_3__0__Impl rule__Message__Group_3__1 )
            // InternalRuleDsl.g:2848:2: rule__Message__Group_3__0__Impl rule__Message__Group_3__1
            {
            pushFollow(FOLLOW_34);
            rule__Message__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_3__0"


    // $ANTLR start "rule__Message__Group_3__0__Impl"
    // InternalRuleDsl.g:2855:1: rule__Message__Group_3__0__Impl : ( ( rule__Message__MessageAssignment_3_0 ) ) ;
    public final void rule__Message__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2859:1: ( ( ( rule__Message__MessageAssignment_3_0 ) ) )
            // InternalRuleDsl.g:2860:1: ( ( rule__Message__MessageAssignment_3_0 ) )
            {
            // InternalRuleDsl.g:2860:1: ( ( rule__Message__MessageAssignment_3_0 ) )
            // InternalRuleDsl.g:2861:2: ( rule__Message__MessageAssignment_3_0 )
            {
             before(grammarAccess.getMessageAccess().getMessageAssignment_3_0()); 
            // InternalRuleDsl.g:2862:2: ( rule__Message__MessageAssignment_3_0 )
            // InternalRuleDsl.g:2862:3: rule__Message__MessageAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Message__MessageAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getMessageAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_3__0__Impl"


    // $ANTLR start "rule__Message__Group_3__1"
    // InternalRuleDsl.g:2870:1: rule__Message__Group_3__1 : rule__Message__Group_3__1__Impl ;
    public final void rule__Message__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2874:1: ( rule__Message__Group_3__1__Impl )
            // InternalRuleDsl.g:2875:2: rule__Message__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_3__1"


    // $ANTLR start "rule__Message__Group_3__1__Impl"
    // InternalRuleDsl.g:2881:1: rule__Message__Group_3__1__Impl : ( ( rule__Message__Group_3_1__0 )* ) ;
    public final void rule__Message__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2885:1: ( ( ( rule__Message__Group_3_1__0 )* ) )
            // InternalRuleDsl.g:2886:1: ( ( rule__Message__Group_3_1__0 )* )
            {
            // InternalRuleDsl.g:2886:1: ( ( rule__Message__Group_3_1__0 )* )
            // InternalRuleDsl.g:2887:2: ( rule__Message__Group_3_1__0 )*
            {
             before(grammarAccess.getMessageAccess().getGroup_3_1()); 
            // InternalRuleDsl.g:2888:2: ( rule__Message__Group_3_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRuleDsl.g:2888:3: rule__Message__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__Message__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMessageAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_3__1__Impl"


    // $ANTLR start "rule__Message__Group_3_1__0"
    // InternalRuleDsl.g:2897:1: rule__Message__Group_3_1__0 : rule__Message__Group_3_1__0__Impl rule__Message__Group_3_1__1 ;
    public final void rule__Message__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2901:1: ( rule__Message__Group_3_1__0__Impl rule__Message__Group_3_1__1 )
            // InternalRuleDsl.g:2902:2: rule__Message__Group_3_1__0__Impl rule__Message__Group_3_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Message__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_3_1__0"


    // $ANTLR start "rule__Message__Group_3_1__0__Impl"
    // InternalRuleDsl.g:2909:1: rule__Message__Group_3_1__0__Impl : ( '+' ) ;
    public final void rule__Message__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2913:1: ( ( '+' ) )
            // InternalRuleDsl.g:2914:1: ( '+' )
            {
            // InternalRuleDsl.g:2914:1: ( '+' )
            // InternalRuleDsl.g:2915:2: '+'
            {
             before(grammarAccess.getMessageAccess().getPlusSignKeyword_3_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getPlusSignKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_3_1__0__Impl"


    // $ANTLR start "rule__Message__Group_3_1__1"
    // InternalRuleDsl.g:2924:1: rule__Message__Group_3_1__1 : rule__Message__Group_3_1__1__Impl ;
    public final void rule__Message__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2928:1: ( rule__Message__Group_3_1__1__Impl )
            // InternalRuleDsl.g:2929:2: rule__Message__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_3_1__1"


    // $ANTLR start "rule__Message__Group_3_1__1__Impl"
    // InternalRuleDsl.g:2935:1: rule__Message__Group_3_1__1__Impl : ( ( rule__Message__MessageAssignment_3_1_1 ) ) ;
    public final void rule__Message__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2939:1: ( ( ( rule__Message__MessageAssignment_3_1_1 ) ) )
            // InternalRuleDsl.g:2940:1: ( ( rule__Message__MessageAssignment_3_1_1 ) )
            {
            // InternalRuleDsl.g:2940:1: ( ( rule__Message__MessageAssignment_3_1_1 ) )
            // InternalRuleDsl.g:2941:2: ( rule__Message__MessageAssignment_3_1_1 )
            {
             before(grammarAccess.getMessageAccess().getMessageAssignment_3_1_1()); 
            // InternalRuleDsl.g:2942:2: ( rule__Message__MessageAssignment_3_1_1 )
            // InternalRuleDsl.g:2942:3: rule__Message__MessageAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__MessageAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getMessageAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_3_1__1__Impl"


    // $ANTLR start "rule__Message__Group_4__0"
    // InternalRuleDsl.g:2951:1: rule__Message__Group_4__0 : rule__Message__Group_4__0__Impl rule__Message__Group_4__1 ;
    public final void rule__Message__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2955:1: ( rule__Message__Group_4__0__Impl rule__Message__Group_4__1 )
            // InternalRuleDsl.g:2956:2: rule__Message__Group_4__0__Impl rule__Message__Group_4__1
            {
            pushFollow(FOLLOW_36);
            rule__Message__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_4__0"


    // $ANTLR start "rule__Message__Group_4__0__Impl"
    // InternalRuleDsl.g:2963:1: rule__Message__Group_4__0__Impl : ( 'to' ) ;
    public final void rule__Message__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2967:1: ( ( 'to' ) )
            // InternalRuleDsl.g:2968:1: ( 'to' )
            {
            // InternalRuleDsl.g:2968:1: ( 'to' )
            // InternalRuleDsl.g:2969:2: 'to'
            {
             before(grammarAccess.getMessageAccess().getToKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getToKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_4__0__Impl"


    // $ANTLR start "rule__Message__Group_4__1"
    // InternalRuleDsl.g:2978:1: rule__Message__Group_4__1 : rule__Message__Group_4__1__Impl ;
    public final void rule__Message__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2982:1: ( rule__Message__Group_4__1__Impl )
            // InternalRuleDsl.g:2983:2: rule__Message__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_4__1"


    // $ANTLR start "rule__Message__Group_4__1__Impl"
    // InternalRuleDsl.g:2989:1: rule__Message__Group_4__1__Impl : ( ( rule__Message__RecipientAssignment_4_1 ) ) ;
    public final void rule__Message__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:2993:1: ( ( ( rule__Message__RecipientAssignment_4_1 ) ) )
            // InternalRuleDsl.g:2994:1: ( ( rule__Message__RecipientAssignment_4_1 ) )
            {
            // InternalRuleDsl.g:2994:1: ( ( rule__Message__RecipientAssignment_4_1 ) )
            // InternalRuleDsl.g:2995:2: ( rule__Message__RecipientAssignment_4_1 )
            {
             before(grammarAccess.getMessageAccess().getRecipientAssignment_4_1()); 
            // InternalRuleDsl.g:2996:2: ( rule__Message__RecipientAssignment_4_1 )
            // InternalRuleDsl.g:2996:3: rule__Message__RecipientAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Message__RecipientAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getRecipientAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group_4__1__Impl"


    // $ANTLR start "rule__SelectMessageString__Group__0"
    // InternalRuleDsl.g:3005:1: rule__SelectMessageString__Group__0 : rule__SelectMessageString__Group__0__Impl rule__SelectMessageString__Group__1 ;
    public final void rule__SelectMessageString__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3009:1: ( rule__SelectMessageString__Group__0__Impl rule__SelectMessageString__Group__1 )
            // InternalRuleDsl.g:3010:2: rule__SelectMessageString__Group__0__Impl rule__SelectMessageString__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SelectMessageString__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMessageString__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group__0"


    // $ANTLR start "rule__SelectMessageString__Group__0__Impl"
    // InternalRuleDsl.g:3017:1: rule__SelectMessageString__Group__0__Impl : ( '{' ) ;
    public final void rule__SelectMessageString__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3021:1: ( ( '{' ) )
            // InternalRuleDsl.g:3022:1: ( '{' )
            {
            // InternalRuleDsl.g:3022:1: ( '{' )
            // InternalRuleDsl.g:3023:2: '{'
            {
             before(grammarAccess.getSelectMessageStringAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSelectMessageStringAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group__0__Impl"


    // $ANTLR start "rule__SelectMessageString__Group__1"
    // InternalRuleDsl.g:3032:1: rule__SelectMessageString__Group__1 : rule__SelectMessageString__Group__1__Impl rule__SelectMessageString__Group__2 ;
    public final void rule__SelectMessageString__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3036:1: ( rule__SelectMessageString__Group__1__Impl rule__SelectMessageString__Group__2 )
            // InternalRuleDsl.g:3037:2: rule__SelectMessageString__Group__1__Impl rule__SelectMessageString__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SelectMessageString__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMessageString__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group__1"


    // $ANTLR start "rule__SelectMessageString__Group__1__Impl"
    // InternalRuleDsl.g:3044:1: rule__SelectMessageString__Group__1__Impl : ( ( rule__SelectMessageString__Group_1__0 ) ) ;
    public final void rule__SelectMessageString__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3048:1: ( ( ( rule__SelectMessageString__Group_1__0 ) ) )
            // InternalRuleDsl.g:3049:1: ( ( rule__SelectMessageString__Group_1__0 ) )
            {
            // InternalRuleDsl.g:3049:1: ( ( rule__SelectMessageString__Group_1__0 ) )
            // InternalRuleDsl.g:3050:2: ( rule__SelectMessageString__Group_1__0 )
            {
             before(grammarAccess.getSelectMessageStringAccess().getGroup_1()); 
            // InternalRuleDsl.g:3051:2: ( rule__SelectMessageString__Group_1__0 )
            // InternalRuleDsl.g:3051:3: rule__SelectMessageString__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectMessageString__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectMessageStringAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group__1__Impl"


    // $ANTLR start "rule__SelectMessageString__Group__2"
    // InternalRuleDsl.g:3059:1: rule__SelectMessageString__Group__2 : rule__SelectMessageString__Group__2__Impl ;
    public final void rule__SelectMessageString__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3063:1: ( rule__SelectMessageString__Group__2__Impl )
            // InternalRuleDsl.g:3064:2: rule__SelectMessageString__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectMessageString__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group__2"


    // $ANTLR start "rule__SelectMessageString__Group__2__Impl"
    // InternalRuleDsl.g:3070:1: rule__SelectMessageString__Group__2__Impl : ( '}' ) ;
    public final void rule__SelectMessageString__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3074:1: ( ( '}' ) )
            // InternalRuleDsl.g:3075:1: ( '}' )
            {
            // InternalRuleDsl.g:3075:1: ( '}' )
            // InternalRuleDsl.g:3076:2: '}'
            {
             before(grammarAccess.getSelectMessageStringAccess().getRightCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSelectMessageStringAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group__2__Impl"


    // $ANTLR start "rule__SelectMessageString__Group_1__0"
    // InternalRuleDsl.g:3086:1: rule__SelectMessageString__Group_1__0 : rule__SelectMessageString__Group_1__0__Impl rule__SelectMessageString__Group_1__1 ;
    public final void rule__SelectMessageString__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3090:1: ( rule__SelectMessageString__Group_1__0__Impl rule__SelectMessageString__Group_1__1 )
            // InternalRuleDsl.g:3091:2: rule__SelectMessageString__Group_1__0__Impl rule__SelectMessageString__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__SelectMessageString__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMessageString__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group_1__0"


    // $ANTLR start "rule__SelectMessageString__Group_1__0__Impl"
    // InternalRuleDsl.g:3098:1: rule__SelectMessageString__Group_1__0__Impl : ( ( rule__SelectMessageString__ResponseAssignment_1_0 ) ) ;
    public final void rule__SelectMessageString__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3102:1: ( ( ( rule__SelectMessageString__ResponseAssignment_1_0 ) ) )
            // InternalRuleDsl.g:3103:1: ( ( rule__SelectMessageString__ResponseAssignment_1_0 ) )
            {
            // InternalRuleDsl.g:3103:1: ( ( rule__SelectMessageString__ResponseAssignment_1_0 ) )
            // InternalRuleDsl.g:3104:2: ( rule__SelectMessageString__ResponseAssignment_1_0 )
            {
             before(grammarAccess.getSelectMessageStringAccess().getResponseAssignment_1_0()); 
            // InternalRuleDsl.g:3105:2: ( rule__SelectMessageString__ResponseAssignment_1_0 )
            // InternalRuleDsl.g:3105:3: rule__SelectMessageString__ResponseAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectMessageString__ResponseAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectMessageStringAccess().getResponseAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group_1__0__Impl"


    // $ANTLR start "rule__SelectMessageString__Group_1__1"
    // InternalRuleDsl.g:3113:1: rule__SelectMessageString__Group_1__1 : rule__SelectMessageString__Group_1__1__Impl ;
    public final void rule__SelectMessageString__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3117:1: ( rule__SelectMessageString__Group_1__1__Impl )
            // InternalRuleDsl.g:3118:2: rule__SelectMessageString__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectMessageString__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group_1__1"


    // $ANTLR start "rule__SelectMessageString__Group_1__1__Impl"
    // InternalRuleDsl.g:3124:1: rule__SelectMessageString__Group_1__1__Impl : ( ( rule__SelectMessageString__Group_1_1__0 )* ) ;
    public final void rule__SelectMessageString__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3128:1: ( ( ( rule__SelectMessageString__Group_1_1__0 )* ) )
            // InternalRuleDsl.g:3129:1: ( ( rule__SelectMessageString__Group_1_1__0 )* )
            {
            // InternalRuleDsl.g:3129:1: ( ( rule__SelectMessageString__Group_1_1__0 )* )
            // InternalRuleDsl.g:3130:2: ( rule__SelectMessageString__Group_1_1__0 )*
            {
             before(grammarAccess.getSelectMessageStringAccess().getGroup_1_1()); 
            // InternalRuleDsl.g:3131:2: ( rule__SelectMessageString__Group_1_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==28) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRuleDsl.g:3131:3: rule__SelectMessageString__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SelectMessageString__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getSelectMessageStringAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group_1__1__Impl"


    // $ANTLR start "rule__SelectMessageString__Group_1_1__0"
    // InternalRuleDsl.g:3140:1: rule__SelectMessageString__Group_1_1__0 : rule__SelectMessageString__Group_1_1__0__Impl rule__SelectMessageString__Group_1_1__1 ;
    public final void rule__SelectMessageString__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3144:1: ( rule__SelectMessageString__Group_1_1__0__Impl rule__SelectMessageString__Group_1_1__1 )
            // InternalRuleDsl.g:3145:2: rule__SelectMessageString__Group_1_1__0__Impl rule__SelectMessageString__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SelectMessageString__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMessageString__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group_1_1__0"


    // $ANTLR start "rule__SelectMessageString__Group_1_1__0__Impl"
    // InternalRuleDsl.g:3152:1: rule__SelectMessageString__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__SelectMessageString__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3156:1: ( ( ',' ) )
            // InternalRuleDsl.g:3157:1: ( ',' )
            {
            // InternalRuleDsl.g:3157:1: ( ',' )
            // InternalRuleDsl.g:3158:2: ','
            {
             before(grammarAccess.getSelectMessageStringAccess().getCommaKeyword_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSelectMessageStringAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group_1_1__0__Impl"


    // $ANTLR start "rule__SelectMessageString__Group_1_1__1"
    // InternalRuleDsl.g:3167:1: rule__SelectMessageString__Group_1_1__1 : rule__SelectMessageString__Group_1_1__1__Impl ;
    public final void rule__SelectMessageString__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3171:1: ( rule__SelectMessageString__Group_1_1__1__Impl )
            // InternalRuleDsl.g:3172:2: rule__SelectMessageString__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectMessageString__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group_1_1__1"


    // $ANTLR start "rule__SelectMessageString__Group_1_1__1__Impl"
    // InternalRuleDsl.g:3178:1: rule__SelectMessageString__Group_1_1__1__Impl : ( ( rule__SelectMessageString__ResponseAssignment_1_1_1 ) ) ;
    public final void rule__SelectMessageString__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3182:1: ( ( ( rule__SelectMessageString__ResponseAssignment_1_1_1 ) ) )
            // InternalRuleDsl.g:3183:1: ( ( rule__SelectMessageString__ResponseAssignment_1_1_1 ) )
            {
            // InternalRuleDsl.g:3183:1: ( ( rule__SelectMessageString__ResponseAssignment_1_1_1 ) )
            // InternalRuleDsl.g:3184:2: ( rule__SelectMessageString__ResponseAssignment_1_1_1 )
            {
             before(grammarAccess.getSelectMessageStringAccess().getResponseAssignment_1_1_1()); 
            // InternalRuleDsl.g:3185:2: ( rule__SelectMessageString__ResponseAssignment_1_1_1 )
            // InternalRuleDsl.g:3185:3: rule__SelectMessageString__ResponseAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectMessageString__ResponseAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectMessageStringAccess().getResponseAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__Group_1_1__1__Impl"


    // $ANTLR start "rule__ReceiverList__Group__0"
    // InternalRuleDsl.g:3194:1: rule__ReceiverList__Group__0 : rule__ReceiverList__Group__0__Impl rule__ReceiverList__Group__1 ;
    public final void rule__ReceiverList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3198:1: ( rule__ReceiverList__Group__0__Impl rule__ReceiverList__Group__1 )
            // InternalRuleDsl.g:3199:2: rule__ReceiverList__Group__0__Impl rule__ReceiverList__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ReceiverList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReceiverList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group__0"


    // $ANTLR start "rule__ReceiverList__Group__0__Impl"
    // InternalRuleDsl.g:3206:1: rule__ReceiverList__Group__0__Impl : ( '{' ) ;
    public final void rule__ReceiverList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3210:1: ( ( '{' ) )
            // InternalRuleDsl.g:3211:1: ( '{' )
            {
            // InternalRuleDsl.g:3211:1: ( '{' )
            // InternalRuleDsl.g:3212:2: '{'
            {
             before(grammarAccess.getReceiverListAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getReceiverListAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group__0__Impl"


    // $ANTLR start "rule__ReceiverList__Group__1"
    // InternalRuleDsl.g:3221:1: rule__ReceiverList__Group__1 : rule__ReceiverList__Group__1__Impl rule__ReceiverList__Group__2 ;
    public final void rule__ReceiverList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3225:1: ( rule__ReceiverList__Group__1__Impl rule__ReceiverList__Group__2 )
            // InternalRuleDsl.g:3226:2: rule__ReceiverList__Group__1__Impl rule__ReceiverList__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ReceiverList__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReceiverList__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group__1"


    // $ANTLR start "rule__ReceiverList__Group__1__Impl"
    // InternalRuleDsl.g:3233:1: rule__ReceiverList__Group__1__Impl : ( ( rule__ReceiverList__Group_1__0 ) ) ;
    public final void rule__ReceiverList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3237:1: ( ( ( rule__ReceiverList__Group_1__0 ) ) )
            // InternalRuleDsl.g:3238:1: ( ( rule__ReceiverList__Group_1__0 ) )
            {
            // InternalRuleDsl.g:3238:1: ( ( rule__ReceiverList__Group_1__0 ) )
            // InternalRuleDsl.g:3239:2: ( rule__ReceiverList__Group_1__0 )
            {
             before(grammarAccess.getReceiverListAccess().getGroup_1()); 
            // InternalRuleDsl.g:3240:2: ( rule__ReceiverList__Group_1__0 )
            // InternalRuleDsl.g:3240:3: rule__ReceiverList__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverList__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getReceiverListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group__1__Impl"


    // $ANTLR start "rule__ReceiverList__Group__2"
    // InternalRuleDsl.g:3248:1: rule__ReceiverList__Group__2 : rule__ReceiverList__Group__2__Impl ;
    public final void rule__ReceiverList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3252:1: ( rule__ReceiverList__Group__2__Impl )
            // InternalRuleDsl.g:3253:2: rule__ReceiverList__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverList__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group__2"


    // $ANTLR start "rule__ReceiverList__Group__2__Impl"
    // InternalRuleDsl.g:3259:1: rule__ReceiverList__Group__2__Impl : ( '}' ) ;
    public final void rule__ReceiverList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3263:1: ( ( '}' ) )
            // InternalRuleDsl.g:3264:1: ( '}' )
            {
            // InternalRuleDsl.g:3264:1: ( '}' )
            // InternalRuleDsl.g:3265:2: '}'
            {
             before(grammarAccess.getReceiverListAccess().getRightCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getReceiverListAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group__2__Impl"


    // $ANTLR start "rule__ReceiverList__Group_1__0"
    // InternalRuleDsl.g:3275:1: rule__ReceiverList__Group_1__0 : rule__ReceiverList__Group_1__0__Impl rule__ReceiverList__Group_1__1 ;
    public final void rule__ReceiverList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3279:1: ( rule__ReceiverList__Group_1__0__Impl rule__ReceiverList__Group_1__1 )
            // InternalRuleDsl.g:3280:2: rule__ReceiverList__Group_1__0__Impl rule__ReceiverList__Group_1__1
            {
            pushFollow(FOLLOW_20);
            rule__ReceiverList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReceiverList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group_1__0"


    // $ANTLR start "rule__ReceiverList__Group_1__0__Impl"
    // InternalRuleDsl.g:3287:1: rule__ReceiverList__Group_1__0__Impl : ( ( rule__ReceiverList__ReceiverAssignment_1_0 ) ) ;
    public final void rule__ReceiverList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3291:1: ( ( ( rule__ReceiverList__ReceiverAssignment_1_0 ) ) )
            // InternalRuleDsl.g:3292:1: ( ( rule__ReceiverList__ReceiverAssignment_1_0 ) )
            {
            // InternalRuleDsl.g:3292:1: ( ( rule__ReceiverList__ReceiverAssignment_1_0 ) )
            // InternalRuleDsl.g:3293:2: ( rule__ReceiverList__ReceiverAssignment_1_0 )
            {
             before(grammarAccess.getReceiverListAccess().getReceiverAssignment_1_0()); 
            // InternalRuleDsl.g:3294:2: ( rule__ReceiverList__ReceiverAssignment_1_0 )
            // InternalRuleDsl.g:3294:3: rule__ReceiverList__ReceiverAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverList__ReceiverAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getReceiverListAccess().getReceiverAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group_1__0__Impl"


    // $ANTLR start "rule__ReceiverList__Group_1__1"
    // InternalRuleDsl.g:3302:1: rule__ReceiverList__Group_1__1 : rule__ReceiverList__Group_1__1__Impl ;
    public final void rule__ReceiverList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3306:1: ( rule__ReceiverList__Group_1__1__Impl )
            // InternalRuleDsl.g:3307:2: rule__ReceiverList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group_1__1"


    // $ANTLR start "rule__ReceiverList__Group_1__1__Impl"
    // InternalRuleDsl.g:3313:1: rule__ReceiverList__Group_1__1__Impl : ( ( rule__ReceiverList__Group_1_1__0 )* ) ;
    public final void rule__ReceiverList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3317:1: ( ( ( rule__ReceiverList__Group_1_1__0 )* ) )
            // InternalRuleDsl.g:3318:1: ( ( rule__ReceiverList__Group_1_1__0 )* )
            {
            // InternalRuleDsl.g:3318:1: ( ( rule__ReceiverList__Group_1_1__0 )* )
            // InternalRuleDsl.g:3319:2: ( rule__ReceiverList__Group_1_1__0 )*
            {
             before(grammarAccess.getReceiverListAccess().getGroup_1_1()); 
            // InternalRuleDsl.g:3320:2: ( rule__ReceiverList__Group_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==28) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalRuleDsl.g:3320:3: rule__ReceiverList__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__ReceiverList__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getReceiverListAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group_1__1__Impl"


    // $ANTLR start "rule__ReceiverList__Group_1_1__0"
    // InternalRuleDsl.g:3329:1: rule__ReceiverList__Group_1_1__0 : rule__ReceiverList__Group_1_1__0__Impl rule__ReceiverList__Group_1_1__1 ;
    public final void rule__ReceiverList__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3333:1: ( rule__ReceiverList__Group_1_1__0__Impl rule__ReceiverList__Group_1_1__1 )
            // InternalRuleDsl.g:3334:2: rule__ReceiverList__Group_1_1__0__Impl rule__ReceiverList__Group_1_1__1
            {
            pushFollow(FOLLOW_37);
            rule__ReceiverList__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ReceiverList__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group_1_1__0"


    // $ANTLR start "rule__ReceiverList__Group_1_1__0__Impl"
    // InternalRuleDsl.g:3341:1: rule__ReceiverList__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ReceiverList__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3345:1: ( ( ',' ) )
            // InternalRuleDsl.g:3346:1: ( ',' )
            {
            // InternalRuleDsl.g:3346:1: ( ',' )
            // InternalRuleDsl.g:3347:2: ','
            {
             before(grammarAccess.getReceiverListAccess().getCommaKeyword_1_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReceiverListAccess().getCommaKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group_1_1__0__Impl"


    // $ANTLR start "rule__ReceiverList__Group_1_1__1"
    // InternalRuleDsl.g:3356:1: rule__ReceiverList__Group_1_1__1 : rule__ReceiverList__Group_1_1__1__Impl ;
    public final void rule__ReceiverList__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3360:1: ( rule__ReceiverList__Group_1_1__1__Impl )
            // InternalRuleDsl.g:3361:2: rule__ReceiverList__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverList__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group_1_1__1"


    // $ANTLR start "rule__ReceiverList__Group_1_1__1__Impl"
    // InternalRuleDsl.g:3367:1: rule__ReceiverList__Group_1_1__1__Impl : ( ( rule__ReceiverList__ReceiverAssignment_1_1_1 ) ) ;
    public final void rule__ReceiverList__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3371:1: ( ( ( rule__ReceiverList__ReceiverAssignment_1_1_1 ) ) )
            // InternalRuleDsl.g:3372:1: ( ( rule__ReceiverList__ReceiverAssignment_1_1_1 ) )
            {
            // InternalRuleDsl.g:3372:1: ( ( rule__ReceiverList__ReceiverAssignment_1_1_1 ) )
            // InternalRuleDsl.g:3373:2: ( rule__ReceiverList__ReceiverAssignment_1_1_1 )
            {
             before(grammarAccess.getReceiverListAccess().getReceiverAssignment_1_1_1()); 
            // InternalRuleDsl.g:3374:2: ( rule__ReceiverList__ReceiverAssignment_1_1_1 )
            // InternalRuleDsl.g:3374:3: rule__ReceiverList__ReceiverAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ReceiverList__ReceiverAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getReceiverListAccess().getReceiverAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__Group_1_1__1__Impl"


    // $ANTLR start "rule__DistributionList__Group__0"
    // InternalRuleDsl.g:3383:1: rule__DistributionList__Group__0 : rule__DistributionList__Group__0__Impl rule__DistributionList__Group__1 ;
    public final void rule__DistributionList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3387:1: ( rule__DistributionList__Group__0__Impl rule__DistributionList__Group__1 )
            // InternalRuleDsl.g:3388:2: rule__DistributionList__Group__0__Impl rule__DistributionList__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__DistributionList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistributionList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistributionList__Group__0"


    // $ANTLR start "rule__DistributionList__Group__0__Impl"
    // InternalRuleDsl.g:3395:1: rule__DistributionList__Group__0__Impl : ( '@' ) ;
    public final void rule__DistributionList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3399:1: ( ( '@' ) )
            // InternalRuleDsl.g:3400:1: ( '@' )
            {
            // InternalRuleDsl.g:3400:1: ( '@' )
            // InternalRuleDsl.g:3401:2: '@'
            {
             before(grammarAccess.getDistributionListAccess().getCommercialAtKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDistributionListAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistributionList__Group__0__Impl"


    // $ANTLR start "rule__DistributionList__Group__1"
    // InternalRuleDsl.g:3410:1: rule__DistributionList__Group__1 : rule__DistributionList__Group__1__Impl ;
    public final void rule__DistributionList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3414:1: ( rule__DistributionList__Group__1__Impl )
            // InternalRuleDsl.g:3415:2: rule__DistributionList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistributionList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistributionList__Group__1"


    // $ANTLR start "rule__DistributionList__Group__1__Impl"
    // InternalRuleDsl.g:3421:1: rule__DistributionList__Group__1__Impl : ( ( rule__DistributionList__FileAssignment_1 ) ) ;
    public final void rule__DistributionList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3425:1: ( ( ( rule__DistributionList__FileAssignment_1 ) ) )
            // InternalRuleDsl.g:3426:1: ( ( rule__DistributionList__FileAssignment_1 ) )
            {
            // InternalRuleDsl.g:3426:1: ( ( rule__DistributionList__FileAssignment_1 ) )
            // InternalRuleDsl.g:3427:2: ( rule__DistributionList__FileAssignment_1 )
            {
             before(grammarAccess.getDistributionListAccess().getFileAssignment_1()); 
            // InternalRuleDsl.g:3428:2: ( rule__DistributionList__FileAssignment_1 )
            // InternalRuleDsl.g:3428:3: rule__DistributionList__FileAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DistributionList__FileAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDistributionListAccess().getFileAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistributionList__Group__1__Impl"


    // $ANTLR start "rule__RuleModel__ImportsAssignment_0_0"
    // InternalRuleDsl.g:3437:1: rule__RuleModel__ImportsAssignment_0_0 : ( ruleImport ) ;
    public final void rule__RuleModel__ImportsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3441:1: ( ( ruleImport ) )
            // InternalRuleDsl.g:3442:2: ( ruleImport )
            {
            // InternalRuleDsl.g:3442:2: ( ruleImport )
            // InternalRuleDsl.g:3443:3: ruleImport
            {
             before(grammarAccess.getRuleModelAccess().getImportsImportParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getRuleModelAccess().getImportsImportParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__ImportsAssignment_0_0"


    // $ANTLR start "rule__RuleModel__ImportsAssignment_0_1"
    // InternalRuleDsl.g:3452:1: rule__RuleModel__ImportsAssignment_0_1 : ( ruleImport ) ;
    public final void rule__RuleModel__ImportsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3456:1: ( ( ruleImport ) )
            // InternalRuleDsl.g:3457:2: ( ruleImport )
            {
            // InternalRuleDsl.g:3457:2: ( ruleImport )
            // InternalRuleDsl.g:3458:3: ruleImport
            {
             before(grammarAccess.getRuleModelAccess().getImportsImportParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getRuleModelAccess().getImportsImportParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__ImportsAssignment_0_1"


    // $ANTLR start "rule__RuleModel__ElementsAssignment_1_0"
    // InternalRuleDsl.g:3467:1: rule__RuleModel__ElementsAssignment_1_0 : ( ruleRule ) ;
    public final void rule__RuleModel__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3471:1: ( ( ruleRule ) )
            // InternalRuleDsl.g:3472:2: ( ruleRule )
            {
            // InternalRuleDsl.g:3472:2: ( ruleRule )
            // InternalRuleDsl.g:3473:3: ruleRule
            {
             before(grammarAccess.getRuleModelAccess().getElementsRuleParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleModelAccess().getElementsRuleParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__ElementsAssignment_1_0"


    // $ANTLR start "rule__RuleModel__ElementsAssignment_1_1"
    // InternalRuleDsl.g:3482:1: rule__RuleModel__ElementsAssignment_1_1 : ( ruleRule ) ;
    public final void rule__RuleModel__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3486:1: ( ( ruleRule ) )
            // InternalRuleDsl.g:3487:2: ( ruleRule )
            {
            // InternalRuleDsl.g:3487:2: ( ruleRule )
            // InternalRuleDsl.g:3488:3: ruleRule
            {
             before(grammarAccess.getRuleModelAccess().getElementsRuleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleModelAccess().getElementsRuleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuleModel__ElementsAssignment_1_1"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalRuleDsl.g:3497:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3501:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRuleDsl.g:3502:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRuleDsl.g:3502:2: ( ruleQualifiedNameWithWildcard )
            // InternalRuleDsl.g:3503:3: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__Rule__NameAssignment_0"
    // InternalRuleDsl.g:3512:1: rule__Rule__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3516:1: ( ( RULE_ID ) )
            // InternalRuleDsl.g:3517:2: ( RULE_ID )
            {
            // InternalRuleDsl.g:3517:2: ( RULE_ID )
            // InternalRuleDsl.g:3518:3: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_0"


    // $ANTLR start "rule__Rule__EventAssignment_3"
    // InternalRuleDsl.g:3527:1: rule__Rule__EventAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3531:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:3532:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:3532:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:3533:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getEventPhraseCrossReference_3_0()); 
            // InternalRuleDsl.g:3534:3: ( RULE_ID )
            // InternalRuleDsl.g:3535:4: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getEventPhraseIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getEventPhraseIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRuleAccess().getEventPhraseCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__EventAssignment_3"


    // $ANTLR start "rule__Rule__ActionsAssignment_6_0"
    // InternalRuleDsl.g:3546:1: rule__Rule__ActionsAssignment_6_0 : ( ruleAction ) ;
    public final void rule__Rule__ActionsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3550:1: ( ( ruleAction ) )
            // InternalRuleDsl.g:3551:2: ( ruleAction )
            {
            // InternalRuleDsl.g:3551:2: ( ruleAction )
            // InternalRuleDsl.g:3552:3: ruleAction
            {
             before(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionsAssignment_6_0"


    // $ANTLR start "rule__Rule__ActionsAssignment_6_1"
    // InternalRuleDsl.g:3561:1: rule__Rule__ActionsAssignment_6_1 : ( ruleAction ) ;
    public final void rule__Rule__ActionsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3565:1: ( ( ruleAction ) )
            // InternalRuleDsl.g:3566:2: ( ruleAction )
            {
            // InternalRuleDsl.g:3566:2: ( ruleAction )
            // InternalRuleDsl.g:3567:3: ruleAction
            {
             before(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionsAssignment_6_1"


    // $ANTLR start "rule__Query__NameAssignment_0"
    // InternalRuleDsl.g:3576:1: rule__Query__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3580:1: ( ( RULE_ID ) )
            // InternalRuleDsl.g:3581:2: ( RULE_ID )
            {
            // InternalRuleDsl.g:3581:2: ( RULE_ID )
            // InternalRuleDsl.g:3582:3: RULE_ID
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
    // InternalRuleDsl.g:3591:1: rule__Query__SelectAssignment_2 : ( ruleSelect ) ;
    public final void rule__Query__SelectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3595:1: ( ( ruleSelect ) )
            // InternalRuleDsl.g:3596:2: ( ruleSelect )
            {
            // InternalRuleDsl.g:3596:2: ( ruleSelect )
            // InternalRuleDsl.g:3597:3: ruleSelect
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


    // $ANTLR start "rule__Query__ThenAssignment_5_0"
    // InternalRuleDsl.g:3606:1: rule__Query__ThenAssignment_5_0 : ( ruleMessage ) ;
    public final void rule__Query__ThenAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3610:1: ( ( ruleMessage ) )
            // InternalRuleDsl.g:3611:2: ( ruleMessage )
            {
            // InternalRuleDsl.g:3611:2: ( ruleMessage )
            // InternalRuleDsl.g:3612:3: ruleMessage
            {
             before(grammarAccess.getQueryAccess().getThenMessageParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getThenMessageParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ThenAssignment_5_0"


    // $ANTLR start "rule__Query__ThenAssignment_5_1"
    // InternalRuleDsl.g:3621:1: rule__Query__ThenAssignment_5_1 : ( ruleMessage ) ;
    public final void rule__Query__ThenAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3625:1: ( ( ruleMessage ) )
            // InternalRuleDsl.g:3626:2: ( ruleMessage )
            {
            // InternalRuleDsl.g:3626:2: ( ruleMessage )
            // InternalRuleDsl.g:3627:3: ruleMessage
            {
             before(grammarAccess.getQueryAccess().getThenMessageParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessage();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getThenMessageParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__ThenAssignment_5_1"


    // $ANTLR start "rule__AddingSelect__OperationAssignment_0"
    // InternalRuleDsl.g:3636:1: rule__AddingSelect__OperationAssignment_0 : ( RULE_SELECTOPERATOR ) ;
    public final void rule__AddingSelect__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3640:1: ( ( RULE_SELECTOPERATOR ) )
            // InternalRuleDsl.g:3641:2: ( RULE_SELECTOPERATOR )
            {
            // InternalRuleDsl.g:3641:2: ( RULE_SELECTOPERATOR )
            // InternalRuleDsl.g:3642:3: RULE_SELECTOPERATOR
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
    // InternalRuleDsl.g:3651:1: rule__AddingSelect__ElementAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__AddingSelect__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3655:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:3656:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:3656:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:3657:3: ( RULE_ID )
            {
             before(grammarAccess.getAddingSelectAccess().getElementConceptCrossReference_1_0_0()); 
            // InternalRuleDsl.g:3658:3: ( RULE_ID )
            // InternalRuleDsl.g:3659:4: RULE_ID
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
    // InternalRuleDsl.g:3670:1: rule__AddingSelect__AllAssignment_1_1 : ( ( '*' ) ) ;
    public final void rule__AddingSelect__AllAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3674:1: ( ( ( '*' ) ) )
            // InternalRuleDsl.g:3675:2: ( ( '*' ) )
            {
            // InternalRuleDsl.g:3675:2: ( ( '*' ) )
            // InternalRuleDsl.g:3676:3: ( '*' )
            {
             before(grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0()); 
            // InternalRuleDsl.g:3677:3: ( '*' )
            // InternalRuleDsl.g:3678:4: '*'
            {
             before(grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0()); 
            match(input,37,FOLLOW_2); 
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


    // $ANTLR start "rule__SetSelect__SelectorAssignment_1_0"
    // InternalRuleDsl.g:3689:1: rule__SetSelect__SelectorAssignment_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SetSelect__SelectorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3693:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRuleDsl.g:3694:2: ( ( ruleQualifiedName ) )
            {
            // InternalRuleDsl.g:3694:2: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:3695:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeCrossReference_1_0_0()); 
            // InternalRuleDsl.g:3696:3: ( ruleQualifiedName )
            // InternalRuleDsl.g:3697:4: ruleQualifiedName
            {
             before(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeQualifiedNameParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeQualifiedNameParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__SelectorAssignment_1_0"


    // $ANTLR start "rule__SetSelect__SelectorAssignment_1_1_1"
    // InternalRuleDsl.g:3708:1: rule__SetSelect__SelectorAssignment_1_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SetSelect__SelectorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3712:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRuleDsl.g:3713:2: ( ( ruleQualifiedName ) )
            {
            // InternalRuleDsl.g:3713:2: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:3714:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeCrossReference_1_1_1_0()); 
            // InternalRuleDsl.g:3715:3: ( ruleQualifiedName )
            // InternalRuleDsl.g:3716:4: ruleQualifiedName
            {
             before(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeQualifiedNameParserRuleCall_1_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeQualifiedNameParserRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getSetSelectAccess().getSelectorPrimitiveNodeCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__SelectorAssignment_1_1_1"


    // $ANTLR start "rule__SetSelect__FromAssignment_3_0"
    // InternalRuleDsl.g:3727:1: rule__SetSelect__FromAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SetSelect__FromAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3731:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRuleDsl.g:3732:2: ( ( ruleQualifiedName ) )
            {
            // InternalRuleDsl.g:3732:2: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:3733:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSetSelectAccess().getFromDataDescriptionCrossReference_3_0_0()); 
            // InternalRuleDsl.g:3734:3: ( ruleQualifiedName )
            // InternalRuleDsl.g:3735:4: ruleQualifiedName
            {
             before(grammarAccess.getSetSelectAccess().getFromDataDescriptionQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSetSelectAccess().getFromDataDescriptionQualifiedNameParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getSetSelectAccess().getFromDataDescriptionCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__FromAssignment_3_0"


    // $ANTLR start "rule__SetSelect__FromAssignment_3_1_1"
    // InternalRuleDsl.g:3746:1: rule__SetSelect__FromAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SetSelect__FromAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3750:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRuleDsl.g:3751:2: ( ( ruleQualifiedName ) )
            {
            // InternalRuleDsl.g:3751:2: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:3752:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSetSelectAccess().getFromDataDescriptionCrossReference_3_1_1_0()); 
            // InternalRuleDsl.g:3753:3: ( ruleQualifiedName )
            // InternalRuleDsl.g:3754:4: ruleQualifiedName
            {
             before(grammarAccess.getSetSelectAccess().getFromDataDescriptionQualifiedNameParserRuleCall_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSetSelectAccess().getFromDataDescriptionQualifiedNameParserRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getSetSelectAccess().getFromDataDescriptionCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__FromAssignment_3_1_1"


    // $ANTLR start "rule__SetSelect__WhereAssignment_4_1_0"
    // InternalRuleDsl.g:3765:1: rule__SetSelect__WhereAssignment_4_1_0 : ( ruleWhere ) ;
    public final void rule__SetSelect__WhereAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3769:1: ( ( ruleWhere ) )
            // InternalRuleDsl.g:3770:2: ( ruleWhere )
            {
            // InternalRuleDsl.g:3770:2: ( ruleWhere )
            // InternalRuleDsl.g:3771:3: ruleWhere
            {
             before(grammarAccess.getSetSelectAccess().getWhereWhereParserRuleCall_4_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getSetSelectAccess().getWhereWhereParserRuleCall_4_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__WhereAssignment_4_1_0"


    // $ANTLR start "rule__SetSelect__WhereAssignment_4_1_1_1"
    // InternalRuleDsl.g:3780:1: rule__SetSelect__WhereAssignment_4_1_1_1 : ( ruleWhere ) ;
    public final void rule__SetSelect__WhereAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3784:1: ( ( ruleWhere ) )
            // InternalRuleDsl.g:3785:2: ( ruleWhere )
            {
            // InternalRuleDsl.g:3785:2: ( ruleWhere )
            // InternalRuleDsl.g:3786:3: ruleWhere
            {
             before(grammarAccess.getSetSelectAccess().getWhereWhereParserRuleCall_4_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getSetSelectAccess().getWhereWhereParserRuleCall_4_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__WhereAssignment_4_1_1_1"


    // $ANTLR start "rule__Where__LeftAssignment_0"
    // InternalRuleDsl.g:3795:1: rule__Where__LeftAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Where__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3799:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRuleDsl.g:3800:2: ( ( ruleQualifiedName ) )
            {
            // InternalRuleDsl.g:3800:2: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:3801:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWhereAccess().getLeftPrimitiveNodeCrossReference_0_0()); 
            // InternalRuleDsl.g:3802:3: ( ruleQualifiedName )
            // InternalRuleDsl.g:3803:4: ruleQualifiedName
            {
             before(grammarAccess.getWhereAccess().getLeftPrimitiveNodeQualifiedNameParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getLeftPrimitiveNodeQualifiedNameParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getWhereAccess().getLeftPrimitiveNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__LeftAssignment_0"


    // $ANTLR start "rule__Where__LogicalOperatorAssignment_1"
    // InternalRuleDsl.g:3814:1: rule__Where__LogicalOperatorAssignment_1 : ( RULE_LOGICALOPERATOR ) ;
    public final void rule__Where__LogicalOperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3818:1: ( ( RULE_LOGICALOPERATOR ) )
            // InternalRuleDsl.g:3819:2: ( RULE_LOGICALOPERATOR )
            {
            // InternalRuleDsl.g:3819:2: ( RULE_LOGICALOPERATOR )
            // InternalRuleDsl.g:3820:3: RULE_LOGICALOPERATOR
            {
             before(grammarAccess.getWhereAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_LOGICALOPERATOR,FOLLOW_2); 
             after(grammarAccess.getWhereAccess().getLogicalOperatorLOGICALOPERATORTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__LogicalOperatorAssignment_1"


    // $ANTLR start "rule__Where__RightAssignment_2_0"
    // InternalRuleDsl.g:3829:1: rule__Where__RightAssignment_2_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Where__RightAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3833:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRuleDsl.g:3834:2: ( ( ruleQualifiedName ) )
            {
            // InternalRuleDsl.g:3834:2: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:3835:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWhereAccess().getRightPrimitiveNodeCrossReference_2_0_0()); 
            // InternalRuleDsl.g:3836:3: ( ruleQualifiedName )
            // InternalRuleDsl.g:3837:4: ruleQualifiedName
            {
             before(grammarAccess.getWhereAccess().getRightPrimitiveNodeQualifiedNameParserRuleCall_2_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getRightPrimitiveNodeQualifiedNameParserRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getWhereAccess().getRightPrimitiveNodeCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__RightAssignment_2_0"


    // $ANTLR start "rule__Where__RightStreamingAssignment_2_1_1"
    // InternalRuleDsl.g:3848:1: rule__Where__RightStreamingAssignment_2_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Where__RightStreamingAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3852:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRuleDsl.g:3853:2: ( ( ruleQualifiedName ) )
            {
            // InternalRuleDsl.g:3853:2: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:3854:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getWhereAccess().getRightStreamingConceptCrossReference_2_1_1_0()); 
            // InternalRuleDsl.g:3855:3: ( ruleQualifiedName )
            // InternalRuleDsl.g:3856:4: ruleQualifiedName
            {
             before(grammarAccess.getWhereAccess().getRightStreamingConceptQualifiedNameParserRuleCall_2_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getWhereAccess().getRightStreamingConceptQualifiedNameParserRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getWhereAccess().getRightStreamingConceptCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Where__RightStreamingAssignment_2_1_1"


    // $ANTLR start "rule__PlainExpression__PlainOperandAssignment"
    // InternalRuleDsl.g:3867:1: rule__PlainExpression__PlainOperandAssignment : ( rulePlainOperand ) ;
    public final void rule__PlainExpression__PlainOperandAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3871:1: ( ( rulePlainOperand ) )
            // InternalRuleDsl.g:3872:2: ( rulePlainOperand )
            {
            // InternalRuleDsl.g:3872:2: ( rulePlainOperand )
            // InternalRuleDsl.g:3873:3: rulePlainOperand
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
    // InternalRuleDsl.g:3882:1: rule__ComplexExpression__PlainOperandAssignment_1 : ( rulePlainOperand ) ;
    public final void rule__ComplexExpression__PlainOperandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3886:1: ( ( rulePlainOperand ) )
            // InternalRuleDsl.g:3887:2: ( rulePlainOperand )
            {
            // InternalRuleDsl.g:3887:2: ( rulePlainOperand )
            // InternalRuleDsl.g:3888:3: rulePlainOperand
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
    // InternalRuleDsl.g:3897:1: rule__ComplexExpression__ComplexOperandsAssignment_2_0 : ( ruleComplexOperand ) ;
    public final void rule__ComplexExpression__ComplexOperandsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3901:1: ( ( ruleComplexOperand ) )
            // InternalRuleDsl.g:3902:2: ( ruleComplexOperand )
            {
            // InternalRuleDsl.g:3902:2: ( ruleComplexOperand )
            // InternalRuleDsl.g:3903:3: ruleComplexOperand
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
    // InternalRuleDsl.g:3912:1: rule__ComplexExpression__ComplexOperandsAssignment_2_1 : ( ruleComplexOperand ) ;
    public final void rule__ComplexExpression__ComplexOperandsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3916:1: ( ( ruleComplexOperand ) )
            // InternalRuleDsl.g:3917:2: ( ruleComplexOperand )
            {
            // InternalRuleDsl.g:3917:2: ( ruleComplexOperand )
            // InternalRuleDsl.g:3918:3: ruleComplexOperand
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
    // InternalRuleDsl.g:3927:1: rule__Numeral__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__Numeral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3931:1: ( ( RULE_DOUBLE ) )
            // InternalRuleDsl.g:3932:2: ( RULE_DOUBLE )
            {
            // InternalRuleDsl.g:3932:2: ( RULE_DOUBLE )
            // InternalRuleDsl.g:3933:3: RULE_DOUBLE
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
    // InternalRuleDsl.g:3942:1: rule__QueryOperand__QueryAssignment : ( ( RULE_ID ) ) ;
    public final void rule__QueryOperand__QueryAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3946:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDsl.g:3947:2: ( ( RULE_ID ) )
            {
            // InternalRuleDsl.g:3947:2: ( ( RULE_ID ) )
            // InternalRuleDsl.g:3948:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryOperandAccess().getQueryQueryCrossReference_0()); 
            // InternalRuleDsl.g:3949:3: ( RULE_ID )
            // InternalRuleDsl.g:3950:4: RULE_ID
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
    // InternalRuleDsl.g:3961:1: rule__ComplexOperand__OperatorAssignment_0 : ( RULE_OPERATOR ) ;
    public final void rule__ComplexOperand__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3965:1: ( ( RULE_OPERATOR ) )
            // InternalRuleDsl.g:3966:2: ( RULE_OPERATOR )
            {
            // InternalRuleDsl.g:3966:2: ( RULE_OPERATOR )
            // InternalRuleDsl.g:3967:3: RULE_OPERATOR
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
    // InternalRuleDsl.g:3976:1: rule__ComplexOperand__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ComplexOperand__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3980:1: ( ( ruleExpression ) )
            // InternalRuleDsl.g:3981:2: ( ruleExpression )
            {
            // InternalRuleDsl.g:3981:2: ( ruleExpression )
            // InternalRuleDsl.g:3982:3: ruleExpression
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


    // $ANTLR start "rule__Message__NameAssignment_0"
    // InternalRuleDsl.g:3991:1: rule__Message__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:3995:1: ( ( RULE_ID ) )
            // InternalRuleDsl.g:3996:2: ( RULE_ID )
            {
            // InternalRuleDsl.g:3996:2: ( RULE_ID )
            // InternalRuleDsl.g:3997:3: RULE_ID
            {
             before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__NameAssignment_0"


    // $ANTLR start "rule__Message__MessageAssignment_3_0"
    // InternalRuleDsl.g:4006:1: rule__Message__MessageAssignment_3_0 : ( ruleMessageString ) ;
    public final void rule__Message__MessageAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:4010:1: ( ( ruleMessageString ) )
            // InternalRuleDsl.g:4011:2: ( ruleMessageString )
            {
            // InternalRuleDsl.g:4011:2: ( ruleMessageString )
            // InternalRuleDsl.g:4012:3: ruleMessageString
            {
             before(grammarAccess.getMessageAccess().getMessageMessageStringParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageString();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getMessageMessageStringParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__MessageAssignment_3_0"


    // $ANTLR start "rule__Message__MessageAssignment_3_1_1"
    // InternalRuleDsl.g:4021:1: rule__Message__MessageAssignment_3_1_1 : ( ruleMessageString ) ;
    public final void rule__Message__MessageAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:4025:1: ( ( ruleMessageString ) )
            // InternalRuleDsl.g:4026:2: ( ruleMessageString )
            {
            // InternalRuleDsl.g:4026:2: ( ruleMessageString )
            // InternalRuleDsl.g:4027:3: ruleMessageString
            {
             before(grammarAccess.getMessageAccess().getMessageMessageStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMessageString();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getMessageMessageStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__MessageAssignment_3_1_1"


    // $ANTLR start "rule__Message__RecipientAssignment_4_1"
    // InternalRuleDsl.g:4036:1: rule__Message__RecipientAssignment_4_1 : ( ruleReceiver ) ;
    public final void rule__Message__RecipientAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:4040:1: ( ( ruleReceiver ) )
            // InternalRuleDsl.g:4041:2: ( ruleReceiver )
            {
            // InternalRuleDsl.g:4041:2: ( ruleReceiver )
            // InternalRuleDsl.g:4042:3: ruleReceiver
            {
             before(grammarAccess.getMessageAccess().getRecipientReceiverParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReceiver();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getRecipientReceiverParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__RecipientAssignment_4_1"


    // $ANTLR start "rule__SelectMessageString__ResponseAssignment_1_0"
    // InternalRuleDsl.g:4051:1: rule__SelectMessageString__ResponseAssignment_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SelectMessageString__ResponseAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:4055:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRuleDsl.g:4056:2: ( ( ruleQualifiedName ) )
            {
            // InternalRuleDsl.g:4056:2: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:4057:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeCrossReference_1_0_0()); 
            // InternalRuleDsl.g:4058:3: ( ruleQualifiedName )
            // InternalRuleDsl.g:4059:4: ruleQualifiedName
            {
             before(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeQualifiedNameParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeQualifiedNameParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__ResponseAssignment_1_0"


    // $ANTLR start "rule__SelectMessageString__ResponseAssignment_1_1_1"
    // InternalRuleDsl.g:4070:1: rule__SelectMessageString__ResponseAssignment_1_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SelectMessageString__ResponseAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:4074:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRuleDsl.g:4075:2: ( ( ruleQualifiedName ) )
            {
            // InternalRuleDsl.g:4075:2: ( ( ruleQualifiedName ) )
            // InternalRuleDsl.g:4076:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeCrossReference_1_1_1_0()); 
            // InternalRuleDsl.g:4077:3: ( ruleQualifiedName )
            // InternalRuleDsl.g:4078:4: ruleQualifiedName
            {
             before(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeQualifiedNameParserRuleCall_1_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeQualifiedNameParserRuleCall_1_1_1_0_1()); 

            }

             after(grammarAccess.getSelectMessageStringAccess().getResponsePrimitiveNodeCrossReference_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectMessageString__ResponseAssignment_1_1_1"


    // $ANTLR start "rule__TextMessageString__TextAssignment"
    // InternalRuleDsl.g:4089:1: rule__TextMessageString__TextAssignment : ( RULE_STRING ) ;
    public final void rule__TextMessageString__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:4093:1: ( ( RULE_STRING ) )
            // InternalRuleDsl.g:4094:2: ( RULE_STRING )
            {
            // InternalRuleDsl.g:4094:2: ( RULE_STRING )
            // InternalRuleDsl.g:4095:3: RULE_STRING
            {
             before(grammarAccess.getTextMessageStringAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextMessageStringAccess().getTextSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextMessageString__TextAssignment"


    // $ANTLR start "rule__ReceiverList__ReceiverAssignment_1_0"
    // InternalRuleDsl.g:4104:1: rule__ReceiverList__ReceiverAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__ReceiverList__ReceiverAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:4108:1: ( ( RULE_STRING ) )
            // InternalRuleDsl.g:4109:2: ( RULE_STRING )
            {
            // InternalRuleDsl.g:4109:2: ( RULE_STRING )
            // InternalRuleDsl.g:4110:3: RULE_STRING
            {
             before(grammarAccess.getReceiverListAccess().getReceiverSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReceiverListAccess().getReceiverSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__ReceiverAssignment_1_0"


    // $ANTLR start "rule__ReceiverList__ReceiverAssignment_1_1_1"
    // InternalRuleDsl.g:4119:1: rule__ReceiverList__ReceiverAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__ReceiverList__ReceiverAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:4123:1: ( ( RULE_STRING ) )
            // InternalRuleDsl.g:4124:2: ( RULE_STRING )
            {
            // InternalRuleDsl.g:4124:2: ( RULE_STRING )
            // InternalRuleDsl.g:4125:3: RULE_STRING
            {
             before(grammarAccess.getReceiverListAccess().getReceiverSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getReceiverListAccess().getReceiverSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReceiverList__ReceiverAssignment_1_1_1"


    // $ANTLR start "rule__DistributionList__FileAssignment_1"
    // InternalRuleDsl.g:4134:1: rule__DistributionList__FileAssignment_1 : ( RULE_STRING ) ;
    public final void rule__DistributionList__FileAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDsl.g:4138:1: ( ( RULE_STRING ) )
            // InternalRuleDsl.g:4139:2: ( RULE_STRING )
            {
            // InternalRuleDsl.g:4139:2: ( RULE_STRING )
            // InternalRuleDsl.g:4140:3: RULE_STRING
            {
             before(grammarAccess.getDistributionListAccess().getFileSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDistributionListAccess().getFileSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistributionList__FileAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000100L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000090L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100200L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000100000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000200L});

}