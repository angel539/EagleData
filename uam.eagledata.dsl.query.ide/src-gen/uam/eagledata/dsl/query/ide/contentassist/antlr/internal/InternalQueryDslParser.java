package uam.eagledata.dsl.query.ide.contentassist.antlr.internal;

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
import uam.eagledata.dsl.query.services.QueryDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'join'", "'left-join'", "'right-join'", "'outer-join'", "'left-outer-join'", "'right-outer-join'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "'and'", "'or'", "'String'", "'Int'", "'Boolean'", "'Float'", "'Double'", "'query-set'", "'{'", "'}'", "'import'", "'.*'", "'.'", "':'", "'select'", "'('", "')'", "','", "'from'", "'where'", "'on'", "'['", "']'", "'*'", "'not'"
    };
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


        public InternalQueryDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQueryDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQueryDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQueryDsl.g"; }


    	private QueryDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(QueryDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleQuerySet"
    // InternalQueryDsl.g:53:1: entryRuleQuerySet : ruleQuerySet EOF ;
    public final void entryRuleQuerySet() throws RecognitionException {
        try {
            // InternalQueryDsl.g:54:1: ( ruleQuerySet EOF )
            // InternalQueryDsl.g:55:1: ruleQuerySet EOF
            {
             before(grammarAccess.getQuerySetRule()); 
            pushFollow(FOLLOW_1);
            ruleQuerySet();

            state._fsp--;

             after(grammarAccess.getQuerySetRule()); 
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
    // $ANTLR end "entryRuleQuerySet"


    // $ANTLR start "ruleQuerySet"
    // InternalQueryDsl.g:62:1: ruleQuerySet : ( ( rule__QuerySet__Group__0 ) ) ;
    public final void ruleQuerySet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:66:2: ( ( ( rule__QuerySet__Group__0 ) ) )
            // InternalQueryDsl.g:67:2: ( ( rule__QuerySet__Group__0 ) )
            {
            // InternalQueryDsl.g:67:2: ( ( rule__QuerySet__Group__0 ) )
            // InternalQueryDsl.g:68:3: ( rule__QuerySet__Group__0 )
            {
             before(grammarAccess.getQuerySetAccess().getGroup()); 
            // InternalQueryDsl.g:69:3: ( rule__QuerySet__Group__0 )
            // InternalQueryDsl.g:69:4: rule__QuerySet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QuerySet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuerySetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQuerySet"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalQueryDsl.g:78:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalQueryDsl.g:79:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalQueryDsl.g:80:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalQueryDsl.g:87:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:91:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalQueryDsl.g:92:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalQueryDsl.g:92:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalQueryDsl.g:93:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalQueryDsl.g:94:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalQueryDsl.g:94:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalQueryDsl.g:103:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalQueryDsl.g:104:1: ( ruleQualifiedName EOF )
            // InternalQueryDsl.g:105:1: ruleQualifiedName EOF
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
    // InternalQueryDsl.g:112:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:116:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalQueryDsl.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalQueryDsl.g:117:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalQueryDsl.g:118:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalQueryDsl.g:119:3: ( rule__QualifiedName__Group__0 )
            // InternalQueryDsl.g:119:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleSelect"
    // InternalQueryDsl.g:128:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalQueryDsl.g:129:1: ( ruleSelect EOF )
            // InternalQueryDsl.g:130:1: ruleSelect EOF
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
    // InternalQueryDsl.g:137:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:141:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalQueryDsl.g:142:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalQueryDsl.g:142:2: ( ( rule__Select__Group__0 ) )
            // InternalQueryDsl.g:143:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalQueryDsl.g:144:3: ( rule__Select__Group__0 )
            // InternalQueryDsl.g:144:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleQueryParam"
    // InternalQueryDsl.g:153:1: entryRuleQueryParam : ruleQueryParam EOF ;
    public final void entryRuleQueryParam() throws RecognitionException {
        try {
            // InternalQueryDsl.g:154:1: ( ruleQueryParam EOF )
            // InternalQueryDsl.g:155:1: ruleQueryParam EOF
            {
             before(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryParam();

            state._fsp--;

             after(grammarAccess.getQueryParamRule()); 
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
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalQueryDsl.g:162:1: ruleQueryParam : ( ( rule__QueryParam__Group__0 ) ) ;
    public final void ruleQueryParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:166:2: ( ( ( rule__QueryParam__Group__0 ) ) )
            // InternalQueryDsl.g:167:2: ( ( rule__QueryParam__Group__0 ) )
            {
            // InternalQueryDsl.g:167:2: ( ( rule__QueryParam__Group__0 ) )
            // InternalQueryDsl.g:168:3: ( rule__QueryParam__Group__0 )
            {
             before(grammarAccess.getQueryParamAccess().getGroup()); 
            // InternalQueryDsl.g:169:3: ( rule__QueryParam__Group__0 )
            // InternalQueryDsl.g:169:4: rule__QueryParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRuleSimpleFrom"
    // InternalQueryDsl.g:178:1: entryRuleSimpleFrom : ruleSimpleFrom EOF ;
    public final void entryRuleSimpleFrom() throws RecognitionException {
        try {
            // InternalQueryDsl.g:179:1: ( ruleSimpleFrom EOF )
            // InternalQueryDsl.g:180:1: ruleSimpleFrom EOF
            {
             before(grammarAccess.getSimpleFromRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleFrom();

            state._fsp--;

             after(grammarAccess.getSimpleFromRule()); 
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
    // $ANTLR end "entryRuleSimpleFrom"


    // $ANTLR start "ruleSimpleFrom"
    // InternalQueryDsl.g:187:1: ruleSimpleFrom : ( ( rule__SimpleFrom__Group__0 ) ) ;
    public final void ruleSimpleFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:191:2: ( ( ( rule__SimpleFrom__Group__0 ) ) )
            // InternalQueryDsl.g:192:2: ( ( rule__SimpleFrom__Group__0 ) )
            {
            // InternalQueryDsl.g:192:2: ( ( rule__SimpleFrom__Group__0 ) )
            // InternalQueryDsl.g:193:3: ( rule__SimpleFrom__Group__0 )
            {
             before(grammarAccess.getSimpleFromAccess().getGroup()); 
            // InternalQueryDsl.g:194:3: ( rule__SimpleFrom__Group__0 )
            // InternalQueryDsl.g:194:4: rule__SimpleFrom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleFrom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleFrom"


    // $ANTLR start "entryRuleCompositeFrom"
    // InternalQueryDsl.g:203:1: entryRuleCompositeFrom : ruleCompositeFrom EOF ;
    public final void entryRuleCompositeFrom() throws RecognitionException {
        try {
            // InternalQueryDsl.g:204:1: ( ruleCompositeFrom EOF )
            // InternalQueryDsl.g:205:1: ruleCompositeFrom EOF
            {
             before(grammarAccess.getCompositeFromRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeFrom();

            state._fsp--;

             after(grammarAccess.getCompositeFromRule()); 
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
    // $ANTLR end "entryRuleCompositeFrom"


    // $ANTLR start "ruleCompositeFrom"
    // InternalQueryDsl.g:212:1: ruleCompositeFrom : ( ( rule__CompositeFrom__Group__0 ) ) ;
    public final void ruleCompositeFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:216:2: ( ( ( rule__CompositeFrom__Group__0 ) ) )
            // InternalQueryDsl.g:217:2: ( ( rule__CompositeFrom__Group__0 ) )
            {
            // InternalQueryDsl.g:217:2: ( ( rule__CompositeFrom__Group__0 ) )
            // InternalQueryDsl.g:218:3: ( rule__CompositeFrom__Group__0 )
            {
             before(grammarAccess.getCompositeFromAccess().getGroup()); 
            // InternalQueryDsl.g:219:3: ( rule__CompositeFrom__Group__0 )
            // InternalQueryDsl.g:219:4: rule__CompositeFrom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFrom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeFromAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeFrom"


    // $ANTLR start "entryRuleCondition"
    // InternalQueryDsl.g:228:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalQueryDsl.g:229:1: ( ruleCondition EOF )
            // InternalQueryDsl.g:230:1: ruleCondition EOF
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
    // InternalQueryDsl.g:237:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:241:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalQueryDsl.g:242:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalQueryDsl.g:242:2: ( ( rule__Condition__Alternatives ) )
            // InternalQueryDsl.g:243:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalQueryDsl.g:244:3: ( rule__Condition__Alternatives )
            // InternalQueryDsl.g:244:4: rule__Condition__Alternatives
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


    // $ANTLR start "entryRuleSimpleCondition"
    // InternalQueryDsl.g:253:1: entryRuleSimpleCondition : ruleSimpleCondition EOF ;
    public final void entryRuleSimpleCondition() throws RecognitionException {
        try {
            // InternalQueryDsl.g:254:1: ( ruleSimpleCondition EOF )
            // InternalQueryDsl.g:255:1: ruleSimpleCondition EOF
            {
             before(grammarAccess.getSimpleConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleCondition();

            state._fsp--;

             after(grammarAccess.getSimpleConditionRule()); 
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
    // $ANTLR end "entryRuleSimpleCondition"


    // $ANTLR start "ruleSimpleCondition"
    // InternalQueryDsl.g:262:1: ruleSimpleCondition : ( ( rule__SimpleCondition__Group__0 ) ) ;
    public final void ruleSimpleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:266:2: ( ( ( rule__SimpleCondition__Group__0 ) ) )
            // InternalQueryDsl.g:267:2: ( ( rule__SimpleCondition__Group__0 ) )
            {
            // InternalQueryDsl.g:267:2: ( ( rule__SimpleCondition__Group__0 ) )
            // InternalQueryDsl.g:268:3: ( rule__SimpleCondition__Group__0 )
            {
             before(grammarAccess.getSimpleConditionAccess().getGroup()); 
            // InternalQueryDsl.g:269:3: ( rule__SimpleCondition__Group__0 )
            // InternalQueryDsl.g:269:4: rule__SimpleCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleCondition"


    // $ANTLR start "entryRulePredicate"
    // InternalQueryDsl.g:278:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // InternalQueryDsl.g:279:1: ( rulePredicate EOF )
            // InternalQueryDsl.g:280:1: rulePredicate EOF
            {
             before(grammarAccess.getPredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getPredicateRule()); 
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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // InternalQueryDsl.g:287:1: rulePredicate : ( ( rule__Predicate__Alternatives ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:291:2: ( ( ( rule__Predicate__Alternatives ) ) )
            // InternalQueryDsl.g:292:2: ( ( rule__Predicate__Alternatives ) )
            {
            // InternalQueryDsl.g:292:2: ( ( rule__Predicate__Alternatives ) )
            // InternalQueryDsl.g:293:3: ( rule__Predicate__Alternatives )
            {
             before(grammarAccess.getPredicateAccess().getAlternatives()); 
            // InternalQueryDsl.g:294:3: ( rule__Predicate__Alternatives )
            // InternalQueryDsl.g:294:4: rule__Predicate__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Predicate__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPredicateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRulePrimitiveValuePredicate"
    // InternalQueryDsl.g:303:1: entryRulePrimitiveValuePredicate : rulePrimitiveValuePredicate EOF ;
    public final void entryRulePrimitiveValuePredicate() throws RecognitionException {
        try {
            // InternalQueryDsl.g:304:1: ( rulePrimitiveValuePredicate EOF )
            // InternalQueryDsl.g:305:1: rulePrimitiveValuePredicate EOF
            {
             before(grammarAccess.getPrimitiveValuePredicateRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveValuePredicate();

            state._fsp--;

             after(grammarAccess.getPrimitiveValuePredicateRule()); 
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
    // $ANTLR end "entryRulePrimitiveValuePredicate"


    // $ANTLR start "rulePrimitiveValuePredicate"
    // InternalQueryDsl.g:312:1: rulePrimitiveValuePredicate : ( ( rule__PrimitiveValuePredicate__Group__0 ) ) ;
    public final void rulePrimitiveValuePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:316:2: ( ( ( rule__PrimitiveValuePredicate__Group__0 ) ) )
            // InternalQueryDsl.g:317:2: ( ( rule__PrimitiveValuePredicate__Group__0 ) )
            {
            // InternalQueryDsl.g:317:2: ( ( rule__PrimitiveValuePredicate__Group__0 ) )
            // InternalQueryDsl.g:318:3: ( rule__PrimitiveValuePredicate__Group__0 )
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getGroup()); 
            // InternalQueryDsl.g:319:3: ( rule__PrimitiveValuePredicate__Group__0 )
            // InternalQueryDsl.g:319:4: rule__PrimitiveValuePredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveValuePredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveValuePredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveValuePredicate"


    // $ANTLR start "entryRuleModelValuePredicate"
    // InternalQueryDsl.g:328:1: entryRuleModelValuePredicate : ruleModelValuePredicate EOF ;
    public final void entryRuleModelValuePredicate() throws RecognitionException {
        try {
            // InternalQueryDsl.g:329:1: ( ruleModelValuePredicate EOF )
            // InternalQueryDsl.g:330:1: ruleModelValuePredicate EOF
            {
             before(grammarAccess.getModelValuePredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleModelValuePredicate();

            state._fsp--;

             after(grammarAccess.getModelValuePredicateRule()); 
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
    // $ANTLR end "entryRuleModelValuePredicate"


    // $ANTLR start "ruleModelValuePredicate"
    // InternalQueryDsl.g:337:1: ruleModelValuePredicate : ( ( rule__ModelValuePredicate__Group__0 ) ) ;
    public final void ruleModelValuePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:341:2: ( ( ( rule__ModelValuePredicate__Group__0 ) ) )
            // InternalQueryDsl.g:342:2: ( ( rule__ModelValuePredicate__Group__0 ) )
            {
            // InternalQueryDsl.g:342:2: ( ( rule__ModelValuePredicate__Group__0 ) )
            // InternalQueryDsl.g:343:3: ( rule__ModelValuePredicate__Group__0 )
            {
             before(grammarAccess.getModelValuePredicateAccess().getGroup()); 
            // InternalQueryDsl.g:344:3: ( rule__ModelValuePredicate__Group__0 )
            // InternalQueryDsl.g:344:4: rule__ModelValuePredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelValuePredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelValuePredicate"


    // $ANTLR start "entryRuleParamValuePredicate"
    // InternalQueryDsl.g:353:1: entryRuleParamValuePredicate : ruleParamValuePredicate EOF ;
    public final void entryRuleParamValuePredicate() throws RecognitionException {
        try {
            // InternalQueryDsl.g:354:1: ( ruleParamValuePredicate EOF )
            // InternalQueryDsl.g:355:1: ruleParamValuePredicate EOF
            {
             before(grammarAccess.getParamValuePredicateRule()); 
            pushFollow(FOLLOW_1);
            ruleParamValuePredicate();

            state._fsp--;

             after(grammarAccess.getParamValuePredicateRule()); 
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
    // $ANTLR end "entryRuleParamValuePredicate"


    // $ANTLR start "ruleParamValuePredicate"
    // InternalQueryDsl.g:362:1: ruleParamValuePredicate : ( ( rule__ParamValuePredicate__Group__0 ) ) ;
    public final void ruleParamValuePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:366:2: ( ( ( rule__ParamValuePredicate__Group__0 ) ) )
            // InternalQueryDsl.g:367:2: ( ( rule__ParamValuePredicate__Group__0 ) )
            {
            // InternalQueryDsl.g:367:2: ( ( rule__ParamValuePredicate__Group__0 ) )
            // InternalQueryDsl.g:368:3: ( rule__ParamValuePredicate__Group__0 )
            {
             before(grammarAccess.getParamValuePredicateAccess().getGroup()); 
            // InternalQueryDsl.g:369:3: ( rule__ParamValuePredicate__Group__0 )
            // InternalQueryDsl.g:369:4: rule__ParamValuePredicate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamValuePredicateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamValuePredicate"


    // $ANTLR start "entryRuleCompositeCondition"
    // InternalQueryDsl.g:378:1: entryRuleCompositeCondition : ruleCompositeCondition EOF ;
    public final void entryRuleCompositeCondition() throws RecognitionException {
        try {
            // InternalQueryDsl.g:379:1: ( ruleCompositeCondition EOF )
            // InternalQueryDsl.g:380:1: ruleCompositeCondition EOF
            {
             before(grammarAccess.getCompositeConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeCondition();

            state._fsp--;

             after(grammarAccess.getCompositeConditionRule()); 
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
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // InternalQueryDsl.g:387:1: ruleCompositeCondition : ( ( rule__CompositeCondition__Group__0 ) ) ;
    public final void ruleCompositeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:391:2: ( ( ( rule__CompositeCondition__Group__0 ) ) )
            // InternalQueryDsl.g:392:2: ( ( rule__CompositeCondition__Group__0 ) )
            {
            // InternalQueryDsl.g:392:2: ( ( rule__CompositeCondition__Group__0 ) )
            // InternalQueryDsl.g:393:3: ( rule__CompositeCondition__Group__0 )
            {
             before(grammarAccess.getCompositeConditionAccess().getGroup()); 
            // InternalQueryDsl.g:394:3: ( rule__CompositeCondition__Group__0 )
            // InternalQueryDsl.g:394:4: rule__CompositeCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleEString"
    // InternalQueryDsl.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalQueryDsl.g:404:1: ( ruleEString EOF )
            // InternalQueryDsl.g:405:1: ruleEString EOF
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
    // InternalQueryDsl.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalQueryDsl.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalQueryDsl.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalQueryDsl.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalQueryDsl.g:419:3: ( rule__EString__Alternatives )
            // InternalQueryDsl.g:419:4: rule__EString__Alternatives
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


    // $ANTLR start "ruleJoinType"
    // InternalQueryDsl.g:428:1: ruleJoinType : ( ( rule__JoinType__Alternatives ) ) ;
    public final void ruleJoinType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:432:1: ( ( ( rule__JoinType__Alternatives ) ) )
            // InternalQueryDsl.g:433:2: ( ( rule__JoinType__Alternatives ) )
            {
            // InternalQueryDsl.g:433:2: ( ( rule__JoinType__Alternatives ) )
            // InternalQueryDsl.g:434:3: ( rule__JoinType__Alternatives )
            {
             before(grammarAccess.getJoinTypeAccess().getAlternatives()); 
            // InternalQueryDsl.g:435:3: ( rule__JoinType__Alternatives )
            // InternalQueryDsl.g:435:4: rule__JoinType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__JoinType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJoinTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoinType"


    // $ANTLR start "ruleComparisonType"
    // InternalQueryDsl.g:444:1: ruleComparisonType : ( ( rule__ComparisonType__Alternatives ) ) ;
    public final void ruleComparisonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:448:1: ( ( ( rule__ComparisonType__Alternatives ) ) )
            // InternalQueryDsl.g:449:2: ( ( rule__ComparisonType__Alternatives ) )
            {
            // InternalQueryDsl.g:449:2: ( ( rule__ComparisonType__Alternatives ) )
            // InternalQueryDsl.g:450:3: ( rule__ComparisonType__Alternatives )
            {
             before(grammarAccess.getComparisonTypeAccess().getAlternatives()); 
            // InternalQueryDsl.g:451:3: ( rule__ComparisonType__Alternatives )
            // InternalQueryDsl.g:451:4: rule__ComparisonType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonType"


    // $ANTLR start "ruleConnectionType"
    // InternalQueryDsl.g:460:1: ruleConnectionType : ( ( rule__ConnectionType__Alternatives ) ) ;
    public final void ruleConnectionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:464:1: ( ( ( rule__ConnectionType__Alternatives ) ) )
            // InternalQueryDsl.g:465:2: ( ( rule__ConnectionType__Alternatives ) )
            {
            // InternalQueryDsl.g:465:2: ( ( rule__ConnectionType__Alternatives ) )
            // InternalQueryDsl.g:466:3: ( rule__ConnectionType__Alternatives )
            {
             before(grammarAccess.getConnectionTypeAccess().getAlternatives()); 
            // InternalQueryDsl.g:467:3: ( rule__ConnectionType__Alternatives )
            // InternalQueryDsl.g:467:4: rule__ConnectionType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConnectionType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConnectionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnectionType"


    // $ANTLR start "ruleType"
    // InternalQueryDsl.g:476:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:480:1: ( ( ( rule__Type__Alternatives ) ) )
            // InternalQueryDsl.g:481:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalQueryDsl.g:481:2: ( ( rule__Type__Alternatives ) )
            // InternalQueryDsl.g:482:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalQueryDsl.g:483:3: ( rule__Type__Alternatives )
            // InternalQueryDsl.g:483:4: rule__Type__Alternatives
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


    // $ANTLR start "rule__Select__Alternatives_5"
    // InternalQueryDsl.g:491:1: rule__Select__Alternatives_5 : ( ( ( rule__Select__SelectAllAssignment_5_0 ) ) | ( ( rule__Select__Group_5_1__0 ) ) );
    public final void rule__Select__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:495:1: ( ( ( rule__Select__SelectAllAssignment_5_0 ) ) | ( ( rule__Select__Group_5_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==46) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQueryDsl.g:496:2: ( ( rule__Select__SelectAllAssignment_5_0 ) )
                    {
                    // InternalQueryDsl.g:496:2: ( ( rule__Select__SelectAllAssignment_5_0 ) )
                    // InternalQueryDsl.g:497:3: ( rule__Select__SelectAllAssignment_5_0 )
                    {
                     before(grammarAccess.getSelectAccess().getSelectAllAssignment_5_0()); 
                    // InternalQueryDsl.g:498:3: ( rule__Select__SelectAllAssignment_5_0 )
                    // InternalQueryDsl.g:498:4: rule__Select__SelectAllAssignment_5_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__SelectAllAssignment_5_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getSelectAllAssignment_5_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:502:2: ( ( rule__Select__Group_5_1__0 ) )
                    {
                    // InternalQueryDsl.g:502:2: ( ( rule__Select__Group_5_1__0 ) )
                    // InternalQueryDsl.g:503:3: ( rule__Select__Group_5_1__0 )
                    {
                     before(grammarAccess.getSelectAccess().getGroup_5_1()); 
                    // InternalQueryDsl.g:504:3: ( rule__Select__Group_5_1__0 )
                    // InternalQueryDsl.g:504:4: rule__Select__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getGroup_5_1()); 

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
    // $ANTLR end "rule__Select__Alternatives_5"


    // $ANTLR start "rule__Select__Alternatives_6_1"
    // InternalQueryDsl.g:512:1: rule__Select__Alternatives_6_1 : ( ( ( rule__Select__Group_6_1_0__0 ) ) | ( ( rule__Select__Group_6_1_1__0 ) ) );
    public final void rule__Select__Alternatives_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:516:1: ( ( ( rule__Select__Group_6_1_0__0 ) ) | ( ( rule__Select__Group_6_1_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalQueryDsl.g:517:2: ( ( rule__Select__Group_6_1_0__0 ) )
                    {
                    // InternalQueryDsl.g:517:2: ( ( rule__Select__Group_6_1_0__0 ) )
                    // InternalQueryDsl.g:518:3: ( rule__Select__Group_6_1_0__0 )
                    {
                     before(grammarAccess.getSelectAccess().getGroup_6_1_0()); 
                    // InternalQueryDsl.g:519:3: ( rule__Select__Group_6_1_0__0 )
                    // InternalQueryDsl.g:519:4: rule__Select__Group_6_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_6_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getGroup_6_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:523:2: ( ( rule__Select__Group_6_1_1__0 ) )
                    {
                    // InternalQueryDsl.g:523:2: ( ( rule__Select__Group_6_1_1__0 ) )
                    // InternalQueryDsl.g:524:3: ( rule__Select__Group_6_1_1__0 )
                    {
                     before(grammarAccess.getSelectAccess().getGroup_6_1_1()); 
                    // InternalQueryDsl.g:525:3: ( rule__Select__Group_6_1_1__0 )
                    // InternalQueryDsl.g:525:4: rule__Select__Group_6_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_6_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectAccess().getGroup_6_1_1()); 

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
    // $ANTLR end "rule__Select__Alternatives_6_1"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalQueryDsl.g:533:1: rule__Condition__Alternatives : ( ( ruleSimpleCondition ) | ( ruleCompositeCondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:537:1: ( ( ruleSimpleCondition ) | ( ruleCompositeCondition ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalQueryDsl.g:538:2: ( ruleSimpleCondition )
                    {
                    // InternalQueryDsl.g:538:2: ( ruleSimpleCondition )
                    // InternalQueryDsl.g:539:3: ruleSimpleCondition
                    {
                     before(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getSimpleConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:544:2: ( ruleCompositeCondition )
                    {
                    // InternalQueryDsl.g:544:2: ( ruleCompositeCondition )
                    // InternalQueryDsl.g:545:3: ruleCompositeCondition
                    {
                     before(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeCondition();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1()); 

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


    // $ANTLR start "rule__Predicate__Alternatives"
    // InternalQueryDsl.g:554:1: rule__Predicate__Alternatives : ( ( rulePrimitiveValuePredicate ) | ( ruleModelValuePredicate ) | ( ruleParamValuePredicate ) );
    public final void rule__Predicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:558:1: ( ( rulePrimitiveValuePredicate ) | ( ruleModelValuePredicate ) | ( ruleParamValuePredicate ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalQueryDsl.g:559:2: ( rulePrimitiveValuePredicate )
                    {
                    // InternalQueryDsl.g:559:2: ( rulePrimitiveValuePredicate )
                    // InternalQueryDsl.g:560:3: rulePrimitiveValuePredicate
                    {
                     before(grammarAccess.getPredicateAccess().getPrimitiveValuePredicateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveValuePredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getPrimitiveValuePredicateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:565:2: ( ruleModelValuePredicate )
                    {
                    // InternalQueryDsl.g:565:2: ( ruleModelValuePredicate )
                    // InternalQueryDsl.g:566:3: ruleModelValuePredicate
                    {
                     before(grammarAccess.getPredicateAccess().getModelValuePredicateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleModelValuePredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getModelValuePredicateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:571:2: ( ruleParamValuePredicate )
                    {
                    // InternalQueryDsl.g:571:2: ( ruleParamValuePredicate )
                    // InternalQueryDsl.g:572:3: ruleParamValuePredicate
                    {
                     before(grammarAccess.getPredicateAccess().getParamValuePredicateParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleParamValuePredicate();

                    state._fsp--;

                     after(grammarAccess.getPredicateAccess().getParamValuePredicateParserRuleCall_2()); 

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
    // $ANTLR end "rule__Predicate__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalQueryDsl.g:581:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:585:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalQueryDsl.g:586:2: ( RULE_STRING )
                    {
                    // InternalQueryDsl.g:586:2: ( RULE_STRING )
                    // InternalQueryDsl.g:587:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:592:2: ( RULE_ID )
                    {
                    // InternalQueryDsl.g:592:2: ( RULE_ID )
                    // InternalQueryDsl.g:593:3: RULE_ID
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


    // $ANTLR start "rule__JoinType__Alternatives"
    // InternalQueryDsl.g:602:1: rule__JoinType__Alternatives : ( ( ( 'join' ) ) | ( ( 'left-join' ) ) | ( ( 'right-join' ) ) | ( ( 'outer-join' ) ) | ( ( 'left-outer-join' ) ) | ( ( 'right-outer-join' ) ) );
    public final void rule__JoinType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:606:1: ( ( ( 'join' ) ) | ( ( 'left-join' ) ) | ( ( 'right-join' ) ) | ( ( 'outer-join' ) ) | ( ( 'left-outer-join' ) ) | ( ( 'right-outer-join' ) ) )
            int alt6=6;
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
            case 14:
                {
                alt6=4;
                }
                break;
            case 15:
                {
                alt6=5;
                }
                break;
            case 16:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQueryDsl.g:607:2: ( ( 'join' ) )
                    {
                    // InternalQueryDsl.g:607:2: ( ( 'join' ) )
                    // InternalQueryDsl.g:608:3: ( 'join' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getInnerEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:609:3: ( 'join' )
                    // InternalQueryDsl.g:609:4: 'join'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getInnerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:613:2: ( ( 'left-join' ) )
                    {
                    // InternalQueryDsl.g:613:2: ( ( 'left-join' ) )
                    // InternalQueryDsl.g:614:3: ( 'left-join' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLeftEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:615:3: ( 'left-join' )
                    // InternalQueryDsl.g:615:4: 'left-join'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLeftEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:619:2: ( ( 'right-join' ) )
                    {
                    // InternalQueryDsl.g:619:2: ( ( 'right-join' ) )
                    // InternalQueryDsl.g:620:3: ( 'right-join' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getRightEnumLiteralDeclaration_2()); 
                    // InternalQueryDsl.g:621:3: ( 'right-join' )
                    // InternalQueryDsl.g:621:4: 'right-join'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getRightEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:625:2: ( ( 'outer-join' ) )
                    {
                    // InternalQueryDsl.g:625:2: ( ( 'outer-join' ) )
                    // InternalQueryDsl.g:626:3: ( 'outer-join' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getOuterEnumLiteralDeclaration_3()); 
                    // InternalQueryDsl.g:627:3: ( 'outer-join' )
                    // InternalQueryDsl.g:627:4: 'outer-join'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getOuterEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:631:2: ( ( 'left-outer-join' ) )
                    {
                    // InternalQueryDsl.g:631:2: ( ( 'left-outer-join' ) )
                    // InternalQueryDsl.g:632:3: ( 'left-outer-join' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getLeftouterEnumLiteralDeclaration_4()); 
                    // InternalQueryDsl.g:633:3: ( 'left-outer-join' )
                    // InternalQueryDsl.g:633:4: 'left-outer-join'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getLeftouterEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:637:2: ( ( 'right-outer-join' ) )
                    {
                    // InternalQueryDsl.g:637:2: ( ( 'right-outer-join' ) )
                    // InternalQueryDsl.g:638:3: ( 'right-outer-join' )
                    {
                     before(grammarAccess.getJoinTypeAccess().getRightouterEnumLiteralDeclaration_5()); 
                    // InternalQueryDsl.g:639:3: ( 'right-outer-join' )
                    // InternalQueryDsl.g:639:4: 'right-outer-join'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getJoinTypeAccess().getRightouterEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__JoinType__Alternatives"


    // $ANTLR start "rule__ComparisonType__Alternatives"
    // InternalQueryDsl.g:647:1: rule__ComparisonType__Alternatives : ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) );
    public final void rule__ComparisonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:651:1: ( ( ( '=' ) ) | ( ( '!=' ) ) | ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>' ) ) | ( ( '>=' ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            case 20:
                {
                alt7=4;
                }
                break;
            case 21:
                {
                alt7=5;
                }
                break;
            case 22:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQueryDsl.g:652:2: ( ( '=' ) )
                    {
                    // InternalQueryDsl.g:652:2: ( ( '=' ) )
                    // InternalQueryDsl.g:653:3: ( '=' )
                    {
                     before(grammarAccess.getComparisonTypeAccess().getEqualEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:654:3: ( '=' )
                    // InternalQueryDsl.g:654:4: '='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonTypeAccess().getEqualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:658:2: ( ( '!=' ) )
                    {
                    // InternalQueryDsl.g:658:2: ( ( '!=' ) )
                    // InternalQueryDsl.g:659:3: ( '!=' )
                    {
                     before(grammarAccess.getComparisonTypeAccess().getNotequalEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:660:3: ( '!=' )
                    // InternalQueryDsl.g:660:4: '!='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonTypeAccess().getNotequalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:664:2: ( ( '<' ) )
                    {
                    // InternalQueryDsl.g:664:2: ( ( '<' ) )
                    // InternalQueryDsl.g:665:3: ( '<' )
                    {
                     before(grammarAccess.getComparisonTypeAccess().getLessthanEnumLiteralDeclaration_2()); 
                    // InternalQueryDsl.g:666:3: ( '<' )
                    // InternalQueryDsl.g:666:4: '<'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonTypeAccess().getLessthanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:670:2: ( ( '<=' ) )
                    {
                    // InternalQueryDsl.g:670:2: ( ( '<=' ) )
                    // InternalQueryDsl.g:671:3: ( '<=' )
                    {
                     before(grammarAccess.getComparisonTypeAccess().getLessthanorequalEnumLiteralDeclaration_3()); 
                    // InternalQueryDsl.g:672:3: ( '<=' )
                    // InternalQueryDsl.g:672:4: '<='
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonTypeAccess().getLessthanorequalEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:676:2: ( ( '>' ) )
                    {
                    // InternalQueryDsl.g:676:2: ( ( '>' ) )
                    // InternalQueryDsl.g:677:3: ( '>' )
                    {
                     before(grammarAccess.getComparisonTypeAccess().getGreaterthanEnumLiteralDeclaration_4()); 
                    // InternalQueryDsl.g:678:3: ( '>' )
                    // InternalQueryDsl.g:678:4: '>'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonTypeAccess().getGreaterthanEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:682:2: ( ( '>=' ) )
                    {
                    // InternalQueryDsl.g:682:2: ( ( '>=' ) )
                    // InternalQueryDsl.g:683:3: ( '>=' )
                    {
                     before(grammarAccess.getComparisonTypeAccess().getGreaterthanorequalEnumLiteralDeclaration_5()); 
                    // InternalQueryDsl.g:684:3: ( '>=' )
                    // InternalQueryDsl.g:684:4: '>='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getComparisonTypeAccess().getGreaterthanorequalEnumLiteralDeclaration_5()); 

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
    // $ANTLR end "rule__ComparisonType__Alternatives"


    // $ANTLR start "rule__ConnectionType__Alternatives"
    // InternalQueryDsl.g:692:1: rule__ConnectionType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__ConnectionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:696:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            else if ( (LA8_0==24) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalQueryDsl.g:697:2: ( ( 'and' ) )
                    {
                    // InternalQueryDsl.g:697:2: ( ( 'and' ) )
                    // InternalQueryDsl.g:698:3: ( 'and' )
                    {
                     before(grammarAccess.getConnectionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:699:3: ( 'and' )
                    // InternalQueryDsl.g:699:4: 'and'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getConnectionTypeAccess().getAndEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:703:2: ( ( 'or' ) )
                    {
                    // InternalQueryDsl.g:703:2: ( ( 'or' ) )
                    // InternalQueryDsl.g:704:3: ( 'or' )
                    {
                     before(grammarAccess.getConnectionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:705:3: ( 'or' )
                    // InternalQueryDsl.g:705:4: 'or'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getConnectionTypeAccess().getOrEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ConnectionType__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalQueryDsl.g:713:1: rule__Type__Alternatives : ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:717:1: ( ( ( 'String' ) ) | ( ( 'Int' ) ) | ( ( 'Boolean' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt9=1;
                }
                break;
            case 26:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            case 28:
                {
                alt9=4;
                }
                break;
            case 29:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalQueryDsl.g:718:2: ( ( 'String' ) )
                    {
                    // InternalQueryDsl.g:718:2: ( ( 'String' ) )
                    // InternalQueryDsl.g:719:3: ( 'String' )
                    {
                     before(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:720:3: ( 'String' )
                    // InternalQueryDsl.g:720:4: 'String'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:724:2: ( ( 'Int' ) )
                    {
                    // InternalQueryDsl.g:724:2: ( ( 'Int' ) )
                    // InternalQueryDsl.g:725:3: ( 'Int' )
                    {
                     before(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:726:3: ( 'Int' )
                    // InternalQueryDsl.g:726:4: 'Int'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:730:2: ( ( 'Boolean' ) )
                    {
                    // InternalQueryDsl.g:730:2: ( ( 'Boolean' ) )
                    // InternalQueryDsl.g:731:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalQueryDsl.g:732:3: ( 'Boolean' )
                    // InternalQueryDsl.g:732:4: 'Boolean'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:736:2: ( ( 'Float' ) )
                    {
                    // InternalQueryDsl.g:736:2: ( ( 'Float' ) )
                    // InternalQueryDsl.g:737:3: ( 'Float' )
                    {
                     before(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 
                    // InternalQueryDsl.g:738:3: ( 'Float' )
                    // InternalQueryDsl.g:738:4: 'Float'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeAccess().getFloatEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:742:2: ( ( 'Double' ) )
                    {
                    // InternalQueryDsl.g:742:2: ( ( 'Double' ) )
                    // InternalQueryDsl.g:743:3: ( 'Double' )
                    {
                     before(grammarAccess.getTypeAccess().getDoubleEnumLiteralDeclaration_4()); 
                    // InternalQueryDsl.g:744:3: ( 'Double' )
                    // InternalQueryDsl.g:744:4: 'Double'
                    {
                    match(input,29,FOLLOW_2); 

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


    // $ANTLR start "rule__QuerySet__Group__0"
    // InternalQueryDsl.g:752:1: rule__QuerySet__Group__0 : rule__QuerySet__Group__0__Impl rule__QuerySet__Group__1 ;
    public final void rule__QuerySet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:756:1: ( rule__QuerySet__Group__0__Impl rule__QuerySet__Group__1 )
            // InternalQueryDsl.g:757:2: rule__QuerySet__Group__0__Impl rule__QuerySet__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__QuerySet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__0"


    // $ANTLR start "rule__QuerySet__Group__0__Impl"
    // InternalQueryDsl.g:764:1: rule__QuerySet__Group__0__Impl : ( () ) ;
    public final void rule__QuerySet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:768:1: ( ( () ) )
            // InternalQueryDsl.g:769:1: ( () )
            {
            // InternalQueryDsl.g:769:1: ( () )
            // InternalQueryDsl.g:770:2: ()
            {
             before(grammarAccess.getQuerySetAccess().getQuerySetAction_0()); 
            // InternalQueryDsl.g:771:2: ()
            // InternalQueryDsl.g:771:3: 
            {
            }

             after(grammarAccess.getQuerySetAccess().getQuerySetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__0__Impl"


    // $ANTLR start "rule__QuerySet__Group__1"
    // InternalQueryDsl.g:779:1: rule__QuerySet__Group__1 : rule__QuerySet__Group__1__Impl rule__QuerySet__Group__2 ;
    public final void rule__QuerySet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:783:1: ( rule__QuerySet__Group__1__Impl rule__QuerySet__Group__2 )
            // InternalQueryDsl.g:784:2: rule__QuerySet__Group__1__Impl rule__QuerySet__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__QuerySet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__1"


    // $ANTLR start "rule__QuerySet__Group__1__Impl"
    // InternalQueryDsl.g:791:1: rule__QuerySet__Group__1__Impl : ( 'query-set' ) ;
    public final void rule__QuerySet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:795:1: ( ( 'query-set' ) )
            // InternalQueryDsl.g:796:1: ( 'query-set' )
            {
            // InternalQueryDsl.g:796:1: ( 'query-set' )
            // InternalQueryDsl.g:797:2: 'query-set'
            {
             before(grammarAccess.getQuerySetAccess().getQuerySetKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQuerySetAccess().getQuerySetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__1__Impl"


    // $ANTLR start "rule__QuerySet__Group__2"
    // InternalQueryDsl.g:806:1: rule__QuerySet__Group__2 : rule__QuerySet__Group__2__Impl rule__QuerySet__Group__3 ;
    public final void rule__QuerySet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:810:1: ( rule__QuerySet__Group__2__Impl rule__QuerySet__Group__3 )
            // InternalQueryDsl.g:811:2: rule__QuerySet__Group__2__Impl rule__QuerySet__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__QuerySet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__2"


    // $ANTLR start "rule__QuerySet__Group__2__Impl"
    // InternalQueryDsl.g:818:1: rule__QuerySet__Group__2__Impl : ( ( rule__QuerySet__NameAssignment_2 ) ) ;
    public final void rule__QuerySet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:822:1: ( ( ( rule__QuerySet__NameAssignment_2 ) ) )
            // InternalQueryDsl.g:823:1: ( ( rule__QuerySet__NameAssignment_2 ) )
            {
            // InternalQueryDsl.g:823:1: ( ( rule__QuerySet__NameAssignment_2 ) )
            // InternalQueryDsl.g:824:2: ( rule__QuerySet__NameAssignment_2 )
            {
             before(grammarAccess.getQuerySetAccess().getNameAssignment_2()); 
            // InternalQueryDsl.g:825:2: ( rule__QuerySet__NameAssignment_2 )
            // InternalQueryDsl.g:825:3: rule__QuerySet__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QuerySet__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQuerySetAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__2__Impl"


    // $ANTLR start "rule__QuerySet__Group__3"
    // InternalQueryDsl.g:833:1: rule__QuerySet__Group__3 : rule__QuerySet__Group__3__Impl rule__QuerySet__Group__4 ;
    public final void rule__QuerySet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:837:1: ( rule__QuerySet__Group__3__Impl rule__QuerySet__Group__4 )
            // InternalQueryDsl.g:838:2: rule__QuerySet__Group__3__Impl rule__QuerySet__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__QuerySet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__3"


    // $ANTLR start "rule__QuerySet__Group__3__Impl"
    // InternalQueryDsl.g:845:1: rule__QuerySet__Group__3__Impl : ( '{' ) ;
    public final void rule__QuerySet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:849:1: ( ( '{' ) )
            // InternalQueryDsl.g:850:1: ( '{' )
            {
            // InternalQueryDsl.g:850:1: ( '{' )
            // InternalQueryDsl.g:851:2: '{'
            {
             before(grammarAccess.getQuerySetAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getQuerySetAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__3__Impl"


    // $ANTLR start "rule__QuerySet__Group__4"
    // InternalQueryDsl.g:860:1: rule__QuerySet__Group__4 : rule__QuerySet__Group__4__Impl rule__QuerySet__Group__5 ;
    public final void rule__QuerySet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:864:1: ( rule__QuerySet__Group__4__Impl rule__QuerySet__Group__5 )
            // InternalQueryDsl.g:865:2: rule__QuerySet__Group__4__Impl rule__QuerySet__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__QuerySet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__4"


    // $ANTLR start "rule__QuerySet__Group__4__Impl"
    // InternalQueryDsl.g:872:1: rule__QuerySet__Group__4__Impl : ( ( rule__QuerySet__Group_4__0 )? ) ;
    public final void rule__QuerySet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:876:1: ( ( ( rule__QuerySet__Group_4__0 )? ) )
            // InternalQueryDsl.g:877:1: ( ( rule__QuerySet__Group_4__0 )? )
            {
            // InternalQueryDsl.g:877:1: ( ( rule__QuerySet__Group_4__0 )? )
            // InternalQueryDsl.g:878:2: ( rule__QuerySet__Group_4__0 )?
            {
             before(grammarAccess.getQuerySetAccess().getGroup_4()); 
            // InternalQueryDsl.g:879:2: ( rule__QuerySet__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalQueryDsl.g:879:3: rule__QuerySet__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuerySet__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuerySetAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__4__Impl"


    // $ANTLR start "rule__QuerySet__Group__5"
    // InternalQueryDsl.g:887:1: rule__QuerySet__Group__5 : rule__QuerySet__Group__5__Impl rule__QuerySet__Group__6 ;
    public final void rule__QuerySet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:891:1: ( rule__QuerySet__Group__5__Impl rule__QuerySet__Group__6 )
            // InternalQueryDsl.g:892:2: rule__QuerySet__Group__5__Impl rule__QuerySet__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__QuerySet__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__5"


    // $ANTLR start "rule__QuerySet__Group__5__Impl"
    // InternalQueryDsl.g:899:1: rule__QuerySet__Group__5__Impl : ( ( rule__QuerySet__Group_5__0 )? ) ;
    public final void rule__QuerySet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:903:1: ( ( ( rule__QuerySet__Group_5__0 )? ) )
            // InternalQueryDsl.g:904:1: ( ( rule__QuerySet__Group_5__0 )? )
            {
            // InternalQueryDsl.g:904:1: ( ( rule__QuerySet__Group_5__0 )? )
            // InternalQueryDsl.g:905:2: ( rule__QuerySet__Group_5__0 )?
            {
             before(grammarAccess.getQuerySetAccess().getGroup_5()); 
            // InternalQueryDsl.g:906:2: ( rule__QuerySet__Group_5__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalQueryDsl.g:906:3: rule__QuerySet__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QuerySet__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuerySetAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__5__Impl"


    // $ANTLR start "rule__QuerySet__Group__6"
    // InternalQueryDsl.g:914:1: rule__QuerySet__Group__6 : rule__QuerySet__Group__6__Impl ;
    public final void rule__QuerySet__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:918:1: ( rule__QuerySet__Group__6__Impl )
            // InternalQueryDsl.g:919:2: rule__QuerySet__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuerySet__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__6"


    // $ANTLR start "rule__QuerySet__Group__6__Impl"
    // InternalQueryDsl.g:925:1: rule__QuerySet__Group__6__Impl : ( '}' ) ;
    public final void rule__QuerySet__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:929:1: ( ( '}' ) )
            // InternalQueryDsl.g:930:1: ( '}' )
            {
            // InternalQueryDsl.g:930:1: ( '}' )
            // InternalQueryDsl.g:931:2: '}'
            {
             before(grammarAccess.getQuerySetAccess().getRightCurlyBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getQuerySetAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group__6__Impl"


    // $ANTLR start "rule__QuerySet__Group_4__0"
    // InternalQueryDsl.g:941:1: rule__QuerySet__Group_4__0 : rule__QuerySet__Group_4__0__Impl rule__QuerySet__Group_4__1 ;
    public final void rule__QuerySet__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:945:1: ( rule__QuerySet__Group_4__0__Impl rule__QuerySet__Group_4__1 )
            // InternalQueryDsl.g:946:2: rule__QuerySet__Group_4__0__Impl rule__QuerySet__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__QuerySet__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4__0"


    // $ANTLR start "rule__QuerySet__Group_4__0__Impl"
    // InternalQueryDsl.g:953:1: rule__QuerySet__Group_4__0__Impl : ( 'import' ) ;
    public final void rule__QuerySet__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:957:1: ( ( 'import' ) )
            // InternalQueryDsl.g:958:1: ( 'import' )
            {
            // InternalQueryDsl.g:958:1: ( 'import' )
            // InternalQueryDsl.g:959:2: 'import'
            {
             before(grammarAccess.getQuerySetAccess().getImportKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQuerySetAccess().getImportKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4__0__Impl"


    // $ANTLR start "rule__QuerySet__Group_4__1"
    // InternalQueryDsl.g:968:1: rule__QuerySet__Group_4__1 : rule__QuerySet__Group_4__1__Impl rule__QuerySet__Group_4__2 ;
    public final void rule__QuerySet__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:972:1: ( rule__QuerySet__Group_4__1__Impl rule__QuerySet__Group_4__2 )
            // InternalQueryDsl.g:973:2: rule__QuerySet__Group_4__1__Impl rule__QuerySet__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__QuerySet__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4__1"


    // $ANTLR start "rule__QuerySet__Group_4__1__Impl"
    // InternalQueryDsl.g:980:1: rule__QuerySet__Group_4__1__Impl : ( ( rule__QuerySet__ImportedNamespaceAssignment_4_1 ) ) ;
    public final void rule__QuerySet__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:984:1: ( ( ( rule__QuerySet__ImportedNamespaceAssignment_4_1 ) ) )
            // InternalQueryDsl.g:985:1: ( ( rule__QuerySet__ImportedNamespaceAssignment_4_1 ) )
            {
            // InternalQueryDsl.g:985:1: ( ( rule__QuerySet__ImportedNamespaceAssignment_4_1 ) )
            // InternalQueryDsl.g:986:2: ( rule__QuerySet__ImportedNamespaceAssignment_4_1 )
            {
             before(grammarAccess.getQuerySetAccess().getImportedNamespaceAssignment_4_1()); 
            // InternalQueryDsl.g:987:2: ( rule__QuerySet__ImportedNamespaceAssignment_4_1 )
            // InternalQueryDsl.g:987:3: rule__QuerySet__ImportedNamespaceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__QuerySet__ImportedNamespaceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuerySetAccess().getImportedNamespaceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4__1__Impl"


    // $ANTLR start "rule__QuerySet__Group_4__2"
    // InternalQueryDsl.g:995:1: rule__QuerySet__Group_4__2 : rule__QuerySet__Group_4__2__Impl ;
    public final void rule__QuerySet__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:999:1: ( rule__QuerySet__Group_4__2__Impl )
            // InternalQueryDsl.g:1000:2: rule__QuerySet__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuerySet__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4__2"


    // $ANTLR start "rule__QuerySet__Group_4__2__Impl"
    // InternalQueryDsl.g:1006:1: rule__QuerySet__Group_4__2__Impl : ( ( rule__QuerySet__Group_4_2__0 )* ) ;
    public final void rule__QuerySet__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1010:1: ( ( ( rule__QuerySet__Group_4_2__0 )* ) )
            // InternalQueryDsl.g:1011:1: ( ( rule__QuerySet__Group_4_2__0 )* )
            {
            // InternalQueryDsl.g:1011:1: ( ( rule__QuerySet__Group_4_2__0 )* )
            // InternalQueryDsl.g:1012:2: ( rule__QuerySet__Group_4_2__0 )*
            {
             before(grammarAccess.getQuerySetAccess().getGroup_4_2()); 
            // InternalQueryDsl.g:1013:2: ( rule__QuerySet__Group_4_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==33) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalQueryDsl.g:1013:3: rule__QuerySet__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QuerySet__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQuerySetAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4__2__Impl"


    // $ANTLR start "rule__QuerySet__Group_4_2__0"
    // InternalQueryDsl.g:1022:1: rule__QuerySet__Group_4_2__0 : rule__QuerySet__Group_4_2__0__Impl rule__QuerySet__Group_4_2__1 ;
    public final void rule__QuerySet__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1026:1: ( rule__QuerySet__Group_4_2__0__Impl rule__QuerySet__Group_4_2__1 )
            // InternalQueryDsl.g:1027:2: rule__QuerySet__Group_4_2__0__Impl rule__QuerySet__Group_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__QuerySet__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4_2__0"


    // $ANTLR start "rule__QuerySet__Group_4_2__0__Impl"
    // InternalQueryDsl.g:1034:1: rule__QuerySet__Group_4_2__0__Impl : ( 'import' ) ;
    public final void rule__QuerySet__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1038:1: ( ( 'import' ) )
            // InternalQueryDsl.g:1039:1: ( 'import' )
            {
            // InternalQueryDsl.g:1039:1: ( 'import' )
            // InternalQueryDsl.g:1040:2: 'import'
            {
             before(grammarAccess.getQuerySetAccess().getImportKeyword_4_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getQuerySetAccess().getImportKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4_2__0__Impl"


    // $ANTLR start "rule__QuerySet__Group_4_2__1"
    // InternalQueryDsl.g:1049:1: rule__QuerySet__Group_4_2__1 : rule__QuerySet__Group_4_2__1__Impl ;
    public final void rule__QuerySet__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1053:1: ( rule__QuerySet__Group_4_2__1__Impl )
            // InternalQueryDsl.g:1054:2: rule__QuerySet__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuerySet__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4_2__1"


    // $ANTLR start "rule__QuerySet__Group_4_2__1__Impl"
    // InternalQueryDsl.g:1060:1: rule__QuerySet__Group_4_2__1__Impl : ( ( rule__QuerySet__ImportedNamespaceAssignment_4_2_1 ) ) ;
    public final void rule__QuerySet__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1064:1: ( ( ( rule__QuerySet__ImportedNamespaceAssignment_4_2_1 ) ) )
            // InternalQueryDsl.g:1065:1: ( ( rule__QuerySet__ImportedNamespaceAssignment_4_2_1 ) )
            {
            // InternalQueryDsl.g:1065:1: ( ( rule__QuerySet__ImportedNamespaceAssignment_4_2_1 ) )
            // InternalQueryDsl.g:1066:2: ( rule__QuerySet__ImportedNamespaceAssignment_4_2_1 )
            {
             before(grammarAccess.getQuerySetAccess().getImportedNamespaceAssignment_4_2_1()); 
            // InternalQueryDsl.g:1067:2: ( rule__QuerySet__ImportedNamespaceAssignment_4_2_1 )
            // InternalQueryDsl.g:1067:3: rule__QuerySet__ImportedNamespaceAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__QuerySet__ImportedNamespaceAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getQuerySetAccess().getImportedNamespaceAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_4_2__1__Impl"


    // $ANTLR start "rule__QuerySet__Group_5__0"
    // InternalQueryDsl.g:1076:1: rule__QuerySet__Group_5__0 : rule__QuerySet__Group_5__0__Impl rule__QuerySet__Group_5__1 ;
    public final void rule__QuerySet__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1080:1: ( rule__QuerySet__Group_5__0__Impl rule__QuerySet__Group_5__1 )
            // InternalQueryDsl.g:1081:2: rule__QuerySet__Group_5__0__Impl rule__QuerySet__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__QuerySet__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QuerySet__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_5__0"


    // $ANTLR start "rule__QuerySet__Group_5__0__Impl"
    // InternalQueryDsl.g:1088:1: rule__QuerySet__Group_5__0__Impl : ( ( rule__QuerySet__QueriesAssignment_5_0 ) ) ;
    public final void rule__QuerySet__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1092:1: ( ( ( rule__QuerySet__QueriesAssignment_5_0 ) ) )
            // InternalQueryDsl.g:1093:1: ( ( rule__QuerySet__QueriesAssignment_5_0 ) )
            {
            // InternalQueryDsl.g:1093:1: ( ( rule__QuerySet__QueriesAssignment_5_0 ) )
            // InternalQueryDsl.g:1094:2: ( rule__QuerySet__QueriesAssignment_5_0 )
            {
             before(grammarAccess.getQuerySetAccess().getQueriesAssignment_5_0()); 
            // InternalQueryDsl.g:1095:2: ( rule__QuerySet__QueriesAssignment_5_0 )
            // InternalQueryDsl.g:1095:3: rule__QuerySet__QueriesAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__QuerySet__QueriesAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getQuerySetAccess().getQueriesAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_5__0__Impl"


    // $ANTLR start "rule__QuerySet__Group_5__1"
    // InternalQueryDsl.g:1103:1: rule__QuerySet__Group_5__1 : rule__QuerySet__Group_5__1__Impl ;
    public final void rule__QuerySet__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1107:1: ( rule__QuerySet__Group_5__1__Impl )
            // InternalQueryDsl.g:1108:2: rule__QuerySet__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QuerySet__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_5__1"


    // $ANTLR start "rule__QuerySet__Group_5__1__Impl"
    // InternalQueryDsl.g:1114:1: rule__QuerySet__Group_5__1__Impl : ( ( rule__QuerySet__QueriesAssignment_5_1 )* ) ;
    public final void rule__QuerySet__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1118:1: ( ( ( rule__QuerySet__QueriesAssignment_5_1 )* ) )
            // InternalQueryDsl.g:1119:1: ( ( rule__QuerySet__QueriesAssignment_5_1 )* )
            {
            // InternalQueryDsl.g:1119:1: ( ( rule__QuerySet__QueriesAssignment_5_1 )* )
            // InternalQueryDsl.g:1120:2: ( rule__QuerySet__QueriesAssignment_5_1 )*
            {
             before(grammarAccess.getQuerySetAccess().getQueriesAssignment_5_1()); 
            // InternalQueryDsl.g:1121:2: ( rule__QuerySet__QueriesAssignment_5_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalQueryDsl.g:1121:3: rule__QuerySet__QueriesAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QuerySet__QueriesAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getQuerySetAccess().getQueriesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__Group_5__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalQueryDsl.g:1130:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1134:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalQueryDsl.g:1135:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalQueryDsl.g:1142:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1146:1: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:1147:1: ( ruleQualifiedName )
            {
            // InternalQueryDsl.g:1147:1: ( ruleQualifiedName )
            // InternalQueryDsl.g:1148:2: ruleQualifiedName
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
    // InternalQueryDsl.g:1157:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1161:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalQueryDsl.g:1162:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalQueryDsl.g:1168:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1172:1: ( ( ( '.*' )? ) )
            // InternalQueryDsl.g:1173:1: ( ( '.*' )? )
            {
            // InternalQueryDsl.g:1173:1: ( ( '.*' )? )
            // InternalQueryDsl.g:1174:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalQueryDsl.g:1175:2: ( '.*' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalQueryDsl.g:1175:3: '.*'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalQueryDsl.g:1184:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1188:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalQueryDsl.g:1189:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalQueryDsl.g:1196:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1200:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:1201:1: ( RULE_ID )
            {
            // InternalQueryDsl.g:1201:1: ( RULE_ID )
            // InternalQueryDsl.g:1202:2: RULE_ID
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
    // InternalQueryDsl.g:1211:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1215:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalQueryDsl.g:1216:2: rule__QualifiedName__Group__1__Impl
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
    // InternalQueryDsl.g:1222:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1226:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalQueryDsl.g:1227:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalQueryDsl.g:1227:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalQueryDsl.g:1228:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalQueryDsl.g:1229:2: ( rule__QualifiedName__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==35) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQueryDsl.g:1229:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
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
    // InternalQueryDsl.g:1238:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1242:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalQueryDsl.g:1243:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalQueryDsl.g:1250:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1254:1: ( ( '.' ) )
            // InternalQueryDsl.g:1255:1: ( '.' )
            {
            // InternalQueryDsl.g:1255:1: ( '.' )
            // InternalQueryDsl.g:1256:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalQueryDsl.g:1265:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1269:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalQueryDsl.g:1270:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalQueryDsl.g:1276:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1280:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:1281:1: ( RULE_ID )
            {
            // InternalQueryDsl.g:1281:1: ( RULE_ID )
            // InternalQueryDsl.g:1282:2: RULE_ID
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


    // $ANTLR start "rule__Select__Group__0"
    // InternalQueryDsl.g:1292:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1296:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalQueryDsl.g:1297:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalQueryDsl.g:1304:1: rule__Select__Group__0__Impl : ( () ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1308:1: ( ( () ) )
            // InternalQueryDsl.g:1309:1: ( () )
            {
            // InternalQueryDsl.g:1309:1: ( () )
            // InternalQueryDsl.g:1310:2: ()
            {
             before(grammarAccess.getSelectAccess().getSelectAction_0()); 
            // InternalQueryDsl.g:1311:2: ()
            // InternalQueryDsl.g:1311:3: 
            {
            }

             after(grammarAccess.getSelectAccess().getSelectAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalQueryDsl.g:1319:1: rule__Select__Group__1 : rule__Select__Group__1__Impl rule__Select__Group__2 ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1323:1: ( rule__Select__Group__1__Impl rule__Select__Group__2 )
            // InternalQueryDsl.g:1324:2: rule__Select__Group__1__Impl rule__Select__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Select__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalQueryDsl.g:1331:1: rule__Select__Group__1__Impl : ( ( rule__Select__NameAssignment_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1335:1: ( ( ( rule__Select__NameAssignment_1 ) ) )
            // InternalQueryDsl.g:1336:1: ( ( rule__Select__NameAssignment_1 ) )
            {
            // InternalQueryDsl.g:1336:1: ( ( rule__Select__NameAssignment_1 ) )
            // InternalQueryDsl.g:1337:2: ( rule__Select__NameAssignment_1 )
            {
             before(grammarAccess.getSelectAccess().getNameAssignment_1()); 
            // InternalQueryDsl.g:1338:2: ( rule__Select__NameAssignment_1 )
            // InternalQueryDsl.g:1338:3: rule__Select__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__Select__Group__2"
    // InternalQueryDsl.g:1346:1: rule__Select__Group__2 : rule__Select__Group__2__Impl rule__Select__Group__3 ;
    public final void rule__Select__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1350:1: ( rule__Select__Group__2__Impl rule__Select__Group__3 )
            // InternalQueryDsl.g:1351:2: rule__Select__Group__2__Impl rule__Select__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Select__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2"


    // $ANTLR start "rule__Select__Group__2__Impl"
    // InternalQueryDsl.g:1358:1: rule__Select__Group__2__Impl : ( ( rule__Select__Group_2__0 )? ) ;
    public final void rule__Select__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1362:1: ( ( ( rule__Select__Group_2__0 )? ) )
            // InternalQueryDsl.g:1363:1: ( ( rule__Select__Group_2__0 )? )
            {
            // InternalQueryDsl.g:1363:1: ( ( rule__Select__Group_2__0 )? )
            // InternalQueryDsl.g:1364:2: ( rule__Select__Group_2__0 )?
            {
             before(grammarAccess.getSelectAccess().getGroup_2()); 
            // InternalQueryDsl.g:1365:2: ( rule__Select__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQueryDsl.g:1365:3: rule__Select__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__2__Impl"


    // $ANTLR start "rule__Select__Group__3"
    // InternalQueryDsl.g:1373:1: rule__Select__Group__3 : rule__Select__Group__3__Impl rule__Select__Group__4 ;
    public final void rule__Select__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1377:1: ( rule__Select__Group__3__Impl rule__Select__Group__4 )
            // InternalQueryDsl.g:1378:2: rule__Select__Group__3__Impl rule__Select__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Select__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__3"


    // $ANTLR start "rule__Select__Group__3__Impl"
    // InternalQueryDsl.g:1385:1: rule__Select__Group__3__Impl : ( ':' ) ;
    public final void rule__Select__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1389:1: ( ( ':' ) )
            // InternalQueryDsl.g:1390:1: ( ':' )
            {
            // InternalQueryDsl.g:1390:1: ( ':' )
            // InternalQueryDsl.g:1391:2: ':'
            {
             before(grammarAccess.getSelectAccess().getColonKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__3__Impl"


    // $ANTLR start "rule__Select__Group__4"
    // InternalQueryDsl.g:1400:1: rule__Select__Group__4 : rule__Select__Group__4__Impl rule__Select__Group__5 ;
    public final void rule__Select__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1404:1: ( rule__Select__Group__4__Impl rule__Select__Group__5 )
            // InternalQueryDsl.g:1405:2: rule__Select__Group__4__Impl rule__Select__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Select__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__4"


    // $ANTLR start "rule__Select__Group__4__Impl"
    // InternalQueryDsl.g:1412:1: rule__Select__Group__4__Impl : ( 'select' ) ;
    public final void rule__Select__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1416:1: ( ( 'select' ) )
            // InternalQueryDsl.g:1417:1: ( 'select' )
            {
            // InternalQueryDsl.g:1417:1: ( 'select' )
            // InternalQueryDsl.g:1418:2: 'select'
            {
             before(grammarAccess.getSelectAccess().getSelectKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__4__Impl"


    // $ANTLR start "rule__Select__Group__5"
    // InternalQueryDsl.g:1427:1: rule__Select__Group__5 : rule__Select__Group__5__Impl rule__Select__Group__6 ;
    public final void rule__Select__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1431:1: ( rule__Select__Group__5__Impl rule__Select__Group__6 )
            // InternalQueryDsl.g:1432:2: rule__Select__Group__5__Impl rule__Select__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Select__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__5"


    // $ANTLR start "rule__Select__Group__5__Impl"
    // InternalQueryDsl.g:1439:1: rule__Select__Group__5__Impl : ( ( rule__Select__Alternatives_5 ) ) ;
    public final void rule__Select__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1443:1: ( ( ( rule__Select__Alternatives_5 ) ) )
            // InternalQueryDsl.g:1444:1: ( ( rule__Select__Alternatives_5 ) )
            {
            // InternalQueryDsl.g:1444:1: ( ( rule__Select__Alternatives_5 ) )
            // InternalQueryDsl.g:1445:2: ( rule__Select__Alternatives_5 )
            {
             before(grammarAccess.getSelectAccess().getAlternatives_5()); 
            // InternalQueryDsl.g:1446:2: ( rule__Select__Alternatives_5 )
            // InternalQueryDsl.g:1446:3: rule__Select__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Select__Alternatives_5();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getAlternatives_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__5__Impl"


    // $ANTLR start "rule__Select__Group__6"
    // InternalQueryDsl.g:1454:1: rule__Select__Group__6 : rule__Select__Group__6__Impl rule__Select__Group__7 ;
    public final void rule__Select__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1458:1: ( rule__Select__Group__6__Impl rule__Select__Group__7 )
            // InternalQueryDsl.g:1459:2: rule__Select__Group__6__Impl rule__Select__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__Select__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__6"


    // $ANTLR start "rule__Select__Group__6__Impl"
    // InternalQueryDsl.g:1466:1: rule__Select__Group__6__Impl : ( ( rule__Select__Group_6__0 )? ) ;
    public final void rule__Select__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1470:1: ( ( ( rule__Select__Group_6__0 )? ) )
            // InternalQueryDsl.g:1471:1: ( ( rule__Select__Group_6__0 )? )
            {
            // InternalQueryDsl.g:1471:1: ( ( rule__Select__Group_6__0 )? )
            // InternalQueryDsl.g:1472:2: ( rule__Select__Group_6__0 )?
            {
             before(grammarAccess.getSelectAccess().getGroup_6()); 
            // InternalQueryDsl.g:1473:2: ( rule__Select__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==41) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalQueryDsl.g:1473:3: rule__Select__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__6__Impl"


    // $ANTLR start "rule__Select__Group__7"
    // InternalQueryDsl.g:1481:1: rule__Select__Group__7 : rule__Select__Group__7__Impl ;
    public final void rule__Select__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1485:1: ( rule__Select__Group__7__Impl )
            // InternalQueryDsl.g:1486:2: rule__Select__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__7"


    // $ANTLR start "rule__Select__Group__7__Impl"
    // InternalQueryDsl.g:1492:1: rule__Select__Group__7__Impl : ( ( rule__Select__Group_7__0 )? ) ;
    public final void rule__Select__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1496:1: ( ( ( rule__Select__Group_7__0 )? ) )
            // InternalQueryDsl.g:1497:1: ( ( rule__Select__Group_7__0 )? )
            {
            // InternalQueryDsl.g:1497:1: ( ( rule__Select__Group_7__0 )? )
            // InternalQueryDsl.g:1498:2: ( rule__Select__Group_7__0 )?
            {
             before(grammarAccess.getSelectAccess().getGroup_7()); 
            // InternalQueryDsl.g:1499:2: ( rule__Select__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalQueryDsl.g:1499:3: rule__Select__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Select__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group__7__Impl"


    // $ANTLR start "rule__Select__Group_2__0"
    // InternalQueryDsl.g:1508:1: rule__Select__Group_2__0 : rule__Select__Group_2__0__Impl rule__Select__Group_2__1 ;
    public final void rule__Select__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1512:1: ( rule__Select__Group_2__0__Impl rule__Select__Group_2__1 )
            // InternalQueryDsl.g:1513:2: rule__Select__Group_2__0__Impl rule__Select__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Select__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__0"


    // $ANTLR start "rule__Select__Group_2__0__Impl"
    // InternalQueryDsl.g:1520:1: rule__Select__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Select__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1524:1: ( ( '(' ) )
            // InternalQueryDsl.g:1525:1: ( '(' )
            {
            // InternalQueryDsl.g:1525:1: ( '(' )
            // InternalQueryDsl.g:1526:2: '('
            {
             before(grammarAccess.getSelectAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__0__Impl"


    // $ANTLR start "rule__Select__Group_2__1"
    // InternalQueryDsl.g:1535:1: rule__Select__Group_2__1 : rule__Select__Group_2__1__Impl rule__Select__Group_2__2 ;
    public final void rule__Select__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1539:1: ( rule__Select__Group_2__1__Impl rule__Select__Group_2__2 )
            // InternalQueryDsl.g:1540:2: rule__Select__Group_2__1__Impl rule__Select__Group_2__2
            {
            pushFollow(FOLLOW_18);
            rule__Select__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__1"


    // $ANTLR start "rule__Select__Group_2__1__Impl"
    // InternalQueryDsl.g:1547:1: rule__Select__Group_2__1__Impl : ( ( rule__Select__ParamsAssignment_2_1 ) ) ;
    public final void rule__Select__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1551:1: ( ( ( rule__Select__ParamsAssignment_2_1 ) ) )
            // InternalQueryDsl.g:1552:1: ( ( rule__Select__ParamsAssignment_2_1 ) )
            {
            // InternalQueryDsl.g:1552:1: ( ( rule__Select__ParamsAssignment_2_1 ) )
            // InternalQueryDsl.g:1553:2: ( rule__Select__ParamsAssignment_2_1 )
            {
             before(grammarAccess.getSelectAccess().getParamsAssignment_2_1()); 
            // InternalQueryDsl.g:1554:2: ( rule__Select__ParamsAssignment_2_1 )
            // InternalQueryDsl.g:1554:3: rule__Select__ParamsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ParamsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getParamsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__1__Impl"


    // $ANTLR start "rule__Select__Group_2__2"
    // InternalQueryDsl.g:1562:1: rule__Select__Group_2__2 : rule__Select__Group_2__2__Impl rule__Select__Group_2__3 ;
    public final void rule__Select__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1566:1: ( rule__Select__Group_2__2__Impl rule__Select__Group_2__3 )
            // InternalQueryDsl.g:1567:2: rule__Select__Group_2__2__Impl rule__Select__Group_2__3
            {
            pushFollow(FOLLOW_18);
            rule__Select__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__2"


    // $ANTLR start "rule__Select__Group_2__2__Impl"
    // InternalQueryDsl.g:1574:1: rule__Select__Group_2__2__Impl : ( ( rule__Select__Group_2_2__0 )* ) ;
    public final void rule__Select__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1578:1: ( ( ( rule__Select__Group_2_2__0 )* ) )
            // InternalQueryDsl.g:1579:1: ( ( rule__Select__Group_2_2__0 )* )
            {
            // InternalQueryDsl.g:1579:1: ( ( rule__Select__Group_2_2__0 )* )
            // InternalQueryDsl.g:1580:2: ( rule__Select__Group_2_2__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_2_2()); 
            // InternalQueryDsl.g:1581:2: ( rule__Select__Group_2_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalQueryDsl.g:1581:3: rule__Select__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Select__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__2__Impl"


    // $ANTLR start "rule__Select__Group_2__3"
    // InternalQueryDsl.g:1589:1: rule__Select__Group_2__3 : rule__Select__Group_2__3__Impl ;
    public final void rule__Select__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1593:1: ( rule__Select__Group_2__3__Impl )
            // InternalQueryDsl.g:1594:2: rule__Select__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__3"


    // $ANTLR start "rule__Select__Group_2__3__Impl"
    // InternalQueryDsl.g:1600:1: rule__Select__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Select__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1604:1: ( ( ')' ) )
            // InternalQueryDsl.g:1605:1: ( ')' )
            {
            // InternalQueryDsl.g:1605:1: ( ')' )
            // InternalQueryDsl.g:1606:2: ')'
            {
             before(grammarAccess.getSelectAccess().getRightParenthesisKeyword_2_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2__3__Impl"


    // $ANTLR start "rule__Select__Group_2_2__0"
    // InternalQueryDsl.g:1616:1: rule__Select__Group_2_2__0 : rule__Select__Group_2_2__0__Impl rule__Select__Group_2_2__1 ;
    public final void rule__Select__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1620:1: ( rule__Select__Group_2_2__0__Impl rule__Select__Group_2_2__1 )
            // InternalQueryDsl.g:1621:2: rule__Select__Group_2_2__0__Impl rule__Select__Group_2_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Select__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2_2__0"


    // $ANTLR start "rule__Select__Group_2_2__0__Impl"
    // InternalQueryDsl.g:1628:1: rule__Select__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1632:1: ( ( ',' ) )
            // InternalQueryDsl.g:1633:1: ( ',' )
            {
            // InternalQueryDsl.g:1633:1: ( ',' )
            // InternalQueryDsl.g:1634:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_2_2_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2_2__0__Impl"


    // $ANTLR start "rule__Select__Group_2_2__1"
    // InternalQueryDsl.g:1643:1: rule__Select__Group_2_2__1 : rule__Select__Group_2_2__1__Impl ;
    public final void rule__Select__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1647:1: ( rule__Select__Group_2_2__1__Impl )
            // InternalQueryDsl.g:1648:2: rule__Select__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2_2__1"


    // $ANTLR start "rule__Select__Group_2_2__1__Impl"
    // InternalQueryDsl.g:1654:1: rule__Select__Group_2_2__1__Impl : ( ( rule__Select__ParamsAssignment_2_2_1 ) ) ;
    public final void rule__Select__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1658:1: ( ( ( rule__Select__ParamsAssignment_2_2_1 ) ) )
            // InternalQueryDsl.g:1659:1: ( ( rule__Select__ParamsAssignment_2_2_1 ) )
            {
            // InternalQueryDsl.g:1659:1: ( ( rule__Select__ParamsAssignment_2_2_1 ) )
            // InternalQueryDsl.g:1660:2: ( rule__Select__ParamsAssignment_2_2_1 )
            {
             before(grammarAccess.getSelectAccess().getParamsAssignment_2_2_1()); 
            // InternalQueryDsl.g:1661:2: ( rule__Select__ParamsAssignment_2_2_1 )
            // InternalQueryDsl.g:1661:3: rule__Select__ParamsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__ParamsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getParamsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_2_2__1__Impl"


    // $ANTLR start "rule__Select__Group_5_1__0"
    // InternalQueryDsl.g:1670:1: rule__Select__Group_5_1__0 : rule__Select__Group_5_1__0__Impl rule__Select__Group_5_1__1 ;
    public final void rule__Select__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1674:1: ( rule__Select__Group_5_1__0__Impl rule__Select__Group_5_1__1 )
            // InternalQueryDsl.g:1675:2: rule__Select__Group_5_1__0__Impl rule__Select__Group_5_1__1
            {
            pushFollow(FOLLOW_20);
            rule__Select__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_5_1__0"


    // $ANTLR start "rule__Select__Group_5_1__0__Impl"
    // InternalQueryDsl.g:1682:1: rule__Select__Group_5_1__0__Impl : ( ( rule__Select__SelectionAssignment_5_1_0 ) ) ;
    public final void rule__Select__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1686:1: ( ( ( rule__Select__SelectionAssignment_5_1_0 ) ) )
            // InternalQueryDsl.g:1687:1: ( ( rule__Select__SelectionAssignment_5_1_0 ) )
            {
            // InternalQueryDsl.g:1687:1: ( ( rule__Select__SelectionAssignment_5_1_0 ) )
            // InternalQueryDsl.g:1688:2: ( rule__Select__SelectionAssignment_5_1_0 )
            {
             before(grammarAccess.getSelectAccess().getSelectionAssignment_5_1_0()); 
            // InternalQueryDsl.g:1689:2: ( rule__Select__SelectionAssignment_5_1_0 )
            // InternalQueryDsl.g:1689:3: rule__Select__SelectionAssignment_5_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Select__SelectionAssignment_5_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getSelectionAssignment_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_5_1__0__Impl"


    // $ANTLR start "rule__Select__Group_5_1__1"
    // InternalQueryDsl.g:1697:1: rule__Select__Group_5_1__1 : rule__Select__Group_5_1__1__Impl ;
    public final void rule__Select__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1701:1: ( rule__Select__Group_5_1__1__Impl )
            // InternalQueryDsl.g:1702:2: rule__Select__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_5_1__1"


    // $ANTLR start "rule__Select__Group_5_1__1__Impl"
    // InternalQueryDsl.g:1708:1: rule__Select__Group_5_1__1__Impl : ( ( rule__Select__Group_5_1_1__0 )* ) ;
    public final void rule__Select__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1712:1: ( ( ( rule__Select__Group_5_1_1__0 )* ) )
            // InternalQueryDsl.g:1713:1: ( ( rule__Select__Group_5_1_1__0 )* )
            {
            // InternalQueryDsl.g:1713:1: ( ( rule__Select__Group_5_1_1__0 )* )
            // InternalQueryDsl.g:1714:2: ( rule__Select__Group_5_1_1__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_5_1_1()); 
            // InternalQueryDsl.g:1715:2: ( rule__Select__Group_5_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQueryDsl.g:1715:3: rule__Select__Group_5_1_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Select__Group_5_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_5_1__1__Impl"


    // $ANTLR start "rule__Select__Group_5_1_1__0"
    // InternalQueryDsl.g:1724:1: rule__Select__Group_5_1_1__0 : rule__Select__Group_5_1_1__0__Impl rule__Select__Group_5_1_1__1 ;
    public final void rule__Select__Group_5_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1728:1: ( rule__Select__Group_5_1_1__0__Impl rule__Select__Group_5_1_1__1 )
            // InternalQueryDsl.g:1729:2: rule__Select__Group_5_1_1__0__Impl rule__Select__Group_5_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group_5_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_5_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_5_1_1__0"


    // $ANTLR start "rule__Select__Group_5_1_1__0__Impl"
    // InternalQueryDsl.g:1736:1: rule__Select__Group_5_1_1__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_5_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1740:1: ( ( ',' ) )
            // InternalQueryDsl.g:1741:1: ( ',' )
            {
            // InternalQueryDsl.g:1741:1: ( ',' )
            // InternalQueryDsl.g:1742:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_5_1_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_5_1_1__0__Impl"


    // $ANTLR start "rule__Select__Group_5_1_1__1"
    // InternalQueryDsl.g:1751:1: rule__Select__Group_5_1_1__1 : rule__Select__Group_5_1_1__1__Impl ;
    public final void rule__Select__Group_5_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1755:1: ( rule__Select__Group_5_1_1__1__Impl )
            // InternalQueryDsl.g:1756:2: rule__Select__Group_5_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_5_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_5_1_1__1"


    // $ANTLR start "rule__Select__Group_5_1_1__1__Impl"
    // InternalQueryDsl.g:1762:1: rule__Select__Group_5_1_1__1__Impl : ( ( rule__Select__SelectionAssignment_5_1_1_1 ) ) ;
    public final void rule__Select__Group_5_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1766:1: ( ( ( rule__Select__SelectionAssignment_5_1_1_1 ) ) )
            // InternalQueryDsl.g:1767:1: ( ( rule__Select__SelectionAssignment_5_1_1_1 ) )
            {
            // InternalQueryDsl.g:1767:1: ( ( rule__Select__SelectionAssignment_5_1_1_1 ) )
            // InternalQueryDsl.g:1768:2: ( rule__Select__SelectionAssignment_5_1_1_1 )
            {
             before(grammarAccess.getSelectAccess().getSelectionAssignment_5_1_1_1()); 
            // InternalQueryDsl.g:1769:2: ( rule__Select__SelectionAssignment_5_1_1_1 )
            // InternalQueryDsl.g:1769:3: rule__Select__SelectionAssignment_5_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__SelectionAssignment_5_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getSelectionAssignment_5_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_5_1_1__1__Impl"


    // $ANTLR start "rule__Select__Group_6__0"
    // InternalQueryDsl.g:1778:1: rule__Select__Group_6__0 : rule__Select__Group_6__0__Impl rule__Select__Group_6__1 ;
    public final void rule__Select__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1782:1: ( rule__Select__Group_6__0__Impl rule__Select__Group_6__1 )
            // InternalQueryDsl.g:1783:2: rule__Select__Group_6__0__Impl rule__Select__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6__0"


    // $ANTLR start "rule__Select__Group_6__0__Impl"
    // InternalQueryDsl.g:1790:1: rule__Select__Group_6__0__Impl : ( 'from' ) ;
    public final void rule__Select__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1794:1: ( ( 'from' ) )
            // InternalQueryDsl.g:1795:1: ( 'from' )
            {
            // InternalQueryDsl.g:1795:1: ( 'from' )
            // InternalQueryDsl.g:1796:2: 'from'
            {
             before(grammarAccess.getSelectAccess().getFromKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getFromKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6__0__Impl"


    // $ANTLR start "rule__Select__Group_6__1"
    // InternalQueryDsl.g:1805:1: rule__Select__Group_6__1 : rule__Select__Group_6__1__Impl ;
    public final void rule__Select__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1809:1: ( rule__Select__Group_6__1__Impl )
            // InternalQueryDsl.g:1810:2: rule__Select__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6__1"


    // $ANTLR start "rule__Select__Group_6__1__Impl"
    // InternalQueryDsl.g:1816:1: rule__Select__Group_6__1__Impl : ( ( rule__Select__Alternatives_6_1 ) ) ;
    public final void rule__Select__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1820:1: ( ( ( rule__Select__Alternatives_6_1 ) ) )
            // InternalQueryDsl.g:1821:1: ( ( rule__Select__Alternatives_6_1 ) )
            {
            // InternalQueryDsl.g:1821:1: ( ( rule__Select__Alternatives_6_1 ) )
            // InternalQueryDsl.g:1822:2: ( rule__Select__Alternatives_6_1 )
            {
             before(grammarAccess.getSelectAccess().getAlternatives_6_1()); 
            // InternalQueryDsl.g:1823:2: ( rule__Select__Alternatives_6_1 )
            // InternalQueryDsl.g:1823:3: rule__Select__Alternatives_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__Alternatives_6_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getAlternatives_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6__1__Impl"


    // $ANTLR start "rule__Select__Group_6_1_0__0"
    // InternalQueryDsl.g:1832:1: rule__Select__Group_6_1_0__0 : rule__Select__Group_6_1_0__0__Impl rule__Select__Group_6_1_0__1 ;
    public final void rule__Select__Group_6_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1836:1: ( rule__Select__Group_6_1_0__0__Impl rule__Select__Group_6_1_0__1 )
            // InternalQueryDsl.g:1837:2: rule__Select__Group_6_1_0__0__Impl rule__Select__Group_6_1_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Select__Group_6_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_6_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_0__0"


    // $ANTLR start "rule__Select__Group_6_1_0__0__Impl"
    // InternalQueryDsl.g:1844:1: rule__Select__Group_6_1_0__0__Impl : ( ( rule__Select__FromAssignment_6_1_0_0 ) ) ;
    public final void rule__Select__Group_6_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1848:1: ( ( ( rule__Select__FromAssignment_6_1_0_0 ) ) )
            // InternalQueryDsl.g:1849:1: ( ( rule__Select__FromAssignment_6_1_0_0 ) )
            {
            // InternalQueryDsl.g:1849:1: ( ( rule__Select__FromAssignment_6_1_0_0 ) )
            // InternalQueryDsl.g:1850:2: ( rule__Select__FromAssignment_6_1_0_0 )
            {
             before(grammarAccess.getSelectAccess().getFromAssignment_6_1_0_0()); 
            // InternalQueryDsl.g:1851:2: ( rule__Select__FromAssignment_6_1_0_0 )
            // InternalQueryDsl.g:1851:3: rule__Select__FromAssignment_6_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Select__FromAssignment_6_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getFromAssignment_6_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_0__0__Impl"


    // $ANTLR start "rule__Select__Group_6_1_0__1"
    // InternalQueryDsl.g:1859:1: rule__Select__Group_6_1_0__1 : rule__Select__Group_6_1_0__1__Impl ;
    public final void rule__Select__Group_6_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1863:1: ( rule__Select__Group_6_1_0__1__Impl )
            // InternalQueryDsl.g:1864:2: rule__Select__Group_6_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_6_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_0__1"


    // $ANTLR start "rule__Select__Group_6_1_0__1__Impl"
    // InternalQueryDsl.g:1870:1: rule__Select__Group_6_1_0__1__Impl : ( ( rule__Select__Group_6_1_0_1__0 )* ) ;
    public final void rule__Select__Group_6_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1874:1: ( ( ( rule__Select__Group_6_1_0_1__0 )* ) )
            // InternalQueryDsl.g:1875:1: ( ( rule__Select__Group_6_1_0_1__0 )* )
            {
            // InternalQueryDsl.g:1875:1: ( ( rule__Select__Group_6_1_0_1__0 )* )
            // InternalQueryDsl.g:1876:2: ( rule__Select__Group_6_1_0_1__0 )*
            {
             before(grammarAccess.getSelectAccess().getGroup_6_1_0_1()); 
            // InternalQueryDsl.g:1877:2: ( rule__Select__Group_6_1_0_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==40) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQueryDsl.g:1877:3: rule__Select__Group_6_1_0_1__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Select__Group_6_1_0_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getGroup_6_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_0__1__Impl"


    // $ANTLR start "rule__Select__Group_6_1_0_1__0"
    // InternalQueryDsl.g:1886:1: rule__Select__Group_6_1_0_1__0 : rule__Select__Group_6_1_0_1__0__Impl rule__Select__Group_6_1_0_1__1 ;
    public final void rule__Select__Group_6_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1890:1: ( rule__Select__Group_6_1_0_1__0__Impl rule__Select__Group_6_1_0_1__1 )
            // InternalQueryDsl.g:1891:2: rule__Select__Group_6_1_0_1__0__Impl rule__Select__Group_6_1_0_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group_6_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_6_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_0_1__0"


    // $ANTLR start "rule__Select__Group_6_1_0_1__0__Impl"
    // InternalQueryDsl.g:1898:1: rule__Select__Group_6_1_0_1__0__Impl : ( ',' ) ;
    public final void rule__Select__Group_6_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1902:1: ( ( ',' ) )
            // InternalQueryDsl.g:1903:1: ( ',' )
            {
            // InternalQueryDsl.g:1903:1: ( ',' )
            // InternalQueryDsl.g:1904:2: ','
            {
             before(grammarAccess.getSelectAccess().getCommaKeyword_6_1_0_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getCommaKeyword_6_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_0_1__0__Impl"


    // $ANTLR start "rule__Select__Group_6_1_0_1__1"
    // InternalQueryDsl.g:1913:1: rule__Select__Group_6_1_0_1__1 : rule__Select__Group_6_1_0_1__1__Impl ;
    public final void rule__Select__Group_6_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1917:1: ( rule__Select__Group_6_1_0_1__1__Impl )
            // InternalQueryDsl.g:1918:2: rule__Select__Group_6_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_6_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_0_1__1"


    // $ANTLR start "rule__Select__Group_6_1_0_1__1__Impl"
    // InternalQueryDsl.g:1924:1: rule__Select__Group_6_1_0_1__1__Impl : ( ( rule__Select__FromAssignment_6_1_0_1_1 ) ) ;
    public final void rule__Select__Group_6_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1928:1: ( ( ( rule__Select__FromAssignment_6_1_0_1_1 ) ) )
            // InternalQueryDsl.g:1929:1: ( ( rule__Select__FromAssignment_6_1_0_1_1 ) )
            {
            // InternalQueryDsl.g:1929:1: ( ( rule__Select__FromAssignment_6_1_0_1_1 ) )
            // InternalQueryDsl.g:1930:2: ( rule__Select__FromAssignment_6_1_0_1_1 )
            {
             before(grammarAccess.getSelectAccess().getFromAssignment_6_1_0_1_1()); 
            // InternalQueryDsl.g:1931:2: ( rule__Select__FromAssignment_6_1_0_1_1 )
            // InternalQueryDsl.g:1931:3: rule__Select__FromAssignment_6_1_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__FromAssignment_6_1_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getFromAssignment_6_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_0_1__1__Impl"


    // $ANTLR start "rule__Select__Group_6_1_1__0"
    // InternalQueryDsl.g:1940:1: rule__Select__Group_6_1_1__0 : rule__Select__Group_6_1_1__0__Impl rule__Select__Group_6_1_1__1 ;
    public final void rule__Select__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1944:1: ( rule__Select__Group_6_1_1__0__Impl rule__Select__Group_6_1_1__1 )
            // InternalQueryDsl.g:1945:2: rule__Select__Group_6_1_1__0__Impl rule__Select__Group_6_1_1__1
            {
            pushFollow(FOLLOW_21);
            rule__Select__Group_6_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_6_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_1__0"


    // $ANTLR start "rule__Select__Group_6_1_1__0__Impl"
    // InternalQueryDsl.g:1952:1: rule__Select__Group_6_1_1__0__Impl : ( ( rule__Select__FromAssignment_6_1_1_0 ) ) ;
    public final void rule__Select__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1956:1: ( ( ( rule__Select__FromAssignment_6_1_1_0 ) ) )
            // InternalQueryDsl.g:1957:1: ( ( rule__Select__FromAssignment_6_1_1_0 ) )
            {
            // InternalQueryDsl.g:1957:1: ( ( rule__Select__FromAssignment_6_1_1_0 ) )
            // InternalQueryDsl.g:1958:2: ( rule__Select__FromAssignment_6_1_1_0 )
            {
             before(grammarAccess.getSelectAccess().getFromAssignment_6_1_1_0()); 
            // InternalQueryDsl.g:1959:2: ( rule__Select__FromAssignment_6_1_1_0 )
            // InternalQueryDsl.g:1959:3: rule__Select__FromAssignment_6_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Select__FromAssignment_6_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getFromAssignment_6_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_1__0__Impl"


    // $ANTLR start "rule__Select__Group_6_1_1__1"
    // InternalQueryDsl.g:1967:1: rule__Select__Group_6_1_1__1 : rule__Select__Group_6_1_1__1__Impl ;
    public final void rule__Select__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1971:1: ( rule__Select__Group_6_1_1__1__Impl )
            // InternalQueryDsl.g:1972:2: rule__Select__Group_6_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_6_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_1__1"


    // $ANTLR start "rule__Select__Group_6_1_1__1__Impl"
    // InternalQueryDsl.g:1978:1: rule__Select__Group_6_1_1__1__Impl : ( ( ( rule__Select__FromAssignment_6_1_1_1 ) ) ( ( rule__Select__FromAssignment_6_1_1_1 )* ) ) ;
    public final void rule__Select__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1982:1: ( ( ( ( rule__Select__FromAssignment_6_1_1_1 ) ) ( ( rule__Select__FromAssignment_6_1_1_1 )* ) ) )
            // InternalQueryDsl.g:1983:1: ( ( ( rule__Select__FromAssignment_6_1_1_1 ) ) ( ( rule__Select__FromAssignment_6_1_1_1 )* ) )
            {
            // InternalQueryDsl.g:1983:1: ( ( ( rule__Select__FromAssignment_6_1_1_1 ) ) ( ( rule__Select__FromAssignment_6_1_1_1 )* ) )
            // InternalQueryDsl.g:1984:2: ( ( rule__Select__FromAssignment_6_1_1_1 ) ) ( ( rule__Select__FromAssignment_6_1_1_1 )* )
            {
            // InternalQueryDsl.g:1984:2: ( ( rule__Select__FromAssignment_6_1_1_1 ) )
            // InternalQueryDsl.g:1985:3: ( rule__Select__FromAssignment_6_1_1_1 )
            {
             before(grammarAccess.getSelectAccess().getFromAssignment_6_1_1_1()); 
            // InternalQueryDsl.g:1986:3: ( rule__Select__FromAssignment_6_1_1_1 )
            // InternalQueryDsl.g:1986:4: rule__Select__FromAssignment_6_1_1_1
            {
            pushFollow(FOLLOW_22);
            rule__Select__FromAssignment_6_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getFromAssignment_6_1_1_1()); 

            }

            // InternalQueryDsl.g:1989:2: ( ( rule__Select__FromAssignment_6_1_1_1 )* )
            // InternalQueryDsl.g:1990:3: ( rule__Select__FromAssignment_6_1_1_1 )*
            {
             before(grammarAccess.getSelectAccess().getFromAssignment_6_1_1_1()); 
            // InternalQueryDsl.g:1991:3: ( rule__Select__FromAssignment_6_1_1_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=11 && LA22_0<=16)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalQueryDsl.g:1991:4: rule__Select__FromAssignment_6_1_1_1
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Select__FromAssignment_6_1_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSelectAccess().getFromAssignment_6_1_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_6_1_1__1__Impl"


    // $ANTLR start "rule__Select__Group_7__0"
    // InternalQueryDsl.g:2001:1: rule__Select__Group_7__0 : rule__Select__Group_7__0__Impl rule__Select__Group_7__1 ;
    public final void rule__Select__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2005:1: ( rule__Select__Group_7__0__Impl rule__Select__Group_7__1 )
            // InternalQueryDsl.g:2006:2: rule__Select__Group_7__0__Impl rule__Select__Group_7__1
            {
            pushFollow(FOLLOW_23);
            rule__Select__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_7__0"


    // $ANTLR start "rule__Select__Group_7__0__Impl"
    // InternalQueryDsl.g:2013:1: rule__Select__Group_7__0__Impl : ( 'where' ) ;
    public final void rule__Select__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2017:1: ( ( 'where' ) )
            // InternalQueryDsl.g:2018:1: ( 'where' )
            {
            // InternalQueryDsl.g:2018:1: ( 'where' )
            // InternalQueryDsl.g:2019:2: 'where'
            {
             before(grammarAccess.getSelectAccess().getWhereKeyword_7_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getWhereKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_7__0__Impl"


    // $ANTLR start "rule__Select__Group_7__1"
    // InternalQueryDsl.g:2028:1: rule__Select__Group_7__1 : rule__Select__Group_7__1__Impl ;
    public final void rule__Select__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2032:1: ( rule__Select__Group_7__1__Impl )
            // InternalQueryDsl.g:2033:2: rule__Select__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_7__1"


    // $ANTLR start "rule__Select__Group_7__1__Impl"
    // InternalQueryDsl.g:2039:1: rule__Select__Group_7__1__Impl : ( ( rule__Select__WhereAssignment_7_1 ) ) ;
    public final void rule__Select__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2043:1: ( ( ( rule__Select__WhereAssignment_7_1 ) ) )
            // InternalQueryDsl.g:2044:1: ( ( rule__Select__WhereAssignment_7_1 ) )
            {
            // InternalQueryDsl.g:2044:1: ( ( rule__Select__WhereAssignment_7_1 ) )
            // InternalQueryDsl.g:2045:2: ( rule__Select__WhereAssignment_7_1 )
            {
             before(grammarAccess.getSelectAccess().getWhereAssignment_7_1()); 
            // InternalQueryDsl.g:2046:2: ( rule__Select__WhereAssignment_7_1 )
            // InternalQueryDsl.g:2046:3: rule__Select__WhereAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__WhereAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getWhereAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__Group_7__1__Impl"


    // $ANTLR start "rule__QueryParam__Group__0"
    // InternalQueryDsl.g:2055:1: rule__QueryParam__Group__0 : rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 ;
    public final void rule__QueryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2059:1: ( rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 )
            // InternalQueryDsl.g:2060:2: rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__QueryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__0"


    // $ANTLR start "rule__QueryParam__Group__0__Impl"
    // InternalQueryDsl.g:2067:1: rule__QueryParam__Group__0__Impl : ( ( rule__QueryParam__TypeAssignment_0 ) ) ;
    public final void rule__QueryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2071:1: ( ( ( rule__QueryParam__TypeAssignment_0 ) ) )
            // InternalQueryDsl.g:2072:1: ( ( rule__QueryParam__TypeAssignment_0 ) )
            {
            // InternalQueryDsl.g:2072:1: ( ( rule__QueryParam__TypeAssignment_0 ) )
            // InternalQueryDsl.g:2073:2: ( rule__QueryParam__TypeAssignment_0 )
            {
             before(grammarAccess.getQueryParamAccess().getTypeAssignment_0()); 
            // InternalQueryDsl.g:2074:2: ( rule__QueryParam__TypeAssignment_0 )
            // InternalQueryDsl.g:2074:3: rule__QueryParam__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__0__Impl"


    // $ANTLR start "rule__QueryParam__Group__1"
    // InternalQueryDsl.g:2082:1: rule__QueryParam__Group__1 : rule__QueryParam__Group__1__Impl ;
    public final void rule__QueryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2086:1: ( rule__QueryParam__Group__1__Impl )
            // InternalQueryDsl.g:2087:2: rule__QueryParam__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__1"


    // $ANTLR start "rule__QueryParam__Group__1__Impl"
    // InternalQueryDsl.g:2093:1: rule__QueryParam__Group__1__Impl : ( ( rule__QueryParam__NameAssignment_1 ) ) ;
    public final void rule__QueryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2097:1: ( ( ( rule__QueryParam__NameAssignment_1 ) ) )
            // InternalQueryDsl.g:2098:1: ( ( rule__QueryParam__NameAssignment_1 ) )
            {
            // InternalQueryDsl.g:2098:1: ( ( rule__QueryParam__NameAssignment_1 ) )
            // InternalQueryDsl.g:2099:2: ( rule__QueryParam__NameAssignment_1 )
            {
             before(grammarAccess.getQueryParamAccess().getNameAssignment_1()); 
            // InternalQueryDsl.g:2100:2: ( rule__QueryParam__NameAssignment_1 )
            // InternalQueryDsl.g:2100:3: rule__QueryParam__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__1__Impl"


    // $ANTLR start "rule__SimpleFrom__Group__0"
    // InternalQueryDsl.g:2109:1: rule__SimpleFrom__Group__0 : rule__SimpleFrom__Group__0__Impl rule__SimpleFrom__Group__1 ;
    public final void rule__SimpleFrom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2113:1: ( rule__SimpleFrom__Group__0__Impl rule__SimpleFrom__Group__1 )
            // InternalQueryDsl.g:2114:2: rule__SimpleFrom__Group__0__Impl rule__SimpleFrom__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SimpleFrom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleFrom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFrom__Group__0"


    // $ANTLR start "rule__SimpleFrom__Group__0__Impl"
    // InternalQueryDsl.g:2121:1: rule__SimpleFrom__Group__0__Impl : ( () ) ;
    public final void rule__SimpleFrom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2125:1: ( ( () ) )
            // InternalQueryDsl.g:2126:1: ( () )
            {
            // InternalQueryDsl.g:2126:1: ( () )
            // InternalQueryDsl.g:2127:2: ()
            {
             before(grammarAccess.getSimpleFromAccess().getSimpleFromAction_0()); 
            // InternalQueryDsl.g:2128:2: ()
            // InternalQueryDsl.g:2128:3: 
            {
            }

             after(grammarAccess.getSimpleFromAccess().getSimpleFromAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFrom__Group__0__Impl"


    // $ANTLR start "rule__SimpleFrom__Group__1"
    // InternalQueryDsl.g:2136:1: rule__SimpleFrom__Group__1 : rule__SimpleFrom__Group__1__Impl ;
    public final void rule__SimpleFrom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2140:1: ( rule__SimpleFrom__Group__1__Impl )
            // InternalQueryDsl.g:2141:2: rule__SimpleFrom__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleFrom__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFrom__Group__1"


    // $ANTLR start "rule__SimpleFrom__Group__1__Impl"
    // InternalQueryDsl.g:2147:1: rule__SimpleFrom__Group__1__Impl : ( ( rule__SimpleFrom__SourceAssignment_1 ) ) ;
    public final void rule__SimpleFrom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2151:1: ( ( ( rule__SimpleFrom__SourceAssignment_1 ) ) )
            // InternalQueryDsl.g:2152:1: ( ( rule__SimpleFrom__SourceAssignment_1 ) )
            {
            // InternalQueryDsl.g:2152:1: ( ( rule__SimpleFrom__SourceAssignment_1 ) )
            // InternalQueryDsl.g:2153:2: ( rule__SimpleFrom__SourceAssignment_1 )
            {
             before(grammarAccess.getSimpleFromAccess().getSourceAssignment_1()); 
            // InternalQueryDsl.g:2154:2: ( rule__SimpleFrom__SourceAssignment_1 )
            // InternalQueryDsl.g:2154:3: rule__SimpleFrom__SourceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleFrom__SourceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleFromAccess().getSourceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFrom__Group__1__Impl"


    // $ANTLR start "rule__CompositeFrom__Group__0"
    // InternalQueryDsl.g:2163:1: rule__CompositeFrom__Group__0 : rule__CompositeFrom__Group__0__Impl rule__CompositeFrom__Group__1 ;
    public final void rule__CompositeFrom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2167:1: ( rule__CompositeFrom__Group__0__Impl rule__CompositeFrom__Group__1 )
            // InternalQueryDsl.g:2168:2: rule__CompositeFrom__Group__0__Impl rule__CompositeFrom__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__CompositeFrom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFrom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__0"


    // $ANTLR start "rule__CompositeFrom__Group__0__Impl"
    // InternalQueryDsl.g:2175:1: rule__CompositeFrom__Group__0__Impl : ( () ) ;
    public final void rule__CompositeFrom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2179:1: ( ( () ) )
            // InternalQueryDsl.g:2180:1: ( () )
            {
            // InternalQueryDsl.g:2180:1: ( () )
            // InternalQueryDsl.g:2181:2: ()
            {
             before(grammarAccess.getCompositeFromAccess().getCompositeFromAction_0()); 
            // InternalQueryDsl.g:2182:2: ()
            // InternalQueryDsl.g:2182:3: 
            {
            }

             after(grammarAccess.getCompositeFromAccess().getCompositeFromAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__0__Impl"


    // $ANTLR start "rule__CompositeFrom__Group__1"
    // InternalQueryDsl.g:2190:1: rule__CompositeFrom__Group__1 : rule__CompositeFrom__Group__1__Impl rule__CompositeFrom__Group__2 ;
    public final void rule__CompositeFrom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2194:1: ( rule__CompositeFrom__Group__1__Impl rule__CompositeFrom__Group__2 )
            // InternalQueryDsl.g:2195:2: rule__CompositeFrom__Group__1__Impl rule__CompositeFrom__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CompositeFrom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFrom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__1"


    // $ANTLR start "rule__CompositeFrom__Group__1__Impl"
    // InternalQueryDsl.g:2202:1: rule__CompositeFrom__Group__1__Impl : ( ( rule__CompositeFrom__JoinAssignment_1 ) ) ;
    public final void rule__CompositeFrom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2206:1: ( ( ( rule__CompositeFrom__JoinAssignment_1 ) ) )
            // InternalQueryDsl.g:2207:1: ( ( rule__CompositeFrom__JoinAssignment_1 ) )
            {
            // InternalQueryDsl.g:2207:1: ( ( rule__CompositeFrom__JoinAssignment_1 ) )
            // InternalQueryDsl.g:2208:2: ( rule__CompositeFrom__JoinAssignment_1 )
            {
             before(grammarAccess.getCompositeFromAccess().getJoinAssignment_1()); 
            // InternalQueryDsl.g:2209:2: ( rule__CompositeFrom__JoinAssignment_1 )
            // InternalQueryDsl.g:2209:3: rule__CompositeFrom__JoinAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFrom__JoinAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeFromAccess().getJoinAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__1__Impl"


    // $ANTLR start "rule__CompositeFrom__Group__2"
    // InternalQueryDsl.g:2217:1: rule__CompositeFrom__Group__2 : rule__CompositeFrom__Group__2__Impl rule__CompositeFrom__Group__3 ;
    public final void rule__CompositeFrom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2221:1: ( rule__CompositeFrom__Group__2__Impl rule__CompositeFrom__Group__3 )
            // InternalQueryDsl.g:2222:2: rule__CompositeFrom__Group__2__Impl rule__CompositeFrom__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__CompositeFrom__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFrom__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__2"


    // $ANTLR start "rule__CompositeFrom__Group__2__Impl"
    // InternalQueryDsl.g:2229:1: rule__CompositeFrom__Group__2__Impl : ( ( rule__CompositeFrom__SourceAssignment_2 ) ) ;
    public final void rule__CompositeFrom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2233:1: ( ( ( rule__CompositeFrom__SourceAssignment_2 ) ) )
            // InternalQueryDsl.g:2234:1: ( ( rule__CompositeFrom__SourceAssignment_2 ) )
            {
            // InternalQueryDsl.g:2234:1: ( ( rule__CompositeFrom__SourceAssignment_2 ) )
            // InternalQueryDsl.g:2235:2: ( rule__CompositeFrom__SourceAssignment_2 )
            {
             before(grammarAccess.getCompositeFromAccess().getSourceAssignment_2()); 
            // InternalQueryDsl.g:2236:2: ( rule__CompositeFrom__SourceAssignment_2 )
            // InternalQueryDsl.g:2236:3: rule__CompositeFrom__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFrom__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeFromAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__2__Impl"


    // $ANTLR start "rule__CompositeFrom__Group__3"
    // InternalQueryDsl.g:2244:1: rule__CompositeFrom__Group__3 : rule__CompositeFrom__Group__3__Impl rule__CompositeFrom__Group__4 ;
    public final void rule__CompositeFrom__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2248:1: ( rule__CompositeFrom__Group__3__Impl rule__CompositeFrom__Group__4 )
            // InternalQueryDsl.g:2249:2: rule__CompositeFrom__Group__3__Impl rule__CompositeFrom__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__CompositeFrom__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeFrom__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__3"


    // $ANTLR start "rule__CompositeFrom__Group__3__Impl"
    // InternalQueryDsl.g:2256:1: rule__CompositeFrom__Group__3__Impl : ( 'on' ) ;
    public final void rule__CompositeFrom__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2260:1: ( ( 'on' ) )
            // InternalQueryDsl.g:2261:1: ( 'on' )
            {
            // InternalQueryDsl.g:2261:1: ( 'on' )
            // InternalQueryDsl.g:2262:2: 'on'
            {
             before(grammarAccess.getCompositeFromAccess().getOnKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getCompositeFromAccess().getOnKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__3__Impl"


    // $ANTLR start "rule__CompositeFrom__Group__4"
    // InternalQueryDsl.g:2271:1: rule__CompositeFrom__Group__4 : rule__CompositeFrom__Group__4__Impl ;
    public final void rule__CompositeFrom__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2275:1: ( rule__CompositeFrom__Group__4__Impl )
            // InternalQueryDsl.g:2276:2: rule__CompositeFrom__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFrom__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__4"


    // $ANTLR start "rule__CompositeFrom__Group__4__Impl"
    // InternalQueryDsl.g:2282:1: rule__CompositeFrom__Group__4__Impl : ( ( rule__CompositeFrom__OnAssignment_4 ) ) ;
    public final void rule__CompositeFrom__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2286:1: ( ( ( rule__CompositeFrom__OnAssignment_4 ) ) )
            // InternalQueryDsl.g:2287:1: ( ( rule__CompositeFrom__OnAssignment_4 ) )
            {
            // InternalQueryDsl.g:2287:1: ( ( rule__CompositeFrom__OnAssignment_4 ) )
            // InternalQueryDsl.g:2288:2: ( rule__CompositeFrom__OnAssignment_4 )
            {
             before(grammarAccess.getCompositeFromAccess().getOnAssignment_4()); 
            // InternalQueryDsl.g:2289:2: ( rule__CompositeFrom__OnAssignment_4 )
            // InternalQueryDsl.g:2289:3: rule__CompositeFrom__OnAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CompositeFrom__OnAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCompositeFromAccess().getOnAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__Group__4__Impl"


    // $ANTLR start "rule__SimpleCondition__Group__0"
    // InternalQueryDsl.g:2298:1: rule__SimpleCondition__Group__0 : rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 ;
    public final void rule__SimpleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2302:1: ( rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1 )
            // InternalQueryDsl.g:2303:2: rule__SimpleCondition__Group__0__Impl rule__SimpleCondition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__SimpleCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__0"


    // $ANTLR start "rule__SimpleCondition__Group__0__Impl"
    // InternalQueryDsl.g:2310:1: rule__SimpleCondition__Group__0__Impl : ( () ) ;
    public final void rule__SimpleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2314:1: ( ( () ) )
            // InternalQueryDsl.g:2315:1: ( () )
            {
            // InternalQueryDsl.g:2315:1: ( () )
            // InternalQueryDsl.g:2316:2: ()
            {
             before(grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0()); 
            // InternalQueryDsl.g:2317:2: ()
            // InternalQueryDsl.g:2317:3: 
            {
            }

             after(grammarAccess.getSimpleConditionAccess().getSimpleConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__0__Impl"


    // $ANTLR start "rule__SimpleCondition__Group__1"
    // InternalQueryDsl.g:2325:1: rule__SimpleCondition__Group__1 : rule__SimpleCondition__Group__1__Impl ;
    public final void rule__SimpleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2329:1: ( rule__SimpleCondition__Group__1__Impl )
            // InternalQueryDsl.g:2330:2: rule__SimpleCondition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCondition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__1"


    // $ANTLR start "rule__SimpleCondition__Group__1__Impl"
    // InternalQueryDsl.g:2336:1: rule__SimpleCondition__Group__1__Impl : ( ( rule__SimpleCondition__PredicateAssignment_1 ) ) ;
    public final void rule__SimpleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2340:1: ( ( ( rule__SimpleCondition__PredicateAssignment_1 ) ) )
            // InternalQueryDsl.g:2341:1: ( ( rule__SimpleCondition__PredicateAssignment_1 ) )
            {
            // InternalQueryDsl.g:2341:1: ( ( rule__SimpleCondition__PredicateAssignment_1 ) )
            // InternalQueryDsl.g:2342:2: ( rule__SimpleCondition__PredicateAssignment_1 )
            {
             before(grammarAccess.getSimpleConditionAccess().getPredicateAssignment_1()); 
            // InternalQueryDsl.g:2343:2: ( rule__SimpleCondition__PredicateAssignment_1 )
            // InternalQueryDsl.g:2343:3: rule__SimpleCondition__PredicateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleCondition__PredicateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleConditionAccess().getPredicateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__0"
    // InternalQueryDsl.g:2352:1: rule__PrimitiveValuePredicate__Group__0 : rule__PrimitiveValuePredicate__Group__0__Impl rule__PrimitiveValuePredicate__Group__1 ;
    public final void rule__PrimitiveValuePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2356:1: ( rule__PrimitiveValuePredicate__Group__0__Impl rule__PrimitiveValuePredicate__Group__1 )
            // InternalQueryDsl.g:2357:2: rule__PrimitiveValuePredicate__Group__0__Impl rule__PrimitiveValuePredicate__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__PrimitiveValuePredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveValuePredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__0"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__0__Impl"
    // InternalQueryDsl.g:2364:1: rule__PrimitiveValuePredicate__Group__0__Impl : ( () ) ;
    public final void rule__PrimitiveValuePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2368:1: ( ( () ) )
            // InternalQueryDsl.g:2369:1: ( () )
            {
            // InternalQueryDsl.g:2369:1: ( () )
            // InternalQueryDsl.g:2370:2: ()
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getPrimitiveValueComparisonPredicateAction_0()); 
            // InternalQueryDsl.g:2371:2: ()
            // InternalQueryDsl.g:2371:3: 
            {
            }

             after(grammarAccess.getPrimitiveValuePredicateAccess().getPrimitiveValueComparisonPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__1"
    // InternalQueryDsl.g:2379:1: rule__PrimitiveValuePredicate__Group__1 : rule__PrimitiveValuePredicate__Group__1__Impl rule__PrimitiveValuePredicate__Group__2 ;
    public final void rule__PrimitiveValuePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2383:1: ( rule__PrimitiveValuePredicate__Group__1__Impl rule__PrimitiveValuePredicate__Group__2 )
            // InternalQueryDsl.g:2384:2: rule__PrimitiveValuePredicate__Group__1__Impl rule__PrimitiveValuePredicate__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__PrimitiveValuePredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveValuePredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__1"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__1__Impl"
    // InternalQueryDsl.g:2391:1: rule__PrimitiveValuePredicate__Group__1__Impl : ( ( rule__PrimitiveValuePredicate__NotAssignment_1 )? ) ;
    public final void rule__PrimitiveValuePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2395:1: ( ( ( rule__PrimitiveValuePredicate__NotAssignment_1 )? ) )
            // InternalQueryDsl.g:2396:1: ( ( rule__PrimitiveValuePredicate__NotAssignment_1 )? )
            {
            // InternalQueryDsl.g:2396:1: ( ( rule__PrimitiveValuePredicate__NotAssignment_1 )? )
            // InternalQueryDsl.g:2397:2: ( rule__PrimitiveValuePredicate__NotAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getNotAssignment_1()); 
            // InternalQueryDsl.g:2398:2: ( rule__PrimitiveValuePredicate__NotAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalQueryDsl.g:2398:3: rule__PrimitiveValuePredicate__NotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveValuePredicate__NotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveValuePredicateAccess().getNotAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__1__Impl"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__2"
    // InternalQueryDsl.g:2406:1: rule__PrimitiveValuePredicate__Group__2 : rule__PrimitiveValuePredicate__Group__2__Impl rule__PrimitiveValuePredicate__Group__3 ;
    public final void rule__PrimitiveValuePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2410:1: ( rule__PrimitiveValuePredicate__Group__2__Impl rule__PrimitiveValuePredicate__Group__3 )
            // InternalQueryDsl.g:2411:2: rule__PrimitiveValuePredicate__Group__2__Impl rule__PrimitiveValuePredicate__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__PrimitiveValuePredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveValuePredicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__2"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__2__Impl"
    // InternalQueryDsl.g:2418:1: rule__PrimitiveValuePredicate__Group__2__Impl : ( ( rule__PrimitiveValuePredicate__LeftAssignment_2 ) ) ;
    public final void rule__PrimitiveValuePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2422:1: ( ( ( rule__PrimitiveValuePredicate__LeftAssignment_2 ) ) )
            // InternalQueryDsl.g:2423:1: ( ( rule__PrimitiveValuePredicate__LeftAssignment_2 ) )
            {
            // InternalQueryDsl.g:2423:1: ( ( rule__PrimitiveValuePredicate__LeftAssignment_2 ) )
            // InternalQueryDsl.g:2424:2: ( rule__PrimitiveValuePredicate__LeftAssignment_2 )
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getLeftAssignment_2()); 
            // InternalQueryDsl.g:2425:2: ( rule__PrimitiveValuePredicate__LeftAssignment_2 )
            // InternalQueryDsl.g:2425:3: rule__PrimitiveValuePredicate__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveValuePredicate__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveValuePredicateAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__2__Impl"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__3"
    // InternalQueryDsl.g:2433:1: rule__PrimitiveValuePredicate__Group__3 : rule__PrimitiveValuePredicate__Group__3__Impl rule__PrimitiveValuePredicate__Group__4 ;
    public final void rule__PrimitiveValuePredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2437:1: ( rule__PrimitiveValuePredicate__Group__3__Impl rule__PrimitiveValuePredicate__Group__4 )
            // InternalQueryDsl.g:2438:2: rule__PrimitiveValuePredicate__Group__3__Impl rule__PrimitiveValuePredicate__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__PrimitiveValuePredicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveValuePredicate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__3"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__3__Impl"
    // InternalQueryDsl.g:2445:1: rule__PrimitiveValuePredicate__Group__3__Impl : ( ( rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3 ) ) ;
    public final void rule__PrimitiveValuePredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2449:1: ( ( ( rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3 ) ) )
            // InternalQueryDsl.g:2450:1: ( ( rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3 ) )
            {
            // InternalQueryDsl.g:2450:1: ( ( rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3 ) )
            // InternalQueryDsl.g:2451:2: ( rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3 )
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getComparisonTypeAssignment_3()); 
            // InternalQueryDsl.g:2452:2: ( rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3 )
            // InternalQueryDsl.g:2452:3: rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveValuePredicateAccess().getComparisonTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__3__Impl"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__4"
    // InternalQueryDsl.g:2460:1: rule__PrimitiveValuePredicate__Group__4 : rule__PrimitiveValuePredicate__Group__4__Impl ;
    public final void rule__PrimitiveValuePredicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2464:1: ( rule__PrimitiveValuePredicate__Group__4__Impl )
            // InternalQueryDsl.g:2465:2: rule__PrimitiveValuePredicate__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveValuePredicate__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__4"


    // $ANTLR start "rule__PrimitiveValuePredicate__Group__4__Impl"
    // InternalQueryDsl.g:2471:1: rule__PrimitiveValuePredicate__Group__4__Impl : ( ( rule__PrimitiveValuePredicate__ValueAssignment_4 ) ) ;
    public final void rule__PrimitiveValuePredicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2475:1: ( ( ( rule__PrimitiveValuePredicate__ValueAssignment_4 ) ) )
            // InternalQueryDsl.g:2476:1: ( ( rule__PrimitiveValuePredicate__ValueAssignment_4 ) )
            {
            // InternalQueryDsl.g:2476:1: ( ( rule__PrimitiveValuePredicate__ValueAssignment_4 ) )
            // InternalQueryDsl.g:2477:2: ( rule__PrimitiveValuePredicate__ValueAssignment_4 )
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getValueAssignment_4()); 
            // InternalQueryDsl.g:2478:2: ( rule__PrimitiveValuePredicate__ValueAssignment_4 )
            // InternalQueryDsl.g:2478:3: rule__PrimitiveValuePredicate__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveValuePredicate__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveValuePredicateAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__Group__4__Impl"


    // $ANTLR start "rule__ModelValuePredicate__Group__0"
    // InternalQueryDsl.g:2487:1: rule__ModelValuePredicate__Group__0 : rule__ModelValuePredicate__Group__0__Impl rule__ModelValuePredicate__Group__1 ;
    public final void rule__ModelValuePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2491:1: ( rule__ModelValuePredicate__Group__0__Impl rule__ModelValuePredicate__Group__1 )
            // InternalQueryDsl.g:2492:2: rule__ModelValuePredicate__Group__0__Impl rule__ModelValuePredicate__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ModelValuePredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__0"


    // $ANTLR start "rule__ModelValuePredicate__Group__0__Impl"
    // InternalQueryDsl.g:2499:1: rule__ModelValuePredicate__Group__0__Impl : ( () ) ;
    public final void rule__ModelValuePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2503:1: ( ( () ) )
            // InternalQueryDsl.g:2504:1: ( () )
            {
            // InternalQueryDsl.g:2504:1: ( () )
            // InternalQueryDsl.g:2505:2: ()
            {
             before(grammarAccess.getModelValuePredicateAccess().getModelValueComparisonPredicateAction_0()); 
            // InternalQueryDsl.g:2506:2: ()
            // InternalQueryDsl.g:2506:3: 
            {
            }

             after(grammarAccess.getModelValuePredicateAccess().getModelValueComparisonPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__0__Impl"


    // $ANTLR start "rule__ModelValuePredicate__Group__1"
    // InternalQueryDsl.g:2514:1: rule__ModelValuePredicate__Group__1 : rule__ModelValuePredicate__Group__1__Impl rule__ModelValuePredicate__Group__2 ;
    public final void rule__ModelValuePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2518:1: ( rule__ModelValuePredicate__Group__1__Impl rule__ModelValuePredicate__Group__2 )
            // InternalQueryDsl.g:2519:2: rule__ModelValuePredicate__Group__1__Impl rule__ModelValuePredicate__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ModelValuePredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__1"


    // $ANTLR start "rule__ModelValuePredicate__Group__1__Impl"
    // InternalQueryDsl.g:2526:1: rule__ModelValuePredicate__Group__1__Impl : ( ( rule__ModelValuePredicate__NotAssignment_1 )? ) ;
    public final void rule__ModelValuePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2530:1: ( ( ( rule__ModelValuePredicate__NotAssignment_1 )? ) )
            // InternalQueryDsl.g:2531:1: ( ( rule__ModelValuePredicate__NotAssignment_1 )? )
            {
            // InternalQueryDsl.g:2531:1: ( ( rule__ModelValuePredicate__NotAssignment_1 )? )
            // InternalQueryDsl.g:2532:2: ( rule__ModelValuePredicate__NotAssignment_1 )?
            {
             before(grammarAccess.getModelValuePredicateAccess().getNotAssignment_1()); 
            // InternalQueryDsl.g:2533:2: ( rule__ModelValuePredicate__NotAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalQueryDsl.g:2533:3: rule__ModelValuePredicate__NotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ModelValuePredicate__NotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelValuePredicateAccess().getNotAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__1__Impl"


    // $ANTLR start "rule__ModelValuePredicate__Group__2"
    // InternalQueryDsl.g:2541:1: rule__ModelValuePredicate__Group__2 : rule__ModelValuePredicate__Group__2__Impl rule__ModelValuePredicate__Group__3 ;
    public final void rule__ModelValuePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2545:1: ( rule__ModelValuePredicate__Group__2__Impl rule__ModelValuePredicate__Group__3 )
            // InternalQueryDsl.g:2546:2: rule__ModelValuePredicate__Group__2__Impl rule__ModelValuePredicate__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ModelValuePredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__2"


    // $ANTLR start "rule__ModelValuePredicate__Group__2__Impl"
    // InternalQueryDsl.g:2553:1: rule__ModelValuePredicate__Group__2__Impl : ( ( rule__ModelValuePredicate__LeftAssignment_2 ) ) ;
    public final void rule__ModelValuePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2557:1: ( ( ( rule__ModelValuePredicate__LeftAssignment_2 ) ) )
            // InternalQueryDsl.g:2558:1: ( ( rule__ModelValuePredicate__LeftAssignment_2 ) )
            {
            // InternalQueryDsl.g:2558:1: ( ( rule__ModelValuePredicate__LeftAssignment_2 ) )
            // InternalQueryDsl.g:2559:2: ( rule__ModelValuePredicate__LeftAssignment_2 )
            {
             before(grammarAccess.getModelValuePredicateAccess().getLeftAssignment_2()); 
            // InternalQueryDsl.g:2560:2: ( rule__ModelValuePredicate__LeftAssignment_2 )
            // InternalQueryDsl.g:2560:3: rule__ModelValuePredicate__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelValuePredicateAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__2__Impl"


    // $ANTLR start "rule__ModelValuePredicate__Group__3"
    // InternalQueryDsl.g:2568:1: rule__ModelValuePredicate__Group__3 : rule__ModelValuePredicate__Group__3__Impl rule__ModelValuePredicate__Group__4 ;
    public final void rule__ModelValuePredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2572:1: ( rule__ModelValuePredicate__Group__3__Impl rule__ModelValuePredicate__Group__4 )
            // InternalQueryDsl.g:2573:2: rule__ModelValuePredicate__Group__3__Impl rule__ModelValuePredicate__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__ModelValuePredicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__3"


    // $ANTLR start "rule__ModelValuePredicate__Group__3__Impl"
    // InternalQueryDsl.g:2580:1: rule__ModelValuePredicate__Group__3__Impl : ( ( rule__ModelValuePredicate__ComparisonTypeAssignment_3 ) ) ;
    public final void rule__ModelValuePredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2584:1: ( ( ( rule__ModelValuePredicate__ComparisonTypeAssignment_3 ) ) )
            // InternalQueryDsl.g:2585:1: ( ( rule__ModelValuePredicate__ComparisonTypeAssignment_3 ) )
            {
            // InternalQueryDsl.g:2585:1: ( ( rule__ModelValuePredicate__ComparisonTypeAssignment_3 ) )
            // InternalQueryDsl.g:2586:2: ( rule__ModelValuePredicate__ComparisonTypeAssignment_3 )
            {
             before(grammarAccess.getModelValuePredicateAccess().getComparisonTypeAssignment_3()); 
            // InternalQueryDsl.g:2587:2: ( rule__ModelValuePredicate__ComparisonTypeAssignment_3 )
            // InternalQueryDsl.g:2587:3: rule__ModelValuePredicate__ComparisonTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__ComparisonTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getModelValuePredicateAccess().getComparisonTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__3__Impl"


    // $ANTLR start "rule__ModelValuePredicate__Group__4"
    // InternalQueryDsl.g:2595:1: rule__ModelValuePredicate__Group__4 : rule__ModelValuePredicate__Group__4__Impl rule__ModelValuePredicate__Group__5 ;
    public final void rule__ModelValuePredicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2599:1: ( rule__ModelValuePredicate__Group__4__Impl rule__ModelValuePredicate__Group__5 )
            // InternalQueryDsl.g:2600:2: rule__ModelValuePredicate__Group__4__Impl rule__ModelValuePredicate__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ModelValuePredicate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__4"


    // $ANTLR start "rule__ModelValuePredicate__Group__4__Impl"
    // InternalQueryDsl.g:2607:1: rule__ModelValuePredicate__Group__4__Impl : ( '{' ) ;
    public final void rule__ModelValuePredicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2611:1: ( ( '{' ) )
            // InternalQueryDsl.g:2612:1: ( '{' )
            {
            // InternalQueryDsl.g:2612:1: ( '{' )
            // InternalQueryDsl.g:2613:2: '{'
            {
             before(grammarAccess.getModelValuePredicateAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getModelValuePredicateAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__4__Impl"


    // $ANTLR start "rule__ModelValuePredicate__Group__5"
    // InternalQueryDsl.g:2622:1: rule__ModelValuePredicate__Group__5 : rule__ModelValuePredicate__Group__5__Impl rule__ModelValuePredicate__Group__6 ;
    public final void rule__ModelValuePredicate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2626:1: ( rule__ModelValuePredicate__Group__5__Impl rule__ModelValuePredicate__Group__6 )
            // InternalQueryDsl.g:2627:2: rule__ModelValuePredicate__Group__5__Impl rule__ModelValuePredicate__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__ModelValuePredicate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__5"


    // $ANTLR start "rule__ModelValuePredicate__Group__5__Impl"
    // InternalQueryDsl.g:2634:1: rule__ModelValuePredicate__Group__5__Impl : ( ( rule__ModelValuePredicate__RightAssignment_5 ) ) ;
    public final void rule__ModelValuePredicate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2638:1: ( ( ( rule__ModelValuePredicate__RightAssignment_5 ) ) )
            // InternalQueryDsl.g:2639:1: ( ( rule__ModelValuePredicate__RightAssignment_5 ) )
            {
            // InternalQueryDsl.g:2639:1: ( ( rule__ModelValuePredicate__RightAssignment_5 ) )
            // InternalQueryDsl.g:2640:2: ( rule__ModelValuePredicate__RightAssignment_5 )
            {
             before(grammarAccess.getModelValuePredicateAccess().getRightAssignment_5()); 
            // InternalQueryDsl.g:2641:2: ( rule__ModelValuePredicate__RightAssignment_5 )
            // InternalQueryDsl.g:2641:3: rule__ModelValuePredicate__RightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getModelValuePredicateAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__5__Impl"


    // $ANTLR start "rule__ModelValuePredicate__Group__6"
    // InternalQueryDsl.g:2649:1: rule__ModelValuePredicate__Group__6 : rule__ModelValuePredicate__Group__6__Impl ;
    public final void rule__ModelValuePredicate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2653:1: ( rule__ModelValuePredicate__Group__6__Impl )
            // InternalQueryDsl.g:2654:2: rule__ModelValuePredicate__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelValuePredicate__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__6"


    // $ANTLR start "rule__ModelValuePredicate__Group__6__Impl"
    // InternalQueryDsl.g:2660:1: rule__ModelValuePredicate__Group__6__Impl : ( '}' ) ;
    public final void rule__ModelValuePredicate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2664:1: ( ( '}' ) )
            // InternalQueryDsl.g:2665:1: ( '}' )
            {
            // InternalQueryDsl.g:2665:1: ( '}' )
            // InternalQueryDsl.g:2666:2: '}'
            {
             before(grammarAccess.getModelValuePredicateAccess().getRightCurlyBracketKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getModelValuePredicateAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__Group__6__Impl"


    // $ANTLR start "rule__ParamValuePredicate__Group__0"
    // InternalQueryDsl.g:2676:1: rule__ParamValuePredicate__Group__0 : rule__ParamValuePredicate__Group__0__Impl rule__ParamValuePredicate__Group__1 ;
    public final void rule__ParamValuePredicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2680:1: ( rule__ParamValuePredicate__Group__0__Impl rule__ParamValuePredicate__Group__1 )
            // InternalQueryDsl.g:2681:2: rule__ParamValuePredicate__Group__0__Impl rule__ParamValuePredicate__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ParamValuePredicate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__0"


    // $ANTLR start "rule__ParamValuePredicate__Group__0__Impl"
    // InternalQueryDsl.g:2688:1: rule__ParamValuePredicate__Group__0__Impl : ( () ) ;
    public final void rule__ParamValuePredicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2692:1: ( ( () ) )
            // InternalQueryDsl.g:2693:1: ( () )
            {
            // InternalQueryDsl.g:2693:1: ( () )
            // InternalQueryDsl.g:2694:2: ()
            {
             before(grammarAccess.getParamValuePredicateAccess().getParamValueComparisonPredicateAction_0()); 
            // InternalQueryDsl.g:2695:2: ()
            // InternalQueryDsl.g:2695:3: 
            {
            }

             after(grammarAccess.getParamValuePredicateAccess().getParamValueComparisonPredicateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__0__Impl"


    // $ANTLR start "rule__ParamValuePredicate__Group__1"
    // InternalQueryDsl.g:2703:1: rule__ParamValuePredicate__Group__1 : rule__ParamValuePredicate__Group__1__Impl rule__ParamValuePredicate__Group__2 ;
    public final void rule__ParamValuePredicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2707:1: ( rule__ParamValuePredicate__Group__1__Impl rule__ParamValuePredicate__Group__2 )
            // InternalQueryDsl.g:2708:2: rule__ParamValuePredicate__Group__1__Impl rule__ParamValuePredicate__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ParamValuePredicate__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__1"


    // $ANTLR start "rule__ParamValuePredicate__Group__1__Impl"
    // InternalQueryDsl.g:2715:1: rule__ParamValuePredicate__Group__1__Impl : ( ( rule__ParamValuePredicate__NotAssignment_1 )? ) ;
    public final void rule__ParamValuePredicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2719:1: ( ( ( rule__ParamValuePredicate__NotAssignment_1 )? ) )
            // InternalQueryDsl.g:2720:1: ( ( rule__ParamValuePredicate__NotAssignment_1 )? )
            {
            // InternalQueryDsl.g:2720:1: ( ( rule__ParamValuePredicate__NotAssignment_1 )? )
            // InternalQueryDsl.g:2721:2: ( rule__ParamValuePredicate__NotAssignment_1 )?
            {
             before(grammarAccess.getParamValuePredicateAccess().getNotAssignment_1()); 
            // InternalQueryDsl.g:2722:2: ( rule__ParamValuePredicate__NotAssignment_1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalQueryDsl.g:2722:3: rule__ParamValuePredicate__NotAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamValuePredicate__NotAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParamValuePredicateAccess().getNotAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__1__Impl"


    // $ANTLR start "rule__ParamValuePredicate__Group__2"
    // InternalQueryDsl.g:2730:1: rule__ParamValuePredicate__Group__2 : rule__ParamValuePredicate__Group__2__Impl rule__ParamValuePredicate__Group__3 ;
    public final void rule__ParamValuePredicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2734:1: ( rule__ParamValuePredicate__Group__2__Impl rule__ParamValuePredicate__Group__3 )
            // InternalQueryDsl.g:2735:2: rule__ParamValuePredicate__Group__2__Impl rule__ParamValuePredicate__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ParamValuePredicate__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__2"


    // $ANTLR start "rule__ParamValuePredicate__Group__2__Impl"
    // InternalQueryDsl.g:2742:1: rule__ParamValuePredicate__Group__2__Impl : ( ( rule__ParamValuePredicate__LeftAssignment_2 ) ) ;
    public final void rule__ParamValuePredicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2746:1: ( ( ( rule__ParamValuePredicate__LeftAssignment_2 ) ) )
            // InternalQueryDsl.g:2747:1: ( ( rule__ParamValuePredicate__LeftAssignment_2 ) )
            {
            // InternalQueryDsl.g:2747:1: ( ( rule__ParamValuePredicate__LeftAssignment_2 ) )
            // InternalQueryDsl.g:2748:2: ( rule__ParamValuePredicate__LeftAssignment_2 )
            {
             before(grammarAccess.getParamValuePredicateAccess().getLeftAssignment_2()); 
            // InternalQueryDsl.g:2749:2: ( rule__ParamValuePredicate__LeftAssignment_2 )
            // InternalQueryDsl.g:2749:3: rule__ParamValuePredicate__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParamValuePredicateAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__2__Impl"


    // $ANTLR start "rule__ParamValuePredicate__Group__3"
    // InternalQueryDsl.g:2757:1: rule__ParamValuePredicate__Group__3 : rule__ParamValuePredicate__Group__3__Impl rule__ParamValuePredicate__Group__4 ;
    public final void rule__ParamValuePredicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2761:1: ( rule__ParamValuePredicate__Group__3__Impl rule__ParamValuePredicate__Group__4 )
            // InternalQueryDsl.g:2762:2: rule__ParamValuePredicate__Group__3__Impl rule__ParamValuePredicate__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ParamValuePredicate__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__3"


    // $ANTLR start "rule__ParamValuePredicate__Group__3__Impl"
    // InternalQueryDsl.g:2769:1: rule__ParamValuePredicate__Group__3__Impl : ( ( rule__ParamValuePredicate__ComparisonTypeAssignment_3 ) ) ;
    public final void rule__ParamValuePredicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2773:1: ( ( ( rule__ParamValuePredicate__ComparisonTypeAssignment_3 ) ) )
            // InternalQueryDsl.g:2774:1: ( ( rule__ParamValuePredicate__ComparisonTypeAssignment_3 ) )
            {
            // InternalQueryDsl.g:2774:1: ( ( rule__ParamValuePredicate__ComparisonTypeAssignment_3 ) )
            // InternalQueryDsl.g:2775:2: ( rule__ParamValuePredicate__ComparisonTypeAssignment_3 )
            {
             before(grammarAccess.getParamValuePredicateAccess().getComparisonTypeAssignment_3()); 
            // InternalQueryDsl.g:2776:2: ( rule__ParamValuePredicate__ComparisonTypeAssignment_3 )
            // InternalQueryDsl.g:2776:3: rule__ParamValuePredicate__ComparisonTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__ComparisonTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParamValuePredicateAccess().getComparisonTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__3__Impl"


    // $ANTLR start "rule__ParamValuePredicate__Group__4"
    // InternalQueryDsl.g:2784:1: rule__ParamValuePredicate__Group__4 : rule__ParamValuePredicate__Group__4__Impl rule__ParamValuePredicate__Group__5 ;
    public final void rule__ParamValuePredicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2788:1: ( rule__ParamValuePredicate__Group__4__Impl rule__ParamValuePredicate__Group__5 )
            // InternalQueryDsl.g:2789:2: rule__ParamValuePredicate__Group__4__Impl rule__ParamValuePredicate__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__ParamValuePredicate__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__4"


    // $ANTLR start "rule__ParamValuePredicate__Group__4__Impl"
    // InternalQueryDsl.g:2796:1: rule__ParamValuePredicate__Group__4__Impl : ( '[' ) ;
    public final void rule__ParamValuePredicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2800:1: ( ( '[' ) )
            // InternalQueryDsl.g:2801:1: ( '[' )
            {
            // InternalQueryDsl.g:2801:1: ( '[' )
            // InternalQueryDsl.g:2802:2: '['
            {
             before(grammarAccess.getParamValuePredicateAccess().getLeftSquareBracketKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getParamValuePredicateAccess().getLeftSquareBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__4__Impl"


    // $ANTLR start "rule__ParamValuePredicate__Group__5"
    // InternalQueryDsl.g:2811:1: rule__ParamValuePredicate__Group__5 : rule__ParamValuePredicate__Group__5__Impl rule__ParamValuePredicate__Group__6 ;
    public final void rule__ParamValuePredicate__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2815:1: ( rule__ParamValuePredicate__Group__5__Impl rule__ParamValuePredicate__Group__6 )
            // InternalQueryDsl.g:2816:2: rule__ParamValuePredicate__Group__5__Impl rule__ParamValuePredicate__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__ParamValuePredicate__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__5"


    // $ANTLR start "rule__ParamValuePredicate__Group__5__Impl"
    // InternalQueryDsl.g:2823:1: rule__ParamValuePredicate__Group__5__Impl : ( ( rule__ParamValuePredicate__RightAssignment_5 ) ) ;
    public final void rule__ParamValuePredicate__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2827:1: ( ( ( rule__ParamValuePredicate__RightAssignment_5 ) ) )
            // InternalQueryDsl.g:2828:1: ( ( rule__ParamValuePredicate__RightAssignment_5 ) )
            {
            // InternalQueryDsl.g:2828:1: ( ( rule__ParamValuePredicate__RightAssignment_5 ) )
            // InternalQueryDsl.g:2829:2: ( rule__ParamValuePredicate__RightAssignment_5 )
            {
             before(grammarAccess.getParamValuePredicateAccess().getRightAssignment_5()); 
            // InternalQueryDsl.g:2830:2: ( rule__ParamValuePredicate__RightAssignment_5 )
            // InternalQueryDsl.g:2830:3: rule__ParamValuePredicate__RightAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__RightAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getParamValuePredicateAccess().getRightAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__5__Impl"


    // $ANTLR start "rule__ParamValuePredicate__Group__6"
    // InternalQueryDsl.g:2838:1: rule__ParamValuePredicate__Group__6 : rule__ParamValuePredicate__Group__6__Impl ;
    public final void rule__ParamValuePredicate__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2842:1: ( rule__ParamValuePredicate__Group__6__Impl )
            // InternalQueryDsl.g:2843:2: rule__ParamValuePredicate__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamValuePredicate__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__6"


    // $ANTLR start "rule__ParamValuePredicate__Group__6__Impl"
    // InternalQueryDsl.g:2849:1: rule__ParamValuePredicate__Group__6__Impl : ( ']' ) ;
    public final void rule__ParamValuePredicate__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2853:1: ( ( ']' ) )
            // InternalQueryDsl.g:2854:1: ( ']' )
            {
            // InternalQueryDsl.g:2854:1: ( ']' )
            // InternalQueryDsl.g:2855:2: ']'
            {
             before(grammarAccess.getParamValuePredicateAccess().getRightSquareBracketKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getParamValuePredicateAccess().getRightSquareBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__Group__6__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__0"
    // InternalQueryDsl.g:2865:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2869:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // InternalQueryDsl.g:2870:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0"


    // $ANTLR start "rule__CompositeCondition__Group__0__Impl"
    // InternalQueryDsl.g:2877:1: rule__CompositeCondition__Group__0__Impl : ( () ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2881:1: ( ( () ) )
            // InternalQueryDsl.g:2882:1: ( () )
            {
            // InternalQueryDsl.g:2882:1: ( () )
            // InternalQueryDsl.g:2883:2: ()
            {
             before(grammarAccess.getCompositeConditionAccess().getCompositeConditionAction_0()); 
            // InternalQueryDsl.g:2884:2: ()
            // InternalQueryDsl.g:2884:3: 
            {
            }

             after(grammarAccess.getCompositeConditionAccess().getCompositeConditionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__1"
    // InternalQueryDsl.g:2892:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2896:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // InternalQueryDsl.g:2897:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1"


    // $ANTLR start "rule__CompositeCondition__Group__1__Impl"
    // InternalQueryDsl.g:2904:1: rule__CompositeCondition__Group__1__Impl : ( ( rule__CompositeCondition__PredicateAssignment_1 ) ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2908:1: ( ( ( rule__CompositeCondition__PredicateAssignment_1 ) ) )
            // InternalQueryDsl.g:2909:1: ( ( rule__CompositeCondition__PredicateAssignment_1 ) )
            {
            // InternalQueryDsl.g:2909:1: ( ( rule__CompositeCondition__PredicateAssignment_1 ) )
            // InternalQueryDsl.g:2910:2: ( rule__CompositeCondition__PredicateAssignment_1 )
            {
             before(grammarAccess.getCompositeConditionAccess().getPredicateAssignment_1()); 
            // InternalQueryDsl.g:2911:2: ( rule__CompositeCondition__PredicateAssignment_1 )
            // InternalQueryDsl.g:2911:3: rule__CompositeCondition__PredicateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__PredicateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConditionAccess().getPredicateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__2"
    // InternalQueryDsl.g:2919:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2923:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // InternalQueryDsl.g:2924:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2"


    // $ANTLR start "rule__CompositeCondition__Group__2__Impl"
    // InternalQueryDsl.g:2931:1: rule__CompositeCondition__Group__2__Impl : ( ( rule__CompositeCondition__ConnectionAssignment_2 ) ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2935:1: ( ( ( rule__CompositeCondition__ConnectionAssignment_2 ) ) )
            // InternalQueryDsl.g:2936:1: ( ( rule__CompositeCondition__ConnectionAssignment_2 ) )
            {
            // InternalQueryDsl.g:2936:1: ( ( rule__CompositeCondition__ConnectionAssignment_2 ) )
            // InternalQueryDsl.g:2937:2: ( rule__CompositeCondition__ConnectionAssignment_2 )
            {
             before(grammarAccess.getCompositeConditionAccess().getConnectionAssignment_2()); 
            // InternalQueryDsl.g:2938:2: ( rule__CompositeCondition__ConnectionAssignment_2 )
            // InternalQueryDsl.g:2938:3: rule__CompositeCondition__ConnectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__ConnectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConditionAccess().getConnectionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__3"
    // InternalQueryDsl.g:2946:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2950:1: ( rule__CompositeCondition__Group__3__Impl )
            // InternalQueryDsl.g:2951:2: rule__CompositeCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3"


    // $ANTLR start "rule__CompositeCondition__Group__3__Impl"
    // InternalQueryDsl.g:2957:1: rule__CompositeCondition__Group__3__Impl : ( ( rule__CompositeCondition__OnAssignment_3 ) ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2961:1: ( ( ( rule__CompositeCondition__OnAssignment_3 ) ) )
            // InternalQueryDsl.g:2962:1: ( ( rule__CompositeCondition__OnAssignment_3 ) )
            {
            // InternalQueryDsl.g:2962:1: ( ( rule__CompositeCondition__OnAssignment_3 ) )
            // InternalQueryDsl.g:2963:2: ( rule__CompositeCondition__OnAssignment_3 )
            {
             before(grammarAccess.getCompositeConditionAccess().getOnAssignment_3()); 
            // InternalQueryDsl.g:2964:2: ( rule__CompositeCondition__OnAssignment_3 )
            // InternalQueryDsl.g:2964:3: rule__CompositeCondition__OnAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CompositeCondition__OnAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCompositeConditionAccess().getOnAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3__Impl"


    // $ANTLR start "rule__QuerySet__NameAssignment_2"
    // InternalQueryDsl.g:2973:1: rule__QuerySet__NameAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__QuerySet__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2977:1: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:2978:2: ( ruleQualifiedName )
            {
            // InternalQueryDsl.g:2978:2: ( ruleQualifiedName )
            // InternalQueryDsl.g:2979:3: ruleQualifiedName
            {
             before(grammarAccess.getQuerySetAccess().getNameQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQuerySetAccess().getNameQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__NameAssignment_2"


    // $ANTLR start "rule__QuerySet__ImportedNamespaceAssignment_4_1"
    // InternalQueryDsl.g:2988:1: rule__QuerySet__ImportedNamespaceAssignment_4_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__QuerySet__ImportedNamespaceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2992:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalQueryDsl.g:2993:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalQueryDsl.g:2993:2: ( ruleQualifiedNameWithWildcard )
            // InternalQueryDsl.g:2994:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getQuerySetAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQuerySetAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__ImportedNamespaceAssignment_4_1"


    // $ANTLR start "rule__QuerySet__ImportedNamespaceAssignment_4_2_1"
    // InternalQueryDsl.g:3003:1: rule__QuerySet__ImportedNamespaceAssignment_4_2_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__QuerySet__ImportedNamespaceAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3007:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalQueryDsl.g:3008:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalQueryDsl.g:3008:2: ( ruleQualifiedNameWithWildcard )
            // InternalQueryDsl.g:3009:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getQuerySetAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_4_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQuerySetAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__ImportedNamespaceAssignment_4_2_1"


    // $ANTLR start "rule__QuerySet__QueriesAssignment_5_0"
    // InternalQueryDsl.g:3018:1: rule__QuerySet__QueriesAssignment_5_0 : ( ruleSelect ) ;
    public final void rule__QuerySet__QueriesAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3022:1: ( ( ruleSelect ) )
            // InternalQueryDsl.g:3023:2: ( ruleSelect )
            {
            // InternalQueryDsl.g:3023:2: ( ruleSelect )
            // InternalQueryDsl.g:3024:3: ruleSelect
            {
             before(grammarAccess.getQuerySetAccess().getQueriesSelectParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getQuerySetAccess().getQueriesSelectParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__QueriesAssignment_5_0"


    // $ANTLR start "rule__QuerySet__QueriesAssignment_5_1"
    // InternalQueryDsl.g:3033:1: rule__QuerySet__QueriesAssignment_5_1 : ( ruleSelect ) ;
    public final void rule__QuerySet__QueriesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3037:1: ( ( ruleSelect ) )
            // InternalQueryDsl.g:3038:2: ( ruleSelect )
            {
            // InternalQueryDsl.g:3038:2: ( ruleSelect )
            // InternalQueryDsl.g:3039:3: ruleSelect
            {
             before(grammarAccess.getQuerySetAccess().getQueriesSelectParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getQuerySetAccess().getQueriesSelectParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QuerySet__QueriesAssignment_5_1"


    // $ANTLR start "rule__Select__NameAssignment_1"
    // InternalQueryDsl.g:3048:1: rule__Select__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Select__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3052:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:3053:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:3053:2: ( RULE_ID )
            // InternalQueryDsl.g:3054:3: RULE_ID
            {
             before(grammarAccess.getSelectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__NameAssignment_1"


    // $ANTLR start "rule__Select__ParamsAssignment_2_1"
    // InternalQueryDsl.g:3063:1: rule__Select__ParamsAssignment_2_1 : ( ruleQueryParam ) ;
    public final void rule__Select__ParamsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3067:1: ( ( ruleQueryParam ) )
            // InternalQueryDsl.g:3068:2: ( ruleQueryParam )
            {
            // InternalQueryDsl.g:3068:2: ( ruleQueryParam )
            // InternalQueryDsl.g:3069:3: ruleQueryParam
            {
             before(grammarAccess.getSelectAccess().getParamsQueryParamParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryParam();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getParamsQueryParamParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ParamsAssignment_2_1"


    // $ANTLR start "rule__Select__ParamsAssignment_2_2_1"
    // InternalQueryDsl.g:3078:1: rule__Select__ParamsAssignment_2_2_1 : ( ruleQueryParam ) ;
    public final void rule__Select__ParamsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3082:1: ( ( ruleQueryParam ) )
            // InternalQueryDsl.g:3083:2: ( ruleQueryParam )
            {
            // InternalQueryDsl.g:3083:2: ( ruleQueryParam )
            // InternalQueryDsl.g:3084:3: ruleQueryParam
            {
             before(grammarAccess.getSelectAccess().getParamsQueryParamParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryParam();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getParamsQueryParamParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__ParamsAssignment_2_2_1"


    // $ANTLR start "rule__Select__SelectAllAssignment_5_0"
    // InternalQueryDsl.g:3093:1: rule__Select__SelectAllAssignment_5_0 : ( ( '*' ) ) ;
    public final void rule__Select__SelectAllAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3097:1: ( ( ( '*' ) ) )
            // InternalQueryDsl.g:3098:2: ( ( '*' ) )
            {
            // InternalQueryDsl.g:3098:2: ( ( '*' ) )
            // InternalQueryDsl.g:3099:3: ( '*' )
            {
             before(grammarAccess.getSelectAccess().getSelectAllAsteriskKeyword_5_0_0()); 
            // InternalQueryDsl.g:3100:3: ( '*' )
            // InternalQueryDsl.g:3101:4: '*'
            {
             before(grammarAccess.getSelectAccess().getSelectAllAsteriskKeyword_5_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectAllAsteriskKeyword_5_0_0()); 

            }

             after(grammarAccess.getSelectAccess().getSelectAllAsteriskKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelectAllAssignment_5_0"


    // $ANTLR start "rule__Select__SelectionAssignment_5_1_0"
    // InternalQueryDsl.g:3112:1: rule__Select__SelectionAssignment_5_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Select__SelectionAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3116:1: ( ( ( RULE_ID ) ) )
            // InternalQueryDsl.g:3117:2: ( ( RULE_ID ) )
            {
            // InternalQueryDsl.g:3117:2: ( ( RULE_ID ) )
            // InternalQueryDsl.g:3118:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectAccess().getSelectionDataPropertyCrossReference_5_1_0_0()); 
            // InternalQueryDsl.g:3119:3: ( RULE_ID )
            // InternalQueryDsl.g:3120:4: RULE_ID
            {
             before(grammarAccess.getSelectAccess().getSelectionDataPropertyIDTerminalRuleCall_5_1_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectionDataPropertyIDTerminalRuleCall_5_1_0_0_1()); 

            }

             after(grammarAccess.getSelectAccess().getSelectionDataPropertyCrossReference_5_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelectionAssignment_5_1_0"


    // $ANTLR start "rule__Select__SelectionAssignment_5_1_1_1"
    // InternalQueryDsl.g:3131:1: rule__Select__SelectionAssignment_5_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Select__SelectionAssignment_5_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3135:1: ( ( ( RULE_ID ) ) )
            // InternalQueryDsl.g:3136:2: ( ( RULE_ID ) )
            {
            // InternalQueryDsl.g:3136:2: ( ( RULE_ID ) )
            // InternalQueryDsl.g:3137:3: ( RULE_ID )
            {
             before(grammarAccess.getSelectAccess().getSelectionDataPropertyCrossReference_5_1_1_1_0()); 
            // InternalQueryDsl.g:3138:3: ( RULE_ID )
            // InternalQueryDsl.g:3139:4: RULE_ID
            {
             before(grammarAccess.getSelectAccess().getSelectionDataPropertyIDTerminalRuleCall_5_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSelectionDataPropertyIDTerminalRuleCall_5_1_1_1_0_1()); 

            }

             after(grammarAccess.getSelectAccess().getSelectionDataPropertyCrossReference_5_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__SelectionAssignment_5_1_1_1"


    // $ANTLR start "rule__Select__FromAssignment_6_1_0_0"
    // InternalQueryDsl.g:3150:1: rule__Select__FromAssignment_6_1_0_0 : ( ruleSimpleFrom ) ;
    public final void rule__Select__FromAssignment_6_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3154:1: ( ( ruleSimpleFrom ) )
            // InternalQueryDsl.g:3155:2: ( ruleSimpleFrom )
            {
            // InternalQueryDsl.g:3155:2: ( ruleSimpleFrom )
            // InternalQueryDsl.g:3156:3: ruleSimpleFrom
            {
             before(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleFrom();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__FromAssignment_6_1_0_0"


    // $ANTLR start "rule__Select__FromAssignment_6_1_0_1_1"
    // InternalQueryDsl.g:3165:1: rule__Select__FromAssignment_6_1_0_1_1 : ( ruleSimpleFrom ) ;
    public final void rule__Select__FromAssignment_6_1_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3169:1: ( ( ruleSimpleFrom ) )
            // InternalQueryDsl.g:3170:2: ( ruleSimpleFrom )
            {
            // InternalQueryDsl.g:3170:2: ( ruleSimpleFrom )
            // InternalQueryDsl.g:3171:3: ruleSimpleFrom
            {
             before(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_0_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleFrom();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__FromAssignment_6_1_0_1_1"


    // $ANTLR start "rule__Select__FromAssignment_6_1_1_0"
    // InternalQueryDsl.g:3180:1: rule__Select__FromAssignment_6_1_1_0 : ( ruleSimpleFrom ) ;
    public final void rule__Select__FromAssignment_6_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3184:1: ( ( ruleSimpleFrom ) )
            // InternalQueryDsl.g:3185:2: ( ruleSimpleFrom )
            {
            // InternalQueryDsl.g:3185:2: ( ruleSimpleFrom )
            // InternalQueryDsl.g:3186:3: ruleSimpleFrom
            {
             before(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleFrom();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getFromSimpleFromParserRuleCall_6_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__FromAssignment_6_1_1_0"


    // $ANTLR start "rule__Select__FromAssignment_6_1_1_1"
    // InternalQueryDsl.g:3195:1: rule__Select__FromAssignment_6_1_1_1 : ( ruleCompositeFrom ) ;
    public final void rule__Select__FromAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3199:1: ( ( ruleCompositeFrom ) )
            // InternalQueryDsl.g:3200:2: ( ruleCompositeFrom )
            {
            // InternalQueryDsl.g:3200:2: ( ruleCompositeFrom )
            // InternalQueryDsl.g:3201:3: ruleCompositeFrom
            {
             before(grammarAccess.getSelectAccess().getFromCompositeFromParserRuleCall_6_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositeFrom();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getFromCompositeFromParserRuleCall_6_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__FromAssignment_6_1_1_1"


    // $ANTLR start "rule__Select__WhereAssignment_7_1"
    // InternalQueryDsl.g:3210:1: rule__Select__WhereAssignment_7_1 : ( ruleCondition ) ;
    public final void rule__Select__WhereAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3214:1: ( ( ruleCondition ) )
            // InternalQueryDsl.g:3215:2: ( ruleCondition )
            {
            // InternalQueryDsl.g:3215:2: ( ruleCondition )
            // InternalQueryDsl.g:3216:3: ruleCondition
            {
             before(grammarAccess.getSelectAccess().getWhereConditionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getSelectAccess().getWhereConditionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Select__WhereAssignment_7_1"


    // $ANTLR start "rule__QueryParam__TypeAssignment_0"
    // InternalQueryDsl.g:3225:1: rule__QueryParam__TypeAssignment_0 : ( ruleType ) ;
    public final void rule__QueryParam__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3229:1: ( ( ruleType ) )
            // InternalQueryDsl.g:3230:2: ( ruleType )
            {
            // InternalQueryDsl.g:3230:2: ( ruleType )
            // InternalQueryDsl.g:3231:3: ruleType
            {
             before(grammarAccess.getQueryParamAccess().getTypeTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleType();

            state._fsp--;

             after(grammarAccess.getQueryParamAccess().getTypeTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__TypeAssignment_0"


    // $ANTLR start "rule__QueryParam__NameAssignment_1"
    // InternalQueryDsl.g:3240:1: rule__QueryParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QueryParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3244:1: ( ( RULE_ID ) )
            // InternalQueryDsl.g:3245:2: ( RULE_ID )
            {
            // InternalQueryDsl.g:3245:2: ( RULE_ID )
            // InternalQueryDsl.g:3246:3: RULE_ID
            {
             before(grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__NameAssignment_1"


    // $ANTLR start "rule__SimpleFrom__SourceAssignment_1"
    // InternalQueryDsl.g:3255:1: rule__SimpleFrom__SourceAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleFrom__SourceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3259:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQueryDsl.g:3260:2: ( ( ruleQualifiedName ) )
            {
            // InternalQueryDsl.g:3260:2: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:3261:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleFromAccess().getSourceSemanticNodeCrossReference_1_0()); 
            // InternalQueryDsl.g:3262:3: ( ruleQualifiedName )
            // InternalQueryDsl.g:3263:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleFromAccess().getSourceSemanticNodeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleFromAccess().getSourceSemanticNodeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSimpleFromAccess().getSourceSemanticNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleFrom__SourceAssignment_1"


    // $ANTLR start "rule__CompositeFrom__JoinAssignment_1"
    // InternalQueryDsl.g:3274:1: rule__CompositeFrom__JoinAssignment_1 : ( ruleJoinType ) ;
    public final void rule__CompositeFrom__JoinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3278:1: ( ( ruleJoinType ) )
            // InternalQueryDsl.g:3279:2: ( ruleJoinType )
            {
            // InternalQueryDsl.g:3279:2: ( ruleJoinType )
            // InternalQueryDsl.g:3280:3: ruleJoinType
            {
             before(grammarAccess.getCompositeFromAccess().getJoinJoinTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJoinType();

            state._fsp--;

             after(grammarAccess.getCompositeFromAccess().getJoinJoinTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__JoinAssignment_1"


    // $ANTLR start "rule__CompositeFrom__SourceAssignment_2"
    // InternalQueryDsl.g:3289:1: rule__CompositeFrom__SourceAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CompositeFrom__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3293:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQueryDsl.g:3294:2: ( ( ruleQualifiedName ) )
            {
            // InternalQueryDsl.g:3294:2: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:3295:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositeFromAccess().getSourceSemanticNodeCrossReference_2_0()); 
            // InternalQueryDsl.g:3296:3: ( ruleQualifiedName )
            // InternalQueryDsl.g:3297:4: ruleQualifiedName
            {
             before(grammarAccess.getCompositeFromAccess().getSourceSemanticNodeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompositeFromAccess().getSourceSemanticNodeQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCompositeFromAccess().getSourceSemanticNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__SourceAssignment_2"


    // $ANTLR start "rule__CompositeFrom__OnAssignment_4"
    // InternalQueryDsl.g:3308:1: rule__CompositeFrom__OnAssignment_4 : ( ruleCondition ) ;
    public final void rule__CompositeFrom__OnAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3312:1: ( ( ruleCondition ) )
            // InternalQueryDsl.g:3313:2: ( ruleCondition )
            {
            // InternalQueryDsl.g:3313:2: ( ruleCondition )
            // InternalQueryDsl.g:3314:3: ruleCondition
            {
             before(grammarAccess.getCompositeFromAccess().getOnConditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCompositeFromAccess().getOnConditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeFrom__OnAssignment_4"


    // $ANTLR start "rule__SimpleCondition__PredicateAssignment_1"
    // InternalQueryDsl.g:3323:1: rule__SimpleCondition__PredicateAssignment_1 : ( rulePredicate ) ;
    public final void rule__SimpleCondition__PredicateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3327:1: ( ( rulePredicate ) )
            // InternalQueryDsl.g:3328:2: ( rulePredicate )
            {
            // InternalQueryDsl.g:3328:2: ( rulePredicate )
            // InternalQueryDsl.g:3329:3: rulePredicate
            {
             before(grammarAccess.getSimpleConditionAccess().getPredicatePredicateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getSimpleConditionAccess().getPredicatePredicateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleCondition__PredicateAssignment_1"


    // $ANTLR start "rule__PrimitiveValuePredicate__NotAssignment_1"
    // InternalQueryDsl.g:3338:1: rule__PrimitiveValuePredicate__NotAssignment_1 : ( ( 'not' ) ) ;
    public final void rule__PrimitiveValuePredicate__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3342:1: ( ( ( 'not' ) ) )
            // InternalQueryDsl.g:3343:2: ( ( 'not' ) )
            {
            // InternalQueryDsl.g:3343:2: ( ( 'not' ) )
            // InternalQueryDsl.g:3344:3: ( 'not' )
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getNotNotKeyword_1_0()); 
            // InternalQueryDsl.g:3345:3: ( 'not' )
            // InternalQueryDsl.g:3346:4: 'not'
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getNotNotKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPrimitiveValuePredicateAccess().getNotNotKeyword_1_0()); 

            }

             after(grammarAccess.getPrimitiveValuePredicateAccess().getNotNotKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__NotAssignment_1"


    // $ANTLR start "rule__PrimitiveValuePredicate__LeftAssignment_2"
    // InternalQueryDsl.g:3357:1: rule__PrimitiveValuePredicate__LeftAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__PrimitiveValuePredicate__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3361:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQueryDsl.g:3362:2: ( ( ruleQualifiedName ) )
            {
            // InternalQueryDsl.g:3362:2: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:3363:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getLeftDataPropertyCrossReference_2_0()); 
            // InternalQueryDsl.g:3364:3: ( ruleQualifiedName )
            // InternalQueryDsl.g:3365:4: ruleQualifiedName
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getLeftDataPropertyQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPrimitiveValuePredicateAccess().getLeftDataPropertyQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPrimitiveValuePredicateAccess().getLeftDataPropertyCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__LeftAssignment_2"


    // $ANTLR start "rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3"
    // InternalQueryDsl.g:3376:1: rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3 : ( ruleComparisonType ) ;
    public final void rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3380:1: ( ( ruleComparisonType ) )
            // InternalQueryDsl.g:3381:2: ( ruleComparisonType )
            {
            // InternalQueryDsl.g:3381:2: ( ruleComparisonType )
            // InternalQueryDsl.g:3382:3: ruleComparisonType
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonType();

            state._fsp--;

             after(grammarAccess.getPrimitiveValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__ComparisonTypeAssignment_3"


    // $ANTLR start "rule__PrimitiveValuePredicate__ValueAssignment_4"
    // InternalQueryDsl.g:3391:1: rule__PrimitiveValuePredicate__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__PrimitiveValuePredicate__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3395:1: ( ( ruleEString ) )
            // InternalQueryDsl.g:3396:2: ( ruleEString )
            {
            // InternalQueryDsl.g:3396:2: ( ruleEString )
            // InternalQueryDsl.g:3397:3: ruleEString
            {
             before(grammarAccess.getPrimitiveValuePredicateAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPrimitiveValuePredicateAccess().getValueEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveValuePredicate__ValueAssignment_4"


    // $ANTLR start "rule__ModelValuePredicate__NotAssignment_1"
    // InternalQueryDsl.g:3406:1: rule__ModelValuePredicate__NotAssignment_1 : ( ( 'not' ) ) ;
    public final void rule__ModelValuePredicate__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3410:1: ( ( ( 'not' ) ) )
            // InternalQueryDsl.g:3411:2: ( ( 'not' ) )
            {
            // InternalQueryDsl.g:3411:2: ( ( 'not' ) )
            // InternalQueryDsl.g:3412:3: ( 'not' )
            {
             before(grammarAccess.getModelValuePredicateAccess().getNotNotKeyword_1_0()); 
            // InternalQueryDsl.g:3413:3: ( 'not' )
            // InternalQueryDsl.g:3414:4: 'not'
            {
             before(grammarAccess.getModelValuePredicateAccess().getNotNotKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getModelValuePredicateAccess().getNotNotKeyword_1_0()); 

            }

             after(grammarAccess.getModelValuePredicateAccess().getNotNotKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__NotAssignment_1"


    // $ANTLR start "rule__ModelValuePredicate__LeftAssignment_2"
    // InternalQueryDsl.g:3425:1: rule__ModelValuePredicate__LeftAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ModelValuePredicate__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3429:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQueryDsl.g:3430:2: ( ( ruleQualifiedName ) )
            {
            // InternalQueryDsl.g:3430:2: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:3431:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getModelValuePredicateAccess().getLeftDataPropertyCrossReference_2_0()); 
            // InternalQueryDsl.g:3432:3: ( ruleQualifiedName )
            // InternalQueryDsl.g:3433:4: ruleQualifiedName
            {
             before(grammarAccess.getModelValuePredicateAccess().getLeftDataPropertyQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelValuePredicateAccess().getLeftDataPropertyQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getModelValuePredicateAccess().getLeftDataPropertyCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__LeftAssignment_2"


    // $ANTLR start "rule__ModelValuePredicate__ComparisonTypeAssignment_3"
    // InternalQueryDsl.g:3444:1: rule__ModelValuePredicate__ComparisonTypeAssignment_3 : ( ruleComparisonType ) ;
    public final void rule__ModelValuePredicate__ComparisonTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3448:1: ( ( ruleComparisonType ) )
            // InternalQueryDsl.g:3449:2: ( ruleComparisonType )
            {
            // InternalQueryDsl.g:3449:2: ( ruleComparisonType )
            // InternalQueryDsl.g:3450:3: ruleComparisonType
            {
             before(grammarAccess.getModelValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonType();

            state._fsp--;

             after(grammarAccess.getModelValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__ComparisonTypeAssignment_3"


    // $ANTLR start "rule__ModelValuePredicate__RightAssignment_5"
    // InternalQueryDsl.g:3459:1: rule__ModelValuePredicate__RightAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ModelValuePredicate__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3463:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQueryDsl.g:3464:2: ( ( ruleQualifiedName ) )
            {
            // InternalQueryDsl.g:3464:2: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:3465:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getModelValuePredicateAccess().getRightDataPropertyCrossReference_5_0()); 
            // InternalQueryDsl.g:3466:3: ( ruleQualifiedName )
            // InternalQueryDsl.g:3467:4: ruleQualifiedName
            {
             before(grammarAccess.getModelValuePredicateAccess().getRightDataPropertyQualifiedNameParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getModelValuePredicateAccess().getRightDataPropertyQualifiedNameParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getModelValuePredicateAccess().getRightDataPropertyCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelValuePredicate__RightAssignment_5"


    // $ANTLR start "rule__ParamValuePredicate__NotAssignment_1"
    // InternalQueryDsl.g:3478:1: rule__ParamValuePredicate__NotAssignment_1 : ( ( 'not' ) ) ;
    public final void rule__ParamValuePredicate__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3482:1: ( ( ( 'not' ) ) )
            // InternalQueryDsl.g:3483:2: ( ( 'not' ) )
            {
            // InternalQueryDsl.g:3483:2: ( ( 'not' ) )
            // InternalQueryDsl.g:3484:3: ( 'not' )
            {
             before(grammarAccess.getParamValuePredicateAccess().getNotNotKeyword_1_0()); 
            // InternalQueryDsl.g:3485:3: ( 'not' )
            // InternalQueryDsl.g:3486:4: 'not'
            {
             before(grammarAccess.getParamValuePredicateAccess().getNotNotKeyword_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getParamValuePredicateAccess().getNotNotKeyword_1_0()); 

            }

             after(grammarAccess.getParamValuePredicateAccess().getNotNotKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__NotAssignment_1"


    // $ANTLR start "rule__ParamValuePredicate__LeftAssignment_2"
    // InternalQueryDsl.g:3497:1: rule__ParamValuePredicate__LeftAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ParamValuePredicate__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3501:1: ( ( ( ruleQualifiedName ) ) )
            // InternalQueryDsl.g:3502:2: ( ( ruleQualifiedName ) )
            {
            // InternalQueryDsl.g:3502:2: ( ( ruleQualifiedName ) )
            // InternalQueryDsl.g:3503:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getParamValuePredicateAccess().getLeftDataPropertyCrossReference_2_0()); 
            // InternalQueryDsl.g:3504:3: ( ruleQualifiedName )
            // InternalQueryDsl.g:3505:4: ruleQualifiedName
            {
             before(grammarAccess.getParamValuePredicateAccess().getLeftDataPropertyQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getParamValuePredicateAccess().getLeftDataPropertyQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getParamValuePredicateAccess().getLeftDataPropertyCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__LeftAssignment_2"


    // $ANTLR start "rule__ParamValuePredicate__ComparisonTypeAssignment_3"
    // InternalQueryDsl.g:3516:1: rule__ParamValuePredicate__ComparisonTypeAssignment_3 : ( ruleComparisonType ) ;
    public final void rule__ParamValuePredicate__ComparisonTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3520:1: ( ( ruleComparisonType ) )
            // InternalQueryDsl.g:3521:2: ( ruleComparisonType )
            {
            // InternalQueryDsl.g:3521:2: ( ruleComparisonType )
            // InternalQueryDsl.g:3522:3: ruleComparisonType
            {
             before(grammarAccess.getParamValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonType();

            state._fsp--;

             after(grammarAccess.getParamValuePredicateAccess().getComparisonTypeComparisonTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__ComparisonTypeAssignment_3"


    // $ANTLR start "rule__ParamValuePredicate__RightAssignment_5"
    // InternalQueryDsl.g:3531:1: rule__ParamValuePredicate__RightAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__ParamValuePredicate__RightAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3535:1: ( ( ( RULE_ID ) ) )
            // InternalQueryDsl.g:3536:2: ( ( RULE_ID ) )
            {
            // InternalQueryDsl.g:3536:2: ( ( RULE_ID ) )
            // InternalQueryDsl.g:3537:3: ( RULE_ID )
            {
             before(grammarAccess.getParamValuePredicateAccess().getRightQueryParamCrossReference_5_0()); 
            // InternalQueryDsl.g:3538:3: ( RULE_ID )
            // InternalQueryDsl.g:3539:4: RULE_ID
            {
             before(grammarAccess.getParamValuePredicateAccess().getRightQueryParamIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParamValuePredicateAccess().getRightQueryParamIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getParamValuePredicateAccess().getRightQueryParamCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamValuePredicate__RightAssignment_5"


    // $ANTLR start "rule__CompositeCondition__PredicateAssignment_1"
    // InternalQueryDsl.g:3550:1: rule__CompositeCondition__PredicateAssignment_1 : ( rulePredicate ) ;
    public final void rule__CompositeCondition__PredicateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3554:1: ( ( rulePredicate ) )
            // InternalQueryDsl.g:3555:2: ( rulePredicate )
            {
            // InternalQueryDsl.g:3555:2: ( rulePredicate )
            // InternalQueryDsl.g:3556:3: rulePredicate
            {
             before(grammarAccess.getCompositeConditionAccess().getPredicatePredicateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePredicate();

            state._fsp--;

             after(grammarAccess.getCompositeConditionAccess().getPredicatePredicateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__PredicateAssignment_1"


    // $ANTLR start "rule__CompositeCondition__ConnectionAssignment_2"
    // InternalQueryDsl.g:3565:1: rule__CompositeCondition__ConnectionAssignment_2 : ( ruleConnectionType ) ;
    public final void rule__CompositeCondition__ConnectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3569:1: ( ( ruleConnectionType ) )
            // InternalQueryDsl.g:3570:2: ( ruleConnectionType )
            {
            // InternalQueryDsl.g:3570:2: ( ruleConnectionType )
            // InternalQueryDsl.g:3571:3: ruleConnectionType
            {
             before(grammarAccess.getCompositeConditionAccess().getConnectionConnectionTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConnectionType();

            state._fsp--;

             after(grammarAccess.getCompositeConditionAccess().getConnectionConnectionTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__ConnectionAssignment_2"


    // $ANTLR start "rule__CompositeCondition__OnAssignment_3"
    // InternalQueryDsl.g:3580:1: rule__CompositeCondition__OnAssignment_3 : ( ruleCondition ) ;
    public final void rule__CompositeCondition__OnAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3584:1: ( ( ruleCondition ) )
            // InternalQueryDsl.g:3585:2: ( ruleCondition )
            {
            // InternalQueryDsl.g:3585:2: ( ruleCondition )
            // InternalQueryDsl.g:3586:3: ruleCondition
            {
             before(grammarAccess.getCompositeConditionAccess().getOnConditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getCompositeConditionAccess().getOnConditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__OnAssignment_3"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\6\uffff";
    static final String dfa_2s = "\1\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\3\5\2\uffff\1\5";
    static final String dfa_4s = "\1\5\1\52\1\5\2\uffff\1\52";
    static final String dfa_5s = "\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\6\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\4\5\uffff\6\3\17\uffff\1\4\2\uffff\1\2\4\uffff\1\4\1\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\4\5\uffff\6\3\17\uffff\1\4\2\uffff\1\2\4\uffff\1\4\1\uffff\1\4"
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
            return "512:1: rule__Select__Alternatives_6_1 : ( ( ( rule__Select__Group_6_1_0__0 ) ) | ( ( rule__Select__Group_6_1_1__0 ) ) );";
        }
    }
    static final String dfa_8s = "\27\uffff";
    static final String dfa_9s = "\15\uffff\2\22\5\uffff\2\22\1\uffff";
    static final String dfa_10s = "\2\5\1\21\1\5\6\4\1\21\4\5\1\40\1\55\2\uffff\3\5\1\40";
    static final String dfa_11s = "\1\57\1\5\1\43\1\5\6\54\1\43\2\5\2\52\1\43\1\55\2\uffff\1\5\2\52\1\43";
    static final String dfa_12s = "\21\uffff\1\2\1\1\4\uffff";
    static final String dfa_13s = "\27\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\51\uffff\1\1",
            "\1\2",
            "\1\4\1\5\1\6\1\7\1\10\1\11\14\uffff\1\3",
            "\1\12",
            "\1\15\1\16\31\uffff\1\13\14\uffff\1\14",
            "\1\15\1\16\31\uffff\1\13\14\uffff\1\14",
            "\1\15\1\16\31\uffff\1\13\14\uffff\1\14",
            "\1\15\1\16\31\uffff\1\13\14\uffff\1\14",
            "\1\15\1\16\31\uffff\1\13\14\uffff\1\14",
            "\1\15\1\16\31\uffff\1\13\14\uffff\1\14",
            "\1\4\1\5\1\6\1\7\1\10\1\11\14\uffff\1\3",
            "\1\17",
            "\1\20",
            "\1\22\5\uffff\6\22\6\uffff\2\21\7\uffff\1\22\11\uffff\1\22",
            "\1\22\5\uffff\6\22\6\uffff\2\21\7\uffff\1\22\11\uffff\1\22",
            "\1\24\2\uffff\1\23",
            "\1\25",
            "",
            "",
            "\1\26",
            "\1\22\5\uffff\6\22\6\uffff\2\21\7\uffff\1\22\11\uffff\1\22",
            "\1\22\5\uffff\6\22\6\uffff\2\21\7\uffff\1\22\11\uffff\1\22",
            "\1\24\2\uffff\1\23"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "533:1: rule__Condition__Alternatives : ( ( ruleSimpleCondition ) | ( ruleCompositeCondition ) );";
        }
    }
    static final String dfa_15s = "\16\uffff";
    static final String dfa_16s = "\2\5\1\21\1\5\6\4\1\21\3\uffff";
    static final String dfa_17s = "\1\57\1\5\1\43\1\5\6\54\1\43\3\uffff";
    static final String dfa_18s = "\13\uffff\1\3\1\2\1\1";
    static final String dfa_19s = "\16\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\51\uffff\1\1",
            "\1\2",
            "\1\4\1\5\1\6\1\7\1\10\1\11\14\uffff\1\3",
            "\1\12",
            "\2\15\31\uffff\1\14\14\uffff\1\13",
            "\2\15\31\uffff\1\14\14\uffff\1\13",
            "\2\15\31\uffff\1\14\14\uffff\1\13",
            "\2\15\31\uffff\1\14\14\uffff\1\13",
            "\2\15\31\uffff\1\14\14\uffff\1\13",
            "\2\15\31\uffff\1\14\14\uffff\1\13",
            "\1\4\1\5\1\6\1\7\1\10\1\11\14\uffff\1\3",
            "",
            "",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "554:1: rule__Predicate__Alternatives : ( ( rulePrimitiveValuePredicate ) | ( ruleModelValuePredicate ) | ( ruleParamValuePredicate ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000300000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000003E000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000007E0000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000001800000L});

}