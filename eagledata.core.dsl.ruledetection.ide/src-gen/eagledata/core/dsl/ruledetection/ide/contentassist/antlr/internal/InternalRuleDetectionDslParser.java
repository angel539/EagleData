package eagledata.core.dsl.ruledetection.ide.contentassist.antlr.internal;

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
import eagledata.core.dsl.ruledetection.services.RuleDetectionDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRuleDetectionDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SELECTOPERATOR", "RULE_SETOPERATOR", "RULE_LOGICALOPERATOR", "RULE_INT", "RULE_STRING", "RULE_DOUBLE", "RULE_OPERATOR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'{'", "'on'", "'do'", "'}'", "':'", "'select'", "','", "'where'", "'@'", "'('", "')'", "'compose'", "'to'", "'*'"
    };
    public static final int RULE_SELECTOPERATOR=5;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__19=19;
    public static final int RULE_DOUBLE=10;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_LOGICALOPERATOR=7;
    public static final int T__31=31;
    public static final int RULE_OPERATOR=11;
    public static final int T__32=32;
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
    public static final int RULE_SETOPERATOR=6;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRuleDetectionDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRuleDetectionDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRuleDetectionDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRuleDetectionDsl.g"; }


    	private RuleDetectionDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(RuleDetectionDslGrammarAccess grammarAccess) {
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
    // InternalRuleDetectionDsl.g:53:1: entryRuleRuleModel : ruleRuleModel EOF ;
    public final void entryRuleRuleModel() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:54:1: ( ruleRuleModel EOF )
            // InternalRuleDetectionDsl.g:55:1: ruleRuleModel EOF
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
    // InternalRuleDetectionDsl.g:62:1: ruleRuleModel : ( ( rule__RuleModel__Group__0 ) ) ;
    public final void ruleRuleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:66:2: ( ( ( rule__RuleModel__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:67:2: ( ( rule__RuleModel__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:67:2: ( ( rule__RuleModel__Group__0 ) )
            // InternalRuleDetectionDsl.g:68:3: ( rule__RuleModel__Group__0 )
            {
             before(grammarAccess.getRuleModelAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:69:3: ( rule__RuleModel__Group__0 )
            // InternalRuleDetectionDsl.g:69:4: rule__RuleModel__Group__0
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
    // InternalRuleDetectionDsl.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:79:1: ( ruleImport EOF )
            // InternalRuleDetectionDsl.g:80:1: ruleImport EOF
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
    // InternalRuleDetectionDsl.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalRuleDetectionDsl.g:93:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:94:3: ( rule__Import__Group__0 )
            // InternalRuleDetectionDsl.g:94:4: rule__Import__Group__0
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
    // InternalRuleDetectionDsl.g:103:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:104:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRuleDetectionDsl.g:105:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalRuleDetectionDsl.g:112:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:116:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRuleDetectionDsl.g:118:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:119:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRuleDetectionDsl.g:119:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalRuleDetectionDsl.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:129:1: ( ruleQualifiedName EOF )
            // InternalRuleDetectionDsl.g:130:1: ruleQualifiedName EOF
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
    // InternalRuleDetectionDsl.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRuleDetectionDsl.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalRuleDetectionDsl.g:144:4: rule__QualifiedName__Group__0
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


    // $ANTLR start "entryRuleRuleElement"
    // InternalRuleDetectionDsl.g:153:1: entryRuleRuleElement : ruleRuleElement EOF ;
    public final void entryRuleRuleElement() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:154:1: ( ruleRuleElement EOF )
            // InternalRuleDetectionDsl.g:155:1: ruleRuleElement EOF
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
    // InternalRuleDetectionDsl.g:162:1: ruleRuleElement : ( ruleAction ) ;
    public final void ruleRuleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:166:2: ( ( ruleAction ) )
            // InternalRuleDetectionDsl.g:167:2: ( ruleAction )
            {
            // InternalRuleDetectionDsl.g:167:2: ( ruleAction )
            // InternalRuleDetectionDsl.g:168:3: ruleAction
            {
             before(grammarAccess.getRuleElementAccess().getActionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleElementAccess().getActionParserRuleCall()); 

            }


            }

        }
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
    // InternalRuleDetectionDsl.g:178:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:179:1: ( ruleRule EOF )
            // InternalRuleDetectionDsl.g:180:1: ruleRule EOF
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
    // InternalRuleDetectionDsl.g:187:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:191:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:192:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:192:2: ( ( rule__Rule__Group__0 ) )
            // InternalRuleDetectionDsl.g:193:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:194:3: ( rule__Rule__Group__0 )
            // InternalRuleDetectionDsl.g:194:4: rule__Rule__Group__0
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
    // InternalRuleDetectionDsl.g:203:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:204:1: ( ruleAction EOF )
            // InternalRuleDetectionDsl.g:205:1: ruleAction EOF
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
    // InternalRuleDetectionDsl.g:212:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:216:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalRuleDetectionDsl.g:217:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalRuleDetectionDsl.g:217:2: ( ( rule__Action__Alternatives ) )
            // InternalRuleDetectionDsl.g:218:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalRuleDetectionDsl.g:219:3: ( rule__Action__Alternatives )
            // InternalRuleDetectionDsl.g:219:4: rule__Action__Alternatives
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
    // InternalRuleDetectionDsl.g:228:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:229:1: ( ruleQuery EOF )
            // InternalRuleDetectionDsl.g:230:1: ruleQuery EOF
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
    // InternalRuleDetectionDsl.g:237:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:241:2: ( ( ( rule__Query__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:242:2: ( ( rule__Query__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:242:2: ( ( rule__Query__Group__0 ) )
            // InternalRuleDetectionDsl.g:243:3: ( rule__Query__Group__0 )
            {
             before(grammarAccess.getQueryAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:244:3: ( rule__Query__Group__0 )
            // InternalRuleDetectionDsl.g:244:4: rule__Query__Group__0
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
    // InternalRuleDetectionDsl.g:253:1: entryRuleAddingSelect : ruleAddingSelect EOF ;
    public final void entryRuleAddingSelect() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:254:1: ( ruleAddingSelect EOF )
            // InternalRuleDetectionDsl.g:255:1: ruleAddingSelect EOF
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
    // InternalRuleDetectionDsl.g:262:1: ruleAddingSelect : ( ( rule__AddingSelect__Group__0 ) ) ;
    public final void ruleAddingSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:266:2: ( ( ( rule__AddingSelect__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:267:2: ( ( rule__AddingSelect__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:267:2: ( ( rule__AddingSelect__Group__0 ) )
            // InternalRuleDetectionDsl.g:268:3: ( rule__AddingSelect__Group__0 )
            {
             before(grammarAccess.getAddingSelectAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:269:3: ( rule__AddingSelect__Group__0 )
            // InternalRuleDetectionDsl.g:269:4: rule__AddingSelect__Group__0
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
    // InternalRuleDetectionDsl.g:278:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:279:1: ( ruleSelect EOF )
            // InternalRuleDetectionDsl.g:280:1: ruleSelect EOF
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
    // InternalRuleDetectionDsl.g:287:1: ruleSelect : ( ( rule__Select__Alternatives ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:291:2: ( ( ( rule__Select__Alternatives ) ) )
            // InternalRuleDetectionDsl.g:292:2: ( ( rule__Select__Alternatives ) )
            {
            // InternalRuleDetectionDsl.g:292:2: ( ( rule__Select__Alternatives ) )
            // InternalRuleDetectionDsl.g:293:3: ( rule__Select__Alternatives )
            {
             before(grammarAccess.getSelectAccess().getAlternatives()); 
            // InternalRuleDetectionDsl.g:294:3: ( rule__Select__Alternatives )
            // InternalRuleDetectionDsl.g:294:4: rule__Select__Alternatives
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
    // InternalRuleDetectionDsl.g:303:1: entryRuleSetSelect : ruleSetSelect EOF ;
    public final void entryRuleSetSelect() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:304:1: ( ruleSetSelect EOF )
            // InternalRuleDetectionDsl.g:305:1: ruleSetSelect EOF
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
    // InternalRuleDetectionDsl.g:312:1: ruleSetSelect : ( ( rule__SetSelect__Group__0 ) ) ;
    public final void ruleSetSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:316:2: ( ( ( rule__SetSelect__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:317:2: ( ( rule__SetSelect__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:317:2: ( ( rule__SetSelect__Group__0 ) )
            // InternalRuleDetectionDsl.g:318:3: ( rule__SetSelect__Group__0 )
            {
             before(grammarAccess.getSetSelectAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:319:3: ( rule__SetSelect__Group__0 )
            // InternalRuleDetectionDsl.g:319:4: rule__SetSelect__Group__0
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
    // InternalRuleDetectionDsl.g:328:1: entryRuleWhere : ruleWhere EOF ;
    public final void entryRuleWhere() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:329:1: ( ruleWhere EOF )
            // InternalRuleDetectionDsl.g:330:1: ruleWhere EOF
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
    // InternalRuleDetectionDsl.g:337:1: ruleWhere : ( ( rule__Where__Group__0 ) ) ;
    public final void ruleWhere() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:341:2: ( ( ( rule__Where__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:342:2: ( ( rule__Where__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:342:2: ( ( rule__Where__Group__0 ) )
            // InternalRuleDetectionDsl.g:343:3: ( rule__Where__Group__0 )
            {
             before(grammarAccess.getWhereAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:344:3: ( rule__Where__Group__0 )
            // InternalRuleDetectionDsl.g:344:4: rule__Where__Group__0
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


    // $ANTLR start "entryRuleRecipient"
    // InternalRuleDetectionDsl.g:353:1: entryRuleRecipient : ruleRecipient EOF ;
    public final void entryRuleRecipient() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:354:1: ( ruleRecipient EOF )
            // InternalRuleDetectionDsl.g:355:1: ruleRecipient EOF
            {
             before(grammarAccess.getRecipientRule()); 
            pushFollow(FOLLOW_1);
            ruleRecipient();

            state._fsp--;

             after(grammarAccess.getRecipientRule()); 
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
    // $ANTLR end "entryRuleRecipient"


    // $ANTLR start "ruleRecipient"
    // InternalRuleDetectionDsl.g:362:1: ruleRecipient : ( ruleConcreteRecipient ) ;
    public final void ruleRecipient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:366:2: ( ( ruleConcreteRecipient ) )
            // InternalRuleDetectionDsl.g:367:2: ( ruleConcreteRecipient )
            {
            // InternalRuleDetectionDsl.g:367:2: ( ruleConcreteRecipient )
            // InternalRuleDetectionDsl.g:368:3: ruleConcreteRecipient
            {
             before(grammarAccess.getRecipientAccess().getConcreteRecipientParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleConcreteRecipient();

            state._fsp--;

             after(grammarAccess.getRecipientAccess().getConcreteRecipientParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecipient"


    // $ANTLR start "entryRuleConcreteRecipient"
    // InternalRuleDetectionDsl.g:378:1: entryRuleConcreteRecipient : ruleConcreteRecipient EOF ;
    public final void entryRuleConcreteRecipient() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:379:1: ( ruleConcreteRecipient EOF )
            // InternalRuleDetectionDsl.g:380:1: ruleConcreteRecipient EOF
            {
             before(grammarAccess.getConcreteRecipientRule()); 
            pushFollow(FOLLOW_1);
            ruleConcreteRecipient();

            state._fsp--;

             after(grammarAccess.getConcreteRecipientRule()); 
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
    // $ANTLR end "entryRuleConcreteRecipient"


    // $ANTLR start "ruleConcreteRecipient"
    // InternalRuleDetectionDsl.g:387:1: ruleConcreteRecipient : ( ( rule__ConcreteRecipient__Group__0 ) ) ;
    public final void ruleConcreteRecipient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:391:2: ( ( ( rule__ConcreteRecipient__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:392:2: ( ( rule__ConcreteRecipient__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:392:2: ( ( rule__ConcreteRecipient__Group__0 ) )
            // InternalRuleDetectionDsl.g:393:3: ( rule__ConcreteRecipient__Group__0 )
            {
             before(grammarAccess.getConcreteRecipientAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:394:3: ( rule__ConcreteRecipient__Group__0 )
            // InternalRuleDetectionDsl.g:394:4: rule__ConcreteRecipient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteRecipient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConcreteRecipientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcreteRecipient"


    // $ANTLR start "entryRuleExpression"
    // InternalRuleDetectionDsl.g:403:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:404:1: ( ruleExpression EOF )
            // InternalRuleDetectionDsl.g:405:1: ruleExpression EOF
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
    // InternalRuleDetectionDsl.g:412:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:416:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalRuleDetectionDsl.g:417:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalRuleDetectionDsl.g:417:2: ( ( rule__Expression__Alternatives ) )
            // InternalRuleDetectionDsl.g:418:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalRuleDetectionDsl.g:419:3: ( rule__Expression__Alternatives )
            // InternalRuleDetectionDsl.g:419:4: rule__Expression__Alternatives
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
    // InternalRuleDetectionDsl.g:428:1: entryRulePlainExpression : rulePlainExpression EOF ;
    public final void entryRulePlainExpression() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:429:1: ( rulePlainExpression EOF )
            // InternalRuleDetectionDsl.g:430:1: rulePlainExpression EOF
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
    // InternalRuleDetectionDsl.g:437:1: rulePlainExpression : ( ( rule__PlainExpression__PlainOperandAssignment ) ) ;
    public final void rulePlainExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:441:2: ( ( ( rule__PlainExpression__PlainOperandAssignment ) ) )
            // InternalRuleDetectionDsl.g:442:2: ( ( rule__PlainExpression__PlainOperandAssignment ) )
            {
            // InternalRuleDetectionDsl.g:442:2: ( ( rule__PlainExpression__PlainOperandAssignment ) )
            // InternalRuleDetectionDsl.g:443:3: ( rule__PlainExpression__PlainOperandAssignment )
            {
             before(grammarAccess.getPlainExpressionAccess().getPlainOperandAssignment()); 
            // InternalRuleDetectionDsl.g:444:3: ( rule__PlainExpression__PlainOperandAssignment )
            // InternalRuleDetectionDsl.g:444:4: rule__PlainExpression__PlainOperandAssignment
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
    // InternalRuleDetectionDsl.g:453:1: entryRuleComplexExpression : ruleComplexExpression EOF ;
    public final void entryRuleComplexExpression() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:454:1: ( ruleComplexExpression EOF )
            // InternalRuleDetectionDsl.g:455:1: ruleComplexExpression EOF
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
    // InternalRuleDetectionDsl.g:462:1: ruleComplexExpression : ( ( rule__ComplexExpression__Group__0 ) ) ;
    public final void ruleComplexExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:466:2: ( ( ( rule__ComplexExpression__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:467:2: ( ( rule__ComplexExpression__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:467:2: ( ( rule__ComplexExpression__Group__0 ) )
            // InternalRuleDetectionDsl.g:468:3: ( rule__ComplexExpression__Group__0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:469:3: ( rule__ComplexExpression__Group__0 )
            // InternalRuleDetectionDsl.g:469:4: rule__ComplexExpression__Group__0
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
    // InternalRuleDetectionDsl.g:478:1: entryRulePlainOperand : rulePlainOperand EOF ;
    public final void entryRulePlainOperand() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:479:1: ( rulePlainOperand EOF )
            // InternalRuleDetectionDsl.g:480:1: rulePlainOperand EOF
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
    // InternalRuleDetectionDsl.g:487:1: rulePlainOperand : ( ( rule__PlainOperand__Alternatives ) ) ;
    public final void rulePlainOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:491:2: ( ( ( rule__PlainOperand__Alternatives ) ) )
            // InternalRuleDetectionDsl.g:492:2: ( ( rule__PlainOperand__Alternatives ) )
            {
            // InternalRuleDetectionDsl.g:492:2: ( ( rule__PlainOperand__Alternatives ) )
            // InternalRuleDetectionDsl.g:493:3: ( rule__PlainOperand__Alternatives )
            {
             before(grammarAccess.getPlainOperandAccess().getAlternatives()); 
            // InternalRuleDetectionDsl.g:494:3: ( rule__PlainOperand__Alternatives )
            // InternalRuleDetectionDsl.g:494:4: rule__PlainOperand__Alternatives
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
    // InternalRuleDetectionDsl.g:503:1: entryRuleNumeral : ruleNumeral EOF ;
    public final void entryRuleNumeral() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:504:1: ( ruleNumeral EOF )
            // InternalRuleDetectionDsl.g:505:1: ruleNumeral EOF
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
    // InternalRuleDetectionDsl.g:512:1: ruleNumeral : ( ( rule__Numeral__ValueAssignment ) ) ;
    public final void ruleNumeral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:516:2: ( ( ( rule__Numeral__ValueAssignment ) ) )
            // InternalRuleDetectionDsl.g:517:2: ( ( rule__Numeral__ValueAssignment ) )
            {
            // InternalRuleDetectionDsl.g:517:2: ( ( rule__Numeral__ValueAssignment ) )
            // InternalRuleDetectionDsl.g:518:3: ( rule__Numeral__ValueAssignment )
            {
             before(grammarAccess.getNumeralAccess().getValueAssignment()); 
            // InternalRuleDetectionDsl.g:519:3: ( rule__Numeral__ValueAssignment )
            // InternalRuleDetectionDsl.g:519:4: rule__Numeral__ValueAssignment
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
    // InternalRuleDetectionDsl.g:528:1: entryRuleQueryOperand : ruleQueryOperand EOF ;
    public final void entryRuleQueryOperand() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:529:1: ( ruleQueryOperand EOF )
            // InternalRuleDetectionDsl.g:530:1: ruleQueryOperand EOF
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
    // InternalRuleDetectionDsl.g:537:1: ruleQueryOperand : ( ( rule__QueryOperand__QueryAssignment ) ) ;
    public final void ruleQueryOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:541:2: ( ( ( rule__QueryOperand__QueryAssignment ) ) )
            // InternalRuleDetectionDsl.g:542:2: ( ( rule__QueryOperand__QueryAssignment ) )
            {
            // InternalRuleDetectionDsl.g:542:2: ( ( rule__QueryOperand__QueryAssignment ) )
            // InternalRuleDetectionDsl.g:543:3: ( rule__QueryOperand__QueryAssignment )
            {
             before(grammarAccess.getQueryOperandAccess().getQueryAssignment()); 
            // InternalRuleDetectionDsl.g:544:3: ( rule__QueryOperand__QueryAssignment )
            // InternalRuleDetectionDsl.g:544:4: rule__QueryOperand__QueryAssignment
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
    // InternalRuleDetectionDsl.g:553:1: entryRuleComplexOperand : ruleComplexOperand EOF ;
    public final void entryRuleComplexOperand() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:554:1: ( ruleComplexOperand EOF )
            // InternalRuleDetectionDsl.g:555:1: ruleComplexOperand EOF
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
    // InternalRuleDetectionDsl.g:562:1: ruleComplexOperand : ( ( rule__ComplexOperand__Group__0 ) ) ;
    public final void ruleComplexOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:566:2: ( ( ( rule__ComplexOperand__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:567:2: ( ( rule__ComplexOperand__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:567:2: ( ( rule__ComplexOperand__Group__0 ) )
            // InternalRuleDetectionDsl.g:568:3: ( rule__ComplexOperand__Group__0 )
            {
             before(grammarAccess.getComplexOperandAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:569:3: ( rule__ComplexOperand__Group__0 )
            // InternalRuleDetectionDsl.g:569:4: rule__ComplexOperand__Group__0
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
    // InternalRuleDetectionDsl.g:578:1: entryRuleMessage : ruleMessage EOF ;
    public final void entryRuleMessage() throws RecognitionException {
        try {
            // InternalRuleDetectionDsl.g:579:1: ( ruleMessage EOF )
            // InternalRuleDetectionDsl.g:580:1: ruleMessage EOF
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
    // InternalRuleDetectionDsl.g:587:1: ruleMessage : ( ( rule__Message__Group__0 ) ) ;
    public final void ruleMessage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:591:2: ( ( ( rule__Message__Group__0 ) ) )
            // InternalRuleDetectionDsl.g:592:2: ( ( rule__Message__Group__0 ) )
            {
            // InternalRuleDetectionDsl.g:592:2: ( ( rule__Message__Group__0 ) )
            // InternalRuleDetectionDsl.g:593:3: ( rule__Message__Group__0 )
            {
             before(grammarAccess.getMessageAccess().getGroup()); 
            // InternalRuleDetectionDsl.g:594:3: ( rule__Message__Group__0 )
            // InternalRuleDetectionDsl.g:594:4: rule__Message__Group__0
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


    // $ANTLR start "rule__Action__Alternatives"
    // InternalRuleDetectionDsl.g:602:1: rule__Action__Alternatives : ( ( ruleQuery ) | ( ruleMessage ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:606:1: ( ( ruleQuery ) | ( ruleMessage ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==23) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==30) ) {
                        alt1=2;
                    }
                    else if ( (LA1_2==RULE_SELECTOPERATOR||LA1_2==24) ) {
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
                    // InternalRuleDetectionDsl.g:607:2: ( ruleQuery )
                    {
                    // InternalRuleDetectionDsl.g:607:2: ( ruleQuery )
                    // InternalRuleDetectionDsl.g:608:3: ruleQuery
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
                    // InternalRuleDetectionDsl.g:613:2: ( ruleMessage )
                    {
                    // InternalRuleDetectionDsl.g:613:2: ( ruleMessage )
                    // InternalRuleDetectionDsl.g:614:3: ruleMessage
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
    // InternalRuleDetectionDsl.g:623:1: rule__AddingSelect__Alternatives_1 : ( ( ( rule__AddingSelect__ElementAssignment_1_0 )? ) | ( ( rule__AddingSelect__AllAssignment_1_1 ) ) );
    public final void rule__AddingSelect__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:627:1: ( ( ( rule__AddingSelect__ElementAssignment_1_0 )? ) | ( ( rule__AddingSelect__AllAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==RULE_ID||LA3_0==22||LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRuleDetectionDsl.g:628:2: ( ( rule__AddingSelect__ElementAssignment_1_0 )? )
                    {
                    // InternalRuleDetectionDsl.g:628:2: ( ( rule__AddingSelect__ElementAssignment_1_0 )? )
                    // InternalRuleDetectionDsl.g:629:3: ( rule__AddingSelect__ElementAssignment_1_0 )?
                    {
                     before(grammarAccess.getAddingSelectAccess().getElementAssignment_1_0()); 
                    // InternalRuleDetectionDsl.g:630:3: ( rule__AddingSelect__ElementAssignment_1_0 )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_ID) ) {
                        int LA2_1 = input.LA(2);

                        if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==22||LA2_1==26) ) {
                            alt2=1;
                        }
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalRuleDetectionDsl.g:630:4: rule__AddingSelect__ElementAssignment_1_0
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
                    // InternalRuleDetectionDsl.g:634:2: ( ( rule__AddingSelect__AllAssignment_1_1 ) )
                    {
                    // InternalRuleDetectionDsl.g:634:2: ( ( rule__AddingSelect__AllAssignment_1_1 ) )
                    // InternalRuleDetectionDsl.g:635:3: ( rule__AddingSelect__AllAssignment_1_1 )
                    {
                     before(grammarAccess.getAddingSelectAccess().getAllAssignment_1_1()); 
                    // InternalRuleDetectionDsl.g:636:3: ( rule__AddingSelect__AllAssignment_1_1 )
                    // InternalRuleDetectionDsl.g:636:4: rule__AddingSelect__AllAssignment_1_1
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
    // InternalRuleDetectionDsl.g:644:1: rule__Select__Alternatives : ( ( ruleAddingSelect ) | ( ruleSetSelect ) );
    public final void rule__Select__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:648:1: ( ( ruleAddingSelect ) | ( ruleSetSelect ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SELECTOPERATOR) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRuleDetectionDsl.g:649:2: ( ruleAddingSelect )
                    {
                    // InternalRuleDetectionDsl.g:649:2: ( ruleAddingSelect )
                    // InternalRuleDetectionDsl.g:650:3: ruleAddingSelect
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
                    // InternalRuleDetectionDsl.g:655:2: ( ruleSetSelect )
                    {
                    // InternalRuleDetectionDsl.g:655:2: ( ruleSetSelect )
                    // InternalRuleDetectionDsl.g:656:3: ruleSetSelect
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


    // $ANTLR start "rule__Where__Alternatives_3"
    // InternalRuleDetectionDsl.g:665:1: rule__Where__Alternatives_3 : ( ( ( rule__Where__RightVariableAssignment_3_0 ) ) | ( ( rule__Where__RightAssignment_3_1 ) ) );
    public final void rule__Where__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:669:1: ( ( ( rule__Where__RightVariableAssignment_3_0 ) ) | ( ( rule__Where__RightAssignment_3_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRuleDetectionDsl.g:670:2: ( ( rule__Where__RightVariableAssignment_3_0 ) )
                    {
                    // InternalRuleDetectionDsl.g:670:2: ( ( rule__Where__RightVariableAssignment_3_0 ) )
                    // InternalRuleDetectionDsl.g:671:3: ( rule__Where__RightVariableAssignment_3_0 )
                    {
                     before(grammarAccess.getWhereAccess().getRightVariableAssignment_3_0()); 
                    // InternalRuleDetectionDsl.g:672:3: ( rule__Where__RightVariableAssignment_3_0 )
                    // InternalRuleDetectionDsl.g:672:4: rule__Where__RightVariableAssignment_3_0
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
                    // InternalRuleDetectionDsl.g:676:2: ( ( rule__Where__RightAssignment_3_1 ) )
                    {
                    // InternalRuleDetectionDsl.g:676:2: ( ( rule__Where__RightAssignment_3_1 ) )
                    // InternalRuleDetectionDsl.g:677:3: ( rule__Where__RightAssignment_3_1 )
                    {
                     before(grammarAccess.getWhereAccess().getRightAssignment_3_1()); 
                    // InternalRuleDetectionDsl.g:678:3: ( rule__Where__RightAssignment_3_1 )
                    // InternalRuleDetectionDsl.g:678:4: rule__Where__RightAssignment_3_1
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
    // InternalRuleDetectionDsl.g:686:1: rule__Expression__Alternatives : ( ( rulePlainExpression ) | ( ruleComplexExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:690:1: ( ( rulePlainExpression ) | ( ruleComplexExpression ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==RULE_DOUBLE) ) {
                alt6=1;
            }
            else if ( (LA6_0==28) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRuleDetectionDsl.g:691:2: ( rulePlainExpression )
                    {
                    // InternalRuleDetectionDsl.g:691:2: ( rulePlainExpression )
                    // InternalRuleDetectionDsl.g:692:3: rulePlainExpression
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
                    // InternalRuleDetectionDsl.g:697:2: ( ruleComplexExpression )
                    {
                    // InternalRuleDetectionDsl.g:697:2: ( ruleComplexExpression )
                    // InternalRuleDetectionDsl.g:698:3: ruleComplexExpression
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
    // InternalRuleDetectionDsl.g:707:1: rule__PlainOperand__Alternatives : ( ( ruleNumeral ) | ( ruleQueryOperand ) );
    public final void rule__PlainOperand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:711:1: ( ( ruleNumeral ) | ( ruleQueryOperand ) )
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
                    // InternalRuleDetectionDsl.g:712:2: ( ruleNumeral )
                    {
                    // InternalRuleDetectionDsl.g:712:2: ( ruleNumeral )
                    // InternalRuleDetectionDsl.g:713:3: ruleNumeral
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
                    // InternalRuleDetectionDsl.g:718:2: ( ruleQueryOperand )
                    {
                    // InternalRuleDetectionDsl.g:718:2: ( ruleQueryOperand )
                    // InternalRuleDetectionDsl.g:719:3: ruleQueryOperand
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
    // InternalRuleDetectionDsl.g:728:1: rule__RuleModel__Group__0 : rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1 ;
    public final void rule__RuleModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:732:1: ( rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1 )
            // InternalRuleDetectionDsl.g:733:2: rule__RuleModel__Group__0__Impl rule__RuleModel__Group__1
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
    // InternalRuleDetectionDsl.g:740:1: rule__RuleModel__Group__0__Impl : ( ( rule__RuleModel__Group_0__0 )? ) ;
    public final void rule__RuleModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:744:1: ( ( ( rule__RuleModel__Group_0__0 )? ) )
            // InternalRuleDetectionDsl.g:745:1: ( ( rule__RuleModel__Group_0__0 )? )
            {
            // InternalRuleDetectionDsl.g:745:1: ( ( rule__RuleModel__Group_0__0 )? )
            // InternalRuleDetectionDsl.g:746:2: ( rule__RuleModel__Group_0__0 )?
            {
             before(grammarAccess.getRuleModelAccess().getGroup_0()); 
            // InternalRuleDetectionDsl.g:747:2: ( rule__RuleModel__Group_0__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRuleDetectionDsl.g:747:3: rule__RuleModel__Group_0__0
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
    // InternalRuleDetectionDsl.g:755:1: rule__RuleModel__Group__1 : rule__RuleModel__Group__1__Impl ;
    public final void rule__RuleModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:759:1: ( rule__RuleModel__Group__1__Impl )
            // InternalRuleDetectionDsl.g:760:2: rule__RuleModel__Group__1__Impl
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
    // InternalRuleDetectionDsl.g:766:1: rule__RuleModel__Group__1__Impl : ( ( rule__RuleModel__Group_1__0 )? ) ;
    public final void rule__RuleModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:770:1: ( ( ( rule__RuleModel__Group_1__0 )? ) )
            // InternalRuleDetectionDsl.g:771:1: ( ( rule__RuleModel__Group_1__0 )? )
            {
            // InternalRuleDetectionDsl.g:771:1: ( ( rule__RuleModel__Group_1__0 )? )
            // InternalRuleDetectionDsl.g:772:2: ( rule__RuleModel__Group_1__0 )?
            {
             before(grammarAccess.getRuleModelAccess().getGroup_1()); 
            // InternalRuleDetectionDsl.g:773:2: ( rule__RuleModel__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRuleDetectionDsl.g:773:3: rule__RuleModel__Group_1__0
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
    // InternalRuleDetectionDsl.g:782:1: rule__RuleModel__Group_0__0 : rule__RuleModel__Group_0__0__Impl rule__RuleModel__Group_0__1 ;
    public final void rule__RuleModel__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:786:1: ( rule__RuleModel__Group_0__0__Impl rule__RuleModel__Group_0__1 )
            // InternalRuleDetectionDsl.g:787:2: rule__RuleModel__Group_0__0__Impl rule__RuleModel__Group_0__1
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
    // InternalRuleDetectionDsl.g:794:1: rule__RuleModel__Group_0__0__Impl : ( ( rule__RuleModel__ImportsAssignment_0_0 ) ) ;
    public final void rule__RuleModel__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:798:1: ( ( ( rule__RuleModel__ImportsAssignment_0_0 ) ) )
            // InternalRuleDetectionDsl.g:799:1: ( ( rule__RuleModel__ImportsAssignment_0_0 ) )
            {
            // InternalRuleDetectionDsl.g:799:1: ( ( rule__RuleModel__ImportsAssignment_0_0 ) )
            // InternalRuleDetectionDsl.g:800:2: ( rule__RuleModel__ImportsAssignment_0_0 )
            {
             before(grammarAccess.getRuleModelAccess().getImportsAssignment_0_0()); 
            // InternalRuleDetectionDsl.g:801:2: ( rule__RuleModel__ImportsAssignment_0_0 )
            // InternalRuleDetectionDsl.g:801:3: rule__RuleModel__ImportsAssignment_0_0
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
    // InternalRuleDetectionDsl.g:809:1: rule__RuleModel__Group_0__1 : rule__RuleModel__Group_0__1__Impl ;
    public final void rule__RuleModel__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:813:1: ( rule__RuleModel__Group_0__1__Impl )
            // InternalRuleDetectionDsl.g:814:2: rule__RuleModel__Group_0__1__Impl
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
    // InternalRuleDetectionDsl.g:820:1: rule__RuleModel__Group_0__1__Impl : ( ( rule__RuleModel__ImportsAssignment_0_1 )* ) ;
    public final void rule__RuleModel__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:824:1: ( ( ( rule__RuleModel__ImportsAssignment_0_1 )* ) )
            // InternalRuleDetectionDsl.g:825:1: ( ( rule__RuleModel__ImportsAssignment_0_1 )* )
            {
            // InternalRuleDetectionDsl.g:825:1: ( ( rule__RuleModel__ImportsAssignment_0_1 )* )
            // InternalRuleDetectionDsl.g:826:2: ( rule__RuleModel__ImportsAssignment_0_1 )*
            {
             before(grammarAccess.getRuleModelAccess().getImportsAssignment_0_1()); 
            // InternalRuleDetectionDsl.g:827:2: ( rule__RuleModel__ImportsAssignment_0_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRuleDetectionDsl.g:827:3: rule__RuleModel__ImportsAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__RuleModel__ImportsAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalRuleDetectionDsl.g:836:1: rule__RuleModel__Group_1__0 : rule__RuleModel__Group_1__0__Impl rule__RuleModel__Group_1__1 ;
    public final void rule__RuleModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:840:1: ( rule__RuleModel__Group_1__0__Impl rule__RuleModel__Group_1__1 )
            // InternalRuleDetectionDsl.g:841:2: rule__RuleModel__Group_1__0__Impl rule__RuleModel__Group_1__1
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
    // InternalRuleDetectionDsl.g:848:1: rule__RuleModel__Group_1__0__Impl : ( ( rule__RuleModel__ElementsAssignment_1_0 ) ) ;
    public final void rule__RuleModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:852:1: ( ( ( rule__RuleModel__ElementsAssignment_1_0 ) ) )
            // InternalRuleDetectionDsl.g:853:1: ( ( rule__RuleModel__ElementsAssignment_1_0 ) )
            {
            // InternalRuleDetectionDsl.g:853:1: ( ( rule__RuleModel__ElementsAssignment_1_0 ) )
            // InternalRuleDetectionDsl.g:854:2: ( rule__RuleModel__ElementsAssignment_1_0 )
            {
             before(grammarAccess.getRuleModelAccess().getElementsAssignment_1_0()); 
            // InternalRuleDetectionDsl.g:855:2: ( rule__RuleModel__ElementsAssignment_1_0 )
            // InternalRuleDetectionDsl.g:855:3: rule__RuleModel__ElementsAssignment_1_0
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
    // InternalRuleDetectionDsl.g:863:1: rule__RuleModel__Group_1__1 : rule__RuleModel__Group_1__1__Impl ;
    public final void rule__RuleModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:867:1: ( rule__RuleModel__Group_1__1__Impl )
            // InternalRuleDetectionDsl.g:868:2: rule__RuleModel__Group_1__1__Impl
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
    // InternalRuleDetectionDsl.g:874:1: rule__RuleModel__Group_1__1__Impl : ( ( rule__RuleModel__ElementsAssignment_1_1 )* ) ;
    public final void rule__RuleModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:878:1: ( ( ( rule__RuleModel__ElementsAssignment_1_1 )* ) )
            // InternalRuleDetectionDsl.g:879:1: ( ( rule__RuleModel__ElementsAssignment_1_1 )* )
            {
            // InternalRuleDetectionDsl.g:879:1: ( ( rule__RuleModel__ElementsAssignment_1_1 )* )
            // InternalRuleDetectionDsl.g:880:2: ( rule__RuleModel__ElementsAssignment_1_1 )*
            {
             before(grammarAccess.getRuleModelAccess().getElementsAssignment_1_1()); 
            // InternalRuleDetectionDsl.g:881:2: ( rule__RuleModel__ElementsAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRuleDetectionDsl.g:881:3: rule__RuleModel__ElementsAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__RuleModel__ElementsAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRuleDetectionDsl.g:890:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:894:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRuleDetectionDsl.g:895:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalRuleDetectionDsl.g:902:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:906:1: ( ( 'import' ) )
            // InternalRuleDetectionDsl.g:907:1: ( 'import' )
            {
            // InternalRuleDetectionDsl.g:907:1: ( 'import' )
            // InternalRuleDetectionDsl.g:908:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:917:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:921:1: ( rule__Import__Group__1__Impl )
            // InternalRuleDetectionDsl.g:922:2: rule__Import__Group__1__Impl
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
    // InternalRuleDetectionDsl.g:928:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:932:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalRuleDetectionDsl.g:933:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRuleDetectionDsl.g:933:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalRuleDetectionDsl.g:934:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalRuleDetectionDsl.g:935:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalRuleDetectionDsl.g:935:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalRuleDetectionDsl.g:944:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:948:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRuleDetectionDsl.g:949:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalRuleDetectionDsl.g:956:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:960:1: ( ( ruleQualifiedName ) )
            // InternalRuleDetectionDsl.g:961:1: ( ruleQualifiedName )
            {
            // InternalRuleDetectionDsl.g:961:1: ( ruleQualifiedName )
            // InternalRuleDetectionDsl.g:962:2: ruleQualifiedName
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
    // InternalRuleDetectionDsl.g:971:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:975:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRuleDetectionDsl.g:976:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalRuleDetectionDsl.g:982:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:986:1: ( ( ( '.*' )? ) )
            // InternalRuleDetectionDsl.g:987:1: ( ( '.*' )? )
            {
            // InternalRuleDetectionDsl.g:987:1: ( ( '.*' )? )
            // InternalRuleDetectionDsl.g:988:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalRuleDetectionDsl.g:989:2: ( '.*' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRuleDetectionDsl.g:989:3: '.*'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalRuleDetectionDsl.g:998:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1002:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRuleDetectionDsl.g:1003:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalRuleDetectionDsl.g:1010:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1014:1: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:1015:1: ( RULE_ID )
            {
            // InternalRuleDetectionDsl.g:1015:1: ( RULE_ID )
            // InternalRuleDetectionDsl.g:1016:2: RULE_ID
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
    // InternalRuleDetectionDsl.g:1025:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1029:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRuleDetectionDsl.g:1030:2: rule__QualifiedName__Group__1__Impl
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
    // InternalRuleDetectionDsl.g:1036:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1040:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRuleDetectionDsl.g:1041:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRuleDetectionDsl.g:1041:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRuleDetectionDsl.g:1042:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalRuleDetectionDsl.g:1043:2: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==18) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRuleDetectionDsl.g:1043:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRuleDetectionDsl.g:1052:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1056:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRuleDetectionDsl.g:1057:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalRuleDetectionDsl.g:1064:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1068:1: ( ( '.' ) )
            // InternalRuleDetectionDsl.g:1069:1: ( '.' )
            {
            // InternalRuleDetectionDsl.g:1069:1: ( '.' )
            // InternalRuleDetectionDsl.g:1070:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:1079:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1083:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRuleDetectionDsl.g:1084:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalRuleDetectionDsl.g:1090:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1094:1: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:1095:1: ( RULE_ID )
            {
            // InternalRuleDetectionDsl.g:1095:1: ( RULE_ID )
            // InternalRuleDetectionDsl.g:1096:2: RULE_ID
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
    // InternalRuleDetectionDsl.g:1106:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1110:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalRuleDetectionDsl.g:1111:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalRuleDetectionDsl.g:1118:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__NameAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1122:1: ( ( ( rule__Rule__NameAssignment_0 ) ) )
            // InternalRuleDetectionDsl.g:1123:1: ( ( rule__Rule__NameAssignment_0 ) )
            {
            // InternalRuleDetectionDsl.g:1123:1: ( ( rule__Rule__NameAssignment_0 ) )
            // InternalRuleDetectionDsl.g:1124:2: ( rule__Rule__NameAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_0()); 
            // InternalRuleDetectionDsl.g:1125:2: ( rule__Rule__NameAssignment_0 )
            // InternalRuleDetectionDsl.g:1125:3: rule__Rule__NameAssignment_0
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
    // InternalRuleDetectionDsl.g:1133:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1137:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalRuleDetectionDsl.g:1138:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalRuleDetectionDsl.g:1145:1: rule__Rule__Group__1__Impl : ( '{' ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1149:1: ( ( '{' ) )
            // InternalRuleDetectionDsl.g:1150:1: ( '{' )
            {
            // InternalRuleDetectionDsl.g:1150:1: ( '{' )
            // InternalRuleDetectionDsl.g:1151:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:1160:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1164:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalRuleDetectionDsl.g:1165:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalRuleDetectionDsl.g:1172:1: rule__Rule__Group__2__Impl : ( 'on' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1176:1: ( ( 'on' ) )
            // InternalRuleDetectionDsl.g:1177:1: ( 'on' )
            {
            // InternalRuleDetectionDsl.g:1177:1: ( 'on' )
            // InternalRuleDetectionDsl.g:1178:2: 'on'
            {
             before(grammarAccess.getRuleAccess().getOnKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:1187:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1191:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalRuleDetectionDsl.g:1192:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalRuleDetectionDsl.g:1199:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__EventAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1203:1: ( ( ( rule__Rule__EventAssignment_3 ) ) )
            // InternalRuleDetectionDsl.g:1204:1: ( ( rule__Rule__EventAssignment_3 ) )
            {
            // InternalRuleDetectionDsl.g:1204:1: ( ( rule__Rule__EventAssignment_3 ) )
            // InternalRuleDetectionDsl.g:1205:2: ( rule__Rule__EventAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getEventAssignment_3()); 
            // InternalRuleDetectionDsl.g:1206:2: ( rule__Rule__EventAssignment_3 )
            // InternalRuleDetectionDsl.g:1206:3: rule__Rule__EventAssignment_3
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
    // InternalRuleDetectionDsl.g:1214:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1218:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // InternalRuleDetectionDsl.g:1219:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDetectionDsl.g:1226:1: rule__Rule__Group__4__Impl : ( 'do' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1230:1: ( ( 'do' ) )
            // InternalRuleDetectionDsl.g:1231:1: ( 'do' )
            {
            // InternalRuleDetectionDsl.g:1231:1: ( 'do' )
            // InternalRuleDetectionDsl.g:1232:2: 'do'
            {
             before(grammarAccess.getRuleAccess().getDoKeyword_4()); 
            match(input,21,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:1241:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl rule__Rule__Group__6 ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1245:1: ( rule__Rule__Group__5__Impl rule__Rule__Group__6 )
            // InternalRuleDetectionDsl.g:1246:2: rule__Rule__Group__5__Impl rule__Rule__Group__6
            {
            pushFollow(FOLLOW_13);
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
    // InternalRuleDetectionDsl.g:1253:1: rule__Rule__Group__5__Impl : ( ( rule__Rule__Group_5__0 ) ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1257:1: ( ( ( rule__Rule__Group_5__0 ) ) )
            // InternalRuleDetectionDsl.g:1258:1: ( ( rule__Rule__Group_5__0 ) )
            {
            // InternalRuleDetectionDsl.g:1258:1: ( ( rule__Rule__Group_5__0 ) )
            // InternalRuleDetectionDsl.g:1259:2: ( rule__Rule__Group_5__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup_5()); 
            // InternalRuleDetectionDsl.g:1260:2: ( rule__Rule__Group_5__0 )
            // InternalRuleDetectionDsl.g:1260:3: rule__Rule__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup_5()); 

            }


            }

        }
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
    // InternalRuleDetectionDsl.g:1268:1: rule__Rule__Group__6 : rule__Rule__Group__6__Impl ;
    public final void rule__Rule__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1272:1: ( rule__Rule__Group__6__Impl )
            // InternalRuleDetectionDsl.g:1273:2: rule__Rule__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__6__Impl();

            state._fsp--;


            }

        }
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
    // InternalRuleDetectionDsl.g:1279:1: rule__Rule__Group__6__Impl : ( '}' ) ;
    public final void rule__Rule__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1283:1: ( ( '}' ) )
            // InternalRuleDetectionDsl.g:1284:1: ( '}' )
            {
            // InternalRuleDetectionDsl.g:1284:1: ( '}' )
            // InternalRuleDetectionDsl.g:1285:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__Rule__Group_5__0"
    // InternalRuleDetectionDsl.g:1295:1: rule__Rule__Group_5__0 : rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 ;
    public final void rule__Rule__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1299:1: ( rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1 )
            // InternalRuleDetectionDsl.g:1300:2: rule__Rule__Group_5__0__Impl rule__Rule__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Rule__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0"


    // $ANTLR start "rule__Rule__Group_5__0__Impl"
    // InternalRuleDetectionDsl.g:1307:1: rule__Rule__Group_5__0__Impl : ( ( rule__Rule__ActionsAssignment_5_0 ) ) ;
    public final void rule__Rule__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1311:1: ( ( ( rule__Rule__ActionsAssignment_5_0 ) ) )
            // InternalRuleDetectionDsl.g:1312:1: ( ( rule__Rule__ActionsAssignment_5_0 ) )
            {
            // InternalRuleDetectionDsl.g:1312:1: ( ( rule__Rule__ActionsAssignment_5_0 ) )
            // InternalRuleDetectionDsl.g:1313:2: ( rule__Rule__ActionsAssignment_5_0 )
            {
             before(grammarAccess.getRuleAccess().getActionsAssignment_5_0()); 
            // InternalRuleDetectionDsl.g:1314:2: ( rule__Rule__ActionsAssignment_5_0 )
            // InternalRuleDetectionDsl.g:1314:3: rule__Rule__ActionsAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ActionsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getActionsAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__0__Impl"


    // $ANTLR start "rule__Rule__Group_5__1"
    // InternalRuleDetectionDsl.g:1322:1: rule__Rule__Group_5__1 : rule__Rule__Group_5__1__Impl ;
    public final void rule__Rule__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1326:1: ( rule__Rule__Group_5__1__Impl )
            // InternalRuleDetectionDsl.g:1327:2: rule__Rule__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1"


    // $ANTLR start "rule__Rule__Group_5__1__Impl"
    // InternalRuleDetectionDsl.g:1333:1: rule__Rule__Group_5__1__Impl : ( ( rule__Rule__ActionsAssignment_5_1 )* ) ;
    public final void rule__Rule__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1337:1: ( ( ( rule__Rule__ActionsAssignment_5_1 )* ) )
            // InternalRuleDetectionDsl.g:1338:1: ( ( rule__Rule__ActionsAssignment_5_1 )* )
            {
            // InternalRuleDetectionDsl.g:1338:1: ( ( rule__Rule__ActionsAssignment_5_1 )* )
            // InternalRuleDetectionDsl.g:1339:2: ( rule__Rule__ActionsAssignment_5_1 )*
            {
             before(grammarAccess.getRuleAccess().getActionsAssignment_5_1()); 
            // InternalRuleDetectionDsl.g:1340:2: ( rule__Rule__ActionsAssignment_5_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRuleDetectionDsl.g:1340:3: rule__Rule__ActionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Rule__ActionsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getActionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_5__1__Impl"


    // $ANTLR start "rule__Query__Group__0"
    // InternalRuleDetectionDsl.g:1349:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1353:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // InternalRuleDetectionDsl.g:1354:2: rule__Query__Group__0__Impl rule__Query__Group__1
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
    // InternalRuleDetectionDsl.g:1361:1: rule__Query__Group__0__Impl : ( ( rule__Query__NameAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1365:1: ( ( ( rule__Query__NameAssignment_0 ) ) )
            // InternalRuleDetectionDsl.g:1366:1: ( ( rule__Query__NameAssignment_0 ) )
            {
            // InternalRuleDetectionDsl.g:1366:1: ( ( rule__Query__NameAssignment_0 ) )
            // InternalRuleDetectionDsl.g:1367:2: ( rule__Query__NameAssignment_0 )
            {
             before(grammarAccess.getQueryAccess().getNameAssignment_0()); 
            // InternalRuleDetectionDsl.g:1368:2: ( rule__Query__NameAssignment_0 )
            // InternalRuleDetectionDsl.g:1368:3: rule__Query__NameAssignment_0
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
    // InternalRuleDetectionDsl.g:1376:1: rule__Query__Group__1 : rule__Query__Group__1__Impl rule__Query__Group__2 ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1380:1: ( rule__Query__Group__1__Impl rule__Query__Group__2 )
            // InternalRuleDetectionDsl.g:1381:2: rule__Query__Group__1__Impl rule__Query__Group__2
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
    // InternalRuleDetectionDsl.g:1388:1: rule__Query__Group__1__Impl : ( ':' ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1392:1: ( ( ':' ) )
            // InternalRuleDetectionDsl.g:1393:1: ( ':' )
            {
            // InternalRuleDetectionDsl.g:1393:1: ( ':' )
            // InternalRuleDetectionDsl.g:1394:2: ':'
            {
             before(grammarAccess.getQueryAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:1403:1: rule__Query__Group__2 : rule__Query__Group__2__Impl rule__Query__Group__3 ;
    public final void rule__Query__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1407:1: ( rule__Query__Group__2__Impl rule__Query__Group__3 )
            // InternalRuleDetectionDsl.g:1408:2: rule__Query__Group__2__Impl rule__Query__Group__3
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
    // InternalRuleDetectionDsl.g:1415:1: rule__Query__Group__2__Impl : ( ( rule__Query__SelectAssignment_2 ) ) ;
    public final void rule__Query__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1419:1: ( ( ( rule__Query__SelectAssignment_2 ) ) )
            // InternalRuleDetectionDsl.g:1420:1: ( ( rule__Query__SelectAssignment_2 ) )
            {
            // InternalRuleDetectionDsl.g:1420:1: ( ( rule__Query__SelectAssignment_2 ) )
            // InternalRuleDetectionDsl.g:1421:2: ( rule__Query__SelectAssignment_2 )
            {
             before(grammarAccess.getQueryAccess().getSelectAssignment_2()); 
            // InternalRuleDetectionDsl.g:1422:2: ( rule__Query__SelectAssignment_2 )
            // InternalRuleDetectionDsl.g:1422:3: rule__Query__SelectAssignment_2
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
    // InternalRuleDetectionDsl.g:1430:1: rule__Query__Group__3 : rule__Query__Group__3__Impl ;
    public final void rule__Query__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1434:1: ( rule__Query__Group__3__Impl )
            // InternalRuleDetectionDsl.g:1435:2: rule__Query__Group__3__Impl
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
    // InternalRuleDetectionDsl.g:1441:1: rule__Query__Group__3__Impl : ( ( rule__Query__WhereAssignment_3 )? ) ;
    public final void rule__Query__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1445:1: ( ( ( rule__Query__WhereAssignment_3 )? ) )
            // InternalRuleDetectionDsl.g:1446:1: ( ( rule__Query__WhereAssignment_3 )? )
            {
            // InternalRuleDetectionDsl.g:1446:1: ( ( rule__Query__WhereAssignment_3 )? )
            // InternalRuleDetectionDsl.g:1447:2: ( rule__Query__WhereAssignment_3 )?
            {
             before(grammarAccess.getQueryAccess().getWhereAssignment_3()); 
            // InternalRuleDetectionDsl.g:1448:2: ( rule__Query__WhereAssignment_3 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRuleDetectionDsl.g:1448:3: rule__Query__WhereAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Query__WhereAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQueryAccess().getWhereAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__AddingSelect__Group__0"
    // InternalRuleDetectionDsl.g:1457:1: rule__AddingSelect__Group__0 : rule__AddingSelect__Group__0__Impl rule__AddingSelect__Group__1 ;
    public final void rule__AddingSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1461:1: ( rule__AddingSelect__Group__0__Impl rule__AddingSelect__Group__1 )
            // InternalRuleDetectionDsl.g:1462:2: rule__AddingSelect__Group__0__Impl rule__AddingSelect__Group__1
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
    // InternalRuleDetectionDsl.g:1469:1: rule__AddingSelect__Group__0__Impl : ( ( rule__AddingSelect__OperationAssignment_0 ) ) ;
    public final void rule__AddingSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1473:1: ( ( ( rule__AddingSelect__OperationAssignment_0 ) ) )
            // InternalRuleDetectionDsl.g:1474:1: ( ( rule__AddingSelect__OperationAssignment_0 ) )
            {
            // InternalRuleDetectionDsl.g:1474:1: ( ( rule__AddingSelect__OperationAssignment_0 ) )
            // InternalRuleDetectionDsl.g:1475:2: ( rule__AddingSelect__OperationAssignment_0 )
            {
             before(grammarAccess.getAddingSelectAccess().getOperationAssignment_0()); 
            // InternalRuleDetectionDsl.g:1476:2: ( rule__AddingSelect__OperationAssignment_0 )
            // InternalRuleDetectionDsl.g:1476:3: rule__AddingSelect__OperationAssignment_0
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
    // InternalRuleDetectionDsl.g:1484:1: rule__AddingSelect__Group__1 : rule__AddingSelect__Group__1__Impl ;
    public final void rule__AddingSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1488:1: ( rule__AddingSelect__Group__1__Impl )
            // InternalRuleDetectionDsl.g:1489:2: rule__AddingSelect__Group__1__Impl
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
    // InternalRuleDetectionDsl.g:1495:1: rule__AddingSelect__Group__1__Impl : ( ( rule__AddingSelect__Alternatives_1 ) ) ;
    public final void rule__AddingSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1499:1: ( ( ( rule__AddingSelect__Alternatives_1 ) ) )
            // InternalRuleDetectionDsl.g:1500:1: ( ( rule__AddingSelect__Alternatives_1 ) )
            {
            // InternalRuleDetectionDsl.g:1500:1: ( ( rule__AddingSelect__Alternatives_1 ) )
            // InternalRuleDetectionDsl.g:1501:2: ( rule__AddingSelect__Alternatives_1 )
            {
             before(grammarAccess.getAddingSelectAccess().getAlternatives_1()); 
            // InternalRuleDetectionDsl.g:1502:2: ( rule__AddingSelect__Alternatives_1 )
            // InternalRuleDetectionDsl.g:1502:3: rule__AddingSelect__Alternatives_1
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
    // InternalRuleDetectionDsl.g:1511:1: rule__SetSelect__Group__0 : rule__SetSelect__Group__0__Impl rule__SetSelect__Group__1 ;
    public final void rule__SetSelect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1515:1: ( rule__SetSelect__Group__0__Impl rule__SetSelect__Group__1 )
            // InternalRuleDetectionDsl.g:1516:2: rule__SetSelect__Group__0__Impl rule__SetSelect__Group__1
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
    // InternalRuleDetectionDsl.g:1523:1: rule__SetSelect__Group__0__Impl : ( () ) ;
    public final void rule__SetSelect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1527:1: ( ( () ) )
            // InternalRuleDetectionDsl.g:1528:1: ( () )
            {
            // InternalRuleDetectionDsl.g:1528:1: ( () )
            // InternalRuleDetectionDsl.g:1529:2: ()
            {
             before(grammarAccess.getSetSelectAccess().getSetSelectAction_0()); 
            // InternalRuleDetectionDsl.g:1530:2: ()
            // InternalRuleDetectionDsl.g:1530:3: 
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
    // InternalRuleDetectionDsl.g:1538:1: rule__SetSelect__Group__1 : rule__SetSelect__Group__1__Impl rule__SetSelect__Group__2 ;
    public final void rule__SetSelect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1542:1: ( rule__SetSelect__Group__1__Impl rule__SetSelect__Group__2 )
            // InternalRuleDetectionDsl.g:1543:2: rule__SetSelect__Group__1__Impl rule__SetSelect__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDetectionDsl.g:1550:1: rule__SetSelect__Group__1__Impl : ( 'select' ) ;
    public final void rule__SetSelect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1554:1: ( ( 'select' ) )
            // InternalRuleDetectionDsl.g:1555:1: ( 'select' )
            {
            // InternalRuleDetectionDsl.g:1555:1: ( 'select' )
            // InternalRuleDetectionDsl.g:1556:2: 'select'
            {
             before(grammarAccess.getSetSelectAccess().getSelectKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:1565:1: rule__SetSelect__Group__2 : rule__SetSelect__Group__2__Impl rule__SetSelect__Group__3 ;
    public final void rule__SetSelect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1569:1: ( rule__SetSelect__Group__2__Impl rule__SetSelect__Group__3 )
            // InternalRuleDetectionDsl.g:1570:2: rule__SetSelect__Group__2__Impl rule__SetSelect__Group__3
            {
            pushFollow(FOLLOW_18);
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
    // InternalRuleDetectionDsl.g:1577:1: rule__SetSelect__Group__2__Impl : ( ( rule__SetSelect__Group_2__0 ) ) ;
    public final void rule__SetSelect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1581:1: ( ( ( rule__SetSelect__Group_2__0 ) ) )
            // InternalRuleDetectionDsl.g:1582:1: ( ( rule__SetSelect__Group_2__0 ) )
            {
            // InternalRuleDetectionDsl.g:1582:1: ( ( rule__SetSelect__Group_2__0 ) )
            // InternalRuleDetectionDsl.g:1583:2: ( rule__SetSelect__Group_2__0 )
            {
             before(grammarAccess.getSetSelectAccess().getGroup_2()); 
            // InternalRuleDetectionDsl.g:1584:2: ( rule__SetSelect__Group_2__0 )
            // InternalRuleDetectionDsl.g:1584:3: rule__SetSelect__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getGroup_2()); 

            }


            }

        }
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
    // InternalRuleDetectionDsl.g:1592:1: rule__SetSelect__Group__3 : rule__SetSelect__Group__3__Impl ;
    public final void rule__SetSelect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1596:1: ( rule__SetSelect__Group__3__Impl )
            // InternalRuleDetectionDsl.g:1597:2: rule__SetSelect__Group__3__Impl
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
    // InternalRuleDetectionDsl.g:1603:1: rule__SetSelect__Group__3__Impl : ( ( rule__SetSelect__Group_3__0 )? ) ;
    public final void rule__SetSelect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1607:1: ( ( ( rule__SetSelect__Group_3__0 )? ) )
            // InternalRuleDetectionDsl.g:1608:1: ( ( rule__SetSelect__Group_3__0 )? )
            {
            // InternalRuleDetectionDsl.g:1608:1: ( ( rule__SetSelect__Group_3__0 )? )
            // InternalRuleDetectionDsl.g:1609:2: ( rule__SetSelect__Group_3__0 )?
            {
             before(grammarAccess.getSetSelectAccess().getGroup_3()); 
            // InternalRuleDetectionDsl.g:1610:2: ( rule__SetSelect__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_SETOPERATOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRuleDetectionDsl.g:1610:3: rule__SetSelect__Group_3__0
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


    // $ANTLR start "rule__SetSelect__Group_2__0"
    // InternalRuleDetectionDsl.g:1619:1: rule__SetSelect__Group_2__0 : rule__SetSelect__Group_2__0__Impl rule__SetSelect__Group_2__1 ;
    public final void rule__SetSelect__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1623:1: ( rule__SetSelect__Group_2__0__Impl rule__SetSelect__Group_2__1 )
            // InternalRuleDetectionDsl.g:1624:2: rule__SetSelect__Group_2__0__Impl rule__SetSelect__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__SetSelect__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2__0"


    // $ANTLR start "rule__SetSelect__Group_2__0__Impl"
    // InternalRuleDetectionDsl.g:1631:1: rule__SetSelect__Group_2__0__Impl : ( ( rule__SetSelect__SelectionAssignment_2_0 ) ) ;
    public final void rule__SetSelect__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1635:1: ( ( ( rule__SetSelect__SelectionAssignment_2_0 ) ) )
            // InternalRuleDetectionDsl.g:1636:1: ( ( rule__SetSelect__SelectionAssignment_2_0 ) )
            {
            // InternalRuleDetectionDsl.g:1636:1: ( ( rule__SetSelect__SelectionAssignment_2_0 ) )
            // InternalRuleDetectionDsl.g:1637:2: ( rule__SetSelect__SelectionAssignment_2_0 )
            {
             before(grammarAccess.getSetSelectAccess().getSelectionAssignment_2_0()); 
            // InternalRuleDetectionDsl.g:1638:2: ( rule__SetSelect__SelectionAssignment_2_0 )
            // InternalRuleDetectionDsl.g:1638:3: rule__SetSelect__SelectionAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__SelectionAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getSelectionAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_2__1"
    // InternalRuleDetectionDsl.g:1646:1: rule__SetSelect__Group_2__1 : rule__SetSelect__Group_2__1__Impl ;
    public final void rule__SetSelect__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1650:1: ( rule__SetSelect__Group_2__1__Impl )
            // InternalRuleDetectionDsl.g:1651:2: rule__SetSelect__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2__1"


    // $ANTLR start "rule__SetSelect__Group_2__1__Impl"
    // InternalRuleDetectionDsl.g:1657:1: rule__SetSelect__Group_2__1__Impl : ( ( rule__SetSelect__Group_2_1__0 )* ) ;
    public final void rule__SetSelect__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1661:1: ( ( ( rule__SetSelect__Group_2_1__0 )* ) )
            // InternalRuleDetectionDsl.g:1662:1: ( ( rule__SetSelect__Group_2_1__0 )* )
            {
            // InternalRuleDetectionDsl.g:1662:1: ( ( rule__SetSelect__Group_2_1__0 )* )
            // InternalRuleDetectionDsl.g:1663:2: ( rule__SetSelect__Group_2_1__0 )*
            {
             before(grammarAccess.getSetSelectAccess().getGroup_2_1()); 
            // InternalRuleDetectionDsl.g:1664:2: ( rule__SetSelect__Group_2_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==25) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRuleDetectionDsl.g:1664:3: rule__SetSelect__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SetSelect__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSetSelectAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2__1__Impl"


    // $ANTLR start "rule__SetSelect__Group_2_1__0"
    // InternalRuleDetectionDsl.g:1673:1: rule__SetSelect__Group_2_1__0 : rule__SetSelect__Group_2_1__0__Impl rule__SetSelect__Group_2_1__1 ;
    public final void rule__SetSelect__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1677:1: ( rule__SetSelect__Group_2_1__0__Impl rule__SetSelect__Group_2_1__1 )
            // InternalRuleDetectionDsl.g:1678:2: rule__SetSelect__Group_2_1__0__Impl rule__SetSelect__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__SetSelect__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_1__0"


    // $ANTLR start "rule__SetSelect__Group_2_1__0__Impl"
    // InternalRuleDetectionDsl.g:1685:1: rule__SetSelect__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__SetSelect__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1689:1: ( ( ',' ) )
            // InternalRuleDetectionDsl.g:1690:1: ( ',' )
            {
            // InternalRuleDetectionDsl.g:1690:1: ( ',' )
            // InternalRuleDetectionDsl.g:1691:2: ','
            {
             before(grammarAccess.getSetSelectAccess().getCommaKeyword_2_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_1__0__Impl"


    // $ANTLR start "rule__SetSelect__Group_2_1__1"
    // InternalRuleDetectionDsl.g:1700:1: rule__SetSelect__Group_2_1__1 : rule__SetSelect__Group_2_1__1__Impl ;
    public final void rule__SetSelect__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1704:1: ( rule__SetSelect__Group_2_1__1__Impl )
            // InternalRuleDetectionDsl.g:1705:2: rule__SetSelect__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_1__1"


    // $ANTLR start "rule__SetSelect__Group_2_1__1__Impl"
    // InternalRuleDetectionDsl.g:1711:1: rule__SetSelect__Group_2_1__1__Impl : ( ( rule__SetSelect__SelectionAssignment_2_1_1 ) ) ;
    public final void rule__SetSelect__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1715:1: ( ( ( rule__SetSelect__SelectionAssignment_2_1_1 ) ) )
            // InternalRuleDetectionDsl.g:1716:1: ( ( rule__SetSelect__SelectionAssignment_2_1_1 ) )
            {
            // InternalRuleDetectionDsl.g:1716:1: ( ( rule__SetSelect__SelectionAssignment_2_1_1 ) )
            // InternalRuleDetectionDsl.g:1717:2: ( rule__SetSelect__SelectionAssignment_2_1_1 )
            {
             before(grammarAccess.getSetSelectAccess().getSelectionAssignment_2_1_1()); 
            // InternalRuleDetectionDsl.g:1718:2: ( rule__SetSelect__SelectionAssignment_2_1_1 )
            // InternalRuleDetectionDsl.g:1718:3: rule__SetSelect__SelectionAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SetSelect__SelectionAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSetSelectAccess().getSelectionAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__Group_2_1__1__Impl"


    // $ANTLR start "rule__SetSelect__Group_3__0"
    // InternalRuleDetectionDsl.g:1727:1: rule__SetSelect__Group_3__0 : rule__SetSelect__Group_3__0__Impl rule__SetSelect__Group_3__1 ;
    public final void rule__SetSelect__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1731:1: ( rule__SetSelect__Group_3__0__Impl rule__SetSelect__Group_3__1 )
            // InternalRuleDetectionDsl.g:1732:2: rule__SetSelect__Group_3__0__Impl rule__SetSelect__Group_3__1
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
    // InternalRuleDetectionDsl.g:1739:1: rule__SetSelect__Group_3__0__Impl : ( ( rule__SetSelect__OperatorAssignment_3_0 ) ) ;
    public final void rule__SetSelect__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1743:1: ( ( ( rule__SetSelect__OperatorAssignment_3_0 ) ) )
            // InternalRuleDetectionDsl.g:1744:1: ( ( rule__SetSelect__OperatorAssignment_3_0 ) )
            {
            // InternalRuleDetectionDsl.g:1744:1: ( ( rule__SetSelect__OperatorAssignment_3_0 ) )
            // InternalRuleDetectionDsl.g:1745:2: ( rule__SetSelect__OperatorAssignment_3_0 )
            {
             before(grammarAccess.getSetSelectAccess().getOperatorAssignment_3_0()); 
            // InternalRuleDetectionDsl.g:1746:2: ( rule__SetSelect__OperatorAssignment_3_0 )
            // InternalRuleDetectionDsl.g:1746:3: rule__SetSelect__OperatorAssignment_3_0
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
    // InternalRuleDetectionDsl.g:1754:1: rule__SetSelect__Group_3__1 : rule__SetSelect__Group_3__1__Impl ;
    public final void rule__SetSelect__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1758:1: ( rule__SetSelect__Group_3__1__Impl )
            // InternalRuleDetectionDsl.g:1759:2: rule__SetSelect__Group_3__1__Impl
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
    // InternalRuleDetectionDsl.g:1765:1: rule__SetSelect__Group_3__1__Impl : ( ( rule__SetSelect__SelectAssignment_3_1 ) ) ;
    public final void rule__SetSelect__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1769:1: ( ( ( rule__SetSelect__SelectAssignment_3_1 ) ) )
            // InternalRuleDetectionDsl.g:1770:1: ( ( rule__SetSelect__SelectAssignment_3_1 ) )
            {
            // InternalRuleDetectionDsl.g:1770:1: ( ( rule__SetSelect__SelectAssignment_3_1 ) )
            // InternalRuleDetectionDsl.g:1771:2: ( rule__SetSelect__SelectAssignment_3_1 )
            {
             before(grammarAccess.getSetSelectAccess().getSelectAssignment_3_1()); 
            // InternalRuleDetectionDsl.g:1772:2: ( rule__SetSelect__SelectAssignment_3_1 )
            // InternalRuleDetectionDsl.g:1772:3: rule__SetSelect__SelectAssignment_3_1
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


    // $ANTLR start "rule__Where__Group__0"
    // InternalRuleDetectionDsl.g:1781:1: rule__Where__Group__0 : rule__Where__Group__0__Impl rule__Where__Group__1 ;
    public final void rule__Where__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1785:1: ( rule__Where__Group__0__Impl rule__Where__Group__1 )
            // InternalRuleDetectionDsl.g:1786:2: rule__Where__Group__0__Impl rule__Where__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRuleDetectionDsl.g:1793:1: rule__Where__Group__0__Impl : ( 'where' ) ;
    public final void rule__Where__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1797:1: ( ( 'where' ) )
            // InternalRuleDetectionDsl.g:1798:1: ( 'where' )
            {
            // InternalRuleDetectionDsl.g:1798:1: ( 'where' )
            // InternalRuleDetectionDsl.g:1799:2: 'where'
            {
             before(grammarAccess.getWhereAccess().getWhereKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:1808:1: rule__Where__Group__1 : rule__Where__Group__1__Impl rule__Where__Group__2 ;
    public final void rule__Where__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1812:1: ( rule__Where__Group__1__Impl rule__Where__Group__2 )
            // InternalRuleDetectionDsl.g:1813:2: rule__Where__Group__1__Impl rule__Where__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalRuleDetectionDsl.g:1820:1: rule__Where__Group__1__Impl : ( ( rule__Where__LeftAssignment_1 ) ) ;
    public final void rule__Where__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1824:1: ( ( ( rule__Where__LeftAssignment_1 ) ) )
            // InternalRuleDetectionDsl.g:1825:1: ( ( rule__Where__LeftAssignment_1 ) )
            {
            // InternalRuleDetectionDsl.g:1825:1: ( ( rule__Where__LeftAssignment_1 ) )
            // InternalRuleDetectionDsl.g:1826:2: ( rule__Where__LeftAssignment_1 )
            {
             before(grammarAccess.getWhereAccess().getLeftAssignment_1()); 
            // InternalRuleDetectionDsl.g:1827:2: ( rule__Where__LeftAssignment_1 )
            // InternalRuleDetectionDsl.g:1827:3: rule__Where__LeftAssignment_1
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
    // InternalRuleDetectionDsl.g:1835:1: rule__Where__Group__2 : rule__Where__Group__2__Impl rule__Where__Group__3 ;
    public final void rule__Where__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1839:1: ( rule__Where__Group__2__Impl rule__Where__Group__3 )
            // InternalRuleDetectionDsl.g:1840:2: rule__Where__Group__2__Impl rule__Where__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalRuleDetectionDsl.g:1847:1: rule__Where__Group__2__Impl : ( ( rule__Where__LogicalOperatorAssignment_2 ) ) ;
    public final void rule__Where__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1851:1: ( ( ( rule__Where__LogicalOperatorAssignment_2 ) ) )
            // InternalRuleDetectionDsl.g:1852:1: ( ( rule__Where__LogicalOperatorAssignment_2 ) )
            {
            // InternalRuleDetectionDsl.g:1852:1: ( ( rule__Where__LogicalOperatorAssignment_2 ) )
            // InternalRuleDetectionDsl.g:1853:2: ( rule__Where__LogicalOperatorAssignment_2 )
            {
             before(grammarAccess.getWhereAccess().getLogicalOperatorAssignment_2()); 
            // InternalRuleDetectionDsl.g:1854:2: ( rule__Where__LogicalOperatorAssignment_2 )
            // InternalRuleDetectionDsl.g:1854:3: rule__Where__LogicalOperatorAssignment_2
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
    // InternalRuleDetectionDsl.g:1862:1: rule__Where__Group__3 : rule__Where__Group__3__Impl ;
    public final void rule__Where__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1866:1: ( rule__Where__Group__3__Impl )
            // InternalRuleDetectionDsl.g:1867:2: rule__Where__Group__3__Impl
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
    // InternalRuleDetectionDsl.g:1873:1: rule__Where__Group__3__Impl : ( ( rule__Where__Alternatives_3 ) ) ;
    public final void rule__Where__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1877:1: ( ( ( rule__Where__Alternatives_3 ) ) )
            // InternalRuleDetectionDsl.g:1878:1: ( ( rule__Where__Alternatives_3 ) )
            {
            // InternalRuleDetectionDsl.g:1878:1: ( ( rule__Where__Alternatives_3 ) )
            // InternalRuleDetectionDsl.g:1879:2: ( rule__Where__Alternatives_3 )
            {
             before(grammarAccess.getWhereAccess().getAlternatives_3()); 
            // InternalRuleDetectionDsl.g:1880:2: ( rule__Where__Alternatives_3 )
            // InternalRuleDetectionDsl.g:1880:3: rule__Where__Alternatives_3
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


    // $ANTLR start "rule__ConcreteRecipient__Group__0"
    // InternalRuleDetectionDsl.g:1889:1: rule__ConcreteRecipient__Group__0 : rule__ConcreteRecipient__Group__0__Impl rule__ConcreteRecipient__Group__1 ;
    public final void rule__ConcreteRecipient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1893:1: ( rule__ConcreteRecipient__Group__0__Impl rule__ConcreteRecipient__Group__1 )
            // InternalRuleDetectionDsl.g:1894:2: rule__ConcreteRecipient__Group__0__Impl rule__ConcreteRecipient__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ConcreteRecipient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConcreteRecipient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteRecipient__Group__0"


    // $ANTLR start "rule__ConcreteRecipient__Group__0__Impl"
    // InternalRuleDetectionDsl.g:1901:1: rule__ConcreteRecipient__Group__0__Impl : ( '@' ) ;
    public final void rule__ConcreteRecipient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1905:1: ( ( '@' ) )
            // InternalRuleDetectionDsl.g:1906:1: ( '@' )
            {
            // InternalRuleDetectionDsl.g:1906:1: ( '@' )
            // InternalRuleDetectionDsl.g:1907:2: '@'
            {
             before(grammarAccess.getConcreteRecipientAccess().getCommercialAtKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConcreteRecipientAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteRecipient__Group__0__Impl"


    // $ANTLR start "rule__ConcreteRecipient__Group__1"
    // InternalRuleDetectionDsl.g:1916:1: rule__ConcreteRecipient__Group__1 : rule__ConcreteRecipient__Group__1__Impl ;
    public final void rule__ConcreteRecipient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1920:1: ( rule__ConcreteRecipient__Group__1__Impl )
            // InternalRuleDetectionDsl.g:1921:2: rule__ConcreteRecipient__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteRecipient__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteRecipient__Group__1"


    // $ANTLR start "rule__ConcreteRecipient__Group__1__Impl"
    // InternalRuleDetectionDsl.g:1927:1: rule__ConcreteRecipient__Group__1__Impl : ( ( rule__ConcreteRecipient__UserAssignment_1 ) ) ;
    public final void rule__ConcreteRecipient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1931:1: ( ( ( rule__ConcreteRecipient__UserAssignment_1 ) ) )
            // InternalRuleDetectionDsl.g:1932:1: ( ( rule__ConcreteRecipient__UserAssignment_1 ) )
            {
            // InternalRuleDetectionDsl.g:1932:1: ( ( rule__ConcreteRecipient__UserAssignment_1 ) )
            // InternalRuleDetectionDsl.g:1933:2: ( rule__ConcreteRecipient__UserAssignment_1 )
            {
             before(grammarAccess.getConcreteRecipientAccess().getUserAssignment_1()); 
            // InternalRuleDetectionDsl.g:1934:2: ( rule__ConcreteRecipient__UserAssignment_1 )
            // InternalRuleDetectionDsl.g:1934:3: rule__ConcreteRecipient__UserAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ConcreteRecipient__UserAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConcreteRecipientAccess().getUserAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteRecipient__Group__1__Impl"


    // $ANTLR start "rule__ComplexExpression__Group__0"
    // InternalRuleDetectionDsl.g:1943:1: rule__ComplexExpression__Group__0 : rule__ComplexExpression__Group__0__Impl rule__ComplexExpression__Group__1 ;
    public final void rule__ComplexExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1947:1: ( rule__ComplexExpression__Group__0__Impl rule__ComplexExpression__Group__1 )
            // InternalRuleDetectionDsl.g:1948:2: rule__ComplexExpression__Group__0__Impl rule__ComplexExpression__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalRuleDetectionDsl.g:1955:1: rule__ComplexExpression__Group__0__Impl : ( '(' ) ;
    public final void rule__ComplexExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1959:1: ( ( '(' ) )
            // InternalRuleDetectionDsl.g:1960:1: ( '(' )
            {
            // InternalRuleDetectionDsl.g:1960:1: ( '(' )
            // InternalRuleDetectionDsl.g:1961:2: '('
            {
             before(grammarAccess.getComplexExpressionAccess().getLeftParenthesisKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:1970:1: rule__ComplexExpression__Group__1 : rule__ComplexExpression__Group__1__Impl rule__ComplexExpression__Group__2 ;
    public final void rule__ComplexExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1974:1: ( rule__ComplexExpression__Group__1__Impl rule__ComplexExpression__Group__2 )
            // InternalRuleDetectionDsl.g:1975:2: rule__ComplexExpression__Group__1__Impl rule__ComplexExpression__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRuleDetectionDsl.g:1982:1: rule__ComplexExpression__Group__1__Impl : ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) ) ;
    public final void rule__ComplexExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:1986:1: ( ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) ) )
            // InternalRuleDetectionDsl.g:1987:1: ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) )
            {
            // InternalRuleDetectionDsl.g:1987:1: ( ( rule__ComplexExpression__PlainOperandAssignment_1 ) )
            // InternalRuleDetectionDsl.g:1988:2: ( rule__ComplexExpression__PlainOperandAssignment_1 )
            {
             before(grammarAccess.getComplexExpressionAccess().getPlainOperandAssignment_1()); 
            // InternalRuleDetectionDsl.g:1989:2: ( rule__ComplexExpression__PlainOperandAssignment_1 )
            // InternalRuleDetectionDsl.g:1989:3: rule__ComplexExpression__PlainOperandAssignment_1
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
    // InternalRuleDetectionDsl.g:1997:1: rule__ComplexExpression__Group__2 : rule__ComplexExpression__Group__2__Impl rule__ComplexExpression__Group__3 ;
    public final void rule__ComplexExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2001:1: ( rule__ComplexExpression__Group__2__Impl rule__ComplexExpression__Group__3 )
            // InternalRuleDetectionDsl.g:2002:2: rule__ComplexExpression__Group__2__Impl rule__ComplexExpression__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalRuleDetectionDsl.g:2009:1: rule__ComplexExpression__Group__2__Impl : ( ( rule__ComplexExpression__Group_2__0 )? ) ;
    public final void rule__ComplexExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2013:1: ( ( ( rule__ComplexExpression__Group_2__0 )? ) )
            // InternalRuleDetectionDsl.g:2014:1: ( ( rule__ComplexExpression__Group_2__0 )? )
            {
            // InternalRuleDetectionDsl.g:2014:1: ( ( rule__ComplexExpression__Group_2__0 )? )
            // InternalRuleDetectionDsl.g:2015:2: ( rule__ComplexExpression__Group_2__0 )?
            {
             before(grammarAccess.getComplexExpressionAccess().getGroup_2()); 
            // InternalRuleDetectionDsl.g:2016:2: ( rule__ComplexExpression__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_OPERATOR) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRuleDetectionDsl.g:2016:3: rule__ComplexExpression__Group_2__0
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
    // InternalRuleDetectionDsl.g:2024:1: rule__ComplexExpression__Group__3 : rule__ComplexExpression__Group__3__Impl ;
    public final void rule__ComplexExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2028:1: ( rule__ComplexExpression__Group__3__Impl )
            // InternalRuleDetectionDsl.g:2029:2: rule__ComplexExpression__Group__3__Impl
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
    // InternalRuleDetectionDsl.g:2035:1: rule__ComplexExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__ComplexExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2039:1: ( ( ')' ) )
            // InternalRuleDetectionDsl.g:2040:1: ( ')' )
            {
            // InternalRuleDetectionDsl.g:2040:1: ( ')' )
            // InternalRuleDetectionDsl.g:2041:2: ')'
            {
             before(grammarAccess.getComplexExpressionAccess().getRightParenthesisKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:2051:1: rule__ComplexExpression__Group_2__0 : rule__ComplexExpression__Group_2__0__Impl rule__ComplexExpression__Group_2__1 ;
    public final void rule__ComplexExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2055:1: ( rule__ComplexExpression__Group_2__0__Impl rule__ComplexExpression__Group_2__1 )
            // InternalRuleDetectionDsl.g:2056:2: rule__ComplexExpression__Group_2__0__Impl rule__ComplexExpression__Group_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalRuleDetectionDsl.g:2063:1: rule__ComplexExpression__Group_2__0__Impl : ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) ) ;
    public final void rule__ComplexExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2067:1: ( ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) ) )
            // InternalRuleDetectionDsl.g:2068:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) )
            {
            // InternalRuleDetectionDsl.g:2068:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 ) )
            // InternalRuleDetectionDsl.g:2069:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 )
            {
             before(grammarAccess.getComplexExpressionAccess().getComplexOperandsAssignment_2_0()); 
            // InternalRuleDetectionDsl.g:2070:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_0 )
            // InternalRuleDetectionDsl.g:2070:3: rule__ComplexExpression__ComplexOperandsAssignment_2_0
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
    // InternalRuleDetectionDsl.g:2078:1: rule__ComplexExpression__Group_2__1 : rule__ComplexExpression__Group_2__1__Impl ;
    public final void rule__ComplexExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2082:1: ( rule__ComplexExpression__Group_2__1__Impl )
            // InternalRuleDetectionDsl.g:2083:2: rule__ComplexExpression__Group_2__1__Impl
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
    // InternalRuleDetectionDsl.g:2089:1: rule__ComplexExpression__Group_2__1__Impl : ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* ) ;
    public final void rule__ComplexExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2093:1: ( ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* ) )
            // InternalRuleDetectionDsl.g:2094:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* )
            {
            // InternalRuleDetectionDsl.g:2094:1: ( ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )* )
            // InternalRuleDetectionDsl.g:2095:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )*
            {
             before(grammarAccess.getComplexExpressionAccess().getComplexOperandsAssignment_2_1()); 
            // InternalRuleDetectionDsl.g:2096:2: ( rule__ComplexExpression__ComplexOperandsAssignment_2_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_OPERATOR) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRuleDetectionDsl.g:2096:3: rule__ComplexExpression__ComplexOperandsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__ComplexExpression__ComplexOperandsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalRuleDetectionDsl.g:2105:1: rule__ComplexOperand__Group__0 : rule__ComplexOperand__Group__0__Impl rule__ComplexOperand__Group__1 ;
    public final void rule__ComplexOperand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2109:1: ( rule__ComplexOperand__Group__0__Impl rule__ComplexOperand__Group__1 )
            // InternalRuleDetectionDsl.g:2110:2: rule__ComplexOperand__Group__0__Impl rule__ComplexOperand__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRuleDetectionDsl.g:2117:1: rule__ComplexOperand__Group__0__Impl : ( ( rule__ComplexOperand__OperatorAssignment_0 ) ) ;
    public final void rule__ComplexOperand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2121:1: ( ( ( rule__ComplexOperand__OperatorAssignment_0 ) ) )
            // InternalRuleDetectionDsl.g:2122:1: ( ( rule__ComplexOperand__OperatorAssignment_0 ) )
            {
            // InternalRuleDetectionDsl.g:2122:1: ( ( rule__ComplexOperand__OperatorAssignment_0 ) )
            // InternalRuleDetectionDsl.g:2123:2: ( rule__ComplexOperand__OperatorAssignment_0 )
            {
             before(grammarAccess.getComplexOperandAccess().getOperatorAssignment_0()); 
            // InternalRuleDetectionDsl.g:2124:2: ( rule__ComplexOperand__OperatorAssignment_0 )
            // InternalRuleDetectionDsl.g:2124:3: rule__ComplexOperand__OperatorAssignment_0
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
    // InternalRuleDetectionDsl.g:2132:1: rule__ComplexOperand__Group__1 : rule__ComplexOperand__Group__1__Impl ;
    public final void rule__ComplexOperand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2136:1: ( rule__ComplexOperand__Group__1__Impl )
            // InternalRuleDetectionDsl.g:2137:2: rule__ComplexOperand__Group__1__Impl
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
    // InternalRuleDetectionDsl.g:2143:1: rule__ComplexOperand__Group__1__Impl : ( ( rule__ComplexOperand__ExpressionAssignment_1 ) ) ;
    public final void rule__ComplexOperand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2147:1: ( ( ( rule__ComplexOperand__ExpressionAssignment_1 ) ) )
            // InternalRuleDetectionDsl.g:2148:1: ( ( rule__ComplexOperand__ExpressionAssignment_1 ) )
            {
            // InternalRuleDetectionDsl.g:2148:1: ( ( rule__ComplexOperand__ExpressionAssignment_1 ) )
            // InternalRuleDetectionDsl.g:2149:2: ( rule__ComplexOperand__ExpressionAssignment_1 )
            {
             before(grammarAccess.getComplexOperandAccess().getExpressionAssignment_1()); 
            // InternalRuleDetectionDsl.g:2150:2: ( rule__ComplexOperand__ExpressionAssignment_1 )
            // InternalRuleDetectionDsl.g:2150:3: rule__ComplexOperand__ExpressionAssignment_1
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
    // InternalRuleDetectionDsl.g:2159:1: rule__Message__Group__0 : rule__Message__Group__0__Impl rule__Message__Group__1 ;
    public final void rule__Message__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2163:1: ( rule__Message__Group__0__Impl rule__Message__Group__1 )
            // InternalRuleDetectionDsl.g:2164:2: rule__Message__Group__0__Impl rule__Message__Group__1
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
    // InternalRuleDetectionDsl.g:2171:1: rule__Message__Group__0__Impl : ( ( rule__Message__NameAssignment_0 ) ) ;
    public final void rule__Message__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2175:1: ( ( ( rule__Message__NameAssignment_0 ) ) )
            // InternalRuleDetectionDsl.g:2176:1: ( ( rule__Message__NameAssignment_0 ) )
            {
            // InternalRuleDetectionDsl.g:2176:1: ( ( rule__Message__NameAssignment_0 ) )
            // InternalRuleDetectionDsl.g:2177:2: ( rule__Message__NameAssignment_0 )
            {
             before(grammarAccess.getMessageAccess().getNameAssignment_0()); 
            // InternalRuleDetectionDsl.g:2178:2: ( rule__Message__NameAssignment_0 )
            // InternalRuleDetectionDsl.g:2178:3: rule__Message__NameAssignment_0
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
    // InternalRuleDetectionDsl.g:2186:1: rule__Message__Group__1 : rule__Message__Group__1__Impl rule__Message__Group__2 ;
    public final void rule__Message__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2190:1: ( rule__Message__Group__1__Impl rule__Message__Group__2 )
            // InternalRuleDetectionDsl.g:2191:2: rule__Message__Group__1__Impl rule__Message__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalRuleDetectionDsl.g:2198:1: rule__Message__Group__1__Impl : ( ':' ) ;
    public final void rule__Message__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2202:1: ( ( ':' ) )
            // InternalRuleDetectionDsl.g:2203:1: ( ':' )
            {
            // InternalRuleDetectionDsl.g:2203:1: ( ':' )
            // InternalRuleDetectionDsl.g:2204:2: ':'
            {
             before(grammarAccess.getMessageAccess().getColonKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:2213:1: rule__Message__Group__2 : rule__Message__Group__2__Impl rule__Message__Group__3 ;
    public final void rule__Message__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2217:1: ( rule__Message__Group__2__Impl rule__Message__Group__3 )
            // InternalRuleDetectionDsl.g:2218:2: rule__Message__Group__2__Impl rule__Message__Group__3
            {
            pushFollow(FOLLOW_23);
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
    // InternalRuleDetectionDsl.g:2225:1: rule__Message__Group__2__Impl : ( 'compose' ) ;
    public final void rule__Message__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2229:1: ( ( 'compose' ) )
            // InternalRuleDetectionDsl.g:2230:1: ( 'compose' )
            {
            // InternalRuleDetectionDsl.g:2230:1: ( 'compose' )
            // InternalRuleDetectionDsl.g:2231:2: 'compose'
            {
             before(grammarAccess.getMessageAccess().getComposeKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRuleDetectionDsl.g:2240:1: rule__Message__Group__3 : rule__Message__Group__3__Impl rule__Message__Group__4 ;
    public final void rule__Message__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2244:1: ( rule__Message__Group__3__Impl rule__Message__Group__4 )
            // InternalRuleDetectionDsl.g:2245:2: rule__Message__Group__3__Impl rule__Message__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalRuleDetectionDsl.g:2252:1: rule__Message__Group__3__Impl : ( ( rule__Message__MessageAssignment_3 ) ) ;
    public final void rule__Message__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2256:1: ( ( ( rule__Message__MessageAssignment_3 ) ) )
            // InternalRuleDetectionDsl.g:2257:1: ( ( rule__Message__MessageAssignment_3 ) )
            {
            // InternalRuleDetectionDsl.g:2257:1: ( ( rule__Message__MessageAssignment_3 ) )
            // InternalRuleDetectionDsl.g:2258:2: ( rule__Message__MessageAssignment_3 )
            {
             before(grammarAccess.getMessageAccess().getMessageAssignment_3()); 
            // InternalRuleDetectionDsl.g:2259:2: ( rule__Message__MessageAssignment_3 )
            // InternalRuleDetectionDsl.g:2259:3: rule__Message__MessageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Message__MessageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getMessageAssignment_3()); 

            }


            }

        }
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
    // InternalRuleDetectionDsl.g:2267:1: rule__Message__Group__4 : rule__Message__Group__4__Impl rule__Message__Group__5 ;
    public final void rule__Message__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2271:1: ( rule__Message__Group__4__Impl rule__Message__Group__5 )
            // InternalRuleDetectionDsl.g:2272:2: rule__Message__Group__4__Impl rule__Message__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Message__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Message__Group__5();

            state._fsp--;


            }

        }
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
    // InternalRuleDetectionDsl.g:2279:1: rule__Message__Group__4__Impl : ( 'to' ) ;
    public final void rule__Message__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2283:1: ( ( 'to' ) )
            // InternalRuleDetectionDsl.g:2284:1: ( 'to' )
            {
            // InternalRuleDetectionDsl.g:2284:1: ( 'to' )
            // InternalRuleDetectionDsl.g:2285:2: 'to'
            {
             before(grammarAccess.getMessageAccess().getToKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getToKeyword_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Message__Group__5"
    // InternalRuleDetectionDsl.g:2294:1: rule__Message__Group__5 : rule__Message__Group__5__Impl ;
    public final void rule__Message__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2298:1: ( rule__Message__Group__5__Impl )
            // InternalRuleDetectionDsl.g:2299:2: rule__Message__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Message__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5"


    // $ANTLR start "rule__Message__Group__5__Impl"
    // InternalRuleDetectionDsl.g:2305:1: rule__Message__Group__5__Impl : ( ( rule__Message__RecipientAssignment_5 ) ) ;
    public final void rule__Message__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2309:1: ( ( ( rule__Message__RecipientAssignment_5 ) ) )
            // InternalRuleDetectionDsl.g:2310:1: ( ( rule__Message__RecipientAssignment_5 ) )
            {
            // InternalRuleDetectionDsl.g:2310:1: ( ( rule__Message__RecipientAssignment_5 ) )
            // InternalRuleDetectionDsl.g:2311:2: ( rule__Message__RecipientAssignment_5 )
            {
             before(grammarAccess.getMessageAccess().getRecipientAssignment_5()); 
            // InternalRuleDetectionDsl.g:2312:2: ( rule__Message__RecipientAssignment_5 )
            // InternalRuleDetectionDsl.g:2312:3: rule__Message__RecipientAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Message__RecipientAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMessageAccess().getRecipientAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__Group__5__Impl"


    // $ANTLR start "rule__RuleModel__ImportsAssignment_0_0"
    // InternalRuleDetectionDsl.g:2321:1: rule__RuleModel__ImportsAssignment_0_0 : ( ruleImport ) ;
    public final void rule__RuleModel__ImportsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2325:1: ( ( ruleImport ) )
            // InternalRuleDetectionDsl.g:2326:2: ( ruleImport )
            {
            // InternalRuleDetectionDsl.g:2326:2: ( ruleImport )
            // InternalRuleDetectionDsl.g:2327:3: ruleImport
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
    // InternalRuleDetectionDsl.g:2336:1: rule__RuleModel__ImportsAssignment_0_1 : ( ruleImport ) ;
    public final void rule__RuleModel__ImportsAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2340:1: ( ( ruleImport ) )
            // InternalRuleDetectionDsl.g:2341:2: ( ruleImport )
            {
            // InternalRuleDetectionDsl.g:2341:2: ( ruleImport )
            // InternalRuleDetectionDsl.g:2342:3: ruleImport
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
    // InternalRuleDetectionDsl.g:2351:1: rule__RuleModel__ElementsAssignment_1_0 : ( ruleRule ) ;
    public final void rule__RuleModel__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2355:1: ( ( ruleRule ) )
            // InternalRuleDetectionDsl.g:2356:2: ( ruleRule )
            {
            // InternalRuleDetectionDsl.g:2356:2: ( ruleRule )
            // InternalRuleDetectionDsl.g:2357:3: ruleRule
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
    // InternalRuleDetectionDsl.g:2366:1: rule__RuleModel__ElementsAssignment_1_1 : ( ruleRuleElement ) ;
    public final void rule__RuleModel__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2370:1: ( ( ruleRuleElement ) )
            // InternalRuleDetectionDsl.g:2371:2: ( ruleRuleElement )
            {
            // InternalRuleDetectionDsl.g:2371:2: ( ruleRuleElement )
            // InternalRuleDetectionDsl.g:2372:3: ruleRuleElement
            {
             before(grammarAccess.getRuleModelAccess().getElementsRuleElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleElement();

            state._fsp--;

             after(grammarAccess.getRuleModelAccess().getElementsRuleElementParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalRuleDetectionDsl.g:2381:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2385:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRuleDetectionDsl.g:2386:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRuleDetectionDsl.g:2386:2: ( ruleQualifiedNameWithWildcard )
            // InternalRuleDetectionDsl.g:2387:3: ruleQualifiedNameWithWildcard
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
    // InternalRuleDetectionDsl.g:2396:1: rule__Rule__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2400:1: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2401:2: ( RULE_ID )
            {
            // InternalRuleDetectionDsl.g:2401:2: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2402:3: RULE_ID
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
    // InternalRuleDetectionDsl.g:2411:1: rule__Rule__EventAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Rule__EventAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2415:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDetectionDsl.g:2416:2: ( ( RULE_ID ) )
            {
            // InternalRuleDetectionDsl.g:2416:2: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2417:3: ( RULE_ID )
            {
             before(grammarAccess.getRuleAccess().getEventPhraseCrossReference_3_0()); 
            // InternalRuleDetectionDsl.g:2418:3: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2419:4: RULE_ID
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


    // $ANTLR start "rule__Rule__ActionsAssignment_5_0"
    // InternalRuleDetectionDsl.g:2430:1: rule__Rule__ActionsAssignment_5_0 : ( ruleAction ) ;
    public final void rule__Rule__ActionsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2434:1: ( ( ruleAction ) )
            // InternalRuleDetectionDsl.g:2435:2: ( ruleAction )
            {
            // InternalRuleDetectionDsl.g:2435:2: ( ruleAction )
            // InternalRuleDetectionDsl.g:2436:3: ruleAction
            {
             before(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionsAssignment_5_0"


    // $ANTLR start "rule__Rule__ActionsAssignment_5_1"
    // InternalRuleDetectionDsl.g:2445:1: rule__Rule__ActionsAssignment_5_1 : ( ruleAction ) ;
    public final void rule__Rule__ActionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2449:1: ( ( ruleAction ) )
            // InternalRuleDetectionDsl.g:2450:2: ( ruleAction )
            {
            // InternalRuleDetectionDsl.g:2450:2: ( ruleAction )
            // InternalRuleDetectionDsl.g:2451:3: ruleAction
            {
             before(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getActionsActionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__ActionsAssignment_5_1"


    // $ANTLR start "rule__Query__NameAssignment_0"
    // InternalRuleDetectionDsl.g:2460:1: rule__Query__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Query__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2464:1: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2465:2: ( RULE_ID )
            {
            // InternalRuleDetectionDsl.g:2465:2: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2466:3: RULE_ID
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
    // InternalRuleDetectionDsl.g:2475:1: rule__Query__SelectAssignment_2 : ( ruleSelect ) ;
    public final void rule__Query__SelectAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2479:1: ( ( ruleSelect ) )
            // InternalRuleDetectionDsl.g:2480:2: ( ruleSelect )
            {
            // InternalRuleDetectionDsl.g:2480:2: ( ruleSelect )
            // InternalRuleDetectionDsl.g:2481:3: ruleSelect
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


    // $ANTLR start "rule__Query__WhereAssignment_3"
    // InternalRuleDetectionDsl.g:2490:1: rule__Query__WhereAssignment_3 : ( ruleWhere ) ;
    public final void rule__Query__WhereAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2494:1: ( ( ruleWhere ) )
            // InternalRuleDetectionDsl.g:2495:2: ( ruleWhere )
            {
            // InternalRuleDetectionDsl.g:2495:2: ( ruleWhere )
            // InternalRuleDetectionDsl.g:2496:3: ruleWhere
            {
             before(grammarAccess.getQueryAccess().getWhereWhereParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleWhere();

            state._fsp--;

             after(grammarAccess.getQueryAccess().getWhereWhereParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Query__WhereAssignment_3"


    // $ANTLR start "rule__AddingSelect__OperationAssignment_0"
    // InternalRuleDetectionDsl.g:2505:1: rule__AddingSelect__OperationAssignment_0 : ( RULE_SELECTOPERATOR ) ;
    public final void rule__AddingSelect__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2509:1: ( ( RULE_SELECTOPERATOR ) )
            // InternalRuleDetectionDsl.g:2510:2: ( RULE_SELECTOPERATOR )
            {
            // InternalRuleDetectionDsl.g:2510:2: ( RULE_SELECTOPERATOR )
            // InternalRuleDetectionDsl.g:2511:3: RULE_SELECTOPERATOR
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
    // InternalRuleDetectionDsl.g:2520:1: rule__AddingSelect__ElementAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__AddingSelect__ElementAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2524:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDetectionDsl.g:2525:2: ( ( RULE_ID ) )
            {
            // InternalRuleDetectionDsl.g:2525:2: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2526:3: ( RULE_ID )
            {
             before(grammarAccess.getAddingSelectAccess().getElementConceptCrossReference_1_0_0()); 
            // InternalRuleDetectionDsl.g:2527:3: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2528:4: RULE_ID
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
    // InternalRuleDetectionDsl.g:2539:1: rule__AddingSelect__AllAssignment_1_1 : ( ( '*' ) ) ;
    public final void rule__AddingSelect__AllAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2543:1: ( ( ( '*' ) ) )
            // InternalRuleDetectionDsl.g:2544:2: ( ( '*' ) )
            {
            // InternalRuleDetectionDsl.g:2544:2: ( ( '*' ) )
            // InternalRuleDetectionDsl.g:2545:3: ( '*' )
            {
             before(grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0()); 
            // InternalRuleDetectionDsl.g:2546:3: ( '*' )
            // InternalRuleDetectionDsl.g:2547:4: '*'
            {
             before(grammarAccess.getAddingSelectAccess().getAllAsteriskKeyword_1_1_0()); 
            match(input,32,FOLLOW_2); 
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


    // $ANTLR start "rule__SetSelect__SelectionAssignment_2_0"
    // InternalRuleDetectionDsl.g:2558:1: rule__SetSelect__SelectionAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__SetSelect__SelectionAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2562:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDetectionDsl.g:2563:2: ( ( RULE_ID ) )
            {
            // InternalRuleDetectionDsl.g:2563:2: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2564:3: ( RULE_ID )
            {
             before(grammarAccess.getSetSelectAccess().getSelectionNodeCrossReference_2_0_0()); 
            // InternalRuleDetectionDsl.g:2565:3: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2566:4: RULE_ID
            {
             before(grammarAccess.getSetSelectAccess().getSelectionNodeIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getSelectionNodeIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getSetSelectAccess().getSelectionNodeCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__SelectionAssignment_2_0"


    // $ANTLR start "rule__SetSelect__SelectionAssignment_2_1_1"
    // InternalRuleDetectionDsl.g:2577:1: rule__SetSelect__SelectionAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__SetSelect__SelectionAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2581:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDetectionDsl.g:2582:2: ( ( RULE_ID ) )
            {
            // InternalRuleDetectionDsl.g:2582:2: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2583:3: ( RULE_ID )
            {
             before(grammarAccess.getSetSelectAccess().getSelectionNodeCrossReference_2_1_1_0()); 
            // InternalRuleDetectionDsl.g:2584:3: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2585:4: RULE_ID
            {
             before(grammarAccess.getSetSelectAccess().getSelectionNodeIDTerminalRuleCall_2_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSetSelectAccess().getSelectionNodeIDTerminalRuleCall_2_1_1_0_1()); 

            }

             after(grammarAccess.getSetSelectAccess().getSelectionNodeCrossReference_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetSelect__SelectionAssignment_2_1_1"


    // $ANTLR start "rule__SetSelect__OperatorAssignment_3_0"
    // InternalRuleDetectionDsl.g:2596:1: rule__SetSelect__OperatorAssignment_3_0 : ( RULE_SETOPERATOR ) ;
    public final void rule__SetSelect__OperatorAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2600:1: ( ( RULE_SETOPERATOR ) )
            // InternalRuleDetectionDsl.g:2601:2: ( RULE_SETOPERATOR )
            {
            // InternalRuleDetectionDsl.g:2601:2: ( RULE_SETOPERATOR )
            // InternalRuleDetectionDsl.g:2602:3: RULE_SETOPERATOR
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
    // InternalRuleDetectionDsl.g:2611:1: rule__SetSelect__SelectAssignment_3_1 : ( ruleSetSelect ) ;
    public final void rule__SetSelect__SelectAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2615:1: ( ( ruleSetSelect ) )
            // InternalRuleDetectionDsl.g:2616:2: ( ruleSetSelect )
            {
            // InternalRuleDetectionDsl.g:2616:2: ( ruleSetSelect )
            // InternalRuleDetectionDsl.g:2617:3: ruleSetSelect
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


    // $ANTLR start "rule__Where__LeftAssignment_1"
    // InternalRuleDetectionDsl.g:2626:1: rule__Where__LeftAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Where__LeftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2630:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDetectionDsl.g:2631:2: ( ( RULE_ID ) )
            {
            // InternalRuleDetectionDsl.g:2631:2: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2632:3: ( RULE_ID )
            {
             before(grammarAccess.getWhereAccess().getLeftConceptCrossReference_1_0()); 
            // InternalRuleDetectionDsl.g:2633:3: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2634:4: RULE_ID
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
    // InternalRuleDetectionDsl.g:2645:1: rule__Where__LogicalOperatorAssignment_2 : ( RULE_LOGICALOPERATOR ) ;
    public final void rule__Where__LogicalOperatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2649:1: ( ( RULE_LOGICALOPERATOR ) )
            // InternalRuleDetectionDsl.g:2650:2: ( RULE_LOGICALOPERATOR )
            {
            // InternalRuleDetectionDsl.g:2650:2: ( RULE_LOGICALOPERATOR )
            // InternalRuleDetectionDsl.g:2651:3: RULE_LOGICALOPERATOR
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
    // InternalRuleDetectionDsl.g:2660:1: rule__Where__RightVariableAssignment_3_0 : ( ( RULE_ID ) ) ;
    public final void rule__Where__RightVariableAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2664:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDetectionDsl.g:2665:2: ( ( RULE_ID ) )
            {
            // InternalRuleDetectionDsl.g:2665:2: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2666:3: ( RULE_ID )
            {
             before(grammarAccess.getWhereAccess().getRightVariableConceptCrossReference_3_0_0()); 
            // InternalRuleDetectionDsl.g:2667:3: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2668:4: RULE_ID
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
    // InternalRuleDetectionDsl.g:2679:1: rule__Where__RightAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Where__RightAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2683:1: ( ( RULE_INT ) )
            // InternalRuleDetectionDsl.g:2684:2: ( RULE_INT )
            {
            // InternalRuleDetectionDsl.g:2684:2: ( RULE_INT )
            // InternalRuleDetectionDsl.g:2685:3: RULE_INT
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


    // $ANTLR start "rule__ConcreteRecipient__UserAssignment_1"
    // InternalRuleDetectionDsl.g:2694:1: rule__ConcreteRecipient__UserAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ConcreteRecipient__UserAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2698:1: ( ( RULE_STRING ) )
            // InternalRuleDetectionDsl.g:2699:2: ( RULE_STRING )
            {
            // InternalRuleDetectionDsl.g:2699:2: ( RULE_STRING )
            // InternalRuleDetectionDsl.g:2700:3: RULE_STRING
            {
             before(grammarAccess.getConcreteRecipientAccess().getUserSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getConcreteRecipientAccess().getUserSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConcreteRecipient__UserAssignment_1"


    // $ANTLR start "rule__PlainExpression__PlainOperandAssignment"
    // InternalRuleDetectionDsl.g:2709:1: rule__PlainExpression__PlainOperandAssignment : ( rulePlainOperand ) ;
    public final void rule__PlainExpression__PlainOperandAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2713:1: ( ( rulePlainOperand ) )
            // InternalRuleDetectionDsl.g:2714:2: ( rulePlainOperand )
            {
            // InternalRuleDetectionDsl.g:2714:2: ( rulePlainOperand )
            // InternalRuleDetectionDsl.g:2715:3: rulePlainOperand
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
    // InternalRuleDetectionDsl.g:2724:1: rule__ComplexExpression__PlainOperandAssignment_1 : ( rulePlainOperand ) ;
    public final void rule__ComplexExpression__PlainOperandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2728:1: ( ( rulePlainOperand ) )
            // InternalRuleDetectionDsl.g:2729:2: ( rulePlainOperand )
            {
            // InternalRuleDetectionDsl.g:2729:2: ( rulePlainOperand )
            // InternalRuleDetectionDsl.g:2730:3: rulePlainOperand
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
    // InternalRuleDetectionDsl.g:2739:1: rule__ComplexExpression__ComplexOperandsAssignment_2_0 : ( ruleComplexOperand ) ;
    public final void rule__ComplexExpression__ComplexOperandsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2743:1: ( ( ruleComplexOperand ) )
            // InternalRuleDetectionDsl.g:2744:2: ( ruleComplexOperand )
            {
            // InternalRuleDetectionDsl.g:2744:2: ( ruleComplexOperand )
            // InternalRuleDetectionDsl.g:2745:3: ruleComplexOperand
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
    // InternalRuleDetectionDsl.g:2754:1: rule__ComplexExpression__ComplexOperandsAssignment_2_1 : ( ruleComplexOperand ) ;
    public final void rule__ComplexExpression__ComplexOperandsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2758:1: ( ( ruleComplexOperand ) )
            // InternalRuleDetectionDsl.g:2759:2: ( ruleComplexOperand )
            {
            // InternalRuleDetectionDsl.g:2759:2: ( ruleComplexOperand )
            // InternalRuleDetectionDsl.g:2760:3: ruleComplexOperand
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
    // InternalRuleDetectionDsl.g:2769:1: rule__Numeral__ValueAssignment : ( RULE_DOUBLE ) ;
    public final void rule__Numeral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2773:1: ( ( RULE_DOUBLE ) )
            // InternalRuleDetectionDsl.g:2774:2: ( RULE_DOUBLE )
            {
            // InternalRuleDetectionDsl.g:2774:2: ( RULE_DOUBLE )
            // InternalRuleDetectionDsl.g:2775:3: RULE_DOUBLE
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
    // InternalRuleDetectionDsl.g:2784:1: rule__QueryOperand__QueryAssignment : ( ( RULE_ID ) ) ;
    public final void rule__QueryOperand__QueryAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2788:1: ( ( ( RULE_ID ) ) )
            // InternalRuleDetectionDsl.g:2789:2: ( ( RULE_ID ) )
            {
            // InternalRuleDetectionDsl.g:2789:2: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2790:3: ( RULE_ID )
            {
             before(grammarAccess.getQueryOperandAccess().getQueryQueryCrossReference_0()); 
            // InternalRuleDetectionDsl.g:2791:3: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2792:4: RULE_ID
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
    // InternalRuleDetectionDsl.g:2803:1: rule__ComplexOperand__OperatorAssignment_0 : ( RULE_OPERATOR ) ;
    public final void rule__ComplexOperand__OperatorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2807:1: ( ( RULE_OPERATOR ) )
            // InternalRuleDetectionDsl.g:2808:2: ( RULE_OPERATOR )
            {
            // InternalRuleDetectionDsl.g:2808:2: ( RULE_OPERATOR )
            // InternalRuleDetectionDsl.g:2809:3: RULE_OPERATOR
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
    // InternalRuleDetectionDsl.g:2818:1: rule__ComplexOperand__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__ComplexOperand__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2822:1: ( ( ruleExpression ) )
            // InternalRuleDetectionDsl.g:2823:2: ( ruleExpression )
            {
            // InternalRuleDetectionDsl.g:2823:2: ( ruleExpression )
            // InternalRuleDetectionDsl.g:2824:3: ruleExpression
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
    // InternalRuleDetectionDsl.g:2833:1: rule__Message__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Message__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2837:1: ( ( RULE_ID ) )
            // InternalRuleDetectionDsl.g:2838:2: ( RULE_ID )
            {
            // InternalRuleDetectionDsl.g:2838:2: ( RULE_ID )
            // InternalRuleDetectionDsl.g:2839:3: RULE_ID
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


    // $ANTLR start "rule__Message__MessageAssignment_3"
    // InternalRuleDetectionDsl.g:2848:1: rule__Message__MessageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Message__MessageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2852:1: ( ( RULE_STRING ) )
            // InternalRuleDetectionDsl.g:2853:2: ( RULE_STRING )
            {
            // InternalRuleDetectionDsl.g:2853:2: ( RULE_STRING )
            // InternalRuleDetectionDsl.g:2854:3: RULE_STRING
            {
             before(grammarAccess.getMessageAccess().getMessageSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMessageAccess().getMessageSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__MessageAssignment_3"


    // $ANTLR start "rule__Message__RecipientAssignment_5"
    // InternalRuleDetectionDsl.g:2863:1: rule__Message__RecipientAssignment_5 : ( ruleRecipient ) ;
    public final void rule__Message__RecipientAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRuleDetectionDsl.g:2867:1: ( ( ruleRecipient ) )
            // InternalRuleDetectionDsl.g:2868:2: ( ruleRecipient )
            {
            // InternalRuleDetectionDsl.g:2868:2: ( ruleRecipient )
            // InternalRuleDetectionDsl.g:2869:3: ruleRecipient
            {
             before(grammarAccess.getMessageAccess().getRecipientRecipientParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRecipient();

            state._fsp--;

             after(grammarAccess.getMessageAccess().getRecipientRecipientParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Message__RecipientAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000800L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000410L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});

}